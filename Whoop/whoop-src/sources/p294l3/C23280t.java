package p294l3;

import i20.C17990z0;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l3.t */
/* JADX INFO: loaded from: classes.dex */
public final class C23280t extends AbstractC23284v {

    /* JADX INFO: renamed from: a */
    public final String f92241a;

    /* JADX INFO: renamed from: b */
    public final C23279s0 f92242b;

    /* JADX INFO: renamed from: c */
    public final C17990z0 f92243c;

    public C23280t(String str, C23279s0 c23279s0, C17990z0 c17990z0) {
        this.f92241a = str;
        this.f92242b = c23279s0;
        this.f92243c = c17990z0;
    }

    @Override // p294l3.AbstractC23284v
    /* JADX INFO: renamed from: a */
    public final C17990z0 mo67352a() {
        return this.f92243c;
    }

    @Override // p294l3.AbstractC23284v
    /* JADX INFO: renamed from: b */
    public final C23279s0 mo67353b() {
        return this.f92242b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23280t)) {
            return false;
        }
        C23280t c23280t = (C23280t) obj;
        return AbstractC22676k.m65745e(this.f92241a, c23280t.f92241a) && AbstractC22676k.m65745e(this.f92242b, c23280t.f92242b) && AbstractC22676k.m65745e(this.f92243c, c23280t.f92243c);
    }

    public final int hashCode() {
        int iHashCode = this.f92241a.hashCode() * 31;
        C23279s0 c23279s0 = this.f92242b;
        int iHashCode2 = (iHashCode + (c23279s0 != null ? c23279s0.hashCode() : 0)) * 31;
        C17990z0 c17990z0 = this.f92243c;
        return iHashCode2 + (c17990z0 != null ? c17990z0.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f92241a, ')');
    }
}
