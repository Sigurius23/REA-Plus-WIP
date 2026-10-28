package io.sentry.clientreport;

import ih0.AbstractC18489d0;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import p249jc.AbstractC21598x;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.clientreport.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C20294b implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: w */
    public final Date f76189w;

    /* JADX INFO: renamed from: x */
    public final ArrayList f76190x;

    /* JADX INFO: renamed from: y */
    public HashMap f76191y;

    public C20294b(Date date, ArrayList arrayList) {
        this.f76189w = date;
        this.f76190x = arrayList;
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        c37199o.m119207K("timestamp");
        c37199o.m119222b0(AbstractC21598x.m60667W(this.f76189w));
        c37199o.m119207K("discarded_events");
        c37199o.m119219Y(interfaceC20602v0, this.f76190x);
        HashMap map = this.f76191y;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC18489d0.m53385z(this.f76191y, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
