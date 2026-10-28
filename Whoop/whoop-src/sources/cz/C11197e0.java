package cz;

import java.util.Collection;
import java.util.List;
import my.EnumC26028b;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;
import w30.C36784a;
import w30.C36785b;
import w30.InterfaceC36786c;
import y00.C38915o4;
import y00.C38995x3;
import y00.C39013z3;

/* JADX INFO: renamed from: cz.e0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11197e0 {

    /* JADX INFO: renamed from: a */
    public final List f35910a;

    /* JADX INFO: renamed from: b */
    public final AbstractC29840y f35911b;

    /* JADX INFO: renamed from: c */
    public final C11188a f35912c;

    /* JADX INFO: renamed from: d */
    public final C11190b f35913d;

    /* JADX INFO: renamed from: e */
    public final boolean f35914e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC36786c f35915f;

    /* JADX INFO: renamed from: g */
    public final boolean f35916g;

    /* JADX INFO: renamed from: h */
    public final boolean f35917h;

    public C11197e0(List list, AbstractC29840y abstractC29840y, C11188a c11188a, C11190b configuration) {
        C38995x3 c38995x3;
        AbstractC22676k.m65750j(configuration, "configuration");
        this.f35910a = list;
        this.f35911b = abstractC29840y;
        this.f35912c = c11188a;
        this.f35913d = configuration;
        int size = list.size();
        if (size != 0 && size != 1) {
            EnumC26028b enumC26028b = EnumC26028b.Full;
        }
        boolean z4 = false;
        this.f35914e = false;
        this.f35915f = C36785b.f157369w;
        List<C38915o4> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (C38915o4 paymentMethod : list2) {
                InterfaceC36786c cbcEligibility = this.f35915f;
                AbstractC22676k.m65750j(paymentMethod, "paymentMethod");
                C39013z3 c39013z3 = paymentMethod.f167514H;
                AbstractC22676k.m65750j(cbcEligibility, "cbcEligibility");
                boolean z13 = (c39013z3 == null || (c38995x3 = c39013z3.f167916K) == null || c38995x3.f167842w.size() <= 1) ? false : true;
                if ((cbcEligibility instanceof C36784a) && z13) {
                    z4 = true;
                    break;
                }
            }
        }
        this.f35916g = z4;
        this.f35917h = !this.f35910a.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11197e0)) {
            return false;
        }
        C11197e0 c11197e0 = (C11197e0) obj;
        return this.f35910a.equals(c11197e0.f35910a) && AbstractC22676k.m65745e(this.f35911b, c11197e0.f35911b) && this.f35912c.equals(c11197e0.f35912c) && AbstractC22676k.m65745e(this.f35913d, c11197e0.f35913d);
    }

    public final int hashCode() {
        int iHashCode = this.f35910a.hashCode() * 31;
        AbstractC29840y abstractC29840y = this.f35911b;
        return this.f35913d.hashCode() + ((this.f35912c.hashCode() + ((iHashCode + (abstractC29840y == null ? 0 : abstractC29840y.hashCode())) * 961)) * 31);
    }

    public final String toString() {
        return "CustomerState(paymentMethods=" + this.f35910a + ", currentSelection=" + this.f35911b + ", metadata=null, permissions=" + this.f35912c + ", configuration=" + this.f35913d + ")";
    }
}
