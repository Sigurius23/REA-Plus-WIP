package io.sentry.android.core;

import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.C20422m3;
import io.sentry.C20535s;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20347h1;
import io.sentry.InterfaceC20602v0;
import io.sentry.RunnableC20277c7;
import io.sentry.android.core.internal.util.C20116q;
import io.sentry.profilemeasurements.C20462a;
import io.sentry.profilemeasurements.C20463b;
import io.sentry.util.C20579a;
import io.sentry.util.InterfaceC20583e;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import p031b9.C2849l1;
import p085d9.C11803t;
import p249jc.AbstractC21598x;
import pf.AbstractC29125c;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: io.sentry.android.core.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C20153s {

    /* JADX INFO: renamed from: b */
    public final File f75702b;

    /* JADX INFO: renamed from: c */
    public final int f75703c;

    /* JADX INFO: renamed from: f */
    public String f75706f;

    /* JADX INFO: renamed from: g */
    public final C20116q f75707g;

    /* JADX INFO: renamed from: l */
    public final InterfaceC20583e f75712l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC20602v0 f75713m;

    /* JADX INFO: renamed from: a */
    public long f75701a = 0;

    /* JADX INFO: renamed from: d */
    public Future f75704d = null;

    /* JADX INFO: renamed from: e */
    public File f75705e = null;

    /* JADX INFO: renamed from: h */
    public final ArrayDeque f75708h = new ArrayDeque();

    /* JADX INFO: renamed from: i */
    public final ArrayDeque f75709i = new ArrayDeque();

    /* JADX INFO: renamed from: j */
    public final ArrayDeque f75710j = new ArrayDeque();

    /* JADX INFO: renamed from: k */
    public final HashMap f75711k = new HashMap();

    /* JADX INFO: renamed from: n */
    public volatile boolean f75714n = false;

    /* JADX INFO: renamed from: o */
    public final C20579a f75715o = new C20579a();

    public C20153s(String str, int i13, C20116q c20116q, InterfaceC20583e interfaceC20583e, InterfaceC20602v0 interfaceC20602v0) {
        AbstractC29125c.m88510S(str, "TracesFilesDirPath is required");
        this.f75702b = new File(str);
        this.f75703c = i13;
        AbstractC29125c.m88510S(interfaceC20602v0, "Logger is required");
        this.f75713m = interfaceC20602v0;
        this.f75712l = interfaceC20583e;
        AbstractC29125c.m88510S(c20116q, "SentryFrameMetricsCollector is required");
        this.f75707g = c20116q;
    }

    /* JADX INFO: renamed from: a */
    public final C2849l1 m56054a(List list, boolean z4) {
        C20535s c20535sM56711a = this.f75715o.m56711a();
        try {
            if (!this.f75714n) {
                this.f75713m.mo16066m(EnumC20436n5.WARNING, "Profiler not running", new Object[0]);
                c20535sM56711a.close();
                return null;
            }
            try {
                Debug.stopMethodTracing();
            } catch (Throwable th3) {
                try {
                    this.f75713m.mo16060j(EnumC20436n5.ERROR, "Error while stopping profiling: ", th3);
                } catch (Throwable th4) {
                    this.f75714n = false;
                    throw th4;
                }
            }
            this.f75714n = false;
            this.f75707g.m56005b(this.f75706f);
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            if (this.f75705e == null) {
                this.f75713m.mo16066m(EnumC20436n5.ERROR, "Trace file does not exists", new Object[0]);
                c20535sM56711a.close();
                return null;
            }
            if (!this.f75709i.isEmpty()) {
                this.f75711k.put("slow_frame_renders", new C20462a("nanosecond", this.f75709i));
            }
            if (!this.f75710j.isEmpty()) {
                this.f75711k.put("frozen_frame_renders", new C20462a("nanosecond", this.f75710j));
            }
            if (!this.f75708h.isEmpty()) {
                this.f75711k.put("screen_frame_rates", new C20462a("hz", this.f75708h));
            }
            m56055b(list);
            Future future = this.f75704d;
            if (future != null) {
                future.cancel(true);
                this.f75704d = null;
            }
            C2849l1 c2849l1 = new C2849l1(jElapsedRealtimeNanos, elapsedCpuTime, z4, this.f75705e, this.f75711k);
            c20535sM56711a.close();
            return c2849l1;
        } catch (Throwable th5) {
            try {
                c20535sM56711a.close();
                throw th5;
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
                throw th5;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m56055b(List list) {
        long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.f75701a) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (list != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list.size());
            ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
            ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
            synchronized (list) {
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C20422m3 c20422m3 = (C20422m3) it.next();
                        long j7 = c20422m3.f76501d;
                        long j13 = j7 + jElapsedRealtimeNanos;
                        Double d3 = c20422m3.f76498a;
                        Long l7 = c20422m3.f76499b;
                        Long l12 = c20422m3.f76500c;
                        if (d3 != null) {
                            arrayDeque3.add(new C20463b(Long.valueOf(j13), d3, j7));
                        }
                        if (l7 != null) {
                            arrayDeque.add(new C20463b(Long.valueOf(j13), l7, j7));
                        }
                        if (l12 != null) {
                            arrayDeque2.add(new C20463b(Long.valueOf(j13), l12, j7));
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.f75711k.put("cpu_usage", new C20462a("percent", arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.f75711k.put("memory_footprint", new C20462a("byte", arrayDeque));
            }
            if (arrayDeque2.isEmpty()) {
                return;
            }
            this.f75711k.put("memory_native_footprint", new C20462a("byte", arrayDeque2));
        }
    }

    /* JADX INFO: renamed from: c */
    public final C11803t m56056c() {
        String strM92131v;
        C20535s c20535sM56711a = this.f75715o.m56711a();
        try {
            int i13 = this.f75703c;
            if (i13 == 0) {
                this.f75713m.mo16066m(EnumC20436n5.WARNING, "Disabling profiling because intervaUs is set to %d", Integer.valueOf(i13));
                c20535sM56711a.close();
                return null;
            }
            if (this.f75714n) {
                this.f75713m.mo16066m(EnumC20436n5.WARNING, "Profiling has already started...", new Object[0]);
                c20535sM56711a.close();
                return null;
            }
            this.f75705e = new File(this.f75702b, AbstractC30060g.m92131v().concat(".trace"));
            this.f75711k.clear();
            this.f75708h.clear();
            this.f75709i.clear();
            this.f75710j.clear();
            C20116q c20116q = this.f75707g;
            C20150r c20150r = new C20150r(this);
            if (c20116q.f75566G) {
                strM92131v = AbstractC30060g.m92131v();
                c20116q.f75565F.put(strM92131v, c20150r);
                c20116q.m56006c();
            } else {
                strM92131v = null;
            }
            this.f75706f = strM92131v;
            try {
                InterfaceC20583e interfaceC20583e = this.f75712l;
                if (interfaceC20583e != null) {
                    this.f75704d = ((InterfaceC20347h1) interfaceC20583e.mo19991j()).mo56218c(new RunnableC20277c7(this, 4), 30000L);
                }
            } catch (RejectedExecutionException e5) {
                this.f75713m.mo16060j(EnumC20436n5.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e5);
            }
            this.f75701a = SystemClock.elapsedRealtimeNanos();
            Date dateM60659O = AbstractC21598x.m60659O();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            try {
                Debug.startMethodTracingSampling(this.f75705e.getPath(), 3000000, this.f75703c);
                this.f75714n = true;
                long j7 = this.f75701a;
                C11803t c11803t = new C11803t();
                c11803t.f38324a = j7;
                c11803t.f38325b = elapsedCpuTime;
                c11803t.f38326c = dateM60659O;
                c20535sM56711a.close();
                return c11803t;
            } catch (Throwable th3) {
                m56054a(null, false);
                this.f75713m.mo16060j(EnumC20436n5.ERROR, "Unable to start a profile: ", th3);
                this.f75714n = false;
                c20535sM56711a.close();
                return null;
            }
        } catch (Throwable th4) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }
}
