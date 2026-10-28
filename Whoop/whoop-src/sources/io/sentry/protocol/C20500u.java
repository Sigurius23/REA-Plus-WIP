package io.sentry.protocol;

import ih0.AbstractC18489d0;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.HashMap;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.protocol.u */
/* JADX INFO: loaded from: classes5.dex */
public final class C20500u implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public C20469b0 f76795E;

    /* JADX INFO: renamed from: F */
    public C20490n f76796F;

    /* JADX INFO: renamed from: G */
    public HashMap f76797G;

    /* JADX INFO: renamed from: w */
    public String f76798w;

    /* JADX INFO: renamed from: x */
    public String f76799x;

    /* JADX INFO: renamed from: y */
    public String f76800y;

    /* JADX INFO: renamed from: z */
    public Long f76801z;

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        if (this.f76798w != null) {
            c37199o.m119207K("type");
            c37199o.m119222b0(this.f76798w);
        }
        if (this.f76799x != null) {
            c37199o.m119207K("value");
            c37199o.m119222b0(this.f76799x);
        }
        if (this.f76800y != null) {
            c37199o.m119207K("module");
            c37199o.m119222b0(this.f76800y);
        }
        if (this.f76801z != null) {
            c37199o.m119207K("thread_id");
            c37199o.m119221a0(this.f76801z);
        }
        if (this.f76795E != null) {
            c37199o.m119207K("stacktrace");
            c37199o.m119219Y(interfaceC20602v0, this.f76795E);
        }
        if (this.f76796F != null) {
            c37199o.m119207K("mechanism");
            c37199o.m119219Y(interfaceC20602v0, this.f76796F);
        }
        HashMap map = this.f76797G;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC18489d0.m53385z(this.f76797G, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
