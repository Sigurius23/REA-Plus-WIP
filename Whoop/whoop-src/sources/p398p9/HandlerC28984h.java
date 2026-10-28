package p398p9;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import bb.C2919f;
import java.io.IOException;
import live.hms.video.error.ErrorCodes;
import p418q9.ExecutorC30066a;
import p607x8.AbstractC38046a;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: p9.h */
/* JADX INFO: loaded from: classes5.dex */
public final class HandlerC28984h extends Handler implements Runnable {

    /* JADX INFO: renamed from: E */
    public IOException f117245E;

    /* JADX INFO: renamed from: F */
    public int f117246F;

    /* JADX INFO: renamed from: G */
    public Thread f117247G;

    /* JADX INFO: renamed from: H */
    public boolean f117248H;

    /* JADX INFO: renamed from: I */
    public volatile boolean f117249I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ C28987k f117250J;

    /* JADX INFO: renamed from: w */
    public final int f117251w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC28985i f117252x;

    /* JADX INFO: renamed from: y */
    public final long f117253y;

    /* JADX INFO: renamed from: z */
    public InterfaceC28983g f117254z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC28984h(C28987k c28987k, Looper looper, InterfaceC28985i interfaceC28985i, InterfaceC28983g interfaceC28983g, int i13, long j7) {
        super(looper);
        this.f117250J = c28987k;
        this.f117252x = interfaceC28985i;
        this.f117254z = interfaceC28983g;
        this.f117251w = i13;
        this.f117253y = j7;
    }

    /* JADX INFO: renamed from: a */
    public final void m88005a(boolean z4) {
        this.f117249I = z4;
        this.f117245E = null;
        if (hasMessages(1)) {
            this.f117248H = true;
            removeMessages(1);
            if (!z4) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f117248H = true;
                    this.f117252x.mo68094c();
                    Thread thread = this.f117247G;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        if (z4) {
            this.f117250J.f117258x = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            InterfaceC28983g interfaceC28983g = this.f117254z;
            interfaceC28983g.getClass();
            interfaceC28983g.mo36138q(this.f117252x, jElapsedRealtime, jElapsedRealtime - this.f117253y, true);
            this.f117254z = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m88006b() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        InterfaceC28983g interfaceC28983g = this.f117254z;
        interfaceC28983g.getClass();
        interfaceC28983g.mo36140w(this.f117252x, jElapsedRealtime, this.f117246F);
        this.f117245E = null;
        C28987k c28987k = this.f117250J;
        ExecutorC30066a executorC30066a = c28987k.f117257w;
        HandlerC28984h handlerC28984h = c28987k.f117258x;
        handlerC28984h.getClass();
        executorC30066a.execute(handlerC28984h);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f117249I) {
            return;
        }
        int i13 = message.what;
        if (i13 == 1) {
            m88006b();
            return;
        }
        if (i13 == 4) {
            throw ((Error) message.obj);
        }
        this.f117250J.f117258x = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j7 = jElapsedRealtime - this.f117253y;
        InterfaceC28983g interfaceC28983g = this.f117254z;
        interfaceC28983g.getClass();
        if (this.f117248H) {
            interfaceC28983g.mo36138q(this.f117252x, jElapsedRealtime, j7, false);
            return;
        }
        int i14 = message.what;
        if (i14 == 2) {
            try {
                interfaceC28983g.mo36137p(this.f117252x, jElapsedRealtime, j7);
                return;
            } catch (RuntimeException e5) {
                AbstractC38046a.m121813h("LoadTask", "Unexpected exception handling load completed", e5);
                this.f117250J.f117259y = new Loader$UnexpectedLoaderException(e5);
                return;
            }
        }
        if (i14 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f117245E = iOException;
        int i15 = this.f117246F + 1;
        this.f117246F = i15;
        C2919f c2919fMo36139r = interfaceC28983g.mo36139r(this.f117252x, iOException, i15);
        int i16 = c2919fMo36139r.f11740a;
        if (i16 == 3) {
            this.f117250J.f117259y = this.f117245E;
            return;
        }
        if (i16 != 2) {
            if (i16 == 1) {
                this.f117246F = 1;
            }
            long jMin = c2919fMo36139r.f11741b;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.f117246F - 1) * 1000, ErrorCodes.WebsocketMethodErrors.cServerErrors);
            }
            C28987k c28987k = this.f117250J;
            AbstractC35849g.m113807i(c28987k.f117258x == null);
            c28987k.f117258x = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(1, jMin);
            } else {
                m88006b();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        try {
            synchronized (this) {
                z4 = this.f117248H;
                this.f117247G = Thread.currentThread();
            }
            if (!z4) {
                Trace.beginSection("load:".concat(this.f117252x.getClass().getSimpleName()));
                try {
                    this.f117252x.mo68093b();
                    Trace.endSection();
                } catch (Throwable th3) {
                    Trace.endSection();
                    throw th3;
                }
            }
            synchronized (this) {
                this.f117247G = null;
                Thread.interrupted();
            }
            if (this.f117249I) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e5) {
            if (this.f117249I) {
                return;
            }
            obtainMessage(3, e5).sendToTarget();
        } catch (Exception e13) {
            if (this.f117249I) {
                return;
            }
            AbstractC38046a.m121813h("LoadTask", "Unexpected exception loading stream", e13);
            obtainMessage(3, new Loader$UnexpectedLoaderException(e13)).sendToTarget();
        } catch (OutOfMemoryError e14) {
            if (this.f117249I) {
                return;
            }
            AbstractC38046a.m121813h("LoadTask", "OutOfMemory error loading stream", e14);
            obtainMessage(3, new Loader$UnexpectedLoaderException(e14)).sendToTarget();
        } catch (Error e15) {
            if (!this.f117249I) {
                AbstractC38046a.m121813h("LoadTask", "Unexpected error loading stream", e15);
                obtainMessage(4, e15).sendToTarget();
            }
            throw e15;
        }
    }
}
