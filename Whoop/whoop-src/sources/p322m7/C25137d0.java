package p322m7;

import java.time.Instant;
import java.time.ZoneOffset;
import jh3.AbstractC21702c;
import p336n7.C26413c;
import p452r7.C31035r0;
import p452r7.C31045w0;
import p477s2.AbstractC32073e;
import p507tx.AbstractC34235f;
import p550vd.AbstractC35902e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m7.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C25137d0 implements InterfaceC25146g0 {

    /* JADX INFO: renamed from: g */
    public static final C31045w0 f98543g = AbstractC34235f.m108207O();

    /* JADX INFO: renamed from: a */
    public final Instant f98544a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98545b;

    /* JADX INFO: renamed from: c */
    public final Instant f98546c;

    /* JADX INFO: renamed from: d */
    public final ZoneOffset f98547d;

    /* JADX INFO: renamed from: e */
    public final C31045w0 f98548e;

    /* JADX INFO: renamed from: f */
    public final C26413c f98549f;

    static {
        C31035r0 c31035r0 = C31045w0.f128028y;
        AbstractC35902e.m113978q(5, "Hydration", "volume", new C25134c0(0));
    }

    public C25137d0(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, C31045w0 c31045w0, C26413c c26413c) {
        this.f98544a = instant;
        this.f98545b = zoneOffset;
        this.f98546c = instant2;
        this.f98547d = zoneOffset2;
        this.f98548e = c31045w0;
        this.f98549f = c26413c;
        AbstractC32073e.m99736b0(c31045w0, c31045w0.m95570b(), "volume");
        AbstractC32073e.m99738c0(c31045w0, f98543g, "volume");
        if (!instant.isBefore(instant2)) {
            throw new IllegalArgumentException("startTime must be before endTime.");
        }
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: b */
    public final ZoneOffset mo73691b() {
        return this.f98545b;
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98549f;
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: e */
    public final Instant mo73693e() {
        return this.f98546c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25137d0)) {
            return false;
        }
        C25137d0 c25137d0 = (C25137d0) obj;
        return AbstractC22676k.m65745e(this.f98548e, c25137d0.f98548e) && AbstractC22676k.m65745e(this.f98544a, c25137d0.f98544a) && AbstractC22676k.m65745e(this.f98545b, c25137d0.f98545b) && AbstractC22676k.m65745e(this.f98546c, c25137d0.f98546c) && AbstractC22676k.m65745e(this.f98547d, c25137d0.f98547d) && AbstractC22676k.m65745e(this.f98549f, c25137d0.f98549f);
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: f */
    public final ZoneOffset mo73694f() {
        return this.f98547d;
    }

    @Override // p322m7.InterfaceC25146g0
    public final Instant getStartTime() {
        return this.f98544a;
    }

    public final int hashCode() {
        int iM61131b = AbstractC21702c.m61131b(this.f98544a, this.f98548e.hashCode() * 31, 31);
        ZoneOffset zoneOffset = this.f98545b;
        int iM61131b2 = AbstractC21702c.m61131b(this.f98546c, (iM61131b + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.f98547d;
        return this.f98549f.hashCode() + ((iM61131b2 + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31);
    }
}
