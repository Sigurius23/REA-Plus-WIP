package io.sentry.protocol;

import ih0.AbstractC18489d0;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.protocol.w */
/* JADX INFO: loaded from: classes5.dex */
public final class C20502w implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: w */
    public final String f76804w;

    /* JADX INFO: renamed from: x */
    public final String f76805x;

    /* JADX INFO: renamed from: y */
    public HashMap f76806y;

    public C20502w(String str, String str2) {
        this.f76804w = str;
        this.f76805x = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C20502w.class == obj.getClass()) {
            C20502w c20502w = (C20502w) obj;
            if (Objects.equals(this.f76804w, c20502w.f76804w) && Objects.equals(this.f76805x, c20502w.f76805x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f76804w, this.f76805x);
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        c37199o.m119207K("name");
        c37199o.m119222b0(this.f76804w);
        c37199o.m119207K("version");
        c37199o.m119222b0(this.f76805x);
        HashMap map = this.f76806y;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC18489d0.m53385z(this.f76806y, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
