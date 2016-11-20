package com.vthomas.interview_susan_b_anthony;

import java.util.Random;

/**
 * Created by sfabini on 11/13/16.
 */



public class Quotes {
    static Random rng;
    static private int quoteIndex = 0;

    private String quoteOnLucyStone;

    /**
     * Constructor
     */
    public Quotes() {
        rng = new Random();
    }

    /*
        Section of various quotes, ordered by topic
     */

    /* Thomas's half */
    private String getQuoteOnSuffrage() {//done
        final int numQuotes = 4;
        String [] quotes = new String [numQuotes];
        quotes[0] = "I helped found the National Woman Suffrage Association.  This, along with my weekly paper, The Revolution, gave a platform to lobby for women's rights " +
                "including women's right to vote, which was not legal until the ratification of the 19th amendment.  " +
                "As I say, There never will be complete equality until women themselves help to make laws and elect lawmakers. ";
        quotes[1] = "I traveled the country talking about women's suffrage, which some know as women's right to vote. " +
                "I would deliver somewhere between 75 and 100 lectures per year.  The lectures brought new people to the suffrage movement " +
                "and helped us develop our presence at the local, state and national levels.  I declare to you that woman must not depend upon the protection of man, but must be taught to protect herself, and there I take my stand. ";
        quotes[2] = "Women's right to vote is something I was very passionate about.  Let me tell you about the U.S. centennial ceremony in Philadelphia. " +
                "A group of women asked to present a Declaration of Women's rights and we were denied the opportunity.  So, at the ceremony we walked on stage and " +
                "handed the declaration to the man in charge, much to his surprise.  We then walked into the crowd and handed out copies to those who wanted one.  " +
                "After reading the declaration aloud to a large group in the crowd, we invited anyone who wanted to come to join us at our National Woman Suffrage " +
                "Association convention at a nearby church.";
        quotes[3] = "The legal right for women to vote took decades.  Can you believe I was even arrested for voting?  The work of the suffrage movement, however, began to show as " +
                "women won the right to vote in some states.  We saw victories in Wyoming in 1869 and then in Utah the following year.  Around this time,  " +
                "some states invited me to address the state legislature.  A national victory would become a reality with the adoption of the 19th amendment.";
        return quoteRandomizer(quotes);
    }
    private String getQuoteOnSlavery() {//done
        final int numQuotes = 3;
        String [] quotes = new String [numQuotes];
        quotes[0] = "When I was only 16, I was collecting petitions against slavery in an organized resistance to the prohibition of anti-slavery petitions. " +
                "About 15 years later, I helped organizing an anti-slavery convention in Rochester.";
        quotes[1] = "I'm quite proud of my involvement with the Underground Railroad." +
                "One of my diary entries from the early 1860's reads \"Fitted out a fugitive slave for Canada with the help of Harriet Tubman ";
        quotes[2] = "While advocating for women's suffrage and women's rights, I still fought for the rights of other groups.  I was the New York state agent " +
                "for the American Anti Slavery Society for which I organized anti slavery meeting throughout the state. " +
                " To those who asked what was to become of slaves after they were freed, I responded  " +
                "\"Let us open all our schools. Let us admit him into all our mechanic shops, stores, offices, and lucrative business avocations. let him rent such pew in the church, and occupy such seat in the theatre. Extend to him all the rights of Citizenship.\" ";
        return quoteRandomizer(quotes);
    }
    private String getQuoteOnEqualPay() {//done
        final int numQuotes = 2;
        String [] quotes = new String [numQuotes];
        quotes[0] = "In the late 1860's, I encouraged New York women in trades like printing and sewing to form the Workingwomen's Association " +
                "because they were excluded from men's trade unions.  I was able to get the committee on female labor of the National Labor Congress " +
                "to call for equal pay for equal work.  I do not demand equal pay for any women save those who do equal work in value. " +
                "Scorn to be coddled by your employers; make them understand that you are in their service as workers, not as women. ";
        quotes[1] = "I tried to establish trade schools for women in printing.  There was a time when printers in New York went on strike and I called for " +
                "employers to hire women in place of the men on strike.  My hope was to prove how these women printers were capable of doing as good a job as " +
                "men and deserve equal pay.";
        return quoteRandomizer(quotes);
    }
    private String getQuoteOnBicycle() {//done
        return "I love bicycles!  In fact, Let me tell you what I think of bicycling. I think it has done more to emancipate women than anything else in the world. It gives women a feeling of freedom and self-reliance. I stand and rejoice every time I see a woman ride by on a wheel; the picture of free, untrammeled womanhood.";
    }
    private String getQuoteOnReligion() {//done
        final int numQuotes = 4;
        String [] quotes = new String [numQuotes];
        quotes[0] = "I always distrust people who know so much about what God wants them to do to their fellows.";
        quotes[1] = "I distrust those people who know so well what God wants them to do, because I notice it always coincides with their own desires.";
        quotes[2] = "While I generally like to keep my religious views private, I will tell you that I grew up a Quaker.  " +
                "Though later in life I was more active with the Unitarians.";
        quotes[3] = "Some speculate that I'm atheist.  I guess that's because of my critiques on religious institutions. " +
                "Or perhaps because of my belief that \"every religion, or none, should have an equal right on the platform.\"";
        return quotes[rng.nextInt(numQuotes)];
    }
    private String getQuoteOnMarriage() {//done
        final int numQuotes = 4;
        String [] quotes = new String [numQuotes];
        quotes[0] = "As a young woman, I did have offers of marriage, though you would be hard pressed to find anyone with whom I ever had a serious romance. " +
                "I never found the man who was necessary to my happiness. I was very well as I was.";
        quotes[1] = "I very much despised the laws that gave husbands all of the power in a marriage.  " +
                "\"by marriage, the husband and wife are one person in law:  that is, the very being or legal existence of the woman is suspended during the marriage.\"";
        quotes[2] = "It always happened that the men I wanted were those I could not get, and those who wanted me I wouldn't have.";
        quotes[3] = "Given the rule of marriage in my time, my belief was that If women will not accept marriage with subjugation, nor men proffer it withough, there is, there can be, no alternative.  " +
                "The woman who will not be ruled must live without marriage.";
        return quoteRandomizer(quotes);
    }
    private String getQuoteOnNewspaper() {//done
        final int numQuotes = 2;
        String[] quotes = new String [numQuotes];
        quotes[0] = "Oh, the Revolution!  This was a paper that I started in New York City. " +
                "My focus for the paper was women's rights, especially suffrage for women, though we did cover other topics as well. " +
                "Our motto at the Revolution was \"Men, their rights and nothing more: women, their rights and nothing less.\"";
        quotes[1] = "After the Civil War, major newspapers associated with social reform movements became more conservative or quit publishing. " +
                "My goal for The Revolution was to sort of take the place of space left by those papers.  I like to think we succeeded and " +
                "really helped give voice to the suffrage movement. " +
                "I wanted the paper to grow into a daily paper with its own printing press, all owned and operated by women.";
        return quoteRandomizer(quotes);
    }
    private String getQuoteOnArrest() {//done
        final int numQuotes = 4;
        String[] quotes = new String [numQuotes];
        quotes[0] = "I, along with dozens of other women attempted to vote in the presidential election of 1872 in Rochester. " +
                "Fifteen of us were able to convince the election inspectors to allow us to cast ballots, though most did not succeed in getting their ballots. " +
                "My vote lead to my arrest and I was formally charged with illegally voting.";
        quotes[1] = "After my arrest for illegally voting, I took it upon myself to speak all over Monroe County, New York, where my trial was set. " +
                "People would hear me asking \"Is it a Crime for a U.S. Citizen to Vote?\" After all, the Fourteenth Amendment gives every citizen that right. " +
                "I would go on to say \"We no longer petition legislature or Congress to give us the right to vote, " +
                "but appeal to women everywhere to exercise their too long neglected 'citizen's right'\". " +
                "That speech was printed in one of the Rochester daily newspapers, which helped to spread my message to potential jurors";
        quotes[2] = "My trial for illegally voting as a woman was a big deal for the suffrage movement. " +
                "The New York Times caught the tone of the proceedings by reporting that, " +
                "quote \"It was conceded that the defendant was, on the 5th November, 1872, a woman";
        quotes[3] = "After my arrest and trial for casting my vote in a presidential election, I was sentenced to pay a 100 dollar fine. " +
                "I proclaimed that  \"I shall never pay a dollar of your unjust penalty\" and I never did pay the fine. " +
                "The justice decided not to put me in custody.  I believe his motive was to keep me from appealing the case to the Supreme Court, " +
                "which I was not able to do because I was not imprisoned.";
        return quoteRandomizer(quotes);
    }
    private String getQuoteOnTemperance() {//done
        final int numQuotes = 3;
        String[] quotes = new String [numQuotes];
        quotes[0] = "Temperance, or the abstinence from alcohol, is in fact a woman's rights issue. " +
                "Because husbands maintained all the power in a marriage, wives of drunken men were left with few legal options " +
                "even in the events of abuse and when all of the family's money went to alcohol.";
        quotes[1] = "I was a member of the Daughters of Temperance in my early years which gave me the opportunity to deliver public speeches about alcohol abstinence. " +
                "I went on to be elected as a delegate to the state temperance convention.  However, when I tried to deliver my speech, " +
                "would not allow me to speak because women delegates were to be seen and not heard.  We were there to learn.  " +
                "I, along with some of the other women attending, walked out and started the Women's State Temperance Society.  ";
        quotes[2] = "I attended the World's Temperance Convention in New York where I wanted to speak on behalf of The Women's State Temperance Society.  " +
                "While a three day battle over whether women should be allowed to speak ensued, I was denied my opportunity to talk at the convention.  " +
                "\"No advanced step taken by women has been so bitterly contested as that of speaking in public.  " +
                "For nothing which they have attempted, not even to secure suffrage, have they been so abused, condemned and antagonized.\"";
        return quoteRandomizer(quotes);
    }
    private String getQuoteOnBirth() {//done - not much to say on birth
        return "I was born in the town of Adams Massachusetts on February 15 1820.";
    }

