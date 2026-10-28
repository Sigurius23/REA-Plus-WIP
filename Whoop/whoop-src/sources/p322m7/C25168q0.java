package p322m7;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.List;
import jh3.AbstractC21702c;
import p088dc.AbstractC11895b;
import p336n7.C26413c;
import p452r7.C31007d0;
import p452r7.C31015h0;
import p550vd.AbstractC35902e;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32410a;

/* JADX INFO: renamed from: m7.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C25168q0 implements InterfaceC25176u0 {

    /* JADX INFO: renamed from: g */
    public static final C31015h0 f98749g = AbstractC32410a.m101005N();

    /* JADX INFO: renamed from: a */
    public final Instant f98750a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98751b;

    /* JADX INFO: renamed from: c */
    public final Instant f98752c;

    /* JADX INFO: renamed from: d */
    public final ZoneOffset f98753d;

    /* JADX INFO: renamed from: e */
    public final List f98754e;

    /* JADX INFO: renamed from: f */
    public final C26413c f98755f;

    static {
        C31007d0 c31007d0 = C31015h0.f127999y;
        AbstractC35902e.m113978q(2, "PowerSeries", "power", new C25158l0(13));
        AbstractC35902e.m113978q(3, "PowerSeries", "power", new C25158l0(15));
        AbstractC35902e.m113978q(4, "PowerSeries", "power", new C25158l0(14));
    }

    public C25168q0(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, List list, C26413c c26413c) {
        this.f98750a = instant;
        this.f98751b = zoneOffset;
        this.f98752c = instant2;
        this.f98753d = zoneOffset2;
        this.f98754e = list;
        this.f98755f = c26413c;
        if (instant.isAfter(instant2)) {
            throw new IllegalArgumentException("startTime must not be after endTime.");
        }
    }

    @Override // p322m7.InterfaceC25176u0
    /* JADX INFO: renamed from: a */
    public final List mo73696a() {
        return this.f98754e;
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: b */
    public final ZoneOffset mo73691b() {
        return this.f98751b;
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98755f;
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: e */
    public final Instant mo73693e() {
        return this.f98752c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25168q0)) {
            return false;
        }
        C25168q0 c25168q0 = (C25168q0) obj;
        return AbstractC22676k.m65745e(this.f98750a, c25168q0.f98750a) && AbstractC22676k.m65745e(this.f98751b, c25168q0.f98751b) && AbstractC22676k.m65745e(this.f98752c, c25168q0.f98752c) && AbstractC22676k.m65745e(this.f98753d, c25168q0.f98753d) && AbstractC22676k.m65745e(this.f98754e, c25168q0.f98754e) && AbstractC22676k.m65745e(this.f98755f, c25168q0.f98755f);
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: f */
    public final ZoneOffset mo73694f() {
        return this.f98753d;
    }

    @Override // p322m7.InterfaceC25146g0
    public final Instant getStartTime() {
        return this.f98750a;
    }

    public final int hashCode() {
        int iHashCode = this.f98750a.hashCode() * 31;
        ZoneOffset zoneOffset = this.f98751b;
        int iM61131b = AbstractC21702c.m61131b(this.f98752c, (iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.f98753d;
        return this.f98755f.hashCode() + AbstractC11895b.m31983b((iM61131b + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31, 31, this.f98754e);
    }
}
