package androidx.fragment.app;

import android.view.View;
import java.util.WeakHashMap;
import p184h5.AbstractC16871f0;
import p184h5.AbstractC16901p0;

/* JADX INFO: renamed from: androidx.fragment.app.y1 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1363y1 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ View f5847w;

    public ViewOnAttachStateChangeListenerC1363y1(View view) {
        this.f5847w = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View view2 = this.f5847w;
        view2.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16871f0.m47500c(view2);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
