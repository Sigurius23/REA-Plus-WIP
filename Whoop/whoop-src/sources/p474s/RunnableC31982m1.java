package p474s;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: s.m1 */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC31982m1 implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f132766w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractViewOnTouchListenerC31986n1 f132767x;

    public /* synthetic */ RunnableC31982m1(AbstractViewOnTouchListenerC31986n1 abstractViewOnTouchListenerC31986n1, int i13) {
        this.f132766w = i13;
        this.f132767x = abstractViewOnTouchListenerC31986n1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f132766w) {
            case 0:
                ViewParent parent = this.f132767x.f132787z.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                AbstractViewOnTouchListenerC31986n1 abstractViewOnTouchListenerC31986n1 = this.f132767x;
                abstractViewOnTouchListenerC31986n1.m99495a();
                View view = abstractViewOnTouchListenerC31986n1.f132787z;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC31986n1.mo94782c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC31986n1.f132781G = true;
                    break;
                }
                break;
        }
    }
}
