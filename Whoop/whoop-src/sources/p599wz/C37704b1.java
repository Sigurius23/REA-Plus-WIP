package p599wz;

import p114eb.AbstractC12958g1;
import p114eb.C12940a1;
import p114eb.C12953f;
import p114eb.C12968k;
import p114eb.C12974m;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: wz.b1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37704b1 extends AbstractC37713e1 {

    /* JADX INFO: renamed from: d */
    public static final C37704b1 f161562d;

    static {
        C12974m c12974m = new C12974m();
        C12940a1 c12940a1 = AbstractC12958g1.f44770o;
        c12974m.m36462b(c12940a1);
        C12953f c12953f = new C12953f("payment_details", c12974m.f44811a.m36452a());
        C12974m c12974m2 = new C12974m();
        c12974m2.m36462b(AbstractC12958g1.f44767l);
        c12974m2.m36461a(Boolean.FALSE);
        C12953f c12953f2 = new C12953f("is_billing_update_flow", c12974m2.f44811a.m36452a());
        C12974m c12974m3 = new C12974m();
        c12974m3.m36462b(c12940a1);
        C12968k c12968k = c12974m3.f44811a;
        c12968k.f44789a = true;
        c12974m3.m36461a(null);
        f161562d = new C37704b1("updateCard", AbstractC37056f.m118959K(c12953f, c12953f2, new C12953f("billing_update_cvc", c12968k.m36452a())));
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C37704b1);
    }

    public final int hashCode() {
        return 1842590304;
    }

    public final String toString() {
        return "UpdateCard";
    }
}
