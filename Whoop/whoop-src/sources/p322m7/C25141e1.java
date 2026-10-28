package p322m7;

import java.time.Instant;
import java.time.ZoneOffset;
import jh3.AbstractC21702c;
import p108e4.AbstractC12667a;
import p336n7.C26413c;
import p452r7.C31008e;
import p452r7.C31020k;
import p477s2.AbstractC32073e;
import p550vd.AbstractC35902e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m7.e1 */
/* JADX INFO: loaded from: classes.dex */
public final class C25141e1 implements InterfaceC25146g0 {

    /* JADX INFO: renamed from: g */
    public static final C31020k f98571g = AbstractC12667a.m35430A();

    /* JADX INFO: renamed from: a */
    public final Instant f98572a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98573b;

    /* JADX INFO: renamed from: c */
    public final Instant f98574c;

    /* JADX INFO: renamed from: d */
    public final ZoneOffset f98575d;

    /* JADX INFO: renamed from: e */
    public final C31020k f98576e;

    /* JADX INFO: renamed from: f */
    public final C26413c f98577f;

    static {
        C31008e c31008e = C31020k.f128009y;
        AbstractC35902e.m113978q(5, "TotalCaloriesBurned", "energy", new C25158l0(19));
    }

    public C25141e1(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, C31020k c31020k, C26413c c26413c) {
        this.f98572a = instant;
        this.f98573b = zoneOffset;
        this.f98574c = instant2;
        this.f98575d = zoneOffset2;
        this.f98576e = c31020k;
        this.f98577f = c26413c;
        AbstractC32073e.m99736b0(c31020k, c31020k.m95555c(), "energy");
        AbstractC32073e.m99738c0(c31020k, f98571g, "energy");
        if (!instant.isBefore(instant2)) {
            throw new IllegalArgumentException("startTime must be before endTime.");
        }
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: b */
    public final ZoneOffset mo73691b() {
        return this.f98573b;
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98577f;
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: e */
    public final Instant mo73693e() {
        return this.f98574c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25141e1)) {
            return false;
        }
        C25141e1 c25141e1 = (C25141e1) obj;
        return AbstractC22676k.m65745e(this.f98576e, c25141e1.f98576e) && AbstractC22676k.m65745e(this.f98572a, c25141e1.f98572a) && AbstractC22676k.m65745e(this.f98573b, c25141e1.f98573b) && AbstractC22676k.m65745e(this.f98574c, c25141e1.f98574c) && AbstractC22676k.m65745e(this.f98575d, c25141e1.f98575d) && AbstractC22676k.m65745e(this.f98577f, c25141e1.f98577f);
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: f */
    public final ZoneOffset mo73694f() {
        return this.f98575d;
    }

    @Override // p322m7.InterfaceC25146g0
    public final Instant getStartTime() {
        return this.f98572a;
    }

    public final int hashCode() {
        int iM61131b = AbstractC21702c.m61131b(this.f98572a, this.f98576e.hashCode() * 31, 31);
        ZoneOffset zoneOffset = this.f98573b;
        int iM61131b2 = AbstractC21702c.m61131b(this.f98574c, (iM61131b + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.f98575d;
        return this.f98577f.hashCode() + ((iM61131b2 + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31);
    }
}
