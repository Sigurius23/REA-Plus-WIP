package p184h5;

import android.view.WindowInsets;
import p543v4.C35643b;

/* JADX INFO: renamed from: h5.j1 */
/* JADX INFO: loaded from: classes.dex */
public class C16884j1 extends C16881i1 {

    /* JADX INFO: renamed from: m */
    public C35643b f64834m;

    public C16884j1(C16905q1 c16905q1, WindowInsets windowInsets) {
        super(c16905q1, windowInsets);
        this.f64834m = null;
    }

    @Override // p184h5.C16899o1
    /* JADX INFO: renamed from: b */
    public C16905q1 mo47542b() {
        return C16905q1.m47596h(null, this.f64829c.consumeStableInsets());
    }

    @Override // p184h5.C16899o1
    /* JADX INFO: renamed from: c */
    public C16905q1 mo47543c() {
        return C16905q1.m47596h(null, this.f64829c.consumeSystemWindowInsets());
    }

    @Override // p184h5.C16899o1
    /* JADX INFO: renamed from: j */
    public final C35643b mo47544j() {
        if (this.f64834m == null) {
            WindowInsets windowInsets = this.f64829c;
            this.f64834m = C35643b.m112840b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f64834m;
    }

    @Override // p184h5.C16899o1
    /* JADX INFO: renamed from: o */
    public boolean mo47545o() {
        return this.f64829c.isConsumed();
    }

    @Override // p184h5.C16899o1
    /* JADX INFO: renamed from: u */
    public void mo47546u(C35643b c35643b) {
        this.f64834m = c35643b;
    }

    public C16884j1(C16905q1 c16905q1, C16884j1 c16884j1) {
        super(c16905q1, c16884j1);
        this.f64834m = null;
        this.f64834m = c16884j1.f64834m;
    }
}
