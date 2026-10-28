package p314m;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.stripe.android.stripe3ds2.views.ThreeDS2Button;
import java.util.ArrayList;
import java.util.WeakHashMap;
import la.C23548b;
import p157fv.C14796b;
import p184h5.AbstractC16871f0;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p184h5.C16913t0;
import p290l.AbstractC22932a;
import p408q.AbstractC29658b;
import p408q.C29667k;
import p408q.C29668l;
import p408q.InterfaceC29657a;
import p444r.MenuC30818l;
import p474s.C32011t2;
import p474s.InterfaceC31936b;
import p474s.InterfaceC31938b1;
import q83.AbstractC30060g;
import qg3.C30352d;

/* JADX INFO: renamed from: m.n0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C24855n0 extends AbstractC24830b implements InterfaceC31936b {

    /* JADX INFO: renamed from: y */
    public static final AccelerateInterpolator f97351y = new AccelerateInterpolator();

    /* JADX INFO: renamed from: z */
    public static final DecelerateInterpolator f97352z = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a */
    public Context f97353a;

    /* JADX INFO: renamed from: b */
    public Context f97354b;

    /* JADX INFO: renamed from: c */
    public ActionBarOverlayLayout f97355c;

    /* JADX INFO: renamed from: d */
    public ActionBarContainer f97356d;

    /* JADX INFO: renamed from: e */
    public InterfaceC31938b1 f97357e;

    /* JADX INFO: renamed from: f */
    public ActionBarContextView f97358f;

    /* JADX INFO: renamed from: g */
    public final View f97359g;

    /* JADX INFO: renamed from: h */
    public boolean f97360h;

    /* JADX INFO: renamed from: i */
    public C24853m0 f97361i;

    /* JADX INFO: renamed from: j */
    public C24853m0 f97362j;

    /* JADX INFO: renamed from: k */
    public C30352d f97363k;

    /* JADX INFO: renamed from: l */
    public boolean f97364l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f97365m;

    /* JADX INFO: renamed from: n */
    public int f97366n;

    /* JADX INFO: renamed from: o */
    public boolean f97367o;

    /* JADX INFO: renamed from: p */
    public boolean f97368p;

    /* JADX INFO: renamed from: q */
    public boolean f97369q;

    /* JADX INFO: renamed from: r */
    public boolean f97370r;

    /* JADX INFO: renamed from: s */
    public C29668l f97371s;

    /* JADX INFO: renamed from: t */
    public boolean f97372t;

    /* JADX INFO: renamed from: u */
    public boolean f97373u;

    /* JADX INFO: renamed from: v */
    public final C24851l0 f97374v;

    /* JADX INFO: renamed from: w */
    public final C24851l0 f97375w;

    /* JADX INFO: renamed from: x */
    public final C23548b f97376x;

    public C24855n0(Activity activity, boolean z4) {
        new ArrayList();
        this.f97365m = new ArrayList();
        this.f97366n = 0;
        this.f97367o = true;
        this.f97370r = true;
        this.f97374v = new C24851l0(this, 0);
        this.f97375w = new C24851l0(this, 1);
        this.f97376x = new C23548b(this, 3);
        View decorView = activity.getWindow().getDecorView();
        m72871A(decorView);
        if (z4) {
            return;
        }
        this.f97359g = decorView.findViewById(R.id.content);
    }

    /* JADX INFO: renamed from: A */
    public final void m72871A(View view) {
        InterfaceC31938b1 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.whoop.android.R.id.decor_content_parent);
        this.f97355c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.whoop.android.R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC31938b1) {
            wrapper = (InterfaceC31938b1) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f97357e = wrapper;
        this.f97358f = (ActionBarContextView) view.findViewById(com.whoop.android.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.whoop.android.R.id.action_bar_container);
        this.f97356d = actionBarContainer;
        InterfaceC31938b1 interfaceC31938b1 = this.f97357e;
        if (interfaceC31938b1 == null || this.f97358f == null || actionBarContainer == null) {
            throw new IllegalStateException(C24855n0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((C32011t2) interfaceC31938b1).f132828a.getContext();
        this.f97353a = context;
        if ((((C32011t2) this.f97357e).f132829b & 4) != 0) {
            this.f97360h = true;
        }
        int i13 = context.getApplicationInfo().targetSdkVersion;
        mo72830s();
        m72873C(context.getResources().getBoolean(com.whoop.android.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f97353a.obtainStyledAttributes(null, AbstractC22932a.f90508a, com.whoop.android.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f97355c;
            if (!actionBarOverlayLayout2.f4283G) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f97373u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f97356d;
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            AbstractC16877h0.m47516k(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: B */
    public final void m72872B(int i13, int i14) {
        C32011t2 c32011t2 = (C32011t2) this.f97357e;
        int i15 = c32011t2.f132829b;
        if ((i14 & 4) != 0) {
            this.f97360h = true;
        }
        c32011t2.m99563b((i13 & i14) | ((~i14) & i15));
    }

    /* JADX INFO: renamed from: C */
    public final void m72873C(boolean z4) {
        if (z4) {
            this.f97356d.setTabContainer(null);
            ((C32011t2) this.f97357e).getClass();
        } else {
            ((C32011t2) this.f97357e).getClass();
            this.f97356d.setTabContainer(null);
        }
        this.f97357e.getClass();
        ((C32011t2) this.f97357e).f132828a.setCollapsible(false);
        this.f97355c.setHasNonEmbeddedTabs(false);
    }

    /* JADX INFO: renamed from: D */
    public final void m72874D(boolean z4) {
        boolean z13 = this.f97368p;
        boolean z14 = this.f97369q;
        C23548b c23548b = this.f97376x;
        View view = this.f97359g;
        if (!z14 && z13) {
            if (this.f97370r) {
                this.f97370r = false;
                C29668l c29668l = this.f97371s;
                if (c29668l != null) {
                    c29668l.m91142a();
                }
                int i13 = this.f97366n;
                C24851l0 c24851l0 = this.f97374v;
                if (i13 != 0 || (!this.f97372t && !z4)) {
                    c24851l0.mo30520c();
                    return;
                }
                this.f97356d.setAlpha(1.0f);
                this.f97356d.setTransitioning(true);
                C29668l c29668l2 = new C29668l();
                float f13 = -this.f97356d.getHeight();
                if (z4) {
                    int[] iArr = {0, 0};
                    this.f97356d.getLocationInWindow(iArr);
                    f13 -= iArr[1];
                }
                C16913t0 c16913t0M47570a = AbstractC16901p0.m47570a(this.f97356d);
                c16913t0M47570a.m47611e(f13);
                View view2 = (View) c16913t0M47570a.f64874a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(c23548b != null ? new C14796b(1, c23548b, view2) : null);
                }
                boolean z15 = c29668l2.f121283e;
                ArrayList arrayList = c29668l2.f121279a;
                if (!z15) {
                    arrayList.add(c16913t0M47570a);
                }
                if (this.f97367o && view != null) {
                    C16913t0 c16913t0M47570a2 = AbstractC16901p0.m47570a(view);
                    c16913t0M47570a2.m47611e(f13);
                    if (!c29668l2.f121283e) {
                        arrayList.add(c16913t0M47570a2);
                    }
                }
                boolean z16 = c29668l2.f121283e;
                if (!z16) {
                    c29668l2.f121281c = f97351y;
                }
                if (!z16) {
                    c29668l2.f121280b = 250L;
                }
                if (!z16) {
                    c29668l2.f121282d = c24851l0;
                }
                this.f97371s = c29668l2;
                c29668l2.m91143b();
                return;
            }
            return;
        }
        if (this.f97370r) {
            return;
        }
        this.f97370r = true;
        C29668l c29668l3 = this.f97371s;
        if (c29668l3 != null) {
            c29668l3.m91142a();
        }
        this.f97356d.setVisibility(0);
        int i14 = this.f97366n;
        C24851l0 c24851l1 = this.f97375w;
        if (i14 == 0 && (this.f97372t || z4)) {
            this.f97356d.setTranslationY(0.0f);
            float f14 = -this.f97356d.getHeight();
            if (z4) {
                int[] iArr2 = {0, 0};
                this.f97356d.getLocationInWindow(iArr2);
                f14 -= iArr2[1];
            }
            this.f97356d.setTranslationY(f14);
            C29668l c29668l4 = new C29668l();
            C16913t0 c16913t0M47570a3 = AbstractC16901p0.m47570a(this.f97356d);
            c16913t0M47570a3.m47611e(0.0f);
            View view3 = (View) c16913t0M47570a3.f64874a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(c23548b != null ? new C14796b(1, c23548b, view3) : null);
            }
            boolean z17 = c29668l4.f121283e;
            ArrayList arrayList2 = c29668l4.f121279a;
            if (!z17) {
                arrayList2.add(c16913t0M47570a3);
            }
            if (this.f97367o && view != null) {
                view.setTranslationY(f14);
                C16913t0 c16913t0M47570a4 = AbstractC16901p0.m47570a(view);
                c16913t0M47570a4.m47611e(0.0f);
                if (!c29668l4.f121283e) {
                    arrayList2.add(c16913t0M47570a4);
                }
            }
            boolean z18 = c29668l4.f121283e;
            if (!z18) {
                c29668l4.f121281c = f97352z;
            }
            if (!z18) {
                c29668l4.f121280b = 250L;
            }
            if (!z18) {
                c29668l4.f121282d = c24851l1;
            }
            this.f97371s = c29668l4;
            c29668l4.m91143b();
        } else {
            this.f97356d.setAlpha(1.0f);
            this.f97356d.setTranslationY(0.0f);
            if (this.f97367o && view != null) {
                view.setTranslationY(0.0f);
            }
            c24851l1.mo30520c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f97355c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            AbstractC16871f0.m47500c(actionBarOverlayLayout);
        }
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: b */
    public final boolean mo72813b() {
        InterfaceC31938b1 interfaceC31938b1 = this.f97357e;
        if (interfaceC31938b1 == null || !((C32011t2) interfaceC31938b1).f132828a.m3323r()) {
            return false;
        }
        ((C32011t2) this.f97357e).f132828a.m3312e();
        return true;
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: c */
    public final void mo72814c(boolean z4) {
        if (z4 == this.f97364l) {
            return;
        }
        this.f97364l = z4;
        ArrayList arrayList = this.f97365m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: d */
    public final int mo72815d() {
        return ((C32011t2) this.f97357e).f132829b;
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: e */
    public final Context mo72816e() {
        if (this.f97354b == null) {
            TypedValue typedValue = new TypedValue();
            this.f97353a.getTheme().resolveAttribute(com.whoop.android.R.attr.actionBarWidgetTheme, typedValue, true);
            int i13 = typedValue.resourceId;
            if (i13 != 0) {
                this.f97354b = new ContextThemeWrapper(this.f97353a, i13);
            } else {
                this.f97354b = this.f97353a;
            }
        }
        return this.f97354b;
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: g */
    public final void mo72818g() {
        m72873C(this.f97353a.getResources().getBoolean(com.whoop.android.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: i */
    public final boolean mo72820i(int i13, KeyEvent keyEvent) {
        MenuC30818l menuC30818l;
        C24853m0 c24853m0 = this.f97361i;
        if (c24853m0 == null || (menuC30818l = c24853m0.f97350z) == null) {
            return false;
        }
        menuC30818l.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuC30818l.performShortcut(i13, keyEvent, 0);
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: l */
    public final void mo72823l(ColorDrawable colorDrawable) {
        this.f97356d.setPrimaryBackground(colorDrawable);
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: m */
    public final void mo72824m(ThreeDS2Button threeDS2Button, C24828a c24828a) {
        threeDS2Button.setLayoutParams(c24828a);
        ((C32011t2) this.f97357e).m99562a(threeDS2Button);
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: n */
    public final void mo72825n(boolean z4) {
        if (this.f97360h) {
            return;
        }
        mo72826o(z4);
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: o */
    public final void mo72826o(boolean z4) {
        m72872B(z4 ? 4 : 0, 4);
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: p */
    public final void mo72827p() {
        m72872B(16, 16);
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: q */
    public final void mo72828q() {
        m72872B(2, 2);
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: r */
    public final void mo72829r(int i13) {
        C32011t2 c32011t2 = (C32011t2) this.f97357e;
        Toolbar toolbar = c32011t2.f132828a;
        Drawable drawableM92133x = i13 != 0 ? AbstractC30060g.m92133x(toolbar.getContext(), i13) : null;
        c32011t2.f132833f = drawableM92133x;
        if ((c32011t2.f132829b & 4) == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawableM92133x == null) {
            drawableM92133x = c32011t2.f132842o;
        }
        toolbar.setNavigationIcon(drawableM92133x);
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: s */
    public final void mo72830s() {
        this.f97357e.getClass();
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: t */
    public final void mo72831t() {
        C32011t2 c32011t2 = (C32011t2) this.f97357e;
        c32011t2.f132832e = null;
        c32011t2.m99565d();
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: u */
    public final void mo72832u(boolean z4) {
        C29668l c29668l;
        this.f97372t = z4;
        if (z4 || (c29668l = this.f97371s) == null) {
            return;
        }
        c29668l.m91142a();
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: v */
    public final void mo72833v() {
        mo72834w(this.f97353a.getString(com.whoop.android.R.string.stripe_3ds2_hzv_header_label));
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: w */
    public final void mo72834w(CharSequence charSequence) {
        C32011t2 c32011t2 = (C32011t2) this.f97357e;
        c32011t2.f132834g = true;
        Toolbar toolbar = c32011t2.f132828a;
        c32011t2.f132835h = charSequence;
        if ((c32011t2.f132829b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (c32011t2.f132834g) {
                AbstractC16901p0.m47584o(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: x */
    public final void mo72835x(CharSequence charSequence) {
        C32011t2 c32011t2 = (C32011t2) this.f97357e;
        if (c32011t2.f132834g) {
            return;
        }
        Toolbar toolbar = c32011t2.f132828a;
        c32011t2.f132835h = charSequence;
        if ((c32011t2.f132829b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (c32011t2.f132834g) {
                AbstractC16901p0.m47584o(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: y */
    public final AbstractC29658b mo72836y(C30352d c30352d) {
        C24853m0 c24853m0 = this.f97361i;
        if (c24853m0 != null) {
            c24853m0.mo72857c();
        }
        this.f97355c.setHideOnContentScrollEnabled(false);
        this.f97358f.m3263e();
        C24853m0 c24853m1 = new C24853m0(this, this.f97358f.getContext(), c30352d);
        MenuC30818l menuC30818l = c24853m1.f97350z;
        menuC30818l.m94828z();
        try {
            boolean zMo91069t = ((InterfaceC29657a) c24853m1.f97346E.f124535x).mo91069t(c24853m1, menuC30818l);
            menuC30818l.m94827y();
            if (!zMo91069t) {
                return null;
            }
            this.f97361i = c24853m1;
            c24853m1.mo72863i();
            this.f97358f.m3261c(c24853m1);
            m72875z(true);
            return c24853m1;
        } catch (Throwable th3) {
            menuC30818l.m94827y();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m72875z(boolean z4) {
        C16913t0 c16913t0M3265i;
        C16913t0 c16913t0M3265i2;
        if (z4) {
            if (!this.f97369q) {
                this.f97369q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f97355c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                m72874D(false);
            }
        } else if (this.f97369q) {
            this.f97369q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f97355c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            m72874D(false);
        }
        if (!this.f97356d.isLaidOut()) {
            if (z4) {
                ((C32011t2) this.f97357e).f132828a.setVisibility(4);
                this.f97358f.setVisibility(0);
                return;
            } else {
                ((C32011t2) this.f97357e).f132828a.setVisibility(0);
                this.f97358f.setVisibility(8);
                return;
            }
        }
        if (z4) {
            C32011t2 c32011t2 = (C32011t2) this.f97357e;
            c16913t0M3265i = AbstractC16901p0.m47570a(c32011t2.f132828a);
            c16913t0M3265i.m47607a(0.0f);
            c16913t0M3265i.m47609c(100L);
            c16913t0M3265i.m47610d(new C29667k(c32011t2, 4));
            c16913t0M3265i2 = this.f97358f.m3265i(0, 200L);
        } else {
            C32011t2 c32011t3 = (C32011t2) this.f97357e;
            C16913t0 c16913t0M47570a = AbstractC16901p0.m47570a(c32011t3.f132828a);
            c16913t0M47570a.m47607a(1.0f);
            c16913t0M47570a.m47609c(200L);
            c16913t0M47570a.m47610d(new C29667k(c32011t3, 0));
            c16913t0M3265i = this.f97358f.m3265i(8, 100L);
            c16913t0M3265i2 = c16913t0M47570a;
        }
        C29668l c29668l = new C29668l();
        ArrayList arrayList = c29668l.f121279a;
        arrayList.add(c16913t0M3265i);
        View view = (View) c16913t0M3265i.f64874a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c16913t0M3265i2.f64874a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c16913t0M3265i2);
        c29668l.m91143b();
    }

    public C24855n0(Dialog dialog) {
        new ArrayList();
        this.f97365m = new ArrayList();
        this.f97366n = 0;
        this.f97367o = true;
        this.f97370r = true;
        this.f97374v = new C24851l0(this, 0);
        this.f97375w = new C24851l0(this, 1);
        this.f97376x = new C23548b(this, 3);
        m72871A(dialog.getWindow().getDecorView());
    }
}
