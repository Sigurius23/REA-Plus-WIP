package io.sentry;

import ih0.AbstractC18489d0;
import io.sentry.protocol.C20472d;
import io.sentry.protocol.C20499t;
import io.sentry.protocol.C20501v;
import io.sentry.protocol.profiling.C20493a;
import io.sentry.vendor.gson.stream.C20613c;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.p3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20457p3 implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public final Map f76556E;

    /* JADX INFO: renamed from: F */
    public String f76557F;

    /* JADX INFO: renamed from: G */
    public String f76558G;

    /* JADX INFO: renamed from: H */
    public String f76559H;

    /* JADX INFO: renamed from: I */
    public String f76560I;

    /* JADX INFO: renamed from: J */
    public double f76561J;

    /* JADX INFO: renamed from: K */
    public final File f76562K;

    /* JADX INFO: renamed from: M */
    public C20493a f76564M;

    /* JADX INFO: renamed from: N */
    public ConcurrentHashMap f76565N;

    /* JADX INFO: renamed from: x */
    public C20501v f76567x;

    /* JADX INFO: renamed from: y */
    public C20501v f76568y;

    /* JADX INFO: renamed from: z */
    public C20499t f76569z;

    /* JADX INFO: renamed from: L */
    public String f76563L = null;

    /* JADX INFO: renamed from: w */
    public C20472d f76566w = null;

    public C20457p3(C20501v c20501v, C20501v c20501v2, File file, AbstractMap abstractMap, Double d3, String str, C20513q6 c20513q6) {
        this.f76567x = c20501v;
        this.f76568y = c20501v2;
        this.f76562K = file;
        this.f76556E = abstractMap;
        this.f76569z = c20513q6.getSdkVersion();
        this.f76558G = c20513q6.getRelease() != null ? c20513q6.getRelease() : "";
        this.f76559H = c20513q6.getEnvironment();
        this.f76557F = str;
        this.f76560I = "2";
        this.f76561J = d3.doubleValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20457p3)) {
            return false;
        }
        C20457p3 c20457p3 = (C20457p3) obj;
        return Objects.equals(this.f76566w, c20457p3.f76566w) && Objects.equals(this.f76567x, c20457p3.f76567x) && Objects.equals(this.f76568y, c20457p3.f76568y) && Objects.equals(this.f76569z, c20457p3.f76569z) && Objects.equals(this.f76556E, c20457p3.f76556E) && Objects.equals(this.f76557F, c20457p3.f76557F) && Objects.equals(this.f76558G, c20457p3.f76558G) && Objects.equals(this.f76559H, c20457p3.f76559H) && Objects.equals(this.f76560I, c20457p3.f76560I) && Objects.equals(this.f76563L, c20457p3.f76563L) && Objects.equals(this.f76565N, c20457p3.f76565N) && Objects.equals(this.f76564M, c20457p3.f76564M);
    }

    public final int hashCode() {
        return Objects.hash(this.f76566w, this.f76567x, this.f76568y, this.f76569z, this.f76556E, this.f76557F, this.f76558G, this.f76559H, this.f76560I, this.f76563L, this.f76564M, this.f76565N);
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        if (this.f76566w != null) {
            c37199o.m119207K("debug_meta");
            c37199o.m119219Y(interfaceC20602v0, this.f76566w);
        }
        c37199o.m119207K("profiler_id");
        c37199o.m119219Y(interfaceC20602v0, this.f76567x);
        c37199o.m119207K("chunk_id");
        c37199o.m119219Y(interfaceC20602v0, this.f76568y);
        if (this.f76569z != null) {
            c37199o.m119207K("client_sdk");
            c37199o.m119219Y(interfaceC20602v0, this.f76569z);
        }
        Map map = this.f76556E;
        if (!map.isEmpty()) {
            String str = ((C20613c) c37199o.f159040w).f77151z;
            c37199o.m119213S("");
            c37199o.m119207K("measurements");
            c37199o.m119219Y(interfaceC20602v0, map);
            c37199o.m119213S(str);
        }
        c37199o.m119207K("platform");
        c37199o.m119219Y(interfaceC20602v0, this.f76557F);
        c37199o.m119207K("release");
        c37199o.m119219Y(interfaceC20602v0, this.f76558G);
        if (this.f76559H != null) {
            c37199o.m119207K("environment");
            c37199o.m119219Y(interfaceC20602v0, this.f76559H);
        }
        c37199o.m119207K("version");
        c37199o.m119219Y(interfaceC20602v0, this.f76560I);
        if (this.f76563L != null) {
            c37199o.m119207K("sampled_profile");
            c37199o.m119219Y(interfaceC20602v0, this.f76563L);
        }
        c37199o.m119207K("timestamp");
        c37199o.m119219Y(interfaceC20602v0, BigDecimal.valueOf(this.f76561J).setScale(6, RoundingMode.DOWN));
        if (this.f76564M != null) {
            c37199o.m119207K("profile");
            c37199o.m119219Y(interfaceC20602v0, this.f76564M);
        }
        ConcurrentHashMap concurrentHashMap = this.f76565N;
        if (concurrentHashMap != null) {
            for (String str2 : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76565N, str2, c37199o, str2, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
