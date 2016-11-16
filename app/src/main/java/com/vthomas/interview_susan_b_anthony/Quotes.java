package com.vthomas.interview_susan_b_anthony;

import java.util.Random;

/**
 * Created by sfabini on 11/13/16.
 */



public class Quotes {
    Random rng;

    /**
     * Constructor
     */
    public Quotes() {
        rng = new Random();
    }

    /*
        Section of various quotes, ordered by topic
     */
    private String getQuoteOnSuffrage() {
        final int numQuotes = 4;
        String [] quotes = new String [numQuotes];
        quotes[0] = "Men, their rights, and nothing more; women, their rights, and nothing less.";
        quotes[1] = "I declare to you that woman must not depend upon the protection of man, but must be taught to protect herself, and there I take my stand.";
        quotes[2] = "There never will be complete equality until women themselves help to make laws and elect lawmakers.";
        quotes[3] = "No man is good enough to govern any woman without her consent";
        return quotes[rng.nextInt(numQuotes)];
    }
    private String getQuoteOnSlavery() {
        return "Quote on Slavery";
    }
    private String getQuoteOnEqualPay() {
        final int numQuotes = 2;
        String [] quotes = new String [numQuotes];
        quotes[0] = "Men, their rights, and nothing more; women, their rights, and nothing less.";
        quotes[1] = "I do not demand equal pay for any women save those who do equal work in value. Scorn to be coddled by your employers; make them understand that you are in their service as workers, not as women.";
        return quotes[rng.nextInt(numQuotes)];
    }
    private String getQuoteOnBicycle() {
        return "Bicycling has done more to emancipate women than any one thing in the world. ";
    }
    private String getQuoteOnReligion() {
        final int numQuotes = 2;
        String [] quotes = new String [numQuotes];
        quotes[0] = "I always distrust people who know so much about what God wants them to do to their fellows.";
        quotes[1] = "I distrust those people who know so well what God wants them to do, because I notice it always coincides with their own desires.";
        return quotes[rng.nextInt(numQuotes)];
    }
    private String getQuoteOnMarriage() {
        final int numQuotes = 2;
        String [] quotes = new String [numQuotes];
        quotes[0] = "I never found the man who was necessary to my happiness. I was very well as I was.";
        quotes[1] = "It always happened that the men I wanted were those I could not get, and those who wanted me I wouldn't have.";
        return quotes[rng.nextInt(numQuotes)];
    }
    private String getQuoteOnNewspaper() {
        return "All the stock in trade I possess is a $10,000 debt, incurred by publishing my paper -- The Revolution -- four years ago, the sole object of which was to educate all women to do precisely as I have done";
    }
    private String getQuoteOnArrest() {
        return "I was arrested for voting in the presedential election of Eighteen Seventy Two";
    }
    private String getQuoteOnTemperance() {
        return "I started out in the temperance movement.  But when our petition was denied because all of the women petitioners were rejected, I turned my focus on a woman's right to vote.";
    }
    private String getQuoteOnBirth() {
        return "I was born in the town of Adams Massachusettes on February 15 1820.";
    }
    private String getQuoteOnDeath() {
        final int numQuotes = 2;
        String [] quotes = new String [numQuotes];
        quotes[0] = "I died at the age of 86 in Rochester New York in 1906, fourteen years before the ratification of the 19th amendment.";
        quotes[1] = "Oh, if I could but live another century and see the fruition of all the work for women! There is so much yet to be done. ";
        return quotes[rng.nextInt(numQuotes)];
    }
    private String getQuoteOnMiddleName() {
        return "My middle name is Brownell";
    }
    private String getQuoteOnDollar() {
        return "Why did they have to make it the same size as a quarter?";
    }
    private String getQuoteOnContemporaries() {
        return "Some of my favorite contemporaries included abolitionists like William Lloyd Garrison";
    }

    private String getQuoteOnFifteenth() {
        return "The Fifteenth Amendment abolished slavery.  It was ratified in Eighteen Seventy";
    }

    private String getQuoteOnNineteenth() {
        return "The Nineteenth Amendment legalized women's right to vote.  It was ratified in Nineteen Twenty. That's 100 years after my birth, and 14 years after my death.";
    }

    public String getQuoteOnTopics() {
        final int numQuotes = 14;
        String [] quotes = new String [numQuotes];
        quotes[0] = "women's suffrage";
        quotes[1] = "slavery";
        quotes[2] = "equal pay for equal work";
        quotes[3] = "bicycle";
        quotes[4] = "religion";
        quotes[5] = "marriage";
        quotes[6] = "newspaper";
        quotes[7] = "arrest";
        quotes[8] = "temperance";
        quotes[9] = "my birth";
        quotes[10] = "my death";
        quotes[11] = "my middle name";
        quotes[12] = "the dollar coin";
        quotes[13] = "my contemporaries";
        return "I can discuss topics ranging from " + quotes[rng.nextInt(numQuotes)]
                + ", to " + quotes[rng.nextInt(numQuotes)] + ", to " + quotes[rng.nextInt(numQuotes)] ;
    }

    /**
     * Select which type of quote to return based on the input topic
     * @param topic The topic string
     * @return The quote corresponding to the input topic
     */
    public String getQuoteOn(String topic) {
        String quote = "";
        switch(topic) {
            case "suffrage":
                quote = getQuoteOnSuffrage();
                break;
            case "slavery":
                quote = getQuoteOnSlavery();
                break;
            case "equal_pay":
                quote = getQuoteOnEqualPay();
                break;
            case "bicycle":
                quote = getQuoteOnBicycle();
                break;
            case "religion":
                quote = getQuoteOnReligion();
                break;
            case "marriage":
                quote = getQuoteOnMarriage();
                break;
            case "newspaper":
                quote = getQuoteOnNewspaper();
                break;
            case "arrest":
                quote = getQuoteOnArrest();
                break;
            case "temperance":
                quote = getQuoteOnTemperance();
                break;
            case "birth":
                quote = getQuoteOnBirth();
                break;
            case "death":
                quote = getQuoteOnDeath();
                break;
            case "middle_name":
                quote = getQuoteOnMiddleName();
                break;
            case "dollar":
                quote = getQuoteOnDollar();
                break;
            case "contemporaries":
                quote = getQuoteOnContemporaries();
                break;
            case "fifteenth":
                quote = getQuoteOnFifteenth();
                break;
            case "nineteenth":
                quote = getQuoteOnNineteenth();
                break;
            case "empty":
                quote = getQuoteOnTopics();
                break;
            default:
                quote = getQuoteOnTopics();
                break;

        }
        return quote;
    }



}
