package p284ko;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import bb.C2919f;
import com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import live.hms.video.error.ErrorCodes;
import p309lo.AbstractC24543a;

/* JADX INFO: renamed from: ko.z */
/* JADX INFO: loaded from: classes6.dex */
public final class HandlerC22642z extends Handler implements Runnable {

    /* JADX INFO: renamed from: E */
    public int f89084E;

    /* JADX INFO: renamed from: F */
    public Thread f89085F;

    /* JADX INFO: renamed from: G */
    public boolean f89086G;

    /* JADX INFO: renamed from: H */
    public volatile boolean f89087H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ C22611c0 f89088I;

    /* JADX INFO: renamed from: w */
    public final int f89089w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC22607a0 f89090x;

    /* JADX INFO: renamed from: y */
    public InterfaceC22641y f89091y;

    /* JADX INFO: renamed from: z */
    public IOException f89092z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC22642z(C22611c0 c22611c0, Looper looper, InterfaceC22607a0 interfaceC22607a0, InterfaceC22641y interfaceC22641y, int i13, long j7) {
        super(looper);
        this.f89088I = c22611c0;
        this.f89090x = interfaceC22607a0;
        this.f89091y = interfaceC22641y;
        this.f89089w = i13;
    }

    /* JADX INFO: renamed from: a */
    public final void m65589a(boolean z4) {
        this.f89087H = z4;
        this.f89092z = null;
        if (hasMessages(0)) {
            this.f89086G = true;
            removeMessages(0);
            if (!z4) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                try {
                    this.f89086G = true;
                    this.f89090x.mo65550c();
                    Thread thread = this.f89085F;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        if (z4) {
            this.f89088I.f88958b = null;
            SystemClock.elapsedRealtime();
            InterfaceC22641y interfaceC22641y = this.f89091y;
            interfaceC22641y.getClass();
            interfaceC22641y.mo65587p(this.f89090x, true);
            this.f89091y = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f89087H) {
            return;
        }
        int i13 = message.what;
        if (i13 == 0) {
            this.f89092z = null;
            C22611c0 c22611c0 = this.f89088I;
            ExecutorService executorService = c22611c0.f88957a;
            HandlerC22642z handlerC22642z = c22611c0.f88958b;
            handlerC22642z.getClass();
            executorService.execute(handlerC22642z);
            return;
        }
        if (i13 == 3) {
            throw ((Error) message.obj);
        }
        this.f89088I.f88958b = null;
        SystemClock.elapsedRealtime();
        InterfaceC22641y interfaceC22641y = this.f89091y;
        interfaceC22641y.getClass();
        if (this.f89086G) {
            interfaceC22641y.mo65587p(this.f89090x, false);
            return;
        }
        int i14 = message.what;
        if (i14 == 1) {
            try {
                interfaceC22641y.mo65586c(this.f89090x);
                return;
            } catch (RuntimeException e5) {
                AbstractC24543a.m71578n("LoadTask", "Unexpected exception handling load completed", e5);
                this.f89088I.f88959c = new Loader$UnexpectedLoaderException(e5);
                return;
            }
        }
        if (i14 != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f89092z = iOException;
        int i15 = this.f89084E + 1;
        this.f89084E = i15;
        C2919f c2919fMo65588q = interfaceC22641y.mo65588q(this.f89090x, iOException, i15);
        int i16 = c2919fMo65588q.f11740a;
        if (i16 == 3) {
            this.f89088I.f88959c = this.f89092z;
            return;
        }
        if (i16 != 2) {
            if (i16 == 1) {
                this.f89084E = 1;
            }
            long jMin = c2919fMo65588q.f11741b;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.f89084E - 1) * 1000, ErrorCodes.WebsocketMethodErrors.cServerErrors);
            }
            C22611c0 c22611c1 = this.f89088I;
            AbstractC24543a.m71573i(c22611c1.f88958b == null);
            c22611c1.f88958b = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(0, jMin);
            } else {
                this.f89092z = null;
                c22611c1.f88957a.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        try {
            synchronized (this) {
                z4 = this.f89086G;
                this.f89085F = Thread.currentThread();
            }
            if (!z4) {
                String simpleName = this.f89090x.getClass().getSimpleName();
                AbstractC24543a.m71567c(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                try {
                    this.f89090x.mo65549b();
                    AbstractC24543a.m71579o();
                } catch (Throwable th3) {
                    AbstractC24543a.m71579o();
                    throw th3;
                }
            }
            synchronized (this) {
                this.f89085F = null;
                Thread.interrupted();
            }
            if (this.f89087H) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e5) {
            if (this.f89087H) {
                return;
            }
            obtainMessage(2, e5).sendToTarget();
        } catch (Error e13) {
            if (!this.f89087H) {
                AbstractC24543a.m71578n("LoadTask", "Unexpected error loading stream", e13);
                obtainMessage(3, e13).sendToTarget();
            }
            throw e13;
        } catch (Exception e14) {
            if (this.f89087H) {
                return;
            }
            AbstractC24543a.m71578n("LoadTask", "Unexpected exception loading stream", e14);
            obtainMessage(2, new Loader$UnexpectedLoaderException(e14)).sendToTarget();
        } catch (OutOfMemoryError e15) {
            if (this.f89087H) {
                return;
            }
            AbstractC24543a.m71578n("LoadTask", "OutOfMemory error loading stream", e15);
            obtainMessage(2, new Loader$UnexpectedLoaderException(e15)).sendToTarget();
        }
    }
}
