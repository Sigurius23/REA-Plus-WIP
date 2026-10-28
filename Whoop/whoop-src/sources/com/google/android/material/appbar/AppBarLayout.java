package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.whoop.android.R;
import cr.AbstractC11075m;
import cr.C11065c;
import io.sentry.config.AbstractC20301a;
import io.sentry.internal.debugmeta.C20378c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kr.C22788g;
import la.C23548b;
import p002a0.C0021f1;
import p006a4.AbstractC0354a;
import p031b9.AbstractC2875y;
import p157fv.C14796b;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p184h5.C16905q1;
import p184h5.InterfaceC16900p;
import p257jq.AbstractC21885a;
import p287kq.AbstractC22766a;
import p311lq.AbstractC24648g;
import p311lq.AbstractC24649h;
import p311lq.AbstractC24652k;
import p311lq.C24643b;
import p311lq.C24645d;
import p311lq.C24646e;
import p311lq.C24651j;
import p413q4.AbstractC29957b;
import p413q4.C29960e;
import p413q4.InterfaceC29956a;
import p435qr.AbstractC30554a;
import p463rj.AbstractC31479j;
import p463rj.AbstractC31484o;
import p479s4.AbstractC32122c;
import p544v5.AbstractC35701b;
import p558vp.AbstractC36259c;
import p715kotlin.jvm.internal.AbstractC22674j;
import q83.AbstractC30060g;
import se.AbstractC32411b;

/* JADX INFO: loaded from: classes6.dex */
public class AppBarLayout extends LinearLayout implements InterfaceC29956a {

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ int f20678c0 = 0;

    /* JADX INFO: renamed from: E */
    public boolean f20679E;

    /* JADX INFO: renamed from: F */
    public int f20680F;

    /* JADX INFO: renamed from: G */
    public C16905q1 f20681G;

    /* JADX INFO: renamed from: H */
    public ArrayList f20682H;

    /* JADX INFO: renamed from: I */
    public boolean f20683I;

    /* JADX INFO: renamed from: J */
    public boolean f20684J;

    /* JADX INFO: renamed from: K */
    public boolean f20685K;

    /* JADX INFO: renamed from: L */
    public boolean f20686L;

    /* JADX INFO: renamed from: M */
    public int f20687M;

    /* JADX INFO: renamed from: N */
    public WeakReference f20688N;

    /* JADX INFO: renamed from: O */
    public final boolean f20689O;

    /* JADX INFO: renamed from: P */
    public ValueAnimator f20690P;

    /* JADX INFO: renamed from: Q */
    public final ValueAnimator.AnimatorUpdateListener f20691Q;

    /* JADX INFO: renamed from: R */
    public final ArrayList f20692R;

    /* JADX INFO: renamed from: S */
    public final long f20693S;

    /* JADX INFO: renamed from: T */
    public final TimeInterpolator f20694T;

    /* JADX INFO: renamed from: U */
    public int[] f20695U;

    /* JADX INFO: renamed from: V */
    public Drawable f20696V;

    /* JADX INFO: renamed from: W */
    public Integer f20697W;

    /* JADX INFO: renamed from: a0 */
    public final float f20698a0;

    /* JADX INFO: renamed from: b0 */
    public Behavior f20699b0;

    /* JADX INFO: renamed from: w */
    public int f20700w;

    /* JADX INFO: renamed from: x */
    public int f20701x;

    /* JADX INFO: renamed from: y */
    public int f20702y;

