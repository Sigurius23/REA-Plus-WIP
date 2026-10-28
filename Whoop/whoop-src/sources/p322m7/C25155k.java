package p322m7;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p336n7.C26413c;
import p477s2.AbstractC32073e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m7.k */
/* JADX INFO: loaded from: classes.dex */
public final class C25155k implements InterfaceC25140e0 {

    /* JADX INFO: renamed from: f */
    public static final Object f98634f;

    /* JADX INFO: renamed from: g */
    public static final LinkedHashMap f98635g;

    /* JADX INFO: renamed from: h */
    public static final Object f98636h;

    /* JADX INFO: renamed from: i */
    public static final LinkedHashMap f98637i;

    /* JADX INFO: renamed from: a */
    public final Instant f98638a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98639b;

    /* JADX INFO: renamed from: c */
    public final int f98640c;

    /* JADX INFO: renamed from: d */
    public final int f98641d;

    /* JADX INFO: renamed from: e */
    public final C26413c f98642e;

    static {
        Map mapM73990Y = AbstractC25247g0.m73990Y(new C23465k("clear", 5), new C23465k("creamy", 3), new C23465k("dry", 1), new C23465k("sticky", 2), new C23465k("watery", 4), new C23465k("unusual", 6));
        f98634f = mapM73990Y;
        f98635g = AbstractC32073e.m99740d0(mapM73990Y);
        Map mapM73990Y2 = AbstractC25247g0.m73990Y(new C23465k("light", 1), new C23465k("medium", 2), new C23465k("heavy", 3));
        f98636h = mapM73990Y2;
        f98637i = AbstractC32073e.m99740d0(mapM73990Y2);
    }

    public C25155k(Instant instant, ZoneOffset zoneOffset, int i13, int i14, C26413c c26413c) {
        this.f98638a = instant;
        this.f98639b = zoneOffset;
        this.f98640c = i13;
        this.f98641d = i14;
        this.f98642e = c26413c;
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98642e;
    }

    @Override // p322m7.InterfaceC25140e0
    /* JADX INFO: renamed from: d */
    public final ZoneOffset mo73695d() {
        return this.f98639b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C25155k.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type androidx.health.connect.client.records.CervicalMucusRecord");
        C25155k c25155k = (C25155k) obj;
        return AbstractC22676k.m65745e(this.f98638a, c25155k.f98638a) && AbstractC22676k.m65745e(this.f98639b, c25155k.f98639b) && this.f98640c == c25155k.f98640c && this.f98641d == c25155k.f98641d && AbstractC22676k.m65745e(this.f98642e, c25155k.f98642e);
    }

    @Override // p322m7.InterfaceC25140e0
    public final Instant getTime() {
        return this.f98638a;
    }

    public final int hashCode() {
        int iHashCode = this.f98638a.hashCode() * 31;
        ZoneOffset zoneOffset = this.f98639b;
        return this.f98642e.hashCode() + ((((((iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31) + this.f98640c) * 31) + this.f98641d) * 31);
    }
}
