package androidx.compose.foundation;

import p000.AbstractC11266d;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p027b3.C2431r;
import p132f0.C13807n;
import p208i2.AbstractC17911t;
import p208i2.C17919x;
import p208i2.InterfaceC17869a1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/BackgroundElement;", "La3/h1;", "Lf0/n;", "foundation_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class BackgroundElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: E */
    public final C2431r f4475E;

    /* JADX INFO: renamed from: w */
    public final long f4476w;

    /* JADX INFO: renamed from: x */
    public final AbstractC17911t f4477x;

    /* JADX INFO: renamed from: y */
    public final float f4478y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC17869a1 f4479z;

    public BackgroundElement(long j7, AbstractC17911t abstractC17911t, float f13, InterfaceC17869a1 interfaceC17869a1, int i13) {
        C2431r c2431r = C2431r.f9521F;
        j7 = (i13 & 1) != 0 ? C17919x.f69637n : j7;
        abstractC17911t = (i13 & 2) != 0 ? null : abstractC17911t;
        this.f4476w = j7;
        this.f4477x = abstractC17911t;
        this.f4478y = f13;
        this.f4479z = interfaceC17869a1;
        this.f4475E = c2431r;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C13807n c13807n = new C13807n();
        c13807n.f49259O = this.f4476w;
        c13807n.f49260P = this.f4477x;
        c13807n.f49261Q = this.f4478y;
        c13807n.f49262R = this.f4479z;
        c13807n.f49263S = 9205357640488583168L;
        return c13807n;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && C17919x.m51542d(this.f4476w, backgroundElement.f4476w) && AbstractC22676k.m65745e(this.f4477x, backgroundElement.f4477x) && this.f4478y == backgroundElement.f4478y && AbstractC22676k.m65745e(this.f4479z, backgroundElement.f4479z);
    }

    public final int hashCode() {
        int i13 = C17919x.f69638o;
        int iHashCode = Long.hashCode(this.f4476w) * 31;
        AbstractC17911t abstractC17911t = this.f4477x;
        return this.f4479z.hashCode() + AbstractC11266d.m30447a(this.f4478y, (iHashCode + (abstractC17911t != null ? abstractC17911t.hashCode() : 0)) * 31, 31);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        this.f4475E.getClass();
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C13807n c13807n = (C13807n) abstractC2316v;
        c13807n.f49259O = this.f4476w;
        c13807n.f49260P = this.f4477x;
        c13807n.f49261Q = this.f4478y;
        c13807n.f49262R = this.f4479z;
        AbstractC0201g.m508h(c13807n);
    }
}
