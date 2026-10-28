package androidx.health.platform.client.proto;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.q3 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1517q3 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC1559z2 f6107a;

    static {
        f6107a = (AbstractC1502n3.f6077e && AbstractC1502n3.f6076d && !AbstractC1443c.m4578a()) ? new C1507o3(1) : new C1507o3(0);
    }

    /* JADX INFO: renamed from: a */
    public static int m4804a(byte[] bArr, int i13, int i14) {
        byte b = bArr[i13 - 1];
        int i15 = i14 - i13;
        if (i15 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i15 == 1) {
            return m4806c(b, bArr[i13]);
        }
        if (i15 == 2) {
            return m4807d(b, bArr[i13], bArr[i13 + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: b */
    public static int m4805b(String str) {
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
                                throw new C1512p3(i14, length2);
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
    public static int m4806c(int i13, int i14) {
        if (i13 > -12 || i14 > -65) {
            return -1;
        }
        return i13 ^ (i14 << 8);
    }

    /* JADX INFO: renamed from: d */
    public static int m4807d(int i13, int i14, int i15) {
        if (i13 > -12 || i14 > -65 || i15 > -65) {
            return -1;
        }
        return (i13 ^ (i14 << 8)) ^ (i15 << 16);
    }
}
