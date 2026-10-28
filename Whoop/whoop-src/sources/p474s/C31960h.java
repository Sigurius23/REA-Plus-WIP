package p474s;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.whoop.android.R;
import java.util.ArrayList;
import p444r.AbstractC30826t;
import p444r.ActionProviderVisibilityListenerC30821o;
import p444r.C30820n;
import p444r.InterfaceC30829w;
import p444r.InterfaceC30830x;
import p444r.InterfaceC30831y;
import p444r.InterfaceC30832z;
import p444r.MenuC30818l;
import p444r.SubMenuC30810d0;
import q30.C29934u0;

/* JADX INFO: renamed from: s.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C31960h implements InterfaceC30830x {

    /* JADX INFO: renamed from: E */
    public InterfaceC30829w f132682E;

    /* JADX INFO: renamed from: H */
    public InterfaceC30832z f132685H;

    /* JADX INFO: renamed from: I */
    public C31956g f132686I;

    /* JADX INFO: renamed from: J */
    public Drawable f132687J;

    /* JADX INFO: renamed from: K */
    public boolean f132688K;

    /* JADX INFO: renamed from: L */
    public boolean f132689L;

    /* JADX INFO: renamed from: M */
    public boolean f132690M;

    /* JADX INFO: renamed from: N */
    public int f132691N;

    /* JADX INFO: renamed from: O */
    public int f132692O;

    /* JADX INFO: renamed from: P */
    public int f132693P;

    /* JADX INFO: renamed from: Q */
    public boolean f132694Q;

    /* JADX INFO: renamed from: S */
    public C31944d f132696S;

    /* JADX INFO: renamed from: T */
    public C31944d f132697T;

    /* JADX INFO: renamed from: U */
    public RunnableC31952f f132698U;

    /* JADX INFO: renamed from: V */
    public C31948e f132699V;

    /* JADX INFO: renamed from: w */
    public final Context f132701w;

    /* JADX INFO: renamed from: x */
    public Context f132702x;

    /* JADX INFO: renamed from: y */
    public MenuC30818l f132703y;

    /* JADX INFO: renamed from: z */
    public final LayoutInflater f132704z;

    /* JADX INFO: renamed from: F */
    public final int f132683F = R.layout.abc_action_menu_layout;

    /* JADX INFO: renamed from: G */
    public final int f132684G = R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: R */
    public final SparseBooleanArray f132695R = new SparseBooleanArray();

    /* JADX INFO: renamed from: W */
    public final C29934u0 f132700W = new C29934u0(this, 12);

    public C31960h(Context context) {
        this.f132701w = context;
        this.f132704z = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final View m99448a(C30820n c30820n, View view, ViewGroup viewGroup) {
        View actionView = c30820n.getActionView();
        if (actionView == null || c30820n.m94831e()) {
            InterfaceC30831y interfaceC30831y = view instanceof InterfaceC30831y ? (InterfaceC30831y) view : (InterfaceC30831y) this.f132704z.inflate(this.f132684G, viewGroup, false);
            interfaceC30831y.mo3252c(c30820n);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC30831y;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f132685H);
            if (this.f132699V == null) {
                this.f132699V = new C31948e(this);
            }
            actionMenuItemView.setPopupCallback(this.f132699V);
            actionView = (View) interfaceC30831y;
        }
        actionView.setVisibility(c30820n.f127085D ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C31968j)) {
            actionView.setLayoutParams(ActionMenuView.m3286e(layoutParams));
        }
        return actionView;
    }

    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: b */
    public final boolean mo3335b(C30820n c30820n) {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m99449c() {
        Object obj;
        RunnableC31952f runnableC31952f = this.f132698U;
        if (runnableC31952f != null && (obj = this.f132685H) != null) {
            ((View) obj).removeCallbacks(runnableC31952f);
            this.f132698U = null;
            return true;
        }
        C31944d c31944d = this.f132696S;
        if (c31944d == null) {
            return false;
        }
        if (c31944d.m94835b()) {
            c31944d.f127130i.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: d */
    public final void mo3336d() {
        int i13;
        ViewGroup viewGroup = (ViewGroup) this.f132685H;
        ArrayList arrayList = null;
        boolean z4 = false;
        if (viewGroup != null) {
            MenuC30818l menuC30818l = this.f132703y;
            if (menuC30818l != null) {
                menuC30818l.m94818j();
                ArrayList arrayListM94819m = this.f132703y.m94819m();
                int size = arrayListM94819m.size();
                i13 = 0;
                for (int i14 = 0; i14 < size; i14++) {
                    C30820n c30820n = (C30820n) arrayListM94819m.get(i14);
                    if ((c30820n.f127109y & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i13);
                        C30820n itemData = childAt instanceof InterfaceC30831y ? ((InterfaceC30831y) childAt).getItemData() : null;
                        View viewM99448a = m99448a(c30820n, childAt, viewGroup);
                        if (c30820n != itemData) {
                            viewM99448a.setPressed(false);
                            viewM99448a.jumpDrawablesToCurrentState();
                        }
                        if (viewM99448a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewM99448a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewM99448a);
                            }
                            ((ViewGroup) this.f132685H).addView(viewM99448a, i13);
                        }
                        i13++;
                    }
                }
            } else {
                i13 = 0;
            }
            while (i13 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i13) == this.f132686I) {
                    i13++;
                } else {
                    viewGroup.removeViewAt(i13);
                }
            }
        }
        ((View) this.f132685H).requestLayout();
        MenuC30818l menuC30818l2 = this.f132703y;
        if (menuC30818l2 != null) {
            menuC30818l2.m94818j();
            ArrayList arrayList2 = menuC30818l2.f127063j;
            int size2 = arrayList2.size();
            for (int i15 = 0; i15 < size2; i15++) {
                ActionProviderVisibilityListenerC30821o actionProviderVisibilityListenerC30821o = ((C30820n) arrayList2.get(i15)).f127083B;
            }
        }
        MenuC30818l menuC30818l3 = this.f132703y;
        if (menuC30818l3 != null) {
            menuC30818l3.m94818j();
            arrayList = menuC30818l3.f127064k;
        }
        if (this.f132689L && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z4 = !((C30820n) arrayList.get(0)).f127085D;
            } else if (size3 > 0) {
                z4 = true;
            }
        }
        if (z4) {
            if (this.f132686I == null) {
                this.f132686I = new C31956g(this, this.f132701w);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f132686I.getParent();
            if (viewGroup3 != this.f132685H) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f132686I);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f132685H;
                C31956g c31956g = this.f132686I;
                actionMenuView.getClass();
                C31968j c31968jM3285d = ActionMenuView.m3285d();
                c31968jM3285d.f132722a = true;
                actionMenuView.addView(c31956g, c31968jM3285d);
            }
        } else {
            C31956g c31956g2 = this.f132686I;
            if (c31956g2 != null) {
                Object parent = c31956g2.getParent();
                Object obj = this.f132685H;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f132686I);
                }
            }
        }
        ((ActionMenuView) this.f132685H).setOverflowReserved(this.f132689L);
    }

    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: e */
    public final boolean mo3337e(C30820n c30820n) {
        return false;
    }

    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: f */
    public final void mo3338f(Context context, MenuC30818l menuC30818l) {
        this.f132702x = context;
        LayoutInflater.from(context);
        this.f132703y = menuC30818l;
        Resources resources = context.getResources();
        if (!this.f132690M) {
            this.f132689L = true;
        }
        int i13 = 2;
        this.f132691N = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i14 = configuration.screenWidthDp;
        int i15 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i14 > 600 || ((i14 > 960 && i15 > 720) || (i14 > 720 && i15 > 960))) {
            i13 = 5;
        } else if (i14 >= 500 || ((i14 > 640 && i15 > 480) || (i14 > 480 && i15 > 640))) {
            i13 = 4;
        } else if (i14 >= 360) {
            i13 = 3;
        }
        this.f132693P = i13;
        int measuredWidth = this.f132691N;
        if (this.f132689L) {
            if (this.f132686I == null) {
                C31956g c31956g = new C31956g(this, this.f132701w);
                this.f132686I = c31956g;
                if (this.f132688K) {
                    c31956g.setImageDrawable(this.f132687J);
                    this.f132687J = null;
                    this.f132688K = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f132686I.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f132686I.getMeasuredWidth();
        } else {
            this.f132686I = null;
        }
        this.f132692O = measuredWidth;
        float f13 = resources.getDisplayMetrics().density;
    }

    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: g */
    public final void mo3339g(MenuC30818l menuC30818l, boolean z4) {
        m99449c();
        C31944d c31944d = this.f132697T;
        if (c31944d != null && c31944d.m94835b()) {
            c31944d.f127130i.dismiss();
        }
        InterfaceC30829w interfaceC30829w = this.f132682E;
        if (interfaceC30829w != null) {
            interfaceC30829w.mo16445g(menuC30818l, z4);
        }
    }

    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: h */
    public final void mo94787h(InterfaceC30829w interfaceC30829w) {
        throw null;
    }

    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: i */
    public final boolean mo3340i() {
        int size;
        ArrayList arrayListM94819m;
        int i13;
        boolean z4;
        C31960h c31960h = this;
        MenuC30818l menuC30818l = c31960h.f132703y;
        if (menuC30818l != null) {
            arrayListM94819m = menuC30818l.m94819m();
            size = arrayListM94819m.size();
        } else {
            size = 0;
            arrayListM94819m = null;
        }
        int i14 = c31960h.f132693P;
        int i15 = c31960h.f132692O;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c31960h.f132685H;
        int i16 = 0;
        boolean z13 = false;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            i13 = 2;
            z4 = true;
            if (i16 >= size) {
                break;
            }
            C30820n c30820n = (C30820n) arrayListM94819m.get(i16);
            int i19 = c30820n.f127110z;
            if ((i19 & 2) == 2) {
                i17++;
            } else if ((i19 & 1) == 1) {
                i18++;
            } else {
                z13 = true;
            }
            if (c31960h.f132694Q && c30820n.f127085D) {
                i14 = 0;
            }
            i16++;
        }
        if (c31960h.f132689L && (z13 || i18 + i17 > i14)) {
            i14--;
        }
        int i24 = i14 - i17;
        SparseBooleanArray sparseBooleanArray = c31960h.f132695R;
        sparseBooleanArray.clear();
        int i25 = 0;
        int i26 = 0;
        while (i25 < size) {
            C30820n c30820n2 = (C30820n) arrayListM94819m.get(i25);
            int i27 = c30820n2.f127110z;
            boolean z14 = (i27 & 2) == i13 ? z4 : false;
            int i28 = c30820n2.f127087c;
            if (z14) {
                View viewM99448a = c31960h.m99448a(c30820n2, null, viewGroup);
                viewM99448a.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewM99448a.getMeasuredWidth();
                i15 -= measuredWidth;
                if (i26 == 0) {
                    i26 = measuredWidth;
                }
                if (i28 != 0) {
                    sparseBooleanArray.put(i28, z4);
                }
                c30820n2.m94832f(z4);
            } else {
                if ((i27 & 1) == z4) {
                    boolean z15 = sparseBooleanArray.get(i28);
                    boolean z16 = ((i24 > 0 || z15) && i15 > 0) ? z4 : false;
                    if (z16) {
                        View viewM99448a2 = c31960h.m99448a(c30820n2, null, viewGroup);
                        viewM99448a2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewM99448a2.getMeasuredWidth();
                        i15 -= measuredWidth2;
                        if (i26 == 0) {
                            i26 = measuredWidth2;
                        }
                        z16 &= i15 + i26 > 0;
                    }
                    if (z16 && i28 != 0) {
                        sparseBooleanArray.put(i28, true);
                    } else if (z15) {
                        sparseBooleanArray.put(i28, false);
                        for (int i29 = 0; i29 < i25; i29++) {
                            C30820n c30820n3 = (C30820n) arrayListM94819m.get(i29);
                            if (c30820n3.f127087c == i28) {
                                if ((c30820n3.f127109y & 32) == 32) {
                                    i24++;
                                }
                                c30820n3.m94832f(false);
                            }
                        }
                    }
                    if (z16) {
                        i24--;
                    }
                    c30820n2.m94832f(z16);
                } else {
                    c30820n2.m94832f(false);
                }
                i25++;
                i13 = 2;
                c31960h = this;
                z4 = true;
            }
            i25++;
            i13 = 2;
            c31960h = this;
            z4 = true;
        }
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: j */
    public final boolean mo3341j(SubMenuC30810d0 subMenuC30810d0) {
        boolean z4;
        if (subMenuC30810d0.hasVisibleItems()) {
            SubMenuC30810d0 subMenuC30810d1 = subMenuC30810d0;
            while (true) {
                MenuC30818l menuC30818l = subMenuC30810d1.f127010A;
                if (menuC30818l == this.f132703y) {
                    break;
                }
                subMenuC30810d1 = (SubMenuC30810d0) menuC30818l;
            }
            C30820n c30820n = subMenuC30810d1.f127011B;
            ViewGroup viewGroup = (ViewGroup) this.f132685H;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = viewGroup.getChildAt(i13);
                    if ((childAt instanceof InterfaceC30831y) && ((InterfaceC30831y) childAt).getItemData() == c30820n) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                subMenuC30810d0.f127011B.getClass();
                int size = subMenuC30810d0.f127060g.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size) {
                        z4 = false;
                        break;
                    }
                    MenuItem item = subMenuC30810d0.getItem(i14);
                    if (item.isVisible() && item.getIcon() != null) {
                        z4 = true;
                        break;
                    }
                    i14++;
                }
                C31944d c31944d = new C31944d(this, this.f132702x, subMenuC30810d0, view);
                this.f132697T = c31944d;
                c31944d.f127128g = z4;
                AbstractC30826t abstractC30826t = c31944d.f127130i;
                if (abstractC30826t != null) {
                    abstractC30826t.mo94790o(z4);
                }
                C31944d c31944d2 = this.f132697T;
                if (!c31944d2.m94835b()) {
                    if (c31944d2.f127126e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c31944d2.m94837d(0, 0, false, false);
                }
                InterfaceC30829w interfaceC30829w = this.f132682E;
                if (interfaceC30829w != null) {
                    interfaceC30829w.mo16448s(subMenuC30810d0);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m99450k() {
        C31944d c31944d = this.f132696S;
        return c31944d != null && c31944d.m94835b();
    }

    /* JADX INFO: renamed from: l */
    public final boolean m99451l() {
        MenuC30818l menuC30818l;
        if (!this.f132689L || m99450k() || (menuC30818l = this.f132703y) == null || this.f132685H == null || this.f132698U != null) {
            return false;
        }
        menuC30818l.m94818j();
        if (menuC30818l.f127064k.isEmpty()) {
            return false;
        }
        RunnableC31952f runnableC31952f = new RunnableC31952f(this, new C31944d(this, this.f132702x, this.f132703y, this.f132686I));
        this.f132698U = runnableC31952f;
        ((View) this.f132685H).post(runnableC31952f);
        return true;
    }
}
