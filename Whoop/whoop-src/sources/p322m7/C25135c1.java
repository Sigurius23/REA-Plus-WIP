package p322m7;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.List;
import jh3.AbstractC21702c;
import p088dc.AbstractC11895b;
import p336n7.C26413c;
import p550vd.AbstractC35902e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m7.c1 */
/* JADX INFO: loaded from: classes.dex */
public final class C25135c1 implements InterfaceC25176u0 {

    /* JADX INFO: renamed from: a */
    public final Instant f98525a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98526b;

    /* JADX INFO: renamed from: c */
    public final Instant f98527c;

    /* JADX INFO: renamed from: d */
    public final ZoneOffset f98528d;

    /* JADX INFO: renamed from: e */
    public final List f98529e;

    /* JADX INFO: renamed from: f */
    public final C26413c f98530f;

    static {
        AbstractC35902e.m113977p(2, "StepsCadenceSeries", "rate");
        AbstractC35902e.m113977p(3, "StepsCadenceSeries", "rate");
        AbstractC35902e.m113977p(4, "StepsCadenceSeries", "rate");
    }

    public C25135c1(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, List list, C26413c c26413c) {
        this.f98525a = instant;
        this.f98526b = zoneOffset;
        this.f98527c = instant2;
        this.f98528d = zoneOffset2;
        this.f98529e = list;
        this.f98530f = c26413c;
        if (instant.isAfter(instant2)) {
            throw new IllegalArgumentException("startTime must not be after endTime.");
        }
    }

    @Override // p322m7.InterfaceC25176u0
    /* JADX INFO: renamed from: a */
    public final List mo73696a() {
        return this.f98529e;
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: b */
    public final ZoneOffset mo73691b() {
        return this.f98526b;
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98530f;
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: e */
    public final Instant mo73693e() {
        return this.f98527c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25135c1)) {
            return false;
        }
        C25135c1 c25135c1 = (C25135c1) obj;
        return AbstractC22676k.m65745e(this.f98525a, c25135c1.f98525a) && AbstractC22676k.m65745e(this.f98526b, c25135c1.f98526b) && AbstractC22676k.m65745e(this.f98527c, c25135c1.f98527c) && AbstractC22676k.m65745e(this.f98528d, c25135c1.f98528d) && AbstractC22676k.m65745e(this.f98529e, c25135c1.f98529e) && AbstractC22676k.m65745e(this.f98530f, c25135c1.f98530f);
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: f */
    public final ZoneOffset mo73694f() {
        return this.f98528d;
    }

    @Override // p322m7.InterfaceC25146g0
    public final Instant getStartTime() {
        return this.f98525a;
    }

    public final int hashCode() {
        int iHashCode = this.f98525a.hashCode() * 31;
        ZoneOffset zoneOffset = this.f98526b;
        int iM61131b = AbstractC21702c.m61131b(this.f98527c, (iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.f98528d;
        return this.f98530f.hashCode() + AbstractC11895b.m31983b((iM61131b + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31, 31, this.f98529e);
    }
}
