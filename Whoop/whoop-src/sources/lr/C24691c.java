package lr;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000.AbstractC11266d;
import p413q4.AbstractC29957b;
import p463rj.AbstractC31479j;
import p479s4.AbstractC32131l;

/* JADX INFO: renamed from: lr.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C24691c extends AbstractC32131l {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f96598w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC29957b f96599x;

    public /* synthetic */ C24691c(AbstractC29957b abstractC29957b, int i13) {
        this.f96598w = i13;
        this.f96599x = abstractC29957b;
    }

    @Override // p479s4.AbstractC32131l
    /* JADX INFO: renamed from: f */
    public final int mo72284f(View view, int i13) {
        switch (this.f96598w) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f96599x;
                return AbstractC31479j.m96939r(i13, sideSheetBehavior.f21019a.mo72268A(), sideSheetBehavior.f21019a.mo72283z());
            default:
                return view.getLeft();
        }
    }

    @Override // p479s4.AbstractC32131l
    /* JADX INFO: renamed from: g */
    public final int mo72285g(View view, int i13) {
        switch (this.f96598w) {
            case 0:
                return view.getTop();
            default:
                return AbstractC31479j.m96939r(i13, ((BottomSheetBehavior) this.f96599x).m15695Q(), mo72287l());
        }
    }

    @Override // p479s4.AbstractC32131l
    /* JADX INFO: renamed from: k */
    public int mo72286k(View view) {
        switch (this.f96598w) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f96599x;
                return sideSheetBehavior.f21030l + sideSheetBehavior.f21033o;
            default:
                return super.mo72286k(view);
        }
    }

    @Override // p479s4.AbstractC32131l
    /* JADX INFO: renamed from: l */
    public int mo72287l() {
        switch (this.f96598w) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f96599x;
                return bottomSheetBehavior.f20781I ? bottomSheetBehavior.f20792T : bottomSheetBehavior.f20779G;
            default:
                return super.mo72287l();
        }
    }

    @Override // p479s4.AbstractC32131l
    /* JADX INFO: renamed from: o */
    public final void mo72288o(int i13) {
        switch (this.f96598w) {
            case 0:
                if (i13 == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f96599x;
                    if (sideSheetBehavior.f21025g) {
                        sideSheetBehavior.m15776J(1);
                    }
                }
                break;
            default:
                if (i13 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f96599x;
                    if (bottomSheetBehavior.f20783K) {
                        bottomSheetBehavior.m15702X(1);
                    }
                }
                break;
        }
    }

    @Override // p479s4.AbstractC32131l
    /* JADX INFO: renamed from: p */
    public final void mo72289p(View view, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f96598w) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f96599x;
                WeakReference weakReference = sideSheetBehavior.f21035q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f21019a.mo72279k0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f21040v;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f21019a.mo72277i(i13);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw AbstractC11266d.m30454h(it);
                }
                return;
            default:
                ((BottomSheetBehavior) this.f96599x).m15694M(i14);
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0145  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // p479s4.AbstractC32131l
    /* JADX INFO: renamed from: q */
    public final void mo72290q(View view, float f13, float f14) {
        int i13;
        switch (this.f96598w) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f96599x;
                if (!sideSheetBehavior.f21019a.mo72272I(f13)) {
                    if (!sideSheetBehavior.f21019a.mo72275e0(view, f13)) {
                        if (f13 == 0.0f || Math.abs(f13) <= Math.abs(f14)) {
                            int left = view.getLeft();
                            i13 = Math.abs(left - sideSheetBehavior.f21019a.mo72281x()) < Math.abs(left - sideSheetBehavior.f21019a.mo72282y()) ? 3 : 5;
                        }
                    } else if (sideSheetBehavior.f21019a.mo72274L(f13, f14) || sideSheetBehavior.f21019a.mo72273K(view)) {
                    }
                }
                sideSheetBehavior.m15778L(view, i13, true);
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f96599x;
                int i14 = 6;
                if (f14 < 0.0f) {
                    if (bottomSheetBehavior.f20801b) {
                        i14 = 3;
                    } else {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        bottomSheetBehavior.getClass();
                        if (top <= bottomSheetBehavior.f20777E) {
                            i14 = 3;
                        }
                    }
                } else if (bottomSheetBehavior.f20781I && bottomSheetBehavior.m15703Y(view, f14)) {
                    if (Math.abs(f13) >= Math.abs(f14) || f14 <= bottomSheetBehavior.f20805d) {
                        if (view.getTop() > (bottomSheetBehavior.m15695Q() + bottomSheetBehavior.f20792T) / 2) {
                            i14 = 5;
                        } else if (bottomSheetBehavior.f20801b || Math.abs(view.getTop() - bottomSheetBehavior.m15695Q()) < Math.abs(view.getTop() - bottomSheetBehavior.f20777E)) {
                            i14 = 3;
                        }
                    } else {
                        i14 = 5;
                    }
                } else if (f14 == 0.0f || Math.abs(f13) > Math.abs(f14)) {
                    int top2 = view.getTop();
                    if (!bottomSheetBehavior.f20801b) {
                        int i15 = bottomSheetBehavior.f20777E;
                        if (top2 < i15) {
                            if (top2 < Math.abs(top2 - bottomSheetBehavior.f20779G)) {
                                i14 = 3;
                            } else {
                                bottomSheetBehavior.getClass();
                            }
                        } else if (Math.abs(top2 - i15) < Math.abs(top2 - bottomSheetBehavior.f20779G)) {
                            bottomSheetBehavior.getClass();
                        } else {
                            i14 = 4;
                        }
                    } else if (Math.abs(top2 - bottomSheetBehavior.f20776D) < Math.abs(top2 - bottomSheetBehavior.f20779G)) {
                        i14 = 3;
                    } else {
                        i14 = 4;
                    }
                } else if (bottomSheetBehavior.f20801b) {
                    i14 = 4;
                } else {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - bottomSheetBehavior.f20777E) < Math.abs(top3 - bottomSheetBehavior.f20779G)) {
                        bottomSheetBehavior.getClass();
                    } else {
                        i14 = 4;
                    }
                }
                bottomSheetBehavior.getClass();
                bottomSheetBehavior.m15704Z(view, i14, true);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0031  */
    @Override // p479s4.AbstractC32131l
    /* JADX INFO: renamed from: t */
    public final boolean mo72291t(View view, int i13) {
        WeakReference weakReference;
        WeakReference weakReference2;
        switch (this.f96598w) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f96599x;
                return (sideSheetBehavior.f21026h == 1 || (weakReference = sideSheetBehavior.f21034p) == null || weakReference.get() != view) ? false : true;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f96599x;
                int i14 = bottomSheetBehavior.f20784L;
                if (i14 != 1 && !bottomSheetBehavior.f20802b0) {
                    if (i14 == 3 && bottomSheetBehavior.f20798Z == i13) {
                        WeakReference weakReference3 = bottomSheetBehavior.f20794V;
                        View view2 = weakReference3 != null ? (View) weakReference3.get() : null;
                        if (view2 == null || !view2.canScrollVertically(-1)) {
                            System.currentTimeMillis();
                            weakReference2 = bottomSheetBehavior.f20793U;
                            if (weakReference2 == null) {
                            }
                        }
                    } else {
                        System.currentTimeMillis();
                        weakReference2 = bottomSheetBehavior.f20793U;
                        if (weakReference2 == null && weakReference2.get() == view) {
                            return true;
                        }
                    }
                }
                return false;
        }
    }
}
