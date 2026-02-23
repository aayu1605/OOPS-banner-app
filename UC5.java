public class UC5 {

    public static void main(String[] args) {

        // UC5: Inline array initialization using String.join()
        String[] lines = {
            String.join("   ", " ***** ", " ***** ", " ***** ", " ***** "),
            String.join("   ", "*     *", "*     *", "*     *", "*      "),
            String.join("   ", "*     *", "*     *", "*     *", "*      "),
            String.join("   ", "*     *", "*     *", " ***** ", " ***** "),
            String.join("   ", "*     *", "*     *", "*",       "           *"),
            String.join("   ", "*     *", "*     *", "*",       "           *"),
            String.join("   ", " ***** ", " ***** ", "*",       "      ***** ")
        };

        // Print the banner using enhanced for loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}