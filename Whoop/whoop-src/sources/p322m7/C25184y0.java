package p322m7;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import jh3.AbstractC21702c;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import p336n7.C26413c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m7.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C25184y0 implements InterfaceC25146g0 {

    /* JADX INFO: renamed from: g */
    public static final Object f98813g;

    /* JADX INFO: renamed from: h */
    public static final LinkedHashMap f98814h;

    /* JADX INFO: renamed from: a */
    public final Instant f98815a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98816b;

    /* JADX INFO: renamed from: c */
    public final Instant f98817c;

    /* JADX INFO: renamed from: d */
    public final ZoneOffset f98818d;

    /* JADX INFO: renamed from: e */
    public final int f98819e;

    /* JADX INFO: renamed from: f */
    public final C26413c f98820f;

    static {
        Map mapM73990Y = AbstractC25247g0.m73990Y(new C23465k("awake", 1), new C23465k("sleeping", 2), new C23465k("out_of_bed", 3), new C23465k("light", 4), new C23465k("deep", 5), new C23465k("rem", 6), new C23465k("unknown", 0));
        f98813g = mapM73990Y;
        Set<Map.Entry> setEntrySet = mapM73990Y.entrySet();
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(setEntrySet, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (String) entry.getKey());
        }
        f98814h = linkedHashMap;
    }

    public C25184y0(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, int i13, C26413c c26413c) {
        this.f98815a = instant;
        this.f98816b = zoneOffset;
        this.f98817c = instant2;
        this.f98818d = zoneOffset2;
        this.f98819e = i13;
        this.f98820f = c26413c;
        if (!instant.isBefore(instant2)) {
            throw new IllegalArgumentException("startTime must be before endTime.");
        }
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: b */
    public final ZoneOffset mo73691b() {
        return this.f98816b;
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98820f;
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: e */
    public final Instant mo73693e() {
        return this.f98817c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25184y0)) {
            return false;
        }
        C25184y0 c25184y0 = (C25184y0) obj;
        return this.f98819e == c25184y0.f98819e && AbstractC22676k.m65745e(this.f98815a, c25184y0.f98815a) && AbstractC22676k.m65745e(this.f98816b, c25184y0.f98816b) && AbstractC22676k.m65745e(this.f98817c, c25184y0.f98817c) && AbstractC22676k.m65745e(this.f98818d, c25184y0.f98818d) && AbstractC22676k.m65745e(this.f98820f, c25184y0.f98820f);
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: f */
    public final ZoneOffset mo73694f() {
        return this.f98818d;
    }

    @Override // p322m7.InterfaceC25146g0
    public final Instant getStartTime() {
        return this.f98815a;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f98819e) * 31;
        ZoneOffset zoneOffset = this.f98816b;
        int iM61131b = AbstractC21702c.m61131b(this.f98817c, (iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.f98818d;
        return this.f98820f.hashCode() + ((iM61131b + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31);
    }
}
