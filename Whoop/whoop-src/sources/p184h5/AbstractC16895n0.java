package p184h5;

import android.view.View;
import android.view.WindowInsetsController;

/* JADX INFO: renamed from: h5.n0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16895n0 {
    /* JADX INFO: renamed from: a */
    public static CharSequence m47565a(View view) {
        return view.getStateDescription();
    }

    /* JADX INFO: renamed from: b */
    public static C16920v1 m47566b(View view) {
        WindowInsetsController windowInsetsController = view.getWindowInsetsController();
        if (windowInsetsController != null) {
            return new C16920v1(windowInsetsController);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static void m47567c(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
