package com.google.android.material.snackbar;

import a00.C0072g;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import la.C23548b;
import mr.AbstractC25905k;
import mr.C25901g;

/* JADX INFO: loaded from: classes6.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* JADX INFO: renamed from: i */
    public final C23548b f21042i;

    public BaseTransientBottomBar$Behavior() {
        C23548b c23548b = new C23548b(10, (byte) 0);
        this.f20770f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f20771g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f20769e = 0;
        this.f21042i = c23548b;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* JADX INFO: renamed from: I */
    public final boolean mo15685I(View view) {
        this.f21042i.getClass();
        return view instanceof AbstractC25905k;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, p413q4.AbstractC29957b
    /* JADX INFO: renamed from: o */
    public final boolean mo15686o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C23548b c23548b = this.f21042i;
        c23548b.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                C0072g.m163o().m165A((C25901g) c23548b.f93280x);
            }
        } else if (coordinatorLayout.m3664o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            C0072g.m163o().m207y((C25901g) c23548b.f93280x);
        }
        return super.mo15686o(coordinatorLayout, view, motionEvent);
    }
}
