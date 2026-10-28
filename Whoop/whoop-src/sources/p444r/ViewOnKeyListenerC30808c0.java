package p444r;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.whoop.android.R;
import p439qv.ViewOnAttachStateChangeListenerC30647d;
import p474s.C31935a2;
import p474s.C31974k1;
import p474s.C32016v;

/* JADX INFO: renamed from: r.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnKeyListenerC30808c0 extends AbstractC30826t implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: E */
    public final boolean f126989E;

    /* JADX INFO: renamed from: F */
    public final int f126990F;

    /* JADX INFO: renamed from: G */
    public final int f126991G;

    /* JADX INFO: renamed from: H */
    public final C31935a2 f126992H;

    /* JADX INFO: renamed from: K */
    public PopupWindow.OnDismissListener f126995K;

    /* JADX INFO: renamed from: L */
    public View f126996L;

    /* JADX INFO: renamed from: M */
    public View f126997M;

    /* JADX INFO: renamed from: N */
    public InterfaceC30829w f126998N;

    /* JADX INFO: renamed from: O */
    public ViewTreeObserver f126999O;

    /* JADX INFO: renamed from: P */
    public boolean f127000P;

    /* JADX INFO: renamed from: Q */
    public boolean f127001Q;

    /* JADX INFO: renamed from: R */
    public int f127002R;

    /* JADX INFO: renamed from: T */
    public boolean f127004T;

    /* JADX INFO: renamed from: x */
    public final Context f127005x;

    /* JADX INFO: renamed from: y */
    public final MenuC30818l f127006y;

    /* JADX INFO: renamed from: z */
    public final C30815i f127007z;

    /* JADX INFO: renamed from: I */
    public final ViewTreeObserverOnGlobalLayoutListenerC30809d f126993I = new ViewTreeObserverOnGlobalLayoutListenerC30809d(this, 1);

    /* JADX INFO: renamed from: J */
    public final ViewOnAttachStateChangeListenerC30647d f126994J = new ViewOnAttachStateChangeListenerC30647d(this, 2);

    /* JADX INFO: renamed from: S */
    public int f127003S = 0;

    public ViewOnKeyListenerC30808c0(Context context, MenuC30818l menuC30818l, View view, int i13, boolean z4) {
        this.f127005x = context;
        this.f127006y = menuC30818l;
        this.f126989E = z4;
        this.f127007z = new C30815i(menuC30818l, LayoutInflater.from(context), z4, R.layout.abc_popup_menu_item_layout);
        this.f126991G = i13;
        Resources resources = context.getResources();
        this.f126990F = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f126996L = view;
        this.f126992H = new C31935a2(context, null, i13, 0);
        menuC30818l.m94814c(this, context);
    }

    @Override // p444r.InterfaceC30806b0
    /* JADX INFO: renamed from: a */
    public final boolean mo94784a() {
        return !this.f127000P && this.f126992H.f132871Z.isShowing();
    }

    @Override // p444r.InterfaceC30806b0
    /* JADX INFO: renamed from: c */
    public final void mo94785c() {
        View view;
        if (mo94784a()) {
            return;
        }
        if (this.f127000P || (view = this.f126996L) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f126997M = view;
        C31935a2 c31935a2 = this.f126992H;
        C32016v c32016v = c31935a2.f132871Z;
        C32016v c32016v2 = c31935a2.f132871Z;
        c32016v.setOnDismissListener(this);
        c31935a2.f132861P = this;
        c31935a2.f132870Y = true;
        c32016v2.setFocusable(true);
        View view2 = this.f126997M;
        boolean z4 = this.f126999O == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f126999O = viewTreeObserver;
        if (z4) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f126993I);
        }
        view2.addOnAttachStateChangeListener(this.f126994J);
        c31935a2.f132860O = view2;
        c31935a2.f132857L = this.f127003S;
        boolean z13 = this.f127001Q;
        Context context = this.f127005x;
        C30815i c30815i = this.f127007z;
        if (!z13) {
            this.f127002R = AbstractC30826t.m94833l(c30815i, context, this.f126990F);
            this.f127001Q = true;
        }
        c31935a2.m99573p(this.f127002R);
        c32016v2.setInputMethodMode(2);
        Rect rect = this.f127120w;
        c31935a2.f132869X = rect != null ? new Rect(rect) : null;
        c31935a2.mo94785c();
        C31974k1 c31974k1 = c31935a2.f132874y;
        c31974k1.setOnKeyListener(this);
        if (this.f127004T) {
            MenuC30818l menuC30818l = this.f127006y;
            if (menuC30818l.f127067n != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c31974k1, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC30818l.f127067n);
                }
                frameLayout.setEnabled(false);
                c31974k1.addHeaderView(frameLayout, null, false);
            }
        }
        c31935a2.mo99441l(c30815i);
        c31935a2.mo94785c();
    }

    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: d */
    public final void mo3336d() {
        this.f127001Q = false;
        C30815i c30815i = this.f127007z;
        if (c30815i != null) {
            c30815i.notifyDataSetChanged();
        }
    }

    @Override // p444r.InterfaceC30806b0
    public final void dismiss() {
        if (mo94784a()) {
            this.f126992H.dismiss();
        }
    }

    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: g */
    public final void mo3339g(MenuC30818l menuC30818l, boolean z4) {
        if (menuC30818l != this.f127006y) {
            return;
        }
        dismiss();
        InterfaceC30829w interfaceC30829w = this.f126998N;
        if (interfaceC30829w != null) {
            interfaceC30829w.mo16445g(menuC30818l, z4);
        }
    }

    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: h */
    public final void mo94787h(InterfaceC30829w interfaceC30829w) {
        this.f126998N = interfaceC30829w;
    }

    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: i */
    public final boolean mo3340i() {
        return false;
    }

    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: j */
    public final boolean mo3341j(SubMenuC30810d0 subMenuC30810d0) {
        boolean z4;
        if (subMenuC30810d0.hasVisibleItems()) {
            C30828v c30828v = new C30828v(this.f127005x, subMenuC30810d0, this.f126997M, this.f126989E, this.f126991G, 0);
            InterfaceC30829w interfaceC30829w = this.f126998N;
            c30828v.f127129h = interfaceC30829w;
            AbstractC30826t abstractC30826t = c30828v.f127130i;
            if (abstractC30826t != null) {
                abstractC30826t.mo94787h(interfaceC30829w);
            }
            int size = subMenuC30810d0.f127060g.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    z4 = false;
                    break;
                }
                MenuItem item = subMenuC30810d0.getItem(i13);
                if (item.isVisible() && item.getIcon() != null) {
                    z4 = true;
                    break;
                }
                i13++;
            }
            c30828v.f127128g = z4;
            AbstractC30826t abstractC30826t2 = c30828v.f127130i;
            if (abstractC30826t2 != null) {
                abstractC30826t2.mo94790o(z4);
            }
            c30828v.f127131j = this.f126995K;
            this.f126995K = null;
            this.f127006y.m94815d(false);
            C31935a2 c31935a2 = this.f126992H;
            int width = c31935a2.f132851F;
            int iM99571k = c31935a2.m99571k();
            if ((Gravity.getAbsoluteGravity(this.f127003S, this.f126996L.getLayoutDirection()) & 7) == 5) {
                width += this.f126996L.getWidth();
            }
            if (!c30828v.m94835b()) {
                if (c30828v.f127126e != null) {
                    c30828v.m94837d(width, iM99571k, true, true);
                }
            }
            InterfaceC30829w interfaceC30829w2 = this.f126998N;
            if (interfaceC30829w2 != null) {
                interfaceC30829w2.mo16448s(subMenuC30810d0);
            }
            return true;
        }
        return false;
    }

    @Override // p444r.AbstractC30826t
    /* JADX INFO: renamed from: k */
    public final void mo94788k(MenuC30818l menuC30818l) {
    }

    @Override // p444r.InterfaceC30806b0
    /* JADX INFO: renamed from: m */
    public final C31974k1 mo94786m() {
        return this.f126992H.f132874y;
    }

    @Override // p444r.AbstractC30826t
    /* JADX INFO: renamed from: n */
    public final void mo94789n(View view) {
        this.f126996L = view;
    }

    @Override // p444r.AbstractC30826t
    /* JADX INFO: renamed from: o */
    public final void mo94790o(boolean z4) {
        this.f127007z.f127050c = z4;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f127000P = true;
        this.f127006y.m94815d(true);
        ViewTreeObserver viewTreeObserver = this.f126999O;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f126999O = this.f126997M.getViewTreeObserver();
            }
            this.f126999O.removeGlobalOnLayoutListener(this.f126993I);
            this.f126999O = null;
        }
        this.f126997M.removeOnAttachStateChangeListener(this.f126994J);
        PopupWindow.OnDismissListener onDismissListener = this.f126995K;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i13, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i13 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p444r.AbstractC30826t
    /* JADX INFO: renamed from: p */
    public final void mo94791p(int i13) {
        this.f127003S = i13;
    }

    @Override // p444r.AbstractC30826t
    /* JADX INFO: renamed from: q */
    public final void mo94792q(int i13) {
        this.f126992H.f132851F = i13;
    }

    @Override // p444r.AbstractC30826t
    /* JADX INFO: renamed from: r */
    public final void mo94793r(PopupWindow.OnDismissListener onDismissListener) {
        this.f126995K = onDismissListener;
    }

    @Override // p444r.AbstractC30826t
    /* JADX INFO: renamed from: s */
    public final void mo94794s(boolean z4) {
        this.f127004T = z4;
    }

    @Override // p444r.AbstractC30826t
    /* JADX INFO: renamed from: t */
    public final void mo94795t(int i13) {
        this.f126992H.m99570h(i13);
    }
}
