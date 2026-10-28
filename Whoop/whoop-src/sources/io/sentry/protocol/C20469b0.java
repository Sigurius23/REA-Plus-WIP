package io.sentry.protocol;

import ih0.AbstractC18489d0;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.protocol.b0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20469b0 implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public ConcurrentHashMap f76613E;

    /* JADX INFO: renamed from: w */
    public List f76614w;

    /* JADX INFO: renamed from: x */
    public AbstractMap f76615x;

    /* JADX INFO: renamed from: y */
    public Boolean f76616y;

    /* JADX INFO: renamed from: z */
    public EnumC20467a0 f76617z;

    public C20469b0(List list) {
        this.f76614w = list;
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        if (this.f76614w != null) {
            c37199o.m119207K("frames");
            c37199o.m119219Y(interfaceC20602v0, this.f76614w);
        }
        if (this.f76615x != null) {
            c37199o.m119207K("registers");
            c37199o.m119219Y(interfaceC20602v0, this.f76615x);
        }
        if (this.f76616y != null) {
            c37199o.m119207K("snapshot");
            c37199o.m119220Z(this.f76616y);
        }
        if (this.f76617z != null) {
            c37199o.m119207K("instruction_addr_adjustment");
            c37199o.m119219Y(interfaceC20602v0, this.f76617z);
        }
        ConcurrentHashMap concurrentHashMap = this.f76613E;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76613E, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
