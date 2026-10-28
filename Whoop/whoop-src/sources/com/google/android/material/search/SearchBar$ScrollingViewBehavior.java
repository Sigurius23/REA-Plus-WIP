package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: classes6.dex */
public class SearchBar$ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

    /* JADX INFO: renamed from: g */
    public boolean f21018g;

    public SearchBar$ScrollingViewBehavior() {
        this.f21018g = false;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, p413q4.AbstractC29957b
    /* JADX INFO: renamed from: l */
    public final boolean mo15675l(CoordinatorLayout coordinatorLayout, View view, View view2) {
        super.mo15675l(coordinatorLayout, view, view2);
        if (!this.f21018g && (view2 instanceof AppBarLayout)) {
            this.f21018g = true;
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            appBarLayout.setBackgroundColor(0);
            appBarLayout.setTargetElevation(0.0f);
        }
        return false;
    }

    public SearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21018g = false;
    }
}
