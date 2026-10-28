package p251jg;

import aws.smithy.kotlin.runtime.serde.DeserializationException;
import i93.C18277c;
import ih0.AbstractC18489d0;
import java.util.Set;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import va3.AbstractC35846d;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: jg.d */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC21651d {

    /* JADX INFO: renamed from: a */
    public static final Set f83163a = AbstractC25265s.m74103I1(new C18277c('0', '9'));

    /* JADX INFO: renamed from: b */
    public static final Set f83164b = AbstractC25260n.m74059b1(new Character[]{'e', 'E'});

    /* JADX INFO: renamed from: c */
    public static final Set f83165c = AbstractC25260n.m74059b1(new Character[]{'-', '+'});

    /* JADX INFO: renamed from: a */
    public static final String m60922a(String str) {
        StringBuilder sb4 = new StringBuilder(str.length() + 1);
        int i13 = 0;
        while (i13 < str.length()) {
            char cCharAt = str.charAt(i13);
            if (cCharAt == '\\') {
                int i14 = i13 + 2;
                char cCharAt2 = str.charAt(i13 + 1);
                if (cCharAt2 == '\"') {
                    sb4.append('\"');
                } else if (cCharAt2 == '/') {
                    sb4.append('/');
                } else if (cCharAt2 == '\\') {
                    sb4.append('\\');
                } else if (cCharAt2 == 'b') {
                    sb4.append('\b');
                } else if (cCharAt2 != 'f') {
                    int i15 = 10;
                    if (cCharAt2 == 'n') {
                        sb4.append('\n');
                    } else if (cCharAt2 == 'r') {
                        sb4.append('\r');
                    } else if (cCharAt2 == 't') {
                        sb4.append('\t');
                    } else {
                        if (cCharAt2 != 'u') {
                            throw new DeserializationException("Invalid escape character: `" + cCharAt2 + '`');
                        }
                        int i16 = i13 + 6;
                        if (i16 > str.length()) {
                            throw new IllegalStateException("Unexpected EOF reading escaped high surrogate");
                        }
                        String strSubstring = str.substring(i14, i16);
                        AbstractC22676k.m65749i(strSubstring, "substring(...)");
                        char cM60923b = m60923b(strSubstring);
                        if (Character.isHighSurrogate(cM60923b)) {
                            String strM53368i = AbstractC18489d0.m53368i(i13, str, 12, i16, "substring(...)");
                            if (!AbstractC39421y.m125930O(strM53368i, "\\u", false)) {
                                throw new IllegalStateException(AbstractC31061c.m95633i('`', "Expected surrogate pair, found `", strM53368i).toString());
                            }
                            String strSubstring2 = strM53368i.substring(2);
                            AbstractC22676k.m65749i(strSubstring2, "substring(...)");
                            char cM60923b2 = m60923b(strSubstring2);
                            if (!Character.isLowSurrogate(cM60923b2)) {
                                throw new IllegalStateException(("Invalid surrogate pair: (" + ((int) cM60923b) + ", " + ((int) cM60923b2) + ')').toString());
                            }
                            Object[] objArr = {Character.valueOf(cM60923b), Character.valueOf(cM60923b2)};
                            for (int i17 = 0; i17 < 2; i17++) {
                                sb4.append(objArr[i17]);
                            }
                        } else {
                            sb4.append(cM60923b);
                            i15 = 4;
                        }
                        i14 += i15;
                    }
                } else {
                    sb4.append('\f');
                }
                i13 = i14;
            } else {
                sb4.append(cCharAt);
                i13++;
            }
        }
        return sb4.toString();
    }

    /* JADX INFO: renamed from: b */
    public static final char m60923b(String str) {
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if (('0' > cCharAt || cCharAt >= ':') && (('a' > cCharAt || cCharAt >= 'g') && ('A' > cCharAt || cCharAt >= 'G'))) {
                throw new IllegalStateException(AbstractC31061c.m95633i('`', "Invalid unicode escape: `\\u", str).toString());
            }
        }
        AbstractC35846d.m113779c(16);
        return (char) Integer.parseInt(str, 16);
    }
}
