package b30;

import o20.C27457b;
import p477s2.AbstractC32073e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b30.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C2490c extends AbstractC32073e {

    /* JADX INFO: renamed from: a */
    public final C27457b f9705a;

    /* JADX INFO: renamed from: b */
    public final String f9706b;

    public C2490c(C27457b c27457b, String selectedPaymentMethodCode) {
        AbstractC22676k.m65750j(selectedPaymentMethodCode, "selectedPaymentMethodCode");
        this.f9705a = c27457b;
        this.f9706b = selectedPaymentMethodCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2490c)) {
            return false;
        }
        C2490c c2490c = (C2490c) obj;
        return AbstractC22676k.m65745e(this.f9705a, c2490c.f9705a) && AbstractC22676k.m65745e(this.f9706b, c2490c.f9706b);
    }

    public final int hashCode() {
        C27457b c27457b = this.f9705a;
        return this.f9706b.hashCode() + ((c27457b == null ? 0 : c27457b.hashCode()) * 31);
    }

    public final String toString() {
        return "OnFormFieldValuesChanged(formValues=" + this.f9705a + ", selectedPaymentMethodCode=" + this.f9706b + ")";
    }
}
