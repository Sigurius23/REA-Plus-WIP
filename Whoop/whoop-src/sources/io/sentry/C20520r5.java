package io.sentry;

import ih0.AbstractC18489d0;
import java.io.IOException;
import java.util.HashMap;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.r5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20520r5 implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: w */
    public String f76887w;

    /* JADX INFO: renamed from: x */
    public Object f76888x;

    /* JADX INFO: renamed from: y */
    public HashMap f76889y;

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        c37199o.m119207K("type");
        c37199o.m119219Y(interfaceC20602v0, this.f76887w);
        c37199o.m119207K("value");
        c37199o.m119219Y(interfaceC20602v0, this.f76888x);
        HashMap map = this.f76889y;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC18489d0.m53385z(this.f76889y, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
