package io.sentry.protocol;

import ih0.AbstractC18489d0;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.protocol.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C20489m implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: w */
    public final Number f76730w;

    /* JADX INFO: renamed from: x */
    public final String f76731x;

    /* JADX INFO: renamed from: y */
    public ConcurrentHashMap f76732y;

    public C20489m(String str, Number number) {
        this.f76730w = number;
        this.f76731x = str;
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        c37199o.m119207K("value");
        c37199o.m119221a0(this.f76730w);
        String str = this.f76731x;
        if (str != null) {
            c37199o.m119207K("unit");
            c37199o.m119222b0(str);
        }
        ConcurrentHashMap concurrentHashMap = this.f76732y;
        if (concurrentHashMap != null) {
            for (String str2 : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76732y, str2, c37199o, str2, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
