package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whoop.android.R;
import java.util.WeakHashMap;
import p184h5.AbstractC16901p0;
import p474s.C31990o1;

/* JADX INFO: loaded from: classes5.dex */
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: d */
    public static int m3288d(View view) {
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return m3288d(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009e  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        int i17;
        int i18;
        int i19;
        int paddingLeft = getPaddingLeft();
        int i24 = i15 - i13;
        int paddingRight = i24 - getPaddingRight();
        int paddingRight2 = (i24 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i25 = gravity & 112;
        int i26 = gravity & 8388615;
        int paddingTop = i25 != 16 ? i25 != 80 ? getPaddingTop() : ((getPaddingTop() + i16) - i14) - measuredHeight : (((i16 - i14) - measuredHeight) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i27 = 0; i27 < childCount; i27++) {
            View childAt = getChildAt(i27);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                C31990o1 c31990o1 = (C31990o1) childAt.getLayoutParams();
                int i28 = ((LinearLayout.LayoutParams) c31990o1).gravity;
                if (i28 < 0) {
                    i28 = i26;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i28, getLayoutDirection()) & 7;
                if (absoluteGravity != 1) {
                    if (absoluteGravity != 5) {
                        i19 = ((LinearLayout.LayoutParams) c31990o1).leftMargin + paddingLeft;
                    } else {
                        i17 = paddingRight - measuredWidth;
                        i18 = ((LinearLayout.LayoutParams) c31990o1).rightMargin;
                    }
                    if (hasDividerBeforeChildAt(i27)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i29 = paddingTop + ((LinearLayout.LayoutParams) c31990o1).topMargin;
                    childAt.layout(i19, i29, measuredWidth + i19, i29 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c31990o1).bottomMargin + i29;
                } else {
                    i17 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) c31990o1).leftMargin;
                    i18 = ((LinearLayout.LayoutParams) c31990o1).rightMargin;
                }
                i19 = i17 - i18;
                if (hasDividerBeforeChildAt(i27)) {
                    paddingTop += intrinsicHeight;
                }
                int i210 = paddingTop + ((LinearLayout.LayoutParams) c31990o1).topMargin;
                childAt.layout(i19, i210, measuredWidth + i19, i210 + measuredHeight2);
                paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c31990o1).bottomMargin + i210;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i13, int i14) {
        int iCombineMeasuredStates;
        int iM3288d;
        int measuredHeight;
        int measuredHeight2;
        AlertDialogLayout alertDialogLayout = this;
        int childCount = alertDialogLayout.getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = alertDialogLayout.getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                int id4 = childAt.getId();
                if (id4 == R.id.topPanel) {
                    view = childAt;
                } else if (id4 == R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id4 != R.id.contentPanel && id4 != R.id.customPanel) || view3 != null) {
                        super.onMeasure(i13, i14);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i14);
        int size = View.MeasureSpec.getSize(i14);
        int mode2 = View.MeasureSpec.getMode(i13);
        int paddingBottom = alertDialogLayout.getPaddingBottom() + alertDialogLayout.getPaddingTop();
        if (view != null) {
            view.measure(i13, 0);
            paddingBottom += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i13, 0);
            iM3288d = m3288d(view2);
            measuredHeight = view2.getMeasuredHeight() - iM3288d;
            paddingBottom += iM3288d;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iM3288d = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i13, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingBottom += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i16 = size - paddingBottom;
        if (view2 != null) {
            int i17 = paddingBottom - iM3288d;
            int iMin = Math.min(i16, measuredHeight);
            if (iMin > 0) {
                i16 -= iMin;
                iM3288d += iMin;
            }
            view2.measure(i13, View.MeasureSpec.makeMeasureSpec(iM3288d, 1073741824));
            paddingBottom = i17 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i16 > 0) {
            view3.measure(i13, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i16, mode));
            paddingBottom = (paddingBottom - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt2 = alertDialogLayout.getChildAt(i18);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        int i19 = i14;
        alertDialogLayout.setMeasuredDimension(View.resolveSizeAndState(alertDialogLayout.getPaddingRight() + alertDialogLayout.getPaddingLeft() + iMax, i13, iCombineMeasuredStates), View.resolveSizeAndState(paddingBottom, i19, 0));
        if (mode2 != 1073741824) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(alertDialogLayout.getMeasuredWidth(), 1073741824);
            int i24 = 0;
            while (i24 < childCount) {
                View childAt3 = alertDialogLayout.getChildAt(i24);
                if (childAt3.getVisibility() != 8) {
                    C31990o1 c31990o1 = (C31990o1) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c31990o1).width == -1) {
                        int i25 = ((LinearLayout.LayoutParams) c31990o1).height;
                        ((LinearLayout.LayoutParams) c31990o1).height = childAt3.getMeasuredHeight();
                        alertDialogLayout.measureChildWithMargins(childAt3, iMakeMeasureSpec, 0, i19, 0);
                        ((LinearLayout.LayoutParams) c31990o1).height = i25;
                    }
                }
                i24++;
                alertDialogLayout = this;
                i19 = i14;
            }
        }
    }
}