    /* Scott's section */
    private String getQuoteOnDeath() {//done
        final int numQuotes = 3;
        String [] quotes = new String [numQuotes];
        quotes[0] = "I died at the age of Eighty Six in Rochester New York in Nineteen Oh Six, fourteen years before " +
                "the ratification of the Nineteenth amendment.";
        quotes[1] = "As I said two years prior to my passing in Nineteen Oh Six, quote: \"The world has never witnessed a " +
                "greater revolution than in the sphere of woman during this fifty years.\" " +
                "And that is the truth!";
        quotes[2] = "Although I passed away a mere fourteen years before the ratification of the " +
                "nineteenth amendment, I am proud of what I could accomplish over my lifetime.  " +
                "As I once said, quote, \"Now, after 40 years of agitation, the idea is beginning to prevail that women " +
                "were created for themselves, for their own happiness, and for the welfare of the world.\"";
        return quoteRandomizer(quotes);
    }
    private String getQuoteOnMiddleName() {//done
        final int numQuotes = 3;
        String [] quotes = new String [numQuotes];
        quotes[0] = "My middle name is Brownell. I suppose that Susan Anthony is a fairly common name." +
                "So that's why people refer to me as Susan B Anthony.";
        return quoteRandomizer(quotes);
    }

    private String getQuoteOnDollar() {//done
        final int numQuotes = 2;
        String [] quotes = new String [numQuotes];
        quotes[0] = "The Susan B Anthony dollar coin was first minted in Nineteen Seventy Nine. " +
                "Its production ended just two years later. It lacked popularity due to being the same size" +
                "as the washington quarter.";
        quotes[1] = "I appreciate the thought.  But why did they have to make it the same size and material as a quarter?";
        return quoteRandomizer(quotes);
    }
    private String getQuoteOnContemporaries() {//done
        final int numQuotes = 2;
        String [] quotes = new String [numQuotes];
        quotes[0] = "Some of my favorite contemporaries included abolitionists like William Lloyd Garrison";
        quotes[1] = "Lucy Stone was a close ally in the women's suffrage movement.";
        return quoteRandomizer(quotes);
    }

