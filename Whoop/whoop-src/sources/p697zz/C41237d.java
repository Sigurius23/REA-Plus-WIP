package p697zz;

import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zz.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C41237d implements InterfaceC41239f {

    /* JADX INFO: renamed from: a */
    public final Throwable f177939a;

    public C41237d(Throwable th3) {
        this.f177939a = th3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C41237d) && AbstractC22676k.m65745e(this.f177939a, ((C41237d) obj).f177939a);
    }

    public final int hashCode() {
        return this.f177939a.hashCode();
    }

    public final String toString() {
        return AbstractC36095b.m114681i("Error(error=", ")", this.f177939a);
    }
}
