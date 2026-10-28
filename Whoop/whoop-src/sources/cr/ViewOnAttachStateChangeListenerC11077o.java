package cr;

import android.view.View;
import java.util.WeakHashMap;
import p184h5.AbstractC16871f0;
import p184h5.AbstractC16901p0;

/* JADX INFO: renamed from: cr.o */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewOnAttachStateChangeListenerC11077o implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16871f0.m47500c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
