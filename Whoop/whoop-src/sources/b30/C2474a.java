package b30;

import java.util.List;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p636y3.C39174f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b30.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C2474a {

    /* JADX INFO: renamed from: a */
    public final List f9627a;

    /* JADX INFO: renamed from: b */
    public final float f9628b;

    /* JADX INFO: renamed from: c */
    public final float f9629c;

    public C2474a(List paymentMethodCodes, float f13, float f14) {
        float f15 = AbstractC2581n2.f10041a;
        AbstractC22676k.m65750j(paymentMethodCodes, "paymentMethodCodes");
        this.f9627a = paymentMethodCodes;
        this.f9628b = f13;
        this.f9629c = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2474a)) {
            return false;
        }
        C2474a c2474a = (C2474a) obj;
        if (!AbstractC22676k.m65745e(this.f9627a, c2474a.f9627a) || !C39174f.m124782b(this.f9628b, c2474a.f9628b) || !C39174f.m124782b(this.f9629c, c2474a.f9629c)) {
            return false;
        }
        float f13 = AbstractC2581n2.f10041a;
        return C39174f.m124782b(f13, f13);
    }

    public final int hashCode() {
        return Float.hashCode(AbstractC2581n2.f10041a) + AbstractC11266d.m30447a(this.f9629c, AbstractC11266d.m30447a(this.f9628b, this.f9627a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String strM124783c = C39174f.m124783c(this.f9628b);
        return AbstractC11266d.m30464r(AbstractC26725a.m79507k("AddPaymentMethodInitialVisibilityTrackerData(paymentMethodCodes=", ", tabWidth=", strM124783c, ", screenWidth=", this.f9627a), C39174f.m124783c(this.f9629c), ", innerPadding=", C39174f.m124783c(AbstractC2581n2.f10041a), ")");
    }
}
