package com.vthomas.interview_susan_b_anthony;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.widget.Toast;

import java.util.Locale;

/**
 * Created by Thomas on 11/12/2016.
 */
public class Splash extends Activity implements TextToSpeech.OnInitListener {
    private TextToSpeech tts = null;
    String text = "Welcome!  Now is your chance to interview Susan B Anthony";
    private int MY_DATA_CHECK_CODE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        // Check for TTS
        Intent checkIntent = new Intent();
        checkIntent.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
        startActivityForResult(checkIntent, MY_DATA_CHECK_CODE);

        tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                tts.setLanguage(Locale.US);
            }
        });

        timer.start();
    }

    //create a timer to move on after a few seconds
    Thread timer = new Thread() {
        public void run() {
            try {
                sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                Intent newScreen = new Intent(Splash.this, MainActivity.class);
                startActivity(newScreen);
            }
        }
    };

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

    @Override
    public void onInit(int initStatus) {
        if (initStatus == TextToSpeech.SUCCESS) {
            tts.setLanguage(Locale.US);
            tts.speak(text, TextToSpeech.QUEUE_ADD, null);//removed last null peram
        }
        else if (initStatus == TextToSpeech.ERROR) {
            Toast.makeText(this, "Sorry! Text To Speech failed...", Toast.LENGTH_LONG).show();
        }
    }

    private void speakWords(String speech) {
        tts.speak(speech, TextToSpeech.QUEUE_ADD, null);//removed last null peram
    }

    protected void onDestroy() {
        super.onDestroy();
        tts.shutdown();
    }
}
