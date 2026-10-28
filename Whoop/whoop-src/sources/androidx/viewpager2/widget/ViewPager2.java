package androidx.viewpager2.widget;

import a00.C0072g;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.profileinstaller.ProfileVerifier;
import androidx.recyclerview.widget.AbstractC1692i1;
import androidx.recyclerview.widget.AbstractC1720p1;
import androidx.viewpager2.adapter.AbstractC1861i;
import androidx.viewpager2.adapter.C1856d;
import e10.C12554k0;
import fo.C14657c;
import java.util.ArrayList;
import no.nordicsemi.android.dfu.DfuBaseService;
import p044c5.RunnableC4209a;
import p171g9.C15585b;
import p172gc.AbstractC15703a;
import p184h5.AbstractC16901p0;
import p190hc.AbstractC17145h;
import p190hc.C17139b;
import p190hc.C17140c;
import p190hc.C17141d;
import p190hc.C17142e;
import p190hc.C17143f;
import p190hc.C17144g;
import p190hc.C17148k;
import p190hc.C17149l;
import p190hc.C17150m;
import p190hc.InterfaceC17147j;

/* JADX INFO: loaded from: classes5.dex */
public final class ViewPager2 extends ViewGroup {

    /* JADX INFO: renamed from: E */
    public boolean f7311E;

    /* JADX INFO: renamed from: F */
    public final C17141d f7312F;

    /* JADX INFO: renamed from: G */
    public C17144g f7313G;

    /* JADX INFO: renamed from: H */
    public int f7314H;

    /* JADX INFO: renamed from: I */
    public Parcelable f7315I;

    /* JADX INFO: renamed from: J */
    public C17149l f7316J;

    /* JADX INFO: renamed from: K */
    public C17148k f7317K;

    /* JADX INFO: renamed from: L */
    public C17140c f7318L;

    /* JADX INFO: renamed from: M */
    public C1856d f7319M;

    /* JADX INFO: renamed from: N */
    public C12554k0 f7320N;

    /* JADX INFO: renamed from: O */
    public C17139b f7321O;

    /* JADX INFO: renamed from: P */
    public AbstractC1720p1 f7322P;

    /* JADX INFO: renamed from: Q */
    public boolean f7323Q;

    /* JADX INFO: renamed from: R */
    public boolean f7324R;

    /* JADX INFO: renamed from: S */
    public int f7325S;

    /* JADX INFO: renamed from: T */
    public C0072g f7326T;

    /* JADX INFO: renamed from: w */
    public final Rect f7327w;

    /* JADX INFO: renamed from: x */
    public final Rect f7328x;

    /* JADX INFO: renamed from: y */
    public final C1856d f7329y;

    /* JADX INFO: renamed from: z */
    public int f7330z;

