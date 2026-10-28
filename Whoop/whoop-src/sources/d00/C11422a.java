package d00;

import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d00.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C11422a implements InterfaceC11427f {

    /* JADX INFO: renamed from: a */
    public final Throwable f36642a;

    public C11422a(Throwable th3) {
        this.f36642a = th3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11422a) && AbstractC22676k.m65745e(this.f36642a, ((C11422a) obj).f36642a);
    }

    public final int hashCode() {
        return this.f36642a.hashCode();
    }

    public final String toString() {
        return AbstractC36095b.m114681i("Error(error=", ")", this.f36642a);
    }
}
