package h20;

import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38977v3;
import y00.EnumC38853i;

/* JADX INFO: renamed from: h20.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C16621a {

    /* JADX INFO: renamed from: a */
    public final Integer f63952a;

    /* JADX INFO: renamed from: b */
    public final Integer f63953b;

    /* JADX INFO: renamed from: c */
    public final EnumC38853i f63954c;

    /* JADX INFO: renamed from: d */
    public final C38977v3 f63955d;

    public C16621a(Integer num, Integer num2, EnumC38853i enumC38853i, C38977v3 c38977v3) {
        this.f63952a = num;
        this.f63953b = num2;
        this.f63954c = enumC38853i;
        this.f63955d = c38977v3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16621a)) {
            return false;
        }
        C16621a c16621a = (C16621a) obj;
        return AbstractC22676k.m65745e(this.f63952a, c16621a.f63952a) && AbstractC22676k.m65745e(this.f63953b, c16621a.f63953b) && this.f63954c == c16621a.f63954c && AbstractC22676k.m65745e(this.f63955d, c16621a.f63955d);
    }

    public final int hashCode() {
        Integer num = this.f63952a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f63953b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        EnumC38853i enumC38853i = this.f63954c;
        int iHashCode3 = (iHashCode2 + (enumC38853i == null ? 0 : enumC38853i.hashCode())) * 31;
        C38977v3 c38977v3 = this.f63955d;
        return iHashCode3 + (c38977v3 != null ? c38977v3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM114684l = AbstractC36095b.m114684l("CardUpdateParams(expiryMonth=", this.f63952a, ", expiryYear=", this.f63953b, ", cardBrand=");
        sbM114684l.append(this.f63954c);
        sbM114684l.append(", billingDetails=");
        sbM114684l.append(this.f63955d);
        sbM114684l.append(")");
        return sbM114684l.toString();
    }
}
