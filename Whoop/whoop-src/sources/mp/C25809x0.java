package mp;

import java.util.Arrays;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: mp.x0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C25809x0 extends AbstractC25755b1 {

    /* JADX INFO: renamed from: w */
    public final C25801t0 f101551w;

    public C25809x0(C25801t0 c25801t0) {
        this.f101551w = c25801t0;
    }

    @Override // mp.AbstractC25755b1
    /* JADX INFO: renamed from: a */
    public final int mo75988a() {
        return AbstractC25755b1.m76004d((byte) 64);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        AbstractC25755b1 abstractC25755b1 = (AbstractC25755b1) obj;
        int iMo75988a = abstractC25755b1.mo75988a();
        int iM76004d = AbstractC25755b1.m76004d((byte) 64);
        if (iM76004d != iMo75988a) {
            return iM76004d - abstractC25755b1.mo75988a();
        }
        C25801t0 c25801t0 = ((C25809x0) abstractC25755b1).f101551w;
        C25801t0 c25801t1 = this.f101551w;
        byte[] bArr = c25801t1.f101541x;
        int length = bArr.length;
        byte[] bArr2 = c25801t0.f101541x;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return AbstractC25795q0.f101528a.compare(c25801t1.m76050m(), c25801t0.m76050m());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C25809x0.class == obj.getClass()) {
            return this.f101551w.equals(((C25809x0) obj).f101551w);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(AbstractC25755b1.m76004d((byte) 64)), this.f101551w});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        C25781k0 c25781k0;
        int i13;
        boolean z4;
        C25784l0 c25784l0 = C25789n0.f101516d;
        C25789n0 c25784l1 = c25784l0.f101519c;
        if (c25784l1 == null) {
            C25781k0 c25781k1 = c25784l0.f101517a;
            char[] cArr = c25781k1.f101501b;
            int i14 = 0;
            while (true) {
                if (i14 >= cArr.length) {
                    c25781k0 = c25781k1;
                    break;
                }
                char c3 = cArr[i14];
                if (c3 >= 'a' && c3 <= 'z') {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= cArr.length) {
                            z4 = false;
                            break;
                        }
                        char c7 = cArr[i15];
                        if (c7 >= 'A' && c7 <= 'Z') {
                            z4 = true;
                            break;
                        }
                        i15++;
                    }
                    if (!z4) {
                        char[] cArr2 = new char[cArr.length];
                        for (int i16 = 0; i16 < cArr.length; i16++) {
                            char c14 = cArr[i16];
                            if (c14 >= 97 && c14 <= 122) {
                                c14 ^= 32;
                            }
                            cArr2[i16] = (char) c14;
                        }
                        c25781k0 = new C25781k0(c25781k1.f101500a.concat(".upperCase()"), cArr2);
                        byte[] bArr = c25781k0.f101506g;
                        if (!c25781k1.f101507h || c25781k0.f101507h) {
                            break;
                            break;
                        }
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        for (i13 = 65; i13 <= 90; i13++) {
                            int i17 = i13 | 32;
                            byte b = bArr[i13];
                            byte b6 = bArr[i17];
                            if (b == -1) {
                                bArrCopyOf[i13] = b6;
                            } else {
                                char c15 = (char) i13;
                                char c16 = (char) i17;
                                if (b6 != -1) {
                                    throw new IllegalStateException(AbstractC25753b.m75991c("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c15), Character.valueOf(c16)));
                                }
                                bArrCopyOf[i17] = b;
                            }
                        }
                        c25781k0 = new C25781k0(c25781k0.f101500a.concat(".ignoreCase()"), c25781k0.f101501b, bArrCopyOf, true);
                        break;
                    }
                    throw new IllegalStateException("Cannot call upperCase() on a mixed-case alphabet");
                }
                i14++;
            }
            c25784l1 = c25781k0 == c25781k1 ? c25784l0 : new C25784l0(c25781k0);
            c25784l0.f101519c = c25784l1;
        }
        byte[] bArrM76050m = this.f101551w.m76050m();
        return AbstractC11895b.m31996o("h'", c25784l1.m76028c(bArrM76050m.length, bArrM76050m), "'");
    }
}
