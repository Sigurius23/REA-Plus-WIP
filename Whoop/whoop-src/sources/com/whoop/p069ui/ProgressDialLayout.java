package com.whoop.p069ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import vu1.AbstractC36514e;
import vu1.AbstractC36516g;
import vu1.AbstractC36519j;

/* JADX INFO: loaded from: classes10.dex */
public class ProgressDialLayout extends ViewGroup {

    /* JADX INFO: renamed from: w */
    private C10449a f31559w;

    /* JADX INFO: renamed from: x */
    private boolean f31560x;

    /* JADX INFO: renamed from: y */
    private int f31561y;

    /* JADX INFO: renamed from: z */
    private int f31562z;

    /* JADX INFO: renamed from: com.whoop.ui.ProgressDialLayout$a */
    public static class C10449a {

        /* JADX INFO: renamed from: a */
        ProgressDial f31563a;

        /* JADX INFO: renamed from: b */
        ViewGroup f31564b;

        public C10449a(View view) {
            this.f31563a = (ProgressDial) view.findViewById(AbstractC36514e.f156099q);
            this.f31564b = (ViewGroup) view.findViewById(AbstractC36514e.f156098p);
        }
    }

    public ProgressDialLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31560x = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC36519j.f156147J);
        m26660b(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    private boolean m26659a(View view) {
        C10449a c10449a = this.f31559w;
        return (c10449a == null || view == c10449a.f31563a || view == c10449a.f31564b) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    private void m26660b(TypedArray typedArray) {
        LayoutInflater.from(getContext()).inflate(AbstractC36516g.f156112b, (ViewGroup) this, true);
        C10449a c10449a = new C10449a(this);
        this.f31559w = c10449a;
        if (typedArray != null) {
            ProgressDial progressDial = c10449a.f31563a;
            progressDial.setThickness(typedArray.getDimension(AbstractC36519j.f156169U, progressDial.getThickness()));
            ProgressDial progressDial2 = this.f31559w.f31563a;
            progressDial2.setFillColor(typedArray.getColor(AbstractC36519j.f156151L, progressDial2.getFillColor()));
            ProgressDial progressDial3 = this.f31559w.f31563a;
            progressDial3.setFillStartColor(typedArray.getColor(AbstractC36519j.f156167T, progressDial3.getFillStartColor()));
            ProgressDial progressDial4 = this.f31559w.f31563a;
            progressDial4.setFillEndColor(typedArray.getColor(AbstractC36519j.f156161Q, progressDial4.getFillEndColor()));
            ProgressDial progressDial5 = this.f31559w.f31563a;
            progressDial5.setEmptyColor(typedArray.getColor(AbstractC36519j.f156159P, progressDial5.getEmptyColor()));
            ProgressDial progressDial6 = this.f31559w.f31563a;
            progressDial6.setDrawEmptyArc(typedArray.getBoolean(AbstractC36519j.f156157O, progressDial6.getDrawEmptyArc()));
            ProgressDial progressDial7 = this.f31559w.f31563a;
            progressDial7.setGapLength(typedArray.getFloat(AbstractC36519j.f156163R, progressDial7.getGapLength()));
            if (typedArray.hasValue(AbstractC36519j.f156149K)) {
                this.f31559w.f31563a.setBackgroundColor(typedArray.getColor(AbstractC36519j.f156149K, 0));
            }
            if (typedArray.hasValue(AbstractC36519j.f156155N)) {
                this.f31561y = typedArray.getDimensionPixelSize(AbstractC36519j.f156155N, 0);
            }
            if (typedArray.hasValue(AbstractC36519j.f156153M)) {
                this.f31562z = typedArray.getDimensionPixelSize(AbstractC36519j.f156153M, 0);
            }
            setMeasureInside(typedArray.getBoolean(AbstractC36519j.f156165S, this.f31560x));
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (m26659a(view)) {
            this.f31559w.f31564b.addView(view);
        } else {
            super.addView(view);
        }
    }

    public ProgressDial getProgressDial() {
        return this.f31559w.f31563a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        int measuredWidth = this.f31559w.f31563a.getMeasuredWidth() / 2;
        this.f31559w.f31563a.layout(width - measuredWidth, height - measuredWidth, width + measuredWidth, measuredWidth + height);
        int measuredWidth2 = this.f31559w.f31564b.getMeasuredWidth() / 2;
        this.f31559w.f31564b.layout(width - measuredWidth2, height - measuredWidth2, width + measuredWidth2, height + measuredWidth2);
    }

    @Override // android.view.View
    public void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
        int i15 = this.f31561y;
        if (i15 != 0) {
            iMin = Math.min(iMin, i15);
        }
        int i16 = this.f31562z;
        if (i16 != 0) {
            iMin = Math.min(iMin, i16);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        this.f31559w.f31563a.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        if (this.f31560x) {
            int measuredInnerDiameter = (int) this.f31559w.f31563a.getMeasuredInnerDiameter();
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) Math.sqrt((measuredInnerDiameter * measuredInnerDiameter) / 2), 1073741824);
        }
        this.f31559w.f31564b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    public void setMeasureInside(boolean z4) {
        if (this.f31560x != z4) {
            this.f31560x = z4;
            requestLayout();
        }
    }

    @Keep
    public void setProgress(float f13) {
        this.f31559w.f31563a.setProgress(f13);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i13) {
        if (m26659a(view)) {
            this.f31559w.f31564b.addView(view);
        } else {
            super.addView(view, i13);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i13, ViewGroup.LayoutParams layoutParams) {
        if (m26659a(view)) {
            this.f31559w.f31564b.addView(view);
        } else {
            super.addView(view, i13, layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (m26659a(view)) {
            this.f31559w.f31564b.addView(view);
        } else {
            super.addView(view, layoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i13, int i14) {
        if (m26659a(view)) {
            this.f31559w.f31564b.addView(view, i13, i14);
        } else {
            super.addView(view, i13, i14);
        }
    }
}
