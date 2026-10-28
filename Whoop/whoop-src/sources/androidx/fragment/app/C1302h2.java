package androidx.fragment.app;

import android.transition.Transition;

/* JADX INFO: renamed from: androidx.fragment.app.h2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1302h2 implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Runnable f5625a;

    public C1302h2(Runnable runnable) {
        this.f5625a = runnable;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.f5625a.run();
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }
}
