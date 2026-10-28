package p390p1;

import d13.AbstractC11478a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p1.v2 */
/* JADX INFO: loaded from: classes.dex */
public final class C28678v2 implements InterfaceC28682w2 {

    /* JADX INFO: renamed from: a */
    public final Object f115986a;

    public C28678v2(Object obj) {
        this.f115986a = obj;
    }

    @Override // p390p1.InterfaceC28682w2
    /* JADX INFO: renamed from: a */
    public final Object mo86979a(InterfaceC28653p1 interfaceC28653p1) {
        return this.f115986a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28678v2) && AbstractC22676k.m65745e(this.f115986a, ((C28678v2) obj).f115986a);
    }

    public final int hashCode() {
        Object obj = this.f115986a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return AbstractC11478a.m30860l(new StringBuilder("StaticValueHolder(value="), this.f115986a, ')');
    }
}
