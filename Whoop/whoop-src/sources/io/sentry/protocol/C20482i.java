package io.sentry.protocol;

import ih0.AbstractC18489d0;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p581we.C37199o;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.protocol.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C20482i implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: w */
    public final List f76691w;

    /* JADX INFO: renamed from: x */
    public ConcurrentHashMap f76692x;

    public C20482i(List list) {
        this.f76691w = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20482i.class != obj.getClass()) {
            return false;
        }
        return AbstractC29125c.m88542s(this.f76691w, ((C20482i) obj).f76691w);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f76691w});
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        c37199o.m119207K("values");
        c37199o.m119219Y(interfaceC20602v0, this.f76691w);
        ConcurrentHashMap concurrentHashMap = this.f76692x;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76692x, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
