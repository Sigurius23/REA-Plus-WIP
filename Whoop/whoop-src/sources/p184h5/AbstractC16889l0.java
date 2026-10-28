package p184h5;

import android.view.View;

/* JADX INFO: renamed from: h5.l0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16889l0 {
    /* JADX INFO: renamed from: a */
    public static CharSequence m47551a(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m47552b(View view) {
        return view.isAccessibilityHeading();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m47553c(View view) {
        return view.isScreenReaderFocusable();
    }

    /* JADX INFO: renamed from: d */
    public static void m47554d(View view, boolean z4) {
        view.setAccessibilityHeading(z4);
    }

    /* JADX INFO: renamed from: e */
    public static void m47555e(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    /* JADX INFO: renamed from: f */
    public static void m47556f(View view, boolean z4) {
        view.setScreenReaderFocusable(z4);
    }
}
