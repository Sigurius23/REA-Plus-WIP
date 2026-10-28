package com.google.android.material.bottomsheet;

import ai.C0904j;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.profileinstaller.ProfileVerifier;
import ar.C1916d;
import com.iterable.iterableapi.C5327g1;
import com.whoop.android.R;
import cr.C11078p;
import cr.ViewOnAttachStateChangeListenerC11077o;
import e73.C12803b;
import er.C13574g;
import er.InterfaceC13569b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import kr.C22788g;
import kr.C22792k;
import lr.C24691c;
import p031b9.AbstractC2875y;
import p161g.C14894a;
import p184h5.AbstractC16871f0;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p184h5.C16855a;
import p184h5.C16858b;
import p186h8.C16999a;
import p211i5.C18091d;
import p257jq.AbstractC21885a;
import p287kq.AbstractC22766a;
import p319m4.AbstractC25012a;
import p404pq.AbstractC29455c;
import p404pq.C29454b;
import p404pq.C29456d;
import p404pq.C29465m;
import p404pq.RunnableC29453a;
import p413q4.AbstractC29957b;
import p413q4.C29960e;
import p573w5.C36833d;
import p619xl.C38445a;
import p715kotlin.jvm.internal.AbstractC22674j;

/* JADX INFO: loaded from: classes6.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC29957b implements InterfaceC13569b {

    /* JADX INFO: renamed from: A */
    public final C12803b f20773A;

    /* JADX INFO: renamed from: B */
    public final ValueAnimator f20774B;

    /* JADX INFO: renamed from: C */
    public final int f20775C;

    /* JADX INFO: renamed from: D */
    public int f20776D;

    /* JADX INFO: renamed from: E */
    public int f20777E;

    /* JADX INFO: renamed from: F */
    public final float f20778F;

    /* JADX INFO: renamed from: G */
    public int f20779G;

    /* JADX INFO: renamed from: H */
    public final float f20780H;

    /* JADX INFO: renamed from: I */
    public boolean f20781I;

    /* JADX INFO: renamed from: J */
    public boolean f20782J;

    /* JADX INFO: renamed from: K */
    public boolean f20783K;

    /* JADX INFO: renamed from: L */
    public int f20784L;

    /* JADX INFO: renamed from: M */
    public C36833d f20785M;

    /* JADX INFO: renamed from: N */
    public boolean f20786N;

    /* JADX INFO: renamed from: O */
    public int f20787O;

    /* JADX INFO: renamed from: P */
    public boolean f20788P;

    /* JADX INFO: renamed from: Q */
    public final float f20789Q;

    /* JADX INFO: renamed from: R */
    public int f20790R;

    /* JADX INFO: renamed from: S */
    public int f20791S;

    /* JADX INFO: renamed from: T */
    public int f20792T;

    /* JADX INFO: renamed from: U */
    public WeakReference f20793U;

    /* JADX INFO: renamed from: V */
    public WeakReference f20794V;

    /* JADX INFO: renamed from: W */
    public final ArrayList f20795W;

    /* JADX INFO: renamed from: X */
    public VelocityTracker f20796X;

    /* JADX INFO: renamed from: Y */
    public C13574g f20797Y;

    /* JADX INFO: renamed from: Z */
    public int f20798Z;

    /* JADX INFO: renamed from: a */
    public final int f20799a;

    /* JADX INFO: renamed from: a0 */
    public int f20800a0;

    /* JADX INFO: renamed from: b */
    public boolean f20801b;

    /* JADX INFO: renamed from: b0 */
    public boolean f20802b0;

    /* JADX INFO: renamed from: c */
    public final float f20803c;

    /* JADX INFO: renamed from: c0 */
    public HashMap f20804c0;

    /* JADX INFO: renamed from: d */
    public final int f20805d;

    /* JADX INFO: renamed from: d0 */
    public final SparseIntArray f20806d0;

    /* JADX INFO: renamed from: e */
    public int f20807e;

    /* JADX INFO: renamed from: e0 */
    public final C24691c f20808e0;

    /* JADX INFO: renamed from: f */
    public boolean f20809f;

    /* JADX INFO: renamed from: g */
    public int f20810g;

    /* JADX INFO: renamed from: h */
    public final int f20811h;

    /* JADX INFO: renamed from: i */
    public final C22788g f20812i;

    /* JADX INFO: renamed from: j */
    public final ColorStateList f20813j;

    /* JADX INFO: renamed from: k */
    public final int f20814k;

    /* JADX INFO: renamed from: l */
    public final int f20815l;

    /* JADX INFO: renamed from: m */
    public int f20816m;

    /* JADX INFO: renamed from: n */
    public final boolean f20817n;

    /* JADX INFO: renamed from: o */
    public final boolean f20818o;

    /* JADX INFO: renamed from: p */
    public final boolean f20819p;

    /* JADX INFO: renamed from: q */
    public final boolean f20820q;

    /* JADX INFO: renamed from: r */
    public final boolean f20821r;

    /* JADX INFO: renamed from: s */
    public final boolean f20822s;

    /* JADX INFO: renamed from: t */
    public final boolean f20823t;

    /* JADX INFO: renamed from: u */
    public final boolean f20824u;

    /* JADX INFO: renamed from: v */
    public int f20825v;

    /* JADX INFO: renamed from: w */
    public int f20826w;

    /* JADX INFO: renamed from: x */
    public final boolean f20827x;

    /* JADX INFO: renamed from: y */
    public final C22792k f20828y;

    /* JADX INFO: renamed from: z */
    public boolean f20829z;

    public BottomSheetBehavior() {
        this.f20799a = 0;
        this.f20801b = true;
        this.f20814k = -1;
        this.f20815l = -1;
        this.f20773A = new C12803b(this);
        this.f20778F = 0.5f;
        this.f20780H = -1.0f;
        this.f20783K = true;
        this.f20784L = 4;
        this.f20789Q = 0.1f;
        this.f20795W = new ArrayList();
        this.f20800a0 = -1;
        this.f20806d0 = new SparseIntArray();
        this.f20808e0 = new C24691c(this, 1);
    }

    /* JADX INFO: renamed from: N */
    public static View m15687N(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        if (AbstractC16877h0.m47513h(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View viewM15687N = m15687N(viewGroup.getChildAt(i13));
            if (viewM15687N != null) {
                return viewM15687N;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: O */
    public static BottomSheetBehavior m15688O(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C29960e)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        AbstractC29957b abstractC29957b = ((C29960e) layoutParams).f122364a;
        if (abstractC29957b instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) abstractC29957b;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    /* JADX INFO: renamed from: P */
    public static int m15689P(int i13, int i14, int i15, int i16) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i13, i14, i16);
        if (i15 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i15), 1073741824);
        }
        if (size != 0) {
            i15 = Math.min(size, i15);
        }
        return View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE);
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: B */
    public final void mo15658B(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        C29456d c29456d = (C29456d) parcelable;
        super.mo15658B(coordinatorLayout, view, c29456d.m113141b());
        int i13 = this.f20799a;
        if (i13 != 0) {
            if (i13 == -1 || (i13 & 1) == 1) {
                this.f20807e = c29456d.f119623z;
            }
            if (i13 == -1 || (i13 & 2) == 2) {
                this.f20801b = c29456d.f119619E;
            }
            if (i13 == -1 || (i13 & 4) == 4) {
                this.f20781I = c29456d.f119620F;
            }
            if (i13 == -1 || (i13 & 8) == 8) {
                this.f20782J = c29456d.f119621G;
            }
        }
        int i14 = c29456d.f119622y;
        if (i14 == 1 || i14 == 2) {
            this.f20784L = 4;
        } else {
            this.f20784L = i14;
        }
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: C */
    public final Parcelable mo15659C(CoordinatorLayout coordinatorLayout, View view) {
        return new C29456d(super.mo15659C(coordinatorLayout, view), this);
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: E */
    public final boolean mo15660E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i13, int i14) {
        this.f20787O = 0;
        this.f20788P = false;
        return (i13 & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: G */
    public final void mo15661G(CoordinatorLayout coordinatorLayout, View view, View view2, int i13) {
        int top;
        int top2;
        int i14;
        float yVelocity;
        int i15 = 3;
        if (view.getTop() == m15695Q()) {
            m15702X(3);
            return;
        }
        WeakReference weakReference = this.f20794V;
        if (weakReference != null && view2 == weakReference.get() && this.f20788P) {
            if (this.f20787O > 0) {
                if (!this.f20801b && view.getTop() > this.f20777E) {
                    i15 = 6;
                }
            } else if (this.f20781I) {
                VelocityTracker velocityTracker = this.f20796X;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f20803c);
                    yVelocity = this.f20796X.getYVelocity(this.f20798Z);
                }
                if (m15703Y(view, yVelocity)) {
                    i15 = 5;
                } else if (this.f20787O == 0) {
                    top2 = view.getTop();
                    if (this.f20801b) {
                        i14 = this.f20777E;
                        if (top2 < i14) {
                            if (top2 >= Math.abs(top2 - this.f20779G)) {
                            }
                        } else if (Math.abs(top2 - i14) < Math.abs(top2 - this.f20779G)) {
                            i15 = 4;
                        }
                        i15 = 6;
                    } else if (Math.abs(top2 - this.f20776D) >= Math.abs(top2 - this.f20779G)) {
                        i15 = 4;
                    }
                } else {
                    if (!this.f20801b) {
                        top = view.getTop();
                        if (Math.abs(top - this.f20777E) < Math.abs(top - this.f20779G)) {
                            i15 = 6;
                        }
                    }
                    i15 = 4;
                }
            } else if (this.f20787O == 0) {
                top2 = view.getTop();
                if (this.f20801b) {
                    i14 = this.f20777E;
                    if (top2 < i14) {
                        if (top2 >= Math.abs(top2 - this.f20779G)) {
                        }
                    } else if (Math.abs(top2 - i14) < Math.abs(top2 - this.f20779G)) {
                        i15 = 4;
                    }
                    i15 = 6;
                } else if (Math.abs(top2 - this.f20776D) >= Math.abs(top2 - this.f20779G)) {
                    i15 = 4;
                }
            } else {
                if (!this.f20801b) {
                    top = view.getTop();
                    if (Math.abs(top - this.f20777E) < Math.abs(top - this.f20779G)) {
                        i15 = 6;
                    }
                }
                i15 = 4;
            }
            m15704Z(view, i15, false);
            this.f20788P = false;
        }
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: H */
    public final boolean mo15684H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i13 = this.f20784L;
        if (i13 == 1 && actionMasked == 0) {
            return true;
        }
        C36833d c36833d = this.f20785M;
        if (c36833d != null && (this.f20783K || i13 == 1)) {
            c36833d.m118080j(motionEvent);
        }
        if (actionMasked == 0) {
            m15698T();
        }
        if (this.f20796X == null) {
            this.f20796X = VelocityTracker.obtain();
        }
        this.f20796X.addMovement(motionEvent);
        if (this.f20785M != null && ((this.f20783K || this.f20784L == 1) && actionMasked == 2 && !this.f20786N)) {
            float fAbs = Math.abs(this.f20800a0 - motionEvent.getY());
            C36833d c36833d2 = this.f20785M;
            if (fAbs > c36833d2.f157566b) {
                c36833d2.m118072b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f20786N;
    }

    /* JADX INFO: renamed from: I */
    public final void m15690I(AbstractC29455c abstractC29455c) {
        ArrayList arrayList = this.f20795W;
        if (arrayList.contains(abstractC29455c)) {
            return;
        }
        arrayList.add(abstractC29455c);
    }

    /* JADX INFO: renamed from: J */
    public final void m15691J() {
        int iM15693L = m15693L();
        if (this.f20801b) {
            this.f20779G = Math.max(this.f20792T - iM15693L, this.f20776D);
        } else {
            this.f20779G = this.f20792T - iM15693L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    /* JADX INFO: renamed from: K */
    public final float m15692K() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float f13;
        float f14 = 0.0f;
        if (this.f20812i != null && (weakReference = this.f20793U) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.f20793U.get();
            if (m15697S() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                float fM66007i = this.f20812i.m66007i();
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    if (radius <= 0.0f || fM66007i <= 0.0f) {
                        f13 = 0.0f;
                    } else {
                        f13 = radius / fM66007i;
                    }
                } else {
                    f13 = 0.0f;
                }
                C22788g c22788g = this.f20812i;
                float fMo65993a = c22788g.f89748w.f89710a.f89771f.mo65993a(c22788g.m66006h());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && fMo65993a > 0.0f) {
                        f14 = radius2 / fMo65993a;
                    }
                }
                return Math.max(f13, f14);
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: L */
    public final int m15693L() {
        int i13;
        if (this.f20809f) {
            return Math.min(Math.max(this.f20810g, this.f20792T - ((this.f20791S * 9) / 16)), this.f20790R) + this.f20825v;
        }
        return (this.f20817n || this.f20818o || (i13 = this.f20816m) <= 0) ? this.f20807e + this.f20825v : Math.max(this.f20807e, i13 + this.f20811h);
    }

    /* JADX INFO: renamed from: M */
    public final void m15694M(int i13) {
        float f13;
        float fM15695Q;
        View view = (View) this.f20793U.get();
        if (view != null) {
            ArrayList arrayList = this.f20795W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i14 = this.f20779G;
            if (i13 > i14 || i14 == m15695Q()) {
                int i15 = this.f20779G;
                f13 = i15 - i13;
                fM15695Q = this.f20792T - i15;
            } else {
                int i16 = this.f20779G;
                f13 = i16 - i13;
                fM15695Q = i16 - m15695Q();
            }
            float f14 = f13 / fM15695Q;
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                ((AbstractC29455c) arrayList.get(i17)).mo5841b(view, f14);
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final int m15695Q() {
        if (this.f20801b) {
            return this.f20776D;
        }
        return Math.max(this.f20775C, this.f20821r ? 0 : this.f20826w);
    }

    /* JADX INFO: renamed from: R */
    public final int m15696R(int i13) {
        if (i13 == 3) {
            return m15695Q();
        }
        if (i13 == 4) {
            return this.f20779G;
        }
        if (i13 == 5) {
            return this.f20792T;
        }
        if (i13 == 6) {
            return this.f20777E;
        }
        throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Invalid state to get top offset: "));
    }

    /* JADX INFO: renamed from: S */
    public final boolean m15697S() {
        WeakReference weakReference = this.f20793U;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f20793U.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: T */
    public final void m15698T() {
        this.f20798Z = -1;
        this.f20800a0 = -1;
        VelocityTracker velocityTracker = this.f20796X;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f20796X = null;
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m15699U(boolean z4) {
        if (this.f20781I != z4) {
            this.f20781I = z4;
            if (!z4 && this.f20784L == 5) {
                m15701W(4);
            }
            m15706a0();
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m15700V(int i13) {
        if (i13 == -1) {
            if (this.f20809f) {
                return;
            } else {
                this.f20809f = true;
            }
        } else {
            if (!this.f20809f && this.f20807e == i13) {
                return;
            }
            this.f20809f = false;
            this.f20807e = Math.max(0, i13);
        }
        m15712d0();
    }

    /* JADX INFO: renamed from: W */
    public final void m15701W(int i13) {
        if (i13 == 1 || i13 == 2) {
            throw new IllegalArgumentException(AbstractC25012a.m73376i(i13 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally.", new StringBuilder("STATE_")));
        }
        if (!this.f20781I && i13 == 5) {
            AbstractC2875y.m8313z(i13, "Cannot set state: ", "BottomSheetBehavior");
            return;
        }
        int i14 = (i13 == 6 && this.f20801b && m15696R(i13) <= this.f20776D) ? 3 : i13;
        WeakReference weakReference = this.f20793U;
        if (weakReference == null || weakReference.get() == null) {
            m15702X(i13);
            return;
        }
        View view = (View) this.f20793U.get();
        RunnableC29453a runnableC29453a = new RunnableC29453a(this, view, i14);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            if (view.isAttachedToWindow()) {
                view.post(runnableC29453a);
                return;
            }
        }
        runnableC29453a.run();
    }

    /* JADX INFO: renamed from: X */
    public final void m15702X(int i13) {
        View view;
        if (this.f20784L == i13) {
            return;
        }
        this.f20784L = i13;
        if (i13 != 4 && i13 != 3 && i13 != 6) {
            boolean z4 = this.f20781I;
        }
        WeakReference weakReference = this.f20793U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i14 = 0;
        if (i13 == 3) {
            m15710c0(true);
        } else if (i13 == 6 || i13 == 5 || i13 == 4) {
            m15710c0(false);
        }
        m15708b0(i13, true);
        while (true) {
            ArrayList arrayList = this.f20795W;
            if (i14 >= arrayList.size()) {
                m15706a0();
                return;
            } else {
                ((AbstractC29455c) arrayList.get(i14)).mo5842c(view, i13);
                i14++;
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m15703Y(View view, float f13) {
        if (this.f20782J) {
            return true;
        }
        if (view.getTop() < this.f20779G) {
            return false;
        }
        return Math.abs(((f13 * this.f20789Q) + ((float) view.getTop())) - ((float) this.f20779G)) / ((float) m15693L()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        m15702X(2);
        m15708b0(r4, true);
        r2.f20773A.m35866i(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.m118085o(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX INFO: renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m15704Z(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.m15696R(r4)
            w5.d r1 = r2.f20785M
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.m118085o(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.f157582r = r3
            r3 = -1
            r1.f157567c = r3
            r3 = 0
            boolean r3 = r1.m118078h(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.f157565a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.f157582r
            if (r5 == 0) goto L30
            r5 = 0
            r1.f157582r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.m15702X(r3)
            r3 = 1
            r2.m15708b0(r4, r3)
            e73.b r3 = r2.f20773A
            r3.m35866i(r4)
            return
        L40:
            r2.m15702X(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.m15704Z(android.view.View, int, boolean):void");
    }

    @Override // er.InterfaceC13569b
    /* JADX INFO: renamed from: a */
    public final void mo15705a(C14894a c14894a) {
        C13574g c13574g = this.f20797Y;
        if (c13574g == null) {
            return;
        }
        if (c13574g.f47918f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C14894a c14894a2 = c13574g.f47918f;
        c13574g.f47918f = c14894a;
        if (c14894a2 == null) {
            return;
        }
        c13574g.m38317b(c14894a.f55564c);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m15706a0() {
        View view;
        int iM51939a;
        WeakReference weakReference = this.f20793U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC16901p0.m47580k(view, 524288);
        AbstractC16901p0.m47577h(view, 0);
        AbstractC16901p0.m47580k(view, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION);
        AbstractC16901p0.m47577h(view, 0);
        AbstractC16901p0.m47580k(view, 1048576);
        AbstractC16901p0.m47577h(view, 0);
        SparseIntArray sparseIntArray = this.f20806d0;
        int i13 = sparseIntArray.get(0, -1);
        if (i13 != -1) {
            AbstractC16901p0.m47580k(view, i13);
            AbstractC16901p0.m47577h(view, 0);
            sparseIntArray.delete(0);
        }
        int i14 = 6;
        if (!this.f20801b && this.f20784L != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            C0904j c0904j = new C0904j(this, i14);
            ArrayList arrayListM47574e = AbstractC16901p0.m47574e(view);
            int i15 = 0;
            while (true) {
                if (i15 >= arrayListM47574e.size()) {
                    int i16 = 0;
                    int i17 = -1;
                    while (true) {
                        int[] iArr = AbstractC16901p0.f64854d;
                        if (i16 >= 32 || i17 != -1) {
                            break;
                        }
                        int i18 = iArr[i16];
                        boolean z4 = true;
                        for (int i19 = 0; i19 < arrayListM47574e.size(); i19++) {
                            z4 &= ((C18091d) arrayListM47574e.get(i19)).m51939a() != i18;
                        }
                        if (z4) {
                            i17 = i18;
                        }
                        i16++;
                    }
                    iM51939a = i17;
                    break;
                }
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C18091d) arrayListM47574e.get(i15)).f70313a).getLabel())) {
                    iM51939a = ((C18091d) arrayListM47574e.get(i15)).m51939a();
                    break;
                }
                i15++;
            }
            if (iM51939a != -1) {
                C18091d c18091d = new C18091d(null, iM51939a, string, c0904j, null);
                View.AccessibilityDelegate accessibilityDelegateM47572c = AbstractC16901p0.m47572c(view);
                C16858b c16858b = accessibilityDelegateM47572c == null ? null : accessibilityDelegateM47572c instanceof C16855a ? ((C16855a) accessibilityDelegateM47572c).f64770a : new C16858b(accessibilityDelegateM47572c);
                if (c16858b == null) {
                    c16858b = new C16858b();
                }
                AbstractC16901p0.m47583n(view, c16858b);
                AbstractC16901p0.m47580k(view, c18091d.m51939a());
                AbstractC16901p0.m47574e(view).add(c18091d);
                AbstractC16901p0.m47577h(view, 0);
            }
            sparseIntArray.put(0, iM51939a);
        }
        if (this.f20781I) {
            int i24 = 5;
            if (this.f20784L != 5) {
                AbstractC16901p0.m47581l(view, C18091d.f70308l, new C0904j(this, i24));
            }
        }
        int i25 = this.f20784L;
        int i26 = 4;
        int i27 = 3;
        if (i25 == 3) {
            AbstractC16901p0.m47581l(view, C18091d.f70307k, new C0904j(this, this.f20801b ? 4 : 6));
            return;
        }
        if (i25 == 4) {
            AbstractC16901p0.m47581l(view, C18091d.f70306j, new C0904j(this, this.f20801b ? 3 : 6));
        } else {
            if (i25 != 6) {
                return;
            }
            AbstractC16901p0.m47581l(view, C18091d.f70307k, new C0904j(this, i26));
            AbstractC16901p0.m47581l(view, C18091d.f70306j, new C0904j(this, i27));
        }
    }

    @Override // er.InterfaceC13569b
    /* JADX INFO: renamed from: b */
    public final void mo15707b(C14894a c14894a) {
        C13574g c13574g = this.f20797Y;
        if (c13574g == null) {
            return;
        }
        c13574g.f47918f = c14894a;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m15708b0(int i13, boolean z4) {
        C22788g c22788g;
        if (i13 == 2) {
            return;
        }
        boolean z13 = this.f20784L == 3 && (this.f20827x || m15697S());
        if (this.f20829z == z13 || (c22788g = this.f20812i) == null) {
            return;
        }
        this.f20829z = z13;
        ValueAnimator valueAnimator = this.f20774B;
        if (!z4 || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            c22788g.m66012n(this.f20829z ? m15692K() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(c22788g.f89748w.f89719j, z13 ? m15692K() : 1.0f);
            valueAnimator.start();
        }
    }

    @Override // er.InterfaceC13569b
    /* JADX INFO: renamed from: c */
    public final void mo15709c() {
        C13574g c13574g = this.f20797Y;
        if (c13574g == null) {
            return;
        }
        if (c13574g.f47918f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        C14894a c14894a = c13574g.f47918f;
        c13574g.f47918f = null;
        if (c14894a == null) {
            return;
        }
        AnimatorSet animatorSetM38316a = c13574g.m38316a();
        animatorSetM38316a.setDuration(c13574g.f47917e);
        animatorSetM38316a.start();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m15710c0(boolean z4) {
        WeakReference weakReference = this.f20793U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z4) {
                if (this.f20804c0 != null) {
                    return;
                } else {
                    this.f20804c0 = new HashMap(childCount);
                }
            }
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = coordinatorLayout.getChildAt(i13);
                if (childAt != this.f20793U.get() && z4) {
                    this.f20804c0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z4) {
                return;
            }
            this.f20804c0 = null;
        }
    }

    @Override // er.InterfaceC13569b
    /* JADX INFO: renamed from: d */
    public final void mo15711d() {
        C13574g c13574g = this.f20797Y;
        if (c13574g == null) {
            return;
        }
        int i13 = c13574g.f47916d;
        int i14 = c13574g.f47915c;
        C14894a c14894a = c13574g.f47918f;
        c13574g.f47918f = null;
        if (c14894a != null) {
            float f13 = c14894a.f55564c;
            if (Build.VERSION.SDK_INT >= 34) {
                if (!this.f20781I) {
                    AnimatorSet animatorSetM38316a = c13574g.m38316a();
                    animatorSetM38316a.setDuration(AbstractC22766a.m65971c(f13, i14, i13));
                    animatorSetM38316a.start();
                    m15701W(4);
                    return;
                }
                C1916d c1916d = new C1916d(this, 12);
                View view = c13574g.f47914b;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
                objectAnimatorOfFloat.setInterpolator(new C16999a(1));
                objectAnimatorOfFloat.setDuration(AbstractC22766a.m65971c(f13, i14, i13));
                objectAnimatorOfFloat.addListener(new C1916d(c13574g, 7));
                objectAnimatorOfFloat.addListener(c1916d);
                objectAnimatorOfFloat.start();
                return;
            }
        }
        m15701W(this.f20781I ? 5 : 4);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m15712d0() {
        View view;
        if (this.f20793U != null) {
            m15691J();
            if (this.f20784L != 4 || (view = (View) this.f20793U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: k */
    public final void mo15713k(C29960e c29960e) {
        super.mo15713k(c29960e);
        this.f20793U = null;
        this.f20785M = null;
        this.f20797Y = null;
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: n */
    public final void mo15714n() {
        super.mo15714n();
        this.f20793U = null;
        this.f20785M = null;
        this.f20797Y = null;
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: o */
    public final boolean mo15686o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i13;
        C36833d c36833d;
        if (!view.isShown() || !this.f20783K) {
            this.f20786N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m15698T();
        }
        if (this.f20796X == null) {
            this.f20796X = VelocityTracker.obtain();
        }
        this.f20796X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x3 = (int) motionEvent.getX();
            this.f20800a0 = (int) motionEvent.getY();
            if (this.f20784L != 2) {
                WeakReference weakReference = this.f20794V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.m3664o(view2, x3, this.f20800a0)) {
                    this.f20798Z = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f20802b0 = true;
                }
            }
            this.f20786N = this.f20798Z == -1 && !coordinatorLayout.m3664o(view, x3, this.f20800a0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f20802b0 = false;
            this.f20798Z = -1;
            if (this.f20786N) {
                this.f20786N = false;
                return false;
            }
        }
        if (this.f20786N || (c36833d = this.f20785M) == null || !c36833d.m118086p(motionEvent)) {
            WeakReference weakReference2 = this.f20794V;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.f20786N || this.f20784L == 1 || coordinatorLayout.m3664o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f20785M == null || (i13 = this.f20800a0) == -1 || Math.abs(i13 - motionEvent.getY()) <= this.f20785M.f157566b) {
                return false;
            }
        }
        return true;
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: p */
    public final boolean mo15668p(CoordinatorLayout coordinatorLayout, View view, int i13) {
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i14 = 0;
        if (this.f20793U == null) {
            this.f20810g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z4 = (Build.VERSION.SDK_INT < 29 || this.f20817n || this.f20809f) ? false : true;
            if (this.f20818o || this.f20819p || this.f20820q || this.f20822s || this.f20823t || this.f20824u || z4) {
                C5327g1 c5327g1 = new C5327g1(this, z4);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                C11078p c11078p = new C11078p();
                c11078p.f35038a = paddingStart;
                c11078p.f35039b = paddingEnd;
                c11078p.f35040c = paddingBottom;
                AbstractC16877h0.m47517l(view, new C38445a(8, c5327g1, c11078p));
                if (view.isAttachedToWindow()) {
                    AbstractC16871f0.m47500c(view);
                } else {
                    view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC11077o());
                }
            }
            AbstractC16901p0.m47586q(view, new C29465m(view));
            this.f20793U = new WeakReference(view);
            this.f20797Y = new C13574g(view);
            C22788g c22788g = this.f20812i;
            if (c22788g != null) {
                view.setBackground(c22788g);
                float fM47510e = this.f20780H;
                if (fM47510e == -1.0f) {
                    fM47510e = AbstractC16877h0.m47510e(view);
                }
                c22788g.m66010l(fM47510e);
            } else {
                ColorStateList colorStateList = this.f20813j;
                if (colorStateList != null) {
                    AbstractC16877h0.m47514i(view, colorStateList);
                }
            }
            m15706a0();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f20785M == null) {
            this.f20785M = new C36833d(coordinatorLayout.getContext(), coordinatorLayout, this.f20808e0);
        }
        int top = view.getTop();
        coordinatorLayout.m3666q(view, i13);
        this.f20791S = coordinatorLayout.getWidth();
        this.f20792T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f20790R = height;
        int iMin = this.f20792T;
        int i15 = iMin - height;
        int i16 = this.f20826w;
        if (i15 < i16) {
            boolean z13 = this.f20821r;
            int i17 = this.f20815l;
            if (z13) {
                if (i17 != -1) {
                    iMin = Math.min(iMin, i17);
                }
                this.f20790R = iMin;
            } else {
                int iMin2 = iMin - i16;
                if (i17 != -1) {
                    iMin2 = Math.min(iMin2, i17);
                }
                this.f20790R = iMin2;
            }
        }
        this.f20776D = Math.max(0, this.f20792T - this.f20790R);
        this.f20777E = (int) ((1.0f - this.f20778F) * this.f20792T);
        m15691J();
        int i18 = this.f20784L;
        if (i18 == 3) {
            view.offsetTopAndBottom(m15695Q());
        } else if (i18 == 6) {
            view.offsetTopAndBottom(this.f20777E);
        } else if (this.f20781I && i18 == 5) {
            view.offsetTopAndBottom(this.f20792T);
        } else if (i18 == 4) {
            view.offsetTopAndBottom(this.f20779G);
        } else if (i18 == 1 || i18 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        m15708b0(this.f20784L, false);
        this.f20794V = new WeakReference(m15687N(view));
        while (true) {
            ArrayList arrayList = this.f20795W;
            if (i14 >= arrayList.size()) {
                return true;
            }
            ((AbstractC29455c) arrayList.get(i14)).mo89926a(view);
            i14++;
        }
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: q */
    public final boolean mo15669q(CoordinatorLayout coordinatorLayout, View view, int i13, int i14, int i15, int i16) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m15689P(i13, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i14, this.f20814k, marginLayoutParams.width), m15689P(i15, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i16, this.f20815l, marginLayoutParams.height));
        return true;
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: s */
    public final boolean mo15715s(CoordinatorLayout coordinatorLayout, View view, View view2, float f13, float f14) {
        WeakReference weakReference = this.f20794V;
        return weakReference != null && view2 == weakReference.get() && (this.f20784L != 3 || super.mo15715s(coordinatorLayout, view, view2, f13, f14));
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: u */
    public final void mo15670u(CoordinatorLayout coordinatorLayout, View view, View view2, int i13, int i14, int[] iArr, int i15) {
        if (i15 == 1) {
            return;
        }
        WeakReference weakReference = this.f20794V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i16 = top - i14;
        if (i14 > 0) {
            if (i16 < m15695Q()) {
                int iM15695Q = top - m15695Q();
                iArr[1] = iM15695Q;
                int i17 = -iM15695Q;
                WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                view.offsetTopAndBottom(i17);
                m15702X(3);
            } else {
                if (!this.f20783K) {
                    return;
                }
                iArr[1] = i14;
                WeakHashMap weakHashMap2 = AbstractC16901p0.f64851a;
                view.offsetTopAndBottom(-i14);
                m15702X(1);
            }
        } else if (i14 < 0 && !view2.canScrollVertically(-1)) {
            int i18 = this.f20779G;
            if (i16 > i18 && !this.f20781I) {
                int i19 = top - i18;
                iArr[1] = i19;
                int i24 = -i19;
                WeakHashMap weakHashMap3 = AbstractC16901p0.f64851a;
                view.offsetTopAndBottom(i24);
                m15702X(4);
            } else {
                if (!this.f20783K) {
                    return;
                }
                iArr[1] = i14;
                WeakHashMap weakHashMap4 = AbstractC16901p0.f64851a;
                view.offsetTopAndBottom(-i14);
                m15702X(1);
            }
        }
        m15694M(view.getTop());
        this.f20787O = i14;
        this.f20788P = true;
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: x */
    public final void mo15671x(CoordinatorLayout coordinatorLayout, View view, View view2, int i13, int i14, int i15, int i16, int i17, int[] iArr) {
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i13;
        this.f20799a = 0;
        this.f20801b = true;
        this.f20814k = -1;
        this.f20815l = -1;
        this.f20773A = new C12803b(this);
        this.f20778F = 0.5f;
        this.f20780H = -1.0f;
        this.f20783K = true;
        this.f20784L = 4;
        this.f20789Q = 0.1f;
        this.f20795W = new ArrayList();
        this.f20800a0 = -1;
        this.f20806d0 = new SparseIntArray();
        this.f20808e0 = new C24691c(this, 1);
        this.f20811h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC21885a.f84545e);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f20813j = AbstractC22674j.m65695C(typedArrayObtainStyledAttributes, context, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.f20828y = C22792k.m66026b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).m66021a();
        }
        C22792k c22792k = this.f20828y;
        if (c22792k != null) {
            C22788g c22788g = new C22788g(c22792k);
            this.f20812i = c22788g;
            c22788g.m66009k(context);
            ColorStateList colorStateList = this.f20813j;
            if (colorStateList != null) {
                this.f20812i.m66011m(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f20812i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(m15692K(), 1.0f);
        this.f20774B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f20774B.addUpdateListener(new C29454b(this));
        this.f20780H = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f20814k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f20815l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null && (i13 = typedValuePeekValue.data) == -1) {
            m15700V(i13);
        } else {
            m15700V(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        m15699U(typedArrayObtainStyledAttributes.getBoolean(8, false));
        this.f20817n = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f20801b != z4) {
            this.f20801b = z4;
            if (this.f20793U != null) {
                m15691J();
            }
            m15702X((this.f20801b && this.f20784L == 6) ? 3 : this.f20784L);
            m15708b0(this.f20784L, true);
            m15706a0();
        }
        this.f20782J = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.f20783K = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f20799a = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f13 = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f13 > 0.0f && f13 < 1.0f) {
            this.f20778F = f13;
            if (this.f20793U != null) {
                this.f20777E = (int) ((1.0f - f13) * this.f20792T);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i14 = typedValuePeekValue2.data;
                if (i14 >= 0) {
                    this.f20775C = i14;
                    m15708b0(this.f20784L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f20775C = dimensionPixelOffset;
                    m15708b0(this.f20784L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f20805d = typedArrayObtainStyledAttributes.getInt(11, 500);
            this.f20818o = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.f20819p = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.f20820q = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.f20821r = typedArrayObtainStyledAttributes.getBoolean(20, true);
            this.f20822s = typedArrayObtainStyledAttributes.getBoolean(14, false);
            this.f20823t = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.f20824u = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.f20827x = typedArrayObtainStyledAttributes.getBoolean(23, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f20803c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
