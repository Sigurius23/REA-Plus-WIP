package p184h5;

import android.view.View;
import android.view.WindowInsets;
import p543v4.C35643b;

/* JADX INFO: renamed from: h5.n1 */
/* JADX INFO: loaded from: classes.dex */
public final class C16896n1 extends C16890l1 {

    /* JADX INFO: renamed from: q */
    public static final C16905q1 f64848q = C16905q1.m47596h(null, WindowInsets.CONSUMED);

    public C16896n1(C16905q1 c16905q1, WindowInsets windowInsets) {
        super(c16905q1, windowInsets);
    }

    @Override // p184h5.C16881i1, p184h5.C16899o1
    /* JADX INFO: renamed from: d */
    public final void mo47528d(View view) {
    }

    @Override // p184h5.C16881i1, p184h5.C16899o1
    /* JADX INFO: renamed from: g */
    public C35643b mo47530g(int i13) {
        return C35643b.m112841c(this.f64829c.getInsets(AbstractC16902p1.m47587a(i13)));
    }

    @Override // p184h5.C16881i1, p184h5.C16899o1
    /* JADX INFO: renamed from: h */
    public C35643b mo47531h(int i13) {
        return C35643b.m112841c(this.f64829c.getInsetsIgnoringVisibility(AbstractC16902p1.m47587a(i13)));
    }

    @Override // p184h5.C16881i1, p184h5.C16899o1
    /* JADX INFO: renamed from: q */
    public boolean mo47535q(int i13) {
        return this.f64829c.isVisible(AbstractC16902p1.m47587a(i13));
    }

    public C16896n1(C16905q1 c16905q1, C16896n1 c16896n1) {
        super(c16905q1, c16896n1);
    }
}
