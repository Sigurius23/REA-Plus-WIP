package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.g2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1298g2 implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f5609a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f5610b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f5611c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ArrayList f5612d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1306i2 f5613e;

    public C1298g2(C1306i2 c1306i2, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f5613e = c1306i2;
        this.f5609a = obj;
        this.f5610b = arrayList;
        this.f5611c = obj2;
        this.f5612d = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        C1306i2 c1306i2 = this.f5613e;
        Object obj = this.f5609a;
        if (obj != null) {
            c1306i2.m4089A(obj, this.f5610b, null);
        }
        Object obj2 = this.f5611c;
        if (obj2 != null) {
            c1306i2.m4089A(obj2, this.f5612d, null);
        }
    }
}
