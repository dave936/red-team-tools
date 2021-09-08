import java.io.*;

public class Test {
    public static void main(String[] args) {
        Caesar caesar = new Caesar();
        String original = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String newString = caesar.rotate(original, 13);
        System.out.println(newString);
    }
}
