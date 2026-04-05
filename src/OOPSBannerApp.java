import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Inner class
    static class CharacterPatternMap {

        private Map<Character, String[]> patternMap;

        public CharacterPatternMap() {
            patternMap = new HashMap<>();

            // O
            patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
            });

            // P
            patternMap.put('P', new String[]{
                "***** ",
                "*    *",
                "***** ",
                "*     ",
                "*     "
            });

            // S
            patternMap.put('S', new String[]{
                " *****",
                "*     ",
                " *****",
                "     *",
                "***** "
            });
        }

        public String[] getPattern(char ch) {
            return patternMap.get(ch);
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap map = new CharacterPatternMap();

        String text = "OOPS";

        for (int i = 0; i < 5; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : text.toCharArray()) {
                line.append(map.getPattern(ch)[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}