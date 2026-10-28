package na3;

import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: na3.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C26521h {

    /* JADX INFO: renamed from: a */
    public final EnumC26520g f105439a;

    /* JADX INFO: renamed from: b */
    public final boolean f105440b;

    public C26521h(EnumC26520g enumC26520g) {
        this.f105439a = enumC26520g;
        this.f105440b = false;
    }

    /* JADX INFO: renamed from: a */
    public static C26521h m78595a(C26521h c26521h, EnumC26520g qualifier, boolean z4, int i13) {
        if ((i13 & 1) != 0) {
            qualifier = c26521h.f105439a;
        }
        if ((i13 & 2) != 0) {
            z4 = c26521h.f105440b;
        }
        c26521h.getClass();
        AbstractC22676k.m65750j(qualifier, "qualifier");
        return new C26521h(qualifier, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26521h)) {
            return false;
        }
        C26521h c26521h = (C26521h) obj;
        return this.f105439a == c26521h.f105439a && this.f105440b == c26521h.f105440b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f105440b) + (this.f105439a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("NullabilityQualifierWithMigrationStatus(qualifier=");
        sb4.append(this.f105439a);
        sb4.append(", isForWarningOnly=");
        return AbstractC2875y.m8305r(sb4, this.f105440b, ')');
    }

    public C26521h(EnumC26520g enumC26520g, boolean z4) {
        this.f105439a = enumC26520g;
        this.f105440b = z4;
    }
}
