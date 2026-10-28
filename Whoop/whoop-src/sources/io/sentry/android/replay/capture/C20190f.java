package io.sentry.android.replay.capture;

import android.view.MotionEvent;
import com.mapbox.common.module.RunnableC5445c;
import hn.C17508p;
import io.sentry.C20371i4;
import io.sentry.C20513q6;
import io.sentry.C20535s;
import io.sentry.EnumC20436n5;
import io.sentry.EnumC20521r6;
import io.sentry.InterfaceC20308d1;
import io.sentry.android.core.RunnableC20151r0;
import io.sentry.android.replay.C20212k;
import io.sentry.android.replay.C20213l;
import io.sentry.android.replay.C20253w;
import io.sentry.android.replay.util.RunnableC20237e;
import io.sentry.android.replay.util.ScheduledExecutorServiceC20236d;
import io.sentry.rrweb.AbstractC20523b;
import io.sentry.transport.C20554d;
import io.sentry.transport.InterfaceC20556f;
import io.sentry.util.C20588j;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;
import m83.AbstractC25265s;
import p002a0.C0006a1;
import p026b2.C2320z;
import p043c4.C3974q;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C20190f extends AbstractC20187c {

    /* JADX INFO: renamed from: r */
    public final C20513q6 f75856r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC20308d1 f75857s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC20556f f75858t;

    /* JADX INFO: renamed from: u */
    public final C20588j f75859u;

    /* JADX INFO: renamed from: v */
    public final ArrayList f75860v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20190f(C20513q6 options, C20371i4 c20371i4, C20554d dateProvider, C20588j random, ScheduledExecutorServiceC20236d executor) {
        super(options, c20371i4, dateProvider, executor);
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(dateProvider, "dateProvider");
        AbstractC22676k.m65750j(random, "random");
        AbstractC22676k.m65750j(executor, "executor");
        this.f75856r = options;
        this.f75857s = c20371i4;
        this.f75858t = dateProvider;
        this.f75859u = random;
        this.f75860v = new ArrayList();
    }

    @Override // io.sentry.android.replay.capture.InterfaceC20196l
    /* JADX INFO: renamed from: a */
    public final void mo56113a(C20253w c20253w) {
        m56117n("configuration_changed", new C20189e(this, 0));
        m56111l(c20253w);
    }

    @Override // io.sentry.android.replay.capture.InterfaceC20196l
    /* JADX INFO: renamed from: b */
    public final InterfaceC20196l mo56114b() {
        boolean z4 = this.f75837g.get();
        C20513q6 c20513q6 = this.f75856r;
        if (z4) {
            c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Not converting to session mode, because the process is about to terminate", new Object[0]);
            return this;
        }
        C20199o c20199o = new C20199o(c20513q6, this.f75857s, this.f75858t, this.f75834d);
        c20199o.m56111l(m56108i());
        c20199o.mo56105c(m56107h(), m56106g(), EnumC20521r6.BUFFER);
        return c20199o;
    }

    @Override // io.sentry.android.replay.capture.InterfaceC20196l
    /* JADX INFO: renamed from: d */
    public final void mo56115d(C3974q c3974q) {
        this.f75834d.submit(new RunnableC20237e(new RunnableC5445c(this, c3974q, this.f75858t.mo52216c(), 4), "BufferCaptureStrategy.add_frame"));
    }

    @Override // io.sentry.android.replay.capture.InterfaceC20196l
    /* JADX INFO: renamed from: e */
    public final void mo56116e(boolean z4, C0006a1 c0006a1) {
        C20513q6 c20513q6 = this.f75856r;
        if (!AbstractC37926s0.m121453E(this.f75859u, c20513q6.getSessionReplay().f77064f)) {
            c20513q6.getLogger().mo16066m(EnumC20436n5.INFO, "Replay wasn't sampled by onErrorSampleRate, not capturing for event", new Object[0]);
            return;
        }
        InterfaceC20308d1 interfaceC20308d1 = this.f75857s;
        if (interfaceC20308d1 != null) {
            interfaceC20308d1.mo56439s(new C17508p(this, 18));
        }
        if (!z4) {
            m56117n("capture_replay", new C2320z(14, this, c0006a1));
        } else {
            this.f75837g.set(true);
            c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Not capturing replay for crashed event, will be captured on next launch", new Object[0]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX INFO: renamed from: n */
    public final void m56117n(String str, Function1 function1) {
        Date dateM60660P;
        C20253w c20253wM56108i = m56108i();
        C20513q6 c20513q6 = this.f75856r;
        if (c20253wM56108i == null) {
            c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Recorder config is not set, not creating segment for task: ".concat(str), new Object[0]);
            return;
        }
        long j7 = c20513q6.getSessionReplay().f77067i;
        long jMo52216c = this.f75858t.mo52216c();
        C20212k c20212k = this.f75838h;
        if (c20212k != null) {
            C20535s c20535sM56711a = c20212k.f75924F.m56711a();
            try {
                C20213l c20213l = (C20213l) AbstractC25265s.m74100H0(c20212k.f75927I);
                Long lValueOf = c20213l != null ? Long.valueOf(c20213l.f75935b) : null;
                AbstractC21598x.m60698r(c20535sM56711a, null);
                if (lValueOf == null || (dateM60660P = AbstractC21598x.m60660P(lValueOf.longValue())) == null) {
                    dateM60660P = AbstractC21598x.m60660P(jMo52216c - j7);
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC21598x.m60698r(c20535sM56711a, th3);
                    throw th4;
                }
            }
        } else {
            dateM60660P = AbstractC21598x.m60660P(jMo52216c - j7);
        }
        AbstractC22676k.m65747g(dateM60660P);
        this.f75834d.submit(new RunnableC20237e(new RunnableC20188d(this, jMo52216c - dateM60660P.getTime(), dateM60660P, m56106g(), c20253wM56108i, function1), "BufferCaptureStrategy.".concat(str)));
    }

    @Override // io.sentry.android.replay.capture.AbstractC20187c, io.sentry.android.replay.capture.InterfaceC20196l
    public final void onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        long jMo52216c = this.f75858t.mo52216c() - this.f75856r.getSessionReplay().f77067i;
        ConcurrentLinkedDeque events = this.f75846p;
        AbstractC22676k.m65750j(events, "events");
        Iterator it = events.iterator();
        AbstractC22676k.m65749i(it, "iterator(...)");
        while (it.hasNext()) {
            if (((AbstractC20523b) it.next()).f76901x < jMo52216c) {
                it.remove();
            }
        }
    }

    @Override // io.sentry.android.replay.capture.InterfaceC20196l
    public final void pause() {
        m56117n("pause", new C20189e(this, 1));
    }

    @Override // io.sentry.android.replay.capture.AbstractC20187c, io.sentry.android.replay.capture.InterfaceC20196l
    public final void stop() {
        C20212k c20212k = this.f75838h;
        this.f75834d.submit(new RunnableC20237e(new RunnableC20151r0(3, c20212k != null ? c20212k.m56137i() : null, this), "BufferCaptureStrategy.stop"));
        super.stop();
    }
}
