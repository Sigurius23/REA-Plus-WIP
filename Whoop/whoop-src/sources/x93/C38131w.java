package x93;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import ma3.InterfaceC25377f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x93.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C38131w extends AbstractC38130v implements InterfaceC25377f {

    /* JADX INFO: renamed from: a */
    public final Method f163240a;

    public C38131w(Method member) {
        AbstractC22676k.m65750j(member, "member");
        this.f163240a = member;
    }

    @Override // x93.AbstractC38130v
    /* JADX INFO: renamed from: c */
    public final Member mo122112c() {
        return this.f163240a;
    }

    @Override // ma3.InterfaceC25377f
    public final ArrayList getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.f163240a.getTypeParameters();
        AbstractC22676k.m65749i(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new C38108b0(typeVariable));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m122125j() {
        Object c38123o;
        Object defaultValue = this.f163240a.getDefaultValue();
        Object obj = null;
        if (defaultValue != null) {
            Class<?> cls = defaultValue.getClass();
            List list = AbstractC38109c.f163211a;
            if (Enum.class.isAssignableFrom(cls)) {
                c38123o = new C38127s(null, (Enum) defaultValue);
            } else if (defaultValue instanceof Annotation) {
                c38123o = new C38114f(null, (Annotation) defaultValue);
            } else if (defaultValue instanceof Object[]) {
                c38123o = new C38115g(null, (Object[]) defaultValue);
            } else {
                c38123o = defaultValue instanceof Class ? new C38123o(null, (Class) defaultValue) : new C38129u(null, defaultValue);
            }
            obj = c38123o;
        }
        return obj != null;
    }

    /* JADX INFO: renamed from: k */
    public final Method m122126k() {
        return this.f163240a;
    }

    /* JADX INFO: renamed from: l */
    public final AbstractC38106a0 m122127l() {
        Type genericReturnType = this.f163240a.getGenericReturnType();
        AbstractC22676k.m65749i(genericReturnType, "getGenericReturnType(...)");
        boolean z4 = genericReturnType instanceof Class;
        if (z4) {
            Class cls = (Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new C38133y(cls);
            }
        }
        if ((genericReturnType instanceof GenericArrayType) || (z4 && ((Class) genericReturnType).isArray())) {
            return new C38116h(genericReturnType);
        }
        return genericReturnType instanceof WildcardType ? new C38112d0((WildcardType) genericReturnType) : new C38124p(genericReturnType);
    }

    /* JADX INFO: renamed from: m */
    public final List m122128m() {
        Method method = this.f163240a;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        AbstractC22676k.m65749i(genericParameterTypes, "getGenericParameterTypes(...)");
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        AbstractC22676k.m65749i(parameterAnnotations, "getParameterAnnotations(...)");
        return m122120e(genericParameterTypes, parameterAnnotations, method.isVarArgs());
    }
}
