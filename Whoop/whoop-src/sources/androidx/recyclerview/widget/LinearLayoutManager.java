package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;

/* JADX INFO: loaded from: classes5.dex */
public class LinearLayoutManager extends AbstractC1740u1 implements InterfaceC1693i2 {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final C1731s0 mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final C1735t0 mLayoutChunkResult;
    private C1739u0 mLayoutState;
    int mOrientation;
    AbstractC1667c1 mOrientationHelper;
    C1747w0 mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    public LinearLayoutManager(int i13) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C1731s0();
        this.mLayoutChunkResult = new C1735t0();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i13);
        setReverseLayout(false);
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    @SuppressLint({"UnknownNullness"})
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void calculateExtraLayoutSpace(C1701k2 c1701k2, int[] iArr) {
        int i13;
        int extraLayoutSpace = getExtraLayoutSpace(c1701k2);
        if (this.mLayoutState.f6876f == -1) {
            i13 = 0;
        } else {
            i13 = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i13;
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    @SuppressLint({"UnknownNullness"})
    public void collectAdjacentPrefetchPositions(int i13, int i14, C1701k2 c1701k2, InterfaceC1732s1 interfaceC1732s1) {
        if (this.mOrientation != 0) {
            i13 = i14;
        }
        if (getChildCount() == 0 || i13 == 0) {
            return;
        }
        ensureLayoutState();
        m5121o(i13 > 0 ? 1 : -1, Math.abs(i13), true, c1701k2);
        collectPrefetchPositionsForLayoutState(c1701k2, this.mLayoutState, interfaceC1732s1);
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    @SuppressLint({"UnknownNullness"})
    public void collectInitialPrefetchPositions(int i13, InterfaceC1732s1 interfaceC1732s1) {
        boolean z4;
        int i14;
        C1747w0 c1747w0 = this.mPendingSavedState;
        if (c1747w0 == null || (i14 = c1747w0.f6909w) < 0) {
            m5120n();
            z4 = this.mShouldReverseLayout;
            i14 = this.mPendingScrollPosition;
            if (i14 == -1) {
                i14 = z4 ? i13 - 1 : 0;
            }
        } else {
            z4 = c1747w0.f6911y;
        }
        int i15 = z4 ? -1 : 1;
        for (int i16 = 0; i16 < this.mInitialPrefetchItemCount && i14 >= 0 && i14 < i13; i16++) {
            ((C1675e0) interfaceC1732s1).m5231a(i14, 0);
            i14 += i15;
        }
    }

    public void collectPrefetchPositionsForLayoutState(C1701k2 c1701k2, C1739u0 c1739u0, InterfaceC1732s1 interfaceC1732s1) {
        int i13 = c1739u0.f6874d;
        if (i13 < 0 || i13 >= c1701k2.m5276b()) {
            return;
        }
        ((C1675e0) interfaceC1732s1).m5231a(i13, Math.max(0, c1739u0.f6877g));
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollExtent(C1701k2 c1701k2) {
        return m5110d(c1701k2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollOffset(C1701k2 c1701k2) {
        return m5111e(c1701k2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollRange(C1701k2 c1701k2) {
        return m5112f(c1701k2);
    }

    @Override // androidx.recyclerview.widget.InterfaceC1693i2
    @SuppressLint({"UnknownNullness"})
    public PointF computeScrollVectorForPosition(int i13) {
        if (getChildCount() == 0) {
            return null;
        }
        int i14 = (i13 < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(i14, 0.0f) : new PointF(0.0f, i14);
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollExtent(C1701k2 c1701k2) {
        return m5110d(c1701k2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollOffset(C1701k2 c1701k2) {
        return m5111e(c1701k2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollRange(C1701k2 c1701k2) {
        return m5112f(c1701k2);
    }

    public int convertFocusDirectionToLayoutDirection(int i13) {
        if (i13 == 1) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
        }
        if (i13 == 2) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1;
        }
        if (i13 == 17) {
            return this.mOrientation == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i13 == 33) {
            return this.mOrientation == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i13 != 66) {
            return (i13 == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.mOrientation == 0 ? 1 : Integer.MIN_VALUE;
    }

    public C1739u0 createLayoutState() {
        C1739u0 c1739u0 = new C1739u0();
        c1739u0.f6871a = true;
        c1739u0.f6878h = 0;
        c1739u0.f6879i = 0;
        c1739u0.f6881k = null;
        return c1739u0;
    }

    /* JADX INFO: renamed from: d */
    public final int m5110d(C1701k2 c1701k2) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return AbstractC1670d.m5213d(c1701k2, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    /* JADX INFO: renamed from: e */
    public final int m5111e(C1701k2 c1701k2) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return AbstractC1670d.m5214e(c1701k2, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m5112f(C1701k2 c1701k2) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return AbstractC1670d.m5215f(c1701k2, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public int fill(C1668c2 c1668c2, C1739u0 c1739u0, C1701k2 c1701k2, boolean z4) {
        int i13;
        int i14 = c1739u0.f6873c;
        int i15 = c1739u0.f6877g;
        if (i15 != Integer.MIN_VALUE) {
            if (i14 < 0) {
                c1739u0.f6877g = i15 + i14;
            }
            m5118l(c1668c2, c1739u0);
        }
        int i16 = c1739u0.f6873c + c1739u0.f6878h;
        C1735t0 c1735t0 = this.mLayoutChunkResult;
        while (true) {
            if ((!c1739u0.f6882l && i16 <= 0) || (i13 = c1739u0.f6874d) < 0 || i13 >= c1701k2.m5276b()) {
                break;
            }
            c1735t0.f6862a = 0;
            c1735t0.f6863b = false;
            c1735t0.f6864c = false;
            c1735t0.f6865d = false;
            layoutChunk(c1668c2, c1701k2, c1739u0, c1735t0);
            if (!c1735t0.f6863b) {
                int i17 = c1739u0.f6872b;
                int i18 = c1735t0.f6862a;
                c1739u0.f6872b = (c1739u0.f6876f * i18) + i17;
                if (!c1735t0.f6864c || c1739u0.f6881k != null || !c1701k2.f6727g) {
                    c1739u0.f6873c -= i18;
                    i16 -= i18;
                }
                int i19 = c1739u0.f6877g;
                if (i19 != Integer.MIN_VALUE) {
                    int i24 = i19 + i18;
                    c1739u0.f6877g = i24;
                    int i25 = c1739u0.f6873c;
                    if (i25 < 0) {
                        c1739u0.f6877g = i24 + i25;
                    }
                    m5118l(c1668c2, c1739u0);
                }
                if (z4 && c1735t0.f6865d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i14 - c1739u0.f6873c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z4, boolean z13) {
        return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z4, z13) : findOneVisibleChild(getChildCount() - 1, -1, z4, z13);
    }

    public View findFirstVisibleChildClosestToStart(boolean z4, boolean z13) {
        return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z4, z13) : findOneVisibleChild(0, getChildCount(), z4, z13);
    }

    public int findFirstVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i13, int i14) {
        int i15;
        int i16;
        ensureLayoutState();
        if (i14 <= i13 && i14 >= i13) {
            return getChildAt(i13);
        }
        if (this.mOrientationHelper.mo5181e(getChildAt(i13)) < this.mOrientationHelper.mo5187k()) {
            i15 = 16644;
            i16 = 16388;
        } else {
            i15 = 4161;
            i16 = DfuBaseService.ERROR_FILE_NOT_FOUND;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.m5350a(i13, i14, i15, i16) : this.mVerticalBoundCheck.m5350a(i13, i14, i15, i16);
    }

    public View findOneVisibleChild(int i13, int i14, boolean z4, boolean z13) {
        ensureLayoutState();
        int i15 = z4 ? 24579 : 320;
        int i16 = z13 ? 320 : 0;
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.m5350a(i13, i14, i15, i16) : this.mVerticalBoundCheck.m5350a(i13, i14, i15, i16);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    public View findReferenceChild(C1668c2 c1668c2, C1701k2 c1701k2, boolean z4, boolean z13) {
        int i13;
        int childCount;
        int i14;
        ensureLayoutState();
        int childCount2 = getChildCount();
        if (z13) {
            childCount = getChildCount() - 1;
            i13 = -1;
            i14 = -1;
        } else {
            i13 = childCount2;
            childCount = 0;
            i14 = 1;
        }
        int iM5276b = c1701k2.m5276b();
        int iMo5187k = this.mOrientationHelper.mo5187k();
        int iMo5183g = this.mOrientationHelper.mo5183g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (childCount != i13) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            int iMo5181e = this.mOrientationHelper.mo5181e(childAt);
            int iMo5178b = this.mOrientationHelper.mo5178b(childAt);
            if (position >= 0 && position < iM5276b) {
                if (!((C1744v1) childAt.getLayoutParams()).f6891a.isRemoved()) {
                    boolean z14 = iMo5178b <= iMo5187k && iMo5181e < iMo5187k;
                    boolean z15 = iMo5181e >= iMo5183g && iMo5178b > iMo5183g;
                    if (!z14 && !z15) {
                        return childAt;
                    }
                    if (z4) {
                        if (z15) {
                            view2 = childAt;
                        } else if (view == null) {
                            view = childAt;
                        }
                    } else if (z14) {
                        view2 = childAt;
                    } else if (view == null) {
                        view = childAt;
                    }
                } else if (view3 == null) {
                    view3 = childAt;
                }
            }
            childCount += i14;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    @SuppressLint({"UnknownNullness"})
    public View findViewByPosition(int i13) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i13 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i13) {
                return childAt;
            }
        }
        return super.findViewByPosition(i13);
    }

    /* JADX INFO: renamed from: g */
    public final int m5113g(int i13, C1668c2 c1668c2, C1701k2 c1701k2, boolean z4) {
        int iMo5183g;
        int iMo5183g2 = this.mOrientationHelper.mo5183g() - i13;
        if (iMo5183g2 <= 0) {
            return 0;
        }
        int i14 = -scrollBy(-iMo5183g2, c1668c2, c1701k2);
        int i15 = i13 + i14;
        if (!z4 || (iMo5183g = this.mOrientationHelper.mo5183g() - i15) <= 0) {
            return i14;
        }
        this.mOrientationHelper.mo5191o(iMo5183g);
        return iMo5183g + i14;
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    @SuppressLint({"UnknownNullness"})
    public C1744v1 generateDefaultLayoutParams() {
        return new C1744v1(-2, -2);
    }

    @Deprecated
    public int getExtraLayoutSpace(C1701k2 c1701k2) {
        if (c1701k2.f6721a != -1) {
            return this.mOrientationHelper.mo5188l();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    /* JADX INFO: renamed from: h */
    public final int m5114h(int i13, C1668c2 c1668c2, C1701k2 c1701k2, boolean z4) {
        int iMo5187k;
        int iMo5187k2 = i13 - this.mOrientationHelper.mo5187k();
        if (iMo5187k2 <= 0) {
            return 0;
        }
        int i14 = -scrollBy(iMo5187k2, c1668c2, c1701k2);
        int i15 = i13 + i14;
        if (!z4 || (iMo5187k = i15 - this.mOrientationHelper.mo5187k()) <= 0) {
            return i14;
        }
        this.mOrientationHelper.mo5191o(-iMo5187k);
        return i14 - iMo5187k;
    }

    /* JADX INFO: renamed from: i */
    public final View m5115i() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    /* JADX INFO: renamed from: j */
    public final View m5116j() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    /* JADX INFO: renamed from: k */
    public final void m5117k() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            Log.d(TAG, "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.mo5181e(childAt));
        }
        Log.d(TAG, "==============");
    }

    /* JADX INFO: renamed from: l */
    public final void m5118l(C1668c2 c1668c2, C1739u0 c1739u0) {
        if (!c1739u0.f6871a || c1739u0.f6882l) {
            return;
        }
        int i13 = c1739u0.f6877g;
        int i14 = c1739u0.f6879i;
        if (c1739u0.f6876f == -1) {
            int childCount = getChildCount();
            if (i13 < 0) {
                return;
            }
            int iMo5182f = (this.mOrientationHelper.mo5182f() - i13) + i14;
            if (this.mShouldReverseLayout) {
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = getChildAt(i15);
                    if (this.mOrientationHelper.mo5181e(childAt) < iMo5182f || this.mOrientationHelper.mo5190n(childAt) < iMo5182f) {
                        m5119m(c1668c2, 0, i15);
                        return;
                    }
                }
                return;
            }
            int i16 = childCount - 1;
            for (int i17 = i16; i17 >= 0; i17--) {
                View childAt2 = getChildAt(i17);
                if (this.mOrientationHelper.mo5181e(childAt2) < iMo5182f || this.mOrientationHelper.mo5190n(childAt2) < iMo5182f) {
                    m5119m(c1668c2, i16, i17);
                    return;
                }
            }
            return;
        }
        if (i13 < 0) {
            return;
        }
        int i18 = i13 - i14;
        int childCount2 = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i19 = 0; i19 < childCount2; i19++) {
                View childAt3 = getChildAt(i19);
                if (this.mOrientationHelper.mo5178b(childAt3) > i18 || this.mOrientationHelper.mo5189m(childAt3) > i18) {
                    m5119m(c1668c2, 0, i19);
                    return;
                }
            }
            return;
        }
        int i24 = childCount2 - 1;
        for (int i25 = i24; i25 >= 0; i25--) {
            View childAt4 = getChildAt(i25);
            if (this.mOrientationHelper.mo5178b(childAt4) > i18 || this.mOrientationHelper.mo5189m(childAt4) > i18) {
                m5119m(c1668c2, i24, i25);
                return;
            }
        }
    }

    public void layoutChunk(C1668c2 c1668c2, C1701k2 c1701k2, C1739u0 c1739u0, C1735t0 c1735t0) {
        int iMo5180d;
        int i13;
        int i14;
        int i15;
        int paddingLeft;
        int iMo5180d2;
        int i16;
        int i17;
        View viewM5329b = c1739u0.m5329b(c1668c2);
        if (viewM5329b == null) {
            c1735t0.f6863b = true;
            return;
        }
        C1744v1 c1744v1 = (C1744v1) viewM5329b.getLayoutParams();
        if (c1739u0.f6881k == null) {
            if (this.mShouldReverseLayout == (c1739u0.f6876f == -1)) {
                addView(viewM5329b);
            } else {
                addView(viewM5329b, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (c1739u0.f6876f == -1)) {
                addDisappearingView(viewM5329b);
            } else {
                addDisappearingView(viewM5329b, 0);
            }
        }
        measureChildWithMargins(viewM5329b, 0, 0);
        c1735t0.f6862a = this.mOrientationHelper.mo5179c(viewM5329b);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                iMo5180d2 = getWidth() - getPaddingRight();
                paddingLeft = iMo5180d2 - this.mOrientationHelper.mo5180d(viewM5329b);
            } else {
                paddingLeft = getPaddingLeft();
                iMo5180d2 = this.mOrientationHelper.mo5180d(viewM5329b) + paddingLeft;
            }
            if (c1739u0.f6876f == -1) {
                i17 = c1739u0.f6872b;
                i16 = i17 - c1735t0.f6862a;
            } else {
                i16 = c1739u0.f6872b;
                i17 = c1735t0.f6862a + i16;
            }
            int i18 = paddingLeft;
            i15 = i16;
            i14 = i18;
            iMo5180d = i17;
            i13 = iMo5180d2;
        } else {
            int paddingTop = getPaddingTop();
            iMo5180d = this.mOrientationHelper.mo5180d(viewM5329b) + paddingTop;
            if (c1739u0.f6876f == -1) {
                int i19 = c1739u0.f6872b;
                i14 = i19 - c1735t0.f6862a;
                i13 = i19;
            } else {
                int i24 = c1739u0.f6872b;
                i13 = c1735t0.f6862a + i24;
                i14 = i24;
            }
            i15 = paddingTop;
        }
        layoutDecoratedWithMargins(viewM5329b, i14, i15, i13, iMo5180d);
        if (c1744v1.f6891a.isRemoved() || c1744v1.f6891a.isUpdated()) {
            c1735t0.f6864c = true;
        }
        c1735t0.f6865d = viewM5329b.hasFocusable();
    }

    /* JADX INFO: renamed from: m */
    public final void m5119m(C1668c2 c1668c2, int i13, int i14) {
        if (i13 == i14) {
            return;
        }
        if (i14 <= i13) {
            while (i13 > i14) {
                removeAndRecycleViewAt(i13, c1668c2);
                i13--;
            }
        } else {
            for (int i15 = i14 - 1; i15 >= i13; i15--) {
                removeAndRecycleViewAt(i15, c1668c2);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m5120n() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m5121o(int i13, int i14, boolean z4, C1701k2 c1701k2) {
        int iMo5187k;
        this.mLayoutState.f6882l = resolveIsInfinite();
        this.mLayoutState.f6876f = i13;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c1701k2, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]);
        int iMax2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z13 = i13 == 1;
        C1739u0 c1739u0 = this.mLayoutState;
        int i15 = z13 ? iMax2 : iMax;
        c1739u0.f6878h = i15;
        if (!z13) {
            iMax = iMax2;
        }
        c1739u0.f6879i = iMax;
        if (z13) {
            c1739u0.f6878h = this.mOrientationHelper.mo5184h() + i15;
            View viewM5115i = m5115i();
            C1739u0 c1739u1 = this.mLayoutState;
            c1739u1.f6875e = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(viewM5115i);
            C1739u0 c1739u2 = this.mLayoutState;
            c1739u1.f6874d = position + c1739u2.f6875e;
            c1739u2.f6872b = this.mOrientationHelper.mo5178b(viewM5115i);
            iMo5187k = this.mOrientationHelper.mo5178b(viewM5115i) - this.mOrientationHelper.mo5183g();
        } else {
            View viewM5116j = m5116j();
            C1739u0 c1739u3 = this.mLayoutState;
            c1739u3.f6878h = this.mOrientationHelper.mo5187k() + c1739u3.f6878h;
            C1739u0 c1739u4 = this.mLayoutState;
            c1739u4.f6875e = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(viewM5116j);
            C1739u0 c1739u5 = this.mLayoutState;
            c1739u4.f6874d = position2 + c1739u5.f6875e;
            c1739u5.f6872b = this.mOrientationHelper.mo5181e(viewM5116j);
            iMo5187k = (-this.mOrientationHelper.mo5181e(viewM5116j)) + this.mOrientationHelper.mo5187k();
        }
        C1739u0 c1739u6 = this.mLayoutState;
        c1739u6.f6873c = i14;
        if (z4) {
            c1739u6.f6873c = i14 - iMo5187k;
        }
        c1739u6.f6877g = iMo5187k;
    }

    public void onAnchorReady(C1668c2 c1668c2, C1701k2 c1701k2, C1731s0 c1731s0, int i13) {
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    @SuppressLint({"UnknownNullness"})
    public void onDetachedFromWindow(RecyclerView recyclerView, C1668c2 c1668c2) {
        onDetachedFromWindow(recyclerView);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(c1668c2);
            c1668c2.f6591a.clear();
            c1668c2.m5200g();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    @SuppressLint({"UnknownNullness"})
    public View onFocusSearchFailed(View view, int i13, C1668c2 c1668c2, C1701k2 c1701k2) {
        int iConvertFocusDirectionToLayoutDirection;
        View viewFindOnePartiallyOrCompletelyInvisibleChild;
        m5120n();
        if (getChildCount() != 0 && (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i13)) != Integer.MIN_VALUE) {
            ensureLayoutState();
            m5121o(iConvertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.mo5188l() * MAX_SCROLL_FACTOR), false, c1701k2);
            C1739u0 c1739u0 = this.mLayoutState;
            c1739u0.f6877g = Integer.MIN_VALUE;
            c1739u0.f6871a = false;
            fill(c1668c2, c1739u0, c1701k2, true);
            if (iConvertFocusDirectionToLayoutDirection == -1) {
                viewFindOnePartiallyOrCompletelyInvisibleChild = this.mShouldReverseLayout ? findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1) : findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
            } else {
                viewFindOnePartiallyOrCompletelyInvisibleChild = this.mShouldReverseLayout ? findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount()) : findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
            }
            View viewM5116j = iConvertFocusDirectionToLayoutDirection == -1 ? m5116j() : m5115i();
            if (!viewM5116j.hasFocusable()) {
                return viewFindOnePartiallyOrCompletelyInvisibleChild;
            }
            if (viewFindOnePartiallyOrCompletelyInvisibleChild != null) {
                return viewM5116j;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    @SuppressLint({"UnknownNullness"})
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:111:0x01f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:118:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:120:0x0201  */
    /* JADX WARN: Code duplicated, block: B:122:0x0208  */
    /* JADX WARN: Code duplicated, block: B:123:0x020e  */
    /* JADX WARN: Code duplicated, block: B:87:0x017e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0184  */
    /* JADX WARN: Code duplicated, block: B:96:0x01af  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b6  */
    @Override // androidx.recyclerview.widget.AbstractC1740u1
    @SuppressLint({"UnknownNullness"})
    public void onLayoutChildren(C1668c2 c1668c2, C1701k2 c1701k2) {
        int iM5276b;
        View focusedChild;
        boolean z4;
        boolean z13;
        View viewFindReferenceChild;
        int iMo5181e;
        int iMo5178b;
        int iMo5187k;
        int iMo5183g;
        boolean z14;
        boolean z15;
        C1744v1 c1744v1;
        int i13;
        int iMo5181e2;
        int i14;
        int i15;
        int i16;
        int i17;
        int iM5113g;
        int i18;
        View viewFindViewByPosition;
        int iMo5181e3;
        int iMo5183g2;
        int i19;
        int i24 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && c1701k2.m5276b() == 0) {
            removeAndRecycleAllViews(c1668c2);
            return;
        }
        C1747w0 c1747w0 = this.mPendingSavedState;
        if (c1747w0 != null && (i19 = c1747w0.f6909w) >= 0) {
            this.mPendingScrollPosition = i19;
        }
        ensureLayoutState();
        this.mLayoutState.f6871a = false;
        m5120n();
        View focusedChild2 = getFocusedChild();
        C1731s0 c1731s0 = this.mAnchorInfo;
        if (!c1731s0.f6847e || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            c1731s0.m5324d();
            C1731s0 c1731s1 = this.mAnchorInfo;
            c1731s1.f6846d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            if (c1701k2.f6727g || (i13 = this.mPendingScrollPosition) == -1) {
                if (getChildCount() != 0) {
                    focusedChild = getFocusedChild();
                    if (focusedChild != null) {
                        c1744v1 = (C1744v1) focusedChild.getLayoutParams();
                        if (!c1744v1.f6891a.isRemoved() || c1744v1.f6891a.getLayoutPosition() < 0 || c1744v1.f6891a.getLayoutPosition() >= c1701k2.m5276b()) {
                            z4 = this.mLastStackFromEnd;
                            z13 = this.mStackFromEnd;
                            if (z4 == z13 || (viewFindReferenceChild = findReferenceChild(c1668c2, c1701k2, c1731s1.f6846d, z13)) == null) {
                                c1731s1.m5321a();
                                if (this.mStackFromEnd) {
                                    iM5276b = c1701k2.m5276b() - 1;
                                } else {
                                    iM5276b = 0;
                                }
                                c1731s1.f6844b = iM5276b;
                            } else {
                                c1731s1.m5322b(viewFindReferenceChild, getPosition(viewFindReferenceChild));
                                if (!c1701k2.f6727g && supportsPredictiveItemAnimations()) {
                                    iMo5181e = this.mOrientationHelper.mo5181e(viewFindReferenceChild);
                                    iMo5178b = this.mOrientationHelper.mo5178b(viewFindReferenceChild);
                                    iMo5187k = this.mOrientationHelper.mo5187k();
                                    iMo5183g = this.mOrientationHelper.mo5183g();
                                    if (iMo5178b <= iMo5187k || iMo5181e >= iMo5187k) {
                                        z14 = false;
                                    } else {
                                        z14 = true;
                                    }
                                    if (iMo5181e >= iMo5183g || iMo5178b <= iMo5183g) {
                                        z15 = false;
                                    } else {
                                        z15 = true;
                                    }
                                    if (z14 || z15) {
                                        if (c1731s1.f6846d) {
                                            iMo5187k = iMo5183g;
                                        }
                                        c1731s1.f6845c = iMo5187k;
                                    }
                                }
                            }
                        } else {
                            c1731s1.m5323c(focusedChild, getPosition(focusedChild));
                        }
                    } else {
                        z4 = this.mLastStackFromEnd;
                        z13 = this.mStackFromEnd;
                        if (z4 == z13) {
                            c1731s1.m5321a();
                            if (this.mStackFromEnd) {
                                iM5276b = c1701k2.m5276b() - 1;
                            } else {
                                iM5276b = 0;
                            }
                            c1731s1.f6844b = iM5276b;
                        } else {
                            c1731s1.m5322b(viewFindReferenceChild, getPosition(viewFindReferenceChild));
                            if (!c1701k2.f6727g) {
                                iMo5181e = this.mOrientationHelper.mo5181e(viewFindReferenceChild);
                                iMo5178b = this.mOrientationHelper.mo5178b(viewFindReferenceChild);
                                iMo5187k = this.mOrientationHelper.mo5187k();
                                iMo5183g = this.mOrientationHelper.mo5183g();
                                if (iMo5178b <= iMo5187k) {
                                    z14 = false;
                                } else {
                                    z14 = false;
                                }
                                if (iMo5181e >= iMo5183g) {
                                    z15 = false;
                                } else {
                                    z15 = false;
                                }
                                if (z14) {
                                    if (c1731s1.f6846d) {
                                        iMo5187k = iMo5183g;
                                    }
                                    c1731s1.f6845c = iMo5187k;
                                } else {
                                    if (c1731s1.f6846d) {
                                        iMo5187k = iMo5183g;
                                    }
                                    c1731s1.f6845c = iMo5187k;
                                }
                            }
                        }
                    }
                } else {
                    c1731s1.m5321a();
                    if (this.mStackFromEnd) {
                        iM5276b = c1701k2.m5276b() - 1;
                    } else {
                        iM5276b = 0;
                    }
                    c1731s1.f6844b = iM5276b;
                }
            } else if (i13 < 0 || i13 >= c1701k2.m5276b()) {
                this.mPendingScrollPosition = -1;
                this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
                if (getChildCount() != 0) {
                    focusedChild = getFocusedChild();
                    if (focusedChild != null) {
                        c1744v1 = (C1744v1) focusedChild.getLayoutParams();
                        if (c1744v1.f6891a.isRemoved()) {
                            z4 = this.mLastStackFromEnd;
                            z13 = this.mStackFromEnd;
                            if (z4 == z13) {
                                c1731s1.m5321a();
                                if (this.mStackFromEnd) {
                                    iM5276b = c1701k2.m5276b() - 1;
                                } else {
                                    iM5276b = 0;
                                }
                                c1731s1.f6844b = iM5276b;
                            } else {
                                c1731s1.m5322b(viewFindReferenceChild, getPosition(viewFindReferenceChild));
                                if (!c1701k2.f6727g) {
                                    iMo5181e = this.mOrientationHelper.mo5181e(viewFindReferenceChild);
                                    iMo5178b = this.mOrientationHelper.mo5178b(viewFindReferenceChild);
                                    iMo5187k = this.mOrientationHelper.mo5187k();
                                    iMo5183g = this.mOrientationHelper.mo5183g();
                                    if (iMo5178b <= iMo5187k) {
                                        z14 = false;
                                    } else {
                                        z14 = false;
                                    }
                                    if (iMo5181e >= iMo5183g) {
                                        z15 = false;
                                    } else {
                                        z15 = false;
                                    }
                                    if (z14) {
                                        if (c1731s1.f6846d) {
                                            iMo5187k = iMo5183g;
                                        }
                                        c1731s1.f6845c = iMo5187k;
                                    } else {
                                        if (c1731s1.f6846d) {
                                            iMo5187k = iMo5183g;
                                        }
                                        c1731s1.f6845c = iMo5187k;
                                    }
                                }
                            }
                        } else {
                            z4 = this.mLastStackFromEnd;
                            z13 = this.mStackFromEnd;
                            if (z4 == z13) {
                                c1731s1.m5321a();
                                if (this.mStackFromEnd) {
                                    iM5276b = c1701k2.m5276b() - 1;
                                } else {
                                    iM5276b = 0;
                                }
                                c1731s1.f6844b = iM5276b;
                            } else {
                                c1731s1.m5322b(viewFindReferenceChild, getPosition(viewFindReferenceChild));
                                if (!c1701k2.f6727g) {
                                    iMo5181e = this.mOrientationHelper.mo5181e(viewFindReferenceChild);
                                    iMo5178b = this.mOrientationHelper.mo5178b(viewFindReferenceChild);
                                    iMo5187k = this.mOrientationHelper.mo5187k();
                                    iMo5183g = this.mOrientationHelper.mo5183g();
                                    if (iMo5178b <= iMo5187k) {
                                        z14 = false;
                                    } else {
                                        z14 = false;
                                    }
                                    if (iMo5181e >= iMo5183g) {
                                        z15 = false;
                                    } else {
                                        z15 = false;
                                    }
                                    if (z14) {
                                        if (c1731s1.f6846d) {
                                            iMo5187k = iMo5183g;
                                        }
                                        c1731s1.f6845c = iMo5187k;
                                    } else {
                                        if (c1731s1.f6846d) {
                                            iMo5187k = iMo5183g;
                                        }
                                        c1731s1.f6845c = iMo5187k;
                                    }
                                }
                            }
                        }
                    } else {
                        z4 = this.mLastStackFromEnd;
                        z13 = this.mStackFromEnd;
                        if (z4 == z13) {
                            c1731s1.m5321a();
                            if (this.mStackFromEnd) {
                                iM5276b = c1701k2.m5276b() - 1;
                            } else {
                                iM5276b = 0;
                            }
                            c1731s1.f6844b = iM5276b;
                        } else {
                            c1731s1.m5322b(viewFindReferenceChild, getPosition(viewFindReferenceChild));
                            if (!c1701k2.f6727g) {
                                iMo5181e = this.mOrientationHelper.mo5181e(viewFindReferenceChild);
                                iMo5178b = this.mOrientationHelper.mo5178b(viewFindReferenceChild);
                                iMo5187k = this.mOrientationHelper.mo5187k();
                                iMo5183g = this.mOrientationHelper.mo5183g();
                                if (iMo5178b <= iMo5187k) {
                                    z14 = false;
                                } else {
                                    z14 = false;
                                }
                                if (iMo5181e >= iMo5183g) {
                                    z15 = false;
                                } else {
                                    z15 = false;
                                }
                                if (z14) {
                                    if (c1731s1.f6846d) {
                                        iMo5187k = iMo5183g;
                                    }
                                    c1731s1.f6845c = iMo5187k;
                                } else {
                                    if (c1731s1.f6846d) {
                                        iMo5187k = iMo5183g;
                                    }
                                    c1731s1.f6845c = iMo5187k;
                                }
                            }
                        }
                    }
                } else {
                    c1731s1.m5321a();
                    if (this.mStackFromEnd) {
                        iM5276b = c1701k2.m5276b() - 1;
                    } else {
                        iM5276b = 0;
                    }
                    c1731s1.f6844b = iM5276b;
                }
            } else {
                int i25 = this.mPendingScrollPosition;
                c1731s1.f6844b = i25;
                C1747w0 c1747w1 = this.mPendingSavedState;
                if (c1747w1 != null && c1747w1.f6909w >= 0) {
                    boolean z16 = c1747w1.f6911y;
                    c1731s1.f6846d = z16;
                    if (z16) {
                        c1731s1.f6845c = this.mOrientationHelper.mo5183g() - this.mPendingSavedState.f6910x;
                    } else {
                        c1731s1.f6845c = this.mOrientationHelper.mo5187k() + this.mPendingSavedState.f6910x;
                    }
                } else if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                    View viewFindViewByPosition2 = findViewByPosition(i25);
                    if (viewFindViewByPosition2 == null) {
                        if (getChildCount() > 0) {
                            c1731s1.f6846d = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                        }
                        c1731s1.m5321a();
                    } else if (this.mOrientationHelper.mo5179c(viewFindViewByPosition2) > this.mOrientationHelper.mo5188l()) {
                        c1731s1.m5321a();
                    } else if (this.mOrientationHelper.mo5181e(viewFindViewByPosition2) - this.mOrientationHelper.mo5187k() < 0) {
                        c1731s1.f6845c = this.mOrientationHelper.mo5187k();
                        c1731s1.f6846d = false;
                    } else if (this.mOrientationHelper.mo5183g() - this.mOrientationHelper.mo5178b(viewFindViewByPosition2) < 0) {
                        c1731s1.f6845c = this.mOrientationHelper.mo5183g();
                        c1731s1.f6846d = true;
                    } else {
                        if (c1731s1.f6846d) {
                            int iMo5178b2 = this.mOrientationHelper.mo5178b(viewFindViewByPosition2);
                            AbstractC1667c1 abstractC1667c1 = this.mOrientationHelper;
                            iMo5181e2 = (Integer.MIN_VALUE == abstractC1667c1.f6589b ? 0 : abstractC1667c1.mo5188l() - abstractC1667c1.f6589b) + iMo5178b2;
                        } else {
                            iMo5181e2 = this.mOrientationHelper.mo5181e(viewFindViewByPosition2);
                        }
                        c1731s1.f6845c = iMo5181e2;
                    }
                } else {
                    boolean z17 = this.mShouldReverseLayout;
                    c1731s1.f6846d = z17;
                    if (z17) {
                        c1731s1.f6845c = this.mOrientationHelper.mo5183g() - this.mPendingScrollPositionOffset;
                    } else {
                        c1731s1.f6845c = this.mOrientationHelper.mo5187k() + this.mPendingScrollPositionOffset;
                    }
                }
            }
            this.mAnchorInfo.f6847e = true;
        } else if (focusedChild2 != null && (this.mOrientationHelper.mo5181e(focusedChild2) >= this.mOrientationHelper.mo5183g() || this.mOrientationHelper.mo5178b(focusedChild2) <= this.mOrientationHelper.mo5187k())) {
            this.mAnchorInfo.m5323c(focusedChild2, getPosition(focusedChild2));
        }
        C1739u0 c1739u0 = this.mLayoutState;
        c1739u0.f6876f = c1739u0.f6880j >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c1701k2, iArr);
        int iMo5187k2 = this.mOrientationHelper.mo5187k() + Math.max(0, this.mReusableIntPair[0]);
        int iMo5184h = this.mOrientationHelper.mo5184h() + Math.max(0, this.mReusableIntPair[1]);
        if (c1701k2.f6727g && (i18 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (viewFindViewByPosition = findViewByPosition(i18)) != null) {
            if (this.mShouldReverseLayout) {
                iMo5183g2 = this.mOrientationHelper.mo5183g() - this.mOrientationHelper.mo5178b(viewFindViewByPosition);
                iMo5181e3 = this.mPendingScrollPositionOffset;
            } else {
                iMo5181e3 = this.mOrientationHelper.mo5181e(viewFindViewByPosition) - this.mOrientationHelper.mo5187k();
                iMo5183g2 = this.mPendingScrollPositionOffset;
            }
            int i26 = iMo5183g2 - iMo5181e3;
            if (i26 > 0) {
                iMo5187k2 += i26;
            } else {
                iMo5184h -= i26;
            }
        }
        C1731s0 c1731s2 = this.mAnchorInfo;
        if (!c1731s2.f6846d ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i24 = 1;
        }
        onAnchorReady(c1668c2, c1701k2, c1731s2, i24);
        detachAndScrapAttachedViews(c1668c2);
        this.mLayoutState.f6882l = resolveIsInfinite();
        this.mLayoutState.getClass();
        this.mLayoutState.f6879i = 0;
        C1731s0 c1731s3 = this.mAnchorInfo;
        if (c1731s3.f6846d) {
            m5123q(c1731s3.f6844b, c1731s3.f6845c);
            C1739u0 c1739u1 = this.mLayoutState;
            c1739u1.f6878h = iMo5187k2;
            fill(c1668c2, c1739u1, c1701k2, false);
            C1739u0 c1739u2 = this.mLayoutState;
            i15 = c1739u2.f6872b;
            int i27 = c1739u2.f6874d;
            int i28 = c1739u2.f6873c;
            if (i28 > 0) {
                iMo5184h += i28;
            }
            C1731s0 c1731s4 = this.mAnchorInfo;
            m5122p(c1731s4.f6844b, c1731s4.f6845c);
            C1739u0 c1739u3 = this.mLayoutState;
            c1739u3.f6878h = iMo5184h;
            c1739u3.f6874d += c1739u3.f6875e;
            fill(c1668c2, c1739u3, c1701k2, false);
            C1739u0 c1739u4 = this.mLayoutState;
            i14 = c1739u4.f6872b;
            int i29 = c1739u4.f6873c;
            if (i29 > 0) {
                m5123q(i27, i15);
                C1739u0 c1739u5 = this.mLayoutState;
                c1739u5.f6878h = i29;
                fill(c1668c2, c1739u5, c1701k2, false);
                i15 = this.mLayoutState.f6872b;
            }
        } else {
            m5122p(c1731s3.f6844b, c1731s3.f6845c);
            C1739u0 c1739u6 = this.mLayoutState;
            c1739u6.f6878h = iMo5184h;
            fill(c1668c2, c1739u6, c1701k2, false);
            C1739u0 c1739u7 = this.mLayoutState;
            i14 = c1739u7.f6872b;
            int i34 = c1739u7.f6874d;
            int i35 = c1739u7.f6873c;
            if (i35 > 0) {
                iMo5187k2 += i35;
            }
            C1731s0 c1731s5 = this.mAnchorInfo;
            m5123q(c1731s5.f6844b, c1731s5.f6845c);
            C1739u0 c1739u8 = this.mLayoutState;
            c1739u8.f6878h = iMo5187k2;
            c1739u8.f6874d += c1739u8.f6875e;
            fill(c1668c2, c1739u8, c1701k2, false);
            C1739u0 c1739u9 = this.mLayoutState;
            int i36 = c1739u9.f6872b;
            int i37 = c1739u9.f6873c;
            if (i37 > 0) {
                m5122p(i34, i14);
                C1739u0 c1739u10 = this.mLayoutState;
                c1739u10.f6878h = i37;
                fill(c1668c2, c1739u10, c1701k2, false);
                i14 = this.mLayoutState.f6872b;
            }
            i15 = i36;
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int iM5113g2 = m5113g(i14, c1668c2, c1701k2, true);
                i16 = i15 + iM5113g2;
                i17 = i14 + iM5113g2;
                iM5113g = m5114h(i16, c1668c2, c1701k2, false);
            } else {
                int iM5114h = m5114h(i15, c1668c2, c1701k2, true);
                i16 = i15 + iM5114h;
                i17 = i14 + iM5114h;
                iM5113g = m5113g(i17, c1668c2, c1701k2, false);
            }
            i15 = i16 + iM5113g;
            i14 = i17 + iM5113g;
        }
        if (c1701k2.f6731k && getChildCount() != 0 && !c1701k2.f6727g && supportsPredictiveItemAnimations()) {
            List list = c1668c2.f6594d;
            int size = list.size();
            int position = getPosition(getChildAt(0));
            int iMo5179c = 0;
            int iMo5179c2 = 0;
            for (int i38 = 0; i38 < size; i38++) {
                AbstractC1717o2 abstractC1717o2 = (AbstractC1717o2) list.get(i38);
                if (!abstractC1717o2.isRemoved()) {
                    if ((abstractC1717o2.getLayoutPosition() < position) != this.mShouldReverseLayout) {
                        iMo5179c += this.mOrientationHelper.mo5179c(abstractC1717o2.itemView);
                    } else {
                        iMo5179c2 += this.mOrientationHelper.mo5179c(abstractC1717o2.itemView);
                    }
                }
            }
            this.mLayoutState.f6881k = list;
            if (iMo5179c > 0) {
                m5123q(getPosition(m5116j()), i15);
                C1739u0 c1739u11 = this.mLayoutState;
                c1739u11.f6878h = iMo5179c;
                c1739u11.f6873c = 0;
                c1739u11.m5328a(null);
                fill(c1668c2, this.mLayoutState, c1701k2, false);
            }
            if (iMo5179c2 > 0) {
                m5122p(getPosition(m5115i()), i14);
                C1739u0 c1739u12 = this.mLayoutState;
                c1739u12.f6878h = iMo5179c2;
                c1739u12.f6873c = 0;
                c1739u12.m5328a(null);
                fill(c1668c2, this.mLayoutState, c1701k2, false);
            }
            this.mLayoutState.f6881k = null;
        }
        if (c1701k2.f6727g) {
            this.mAnchorInfo.m5324d();
        } else {
            AbstractC1667c1 abstractC1667c2 = this.mOrientationHelper;
            abstractC1667c2.f6589b = abstractC1667c2.mo5188l();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    @SuppressLint({"UnknownNullness"})
    public void onLayoutCompleted(C1701k2 c1701k2) {
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.m5324d();
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    @SuppressLint({"UnknownNullness"})
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof C1747w0) {
            C1747w0 c1747w0 = (C1747w0) parcelable;
            this.mPendingSavedState = c1747w0;
            if (this.mPendingScrollPosition != -1) {
                c1747w0.f6909w = -1;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    @SuppressLint({"UnknownNullness"})
    public Parcelable onSaveInstanceState() {
        C1747w0 c1747w0 = this.mPendingSavedState;
        if (c1747w0 != null) {
            C1747w0 c1747w1 = new C1747w0();
            c1747w1.f6909w = c1747w0.f6909w;
            c1747w1.f6910x = c1747w0.f6910x;
            c1747w1.f6911y = c1747w0.f6911y;
            return c1747w1;
        }
        C1747w0 c1747w2 = new C1747w0();
        if (getChildCount() <= 0) {
            c1747w2.f6909w = -1;
            return c1747w2;
        }
        ensureLayoutState();
        boolean z4 = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
        c1747w2.f6911y = z4;
        if (z4) {
            View viewM5115i = m5115i();
            c1747w2.f6910x = this.mOrientationHelper.mo5183g() - this.mOrientationHelper.mo5178b(viewM5115i);
            c1747w2.f6909w = getPosition(viewM5115i);
            return c1747w2;
        }
        View viewM5116j = m5116j();
        c1747w2.f6909w = getPosition(viewM5116j);
        c1747w2.f6910x = this.mOrientationHelper.mo5181e(viewM5116j) - this.mOrientationHelper.mo5187k();
        return c1747w2;
    }

    /* JADX INFO: renamed from: p */
    public final void m5122p(int i13, int i14) {
        this.mLayoutState.f6873c = this.mOrientationHelper.mo5183g() - i14;
        C1739u0 c1739u0 = this.mLayoutState;
        c1739u0.f6875e = this.mShouldReverseLayout ? -1 : 1;
        c1739u0.f6874d = i13;
        c1739u0.f6876f = 1;
        c1739u0.f6872b = i14;
        c1739u0.f6877g = Integer.MIN_VALUE;
    }

    public void prepareForDrop(View view, View view2, int i13, int i14) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        m5120n();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        byte b = position < position2 ? (byte) 1 : (byte) -1;
        if (this.mShouldReverseLayout) {
            if (b == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.mo5183g() - (this.mOrientationHelper.mo5179c(view) + this.mOrientationHelper.mo5181e(view2)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.mo5183g() - this.mOrientationHelper.mo5178b(view2));
                return;
            }
        }
        if (b == -1) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo5181e(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo5178b(view2) - this.mOrientationHelper.mo5179c(view));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m5123q(int i13, int i14) {
        this.mLayoutState.f6873c = i14 - this.mOrientationHelper.mo5187k();
        C1739u0 c1739u0 = this.mLayoutState;
        c1739u0.f6874d = i13;
        c1739u0.f6875e = this.mShouldReverseLayout ? 1 : -1;
        c1739u0.f6876f = -1;
        c1739u0.f6872b = i14;
        c1739u0.f6877g = Integer.MIN_VALUE;
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.mo5185i() == 0 && this.mOrientationHelper.mo5182f() == 0;
    }

    public int scrollBy(int i13, C1668c2 c1668c2, C1701k2 c1701k2) {
        if (getChildCount() == 0 || i13 == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f6871a = true;
        int i14 = i13 > 0 ? 1 : -1;
        int iAbs = Math.abs(i13);
        m5121o(i14, iAbs, true, c1701k2);
        C1739u0 c1739u0 = this.mLayoutState;
        int iFill = fill(c1668c2, c1739u0, c1701k2, false) + c1739u0.f6877g;
        if (iFill < 0) {
            return 0;
        }
        if (iAbs > iFill) {
            i13 = i14 * iFill;
        }
        this.mOrientationHelper.mo5191o(-i13);
        this.mLayoutState.f6880j = i13;
        return i13;
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    @SuppressLint({"UnknownNullness"})
    public int scrollHorizontallyBy(int i13, C1668c2 c1668c2, C1701k2 c1701k2) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i13, c1668c2, c1701k2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public void scrollToPosition(int i13) {
        this.mPendingScrollPosition = i13;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        C1747w0 c1747w0 = this.mPendingSavedState;
        if (c1747w0 != null) {
            c1747w0.f6909w = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i13, int i14) {
        this.mPendingScrollPosition = i13;
        this.mPendingScrollPositionOffset = i14;
        C1747w0 c1747w0 = this.mPendingSavedState;
        if (c1747w0 != null) {
            c1747w0.f6909w = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    @SuppressLint({"UnknownNullness"})
    public int scrollVerticallyBy(int i13, C1668c2 c1668c2, C1701k2 c1701k2) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i13, c1668c2, c1701k2);
    }

    public void setInitialPrefetchItemCount(int i13) {
        this.mInitialPrefetchItemCount = i13;
    }

    public void setOrientation(int i13) {
        if (i13 != 0 && i13 != 1) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        if (i13 != this.mOrientation || this.mOrientationHelper == null) {
            AbstractC1667c1 abstractC1667c1M5193a = AbstractC1667c1.m5193a(this, i13);
            this.mOrientationHelper = abstractC1667c1M5193a;
            this.mAnchorInfo.f6843a = abstractC1667c1M5193a;
            this.mOrientation = i13;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z4) {
        this.mRecycleChildrenOnDetach = z4;
    }

    public void setReverseLayout(boolean z4) {
        assertNotInLayoutOrScroll(null);
        if (z4 == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z4;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z4) {
        this.mSmoothScrollbarEnabled = z4;
    }

    public void setStackFromEnd(boolean z4) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z4) {
            return;
        }
        this.mStackFromEnd = z4;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    @SuppressLint({"UnknownNullness"})
    public void smoothScrollToPosition(RecyclerView recyclerView, C1701k2 c1701k2, int i13) {
        C1751x0 c1751x0 = new C1751x0(recyclerView.getContext());
        c1751x0.f6707a = i13;
        startSmoothScroll(c1751x0);
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    public void validateChildOrder() {
        Log.d(TAG, "validating child count " + getChildCount());
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int iMo5181e = this.mOrientationHelper.mo5181e(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i13 = 1; i13 < getChildCount(); i13++) {
                View childAt = getChildAt(i13);
                int position2 = getPosition(childAt);
                int iMo5181e2 = this.mOrientationHelper.mo5181e(childAt);
                if (position2 < position) {
                    m5117k();
                    StringBuilder sb4 = new StringBuilder("detected invalid position. loc invalid? ");
                    sb4.append(iMo5181e2 < iMo5181e);
                    throw new RuntimeException(sb4.toString());
                }
                if (iMo5181e2 > iMo5181e) {
                    m5117k();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i14 = 1; i14 < getChildCount(); i14++) {
            View childAt2 = getChildAt(i14);
            int position3 = getPosition(childAt2);
            int iMo5181e3 = this.mOrientationHelper.mo5181e(childAt2);
            if (position3 < position) {
                m5117k();
                StringBuilder sb5 = new StringBuilder("detected invalid position. loc invalid? ");
                sb5.append(iMo5181e3 < iMo5181e);
                throw new RuntimeException(sb5.toString());
            }
            if (iMo5181e3 < iMo5181e) {
                m5117k();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i13, int i14) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C1731s0();
        this.mLayoutChunkResult = new C1735t0();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        C1736t1 properties = AbstractC1740u1.getProperties(context, attributeSet, i13, i14);
        setOrientation(properties.f6866a);
        setReverseLayout(properties.f6868c);
        setStackFromEnd(properties.f6869d);
    }
}
