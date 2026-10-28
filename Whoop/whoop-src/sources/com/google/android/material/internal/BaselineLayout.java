package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes6.dex */
public class BaselineLayout extends ViewGroup {

    /* JADX INFO: renamed from: w */
    public int f21000w;

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f21000w = -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.f21000w;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i15 - i13) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i18 = ((paddingRight - measuredWidth) / 2) + paddingLeft;
                int baseline = (this.f21000w == -1 || childAt.getBaseline() == -1) ? paddingTop : (this.f21000w + paddingTop) - childAt.getBaseline();
                childAt.layout(i18, baseline, measuredWidth + i18, measuredHeight + baseline);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        int iCombineMeasuredStates = 0;
        int iMax3 = -1;
        int iMax4 = -1;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i13, i14);
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    iMax3 = Math.max(iMax3, baseline);
                    iMax4 = Math.max(iMax4, childAt.getMeasuredHeight() - baseline);
                }
                iMax2 = Math.max(iMax2, childAt.getMeasuredWidth());
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        if (iMax3 != -1) {
            iMax = Math.max(iMax, Math.max(iMax4, getPaddingBottom()) + iMax3);
            this.f21000w = iMax3;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax2, getSuggestedMinimumWidth()), i13, iCombineMeasuredStates), View.resolveSizeAndState(Math.max(iMax, getSuggestedMinimumHeight()), i14, iCombineMeasuredStates << 16));
    }
}
