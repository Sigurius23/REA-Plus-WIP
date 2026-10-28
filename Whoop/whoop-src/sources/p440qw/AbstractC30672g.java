package p440qw;

import io.getstream.chat.android.client.ChatClient;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: qw.g */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC30672g {

    /* JADX INFO: renamed from: a */
    public static final Type[] f126216a = new Type[0];

    /* JADX INFO: renamed from: a */
    public static Type m94265a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C30669d(m94265a(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C30670e(parameterizedType.getOwnerType(), (Class) parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new C30669d(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new C30671f(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    /* JADX INFO: renamed from: b */
    public static void m94266b(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m94267c(Type type) {
        m94266b(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    /* JADX INFO: renamed from: d */
    public static void m94268d(String str) {
        if (str.length() <= 10000) {
            return;
        }
        throw new NumberFormatException("Number string too large: " + str.substring(0, 30) + "...");
    }

    /* JADX INFO: renamed from: e */
    public static boolean m94269e(Type type, Type type2) {
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
            return Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m94269e(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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
        return Objects.equals(typeVariable.getGenericDeclaration(), typeVariable2.getGenericDeclaration()) && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* JADX INFO: renamed from: f */
    public static void m94270f(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw AbstractC11266d.m30454h(it);
        }
    }

    /* JADX INFO: renamed from: g */
    public static Type m94271g(Type type, Class cls, Class cls2) {
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
                    return m94271g(cls.getGenericInterfaces()[i13], interfaces[i13], cls2);
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
                    return m94271g(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX INFO: renamed from: h */
    public static Class m94272h(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            m94266b(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) m94272h(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m94272h(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* JADX INFO: renamed from: i */
    public static BigDecimal m94273i(String str) {
        m94268d(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < ChatClient.RESOLVE_DEPENDENCY_TIMEOUT) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:41:0x0081  */
    /* JADX WARN: Code duplicated, block: B:43:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x0097  */
    /* JADX WARN: Code duplicated, block: B:47:0x009d  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:66:0x0101  */
    /* JADX WARN: Code duplicated, block: B:68:0x0105  */
    /* JADX WARN: Code duplicated, block: B:69:0x010c  */
    /* JADX WARN: Code duplicated, block: B:71:0x011d  */
    /* JADX WARN: Code duplicated, block: B:77:0x012e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0135  */
    /* JADX WARN: Code duplicated, block: B:93:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v3, types: [qw.f] */
    /* JADX WARN: Type inference failed for: r12v4, types: [qw.f] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX INFO: renamed from: j */
    public static Type m94274j(Type type, Class cls, Type type2, HashMap map) {
        Type[] lowerBounds;
        Type[] upperBounds;
        Type typeM94274j;
        Type[] upperBounds2;
        Type typeM94274j2;
        Type[] lowerBounds2;
        boolean zEquals;
        int length;
        Type[] typeArr;
        boolean z4;
        Type c30670e;
        Type typeM94274j3;
        Type genericComponentType;
        Type typeM94274j4;
        TypeVariable typeVariable;
        TypeVariable typeVariable2 = null;
        do {
            int i13 = 0;
            if (!(type2 instanceof TypeVariable)) {
                if (!(type2 instanceof Class)) {
                    if (type2 instanceof GenericArrayType) {
                        if (type2 instanceof ParameterizedType) {
                            if (type2 instanceof WildcardType) {
                                break;
                            }
                            type2 = (WildcardType) type2;
                            lowerBounds = type2.getLowerBounds();
                            upperBounds = type2.getUpperBounds();
                            if (lowerBounds.length == 1) {
                                if (upperBounds.length != 1) {
                                    break;
                                }
                                if (typeM94274j instanceof WildcardType) {
                                    upperBounds2 = ((WildcardType) typeM94274j).getUpperBounds();
                                } else {
                                    upperBounds2 = new Type[]{typeM94274j};
                                }
                                type2 = new C30671f(upperBounds2, f126216a);
                                break;
                            }
                            typeM94274j2 = m94274j(type, cls, lowerBounds[0], map);
                            if (typeM94274j2 != lowerBounds[0]) {
                                break;
                            }
                            if (typeM94274j2 instanceof WildcardType) {
                                lowerBounds2 = ((WildcardType) typeM94274j2).getLowerBounds();
                            } else {
                                lowerBounds2 = new Type[]{typeM94274j2};
                            }
                            type2 = new C30671f(new Type[]{Object.class}, lowerBounds2);
                            break;
                        }
                        type2 = (ParameterizedType) type2;
                        Type ownerType = type2.getOwnerType();
                        Type typeM94274j5 = m94274j(type, cls, ownerType, map);
                        zEquals = Objects.equals(typeM94274j5, ownerType);
                        Type[] actualTypeArguments = type2.getActualTypeArguments();
                        length = actualTypeArguments.length;
                        typeArr = actualTypeArguments;
                        z4 = false;
                        while (i13 < length) {
                            typeM94274j3 = m94274j(type, cls, typeArr[i13], map);
                            if (Objects.equals(typeM94274j3, typeArr[i13])) {
                                if (!z4) {
                                    typeArr = (Type[]) typeArr.clone();
                                    z4 = true;
                                }
                                typeArr[i13] = typeM94274j3;
                            }
                            i13++;
                        }
                        if (!zEquals) {
                        }
                        c30670e = new C30670e(typeM94274j5, (Class) type2.getRawType(), typeArr);
                        type2 = c30670e;
                        break;
                    }
                    type2 = (GenericArrayType) type2;
                    genericComponentType = type2.getGenericComponentType();
                    typeM94274j4 = m94274j(type, cls, genericComponentType, map);
                    if (Objects.equals(genericComponentType, typeM94274j4)) {
                        c30670e = new C30669d(typeM94274j4);
                        type2 = c30670e;
                        break;
                    }
                    break;
                }
                Class cls2 = (Class) type2;
                if (!cls2.isArray()) {
                    if (type2 instanceof GenericArrayType) {
                        if (type2 instanceof ParameterizedType) {
                            if (type2 instanceof WildcardType) {
                                break;
                            }
                            type2 = (WildcardType) type2;
                            lowerBounds = type2.getLowerBounds();
                            upperBounds = type2.getUpperBounds();
                            if (lowerBounds.length == 1) {
                                if (upperBounds.length != 1 && (typeM94274j = m94274j(type, cls, upperBounds[0], map)) != upperBounds[0]) {
                                    if (typeM94274j instanceof WildcardType) {
                                        upperBounds2 = ((WildcardType) typeM94274j).getUpperBounds();
                                    } else {
                                        upperBounds2 = new Type[]{typeM94274j};
                                    }
                                    type2 = new C30671f(upperBounds2, f126216a);
                                    break;
                                }
                                break;
                                break;
                            }
                            typeM94274j2 = m94274j(type, cls, lowerBounds[0], map);
                            if (typeM94274j2 != lowerBounds[0]) {
                                break;
                            }
                            if (typeM94274j2 instanceof WildcardType) {
                                lowerBounds2 = ((WildcardType) typeM94274j2).getLowerBounds();
                            } else {
                                lowerBounds2 = new Type[]{typeM94274j2};
                            }
                            type2 = new C30671f(new Type[]{Object.class}, lowerBounds2);
                            break;
                        }
                        type2 = (ParameterizedType) type2;
                        Type ownerType2 = type2.getOwnerType();
                        Type typeM94274j6 = m94274j(type, cls, ownerType2, map);
                        zEquals = Objects.equals(typeM94274j6, ownerType2);
                        Type[] actualTypeArguments2 = type2.getActualTypeArguments();
                        length = actualTypeArguments2.length;
                        typeArr = actualTypeArguments2;
                        z4 = false;
                        while (i13 < length) {
                            typeM94274j3 = m94274j(type, cls, typeArr[i13], map);
                            if (Objects.equals(typeM94274j3, typeArr[i13])) {
                                if (!z4) {
                                    typeArr = (Type[]) typeArr.clone();
                                    z4 = true;
                                }
                                typeArr[i13] = typeM94274j3;
                            }
                            i13++;
                        }
                        if (!zEquals && !z4) {
                            break;
                        }
                        c30670e = new C30670e(typeM94274j6, (Class) type2.getRawType(), typeArr);
                        type2 = c30670e;
                        break;
                    }
                    type2 = (GenericArrayType) type2;
                    genericComponentType = type2.getGenericComponentType();
                    typeM94274j4 = m94274j(type, cls, genericComponentType, map);
                    if (Objects.equals(genericComponentType, typeM94274j4)) {
                        break;
                    }
                    c30670e = new C30669d(typeM94274j4);
                    type2 = c30670e;
                    break;
                }
                Class<?> componentType = cls2.getComponentType();
                Type typeM94274j7 = m94274j(type, cls, componentType, map);
                if (!Objects.equals(componentType, typeM94274j7)) {
                    c30670e = new C30669d(typeM94274j7);
                    type2 = c30670e;
                    break;
                }
                type2 = cls2;
                break;
            }
            typeVariable = (TypeVariable) type2;
            Type type3 = (Type) map.get(typeVariable);
            Class cls3 = Void.TYPE;
            if (type3 != null) {
                return type3 == cls3 ? type2 : type3;
            }
            map.put(typeVariable, cls3);
            if (typeVariable2 == null) {
                typeVariable2 = typeVariable;
            }
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls4 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls4 == null) {
                type2 = typeVariable;
            } else {
                Type typeM94271g = m94271g(type, cls, cls4);
                if (typeM94271g instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls4.getTypeParameters();
                    int length2 = typeParameters.length;
                    while (true) {
                        if (i13 >= length2) {
                            throw new NoSuchElementException();
                        }
                        if (typeVariable.equals(typeParameters[i13])) {
                            type2 = ((ParameterizedType) typeM94271g).getActualTypeArguments()[i13];
                            break;
                        }
                        i13++;
                    }
                } else {
                    type2 = typeVariable;
                }
            }
        } while (type2 != typeVariable);
        if (typeVariable2 != null) {
            map.put(typeVariable2, type2);
        }
        return type2;
    }

    /* JADX INFO: renamed from: k */
    public static String m94275k(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX INFO: renamed from: l */
    public static Class m94276l(Class cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        return cls == Void.TYPE ? Void.class : cls;
    }
}
