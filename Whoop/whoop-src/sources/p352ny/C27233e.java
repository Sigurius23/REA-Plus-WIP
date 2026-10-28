package p352ny;

import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ny.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C27233e {

    /* JADX INFO: renamed from: a */
    public final Throwable f109003a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC41211c f109004b;

    public C27233e(Throwable error, InterfaceC41211c interfaceC41211c) {
        AbstractC22676k.m65750j(error, "error");
        this.f109003a = error;
        this.f109004b = interfaceC41211c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27233e)) {
            return false;
        }
        C27233e c27233e = (C27233e) obj;
        return AbstractC22676k.m65745e(this.f109003a, c27233e.f109003a) && AbstractC22676k.m65745e(this.f109004b, c27233e.f109004b);
    }

    public final int hashCode() {
        int iHashCode = this.f109003a.hashCode() * 31;
        InterfaceC41211c interfaceC41211c = this.f109004b;
        return iHashCode + (interfaceC41211c == null ? 0 : interfaceC41211c.hashCode());
    }

    public final String toString() {
        return "FailedCollection(error=" + this.f109003a + ", displayMessage=" + this.f109004b + ")";
    }
}
