package androidx.appcompat.widget;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import p408q.InterfaceC29659c;
import p444r.C30820n;
import p444r.C30822p;
import p444r.InterfaceC30830x;
import p444r.MenuC30818l;
import p444r.SubMenuC30810d0;
import p474s.C31995p2;

/* JADX INFO: renamed from: androidx.appcompat.widget.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C1088b implements InterfaceC30830x {

    /* JADX INFO: renamed from: w */
    public MenuC30818l f4448w;

    /* JADX INFO: renamed from: x */
    public C30820n f4449x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Toolbar f4450y;

    public C1088b(Toolbar toolbar) {
        this.f4450y = toolbar;
    }

    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: b */
    public final boolean mo3335b(C30820n c30820n) {
        Toolbar toolbar = this.f4450y;
        toolbar.m3314g();
        ViewParent parent = toolbar.f4399H.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f4399H);
            }
            toolbar.addView(toolbar.f4399H);
        }
        View actionView = c30820n.getActionView();
        toolbar.f4400I = actionView;
        this.f4449x = c30820n;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f4400I);
            }
            C31995p2 c31995p2GenerateDefaultLayoutParams = toolbar.generateDefaultLayoutParams();
            c31995p2GenerateDefaultLayoutParams.f97197a = (toolbar.f4405N & 112) | 8388611;
            c31995p2GenerateDefaultLayoutParams.f132800b = 2;
            toolbar.f4400I.setLayoutParams(c31995p2GenerateDefaultLayoutParams);
            toolbar.addView(toolbar.f4400I);
        }
        toolbar.m3299C();
        toolbar.requestLayout();
        c30820n.f127085D = true;
        c30820n.f127099o.m94820q(false);
        KeyEvent.Callback callback = toolbar.f4400I;
        if (callback instanceof InterfaceC29659c) {
            ((C30822p) ((InterfaceC29659c) callback)).f127113w.onActionViewExpanded();
        }
        toolbar.m3307K();
        return true;
    }

    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: d */
    public final void mo3336d() {
        if (this.f4449x != null) {
            MenuC30818l menuC30818l = this.f4448w;
            if (menuC30818l != null) {
                int size = menuC30818l.f127060g.size();
                for (int i13 = 0; i13 < size; i13++) {
                    if (this.f4448w.getItem(i13) == this.f4449x) {
                        return;
                    }
                }
            }
            mo3337e(this.f4449x);
        }
    }

    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: e */
    public final boolean mo3337e(C30820n c30820n) {
        Toolbar toolbar = this.f4450y;
        KeyEvent.Callback callback = toolbar.f4400I;
        if (callback instanceof InterfaceC29659c) {
            ((C30822p) ((InterfaceC29659c) callback)).f127113w.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f4400I);
        toolbar.removeView(toolbar.f4399H);
        toolbar.f4400I = null;
        toolbar.m3308a();
        this.f4449x = null;
        toolbar.requestLayout();
        c30820n.f127085D = false;
        c30820n.f127099o.m94820q(false);
        toolbar.m3307K();
        return true;
    }

    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: f */
    public final void mo3338f(Context context, MenuC30818l menuC30818l) {
        C30820n c30820n;
        MenuC30818l menuC30818l2 = this.f4448w;
        if (menuC30818l2 != null && (c30820n = this.f4449x) != null) {
            menuC30818l2.mo94796e(c30820n);
        }
        this.f4448w = menuC30818l;
    }

    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: g */
    public final void mo3339g(MenuC30818l menuC30818l, boolean z4) {
    }

    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: i */
    public final boolean mo3340i() {
        return false;
    }

    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: j */
    public final boolean mo3341j(SubMenuC30810d0 subMenuC30810d0) {
        return false;
    }
}
