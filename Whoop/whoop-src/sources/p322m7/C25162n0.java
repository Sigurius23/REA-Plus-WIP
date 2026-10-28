package p322m7;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.Map;
import jh3.AbstractC21702c;
import l83.C23465k;
import m83.AbstractC25247g0;
import p336n7.C26413c;
import p477s2.AbstractC32073e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m7.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C25162n0 implements InterfaceC25140e0 {

    /* JADX INFO: renamed from: e */
    public static final Object f98720e;

    /* JADX INFO: renamed from: f */
    public static final LinkedHashMap f98721f;

    /* JADX INFO: renamed from: a */
    public final Instant f98722a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98723b;

    /* JADX INFO: renamed from: c */
    public final int f98724c;

    /* JADX INFO: renamed from: d */
    public final C26413c f98725d;

    static {
        Map mapM73990Y = AbstractC25247g0.m73990Y(new C23465k("inconclusive", 0), new C23465k("positive", 1), new C23465k("high", 2), new C23465k("negative", 3));
        f98720e = mapM73990Y;
        f98721f = AbstractC32073e.m99740d0(mapM73990Y);
    }

    public C25162n0(Instant instant, ZoneOffset zoneOffset, int i13, C26413c c26413c) {
        this.f98722a = instant;
        this.f98723b = zoneOffset;
        this.f98724c = i13;
        this.f98725d = c26413c;
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98725d;
    }

    @Override // p322m7.InterfaceC25140e0
    /* JADX INFO: renamed from: d */
    public final ZoneOffset mo73695d() {
        return this.f98723b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25162n0)) {
            return false;
        }
        C25162n0 c25162n0 = (C25162n0) obj;
        return this.f98724c == c25162n0.f98724c && AbstractC22676k.m65745e(this.f98722a, c25162n0.f98722a) && AbstractC22676k.m65745e(this.f98723b, c25162n0.f98723b) && AbstractC22676k.m65745e(this.f98725d, c25162n0.f98725d);
    }

    @Override // p322m7.InterfaceC25140e0
    public final Instant getTime() {
        return this.f98722a;
    }

    public final int hashCode() {
        int iM61131b = AbstractC21702c.m61131b(this.f98722a, Integer.hashCode(this.f98724c) * 31, 31);
        ZoneOffset zoneOffset = this.f98723b;
        return this.f98725d.hashCode() + ((iM61131b + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }
}
