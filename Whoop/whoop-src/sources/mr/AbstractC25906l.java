package mr;

import a00.C0072g;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.AbstractC1707m0;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.datepicker.C5016j;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.whoop.android.R;
import cr.AbstractC11075m;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p186h8.C16999a;
import p287kq.AbstractC22766a;
import p413q4.C29960e;
import p463rj.AbstractC31484o;
import p558vp.AbstractC36259c;

/* JADX INFO: renamed from: mr.l */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC25906l {

    /* JADX INFO: renamed from: a */
    public final int f102251a;

    /* JADX INFO: renamed from: b */
    public final int f102252b;

    /* JADX INFO: renamed from: c */
    public final int f102253c;

    /* JADX INFO: renamed from: d */
    public final TimeInterpolator f102254d;

    /* JADX INFO: renamed from: e */
    public final TimeInterpolator f102255e;

    /* JADX INFO: renamed from: f */
    public final TimeInterpolator f102256f;

    /* JADX INFO: renamed from: g */
    public final ViewGroup f102257g;

    /* JADX INFO: renamed from: h */
    public final Context f102258h;

    /* JADX INFO: renamed from: i */
    public final AbstractC25905k f102259i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC25907m f102260j;

    /* JADX INFO: renamed from: k */
    public int f102261k;

    /* JADX INFO: renamed from: l */
    public ViewOnAttachStateChangeListenerC25902h f102262l;

    /* JADX INFO: renamed from: n */
    public int f102264n;

    /* JADX INFO: renamed from: o */
    public int f102265o;

    /* JADX INFO: renamed from: p */
    public int f102266p;

    /* JADX INFO: renamed from: q */
    public int f102267q;

    /* JADX INFO: renamed from: r */
    public int f102268r;

    /* JADX INFO: renamed from: s */
    public int f102269s;

    /* JADX INFO: renamed from: t */
    public boolean f102270t;

    /* JADX INFO: renamed from: u */
    public ArrayList f102271u;

    /* JADX INFO: renamed from: v */
    public final AccessibilityManager f102272v;

    /* JADX INFO: renamed from: x */
    public static final C16999a f102248x = AbstractC22766a.f89673b;

    /* JADX INFO: renamed from: y */
    public static final LinearInterpolator f102249y = AbstractC22766a.f89672a;

    /* JADX INFO: renamed from: z */
    public static final C16999a f102250z = AbstractC22766a.f89675d;

    /* JADX INFO: renamed from: B */
    public static final int[] f102246B = {R.attr.snackbarStyle};

    /* JADX INFO: renamed from: C */
    public static final String f102247C = AbstractC25906l.class.getSimpleName();

    /* JADX INFO: renamed from: A */
    public static final Handler f102245A = new Handler(Looper.getMainLooper(), new C25898d(0));

    /* JADX INFO: renamed from: m */
    public final RunnableC25899e f102263m = new RunnableC25899e(this, 0);

    /* JADX INFO: renamed from: w */
    public final C25901g f102273w = new C25901g(this);

    public AbstractC25906l(Context context, ViewGroup viewGroup, View view, InterfaceC25907m interfaceC25907m) {
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (interfaceC25907m == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f102257g = viewGroup;
        this.f102260j = interfaceC25907m;
        this.f102258h = context;
        AbstractC11075m.m29869c(context, AbstractC11075m.f35032a, "Theme.AppCompat");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f102246B);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        AbstractC25905k abstractC25905k = (AbstractC25905k) layoutInflaterFrom.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.f102259i = abstractC25905k;
        abstractC25905k.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            float actionTextColorAlpha = abstractC25905k.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout.f21044x.setTextColor(AbstractC31484o.m96972x(actionTextColorAlpha, AbstractC31484o.m96969u(snackbarContentLayout, R.attr.colorSurface), snackbarContentLayout.f21044x.getCurrentTextColor()));
            }
            snackbarContentLayout.setMaxInlineActionWidth(abstractC25905k.getMaxInlineActionWidth());
        }
        abstractC25905k.addView(view);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        abstractC25905k.setAccessibilityLiveRegion(1);
        abstractC25905k.setImportantForAccessibility(1);
        abstractC25905k.setFitsSystemWindows(true);
        AbstractC16877h0.m47517l(abstractC25905k, new C25900f(this));
        AbstractC16901p0.m47583n(abstractC25905k, new C5016j(this, 3));
        this.f102272v = (AccessibilityManager) context.getSystemService("accessibility");
        this.f102253c = AbstractC36259c.m115697k0(context, R.attr.motionDurationLong2, AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION);
        this.f102251a = AbstractC36259c.m115697k0(context, R.attr.motionDurationLong2, 150);
        this.f102252b = AbstractC36259c.m115697k0(context, R.attr.motionDurationMedium1, 75);
        this.f102254d = AbstractC36259c.m115699l0(context, R.attr.motionEasingEmphasizedInterpolator, f102249y);
        this.f102256f = AbstractC36259c.m115699l0(context, R.attr.motionEasingEmphasizedInterpolator, f102250z);
        this.f102255e = AbstractC36259c.m115699l0(context, R.attr.motionEasingEmphasizedInterpolator, f102248x);
    }

    /* JADX INFO: renamed from: a */
    public final void m76610a(int i13) {
        C0072g c0072gM163o = C0072g.m163o();
        C25901g c25901g = this.f102273w;
        synchronized (c0072gM163o.f223x) {
            try {
                if (c0072gM163o.m200r(c25901g)) {
                    c0072gM163o.m190h((C25909o) c0072gM163o.f225z, i13);
                } else {
                    C25909o c25909o = (C25909o) c0072gM163o.f221E;
                    if (c25909o != null && c25909o.f102277a.get() == c25901g) {
                        c0072gM163o.m190h((C25909o) c0072gM163o.f221E, i13);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final View m76611b() {
        ViewOnAttachStateChangeListenerC25902h viewOnAttachStateChangeListenerC25902h = this.f102262l;
        if (viewOnAttachStateChangeListenerC25902h == null) {
            return null;
        }
        return (View) viewOnAttachStateChangeListenerC25902h.f102231x.get();
    }

    /* JADX INFO: renamed from: c */
    public final void m76612c() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.f102259i.getRootWindowInsets()) == null) {
            return;
        }
        this.f102268r = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        m76616g();
    }

    /* JADX INFO: renamed from: d */
    public final void m76613d(int i13) {
        C0072g c0072gM163o = C0072g.m163o();
        C25901g c25901g = this.f102273w;
        synchronized (c0072gM163o.f223x) {
            try {
                if (c0072gM163o.m200r(c25901g)) {
                    c0072gM163o.f225z = null;
                    if (((C25909o) c0072gM163o.f221E) != null) {
                        c0072gM163o.m178N();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        ArrayList arrayList = this.f102271u;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC25903i) this.f102271u.get(size)).onDismissed(this, i13);
            }
        }
        ViewParent parent = this.f102259i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f102259i);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m76614e() {
        C0072g c0072gM163o = C0072g.m163o();
        C25901g c25901g = this.f102273w;
        synchronized (c0072gM163o.f223x) {
            try {
                if (c0072gM163o.m200r(c25901g)) {
                    c0072gM163o.m166B((C25909o) c0072gM163o.f225z);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        ArrayList arrayList = this.f102271u;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC25903i) this.f102271u.get(size)).onShown(this);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m76615f() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AbstractC25905k abstractC25905k = this.f102259i;
        AccessibilityManager accessibilityManager = this.f102272v;
        if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
            abstractC25905k.post(new RunnableC25899e(this, 2));
            return;
        }
        if (abstractC25905k.getParent() != null) {
            abstractC25905k.setVisibility(0);
        }
        m76614e();
    }

    /* JADX INFO: renamed from: g */
    public final void m76616g() {
        AbstractC25905k abstractC25905k = this.f102259i;
        ViewGroup.LayoutParams layoutParams = abstractC25905k.getLayoutParams();
        boolean z4 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = f102247C;
        if (!z4) {
            Log.w(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (abstractC25905k.f102239J == null) {
            Log.w(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (abstractC25905k.getParent() == null) {
            return;
        }
        int i13 = m76611b() != null ? this.f102267q : this.f102264n;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = abstractC25905k.f102239J;
        int i14 = rect.bottom + i13;
        int i15 = rect.left + this.f102265o;
        int i16 = rect.right + this.f102266p;
        int i17 = rect.top;
        boolean z13 = (marginLayoutParams.bottomMargin == i14 && marginLayoutParams.leftMargin == i15 && marginLayoutParams.rightMargin == i16 && marginLayoutParams.topMargin == i17) ? false : true;
        if (z13) {
            marginLayoutParams.bottomMargin = i14;
            marginLayoutParams.leftMargin = i15;
            marginLayoutParams.rightMargin = i16;
            marginLayoutParams.topMargin = i17;
            abstractC25905k.requestLayout();
        }
        if ((z13 || this.f102269s != this.f102268r) && Build.VERSION.SDK_INT >= 29 && this.f102268r > 0) {
            ViewGroup.LayoutParams layoutParams2 = abstractC25905k.getLayoutParams();
            if ((layoutParams2 instanceof C29960e) && (((C29960e) layoutParams2).f122364a instanceof SwipeDismissBehavior)) {
                RunnableC25899e runnableC25899e = this.f102263m;
                abstractC25905k.removeCallbacks(runnableC25899e);
                abstractC25905k.post(runnableC25899e);
            }
        }
    }
}
