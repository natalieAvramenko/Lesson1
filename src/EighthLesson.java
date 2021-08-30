import java.util.Locale;
import java.util.Scanner;

public class EighthLesson {
    static int minimum;
    static int maximum;
    static  int quest;
    static String[] words = {"apple", "orange", "lemon", "banana", "apricot",
            "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
            "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
            "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void main(String[] args) {
        new MyWindow();
        guessTheWord(words);
    }
    public static void guessTheWord(String[] words) {
        String questWord;
        String guessWord;
        StringBuffer visualWord = new StringBuffer("###############");
        questWord = init(words);
        Scanner scanner = new Scanner(System.in);
        int minLength;
        do {
            System.out.printf("Введите слово \n", questWord);
            guessWord = scanner.next().toLowerCase(Locale.ROOT);
            scanner.nextLine();
            minLength = (questWord.length() > guessWord.length()) ? guessWord.length() : questWord.length();
            if (!questWord.equals(guessWord)) {
                for (int i = 0; i < minLength; i++) {
                    if (questWord.charAt(i) == guessWord.charAt(i))
                        visualWord.setCharAt(i, questWord.charAt(i));
                    else {
                        visualWord.setCharAt(i, '#');
                    }
                }
                for (int i = minLength; i < visualWord.length(); i++) {
                    visualWord.setCharAt(i, '#');
                }
                System.out.println("Результат угадывания: " + visualWord.toString());
            } else break;
        } while (true);
        System.out.println("Успех! Вы угадали слово.");
    }
    public static String init(String... words) {
        minimum = 0;
        maximum = words.length;
        quest = minimum + (int) (Math.random() * maximum - minimum);
        return words[quest];
    }
}
