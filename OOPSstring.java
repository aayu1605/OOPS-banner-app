public class OOPSstring {
    public static void main(String[] args) {
        // UC3: Using String.join for better memory usage
        
        System.out.println(String.join("", " *** ", "  ", " *** ", "  ", "**** ", "  ", " ****"));
        System.out.println(String.join("", "*   *", "  ", "*   *", "  ", "*   *", "  ", "* "));
        System.out.println(String.join("", "*   *", "  ", "*   *", "  ", "*   *", "  ", "* "));
        System.out.println(String.join("", "*   *", "  ", "*   *", "  ", "**** ", "  ", " *** "));
        System.out.println(String.join("", "*   *", "  ", "*   *", "  ", "* ", "  ", "       *"));
        System.out.println(String.join("", "*   *", "  ", "*   *", "  ", "* ", "  ", "       *"));
        System.out.println(String.join("", " *** ", "  ", " *** ", "  ", "* ", "  ", "   **** "));
    }
} 
