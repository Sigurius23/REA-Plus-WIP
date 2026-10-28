package p184h5;

import android.view.WindowInsets;
import p543v4.C35643b;

/* JADX INFO: renamed from: h5.l1 */
/* JADX INFO: loaded from: classes.dex */
public class C16890l1 extends C16887k1 {

    /* JADX INFO: renamed from: n */
    public C35643b f64839n;

    /* JADX INFO: renamed from: o */
    public C35643b f64840o;

    /* JADX INFO: renamed from: p */
    public C35643b f64841p;

    public C16890l1(C16905q1 c16905q1, WindowInsets windowInsets) {
        super(c16905q1, windowInsets);
        this.f64839n = null;
        this.f64840o = null;
        this.f64841p = null;
    }

    @Override // p184h5.C16899o1
    /* JADX INFO: renamed from: i */
    public C35643b mo47557i() {
        if (this.f64840o == null) {
            this.f64840o = C35643b.m112841c(this.f64829c.getMandatorySystemGestureInsets());
        }
        return this.f64840o;
    }

    @Override // p184h5.C16899o1
    /* JADX INFO: renamed from: k */
    public C35643b mo47558k() {
        if (this.f64839n == null) {
            this.f64839n = C35643b.m112841c(this.f64829c.getSystemGestureInsets());
        }
        return this.f64839n;
    }

    @Override // p184h5.C16899o1
    /* JADX INFO: renamed from: m */
    public C35643b mo47559m() {
        if (this.f64841p == null) {
            this.f64841p = C35643b.m112841c(this.f64829c.getTappableElementInsets());
        }
        return this.f64841p;
    }

    @Override // p184h5.C16881i1, p184h5.C16899o1
    /* JADX INFO: renamed from: n */
    public C16905q1 mo47533n(int i13, int i14, int i15, int i16) {
        return C16905q1.m47596h(null, this.f64829c.inset(i13, i14, i15, i16));
    }

    @Override // p184h5.C16884j1, p184h5.C16899o1
    /* JADX INFO: renamed from: u */
    public void mo47546u(C35643b c35643b) {
    }

    public C16890l1(C16905q1 c16905q1, C16890l1 c16890l1) {
        super(c16905q1, c16890l1);
        this.f64839n = null;
        this.f64840o = null;
        this.f64841p = null;
    }
}
