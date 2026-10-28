package com.google.android.exoplayer2.p051ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import jo.AbstractC21817f;
import jo.InterfaceC21811b;
import p087db.RunnableC11839b;

/* JADX INFO: loaded from: classes6.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ int f20396z = 0;

    /* JADX INFO: renamed from: w */
    public final RunnableC11839b f20397w;

    /* JADX INFO: renamed from: x */
    public float f20398x;

    /* JADX INFO: renamed from: y */
    public int f20399y;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20399y = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC21817f.f84131a, 0, 0);
            try {
                this.f20399y = typedArrayObtainStyledAttributes.getInt(0, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th3) {
                typedArrayObtainStyledAttributes.recycle();
                throw th3;
            }
        }
        this.f20397w = new RunnableC11839b(this, 1);
    }

    public int getResizeMode() {
        return this.f20399y;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        float f13;
        float f14;
        super.onMeasure(i13, i14);
        if (this.f20398x <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f15 = measuredWidth;
        float f16 = measuredHeight;
        float f17 = (this.f20398x / (f15 / f16)) - 1.0f;
        float fAbs = Math.abs(f17);
        RunnableC11839b runnableC11839b = this.f20397w;
        if (fAbs <= 0.01f) {
            if (runnableC11839b.f38579x) {
                return;
            }
            runnableC11839b.f38579x = true;
            ((AspectRatioFrameLayout) runnableC11839b.f38580y).post(runnableC11839b);
            return;
        }
        int i15 = this.f20399y;
        if (i15 != 0) {
            if (i15 != 1) {
                if (i15 == 2) {
                    f13 = this.f20398x;
                } else if (i15 == 4) {
                    if (f17 > 0.0f) {
                        f13 = this.f20398x;
                    } else {
                        f14 = this.f20398x;
                    }
                }
                measuredWidth = (int) (f16 * f13);
            } else {
                f14 = this.f20398x;
            }
            measuredHeight = (int) (f15 / f14);
        } else if (f17 > 0.0f) {
            f14 = this.f20398x;
            measuredHeight = (int) (f15 / f14);
        } else {
            f13 = this.f20398x;
            measuredWidth = (int) (f16 * f13);
        }
        if (!runnableC11839b.f38579x) {
            runnableC11839b.f38579x = true;
            ((AspectRatioFrameLayout) runnableC11839b.f38580y).post(runnableC11839b);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f13) {
        if (this.f20398x != f13) {
            this.f20398x = f13;
            requestLayout();
        }
    }

    public void setAspectRatioListener(InterfaceC21811b interfaceC21811b) {
    }

    public void setResizeMode(int i13) {
        if (this.f20399y != i13) {
            this.f20399y = i13;
            requestLayout();
        }
    }
}
