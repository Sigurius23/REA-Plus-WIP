package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p257jq.AbstractC21885a;
import p413q4.AbstractC29957b;
import p413q4.C29960e;

/* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior */
/* JADX INFO: loaded from: classes6.dex */
public class C5033xe6e79f6<T> extends AbstractC29957b {
    public C5033xe6e79f6() {
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: f */
    public final boolean mo15763f(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        if (view == null) {
            return super.mo15763f(coordinatorLayout, null, rect);
        }
        throw new ClassCastException();
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: k */
    public final void mo15713k(C29960e c29960e) {
        if (c29960e.f122371h == 0) {
            c29960e.f122371h = 80;
        }
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: l */
    public final boolean mo15675l(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view != null) {
            throw new ClassCastException();
        }
        if (view2 instanceof AppBarLayout) {
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams instanceof C29960e ? ((C29960e) layoutParams).f122364a instanceof BottomSheetBehavior : false) {
            throw null;
        }
        return false;
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: p */
    public final boolean mo15668p(CoordinatorLayout coordinatorLayout, View view, int i13) {
        throw new ClassCastException();
    }

    public C5033xe6e79f6(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC21885a.f84554n);
        typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
