package b30;

import g40.InterfaceC15367i1;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;
import q20.C29810c;
import s20.C32077a;
import t20.C33333n;

/* JADX INFO: renamed from: b30.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2482b {

    /* JADX INFO: renamed from: a */
    public final String f9663a;

    /* JADX INFO: renamed from: b */
    public final List f9664b;

    /* JADX INFO: renamed from: c */
    public final C32077a f9665c;

    /* JADX INFO: renamed from: d */
    public final List f9666d;

    /* JADX INFO: renamed from: e */
    public final AbstractC29840y f9667e;

    /* JADX INFO: renamed from: f */
    public final boolean f9668f;

    /* JADX INFO: renamed from: g */
    public final boolean f9669g;

    /* JADX INFO: renamed from: h */
    public final C29810c f9670h;

    /* JADX INFO: renamed from: i */
    public final C33333n f9671i;

    /* JADX INFO: renamed from: j */
    public final List f9672j;

    public C2482b(String selectedPaymentMethodCode, List list, C32077a arguments, List formElements, AbstractC29840y abstractC29840y, boolean z4, boolean z13, C29810c c29810c, C33333n usBankAccountFormArguments) {
        AbstractC22676k.m65750j(selectedPaymentMethodCode, "selectedPaymentMethodCode");
        AbstractC22676k.m65750j(arguments, "arguments");
        AbstractC22676k.m65750j(formElements, "formElements");
        AbstractC22676k.m65750j(usBankAccountFormArguments, "usBankAccountFormArguments");
        this.f9663a = selectedPaymentMethodCode;
        this.f9664b = list;
        this.f9665c = arguments;
        this.f9666d = formElements;
        this.f9667e = abstractC29840y;
        this.f9668f = z4;
        this.f9669g = z13;
        this.f9670h = c29810c;
        this.f9671i = usBankAccountFormArguments;
        List list2 = formElements;
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ((InterfaceC15367i1) it.next()).mo43548b(this.f9669g);
        }
        this.f9672j = list2;
    }

    /* JADX INFO: renamed from: a */
    public static C2482b m7453a(C2482b c2482b, String str, C32077a c32077a, List list, AbstractC29840y abstractC29840y, boolean z4, C33333n c33333n, int i13) {
        if ((i13 & 1) != 0) {
            str = c2482b.f9663a;
        }
        String selectedPaymentMethodCode = str;
        List list2 = c2482b.f9664b;
        if ((i13 & 4) != 0) {
            c32077a = c2482b.f9665c;
        }
        C32077a arguments = c32077a;
        List formElements = (i13 & 8) != 0 ? c2482b.f9666d : list;
        AbstractC29840y abstractC29840y2 = (i13 & 16) != 0 ? c2482b.f9667e : abstractC29840y;
        boolean z13 = (i13 & 32) != 0 ? c2482b.f9668f : z4;
        boolean z14 = (i13 & 64) != 0 ? c2482b.f9669g : true;
        C29810c c29810c = c2482b.f9670h;
        C33333n usBankAccountFormArguments = (i13 & 256) != 0 ? c2482b.f9671i : c33333n;
        c2482b.getClass();
        AbstractC22676k.m65750j(selectedPaymentMethodCode, "selectedPaymentMethodCode");
        AbstractC22676k.m65750j(arguments, "arguments");
        AbstractC22676k.m65750j(formElements, "formElements");
        AbstractC22676k.m65750j(usBankAccountFormArguments, "usBankAccountFormArguments");
        return new C2482b(selectedPaymentMethodCode, list2, arguments, formElements, abstractC29840y2, z13, z14, c29810c, usBankAccountFormArguments);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2482b)) {
            return false;
        }
        C2482b c2482b = (C2482b) obj;
        return AbstractC22676k.m65745e(this.f9663a, c2482b.f9663a) && AbstractC22676k.m65745e(this.f9664b, c2482b.f9664b) && AbstractC22676k.m65745e(this.f9665c, c2482b.f9665c) && AbstractC22676k.m65745e(this.f9666d, c2482b.f9666d) && AbstractC22676k.m65745e(this.f9667e, c2482b.f9667e) && this.f9668f == c2482b.f9668f && this.f9669g == c2482b.f9669g && AbstractC22676k.m65745e(this.f9670h, c2482b.f9670h) && AbstractC22676k.m65745e(this.f9671i, c2482b.f9671i);
    }

    public final int hashCode() {
        int iM31983b = AbstractC11895b.m31983b((this.f9665c.hashCode() + AbstractC11895b.m31983b(this.f9663a.hashCode() * 31, 31, this.f9664b)) * 31, 31, this.f9666d);
        AbstractC29840y abstractC29840y = this.f9667e;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM31983b + (abstractC29840y == null ? 0 : abstractC29840y.hashCode())) * 31, 31, this.f9668f), 31, this.f9669g);
        C29810c c29810c = this.f9670h;
        return this.f9671i.hashCode() + ((iM8289b + (c29810c != null ? c29810c.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM94766o = AbstractC30802r.m94766o("State(selectedPaymentMethodCode=", this.f9663a, ", supportedPaymentMethods=", ", arguments=", this.f9664b);
        sbM94766o.append(this.f9665c);
        sbM94766o.append(", formElements=");
        sbM94766o.append(this.f9666d);
        sbM94766o.append(", paymentSelection=");
        sbM94766o.append(this.f9667e);
        sbM94766o.append(", processing=");
        sbM94766o.append(this.f9668f);
        sbM94766o.append(", validating=");
        sbM94766o.append(this.f9669g);
        sbM94766o.append(", incentive=");
        sbM94766o.append(this.f9670h);
        sbM94766o.append(", usBankAccountFormArguments=");
        sbM94766o.append(this.f9671i);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }
}
