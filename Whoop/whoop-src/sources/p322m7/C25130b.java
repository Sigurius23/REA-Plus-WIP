package p322m7;

import java.time.Instant;
import java.time.ZoneOffset;
import jh3.AbstractC21702c;
import p336n7.C26413c;
import p452r7.C31021k0;
import p477s2.AbstractC32073e;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32416g;

/* JADX INFO: renamed from: m7.b */
/* JADX INFO: loaded from: classes.dex */
public final class C25130b implements InterfaceC25140e0 {

    /* JADX INFO: renamed from: f */
    public static final C31021k0 f98505f = AbstractC32416g.m101168y(0);

    /* JADX INFO: renamed from: g */
    public static final C31021k0 f98506g = AbstractC32416g.m101168y(100);

    /* JADX INFO: renamed from: a */
    public final Instant f98507a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98508b;

    /* JADX INFO: renamed from: c */
    public final C31021k0 f98509c;

    /* JADX INFO: renamed from: d */
    public final int f98510d;

    /* JADX INFO: renamed from: e */
    public final C26413c f98511e;

    public C25130b(Instant instant, ZoneOffset zoneOffset, C31021k0 c31021k0, int i13, C26413c c26413c) {
        this.f98507a = instant;
        this.f98508b = zoneOffset;
        this.f98509c = c31021k0;
        this.f98510d = i13;
        this.f98511e = c26413c;
        AbstractC32073e.m99736b0(c31021k0, f98505f, "temperature");
        AbstractC32073e.m99738c0(c31021k0, f98506g, "temperature");
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98511e;
    }

    @Override // p322m7.InterfaceC25140e0
    /* JADX INFO: renamed from: d */
    public final ZoneOffset mo73695d() {
        return this.f98508b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25130b)) {
            return false;
        }
        C25130b c25130b = (C25130b) obj;
        return AbstractC22676k.m65745e(this.f98509c, c25130b.f98509c) && this.f98510d == c25130b.f98510d && AbstractC22676k.m65745e(this.f98507a, c25130b.f98507a) && AbstractC22676k.m65745e(this.f98508b, c25130b.f98508b) && AbstractC22676k.m65745e(this.f98511e, c25130b.f98511e);
    }

    @Override // p322m7.InterfaceC25140e0
    public final Instant getTime() {
        return this.f98507a;
    }

    public final int hashCode() {
        int iM61131b = AbstractC21702c.m61131b(this.f98507a, ((this.f98509c.hashCode() * 31) + this.f98510d) * 31, 31);
        ZoneOffset zoneOffset = this.f98508b;
        return this.f98511e.hashCode() + ((iM61131b + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }
}
