package io.sentry.protocol;

import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.api.QueryParams;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import p581we.C37199o;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.protocol.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C20496q implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public String f76767E;

    /* JADX INFO: renamed from: F */
    public ConcurrentHashMap f76768F;

    /* JADX INFO: renamed from: G */
    public ConcurrentHashMap f76769G;

    /* JADX INFO: renamed from: H */
    public Long f76770H;

    /* JADX INFO: renamed from: I */
    public ConcurrentHashMap f76771I;

    /* JADX INFO: renamed from: J */
    public String f76772J;

    /* JADX INFO: renamed from: K */
    public String f76773K;

    /* JADX INFO: renamed from: L */
    public ConcurrentHashMap f76774L;

    /* JADX INFO: renamed from: w */
    public String f76775w;

    /* JADX INFO: renamed from: x */
    public String f76776x;

    /* JADX INFO: renamed from: y */
    public String f76777y;

    /* JADX INFO: renamed from: z */
    public Object f76778z;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20496q.class != obj.getClass()) {
            return false;
        }
        C20496q c20496q = (C20496q) obj;
        return AbstractC29125c.m88542s(this.f76775w, c20496q.f76775w) && AbstractC29125c.m88542s(this.f76776x, c20496q.f76776x) && AbstractC29125c.m88542s(this.f76777y, c20496q.f76777y) && AbstractC29125c.m88542s(this.f76767E, c20496q.f76767E) && AbstractC29125c.m88542s(this.f76768F, c20496q.f76768F) && AbstractC29125c.m88542s(this.f76769G, c20496q.f76769G) && AbstractC29125c.m88542s(this.f76770H, c20496q.f76770H) && AbstractC29125c.m88542s(this.f76772J, c20496q.f76772J) && AbstractC29125c.m88542s(this.f76773K, c20496q.f76773K);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f76775w, this.f76776x, this.f76777y, this.f76767E, this.f76768F, this.f76769G, this.f76770H, this.f76772J, this.f76773K});
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        if (this.f76775w != null) {
            c37199o.m119207K(QueryParams.URL);
            c37199o.m119222b0(this.f76775w);
        }
        if (this.f76776x != null) {
            c37199o.m119207K("method");
            c37199o.m119222b0(this.f76776x);
        }
        if (this.f76777y != null) {
            c37199o.m119207K("query_string");
            c37199o.m119222b0(this.f76777y);
        }
        if (this.f76778z != null) {
            c37199o.m119207K("data");
            c37199o.m119219Y(interfaceC20602v0, this.f76778z);
        }
        if (this.f76767E != null) {
            c37199o.m119207K("cookies");
            c37199o.m119222b0(this.f76767E);
        }
        if (this.f76768F != null) {
            c37199o.m119207K("headers");
            c37199o.m119219Y(interfaceC20602v0, this.f76768F);
        }
        if (this.f76769G != null) {
            c37199o.m119207K("env");
            c37199o.m119219Y(interfaceC20602v0, this.f76769G);
        }
        if (this.f76771I != null) {
            c37199o.m119207K("other");
            c37199o.m119219Y(interfaceC20602v0, this.f76771I);
        }
        if (this.f76772J != null) {
            c37199o.m119207K("fragment");
            c37199o.m119219Y(interfaceC20602v0, this.f76772J);
        }
        if (this.f76770H != null) {
            c37199o.m119207K("body_size");
            c37199o.m119219Y(interfaceC20602v0, this.f76770H);
        }
        if (this.f76773K != null) {
            c37199o.m119207K("api_target");
            c37199o.m119219Y(interfaceC20602v0, this.f76773K);
        }
        ConcurrentHashMap concurrentHashMap = this.f76774L;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76774L, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