    private String getQuoteOnFifteenth() {//done
        final int numQuotes = 3;
        String [] quotes = new String [numQuotes];
        quotes[0] = "The fifteenth amendment abolished slavery.  The abolition movement gave us a " +
                "template for how to peacefully fight for the woman's right to vote.";
        quotes[1] = "The Fifteenth Amendment reads \"The right of citizens of the United States " +
                "to vote shall not be denied or abridged by the United States or by any State on " +
                "account of race, color, or previous condition of servitude.\"";
        quotes[2] = "I supported the Fifteenth amendment.  The abolition of slavery was " +
                "important.  But my fight was for the woman's right to vote.";
        return quoteRandomizer(quotes);
    }

    private String getQuoteOnNineteenth() {//done
        final int numQuotes = 3;
        String [] quotes = new String [numQuotes];
        quotes[0] = "The Nineteenth Amendment legalized women's right to vote.  It was ratified in " +
                "Nineteen Twenty. That's one hundred years after my birth.  Sadly, I was unable to " +
                "witness this historic event.  It was ratified fourteen years after my death.";
        quotes[1] = "The Nineteenth amendment is identical to the Fifteenth amendment, except the " +
                "Nineteenth prohibits the denial of suffrage because of \"sex\".  And the fifteenth because" +
                "of \"race, color, or previous condition of servitude\"";
        quotes[2] = "The Nineteenth amendment reads: \"The right of citizens of the United States " +
                "to vote shall not be denied or abridged by the United States or by any State on account of sex. \"";
        return quoteRandomizer(quotes);
    }
    private String getQuoteOnWhoYouAre() {//done
        return "I am Susan B Anthony.  I started out in the temperance movement.  When I realized " +
                "that women's voices in this movement were being ignored because the women couldn't " +
                "vote, I decided to change my focus to the women's suffrage movement.";
    }

