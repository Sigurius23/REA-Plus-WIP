package h20;

import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38818e4;

/* JADX INFO: renamed from: h20.o4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16710o4 implements InterfaceC16728r4 {

    /* JADX INFO: renamed from: a */
    public final C38818e4 f64241a;

    public C16710o4(C38818e4 sepaDebit) {
        AbstractC22676k.m65750j(sepaDebit, "sepaDebit");
        this.f64241a = sepaDebit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16710o4) && AbstractC22676k.m65745e(this.f64241a, ((C16710o4) obj).f64241a);
    }

    public final int hashCode() {
        return this.f64241a.hashCode();
    }

    public final String toString() {
        return "SepaDebit(sepaDebit=" + this.f64241a + ")";
    }
}
