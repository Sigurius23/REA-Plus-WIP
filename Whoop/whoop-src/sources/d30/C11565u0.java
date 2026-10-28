package d30;

import h20.C16687l;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d30.u0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11565u0 implements InterfaceC11575z0 {

    /* JADX INFO: renamed from: a */
    public final C16687l f37316a;

    public C11565u0(C16687l savedPaymentMethod) {
        AbstractC22676k.m65750j(savedPaymentMethod, "savedPaymentMethod");
        this.f37316a = savedPaymentMethod;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11565u0) && AbstractC22676k.m65745e(this.f37316a, ((C11565u0) obj).f37316a);
    }

    public final int hashCode() {
        return this.f37316a.hashCode();
    }

    public final String toString() {
        return "OnManageOneSavedPaymentMethod(savedPaymentMethod=" + this.f37316a + ")";
    }
}
