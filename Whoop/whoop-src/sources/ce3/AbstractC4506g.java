package ce3;

import ne3.C26622k;
import ne3.C26624l;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import wd3.AbstractC37174h;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: ce3.g */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC4506g {

    /* JADX INFO: renamed from: a */
    public static final C26624l f18154a;

    /* JADX INFO: renamed from: b */
    public static final String[] f18155b;

    /* JADX INFO: renamed from: c */
    public static final String[] f18156c;

    /* JADX INFO: renamed from: d */
    public static final String[] f18157d;

    static {
        C26622k c26622k = C26624l.f105882z;
        f18154a = C26622k.m79241b("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f18155b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f18156c = new String[64];
        String[] strArr = new String[256];
        for (int i13 = 0; i13 < 256; i13++) {
            String binaryString = Integer.toBinaryString(i13);
            AbstractC22676k.m65749i(binaryString, "toBinaryString(...)");
            strArr[i13] = AbstractC39421y.m125927L(AbstractC37174h.m119137d("%8s", binaryString), ' ', '0');
        }
        f18157d = strArr;
        String[] strArr2 = f18156c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i14 = iArr[0];
        strArr2[i14 | 8] = AbstractC25012a.m73376i(strArr2[i14], "|PADDED", new StringBuilder());
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i15 = 0; i15 < 3; i15++) {
            int i16 = iArr2[i15];
            int i17 = iArr[0];
            String[] strArr3 = f18156c;
            int i18 = i17 | i16;
            strArr3[i18] = strArr3[i17] + '|' + strArr3[i16];
            StringBuilder sb4 = new StringBuilder();
            sb4.append(strArr3[i17]);
            sb4.append('|');
            strArr3[i18 | 8] = AbstractC25012a.m73376i(strArr3[i16], "|PADDED", sb4);
        }
        int length = f18156c.length;
        for (int i19 = 0; i19 < length; i19++) {
            String[] strArr4 = f18156c;
            if (strArr4[i19] == null) {
                strArr4[i19] = f18157d[i19];
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m14127a(int i13) {
        String[] strArr = f18155b;
        return i13 < strArr.length ? strArr[i13] : AbstractC37174h.m119137d("0x%02x", Integer.valueOf(i13));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0056  */
    /* JADX INFO: renamed from: b */
    public static String m14128b(int i13, int i14, int i15, int i16, boolean z4) {
        String strM125926K;
        String str;
        String strM14127a = m14127a(i15);
        if (i16 == 0) {
            strM125926K = "";
        } else {
            String[] strArr = f18157d;
            if (i15 == 2 || i15 == 3) {
                strM125926K = strArr[i16];
            } else if (i15 == 4 || i15 == 6) {
                strM125926K = i16 == 1 ? "ACK" : strArr[i16];
            } else if (i15 == 7 || i15 == 8) {
                strM125926K = strArr[i16];
            } else {
                String[] strArr2 = f18156c;
                if (i16 < strArr2.length) {
                    str = strArr2[i16];
                    AbstractC22676k.m65747g(str);
                } else {
                    str = strArr[i16];
                }
                if (i15 != 5 || (i16 & 4) == 0) {
                    strM125926K = (i15 != 0 || (i16 & 32) == 0) ? str : AbstractC39421y.m125926K(str, "PRIORITY", "COMPRESSED", false);
                } else {
                    strM125926K = AbstractC39421y.m125926K(str, "HEADERS", "PUSH_PROMISE", false);
                }
            }
        }
        return AbstractC37174h.m119137d("%s 0x%08x %5d %-13s %s", z4 ? "<<" : ">>", Integer.valueOf(i13), Integer.valueOf(i14), strM14127a, strM125926K);
    }

    /* JADX INFO: renamed from: c */
    public static String m14129c(int i13, int i14, long j7, boolean z4) {
        return AbstractC37174h.m119137d("%s 0x%08x %5d %-13s %d", z4 ? "<<" : ">>", Integer.valueOf(i13), Integer.valueOf(i14), m14127a(8), Long.valueOf(j7));
    }
}
