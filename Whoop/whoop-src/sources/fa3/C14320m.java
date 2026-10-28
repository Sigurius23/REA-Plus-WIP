package fa3;

import java.util.Collection;
import na3.C26521h;
import na3.EnumC26520g;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fa3.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C14320m {

    /* JADX INFO: renamed from: a */
    public final C26521h f52276a;

    /* JADX INFO: renamed from: b */
    public final Collection f52277b;

    /* JADX INFO: renamed from: c */
    public final boolean f52278c;

    /* JADX INFO: renamed from: d */
    public final boolean f52279d;

    /* JADX INFO: renamed from: e */
    public final boolean f52280e;

    public C14320m(C26521h c26521h, Collection collection, int i13) {
        this(c26521h, collection, c26521h.f105439a == EnumC26520g.f105437y, (i13 & 8) == 0, (i13 & 16) == 0);
    }

    /* JADX INFO: renamed from: a */
    public static C14320m m40926a(C14320m c14320m, C26521h c26521h) {
        Collection qualifierApplicabilityTypes = c14320m.f52277b;
        boolean z4 = c14320m.f52278c;
        boolean z13 = c14320m.f52279d;
        boolean z14 = c14320m.f52280e;
        AbstractC22676k.m65750j(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        return new C14320m(c26521h, qualifierApplicabilityTypes, z4, z13, z14);
    }

    /* JADX INFO: renamed from: b */
    public final C26521h m40927b() {
        return this.f52276a;
    }

    /* JADX INFO: renamed from: c */
    public final Collection m40928c() {
        return this.f52277b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14320m)) {
            return false;
        }
        C14320m c14320m = (C14320m) obj;
        return AbstractC22676k.m65745e(this.f52276a, c14320m.f52276a) && AbstractC22676k.m65745e(this.f52277b, c14320m.f52277b) && this.f52278c == c14320m.f52278c && this.f52279d == c14320m.f52279d && this.f52280e == c14320m.f52280e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f52280e) + AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.f52277b.hashCode() + (this.f52276a.hashCode() * 31)) * 31, 31, this.f52278c), 31, this.f52279d);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb4.append(this.f52276a);
        sb4.append(", qualifierApplicabilityTypes=");
        sb4.append(this.f52277b);
        sb4.append(", definitelyNotNull=");
        sb4.append(this.f52278c);
        sb4.append(", preferQualifierOverBound=");
        sb4.append(this.f52279d);
        sb4.append(", preferQualifierOverSupertype=");
        return AbstractC2875y.m8305r(sb4, this.f52280e, ')');
    }

    public C14320m(C26521h c26521h, Collection qualifierApplicabilityTypes, boolean z4, boolean z13, boolean z14) {
        AbstractC22676k.m65750j(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f52276a = c26521h;
        this.f52277b = qualifierApplicabilityTypes;
        this.f52278c = z4;
        this.f52279d = z13;
        this.f52280e = z14;
    }
}
