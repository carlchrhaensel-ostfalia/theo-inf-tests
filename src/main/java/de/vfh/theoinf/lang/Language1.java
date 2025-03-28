package de.vfh.theoinf.lang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Language1 {
    /**
     * accept words over {a,b,c} that have b after every a.
     * @param word Eingabewort
     * @return true, wenn es ein Wort Ã¼ber {a,b,c} ist
     * und hinter jedem a direkt ein b folgt.
     */
    public static boolean accept(String word) {
        Pattern pattern = Pattern.compile("([bc]*|ab)*", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(word);
        return matcher.matches();
    }
}
