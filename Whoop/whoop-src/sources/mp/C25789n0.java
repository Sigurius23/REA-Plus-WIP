package mp;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: renamed from: mp.n0 */
/* JADX INFO: loaded from: classes6.dex */
public class C25789n0 {

    /* JADX INFO: renamed from: d */
    public static final C25784l0 f101516d;

    /* JADX INFO: renamed from: a */
    public final C25781k0 f101517a;

    /* JADX INFO: renamed from: b */
    public final Character f101518b;

    /* JADX INFO: renamed from: c */
    public volatile C25789n0 f101519c;

    static {
        new C25787m0("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new C25787m0("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new C25789n0("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new C25789n0("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f101516d = new C25784l0(new C25781k0("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public C25789n0(C25781k0 c25781k0, Character ch4) {
        this.f101517a = c25781k0;
        if (ch4 != null) {
            byte[] bArr = c25781k0.f101506g;
            if (bArr.length > 61 && bArr[61] != -1) {
                throw new IllegalArgumentException(AbstractC25753b.m75991c("Padding character %s was already in alphabet", ch4));
            }
        }
        this.f101518b = ch4;
    }

    /* JADX INFO: renamed from: a */
    public void mo76023a(StringBuilder sb4, byte[] bArr, int i13) {
        int i14 = 0;
        AbstractC25753b.m76001m(0, i13, bArr.length);
        while (i14 < i13) {
            C25781k0 c25781k0 = this.f101517a;
            m76027b(sb4, bArr, i14, Math.min(c25781k0.f101505f, i13 - i14));
            i14 += c25781k0.f101505f;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m76027b(StringBuilder sb4, byte[] bArr, int i13, int i14) {
        AbstractC25753b.m76001m(i13, i13 + i14, bArr.length);
        C25781k0 c25781k0 = this.f101517a;
        int i15 = c25781k0.f101505f;
        int i16 = c25781k0.f101503d;
        if (i14 > i15) {
            throw new IllegalArgumentException();
        }
        int i17 = 0;
        long j7 = 0;
        for (int i18 = 0; i18 < i14; i18++) {
            j7 = (j7 | ((long) (bArr[i13 + i18] & 255))) << 8;
        }
        int i19 = (i14 + 1) * 8;
        while (i17 < i14 * 8) {
            sb4.append(c25781k0.f101501b[((int) (j7 >>> ((i19 - i16) - i17))) & c25781k0.f101502c]);
            i17 += i16;
        }
        if (this.f101518b != null) {
            while (i17 < c25781k0.f101505f * 8) {
                sb4.append('=');
                i17 += i16;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m76028c(int i13, byte[] bArr) {
        AbstractC25753b.m76001m(0, i13, bArr.length);
        C25781k0 c25781k0 = this.f101517a;
        int i14 = c25781k0.f101505f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb4 = new StringBuilder(c25781k0.f101504e * AbstractC25753b.m75989a(i13, i14));
        try {
            mo76023a(sb4, bArr, i13);
            return sb4.toString();
        } catch (IOException e5) {
            throw new AssertionError(e5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C25789n0) {
            C25789n0 c25789n0 = (C25789n0) obj;
            if (this.f101517a.equals(c25789n0.f101517a) && Objects.equals(this.f101518b, c25789n0.f101518b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f101517a.hashCode() ^ Objects.hashCode(this.f101518b);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("BaseEncoding.");
        C25781k0 c25781k0 = this.f101517a;
        sb4.append(c25781k0);
        if (8 % c25781k0.f101503d != 0) {
            Character ch4 = this.f101518b;
            if (ch4 == null) {
                sb4.append(".omitPadding()");
            } else {
                sb4.append(".withPadChar('");
                sb4.append(ch4);
                sb4.append("')");
            }
        }
        return sb4.toString();
    }

    public C25789n0(String str, String str2) {
        this(new C25781k0(str, str2.toCharArray()), (Character) '=');
    }
}
