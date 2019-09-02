package isogram;

public class Isogram {

    public static boolean isIsogram(String str) {
        if (str.length() <= 1) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            char first = Character.toLowerCase(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (Character.toLowerCase(str.charAt(j)) == first) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsogram("Dermatoglyphics"));
        System.out.println(isIsogram("isIsogram"));
        System.out.println(isIsogram("Isogram"));
        System.out.println(isIsogram("thumbscrewjapingly"));
        System.out.println(isIsogram("moOse"));

    }

}
