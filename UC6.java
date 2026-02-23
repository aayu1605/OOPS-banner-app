public class UC6 {

    // Method to generate the pattern for letter 'O'
    public static String[] getOPattern() {
        return new String[] {
            String.join(" ", " ***** "),
            String.join(" ", "*     *"),
            String.join(" ", "*     *"),
            String.join(" ", "*     *"),
            String.join(" ", "*     *"),
            String.join(" ", "*     *"),
            String.join(" ", " ***** ")
        };
    }

    // Method to generate the pattern for letter 'P'
    public static String[] getPPattern() {
        return new String[] {
            String.join(" ", " ***** "),
            String.join(" ", "*     *"),
            String.join(" ", "*     *"),
            String.join(" ", " ***** "),
            String.join(" ", "*"),
            String.join(" ", "*"),
            String.join(" ", "*")
        };
    }

    // Method to generate the pattern for letter 'S'
    public static String[] getSPattern() {
        return new String[] {
            String.join(" ", " ***** "),
            String.join(" ", "*"),
            String.join(" ", "*"),
            String.join(" ", " ***** "),
            String.join(" ", "            *"),
            String.join(" ", "            *"),
            String.join(" ", "      ***** ")
        };
    }

    // Main method to assemble and display the OOPS banner
    public static void main(String[] args) {

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Assemble and print banner line by line
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                String.join("   ",
                    oPattern[i],
                    oPattern[i],
                    pPattern[i],
                    sPattern[i]
                )
            );
        }
    }
}