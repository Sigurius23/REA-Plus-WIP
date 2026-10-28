package io.sentry.rrweb;

import ih0.AbstractC18489d0;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import p088dc.AbstractC11894a;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.rrweb.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C20533l extends AbstractC20523b implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public String f76926E;

    /* JADX INFO: renamed from: F */
    public double f76927F;

    /* JADX INFO: renamed from: G */
    public double f76928G;

    /* JADX INFO: renamed from: H */
    public ConcurrentHashMap f76929H;

    /* JADX INFO: renamed from: I */
    public HashMap f76930I;

    /* JADX INFO: renamed from: J */
    public ConcurrentHashMap f76931J;

    /* JADX INFO: renamed from: K */
    public ConcurrentHashMap f76932K;

    /* JADX INFO: renamed from: y */
    public String f76933y;

    /* JADX INFO: renamed from: z */
    public String f76934z;

    public C20533l() {
        super(EnumC20524c.Custom);
        this.f76933y = "performanceSpan";
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        AbstractC11894a.m31946N(this, c37199o, interfaceC20602v0);
        c37199o.m119207K("data");
        c37199o.m119227i();
        c37199o.m119207K("tag");
        c37199o.m119222b0(this.f76933y);
        c37199o.m119207K("payload");
        c37199o.m119227i();
        if (this.f76934z != null) {
            c37199o.m119207K("op");
            c37199o.m119222b0(this.f76934z);
        }
        if (this.f76926E != null) {
            c37199o.m119207K("description");
            c37199o.m119222b0(this.f76926E);
        }
        c37199o.m119207K("startTimestamp");
        c37199o.m119219Y(interfaceC20602v0, BigDecimal.valueOf(this.f76927F));
        c37199o.m119207K("endTimestamp");
        c37199o.m119219Y(interfaceC20602v0, BigDecimal.valueOf(this.f76928G));
        if (this.f76929H != null) {
            c37199o.m119207K("data");
            c37199o.m119219Y(interfaceC20602v0, this.f76929H);
        }
        ConcurrentHashMap concurrentHashMap = this.f76931J;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76931J, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
        ConcurrentHashMap concurrentHashMap2 = this.f76932K;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                AbstractC18489d0.m53355A(this.f76932K, str2, c37199o, str2, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
        HashMap map = this.f76930I;
        if (map != null) {
            for (String str3 : map.keySet()) {
                AbstractC18489d0.m53385z(this.f76930I, str3, c37199o, str3, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
