package io.sentry.profilemeasurements;

import ih0.AbstractC18489d0;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import p581we.C37199o;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.profilemeasurements.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C20463b implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: w */
    public ConcurrentHashMap f76592w;

    /* JADX INFO: renamed from: x */
    public double f76593x;

    /* JADX INFO: renamed from: y */
    public String f76594y;

    /* JADX INFO: renamed from: z */
    public double f76595z;

    public C20463b(Long l7, Number number, long j7) {
        this.f76594y = l7.toString();
        this.f76595z = number.doubleValue();
        this.f76593x = j7 / 1.0E9d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20463b.class != obj.getClass()) {
            return false;
        }
        C20463b c20463b = (C20463b) obj;
        return AbstractC29125c.m88542s(this.f76592w, c20463b.f76592w) && this.f76594y.equals(c20463b.f76594y) && this.f76595z == c20463b.f76595z && this.f76593x == c20463b.f76593x;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f76592w, this.f76594y, Double.valueOf(this.f76595z)});
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        c37199o.m119207K("value");
        c37199o.m119219Y(interfaceC20602v0, Double.valueOf(this.f76595z));
        c37199o.m119207K("elapsed_since_start_ns");
        c37199o.m119219Y(interfaceC20602v0, this.f76594y);
        c37199o.m119207K("timestamp");
        c37199o.m119219Y(interfaceC20602v0, BigDecimal.valueOf(this.f76593x).setScale(6, RoundingMode.DOWN));
        ConcurrentHashMap concurrentHashMap = this.f76592w;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76592w, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
