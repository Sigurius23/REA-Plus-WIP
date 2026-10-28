package io.sentry.protocol.profiling;

import ih0.AbstractC18489d0;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.HashMap;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.protocol.profiling.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C20495c implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: w */
    public String f76764w;

    /* JADX INFO: renamed from: x */
    public int f76765x;

    /* JADX INFO: renamed from: y */
    public HashMap f76766y;

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        if (this.f76764w != null) {
            c37199o.m119207K("name");
            c37199o.m119219Y(interfaceC20602v0, this.f76764w);
        }
        c37199o.m119207K("priority");
        c37199o.m119219Y(interfaceC20602v0, Integer.valueOf(this.f76765x));
        HashMap map = this.f76766y;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC18489d0.m53385z(this.f76766y, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
