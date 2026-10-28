package a30;

import java.util.List;
import p031b9.AbstractC2875y;
import p537ux.C35338j;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.EnumC29806a;

/* JADX INFO: renamed from: a30.l1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C0308l1 {

    /* JADX INFO: renamed from: a */
    public final EnumC29806a f1062a;

    /* JADX INFO: renamed from: b */
    public final boolean f1063b;

    /* JADX INFO: renamed from: c */
    public final C35338j f1064c;

    /* JADX INFO: renamed from: d */
    public final List f1065d;

    public C0308l1(EnumC29806a enumC29806a, boolean z4, C35338j c35338j, List list) {
        this.f1062a = enumC29806a;
        this.f1063b = z4;
        this.f1064c = c35338j;
        this.f1065d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0308l1)) {
            return false;
        }
        C0308l1 c0308l1 = (C0308l1) obj;
        return this.f1062a == c0308l1.f1062a && this.f1063b == c0308l1.f1063b && AbstractC22676k.m65745e(this.f1064c, c0308l1.f1064c) && AbstractC22676k.m65745e(this.f1065d, c0308l1.f1065d);
    }

    public final int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(this.f1062a.hashCode() * 31, 31, this.f1063b);
        C35338j c35338j = this.f1064c;
        return this.f1065d.hashCode() + ((iM8289b + (c35338j == null ? 0 : c35338j.hashCode())) * 31);
    }

    public final String toString() {
        return "GooglePay(buttonType=" + this.f1062a + ", allowCreditCards=" + this.f1063b + ", billingAddressParameters=" + this.f1064c + ", additionalEnabledNetworks=" + this.f1065d + ")";
    }
}
