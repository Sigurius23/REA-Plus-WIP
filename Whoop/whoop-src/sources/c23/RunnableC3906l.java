package c23;

import android.content.Context;
import android.widget.OverScroller;

/* JADX INFO: renamed from: c23.l */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3906l implements Runnable {

    /* JADX INFO: renamed from: w */
    public final OverScroller f15960w;

    /* JADX INFO: renamed from: x */
    public int f15961x;

    /* JADX INFO: renamed from: y */
    public int f15962y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ ViewOnTouchListenerC3909o f15963z;

    public RunnableC3906l(ViewOnTouchListenerC3909o viewOnTouchListenerC3909o, Context context) {
        this.f15963z = viewOnTouchListenerC3909o;
        this.f15960w = new OverScroller(context);
    }

    @Override // java.lang.Runnable
    public final void run() {
        OverScroller overScroller = this.f15960w;
        if (!overScroller.isFinished() && overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            ViewOnTouchListenerC3909o viewOnTouchListenerC3909o = this.f15963z;
            viewOnTouchListenerC3909o.f15975M.postTranslate(this.f15961x - currX, this.f15962y - currY);
            viewOnTouchListenerC3909o.m11890a();
            this.f15961x = currX;
            this.f15962y = currY;
            viewOnTouchListenerC3909o.f15987w.postDelayed(this, 16L);
        }
    }
}
