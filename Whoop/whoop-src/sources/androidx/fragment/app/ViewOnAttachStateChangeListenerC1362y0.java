package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.fragment.app.y0 */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnAttachStateChangeListenerC1362y0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C1366z1 f5845w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ LayoutInflaterFactory2C1365z0 f5846x;

    public ViewOnAttachStateChangeListenerC1362y0(LayoutInflaterFactory2C1365z0 layoutInflaterFactory2C1365z0, C1366z1 c1366z1) {
        this.f5846x = layoutInflaterFactory2C1365z0;
        this.f5845w = c1366z1;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C1366z1 c1366z1 = this.f5845w;
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = c1366z1.f5852c;
        c1366z1.m4256k();
        C1343s.m4213j((ViewGroup) abstractComponentCallbacksC1320m0.mView.getParent(), this.f5846x.f5849w).m4222i();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
