package io.sentry;

import ih0.AbstractC18489d0;
import io.sentry.protocol.C20501v;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.q3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20510q3 implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: w */
    public C20501v f76851w;

    /* JADX INFO: renamed from: x */
    public ConcurrentHashMap f76852x;

    public C20510q3(C20501v c20501v) {
        this.f76851w = c20501v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C20510q3) {
            return this.f76851w.equals(((C20510q3) obj).f76851w);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f76851w});
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        c37199o.m119207K("profiler_id");
        c37199o.m119219Y(interfaceC20602v0, this.f76851w);
        ConcurrentHashMap concurrentHashMap = this.f76852x;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76852x, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
