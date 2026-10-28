package p322m7;

import java.time.Instant;
import java.time.ZoneOffset;
import jh3.AbstractC21702c;
import p336n7.C26413c;
import p477s2.AbstractC32073e;
import p550vd.AbstractC35902e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m7.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C25138d1 implements InterfaceC25146g0 {

    /* JADX INFO: renamed from: a */
    public final Instant f98550a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98551b;

    /* JADX INFO: renamed from: c */
    public final Instant f98552c;

    /* JADX INFO: renamed from: d */
    public final ZoneOffset f98553d;

    /* JADX INFO: renamed from: e */
    public final long f98554e;

    /* JADX INFO: renamed from: f */
    public final C26413c f98555f;

    static {
        AbstractC35902e.m113942M(5, "Steps", "count");
    }

    public C25138d1(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, long j7, C26413c c26413c) {
        this.f98550a = instant;
        this.f98551b = zoneOffset;
        this.f98552c = instant2;
        this.f98553d = zoneOffset2;
        this.f98554e = j7;
        this.f98555f = c26413c;
        AbstractC32073e.m99736b0(Long.valueOf(j7), 1L, "count");
        AbstractC32073e.m99738c0(Long.valueOf(j7), 1000000L, "count");
        if (!instant.isBefore(instant2)) {
            throw new IllegalArgumentException("startTime must be before endTime.");
        }
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: b */
    public final ZoneOffset mo73691b() {
        return this.f98551b;
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98555f;
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: e */
    public final Instant mo73693e() {
        return this.f98552c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25138d1)) {
            return false;
        }
        C25138d1 c25138d1 = (C25138d1) obj;
        return this.f98554e == c25138d1.f98554e && AbstractC22676k.m65745e(this.f98550a, c25138d1.f98550a) && AbstractC22676k.m65745e(this.f98551b, c25138d1.f98551b) && AbstractC22676k.m65745e(this.f98552c, c25138d1.f98552c) && AbstractC22676k.m65745e(this.f98553d, c25138d1.f98553d) && AbstractC22676k.m65745e(this.f98555f, c25138d1.f98555f);
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: f */
    public final ZoneOffset mo73694f() {
        return this.f98553d;
    }

    @Override // p322m7.InterfaceC25146g0
    public final Instant getStartTime() {
        return this.f98550a;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f98554e) * 31;
        ZoneOffset zoneOffset = this.f98551b;
        int iM61131b = AbstractC21702c.m61131b(this.f98552c, (iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.f98553d;
        return this.f98555f.hashCode() + ((iM61131b + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31);
    }
}
