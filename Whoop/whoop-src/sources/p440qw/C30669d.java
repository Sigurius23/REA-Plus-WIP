package p440qw;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: renamed from: qw.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C30669d implements GenericArrayType, Serializable {

    /* JADX INFO: renamed from: w */
    public final Type f126210w;

    public C30669d(Type type) {
        Objects.requireNonNull(type);
        this.f126210w = AbstractC30672g.m94265a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC30672g.m94269e(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f126210w;
    }

    public final int hashCode() {
        return this.f126210w.hashCode();
    }

    public final String toString() {
        return AbstractC30672g.m94275k(this.f126210w) + "[]";
    }
}
