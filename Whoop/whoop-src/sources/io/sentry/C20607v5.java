package io.sentry;

import ih0.AbstractC18489d0;
import io.sentry.protocol.C20501v;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p249jc.AbstractC21598x;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.v5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20607v5 implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public String f77115E;

    /* JADX INFO: renamed from: F */
    public String f77116F;

    /* JADX INFO: renamed from: G */
    public Double f77117G;

    /* JADX INFO: renamed from: H */
    public Map f77118H;

    /* JADX INFO: renamed from: I */
    public HashMap f77119I;

    /* JADX INFO: renamed from: w */
    public C20501v f77120w;

    /* JADX INFO: renamed from: x */
    public C20353h7 f77121x;

    /* JADX INFO: renamed from: y */
    public Double f77122y;

    /* JADX INFO: renamed from: z */
    public String f77123z;

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        c37199o.m119207K("timestamp");
        c37199o.m119219Y(interfaceC20602v0, AbstractC21598x.m60649E(this.f77122y));
        c37199o.m119207K("type");
        c37199o.m119222b0(this.f77116F);
        c37199o.m119207K("name");
        c37199o.m119222b0(this.f77123z);
        c37199o.m119207K("value");
        c37199o.m119221a0(this.f77117G);
        c37199o.m119207K("trace_id");
        c37199o.m119219Y(interfaceC20602v0, this.f77120w);
        if (this.f77121x != null) {
            c37199o.m119207K("span_id");
            c37199o.m119219Y(interfaceC20602v0, this.f77121x);
        }
        if (this.f77115E != null) {
            c37199o.m119207K("unit");
            c37199o.m119219Y(interfaceC20602v0, this.f77115E);
        }
        if (this.f77118H != null) {
            c37199o.m119207K("attributes");
            c37199o.m119219Y(interfaceC20602v0, this.f77118H);
        }
        HashMap map = this.f77119I;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC18489d0.m53385z(this.f77119I, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
