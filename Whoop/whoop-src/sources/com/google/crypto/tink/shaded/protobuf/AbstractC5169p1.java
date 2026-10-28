package com.google.crypto.tink.shaded.protobuf;

import p507tx.AbstractC34235f;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.p1 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC5169p1 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC34235f f21562a;

    static {
        f21562a = (AbstractC5160m1.f21553e && AbstractC5160m1.f21552d && !AbstractC5128c.m16150a()) ? new C5163n1(1) : new C5163n1(0);
    }

    /* JADX INFO: renamed from: a */
    public static int m16300a(byte[] bArr, int i13, int i14) {
        byte b = bArr[i13 - 1];
        int i15 = i14 - i13;
        if (i15 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i15 == 1) {
            return m16303d(b, bArr[i13]);
        }
        if (i15 == 2) {
            return m16304e(b, bArr[i13], bArr[i13 + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: b */
    public static String m16301b(byte[] bArr, int i13, int i14) {
        return f21562a.mo16295E(bArr, i13, i14);
    }

    /* JADX INFO: renamed from: c */
    public static int m16302c(String str) {
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
                                throw new C5166o1(i14, length2);
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

    /* JADX INFO: renamed from: d */
    public static int m16303d(int i13, int i14) {
        if (i13 > -12 || i14 > -65) {
            return -1;
        }
        return i13 ^ (i14 << 8);
    }

    /* JADX INFO: renamed from: e */
    public static int m16304e(int i13, int i14, int i15) {
        if (i13 > -12 || i14 > -65 || i15 > -65) {
            return -1;
        }
        return (i13 ^ (i14 << 8)) ^ (i15 << 16);
    }
}
