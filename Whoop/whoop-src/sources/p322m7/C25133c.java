package p322m7;

import g40.C15352f4;
import java.time.Instant;
import java.time.ZoneOffset;
import jh3.AbstractC21702c;
import p336n7.C26413c;
import p452r7.C31008e;
import p452r7.C31015h0;
import p452r7.C31020k;
import p477s2.AbstractC32073e;
import p550vd.AbstractC35902e;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32410a;

/* JADX INFO: renamed from: m7.c */
/* JADX INFO: loaded from: classes.dex */
public final class C25133c implements InterfaceC25140e0 {

    /* JADX INFO: renamed from: e */
    public static final C31015h0 f98519e = AbstractC32410a.m101004M();

    /* JADX INFO: renamed from: a */
    public final Instant f98520a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98521b;

    /* JADX INFO: renamed from: c */
    public final C31015h0 f98522c;

    /* JADX INFO: renamed from: d */
    public final C26413c f98523d;

    static {
        C31008e c31008e = C31020k.f128009y;
        AbstractC35902e.m113978q(5, "BasalCaloriesBurned", "energy", new C15352f4(18));
    }

    public C25133c(Instant instant, ZoneOffset zoneOffset, C31015h0 c31015h0, C26413c c26413c) {
        this.f98520a = instant;
        this.f98521b = zoneOffset;
        this.f98522c = c31015h0;
        this.f98523d = c26413c;
        AbstractC32073e.m99736b0(c31015h0, c31015h0.m95552b(), "bmr");
        AbstractC32073e.m99738c0(c31015h0, f98519e, "bmr");
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98523d;
    }

    @Override // p322m7.InterfaceC25140e0
    /* JADX INFO: renamed from: d */
    public final ZoneOffset mo73695d() {
        return this.f98521b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25133c)) {
            return false;
        }
        C25133c c25133c = (C25133c) obj;
        return AbstractC22676k.m65745e(this.f98522c, c25133c.f98522c) && AbstractC22676k.m65745e(this.f98520a, c25133c.f98520a) && AbstractC22676k.m65745e(this.f98521b, c25133c.f98521b) && AbstractC22676k.m65745e(this.f98523d, c25133c.f98523d);
    }

    @Override // p322m7.InterfaceC25140e0
    public final Instant getTime() {
        return this.f98520a;
    }

    public final int hashCode() {
        int iM61131b = AbstractC21702c.m61131b(this.f98520a, this.f98522c.hashCode() * 31, 31);
        ZoneOffset zoneOffset = this.f98521b;
        return this.f98523d.hashCode() + ((iM61131b + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }
}
