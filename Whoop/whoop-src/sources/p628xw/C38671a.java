package p628xw;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import rs.AbstractC31780b;

/* JADX INFO: renamed from: xw.a */
/* JADX INFO: loaded from: classes6.dex */
public class C38671a implements Serializable {

    /* JADX INFO: renamed from: w */
    public final String f166476w;

    public C38671a(String str) {
        Objects.requireNonNull(str);
        this.f166476w = str;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m124047a() {
        char c3;
        String str = this.f166476w;
        if (str == null || str.isEmpty()) {
            return new byte[0];
        }
        byte[] bytes = str.getBytes(AbstractC38676f.f166480a);
        int length = bytes.length;
        long j7 = (((long) length) * 6) >> 3;
        int i13 = (int) j7;
        if (i13 != j7) {
            throw new IllegalArgumentException(j7 + " cannot be cast to int without changing its value.");
        }
        byte[] bArr = new byte[i13];
        int i14 = 0;
        int i15 = 0;
        while (i14 < bytes.length) {
            int i16 = 0;
            int i17 = 0;
            while (i16 < 4 && i14 < length) {
                int i18 = i14 + 1;
                byte b = bytes[i14];
                int iM98693n = AbstractC31780b.m98693n(b, 64) & AbstractC31780b.m98694o(b, 91);
                int iM98693n2 = AbstractC31780b.m98693n(b, 96) & AbstractC31780b.m98694o(b, 123);
                int iM98693n3 = AbstractC31780b.m98693n(b, 47) & AbstractC31780b.m98694o(b, 58);
                int iM98692m = AbstractC31780b.m98692m(b, 43) | AbstractC31780b.m98692m(b, 45);
                int iM98692m2 = AbstractC31780b.m98692m(b, 47) | AbstractC31780b.m98692m(b, 95);
                byte[] bArr2 = bytes;
                int iM98695p = AbstractC31780b.m98695p(iM98693n2, b - 71, 0) | AbstractC31780b.m98695p(iM98693n, b - 65, 0) | AbstractC31780b.m98695p(iM98693n3, b + 4, 0) | AbstractC31780b.m98695p(iM98692m, 62, 0) | AbstractC31780b.m98695p(iM98692m2, 63, 0) | AbstractC31780b.m98695p(iM98693n | iM98693n2 | iM98693n3 | iM98692m | iM98692m2, 0, -1);
                if (iM98695p >= 0) {
                    i17 |= iM98695p << (18 - (i16 * 6));
                    i16++;
                }
                i14 = i18;
                bytes = bArr2;
            }
            byte[] bArr3 = bytes;
            if (i16 >= 2) {
                int i19 = i15 + 1;
                bArr[i15] = (byte) (i17 >> 16);
                c3 = 3;
                if (i16 >= 3) {
                    int i24 = i15 + 2;
                    bArr[i19] = (byte) (i17 >> 8);
                    if (i16 >= 4) {
                        i15 += 3;
                        bArr[i24] = (byte) i17;
                    } else {
                        i15 = i24;
                    }
                } else {
                    i15 = i19;
                }
            } else {
                c3 = 3;
            }
            bytes = bArr3;
        }
        return Arrays.copyOf(bArr, i15);
    }

    /* JADX INFO: renamed from: b */
    public final BigInteger m124048b() {
        return new BigInteger(1, m124047a());
    }

    public boolean equals(Object obj) {
        if (obj instanceof C38671a) {
            return this.f166476w.equals(((C38671a) obj).f166476w);
        }
        return false;
    }

    public final int hashCode() {
        return this.f166476w.hashCode();
    }

    public final String toString() {
        return this.f166476w;
    }
}
