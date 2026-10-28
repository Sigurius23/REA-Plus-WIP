package p184h5;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: h5.f0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16871f0 {
    /* JADX INFO: renamed from: a */
    public static WindowInsets m47498a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: b */
    public static WindowInsets m47499b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: c */
    public static void m47500c(View view) {
        view.requestApplyInsets();
    }
}
