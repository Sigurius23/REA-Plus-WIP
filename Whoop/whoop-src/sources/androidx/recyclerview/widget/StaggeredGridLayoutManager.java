package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import p078d1.C11457j;
import p319m4.AbstractC25012a;

/* JADX INFO: loaded from: classes5.dex */
public class StaggeredGridLayoutManager extends AbstractC1740u1 implements InterfaceC1693i2 {

    /* JADX INFO: renamed from: a */
    public int f6537a;

    /* JADX INFO: renamed from: b */
    public C1749w2[] f6538b;

    /* JADX INFO: renamed from: c */
    public final AbstractC1667c1 f6539c;

    /* JADX INFO: renamed from: d */
    public final AbstractC1667c1 f6540d;

    /* JADX INFO: renamed from: e */
    public final int f6541e;

    /* JADX INFO: renamed from: f */
    public int f6542f;

    /* JADX INFO: renamed from: g */
    public final C1727r0 f6543g;

    /* JADX INFO: renamed from: h */
    public boolean f6544h;

    /* JADX INFO: renamed from: i */
    public boolean f6545i;

    /* JADX INFO: renamed from: j */
    public BitSet f6546j;

    /* JADX INFO: renamed from: k */
    public int f6547k;

    /* JADX INFO: renamed from: l */
    public int f6548l;

    /* JADX INFO: renamed from: m */
    public final C11457j f6549m;

    /* JADX INFO: renamed from: n */
    public final int f6550n;

    /* JADX INFO: renamed from: o */
    public boolean f6551o;

    /* JADX INFO: renamed from: p */
    public boolean f6552p;

    /* JADX INFO: renamed from: q */
    public C1745v2 f6553q;

    /* JADX INFO: renamed from: r */
    public final Rect f6554r;

    /* JADX INFO: renamed from: s */
    public final C1733s2 f6555s;

    /* JADX INFO: renamed from: t */
    public final boolean f6556t;

    /* JADX INFO: renamed from: u */
    public int[] f6557u;

