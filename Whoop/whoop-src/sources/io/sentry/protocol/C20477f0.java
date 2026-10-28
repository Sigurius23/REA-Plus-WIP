package io.sentry.protocol;

import ih0.AbstractC18489d0;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.protocol.f0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20477f0 implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: w */
    public final String f76678w;

    /* JADX INFO: renamed from: x */
    public ConcurrentHashMap f76679x;

    public C20477f0(String str) {
        this.f76678w = str;
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        String str = this.f76678w;
        if (str != null) {
            c37199o.m119207K("source");
            c37199o.m119219Y(interfaceC20602v0, str);
        }
        ConcurrentHashMap concurrentHashMap = this.f76679x;
        if (concurrentHashMap != null) {
            for (String str2 : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76679x, str2, c37199o, str2, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
