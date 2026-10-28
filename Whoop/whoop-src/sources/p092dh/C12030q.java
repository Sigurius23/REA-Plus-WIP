package p092dh;

import ne3.AbstractC26638s;
import ne3.C26616h;
import ne3.C26622k;
import ne3.C26624l;
import ne3.InterfaceC26620j;

/* JADX INFO: renamed from: dh.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C12030q extends AbstractC26638s {

    /* JADX INFO: renamed from: y */
    public static final C26624l f39782y;

    /* JADX INFO: renamed from: x */
    public final C26616h f39783x;

    static {
        C26622k c26622k = C26624l.f105882z;
        f39782y = C26622k.m79240a("0021F904");
    }

    public C12030q(InterfaceC26620j interfaceC26620j) {
        super(interfaceC26620j);
        this.f39783x = new C26616h();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m33153b(long j7) {
        C26616h c26616h = this.f39783x;
        long j13 = c26616h.f105866x;
        if (j13 >= j7) {
            return true;
        }
        long j14 = j7 - j13;
        return super.mo9164h1(c26616h, j14) == j14;
    }

    @Override // ne3.AbstractC26638s, ne3.InterfaceC26633p0
    /* JADX INFO: renamed from: h1 */
    public final long mo9164h1(C26616h c26616h, long j7) {
        long j13;
        long j14;
        m33153b(j7);
        C26616h c26616h2 = this.f39783x;
        long j15 = 0;
        if (c26616h2.f105866x == 0) {
            return j7 == 0 ? 0L : -1L;
        }
        long j16 = 0;
        while (true) {
            long jM79235x = -1;
            while (true) {
                C26624l c26624l = f39782y;
                jM79235x = this.f39783x.m79235x(c26624l.f105883w[0], jM79235x + 1, Long.MAX_VALUE);
                if (jM79235x == -1) {
                    j13 = j15;
                    break;
                }
                j13 = j15;
                if (m33153b(c26624l.f105883w.length) && c26616h2.mo79202d0(jM79235x, c26624l)) {
                    break;
                }
                j15 = j13;
            }
            if (jM79235x == -1) {
                break;
            }
            long jMo9164h1 = c26616h2.mo9164h1(c26616h, jM79235x + ((long) 4));
            if (jMo9164h1 < j13) {
                jMo9164h1 = j13;
            }
            j16 += jMo9164h1;
            if (m33153b(5L) && c26616h2.m79229s(4L) == 0 && (((c26616h2.m79229s(2L) & 255) << 8) | (c26616h2.m79229s(1L) & 255)) < 2) {
                c26616h.m79219m1(c26616h2.m79229s(j13));
                c26616h.m79219m1(10);
                c26616h.m79219m1(0);
                c26616h2.skip(3L);
            }
            j15 = 0;
        }
        if (j16 < j7) {
            long jMo9164h2 = c26616h2.mo9164h1(c26616h, j7 - j16);
            j14 = 0;
            if (jMo9164h2 < 0) {
                jMo9164h2 = 0;
            }
            j16 += jMo9164h2;
        } else {
            j14 = 0;
        }
        if (j16 == j14) {
            return -1L;
        }
        return j16;
    }
}
