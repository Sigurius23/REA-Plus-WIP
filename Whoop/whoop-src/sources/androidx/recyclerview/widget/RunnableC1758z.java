package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import java.util.WeakHashMap;
import p184h5.AbstractC16901p0;

/* JADX INFO: renamed from: androidx.recyclerview.widget.z */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC1758z implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f6941w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f6942x;

    public /* synthetic */ RunnableC1758z(Object obj, int i13) {
        this.f6941w = i13;
        this.f6942x = obj;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008b  */
    @Override // java.lang.Runnable
    public final void run() {
        int iInterpolateOutOfBoundsScroll;
        int height;
        int i13 = this.f6941w;
        int iInterpolateOutOfBoundsScroll2 = 0;
        Object obj = this.f6942x;
        switch (i13) {
            case 0:
                C1671d0 c1671d0 = (C1671d0) obj;
                ValueAnimator valueAnimator = c1671d0.f6633z;
                int i14 = c1671d0.f6606A;
                if (i14 == 1) {
                    valueAnimator.cancel();
                } else if (i14 != 2) {
                }
                c1671d0.f6606A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                break;
            case 1:
                C1715o0 c1715o0 = (C1715o0) obj;
                if (c1715o0.f6771c != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j7 = c1715o0.f6768B;
                    long j13 = j7 == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j7;
                    AbstractC1740u1 layoutManager = c1715o0.f6786r.getLayoutManager();
                    if (c1715o0.f6767A == null) {
                        c1715o0.f6767A = new Rect();
                    }
                    layoutManager.calculateItemDecorationsForChild(c1715o0.f6771c.itemView, c1715o0.f6767A);
                    if (layoutManager.canScrollHorizontally()) {
                        int i15 = (int) (c1715o0.f6778j + c1715o0.f6776h);
                        int paddingLeft = (i15 - c1715o0.f6767A.left) - c1715o0.f6786r.getPaddingLeft();
                        float f13 = c1715o0.f6776h;
                        if ((f13 >= 0.0f || paddingLeft >= 0) && (f13 <= 0.0f || (paddingLeft = ((c1715o0.f6771c.itemView.getWidth() + i15) + c1715o0.f6767A.right) - (c1715o0.f6786r.getWidth() - c1715o0.f6786r.getPaddingRight())) <= 0)) {
                            iInterpolateOutOfBoundsScroll = 0;
                        } else {
                            iInterpolateOutOfBoundsScroll = paddingLeft;
                        }
                    } else {
                        iInterpolateOutOfBoundsScroll = 0;
                    }
                    if (layoutManager.canScrollVertically()) {
                        int i16 = (int) (c1715o0.f6779k + c1715o0.f6777i);
                        int paddingTop = (i16 - c1715o0.f6767A.top) - c1715o0.f6786r.getPaddingTop();
                        float f14 = c1715o0.f6777i;
                        if (f14 < 0.0f && paddingTop < 0) {
                            iInterpolateOutOfBoundsScroll2 = paddingTop;
                        } else if (f14 > 0.0f && (height = ((c1715o0.f6771c.itemView.getHeight() + i16) + c1715o0.f6767A.bottom) - (c1715o0.f6786r.getHeight() - c1715o0.f6786r.getPaddingBottom())) > 0) {
                            iInterpolateOutOfBoundsScroll2 = height;
                        }
                    }
                    if (iInterpolateOutOfBoundsScroll != 0) {
                        iInterpolateOutOfBoundsScroll = c1715o0.f6781m.interpolateOutOfBoundsScroll(c1715o0.f6786r, c1715o0.f6771c.itemView.getWidth(), iInterpolateOutOfBoundsScroll, c1715o0.f6786r.getWidth(), j13);
                    }
                    int i17 = iInterpolateOutOfBoundsScroll;
                    if (iInterpolateOutOfBoundsScroll2 != 0) {
                        iInterpolateOutOfBoundsScroll2 = c1715o0.f6781m.interpolateOutOfBoundsScroll(c1715o0.f6786r, c1715o0.f6771c.itemView.getHeight(), iInterpolateOutOfBoundsScroll2, c1715o0.f6786r.getHeight(), j13);
                    }
                    if (i17 == 0 && iInterpolateOutOfBoundsScroll2 == 0) {
                        c1715o0.f6768B = Long.MIN_VALUE;
                    } else {
                        if (c1715o0.f6768B == Long.MIN_VALUE) {
                            c1715o0.f6768B = jCurrentTimeMillis;
                        }
                        c1715o0.f6786r.scrollBy(i17, iInterpolateOutOfBoundsScroll2);
                        AbstractC1717o2 abstractC1717o2 = c1715o0.f6771c;
                        if (abstractC1717o2 != null) {
                            c1715o0.m5290m(abstractC1717o2);
                        }
                        c1715o0.f6786r.removeCallbacks(c1715o0.f6787s);
                        RecyclerView recyclerView = c1715o0.f6786r;
                        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                        recyclerView.postOnAnimation(this);
                    }
                }
                break;
            default:
                ((StaggeredGridLayoutManager) obj).m5142d();
                break;
        }
    }
}
