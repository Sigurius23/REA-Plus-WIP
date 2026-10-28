package io.sentry;

import hg3.AbstractC17269i;
import io.sentry.exception.ExceptionMechanismException;
import io.sentry.hints.EnumC20358e;
import io.sentry.protocol.C20490n;
import io.sentry.protocol.C20501v;
import io.sentry.util.C20579a;
import java.io.Closeable;
import java.util.HashSet;
import p249jc.AbstractC21598x;

/* JADX INFO: loaded from: classes5.dex */
public final class UncaughtExceptionHandlerIntegration implements InterfaceC20545t1, Thread.UncaughtExceptionHandler, Closeable {

    /* JADX INFO: renamed from: E */
    public static final C20579a f75179E = new C20579a();

    /* JADX INFO: renamed from: w */
    public Thread.UncaughtExceptionHandler f75180w;

    /* JADX INFO: renamed from: x */
    public C20371i4 f75181x;

    /* JADX INFO: renamed from: y */
    public C20513q6 f75182y;

    /* JADX INFO: renamed from: z */
    public boolean f75183z = false;

    /* JADX INFO: renamed from: b */
    public final void m55879b(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, HashSet hashSet) {
        if (uncaughtExceptionHandler == null) {
            C20513q6 c20513q6 = this.f75182y;
            if (c20513q6 != null) {
                c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Found no UncaughtExceptionHandler to remove.", new Object[0]);
                return;
            }
            return;
        }
        if (!hashSet.add(uncaughtExceptionHandler)) {
            C20513q6 c20513q7 = this.f75182y;
            if (c20513q7 != null) {
                c20513q7.getLogger().mo16066m(EnumC20436n5.WARNING, "Cycle detected in UncaughtExceptionHandler chain while removing handler.", new Object[0]);
                return;
            }
            return;
        }
        if (uncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) {
            UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) uncaughtExceptionHandler;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = uncaughtExceptionHandlerIntegration.f75180w;
            if (this != uncaughtExceptionHandler2) {
                m55879b(uncaughtExceptionHandler2, hashSet);
                return;
            }
            uncaughtExceptionHandlerIntegration.f75180w = this.f75180w;
            C20513q6 c20513q8 = this.f75182y;
            if (c20513q8 != null) {
                c20513q8.getLogger().mo16066m(EnumC20436n5.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C20535s c20535sM56711a = f75179E.m56711a();
        try {
            if (this == Thread.getDefaultUncaughtExceptionHandler()) {
                Thread.setDefaultUncaughtExceptionHandler(this.f75180w);
                C20513q6 c20513q6 = this.f75182y;
                if (c20513q6 != null) {
                    c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
                }
            } else {
                m55879b(Thread.getDefaultUncaughtExceptionHandler(), new HashSet());
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

    @Override // io.sentry.InterfaceC20545t1
    /* JADX INFO: renamed from: m */
    public final void mo55878m(C20513q6 c20513q6) {
        UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration;
        C20371i4 c20371i4;
        C20371i4 c20371i5 = C20371i4.f76402a;
        if (this.f75183z) {
            c20513q6.getLogger().mo16066m(EnumC20436n5.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.f75183z = true;
        this.f75181x = c20371i5;
        this.f75182y = c20513q6;
        InterfaceC20602v0 logger = c20513q6.getLogger();
        EnumC20436n5 enumC20436n5 = EnumC20436n5.DEBUG;
        logger.mo16066m(enumC20436n5, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.f75182y.isEnableUncaughtExceptionHandler()));
        if (this.f75182y.isEnableUncaughtExceptionHandler()) {
            C20535s c20535sM56711a = f75179E.m56711a();
            try {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                if (defaultUncaughtExceptionHandler != null) {
                    this.f75182y.getLogger().mo16066m(enumC20436n5, "default UncaughtExceptionHandler class='" + defaultUncaughtExceptionHandler.getClass().getName() + "'", new Object[0]);
                    if (!(defaultUncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) || (c20371i4 = (uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) defaultUncaughtExceptionHandler).f75181x) == null) {
                        this.f75180w = defaultUncaughtExceptionHandler;
                    } else {
                        InterfaceC20317e1 interfaceC20317e1 = AbstractC20445o4.f76532a;
                        c20371i4.getClass();
                        this.f75180w = uncaughtExceptionHandlerIntegration.f75180w;
                    }
                }
                Thread.setDefaultUncaughtExceptionHandler(this);
                c20535sM56711a.close();
                this.f75182y.getLogger().mo16066m(enumC20436n5, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
                AbstractC21598x.m60683i("UncaughtExceptionHandler");
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

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th3) {
        C20501v c20501v;
        C20513q6 c20513q6 = this.f75182y;
        if (c20513q6 == null || this.f75181x == null) {
            return;
        }
        c20513q6.getLogger().mo16066m(EnumC20436n5.INFO, "Uncaught exception received.", new Object[0]);
        try {
            C20448o7 c20448o7 = new C20448o7(this.f75182y.getFlushTimeoutMillis(), this.f75182y.getLogger());
            C20490n c20490n = new C20490n();
            c20490n.f76743z = Boolean.FALSE;
            c20490n.f76740w = "UncaughtExceptionHandler";
            C20321e5 c20321e5 = new C20321e5(new ExceptionMechanismException(c20490n, th3, thread));
            c20321e5.f76305U = EnumC20436n5.FATAL;
            if (this.f75181x.mo56433m() == null && (c20501v = c20321e5.f76883w) != null) {
                c20448o7.mo56064g(c20501v);
            }
            C20337g0 c20337g0M48858C = AbstractC17269i.m48858C(c20448o7);
            boolean zEquals = this.f75181x.mo56442v(c20321e5, c20337g0M48858C).equals(C20501v.f76802x);
            EnumC20358e enumC20358e = (EnumC20358e) c20337g0M48858C.m56492c(EnumC20358e.class, "sentry:eventDropReason");
            if ((!zEquals || EnumC20358e.MULTITHREADED_DEDUPLICATION.equals(enumC20358e)) && !c20448o7.mo56038e()) {
                this.f75182y.getLogger().mo16066m(EnumC20436n5.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", c20321e5.f76883w);
            }
        } catch (Throwable th4) {
            this.f75182y.getLogger().mo16060j(EnumC20436n5.ERROR, "Error sending uncaught exception to Sentry.", th4);
        }
        if (this.f75180w != null) {
            this.f75182y.getLogger().mo16066m(EnumC20436n5.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
            this.f75180w.uncaughtException(thread, th3);
        } else if (this.f75182y.isPrintUncaughtStackTrace()) {
            th3.printStackTrace();
        }
    }
}
