package io.sentry.transport;

import com.google.crypto.tink.internal.C5101l0;
import hg3.AbstractC17269i;
import io.sentry.AbstractC20576u4;
import io.sentry.C20275c5;
import io.sentry.C20337g0;
import io.sentry.C20448o7;
import io.sentry.C20513q6;
import io.sentry.C20571u;
import io.sentry.C20619w4;
import io.sentry.EnumC20418m;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import io.sentry.InterfaceC20606v4;
import io.sentry.ThreadFactoryC20342g5;
import io.sentry.cache.InterfaceC20281d;
import io.sentry.clientreport.EnumC20296d;
import io.sentry.hints.AbstractC20356c;
import io.sentry.hints.InterfaceC20357d;
import io.sentry.hints.InterfaceC20361h;
import io.sentry.hints.InterfaceC20364k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p014aj.C0928c;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.transport.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C20553c implements InterfaceC20557g {

    /* JADX INFO: renamed from: E */
    public final InterfaceC20558h f77018E;

    /* JADX INFO: renamed from: F */
    public final C20555e f77019F;

    /* JADX INFO: renamed from: G */
    public volatile RunnableC20552b f77020G;

    /* JADX INFO: renamed from: w */
    public final C20564n f77021w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC20281d f77022x;

    /* JADX INFO: renamed from: y */
    public final C20513q6 f77023y;

    /* JADX INFO: renamed from: z */
    public final C20567q f77024z;

    /* JADX WARN: Type inference failed for: r3v0, types: [io.sentry.transport.a] */
    public C20553c(C20513q6 c20513q6, C20567q c20567q, InterfaceC20558h interfaceC20558h, C5101l0 c5101l0) {
        int maxQueueSize = c20513q6.getMaxQueueSize();
        final InterfaceC20281d envelopeDiskCache = c20513q6.getEnvelopeDiskCache();
        final InterfaceC20602v0 logger = c20513q6.getLogger();
        InterfaceC20606v4 dateProvider = c20513q6.getDateProvider();
        C20564n c20564n = new C20564n(maxQueueSize, new ThreadFactoryC20342g5(1), new RejectedExecutionHandler() { // from class: io.sentry.transport.a
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                if (runnable instanceof RunnableC20552b) {
                    RunnableC20552b runnableC20552b = (RunnableC20552b) runnable;
                    C20337g0 c20337g0 = runnableC20552b.f77015x;
                    if (!AbstractC17269i.m48876W(c20337g0, InterfaceC20357d.class)) {
                        envelopeDiskCache.mo55935a0(runnableC20552b.f77014w, c20337g0);
                    }
                    Object objM56491b = c20337g0.m56491b("sentry:typeCheckHint");
                    if (InterfaceC20364k.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint")) && objM56491b != null) {
                        ((InterfaceC20364k) objM56491b).mo56036c(false);
                    }
                    Object objM56491b2 = c20337g0.m56491b("sentry:typeCheckHint");
                    if (InterfaceC20361h.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint")) && objM56491b2 != null) {
                        ((InterfaceC20361h) objM56491b2).mo56037d(true);
                    }
                    logger.mo16066m(EnumC20436n5.WARNING, "Envelope rejected", new Object[0]);
                }
            }
        }, logger, dateProvider);
        C20555e c20555e = new C20555e(c20513q6, c5101l0, c20567q);
        this.f77020G = null;
        this.f77021w = c20564n;
        InterfaceC20281d envelopeDiskCache2 = c20513q6.getEnvelopeDiskCache();
        AbstractC29125c.m88510S(envelopeDiskCache2, "envelopeCache is required");
        this.f77022x = envelopeDiskCache2;
        this.f77023y = c20513q6;
        this.f77024z = c20567q;
        AbstractC29125c.m88510S(interfaceC20558h, "transportGate is required");
        this.f77018E = interfaceC20558h;
        this.f77019F = c20555e;
    }

    @Override // io.sentry.transport.InterfaceC20557g
    /* JADX INFO: renamed from: A */
    public final void mo56677A(C5101l0 c5101l0, C20337g0 c20337g0) {
        InterfaceC20281d interfaceC20281d;
        boolean z4;
        C5101l0 c5101l0Mo16072y;
        List listSingletonList;
        Iterable<C20275c5> iterable = (Iterable) c5101l0.f21444y;
        boolean zM48876W = AbstractC17269i.m48876W(c20337g0, InterfaceC20357d.class);
        C20513q6 c20513q6 = this.f77023y;
        InterfaceC20281d interfaceC20281d2 = this.f77022x;
        if (zM48876W) {
            c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Captured Envelope is already cached", new Object[0]);
            interfaceC20281d = C20559i.f77031w;
            z4 = true;
        } else {
            interfaceC20281d = interfaceC20281d2;
            z4 = false;
        }
        C20567q c20567q = this.f77024z;
        C20513q6 c20513q7 = c20567q.f77045x;
        ArrayList arrayList = null;
        for (C20275c5 c20275c5 : iterable) {
            String itemType = c20275c5.f76147a.f76265E.getItemType();
            itemType.getClass();
            switch (itemType) {
                case "attachment":
                    listSingletonList = Collections.singletonList(EnumC20418m.Attachment);
                    break;
                case "replay_video":
                    listSingletonList = Collections.singletonList(EnumC20418m.Replay);
                    break;
                case "profile_chunk":
                    listSingletonList = Arrays.asList(EnumC20418m.ProfileChunkUi, EnumC20418m.ProfileChunk);
                    break;
                case "profile":
                    listSingletonList = Collections.singletonList(EnumC20418m.Profile);
                    break;
                case "feedback":
                    listSingletonList = Collections.singletonList(EnumC20418m.Feedback);
                    break;
                case "log":
                    listSingletonList = Collections.singletonList(EnumC20418m.LogItem);
                    break;
                case "span":
                    listSingletonList = Collections.singletonList(EnumC20418m.Span);
                    break;
                case "event":
                    listSingletonList = Collections.singletonList(EnumC20418m.Error);
                    break;
                case "trace_metric":
                    listSingletonList = Collections.singletonList(EnumC20418m.TraceMetric);
                    break;
                case "check_in":
                    listSingletonList = Collections.singletonList(EnumC20418m.Monitor);
                    break;
                case "session":
                    listSingletonList = Collections.singletonList(EnumC20418m.Session);
                    break;
                case "transaction":
                    listSingletonList = Collections.singletonList(EnumC20418m.Transaction);
                    break;
                default:
                    listSingletonList = Collections.singletonList(EnumC20418m.Unknown);
                    break;
            }
            Iterator it = listSingletonList.iterator();
            while (it.hasNext()) {
                if (c20567q.m56688h((EnumC20418m) it.next())) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c20275c5);
                    c20513q7.getClientReportRecorder().mo16068n(EnumC20296d.RATELIMIT_BACKOFF, c20275c5);
                    break;
                }
            }
        }
        if (arrayList != null) {
            c20513q7.getLogger().mo16066m(EnumC20436n5.WARNING, "%d envelope items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
            ArrayList arrayList2 = new ArrayList();
            for (C20275c5 c20275c6 : iterable) {
                if (!arrayList.contains(c20275c6)) {
                    arrayList2.add(c20275c6);
                }
            }
            if (arrayList2.isEmpty()) {
                c20513q7.getLogger().mo16066m(EnumC20436n5.WARNING, "Envelope discarded due all items rate limited.", new Object[0]);
                Object objM56491b = c20337g0.m56491b("sentry:typeCheckHint");
                if (InterfaceC20364k.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint")) && objM56491b != null) {
                    ((InterfaceC20364k) objM56491b).mo56036c(false);
                }
                Object objM56491b2 = c20337g0.m56491b("sentry:typeCheckHint");
                if (InterfaceC20361h.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint")) && objM56491b2 != null) {
                    ((InterfaceC20361h) objM56491b2).mo56037d(false);
                }
                Object objM56491b3 = c20337g0.m56491b("sentry:typeCheckHint");
                if (AbstractC20356c.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint")) && objM56491b3 != null) {
                    ((AbstractC20356c) objM56491b3).f76388w.countDown();
                    c20513q7.getLogger().mo16066m(EnumC20436n5.DEBUG, "Disk flush envelope fired due to rate limit", new Object[0]);
                }
                c5101l0Mo16072y = null;
            } else {
                c5101l0Mo16072y = new C5101l0((C20619w4) c5101l0.f21443x, arrayList2);
            }
        } else {
            c5101l0Mo16072y = c5101l0;
        }
        if (c5101l0Mo16072y == null) {
            if (z4) {
                interfaceC20281d2.mo56255X0(c5101l0);
                return;
            }
            return;
        }
        if (C20448o7.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint"))) {
            c5101l0Mo16072y = c20513q6.getClientReportRecorder().mo16072y(c5101l0Mo16072y);
        }
        Future futureSubmit = this.f77021w.submit(new RunnableC20552b(this, c5101l0Mo16072y, c20337g0, interfaceC20281d));
        if (futureSubmit != null && futureSubmit.isCancelled()) {
            c20513q6.getClientReportRecorder().mo16071u(EnumC20296d.QUEUE_OVERFLOW, c5101l0Mo16072y);
            return;
        }
        Object objM56491b4 = c20337g0.m56491b("sentry:typeCheckHint");
        if (!C20571u.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint")) || objM56491b4 == null) {
            return;
        }
        C20571u c20571u = (C20571u) objM56491b4;
        c20571u.f77053G.add(c20571u.f77052F);
        c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Envelope enqueued", new Object[0]);
    }

    @Override // io.sentry.transport.InterfaceC20557g
    /* JADX INFO: renamed from: a */
    public final void mo56678a(boolean z4) {
        this.f77024z.close();
        this.f77021w.shutdown();
        this.f77023y.getLogger().mo16066m(EnumC20436n5.DEBUG, "Shutting down", new Object[0]);
        if (z4) {
            return;
        }
        try {
            long flushTimeoutMillis = this.f77023y.getFlushTimeoutMillis();
            if (this.f77021w.awaitTermination(flushTimeoutMillis, TimeUnit.MILLISECONDS)) {
                return;
            }
            this.f77023y.getLogger().mo16066m(EnumC20436n5.WARNING, "Failed to shutdown the async connection async sender  within " + flushTimeoutMillis + " ms. Trying to force it now.", new Object[0]);
            this.f77021w.shutdownNow();
            if (this.f77020G != null) {
                this.f77021w.getRejectedExecutionHandler().rejectedExecution(this.f77020G, this.f77021w);
            }
        } catch (InterruptedException unused) {
            this.f77023y.getLogger().mo16066m(EnumC20436n5.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        mo56678a(false);
    }

    @Override // io.sentry.transport.InterfaceC20557g
    /* JADX INFO: renamed from: d */
    public final void mo56679d(long j7) {
        C20564n c20564n = this.f77021w;
        c20564n.getClass();
        try {
            C0928c c0928c = c20564n.f77036E;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c0928c.getClass();
            ((C20568r) c0928c.f3421x).tryAcquireSharedNanos(1, timeUnit.toNanos(j7));
        } catch (InterruptedException e5) {
            c20564n.f77039y.mo16060j(EnumC20436n5.ERROR, "Failed to wait till idle", e5);
            Thread.currentThread().interrupt();
        }
    }

    @Override // io.sentry.transport.InterfaceC20557g
    /* JADX INFO: renamed from: g */
    public final boolean mo56680g() {
        boolean z4;
        C20567q c20567q = this.f77024z;
        c20567q.getClass();
        c20567q.f77044w.getClass();
        Date date = new Date(System.currentTimeMillis());
        ConcurrentHashMap concurrentHashMap = c20567q.f77046y;
        Iterator it = concurrentHashMap.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                z4 = false;
                break;
            }
            Date date2 = (Date) concurrentHashMap.get((EnumC20418m) it.next());
            if (date2 != null && !date.after(date2)) {
                z4 = true;
                break;
            }
        }
        C20564n c20564n = this.f77021w;
        AbstractC20576u4 abstractC20576u4 = c20564n.f77038x;
        return (z4 || (abstractC20576u4 != null && (c20564n.f77040z.now().mo56692b(abstractC20576u4) > 2000000000L ? 1 : (c20564n.f77040z.now().mo56692b(abstractC20576u4) == 2000000000L ? 0 : -1)) < 0)) ? false : true;
    }

    @Override // io.sentry.transport.InterfaceC20557g
    /* JADX INFO: renamed from: j */
    public final C20567q mo56681j() {
        return this.f77024z;
    }
}
