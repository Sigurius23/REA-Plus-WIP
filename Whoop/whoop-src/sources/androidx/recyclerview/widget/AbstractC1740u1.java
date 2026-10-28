package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.WeakHashMap;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC30802r;
import p002a0.C0021f1;
import p171g9.C15585b;
import p184h5.AbstractC16901p0;
import p211i5.C18093f;
import p248jb.AbstractC21531a;

/* JADX INFO: renamed from: androidx.recyclerview.widget.u1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1740u1 {
    boolean mAutoMeasure;
    C1694j mChildHelper;
    private int mHeight;
    private int mHeightMode;
    C1761z2 mHorizontalBoundCheck;
    private final InterfaceC1757y2 mHorizontalBoundCheckCallback;
    boolean mIsAttachedToWindow;
    private boolean mItemPrefetchEnabled;
    private boolean mMeasurementCacheEnabled;
    int mPrefetchMaxCountObserved;
    boolean mPrefetchMaxObservedInInitialPrefetch;
    RecyclerView mRecyclerView;
    boolean mRequestedSimpleAnimations;
    AbstractC1697j2 mSmoothScroller;
    C1761z2 mVerticalBoundCheck;
    private final InterfaceC1757y2 mVerticalBoundCheckCallback;
    private int mWidth;
    private int mWidthMode;

    public AbstractC1740u1() {
        C1728r1 c1728r1 = new C1728r1(this, 0);
        this.mHorizontalBoundCheckCallback = c1728r1;
        C1728r1 c1728r2 = new C1728r1(this, 1);
        this.mVerticalBoundCheckCallback = c1728r2;
        this.mHorizontalBoundCheck = new C1761z2(c1728r1);
        this.mVerticalBoundCheck = new C1761z2(c1728r2);
        this.mRequestedSimpleAnimations = false;
        this.mIsAttachedToWindow = false;
        this.mAutoMeasure = false;
        this.mMeasurementCacheEnabled = true;
        this.mItemPrefetchEnabled = true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m5330b(int i13, int i14, int i15) {
        int mode = View.MeasureSpec.getMode(i14);
        int size = View.MeasureSpec.getSize(i14);
        if (i15 > 0 && i13 != i15) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i13;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i13;
        }
        return true;
    }

    public static int chooseSize(int i13, int i14, int i15) {
        int mode = View.MeasureSpec.getMode(i13);
        int size = View.MeasureSpec.getSize(i13);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i14, i15) : size;
        }
        return Math.min(size, Math.max(i14, i15));
    }

    /* JADX WARN: Code duplicated, block: B:5:0x000c A[PHI: r3
      0x000c: PHI (r3v5 int) = (r3v0 int), (r3v2 int), (r3v0 int) binds: [B:7:0x0010, B:11:0x0016, B:4:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:6:0x000e  */
    @Deprecated
    public static int getChildMeasureSpec(int i13, int i14, int i15, boolean z4) {
        int i16 = i13 - i14;
        int i17 = 0;
        int iMax = Math.max(0, i16);
        if (z4) {
            if (i15 >= 0) {
                i17 = 1073741824;
            } else {
                i15 = 0;
            }
        } else if (i15 >= 0) {
            i17 = 1073741824;
        } else if (i15 == -1) {
            i15 = iMax;
            i17 = 1073741824;
        } else if (i15 == -2) {
            i17 = Integer.MIN_VALUE;
            i15 = iMax;
        } else {
            i15 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i15, i17);
    }

    public static C1736t1 getProperties(Context context, AttributeSet attributeSet, int i13, int i14) {
        C1736t1 c1736t1 = new C1736t1();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC21531a.f82579a, i13, i14);
        c1736t1.f6866a = typedArrayObtainStyledAttributes.getInt(0, 1);
        c1736t1.f6867b = typedArrayObtainStyledAttributes.getInt(10, 1);
        c1736t1.f6868c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        c1736t1.f6869d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return c1736t1;
    }

    /* JADX INFO: renamed from: a */
    public final void m5331a(View view, int i13, boolean z4) {
        AbstractC1717o2 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (z4 || childViewHolderInt.isRemoved()) {
            C0021f1 c0021f1 = this.mRecyclerView.mViewInfoStore.f6599a;
            C1659a3 c1659a3M5165a = (C1659a3) c0021f1.get(childViewHolderInt);
            if (c1659a3M5165a == null) {
                c1659a3M5165a = C1659a3.m5165a();
                c0021f1.put(childViewHolderInt, c1659a3M5165a);
            }
            c1659a3M5165a.f6569a |= 1;
        } else {
            this.mRecyclerView.mViewInfoStore.m5210c(childViewHolderInt);
        }
        C1744v1 c1744v1 = (C1744v1) view.getLayoutParams();
        if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            this.mChildHelper.m5253b(view, i13, view.getLayoutParams(), false);
        } else if (view.getParent() == this.mRecyclerView) {
            int iM5261j = this.mChildHelper.m5261j(view);
            if (i13 == -1) {
                i13 = this.mChildHelper.m5256e();
            }
            if (iM5261j == -1) {
                StringBuilder sb4 = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                sb4.append(this.mRecyclerView.indexOfChild(view));
                throw new IllegalStateException(AbstractC30802r.m94760i(this.mRecyclerView, sb4));
            }
            if (iM5261j != i13) {
                this.mRecyclerView.mLayout.moveView(iM5261j, i13);
            }
        } else {
            this.mChildHelper.m5252a(view, i13, false);
            c1744v1.f6893c = true;
            AbstractC1697j2 abstractC1697j2 = this.mSmoothScroller;
            if (abstractC1697j2 != null && abstractC1697j2.f6711e && abstractC1697j2.f6708b.getChildLayoutPosition(view) == abstractC1697j2.f6707a) {
                abstractC1697j2.f6712f = view;
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "smooth scroll target view has been attached");
                }
            }
        }
        if (c1744v1.f6894d) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + c1744v1.f6891a);
            }
            childViewHolderInt.itemView.invalidate();
            c1744v1.f6894d = false;
        }
    }

    @SuppressLint({"UnknownNullness"})
    public void addDisappearingView(View view) {
        addDisappearingView(view, -1);
    }

    @SuppressLint({"UnknownNullness"})
    public void addView(View view) {
        addView(view, -1);
    }

    public void assertInLayoutOrScroll(String str) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.assertInLayoutOrScroll(str);
        }
    }

    public void assertNotInLayoutOrScroll(String str) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.assertNotInLayoutOrScroll(str);
        }
    }

    public void attachView(View view, int i13, C1744v1 c1744v1) {
        AbstractC1717o2 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt.isRemoved()) {
            C0021f1 c0021f1 = this.mRecyclerView.mViewInfoStore.f6599a;
            C1659a3 c1659a3M5165a = (C1659a3) c0021f1.get(childViewHolderInt);
            if (c1659a3M5165a == null) {
                c1659a3M5165a = C1659a3.m5165a();
                c0021f1.put(childViewHolderInt, c1659a3M5165a);
            }
            c1659a3M5165a.f6569a |= 1;
        } else {
            this.mRecyclerView.mViewInfoStore.m5210c(childViewHolderInt);
        }
        this.mChildHelper.m5253b(view, i13, c1744v1, childViewHolderInt.isRemoved());
    }

    /* JADX INFO: renamed from: c */
    public final void m5332c(C1668c2 c1668c2, int i13, View view) {
        AbstractC1717o2 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt.shouldIgnore()) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "ignoring view " + childViewHolderInt);
                return;
            }
            return;
        }
        if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
            removeViewAt(i13);
            c1668c2.m5203j(childViewHolderInt);
        } else {
            detachViewAt(i13);
            c1668c2.m5204k(view);
            this.mRecyclerView.mViewInfoStore.m5210c(childViewHolderInt);
        }
    }

    public void calculateItemDecorationsForChild(View view, Rect rect) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.getItemDecorInsetsForChild(view));
        }
    }

    public abstract boolean canScrollHorizontally();

    public abstract boolean canScrollVertically();

    public boolean checkLayoutParams(C1744v1 c1744v1) {
        return c1744v1 != null;
    }

    public void collectAdjacentPrefetchPositions(int i13, int i14, C1701k2 c1701k2, InterfaceC1732s1 interfaceC1732s1) {
    }

    public void collectInitialPrefetchPositions(int i13, InterfaceC1732s1 interfaceC1732s1) {
    }

    public abstract int computeHorizontalScrollExtent(C1701k2 c1701k2);

    public abstract int computeHorizontalScrollOffset(C1701k2 c1701k2);

    public abstract int computeHorizontalScrollRange(C1701k2 c1701k2);

    public abstract int computeVerticalScrollExtent(C1701k2 c1701k2);

    public abstract int computeVerticalScrollOffset(C1701k2 c1701k2);

    public abstract int computeVerticalScrollRange(C1701k2 c1701k2);

    public void detachAndScrapAttachedViews(C1668c2 c1668c2) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m5332c(c1668c2, childCount, getChildAt(childCount));
        }
    }

    public void detachAndScrapView(View view, C1668c2 c1668c2) {
        m5332c(c1668c2, this.mChildHelper.m5261j(view), view);
    }

    public void detachAndScrapViewAt(int i13, C1668c2 c1668c2) {
        m5332c(c1668c2, i13, getChildAt(i13));
    }

    public void detachView(View view) {
        int iM5261j = this.mChildHelper.m5261j(view);
        if (iM5261j >= 0) {
            this.mChildHelper.m5254c(iM5261j);
        }
    }

    public void detachViewAt(int i13) {
        getChildAt(i13);
        this.mChildHelper.m5254c(i13);
    }

    public void dispatchAttachedToWindow(RecyclerView recyclerView) {
        this.mIsAttachedToWindow = true;
        onAttachedToWindow(recyclerView);
    }

    public void dispatchDetachedFromWindow(RecyclerView recyclerView, C1668c2 c1668c2) {
        this.mIsAttachedToWindow = false;
        onDetachedFromWindow(recyclerView, c1668c2);
    }

    @SuppressLint({"UnknownNullness"})
    public void endAnimation(View view) {
        AbstractC1720p1 abstractC1720p1 = this.mRecyclerView.mItemAnimator;
        if (abstractC1720p1 != null) {
            abstractC1720p1.mo5298d(RecyclerView.getChildViewHolderInt(view));
        }
    }

    public View findContainingItemView(View view) {
        View viewFindContainingItemView;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (viewFindContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.f6688c.contains(viewFindContainingItemView)) {
            return null;
        }
        return viewFindContainingItemView;
    }

    public View findViewByPosition(int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            AbstractC1717o2 childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
            if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i13 && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.f6727g || !childViewHolderInt.isRemoved())) {
                return childAt;
            }
        }
        return null;
    }

    public abstract C1744v1 generateDefaultLayoutParams();

    @SuppressLint({"UnknownNullness"})
    public C1744v1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C1744v1) {
            return new C1744v1((C1744v1) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1744v1((ViewGroup.MarginLayoutParams) layoutParams) : new C1744v1(layoutParams);
    }

    public int getBaseline() {
        return -1;
    }

    public int getBottomDecorationHeight(View view) {
        return ((C1744v1) view.getLayoutParams()).f6892b.bottom;
    }

    public View getChildAt(int i13) {
        C1694j c1694j = this.mChildHelper;
        if (c1694j != null) {
            return c1694j.m5255d(i13);
        }
        return null;
    }

    public int getChildCount() {
        C1694j c1694j = this.mChildHelper;
        if (c1694j != null) {
            return c1694j.m5256e();
        }
        return 0;
    }

    public boolean getClipToPadding() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.mClipToPadding;
    }

    public int getColumnCountForAccessibility(C1668c2 c1668c2, C1701k2 c1701k2) {
        return -1;
    }

    public int getDecoratedBottom(View view) {
        return getBottomDecorationHeight(view) + view.getBottom();
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public int getDecoratedLeft(View view) {
        return view.getLeft() - getLeftDecorationWidth(view);
    }

    public int getDecoratedMeasuredHeight(View view) {
        Rect rect = ((C1744v1) view.getLayoutParams()).f6892b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public int getDecoratedMeasuredWidth(View view) {
        Rect rect = ((C1744v1) view.getLayoutParams()).f6892b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public int getDecoratedRight(View view) {
        return getRightDecorationWidth(view) + view.getRight();
    }

    public int getDecoratedTop(View view) {
        return view.getTop() - getTopDecorationHeight(view);
    }

    public View getFocusedChild() {
        View focusedChild;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.f6688c.contains(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getHeightMode() {
        return this.mHeightMode;
    }

    public int getItemCount() {
        RecyclerView recyclerView = this.mRecyclerView;
        AbstractC1692i1 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 0;
    }

    public int getItemViewType(View view) {
        return RecyclerView.getChildViewHolderInt(view).getItemViewType();
    }

    public int getLayoutDirection() {
        RecyclerView recyclerView = this.mRecyclerView;
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        return recyclerView.getLayoutDirection();
    }

    public int getLeftDecorationWidth(View view) {
        return ((C1744v1) view.getLayoutParams()).f6892b.left;
    }

    public int getMinimumHeight() {
        RecyclerView recyclerView = this.mRecyclerView;
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        return recyclerView.getMinimumHeight();
    }

    public int getMinimumWidth() {
        RecyclerView recyclerView = this.mRecyclerView;
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        return recyclerView.getMinimumWidth();
    }

    public int getPaddingBottom() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public int getPaddingEnd() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            return 0;
        }
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        return recyclerView.getPaddingEnd();
    }

    public int getPaddingLeft() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public int getPaddingRight() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public int getPaddingStart() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            return 0;
        }
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        return recyclerView.getPaddingStart();
    }

    public int getPaddingTop() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int getPosition(View view) {
        return ((C1744v1) view.getLayoutParams()).f6891a.getLayoutPosition();
    }

    public int getRightDecorationWidth(View view) {
        return ((C1744v1) view.getLayoutParams()).f6892b.right;
    }

    public int getRowCountForAccessibility(C1668c2 c1668c2, C1701k2 c1701k2) {
        return -1;
    }

    public int getSelectionModeForAccessibility(C1668c2 c1668c2, C1701k2 c1701k2) {
        return 0;
    }

    public int getTopDecorationHeight(View view) {
        return ((C1744v1) view.getLayoutParams()).f6892b.top;
    }

    public void getTransformedBoundingBox(View view, boolean z4, Rect rect) {
        Matrix matrix;
        if (z4) {
            Rect rect2 = ((C1744v1) view.getLayoutParams()).f6892b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        } else {
            rect.set(0, 0, view.getWidth(), view.getHeight());
        }
        if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.mRecyclerView.mTempRectF;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public int getWidth() {
        return this.mWidth;
    }

    public int getWidthMode() {
        return this.mWidthMode;
    }

    public boolean hasFlexibleChildInBothOrientations() {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            ViewGroup.LayoutParams layoutParams = getChildAt(i13).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFocus() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.hasFocus();
    }

    public void ignoreView(View view) {
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = this.mRecyclerView;
        if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
            throw new IllegalArgumentException(AbstractC30802r.m94760i(this.mRecyclerView, new StringBuilder("View should be fully attached to be ignored")));
        }
        AbstractC1717o2 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        childViewHolderInt.addFlags(128);
        this.mRecyclerView.mViewInfoStore.m5211d(childViewHolderInt);
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttachedToWindow;
    }

    public abstract boolean isAutoMeasureEnabled();

    public boolean isFocused() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.isFocused();
    }

    public final boolean isItemPrefetchEnabled() {
        return this.mItemPrefetchEnabled;
    }

    public boolean isLayoutHierarchical(C1668c2 c1668c2, C1701k2 c1701k2) {
        return false;
    }

    public boolean isMeasurementCacheEnabled() {
        return this.mMeasurementCacheEnabled;
    }

    public boolean isSmoothScrolling() {
        AbstractC1697j2 abstractC1697j2 = this.mSmoothScroller;
        return abstractC1697j2 != null && abstractC1697j2.f6711e;
    }

    public boolean isViewPartiallyVisible(View view, boolean z4, boolean z13) {
        boolean z14 = this.mHorizontalBoundCheck.m5351b(view) && this.mVerticalBoundCheck.m5351b(view);
        return z4 ? z14 : !z14;
    }

    public void layoutDecorated(View view, int i13, int i14, int i15, int i16) {
        Rect rect = ((C1744v1) view.getLayoutParams()).f6892b;
        view.layout(i13 + rect.left, i14 + rect.top, i15 - rect.right, i16 - rect.bottom);
    }

    public void layoutDecoratedWithMargins(View view, int i13, int i14, int i15, int i16) {
        C1744v1 c1744v1 = (C1744v1) view.getLayoutParams();
        Rect rect = c1744v1.f6892b;
        view.layout(i13 + rect.left + ((ViewGroup.MarginLayoutParams) c1744v1).leftMargin, i14 + rect.top + ((ViewGroup.MarginLayoutParams) c1744v1).topMargin, (i15 - rect.right) - ((ViewGroup.MarginLayoutParams) c1744v1).rightMargin, (i16 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c1744v1).bottomMargin);
    }

    public void measureChild(View view, int i13, int i14) {
        C1744v1 c1744v1 = (C1744v1) view.getLayoutParams();
        Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
        int i15 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i13;
        int i16 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i14;
        int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + i15, ((ViewGroup.MarginLayoutParams) c1744v1).width, canScrollHorizontally());
        int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + i16, ((ViewGroup.MarginLayoutParams) c1744v1).height, canScrollVertically());
        if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, c1744v1)) {
            view.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    public void measureChildWithMargins(View view, int i13, int i14) {
        C1744v1 c1744v1 = (C1744v1) view.getLayoutParams();
        Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
        int i15 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i13;
        int i16 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i14;
        int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1744v1).leftMargin + ((ViewGroup.MarginLayoutParams) c1744v1).rightMargin + i15, ((ViewGroup.MarginLayoutParams) c1744v1).width, canScrollHorizontally());
        int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1744v1).topMargin + ((ViewGroup.MarginLayoutParams) c1744v1).bottomMargin + i16, ((ViewGroup.MarginLayoutParams) c1744v1).height, canScrollVertically());
        if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, c1744v1)) {
            view.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    public void moveView(int i13, int i14) {
        View childAt = getChildAt(i13);
        if (childAt != null) {
            detachViewAt(i13);
            attachView(childAt, i14);
        } else {
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i13 + this.mRecyclerView.toString());
        }
    }

    public void offsetChildrenHorizontal(int i13) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.offsetChildrenHorizontal(i13);
        }
    }

    public void offsetChildrenVertical(int i13) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.offsetChildrenVertical(i13);
        }
    }

    public void onAdapterChanged(AbstractC1692i1 abstractC1692i1, AbstractC1692i1 abstractC1692i2) {
    }

    public boolean onAddFocusables(RecyclerView recyclerView, ArrayList<View> arrayList, int i13, int i14) {
        return false;
    }

    public void onAttachedToWindow(RecyclerView recyclerView) {
    }

    @Deprecated
    public void onDetachedFromWindow(RecyclerView recyclerView) {
    }

    public abstract void onDetachedFromWindow(RecyclerView recyclerView, C1668c2 c1668c2);

    public abstract View onFocusSearchFailed(View view, int i13, C1668c2 c1668c2, C1701k2 c1701k2);

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(C18093f c18093f) {
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, c18093f);
    }

    public void onInitializeAccessibilityNodeInfoForItem(View view, C18093f c18093f) {
        AbstractC1717o2 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt == null || childViewHolderInt.isRemoved()) {
            return;
        }
        C1694j c1694j = this.mChildHelper;
        if (c1694j.f6688c.contains(childViewHolderInt.itemView)) {
            return;
        }
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, c18093f);
    }

    public View onInterceptFocusSearch(View view, int i13) {
        return null;
    }

    public void onItemsAdded(RecyclerView recyclerView, int i13, int i14) {
    }

    public void onItemsChanged(RecyclerView recyclerView) {
    }

    public void onItemsMoved(RecyclerView recyclerView, int i13, int i14, int i15) {
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i13, int i14) {
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i13, int i14) {
    }

    public abstract void onLayoutChildren(C1668c2 c1668c2, C1701k2 c1701k2);

    public abstract void onLayoutCompleted(C1701k2 c1701k2);

    public void onMeasure(C1668c2 c1668c2, C1701k2 c1701k2, int i13, int i14) {
        this.mRecyclerView.defaultOnMeasure(i13, i14);
    }

    @Deprecated
    public boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
        return isSmoothScrolling() || recyclerView.isComputingLayout();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    public Parcelable onSaveInstanceState() {
        return null;
    }

    public void onScrollStateChanged(int i13) {
    }

    public void onSmoothScrollerStopped(AbstractC1697j2 abstractC1697j2) {
        if (this.mSmoothScroller == abstractC1697j2) {
            this.mSmoothScroller = null;
        }
    }

    public boolean performAccessibilityAction(int i13, Bundle bundle) {
        RecyclerView recyclerView = this.mRecyclerView;
        return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i13, bundle);
    }

    public boolean performAccessibilityActionForItem(C1668c2 c1668c2, C1701k2 c1701k2, View view, int i13, Bundle bundle) {
        return false;
    }

    public void postOnAnimation(Runnable runnable) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            recyclerView.postOnAnimation(runnable);
        }
    }

    public void removeAllViews() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            this.mChildHelper.m5262k(childCount);
        }
    }

    public void removeAndRecycleAllViews(C1668c2 c1668c2) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                removeAndRecycleViewAt(childCount, c1668c2);
            }
        }
    }

    public void removeAndRecycleScrapInt(C1668c2 c1668c2) {
        ArrayList arrayList = c1668c2.f6591a;
        int size = arrayList.size();
        for (int i13 = size - 1; i13 >= 0; i13--) {
            View view = ((AbstractC1717o2) arrayList.get(i13)).itemView;
            AbstractC1717o2 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.setIsRecyclable(false);
                if (childViewHolderInt.isTmpDetached()) {
                    this.mRecyclerView.removeDetachedView(view, false);
                }
                AbstractC1720p1 abstractC1720p1 = this.mRecyclerView.mItemAnimator;
                if (abstractC1720p1 != null) {
                    abstractC1720p1.mo5298d(childViewHolderInt);
                }
                childViewHolderInt.setIsRecyclable(true);
                AbstractC1717o2 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                childViewHolderInt2.mScrapContainer = null;
                childViewHolderInt2.mInChangeScrap = false;
                childViewHolderInt2.clearReturnedFromScrapFlag();
                c1668c2.m5203j(childViewHolderInt2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = c1668c2.f6592b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.mRecyclerView.invalidate();
        }
    }

    public void removeAndRecycleView(View view, C1668c2 c1668c2) {
        removeView(view);
        c1668c2.m5202i(view);
    }

    public void removeAndRecycleViewAt(int i13, C1668c2 c1668c2) {
        View childAt = getChildAt(i13);
        removeViewAt(i13);
        c1668c2.m5202i(childAt);
    }

    public boolean removeCallbacks(Runnable runnable) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.removeCallbacks(runnable);
        }
        return false;
    }

    public void removeDetachedView(View view) {
        this.mRecyclerView.removeDetachedView(view, false);
    }

    @SuppressLint({"UnknownNullness"})
    public void removeView(View view) {
        C1694j c1694j = this.mChildHelper;
        C1684g1 c1684g1 = c1694j.f6686a;
        int i13 = c1694j.f6689d;
        if (i13 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i13 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            c1694j.f6689d = 1;
            c1694j.f6690e = view;
            int iIndexOfChild = c1684g1.f6659a.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (c1694j.f6687b.m3087L(iIndexOfChild)) {
                    c1694j.m5263l(view);
                }
                c1684g1.m5247c(iIndexOfChild);
            }
        } finally {
            c1694j.f6689d = 0;
            c1694j.f6690e = null;
        }
    }

    public void removeViewAt(int i13) {
        if (getChildAt(i13) != null) {
            this.mChildHelper.m5262k(i13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00be  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c2  */
    public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z4, boolean z13) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i13 = left - paddingLeft;
        int iMin = Math.min(0, i13);
        int i14 = top - paddingTop;
        int iMin2 = Math.min(0, i14);
        int i15 = iWidth - width;
        int iMax = Math.max(0, i15);
        int iMax2 = Math.max(0, iHeight - height);
        if (getLayoutDirection() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i13, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i15);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i14, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i16 = iArr[0];
        int i17 = iArr[1];
        if (z13) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int paddingLeft2 = getPaddingLeft();
                int paddingTop2 = getPaddingTop();
                int width2 = getWidth() - getPaddingRight();
                int height2 = getHeight() - getPaddingBottom();
                Rect rect2 = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(focusedChild, rect2);
                if (rect2.left - i16 < width2 && rect2.right - i16 > paddingLeft2 && rect2.top - i17 < height2 && rect2.bottom - i17 > paddingTop2) {
                    if (i16 == 0) {
                    }
                    if (z4) {
                        recyclerView.scrollBy(i16, i17);
                    } else {
                        recyclerView.smoothScrollBy(i16, i17, null);
                    }
                    return true;
                }
            }
        } else if (i16 == 0 || i17 != 0) {
            if (z4) {
                recyclerView.scrollBy(i16, i17);
            } else {
                recyclerView.smoothScrollBy(i16, i17, null);
            }
            return true;
        }
        return false;
    }

    public void requestLayout() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public void requestSimpleAnimationsInNextLayout() {
        this.mRequestedSimpleAnimations = true;
    }

    public abstract int scrollHorizontallyBy(int i13, C1668c2 c1668c2, C1701k2 c1701k2);

    public abstract void scrollToPosition(int i13);

    public abstract int scrollVerticallyBy(int i13, C1668c2 c1668c2, C1701k2 c1701k2);

    @Deprecated
    public void setAutoMeasureEnabled(boolean z4) {
        this.mAutoMeasure = z4;
    }

    public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
        setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void setItemPrefetchEnabled(boolean z4) {
        if (z4 != this.mItemPrefetchEnabled) {
            this.mItemPrefetchEnabled = z4;
            this.mPrefetchMaxCountObserved = 0;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.mRecycler.m5207n();
            }
        }
    }

    public void setMeasureSpecs(int i13, int i14) {
        this.mWidth = View.MeasureSpec.getSize(i13);
        int mode = View.MeasureSpec.getMode(i13);
        this.mWidthMode = mode;
        if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            this.mWidth = 0;
        }
        this.mHeight = View.MeasureSpec.getSize(i14);
        int mode2 = View.MeasureSpec.getMode(i14);
        this.mHeightMode = mode2;
        if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            return;
        }
        this.mHeight = 0;
    }

    public void setMeasuredDimension(Rect rect, int i13, int i14) {
        setMeasuredDimension(chooseSize(i13, getPaddingRight() + getPaddingLeft() + rect.width(), getMinimumWidth()), chooseSize(i14, getPaddingBottom() + getPaddingTop() + rect.height(), getMinimumHeight()));
    }

    public void setMeasuredDimensionFromChildren(int i13, int i14) {
        int childCount = getChildCount();
        if (childCount == 0) {
            this.mRecyclerView.defaultOnMeasure(i13, i14);
            return;
        }
        int i15 = Integer.MIN_VALUE;
        int i16 = Integer.MAX_VALUE;
        int i17 = Integer.MIN_VALUE;
        int i18 = Integer.MAX_VALUE;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(childAt, rect);
            int i24 = rect.left;
            if (i24 < i18) {
                i18 = i24;
            }
            int i25 = rect.right;
            if (i25 > i15) {
                i15 = i25;
            }
            int i26 = rect.top;
            if (i26 < i16) {
                i16 = i26;
            }
            int i27 = rect.bottom;
            if (i27 > i17) {
                i17 = i27;
            }
        }
        this.mRecyclerView.mTempRect.set(i18, i16, i15, i17);
        setMeasuredDimension(this.mRecyclerView.mTempRect, i13, i14);
    }

    public void setMeasurementCacheEnabled(boolean z4) {
        this.mMeasurementCacheEnabled = z4;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.mRecyclerView = null;
            this.mChildHelper = null;
            this.mWidth = 0;
            this.mHeight = 0;
        } else {
            this.mRecyclerView = recyclerView;
            this.mChildHelper = recyclerView.mChildHelper;
            this.mWidth = recyclerView.getWidth();
            this.mHeight = recyclerView.getHeight();
        }
        this.mWidthMode = 1073741824;
        this.mHeightMode = 1073741824;
    }

    public boolean shouldMeasureChild(View view, int i13, int i14, C1744v1 c1744v1) {
        return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && m5330b(view.getWidth(), i13, ((ViewGroup.MarginLayoutParams) c1744v1).width) && m5330b(view.getHeight(), i14, ((ViewGroup.MarginLayoutParams) c1744v1).height)) ? false : true;
    }

    public boolean shouldMeasureTwice() {
        return false;
    }

    public boolean shouldReMeasureChild(View view, int i13, int i14, C1744v1 c1744v1) {
        return (this.mMeasurementCacheEnabled && m5330b(view.getMeasuredWidth(), i13, ((ViewGroup.MarginLayoutParams) c1744v1).width) && m5330b(view.getMeasuredHeight(), i14, ((ViewGroup.MarginLayoutParams) c1744v1).height)) ? false : true;
    }

    public abstract void smoothScrollToPosition(RecyclerView recyclerView, C1701k2 c1701k2, int i13);

    @SuppressLint({"UnknownNullness"})
    public void startSmoothScroll(AbstractC1697j2 abstractC1697j2) {
        AbstractC1697j2 abstractC1697j3 = this.mSmoothScroller;
        if (abstractC1697j3 != null && abstractC1697j2 != abstractC1697j3 && abstractC1697j3.f6711e) {
            abstractC1697j3.m5274d();
        }
        this.mSmoothScroller = abstractC1697j2;
        RecyclerView recyclerView = this.mRecyclerView;
        abstractC1697j2.getClass();
        RunnableC1713n2 runnableC1713n2 = recyclerView.mViewFlinger;
        runnableC1713n2.f6756G.removeCallbacks(runnableC1713n2);
        runnableC1713n2.f6759y.abortAnimation();
        if (abstractC1697j2.f6714h) {
            Log.w("RecyclerView", "An instance of " + abstractC1697j2.getClass().getSimpleName() + " was started more than once. Each instance of" + abstractC1697j2.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        abstractC1697j2.f6708b = recyclerView;
        abstractC1697j2.f6709c = this;
        int i13 = abstractC1697j2.f6707a;
        if (i13 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.mState.f6721a = i13;
        abstractC1697j2.f6711e = true;
        abstractC1697j2.f6710d = true;
        abstractC1697j2.f6712f = recyclerView.mLayout.findViewByPosition(i13);
        abstractC1697j2.f6708b.mViewFlinger.m5278b();
        abstractC1697j2.f6714h = true;
    }

    public void stopIgnoringView(View view) {
        AbstractC1717o2 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        childViewHolderInt.stopIgnoring();
        childViewHolderInt.resetInternal();
        childViewHolderInt.addFlags(4);
    }

    public void stopSmoothScroller() {
        AbstractC1697j2 abstractC1697j2 = this.mSmoothScroller;
        if (abstractC1697j2 != null) {
            abstractC1697j2.m5274d();
        }
    }

    public boolean supportsPredictiveItemAnimations() {
        return false;
    }

    @SuppressLint({"UnknownNullness"})
    public void addDisappearingView(View view, int i13) {
        m5331a(view, i13, true);
    }

    @SuppressLint({"UnknownNullness"})
    public void addView(View view, int i13) {
        m5331a(view, i13, false);
    }

    public void onInitializeAccessibilityEvent(C1668c2 c1668c2, C1701k2 c1701k2, AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z4 = true;
        if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
            z4 = false;
        }
        accessibilityEvent.setScrollable(z4);
        AbstractC1692i1 abstractC1692i1 = this.mRecyclerView.mAdapter;
        if (abstractC1692i1 != null) {
            accessibilityEvent.setItemCount(abstractC1692i1.getItemCount());
        }
    }

    public void onInitializeAccessibilityNodeInfo(C1668c2 c1668c2, C1701k2 c1701k2, C18093f c18093f) {
        if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
            c18093f.m51947a(DfuBaseService.ERROR_REMOTE_MASK);
            c18093f.m51956k(true);
        }
        if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
            c18093f.m51947a(4096);
            c18093f.m51956k(true);
        }
        c18093f.m51954i(C15585b.m43881c(getRowCountForAccessibility(c1668c2, c1701k2), getColumnCountForAccessibility(c1668c2, c1701k2), getSelectionModeForAccessibility(c1668c2, c1701k2), isLayoutHierarchical(c1668c2, c1701k2)));
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i13, int i14, Object obj) {
        onItemsUpdated(recyclerView, i13, i14);
    }

    public boolean onRequestChildFocus(RecyclerView recyclerView, C1701k2 c1701k2, View view, View view2) {
        return onRequestChildFocus(recyclerView, view, view2);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0067 A[PHI: r9
      0x0067: PHI (r9v8 int) = (r9v5 int), (r9v11 int) binds: [B:29:0x0084, B:20:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    public boolean performAccessibilityAction(C1668c2 c1668c2, C1701k2 c1701k2, int i13, Bundle bundle) {
        int paddingTop;
        int paddingLeft;
        int i14;
        int i15;
        if (this.mRecyclerView == null) {
            return false;
        }
        int height = getHeight();
        int width = getWidth();
        Rect rect = new Rect();
        if (this.mRecyclerView.getMatrix().isIdentity() && this.mRecyclerView.getGlobalVisibleRect(rect)) {
            height = rect.height();
            width = rect.width();
        }
        if (i13 == 4096) {
            paddingTop = this.mRecyclerView.canScrollVertically(1) ? (height - getPaddingTop()) - getPaddingBottom() : 0;
            if (this.mRecyclerView.canScrollHorizontally(1)) {
                paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
                i14 = paddingTop;
                i15 = paddingLeft;
            } else {
                i14 = paddingTop;
                i15 = 0;
            }
        } else if (i13 != 8192) {
            i15 = 0;
            i14 = 0;
        } else {
            paddingTop = this.mRecyclerView.canScrollVertically(-1) ? -((height - getPaddingTop()) - getPaddingBottom()) : 0;
            if (this.mRecyclerView.canScrollHorizontally(-1)) {
                paddingLeft = -((width - getPaddingLeft()) - getPaddingRight());
                i14 = paddingTop;
                i15 = paddingLeft;
            } else {
                i14 = paddingTop;
                i15 = 0;
            }
        }
        if (i14 == 0 && i15 == 0) {
            return false;
        }
        this.mRecyclerView.smoothScrollBy(i15, i14, null, Integer.MIN_VALUE, true);
        return true;
    }

    public boolean performAccessibilityActionForItem(View view, int i13, Bundle bundle) {
        RecyclerView recyclerView = this.mRecyclerView;
        return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i13, bundle);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:5:0x0010  */
    public static int getChildMeasureSpec(int i13, int i14, int i15, int i16, boolean z4) {
        int iMax = Math.max(0, i13 - i15);
        if (z4) {
            if (i16 >= 0) {
                i14 = 1073741824;
            } else if (i16 != -1 || (i14 != Integer.MIN_VALUE && (i14 == 0 || i14 != 1073741824))) {
                i14 = 0;
                i16 = 0;
            } else {
                i16 = iMax;
            }
        } else if (i16 >= 0) {
            i14 = 1073741824;
        } else if (i16 == -1) {
            i16 = iMax;
        } else if (i16 != -2) {
            i14 = 0;
            i16 = 0;
        } else if (i14 == Integer.MIN_VALUE || i14 == 1073741824) {
            i16 = iMax;
            i14 = Integer.MIN_VALUE;
        } else {
            i16 = iMax;
            i14 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i16, i14);
    }

    @SuppressLint({"UnknownNullness"})
    public C1744v1 generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C1744v1(context, attributeSet);
    }

    public void onInitializeAccessibilityNodeInfoForItem(C1668c2 c1668c2, C1701k2 c1701k2, View view, C18093f c18093f) {
    }

    public void setMeasuredDimension(int i13, int i14) {
        this.mRecyclerView.setMeasuredDimension(i13, i14);
    }

    public void attachView(View view, int i13) {
        attachView(view, i13, (C1744v1) view.getLayoutParams());
    }

    public void attachView(View view) {
        attachView(view, -1);
    }

    public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z4) {
        return requestChildRectangleOnScreen(recyclerView, view, rect, z4, false);
    }
}
