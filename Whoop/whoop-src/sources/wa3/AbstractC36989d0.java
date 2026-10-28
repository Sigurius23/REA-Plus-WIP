package wa3;

/* JADX INFO: renamed from: wa3.d0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC36989d0 {

    /* JADX INFO: renamed from: a */
    public static final C36985b0 f158319a = new C36985b0();

    /* JADX INFO: renamed from: b */
    public static final C36987c0 f158320b = new C36987c0();

    /* JADX INFO: renamed from: a */
    public static int m118738a(int i13, int i14) {
        if (i13 > -12 || i14 > -65) {
            return -1;
        }
        return i13 ^ (i14 << 8);
    }

    /* JADX INFO: renamed from: b */
    public static int m118739b(byte[] bArr, int i13, int i14) {
        byte b = bArr[i13 - 1];
        int i15 = i14 - i13;
        if (i15 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i15 == 1) {
            return m118738a(b, bArr[i13]);
        }
        if (i15 != 2) {
            throw new AssertionError();
        }
        byte b6 = bArr[i13];
        byte b8 = bArr[i13 + 1];
        if (b > -12 || b6 > -65 || b8 > -65) {
            return -1;
        }
        return (b8 << 16) ^ ((b6 << 8) ^ b);
    }

    /* JADX INFO: renamed from: c */
    public static int m118740c(byte[] bArr, int i13, int i14) {
        while (i13 < i14 && bArr[i13] >= 0) {
            i13++;
        }
        if (i13 >= i14) {
            return 0;
        }
        while (i13 < i14) {
            int i15 = i13 + 1;
            byte b = bArr[i13];
            if (b >= 0) {
                i13 = i15;
            } else if (b < -32) {
                if (i15 >= i14) {
                    return b;
                }
                if (b < -62) {
                    return -1;
                }
                i13 += 2;
                if (bArr[i15] > -65) {
                    return -1;
                }
            } else if (b < -16) {
                if (i15 >= i14 - 1) {
                    return m118739b(bArr, i15, i14);
                }
                int i16 = i13 + 2;
                byte b6 = bArr[i15];
                if (b6 > -65) {
                    return -1;
                }
                if (b == -32 && b6 < -96) {
                    return -1;
                }
                if (b == -19 && b6 >= -96) {
                    return -1;
                }
                i13 += 3;
                if (bArr[i16] > -65) {
                    return -1;
                }
            } else {
                if (i15 >= i14 - 2) {
                    return m118739b(bArr, i15, i14);
                }
                int i17 = i13 + 2;
                byte b8 = bArr[i15];
                if (b8 > -65) {
                    return -1;
                }
                if ((((b8 + 112) + (b << 28)) >> 30) != 0) {
                    return -1;
                }
                int i18 = i13 + 3;
                if (bArr[i17] > -65) {
                    return -1;
                }
                i13 += 4;
                if (bArr[i18] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }
}
