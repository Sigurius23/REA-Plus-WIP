package io.sentry.android.replay;

import android.content.Context;
import android.graphics.Bitmap;
import ge3.AbstractC15751g;
import io.sentry.C20371i4;
import io.sentry.C20412l5;
import io.sentry.C20513q6;
import io.sentry.C20535s;
import io.sentry.C20578u6;
import io.sentry.C20604v2;
import io.sentry.EnumC20418m;
import io.sentry.EnumC20431n0;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20347h1;
import io.sentry.InterfaceC20441o0;
import io.sentry.InterfaceC20545t1;
import io.sentry.InterfaceC20575u3;
import io.sentry.InterfaceC20605v3;
import io.sentry.RunnableC20277c7;
import io.sentry.android.replay.capture.AbstractC20187c;
import io.sentry.android.replay.capture.C20190f;
import io.sentry.android.replay.capture.C20199o;
import io.sentry.android.replay.capture.InterfaceC20196l;
import io.sentry.android.replay.gestures.C20208b;
import io.sentry.android.replay.util.ScheduledExecutorServiceC20236d;
import io.sentry.protocol.C20501v;
import io.sentry.transport.C20554d;
import io.sentry.transport.C20567q;
import io.sentry.transport.InterfaceC20566p;
import io.sentry.util.C20579a;
import io.sentry.util.C20588j;
import java.io.Closeable;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import l83.C23470p;
import p002a0.C0006a1;
import p005a3.C0222l0;
import p014aj.C0928c;
import p043c4.C3974q;
import p249jc.AbstractC21598x;
import p547v8.AbstractC35785b;
import p558vp.AbstractC36259c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import q83.AbstractC30060g;
import x30.AbstractC37926s0;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0003:\u0002\u0007\b¨\u0006\t"}, m65681d2 = {"Lio/sentry/android/replay/ReplayIntegration;", "Lio/sentry/t1;", "Ljava/io/Closeable;", "", "Lio/sentry/v3;", "Lio/sentry/o0;", "Lio/sentry/transport/p;", "io/sentry/android/replay/n", "io/sentry/j0", "sentry-android-replay_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class ReplayIntegration implements InterfaceC20545t1, Closeable, InterfaceC20605v3, InterfaceC20441o0, InterfaceC20566p {

    /* JADX INFO: renamed from: R */
    public static final /* synthetic */ int f75787R = 0;

    /* JADX INFO: renamed from: E */
    public C20371i4 f75788E;

    /* JADX INFO: renamed from: F */
    public C20203e0 f75789F;

    /* JADX INFO: renamed from: G */
    public C20208b f75790G;

    /* JADX INFO: renamed from: H */
    public final C23470p f75791H;

    /* JADX INFO: renamed from: I */
    public final C23470p f75792I;

    /* JADX INFO: renamed from: J */
    public final C23470p f75793J;

    /* JADX INFO: renamed from: K */
    public final AtomicBoolean f75794K;

    /* JADX INFO: renamed from: L */
    public final AtomicBoolean f75795L;

    /* JADX INFO: renamed from: M */
    public InterfaceC20196l f75796M;

    /* JADX INFO: renamed from: N */
    public InterfaceC20575u3 f75797N;

    /* JADX INFO: renamed from: O */
    public final C0928c f75798O;

    /* JADX INFO: renamed from: P */
    public final C20579a f75799P;

    /* JADX INFO: renamed from: Q */
    public final C20217p f75800Q;

    /* JADX INFO: renamed from: w */
    public final Context f75801w;

    /* JADX INFO: renamed from: x */
    public final C20554d f75802x;

    /* JADX INFO: renamed from: y */
    public volatile EnumC20431n0 f75803y;

    /* JADX INFO: renamed from: z */
    public C20513q6 f75804z;

    static {
        C20412l5.m56626d().m56628b("maven:io.sentry:sentry-android-replay", "8.41.0");
    }

    public ReplayIntegration(Context context) {
        C20554d c20554d = C20554d.f77025w;
        Context applicationContext = context.getApplicationContext();
        this.f75801w = applicationContext != null ? applicationContext : context;
        this.f75802x = c20554d;
        this.f75803y = EnumC20431n0.UNKNOWN;
        this.f75791H = AbstractC30060g.m92088H(C20179a.f75806y);
        this.f75792I = AbstractC30060g.m92088H(C20179a.f75807z);
        this.f75793J = AbstractC30060g.m92088H(new C0222l0(this, 13));
        this.f75794K = new AtomicBoolean(false);
        this.f75795L = new AtomicBoolean(false);
        this.f75797N = C20604v2.f77114a;
        this.f75798O = new C0928c(16, (byte) 0);
        this.f75799P = new C20579a();
        C20217p c20217p = new C20217p();
        c20217p.f75940a = EnumC20218q.INITIAL;
        this.f75800Q = c20217p;
    }

    @Override // io.sentry.InterfaceC20605v3
    /* JADX INFO: renamed from: J, reason: from getter */
    public final InterfaceC20575u3 getF75797N() {
        return this.f75797N;
    }

    /* JADX INFO: renamed from: T */
    public final void m56094T(String str) {
        File[] fileArrListFiles;
        C20513q6 c20513q6 = this.f75804z;
        if (c20513q6 == null) {
            AbstractC22676k.m65757q("options");
            throw null;
        }
        String cacheDirPath = c20513q6.getCacheDirPath();
        if (cacheDirPath == null || (fileArrListFiles = new File(cacheDirPath).listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            String name = file.getName();
            AbstractC22676k.m65747g(name);
            if (AbstractC39421y.m125930O(name, "replay_", false)) {
                String string = mo56101s().toString();
                AbstractC22676k.m65749i(string, "toString(...)");
                if (!AbstractC39414r.m125876U(name, string, false) && (AbstractC39414r.m125890i0(str) || !AbstractC39414r.m125876U(name, str, false))) {
                    AbstractC15751g.m44465r(file);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m56095a0() {
        return this.f75800Q.f75940a.compareTo(EnumC20218q.STARTED) >= 0 && this.f75800Q.f75940a.compareTo(EnumC20218q.STOPPED) < 0;
    }

    @Override // io.sentry.InterfaceC20441o0
    /* JADX INFO: renamed from: b */
    public final void mo55903b(EnumC20431n0 status) {
        AbstractC22676k.m65750j(status, "status");
        this.f75803y = status;
        if (this.f75796M instanceof C20199o) {
            if (status == EnumC20431n0.DISCONNECTED) {
                m56100p0();
            } else {
                m56103x0();
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m56096b0(Bitmap bitmap) {
        C20371i4 c20371i4;
        C20371i4 c20371i5;
        C20567q c20567qMo56430j;
        C20567q c20567qMo56430j2;
        AbstractC22676k.m65750j(bitmap, "bitmap");
        C22669g0 c22669g0 = new C22669g0();
        C20371i4 c20371i6 = this.f75788E;
        if (c20371i6 != null) {
            c20371i6.mo56439s(new C20214m(c22669g0, 0));
        }
        InterfaceC20196l interfaceC20196l = this.f75796M;
        if (interfaceC20196l != null) {
            interfaceC20196l.mo56115d(new C3974q(3, bitmap, c22669g0));
        }
        if (this.f75796M instanceof C20199o) {
            if (this.f75803y == EnumC20431n0.DISCONNECTED || !(((c20371i4 = this.f75788E) == null || (c20567qMo56430j2 = c20371i4.mo56430j()) == null || !c20567qMo56430j2.m56688h(EnumC20418m.All)) && ((c20371i5 = this.f75788E) == null || (c20567qMo56430j = c20371i5.mo56430j()) == null || !c20567qMo56430j.m56688h(EnumC20418m.Replay)))) {
                m56100p0();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C20567q c20567qMo56430j;
        C20217p c20217p = this.f75800Q;
        C20535s c20535sM56711a = this.f75799P.m56711a();
        try {
            if (this.f75794K.get()) {
                EnumC20218q enumC20218q = EnumC20218q.CLOSED;
                if (c20217p.m56141a(enumC20218q)) {
                    C20513q6 c20513q6 = this.f75804z;
                    if (c20513q6 == null) {
                        AbstractC22676k.m65757q("options");
                        throw null;
                    }
                    c20513q6.getConnectionStatusProvider().mo55988W0(this);
                    C20371i4 c20371i4 = this.f75788E;
                    if (c20371i4 != null && (c20567qMo56430j = c20371i4.mo56430j()) != null) {
                        c20567qMo56430j.f77047z.remove(this);
                    }
                    stop();
                    C20203e0 c20203e0 = this.f75789F;
                    if (c20203e0 != null) {
                        c20203e0.close();
                    }
                    this.f75789F = null;
                    ((C20231t) this.f75792I.getValue()).close();
                    ((ScheduledExecutorServiceC20236d) this.f75793J.getValue()).shutdown();
                    c20217p.f75940a = enumC20218q;
                    AbstractC21598x.m60698r(c20535sM56711a, null);
                    return;
                }
            }
            AbstractC21598x.m60698r(c20535sM56711a, null);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC21598x.m60698r(c20535sM56711a, th3);
                throw th4;
            }
        }
    }

    @Override // io.sentry.InterfaceC20605v3
    /* JADX INFO: renamed from: h */
    public final void mo56097h(C20200d c20200d) {
        this.f75797N = c20200d;
    }

    @Override // io.sentry.InterfaceC20605v3
    /* JADX INFO: renamed from: i */
    public final void mo56098i(Boolean bool) {
        if (this.f75794K.get() && m56095a0()) {
            C20501v c20501v = C20501v.f76802x;
            InterfaceC20196l interfaceC20196l = this.f75796M;
            if (c20501v.equals(interfaceC20196l != null ? ((AbstractC20187c) interfaceC20196l).m56106g() : null)) {
                C20513q6 c20513q6 = this.f75804z;
                if (c20513q6 != null) {
                    c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Replay id is not set, not capturing for event", new Object[0]);
                    return;
                } else {
                    AbstractC22676k.m65757q("options");
                    throw null;
                }
            }
            InterfaceC20196l interfaceC20196l2 = this.f75796M;
            if (interfaceC20196l2 != null) {
                interfaceC20196l2.mo56116e(bool.equals(Boolean.TRUE), new C0006a1(this, 28));
            }
            InterfaceC20196l interfaceC20196l3 = this.f75796M;
            this.f75796M = interfaceC20196l3 != null ? interfaceC20196l3.mo56114b() : null;
        }
    }

    @Override // io.sentry.transport.InterfaceC20566p
    /* JADX INFO: renamed from: k */
    public final void mo55955k(C20567q c20567q) {
        if (this.f75796M instanceof C20199o) {
            if (c20567q.m56688h(EnumC20418m.All) || c20567q.m56688h(EnumC20418m.Replay)) {
                m56100p0();
            } else {
                m56103x0();
            }
        }
    }

    @Override // io.sentry.InterfaceC20545t1
    /* JADX INFO: renamed from: m */
    public final void mo55878m(C20513q6 c20513q6) {
        Double d3;
        this.f75804z = c20513q6;
        Double d14 = c20513q6.getSessionReplay().f77063e;
        if ((d14 == null || d14.doubleValue() <= 0.0d) && ((d3 = c20513q6.getSessionReplay().f77064f) == null || d3.doubleValue() <= 0.0d)) {
            c20513q6.getLogger().mo16066m(EnumC20436n5.INFO, "Session replay is disabled, no sample rate specified", new Object[0]);
            return;
        }
        C20371i4 c20371i4 = C20371i4.f76402a;
        this.f75788E = c20371i4;
        this.f75789F = new C20203e0(c20513q6, this, this, this.f75798O, (ScheduledExecutorServiceC20236d) this.f75793J.getValue());
        this.f75790G = new C20208b(c20513q6, this);
        this.f75794K.set(true);
        c20513q6.getConnectionStatusProvider().mo55986K0(this);
        C20567q c20567qMo56430j = c20371i4.mo56430j();
        if (c20567qMo56430j != null) {
            c20567qMo56430j.f77047z.add(this);
        }
        AbstractC21598x.m60683i("Replay");
        C20513q6 c20513q7 = this.f75804z;
        if (c20513q7 == null) {
            AbstractC22676k.m65757q("options");
            throw null;
        }
        InterfaceC20347h1 executorService = c20513q7.getExecutorService();
        AbstractC22676k.m65749i(executorService, "getExecutorService(...)");
        C20513q6 c20513q8 = this.f75804z;
        if (c20513q8 != null) {
            AbstractC36259c.m115702n0(executorService, c20513q8, new RunnableC20277c7(this, 10));
        } else {
            AbstractC22676k.m65757q("options");
            throw null;
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m56099o0(int i13, int i14) {
        C20203e0 c20203e0;
        if (this.f75794K.get() && m56095a0()) {
            C20513q6 c20513q6 = this.f75804z;
            if (c20513q6 == null) {
                AbstractC22676k.m65757q("options");
                throw null;
            }
            if (c20513q6.getSessionReplay().f77070l) {
                Context context = this.f75801w;
                C20513q6 c20513q7 = this.f75804z;
                if (c20513q7 == null) {
                    AbstractC22676k.m65757q("options");
                    throw null;
                }
                C20578u6 sessionReplay = c20513q7.getSessionReplay();
                AbstractC22676k.m65749i(sessionReplay, "getSessionReplay(...)");
                C20253w c20253wM113422q = AbstractC35785b.m113422q(context, sessionReplay, i13, i14);
                if (this.f75794K.get() && m56095a0()) {
                    InterfaceC20196l interfaceC20196l = this.f75796M;
                    if (interfaceC20196l != null) {
                        interfaceC20196l.mo56113a(c20253wM113422q);
                    }
                    C20203e0 c20203e1 = this.f75789F;
                    if (c20203e1 != null) {
                        c20203e1.m56127k(c20253wM113422q);
                    }
                    if (this.f75800Q.f75940a != EnumC20218q.PAUSED || (c20203e0 = this.f75789F) == null) {
                        return;
                    }
                    c20203e0.m56128m();
                }
            }
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m56100p0() {
        C20217p c20217p = this.f75800Q;
        C20535s c20535sM56711a = this.f75799P.m56711a();
        try {
            if (this.f75794K.get()) {
                EnumC20218q enumC20218q = EnumC20218q.PAUSED;
                if (c20217p.m56141a(enumC20218q)) {
                    C20203e0 c20203e0 = this.f75789F;
                    if (c20203e0 != null) {
                        c20203e0.m56128m();
                    }
                    InterfaceC20196l interfaceC20196l = this.f75796M;
                    if (interfaceC20196l != null) {
                        interfaceC20196l.pause();
                    }
                    c20217p.f75940a = enumC20218q;
                    AbstractC21598x.m60698r(c20535sM56711a, null);
                    return;
                }
            }
            AbstractC21598x.m60698r(c20535sM56711a, null);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC21598x.m60698r(c20535sM56711a, th3);
                throw th4;
            }
        }
    }

    @Override // io.sentry.InterfaceC20605v3
    public final void pause() {
        this.f75795L.set(true);
        m56100p0();
    }

    @Override // io.sentry.InterfaceC20605v3
    public final void resume() {
        this.f75795L.set(false);
        m56103x0();
    }

    @Override // io.sentry.InterfaceC20605v3
    /* JADX INFO: renamed from: s */
    public final C20501v mo56101s() {
        C20501v c20501vM56106g;
        InterfaceC20196l interfaceC20196l = this.f75796M;
        if (interfaceC20196l != null && (c20501vM56106g = ((AbstractC20187c) interfaceC20196l).m56106g()) != null) {
            return c20501vM56106g;
        }
        C20501v EMPTY_ID = C20501v.f76802x;
        AbstractC22676k.m65749i(EMPTY_ID, "EMPTY_ID");
        return EMPTY_ID;
    }

    @Override // io.sentry.InterfaceC20605v3
    public final void stop() {
        C20217p c20217p = this.f75800Q;
        C20535s c20535sM56711a = this.f75799P.m56711a();
        try {
            if (this.f75794K.get()) {
                EnumC20218q enumC20218q = EnumC20218q.STOPPED;
                if (c20217p.m56141a(enumC20218q)) {
                    if (this.f75789F != null) {
                        C20220s c20220sM56152b = ((C20231t) this.f75792I.getValue()).m56152b();
                        C20203e0 c20203e0 = this.f75789F;
                        AbstractC22676k.m65748h(c20203e0, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
                        c20220sM56152b.remove(c20203e0);
                    }
                    ((C20231t) this.f75792I.getValue()).m56152b().remove(this.f75790G);
                    C20203e0 c20203e1 = this.f75789F;
                    if (c20203e1 != null) {
                        c20203e1.reset();
                    }
                    C20203e0 c20203e2 = this.f75789F;
                    if (c20203e2 != null) {
                        c20203e2.m56123J();
                    }
                    C20208b c20208b = this.f75790G;
                    if (c20208b != null) {
                        c20208b.m56133c();
                    }
                    InterfaceC20196l interfaceC20196l = this.f75796M;
                    if (interfaceC20196l != null) {
                        interfaceC20196l.stop();
                    }
                    this.f75796M = null;
                    c20217p.f75940a = enumC20218q;
                    AbstractC21598x.m60698r(c20535sM56711a, null);
                    return;
                }
            }
            AbstractC21598x.m60698r(c20535sM56711a, null);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC21598x.m60698r(c20535sM56711a, th3);
                throw th4;
            }
        }
    }

    @Override // io.sentry.InterfaceC20605v3
    /* JADX INFO: renamed from: x */
    public final void mo56102x() {
        InterfaceC20196l c20190f;
        C20217p c20217p = this.f75800Q;
        C20535s c20535sM56711a = this.f75799P.m56711a();
        try {
            if (!this.f75794K.get()) {
                AbstractC21598x.m60698r(c20535sM56711a, null);
                return;
            }
            EnumC20218q enumC20218q = EnumC20218q.STARTED;
            if (!c20217p.m56141a(enumC20218q)) {
                C20513q6 c20513q6 = this.f75804z;
                if (c20513q6 == null) {
                    AbstractC22676k.m65757q("options");
                    throw null;
                }
                c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Session replay is already being recorded, not starting a new one", new Object[0]);
                AbstractC21598x.m60698r(c20535sM56711a, null);
                return;
            }
            C20588j c20588j = (C20588j) this.f75791H.getValue();
            C20513q6 c20513q7 = this.f75804z;
            if (c20513q7 == null) {
                AbstractC22676k.m65757q("options");
                throw null;
            }
            boolean zM121453E = AbstractC37926s0.m121453E(c20588j, c20513q7.getSessionReplay().f77063e);
            if (!zM121453E) {
                C20513q6 c20513q8 = this.f75804z;
                if (c20513q8 == null) {
                    AbstractC22676k.m65757q("options");
                    throw null;
                }
                Double d3 = c20513q8.getSessionReplay().f77064f;
                if (!(d3 != null && d3.doubleValue() > 0.0d)) {
                    C20513q6 c20513q9 = this.f75804z;
                    if (c20513q9 == null) {
                        AbstractC22676k.m65757q("options");
                        throw null;
                    }
                    c20513q9.getLogger().mo16066m(EnumC20436n5.INFO, "Session replay is not started, full session was not sampled and onErrorSampleRate is not specified", new Object[0]);
                    AbstractC21598x.m60698r(c20535sM56711a, null);
                    return;
                }
            }
            c20217p.f75940a = enumC20218q;
            if (zM121453E) {
                C20513q6 c20513q10 = this.f75804z;
                if (c20513q10 == null) {
                    AbstractC22676k.m65757q("options");
                    throw null;
                }
                c20190f = new C20199o(c20513q10, this.f75788E, this.f75802x, (ScheduledExecutorServiceC20236d) this.f75793J.getValue());
            } else {
                C20513q6 c20513q11 = this.f75804z;
                if (c20513q11 == null) {
                    AbstractC22676k.m65757q("options");
                    throw null;
                }
                c20190f = new C20190f(c20513q11, this.f75788E, this.f75802x, (C20588j) this.f75791H.getValue(), (ScheduledExecutorServiceC20236d) this.f75793J.getValue());
            }
            this.f75796M = c20190f;
            C20203e0 c20203e0 = this.f75789F;
            if (c20203e0 != null) {
                c20203e0.m56130x();
            }
            InterfaceC20196l interfaceC20196l = this.f75796M;
            if (interfaceC20196l != null) {
                interfaceC20196l.mo56105c(0, new C20501v(), null);
            }
            if (this.f75789F != null) {
                C20220s c20220sM56152b = ((C20231t) this.f75792I.getValue()).m56152b();
                C20203e0 c20203e1 = this.f75789F;
                AbstractC22676k.m65748h(c20203e1, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
                c20220sM56152b.add(c20203e1);
            }
            ((C20231t) this.f75792I.getValue()).m56152b().add(this.f75790G);
            AbstractC21598x.m60698r(c20535sM56711a, null);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC21598x.m60698r(c20535sM56711a, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m56103x0() {
        C20371i4 c20371i4;
        C20371i4 c20371i5;
        C20567q c20567qMo56430j;
        C20567q c20567qMo56430j2;
        C20535s c20535sM56711a = this.f75799P.m56711a();
        try {
            if (this.f75794K.get()) {
                C20217p c20217p = this.f75800Q;
                EnumC20218q enumC20218q = EnumC20218q.RESUMED;
                if (c20217p.m56141a(enumC20218q)) {
                    if (!this.f75795L.get() && this.f75803y != EnumC20431n0.DISCONNECTED && (((c20371i4 = this.f75788E) == null || (c20567qMo56430j2 = c20371i4.mo56430j()) == null || !c20567qMo56430j2.m56688h(EnumC20418m.All)) && ((c20371i5 = this.f75788E) == null || (c20567qMo56430j = c20371i5.mo56430j()) == null || !c20567qMo56430j.m56688h(EnumC20418m.Replay)))) {
                        C20217p c20217p2 = this.f75800Q;
                        c20217p2.getClass();
                        c20217p2.f75940a = enumC20218q;
                        InterfaceC20196l interfaceC20196l = this.f75796M;
                        if (interfaceC20196l != null) {
                            ((AbstractC20187c) interfaceC20196l).m56109j();
                        }
                        C20203e0 c20203e0 = this.f75789F;
                        if (c20203e0 != null) {
                            c20203e0.m56129s();
                        }
                        AbstractC21598x.m60698r(c20535sM56711a, null);
                        return;
                    }
                    AbstractC21598x.m60698r(c20535sM56711a, null);
                    return;
                }
            }
            AbstractC21598x.m60698r(c20535sM56711a, null);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC21598x.m60698r(c20535sM56711a, th3);
                throw th4;
            }
        }
    }
}
