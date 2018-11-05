package apr;

public class AlphabetPositionReplacement {
    public static String replacer(String word) {
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char tempChar = word.toUpperCase().charAt(i);
            if (Character.isLetter(tempChar)) {
                switch (tempChar) {
                    case 'A':
                        build.append("1 ");
                        break;
                    case 'B':
                        build.append("2 ");
                        break;
                    case 'C':
                        build.append("3 ");
                        break;
                    case 'D':
                        build.append("4 ");
                        break;
                    case 'E':
                        build.append("5 ");
                        break;
                    case 'F':
                        build.append("6 ");
                        break;
                    case 'G':
                        build.append("7 ");
                        break;
                    case 'H':
                        build.append("8 ");
                        break;
                    case 'I':
                        build.append("9 ");
                        break;
                    case 'J':
                        build.append("10 ");
                        break;
                    case 'K':
                        build.append("11 ");
                        break;
                    case 'L':
                        build.append("12 ");
                        break;
                    case 'M':
                        build.append("13 ");
                        break;
                    case 'N':
                        build.append("14 ");
                        break;
                    case 'O':
                        build.append("15 ");
                        break;
                    case 'P':
                        build.append("16 ");
                        break;
                    case 'Q':
                        build.append("17 ");
                        break;
                    case 'R':
                        build.append("18 ");
                        break;
                    case 'S':
                        build.append("19 ");
                        break;
                    case 'T':
                        build.append("20 ");
                        break;
                    case 'U':
                        build.append("21 ");
                        break;
                    case 'V':
                        build.append("22 ");
                        break;
                    case 'W':
                        build.append("23 ");
                        break;
                    case 'X':
                        build.append("24 ");
                        break;
                    case 'Y':
                        build.append("25 ");
                        break;
                    case 'Z':
                        build.append("26 ");
                        break;
                }
            }

        }
        return build.toString();
    }
}
