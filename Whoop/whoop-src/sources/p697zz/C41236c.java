package p697zz;

import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zz.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C41236c implements InterfaceC41239f {

    /* JADX INFO: renamed from: a */
    public final Throwable f177938a;

    public C41236c(Throwable th3) {
        this.f177938a = th3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C41236c) && AbstractC22676k.m65745e(this.f177938a, ((C41236c) obj).f177938a);
    }

    public final int hashCode() {
        return this.f177938a.hashCode();
    }

    public final String toString() {
        return AbstractC36095b.m114681i("AttestationFailed(error=", ")", this.f177938a);
    }
}
