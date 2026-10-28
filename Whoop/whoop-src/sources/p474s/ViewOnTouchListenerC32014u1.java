package p474s;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: s.u1 */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnTouchListenerC32014u1 implements View.OnTouchListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C32018v1 f132847w;

    public ViewOnTouchListenerC32014u1(C32018v1 c32018v1) {
        this.f132847w = c32018v1;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C32018v1 c32018v1 = this.f132847w;
        RunnableC32006s1 runnableC32006s1 = c32018v1.f132863R;
        Handler handler = c32018v1.f132867V;
        C32016v c32016v = c32018v1.f132871Z;
        int action = motionEvent.getAction();
        int x3 = (int) motionEvent.getX();
        int y13 = (int) motionEvent.getY();
        if (action == 0 && c32016v != null && c32016v.isShowing() && x3 >= 0 && x3 < c32016v.getWidth() && y13 >= 0 && y13 < c32016v.getHeight()) {
            handler.postDelayed(runnableC32006s1, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(runnableC32006s1);
        return false;
    }
}
