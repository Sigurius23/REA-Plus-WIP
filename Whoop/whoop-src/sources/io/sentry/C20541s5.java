package io.sentry;

import ih0.AbstractC18489d0;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.s5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20541s5 implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: w */
    public final List f76984w;

    /* JADX INFO: renamed from: x */
    public HashMap f76985x;

    public C20541s5(List list) {
        this.f76984w = list;
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        c37199o.m119207K("items");
        c37199o.m119219Y(interfaceC20602v0, this.f76984w);
        HashMap map = this.f76985x;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC18489d0.m53385z(this.f76985x, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
