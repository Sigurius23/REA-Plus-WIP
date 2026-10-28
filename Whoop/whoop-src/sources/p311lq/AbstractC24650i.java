package p311lq;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p413q4.AbstractC29957b;

/* JADX INFO: renamed from: lq.i */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC24650i extends AbstractC29957b {

    /* JADX INFO: renamed from: a */
    public C24651j f96415a;

    /* JADX INFO: renamed from: b */
    public int f96416b = 0;

    public AbstractC24650i() {
    }

    /* JADX INFO: renamed from: I */
    public final int m72002I() {
        C24651j c24651j = this.f96415a;
        if (c24651j != null) {
            return c24651j.f96420d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: J */
    public void mo72000J(CoordinatorLayout coordinatorLayout, View view, int i13) {
        coordinatorLayout.m3666q(view, i13);
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: p */
    public boolean mo15668p(CoordinatorLayout coordinatorLayout, View view, int i13) {
        mo72000J(coordinatorLayout, view, i13);
        if (this.f96415a == null) {
            this.f96415a = new C24651j(view);
        }
        C24651j c24651j = this.f96415a;
        View view2 = c24651j.f96417a;
        c24651j.f96418b = view2.getTop();
        c24651j.f96419c = view2.getLeft();
        this.f96415a.m72003a();
        int i14 = this.f96416b;
        if (i14 == 0) {
            return true;
        }
        this.f96415a.m72004b(i14);
        this.f96416b = 0;
        return true;
    }

    public AbstractC24650i(int i13) {
    }
}
