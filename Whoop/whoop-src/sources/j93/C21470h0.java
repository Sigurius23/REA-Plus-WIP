package j93;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import m83.AbstractC25260n;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j93.h0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C21470h0 implements ParameterizedType, Type {

    /* JADX INFO: renamed from: w */
    public final Class f82436w;

    /* JADX INFO: renamed from: x */
    public final Type f82437x;

    /* JADX INFO: renamed from: y */
    public final Type[] f82438y;

    public C21470h0(Class cls, Type type, ArrayList arrayList) {
        this.f82436w = cls;
        this.f82437x = type;
        this.f82438y = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return AbstractC22676k.m65745e(this.f82436w, parameterizedType.getRawType()) && AbstractC22676k.m65745e(this.f82437x, parameterizedType.getOwnerType()) && Arrays.equals(this.f82438y, parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f82438y;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f82437x;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f82436w;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb4 = new StringBuilder();
        Class cls = this.f82436w;
        Type type = this.f82437x;
        if (type != null) {
            sb4.append(AbstractC21478l0.m60435h(type));
            sb4.append("$");
            sb4.append(cls.getSimpleName());
        } else {
            sb4.append(AbstractC21478l0.m60435h(cls));
        }
        Type[] typeArr = this.f82438y;
        if (typeArr.length != 0) {
            AbstractC25260n.m74025A0(typeArr, sb4, ", ", (62 & 4) != 0 ? "" : "<", (62 & 8) == 0 ? ">" : "", "...", C21468g0.f82435w);
        }
        return sb4.toString();
    }

    public final int hashCode() {
        int iHashCode = this.f82436w.hashCode();
        Type type = this.f82437x;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.f82438y);
    }

    public final String toString() {
        return getTypeName();
    }
}
