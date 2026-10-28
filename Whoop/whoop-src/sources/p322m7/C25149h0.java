package p322m7;

import java.time.Instant;
import java.time.ZoneOffset;
import jh3.AbstractC21702c;
import p336n7.C26413c;
import p452r7.C31003b0;
import p477s2.AbstractC32073e;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m7.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C25149h0 implements InterfaceC25140e0 {

    /* JADX INFO: renamed from: e */
    public static final C31003b0 f98605e = AbstractC22674j.m65701I();

    /* JADX INFO: renamed from: a */
    public final Instant f98606a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98607b;

    /* JADX INFO: renamed from: c */
    public final C31003b0 f98608c;

    /* JADX INFO: renamed from: d */
    public final C26413c f98609d;

    public C25149h0(Instant instant, ZoneOffset zoneOffset, C31003b0 c31003b0, C26413c metadata) {
        AbstractC22676k.m65750j(metadata, "metadata");
        this.f98606a = instant;
        this.f98607b = zoneOffset;
        this.f98608c = c31003b0;
        this.f98609d = metadata;
        AbstractC32073e.m99736b0(c31003b0, c31003b0.m95541c(), "mass");
        AbstractC32073e.m99738c0(c31003b0, f98605e, "mass");
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98609d;
    }

    @Override // p322m7.InterfaceC25140e0
    /* JADX INFO: renamed from: d */
    public final ZoneOffset mo73695d() {
        return this.f98607b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25149h0)) {
            return false;
        }
        C25149h0 c25149h0 = (C25149h0) obj;
        return AbstractC22676k.m65745e(this.f98608c, c25149h0.f98608c) && AbstractC22676k.m65745e(this.f98606a, c25149h0.f98606a) && AbstractC22676k.m65745e(this.f98607b, c25149h0.f98607b) && AbstractC22676k.m65745e(this.f98609d, c25149h0.f98609d);
    }

    @Override // p322m7.InterfaceC25140e0
    public final Instant getTime() {
        return this.f98606a;
    }

    public final int hashCode() {
        int iM61131b = AbstractC21702c.m61131b(this.f98606a, this.f98608c.hashCode() * 31, 31);
        ZoneOffset zoneOffset = this.f98607b;
        return this.f98609d.hashCode() + ((iM61131b + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }
}
