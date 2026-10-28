package p454r9;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: r9.o */
/* JADX INFO: loaded from: classes5.dex */
public final class ChoreographerFrameCallbackC31090o implements Choreographer.FrameCallback, Handler.Callback {

    /* JADX INFO: renamed from: E */
    public static final ChoreographerFrameCallbackC31090o f128230E = new ChoreographerFrameCallbackC31090o();

    /* JADX INFO: renamed from: w */
    public volatile long f128231w = -9223372036854775807L;

    /* JADX INFO: renamed from: x */
    public final Handler f128232x;

    /* JADX INFO: renamed from: y */
    public Choreographer f128233y;

    /* JADX INFO: renamed from: z */
    public int f128234z;

    public ChoreographerFrameCallbackC31090o() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i13 = AbstractC38065t.f163031a;
        Handler handler = new Handler(looper, this);
        this.f128232x = handler;
        handler.sendEmptyMessage(1);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j7) {
        this.f128231w = j7;
        Choreographer choreographer = this.f128233y;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i13 = message.what;
        if (i13 == 1) {
            try {
                this.f128233y = Choreographer.getInstance();
            } catch (RuntimeException e5) {
                AbstractC38046a.m121827v("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e5);
            }
            return true;
        }
        if (i13 == 2) {
            Choreographer choreographer = this.f128233y;
            if (choreographer != null) {
                int i14 = this.f128234z + 1;
                this.f128234z = i14;
                if (i14 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i13 != 3) {
            return false;
        }
        Choreographer choreographer2 = this.f128233y;
        if (choreographer2 != null) {
            int i15 = this.f128234z - 1;
            this.f128234z = i15;
            if (i15 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f128231w = -9223372036854775807L;
            }
        }
        return true;
    }
}
