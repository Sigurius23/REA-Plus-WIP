package androidx.recyclerview.widget;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.SwipeReplyCallback;

/* JADX INFO: renamed from: androidx.recyclerview.widget.n0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1711n0 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: w */
    public boolean f6752w = true;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C1715o0 f6753x;

    public C1711n0(C1715o0 c1715o0) {
        this.f6753x = c1715o0;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View viewM5288j;
        AbstractC1717o2 childViewHolder;
        C1715o0 c1715o0 = this.f6753x;
        SwipeReplyCallback swipeReplyCallback = c1715o0.f6781m;
        if (this.f6752w && (viewM5288j = c1715o0.m5288j(motionEvent)) != null && (childViewHolder = c1715o0.f6786r.getChildViewHolder(viewM5288j)) != null && swipeReplyCallback.hasDragFlag(c1715o0.f6786r, childViewHolder)) {
            int pointerId = motionEvent.getPointerId(0);
            int i13 = c1715o0.f6780l;
            if (pointerId == i13) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i13);
                float x3 = motionEvent.getX(iFindPointerIndex);
                float y13 = motionEvent.getY(iFindPointerIndex);
                c1715o0.f6772d = x3;
                c1715o0.f6773e = y13;
                c1715o0.f6777i = 0.0f;
                c1715o0.f6776h = 0.0f;
                swipeReplyCallback.getClass();
                c1715o0.m5292o(childViewHolder, 2);
            }
        }
    }
}
