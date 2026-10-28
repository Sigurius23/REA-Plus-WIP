package p599wz;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wz.o1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37743o1 implements InterfaceC37752r1 {

    /* JADX INFO: renamed from: a */
    public final AbstractC37713e1 f161706a;

    public C37743o1(AbstractC37713e1 initialDestination) {
        AbstractC22676k.m65750j(initialDestination, "initialDestination");
        this.f161706a = initialDestination;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37743o1) && AbstractC22676k.m65745e(this.f161706a, ((C37743o1) obj).f161706a);
    }

    public final int hashCode() {
        return this.f161706a.hashCode();
    }

    public final String toString() {
        return "FullScreen(initialDestination=" + this.f161706a + ")";
    }
}
