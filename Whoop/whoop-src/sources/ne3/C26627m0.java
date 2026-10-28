package ne3;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import m83.AbstractC25260n;
import oe3.AbstractC27882b;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ne3.m0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C26627m0 extends C26624l {

    /* JADX INFO: renamed from: F */
    public final transient byte[][] f105892F;

    /* JADX INFO: renamed from: G */
    public final transient int[] f105893G;

    public C26627m0(byte[][] bArr, int[] iArr) {
        super(C26624l.f105881E.f105883w);
        this.f105892F = bArr;
        this.f105893G = iArr;
    }

    @Override // ne3.C26624l
    /* JADX INFO: renamed from: b */
    public final void mo79251b(int i13, int i14, int i15, byte[] target) {
        AbstractC22676k.m65750j(target, "target");
        long j7 = i15;
        AbstractC26604b.m79160e(mo79253d(), i13, j7);
        AbstractC26604b.m79160e(target.length, i14, j7);
        int i16 = i15 + i13;
        int iM84153c = AbstractC27882b.m84153c(this, i13);
        while (i13 < i16) {
            int[] iArr = this.f105893G;
            int i17 = iM84153c == 0 ? 0 : iArr[iM84153c - 1];
            int i18 = iArr[iM84153c] - i17;
            byte[][] bArr = this.f105892F;
            int i19 = iArr[bArr.length + iM84153c];
            int iMin = Math.min(i16, i18 + i17) - i13;
            int i24 = (i13 - i17) + i19;
            AbstractC25260n.m74060c0(i14, i24, i24 + iMin, bArr[iM84153c], target);
            i14 += iMin;
            i13 += iMin;
            iM84153c++;
        }
    }

    @Override // ne3.C26624l
    /* JADX INFO: renamed from: c */
    public final C26624l mo79252c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f105892F;
        int length = bArr.length;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int[] iArr = this.f105893G;
            int i15 = iArr[length + i13];
            int i16 = iArr[i13];
            messageDigest.update(bArr[i13], i15, i16 - i14);
            i13++;
            i14 = i16;
        }
        byte[] bArrDigest = messageDigest.digest();
        AbstractC22676k.m65747g(bArrDigest);
        return new C26624l(bArrDigest);
    }

    @Override // ne3.C26624l
    /* JADX INFO: renamed from: d */
    public final int mo79253d() {
        return this.f105893G[this.f105892F.length - 1];
    }

    @Override // ne3.C26624l
    /* JADX INFO: renamed from: e */
    public final String mo79254e() {
        return m79270u().mo79254e();
    }

    @Override // ne3.C26624l
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26624l) {
            C26624l c26624l = (C26624l) obj;
            if (c26624l.mo79253d() == mo79253d() && mo79260m(0, mo79253d(), c26624l)) {
                return true;
            }
        }
        return false;
    }

    @Override // ne3.C26624l
    /* JADX INFO: renamed from: f */
    public final int mo79255f(int i13, byte[] other) {
        AbstractC22676k.m65750j(other, "other");
        return m79270u().mo79255f(i13, other);
    }

    @Override // ne3.C26624l
    /* JADX INFO: renamed from: h */
    public final byte[] mo79256h() {
        return mo79264r();
    }

    @Override // ne3.C26624l
    public final int hashCode() {
        int i13 = this.f105884x;
        if (i13 != 0) {
            return i13;
        }
        byte[][] bArr = this.f105892F;
        int length = bArr.length;
        int i14 = 0;
        int i15 = 1;
        int i16 = 0;
        while (i14 < length) {
            int[] iArr = this.f105893G;
            int i17 = iArr[length + i14];
            int i18 = iArr[i14];
            byte[] bArr2 = bArr[i14];
            int i19 = (i18 - i16) + i17;
            while (i17 < i19) {
                i15 = (i15 * 31) + bArr2[i17];
                i17++;
            }
            i14++;
            i16 = i18;
        }
        this.f105884x = i15;
        return i15;
    }

    @Override // ne3.C26624l
    /* JADX INFO: renamed from: i */
    public final byte mo79257i(int i13) {
        byte[][] bArr = this.f105892F;
        int length = bArr.length - 1;
        int[] iArr = this.f105893G;
        AbstractC26604b.m79160e(iArr[length], i13, 1L);
        int iM84153c = AbstractC27882b.m84153c(this, i13);
        return bArr[iM84153c][(i13 - (iM84153c == 0 ? 0 : iArr[iM84153c - 1])) + iArr[bArr.length + iM84153c]];
    }

    @Override // ne3.C26624l
    /* JADX INFO: renamed from: j */
    public final int mo79258j(byte[] other) {
        AbstractC22676k.m65750j(other, "other");
        return m79270u().mo79258j(other);
    }

    @Override // ne3.C26624l
    /* JADX INFO: renamed from: l */
    public final boolean mo79259l(int i13, int i14, int i15, byte[] other) {
        AbstractC22676k.m65750j(other, "other");
        if (i13 < 0 || i13 > mo79253d() - i15 || i14 < 0 || i14 > other.length - i15) {
            return false;
        }
        int i16 = i15 + i13;
        int iM84153c = AbstractC27882b.m84153c(this, i13);
        while (i13 < i16) {
            int[] iArr = this.f105893G;
            int i17 = iM84153c == 0 ? 0 : iArr[iM84153c - 1];
            int i18 = iArr[iM84153c] - i17;
            byte[][] bArr = this.f105892F;
            int i19 = iArr[bArr.length + iM84153c];
            int iMin = Math.min(i16, i18 + i17) - i13;
            if (!AbstractC26604b.m79156a((i13 - i17) + i19, i14, iMin, bArr[iM84153c], other)) {
                return false;
            }
            i14 += iMin;
            i13 += iMin;
            iM84153c++;
        }
        return true;
    }

    @Override // ne3.C26624l
    /* JADX INFO: renamed from: m */
    public final boolean mo79260m(int i13, int i14, C26624l other) {
        AbstractC22676k.m65750j(other, "other");
        if (i13 >= 0 && i13 <= mo79253d() - i14) {
            int i15 = i14 + i13;
            int iM84153c = AbstractC27882b.m84153c(this, i13);
            int i16 = 0;
            while (i13 < i15) {
                int[] iArr = this.f105893G;
                int i17 = iM84153c == 0 ? 0 : iArr[iM84153c - 1];
                int i18 = iArr[iM84153c] - i17;
                byte[][] bArr = this.f105892F;
                int i19 = iArr[bArr.length + iM84153c];
                int iMin = Math.min(i15, i18 + i17) - i13;
                if (other.mo79259l(i16, (i13 - i17) + i19, iMin, bArr[iM84153c])) {
                    i16 += iMin;
                    i13 += iMin;
                    iM84153c++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // ne3.C26624l
    /* JADX INFO: renamed from: n */
    public final String mo79261n(Charset charset) {
        AbstractC22676k.m65750j(charset, "charset");
        return m79270u().mo79261n(charset);
    }

    @Override // ne3.C26624l
    /* JADX INFO: renamed from: o */
    public final C26624l mo79262o(int i13, int i14) {
        if (i14 == -1234567890) {
            i14 = mo79253d();
        }
        if (i13 < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8296i(i13, "beginIndex=", " < 0").toString());
        }
        if (i14 > mo79253d()) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(i14, "endIndex=", " > length(");
            sbM30466t.append(mo79253d());
            sbM30466t.append(')');
            throw new IllegalArgumentException(sbM30466t.toString().toString());
        }
        int i15 = i14 - i13;
        if (i15 < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8294g(i14, i13, "endIndex=", " < beginIndex=").toString());
        }
        if (i13 == 0 && i14 == mo79253d()) {
            return this;
        }
        if (i13 == i14) {
            return C26624l.f105881E;
        }
        int iM84153c = AbstractC27882b.m84153c(this, i13);
        int iM84153c2 = AbstractC27882b.m84153c(this, i14 - 1);
        byte[][] bArr = this.f105892F;
        byte[][] bArr2 = (byte[][]) AbstractC25260n.m74072m0(iM84153c, iM84153c2 + 1, bArr);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f105893G;
        if (iM84153c <= iM84153c2) {
            int i16 = iM84153c;
            int i17 = 0;
            while (true) {
                iArr[i17] = Math.min(iArr2[i16] - i13, i15);
                int i18 = i17 + 1;
                iArr[i17 + bArr2.length] = iArr2[bArr.length + i16];
                if (i16 == iM84153c2) {
                    break;
                }
                i16++;
                i17 = i18;
            }
        }
        int i19 = iM84153c != 0 ? iArr2[iM84153c - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i13 - i19) + iArr[length];
        return new C26627m0(bArr2, iArr);
    }

    @Override // ne3.C26624l
    /* JADX INFO: renamed from: q */
    public final C26624l mo79263q() {
        return m79270u().mo79263q();
    }

    @Override // ne3.C26624l
    /* JADX INFO: renamed from: r */
    public final byte[] mo79264r() {
        byte[] bArr = new byte[mo79253d()];
        byte[][] bArr2 = this.f105892F;
        int length = bArr2.length;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < length) {
            int[] iArr = this.f105893G;
            int i16 = iArr[length + i13];
            int i17 = iArr[i13];
            int i18 = i17 - i14;
            AbstractC25260n.m74060c0(i15, i16, i16 + i18, bArr2[i13], bArr);
            i15 += i18;
            i13++;
            i14 = i17;
        }
        return bArr;
    }

    @Override // ne3.C26624l
    /* JADX INFO: renamed from: t */
    public final void mo79266t(C26616h c26616h, int i13) {
        int iM84153c = AbstractC27882b.m84153c(this, 0);
        int i14 = 0;
        while (i14 < i13) {
            int[] iArr = this.f105893G;
            int i15 = iM84153c == 0 ? 0 : iArr[iM84153c - 1];
            int i16 = iArr[iM84153c] - i15;
            byte[][] bArr = this.f105892F;
            int i17 = iArr[bArr.length + iM84153c];
            int iMin = Math.min(i13, i16 + i15) - i14;
            int i18 = (i14 - i15) + i17;
            C26623k0 c26623k0 = new C26623k0(bArr[iM84153c], i18, i18 + iMin, true, false);
            C26623k0 c26623k1 = c26616h.f105865w;
            if (c26623k1 == null) {
                c26623k0.f105880g = c26623k0;
                c26623k0.f105879f = c26623k0;
                c26616h.f105865w = c26623k0;
            } else {
                C26623k0 c26623k2 = c26623k1.f105880g;
                AbstractC22676k.m65747g(c26623k2);
                c26623k2.m79244b(c26623k0);
            }
            i14 += iMin;
            iM84153c++;
        }
        c26616h.f105866x += (long) i13;
    }

    @Override // ne3.C26624l
    public final String toString() {
        return m79270u().toString();
    }

    /* JADX INFO: renamed from: u */
    public final C26624l m79270u() {
        return new C26624l(mo79264r());
    }
}
