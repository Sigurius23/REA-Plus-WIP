package p522uf;

import j93.InterfaceC21461d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: uf.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C34895v {

    /* JADX INFO: renamed from: a */
    public final InterfaceC21461d f146960a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC21461d f146961b;

    public C34895v(InterfaceC21461d inputType, InterfaceC21461d outputType) {
        AbstractC22676k.m65750j(inputType, "inputType");
        AbstractC22676k.m65750j(outputType, "outputType");
        this.f146960a = inputType;
        this.f146961b = outputType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34895v)) {
            return false;
        }
        C34895v c34895v = (C34895v) obj;
        return AbstractC22676k.m65745e(this.f146960a, c34895v.f146960a) && AbstractC22676k.m65745e(this.f146961b, c34895v.f146961b);
    }

    public final int hashCode() {
        return this.f146961b.hashCode() + (this.f146960a.hashCode() * 31);
    }

    public final String toString() {
        return "OperationTypeInfo(inputType=" + this.f146960a + ", outputType=" + this.f146961b + ')';
    }
}
