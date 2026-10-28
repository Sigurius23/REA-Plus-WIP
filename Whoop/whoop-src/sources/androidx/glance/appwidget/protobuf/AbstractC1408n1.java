package androidx.glance.appwidget.protobuf;

import p108e4.AbstractC12667a;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.n1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1408n1 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC12667a f5948a;

    static {
        f5948a = (AbstractC1399k1.f5930e && AbstractC1399k1.f5929d && !AbstractC1373c.m4297a()) ? new C1402l1(1) : new C1402l1(0);
    }

    /* JADX INFO: renamed from: a */
    public static int m4486a(byte[] bArr, int i13, int i14) {
        byte b = bArr[i13 - 1];
        int i15 = i14 - i13;
        if (i15 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i15 == 1) {
            return m4488c(b, bArr[i13]);
        }
        if (i15 == 2) {
            return m4489d(b, bArr[i13], bArr[i13 + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: b */
    public static int m4487b(String str) {
        int length = str.length();
        int i13 = 0;
        int i14 = 0;
        while (i14 < length && str.charAt(i14) < 128) {
            i14++;
        }
        int i15 = length;
        while (i14 < length) {
            char cCharAt = str.charAt(i14);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                while (i14 < length2) {
                    char cCharAt2 = str.charAt(i14);
                    if (cCharAt2 < 2048) {
                        i13 += (127 - cCharAt2) >>> 31;
                    } else {
                        i13 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i14) < 65536) {
                                throw new C1405m1(i14, length2);
                            }
                            i14++;
                        }
                    }
                    i14++;
                }
                i15 += i13;
                break;
            }
            i15 += (127 - cCharAt) >>> 31;
            i14++;
        }
        if (i15 >= length) {
            return i15;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i15) + 4294967296L));
    }

    /* JADX INFO: renamed from: c */
    public static int m4488c(int i13, int i14) {
        if (i13 > -12 || i14 > -65) {
            return -1;
        }
        return i13 ^ (i14 << 8);
    }

    /* JADX INFO: renamed from: d */
    public static int m4489d(int i13, int i14, int i15) {
        if (i13 > -12 || i14 > -65 || i15 > -65) {
            return -1;
        }
        return (i13 ^ (i14 << 8)) ^ (i15 << 16);
    }
}
