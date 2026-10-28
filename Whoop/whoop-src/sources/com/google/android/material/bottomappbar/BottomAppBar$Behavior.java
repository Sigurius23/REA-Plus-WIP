package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import p376oq.ViewOnLayoutChangeListenerC28103a;

/* JADX INFO: loaded from: classes6.dex */
public class BottomAppBar$Behavior extends HideBottomViewOnScrollBehavior<Object> {
    public BottomAppBar$Behavior() {
        new ViewOnLayoutChangeListenerC28103a(this, 0);
        new Rect();
    }

    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, p413q4.AbstractC29957b
    /* JADX INFO: renamed from: E */
    public final boolean mo15660E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i13, int i14) {
        throw new ClassCastException();
    }

    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, p413q4.AbstractC29957b
    /* JADX INFO: renamed from: p */
    public final boolean mo15668p(CoordinatorLayout coordinatorLayout, View view, int i13) {
        throw new ClassCastException();
    }

    public BottomAppBar$Behavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new ViewOnLayoutChangeListenerC28103a(this, 0);
        new Rect();
    }
}
