import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Function to create pattern map
    public static Map<Character, String[]> createPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        map.put('P', new String[]{
            "***** ",
            "*    *",
            "***** ",
            "*     ",
            "*     "
        });

        map.put('S', new String[]{
            " *****",
            "*     ",
            " *****",
            "     *",
            "***** "
        });

        return map;
    }

    // Function to render banner
    public static void printBanner(String text, Map<Character, String[]> map) {

        for (int i = 0; i < 5; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : text.toCharArray()) {
                line.append(map.get(ch)[i]).append("  ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = createPatternMap();

        printBanner("OOPS", patternMap);
    }
}