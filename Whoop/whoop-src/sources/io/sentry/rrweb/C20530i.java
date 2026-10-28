package io.sentry.rrweb;

import ih0.AbstractC18489d0;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import p088dc.AbstractC11894a;
import p097ds.AbstractC12313p;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.rrweb.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C20530i extends AbstractC20526e implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public List f76916E;

    /* JADX INFO: renamed from: F */
    public HashMap f76917F;

    /* JADX INFO: renamed from: G */
    public HashMap f76918G;

    /* JADX INFO: renamed from: z */
    public int f76919z;

    public C20530i() {
        super(EnumC20525d.TouchMove);
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        AbstractC11894a.m31946N(this, c37199o, interfaceC20602v0);
        c37199o.m119207K("data");
        c37199o.m119227i();
        AbstractC12313p.m34265Q(this, c37199o, interfaceC20602v0);
        List list = this.f76916E;
        if (list != null && !list.isEmpty()) {
            c37199o.m119207K("positions");
            c37199o.m119219Y(interfaceC20602v0, this.f76916E);
        }
        c37199o.m119207K("pointerId");
        c37199o.m119218X(this.f76919z);
        HashMap map = this.f76918G;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC18489d0.m53385z(this.f76918G, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
        HashMap map2 = this.f76917F;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                AbstractC18489d0.m53385z(this.f76917F, str2, c37199o, str2, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
