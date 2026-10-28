package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.whoop.android.R;
import cr.AbstractC11075m;
import io.sentry.config.AbstractC20301a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kr.C22788g;
import ng3.C26702o;
import p006a4.AbstractC0354a;
import p144fc.AbstractC14345a;
import p144fc.InterfaceC14347c;
import p167g5.C15486e;
import p167g5.C15487f;
import p171g9.C15585b;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p257jq.AbstractC21885a;
import p287kq.AbstractC22766a;
import p290l.AbstractC22932a;
import p311lq.C24644c;
import p377or.C28127a;
import p377or.C28128b;
import p377or.C28131e;
import p377or.C28133g;
import p377or.C28134h;
import p377or.C28135i;
import p377or.C28137k;
import p377or.C28138l;
import p377or.InterfaceC28129c;
import p377or.InterfaceC28130d;
import p435qr.AbstractC30554a;
import p479s4.AbstractC32122c;
import p558vp.AbstractC36259c;
import p715kotlin.jvm.internal.AbstractC22674j;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import se.AbstractC32411b;

/* JADX INFO: loaded from: classes6.dex */
@InterfaceC14347c
public class TabLayout extends HorizontalScrollView {

    /* JADX INFO: renamed from: z0 */
    public static final C15487f f21055z0 = new C15487f(16);

    /* JADX INFO: renamed from: E */
    public final int f21056E;

    /* JADX INFO: renamed from: F */
    public final int f21057F;

    /* JADX INFO: renamed from: G */
    public final int f21058G;

    /* JADX INFO: renamed from: H */
    public final int f21059H;

    /* JADX INFO: renamed from: I */
    public final int f21060I;

    /* JADX INFO: renamed from: J */
    public final int f21061J;

    /* JADX INFO: renamed from: K */
    public final int f21062K;

    /* JADX INFO: renamed from: L */
    public ColorStateList f21063L;

    /* JADX INFO: renamed from: M */
    public ColorStateList f21064M;

    /* JADX INFO: renamed from: N */
    public ColorStateList f21065N;

    /* JADX INFO: renamed from: O */
    public Drawable f21066O;

    /* JADX INFO: renamed from: P */
    public int f21067P;

    /* JADX INFO: renamed from: Q */
    public final PorterDuff.Mode f21068Q;

    /* JADX INFO: renamed from: R */
    public final float f21069R;

    /* JADX INFO: renamed from: S */
    public final float f21070S;

    /* JADX INFO: renamed from: T */
    public final int f21071T;

    /* JADX INFO: renamed from: U */
    public int f21072U;

    /* JADX INFO: renamed from: V */
    public final int f21073V;

    /* JADX INFO: renamed from: W */
    public final int f21074W;

    /* JADX INFO: renamed from: a0 */
    public final int f21075a0;

    /* JADX INFO: renamed from: b0 */
    public final int f21076b0;

    /* JADX INFO: renamed from: c0 */
    public int f21077c0;

    /* JADX INFO: renamed from: d0 */
    public final int f21078d0;

    /* JADX INFO: renamed from: e0 */
    public int f21079e0;

    /* JADX INFO: renamed from: f0 */
    public int f21080f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f21081g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f21082h0;

    /* JADX INFO: renamed from: i0 */
    public int f21083i0;

    /* JADX INFO: renamed from: j0 */
    public int f21084j0;

    /* JADX INFO: renamed from: k0 */
    public boolean f21085k0;

    /* JADX INFO: renamed from: l0 */
    public C26702o f21086l0;

    /* JADX INFO: renamed from: m0 */
    public final TimeInterpolator f21087m0;

    /* JADX INFO: renamed from: n0 */
    public InterfaceC28129c f21088n0;

    /* JADX INFO: renamed from: o0 */
    public final ArrayList f21089o0;

    /* JADX INFO: renamed from: p0 */
    public C28138l f21090p0;

    /* JADX INFO: renamed from: q0 */
    public ValueAnimator f21091q0;

    /* JADX INFO: renamed from: r0 */
    public ViewPager f21092r0;

    /* JADX INFO: renamed from: s0 */
    public AbstractC14345a f21093s0;

    /* JADX INFO: renamed from: t0 */
    public C28131e f21094t0;

