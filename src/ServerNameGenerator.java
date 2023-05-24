import java.util.Random;

public class ServerNameGenerator {

    public static String[] adj = {"cruel", "dangerous", "helpful", "jumpy", "petty", "plain", "cheerful", "brave", "amused", "nervous"};
    public static String[] nouns = {"dog", "horse", "cow", "army", "snail", "doctor", "toothbrush", "mountain", "pest", "oatmeal"};

    public static void main(String[] args) {

        System.out.println("Here is your server name");
        System.out.println(getRandom(adj) + "-" + getRandom(nouns));

    }

    private static String getRandom(String[] words){
        Random rand = new Random();
        int randIndex = rand.nextInt(words.length) ;
        return words[randIndex];
    }
}
