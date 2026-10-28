package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import ng3.C26701n;
import p444r.C30820n;
import p444r.InterfaceC30816j;
import p444r.InterfaceC30817k;
import p444r.InterfaceC30829w;
import p444r.InterfaceC30832z;
import p444r.MenuC30818l;
import p474s.C31944d;
import p474s.C31956g;
import p474s.C31960h;
import p474s.C31968j;
import p474s.C31990o1;
import p474s.InterfaceC31964i;
import p474s.InterfaceC31972k;

/* JADX INFO: loaded from: classes5.dex */
public class ActionMenuView extends LinearLayoutCompat implements InterfaceC30817k, InterfaceC30832z {

    /* JADX INFO: renamed from: E */
    public C31960h f4309E;

    /* JADX INFO: renamed from: F */
    public InterfaceC30829w f4310F;

    /* JADX INFO: renamed from: G */
    public InterfaceC30816j f4311G;

    /* JADX INFO: renamed from: H */
    public boolean f4312H;

    /* JADX INFO: renamed from: I */
    public int f4313I;

    /* JADX INFO: renamed from: J */
    public final int f4314J;

    /* JADX INFO: renamed from: K */
    public final int f4315K;

    /* JADX INFO: renamed from: L */
    public InterfaceC31972k f4316L;

    /* JADX INFO: renamed from: w */
    public MenuC30818l f4317w;

    /* JADX INFO: renamed from: x */
    public Context f4318x;

    /* JADX INFO: renamed from: y */
    public int f4319y;

