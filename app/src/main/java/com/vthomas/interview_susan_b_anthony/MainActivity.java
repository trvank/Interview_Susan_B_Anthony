package com.vthomas.interview_susan_b_anthony;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;

import ai.api.AIConfiguration;
import ai.api.AIDataService;
import ai.api.AIListener;
import ai.api.AIService;
import ai.api.AIServiceException;
import ai.api.model.AIError;
import ai.api.model.AIRequest;
import ai.api.model.AIResponse;
import ai.api.model.Result;
import com.google.gson.JsonElement;

import android.speech.tts.TextToSpeech;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;
import java.util.Map;

public class MainActivity extends Activity implements AIListener, TextToSpeech.OnInitListener{
    private String CLIENT_ACCESS_TOKEN = "e957b68ccce3495795f46e794d546a57";//TODO add the access token from api.ai in here
    private AIService aiService;
    private AIRequest text_req = new AIRequest();//for text request
    private AIDataService aiDataService;//for text request

    String[] perms = {"android.permission.RECORD_AUDIO"};
    int permsRequestCode = 200;

    private TextToSpeech tts = null;
    private int MY_DATA_CHECK_CODE = 0;

    private TextView result_text;
    private ScrollView scroller;
    private TextView user_text;
    private Button send_button;
    private Button help_button;
    private Button speak_button;

    private QueryResult q = new QueryResult();
    private Analyzer analyzer = new Analyzer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set up configuration of speech recognition
        final AIConfiguration config = new AIConfiguration(CLIENT_ACCESS_TOKEN,
                AIConfiguration.SupportedLanguages.English,
                AIConfiguration.RecognitionEngine.System);
        //initialize sppech recognition service and add to listener to handle events
        aiService = AIService.getService(this, config);
        aiService.setListener(this);
        //initiate text request data service for api.ai
        aiDataService = new AIDataService(this, config);//for text request

        result_text = (TextView)findViewById(R.id.result_text);
        scroller = (ScrollView)findViewById(R.id.scroller);
//        result_text.setMovementMethod(new ScrollingMovementMethod());
        user_text = (TextView)findViewById(R.id.user_text);
        send_button = (Button)findViewById(R.id.send_button);
        help_button = (Button)findViewById(R.id.help_button);
        speak_button = (Button)findViewById(R.id.speak_button);

        tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                tts.setLanguage(Locale.US);
            }
        });

        /*
//  This is required running on Thomas's, but not on Scott's
        //request permission for recording audio if not yet granted
        if(!hasPermission(perms[0])){
            requestPermissions(perms, permsRequestCode);
        }
        */

    }

    public void send(View view) {
        Log.d("test0", "");
        text_req.setQuery(user_text.getText().toString());

        new AsyncTask<AIRequest, Void, AIResponse>() {
            @Override
            protected AIResponse doInBackground(AIRequest... requests) {
                final AIRequest request = requests[0];
                try {
                    Log.d("test1","");
                    final AIResponse response = aiDataService.request(text_req);
                    return response;
                } catch (AIServiceException e) {
                }
                return null;
            }

            @Override
            protected void onPostExecute(AIResponse aiResponse) {
                if (aiResponse != null) {
                    // process aiResponse here
                    Result result = aiResponse.getResult();
//        Map<String, JsonElement> map = new HashMap<String, JsonElement>();

                    //Get parameters
                    String parameterString = "";
                    if (result.getParameters() != null && !result.getParameters().isEmpty()){
                        for(final Map.Entry<String, JsonElement> entry : result.getParameters().entrySet()){
                            parameterString += "(" + entry.getKey() + ", " + entry.getValue() + ")";
                        }
                    }

                    if(true){
                        q = analyzer.getResult(result.getParameters(), result.getAction());
                        if(q.get_speech_string().equals("")){
                            q.set_speech_string("No results meet your criteria");
                        }
                    }
                    else{
                        q.set_text_string("I may have misunderstood the query.");
                        q.set_speech_string("I may have misunderstood the query. " +
                                "Do you have a question about todays flights that I can help you with?");
                    }

                    //Show results in TextView
                    result_text.setText(result_text.getText() + "You: " + result.getResolvedQuery() + "\n\n");//add the user's question
                    result_text.setText(result_text.getText() + "Action: " + result.getAction() +
                            "\n\nParameters: " + parameterString +
                            "\n\nResponse: " + q.get_text_string() + "\n\n");
                    scroller.fullScroll(ScrollView.FOCUS_DOWN);

                    // And speak it
//                    speakWords(q.get_speech_string());

                }
            }
        }.execute(text_req);

        user_text.setText("");
    }

    //action for help button will offer suggestions on topics the user might
    //ask Susan about
    public void help(View view) {
    }

    //action for the speak button will record the user's quesion and send to ai.api
    public void speak(View view) {
        aiService.startListening();
    }

    //Speaks the words to user
    private void speakWords(String speech) {
        tts.speak(speech, TextToSpeech.QUEUE_ADD, null, null);
    }

    //API.AI stuff here
    @Override
    public void onResult(AIResponse response) {
        Result result = response.getResult();
//        Map<String, JsonElement> map = new HashMap<String, JsonElement>();

        //Get parameters (example code from api.ai - we can change if needed)
        String parameterString = "";
        if (result.getParameters() != null && !result.getParameters().isEmpty()){
            for(final Map.Entry<String, JsonElement> entry : result.getParameters().entrySet()){
                parameterString += "(" + entry.getKey() + ", " + entry.getValue() + ")";
            }
        }

       //TODO from the result, determine what is added to the conversation TextView and what is spoken

        q = analyzer.getResult(result.getParameters(), "");

        //Show results in TextView
        result_text.setText(result_text.getText() + "You: " + result.getResolvedQuery() + "\n\n");//add the user's question
        result_text.setText(result_text.getText() + "Action: " + result.getAction() +
                "\n\nParameters: " + parameterString +
                "\n\nResponse: " + q.get_text_string() + "\n\n");
        scroller.fullScroll(ScrollView.FOCUS_DOWN);

        // And speak it
//        speakWords(q.get_speech_string());
    }

    //does the device need record permission???
    private boolean needsPermission(){
        return(Build.VERSION.SDK_INT>Build.VERSION_CODES.LOLLIPOP_MR1);
    }

    private boolean hasPermission(String permission){
        if(needsPermission()){
            return(checkSelfPermission(permission)== PackageManager.PERMISSION_GRANTED);
        }
        return true;
    }

    @Override
    public void onError(AIError error) {
        result_text.setText(error.toString());
    }

    @Override
    public void onAudioLevel(float level) {

    }

    @Override
    public void onListeningStarted() {

    }

    @Override
    public void onListeningCanceled() {

    }

    @Override
    public void onListeningFinished() {

    }


    //TextToSpeech Stuff
    @Override
    public void onInit(int initStatus) {
        if (initStatus == TextToSpeech.SUCCESS) {
            tts.setLanguage(Locale.US);
        }
        else if (initStatus == TextToSpeech.ERROR) {
            Toast.makeText(this, "Sorry! Text To Speech failed...", Toast.LENGTH_LONG).show();
        }
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == MY_DATA_CHECK_CODE) {
            if (resultCode == TextToSpeech.Engine.CHECK_VOICE_DATA_PASS) {
                //create the TTS
                tts = new TextToSpeech(this, this);
            }
            else {
                //no data - install it now
                Intent installTTSIntent = new Intent();
                installTTSIntent.setAction(TextToSpeech.Engine.ACTION_INSTALL_TTS_DATA);
                startActivity(installTTSIntent);
            }
        }
    }
}
