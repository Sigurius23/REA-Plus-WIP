package p468rr;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableBehavior;
import p689zq.InterfaceC40954a;

/* JADX INFO: renamed from: rr.a */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewTreeObserverOnPreDrawListenerC31759a implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ View f131519w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f131520x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC40954a f131521y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ ExpandableBehavior f131522z;

    public ViewTreeObserverOnPreDrawListenerC31759a(ExpandableBehavior expandableBehavior, View view, int i13, InterfaceC40954a interfaceC40954a) {
        this.f131522z = expandableBehavior;
        this.f131519w = view;
        this.f131520x = i13;
        this.f131521y = interfaceC40954a;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.f131519w;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.f131522z;
        if (expandableBehavior.f21367a == this.f131520x) {
            Object obj = this.f131521y;
            expandableBehavior.mo15918I((View) obj, view, ((FloatingActionButton) obj).f20993O.f36245b, false);
        }
        return false;
    }
}
