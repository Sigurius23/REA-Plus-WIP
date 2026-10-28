package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Handler;
import android.os.SystemClock;
import hg3.AbstractC17269i;
import io.sentry.AbstractC20445o4;
import io.sentry.C20321e5;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import io.sentry.RunnableC20277c7;
import io.sentry.exception.ExceptionMechanismException;
import io.sentry.protocol.C20490n;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.AbstractC11266d;
import p047c9.C4312c;
import p213i7.C18194g;

/* JADX INFO: renamed from: io.sentry.android.core.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C20049a extends Thread {

    /* JADX INFO: renamed from: E */
    public final long f75304E;

    /* JADX INFO: renamed from: F */
    public final long f75305F;

    /* JADX INFO: renamed from: G */
    public final InterfaceC20602v0 f75306G;

    /* JADX INFO: renamed from: H */
    public volatile long f75307H;

    /* JADX INFO: renamed from: I */
    public final AtomicBoolean f75308I;

    /* JADX INFO: renamed from: J */
    public final Context f75309J;

    /* JADX INFO: renamed from: K */
    public final RunnableC20277c7 f75310K;

    /* JADX INFO: renamed from: w */
    public final boolean f75311w;

    /* JADX INFO: renamed from: x */
    public final C4312c f75312x;

    /* JADX INFO: renamed from: y */
    public final C20121k0 f75313y;

    /* JADX INFO: renamed from: z */
    public final C18194g f75314z;

    public C20049a(long j7, boolean z4, C4312c c4312c, InterfaceC20602v0 interfaceC20602v0, Context context) {
        C18194g c18194g = new C18194g(16);
        C20121k0 c20121k0 = new C20121k0();
        super("|ANR-WatchDog|");
        this.f75307H = 0L;
        this.f75308I = new AtomicBoolean(false);
        this.f75314z = c18194g;
        this.f75305F = j7;
        this.f75304E = 500L;
        this.f75311w = z4;
        this.f75312x = c4312c;
        this.f75306G = interfaceC20602v0;
        this.f75313y = c20121k0;
        this.f75309J = context;
        this.f75310K = new RunnableC20277c7(this, c18194g);
        if (j7 < 1000) {
            throw new IllegalArgumentException(String.format("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", 1000L));
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        this.f75310K.run();
        while (!isInterrupted()) {
            ((Handler) this.f75313y.f75591a).post(this.f75310K);
            try {
                Thread.sleep(this.f75304E);
                this.f75314z.getClass();
                if (SystemClock.uptimeMillis() - this.f75307H > this.f75305F) {
                    if (this.f75311w || !(Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        ActivityManager activityManager = (ActivityManager) this.f75309J.getSystemService("activity");
                        if (activityManager != null) {
                            try {
                                processesInErrorState = activityManager.getProcessesInErrorState();
                            } catch (Throwable th3) {
                                this.f75306G.mo16060j(EnumC20436n5.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th3);
                                processesInErrorState = null;
                            }
                            if (processesInErrorState != null) {
                                Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (it.next().condition == 2) {
                                        }
                                    }
                                }
                            }
                        }
                        if (this.f75308I.compareAndSet(false, true)) {
                            ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(AbstractC11266d.m30457k(this.f75305F, " ms.", new StringBuilder("Application Not Responding for at least ")), ((Handler) this.f75313y.f75591a).getLooper().getThread());
                            C4312c c4312c = this.f75312x;
                            Object obj = c4312c.f17506x;
                            SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) c4312c.f17507y;
                            C20049a c20049a = AnrIntegration.f75227E;
                            sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.INFO, "ANR triggered with message: %s", applicationNotResponding.getMessage());
                            boolean zEquals = Boolean.TRUE.equals(C20071e0.f75391E.f75395z);
                            String strM30461o = "ANR for at least " + sentryAndroidOptions.getAnrTimeoutIntervalMillis() + " ms.";
                            if (zEquals) {
                                strM30461o = AbstractC11266d.m30461o("Background ", strM30461o);
                            }
                            Thread thread = applicationNotResponding.f75244w;
                            ApplicationNotResponding applicationNotResponding2 = thread == null ? new ApplicationNotResponding(strM30461o) : new ApplicationNotResponding(strM30461o, thread);
                            C20490n c20490n = new C20490n();
                            c20490n.f76740w = "ANR";
                            C20321e5 c20321e5 = new C20321e5(new ExceptionMechanismException(c20490n, applicationNotResponding2, thread, true));
                            c20321e5.f76305U = EnumC20436n5.ERROR;
                            AbstractC20445o4.m56638b().mo56442v(c20321e5, AbstractC17269i.m48858C(new C20165w(zEquals)));
                        }
                    } else {
                        this.f75306G.mo16066m(EnumC20436n5.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.f75308I.set(true);
                    }
                }
            } catch (InterruptedException e5) {
                try {
                    Thread.currentThread().interrupt();
                    this.f75306G.mo16066m(EnumC20436n5.WARNING, "Interrupted: %s", e5.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.f75306G.mo16066m(EnumC20436n5.WARNING, "Failed to interrupt due to SecurityException: %s", e5.getMessage());
                    return;
                }
            }
        }
    }
}
