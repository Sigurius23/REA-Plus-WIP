package p322m7;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p097ds.AbstractC12314q;
import p336n7.C26413c;
import p452r7.C31006d;
import p477s2.AbstractC32073e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m7.d */
/* JADX INFO: loaded from: classes.dex */
public final class C25136d implements InterfaceC25140e0 {

    /* JADX INFO: renamed from: h */
    public static final C31006d f98531h;

    /* JADX INFO: renamed from: i */
    public static final Object f98532i;

    /* JADX INFO: renamed from: j */
    public static final LinkedHashMap f98533j;

    /* JADX INFO: renamed from: k */
    public static final Object f98534k;

    /* JADX INFO: renamed from: l */
    public static final LinkedHashMap f98535l;

    /* JADX INFO: renamed from: a */
    public final Instant f98536a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98537b;

    /* JADX INFO: renamed from: c */
    public final C31006d f98538c;

    /* JADX INFO: renamed from: d */
    public final int f98539d;

    /* JADX INFO: renamed from: e */
    public final int f98540e;

    /* JADX INFO: renamed from: f */
    public final int f98541f;

    /* JADX INFO: renamed from: g */
    public final C26413c f98542g;

    static {
        LinkedHashMap linkedHashMap = C31006d.f127993y;
        f98531h = AbstractC12314q.m34312D(50.0d);
        Map mapM73990Y = AbstractC25247g0.m73990Y(new C23465k("general", 1), new C23465k("after_meal", 4), new C23465k("fasting", 2), new C23465k("before_meal", 3));
        f98532i = mapM73990Y;
        f98533j = AbstractC32073e.m99740d0(mapM73990Y);
        Map mapM73990Y2 = AbstractC25247g0.m73990Y(new C23465k("interstitial_fluid", 1), new C23465k("capillary_blood", 2), new C23465k("plasma", 3), new C23465k("tears", 5), new C23465k("whole_blood", 6), new C23465k("serum", 4));
        f98534k = mapM73990Y2;
        f98535l = AbstractC32073e.m99740d0(mapM73990Y2);
    }

    public C25136d(Instant instant, ZoneOffset zoneOffset, C31006d c31006d, int i13, int i14, int i15, C26413c c26413c) {
        this.f98536a = instant;
        this.f98537b = zoneOffset;
        this.f98538c = c31006d;
        this.f98539d = i13;
        this.f98540e = i14;
        this.f98541f = i15;
        this.f98542g = c26413c;
        AbstractC32073e.m99736b0(c31006d, c31006d.m95544b(), "level");
        AbstractC32073e.m99738c0(c31006d, f98531h, "level");
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98542g;
    }

    @Override // p322m7.InterfaceC25140e0
    /* JADX INFO: renamed from: d */
    public final ZoneOffset mo73695d() {
        return this.f98537b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C25136d.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type androidx.health.connect.client.records.BloodGlucoseRecord");
        C25136d c25136d = (C25136d) obj;
        return AbstractC22676k.m65745e(this.f98536a, c25136d.f98536a) && AbstractC22676k.m65745e(this.f98537b, c25136d.f98537b) && AbstractC22676k.m65745e(this.f98538c, c25136d.f98538c) && this.f98539d == c25136d.f98539d && this.f98540e == c25136d.f98540e && this.f98541f == c25136d.f98541f && AbstractC22676k.m65745e(this.f98542g, c25136d.f98542g);
    }

    @Override // p322m7.InterfaceC25140e0
    public final Instant getTime() {
        return this.f98536a;
    }

    public final int hashCode() {
        int iHashCode = this.f98536a.hashCode() * 31;
        ZoneOffset zoneOffset = this.f98537b;
        return this.f98542g.hashCode() + ((((((((this.f98538c.hashCode() + ((iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31)) * 31) + this.f98539d) * 31) + this.f98540e) * 31) + this.f98541f) * 31);
    }
}
