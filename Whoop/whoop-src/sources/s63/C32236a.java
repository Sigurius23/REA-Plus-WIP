package s63;

import j93.InterfaceC21456a0;
import j93.InterfaceC21461d;
import java.lang.reflect.Type;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: s63.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C32236a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC21461d f133488a;

    /* JADX INFO: renamed from: b */
    public final Type f133489b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC21456a0 f133490c;

    public C32236a(InterfaceC21461d type, InterfaceC21456a0 interfaceC21456a0, Type type2) {
        AbstractC22676k.m65750j(type, "type");
        this.f133488a = type;
        this.f133489b = type2;
        this.f133490c = interfaceC21456a0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32236a)) {
            return false;
        }
        C32236a c32236a = (C32236a) obj;
        return AbstractC22676k.m65745e(this.f133488a, c32236a.f133488a) && AbstractC22676k.m65745e(this.f133489b, c32236a.f133489b) && AbstractC22676k.m65745e(this.f133490c, c32236a.f133490c);
    }

    public final int hashCode() {
        int iHashCode = (this.f133489b.hashCode() + (this.f133488a.hashCode() * 31)) * 31;
        InterfaceC21456a0 interfaceC21456a0 = this.f133490c;
        return iHashCode + (interfaceC21456a0 == null ? 0 : interfaceC21456a0.hashCode());
    }

    public final String toString() {
        return "TypeInfo(type=" + this.f133488a + ", reifiedType=" + this.f133489b + ", kotlinType=" + this.f133490c + ')';
    }
}
