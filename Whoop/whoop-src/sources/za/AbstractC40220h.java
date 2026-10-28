package za;

import androidx.media3.common.ParserException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import p607x8.AbstractC38065t;
import p607x8.C38059n;

/* JADX INFO: renamed from: za.h */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC40220h {
    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    /* JADX INFO: renamed from: a */
    public static float m129109a(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* JADX INFO: renamed from: b */
    public static long m129110b(String str) {
        int i13 = AbstractC38065t.f163031a;
        String[] strArrSplit = str.split("\\.", 2);
        long j7 = 0;
        for (String str2 : strArrSplit[0].split(":", -1)) {
            j7 = (j7 * 60) + Long.parseLong(str2);
        }
        long j13 = j7 * 1000;
        if (strArrSplit.length == 2) {
            String strTrim = strArrSplit[1].trim();
            if (strTrim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(strTrim));
            }
            j13 += Long.parseLong(strTrim);
        }
        return j13 * 1000;
    }

    /* JADX INFO: renamed from: c */
    public static void m129111c(C38059n c38059n) {
        int i13 = c38059n.f163018b;
        Charset charset = StandardCharsets.UTF_8;
        String strM121855h = c38059n.m121855h(charset);
        if (strM121855h == null || !strM121855h.startsWith("WEBVTT")) {
            c38059n.m121846F(i13);
            throw ParserException.m5049a(null, "Expected WEBVTT. Got " + c38059n.m121855h(charset));
        }
    }
}
