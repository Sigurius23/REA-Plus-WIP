package com.google.android.material.sidesheet;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.profileinstaller.ProfileVerifier;
import ar.C1916d;
import com.whoop.android.R;
import e73.C12803b;
import er.C13575h;
import er.C13576i;
import er.InterfaceC13569b;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import kr.C22782a;
import kr.C22788g;
import kr.C22791j;
import kr.C22792k;
import lr.C24689a;
import lr.C24691c;
import lr.C24692d;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p031b9.C2869v;
import p031b9.RunnableC2833g0;
import p161g.C14894a;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p186h8.C16999a;
import p211i5.C18091d;
import p257jq.AbstractC21885a;
import p287kq.AbstractC22766a;
import p319m4.AbstractC25012a;
import p413q4.AbstractC29957b;
import p413q4.C29960e;
import p550vd.AbstractC35902e;
import p573w5.C36833d;
import p715kotlin.jvm.internal.AbstractC22674j;

/* JADX INFO: loaded from: classes6.dex */
public class SideSheetBehavior<V extends View> extends AbstractC29957b implements InterfaceC13569b {

    /* JADX INFO: renamed from: a */
    public AbstractC35902e f21019a;

    /* JADX INFO: renamed from: b */
    public final C22788g f21020b;

    /* JADX INFO: renamed from: c */
    public final ColorStateList f21021c;

    /* JADX INFO: renamed from: d */
    public final C22792k f21022d;

    /* JADX INFO: renamed from: e */
    public final C12803b f21023e;

    /* JADX INFO: renamed from: f */
    public final float f21024f;

    /* JADX INFO: renamed from: g */
    public final boolean f21025g;

    /* JADX INFO: renamed from: h */
    public int f21026h;

    /* JADX INFO: renamed from: i */
    public C36833d f21027i;

    /* JADX INFO: renamed from: j */
    public boolean f21028j;

    /* JADX INFO: renamed from: k */
    public final float f21029k;

    /* JADX INFO: renamed from: l */
    public int f21030l;

    /* JADX INFO: renamed from: m */
    public int f21031m;

    /* JADX INFO: renamed from: n */
    public int f21032n;

    /* JADX INFO: renamed from: o */
    public int f21033o;

    /* JADX INFO: renamed from: p */
    public WeakReference f21034p;

    /* JADX INFO: renamed from: q */
    public WeakReference f21035q;

    /* JADX INFO: renamed from: r */
    public final int f21036r;

    /* JADX INFO: renamed from: s */
    public VelocityTracker f21037s;

    /* JADX INFO: renamed from: t */
    public C13576i f21038t;

    /* JADX INFO: renamed from: u */
    public int f21039u;

    /* JADX INFO: renamed from: v */
    public final LinkedHashSet f21040v;

    /* JADX INFO: renamed from: w */
    public final C24691c f21041w;

