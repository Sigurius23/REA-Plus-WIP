package p573w5;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.WeakHashMap;
import p144fc.InterpolatorC14346b;
import p184h5.AbstractC16901p0;
import p479s4.AbstractC32131l;
import p656yp.RunnableC39696c;

/* JADX INFO: renamed from: w5.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C36833d {

    /* JADX INFO: renamed from: v */
    public static final InterpolatorC14346b f157564v = new InterpolatorC14346b(1);

    /* JADX INFO: renamed from: a */
    public int f157565a;

    /* JADX INFO: renamed from: b */
    public final int f157566b;

    /* JADX INFO: renamed from: d */
    public float[] f157568d;

    /* JADX INFO: renamed from: e */
    public float[] f157569e;

    /* JADX INFO: renamed from: f */
    public float[] f157570f;

    /* JADX INFO: renamed from: g */
    public float[] f157571g;

    /* JADX INFO: renamed from: h */
    public int[] f157572h;

    /* JADX INFO: renamed from: i */
    public int[] f157573i;

    /* JADX INFO: renamed from: j */
    public int[] f157574j;

    /* JADX INFO: renamed from: k */
    public int f157575k;

    /* JADX INFO: renamed from: l */
    public VelocityTracker f157576l;

    /* JADX INFO: renamed from: m */
    public final float f157577m;

    /* JADX INFO: renamed from: n */
    public final float f157578n;

    /* JADX INFO: renamed from: o */
    public final int f157579o;

    /* JADX INFO: renamed from: p */
    public final OverScroller f157580p;

    /* JADX INFO: renamed from: q */
    public final AbstractC32131l f157581q;

    /* JADX INFO: renamed from: r */
    public View f157582r;

    /* JADX INFO: renamed from: s */
    public boolean f157583s;

    /* JADX INFO: renamed from: t */
    public final ViewGroup f157584t;

    /* JADX INFO: renamed from: c */
    public int f157567c = -1;

    /* JADX INFO: renamed from: u */
    public final RunnableC39696c f157585u = new RunnableC39696c(this, 1);

    public C36833d(Context context, ViewGroup viewGroup, AbstractC32131l abstractC32131l) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC32131l == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f157584t = viewGroup;
        this.f157581q = abstractC32131l;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f157579o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f157566b = viewConfiguration.getScaledTouchSlop();
        this.f157577m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f157578n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f157580p = new OverScroller(context, f157564v);
    }

    /* JADX INFO: renamed from: a */
    public final void m118071a() {
        this.f157567c = -1;
        float[] fArr = this.f157568d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f157569e, 0.0f);
            Arrays.fill(this.f157570f, 0.0f);
            Arrays.fill(this.f157571g, 0.0f);
            Arrays.fill(this.f157572h, 0);
            Arrays.fill(this.f157573i, 0);
            Arrays.fill(this.f157574j, 0);
            this.f157575k = 0;
        }
        VelocityTracker velocityTracker = this.f157576l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f157576l = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m118072b(View view, int i13) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f157584t;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f157582r = view;
        this.f157567c = i13;
        this.f157581q.mo81151n(view, i13);
        m118084n(1);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[RETURN] */
    /* JADX INFO: renamed from: c */
    public final boolean m118073c(View view, float f13, float f14) {
        if (view != null) {
            AbstractC32131l abstractC32131l = this.f157581q;
            boolean z4 = abstractC32131l.mo72286k(view) > 0;
            boolean z13 = abstractC32131l.mo72287l() > 0;
            if (z4 && z13) {
                float f15 = (f14 * f14) + (f13 * f13);
                int i13 = this.f157566b;
                if (f15 > i13 * i13) {
                    return true;
                }
            } else if (!z4 ? !(!z13 || Math.abs(f14) <= this.f157566b) : Math.abs(f13) > this.f157566b) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m118074d(int i13) {
        float[] fArr = this.f157568d;
        if (fArr != null) {
            int i14 = this.f157575k;
            int i15 = 1 << i13;
            if ((i14 & i15) != 0) {
                fArr[i13] = 0.0f;
                this.f157569e[i13] = 0.0f;
                this.f157570f[i13] = 0.0f;
                this.f157571g[i13] = 0.0f;
                this.f157572h[i13] = 0;
                this.f157573i[i13] = 0;
                this.f157574j[i13] = 0;
                this.f157575k = (~i15) & i14;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m118075e(int i13, int i14, int i15) {
        if (i13 == 0) {
            return 0;
        }
        int width = this.f157584t.getWidth();
        float f13 = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i13) / width) - 0.5f) * 0.47123894f)) * f13) + f13;
        int iAbs = Math.abs(i14);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i13) / i15) + 1.0f) * 256.0f), 600);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m118076f() {
        if (this.f157565a == 2) {
            OverScroller overScroller = this.f157580p;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f157582r.getLeft();
            int top = currY - this.f157582r.getTop();
            if (left != 0) {
                View view = this.f157582r;
                WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f157582r;
                WeakHashMap weakHashMap2 = AbstractC16901p0.f64851a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f157581q.mo72289p(this.f157582r, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f157584t.post(this.f157585u);
            }
        }
        return this.f157565a == 2;
    }

    /* JADX INFO: renamed from: g */
    public final View m118077g(int i13, int i14) {
        ViewGroup viewGroup = this.f157584t;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f157581q.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i13 >= childAt.getLeft() && i13 < childAt.getRight() && i14 >= childAt.getTop() && i14 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m118078h(int i13, int i14, int i15, int i16) {
        float f13;
        float f14;
        float f15;
        float f16;
        int left = this.f157582r.getLeft();
        int top = this.f157582r.getTop();
        int i17 = i13 - left;
        int i18 = i14 - top;
        OverScroller overScroller = this.f157580p;
        if (i17 == 0 && i18 == 0) {
            overScroller.abortAnimation();
            m118084n(0);
            return false;
        }
        View view = this.f157582r;
        int i19 = (int) this.f157578n;
        int i24 = (int) this.f157577m;
        int iAbs = Math.abs(i15);
        if (iAbs < i19) {
            i15 = 0;
        } else if (iAbs > i24) {
            i15 = i15 > 0 ? i24 : -i24;
        }
        int iAbs2 = Math.abs(i16);
        if (iAbs2 < i19) {
            i16 = 0;
        } else if (iAbs2 > i24) {
            i16 = i16 > 0 ? i24 : -i24;
        }
        int iAbs3 = Math.abs(i17);
        int iAbs4 = Math.abs(i18);
        int iAbs5 = Math.abs(i15);
        int iAbs6 = Math.abs(i16);
        int i25 = iAbs5 + iAbs6;
        int i26 = iAbs3 + iAbs4;
        if (i15 != 0) {
            f13 = iAbs5;
            f14 = i25;
        } else {
            f13 = iAbs3;
            f14 = i26;
        }
        float f17 = f13 / f14;
        if (i16 != 0) {
            f15 = iAbs6;
            f16 = i25;
        } else {
            f15 = iAbs4;
            f16 = i26;
        }
        float f18 = f15 / f16;
        AbstractC32131l abstractC32131l = this.f157581q;
        overScroller.startScroll(left, top, i17, i18, (int) ((m118075e(i18, i16, abstractC32131l.mo72287l()) * f18) + (m118075e(i17, i15, abstractC32131l.mo72286k(view)) * f17)));
        m118084n(2);
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m118079i(int i13) {
        if ((this.f157575k & (1 << i13)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i13 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m118080j(MotionEvent motionEvent) {
        int i13;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m118071a();
        }
        if (this.f157576l == null) {
            this.f157576l = VelocityTracker.obtain();
        }
        this.f157576l.addMovement(motionEvent);
        int i14 = 0;
        if (actionMasked == 0) {
            float x3 = motionEvent.getX();
            float y13 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM118077g = m118077g((int) x3, (int) y13);
            m118082l(x3, y13, pointerId);
            m118087q(viewM118077g, pointerId);
            int i15 = this.f157572h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f157565a == 1) {
                m118081k();
            }
            m118071a();
            return;
        }
        AbstractC32131l abstractC32131l = this.f157581q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f157565a == 1) {
                    this.f157583s = true;
                    abstractC32131l.mo72290q(this.f157582r, 0.0f, 0.0f);
                    this.f157583s = false;
                    if (this.f157565a == 1) {
                        m118084n(0);
                    }
                }
                m118071a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x5 = motionEvent.getX(actionIndex);
                float y14 = motionEvent.getY(actionIndex);
                m118082l(x5, y14, pointerId2);
                if (this.f157565a == 0) {
                    m118087q(m118077g((int) x5, (int) y14), pointerId2);
                    int i16 = this.f157572h[pointerId2];
                    return;
                }
                int i17 = (int) x5;
                int i18 = (int) y14;
                View view = this.f157582r;
                if (view != null && i17 >= view.getLeft() && i17 < view.getRight() && i18 >= view.getTop() && i18 < view.getBottom()) {
                    i14 = 1;
                }
                if (i14 != 0) {
                    m118087q(this.f157582r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f157565a == 1 && pointerId3 == this.f157567c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i14 >= pointerCount) {
                        i13 = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i14);
                    if (pointerId4 != this.f157567c) {
                        View viewM118077g2 = m118077g((int) motionEvent.getX(i14), (int) motionEvent.getY(i14));
                        View view2 = this.f157582r;
                        if (viewM118077g2 == view2 && m118087q(view2, pointerId4)) {
                            i13 = this.f157567c;
                            break;
                        }
                    }
                    i14++;
                }
                if (i13 == -1) {
                    m118081k();
                }
            }
            m118074d(pointerId3);
            return;
        }
        if (this.f157565a == 1) {
            if (m118079i(this.f157567c)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f157567c);
                float x9 = motionEvent.getX(iFindPointerIndex);
                float y15 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f157570f;
                int i19 = this.f157567c;
                int i24 = (int) (x9 - fArr[i19]);
                int i25 = (int) (y15 - this.f157571g[i19]);
                int left = this.f157582r.getLeft() + i24;
                int top = this.f157582r.getTop() + i25;
                int left2 = this.f157582r.getLeft();
                int top2 = this.f157582r.getTop();
                if (i24 != 0) {
                    left = abstractC32131l.mo72284f(this.f157582r, left);
                    WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                    this.f157582r.offsetLeftAndRight(left - left2);
                }
                if (i25 != 0) {
                    top = abstractC32131l.mo72285g(this.f157582r, top);
                    WeakHashMap weakHashMap2 = AbstractC16901p0.f64851a;
                    this.f157582r.offsetTopAndBottom(top - top2);
                }
                if (i24 != 0 || i25 != 0) {
                    abstractC32131l.mo72289p(this.f157582r, left, top);
                }
                m118083m(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i14 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i14);
            if (m118079i(pointerId5)) {
                float x13 = motionEvent.getX(i14);
                float y16 = motionEvent.getY(i14);
                float f13 = x13 - this.f157568d[pointerId5];
                float f14 = y16 - this.f157569e[pointerId5];
                Math.abs(f13);
                Math.abs(f14);
                int i26 = this.f157572h[pointerId5];
                Math.abs(f14);
                Math.abs(f13);
                int i27 = this.f157572h[pointerId5];
                Math.abs(f13);
                Math.abs(f14);
                int i28 = this.f157572h[pointerId5];
                Math.abs(f14);
                Math.abs(f13);
                int i29 = this.f157572h[pointerId5];
                if (this.f157565a != 1) {
                    View viewM118077g3 = m118077g((int) x13, (int) y16);
                    if (m118073c(viewM118077g3, f13, f14) && m118087q(viewM118077g3, pointerId5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i14++;
        }
        m118083m(motionEvent);
    }

    /* JADX INFO: renamed from: k */
    public final void m118081k() {
        VelocityTracker velocityTracker = this.f157576l;
        float f13 = this.f157577m;
        velocityTracker.computeCurrentVelocity(1000, f13);
        float xVelocity = this.f157576l.getXVelocity(this.f157567c);
        float fAbs = Math.abs(xVelocity);
        float f14 = this.f157578n;
        if (fAbs < f14) {
            xVelocity = 0.0f;
        } else if (fAbs > f13) {
            xVelocity = xVelocity > 0.0f ? f13 : -f13;
        }
        float yVelocity = this.f157576l.getYVelocity(this.f157567c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f14) {
            f13 = 0.0f;
        } else if (fAbs2 <= f13) {
            f13 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f13 = -f13;
        }
        this.f157583s = true;
        this.f157581q.mo72290q(this.f157582r, xVelocity, f13);
        this.f157583s = false;
        if (this.f157565a == 1) {
            m118084n(0);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m118082l(float f13, float f14, int i13) {
        float[] fArr = this.f157568d;
        if (fArr == null || fArr.length <= i13) {
            int i14 = i13 + 1;
            float[] fArr2 = new float[i14];
            float[] fArr3 = new float[i14];
            float[] fArr4 = new float[i14];
            float[] fArr5 = new float[i14];
            int[] iArr = new int[i14];
            int[] iArr2 = new int[i14];
            int[] iArr3 = new int[i14];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f157569e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f157570f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f157571g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f157572h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f157573i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f157574j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f157568d = fArr2;
            this.f157569e = fArr3;
            this.f157570f = fArr4;
            this.f157571g = fArr5;
            this.f157572h = iArr;
            this.f157573i = iArr2;
            this.f157574j = iArr3;
        }
        float[] fArr9 = this.f157568d;
        this.f157570f[i13] = f13;
        fArr9[i13] = f13;
        float[] fArr10 = this.f157569e;
        this.f157571g[i13] = f14;
        fArr10[i13] = f14;
        int[] iArr7 = this.f157572h;
        int i15 = (int) f13;
        int i16 = (int) f14;
        ViewGroup viewGroup = this.f157584t;
        int left = viewGroup.getLeft();
        int i17 = this.f157579o;
        int i18 = i15 < left + i17 ? 1 : 0;
        if (i16 < viewGroup.getTop() + i17) {
            i18 |= 4;
        }
        if (i15 > viewGroup.getRight() - i17) {
            i18 |= 2;
        }
        if (i16 > viewGroup.getBottom() - i17) {
            i18 |= 8;
        }
        iArr7[i13] = i18;
        this.f157575k |= 1 << i13;
    }

    /* JADX INFO: renamed from: m */
    public final void m118083m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i13 = 0; i13 < pointerCount; i13++) {
            int pointerId = motionEvent.getPointerId(i13);
            if (m118079i(pointerId)) {
                float x3 = motionEvent.getX(i13);
                float y13 = motionEvent.getY(i13);
                this.f157570f[pointerId] = x3;
                this.f157571g[pointerId] = y13;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m118084n(int i13) {
        this.f157584t.removeCallbacks(this.f157585u);
        if (this.f157565a != i13) {
            this.f157565a = i13;
            this.f157581q.mo72288o(i13);
            if (this.f157565a == 0) {
                this.f157582r = null;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m118085o(int i13, int i14) {
        if (this.f157583s) {
            return m118078h(i13, i14, (int) this.f157576l.getXVelocity(this.f157567c), (int) this.f157576l.getYVelocity(this.f157567c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:61:0x0114  */
    /* JADX INFO: renamed from: p */
    public final boolean m118086p(MotionEvent motionEvent) {
        View viewM118077g;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m118071a();
        }
        if (this.f157576l == null) {
            this.f157576l = VelocityTracker.obtain();
        }
        this.f157576l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x3 = motionEvent.getX();
            float y13 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            m118082l(x3, y13, pointerId);
            View viewM118077g2 = m118077g((int) x3, (int) y13);
            if (viewM118077g2 == this.f157582r && this.f157565a == 2) {
                m118087q(viewM118077g2, pointerId);
            }
            int i13 = this.f157572h[pointerId];
        } else if (actionMasked == 1) {
            m118071a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                m118071a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x5 = motionEvent.getX(actionIndex);
                float y14 = motionEvent.getY(actionIndex);
                m118082l(x5, y14, pointerId2);
                int i14 = this.f157565a;
                if (i14 == 0) {
                    int i15 = this.f157572h[pointerId2];
                } else if (i14 == 2 && (viewM118077g = m118077g((int) x5, (int) y14)) == this.f157582r) {
                    m118087q(viewM118077g, pointerId2);
                }
            } else if (actionMasked == 6) {
                m118074d(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f157568d != null && this.f157569e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i16 = 0; i16 < pointerCount; i16++) {
                int pointerId3 = motionEvent.getPointerId(i16);
                if (m118079i(pointerId3)) {
                    float x9 = motionEvent.getX(i16);
                    float y15 = motionEvent.getY(i16);
                    float f13 = x9 - this.f157568d[pointerId3];
                    float f14 = y15 - this.f157569e[pointerId3];
                    View viewM118077g3 = m118077g((int) x9, (int) y15);
                    boolean z4 = viewM118077g3 != null && m118073c(viewM118077g3, f13, f14);
                    if (!z4) {
                        Math.abs(f13);
                        Math.abs(f14);
                        int i17 = this.f157572h[pointerId3];
                        Math.abs(f14);
                        Math.abs(f13);
                        int i18 = this.f157572h[pointerId3];
                        Math.abs(f13);
                        Math.abs(f14);
                        int i19 = this.f157572h[pointerId3];
                        Math.abs(f14);
                        Math.abs(f13);
                        int i24 = this.f157572h[pointerId3];
                        if (this.f157565a != 1) {
                            break;
                        }
                    } else {
                        int left = viewM118077g3.getLeft();
                        AbstractC32131l abstractC32131l = this.f157581q;
                        int iMo72284f = abstractC32131l.mo72284f(viewM118077g3, ((int) f13) + left);
                        int top = viewM118077g3.getTop();
                        int iMo72285g = abstractC32131l.mo72285g(viewM118077g3, ((int) f14) + top);
                        int iMo72286k = abstractC32131l.mo72286k(viewM118077g3);
                        int iMo72287l = abstractC32131l.mo72287l();
                        if ((iMo72286k == 0 || (iMo72286k > 0 && iMo72284f == left)) && (iMo72287l == 0 || (iMo72287l > 0 && iMo72285g == top))) {
                            break;
                        }
                        Math.abs(f13);
                        Math.abs(f14);
                        int i110 = this.f157572h[pointerId3];
                        Math.abs(f14);
                        Math.abs(f13);
                        int i111 = this.f157572h[pointerId3];
                        Math.abs(f13);
                        Math.abs(f14);
                        int i112 = this.f157572h[pointerId3];
                        Math.abs(f14);
                        Math.abs(f13);
                        int i25 = this.f157572h[pointerId3];
                        if (this.f157565a != 1 || (z4 && m118087q(viewM118077g3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            m118083m(motionEvent);
        }
        return this.f157565a == 1;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m118087q(View view, int i13) {
        if (view == this.f157582r && this.f157567c == i13) {
            return true;
        }
        if (view == null || !this.f157581q.mo72291t(view, i13)) {
            return false;
        }
        this.f157567c = i13;
        m118072b(view, i13);
        return true;
    }
}
