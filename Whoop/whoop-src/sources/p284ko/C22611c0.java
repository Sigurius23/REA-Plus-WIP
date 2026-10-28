package p284ko;

import android.os.Looper;
import android.os.SystemClock;
import bb.C2919f;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import k33.ThreadFactoryC22176a;
import p036bq.RunnableC3543b;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;

/* JADX INFO: renamed from: ko.c0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C22611c0 {

    /* JADX INFO: renamed from: d */
    public static final C2919f f88954d = new C2919f(0, -9223372036854775807L, (byte) 0);

    /* JADX INFO: renamed from: e */
    public static final C2919f f88955e = new C2919f(2, -9223372036854775807L, (byte) 0);

    /* JADX INFO: renamed from: f */
    public static final C2919f f88956f = new C2919f(3, -9223372036854775807L, (byte) 0);

    /* JADX INFO: renamed from: a */
    public final ExecutorService f88957a;

    /* JADX INFO: renamed from: b */
    public HandlerC22642z f88958b;

    /* JADX INFO: renamed from: c */
    public IOException f88959c;

    public C22611c0(String str) {
        String strConcat = str.length() != 0 ? "ExoPlayer:Loader:".concat(str) : new String("ExoPlayer:Loader:");
        int i13 = AbstractC24567y.f95875a;
        this.f88957a = Executors.newSingleThreadExecutor(new ThreadFactoryC22176a(strConcat, 1));
    }

    /* JADX INFO: renamed from: a */
    public final void m65553a() {
        HandlerC22642z handlerC22642z = this.f88958b;
        AbstractC24543a.m71574j(handlerC22642z);
        handlerC22642z.m65589a(false);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m65554b() {
        return this.f88958b != null;
    }

    /* JADX INFO: renamed from: c */
    public final void m65555c(InterfaceC22609b0 interfaceC22609b0) {
        HandlerC22642z handlerC22642z = this.f88958b;
        if (handlerC22642z != null) {
            handlerC22642z.m65589a(true);
        }
        ExecutorService executorService = this.f88957a;
        if (interfaceC22609b0 != null) {
            executorService.execute(new RunnableC3543b(interfaceC22609b0, 14));
        }
        executorService.shutdown();
    }

    /* JADX INFO: renamed from: d */
    public final long m65556d(InterfaceC22607a0 interfaceC22607a0, InterfaceC22641y interfaceC22641y, int i13) {
        Looper looperMyLooper = Looper.myLooper();
        AbstractC24543a.m71574j(looperMyLooper);
        this.f88959c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HandlerC22642z handlerC22642z = new HandlerC22642z(this, looperMyLooper, interfaceC22607a0, interfaceC22641y, i13, jElapsedRealtime);
        AbstractC24543a.m71573i(this.f88958b == null);
        this.f88958b = handlerC22642z;
        handlerC22642z.f89092z = null;
        this.f88957a.execute(handlerC22642z);
        return jElapsedRealtime;
    }
}
