package p322m7;

import java.time.Instant;
import java.time.ZoneOffset;
import jh3.AbstractC21702c;
import p336n7.C26413c;
import p477s2.AbstractC32073e;
import p550vd.AbstractC35902e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m7.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C25174t0 implements InterfaceC25140e0 {

    /* JADX INFO: renamed from: a */
    public final Instant f98762a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98763b;

    /* JADX INFO: renamed from: c */
    public final long f98764c;

    /* JADX INFO: renamed from: d */
    public final C26413c f98765d;

    static {
        AbstractC35902e.m113942M(2, "RestingHeartRate", "bpm");
        AbstractC35902e.m113942M(3, "RestingHeartRate", "bpm");
        AbstractC35902e.m113942M(4, "RestingHeartRate", "bpm");
    }

    public C25174t0(Instant instant, ZoneOffset zoneOffset, long j7, C26413c c26413c) {
        this.f98762a = instant;
        this.f98763b = zoneOffset;
        this.f98764c = j7;
        this.f98765d = c26413c;
        AbstractC32073e.m99734a0(j7, "beatsPerMinute");
        AbstractC32073e.m99738c0(Long.valueOf(j7), 300L, "beatsPerMinute");
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98765d;
    }

    @Override // p322m7.InterfaceC25140e0
    /* JADX INFO: renamed from: d */
    public final ZoneOffset mo73695d() {
        return this.f98763b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25174t0)) {
            return false;
        }
        C25174t0 c25174t0 = (C25174t0) obj;
        return this.f98764c == c25174t0.f98764c && AbstractC22676k.m65745e(this.f98762a, c25174t0.f98762a) && AbstractC22676k.m65745e(this.f98763b, c25174t0.f98763b) && AbstractC22676k.m65745e(this.f98765d, c25174t0.f98765d);
    }

    @Override // p322m7.InterfaceC25140e0
    public final Instant getTime() {
        return this.f98762a;
    }

    public final int hashCode() {
        int iM61131b = AbstractC21702c.m61131b(this.f98762a, Long.hashCode(this.f98764c) * 31, 31);
        ZoneOffset zoneOffset = this.f98763b;
        return this.f98765d.hashCode() + ((iM61131b + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }
}
