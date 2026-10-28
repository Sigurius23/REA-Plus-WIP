package p322m7;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.List;
import jh3.AbstractC21702c;
import p088dc.AbstractC11895b;
import p336n7.C26413c;
import p550vd.AbstractC35902e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m7.z */
/* JADX INFO: loaded from: classes.dex */
public final class C25185z implements InterfaceC25176u0 {

    /* JADX INFO: renamed from: a */
    public final Instant f98821a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98822b;

    /* JADX INFO: renamed from: c */
    public final Instant f98823c;

    /* JADX INFO: renamed from: d */
    public final ZoneOffset f98824d;

    /* JADX INFO: renamed from: e */
    public final List f98825e;

    /* JADX INFO: renamed from: f */
    public final C26413c f98826f;

    static {
        AbstractC35902e.m113942M(2, "HeartRateSeries", "bpm");
        AbstractC35902e.m113942M(3, "HeartRateSeries", "bpm");
        AbstractC35902e.m113942M(4, "HeartRateSeries", "bpm");
        AbstractC35902e.m113968j();
    }

    public C25185z(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, List list, C26413c c26413c) {
        this.f98821a = instant;
        this.f98822b = zoneOffset;
        this.f98823c = instant2;
        this.f98824d = zoneOffset2;
        this.f98825e = list;
        this.f98826f = c26413c;
        if (instant.isAfter(instant2)) {
            throw new IllegalArgumentException("startTime must not be after endTime.");
        }
    }

    @Override // p322m7.InterfaceC25176u0
    /* JADX INFO: renamed from: a */
    public final List mo73696a() {
        return this.f98825e;
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: b */
    public final ZoneOffset mo73691b() {
        return this.f98822b;
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98826f;
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: e */
    public final Instant mo73693e() {
        return this.f98823c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25185z)) {
            return false;
        }
        C25185z c25185z = (C25185z) obj;
        return AbstractC22676k.m65745e(this.f98821a, c25185z.f98821a) && AbstractC22676k.m65745e(this.f98822b, c25185z.f98822b) && AbstractC22676k.m65745e(this.f98823c, c25185z.f98823c) && AbstractC22676k.m65745e(this.f98824d, c25185z.f98824d) && AbstractC22676k.m65745e(this.f98825e, c25185z.f98825e) && AbstractC22676k.m65745e(this.f98826f, c25185z.f98826f);
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: f */
    public final ZoneOffset mo73694f() {
        return this.f98824d;
    }

    @Override // p322m7.InterfaceC25146g0
    public final Instant getStartTime() {
        return this.f98821a;
    }

    public final int hashCode() {
        int iHashCode = this.f98821a.hashCode() * 31;
        ZoneOffset zoneOffset = this.f98822b;
        int iM61131b = AbstractC21702c.m61131b(this.f98823c, (iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.f98824d;
        return this.f98826f.hashCode() + AbstractC11895b.m31983b((iM61131b + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31, 31, this.f98825e);
    }
}
