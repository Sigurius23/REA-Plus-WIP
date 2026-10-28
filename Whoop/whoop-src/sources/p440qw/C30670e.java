package p440qw;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: qw.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C30670e implements ParameterizedType, Serializable {

    /* JADX INFO: renamed from: w */
    public final Type f126211w;

    /* JADX INFO: renamed from: x */
    public final Type f126212x;

    /* JADX INFO: renamed from: y */
    public final Type[] f126213y;

    public C30670e(Type type, Class cls, Type... typeArr) {
        Objects.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            throw new IllegalArgumentException(AbstractC11266d.m30459m(cls, "Must specify owner type for "));
        }
        this.f126211w = type == null ? null : AbstractC30672g.m94265a(type);
        this.f126212x = AbstractC30672g.m94265a(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f126213y = typeArr2;
        int length = typeArr2.length;
        for (int i13 = 0; i13 < length; i13++) {
            Objects.requireNonNull(this.f126213y[i13]);
            AbstractC30672g.m94267c(this.f126213y[i13]);
            Type[] typeArr3 = this.f126213y;
            typeArr3[i13] = AbstractC30672g.m94265a(typeArr3[i13]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && AbstractC30672g.m94269e(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f126213y.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f126211w;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f126212x;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f126213y) ^ this.f126212x.hashCode();
        Type type = this.f126211w;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f126213y;
        int length = typeArr.length;
        Type type = this.f126212x;
        if (length == 0) {
            return AbstractC30672g.m94275k(type);
        }
        StringBuilder sb4 = new StringBuilder((length + 1) * 30);
        sb4.append(AbstractC30672g.m94275k(type));
        sb4.append("<");
        sb4.append(AbstractC30672g.m94275k(typeArr[0]));
        for (int i13 = 1; i13 < length; i13++) {
            sb4.append(", ");
            sb4.append(AbstractC30672g.m94275k(typeArr[i13]));
        }
        sb4.append(">");
        return sb4.toString();
    }
}
