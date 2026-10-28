package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.WeakHashMap;
import p000.AbstractC30802r;
import p026b2.C2298d;
import p036bq.RunnableC3543b;
import p144fc.AbstractC14345a;
import p144fc.C14348d;
import p144fc.C14349e;
import p144fc.C14353i;
import p144fc.C14354j;
import p144fc.C14356l;
import p144fc.InterfaceC14347c;
import p144fc.InterfaceC14350f;
import p144fc.InterfaceC14351g;
import p144fc.InterfaceC14352h;
import p144fc.InterpolatorC14346b;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p319m4.AbstractC25012a;
import p377or.C28128b;
import p479s4.AbstractC32122c;
import p619xl.C38445a;

/* JADX INFO: loaded from: classes5.dex */
public class ViewPager extends ViewGroup {

    /* JADX INFO: renamed from: H0 */
    static final int[] f7233H0 = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: I0 */
    private static final Comparator<C14348d> f7234I0 = new C2298d(4);

    /* JADX INFO: renamed from: J0 */
    private static final Interpolator f7235J0 = new InterpolatorC14346b(0);

    /* JADX INFO: renamed from: K0 */
    private static final C14356l f7236K0 = new C14356l();

    /* JADX INFO: renamed from: A0 */
    private List<InterfaceC14350f> f7237A0;

    /* JADX INFO: renamed from: B0 */
    private InterfaceC14352h f7238B0;

    /* JADX INFO: renamed from: C0 */
    private int f7239C0;

    /* JADX INFO: renamed from: D0 */
    private int f7240D0;

    /* JADX INFO: renamed from: E */
    AbstractC14345a f7241E;

    /* JADX INFO: renamed from: E0 */
    private ArrayList<View> f7242E0;

    /* JADX INFO: renamed from: F */
    int f7243F;

    /* JADX INFO: renamed from: F0 */
    private final Runnable f7244F0;

    /* JADX INFO: renamed from: G */
    private int f7245G;

    /* JADX INFO: renamed from: G0 */
    private int f7246G0;

    /* JADX INFO: renamed from: H */
    private Parcelable f7247H;

    /* JADX INFO: renamed from: I */
    private ClassLoader f7248I;

    /* JADX INFO: renamed from: J */
    private Scroller f7249J;

    /* JADX INFO: renamed from: K */
    private boolean f7250K;

    /* JADX INFO: renamed from: L */
    private C14353i f7251L;

    /* JADX INFO: renamed from: M */
    private int f7252M;

    /* JADX INFO: renamed from: N */
    private Drawable f7253N;

    /* JADX INFO: renamed from: O */
    private int f7254O;

    /* JADX INFO: renamed from: P */
    private int f7255P;

    /* JADX INFO: renamed from: Q */
    private float f7256Q;

    /* JADX INFO: renamed from: R */
    private float f7257R;

    /* JADX INFO: renamed from: S */
    private int f7258S;

    /* JADX INFO: renamed from: T */
    private int f7259T;

    /* JADX INFO: renamed from: U */
    private boolean f7260U;

    /* JADX INFO: renamed from: V */
    private boolean f7261V;

    /* JADX INFO: renamed from: W */
    private boolean f7262W;

    /* JADX INFO: renamed from: a0 */
    private int f7263a0;

    /* JADX INFO: renamed from: b0 */
    private boolean f7264b0;

    /* JADX INFO: renamed from: c0 */
    private boolean f7265c0;

    /* JADX INFO: renamed from: d0 */
    private int f7266d0;

    /* JADX INFO: renamed from: e0 */
    private int f7267e0;

    /* JADX INFO: renamed from: f0 */
    private int f7268f0;

    /* JADX INFO: renamed from: g0 */
    private float f7269g0;

    /* JADX INFO: renamed from: h0 */
    private float f7270h0;

    /* JADX INFO: renamed from: i0 */
    private float f7271i0;

    /* JADX INFO: renamed from: j0 */
    private float f7272j0;

    /* JADX INFO: renamed from: k0 */
    private int f7273k0;

    /* JADX INFO: renamed from: l0 */
    private VelocityTracker f7274l0;

    /* JADX INFO: renamed from: m0 */
    private int f7275m0;

    /* JADX INFO: renamed from: n0 */
    private int f7276n0;

    /* JADX INFO: renamed from: o0 */
    private int f7277o0;

    /* JADX INFO: renamed from: p0 */
    private int f7278p0;

    /* JADX INFO: renamed from: q0 */
    private boolean f7279q0;

    /* JADX INFO: renamed from: r0 */
    private EdgeEffect f7280r0;

    /* JADX INFO: renamed from: s0 */
    private EdgeEffect f7281s0;

    /* JADX INFO: renamed from: t0 */
    private boolean f7282t0;

    /* JADX INFO: renamed from: u0 */
    private boolean f7283u0;

    /* JADX INFO: renamed from: v0 */
    private boolean f7284v0;

    /* JADX INFO: renamed from: w */
    private int f7285w;

    /* JADX INFO: renamed from: w0 */
    private int f7286w0;

    /* JADX INFO: renamed from: x */
    private final ArrayList<C14348d> f7287x;

    /* JADX INFO: renamed from: x0 */
    private List<InterfaceC14351g> f7288x0;

    /* JADX INFO: renamed from: y */
    private final C14348d f7289y;

    /* JADX INFO: renamed from: y0 */
    private InterfaceC14351g f7290y0;

    /* JADX INFO: renamed from: z */
    private final Rect f7291z;

