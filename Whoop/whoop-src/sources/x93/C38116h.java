package x93;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import m83.C25271y;
import ma3.InterfaceC25376e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x93.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C38116h extends AbstractC38106a0 implements InterfaceC25376e {

    /* JADX INFO: renamed from: a */
    public final Type f163224a;

    /* JADX INFO: renamed from: b */
    public final AbstractC38106a0 f163225b;

    /* JADX INFO: renamed from: c */
    public final C25271y f163226c;

    /* JADX WARN: Multi-variable type inference failed */
    public C38116h(Type type) {
        AbstractC38106a0 c38133y;
        AbstractC38106a0 c38133y2;
        this.f163224a = type;
        if (!(type instanceof GenericArrayType)) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    AbstractC22676k.m65749i(componentType, "getComponentType(...)");
                    c38133y = componentType.isPrimitive() ? new C38133y(componentType) : ((componentType instanceof GenericArrayType) || componentType.isArray()) ? new C38116h(componentType) : componentType instanceof WildcardType ? new C38112d0((WildcardType) componentType) : new C38124p(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + type.getClass() + "): " + type);
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        AbstractC22676k.m65749i(genericComponentType, "getGenericComponentType(...)");
        boolean z4 = genericComponentType instanceof Class;
        if (z4) {
            Class cls2 = (Class) genericComponentType;
            c38133y2 = cls2.isPrimitive() ? new C38133y(cls2) : c38133y2;
            this.f163225b = c38133y2;
            this.f163226c = C25271y.f99162w;
        }
        c38133y = ((genericComponentType instanceof GenericArrayType) || (z4 && ((Class) genericComponentType).isArray())) ? new C38116h(genericComponentType) : genericComponentType instanceof WildcardType ? new C38112d0((WildcardType) genericComponentType) : new C38124p(genericComponentType);
        c38133y2 = c38133y;
        this.f163225b = c38133y2;
        this.f163226c = C25271y.f99162w;
    }

    @Override // x93.AbstractC38106a0
    /* JADX INFO: renamed from: b */
    public final Type mo122088b() {
        return this.f163224a;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC38106a0 m122100c() {
        return this.f163225b;
    }

    @Override // ma3.InterfaceC25373b
    public final Collection getAnnotations() {
        return this.f163226c;
    }
}
