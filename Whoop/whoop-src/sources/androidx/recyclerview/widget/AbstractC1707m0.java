package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.view.View;
import android.view.animation.Interpolator;
import com.whoop.android.R;
import java.util.List;
import java.util.WeakHashMap;
import p031b9.AbstractC2875y;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;

/* JADX INFO: renamed from: androidx.recyclerview.widget.m0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1707m0 {
    private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
    public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
    public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
    private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000;
    static final int RELATIVE_DIR_FLAGS = 3158064;
    private static final Interpolator sDragScrollInterpolator = new InterpolatorC1703l0(0);
    private static final Interpolator sDragViewScrollCapInterpolator = new InterpolatorC1703l0(1);
    private int mCachedMaxScrollSpeed = -1;

    public static int convertToRelativeDirection(int i13, int i14) {
        int i15;
        int i16 = i13 & ABS_HORIZONTAL_DIR_FLAGS;
        if (i16 == 0) {
            return i13;
        }
        int i17 = i13 & (~i16);
        if (i14 == 0) {
            i15 = i16 << 2;
        } else {
            int i18 = i16 << 1;
            i17 |= (-789517) & i18;
            i15 = (i18 & ABS_HORIZONTAL_DIR_FLAGS) << 2;
        }
        return i17 | i15;
    }

    public static InterfaceC1719p0 getDefaultUIUtil() {
        return C1723q0.f6823a;
    }

    public static int makeFlag(int i13, int i14) {
        return i14 << (i13 * 8);
    }

    public static int makeMovementFlags(int i13, int i14) {
        return makeFlag(2, i13) | makeFlag(1, i14) | makeFlag(0, i14 | i13);
    }

    public final boolean canDropOver(RecyclerView recyclerView, AbstractC1717o2 abstractC1717o2, AbstractC1717o2 abstractC1717o3) {
        return true;
    }

    @SuppressLint({"UnknownNullness"})
    public final AbstractC1717o2 chooseDropTarget(AbstractC1717o2 abstractC1717o2, List<AbstractC1717o2> list, int i13, int i14) {
        int bottom;
        int iAbs;
        int top;
        int iAbs2;
        int left;
        int iAbs3;
        int right;
        int iAbs4;
        int width = abstractC1717o2.itemView.getWidth() + i13;
        int height = abstractC1717o2.itemView.getHeight() + i14;
        int left2 = i13 - abstractC1717o2.itemView.getLeft();
        int top2 = i14 - abstractC1717o2.itemView.getTop();
        int size = list.size();
        AbstractC1717o2 abstractC1717o3 = null;
        int i15 = -1;
        for (int i16 = 0; i16 < size; i16++) {
            AbstractC1717o2 abstractC1717o4 = list.get(i16);
            if (left2 > 0 && (right = abstractC1717o4.itemView.getRight() - width) < 0 && abstractC1717o4.itemView.getRight() > abstractC1717o2.itemView.getRight() && (iAbs4 = Math.abs(right)) > i15) {
                abstractC1717o3 = abstractC1717o4;
                i15 = iAbs4;
            }
            if (left2 < 0 && (left = abstractC1717o4.itemView.getLeft() - i13) > 0 && abstractC1717o4.itemView.getLeft() < abstractC1717o2.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i15) {
                abstractC1717o3 = abstractC1717o4;
                i15 = iAbs3;
            }
            if (top2 < 0 && (top = abstractC1717o4.itemView.getTop() - i14) > 0 && abstractC1717o4.itemView.getTop() < abstractC1717o2.itemView.getTop() && (iAbs2 = Math.abs(top)) > i15) {
                abstractC1717o3 = abstractC1717o4;
                i15 = iAbs2;
            }
            if (top2 > 0 && (bottom = abstractC1717o4.itemView.getBottom() - height) < 0 && abstractC1717o4.itemView.getBottom() > abstractC1717o2.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i15) {
                abstractC1717o3 = abstractC1717o4;
                i15 = iAbs;
            }
        }
        return abstractC1717o3;
    }

    public final void clearView(RecyclerView recyclerView, AbstractC1717o2 abstractC1717o2) {
        View view = abstractC1717o2.itemView;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float fFloatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            AbstractC16877h0.m47516k(view, fFloatValue);
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public final int convertToAbsoluteDirection(int i13, int i14) {
        int i15;
        int i16 = i13 & RELATIVE_DIR_FLAGS;
        if (i16 == 0) {
            return i13;
        }
        int i17 = i13 & (~i16);
        if (i14 == 0) {
            i15 = i16 >> 2;
        } else {
            int i18 = i16 >> 1;
            i17 |= (-3158065) & i18;
            i15 = (i18 & RELATIVE_DIR_FLAGS) >> 2;
        }
        return i17 | i15;
    }

    public final int getAbsoluteMovementFlags(RecyclerView recyclerView, AbstractC1717o2 abstractC1717o2) {
        int movementFlags = getMovementFlags(recyclerView, abstractC1717o2);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        return convertToAbsoluteDirection(movementFlags, recyclerView.getLayoutDirection());
    }

    public final long getAnimationDuration(RecyclerView recyclerView, int i13, float f13, float f14) {
        AbstractC1720p1 itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator == null) {
            return i13 == 8 ? 200L : 250L;
        }
        return i13 == 8 ? itemAnimator.f6806e : itemAnimator.f6805d;
    }

    public final int getBoundingBoxMargin() {
        return 0;
    }

    public final float getMoveThreshold(AbstractC1717o2 abstractC1717o2) {
        return 0.5f;
    }

    public abstract int getMovementFlags(RecyclerView recyclerView, AbstractC1717o2 abstractC1717o2);

    public final float getSwipeEscapeVelocity(float f13) {
        return f13;
    }

    public final float getSwipeVelocityThreshold(float f13) {
        return f13;
    }

    public final boolean hasDragFlag(RecyclerView recyclerView, AbstractC1717o2 abstractC1717o2) {
        return (getAbsoluteMovementFlags(recyclerView, abstractC1717o2) & 16711680) != 0;
    }

    public final boolean hasSwipeFlag(RecyclerView recyclerView, AbstractC1717o2 abstractC1717o2) {
        return (getAbsoluteMovementFlags(recyclerView, abstractC1717o2) & 65280) != 0;
    }

    public final int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int i13, int i14, int i15, long j7) {
        if (this.mCachedMaxScrollSpeed == -1) {
            this.mCachedMaxScrollSpeed = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
        }
        int interpolation = (int) (sDragScrollInterpolator.getInterpolation(j7 <= 2000 ? j7 / 2000.0f : 1.0f) * ((int) (sDragViewScrollCapInterpolator.getInterpolation(Math.min(1.0f, (Math.abs(i14) * 1.0f) / i13)) * ((int) Math.signum(i14)) * this.mCachedMaxScrollSpeed)));
        if (interpolation == 0) {
            return i14 > 0 ? 1 : -1;
        }
        return interpolation;
    }

    public final boolean isItemViewSwipeEnabled() {
        return true;
    }

    public final boolean isLongPressDragEnabled() {
        return true;
    }

    public abstract void onChildDraw(Canvas canvas, RecyclerView recyclerView, AbstractC1717o2 abstractC1717o2, float f13, float f14, int i13, boolean z4);

    public final void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, @SuppressLint({"UnknownNullness"}) AbstractC1717o2 abstractC1717o2, float f13, float f14, int i13, boolean z4) {
        View view = abstractC1717o2.itemView;
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, AbstractC1717o2 abstractC1717o2, List<C1695j0> list, int i13, float f13, float f14) {
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            C1695j0 c1695j0 = list.get(i14);
            AbstractC1717o2 abstractC1717o3 = c1695j0.f6695e;
            float f15 = c1695j0.f6691a;
            float f16 = c1695j0.f6693c;
            if (f15 == f16) {
                c1695j0.f6699i = abstractC1717o3.itemView.getTranslationX();
            } else {
                c1695j0.f6699i = AbstractC2875y.m8288a(f16, f15, c1695j0.f6703m, f15);
            }
            float f17 = c1695j0.f6692b;
            float f18 = c1695j0.f6694d;
            if (f17 == f18) {
                c1695j0.f6700j = abstractC1717o3.itemView.getTranslationY();
            } else {
                c1695j0.f6700j = AbstractC2875y.m8288a(f18, f17, c1695j0.f6703m, f17);
            }
            int iSave = canvas.save();
            onChildDraw(canvas, recyclerView, c1695j0.f6695e, c1695j0.f6699i, c1695j0.f6700j, c1695j0.f6696f, false);
            canvas.restoreToCount(iSave);
        }
        if (abstractC1717o2 != null) {
            int iSave2 = canvas.save();
            onChildDraw(canvas, recyclerView, abstractC1717o2, f13, f14, i13, true);
            canvas.restoreToCount(iSave2);
        }
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, AbstractC1717o2 abstractC1717o2, List<C1695j0> list, int i13, float f13, float f14) {
        int size = list.size();
        boolean z4 = false;
        for (int i14 = 0; i14 < size; i14++) {
            C1695j0 c1695j0 = list.get(i14);
            int iSave = canvas.save();
            View view = c1695j0.f6695e.itemView;
            canvas.restoreToCount(iSave);
        }
        if (abstractC1717o2 != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i15 = size - 1; i15 >= 0; i15--) {
            C1695j0 c1695j1 = list.get(i15);
            boolean z13 = c1695j1.f6702l;
            if (z13 && !c1695j1.f6698h) {
                list.remove(i15);
            } else if (!z13) {
                z4 = true;
            }
        }
        if (z4) {
            recyclerView.invalidate();
        }
    }

    public final void onMoved(RecyclerView recyclerView, AbstractC1717o2 abstractC1717o2, int i13, AbstractC1717o2 abstractC1717o3, int i14, int i15, int i16) {
        AbstractC1740u1 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            ((LinearLayoutManager) layoutManager).prepareForDrop(abstractC1717o2.itemView, abstractC1717o3.itemView, i15, i16);
            return;
        }
        if (layoutManager.canScrollHorizontally()) {
            if (layoutManager.getDecoratedLeft(abstractC1717o3.itemView) <= recyclerView.getPaddingLeft()) {
                recyclerView.scrollToPosition(i14);
            }
            if (layoutManager.getDecoratedRight(abstractC1717o3.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                recyclerView.scrollToPosition(i14);
            }
        }
        if (layoutManager.canScrollVertically()) {
            if (layoutManager.getDecoratedTop(abstractC1717o3.itemView) <= recyclerView.getPaddingTop()) {
                recyclerView.scrollToPosition(i14);
            }
            if (layoutManager.getDecoratedBottom(abstractC1717o3.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                recyclerView.scrollToPosition(i14);
            }
        }
    }

    public final void onSelectedChanged(AbstractC1717o2 abstractC1717o2, int i13) {
    }
}
