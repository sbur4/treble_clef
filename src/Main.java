import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "\uD834\uDD1E";
        System.out.println(s);

        String str = Arrays.toString(s.getBytes());
        System.setProperty("console.encoding", "UTF-8");
        System.out.println(str);
    }
}