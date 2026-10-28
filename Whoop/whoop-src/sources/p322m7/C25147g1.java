package p322m7;

import java.time.Instant;
import java.time.ZoneOffset;
import jh3.AbstractC21702c;
import p336n7.C26413c;
import p452r7.C31003b0;
import p452r7.C31038t;
import p477s2.AbstractC32073e;
import p550vd.AbstractC35902e;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m7.g1 */
/* JADX INFO: loaded from: classes.dex */
public final class C25147g1 implements InterfaceC25140e0 {

    /* JADX INFO: renamed from: e */
    public static final C31003b0 f98595e = AbstractC22674j.m65701I();

    /* JADX INFO: renamed from: a */
    public final Instant f98596a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98597b;

    /* JADX INFO: renamed from: c */
    public final C31003b0 f98598c;

    /* JADX INFO: renamed from: d */
    public final C26413c f98599d;

    static {
        C31038t c31038t = C31003b0.f127986y;
        AbstractC35902e.m113978q(2, "Weight", "weight", new C25158l0(20));
        AbstractC35902e.m113978q(3, "Weight", "weight", new C25158l0(22));
        AbstractC35902e.m113978q(4, "Weight", "weight", new C25158l0(21));
    }

    public C25147g1(Instant instant, ZoneOffset zoneOffset, C31003b0 c31003b0, C26413c metadata) {
        AbstractC22676k.m65750j(metadata, "metadata");
        this.f98596a = instant;
        this.f98597b = zoneOffset;
        this.f98598c = c31003b0;
        this.f98599d = metadata;
        AbstractC32073e.m99736b0(c31003b0, c31003b0.m95541c(), "weight");
        AbstractC32073e.m99738c0(c31003b0, f98595e, "weight");
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98599d;
    }

    @Override // p322m7.InterfaceC25140e0
    /* JADX INFO: renamed from: d */
    public final ZoneOffset mo73695d() {
        return this.f98597b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25147g1)) {
            return false;
        }
        C25147g1 c25147g1 = (C25147g1) obj;
        return AbstractC22676k.m65745e(this.f98598c, c25147g1.f98598c) && AbstractC22676k.m65745e(this.f98596a, c25147g1.f98596a) && AbstractC22676k.m65745e(this.f98597b, c25147g1.f98597b) && AbstractC22676k.m65745e(this.f98599d, c25147g1.f98599d);
    }

    @Override // p322m7.InterfaceC25140e0
    public final Instant getTime() {
        return this.f98596a;
    }

    public final int hashCode() {
        int iM61131b = AbstractC21702c.m61131b(this.f98596a, this.f98598c.hashCode() * 31, 31);
        ZoneOffset zoneOffset = this.f98597b;
        return this.f98599d.hashCode() + ((iM61131b + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }
}
