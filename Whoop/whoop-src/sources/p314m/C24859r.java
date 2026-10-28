package p314m;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import p036bq.RunnableC3543b;
import p184h5.AbstractC16871f0;
import p184h5.AbstractC16901p0;
import qg3.C30352d;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: m.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C24859r extends AbstractC37978j {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f97386d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f97387e;

    public /* synthetic */ C24859r(Object obj, int i13) {
        this.f97386d = i13;
        this.f97387e = obj;
    }

    @Override // x43.AbstractC37978j, p184h5.InterfaceC16916u0
    /* JADX INFO: renamed from: b */
    public void mo30519b() {
        int i13 = this.f97386d;
        Object obj = this.f97387e;
        switch (i13) {
            case 0:
                ((LayoutInflaterFactory2C24829a0) ((RunnableC3543b) obj).f14263x).f97220V.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a0 = (LayoutInflaterFactory2C24829a0) obj;
                layoutInflaterFactory2C24829a0.f97220V.setVisibility(0);
                if (layoutInflaterFactory2C24829a0.f97220V.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C24829a0.f97220V.getParent();
                    WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                    AbstractC16871f0.m47500c(view);
                }
                break;
        }
    }

    @Override // p184h5.InterfaceC16916u0
    /* JADX INFO: renamed from: c */
    public final void mo30520c() {
        int i13 = this.f97386d;
        Object obj = this.f97387e;
        switch (i13) {
            case 0:
                LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a0 = (LayoutInflaterFactory2C24829a0) ((RunnableC3543b) obj).f14263x;
                layoutInflaterFactory2C24829a0.f97220V.setAlpha(1.0f);
                layoutInflaterFactory2C24829a0.f97223Y.m47610d(null);
                layoutInflaterFactory2C24829a0.f97223Y = null;
                break;
            case 1:
                LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a1 = (LayoutInflaterFactory2C24829a0) obj;
                layoutInflaterFactory2C24829a1.f97220V.setAlpha(1.0f);
                layoutInflaterFactory2C24829a1.f97223Y.m47610d(null);
                layoutInflaterFactory2C24829a1.f97223Y = null;
                break;
            default:
                LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a2 = (LayoutInflaterFactory2C24829a0) ((C30352d) obj).f124536y;
                layoutInflaterFactory2C24829a2.f97220V.setVisibility(8);
                PopupWindow popupWindow = layoutInflaterFactory2C24829a2.f97221W;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C24829a2.f97220V.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C24829a2.f97220V.getParent();
                    WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                    AbstractC16871f0.m47500c(view);
                }
                layoutInflaterFactory2C24829a2.f97220V.m3263e();
                layoutInflaterFactory2C24829a2.f97223Y.m47610d(null);
                layoutInflaterFactory2C24829a2.f97223Y = null;
                ViewGroup viewGroup = layoutInflaterFactory2C24829a2.f97225a0;
                WeakHashMap weakHashMap2 = AbstractC16901p0.f64851a;
                AbstractC16871f0.m47500c(viewGroup);
                break;
        }
    }
}
