package p322m7;

import java.time.Instant;
import java.time.ZoneOffset;
import jh3.AbstractC21702c;
import p336n7.C26413c;
import p452r7.C31021k0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m7.h */
/* JADX INFO: loaded from: classes.dex */
public final class C25148h implements InterfaceC25140e0 {

    /* JADX INFO: renamed from: a */
    public final Instant f98600a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98601b;

    /* JADX INFO: renamed from: c */
    public final C31021k0 f98602c;

    /* JADX INFO: renamed from: d */
    public final int f98603d;

    /* JADX INFO: renamed from: e */
    public final C26413c f98604e;

    public C25148h(Instant instant, ZoneOffset zoneOffset, C31021k0 c31021k0, int i13, C26413c c26413c) {
        this.f98600a = instant;
        this.f98601b = zoneOffset;
        this.f98602c = c31021k0;
        this.f98603d = i13;
        this.f98604e = c26413c;
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98604e;
    }

    @Override // p322m7.InterfaceC25140e0
    /* JADX INFO: renamed from: d */
    public final ZoneOffset mo73695d() {
        return this.f98601b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25148h)) {
            return false;
        }
        C25148h c25148h = (C25148h) obj;
        return AbstractC22676k.m65745e(this.f98602c, c25148h.f98602c) && this.f98603d == c25148h.f98603d && AbstractC22676k.m65745e(this.f98600a, c25148h.f98600a) && AbstractC22676k.m65745e(this.f98601b, c25148h.f98601b) && AbstractC22676k.m65745e(this.f98604e, c25148h.f98604e);
    }

    @Override // p322m7.InterfaceC25140e0
    public final Instant getTime() {
        return this.f98600a;
    }

    public final int hashCode() {
        int iM61131b = AbstractC21702c.m61131b(this.f98600a, ((this.f98602c.hashCode() * 31) + this.f98603d) * 31, 31);
        ZoneOffset zoneOffset = this.f98601b;
        return this.f98604e.hashCode() + ((iM61131b + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }
}
