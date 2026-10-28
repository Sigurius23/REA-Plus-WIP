package androidx.recyclerview.widget;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.recyclerview.widget.i0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1691i0 implements InterfaceC1756y1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1715o0 f6685a;

    public C1691i0(C1715o0 c1715o0) {
        this.f6685a = c1715o0;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1756y1
    /* JADX INFO: renamed from: b */
    public final boolean mo5222b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int iFindPointerIndex;
        C1715o0 c1715o0 = this.f6685a;
        ((GestureDetector) c1715o0.f6792x.f42881x).onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        C1695j0 c1695j0 = null;
        if (actionMasked == 0) {
            c1715o0.f6780l = motionEvent.getPointerId(0);
            c1715o0.f6772d = motionEvent.getX();
            c1715o0.f6773e = motionEvent.getY();
            VelocityTracker velocityTracker = c1715o0.f6788t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            c1715o0.f6788t = VelocityTracker.obtain();
            if (c1715o0.f6771c == null) {
                ArrayList arrayList = c1715o0.f6784p;
                if (!arrayList.isEmpty()) {
                    View viewM5288j = c1715o0.m5288j(motionEvent);
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        C1695j0 c1695j1 = (C1695j0) arrayList.get(size);
                        if (c1695j1.f6695e.itemView == viewM5288j) {
                            c1695j0 = c1695j1;
                            break;
                        }
                    }
                }
                if (c1695j0 != null) {
                    AbstractC1717o2 abstractC1717o2 = c1695j0.f6695e;
                    c1715o0.f6772d -= c1695j0.f6699i;
                    c1715o0.f6773e -= c1695j0.f6700j;
                    c1715o0.m5287i(abstractC1717o2, true);
                    if (c1715o0.f6769a.remove(abstractC1717o2.itemView)) {
                        c1715o0.f6781m.clearView(c1715o0.f6786r, abstractC1717o2);
                    }
                    c1715o0.m5292o(abstractC1717o2, c1695j0.f6696f);
                    c1715o0.m5293p(c1715o0.f6783o, 0, motionEvent);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            c1715o0.f6780l = -1;
            c1715o0.m5292o(null, 0);
        } else {
            int i13 = c1715o0.f6780l;
            if (i13 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i13)) >= 0) {
                c1715o0.m5285g(actionMasked, iFindPointerIndex, motionEvent);
            }
        }
        VelocityTracker velocityTracker2 = c1715o0.f6788t;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return c1715o0.f6771c != null;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1756y1
    /* JADX INFO: renamed from: d */
    public final void mo5223d(boolean z4) {
        if (z4) {
            this.f6685a.m5292o(null, 0);
        }
    }

    @Override // androidx.recyclerview.widget.InterfaceC1756y1
    public final void onTouchEvent(MotionEvent motionEvent) {
        C1715o0 c1715o0 = this.f6685a;
        RunnableC1758z runnableC1758z = c1715o0.f6787s;
        ((GestureDetector) c1715o0.f6792x.f42881x).onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = c1715o0.f6788t;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (c1715o0.f6780l == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int iFindPointerIndex = motionEvent.findPointerIndex(c1715o0.f6780l);
        if (iFindPointerIndex >= 0) {
            c1715o0.m5285g(actionMasked, iFindPointerIndex, motionEvent);
        }
        AbstractC1717o2 abstractC1717o2 = c1715o0.f6771c;
        if (abstractC1717o2 == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (iFindPointerIndex >= 0) {
                    c1715o0.m5293p(c1715o0.f6783o, iFindPointerIndex, motionEvent);
                    c1715o0.m5290m(abstractC1717o2);
                    c1715o0.f6786r.removeCallbacks(runnableC1758z);
                    runnableC1758z.run();
                    c1715o0.f6786r.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == c1715o0.f6780l) {
                    c1715o0.f6780l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    c1715o0.m5293p(c1715o0.f6783o, actionIndex, motionEvent);
                    return;
                }
                return;
            }
            VelocityTracker velocityTracker2 = c1715o0.f6788t;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        c1715o0.m5292o(null, 0);
        c1715o0.f6780l = -1;
    }
}
