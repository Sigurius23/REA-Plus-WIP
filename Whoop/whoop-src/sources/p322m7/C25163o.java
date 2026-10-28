package p322m7;

import g40.C15352f4;
import io.sentry.config.AbstractC20301a;
import java.time.Instant;
import java.time.ZoneOffset;
import jh3.AbstractC21702c;
import p336n7.C26413c;
import p452r7.C31022l;
import p452r7.C31036s;
import p477s2.AbstractC32073e;
import p550vd.AbstractC35902e;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.DurationKt;

/* JADX INFO: renamed from: m7.o */
/* JADX INFO: loaded from: classes.dex */
public final class C25163o implements InterfaceC25146g0 {

    /* JADX INFO: renamed from: g */
    public static final C31036s f98726g = AbstractC20301a.m56304C(DurationKt.NANOS_IN_MILLIS);

    /* JADX INFO: renamed from: h */
    public static final C31036s f98727h = AbstractC20301a.m56304C(-1000000);

    /* JADX INFO: renamed from: a */
    public final Instant f98728a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98729b;

    /* JADX INFO: renamed from: c */
    public final Instant f98730c;

    /* JADX INFO: renamed from: d */
    public final ZoneOffset f98731d;

    /* JADX INFO: renamed from: e */
    public final C31036s f98732e;

    /* JADX INFO: renamed from: f */
    public final C26413c f98733f;

    static {
        C31022l c31022l = C31036s.f128022y;
        AbstractC35902e.m113978q(5, "ElevationGained", "elevation", new C15352f4(26));
    }

    public C25163o(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, C31036s c31036s, C26413c c26413c) {
        this.f98728a = instant;
        this.f98729b = zoneOffset;
        this.f98730c = instant2;
        this.f98731d = zoneOffset2;
        this.f98732e = c31036s;
        this.f98733f = c26413c;
        AbstractC32073e.m99736b0(c31036s, f98727h, "elevation");
        AbstractC32073e.m99738c0(c31036s, f98726g, "elevation");
        if (!instant.isBefore(instant2)) {
            throw new IllegalArgumentException("startTime must be before endTime.");
        }
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: b */
    public final ZoneOffset mo73691b() {
        return this.f98729b;
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98733f;
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: e */
    public final Instant mo73693e() {
        return this.f98730c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25163o)) {
            return false;
        }
        C25163o c25163o = (C25163o) obj;
        return AbstractC22676k.m65745e(this.f98732e, c25163o.f98732e) && AbstractC22676k.m65745e(this.f98728a, c25163o.f98728a) && AbstractC22676k.m65745e(this.f98729b, c25163o.f98729b) && AbstractC22676k.m65745e(this.f98730c, c25163o.f98730c) && AbstractC22676k.m65745e(this.f98731d, c25163o.f98731d) && AbstractC22676k.m65745e(this.f98733f, c25163o.f98733f);
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: f */
    public final ZoneOffset mo73694f() {
        return this.f98731d;
    }

    @Override // p322m7.InterfaceC25146g0
    public final Instant getStartTime() {
        return this.f98728a;
    }

    public final int hashCode() {
        int iM61131b = AbstractC21702c.m61131b(this.f98728a, this.f98732e.hashCode() * 31, 31);
        ZoneOffset zoneOffset = this.f98729b;
        int iM61131b2 = AbstractC21702c.m61131b(this.f98730c, (iM61131b + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.f98731d;
        return this.f98733f.hashCode() + ((iM61131b2 + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31);
    }
}
