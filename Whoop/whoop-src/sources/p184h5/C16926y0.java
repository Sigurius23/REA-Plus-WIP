package p184h5;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.datastore.preferences.protobuf.AbstractC1230l;
import com.whoop.android.R;
import io.sentry.internal.debugmeta.C20378c;
import java.util.List;
import p186h8.C16999a;

/* JADX INFO: renamed from: h5.y0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16926y0 extends AbstractC16863c1 {

    /* JADX INFO: renamed from: e */
    public static final PathInterpolator f64894e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: f */
    public static final C16999a f64895f = new C16999a(0);

    /* JADX INFO: renamed from: g */
    public static final DecelerateInterpolator f64896g = new DecelerateInterpolator();

    public C16926y0(int i13, Interpolator interpolator, long j7) {
        super(i13, interpolator, j7);
    }

    /* JADX INFO: renamed from: e */
    public static void m47615e(View view, C16866d1 c16866d1) {
        AbstractC1230l abstractC1230lM47620j = m47620j(view);
        if (abstractC1230lM47620j != null) {
            abstractC1230lM47620j.mo3872g(c16866d1);
            if (abstractC1230lM47620j.f5422x == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                m47615e(viewGroup.getChildAt(i13), c16866d1);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m47616f(View view, C16866d1 c16866d1, WindowInsets windowInsets, boolean z4) {
        AbstractC1230l abstractC1230lM47620j = m47620j(view);
        if (abstractC1230lM47620j != null) {
            abstractC1230lM47620j.f5423y = windowInsets;
            if (!z4) {
                abstractC1230lM47620j.mo3873h();
                z4 = abstractC1230lM47620j.f5422x == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                m47616f(viewGroup.getChildAt(i13), c16866d1, windowInsets, z4);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m47617g(View view, C16905q1 c16905q1, List list) {
        AbstractC1230l abstractC1230lM47620j = m47620j(view);
        if (abstractC1230lM47620j != null) {
            c16905q1 = abstractC1230lM47620j.mo3874i(c16905q1, list);
            if (abstractC1230lM47620j.f5422x == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                m47617g(viewGroup.getChildAt(i13), c16905q1, list);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m47618h(View view, C16866d1 c16866d1, C20378c c20378c) {
        AbstractC1230l abstractC1230lM47620j = m47620j(view);
        if (abstractC1230lM47620j != null) {
            abstractC1230lM47620j.mo3875j(c16866d1, c20378c);
            if (abstractC1230lM47620j.f5422x == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                m47618h(viewGroup.getChildAt(i13), c16866d1, c20378c);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static WindowInsets m47619i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: j */
    public static AbstractC1230l m47620j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC16924x0) {
            return ((ViewOnApplyWindowInsetsListenerC16924x0) tag).f64890a;
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static void m47621k(View view, AbstractC1230l abstractC1230l) {
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        if (abstractC1230l == null) {
            view.setTag(R.id.tag_window_insets_animation_callback, null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            return;
        }
        View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC16924x0 = new ViewOnApplyWindowInsetsListenerC16924x0(view, abstractC1230l);
        view.setTag(R.id.tag_window_insets_animation_callback, viewOnApplyWindowInsetsListenerC16924x0);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC16924x0);
        }
    }
}
