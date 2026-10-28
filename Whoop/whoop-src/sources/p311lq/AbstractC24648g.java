package p311lq;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p044c5.RunnableC4221m;
import p184h5.AbstractC16901p0;

/* JADX INFO: renamed from: lq.g */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC24648g extends AbstractC24650i {

    /* JADX INFO: renamed from: c */
    public RunnableC4221m f96404c;

    /* JADX INFO: renamed from: d */
    public OverScroller f96405d;

    /* JADX INFO: renamed from: e */
    public boolean f96406e;

    /* JADX INFO: renamed from: f */
    public int f96407f;

    /* JADX INFO: renamed from: g */
    public int f96408g;

    /* JADX INFO: renamed from: h */
    public int f96409h;

    /* JADX INFO: renamed from: i */
    public VelocityTracker f96410i;

    /* JADX WARN: Code duplicated, block: B:38:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fc A[ADDED_TO_REGION] */
    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: H */
    public final boolean mo15684H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z4;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        int i13 = 2;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f96407f);
                if (iFindPointerIndex != -1) {
                    int y13 = (int) motionEvent.getY(iFindPointerIndex);
                    int i14 = this.f96408g - y13;
                    this.f96408g = y13;
                    AppBarLayout appBarLayout = (AppBarLayout) view;
                    mo15663L(coordinatorLayout, view, mo15662K() - i14, appBarLayout.getTopInset() + (-appBarLayout.getDownNestedScrollRange()), 0);
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i15 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.f96407f = motionEvent.getPointerId(i15);
                    this.f96408g = (int) (motionEvent.getY(i15) + 0.5f);
                }
            }
            z4 = false;
            velocityTracker2 = this.f96410i;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.f96406e || z4;
        }
        VelocityTracker velocityTracker3 = this.f96410i;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.f96410i.computeCurrentVelocity(1000);
            float yVelocity = this.f96410i.getYVelocity(this.f96407f);
            AppBarLayout appBarLayout2 = (AppBarLayout) view;
            int i16 = -appBarLayout2.getTotalScrollRange();
            Runnable runnable = this.f96404c;
            if (runnable != null) {
                view.removeCallbacks(runnable);
                this.f96404c = null;
            }
            if (this.f96405d == null) {
                this.f96405d = new OverScroller(view.getContext());
            }
            this.f96405d.fling(0, m72002I(), 0, Math.round(yVelocity), 0, 0, i16, 0);
            if (this.f96405d.computeScrollOffset()) {
                RunnableC4221m runnableC4221m = new RunnableC4221m(this, coordinatorLayout, view, i13);
                this.f96404c = runnableC4221m;
                WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                view.postOnAnimation(runnableC4221m);
            } else {
                ((AppBarLayout.BaseBehavior) this).m15667S(coordinatorLayout, appBarLayout2);
                if (appBarLayout2.f20686L) {
                    appBarLayout2.m15652f(appBarLayout2.m15653g(AppBarLayout.BaseBehavior.m15656P(coordinatorLayout)));
                }
            }
            z4 = true;
        }
        this.f96406e = false;
        this.f96407f = -1;
        velocityTracker = this.f96410i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f96410i = null;
        }
        velocityTracker2 = this.f96410i;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f96406e) {
        }
        z4 = false;
        this.f96406e = false;
        this.f96407f = -1;
        velocityTracker = this.f96410i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f96410i = null;
        }
        velocityTracker2 = this.f96410i;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f96406e) {
        }
    }

    /* JADX INFO: renamed from: K */
    public abstract int mo15662K();

    /* JADX INFO: renamed from: L */
    public abstract int mo15663L(CoordinatorLayout coordinatorLayout, View view, int i13, int i14, int i15);

    /* JADX INFO: renamed from: M */
    public final void m71999M(CoordinatorLayout coordinatorLayout, View view, int i13) {
        mo15663L(coordinatorLayout, view, i13, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: o */
    public final boolean mo15686o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        View view2;
        int iFindPointerIndex;
        if (this.f96409h < 0) {
            this.f96409h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f96406e) {
            int i13 = this.f96407f;
            if (i13 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i13)) == -1) {
                return false;
            }
            int y13 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y13 - this.f96408g) > this.f96409h) {
                this.f96408g = y13;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f96407f = -1;
            int x3 = (int) motionEvent.getX();
            int y14 = (int) motionEvent.getY();
            WeakReference weakReference = ((AppBarLayout.BaseBehavior) this).f20708n;
            boolean z4 = (weakReference == null || !((view2 = (View) weakReference.get()) == null || !view2.isShown() || view2.canScrollVertically(-1))) && coordinatorLayout.m3664o(view, x3, y14);
            this.f96406e = z4;
            if (z4) {
                this.f96408g = y14;
                this.f96407f = motionEvent.getPointerId(0);
                if (this.f96410i == null) {
                    this.f96410i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f96405d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f96405d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f96410i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }
}
