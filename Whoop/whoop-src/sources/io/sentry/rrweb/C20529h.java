package io.sentry.rrweb;

import ih0.AbstractC18489d0;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.HashMap;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.rrweb.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C20529h implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public HashMap f76911E;

    /* JADX INFO: renamed from: w */
    public int f76912w;

    /* JADX INFO: renamed from: x */
    public float f76913x;

    /* JADX INFO: renamed from: y */
    public float f76914y;

    /* JADX INFO: renamed from: z */
    public long f76915z;

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        c37199o.m119207K("id");
        c37199o.m119218X(this.f76912w);
        c37199o.m119207K("x");
        c37199o.m119217W(this.f76913x);
        c37199o.m119207K("y");
        c37199o.m119217W(this.f76914y);
        c37199o.m119207K("timeOffset");
        c37199o.m119218X(this.f76915z);
        HashMap map = this.f76911E;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC18489d0.m53385z(this.f76911E, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
