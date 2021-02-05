import java.util.List;

public class Main {


    public static void main(String[] args) {

        String shortestString = null;
        // write your code here
        List<String> movielist = List.of("Old Boy", "Shining", "Alien");
        for (String tmp : movielist) {
            if (shortestString == null) {
                shortestString = tmp;
                continue;
            }
            shortestString = shortestString.length() > tmp.length() ? tmp : shortestString;

        }
        System.out.println(shortestString);
        System.out.println(shortestString);
        System.out.println(shortestString);
    }
}

