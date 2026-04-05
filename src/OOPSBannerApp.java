
public class OOPSBannerApp {

    // Method for O
    public static String[] getO() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Method for P
    public static String[] getP() {
        return new String[]{
            "***** ",
            "*    *",
            "***** ",
            "*     ",
            "*     "
        };
    }

    // Method for S
    public static String[] getS() {
        return new String[]{
            " *****",
            "*     ",
            " *****",
            "     *",
            "***** "
        };
    }

    public static void main(String[] args) {

        String[] o = getO();
        String[] p = getP();
        String[] s = getS();

        // Print O O P S line by line
        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i] + "  " + o[i] + "  " + p[i] + "  " + s[i]);
        }
    }
}