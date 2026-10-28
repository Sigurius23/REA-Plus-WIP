package lb3;

import ka3.C22309a;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31165x0;

/* JADX INFO: renamed from: lb3.t0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C23802t0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC31165x0 f94193a;

    /* JADX INFO: renamed from: b */
    public final C22309a f94194b;

    public C23802t0(InterfaceC31165x0 typeParameter, C22309a typeAttr) {
        AbstractC22676k.m65750j(typeParameter, "typeParameter");
        AbstractC22676k.m65750j(typeAttr, "typeAttr");
        this.f94193a = typeParameter;
        this.f94194b = typeAttr;
    }

    /* JADX INFO: renamed from: a */
    public final C22309a m69909a() {
        return this.f94194b;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC31165x0 m69910b() {
        return this.f94193a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23802t0)) {
            return false;
        }
        C23802t0 c23802t0 = (C23802t0) obj;
        return AbstractC22676k.m65745e(c23802t0.f94193a, this.f94193a) && AbstractC22676k.m65745e(c23802t0.f94194b, this.f94194b);
    }

    public final int hashCode() {
        int iHashCode = this.f94193a.hashCode();
        return this.f94194b.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.f94193a + ", typeAttr=" + this.f94194b + ')';
    }
}
