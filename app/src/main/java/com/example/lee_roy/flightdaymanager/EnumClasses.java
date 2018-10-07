package com.example.lee_roy.flightdaymanager;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EnumClasses {
    enum Alphabet {
        a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;

        private static final List<Alphabet> AlphabetList =
                Collections.unmodifiableList(Arrays.asList(values()));

    }

    public Alphabet indexToLetter(int index) {
        return Alphabet.AlphabetList.get(index);
    }

    public char getLetterAtIndex(int index) {
        String letter = Alphabet.AlphabetList.get(index).toString();
        return letter.charAt(0);
    }
}
