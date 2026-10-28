package p184h5;

import android.support.v4.media.session.AbstractC1079m;
import android.view.WindowInsets;
import p081d5.AbstractC11704a;
import p543v4.C35643b;

/* JADX INFO: renamed from: h5.f1 */
/* JADX INFO: loaded from: classes.dex */
public class C16872f1 extends AbstractC16878h1 {

    /* JADX INFO: renamed from: c */
    public final WindowInsets.Builder f64809c;

    public C16872f1() {
        this.f64809c = AbstractC11704a.m31293b();
    }

    @Override // p184h5.AbstractC16878h1
    /* JADX INFO: renamed from: b */
    public C16905q1 mo47495b() {
        m47520a();
        C16905q1 c16905q1M47596h = C16905q1.m47596h(null, this.f64809c.build());
        c16905q1M47596h.f64864a.mo47536r(this.f64823b);
        return c16905q1M47596h;
    }

    @Override // p184h5.AbstractC16878h1
    /* JADX INFO: renamed from: d */
    public void mo47501d(C35643b c35643b) {
        this.f64809c.setMandatorySystemGestureInsets(c35643b.m112842d());
    }

    @Override // p184h5.AbstractC16878h1
    /* JADX INFO: renamed from: e */
    public void mo47496e(C35643b c35643b) {
        this.f64809c.setStableInsets(c35643b.m112842d());
    }

    @Override // p184h5.AbstractC16878h1
    /* JADX INFO: renamed from: f */
    public void mo47502f(C35643b c35643b) {
        this.f64809c.setSystemGestureInsets(c35643b.m112842d());
    }

    @Override // p184h5.AbstractC16878h1
    /* JADX INFO: renamed from: g */
    public void mo47497g(C35643b c35643b) {
        this.f64809c.setSystemWindowInsets(c35643b.m112842d());
    }

    @Override // p184h5.AbstractC16878h1
    /* JADX INFO: renamed from: h */
    public void mo47503h(C35643b c35643b) {
        this.f64809c.setTappableElementInsets(c35643b.m112842d());
    }

    public C16872f1(C16905q1 c16905q1) {
        WindowInsets.Builder builderM31293b;
        super(c16905q1);
        WindowInsets windowInsetsM47602g = c16905q1.m47602g();
        if (windowInsetsM47602g != null) {
            builderM31293b = AbstractC1079m.m3215c(windowInsetsM47602g);
        } else {
            builderM31293b = AbstractC11704a.m31293b();
        }
        this.f64809c = builderM31293b;
    }
}
