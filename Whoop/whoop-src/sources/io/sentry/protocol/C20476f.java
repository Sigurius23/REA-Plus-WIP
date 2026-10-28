package io.sentry.protocol;

import ih0.AbstractC18489d0;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import p581we.C37199o;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.protocol.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C20476f implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public String f76643E;

    /* JADX INFO: renamed from: F */
    public String f76644F;

    /* JADX INFO: renamed from: G */
    public String[] f76645G;

    /* JADX INFO: renamed from: H */
    public Float f76646H;

    /* JADX INFO: renamed from: I */
    public Boolean f76647I;

    /* JADX INFO: renamed from: J */
    public Boolean f76648J;

    /* JADX INFO: renamed from: K */
    public EnumC20474e f76649K;

    /* JADX INFO: renamed from: L */
    public Boolean f76650L;

    /* JADX INFO: renamed from: M */
    public Long f76651M;

    /* JADX INFO: renamed from: N */
    public Long f76652N;

    /* JADX INFO: renamed from: O */
    public Long f76653O;

    /* JADX INFO: renamed from: P */
    public Boolean f76654P;

    /* JADX INFO: renamed from: Q */
    public Long f76655Q;

    /* JADX INFO: renamed from: R */
    public Long f76656R;

    /* JADX INFO: renamed from: S */
    public Long f76657S;

    /* JADX INFO: renamed from: T */
    public Long f76658T;

    /* JADX INFO: renamed from: U */
    public Integer f76659U;

    /* JADX INFO: renamed from: V */
    public Integer f76660V;

    /* JADX INFO: renamed from: W */
    public Float f76661W;

    /* JADX INFO: renamed from: X */
    public Integer f76662X;

    /* JADX INFO: renamed from: Y */
    public Date f76663Y;

    /* JADX INFO: renamed from: Z */
    public TimeZone f76664Z;

    /* JADX INFO: renamed from: a0 */
    public String f76665a0;

    /* JADX INFO: renamed from: b0 */
    public String f76666b0;

    /* JADX INFO: renamed from: c0 */
    public String f76667c0;

    /* JADX INFO: renamed from: d0 */
    public Float f76668d0;

    /* JADX INFO: renamed from: e0 */
    public Integer f76669e0;

    /* JADX INFO: renamed from: f0 */
    public Double f76670f0;

    /* JADX INFO: renamed from: g0 */
    public String f76671g0;

    /* JADX INFO: renamed from: h0 */
    public String f76672h0;

    /* JADX INFO: renamed from: i0 */
    public ConcurrentHashMap f76673i0;

    /* JADX INFO: renamed from: w */
    public String f76674w;

    /* JADX INFO: renamed from: x */
    public String f76675x;

    /* JADX INFO: renamed from: y */
    public String f76676y;

    /* JADX INFO: renamed from: z */
    public String f76677z;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C20476f.class == obj.getClass()) {
            C20476f c20476f = (C20476f) obj;
            if (AbstractC29125c.m88542s(this.f76674w, c20476f.f76674w) && AbstractC29125c.m88542s(this.f76675x, c20476f.f76675x) && AbstractC29125c.m88542s(this.f76676y, c20476f.f76676y) && AbstractC29125c.m88542s(this.f76677z, c20476f.f76677z) && AbstractC29125c.m88542s(this.f76643E, c20476f.f76643E) && AbstractC29125c.m88542s(this.f76644F, c20476f.f76644F) && Arrays.equals(this.f76645G, c20476f.f76645G) && AbstractC29125c.m88542s(this.f76646H, c20476f.f76646H) && AbstractC29125c.m88542s(this.f76647I, c20476f.f76647I) && AbstractC29125c.m88542s(this.f76648J, c20476f.f76648J) && this.f76649K == c20476f.f76649K && AbstractC29125c.m88542s(this.f76650L, c20476f.f76650L) && AbstractC29125c.m88542s(this.f76651M, c20476f.f76651M) && AbstractC29125c.m88542s(this.f76652N, c20476f.f76652N) && AbstractC29125c.m88542s(this.f76653O, c20476f.f76653O) && AbstractC29125c.m88542s(this.f76654P, c20476f.f76654P) && AbstractC29125c.m88542s(this.f76655Q, c20476f.f76655Q) && AbstractC29125c.m88542s(this.f76656R, c20476f.f76656R) && AbstractC29125c.m88542s(this.f76657S, c20476f.f76657S) && AbstractC29125c.m88542s(this.f76658T, c20476f.f76658T) && AbstractC29125c.m88542s(this.f76659U, c20476f.f76659U) && AbstractC29125c.m88542s(this.f76660V, c20476f.f76660V) && AbstractC29125c.m88542s(this.f76661W, c20476f.f76661W) && AbstractC29125c.m88542s(this.f76662X, c20476f.f76662X) && AbstractC29125c.m88542s(this.f76663Y, c20476f.f76663Y) && AbstractC29125c.m88542s(this.f76665a0, c20476f.f76665a0) && AbstractC29125c.m88542s(this.f76666b0, c20476f.f76666b0) && AbstractC29125c.m88542s(this.f76667c0, c20476f.f76667c0) && AbstractC29125c.m88542s(this.f76668d0, c20476f.f76668d0) && AbstractC29125c.m88542s(this.f76669e0, c20476f.f76669e0) && AbstractC29125c.m88542s(this.f76670f0, c20476f.f76670f0) && AbstractC29125c.m88542s(this.f76671g0, c20476f.f76671g0) && AbstractC29125c.m88542s(this.f76672h0, c20476f.f76672h0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(new Object[]{this.f76674w, this.f76675x, this.f76676y, this.f76677z, this.f76643E, this.f76644F, this.f76646H, this.f76647I, this.f76648J, this.f76649K, this.f76650L, this.f76651M, this.f76652N, this.f76653O, this.f76654P, this.f76655Q, this.f76656R, this.f76657S, this.f76658T, this.f76659U, this.f76660V, this.f76661W, this.f76662X, this.f76663Y, this.f76664Z, this.f76665a0, this.f76666b0, this.f76667c0, this.f76668d0, this.f76669e0, this.f76670f0, this.f76671g0, this.f76672h0}) * 31) + Arrays.hashCode(this.f76645G);
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        if (this.f76674w != null) {
            c37199o.m119207K("name");
            c37199o.m119222b0(this.f76674w);
        }
        if (this.f76675x != null) {
            c37199o.m119207K("manufacturer");
            c37199o.m119222b0(this.f76675x);
        }
        if (this.f76676y != null) {
            c37199o.m119207K("brand");
            c37199o.m119222b0(this.f76676y);
        }
        if (this.f76677z != null) {
            c37199o.m119207K("family");
            c37199o.m119222b0(this.f76677z);
        }
        if (this.f76643E != null) {
            c37199o.m119207K("model");
            c37199o.m119222b0(this.f76643E);
        }
        if (this.f76644F != null) {
            c37199o.m119207K("model_id");
            c37199o.m119222b0(this.f76644F);
        }
        if (this.f76645G != null) {
            c37199o.m119207K("archs");
            c37199o.m119219Y(interfaceC20602v0, this.f76645G);
        }
        if (this.f76646H != null) {
            c37199o.m119207K("battery_level");
            c37199o.m119221a0(this.f76646H);
        }
        if (this.f76647I != null) {
            c37199o.m119207K("charging");
            c37199o.m119220Z(this.f76647I);
        }
        if (this.f76648J != null) {
            c37199o.m119207K("online");
            c37199o.m119220Z(this.f76648J);
        }
        if (this.f76649K != null) {
            c37199o.m119207K("orientation");
            c37199o.m119219Y(interfaceC20602v0, this.f76649K);
        }
        if (this.f76650L != null) {
            c37199o.m119207K("simulator");
            c37199o.m119220Z(this.f76650L);
        }
        if (this.f76651M != null) {
            c37199o.m119207K("memory_size");
            c37199o.m119221a0(this.f76651M);
        }
        if (this.f76652N != null) {
            c37199o.m119207K("free_memory");
            c37199o.m119221a0(this.f76652N);
        }
        if (this.f76653O != null) {
            c37199o.m119207K("usable_memory");
            c37199o.m119221a0(this.f76653O);
        }
        if (this.f76654P != null) {
            c37199o.m119207K("low_memory");
            c37199o.m119220Z(this.f76654P);
        }
        if (this.f76655Q != null) {
            c37199o.m119207K("storage_size");
            c37199o.m119221a0(this.f76655Q);
        }
        if (this.f76656R != null) {
            c37199o.m119207K("free_storage");
            c37199o.m119221a0(this.f76656R);
        }
        if (this.f76657S != null) {
            c37199o.m119207K("external_storage_size");
            c37199o.m119221a0(this.f76657S);
        }
        if (this.f76658T != null) {
            c37199o.m119207K("external_free_storage");
            c37199o.m119221a0(this.f76658T);
        }
        if (this.f76659U != null) {
            c37199o.m119207K("screen_width_pixels");
            c37199o.m119221a0(this.f76659U);
        }
        if (this.f76660V != null) {
            c37199o.m119207K("screen_height_pixels");
            c37199o.m119221a0(this.f76660V);
        }
        if (this.f76661W != null) {
            c37199o.m119207K("screen_density");
            c37199o.m119221a0(this.f76661W);
        }
        if (this.f76662X != null) {
            c37199o.m119207K("screen_dpi");
            c37199o.m119221a0(this.f76662X);
        }
        if (this.f76663Y != null) {
            c37199o.m119207K("boot_time");
            c37199o.m119219Y(interfaceC20602v0, this.f76663Y);
        }
        if (this.f76664Z != null) {
            c37199o.m119207K("timezone");
            c37199o.m119219Y(interfaceC20602v0, this.f76664Z);
        }
        if (this.f76665a0 != null) {
            c37199o.m119207K("id");
            c37199o.m119222b0(this.f76665a0);
        }
        if (this.f76667c0 != null) {
            c37199o.m119207K("connection_type");
            c37199o.m119222b0(this.f76667c0);
        }
        if (this.f76668d0 != null) {
            c37199o.m119207K("battery_temperature");
            c37199o.m119221a0(this.f76668d0);
        }
        if (this.f76666b0 != null) {
            c37199o.m119207K("locale");
            c37199o.m119222b0(this.f76666b0);
        }
        if (this.f76669e0 != null) {
            c37199o.m119207K("processor_count");
            c37199o.m119221a0(this.f76669e0);
        }
        if (this.f76670f0 != null) {
            c37199o.m119207K("processor_frequency");
            c37199o.m119221a0(this.f76670f0);
        }
        if (this.f76671g0 != null) {
            c37199o.m119207K("cpu_description");
            c37199o.m119222b0(this.f76671g0);
        }
        if (this.f76672h0 != null) {
            c37199o.m119207K("chipset");
            c37199o.m119222b0(this.f76672h0);
        }
        ConcurrentHashMap concurrentHashMap = this.f76673i0;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76673i0, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
