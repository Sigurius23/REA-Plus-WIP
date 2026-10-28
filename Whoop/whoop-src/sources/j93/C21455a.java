package j93;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j93.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C21455a implements GenericArrayType, Type {

    /* JADX INFO: renamed from: w */
    public final Type f82421w;

    public C21455a(Type elementType) {
        AbstractC22676k.m65750j(elementType, "elementType");
        this.f82421w = elementType;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return AbstractC22676k.m65745e(this.f82421w, ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f82421w;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return AbstractC21478l0.m60435h(this.f82421w) + "[]";
    }

    public final int hashCode() {
        return this.f82421w.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
