package p322m7;

import g40.C15352f4;
import io.sentry.config.AbstractC20301a;
import java.time.Instant;
import java.time.ZoneOffset;
import jh3.AbstractC21702c;
import p336n7.C26413c;
import p452r7.C31022l;
import p452r7.C31036s;
import p477s2.AbstractC32073e;
import p550vd.AbstractC35902e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m7.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C25131b0 implements InterfaceC25140e0 {

    /* JADX INFO: renamed from: e */
    public static final C31036s f98512e = AbstractC20301a.m56304C(3);

    /* JADX INFO: renamed from: a */
    public final Instant f98513a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f98514b;

    /* JADX INFO: renamed from: c */
    public final C31036s f98515c;

    /* JADX INFO: renamed from: d */
    public final C26413c f98516d;

    static {
        C31022l c31022l = C31036s.f128022y;
        AbstractC35902e.m113978q(2, "Height", "height", new C15352f4(27));
        AbstractC35902e.m113978q(3, "Height", "height", new C15352f4(29));
        AbstractC35902e.m113978q(4, "Height", "height", new C15352f4(28));
    }

    public C25131b0(Instant instant, ZoneOffset zoneOffset, C31036s c31036s, C26413c c26413c) {
        this.f98513a = instant;
        this.f98514b = zoneOffset;
        this.f98515c = c31036s;
        this.f98516d = c26413c;
        AbstractC32073e.m99736b0(c31036s, c31036s.m95563b(), "height");
        AbstractC32073e.m99738c0(c31036s, f98512e, "height");
    }

    @Override // p322m7.InterfaceC25170r0
    /* JADX INFO: renamed from: c */
    public final C26413c mo73692c() {
        return this.f98516d;
    }

    @Override // p322m7.InterfaceC25140e0
    /* JADX INFO: renamed from: d */
    public final ZoneOffset mo73695d() {
        return this.f98514b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25131b0)) {
            return false;
        }
        C25131b0 c25131b0 = (C25131b0) obj;
        return AbstractC22676k.m65745e(this.f98515c, c25131b0.f98515c) && AbstractC22676k.m65745e(this.f98513a, c25131b0.f98513a) && AbstractC22676k.m65745e(this.f98514b, c25131b0.f98514b) && AbstractC22676k.m65745e(this.f98516d, c25131b0.f98516d);
    }

    @Override // p322m7.InterfaceC25140e0
    public final Instant getTime() {
        return this.f98513a;
    }

    public final int hashCode() {
        int iM61131b = AbstractC21702c.m61131b(this.f98513a, this.f98515c.hashCode() * 31, 31);
        ZoneOffset zoneOffset = this.f98514b;
        return this.f98516d.hashCode() + ((iM61131b + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }
}
