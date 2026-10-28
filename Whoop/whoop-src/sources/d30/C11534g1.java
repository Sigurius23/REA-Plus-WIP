package d30;

import g40.InterfaceC15367i1;
import java.util.Iterator;
import java.util.List;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import s20.C32077a;
import t00.C33254a;
import t20.C33333n;

/* JADX INFO: renamed from: d30.g1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11534g1 {

    /* JADX INFO: renamed from: a */
    public final String f37176a;

    /* JADX INFO: renamed from: b */
    public final boolean f37177b;

    /* JADX INFO: renamed from: c */
    public final boolean f37178c;

    /* JADX INFO: renamed from: d */
    public final C33333n f37179d;

    /* JADX INFO: renamed from: e */
    public final C32077a f37180e;

    /* JADX INFO: renamed from: f */
    public final List f37181f;

    /* JADX INFO: renamed from: g */
    public final C33254a f37182g;

    /* JADX INFO: renamed from: h */
    public final List f37183h;

    public C11534g1(String selectedPaymentMethodCode, boolean z4, boolean z13, C33333n c33333n, C32077a c32077a, List list, C33254a c33254a) {
        AbstractC22676k.m65750j(selectedPaymentMethodCode, "selectedPaymentMethodCode");
        this.f37176a = selectedPaymentMethodCode;
        this.f37177b = z4;
        this.f37178c = z13;
        this.f37179d = c33333n;
        this.f37180e = c32077a;
        this.f37181f = list;
        this.f37182g = c33254a;
        List list2 = list;
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ((InterfaceC15367i1) it.next()).mo43548b(this.f37178c);
        }
        this.f37183h = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11534g1)) {
            return false;
        }
        C11534g1 c11534g1 = (C11534g1) obj;
        return AbstractC22676k.m65745e(this.f37176a, c11534g1.f37176a) && this.f37177b == c11534g1.f37177b && this.f37178c == c11534g1.f37178c && AbstractC22676k.m65745e(this.f37179d, c11534g1.f37179d) && AbstractC22676k.m65745e(this.f37180e, c11534g1.f37180e) && AbstractC22676k.m65745e(this.f37181f, c11534g1.f37181f) && AbstractC22676k.m65745e(this.f37182g, c11534g1.f37182g);
    }

    public final int hashCode() {
        int iM31983b = AbstractC11895b.m31983b((this.f37180e.hashCode() + ((this.f37179d.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.f37176a.hashCode() * 31, 31, this.f37177b), 31, this.f37178c)) * 31)) * 31, 31, this.f37181f);
        C33254a c33254a = this.f37182g;
        return iM31983b + (c33254a == null ? 0 : c33254a.hashCode());
    }

    public final String toString() {
        StringBuilder sbM73379l = AbstractC25012a.m73379l("State(selectedPaymentMethodCode=", this.f37176a, ", isProcessing=", ", isValidating=", this.f37177b);
        sbM73379l.append(this.f37178c);
        sbM73379l.append(", usBankAccountFormArguments=");
        sbM73379l.append(this.f37179d);
        sbM73379l.append(", formArguments=");
        sbM73379l.append(this.f37180e);
        sbM73379l.append(", formElements=");
        sbM73379l.append(this.f37181f);
        sbM73379l.append(", headerInformation=");
        sbM73379l.append(this.f37182g);
        sbM73379l.append(")");
        return sbM73379l.toString();
    }
}
