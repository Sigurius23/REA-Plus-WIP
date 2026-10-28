package io.sentry.rrweb;

import ih0.AbstractC18489d0;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import p088dc.AbstractC11894a;
import p581we.C37199o;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.rrweb.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C20531j extends AbstractC20523b implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public int f76920E;

    /* JADX INFO: renamed from: F */
    public HashMap f76921F;

    /* JADX INFO: renamed from: y */
    public String f76922y;

    /* JADX INFO: renamed from: z */
    public int f76923z;

    public C20531j() {
        super(EnumC20524c.Meta);
        this.f76922y = "";
    }

    @Override // io.sentry.rrweb.AbstractC20523b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20531j.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C20531j c20531j = (C20531j) obj;
        return this.f76923z == c20531j.f76923z && this.f76920E == c20531j.f76920E && AbstractC29125c.m88542s(this.f76922y, c20531j.f76922y);
    }

    @Override // io.sentry.rrweb.AbstractC20523b
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.f76922y, Integer.valueOf(this.f76923z), Integer.valueOf(this.f76920E)});
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        AbstractC11894a.m31946N(this, c37199o, interfaceC20602v0);
        c37199o.m119207K("data");
        c37199o.m119227i();
        c37199o.m119207K("href");
        c37199o.m119222b0(this.f76922y);
        c37199o.m119207K("height");
        c37199o.m119218X(this.f76923z);
        c37199o.m119207K("width");
        c37199o.m119218X(this.f76920E);
        HashMap map = this.f76921F;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC18489d0.m53385z(this.f76921F, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
        c37199o.m119200C();
    }
}
