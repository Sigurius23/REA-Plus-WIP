package io.sentry;

import ih0.AbstractC18489d0;
import io.sentry.protocol.C20501v;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p249jc.AbstractC21598x;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.q5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20512q5 implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public EnumC20549t5 f76854E;

    /* JADX INFO: renamed from: F */
    public Integer f76855F;

    /* JADX INFO: renamed from: G */
    public Map f76856G;

    /* JADX INFO: renamed from: H */
    public HashMap f76857H;

    /* JADX INFO: renamed from: w */
    public C20501v f76858w;

    /* JADX INFO: renamed from: x */
    public C20353h7 f76859x;

    /* JADX INFO: renamed from: y */
    public Double f76860y;

    /* JADX INFO: renamed from: z */
    public String f76861z;

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        c37199o.m119207K("timestamp");
        c37199o.m119219Y(interfaceC20602v0, AbstractC21598x.m60649E(this.f76860y));
        c37199o.m119207K("trace_id");
        c37199o.m119219Y(interfaceC20602v0, this.f76858w);
        if (this.f76859x != null) {
            c37199o.m119207K("span_id");
            c37199o.m119219Y(interfaceC20602v0, this.f76859x);
        }
        c37199o.m119207K("body");
        c37199o.m119222b0(this.f76861z);
        c37199o.m119207K("level");
        c37199o.m119219Y(interfaceC20602v0, this.f76854E);
        if (this.f76855F != null) {
            c37199o.m119207K("severity_number");
            c37199o.m119219Y(interfaceC20602v0, this.f76855F);
        }
        if (this.f76856G != null) {
            c37199o.m119207K("attributes");
            c37199o.m119219Y(interfaceC20602v0, this.f76856G);
        }
        HashMap map = this.f76857H;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC18489d0.m53385z(this.f76857H, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
