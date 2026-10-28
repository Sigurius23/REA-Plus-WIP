package p413q4;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: q4.d */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewGroupOnHierarchyChangeListenerC29959d implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ CoordinatorLayout f122363w;

    public ViewGroupOnHierarchyChangeListenerC29959d(CoordinatorLayout coordinatorLayout) {
        this.f122363w = coordinatorLayout;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f122363w.f5253R;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        CoordinatorLayout coordinatorLayout = this.f122363w;
        coordinatorLayout.m3665p(2);
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.f5253R;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
