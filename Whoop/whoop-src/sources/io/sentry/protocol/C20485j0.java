package io.sentry.protocol;

import ih0.AbstractC18489d0;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.protocol.j0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20485j0 implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: w */
    public final String f76701w;

    /* JADX INFO: renamed from: x */
    public final List f76702x;

    /* JADX INFO: renamed from: y */
    public HashMap f76703y;

    public C20485j0(String str, List list) {
        this.f76701w = str;
        this.f76702x = list;
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        String str = this.f76701w;
        if (str != null) {
            c37199o.m119207K("rendering_system");
            c37199o.m119222b0(str);
        }
        List list = this.f76702x;
        if (list != null) {
            c37199o.m119207K("windows");
            c37199o.m119219Y(interfaceC20602v0, list);
        }
        HashMap map = this.f76703y;
        if (map != null) {
            for (String str2 : map.keySet()) {
                AbstractC18489d0.m53385z(this.f76703y, str2, c37199o, str2, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
