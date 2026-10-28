package io.sentry.transport;

import androidx.room.AbstractC1772c1;
import com.google.crypto.tink.internal.C5101l0;
import io.sentry.C20337g0;
import io.sentry.C20513q6;
import io.sentry.C20619w4;
import io.sentry.EnumC20436n5;
import io.sentry.cache.InterfaceC20281d;
import io.sentry.clientreport.EnumC20296d;
import io.sentry.hints.AbstractC20356c;
import io.sentry.hints.InterfaceC20361h;
import io.sentry.hints.InterfaceC20364k;
import java.io.IOException;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.internal.AbstractC22674j;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.transport.b */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC20552b implements Runnable {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C20553c f77013E;

    /* JADX INFO: renamed from: w */
    public final C5101l0 f77014w;

    /* JADX INFO: renamed from: x */
    public final C20337g0 f77015x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC20281d f77016y;

    /* JADX INFO: renamed from: z */
    public final C20569s f77017z = new C20569s(-1);

    public RunnableC20552b(C20553c c20553c, C5101l0 c5101l0, C20337g0 c20337g0, InterfaceC20281d interfaceC20281d) {
        this.f77013E = c20553c;
        AbstractC29125c.m88510S(c5101l0, "Envelope is required.");
        this.f77014w = c5101l0;
        this.f77015x = c20337g0;
        AbstractC29125c.m88510S(interfaceC20281d, "EnvelopeCache is required.");
        this.f77016y = interfaceC20281d;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m56675a(RunnableC20552b runnableC20552b, AbstractC1772c1 abstractC1772c1, InterfaceC20364k interfaceC20364k) {
        runnableC20552b.f77013E.f77023y.getLogger().mo16066m(EnumC20436n5.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(abstractC1772c1.mo5410D()));
        interfaceC20364k.mo56036c(abstractC1772c1.mo5410D());
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC1772c1 m56676b() {
        C5101l0 c5101l0 = this.f77014w;
        ((C20619w4) c5101l0.f21443x).f77162z = null;
        InterfaceC20281d interfaceC20281d = this.f77016y;
        C20337g0 c20337g0 = this.f77015x;
        boolean zMo55935a0 = interfaceC20281d.mo55935a0(c5101l0, c20337g0);
        Object objM56491b = c20337g0.m56491b("sentry:typeCheckHint");
        boolean zIsInstance = AbstractC20356c.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint"));
        C20553c c20553c = this.f77013E;
        if (zIsInstance && objM56491b != null) {
            AbstractC20356c abstractC20356c = (AbstractC20356c) objM56491b;
            C20513q6 c20513q6 = c20553c.f77023y;
            if (abstractC20356c.mo56063f(((C20619w4) c5101l0.f21443x).f77159w)) {
                abstractC20356c.f76388w.countDown();
                c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Disk flush envelope fired", new Object[0]);
            } else {
                c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Not firing envelope flush as there's an ongoing transaction", new Object[0]);
            }
        }
        C20513q6 c20513q7 = c20553c.f77023y;
        if (!c20553c.f77018E.isConnected()) {
            Object objM56491b2 = c20337g0.m56491b("sentry:typeCheckHint");
            boolean zIsInstance2 = InterfaceC20361h.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint"));
            C20569s c20569s = this.f77017z;
            if (zIsInstance2 && objM56491b2 != null) {
                ((InterfaceC20361h) objM56491b2).mo56037d(true);
                return c20569s;
            }
            if (!zMo55935a0) {
                AbstractC22674j.m65706N(InterfaceC20361h.class, objM56491b2, c20513q7.getLogger());
                c20513q7.getClientReportRecorder().mo16071u(EnumC20296d.NETWORK_ERROR, c5101l0);
            }
            return c20569s;
        }
        C5101l0 c5101l0Mo16072y = c20513q7.getClientReportRecorder().mo16072y(c5101l0);
        try {
            try {
                ((C20619w4) c5101l0Mo16072y.f21443x).f77162z = AbstractC21598x.m60660P(Double.valueOf(c20513q7.getDateProvider().now().mo56606d() / 1000000.0d).longValue());
                AbstractC1772c1 abstractC1772c1M56685d = c20553c.f77019F.m56685d(c5101l0Mo16072y);
                if (abstractC1772c1M56685d.mo5410D()) {
                    interfaceC20281d.mo56255X0(c5101l0);
                    return abstractC1772c1M56685d;
                }
                String str = "The transport failed to send the envelope with response code " + abstractC1772c1M56685d.mo5408A();
                c20513q7.getLogger().mo16066m(EnumC20436n5.ERROR, str, new Object[0]);
                if (abstractC1772c1M56685d.mo5408A() >= 400) {
                    interfaceC20281d.mo56255X0(c5101l0);
                    if (abstractC1772c1M56685d.mo5408A() != 429) {
                        c20513q7.getClientReportRecorder().mo16071u(EnumC20296d.SEND_ERROR, c5101l0Mo16072y);
                    }
                }
                throw new IllegalStateException(str);
            } catch (IOException e5) {
                e = e5;
                Object objM56491b3 = c20337g0.m56491b("sentry:typeCheckHint");
                if (InterfaceC20361h.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint")) && objM56491b3 != null) {
                    ((InterfaceC20361h) objM56491b3).mo56037d(true);
                } else if (!zMo55935a0) {
                    AbstractC22674j.m65706N(InterfaceC20361h.class, objM56491b3, c20513q7.getLogger());
                    c20513q7.getClientReportRecorder().mo16071u(EnumC20296d.NETWORK_ERROR, c5101l0Mo16072y);
                }
                throw new IllegalStateException("Sending the event failed.", e);
            }
        } catch (IOException e13) {
            e = e13;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77013E.f77020G = this;
        AbstractC1772c1 abstractC1772c1M56676b = this.f77017z;
        try {
            abstractC1772c1M56676b = m56676b();
            this.f77013E.f77023y.getLogger().mo16066m(EnumC20436n5.DEBUG, "Envelope flushed", new Object[0]);
            C20337g0 c20337g0 = this.f77015x;
            Object objM56491b = c20337g0.m56491b("sentry:typeCheckHint");
            if (InterfaceC20364k.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint")) && objM56491b != null) {
                m56675a(this, abstractC1772c1M56676b, (InterfaceC20364k) objM56491b);
            }
            this.f77013E.f77020G = null;
        } catch (Throwable th3) {
            try {
                this.f77013E.f77023y.getLogger().mo16058i(EnumC20436n5.ERROR, th3, "Envelope submission failed", new Object[0]);
                throw th3;
            } catch (Throwable th4) {
                C20337g0 c20337g1 = this.f77015x;
                Object objM56491b2 = c20337g1.m56491b("sentry:typeCheckHint");
                if (InterfaceC20364k.class.isInstance(c20337g1.m56491b("sentry:typeCheckHint")) && objM56491b2 != null) {
                    m56675a(this, abstractC1772c1M56676b, (InterfaceC20364k) objM56491b2);
                }
                this.f77013E.f77020G = null;
                throw th4;
            }
        }
    }
}
