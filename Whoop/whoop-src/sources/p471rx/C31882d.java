package p471rx;

import androidx.room.AbstractC1772c1;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: renamed from: rx.d */
/* JADX INFO: loaded from: classes.dex */
public final class C31882d implements ParameterizedType {

    /* JADX INFO: renamed from: w */
    public final Type f132380w;

    /* JADX INFO: renamed from: x */
    public final Type f132381x;

    /* JADX INFO: renamed from: y */
    public final Type[] f132382y;

    public C31882d(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
            if (type != null) {
                if (enclosingClass == null || AbstractC1772c1.m5407z(type) != enclosingClass) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                }
            } else if (enclosingClass != null) {
                throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
            }
        }
        this.f132380w = type == null ? null : AbstractC31885f.m99123a(type);
        this.f132381x = AbstractC31885f.m99123a(type2);
        this.f132382y = (Type[]) typeArr.clone();
        int i13 = 0;
        while (true) {
            Type[] typeArr2 = this.f132382y;
            if (i13 >= typeArr2.length) {
                return;
            }
            typeArr2[i13].getClass();
            AbstractC31885f.m99124b(this.f132382y[i13]);
            Type[] typeArr3 = this.f132382y;
            typeArr3[i13] = AbstractC31885f.m99123a(typeArr3[i13]);
            i13++;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && AbstractC1772c1.m5398p(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f132382y.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f132380w;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f132381x;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f132382y) ^ this.f132381x.hashCode();
        Set set = AbstractC31885f.f132390a;
        Type type = this.f132380w;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f132382y;
        StringBuilder sb4 = new StringBuilder((typeArr.length + 1) * 30);
        sb4.append(AbstractC31885f.m99134l(this.f132381x));
        if (typeArr.length == 0) {
            return sb4.toString();
        }
        sb4.append("<");
        sb4.append(AbstractC31885f.m99134l(typeArr[0]));
        for (int i13 = 1; i13 < typeArr.length; i13++) {
            sb4.append(", ");
            sb4.append(AbstractC31885f.m99134l(typeArr[i13]));
        }
        sb4.append(">");
        return sb4.toString();
    }
}
