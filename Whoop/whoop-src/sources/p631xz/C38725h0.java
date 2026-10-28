package p631xz;

import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xz.h0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38725h0 implements InterfaceC38735m0 {

    /* JADX INFO: renamed from: a */
    public final Throwable f166675a;

    public C38725h0(Throwable th3) {
        this.f166675a = th3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38725h0) && AbstractC22676k.m65745e(this.f166675a, ((C38725h0) obj).f166675a);
    }

    public final int hashCode() {
        return this.f166675a.hashCode();
    }

    public final String toString() {
        return AbstractC36095b.m114681i("AccountError(error=", ")", this.f166675a);
    }
}
