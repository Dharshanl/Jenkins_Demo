
public class StringCodes {

    public static void main(String[] args) {
        String data = "HALLAH";
        String temp = "";

        for (int i = data.length() - 1; i >= 0; i--) {
            temp = temp + data.charAt(i);
        }

        if (data.equals(temp)) {
            System.out.println("The string is a palindrome: " + temp);
        } else {
            System.out.println("The string is not a palindrome: " + temp);
        }
        palindrom(data);
    }

    public static void palindrom(String data) {
        StringBuilder temp = new StringBuilder();
        for (int i = data.length() - 1; i >= 0; i--) {
            temp.append(data.charAt(i));
        }
        System.out.println("This is palindrome methode");
        if (data.equals(temp.toString())) {
            System.out.println("The string is a palindrome: " + temp);
        } else {
            System.out.println("The string is not a palindrome: " + temp);
        }
    }
}