    /* JADX INFO: renamed from: z */
    public int f20703z;

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends AbstractC24649h {
        public ScrollingViewBehavior() {
        }

        /* JADX INFO: renamed from: L */
        public static AppBarLayout m15672L(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = (View) arrayList.get(i13);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // p413q4.AbstractC29957b
        /* JADX INFO: renamed from: A */
        public final boolean mo15673A(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z4) {
            AppBarLayout appBarLayoutM15672L = m15672L(coordinatorLayout.m3662k(view));
            if (appBarLayoutM15672L != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.f96411c;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayoutM15672L.m15651e(false, !z4, true);
                    return true;
                }
            }
            return false;
        }

        @Override // p413q4.AbstractC29957b
        /* JADX INFO: renamed from: i */
        public final boolean mo15674i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // p413q4.AbstractC29957b
        /* JADX INFO: renamed from: l */
        public boolean mo15675l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            AbstractC29957b abstractC29957b = ((C29960e) view2.getLayoutParams()).f122364a;
            if (abstractC29957b instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) abstractC29957b).f20704j) + this.f96413e) - m72001K(view2);
                WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                view.offsetTopAndBottom(bottom);
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.f20686L) {
                return false;
            }
            appBarLayout.m15652f(appBarLayout.m15653g(view));
            return false;
        }

        @Override // p413q4.AbstractC29957b
        /* JADX INFO: renamed from: m */
        public final void mo15676m(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AbstractC16901p0.m47583n(coordinatorLayout, null);
            }
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC21885a.f84529F);
            this.f96414f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        Integer numValueOf;
        super(AbstractC30554a.m93706a(context, attributeSet, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout), attributeSet, R.attr.appBarLayoutStyle);
        this.f20701x = -1;
        this.f20702y = -1;
        this.f20703z = -1;
        this.f20680F = 0;
        this.f20692R = new ArrayList();
        Context context2 = getContext();
        int i13 = 1;
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayM29873g = AbstractC11075m.m29873g(context3, attributeSet, AbstractC24652k.f96421a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayM29873g.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayM29873g.getResourceId(0, 0)));
            }
            typedArrayM29873g.recycle();
            TypedArray typedArrayM29873g2 = AbstractC11075m.m29873g(context2, attributeSet, AbstractC21885a.f84541a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
            Drawable drawable = typedArrayM29873g2.getDrawable(0);
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            setBackground(drawable);
            final ColorStateList colorStateListM65695C = AbstractC22674j.m65695C(typedArrayM29873g2, context2, 6);
            this.f20689O = colorStateListM65695C != null;
            final ColorStateList colorStateListM976p = AbstractC0354a.m976p(getBackground());
            int i14 = 2;
            if (colorStateListM976p != null) {
                final C22788g c22788g = new C22788g();
                c22788g.m66011m(colorStateListM976p);
                if (colorStateListM65695C != null) {
                    Context context4 = getContext();
                    TypedValue typedValueM56323V = AbstractC20301a.m56323V(context4, R.attr.colorSurface);
                    if (typedValueM56323V != null) {
                        int i15 = typedValueM56323V.resourceId;
                        numValueOf = Integer.valueOf(i15 != 0 ? AbstractC32122c.getColor(context4, i15) : typedValueM56323V.data);
                    } else {
                        numValueOf = null;
                    }
                    final Integer num = numValueOf;
                    this.f20691Q = new ValueAnimator.AnimatorUpdateListener() { // from class: lq.a
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Integer num2;
                            AppBarLayout appBarLayout = this.f96391a;
                            ArrayList arrayList = appBarLayout.f20692R;
                            int iM96972x = AbstractC31484o.m96972x(((Float) valueAnimator.getAnimatedValue()).floatValue(), colorStateListM976p.getDefaultColor(), colorStateListM65695C.getDefaultColor());
                            ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM96972x);
                            C22788g c22788g2 = c22788g;
                            c22788g2.m66011m(colorStateListValueOf);
                            if (appBarLayout.f20696V != null && (num2 = appBarLayout.f20697W) != null && num2.equals(num)) {
                                appBarLayout.f20696V.setTint(iM96972x);
                            }
                            if (arrayList.isEmpty()) {
                                return;
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (it.next() != null) {
                                    throw new ClassCastException();
                                }
                                if (c22788g2.f89748w.f89712c != null) {
                                    throw null;
                                }
                            }
                        }
                    };
                    setBackground(c22788g);
                } else {
                    c22788g.m66009k(context2);
                    this.f20691Q = new C14796b(i14, this, c22788g);
                    setBackground(c22788g);
                }
            }
            this.f20693S = AbstractC36259c.m115697k0(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.f20694T = AbstractC36259c.m115699l0(context2, R.attr.motionEasingStandardInterpolator, AbstractC22766a.f89672a);
            if (typedArrayM29873g2.hasValue(4)) {
                m15651e(typedArrayM29873g2.getBoolean(4, false), false, false);
            }
            if (typedArrayM29873g2.hasValue(3)) {
                AbstractC24652k.m72005a(this, typedArrayM29873g2.getDimensionPixelSize(3, 0));
            }
            if (typedArrayM29873g2.hasValue(2)) {
                setKeyboardNavigationCluster(typedArrayM29873g2.getBoolean(2, false));
            }
            if (typedArrayM29873g2.hasValue(1)) {
                setTouchscreenBlocksFocus(typedArrayM29873g2.getBoolean(1, false));
            }
            this.f20698a0 = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.f20686L = typedArrayM29873g2.getBoolean(5, false);
            this.f20687M = typedArrayM29873g2.getResourceId(7, -1);
            setStatusBarForeground(typedArrayM29873g2.getDrawable(8));
            typedArrayM29873g2.recycle();
            AbstractC16877h0.m47517l(this, new C23548b(this, i13));
        } catch (Throwable th3) {
            typedArrayM29873g.recycle();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C24643b m15647b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            C24643b c24643b = new C24643b((LinearLayout.LayoutParams) layoutParams);
            c24643b.f96396a = 1;
            return c24643b;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C24643b c24643b2 = new C24643b((ViewGroup.MarginLayoutParams) layoutParams);
            c24643b2.f96396a = 1;
            return c24643b2;
        }
        C24643b c24643b3 = new C24643b(layoutParams);
        c24643b3.f96396a = 1;
        return c24643b3;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C24643b generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C24643b c24643b = new C24643b(context, attributeSet);
        c24643b.f96396a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC21885a.f84542b);
        c24643b.f96396a = typedArrayObtainStyledAttributes.getInt(1, 0);
        c24643b.f96397b = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new C20378c(24, (byte) 0);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            c24643b.f96398c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return c24643b;
    }

    /* JADX INFO: renamed from: c */
    public final void m15649c() {
        Behavior behavior = this.f20699b0;
        C5005d c5005dM15666R = (behavior == null || this.f20701x == -1 || this.f20680F != 0) ? null : behavior.m15666R(AbstractC35701b.f151899x, this);
        this.f20701x = -1;
        this.f20702y = -1;
        this.f20703z = -1;
        if (c5005dM15666R != null) {
            Behavior behavior2 = this.f20699b0;
            if (behavior2.f20707m != null) {
                return;
            }
            behavior2.f20707m = c5005dM15666R;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C24643b;
    }

    /* JADX INFO: renamed from: d */
    public final void m15650d(int i13) {
        this.f20700w = i13;
        if (!willNotDraw()) {
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            postInvalidateOnAnimation();
        }
        ArrayList arrayList = this.f20682H;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                C24646e c24646e = (C24646e) this.f20682H.get(i14);
                if (c24646e != null) {
                    CollapsingToolbarLayout collapsingToolbarLayout = c24646e.f96403a;
                    collapsingToolbarLayout.f20729b0 = i13;
                    C11065c c11065c = collapsingToolbarLayout.f20715K;
                    C16905q1 c16905q1 = collapsingToolbarLayout.f20731d0;
                    int iM47600d = c16905q1 != null ? c16905q1.m47600d() : 0;
                    int childCount = collapsingToolbarLayout.getChildCount();
                    for (int i15 = 0; i15 < childCount; i15++) {
                        View childAt = collapsingToolbarLayout.getChildAt(i15);
                        C24645d c24645d = (C24645d) childAt.getLayoutParams();
                        C24651j c24651jM15677b = CollapsingToolbarLayout.m15677b(childAt);
                        int i16 = c24645d.f96401a;
                        if (i16 == 1) {
                            c24651jM15677b.m72004b(AbstractC31479j.m96939r(-i13, 0, ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.m15677b(childAt).f96418b) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((C24645d) childAt.getLayoutParams())).bottomMargin));
                        } else if (i16 == 2) {
                            c24651jM15677b.m72004b(Math.round((-i13) * c24645d.f96402b));
                        }
                    }
                    collapsingToolbarLayout.m15680d();
                    if (collapsingToolbarLayout.f20720P != null && iM47600d > 0) {
                        WeakHashMap weakHashMap2 = AbstractC16901p0.f64851a;
                        collapsingToolbarLayout.postInvalidateOnAnimation();
                    }
                    int height = collapsingToolbarLayout.getHeight();
                    WeakHashMap weakHashMap3 = AbstractC16901p0.f64851a;
                    int minimumHeight = (height - collapsingToolbarLayout.getMinimumHeight()) - iM47600d;
                    float scrimVisibleHeightTrigger = height - collapsingToolbarLayout.getScrimVisibleHeightTrigger();
                    float f13 = minimumHeight;
                    float fMin = Math.min(1.0f, scrimVisibleHeightTrigger / f13);
                    c11065c.f34966d = fMin;
                    c11065c.f34968e = AbstractC2875y.m8288a(1.0f, fMin, 0.5f, fMin);
                    c11065c.f34970f = collapsingToolbarLayout.f20729b0 + minimumHeight;
                    c11065c.m29856p(Math.abs(i13) / f13);
                }
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f20696V == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.f20700w);
        this.f20696V.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f20696V;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m15651e(boolean z4, boolean z13, boolean z14) {
        this.f20680F = (z4 ? 1 : 2) | (z13 ? 4 : 0) | (z14 ? 8 : 0);
        requestLayout();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m15652f(boolean z4) {
        if (this.f20683I || this.f20685K == z4) {
            return false;
        }
        this.f20685K = z4;
        refreshDrawableState();
        if (!(getBackground() instanceof C22788g)) {
            return true;
        }
        if (this.f20689O) {
            m15654h(z4 ? 0.0f : 1.0f, z4 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.f20686L) {
            return true;
        }
        float f13 = this.f20698a0;
        m15654h(z4 ? 0.0f : f13, z4 ? f13 : 0.0f);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m15653g(View view) {
        int i13;
        if (this.f20688N == null && (i13 = this.f20687M) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i13) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f20687M);
            }
            if (viewFindViewById != null) {
                this.f20688N = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.f20688N;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C24643b c24643b = new C24643b(-1, -2);
        c24643b.f96396a = 1;
        return c24643b;
    }

    @Override // p413q4.InterfaceC29956a
    public AbstractC29957b getBehavior() {
        Behavior behavior = new Behavior();
        this.f20699b0 = behavior;
        return behavior;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i13 = this.f20702y;
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                C24643b c24643b = (C24643b) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = c24643b.f96396a;
                if ((i15 & 5) != 5) {
                    if (i14 > 0) {
                        break;
                    }
                } else {
                    int i16 = ((LinearLayout.LayoutParams) c24643b).topMargin + ((LinearLayout.LayoutParams) c24643b).bottomMargin;
                    if ((i15 & 8) != 0) {
                        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                        minimumHeight = childAt.getMinimumHeight();
                    } else {
                        if ((i15 & 2) != 0) {
                            WeakHashMap weakHashMap2 = AbstractC16901p0.f64851a;
                            minimumHeight = measuredHeight - childAt.getMinimumHeight();
                        } else {
                            iMin = i16 + measuredHeight;
                        }
                        if (childCount == 0) {
                            WeakHashMap weakHashMap3 = AbstractC16901p0.f64851a;
                            if (childAt.getFitsSystemWindows()) {
                                iMin = Math.min(iMin, measuredHeight - getTopInset());
                            }
                        }
                        i14 += iMin;
                    }
                    iMin = minimumHeight + i16;
                    if (childCount == 0) {
                        WeakHashMap weakHashMap4 = AbstractC16901p0.f64851a;
                        if (childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                    }
                    i14 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i14);
        this.f20702y = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i13 = this.f20703z;
        if (i13 != -1) {
            return i13;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                C24643b c24643b = (C24643b) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) c24643b).topMargin + ((LinearLayout.LayoutParams) c24643b).bottomMargin + childAt.getMeasuredHeight();
                int i15 = c24643b.f96396a;
                if ((i15 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i15 & 2) != 0) {
                    WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f20703z = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f20687M;
    }

    public C22788g getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof C22788g) {
            return (C22788g) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f20680F;
    }

    public Drawable getStatusBarForeground() {
        return this.f20696V;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        C16905q1 c16905q1 = this.f20681G;
        if (c16905q1 != null) {
            return c16905q1.m47600d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i13 = this.f20701x;
        if (i13 != -1) {
            return i13;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                C24643b c24643b = (C24643b) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = c24643b.f96396a;
                if ((i15 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) c24643b).topMargin + ((LinearLayout.LayoutParams) c24643b).bottomMargin + minimumHeight;
                if (i14 == 0) {
                    WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= getTopInset();
                    }
                }
                minimumHeight = topInset;
                if ((i15 & 2) != 0) {
                    WeakHashMap weakHashMap2 = AbstractC16901p0.f64851a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f20701x = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* JADX INFO: renamed from: h */
    public final void m15654h(float f13, float f14) {
        ValueAnimator valueAnimator = this.f20690P;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f13, f14);
        this.f20690P = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f20693S);
        this.f20690P.setInterpolator(this.f20694T);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f20691Q;
        if (animatorUpdateListener != null) {
            this.f20690P.addUpdateListener(animatorUpdateListener);
        }
        this.f20690P.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C22788g) {
            AbstractC32411b.m101088c0(this, (C22788g) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i13) {
        if (this.f20695U == null) {
            this.f20695U = new int[4];
        }
        int[] iArr = this.f20695U;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i13 + iArr.length);
        boolean z4 = this.f20684J;
        iArr[0] = z4 ? R.attr.state_liftable : -2130970114;
        iArr[1] = (z4 && this.f20685K) ? R.attr.state_lifted : -2130970115;
        iArr[2] = z4 ? R.attr.state_collapsible : -2130970110;
        iArr[3] = (z4 && this.f20685K) ? R.attr.state_collapsed : -2130970109;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.f20688N;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f20688N = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        super.onLayout(z4, i13, i14, i15, i16);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        boolean z13 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    getChildAt(childCount).offsetTopAndBottom(topInset);
                }
            }
        }
        m15649c();
        this.f20679E = false;
        int childCount2 = getChildCount();
        for (int i17 = 0; i17 < childCount2; i17++) {
            if (((C24643b) getChildAt(i17).getLayoutParams()).f96398c != null) {
                this.f20679E = true;
                break;
            }
        }
        Drawable drawable = this.f20696V;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f20683I) {
            return;
        }
        if (!this.f20686L) {
            int childCount3 = getChildCount();
            int i18 = 0;
            while (true) {
                if (i18 >= childCount3) {
                    z13 = false;
                    break;
                }
                int i19 = ((C24643b) getChildAt(i18).getLayoutParams()).f96396a;
                if ((i19 & 1) == 1 && (i19 & 10) != 0) {
                    break;
                } else {
                    i18++;
                }
            }
        }
        if (this.f20684J != z13) {
            this.f20684J = z13;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        int mode = View.MeasureSpec.getMode(i14);
        if (mode != 1073741824) {
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            if (getFitsSystemWindows() && getChildCount() > 0) {
                View childAt = getChildAt(0);
                if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                    int measuredHeight = getMeasuredHeight();
                    if (mode == Integer.MIN_VALUE) {
                        measuredHeight = AbstractC31479j.m96939r(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i14));
                    } else if (mode == 0) {
                        measuredHeight += getTopInset();
                    }
                    setMeasuredDimension(getMeasuredWidth(), measuredHeight);
                }
            }
        }
        m15649c();
    }

    @Override // android.view.View
    public void setElevation(float f13) {
        super.setElevation(f13);
        Drawable background = getBackground();
        if (background instanceof C22788g) {
            ((C22788g) background).m66010l(f13);
        }
    }

    public void setExpanded(boolean z4) {
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        m15651e(z4, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z4) {
        this.f20686L = z4;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f20687M = -1;
        if (view != null) {
            this.f20688N = new WeakReference(view);
            return;
        }
        WeakReference weakReference = this.f20688N;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f20688N = null;
    }

    public void setLiftOnScrollTargetViewId(int i13) {
        this.f20687M = i13;
        WeakReference weakReference = this.f20688N;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f20688N = null;
    }

    public void setLiftableOverrideEnabled(boolean z4) {
        this.f20683I = z4;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i13) {
        if (i13 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i13);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f20696V;
        if (drawable2 != drawable) {
            Integer numValueOf = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f20696V = drawableMutate;
            if (drawableMutate instanceof C22788g) {
                numValueOf = Integer.valueOf(((C22788g) drawableMutate).f89745U);
            } else {
                ColorStateList colorStateListM976p = AbstractC0354a.m976p(drawableMutate);
                if (colorStateListM976p != null) {
                    numValueOf = Integer.valueOf(colorStateListM976p.getDefaultColor());
                }
            }
            this.f20697W = numValueOf;
            Drawable drawable3 = this.f20696V;
            boolean z4 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f20696V.setState(getDrawableState());
                }
                Drawable drawable4 = this.f20696V;
                WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                drawable4.setLayoutDirection(getLayoutDirection());
                this.f20696V.setVisible(getVisibility() == 0, false);
                this.f20696V.setCallback(this);
            }
            if (this.f20696V != null && getTopInset() > 0) {
                z4 = true;
            }
            setWillNotDraw(!z4);
            WeakHashMap weakHashMap2 = AbstractC16901p0.f64851a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i13) {
        setStatusBarForeground(new ColorDrawable(i13));
    }

    public void setStatusBarForegroundResource(int i13) {
        setStatusBarForeground(AbstractC30060g.m92133x(getContext(), i13));
    }

    @Deprecated
    public void setTargetElevation(float f13) {
        AbstractC24652k.m72005a(this, f13);
    }

    @Override // android.view.View
    public void setVisibility(int i13) {
        super.setVisibility(i13);
        boolean z4 = i13 == 0;
        Drawable drawable = this.f20696V;
        if (drawable != null) {
            drawable.setVisible(z4, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f20696V;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m15647b(layoutParams);
    }

    public static class BaseBehavior<T extends AppBarLayout> extends AbstractC24648g {

        /* JADX INFO: renamed from: j */
        public int f20704j;

        /* JADX INFO: renamed from: k */
        public int f20705k;

        /* JADX INFO: renamed from: l */
        public ValueAnimator f20706l;

        /* JADX INFO: renamed from: m */
        public C5005d f20707m;

        /* JADX INFO: renamed from: n */
        public WeakReference f20708n;

        public BaseBehavior() {
            this.f96407f = -1;
            this.f96409h = -1;
        }

        /* JADX INFO: renamed from: N */
        public static View m15655N(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = coordinatorLayout.getChildAt(i13);
                if (((C29960e) childAt.getLayoutParams()).f122364a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: P */
        public static View m15656P(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = coordinatorLayout.getChildAt(i13);
                if ((childAt instanceof InterfaceC16900p) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x005c  */
        /* JADX INFO: renamed from: T */
        public static void m15657T(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i13, int i14, boolean z4) {
            View childAt;
            boolean zM15653g;
            int iAbs = Math.abs(i13);
            int childCount = appBarLayout.getChildCount();
            int i15 = 0;
            while (true) {
                if (i15 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = appBarLayout.getChildAt(i15);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    break;
                } else {
                    i15++;
                }
            }
            if (childAt != null) {
                int i16 = ((C24643b) childAt.getLayoutParams()).f96396a;
                if ((i16 & 1) != 0) {
                    WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                    int minimumHeight = childAt.getMinimumHeight();
                    zM15653g = true;
                    if (i14 <= 0 || (i16 & 12) == 0 ? (i16 & 2) == 0 || (-i13) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset() : (-i13) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        zM15653g = false;
                    }
                } else {
                    zM15653g = false;
                }
            } else {
                zM15653g = false;
            }
            if (appBarLayout.f20686L) {
                zM15653g = appBarLayout.m15653g(m15656P(coordinatorLayout));
            }
            boolean zM15652f = appBarLayout.m15652f(zM15653g);
            if (!z4) {
                if (zM15652f) {
                    List list = (List) ((C0021f1) coordinatorLayout.f5257x.f121228E).get(appBarLayout);
                    ArrayList arrayList = coordinatorLayout.f5259z;
                    arrayList.clear();
                    if (list != null) {
                        arrayList.addAll(list);
                    }
                    int size = arrayList.size();
                    for (int i17 = 0; i17 < size; i17++) {
                        AbstractC29957b abstractC29957b = ((C29960e) ((View) arrayList.get(i17)).getLayoutParams()).f122364a;
                        if (abstractC29957b instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) abstractC29957b).f96414f == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (appBarLayout.getBackground() != null) {
                appBarLayout.getBackground().jumpToCurrentState();
            }
            if (appBarLayout.getForeground() != null) {
                appBarLayout.getForeground().jumpToCurrentState();
            }
            if (appBarLayout.getStateListAnimator() != null) {
                appBarLayout.getStateListAnimator().jumpToCurrentState();
            }
        }

        @Override // p413q4.AbstractC29957b
        /* JADX INFO: renamed from: B */
        public final void mo15658B(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (!(parcelable instanceof C5005d)) {
                super.mo15658B(coordinatorLayout, appBarLayout, parcelable);
                this.f20707m = null;
            } else {
                C5005d c5005d = (C5005d) parcelable;
                this.f20707m = c5005d;
                super.mo15658B(coordinatorLayout, appBarLayout, c5005d.m113141b());
            }
        }

        @Override // p413q4.AbstractC29957b
        /* JADX INFO: renamed from: C */
        public final Parcelable mo15659C(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            Parcelable parcelableMo15659C = super.mo15659C(coordinatorLayout, appBarLayout);
            C5005d c5005dM15666R = m15666R(parcelableMo15659C, appBarLayout);
            return c5005dM15666R == null ? parcelableMo15659C : c5005dM15666R;
        }

        @Override // p413q4.AbstractC29957b
        /* JADX INFO: renamed from: E */
        public final boolean mo15660E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i13, int i14) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z4 = (i13 & 2) != 0 && (appBarLayout.f20686L || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z4 && (valueAnimator = this.f20706l) != null) {
                valueAnimator.cancel();
            }
            this.f20708n = null;
            this.f20705k = i14;
            return z4;
        }

        @Override // p413q4.AbstractC29957b
        /* JADX INFO: renamed from: G */
        public final void mo15661G(CoordinatorLayout coordinatorLayout, View view, View view2, int i13) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f20705k == 0 || i13 == 1) {
                m15667S(coordinatorLayout, appBarLayout);
                if (appBarLayout.f20686L) {
                    appBarLayout.m15652f(appBarLayout.m15653g(view2));
                }
            }
            this.f20708n = new WeakReference(view2);
        }

        @Override // p311lq.AbstractC24648g
        /* JADX INFO: renamed from: K */
        public final int mo15662K() {
            return m72002I() + this.f20704j;
        }

        @Override // p311lq.AbstractC24648g
        /* JADX INFO: renamed from: L */
        public final int mo15663L(CoordinatorLayout coordinatorLayout, View view, int i13, int i14, int i15) {
            int top;
            boolean zM72004b;
            int topInset;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iMo15662K = mo15662K();
            int i16 = 0;
            if (i14 == 0 || iMo15662K < i14 || iMo15662K > i15) {
                this.f20704j = 0;
            } else {
                int iM96939r = AbstractC31479j.m96939r(i13, i14, i15);
                if (iMo15662K != iM96939r) {
                    if (!appBarLayout.f20679E) {
                        top = iM96939r;
                        break;
                    }
                    int iAbs = Math.abs(iM96939r);
                    int childCount = appBarLayout.getChildCount();
                    int i17 = 0;
                    while (true) {
                        if (i17 < childCount) {
                            View childAt = appBarLayout.getChildAt(i17);
                            C24643b c24643b = (C24643b) childAt.getLayoutParams();
                            Interpolator interpolator = c24643b.f96398c;
                            if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                                if (interpolator != null) {
                                    int i18 = c24643b.f96396a;
                                    if ((i18 & 1) != 0) {
                                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) c24643b).topMargin + ((LinearLayout.LayoutParams) c24643b).bottomMargin;
                                        if ((i18 & 2) != 0) {
                                            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                                            topInset -= childAt.getMinimumHeight();
                                        }
                                    } else {
                                        topInset = 0;
                                    }
                                    WeakHashMap weakHashMap2 = AbstractC16901p0.f64851a;
                                    if (childAt.getFitsSystemWindows()) {
                                        topInset -= appBarLayout.getTopInset();
                                    }
                                    if (topInset > 0) {
                                        float f13 = topInset;
                                        top = (childAt.getTop() + Math.round(interpolator.getInterpolation((iAbs - childAt.getTop()) / f13) * f13)) * Integer.signum(iM96939r);
                                        break;
                                    }
                                }
                            } else {
                                i17++;
                            }
                        }
                        top = iM96939r;
                        break;
                    }
                    C24651j c24651j = this.f96415a;
                    if (c24651j != null) {
                        zM72004b = c24651j.m72004b(top);
                    } else {
                        this.f96416b = top;
                        zM72004b = false;
                    }
                    int i19 = iMo15662K - iM96939r;
                    this.f20704j = iM96939r - top;
                    int i24 = 1;
                    if (zM72004b) {
                        int i25 = 0;
                        while (i25 < appBarLayout.getChildCount()) {
                            C24643b c24643b2 = (C24643b) appBarLayout.getChildAt(i25).getLayoutParams();
                            C20378c c20378c = c24643b2.f96397b;
                            if (c20378c != null && (c24643b2.f96396a & i24) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i25);
                                float fM72002I = m72002I();
                                Rect rect = (Rect) c20378c.f76423y;
                                Rect rect2 = (Rect) c20378c.f76422x;
                                childAt2.getDrawingRect(rect2);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect2);
                                rect2.offset(0, -appBarLayout.getTopInset());
                                float fAbs = rect2.top - Math.abs(fM72002I);
                                if (fAbs <= 0.0f) {
                                    float fM96938q = 1.0f - AbstractC31479j.m96938q(Math.abs(fAbs / rect2.height()), 0.0f, 1.0f);
                                    float fHeight = (-fAbs) - ((rect2.height() * 0.3f) * (1.0f - (fM96938q * fM96938q)));
                                    childAt2.setTranslationY(fHeight);
                                    childAt2.getDrawingRect(rect);
                                    rect.offset(0, (int) (-fHeight));
                                    if (fHeight >= rect.height()) {
                                        childAt2.setVisibility(4);
                                    } else {
                                        childAt2.setVisibility(0);
                                    }
                                    WeakHashMap weakHashMap3 = AbstractC16901p0.f64851a;
                                    childAt2.setClipBounds(rect);
                                } else {
                                    WeakHashMap weakHashMap4 = AbstractC16901p0.f64851a;
                                    childAt2.setClipBounds(null);
                                    childAt2.setTranslationY(0.0f);
                                    childAt2.setVisibility(0);
                                }
                            }
                            i25++;
                            i24 = 1;
                        }
                    }
                    if (!zM72004b && appBarLayout.f20679E) {
                        coordinatorLayout.m3660f(appBarLayout);
                    }
                    appBarLayout.m15650d(m72002I());
                    m15657T(coordinatorLayout, appBarLayout, iM96939r, iM96939r < iMo15662K ? -1 : 1, false);
                    i16 = i19;
                }
            }
            if (AbstractC16901p0.m47572c(coordinatorLayout) != null) {
                return i16;
            }
            AbstractC16901p0.m47583n(coordinatorLayout, new C5003b(coordinatorLayout, this, appBarLayout));
            return i16;
        }

        /* JADX INFO: renamed from: O */
        public final void m15664O(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i13) {
            int iAbs = Math.abs(mo15662K() - i13);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iMo15662K = mo15662K();
            if (iMo15662K == i13) {
                ValueAnimator valueAnimator = this.f20706l;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f20706l.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f20706l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f20706l = valueAnimator3;
                valueAnimator3.setInterpolator(AbstractC22766a.f89676e);
                this.f20706l.addUpdateListener(new C5002a(coordinatorLayout, this, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f20706l.setDuration(Math.min(iRound, 600));
            this.f20706l.setIntValues(iMo15662K, i13);
            this.f20706l.start();
        }

        /* JADX WARN: Code duplicated, block: B:9:0x002b  */
        /* JADX INFO: renamed from: Q */
        public final void m15665Q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i13, int[] iArr) {
            AppBarLayout appBarLayout2;
            int i14;
            int downNestedPreScrollRange;
            if (i13 == 0) {
                appBarLayout2 = appBarLayout;
            } else {
                if (i13 < 0) {
                    i14 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i14;
                } else {
                    i14 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i15 = i14;
                int i16 = downNestedPreScrollRange;
                if (i15 != i16) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = mo15663L(coordinatorLayout, appBarLayout2, mo15662K() - i13, i15, i16);
                } else {
                    appBarLayout2 = appBarLayout;
                }
            }
            if (appBarLayout2.f20686L) {
                appBarLayout2.m15652f(appBarLayout2.m15653g(view));
            }
        }

        /* JADX INFO: renamed from: R */
        public final C5005d m15666R(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iM72002I = m72002I();
            int childCount = appBarLayout.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = appBarLayout.getChildAt(i13);
                int bottom = childAt.getBottom() + iM72002I;
                if (childAt.getTop() + iM72002I <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbstractC35701b.f151899x;
                    }
                    C5005d c5005d = new C5005d(parcelable);
                    boolean z4 = iM72002I == 0;
                    c5005d.f20756z = z4;
                    c5005d.f20755y = !z4 && (-iM72002I) >= appBarLayout.getTotalScrollRange();
                    c5005d.f20752E = i13;
                    WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                    c5005d.f20754G = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
                    c5005d.f20753F = bottom / childAt.getHeight();
                    return c5005d;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: S */
        public final void m15667S(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int iMo15662K = mo15662K() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    i13 = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i13);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C24643b c24643b = (C24643b) childAt.getLayoutParams();
                if ((c24643b.f96396a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) c24643b).topMargin;
                    bottom += ((LinearLayout.LayoutParams) c24643b).bottomMargin;
                }
                int i14 = -iMo15662K;
                if (top <= i14 && bottom >= i14) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 >= 0) {
                View childAt2 = appBarLayout.getChildAt(i13);
                C24643b c24643b2 = (C24643b) childAt2.getLayoutParams();
                int i15 = c24643b2.f96396a;
                if ((i15 & 17) == 17) {
                    int topInset = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i13 == 0) {
                        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                        if (appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                            topInset -= appBarLayout.getTopInset();
                        }
                    }
                    if ((i15 & 2) == 2) {
                        WeakHashMap weakHashMap2 = AbstractC16901p0.f64851a;
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if ((i15 & 5) == 5) {
                        WeakHashMap weakHashMap3 = AbstractC16901p0.f64851a;
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iMo15662K < minimumHeight2) {
                            topInset = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((i15 & 32) == 32) {
                        topInset += ((LinearLayout.LayoutParams) c24643b2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) c24643b2).bottomMargin;
                    }
                    if (iMo15662K < (minimumHeight + topInset) / 2) {
                        topInset = minimumHeight;
                    }
                    m15664O(coordinatorLayout, appBarLayout, AbstractC31479j.m96939r(topInset + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        @Override // p311lq.AbstractC24650i, p413q4.AbstractC29957b
        /* JADX INFO: renamed from: p */
        public final boolean mo15668p(CoordinatorLayout coordinatorLayout, View view, int i13) {
            int iRound;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.mo15668p(coordinatorLayout, appBarLayout, i13);
            int pendingAction = appBarLayout.getPendingAction();
            C5005d c5005d = this.f20707m;
            if (c5005d == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z4 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i14 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z4) {
                            m15664O(coordinatorLayout, appBarLayout, i14);
                        } else {
                            m71999M(coordinatorLayout, appBarLayout, i14);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z4) {
                            m15664O(coordinatorLayout, appBarLayout, 0);
                        } else {
                            m71999M(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (c5005d.f20755y) {
                m71999M(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (c5005d.f20756z) {
                m71999M(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(c5005d.f20752E);
                int i15 = -childAt.getBottom();
                if (this.f20707m.f20754G) {
                    WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                    iRound = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i15;
                } else {
                    iRound = Math.round(childAt.getHeight() * this.f20707m.f20753F) + i15;
                }
                m71999M(coordinatorLayout, appBarLayout, iRound);
            }
            appBarLayout.f20680F = 0;
            this.f20707m = null;
            int iM96939r = AbstractC31479j.m96939r(m72002I(), -appBarLayout.getTotalScrollRange(), 0);
            C24651j c24651j = this.f96415a;
            if (c24651j != null) {
                c24651j.m72004b(iM96939r);
            } else {
                this.f96416b = iM96939r;
            }
            m15657T(coordinatorLayout, appBarLayout, m72002I(), 0, true);
            appBarLayout.m15650d(m72002I());
            if (AbstractC16901p0.m47572c(coordinatorLayout) != null) {
                return true;
            }
            AbstractC16901p0.m47583n(coordinatorLayout, new C5003b(coordinatorLayout, this, appBarLayout));
            return true;
        }

        @Override // p413q4.AbstractC29957b
        /* JADX INFO: renamed from: q */
        public final boolean mo15669q(CoordinatorLayout coordinatorLayout, View view, int i13, int i14, int i15, int i16) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((C29960e) appBarLayout.getLayoutParams())).height != -2) {
                return super.mo15669q(coordinatorLayout, appBarLayout, i13, i14, i15, i16);
            }
            coordinatorLayout.m3667r(appBarLayout, i13, i14, View.MeasureSpec.makeMeasureSpec(0, 0), i16);
            return true;
        }

        @Override // p413q4.AbstractC29957b
        /* JADX INFO: renamed from: u */
        public final /* bridge */ /* synthetic */ void mo15670u(CoordinatorLayout coordinatorLayout, View view, View view2, int i13, int i14, int[] iArr, int i15) {
            m15665Q(coordinatorLayout, (AppBarLayout) view, view2, i14, iArr);
        }

        @Override // p413q4.AbstractC29957b
        /* JADX INFO: renamed from: x */
        public final void mo15671x(CoordinatorLayout coordinatorLayout, View view, View view2, int i13, int i14, int i15, int i16, int i17, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i16 < 0) {
                int i18 = -appBarLayout.getDownNestedScrollRange();
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = mo15663L(coordinatorLayout2, appBarLayout, mo15662K() - i16, i18, 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i16 == 0 && AbstractC16901p0.m47572c(coordinatorLayout2) == null) {
                AbstractC16901p0.m47583n(coordinatorLayout2, new C5003b(coordinatorLayout2, this, appBarLayout));
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            this.f96407f = -1;
            this.f96409h = -1;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        C24643b c24643b = new C24643b(-1, -2);
        c24643b.f96396a = 1;
        return c24643b;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m15647b(layoutParams);
    }
}
