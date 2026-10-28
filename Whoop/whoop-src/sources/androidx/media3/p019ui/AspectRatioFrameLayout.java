package androidx.media3.p019ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p087db.AbstractC11854i0;
import p087db.InterfaceC11837a;
import p087db.RunnableC11839b;

/* JADX INFO: loaded from: classes5.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ int f6399z = 0;

    /* JADX INFO: renamed from: w */
    public final RunnableC11839b f6400w;

    /* JADX INFO: renamed from: x */
    public float f6401x;

    /* JADX INFO: renamed from: y */
    public int f6402y;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6402y = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC11854i0.f38679a, 0, 0);
            try {
                this.f6402y = typedArrayObtainStyledAttributes.getInt(0, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th3) {
                typedArrayObtainStyledAttributes.recycle();
                throw th3;
            }
        }
        this.f6400w = new RunnableC11839b(this, 0);
    }

    public int getResizeMode() {
        return this.f6402y;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        float f13;
        float f14;
        super.onMeasure(i13, i14);
        if (this.f6401x <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f15 = measuredWidth;
        float f16 = measuredHeight;
        float f17 = (this.f6401x / (f15 / f16)) - 1.0f;
        float fAbs = Math.abs(f17);
        RunnableC11839b runnableC11839b = this.f6400w;
        if (fAbs <= 0.01f) {
            if (runnableC11839b.f38579x) {
                return;
            }
            runnableC11839b.f38579x = true;
            ((AspectRatioFrameLayout) runnableC11839b.f38580y).post(runnableC11839b);
            return;
        }
        int i15 = this.f6402y;
        if (i15 != 0) {
            if (i15 != 1) {
                if (i15 == 2) {
                    f13 = this.f6401x;
                } else if (i15 == 4) {
                    if (f17 > 0.0f) {
                        f13 = this.f6401x;
                    } else {
                        f14 = this.f6401x;
                    }
                }
                measuredWidth = (int) (f16 * f13);
            } else {
                f14 = this.f6401x;
            }
            measuredHeight = (int) (f15 / f14);
        } else if (f17 > 0.0f) {
            f14 = this.f6401x;
            measuredHeight = (int) (f15 / f14);
        } else {
            f13 = this.f6401x;
            measuredWidth = (int) (f16 * f13);
        }
        if (!runnableC11839b.f38579x) {
            runnableC11839b.f38579x = true;
            ((AspectRatioFrameLayout) runnableC11839b.f38580y).post(runnableC11839b);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f13) {
        if (this.f6401x != f13) {
            this.f6401x = f13;
            requestLayout();
        }
    }

    public void setAspectRatioListener(InterfaceC11837a interfaceC11837a) {
    }

    public void setResizeMode(int i13) {
        if (this.f6402y != i13) {
            this.f6402y = i13;
            requestLayout();
        }
    }
}
