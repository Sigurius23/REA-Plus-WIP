package io.sentry.profilemeasurements;

import ih0.AbstractC18489d0;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import p581we.C37199o;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.profilemeasurements.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C20462a implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: w */
    public ConcurrentHashMap f76589w;

    /* JADX INFO: renamed from: x */
    public String f76590x;

    /* JADX INFO: renamed from: y */
    public Collection f76591y;

    public C20462a(String str, AbstractCollection abstractCollection) {
        this.f76590x = str;
        this.f76591y = abstractCollection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20462a.class != obj.getClass()) {
            return false;
        }
        C20462a c20462a = (C20462a) obj;
        return AbstractC29125c.m88542s(this.f76589w, c20462a.f76589w) && this.f76590x.equals(c20462a.f76590x) && new ArrayList(this.f76591y).equals(new ArrayList(c20462a.f76591y));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f76589w, this.f76590x, this.f76591y});
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        c37199o.m119207K("unit");
        c37199o.m119219Y(interfaceC20602v0, this.f76590x);
        c37199o.m119207K("values");
        c37199o.m119219Y(interfaceC20602v0, this.f76591y);
        ConcurrentHashMap concurrentHashMap = this.f76589w;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76589w, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
