package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import ih0.AbstractC18489d0;
import java.util.Arrays;
import p000.AbstractC11266d;
import p014aj.C0929d;
import p031b9.AbstractC2875y;
import p211i5.C18093f;
import p619xl.C38445a;

/* JADX INFO: loaded from: classes5.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: a */
    public boolean f6529a;

    /* JADX INFO: renamed from: b */
    public int f6530b;

    /* JADX INFO: renamed from: c */
    public int[] f6531c;

    /* JADX INFO: renamed from: d */
    public View[] f6532d;

    /* JADX INFO: renamed from: e */
    public final SparseIntArray f6533e;

    /* JADX INFO: renamed from: f */
    public final SparseIntArray f6534f;

    /* JADX INFO: renamed from: g */
    public final C38445a f6535g;

    /* JADX INFO: renamed from: h */
    public final Rect f6536h;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13, i14);
        this.f6529a = false;
        this.f6530b = -1;
        this.f6533e = new SparseIntArray();
        this.f6534f = new SparseIntArray();
        this.f6535g = new C38445a(3);
        this.f6536h = new Rect();
        m5108y(AbstractC1740u1.getProperties(context, attributeSet, i13, i14).f6867b);
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final boolean checkLayoutParams(C1744v1 c1744v1) {
        return c1744v1 instanceof C1687h0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void collectPrefetchPositionsForLayoutState(C1701k2 c1701k2, C1739u0 c1739u0, InterfaceC1732s1 interfaceC1732s1) {
        int i13;
        int i14 = this.f6530b;
        for (int i15 = 0; i15 < this.f6530b && (i13 = c1739u0.f6874d) >= 0 && i13 < c1701k2.m5276b() && i14 > 0; i15++) {
            ((C1675e0) interfaceC1732s1).m5231a(c1739u0.f6874d, Math.max(0, c1739u0.f6877g));
            this.f6535g.getClass();
            i14--;
            c1739u0.f6874d += c1739u0.f6875e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View findReferenceChild(C1668c2 c1668c2, C1701k2 c1701k2, boolean z4, boolean z13) {
        int i13;
        int childCount;
        int childCount2 = getChildCount();
        int i14 = 1;
        if (z13) {
            childCount = getChildCount() - 1;
            i13 = -1;
            i14 = -1;
        } else {
            i13 = childCount2;
            childCount = 0;
        }
        int iM5276b = c1701k2.m5276b();
        ensureLayoutState();
        int iMo5187k = this.mOrientationHelper.mo5187k();
        int iMo5183g = this.mOrientationHelper.mo5183g();
        View view = null;
        View view2 = null;
        while (childCount != i13) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            if (position >= 0 && position < iM5276b && m5105v(position, c1668c2, c1701k2) == 0) {
                if (((C1744v1) childAt.getLayoutParams()).f6891a.isRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.mo5181e(childAt) < iMo5183g && this.mOrientationHelper.mo5178b(childAt) >= iMo5187k) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            childCount += i14;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC1740u1
    public final C1744v1 generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new C1687h0(-2, -1) : new C1687h0(-1, -2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final C1744v1 generateLayoutParams(Context context, AttributeSet attributeSet) {
        C1687h0 c1687h0 = new C1687h0(context, attributeSet);
        c1687h0.f6669e = -1;
        c1687h0.f6670f = 0;
        return c1687h0;
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final int getColumnCountForAccessibility(C1668c2 c1668c2, C1701k2 c1701k2) {
        if (this.mOrientation == 1) {
            return this.f6530b;
        }
        if (c1701k2.m5276b() < 1) {
            return 0;
        }
        return m5104u(c1701k2.m5276b() - 1, c1668c2, c1701k2) + 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final int getRowCountForAccessibility(C1668c2 c1668c2, C1701k2 c1701k2) {
        if (this.mOrientation == 0) {
            return this.f6530b;
        }
        if (c1701k2.m5276b() < 1) {
            return 0;
        }
        return m5104u(c1701k2.m5276b() - 1, c1668c2, c1701k2) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void layoutChunk(C1668c2 c1668c2, C1701k2 c1701k2, C1739u0 c1739u0, C1735t0 c1735t0) {
        int i13;
        int i14;
        int i15;
        int iMo5180d;
        int paddingLeft;
        int paddingTop;
        int iMo5180d2;
        int childMeasureSpec;
        int childMeasureSpec2;
        boolean z4;
        int i16;
        View viewM5329b;
        int iMo5186j = this.mOrientationHelper.mo5186j();
        boolean z13 = iMo5186j != 1073741824;
        int i17 = getChildCount() > 0 ? this.f6531c[this.f6530b] : 0;
        if (z13) {
            m5109z();
        }
        boolean z14 = c1739u0.f6875e == 1;
        int iM5105v = this.f6530b;
        if (!z14) {
            iM5105v = m5105v(c1739u0.f6874d, c1668c2, c1701k2) + m5106w(c1739u0.f6874d, c1668c2, c1701k2);
        }
        int i18 = 0;
        while (i18 < this.f6530b && (i16 = c1739u0.f6874d) >= 0 && i16 < c1701k2.m5276b() && iM5105v > 0) {
            int i19 = c1739u0.f6874d;
            int iM5106w = m5106w(i19, c1668c2, c1701k2);
            if (iM5106w > this.f6530b) {
                throw new IllegalArgumentException(AbstractC18489d0.m53371l(AbstractC11266d.m30465s(i19, iM5106w, "Item at position ", " requires ", " spans but GridLayoutManager has only "), this.f6530b, " spans."));
            }
            iM5105v -= iM5106w;
            if (iM5105v < 0 || (viewM5329b = c1739u0.m5329b(c1668c2)) == null) {
                break;
            }
            this.f6532d[i18] = viewM5329b;
            i18++;
        }
        if (i18 == 0) {
            c1735t0.f6863b = true;
            return;
        }
        if (z14) {
            i15 = 1;
            i14 = i18;
            i13 = 0;
        } else {
            i13 = i18 - 1;
            i14 = -1;
            i15 = -1;
        }
        int i24 = 0;
        while (i13 != i14) {
            View view = this.f6532d[i13];
            C1687h0 c1687h0 = (C1687h0) view.getLayoutParams();
            int iM5106w2 = m5106w(getPosition(view), c1668c2, c1701k2);
            c1687h0.f6670f = iM5106w2;
            c1687h0.f6669e = i24;
            i24 += iM5106w2;
            i13 += i15;
        }
        float f13 = 0.0f;
        int i25 = 0;
        for (int i26 = 0; i26 < i18; i26++) {
            View view2 = this.f6532d[i26];
            if (c1739u0.f6881k != null) {
                z4 = false;
                if (z14) {
                    addDisappearingView(view2);
                } else {
                    addDisappearingView(view2, 0);
                }
            } else if (z14) {
                addView(view2);
                z4 = false;
            } else {
                z4 = false;
                addView(view2, 0);
            }
            calculateItemDecorationsForChild(view2, this.f6536h);
            m5107x(view2, iMo5186j, z4);
            int iMo5179c = this.mOrientationHelper.mo5179c(view2);
            if (iMo5179c > i25) {
                i25 = iMo5179c;
            }
            float fMo5180d = (this.mOrientationHelper.mo5180d(view2) * 1.0f) / ((C1687h0) view2.getLayoutParams()).f6670f;
            if (fMo5180d > f13) {
                f13 = fMo5180d;
            }
        }
        if (z13) {
            m5101r(Math.max(Math.round(f13 * this.f6530b), i17));
            i25 = 0;
            for (int i27 = 0; i27 < i18; i27++) {
                View view3 = this.f6532d[i27];
                m5107x(view3, 1073741824, true);
                int iMo5179c2 = this.mOrientationHelper.mo5179c(view3);
                if (iMo5179c2 > i25) {
                    i25 = iMo5179c2;
                }
            }
        }
        for (int i28 = 0; i28 < i18; i28++) {
            View view4 = this.f6532d[i28];
            if (this.mOrientationHelper.mo5179c(view4) != i25) {
                C1687h0 c1687h1 = (C1687h0) view4.getLayoutParams();
                Rect rect = c1687h1.f6892b;
                int i29 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1687h1).topMargin + ((ViewGroup.MarginLayoutParams) c1687h1).bottomMargin;
                int i34 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1687h1).leftMargin + ((ViewGroup.MarginLayoutParams) c1687h1).rightMargin;
                int iM5103t = m5103t(c1687h1.f6669e, c1687h1.f6670f);
                if (this.mOrientation == 1) {
                    childMeasureSpec2 = AbstractC1740u1.getChildMeasureSpec(iM5103t, 1073741824, i34, ((ViewGroup.MarginLayoutParams) c1687h1).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i25 - i29, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i25 - i34, 1073741824);
                    childMeasureSpec = AbstractC1740u1.getChildMeasureSpec(iM5103t, 1073741824, i29, ((ViewGroup.MarginLayoutParams) c1687h1).height, false);
                    childMeasureSpec2 = iMakeMeasureSpec;
                }
                if (shouldReMeasureChild(view4, childMeasureSpec2, childMeasureSpec, (C1744v1) view4.getLayoutParams())) {
                    view4.measure(childMeasureSpec2, childMeasureSpec);
                }
            }
        }
        c1735t0.f6862a = i25;
        if (this.mOrientation != 1) {
            if (c1739u0.f6876f == -1) {
                int i35 = c1739u0.f6872b;
                paddingLeft = i35 - i25;
                iMo5180d = i35;
            } else {
                int i36 = c1739u0.f6872b;
                iMo5180d = i36 + i25;
                paddingLeft = i36;
            }
            paddingTop = 0;
            iMo5180d2 = 0;
        } else if (c1739u0.f6876f == -1) {
            iMo5180d2 = c1739u0.f6872b;
            paddingTop = iMo5180d2 - i25;
            paddingLeft = 0;
            iMo5180d = 0;
        } else {
            int i37 = c1739u0.f6872b;
            paddingTop = i37;
            iMo5180d = 0;
            iMo5180d2 = i37 + i25;
            paddingLeft = 0;
        }
        for (int i38 = 0; i38 < i18; i38++) {
            View view5 = this.f6532d[i38];
            C1687h0 c1687h2 = (C1687h0) view5.getLayoutParams();
            if (this.mOrientation != 1) {
                paddingTop = getPaddingTop() + this.f6531c[c1687h2.f6669e];
                iMo5180d2 = this.mOrientationHelper.mo5180d(view5) + paddingTop;
            } else if (isLayoutRTL()) {
                iMo5180d = this.f6531c[this.f6530b - c1687h2.f6669e] + getPaddingLeft();
                paddingLeft = iMo5180d - this.mOrientationHelper.mo5180d(view5);
            } else {
                paddingLeft = getPaddingLeft() + this.f6531c[c1687h2.f6669e];
                iMo5180d = this.mOrientationHelper.mo5180d(view5) + paddingLeft;
            }
            int i39 = iMo5180d;
            int i44 = paddingLeft;
            int i45 = iMo5180d2;
            layoutDecoratedWithMargins(view5, i44, paddingTop, i39, i45);
            paddingLeft = i44;
            iMo5180d = i39;
            iMo5180d2 = i45;
            if (c1687h2.f6891a.isRemoved() || c1687h2.f6891a.isUpdated()) {
                c1735t0.f6864c = true;
            }
            c1735t0.f6865d = view5.hasFocusable() | c1735t0.f6865d;
        }
        Arrays.fill(this.f6532d, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void onAnchorReady(C1668c2 c1668c2, C1701k2 c1701k2, C1731s0 c1731s0, int i13) {
        super.onAnchorReady(c1668c2, c1701k2, c1731s0, i13);
        m5109z();
        if (c1701k2.m5276b() > 0 && !c1701k2.f6727g) {
            boolean z4 = i13 == 1;
            int iM5105v = m5105v(c1731s0.f6844b, c1668c2, c1701k2);
            if (z4) {
                while (iM5105v > 0) {
                    int i14 = c1731s0.f6844b;
                    if (i14 <= 0) {
                        break;
                    }
                    int i15 = i14 - 1;
                    c1731s0.f6844b = i15;
                    iM5105v = m5105v(i15, c1668c2, c1701k2);
                }
            } else {
                int iM5276b = c1701k2.m5276b() - 1;
                int i16 = c1731s0.f6844b;
                while (i16 < iM5276b) {
                    int i17 = i16 + 1;
                    int iM5105v2 = m5105v(i17, c1668c2, c1701k2);
                    if (iM5105v2 <= iM5105v) {
                        break;
                    }
                    i16 = i17;
                    iM5105v = iM5105v2;
                }
                c1731s0.f6844b = i16;
            }
        }
        m5102s();
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:73:0x0111  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC1740u1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.C1668c2 r26, androidx.recyclerview.widget.C1701k2 r27) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.c2, androidx.recyclerview.widget.k2):android.view.View");
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void onInitializeAccessibilityNodeInfo(C1668c2 c1668c2, C1701k2 c1701k2, C18093f c18093f) {
        super.onInitializeAccessibilityNodeInfo(c1668c2, c1701k2, c18093f);
        c18093f.m51953h(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void onInitializeAccessibilityNodeInfoForItem(C1668c2 c1668c2, C1701k2 c1701k2, View view, C18093f c18093f) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1687h0)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, c18093f);
            return;
        }
        C1687h0 c1687h0 = (C1687h0) layoutParams;
        int iM5104u = m5104u(c1687h0.f6891a.getLayoutPosition(), c1668c2, c1701k2);
        if (this.mOrientation == 0) {
            c18093f.m51955j(C0929d.m2336s(c1687h0.f6669e, c1687h0.f6670f, iM5104u, 1, false));
        } else {
            c18093f.m51955j(C0929d.m2336s(iM5104u, 1, c1687h0.f6669e, c1687h0.f6670f, false));
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void onItemsAdded(RecyclerView recyclerView, int i13, int i14) {
        C38445a c38445a = this.f6535g;
        c38445a.m123185w();
        ((SparseIntArray) c38445a.f164637y).clear();
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void onItemsChanged(RecyclerView recyclerView) {
        C38445a c38445a = this.f6535g;
        c38445a.m123185w();
        ((SparseIntArray) c38445a.f164637y).clear();
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void onItemsMoved(RecyclerView recyclerView, int i13, int i14, int i15) {
        C38445a c38445a = this.f6535g;
        c38445a.m123185w();
        ((SparseIntArray) c38445a.f164637y).clear();
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void onItemsRemoved(RecyclerView recyclerView, int i13, int i14) {
        C38445a c38445a = this.f6535g;
        c38445a.m123185w();
        ((SparseIntArray) c38445a.f164637y).clear();
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void onItemsUpdated(RecyclerView recyclerView, int i13, int i14, Object obj) {
        C38445a c38445a = this.f6535g;
        c38445a.m123185w();
        ((SparseIntArray) c38445a.f164637y).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC1740u1
    public final void onLayoutChildren(C1668c2 c1668c2, C1701k2 c1701k2) {
        boolean z4 = c1701k2.f6727g;
        SparseIntArray sparseIntArray = this.f6534f;
        SparseIntArray sparseIntArray2 = this.f6533e;
        if (z4) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                C1687h0 c1687h0 = (C1687h0) getChildAt(i13).getLayoutParams();
                int layoutPosition = c1687h0.f6891a.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, c1687h0.f6670f);
                sparseIntArray.put(layoutPosition, c1687h0.f6669e);
            }
        }
        super.onLayoutChildren(c1668c2, c1701k2);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC1740u1
    public final void onLayoutCompleted(C1701k2 c1701k2) {
        super.onLayoutCompleted(c1701k2);
        this.f6529a = false;
    }

    /* JADX INFO: renamed from: r */
    public final void m5101r(int i13) {
        int i14;
        int[] iArr = this.f6531c;
        int i15 = this.f6530b;
        if (iArr == null || iArr.length != i15 + 1 || iArr[iArr.length - 1] != i13) {
            iArr = new int[i15 + 1];
        }
        int i16 = 0;
        iArr[0] = 0;
        int i17 = i13 / i15;
        int i18 = i13 % i15;
        int i19 = 0;
        for (int i24 = 1; i24 <= i15; i24++) {
            i16 += i18;
            if (i16 <= 0 || i15 - i16 >= i18) {
                i14 = i17;
            } else {
                i14 = i17 + 1;
                i16 -= i15;
            }
            i19 += i14;
            iArr[i24] = i19;
        }
        this.f6531c = iArr;
    }

    /* JADX INFO: renamed from: s */
    public final void m5102s() {
        View[] viewArr = this.f6532d;
        if (viewArr == null || viewArr.length != this.f6530b) {
            this.f6532d = new View[this.f6530b];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC1740u1
    public final int scrollHorizontallyBy(int i13, C1668c2 c1668c2, C1701k2 c1701k2) {
        m5109z();
        m5102s();
        return super.scrollHorizontallyBy(i13, c1668c2, c1701k2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC1740u1
    public final int scrollVerticallyBy(int i13, C1668c2 c1668c2, C1701k2 c1701k2) {
        m5109z();
        m5102s();
        return super.scrollVerticallyBy(i13, c1668c2, c1701k2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void setMeasuredDimension(Rect rect, int i13, int i14) {
        int iChooseSize;
        int iChooseSize2;
        if (this.f6531c == null) {
            super.setMeasuredDimension(rect, i13, i14);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            iChooseSize2 = AbstractC1740u1.chooseSize(i14, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.f6531c;
            iChooseSize = AbstractC1740u1.chooseSize(i13, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = AbstractC1740u1.chooseSize(i13, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.f6531c;
            iChooseSize2 = AbstractC1740u1.chooseSize(i14, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void setStackFromEnd(boolean z4) {
        if (z4) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC1740u1
    public final boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.f6529a;
    }

    /* JADX INFO: renamed from: t */
    public final int m5103t(int i13, int i14) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.f6531c;
            return iArr[i14 + i13] - iArr[i13];
        }
        int[] iArr2 = this.f6531c;
        int i15 = this.f6530b;
        return iArr2[i15 - i13] - iArr2[(i15 - i13) - i14];
    }

    /* JADX INFO: renamed from: u */
    public final int m5104u(int i13, C1668c2 c1668c2, C1701k2 c1701k2) {
        boolean z4 = c1701k2.f6727g;
        C38445a c38445a = this.f6535g;
        if (!z4) {
            int i14 = this.f6530b;
            c38445a.getClass();
            return C38445a.m123163u(i13, i14);
        }
        int iM5196b = c1668c2.m5196b(i13);
        if (iM5196b == -1) {
            AbstractC2875y.m8313z(i13, "Cannot find span size for pre layout position. ", "GridLayoutManager");
            return 0;
        }
        int i15 = this.f6530b;
        c38445a.getClass();
        return C38445a.m123163u(iM5196b, i15);
    }

    /* JADX INFO: renamed from: v */
    public final int m5105v(int i13, C1668c2 c1668c2, C1701k2 c1701k2) {
        boolean z4 = c1701k2.f6727g;
        C38445a c38445a = this.f6535g;
        if (!z4) {
            int i14 = this.f6530b;
            c38445a.getClass();
            return i13 % i14;
        }
        int i15 = this.f6534f.get(i13, -1);
        if (i15 != -1) {
            return i15;
        }
        int iM5196b = c1668c2.m5196b(i13);
        if (iM5196b == -1) {
            AbstractC2875y.m8313z(i13, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", "GridLayoutManager");
            return 0;
        }
        int i16 = this.f6530b;
        c38445a.getClass();
        return iM5196b % i16;
    }

    /* JADX INFO: renamed from: w */
    public final int m5106w(int i13, C1668c2 c1668c2, C1701k2 c1701k2) {
        boolean z4 = c1701k2.f6727g;
        C38445a c38445a = this.f6535g;
        if (!z4) {
            c38445a.getClass();
            return 1;
        }
        int i14 = this.f6533e.get(i13, -1);
        if (i14 != -1) {
            return i14;
        }
        if (c1668c2.m5196b(i13) == -1) {
            AbstractC2875y.m8313z(i13, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", "GridLayoutManager");
            return 1;
        }
        c38445a.getClass();
        return 1;
    }

    /* JADX INFO: renamed from: x */
    public final void m5107x(View view, int i13, boolean z4) {
        int childMeasureSpec;
        int childMeasureSpec2;
        C1687h0 c1687h0 = (C1687h0) view.getLayoutParams();
        Rect rect = c1687h0.f6892b;
        int i14 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1687h0).topMargin + ((ViewGroup.MarginLayoutParams) c1687h0).bottomMargin;
        int i15 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1687h0).leftMargin + ((ViewGroup.MarginLayoutParams) c1687h0).rightMargin;
        int iM5103t = m5103t(c1687h0.f6669e, c1687h0.f6670f);
        if (this.mOrientation == 1) {
            childMeasureSpec2 = AbstractC1740u1.getChildMeasureSpec(iM5103t, i13, i15, ((ViewGroup.MarginLayoutParams) c1687h0).width, false);
            childMeasureSpec = AbstractC1740u1.getChildMeasureSpec(this.mOrientationHelper.mo5188l(), getHeightMode(), i14, ((ViewGroup.MarginLayoutParams) c1687h0).height, true);
        } else {
            int childMeasureSpec3 = AbstractC1740u1.getChildMeasureSpec(iM5103t, i13, i14, ((ViewGroup.MarginLayoutParams) c1687h0).height, false);
            int childMeasureSpec4 = AbstractC1740u1.getChildMeasureSpec(this.mOrientationHelper.mo5188l(), getWidthMode(), i15, ((ViewGroup.MarginLayoutParams) c1687h0).width, true);
            childMeasureSpec = childMeasureSpec3;
            childMeasureSpec2 = childMeasureSpec4;
        }
        C1744v1 c1744v1 = (C1744v1) view.getLayoutParams();
        if (z4 ? shouldReMeasureChild(view, childMeasureSpec2, childMeasureSpec, c1744v1) : shouldMeasureChild(view, childMeasureSpec2, childMeasureSpec, c1744v1)) {
            view.measure(childMeasureSpec2, childMeasureSpec);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m5108y(int i13) {
        if (i13 == this.f6530b) {
            return;
        }
        this.f6529a = true;
        if (i13 < 1) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Span count should be at least 1. Provided "));
        }
        this.f6530b = i13;
        this.f6535g.m123185w();
        requestLayout();
    }

    /* JADX INFO: renamed from: z */
    public final void m5109z() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        m5101r(height - paddingTop);
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final C1744v1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C1687h0 c1687h0 = new C1687h0((ViewGroup.MarginLayoutParams) layoutParams);
            c1687h0.f6669e = -1;
            c1687h0.f6670f = 0;
            return c1687h0;
        }
        C1687h0 c1687h1 = new C1687h0(layoutParams);
        c1687h1.f6669e = -1;
        c1687h1.f6670f = 0;
        return c1687h1;
    }

    public GridLayoutManager(int i13, int i14) {
        super(1);
        this.f6529a = false;
        this.f6530b = -1;
        this.f6533e = new SparseIntArray();
        this.f6534f = new SparseIntArray();
        this.f6535g = new C38445a(3);
        this.f6536h = new Rect();
        m5108y(i13);
    }

    public GridLayoutManager(int i13) {
        super(1);
        this.f6529a = false;
        this.f6530b = -1;
        this.f6533e = new SparseIntArray();
        this.f6534f = new SparseIntArray();
        this.f6535g = new C38445a(3);
        this.f6536h = new Rect();
        m5108y(i13);
    }
}
