package mp;

/* JADX INFO: renamed from: mp.g0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC25769g0 {

    /* JADX INFO: renamed from: w */
    public static final char[] f101483w = "0123456789abcdef".toCharArray();

    public final boolean equals(Object obj) {
        boolean z4;
        if (obj instanceof AbstractC25769g0) {
            byte[] bArr = ((C25766f0) this).f101481x;
            int length = bArr.length * 8;
            byte[] bArr2 = ((C25766f0) ((AbstractC25769g0) obj)).f101481x;
            if (length == bArr2.length * 8) {
                if (bArr.length == bArr2.length) {
                    z4 = true;
                    for (int i13 = 0; i13 < bArr.length; i13++) {
                        z4 &= bArr[i13] == bArr2[i13];
                    }
                } else {
                    z4 = false;
                }
                if (z4) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = ((C25766f0) this).f101481x;
        if (bArr.length * 8 < 32) {
            int i13 = bArr[0] & 255;
            for (int i14 = 1; i14 < bArr.length; i14++) {
                i13 |= (bArr[i14] & 255) << (i14 * 8);
            }
            return i13;
        }
        int length = bArr.length;
        if (length < 4) {
            throw new IllegalStateException(AbstractC25753b.m75991c("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
        }
        int i15 = bArr[0] & 255;
        int i16 = bArr[1] & 255;
        int i17 = bArr[2] & 255;
        return ((bArr[3] & 255) << 24) | i15 | (i16 << 8) | (i17 << 16);
    }

    public final String toString() {
        byte[] bArr = ((C25766f0) this).f101481x;
        int length = bArr.length;
        StringBuilder sb4 = new StringBuilder(length + length);
        for (byte b : bArr) {
            char[] cArr = f101483w;
            sb4.append(cArr[(b >> 4) & 15]);
            sb4.append(cArr[b & 15]);
        }
        return sb4.toString();
    }
}
