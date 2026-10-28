package io.sentry.protocol;

import ih0.AbstractC18489d0;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.protocol.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20471c0 implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public Boolean f76620E;

    /* JADX INFO: renamed from: F */
    public Boolean f76621F;

    /* JADX INFO: renamed from: G */
    public Boolean f76622G;

    /* JADX INFO: renamed from: H */
    public Boolean f76623H;

    /* JADX INFO: renamed from: I */
    public C20469b0 f76624I;

    /* JADX INFO: renamed from: J */
    public Map f76625J;

    /* JADX INFO: renamed from: K */
    public ConcurrentHashMap f76626K;

    /* JADX INFO: renamed from: w */
    public Long f76627w;

    /* JADX INFO: renamed from: x */
    public Integer f76628x;

    /* JADX INFO: renamed from: y */
    public String f76629y;

    /* JADX INFO: renamed from: z */
    public String f76630z;

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        if (this.f76627w != null) {
            c37199o.m119207K("id");
            c37199o.m119221a0(this.f76627w);
        }
        if (this.f76628x != null) {
            c37199o.m119207K("priority");
            c37199o.m119221a0(this.f76628x);
        }
        if (this.f76629y != null) {
            c37199o.m119207K("name");
            c37199o.m119222b0(this.f76629y);
        }
        if (this.f76630z != null) {
            c37199o.m119207K("state");
            c37199o.m119222b0(this.f76630z);
        }
        if (this.f76620E != null) {
            c37199o.m119207K("crashed");
            c37199o.m119220Z(this.f76620E);
        }
        if (this.f76621F != null) {
            c37199o.m119207K("current");
            c37199o.m119220Z(this.f76621F);
        }
        if (this.f76622G != null) {
            c37199o.m119207K("daemon");
            c37199o.m119220Z(this.f76622G);
        }
        if (this.f76623H != null) {
            c37199o.m119207K("main");
            c37199o.m119220Z(this.f76623H);
        }
        if (this.f76624I != null) {
            c37199o.m119207K("stacktrace");
            c37199o.m119219Y(interfaceC20602v0, this.f76624I);
        }
        if (this.f76625J != null) {
            c37199o.m119207K("held_locks");
            c37199o.m119219Y(interfaceC20602v0, this.f76625J);
        }
        ConcurrentHashMap concurrentHashMap = this.f76626K;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76626K, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
