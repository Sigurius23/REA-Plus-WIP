package p314m;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import p184h5.AbstractC16871f0;
import p184h5.AbstractC16901p0;
import qg3.C30352d;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: m.l0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C24851l0 extends AbstractC37978j {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f97344d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C24855n0 f97345e;

    public /* synthetic */ C24851l0(C24855n0 c24855n0, int i13) {
        this.f97344d = i13;
        this.f97345e = c24855n0;
    }

    @Override // p184h5.InterfaceC16916u0
    /* JADX INFO: renamed from: c */
    public final void mo30520c() {
        View view;
        int i13 = this.f97344d;
        C24855n0 c24855n0 = this.f97345e;
        switch (i13) {
            case 0:
                if (c24855n0.f97367o && (view = c24855n0.f97359g) != null) {
                    view.setTranslationY(0.0f);
                    c24855n0.f97356d.setTranslationY(0.0f);
                }
                c24855n0.f97356d.setVisibility(8);
                c24855n0.f97356d.setTransitioning(false);
                c24855n0.f97371s = null;
                C30352d c30352d = c24855n0.f97363k;
                if (c30352d != null) {
                    c30352d.mo91067D(c24855n0.f97362j);
                    c24855n0.f97362j = null;
                    c24855n0.f97363k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = c24855n0.f97355c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                    AbstractC16871f0.m47500c(actionBarOverlayLayout);
                }
                break;
            default:
                c24855n0.f97371s = null;
                c24855n0.f97356d.requestLayout();
                break;
        }
    }
}
