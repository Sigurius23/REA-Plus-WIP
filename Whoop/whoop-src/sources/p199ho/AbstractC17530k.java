package p199ho;

import com.google.android.exoplayer2.ParserException;
import ed3.C13117a;
import java.util.regex.Pattern;
import p309lo.AbstractC24567y;

/* JADX INFO: renamed from: ho.k */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC17530k {

    /* JADX INFO: renamed from: a */
    public static final Pattern f67808a = Pattern.compile("^NOTE([ \t].*)?$");

    /* JADX INFO: renamed from: a */
    public static float m49775a(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* JADX INFO: renamed from: b */
    public static long m49776b(String str) {
        int i13 = AbstractC24567y.f95875a;
        String[] strArrSplit = str.split("\\.", 2);
        long j7 = 0;
        for (String str2 : strArrSplit[0].split(":", -1)) {
            j7 = (j7 * 60) + Long.parseLong(str2);
        }
        long j13 = j7 * 1000;
        if (strArrSplit.length == 2) {
            j13 += Long.parseLong(strArrSplit[1]);
        }
        return j13 * 1000;
    }

    /* JADX INFO: renamed from: c */
    public static void m49777c(C13117a c13117a) throws ParserException {
        int i13 = c13117a.f45382b;
        String strM36700j = c13117a.m36700j();
        if (strM36700j == null || !strM36700j.startsWith("WEBVTT")) {
            c13117a.m36689K(i13);
            String strValueOf = String.valueOf(c13117a.m36700j());
            throw ParserException.m15562a(null, strValueOf.length() != 0 ? "Expected WEBVTT. Got ".concat(strValueOf) : new String("Expected WEBVTT. Got "));
        }
    }
}
