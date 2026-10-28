package pg3;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: pg3.b1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C29175b1 implements GenericArrayType {

    /* JADX INFO: renamed from: w */
    public final Type f118146w;

    public C29175b1(Type type) {
        this.f118146w = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC29184e1.m88684f(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f118146w;
    }

    public final int hashCode() {
        return this.f118146w.hashCode();
    }

    public final String toString() {
        return AbstractC29184e1.m88697s(this.f118146w) + "[]";
    }
}
