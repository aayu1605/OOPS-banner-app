public class UC7 {

    /**
     * Inner static class to store character-to-pattern mapping
     */
    static class CharacterPattern {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and its pattern
         *
         * @param character the character represented
         * @param pattern   the ASCII banner pattern
         */
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Creates predefined character patterns
     *
     * @return array of CharacterPattern objects
     */
    public static CharacterPattern[] createCharacterPatterns() {

        return new CharacterPattern[] {

            new CharacterPattern('O', new String[] {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
            }),

            new CharacterPattern('P', new String[] {
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*",
                "*",
                "*"
            }),

            new CharacterPattern('S', new String[] {
                " ***** ",
                "*",
                "*",
                " ***** ",
                "            *",
                "            *",
                "      ***** "
            })
        };
    }

    /**
     * Retrieves pattern for a given character
     */
    public static String[] getCharacterPattern(
            char ch, CharacterPattern[] patterns) {

        for (CharacterPattern cp : patterns) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }
        return new String[7]; // fallback (empty pattern)
    }

    /**
     * Prints message as banner
     */
    public static void printMessage(
            String message, CharacterPattern[] patterns) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, patterns);
                line.append(pattern[row]).append("   ");
            }

            System.out.println(line.toString());
        }
    }

    /**
     * Main method
     */
    public static void main(String[] args) {

        CharacterPattern[] patterns = createCharacterPatterns();
        String message = "OOPS";

        printMessage(message, patterns);
    }
}