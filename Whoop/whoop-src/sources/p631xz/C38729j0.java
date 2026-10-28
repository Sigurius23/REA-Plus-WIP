package p631xz;

import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xz.j0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38729j0 implements InterfaceC38735m0 {

    /* JADX INFO: renamed from: a */
    public final Throwable f166684a;

    public C38729j0(Throwable th3) {
        this.f166684a = th3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38729j0) && AbstractC22676k.m65745e(this.f166684a, ((C38729j0) obj).f166684a);
    }

    public final int hashCode() {
        return this.f166684a.hashCode();
    }

    public final String toString() {
        return AbstractC36095b.m114681i("Error(error=", ")", this.f166684a);
    }
}
