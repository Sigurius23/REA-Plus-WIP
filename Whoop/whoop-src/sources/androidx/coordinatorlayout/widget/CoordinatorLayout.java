package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import ar.ViewTreeObserverOnPreDrawListenerC1919g;
import com.whoop.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p002a0.C0021f1;
import p026b2.C2298d;
import p167g5.C15487f;
import p184h5.AbstractC16871f0;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p184h5.C16905q1;
import p184h5.C16912t;
import p184h5.InterfaceC16906r;
import p184h5.InterfaceC16909s;
import p393p4.AbstractC28825a;
import p408q.C29662f;
import p413q4.AbstractC29957b;
import p413q4.AbstractC29962g;
import p413q4.C29960e;
import p413q4.C29961f;
import p413q4.InterfaceC29956a;
import p413q4.InterfaceC29958c;
import p413q4.ViewGroupOnHierarchyChangeListenerC29959d;
import p479s4.AbstractC32122c;
import q30.C29934u0;

/* JADX INFO: loaded from: classes5.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC16906r, InterfaceC16909s {

    /* JADX INFO: renamed from: U */
    public static final String f5235U;

    /* JADX INFO: renamed from: V */
    public static final Class[] f5236V;

    /* JADX INFO: renamed from: W */
    public static final ThreadLocal f5237W;

    /* JADX INFO: renamed from: a0 */
    public static final C2298d f5238a0;

    /* JADX INFO: renamed from: b0 */
    public static final C15487f f5239b0;

    /* JADX INFO: renamed from: E */
    public Paint f5240E;

    /* JADX INFO: renamed from: F */
    public final int[] f5241F;

    /* JADX INFO: renamed from: G */
    public final int[] f5242G;

    /* JADX INFO: renamed from: H */
    public boolean f5243H;

    /* JADX INFO: renamed from: I */
    public boolean f5244I;

    /* JADX INFO: renamed from: J */
    public final int[] f5245J;

    /* JADX INFO: renamed from: K */
    public View f5246K;

    /* JADX INFO: renamed from: L */
    public View f5247L;

    /* JADX INFO: renamed from: M */
    public ViewTreeObserverOnPreDrawListenerC1919g f5248M;

    /* JADX INFO: renamed from: N */
    public boolean f5249N;

    /* JADX INFO: renamed from: O */
    public C16905q1 f5250O;

    /* JADX INFO: renamed from: P */
    public boolean f5251P;

    /* JADX INFO: renamed from: Q */
    public Drawable f5252Q;

    /* JADX INFO: renamed from: R */
    public ViewGroup.OnHierarchyChangeListener f5253R;

    /* JADX INFO: renamed from: S */
    public C29934u0 f5254S;

    /* JADX INFO: renamed from: T */
    public final C16912t f5255T;

    /* JADX INFO: renamed from: w */
    public final ArrayList f5256w;

    /* JADX INFO: renamed from: x */
    public final C29662f f5257x;

    /* JADX INFO: renamed from: y */
    public final ArrayList f5258y;

    /* JADX INFO: renamed from: z */
    public final ArrayList f5259z;

    static {
        Package r10 = CoordinatorLayout.class.getPackage();
        f5235U = r10 != null ? r10.getName() : null;
        f5238a0 = new C2298d(26);
        f5236V = new Class[]{Context.class, AttributeSet.class};
        f5237W = new ThreadLocal();
        f5239b0 = new C15487f(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f5256w = new ArrayList();
        this.f5257x = new C29662f(2);
        this.f5258y = new ArrayList();
        this.f5259z = new ArrayList();
        this.f5241F = new int[2];
        this.f5242G = new int[2];
        this.f5255T = new C16912t();
        int[] iArr = AbstractC28825a.f116695a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        } else {
            coordinatorLayout = this;
            context2 = context;
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            coordinatorLayout.f5245J = intArray;
            float f13 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i13 = 0; i13 < length; i13++) {
                int[] iArr2 = coordinatorLayout.f5245J;
                iArr2[i13] = (int) (iArr2[i13] * f13);
            }
        }
        coordinatorLayout.f5252Q = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        m3671y();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC29959d(this));
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Rect m3653a() {
        Rect rect = (Rect) f5239b0.mo43684b();
        return rect == null ? new Rect() : rect;
    }

    /* JADX INFO: renamed from: l */
    public static void m3654l(int i13, Rect rect, Rect rect2, C29960e c29960e, int i14, int i15) {
        int iWidth;
        int iHeight;
        int i16 = c29960e.f122366c;
        if (i16 == 0) {
            i16 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i16, i13);
        int i17 = c29960e.f122367d;
        if ((i17 & 7) == 0) {
            i17 |= 8388611;
        }
        if ((i17 & 112) == 0) {
            i17 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i17, i13);
        int i18 = absoluteGravity & 7;
        int i19 = absoluteGravity & 112;
        int i24 = absoluteGravity2 & 7;
        int i25 = absoluteGravity2 & 112;
        if (i24 != 1) {
            iWidth = i24 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i25 != 16) {
            iHeight = i25 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i18 == 1) {
            iWidth -= i14 / 2;
        } else if (i18 != 5) {
            iWidth -= i14;
        }
        if (i19 == 16) {
            iHeight -= i15 / 2;
        } else if (i19 != 80) {
            iHeight -= i15;
        }
        rect2.set(iWidth, iHeight, i14 + iWidth, i15 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static C29960e m3655n(View view) {
        C29960e c29960e = (C29960e) view.getLayoutParams();
        if (!c29960e.f122365b) {
            if (view instanceof InterfaceC29956a) {
                AbstractC29957b behavior = ((InterfaceC29956a) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                c29960e.m91654b(behavior);
                c29960e.f122365b = true;
                return c29960e;
            }
            InterfaceC29958c interfaceC29958c = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                interfaceC29958c = (InterfaceC29958c) superclass.getAnnotation(InterfaceC29958c.class);
                if (interfaceC29958c != null) {
                    break;
                }
            }
            if (interfaceC29958c != null) {
                try {
                    c29960e.m91654b((AbstractC29957b) interfaceC29958c.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e5) {
                    Log.e("CoordinatorLayout", "Default behavior class " + interfaceC29958c.value().getName() + " could not be instantiated. Did you forget a default constructor?", e5);
                }
            }
            c29960e.f122365b = true;
        }
        return c29960e;
    }

    /* JADX INFO: renamed from: u */
    public static void m3656u(Rect rect) {
        rect.setEmpty();
        f5239b0.mo43683a(rect);
    }

    /* JADX INFO: renamed from: w */
    public static void m3657w(View view, int i13) {
        C29960e c29960e = (C29960e) view.getLayoutParams();
        int i14 = c29960e.f122372i;
        if (i14 != i13) {
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            view.offsetLeftAndRight(i13 - i14);
            c29960e.f122372i = i13;
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m3658x(View view, int i13) {
        C29960e c29960e = (C29960e) view.getLayoutParams();
        int i14 = c29960e.f122373j;
        if (i14 != i13) {
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            view.offsetTopAndBottom(i13 - i14);
            c29960e.f122373j = i13;
        }
    }

    @Override // p184h5.InterfaceC16906r
    /* JADX INFO: renamed from: b */
    public final void mo3267b(View view, View view2, int i13, int i14) {
        AbstractC29957b abstractC29957b;
        View view3;
        View view4;
        int i15;
        int i16;
        this.f5255T.m47605b(i13, i14);
        this.f5247L = view2;
        int childCount = getChildCount();
        int i17 = 0;
        while (i17 < childCount) {
            View childAt = getChildAt(i17);
            C29960e c29960e = (C29960e) childAt.getLayoutParams();
            if (c29960e.m91653a(i14) && (abstractC29957b = c29960e.f122364a) != null) {
                view3 = view;
                view4 = view2;
                i15 = i13;
                i16 = i14;
                abstractC29957b.m91652z(this, childAt, view3, view4, i15, i16);
            } else {
                view3 = view;
                view4 = view2;
                i15 = i13;
                i16 = i14;
            }
            i17++;
            view = view3;
            view2 = view4;
            i13 = i15;
            i14 = i16;
        }
    }

    @Override // p184h5.InterfaceC16906r
    /* JADX INFO: renamed from: c */
    public final void mo3268c(View view, int i13) {
        this.f5255T.m47606c(i13);
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            C29960e c29960e = (C29960e) childAt.getLayoutParams();
            if (c29960e.m91653a(i13)) {
                AbstractC29957b abstractC29957b = c29960e.f122364a;
                if (abstractC29957b != null) {
                    abstractC29957b.mo15661G(this, childAt, view, i13);
                }
                if (i13 == 0) {
                    c29960e.f122377n = false;
                } else if (i13 == 1) {
                    c29960e.f122378o = false;
                }
                c29960e.f122379p = false;
            }
        }
        this.f5247L = null;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C29960e) && super.checkLayoutParams(layoutParams);
    }

    @Override // p184h5.InterfaceC16906r
    /* JADX INFO: renamed from: d */
    public final void mo3269d(View view, int i13, int i14, int[] iArr, int i15) {
        AbstractC29957b abstractC29957b;
        int childCount = getChildCount();
        boolean z4 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                C29960e c29960e = (C29960e) childAt.getLayoutParams();
                if (c29960e.m91653a(i15) && (abstractC29957b = c29960e.f122364a) != null) {
                    int[] iArr2 = this.f5241F;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC29957b.mo15670u(this, childAt, view, i13, i14, iArr2, i15);
                    iMax = i13 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i14 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z4 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z4) {
            m3665p(1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0091  */
    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j7) {
        C29960e c29960e = (C29960e) view.getLayoutParams();
        AbstractC29957b abstractC29957b = c29960e.f122364a;
        if (abstractC29957b != null) {
            float fM91645h = abstractC29957b.m91645h(this, view);
            if (fM91645h > 0.0f) {
                if (this.f5240E == null) {
                    this.f5240E = new Paint();
                }
                this.f5240E.setColor(c29960e.f122364a.m91644g(this, view));
                Paint paint = this.f5240E;
                int iRound = Math.round(fM91645h * 255.0f);
                if (iRound < 0) {
                    iRound = 0;
                } else if (iRound > 255) {
                    iRound = 255;
                }
                paint.setAlpha(iRound);
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f5240E);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f5252Q;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m3659e(C29960e c29960e, Rect rect, int i13, int i14) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c29960e).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i13) - ((ViewGroup.MarginLayoutParams) c29960e).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c29960e).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i14) - ((ViewGroup.MarginLayoutParams) c29960e).bottomMargin));
        rect.set(iMax, iMax2, i13 + iMax, i14 + iMax2);
    }

    /* JADX INFO: renamed from: f */
    public final void m3660f(View view) {
        List list = (List) ((C0021f1) this.f5257x.f121228E).get(view);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            View view2 = (View) list.get(i13);
            AbstractC29957b abstractC29957b = ((C29960e) view2.getLayoutParams()).f122364a;
            if (abstractC29957b != null) {
                abstractC29957b.mo15675l(this, view2, view);
            }
        }
    }

    @Override // p184h5.InterfaceC16909s
    /* JADX INFO: renamed from: g */
    public final void mo3272g(View view, int i13, int i14, int i15, int i16, int i17, int[] iArr) {
        AbstractC29957b abstractC29957b;
        int childCount = getChildCount();
        boolean z4 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                C29960e c29960e = (C29960e) childAt.getLayoutParams();
                if (c29960e.m91653a(i17) && (abstractC29957b = c29960e.f122364a) != null) {
                    int[] iArr2 = this.f5241F;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC29957b.mo15671x(this, childAt, view, i13, i14, i15, i16, i17, iArr2);
                    int[] iArr3 = this.f5241F;
                    iMax = i15 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    iMax2 = i16 > 0 ? Math.max(iMax2, iArr3[1]) : Math.min(iMax2, iArr3[1]);
                    z4 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z4) {
            m3665p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C29960e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C29960e(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        m3669t();
        return Collections.unmodifiableList(this.f5256w);
    }

    public final C16905q1 getLastWindowInsets() {
        return this.f5250O;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f5255T.m47604a();
    }

    public Drawable getStatusBarBackground() {
        return this.f5252Q;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // p184h5.InterfaceC16906r
    /* JADX INFO: renamed from: h */
    public final void mo3273h(View view, int i13, int i14, int i15, int i16, int i17) {
        mo3272g(view, i13, i14, i15, i16, 0, this.f5242G);
    }

    @Override // p184h5.InterfaceC16906r
    /* JADX INFO: renamed from: i */
    public final boolean mo3274i(View view, View view2, int i13, int i14) {
        int childCount = getChildCount();
        boolean z4 = false;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                C29960e c29960e = (C29960e) childAt.getLayoutParams();
                AbstractC29957b abstractC29957b = c29960e.f122364a;
                if (abstractC29957b != null) {
                    boolean zMo15660E = abstractC29957b.mo15660E(this, childAt, view, view2, i13, i14);
                    z4 |= zMo15660E;
                    if (i14 == 0) {
                        c29960e.f122377n = zMo15660E;
                    } else if (i14 == 1) {
                        c29960e.f122378o = zMo15660E;
                    }
                } else if (i14 == 0) {
                    c29960e.f122377n = false;
                } else if (i14 == 1) {
                    c29960e.f122378o = false;
                }
            }
        }
        return z4;
    }

    /* JADX INFO: renamed from: j */
    public final void m3661j(View view, Rect rect, boolean z4) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z4) {
            AbstractC29962g.m91655a(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: k */
    public final ArrayList m3662k(View view) {
        C0021f1 c0021f1 = (C0021f1) this.f5257x.f121228E;
        int i13 = c0021f1.f50y;
        ArrayList arrayList = null;
        for (int i14 = 0; i14 < i13; i14++) {
            ArrayList arrayList2 = (ArrayList) c0021f1.m42k(i14);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c0021f1.m38g(i14));
            }
        }
        ArrayList arrayList3 = this.f5259z;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: m */
    public final int m3663m(int i13) {
        int[] iArr = this.f5245J;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i13);
            return 0;
        }
        if (i13 >= 0 && i13 < iArr.length) {
            return iArr[i13];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i13 + " out of range for " + this);
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m3664o(View view, int i13, int i14) {
        Rect rectM3653a = m3653a();
        AbstractC29962g.m91655a(this, view, rectM3653a);
        try {
            return rectM3653a.contains(i13, i14);
        } finally {
            m3656u(rectM3653a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m3670v(false);
        int i13 = 1;
        if (this.f5249N) {
            if (this.f5248M == null) {
                this.f5248M = new ViewTreeObserverOnPreDrawListenerC1919g(this, i13);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f5248M);
        }
        if (this.f5250O == null) {
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            if (getFitsSystemWindows()) {
                AbstractC16871f0.m47500c(this);
            }
        }
        this.f5244I = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m3670v(false);
        if (this.f5249N && this.f5248M != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f5248M);
        }
        View view = this.f5247L;
        if (view != null) {
            mo3268c(view, 0);
        }
        this.f5244I = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f5251P || this.f5252Q == null) {
            return;
        }
        C16905q1 c16905q1 = this.f5250O;
        int iM47600d = c16905q1 != null ? c16905q1.m47600d() : 0;
        if (iM47600d > 0) {
            this.f5252Q.setBounds(0, 0, getWidth(), iM47600d);
            this.f5252Q.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m3670v(true);
        }
        boolean zM3668s = m3668s(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zM3668s;
        }
        m3670v(true);
        return zM3668s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        AbstractC29957b abstractC29957b;
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f5256w;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            View view = (View) arrayList.get(i17);
            if (view.getVisibility() != 8 && ((abstractC29957b = ((C29960e) view.getLayoutParams()).f122364a) == null || !abstractC29957b.mo15668p(this, view, layoutDirection))) {
                m3666q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x012f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0160  */
    /* JADX WARN: Code duplicated, block: B:76:0x016a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0192  */
    /* JADX WARN: Code duplicated, block: B:80:0x0195  */
    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        int i15;
        boolean z4;
        int i16;
        int i17;
        int i18;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        AbstractC29957b abstractC29957b;
        int i19;
        int i24;
        ArrayList arrayList;
        int i25;
        int i26;
        boolean z13;
        int i27;
        int i28;
        View view;
        int i29;
        int i34;
        boolean zMo15669q;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.m3669t();
        int childCount = coordinatorLayout.getChildCount();
        int i35 = 0;
        loop0: while (true) {
            i15 = 1;
            if (i35 >= childCount) {
                z4 = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i35);
            C0021f1 c0021f1 = (C0021f1) coordinatorLayout.f5257x.f121228E;
            int i36 = c0021f1.f50y;
            for (int i37 = 0; i37 < i36; i37++) {
                ArrayList arrayList2 = (ArrayList) c0021f1.m42k(i37);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z4 = true;
                    break loop0;
                }
            }
            i35++;
        }
        if (z4 != coordinatorLayout.f5249N) {
            if (z4) {
                if (coordinatorLayout.f5244I) {
                    if (coordinatorLayout.f5248M == null) {
                        coordinatorLayout.f5248M = new ViewTreeObserverOnPreDrawListenerC1919g(coordinatorLayout, i15);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.f5248M);
                }
                coordinatorLayout.f5249N = true;
            } else {
                if (coordinatorLayout.f5244I && coordinatorLayout.f5248M != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.f5248M);
                }
                coordinatorLayout.f5249N = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z14 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i13);
        int size = View.MeasureSpec.getSize(i13);
        int mode2 = View.MeasureSpec.getMode(i14);
        int size2 = View.MeasureSpec.getSize(i14);
        int i38 = paddingLeft + paddingRight;
        int i39 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z15 = coordinatorLayout.f5250O != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.f5256w;
        int size3 = arrayList3.size();
        int i44 = 0;
        int iCombineMeasuredStates = 0;
        while (i44 < size3) {
            View view2 = (View) arrayList3.get(i44);
            int i45 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i17 = size3;
                i29 = i44;
                i25 = paddingLeft;
                i19 = layoutDirection;
                suggestedMinimumWidth = i45;
                z13 = false;
                i28 = paddingRight;
            } else {
                C29960e c29960e = (C29960e) view2.getLayoutParams();
                int i46 = c29960e.f122368e;
                if (i46 < 0 || mode == 0) {
                    i16 = suggestedMinimumHeight;
                } else {
                    int iM3663m = coordinatorLayout.m3663m(i46);
                    int i47 = c29960e.f122366c;
                    if (i47 == 0) {
                        i47 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i47, layoutDirection) & 7;
                    i16 = suggestedMinimumHeight;
                    if ((absoluteGravity != 3 || z14) && !(absoluteGravity == 5 && z14)) {
                        if ((absoluteGravity == 5 && !z14) || (absoluteGravity == 3 && z14)) {
                            iMax = Math.max(0, iM3663m - paddingLeft);
                        }
                        if (z15 || view2.getFitsSystemWindows()) {
                            iMakeMeasureSpec = i13;
                            iMakeMeasureSpec2 = i14;
                        } else {
                            int iM47599c = coordinatorLayout.f5250O.m47599c() + coordinatorLayout.f5250O.m47598b();
                            int iM47597a = coordinatorLayout.f5250O.m47597a() + coordinatorLayout.f5250O.m47600d();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iM47599c, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iM47597a, mode2);
                        }
                        abstractC29957b = c29960e.f122364a;
                        if (abstractC29957b != null) {
                            int i48 = i16;
                            i19 = layoutDirection;
                            i24 = i48;
                            z13 = false;
                            i25 = paddingLeft;
                            i26 = i45;
                            i28 = paddingRight;
                            i34 = iCombineMeasuredStates;
                            arrayList = arrayList3;
                            int i49 = iMakeMeasureSpec;
                            i29 = i44;
                            int i54 = iMakeMeasureSpec2;
                            zMo15669q = abstractC29957b.mo15669q(this, view2, i49, i18, i54, 0);
                            view = view2;
                            iMakeMeasureSpec = i49;
                            i27 = i54;
                            if (zMo15669q) {
                                coordinatorLayout = this;
                            }
                            int iMax2 = Math.max(i26, view.getMeasuredWidth() + i38 + ((ViewGroup.MarginLayoutParams) c29960e).leftMargin + ((ViewGroup.MarginLayoutParams) c29960e).rightMargin);
                            int iMax3 = Math.max(i24, view.getMeasuredHeight() + i39 + ((ViewGroup.MarginLayoutParams) c29960e).topMargin + ((ViewGroup.MarginLayoutParams) c29960e).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(i34, view.getMeasuredState());
                            suggestedMinimumWidth = iMax2;
                            suggestedMinimumHeight = iMax3;
                        } else {
                            int i55 = i16;
                            i19 = layoutDirection;
                            i24 = i55;
                            arrayList = arrayList3;
                            i25 = paddingLeft;
                            i26 = i45;
                            z13 = false;
                            i27 = iMakeMeasureSpec2;
                            i28 = paddingRight;
                            view = view2;
                            i29 = i44;
                            i34 = iCombineMeasuredStates;
                        }
                        coordinatorLayout = this;
                        coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i18, i27, 0);
                        int iMax4 = Math.max(i26, view.getMeasuredWidth() + i38 + ((ViewGroup.MarginLayoutParams) c29960e).leftMargin + ((ViewGroup.MarginLayoutParams) c29960e).rightMargin);
                        int iMax5 = Math.max(i24, view.getMeasuredHeight() + i39 + ((ViewGroup.MarginLayoutParams) c29960e).topMargin + ((ViewGroup.MarginLayoutParams) c29960e).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i34, view.getMeasuredState());
                        suggestedMinimumWidth = iMax4;
                        suggestedMinimumHeight = iMax5;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iM3663m);
                    }
                    int i56 = size3;
                    i18 = iMax;
                    i17 = i56;
                    if (z15) {
                        iMakeMeasureSpec = i13;
                        iMakeMeasureSpec2 = i14;
                    } else {
                        iMakeMeasureSpec = i13;
                        iMakeMeasureSpec2 = i14;
                    }
                    abstractC29957b = c29960e.f122364a;
                    if (abstractC29957b != null) {
                        int i410 = i16;
                        i19 = layoutDirection;
                        i24 = i410;
                        z13 = false;
                        i25 = paddingLeft;
                        i26 = i45;
                        i28 = paddingRight;
                        i34 = iCombineMeasuredStates;
                        arrayList = arrayList3;
                        int i411 = iMakeMeasureSpec;
                        i29 = i44;
                        int i57 = iMakeMeasureSpec2;
                        zMo15669q = abstractC29957b.mo15669q(this, view2, i411, i18, i57, 0);
                        view = view2;
                        iMakeMeasureSpec = i411;
                        i27 = i57;
                        if (zMo15669q) {
                            coordinatorLayout = this;
                        }
                        int iMax6 = Math.max(i26, view.getMeasuredWidth() + i38 + ((ViewGroup.MarginLayoutParams) c29960e).leftMargin + ((ViewGroup.MarginLayoutParams) c29960e).rightMargin);
                        int iMax7 = Math.max(i24, view.getMeasuredHeight() + i39 + ((ViewGroup.MarginLayoutParams) c29960e).topMargin + ((ViewGroup.MarginLayoutParams) c29960e).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i34, view.getMeasuredState());
                        suggestedMinimumWidth = iMax6;
                        suggestedMinimumHeight = iMax7;
                    } else {
                        int i58 = i16;
                        i19 = layoutDirection;
                        i24 = i58;
                        arrayList = arrayList3;
                        i25 = paddingLeft;
                        i26 = i45;
                        z13 = false;
                        i27 = iMakeMeasureSpec2;
                        i28 = paddingRight;
                        view = view2;
                        i29 = i44;
                        i34 = iCombineMeasuredStates;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i18, i27, 0);
                    int iMax8 = Math.max(i26, view.getMeasuredWidth() + i38 + ((ViewGroup.MarginLayoutParams) c29960e).leftMargin + ((ViewGroup.MarginLayoutParams) c29960e).rightMargin);
                    int iMax9 = Math.max(i24, view.getMeasuredHeight() + i39 + ((ViewGroup.MarginLayoutParams) c29960e).topMargin + ((ViewGroup.MarginLayoutParams) c29960e).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i34, view.getMeasuredState());
                    suggestedMinimumWidth = iMax8;
                    suggestedMinimumHeight = iMax9;
                }
                i17 = size3;
                i18 = 0;
                if (z15) {
                    iMakeMeasureSpec = i13;
                    iMakeMeasureSpec2 = i14;
                } else {
                    iMakeMeasureSpec = i13;
                    iMakeMeasureSpec2 = i14;
                }
                abstractC29957b = c29960e.f122364a;
                if (abstractC29957b != null) {
                    int i412 = i16;
                    i19 = layoutDirection;
                    i24 = i412;
                    z13 = false;
                    i25 = paddingLeft;
                    i26 = i45;
                    i28 = paddingRight;
                    i34 = iCombineMeasuredStates;
                    arrayList = arrayList3;
                    int i413 = iMakeMeasureSpec;
                    i29 = i44;
                    int i59 = iMakeMeasureSpec2;
                    zMo15669q = abstractC29957b.mo15669q(this, view2, i413, i18, i59, 0);
                    view = view2;
                    iMakeMeasureSpec = i413;
                    i27 = i59;
                    if (zMo15669q) {
                        coordinatorLayout = this;
                    }
                    int iMax10 = Math.max(i26, view.getMeasuredWidth() + i38 + ((ViewGroup.MarginLayoutParams) c29960e).leftMargin + ((ViewGroup.MarginLayoutParams) c29960e).rightMargin);
                    int iMax11 = Math.max(i24, view.getMeasuredHeight() + i39 + ((ViewGroup.MarginLayoutParams) c29960e).topMargin + ((ViewGroup.MarginLayoutParams) c29960e).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i34, view.getMeasuredState());
                    suggestedMinimumWidth = iMax10;
                    suggestedMinimumHeight = iMax11;
                } else {
                    int i510 = i16;
                    i19 = layoutDirection;
                    i24 = i510;
                    arrayList = arrayList3;
                    i25 = paddingLeft;
                    i26 = i45;
                    z13 = false;
                    i27 = iMakeMeasureSpec2;
                    i28 = paddingRight;
                    view = view2;
                    i29 = i44;
                    i34 = iCombineMeasuredStates;
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i18, i27, 0);
                int iMax12 = Math.max(i26, view.getMeasuredWidth() + i38 + ((ViewGroup.MarginLayoutParams) c29960e).leftMargin + ((ViewGroup.MarginLayoutParams) c29960e).rightMargin);
                int iMax13 = Math.max(i24, view.getMeasuredHeight() + i39 + ((ViewGroup.MarginLayoutParams) c29960e).topMargin + ((ViewGroup.MarginLayoutParams) c29960e).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(i34, view.getMeasuredState());
                suggestedMinimumWidth = iMax12;
                suggestedMinimumHeight = iMax13;
            }
            i44 = i29 + 1;
            paddingLeft = i25;
            paddingRight = i28;
            size3 = i17;
            layoutDirection = i19;
            arrayList3 = arrayList;
        }
        int i64 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i13, (-16777216) & i64), View.resolveSizeAndState(suggestedMinimumHeight, i14, i64 << 16));
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f13, float f14, boolean z4) {
        AbstractC29957b abstractC29957b;
        View view2;
        float f15;
        float f16;
        boolean z13;
        int childCount = getChildCount();
        int i13 = 0;
        boolean zM91647r = false;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() == 8) {
                view2 = view;
                f15 = f13;
                f16 = f14;
                z13 = z4;
            } else {
                C29960e c29960e = (C29960e) childAt.getLayoutParams();
                if (c29960e.m91653a(0) && (abstractC29957b = c29960e.f122364a) != null) {
                    view2 = view;
                    f15 = f13;
                    f16 = f14;
                    z13 = z4;
                    zM91647r |= abstractC29957b.m91647r(this, childAt, view2, f15, f16, z13);
                } else {
                    view2 = view;
                    f15 = f13;
                    f16 = f14;
                    z13 = z4;
                }
            }
            i13++;
            view = view2;
            f13 = f15;
            f14 = f16;
            z4 = z13;
        }
        if (zM91647r) {
            m3665p(1);
        }
        return zM91647r;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f13, float f14) {
        AbstractC29957b abstractC29957b;
        View view2;
        float f15;
        float f16;
        int childCount = getChildCount();
        int i13 = 0;
        boolean zMo15715s = false;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() == 8) {
                view2 = view;
                f15 = f13;
                f16 = f14;
            } else {
                C29960e c29960e = (C29960e) childAt.getLayoutParams();
                if (c29960e.m91653a(0) && (abstractC29957b = c29960e.f122364a) != null) {
                    view2 = view;
                    f15 = f13;
                    f16 = f14;
                    zMo15715s |= abstractC29957b.mo15715s(this, childAt, view2, f15, f16);
                } else {
                    view2 = view;
                    f15 = f13;
                    f16 = f14;
                }
            }
            i13++;
            view = view2;
            f13 = f15;
            f14 = f16;
        }
        return zMo15715s;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i13, int i14, int[] iArr) {
        mo3269d(view, i13, i14, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i13, int i14, int i15, int i16) {
        mo3273h(view, i13, i14, i15, i16, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i13) {
        mo3267b(view, view2, i13, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C29961f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C29961f c29961f = (C29961f) parcelable;
        super.onRestoreInstanceState(c29961f.m113141b());
        SparseArray sparseArray = c29961f.f122381y;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            int id4 = childAt.getId();
            AbstractC29957b abstractC29957b = m3655n(childAt).f122364a;
            if (id4 != -1 && abstractC29957b != null && (parcelable2 = (Parcelable) sparseArray.get(id4)) != null) {
                abstractC29957b.mo15658B(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableMo15659C;
        C29961f c29961f = new C29961f(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            int id4 = childAt.getId();
            AbstractC29957b abstractC29957b = ((C29960e) childAt.getLayoutParams()).f122364a;
            if (id4 != -1 && abstractC29957b != null && (parcelableMo15659C = abstractC29957b.mo15659C(this, childAt)) != null) {
                sparseArray.append(id4, parcelableMo15659C);
            }
        }
        c29961f.f122381y = sparseArray;
        return c29961f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i13) {
        return mo3274i(view, view2, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo3268c(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM3668s;
        boolean zMo15684H;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f5246K == null) {
            zM3668s = m3668s(motionEvent, 1);
            if (!zM3668s) {
                zMo15684H = false;
            }
            motionEventObtain = null;
            if (this.f5246K == null) {
                zMo15684H |= super.onTouchEvent(motionEvent);
            } else if (zM3668s) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zMo15684H;
            }
            m3670v(false);
            return zMo15684H;
        }
        zM3668s = false;
        AbstractC29957b abstractC29957b = ((C29960e) this.f5246K.getLayoutParams()).f122364a;
        if (abstractC29957b != null) {
            zMo15684H = abstractC29957b.mo15684H(this, this.f5246K, motionEvent);
        } else {
            zMo15684H = false;
        }
        motionEventObtain = null;
        if (this.f5246K == null) {
            zMo15684H |= super.onTouchEvent(motionEvent);
        } else if (zM3668s) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        m3670v(false);
        return zMo15684H;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00de  */
    /* JADX INFO: renamed from: p */
    public final void m3665p(int i13) {
        int i14;
        Rect rect;
        int i15;
        ArrayList arrayList;
        boolean zMo15675l;
        boolean z4;
        boolean z13;
        int width;
        int i16;
        int i17;
        int i18;
        int height;
        int i19;
        int i24;
        int i25;
        C29960e c29960e;
        int i26;
        View view;
        AbstractC29957b abstractC29957b;
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.f5256w;
        int size = arrayList2.size();
        Rect rectM3653a = m3653a();
        Rect rectM3653a2 = m3653a();
        Rect rectM3653a3 = m3653a();
        int i27 = 0;
        while (true) {
            C15487f c15487f = f5239b0;
            if (i27 >= size) {
                Rect rect2 = rectM3653a3;
                rectM3653a.setEmpty();
                c15487f.mo43683a(rectM3653a);
                rectM3653a2.setEmpty();
                c15487f.mo43683a(rectM3653a2);
                rect2.setEmpty();
                c15487f.mo43683a(rect2);
                return;
            }
            View view2 = (View) arrayList2.get(i27);
            C29960e c29960e2 = (C29960e) view2.getLayoutParams();
            if (i13 != 0 || view2.getVisibility() != 8) {
                int i28 = 0;
                while (i28 < i27) {
                    if (c29960e2.f122375l == ((View) arrayList2.get(i28))) {
                        C29960e c29960e3 = (C29960e) view2.getLayoutParams();
                        if (c29960e3.f122374k != null) {
                            Rect rectM3653a4 = m3653a();
                            Rect rectM3653a5 = m3653a();
                            C29960e c29960e4 = c29960e2;
                            Rect rectM3653a6 = m3653a();
                            AbstractC29962g.m91655a(this, c29960e3.f122374k, rectM3653a4);
                            m3661j(view2, rectM3653a5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            c29960e = c29960e4;
                            i26 = i28;
                            layoutDirection = layoutDirection;
                            view = view3;
                            m3654l(layoutDirection, rectM3653a4, rectM3653a6, c29960e3, measuredWidth, measuredHeight);
                            boolean z14 = (rectM3653a6.left == rectM3653a5.left && rectM3653a6.top == rectM3653a5.top) ? false : true;
                            m3659e(c29960e3, rectM3653a6, measuredWidth, measuredHeight);
                            int i29 = rectM3653a6.left - rectM3653a5.left;
                            int i34 = rectM3653a6.top - rectM3653a5.top;
                            if (i29 != 0) {
                                WeakHashMap weakHashMap2 = AbstractC16901p0.f64851a;
                                view.offsetLeftAndRight(i29);
                            }
                            if (i34 != 0) {
                                WeakHashMap weakHashMap3 = AbstractC16901p0.f64851a;
                                view.offsetTopAndBottom(i34);
                            }
                            if (z14 && (abstractC29957b = c29960e3.f122364a) != null) {
                                abstractC29957b.mo15675l(this, view, c29960e3.f122374k);
                            }
                            rectM3653a4.setEmpty();
                            c15487f.mo43683a(rectM3653a4);
                            rectM3653a5.setEmpty();
                            c15487f.mo43683a(rectM3653a5);
                            rectM3653a6.setEmpty();
                            c15487f.mo43683a(rectM3653a6);
                        } else {
                            c29960e = c29960e2;
                            i26 = i28;
                            view = view2;
                        }
                    } else {
                        c29960e = c29960e2;
                        i26 = i28;
                        view = view2;
                    }
                    i28 = i26 + 1;
                    c29960e2 = c29960e;
                    view2 = view;
                    arrayList2 = arrayList2;
                    size = size;
                    i27 = i27;
                    rectM3653a3 = rectM3653a3;
                }
                ArrayList arrayList3 = arrayList2;
                C29960e c29960e5 = c29960e2;
                int i35 = size;
                Rect rect3 = rectM3653a3;
                i14 = i27;
                View view4 = view2;
                m3661j(view4, rectM3653a2, true);
                if (c29960e5.f122370g != 0 && !rectM3653a2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(c29960e5.f122370g, layoutDirection);
                    int i36 = absoluteGravity & 112;
                    if (i36 == 48) {
                        rectM3653a.top = Math.max(rectM3653a.top, rectM3653a2.bottom);
                    } else if (i36 == 80) {
                        rectM3653a.bottom = Math.max(rectM3653a.bottom, getHeight() - rectM3653a2.top);
                    }
                    int i37 = absoluteGravity & 7;
                    if (i37 == 3) {
                        rectM3653a.left = Math.max(rectM3653a.left, rectM3653a2.right);
                    } else if (i37 == 5) {
                        rectM3653a.right = Math.max(rectM3653a.right, getWidth() - rectM3653a2.left);
                    }
                }
                if (c29960e5.f122371h != 0 && view4.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = AbstractC16901p0.f64851a;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        C29960e c29960e6 = (C29960e) view4.getLayoutParams();
                        AbstractC29957b abstractC29957b2 = c29960e6.f122364a;
                        Rect rectM3653a7 = m3653a();
                        Rect rectM3653a8 = m3653a();
                        rectM3653a8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (abstractC29957b2 == null || !abstractC29957b2.mo15763f(this, view4, rectM3653a7)) {
                            rectM3653a7.set(rectM3653a8);
                        } else if (!rectM3653a8.contains(rectM3653a7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectM3653a7.toShortString() + " | Bounds:" + rectM3653a8.toShortString());
                        }
                        rectM3653a8.setEmpty();
                        c15487f.mo43683a(rectM3653a8);
                        if (rectM3653a7.isEmpty()) {
                            rectM3653a7.setEmpty();
                            c15487f.mo43683a(rectM3653a7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(c29960e6.f122371h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i24 = (rectM3653a7.top - ((ViewGroup.MarginLayoutParams) c29960e6).topMargin) - c29960e6.f122373j) >= (i25 = rectM3653a.top)) {
                                z4 = false;
                            } else {
                                m3658x(view4, i25 - i24);
                                z4 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectM3653a7.bottom) - ((ViewGroup.MarginLayoutParams) c29960e6).bottomMargin) + c29960e6.f122373j) < (i19 = rectM3653a.bottom)) {
                                m3658x(view4, height - i19);
                                z4 = true;
                            }
                            if (!z4) {
                                m3658x(view4, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i17 = (rectM3653a7.left - ((ViewGroup.MarginLayoutParams) c29960e6).leftMargin) - c29960e6.f122372i) >= (i18 = rectM3653a.left)) {
                                z13 = false;
                            } else {
                                m3657w(view4, i18 - i17);
                                z13 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectM3653a7.right) - ((ViewGroup.MarginLayoutParams) c29960e6).rightMargin) + c29960e6.f122372i) < (i16 = rectM3653a.right)) {
                                m3657w(view4, width - i16);
                                z13 = true;
                            }
                            if (!z13) {
                                m3657w(view4, 0);
                            }
                            rectM3653a7.setEmpty();
                            c15487f.mo43683a(rectM3653a7);
                        }
                    }
                }
                if (i13 != 2) {
                    rect = rect3;
                    rect.set(((C29960e) view4.getLayoutParams()).f122380q);
                    if (rect.equals(rectM3653a2)) {
                        arrayList = arrayList3;
                        i15 = i35;
                    } else {
                        ((C29960e) view4.getLayoutParams()).f122380q.set(rectM3653a2);
                    }
                } else {
                    rect = rect3;
                }
                int i38 = i14 + 1;
                i15 = i35;
                while (true) {
                    arrayList = arrayList3;
                    if (i38 >= i15) {
                        break;
                    }
                    View view5 = (View) arrayList.get(i38);
                    C29960e c29960e7 = (C29960e) view5.getLayoutParams();
                    AbstractC29957b abstractC29957b3 = c29960e7.f122364a;
                    if (abstractC29957b3 != null && abstractC29957b3.mo15674i(this, view5, view4)) {
                        if (i13 == 0 && c29960e7.f122379p) {
                            c29960e7.f122379p = false;
                        } else {
                            if (i13 != 2) {
                                zMo15675l = abstractC29957b3.mo15675l(this, view5, view4);
                            } else {
                                abstractC29957b3.mo15676m(this, view5, view4);
                                zMo15675l = true;
                            }
                            if (i13 == 1) {
                                c29960e7.f122379p = zMo15675l;
                            }
                        }
                    }
                    i38++;
                    arrayList3 = arrayList;
                }
            } else {
                arrayList = arrayList2;
                i15 = size;
                rect = rectM3653a3;
                i14 = i27;
            }
            i27 = i14 + 1;
            rectM3653a3 = rect;
            size = i15;
            arrayList2 = arrayList;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m3666q(View view, int i13) {
        int i14;
        C29960e c29960e = (C29960e) view.getLayoutParams();
        View view2 = c29960e.f122374k;
        if (view2 == null && c29960e.f122369f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        C15487f c15487f = f5239b0;
        if (view2 != null) {
            Rect rectM3653a = m3653a();
            Rect rectM3653a2 = m3653a();
            try {
                AbstractC29962g.m91655a(this, view2, rectM3653a);
                C29960e c29960e2 = (C29960e) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m3654l(i13, rectM3653a, rectM3653a2, c29960e2, measuredWidth, measuredHeight);
                m3659e(c29960e2, rectM3653a2, measuredWidth, measuredHeight);
                view.layout(rectM3653a2.left, rectM3653a2.top, rectM3653a2.right, rectM3653a2.bottom);
                return;
            } finally {
                rectM3653a.setEmpty();
                c15487f.mo43683a(rectM3653a);
                rectM3653a2.setEmpty();
                c15487f.mo43683a(rectM3653a2);
            }
        }
        int i15 = c29960e.f122368e;
        if (i15 < 0) {
            C29960e c29960e3 = (C29960e) view.getLayoutParams();
            Rect rectM3653a3 = m3653a();
            rectM3653a3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c29960e3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c29960e3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c29960e3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c29960e3).bottomMargin);
            if (this.f5250O != null) {
                WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectM3653a3.left = this.f5250O.m47598b() + rectM3653a3.left;
                    rectM3653a3.top = this.f5250O.m47600d() + rectM3653a3.top;
                    rectM3653a3.right -= this.f5250O.m47599c();
                    rectM3653a3.bottom -= this.f5250O.m47597a();
                }
            }
            Rect rectM3653a4 = m3653a();
            int i16 = c29960e3.f122366c;
            if ((i16 & 7) == 0) {
                i16 |= 8388611;
            }
            if ((i16 & 112) == 0) {
                i16 |= 48;
            }
            Gravity.apply(i16, view.getMeasuredWidth(), view.getMeasuredHeight(), rectM3653a3, rectM3653a4, i13);
            view.layout(rectM3653a4.left, rectM3653a4.top, rectM3653a4.right, rectM3653a4.bottom);
            rectM3653a3.setEmpty();
            c15487f.mo43683a(rectM3653a3);
            rectM3653a4.setEmpty();
            c15487f.mo43683a(rectM3653a4);
            return;
        }
        C29960e c29960e4 = (C29960e) view.getLayoutParams();
        int i17 = c29960e4.f122366c;
        if (i17 == 0) {
            i17 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i17, i13);
        int i18 = absoluteGravity & 7;
        int i19 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i13 == 1) {
            i15 = width - i15;
        }
        int iM3663m = m3663m(i15) - measuredWidth2;
        if (i18 == 1) {
            iM3663m += measuredWidth2 / 2;
        } else if (i18 == 5) {
            iM3663m += measuredWidth2;
        }
        if (i19 != 16) {
            i14 = i19 != 80 ? 0 : measuredHeight2;
        } else {
            i14 = measuredHeight2 / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c29960e4).leftMargin, Math.min(iM3663m, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c29960e4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c29960e4).topMargin, Math.min(i14, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c29960e4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    /* JADX INFO: renamed from: r */
    public final void m3667r(View view, int i13, int i14, int i15, int i16) {
        measureChildWithMargins(view, i13, i14, i15, i16);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        AbstractC29957b abstractC29957b = ((C29960e) view.getLayoutParams()).f122364a;
        if (abstractC29957b == null || !abstractC29957b.mo15673A(this, view, rect, z4)) {
            return super.requestChildRectangleOnScreen(view, rect, z4);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        super.requestDisallowInterceptTouchEvent(z4);
        if (!z4 || this.f5243H) {
            return;
        }
        m3670v(false);
        this.f5243H = true;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m3668s(MotionEvent motionEvent, int i13) {
        boolean zM91643e;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f5258y;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i14 = childCount - 1; i14 >= 0; i14--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i14) : i14));
        }
        C2298d c2298d = f5238a0;
        if (c2298d != null) {
            Collections.sort(arrayList, c2298d);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zMo15686o = false;
        boolean z4 = false;
        for (int i15 = 0; i15 < size; i15++) {
            View view = (View) arrayList.get(i15);
            C29960e c29960e = (C29960e) view.getLayoutParams();
            AbstractC29957b abstractC29957b = c29960e.f122364a;
            if (!(zMo15686o || z4) || actionMasked == 0) {
                if (!zMo15686o && abstractC29957b != null) {
                    if (i13 == 0) {
                        zMo15686o = abstractC29957b.mo15686o(this, view, motionEvent);
                    } else if (i13 == 1) {
                        zMo15686o = abstractC29957b.mo15684H(this, view, motionEvent);
                    }
                    if (zMo15686o) {
                        this.f5246K = view;
                    }
                }
                AbstractC29957b abstractC29957b2 = c29960e.f122364a;
                if (abstractC29957b2 == null) {
                    c29960e.f122376m = false;
                }
                boolean z13 = c29960e.f122376m;
                if (z13) {
                    zM91643e = true;
                } else {
                    zM91643e = (abstractC29957b2 != null ? abstractC29957b2.m91643e(this, view) : false) | z13;
                    c29960e.f122376m = zM91643e;
                }
                boolean z14 = zM91643e && !z13;
                if (zM91643e && !z14) {
                    break;
                }
                z4 = z14;
            } else if (abstractC29957b != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i13 == 0) {
                    abstractC29957b.mo15686o(this, view, motionEventObtain);
                } else if (i13 == 1) {
                    abstractC29957b.mo15684H(this, view, motionEventObtain);
                }
            }
        }
        arrayList.clear();
        return zMo15686o;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z4) {
        super.setFitsSystemWindows(z4);
        m3671y();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f5253R = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f5252Q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f5252Q = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f5252Q.setState(getDrawableState());
                }
                Drawable drawable3 = this.f5252Q;
                WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f5252Q.setVisible(getVisibility() == 0, false);
                this.f5252Q.setCallback(this);
            }
            WeakHashMap weakHashMap2 = AbstractC16901p0.f64851a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i13) {
        setStatusBarBackground(new ColorDrawable(i13));
    }

    public void setStatusBarBackgroundResource(int i13) {
        setStatusBarBackground(i13 != 0 ? AbstractC32122c.getDrawable(getContext(), i13) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i13) {
        super.setVisibility(i13);
        boolean z4 = i13 == 0;
        Drawable drawable = this.f5252Q;
        if (drawable == null || drawable.isVisible() == z4) {
            return;
        }
        this.f5252Q.setVisible(z4, false);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0080 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0082  */
    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    /* JADX WARN: Code duplicated, block: B:37:0x0095  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:38:0x0099
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: t */
    public final void m3669t() {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m3669t():void");
    }

    /* JADX INFO: renamed from: v */
    public final void m3670v(boolean z4) {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            AbstractC29957b abstractC29957b = ((C29960e) childAt.getLayoutParams()).f122364a;
            if (abstractC29957b != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z4) {
                    abstractC29957b.mo15686o(this, childAt, motionEventObtain);
                } else {
                    abstractC29957b.mo15684H(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            ((C29960e) getChildAt(i14).getLayoutParams()).f122376m = false;
        }
        this.f5246K = null;
        this.f5243H = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f5252Q;
    }

    /* JADX INFO: renamed from: y */
    public final void m3671y() {
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        if (!getFitsSystemWindows()) {
            AbstractC16877h0.m47517l(this, null);
            return;
        }
        if (this.f5254S == null) {
            this.f5254S = new C29934u0(this, 1);
        }
        AbstractC16877h0.m47517l(this, this.f5254S);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C29960e) {
            return new C29960e((C29960e) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C29960e((ViewGroup.MarginLayoutParams) layoutParams) : new C29960e(layoutParams);
    }
}
