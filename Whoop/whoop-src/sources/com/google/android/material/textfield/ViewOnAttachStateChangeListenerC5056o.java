package com.google.android.material.textfield;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import p184h5.AbstractC16901p0;
import p211i5.AccessibilityManagerTouchExplorationStateChangeListenerC18089b;

/* JADX INFO: renamed from: com.google.android.material.textfield.o */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewOnAttachStateChangeListenerC5056o implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C5058q f21235w;

    public ViewOnAttachStateChangeListenerC5056o(C5058q c5058q) {
        this.f21235w = c5058q;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C5058q c5058q = this.f21235w;
        AccessibilityManager accessibilityManager = c5058q.f21256T;
        if (c5058q.f21257U == null || accessibilityManager == null) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        if (c5058q.isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC18089b(c5058q.f21257U));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        C5058q c5058q = this.f21235w;
        C5052k c5052k = c5058q.f21257U;
        if (c5052k == null || (accessibilityManager = c5058q.f21256T) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC18089b(c5052k));
    }
}
