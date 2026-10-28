package x93;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import m83.AbstractC25267u;
import m83.C25271y;
import ma3.InterfaceC25374c;
import ma3.InterfaceC25375d;
import ma3.InterfaceC25376e;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.C35847e;

/* JADX INFO: renamed from: x93.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C38124p extends AbstractC38106a0 implements InterfaceC25376e {

    /* JADX INFO: renamed from: a */
    public final Type f163234a;

    /* JADX INFO: renamed from: b */
    public final AbstractC38126r f163235b;

    public C38124p(Type reflectType) {
        AbstractC38126r c38122n;
        AbstractC22676k.m65750j(reflectType, "reflectType");
        this.f163234a = reflectType;
        if (reflectType instanceof Class) {
            c38122n = new C38122n((Class) reflectType);
        } else if (reflectType instanceof TypeVariable) {
            c38122n = new C38108b0((TypeVariable) reflectType);
        } else {
            if (!(reflectType instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + reflectType.getClass() + "): " + reflectType);
            }
            Type rawType = ((ParameterizedType) reflectType).getRawType();
            AbstractC22676k.m65748h(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            c38122n = new C38122n((Class) rawType);
        }
        this.f163235b = c38122n;
    }

    @Override // x93.AbstractC38106a0, ma3.InterfaceC25373b
    /* JADX INFO: renamed from: a */
    public final C38111d mo74422a(C35847e fqName) {
        AbstractC22676k.m65750j(fqName, "fqName");
        return null;
    }

    @Override // x93.AbstractC38106a0
    /* JADX INFO: renamed from: b */
    public final Type mo122088b() {
        return this.f163234a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ma3.c, x93.r] */
    /* JADX INFO: renamed from: c */
    public final InterfaceC25374c m122107c() {
        return this.f163235b;
    }

    /* JADX INFO: renamed from: d */
    public final String m122108d() {
        throw new UnsupportedOperationException("Type not found: " + this.f163234a);
    }

    /* JADX INFO: renamed from: e */
    public final String m122109e() {
        return this.f163234a.toString();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003b  */
    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX INFO: renamed from: f */
    public final ArrayList m122110f() {
        InterfaceC25375d c38116h;
        InterfaceC25375d c38133y;
        List<Type> listM122091c = AbstractC38109c.m122091c(this.f163234a);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM122091c, 10));
        for (Type type : listM122091c) {
            AbstractC22676k.m65750j(type, "type");
            boolean z4 = type instanceof Class;
            if (z4) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    c38133y = new C38133y(cls);
                } else {
                    if (!(type instanceof GenericArrayType) || (z4 && ((Class) type).isArray())) {
                        c38116h = new C38116h(type);
                    } else {
                        c38116h = type instanceof WildcardType ? new C38112d0((WildcardType) type) : new C38124p(type);
                    }
                    c38133y = c38116h;
                }
            } else {
                if (type instanceof GenericArrayType) {
                    c38116h = new C38116h(type);
                } else {
                    c38116h = new C38116h(type);
                }
                c38133y = c38116h;
            }
            arrayList.add(c38133y);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m122111g() {
        Type type = this.f163234a;
        if (type instanceof Class) {
            TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
            AbstractC22676k.m65749i(typeParameters, "getTypeParameters(...)");
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // ma3.InterfaceC25373b
    public final Collection getAnnotations() {
        return C25271y.f99162w;
    }
}
