package n10;

import p715kotlin.jvm.internal.AbstractC22676k;
import y00.InterfaceC38946s;

/* JADX INFO: renamed from: n10.d0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C26123d0 implements InterfaceC26127f0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC38946s f103501a;

    public C26123d0(InterfaceC38946s confirmNextParams) {
        AbstractC22676k.m65750j(confirmNextParams, "confirmNextParams");
        this.f103501a = confirmNextParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26123d0) && AbstractC22676k.m65745e(this.f103501a, ((C26123d0) obj).f103501a);
    }

    public final int hashCode() {
        return this.f103501a.hashCode();
    }

    public final String toString() {
        return "Confirm(confirmNextParams=" + this.f103501a + ")";
    }
}
