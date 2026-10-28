package cz;

import b30.C2534h3;
import b30.C2550j3;
import c93.InterfaceC4339a;
import com.whoop.android.R;
import ih0.AbstractC18489d0;
import java.util.List;
import ou1.C28376a;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p479s4.AbstractC32128i;
import p696zy.C41210b;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: cz.r0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11223r0 extends AbstractC11227t0 {

    /* JADX INFO: renamed from: c */
    public final String f36012c;

    /* JADX INFO: renamed from: d */
    public final List f36013d;

    /* JADX INFO: renamed from: e */
    public final AbstractC29840y f36014e;

    /* JADX INFO: renamed from: f */
    public final boolean f36015f;

    /* JADX INFO: renamed from: g */
    public final boolean f36016g;

    /* JADX INFO: renamed from: h */
    public final boolean f36017h;

    /* JADX INFO: renamed from: i */
    public final boolean f36018i;

    /* JADX INFO: renamed from: j */
    public final boolean f36019j;

    /* JADX INFO: renamed from: k */
    public final boolean f36020k;

    /* JADX INFO: renamed from: l */
    public final boolean f36021l;

    /* JADX INFO: renamed from: m */
    public final String f36022m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC41211c f36023n;

    /* JADX INFO: renamed from: o */
    public final boolean f36024o;

    /* JADX INFO: renamed from: p */
    public final C41210b f36025p;

    public C11223r0(String str, List list, AbstractC29840y abstractC29840y, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, String str2, InterfaceC41211c interfaceC41211c, boolean z19) {
        super(z13, false);
        this.f36012c = str;
        this.f36013d = list;
        this.f36014e = abstractC29840y;
        this.f36015f = z4;
        this.f36016g = z13;
        this.f36017h = z14;
        this.f36018i = z15;
        this.f36019j = z16;
        this.f36020k = z17;
        this.f36021l = z18;
        this.f36022m = str2;
        this.f36023n = interfaceC41211c;
        this.f36024o = z19;
        this.f36025p = AbstractC32128i.m100054h(R.string.stripe_paymentsheet_confirm);
    }

    @Override // cz.AbstractC11227t0
    /* JADX INFO: renamed from: a */
    public final boolean mo30346a() {
        return this.f36016g;
    }

    @Override // cz.AbstractC11227t0
    /* JADX INFO: renamed from: b */
    public final C2550j3 mo30347b(InterfaceC4339a onEditIconPressed) {
        AbstractC22676k.m65750j(onEditIconPressed, "onEditIconPressed");
        C2534h3 c2534h3 = new C2534h3(this.f36017h, this.f36020k, onEditIconPressed);
        boolean z4 = !this.f36015f;
        boolean z13 = c2534h3.f9841b;
        boolean z14 = c2534h3.f9840a;
        InterfaceC4339a c28376a = c2534h3.f9842c;
        if (c28376a == null) {
            c28376a = new C28376a(7);
        }
        return new C2550j3(z4, z13, z14, c28376a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11223r0)) {
            return false;
        }
        C11223r0 c11223r0 = (C11223r0) obj;
        return AbstractC22676k.m65745e(this.f36012c, c11223r0.f36012c) && AbstractC22676k.m65745e(this.f36013d, c11223r0.f36013d) && AbstractC22676k.m65745e(this.f36014e, c11223r0.f36014e) && this.f36015f == c11223r0.f36015f && this.f36016g == c11223r0.f36016g && this.f36017h == c11223r0.f36017h && this.f36018i == c11223r0.f36018i && this.f36019j == c11223r0.f36019j && this.f36020k == c11223r0.f36020k && this.f36021l == c11223r0.f36021l && AbstractC22676k.m65745e(this.f36022m, c11223r0.f36022m) && AbstractC22676k.m65745e(this.f36023n, c11223r0.f36023n) && this.f36024o == c11223r0.f36024o;
    }

    public final int hashCode() {
        String str = this.f36012c;
        int iM31983b = AbstractC11895b.m31983b((str == null ? 0 : str.hashCode()) * 31, 31, this.f36013d);
        AbstractC29840y abstractC29840y = this.f36014e;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM31983b + (abstractC29840y == null ? 0 : abstractC29840y.hashCode())) * 31, 31, this.f36015f), 31, this.f36016g), 31, this.f36017h), 31, this.f36018i), 31, this.f36019j), 31, this.f36020k), 31, this.f36021l);
        String str2 = this.f36022m;
        int iHashCode = (iM8289b + (str2 == null ? 0 : str2.hashCode())) * 31;
        InterfaceC41211c interfaceC41211c = this.f36023n;
        return Boolean.hashCode(this.f36024o) + ((iHashCode + (interfaceC41211c != null ? interfaceC41211c.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM94766o = AbstractC30802r.m94766o("SelectPaymentMethod(title=", this.f36012c, ", savedPaymentMethods=", ", paymentSelection=", this.f36013d);
        sbM94766o.append(this.f36014e);
        sbM94766o.append(", isLiveMode=");
        sbM94766o.append(this.f36015f);
        sbM94766o.append(", isProcessing=");
        AbstractC38963t7.m124392v(sbM94766o, this.f36016g, ", isEditing=", this.f36017h, ", showGooglePay=");
        AbstractC38963t7.m124392v(sbM94766o, this.f36018i, ", primaryButtonVisible=", this.f36019j, ", canEdit=");
        AbstractC38963t7.m124392v(sbM94766o, this.f36020k, ", canRemovePaymentMethods=", this.f36021l, ", errorMessage=");
        sbM94766o.append(this.f36022m);
        sbM94766o.append(", mandateText=");
        sbM94766o.append(this.f36023n);
        sbM94766o.append(", isCbcEligible=");
        return AbstractC18489d0.m53372m(sbM94766o, this.f36024o, ")");
    }
}
