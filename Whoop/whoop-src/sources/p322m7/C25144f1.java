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

/* JADX INFO: renamed from: m7.f1 */
/* JADX INFO: loaded from: classes.dex */
public final class C25144f1 implements InterfaceC25140e0 {

    /* JADX INFO: renamed from: f */
    public static final Object f98586f;

    /* JADX INFO: renamed from: g */
    public static final LinkedHashMap f98587g;

    /* JADX INFO: renamed from: a */
    public final Instant f98588a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98589b;

    /* JADX INFO: renamed from: c */
    public final double f98590c;

    /* JADX INFO: renamed from: d */
    public final int f98591d;

    /* JADX INFO: renamed from: e */
    public final C26413c f98592e;

    static {
        Map mapM73990Y = AbstractC25247g0.m73990Y(new C23465k("other", 0), new C23465k("metabolic_cart", 1), new C23465k("heart_rate_ratio", 2), new C23465k("cooper_test", 3), new C23465k("multistage_fitness_test", 4), new C23465k("rockport_fitness_test", 5));
        f98586f = mapM73990Y;
        f98587g = AbstractC32073e.m99740d0(mapM73990Y);
    }

    public C25144f1(Instant instant, ZoneOffset zoneOffset, double d3, int i13, C26413c c26413c) {
        this.f98588a = instant;
        this.f98589b = zoneOffset;
        this.f98590c = d3;
        this.f98591d = i13;
        this.f98592e = c26413c;
        AbstractC32073e.m99732Z(d3, "vo2MillilitersPerMinuteKilogram");
        AbstractC32073e.m99738c0(Double.valueOf(d3), Double.valueOf(100.0d), "vo2MillilitersPerMinuteKilogram");
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98592e;
    }

    @Override // p322m7.InterfaceC25140e0
    /* JADX INFO: renamed from: d */
    public final ZoneOffset mo73695d() {
        return this.f98589b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25144f1)) {
            return false;
        }
        C25144f1 c25144f1 = (C25144f1) obj;
        return this.f98590c == c25144f1.f98590c && this.f98591d == c25144f1.f98591d && AbstractC22676k.m65745e(this.f98588a, c25144f1.f98588a) && AbstractC22676k.m65745e(this.f98589b, c25144f1.f98589b) && AbstractC22676k.m65745e(this.f98592e, c25144f1.f98592e);
    }

    @Override // p322m7.InterfaceC25140e0
    public final Instant getTime() {
        return this.f98588a;
    }

    public final int hashCode() {
        int iM61131b = AbstractC21702c.m61131b(this.f98588a, ((Double.hashCode(this.f98590c) * 31) + this.f98591d) * 31, 31);
        ZoneOffset zoneOffset = this.f98589b;
        return this.f98592e.hashCode() + ((iM61131b + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }
}
