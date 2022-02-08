import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/*
    I created this program and have been continuously "streamlining" it, so it can be ran in
    as few lines possible. When I learn new programming knowledge, I will continue to
    upgrade it to the best of my ability. This is nothing serious, just a test of what I can accomplish
    on my own. In the future, I hope I can look back at this and laugh about where I started.
    Anyways, I'm finished having my introspective character arc in these comments :P
 */

public class Magic8Ball {

    public static void main(String[] args){

        System.out.println("Welcome to Dr. H Wordl's");
        System.out.println(" ✧･ﾟ: *✧･ﾟ:*INCREDIBLY SPECTACULAR MAGIC 8-BALL!*:･ﾟ✧*:･ﾟ✧");
        System.out.println("PREPARE TO BE AMAZED BY YOUR FORTUNES! (ʀᴇsᴜʟᴛs ᴍᴀʏ ᴠᴀʀʏ)");

        System.out.print("What is your question? ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        // Random Answer Generator
        double num = Math.random() * 100;
        num = Math.round(num);

        String affirmativeAnswers[] = {"It is certain","It is decidedly so.","Without a doubt.","Yes definitely.","You may rely on it.", "As I see it, yes.", "Most likely.", "Outlook good.", "Yes.", "Signs point to yes."};
        String nonCommittalAnswers[] = {"Reply hazy, try again.","Ask again later.","Better not to tell you now.","Cannot predict now.","Concentrate and ask again."};
        String negativeAnswers[] = {"Don't count on it.", "My reply is no.", "My sources say no.", "Outlook not so good.", "Very doubtful."};

        if(num <= 50){
            double indexNum = Math.floor(Math.random() * affirmativeAnswers.length);
            System.out.println("‧͙⁺˚*･༓☾ " + affirmativeAnswers[(int) indexNum] + " ☽༓･*˚⁺‧͙");
        }
        else if(num > 50 && num <= 75){
            double indexNum = Math.floor(Math.random() * nonCommittalAnswers.length);
            System.out.println("‧͙⁺˚*･༓☾ " + nonCommittalAnswers[(int) indexNum] + " ☽༓･*˚⁺‧͙");
        }
        else if(num > 75){
            double indexNum = Math.floor(Math.random() * negativeAnswers.length);
            System.out.println("͙⁺˚*･༓☾ " + negativeAnswers[(int) indexNum] + " ☽༓･*˚⁺‧͙");
        }
    }
}
