package p697zz;

import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zz.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C41235b implements InterfaceC41239f {

    /* JADX INFO: renamed from: a */
    public final Throwable f177937a;

    public C41235b(Throwable th3) {
        this.f177937a = th3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C41235b) && AbstractC22676k.m65745e(this.f177937a, ((C41235b) obj).f177937a);
    }

    public final int hashCode() {
        return this.f177937a.hashCode();
    }

    public final String toString() {
        return AbstractC36095b.m114681i("AccountError(error=", ")", this.f177937a);
    }
}
