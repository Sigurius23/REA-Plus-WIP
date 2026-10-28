package p329n0;

import p004a2.AbstractC0152a;
import p026b2.InterfaceC2300f;
import p026b2.InterfaceC2301g;
import p389p0.C28515d0;
import p389p0.InterfaceC28518e0;
import p636y3.AbstractC39170b;
import p636y3.C39169a;

/* JADX INFO: renamed from: n0.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C26058k extends AbstractC0152a {

    /* JADX INFO: renamed from: E */
    public final long f103138E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ boolean f103139F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C28515d0 f103140G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f103141H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ int f103142I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ InterfaceC2300f f103143J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ InterfaceC2301g f103144K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ int f103145L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ int f103146M;

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ long f103147N;

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ C26068u f103148O;

    /* JADX INFO: renamed from: y */
    public final C26056i f103149y;

    /* JADX INFO: renamed from: z */
    public final C28515d0 f103150z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26058k(long j7, boolean z4, C26056i c26056i, C28515d0 c28515d0, int i13, int i14, InterfaceC2300f interfaceC2300f, InterfaceC2301g interfaceC2301g, int i15, int i16, long j13, C26068u c26068u) {
        super(4);
        this.f103139F = z4;
        this.f103140G = c28515d0;
        this.f103141H = i13;
        this.f103142I = i14;
        this.f103143J = interfaceC2300f;
        this.f103144K = interfaceC2301g;
        this.f103145L = i15;
        this.f103146M = i16;
        this.f103147N = j13;
        this.f103148O = c26068u;
        this.f103149y = c26056i;
        this.f103150z = c28515d0;
        this.f103138E = AbstractC39170b.m124770b(z4 ? C39169a.m124765i(j7) : Integer.MAX_VALUE, z4 ? Integer.MAX_VALUE : C39169a.m124764h(j7), 5);
    }

    /* JADX INFO: renamed from: Q */
    public final C26062o m77534Q(int i13, long j7) {
        C26056i c26056i = this.f103149y;
        Object objMo77532c = c26056i.mo77532c(i13);
        Object objM86887l = c26056i.f103131b.m86887l(i13);
        return new C26062o(i13, m400y(this.f103150z, i13, j7), this.f103139F, this.f103143J, this.f103144K, this.f103140G.f115413x.getLayoutDirection(), this.f103145L, this.f103146M, i13 == this.f103141H + (-1) ? 0 : this.f103142I, this.f103147N, objMo77532c, objM86887l, this.f103148O.f103231n, j7);
    }

    @Override // p004a2.AbstractC0152a
    /* JADX INFO: renamed from: w */
    public final InterfaceC28518e0 mo398w(int i13, int i14, long j7, int i15) {
        return m77534Q(i13, j7);
    }
}
