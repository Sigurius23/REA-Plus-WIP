package io.sentry.android.replay.capture;

import hn.C17508p;
import io.sentry.C20337g0;
import io.sentry.C20513q6;
import io.sentry.EnumC20436n5;
import io.sentry.EnumC20521r6;
import io.sentry.InterfaceC20308d1;
import io.sentry.android.replay.C20212k;
import io.sentry.android.replay.C20253w;
import io.sentry.android.replay.util.RunnableC20237e;
import io.sentry.protocol.C20501v;
import io.sentry.transport.InterfaceC20556f;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import p002a0.C0006a1;
import p026b2.C2320z;
import p043c4.C3974q;
import p213i7.C18194g;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C20199o extends AbstractC20187c {

    /* JADX INFO: renamed from: r */
    public final C20513q6 f75870r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC20308d1 f75871s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC20556f f75872t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20199o(C20513q6 options, InterfaceC20308d1 interfaceC20308d1, InterfaceC20556f dateProvider, ScheduledExecutorService executor) {
        super(options, interfaceC20308d1, dateProvider, executor);
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(dateProvider, "dateProvider");
        AbstractC22676k.m65750j(executor, "executor");
        this.f75870r = options;
        this.f75871s = interfaceC20308d1;
        this.f75872t = dateProvider;
    }

    @Override // io.sentry.android.replay.capture.InterfaceC20196l
    /* JADX INFO: renamed from: a */
    public final void mo56113a(C20253w c20253w) {
        m56121n("onConfigurationChanged", new C20198n(this, 0));
        m56111l(c20253w);
    }

    @Override // io.sentry.android.replay.capture.InterfaceC20196l
    /* JADX INFO: renamed from: b */
    public final InterfaceC20196l mo56114b() {
        return this;
    }

    @Override // io.sentry.android.replay.capture.AbstractC20187c, io.sentry.android.replay.capture.InterfaceC20196l
    /* JADX INFO: renamed from: c */
    public final void mo56105c(int i13, C20501v replayId, EnumC20521r6 enumC20521r6) {
        AbstractC22676k.m65750j(replayId, "replayId");
        super.mo56105c(i13, replayId, enumC20521r6);
        InterfaceC20308d1 interfaceC20308d1 = this.f75871s;
        if (interfaceC20308d1 != null) {
            interfaceC20308d1.mo56439s(new C17508p(this, 19));
        }
    }

    @Override // io.sentry.android.replay.capture.InterfaceC20196l
    /* JADX INFO: renamed from: d */
    public final void mo56115d(final C3974q c3974q) {
        final C20253w c20253wM56108i = m56108i();
        final long jMo52216c = this.f75872t.mo52216c();
        this.f75834d.submit(new RunnableC20237e(new Runnable() { // from class: io.sentry.android.replay.capture.m
            @Override // java.lang.Runnable
            public final void run() {
                C20199o c20199o = this.f75864w;
                C20212k c20212k = c20199o.f75838h;
                C20513q6 c20513q6 = c20199o.f75870r;
                if (c20212k != null) {
                    c3974q.invoke(c20212k, Long.valueOf(jMo52216c));
                }
                Date date = (Date) c20199o.f75840j.getValue(c20199o, AbstractC20187c.f75830q[1]);
                if (date == null) {
                    c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Segment timestamp is not set, not recording frame", new Object[0]);
                    return;
                }
                if (c20199o.f75837g.get()) {
                    c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Not capturing segment, because the app is terminating, will be captured on next launch", new Object[0]);
                    return;
                }
                C20253w c20253w = c20253wM56108i;
                if (c20253w == null) {
                    c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Recorder config is not set, not capturing a segment", new Object[0]);
                    return;
                }
                long jMo52216c2 = c20199o.f75872t.mo52216c();
                if (jMo52216c2 - date.getTime() >= c20513q6.getSessionReplay().f77068j) {
                    AbstractC20195k abstractC20195kM56104f = AbstractC20187c.m56104f(c20199o, c20513q6.getSessionReplay().f77068j, date, c20199o.m56106g(), c20199o.m56107h(), c20253w.f76070b, c20253w.f76069a, c20253w.f76073e, c20253w.f76074f);
                    if (abstractC20195kM56104f instanceof C20193i) {
                        C20193i c20193i = (C20193i) abstractC20195kM56104f;
                        c20193i.m56120a(c20199o.f75871s, new C20337g0());
                        c20199o.m56110k(c20199o.m56107h() + 1);
                        c20199o.m56112m(c20193i.f75861a.f76991U);
                    }
                }
                if (jMo52216c2 - c20199o.f75841k.get() >= c20513q6.getSessionReplay().f77069k) {
                    c20513q6.getReplayController().stop();
                    c20513q6.getLogger().mo16066m(EnumC20436n5.INFO, "Session replay deadline exceeded (1h), stopping recording", new Object[0]);
                }
            }
        }, "SessionCaptureStrategy.add_frame"));
    }

    @Override // io.sentry.android.replay.capture.InterfaceC20196l
    /* JADX INFO: renamed from: e */
    public final void mo56116e(boolean z4, C0006a1 c0006a1) {
        C20513q6 c20513q6 = this.f75870r;
        if (c20513q6.getSessionReplay().f77072n) {
            c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Replay is already running in 'session' mode, not capturing for event", new Object[0]);
        }
        this.f75837g.set(z4);
    }

    /* JADX INFO: renamed from: n */
    public final void m56121n(String str, Function1 function1) {
        C20253w c20253wM56108i = m56108i();
        if (c20253wM56108i == null) {
            this.f75870r.getLogger().mo16066m(EnumC20436n5.DEBUG, "Recorder config is not set, not creating segment for task: ".concat(str), new Object[0]);
            return;
        }
        long jMo52216c = this.f75872t.mo52216c();
        Date date = (Date) this.f75840j.getValue(this, AbstractC20187c.f75830q[1]);
        if (date == null) {
            return;
        }
        long time = jMo52216c - date.getTime();
        C20501v c20501vM56106g = m56106g();
        this.f75834d.submit(new RunnableC20237e(new RunnableC20188d(this, time, date, c20501vM56106g, c20253wM56108i, function1), "SessionCaptureStrategy.".concat(str)));
    }

    @Override // io.sentry.android.replay.capture.InterfaceC20196l
    public final void pause() {
        m56121n("pause", new C20198n(this, 1));
    }

    @Override // io.sentry.android.replay.capture.AbstractC20187c, io.sentry.android.replay.capture.InterfaceC20196l
    public final void stop() {
        C20212k c20212k = this.f75838h;
        m56121n("stop", new C2320z(16, this, c20212k != null ? c20212k.m56137i() : null));
        InterfaceC20308d1 interfaceC20308d1 = this.f75871s;
        if (interfaceC20308d1 != null) {
            interfaceC20308d1.mo56439s(new C18194g(17));
        }
        super.stop();
    }
}
