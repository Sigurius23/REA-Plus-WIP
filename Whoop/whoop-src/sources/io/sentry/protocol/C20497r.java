package io.sentry.protocol;

import ih0.AbstractC18489d0;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import p098dt.AbstractC12350b;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.protocol.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C20497r implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public Object f76779E;

    /* JADX INFO: renamed from: F */
    public ConcurrentHashMap f76780F;

    /* JADX INFO: renamed from: w */
    public String f76781w;

    /* JADX INFO: renamed from: x */
    public ConcurrentHashMap f76782x;

    /* JADX INFO: renamed from: y */
    public Integer f76783y;

    /* JADX INFO: renamed from: z */
    public Long f76784z;

    public C20497r(C20497r c20497r) {
        this.f76781w = c20497r.f76781w;
        this.f76782x = AbstractC12350b.m34553B(c20497r.f76782x);
        this.f76780F = AbstractC12350b.m34553B(c20497r.f76780F);
        this.f76783y = c20497r.f76783y;
        this.f76784z = c20497r.f76784z;
        this.f76779E = c20497r.f76779E;
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        if (this.f76781w != null) {
            c37199o.m119207K("cookies");
            c37199o.m119222b0(this.f76781w);
        }
        if (this.f76782x != null) {
            c37199o.m119207K("headers");
            c37199o.m119219Y(interfaceC20602v0, this.f76782x);
        }
        if (this.f76783y != null) {
            c37199o.m119207K("status_code");
            c37199o.m119219Y(interfaceC20602v0, this.f76783y);
        }
        if (this.f76784z != null) {
            c37199o.m119207K("body_size");
            c37199o.m119219Y(interfaceC20602v0, this.f76784z);
        }
        if (this.f76779E != null) {
            c37199o.m119207K("data");
            c37199o.m119219Y(interfaceC20602v0, this.f76779E);
        }
        ConcurrentHashMap concurrentHashMap = this.f76780F;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76780F, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
