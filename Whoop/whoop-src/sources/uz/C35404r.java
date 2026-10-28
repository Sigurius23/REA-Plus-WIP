package uz;

import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: uz.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C35404r implements InterfaceC35406t {

    /* JADX INFO: renamed from: a */
    public final Throwable f150842a;

    public C35404r(Throwable error) {
        AbstractC22676k.m65750j(error, "error");
        this.f150842a = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35404r) && AbstractC22676k.m65745e(this.f150842a, ((C35404r) obj).f150842a);
    }

    public final int hashCode() {
        return this.f150842a.hashCode();
    }

    public final String toString() {
        return AbstractC36095b.m114681i("Failure(error=", ")", this.f150842a);
    }
}
