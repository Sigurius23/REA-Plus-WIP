package p322m7;

import java.time.Instant;
import java.time.ZoneOffset;
import jh3.AbstractC21702c;
import p336n7.C26413c;
import p477s2.AbstractC32073e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m7.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C25172s0 implements InterfaceC25140e0 {

    /* JADX INFO: renamed from: a */
    public final Instant f98757a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98758b;

    /* JADX INFO: renamed from: c */
    public final double f98759c;

    /* JADX INFO: renamed from: d */
    public final C26413c f98760d;

    public C25172s0(Instant instant, ZoneOffset zoneOffset, double d3, C26413c c26413c) {
        this.f98757a = instant;
        this.f98758b = zoneOffset;
        this.f98759c = d3;
        this.f98760d = c26413c;
        AbstractC32073e.m99732Z(d3, "rate");
        AbstractC32073e.m99738c0(Double.valueOf(d3), Double.valueOf(1000.0d), "rate");
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98760d;
    }

    @Override // p322m7.InterfaceC25140e0
    /* JADX INFO: renamed from: d */
    public final ZoneOffset mo73695d() {
        return this.f98758b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25172s0)) {
            return false;
        }
        C25172s0 c25172s0 = (C25172s0) obj;
        return this.f98759c == c25172s0.f98759c && AbstractC22676k.m65745e(this.f98757a, c25172s0.f98757a) && AbstractC22676k.m65745e(this.f98758b, c25172s0.f98758b) && AbstractC22676k.m65745e(this.f98760d, c25172s0.f98760d);
    }

    @Override // p322m7.InterfaceC25140e0
    public final Instant getTime() {
        return this.f98757a;
    }

    public final int hashCode() {
        int iM61131b = AbstractC21702c.m61131b(this.f98757a, Double.hashCode(this.f98759c) * 31, 31);
        ZoneOffset zoneOffset = this.f98758b;
        return this.f98760d.hashCode() + ((iM61131b + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }
}
