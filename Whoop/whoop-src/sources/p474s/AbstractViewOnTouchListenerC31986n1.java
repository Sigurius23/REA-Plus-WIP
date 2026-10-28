package p474s;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import p444r.InterfaceC30806b0;

/* JADX INFO: renamed from: s.n1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractViewOnTouchListenerC31986n1 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: E */
    public RunnableC31982m1 f132779E;

    /* JADX INFO: renamed from: F */
    public RunnableC31982m1 f132780F;

    /* JADX INFO: renamed from: G */
    public boolean f132781G;

    /* JADX INFO: renamed from: H */
    public int f132782H;

    /* JADX INFO: renamed from: I */
    public final int[] f132783I = new int[2];

    /* JADX INFO: renamed from: w */
    public final float f132784w;

    /* JADX INFO: renamed from: x */
    public final int f132785x;

    /* JADX INFO: renamed from: y */
    public final int f132786y;

    /* JADX INFO: renamed from: z */
    public final View f132787z;

    public AbstractViewOnTouchListenerC31986n1(View view) {
        this.f132787z = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f132784w = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f132785x = tapTimeout;
        this.f132786y = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m99495a() {
        RunnableC31982m1 runnableC31982m1 = this.f132780F;
        View view = this.f132787z;
        if (runnableC31982m1 != null) {
            view.removeCallbacks(runnableC31982m1);
        }
        RunnableC31982m1 runnableC31982m2 = this.f132779E;
        if (runnableC31982m2 != null) {
            view.removeCallbacks(runnableC31982m2);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract InterfaceC30806b0 mo94781b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo94782c();

    /* JADX INFO: renamed from: d */
    public boolean mo94783d() {
        InterfaceC30806b0 interfaceC30806b0Mo94781b = mo94781b();
        if (interfaceC30806b0Mo94781b == null || !interfaceC30806b0Mo94781b.mo94784a()) {
            return true;
        }
        interfaceC30806b0Mo94781b.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z4;
        C31974k1 c31974k1Mo94786m;
        boolean z13 = this.f132781G;
        View view2 = this.f132787z;
        if (z13) {
            InterfaceC30806b0 interfaceC30806b0Mo94781b = mo94781b();
            if (interfaceC30806b0Mo94781b != null && interfaceC30806b0Mo94781b.mo94784a() && (c31974k1Mo94786m = interfaceC30806b0Mo94781b.mo94786m()) != null && c31974k1Mo94786m.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f132783I;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                c31974k1Mo94786m.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zM99465b = c31974k1Mo94786m.m99465b(motionEventObtainNoHistory, this.f132782H);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z14 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zM99465b && z14) {
                    z4 = true;
                } else if (mo94783d()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
            } else if (mo94783d()) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f132782H = motionEvent.getPointerId(0);
                    if (this.f132779E == null) {
                        this.f132779E = new RunnableC31982m1(this, 0);
                    }
                    view2.postDelayed(this.f132779E, this.f132785x);
                    if (this.f132780F == null) {
                        this.f132780F = new RunnableC31982m1(this, 1);
                    }
                    view2.postDelayed(this.f132780F, this.f132786y);
                } else if (actionMasked2 == 1) {
                    m99495a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f132782H);
                    if (iFindPointerIndex >= 0) {
                        float x3 = motionEvent.getX(iFindPointerIndex);
                        float y13 = motionEvent.getY(iFindPointerIndex);
                        float f13 = this.f132784w;
                        float f14 = -f13;
                        if (x3 < f14 || y13 < f14 || x3 >= (view2.getRight() - view2.getLeft()) + f13 || y13 >= (view2.getBottom() - view2.getTop()) + f13) {
                            m99495a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (mo94782c()) {
                                z4 = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    m99495a();
                }
                z4 = false;
            } else {
                z4 = false;
            }
            if (z4) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f132781G = z4;
        return z4 || z13;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f132781G = false;
        this.f132782H = -1;
        RunnableC31982m1 runnableC31982m1 = this.f132779E;
        if (runnableC31982m1 != null) {
            this.f132787z.removeCallbacks(runnableC31982m1);
        }
    }
}
