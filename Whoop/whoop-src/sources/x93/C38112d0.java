package x93;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import m83.AbstractC25260n;
import m83.C25271y;
import ma3.InterfaceC25376e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x93.d0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C38112d0 extends AbstractC38106a0 implements InterfaceC25376e {

    /* JADX INFO: renamed from: a */
    public final WildcardType f163220a;

    public C38112d0(WildcardType wildcardType) {
        this.f163220a = wildcardType;
    }

    @Override // x93.AbstractC38106a0
    /* JADX INFO: renamed from: b */
    public final Type mo122088b() {
        return this.f163220a;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC38106a0 m122097c() {
        WildcardType wildcardType = this.f163220a;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + wildcardType);
        }
        if (lowerBounds.length == 1) {
            Object objM74037M0 = AbstractC25260n.m74037M0(lowerBounds);
            AbstractC22676k.m65749i(objM74037M0, "single(...)");
            Type type = (Type) objM74037M0;
            boolean z4 = type instanceof Class;
            if (z4) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new C38133y(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z4 && ((Class) type).isArray())) {
                return new C38116h(type);
            }
            return type instanceof WildcardType ? new C38112d0((WildcardType) type) : new C38124p(type);
        }
        if (upperBounds.length != 1) {
            return null;
        }
        Type type2 = (Type) AbstractC25260n.m74037M0(upperBounds);
        if (AbstractC22676k.m65745e(type2, Object.class)) {
            return null;
        }
        AbstractC22676k.m65747g(type2);
        boolean z13 = type2 instanceof Class;
        if (z13) {
            Class cls2 = (Class) type2;
            if (cls2.isPrimitive()) {
                return new C38133y(cls2);
            }
        }
        if ((type2 instanceof GenericArrayType) || (z13 && ((Class) type2).isArray())) {
            return new C38116h(type2);
        }
        return type2 instanceof WildcardType ? new C38112d0((WildcardType) type2) : new C38124p(type2);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m122098d() {
        Type[] upperBounds = this.f163220a.getUpperBounds();
        AbstractC22676k.m65749i(upperBounds, "getUpperBounds(...)");
        return !AbstractC22676k.m65745e(AbstractC25260n.m74079t0(upperBounds), Object.class);
    }

    @Override // ma3.InterfaceC25373b
    public final Collection getAnnotations() {
        return C25271y.f99162w;
    }
}
