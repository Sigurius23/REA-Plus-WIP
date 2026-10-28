package p322m7;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.List;
import jh3.AbstractC21702c;
import p088dc.AbstractC11895b;
import p336n7.C26413c;
import p452r7.C31023l0;
import p452r7.C31033q0;
import p550vd.AbstractC35902e;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32417h;

/* JADX INFO: renamed from: m7.a1 */
/* JADX INFO: loaded from: classes.dex */
public final class C25129a1 implements InterfaceC25176u0 {

    /* JADX INFO: renamed from: g */
    public static final C31033q0 f98498g = AbstractC32417h.m101174E();

    /* JADX INFO: renamed from: a */
    public final Instant f98499a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98500b;

    /* JADX INFO: renamed from: c */
    public final Instant f98501c;

    /* JADX INFO: renamed from: d */
    public final ZoneOffset f98502d;

    /* JADX INFO: renamed from: e */
    public final List f98503e;

    /* JADX INFO: renamed from: f */
    public final C26413c f98504f;

    static {
        C31023l0 c31023l0 = C31033q0.f128016y;
        AbstractC35902e.m113978q(2, "SpeedSeries", "speed", new C25158l0(16));
        AbstractC35902e.m113978q(3, "SpeedSeries", "speed", new C25158l0(18));
        AbstractC35902e.m113978q(4, "SpeedSeries", "speed", new C25158l0(17));
    }

    public C25129a1(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, List list, C26413c c26413c) {
        this.f98499a = instant;
        this.f98500b = zoneOffset;
        this.f98501c = instant2;
        this.f98502d = zoneOffset2;
        this.f98503e = list;
        this.f98504f = c26413c;
        if (instant.isAfter(instant2)) {
            throw new IllegalArgumentException("startTime must not be after endTime.");
        }
    }

    @Override // p322m7.InterfaceC25176u0
    /* JADX INFO: renamed from: a */
    public final List mo73696a() {
        return this.f98503e;
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: b */
    public final ZoneOffset mo73691b() {
        return this.f98500b;
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98504f;
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: e */
    public final Instant mo73693e() {
        return this.f98501c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25129a1)) {
            return false;
        }
        C25129a1 c25129a1 = (C25129a1) obj;
        return AbstractC22676k.m65745e(this.f98499a, c25129a1.f98499a) && AbstractC22676k.m65745e(this.f98500b, c25129a1.f98500b) && AbstractC22676k.m65745e(this.f98501c, c25129a1.f98501c) && AbstractC22676k.m65745e(this.f98502d, c25129a1.f98502d) && AbstractC22676k.m65745e(this.f98503e, c25129a1.f98503e) && AbstractC22676k.m65745e(this.f98504f, c25129a1.f98504f);
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: f */
    public final ZoneOffset mo73694f() {
        return this.f98502d;
    }

    @Override // p322m7.InterfaceC25146g0
    public final Instant getStartTime() {
        return this.f98499a;
    }

    public final int hashCode() {
        int iHashCode = this.f98499a.hashCode() * 31;
        ZoneOffset zoneOffset = this.f98500b;
        int iM61131b = AbstractC21702c.m61131b(this.f98501c, (iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.f98502d;
        return this.f98504f.hashCode() + AbstractC11895b.m31983b((iM61131b + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31, 31, this.f98503e);
    }
}
