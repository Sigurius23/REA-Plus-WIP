package p471rx;

import androidx.room.AbstractC1772c1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import p088dc.AbstractC11895b;
import p441qx.C30722l0;
import p441qx.InterfaceC30737t;
import p441qx.InterfaceC30739u;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: rx.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC31885f {

    /* JADX INFO: renamed from: a */
    public static final Set f132390a = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: b */
    public static final Type[] f132391b = new Type[0];

    /* JADX INFO: renamed from: c */
    public static final Class f132392c;

    /* JADX INFO: renamed from: d */
    public static final Class f132393d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f132393d = cls;
        f132392c = DefaultConstructorMarker.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        Collections.unmodifiableMap(linkedHashMap);
    }

    /* JADX INFO: renamed from: a */
    public static Type m99123a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C31881c(m99123a(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            if (type instanceof C31882d) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C31882d(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return type instanceof C31881c ? type : new C31881c(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType) || (type instanceof C31883e)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new C31883e(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    /* JADX INFO: renamed from: b */
    public static void m99124b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    /* JADX INFO: renamed from: c */
    public static JsonAdapter m99125c(C30722l0 c30722l0, Type type, Class cls) {
        Constructor<?> declaredConstructor;
        Object[] objArr;
        InterfaceC30737t interfaceC30737t = (InterfaceC30737t) cls.getAnnotation(InterfaceC30737t.class);
        Class<?> cls2 = null;
        if (interfaceC30737t == null || !interfaceC30737t.generateAdapter()) {
            return null;
        }
        try {
            try {
                Class<?> cls3 = Class.forName(cls.getName().replace("$", "_") + "JsonAdapter", true, cls.getClassLoader());
                try {
                    if (type instanceof ParameterizedType) {
                        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                        try {
                            declaredConstructor = cls3.getDeclaredConstructor(C30722l0.class, Type[].class);
                            objArr = new Object[]{c30722l0, actualTypeArguments};
                        } catch (NoSuchMethodException unused) {
                            declaredConstructor = cls3.getDeclaredConstructor(Type[].class);
                            objArr = new Object[]{actualTypeArguments};
                        }
                    } else {
                        try {
                            declaredConstructor = cls3.getDeclaredConstructor(C30722l0.class);
                            objArr = new Object[]{c30722l0};
                        } catch (NoSuchMethodException unused2) {
                            declaredConstructor = cls3.getDeclaredConstructor(null);
                            objArr = new Object[0];
                        }
                    }
                    declaredConstructor.setAccessible(true);
                    return ((JsonAdapter) declaredConstructor.newInstance(objArr)).nullSafe();
                } catch (NoSuchMethodException e5) {
                    e = e5;
                    cls2 = cls3;
                    if ((type instanceof ParameterizedType) || cls2.getTypeParameters().length == 0) {
                        throw new RuntimeException("Failed to find the generated JsonAdapter constructor for " + type, e);
                    }
                    throw new RuntimeException("Failed to find the generated JsonAdapter constructor for '" + type + "'. Suspiciously, the type was not parameterized but the target class '" + cls2.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", e);
                }
            } catch (NoSuchMethodException e13) {
                e = e13;
            }
        } catch (ClassNotFoundException e14) {
            throw new RuntimeException("Failed to find the generated JsonAdapter class for " + type, e14);
        } catch (IllegalAccessException e15) {
            throw new RuntimeException("Failed to access the generated JsonAdapter for " + type, e15);
        } catch (InstantiationException e16) {
            throw new RuntimeException("Failed to instantiate the generated JsonAdapter for " + type, e16);
        } catch (InvocationTargetException e17) {
            m99132j(e17);
            throw null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static Type m99126d(Type type, Class cls, Class cls2) {
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
                    return m99126d(cls.getGenericInterfaces()[i13], interfaces[i13], cls2);
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
                    return m99126d(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m99127e(Class cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    /* JADX INFO: renamed from: f */
    public static Set m99128f(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(InterfaceC30739u.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : f132390a;
    }

    /* JADX INFO: renamed from: g */
    public static JsonDataException m99129g(String str, String str2, JsonReader jsonReader) {
        String string;
        String strM16727b = jsonReader.m16727b();
        if (str2.equals(str)) {
            string = AbstractC31061c.m95640p("Required value '", str, "' missing at ", strM16727b);
        } else {
            StringBuilder sbM32001t = AbstractC11895b.m32001t("Required value '", str, "' (JSON name '", str2, "') missing at ");
            sbM32001t.append(strM16727b);
            string = sbM32001t.toString();
        }
        return new JsonDataException(string);
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    /* JADX INFO: renamed from: h */
    public static Type m99130h(Type type) {
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        if (wildcardType.getLowerBounds().length != 0) {
            return type;
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length == 1) {
            return upperBounds[0];
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX INFO: renamed from: i */
    public static Type m99131i(Type type, Class cls, Type type2, LinkedHashSet linkedHashSet) {
        Type type3;
        WildcardType wildcardType;
        Type typeM99131i;
        Type[] lowerBounds;
        TypeVariable typeVariable;
        do {
            int i13 = 0;
            if (!(type2 instanceof TypeVariable)) {
                if (type2 instanceof Class) {
                    Class cls2 = (Class) type2;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type typeM99131i2 = m99131i(type, cls, componentType, linkedHashSet);
                        return componentType == typeM99131i2 ? cls2 : new C31881c(typeM99131i2);
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type2;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type typeM99131i3 = m99131i(type, cls, genericComponentType, linkedHashSet);
                    return genericComponentType == typeM99131i3 ? genericArrayType : new C31881c(typeM99131i3);
                }
                if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type2;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type typeM99131i4 = m99131i(type, cls, ownerType, linkedHashSet);
                    boolean z4 = typeM99131i4 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i13 < length) {
                        Type typeM99131i5 = m99131i(type, cls, actualTypeArguments[i13], linkedHashSet);
                        if (typeM99131i5 != actualTypeArguments[i13]) {
                            if (!z4) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z4 = true;
                            }
                            actualTypeArguments[i13] = typeM99131i5;
                        }
                        i13++;
                    }
                    return z4 ? new C31882d(typeM99131i4, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                if (type2 instanceof WildcardType) {
                    wildcardType = (WildcardType) type2;
                    Type[] lowerBounds2 = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds2.length == 1) {
                        Type typeM99131i6 = m99131i(type, cls, lowerBounds2[0], linkedHashSet);
                        if (typeM99131i6 != lowerBounds2[0]) {
                            if (typeM99131i6 instanceof WildcardType) {
                                type3 = type2;
                                type3 = wildcardType;
                                lowerBounds = ((WildcardType) typeM99131i6).getLowerBounds();
                            } else {
                                type3 = type2;
                                type3 = wildcardType;
                                lowerBounds = new Type[]{typeM99131i6};
                            }
                            return new C31883e(new Type[]{Object.class}, lowerBounds);
                        }
                    } else if (upperBounds.length == 1 && (typeM99131i = m99131i(type, cls, upperBounds[0], linkedHashSet)) != upperBounds[0]) {
                        type3 = type2;
                        type3 = wildcardType;
                        type3 = wildcardType;
                        return AbstractC1772c1.m5381R(typeM99131i);
                    }
                }
                type3 = type2;
                type3 = wildcardType;
                type3 = wildcardType;
                type3 = type2;
                type3 = wildcardType;
                type3 = type2;
                type3 = wildcardType;
                type3 = type2;
                return type3;
            }
            typeVariable = (TypeVariable) type2;
            if (linkedHashSet.contains(typeVariable)) {
                return type2;
            }
            linkedHashSet.add(typeVariable);
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 == null) {
                type2 = typeVariable;
            } else {
                Type typeM99126d = m99126d(type, cls, cls3);
                if (typeM99126d instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    while (true) {
                        if (i13 >= typeParameters.length) {
                            throw new NoSuchElementException();
                        }
                        if (typeVariable.equals(typeParameters[i13])) {
                            type2 = ((ParameterizedType) typeM99126d).getActualTypeArguments()[i13];
                            break;
                        }
                        i13++;
                    }
                } else {
                    type2 = typeVariable;
                }
            }
        } while (type2 != typeVariable);
        return type2;
    }

    /* JADX INFO: renamed from: j */
    public static void m99132j(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        }
        if (!(targetException instanceof Error)) {
            throw new RuntimeException(targetException);
        }
        throw ((Error) targetException);
    }

    /* JADX INFO: renamed from: k */
    public static String m99133k(Type type, Set set) {
        String str;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb4.append(str);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: l */
    public static String m99134l(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX INFO: renamed from: m */
    public static JsonDataException m99135m(String str, String str2, JsonReader jsonReader) {
        String string;
        String strM16727b = jsonReader.m16727b();
        if (str2.equals(str)) {
            string = AbstractC31061c.m95640p("Non-null value '", str, "' was null at ", strM16727b);
        } else {
            StringBuilder sbM32001t = AbstractC11895b.m32001t("Non-null value '", str, "' (JSON name '", str2, "') was null at ");
            sbM32001t.append(strM16727b);
            string = sbM32001t.toString();
        }
        return new JsonDataException(string);
    }
}
