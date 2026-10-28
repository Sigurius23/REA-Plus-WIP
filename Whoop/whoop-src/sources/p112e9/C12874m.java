package p112e9;

import p010a9.C0580e;
import p113ea.C12891b;
import p141f9.C14265g;
import p299l9.InterfaceC23540z0;
import p516u8.C34610p;
import p607x8.AbstractC38065t;
import qg3.C30352d;

/* JADX INFO: renamed from: e9.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C12874m implements InterfaceC23540z0 {

    /* JADX INFO: renamed from: E */
    public C14265g f44311E;

    /* JADX INFO: renamed from: F */
    public boolean f44312F;

    /* JADX INFO: renamed from: G */
    public int f44313G;

    /* JADX INFO: renamed from: w */
    public final C34610p f44315w;

    /* JADX INFO: renamed from: y */
    public long[] f44317y;

    /* JADX INFO: renamed from: z */
    public boolean f44318z;

    /* JADX INFO: renamed from: x */
    public final C12891b f44316x = new C12891b(0);

    /* JADX INFO: renamed from: H */
    public long f44314H = -9223372036854775807L;

    public C12874m(C14265g c14265g, C34610p c34610p, boolean z4) {
        this.f44315w = c34610p;
        this.f44311E = c14265g;
        this.f44317y = c14265g.f52091b;
        m36168a(c14265g, z4);
    }

    /* JADX INFO: renamed from: a */
    public final void m36168a(C14265g c14265g, boolean z4) {
        int i13 = this.f44313G;
        long j7 = -9223372036854775807L;
        long j13 = i13 == 0 ? -9223372036854775807L : this.f44317y[i13 - 1];
        this.f44318z = z4;
        this.f44311E = c14265g;
        long[] jArr = c14265g.f52091b;
        this.f44317y = jArr;
        long j14 = this.f44314H;
        if (j14 == -9223372036854775807L) {
            if (j13 != -9223372036854775807L) {
                this.f44313G = AbstractC38065t.m121908a(jArr, j13, false);
            }
        } else {
            int iM121908a = AbstractC38065t.m121908a(jArr, j14, true);
            this.f44313G = iM121908a;
            if (this.f44318z && iM121908a == this.f44317y.length) {
                j7 = j14;
            }
            this.f44314H = j7;
        }
    }

    @Override // p299l9.InterfaceC23540z0
    /* JADX INFO: renamed from: b */
    public final boolean mo36169b() {
        return true;
    }

    @Override // p299l9.InterfaceC23540z0
    /* JADX INFO: renamed from: c */
    public final void mo36170c() {
    }

    @Override // p299l9.InterfaceC23540z0
    /* JADX INFO: renamed from: j */
    public final int mo36171j(long j7) {
        int iMax = Math.max(this.f44313G, AbstractC38065t.m121908a(this.f44317y, j7, true));
        int i13 = iMax - this.f44313G;
        this.f44313G = iMax;
        return i13;
    }

    @Override // p299l9.InterfaceC23540z0
    /* JADX INFO: renamed from: l */
    public final int mo36172l(C30352d c30352d, C0580e c0580e, int i13) {
        int i14 = this.f44313G;
        boolean z4 = i14 == this.f44317y.length;
        if (z4 && !this.f44318z) {
            c0580e.f2052x = 4;
            return -4;
        }
        if ((i13 & 2) != 0 || !this.f44312F) {
            c30352d.f124536y = this.f44315w;
            this.f44312F = true;
            return -5;
        }
        if (z4) {
            return -3;
        }
        if ((i13 & 1) == 0) {
            this.f44313G = i14 + 1;
        }
        if ((i13 & 4) == 0) {
            byte[] bArrM36299a = this.f44316x.m36299a(this.f44311E.f52090a[i14]);
            c0580e.m1508q(bArrM36299a.length);
            c0580e.f2063E.put(bArrM36299a);
        }
        c0580e.f2065G = this.f44317y[i14];
        c0580e.f2052x = 1;
        return -4;
    }
}
