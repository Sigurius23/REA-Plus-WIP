package p023ay;

import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ay.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C2131e implements InterfaceC2134h {

    /* JADX INFO: renamed from: a */
    public final Throwable f8516a;

    public C2131e(Throwable th3) {
        this.f8516a = th3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2131e) && AbstractC22676k.m65745e(this.f8516a, ((C2131e) obj).f8516a);
    }

    public final int hashCode() {
        return this.f8516a.hashCode();
    }

    public final String toString() {
        return AbstractC36095b.m114681i("Error(cause=", ")", this.f8516a);
    }
}
