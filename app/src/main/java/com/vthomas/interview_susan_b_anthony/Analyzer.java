package com.vthomas.interview_susan_b_anthony;

import com.google.gson.JsonElement;

import java.util.Map;

/**
 * Created by Thomas on 11/15/2016.
 */
public class Analyzer {


    /**
     *
     * @param map <String, JsonElement> Series of topics, parameters returned from API.ai query
     * @param action The action returned by API.ai query
     * @return A QueryResult object
     */
    public QueryResult getResult(Map<String, JsonElement> map, String action) {
        QueryResult q = new QueryResult();
        Quotes quotes = new Quotes();
        String quote;
        String topic = "";
        q.set_speech_string("Hello, I am Susan B. Anthony");
        q.set_text_string("Hello, I am Susan B. Anthony");

        if (action.compareTo("select_topic") == 0) {
            if(map.containsKey("topic")) {
                topic = map.get("topic").getAsString();
                topic.replace("\"", "");
                quote = quotes.getQuoteOn(topic);
                q.set_speech_string(quote);
                q.set_text_string(quote);
            }
            else{
                quote = quotes.getQuoteOn(topic);
                q.set_speech_string("I may have misunderstood " + quote);
                q.set_text_string("I may have misunderstood " + quote);
            }

        }
        else if (action.compareTo("define") == 0) {
            if(map.containsKey("definition")) {
                topic = map.get("definition").getAsString();
                topic.replace("\"", "");
                quote = quotes.getQuoteOn(topic);
                q.set_speech_string(quote);
                q.set_text_string(quote);
            }
            else{
                quote = quotes.getQuoteOn(topic);
                q.set_speech_string("I may have misunderstood " + quote);
                q.set_text_string("I may have misunderstood " + quote);
            }
        }


        else { // doesn't match any action
            topic = "empty";
            quote = quotes.getQuoteOn(topic);
            q.set_speech_string(quote);
            q.set_text_string(quote);
        }


        return q;
    }

}