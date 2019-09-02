package missing_letter;

public class MissingLetter {
    public static char findMissingLetter(char[] array) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char c = array[0];
        boolean isUpperCase = Character.isUpperCase(c);
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == Character.toLowerCase(c)) {
                for (int j = 0; j < array.length; j++) {
                    if (Character.toLowerCase(array[j]) != alphabet[i]) {
                        if (isUpperCase) {
                            return Character.toUpperCase(alphabet[i]);
                        }
                        return alphabet[i];
                    }
                    i++;
                }
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(findMissingLetter(new char[]{'O', 'Q', 'R', 'S'}));
    }
}
