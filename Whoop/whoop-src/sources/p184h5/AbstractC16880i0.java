package p184h5;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: h5.i0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16880i0 {
    /* JADX INFO: renamed from: a */
    public static C16905q1 m47522a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C16905q1 c16905q1M47596h = C16905q1.m47596h(null, rootWindowInsets);
        C16899o1 c16899o1 = c16905q1M47596h.f64864a;
        c16899o1.mo47538t(c16905q1M47596h);
        c16899o1.mo47528d(view.getRootView());
        return c16905q1M47596h;
    }

    /* JADX INFO: renamed from: b */
    public static void m47523b(View view, int i13, int i14) {
        view.setScrollIndicators(i13, i14);
    }
}
