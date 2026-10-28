package androidx.databinding;

import android.view.View;

/* JADX INFO: renamed from: androidx.databinding.r */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1188r implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AbstractC1168a0.getBinding(view).mRebindRunnable.run();
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
