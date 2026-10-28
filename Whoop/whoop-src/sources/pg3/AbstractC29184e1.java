package pg3;

import bc3.AbstractC3050q0;
import bc3.C3033m;
import ge3.AbstractC15751g;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import p000.AbstractC11266d;
import p014aj.C0928c;
import p014aj.C0929d;
import p031b9.AbstractC2875y;
import p037bu.C3632c;
import p088dc.AbstractC11895b;
import p097ds.RunnableC12316s;
import p108e4.AbstractC12682p;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: pg3.e1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC29184e1 {

    /* JADX INFO: renamed from: a */
    public static final Type[] f118161a = new Type[0];

    /* JADX INFO: renamed from: b */
    public static boolean f118162b = true;

    /* JADX INFO: renamed from: b */
    public static final Object m88680b(InterfaceC29182e interfaceC29182e, InterfaceC30057d interfaceC30057d) {
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        c3033m.m8776u(new C29221x(interfaceC29182e, 0));
        interfaceC29182e.mo88673R0(new C0928c(c3033m, 24));
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8773r;
    }

    /* JADX INFO: renamed from: c */
    public static final Object m88681c(InterfaceC29182e interfaceC29182e, InterfaceC30057d interfaceC30057d) {
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        c3033m.m8776u(new C29221x(interfaceC29182e, 1));
        interfaceC29182e.mo88673R0(new C0929d(c3033m));
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8773r;
    }

    /* JADX INFO: renamed from: d */
    public static final Object m88682d(InterfaceC29182e interfaceC29182e, InterfaceC30057d interfaceC30057d) {
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        c3033m.m8776u(new C29221x(interfaceC29182e, 2));
        interfaceC29182e.mo88673R0(new C3632c(c3033m));
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8773r;
    }

    /* JADX INFO: renamed from: e */
    public static void m88683e(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m88684f(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m88684f(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* JADX INFO: renamed from: g */
    public static Type m88685g(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i13 = 0; i13 < length; i13++) {
                Class<?> cls3 = interfaces[i13];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i13];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m88685g(cls.getGenericInterfaces()[i13], interfaces[i13], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m88685g(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX INFO: renamed from: h */
    public static Type m88686h(int i13, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i13 >= 0 && i13 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i13];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Index ", " not in range [0,");
        sbM30466t.append(actualTypeArguments.length);
        sbM30466t.append(") for ");
        sbM30466t.append(parameterizedType);
        throw new IllegalArgumentException(sbM30466t.toString());
    }

    /* JADX INFO: renamed from: i */
    public static Class m88687i(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) m88687i(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m88687i(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    /* JADX INFO: renamed from: j */
    public static Type m88688j(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return m88694p(type, cls, m88685g(type, cls, Map.class));
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: k */
    public static boolean m88689k(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (m88689k(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return m88689k(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* JADX INFO: renamed from: l */
    public static boolean m88690l(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static IllegalArgumentException m88691m(Method method, Exception exc, String str, Object... objArr) {
        StringBuilder sbM35484d = AbstractC12682p.m35484d(String.format(str, objArr), "\n    for method ");
        sbM35484d.append(method.getDeclaringClass().getSimpleName());
        sbM35484d.append(".");
        sbM35484d.append(method.getName());
        return new IllegalArgumentException(sbM35484d.toString(), exc);
    }

    /* JADX INFO: renamed from: n */
    public static IllegalArgumentException m88692n(Method method, int i13, String str, Object... objArr) {
        return m88691m(method, null, AbstractC11895b.m31997p(str, " (", AbstractC29204o0.f118201b.mo88669c(method, i13), ")"), objArr);
    }

    /* JADX INFO: renamed from: o */
    public static IllegalArgumentException m88693o(Method method, Exception exc, int i13, String str, Object... objArr) {
        return m88691m(method, exc, AbstractC11895b.m31997p(str, " (", AbstractC29204o0.f118201b.mo88669c(method, i13), ")"), objArr);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX INFO: renamed from: p */
    public static Type m88694p(Type type, Class cls, Type type2) {
        Type type3;
        WildcardType wildcardType;
        Type typeM88694p;
        Type type4;
        Type type5 = type2;
        while (true) {
            int i13 = 0;
            if (!(type5 instanceof TypeVariable)) {
                if (type5 instanceof Class) {
                    Class cls2 = (Class) type5;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type typeM88694p2 = m88694p(type, cls, componentType);
                        return componentType == typeM88694p2 ? cls2 : new C29175b1(typeM88694p2);
                    }
                }
                if (type5 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type5;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type typeM88694p3 = m88694p(type, cls, genericComponentType);
                    return genericComponentType == typeM88694p3 ? genericArrayType : new C29175b1(typeM88694p3);
                }
                if (type5 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type5;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type typeM88694p4 = m88694p(type, cls, ownerType);
                    boolean z4 = typeM88694p4 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i13 < length) {
                        Type typeM88694p5 = m88694p(type, cls, actualTypeArguments[i13]);
                        if (typeM88694p5 != actualTypeArguments[i13]) {
                            if (!z4) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z4 = true;
                            }
                            actualTypeArguments[i13] = typeM88694p5;
                        }
                        i13++;
                    }
                    return z4 ? new C29178c1(typeM88694p4, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                if (type5 instanceof WildcardType) {
                    wildcardType = (WildcardType) type5;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type typeM88694p6 = m88694p(type, cls, lowerBounds[0]);
                        if (typeM88694p6 != lowerBounds[0]) {
                            type3 = type5;
                            type3 = wildcardType;
                            return new C29181d1(new Type[]{Object.class}, new Type[]{typeM88694p6});
                        }
                    } else if (upperBounds.length == 1 && (typeM88694p = m88694p(type, cls, upperBounds[0])) != upperBounds[0]) {
                        type3 = type5;
                        type3 = wildcardType;
                        type3 = wildcardType;
                        return new C29181d1(new Type[]{typeM88694p}, f118161a);
                    }
                }
                type3 = type5;
                type3 = wildcardType;
                type3 = wildcardType;
                type3 = type5;
                type3 = wildcardType;
                type3 = type5;
                type3 = wildcardType;
                type3 = type5;
                return type3;
            }
            TypeVariable typeVariable = (TypeVariable) type5;
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 == null) {
                type4 = typeVariable;
            } else {
                Type typeM88685g = m88685g(type, cls, cls3);
                if (typeM88685g instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    while (true) {
                        if (i13 >= typeParameters.length) {
                            throw new NoSuchElementException();
                        }
                        if (typeVariable.equals(typeParameters[i13])) {
                            type4 = ((ParameterizedType) typeM88685g).getActualTypeArguments()[i13];
                            break;
                        }
                        i13++;
                    }
                } else {
                    type4 = typeVariable;
                }
            }
            if (type4 == typeVariable) {
                return type4;
            }
            type5 = type4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: q */
    public static final void m88695q(Throwable th3, InterfaceC30057d interfaceC30057d) {
        C29223y c29223y;
        if (interfaceC30057d instanceof C29223y) {
            c29223y = (C29223y) interfaceC30057d;
            int i13 = c29223y.f118287x;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c29223y.f118287x = i13 - Integer.MIN_VALUE;
            } else {
                c29223y = new C29223y(interfaceC30057d);
            }
        } else {
            c29223y = new C29223y(interfaceC30057d);
        }
        Object obj = c29223y.f118286w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c29223y.f118287x;
        if (i14 != 0) {
            if (i14 == 1) {
                throw AbstractC2875y.m8309v(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        c29223y.f118287x = 1;
        AbstractC3050q0.f12077a.dispatch(c29223y.getContext(), new RunnableC12316s(13, c29223y, th3));
    }

    /* JADX INFO: renamed from: r */
    public static void m88696r(Throwable th3) {
        if (th3 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th3);
        }
        if (th3 instanceof ThreadDeath) {
            throw ((ThreadDeath) th3);
        }
        if (th3 instanceof LinkageError) {
            throw ((LinkageError) th3);
        }
    }

    /* JADX INFO: renamed from: s */
    public static String m88697s(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo88679a(C29212s0 c29212s0, Object obj);
}
