package com.whoop.p069ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import vu1.AbstractC36519j;

/* JADX INFO: loaded from: classes10.dex */
public class WhoopScrollView extends ScrollView {

    /* JADX INFO: renamed from: w */
    private int f32367w;

    public WhoopScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32367w = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC36519j.f156144H0);
        m27475a(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    private void m27475a(TypedArray typedArray) {
        if (typedArray != null) {
            this.f32367w = typedArray.getDimensionPixelSize(AbstractC36519j.f156146I0, -1);
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        if (this.f32367w >= 0) {
            int measuredHeight = getMeasuredHeight();
            int i15 = this.f32367w;
            if (measuredHeight > i15) {
                super.onMeasure(i13, View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE));
            }
        }
    }
}
