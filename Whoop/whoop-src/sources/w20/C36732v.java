package w20;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: w20.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C36732v implements InterfaceC36733w {

    /* JADX INFO: renamed from: a */
    public final String f157232a;

    public C36732v(String cvc) {
        AbstractC22676k.m65750j(cvc, "cvc");
        this.f157232a = cvc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C36732v) && AbstractC22676k.m65745e(this.f157232a, ((C36732v) obj).f157232a);
    }

    public final int hashCode() {
        return this.f157232a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("OnCvcChanged(cvc=", this.f157232a, ")");
    }
}
