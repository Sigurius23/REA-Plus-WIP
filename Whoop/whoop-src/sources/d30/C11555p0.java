package d30;

import ih0.AbstractC18489d0;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d30.p0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11555p0 implements InterfaceC11559r0 {

    /* JADX INFO: renamed from: a */
    public final String f37273a;

    /* JADX INFO: renamed from: b */
    public final String f37274b;

    /* JADX INFO: renamed from: c */
    public final boolean f37275c;

    public /* synthetic */ C11555p0(String str) {
        this(str, null, false);
    }

    @Override // d30.InterfaceC11559r0
    /* JADX INFO: renamed from: a */
    public final boolean mo30995a() {
        return AbstractC22676k.m65745e(this, C11557q0.f37278a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11555p0)) {
            return false;
        }
        C11555p0 c11555p0 = (C11555p0) obj;
        return AbstractC22676k.m65745e(this.f37273a, c11555p0.f37273a) && AbstractC22676k.m65745e(this.f37274b, c11555p0.f37274b) && this.f37275c == c11555p0.f37275c;
    }

    public final int hashCode() {
        int iHashCode = this.f37273a.hashCode() * 31;
        String str = this.f37274b;
        return Boolean.hashCode(this.f37275c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return AbstractC18489d0.m53372m(AbstractC11895b.m32001t("New(code=", this.f37273a, ", changeDetails=", this.f37274b, ", canBeChanged="), this.f37275c, ")");
    }

    public C11555p0(String code, String str, boolean z4) {
        AbstractC22676k.m65750j(code, "code");
        this.f37273a = code;
        this.f37274b = str;
        this.f37275c = z4;
    }
}
