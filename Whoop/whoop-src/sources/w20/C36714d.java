package w20;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: w20.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C36714d implements InterfaceC36716f {

    /* JADX INFO: renamed from: a */
    public final String f157197a;

    public C36714d(String cvc) {
        AbstractC22676k.m65750j(cvc, "cvc");
        this.f157197a = cvc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C36714d) && AbstractC22676k.m65745e(this.f157197a, ((C36714d) obj).f157197a);
    }

    public final int hashCode() {
        return this.f157197a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("Completed(cvc=", this.f157197a, ")");
    }
}
