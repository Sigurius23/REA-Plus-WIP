package p440qw;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* JADX INFO: renamed from: qw.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C30671f implements WildcardType, Serializable {

    /* JADX INFO: renamed from: w */
    public final Type f126214w;

    /* JADX INFO: renamed from: x */
    public final Type f126215x;

    public C30671f(Type[] typeArr, Type[] typeArr2) {
        AbstractC30672g.m94266b(typeArr2.length <= 1);
        AbstractC30672g.m94266b(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            AbstractC30672g.m94267c(typeArr[0]);
            this.f126215x = null;
            this.f126214w = AbstractC30672g.m94265a(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        AbstractC30672g.m94267c(typeArr2[0]);
        AbstractC30672g.m94266b(typeArr[0] == Object.class);
        this.f126215x = AbstractC30672g.m94265a(typeArr2[0]);
        this.f126214w = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && AbstractC30672g.m94269e(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f126215x;
        return type != null ? new Type[]{type} : AbstractC30672g.f126216a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f126214w};
    }

    public final int hashCode() {
        Type type = this.f126215x;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f126214w.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f126215x;
        if (type != null) {
            return "? super " + AbstractC30672g.m94275k(type);
        }
        Type type2 = this.f126214w;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + AbstractC30672g.m94275k(type2);
    }
}
