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

/* JADX INFO: renamed from: m7.n */
/* JADX INFO: loaded from: classes.dex */
public final class C25161n implements InterfaceC25146g0 {

    /* JADX INFO: renamed from: g */
    public static final C31036s f98713g = AbstractC20301a.m56304C(DurationKt.NANOS_IN_MILLIS);

    /* JADX INFO: renamed from: a */
    public final Instant f98714a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98715b;

    /* JADX INFO: renamed from: c */
    public final Instant f98716c;

    /* JADX INFO: renamed from: d */
    public final ZoneOffset f98717d;

    /* JADX INFO: renamed from: e */
    public final C31036s f98718e;

    /* JADX INFO: renamed from: f */
    public final C26413c f98719f;

    static {
        C31022l c31022l = C31036s.f128022y;
        AbstractC35902e.m113978q(5, "Distance", "distance", new C15352f4(25));
    }

    public C25161n(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, C31036s c31036s, C26413c c26413c) {
        this.f98714a = instant;
        this.f98715b = zoneOffset;
        this.f98716c = instant2;
        this.f98717d = zoneOffset2;
        this.f98718e = c31036s;
        this.f98719f = c26413c;
        AbstractC32073e.m99736b0(c31036s, c31036s.m95563b(), "distance");
        AbstractC32073e.m99738c0(c31036s, f98713g, "distance");
        if (!instant.isBefore(instant2)) {
            throw new IllegalArgumentException("startTime must be before endTime.");
        }
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: b */
    public final ZoneOffset mo73691b() {
        return this.f98715b;
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98719f;
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: e */
    public final Instant mo73693e() {
        return this.f98716c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25161n)) {
            return false;
        }
        C25161n c25161n = (C25161n) obj;
        C31036s c31036s = c25161n.f98718e;
        C31036s c31036s2 = this.f98718e;
        return AbstractC22676k.m65745e(c31036s2, c31036s) && AbstractC22676k.m65745e(this.f98714a, c25161n.f98714a) && AbstractC22676k.m65745e(this.f98715b, c25161n.f98715b) && AbstractC22676k.m65745e(this.f98716c, c25161n.f98716c) && AbstractC22676k.m65745e(this.f98717d, c25161n.f98717d) && AbstractC22676k.m65745e(this.f98719f, c25161n.f98719f) && c31036s2.m95562a() == c31036s.m95562a();
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: f */
    public final ZoneOffset mo73694f() {
        return this.f98717d;
    }

    @Override // p322m7.InterfaceC25146g0
    public final Instant getStartTime() {
        return this.f98714a;
    }

    public final int hashCode() {
        C31036s c31036s = this.f98718e;
        int iM61131b = AbstractC21702c.m61131b(this.f98714a, c31036s.hashCode() * 31, 31);
        ZoneOffset zoneOffset = this.f98715b;
        int iM61131b2 = AbstractC21702c.m61131b(this.f98716c, (iM61131b + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.f98717d;
        return Double.hashCode(c31036s.m95562a()) + ((this.f98719f.hashCode() + ((iM61131b2 + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31)) * 31);
    }
}
