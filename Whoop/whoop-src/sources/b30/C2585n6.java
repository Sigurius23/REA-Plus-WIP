package b30;

import h20.C16689l1;
import h20.EnumC16648e2;
import h20.EnumC16677j1;
import java.util.List;
import p031b9.AbstractC2875y;
import p499t9.C33623c0;
import p537ux.C35338j;
import p537ux.EnumC35336i;
import p537ux.InterfaceC35322b;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.EnumC29806a;
import v00.C35473j0;
import v00.EnumC35491s0;

/* JADX INFO: renamed from: b30.n6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2585n6 {

    /* JADX INFO: renamed from: a */
    public final EnumC29806a f10056a;

    /* JADX INFO: renamed from: b */
    public final C35338j f10057b;

    /* JADX INFO: renamed from: c */
    public final boolean f10058c;

    /* JADX INFO: renamed from: d */
    public final C35473j0 f10059d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC35322b f10060e;

    /* JADX INFO: renamed from: f */
    public final List f10061f;

    public C2585n6(EnumC16648e2 enumC16648e2, C16689l1 billingDetailsCollectionConfiguration, C35473j0 c35473j0, InterfaceC35322b cardFundingFilter, List list) {
        EnumC35336i enumC35336i;
        AbstractC22676k.m65750j(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        AbstractC22676k.m65750j(cardFundingFilter, "cardFundingFilter");
        EnumC29806a enumC29806aM65693A = AbstractC22674j.m65693A(enumC16648e2);
        EnumC16677j1 enumC16677j1 = billingDetailsCollectionConfiguration.f64192z;
        int iOrdinal = enumC16677j1.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            enumC35336i = EnumC35336i.Min;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            enumC35336i = EnumC35336i.Full;
        }
        C35338j c35338j = new C35338j(enumC16677j1 == EnumC16677j1.f64133y || billingDetailsCollectionConfiguration.m47252i(), enumC35336i, billingDetailsCollectionConfiguration.m47252i());
        this.f10056a = enumC29806aM65693A;
        this.f10057b = c35338j;
        this.f10058c = true;
        this.f10059d = c35473j0;
        this.f10060e = cardFundingFilter;
        this.f10061f = list;
        C33623c0 c33623c0 = EnumC35491s0.f151075x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2585n6)) {
            return false;
        }
        C2585n6 c2585n6 = (C2585n6) obj;
        return this.f10056a == c2585n6.f10056a && AbstractC22676k.m65745e(this.f10057b, c2585n6.f10057b) && this.f10058c == c2585n6.f10058c && AbstractC22676k.m65745e(this.f10059d, c2585n6.f10059d) && AbstractC22676k.m65745e(this.f10060e, c2585n6.f10060e) && AbstractC22676k.m65745e(this.f10061f, c2585n6.f10061f);
    }

    public final int hashCode() {
        return this.f10061f.hashCode() + ((this.f10060e.hashCode() + ((this.f10059d.f151014w.hashCode() + AbstractC2875y.m8289b((this.f10057b.hashCode() + (this.f10056a.hashCode() * 31)) * 31, 31, this.f10058c)) * 31)) * 31);
    }

    public final String toString() {
        return "GooglePay(googlePayButtonType=" + this.f10056a + ", billingAddressParameters=" + this.f10057b + ", allowCreditCards=" + this.f10058c + ", cardBrandFilter=" + this.f10059d + ", cardFundingFilter=" + this.f10060e + ", additionalEnabledNetworks=" + this.f10061f + ")";
    }
}
