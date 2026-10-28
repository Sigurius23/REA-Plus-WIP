package androidx.recyclerview.widget;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.WeakHashMap;
import live.hms.video.error.ErrorCodes;
import p184h5.AbstractC16901p0;

/* JADX INFO: renamed from: androidx.recyclerview.widget.n2 */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC1713n2 implements Runnable {

    /* JADX INFO: renamed from: E */
    public boolean f6754E;

    /* JADX INFO: renamed from: F */
    public boolean f6755F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ RecyclerView f6756G;

    /* JADX INFO: renamed from: w */
    public int f6757w;

    /* JADX INFO: renamed from: x */
    public int f6758x;

    /* JADX INFO: renamed from: y */
    public OverScroller f6759y;

    /* JADX INFO: renamed from: z */
    public Interpolator f6760z;

    public RunnableC1713n2(RecyclerView recyclerView) {
        this.f6756G = recyclerView;
        Interpolator interpolator = RecyclerView.sQuinticInterpolator;
        this.f6760z = interpolator;
        this.f6754E = false;
        this.f6755F = false;
        this.f6759y = new OverScroller(recyclerView.getContext(), interpolator);
    }

    /* JADX INFO: renamed from: a */
    public final void m5277a(int i13, int i14) {
        RecyclerView recyclerView = this.f6756G;
        recyclerView.setScrollState(2);
        this.f6758x = 0;
        this.f6757w = 0;
        Interpolator interpolator = this.f6760z;
        Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
        if (interpolator != interpolator2) {
            this.f6760z = interpolator2;
            this.f6759y = new OverScroller(recyclerView.getContext(), interpolator2);
        }
        this.f6759y.fling(0, 0, i13, i14, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        m5278b();
    }

    /* JADX INFO: renamed from: b */
    public final void m5278b() {
        if (this.f6754E) {
            this.f6755F = true;
            return;
        }
        RecyclerView recyclerView = this.f6756G;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        recyclerView.postOnAnimation(this);
    }

    /* JADX INFO: renamed from: c */
    public final void m5279c(int i13, int i14, Interpolator interpolator, int i15) {
        RecyclerView recyclerView = this.f6756G;
        if (i15 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i13);
            int iAbs2 = Math.abs(i14);
            boolean z4 = iAbs > iAbs2;
            int width = z4 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z4) {
                iAbs = iAbs2;
            }
            i15 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), ErrorCodes.InitAPIErrors.cServerErrors);
        }
        int i16 = i15;
        if (interpolator == null) {
            interpolator = RecyclerView.sQuinticInterpolator;
        }
        if (this.f6760z != interpolator) {
            this.f6760z = interpolator;
            this.f6759y = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f6758x = 0;
        this.f6757w = 0;
        recyclerView.setScrollState(2);
        this.f6759y.startScroll(0, 0, i13, i14, i16);
        m5278b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        RecyclerView recyclerView = this.f6756G;
        if (recyclerView.mLayout == null) {
            recyclerView.removeCallbacks(this);
            this.f6759y.abortAnimation();
            return;
        }
        this.f6755F = false;
        this.f6754E = true;
        recyclerView.consumePendingUpdateOperations();
        OverScroller overScroller = this.f6759y;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i18 = currX - this.f6757w;
            int i19 = currY - this.f6758x;
            this.f6757w = currX;
            this.f6758x = currY;
            int iConsumeFlingInHorizontalStretch = recyclerView.consumeFlingInHorizontalStretch(i18);
            int iConsumeFlingInVerticalStretch = recyclerView.consumeFlingInVerticalStretch(i19);
            int[] iArr = recyclerView.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            if (recyclerView.dispatchNestedPreScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr, null, 1)) {
                int[] iArr2 = recyclerView.mReusableIntPair;
                iConsumeFlingInHorizontalStretch -= iArr2[0];
                iConsumeFlingInVerticalStretch -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.considerReleasingGlowsOnScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch);
            }
            if (recyclerView.mAdapter != null) {
                int[] iArr3 = recyclerView.mReusableIntPair;
                iArr3[0] = 0;
                iArr3[1] = 0;
                recyclerView.scrollStep(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr3);
                int[] iArr4 = recyclerView.mReusableIntPair;
                int i24 = iArr4[0];
                int i25 = iArr4[1];
                int i26 = iConsumeFlingInHorizontalStretch - i24;
                int i27 = iConsumeFlingInVerticalStretch - i25;
                AbstractC1697j2 abstractC1697j2 = recyclerView.mLayout.mSmoothScroller;
                if (abstractC1697j2 != null && !abstractC1697j2.f6710d && abstractC1697j2.f6711e) {
                    int iM5276b = recyclerView.mState.m5276b();
                    if (iM5276b == 0) {
                        abstractC1697j2.m5274d();
                    } else if (abstractC1697j2.f6707a >= iM5276b) {
                        abstractC1697j2.f6707a = iM5276b - 1;
                        abstractC1697j2.m5273b(i24, i25);
                    } else {
                        abstractC1697j2.m5273b(i24, i25);
                    }
                }
                i13 = i26;
                i15 = i24;
                i14 = i27;
                i16 = i25;
            } else {
                i13 = iConsumeFlingInHorizontalStretch;
                i14 = iConsumeFlingInVerticalStretch;
                i15 = 0;
                i16 = 0;
            }
            if (!recyclerView.mItemDecorations.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr5 = recyclerView.mReusableIntPair;
            iArr5[0] = 0;
            iArr5[1] = 0;
            recyclerView.dispatchNestedScroll(i15, i16, i13, i14, null, 1, iArr5);
            int[] iArr6 = recyclerView.mReusableIntPair;
            int i28 = i13 - iArr6[0];
            int i29 = i14 - iArr6[1];
            if (i15 != 0 || i16 != 0) {
                recyclerView.dispatchOnScrolled(i15, i16);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z4 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i28 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i29 != 0));
            AbstractC1697j2 abstractC1697j3 = recyclerView.mLayout.mSmoothScroller;
            if ((abstractC1697j3 == null || !abstractC1697j3.f6710d) && z4) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i28 < 0) {
                        i17 = -currVelocity;
                    } else {
                        i17 = i28 > 0 ? currVelocity : 0;
                    }
                    if (i29 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i29 <= 0) {
                        currVelocity = 0;
                    }
                    recyclerView.absorbGlows(i17, currVelocity);
                }
                if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                    C1675e0 c1675e0 = recyclerView.mPrefetchRegistry;
                    int[] iArr7 = c1675e0.f6638c;
                    if (iArr7 != null) {
                        Arrays.fill(iArr7, -1);
                    }
                    c1675e0.f6639d = 0;
                }
            } else {
                m5278b();
                RunnableC1683g0 runnableC1683g0 = recyclerView.mGapWorker;
                if (runnableC1683g0 != null) {
                    runnableC1683g0.m5243a(recyclerView, i15, i16);
                }
            }
        }
        AbstractC1697j2 abstractC1697j4 = recyclerView.mLayout.mSmoothScroller;
        if (abstractC1697j4 != null && abstractC1697j4.f6710d) {
            abstractC1697j4.m5273b(0, 0);
        }
        this.f6754E = false;
        if (!this.f6755F) {
            recyclerView.setScrollState(0);
            recyclerView.stopNestedScroll(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            recyclerView.postOnAnimation(this);
        }
    }
}