    /* JADX INFO: renamed from: v */
    public final RunnableC1758z f6558v;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i13, int i14) {
        this.f6537a = -1;
        this.f6544h = false;
        this.f6545i = false;
        this.f6547k = -1;
        this.f6548l = Integer.MIN_VALUE;
        this.f6549m = new C11457j(4, false);
        this.f6550n = 2;
        this.f6554r = new Rect();
        this.f6555s = new C1733s2(this);
        this.f6556t = true;
        this.f6558v = new RunnableC1758z(this, 2);
        C1736t1 properties = AbstractC1740u1.getProperties(context, attributeSet, i13, i14);
        int i15 = properties.f6866a;
        if (i15 != 0 && i15 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i15 != this.f6541e) {
            this.f6541e = i15;
            AbstractC1667c1 abstractC1667c1 = this.f6539c;
            this.f6539c = this.f6540d;
            this.f6540d = abstractC1667c1;
            requestLayout();
        }
        m5164z(properties.f6867b);
        boolean z4 = properties.f6868c;
        assertNotInLayoutOrScroll(null);
        C1745v2 c1745v2 = this.f6553q;
        if (c1745v2 != null && c1745v2.f6898H != z4) {
            c1745v2.f6898H = z4;
        }
        this.f6544h = z4;
        requestLayout();
        this.f6543g = new C1727r0();
        this.f6539c = AbstractC1667c1.m5193a(this, this.f6541e);
        this.f6540d = AbstractC1667c1.m5193a(this, 1 - this.f6541e);
    }

    /* JADX INFO: renamed from: C */
    public static int m5139C(int i13, int i14, int i15) {
        int mode;
        return (!(i14 == 0 && i15 == 0) && ((mode = View.MeasureSpec.getMode(i13)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i13) - i14) - i15), mode) : i13;
    }

    /* JADX INFO: renamed from: A */
    public final void m5140A(int i13, C1701k2 c1701k2) {
        int iMo5188l;
        int iMo5188l2;
        int i14;
        C1727r0 c1727r0 = this.f6543g;
        boolean z4 = false;
        c1727r0.f6828b = 0;
        c1727r0.f6829c = i13;
        if (!isSmoothScrolling() || (i14 = c1701k2.f6721a) == -1) {
            iMo5188l = 0;
            iMo5188l2 = 0;
        } else {
            if (this.f6545i == (i14 < i13)) {
                iMo5188l = this.f6539c.mo5188l();
                iMo5188l2 = 0;
            } else {
                iMo5188l2 = this.f6539c.mo5188l();
                iMo5188l = 0;
            }
        }
        if (getClipToPadding()) {
            c1727r0.f6832f = this.f6539c.mo5187k() - iMo5188l2;
            c1727r0.f6833g = this.f6539c.mo5183g() + iMo5188l;
        } else {
            c1727r0.f6833g = this.f6539c.mo5182f() + iMo5188l;
            c1727r0.f6832f = -iMo5188l2;
        }
        c1727r0.f6834h = false;
        c1727r0.f6827a = true;
        if (this.f6539c.mo5185i() == 0 && this.f6539c.mo5182f() == 0) {
            z4 = true;
        }
        c1727r0.f6835i = z4;
    }

    /* JADX INFO: renamed from: B */
    public final void m5141B(C1749w2 c1749w2, int i13, int i14) {
        int i15 = c1749w2.f6915d;
        int i16 = c1749w2.f6916e;
        if (i13 != -1) {
            int i17 = c1749w2.f6914c;
            if (i17 == Integer.MIN_VALUE) {
                c1749w2.m5335a();
                i17 = c1749w2.f6914c;
            }
            if (i17 - i15 >= i14) {
                this.f6546j.set(i16, false);
                return;
            }
            return;
        }
        int i18 = c1749w2.f6913b;
        if (i18 == Integer.MIN_VALUE) {
            View view = (View) c1749w2.f6912a.get(0);
            C1737t2 c1737t2 = (C1737t2) view.getLayoutParams();
            c1749w2.f6913b = c1749w2.f6917f.f6539c.mo5181e(view);
            c1737t2.getClass();
            i18 = c1749w2.f6913b;
        }
        if (i18 + i15 <= i14) {
            this.f6546j.set(i16, false);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void assertNotInLayoutOrScroll(String str) {
        if (this.f6553q == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final boolean canScrollHorizontally() {
        return this.f6541e == 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final boolean canScrollVertically() {
        return this.f6541e == 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final boolean checkLayoutParams(C1744v1 c1744v1) {
        return c1744v1 instanceof C1737t2;
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void collectAdjacentPrefetchPositions(int i13, int i14, C1701k2 c1701k2, InterfaceC1732s1 interfaceC1732s1) {
        C1727r0 c1727r0;
        int iM5340f;
        int iM5342h;
        if (this.f6541e != 0) {
            i13 = i14;
        }
        if (getChildCount() == 0 || i13 == 0) {
            return;
        }
        m5158t(i13, c1701k2);
        int[] iArr = this.f6557u;
        if (iArr == null || iArr.length < this.f6537a) {
            this.f6557u = new int[this.f6537a];
        }
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int i17 = this.f6537a;
            c1727r0 = this.f6543g;
            if (i15 >= i17) {
                break;
            }
            if (c1727r0.f6830d == -1) {
                iM5340f = c1727r0.f6832f;
                iM5342h = this.f6538b[i15].m5342h(iM5340f);
            } else {
                iM5340f = this.f6538b[i15].m5340f(c1727r0.f6833g);
                iM5342h = c1727r0.f6833g;
            }
            int i18 = iM5340f - iM5342h;
            if (i18 >= 0) {
                this.f6557u[i16] = i18;
                i16++;
            }
            i15++;
        }
        Arrays.sort(this.f6557u, 0, i16);
        for (int i19 = 0; i19 < i16; i19++) {
            int i24 = c1727r0.f6829c;
            if (i24 < 0 || i24 >= c1701k2.m5276b()) {
                return;
            }
            ((C1675e0) interfaceC1732s1).m5231a(c1727r0.f6829c, this.f6557u[i19]);
            c1727r0.f6829c += c1727r0.f6830d;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final int computeHorizontalScrollExtent(C1701k2 c1701k2) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z4 = !this.f6556t;
        return AbstractC1670d.m5213d(c1701k2, this.f6539c, m5146h(z4), m5145g(z4), this, this.f6556t);
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final int computeHorizontalScrollOffset(C1701k2 c1701k2) {
        return m5143e(c1701k2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final int computeHorizontalScrollRange(C1701k2 c1701k2) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z4 = !this.f6556t;
        return AbstractC1670d.m5215f(c1701k2, this.f6539c, m5146h(z4), m5145g(z4), this, this.f6556t);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    @Override // androidx.recyclerview.widget.InterfaceC1693i2
    public final PointF computeScrollVectorForPosition(int i13) {
        int i14 = -1;
        if (getChildCount() != 0) {
            if ((i13 < m5149k()) == this.f6545i) {
                i14 = 1;
            }
        } else if (this.f6545i) {
            i14 = 1;
        }
        PointF pointF = new PointF();
        if (i14 == 0) {
            return null;
        }
        if (this.f6541e == 0) {
            pointF.x = i14;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i14;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final int computeVerticalScrollExtent(C1701k2 c1701k2) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z4 = !this.f6556t;
        return AbstractC1670d.m5213d(c1701k2, this.f6539c, m5146h(z4), m5145g(z4), this, this.f6556t);
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final int computeVerticalScrollOffset(C1701k2 c1701k2) {
        return m5143e(c1701k2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final int computeVerticalScrollRange(C1701k2 c1701k2) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z4 = !this.f6556t;
        return AbstractC1670d.m5215f(c1701k2, this.f6539c, m5146h(z4), m5145g(z4), this, this.f6556t);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m5142d() {
        int iM5149k;
        if (getChildCount() != 0 && this.f6550n != 0 && isAttachedToWindow()) {
            if (this.f6545i) {
                iM5149k = m5150l();
                m5149k();
            } else {
                iM5149k = m5149k();
                m5150l();
            }
            if (iM5149k == 0 && m5154p() != null) {
                this.f6549m.clear();
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final int m5143e(C1701k2 c1701k2) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z4 = !this.f6556t;
        return AbstractC1670d.m5214e(c1701k2, this.f6539c, m5146h(z4), m5145g(z4), this, this.f6556t, this.f6545i);
    }

    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean, int] */
    /* JADX INFO: renamed from: f */
    public final int m5144f(C1668c2 c1668c2, C1727r0 c1727r0, C1701k2 c1701k2) {
        C1749w2 c1749w2;
        ?? r10;
        int iM5342h;
        int iMo5179c;
        int iMo5187k;
        int iMo5179c2;
        int i13;
        int i14;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        int i15 = 0;
        int i16 = 1;
        staggeredGridLayoutManager.f6546j.set(0, staggeredGridLayoutManager.f6537a, true);
        C1727r0 c1727r1 = staggeredGridLayoutManager.f6543g;
        int i17 = c1727r1.f6835i ? c1727r0.f6831e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c1727r0.f6831e == 1 ? c1727r0.f6833g + c1727r0.f6828b : c1727r0.f6832f - c1727r0.f6828b;
        int i18 = c1727r0.f6831e;
        for (int i19 = 0; i19 < staggeredGridLayoutManager.f6537a; i19++) {
            if (!staggeredGridLayoutManager.f6538b[i19].f6912a.isEmpty()) {
                staggeredGridLayoutManager.m5141B(staggeredGridLayoutManager.f6538b[i19], i18, i17);
            }
        }
        int iMo5183g = staggeredGridLayoutManager.f6545i ? staggeredGridLayoutManager.f6539c.mo5183g() : staggeredGridLayoutManager.f6539c.mo5187k();
        boolean z4 = false;
        while (true) {
            int i24 = c1727r0.f6829c;
            int i25 = -1;
            if (i24 < 0 || i24 >= c1701k2.m5276b() || (!c1727r1.f6835i && staggeredGridLayoutManager.f6546j.isEmpty())) {
                break;
            }
            View view = c1668c2.m5205l(c1727r0.f6829c, Long.MAX_VALUE).itemView;
            c1727r0.f6829c += c1727r0.f6830d;
            C1737t2 c1737t2 = (C1737t2) view.getLayoutParams();
            int layoutPosition = c1737t2.f6891a.getLayoutPosition();
            C11457j c11457j = staggeredGridLayoutManager.f6549m;
            int[] iArr = (int[]) c11457j.f36753x;
            int i26 = (iArr == null || layoutPosition >= iArr.length) ? -1 : iArr[layoutPosition];
            if (i26 == -1) {
                if (staggeredGridLayoutManager.m5157s(c1727r0.f6831e)) {
                    i13 = staggeredGridLayoutManager.f6537a - i16;
                    i14 = -1;
                } else {
                    i25 = staggeredGridLayoutManager.f6537a;
                    i13 = i15;
                    i14 = i16;
                }
                C1749w2 c1749w3 = null;
                if (c1727r0.f6831e == i16) {
                    int iMo5187k2 = staggeredGridLayoutManager.f6539c.mo5187k();
                    int i27 = Integer.MAX_VALUE;
                    while (i13 != i25) {
                        C1749w2 c1749w4 = staggeredGridLayoutManager.f6538b[i13];
                        int i28 = i14;
                        int iM5340f = c1749w4.m5340f(iMo5187k2);
                        if (iM5340f < i27) {
                            c1749w3 = c1749w4;
                            i27 = iM5340f;
                        }
                        i13 += i28;
                        i14 = i28;
                    }
                } else {
                    int i29 = i14;
                    int iMo5183g2 = staggeredGridLayoutManager.f6539c.mo5183g();
                    int i34 = Integer.MIN_VALUE;
                    while (i13 != i25) {
                        C1749w2 c1749w5 = staggeredGridLayoutManager.f6538b[i13];
                        int iM5342h2 = c1749w5.m5342h(iMo5183g2);
                        if (iM5342h2 > i34) {
                            c1749w3 = c1749w5;
                            i34 = iM5342h2;
                        }
                        i13 += i29;
                    }
                }
                c1749w2 = c1749w3;
                c11457j.m30750u(layoutPosition);
                ((int[]) c11457j.f36753x)[layoutPosition] = c1749w2.f6916e;
            } else {
                c1749w2 = staggeredGridLayoutManager.f6538b[i26];
            }
            C1749w2 c1749w6 = c1749w2;
            c1737t2.f6870e = c1749w6;
            if (c1727r0.f6831e == 1) {
                staggeredGridLayoutManager.addView(view);
                r10 = 0;
            } else {
                r10 = 0;
                staggeredGridLayoutManager.addView(view, 0);
            }
            if (staggeredGridLayoutManager.f6541e == 1) {
                staggeredGridLayoutManager.m5155q(view, AbstractC1740u1.getChildMeasureSpec(staggeredGridLayoutManager.f6542f, staggeredGridLayoutManager.getWidthMode(), r10, ((ViewGroup.MarginLayoutParams) c1737t2).width, r10), AbstractC1740u1.getChildMeasureSpec(staggeredGridLayoutManager.getHeight(), staggeredGridLayoutManager.getHeightMode(), staggeredGridLayoutManager.getPaddingBottom() + staggeredGridLayoutManager.getPaddingTop(), ((ViewGroup.MarginLayoutParams) c1737t2).height, true));
            } else {
                staggeredGridLayoutManager.m5155q(view, AbstractC1740u1.getChildMeasureSpec(staggeredGridLayoutManager.getWidth(), staggeredGridLayoutManager.getWidthMode(), staggeredGridLayoutManager.getPaddingRight() + staggeredGridLayoutManager.getPaddingLeft(), ((ViewGroup.MarginLayoutParams) c1737t2).width, true), AbstractC1740u1.getChildMeasureSpec(staggeredGridLayoutManager.f6542f, staggeredGridLayoutManager.getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) c1737t2).height, false));
            }
            if (c1727r0.f6831e == 1) {
                iMo5179c = c1749w6.m5340f(iMo5183g);
                iM5342h = staggeredGridLayoutManager.f6539c.mo5179c(view) + iMo5179c;
            } else {
                iM5342h = c1749w6.m5342h(iMo5183g);
                iMo5179c = iM5342h - staggeredGridLayoutManager.f6539c.mo5179c(view);
            }
            if (c1727r0.f6831e == 1) {
                C1749w2 c1749w7 = c1737t2.f6870e;
                c1749w7.getClass();
                C1737t2 c1737t3 = (C1737t2) view.getLayoutParams();
                c1737t3.f6870e = c1749w7;
                ArrayList arrayList = c1749w7.f6912a;
                arrayList.add(view);
                c1749w7.f6914c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    c1749w7.f6913b = Integer.MIN_VALUE;
                }
                if (c1737t3.f6891a.isRemoved() || c1737t3.f6891a.isUpdated()) {
                    c1749w7.f6915d = c1749w7.f6917f.f6539c.mo5179c(view) + c1749w7.f6915d;
                }
            } else {
                C1749w2 c1749w8 = c1737t2.f6870e;
                c1749w8.getClass();
                C1737t2 c1737t4 = (C1737t2) view.getLayoutParams();
                c1737t4.f6870e = c1749w8;
                ArrayList arrayList2 = c1749w8.f6912a;
                arrayList2.add(0, view);
                c1749w8.f6913b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    c1749w8.f6914c = Integer.MIN_VALUE;
                }
                if (c1737t4.f6891a.isRemoved() || c1737t4.f6891a.isUpdated()) {
                    c1749w8.f6915d = c1749w8.f6917f.f6539c.mo5179c(view) + c1749w8.f6915d;
                }
            }
            if (staggeredGridLayoutManager.isLayoutRTL() && staggeredGridLayoutManager.f6541e == 1) {
                iMo5179c2 = staggeredGridLayoutManager.f6540d.mo5183g() - (((staggeredGridLayoutManager.f6537a - 1) - c1749w6.f6916e) * staggeredGridLayoutManager.f6542f);
                iMo5187k = iMo5179c2 - staggeredGridLayoutManager.f6540d.mo5179c(view);
            } else {
                iMo5187k = staggeredGridLayoutManager.f6540d.mo5187k() + (c1749w6.f6916e * staggeredGridLayoutManager.f6542f);
                iMo5179c2 = staggeredGridLayoutManager.f6540d.mo5179c(view) + iMo5187k;
            }
            int i35 = iMo5187k;
            int i36 = iMo5179c2;
            if (staggeredGridLayoutManager.f6541e == 1) {
                staggeredGridLayoutManager.layoutDecoratedWithMargins(view, i35, iMo5179c, i36, iM5342h);
                staggeredGridLayoutManager = this;
            } else {
                staggeredGridLayoutManager.layoutDecoratedWithMargins(view, iMo5179c, i35, iM5342h, i36);
            }
            staggeredGridLayoutManager.m5141B(c1749w6, c1727r1.f6831e, i17);
            staggeredGridLayoutManager.m5159u(c1668c2, c1727r1);
            if (c1727r1.f6834h && view.hasFocusable()) {
                staggeredGridLayoutManager.f6546j.set(c1749w6.f6916e, false);
            }
            z4 = true;
            i16 = 1;
            i15 = 0;
        }
        if (!z4) {
            staggeredGridLayoutManager.m5159u(c1668c2, c1727r1);
        }
        int iMo5187k3 = c1727r1.f6831e == -1 ? staggeredGridLayoutManager.f6539c.mo5187k() - staggeredGridLayoutManager.m5152n(staggeredGridLayoutManager.f6539c.mo5187k()) : staggeredGridLayoutManager.m5151m(staggeredGridLayoutManager.f6539c.mo5183g()) - staggeredGridLayoutManager.f6539c.mo5183g();
        if (iMo5187k3 > 0) {
            return Math.min(c1727r0.f6828b, iMo5187k3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public final View m5145g(boolean z4) {
        int iMo5187k = this.f6539c.mo5187k();
        int iMo5183g = this.f6539c.mo5183g();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int iMo5181e = this.f6539c.mo5181e(childAt);
            int iMo5178b = this.f6539c.mo5178b(childAt);
            if (iMo5178b > iMo5187k && iMo5181e < iMo5183g) {
                if (iMo5178b <= iMo5183g || !z4) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final C1744v1 generateDefaultLayoutParams() {
        return this.f6541e == 0 ? new C1737t2(-2, -1) : new C1737t2(-1, -2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final C1744v1 generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C1737t2(context, attributeSet);
    }

    /* JADX INFO: renamed from: h */
    public final View m5146h(boolean z4) {
        int iMo5187k = this.f6539c.mo5187k();
        int iMo5183g = this.f6539c.mo5183g();
        int childCount = getChildCount();
        View view = null;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            int iMo5181e = this.f6539c.mo5181e(childAt);
            if (this.f6539c.mo5178b(childAt) > iMo5187k && iMo5181e < iMo5183g) {
                if (iMo5181e >= iMo5187k || !z4) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: i */
    public final void m5147i(C1668c2 c1668c2, C1701k2 c1701k2, boolean z4) {
        int iMo5183g;
        int iM5151m = m5151m(Integer.MIN_VALUE);
        if (iM5151m != Integer.MIN_VALUE && (iMo5183g = this.f6539c.mo5183g() - iM5151m) > 0) {
            int i13 = iMo5183g - (-scrollBy(-iMo5183g, c1668c2, c1701k2));
            if (!z4 || i13 <= 0) {
                return;
            }
            this.f6539c.mo5191o(i13);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final boolean isAutoMeasureEnabled() {
        return this.f6550n != 0;
    }

    public final boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: j */
    public final void m5148j(C1668c2 c1668c2, C1701k2 c1701k2, boolean z4) {
        int iMo5187k;
        int iM5152n = m5152n(Integer.MAX_VALUE);
        if (iM5152n != Integer.MAX_VALUE && (iMo5187k = iM5152n - this.f6539c.mo5187k()) > 0) {
            int iScrollBy = iMo5187k - scrollBy(iMo5187k, c1668c2, c1701k2);
            if (!z4 || iScrollBy <= 0) {
                return;
            }
            this.f6539c.mo5191o(-iScrollBy);
        }
    }

    /* JADX INFO: renamed from: k */
    public final int m5149k() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    /* JADX INFO: renamed from: l */
    public final int m5150l() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    /* JADX INFO: renamed from: m */
    public final int m5151m(int i13) {
        int iM5340f = this.f6538b[0].m5340f(i13);
        for (int i14 = 1; i14 < this.f6537a; i14++) {
            int iM5340f2 = this.f6538b[i14].m5340f(i13);
            if (iM5340f2 > iM5340f) {
                iM5340f = iM5340f2;
            }
        }
        return iM5340f;
    }

    /* JADX INFO: renamed from: n */
    public final int m5152n(int i13) {
        int iM5342h = this.f6538b[0].m5342h(i13);
        for (int i14 = 1; i14 < this.f6537a; i14++) {
            int iM5342h2 = this.f6538b[i14].m5342h(i13);
            if (iM5342h2 < iM5342h) {
                iM5342h = iM5342h2;
            }
        }
        return iM5342h;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0036 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0039  */
    /* JADX WARN: Code duplicated, block: B:26:0x0041  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050 A[LOOP:0: B:25:0x003f->B:29:0x0050, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053 A[EDGE_INSN: B:30:0x0053->B:31:0x0054 BREAK  A[LOOP:0: B:25:0x003f->B:29:0x0050]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x0077 A[LOOP:1: B:34:0x0066->B:38:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0092  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00db  */
    /* JADX WARN: Code duplicated, block: B:63:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0054 A[EDGE_INSN: B:64:0x0054->B:31:0x0054 BREAK  A[LOOP:0: B:25:0x003f->B:29:0x0050], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x007b A[EDGE_INSN: B:66:0x007b->B:40:0x007b BREAK  A[LOOP:1: B:34:0x0066->B:38:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: o */
    public final void m5153o(int i13, int i14, int i15) {
        int i16;
        int i17;
        C11457j c11457j;
        int[] iArr;
        int iM5150l;
        ArrayList arrayList;
        C1741u2 c1741u2;
        int size;
        int i18;
        int i19;
        int size2;
        int iM5150l2 = this.f6545i ? m5150l() : m5149k();
        if (i15 == 8) {
            if (i13 < i14) {
                i16 = i14 + 1;
            } else {
                i16 = i13 + 1;
                i17 = i14;
            }
            c11457j = this.f6549m;
            iArr = (int[]) c11457j.f36753x;
            if (iArr != null && i17 < iArr.length) {
                arrayList = (ArrayList) c11457j.f36754y;
                if (arrayList != null) {
                    if (arrayList == null) {
                        size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                c1741u2 = null;
                                break;
                            }
                            c1741u2 = (C1741u2) ((ArrayList) c11457j.f36754y).get(size2);
                            if (c1741u2.f6883w == i17) {
                                break;
                            } else {
                                size2--;
                            }
                        }
                    } else {
                        c1741u2 = null;
                        break;
                    }
                    if (c1741u2 != null) {
                        ((ArrayList) c11457j.f36754y).remove(c1741u2);
                    }
                    size = ((ArrayList) c11457j.f36754y).size();
                    i18 = 0;
                    while (true) {
                        if (i18 < size) {
                            i18 = -1;
                            break;
                        } else if (((C1741u2) ((ArrayList) c11457j.f36754y).get(i18)).f6883w >= i17) {
                            break;
                        } else {
                            i18++;
                        }
                    }
                    if (i18 != -1) {
                        C1741u2 c1741u3 = (C1741u2) ((ArrayList) c11457j.f36754y).get(i18);
                        ((ArrayList) c11457j.f36754y).remove(i18);
                        i19 = c1741u3.f6883w;
                    } else {
                        i19 = -1;
                    }
                } else {
                    i19 = -1;
                }
                if (i19 == -1) {
                    int[] iArr2 = (int[]) c11457j.f36753x;
                    Arrays.fill(iArr2, i17, iArr2.length, -1);
                    int length = ((int[]) c11457j.f36753x).length;
                } else {
                    Arrays.fill((int[]) c11457j.f36753x, i17, Math.min(i19 + 1, ((int[]) c11457j.f36753x).length), -1);
                }
            }
            if (i15 != 1) {
                c11457j.m30734D(i13, i14);
            } else if (i15 != 2) {
                c11457j.m30735E(i13, i14);
            } else if (i15 == 8) {
                c11457j.m30735E(i13, 1);
                c11457j.m30734D(i14, 1);
            }
            if (i16 <= iM5150l2) {
                return;
            }
            if (this.f6545i) {
                iM5150l = m5149k();
            } else {
                iM5150l = m5150l();
            }
            if (i17 <= iM5150l) {
                requestLayout();
            }
        }
        i16 = i13 + i14;
        i17 = i13;
        c11457j = this.f6549m;
        iArr = (int[]) c11457j.f36753x;
        if (iArr != null) {
            arrayList = (ArrayList) c11457j.f36754y;
            if (arrayList != null) {
                if (arrayList == null) {
                    size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 >= 0) {
                            c1741u2 = null;
                            break;
                        }
                        c1741u2 = (C1741u2) ((ArrayList) c11457j.f36754y).get(size2);
                        if (c1741u2.f6883w == i17) {
                            break;
                            break;
                        }
                        size2--;
                    }
                } else {
                    c1741u2 = null;
                    break;
                }
                if (c1741u2 != null) {
                    ((ArrayList) c11457j.f36754y).remove(c1741u2);
                }
                size = ((ArrayList) c11457j.f36754y).size();
                i18 = 0;
                while (true) {
                    if (i18 < size) {
                        i18 = -1;
                        break;
                    } else {
                        if (((C1741u2) ((ArrayList) c11457j.f36754y).get(i18)).f6883w >= i17) {
                            break;
                            break;
                        }
                        i18++;
                    }
                }
                if (i18 != -1) {
                    C1741u2 c1741u4 = (C1741u2) ((ArrayList) c11457j.f36754y).get(i18);
                    ((ArrayList) c11457j.f36754y).remove(i18);
                    i19 = c1741u4.f6883w;
                } else {
                    i19 = -1;
                }
            } else {
                i19 = -1;
            }
            if (i19 == -1) {
                int[] iArr3 = (int[]) c11457j.f36753x;
                Arrays.fill(iArr3, i17, iArr3.length, -1);
                int length2 = ((int[]) c11457j.f36753x).length;
            } else {
                Arrays.fill((int[]) c11457j.f36753x, i17, Math.min(i19 + 1, ((int[]) c11457j.f36753x).length), -1);
            }
        }
        if (i15 != 1) {
            c11457j.m30734D(i13, i14);
        } else if (i15 != 2) {
            c11457j.m30735E(i13, i14);
        } else if (i15 == 8) {
            c11457j.m30735E(i13, 1);
            c11457j.m30734D(i14, 1);
        }
        if (i16 <= iM5150l2) {
            return;
        }
        if (this.f6545i) {
            iM5150l = m5149k();
        } else {
            iM5150l = m5150l();
        }
        if (i17 <= iM5150l) {
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void offsetChildrenHorizontal(int i13) {
        super.offsetChildrenHorizontal(i13);
        for (int i14 = 0; i14 < this.f6537a; i14++) {
            C1749w2 c1749w2 = this.f6538b[i14];
            int i15 = c1749w2.f6913b;
            if (i15 != Integer.MIN_VALUE) {
                c1749w2.f6913b = i15 + i13;
            }
            int i16 = c1749w2.f6914c;
            if (i16 != Integer.MIN_VALUE) {
                c1749w2.f6914c = i16 + i13;
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void offsetChildrenVertical(int i13) {
        super.offsetChildrenVertical(i13);
        for (int i14 = 0; i14 < this.f6537a; i14++) {
            C1749w2 c1749w2 = this.f6538b[i14];
            int i15 = c1749w2.f6913b;
            if (i15 != Integer.MIN_VALUE) {
                c1749w2.f6913b = i15 + i13;
            }
            int i16 = c1749w2.f6914c;
            if (i16 != Integer.MIN_VALUE) {
                c1749w2.f6914c = i16 + i13;
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void onAdapterChanged(AbstractC1692i1 abstractC1692i1, AbstractC1692i1 abstractC1692i2) {
        this.f6549m.clear();
        for (int i13 = 0; i13 < this.f6537a; i13++) {
            this.f6538b[i13].m5336b();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void onDetachedFromWindow(RecyclerView recyclerView, C1668c2 c1668c2) {
        onDetachedFromWindow(recyclerView);
        removeCallbacks(this.f6558v);
        for (int i13 = 0; i13 < this.f6537a; i13++) {
            this.f6538b[i13].m5336b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0032  */
    /* JADX WARN: Code duplicated, block: B:29:0x003d  */
    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final View onFocusSearchFailed(View view, int i13, C1668c2 c1668c2, C1701k2 c1701k2) {
        View viewFindContainingItemView;
        int i14;
        if (getChildCount() == 0 || (viewFindContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        m5162x();
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 != 17) {
                    if (i13 != 33) {
                        if (i13 == 66 ? this.f6541e == 0 : !(i13 != 130 || this.f6541e != 1)) {
                            i14 = 1;
                        }
                    } else if (this.f6541e == 1) {
                        i14 = -1;
                    }
                    i14 = Integer.MIN_VALUE;
                } else if (this.f6541e == 0) {
                    i14 = -1;
                } else {
                    i14 = Integer.MIN_VALUE;
                }
            } else if (this.f6541e != 1 && isLayoutRTL()) {
                i14 = -1;
            } else {
                i14 = 1;
            }
        } else if (this.f6541e != 1 && isLayoutRTL()) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        if (i14 == Integer.MIN_VALUE) {
            return null;
        }
        C1737t2 c1737t2 = (C1737t2) viewFindContainingItemView.getLayoutParams();
        c1737t2.getClass();
        C1749w2 c1749w2 = c1737t2.f6870e;
        int iM5150l = i14 == 1 ? m5150l() : m5149k();
        m5140A(iM5150l, c1701k2);
        m5163y(i14);
        C1727r0 c1727r0 = this.f6543g;
        c1727r0.f6829c = c1727r0.f6830d + iM5150l;
        c1727r0.f6828b = (int) (this.f6539c.mo5188l() * 0.33333334f);
        c1727r0.f6834h = true;
        c1727r0.f6827a = false;
        m5144f(c1668c2, c1727r0, c1701k2);
        this.f6551o = this.f6545i;
        View viewM5341g = c1749w2.m5341g(iM5150l, i14);
        if (viewM5341g != null && viewM5341g != viewFindContainingItemView) {
            return viewM5341g;
        }
        if (m5157s(i14)) {
            for (int i15 = this.f6537a - 1; i15 >= 0; i15--) {
                View viewM5341g2 = this.f6538b[i15].m5341g(iM5150l, i14);
                if (viewM5341g2 != null && viewM5341g2 != viewFindContainingItemView) {
                    return viewM5341g2;
                }
            }
        } else {
            for (int i16 = 0; i16 < this.f6537a; i16++) {
                View viewM5341g3 = this.f6538b[i16].m5341g(iM5150l, i14);
                if (viewM5341g3 != null && viewM5341g3 != viewFindContainingItemView) {
                    return viewM5341g3;
                }
            }
        }
        boolean z4 = (this.f6544h ^ true) == (i14 == -1);
        View viewFindViewByPosition = findViewByPosition(z4 ? c1749w2.m5337c() : c1749w2.m5338d());
        if (viewFindViewByPosition != null && viewFindViewByPosition != viewFindContainingItemView) {
            return viewFindViewByPosition;
        }
        if (!m5157s(i14)) {
            for (int i17 = 0; i17 < this.f6537a; i17++) {
                View viewFindViewByPosition2 = findViewByPosition(z4 ? this.f6538b[i17].m5337c() : this.f6538b[i17].m5338d());
                if (viewFindViewByPosition2 != null && viewFindViewByPosition2 != viewFindContainingItemView) {
                    return viewFindViewByPosition2;
                }
            }
            return null;
        }
        for (int i18 = this.f6537a - 1; i18 >= 0; i18--) {
            if (i18 != c1749w2.f6916e) {
                View viewFindViewByPosition3 = findViewByPosition(z4 ? this.f6538b[i18].m5337c() : this.f6538b[i18].m5338d());
                if (viewFindViewByPosition3 != null && viewFindViewByPosition3 != viewFindContainingItemView) {
                    return viewFindViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View viewM5146h = m5146h(false);
            View viewM5145g = m5145g(false);
            if (viewM5146h == null || viewM5145g == null) {
                return;
            }
            int position = getPosition(viewM5146h);
            int position2 = getPosition(viewM5145g);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void onItemsAdded(RecyclerView recyclerView, int i13, int i14) {
        m5153o(i13, i14, 1);
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.f6549m.clear();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void onItemsMoved(RecyclerView recyclerView, int i13, int i14, int i15) {
        m5153o(i13, i14, 8);
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void onItemsRemoved(RecyclerView recyclerView, int i13, int i14) {
        m5153o(i13, i14, 2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void onItemsUpdated(RecyclerView recyclerView, int i13, int i14, Object obj) {
        m5153o(i13, i14, 4);
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void onLayoutChildren(C1668c2 c1668c2, C1701k2 c1701k2) {
        m5156r(c1668c2, c1701k2, true);
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void onLayoutCompleted(C1701k2 c1701k2) {
        this.f6547k = -1;
        this.f6548l = Integer.MIN_VALUE;
        this.f6553q = null;
        this.f6555s.m5325a();
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof C1745v2) {
            C1745v2 c1745v2 = (C1745v2) parcelable;
            this.f6553q = c1745v2;
            if (this.f6547k != -1) {
                c1745v2.f6901w = -1;
                c1745v2.f6902x = -1;
                c1745v2.f6904z = null;
                c1745v2.f6903y = 0;
                c1745v2.f6895E = 0;
                c1745v2.f6896F = null;
                c1745v2.f6897G = null;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final Parcelable onSaveInstanceState() {
        int iM5342h;
        int iMo5187k;
        int[] iArr;
        C1745v2 c1745v2 = this.f6553q;
        if (c1745v2 != null) {
            C1745v2 c1745v3 = new C1745v2();
            c1745v3.f6903y = c1745v2.f6903y;
            c1745v3.f6901w = c1745v2.f6901w;
            c1745v3.f6902x = c1745v2.f6902x;
            c1745v3.f6904z = c1745v2.f6904z;
            c1745v3.f6895E = c1745v2.f6895E;
            c1745v3.f6896F = c1745v2.f6896F;
            c1745v3.f6898H = c1745v2.f6898H;
            c1745v3.f6899I = c1745v2.f6899I;
            c1745v3.f6900J = c1745v2.f6900J;
            c1745v3.f6897G = c1745v2.f6897G;
            return c1745v3;
        }
        C1745v2 c1745v4 = new C1745v2();
        c1745v4.f6898H = this.f6544h;
        c1745v4.f6899I = this.f6551o;
        c1745v4.f6900J = this.f6552p;
        C11457j c11457j = this.f6549m;
        if (c11457j == null || (iArr = (int[]) c11457j.f36753x) == null) {
            c1745v4.f6895E = 0;
        } else {
            c1745v4.f6896F = iArr;
            c1745v4.f6895E = iArr.length;
            c1745v4.f6897G = (ArrayList) c11457j.f36754y;
        }
        if (getChildCount() <= 0) {
            c1745v4.f6901w = -1;
            c1745v4.f6902x = -1;
            c1745v4.f6903y = 0;
            return c1745v4;
        }
        c1745v4.f6901w = this.f6551o ? m5150l() : m5149k();
        View viewM5145g = this.f6545i ? m5145g(true) : m5146h(true);
        c1745v4.f6902x = viewM5145g != null ? getPosition(viewM5145g) : -1;
        int i13 = this.f6537a;
        c1745v4.f6903y = i13;
        c1745v4.f6904z = new int[i13];
        for (int i14 = 0; i14 < this.f6537a; i14++) {
            if (this.f6551o) {
                iM5342h = this.f6538b[i14].m5340f(Integer.MIN_VALUE);
                if (iM5342h != Integer.MIN_VALUE) {
                    iMo5187k = this.f6539c.mo5183g();
                    iM5342h -= iMo5187k;
                }
            } else {
                iM5342h = this.f6538b[i14].m5342h(Integer.MIN_VALUE);
                if (iM5342h != Integer.MIN_VALUE) {
                    iMo5187k = this.f6539c.mo5187k();
                    iM5342h -= iMo5187k;
                }
            }
            c1745v4.f6904z[i14] = iM5342h;
        }
        return c1745v4;
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void onScrollStateChanged(int i13) {
        if (i13 == 0) {
            m5142d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x002c A[SYNTHETIC] */
    /* JADX INFO: renamed from: p */
    public final View m5154p() {
        boolean z4;
        boolean z13;
        int childCount = getChildCount();
        int i13 = childCount - 1;
        BitSet bitSet = new BitSet(this.f6537a);
        bitSet.set(0, this.f6537a, true);
        byte b = (this.f6541e == 1 && isLayoutRTL()) ? (byte) 1 : (byte) -1;
        if (this.f6545i) {
            childCount = -1;
        } else {
            i13 = 0;
        }
        int i14 = i13 < childCount ? 1 : -1;
        while (i13 != childCount) {
            View childAt = getChildAt(i13);
            C1737t2 c1737t2 = (C1737t2) childAt.getLayoutParams();
            if (bitSet.get(c1737t2.f6870e.f6916e)) {
                C1749w2 c1749w2 = c1737t2.f6870e;
                if (this.f6545i) {
                    int i15 = c1749w2.f6914c;
                    if (i15 == Integer.MIN_VALUE) {
                        c1749w2.m5335a();
                        i15 = c1749w2.f6914c;
                    }
                    if (i15 < this.f6539c.mo5183g()) {
                        ((C1737t2) ((View) AbstractC25012a.m73371d(c1749w2.f6912a, 1)).getLayoutParams()).getClass();
                        return childAt;
                    }
                } else {
                    int i16 = c1749w2.f6913b;
                    ArrayList arrayList = c1749w2.f6912a;
                    if (i16 == Integer.MIN_VALUE) {
                        View view = (View) arrayList.get(0);
                        C1737t2 c1737t3 = (C1737t2) view.getLayoutParams();
                        c1749w2.f6913b = c1749w2.f6917f.f6539c.mo5181e(view);
                        c1737t3.getClass();
                        i16 = c1749w2.f6913b;
                    }
                    if (i16 > this.f6539c.mo5187k()) {
                        ((C1737t2) ((View) arrayList.get(0)).getLayoutParams()).getClass();
                        return childAt;
                    }
                }
                bitSet.clear(c1737t2.f6870e.f6916e);
            }
            i13 += i14;
            if (i13 != childCount) {
                View childAt2 = getChildAt(i13);
                if (this.f6545i) {
                    int iMo5178b = this.f6539c.mo5178b(childAt);
                    int iMo5178b2 = this.f6539c.mo5178b(childAt2);
                    if (iMo5178b >= iMo5178b2) {
                        if (iMo5178b == iMo5178b2) {
                            if (c1737t2.f6870e.f6916e - ((C1737t2) childAt2.getLayoutParams()).f6870e.f6916e < 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (b < 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z4 != z13) {
                            }
                        } else {
                            continue;
                        }
                    }
                    return childAt;
                }
                int iMo5181e = this.f6539c.mo5181e(childAt);
                int iMo5181e2 = this.f6539c.mo5181e(childAt2);
                if (iMo5181e <= iMo5181e2) {
                    if (iMo5181e == iMo5181e2) {
                        if (c1737t2.f6870e.f6916e - ((C1737t2) childAt2.getLayoutParams()).f6870e.f6916e < 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (b < 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z4 != z13) {
                        }
                    } else {
                        continue;
                    }
                }
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final void m5155q(View view, int i13, int i14) {
        Rect rect = this.f6554r;
        calculateItemDecorationsForChild(view, rect);
        C1737t2 c1737t2 = (C1737t2) view.getLayoutParams();
        int iM5139C = m5139C(i13, ((ViewGroup.MarginLayoutParams) c1737t2).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c1737t2).rightMargin + rect.right);
        int iM5139C2 = m5139C(i14, ((ViewGroup.MarginLayoutParams) c1737t2).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c1737t2).bottomMargin + rect.bottom);
        if (shouldMeasureChild(view, iM5139C, iM5139C2, c1737t2)) {
            view.measure(iM5139C, iM5139C2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:109:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:123:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:131:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:133:0x0209  */
    /* JADX WARN: Code duplicated, block: B:251:0x0413  */
    /* JADX WARN: Code duplicated, block: B:262:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x01fc A[SYNTHETIC] */
    /* JADX INFO: renamed from: r */
    public final void m5156r(C1668c2 c1668c2, C1701k2 c1701k2, boolean z4) {
        boolean z13;
        C1745v2 c1745v2;
        int childCount;
        int i13;
        int position;
        int position2;
        int childCount2;
        int i14;
        boolean z14;
        C1745v2 c1745v3 = this.f6553q;
        C1733s2 c1733s2 = this.f6555s;
        if (!(c1745v3 == null && this.f6547k == -1) && c1701k2.m5276b() == 0) {
            removeAndRecycleAllViews(c1668c2);
            c1733s2.m5325a();
            return;
        }
        boolean z15 = c1733s2.f6852e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = c1733s2.f6854g;
        boolean z16 = (z15 && this.f6547k == -1 && this.f6553q == null) ? false : true;
        C11457j c11457j = this.f6549m;
        if (z16) {
            c1733s2.m5325a();
            C1745v2 c1745v4 = this.f6553q;
            if (c1745v4 != null) {
                int i15 = c1745v4.f6903y;
                if (i15 > 0) {
                    if (i15 == this.f6537a) {
                        for (int i16 = 0; i16 < this.f6537a; i16++) {
                            this.f6538b[i16].m5336b();
                            C1745v2 c1745v5 = this.f6553q;
                            int iMo5183g = c1745v5.f6904z[i16];
                            if (iMo5183g != Integer.MIN_VALUE) {
                                iMo5183g += c1745v5.f6899I ? this.f6539c.mo5183g() : this.f6539c.mo5187k();
                            }
                            C1749w2 c1749w2 = this.f6538b[i16];
                            c1749w2.f6913b = iMo5183g;
                            c1749w2.f6914c = iMo5183g;
                        }
                    } else {
                        c1745v4.f6904z = null;
                        c1745v4.f6903y = 0;
                        c1745v4.f6895E = 0;
                        c1745v4.f6896F = null;
                        c1745v4.f6897G = null;
                        c1745v4.f6901w = c1745v4.f6902x;
                    }
                }
                C1745v2 c1745v6 = this.f6553q;
                this.f6552p = c1745v6.f6900J;
                boolean z17 = c1745v6.f6898H;
                assertNotInLayoutOrScroll(null);
                C1745v2 c1745v7 = this.f6553q;
                if (c1745v7 != null && c1745v7.f6898H != z17) {
                    c1745v7.f6898H = z17;
                }
                this.f6544h = z17;
                requestLayout();
                m5162x();
                C1745v2 c1745v8 = this.f6553q;
                int i17 = c1745v8.f6901w;
                if (i17 != -1) {
                    this.f6547k = i17;
                    c1733s2.f6850c = c1745v8.f6899I;
                } else {
                    c1733s2.f6850c = this.f6545i;
                }
                if (c1745v8.f6895E > 1) {
                    c11457j.f36753x = c1745v8.f6896F;
                    c11457j.f36754y = c1745v8.f6897G;
                }
            } else {
                m5162x();
                c1733s2.f6850c = this.f6545i;
            }
            if (c1701k2.f6727g || (i14 = this.f6547k) == -1) {
                if (this.f6551o) {
                    int iM5276b = c1701k2.m5276b();
                    childCount2 = getChildCount() - 1;
                    while (true) {
                        if (childCount2 < 0) {
                            position2 = 0;
                            break;
                        }
                        position2 = getPosition(getChildAt(childCount2));
                        if (position2 < 0 && position2 < iM5276b) {
                            break;
                        } else {
                            childCount2--;
                        }
                    }
                } else {
                    int iM5276b2 = c1701k2.m5276b();
                    childCount = getChildCount();
                    i13 = 0;
                    while (true) {
                        if (i13 >= childCount) {
                            position2 = 0;
                            break;
                        }
                        position = getPosition(getChildAt(i13));
                        if (position < 0 && position < iM5276b2) {
                            position2 = position;
                            break;
                        }
                        i13++;
                    }
                }
                c1733s2.f6848a = position2;
                c1733s2.f6849b = Integer.MIN_VALUE;
            } else if (i14 < 0 || i14 >= c1701k2.m5276b()) {
                this.f6547k = -1;
                this.f6548l = Integer.MIN_VALUE;
                if (this.f6551o) {
                    int iM5276b3 = c1701k2.m5276b();
                    childCount2 = getChildCount() - 1;
                    while (true) {
                        if (childCount2 < 0) {
                            position2 = 0;
                            break;
                        } else {
                            position2 = getPosition(getChildAt(childCount2));
                            if (position2 < 0) {
                            }
                            childCount2--;
                        }
                    }
                } else {
                    int iM5276b4 = c1701k2.m5276b();
                    childCount = getChildCount();
                    i13 = 0;
                    while (true) {
                        if (i13 >= childCount) {
                            position2 = 0;
                            break;
                        } else {
                            position = getPosition(getChildAt(i13));
                            if (position < 0) {
                            }
                            i13++;
                        }
                    }
                }
                c1733s2.f6848a = position2;
                c1733s2.f6849b = Integer.MIN_VALUE;
            } else {
                C1745v2 c1745v9 = this.f6553q;
                if (c1745v9 == null || c1745v9.f6901w == -1 || c1745v9.f6903y < 1) {
                    View viewFindViewByPosition = findViewByPosition(this.f6547k);
                    if (viewFindViewByPosition != null) {
                        c1733s2.f6848a = this.f6545i ? m5150l() : m5149k();
                        if (this.f6548l != Integer.MIN_VALUE) {
                            if (c1733s2.f6850c) {
                                c1733s2.f6849b = (this.f6539c.mo5183g() - this.f6548l) - this.f6539c.mo5178b(viewFindViewByPosition);
                            } else {
                                c1733s2.f6849b = (this.f6539c.mo5187k() + this.f6548l) - this.f6539c.mo5181e(viewFindViewByPosition);
                            }
                        } else if (this.f6539c.mo5179c(viewFindViewByPosition) > this.f6539c.mo5188l()) {
                            c1733s2.f6849b = c1733s2.f6850c ? this.f6539c.mo5183g() : this.f6539c.mo5187k();
                        } else {
                            int iMo5181e = this.f6539c.mo5181e(viewFindViewByPosition) - this.f6539c.mo5187k();
                            if (iMo5181e < 0) {
                                c1733s2.f6849b = -iMo5181e;
                            } else {
                                int iMo5183g2 = this.f6539c.mo5183g() - this.f6539c.mo5178b(viewFindViewByPosition);
                                if (iMo5183g2 < 0) {
                                    c1733s2.f6849b = iMo5183g2;
                                } else {
                                    c1733s2.f6849b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i18 = this.f6547k;
                        c1733s2.f6848a = i18;
                        int i19 = this.f6548l;
                        if (i19 == Integer.MIN_VALUE) {
                            if (getChildCount() != 0) {
                                if ((i18 < m5149k()) != this.f6545i) {
                                    z14 = false;
                                } else {
                                    z14 = true;
                                }
                            } else if (this.f6545i) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            c1733s2.f6850c = z14;
                            c1733s2.f6849b = z14 ? staggeredGridLayoutManager.f6539c.mo5183g() : staggeredGridLayoutManager.f6539c.mo5187k();
                        } else if (c1733s2.f6850c) {
                            c1733s2.f6849b = staggeredGridLayoutManager.f6539c.mo5183g() - i19;
                        } else {
                            c1733s2.f6849b = staggeredGridLayoutManager.f6539c.mo5187k() + i19;
                        }
                        c1733s2.f6851d = true;
                    }
                } else {
                    c1733s2.f6849b = Integer.MIN_VALUE;
                    c1733s2.f6848a = this.f6547k;
                }
            }
            c1733s2.f6852e = true;
        }
        if (this.f6553q == null && this.f6547k == -1 && (c1733s2.f6850c != this.f6551o || isLayoutRTL() != this.f6552p)) {
            c11457j.clear();
            c1733s2.f6851d = true;
        }
        if (getChildCount() > 0 && ((c1745v2 = this.f6553q) == null || c1745v2.f6903y < 1)) {
            if (c1733s2.f6851d) {
                for (int i24 = 0; i24 < this.f6537a; i24++) {
                    this.f6538b[i24].m5336b();
                    int i25 = c1733s2.f6849b;
                    if (i25 != Integer.MIN_VALUE) {
                        C1749w2 c1749w3 = this.f6538b[i24];
                        c1749w3.f6913b = i25;
                        c1749w3.f6914c = i25;
                    }
                }
            } else if (z16 || c1733s2.f6853f == null) {
                for (int i26 = 0; i26 < this.f6537a; i26++) {
                    C1749w2 c1749w4 = this.f6538b[i26];
                    boolean z18 = this.f6545i;
                    int i27 = c1733s2.f6849b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = c1749w4.f6917f;
                    int iM5340f = z18 ? c1749w4.m5340f(Integer.MIN_VALUE) : c1749w4.m5342h(Integer.MIN_VALUE);
                    c1749w4.m5336b();
                    if (iM5340f != Integer.MIN_VALUE && ((!z18 || iM5340f >= staggeredGridLayoutManager2.f6539c.mo5183g()) && (z18 || iM5340f <= staggeredGridLayoutManager2.f6539c.mo5187k()))) {
                        if (i27 != Integer.MIN_VALUE) {
                            iM5340f += i27;
                        }
                        c1749w4.f6914c = iM5340f;
                        c1749w4.f6913b = iM5340f;
                    }
                }
                C1749w2[] c1749w2Arr = this.f6538b;
                int length = c1749w2Arr.length;
                int[] iArr = c1733s2.f6853f;
                if (iArr == null || iArr.length < length) {
                    c1733s2.f6853f = new int[staggeredGridLayoutManager.f6538b.length];
                }
                for (int i28 = 0; i28 < length; i28++) {
                    c1733s2.f6853f[i28] = c1749w2Arr[i28].m5342h(Integer.MIN_VALUE);
                }
            } else {
                for (int i29 = 0; i29 < this.f6537a; i29++) {
                    C1749w2 c1749w5 = this.f6538b[i29];
                    c1749w5.m5336b();
                    int i34 = c1733s2.f6853f[i29];
                    c1749w5.f6913b = i34;
                    c1749w5.f6914c = i34;
                }
            }
        }
        detachAndScrapAttachedViews(c1668c2);
        C1727r0 c1727r0 = this.f6543g;
        c1727r0.f6827a = false;
        int iMo5188l = this.f6540d.mo5188l();
        this.f6542f = iMo5188l / this.f6537a;
        View.MeasureSpec.makeMeasureSpec(iMo5188l, this.f6540d.mo5185i());
        m5140A(c1733s2.f6848a, c1701k2);
        if (c1733s2.f6850c) {
            m5163y(-1);
            m5144f(c1668c2, c1727r0, c1701k2);
            m5163y(1);
            c1727r0.f6829c = c1733s2.f6848a + c1727r0.f6830d;
            m5144f(c1668c2, c1727r0, c1701k2);
        } else {
            m5163y(1);
            m5144f(c1668c2, c1727r0, c1701k2);
            m5163y(-1);
            c1727r0.f6829c = c1733s2.f6848a + c1727r0.f6830d;
            m5144f(c1668c2, c1727r0, c1701k2);
        }
        if (this.f6540d.mo5185i() != 1073741824) {
            int childCount3 = getChildCount();
            float fMax = 0.0f;
            for (int i35 = 0; i35 < childCount3; i35++) {
                View childAt = getChildAt(i35);
                float fMo5179c = this.f6540d.mo5179c(childAt);
                if (fMo5179c >= fMax) {
                    ((C1737t2) childAt.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fMo5179c);
                }
            }
            int i36 = this.f6542f;
            int iRound = Math.round(fMax * this.f6537a);
            if (this.f6540d.mo5185i() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f6540d.mo5188l());
            }
            this.f6542f = iRound / this.f6537a;
            View.MeasureSpec.makeMeasureSpec(iRound, this.f6540d.mo5185i());
            if (this.f6542f != i36) {
                for (int i37 = 0; i37 < childCount3; i37++) {
                    View childAt2 = getChildAt(i37);
                    C1737t2 c1737t2 = (C1737t2) childAt2.getLayoutParams();
                    c1737t2.getClass();
                    if (isLayoutRTL() && this.f6541e == 1) {
                        int i38 = -((this.f6537a - 1) - c1737t2.f6870e.f6916e);
                        childAt2.offsetLeftAndRight((this.f6542f * i38) - (i38 * i36));
                    } else {
                        int i39 = c1737t2.f6870e.f6916e;
                        int i44 = this.f6542f * i39;
                        int i45 = i39 * i36;
                        if (this.f6541e == 1) {
                            childAt2.offsetLeftAndRight(i44 - i45);
                        } else {
                            childAt2.offsetTopAndBottom(i44 - i45);
                        }
                    }
                }
            }
        }
        if (getChildCount() > 0) {
            if (this.f6545i) {
                m5147i(c1668c2, c1701k2, true);
                m5148j(c1668c2, c1701k2, false);
            } else {
                m5148j(c1668c2, c1701k2, true);
                m5147i(c1668c2, c1701k2, false);
            }
        }
        if (z4 && !c1701k2.f6727g && this.f6550n != 0 && getChildCount() > 0 && m5154p() != null) {
            removeCallbacks(this.f6558v);
            z13 = m5142d();
        }
        if (c1701k2.f6727g) {
            c1733s2.m5325a();
        }
        this.f6551o = c1733s2.f6850c;
        this.f6552p = isLayoutRTL();
        if (z13) {
            c1733s2.m5325a();
            m5156r(c1668c2, c1701k2, false);
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m5157s(int i13) {
        if (this.f6541e == 0) {
            return (i13 == -1) != this.f6545i;
        }
        return ((i13 == -1) == this.f6545i) == isLayoutRTL();
    }

    public final int scrollBy(int i13, C1668c2 c1668c2, C1701k2 c1701k2) {
        if (getChildCount() == 0 || i13 == 0) {
            return 0;
        }
        m5158t(i13, c1701k2);
        C1727r0 c1727r0 = this.f6543g;
        int iM5144f = m5144f(c1668c2, c1727r0, c1701k2);
        if (c1727r0.f6828b >= iM5144f) {
            i13 = i13 < 0 ? -iM5144f : iM5144f;
        }
        this.f6539c.mo5191o(-i13);
        this.f6551o = this.f6545i;
        c1727r0.f6828b = 0;
        m5159u(c1668c2, c1727r0);
        return i13;
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final int scrollHorizontallyBy(int i13, C1668c2 c1668c2, C1701k2 c1701k2) {
        return scrollBy(i13, c1668c2, c1701k2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void scrollToPosition(int i13) {
        C1745v2 c1745v2 = this.f6553q;
        if (c1745v2 != null && c1745v2.f6901w != i13) {
            c1745v2.f6904z = null;
            c1745v2.f6903y = 0;
            c1745v2.f6901w = -1;
            c1745v2.f6902x = -1;
        }
        this.f6547k = i13;
        this.f6548l = Integer.MIN_VALUE;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final int scrollVerticallyBy(int i13, C1668c2 c1668c2, C1701k2 c1701k2) {
        return scrollBy(i13, c1668c2, c1701k2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void setMeasuredDimension(Rect rect, int i13, int i14) {
        int iChooseSize;
        int iChooseSize2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f6541e == 1) {
            iChooseSize2 = AbstractC1740u1.chooseSize(i14, rect.height() + paddingBottom, getMinimumHeight());
            iChooseSize = AbstractC1740u1.chooseSize(i13, (this.f6542f * this.f6537a) + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = AbstractC1740u1.chooseSize(i13, rect.width() + paddingRight, getMinimumWidth());
            iChooseSize2 = AbstractC1740u1.chooseSize(i14, (this.f6542f * this.f6537a) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void smoothScrollToPosition(RecyclerView recyclerView, C1701k2 c1701k2, int i13) {
        C1751x0 c1751x0 = new C1751x0(recyclerView.getContext());
        c1751x0.f6707a = i13;
        startSmoothScroll(c1751x0);
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final boolean supportsPredictiveItemAnimations() {
        return this.f6553q == null;
    }

    /* JADX INFO: renamed from: t */
    public final void m5158t(int i13, C1701k2 c1701k2) {
        int iM5149k;
        int i14;
        if (i13 > 0) {
            iM5149k = m5150l();
            i14 = 1;
        } else {
            iM5149k = m5149k();
            i14 = -1;
        }
        C1727r0 c1727r0 = this.f6543g;
        c1727r0.f6827a = true;
        m5140A(iM5149k, c1701k2);
        m5163y(i14);
        c1727r0.f6829c = iM5149k + c1727r0.f6830d;
        c1727r0.f6828b = Math.abs(i13);
    }

    /* JADX INFO: renamed from: u */
    public final void m5159u(C1668c2 c1668c2, C1727r0 c1727r0) {
        int iMin;
        if (!c1727r0.f6827a || c1727r0.f6835i) {
            return;
        }
        if (c1727r0.f6828b == 0) {
            if (c1727r0.f6831e == -1) {
                m5160v(c1727r0.f6833g, c1668c2);
                return;
            } else {
                m5161w(c1727r0.f6832f, c1668c2);
                return;
            }
        }
        int i13 = 1;
        if (c1727r0.f6831e == -1) {
            int i14 = c1727r0.f6832f;
            int iM5342h = this.f6538b[0].m5342h(i14);
            while (i13 < this.f6537a) {
                int iM5342h2 = this.f6538b[i13].m5342h(i14);
                if (iM5342h2 > iM5342h) {
                    iM5342h = iM5342h2;
                }
                i13++;
            }
            int i15 = i14 - iM5342h;
            m5160v(i15 < 0 ? c1727r0.f6833g : c1727r0.f6833g - Math.min(i15, c1727r0.f6828b), c1668c2);
            return;
        }
        int i16 = c1727r0.f6833g;
        int iM5340f = this.f6538b[0].m5340f(i16);
        while (i13 < this.f6537a) {
            int iM5340f2 = this.f6538b[i13].m5340f(i16);
            if (iM5340f2 < iM5340f) {
                iM5340f = iM5340f2;
            }
            i13++;
        }
        int i17 = iM5340f - c1727r0.f6833g;
        if (i17 < 0) {
            iMin = c1727r0.f6832f;
        } else {
            iMin = Math.min(i17, c1727r0.f6828b) + c1727r0.f6832f;
        }
        m5161w(iMin, c1668c2);
    }

    /* JADX INFO: renamed from: v */
    public final void m5160v(int i13, C1668c2 c1668c2) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f6539c.mo5181e(childAt) < i13 || this.f6539c.mo5190n(childAt) < i13) {
                return;
            }
            C1737t2 c1737t2 = (C1737t2) childAt.getLayoutParams();
            c1737t2.getClass();
            if (c1737t2.f6870e.f6912a.size() == 1) {
                return;
            }
            C1749w2 c1749w2 = c1737t2.f6870e;
            ArrayList arrayList = c1749w2.f6912a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            C1737t2 c1737t3 = (C1737t2) view.getLayoutParams();
            c1737t3.f6870e = null;
            if (c1737t3.f6891a.isRemoved() || c1737t3.f6891a.isUpdated()) {
                c1749w2.f6915d -= c1749w2.f6917f.f6539c.mo5179c(view);
            }
            if (size == 1) {
                c1749w2.f6913b = Integer.MIN_VALUE;
            }
            c1749w2.f6914c = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, c1668c2);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m5161w(int i13, C1668c2 c1668c2) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f6539c.mo5178b(childAt) > i13 || this.f6539c.mo5189m(childAt) > i13) {
                return;
            }
            C1737t2 c1737t2 = (C1737t2) childAt.getLayoutParams();
            c1737t2.getClass();
            if (c1737t2.f6870e.f6912a.size() == 1) {
                return;
            }
            C1749w2 c1749w2 = c1737t2.f6870e;
            ArrayList arrayList = c1749w2.f6912a;
            View view = (View) arrayList.remove(0);
            C1737t2 c1737t3 = (C1737t2) view.getLayoutParams();
            c1737t3.f6870e = null;
            if (arrayList.size() == 0) {
                c1749w2.f6914c = Integer.MIN_VALUE;
            }
            if (c1737t3.f6891a.isRemoved() || c1737t3.f6891a.isUpdated()) {
                c1749w2.f6915d -= c1749w2.f6917f.f6539c.mo5179c(view);
            }
            c1749w2.f6913b = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, c1668c2);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m5162x() {
        if (this.f6541e == 1 || !isLayoutRTL()) {
            this.f6545i = this.f6544h;
        } else {
            this.f6545i = !this.f6544h;
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m5163y(int i13) {
        C1727r0 c1727r0 = this.f6543g;
        c1727r0.f6831e = i13;
        c1727r0.f6830d = this.f6545i != (i13 == -1) ? -1 : 1;
    }

    /* JADX INFO: renamed from: z */
    public final void m5164z(int i13) {
        assertNotInLayoutOrScroll(null);
        if (i13 != this.f6537a) {
            this.f6549m.clear();
            requestLayout();
            this.f6537a = i13;
            this.f6546j = new BitSet(this.f6537a);
            this.f6538b = new C1749w2[this.f6537a];
            for (int i14 = 0; i14 < this.f6537a; i14++) {
                this.f6538b[i14] = new C1749w2(this, i14);
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final C1744v1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C1737t2((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C1737t2(layoutParams);
    }

    public StaggeredGridLayoutManager() {
        this.f6537a = -1;
        this.f6544h = false;
        this.f6545i = false;
        this.f6547k = -1;
        this.f6548l = Integer.MIN_VALUE;
        this.f6549m = new C11457j(4, false);
        this.f6550n = 2;
        this.f6554r = new Rect();
        this.f6555s = new C1733s2(this);
        this.f6556t = true;
        this.f6558v = new RunnableC1758z(this, 2);
        this.f6541e = 1;
        m5164z(2);
        this.f6543g = new C1727r0();
        this.f6539c = AbstractC1667c1.m5193a(this, this.f6541e);
        this.f6540d = AbstractC1667c1.m5193a(this, 1 - this.f6541e);
    }
}
