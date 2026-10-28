package p292l1;

import p490t0.AbstractC33244a;
import p490t0.C33252i;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l1.p3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23154p3 {

    /* JADX INFO: renamed from: a */
    public final AbstractC33244a f91572a;

    /* JADX INFO: renamed from: b */
    public final AbstractC33244a f91573b;

    /* JADX INFO: renamed from: c */
    public final AbstractC33244a f91574c;

    /* JADX INFO: renamed from: d */
    public final AbstractC33244a f91575d;

    /* JADX INFO: renamed from: e */
    public final AbstractC33244a f91576e;

    /* JADX INFO: renamed from: f */
    public final AbstractC33244a f91577f;

    /* JADX INFO: renamed from: g */
    public final AbstractC33244a f91578g;

    /* JADX INFO: renamed from: h */
    public final AbstractC33244a f91579h;

    public C23154p3() {
        C33252i c33252i = AbstractC23148o3.f91546a;
        C33252i c33252i2 = AbstractC23148o3.f91547b;
        C33252i c33252i3 = AbstractC23148o3.f91548c;
        C33252i c33252i4 = AbstractC23148o3.f91549d;
        C33252i c33252i5 = AbstractC23148o3.f91551f;
        C33252i c33252i6 = AbstractC23148o3.f91550e;
        C33252i c33252i7 = AbstractC23148o3.f91552g;
        C33252i c33252i8 = AbstractC23148o3.f91553h;
        this.f91572a = c33252i;
        this.f91573b = c33252i2;
        this.f91574c = c33252i3;
        this.f91575d = c33252i4;
        this.f91576e = c33252i5;
        this.f91577f = c33252i6;
        this.f91578g = c33252i7;
        this.f91579h = c33252i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23154p3)) {
            return false;
        }
        C23154p3 c23154p3 = (C23154p3) obj;
        return AbstractC22676k.m65745e(this.f91572a, c23154p3.f91572a) && AbstractC22676k.m65745e(this.f91573b, c23154p3.f91573b) && AbstractC22676k.m65745e(this.f91574c, c23154p3.f91574c) && AbstractC22676k.m65745e(this.f91575d, c23154p3.f91575d) && AbstractC22676k.m65745e(this.f91576e, c23154p3.f91576e) && AbstractC22676k.m65745e(this.f91577f, c23154p3.f91577f) && AbstractC22676k.m65745e(this.f91578g, c23154p3.f91578g) && AbstractC22676k.m65745e(this.f91579h, c23154p3.f91579h);
    }

    public final int hashCode() {
        return this.f91579h.hashCode() + ((this.f91578g.hashCode() + ((this.f91577f.hashCode() + ((this.f91576e.hashCode() + ((this.f91575d.hashCode() + ((this.f91574c.hashCode() + ((this.f91573b.hashCode() + (this.f91572a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f91572a + ", small=" + this.f91573b + ", medium=" + this.f91574c + ", large=" + this.f91575d + ", largeIncreased=" + this.f91577f + ", extraLarge=" + this.f91576e + ", extralargeIncreased=" + this.f91578g + ", extraExtraLarge=" + this.f91579h + ')';
    }
}
