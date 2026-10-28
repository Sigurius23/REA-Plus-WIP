package p322m7;

import java.time.Instant;
import java.time.ZoneOffset;
import jh3.AbstractC21702c;
import p336n7.C26413c;
import p477s2.AbstractC32073e;
import p550vd.AbstractC35902e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m7.h1 */
/* JADX INFO: loaded from: classes.dex */
public final class C25150h1 implements InterfaceC25146g0 {

    /* JADX INFO: renamed from: a */
    public final Instant f98610a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98611b;

    /* JADX INFO: renamed from: c */
    public final Instant f98612c;

    /* JADX INFO: renamed from: d */
    public final ZoneOffset f98613d;

    /* JADX INFO: renamed from: e */
    public final long f98614e;

    /* JADX INFO: renamed from: f */
    public final C26413c f98615f;

    static {
        AbstractC35902e.m113942M(5, "WheelchairPushes", "count");
    }

    public C25150h1(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, long j7, C26413c c26413c) {
        this.f98610a = instant;
        this.f98611b = zoneOffset;
        this.f98612c = instant2;
        this.f98613d = zoneOffset2;
        this.f98614e = j7;
        this.f98615f = c26413c;
        AbstractC32073e.m99734a0(j7, "count");
        AbstractC32073e.m99738c0(Long.valueOf(j7), 1000000L, "count");
        if (!instant.isBefore(instant2)) {
            throw new IllegalArgumentException("startTime must be before endTime.");
        }
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: b */
    public final ZoneOffset mo73691b() {
        return this.f98611b;
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98615f;
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: e */
    public final Instant mo73693e() {
        return this.f98612c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25150h1)) {
            return false;
        }
        C25150h1 c25150h1 = (C25150h1) obj;
        return this.f98614e == c25150h1.f98614e && AbstractC22676k.m65745e(this.f98610a, c25150h1.f98610a) && AbstractC22676k.m65745e(this.f98611b, c25150h1.f98611b) && AbstractC22676k.m65745e(this.f98612c, c25150h1.f98612c) && AbstractC22676k.m65745e(this.f98613d, c25150h1.f98613d) && AbstractC22676k.m65745e(this.f98615f, c25150h1.f98615f);
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: f */
    public final ZoneOffset mo73694f() {
        return this.f98613d;
    }

    @Override // p322m7.InterfaceC25146g0
    public final Instant getStartTime() {
        return this.f98610a;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f98614e) * 31;
        ZoneOffset zoneOffset = this.f98611b;
        int iM61131b = AbstractC21702c.m61131b(this.f98612c, (iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.f98613d;
        return this.f98615f.hashCode() + ((iM61131b + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31);
    }
}
