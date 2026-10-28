package io.sentry.protocol;

import ih0.AbstractC18489d0;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.protocol.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C20491o implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: w */
    public String f76744w;

    /* JADX INFO: renamed from: x */
    public String f76745x;

    /* JADX INFO: renamed from: y */
    public List f76746y;

    /* JADX INFO: renamed from: z */
    public ConcurrentHashMap f76747z;

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        if (this.f76744w != null) {
            c37199o.m119207K("formatted");
            c37199o.m119222b0(this.f76744w);
        }
        if (this.f76745x != null) {
            c37199o.m119207K("message");
            c37199o.m119222b0(this.f76745x);
        }
        List list = this.f76746y;
        if (list != null && !list.isEmpty()) {
            c37199o.m119207K("params");
            c37199o.m119219Y(interfaceC20602v0, this.f76746y);
        }
        ConcurrentHashMap concurrentHashMap = this.f76747z;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76747z, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
