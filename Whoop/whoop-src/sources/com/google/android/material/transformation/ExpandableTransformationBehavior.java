package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import ar.C1916d;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* JADX INFO: renamed from: b */
    public AnimatorSet f21368b;

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    /* JADX INFO: renamed from: I */
    public void mo15918I(View view, View view2, boolean z4, boolean z13) {
        AnimatorSet animatorSet = this.f21368b;
        boolean z14 = animatorSet != null;
        if (z14) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetMo15919J = mo15919J(view, view2, z4, z14);
        this.f21368b = animatorSetMo15919J;
        animatorSetMo15919J.addListener(new C1916d(this, 13));
        this.f21368b.start();
        if (z13) {
            return;
        }
        this.f21368b.end();
    }

    /* JADX INFO: renamed from: J */
    public abstract AnimatorSet mo15919J(View view, View view2, boolean z4, boolean z13);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
