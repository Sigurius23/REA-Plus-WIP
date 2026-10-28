package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import ar.C1916d;
import com.whoop.android.R;
import d50.C11708b;
import java.util.WeakHashMap;
import p184h5.AbstractC16871f0;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16878h1;
import p184h5.AbstractC16901p0;
import p184h5.C16869e1;
import p184h5.C16872f1;
import p184h5.C16875g1;
import p184h5.C16899o1;
import p184h5.C16905q1;
import p184h5.C16912t;
import p184h5.InterfaceC16906r;
import p184h5.InterfaceC16909s;
import p314m.C24855n0;
import p408q.C29668l;
import p444r.InterfaceC30829w;
import p444r.MenuC30818l;
import p474s.C31940c;
import p474s.C31960h;
import p474s.C32011t2;
import p474s.InterfaceC31934a1;
import p474s.InterfaceC31936b;
import p474s.InterfaceC31938b1;
import p474s.RunnableC31932a;
import p543v4.C35643b;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC31934a1, InterfaceC16906r, InterfaceC16909s {

    /* JADX INFO: renamed from: f0 */
    public static final int[] f4278f0 = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: g0 */
    public static final C16905q1 f4279g0;

    /* JADX INFO: renamed from: h0 */
    public static final Rect f4280h0;

    /* JADX INFO: renamed from: E */
    public InterfaceC31938b1 f4281E;

    /* JADX INFO: renamed from: F */
    public Drawable f4282F;

    /* JADX INFO: renamed from: G */
    public boolean f4283G;

    /* JADX INFO: renamed from: H */
    public boolean f4284H;

    /* JADX INFO: renamed from: I */
    public boolean f4285I;

    /* JADX INFO: renamed from: J */
    public boolean f4286J;

    /* JADX INFO: renamed from: K */
    public int f4287K;

    /* JADX INFO: renamed from: L */
    public int f4288L;

    /* JADX INFO: renamed from: M */
    public final Rect f4289M;

    /* JADX INFO: renamed from: N */
    public final Rect f4290N;

    /* JADX INFO: renamed from: O */
    public final Rect f4291O;

    /* JADX INFO: renamed from: P */
    public final Rect f4292P;

    /* JADX INFO: renamed from: Q */
    public C16905q1 f4293Q;

    /* JADX INFO: renamed from: R */
    public C16905q1 f4294R;

    /* JADX INFO: renamed from: S */
    public C16905q1 f4295S;

    /* JADX INFO: renamed from: T */
    public C16905q1 f4296T;

    /* JADX INFO: renamed from: U */
    public InterfaceC31936b f4297U;

    /* JADX INFO: renamed from: V */
    public OverScroller f4298V;

    /* JADX INFO: renamed from: W */
    public ViewPropertyAnimator f4299W;

    /* JADX INFO: renamed from: a0 */
    public final C1916d f4300a0;

    /* JADX INFO: renamed from: b0 */
    public final RunnableC31932a f4301b0;

    /* JADX INFO: renamed from: c0 */
    public final RunnableC31932a f4302c0;

    /* JADX INFO: renamed from: d0 */
    public final C16912t f4303d0;

    /* JADX INFO: renamed from: e0 */
    public final C11708b f4304e0;

    /* JADX INFO: renamed from: w */
    public int f4305w;

    /* JADX INFO: renamed from: x */
    public int f4306x;

    /* JADX INFO: renamed from: y */
    public ContentFrameLayout f4307y;

    /* JADX INFO: renamed from: z */
    public ActionBarContainer f4308z;

    static {
        AbstractC16878h1 c16872f1;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 30) {
            c16872f1 = new C16875g1();
        } else {
            c16872f1 = i13 >= 29 ? new C16872f1() : new C16869e1();
        }
        c16872f1.mo47497g(C35643b.m112840b(0, 1, 0, 1));
        f4279g0 = c16872f1.mo47495b();
        f4280h0 = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4306x = 0;
        this.f4289M = new Rect();
        this.f4290N = new Rect();
        this.f4291O = new Rect();
        this.f4292P = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C16905q1 c16905q1 = C16905q1.f64863b;
        this.f4293Q = c16905q1;
        this.f4294R = c16905q1;
        this.f4295S = c16905q1;
        this.f4296T = c16905q1;
        this.f4300a0 = new C1916d(this, 15);
        this.f4301b0 = new RunnableC31932a(this, 0);
        this.f4302c0 = new RunnableC31932a(this, 1);
        m3277l(context);
        this.f4303d0 = new C16912t();
        C11708b c11708b = new C11708b(context, 1);
        c11708b.setWillNotDraw(true);
        this.f4304e0 = c11708b;
        addView(c11708b);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3266a(View view, Rect rect, boolean z4) {
        boolean z13;
        C31940c c31940c = (C31940c) view.getLayoutParams();
        int i13 = ((ViewGroup.MarginLayoutParams) c31940c).leftMargin;
        int i14 = rect.left;
        if (i13 != i14) {
            ((ViewGroup.MarginLayoutParams) c31940c).leftMargin = i14;
            z13 = true;
        } else {
            z13 = false;
        }
        int i15 = ((ViewGroup.MarginLayoutParams) c31940c).topMargin;
        int i16 = rect.top;
        if (i15 != i16) {
            ((ViewGroup.MarginLayoutParams) c31940c).topMargin = i16;
            z13 = true;
        }
        int i17 = ((ViewGroup.MarginLayoutParams) c31940c).rightMargin;
        int i18 = rect.right;
        if (i17 != i18) {
            ((ViewGroup.MarginLayoutParams) c31940c).rightMargin = i18;
            z13 = true;
        }
        if (z4) {
            int i19 = ((ViewGroup.MarginLayoutParams) c31940c).bottomMargin;
            int i24 = rect.bottom;
            if (i19 != i24) {
                ((ViewGroup.MarginLayoutParams) c31940c).bottomMargin = i24;
                return true;
            }
        }
        return z13;
    }

    @Override // p184h5.InterfaceC16906r
    /* JADX INFO: renamed from: b */
    public final void mo3267b(View view, View view2, int i13, int i14) {
        if (i14 == 0) {
            onNestedScrollAccepted(view, view2, i13);
        }
    }

    @Override // p184h5.InterfaceC16906r
    /* JADX INFO: renamed from: c */
    public final void mo3268c(View view, int i13) {
        if (i13 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C31940c;
    }

    @Override // p184h5.InterfaceC16906r
    /* JADX INFO: renamed from: d */
    public final void mo3269d(View view, int i13, int i14, int[] iArr, int i15) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f4282F != null) {
            if (this.f4308z.getVisibility() == 0) {
                translationY = (int) (this.f4308z.getTranslationY() + this.f4308z.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f4282F.setBounds(0, translationY, getWidth(), this.f4282F.getIntrinsicHeight() + translationY);
            this.f4282F.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3270e() {
        m3281p();
        return ((C32011t2) this.f4281E).f132828a.m3311d();
    }

    /* JADX INFO: renamed from: f */
    public final void m3271f() {
        m3281p();
        ((C32011t2) this.f4281E).f132828a.m3313f();
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // p184h5.InterfaceC16909s
    /* JADX INFO: renamed from: g */
    public final void mo3272g(View view, int i13, int i14, int i15, int i16, int i17, int[] iArr) {
        mo3273h(view, i13, i14, i15, i16, i17);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C31940c(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C31940c(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f4308z;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f4303d0.m47604a();
    }

    public CharSequence getTitle() {
        m3281p();
        return ((C32011t2) this.f4281E).f132828a.getTitle();
    }

    @Override // p184h5.InterfaceC16906r
    /* JADX INFO: renamed from: h */
    public final void mo3273h(View view, int i13, int i14, int i15, int i16, int i17) {
        if (i17 == 0) {
            onNestedScroll(view, i13, i14, i15, i16);
        }
    }

    @Override // p184h5.InterfaceC16906r
    /* JADX INFO: renamed from: i */
    public final boolean mo3274i(View view, View view2, int i13, int i14) {
        return i14 == 0 && onStartNestedScroll(view, view2, i13);
    }

    /* JADX INFO: renamed from: j */
    public final void m3275j() {
        removeCallbacks(this.f4301b0);
        removeCallbacks(this.f4302c0);
        ViewPropertyAnimator viewPropertyAnimator = this.f4299W;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m3276k() {
        m3281p();
        return ((C32011t2) this.f4281E).f132828a.m3324s();
    }

    /* JADX INFO: renamed from: l */
    public final void m3277l(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f4278f0);
        this.f4305w = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f4282F = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f4298V = new OverScroller(context);
    }

    /* JADX INFO: renamed from: m */
    public final void m3278m(int i13) {
        m3281p();
        if (i13 == 2) {
            ((C32011t2) this.f4281E).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i13 == 5) {
            ((C32011t2) this.f4281E).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i13 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m3279n() {
        m3281p();
        return ((C32011t2) this.f4281E).f132828a.m3328w();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m3280o() {
        m3281p();
        return ((C32011t2) this.f4281E).f132828a.m3329x();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m3281p();
        C16905q1 c16905q1M47596h = C16905q1.m47596h(this, windowInsets);
        boolean zM3266a = m3266a(this.f4308z, new Rect(c16905q1M47596h.m47598b(), c16905q1M47596h.m47600d(), c16905q1M47596h.m47599c(), c16905q1M47596h.m47597a()), false);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        Rect rect = this.f4289M;
        AbstractC16877h0.m47507b(this, c16905q1M47596h, rect);
        int i13 = rect.left;
        int i14 = rect.top;
        int i15 = rect.right;
        int i16 = rect.bottom;
        C16899o1 c16899o1 = c16905q1M47596h.f64864a;
        C16905q1 c16905q1Mo47533n = c16899o1.mo47533n(i13, i14, i15, i16);
        this.f4293Q = c16905q1Mo47533n;
        boolean z4 = true;
        if (!this.f4294R.equals(c16905q1Mo47533n)) {
            this.f4294R = this.f4293Q;
            zM3266a = true;
        }
        Rect rect2 = this.f4290N;
        if (rect2.equals(rect)) {
            z4 = zM3266a;
        } else {
            rect2.set(rect);
        }
        if (z4) {
            requestLayout();
        }
        return c16899o1.mo47549a().f64864a.mo47543c().f64864a.mo47542b().m47602g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m3277l(getContext());
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16871f0.m47500c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m3275j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                C31940c c31940c = (C31940c) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i18 = ((ViewGroup.MarginLayoutParams) c31940c).leftMargin + paddingLeft;
                int i19 = ((ViewGroup.MarginLayoutParams) c31940c).topMargin + paddingTop;
                childAt.layout(i18, i19, measuredWidth + i18, measuredHeight + i19);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00df  */
    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        int measuredHeight;
        C16905q1 c16905q1;
        int i15;
        AbstractC16878h1 c16869e1;
        m3281p();
        measureChildWithMargins(this.f4308z, i13, 0, i14, 0);
        C31940c c31940c = (C31940c) this.f4308z.getLayoutParams();
        int iMax = Math.max(0, this.f4308z.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c31940c).leftMargin + ((ViewGroup.MarginLayoutParams) c31940c).rightMargin);
        int iMax2 = Math.max(0, this.f4308z.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c31940c).topMargin + ((ViewGroup.MarginLayoutParams) c31940c).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f4308z.getMeasuredState());
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        boolean z4 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z4) {
            measuredHeight = this.f4305w;
            if (this.f4284H && this.f4308z.getTabContainer() != null) {
                measuredHeight += this.f4305w;
            }
        } else {
            measuredHeight = this.f4308z.getVisibility() != 8 ? this.f4308z.getMeasuredHeight() : 0;
        }
        Rect rect = this.f4289M;
        Rect rect2 = this.f4291O;
        rect2.set(rect);
        this.f4295S = this.f4293Q;
        if (this.f4283G || z4) {
            C35643b c35643bM112840b = C35643b.m112840b(this.f4295S.m47598b(), this.f4295S.m47600d() + measuredHeight, this.f4295S.m47599c(), this.f4295S.m47597a());
            c16905q1 = this.f4295S;
            i15 = Build.VERSION.SDK_INT;
            if (i15 >= 30) {
                c16869e1 = new C16875g1(c16905q1);
            } else if (i15 >= 29) {
                c16869e1 = new C16872f1(c16905q1);
            } else {
                c16869e1 = new C16869e1(c16905q1);
            }
            c16869e1.mo47497g(c35643bM112840b);
            this.f4295S = c16869e1.mo47495b();
        } else {
            C11708b c11708b = this.f4304e0;
            C16905q1 c16905q2 = f4279g0;
            Rect rect3 = this.f4292P;
            AbstractC16877h0.m47507b(c11708b, c16905q2, rect3);
            if (rect3.equals(f4280h0)) {
                C35643b c35643bM112840b2 = C35643b.m112840b(this.f4295S.m47598b(), this.f4295S.m47600d() + measuredHeight, this.f4295S.m47599c(), this.f4295S.m47597a());
                c16905q1 = this.f4295S;
                i15 = Build.VERSION.SDK_INT;
                if (i15 >= 30) {
                    c16869e1 = new C16875g1(c16905q1);
                } else if (i15 >= 29) {
                    c16869e1 = new C16872f1(c16905q1);
                } else {
                    c16869e1 = new C16869e1(c16905q1);
                }
                c16869e1.mo47497g(c35643bM112840b2);
                this.f4295S = c16869e1.mo47495b();
            } else {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f4295S = this.f4295S.f64864a.mo47533n(0, measuredHeight, 0, 0);
            }
        }
        m3266a(this.f4307y, rect2, true);
        if (!this.f4296T.equals(this.f4295S)) {
            C16905q1 c16905q3 = this.f4295S;
            this.f4296T = c16905q3;
            AbstractC16901p0.m47571b(this.f4307y, c16905q3);
        }
        measureChildWithMargins(this.f4307y, i13, 0, i14, 0);
        C31940c c31940c2 = (C31940c) this.f4307y.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f4307y.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c31940c2).leftMargin + ((ViewGroup.MarginLayoutParams) c31940c2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f4307y.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c31940c2).topMargin + ((ViewGroup.MarginLayoutParams) c31940c2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f4307y.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i13, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i14, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f13, float f14, boolean z4) {
        if (!this.f4285I || !z4) {
            return false;
        }
        this.f4298V.fling(0, 0, 0, (int) f14, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f4298V.getFinalY() > this.f4308z.getHeight()) {
            m3275j();
            this.f4302c0.run();
        } else {
            m3275j();
            this.f4301b0.run();
        }
        this.f4286J = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f13, float f14) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i13, int i14, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i13, int i14, int i15, int i16) {
        int i17 = this.f4287K + i14;
        this.f4287K = i17;
        setActionBarHideOffset(i17);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i13) {
        C24855n0 c24855n0;
        C29668l c29668l;
        this.f4303d0.f64872a = i13;
        this.f4287K = getActionBarHideOffset();
        m3275j();
        InterfaceC31936b interfaceC31936b = this.f4297U;
        if (interfaceC31936b == null || (c29668l = (c24855n0 = (C24855n0) interfaceC31936b).f97371s) == null) {
            return;
        }
        c29668l.m91142a();
        c24855n0.f97371s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i13) {
        if ((i13 & 2) == 0 || this.f4308z.getVisibility() != 0) {
            return false;
        }
        return this.f4285I;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f4285I || this.f4286J) {
            return;
        }
        if (this.f4287K <= this.f4308z.getHeight()) {
            m3275j();
            postDelayed(this.f4301b0, 600L);
        } else {
            m3275j();
            postDelayed(this.f4302c0, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i13) {
        super.onWindowSystemUiVisibilityChanged(i13);
        m3281p();
        int i14 = this.f4288L ^ i13;
        this.f4288L = i13;
        boolean z4 = (i13 & 4) == 0;
        boolean z13 = (i13 & 256) != 0;
        InterfaceC31936b interfaceC31936b = this.f4297U;
        if (interfaceC31936b != null) {
            C24855n0 c24855n0 = (C24855n0) interfaceC31936b;
            c24855n0.f97367o = !z13;
            if (z4 || !z13) {
                if (c24855n0.f97368p) {
                    c24855n0.f97368p = false;
                    c24855n0.m72874D(true);
                }
            } else if (!c24855n0.f97368p) {
                c24855n0.f97368p = true;
                c24855n0.m72874D(true);
            }
        }
        if ((i14 & 256) == 0 || this.f4297U == null) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16871f0.m47500c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i13) {
        super.onWindowVisibilityChanged(i13);
        this.f4306x = i13;
        InterfaceC31936b interfaceC31936b = this.f4297U;
        if (interfaceC31936b != null) {
            ((C24855n0) interfaceC31936b).f97366n = i13;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m3281p() {
        InterfaceC31938b1 wrapper;
        if (this.f4307y == null) {
            this.f4307y = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f4308z = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC31938b1) {
                wrapper = (InterfaceC31938b1) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f4281E = wrapper;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m3282q(Menu menu, InterfaceC30829w interfaceC30829w) {
        m3281p();
        C32011t2 c32011t2 = (C32011t2) this.f4281E;
        Toolbar toolbar = c32011t2.f132828a;
        if (c32011t2.f132840m == null) {
            c32011t2.f132840m = new C31960h(toolbar.getContext());
        }
        C31960h c31960h = c32011t2.f132840m;
        c31960h.f132682E = interfaceC30829w;
        toolbar.m3301E((MenuC30818l) menu, c31960h);
    }

    /* JADX INFO: renamed from: r */
    public final void m3283r() {
        m3281p();
        ((C32011t2) this.f4281E).f132839l = true;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m3284s() {
        m3281p();
        return ((C32011t2) this.f4281E).f132828a.m3306J();
    }

    public void setActionBarHideOffset(int i13) {
        m3275j();
        this.f4308z.setTranslationY(-Math.max(0, Math.min(i13, this.f4308z.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC31936b interfaceC31936b) {
        this.f4297U = interfaceC31936b;
        if (getWindowToken() != null) {
            ((C24855n0) this.f4297U).f97366n = this.f4306x;
            int i13 = this.f4288L;
            if (i13 != 0) {
                onWindowSystemUiVisibilityChanged(i13);
                WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                AbstractC16871f0.m47500c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z4) {
        this.f4284H = z4;
    }

    public void setHideOnContentScrollEnabled(boolean z4) {
        if (z4 != this.f4285I) {
            this.f4285I = z4;
            if (z4) {
                return;
            }
            m3275j();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i13) {
        m3281p();
        C32011t2 c32011t2 = (C32011t2) this.f4281E;
        c32011t2.f132831d = i13 != 0 ? AbstractC30060g.m92133x(c32011t2.f132828a.getContext(), i13) : null;
        c32011t2.m99565d();
    }

    public void setLogo(int i13) {
        m3281p();
        C32011t2 c32011t2 = (C32011t2) this.f4281E;
        c32011t2.f132832e = i13 != 0 ? AbstractC30060g.m92133x(c32011t2.f132828a.getContext(), i13) : null;
        c32011t2.m99565d();
    }

    public void setOverlayMode(boolean z4) {
        this.f4283G = z4;
    }

    public void setShowingForActionMode(boolean z4) {
    }

    public void setUiOptions(int i13) {
    }

    @Override // p474s.InterfaceC31934a1
    public void setWindowCallback(Window.Callback callback) {
        m3281p();
        ((C32011t2) this.f4281E).f132838k = callback;
    }

    @Override // p474s.InterfaceC31934a1
    public void setWindowTitle(CharSequence charSequence) {
        m3281p();
        C32011t2 c32011t2 = (C32011t2) this.f4281E;
        if (c32011t2.f132834g) {
            return;
        }
        Toolbar toolbar = c32011t2.f132828a;
        c32011t2.f132835h = charSequence;
        if ((c32011t2.f132829b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (c32011t2.f132834g) {
                AbstractC16901p0.m47584o(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C31940c(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m3281p();
        C32011t2 c32011t2 = (C32011t2) this.f4281E;
        c32011t2.f132831d = drawable;
        c32011t2.m99565d();
    }
}
