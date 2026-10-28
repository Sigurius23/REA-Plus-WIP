package j93;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j93.m0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C21480m0 implements WildcardType, Type {

    /* JADX INFO: renamed from: y */
    public static final C21480m0 f82442y = new C21480m0(null, null);

    /* JADX INFO: renamed from: w */
    public final Type f82443w;

    /* JADX INFO: renamed from: x */
    public final Type f82444x;

    public C21480m0(Type type, Type type2) {
        this.f82443w = type;
        this.f82444x = type2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f82444x;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        Type type = this.f82444x;
        if (type != null) {
            return "? super " + AbstractC21478l0.m60435h(type);
        }
        Type type2 = this.f82443w;
        if (type2 == null || AbstractC22676k.m65745e(type2, Object.class)) {
            return "?";
        }
        return "? extends " + AbstractC21478l0.m60435h(type2);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type type = this.f82443w;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public final int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public final String toString() {
        return getTypeName();
    }
}