    /* JADX INFO: renamed from: z */
    public boolean f4320z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f13 = context.getResources().getDisplayMetrics().density;
        this.f4314J = (int) (56.0f * f13);
        this.f4315K = (int) (f13 * 4.0f);
        this.f4318x = context;
        this.f4319y = 0;
    }

    /* JADX INFO: renamed from: d */
    public static C31968j m3285d() {
        C31968j c31968j = new C31968j(-2, -2);
        c31968j.f132722a = false;
        ((LinearLayout.LayoutParams) c31968j).gravity = 16;
        return c31968j;
    }

    /* JADX INFO: renamed from: e */
    public static C31968j m3286e(ViewGroup.LayoutParams layoutParams) {
        C31968j c31968j;
        if (layoutParams == null) {
            return m3285d();
        }
        if (layoutParams instanceof C31968j) {
            C31968j c31968j2 = (C31968j) layoutParams;
            c31968j = new C31968j(c31968j2);
            c31968j.f132722a = c31968j2.f132722a;
        } else {
            c31968j = new C31968j(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c31968j).gravity <= 0) {
            ((LinearLayout.LayoutParams) c31968j).gravity = 16;
        }
        return c31968j;
    }

    @Override // p444r.InterfaceC30817k
    /* JADX INFO: renamed from: a */
    public final boolean mo3255a(C30820n c30820n) {
        return this.f4317w.m94821r(c30820n, null, 0);
    }

    @Override // p444r.InterfaceC30832z
    /* JADX INFO: renamed from: b */
    public final void mo3256b(MenuC30818l menuC30818l) {
        this.f4317w = menuC30818l;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C31968j;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m3287f(int i13) {
        boolean zMo3250a = false;
        if (i13 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i13 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i13);
        if (i13 < getChildCount() && (childAt instanceof InterfaceC31964i)) {
            zMo3250a = ((InterfaceC31964i) childAt).mo3250a();
        }
        return (i13 <= 0 || !(childAt2 instanceof InterfaceC31964i)) ? zMo3250a : ((InterfaceC31964i) childAt2).mo3251b() | zMo3250a;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m3285d();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m3286e(layoutParams);
    }

    public Menu getMenu() {
        if (this.f4317w == null) {
            Context context = getContext();
            MenuC30818l menuC30818l = new MenuC30818l(context);
            this.f4317w = menuC30818l;
            menuC30818l.f127059f = new C1087a(this, 0);
            C31960h c31960h = new C31960h(context);
            this.f4309E = c31960h;
            c31960h.f132689L = true;
            c31960h.f132690M = true;
            InterfaceC30829w c26701n = this.f4310F;
            if (c26701n == null) {
                c26701n = new C26701n(24);
            }
            c31960h.f132682E = c26701n;
            this.f4317w.m94814c(c31960h, this.f4318x);
            C31960h c31960h2 = this.f4309E;
            c31960h2.f132685H = this;
            this.f4317w = c31960h2.f132703y;
        }
        return this.f4317w;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C31960h c31960h = this.f4309E;
        C31956g c31956g = c31960h.f132686I;
        if (c31956g != null) {
            return c31956g.getDrawable();
        }
        if (c31960h.f132688K) {
            return c31960h.f132687J;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f4319y;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C31960h c31960h = this.f4309E;
        if (c31960h != null) {
            c31960h.mo3336d();
            if (this.f4309E.m99450k()) {
                this.f4309E.m99449c();
                this.f4309E.m99451l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C31960h c31960h = this.f4309E;
        if (c31960h != null) {
            c31960h.m99449c();
            C31944d c31944d = c31960h.f132697T;
            if (c31944d == null || !c31944d.m94835b()) {
                return;
            }
            c31944d.f127130i.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        int width;
        int paddingLeft;
        if (!this.f4312H) {
            super.onLayout(z4, i13, i14, i15, i16);
            return;
        }
        int childCount = getChildCount();
        int i17 = (i16 - i14) / 2;
        int dividerWidth = getDividerWidth();
        int i18 = i15 - i13;
        int paddingRight = (i18 - getPaddingRight()) - getPaddingLeft();
        boolean z13 = getLayoutDirection() == 1;
        int i19 = 0;
        int i24 = 0;
        for (int i25 = 0; i25 < childCount; i25++) {
            View childAt = getChildAt(i25);
            if (childAt.getVisibility() != 8) {
                C31968j c31968j = (C31968j) childAt.getLayoutParams();
                if (c31968j.f132722a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m3287f(i25)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z13) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c31968j).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c31968j).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i26 = i17 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i26, width, measuredHeight + i26);
                    paddingRight -= measuredWidth;
                    i19 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c31968j).leftMargin) + ((LinearLayout.LayoutParams) c31968j).rightMargin;
                    m3287f(i25);
                    i24++;
                }
            }
        }
        if (childCount == 1 && i19 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i27 = (i18 / 2) - (measuredWidth2 / 2);
            int i28 = i17 - (measuredHeight2 / 2);
            childAt2.layout(i27, i28, measuredWidth2 + i27, measuredHeight2 + i28);
            return;
        }
        int i29 = i24 - (i19 ^ 1);
        int iMax = Math.max(0, i29 > 0 ? paddingRight / i29 : 0);
        if (z13) {
            int width2 = getWidth() - getPaddingRight();
            for (int i34 = 0; i34 < childCount; i34++) {
                View childAt3 = getChildAt(i34);
                C31968j c31968j2 = (C31968j) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c31968j2.f132722a) {
                    int i35 = width2 - ((LinearLayout.LayoutParams) c31968j2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i36 = i17 - (measuredHeight3 / 2);
                    childAt3.layout(i35 - measuredWidth3, i36, i35, measuredHeight3 + i36);
                    width2 = i35 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c31968j2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i37 = 0; i37 < childCount; i37++) {
            View childAt4 = getChildAt(i37);
            C31968j c31968j3 = (C31968j) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c31968j3.f132722a) {
                int i38 = paddingLeft2 + ((LinearLayout.LayoutParams) c31968j3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i39 = i17 - (measuredHeight4 / 2);
                childAt4.layout(i38, i39, i38 + measuredWidth4, measuredHeight4 + i39);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c31968j3).rightMargin + iMax + i38;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i13, int i14) {
        int i15;
        int i16;
        ?? r14;
        int i17;
        int i18;
        MenuC30818l menuC30818l;
        boolean z4 = this.f4312H;
        boolean z13 = View.MeasureSpec.getMode(i13) == 1073741824;
        this.f4312H = z13;
        if (z4 != z13) {
            this.f4313I = 0;
        }
        int size = View.MeasureSpec.getSize(i13);
        if (this.f4312H && (menuC30818l = this.f4317w) != null && size != this.f4313I) {
            this.f4313I = size;
            menuC30818l.m94820q(true);
        }
        int childCount = getChildCount();
        if (!this.f4312H || childCount <= 0) {
            for (int i19 = 0; i19 < childCount; i19++) {
                C31968j c31968j = (C31968j) getChildAt(i19).getLayoutParams();
                ((LinearLayout.LayoutParams) c31968j).rightMargin = 0;
                ((LinearLayout.LayoutParams) c31968j).leftMargin = 0;
            }
            super.onMeasure(i13, i14);
            return;
        }
        int mode = View.MeasureSpec.getMode(i14);
        int size2 = View.MeasureSpec.getSize(i13);
        int size3 = View.MeasureSpec.getSize(i14);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i14, paddingBottom, -2);
        int i24 = size2 - paddingRight;
        int i25 = this.f4314J;
        int i26 = i24 / i25;
        int i27 = i24 % i25;
        if (i26 == 0) {
            setMeasuredDimension(i24, 0);
            return;
        }
        int i28 = (i27 / i26) + i25;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i29 = 0;
        int iMax2 = 0;
        int i34 = 0;
        boolean z14 = false;
        int i35 = 0;
        long j7 = 0;
        while (true) {
            i15 = this.f4315K;
            if (i34 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i34);
            int i36 = size3;
            int i37 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i17 = i28;
            } else {
                boolean z15 = childAt instanceof ActionMenuItemView;
                i29++;
                if (z15) {
                    childAt.setPadding(i15, 0, i15, 0);
                }
                C31968j c31968j2 = (C31968j) childAt.getLayoutParams();
                c31968j2.f132727f = false;
                c31968j2.f132724c = 0;
                c31968j2.f132723b = 0;
                c31968j2.f132725d = false;
                ((LinearLayout.LayoutParams) c31968j2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c31968j2).rightMargin = 0;
                c31968j2.f132726e = z15 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i38 = c31968j2.f132722a ? 1 : i26;
                C31968j c31968j3 = (C31968j) childAt.getLayoutParams();
                int i39 = i26;
                i17 = i28;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i37, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z15 ? (ActionMenuItemView) childAt : null;
                boolean z16 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z17 = z16;
                if (i38 <= 0 || (z16 && i38 < 2)) {
                    i18 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i17 * i38, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i18 = measuredWidth / i17;
                    if (measuredWidth % i17 != 0) {
                        i18++;
                    }
                    if (z17 && i18 < 2) {
                        i18 = 2;
                    }
                }
                c31968j3.f132725d = !c31968j3.f132722a && z17;
                c31968j3.f132723b = i18;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i18 * i17, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i18);
                if (c31968j2.f132725d) {
                    i35++;
                }
                if (c31968j2.f132722a) {
                    z14 = true;
                }
                i26 = i39 - i18;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i18 == 1) {
                    j7 |= (long) (1 << i34);
                }
            }
            i34++;
            size3 = i36;
            paddingBottom = i37;
            i28 = i17;
        }
        int i44 = size3;
        int i45 = i26;
        int i46 = i28;
        boolean z18 = z14 && i29 == 2;
        int i47 = i45;
        boolean z19 = false;
        while (true) {
            if (i35 <= 0 || i47 <= 0) {
                i16 = iMax;
                break;
            }
            int i48 = Integer.MAX_VALUE;
            long j13 = 0;
            int i49 = 0;
            int i54 = 0;
            while (i54 < childCount2) {
                int i55 = iMax;
                C31968j c31968j4 = (C31968j) getChildAt(i54).getLayoutParams();
                boolean z24 = z18;
                if (c31968j4.f132725d) {
                    int i56 = c31968j4.f132723b;
                    if (i56 < i48) {
                        j13 = 1 << i54;
                        i48 = i56;
                        i49 = 1;
                    } else if (i56 == i48) {
                        j13 |= 1 << i54;
                        i49++;
                    }
                }
                i54++;
                z18 = z24;
                iMax = i55;
            }
            i16 = iMax;
            boolean z25 = z18;
            j7 |= j13;
            if (i49 > i47) {
                break;
            }
            int i57 = i48 + 1;
            int i58 = 0;
            while (i58 < childCount2) {
                View childAt2 = getChildAt(i58);
                C31968j c31968j5 = (C31968j) childAt2.getLayoutParams();
                boolean z26 = z14;
                long j14 = 1 << i58;
                if ((j13 & j14) != 0) {
                    if (z25 && c31968j5.f132726e) {
                        r14 = 1;
                        r14 = 1;
                        if (i47 == 1) {
                            childAt2.setPadding(i15 + i46, 0, i15, 0);
                        }
                    } else {
                        r14 = 1;
                    }
                    c31968j5.f132723b += r14;
                    c31968j5.f132727f = r14;
                    i47--;
                } else if (c31968j5.f132723b == i57) {
                    j7 |= j14;
                }
                i58++;
                z14 = z26;
            }
            z18 = z25;
            iMax = i16;
            z19 = true;
        }
        boolean z27 = !z14 && i29 == 1;
        if (i47 > 0 && j7 != 0 && (i47 < i29 - 1 || z27 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j7);
            if (!z27) {
                if ((j7 & 1) != 0 && !((C31968j) getChildAt(0).getLayoutParams()).f132726e) {
                    fBitCount -= 0.5f;
                }
                int i59 = childCount2 - 1;
                if ((j7 & ((long) (1 << i59))) != 0 && !((C31968j) getChildAt(i59).getLayoutParams()).f132726e) {
                    fBitCount -= 0.5f;
                }
            }
            int i64 = fBitCount > 0.0f ? (int) ((i47 * i46) / fBitCount) : 0;
            boolean z28 = z19;
            for (int i65 = 0; i65 < childCount2; i65++) {
                if ((j7 & ((long) (1 << i65))) != 0) {
                    View childAt3 = getChildAt(i65);
                    C31968j c31968j6 = (C31968j) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c31968j6.f132724c = i64;
                        c31968j6.f132727f = true;
                        if (i65 == 0 && !c31968j6.f132726e) {
                            ((LinearLayout.LayoutParams) c31968j6).leftMargin = (-i64) / 2;
                        }
                        z28 = true;
                    } else if (c31968j6.f132722a) {
                        c31968j6.f132724c = i64;
                        c31968j6.f132727f = true;
                        ((LinearLayout.LayoutParams) c31968j6).rightMargin = (-i64) / 2;
                        z28 = true;
                    } else {
                        if (i65 != 0) {
                            ((LinearLayout.LayoutParams) c31968j6).leftMargin = i64 / 2;
                        }
                        if (i65 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c31968j6).rightMargin = i64 / 2;
                        }
                    }
                }
            }
            z19 = z28;
        }
        if (z19) {
            for (int i66 = 0; i66 < childCount2; i66++) {
                View childAt4 = getChildAt(i66);
                C31968j c31968j7 = (C31968j) childAt4.getLayoutParams();
                if (c31968j7.f132727f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c31968j7.f132723b * i46) + c31968j7.f132724c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i24, mode != 1073741824 ? i16 : i44);
    }

    public void setExpandedActionViewsExclusive(boolean z4) {
        this.f4309E.f132694Q = z4;
    }

    public void setOnMenuItemClickListener(InterfaceC31972k interfaceC31972k) {
        this.f4316L = interfaceC31972k;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C31960h c31960h = this.f4309E;
        C31956g c31956g = c31960h.f132686I;
        if (c31956g != null) {
            c31956g.setImageDrawable(drawable);
        } else {
            c31960h.f132688K = true;
            c31960h.f132687J = drawable;
        }
    }

    public void setOverflowReserved(boolean z4) {
        this.f4320z = z4;
    }

    public void setPopupTheme(int i13) {
        if (this.f4319y != i13) {
            this.f4319y = i13;
            if (i13 == 0) {
                this.f4318x = getContext();
            } else {
                this.f4318x = new ContextThemeWrapper(getContext(), i13);
            }
        }
    }

    public void setPresenter(C31960h c31960h) {
        this.f4309E = c31960h;
        c31960h.f132685H = this;
        this.f4317w = c31960h.f132703y;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ C31990o1 generateDefaultLayoutParams() {
        return m3285d();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ C31990o1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m3286e(layoutParams);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C31968j(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final C31990o1 generateLayoutParams(AttributeSet attributeSet) {
        return new C31968j(getContext(), attributeSet);
    }
}
