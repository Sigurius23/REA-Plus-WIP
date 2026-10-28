package rc3;

import i93.C18285k;
import p497t7.InterfaceC33561b;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.DurationKt;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: rc3.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC31237b {

    /* JADX INFO: renamed from: a */
    public static final int[] f128620a = {1, 10, 100, 1000, InterfaceC33561b.INVALID_OWNERSHIP, 100000, DurationKt.NANOS_IN_MILLIS, 10000000, 100000000, 1000000000};

    /* JADX INFO: renamed from: a */
    public static final int m96189a(C18285k c18285k) {
        AbstractC22676k.m65750j(c18285k, "<this>");
        if (c18285k.isEmpty()) {
            return 0;
        }
        try {
            long jAddExact = (Math.addExact(c18285k.f71142x, -c18285k.f71141w) / c18285k.f71143y) + 1;
            if (jAddExact > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (jAddExact < -2147483648L) {
                return Integer.MIN_VALUE;
            }
            return (int) jAddExact;
        } catch (ArithmeticException unused) {
            return Integer.MAX_VALUE;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m96190b(char c3) {
        return '0' <= c3 && c3 < ':';
    }

    /* JADX INFO: renamed from: c */
    public static final String m96191c(int i13, String str) {
        int iM125887f0;
        if (str.length() >= i13 + 12) {
            int i14 = 0;
            if (AbstractC39414r.m125875T("+-", str.charAt(0), false) && (iM125887f0 = AbstractC39414r.m125887f0(str, '-', 1, false, 4)) >= 12) {
                while (true) {
                    int i15 = i14 + 1;
                    if (str.charAt(i15) != '0') {
                        break;
                    }
                    i14 = i15;
                }
                if (iM125887f0 - i14 < 12) {
                    return AbstractC39414r.m125899r0(1, iM125887f0 - 10, str).toString();
                }
            }
        }
        return str;
    }
}