    /* JADX INFO: renamed from: z0 */
    private InterfaceC14351g f7292z0;

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7287x = new ArrayList<>();
        this.f7289y = new C14348d();
        this.f7291z = new Rect();
        this.f7245G = -1;
        this.f7247H = null;
        this.f7248I = null;
        this.f7256Q = -3.4028235E38f;
        this.f7257R = Float.MAX_VALUE;
        this.f7263a0 = 1;
        this.f7273k0 = -1;
        this.f7282t0 = true;
        this.f7283u0 = false;
        this.f7244F0 = new RunnableC3543b(this, 4);
        this.f7246G0 = 0;
        m5491p();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z4) {
        if (this.f7261V != z4) {
            this.f7261V = z4;
        }
    }

    /* JADX INFO: renamed from: A */
    public void m5466A(InterfaceC14351g interfaceC14351g) {
        List<InterfaceC14351g> list = this.f7288x0;
        if (list != null) {
            list.remove(interfaceC14351g);
        }
    }

    /* JADX INFO: renamed from: B */
    public final boolean m5467B() {
        this.f7273k0 = -1;
        this.f7264b0 = false;
        this.f7265c0 = false;
        VelocityTracker velocityTracker = this.f7274l0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f7274l0 = null;
        }
        this.f7280r0.onRelease();
        this.f7281s0.onRelease();
        return this.f7280r0.isFinished() || this.f7281s0.isFinished();
    }

    /* JADX INFO: renamed from: C */
    public final void m5468C(int i13, int i14, boolean z4, boolean z13) {
        int iMax;
        C14348d c14348dM5490o = m5490o(i13);
        if (c14348dM5490o != null) {
            iMax = (int) (Math.max(this.f7256Q, Math.min(c14348dM5490o.f52403e, this.f7257R)) * getClientWidth());
        } else {
            iMax = 0;
        }
        if (z4) {
            m5474I(iMax, 0, i14);
            if (z13) {
                m5483h(i13);
                return;
            }
            return;
        }
        if (z13) {
            m5483h(i13);
        }
        m5481f(false);
        scrollTo(iMax, 0);
        m5496u(iMax);
    }

    /* JADX INFO: renamed from: D */
    public void m5469D(int i13, boolean z4) {
        this.f7262W = false;
        m5470E(i13, z4, false);
    }

    /* JADX INFO: renamed from: E */
    public void m5470E(int i13, boolean z4, boolean z13) {
        m5471F(i13, z4, z13, 0);
    }

    /* JADX INFO: renamed from: F */
    public void m5471F(int i13, boolean z4, boolean z13, int i14) {
        AbstractC14345a abstractC14345a = this.f7241E;
        if (abstractC14345a == null || abstractC14345a.mo28901d() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z13 && this.f7243F == i13 && this.f7287x.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i13 < 0) {
            i13 = 0;
        } else if (i13 >= this.f7241E.mo28901d()) {
            i13 = this.f7241E.mo28901d() - 1;
        }
        int i15 = this.f7263a0;
        int i16 = this.f7243F;
        if (i13 > i16 + i15 || i13 < i16 - i15) {
            for (int i17 = 0; i17 < this.f7287x.size(); i17++) {
                this.f7287x.get(i17).f52401c = true;
            }
        }
        boolean z14 = this.f7243F != i13;
        if (!this.f7282t0) {
            m5499x(i13);
            m5468C(i13, i14, z4, z14);
        } else {
            this.f7243F = i13;
            if (z14) {
                m5483h(i13);
            }
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: G */
    public void m5472G(boolean z4, InterfaceC14352h interfaceC14352h) {
        m5473H(z4, interfaceC14352h, 2);
    }

    /* JADX INFO: renamed from: H */
    public void m5473H(boolean z4, InterfaceC14352h interfaceC14352h, int i13) {
        boolean z13 = interfaceC14352h != null;
        boolean z14 = z13 != (this.f7238B0 != null);
        this.f7238B0 = interfaceC14352h;
        setChildrenDrawingOrderEnabled(z13);
        if (z13) {
            this.f7240D0 = z4 ? 2 : 1;
            this.f7239C0 = i13;
        } else {
            this.f7240D0 = 0;
        }
        if (z14) {
            m5498w();
        }
    }

    /* JADX INFO: renamed from: I */
    public void m5474I(int i13, int i14, int i15) {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f7249J;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            scrollX = this.f7250K ? this.f7249J.getCurrX() : this.f7249J.getStartX();
            this.f7249J.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int i16 = scrollX;
        int scrollY = getScrollY();
        int i17 = i13 - i16;
        int i18 = i14 - scrollY;
        if (i17 == 0 && i18 == 0) {
            m5481f(false);
            m5498w();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i19 = clientWidth / 2;
        float f13 = clientWidth;
        float f14 = i19;
        float fM5484i = (m5484i(Math.min(1.0f, (Math.abs(i17) * 1.0f) / f13)) * f14) + f14;
        int iAbs2 = Math.abs(i15);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fM5484i / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i17) / ((this.f7241E.m40967g(this.f7243F) * f13) + this.f7252M)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.f7250K = false;
        this.f7249J.startScroll(i16, scrollY, i17, i18, iMin);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: J */
    public final void m5475J() {
        if (this.f7240D0 != 0) {
            ArrayList<View> arrayList = this.f7242E0;
            if (arrayList == null) {
                this.f7242E0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                this.f7242E0.add(getChildAt(i13));
            }
            Collections.sort(this.f7242E0, f7236K0);
        }
    }

    /* JADX INFO: renamed from: a */
    public C14348d m5476a(int i13, int i14) {
        C14348d c14348d = new C14348d();
        c14348d.f52400b = i13;
        c14348d.f52399a = this.f7241E.mo4234h(this, i13);
        c14348d.f52402d = this.f7241E.m40967g(i13);
        if (i14 < 0 || i14 >= this.f7287x.size()) {
            this.f7287x.add(c14348d);
            return c14348d;
        }
        this.f7287x.add(i14, c14348d);
        return c14348d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i13, int i14) {
        C14348d c14348dM5488m;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i15 = 0; i15 < getChildCount(); i15++) {
                View childAt = getChildAt(i15);
                if (childAt.getVisibility() == 0 && (c14348dM5488m = m5488m(childAt)) != null && c14348dM5488m.f52400b == this.f7243F) {
                    childAt.addFocusables(arrayList, i13, i14);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i14 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        C14348d c14348dM5488m;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() == 0 && (c14348dM5488m = m5488m(childAt)) != null && c14348dM5488m.f52400b == this.f7243F) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i13, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C14349e c14349e = (C14349e) layoutParams;
        boolean z4 = c14349e.f52404a | (view.getClass().getAnnotation(InterfaceC14347c.class) != null);
        c14349e.f52404a = z4;
        if (!this.f7260U) {
            super.addView(view, i13, layoutParams);
        } else {
            if (z4) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c14349e.f52407d = true;
            addViewInLayout(view, i13, layoutParams);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m5477b(InterfaceC14350f interfaceC14350f) {
        if (this.f7237A0 == null) {
            this.f7237A0 = new ArrayList();
        }
        this.f7237A0.add(interfaceC14350f);
    }

    /* JADX INFO: renamed from: c */
    public void m5478c(InterfaceC14351g interfaceC14351g) {
        if (this.f7288x0 == null) {
            this.f7288x0 = new ArrayList();
        }
        this.f7288x0.add(interfaceC14351g);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i13) {
        if (this.f7241E == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i13 < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.f7256Q));
        }
        return i13 > 0 && scrollX < ((int) (((float) clientWidth) * this.f7257R));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C14349e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f7250K = true;
        if (this.f7249J.isFinished() || !this.f7249J.computeScrollOffset()) {
            m5481f(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f7249J.getCurrX();
        int currY = this.f7249J.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!m5496u(currX)) {
                this.f7249J.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    /* JADX INFO: renamed from: d */
    public boolean m5479d(int i13) {
        boolean zM5494s;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
            break;
        }
        if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(viewFindFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb4.append(" => ");
                        sb4.append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb4.toString());
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i13);
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            if (i13 == 17 || i13 == 1) {
                zM5494s = m5494s();
            } else if (i13 == 66 || i13 == 2) {
                zM5494s = m5495t();
            } else {
                zM5494s = false;
            }
        } else if (i13 == 17) {
            zM5494s = (viewFindFocus == null || m5486k(viewFindNextFocus, this.f7291z).left < m5486k(viewFindFocus, this.f7291z).left) ? viewFindNextFocus.requestFocus() : m5494s();
        } else if (i13 == 66) {
            zM5494s = (viewFindFocus == null || m5486k(viewFindNextFocus, this.f7291z).left > m5486k(viewFindFocus, this.f7291z).left) ? viewFindNextFocus.requestFocus() : m5495t();
        } else {
            zM5494s = false;
        }
        if (zM5494s) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i13));
        }
        return zM5494s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m5485j(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C14348d c14348dM5488m;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() == 0 && (c14348dM5488m = m5488m(childAt)) != null && c14348dM5488m.f52400b == this.f7243F && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        AbstractC14345a abstractC14345a;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (abstractC14345a = this.f7241E) != null && abstractC14345a.mo28901d() > 1)) {
            if (!this.f7280r0.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f7256Q * width);
                this.f7280r0.setSize(height, width);
                zDraw = this.f7280r0.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.f7281s0.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f7257R + 1.0f)) * width2);
                this.f7281s0.setSize(height2, width2);
                zDraw |= this.f7281s0.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.f7280r0.finish();
            this.f7281s0.finish();
        }
        if (zDraw) {
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f7253N;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    /* JADX INFO: renamed from: e */
    public boolean m5480e(View view, boolean z4, int i13, int i14, int i15) {
        int i16;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i17 = i14 + scrollX;
                if (i17 >= childAt.getLeft() && i17 < childAt.getRight() && (i16 = i15 + scrollY) >= childAt.getTop() && i16 < childAt.getBottom() && m5480e(childAt, true, i13, i17 - childAt.getLeft(), i16 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z4 && view.canScrollHorizontally(-i13);
    }

    /* JADX INFO: renamed from: f */
    public final void m5481f(boolean z4) {
        boolean z13 = this.f7246G0 == 2;
        if (z13) {
            setScrollingCacheEnabled(false);
            if (!this.f7249J.isFinished()) {
                this.f7249J.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f7249J.getCurrX();
                int currY = this.f7249J.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m5496u(currX);
                    }
                }
            }
        }
        this.f7262W = false;
        for (int i13 = 0; i13 < this.f7287x.size(); i13++) {
            C14348d c14348d = this.f7287x.get(i13);
            if (c14348d.f52401c) {
                c14348d.f52401c = false;
                z13 = true;
            }
        }
        if (z13) {
            if (!z4) {
                this.f7244F0.run();
                return;
            }
            Runnable runnable = this.f7244F0;
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            postOnAnimation(runnable);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m5482g() {
        int iMo28901d = this.f7241E.mo28901d();
        this.f7285w = iMo28901d;
        boolean z4 = this.f7287x.size() < (this.f7263a0 * 2) + 1 && this.f7287x.size() < iMo28901d;
        int iMax = this.f7243F;
        int i13 = 0;
        boolean z13 = false;
        while (i13 < this.f7287x.size()) {
            C14348d c14348d = this.f7287x.get(i13);
            int iMo40965e = this.f7241E.mo40965e(c14348d.f52399a);
            if (iMo40965e != -1) {
                if (iMo40965e == -2) {
                    this.f7287x.remove(i13);
                    i13--;
                    if (!z13) {
                        this.f7241E.mo4239r(this);
                        z13 = true;
                    }
                    this.f7241E.mo4232a(this, c14348d.f52400b, c14348d.f52399a);
                    int i14 = this.f7243F;
                    if (i14 == c14348d.f52400b) {
                        iMax = Math.max(0, Math.min(i14, iMo28901d - 1));
                    }
                } else {
                    int i15 = c14348d.f52400b;
                    if (i15 != iMo40965e) {
                        if (i15 == this.f7243F) {
                            iMax = iMo40965e;
                        }
                        c14348d.f52400b = iMo40965e;
                    }
                }
                z4 = true;
            }
            i13++;
        }
        if (z13) {
            this.f7241E.mo4233c(this);
        }
        Collections.sort(this.f7287x, f7234I0);
        if (z4) {
            int childCount = getChildCount();
            for (int i16 = 0; i16 < childCount; i16++) {
                C14349e c14349e = (C14349e) getChildAt(i16).getLayoutParams();
                if (!c14349e.f52404a) {
                    c14349e.f52406c = 0.0f;
                }
            }
            m5470E(iMax, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C14349e c14349e = new C14349e(-1, -1);
        c14349e.f52406c = 0.0f;
        return c14349e;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AbstractC14345a getAdapter() {
        return this.f7241E;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i13, int i14) {
        if (this.f7240D0 == 2) {
            i14 = (i13 - 1) - i14;
        }
        return ((C14349e) this.f7242E0.get(i14).getLayoutParams()).f52409f;
    }

    public int getCurrentItem() {
        return this.f7243F;
    }

    public int getOffscreenPageLimit() {
        return this.f7263a0;
    }

    public int getPageMargin() {
        return this.f7252M;
    }

    /* JADX INFO: renamed from: h */
    public final void m5483h(int i13) {
        InterfaceC14351g interfaceC14351g = this.f7290y0;
        if (interfaceC14351g != null) {
            interfaceC14351g.mo19079c(i13);
        }
        List<InterfaceC14351g> list = this.f7288x0;
        if (list != null) {
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                InterfaceC14351g interfaceC14351g2 = this.f7288x0.get(i14);
                if (interfaceC14351g2 != null) {
                    interfaceC14351g2.mo19079c(i13);
                }
            }
        }
        InterfaceC14351g interfaceC14351g3 = this.f7292z0;
        if (interfaceC14351g3 != null) {
            interfaceC14351g3.mo19079c(i13);
        }
    }

    /* JADX INFO: renamed from: i */
    public float m5484i(float f13) {
        return (float) Math.sin((f13 - 0.5f) * 0.47123894f);
    }

    /* JADX INFO: renamed from: j */
    public boolean m5485j(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            return keyEvent.hasModifiers(2) ? m5494s() : m5479d(17);
        }
        if (keyCode == 22) {
            return keyEvent.hasModifiers(2) ? m5495t() : m5479d(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return m5479d(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return m5479d(1);
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final Rect m5486k(View view, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* JADX INFO: renamed from: l */
    public C14348d m5487l(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return m5488m(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    /* JADX INFO: renamed from: m */
    public C14348d m5488m(View view) {
        for (int i13 = 0; i13 < this.f7287x.size(); i13++) {
            C14348d c14348d = this.f7287x.get(i13);
            if (this.f7241E.mo4235i(view, c14348d.f52399a)) {
                return c14348d;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final C14348d m5489n() {
        int i13;
        int clientWidth = getClientWidth();
        float f13 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f14 = clientWidth > 0 ? this.f7252M / clientWidth : 0.0f;
        int i14 = 0;
        boolean z4 = true;
        C14348d c14348d = null;
        int i15 = -1;
        float f15 = 0.0f;
        while (i14 < this.f7287x.size()) {
            C14348d c14348d2 = this.f7287x.get(i14);
            if (!z4 && c14348d2.f52400b != (i13 = i15 + 1)) {
                c14348d2 = this.f7289y;
                c14348d2.f52403e = f13 + f15 + f14;
                c14348d2.f52400b = i13;
                c14348d2.f52402d = this.f7241E.m40967g(i13);
                i14--;
            }
            C14348d c14348d3 = c14348d2;
            f13 = c14348d3.f52403e;
            float f16 = c14348d3.f52402d + f13 + f14;
            if (!z4 && scrollX < f13) {
                break;
            }
            if (scrollX < f16 || i14 == this.f7287x.size() - 1) {
                return c14348d3;
            }
            int i16 = c14348d3.f52400b;
            float f17 = c14348d3.f52402d;
            i14++;
            i15 = i16;
            f15 = f17;
            c14348d = c14348d3;
            z4 = false;
        }
        return c14348d;
    }

    /* JADX INFO: renamed from: o */
    public C14348d m5490o(int i13) {
        for (int i14 = 0; i14 < this.f7287x.size(); i14++) {
            C14348d c14348d = this.f7287x.get(i14);
            if (c14348d.f52400b == i13) {
                return c14348d;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7282t0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f7244F0);
        Scroller scroller = this.f7249J;
        if (scroller != null && !scroller.isFinished()) {
            this.f7249J.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i13;
        float f13;
        super.onDraw(canvas);
        if (this.f7252M <= 0 || this.f7253N == null || this.f7287x.size() <= 0 || this.f7241E == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f14 = width;
        float f15 = this.f7252M / f14;
        int i14 = 0;
        C14348d c14348d = this.f7287x.get(0);
        float f16 = c14348d.f52403e;
        int size = this.f7287x.size();
        int i15 = c14348d.f52400b;
        int i16 = this.f7287x.get(size - 1).f52400b;
        while (i15 < i16) {
            while (true) {
                i13 = c14348d.f52400b;
                if (i15 <= i13 || i14 >= size) {
                    break;
                }
                i14++;
                c14348d = this.f7287x.get(i14);
            }
            if (i15 == i13) {
                float f17 = c14348d.f52403e;
                float f18 = c14348d.f52402d;
                f13 = (f17 + f18) * f14;
                f16 = f17 + f18 + f15;
            } else {
                float fM40967g = this.f7241E.m40967g(i15);
                f13 = (f16 + fM40967g) * f14;
                f16 = fM40967g + f15 + f16;
            }
            if (this.f7252M + f13 > scrollX) {
                this.f7253N.setBounds(Math.round(f13), this.f7254O, Math.round(this.f7252M + f13), this.f7255P);
                this.f7253N.draw(canvas);
            }
            if (f13 > scrollX + width) {
                return;
            }
            i15++;
            scrollX = scrollX;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m5467B();
            return false;
        }
        if (action != 0) {
            if (this.f7264b0) {
                return true;
            }
            if (this.f7265c0) {
                return false;
            }
        }
        if (action == 0) {
            float x3 = motionEvent.getX();
            this.f7271i0 = x3;
            this.f7269g0 = x3;
            float y13 = motionEvent.getY();
            this.f7272j0 = y13;
            this.f7270h0 = y13;
            this.f7273k0 = motionEvent.getPointerId(0);
            this.f7265c0 = false;
            this.f7250K = true;
            this.f7249J.computeScrollOffset();
            if (this.f7246G0 != 2 || Math.abs(this.f7249J.getFinalX() - this.f7249J.getCurrX()) <= this.f7278p0) {
                m5481f(false);
                this.f7264b0 = false;
            } else {
                this.f7249J.abortAnimation();
                this.f7262W = false;
                m5498w();
                this.f7264b0 = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i13 = this.f7273k0;
            if (i13 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i13);
                float x5 = motionEvent.getX(iFindPointerIndex);
                float f13 = x5 - this.f7269g0;
                float fAbs = Math.abs(f13);
                float y14 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y14 - this.f7272j0);
                if (f13 != 0.0f) {
                    float f14 = this.f7269g0;
                    if ((f14 >= this.f7267e0 || f13 <= 0.0f) && ((f14 <= getWidth() - this.f7267e0 || f13 >= 0.0f) && m5480e(this, false, (int) f13, (int) x5, (int) y14))) {
                        this.f7269g0 = x5;
                        this.f7270h0 = y14;
                        this.f7265c0 = true;
                        return false;
                    }
                }
                float f15 = this.f7268f0;
                if (fAbs > f15 && fAbs * 0.5f > fAbs2) {
                    this.f7264b0 = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f16 = this.f7271i0;
                    float f17 = this.f7268f0;
                    this.f7269g0 = f13 > 0.0f ? f16 + f17 : f16 - f17;
                    this.f7270h0 = y14;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > f15) {
                    this.f7265c0 = true;
                }
                if (this.f7264b0 && m5497v(x5)) {
                    WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            m5493r(motionEvent);
        }
        if (this.f7274l0 == null) {
            this.f7274l0 = VelocityTracker.obtain();
        }
        this.f7274l0.addMovement(motionEvent);
        return this.f7264b0;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        boolean z13;
        C14348d c14348dM5488m;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i17 = i15 - i13;
        int i18 = i16 - i14;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i19 = 0;
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt = getChildAt(i24);
            if (childAt.getVisibility() != 8) {
                C14349e c14349e = (C14349e) childAt.getLayoutParams();
                if (c14349e.f52404a) {
                    int i25 = c14349e.f52405b;
                    int i26 = i25 & 7;
                    int i27 = i25 & 112;
                    if (i26 != 1) {
                        if (i26 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i26 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i17 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i27 != 16) {
                            if (i27 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i27 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i18 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i28 = paddingLeft + scrollX;
                            childAt.layout(i28, paddingTop, childAt.getMeasuredWidth() + i28, childAt.getMeasuredHeight() + paddingTop);
                            i19++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i18 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i29 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i29;
                        int i210 = paddingLeft + scrollX;
                        childAt.layout(i210, paddingTop, childAt.getMeasuredWidth() + i210, childAt.getMeasuredHeight() + paddingTop);
                        i19++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i17 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i34 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i34;
                    if (i27 != 16) {
                        if (i27 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i27 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i18 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i211 = paddingLeft + scrollX;
                        childAt.layout(i211, paddingTop, childAt.getMeasuredWidth() + i211, childAt.getMeasuredHeight() + paddingTop);
                        i19++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i18 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i212 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i212;
                    int i213 = paddingLeft + scrollX;
                    childAt.layout(i213, paddingTop, childAt.getMeasuredWidth() + i213, childAt.getMeasuredHeight() + paddingTop);
                    i19++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i35 = (i17 - paddingLeft) - paddingRight;
        for (int i36 = 0; i36 < childCount; i36++) {
            View childAt2 = getChildAt(i36);
            if (childAt2.getVisibility() != 8) {
                C14349e c14349e2 = (C14349e) childAt2.getLayoutParams();
                if (!c14349e2.f52404a && (c14348dM5488m = m5488m(childAt2)) != null) {
                    float f13 = i35;
                    int i37 = ((int) (c14348dM5488m.f52403e * f13)) + paddingLeft;
                    if (c14349e2.f52407d) {
                        c14349e2.f52407d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f13 * c14349e2.f52406c), 1073741824), View.MeasureSpec.makeMeasureSpec((i18 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i37, paddingTop, childAt2.getMeasuredWidth() + i37, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f7254O = paddingTop;
        this.f7255P = i18 - paddingBottom;
        this.f7286w0 = i19;
        if (this.f7282t0) {
            z13 = false;
            m5468C(this.f7243F, 0, false, false);
        } else {
            z13 = false;
        }
        this.f7282t0 = z13;
    }

    @Override // android.view.View
    public void onMeasure(int i13, int i14) {
        C14349e c14349e;
        C14349e c14349e2;
        int i15;
        setMeasuredDimension(View.getDefaultSize(0, i13), View.getDefaultSize(0, i14));
        int measuredWidth = getMeasuredWidth();
        this.f7267e0 = Math.min(measuredWidth / 10, this.f7266d0);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i16 = 0;
        while (true) {
            boolean z4 = true;
            int i17 = 1073741824;
            if (i16 >= childCount) {
                break;
            }
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8 && (c14349e2 = (C14349e) childAt.getLayoutParams()) != null && c14349e2.f52404a) {
                int i18 = c14349e2.f52405b;
                int i19 = i18 & 7;
                int i24 = i18 & 112;
                boolean z13 = i24 == 48 || i24 == 80;
                if (i19 != 3 && i19 != 5) {
                    z4 = false;
                }
                int i25 = Integer.MIN_VALUE;
                if (z13) {
                    i15 = Integer.MIN_VALUE;
                    i25 = 1073741824;
                } else {
                    i15 = z4 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i26 = ((ViewGroup.LayoutParams) c14349e2).width;
                if (i26 != -2) {
                    if (i26 == -1) {
                        i26 = paddingLeft;
                    }
                    i25 = 1073741824;
                } else {
                    i26 = paddingLeft;
                }
                int i27 = ((ViewGroup.LayoutParams) c14349e2).height;
                if (i27 == -2) {
                    i27 = measuredHeight;
                    i17 = i15;
                } else if (i27 == -1) {
                    i27 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i26, i25), View.MeasureSpec.makeMeasureSpec(i27, i17));
                if (z13) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z4) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i16++;
        }
        this.f7258S = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f7259T = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f7260U = true;
        m5498w();
        this.f7260U = false;
        int childCount2 = getChildCount();
        for (int i28 = 0; i28 < childCount2; i28++) {
            View childAt2 = getChildAt(i28);
            if (childAt2.getVisibility() != 8 && ((c14349e = (C14349e) childAt2.getLayoutParams()) == null || !c14349e.f52404a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c14349e.f52406c), 1073741824), this.f7259T);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i13, Rect rect) {
        int i14;
        int i15;
        int i16;
        C14348d c14348dM5488m;
        int childCount = getChildCount();
        if ((i13 & 2) != 0) {
            i15 = childCount;
            i14 = 0;
            i16 = 1;
        } else {
            i14 = childCount - 1;
            i15 = -1;
            i16 = -1;
        }
        while (i14 != i15) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() == 0 && (c14348dM5488m = m5488m(childAt)) != null && c14348dM5488m.f52400b == this.f7243F && childAt.requestFocus(i13, rect)) {
                return true;
            }
            i14 += i16;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C14354j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C14354j c14354j = (C14354j) parcelable;
        ClassLoader classLoader = c14354j.f52411E;
        super.onRestoreInstanceState(c14354j.m113141b());
        AbstractC14345a abstractC14345a = this.f7241E;
        if (abstractC14345a != null) {
            abstractC14345a.mo4236l(c14354j.f52413z, classLoader);
            m5470E(c14354j.f52412y, false, true);
        } else {
            this.f7245G = c14354j.f52412y;
            this.f7247H = c14354j.f52413z;
            this.f7248I = classLoader;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C14354j c14354j = new C14354j(super.onSaveInstanceState());
        c14354j.f52412y = this.f7243F;
        AbstractC14345a abstractC14345a = this.f7241E;
        if (abstractC14345a != null) {
            c14354j.f52413z = abstractC14345a.mo4237m();
        }
        return c14354j;
    }

    @Override // android.view.View
    public void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        if (i13 != i15) {
            int i17 = this.f7252M;
            m5500y(i13, i15, i17, i17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00e4  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC14345a abstractC14345a;
        if (!this.f7279q0) {
            boolean zM5467B = false;
            if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (abstractC14345a = this.f7241E) == null || abstractC14345a.mo28901d() == 0) {
                return false;
            }
            if (this.f7274l0 == null) {
                this.f7274l0 = VelocityTracker.obtain();
            }
            this.f7274l0.addMovement(motionEvent);
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                this.f7249J.abortAnimation();
                this.f7262W = false;
                m5498w();
                float x3 = motionEvent.getX();
                this.f7271i0 = x3;
                this.f7269g0 = x3;
                float y13 = motionEvent.getY();
                this.f7272j0 = y13;
                this.f7270h0 = y13;
                this.f7273k0 = motionEvent.getPointerId(0);
            } else if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action == 5) {
                            int actionIndex = motionEvent.getActionIndex();
                            this.f7269g0 = motionEvent.getX(actionIndex);
                            this.f7273k0 = motionEvent.getPointerId(actionIndex);
                        } else if (action == 6) {
                            m5493r(motionEvent);
                            this.f7269g0 = motionEvent.getX(motionEvent.findPointerIndex(this.f7273k0));
                        }
                    } else if (this.f7264b0) {
                        m5468C(this.f7243F, 0, true, false);
                        zM5467B = m5467B();
                    }
                } else if (!this.f7264b0) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f7273k0);
                    if (iFindPointerIndex == -1) {
                        zM5467B = m5467B();
                    } else {
                        float x5 = motionEvent.getX(iFindPointerIndex);
                        float fAbs = Math.abs(x5 - this.f7269g0);
                        float y14 = motionEvent.getY(iFindPointerIndex);
                        float fAbs2 = Math.abs(y14 - this.f7270h0);
                        if (fAbs > this.f7268f0 && fAbs > fAbs2) {
                            this.f7264b0 = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            float f13 = this.f7271i0;
                            this.f7269g0 = x5 - f13 > 0.0f ? f13 + this.f7268f0 : f13 - this.f7268f0;
                            this.f7270h0 = y14;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                        if (this.f7264b0) {
                            zM5467B = m5497v(motionEvent.getX(motionEvent.findPointerIndex(this.f7273k0)));
                        }
                    }
                } else if (this.f7264b0) {
                    zM5467B = m5497v(motionEvent.getX(motionEvent.findPointerIndex(this.f7273k0)));
                }
            } else if (this.f7264b0) {
                VelocityTracker velocityTracker = this.f7274l0;
                velocityTracker.computeCurrentVelocity(1000, this.f7276n0);
                int xVelocity = (int) velocityTracker.getXVelocity(this.f7273k0);
                this.f7262W = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                C14348d c14348dM5489n = m5489n();
                float f14 = clientWidth;
                float f15 = this.f7252M / f14;
                int iMax = c14348dM5489n.f52400b;
                float f16 = ((scrollX / f14) - c14348dM5489n.f52403e) / (c14348dM5489n.f52402d + f15);
                if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f7273k0)) - this.f7271i0)) <= this.f7277o0 || Math.abs(xVelocity) <= this.f7275m0) {
                    iMax += (int) (f16 + (iMax >= this.f7243F ? 0.4f : 0.6f));
                } else if (xVelocity <= 0) {
                    iMax++;
                }
                if (this.f7287x.size() > 0) {
                    iMax = Math.max(this.f7287x.get(0).f52400b, Math.min(iMax, ((C14348d) AbstractC25012a.m73371d(this.f7287x, 1)).f52400b));
                }
                m5471F(iMax, true, true, xVelocity);
                zM5467B = m5467B();
            }
            if (zM5467B) {
                WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                postInvalidateOnAnimation();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void m5491p() {
        setWillNotDraw(false);
        setDescendantFocusability(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION);
        setFocusable(true);
        Context context = getContext();
        this.f7249J = new Scroller(context, f7235J0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f13 = context.getResources().getDisplayMetrics().density;
        this.f7268f0 = viewConfiguration.getScaledPagingTouchSlop();
        this.f7275m0 = (int) (400.0f * f13);
        this.f7276n0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f7280r0 = new EdgeEffect(context);
        this.f7281s0 = new EdgeEffect(context);
        this.f7277o0 = (int) (25.0f * f13);
        this.f7278p0 = (int) (2.0f * f13);
        this.f7266d0 = (int) (f13 * 16.0f);
        AbstractC16901p0.m47583n(this, new C1852a(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        AbstractC16877h0.m47517l(this, new C38445a(this));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    /* JADX INFO: renamed from: q */
    public void m5492q(int i13, float f13, int i14) {
        int iMax;
        int width;
        int left;
        if (this.f7286w0 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = getChildAt(i15);
                C14349e c14349e = (C14349e) childAt.getLayoutParams();
                if (c14349e.f52404a) {
                    int i16 = c14349e.f52405b & 7;
                    if (i16 != 1) {
                        if (i16 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i16 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i17 = iMax;
                    width = paddingLeft;
                    paddingLeft = i17;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        InterfaceC14351g interfaceC14351g = this.f7290y0;
        if (interfaceC14351g != null) {
            interfaceC14351g.mo24184a(i13, f13, i14);
        }
        List<InterfaceC14351g> list = this.f7288x0;
        if (list != null) {
            int size = list.size();
            for (int i18 = 0; i18 < size; i18++) {
                InterfaceC14351g interfaceC14351g2 = this.f7288x0.get(i18);
                if (interfaceC14351g2 != null) {
                    interfaceC14351g2.mo24184a(i13, f13, i14);
                }
            }
        }
        InterfaceC14351g interfaceC14351g3 = this.f7292z0;
        if (interfaceC14351g3 != null) {
            interfaceC14351g3.mo24184a(i13, f13, i14);
        }
        if (this.f7238B0 != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i19 = 0; i19 < childCount2; i19++) {
                View childAt2 = getChildAt(i19);
                if (!((C14349e) childAt2.getLayoutParams()).f52404a) {
                    this.f7238B0.mo40974a(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.f7284v0 = true;
    }

    /* JADX INFO: renamed from: r */
    public final void m5493r(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f7273k0) {
            int i13 = actionIndex == 0 ? 1 : 0;
            this.f7269g0 = motionEvent.getX(i13);
            this.f7273k0 = motionEvent.getPointerId(i13);
            VelocityTracker velocityTracker = this.f7274l0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f7260U) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean m5494s() {
        int i13 = this.f7243F;
        if (i13 <= 0) {
            return false;
        }
        m5469D(i13 - 1, true);
        return true;
    }

    public void setAdapter(AbstractC14345a abstractC14345a) {
        AbstractC14345a abstractC14345a2 = this.f7241E;
        if (abstractC14345a2 != null) {
            abstractC14345a2.m40971p(null);
            this.f7241E.mo4239r(this);
            for (int i13 = 0; i13 < this.f7287x.size(); i13++) {
                C14348d c14348d = this.f7287x.get(i13);
                this.f7241E.mo4232a(this, c14348d.f52400b, c14348d.f52399a);
            }
            this.f7241E.mo4233c(this);
            this.f7287x.clear();
            int i14 = 0;
            while (i14 < getChildCount()) {
                if (!((C14349e) getChildAt(i14).getLayoutParams()).f52404a) {
                    removeViewAt(i14);
                    i14--;
                }
                i14++;
            }
            this.f7243F = 0;
            scrollTo(0, 0);
        }
        this.f7241E = abstractC14345a;
        this.f7285w = 0;
        if (abstractC14345a != null) {
            if (this.f7251L == null) {
                this.f7251L = new C14353i(this);
            }
            this.f7241E.m40971p(this.f7251L);
            this.f7262W = false;
            boolean z4 = this.f7282t0;
            this.f7282t0 = true;
            this.f7285w = this.f7241E.mo28901d();
            if (this.f7245G >= 0) {
                this.f7241E.mo4236l(this.f7247H, this.f7248I);
                m5470E(this.f7245G, false, true);
                this.f7245G = -1;
                this.f7247H = null;
                this.f7248I = null;
            } else if (z4) {
                requestLayout();
            } else {
                m5498w();
            }
        }
        List<InterfaceC14350f> list = this.f7237A0;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f7237A0.size();
        for (int i15 = 0; i15 < size; i15++) {
            C28128b c28128b = (C28128b) this.f7237A0.get(i15);
            TabLayout tabLayout = c28128b.f113767b;
            if (tabLayout.f21092r0 == this) {
                tabLayout.m15792l(abstractC14345a, c28128b.f113766a);
            }
        }
    }

    public void setCurrentItem(int i13) {
        this.f7262W = false;
        m5470E(i13, !this.f7282t0, false);
    }

    public void setOffscreenPageLimit(int i13) {
        if (i13 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i13 + " too small; defaulting to 1");
            i13 = 1;
        }
        if (i13 != this.f7263a0) {
            this.f7263a0 = i13;
            m5498w();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC14351g interfaceC14351g) {
        this.f7290y0 = interfaceC14351g;
    }

    public void setPageMargin(int i13) {
        int i14 = this.f7252M;
        this.f7252M = i13;
        int width = getWidth();
        m5500y(width, width, i13, i14);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f7253N = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i13) {
        if (this.f7246G0 == i13) {
            return;
        }
        this.f7246G0 = i13;
        if (this.f7238B0 != null) {
            boolean z4 = i13 != 0;
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                getChildAt(i14).setLayerType(z4 ? this.f7239C0 : 0, null);
            }
        }
        InterfaceC14351g interfaceC14351g = this.f7290y0;
        if (interfaceC14351g != null) {
            interfaceC14351g.mo24185b(i13);
        }
        List<InterfaceC14351g> list = this.f7288x0;
        if (list != null) {
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                InterfaceC14351g interfaceC14351g2 = this.f7288x0.get(i15);
                if (interfaceC14351g2 != null) {
                    interfaceC14351g2.mo24185b(i13);
                }
            }
        }
        InterfaceC14351g interfaceC14351g3 = this.f7292z0;
        if (interfaceC14351g3 != null) {
            interfaceC14351g3.mo24185b(i13);
        }
    }

    /* JADX INFO: renamed from: t */
    public boolean m5495t() {
        AbstractC14345a abstractC14345a = this.f7241E;
        if (abstractC14345a == null || this.f7243F >= abstractC14345a.mo28901d() - 1) {
            return false;
        }
        m5469D(this.f7243F + 1, true);
        return true;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m5496u(int i13) {
        if (this.f7287x.size() == 0) {
            if (this.f7282t0) {
                return false;
            }
            this.f7284v0 = false;
            m5492q(0, 0.0f, 0);
            if (this.f7284v0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C14348d c14348dM5489n = m5489n();
        int clientWidth = getClientWidth();
        int i14 = this.f7252M;
        int i15 = clientWidth + i14;
        float f13 = clientWidth;
        int i16 = c14348dM5489n.f52400b;
        float f14 = ((i13 / f13) - c14348dM5489n.f52403e) / (c14348dM5489n.f52402d + (i14 / f13));
        this.f7284v0 = false;
        m5492q(i16, f14, (int) (i15 * f14));
        if (this.f7284v0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* JADX INFO: renamed from: v */
    public final boolean m5497v(float f13) {
        boolean z4;
        boolean z13;
        float f14 = this.f7269g0 - f13;
        this.f7269g0 = f13;
        float scrollX = getScrollX() + f14;
        float clientWidth = getClientWidth();
        float f15 = this.f7256Q * clientWidth;
        float f16 = this.f7257R * clientWidth;
        boolean z14 = false;
        C14348d c14348d = this.f7287x.get(0);
        C14348d c14348d2 = (C14348d) AbstractC25012a.m73371d(this.f7287x, 1);
        if (c14348d.f52400b != 0) {
            f15 = c14348d.f52403e * clientWidth;
            z4 = false;
        } else {
            z4 = true;
        }
        if (c14348d2.f52400b != this.f7241E.mo28901d() - 1) {
            f16 = c14348d2.f52403e * clientWidth;
            z13 = false;
        } else {
            z13 = true;
        }
        if (scrollX < f15) {
            if (z4) {
                this.f7280r0.onPull(Math.abs(f15 - scrollX) / clientWidth);
                z14 = true;
            }
            scrollX = f15;
        } else if (scrollX > f16) {
            if (z13) {
                this.f7281s0.onPull(Math.abs(scrollX - f16) / clientWidth);
                z14 = true;
            }
            scrollX = f16;
        }
        int i13 = (int) scrollX;
        this.f7269g0 = (scrollX - i13) + this.f7269g0;
        scrollTo(i13, getScrollY());
        m5496u(i13);
        return z14;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f7253N;
    }

    /* JADX INFO: renamed from: w */
    public void m5498w() {
        m5499x(this.f7243F);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00cf A[PHI: r7 r10 r14
      0x00cf: PHI (r7v18 int) = (r7v17 int), (r7v5 int), (r7v21 int) binds: [B:64:0x00f5, B:61:0x00df, B:52:0x00c4] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r10v39 int) = (r10v1 int), (r10v38 int), (r10v42 int) binds: [B:64:0x00f5, B:61:0x00df, B:52:0x00c4] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r14v6 float) = (r14v4 float), (r14v5 float), (r14v3 float) binds: [B:64:0x00f5, B:61:0x00df, B:52:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x015f A[PHI: r3 r12
      0x015f: PHI (r3v41 float) = (r3v39 float), (r3v40 float), (r3v38 float) binds: [B:98:0x018c, B:95:0x0172, B:88:0x0154] A[DONT_GENERATE, DONT_INLINE]
      0x015f: PHI (r12v8 int) = (r12v6 int), (r12v7 int), (r12v5 int) binds: [B:98:0x018c, B:95:0x0172, B:88:0x0154] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: x */
    public void m5499x(int i13) {
        C14348d c14348dM5490o;
        String hexString;
        C14348d c14348dM5476a;
        float f13;
        C14348d c14348dM5488m;
        int i14;
        int i15;
        C14348d c14348d;
        C14348d c14348d2;
        C14348d c14348d3;
        int i16 = this.f7243F;
        if (i16 != i13) {
            c14348dM5490o = m5490o(i16);
            this.f7243F = i13;
        } else {
            c14348dM5490o = null;
        }
        if (this.f7241E == null) {
            m5475J();
            return;
        }
        if (this.f7262W) {
            m5475J();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.f7241E.mo4239r(this);
        int i17 = this.f7263a0;
        int iMax = Math.max(0, this.f7243F - i17);
        int iMo28901d = this.f7241E.mo28901d();
        int iMin = Math.min(iMo28901d - 1, this.f7243F + i17);
        if (iMo28901d != this.f7285w) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            StringBuilder sb4 = new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
            AbstractC30802r.m94773v(sb4, this.f7285w, ", found: ", iMo28901d, " Pager id: ");
            sb4.append(hexString);
            sb4.append(" Pager class: ");
            sb4.append(getClass());
            sb4.append(" Problematic adapter: ");
            sb4.append(this.f7241E.getClass());
            throw new IllegalStateException(sb4.toString());
        }
        int i18 = 0;
        while (true) {
            if (i18 < this.f7287x.size()) {
                c14348dM5476a = this.f7287x.get(i18);
                int i19 = c14348dM5476a.f52400b;
                int i24 = this.f7243F;
                if (i19 >= i24) {
                    if (i19 != i24) {
                        break;
                    } else {
                        break;
                    }
                }
                i18++;
            }
            c14348dM5476a = null;
            break;
        }
        if (c14348dM5476a == null && iMo28901d > 0) {
            c14348dM5476a = m5476a(this.f7243F, i18);
        }
        if (c14348dM5476a != null) {
            int i25 = i18 - 1;
            C14348d c14348d4 = i25 >= 0 ? this.f7287x.get(i25) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - c14348dM5476a.f52402d);
            float f14 = 0.0f;
            for (int i26 = this.f7243F - 1; i26 >= 0; i26--) {
                if (f14 < paddingLeft || i26 >= iMax) {
                    if (c14348d4 == null || i26 != c14348d4.f52400b) {
                        f14 += m5476a(i26, i25 + 1).f52402d;
                        i18++;
                        if (i25 >= 0) {
                            c14348d3 = this.f7287x.get(i25);
                        } else {
                            c14348d3 = null;
                        }
                    } else {
                        f14 += c14348d4.f52402d;
                        i25--;
                        if (i25 >= 0) {
                            c14348d3 = this.f7287x.get(i25);
                        } else {
                            c14348d3 = null;
                        }
                    }
                    c14348d4 = c14348d3;
                } else {
                    if (c14348d4 == null) {
                        break;
                    }
                    if (i26 == c14348d4.f52400b && !c14348d4.f52401c) {
                        this.f7287x.remove(i25);
                        this.f7241E.mo4232a(this, i26, c14348d4.f52399a);
                        i25--;
                        i18--;
                        if (i25 >= 0) {
                            c14348d3 = this.f7287x.get(i25);
                        } else {
                            c14348d3 = null;
                        }
                        c14348d4 = c14348d3;
                    }
                }
            }
            f13 = 0.0f;
            float f15 = c14348dM5476a.f52402d;
            int i27 = i18 + 1;
            if (f15 < 2.0f) {
                C14348d c14348d5 = i27 < this.f7287x.size() ? this.f7287x.get(i27) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i28 = i27;
                for (int i29 = this.f7243F + 1; i29 < iMo28901d; i29++) {
                    if (f15 >= paddingRight && i29 > iMin) {
                        if (c14348d5 == null) {
                            break;
                        }
                        if (i29 == c14348d5.f52400b && !c14348d5.f52401c) {
                            this.f7287x.remove(i28);
                            this.f7241E.mo4232a(this, i29, c14348d5.f52399a);
                            if (i28 < this.f7287x.size()) {
                                c14348d5 = this.f7287x.get(i28);
                            } else {
                                c14348d5 = null;
                            }
                        }
                    } else if (c14348d5 == null || i29 != c14348d5.f52400b) {
                        C14348d c14348dM5476a2 = m5476a(i29, i28);
                        i28++;
                        f15 += c14348dM5476a2.f52402d;
                        if (i28 < this.f7287x.size()) {
                            c14348d5 = this.f7287x.get(i28);
                        } else {
                            c14348d5 = null;
                        }
                    } else {
                        f15 += c14348d5.f52402d;
                        i28++;
                        if (i28 < this.f7287x.size()) {
                            c14348d5 = this.f7287x.get(i28);
                        } else {
                            c14348d5 = null;
                        }
                    }
                }
            }
            int iMo28901d2 = this.f7241E.mo28901d();
            int clientWidth2 = getClientWidth();
            float f16 = clientWidth2 > 0 ? this.f7252M / clientWidth2 : 0.0f;
            if (c14348dM5490o != null) {
                int i34 = c14348dM5490o.f52400b;
                int i35 = c14348dM5476a.f52400b;
                if (i34 < i35) {
                    float fM40967g = c14348dM5490o.f52403e + c14348dM5490o.f52402d + f16;
                    int i36 = i34 + 1;
                    int i37 = 0;
                    while (i36 <= c14348dM5476a.f52400b && i37 < this.f7287x.size()) {
                        C14348d c14348d6 = this.f7287x.get(i37);
                        while (true) {
                            c14348d2 = c14348d6;
                            if (i36 <= c14348d2.f52400b || i37 >= this.f7287x.size() - 1) {
                                break;
                            }
                            i37++;
                            c14348d6 = this.f7287x.get(i37);
                        }
                        while (i36 < c14348d2.f52400b) {
                            fM40967g += this.f7241E.m40967g(i36) + f16;
                            i36++;
                        }
                        c14348d2.f52403e = fM40967g;
                        fM40967g += c14348d2.f52402d + f16;
                        i36++;
                    }
                } else if (i34 > i35) {
                    int size = this.f7287x.size() - 1;
                    float fM40967g2 = c14348dM5490o.f52403e;
                    while (true) {
                        i34--;
                        if (i34 < c14348dM5476a.f52400b || size < 0) {
                            break;
                        }
                        C14348d c14348d7 = this.f7287x.get(size);
                        while (true) {
                            c14348d = c14348d7;
                            if (i34 >= c14348d.f52400b || size <= 0) {
                                break;
                            }
                            size--;
                            c14348d7 = this.f7287x.get(size);
                        }
                        while (i34 > c14348d.f52400b) {
                            fM40967g2 -= this.f7241E.m40967g(i34) + f16;
                            i34--;
                        }
                        fM40967g2 -= c14348d.f52402d + f16;
                        c14348d.f52403e = fM40967g2;
                    }
                }
            }
            int size2 = this.f7287x.size();
            float fM40967g3 = c14348dM5476a.f52403e;
            int i38 = c14348dM5476a.f52400b;
            int i39 = i38 - 1;
            this.f7256Q = i38 == 0 ? fM40967g3 : -3.4028235E38f;
            int i44 = iMo28901d2 - 1;
            this.f7257R = i38 == i44 ? (c14348dM5476a.f52402d + fM40967g3) - 1.0f : Float.MAX_VALUE;
            int i45 = i18 - 1;
            while (i45 >= 0) {
                C14348d c14348d8 = this.f7287x.get(i45);
                while (true) {
                    i15 = c14348d8.f52400b;
                    if (i39 <= i15) {
                        break;
                    }
                    fM40967g3 -= this.f7241E.m40967g(i39) + f16;
                    i39--;
                }
                fM40967g3 -= c14348d8.f52402d + f16;
                c14348d8.f52403e = fM40967g3;
                if (i15 == 0) {
                    this.f7256Q = fM40967g3;
                }
                i45--;
                i39--;
            }
            float fM40967g4 = c14348dM5476a.f52403e + c14348dM5476a.f52402d + f16;
            int i46 = c14348dM5476a.f52400b;
            while (true) {
                i46++;
                if (i27 >= size2) {
                    break;
                }
                C14348d c14348d9 = this.f7287x.get(i27);
                while (true) {
                    i14 = c14348d9.f52400b;
                    if (i46 >= i14) {
                        break;
                    }
                    fM40967g4 += this.f7241E.m40967g(i46) + f16;
                    i46++;
                }
                if (i14 == i44) {
                    this.f7257R = (c14348d9.f52402d + fM40967g4) - 1.0f;
                }
                c14348d9.f52403e = fM40967g4;
                fM40967g4 += c14348d9.f52402d + f16;
                i27++;
            }
            this.f7283u0 = false;
            this.f7241E.mo4238o(this, this.f7243F, c14348dM5476a.f52399a);
        } else {
            f13 = 0.0f;
        }
        this.f7241E.mo4233c(this);
        int childCount = getChildCount();
        for (int i47 = 0; i47 < childCount; i47++) {
            View childAt = getChildAt(i47);
            C14349e c14349e = (C14349e) childAt.getLayoutParams();
            c14349e.f52409f = i47;
            if (!c14349e.f52404a && c14349e.f52406c == f13 && (c14348dM5488m = m5488m(childAt)) != null) {
                c14349e.f52406c = c14348dM5488m.f52402d;
                c14349e.f52408e = c14348dM5488m.f52400b;
            }
        }
        m5475J();
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            C14348d c14348dM5487l = viewFindFocus != null ? m5487l(viewFindFocus) : null;
            if (c14348dM5487l == null || c14348dM5487l.f52400b != this.f7243F) {
                for (int i48 = 0; i48 < getChildCount(); i48++) {
                    View childAt2 = getChildAt(i48);
                    C14348d c14348dM5488m2 = m5488m(childAt2);
                    if (c14348dM5488m2 != null && c14348dM5488m2.f52400b == this.f7243F && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m5500y(int i13, int i14, int i15, int i16) {
        if (i14 > 0 && !this.f7287x.isEmpty()) {
            if (!this.f7249J.isFinished()) {
                this.f7249J.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i14 - getPaddingLeft()) - getPaddingRight()) + i16)) * (((i13 - getPaddingLeft()) - getPaddingRight()) + i15)), getScrollY());
                return;
            }
        }
        C14348d c14348dM5490o = m5490o(this.f7243F);
        int iMin = (int) ((c14348dM5490o != null ? Math.min(c14348dM5490o.f52403e, this.f7257R) : 0.0f) * ((i13 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            m5481f(false);
            scrollTo(iMin, getScrollY());
        }
    }

    /* JADX INFO: renamed from: z */
    public void m5501z(InterfaceC14350f interfaceC14350f) {
        List<InterfaceC14350f> list = this.f7237A0;
        if (list != null) {
            list.remove(interfaceC14350f);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C14349e c14349e = new C14349e(context, attributeSet);
        c14349e.f52406c = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f7233H0);
        c14349e.f52405b = typedArrayObtainStyledAttributes.getInteger(0, 48);
        typedArrayObtainStyledAttributes.recycle();
        return c14349e;
    }

    public void setPageMarginDrawable(int i13) {
        setPageMarginDrawable(AbstractC32122c.getDrawable(getContext(), i13));
    }
}
