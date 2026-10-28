package mo;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;

/* JADX INFO: renamed from: mo.o */
/* JADX INFO: loaded from: classes6.dex */
public final class ChoreographerFrameCallbackC25734o implements Choreographer.FrameCallback, Handler.Callback {

    /* JADX INFO: renamed from: E */
    public static final ChoreographerFrameCallbackC25734o f101403E = new ChoreographerFrameCallbackC25734o();

    /* JADX INFO: renamed from: w */
    public volatile long f101404w = -9223372036854775807L;

    /* JADX INFO: renamed from: x */
    public final Handler f101405x;

    /* JADX INFO: renamed from: y */
    public Choreographer f101406y;

    /* JADX INFO: renamed from: z */
    public int f101407z;

    public ChoreographerFrameCallbackC25734o() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i13 = AbstractC24567y.f95875a;
        Handler handler = new Handler(looper, this);
        this.f101405x = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j7) {
        this.f101404w = j7;
        Choreographer choreographer = this.f101406y;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i13 = message.what;
        if (i13 == 0) {
            try {
                this.f101406y = Choreographer.getInstance();
                return true;
            } catch (RuntimeException e5) {
                AbstractC24543a.m71564F("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e5);
                return true;
            }
        }
        if (i13 == 1) {
            Choreographer choreographer = this.f101406y;
            if (choreographer != null) {
                int i14 = this.f101407z + 1;
                this.f101407z = i14;
                if (i14 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        } else {
            if (i13 != 2) {
                return false;
            }
            Choreographer choreographer2 = this.f101406y;
            if (choreographer2 != null) {
                int i15 = this.f101407z - 1;
                this.f101407z = i15;
                if (i15 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f101404w = -9223372036854775807L;
                    return true;
                }
            }
        }
        return true;
    }
}
