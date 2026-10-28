package io.sentry.protocol;

import ih0.AbstractC18489d0;
import io.sentry.C20446o5;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.protocol.z */
/* JADX INFO: loaded from: classes5.dex */
public final class C20505z implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public String f76824E;

    /* JADX INFO: renamed from: F */
    public String f76825F;

    /* JADX INFO: renamed from: G */
    public Integer f76826G;

    /* JADX INFO: renamed from: H */
    public Integer f76827H;

    /* JADX INFO: renamed from: I */
    public String f76828I;

    /* JADX INFO: renamed from: J */
    public String f76829J;

    /* JADX INFO: renamed from: K */
    public Boolean f76830K;

    /* JADX INFO: renamed from: L */
    public String f76831L;

    /* JADX INFO: renamed from: M */
    public Boolean f76832M;

    /* JADX INFO: renamed from: N */
    public String f76833N;

    /* JADX INFO: renamed from: O */
    public String f76834O;

    /* JADX INFO: renamed from: P */
    public String f76835P;

    /* JADX INFO: renamed from: Q */
    public String f76836Q;

    /* JADX INFO: renamed from: R */
    public String f76837R;

    /* JADX INFO: renamed from: S */
    public String f76838S;

    /* JADX INFO: renamed from: T */
    public ConcurrentHashMap f76839T;

    /* JADX INFO: renamed from: U */
    public String f76840U;

    /* JADX INFO: renamed from: V */
    public C20446o5 f76841V;

    /* JADX INFO: renamed from: w */
    public List f76842w;

    /* JADX INFO: renamed from: x */
    public List f76843x;

    /* JADX INFO: renamed from: y */
    public Map f76844y;

    /* JADX INFO: renamed from: z */
    public String f76845z;

    public final boolean equals(Object obj) {
        if (obj == null || C20505z.class != obj.getClass()) {
            return false;
        }
        C20505z c20505z = (C20505z) obj;
        return Objects.equals(this.f76842w, c20505z.f76842w) && Objects.equals(this.f76843x, c20505z.f76843x) && Objects.equals(this.f76844y, c20505z.f76844y) && Objects.equals(this.f76845z, c20505z.f76845z) && Objects.equals(this.f76824E, c20505z.f76824E) && Objects.equals(this.f76825F, c20505z.f76825F) && Objects.equals(this.f76826G, c20505z.f76826G) && Objects.equals(this.f76827H, c20505z.f76827H) && Objects.equals(this.f76828I, c20505z.f76828I) && Objects.equals(this.f76829J, c20505z.f76829J) && Objects.equals(this.f76830K, c20505z.f76830K) && Objects.equals(this.f76831L, c20505z.f76831L) && Objects.equals(this.f76832M, c20505z.f76832M) && Objects.equals(this.f76833N, c20505z.f76833N) && Objects.equals(this.f76834O, c20505z.f76834O) && Objects.equals(this.f76835P, c20505z.f76835P) && Objects.equals(this.f76836Q, c20505z.f76836Q) && Objects.equals(this.f76837R, c20505z.f76837R) && Objects.equals(this.f76838S, c20505z.f76838S) && Objects.equals(this.f76839T, c20505z.f76839T) && Objects.equals(this.f76840U, c20505z.f76840U) && Objects.equals(this.f76841V, c20505z.f76841V);
    }

    public final int hashCode() {
        return Objects.hash(this.f76842w, this.f76843x, this.f76844y, null, this.f76845z, this.f76824E, this.f76825F, this.f76826G, this.f76827H, this.f76828I, this.f76829J, this.f76830K, this.f76831L, this.f76832M, this.f76833N, this.f76834O, this.f76835P, this.f76836Q, this.f76837R, this.f76838S, this.f76839T, this.f76840U, this.f76841V);
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        if (this.f76845z != null) {
            c37199o.m119207K("filename");
            c37199o.m119222b0(this.f76845z);
        }
        if (this.f76824E != null) {
            c37199o.m119207K("function");
            c37199o.m119222b0(this.f76824E);
        }
        if (this.f76825F != null) {
            c37199o.m119207K("module");
            c37199o.m119222b0(this.f76825F);
        }
        if (this.f76826G != null) {
            c37199o.m119207K("lineno");
            c37199o.m119221a0(this.f76826G);
        }
        if (this.f76827H != null) {
            c37199o.m119207K("colno");
            c37199o.m119221a0(this.f76827H);
        }
        if (this.f76828I != null) {
            c37199o.m119207K("abs_path");
            c37199o.m119222b0(this.f76828I);
        }
        if (this.f76829J != null) {
            c37199o.m119207K("context_line");
            c37199o.m119222b0(this.f76829J);
        }
        if (this.f76830K != null) {
            c37199o.m119207K("in_app");
            c37199o.m119220Z(this.f76830K);
        }
        if (this.f76831L != null) {
            c37199o.m119207K("package");
            c37199o.m119222b0(this.f76831L);
        }
        if (this.f76832M != null) {
            c37199o.m119207K("native");
            c37199o.m119220Z(this.f76832M);
        }
        if (this.f76833N != null) {
            c37199o.m119207K("platform");
            c37199o.m119222b0(this.f76833N);
        }
        if (this.f76834O != null) {
            c37199o.m119207K("image_addr");
            c37199o.m119222b0(this.f76834O);
        }
        if (this.f76835P != null) {
            c37199o.m119207K("symbol_addr");
            c37199o.m119222b0(this.f76835P);
        }
        if (this.f76836Q != null) {
            c37199o.m119207K("instruction_addr");
            c37199o.m119222b0(this.f76836Q);
        }
        if (this.f76837R != null) {
            c37199o.m119207K("addr_mode");
            c37199o.m119222b0(this.f76837R);
        }
        if (this.f76840U != null) {
            c37199o.m119207K("raw_function");
            c37199o.m119222b0(this.f76840U);
        }
        if (this.f76838S != null) {
            c37199o.m119207K("symbol");
            c37199o.m119222b0(this.f76838S);
        }
        if (this.f76841V != null) {
            c37199o.m119207K("lock");
            c37199o.m119219Y(interfaceC20602v0, this.f76841V);
        }
        List list = this.f76842w;
        if (list != null && !list.isEmpty()) {
            c37199o.m119207K("pre_context");
            c37199o.m119219Y(interfaceC20602v0, this.f76842w);
        }
        List list2 = this.f76843x;
        if (list2 != null && !list2.isEmpty()) {
            c37199o.m119207K("post_context");
            c37199o.m119219Y(interfaceC20602v0, this.f76843x);
        }
        Map map = this.f76844y;
        if (map != null && !map.isEmpty()) {
            c37199o.m119207K("vars");
            c37199o.m119219Y(interfaceC20602v0, this.f76844y);
        }
        ConcurrentHashMap concurrentHashMap = this.f76839T;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76839T, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
