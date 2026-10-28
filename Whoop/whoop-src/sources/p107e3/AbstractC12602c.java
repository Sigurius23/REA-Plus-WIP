package p107e3;

import android.content.Context;
import android.graphics.Insets;
import android.hardware.display.DisplayManager;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: e3.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12602c {
    /* JADX INFO: renamed from: a */
    public static Context m35319a(Context context, String str) {
        return context.createAttributionContext(str);
    }

    /* JADX INFO: renamed from: b */
    public static String m35320b(Context context) {
        return context.getAttributionTag();
    }

    /* JADX INFO: renamed from: c */
    public static Display m35321c(Context context) {
        try {
            return context.getDisplay();
        } catch (UnsupportedOperationException unused) {
            Log.w("ContextCompat", "The context:" + context + " is not associated with any display. Return a fallback display instead.");
            return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static CharSequence m35322d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    /* JADX INFO: renamed from: e */
    public static Insets m35323e(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    /* JADX INFO: renamed from: f */
    public static void m35324f(Window window, boolean z4) {
        window.setDecorFitsSystemWindows(z4);
    }

    /* JADX INFO: renamed from: g */
    public static void m35325g(View view) {
        view.setImportantForContentCapture(1);
    }

    /* JADX INFO: renamed from: h */
    public static void m35326h(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
