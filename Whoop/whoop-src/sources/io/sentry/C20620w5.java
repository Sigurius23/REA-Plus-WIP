package io.sentry;

import ih0.AbstractC18489d0;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.w5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20620w5 implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: w */
    public final List f77163w;

    /* JADX INFO: renamed from: x */
    public HashMap f77164x;

    public C20620w5(List list) {
        this.f77163w = list;
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        c37199o.m119207K("items");
        c37199o.m119219Y(interfaceC20602v0, this.f77163w);
        HashMap map = this.f77164x;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC18489d0.m53385z(this.f77164x, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
