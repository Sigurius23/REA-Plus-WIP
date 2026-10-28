package p322m7;

import java.time.Instant;
import java.time.ZoneOffset;
import jh3.AbstractC21702c;
import p336n7.C26413c;
import p452r7.C31003b0;
import p477s2.AbstractC32073e;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m7.i */
/* JADX INFO: loaded from: classes.dex */
public final class C25151i implements InterfaceC25140e0 {

    /* JADX INFO: renamed from: e */
    public static final C31003b0 f98616e = AbstractC22674j.m65701I();

    /* JADX INFO: renamed from: a */
    public final Instant f98617a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98618b;

    /* JADX INFO: renamed from: c */
    public final C31003b0 f98619c;

    /* JADX INFO: renamed from: d */
    public final C26413c f98620d;

    public C25151i(Instant instant, ZoneOffset zoneOffset, C31003b0 c31003b0, C26413c c26413c) {
        this.f98617a = instant;
        this.f98618b = zoneOffset;
        this.f98619c = c31003b0;
        this.f98620d = c26413c;
        AbstractC32073e.m99736b0(c31003b0, c31003b0.m95541c(), "mass");
        AbstractC32073e.m99738c0(c31003b0, f98616e, "mass");
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98620d;
    }

    @Override // p322m7.InterfaceC25140e0
    /* JADX INFO: renamed from: d */
    public final ZoneOffset mo73695d() {
        return this.f98618b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25151i)) {
            return false;
        }
        C25151i c25151i = (C25151i) obj;
        return AbstractC22676k.m65745e(this.f98619c, c25151i.f98619c) && AbstractC22676k.m65745e(this.f98617a, c25151i.f98617a) && AbstractC22676k.m65745e(this.f98618b, c25151i.f98618b) && AbstractC22676k.m65745e(this.f98620d, c25151i.f98620d);
    }

    @Override // p322m7.InterfaceC25140e0
    public final Instant getTime() {
        return this.f98617a;
    }

    public final int hashCode() {
        int iM61131b = AbstractC21702c.m61131b(this.f98617a, this.f98619c.hashCode() * 31, 31);
        ZoneOffset zoneOffset = this.f98618b;
        return this.f98620d.hashCode() + ((iM61131b + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }
}
