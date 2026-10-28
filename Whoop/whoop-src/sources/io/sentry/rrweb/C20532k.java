package io.sentry.rrweb;

import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.HashMap;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.rrweb.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C20532k extends AbstractC20523b implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: y */
    public String f76924y;

    /* JADX INFO: renamed from: z */
    public HashMap f76925z;

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        c37199o.m119207K("type");
        c37199o.m119219Y(interfaceC20602v0, this.f76900w);
        c37199o.m119207K("timestamp");
        c37199o.m119218X(this.f76901x);
        c37199o.m119207K("data");
        c37199o.m119227i();
        c37199o.m119207K("tag");
        c37199o.m119222b0(this.f76924y);
        c37199o.m119207K("payload");
        c37199o.m119227i();
        HashMap map = this.f76925z;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                c37199o.m119207K(str);
                c37199o.m119219Y(interfaceC20602v0, obj);
            }
        }
        c37199o.m119200C();
        c37199o.m119200C();
        c37199o.m119200C();
    }
}
