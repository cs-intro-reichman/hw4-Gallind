public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    /*
     * 65 - 90 A-Z
     * 97 - 122 a-z
     */
    public static String lowerCase(String str) {
        // Replace the following statement with your code
        String str2 = "";
        int ch;
        for (int i = 0; i < str.length(); i++){
            ch = (int)str.charAt(i);
            if (ch >= 65 && ch <= 90){
                ch += 32;
                str2 += (char)ch;
            }
            else {
                str2 += str.charAt(i);
            }
        }
        return str2;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        if (str2.length() == 0) {
            return true;
        }
        if (str1.length() < str2.length()) {
            return false;
        }
        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            boolean found = true;
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return true;
            }
        }
        return false;
    }
}
