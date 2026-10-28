package pg3;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: renamed from: pg3.d1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C29181d1 implements WildcardType {

    /* JADX INFO: renamed from: w */
    public final Type f118156w;

    /* JADX INFO: renamed from: x */
    public final Type f118157x;

    public C29181d1(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            AbstractC29184e1.m88683e(typeArr[0]);
            this.f118157x = null;
            this.f118156w = typeArr[0];
            return;
        }
        typeArr2[0].getClass();
        AbstractC29184e1.m88683e(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException();
        }
        this.f118157x = typeArr2[0];
        this.f118156w = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && AbstractC29184e1.m88684f(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f118157x;
        return type != null ? new Type[]{type} : AbstractC29184e1.f118161a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f118156w};
    }

    public final int hashCode() {
        Type type = this.f118157x;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f118156w.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f118157x;
        if (type != null) {
            return "? super " + AbstractC29184e1.m88697s(type);
        }
        Type type2 = this.f118156w;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + AbstractC29184e1.m88697s(type2);
    }
}
