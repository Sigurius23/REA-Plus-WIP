package p184h5;

import android.view.View;
import java.lang.ref.WeakReference;
import p032bc.C2967p;

/* JADX INFO: renamed from: h5.t0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16913t0 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f64874a;

    public C16913t0(View view) {
        this.f64874a = new WeakReference(view);
    }

    /* JADX INFO: renamed from: a */
    public final void m47607a(float f13) {
        View view = (View) this.f64874a.get();
        if (view != null) {
            view.animate().alpha(f13);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m47608b() {
        View view = (View) this.f64874a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m47609c(long j7) {
        View view = (View) this.f64874a.get();
        if (view != null) {
            view.animate().setDuration(j7);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m47610d(InterfaceC16916u0 interfaceC16916u0) {
        View view = (View) this.f64874a.get();
        if (view != null) {
            if (interfaceC16916u0 != null) {
                view.animate().setListener(new C2967p(view, 1, interfaceC16916u0));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m47611e(float f13) {
        View view = (View) this.f64874a.get();
        if (view != null) {
            view.animate().translationY(f13);
        }
    }
}
