package x93;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import m83.AbstractC25265s;
import m83.C25271y;
import ma3.InterfaceC25373b;
import ma3.InterfaceC25375d;
import p482s7.AbstractC32237a;
import p499t9.C33652u;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.AbstractC31143m1;
import r93.C31125g1;
import r93.C31134j1;
import v93.C35835a;
import v93.C35836b;
import v93.C35837c;
import va3.AbstractC35852j;
import va3.C35847e;
import va3.C35850h;

/* JADX INFO: renamed from: x93.v */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC38130v extends AbstractC38126r implements InterfaceC25373b, InterfaceC25375d {
    @Override // ma3.InterfaceC25373b
    /* JADX INFO: renamed from: a */
    public final C38111d mo74422a(C35847e fqName) {
        AbstractC22676k.m65750j(fqName, "fqName");
        Member memberMo122112c = mo122112c();
        AbstractC22676k.m65748h(memberMo122112c, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberMo122112c).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return AbstractC32237a.m100291e(declaredAnnotations, fqName);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final C38122n m122118b() {
        Class<?> declaringClass = mo122112c().getDeclaringClass();
        AbstractC22676k.m65749i(declaringClass, "getDeclaringClass(...)");
        return new C38122n(declaringClass);
    }

    /* JADX INFO: renamed from: c */
    public abstract Member mo122112c();

    /* JADX INFO: renamed from: d */
    public final C35850h m122119d() {
        String name = mo122112c().getName();
        return name != null ? C35850h.m113814e(name) : AbstractC35852j.f152624a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:61:0x0125  */
    /* JADX INFO: renamed from: e */
    public final ArrayList m122120e(Type[] typeArr, Annotation[][] annotationArr, boolean z4) throws IllegalAccessException, InvocationTargetException {
        Method method;
        ArrayList arrayList;
        AbstractC38106a0 c38116h;
        AbstractC38106a0 c38133y;
        String str;
        boolean z13;
        C33652u c33652u;
        ArrayList arrayList2 = new ArrayList(typeArr.length);
        C38105a c38105a = C38105a.f163203a;
        Member member = mo122112c();
        AbstractC22676k.m65750j(member, "member");
        C33652u c33652u2 = C38105a.f163204b;
        Object obj = null;
        if (c33652u2 == null) {
            synchronized (c38105a) {
                c33652u2 = C38105a.f163204b;
                if (c33652u2 == null) {
                    Class<?> cls = member.getClass();
                    try {
                        c33652u = new C33652u(cls.getMethod("getParameters", null), AbstractC38109c.m122092d(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
                    } catch (NoSuchMethodException unused) {
                        c33652u = new C33652u(obj, obj);
                    }
                    C38105a.f163204b = c33652u;
                    c33652u2 = c33652u;
                }
            }
        }
        Method method2 = (Method) c33652u2.f140441w;
        if (method2 == null || (method = (Method) c33652u2.f140442x) == null) {
            arrayList = null;
        } else {
            Object objInvoke = method2.invoke(member, null);
            AbstractC22676k.m65748h(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr = (Object[]) objInvoke;
            arrayList = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                Object objInvoke2 = method.invoke(obj2, null);
                AbstractC22676k.m65748h(objInvoke2, "null cannot be cast to non-null type kotlin.String");
                arrayList.add((String) objInvoke2);
            }
        }
        int size = arrayList != null ? arrayList.size() - typeArr.length : 0;
        int length = typeArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            Type type = typeArr[i13];
            AbstractC22676k.m65750j(type, "type");
            boolean z14 = type instanceof Class;
            if (z14) {
                Class cls2 = (Class) type;
                if (cls2.isPrimitive()) {
                    c38133y = new C38133y(cls2);
                } else {
                    if (!(type instanceof GenericArrayType) || (z14 && ((Class) type).isArray())) {
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
            if (arrayList != null) {
                str = (String) AbstractC25265s.m74102I0(i13 + size, arrayList);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i13 + '+' + size + " (name=" + m122119d() + " type=" + c38133y + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            if (z4) {
                z13 = true;
                if (i13 != typeArr.length - 1) {
                    z13 = false;
                }
            } else {
                z13 = false;
            }
            arrayList2.add(new C38110c0(c38133y, annotationArr[i13], str, z13));
        }
        return arrayList2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC38130v) && AbstractC22676k.m65745e(mo122112c(), ((AbstractC38130v) obj).mo122112c());
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC31143m1 m122121f() {
        int modifiers = mo122112c().getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return C31134j1.f128342c;
        }
        if (Modifier.isPrivate(modifiers)) {
            return C31125g1.f128336c;
        }
        if (Modifier.isProtected(modifiers)) {
            return Modifier.isStatic(modifiers) ? C35837c.f152570c : C35836b.f152569c;
        }
        return C35835a.f152568c;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m122122g() {
        return Modifier.isAbstract(((Method) mo122112c()).getModifiers());
    }

    @Override // ma3.InterfaceC25373b
    public final Collection getAnnotations() {
        Member memberMo122112c = mo122112c();
        AbstractC22676k.m65748h(memberMo122112c, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberMo122112c).getDeclaredAnnotations();
        return declaredAnnotations != null ? AbstractC32237a.m100292f(declaredAnnotations) : C25271y.f99162w;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m122123h() {
        return Modifier.isFinal(mo122112c().getModifiers());
    }

    public final int hashCode() {
        return mo122112c().hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m122124i() {
        return Modifier.isStatic(mo122112c().getModifiers());
    }

    public final String toString() {
        return getClass().getName() + ": " + mo122112c();
    }
}
