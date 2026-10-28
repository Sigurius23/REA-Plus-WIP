package b30;

import java.util.Set;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38977v3;
import y00.EnumC38853i;

/* JADX INFO: renamed from: b30.i1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2540i1 {

    /* JADX INFO: renamed from: a */
    public final String f9857a;

    /* JADX INFO: renamed from: b */
    public final Integer f9858b;

    /* JADX INFO: renamed from: c */
    public final Integer f9859c;

    /* JADX INFO: renamed from: d */
    public final EnumC38853i f9860d;

    /* JADX INFO: renamed from: e */
    public final String f9861e;

    /* JADX INFO: renamed from: f */
    public final Set f9862f;

    /* JADX INFO: renamed from: g */
    public final C38977v3 f9863g;

    public C2540i1(String str, Integer num, Integer num2, EnumC38853i brand, String str2, Set set, C38977v3 c38977v3) {
        AbstractC22676k.m65750j(brand, "brand");
        this.f9857a = str;
        this.f9858b = num;
        this.f9859c = num2;
        this.f9860d = brand;
        this.f9861e = str2;
        this.f9862f = set;
        this.f9863g = c38977v3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2540i1)) {
            return false;
        }
        C2540i1 c2540i1 = (C2540i1) obj;
        return AbstractC22676k.m65745e(this.f9857a, c2540i1.f9857a) && AbstractC22676k.m65745e(this.f9858b, c2540i1.f9858b) && AbstractC22676k.m65745e(this.f9859c, c2540i1.f9859c) && this.f9860d == c2540i1.f9860d && AbstractC22676k.m65745e(this.f9861e, c2540i1.f9861e) && AbstractC22676k.m65745e(this.f9862f, c2540i1.f9862f) && AbstractC22676k.m65745e(this.f9863g, c2540i1.f9863g);
    }

    public final int hashCode() {
        String str = this.f9857a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f9858b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f9859c;
        int iHashCode3 = (this.f9860d.hashCode() + ((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31)) * 31;
        String str2 = this.f9861e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Set set = this.f9862f;
        int iHashCode5 = (iHashCode4 + (set == null ? 0 : set.hashCode())) * 31;
        C38977v3 c38977v3 = this.f9863g;
        return iHashCode5 + (c38977v3 != null ? c38977v3.hashCode() : 0);
    }

    public final String toString() {
        return "EditCardPayload(last4=" + this.f9857a + ", expiryMonth=" + this.f9858b + ", expiryYear=" + this.f9859c + ", brand=" + this.f9860d + ", displayBrand=" + this.f9861e + ", networks=" + this.f9862f + ", billingDetails=" + this.f9863g + ")";
    }
}
