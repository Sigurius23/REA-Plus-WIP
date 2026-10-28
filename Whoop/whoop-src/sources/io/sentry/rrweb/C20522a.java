package io.sentry.rrweb;

import ih0.AbstractC18489d0;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import p088dc.AbstractC11894a;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.rrweb.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C20522a extends AbstractC20523b implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public String f76890E;

    /* JADX INFO: renamed from: F */
    public String f76891F;

    /* JADX INFO: renamed from: G */
    public String f76892G;

    /* JADX INFO: renamed from: H */
    public EnumC20436n5 f76893H;

    /* JADX INFO: renamed from: I */
    public ConcurrentHashMap f76894I;

    /* JADX INFO: renamed from: J */
    public HashMap f76895J;

    /* JADX INFO: renamed from: K */
    public ConcurrentHashMap f76896K;

    /* JADX INFO: renamed from: L */
    public ConcurrentHashMap f76897L;

    /* JADX INFO: renamed from: y */
    public String f76898y;

    /* JADX INFO: renamed from: z */
    public double f76899z;

    public C20522a() {
        super(EnumC20524c.Custom);
        this.f76898y = "breadcrumb";
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        AbstractC11894a.m31946N(this, c37199o, interfaceC20602v0);
        c37199o.m119207K("data");
        c37199o.m119227i();
        c37199o.m119207K("tag");
        c37199o.m119222b0(this.f76898y);
        c37199o.m119207K("payload");
        c37199o.m119227i();
        if (this.f76890E != null) {
            c37199o.m119207K("type");
            c37199o.m119222b0(this.f76890E);
        }
        c37199o.m119207K("timestamp");
        c37199o.m119219Y(interfaceC20602v0, BigDecimal.valueOf(this.f76899z));
        if (this.f76891F != null) {
            c37199o.m119207K("category");
            c37199o.m119222b0(this.f76891F);
        }
        if (this.f76892G != null) {
            c37199o.m119207K("message");
            c37199o.m119222b0(this.f76892G);
        }
        if (this.f76893H != null) {
            c37199o.m119207K("level");
            c37199o.m119219Y(interfaceC20602v0, this.f76893H);
        }
        if (this.f76894I != null) {
            c37199o.m119207K("data");
            c37199o.m119219Y(interfaceC20602v0, this.f76894I);
        }
        ConcurrentHashMap concurrentHashMap = this.f76896K;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76896K, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
        ConcurrentHashMap concurrentHashMap2 = this.f76897L;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                AbstractC18489d0.m53355A(this.f76897L, str2, c37199o, str2, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
        HashMap map = this.f76895J;
        if (map != null) {
            for (String str3 : map.keySet()) {
                AbstractC18489d0.m53385z(this.f76895J, str3, c37199o, str3, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
