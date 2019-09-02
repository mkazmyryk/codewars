package troll;

public class Troll {
    public static String disemvowel(String str) {
        char[] vowels = "iaeou".toCharArray();
        for (char c : vowels) {
            str = str.replaceAll(Character.toString(c), "");
            str = str.replaceAll(Character.toString(Character.toUpperCase(c)), "");
        }

        return str;
    }

    public static void main(String[] args) {
        System.out.println(disemvowel("What are you, a communist?"));
    }
}
