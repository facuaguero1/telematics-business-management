package com.tbm.tbmRestApi;

import java.text.NumberFormat;
import java.text.ParsePosition;

public class CommonFunctions {

    public static boolean isNumeric(String str) {
        ParsePosition pos = new ParsePosition(0);
        NumberFormat.getInstance().parse(str, pos);
        return str.length() == pos.getIndex();
    }
}
