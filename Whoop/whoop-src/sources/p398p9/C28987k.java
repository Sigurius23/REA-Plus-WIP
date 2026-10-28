package p398p9;

import android.os.Looper;
import android.os.SystemClock;
import bb.C2919f;
import java.io.IOException;
import java.util.concurrent.Executors;
import k33.ThreadFactoryC22176a;
import live.hms.video.factories.C24148c;
import p036bq.RunnableC3543b;
import p418q9.ExecutorC30066a;
import p607x8.AbstractC38065t;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: p9.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C28987k implements InterfaceC28988l {

    /* JADX INFO: renamed from: w */
    public final ExecutorC30066a f117257w;

    /* JADX INFO: renamed from: x */
    public HandlerC28984h f117258x;

    /* JADX INFO: renamed from: y */
    public IOException f117259y;

    /* JADX INFO: renamed from: z */
    public static final C2919f f117256z = new C2919f(2, -9223372036854775807L, (byte) 0);

    /* JADX INFO: renamed from: E */
    public static final C2919f f117255E = new C2919f(3, -9223372036854775807L, (byte) 0);

    /* JADX WARN: Illegal instructions before constructor call */
    public C28987k(String str) {
        String strConcat = "ExoPlayer:Loader:".concat(str);
        int i13 = AbstractC38065t.f163031a;
        this(new ExecutorC30066a(Executors.newSingleThreadExecutor(new ThreadFactoryC22176a(strConcat, 2)), new C24148c(25)));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m88007a() {
        return this.f117258x != null;
    }

    /* JADX INFO: renamed from: b */
    public final void m88008b(InterfaceC28986j interfaceC28986j) {
        HandlerC28984h handlerC28984h = this.f117258x;
        if (handlerC28984h != null) {
            handlerC28984h.m88005a(true);
        }
        ExecutorC30066a executorC30066a = this.f117257w;
        if (interfaceC28986j != null) {
            executorC30066a.execute(new RunnableC3543b(interfaceC28986j, 20));
        }
        executorC30066a.f122680x.accept(executorC30066a.f122679w);
    }

    @Override // p398p9.InterfaceC28988l
    /* JADX INFO: renamed from: c */
    public final void mo36136c() throws IOException {
        IOException iOException = this.f117259y;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC28984h handlerC28984h = this.f117258x;
        if (handlerC28984h != null) {
            int i13 = handlerC28984h.f117251w;
            IOException iOException2 = handlerC28984h.f117245E;
            if (iOException2 != null && handlerC28984h.f117246F > i13) {
                throw iOException2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m88009d(InterfaceC28985i interfaceC28985i, InterfaceC28983g interfaceC28983g, int i13) {
        Looper looperMyLooper = Looper.myLooper();
        AbstractC35849g.m113808j(looperMyLooper);
        this.f117259y = null;
        HandlerC28984h handlerC28984h = new HandlerC28984h(this, looperMyLooper, interfaceC28985i, interfaceC28983g, i13, SystemClock.elapsedRealtime());
        AbstractC35849g.m113807i(this.f117258x == null);
        this.f117258x = handlerC28984h;
        handlerC28984h.m88006b();
    }

    public C28987k(ExecutorC30066a executorC30066a) {
        this.f117257w = executorC30066a;
    }
}
