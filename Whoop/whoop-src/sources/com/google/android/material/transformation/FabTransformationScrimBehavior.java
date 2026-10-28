package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.C1661b0;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import p287kq.C22771f;
import p477s2.AbstractC32073e;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: c */
    public final C22771f f21375c;

    /* JADX INFO: renamed from: d */
    public final C22771f f21376d;

    public FabTransformationScrimBehavior() {
        this.f21375c = new C22771f(75L);
        this.f21376d = new C22771f(0L);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* JADX INFO: renamed from: J */
    public final AnimatorSet mo15919J(View view, View view2, boolean z4, boolean z13) {
        ObjectAnimator objectAnimatorOfFloat;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        C22771f c22771f = z4 ? this.f21375c : this.f21376d;
        if (z4) {
            if (!z13) {
                view2.setAlpha(0.0f);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        c22771f.m65976a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        AbstractC32073e.m99727U(animatorSet, arrayList);
        animatorSet.addListener(new C1661b0(view2, z4));
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, p413q4.AbstractC29957b
    /* JADX INFO: renamed from: i */
    public final boolean mo15674i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21375c = new C22771f(75L);
        this.f21376d = new C22771f(0L);
    }
}