    public ViewPager2(Context context) {
        super(context);
        this.f7327w = new Rect();
        this.f7328x = new Rect();
        this.f7329y = new C1856d();
        this.f7311E = false;
        this.f7312F = new C17141d(this, 0);
        this.f7314H = -1;
        this.f7322P = null;
        this.f7323Q = false;
        this.f7324R = true;
        this.f7325S = -1;
        m5507a(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m5507a(Context context, AttributeSet attributeSet) {
        this.f7326T = new C0072g(this);
        C17149l c17149l = new C17149l(this, context);
        this.f7316J = c17149l;
        c17149l.setId(View.generateViewId());
        this.f7316J.setDescendantFocusability(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ);
        C17144g c17144g = new C17144g(this);
        this.f7313G = c17144g;
        this.f7316J.setLayoutManager(c17144g);
        this.f7316J.setScrollingTouchSlop(1);
        int[] iArr = AbstractC15703a.f59029a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        AbstractC16901p0.m47582m(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.f7316J.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f7316J.addOnChildAttachStateChangeListener(new C17143f());
            C17140c c17140c = new C17140c(this);
            this.f7318L = c17140c;
            this.f7320N = new C12554k0(c17140c, 29);
            C17148k c17148k = new C17148k(this);
            this.f7317K = c17148k;
            c17148k.m5235a(this.f7316J);
            this.f7316J.addOnScrollListener(this.f7318L);
            C1856d c1856d = new C1856d();
            this.f7319M = c1856d;
            this.f7318L.f65812a = c1856d;
            C17142e c17142e = new C17142e(this, 0);
            C17142e c17142e2 = new C17142e(this, 1);
            ((ArrayList) c1856d.f7300b).add(c17142e);
            ((ArrayList) this.f7319M.f7300b).add(c17142e2);
            C0072g c0072g = this.f7326T;
            C17149l c17149l2 = this.f7316J;
            c0072g.getClass();
            c17149l2.setImportantForAccessibility(2);
            c0072g.f225z = new C17141d(c0072g, 1);
            ViewPager2 viewPager2 = (ViewPager2) c0072g.f221E;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
            ((ArrayList) this.f7319M.f7300b).add(this.f7329y);
            C17139b c17139b = new C17139b();
            this.f7321O = c17139b;
            ((ArrayList) this.f7319M.f7300b).add(c17139b);
            C17149l c17149l3 = this.f7316J;
            attachViewToParent(c17149l3, 0, c17149l3.getLayoutParams());
        } catch (Throwable th3) {
            typedArrayObtainStyledAttributes.recycle();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5508b(AbstractC17145h abstractC17145h) {
        ((ArrayList) this.f7329y.f7300b).add(abstractC17145h);
    }

    /* JADX INFO: renamed from: c */
    public final void m5509c() {
        AbstractC1692i1 adapter;
        if (this.f7314H == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        Parcelable parcelable = this.f7315I;
        if (parcelable != null) {
            if (adapter instanceof AbstractC1861i) {
                ((AbstractC1861i) adapter).restoreState(parcelable);
            }
            this.f7315I = null;
        }
        int iMax = Math.max(0, Math.min(this.f7314H, adapter.getItemCount() - 1));
        this.f7330z = iMax;
        this.f7314H = -1;
        this.f7316J.scrollToPosition(iMax);
        this.f7326T.m180P();
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i13) {
        return this.f7316J.canScrollHorizontally(i13);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i13) {
        return this.f7316J.canScrollVertically(i13);
    }

    /* JADX INFO: renamed from: d */
    public final void m5510d(int i13, boolean z4) {
        Object obj = this.f7320N.f42881x;
        m5511e(i13, z4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof C17150m) {
            int i13 = ((C17150m) parcelable).f65833w;
            sparseArray.put(this.f7316J.getId(), (Parcelable) sparseArray.get(i13));
            sparseArray.remove(i13);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        m5509c();
    }

    /* JADX INFO: renamed from: e */
    public final void m5511e(int i13, boolean z4) {
        AbstractC1692i1 adapter = getAdapter();
        if (adapter == null) {
            if (this.f7314H != -1) {
                this.f7314H = Math.max(i13, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i13, 0), adapter.getItemCount() - 1);
        int i14 = this.f7330z;
        if (iMin == i14 && this.f7318L.f65817f == 0) {
            return;
        }
        if (iMin == i14 && z4) {
            return;
        }
        double d3 = i14;
        this.f7330z = iMin;
        this.f7326T.m180P();
        C17140c c17140c = this.f7318L;
        if (c17140c.f65817f != 0) {
            c17140c.m48385d();
            C14657c c14657c = c17140c.f65818g;
            d3 = ((double) c14657c.f54092a) + ((double) c14657c.f54093b);
        }
        C17140c c17140c2 = this.f7318L;
        c17140c2.getClass();
        c17140c2.f65816e = z4 ? 2 : 3;
        boolean z13 = c17140c2.f65820i != iMin;
        c17140c2.f65820i = iMin;
        c17140c2.m48383b(2);
        if (z13) {
            c17140c2.m48382a(iMin);
        }
        if (!z4) {
            this.f7316J.scrollToPosition(iMin);
            return;
        }
        double d14 = iMin;
        if (Math.abs(d14 - d3) <= 3.0d) {
            this.f7316J.smoothScrollToPosition(iMin);
            return;
        }
        this.f7316J.scrollToPosition(d14 > d3 ? iMin - 3 : iMin + 3);
        C17149l c17149l = this.f7316J;
        c17149l.post(new RunnableC4209a(iMin, c17149l));
    }

    /* JADX INFO: renamed from: f */
    public final void m5512f() {
        C17148k c17148k = this.f7317K;
        if (c17148k == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewMo5237e = c17148k.mo5237e(this.f7313G);
        if (viewMo5237e == null) {
            return;
        }
        int position = this.f7313G.getPosition(viewMo5237e);
        if (position != this.f7330z && getScrollState() == 0) {
            this.f7319M.onPageSelected(position);
        }
        this.f7311E = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.f7326T.getClass();
        this.f7326T.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public AbstractC1692i1 getAdapter() {
        return this.f7316J.getAdapter();
    }

    public int getCurrentItem() {
        return this.f7330z;
    }

    public int getItemDecorationCount() {
        return this.f7316J.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f7325S;
    }

    public int getOrientation() {
        return this.f7313G.getOrientation() == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        C17149l c17149l = this.f7316J;
        if (getOrientation() == 0) {
            height = c17149l.getWidth() - c17149l.getPaddingLeft();
            paddingBottom = c17149l.getPaddingRight();
        } else {
            height = c17149l.getHeight() - c17149l.getPaddingTop();
            paddingBottom = c17149l.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f7318L.f65817f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int itemCount;
        int itemCount2;
        int itemCount3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = (ViewPager2) this.f7326T.f221E;
        if (viewPager2.getAdapter() == null) {
            itemCount = 0;
            itemCount2 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            itemCount = viewPager2.getAdapter().getItemCount();
            itemCount2 = 1;
        } else {
            itemCount2 = viewPager2.getAdapter().getItemCount();
            itemCount = 1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C15585b.m43881c(itemCount, itemCount2, 0, false).f58535a);
        AbstractC1692i1 adapter = viewPager2.getAdapter();
        if (adapter == null || (itemCount3 = adapter.getItemCount()) == 0 || !viewPager2.f7324R) {
            return;
        }
        if (viewPager2.f7330z > 0) {
            accessibilityNodeInfo.addAction(DfuBaseService.ERROR_REMOTE_MASK);
        }
        if (viewPager2.f7330z < itemCount3 - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        int measuredWidth = this.f7316J.getMeasuredWidth();
        int measuredHeight = this.f7316J.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f7327w;
        rect.left = paddingLeft;
        rect.right = (i15 - i13) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i16 - i14) - getPaddingBottom();
        Rect rect2 = this.f7328x;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.f7316J.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f7311E) {
            m5512f();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        measureChild(this.f7316J, i13, i14);
        int measuredWidth = this.f7316J.getMeasuredWidth();
        int measuredHeight = this.f7316J.getMeasuredHeight();
        int measuredState = this.f7316J.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i13, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i14, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C17150m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C17150m c17150m = (C17150m) parcelable;
        super.onRestoreInstanceState(c17150m.getSuperState());
        this.f7314H = c17150m.f65834x;
        this.f7315I = c17150m.f65835y;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C17150m c17150m = new C17150m(super.onSaveInstanceState());
        c17150m.f65833w = this.f7316J.getId();
        int i13 = this.f7314H;
        if (i13 == -1) {
            i13 = this.f7330z;
        }
        c17150m.f65834x = i13;
        Parcelable parcelable = this.f7315I;
        if (parcelable != null) {
            c17150m.f65835y = parcelable;
            return c17150m;
        }
        AbstractC1692i1 adapter = this.f7316J.getAdapter();
        if (adapter instanceof AbstractC1861i) {
            c17150m.f65835y = ((AbstractC1861i) adapter).saveState();
        }
        return c17150m;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i13, Bundle bundle) {
        this.f7326T.getClass();
        if (i13 != 8192 && i13 != 4096) {
            return super.performAccessibilityAction(i13, bundle);
        }
        C0072g c0072g = this.f7326T;
        ViewPager2 viewPager2 = (ViewPager2) c0072g.f221E;
        if (i13 != 8192 && i13 != 4096) {
            throw new IllegalStateException();
        }
        int currentItem = i13 == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        ViewPager2 viewPager3 = (ViewPager2) c0072g.f221E;
        if (viewPager3.f7324R) {
            viewPager3.m5511e(currentItem, true);
        }
        return true;
    }

    public void setAdapter(AbstractC1692i1 abstractC1692i1) {
        AbstractC1692i1 adapter = this.f7316J.getAdapter();
        C0072g c0072g = this.f7326T;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver((C17141d) c0072g.f225z);
        } else {
            c0072g.getClass();
        }
        C17141d c17141d = this.f7312F;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(c17141d);
        }
        this.f7316J.setAdapter(abstractC1692i1);
        this.f7330z = 0;
        m5509c();
        C0072g c0072g2 = this.f7326T;
        c0072g2.m180P();
        if (abstractC1692i1 != null) {
            abstractC1692i1.registerAdapterDataObserver((C17141d) c0072g2.f225z);
        }
        if (abstractC1692i1 != null) {
            abstractC1692i1.registerAdapterDataObserver(c17141d);
        }
    }

    public void setCurrentItem(int i13) {
        m5510d(i13, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i13) {
        super.setLayoutDirection(i13);
        this.f7326T.m180P();
    }

    public void setOffscreenPageLimit(int i13) {
        if (i13 < 1 && i13 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f7325S = i13;
        this.f7316J.requestLayout();
    }

    public void setOrientation(int i13) {
        this.f7313G.setOrientation(i13);
        this.f7326T.m180P();
    }

    public void setPageTransformer(InterfaceC17147j interfaceC17147j) {
        if (interfaceC17147j != null) {
            if (!this.f7323Q) {
                this.f7322P = this.f7316J.getItemAnimator();
                this.f7323Q = true;
            }
            this.f7316J.setItemAnimator(null);
        } else if (this.f7323Q) {
            this.f7316J.setItemAnimator(this.f7322P);
            this.f7322P = null;
            this.f7323Q = false;
        }
        this.f7321O.getClass();
        if (interfaceC17147j == null) {
            return;
        }
        this.f7321O.getClass();
        this.f7321O.getClass();
    }

    public void setUserInputEnabled(boolean z4) {
        this.f7324R = z4;
        this.f7326T.m180P();
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7327w = new Rect();
        this.f7328x = new Rect();
        this.f7329y = new C1856d();
        this.f7311E = false;
        this.f7312F = new C17141d(this, 0);
        this.f7314H = -1;
        this.f7322P = null;
        this.f7323Q = false;
        this.f7324R = true;
        this.f7325S = -1;
        m5507a(context, attributeSet);
    }
}
