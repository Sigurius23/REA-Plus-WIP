package io.sentry;

import aa3.C0627i1;
import ad3.C0783z;
import com.google.crypto.tink.internal.C5101l0;
import com.mapbox.common.location.C5432a;
import g73.C15556d;
import hg3.AbstractC17269i;
import io.sentry.clientreport.EnumC20296d;
import io.sentry.clientreport.InterfaceC20299g;
import io.sentry.hints.C20363j;
import io.sentry.protocol.C20473d0;
import io.sentry.protocol.C20481h0;
import io.sentry.protocol.C20484j;
import io.sentry.protocol.C20501v;
import io.sentry.transport.C20567q;
import io.sentry.util.AbstractC20590l;
import java.io.Closeable;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import p009a8.RunnableC0533c;
import p581we.C37199o;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.h4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20350h4 implements InterfaceC20308d1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC20259b1 f76371a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC20259b1 f76372b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC20259b1 f76373c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC20406l f76374d;

    /* JADX INFO: renamed from: e */
    public final C20397k f76375e;

    /* JADX INFO: renamed from: f */
    public final C0783z f76376f;

    public C20350h4(InterfaceC20259b1 interfaceC20259b1, InterfaceC20259b1 interfaceC20259b2, InterfaceC20259b1 interfaceC20259b3) {
        this.f76375e = new C20397k(interfaceC20259b3, interfaceC20259b2, interfaceC20259b1);
        this.f76371a = interfaceC20259b1;
        this.f76372b = interfaceC20259b2;
        this.f76373c = interfaceC20259b3;
        C20513q6 c20513q6Mo56432l = mo56432l();
        AbstractC29125c.m88510S(c20513q6Mo56432l, "SentryOptions is required.");
        if (c20513q6Mo56432l.getDsn() == null || c20513q6Mo56432l.getDsn().isEmpty()) {
            throw new IllegalArgumentException("Scopes requires a DSN to be instantiated. Considering using the NoOpScopes if no DSN is available.");
        }
        this.f76374d = c20513q6Mo56432l.getCompositePerformanceCollector();
        this.f76376f = new C0783z(this, 15);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: A */
    public final InterfaceC20544t0 mo56416A() {
        return this.f76376f;
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: B */
    public final C20501v mo56417B(Throwable th3, C20337g0 c20337g0) {
        return m56527F(th3, c20337g0, null);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: C */
    public final C20501v mo56418C(C20473d0 c20473d0, C20405k7 c20405k7, C20337g0 c20337g0, C20539s3 c20539s3) {
        C20473d0 c20473d1;
        InterfaceC20259b1 interfaceC20259b1 = this.f76375e;
        ArrayList arrayList = c20473d0.f76637S;
        C20501v c20501v = C20501v.f76802x;
        if (!isEnabled()) {
            mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return c20501v;
        }
        if (c20473d0.f76636R == null) {
            mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", c20473d0.f76883w);
            return c20501v;
        }
        Boolean bool = Boolean.TRUE;
        C20323e7 c20323e7Mo56543i = c20473d0.f76884x.mo56543i();
        C0627i1 c0627i1 = c20323e7Mo56543i == null ? null : c20323e7Mo56543i.f76324z;
        if (!bool.equals(Boolean.valueOf(c0627i1 != null ? ((Boolean) c0627i1.f2195b).booleanValue() : false))) {
            mo56432l().getLogger().mo16066m(EnumC20436n5.DEBUG, "Transaction %s was dropped due to sampling decision.", c20473d0.f76883w);
            if (mo56432l().getBackpressureMonitor().mo56223a() > 0) {
                InterfaceC20299g clientReportRecorder = mo56432l().getClientReportRecorder();
                EnumC20296d enumC20296d = EnumC20296d.BACKPRESSURE;
                clientReportRecorder.mo16051d(enumC20296d, EnumC20418m.Transaction);
                mo56432l().getClientReportRecorder().mo16062k(enumC20296d, EnumC20418m.Span, arrayList.size() + 1);
                return c20501v;
            }
            InterfaceC20299g clientReportRecorder2 = mo56432l().getClientReportRecorder();
            EnumC20296d enumC20296d2 = EnumC20296d.SAMPLE_RATE;
            clientReportRecorder2.mo16051d(enumC20296d2, EnumC20418m.Transaction);
            mo56432l().getClientReportRecorder().mo16062k(enumC20296d2, EnumC20418m.Span, arrayList.size() + 1);
            return c20501v;
        }
        try {
            c20473d1 = c20473d0;
            try {
                return interfaceC20259b1.mo56187I().mo13944f(c20473d1, c20405k7, interfaceC20259b1, c20337g0, c20539s3);
            } catch (Throwable th3) {
                th = th3;
                Throwable th4 = th;
                mo56432l().getLogger().mo16060j(EnumC20436n5.ERROR, "Error while capturing transaction with id: " + c20473d1.f76883w, th4);
                return c20501v;
            }
        } catch (Throwable th5) {
            th = th5;
            c20473d1 = c20473d0;
        }
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: D */
    public final InterfaceC20308d1 mo56419D(String str) {
        return new C20350h4(this.f76371a.m134238clone(), this.f76372b.m134238clone(), this.f76373c);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: E */
    public final C20501v mo56420E(C20484j c20484j) {
        InterfaceC20259b1 interfaceC20259b1 = this.f76375e;
        C20501v c20501v = C20501v.f76802x;
        if (!isEnabled()) {
            mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "Instance is disabled and this 'captureFeedback' call is a no-op.", new Object[0]);
            return c20501v;
        }
        if (c20484j.f76697w.isEmpty()) {
            mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "captureFeedback called with empty message.", new Object[0]);
            return c20501v;
        }
        try {
            return interfaceC20259b1.mo56187I().mo13946h(c20484j, interfaceC20259b1);
        } catch (Throwable th3) {
            mo56432l().getLogger().mo16060j(EnumC20436n5.ERROR, "Error while capturing feedback: " + c20484j.f76697w, th3);
            return c20501v;
        }
    }

    /* JADX INFO: renamed from: F */
    public final C20501v m56527F(Throwable th3, C20337g0 c20337g0, C5432a c5432a) {
        InterfaceC20259b1 interfaceC20259b1Clone;
        C20501v c20501vMo13949l = C20501v.f76802x;
        boolean zIsEnabled = isEnabled();
        C20397k c20397k = this.f76375e;
        if (zIsEnabled) {
            try {
                C20321e5 c20321e5 = new C20321e5(th3);
                c20397k.mo56190L(c20321e5);
                if (c5432a != null) {
                    try {
                        interfaceC20259b1Clone = c20397k.m134238clone();
                        c5432a.mo11182h(interfaceC20259b1Clone);
                    } catch (Throwable th4) {
                        mo56432l().getLogger().mo16060j(EnumC20436n5.ERROR, "Error in the 'ScopeCallback' callback.", th4);
                        interfaceC20259b1Clone = c20397k;
                    }
                    c20501vMo13949l = c20397k.mo56187I().mo13949l(c20321e5, interfaceC20259b1Clone, c20337g0);
                } else {
                    interfaceC20259b1Clone = c20397k;
                    c20501vMo13949l = c20397k.mo56187I().mo13949l(c20321e5, interfaceC20259b1Clone, c20337g0);
                }
            } catch (Throwable th5) {
                mo56432l().getLogger().mo16060j(EnumC20436n5.ERROR, "Error while capturing exception: " + th3.getMessage(), th5);
            }
        } else {
            mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "Instance is disabled and this 'captureException' call is a no-op.", new Object[0]);
        }
        c20397k.mo56193O(c20501vMo13949l);
        return c20501vMo13949l;
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: a */
    public final void mo56421a(boolean z4) {
        if (!isEnabled()) {
            mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (InterfaceC20545t1 interfaceC20545t1 : mo56432l().getIntegrations()) {
                if (interfaceC20545t1 instanceof Closeable) {
                    try {
                        ((Closeable) interfaceC20545t1).close();
                    } catch (Throwable th3) {
                        mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "Failed to close the integration {}.", interfaceC20545t1, th3);
                    }
                }
            }
            for (InterfaceC20258b0 interfaceC20258b0 : mo56432l().getEventProcessors()) {
                if (interfaceC20258b0 instanceof Closeable) {
                    try {
                        ((Closeable) interfaceC20258b0).close();
                    } catch (Throwable th4) {
                        mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "Failed to close the event processor {}.", interfaceC20258b0, th4);
                    }
                }
            }
            boolean zIsEnabled = isEnabled();
            C20397k c20397k = this.f76375e;
            if (zIsEnabled) {
                try {
                    c20397k.m56609g(null).clear();
                } catch (Throwable th5) {
                    mo56432l().getLogger().mo16060j(EnumC20436n5.ERROR, "Error in the 'configureScope' callback.", th5);
                }
            } else {
                mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            EnumC20341g4 enumC20341g4 = EnumC20341g4.ISOLATION;
            if (isEnabled()) {
                try {
                    c20397k.m56609g(enumC20341g4).clear();
                } catch (Throwable th6) {
                    mo56432l().getLogger().mo16060j(EnumC20436n5.ERROR, "Error in the 'configureScope' callback.", th6);
                }
            } else {
                mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            mo56432l().getBackpressureMonitor().close();
            mo56432l().getTransactionProfiler().close();
            mo56432l().getContinuousProfiler().mo55947a(true);
            mo56432l().getCompositePerformanceCollector().close();
            mo56432l().getConnectionStatusProvider().close();
            InterfaceC20347h1 executorService = mo56432l().getExecutorService();
            if (z4) {
                try {
                    executorService.submit(new RunnableC0533c(27, this, executorService));
                } catch (RejectedExecutionException e5) {
                    mo56432l().getLogger().mo16060j(EnumC20436n5.WARNING, "Failed to submit executor service shutdown task during restart. Shutting down synchronously.", e5);
                    executorService.mo56216a(mo56432l().getShutdownTimeoutMillis());
                }
            } else {
                executorService.mo56216a(mo56432l().getShutdownTimeoutMillis());
            }
            EnumC20341g4 enumC20341g5 = EnumC20341g4.CURRENT;
            if (isEnabled()) {
                try {
                    c20397k.m56609g(enumC20341g5).mo56187I().mo13940a(z4);
                } catch (Throwable th7) {
                    mo56432l().getLogger().mo16060j(EnumC20436n5.ERROR, "Error in the 'configureScope' callback.", th7);
                }
            } else {
                mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            EnumC20341g4 enumC20341g6 = EnumC20341g4.ISOLATION;
            if (isEnabled()) {
                try {
                    c20397k.m56609g(enumC20341g6).mo56187I().mo13940a(z4);
                } catch (Throwable th8) {
                    mo56432l().getLogger().mo16060j(EnumC20436n5.ERROR, "Error in the 'configureScope' callback.", th8);
                }
            } else {
                mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            EnumC20341g4 enumC20341g7 = EnumC20341g4.GLOBAL;
            if (!isEnabled()) {
                mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
                return;
            }
            try {
                c20397k.m56609g(enumC20341g7).mo56187I().mo13940a(z4);
            } catch (Throwable th9) {
                mo56432l().getLogger().mo16060j(EnumC20436n5.ERROR, "Error in the 'configureScope' callback.", th9);
            }
        } catch (Throwable th10) {
            mo56432l().getLogger().mo16060j(EnumC20436n5.ERROR, "Error while closing the Scopes.", th10);
        }
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: b */
    public final void mo56422b(String str) {
        if (isEnabled()) {
            this.f76375e.mo56196b(str);
        } else {
            mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "Instance is disabled and this 'removeTag' call is a no-op.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: c */
    public final void mo56423c(String str, String str2) {
        if (isEnabled()) {
            this.f76375e.mo56197c(str, str2);
        } else {
            mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "Instance is disabled and this 'setTag' call is a no-op.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: d */
    public final void mo56424d(long j7) {
        if (!isEnabled()) {
            mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            this.f76375e.mo56187I().mo13943d(j7);
        } catch (Throwable th3) {
            mo56432l().getLogger().mo16060j(EnumC20436n5.ERROR, "Error in the 'client.flush'.", th3);
        }
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: e */
    public final void mo56425e(C20481h0 c20481h0) {
        if (isEnabled()) {
            this.f76375e.mo56199e(c20481h0);
        } else {
            mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "Instance is disabled and this 'setUser' call is a no-op.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: f */
    public final InterfaceC20408l1 mo56426f() {
        if (isEnabled()) {
            return this.f76375e.mo56200f();
        }
        mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "Instance is disabled and this 'getSpan' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: g */
    public final boolean mo56427g() {
        return this.f76375e.mo56187I().mo13945g();
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: h */
    public final void mo56428h(C20315e c20315e) {
        mo56429i(c20315e, new C20337g0());
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: i */
    public final void mo56429i(C20315e c20315e, C20337g0 c20337g0) {
        if (isEnabled()) {
            this.f76375e.mo56201i(c20315e, c20337g0);
        } else {
            mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC20308d1
    public final boolean isEnabled() {
        return this.f76375e.mo56187I().isEnabled();
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: j */
    public final C20567q mo56430j() {
        return this.f76375e.mo56187I().mo13948j();
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: l */
    public final C20513q6 mo56432l() {
        return this.f76375e.f76453a.mo56202l();
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: m */
    public final InterfaceC20432n1 mo56433m() {
        if (isEnabled()) {
            return this.f76375e.mo56203m();
        }
        mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "Instance is disabled and this 'getTransaction' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: n */
    public final C20501v mo56434n(C20457p3 c20457p3) {
        AbstractC29125c.m88510S(c20457p3, "profilingContinuousData is required");
        C20501v c20501v = C20501v.f76802x;
        if (!isEnabled()) {
            mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return c20501v;
        }
        try {
            return this.f76375e.mo56187I().mo13951n(c20457p3);
        } catch (Throwable th3) {
            mo56432l().getLogger().mo16060j(EnumC20436n5.ERROR, "Error while capturing profile chunk with id: " + c20457p3.f76568y, th3);
            return c20501v;
        }
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: o */
    public final void mo56435o() {
        if (!isEnabled()) {
            mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        C20397k c20397k = this.f76375e;
        C20265b7 c20265b7Mo56204o = c20397k.mo56204o();
        if (c20265b7Mo56204o != null) {
            c20397k.mo56187I().mo13947i(c20265b7Mo56204o, AbstractC17269i.m48858C(new C15556d(9)));
        }
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: p */
    public final void mo56436p(Throwable th3, C20314d7 c20314d7, String str) {
        this.f76375e.mo56205p(th3, c20314d7, str);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: q */
    public final C20501v mo56437q(C5101l0 c5101l0, C20337g0 c20337g0) {
        C20501v c20501v = C20501v.f76802x;
        if (!isEnabled()) {
            mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
            return c20501v;
        }
        try {
            C20501v c20501vMo13952q = this.f76375e.mo56187I().mo13952q(c5101l0, c20337g0);
            return c20501vMo13952q != null ? c20501vMo13952q : c20501v;
        } catch (Throwable th3) {
            mo56432l().getLogger().mo16060j(EnumC20436n5.ERROR, "Error while capturing envelope.", th3);
            return c20501v;
        }
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: r */
    public final C20501v mo56438r(Throwable th3, C20337g0 c20337g0, C5432a c5432a) {
        return m56527F(th3, c20337g0, c5432a);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: s */
    public final void mo56439s(InterfaceC20320e4 interfaceC20320e4) {
        if (!isEnabled()) {
            mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            interfaceC20320e4.mo11182h(this.f76375e.m56609g(null));
        } catch (Throwable th3) {
            mo56432l().getLogger().mo16060j(EnumC20436n5.ERROR, "Error in the 'configureScope' callback.", th3);
        }
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: t */
    public final C20501v mo56440t(C20542s6 c20542s6, C20337g0 c20337g0) {
        InterfaceC20259b1 interfaceC20259b1 = this.f76375e;
        C20501v c20501v = C20501v.f76802x;
        if (!isEnabled()) {
            mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "Instance is disabled and this 'captureReplay' call is a no-op.", new Object[0]);
            return c20501v;
        }
        try {
            return interfaceC20259b1.mo56187I().mo13942c(c20542s6, interfaceC20259b1, c20337g0);
        } catch (Throwable th3) {
            mo56432l().getLogger().mo16060j(EnumC20436n5.ERROR, "Error while capturing replay", th3);
            return c20501v;
        }
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: u */
    public final void mo56441u() {
        if (!isEnabled()) {
            mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        C20397k c20397k = this.f76375e;
        C37199o c37199oMo56210u = c20397k.mo56210u();
        if (c37199oMo56210u == null) {
            mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "Session could not be started.", new Object[0]);
            return;
        }
        C20265b7 c20265b7 = (C20265b7) c37199oMo56210u.f159040w;
        if (c20265b7 != null) {
            c20397k.mo56187I().mo13947i(c20265b7, AbstractC17269i.m48858C(new C15556d(9)));
        }
        c20397k.mo56187I().mo13947i((C20265b7) c37199oMo56210u.f159041x, AbstractC17269i.m48858C(new C20363j(0)));
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: v */
    public final C20501v mo56442v(C20321e5 c20321e5, C20337g0 c20337g0) {
        InterfaceC20259b1 interfaceC20259b1 = this.f76375e;
        C20501v c20501vMo13949l = C20501v.f76802x;
        if (!isEnabled()) {
            mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return c20501vMo13949l;
        }
        if (c20321e5 == null) {
            mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "captureEvent called with null parameter.", new Object[0]);
            return c20501vMo13949l;
        }
        try {
            interfaceC20259b1.mo56190L(c20321e5);
            c20501vMo13949l = interfaceC20259b1.mo56187I().mo13949l(c20321e5, interfaceC20259b1, c20337g0);
            interfaceC20259b1.mo56193O(c20501vMo13949l);
            return c20501vMo13949l;
        } catch (Throwable th3) {
            mo56432l().getLogger().mo16060j(EnumC20436n5.ERROR, "Error while capturing event with id: " + c20321e5.f76883w, th3);
            return c20501vMo13949l;
        }
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: x */
    public final InterfaceC20432n1 mo56444x(C20426m7 c20426m7, C20438n7 c20438n7) {
        Double dValueOf;
        c20426m7.f76314I = (String) c20438n7.f45699d;
        boolean zIsEnabled = isEnabled();
        InterfaceC20432n1 interfaceC20432n1Mo56489a = C20340g3.f76358a;
        if (!zIsEnabled) {
            mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
        } else if (AbstractC20590l.m56723a(c20426m7.f76314I, mo56432l().getIgnoredSpanOrigins())) {
            mo56432l().getLogger().mo16066m(EnumC20436n5.DEBUG, "Returning no-op for span origin %s as the SDK has been configured to ignore it", c20426m7.f76314I);
        } else if (!mo56432l().getInstrumenter().equals(c20426m7.f76317L)) {
            mo56432l().getLogger().mo16066m(EnumC20436n5.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", c20426m7.f76317L, mo56432l().getInstrumenter());
        } else if (mo56432l().isTracingEnabled()) {
            C20269c c20269c = c20426m7.f76318M;
            if (c20269c == null || (dValueOf = c20269c.f76116d) == null) {
                Double d3 = ((C20269c) this.f76375e.mo56185G().f814z).f76116d;
                dValueOf = Double.valueOf(d3 == null ? 0.0d : d3.doubleValue());
            }
            C0627i1 c0627i1M56630a = mo56432l().getInternalTracesSampler().m56630a(new C20634y3(c20426m7, dValueOf));
            Boolean bool = (Boolean) c0627i1M56630a.f2195b;
            c20426m7.m56484a(c0627i1M56630a);
            InterfaceC20420m1 spanFactory = mo56432l().getSpanFactory();
            if (bool.booleanValue() && mo56432l().isContinuousProfilingEnabled()) {
                EnumC20518r3 profileLifecycle = mo56432l().getProfileLifecycle();
                EnumC20518r3 enumC20518r3 = EnumC20518r3.TRACE;
                if (profileLifecycle == enumC20518r3 && c20426m7.f76320O.equals(C20501v.f76802x)) {
                    mo56432l().getContinuousProfiler().mo55948b(enumC20518r3, mo56432l().getInternalTracesSampler());
                }
            }
            interfaceC20432n1Mo56489a = spanFactory.mo56489a(c20426m7, this, c20438n7, this.f76374d);
            if (bool.booleanValue() && ((Boolean) c0627i1M56630a.f2198e).booleanValue()) {
                InterfaceC20442o1 transactionProfiler = mo56432l().getTransactionProfiler();
                if (!transactionProfiler.isRunning()) {
                    transactionProfiler.start();
                    transactionProfiler.mo56065a(interfaceC20432n1Mo56489a);
                } else if (c20438n7.f76518e) {
                    transactionProfiler.mo56065a(interfaceC20432n1Mo56489a);
                }
            }
        } else {
            mo56432l().getLogger().mo16066m(EnumC20436n5.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
        }
        if (EnumC20311d4.ON == ((EnumC20311d4) c20438n7.f45698c)) {
            interfaceC20432n1Mo56489a.makeCurrent();
        }
        return interfaceC20432n1Mo56489a;
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: y */
    public final Boolean mo56445y() {
        C20548t4 c20548t4 = C20548t4.f77007d;
        String cacheDirPath = mo56432l().getCacheDirPath();
        boolean zIsEnableAutoSessionTracking = mo56432l().isEnableAutoSessionTracking();
        C20535s c20535sM56711a = c20548t4.f77010c.m56711a();
        try {
            if (c20548t4.f77008a) {
                Boolean bool = c20548t4.f77009b;
                c20535sM56711a.close();
                return bool;
            }
            if (cacheDirPath == null) {
                c20535sM56711a.close();
                return null;
            }
            boolean z4 = true;
            c20548t4.f77008a = true;
            File file = new File(cacheDirPath, "last_crash");
            File file2 = new File(cacheDirPath, ".sentry-native/last_crash");
            try {
                try {
                    if (!file.exists()) {
                        if (!file2.exists()) {
                            z4 = false;
                        } else if (!zIsEnableAutoSessionTracking) {
                            file2.delete();
                        }
                        c20548t4.f77009b = Boolean.valueOf(z4);
                        c20535sM56711a.close();
                        return c20548t4.f77009b;
                    }
                    file.delete();
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
            }
            c20548t4.f77009b = Boolean.valueOf(z4);
            c20535sM56711a.close();
            return c20548t4.f77009b;
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: z */
    public final InterfaceC20259b1 mo56446z() {
        return this.f76371a;
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final InterfaceC20572u0 m134236clone() {
        if (!isEnabled()) {
            mo56432l().getLogger().mo16066m(EnumC20436n5.WARNING, "Disabled Scopes cloned.", new Object[0]);
        }
        return new C20419m0((C20350h4) mo56419D("scopes clone"));
    }
}
