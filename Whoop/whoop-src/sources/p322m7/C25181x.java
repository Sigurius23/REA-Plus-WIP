package p322m7;

import java.time.Instant;
import java.time.ZoneOffset;
import jh3.AbstractC21702c;
import p336n7.C26413c;
import p477s2.AbstractC32073e;
import p550vd.AbstractC35902e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m7.x */
/* JADX INFO: loaded from: classes.dex */
public final class C25181x implements InterfaceC25146g0 {

    /* JADX INFO: renamed from: a */
    public final Instant f98795a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98796b;

    /* JADX INFO: renamed from: c */
    public final Instant f98797c;

    /* JADX INFO: renamed from: d */
    public final ZoneOffset f98798d;

    /* JADX INFO: renamed from: e */
    public final double f98799e;

    /* JADX INFO: renamed from: f */
    public final C26413c f98800f;

    static {
        AbstractC35902e.m113977p(5, "FloorsClimbed", "floors");
    }

    public C25181x(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, double d3, C26413c c26413c) {
        this.f98795a = instant;
        this.f98796b = zoneOffset;
        this.f98797c = instant2;
        this.f98798d = zoneOffset2;
        this.f98799e = d3;
        this.f98800f = c26413c;
        AbstractC32073e.m99732Z(d3, "floors");
        AbstractC32073e.m99738c0(Double.valueOf(d3), Double.valueOf(1000000.0d), "floors");
        if (!instant.isBefore(instant2)) {
            throw new IllegalArgumentException("startTime must be before endTime.");
        }
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: b */
    public final ZoneOffset mo73691b() {
        return this.f98796b;
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98800f;
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: e */
    public final Instant mo73693e() {
        return this.f98797c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25181x)) {
            return false;
        }
        C25181x c25181x = (C25181x) obj;
        return this.f98799e == c25181x.f98799e && AbstractC22676k.m65745e(this.f98795a, c25181x.f98795a) && AbstractC22676k.m65745e(this.f98796b, c25181x.f98796b) && AbstractC22676k.m65745e(this.f98797c, c25181x.f98797c) && AbstractC22676k.m65745e(this.f98798d, c25181x.f98798d) && AbstractC22676k.m65745e(this.f98800f, c25181x.f98800f);
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: f */
    public final ZoneOffset mo73694f() {
        return this.f98798d;
    }

    @Override // p322m7.InterfaceC25146g0
    public final Instant getStartTime() {
        return this.f98795a;
    }

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.f98799e) * 31;
        ZoneOffset zoneOffset = this.f98796b;
        int iM61131b = AbstractC21702c.m61131b(this.f98797c, (iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.f98798d;
        return this.f98800f.hashCode() + ((iM61131b + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31);
    }
}
