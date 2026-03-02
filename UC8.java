import java.util.HashMap;
public class UC8 {
    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();
        charMap.put('O', new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });
        charMap.put('P', new String[] {
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*",
            "*",
            "*"
        });
        charMap.put('S', new String[] {
            " ***** ",
            "*",
            "*",
            " ***** ",
            "            *",
            "            *",
            "      ***** "
        });
        return charMap;
    }
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        String[] bannerLines = new String[7];
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (char c : message.toCharArray()) {
                if (charMap.containsKey(c)) {
                    line.append(charMap.get(c)[i]);
                } else {
                    line.append("   ");
                }
            }
            bannerLines[i] = line.toString();
        }
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
    public static void main(String[] args){
        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charMap);
    }
}