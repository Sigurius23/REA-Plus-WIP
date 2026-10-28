package io.sentry.protocol;

import ih0.AbstractC18489d0;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.HashMap;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.protocol.s */
/* JADX INFO: loaded from: classes5.dex */
public final class C20498s implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public HashMap f76785E;

    /* JADX INFO: renamed from: w */
    public String f76786w;

    /* JADX INFO: renamed from: x */
    public Integer f76787x;

    /* JADX INFO: renamed from: y */
    public Integer f76788y;

    /* JADX INFO: renamed from: z */
    public Integer f76789z;

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        if (this.f76786w != null) {
            c37199o.m119207K("sdk_name");
            c37199o.m119222b0(this.f76786w);
        }
        if (this.f76787x != null) {
            c37199o.m119207K("version_major");
            c37199o.m119221a0(this.f76787x);
        }
        if (this.f76788y != null) {
            c37199o.m119207K("version_minor");
            c37199o.m119221a0(this.f76788y);
        }
        if (this.f76789z != null) {
            c37199o.m119207K("version_patchlevel");
            c37199o.m119221a0(this.f76789z);
        }
        HashMap map = this.f76785E;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC18489d0.m53385z(this.f76785E, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
