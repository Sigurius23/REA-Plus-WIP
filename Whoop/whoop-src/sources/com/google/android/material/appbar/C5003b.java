package com.google.android.material.appbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p184h5.C16858b;
import p211i5.C18091d;
import p211i5.C18093f;
import p311lq.C24643b;

/* JADX INFO: renamed from: com.google.android.material.appbar.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C5003b extends C16858b {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AppBarLayout f20749d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ CoordinatorLayout f20750e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AppBarLayout.BaseBehavior f20751f;

    public C5003b(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.f20751f = baseBehavior;
        this.f20749d = appBarLayout;
        this.f20750e = coordinatorLayout;
    }

    @Override // p184h5.C16858b
    /* JADX INFO: renamed from: d */
    public final void mo5304d(View view, C18093f c18093f) {
        this.f64777a.onInitializeAccessibilityNodeInfo(view, c18093f.f70317a);
        c18093f.m51953h(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.f20749d;
        if (appBarLayout.getTotalScrollRange() == 0) {
            return;
        }
        CoordinatorLayout coordinatorLayout = this.f20750e;
        AppBarLayout.BaseBehavior baseBehavior = this.f20751f;
        View viewM15655N = AppBarLayout.BaseBehavior.m15655N(baseBehavior, coordinatorLayout);
        if (viewM15655N == null) {
            return;
        }
        int childCount = appBarLayout.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            if (((C24643b) appBarLayout.getChildAt(i13).getLayoutParams()).f96396a != 0) {
                if (baseBehavior.mo15662K() != (-appBarLayout.getTotalScrollRange())) {
                    c18093f.m51948b(C18091d.f70304h);
                    c18093f.m51956k(true);
                }
                if (baseBehavior.mo15662K() != 0) {
                    if (!viewM15655N.canScrollVertically(-1)) {
                        c18093f.m51948b(C18091d.f70305i);
                        c18093f.m51956k(true);
                        return;
                    } else {
                        if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                            c18093f.m51948b(C18091d.f70305i);
                            c18093f.m51956k(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // p184h5.C16858b
    /* JADX INFO: renamed from: g */
    public final boolean mo5307g(View view, int i13, Bundle bundle) {
        AppBarLayout appBarLayout = this.f20749d;
        if (i13 == 4096) {
            appBarLayout.setExpanded(false);
            return true;
        }
        if (i13 != 8192) {
            return super.mo5307g(view, i13, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.f20751f;
        if (baseBehavior.mo15662K() != 0) {
            View viewM15655N = AppBarLayout.BaseBehavior.m15655N(baseBehavior, this.f20750e);
            if (!viewM15655N.canScrollVertically(-1)) {
                appBarLayout.setExpanded(true);
                return true;
            }
            int i14 = -appBarLayout.getDownNestedPreScrollRange();
            if (i14 != 0) {
                baseBehavior.m15665Q(this.f20750e, this.f20749d, viewM15655N, i14, new int[]{0, 0});
                return true;
            }
        }
        return false;
    }
}
