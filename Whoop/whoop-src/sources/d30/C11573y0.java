package d30;

import p635y2.InterfaceC39147y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d30.y0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11573y0 implements InterfaceC11575z0 {

    /* JADX INFO: renamed from: a */
    public final String f37350a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC39147y f37351b;

    public C11573y0(String itemCode, InterfaceC39147y coordinates) {
        AbstractC22676k.m65750j(itemCode, "itemCode");
        AbstractC22676k.m65750j(coordinates, "coordinates");
        this.f37350a = itemCode;
        this.f37351b = coordinates;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11573y0)) {
            return false;
        }
        C11573y0 c11573y0 = (C11573y0) obj;
        return AbstractC22676k.m65745e(this.f37350a, c11573y0.f37350a) && AbstractC22676k.m65745e(this.f37351b, c11573y0.f37351b);
    }

    public final int hashCode() {
        return this.f37351b.hashCode() + (this.f37350a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdatePaymentMethodVisibility(itemCode=" + this.f37350a + ", coordinates=" + this.f37351b + ")";
    }
}
