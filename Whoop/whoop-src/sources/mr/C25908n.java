package mr;

import a00.C0072g;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b13.ViewOnClickListenerC2292a;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.whoop.android.R;

/* JADX INFO: renamed from: mr.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C25908n extends AbstractC25906l {

    /* JADX INFO: renamed from: F */
    public static final int[] f102274F = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};

    /* JADX INFO: renamed from: D */
    public final AccessibilityManager f102275D;

    /* JADX INFO: renamed from: E */
    public boolean f102276E;

    public C25908n(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.f102275D = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    /* JADX WARN: Code duplicated, block: B:31:0x002c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x002a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:? A[LOOP:0: B:3:0x0002->B:35:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public static C25908n m76617h(View view, CharSequence charSequence, int i13) {
        ViewGroup viewGroup;
        Object parent;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view;
                break;
            }
            if (!(view instanceof FrameLayout)) {
                if (view != null) {
                    parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            } else {
                if (view.getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                    break;
                }
                viewGroup2 = (ViewGroup) view;
                if (view != null) {
                    parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            }
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        Context context = viewGroup.getContext();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f102274F);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) layoutInflaterFrom.inflate((resourceId == -1 || resourceId2 == -1) ? R.layout.design_layout_snackbar_include : R.layout.mtrl_layout_snackbar_include, viewGroup, false);
        C25908n c25908n = new C25908n(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
        ((SnackbarContentLayout) c25908n.f102259i.getChildAt(0)).getMessageView().setText(charSequence);
        c25908n.f102261k = i13;
        return c25908n;
    }

    /* JADX INFO: renamed from: i */
    public final void m76618i(int i13, View.OnClickListener onClickListener) {
        CharSequence text = this.f102258h.getText(i13);
        Button actionView = ((SnackbarContentLayout) this.f102259i.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(text)) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.f102276E = false;
        } else {
            this.f102276E = true;
            actionView.setVisibility(0);
            actionView.setText(text);
            actionView.setOnClickListener(new ViewOnClickListenerC2292a(8, this, onClickListener));
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    /* JADX INFO: renamed from: j */
    public final void m76619j() {
        C0072g c0072gM163o = C0072g.m163o();
        AccessibilityManager accessibilityManager = this.f102275D;
        int recommendedTimeoutMillis = this.f102261k;
        boolean z4 = false;
        if (recommendedTimeoutMillis == -2) {
            recommendedTimeoutMillis = -2;
        } else if (Build.VERSION.SDK_INT >= 29) {
            recommendedTimeoutMillis = accessibilityManager.getRecommendedTimeoutMillis(recommendedTimeoutMillis, (this.f102276E ? 4 : 0) | 3);
        } else if (this.f102276E && accessibilityManager.isTouchExplorationEnabled()) {
            recommendedTimeoutMillis = -2;
        }
        C25901g c25901g = this.f102273w;
        synchronized (c0072gM163o.f223x) {
            try {
                if (c0072gM163o.m200r(c25901g)) {
                    C25909o c25909o = (C25909o) c0072gM163o.f225z;
                    c25909o.f102278b = recommendedTimeoutMillis;
                    ((Handler) c0072gM163o.f224y).removeCallbacksAndMessages(c25909o);
                    c0072gM163o.m166B((C25909o) c0072gM163o.f225z);
                    return;
                }
                C25909o c25909o2 = (C25909o) c0072gM163o.f221E;
                if (c25909o2 != null && c25909o2.f102277a.get() == c25901g) {
                    z4 = true;
                }
                if (z4) {
                    ((C25909o) c0072gM163o.f221E).f102278b = recommendedTimeoutMillis;
                } else {
                    c0072gM163o.f221E = new C25909o(recommendedTimeoutMillis, c25901g);
                }
                C25909o c25909o3 = (C25909o) c0072gM163o.f225z;
                if (c25909o3 == null || !c0072gM163o.m190h(c25909o3, 4)) {
                    c0072gM163o.f225z = null;
                    c0072gM163o.m178N();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
