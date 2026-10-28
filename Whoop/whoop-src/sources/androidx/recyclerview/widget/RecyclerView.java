package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.ScrollingView;
import androidx.profileinstaller.ProfileVerifier;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p002a0.C0021f1;
import p016an.C1053d;
import p027b3.C2370e3;
import p029b5.AbstractC2732k;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16886k0;
import p184h5.AbstractC16901p0;
import p184h5.C16903q;
import p184h5.C16907r0;
import p184h5.InterfaceC16900p;
import p248jb.AbstractC21531a;
import p522uf.AbstractC34870c0;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes5.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, InterfaceC16900p {
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static boolean sDebugAssertionsEnabled = false;
    static final C1705l2 sDefaultEdgeEffectFactory;
    static final Interpolator sQuinticInterpolator;
    static boolean sVerboseLoggingEnabled = false;
    C1725q2 mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    AbstractC1692i1 mAdapter;
    C1660b mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private InterfaceC1704l1 mChildDrawingOrderCallback;
    C1694j mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private AbstractC1708m1 mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    RunnableC1683g0 mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private InterfaceC1756y1 mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    AbstractC1720p1 mItemAnimator;
    private InterfaceC1712n1 mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<AbstractC1724q1> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    AbstractC1740u1 mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final C1677e2 mObserver;
    private List<InterfaceC1748w1> mOnChildAttachStateListeners;
    private AbstractC1752x1 mOnFlingListener;
    private final ArrayList<InterfaceC1756y1> mOnItemTouchListeners;
    final List<AbstractC1717o2> mPendingAccessibilityImportanceChange;
    C1685g2 mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    C1675e0 mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final C1668c2 mRecycler;
    InterfaceC1673d2 mRecyclerListener;
    final List<InterfaceC1673d2> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private AbstractC1760z1 mScrollListener;
    private List<AbstractC1760z1> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private C16903q mScrollingChildHelper;
    final C1701k2 mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final RunnableC1713n2 mViewFlinger;
    private final InterfaceC1664b3 mViewInfoProcessCallback;
    final C1669c3 mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    static {
        Class cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new InterpolatorC1703l0(2);
        sDefaultEdgeEffectFactory = new C1705l2();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.whoop.android.R.attr.recyclerViewStyle);
    }

    /* JADX INFO: renamed from: c */
    public static int m5124c(int i13, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i14) {
        if (i13 > 0 && edgeEffect != null && AbstractC34870c0.m109982R(edgeEffect) != 0.0f) {
            int iRound = Math.round(AbstractC34870c0.m109995e0(edgeEffect, ((-i13) * FLING_DESTRETCH_FACTOR) / i14, 0.5f) * ((-i14) / FLING_DESTRETCH_FACTOR));
            if (iRound != i13) {
                edgeEffect.finish();
            }
            return i13 - iRound;
        }
        if (i13 >= 0 || edgeEffect2 == null || AbstractC34870c0.m109982R(edgeEffect2) == 0.0f) {
            return i13;
        }
        float f13 = i14;
        int iRound2 = Math.round(AbstractC34870c0.m109995e0(edgeEffect2, (i13 * FLING_DESTRETCH_FACTOR) / f13, 0.5f) * (f13 / FLING_DESTRETCH_FACTOR));
        if (iRound2 != i13) {
            edgeEffect2.finish();
        }
        return i13 - iRound2;
    }

    public static void clearNestedRecyclerViewIfNotNested(AbstractC1717o2 abstractC1717o2) {
        WeakReference<RecyclerView> weakReference = abstractC1717o2.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == abstractC1717o2.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            abstractC1717o2.mNestedRecyclerView = null;
        }
    }

    public static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            RecyclerView recyclerViewFindNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i13));
            if (recyclerViewFindNestedRecyclerView != null) {
                return recyclerViewFindNestedRecyclerView;
            }
        }
        return null;
    }

    public static AbstractC1717o2 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((C1744v1) view.getLayoutParams()).f6891a;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        C1744v1 c1744v1 = (C1744v1) view.getLayoutParams();
        Rect rect2 = c1744v1.f6892b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c1744v1).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c1744v1).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c1744v1).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c1744v1).bottomMargin);
    }

    private C16903q getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C16903q(this);
        }
        return this.mScrollingChildHelper;
    }

    public static void setDebugAssertionsEnabled(boolean z4) {
        sDebugAssertionsEnabled = z4;
    }

    public static void setVerboseLoggingEnabled(boolean z4) {
        sVerboseLoggingEnabled = z4;
    }

    /* JADX INFO: renamed from: a */
    public final void m5125a(AbstractC1717o2 abstractC1717o2) {
        View view = abstractC1717o2.itemView;
        boolean z4 = view.getParent() == this;
        this.mRecycler.m5206m(getChildViewHolder(view));
        if (abstractC1717o2.isTmpDetached()) {
            this.mChildHelper.m5253b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z4) {
            this.mChildHelper.m5252a(view, -1, true);
            return;
        }
        C1694j c1694j = this.mChildHelper;
        int iIndexOfChild = c1694j.f6686a.f6659a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            c1694j.f6687b.m3089N(iIndexOfChild);
            c1694j.m5260i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void absorbGlows(int i13, int i14) {
        if (i13 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i13);
            }
        } else if (i13 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i13);
            }
        }
        if (i14 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i14);
            }
        } else if (i14 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i14);
            }
        }
        if (i13 == 0 && i14 == 0) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i13, int i14) {
        AbstractC1740u1 abstractC1740u1 = this.mLayout;
        if (abstractC1740u1 == null || !abstractC1740u1.onAddFocusables(this, arrayList, i13, i14)) {
            super.addFocusables(arrayList, i13, i14);
        }
    }

    public final void addItemDecoration(AbstractC1724q1 abstractC1724q1, int i13) {
        AbstractC1740u1 abstractC1740u1 = this.mLayout;
        if (abstractC1740u1 != null) {
            abstractC1740u1.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i13 < 0) {
            this.mItemDecorations.add(abstractC1724q1);
        } else {
            this.mItemDecorations.add(i13, abstractC1724q1);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public final void addOnChildAttachStateChangeListener(InterfaceC1748w1 interfaceC1748w1) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(interfaceC1748w1);
    }

    public final void addOnItemTouchListener(InterfaceC1756y1 interfaceC1756y1) {
        this.mOnItemTouchListeners.add(interfaceC1756y1);
    }

    public final void addOnScrollListener(AbstractC1760z1 abstractC1760z1) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(abstractC1760z1);
    }

    public final void addRecyclerListener(InterfaceC1673d2 interfaceC1673d2) {
        AbstractC37056f.m118990m(interfaceC1673d2 != null, "'listener' arg cannot be null.");
        this.mRecyclerListeners.add(interfaceC1673d2);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public final void animateAppearance(AbstractC1717o2 abstractC1717o2, C1716o1 c1716o1, C1716o1 c1716o2) {
        boolean zM5311g;
        abstractC1717o2.setIsRecyclable(false);
        C1722q c1722q = (C1722q) this.mItemAnimator;
        if (c1716o1 != null) {
            c1722q.getClass();
            int i13 = c1716o1.f6795a;
            int i14 = c1716o2.f6795a;
            if (i13 == i14 && c1716o1.f6796b == c1716o2.f6796b) {
                c1722q.m5315l(abstractC1717o2);
                abstractC1717o2.itemView.setAlpha(0.0f);
                c1722q.f6813i.add(abstractC1717o2);
                zM5311g = true;
            } else {
                zM5311g = c1722q.m5311g(abstractC1717o2, i13, c1716o1.f6796b, i14, c1716o2.f6796b);
            }
        } else {
            c1722q.m5315l(abstractC1717o2);
            abstractC1717o2.itemView.setAlpha(0.0f);
            c1722q.f6813i.add(abstractC1717o2);
            zM5311g = true;
        }
        if (zM5311g) {
            postAnimationRunner();
        }
    }

    public final void animateDisappearance(AbstractC1717o2 abstractC1717o2, C1716o1 c1716o1, C1716o1 c1716o2) {
        boolean zM5311g;
        m5125a(abstractC1717o2);
        abstractC1717o2.setIsRecyclable(false);
        C1722q c1722q = (C1722q) this.mItemAnimator;
        c1722q.getClass();
        int i13 = c1716o1.f6795a;
        int i14 = c1716o1.f6796b;
        View view = abstractC1717o2.itemView;
        int left = c1716o2 == null ? view.getLeft() : c1716o2.f6795a;
        int top = c1716o2 == null ? view.getTop() : c1716o2.f6796b;
        if (abstractC1717o2.isRemoved() || (i13 == left && i14 == top)) {
            c1722q.m5315l(abstractC1717o2);
            c1722q.f6812h.add(abstractC1717o2);
            zM5311g = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zM5311g = c1722q.m5311g(abstractC1717o2, i13, i14, left, top);
        }
        if (zM5311g) {
            postAnimationRunner();
        }
    }

    public final void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str != null) {
            throw new IllegalStateException(AbstractC30802r.m94760i(this, AbstractC18489d0.m53374o(str)));
        }
        throw new IllegalStateException(AbstractC30802r.m94760i(this, new StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
    }

    public final void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(AbstractC30802r.m94760i(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(AbstractC30802r.m94760i(this, new StringBuilder(""))));
        }
    }

    public final boolean canReuseUpdatedViewHolder(AbstractC1717o2 abstractC1717o2) {
        AbstractC1720p1 abstractC1720p1 = this.mItemAnimator;
        if (abstractC1720p1 != null) {
            return (abstractC1717o2.getUnmodifiedPayloads().isEmpty() && ((C1722q) abstractC1720p1).f6811g && !abstractC1717o2.isInvalid()) ? false : true;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1744v1) && this.mLayout.checkLayoutParams((C1744v1) layoutParams);
    }

    public final void clearOldPositions() {
        int iM5259h = this.mChildHelper.m5259h();
        for (int i13 = 0; i13 < iM5259h; i13++) {
            AbstractC1717o2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5258g(i13));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        C1668c2 c1668c2 = this.mRecycler;
        ArrayList arrayList = c1668c2.f6591a;
        ArrayList arrayList2 = c1668c2.f6593c;
        int size = arrayList2.size();
        for (int i14 = 0; i14 < size; i14++) {
            ((AbstractC1717o2) arrayList2.get(i14)).clearOldPosition();
        }
        int size2 = arrayList.size();
        for (int i15 = 0; i15 < size2; i15++) {
            ((AbstractC1717o2) arrayList.get(i15)).clearOldPosition();
        }
        ArrayList arrayList3 = c1668c2.f6592b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i16 = 0; i16 < size3; i16++) {
                ((AbstractC1717o2) c1668c2.f6592b.get(i16)).clearOldPosition();
            }
        }
    }

    public final void clearOnChildAttachStateChangeListeners() {
        List<InterfaceC1748w1> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public final void clearOnScrollListeners() {
        List<AbstractC1760z1> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollExtent() {
        AbstractC1740u1 abstractC1740u1 = this.mLayout;
        if (abstractC1740u1 != null && abstractC1740u1.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollOffset() {
        AbstractC1740u1 abstractC1740u1 = this.mLayout;
        if (abstractC1740u1 != null && abstractC1740u1.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollRange() {
        AbstractC1740u1 abstractC1740u1 = this.mLayout;
        if (abstractC1740u1 != null && abstractC1740u1.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollExtent() {
        AbstractC1740u1 abstractC1740u1 = this.mLayout;
        if (abstractC1740u1 != null && abstractC1740u1.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollOffset() {
        AbstractC1740u1 abstractC1740u1 = this.mLayout;
        if (abstractC1740u1 != null && abstractC1740u1.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollRange() {
        AbstractC1740u1 abstractC1740u1 = this.mLayout;
        if (abstractC1740u1 != null && abstractC1740u1.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    public final void considerReleasingGlowsOnScroll(int i13, int i14) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i13 <= 0) {
            zIsFinished = false;
        } else {
            this.mLeftGlow.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i13 < 0) {
            this.mRightGlow.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i14 > 0) {
            this.mTopGlow.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i14 < 0) {
            this.mBottomGlow.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            postInvalidateOnAnimation();
        }
    }

    public final int consumeFlingInHorizontalStretch(int i13) {
        return m5124c(i13, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    public final int consumeFlingInVerticalStretch(int i13) {
        return m5124c(i13, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    public final void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            int i13 = AbstractC2732k.f10742a;
            Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            Trace.endSection();
            return;
        }
        if (this.mAdapterHelper.m5172g()) {
            C1660b c1660b = this.mAdapterHelper;
            int i14 = c1660b.f6577f;
            if ((i14 & 4) == 0 || (i14 & 11) != 0) {
                if (c1660b.m5172g()) {
                    int i15 = AbstractC2732k.f10742a;
                    Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i16 = AbstractC2732k.f10742a;
            Trace.beginSection(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            this.mAdapterHelper.m5175j();
            if (!this.mLayoutWasDefered) {
                int iM5256e = this.mChildHelper.m5256e();
                for (int i17 = 0; i17 < iM5256e; i17++) {
                    AbstractC1717o2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5255d(i17));
                    if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                        dispatchLayout();
                    }
                }
                this.mAdapterHelper.m5167b();
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll(true);
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5126d() {
        C1659a3 c1659a3;
        View viewFindContainingItemView;
        this.mState.m5275a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f6729i = false;
        startInterceptRequestLayout();
        C1669c3 c1669c3 = this.mViewInfoStore;
        c1669c3.f6599a.clear();
        c1669c3.f6600b.m149a();
        onEnterLayoutOrScroll();
        m5132j();
        AbstractC1717o2 childViewHolder = null;
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewFindContainingItemView = findContainingItemView(focusedChild)) != null) {
            childViewHolder = getChildViewHolder(viewFindContainingItemView);
        }
        if (childViewHolder == null) {
            C1701k2 c1701k2 = this.mState;
            c1701k2.f6733m = -1L;
            c1701k2.f6732l = -1;
            c1701k2.f6734n = -1;
        } else {
            this.mState.f6733m = this.mAdapter.hasStableIds() ? childViewHolder.getItemId() : -1L;
            C1701k2 c1701k3 = this.mState;
            c1701k3.f6732l = this.mDataSetHasChangedAfterLayout ? -1 : childViewHolder.isRemoved() ? childViewHolder.mOldPosition : childViewHolder.getAbsoluteAdapterPosition();
            C1701k2 c1701k4 = this.mState;
            View focusedChild2 = childViewHolder.itemView;
            int id4 = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id4 = focusedChild2.getId();
                }
            }
            c1701k4.f6734n = id4;
        }
        C1701k2 c1701k5 = this.mState;
        c1701k5.f6728h = c1701k5.f6730j && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        c1701k5.f6727g = c1701k5.f6731k;
        c1701k5.f6725e = this.mAdapter.getPageCount();
        m5129g(this.mMinMaxLayoutPositions);
        if (this.mState.f6730j) {
            int iM5256e = this.mChildHelper.m5256e();
            for (int i13 = 0; i13 < iM5256e; i13++) {
                AbstractC1717o2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5255d(i13));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    AbstractC1720p1 abstractC1720p1 = this.mItemAnimator;
                    AbstractC1720p1.m5295b(childViewHolderInt);
                    childViewHolderInt.getUnmodifiedPayloads();
                    abstractC1720p1.getClass();
                    C1716o1 c1716o1 = new C1716o1();
                    c1716o1.m5294a(childViewHolderInt);
                    C0021f1 c0021f1 = this.mViewInfoStore.f6599a;
                    C1659a3 c1659a3M5165a = (C1659a3) c0021f1.get(childViewHolderInt);
                    if (c1659a3M5165a == null) {
                        c1659a3M5165a = C1659a3.m5165a();
                        c0021f1.put(childViewHolderInt, c1659a3M5165a);
                    }
                    c1659a3M5165a.f6570b = c1716o1;
                    c1659a3M5165a.f6569a |= 4;
                    if (this.mState.f6728h && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.f6600b.m155g(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f6731k) {
            saveOldPositions();
            C1701k2 c1701k6 = this.mState;
            boolean z4 = c1701k6.f6726f;
            c1701k6.f6726f = false;
            this.mLayout.onLayoutChildren(this.mRecycler, c1701k6);
            this.mState.f6726f = z4;
            for (int i14 = 0; i14 < this.mChildHelper.m5256e(); i14++) {
                AbstractC1717o2 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.m5255d(i14));
                if (!childViewHolderInt2.shouldIgnore() && ((c1659a3 = (C1659a3) this.mViewInfoStore.f6599a.get(childViewHolderInt2)) == null || (c1659a3.f6569a & 4) == 0)) {
                    AbstractC1720p1.m5295b(childViewHolderInt2);
                    boolean zHasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(DfuBaseService.ERROR_REMOTE_MASK);
                    AbstractC1720p1 abstractC1720p2 = this.mItemAnimator;
                    childViewHolderInt2.getUnmodifiedPayloads();
                    abstractC1720p2.getClass();
                    C1716o1 c1716o2 = new C1716o1();
                    c1716o2.m5294a(childViewHolderInt2);
                    if (zHasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, c1716o2);
                    } else {
                        C0021f1 c0021f2 = this.mViewInfoStore.f6599a;
                        C1659a3 c1659a3M5165a2 = (C1659a3) c0021f2.get(childViewHolderInt2);
                        if (c1659a3M5165a2 == null) {
                            c1659a3M5165a2 = C1659a3.m5165a();
                            c0021f2.put(childViewHolderInt2, c1659a3M5165a2);
                        }
                        c1659a3M5165a2.f6569a |= 2;
                        c1659a3M5165a2.f6570b = c1716o2;
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll(true);
        stopInterceptRequestLayout(false);
        this.mState.f6724d = 2;
    }

    public final void defaultOnMeasure(int i13, int i14) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        setMeasuredDimension(AbstractC1740u1.chooseSize(i13, paddingRight, getMinimumWidth()), AbstractC1740u1.chooseSize(i14, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void dispatchChildAttached(View view) {
        AbstractC1717o2 childViewHolderInt = getChildViewHolderInt(view);
        AbstractC1692i1 abstractC1692i1 = this.mAdapter;
        if (abstractC1692i1 != null && childViewHolderInt != null) {
            abstractC1692i1.onViewAttachedToWindow(childViewHolderInt);
        }
        List<InterfaceC1748w1> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).mo5282c(view);
            }
        }
    }

    public final void dispatchChildDetached(View view) {
        AbstractC1717o2 childViewHolderInt = getChildViewHolderInt(view);
        AbstractC1692i1 abstractC1692i1 = this.mAdapter;
        if (abstractC1692i1 != null && childViewHolderInt != null) {
            abstractC1692i1.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<InterfaceC1748w1> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).mo5281a(view);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:170:0x038d  */
    /* JADX WARN: Code duplicated, block: B:172:0x0395  */
    /* JADX WARN: Code duplicated, block: B:175:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:177:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:179:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:183:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:185:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:187:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:190:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:193:0x03de  */
    /* JADX WARN: Code duplicated, block: B:196:0x03e9 A[LOOP:3: B:189:0x03d5->B:196:0x03e9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:199:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:202:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:205:0x0408 A[LOOP:4: B:198:0x03f4->B:205:0x0408, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:207:0x040d  */
    /* JADX WARN: Code duplicated, block: B:209:0x0416  */
    /* JADX WARN: Code duplicated, block: B:240:0x03e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x03ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x03ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x040b A[EDGE_INSN: B:244:0x040b->B:206:0x040b BREAK  A[LOOP:4: B:198:0x03f4->B:205:0x0408], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x0405 A[SYNTHETIC] */
    public final void dispatchLayout() {
        AbstractC1717o2 abstractC1717o2FindViewHolderForItemId;
        int i13;
        int iM5276b;
        int i14;
        int iMin;
        AbstractC1717o2 abstractC1717o2FindViewHolderForAdapterPosition;
        AbstractC1717o2 abstractC1717o2FindViewHolderForAdapterPosition2;
        int i15;
        View viewFindViewById;
        boolean zM5311g;
        if (this.mAdapter == null) {
            Log.w(TAG, "No adapter attached; skipping layout");
            return;
        }
        if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
            return;
        }
        this.mState.f6729i = false;
        boolean z4 = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.f6724d == 1) {
            m5126d();
            this.mLayout.setExactMeasureSpecsFrom(this);
            m5127e();
        } else {
            C1660b c1660b = this.mAdapterHelper;
            if ((c1660b.f6574c.isEmpty() || c1660b.f6573b.isEmpty()) && !z4 && this.mLayout.getWidth() == getWidth() && this.mLayout.getHeight() == getHeight()) {
                this.mLayout.setExactMeasureSpecsFrom(this);
            } else {
                this.mLayout.setExactMeasureSpecsFrom(this);
                m5127e();
            }
        }
        this.mState.m5275a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C1701k2 c1701k2 = this.mState;
        c1701k2.f6724d = 1;
        View view = null;
        if (c1701k2.f6730j) {
            for (int iM5256e = this.mChildHelper.m5256e() - 1; iM5256e >= 0; iM5256e--) {
                AbstractC1717o2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5255d(iM5256e));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    this.mItemAnimator.getClass();
                    C1716o1 c1716o1 = new C1716o1();
                    c1716o1.m5294a(childViewHolderInt);
                    AbstractC1717o2 abstractC1717o2 = (AbstractC1717o2) this.mViewInfoStore.f6600b.m151c(changedHolderKey);
                    if (abstractC1717o2 == null || abstractC1717o2.shouldIgnore()) {
                        this.mViewInfoStore.m5208a(childViewHolderInt, c1716o1);
                    } else {
                        C1659a3 c1659a3 = (C1659a3) this.mViewInfoStore.f6599a.get(abstractC1717o2);
                        boolean z13 = (c1659a3 == null || (c1659a3.f6569a & 1) == 0) ? false : true;
                        C1659a3 c1659a4 = (C1659a3) this.mViewInfoStore.f6599a.get(childViewHolderInt);
                        boolean z14 = (c1659a4 == null || (c1659a4.f6569a & 1) == 0) ? false : true;
                        if (z13 && abstractC1717o2 == childViewHolderInt) {
                            this.mViewInfoStore.m5208a(childViewHolderInt, c1716o1);
                        } else {
                            C1716o1 c1716o1M5209b = this.mViewInfoStore.m5209b(abstractC1717o2, 4);
                            this.mViewInfoStore.m5208a(childViewHolderInt, c1716o1);
                            C1716o1 c1716o1M5209b2 = this.mViewInfoStore.m5209b(childViewHolderInt, 8);
                            if (c1716o1M5209b == null) {
                                int iM5256e2 = this.mChildHelper.m5256e();
                                for (int i16 = 0; i16 < iM5256e2; i16++) {
                                    AbstractC1717o2 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.m5255d(i16));
                                    if (childViewHolderInt2 != childViewHolderInt && getChangedHolderKey(childViewHolderInt2) == changedHolderKey) {
                                        AbstractC1692i1 abstractC1692i1 = this.mAdapter;
                                        if (abstractC1692i1 == null || !abstractC1692i1.hasStableIds()) {
                                            StringBuilder sb4 = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb4.append(childViewHolderInt2);
                                            sb4.append(" \n View Holder 2:");
                                            sb4.append(childViewHolderInt);
                                            throw new IllegalStateException(AbstractC30802r.m94760i(this, sb4));
                                        }
                                        StringBuilder sb5 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb5.append(childViewHolderInt2);
                                        sb5.append(" \n View Holder 2:");
                                        sb5.append(childViewHolderInt);
                                        throw new IllegalStateException(AbstractC30802r.m94760i(this, sb5));
                                    }
                                }
                                Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC1717o2 + " cannot be found but it is necessary for " + childViewHolderInt + exceptionLabel());
                            } else {
                                abstractC1717o2.setIsRecyclable(false);
                                if (z13) {
                                    m5125a(abstractC1717o2);
                                }
                                if (abstractC1717o2 != childViewHolderInt) {
                                    if (z14) {
                                        m5125a(childViewHolderInt);
                                    }
                                    abstractC1717o2.mShadowedHolder = childViewHolderInt;
                                    m5125a(abstractC1717o2);
                                    this.mRecycler.m5206m(abstractC1717o2);
                                    childViewHolderInt.setIsRecyclable(false);
                                    childViewHolderInt.mShadowingHolder = abstractC1717o2;
                                }
                                if (this.mItemAnimator.mo5296a(abstractC1717o2, childViewHolderInt, c1716o1M5209b, c1716o1M5209b2)) {
                                    postAnimationRunner();
                                }
                            }
                        }
                    }
                }
            }
            C1669c3 c1669c3 = this.mViewInfoStore;
            InterfaceC1664b3 interfaceC1664b3 = this.mViewInfoProcessCallback;
            C0021f1 c0021f1 = c1669c3.f6599a;
            for (int i17 = c0021f1.f50y - 1; i17 >= 0; i17--) {
                AbstractC1717o2 abstractC1717o3 = (AbstractC1717o2) c0021f1.m38g(i17);
                C1659a3 c1659a5 = (C1659a3) c0021f1.mo40i(i17);
                int i18 = c1659a5.f6569a;
                if ((i18 & 3) == 3) {
                    RecyclerView recyclerView = ((C1684g1) interfaceC1664b3).f6659a;
                    recyclerView.mLayout.removeAndRecycleView(abstractC1717o3.itemView, recyclerView.mRecycler);
                } else if ((i18 & 1) != 0) {
                    C1716o1 c1716o2 = c1659a5.f6570b;
                    if (c1716o2 == null) {
                        RecyclerView recyclerView2 = ((C1684g1) interfaceC1664b3).f6659a;
                        recyclerView2.mLayout.removeAndRecycleView(abstractC1717o3.itemView, recyclerView2.mRecycler);
                    } else {
                        C1716o1 c1716o3 = c1659a5.f6571c;
                        RecyclerView recyclerView3 = ((C1684g1) interfaceC1664b3).f6659a;
                        recyclerView3.mRecycler.m5206m(abstractC1717o3);
                        recyclerView3.animateDisappearance(abstractC1717o3, c1716o2, c1716o3);
                    }
                } else if ((i18 & 14) == 14) {
                    ((C1684g1) interfaceC1664b3).f6659a.animateAppearance(abstractC1717o3, c1659a5.f6570b, c1659a5.f6571c);
                } else if ((i18 & 12) == 12) {
                    C1716o1 c1716o4 = c1659a5.f6570b;
                    C1716o1 c1716o5 = c1659a5.f6571c;
                    C1684g1 c1684g1 = (C1684g1) interfaceC1664b3;
                    c1684g1.getClass();
                    abstractC1717o3.setIsRecyclable(false);
                    RecyclerView recyclerView4 = c1684g1.f6659a;
                    if (!recyclerView4.mDataSetHasChangedAfterLayout) {
                        C1722q c1722q = (C1722q) recyclerView4.mItemAnimator;
                        c1722q.getClass();
                        int i19 = c1716o4.f6795a;
                        int i24 = c1716o5.f6795a;
                        if (i19 == i24 && c1716o4.f6796b == c1716o5.f6796b) {
                            c1722q.m5297c(abstractC1717o3);
                            zM5311g = false;
                        } else {
                            zM5311g = c1722q.m5311g(abstractC1717o3, i19, c1716o4.f6796b, i24, c1716o5.f6796b);
                        }
                        if (zM5311g) {
                            recyclerView4.postAnimationRunner();
                        }
                    } else if (recyclerView4.mItemAnimator.mo5296a(abstractC1717o3, abstractC1717o3, c1716o4, c1716o5)) {
                        recyclerView4.postAnimationRunner();
                    }
                } else if ((i18 & 4) != 0) {
                    C1716o1 c1716o6 = c1659a5.f6570b;
                    RecyclerView recyclerView5 = ((C1684g1) interfaceC1664b3).f6659a;
                    recyclerView5.mRecycler.m5206m(abstractC1717o3);
                    recyclerView5.animateDisappearance(abstractC1717o3, c1716o6, null);
                } else if ((i18 & 8) != 0) {
                    ((C1684g1) interfaceC1664b3).f6659a.animateAppearance(abstractC1717o3, c1659a5.f6570b, c1659a5.f6571c);
                }
                c1659a5.f6569a = 0;
                c1659a5.f6570b = null;
                c1659a5.f6571c = null;
                C1659a3.f6568d.mo43683a(c1659a5);
            }
        }
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        C1701k2 c1701k3 = this.mState;
        c1701k3.f6722b = c1701k3.f6725e;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        c1701k3.f6730j = false;
        c1701k3.f6731k = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        ArrayList arrayList = this.mRecycler.f6592b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC1740u1 abstractC1740u1 = this.mLayout;
        if (abstractC1740u1.mPrefetchMaxObservedInInitialPrefetch) {
            abstractC1740u1.mPrefetchMaxCountObserved = 0;
            abstractC1740u1.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.m5207n();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll(true);
        stopInterceptRequestLayout(false);
        C1669c3 c1669c4 = this.mViewInfoStore;
        c1669c4.f6599a.clear();
        c1669c4.f6600b.m149a();
        int[] iArr = this.mMinMaxLayoutPositions;
        int i25 = iArr[0];
        int i26 = iArr[1];
        m5129g(iArr);
        int[] iArr2 = this.mMinMaxLayoutPositions;
        if ((iArr2[0] == i25 && iArr2[1] == i26) ? false : true) {
            dispatchOnScrolled(0, 0);
        }
        if (this.mPreserveFocusAfterLayout && this.mAdapter != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                if (this.mState.f6733m == -1) {
                    abstractC1717o2FindViewHolderForItemId = null;
                } else {
                    abstractC1717o2FindViewHolderForItemId = null;
                }
                if (abstractC1717o2FindViewHolderForItemId == null) {
                    if (this.mChildHelper.m5256e() > 0) {
                        C1701k2 c1701k4 = this.mState;
                        int i27 = c1701k4.f6732l;
                        if (i27 != -1) {
                        }
                        iM5276b = c1701k4.m5276b();
                        i14 = i13;
                        while (true) {
                            if (i14 >= iM5276b) {
                                abstractC1717o2FindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i14);
                                if (abstractC1717o2FindViewHolderForAdapterPosition2 == null) {
                                    if (abstractC1717o2FindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                                        view = abstractC1717o2FindViewHolderForAdapterPosition2.itemView;
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                            for (iMin = Math.min(iM5276b, i13) - 1; iMin >= 0; iMin--) {
                                abstractC1717o2FindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin);
                                if (abstractC1717o2FindViewHolderForAdapterPosition != null) {
                                    break;
                                    break;
                                } else {
                                    if (abstractC1717o2FindViewHolderForAdapterPosition.itemView.hasFocusable()) {
                                        view = abstractC1717o2FindViewHolderForAdapterPosition.itemView;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } else if (!this.mChildHelper.f6688c.contains(abstractC1717o2FindViewHolderForItemId.itemView)) {
                    if (this.mChildHelper.m5256e() > 0) {
                        C1701k2 c1701k5 = this.mState;
                        int i28 = c1701k5.f6732l;
                        if (i28 != -1) {
                        }
                        iM5276b = c1701k5.m5276b();
                        i14 = i13;
                        while (true) {
                            if (i14 >= iM5276b) {
                                abstractC1717o2FindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i14);
                                if (abstractC1717o2FindViewHolderForAdapterPosition2 == null) {
                                    if (abstractC1717o2FindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                                        view = abstractC1717o2FindViewHolderForAdapterPosition2.itemView;
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                abstractC1717o2FindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin);
                                if (abstractC1717o2FindViewHolderForAdapterPosition != null) {
                                    break;
                                    break;
                                } else {
                                    if (abstractC1717o2FindViewHolderForAdapterPosition.itemView.hasFocusable()) {
                                        view = abstractC1717o2FindViewHolderForAdapterPosition.itemView;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } else if (this.mChildHelper.m5256e() > 0) {
                    C1701k2 c1701k6 = this.mState;
                    int i29 = c1701k6.f6732l;
                    if (i29 != -1) {
                    }
                    iM5276b = c1701k6.m5276b();
                    i14 = i13;
                    while (true) {
                        if (i14 >= iM5276b) {
                            abstractC1717o2FindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i14);
                            if (abstractC1717o2FindViewHolderForAdapterPosition2 == null) {
                                if (abstractC1717o2FindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                                    view = abstractC1717o2FindViewHolderForAdapterPosition2.itemView;
                                } else {
                                    i14++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            abstractC1717o2FindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin);
                            if (abstractC1717o2FindViewHolderForAdapterPosition != null) {
                                break;
                                break;
                            } else {
                                if (abstractC1717o2FindViewHolderForAdapterPosition.itemView.hasFocusable()) {
                                    view = abstractC1717o2FindViewHolderForAdapterPosition.itemView;
                                    break;
                                }
                            }
                        }
                    }
                }
                if (view != null) {
                    i15 = this.mState.f6734n;
                    if (i15 != -1) {
                        view = viewFindViewById;
                    }
                    view.requestFocus();
                }
            } else {
                View focusedChild = getFocusedChild();
                if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                    if (this.mChildHelper.f6688c.contains(focusedChild)) {
                        if (this.mState.f6733m == -1 && this.mAdapter.hasStableIds()) {
                            abstractC1717o2FindViewHolderForItemId = findViewHolderForItemId(this.mState.f6733m);
                        } else {
                            abstractC1717o2FindViewHolderForItemId = null;
                        }
                        if (abstractC1717o2FindViewHolderForItemId == null) {
                            if (this.mChildHelper.m5256e() > 0) {
                                C1701k2 c1701k7 = this.mState;
                                int i210 = c1701k7.f6732l;
                                if (i210 != -1) {
                                }
                                iM5276b = c1701k7.m5276b();
                                i14 = i13;
                                while (true) {
                                    if (i14 >= iM5276b) {
                                        abstractC1717o2FindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i14);
                                        if (abstractC1717o2FindViewHolderForAdapterPosition2 == null) {
                                            if (abstractC1717o2FindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                                                view = abstractC1717o2FindViewHolderForAdapterPosition2.itemView;
                                            } else {
                                                i14++;
                                            }
                                        }
                                    }
                                    while (iMin >= 0) {
                                        abstractC1717o2FindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin);
                                        if (abstractC1717o2FindViewHolderForAdapterPosition != null) {
                                            break;
                                            break;
                                        } else {
                                            if (abstractC1717o2FindViewHolderForAdapterPosition.itemView.hasFocusable()) {
                                                view = abstractC1717o2FindViewHolderForAdapterPosition.itemView;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (!this.mChildHelper.f6688c.contains(abstractC1717o2FindViewHolderForItemId.itemView) && abstractC1717o2FindViewHolderForItemId.itemView.hasFocusable()) {
                            view = abstractC1717o2FindViewHolderForItemId.itemView;
                        } else if (this.mChildHelper.m5256e() > 0) {
                            C1701k2 c1701k8 = this.mState;
                            int i211 = c1701k8.f6732l;
                            i13 = i211 != -1 ? i211 : 0;
                            iM5276b = c1701k8.m5276b();
                            i14 = i13;
                            while (true) {
                                if (i14 >= iM5276b) {
                                    abstractC1717o2FindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i14);
                                    if (abstractC1717o2FindViewHolderForAdapterPosition2 == null) {
                                        if (abstractC1717o2FindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                                            view = abstractC1717o2FindViewHolderForAdapterPosition2.itemView;
                                        } else {
                                            i14++;
                                        }
                                    }
                                }
                                while (iMin >= 0) {
                                    abstractC1717o2FindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin);
                                    if (abstractC1717o2FindViewHolderForAdapterPosition != null) {
                                        break;
                                    }
                                    if (abstractC1717o2FindViewHolderForAdapterPosition.itemView.hasFocusable()) {
                                        view = abstractC1717o2FindViewHolderForAdapterPosition.itemView;
                                        break;
                                    }
                                }
                            }
                        }
                        if (view != null) {
                            i15 = this.mState.f6734n;
                            if (i15 != -1 && (viewFindViewById = view.findViewById(i15)) != null && viewFindViewById.isFocusable()) {
                                view = viewFindViewById;
                            }
                            view.requestFocus();
                        }
                    }
                } else if (this.mChildHelper.m5256e() == 0) {
                    requestFocus();
                } else {
                    if (this.mState.f6733m == -1) {
                        abstractC1717o2FindViewHolderForItemId = null;
                    } else {
                        abstractC1717o2FindViewHolderForItemId = null;
                    }
                    if (abstractC1717o2FindViewHolderForItemId == null) {
                        if (this.mChildHelper.m5256e() > 0) {
                            C1701k2 c1701k9 = this.mState;
                            int i212 = c1701k9.f6732l;
                            if (i212 != -1) {
                            }
                            iM5276b = c1701k9.m5276b();
                            i14 = i13;
                            while (true) {
                                if (i14 >= iM5276b) {
                                    abstractC1717o2FindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i14);
                                    if (abstractC1717o2FindViewHolderForAdapterPosition2 == null) {
                                        if (abstractC1717o2FindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                                            view = abstractC1717o2FindViewHolderForAdapterPosition2.itemView;
                                        } else {
                                            i14++;
                                        }
                                    }
                                }
                                while (iMin >= 0) {
                                    abstractC1717o2FindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin);
                                    if (abstractC1717o2FindViewHolderForAdapterPosition != null) {
                                        break;
                                        break;
                                    } else {
                                        if (abstractC1717o2FindViewHolderForAdapterPosition.itemView.hasFocusable()) {
                                            view = abstractC1717o2FindViewHolderForAdapterPosition.itemView;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (!this.mChildHelper.f6688c.contains(abstractC1717o2FindViewHolderForItemId.itemView)) {
                        if (this.mChildHelper.m5256e() > 0) {
                            C1701k2 c1701k10 = this.mState;
                            int i213 = c1701k10.f6732l;
                            if (i213 != -1) {
                            }
                            iM5276b = c1701k10.m5276b();
                            i14 = i13;
                            while (true) {
                                if (i14 >= iM5276b) {
                                    abstractC1717o2FindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i14);
                                    if (abstractC1717o2FindViewHolderForAdapterPosition2 == null) {
                                        if (abstractC1717o2FindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                                            view = abstractC1717o2FindViewHolderForAdapterPosition2.itemView;
                                        } else {
                                            i14++;
                                        }
                                    }
                                }
                                while (iMin >= 0) {
                                    abstractC1717o2FindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin);
                                    if (abstractC1717o2FindViewHolderForAdapterPosition != null) {
                                        break;
                                        break;
                                    } else {
                                        if (abstractC1717o2FindViewHolderForAdapterPosition.itemView.hasFocusable()) {
                                            view = abstractC1717o2FindViewHolderForAdapterPosition.itemView;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (this.mChildHelper.m5256e() > 0) {
                        C1701k2 c1701k11 = this.mState;
                        int i214 = c1701k11.f6732l;
                        if (i214 != -1) {
                        }
                        iM5276b = c1701k11.m5276b();
                        i14 = i13;
                        while (true) {
                            if (i14 >= iM5276b) {
                                abstractC1717o2FindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i14);
                                if (abstractC1717o2FindViewHolderForAdapterPosition2 == null) {
                                    if (abstractC1717o2FindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                                        view = abstractC1717o2FindViewHolderForAdapterPosition2.itemView;
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                abstractC1717o2FindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin);
                                if (abstractC1717o2FindViewHolderForAdapterPosition != null) {
                                    break;
                                    break;
                                } else {
                                    if (abstractC1717o2FindViewHolderForAdapterPosition.itemView.hasFocusable()) {
                                        view = abstractC1717o2FindViewHolderForAdapterPosition.itemView;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    if (view != null) {
                        i15 = this.mState.f6734n;
                        if (i15 != -1) {
                            view = viewFindViewById;
                        }
                        view.requestFocus();
                    }
                }
            }
        }
        C1701k2 c1701k12 = this.mState;
        c1701k12.f6733m = -1L;
        c1701k12.f6732l = -1;
        c1701k12.f6734n = -1;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f13, float f14, boolean z4) {
        return getScrollingChildHelper().m47588a(f13, f14, z4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f13, float f14) {
        return getScrollingChildHelper().m47589b(f13, f14);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i13, int i14, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m47590c(i13, i14, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i13, int i14, int i15, int i16, int[] iArr) {
        return getScrollingChildHelper().m47591d(i13, i14, i15, i16, iArr, 0, null);
    }

    public final void dispatchOnScrollStateChanged(int i13) {
        AbstractC1740u1 abstractC1740u1 = this.mLayout;
        if (abstractC1740u1 != null) {
            abstractC1740u1.onScrollStateChanged(i13);
        }
        AbstractC1760z1 abstractC1760z1 = this.mScrollListener;
        if (abstractC1760z1 != null) {
            abstractC1760z1.onScrollStateChanged(this, i13);
        }
        List<AbstractC1760z1> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i13);
            }
        }
    }

    public final void dispatchOnScrolled(int i13, int i14) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i13, scrollY - i14);
        AbstractC1760z1 abstractC1760z1 = this.mScrollListener;
        if (abstractC1760z1 != null) {
            abstractC1760z1.onScrolled(this, i13, i14);
        }
        List<AbstractC1760z1> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i13, i14);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public final void dispatchPendingImportantForAccessibilityChanges() {
        int i13;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            AbstractC1717o2 abstractC1717o2 = this.mPendingAccessibilityImportanceChange.get(size);
            if (abstractC1717o2.itemView.getParent() == this && !abstractC1717o2.shouldIgnore() && (i13 = abstractC1717o2.mPendingAccessibilityState) != -1) {
                View view = abstractC1717o2.itemView;
                WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                view.setImportantForAccessibility(i13);
                abstractC1717o2.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z4;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z13 = false;
        for (int i13 = 0; i13 < size; i13++) {
            this.mItemDecorations.get(i13).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z4 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z4 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z4 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z4 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z13 = true;
            }
            z4 |= z13;
            canvas.restoreToCount(iSave4);
        }
        if ((z4 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.mo5300f()) ? z4 : true) {
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j7) {
        return super.drawChild(canvas, view, j7);
    }

    /* JADX INFO: renamed from: e */
    public final void m5127e() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.m5275a(6);
        this.mAdapterHelper.m5168c();
        this.mState.f6725e = this.mAdapter.getPageCount();
        this.mState.f6723c = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f6660y;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        C1701k2 c1701k2 = this.mState;
        c1701k2.f6727g = false;
        this.mLayout.onLayoutChildren(this.mRecycler, c1701k2);
        C1701k2 c1701k3 = this.mState;
        c1701k3.f6726f = false;
        c1701k3.f6730j = c1701k3.f6730j && this.mItemAnimator != null;
        c1701k3.f6724d = 4;
        onExitLayoutOrScroll(true);
        stopInterceptRequestLayout(false);
    }

    public final void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = this.mEdgeEffectFactory.createEdgeEffect(this, 3);
        this.mBottomGlow = edgeEffectCreateEdgeEffect;
        if (this.mClipToPadding) {
            edgeEffectCreateEdgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectCreateEdgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = this.mEdgeEffectFactory.createEdgeEffect(this, 0);
        this.mLeftGlow = edgeEffectCreateEdgeEffect;
        if (this.mClipToPadding) {
            edgeEffectCreateEdgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectCreateEdgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = this.mEdgeEffectFactory.createEdgeEffect(this, 2);
        this.mRightGlow = edgeEffectCreateEdgeEffect;
        if (this.mClipToPadding) {
            edgeEffectCreateEdgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectCreateEdgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = this.mEdgeEffectFactory.createEdgeEffect(this, 1);
        this.mTopGlow = edgeEffectCreateEdgeEffect;
        if (this.mClipToPadding) {
            edgeEffectCreateEdgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectCreateEdgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m5128f(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC1756y1 interfaceC1756y1 = this.mOnItemTouchListeners.get(i13);
            if (interfaceC1756y1.mo5222b(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = interfaceC1756y1;
                return true;
            }
        }
        return false;
    }

    public final void fillRemainingScrollValues(C1701k2 c1701k2) {
        if (getScrollState() != 2) {
            c1701k2.getClass();
            return;
        }
        OverScroller overScroller = this.mViewFlinger.f6759y;
        overScroller.getFinalX();
        overScroller.getCurrX();
        c1701k2.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final View findChildViewUnder(float f13, float f14) {
        for (int iM5256e = this.mChildHelper.m5256e() - 1; iM5256e >= 0; iM5256e--) {
            View viewM5255d = this.mChildHelper.m5255d(iM5256e);
            float translationX = viewM5255d.getTranslationX();
            float translationY = viewM5255d.getTranslationY();
            if (f13 >= viewM5255d.getLeft() + translationX && f13 <= viewM5255d.getRight() + translationX && f14 >= viewM5255d.getTop() + translationY && f14 <= viewM5255d.getBottom() + translationY) {
                return viewM5255d;
            }
        }
        return null;
    }

    public final View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final AbstractC1717o2 findContainingViewHolder(View view) {
        View viewFindContainingItemView = findContainingItemView(view);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(viewFindContainingItemView);
    }

    public final AbstractC1717o2 findViewHolderForAdapterPosition(int i13) {
        AbstractC1717o2 abstractC1717o2 = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int iM5259h = this.mChildHelper.m5259h();
        for (int i14 = 0; i14 < iM5259h; i14++) {
            AbstractC1717o2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5258g(i14));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i13) {
                C1694j c1694j = this.mChildHelper;
                if (!c1694j.f6688c.contains(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                abstractC1717o2 = childViewHolderInt;
            }
        }
        return abstractC1717o2;
    }

    public final AbstractC1717o2 findViewHolderForItemId(long j7) {
        AbstractC1692i1 abstractC1692i1 = this.mAdapter;
        AbstractC1717o2 abstractC1717o2 = null;
        if (abstractC1692i1 != null && abstractC1692i1.hasStableIds()) {
            int iM5259h = this.mChildHelper.m5259h();
            for (int i13 = 0; i13 < iM5259h; i13++) {
                AbstractC1717o2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5258g(i13));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j7) {
                    C1694j c1694j = this.mChildHelper;
                    if (!c1694j.f6688c.contains(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    abstractC1717o2 = childViewHolderInt;
                }
            }
        }
        return abstractC1717o2;
    }

    public final AbstractC1717o2 findViewHolderForLayoutPosition(int i13) {
        return findViewHolderForPosition(i13, false);
    }

    @Deprecated
    public final AbstractC1717o2 findViewHolderForPosition(int i13) {
        return findViewHolderForPosition(i13, false);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0153  */
    /* JADX WARN: Code duplicated, block: B:165:0x021a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r21v0, types: [android.view.View, androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r5v9, types: [androidx.recyclerview.widget.e1] */
    /* JADX WARN: Type inference failed for: r7v7, types: [androidx.recyclerview.widget.u1] */
    public final boolean fling(int i13, int i14) {
        int iMax;
        int i15;
        ?? r18;
        boolean z4;
        boolean z13;
        int minFlingVelocity;
        boolean z14;
        AbstractC1667c1 abstractC1667c1M5238f;
        boolean z15;
        int position;
        PointF pointFComputeScrollVectorForPosition;
        int i16;
        boolean z16;
        AbstractC1740u1 abstractC1740u1 = this.mLayout;
        if (abstractC1740u1 == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (!this.mLayoutSuppressed) {
            boolean zCanScrollHorizontally = abstractC1740u1.canScrollHorizontally();
            boolean zCanScrollVertically = this.mLayout.canScrollVertically();
            int i17 = (!zCanScrollHorizontally || Math.abs(i13) < this.mMinFlingVelocity) ? 0 : i13;
            int iMax2 = (!zCanScrollVertically || Math.abs(i14) < this.mMinFlingVelocity) ? 0 : i14;
            if (i17 != 0 || iMax2 != 0) {
                if (i17 == 0) {
                    iMax = 0;
                } else {
                    EdgeEffect edgeEffect = this.mLeftGlow;
                    if (edgeEffect == null || AbstractC34870c0.m109982R(edgeEffect) == 0.0f) {
                        EdgeEffect edgeEffect2 = this.mRightGlow;
                        if (edgeEffect2 == null || AbstractC34870c0.m109982R(edgeEffect2) == 0.0f) {
                            iMax = 0;
                        } else if (m5138p(this.mRightGlow, i17, getWidth())) {
                            this.mRightGlow.onAbsorb(i17);
                            i17 = 0;
                        }
                    } else {
                        int i18 = -i17;
                        if (m5138p(this.mLeftGlow, i18, getWidth())) {
                            this.mLeftGlow.onAbsorb(i18);
                            i17 = 0;
                        }
                    }
                    iMax = i17;
                    i17 = 0;
                }
                if (iMax2 == 0) {
                    i15 = iMax2;
                    iMax2 = 0;
                } else {
                    EdgeEffect edgeEffect3 = this.mTopGlow;
                    if (edgeEffect3 == null || AbstractC34870c0.m109982R(edgeEffect3) == 0.0f) {
                        EdgeEffect edgeEffect4 = this.mBottomGlow;
                        if (edgeEffect4 == null || AbstractC34870c0.m109982R(edgeEffect4) == 0.0f) {
                            i15 = iMax2;
                            iMax2 = 0;
                        } else if (m5138p(this.mBottomGlow, iMax2, getHeight())) {
                            this.mBottomGlow.onAbsorb(iMax2);
                            iMax2 = 0;
                        }
                    } else {
                        int i19 = -iMax2;
                        if (m5138p(this.mTopGlow, i19, getHeight())) {
                            this.mTopGlow.onAbsorb(i19);
                            iMax2 = 0;
                        }
                    }
                    i15 = 0;
                }
                if (iMax != 0 || iMax2 != 0) {
                    int i24 = this.mMaxFlingVelocity;
                    iMax = Math.max(-i24, Math.min(iMax, i24));
                    int i25 = this.mMaxFlingVelocity;
                    iMax2 = Math.max(-i25, Math.min(iMax2, i25));
                    this.mViewFlinger.m5277a(iMax, iMax2);
                }
                if (i17 != 0 || i15 != 0) {
                    float f13 = i17;
                    float f14 = i15;
                    if (!dispatchNestedPreFling(f13, f14)) {
                        boolean z17 = zCanScrollHorizontally || zCanScrollVertically;
                        dispatchNestedFling(f13, f14, z17);
                        AbstractC1752x1 abstractC1752x1 = this.mOnFlingListener;
                        if (abstractC1752x1 != null) {
                            ?? r10 = (C1676e1) abstractC1752x1;
                            ?? layoutManager = r10.f6640a.getLayoutManager();
                            if (layoutManager == 0 || r10.f6640a.getAdapter() == null || ((Math.abs(i15) <= (minFlingVelocity = r10.f6640a.getMinFlingVelocity()) && Math.abs(i17) <= minFlingVelocity) || !((z14 = layoutManager instanceof InterfaceC1693i2)))) {
                                r18 = zCanScrollHorizontally;
                                z4 = false;
                                z13 = true;
                            } else {
                                View view = null;
                                C1672d1 c1672d1 = !z14 ? null : new C1672d1(r10, r10.f6640a.getContext());
                                if (c1672d1 == null) {
                                    r18 = zCanScrollHorizontally;
                                    z4 = false;
                                    z13 = true;
                                } else {
                                    int itemCount = layoutManager.getItemCount();
                                    if (itemCount != 0) {
                                        if (layoutManager.canScrollVertically()) {
                                            abstractC1667c1M5238f = r10.m5239g(layoutManager);
                                        } else {
                                            abstractC1667c1M5238f = layoutManager.canScrollHorizontally() ? r10.m5238f(layoutManager) : null;
                                        }
                                        if (abstractC1667c1M5238f == null) {
                                            z15 = zCanScrollHorizontally;
                                            z4 = false;
                                            z13 = true;
                                        } else {
                                            z4 = false;
                                            int childCount = layoutManager.getChildCount();
                                            z13 = true;
                                            View view2 = null;
                                            int i26 = Integer.MIN_VALUE;
                                            int i27 = Integer.MAX_VALUE;
                                            z15 = zCanScrollHorizontally;
                                            int i28 = 0;
                                            while (i28 < childCount) {
                                                int i29 = childCount;
                                                View childAt = layoutManager.getChildAt(i28);
                                                if (childAt == null) {
                                                    i16 = i28;
                                                } else {
                                                    i16 = i28;
                                                    int iM5233c = C1676e1.m5233c(childAt, abstractC1667c1M5238f);
                                                    if (iM5233c <= 0 && iM5233c > i26) {
                                                        i26 = iM5233c;
                                                        view2 = childAt;
                                                    }
                                                    if (iM5233c >= 0 && iM5233c < i27) {
                                                        i27 = iM5233c;
                                                        view = childAt;
                                                    }
                                                }
                                                i28 = i16 + 1;
                                                childCount = i29;
                                            }
                                            boolean z18 = !layoutManager.canScrollHorizontally() ? i15 <= 0 : i17 <= 0;
                                            if (z18 && view != null) {
                                                position = layoutManager.getPosition(view);
                                                z16 = z15;
                                            } else if (z18 || view2 == null) {
                                                if (z18) {
                                                    view = view2;
                                                }
                                                if (view != null) {
                                                    position = ((z14 && (pointFComputeScrollVectorForPosition = ((InterfaceC1693i2) layoutManager).computeScrollVectorForPosition(layoutManager.getItemCount() + (-1))) != null && ((pointFComputeScrollVectorForPosition.x > 0.0f ? 1 : (pointFComputeScrollVectorForPosition.x == 0.0f ? 0 : -1)) < 0 || (pointFComputeScrollVectorForPosition.y > 0.0f ? 1 : (pointFComputeScrollVectorForPosition.y == 0.0f ? 0 : -1)) < 0)) == z18 ? -1 : 1) + layoutManager.getPosition(view);
                                                    z16 = z15;
                                                    if (position < 0 || position >= itemCount) {
                                                    }
                                                }
                                            } else {
                                                position = layoutManager.getPosition(view2);
                                                z16 = z15;
                                            }
                                        }
                                        position = -1;
                                        z16 = z15;
                                    } else {
                                        z15 = zCanScrollHorizontally;
                                        z4 = false;
                                        z13 = true;
                                        position = -1;
                                        z16 = z15;
                                    }
                                    r18 = z16;
                                    if (position != -1) {
                                        c1672d1.f6707a = position;
                                        layoutManager.startSmoothScroll(c1672d1);
                                        return z13;
                                    }
                                }
                            }
                        } else {
                            r18 = zCanScrollHorizontally;
                            z4 = false;
                            z13 = true;
                        }
                        if (!z17) {
                            return z4;
                        }
                        boolean z19 = z13;
                        startNestedScroll(zCanScrollVertically ? r18 | 2 : r18, z19 ? 1 : 0);
                        int i34 = this.mMaxFlingVelocity;
                        int iMax3 = Math.max(-i34, Math.min(i17, i34));
                        int i35 = this.mMaxFlingVelocity;
                        this.mViewFlinger.m5277a(iMax3, Math.max(-i35, Math.min(i15, i35)));
                        return z19;
                    }
                } else if (iMax != 0 || iMax2 != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x017e, code lost:
    
        if (r16 > 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0195, code lost:
    
        if (r5 > 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0198, code lost:
    
        if (r16 < 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x019b, code lost:
    
        if (r5 < 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01a3, code lost:
    
        if ((r5 * r6) <= 0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01ab, code lost:
    
        if ((r5 * r6) >= 0) goto L146;
     */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r18, int r19) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    /* JADX INFO: renamed from: g */
    public final void m5129g(int[] iArr) {
        int iM5256e = this.mChildHelper.m5256e();
        if (iM5256e == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MIN_VALUE;
        for (int i15 = 0; i15 < iM5256e; i15++) {
            AbstractC1717o2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5255d(i15));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i13) {
                    i13 = layoutPosition;
                }
                if (layoutPosition > i14) {
                    i14 = layoutPosition;
                }
            }
        }
        iArr[0] = i13;
        iArr[1] = i14;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC1740u1 abstractC1740u1 = this.mLayout;
        if (abstractC1740u1 != null) {
            return abstractC1740u1.generateDefaultLayoutParams();
        }
        throw new IllegalStateException(AbstractC30802r.m94760i(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC1740u1 abstractC1740u1 = this.mLayout;
        if (abstractC1740u1 != null) {
            return abstractC1740u1.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException(AbstractC30802r.m94760i(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC1692i1 getAdapter() {
        return this.mAdapter;
    }

    public final int getAdapterPositionInRecyclerView(AbstractC1717o2 abstractC1717o2) {
        if (abstractC1717o2.hasAnyOfTheFlags(524) || !abstractC1717o2.isBound()) {
            return -1;
        }
        C1660b c1660b = this.mAdapterHelper;
        int i13 = abstractC1717o2.mPosition;
        ArrayList arrayList = c1660b.f6573b;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            C1655a c1655a = (C1655a) arrayList.get(i14);
            int i15 = c1655a.f6559a;
            if (i15 != 1) {
                if (i15 == 2) {
                    int i16 = c1655a.f6560b;
                    if (i16 <= i13) {
                        int i17 = c1655a.f6562d;
                        if (i16 + i17 > i13) {
                            return -1;
                        }
                        i13 -= i17;
                    } else {
                        continue;
                    }
                } else if (i15 == 8) {
                    int i18 = c1655a.f6560b;
                    if (i18 == i13) {
                        i13 = c1655a.f6562d;
                    } else {
                        if (i18 < i13) {
                            i13--;
                        }
                        if (c1655a.f6562d <= i13) {
                            i13++;
                        }
                    }
                }
            } else if (c1655a.f6560b <= i13) {
                i13 += c1655a.f6562d;
            }
        }
        return i13;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC1740u1 abstractC1740u1 = this.mLayout;
        return abstractC1740u1 != null ? abstractC1740u1.getBaseline() : super.getBaseline();
    }

    public final long getChangedHolderKey(AbstractC1717o2 abstractC1717o2) {
        return this.mAdapter.hasStableIds() ? abstractC1717o2.getItemId() : abstractC1717o2.mPosition;
    }

    public final int getChildAdapterPosition(View view) {
        AbstractC1717o2 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i13, int i14) {
        return super.getChildDrawingOrder(i13, i14);
    }

    public final long getChildItemId(View view) {
        AbstractC1717o2 childViewHolderInt;
        AbstractC1692i1 abstractC1692i1 = this.mAdapter;
        if (abstractC1692i1 == null || !abstractC1692i1.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public final int getChildLayoutPosition(View view) {
        AbstractC1717o2 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public final int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public final AbstractC1717o2 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public C1725q2 getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public final void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public AbstractC1708m1 getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public AbstractC1720p1 getItemAnimator() {
        return this.mItemAnimator;
    }

    public final Rect getItemDecorInsetsForChild(View view) {
        C1744v1 c1744v1 = (C1744v1) view.getLayoutParams();
        boolean z4 = c1744v1.f6893c;
        Rect rect = c1744v1.f6892b;
        if (!z4 || (this.mState.f6727g && (c1744v1.f6891a.isUpdated() || c1744v1.f6891a.isInvalid()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i13 = 0; i13 < size; i13++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i13).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i14 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i14 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c1744v1.f6893c = false;
        return rect;
    }

    public final AbstractC1724q1 getItemDecorationAt(int i13) {
        int itemDecorationCount = getItemDecorationCount();
        if (i13 >= 0 && i13 < itemDecorationCount) {
            return this.mItemDecorations.get(i13);
        }
        throw new IndexOutOfBoundsException(i13 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public AbstractC1740u1 getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC1752x1 getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public C1663b2 getRecycledViewPool() {
        return this.mRecycler.m5197c();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    /* JADX INFO: renamed from: h */
    public final void m5130h(int i13, int i14, MotionEvent motionEvent) {
        AbstractC1740u1 abstractC1740u1 = this.mLayout;
        if (abstractC1740u1 == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zCanScrollHorizontally = abstractC1740u1.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        int i15 = zCanScrollVertically ? (zCanScrollHorizontally ? 1 : 0) | 2 : zCanScrollHorizontally ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iM5133k = i13 - m5133k(height, i13);
        int iM5134l = i14 - m5134l(width, i14);
        startNestedScroll(i15, 1);
        if (dispatchNestedPreScroll(zCanScrollHorizontally ? iM5133k : 0, zCanScrollVertically ? iM5134l : 0, this.mReusableIntPair, this.mScrollOffset, 1)) {
            int[] iArr2 = this.mReusableIntPair;
            iM5133k -= iArr2[0];
            iM5134l -= iArr2[1];
        }
        scrollByInternal(zCanScrollHorizontally ? iM5133k : 0, zCanScrollVertically ? iM5134l : 0, motionEvent, 1);
        RunnableC1683g0 runnableC1683g0 = this.mGapWorker;
        if (runnableC1683g0 != null && (iM5133k != 0 || iM5134l != 0)) {
            runnableC1683g0.m5243a(this, iM5133k, iM5134l);
        }
        stopNestedScroll(1);
    }

    public final boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m47592e(0) != null;
    }

    public final boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.m5172g();
    }

    /* JADX INFO: renamed from: i */
    public final void m5131i(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i13 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i13);
            int x3 = (int) (motionEvent.getX(i13) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y13 = (int) (motionEvent.getY(i13) + 0.5f);
            this.mLastTouchY = y13;
            this.mInitialTouchY = y13;
        }
    }

    public final void initAdapterManager() {
        this.mAdapterHelper = new C1660b(new C1684g1(this));
    }

    public final void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException(AbstractC30802r.m94760i(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
        }
        Resources resources = getContext().getResources();
        new C1671d0(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.whoop.android.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.whoop.android.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.whoop.android.R.dimen.fastscroll_margin));
    }

    public final void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public final void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        AbstractC1740u1 abstractC1740u1 = this.mLayout;
        if (abstractC1740u1 != null) {
            abstractC1740u1.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public final boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public final boolean isAnimating() {
        AbstractC1720p1 abstractC1720p1 = this.mItemAnimator;
        return abstractC1720p1 != null && abstractC1720p1.mo5300f();
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public final boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public final boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f64860d;
    }

    /* JADX INFO: renamed from: j */
    public final void m5132j() {
        boolean z4;
        boolean z13 = false;
        if (this.mDataSetHasChangedAfterLayout) {
            C1660b c1660b = this.mAdapterHelper;
            c1660b.m5176k(c1660b.f6573b);
            c1660b.m5176k(c1660b.f6574c);
            c1660b.f6577f = 0;
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (this.mItemAnimator == null || !this.mLayout.supportsPredictiveItemAnimations()) {
            this.mAdapterHelper.m5168c();
        } else {
            this.mAdapterHelper.m5175j();
        }
        boolean z14 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f6730j = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z4 = this.mDataSetHasChangedAfterLayout) || z14 || this.mLayout.mRequestedSimpleAnimations) && (!z4 || this.mAdapter.hasStableIds());
        C1701k2 c1701k2 = this.mState;
        if (c1701k2.f6730j && z14 && !this.mDataSetHasChangedAfterLayout && this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations()) {
            z13 = true;
        }
        c1701k2.f6731k = z13;
    }

    public final void jumpToPositionForSmoothScroller(int i13) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i13);
        awakenScrollBars();
    }

    /* JADX INFO: renamed from: k */
    public final int m5133k(float f13, int i13) {
        float height = f13 / getHeight();
        float width = i13 / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f14 = 0.0f;
        if (edgeEffect == null || AbstractC34870c0.m109982R(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && AbstractC34870c0.m109982R(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float fM109995e0 = AbstractC34870c0.m109995e0(this.mRightGlow, width, height);
                    if (AbstractC34870c0.m109982R(this.mRightGlow) == 0.0f) {
                        this.mRightGlow.onRelease();
                    }
                    f14 = fM109995e0;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f15 = -AbstractC34870c0.m109995e0(this.mLeftGlow, -width, 1.0f - height);
                if (AbstractC34870c0.m109982R(this.mLeftGlow) == 0.0f) {
                    this.mLeftGlow.onRelease();
                }
                f14 = f15;
            }
            invalidate();
        }
        return Math.round(f14 * getWidth());
    }

    /* JADX INFO: renamed from: l */
    public final int m5134l(float f13, int i13) {
        float width = f13 / getWidth();
        float height = i13 / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f14 = 0.0f;
        if (edgeEffect == null || AbstractC34870c0.m109982R(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && AbstractC34870c0.m109982R(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float fM109995e0 = AbstractC34870c0.m109995e0(this.mBottomGlow, height, 1.0f - width);
                    if (AbstractC34870c0.m109982R(this.mBottomGlow) == 0.0f) {
                        this.mBottomGlow.onRelease();
                    }
                    f14 = fM109995e0;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f15 = -AbstractC34870c0.m109995e0(this.mTopGlow, -height, width);
                if (AbstractC34870c0.m109982R(this.mTopGlow) == 0.0f) {
                    this.mTopGlow.onRelease();
                }
                f14 = f15;
            }
            invalidate();
        }
        return Math.round(f14 * getHeight());
    }

    /* JADX INFO: renamed from: m */
    public final void m5135m(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C1744v1) {
            C1744v1 c1744v1 = (C1744v1) layoutParams;
            if (!c1744v1.f6893c) {
                Rect rect = c1744v1.f6892b;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    public final void markItemDecorInsetsDirty() {
        int iM5259h = this.mChildHelper.m5259h();
        for (int i13 = 0; i13 < iM5259h; i13++) {
            ((C1744v1) this.mChildHelper.m5258g(i13).getLayoutParams()).f6893c = true;
        }
        ArrayList arrayList = this.mRecycler.f6593c;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            C1744v1 c1744v1 = (C1744v1) ((AbstractC1717o2) arrayList.get(i14)).itemView.getLayoutParams();
            if (c1744v1 != null) {
                c1744v1.f6893c = true;
            }
        }
    }

    public final void markKnownViewsInvalid() {
        int iM5259h = this.mChildHelper.m5259h();
        for (int i13 = 0; i13 < iM5259h; i13++) {
            AbstractC1717o2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5258g(i13));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        C1668c2 c1668c2 = this.mRecycler;
        ArrayList arrayList = c1668c2.f6593c;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            AbstractC1717o2 abstractC1717o2 = (AbstractC1717o2) arrayList.get(i14);
            if (abstractC1717o2 != null) {
                abstractC1717o2.addFlags(6);
                abstractC1717o2.addChangePayload(null);
            }
        }
        AbstractC1692i1 abstractC1692i1 = c1668c2.f6598h.mAdapter;
        if (abstractC1692i1 == null || !abstractC1692i1.hasStableIds()) {
            c1668c2.m5200g();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m5136n() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        stopNestedScroll(0);
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            postInvalidateOnAnimation();
        }
    }

    public final void nestedScrollBy(int i13, int i14) {
        m5130h(i13, i14, null);
    }

    /* JADX INFO: renamed from: o */
    public final void m5137o(AbstractC1692i1 abstractC1692i1, boolean z4, boolean z13) {
        AbstractC1692i1 abstractC1692i2 = this.mAdapter;
        if (abstractC1692i2 != null) {
            abstractC1692i2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z4 || z13) {
            removeAndRecycleViews();
        }
        C1660b c1660b = this.mAdapterHelper;
        c1660b.m5176k(c1660b.f6573b);
        c1660b.m5176k(c1660b.f6574c);
        c1660b.f6577f = 0;
        AbstractC1692i1 abstractC1692i3 = this.mAdapter;
        this.mAdapter = abstractC1692i1;
        if (abstractC1692i1 != null) {
            abstractC1692i1.registerAdapterDataObserver(this.mObserver);
            abstractC1692i1.onAttachedToRecyclerView(this);
        }
        AbstractC1740u1 abstractC1740u1 = this.mLayout;
        if (abstractC1740u1 != null) {
            abstractC1740u1.onAdapterChanged(abstractC1692i3, this.mAdapter);
        }
        C1668c2 c1668c2 = this.mRecycler;
        AbstractC1692i1 abstractC1692i4 = this.mAdapter;
        c1668c2.f6591a.clear();
        c1668c2.m5200g();
        c1668c2.m5199f(abstractC1692i3, true);
        C1663b2 c1663b2M5197c = c1668c2.m5197c();
        if (abstractC1692i3 != null) {
            c1663b2M5197c.f6583b--;
        }
        if (!z4 && c1663b2M5197c.f6583b == 0) {
            SparseArray sparseArray = c1663b2M5197c.f6582a;
            for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                C1658a2 c1658a2 = (C1658a2) sparseArray.valueAt(i13);
                Iterator it = c1658a2.f6564a.iterator();
                while (it.hasNext()) {
                    AbstractC15751g.m44458k(((AbstractC1717o2) it.next()).itemView);
                }
                c1658a2.f6564a.clear();
            }
        }
        if (abstractC1692i4 != null) {
            c1663b2M5197c.f6583b++;
        } else {
            c1663b2M5197c.getClass();
        }
        c1668c2.m5198e();
        this.mState.f6726f = true;
    }

    public final void offsetChildrenHorizontal(int i13) {
        int iM5256e = this.mChildHelper.m5256e();
        for (int i14 = 0; i14 < iM5256e; i14++) {
            this.mChildHelper.m5255d(i14).offsetLeftAndRight(i13);
        }
    }

    public final void offsetChildrenVertical(int i13) {
        int iM5256e = this.mChildHelper.m5256e();
        for (int i14 = 0; i14 < iM5256e; i14++) {
            this.mChildHelper.m5255d(i14).offsetTopAndBottom(i13);
        }
    }

    public final void offsetPositionRecordsForInsert(int i13, int i14) {
        int iM5259h = this.mChildHelper.m5259h();
        for (int i15 = 0; i15 < iM5259h; i15++) {
            AbstractC1717o2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5258g(i15));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i13) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForInsert attached child " + i15 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition + i14));
                }
                childViewHolderInt.offsetPosition(i14, false);
                this.mState.f6726f = true;
            }
        }
        ArrayList arrayList = this.mRecycler.f6593c;
        int size = arrayList.size();
        for (int i16 = 0; i16 < size; i16++) {
            AbstractC1717o2 abstractC1717o2 = (AbstractC1717o2) arrayList.get(i16);
            if (abstractC1717o2 != null && abstractC1717o2.mPosition >= i13) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForInsert cached " + i16 + " holder " + abstractC1717o2 + " now at position " + (abstractC1717o2.mPosition + i14));
                }
                abstractC1717o2.offsetPosition(i14, false);
            }
        }
        requestLayout();
    }

    public final void offsetPositionRecordsForMove(int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        int iM5259h = this.mChildHelper.m5259h();
        int i26 = -1;
        if (i13 < i14) {
            i16 = i13;
            i15 = i14;
            i17 = -1;
        } else {
            i15 = i13;
            i16 = i14;
            i17 = 1;
        }
        for (int i27 = 0; i27 < iM5259h; i27++) {
            AbstractC1717o2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5258g(i27));
            if (childViewHolderInt != null && (i25 = childViewHolderInt.mPosition) >= i16 && i25 <= i15) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForMove attached child " + i27 + " holder " + childViewHolderInt);
                }
                if (childViewHolderInt.mPosition == i13) {
                    childViewHolderInt.offsetPosition(i14 - i13, false);
                } else {
                    childViewHolderInt.offsetPosition(i17, false);
                }
                this.mState.f6726f = true;
            }
        }
        ArrayList arrayList = this.mRecycler.f6593c;
        if (i13 < i14) {
            i19 = i13;
            i18 = i14;
        } else {
            i18 = i13;
            i26 = 1;
            i19 = i14;
        }
        int size = arrayList.size();
        for (int i28 = 0; i28 < size; i28++) {
            AbstractC1717o2 abstractC1717o2 = (AbstractC1717o2) arrayList.get(i28);
            if (abstractC1717o2 != null && (i24 = abstractC1717o2.mPosition) >= i19 && i24 <= i18) {
                if (i24 == i13) {
                    abstractC1717o2.offsetPosition(i14 - i13, false);
                } else {
                    abstractC1717o2.offsetPosition(i26, false);
                }
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForMove cached child " + i28 + " holder " + abstractC1717o2);
                }
            }
        }
        requestLayout();
    }

    public final void offsetPositionRecordsForRemove(int i13, int i14, boolean z4) {
        int i15 = i13 + i14;
        int iM5259h = this.mChildHelper.m5259h();
        for (int i16 = 0; i16 < iM5259h; i16++) {
            AbstractC1717o2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5258g(i16));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i17 = childViewHolderInt.mPosition;
                if (i17 >= i15) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove attached child " + i16 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition - i14));
                    }
                    childViewHolderInt.offsetPosition(-i14, z4);
                    this.mState.f6726f = true;
                } else if (i17 >= i13) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove attached child " + i16 + " holder " + childViewHolderInt + " now REMOVED");
                    }
                    childViewHolderInt.flagRemovedAndOffsetPosition(i13 - 1, -i14, z4);
                    this.mState.f6726f = true;
                }
            }
        }
        C1668c2 c1668c2 = this.mRecycler;
        ArrayList arrayList = c1668c2.f6593c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC1717o2 abstractC1717o2 = (AbstractC1717o2) arrayList.get(size);
            if (abstractC1717o2 != null) {
                int i18 = abstractC1717o2.mPosition;
                if (i18 >= i15) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove cached " + size + " holder " + abstractC1717o2 + " now at position " + (abstractC1717o2.mPosition - i14));
                    }
                    abstractC1717o2.offsetPosition(-i14, z4);
                } else if (i18 >= i13) {
                    abstractC1717o2.addFlags(8);
                    c1668c2.m5201h(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = this.mFirstLayoutComplete && !isLayoutRequested();
        this.mRecycler.m5198e();
        AbstractC1740u1 abstractC1740u1 = this.mLayout;
        if (abstractC1740u1 != null) {
            abstractC1740u1.dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal threadLocal = RunnableC1683g0.f6653E;
            RunnableC1683g0 runnableC1683g0 = (RunnableC1683g0) threadLocal.get();
            this.mGapWorker = runnableC1683g0;
            if (runnableC1683g0 == null) {
                RunnableC1683g0 runnableC1683g1 = new RunnableC1683g0();
                runnableC1683g1.f6655w = new ArrayList();
                runnableC1683g1.f6658z = new ArrayList();
                this.mGapWorker = runnableC1683g1;
                WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                RunnableC1683g0 runnableC1683g2 = this.mGapWorker;
                runnableC1683g2.f6657y = (long) (1.0E9f / refreshRate);
                threadLocal.set(runnableC1683g2);
            }
            ArrayList arrayList = this.mGapWorker.f6655w;
            if (sDebugAssertionsEnabled && arrayList.contains(this)) {
                throw new IllegalStateException("RecyclerView already present in worker list!");
            }
            arrayList.add(this);
        }
    }

    public final void onChildAttachedToWindow(View view) {
    }

    public final void onChildDetachedFromWindow(View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        RunnableC1683g0 runnableC1683g0;
        super.onDetachedFromWindow();
        AbstractC1720p1 abstractC1720p1 = this.mItemAnimator;
        if (abstractC1720p1 != null) {
            abstractC1720p1.mo5299e();
        }
        stopScroll();
        this.mIsAttached = false;
        AbstractC1740u1 abstractC1740u1 = this.mLayout;
        if (abstractC1740u1 != null) {
            abstractC1740u1.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        while (C1659a3.f6568d.mo43684b() != null) {
        }
        C1668c2 c1668c2 = this.mRecycler;
        ArrayList arrayList = c1668c2.f6593c;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            AbstractC15751g.m44458k(((AbstractC1717o2) arrayList.get(i13)).itemView);
        }
        c1668c2.m5199f(c1668c2.f6598h.mAdapter, false);
        C16907r0 c16907r0 = new C16907r0(this);
        while (c16907r0.hasNext()) {
            ArrayList arrayList2 = AbstractC15751g.m44422B((View) c16907r0.next()).f145162a;
            for (int iM118951C = AbstractC37056f.m118951C(arrayList2); -1 < iM118951C; iM118951C--) {
                ((C2370e3) arrayList2.get(iM118951C)).f9352a.m7235d();
            }
        }
        if (!ALLOW_THREAD_GAP_WORK || (runnableC1683g0 = this.mGapWorker) == null) {
            return;
        }
        boolean zRemove = runnableC1683g0.f6655w.remove(this);
        if (sDebugAssertionsEnabled && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i13 = 0; i13 < size; i13++) {
            this.mItemDecorations.get(i13).onDraw(canvas, this, this.mState);
        }
    }

    public final void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public final void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f13;
        float axisValue;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f13 = this.mLayout.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.mLayout.canScrollHorizontally() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.mLayout.canScrollVertically()) {
                    f13 = -axisValue2;
                } else if (this.mLayout.canScrollHorizontally()) {
                    axisValue = axisValue2;
                    f13 = 0.0f;
                } else {
                    f13 = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f13 = 0.0f;
                axisValue = 0.0f;
            }
            if (f13 != 0.0f || axisValue != 0.0f) {
                m5130h((int) (axisValue * this.mScaledHorizontalScrollFactor), (int) (f13 * this.mScaledVerticalScrollFactor), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean z13;
        if (!this.mLayoutSuppressed) {
            this.mInterceptingOnItemTouchListener = null;
            if (m5128f(motionEvent)) {
                m5136n();
                setScrollState(0);
                return true;
            }
            AbstractC1740u1 abstractC1740u1 = this.mLayout;
            if (abstractC1740u1 != null) {
                boolean zCanScrollHorizontally = abstractC1740u1.canScrollHorizontally();
                boolean zCanScrollVertically = this.mLayout.canScrollVertically();
                if (this.mVelocityTracker == null) {
                    this.mVelocityTracker = VelocityTracker.obtain();
                }
                this.mVelocityTracker.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.mIgnoreMotionEventTillDown) {
                        this.mIgnoreMotionEventTillDown = false;
                    }
                    this.mScrollPointerId = motionEvent.getPointerId(0);
                    int x3 = (int) (motionEvent.getX() + 0.5f);
                    this.mLastTouchX = x3;
                    this.mInitialTouchX = x3;
                    int y13 = (int) (motionEvent.getY() + 0.5f);
                    this.mLastTouchY = y13;
                    this.mInitialTouchY = y13;
                    EdgeEffect edgeEffect = this.mLeftGlow;
                    if (edgeEffect == null || AbstractC34870c0.m109982R(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z4 = false;
                    } else {
                        AbstractC34870c0.m109995e0(this.mLeftGlow, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z4 = true;
                    }
                    EdgeEffect edgeEffect2 = this.mRightGlow;
                    boolean z14 = z4;
                    if (edgeEffect2 != null && AbstractC34870c0.m109982R(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        z14 = z4;
                        z14 = z4;
                        AbstractC34870c0.m109995e0(this.mRightGlow, 0.0f, motionEvent.getY() / getHeight());
                        z14 = true;
                    }
                    z14 = z4;
                    z14 = z4;
                    z14 = z4;
                    EdgeEffect edgeEffect3 = this.mTopGlow;
                    boolean z15 = z14;
                    if (edgeEffect3 != null && AbstractC34870c0.m109982R(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        z15 = z14;
                        z15 = z14;
                        AbstractC34870c0.m109995e0(this.mTopGlow, 0.0f, motionEvent.getX() / getWidth());
                        z15 = true;
                    }
                    z15 = z14;
                    z15 = z14;
                    z15 = z14;
                    EdgeEffect edgeEffect4 = this.mBottomGlow;
                    boolean z16 = z15;
                    if (edgeEffect4 != null && AbstractC34870c0.m109982R(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        z16 = z15;
                        z16 = z15;
                        AbstractC34870c0.m109995e0(this.mBottomGlow, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z16 = true;
                    }
                    if (z16 || this.mScrollState == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        stopNestedScroll(1);
                    }
                    int[] iArr = this.mNestedOffsets;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i13 = zCanScrollHorizontally;
                    if (zCanScrollVertically) {
                        i13 = (zCanScrollHorizontally ? 1 : 0) | 2;
                    }
                    startNestedScroll(i13, 0);
                } else if (actionMasked == 1) {
                    this.mVelocityTracker.clear();
                    stopNestedScroll(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                    if (iFindPointerIndex < 0) {
                        Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x5 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y14 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.mScrollState != 1) {
                        int i14 = x5 - this.mInitialTouchX;
                        int i15 = y14 - this.mInitialTouchY;
                        if (!zCanScrollHorizontally || Math.abs(i14) <= this.mTouchSlop) {
                            z13 = false;
                        } else {
                            this.mLastTouchX = x5;
                            z13 = true;
                        }
                        if (zCanScrollVertically && Math.abs(i15) > this.mTouchSlop) {
                            this.mLastTouchY = y14;
                            z13 = true;
                        }
                        if (z13) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    m5136n();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                    int x9 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.mLastTouchX = x9;
                    this.mInitialTouchX = x9;
                    int y15 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.mLastTouchY = y15;
                    this.mInitialTouchY = y15;
                } else if (actionMasked == 6) {
                    m5131i(motionEvent);
                }
                if (this.mScrollState == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        int i17 = AbstractC2732k.f10742a;
        Trace.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        AbstractC1740u1 abstractC1740u1 = this.mLayout;
        if (abstractC1740u1 == null) {
            defaultOnMeasure(i13, i14);
            return;
        }
        boolean z4 = false;
        if (abstractC1740u1.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i13);
            int mode2 = View.MeasureSpec.getMode(i14);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i13, i14);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z4 = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z4;
            if (z4 || this.mAdapter == null) {
                return;
            }
            if (this.mState.f6724d == 1) {
                m5126d();
            }
            this.mLayout.setMeasureSpecs(i13, i14);
            this.mState.f6729i = true;
            m5127e();
            this.mLayout.setMeasuredDimensionFromChildren(i13, i14);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f6729i = true;
                m5127e();
                this.mLayout.setMeasuredDimensionFromChildren(i13, i14);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i13, i14);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            m5132j();
            onExitLayoutOrScroll(true);
            C1701k2 c1701k2 = this.mState;
            if (c1701k2.f6731k) {
                c1701k2.f6727g = true;
            } else {
                this.mAdapterHelper.m5168c();
                this.mState.f6727g = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f6731k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC1692i1 abstractC1692i1 = this.mAdapter;
        if (abstractC1692i1 != null) {
            this.mState.f6725e = abstractC1692i1.getPageCount();
        } else {
            this.mState.f6725e = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i13, i14);
        stopInterceptRequestLayout(false);
        this.mState.f6727g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i13, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i13, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1685g2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1685g2 c1685g2 = (C1685g2) parcelable;
        this.mPendingSavedState = c1685g2;
        super.onRestoreInstanceState(c1685g2.m113141b());
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1685g2 c1685g2 = new C1685g2(super.onSaveInstanceState());
        C1685g2 c1685g3 = this.mPendingSavedState;
        if (c1685g3 != null) {
            c1685g2.f6660y = c1685g3.f6660y;
            return c1685g2;
        }
        AbstractC1740u1 abstractC1740u1 = this.mLayout;
        if (abstractC1740u1 != null) {
            c1685g2.f6660y = abstractC1740u1.onSaveInstanceState();
            return c1685g2;
        }
        c1685g2.f6660y = null;
        return c1685g2;
    }

    public final void onScrollStateChanged(int i13) {
    }

    public final void onScrolled(int i13, int i14) {
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        if (i13 == i15 && i14 == i16) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00ff A[PHI: r1
      0x00ff: PHI (r1v50 int) = (r1v30 int), (r1v54 int) binds: [B:50:0x00e8, B:54:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM5128f;
        int i13;
        boolean z4;
        if (!this.mLayoutSuppressed && !this.mIgnoreMotionEventTillDown) {
            InterfaceC1756y1 interfaceC1756y1 = this.mInterceptingOnItemTouchListener;
            if (interfaceC1756y1 == null) {
                zM5128f = motionEvent.getAction() == 0 ? false : m5128f(motionEvent);
            } else {
                interfaceC1756y1.onTouchEvent(motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.mInterceptingOnItemTouchListener = null;
                }
                zM5128f = true;
            }
            if (zM5128f) {
                m5136n();
                setScrollState(0);
                return true;
            }
            AbstractC1740u1 abstractC1740u1 = this.mLayout;
            if (abstractC1740u1 != null) {
                boolean zCanScrollHorizontally = abstractC1740u1.canScrollHorizontally();
                boolean zCanScrollVertically = this.mLayout.canScrollVertically();
                if (this.mVelocityTracker == null) {
                    this.mVelocityTracker = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    int[] iArr = this.mNestedOffsets;
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                int[] iArr2 = this.mNestedOffsets;
                motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
                if (actionMasked != 0) {
                    if (actionMasked == 1) {
                        this.mVelocityTracker.addMovement(motionEventObtain);
                        this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxFlingVelocity);
                        float f13 = zCanScrollHorizontally ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
                        float f14 = zCanScrollVertically ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
                        if ((f13 == 0.0f && f14 == 0.0f) || !fling((int) f13, (int) f14)) {
                            setScrollState(0);
                        }
                        m5136n();
                    } else if (actionMasked == 2) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                        if (iFindPointerIndex < 0) {
                            Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x3 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y13 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        int iMax = this.mLastTouchX - x3;
                        int iMax2 = this.mLastTouchY - y13;
                        if (this.mScrollState != 1) {
                            if (zCanScrollHorizontally) {
                                iMax = iMax > 0 ? Math.max(0, iMax - this.mTouchSlop) : Math.min(0, iMax + this.mTouchSlop);
                                if (iMax != 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                            } else {
                                z4 = false;
                            }
                            if (zCanScrollVertically) {
                                iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.mTouchSlop) : Math.min(0, iMax2 + this.mTouchSlop);
                                if (iMax2 != 0) {
                                    z4 = true;
                                }
                            }
                            if (z4) {
                                setScrollState(1);
                            }
                        }
                        if (this.mScrollState == 1) {
                            int[] iArr3 = this.mReusableIntPair;
                            iArr3[0] = 0;
                            iArr3[1] = 0;
                            int iM5133k = iMax - m5133k(motionEvent.getY(), iMax);
                            int iM5134l = iMax2 - m5134l(motionEvent.getX(), iMax2);
                            if (dispatchNestedPreScroll(zCanScrollHorizontally ? iM5133k : 0, zCanScrollVertically ? iM5134l : 0, this.mReusableIntPair, this.mScrollOffset, 0)) {
                                int[] iArr4 = this.mReusableIntPair;
                                iM5133k -= iArr4[0];
                                iM5134l -= iArr4[1];
                                int[] iArr5 = this.mNestedOffsets;
                                int i14 = iArr5[0];
                                int[] iArr6 = this.mScrollOffset;
                                iArr5[0] = i14 + iArr6[0];
                                iArr5[1] = iArr5[1] + iArr6[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int[] iArr7 = this.mScrollOffset;
                            this.mLastTouchX = x3 - iArr7[0];
                            this.mLastTouchY = y13 - iArr7[1];
                            if (scrollByInternal(zCanScrollHorizontally ? iM5133k : 0, zCanScrollVertically ? iM5134l : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            RunnableC1683g0 runnableC1683g0 = this.mGapWorker;
                            if (runnableC1683g0 != null && (iM5133k != 0 || iM5134l != 0)) {
                                runnableC1683g0.m5243a(this, iM5133k, iM5134l);
                            }
                        }
                    } else if (actionMasked == 3) {
                        m5136n();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                        int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.mLastTouchX = x5;
                        this.mInitialTouchX = x5;
                        int y14 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.mLastTouchY = y14;
                        this.mInitialTouchY = y14;
                    } else if (actionMasked == 6) {
                        m5131i(motionEvent);
                    }
                    motionEventObtain.recycle();
                    return true;
                }
                this.mScrollPointerId = motionEvent.getPointerId(0);
                int x9 = (int) (motionEvent.getX() + 0.5f);
                this.mLastTouchX = x9;
                this.mInitialTouchX = x9;
                int y15 = (int) (motionEvent.getY() + 0.5f);
                this.mLastTouchY = y15;
                this.mInitialTouchY = y15;
                if (zCanScrollVertically) {
                    i13 = zCanScrollHorizontally;
                    i13 = (zCanScrollHorizontally ? 1 : 0) | 2;
                }
                i13 = zCanScrollHorizontally;
                startNestedScroll(i13, 0);
                this.mVelocityTracker.addMovement(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m5138p(EdgeEffect edgeEffect, int i13, int i14) {
        if (i13 > 0) {
            return true;
        }
        float fM109982R = AbstractC34870c0.m109982R(edgeEffect) * i14;
        double dLog = Math.log((Math.abs(-i13) * INFLEXION) / (this.mPhysicalCoef * SCROLL_FRICTION));
        double d3 = DECELERATION_RATE;
        return ((float) (Math.exp((d3 / (d3 - 1.0d)) * dLog) * ((double) (this.mPhysicalCoef * SCROLL_FRICTION)))) < fM109982R;
    }

    public final void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        Runnable runnable = this.mItemAnimatorRunner;
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        postOnAnimation(runnable);
        this.mPostedAnimatorRunner = true;
    }

    public final void processDataSetCompletelyChanged(boolean z4) {
        this.mDispatchItemsChangedEvent = z4 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public final void recordAnimationInfoIfBouncedHiddenView(AbstractC1717o2 abstractC1717o2, C1716o1 c1716o1) {
        abstractC1717o2.setFlags(0, DfuBaseService.ERROR_REMOTE_MASK);
        if (this.mState.f6728h && abstractC1717o2.isUpdated() && !abstractC1717o2.isRemoved() && !abstractC1717o2.shouldIgnore()) {
            this.mViewInfoStore.f6600b.m155g(getChangedHolderKey(abstractC1717o2), abstractC1717o2);
        }
        C0021f1 c0021f1 = this.mViewInfoStore.f6599a;
        C1659a3 c1659a3M5165a = (C1659a3) c0021f1.get(abstractC1717o2);
        if (c1659a3M5165a == null) {
            c1659a3M5165a = C1659a3.m5165a();
            c0021f1.put(abstractC1717o2, c1659a3M5165a);
        }
        c1659a3M5165a.f6570b = c1716o1;
        c1659a3M5165a.f6569a |= 4;
    }

    public final void removeAndRecycleViews() {
        AbstractC1720p1 abstractC1720p1 = this.mItemAnimator;
        if (abstractC1720p1 != null) {
            abstractC1720p1.mo5299e();
        }
        AbstractC1740u1 abstractC1740u1 = this.mLayout;
        if (abstractC1740u1 != null) {
            abstractC1740u1.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        C1668c2 c1668c2 = this.mRecycler;
        c1668c2.f6591a.clear();
        c1668c2.m5200g();
    }

    public final boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        C1694j c1694j = this.mChildHelper;
        C1053d c1053d = c1694j.f6687b;
        C1684g1 c1684g1 = c1694j.f6686a;
        int i13 = c1694j.f6689d;
        boolean z4 = false;
        if (i13 == 1) {
            if (c1694j.f6690e != view) {
                throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
            }
        } else {
            if (i13 == 2) {
                throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
            }
            try {
                c1694j.f6689d = 2;
                int iIndexOfChild = c1684g1.f6659a.indexOfChild(view);
                if (iIndexOfChild == -1) {
                    c1694j.m5263l(view);
                } else if (c1053d.m3084I(iIndexOfChild)) {
                    c1053d.m3087L(iIndexOfChild);
                    c1694j.m5263l(view);
                    c1684g1.m5247c(iIndexOfChild);
                } else {
                    c1694j.f6689d = 0;
                }
                c1694j.f6689d = 0;
                z4 = true;
            } catch (Throwable th3) {
                c1694j.f6689d = 0;
                throw th3;
            }
        }
        if (z4) {
            AbstractC1717o2 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.m5206m(childViewHolderInt);
            this.mRecycler.m5203j(childViewHolderInt);
            if (sVerboseLoggingEnabled) {
                Log.d(TAG, "after removing animated view: " + view + ", " + this);
            }
        }
        stopInterceptRequestLayout(!z4);
        return z4;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z4) {
        AbstractC1717o2 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb4 = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb4.append(childViewHolderInt);
                throw new IllegalArgumentException(AbstractC30802r.m94760i(this, sb4));
            }
        } else if (sDebugAssertionsEnabled) {
            StringBuilder sb5 = new StringBuilder("No ViewHolder found for child: ");
            sb5.append(view);
            throw new IllegalArgumentException(AbstractC30802r.m94760i(this, sb5));
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z4);
    }

    public final void removeItemDecoration(AbstractC1724q1 abstractC1724q1) {
        AbstractC1740u1 abstractC1740u1 = this.mLayout;
        if (abstractC1740u1 != null) {
            abstractC1740u1.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(abstractC1724q1);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public final void removeItemDecorationAt(int i13) {
        int itemDecorationCount = getItemDecorationCount();
        if (i13 >= 0 && i13 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i13));
            return;
        }
        throw new IndexOutOfBoundsException(i13 + " is an invalid index for size " + itemDecorationCount);
    }

    public final void removeOnChildAttachStateChangeListener(InterfaceC1748w1 interfaceC1748w1) {
        List<InterfaceC1748w1> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(interfaceC1748w1);
    }

    public final void removeOnItemTouchListener(InterfaceC1756y1 interfaceC1756y1) {
        this.mOnItemTouchListeners.remove(interfaceC1756y1);
        if (this.mInterceptingOnItemTouchListener == interfaceC1756y1) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public final void removeOnScrollListener(AbstractC1760z1 abstractC1760z1) {
        List<AbstractC1760z1> list = this.mScrollListeners;
        if (list != null) {
            list.remove(abstractC1760z1);
        }
    }

    public final void removeRecyclerListener(InterfaceC1673d2 interfaceC1673d2) {
        this.mRecyclerListeners.remove(interfaceC1673d2);
    }

    public final void repositionShadowingViews() {
        AbstractC1717o2 abstractC1717o2;
        int iM5256e = this.mChildHelper.m5256e();
        for (int i13 = 0; i13 < iM5256e; i13++) {
            View viewM5255d = this.mChildHelper.m5255d(i13);
            AbstractC1717o2 childViewHolder = getChildViewHolder(viewM5255d);
            if (childViewHolder != null && (abstractC1717o2 = childViewHolder.mShadowingHolder) != null) {
                View view = abstractC1717o2.itemView;
                int left = viewM5255d.getLeft();
                int top = viewM5255d.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            m5135m(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        int size = this.mOnItemTouchListeners.size();
        for (int i13 = 0; i13 < size; i13++) {
            this.mOnItemTouchListeners.get(i13).mo5223d(z4);
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public final void saveOldPositions() {
        int iM5259h = this.mChildHelper.m5259h();
        for (int i13 = 0; i13 < iM5259h; i13++) {
            AbstractC1717o2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5258g(i13));
            if (sDebugAssertionsEnabled && childViewHolderInt.mPosition == -1 && !childViewHolderInt.isRemoved()) {
                throw new IllegalStateException(AbstractC30802r.m94760i(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
            }
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i13, int i14) {
        AbstractC1740u1 abstractC1740u1 = this.mLayout;
        if (abstractC1740u1 == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean zCanScrollHorizontally = abstractC1740u1.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (zCanScrollHorizontally || zCanScrollVertically) {
            if (!zCanScrollHorizontally) {
                i13 = 0;
            }
            if (!zCanScrollVertically) {
                i14 = 0;
            }
            scrollByInternal(i13, i14, null, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:36:0x0107 A[DONT_INVERT, PHI: r7
      0x0107: PHI (r7v10 boolean) = (r7v8 boolean), (r7v11 boolean) binds: [B:34:0x00ee, B:32:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0109  */
    /* JADX WARN: Code duplicated, block: B:41:0x0111  */
    public final boolean scrollByInternal(int i13, int i14, MotionEvent motionEvent, int i15) {
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z4;
        boolean z13;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i13, i14, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i24 = iArr2[0];
            int i25 = iArr2[1];
            i18 = i13 - i24;
            i19 = i14 - i25;
            i17 = i25;
            i16 = i24;
        } else {
            i16 = 0;
            i17 = 0;
            i18 = 0;
            i19 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i16, i17, i18, i19, this.mScrollOffset, i15, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i26 = iArr4[0];
        int i27 = i18 - i26;
        int i28 = iArr4[1];
        int i29 = i19 - i28;
        boolean z14 = (i26 == 0 && i28 == 0) ? false : true;
        int i34 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i35 = iArr5[0];
        this.mLastTouchX = i34 - i35;
        int i36 = this.mLastTouchY;
        int i37 = iArr5[1];
        this.mLastTouchY = i36 - i37;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i35;
        iArr6[1] = iArr6[1] + i37;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || (motionEvent.getSource() & 8194) == 8194) {
                z4 = true;
            } else {
                float x3 = motionEvent.getX();
                float f13 = i27;
                float y13 = motionEvent.getY();
                float f14 = i29;
                if (f13 < 0.0f) {
                    ensureLeftGlow();
                    z4 = true;
                    AbstractC34870c0.m109995e0(this.mLeftGlow, (-f13) / getWidth(), 1.0f - (y13 / getHeight()));
                } else {
                    z4 = true;
                    if (f13 > 0.0f) {
                        ensureRightGlow();
                        AbstractC34870c0.m109995e0(this.mRightGlow, f13 / getWidth(), y13 / getHeight());
                    } else {
                        z13 = false;
                    }
                    if (f14 < 0.0f) {
                        ensureTopGlow();
                        AbstractC34870c0.m109995e0(this.mTopGlow, (-f14) / getHeight(), x3 / getWidth());
                    } else if (f14 > 0.0f) {
                        ensureBottomGlow();
                        AbstractC34870c0.m109995e0(this.mBottomGlow, f14 / getHeight(), 1.0f - (x3 / getWidth()));
                    } else if (z13 || f13 != 0.0f || f14 != 0.0f) {
                        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                        postInvalidateOnAnimation();
                    }
                    z13 = z4;
                    if (z13) {
                        WeakHashMap weakHashMap2 = AbstractC16901p0.f64851a;
                        postInvalidateOnAnimation();
                    } else {
                        WeakHashMap weakHashMap3 = AbstractC16901p0.f64851a;
                        postInvalidateOnAnimation();
                    }
                }
                z13 = z4;
                if (f14 < 0.0f) {
                    ensureTopGlow();
                    AbstractC34870c0.m109995e0(this.mTopGlow, (-f14) / getHeight(), x3 / getWidth());
                } else if (f14 > 0.0f) {
                    ensureBottomGlow();
                    AbstractC34870c0.m109995e0(this.mBottomGlow, f14 / getHeight(), 1.0f - (x3 / getWidth()));
                } else if (z13) {
                    WeakHashMap weakHashMap4 = AbstractC16901p0.f64851a;
                    postInvalidateOnAnimation();
                } else {
                    WeakHashMap weakHashMap5 = AbstractC16901p0.f64851a;
                    postInvalidateOnAnimation();
                }
                z13 = z4;
                if (z13) {
                    WeakHashMap weakHashMap6 = AbstractC16901p0.f64851a;
                    postInvalidateOnAnimation();
                } else {
                    WeakHashMap weakHashMap7 = AbstractC16901p0.f64851a;
                    postInvalidateOnAnimation();
                }
            }
            considerReleasingGlowsOnScroll(i13, i14);
        } else {
            z4 = true;
        }
        if (i16 != 0 || i17 != 0) {
            dispatchOnScrolled(i16, i17);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z14 && i16 == 0 && i17 == 0) {
            return false;
        }
        return z4;
    }

    public final void scrollStep(int i13, int i14, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        int i15 = AbstractC2732k.f10742a;
        Trace.beginSection(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int iScrollHorizontallyBy = i13 != 0 ? this.mLayout.scrollHorizontallyBy(i13, this.mRecycler, this.mState) : 0;
        int iScrollVerticallyBy = i14 != 0 ? this.mLayout.scrollVerticallyBy(i14, this.mRecycler, this.mState) : 0;
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll(true);
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = iScrollHorizontallyBy;
            iArr[1] = iScrollVerticallyBy;
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i13, int i14) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public final void scrollToPosition(int i13) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        AbstractC1740u1 abstractC1740u1 = this.mLayout;
        if (abstractC1740u1 == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC1740u1.scrollToPosition(i13);
            awakenScrollBars();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C1725q2 c1725q2) {
        this.mAccessibilityDelegate = c1725q2;
        AbstractC16901p0.m47583n(this, c1725q2);
    }

    public void setAdapter(AbstractC1692i1 abstractC1692i1) {
        setLayoutFrozen(false);
        m5137o(abstractC1692i1, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC1704l1 interfaceC1704l1) {
        if (interfaceC1704l1 == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = interfaceC1704l1;
        setChildrenDrawingOrderEnabled(interfaceC1704l1 != null);
    }

    public final boolean setChildImportantForAccessibilityInternal(AbstractC1717o2 abstractC1717o2, int i13) {
        if (isComputingLayout()) {
            abstractC1717o2.mPendingAccessibilityState = i13;
            this.mPendingAccessibilityImportanceChange.add(abstractC1717o2);
            return false;
        }
        View view = abstractC1717o2.itemView;
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        view.setImportantForAccessibility(i13);
        return true;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z4) {
        if (z4 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z4;
        super.setClipToPadding(z4);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(AbstractC1708m1 abstractC1708m1) {
        abstractC1708m1.getClass();
        this.mEdgeEffectFactory = abstractC1708m1;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z4) {
        this.mHasFixedSize = z4;
    }

    public void setItemAnimator(AbstractC1720p1 abstractC1720p1) {
        AbstractC1720p1 abstractC1720p2 = this.mItemAnimator;
        if (abstractC1720p2 != null) {
            abstractC1720p2.mo5299e();
            this.mItemAnimator.f6802a = null;
        }
        this.mItemAnimator = abstractC1720p1;
        if (abstractC1720p1 != null) {
            abstractC1720p1.f6802a = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int i13) {
        C1668c2 c1668c2 = this.mRecycler;
        c1668c2.f6595e = i13;
        c1668c2.m5207n();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z4) {
        suppressLayout(z4);
    }

    public void setLayoutManager(AbstractC1740u1 abstractC1740u1) {
        if (abstractC1740u1 == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            AbstractC1720p1 abstractC1720p1 = this.mItemAnimator;
            if (abstractC1720p1 != null) {
                abstractC1720p1.mo5299e();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            C1668c2 c1668c2 = this.mRecycler;
            c1668c2.f6591a.clear();
            c1668c2.m5200g();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            C1668c2 c1668c3 = this.mRecycler;
            c1668c3.f6591a.clear();
            c1668c3.m5200g();
        }
        C1694j c1694j = this.mChildHelper;
        RecyclerView recyclerView = c1694j.f6686a.f6659a;
        c1694j.f6687b.m3088M();
        ArrayList arrayList = c1694j.f6688c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC1717o2 childViewHolderInt = getChildViewHolderInt((View) arrayList.get(size));
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(recyclerView);
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = recyclerView.getChildAt(i13);
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.mLayout = abstractC1740u1;
        if (abstractC1740u1 != null) {
            if (abstractC1740u1.mRecyclerView != null) {
                StringBuilder sb4 = new StringBuilder("LayoutManager ");
                sb4.append(abstractC1740u1);
                sb4.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(AbstractC30802r.m94760i(abstractC1740u1.mRecyclerView, sb4));
            }
            abstractC1740u1.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.m5207n();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z4) {
        C16903q scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f64860d) {
            ViewGroup viewGroup = scrollingChildHelper.f64859c;
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            AbstractC16877h0.m47519n(viewGroup);
        }
        scrollingChildHelper.f64860d = z4;
    }

    public void setOnFlingListener(AbstractC1752x1 abstractC1752x1) {
        this.mOnFlingListener = abstractC1752x1;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC1760z1 abstractC1760z1) {
        this.mScrollListener = abstractC1760z1;
    }

    public void setPreserveFocusAfterLayout(boolean z4) {
        this.mPreserveFocusAfterLayout = z4;
    }

    public void setRecycledViewPool(C1663b2 c1663b2) {
        C1668c2 c1668c2 = this.mRecycler;
        RecyclerView recyclerView = c1668c2.f6598h;
        c1668c2.m5199f(recyclerView.mAdapter, false);
        C1663b2 c1663b3 = c1668c2.f6597g;
        if (c1663b3 != null) {
            c1663b3.f6583b--;
        }
        c1668c2.f6597g = c1663b2;
        if (c1663b2 != null && recyclerView.getAdapter() != null) {
            c1668c2.f6597g.f6583b++;
        }
        c1668c2.m5198e();
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC1673d2 interfaceC1673d2) {
    }

    public void setScrollState(int i13) {
        if (i13 == this.mScrollState) {
            return;
        }
        if (sVerboseLoggingEnabled) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "setting scroll state to ", " from ");
            sbM30466t.append(this.mScrollState);
            Log.d(TAG, sbM30466t.toString(), new Exception());
        }
        this.mScrollState = i13;
        if (i13 != 2) {
            RunnableC1713n2 runnableC1713n2 = this.mViewFlinger;
            runnableC1713n2.f6756G.removeCallbacks(runnableC1713n2);
            runnableC1713n2.f6759y.abortAnimation();
            AbstractC1740u1 abstractC1740u1 = this.mLayout;
            if (abstractC1740u1 != null) {
                abstractC1740u1.stopSmoothScroller();
            }
        }
        dispatchOnScrollStateChanged(i13);
    }

    public void setScrollingTouchSlop(int i13) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i13 != 0) {
            if (i13 == 1) {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i13 + "; using default value");
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC1709m2 abstractC1709m2) {
        this.mRecycler.getClass();
    }

    public final boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
        this.mEatenAccessibilityChangeFlags |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        return true;
    }

    public final void smoothScrollBy(int i13, int i14) {
        smoothScrollBy(i13, i14, null);
    }

    public final void smoothScrollToPosition(int i13) {
        if (this.mLayoutSuppressed) {
            return;
        }
        AbstractC1740u1 abstractC1740u1 = this.mLayout;
        if (abstractC1740u1 == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC1740u1.smoothScrollToPosition(this, this.mState, i13);
        }
    }

    public final void startInterceptRequestLayout() {
        int i13 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i13;
        if (i13 != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i13) {
        return getScrollingChildHelper().m47593f(i13, 0);
    }

    public final void stopInterceptRequestLayout(boolean z4) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            if (sDebugAssertionsEnabled) {
                throw new IllegalStateException(AbstractC30802r.m94760i(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z4 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z4 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().m47594g(0);
    }

    public final void stopScroll() {
        setScrollState(0);
        RunnableC1713n2 runnableC1713n2 = this.mViewFlinger;
        runnableC1713n2.f6756G.removeCallbacks(runnableC1713n2);
        runnableC1713n2.f6759y.abortAnimation();
        AbstractC1740u1 abstractC1740u1 = this.mLayout;
        if (abstractC1740u1 != null) {
            abstractC1740u1.stopSmoothScroller();
        }
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z4) {
        if (z4 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z4) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public final void swapAdapter(AbstractC1692i1 abstractC1692i1, boolean z4) {
        setLayoutFrozen(false);
        m5137o(abstractC1692i1, true, z4);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public final void viewRangeUpdate(int i13, int i14, Object obj) {
        int i15;
        int i16;
        int iM5259h = this.mChildHelper.m5259h();
        int i17 = i14 + i13;
        for (int i18 = 0; i18 < iM5259h; i18++) {
            View viewM5258g = this.mChildHelper.m5258g(i18);
            AbstractC1717o2 childViewHolderInt = getChildViewHolderInt(viewM5258g);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i16 = childViewHolderInt.mPosition) >= i13 && i16 < i17) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((C1744v1) viewM5258g.getLayoutParams()).f6893c = true;
            }
        }
        C1668c2 c1668c2 = this.mRecycler;
        ArrayList arrayList = c1668c2.f6593c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC1717o2 abstractC1717o2 = (AbstractC1717o2) arrayList.get(size);
            if (abstractC1717o2 != null && (i15 = abstractC1717o2.mPosition) >= i13 && i15 < i17) {
                abstractC1717o2.addFlags(2);
                c1668c2.m5201h(size);
            }
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i13) {
        Constructor constructor;
        super(context, attributeSet, i13);
        this.mObserver = new C1677e2(this);
        this.mRecycler = new C1668c2(this);
        this.mViewInfoStore = new C1669c3();
        this.mUpdateChildViewsRunnable = new RunnableC1680f1(this, 0);
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        C1722q c1722q = new C1722q();
        Object[] objArr = null;
        c1722q.f6802a = null;
        c1722q.f6803b = new ArrayList();
        c1722q.f6804c = 120L;
        c1722q.f6805d = 120L;
        c1722q.f6806e = 250L;
        c1722q.f6807f = 250L;
        int i14 = 1;
        c1722q.f6811g = true;
        c1722q.f6812h = new ArrayList();
        c1722q.f6813i = new ArrayList();
        c1722q.f6814j = new ArrayList();
        c1722q.f6815k = new ArrayList();
        c1722q.f6816l = new ArrayList();
        c1722q.f6817m = new ArrayList();
        c1722q.f6818n = new ArrayList();
        c1722q.f6819o = new ArrayList();
        c1722q.f6820p = new ArrayList();
        c1722q.f6821q = new ArrayList();
        c1722q.f6822r = new ArrayList();
        this.mItemAnimator = c1722q;
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new RunnableC1713n2(this);
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new C1675e0() : null;
        C1701k2 c1701k2 = new C1701k2();
        c1701k2.f6721a = -1;
        c1701k2.f6722b = 0;
        c1701k2.f6723c = 0;
        c1701k2.f6724d = 1;
        c1701k2.f6725e = 0;
        c1701k2.f6726f = false;
        c1701k2.f6727g = false;
        c1701k2.f6728h = false;
        c1701k2.f6729i = false;
        c1701k2.f6730j = false;
        c1701k2.f6731k = false;
        this.mState = c1701k2;
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new C1684g1(this);
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new RunnableC1680f1(this, i14);
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new C1684g1(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = viewConfiguration.getScaledHorizontalScrollFactor();
        this.mScaledVerticalScrollFactor = viewConfiguration.getScaledVerticalScrollFactor();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.f6802a = this.mItemAnimatorListener;
        initAdapterManager();
        this.mChildHelper = new C1694j(new C1684g1(this));
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        if (AbstractC16886k0.m47547a(this) == 0) {
            AbstractC16886k0.m47548b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C1725q2(this));
        int[] iArr = AbstractC21531a.f82579a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i13, 0);
        AbstractC16901p0.m47582m(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i13);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION);
        }
        this.mClipToPadding = typedArrayObtainStyledAttributes.getBoolean(1, true);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(3, false);
        this.mEnableFastScroller = z4;
        if (z4) {
            initFastScroller((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6), typedArrayObtainStyledAttributes.getDrawable(7), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4), typedArrayObtainStyledAttributes.getDrawable(5));
        }
        typedArrayObtainStyledAttributes.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(strTrim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC1740u1.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i13), 0};
                    } catch (NoSuchMethodException e5) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e13) {
                            e13.initCause(e5);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strTrim, e13);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((AbstractC1740u1) constructor.newInstance(objArr));
                } catch (ClassCastException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strTrim, e14);
                } catch (ClassNotFoundException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strTrim, e15);
                } catch (IllegalAccessException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strTrim, e16);
                } catch (InstantiationException e17) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e17);
                } catch (InvocationTargetException e18) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e18);
                }
            }
        }
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i13, 0);
        AbstractC16901p0.m47582m(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i13);
        boolean z13 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z13);
        setTag(com.whoop.android.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x0038 A[SYNTHETIC] */
    public final AbstractC1717o2 findViewHolderForPosition(int i13, boolean z4) {
        C1694j c1694j;
        int iM5259h = this.mChildHelper.m5259h();
        AbstractC1717o2 abstractC1717o2 = null;
        for (int i14 = 0; i14 < iM5259h; i14++) {
            AbstractC1717o2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5258g(i14));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z4) {
                    if (childViewHolderInt.mPosition != i13) {
                        continue;
                    } else {
                        c1694j = this.mChildHelper;
                        if (c1694j.f6688c.contains(childViewHolderInt.itemView)) {
                            return childViewHolderInt;
                        }
                        abstractC1717o2 = childViewHolderInt;
                    }
                } else if (childViewHolderInt.getLayoutPosition() != i13) {
                    continue;
                } else {
                    c1694j = this.mChildHelper;
                    if (c1694j.f6688c.contains(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    abstractC1717o2 = childViewHolderInt;
                }
            }
        }
        return abstractC1717o2;
    }

    public final void onExitLayoutOrScroll(boolean z4) {
        int i13 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i13;
        if (i13 < 1) {
            if (sDebugAssertionsEnabled && i13 < 0) {
                throw new IllegalStateException(AbstractC30802r.m94760i(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.mLayoutOrScrollCounter = 0;
            if (z4) {
                int i14 = this.mEatenAccessibilityChangeFlags;
                this.mEatenAccessibilityChangeFlags = 0;
                if (i14 != 0 && isAccessibilityEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS);
                    accessibilityEventObtain.setContentChangeTypes(i14);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public final void smoothScrollBy(int i13, int i14, Interpolator interpolator) {
        smoothScrollBy(i13, i14, interpolator, Integer.MIN_VALUE, false);
    }

    public final boolean dispatchNestedPreScroll(int i13, int i14, int[] iArr, int[] iArr2, int i15) {
        return getScrollingChildHelper().m47590c(i13, i14, iArr, iArr2, i15);
    }

    public final boolean dispatchNestedScroll(int i13, int i14, int i15, int i16, int[] iArr, int i17) {
        return getScrollingChildHelper().m47591d(i13, i14, i15, i16, iArr, i17, null);
    }

    public final boolean hasNestedScrollingParent(int i13) {
        return getScrollingChildHelper().m47592e(i13) != null;
    }

    public final void smoothScrollBy(int i13, int i14, Interpolator interpolator, int i15) {
        smoothScrollBy(i13, i14, interpolator, i15, false);
    }

    public final boolean startNestedScroll(int i13, int i14) {
        return getScrollingChildHelper().m47593f(i13, i14);
    }

    public final void stopNestedScroll(int i13) {
        getScrollingChildHelper().m47594g(i13);
    }

    public final void smoothScrollBy(int i13, int i14, Interpolator interpolator, int i15, boolean z4) {
        AbstractC1740u1 abstractC1740u1 = this.mLayout;
        if (abstractC1740u1 == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!abstractC1740u1.canScrollHorizontally()) {
            i13 = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i14 = 0;
        }
        if (i13 == 0 && i14 == 0) {
            return;
        }
        if (i15 != Integer.MIN_VALUE && i15 <= 0) {
            scrollBy(i13, i14);
            return;
        }
        if (z4) {
            int i16 = i13 != 0 ? 1 : 0;
            if (i14 != 0) {
                i16 |= 2;
            }
            startNestedScroll(i16, 1);
        }
        this.mViewFlinger.m5279c(i13, i14, interpolator, i15);
    }

    public final void dispatchNestedScroll(int i13, int i14, int i15, int i16, int[] iArr, int i17, int[] iArr2) {
        getScrollingChildHelper().m47591d(i13, i14, i15, i16, iArr, i17, iArr2);
    }

    public final void addItemDecoration(AbstractC1724q1 abstractC1724q1) {
        addItemDecoration(abstractC1724q1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC1740u1 abstractC1740u1 = this.mLayout;
        if (abstractC1740u1 != null) {
            return abstractC1740u1.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException(AbstractC30802r.m94760i(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
