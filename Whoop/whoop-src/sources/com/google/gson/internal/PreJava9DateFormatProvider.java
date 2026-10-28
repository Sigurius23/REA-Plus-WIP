package com.google.gson.internal;

import io.getstream.chat.android.p226ui.common.helper.DefaultDateFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p031b9.AbstractC2875y;

/* JADX INFO: loaded from: classes6.dex */
public class PreJava9DateFormatProvider {
    private static String getDateFormatPattern(int i13) {
        if (i13 == 0) {
            return "EEEE, MMMM d, y";
        }
        if (i13 == 1) {
            return "MMMM d, y";
        }
        if (i13 == 2) {
            return "MMM d, y";
        }
        if (i13 == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Unknown DateFormat style: "));
    }

    private static String getDatePartOfDateTimePattern(int i13) {
        if (i13 == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i13 == 1) {
            return "MMMM d, yyyy";
        }
        if (i13 == 2) {
            return "MMM d, yyyy";
        }
        if (i13 == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Unknown DateFormat style: "));
    }

    private static String getTimePartOfDateTimePattern(int i13) {
        if (i13 == 0 || i13 == 1) {
            return "h:mm:ss a z";
        }
        if (i13 == 2) {
            return "h:mm:ss a";
        }
        if (i13 == 3) {
            return DefaultDateFormatter.TIME_FORMAT_12H;
        }
        throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Unknown DateFormat style: "));
    }

    public static DateFormat getUSDateFormat(int i13) {
        return new SimpleDateFormat(getDateFormatPattern(i13), Locale.US);
    }

    public static DateFormat getUSDateTimeFormat(int i13, int i14) {
        return new SimpleDateFormat(getDatePartOfDateTimePattern(i13) + " " + getTimePartOfDateTimePattern(i14), Locale.US);
    }
}
