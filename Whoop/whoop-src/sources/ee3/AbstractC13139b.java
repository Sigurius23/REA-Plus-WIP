package ee3;

import ne3.C26622k;
import ne3.C26624l;

/* JADX INFO: renamed from: ee3.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC13139b {

    /* JADX INFO: renamed from: a */
    public static final C26624l f45447a;

    static {
        C26622k c26622k = C26624l.f105882z;
        f45447a = C26622k.m79241b("xn--");
    }

    /* JADX INFO: renamed from: a */
    public static int m36768a(int i13, int i14, boolean z4) {
        int i15 = z4 ? i13 / 700 : i13 / 2;
        int i16 = (i15 / i14) + i15;
        int i17 = 0;
        while (i16 > 455) {
            i16 /= 35;
            i17 += 36;
        }
        return ((i16 * 36) / (i16 + 38)) + i17;
    }

    /* JADX INFO: renamed from: b */
    public static int m36769b(int i13) {
        if (i13 < 26) {
            return i13 + 97;
        }
        if (i13 < 36) {
            return i13 + 22;
        }
        throw new IllegalStateException(("unexpected digit: " + i13).toString());
    }
}
