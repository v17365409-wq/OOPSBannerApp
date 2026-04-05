
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Directly create array using String.join()
        String[] banner = {
            String.join(" ", "*****", "*****", "*****", "*****"),
            String.join(" ", "*   *", "*   *", "*   *", "*"),
            String.join(" ", "*   *", "*   *", "*****", "*****"),
            String.join(" ", "*   *", "*   *", "*", "*"),
            String.join(" ", "*****", "*****", "*", "*****")
        };

        // Enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}