    /* JADX INFO: renamed from: u0 */
    public C28135i f21095u0;

    /* JADX INFO: renamed from: v0 */
    public C28128b f21096v0;

    /* JADX INFO: renamed from: w */
    public int f21097w;

    /* JADX INFO: renamed from: w0 */
    public boolean f21098w0;

    /* JADX INFO: renamed from: x */
    public final ArrayList f21099x;

    /* JADX INFO: renamed from: x0 */
    public int f21100x0;

    /* JADX INFO: renamed from: y */
    public C28134h f21101y;

    /* JADX INFO: renamed from: y0 */
    public final C15486e f21102y0;

    /* JADX INFO: renamed from: z */
    public final C28133g f21103z;

    public TabLayout(Context context, AttributeSet attributeSet) {
        super(AbstractC30554a.m93706a(context, attributeSet, R.attr.tabStyle, R.style.Widget_Design_TabLayout), attributeSet, R.attr.tabStyle);
        this.f21097w = -1;
        this.f21099x = new ArrayList();
        this.f21062K = -1;
        this.f21067P = 0;
        this.f21072U = Integer.MAX_VALUE;
        this.f21083i0 = -1;
        this.f21089o0 = new ArrayList();
        this.f21102y0 = new C15486e(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        C28133g c28133g = new C28133g(this, context2);
        this.f21103z = c28133g;
        super.addView(c28133g, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayM29873g = AbstractC11075m.m29873g(context2, attributeSet, AbstractC21885a.f84536M, R.attr.tabStyle, R.style.Widget_Design_TabLayout, 24);
        ColorStateList colorStateListM976p = AbstractC0354a.m976p(getBackground());
        if (colorStateListM976p != null) {
            C22788g c22788g = new C22788g();
            c22788g.m66011m(colorStateListM976p);
            c22788g.m66009k(context2);
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            c22788g.m66010l(AbstractC16877h0.m47510e(this));
            setBackground(c22788g);
        }
        setSelectedTabIndicator(AbstractC22674j.m65698F(typedArrayM29873g, context2, 5));
        setSelectedTabIndicatorColor(typedArrayM29873g.getColor(8, 0));
        c28133g.m85120b(typedArrayM29873g.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(typedArrayM29873g.getInt(10, 0));
        setTabIndicatorAnimationMode(typedArrayM29873g.getInt(7, 0));
        setTabIndicatorFullWidth(typedArrayM29873g.getBoolean(9, true));
        int dimensionPixelSize = typedArrayM29873g.getDimensionPixelSize(16, 0);
        this.f21059H = dimensionPixelSize;
        this.f21058G = dimensionPixelSize;
        this.f21057F = dimensionPixelSize;
        this.f21056E = dimensionPixelSize;
        this.f21056E = typedArrayM29873g.getDimensionPixelSize(19, dimensionPixelSize);
        this.f21057F = typedArrayM29873g.getDimensionPixelSize(20, dimensionPixelSize);
        this.f21058G = typedArrayM29873g.getDimensionPixelSize(18, dimensionPixelSize);
        this.f21059H = typedArrayM29873g.getDimensionPixelSize(17, dimensionPixelSize);
        if (AbstractC20301a.m56324W(context2, R.attr.isMaterial3Theme, false)) {
            this.f21060I = R.attr.textAppearanceTitleSmall;
        } else {
            this.f21060I = R.attr.textAppearanceButton;
        }
        int resourceId = typedArrayM29873g.getResourceId(24, R.style.TextAppearance_Design_Tab);
        this.f21061J = resourceId;
        int[] iArr = AbstractC22932a.f90530w;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f21069R = dimensionPixelSize2;
            this.f21063L = AbstractC22674j.m65695C(typedArrayObtainStyledAttributes, context2, 3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayM29873g.hasValue(22)) {
                this.f21062K = typedArrayM29873g.getResourceId(22, resourceId);
            }
            int i13 = this.f21062K;
            int[] iArr2 = HorizontalScrollView.EMPTY_STATE_SET;
            int[] iArr3 = HorizontalScrollView.SELECTED_STATE_SET;
            if (i13 != -1) {
                TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(i13, iArr);
                try {
                    typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, (int) dimensionPixelSize2);
                    ColorStateList colorStateListM65695C = AbstractC22674j.m65695C(typedArrayObtainStyledAttributes2, context2, 3);
                    if (colorStateListM65695C != null) {
                        this.f21063L = new ColorStateList(new int[][]{iArr3, iArr2}, new int[]{colorStateListM65695C.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListM65695C.getDefaultColor()), this.f21063L.getDefaultColor()});
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                } catch (Throwable th3) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th3;
                }
            }
            if (typedArrayM29873g.hasValue(25)) {
                this.f21063L = AbstractC22674j.m65695C(typedArrayM29873g, context2, 25);
            }
            if (typedArrayM29873g.hasValue(23)) {
                this.f21063L = new ColorStateList(new int[][]{iArr3, iArr2}, new int[]{typedArrayM29873g.getColor(23, 0), this.f21063L.getDefaultColor()});
            }
            this.f21064M = AbstractC22674j.m65695C(typedArrayM29873g, context2, 3);
            this.f21068Q = AbstractC11075m.m29874h(typedArrayM29873g.getInt(4, -1), null);
            this.f21065N = AbstractC22674j.m65695C(typedArrayM29873g, context2, 21);
            this.f21078d0 = typedArrayM29873g.getInt(6, 300);
            this.f21087m0 = AbstractC36259c.m115699l0(context2, R.attr.motionEasingEmphasizedInterpolator, AbstractC22766a.f89673b);
            this.f21073V = typedArrayM29873g.getDimensionPixelSize(14, -1);
            this.f21074W = typedArrayM29873g.getDimensionPixelSize(13, -1);
            this.f21071T = typedArrayM29873g.getResourceId(0, 0);
            this.f21076b0 = typedArrayM29873g.getDimensionPixelSize(1, 0);
            this.f21080f0 = typedArrayM29873g.getInt(15, 1);
            this.f21077c0 = typedArrayM29873g.getInt(2, 0);
            this.f21081g0 = typedArrayM29873g.getBoolean(12, false);
            this.f21085k0 = typedArrayM29873g.getBoolean(26, false);
            typedArrayM29873g.recycle();
            Resources resources = getResources();
            this.f21070S = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.f21075a0 = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            m15784d();
        } catch (Throwable th4) {
            typedArrayObtainStyledAttributes.recycle();
            throw th4;
        }
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.f21099x;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            C28134h c28134h = (C28134h) arrayList.get(i13);
            if (c28134h != null && c28134h.f113776a != null && !TextUtils.isEmpty(c28134h.f113777b)) {
                return !this.f21081g0 ? 72 : 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i13 = this.f21073V;
        if (i13 != -1) {
            return i13;
        }
        int i14 = this.f21080f0;
        if (i14 == 0 || i14 == 2) {
            return this.f21075a0;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f21103z.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i13) {
        C28133g c28133g = this.f21103z;
        int childCount = c28133g.getChildCount();
        if (i13 < childCount) {
            int i14 = 0;
            while (i14 < childCount) {
                View childAt = c28133g.getChildAt(i14);
                if ((i14 != i13 || childAt.isSelected()) && (i14 == i13 || !childAt.isSelected())) {
                    childAt.setSelected(i14 == i13);
                    childAt.setActivated(i14 == i13);
                } else {
                    childAt.setSelected(i14 == i13);
                    childAt.setActivated(i14 == i13);
                    if (childAt instanceof C28137k) {
                        ((C28137k) childAt).m85130g();
                    }
                }
                i14++;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m15781a(C28134h c28134h, boolean z4) {
        ArrayList arrayList = this.f21099x;
        int size = arrayList.size();
        if (c28134h.f113781f != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        c28134h.f113779d = size;
        arrayList.add(size, c28134h);
        int size2 = arrayList.size();
        int i13 = -1;
        for (int i14 = size + 1; i14 < size2; i14++) {
            if (((C28134h) arrayList.get(i14)).f113779d == this.f21097w) {
                i13 = i14;
            }
            ((C28134h) arrayList.get(i14)).f113779d = i14;
        }
        this.f21097w = i13;
        C28137k c28137k = c28134h.f113782g;
        c28137k.setSelected(false);
        c28137k.setActivated(false);
        int i15 = c28134h.f113779d;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.f21080f0 == 1 && this.f21077c0 == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.f21103z.addView(c28137k, i15, layoutParams);
        if (z4) {
            TabLayout tabLayout = c28134h.f113781f;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.m15791k(c28134h, true);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        m15782b(view);
    }

    /* JADX INFO: renamed from: b */
    public final void m15782b(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        TabItem tabItem = (TabItem) view;
        C28134h c28134hM15788h = m15788h();
        CharSequence charSequence = tabItem.f21052w;
        if (charSequence != null) {
            c28134hM15788h.m85123a(charSequence);
        }
        Drawable drawable = tabItem.f21053x;
        if (drawable != null) {
            c28134hM15788h.f113776a = drawable;
            TabLayout tabLayout = c28134hM15788h.f113781f;
            if (tabLayout.f21077c0 == 1 || tabLayout.f21080f0 == 2) {
                tabLayout.m15795o(true);
            }
            C28137k c28137k = c28134hM15788h.f113782g;
            if (c28137k != null) {
                c28137k.m85128e();
            }
        }
        int i13 = tabItem.f21054y;
        if (i13 != 0) {
            c28134hM15788h.f113780e = LayoutInflater.from(c28134hM15788h.f113782g.getContext()).inflate(i13, (ViewGroup) c28134hM15788h.f113782g, false);
            C28137k c28137k2 = c28134hM15788h.f113782g;
            if (c28137k2 != null) {
                c28137k2.m85128e();
            }
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            c28134hM15788h.f113778c = tabItem.getContentDescription();
            C28137k c28137k3 = c28134hM15788h.f113782g;
            if (c28137k3 != null) {
                c28137k3.m85128e();
            }
        }
        m15781a(c28134hM15788h, this.f21099x.isEmpty());
    }

    /* JADX INFO: renamed from: c */
    public final void m15783c(int i13) {
        if (i13 == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            if (isLaidOut()) {
                C28133g c28133g = this.f21103z;
                int childCount = c28133g.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    if (c28133g.getChildAt(i14).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int iM15785e = m15785e(0.0f, i13);
                if (scrollX != iM15785e) {
                    m15786f();
                    this.f21091q0.setIntValues(scrollX, iM15785e);
                    this.f21091q0.start();
                }
                ValueAnimator valueAnimator = c28133g.f113774w;
                if (valueAnimator != null && valueAnimator.isRunning() && c28133g.f113775x.f21097w != i13) {
                    c28133g.f113774w.cancel();
                }
                c28133g.m85122d(i13, this.f21078d0, true);
                return;
            }
        }
        m15793m(i13, 0.0f, true, true, true);
    }

    /* JADX INFO: renamed from: d */
    public final void m15784d() {
        int i13 = this.f21080f0;
        int iMax = (i13 == 0 || i13 == 2) ? Math.max(0, this.f21076b0 - this.f21056E) : 0;
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        C28133g c28133g = this.f21103z;
        c28133g.setPaddingRelative(iMax, 0, 0, 0);
        int i14 = this.f21080f0;
        if (i14 == 0) {
            int i15 = this.f21077c0;
            if (i15 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i15 == 1) {
                c28133g.setGravity(1);
            } else if (i15 == 2) {
            }
            c28133g.setGravity(8388611);
        } else if (i14 == 1 || i14 == 2) {
            if (this.f21077c0 == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            c28133g.setGravity(1);
        }
        m15795o(true);
    }

    /* JADX INFO: renamed from: e */
    public final int m15785e(float f13, int i13) {
        C28133g c28133g;
        View childAt;
        int i14 = this.f21080f0;
        if ((i14 != 0 && i14 != 2) || (childAt = (c28133g = this.f21103z).getChildAt(i13)) == null) {
            return 0;
        }
        int i15 = i13 + 1;
        View childAt2 = i15 < c28133g.getChildCount() ? c28133g.getChildAt(i15) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i16 = (int) ((width + width2) * 0.5f * f13);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        return getLayoutDirection() == 0 ? left + i16 : left - i16;
    }

    /* JADX INFO: renamed from: f */
    public final void m15786f() {
        if (this.f21091q0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f21091q0 = valueAnimator;
            valueAnimator.setInterpolator(this.f21087m0);
            this.f21091q0.setDuration(this.f21078d0);
            this.f21091q0.addUpdateListener(new C24644c(this, 1));
        }
    }

    /* JADX INFO: renamed from: g */
    public final C28134h m15787g(int i13) {
        if (i13 < 0 || i13 >= getTabCount()) {
            return null;
        }
        return (C28134h) this.f21099x.get(i13);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        C28134h c28134h = this.f21101y;
        if (c28134h != null) {
            return c28134h.f113779d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f21099x.size();
    }

    public int getTabGravity() {
        return this.f21077c0;
    }

    public ColorStateList getTabIconTint() {
        return this.f21064M;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f21084j0;
    }

    public int getTabIndicatorGravity() {
        return this.f21079e0;
    }

    public int getTabMaxWidth() {
        return this.f21072U;
    }

    public int getTabMode() {
        return this.f21080f0;
    }

    public ColorStateList getTabRippleColor() {
        return this.f21065N;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f21066O;
    }

    public ColorStateList getTabTextColors() {
        return this.f21063L;
    }

    /* JADX INFO: renamed from: h */
    public final C28134h m15788h() {
        C28134h c28134h = (C28134h) f21055z0.mo43684b();
        if (c28134h == null) {
            c28134h = new C28134h();
            c28134h.f113779d = -1;
        }
        c28134h.f113781f = this;
        C15486e c15486e = this.f21102y0;
        C28137k c28137k = c15486e != null ? (C28137k) c15486e.mo43684b() : null;
        if (c28137k == null) {
            c28137k = new C28137k(this, getContext());
        }
        c28137k.setTab(c28134h);
        c28137k.setFocusable(true);
        c28137k.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(c28134h.f113778c)) {
            c28137k.setContentDescription(c28134h.f113777b);
        } else {
            c28137k.setContentDescription(c28134h.f113778c);
        }
        c28134h.f113782g = c28137k;
        return c28134h;
    }

    /* JADX INFO: renamed from: i */
    public final void m15789i() {
        int currentItem;
        m15790j();
        AbstractC14345a abstractC14345a = this.f21093s0;
        if (abstractC14345a != null) {
            int iMo28901d = abstractC14345a.mo28901d();
            for (int i13 = 0; i13 < iMo28901d; i13++) {
                C28134h c28134hM15788h = m15788h();
                c28134hM15788h.m85123a(this.f21093s0.mo40966f(i13));
                m15781a(c28134hM15788h, false);
            }
            ViewPager viewPager = this.f21092r0;
            if (viewPager == null || iMo28901d <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            m15791k(m15787g(currentItem), true);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m15790j() {
        C28133g c28133g = this.f21103z;
        int childCount = c28133g.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            C28137k c28137k = (C28137k) c28133g.getChildAt(childCount);
            c28133g.removeViewAt(childCount);
            if (c28137k != null) {
                c28137k.setTab(null);
                c28137k.setSelected(false);
                this.f21102y0.mo43683a(c28137k);
            }
            requestLayout();
        }
        Iterator it = this.f21099x.iterator();
        while (it.hasNext()) {
            C28134h c28134h = (C28134h) it.next();
            it.remove();
            c28134h.f113781f = null;
            c28134h.f113782g = null;
            c28134h.f113776a = null;
            c28134h.f113777b = null;
            c28134h.f113778c = null;
            c28134h.f113779d = -1;
            c28134h.f113780e = null;
            f21055z0.mo43683a(c28134h);
        }
        this.f21101y = null;
    }

    /* JADX INFO: renamed from: k */
    public final void m15791k(C28134h c28134h, boolean z4) {
        TabLayout tabLayout;
        C28134h c28134h2 = this.f21101y;
        ArrayList arrayList = this.f21089o0;
        if (c28134h2 == c28134h) {
            if (c28134h2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((InterfaceC28129c) arrayList.get(size)).getClass();
                }
                m15783c(c28134h.f113779d);
                return;
            }
            return;
        }
        int i13 = c28134h != null ? c28134h.f113779d : -1;
        if (z4) {
            if ((c28134h2 == null || c28134h2.f113779d == -1) && i13 != -1) {
                tabLayout = this;
                tabLayout.m15793m(i13, 0.0f, true, true, true);
            } else {
                tabLayout = this;
                m15783c(i13);
            }
            if (i13 != -1) {
                setSelectedTabView(i13);
            }
        } else {
            tabLayout = this;
        }
        tabLayout.f21101y = c28134h;
        if (c28134h2 != null && c28134h2.f113781f != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((InterfaceC28129c) arrayList.get(size2)).getClass();
            }
        }
        if (c28134h != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((InterfaceC28129c) arrayList.get(size3)).mo85118a(c28134h);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m15792l(AbstractC14345a abstractC14345a, boolean z4) {
        C28131e c28131e;
        AbstractC14345a abstractC14345a2 = this.f21093s0;
        if (abstractC14345a2 != null && (c28131e = this.f21094t0) != null) {
            abstractC14345a2.m40973s(c28131e);
        }
        this.f21093s0 = abstractC14345a;
        if (z4 && abstractC14345a != null) {
            if (this.f21094t0 == null) {
                this.f21094t0 = new C28131e(this, 0);
            }
            abstractC14345a.m40969k(this.f21094t0);
        }
        m15789i();
    }

    /* JADX INFO: renamed from: m */
    public final void m15793m(int i13, float f13, boolean z4, boolean z13, boolean z14) {
        float f14 = i13 + f13;
        int iRound = Math.round(f14);
        if (iRound >= 0) {
            C28133g c28133g = this.f21103z;
            if (iRound >= c28133g.getChildCount()) {
                return;
            }
            if (z13) {
                c28133g.f113775x.f21097w = Math.round(f14);
                ValueAnimator valueAnimator = c28133g.f113774w;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    c28133g.f113774w.cancel();
                }
                c28133g.m85121c(c28133g.getChildAt(i13), c28133g.getChildAt(i13 + 1), f13);
            }
            ValueAnimator valueAnimator2 = this.f21091q0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f21091q0.cancel();
            }
            int iM15785e = m15785e(f13, i13);
            int scrollX = getScrollX();
            boolean z15 = (i13 < getSelectedTabPosition() && iM15785e >= scrollX) || (i13 > getSelectedTabPosition() && iM15785e <= scrollX) || i13 == getSelectedTabPosition();
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            if (getLayoutDirection() == 1) {
                z15 = (i13 < getSelectedTabPosition() && iM15785e <= scrollX) || (i13 > getSelectedTabPosition() && iM15785e >= scrollX) || i13 == getSelectedTabPosition();
            }
            if (z15 || this.f21100x0 == 1 || z14) {
                if (i13 < 0) {
                    iM15785e = 0;
                }
                scrollTo(iM15785e, 0);
            }
            if (z4) {
                setSelectedTabView(iRound);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m15794n(ViewPager viewPager, boolean z4) {
        TabLayout tabLayout;
        ViewPager viewPager2 = this.f21092r0;
        if (viewPager2 != null) {
            C28135i c28135i = this.f21095u0;
            if (c28135i != null) {
                viewPager2.m5466A(c28135i);
            }
            C28128b c28128b = this.f21096v0;
            if (c28128b != null) {
                this.f21092r0.m5501z(c28128b);
            }
        }
        C28138l c28138l = this.f21090p0;
        ArrayList arrayList = this.f21089o0;
        if (c28138l != null) {
            arrayList.remove(c28138l);
            this.f21090p0 = null;
        }
        if (viewPager != null) {
            this.f21092r0 = viewPager;
            if (this.f21095u0 == null) {
                this.f21095u0 = new C28135i(this);
            }
            C28135i c28135i2 = this.f21095u0;
            c28135i2.f113785c = 0;
            c28135i2.f113784b = 0;
            viewPager.m5478c(c28135i2);
            C28138l c28138l2 = new C28138l(viewPager, 0);
            this.f21090p0 = c28138l2;
            if (!arrayList.contains(c28138l2)) {
                arrayList.add(c28138l2);
            }
            AbstractC14345a adapter = viewPager.getAdapter();
            if (adapter != null) {
                m15792l(adapter, true);
            }
            if (this.f21096v0 == null) {
                this.f21096v0 = new C28128b(this);
            }
            C28128b c28128b2 = this.f21096v0;
            c28128b2.f113766a = true;
            viewPager.m5477b(c28128b2);
            m15793m(viewPager.getCurrentItem(), 0.0f, true, true, true);
            tabLayout = this;
        } else {
            tabLayout = this;
            tabLayout.f21092r0 = null;
            m15792l(null, false);
        }
        tabLayout.f21098w0 = z4;
    }

    /* JADX INFO: renamed from: o */
    public final void m15795o(boolean z4) {
        int i13 = 0;
        while (true) {
            C28133g c28133g = this.f21103z;
            if (i13 >= c28133g.getChildCount()) {
                return;
            }
            View childAt = c28133g.getChildAt(i13);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.f21080f0 == 1 && this.f21077c0 == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z4) {
                childAt.requestLayout();
            }
            i13++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C22788g) {
            AbstractC32411b.m101088c0(this, (C22788g) background);
        }
        if (this.f21092r0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m15794n((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f21098w0) {
            setupWithViewPager(null);
            this.f21098w0 = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C28137k c28137k;
        Drawable drawable;
        int i13 = 0;
        while (true) {
            C28133g c28133g = this.f21103z;
            if (i13 >= c28133g.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = c28133g.getChildAt(i13);
            if ((childAt instanceof C28137k) && (drawable = (c28137k = (C28137k) childAt).f113793I) != null) {
                drawable.setBounds(c28137k.getLeft(), c28137k.getTop(), c28137k.getRight(), c28137k.getBottom());
                c28137k.f113793I.draw(canvas);
            }
            i13++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C15585b.m43881c(1, getTabCount(), 1, false).f58535a);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        int iRound = Math.round(AbstractC11075m.m29870d(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i14);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i14 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + iRound, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i14) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i13);
        if (View.MeasureSpec.getMode(i13) != 0) {
            int iM29870d = this.f21074W;
            if (iM29870d <= 0) {
                iM29870d = (int) (size - AbstractC11075m.m29870d(getContext(), 56));
            }
            this.f21072U = iM29870d;
        }
        super.onMeasure(i13, i14);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i15 = this.f21080f0;
            if (i15 == 0) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (i15 != 1) {
                if (i15 != 2) {
                    return;
                }
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i14, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void setElevation(float f13) {
        super.setElevation(f13);
        Drawable background = getBackground();
        if (background instanceof C22788g) {
            ((C22788g) background).m66010l(f13);
        }
    }

    public void setInlineLabel(boolean z4) {
        if (this.f21081g0 == z4) {
            return;
        }
        this.f21081g0 = z4;
        int i13 = 0;
        while (true) {
            C28133g c28133g = this.f21103z;
            if (i13 >= c28133g.getChildCount()) {
                m15784d();
                return;
            }
            View childAt = c28133g.getChildAt(i13);
            if (childAt instanceof C28137k) {
                C28137k c28137k = (C28137k) childAt;
                c28137k.setOrientation(!c28137k.f113795K.f21081g0 ? 1 : 0);
                TextView textView = c28137k.f113791G;
                if (textView == null && c28137k.f113792H == null) {
                    c28137k.m85131h(c28137k.f113797x, c28137k.f113798y, true);
                } else {
                    c28137k.m85131h(textView, c28137k.f113792H, false);
                }
            }
            i13++;
        }
    }

    public void setInlineLabelResource(int i13) {
        setInlineLabel(getResources().getBoolean(i13));
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC28130d interfaceC28130d) {
        setOnTabSelectedListener((InterfaceC28129c) interfaceC28130d);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m15786f();
        this.f21091q0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = drawable.mutate();
        this.f21066O = drawableMutate;
        int i13 = this.f21067P;
        if (i13 != 0) {
            drawableMutate.setTint(i13);
        } else {
            drawableMutate.setTintList(null);
        }
        int intrinsicHeight = this.f21083i0;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.f21066O.getIntrinsicHeight();
        }
        this.f21103z.m85120b(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(int i13) {
        this.f21067P = i13;
        Drawable drawable = this.f21066O;
        if (i13 != 0) {
            drawable.setTint(i13);
        } else {
            drawable.setTintList(null);
        }
        m15795o(false);
    }

    public void setSelectedTabIndicatorGravity(int i13) {
        if (this.f21079e0 != i13) {
            this.f21079e0 = i13;
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            this.f21103z.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i13) {
        this.f21083i0 = i13;
        this.f21103z.m85120b(i13);
    }

    public void setTabGravity(int i13) {
        if (this.f21077c0 != i13) {
            this.f21077c0 = i13;
            m15784d();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f21064M != colorStateList) {
            this.f21064M = colorStateList;
            ArrayList arrayList = this.f21099x;
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                C28137k c28137k = ((C28134h) arrayList.get(i13)).f113782g;
                if (c28137k != null) {
                    c28137k.m85128e();
                }
            }
        }
    }

    public void setTabIconTintResource(int i13) {
        setTabIconTint(AbstractC32122c.getColorStateList(getContext(), i13));
    }

    public void setTabIndicatorAnimationMode(int i13) {
        this.f21084j0 = i13;
        if (i13 == 0) {
            this.f21086l0 = new C26702o(9, false);
        } else if (i13 == 1) {
            this.f21086l0 = new C28127a(0);
        } else {
            if (i13 != 2) {
                throw new IllegalArgumentException(AbstractC31061c.m95635k(i13, " is not a valid TabIndicatorAnimationMode"));
            }
            this.f21086l0 = new C28127a(1);
        }
    }

    public void setTabIndicatorFullWidth(boolean z4) {
        this.f21082h0 = z4;
        int i13 = C28133g.f113773y;
        C28133g c28133g = this.f21103z;
        c28133g.m85119a(c28133g.f113775x.getSelectedTabPosition());
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        c28133g.postInvalidateOnAnimation();
    }

    public void setTabMode(int i13) {
        if (i13 != this.f21080f0) {
            this.f21080f0 = i13;
            m15784d();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f21065N == colorStateList) {
            return;
        }
        this.f21065N = colorStateList;
        int i13 = 0;
        while (true) {
            C28133g c28133g = this.f21103z;
            if (i13 >= c28133g.getChildCount()) {
                return;
            }
            View childAt = c28133g.getChildAt(i13);
            if (childAt instanceof C28137k) {
                Context context = getContext();
                int i14 = C28137k.f113788L;
                ((C28137k) childAt).m85129f(context);
            }
            i13++;
        }
    }

    public void setTabRippleColorResource(int i13) {
        setTabRippleColor(AbstractC32122c.getColorStateList(getContext(), i13));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f21063L != colorStateList) {
            this.f21063L = colorStateList;
            ArrayList arrayList = this.f21099x;
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                C28137k c28137k = ((C28134h) arrayList.get(i13)).f113782g;
                if (c28137k != null) {
                    c28137k.m85128e();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(AbstractC14345a abstractC14345a) {
        m15792l(abstractC14345a, false);
    }

    public void setUnboundedRipple(boolean z4) {
        if (this.f21085k0 == z4) {
            return;
        }
        this.f21085k0 = z4;
        int i13 = 0;
        while (true) {
            C28133g c28133g = this.f21103z;
            if (i13 >= c28133g.getChildCount()) {
                return;
            }
            View childAt = c28133g.getChildAt(i13);
            if (childAt instanceof C28137k) {
                Context context = getContext();
                int i14 = C28137k.f113788L;
                ((C28137k) childAt).m85129f(context);
            }
            i13++;
        }
    }

    public void setUnboundedRippleResource(int i13) {
        setUnboundedRipple(getResources().getBoolean(i13));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        m15794n(viewPager, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i13) {
        m15782b(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC28129c interfaceC28129c) {
        InterfaceC28129c interfaceC28129c2 = this.f21088n0;
        ArrayList arrayList = this.f21089o0;
        if (interfaceC28129c2 != null) {
            arrayList.remove(interfaceC28129c2);
        }
        this.f21088n0 = interfaceC28129c;
        if (interfaceC28129c == null || arrayList.contains(interfaceC28129c)) {
            return;
        }
        arrayList.add(interfaceC28129c);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m15782b(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i13, ViewGroup.LayoutParams layoutParams) {
        m15782b(view);
    }

    public void setSelectedTabIndicator(int i13) {
        if (i13 != 0) {
            setSelectedTabIndicator(AbstractC30060g.m92133x(getContext(), i13));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
