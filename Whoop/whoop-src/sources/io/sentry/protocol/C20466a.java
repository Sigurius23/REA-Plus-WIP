package io.sentry.protocol;

import ih0.AbstractC18489d0;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p581we.C37199o;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.protocol.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C20466a implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public String f76596E;

    /* JADX INFO: renamed from: F */
    public String f76597F;

    /* JADX INFO: renamed from: G */
    public String f76598G;

    /* JADX INFO: renamed from: H */
    public AbstractMap f76599H;

    /* JADX INFO: renamed from: I */
    public List f76600I;

    /* JADX INFO: renamed from: J */
    public String f76601J;

    /* JADX INFO: renamed from: K */
    public Boolean f76602K;

    /* JADX INFO: renamed from: L */
    public Boolean f76603L;

    /* JADX INFO: renamed from: M */
    public List f76604M;

    /* JADX INFO: renamed from: N */
    public ConcurrentHashMap f76605N;

    /* JADX INFO: renamed from: w */
    public String f76606w;

    /* JADX INFO: renamed from: x */
    public Date f76607x;

    /* JADX INFO: renamed from: y */
    public String f76608y;

    /* JADX INFO: renamed from: z */
    public String f76609z;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20466a.class != obj.getClass()) {
            return false;
        }
        C20466a c20466a = (C20466a) obj;
        return AbstractC29125c.m88542s(this.f76606w, c20466a.f76606w) && AbstractC29125c.m88542s(this.f76607x, c20466a.f76607x) && AbstractC29125c.m88542s(this.f76608y, c20466a.f76608y) && AbstractC29125c.m88542s(this.f76609z, c20466a.f76609z) && AbstractC29125c.m88542s(this.f76596E, c20466a.f76596E) && AbstractC29125c.m88542s(this.f76597F, c20466a.f76597F) && AbstractC29125c.m88542s(this.f76598G, c20466a.f76598G) && AbstractC29125c.m88542s(this.f76599H, c20466a.f76599H) && AbstractC29125c.m88542s(this.f76602K, c20466a.f76602K) && AbstractC29125c.m88542s(this.f76600I, c20466a.f76600I) && AbstractC29125c.m88542s(this.f76601J, c20466a.f76601J) && AbstractC29125c.m88542s(this.f76603L, c20466a.f76603L) && AbstractC29125c.m88542s(this.f76604M, c20466a.f76604M);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f76606w, this.f76607x, this.f76608y, this.f76609z, this.f76596E, this.f76597F, this.f76598G, this.f76599H, this.f76602K, this.f76600I, this.f76601J, this.f76603L, this.f76604M});
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        if (this.f76606w != null) {
            c37199o.m119207K("app_identifier");
            c37199o.m119222b0(this.f76606w);
        }
        if (this.f76607x != null) {
            c37199o.m119207K("app_start_time");
            c37199o.m119219Y(interfaceC20602v0, this.f76607x);
        }
        if (this.f76608y != null) {
            c37199o.m119207K("device_app_hash");
            c37199o.m119222b0(this.f76608y);
        }
        if (this.f76609z != null) {
            c37199o.m119207K("build_type");
            c37199o.m119222b0(this.f76609z);
        }
        if (this.f76596E != null) {
            c37199o.m119207K("app_name");
            c37199o.m119222b0(this.f76596E);
        }
        if (this.f76597F != null) {
            c37199o.m119207K("app_version");
            c37199o.m119222b0(this.f76597F);
        }
        if (this.f76598G != null) {
            c37199o.m119207K("app_build");
            c37199o.m119222b0(this.f76598G);
        }
        AbstractMap abstractMap = this.f76599H;
        if (abstractMap != null && !abstractMap.isEmpty()) {
            c37199o.m119207K("permissions");
            c37199o.m119219Y(interfaceC20602v0, this.f76599H);
        }
        if (this.f76602K != null) {
            c37199o.m119207K("in_foreground");
            c37199o.m119220Z(this.f76602K);
        }
        if (this.f76600I != null) {
            c37199o.m119207K("view_names");
            c37199o.m119219Y(interfaceC20602v0, this.f76600I);
        }
        if (this.f76601J != null) {
            c37199o.m119207K("start_type");
            c37199o.m119222b0(this.f76601J);
        }
        if (this.f76603L != null) {
            c37199o.m119207K("is_split_apks");
            c37199o.m119220Z(this.f76603L);
        }
        List list = this.f76604M;
        if (list != null && !list.isEmpty()) {
            c37199o.m119207K("split_names");
            c37199o.m119219Y(interfaceC20602v0, this.f76604M);
        }
        ConcurrentHashMap concurrentHashMap = this.f76605N;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76605N, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
