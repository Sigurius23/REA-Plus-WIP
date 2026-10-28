package p184h5;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import bi.AbstractC3269g;
import p014aj.C0929d;

/* JADX INFO: renamed from: h5.v1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16920v1 {

    /* JADX INFO: renamed from: a */
    public final AbstractC3269g f64880a;

    public C16920v1(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f64880a = new C16917u1(windowInsetsController, new C0929d(windowInsetsController));
        } else {
            this.f64880a = new C16911s1(windowInsetsController, new C0929d(windowInsetsController));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m47612a(boolean z4) {
        this.f64880a.mo9525X(z4);
    }

    /* JADX INFO: renamed from: b */
    public final void m47613b(boolean z4) {
        this.f64880a.mo9526Y(z4);
    }

    public C16920v1(View view, Window window) {
        C0929d c0929d = new C0929d(view);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 35) {
            this.f64880a = new C16917u1(window, c0929d);
        } else if (i13 >= 30) {
            this.f64880a = new C16911s1(window, c0929d);
        } else {
            this.f64880a = new C16908r1(window, c0929d);
        }
    }
}
