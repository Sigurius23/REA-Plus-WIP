package io.sentry.android.core;

import android.content.Context;
import android.os.Build;
import com.whoop.service.network.model.UserSessionDto;
import hn.C17508p;
import io.sentry.AbstractC20445o4;
import io.sentry.C20513q6;
import io.sentry.C20535s;
import io.sentry.C20539s3;
import io.sentry.C20547t3;
import io.sentry.C20645z6;
import io.sentry.CallableC20346h0;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20432n1;
import io.sentry.InterfaceC20442o1;
import io.sentry.InterfaceC20602v0;
import io.sentry.android.core.internal.util.C20116q;
import io.sentry.util.C20579a;
import io.sentry.util.InterfaceC20583e;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p031b9.C2849l1;
import p085d9.C11803t;
import p249jc.AbstractC21598x;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.android.core.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C20159u implements InterfaceC20442o1 {

    /* JADX INFO: renamed from: E */
    public final int f75729E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC20583e f75730F;

    /* JADX INFO: renamed from: G */
    public final C20121k0 f75731G;

    /* JADX INFO: renamed from: H */
    public boolean f75732H;

    /* JADX INFO: renamed from: I */
    public final AtomicBoolean f75733I;

    /* JADX INFO: renamed from: J */
    public final C20116q f75734J;

    /* JADX INFO: renamed from: K */
    public volatile C20547t3 f75735K;

    /* JADX INFO: renamed from: L */
    public volatile C20153s f75736L;

    /* JADX INFO: renamed from: M */
    public long f75737M;

    /* JADX INFO: renamed from: N */
    public long f75738N;

    /* JADX INFO: renamed from: O */
    public Date f75739O;

    /* JADX INFO: renamed from: P */
    public final C20579a f75740P;

    /* JADX INFO: renamed from: w */
    public final Context f75741w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC20602v0 f75742x;

    /* JADX INFO: renamed from: y */
    public final String f75743y;

    /* JADX INFO: renamed from: z */
    public final boolean f75744z;

    public C20159u(Context context, SentryAndroidOptions sentryAndroidOptions, C20121k0 c20121k0, C20116q c20116q) {
        this(context, c20121k0, c20116q, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.isProfilingEnabled(), sentryAndroidOptions.getProfilingTracesHz(), new C17508p(sentryAndroidOptions, 15));
    }

    @Override // io.sentry.InterfaceC20442o1
    /* JADX INFO: renamed from: a */
    public final void mo56065a(InterfaceC20432n1 interfaceC20432n1) {
        if (this.f75733I.get() && this.f75735K == null) {
            C20535s c20535sM56711a = this.f75740P.m56711a();
            try {
                if (this.f75733I.get() && this.f75735K == null) {
                    this.f75735K = new C20547t3(interfaceC20432n1, Long.valueOf(this.f75737M), Long.valueOf(this.f75738N));
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
    }

    /* JADX INFO: renamed from: b */
    public final C20539s3 m56066b(String str, String str2, String str3, boolean z4, List list, C20513q6 c20513q6) {
        this.f75731G.getClass();
        int i13 = Build.VERSION.SDK_INT;
        if (this.f75736L != null) {
            C20535s c20535sM56711a = this.f75740P.m56711a();
            try {
                C20547t3 c20547t3 = this.f75735K;
                if (c20547t3 == null || !c20547t3.f77003w.equals(str2)) {
                    this.f75742x.mo16066m(EnumC20436n5.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", str, str3);
                    c20535sM56711a.close();
                    return null;
                }
                this.f75735K = null;
                c20535sM56711a.close();
                this.f75742x.mo16066m(EnumC20436n5.DEBUG, "Transaction %s (%s) finished.", str, str3);
                C2849l1 c2849l1M56054a = this.f75736L.m56054a(list, false);
                this.f75733I.set(false);
                if (c2849l1M56054a != null) {
                    long j7 = c2849l1M56054a.f11313x - this.f75737M;
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(c20547t3);
                    long j13 = c2849l1M56054a.f11313x;
                    long j14 = this.f75737M;
                    long j15 = c2849l1M56054a.f11314y;
                    long j16 = this.f75738N;
                    if (c20547t3.f76999E == null) {
                        c20547t3.f76999E = Long.valueOf(j13 - j14);
                        c20547t3.f77006z = Long.valueOf(c20547t3.f77006z.longValue() - j14);
                        c20547t3.f77001G = Long.valueOf(j15 - j16);
                        c20547t3.f77000F = Long.valueOf(c20547t3.f77000F.longValue() - j16);
                    }
                    Long l7 = c20513q6 instanceof SentryAndroidOptions ? C20130n0.m56031c(this.f75741w, (SentryAndroidOptions) c20513q6).f75624h : null;
                    String string = l7 != null ? Long.toString(l7.longValue()) : UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE;
                    String[] strArr = Build.SUPPORTED_ABIS;
                    File file = (File) c2849l1M56054a.f11310E;
                    Date date = this.f75739O;
                    String string2 = Long.toString(j7);
                    this.f75731G.getClass();
                    String str4 = (strArr == null || strArr.length <= 0) ? "" : strArr[0];
                    CallableC20346h0 callableC20346h0 = new CallableC20346h0(3);
                    this.f75731G.getClass();
                    String str5 = Build.MANUFACTURER;
                    this.f75731G.getClass();
                    String str6 = Build.MODEL;
                    this.f75731G.getClass();
                    return new C20539s3(file, date, arrayList, str, str2, str3, string2, i13, str4, callableC20346h0, str5, str6, Build.VERSION.RELEASE, this.f75731G.m56021a(), string, c20513q6.getProguardUuid(), c20513q6.getRelease(), c20513q6.getEnvironment(), (c2849l1M56054a.f11315z || z4) ? "timeout" : "normal", (Map) c2849l1M56054a.f11311F);
                }
            } catch (Throwable th3) {
                try {
                    c20535sM56711a.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        }
        return null;
    }

    @Override // io.sentry.InterfaceC20442o1
    /* JADX INFO: renamed from: c */
    public final C20539s3 mo56067c(C20645z6 c20645z6, List list, C20513q6 c20513q6) {
        return m56066b(c20645z6.f77205e, c20645z6.f77201a.toString(), c20645z6.f77202b.f76276c.f76321w.toString(), false, list, c20513q6);
    }

    @Override // io.sentry.InterfaceC20442o1
    public final void close() {
        C20159u c20159u;
        C20547t3 c20547t3 = this.f75735K;
        if (c20547t3 != null) {
            c20159u = this;
            c20159u.m56066b(c20547t3.f77005y, c20547t3.f77003w, c20547t3.f77004x, true, null, AbstractC20445o4.m56638b().mo56432l());
        } else {
            c20159u = this;
        }
        c20159u.f75733I.set(false);
        if (c20159u.f75736L != null) {
            C20153s c20153s = c20159u.f75736L;
            C20535s c20535sM56711a = c20153s.f75715o.m56711a();
            try {
                Future future = c20153s.f75704d;
                if (future != null) {
                    future.cancel(true);
                    c20153s.f75704d = null;
                }
                if (c20153s.f75714n) {
                    c20153s.m56054a(null, true);
                }
                c20535sM56711a.close();
            } catch (Throwable th3) {
                try {
                    c20535sM56711a.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        }
    }

    @Override // io.sentry.InterfaceC20442o1
    public final boolean isRunning() {
        return this.f75733I.get();
    }

    @Override // io.sentry.InterfaceC20442o1
    public final void start() {
        C11803t c11803tM56056c;
        this.f75731G.getClass();
        if (this.f75733I.getAndSet(true)) {
            return;
        }
        if (!this.f75732H) {
            this.f75732H = true;
            if (this.f75744z) {
                String str = this.f75743y;
                if (str == null) {
                    this.f75742x.mo16066m(EnumC20436n5.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
                } else {
                    int i13 = this.f75729E;
                    if (i13 <= 0) {
                        this.f75742x.mo16066m(EnumC20436n5.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i13));
                    } else {
                        this.f75736L = new C20153s(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / this.f75729E, this.f75734J, this.f75730F, this.f75742x);
                    }
                }
            } else {
                this.f75742x.mo16066m(EnumC20436n5.INFO, "Profiling is disabled in options.", new Object[0]);
            }
        }
        if (this.f75736L != null && (c11803tM56056c = this.f75736L.m56056c()) != null) {
            this.f75737M = c11803tM56056c.f38324a;
            this.f75738N = c11803tM56056c.f38325b;
            this.f75739O = (Date) c11803tM56056c.f38326c;
            this.f75742x.mo16066m(EnumC20436n5.DEBUG, "Profiler started.", new Object[0]);
            return;
        }
        if (this.f75736L != null && this.f75736L.f75714n) {
            this.f75742x.mo16066m(EnumC20436n5.WARNING, "A profile is already running. This profile will be ignored.", new Object[0]);
            return;
        }
        C20535s c20535sM56711a = this.f75740P.m56711a();
        try {
            this.f75735K = null;
            c20535sM56711a.close();
            this.f75733I.set(false);
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public C20159u(Context context, C20121k0 c20121k0, C20116q c20116q, InterfaceC20602v0 interfaceC20602v0, String str, boolean z4, int i13, InterfaceC20583e interfaceC20583e) {
        this.f75732H = false;
        this.f75733I = new AtomicBoolean(false);
        this.f75736L = null;
        this.f75740P = new C20579a();
        Context applicationContext = context.getApplicationContext();
        this.f75741w = applicationContext != null ? applicationContext : context;
        AbstractC29125c.m88510S(interfaceC20602v0, "ILogger is required");
        this.f75742x = interfaceC20602v0;
        this.f75734J = c20116q;
        AbstractC29125c.m88510S(c20121k0, "The BuildInfoProvider is required.");
        this.f75731G = c20121k0;
        this.f75743y = str;
        this.f75744z = z4;
        this.f75729E = i13;
        this.f75730F = interfaceC20583e;
        this.f75739O = AbstractC21598x.m60659O();
    }
}
