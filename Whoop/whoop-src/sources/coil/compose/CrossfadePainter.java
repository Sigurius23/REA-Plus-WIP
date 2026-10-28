package coil.compose;

import android.os.SystemClock;
import e93.AbstractC12889b;
import p014aj.C0929d;
import p181h2.C16620e;
import p208i2.AbstractC17921y;
import p249jc.AbstractC21598x;
import p270k2.InterfaceC22131e;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28617g1;
import p390p1.C28621h1;
import p390p1.C28633k1;
import p635y2.AbstractC39125q1;
import p635y2.InterfaceC39105k;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Lcoil/compose/CrossfadePainter;", "Ln2/a;", "coil-compose-base_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class CrossfadePainter extends AbstractC26165a {

    /* JADX INFO: renamed from: E */
    public AbstractC26165a f20234E;

    /* JADX INFO: renamed from: F */
    public final AbstractC26165a f20235F;

    /* JADX INFO: renamed from: G */
    public final InterfaceC39105k f20236G;

    /* JADX INFO: renamed from: H */
    public final int f20237H;

    /* JADX INFO: renamed from: I */
    public final boolean f20238I;

    /* JADX INFO: renamed from: L */
    public boolean f20241L;

    /* JADX INFO: renamed from: J */
    public final C28621h1 f20239J = new C28621h1(0);

    /* JADX INFO: renamed from: K */
    public long f20240K = -1;

    /* JADX INFO: renamed from: M */
    public final C28617g1 f20242M = new C28617g1(1.0f);

    /* JADX INFO: renamed from: N */
    public final C28633k1 f20243N = AbstractC28683x.m87272z(null);

    public CrossfadePainter(AbstractC26165a abstractC26165a, AbstractC26165a abstractC26165a2, InterfaceC39105k interfaceC39105k, int i13, boolean z4) {
        this.f20234E = abstractC26165a;
        this.f20235F = abstractC26165a2;
        this.f20236G = interfaceC39105k;
        this.f20237H = i13;
        this.f20238I = z4;
    }

    @Override // p331n2.AbstractC26165a
    /* JADX INFO: renamed from: b */
    public final void mo3489b(float f13) {
        this.f20242M.m87023y(f13);
    }

    @Override // p331n2.AbstractC26165a
    /* JADX INFO: renamed from: e */
    public final void mo3490e(AbstractC17921y abstractC17921y) {
        this.f20243N.setValue(abstractC17921y);
    }

    @Override // p331n2.AbstractC26165a
    /* JADX INFO: renamed from: h */
    public final long getF4822H() {
        AbstractC26165a abstractC26165a = this.f20234E;
        long f4822h = abstractC26165a != null ? abstractC26165a.getF4822H() : 0L;
        AbstractC26165a abstractC26165a2 = this.f20235F;
        long f4822h2 = abstractC26165a2 != null ? abstractC26165a2.getF4822H() : 0L;
        boolean z4 = f4822h != 9205357640488583168L;
        boolean z13 = f4822h2 != 9205357640488583168L;
        if (z4 && z13) {
            return AbstractC21598x.m60672b(Math.max(C16620e.m47213e(f4822h), C16620e.m47213e(f4822h2)), Math.max(C16620e.m47211c(f4822h), C16620e.m47211c(f4822h2)));
        }
        return 9205357640488583168L;
    }

    @Override // p331n2.AbstractC26165a
    /* JADX INFO: renamed from: i */
    public final void mo3492i(InterfaceC22131e interfaceC22131e) {
        boolean z4 = this.f20241L;
        C28617g1 c28617g1 = this.f20242M;
        AbstractC26165a abstractC26165a = this.f20235F;
        if (z4) {
            m15512j(interfaceC22131e, abstractC26165a, c28617g1.m87022x());
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f20240K == -1) {
            this.f20240K = jUptimeMillis;
        }
        float f13 = (jUptimeMillis - this.f20240K) / this.f20237H;
        float fM87022x = c28617g1.m87022x() * AbstractC12889b.m36283m(f13, 0.0f, 1.0f);
        float fM87022x2 = this.f20238I ? c28617g1.m87022x() - fM87022x : c28617g1.m87022x();
        this.f20241L = f13 >= 1.0f;
        m15512j(interfaceC22131e, this.f20234E, fM87022x2);
        m15512j(interfaceC22131e, abstractC26165a, fM87022x);
        if (this.f20241L) {
            this.f20234E = null;
        } else {
            C28621h1 c28621h1 = this.f20239J;
            c28621h1.m87025y(c28621h1.m87024x() + 1);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m15512j(InterfaceC22131e interfaceC22131e, AbstractC26165a abstractC26165a, float f13) {
        if (abstractC26165a == null || f13 <= 0.0f) {
            return;
        }
        long jMo731d = interfaceC22131e.mo731d();
        long f4822h = abstractC26165a.getF4822H();
        long jM124663i = (f4822h == 9205357640488583168L || C16620e.m47214f(f4822h) || jMo731d == 9205357640488583168L || C16620e.m47214f(jMo731d)) ? jMo731d : AbstractC39125q1.m124663i(f4822h, this.f20236G.mo124615a(f4822h, jMo731d));
        C28633k1 c28633k1 = this.f20243N;
        if (jMo731d == 9205357640488583168L || C16620e.m47214f(jMo731d)) {
            abstractC26165a.m77712g(interfaceC22131e, jM124663i, f13, (AbstractC17921y) c28633k1.getValue());
            return;
        }
        float f14 = 2;
        float fM47213e = (C16620e.m47213e(jMo731d) - C16620e.m47213e(jM124663i)) / f14;
        float fM47211c = (C16620e.m47211c(jMo731d) - C16620e.m47211c(jM124663i)) / f14;
        ((C0929d) interfaceC22131e.mo744t0().f812x).m2355o(fM47213e, fM47211c, fM47213e, fM47211c);
        abstractC26165a.m77712g(interfaceC22131e, jM124663i, f13, (AbstractC17921y) c28633k1.getValue());
        C0929d c0929d = (C0929d) interfaceC22131e.mo744t0().f812x;
        float f15 = -fM47213e;
        float f16 = -fM47211c;
        c0929d.m2355o(f15, f16, f15, f16);
    }
}
