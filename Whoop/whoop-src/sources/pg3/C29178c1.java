package pg3;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: pg3.c1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C29178c1 implements ParameterizedType {

    /* JADX INFO: renamed from: w */
    public final Type f118150w;

    /* JADX INFO: renamed from: x */
    public final Type f118151x;

    /* JADX INFO: renamed from: y */
    public final Type[] f118152y;

    public C29178c1(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                throw new IllegalArgumentException();
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            AbstractC29184e1.m88683e(type3);
        }
        this.f118150w = type;
        this.f118151x = type2;
        this.f118152y = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && AbstractC29184e1.m88684f(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f118152y.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f118150w;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f118151x;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f118152y) ^ this.f118151x.hashCode();
        Type type = this.f118150w;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f118152y;
        int length = typeArr.length;
        Type type = this.f118151x;
        if (length == 0) {
            return AbstractC29184e1.m88697s(type);
        }
        StringBuilder sb4 = new StringBuilder((typeArr.length + 1) * 30);
        sb4.append(AbstractC29184e1.m88697s(type));
        sb4.append("<");
        sb4.append(AbstractC29184e1.m88697s(typeArr[0]));
        for (int i13 = 1; i13 < typeArr.length; i13++) {
            sb4.append(", ");
            sb4.append(AbstractC29184e1.m88697s(typeArr[i13]));
        }
        sb4.append(">");
        return sb4.toString();
    }
}
