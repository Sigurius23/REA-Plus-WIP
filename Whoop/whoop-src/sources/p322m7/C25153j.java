package p322m7;

import java.time.Instant;
import java.time.ZoneOffset;
import jh3.AbstractC21702c;
import p336n7.C26413c;
import p452r7.C31003b0;
import p477s2.AbstractC32073e;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m7.j */
/* JADX INFO: loaded from: classes.dex */
public final class C25153j implements InterfaceC25140e0 {

    /* JADX INFO: renamed from: e */
    public static final C31003b0 f98623e = AbstractC22674j.m65701I();

    /* JADX INFO: renamed from: a */
    public final Instant f98624a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98625b;

    /* JADX INFO: renamed from: c */
    public final C31003b0 f98626c;

    /* JADX INFO: renamed from: d */
    public final C26413c f98627d;

    public C25153j(Instant instant, ZoneOffset zoneOffset, C31003b0 c31003b0, C26413c c26413c) {
        this.f98624a = instant;
        this.f98625b = zoneOffset;
        this.f98626c = c31003b0;
        this.f98627d = c26413c;
        AbstractC32073e.m99736b0(c31003b0, c31003b0.m95541c(), "mass");
        AbstractC32073e.m99738c0(c31003b0, f98623e, "mass");
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98627d;
    }

    @Override // p322m7.InterfaceC25140e0
    /* JADX INFO: renamed from: d */
    public final ZoneOffset mo73695d() {
        return this.f98625b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25153j)) {
            return false;
        }
        C25153j c25153j = (C25153j) obj;
        return AbstractC22676k.m65745e(this.f98626c, c25153j.f98626c) && AbstractC22676k.m65745e(this.f98624a, c25153j.f98624a) && AbstractC22676k.m65745e(this.f98625b, c25153j.f98625b) && AbstractC22676k.m65745e(this.f98627d, c25153j.f98627d);
    }

    @Override // p322m7.InterfaceC25140e0
    public final Instant getTime() {
        return this.f98624a;
    }

    public final int hashCode() {
        int iM61131b = AbstractC21702c.m61131b(this.f98624a, this.f98626c.hashCode() * 31, 31);
        ZoneOffset zoneOffset = this.f98625b;
        return this.f98627d.hashCode() + ((iM61131b + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }
}
