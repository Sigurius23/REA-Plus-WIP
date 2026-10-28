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

/* JADX INFO: renamed from: m7.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C25178v0 implements InterfaceC25140e0 {

    /* JADX INFO: renamed from: e */
    public static final Object f98773e;

    /* JADX INFO: renamed from: f */
    public static final LinkedHashMap f98774f;

    /* JADX INFO: renamed from: a */
    public final Instant f98775a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98776b;

    /* JADX INFO: renamed from: c */
    public final int f98777c;

    /* JADX INFO: renamed from: d */
    public final C26413c f98778d;

    static {
        Map mapM73990Y = AbstractC25247g0.m73990Y(new C23465k("protected", 1), new C23465k("unprotected", 2));
        f98773e = mapM73990Y;
        f98774f = AbstractC32073e.m99740d0(mapM73990Y);
    }

    public C25178v0(Instant instant, ZoneOffset zoneOffset, int i13, C26413c c26413c) {
        this.f98775a = instant;
        this.f98776b = zoneOffset;
        this.f98777c = i13;
        this.f98778d = c26413c;
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98778d;
    }

    @Override // p322m7.InterfaceC25140e0
    /* JADX INFO: renamed from: d */
    public final ZoneOffset mo73695d() {
        return this.f98776b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25178v0)) {
            return false;
        }
        C25178v0 c25178v0 = (C25178v0) obj;
        return this.f98777c == c25178v0.f98777c && AbstractC22676k.m65745e(this.f98775a, c25178v0.f98775a) && AbstractC22676k.m65745e(this.f98776b, c25178v0.f98776b) && AbstractC22676k.m65745e(this.f98778d, c25178v0.f98778d);
    }

    @Override // p322m7.InterfaceC25140e0
    public final Instant getTime() {
        return this.f98775a;
    }

    public final int hashCode() {
        int iM61131b = AbstractC21702c.m61131b(this.f98775a, this.f98777c * 31, 31);
        ZoneOffset zoneOffset = this.f98776b;
        return this.f98778d.hashCode() + ((iM61131b + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }
}
