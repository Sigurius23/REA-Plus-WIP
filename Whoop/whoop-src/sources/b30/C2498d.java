package b30;

import p088dc.AbstractC11895b;
import p477s2.AbstractC32073e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b30.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C2498d extends AbstractC32073e {

    /* JADX INFO: renamed from: a */
    public final String f9738a;

    public C2498d(String code) {
        AbstractC22676k.m65750j(code, "code");
        this.f9738a = code;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2498d) && AbstractC22676k.m65745e(this.f9738a, ((C2498d) obj).f9738a);
    }

    public final int hashCode() {
        return this.f9738a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("OnPaymentMethodSelected(code=", this.f9738a, ")");
    }
}
