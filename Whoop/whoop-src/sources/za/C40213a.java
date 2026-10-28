package za;

import java.util.regex.Pattern;
import p607x8.C38059n;

/* JADX INFO: renamed from: za.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C40213a {

    /* JADX INFO: renamed from: c */
    public static final Pattern f173641c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d */
    public static final Pattern f173642d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a */
    public final C38059n f173643a = new C38059n();

    /* JADX INFO: renamed from: b */
    public final StringBuilder f173644b = new StringBuilder();

    /* JADX INFO: renamed from: a */
    public static String m129098a(C38059n c38059n, StringBuilder sb4) {
        boolean z4 = false;
        sb4.setLength(0);
        int i13 = c38059n.f163018b;
        int i14 = c38059n.f163019c;
        while (i13 < i14 && !z4) {
            char c3 = (char) c38059n.f163017a[i13];
            if ((c3 < 'A' || c3 > 'Z') && ((c3 < 'a' || c3 > 'z') && !((c3 >= '0' && c3 <= '9') || c3 == '#' || c3 == '-' || c3 == '.' || c3 == '_'))) {
                z4 = true;
            } else {
                i13++;
                sb4.append(c3);
            }
        }
        c38059n.m121847G(i13 - c38059n.f163018b);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m129099b(C38059n c38059n, StringBuilder sb4) {
        m129100c(c38059n);
        if (c38059n.m121848a() == 0) {
            return null;
        }
        String strM129098a = m129098a(c38059n, sb4);
        if (!"".equals(strM129098a)) {
            return strM129098a;
        }
        return "" + ((char) c38059n.m121867t());
    }

    /* JADX INFO: renamed from: c */
    public static void m129100c(C38059n c38059n) {
        while (true) {
            for (boolean z4 = true; c38059n.m121848a() > 0 && z4; z4 = false) {
                int i13 = c38059n.f163018b;
                byte[] bArr = c38059n.f163017a;
                byte b = bArr[i13];
                char c3 = (char) b;
                if (c3 == '\t' || c3 == '\n' || c3 == '\f' || c3 == '\r' || c3 == ' ') {
                    c38059n.m121847G(1);
                } else {
                    int i14 = c38059n.f163019c;
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
                            c38059n.m121847G(i14 - c38059n.f163018b);
                        }
                    }
                }
            }
            return;
        }
    }
}
