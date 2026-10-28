package io.sentry;

import ih0.AbstractC18489d0;
import io.sentry.vendor.gson.stream.C20613c;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import p581we.C37199o;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.x3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20626x3 implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: w */
    public Integer f77171w;

    /* JADX INFO: renamed from: x */
    public List f77172x;

    /* JADX INFO: renamed from: y */
    public HashMap f77173y;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C20626x3.class == obj.getClass()) {
            C20626x3 c20626x3 = (C20626x3) obj;
            if (AbstractC29125c.m88542s(this.f77171w, c20626x3.f77171w) && AbstractC29125c.m88542s(this.f77172x, c20626x3.f77172x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f77171w, this.f77172x});
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        C20613c c20613c = (C20613c) c37199o.f159040w;
        if (this.f77171w != null) {
            c37199o.m119207K("segment_id");
            c37199o.m119221a0(this.f77171w);
        }
        HashMap map = this.f77173y;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC18489d0.m53385z(this.f77173y, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
        c20613c.f77145F = true;
        if (this.f77171w != null) {
            c20613c.m56757x();
            c20613c.m56751b();
            c20613c.f77148w.append((CharSequence) "\n");
        }
        List list = this.f77172x;
        if (list != null) {
            c37199o.m119219Y(interfaceC20602v0, list);
        }
        c20613c.f77145F = false;
    }
}
