package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import p184h5.AbstractC16901p0;
import p290l.AbstractC22932a;
import p474s.C31983m2;
import p474s.C31990o1;

/* JADX INFO: loaded from: classes5.dex */
public class LinearLayoutCompat extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C31990o1;
    }

    public final void drawDividersHorizontal(Canvas canvas) {
        int right;
        int left;
        int i13;
        int virtualChildCount = getVirtualChildCount();
        boolean z4 = getLayoutDirection() == 1;
        for (int i14 = 0; i14 < virtualChildCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null && childAt.getVisibility() != 8 && hasDividerBeforeChildAt(i14)) {
                C31990o1 c31990o1 = (C31990o1) childAt.getLayoutParams();
                drawVerticalDivider(canvas, z4 ? childAt.getRight() + ((LinearLayout.LayoutParams) c31990o1).rightMargin : (childAt.getLeft() - ((LinearLayout.LayoutParams) c31990o1).leftMargin) - this.mDividerWidth);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View childAt2 = getChildAt(virtualChildCount - 1);
            if (childAt2 != null) {
                C31990o1 c31990o2 = (C31990o1) childAt2.getLayoutParams();
                if (z4) {
                    left = childAt2.getLeft() - ((LinearLayout.LayoutParams) c31990o2).leftMargin;
                    i13 = this.mDividerWidth;
                    right = left - i13;
                } else {
                    right = childAt2.getRight() + ((LinearLayout.LayoutParams) c31990o2).rightMargin;
                }
            } else if (z4) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i13 = this.mDividerWidth;
                right = left - i13;
            }
            drawVerticalDivider(canvas, right);
        }
    }

    public final void drawDividersVertical(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i13 = 0; i13 < virtualChildCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8 && hasDividerBeforeChildAt(i13)) {
                drawHorizontalDivider(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C31990o1) childAt.getLayoutParams())).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View childAt2 = getChildAt(virtualChildCount - 1);
            drawHorizontalDivider(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.mDividerHeight : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C31990o1) childAt2.getLayoutParams())).bottomMargin);
        }
    }

    public final void drawHorizontalDivider(Canvas canvas, int i13) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i13, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i13);
        this.mDivider.draw(canvas);
    }

    public final void drawVerticalDivider(Canvas canvas, int i13) {
        this.mDivider.setBounds(i13, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i13, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i13;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i14 = this.mBaselineAlignedChildIndex;
        if (childCount <= i14) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i14);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.mBaselineChildTop;
        if (this.mOrientation == 1 && (i13 = this.mGravity & 112) != 48) {
            if (i13 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2;
            } else if (i13 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((C31990o1) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public final int getChildrenSkipCount(View view, int i13) {
        return 0;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    public int getGravity() {
        return this.mGravity;
    }

    public final int getLocationOffset(View view) {
        return 0;
    }

    public final int getNextLocationOffset(View view) {
        return 0;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public final View getVirtualChildAt(int i13) {
        return getChildAt(i13);
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    public final boolean hasDividerBeforeChildAt(int i13) {
        if (i13 == 0) {
            return (this.mShowDividers & 1) != 0;
        }
        if (i13 == getChildCount()) {
            return (this.mShowDividers & 4) != 0;
        }
        if ((this.mShowDividers & 2) != 0) {
            for (int i14 = i13 - 1; i14 >= 0; i14--) {
                if (getChildAt(i14).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public final boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:37:0x00be  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:44:0x00da  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fb  */
    public final void layoutHorizontal(int i13, int i14, int i15, int i16) {
        int paddingLeft;
        int i17;
        int i18;
        int i19;
        int i24;
        int baseline;
        int i25;
        int i26;
        int i27;
        int i28;
        int measuredHeight;
        int i29 = 0;
        char c3 = 1;
        boolean z4 = getLayoutDirection() == 1;
        int paddingTop = getPaddingTop();
        int i34 = i16 - i14;
        int paddingBottom = i34 - getPaddingBottom();
        int paddingBottom2 = (i34 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i35 = this.mGravity;
        int i36 = 8388615 & i35;
        int i37 = i35 & 112;
        boolean z13 = this.mBaselineAligned;
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        int absoluteGravity = Gravity.getAbsoluteGravity(i36, getLayoutDirection());
        char c7 = 2;
        if (absoluteGravity != 1) {
            paddingLeft = absoluteGravity != 5 ? getPaddingLeft() : ((getPaddingLeft() + i15) - i13) - this.mTotalLength;
        } else {
            paddingLeft = getPaddingLeft() + (((i15 - i13) - this.mTotalLength) / 2);
        }
        if (z4) {
            i17 = virtualChildCount - 1;
            i18 = -1;
        } else {
            i17 = 0;
            i18 = 1;
        }
        while (i29 < virtualChildCount) {
            char c14 = c3;
            int i38 = (i18 * i29) + i17;
            char c15 = c7;
            View childAt = getChildAt(i38);
            if (childAt == null) {
                i19 = i17;
            } else {
                i19 = i17;
                if (childAt.getVisibility() != 8) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    C31990o1 c31990o1 = (C31990o1) childAt.getLayoutParams();
                    if (z13) {
                        i24 = paddingTop;
                        baseline = ((LinearLayout.LayoutParams) c31990o1).height != -1 ? childAt.getBaseline() : -1;
                        i25 = ((LinearLayout.LayoutParams) c31990o1).gravity;
                        if (i25 < 0) {
                            i25 = i37;
                        }
                        i26 = i25 & 112;
                        i27 = paddingBottom2;
                        if (i26 != 16) {
                            if (i26 != 48) {
                                i28 = i24 + ((LinearLayout.LayoutParams) c31990o1).topMargin;
                                if (baseline != -1) {
                                    i28 = (iArr[c14] - baseline) + i28;
                                }
                            } else if (i26 != 80) {
                                i28 = i24;
                            } else {
                                i28 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) c31990o1).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[c15] - (childAt.getMeasuredHeight() - baseline);
                                }
                            }
                            if (hasDividerBeforeChildAt(i38)) {
                                paddingLeft += this.mDividerWidth;
                            }
                            int i39 = paddingLeft + ((LinearLayout.LayoutParams) c31990o1).leftMargin;
                            childAt.layout(i39, i28, i39 + measuredWidth, measuredHeight2 + i28);
                            paddingLeft = measuredWidth + ((LinearLayout.LayoutParams) c31990o1).rightMargin + i39;
                        } else {
                            i28 = ((i27 - measuredHeight2) / 2) + i24 + ((LinearLayout.LayoutParams) c31990o1).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) c31990o1).bottomMargin;
                        }
                        i28 -= measuredHeight;
                        if (hasDividerBeforeChildAt(i38)) {
                            paddingLeft += this.mDividerWidth;
                        }
                        int i310 = paddingLeft + ((LinearLayout.LayoutParams) c31990o1).leftMargin;
                        childAt.layout(i310, i28, i310 + measuredWidth, measuredHeight2 + i28);
                        paddingLeft = measuredWidth + ((LinearLayout.LayoutParams) c31990o1).rightMargin + i310;
                    } else {
                        i24 = paddingTop;
                    }
                    i25 = ((LinearLayout.LayoutParams) c31990o1).gravity;
                    if (i25 < 0) {
                        i25 = i37;
                    }
                    i26 = i25 & 112;
                    i27 = paddingBottom2;
                    if (i26 != 16) {
                        if (i26 != 48) {
                            i28 = i24 + ((LinearLayout.LayoutParams) c31990o1).topMargin;
                            if (baseline != -1) {
                                i28 = (iArr[c14] - baseline) + i28;
                            }
                        } else if (i26 != 80) {
                            i28 = i24;
                        } else {
                            i28 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) c31990o1).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight = iArr2[c15] - (childAt.getMeasuredHeight() - baseline);
                            }
                        }
                        if (hasDividerBeforeChildAt(i38)) {
                            paddingLeft += this.mDividerWidth;
                        }
                        int i311 = paddingLeft + ((LinearLayout.LayoutParams) c31990o1).leftMargin;
                        childAt.layout(i311, i28, i311 + measuredWidth, measuredHeight2 + i28);
                        paddingLeft = measuredWidth + ((LinearLayout.LayoutParams) c31990o1).rightMargin + i311;
                    } else {
                        i28 = ((i27 - measuredHeight2) / 2) + i24 + ((LinearLayout.LayoutParams) c31990o1).topMargin;
                        measuredHeight = ((LinearLayout.LayoutParams) c31990o1).bottomMargin;
                    }
                    i28 -= measuredHeight;
                    if (hasDividerBeforeChildAt(i38)) {
                        paddingLeft += this.mDividerWidth;
                    }
                    int i312 = paddingLeft + ((LinearLayout.LayoutParams) c31990o1).leftMargin;
                    childAt.layout(i312, i28, i312 + measuredWidth, measuredHeight2 + i28);
                    paddingLeft = measuredWidth + ((LinearLayout.LayoutParams) c31990o1).rightMargin + i312;
                }
                i29++;
                c7 = c15;
                i17 = i19;
                c3 = c14;
                paddingTop = i24;
                paddingBottom2 = i27;
            }
            i24 = paddingTop;
            i27 = paddingBottom2;
            i29++;
            c7 = c15;
            i17 = i19;
            c3 = c14;
            paddingTop = i24;
            paddingBottom2 = i27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0091  */
    public final void layoutVertical(int i13, int i14, int i15, int i16) {
        int i17;
        int i18;
        int i19;
        int paddingLeft = getPaddingLeft();
        int i24 = i15 - i13;
        int paddingRight = i24 - getPaddingRight();
        int paddingRight2 = (i24 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i25 = this.mGravity;
        int i26 = i25 & 112;
        int i27 = i25 & 8388615;
        int paddingTop = i26 != 16 ? i26 != 80 ? getPaddingTop() : ((getPaddingTop() + i16) - i14) - this.mTotalLength : (((i16 - i14) - this.mTotalLength) / 2) + getPaddingTop();
        for (int i28 = 0; i28 < virtualChildCount; i28++) {
            View childAt = getChildAt(i28);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                C31990o1 c31990o1 = (C31990o1) childAt.getLayoutParams();
                int i29 = ((LinearLayout.LayoutParams) c31990o1).gravity;
                if (i29 < 0) {
                    i29 = i27;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i29, getLayoutDirection()) & 7;
                if (absoluteGravity != 1) {
                    if (absoluteGravity != 5) {
                        i19 = ((LinearLayout.LayoutParams) c31990o1).leftMargin + paddingLeft;
                    } else {
                        i17 = paddingRight - measuredWidth;
                        i18 = ((LinearLayout.LayoutParams) c31990o1).rightMargin;
                    }
                    if (hasDividerBeforeChildAt(i28)) {
                        paddingTop += this.mDividerHeight;
                    }
                    int i34 = paddingTop + ((LinearLayout.LayoutParams) c31990o1).topMargin;
                    childAt.layout(i19, i34, measuredWidth + i19, i34 + measuredHeight);
                    paddingTop = measuredHeight + ((LinearLayout.LayoutParams) c31990o1).bottomMargin + i34;
                } else {
                    i17 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) c31990o1).leftMargin;
                    i18 = ((LinearLayout.LayoutParams) c31990o1).rightMargin;
                }
                i19 = i17 - i18;
                if (hasDividerBeforeChildAt(i28)) {
                    paddingTop += this.mDividerHeight;
                }
                int i35 = paddingTop + ((LinearLayout.LayoutParams) c31990o1).topMargin;
                childAt.layout(i19, i35, measuredWidth + i19, i35 + measuredHeight);
                paddingTop = measuredHeight + ((LinearLayout.LayoutParams) c31990o1).bottomMargin + i35;
            }
        }
    }

    public final void measureChildBeforeLayout(View view, int i13, int i14, int i15, int i16, int i17) {
        measureChildWithMargins(view, i14, i15, i16, i17);
    }

    /* JADX WARN: Code duplicated, block: B:195:0x03fc  */
    public final void measureHorizontal(int i13, int i14) {
        float f13;
        int i15;
        int i16;
        int i17;
        int i18;
        int iMax;
        int i19;
        int baseline;
        int i24;
        int i25;
        byte b;
        int i26;
        int i27;
        boolean z4;
        int baseline2;
        LinearLayoutCompat linearLayoutCompat = this;
        linearLayoutCompat.mTotalLength = 0;
        int virtualChildCount = linearLayoutCompat.getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i13);
        int mode2 = View.MeasureSpec.getMode(i14);
        if (linearLayoutCompat.mMaxAscent == null || linearLayoutCompat.mMaxDescent == null) {
            linearLayoutCompat.mMaxAscent = new int[4];
            linearLayoutCompat.mMaxDescent = new int[4];
        }
        int[] iArr = linearLayoutCompat.mMaxAscent;
        int[] iArr2 = linearLayoutCompat.mMaxDescent;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z13 = linearLayoutCompat.mBaselineAligned;
        boolean z14 = linearLayoutCompat.mUseLargestChild;
        int i28 = 1073741824;
        boolean z15 = mode == 1073741824;
        int i29 = 0;
        int iMax2 = 0;
        boolean z16 = false;
        int iCombineMeasuredStates = 0;
        boolean z17 = false;
        boolean z18 = true;
        float f14 = 0.0f;
        int iMax3 = 0;
        int iMax4 = 0;
        int iMax5 = 0;
        while (true) {
            f13 = f14;
            i15 = 8;
            if (i29 >= virtualChildCount) {
                break;
            }
            boolean z19 = z13;
            View childAt = linearLayoutCompat.getChildAt(i29);
            if (childAt == null) {
                linearLayoutCompat.mTotalLength = linearLayoutCompat.mTotalLength;
            } else {
                if (childAt.getVisibility() != 8) {
                    if (linearLayoutCompat.hasDividerBeforeChildAt(i29)) {
                        linearLayoutCompat.mTotalLength += linearLayoutCompat.mDividerWidth;
                    }
                    C31990o1 c31990o1 = (C31990o1) childAt.getLayoutParams();
                    float f15 = ((LinearLayout.LayoutParams) c31990o1).weight;
                    float f16 = f13 + f15;
                    if (mode == i28 && ((LinearLayout.LayoutParams) c31990o1).width == 0 && f15 > 0.0f) {
                        if (z15) {
                            linearLayoutCompat.mTotalLength = ((LinearLayout.LayoutParams) c31990o1).leftMargin + ((LinearLayout.LayoutParams) c31990o1).rightMargin + linearLayoutCompat.mTotalLength;
                        } else {
                            int i34 = linearLayoutCompat.mTotalLength;
                            linearLayoutCompat.mTotalLength = Math.max(i34, ((LinearLayout.LayoutParams) c31990o1).leftMargin + i34 + ((LinearLayout.LayoutParams) c31990o1).rightMargin);
                        }
                        if (z19) {
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        } else {
                            z16 = true;
                        }
                        i27 = 1073741824;
                    } else {
                        z14 = z14;
                        if (((LinearLayout.LayoutParams) c31990o1).width != 0 || f15 <= 0.0f) {
                            b = -2;
                            i26 = Integer.MIN_VALUE;
                        } else {
                            b = -2;
                            ((LinearLayout.LayoutParams) c31990o1).width = -2;
                            i26 = 0;
                        }
                        mode = mode;
                        iArr = iArr;
                        iArr2 = iArr2;
                        i27 = 1073741824;
                        int i35 = i26;
                        i29 = i29;
                        linearLayoutCompat.measureChildWithMargins(childAt, i13, f16 == 0.0f ? linearLayoutCompat.mTotalLength : 0, i14, 0);
                        if (i35 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) c31990o1).width = i35;
                        }
                        int measuredWidth = childAt.getMeasuredWidth();
                        if (z15) {
                            linearLayoutCompat.mTotalLength = ((LinearLayout.LayoutParams) c31990o1).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) c31990o1).rightMargin + linearLayoutCompat.mTotalLength;
                        } else {
                            int i36 = linearLayoutCompat.mTotalLength;
                            linearLayoutCompat.mTotalLength = Math.max(i36, i36 + measuredWidth + ((LinearLayout.LayoutParams) c31990o1).leftMargin + ((LinearLayout.LayoutParams) c31990o1).rightMargin);
                        }
                        if (z14) {
                            iMax2 = Math.max(measuredWidth, iMax2);
                        }
                    }
                    if (mode2 == i27 || ((LinearLayout.LayoutParams) c31990o1).height != -1) {
                        z4 = false;
                    } else {
                        z4 = true;
                        z17 = true;
                    }
                    int i37 = ((LinearLayout.LayoutParams) c31990o1).topMargin + ((LinearLayout.LayoutParams) c31990o1).bottomMargin;
                    int measuredHeight = childAt.getMeasuredHeight() + i37;
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                    if (z19 && (baseline2 = childAt.getBaseline()) != -1) {
                        int i38 = ((LinearLayout.LayoutParams) c31990o1).gravity;
                        if (i38 < 0) {
                            i38 = linearLayoutCompat.mGravity;
                        }
                        int i39 = (((i38 & 112) >> 4) & (-2)) >> 1;
                        iArr[i39] = Math.max(iArr[i39], baseline2);
                        iArr2[i39] = Math.max(iArr2[i39], measuredHeight - baseline2);
                    }
                    iMax3 = Math.max(iMax3, measuredHeight);
                    z18 = z18 && ((LinearLayout.LayoutParams) c31990o1).height == -1;
                    if (((LinearLayout.LayoutParams) c31990o1).weight > 0.0f) {
                        if (!z4) {
                            i37 = measuredHeight;
                        }
                        iMax5 = Math.max(iMax5, i37);
                    } else {
                        if (!z4) {
                            i37 = measuredHeight;
                        }
                        iMax4 = Math.max(iMax4, i37);
                    }
                    f14 = f16;
                }
                i29++;
                i28 = i27;
                iArr = iArr;
                z13 = z19;
                z14 = z14;
                iArr2 = iArr2;
                mode = mode;
            }
            z14 = z14;
            i29 = i29;
            mode = mode;
            iArr = iArr;
            iArr2 = iArr2;
            f14 = f13;
            i27 = i28;
            i29++;
            i28 = i27;
            iArr = iArr;
            z13 = z19;
            z14 = z14;
            iArr2 = iArr2;
            mode = mode;
        }
        boolean z24 = z13;
        boolean z25 = z14;
        int i44 = mode;
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        int i45 = iCombineMeasuredStates;
        if (linearLayoutCompat.mTotalLength > 0 && linearLayoutCompat.hasDividerBeforeChildAt(virtualChildCount)) {
            linearLayoutCompat.mTotalLength += linearLayoutCompat.mDividerWidth;
        }
        int i46 = iArr3[1];
        if (i46 != -1 || iArr3[0] != -1 || iArr3[2] != -1 || iArr3[3] != -1) {
            iMax3 = Math.max(iMax3, Math.max(iArr4[3], Math.max(iArr4[0], Math.max(iArr4[1], iArr4[2]))) + Math.max(iArr3[3], Math.max(iArr3[0], Math.max(i46, iArr3[2]))));
        }
        int i47 = i44;
        if (z25 && (i47 == Integer.MIN_VALUE || i47 == 0)) {
            linearLayoutCompat.mTotalLength = 0;
            for (int i48 = 0; i48 < virtualChildCount; i48++) {
                View childAt2 = linearLayoutCompat.getChildAt(i48);
                if (childAt2 == null) {
                    linearLayoutCompat.mTotalLength = linearLayoutCompat.mTotalLength;
                } else if (childAt2.getVisibility() != 8) {
                    C31990o1 c31990o2 = (C31990o1) childAt2.getLayoutParams();
                    if (z15) {
                        linearLayoutCompat.mTotalLength = ((LinearLayout.LayoutParams) c31990o2).leftMargin + iMax2 + ((LinearLayout.LayoutParams) c31990o2).rightMargin + linearLayoutCompat.mTotalLength;
                    } else {
                        int i49 = linearLayoutCompat.mTotalLength;
                        linearLayoutCompat.mTotalLength = Math.max(i49, i49 + iMax2 + ((LinearLayout.LayoutParams) c31990o2).leftMargin + ((LinearLayout.LayoutParams) c31990o2).rightMargin);
                    }
                }
            }
        }
        int paddingRight = linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + linearLayoutCompat.mTotalLength;
        linearLayoutCompat.mTotalLength = paddingRight;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, linearLayoutCompat.getSuggestedMinimumWidth()), i13, 0);
        int i54 = (16777215 & iResolveSizeAndState) - linearLayoutCompat.mTotalLength;
        if (z16 || (i54 != 0 && f13 > 0.0f)) {
            i16 = -16777216;
            float f17 = linearLayoutCompat.mWeightSum;
            if (f17 <= 0.0f) {
                f17 = f13;
            }
            iArr3[3] = -1;
            iArr3[2] = -1;
            iArr3[1] = -1;
            iArr3[0] = -1;
            iArr4[3] = -1;
            iArr4[2] = -1;
            iArr4[1] = -1;
            iArr4[0] = -1;
            linearLayoutCompat.mTotalLength = 0;
            int iCombineMeasuredStates2 = i45;
            int iMax6 = -1;
            int i55 = 0;
            while (i55 < virtualChildCount) {
                View childAt3 = linearLayoutCompat.getChildAt(i55);
                if (childAt3 == null || childAt3.getVisibility() == i15) {
                    i47 = i47;
                    iResolveSizeAndState = iResolveSizeAndState;
                } else {
                    C31990o1 c31990o3 = (C31990o1) childAt3.getLayoutParams();
                    float f18 = ((LinearLayout.LayoutParams) c31990o3).weight;
                    if (f18 > 0.0f) {
                        int i56 = (int) ((i54 * f18) / f17);
                        f17 -= f18;
                        i54 -= i56;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i14, linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + ((LinearLayout.LayoutParams) c31990o3).topMargin + ((LinearLayout.LayoutParams) c31990o3).bottomMargin, ((LinearLayout.LayoutParams) c31990o3).height);
                        if (((LinearLayout.LayoutParams) c31990o3).width == 0) {
                            i25 = 1073741824;
                            if (i47 == 1073741824) {
                                childAt3.measure(View.MeasureSpec.makeMeasureSpec(i56 > 0 ? i56 : 0, 1073741824), childMeasureSpec);
                            }
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-16777216));
                        } else {
                            i25 = 1073741824;
                        }
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i56;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i25), childMeasureSpec);
                        iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-16777216));
                    } else {
                        i47 = i47;
                    }
                    if (z15) {
                        linearLayoutCompat.mTotalLength = childAt3.getMeasuredWidth() + ((LinearLayout.LayoutParams) c31990o3).leftMargin + ((LinearLayout.LayoutParams) c31990o3).rightMargin + linearLayoutCompat.mTotalLength;
                    } else {
                        int i57 = linearLayoutCompat.mTotalLength;
                        linearLayoutCompat.mTotalLength = Math.max(i57, childAt3.getMeasuredWidth() + i57 + ((LinearLayout.LayoutParams) c31990o3).leftMargin + ((LinearLayout.LayoutParams) c31990o3).rightMargin);
                    }
                    boolean z26 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) c31990o3).height == -1;
                    int i58 = ((LinearLayout.LayoutParams) c31990o3).topMargin + ((LinearLayout.LayoutParams) c31990o3).bottomMargin;
                    int measuredHeight2 = childAt3.getMeasuredHeight() + i58;
                    iMax6 = Math.max(iMax6, measuredHeight2);
                    if (!z26) {
                        i58 = measuredHeight2;
                    }
                    int iMax7 = Math.max(iMax4, i58);
                    if (z18) {
                        i19 = -1;
                        boolean z27 = ((LinearLayout.LayoutParams) c31990o3).height == -1;
                        if (z24 && (baseline = childAt3.getBaseline()) != i19) {
                            i24 = ((LinearLayout.LayoutParams) c31990o3).gravity;
                            if (i24 < 0) {
                                i24 = linearLayoutCompat.mGravity;
                            }
                            int i59 = (((i24 & 112) >> 4) & (-2)) >> 1;
                            iArr3[i59] = Math.max(iArr3[i59], baseline);
                            iArr4[i59] = Math.max(iArr4[i59], measuredHeight2 - baseline);
                        }
                        iMax4 = iMax7;
                        z18 = z27;
                    } else {
                        i19 = -1;
                    }
                    if (z24) {
                        i24 = ((LinearLayout.LayoutParams) c31990o3).gravity;
                        if (i24 < 0) {
                            i24 = linearLayoutCompat.mGravity;
                        }
                        int i510 = (((i24 & 112) >> 4) & (-2)) >> 1;
                        iArr3[i510] = Math.max(iArr3[i510], baseline);
                        iArr4[i510] = Math.max(iArr4[i510], measuredHeight2 - baseline);
                    }
                    iMax4 = iMax7;
                    z18 = z27;
                }
                i55++;
                iResolveSizeAndState = iResolveSizeAndState;
                i47 = i47;
                i15 = 8;
            }
            i17 = iResolveSizeAndState;
            linearLayoutCompat.mTotalLength = linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + linearLayoutCompat.mTotalLength;
            int i64 = iArr3[1];
            if (i64 == -1 && iArr3[0] == -1 && iArr3[2] == -1 && iArr3[3] == -1) {
                iMax3 = iMax6;
                i18 = 0;
            } else {
                i18 = 0;
                iMax3 = Math.max(iMax6, Math.max(iArr4[3], Math.max(iArr4[0], Math.max(iArr4[1], iArr4[2]))) + Math.max(iArr3[3], Math.max(iArr3[0], Math.max(i64, iArr3[2]))));
            }
            i45 = iCombineMeasuredStates2;
            iMax = iMax4;
        } else {
            iMax = Math.max(iMax4, iMax5);
            if (z25 && i47 != 1073741824) {
                for (int i65 = 0; i65 < virtualChildCount; i65++) {
                    View childAt4 = linearLayoutCompat.getChildAt(i65);
                    if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C31990o1) childAt4.getLayoutParams())).weight > 0.0f) {
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i16 = -16777216;
            i17 = iResolveSizeAndState;
            i18 = 0;
        }
        if (z18 || mode2 == 1073741824) {
            iMax = iMax3;
        }
        linearLayoutCompat.setMeasuredDimension(i17 | (i45 & i16), View.resolveSizeAndState(Math.max(linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + iMax, linearLayoutCompat.getSuggestedMinimumHeight()), i14, i45 << 16));
        if (z17) {
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(linearLayoutCompat.getMeasuredHeight(), 1073741824);
            int i66 = i18;
            while (i66 < virtualChildCount) {
                View childAt5 = linearLayoutCompat.getChildAt(i66);
                if (childAt5.getVisibility() != 8) {
                    C31990o1 c31990o4 = (C31990o1) childAt5.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c31990o4).height == -1) {
                        int i67 = ((LinearLayout.LayoutParams) c31990o4).width;
                        ((LinearLayout.LayoutParams) c31990o4).width = childAt5.getMeasuredWidth();
                        linearLayoutCompat.measureChildWithMargins(childAt5, i13, 0, iMakeMeasureSpec2, 0);
                        ((LinearLayout.LayoutParams) c31990o4).width = i67;
                    }
                }
                i66++;
                linearLayoutCompat = this;
            }
        }
    }

    public final int measureNullChild(int i13) {
        return 0;
    }

    public final void measureVertical(int i13, int i14) {
        int iMax;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        boolean z4;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean z13;
        int iMax2;
        int iMax3;
        LinearLayoutCompat linearLayoutCompat = this;
        linearLayoutCompat.mTotalLength = 0;
        int virtualChildCount = linearLayoutCompat.getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i13);
        int mode2 = View.MeasureSpec.getMode(i14);
        int i34 = linearLayoutCompat.mBaselineAlignedChildIndex;
        boolean z14 = linearLayoutCompat.mUseLargestChild;
        int i35 = 0;
        int iMax4 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int iMax5 = 0;
        boolean z15 = false;
        boolean z16 = false;
        float f13 = 0.0f;
        boolean z17 = true;
        while (true) {
            int i39 = iMax4;
            int i44 = 8;
            if (i38 >= virtualChildCount) {
                int i45 = mode2;
                float f14 = f13;
                int i46 = virtualChildCount;
                boolean z18 = z14;
                int i47 = iMax5;
                int i48 = i35;
                int iMax6 = i36;
                int iCombineMeasuredStates = i37;
                if (linearLayoutCompat.mTotalLength > 0 && linearLayoutCompat.hasDividerBeforeChildAt(i46)) {
                    linearLayoutCompat.mTotalLength += linearLayoutCompat.mDividerHeight;
                }
                int i49 = i45;
                if (z18 && (i49 == Integer.MIN_VALUE || i49 == 0)) {
                    linearLayoutCompat.mTotalLength = 0;
                    for (int i54 = 0; i54 < i46; i54++) {
                        View childAt = linearLayoutCompat.getChildAt(i54);
                        if (childAt == null) {
                            linearLayoutCompat.mTotalLength = linearLayoutCompat.mTotalLength;
                        } else if (childAt.getVisibility() != 8) {
                            C31990o1 c31990o1 = (C31990o1) childAt.getLayoutParams();
                            int i55 = linearLayoutCompat.mTotalLength;
                            linearLayoutCompat.mTotalLength = Math.max(i55, i55 + i39 + ((LinearLayout.LayoutParams) c31990o1).topMargin + ((LinearLayout.LayoutParams) c31990o1).bottomMargin);
                        }
                    }
                }
                int paddingBottom = linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + linearLayoutCompat.mTotalLength;
                linearLayoutCompat.mTotalLength = paddingBottom;
                int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, linearLayoutCompat.getSuggestedMinimumHeight()), i14, 0);
                int i56 = (16777215 & iResolveSizeAndState) - linearLayoutCompat.mTotalLength;
                if (z15 || (i56 != 0 && f14 > 0.0f)) {
                    float f15 = linearLayoutCompat.mWeightSum;
                    if (f15 > 0.0f) {
                        f14 = f15;
                    }
                    linearLayoutCompat.mTotalLength = 0;
                    int i57 = i47;
                    int i58 = 0;
                    while (i58 < i46) {
                        View childAt2 = linearLayoutCompat.getChildAt(i58);
                        if (childAt2.getVisibility() == i44) {
                            i49 = i49;
                        } else {
                            C31990o1 c31990o2 = (C31990o1) childAt2.getLayoutParams();
                            float f16 = ((LinearLayout.LayoutParams) c31990o2).weight;
                            if (f16 > 0.0f) {
                                int i59 = (int) ((i56 * f16) / f14);
                                f14 -= f16;
                                i56 -= i59;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i13, linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + ((LinearLayout.LayoutParams) c31990o2).leftMargin + ((LinearLayout.LayoutParams) c31990o2).rightMargin, ((LinearLayout.LayoutParams) c31990o2).width);
                                if (((LinearLayout.LayoutParams) c31990o2).height == 0) {
                                    i16 = 1073741824;
                                    if (i49 == 1073741824) {
                                        childAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i59 > 0 ? i59 : 0, 1073741824));
                                    }
                                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt2.getMeasuredState() & (-256));
                                } else {
                                    i16 = 1073741824;
                                }
                                int measuredHeight = childAt2.getMeasuredHeight() + i59;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                childAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i16));
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt2.getMeasuredState() & (-256));
                            } else {
                                i49 = i49;
                            }
                            int i64 = ((LinearLayout.LayoutParams) c31990o2).leftMargin + ((LinearLayout.LayoutParams) c31990o2).rightMargin;
                            int measuredWidth = childAt2.getMeasuredWidth() + i64;
                            iMax6 = Math.max(iMax6, measuredWidth);
                            if (mode != 1073741824) {
                                i15 = -1;
                                if (((LinearLayout.LayoutParams) c31990o2).width == -1) {
                                    measuredWidth = i64;
                                }
                            } else {
                                i15 = -1;
                            }
                            int iMax7 = Math.max(i57, measuredWidth);
                            boolean z19 = z17 && ((LinearLayout.LayoutParams) c31990o2).width == i15;
                            int i65 = linearLayoutCompat.mTotalLength;
                            linearLayoutCompat.mTotalLength = Math.max(i65, childAt2.getMeasuredHeight() + i65 + ((LinearLayout.LayoutParams) c31990o2).topMargin + ((LinearLayout.LayoutParams) c31990o2).bottomMargin);
                            z17 = z19;
                            i57 = iMax7;
                        }
                        i58++;
                        i49 = i49;
                        i44 = 8;
                    }
                    linearLayoutCompat.mTotalLength = linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + linearLayoutCompat.mTotalLength;
                    iMax = i57;
                } else {
                    iMax = Math.max(i47, i48);
                    if (z18 && i49 != 1073741824) {
                        for (int i66 = 0; i66 < i46; i66++) {
                            View childAt3 = linearLayoutCompat.getChildAt(i66);
                            if (childAt3 != null && childAt3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C31990o1) childAt3.getLayoutParams())).weight > 0.0f) {
                                childAt3.measure(View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i39, 1073741824));
                            }
                        }
                    }
                }
                if (!z17 && mode != 1073741824) {
                    iMax6 = iMax;
                }
                linearLayoutCompat.setMeasuredDimension(View.resolveSizeAndState(Math.max(linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + iMax6, linearLayoutCompat.getSuggestedMinimumWidth()), i13, iCombineMeasuredStates), iResolveSizeAndState);
                if (z16) {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(linearLayoutCompat.getMeasuredWidth(), 1073741824);
                    int i67 = 0;
                    while (i67 < i46) {
                        View childAt4 = linearLayoutCompat.getChildAt(i67);
                        if (childAt4.getVisibility() != 8) {
                            C31990o1 c31990o3 = (C31990o1) childAt4.getLayoutParams();
                            if (((LinearLayout.LayoutParams) c31990o3).width == -1) {
                                int i68 = ((LinearLayout.LayoutParams) c31990o3).height;
                                ((LinearLayout.LayoutParams) c31990o3).height = childAt4.getMeasuredHeight();
                                linearLayoutCompat.measureChildWithMargins(childAt4, iMakeMeasureSpec, 0, i14, 0);
                                ((LinearLayout.LayoutParams) c31990o3).height = i68;
                            }
                        }
                        i67++;
                        linearLayoutCompat = this;
                    }
                    return;
                }
                return;
            }
            float f17 = f13;
            View childAt5 = linearLayoutCompat.getChildAt(i38);
            if (childAt5 == null) {
                linearLayoutCompat.mTotalLength = linearLayoutCompat.mTotalLength;
            } else {
                if (childAt5.getVisibility() != 8) {
                    if (linearLayoutCompat.hasDividerBeforeChildAt(i38)) {
                        linearLayoutCompat.mTotalLength += linearLayoutCompat.mDividerHeight;
                    }
                    C31990o1 c31990o4 = (C31990o1) childAt5.getLayoutParams();
                    float f18 = ((LinearLayout.LayoutParams) c31990o4).weight;
                    float f19 = f17 + f18;
                    if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) c31990o4).height == 0 && f18 > 0.0f) {
                        int i69 = linearLayoutCompat.mTotalLength;
                        linearLayoutCompat.mTotalLength = Math.max(i69, ((LinearLayout.LayoutParams) c31990o4).topMargin + i69 + ((LinearLayout.LayoutParams) c31990o4).bottomMargin);
                        i28 = virtualChildCount;
                        z4 = z14;
                        i25 = iMax5;
                        iMax4 = i39;
                        z15 = true;
                        i26 = i35;
                        i29 = i36;
                        i27 = i37;
                        i24 = mode2;
                    } else {
                        if (((LinearLayout.LayoutParams) c31990o4).height != 0 || f18 <= 0.0f) {
                            i17 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) c31990o4).height = -2;
                            i17 = 0;
                        }
                        if (f19 == 0.0f) {
                            int i74 = i37;
                            i19 = linearLayoutCompat.mTotalLength;
                            i18 = i74;
                        } else {
                            i18 = i37;
                            i19 = 0;
                        }
                        i24 = mode2;
                        z4 = z14;
                        i25 = iMax5;
                        i26 = i35;
                        i27 = i18;
                        i28 = virtualChildCount;
                        i29 = i36;
                        linearLayoutCompat.measureChildWithMargins(childAt5, i13, 0, i14, i19);
                        if (i17 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) c31990o4).height = i17;
                        }
                        int measuredHeight2 = childAt5.getMeasuredHeight();
                        int i75 = linearLayoutCompat.mTotalLength;
                        linearLayoutCompat.mTotalLength = Math.max(i75, i75 + measuredHeight2 + ((LinearLayout.LayoutParams) c31990o4).topMargin + ((LinearLayout.LayoutParams) c31990o4).bottomMargin);
                        iMax4 = z4 ? Math.max(measuredHeight2, i39) : i39;
                    }
                    if (i34 >= 0 && i34 == i38 + 1) {
                        linearLayoutCompat.mBaselineChildTop = linearLayoutCompat.mTotalLength;
                    }
                    if (i38 < i34 && ((LinearLayout.LayoutParams) c31990o4).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (mode == 1073741824 || ((LinearLayout.LayoutParams) c31990o4).width != -1) {
                        z13 = false;
                    } else {
                        z13 = true;
                        z16 = true;
                    }
                    int i76 = ((LinearLayout.LayoutParams) c31990o4).leftMargin + ((LinearLayout.LayoutParams) c31990o4).rightMargin;
                    int measuredWidth2 = childAt5.getMeasuredWidth() + i76;
                    iMax2 = Math.max(i29, measuredWidth2);
                    int iCombineMeasuredStates2 = View.combineMeasuredStates(i27, childAt5.getMeasuredState());
                    z17 = z17 && ((LinearLayout.LayoutParams) c31990o4).width == -1;
                    if (((LinearLayout.LayoutParams) c31990o4).weight > 0.0f) {
                        if (!z13) {
                            i76 = measuredWidth2;
                        }
                        iMax3 = Math.max(i26, i76);
                        iMax5 = i25;
                    } else {
                        if (!z13) {
                            i76 = measuredWidth2;
                        }
                        iMax5 = Math.max(i25, i76);
                        iMax3 = i26;
                    }
                    i37 = iCombineMeasuredStates2;
                    f13 = f19;
                }
                i38++;
                i35 = iMax3;
                i36 = iMax2;
                mode2 = i24;
                virtualChildCount = i28;
                z14 = z4;
            }
            i28 = virtualChildCount;
            z4 = z14;
            iMax4 = i39;
            f13 = f17;
            iMax2 = i36;
            i24 = mode2;
            iMax3 = i35;
            i38++;
            i35 = iMax3;
            i36 = iMax2;
            mode2 = i24;
            virtualChildCount = i28;
            z14 = z4;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mDivider == null) {
            return;
        }
        if (this.mOrientation == 1) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        if (this.mOrientation == 1) {
            layoutVertical(i13, i14, i15, i16);
        } else {
            layoutHorizontal(i13, i14, i15, i16);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i13, int i14) {
        if (this.mOrientation == 1) {
            measureVertical(i13, i14);
        } else {
            measureHorizontal(i13, i14);
        }
    }

    public void setBaselineAligned(boolean z4) {
        this.mBaselineAligned = z4;
    }

    public void setBaselineAlignedChildIndex(int i13) {
        if (i13 >= 0 && i13 < getChildCount()) {
            this.mBaselineAlignedChildIndex = i13;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.mDivider) {
            return;
        }
        this.mDivider = drawable;
        if (drawable != null) {
            this.mDividerWidth = drawable.getIntrinsicWidth();
            this.mDividerHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerWidth = 0;
            this.mDividerHeight = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i13) {
        this.mDividerPadding = i13;
    }

    public void setGravity(int i13) {
        if (this.mGravity != i13) {
            if ((8388615 & i13) == 0) {
                i13 |= 8388611;
            }
            if ((i13 & 112) == 0) {
                i13 |= 48;
            }
            this.mGravity = i13;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i13) {
        int i14 = i13 & 8388615;
        int i15 = this.mGravity;
        if ((8388615 & i15) != i14) {
            this.mGravity = i14 | ((-8388616) & i15);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z4) {
        this.mUseLargestChild = z4;
    }

    public void setOrientation(int i13) {
        if (this.mOrientation != i13) {
            this.mOrientation = i13;
            requestLayout();
        }
    }

    public void setShowDividers(int i13) {
        if (i13 != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i13;
    }

    public void setVerticalGravity(int i13) {
        int i14 = i13 & 112;
        int i15 = this.mGravity;
        if ((i15 & 112) != i14) {
            this.mGravity = i14 | (i15 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f13) {
        this.mWeightSum = Math.max(0.0f, f13);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        int[] iArr = AbstractC22932a.f90521n;
        C31983m2 c31983m2M99479q = C31983m2.m99479q(context, attributeSet, iArr, i13);
        AbstractC16901p0.m47582m(this, context, iArr, attributeSet, (TypedArray) c31983m2M99479q.f132769x, i13);
        TypedArray typedArray = (TypedArray) c31983m2M99479q.f132769x;
        int i14 = typedArray.getInt(1, -1);
        if (i14 >= 0) {
            setOrientation(i14);
        }
        int i15 = typedArray.getInt(0, -1);
        if (i15 >= 0) {
            setGravity(i15);
        }
        boolean z4 = typedArray.getBoolean(2, true);
        if (!z4) {
            setBaselineAligned(z4);
        }
        this.mWeightSum = typedArray.getFloat(4, -1.0f);
        this.mBaselineAlignedChildIndex = typedArray.getInt(3, -1);
        this.mUseLargestChild = typedArray.getBoolean(7, false);
        setDividerDrawable(c31983m2M99479q.m99486j(5));
        this.mShowDividers = typedArray.getInt(8, 0);
        this.mDividerPadding = typedArray.getDimensionPixelSize(6, 0);
        c31983m2M99479q.m99491r();
    }

    @Override // android.view.ViewGroup
    public C31990o1 generateDefaultLayoutParams() {
        int i13 = this.mOrientation;
        if (i13 == 0) {
            return new C31990o1(-2, -2);
        }
        if (i13 == 1) {
            return new C31990o1(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public C31990o1 generateLayoutParams(AttributeSet attributeSet) {
        return new C31990o1(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public C31990o1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C31990o1) {
            return new C31990o1((C31990o1) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C31990o1((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C31990o1(layoutParams);
    }
}
