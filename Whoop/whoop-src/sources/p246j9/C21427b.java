package p246j9;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import ca.C4358a;
import java.util.ArrayList;
import p012ab.C0680g0;
import p031b9.AbstractC2829f;
import p031b9.C2830f0;
import p031b9.SurfaceHolderCallbackC2821c0;
import p299l9.C23488c0;
import p516u8.C34581a0;
import p516u8.C34585c0;
import p516u8.C34610p;
import p516u8.C34630z;
import p516u8.InterfaceC34583b0;
import p550vd.AbstractC35903f;
import p607x8.AbstractC38065t;
import p607x8.C38054i;
import qg3.C30352d;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: j9.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C21427b extends AbstractC2829f implements Handler.Callback {

    /* JADX INFO: renamed from: R */
    public final C21426a f82245R;

    /* JADX INFO: renamed from: S */
    public final SurfaceHolderCallbackC2821c0 f82246S;

    /* JADX INFO: renamed from: T */
    public final Handler f82247T;

    /* JADX INFO: renamed from: U */
    public final C4358a f82248U;

    /* JADX INFO: renamed from: V */
    public AbstractC35903f f82249V;

    /* JADX INFO: renamed from: W */
    public boolean f82250W;

    /* JADX INFO: renamed from: X */
    public boolean f82251X;

    /* JADX INFO: renamed from: Y */
    public long f82252Y;

    /* JADX INFO: renamed from: Z */
    public C34585c0 f82253Z;

    /* JADX INFO: renamed from: a0 */
    public long f82254a0;

    public C21427b(SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c0, Looper looper) {
        super(5);
        this.f82246S = surfaceHolderCallbackC2821c0;
        this.f82247T = looper == null ? null : new Handler(looper, this);
        this.f82245R = C21426a.f82244a;
        this.f82248U = new C4358a(1);
        this.f82254a0 = -9223372036854775807L;
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: A */
    public final int mo8057A(C34610p c34610p) {
        if (this.f82245R.m60305b(c34610p)) {
            return AbstractC2829f.m8055f(c34610p.f145768M == 0 ? 4 : 2, 0, 0, 0);
        }
        return AbstractC2829f.m8055f(0, 0, 0, 0);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    /* JADX INFO: renamed from: C */
    public final void m60306C(C34585c0 c34585c0, ArrayList arrayList) {
        int i13 = 0;
        while (true) {
            InterfaceC34583b0[] interfaceC34583b0Arr = c34585c0.f145640a;
            if (i13 >= interfaceC34583b0Arr.length) {
                return;
            }
            C34610p c34610pMo36297d = interfaceC34583b0Arr[i13].mo36297d();
            if (c34610pMo36297d != null) {
                C21426a c21426a = this.f82245R;
                if (c21426a.m60305b(c34610pMo36297d)) {
                    AbstractC35903f abstractC35903fM60304a = c21426a.m60304a(c34610pMo36297d);
                    byte[] bArrMo36298j = interfaceC34583b0Arr[i13].mo36298j();
                    bArrMo36298j.getClass();
                    C4358a c4358a = this.f82248U;
                    c4358a.mo1506o();
                    c4358a.m1508q(bArrMo36298j.length);
                    c4358a.f2063E.put(bArrMo36298j);
                    c4358a.m1509r();
                    C34585c0 c34585c0M114026m = abstractC35903fM60304a.m114026m(c4358a);
                    if (c34585c0M114026m != null) {
                        m60306C(c34585c0M114026m, arrayList);
                    }
                } else {
                    arrayList.add(interfaceC34583b0Arr[i13]);
                }
            } else {
                arrayList.add(interfaceC34583b0Arr[i13]);
            }
            i13++;
        }
    }

    /* JADX INFO: renamed from: D */
    public final long m60307D(long j7) {
        AbstractC35849g.m113807i(j7 != -9223372036854775807L);
        AbstractC35849g.m113807i(this.f82254a0 != -9223372036854775807L);
        return j7 - this.f82254a0;
    }

    /* JADX INFO: renamed from: E */
    public final void m60308E(C34585c0 c34585c0) {
        SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c0 = this.f82246S;
        C2830f0 c2830f0 = surfaceHolderCallbackC2821c0.f11043w;
        C34581a0 c34581a0 = c2830f0.f11109H0;
        C38054i c38054i = c2830f0.f11118N;
        C34630z c34630zM109362a = c34581a0.m109362a();
        int i13 = 0;
        while (true) {
            InterfaceC34583b0[] interfaceC34583b0Arr = c34585c0.f145640a;
            if (i13 >= interfaceC34583b0Arr.length) {
                break;
            }
            interfaceC34583b0Arr[i13].mo40837a(c34630zM109362a);
            i13++;
        }
        c2830f0.f11109H0 = new C34581a0(c34630zM109362a);
        C34581a0 c34581a0M8093R = c2830f0.m8093R();
        if (!c34581a0M8093R.equals(c2830f0.f11147q0)) {
            c2830f0.f11147q0 = c34581a0M8093R;
            c38054i.m121833c(14, new C0680g0(surfaceHolderCallbackC2821c0, 8));
        }
        c38054i.m121833c(28, new C0680g0(c34585c0, 9));
        c38054i.m121832b();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        m60308E((C34585c0) message.obj);
        return true;
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: j */
    public final String mo8062j() {
        return "MetadataRenderer";
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: l */
    public final boolean mo8064l() {
        return this.f82251X;
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: n */
    public final boolean mo8065n() {
        return true;
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: o */
    public final void mo8066o() {
        this.f82253Z = null;
        this.f82249V = null;
        this.f82254a0 = -9223372036854775807L;
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: q */
    public final void mo8068q(long j7, boolean z4) {
        this.f82253Z = null;
        this.f82250W = false;
        this.f82251X = false;
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: v */
    public final void mo8073v(C34610p[] c34610pArr, long j7, long j13, C23488c0 c23488c0) {
        this.f82249V = this.f82245R.m60304a(c34610pArr[0]);
        C34585c0 c34585c0 = this.f82253Z;
        if (c34585c0 != null) {
            long j14 = c34585c0.f145641b;
            long j15 = (this.f82254a0 + j14) - j13;
            if (j14 != j15) {
                c34585c0 = new C34585c0(j15, c34585c0.f145640a);
            }
            this.f82253Z = c34585c0;
        }
        this.f82254a0 = j13;
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: x */
    public final void mo8075x(long j7, long j13) {
        boolean z4 = true;
        while (z4) {
            if (!this.f82250W && this.f82253Z == null) {
                C4358a c4358a = this.f82248U;
                c4358a.mo1506o();
                C30352d c30352d = this.f11096y;
                c30352d.m92812k();
                int iM8074w = m8074w(c30352d, c4358a, 0);
                if (iM8074w == -4) {
                    if (c4358a.m1496f(4)) {
                        this.f82250W = true;
                    } else if (c4358a.f2065G >= this.f11088L) {
                        c4358a.f17631J = this.f82252Y;
                        c4358a.m1509r();
                        AbstractC35903f abstractC35903f = this.f82249V;
                        int i13 = AbstractC38065t.f163031a;
                        C34585c0 c34585c0M114026m = abstractC35903f.m114026m(c4358a);
                        if (c34585c0M114026m != null) {
                            ArrayList arrayList = new ArrayList(c34585c0M114026m.f145640a.length);
                            m60306C(c34585c0M114026m, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f82253Z = new C34585c0(m60307D(c4358a.f2065G), (InterfaceC34583b0[]) arrayList.toArray(new InterfaceC34583b0[0]));
                            }
                        }
                    }
                } else if (iM8074w == -5) {
                    C34610p c34610p = (C34610p) c30352d.f124536y;
                    c34610p.getClass();
                    this.f82252Y = c34610p.f145788s;
                }
            }
            C34585c0 c34585c0 = this.f82253Z;
            if (c34585c0 == null || c34585c0.f145641b > m60307D(j7)) {
                z4 = false;
            } else {
                C34585c0 c34585c1 = this.f82253Z;
                Handler handler = this.f82247T;
                if (handler != null) {
                    handler.obtainMessage(1, c34585c1).sendToTarget();
                } else {
                    m60308E(c34585c1);
                }
                this.f82253Z = null;
                z4 = true;
            }
            if (this.f82250W && this.f82253Z == null) {
                this.f82251X = true;
            }
        }
    }
}
