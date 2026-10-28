package p322m7;

import g40.C15352f4;
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

/* JADX INFO: renamed from: m7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C25127a implements InterfaceC25146g0 {

    /* JADX INFO: renamed from: g */
    public static final C31020k f98487g = AbstractC12667a.m35430A();

    /* JADX INFO: renamed from: a */
    public final Instant f98488a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98489b;

    /* JADX INFO: renamed from: c */
    public final Instant f98490c;

    /* JADX INFO: renamed from: d */
    public final ZoneOffset f98491d;

    /* JADX INFO: renamed from: e */
    public final C31020k f98492e;

    /* JADX INFO: renamed from: f */
    public final C26413c f98493f;

    static {
        C31008e c31008e = C31020k.f128009y;
        AbstractC35902e.m113978q(5, "ActiveCaloriesBurned", "energy", new C15352f4(17));
    }

    public C25127a(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, C31020k c31020k, C26413c c26413c) {
        this.f98488a = instant;
        this.f98489b = zoneOffset;
        this.f98490c = instant2;
        this.f98491d = zoneOffset2;
        this.f98492e = c31020k;
        this.f98493f = c26413c;
        AbstractC32073e.m99736b0(c31020k, c31020k.m95555c(), "energy");
        AbstractC32073e.m99738c0(c31020k, f98487g, "energy");
        if (!instant.isBefore(instant2)) {
            throw new IllegalArgumentException("startTime must be before endTime.");
        }
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: b */
    public final ZoneOffset mo73691b() {
        return this.f98489b;
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98493f;
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: e */
    public final Instant mo73693e() {
        return this.f98490c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25127a)) {
            return false;
        }
        C25127a c25127a = (C25127a) obj;
        return AbstractC22676k.m65745e(this.f98492e, c25127a.f98492e) && AbstractC22676k.m65745e(this.f98488a, c25127a.f98488a) && AbstractC22676k.m65745e(this.f98489b, c25127a.f98489b) && AbstractC22676k.m65745e(this.f98490c, c25127a.f98490c) && AbstractC22676k.m65745e(this.f98491d, c25127a.f98491d) && AbstractC22676k.m65745e(this.f98493f, c25127a.f98493f);
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: f */
    public final ZoneOffset mo73694f() {
        return this.f98491d;
    }

    @Override // p322m7.InterfaceC25146g0
    public final Instant getStartTime() {
        return this.f98488a;
    }

    public final int hashCode() {
        int iM61131b = AbstractC21702c.m61131b(this.f98488a, this.f98492e.hashCode() * 31, 31);
        ZoneOffset zoneOffset = this.f98489b;
        int iM61131b2 = AbstractC21702c.m61131b(this.f98490c, (iM61131b + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.f98491d;
        return this.f98493f.hashCode() + ((iM61131b2 + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31);
    }
}
