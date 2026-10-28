package p631xz;

import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xz.i0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38727i0 implements InterfaceC38735m0 {

    /* JADX INFO: renamed from: a */
    public final Throwable f166680a;

    public C38727i0(Throwable th3) {
        this.f166680a = th3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38727i0) && AbstractC22676k.m65745e(this.f166680a, ((C38727i0) obj).f166680a);
    }

    public final int hashCode() {
        return this.f166680a.hashCode();
    }

    public final String toString() {
        return AbstractC36095b.m114681i("AttestationFailed(error=", ")", this.f166680a);
    }
}
