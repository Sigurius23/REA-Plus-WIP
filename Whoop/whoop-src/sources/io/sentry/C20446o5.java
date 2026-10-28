package io.sentry;

import ih0.AbstractC18489d0;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import p581we.C37199o;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.o5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20446o5 implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public Long f76539E;

    /* JADX INFO: renamed from: F */
    public ConcurrentHashMap f76540F;

    /* JADX INFO: renamed from: w */
    public int f76541w;

    /* JADX INFO: renamed from: x */
    public String f76542x;

    /* JADX INFO: renamed from: y */
    public String f76543y;

    /* JADX INFO: renamed from: z */
    public String f76544z;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20446o5.class != obj.getClass()) {
            return false;
        }
        return AbstractC29125c.m88542s(this.f76542x, ((C20446o5) obj).f76542x);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f76542x});
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        c37199o.m119207K("type");
        c37199o.m119218X(this.f76541w);
        if (this.f76542x != null) {
            c37199o.m119207K("address");
            c37199o.m119222b0(this.f76542x);
        }
        if (this.f76543y != null) {
            c37199o.m119207K("package_name");
            c37199o.m119222b0(this.f76543y);
        }
        if (this.f76544z != null) {
            c37199o.m119207K("class_name");
            c37199o.m119222b0(this.f76544z);
        }
        if (this.f76539E != null) {
            c37199o.m119207K("thread_id");
            c37199o.m119221a0(this.f76539E);
        }
        ConcurrentHashMap concurrentHashMap = this.f76540F;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76540F, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
