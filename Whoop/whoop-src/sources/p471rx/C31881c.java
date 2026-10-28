package p471rx;

import androidx.room.AbstractC1772c1;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: rx.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C31881c implements GenericArrayType {

    /* JADX INFO: renamed from: w */
    public final Type f132379w;

    public C31881c(Type type) {
        this.f132379w = AbstractC31885f.m99123a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC1772c1.m5398p(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f132379w;
    }

    public final int hashCode() {
        return this.f132379w.hashCode();
    }

    public final String toString() {
        return AbstractC31885f.m99134l(this.f132379w) + "[]";
    }
}
