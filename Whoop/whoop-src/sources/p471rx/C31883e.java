package p471rx;

import androidx.room.AbstractC1772c1;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: renamed from: rx.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C31883e implements WildcardType {

    /* JADX INFO: renamed from: w */
    public final Type f132383w;

    /* JADX INFO: renamed from: x */
    public final Type f132384x;

    public C31883e(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            AbstractC31885f.m99124b(typeArr[0]);
            this.f132384x = null;
            this.f132383w = AbstractC31885f.m99123a(typeArr[0]);
            return;
        }
        typeArr2[0].getClass();
        AbstractC31885f.m99124b(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException();
        }
        this.f132384x = AbstractC31885f.m99123a(typeArr2[0]);
        this.f132383w = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && AbstractC1772c1.m5398p(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f132384x;
        return type != null ? new Type[]{type} : AbstractC31885f.f132391b;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f132383w};
    }

    public final int hashCode() {
        Type type = this.f132384x;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f132383w.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f132384x;
        if (type != null) {
            return "? super " + AbstractC31885f.m99134l(type);
        }
        Type type2 = this.f132383w;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + AbstractC31885f.m99134l(type2);
    }
}
