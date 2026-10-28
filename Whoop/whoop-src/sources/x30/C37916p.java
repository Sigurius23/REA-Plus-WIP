package x30;

import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.EnumC38853i;

/* JADX INFO: renamed from: x30.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C37916p implements InterfaceC37922r {

    /* JADX INFO: renamed from: a */
    public final List f162340a;

    /* JADX INFO: renamed from: b */
    public final EnumC38853i f162341b;

    public C37916p(List preferredBrands, EnumC38853i enumC38853i) {
        AbstractC22676k.m65750j(preferredBrands, "preferredBrands");
        this.f162340a = preferredBrands;
        this.f162341b = enumC38853i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37916p)) {
            return false;
        }
        C37916p c37916p = (C37916p) obj;
        return AbstractC22676k.m65745e(this.f162340a, c37916p.f162340a) && this.f162341b == c37916p.f162341b;
    }

    public final int hashCode() {
        int iHashCode = this.f162340a.hashCode() * 31;
        EnumC38853i enumC38853i = this.f162341b;
        return iHashCode + (enumC38853i == null ? 0 : enumC38853i.hashCode());
    }

    public final String toString() {
        return "Eligible(preferredBrands=" + this.f162340a + ", initialBrand=" + this.f162341b + ")";
    }
}
