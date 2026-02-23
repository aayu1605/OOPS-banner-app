public class UC4 {
    public static void main(String[] args) {
        // 1. Ek String array banao jiski size 7 ho (kyunki banner ki 7 lines hain)
        String[] lines = new String[7];

        // 2. Array ke har index (0 se 6) mein banner ki ek line store karo
        lines[0] = String.join("", "   *** ", "  ", "     *** ", "  ", "  **** ", "  ", "  ****");
        lines[1] = String.join("", " **   **", "  ", "  **   **", "  ", " **  **", "  ", "** ");
        lines[2] = String.join("", "**     **", "  ", "**     **", "  ", "**   **", "  ", "** ");
        lines[3] = String.join("", "**     **", "  ", "**     **", "  ", "** ** ", "  ", "   *** ");
        lines[4] = String.join("", "**     **", "  ", "**     **", "  ", "** ", "  ", "         **");
        lines[5] = String.join("", " **   **", "  ", "  **   **", "  ", " ** ", "  ", "        **");
        lines[6] = String.join("", "   *** ", "  ", "     *** ", "  ", "  ** ", "  ", "     **** ");

        // 3. For-each loop lagao array print karne ke liye
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
