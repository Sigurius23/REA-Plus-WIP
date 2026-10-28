package d30;

import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38915o4;

/* JADX INFO: renamed from: d30.w0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11569w0 implements InterfaceC11575z0 {

    /* JADX INFO: renamed from: a */
    public final C38915o4 f37342a;

    public C11569w0(C38915o4 savedPaymentMethod) {
        AbstractC22676k.m65750j(savedPaymentMethod, "savedPaymentMethod");
        this.f37342a = savedPaymentMethod;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11569w0) && AbstractC22676k.m65745e(this.f37342a, ((C11569w0) obj).f37342a);
    }

    public final int hashCode() {
        return this.f37342a.hashCode();
    }

    public final String toString() {
        return "SavedPaymentMethodSelected(savedPaymentMethod=" + this.f37342a + ")";
    }
}
