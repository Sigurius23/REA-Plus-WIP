package androidx.fragment.app;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.f2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1294f2 implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f5599a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f5600b;

    public C1294f2(View view, ArrayList arrayList) {
        this.f5599a = view;
        this.f5600b = arrayList;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.f5599a.setVisibility(8);
        ArrayList arrayList = this.f5600b;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((View) arrayList.get(i13)).setVisibility(0);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        transition.removeListener(this);
        transition.addListener(this);
    }
}
