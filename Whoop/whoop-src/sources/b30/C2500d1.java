package b30;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b30.d1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2500d1 implements InterfaceC2532h1 {

    /* JADX INFO: renamed from: a */
    public final C2578n f9740a;

    public C2500d1(C2578n billingDetailsFormState) {
        AbstractC22676k.m65750j(billingDetailsFormState, "billingDetailsFormState");
        this.f9740a = billingDetailsFormState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2500d1) && AbstractC22676k.m65745e(this.f9740a, ((C2500d1) obj).f9740a);
    }

    public final int hashCode() {
        return this.f9740a.hashCode();
    }

    public final String toString() {
        return "BillingDetailsChanged(billingDetailsFormState=" + this.f9740a + ")";
    }
}
