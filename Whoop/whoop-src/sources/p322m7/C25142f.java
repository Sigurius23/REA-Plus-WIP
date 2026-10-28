package p322m7;

import java.time.Instant;
import java.time.ZoneOffset;
import jh3.AbstractC21702c;
import p336n7.C26413c;
import p452r7.C31005c0;
import p477s2.AbstractC32073e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m7.f */
/* JADX INFO: loaded from: classes.dex */
public final class C25142f implements InterfaceC25140e0 {

    /* JADX INFO: renamed from: e */
    public static final C31005c0 f98578e = AbstractC32073e.m99718H();

    /* JADX INFO: renamed from: a */
    public final Instant f98579a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98580b;

    /* JADX INFO: renamed from: c */
    public final C31005c0 f98581c;

    /* JADX INFO: renamed from: d */
    public final C26413c f98582d;

    public C25142f(Instant instant, ZoneOffset zoneOffset, C31005c0 c31005c0, C26413c c26413c) {
        this.f98579a = instant;
        this.f98580b = zoneOffset;
        this.f98581c = c31005c0;
        this.f98582d = c26413c;
        AbstractC32073e.m99732Z(c31005c0.m95542a(), "percentage");
        AbstractC32073e.m99738c0(c31005c0, f98578e, "percentage");
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98582d;
    }

    @Override // p322m7.InterfaceC25140e0
    /* JADX INFO: renamed from: d */
    public final ZoneOffset mo73695d() {
        return this.f98580b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25142f)) {
            return false;
        }
        C25142f c25142f = (C25142f) obj;
        return AbstractC22676k.m65745e(this.f98581c, c25142f.f98581c) && AbstractC22676k.m65745e(this.f98579a, c25142f.f98579a) && AbstractC22676k.m65745e(this.f98580b, c25142f.f98580b) && AbstractC22676k.m65745e(this.f98582d, c25142f.f98582d);
    }

    @Override // p322m7.InterfaceC25140e0
    public final Instant getTime() {
        return this.f98579a;
    }

    public final int hashCode() {
        int iM61131b = AbstractC21702c.m61131b(this.f98579a, this.f98581c.hashCode() * 31, 31);
        ZoneOffset zoneOffset = this.f98580b;
        return this.f98582d.hashCode() + ((iM61131b + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }
}
