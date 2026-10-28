package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.AbstractC1740u1;
import androidx.recyclerview.widget.C1668c2;
import androidx.recyclerview.widget.C1701k2;
import androidx.recyclerview.widget.C1744v1;
import androidx.recyclerview.widget.InterfaceC1693i2;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C5029w;
import com.whoop.android.R;
import p010a9.AbstractC0576a;
import p031b9.AbstractC2875y;
import p077d0.C11349f0;
import p087db.ViewOnLayoutChangeListenerC11857k;
import p257jq.AbstractC21885a;
import p487sq.C32878a;
import p487sq.C32879b;

/* JADX INFO: loaded from: classes6.dex */
public class CarouselLayoutManager extends AbstractC1740u1 implements InterfaceC1693i2 {

    /* JADX INFO: renamed from: a */
    public final C11349f0 f20864a;

    /* JADX INFO: renamed from: b */
    public AbstractC0576a f20865b;

    /* JADX INFO: renamed from: c */
    public final View.OnLayoutChangeListener f20866c;

    public CarouselLayoutManager() {
        C11349f0 c11349f0 = new C11349f0(3);
        new C32878a();
        this.f20866c = new ViewOnLayoutChangeListenerC11857k(this, 5);
        this.f20864a = c11349f0;
        requestLayout();
        setOrientation(0);
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final boolean canScrollHorizontally() {
        return m15726d();
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final boolean canScrollVertically() {
        return !m15726d();
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final int computeHorizontalScrollExtent(C1701k2 c1701k2) {
        getChildCount();
        return 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final int computeHorizontalScrollOffset(C1701k2 c1701k2) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final int computeHorizontalScrollRange(C1701k2 c1701k2) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1693i2
    public final PointF computeScrollVectorForPosition(int i13) {
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final int computeVerticalScrollExtent(C1701k2 c1701k2) {
        getChildCount();
        return 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final int computeVerticalScrollOffset(C1701k2 c1701k2) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final int computeVerticalScrollRange(C1701k2 c1701k2) {
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m15726d() {
        return this.f20865b.f2052x == 0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m15727e() {
        return m15726d() && getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final C1744v1 generateDefaultLayoutParams() {
        return new C1744v1(-2, -2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void getDecoratedBoundsWithMargins(View view, Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        rect.centerY();
        if (m15726d()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void measureChildWithMargins(View view, int i13, int i14) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        Context context = recyclerView.getContext();
        C11349f0 c11349f0 = this.f20864a;
        float dimension = c11349f0.f36376w;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        c11349f0.f36376w = dimension;
        float dimension2 = c11349f0.f36377x;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        c11349f0.f36377x = dimension2;
        requestLayout();
        recyclerView.addOnLayoutChangeListener(this.f20866c);
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void onDetachedFromWindow(RecyclerView recyclerView, C1668c2 c1668c2) {
        onDetachedFromWindow(recyclerView);
        recyclerView.removeOnLayoutChangeListener(this.f20866c);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final View onFocusSearchFailed(View view, int i13, C1668c2 c1668c2, C1701k2 c1701k2) {
        byte b;
        if (getChildCount() == 0) {
            return null;
        }
        int i14 = this.f20865b.f2052x;
        if (i13 == 1) {
            b = -1;
        } else if (i13 == 2) {
            b = 1;
        } else if (i13 != 17) {
            if (i13 != 33) {
                if (i13 != 66) {
                    if (i13 != 130) {
                        Log.d("CarouselLayoutManager", "Unknown focus request:" + i13);
                    } else if (i14 == 1) {
                        b = 1;
                    }
                    b = -2147483648;
                } else if (i14 != 0) {
                    b = -2147483648;
                } else if (m15727e()) {
                    b = -1;
                } else {
                    b = 1;
                }
            } else if (i14 == 1) {
                b = -1;
            } else {
                b = -2147483648;
            }
        } else if (i14 != 0) {
            b = -2147483648;
        } else if (m15727e()) {
            b = 1;
        } else {
            b = -1;
        }
        if (b == -2147483648) {
            return null;
        }
        if (b == -1) {
            if (getPosition(view) == 0) {
                return null;
            }
            int position = getPosition(getChildAt(0)) - 1;
            if (position < 0 || position >= getItemCount()) {
                return getChildAt(m15727e() ? getChildCount() - 1 : 0);
            }
            this.f20865b.mo1500l();
            throw null;
        }
        if (getPosition(view) == getItemCount() - 1) {
            return null;
        }
        int position2 = getPosition(getChildAt(getChildCount() - 1)) + 1;
        if (position2 < 0 || position2 >= getItemCount()) {
            return getChildAt(m15727e() ? 0 : getChildCount() - 1);
        }
        this.f20865b.mo1500l();
        throw null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void onItemsAdded(RecyclerView recyclerView, int i13, int i14) {
        super.onItemsAdded(recyclerView, i13, i14);
        getItemCount();
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void onItemsRemoved(RecyclerView recyclerView, int i13, int i14) {
        super.onItemsRemoved(recyclerView, i13, i14);
        getItemCount();
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void onLayoutChildren(C1668c2 c1668c2, C1701k2 c1701k2) {
        if (c1701k2.m5276b() > 0) {
            if ((m15726d() ? getWidth() : getHeight()) > 0.0f) {
                m15727e();
                measureChildWithMargins(c1668c2.m5205l(0, Long.MAX_VALUE).itemView, 0, 0);
                throw null;
            }
        }
        removeAndRecycleAllViews(c1668c2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void onLayoutCompleted(C1701k2 c1701k2) {
        if (getChildCount() == 0) {
            return;
        }
        getPosition(getChildAt(0));
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z4, boolean z13) {
        return false;
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final int scrollHorizontallyBy(int i13, C1668c2 c1668c2, C1701k2 c1701k2) {
        if (!m15726d() || getChildCount() == 0 || i13 == 0) {
            return 0;
        }
        measureChildWithMargins(c1668c2.m5205l(0, Long.MAX_VALUE).itemView, 0, 0);
        throw null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void scrollToPosition(int i13) {
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final int scrollVerticallyBy(int i13, C1668c2 c1668c2, C1701k2 c1701k2) {
        if (!canScrollVertically() || getChildCount() == 0 || i13 == 0) {
            return 0;
        }
        measureChildWithMargins(c1668c2.m5205l(0, Long.MAX_VALUE).itemView, 0, 0);
        throw null;
    }

    public final void setOrientation(int i13) {
        C32879b c32879b;
        if (i13 != 0 && i13 != 1) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        AbstractC0576a abstractC0576a = this.f20865b;
        if (abstractC0576a == null || i13 != abstractC0576a.f2052x) {
            if (i13 == 0) {
                c32879b = new C32879b(this, 1);
            } else {
                if (i13 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                c32879b = new C32879b(this, 0);
            }
            this.f20865b = c32879b;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void smoothScrollToPosition(RecyclerView recyclerView, C1701k2 c1701k2, int i13) {
        C5029w c5029w = new C5029w(this, recyclerView.getContext());
        c5029w.f6707a = i13;
        startSmoothScroll(c5029w);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i13, int i14) {
        new C32878a();
        this.f20866c = new ViewOnLayoutChangeListenerC11857k(this, 5);
        this.f20864a = new C11349f0(3);
        requestLayout();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC21885a.f84547g);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            requestLayout();
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
