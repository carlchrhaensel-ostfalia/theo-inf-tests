package de.vfh.theoinf.automat;

public class Automat1 {
    static int nextState(int state, char input) {
        switch (state) {
            case 0:
                return switch (input) {
                    case 'a' -> 1;
                    case 'b' -> 0;
                    case 'c' -> 0;
                    default -> 4;
                };
            case 1:
                return switch (input) {
                    case 'a' -> 1;
                    case 'b' -> 2;
                    case 'c' -> 0;
                    default -> 4;
                };
            case 2:
                return switch (input) {
                    case 'a' -> 1;
                    case 'b' -> 0;
                    case 'c' -> 3;
                    default -> 4;
                };
            case 3:
                return switch (input) {
                    case 'a' -> 3;
                    case 'b' -> 3;
                    case 'c' -> 3;
                    default -> 4;
                };
            default:
                return 4;
        }
    }
    static boolean accept (String word) {
        int state = 0;
        for (int i = 0; i < word.length(); i++) {
            char input = word.charAt(i);
            state = nextState(state, input);
            if (state == 4) {
                return false;
            }
        }
        return state == 3;
    }
}

