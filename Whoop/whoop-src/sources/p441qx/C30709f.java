package p441qx;

import androidx.room.AbstractC1772c1;
import com.squareup.moshi.JsonAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import p031b9.AbstractC2875y;
import p471rx.AbstractC31885f;
import p507tx.AbstractC34235f;

/* JADX INFO: renamed from: qx.f */
/* JADX INFO: loaded from: classes.dex */
public final class C30709f implements InterfaceC30735s {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f126453a;

    public /* synthetic */ C30709f(int i13) {
        this.f126453a = i13;
    }

    /* JADX INFO: renamed from: a */
    public static void m94383a(Type type, Class cls) {
        Class<?> clsM5407z = AbstractC1772c1.m5407z(type);
        if (cls.isAssignableFrom(clsM5407z)) {
            throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + clsM5407z.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
        }
    }

    @Override // p441qx.InterfaceC30735s
    public final JsonAdapter create(Type type, Set set, C30722l0 c30722l0) {
        InterfaceC30731q interfaceC30731q;
        Class clsM5407z;
        switch (this.f126453a) {
            case 0:
                Type genericComponentType = type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : type instanceof Class ? ((Class) type).getComponentType() : null;
                if (genericComponentType != null && set.isEmpty()) {
                    return new C30711g(AbstractC1772c1.m5407z(genericComponentType), c30722l0.m94400c(genericComponentType, AbstractC31885f.f132390a, null)).nullSafe();
                }
                return null;
            case 1:
                if ((type instanceof Class) || (type instanceof ParameterizedType)) {
                    Class clsM5407z2 = AbstractC1772c1.m5407z(type);
                    if (!clsM5407z2.isInterface() && !clsM5407z2.isEnum() && set.isEmpty()) {
                        if (AbstractC31885f.m99127e(clsM5407z2)) {
                            m94383a(type, List.class);
                            m94383a(type, Set.class);
                            m94383a(type, Map.class);
                            m94383a(type, Collection.class);
                            String str = "Platform " + clsM5407z2;
                            if (type instanceof ParameterizedType) {
                                str = str + " in " + type;
                            }
                            throw new IllegalArgumentException(AbstractC2875y.m8299l(str, " requires explicit JsonAdapter to be registered"));
                        }
                        if (clsM5407z2.isAnonymousClass()) {
                            throw new IllegalArgumentException("Cannot serialize anonymous class ".concat(clsM5407z2.getName()));
                        }
                        if (clsM5407z2.isLocalClass()) {
                            throw new IllegalArgumentException("Cannot serialize local class ".concat(clsM5407z2.getName()));
                        }
                        if (clsM5407z2.getEnclosingClass() != null && !Modifier.isStatic(clsM5407z2.getModifiers())) {
                            throw new IllegalArgumentException("Cannot serialize non-static nested class ".concat(clsM5407z2.getName()));
                        }
                        if (Modifier.isAbstract(clsM5407z2.getModifiers())) {
                            throw new IllegalArgumentException("Cannot serialize abstract class ".concat(clsM5407z2.getName()));
                        }
                        Class<? extends Annotation> cls = AbstractC31885f.f132393d;
                        if (cls != null && clsM5407z2.isAnnotationPresent(cls)) {
                            throw new IllegalArgumentException("Cannot serialize Kotlin type " + clsM5407z2.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
                        }
                        AbstractC34235f abstractC34235fM108205L = AbstractC34235f.m108205L(clsM5407z2);
                        TreeMap treeMap = new TreeMap();
                        while (type != Object.class) {
                            Class clsM5407z3 = AbstractC1772c1.m5407z(type);
                            boolean zM99127e = AbstractC31885f.m99127e(clsM5407z3);
                            for (Field field : clsM5407z3.getDeclaredFields()) {
                                int modifiers = field.getModifiers();
                                if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers) && ((Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || !zM99127e) && ((interfaceC30731q = (InterfaceC30731q) field.getAnnotation(InterfaceC30731q.class)) == null || !interfaceC30731q.ignore()))) {
                                    Type typeM99131i = AbstractC31885f.m99131i(type, clsM5407z3, field.getGenericType(), new LinkedHashSet());
                                    Set setM99128f = AbstractC31885f.m99128f(field.getAnnotations());
                                    String name = field.getName();
                                    JsonAdapter jsonAdapterM94400c = c30722l0.m94400c(typeM99131i, setM99128f, name);
                                    field.setAccessible(true);
                                    if (interfaceC30731q != null) {
                                        String strName = interfaceC30731q.name();
                                        if (!WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR.equals(strName)) {
                                            name = strName;
                                        }
                                    }
                                    C30719k c30719k = (C30719k) treeMap.put(name, new C30719k(name, field, jsonAdapterM94400c));
                                    if (c30719k != null) {
                                        throw new IllegalArgumentException("Conflicting fields:\n    " + c30719k.f126495b + "\n    " + field);
                                    }
                                }
                            }
                            Class clsM5407z4 = AbstractC1772c1.m5407z(type);
                            type = AbstractC31885f.m99131i(type, clsM5407z4, clsM5407z4.getGenericSuperclass(), new LinkedHashSet());
                        }
                        return new C30721l(abstractC34235fM108205L, treeMap).nullSafe();
                    }
                }
                return null;
            case 2:
                Class clsM5407z5 = AbstractC1772c1.m5407z(type);
                if (!set.isEmpty()) {
                    return null;
                }
                if (clsM5407z5 == List.class || clsM5407z5 == Collection.class) {
                    return new C30723m(c30722l0.m94400c(AbstractC1772c1.m5392j(type), AbstractC31885f.f132390a, null)).nullSafe();
                }
                if (clsM5407z5 == Set.class) {
                    return new C30725n(c30722l0.m94400c(AbstractC1772c1.m5392j(type), AbstractC31885f.f132390a, null)).nullSafe();
                }
                return null;
            case 3:
                if (!set.isEmpty() || (clsM5407z = AbstractC1772c1.m5407z(type)) != Map.class) {
                    return null;
                }
                Type[] typeArrM5368E = AbstractC1772c1.m5368E(type, clsM5407z);
                return new C30711g(c30722l0, typeArrM5368E[0], typeArrM5368E[1]).nullSafe();
            case 4:
                return null;
            default:
                if (set.isEmpty()) {
                    if (type == Boolean.TYPE) {
                        return AbstractC30736s0.f126531b;
                    }
                    if (type == Byte.TYPE) {
                        return AbstractC30736s0.f126532c;
                    }
                    if (type == Character.TYPE) {
                        return AbstractC30736s0.f126533d;
                    }
                    if (type == Double.TYPE) {
                        return AbstractC30736s0.f126534e;
                    }
                    if (type == Float.TYPE) {
                        return AbstractC30736s0.f126535f;
                    }
                    if (type == Integer.TYPE) {
                        return AbstractC30736s0.f126536g;
                    }
                    if (type == Long.TYPE) {
                        return AbstractC30736s0.f126537h;
                    }
                    if (type == Short.TYPE) {
                        return AbstractC30736s0.f126538i;
                    }
                    if (type == Boolean.class) {
                        return AbstractC30736s0.f126531b.nullSafe();
                    }
                    if (type == Byte.class) {
                        return AbstractC30736s0.f126532c.nullSafe();
                    }
                    if (type == Character.class) {
                        return AbstractC30736s0.f126533d.nullSafe();
                    }
                    if (type == Double.class) {
                        return AbstractC30736s0.f126534e.nullSafe();
                    }
                    if (type == Float.class) {
                        return AbstractC30736s0.f126535f.nullSafe();
                    }
                    if (type == Integer.class) {
                        return AbstractC30736s0.f126536g.nullSafe();
                    }
                    if (type == Long.class) {
                        return AbstractC30736s0.f126537h.nullSafe();
                    }
                    if (type == Short.class) {
                        return AbstractC30736s0.f126538i.nullSafe();
                    }
                    if (type == String.class) {
                        return AbstractC30736s0.f126539j.nullSafe();
                    }
                    if (type == Object.class) {
                        return new C30734r0(c30722l0).nullSafe();
                    }
                    Class clsM5407z6 = AbstractC1772c1.m5407z(type);
                    JsonAdapter jsonAdapterM99125c = AbstractC31885f.m99125c(c30722l0, type, clsM5407z6);
                    if (jsonAdapterM99125c != null) {
                        return jsonAdapterM99125c;
                    }
                    if (clsM5407z6.isEnum()) {
                        return new C30732q0(clsM5407z6).nullSafe();
                    }
                }
                return null;
        }
    }
}
