package spin_words;

public class SpinWords {
    public static void main(String[] args) {
        System.out.println(new SpinWords().spinWords("Welcome"));
        System.out.println(new SpinWords().spinWords("Hey fellow warriors"));

    }

    public String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder spinWords = new StringBuilder();
        for (String s : words) {
            if (s.length() < 5) {
                spinWords.append(s);
                spinWords.append(" ");
            } else {
                stringBuilder.append(s);
                spinWords.append(stringBuilder.reverse().toString());
                spinWords.append(" ");
                stringBuilder = new StringBuilder();
            }
        }

        return spinWords.toString().trim();
    }
}
