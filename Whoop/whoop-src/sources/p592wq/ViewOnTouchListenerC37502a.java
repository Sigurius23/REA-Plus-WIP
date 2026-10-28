package p592wq;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: wq.a */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewOnTouchListenerC37502a implements View.OnTouchListener {

    /* JADX INFO: renamed from: w */
    public final Dialog f160409w;

    /* JADX INFO: renamed from: x */
    public final int f160410x;

    /* JADX INFO: renamed from: y */
    public final int f160411y;

    public ViewOnTouchListenerC37502a(Dialog dialog, Rect rect) {
        this.f160409w = dialog;
        this.f160410x = rect.left;
        this.f160411y = rect.top;
        ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f160410x;
        int width = viewFindViewById.getWidth() + left;
        int top = viewFindViewById.getTop() + this.f160411y;
        if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        view.performClick();
        return this.f160409w.onTouchEvent(motionEventObtain);
    }
}
