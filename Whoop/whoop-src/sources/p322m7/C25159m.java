package p322m7;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.List;
import jh3.AbstractC21702c;
import p088dc.AbstractC11895b;
import p336n7.C26413c;
import p550vd.AbstractC35902e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m7.m */
/* JADX INFO: loaded from: classes.dex */
public final class C25159m implements InterfaceC25176u0 {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f98652g = 0;

    /* JADX INFO: renamed from: a */
    public final Instant f98653a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98654b;

    /* JADX INFO: renamed from: c */
    public final Instant f98655c;

    /* JADX INFO: renamed from: d */
    public final ZoneOffset f98656d;

    /* JADX INFO: renamed from: e */
    public final List f98657e;

    /* JADX INFO: renamed from: f */
    public final C26413c f98658f;

    static {
        AbstractC35902e.m113977p(2, "CyclingPedalingCadenceSeries", "rpm");
        AbstractC35902e.m113977p(3, "CyclingPedalingCadenceSeries", "rpm");
        AbstractC35902e.m113977p(4, "CyclingPedalingCadenceSeries", "rpm");
    }

    public C25159m(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, List list, C26413c c26413c) {
        this.f98653a = instant;
        this.f98654b = zoneOffset;
        this.f98655c = instant2;
        this.f98656d = zoneOffset2;
        this.f98657e = list;
        this.f98658f = c26413c;
        if (instant.isAfter(instant2)) {
            throw new IllegalArgumentException("startTime must not be after endTime.");
        }
    }

    @Override // p322m7.InterfaceC25176u0
    /* JADX INFO: renamed from: a */
    public final List mo73696a() {
        return this.f98657e;
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: b */
    public final ZoneOffset mo73691b() {
        return this.f98654b;
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98658f;
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: e */
    public final Instant mo73693e() {
        return this.f98655c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25159m)) {
            return false;
        }
        C25159m c25159m = (C25159m) obj;
        return AbstractC22676k.m65745e(this.f98653a, c25159m.f98653a) && AbstractC22676k.m65745e(this.f98654b, c25159m.f98654b) && AbstractC22676k.m65745e(this.f98655c, c25159m.f98655c) && AbstractC22676k.m65745e(this.f98656d, c25159m.f98656d) && AbstractC22676k.m65745e(this.f98657e, c25159m.f98657e) && AbstractC22676k.m65745e(this.f98658f, c25159m.f98658f);
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: f */
    public final ZoneOffset mo73694f() {
        return this.f98656d;
    }

    @Override // p322m7.InterfaceC25146g0
    public final Instant getStartTime() {
        return this.f98653a;
    }

    public final int hashCode() {
        int iHashCode = this.f98653a.hashCode() * 31;
        ZoneOffset zoneOffset = this.f98654b;
        int iM61131b = AbstractC21702c.m61131b(this.f98655c, (iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.f98656d;
        return this.f98658f.hashCode() + AbstractC11895b.m31983b((iM61131b + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31, 31, this.f98657e);
    }
}
