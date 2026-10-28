package io.sentry;

import aa3.C0656u0;
import ih0.AbstractC18489d0;
import io.sentry.protocol.C20490n;
import io.sentry.protocol.C20491o;
import io.sentry.protocol.C20500u;
import io.sentry.protocol.C20501v;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p249jc.AbstractC21598x;
import p581we.C37199o;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.e5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20321e5 extends AbstractC20519r4 implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: P */
    public Date f76300P;

    /* JADX INFO: renamed from: Q */
    public C20491o f76301Q;

    /* JADX INFO: renamed from: R */
    public String f76302R;

    /* JADX INFO: renamed from: S */
    public C0656u0 f76303S;

    /* JADX INFO: renamed from: T */
    public C0656u0 f76304T;

    /* JADX INFO: renamed from: U */
    public EnumC20436n5 f76305U;

    /* JADX INFO: renamed from: V */
    public String f76306V;

    /* JADX INFO: renamed from: W */
    public List f76307W;

    /* JADX INFO: renamed from: X */
    public ConcurrentHashMap f76308X;

    /* JADX INFO: renamed from: Y */
    public AbstractMap f76309Y;

    public C20321e5(Throwable th3) {
        this();
        this.f76877J = th3;
    }

    /* JADX INFO: renamed from: d */
    public final ArrayList m56480d() {
        C0656u0 c0656u0 = this.f76304T;
        if (c0656u0 == null) {
            return null;
        }
        return c0656u0.m1647p();
    }

    /* JADX INFO: renamed from: e */
    public final ArrayList m56481e() {
        C0656u0 c0656u0 = this.f76303S;
        if (c0656u0 != null) {
            return c0656u0.m1647p();
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final C20500u m56482f() {
        Boolean bool;
        C0656u0 c0656u0 = this.f76304T;
        if (c0656u0 == null) {
            return null;
        }
        for (C20500u c20500u : c0656u0.m1647p()) {
            C20490n c20490n = c20500u.f76796F;
            if (c20490n != null && (bool = c20490n.f76743z) != null && !bool.booleanValue()) {
                return c20500u;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m56483g() {
        C0656u0 c0656u0 = this.f76304T;
        return (c0656u0 == null || c0656u0.m1647p().isEmpty()) ? false : true;
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        c37199o.m119207K("timestamp");
        c37199o.m119219Y(interfaceC20602v0, this.f76300P);
        if (this.f76301Q != null) {
            c37199o.m119207K("message");
            c37199o.m119219Y(interfaceC20602v0, this.f76301Q);
        }
        if (this.f76302R != null) {
            c37199o.m119207K("logger");
            c37199o.m119222b0(this.f76302R);
        }
        C0656u0 c0656u0 = this.f76303S;
        if (c0656u0 != null && !c0656u0.m1647p().isEmpty()) {
            c37199o.m119207K("threads");
            c37199o.m119227i();
            c37199o.m119207K("values");
            c37199o.m119219Y(interfaceC20602v0, this.f76303S.m1647p());
            c37199o.m119200C();
        }
        C0656u0 c0656u1 = this.f76304T;
        if (c0656u1 != null && !c0656u1.m1647p().isEmpty()) {
            c37199o.m119207K("exception");
            c37199o.m119227i();
            c37199o.m119207K("values");
            c37199o.m119219Y(interfaceC20602v0, this.f76304T.m1647p());
            c37199o.m119200C();
        }
        if (this.f76305U != null) {
            c37199o.m119207K("level");
            c37199o.m119219Y(interfaceC20602v0, this.f76305U);
        }
        if (this.f76306V != null) {
            c37199o.m119207K("transaction");
            c37199o.m119222b0(this.f76306V);
        }
        if (this.f76307W != null) {
            c37199o.m119207K("fingerprint");
            c37199o.m119219Y(interfaceC20602v0, this.f76307W);
        }
        if (this.f76309Y != null) {
            c37199o.m119207K("modules");
            c37199o.m119219Y(interfaceC20602v0, this.f76309Y);
        }
        AbstractC29125c.m88512U(this, c37199o, interfaceC20602v0);
        ConcurrentHashMap concurrentHashMap = this.f76308X;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76308X, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }

    public C20321e5() {
        C20501v c20501v = new C20501v();
        Date dateM60659O = AbstractC21598x.m60659O();
        super(c20501v);
        this.f76300P = dateM60659O;
    }
}
