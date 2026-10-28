package x93;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25260n;
import m83.C25271y;
import ma3.InterfaceC25377f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x93.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C38125q extends AbstractC38130v implements InterfaceC25377f {

    /* JADX INFO: renamed from: a */
    public final Constructor f163236a;

    public C38125q(Constructor member) {
        AbstractC22676k.m65750j(member, "member");
        this.f163236a = member;
    }

    @Override // x93.AbstractC38130v
    /* JADX INFO: renamed from: c */
    public final Member mo122112c() {
        return this.f163236a;
    }

    @Override // ma3.InterfaceC25377f
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f163236a.getTypeParameters();
        AbstractC22676k.m65749i(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new C38108b0(typeVariable));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public final Constructor m122113j() {
        return this.f163236a;
    }

    /* JADX INFO: renamed from: k */
    public final List m122114k() {
        Constructor constructor = this.f163236a;
        Type[] genericParameterTypes = constructor.getGenericParameterTypes();
        AbstractC22676k.m65747g(genericParameterTypes);
        if (genericParameterTypes.length == 0) {
            return C25271y.f99162w;
        }
        Class declaringClass = constructor.getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) AbstractC25260n.m74072m0(1, genericParameterTypes.length, genericParameterTypes);
        }
        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
        if (parameterAnnotations.length >= genericParameterTypes.length) {
            if (parameterAnnotations.length > genericParameterTypes.length) {
                parameterAnnotations = (Annotation[][]) AbstractC25260n.m74072m0(parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length, parameterAnnotations);
            }
            return m122120e(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
        }
        throw new IllegalStateException("Illegal generic signature: " + constructor);
    }
}
