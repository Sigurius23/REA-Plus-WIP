package io.sentry.util;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: io.sentry.util.m */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20591m {

    /* JADX INFO: renamed from: a */
    public static final Charset f77097a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b */
    public static final Pattern f77098b = Pattern.compile("[\\W_]+");

    /* JADX INFO: renamed from: a */
    public static String m56724a(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb4 = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        Locale locale = Locale.ROOT;
        sb4.append(strSubstring.toUpperCase(locale));
        sb4.append(str.substring(1).toLowerCase(locale));
        return sb4.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m56725b(List list) {
        StringBuilder sb4 = new StringBuilder();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            sb4.append((CharSequence) it.next());
            while (it.hasNext()) {
                sb4.append((CharSequence) ",");
                sb4.append((CharSequence) it.next());
            }
        }
        return sb4.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m56726c(String str) {
        return (str != null && str.startsWith("\"") && str.endsWith("\"")) ? str.substring(1, str.length() - 1) : str;
    }
}
