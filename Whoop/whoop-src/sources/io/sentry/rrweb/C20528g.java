package io.sentry.rrweb;

import ih0.AbstractC18489d0;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.HashMap;
import p088dc.AbstractC11894a;
import p097ds.AbstractC12313p;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.rrweb.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C20528g extends AbstractC20526e implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public int f76903E;

    /* JADX INFO: renamed from: F */
    public float f76904F;

    /* JADX INFO: renamed from: G */
    public float f76905G;

    /* JADX INFO: renamed from: H */
    public int f76906H;

    /* JADX INFO: renamed from: I */
    public int f76907I;

    /* JADX INFO: renamed from: J */
    public HashMap f76908J;

    /* JADX INFO: renamed from: K */
    public HashMap f76909K;

    /* JADX INFO: renamed from: z */
    public EnumC20527f f76910z;

    public C20528g() {
        super(EnumC20525d.MouseInteraction);
        this.f76906H = 2;
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        AbstractC11894a.m31946N(this, c37199o, interfaceC20602v0);
        c37199o.m119207K("data");
        c37199o.m119227i();
        AbstractC12313p.m34265Q(this, c37199o, interfaceC20602v0);
        c37199o.m119207K("type");
        c37199o.m119219Y(interfaceC20602v0, this.f76910z);
        c37199o.m119207K("id");
        c37199o.m119218X(this.f76903E);
        c37199o.m119207K("x");
        c37199o.m119217W(this.f76904F);
        c37199o.m119207K("y");
        c37199o.m119217W(this.f76905G);
        c37199o.m119207K("pointerType");
        c37199o.m119218X(this.f76906H);
        c37199o.m119207K("pointerId");
        c37199o.m119218X(this.f76907I);
        HashMap map = this.f76909K;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC18489d0.m53385z(this.f76909K, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
        HashMap map2 = this.f76908J;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                AbstractC18489d0.m53385z(this.f76908J, str2, c37199o, str2, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
