package io.sentry.protocol.profiling;

import ih0.AbstractC18489d0;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.protocol.profiling.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C20494b implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: w */
    public double f76760w;

    /* JADX INFO: renamed from: x */
    public int f76761x;

    /* JADX INFO: renamed from: y */
    public String f76762y;

    /* JADX INFO: renamed from: z */
    public HashMap f76763z;

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        c37199o.m119207K("timestamp");
        c37199o.m119219Y(interfaceC20602v0, BigDecimal.valueOf(this.f76760w).setScale(6, RoundingMode.DOWN));
        c37199o.m119207K("stack_id");
        c37199o.m119219Y(interfaceC20602v0, Integer.valueOf(this.f76761x));
        if (this.f76762y != null) {
            c37199o.m119207K("thread_id");
            c37199o.m119219Y(interfaceC20602v0, this.f76762y);
        }
        HashMap map = this.f76763z;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC18489d0.m53385z(this.f76763z, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
