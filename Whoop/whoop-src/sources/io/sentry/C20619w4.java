package io.sentry;

import com.stripe.android.core.networking.AnalyticsRequestV2;
import ih0.AbstractC18489d0;
import io.sentry.protocol.C20499t;
import io.sentry.protocol.C20501v;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import p249jc.AbstractC21598x;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.w4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20619w4 implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public HashMap f77158E;

    /* JADX INFO: renamed from: w */
    public final C20501v f77159w;

    /* JADX INFO: renamed from: x */
    public final C20499t f77160x;

    /* JADX INFO: renamed from: y */
    public final C20405k7 f77161y;

    /* JADX INFO: renamed from: z */
    public Date f77162z;

    public C20619w4(C20501v c20501v, C20499t c20499t, C20405k7 c20405k7) {
        this.f77159w = c20501v;
        this.f77160x = c20499t;
        this.f77161y = c20405k7;
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        C20501v c20501v = this.f77159w;
        if (c20501v != null) {
            c37199o.m119207K(AnalyticsRequestV2.PARAM_EVENT_ID);
            c37199o.m119219Y(interfaceC20602v0, c20501v);
        }
        C20499t c20499t = this.f77160x;
        if (c20499t != null) {
            c37199o.m119207K("sdk");
            c37199o.m119219Y(interfaceC20602v0, c20499t);
        }
        C20405k7 c20405k7 = this.f77161y;
        if (c20405k7 != null) {
            c37199o.m119207K("trace");
            c37199o.m119219Y(interfaceC20602v0, c20405k7);
        }
        if (this.f77162z != null) {
            c37199o.m119207K("sent_at");
            c37199o.m119219Y(interfaceC20602v0, AbstractC21598x.m60667W(this.f77162z));
        }
        HashMap map = this.f77158E;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC18489d0.m53385z(this.f77158E, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