    public SideSheetBehavior() {
        this.f21023e = new C12803b(this);
        this.f21025g = true;
        this.f21026h = 5;
        this.f21029k = 0.1f;
        this.f21036r = -1;
        this.f21040v = new LinkedHashSet();
        this.f21041w = new C24691c(this, 0);
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: B */
    public final void mo15658B(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        C24692d c24692d = (C24692d) parcelable;
        if (c24692d.m113141b() != null) {
            super.mo15658B(coordinatorLayout, view, c24692d.m113141b());
        }
        int i13 = c24692d.f96600y;
        if (i13 == 1 || i13 == 2) {
            i13 = 5;
        }
        this.f21026h = i13;
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: C */
    public final Parcelable mo15659C(CoordinatorLayout coordinatorLayout, View view) {
        return new C24692d(super.mo15659C(coordinatorLayout, view), this);
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: H */
    public final boolean mo15684H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f21026h == 1 && actionMasked == 0) {
            return true;
        }
        if (m15777K()) {
            this.f21027i.m118080j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f21037s) != null) {
            velocityTracker.recycle();
            this.f21037s = null;
        }
        if (this.f21037s == null) {
            this.f21037s = VelocityTracker.obtain();
        }
        this.f21037s.addMovement(motionEvent);
        if (m15777K() && actionMasked == 2 && !this.f21028j && m15777K()) {
            float fAbs = Math.abs(this.f21039u - motionEvent.getX());
            C36833d c36833d = this.f21027i;
            if (fAbs > c36833d.f157566b) {
                c36833d.m118072b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f21028j;
    }

    /* JADX INFO: renamed from: I */
    public final void m15775I(int i13) {
        if (i13 == 1 || i13 == 2) {
            throw new IllegalArgumentException(AbstractC25012a.m73376i(i13 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally.", new StringBuilder("STATE_")));
        }
        WeakReference weakReference = this.f21034p;
        if (weakReference == null || weakReference.get() == null) {
            m15776J(i13);
            return;
        }
        View view = (View) this.f21034p.get();
        RunnableC2833g0 runnableC2833g0 = new RunnableC2833g0(this, i13, 4);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            if (view.isAttachedToWindow()) {
                view.post(runnableC2833g0);
                return;
            }
        }
        runnableC2833g0.run();
    }

    /* JADX INFO: renamed from: J */
    public final void m15776J(int i13) {
        View view;
        if (this.f21026h == i13) {
            return;
        }
        this.f21026h = i13;
        WeakReference weakReference = this.f21034p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i14 = this.f21026h == 5 ? 4 : 0;
        if (view.getVisibility() != i14) {
            view.setVisibility(i14);
        }
        Iterator it = this.f21040v.iterator();
        if (it.hasNext()) {
            throw AbstractC11266d.m30454h(it);
        }
        m15779M();
    }

    /* JADX INFO: renamed from: K */
    public final boolean m15777K() {
        if (this.f21027i != null) {
            return this.f21025g || this.f21026h == 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r1.m118085o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        m15776J(2);
        r2.f21023e.m35866i(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m15778L(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L19
            r0 = 5
            if (r4 != r0) goto Ld
            vd.e r0 = r2.f21019a
            int r0 = r0.mo72282y()
            goto L1f
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Invalid state to get outer edge offset: "
            java.lang.String r4 = p031b9.AbstractC2875y.m8295h(r4, r5)
            r3.<init>(r4)
            throw r3
        L19:
            vd.e r0 = r2.f21019a
            int r0 = r0.mo72281x()
        L1f:
            w5.d r1 = r2.f21027i
            if (r1 == 0) goto L57
            if (r5 == 0) goto L30
            int r3 = r3.getTop()
            boolean r3 = r1.m118085o(r0, r3)
            if (r3 == 0) goto L57
            goto L4d
        L30:
            int r5 = r3.getTop()
            r1.f157582r = r3
            r3 = -1
            r1.f157567c = r3
            r3 = 0
            boolean r3 = r1.m118078h(r0, r5, r3, r3)
            if (r3 != 0) goto L4b
            int r5 = r1.f157565a
            if (r5 != 0) goto L4b
            android.view.View r5 = r1.f157582r
            if (r5 == 0) goto L4b
            r5 = 0
            r1.f157582r = r5
        L4b:
            if (r3 == 0) goto L57
        L4d:
            r3 = 2
            r2.m15776J(r3)
            e73.b r3 = r2.f21023e
            r3.m35866i(r4)
            return
        L57:
            r2.m15776J(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.m15778L(android.view.View, int, boolean):void");
    }

    /* JADX INFO: renamed from: M */
    public final void m15779M() {
        View view;
        WeakReference weakReference = this.f21034p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC16901p0.m47580k(view, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION);
        AbstractC16901p0.m47577h(view, 0);
        AbstractC16901p0.m47580k(view, 1048576);
        AbstractC16901p0.m47577h(view, 0);
        int i13 = 5;
        if (this.f21026h != 5) {
            AbstractC16901p0.m47581l(view, C18091d.f70308l, new C2869v(this, i13, 2));
        }
        int i14 = 3;
        if (this.f21026h != 3) {
            AbstractC16901p0.m47581l(view, C18091d.f70306j, new C2869v(this, i14, 2));
        }
    }

    @Override // er.InterfaceC13569b
    /* JADX INFO: renamed from: a */
    public final void mo15705a(C14894a c14894a) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C13576i c13576i = this.f21038t;
        if (c13576i == null) {
            return;
        }
        AbstractC35902e abstractC35902e = this.f21019a;
        int i13 = (abstractC35902e == null || abstractC35902e.mo72271E() == 0) ? 5 : 3;
        if (c13576i.f47918f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C14894a c14894a2 = c13576i.f47918f;
        c13576i.f47918f = c14894a;
        if (c14894a2 != null) {
            c13576i.m38318a(c14894a.f55564c, i13, c14894a.f55565d == 0);
        }
        WeakReference weakReference = this.f21034p;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f21034p.get();
        WeakReference weakReference2 = this.f21035q;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        this.f21019a.mo72278j0(marginLayoutParams, (int) ((view.getScaleX() * this.f21030l) + this.f21033o));
        view2.requestLayout();
    }

    @Override // er.InterfaceC13569b
    /* JADX INFO: renamed from: b */
    public final void mo15707b(C14894a c14894a) {
        C13576i c13576i = this.f21038t;
        if (c13576i == null) {
            return;
        }
        c13576i.f47918f = c14894a;
    }

    @Override // er.InterfaceC13569b
    /* JADX INFO: renamed from: c */
    public final void mo15709c() {
        C13576i c13576i = this.f21038t;
        if (c13576i == null) {
            return;
        }
        View view = c13576i.f47914b;
        if (c13576i.f47918f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        C14894a c14894a = c13576i.f47918f;
        c13576i.f47918f = null;
        if (c14894a == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i13), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(c13576i.f47917e);
        animatorSet.start();
    }

    @Override // er.InterfaceC13569b
    /* JADX INFO: renamed from: d */
    public final void mo15711d() {
        int i13;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        C13576i c13576i = this.f21038t;
        if (c13576i == null) {
            return;
        }
        C14894a c14894a = c13576i.f47918f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        c13576i.f47918f = null;
        int i14 = 5;
        if (c14894a == null || Build.VERSION.SDK_INT < 34) {
            m15775I(5);
            return;
        }
        AbstractC35902e abstractC35902e = this.f21019a;
        if (abstractC35902e != null && abstractC35902e.mo72271E() != 0) {
            i14 = 3;
        }
        C1916d c1916d = new C1916d(this, 10);
        WeakReference weakReference = this.f21035q;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int iMo72280w = this.f21019a.mo72280w(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: lr.b
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f96594a.f21019a.mo72278j0(marginLayoutParams, AbstractC22766a.m65971c(valueAnimator.getAnimatedFraction(), iMo72280w, 0));
                    view.requestLayout();
                }
            };
        }
        View view2 = c13576i.f47914b;
        boolean z4 = c14894a.f55565d == 0;
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        boolean z13 = (Gravity.getAbsoluteGravity(i14, view2.getLayoutDirection()) & 3) == 3;
        float scaleX = view2.getScaleX() * view2.getWidth();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            i13 = z13 ? marginLayoutParams2.leftMargin : marginLayoutParams2.rightMargin;
        } else {
            i13 = 0;
        }
        float f13 = scaleX + i13;
        Property property = View.TRANSLATION_X;
        if (z13) {
            f13 = -f13;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, f13);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new C16999a(1));
        objectAnimatorOfFloat.setDuration(AbstractC22766a.m65971c(c14894a.f55564c, c13576i.f47915c, c13576i.f47916d));
        objectAnimatorOfFloat.addListener(new C13575h(c13576i, z4, i14));
        objectAnimatorOfFloat.addListener(c1916d);
        objectAnimatorOfFloat.start();
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: k */
    public final void mo15713k(C29960e c29960e) {
        super.mo15713k(c29960e);
        this.f21034p = null;
        this.f21027i = null;
        this.f21038t = null;
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: n */
    public final void mo15714n() {
        super.mo15714n();
        this.f21034p = null;
        this.f21027i = null;
        this.f21038t = null;
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: o */
    public final boolean mo15686o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C36833d c36833d;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && AbstractC16901p0.m47573d(view) == null) || !this.f21025g) {
            this.f21028j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f21037s) != null) {
            velocityTracker.recycle();
            this.f21037s = null;
        }
        if (this.f21037s == null) {
            this.f21037s = VelocityTracker.obtain();
        }
        this.f21037s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f21039u = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f21028j) {
            this.f21028j = false;
            return false;
        }
        return (this.f21028j || (c36833d = this.f21027i) == null || !c36833d.m118086p(motionEvent)) ? false : true;
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: p */
    public final boolean mo15668p(CoordinatorLayout coordinatorLayout, View view, int i13) {
        View view2;
        View view3;
        int i14;
        View viewFindViewById;
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        int i15 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.f21034p;
        C22788g c22788g = this.f21020b;
        int iMo72269B = 0;
        if (weakReference == null) {
            this.f21034p = new WeakReference(view);
            this.f21038t = new C13576i(view);
            if (c22788g != null) {
                view.setBackground(c22788g);
                float fM47510e = this.f21024f;
                if (fM47510e == -1.0f) {
                    fM47510e = AbstractC16877h0.m47510e(view);
                }
                c22788g.m66010l(fM47510e);
            } else {
                ColorStateList colorStateList = this.f21021c;
                if (colorStateList != null) {
                    AbstractC16877h0.m47514i(view, colorStateList);
                }
            }
            int i16 = this.f21026h == 5 ? 4 : 0;
            if (view.getVisibility() != i16) {
                view.setVisibility(i16);
            }
            m15779M();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (AbstractC16901p0.m47573d(view) == null) {
                AbstractC16901p0.m47584o(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i17 = Gravity.getAbsoluteGravity(((C29960e) view.getLayoutParams()).f122366c, i13) == 3 ? 1 : 0;
        AbstractC35902e abstractC35902e = this.f21019a;
        if (abstractC35902e == null || abstractC35902e.mo72271E() != i17) {
            C29960e c29960e = null;
            C22792k c22792k = this.f21022d;
            if (i17 == 0) {
                this.f21019a = new C24689a(this, i15);
                if (c22792k != null) {
                    WeakReference weakReference2 = this.f21034p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof C29960e)) {
                        c29960e = (C29960e) view3.getLayoutParams();
                    }
                    if (c29960e == null || ((ViewGroup.MarginLayoutParams) c29960e).rightMargin <= 0) {
                        C22791j c22791jM66029e = c22792k.m66029e();
                        c22791jM66029e.f89758f = new C22782a(0.0f);
                        c22791jM66029e.m66024d(0.0f);
                        C22792k c22792kM66021a = c22791jM66029e.m66021a();
                        if (c22788g != null) {
                            c22788g.setShapeAppearanceModel(c22792kM66021a);
                        }
                    }
                }
            } else {
                if (i17 != 1) {
                    throw new IllegalArgumentException(AbstractC2875y.m8296i(i17, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                }
                this.f21019a = new C24689a(this, iMo72269B);
                if (c22792k != null) {
                    WeakReference weakReference3 = this.f21034p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof C29960e)) {
                        c29960e = (C29960e) view2.getLayoutParams();
                    }
                    if (c29960e == null || ((ViewGroup.MarginLayoutParams) c29960e).leftMargin <= 0) {
                        C22791j c22791jM66029e2 = c22792k.m66029e();
                        c22791jM66029e2.f89757e = new C22782a(0.0f);
                        c22791jM66029e2.m66023c(0.0f);
                        C22792k c22792kM66021a2 = c22791jM66029e2.m66021a();
                        if (c22788g != null) {
                            c22788g.setShapeAppearanceModel(c22792kM66021a2);
                        }
                    }
                }
            }
        }
        if (this.f21027i == null) {
            this.f21027i = new C36833d(coordinatorLayout.getContext(), coordinatorLayout, this.f21041w);
        }
        int iMo72269B2 = this.f21019a.mo72269B(view);
        coordinatorLayout.m3666q(view, i13);
        this.f21031m = coordinatorLayout.getWidth();
        this.f21032n = this.f21019a.mo72270C(coordinatorLayout);
        this.f21030l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f21033o = marginLayoutParams != null ? this.f21019a.mo72276h(marginLayoutParams) : 0;
        int i18 = this.f21026h;
        if (i18 == 1 || i18 == 2) {
            iMo72269B = iMo72269B2 - this.f21019a.mo72269B(view);
        } else if (i18 != 3) {
            if (i18 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f21026h);
            }
            iMo72269B = this.f21019a.mo72282y();
        }
        view.offsetLeftAndRight(iMo72269B);
        if (this.f21035q == null && (i14 = this.f21036r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i14)) != null) {
            this.f21035q = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f21040v.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: q */
    public final boolean mo15669q(CoordinatorLayout coordinatorLayout, View view, int i13, int i14, int i15, int i16) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i13, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i14, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i15, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i16, marginLayoutParams.height));
        return true;
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f21023e = new C12803b(this);
        this.f21025g = true;
        this.f21026h = 5;
        this.f21029k = 0.1f;
        this.f21036r = -1;
        this.f21040v = new LinkedHashSet();
        this.f21041w = new C24691c(this, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC21885a.f84532I);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f21021c = AbstractC22674j.m65695C(typedArrayObtainStyledAttributes, context, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f21022d = C22792k.m66026b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).m66021a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f21036r = resourceId;
            WeakReference weakReference = this.f21035q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f21035q = null;
            WeakReference weakReference2 = this.f21034p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        C22792k c22792k = this.f21022d;
        if (c22792k != null) {
            C22788g c22788g = new C22788g(c22792k);
            this.f21020b = c22788g;
            c22788g.m66009k(context);
            ColorStateList colorStateList = this.f21021c;
            if (colorStateList != null) {
                this.f21020b.m66011m(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f21020b.setTint(typedValue.data);
            }
        }
        this.f21024f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f21025g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
