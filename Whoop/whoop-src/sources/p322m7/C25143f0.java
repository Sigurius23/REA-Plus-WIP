package p322m7;

import java.time.Instant;
import java.time.ZoneOffset;
import p336n7.C26413c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m7.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C25143f0 implements InterfaceC25140e0 {

    /* JADX INFO: renamed from: a */
    public final Instant f98583a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98584b;

    /* JADX INFO: renamed from: c */
    public final C26413c f98585c;

    public C25143f0(Instant instant, ZoneOffset zoneOffset, C26413c c26413c) {
        this.f98583a = instant;
        this.f98584b = zoneOffset;
        this.f98585c = c26413c;
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98585c;
    }

    @Override // p322m7.InterfaceC25140e0
    /* JADX INFO: renamed from: d */
    public final ZoneOffset mo73695d() {
        return this.f98584b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25143f0)) {
            return false;
        }
        C25143f0 c25143f0 = (C25143f0) obj;
        return AbstractC22676k.m65745e(this.f98583a, c25143f0.f98583a) && AbstractC22676k.m65745e(this.f98584b, c25143f0.f98584b) && AbstractC22676k.m65745e(this.f98585c, c25143f0.f98585c);
    }

    @Override // p322m7.InterfaceC25140e0
    public final Instant getTime() {
        return this.f98583a;
    }

    public final int hashCode() {
        int iHashCode = this.f98583a.hashCode() * 31;
        ZoneOffset zoneOffset = this.f98584b;
        return this.f98585c.hashCode() + ((iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }
}
