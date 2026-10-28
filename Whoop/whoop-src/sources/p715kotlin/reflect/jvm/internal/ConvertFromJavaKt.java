package p715kotlin.reflect.jvm.internal;

import c93.InterfaceC4339a;
import j93.C21462d0;
import j93.EnumC21464e0;
import j93.InterfaceC21456a0;
import j93.InterfaceC21458b0;
import j93.InterfaceC21461d;
import j93.InterfaceC21463e;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import p249jc.AbstractC21598x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q93.C30080d;
import sb3.AbstractC32350a;
import va3.C35847e;
import va3.C35848f;
import wb3.AbstractC37051a;
import wb3.AbstractC37056f;
import wb3.C37059i;
import wb3.C37067q;
import x43.AbstractC37978j;
import xb3.AbstractC38176k;
import xb3.InterfaceC38174i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\n\u001a\u00020\t*\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aE\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u00072\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a3\u0010\u001a\u001a\u00020\t2\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00182\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a!\u0010\u001c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000f*\u0006\u0012\u0002\b\u00030\u0018H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0019\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000f*\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a+\u0010!\u001a\u00020\u0010*\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0002¢\u0006\u0004\b!\u0010\"\u001a/\u0010#\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00022\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0002¢\u0006\u0004\b#\u0010$\u001a%\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f*\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00020%H\u0000¢\u0006\u0004\b&\u0010'\u001a\u001b\u0010*\u001a\u00020)*\u00020\u00152\u0006\u0010(\u001a\u00020\u0000H\u0002¢\u0006\u0004\b*\u0010+\"\u001c\u0010/\u001a\u00020,*\u0006\u0012\u0002\b\u00030\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, m65681d2 = {"Ljava/lang/reflect/Type;", "", "Ljava/lang/reflect/TypeVariable;", "Lj93/b0;", "knownTypeParameters", "Lkotlin/reflect/jvm/internal/TypeNullability;", "nullability", "", "replaceNonArrayArgumentsWithStarProjections", "Lj93/a0;", "toKType", "(Ljava/lang/reflect/Type;Ljava/util/Map;Lkotlin/reflect/jvm/internal/TypeNullability;Z)Lj93/a0;", "type", "Lj93/e;", "classifier", "", "Lj93/d0;", "arguments", "isMarkedNullable", "Lj93/d;", "mutableCollectionClass", "Lwb3/q;", "createJavaSimpleType", "(Ljava/lang/reflect/Type;Lj93/e;Ljava/util/List;ZLj93/d;)Lwb3/q;", "Ljava/lang/Class;", "klass", "createRawJavaType", "(Ljava/lang/Class;Ljava/util/Map;)Lj93/a0;", "allTypeParameters", "(Ljava/lang/Class;)Ljava/util/List;", "Ljava/lang/reflect/ParameterizedType;", "collectAllArguments", "(Ljava/lang/reflect/ParameterizedType;)Ljava/util/List;", "toKTypeProjection", "(Ljava/lang/reflect/Type;Ljava/util/Map;)Lj93/d0;", "findKTypeParameterInContainer", "(Ljava/lang/reflect/TypeVariable;Ljava/util/Map;)Lj93/b0;", "", "toKTypeParameters", "([Ljava/lang/reflect/TypeVariable;)Ljava/util/List;", "javaType", "Lwb3/i;", "toFlexibleArrayElementVarianceType", "(Lwb3/q;Ljava/lang/reflect/Type;)Lwb3/i;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "getKotlinContainer", "(Ljava/lang/reflect/TypeVariable;)Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "kotlinContainer", "kotlin-reflection"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ConvertFromJavaKt {

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TypeNullability.values().length];
            try {
                iArr[TypeNullability.NOT_NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TypeNullability.NULLABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final List<TypeVariable<?>> allTypeParameters(Class<?> cls) {
        AbstractC22676k.m65750j(cls, "<this>");
        return AbstractC38176k.m122276E(AbstractC38176k.m122284t(AbstractC38176k.m122288x(cls, new Function1() { // from class: kotlin.reflect.jvm.internal.ConvertFromJavaKt$$Lambda$5
            @Override // p715kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return ConvertFromJavaKt.allTypeParameters$lambda$0((Class) obj);
            }
        }), new Function1() { // from class: kotlin.reflect.jvm.internal.ConvertFromJavaKt$$Lambda$6
            @Override // p715kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return ConvertFromJavaKt.allTypeParameters$lambda$1((Class) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Class allTypeParameters$lambda$0(Class it) {
        AbstractC22676k.m65750j(it, "it");
        if (Modifier.isStatic(it.getModifiers())) {
            return null;
        }
        return it.getDeclaringClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC38174i allTypeParameters$lambda$1(Class it) {
        AbstractC22676k.m65750j(it, "it");
        TypeVariable[] typeParameters = it.getTypeParameters();
        AbstractC22676k.m65749i(typeParameters, "getTypeParameters(...)");
        return AbstractC25260n.m74050X(typeParameters);
    }

    private static final List<Type> collectAllArguments(ParameterizedType parameterizedType) {
        return AbstractC38176k.m122276E(AbstractC38176k.m122285u(AbstractC38176k.m122288x(parameterizedType, new Function1() { // from class: kotlin.reflect.jvm.internal.ConvertFromJavaKt$$Lambda$7
            @Override // p715kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return ConvertFromJavaKt.collectAllArguments$lambda$0((ParameterizedType) obj);
            }
        }), new Function1() { // from class: kotlin.reflect.jvm.internal.ConvertFromJavaKt$$Lambda$8
            @Override // p715kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return ConvertFromJavaKt.collectAllArguments$lambda$1((ParameterizedType) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParameterizedType collectAllArguments$lambda$0(ParameterizedType it) {
        AbstractC22676k.m65750j(it, "it");
        Type ownerType = it.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            return (ParameterizedType) ownerType;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable collectAllArguments$lambda$1(ParameterizedType it) {
        AbstractC22676k.m65750j(it, "it");
        Type[] actualTypeArguments = it.getActualTypeArguments();
        AbstractC22676k.m65749i(actualTypeArguments, "getActualTypeArguments(...)");
        return AbstractC25260n.m74049W0(actualTypeArguments);
    }

    private static final C37067q createJavaSimpleType(final Type type, InterfaceC21463e interfaceC21463e, List<C21462d0> list, boolean z4, InterfaceC21461d interfaceC21461d) {
        return new C37067q(interfaceC21463e, list, z4, C25271y.f99162w, null, false, false, false, interfaceC21461d, new InterfaceC4339a(type) { // from class: kotlin.reflect.jvm.internal.ConvertFromJavaKt$$Lambda$2
            private final Type arg$0;

            {
                this.arg$0 = type;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return ConvertFromJavaKt.createJavaSimpleType$lambda$0(this.arg$0);
            }
        });
    }

    public static /* synthetic */ C37067q createJavaSimpleType$default(Type type, InterfaceC21463e interfaceC21463e, List list, boolean z4, InterfaceC21461d interfaceC21461d, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            interfaceC21461d = null;
        }
        return createJavaSimpleType(type, interfaceC21463e, list, z4, interfaceC21461d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type createJavaSimpleType$lambda$0(Type type) {
        return type;
    }

    private static final InterfaceC21456a0 createRawJavaType(final Class<?> cls, Map<TypeVariable<?>, ? extends InterfaceC21458b0> map) {
        InterfaceC21461d interfaceC21461dM60666V = AbstractC21598x.m60666V(cls);
        List<TypeVariable<?>> listAllTypeParameters = allTypeParameters(cls);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listAllTypeParameters, 10));
        Iterator<T> it = listAllTypeParameters.iterator();
        while (it.hasNext()) {
            Type[] bounds = ((TypeVariable) AbstractC38176k.m122290z(AbstractC38176k.m122288x((TypeVariable) it.next(), new Function1() { // from class: kotlin.reflect.jvm.internal.ConvertFromJavaKt$$Lambda$3
                @Override // p715kotlin.jvm.functions.Function1
                public Object invoke(Object obj) {
                    return ConvertFromJavaKt.createRawJavaType$lambda$0$0((TypeVariable) obj);
                }
            }))).getBounds();
            AbstractC22676k.m65749i(bounds, "getBounds(...)");
            Type type = (Type) AbstractC25260n.m74078s0(bounds);
            C21462d0 c21462d0 = C21462d0.f82423c;
            AbstractC22676k.m65747g(type);
            Map<TypeVariable<?>, ? extends InterfaceC21458b0> map2 = map;
            arrayList.add(AbstractC37978j.m121626I(toKType$default(type, map2, null, true, 2, null)));
            map = map2;
        }
        C37067q lowerBound = createJavaSimpleType$default(cls, interfaceC21461dM60666V, arrayList, false, null, 16, null);
        InterfaceC21461d interfaceC21461dM60666V2 = AbstractC21598x.m60666V(cls);
        List<TypeVariable<?>> listAllTypeParameters2 = allTypeParameters(cls);
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listAllTypeParameters2, 10));
        Iterator<T> it3 = listAllTypeParameters2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(C21462d0.f82423c);
        }
        C37067q upperBound = createJavaSimpleType$default(cls, interfaceC21461dM60666V2, arrayList2, true, null, 16, null);
        InterfaceC4339a interfaceC4339a = new InterfaceC4339a(cls) { // from class: kotlin.reflect.jvm.internal.ConvertFromJavaKt$$Lambda$4
            private final Class arg$0;

            {
                this.arg$0 = cls;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return ConvertFromJavaKt.createRawJavaType$lambda$2(this.arg$0);
            }
        };
        AbstractC22676k.m65750j(lowerBound, "lowerBound");
        AbstractC22676k.m65750j(upperBound, "upperBound");
        return lowerBound.equals(upperBound) ? lowerBound : new C37059i(lowerBound, upperBound, true, interfaceC4339a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TypeVariable createRawJavaType$lambda$0$0(TypeVariable it) {
        AbstractC22676k.m65750j(it, "it");
        Type[] bounds = it.getBounds();
        AbstractC22676k.m65749i(bounds, "getBounds(...)");
        Object objM74078s0 = AbstractC25260n.m74078s0(bounds);
        if (objM74078s0 instanceof TypeVariable) {
            return (TypeVariable) objM74078s0;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type createRawJavaType$lambda$2(Class cls) {
        return cls;
    }

    private static final InterfaceC21458b0 findKTypeParameterInContainer(TypeVariable<?> typeVariable, Map<TypeVariable<?>, ? extends InterfaceC21458b0> map) {
        InterfaceC21458b0 interfaceC21458b0 = map.get(typeVariable);
        if (interfaceC21458b0 != null) {
            return interfaceC21458b0;
        }
        Iterator<T> it = getKotlinContainer(typeVariable).getTypeParameters().iterator();
        Object obj = null;
        boolean z4 = false;
        Object obj2 = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z4) {
                    break;
                }
                obj = obj2;
                break;
            }
            Object next = it.next();
            if (AbstractC22676k.m65745e(((InterfaceC21458b0) next).getName(), typeVariable.getName())) {
                if (z4) {
                    break;
                }
                z4 = true;
                obj2 = next;
            }
        }
        InterfaceC21458b0 interfaceC21458b1 = (InterfaceC21458b0) obj;
        if (interfaceC21458b1 != null) {
            return interfaceC21458b1;
        }
        throw new KotlinReflectionInternalError("Type parameter " + typeVariable.getName() + " is not found in " + getKotlinContainer(typeVariable));
    }

    private static final KTypeParameterOwnerImpl getKotlinContainer(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            InterfaceC21461d interfaceC21461dM60666V = AbstractC21598x.m60666V((Class) genericDeclaration);
            AbstractC22676k.m65748h(interfaceC21461dM60666V, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            return (KClassImpl) interfaceC21461dM60666V;
        }
        throw new KotlinReflectionInternalError("Non-class container of a type parameter is not supported: " + genericDeclaration + " (" + typeVariable + ')');
    }

    private static final C37059i toFlexibleArrayElementVarianceType(C37067q c37067q, final Type type) {
        InterfaceC21463e interfaceC21463e = c37067q.f158579x;
        List<C21462d0> list = c37067q.f158580y;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (C21462d0 c21462d0 : list) {
            InterfaceC21456a0 interfaceC21456a0 = c21462d0.f82425b;
            if (interfaceC21456a0 != null) {
                C21462d0 c21462d1 = C21462d0.f82423c;
                c21462d0 = new C21462d0(EnumC21464e0.f82428y, interfaceC21456a0);
            }
            arrayList.add(c21462d0);
        }
        C37067q upperBound = createJavaSimpleType$default(type, interfaceC21463e, arrayList, true, null, 16, null);
        InterfaceC4339a interfaceC4339a = new InterfaceC4339a(type) { // from class: kotlin.reflect.jvm.internal.ConvertFromJavaKt$$Lambda$9
            private final Type arg$0;

            {
                this.arg$0 = type;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return ConvertFromJavaKt.toFlexibleArrayElementVarianceType$lambda$1(this.arg$0);
            }
        };
        AbstractC22676k.m65750j(upperBound, "upperBound");
        boolean zEquals = c37067q.equals(upperBound);
        Object c37059i = c37067q;
        if (!zEquals) {
            c37059i = new C37059i(c37067q, upperBound, false, interfaceC4339a);
        }
        return (C37059i) c37059i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type toFlexibleArrayElementVarianceType$lambda$1(Type type) {
        return type;
    }

    public static final InterfaceC21456a0 toKType(Type type, Map<TypeVariable<?>, ? extends InterfaceC21458b0> knownTypeParameters, TypeNullability nullability, boolean z4) {
        final Type type2;
        ArrayList arrayList;
        C37067q c37067qCreateJavaSimpleType$default;
        AbstractC37051a abstractC37051a;
        String qualifiedName;
        AbstractC22676k.m65750j(type, "<this>");
        AbstractC22676k.m65750j(knownTypeParameters, "knownTypeParameters");
        AbstractC22676k.m65750j(nullability, "nullability");
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!allTypeParameters(cls).isEmpty() && !z4) {
                return createRawJavaType(cls, knownTypeParameters);
            }
            if (cls.isArray()) {
                InterfaceC21461d interfaceC21461dM60666V = AbstractC21598x.m60666V(cls);
                Class<?> componentType = cls.getComponentType();
                AbstractC22676k.m65749i(componentType, "getComponentType(...)");
                return toFlexibleArrayElementVarianceType(createJavaSimpleType$default(type, interfaceC21461dM60666V, AbstractC37056f.m118958J(toKTypeProjection(componentType, knownTypeParameters)), false, null, 16, null), type);
            }
            InterfaceC21461d interfaceC21461dM60666V2 = AbstractC21598x.m60666V(cls);
            List<TypeVariable<?>> listAllTypeParameters = allTypeParameters(cls);
            type2 = type;
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listAllTypeParameters, 10));
            Iterator<T> it = listAllTypeParameters.iterator();
            while (it.hasNext()) {
                arrayList2.add(C21462d0.f82423c);
            }
            c37067qCreateJavaSimpleType$default = createJavaSimpleType$default(type2, interfaceC21461dM60666V2, arrayList2, false, null, 16, null);
        } else {
            type2 = type;
            if (type2 instanceof GenericArrayType) {
                Type genericComponentType = ((GenericArrayType) type2).getGenericComponentType();
                AbstractC22676k.m65749i(genericComponentType, "getGenericComponentType(...)");
                C21462d0 kTypeProjection = toKTypeProjection(genericComponentType, knownTypeParameters);
                InterfaceC21456a0 interfaceC21456a0 = kTypeProjection.f82425b;
                AbstractC22676k.m65747g(interfaceC21456a0);
                return toFlexibleArrayElementVarianceType(createJavaSimpleType$default(type2, AbstractC21598x.m60666V(UtilKt.createArrayType(AbstractC21598x.m60663S(AbstractC37978j.m121622E(interfaceC21456a0)))), AbstractC37056f.m118958J(kTypeProjection), false, null, 16, null), type2);
            }
            if (type2 instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type2;
                Type rawType = parameterizedType.getRawType();
                AbstractC22676k.m65748h(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
                InterfaceC21461d interfaceC21461dM60666V3 = AbstractC21598x.m60666V((Class) rawType);
                if (z4) {
                    List<Type> listCollectAllArguments = collectAllArguments(parameterizedType);
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(listCollectAllArguments, 10));
                    for (Type type3 : listCollectAllArguments) {
                        arrayList.add(C21462d0.f82423c);
                    }
                } else {
                    List<Type> listCollectAllArguments2 = collectAllArguments(parameterizedType);
                    ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(listCollectAllArguments2, 10));
                    Iterator<T> it3 = listCollectAllArguments2.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(toKTypeProjection((Type) it3.next(), knownTypeParameters));
                    }
                    arrayList = arrayList3;
                }
                c37067qCreateJavaSimpleType$default = createJavaSimpleType$default(type2, interfaceC21461dM60666V3, arrayList, false, null, 16, null);
            } else {
                if (!(type2 instanceof TypeVariable)) {
                    if (type2 instanceof WildcardType) {
                        throw new KotlinReflectionInternalError("Wildcard type is not possible here: " + type2);
                    }
                    throw new KotlinReflectionInternalError("Type is not supported: " + type2 + " (" + type2.getClass() + ')');
                }
                c37067qCreateJavaSimpleType$default = createJavaSimpleType$default(type2, findKTypeParameterInContainer((TypeVariable) type2, knownTypeParameters), C25271y.f99162w, false, null, 16, null);
            }
        }
        InterfaceC21463e interfaceC21463e = c37067qCreateJavaSimpleType$default.f158579x;
        C35848f c35848f = null;
        InterfaceC21461d interfaceC21461d = interfaceC21463e instanceof InterfaceC21461d ? (InterfaceC21461d) interfaceC21463e : null;
        String str = C30080d.f122759a;
        if (interfaceC21461d != null && (qualifiedName = interfaceC21461d.getQualifiedName()) != null) {
            c35848f = new C35848f(qualifiedName);
        }
        C35847e c35847eM92212h = C30080d.m92212h(c35848f);
        AbstractC37051a c37059i = c37067qCreateJavaSimpleType$default;
        c37059i = c37067qCreateJavaSimpleType$default;
        if (c35847eM92212h != null && interfaceC21461d != null) {
            C37067q lowerBound = createJavaSimpleType(type2, c37067qCreateJavaSimpleType$default.f158579x, c37067qCreateJavaSimpleType$default.f158580y, c37067qCreateJavaSimpleType$default.f158581z, AbstractC32350a.m100702i(interfaceC21461d, c35847eM92212h));
            InterfaceC4339a interfaceC4339a = new InterfaceC4339a(type2) { // from class: kotlin.reflect.jvm.internal.ConvertFromJavaKt$$Lambda$0
                private final Type arg$0;

                {
                    this.arg$0 = type2;
                }

                @Override // c93.InterfaceC4339a
                public Object invoke() {
                    return ConvertFromJavaKt.toKType$lambda$3$0(this.arg$0);
                }
            };
            AbstractC22676k.m65750j(lowerBound, "lowerBound");
            c37059i = lowerBound.equals(c37067qCreateJavaSimpleType$default) ? lowerBound : new C37059i(lowerBound, c37067qCreateJavaSimpleType$default, false, interfaceC4339a);
        }
        int i13 = WhenMappings.$EnumSwitchMapping$0[nullability.ordinal()];
        if (i13 == 1) {
            return c37059i;
        }
        if (i13 == 2) {
            return c37059i.mo118948i(true);
        }
        AbstractC37051a abstractC37051aMo118946g = c37059i.mo118946g();
        if (abstractC37051aMo118946g == null) {
            abstractC37051a = abstractC37051aMo118946g;
            abstractC37051a = c37059i;
        }
        abstractC37051a = abstractC37051aMo118946g;
        AbstractC37051a abstractC37051aMo118949j = c37059i.mo118949j();
        AbstractC37051a abstractC37051a2 = c37059i;
        if (abstractC37051aMo118949j != null) {
            abstractC37051a2 = abstractC37051aMo118949j;
        }
        AbstractC37051a abstractC37051aMo118948i = abstractC37051a2.mo118948i(true);
        return abstractC37051a.equals(abstractC37051aMo118948i) ? abstractC37051a : new C37059i(abstractC37051a, abstractC37051aMo118948i, false, new InterfaceC4339a(type2) { // from class: kotlin.reflect.jvm.internal.ConvertFromJavaKt$$Lambda$1
            private final Type arg$0;

            {
                this.arg$0 = type2;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return ConvertFromJavaKt.toKType$lambda$4(this.arg$0);
            }
        });
    }

    public static /* synthetic */ InterfaceC21456a0 toKType$default(Type type, Map map, TypeNullability typeNullability, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            typeNullability = TypeNullability.FLEXIBLE;
        }
        if ((i13 & 4) != 0) {
            z4 = false;
        }
        return toKType(type, map, typeNullability, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type toKType$lambda$3$0(Type type) {
        return type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type toKType$lambda$4(Type type) {
        return type;
    }

    public static final List<InterfaceC21458b0> toKTypeParameters(TypeVariable<?>[] typeVariableArr) {
        AbstractC22676k.m65750j(typeVariableArr, "<this>");
        int iM73988W = AbstractC25247g0.m73988W(typeVariableArr.length);
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (TypeVariable<?> typeVariable : typeVariableArr) {
            KTypeParameterOwnerImpl kotlinContainer = getKotlinContainer(typeVariable);
            String name = typeVariable.getName();
            AbstractC22676k.m65749i(name, "getName(...)");
            linkedHashMap.put(typeVariable, new KTypeParameterImpl(kotlinContainer, name, EnumC21464e0.f82426w, false));
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            TypeVariable typeVariable2 = (TypeVariable) entry.getKey();
            KTypeParameterImpl kTypeParameterImpl = (KTypeParameterImpl) entry.getValue();
            Type[] bounds = typeVariable2.getBounds();
            AbstractC22676k.m65749i(bounds, "getBounds(...)");
            ArrayList arrayList = new ArrayList(bounds.length);
            for (Type type : bounds) {
                AbstractC22676k.m65747g(type);
                arrayList.add(toKType$default(type, linkedHashMap, null, false, 6, null));
            }
            kTypeParameterImpl.setUpperBounds(arrayList);
        }
        return AbstractC25265s.m74093D1(linkedHashMap.values());
    }

    private static final C21462d0 toKTypeProjection(Type type, Map<TypeVariable<?>, ? extends InterfaceC21458b0> map) {
        if (!(type instanceof WildcardType)) {
            C21462d0 c21462d0 = C21462d0.f82423c;
            return AbstractC37978j.m121626I(toKType$default(type, map, null, false, 6, null));
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new KotlinReflectionInternalError("Wildcard types with many bounds are not supported: " + type);
        }
        if (lowerBounds.length == 1) {
            C21462d0 c21462d1 = C21462d0.f82423c;
            Object objM74037M0 = AbstractC25260n.m74037M0(lowerBounds);
            AbstractC22676k.m65749i(objM74037M0, "single(...)");
            InterfaceC21456a0 type2 = toKType$default((Type) objM74037M0, map, null, false, 6, null);
            AbstractC22676k.m65750j(type2, "type");
            return new C21462d0(EnumC21464e0.f82427x, type2);
        }
        if (upperBounds.length != 1) {
            return C21462d0.f82423c;
        }
        C21462d0 c21462d2 = C21462d0.f82423c;
        Object objM74037M1 = AbstractC25260n.m74037M0(upperBounds);
        AbstractC22676k.m65749i(objM74037M1, "single(...)");
        InterfaceC21456a0 type3 = toKType$default((Type) objM74037M1, map, null, false, 6, null);
        AbstractC22676k.m65750j(type3, "type");
        return new C21462d0(EnumC21464e0.f82428y, type3);
    }
}
