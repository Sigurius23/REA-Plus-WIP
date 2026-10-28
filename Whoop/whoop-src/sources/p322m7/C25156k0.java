package p322m7;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import jh3.AbstractC21702c;
import p336n7.C26413c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m7.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C25156k0 implements InterfaceC25146g0 {

    /* JADX INFO: renamed from: f */
    public static final Duration f98643f = Duration.ofDays(31);

    /* JADX INFO: renamed from: a */
    public final Instant f98644a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98645b;

    /* JADX INFO: renamed from: c */
    public final Instant f98646c;

    /* JADX INFO: renamed from: d */
    public final ZoneOffset f98647d;

    /* JADX INFO: renamed from: e */
    public final C26413c f98648e;

    public C25156k0(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, C26413c c26413c) {
        this.f98644a = instant;
        this.f98645b = zoneOffset;
        this.f98646c = instant2;
        this.f98647d = zoneOffset2;
        this.f98648e = c26413c;
        if (!instant.isBefore(instant2)) {
            throw new IllegalArgumentException("startTime must be before endTime.");
        }
        if (Duration.between(instant, instant2).compareTo(f98643f) > 0) {
            throw new IllegalArgumentException("Period must not exceed 31 days");
        }
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: b */
    public final ZoneOffset mo73691b() {
        return this.f98645b;
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98648e;
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: e */
    public final Instant mo73693e() {
        return this.f98646c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25156k0)) {
            return false;
        }
        C25156k0 c25156k0 = (C25156k0) obj;
        return AbstractC22676k.m65745e(this.f98644a, c25156k0.f98644a) && AbstractC22676k.m65745e(this.f98645b, c25156k0.f98645b) && AbstractC22676k.m65745e(this.f98646c, c25156k0.f98646c) && AbstractC22676k.m65745e(this.f98647d, c25156k0.f98647d) && AbstractC22676k.m65745e(this.f98648e, c25156k0.f98648e);
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: f */
    public final ZoneOffset mo73694f() {
        return this.f98647d;
    }

    @Override // p322m7.InterfaceC25146g0
    public final Instant getStartTime() {
        return this.f98644a;
    }

    public final int hashCode() {
        int iHashCode = this.f98644a.hashCode() * 31;
        ZoneOffset zoneOffset = this.f98645b;
        int iM61131b = AbstractC21702c.m61131b(this.f98646c, (iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.f98647d;
        return this.f98648e.hashCode() + ((iM61131b + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31);
    }
}