    private String getQuoteOnLucyStone() {//done
        return "Lucy Stone was my partner in leading the women's suffrage movement.  It owes as " +
                "much to her as it does to me.";
    }

    private String getQuoteOnWilliamLloydGarrison() {//done
        return "William Garrison was an inspirational figure in my lifetime.  He led the " +
                "abolitionist movement that served as a model of the women's suffrage movement.";
    }

    /**
     * Randomizes which quote to display. In fact, this is sequentially saying each quote and
     * rolling-over to the beginning based on the mod of the array-length.
     * @param quoteArray The array of quote strings to randomize
     * @return A semi-random quote string
     */
    static private String quoteRandomizer(String [] quoteArray) {
        String quote = quoteArray[quoteIndex % quoteArray.length];
        quoteIndex++;
        return quote;
    }

    private String getQuoteOnTopics() {
        final int numQuotes = 15;
        String [] quotes = new String [numQuotes];
        quotes[0] = "women's suffrage";
        quotes[1] = "slavery";
        quotes[2] = "equal pay for equal work";
        quotes[3] = "bicycles";
        quotes[4] = "religion";
        quotes[5] = "marriage";
        quotes[6] = "my newspaper";
        quotes[7] = "my arrest";
        quotes[8] = "temperance";
        quotes[9] = "my birth";
        quotes[10] = "my death";
        quotes[11] = "my middle name";
        quotes[12] = "the dollar coin";
        quotes[13] = "my contemporaries";
        quotes[14] = "telling you about myself";
        return "I can discuss topics ranging from " + quotes[rng.nextInt(numQuotes)]
                + ", to " + quotes[rng.nextInt(numQuotes)] + ", to " + quotes[rng.nextInt(numQuotes)] ;
    }

    /**
     * Select which type of quote to return based on the input topic
     *
     * @param topic The topic string
     * @return The quote corresponding to the input topic
     */
    public String getQuoteOn(String topic) {
        String quote = "";
        switch (topic) {
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
            case "you":
                quote = getQuoteOnWhoYouAre();
                break;
            case "Lucy Stone":
                quote = getQuoteOnLucyStone();
                break;
            case "William Lloyd Garrison":
                quote = getQuoteOnWilliamLloydGarrison();
                break;
            default:
                quote = getQuoteOnTopics();
                break;

        }
        return quote;
    }
}
