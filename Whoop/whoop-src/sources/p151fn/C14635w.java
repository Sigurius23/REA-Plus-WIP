package p151fn;

import ed3.C13117a;
import p309lo.AbstractC24567y;
import p309lo.C24566x;
import p550vd.AbstractC35902e;
import p588wm.C37361c;
import p588wm.InterfaceC37362d;
import p588wm.InterfaceC37368j;

/* JADX INFO: renamed from: fn.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C14635w implements InterfaceC37362d {

    /* JADX INFO: renamed from: w */
    public final C24566x f54024w;

    /* JADX INFO: renamed from: x */
    public final C13117a f54025x = new C13117a();

    /* JADX INFO: renamed from: y */
    public final int f54026y;

    public C14635w(int i13, C24566x c24566x) {
        this.f54026y = i13;
        this.f54024w = c24566x;
    }

    @Override // p588wm.InterfaceC37362d
    /* JADX INFO: renamed from: d */
    public final void mo30742d() {
        byte[] bArr = AbstractC24567y.f95880f;
        C13117a c13117a = this.f54025x;
        c13117a.getClass();
        c13117a.m36687I(bArr.length, bArr);
    }

    @Override // p588wm.InterfaceC37362d
    /* JADX INFO: renamed from: h */
    public final C37361c mo30743h(InterfaceC37368j interfaceC37368j, long j7) {
        long j13;
        long position = interfaceC37368j.getPosition();
        int iMin = (int) Math.min(112800, interfaceC37368j.getLength() - position);
        C13117a c13117a = this.f54025x;
        c13117a.m36686H(iMin);
        interfaceC37368j.mo3103p(c13117a.f45381a, 0, iMin);
        int i13 = c13117a.f45383c;
        long j14 = -1;
        long j15 = -1;
        long j16 = -9223372036854775807L;
        while (true) {
            if (c13117a.m36692a() < 188) {
                j13 = -9223372036854775807L;
                break;
            }
            byte[] bArr = c13117a.f45381a;
            int i14 = c13117a.f45382b;
            while (true) {
                if (i14 >= i13) {
                    j13 = -9223372036854775807L;
                    break;
                }
                j13 = -9223372036854775807L;
                if (bArr[i14] == 71) {
                    break;
                }
                i14++;
            }
            int i15 = i14 + 188;
            if (i15 > i13) {
                break;
            }
            long jM113943N = AbstractC35902e.m113943N(c13117a, i14, this.f54026y);
            if (jM113943N != j13) {
                long jM71660b = this.f54024w.m71660b(jM113943N);
                if (jM71660b > j7) {
                    return j16 == j13 ? new C37361c(-1, jM71660b, position) : new C37361c(0, -9223372036854775807L, position + j15);
                }
                if (100000 + jM71660b > j7) {
                    return new C37361c(0, -9223372036854775807L, position + ((long) i14));
                }
                j16 = jM71660b;
                j15 = i14;
            }
            c13117a.m36689K(i15);
            j14 = i15;
        }
        return j16 != j13 ? new C37361c(-2, j16, position + j14) : C37361c.f159836d;
    }
}
