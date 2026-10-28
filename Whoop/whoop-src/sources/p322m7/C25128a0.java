package p322m7;

import java.time.Instant;
import java.time.ZoneOffset;
import jh3.AbstractC21702c;
import p336n7.C26413c;
import p477s2.AbstractC32073e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m7.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C25128a0 implements InterfaceC25140e0 {

    /* JADX INFO: renamed from: a */
    public final Instant f98494a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98495b;

    /* JADX INFO: renamed from: c */
    public final double f98496c;

    /* JADX INFO: renamed from: d */
    public final C26413c f98497d;

    public C25128a0(Instant instant, ZoneOffset zoneOffset, double d3, C26413c c26413c) {
        this.f98494a = instant;
        this.f98495b = zoneOffset;
        this.f98496c = d3;
        this.f98497d = c26413c;
        AbstractC32073e.m99731Y(Double.valueOf(d3), Double.valueOf(1.0d), Double.valueOf(200.0d), "heartRateVariabilityMillis");
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98497d;
    }

    @Override // p322m7.InterfaceC25140e0
    /* JADX INFO: renamed from: d */
    public final ZoneOffset mo73695d() {
        return this.f98495b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25128a0)) {
            return false;
        }
        C25128a0 c25128a0 = (C25128a0) obj;
        return this.f98496c == c25128a0.f98496c && AbstractC22676k.m65745e(this.f98494a, c25128a0.f98494a) && AbstractC22676k.m65745e(this.f98495b, c25128a0.f98495b) && AbstractC22676k.m65745e(this.f98497d, c25128a0.f98497d);
    }

    @Override // p322m7.InterfaceC25140e0
    public final Instant getTime() {
        return this.f98494a;
    }

    public final int hashCode() {
        int iM61131b = AbstractC21702c.m61131b(this.f98494a, Double.hashCode(this.f98496c) * 31, 31);
        ZoneOffset zoneOffset = this.f98495b;
        return this.f98497d.hashCode() + ((iM61131b + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }
}
