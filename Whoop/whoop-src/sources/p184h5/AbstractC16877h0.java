package p184h5;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.whoop.android.R;

/* JADX INFO: renamed from: h5.h0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16877h0 {
    /* JADX INFO: renamed from: a */
    public static void m47506a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C16905q1 m47507b(View view, C16905q1 c16905q1, Rect rect) {
        WindowInsets windowInsetsM47602g = c16905q1.m47602g();
        if (windowInsetsM47602g != null) {
            return C16905q1.m47596h(view, view.computeSystemWindowInsets(windowInsetsM47602g, rect));
        }
        rect.setEmpty();
        return c16905q1;
    }

    /* JADX INFO: renamed from: c */
    public static ColorStateList m47508c(View view) {
        return view.getBackgroundTintList();
    }

    /* JADX INFO: renamed from: d */
    public static PorterDuff.Mode m47509d(View view) {
        return view.getBackgroundTintMode();
    }

    /* JADX INFO: renamed from: e */
    public static float m47510e(View view) {
        return view.getElevation();
    }

    /* JADX INFO: renamed from: f */
    public static String m47511f(View view) {
        return view.getTransitionName();
    }

    /* JADX INFO: renamed from: g */
    public static float m47512g(View view) {
        return view.getZ();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m47513h(View view) {
        return view.isNestedScrollingEnabled();
    }

    /* JADX INFO: renamed from: i */
    public static void m47514i(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    /* JADX INFO: renamed from: j */
    public static void m47515j(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    /* JADX INFO: renamed from: k */
    public static void m47516k(View view, float f13) {
        view.setElevation(f13);
    }

    /* JADX INFO: renamed from: l */
    public static void m47517l(View view, InterfaceC16915u interfaceC16915u) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, interfaceC16915u);
        }
        if (interfaceC16915u == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC16874g0(view, interfaceC16915u));
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m47518m(View view, String str) {
        view.setTransitionName(str);
    }

    /* JADX INFO: renamed from: n */
    public static void m47519n(View view) {
        view.stopNestedScroll();
    }
}
