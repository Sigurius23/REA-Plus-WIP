package p322m7;

import java.time.Instant;
import java.time.ZoneOffset;
import jh3.AbstractC21702c;
import p336n7.C26413c;
import p452r7.C31005c0;
import p477s2.AbstractC32073e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m7.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C25164o0 implements InterfaceC25140e0 {

    /* JADX INFO: renamed from: a */
    public final Instant f98734a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98735b;

    /* JADX INFO: renamed from: c */
    public final C31005c0 f98736c;

    /* JADX INFO: renamed from: d */
    public final C26413c f98737d;

    public C25164o0(Instant instant, ZoneOffset zoneOffset, C31005c0 c31005c0, C26413c c26413c) {
        this.f98734a = instant;
        this.f98735b = zoneOffset;
        this.f98736c = c31005c0;
        this.f98737d = c26413c;
        AbstractC32073e.m99732Z(c31005c0.m95542a(), "percentage");
        AbstractC32073e.m99738c0(Double.valueOf(c31005c0.m95542a()), Double.valueOf(100.0d), "percentage");
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98737d;
    }

    @Override // p322m7.InterfaceC25140e0
    /* JADX INFO: renamed from: d */
    public final ZoneOffset mo73695d() {
        return this.f98735b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25164o0)) {
            return false;
        }
        C25164o0 c25164o0 = (C25164o0) obj;
        return AbstractC22676k.m65745e(this.f98736c, c25164o0.f98736c) && AbstractC22676k.m65745e(this.f98734a, c25164o0.f98734a) && AbstractC22676k.m65745e(this.f98735b, c25164o0.f98735b) && AbstractC22676k.m65745e(this.f98737d, c25164o0.f98737d);
    }

    @Override // p322m7.InterfaceC25140e0
    public final Instant getTime() {
        return this.f98734a;
    }

    public final int hashCode() {
        int iM61131b = AbstractC21702c.m61131b(this.f98734a, this.f98736c.hashCode() * 31, 31);
        ZoneOffset zoneOffset = this.f98735b;
        return this.f98737d.hashCode() + ((iM61131b + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }
}
