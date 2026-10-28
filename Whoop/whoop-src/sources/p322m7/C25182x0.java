package p322m7;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jh3.AbstractC21702c;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p088dc.AbstractC11895b;
import p318m3.C24977g;
import p336n7.C26413c;
import p550vd.AbstractC35902e;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: m7.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C25182x0 implements InterfaceC25146g0 {

    /* JADX INFO: renamed from: i */
    public static final Object f98801i;

    /* JADX INFO: renamed from: j */
    public static final LinkedHashMap f98802j;

    /* JADX INFO: renamed from: a */
    public final Instant f98803a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98804b;

    /* JADX INFO: renamed from: c */
    public final Instant f98805c;

    /* JADX INFO: renamed from: d */
    public final ZoneOffset f98806d;

    /* JADX INFO: renamed from: e */
    public final String f98807e;

    /* JADX INFO: renamed from: f */
    public final String f98808f;

    /* JADX INFO: renamed from: g */
    public final List f98809g;

    /* JADX INFO: renamed from: h */
    public final C26413c f98810h;

    static {
        AbstractC35902e.m113979s();
        Map mapM73990Y = AbstractC25247g0.m73990Y(new C23465k("awake", 1), new C23465k("sleeping", 2), new C23465k("out_of_bed", 3), new C23465k("light", 4), new C23465k("deep", 5), new C23465k("rem", 6), new C23465k("awake_in_bed", 7), new C23465k("unknown", 0));
        f98801i = mapM73990Y;
        Set<Map.Entry> setEntrySet = mapM73990Y.entrySet();
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(setEntrySet, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (String) entry.getKey());
        }
        f98802j = linkedHashMap;
    }

    public C25182x0(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, String str, String str2, List list, C26413c c26413c) {
        this.f98803a = instant;
        this.f98804b = zoneOffset;
        this.f98805c = instant2;
        this.f98806d = zoneOffset2;
        this.f98807e = str;
        this.f98808f = str2;
        this.f98809g = list;
        this.f98810h = c26413c;
        if (!instant.isBefore(instant2)) {
            throw new IllegalArgumentException("startTime must be before endTime.");
        }
        if (list.isEmpty()) {
            return;
        }
        List listM74152u1 = AbstractC25265s.m74152u1(list, new C24977g(3));
        int iM118951C = AbstractC37056f.m118951C(listM74152u1);
        int i13 = 0;
        while (i13 < iM118951C) {
            Instant instantM73704a = ((C25180w0) listM74152u1.get(i13)).m73704a();
            i13++;
            if (instantM73704a.isAfter(((C25180w0) listM74152u1.get(i13)).m73705b())) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        if (((C25180w0) AbstractC25265s.m74096F0(listM74152u1)).m73705b().isBefore(this.f98803a)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (((C25180w0) AbstractC25265s.m74112P0(listM74152u1)).m73704a().isAfter(this.f98805c)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: b */
    public final ZoneOffset mo73691b() {
        return this.f98804b;
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98810h;
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: e */
    public final Instant mo73693e() {
        return this.f98805c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25182x0)) {
            return false;
        }
        C25182x0 c25182x0 = (C25182x0) obj;
        return AbstractC22676k.m65745e(this.f98807e, c25182x0.f98807e) && AbstractC22676k.m65745e(this.f98808f, c25182x0.f98808f) && AbstractC22676k.m65745e(this.f98809g, c25182x0.f98809g) && AbstractC22676k.m65745e(this.f98803a, c25182x0.f98803a) && AbstractC22676k.m65745e(this.f98804b, c25182x0.f98804b) && AbstractC22676k.m65745e(this.f98805c, c25182x0.f98805c) && AbstractC22676k.m65745e(this.f98806d, c25182x0.f98806d) && AbstractC22676k.m65745e(this.f98810h, c25182x0.f98810h);
    }

    @Override // p322m7.InterfaceC25146g0
    /* JADX INFO: renamed from: f */
    public final ZoneOffset mo73694f() {
        return this.f98806d;
    }

    @Override // p322m7.InterfaceC25146g0
    public final Instant getStartTime() {
        return this.f98803a;
    }

    public final int hashCode() {
        String str = this.f98807e;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f98808f;
        int iM31983b = AbstractC11895b.m31983b((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f98809g);
        ZoneOffset zoneOffset = this.f98804b;
        int iM61131b = AbstractC21702c.m61131b(this.f98805c, (iM31983b + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.f98806d;
        return this.f98810h.hashCode() + ((iM61131b + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31);
    }
}
