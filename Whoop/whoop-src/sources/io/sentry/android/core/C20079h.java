package io.sentry.android.core;

import androidx.fragment.app.RunnableC1283d;
import io.sentry.AbstractC20445o4;
import io.sentry.AbstractC20576u4;
import io.sentry.C20414l7;
import io.sentry.C20444o3;
import io.sentry.C20513q6;
import io.sentry.C20535s;
import io.sentry.C20625x2;
import io.sentry.C20628x5;
import io.sentry.EnumC20418m;
import io.sentry.EnumC20431n0;
import io.sentry.EnumC20436n5;
import io.sentry.EnumC20518r3;
import io.sentry.InterfaceC20308d1;
import io.sentry.InterfaceC20347h1;
import io.sentry.InterfaceC20406l;
import io.sentry.InterfaceC20507q0;
import io.sentry.InterfaceC20602v0;
import io.sentry.RunnableC20277c7;
import io.sentry.android.core.internal.util.C20116q;
import io.sentry.protocol.C20501v;
import io.sentry.transport.C20567q;
import io.sentry.transport.InterfaceC20566p;
import io.sentry.util.AbstractC20589k;
import io.sentry.util.C20579a;
import io.sentry.util.InterfaceC20583e;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p031b9.C2849l1;

/* JADX INFO: renamed from: io.sentry.android.core.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C20079h implements InterfaceC20507q0, InterfaceC20566p {

    /* JADX INFO: renamed from: E */
    public final C20121k0 f75407E;

    /* JADX INFO: renamed from: G */
    public final C20116q f75409G;

    /* JADX INFO: renamed from: J */
    public InterfaceC20308d1 f75412J;

    /* JADX INFO: renamed from: K */
    public Future f75413K;

    /* JADX INFO: renamed from: L */
    public InterfaceC20406l f75414L;

    /* JADX INFO: renamed from: N */
    public C20501v f75416N;

    /* JADX INFO: renamed from: O */
    public C20501v f75417O;

    /* JADX INFO: renamed from: P */
    public final AtomicBoolean f75418P;

    /* JADX INFO: renamed from: Q */
    public AbstractC20576u4 f75419Q;

    /* JADX INFO: renamed from: R */
    public volatile boolean f75420R;

    /* JADX INFO: renamed from: S */
    public boolean f75421S;

    /* JADX INFO: renamed from: T */
    public boolean f75422T;

    /* JADX INFO: renamed from: U */
    public int f75423U;

    /* JADX INFO: renamed from: V */
    public final C20579a f75424V;

    /* JADX INFO: renamed from: W */
    public final C20579a f75425W;

    /* JADX INFO: renamed from: w */
    public final InterfaceC20602v0 f75426w;

    /* JADX INFO: renamed from: x */
    public final String f75427x;

    /* JADX INFO: renamed from: y */
    public final int f75428y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC20583e f75429z;

    /* JADX INFO: renamed from: F */
    public boolean f75408F = false;

    /* JADX INFO: renamed from: H */
    public C20153s f75410H = null;

    /* JADX INFO: renamed from: I */
    public boolean f75411I = false;

    /* JADX INFO: renamed from: M */
    public final ArrayList f75415M = new ArrayList();

    public C20079h(C20121k0 c20121k0, C20116q c20116q, InterfaceC20602v0 interfaceC20602v0, String str, int i13, InterfaceC20583e interfaceC20583e) {
        C20501v c20501v = C20501v.f76802x;
        this.f75416N = c20501v;
        this.f75417O = c20501v;
        this.f75418P = new AtomicBoolean(false);
        this.f75419Q = new C20628x5();
        this.f75420R = true;
        this.f75421S = false;
        this.f75422T = false;
        this.f75423U = 0;
        this.f75424V = new C20579a();
        this.f75425W = new C20579a();
        this.f75426w = interfaceC20602v0;
        this.f75409G = c20116q;
        this.f75407E = c20121k0;
        this.f75427x = str;
        this.f75428y = i13;
        this.f75429z = interfaceC20583e;
    }

    @Override // io.sentry.InterfaceC20507q0
    /* JADX INFO: renamed from: a */
    public final void mo55947a(boolean z4) {
        C20535s c20535sM56711a = this.f75424V.m56711a();
        try {
            this.f75423U = 0;
            this.f75421S = true;
            if (z4) {
                m55954h(false);
                this.f75418P.set(true);
            }
            c20535sM56711a.close();
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // io.sentry.InterfaceC20507q0
    /* JADX INFO: renamed from: b */
    public final void mo55948b(EnumC20518r3 enumC20518r3, C20414l7 c20414l7) {
        C20535s c20535sM56711a = this.f75424V.m56711a();
        try {
            if (this.f75420R) {
                double dM56721c = AbstractC20589k.m56722a().m56721c();
                Double profileSessionSampleRate = c20414l7.f76494a.getProfileSessionSampleRate();
                this.f75422T = profileSessionSampleRate != null && profileSessionSampleRate.doubleValue() >= dM56721c;
                this.f75420R = false;
            }
            if (!this.f75422T) {
                this.f75426w.mo16066m(EnumC20436n5.DEBUG, "Profiler was not started due to sampling decision.", new Object[0]);
                c20535sM56711a.close();
                return;
            }
            int i13 = AbstractC20076g.f75400a[enumC20518r3.ordinal()];
            if (i13 == 1) {
                if (this.f75423U < 0) {
                    this.f75423U = 0;
                }
                this.f75423U++;
            } else if (i13 == 2 && this.f75411I) {
                this.f75426w.mo16066m(EnumC20436n5.DEBUG, "Profiler is already running.", new Object[0]);
                c20535sM56711a.close();
                return;
            }
            if (!this.f75411I) {
                this.f75426w.mo16066m(EnumC20436n5.DEBUG, "Started Profiler.", new Object[0]);
                m55953g();
            }
            c20535sM56711a.close();
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // io.sentry.InterfaceC20507q0
    /* JADX INFO: renamed from: c */
    public final void mo55949c() {
        this.f75420R = true;
    }

    @Override // io.sentry.InterfaceC20507q0
    /* JADX INFO: renamed from: d */
    public final void mo55950d(EnumC20518r3 enumC20518r3) {
        C20535s c20535sM56711a = this.f75424V.m56711a();
        try {
            int i13 = AbstractC20076g.f75400a[enumC20518r3.ordinal()];
            if (i13 == 1) {
                int i14 = this.f75423U - 1;
                this.f75423U = i14;
                if (i14 > 0) {
                    c20535sM56711a.close();
                    return;
                } else {
                    if (i14 < 0) {
                        this.f75423U = 0;
                    }
                    this.f75421S = true;
                }
            } else if (i13 == 2) {
                this.f75421S = true;
            }
            c20535sM56711a.close();
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // io.sentry.InterfaceC20507q0
    /* JADX INFO: renamed from: e */
    public final C20501v mo55951e() {
        return this.f75416N;
    }

    /* JADX INFO: renamed from: f */
    public final void m55952f() {
        InterfaceC20308d1 interfaceC20308d1 = this.f75412J;
        if ((interfaceC20308d1 == null || interfaceC20308d1 == C20625x2.f77169b) && AbstractC20445o4.m56638b() != C20625x2.f77169b) {
            this.f75412J = AbstractC20445o4.m56638b();
            this.f75414L = AbstractC20445o4.m56638b().mo56432l().getCompositePerformanceCollector();
            C20567q c20567qMo56430j = this.f75412J.mo56430j();
            if (c20567qMo56430j != null) {
                c20567qMo56430j.f77047z.add(this);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m55953g() {
        m55952f();
        this.f75407E.getClass();
        boolean z4 = this.f75408F;
        InterfaceC20602v0 interfaceC20602v0 = this.f75426w;
        if (!z4) {
            this.f75408F = true;
            String str = this.f75427x;
            if (str == null) {
                interfaceC20602v0.mo16066m(EnumC20436n5.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            } else {
                int i13 = this.f75428y;
                if (i13 <= 0) {
                    interfaceC20602v0.mo16066m(EnumC20436n5.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i13));
                } else {
                    this.f75410H = new C20153s(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / i13, this.f75409G, null, this.f75426w);
                }
            }
        }
        if (this.f75410H == null) {
            return;
        }
        InterfaceC20308d1 interfaceC20308d1 = this.f75412J;
        if (interfaceC20308d1 != null) {
            C20567q c20567qMo56430j = interfaceC20308d1.mo56430j();
            if (c20567qMo56430j != null && (c20567qMo56430j.m56688h(EnumC20418m.All) || c20567qMo56430j.m56688h(EnumC20418m.ProfileChunkUi))) {
                interfaceC20602v0.mo16066m(EnumC20436n5.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
                m55954h(false);
                return;
            } else {
                if (this.f75412J.mo56432l().getConnectionStatusProvider().mo55992l() == EnumC20431n0.DISCONNECTED) {
                    interfaceC20602v0.mo16066m(EnumC20436n5.WARNING, "Device is offline. Stopping profiler.", new Object[0]);
                    m55954h(false);
                    return;
                }
                this.f75419Q = this.f75412J.mo56432l().getDateProvider().now();
            }
        } else {
            this.f75419Q = new C20628x5();
        }
        if (this.f75410H.m56056c() == null) {
            return;
        }
        this.f75411I = true;
        C20501v c20501v = this.f75416N;
        C20501v c20501v2 = C20501v.f76802x;
        if (c20501v.equals(c20501v2)) {
            this.f75416N = new C20501v();
        }
        if (this.f75417O.equals(c20501v2)) {
            this.f75417O = new C20501v();
        }
        InterfaceC20406l interfaceC20406l = this.f75414L;
        if (interfaceC20406l != null) {
            interfaceC20406l.mo56620f(this.f75417O.toString());
        }
        try {
            this.f75413K = ((InterfaceC20347h1) this.f75429z.mo19991j()).mo56218c(new RunnableC20277c7(this, 3), 60000L);
        } catch (RejectedExecutionException e5) {
            interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Failed to schedule profiling chunk finish. Did you call Sentry.close()?", e5);
            this.f75421S = true;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m55954h(boolean z4) {
        m55952f();
        C20535s c20535sM56711a = this.f75424V.m56711a();
        try {
            Future future = this.f75413K;
            if (future != null) {
                future.cancel(true);
            }
            if (this.f75410H != null && this.f75411I) {
                this.f75407E.getClass();
                InterfaceC20406l interfaceC20406l = this.f75414L;
                C2849l1 c2849l1M56054a = this.f75410H.m56054a(interfaceC20406l != null ? interfaceC20406l.mo56616b(this.f75417O.toString()) : null, false);
                InterfaceC20602v0 interfaceC20602v0 = this.f75426w;
                if (c2849l1M56054a == null) {
                    interfaceC20602v0.mo16066m(EnumC20436n5.ERROR, "An error occurred while collecting a profile chunk, and it won't be sent.", new Object[0]);
                } else {
                    C20535s c20535sM56711a2 = this.f75425W.m56711a();
                    try {
                        this.f75415M.add(new C20444o3(this.f75416N, this.f75417O, (Map) c2849l1M56054a.f11311F, (File) c2849l1M56054a.f11310E, this.f75419Q));
                        c20535sM56711a2.close();
                    } catch (Throwable th3) {
                        try {
                            c20535sM56711a2.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                }
                this.f75411I = false;
                this.f75417O = C20501v.f76802x;
                InterfaceC20308d1 interfaceC20308d1 = this.f75412J;
                if (interfaceC20308d1 != null) {
                    C20513q6 c20513q6Mo56432l = interfaceC20308d1.mo56432l();
                    try {
                        c20513q6Mo56432l.getExecutorService().submit(new RunnableC1283d(this, c20513q6Mo56432l, interfaceC20308d1, 12));
                    } catch (Throwable th5) {
                        c20513q6Mo56432l.getLogger().mo16060j(EnumC20436n5.DEBUG, "Failed to send profile chunks.", th5);
                    }
                }
                if (!z4 || this.f75421S) {
                    this.f75416N = C20501v.f76802x;
                    interfaceC20602v0.mo16066m(EnumC20436n5.DEBUG, "Profile chunk finished.", new Object[0]);
                } else {
                    interfaceC20602v0.mo16066m(EnumC20436n5.DEBUG, "Profile chunk finished. Starting a new one.", new Object[0]);
                    m55953g();
                }
                c20535sM56711a.close();
                return;
            }
            C20501v c20501v = C20501v.f76802x;
            this.f75416N = c20501v;
            this.f75417O = c20501v;
            c20535sM56711a.close();
        } catch (Throwable th6) {
            try {
                c20535sM56711a.close();
                throw th6;
            } catch (Throwable th7) {
                th6.addSuppressed(th7);
                throw th6;
            }
        }
    }

    @Override // io.sentry.transport.InterfaceC20566p
    /* JADX INFO: renamed from: k */
    public final void mo55955k(C20567q c20567q) {
        if (c20567q.m56688h(EnumC20418m.All) || c20567q.m56688h(EnumC20418m.ProfileChunkUi)) {
            this.f75426w.mo16066m(EnumC20436n5.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
            m55954h(false);
        }
    }
}
