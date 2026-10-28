package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whoop.android.R;
import java.util.WeakHashMap;
import p184h5.AbstractC16901p0;
import p290l.AbstractC22932a;

/* JADX INFO: loaded from: classes5.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: w */
    public boolean f4337w;

    /* JADX INFO: renamed from: x */
    public boolean f4338x;

    /* JADX INFO: renamed from: y */
    public int f4339y;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4339y = -1;
        int[] iArr = AbstractC22932a.f90518k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        AbstractC16901p0.m47582m(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        this.f4337w = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f4337w);
        }
    }

    private void setStacked(boolean z4) {
        if (this.f4338x != z4) {
            if (!z4 || this.f4337w) {
                this.f4338x = z4;
                setOrientation(z4 ? 1 : 0);
                setGravity(z4 ? 8388613 : 80);
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z4 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        int iMakeMeasureSpec;
        boolean z4;
        int i15;
        int size = View.MeasureSpec.getSize(i13);
        int paddingBottom = 0;
        if (this.f4337w) {
            if (size > this.f4339y && this.f4338x) {
                setStacked(false);
            }
            this.f4339y = size;
        }
        if (this.f4338x || View.MeasureSpec.getMode(i13) != 1073741824) {
            iMakeMeasureSpec = i13;
            z4 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z4 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i14);
        if (this.f4337w && !this.f4338x && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z4 = true;
        }
        if (z4) {
            super.onMeasure(i13, i14);
        }
        int childCount = getChildCount();
        int i16 = 0;
        while (true) {
            i15 = -1;
            if (i16 >= childCount) {
                i16 = -1;
                break;
            } else if (getChildAt(i16).getVisibility() == 0) {
                break;
            } else {
                i16++;
            }
        }
        if (i16 >= 0) {
            View childAt = getChildAt(i16);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f4338x) {
                int childCount2 = getChildCount();
                for (int i17 = i16 + 1; i17 < childCount2; i17++) {
                    if (getChildAt(i17).getVisibility() == 0) {
                        i15 = i17;
                        break;
                    }
                }
                paddingBottom = i15 >= 0 ? getChildAt(i15).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                paddingBottom = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        if (getMinimumHeight() != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i14 == 0) {
                super.onMeasure(i13, i14);
            }
        }
    }

    public void setAllowStacking(boolean z4) {
        if (this.f4337w != z4) {
            this.f4337w = z4;
            if (!z4 && this.f4338x) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
