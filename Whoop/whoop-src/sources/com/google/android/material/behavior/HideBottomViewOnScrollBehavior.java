package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ar.C1916d;
import com.whoop.android.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000.AbstractC11266d;
import p287kq.AbstractC22766a;
import p413q4.AbstractC29957b;
import p558vp.AbstractC36259c;

/* JADX INFO: loaded from: classes6.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC29957b {

    /* JADX INFO: renamed from: b */
    public int f20758b;

    /* JADX INFO: renamed from: c */
    public int f20759c;

    /* JADX INFO: renamed from: d */
    public TimeInterpolator f20760d;

    /* JADX INFO: renamed from: e */
    public TimeInterpolator f20761e;

    /* JADX INFO: renamed from: h */
    public ViewPropertyAnimator f20764h;

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f20757a = new LinkedHashSet();

    /* JADX INFO: renamed from: f */
    public int f20762f = 0;

    /* JADX INFO: renamed from: g */
    public int f20763g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: E */
    public boolean mo15660E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i13, int i14) {
        return i13 == 2;
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: p */
    public boolean mo15668p(CoordinatorLayout coordinatorLayout, View view, int i13) {
        this.f20762f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f20758b = AbstractC36259c.m115697k0(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f20759c = AbstractC36259c.m115697k0(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f20760d = AbstractC36259c.m115699l0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC22766a.f89675d);
        this.f20761e = AbstractC36259c.m115699l0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC22766a.f89674c);
        return false;
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: x */
    public final void mo15671x(CoordinatorLayout coordinatorLayout, View view, View view2, int i13, int i14, int i15, int i16, int i17, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f20757a;
        if (i14 > 0) {
            if (this.f20763g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f20764h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f20763g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                throw AbstractC11266d.m30454h(it);
            }
            this.f20764h = view.animate().translationY(this.f20762f).setInterpolator(this.f20761e).setDuration(this.f20759c).setListener(new C1916d(this, 11));
            return;
        }
        if (i14 >= 0 || this.f20763g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f20764h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f20763g = 2;
        Iterator it3 = linkedHashSet.iterator();
        if (it3.hasNext()) {
            throw AbstractC11266d.m30454h(it3);
        }
        this.f20764h = view.animate().translationY(0).setInterpolator(this.f20760d).setDuration(this.f20758b).setListener(new C1916d(this, 11));
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
