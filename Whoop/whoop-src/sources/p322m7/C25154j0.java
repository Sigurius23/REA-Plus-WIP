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

/* JADX INFO: renamed from: m7.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C25154j0 implements InterfaceC25140e0 {

    /* JADX INFO: renamed from: e */
    public static final Object f98628e;

    /* JADX INFO: renamed from: f */
    public static final LinkedHashMap f98629f;

    /* JADX INFO: renamed from: a */
    public final Instant f98630a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98631b;

    /* JADX INFO: renamed from: c */
    public final int f98632c;

    /* JADX INFO: renamed from: d */
    public final C26413c f98633d;

    static {
        Map mapM73990Y = AbstractC25247g0.m73990Y(new C23465k("light", 1), new C23465k("medium", 2), new C23465k("heavy", 3));
        f98628e = mapM73990Y;
        Set<Map.Entry> setEntrySet = mapM73990Y.entrySet();
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(setEntrySet, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (String) entry.getKey());
        }
        f98629f = linkedHashMap;
    }

    public C25154j0(Instant instant, ZoneOffset zoneOffset, int i13, C26413c c26413c) {
        this.f98630a = instant;
        this.f98631b = zoneOffset;
        this.f98632c = i13;
        this.f98633d = c26413c;
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98633d;
    }

    @Override // p322m7.InterfaceC25140e0
    /* JADX INFO: renamed from: d */
    public final ZoneOffset mo73695d() {
        return this.f98631b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25154j0)) {
            return false;
        }
        C25154j0 c25154j0 = (C25154j0) obj;
        return this.f98632c == c25154j0.f98632c && AbstractC22676k.m65745e(this.f98630a, c25154j0.f98630a) && AbstractC22676k.m65745e(this.f98631b, c25154j0.f98631b) && AbstractC22676k.m65745e(this.f98633d, c25154j0.f98633d);
    }

    @Override // p322m7.InterfaceC25140e0
    public final Instant getTime() {
        return this.f98630a;
    }

    public final int hashCode() {
        int iM61131b = AbstractC21702c.m61131b(this.f98630a, this.f98632c * 31, 31);
        ZoneOffset zoneOffset = this.f98631b;
        return this.f98633d.hashCode() + ((iM61131b + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }
}
