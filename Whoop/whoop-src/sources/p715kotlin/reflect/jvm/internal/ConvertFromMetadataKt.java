package p715kotlin.reflect.jvm.internal;

import aa3.AbstractC0614e0;
import aa3.AbstractC0638m0;
import aa3.AbstractC0645p;
import aa3.AbstractC0650r0;
import aa3.C0602a0;
import aa3.C0606b1;
import aa3.C0611d0;
import aa3.C0615e1;
import aa3.C0644o0;
import aa3.C0646p0;
import aa3.C0648q0;
import aa3.C0651s;
import aa3.C0653t;
import aa3.C0655u;
import aa3.C0657v;
import aa3.EnumC0621g1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ca3.C4377d;
import ca3.InterfaceC4381h;
import com.google.crypto.tink.internal.C5101l0;
import ea3.C12936g;
import j93.C21462d0;
import j93.EnumC21464e0;
import j93.InterfaceC21456a0;
import j93.InterfaceC21458b0;
import j93.InterfaceC21461d;
import j93.InterfaceC21463e;
import j93.InterfaceC21467g;
import j93.InterfaceC21484q;
import j93.InterfaceC21493z;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p000.AbstractC11266d;
import p249jc.AbstractC21598x;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import q83.AbstractC30060g;
import q93.C30080d;
import r80.AbstractC31061c;
import sb3.AbstractC32350a;
import se.AbstractC32411b;
import va3.C35845c;
import va3.C35847e;
import wb3.AbstractC37051a;
import wb3.C37062l;
import wb3.C37067q;
import x43.AbstractC37978j;
import x93.AbstractC38109c;
import xb3.AbstractC38176k;
import xb3.C38180o;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0098\u0001\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u0000*\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t*\u00020\u00072\n\u0010\b\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\u0014\u001a\u00020\u0013*\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a+\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a1\u0010!\u001a\u00020 *\u00020\u001c2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002¢\u0006\u0004\b!\u0010\"\u001a3\u0010$\u001a\u00020\u001e*\u00020#2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002¢\u0006\u0004\b$\u0010%\u001a\u0013\u0010(\u001a\u00020'*\u00020&H\u0002¢\u0006\u0004\b(\u0010)\u001a!\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010+*\u00020\u001c2\u0006\u0010*\u001a\u00020 H\u0002¢\u0006\u0004\b,\u0010-\u001a\u001b\u00100\u001a\u00020/*\u00020.2\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b0\u00101\u001a1\u00106\u001a\u000205*\u0002022\n\u00103\u001a\u00060\u0000j\u0002`\u00012\b\u00104\u001a\u0004\u0018\u00010\u00002\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b6\u00107¨\u00069²\u0006\u0012\u00108\u001a\b\u0012\u0004\u0012\u00020\u00110\u001d8\nX\u008a\u0084\u0002"}, m65681d2 = {"", "Lkotlin/reflect/jvm/internal/impl/km/ClassName;", "Lva3/c;", "toClassId", "(Ljava/lang/String;)Lva3/c;", "toNonLocalSimpleName", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/lang/ClassLoader;", "name", "Lj93/d;", "loadKClass", "(Ljava/lang/ClassLoader;Ljava/lang/String;)Lj93/d;", "Laa3/b1;", "classLoader", "Lkotlin/reflect/jvm/internal/TypeParameterTable;", "typeParameterTable", "Lkotlin/Function0;", "Ljava/lang/reflect/Type;", "computeJavaType", "Lj93/a0;", "toKType", "(Laa3/b1;Ljava/lang/ClassLoader;Lkotlin/reflect/jvm/internal/TypeParameterTable;Lc93/a;)Lj93/a0;", "Lwb3/a;", "computeType", "", "index", "convertTypeArgumentToJavaType", "(Lc93/a;I)Lc93/a;", "Laa3/r0;", "", "Lj93/d0;", "typeArguments", "Lj93/e;", "toClassifier", "(Laa3/r0;Ljava/lang/ClassLoader;Lkotlin/reflect/jvm/internal/TypeParameterTable;Ljava/util/List;)Lj93/e;", "Laa3/e1;", "toKTypeProjection", "(Laa3/e1;Ljava/lang/ClassLoader;Lkotlin/reflect/jvm/internal/TypeParameterTable;Lc93/a;)Lj93/d0;", "Laa3/g1;", "Lj93/e0;", "toKVariance", "(Laa3/g1;)Lj93/e0;", "kClassifier", "Lwb3/l;", "toMutableCollectionKClass", "(Laa3/r0;Lj93/e;)Lwb3/l;", "Laa3/s;", "", "toAnnotation", "(Laa3/s;Ljava/lang/ClassLoader;)Ljava/lang/annotation/Annotation;", "Laa3/m0;", "annotationClassName", "argumentName", "", "toAnnotationArgument", "(Laa3/m0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Object;", "javaParameterizedTypeArguments", "kotlin-reflection"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ConvertFromMetadataKt {

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC0621g1.values().length];
            try {
                EnumC0621g1 enumC0621g1 = EnumC0621g1.f2183w;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EnumC0621g1 enumC0621g2 = EnumC0621g1.f2183w;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EnumC0621g1 enumC0621g3 = EnumC0621g1.f2183w;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final InterfaceC4339a convertTypeArgumentToJavaType(final InterfaceC4339a computeType, final int i13) {
        AbstractC22676k.m65750j(computeType, "computeType");
        return new InterfaceC4339a(computeType, i13) { // from class: kotlin.reflect.jvm.internal.ConvertFromMetadataKt$$Lambda$3
            private final InterfaceC4339a arg$0;
            private final int arg$1;

            {
                this.arg$0 = computeType;
                this.arg$1 = i13;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return ConvertFromMetadataKt.convertTypeArgumentToJavaType$lambda$0(this.arg$0, this.arg$1);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type convertTypeArgumentToJavaType$lambda$0(InterfaceC4339a interfaceC4339a, int i13) {
        final AbstractC37051a abstractC37051a = (AbstractC37051a) interfaceC4339a.invoke();
        InterfaceC23462h interfaceC23462hM92087G = AbstractC30060g.m92087G(EnumC23463i.f92934x, new InterfaceC4339a(abstractC37051a) { // from class: kotlin.reflect.jvm.internal.ConvertFromMetadataKt$$Lambda$5
            private final AbstractC37051a arg$0;

            {
                this.arg$0 = abstractC37051a;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return ConvertFromMetadataKt.convertTypeArgumentToJavaType$lambda$0$0(this.arg$0);
            }
        });
        ReflectProperties.LazySoftVal lazySoftVal = abstractC37051a.f158537w;
        Type type = lazySoftVal != null ? (Type) lazySoftVal.invoke() : null;
        if (type instanceof Class) {
            Class cls = (Class) type;
            Class<?> componentType = cls.isArray() ? cls.getComponentType() : Object.class;
            AbstractC22676k.m65747g(componentType);
            return componentType;
        }
        if (type instanceof GenericArrayType) {
            if (i13 == 0) {
                Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                AbstractC22676k.m65747g(genericComponentType);
                return genericComponentType;
            }
            throw new KotlinReflectionInternalError("Array type has been queried for a non-0th argument: " + abstractC37051a);
        }
        if (!(type instanceof ParameterizedType)) {
            throw new KotlinReflectionInternalError("Non-generic type has been queried for arguments: " + abstractC37051a);
        }
        Type type2 = convertTypeArgumentToJavaType$lambda$0$1(interfaceC23462hM92087G).get(i13);
        if (!(type2 instanceof WildcardType)) {
            return type2;
        }
        WildcardType wildcardType = (WildcardType) type2;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        AbstractC22676k.m65749i(lowerBounds, "getLowerBounds(...)");
        Type type3 = (Type) AbstractC25260n.m74079t0(lowerBounds);
        if (type3 == null) {
            Type[] upperBounds = wildcardType.getUpperBounds();
            AbstractC22676k.m65749i(upperBounds, "getUpperBounds(...)");
            type3 = (Type) AbstractC25260n.m74078s0(upperBounds);
        }
        AbstractC22676k.m65747g(type3);
        return type3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List convertTypeArgumentToJavaType$lambda$0$0(AbstractC37051a abstractC37051a) {
        ReflectProperties.LazySoftVal lazySoftVal = abstractC37051a.f158537w;
        Type type = lazySoftVal != null ? (Type) lazySoftVal.invoke() : null;
        AbstractC22676k.m65747g(type);
        return AbstractC38109c.m122091c(type);
    }

    private static final List<Type> convertTypeArgumentToJavaType$lambda$0$1(InterfaceC23462h interfaceC23462h) {
        return (List) interfaceC23462h.getValue();
    }

    public static final InterfaceC21461d loadKClass(ClassLoader classLoader, String name) {
        AbstractC22676k.m65750j(classLoader, "<this>");
        AbstractC22676k.m65750j(name, "name");
        Class clsLoadClass$default = UtilKt.loadClass$default(classLoader, toClassId(name), 0, 2, null);
        if (clsLoadClass$default != null) {
            return AbstractC21598x.m60666V(clsLoadClass$default);
        }
        return null;
    }

    private static final Annotation toAnnotation(C0651s c0651s, ClassLoader classLoader) {
        String str = c0651s.f2275a;
        Class clsLoadClass$default = UtilKt.loadClass$default(classLoader, toClassId(str), 0, 2, null);
        if (clsLoadClass$default == null) {
            throw new KotlinReflectionInternalError(AbstractC11266d.m30461o("Annotation class not found: ", str));
        }
        Map map = c0651s.f2276b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), toAnnotationArgument((AbstractC0638m0) entry.getValue(), str, (String) entry.getKey(), classLoader));
        }
        return (Annotation) AbstractC32411b.m101113y(clsLoadClass$default, linkedHashMap);
    }

    private static final Object toAnnotationArgument(AbstractC0638m0 abstractC0638m0, String str, String str2, ClassLoader classLoader) {
        List parameters;
        InterfaceC21456a0 type;
        if (abstractC0638m0 instanceof C0653t) {
            return toAnnotation(((C0653t) abstractC0638m0).f2282a, classLoader);
        }
        int i13 = 0;
        if (abstractC0638m0 instanceof C0655u) {
            C0655u c0655u = (C0655u) abstractC0638m0;
            String str3 = c0655u.f2283a;
            InterfaceC21461d interfaceC21461dLoadKClass = loadKClass(classLoader, str3);
            if (interfaceC21461dLoadKClass == null) {
                throw new KotlinReflectionInternalError(AbstractC11266d.m30461o("Unresolved class: ", str3));
            }
            Class<?> clsM60663S = AbstractC21598x.m60663S(interfaceC21461dLoadKClass);
            int i14 = c0655u.f2284b;
            while (i13 < i14) {
                clsM60663S = UtilKt.createArrayType(clsM60663S);
                i13++;
            }
            return clsM60663S;
        }
        Object obj = null;
        if (!(abstractC0638m0 instanceof C0657v)) {
            if (!(abstractC0638m0 instanceof C0602a0)) {
                if (!(abstractC0638m0 instanceof C0611d0)) {
                    if (abstractC0638m0 instanceof AbstractC0614e0) {
                        return ((AbstractC0614e0) abstractC0638m0).mo1614a();
                    }
                    throw new NoWhenBranchMatchedException();
                }
                String str4 = ((C0611d0) abstractC0638m0).f2166a;
                Class clsLoadClass$default = UtilKt.loadClass$default(classLoader, toClassId(str4), 0, 2, null);
                if (clsLoadClass$default != null) {
                    return clsLoadClass$default;
                }
                throw new KotlinReflectionInternalError(AbstractC11266d.m30461o("Unresolved class: ", str4));
            }
            C0602a0 c0602a0 = (C0602a0) abstractC0638m0;
            String str5 = c0602a0.f2147b;
            String str6 = c0602a0.f2146a;
            Class clsLoadClass$default2 = UtilKt.loadClass$default(classLoader, toClassId(str6), 0, 2, null);
            if (clsLoadClass$default2 == null) {
                throw new KotlinReflectionInternalError(AbstractC11266d.m30461o("Unresolved enum class: ", str6));
            }
            Object[] enumConstants = clsLoadClass$default2.getEnumConstants();
            AbstractC22676k.m65749i(enumConstants, "getEnumConstants(...)");
            int length = enumConstants.length;
            boolean z4 = false;
            Object obj2 = null;
            while (true) {
                if (i13 >= length) {
                    if (!z4) {
                        break;
                    }
                    obj = obj2;
                    break;
                }
                Object obj3 = enumConstants[i13];
                AbstractC22676k.m65748h(obj3, "null cannot be cast to non-null type kotlin.Enum<*>");
                if (AbstractC22676k.m65745e(((Enum) obj3).name(), str5)) {
                    if (z4) {
                        break;
                    }
                    z4 = true;
                    obj2 = obj3;
                }
                i13++;
            }
            if (obj != null) {
                return obj;
            }
            throw new KotlinReflectionInternalError("Unresolved enum entry: " + str6 + '.' + str5);
        }
        InterfaceC21461d interfaceC21461dLoadKClass2 = loadKClass(classLoader, str);
        if (interfaceC21461dLoadKClass2 != null) {
            if (!AbstractC21598x.m60663S(interfaceC21461dLoadKClass2).isAnnotation()) {
                interfaceC21461dLoadKClass2 = null;
            }
            if (interfaceC21461dLoadKClass2 != null) {
                InterfaceC21467g interfaceC21467g = (InterfaceC21467g) AbstractC25265s.m74144q1(interfaceC21461dLoadKClass2.getConstructors());
                if (interfaceC21467g != null && (parameters = interfaceC21467g.getParameters()) != null) {
                    Iterator it = parameters.iterator();
                    boolean z13 = false;
                    Object obj4 = null;
                    while (true) {
                        if (!it.hasNext()) {
                            if (!z13) {
                                break;
                            }
                            break;
                        }
                        Object next = it.next();
                        if (AbstractC22676k.m65745e(((InterfaceC21484q) next).getName(), str2)) {
                            if (!z13) {
                                z13 = true;
                                obj4 = next;
                            }
                        }
                        obj4 = null;
                        break;
                    }
                    InterfaceC21484q interfaceC21484q = (InterfaceC21484q) obj4;
                    if (interfaceC21484q != null && (type = interfaceC21484q.getType()) != null) {
                        InterfaceC21463e classifier = type.getClassifier();
                        InterfaceC21461d interfaceC21461d = classifier instanceof InterfaceC21461d ? (InterfaceC21461d) classifier : null;
                        if (interfaceC21461d == null) {
                            throw new KotlinReflectionInternalError("Array parameter type is not a class: " + type);
                        }
                        Class clsM60663S2 = AbstractC21598x.m60663S(interfaceC21461d);
                        Class<?> componentType = AbstractC22676k.m65745e(clsM60663S2.getComponentType(), InterfaceC21461d.class) ? Class.class : clsM60663S2.getComponentType();
                        ArrayList arrayList = ((C0657v) abstractC0638m0).f2287a;
                        Object objNewInstance = Array.newInstance(componentType, arrayList.size());
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            Array.set(objNewInstance, i13, toAnnotationArgument((AbstractC0638m0) it3.next(), str, null, classLoader));
                            i13++;
                        }
                        AbstractC22676k.m65747g(objNewInstance);
                        return objNewInstance;
                    }
                }
                throw new KotlinReflectionInternalError(AbstractC31061c.m95640p("No parameter ", str2, " found in annotation constructor of ", str));
            }
        }
        throw new KotlinReflectionInternalError(AbstractC11266d.m30461o("Not an annotation class: ", str));
    }

    public static final C35845c toClassId(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        boolean zM125930O = AbstractC39421y.m125930O(str, ".", false);
        if (zM125930O) {
            str = str.substring(1);
            AbstractC22676k.m65749i(str, "substring(...)");
        }
        return new C35845c(new C35847e(AbstractC39421y.m125927L(AbstractC39414r.m125864J0('/', str, ""), '/', '.')), new C35847e(AbstractC39414r.m125860F0('/', str, str)), zM125930O);
    }

    private static final InterfaceC21463e toClassifier(AbstractC0650r0 abstractC0650r0, ClassLoader classLoader, TypeParameterTable typeParameterTable, List<C21462d0> list) {
        if (!(abstractC0650r0 instanceof C0644o0)) {
            if (abstractC0650r0 instanceof C0646p0) {
                return new KTypeAliasImpl(toClassId(((C0646p0) abstractC0650r0).f2262a).m113773a());
            }
            if (!(abstractC0650r0 instanceof C0648q0)) {
                throw new NoWhenBranchMatchedException();
            }
            int i13 = ((C0648q0) abstractC0650r0).f2273a;
            InterfaceC21458b0 interfaceC21458b0 = typeParameterTable.get(i13);
            if (interfaceC21458b0 != null) {
                return interfaceC21458b0;
            }
            throw new KotlinReflectionInternalError("Type parameter not found: " + i13);
        }
        String str = ((C0644o0) abstractC0650r0).f2249a;
        if (AbstractC22676k.m65745e(str, "kotlin/Array")) {
            InterfaceC21456a0 any = ((C21462d0) AbstractC25265s.m74142p1(list)).f82425b;
            if (any == null) {
                any = StandardKTypes.INSTANCE.getANY();
            }
            return AbstractC21598x.m60666V(UtilKt.createArrayType(AbstractC21598x.m60663S(AbstractC37978j.m121622E(any))));
        }
        InterfaceC21461d interfaceC21461dLoadKClass = loadKClass(classLoader, str);
        if (interfaceC21461dLoadKClass != null) {
            return interfaceC21461dLoadKClass;
        }
        throw new KotlinReflectionInternalError("Class not found: " + str);
    }

    public static final InterfaceC21456a0 toKType(C0606b1 c0606b1, final ClassLoader classLoader, final TypeParameterTable typeParameterTable, final InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(c0606b1, "<this>");
        AbstractC22676k.m65750j(classLoader, "classLoader");
        AbstractC22676k.m65750j(typeParameterTable, "typeParameterTable");
        final C22669g0 c22669g0 = new C22669g0();
        List listM122276E = AbstractC38176k.m122276E(new C38180o(AbstractC38176k.m122285u(AbstractC38176k.m122288x(c0606b1, new Function1() { // from class: kotlin.reflect.jvm.internal.ConvertFromMetadataKt$$Lambda$0
            @Override // p715kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return ConvertFromMetadataKt.toKType$lambda$0((C0606b1) obj);
            }
        }), new Function1() { // from class: kotlin.reflect.jvm.internal.ConvertFromMetadataKt$$Lambda$1
            @Override // p715kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return ConvertFromMetadataKt.toKType$lambda$1((C0606b1) obj);
            }
        }), new InterfaceC4351m(classLoader, typeParameterTable, interfaceC4339a, c22669g0) { // from class: kotlin.reflect.jvm.internal.ConvertFromMetadataKt$$Lambda$2
            private final ClassLoader arg$0;
            private final TypeParameterTable arg$1;
            private final InterfaceC4339a arg$2;
            private final C22669g0 arg$3;

            {
                this.arg$0 = classLoader;
                this.arg$1 = typeParameterTable;
                this.arg$2 = interfaceC4339a;
                this.arg$3 = c22669g0;
            }

            @Override // c93.InterfaceC4351m
            public Object invoke(Object obj, Object obj2) {
                return ConvertFromMetadataKt.toKType$lambda$2(this.arg$0, this.arg$1, this.arg$2, this.arg$3, ((Number) obj).intValue(), (C0615e1) obj2);
            }
        }, 2));
        InterfaceC21463e classifier = toClassifier(c0606b1.m1615a(), classLoader, typeParameterTable, listM122276E);
        boolean zM16043W = AbstractC0645p.f2258i.m16043W(c0606b1, AbstractC0645p.f2250a[46]);
        C4377d type = C12936g.f44667c;
        AbstractC22676k.m65750j(type, "type");
        ArrayList arrayList = ((C12936g) ((InterfaceC4381h) AbstractC34132o.m107863H(c0606b1.f2158g, type))).f44669b;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(toAnnotation((C0651s) it.next(), classLoader));
        }
        C0606b1 c0606b2 = c0606b1.f2155d;
        InterfaceC21456a0 kType$default = c0606b2 != null ? toKType$default(c0606b2, classLoader, typeParameterTable, null, 4, null) : null;
        C5101l0 c5101l0 = AbstractC0645p.f2260k;
        InterfaceC21493z[] interfaceC21493zArr = AbstractC0645p.f2250a;
        boolean zM16043W2 = c5101l0.m16043W(c0606b1, interfaceC21493zArr[48]);
        AbstractC0650r0 abstractC0650r0M1615a = c0606b1.m1615a();
        C0644o0 c0644o0 = abstractC0650r0M1615a instanceof C0644o0 ? (C0644o0) abstractC0650r0M1615a : null;
        C37067q c37067q = new C37067q(classifier, listM122276E, zM16043W, arrayList2, kType$default, zM16043W2, AbstractC22676k.m65745e(c0644o0 != null ? c0644o0.f2249a : null, "kotlin/Nothing"), AbstractC0645p.f2259j.m16043W(c0606b1, interfaceC21493zArr[47]), toMutableCollectionKClass(c0606b1.m1615a(), classifier), interfaceC4339a);
        c22669g0.f89336w = c37067q;
        return c37067q;
    }

    public static /* synthetic */ InterfaceC21456a0 toKType$default(C0606b1 c0606b1, ClassLoader classLoader, TypeParameterTable typeParameterTable, InterfaceC4339a interfaceC4339a, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            interfaceC4339a = null;
        }
        return toKType(c0606b1, classLoader, typeParameterTable, interfaceC4339a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0606b1 toKType$lambda$0(C0606b1 it) {
        AbstractC22676k.m65750j(it, "it");
        return it.f2156e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable toKType$lambda$1(C0606b1 it) {
        AbstractC22676k.m65750j(it, "it");
        return it.f2154c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C21462d0 toKType$lambda$2(ClassLoader classLoader, TypeParameterTable typeParameterTable, InterfaceC4339a interfaceC4339a, final C22669g0 c22669g0, int i13, C0615e1 typeArgument) {
        AbstractC22676k.m65750j(typeArgument, "typeArgument");
        return toKTypeProjection(typeArgument, classLoader, typeParameterTable, interfaceC4339a == null ? null : convertTypeArgumentToJavaType(new InterfaceC4339a(c22669g0) { // from class: kotlin.reflect.jvm.internal.ConvertFromMetadataKt$$Lambda$4
            private final C22669g0 arg$0;

            {
                this.arg$0 = c22669g0;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return ConvertFromMetadataKt.toKType$lambda$2$0(this.arg$0);
            }
        }, i13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC37051a toKType$lambda$2$0(C22669g0 c22669g0) {
        Object obj = c22669g0.f89336w;
        if (obj != null) {
            return (C37067q) obj;
        }
        AbstractC22676k.m65757q("result");
        throw null;
    }

    private static final C21462d0 toKTypeProjection(C0615e1 c0615e1, ClassLoader classLoader, TypeParameterTable typeParameterTable, InterfaceC4339a interfaceC4339a) {
        if (AbstractC22676k.m65745e(c0615e1, C0615e1.f2174c)) {
            C21462d0 c21462d0 = C21462d0.f82423c;
            return C21462d0.f82423c;
        }
        EnumC0621g1 enumC0621g1 = c0615e1.f2175a;
        EnumC21464e0 kVariance = enumC0621g1 != null ? toKVariance(enumC0621g1) : null;
        C0606b1 c0606b1 = c0615e1.f2176b;
        return new C21462d0(kVariance, c0606b1 != null ? toKType(c0606b1, classLoader, typeParameterTable, interfaceC4339a) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnumC21464e0 toKVariance(EnumC0621g1 enumC0621g1) {
        int iOrdinal = enumC0621g1.ordinal();
        if (iOrdinal == 0) {
            return EnumC21464e0.f82426w;
        }
        if (iOrdinal == 1) {
            return EnumC21464e0.f82427x;
        }
        if (iOrdinal == 2) {
            return EnumC21464e0.f82428y;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final C37062l toMutableCollectionKClass(AbstractC0650r0 abstractC0650r0, InterfaceC21463e interfaceC21463e) {
        String str;
        C35845c classId;
        C0644o0 c0644o0 = abstractC0650r0 instanceof C0644o0 ? (C0644o0) abstractC0650r0 : null;
        if (c0644o0 == null || (str = c0644o0.f2249a) == null || (classId = toClassId(str)) == null) {
            return null;
        }
        String str2 = C30080d.f122759a;
        if (!C30080d.f122770l.containsKey(classId)) {
            return null;
        }
        C35847e c35847eM113773a = classId.m113773a();
        AbstractC22676k.m65748h(interfaceC21463e, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        return AbstractC32350a.m100702i((InterfaceC21461d) interfaceC21463e, c35847eM113773a);
    }

    public static final String toNonLocalSimpleName(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        if (AbstractC39421y.m125930O(str, ".", false)) {
            throw new IllegalArgumentException("Local class is not supported: ".concat(str).toString());
        }
        String strM125860F0 = AbstractC39414r.m125860F0('/', str, str);
        return AbstractC39414r.m125860F0('.', strM125860F0, strM125860F0);
    }
}
