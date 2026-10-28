package p199ho;

import ed3.C13117a;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ho.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C17521b {

    /* JADX INFO: renamed from: c */
    public static final Pattern f67758c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d */
    public static final Pattern f67759d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a */
    public final C13117a f67760a = new C13117a();

    /* JADX INFO: renamed from: b */
    public final StringBuilder f67761b = new StringBuilder();

    /* JADX INFO: renamed from: a */
    public static String m49762a(C13117a c13117a, StringBuilder sb4) {
        boolean z4 = false;
        sb4.setLength(0);
        int i13 = c13117a.f45382b;
        int i14 = c13117a.f45383c;
        while (i13 < i14 && !z4) {
            char c3 = (char) c13117a.f45381a[i13];
            if ((c3 < 'A' || c3 > 'Z') && ((c3 < 'a' || c3 > 'z') && !((c3 >= '0' && c3 <= '9') || c3 == '#' || c3 == '-' || c3 == '.' || c3 == '_'))) {
                z4 = true;
            } else {
                i13++;
                sb4.append(c3);
            }
        }
        c13117a.m36690L(i13 - c13117a.f45382b);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m49763b(C13117a c13117a, StringBuilder sb4) {
        m49764c(c13117a);
        if (c13117a.m36692a() == 0) {
            return null;
        }
        String strM49762a = m49762a(c13117a, sb4);
        if (!"".equals(strM49762a)) {
            return strM49762a;
        }
        char cM36715y = (char) c13117a.m36715y();
        StringBuilder sb5 = new StringBuilder(1);
        sb5.append(cM36715y);
        return sb5.toString();
    }

    /* JADX INFO: renamed from: c */
    public static void m49764c(C13117a c13117a) {
        while (true) {
            for (boolean z4 = true; c13117a.m36692a() > 0 && z4; z4 = false) {
                int i13 = c13117a.f45382b;
                byte[] bArr = c13117a.f45381a;
                byte b = bArr[i13];
                char c3 = (char) b;
                if (c3 == '\t' || c3 == '\n' || c3 == '\f' || c3 == '\r' || c3 == ' ') {
                    c13117a.m36690L(1);
                } else {
                    int i14 = c13117a.f45383c;
                    int i15 = i13 + 2;
                    if (i15 <= i14) {
                        int i16 = i13 + 1;
                        if (b == 47 && bArr[i16] == 42) {
                            while (true) {
                                int i17 = i15 + 1;
                                if (i17 >= i14) {
                                    break;
                                }
                                if (((char) bArr[i15]) == '*' && ((char) bArr[i17]) == '/') {
                                    i15 += 2;
                                    i14 = i15;
                                } else {
                                    i15 = i17;
                                }
                            }
                            c13117a.m36690L(i14 - c13117a.f45382b);
                        }
                    }
                }
            }
            return;
        }
    }
}
