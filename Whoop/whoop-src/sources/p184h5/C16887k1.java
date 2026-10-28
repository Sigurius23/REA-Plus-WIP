package p184h5;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: renamed from: h5.k1 */
/* JADX INFO: loaded from: classes.dex */
public class C16887k1 extends C16884j1 {
    public C16887k1(C16905q1 c16905q1, WindowInsets windowInsets) {
        super(c16905q1, windowInsets);
    }

    @Override // p184h5.C16899o1
    /* JADX INFO: renamed from: a */
    public C16905q1 mo47549a() {
        return C16905q1.m47596h(null, this.f64829c.consumeDisplayCutout());
    }

    @Override // p184h5.C16881i1, p184h5.C16899o1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16887k1)) {
            return false;
        }
        C16887k1 c16887k1 = (C16887k1) obj;
        return Objects.equals(this.f64829c, c16887k1.f64829c) && Objects.equals(this.f64833g, c16887k1.f64833g);
    }

    @Override // p184h5.C16899o1
    /* JADX INFO: renamed from: f */
    public C16876h mo47550f() {
        DisplayCutout displayCutout = this.f64829c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C16876h(displayCutout);
    }

    @Override // p184h5.C16899o1
    public int hashCode() {
        return this.f64829c.hashCode();
    }

    public C16887k1(C16905q1 c16905q1, C16887k1 c16887k1) {
        super(c16905q1, c16887k1);
    }
}
