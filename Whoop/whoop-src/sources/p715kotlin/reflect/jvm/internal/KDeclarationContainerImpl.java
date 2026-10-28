package p715kotlin.reflect.jvm.internal;

import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cb3.AbstractC4393e;
import ih0.AbstractC18489d0;
import j93.InterfaceC21493z;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import p088dc.AbstractC11895b;
import p481s6.AbstractC32229a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22693x;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.jvm.internal.InterfaceC22662d;
import r93.AbstractC31150q;
import r93.AbstractC31152r;
import r93.InterfaceC31129i;
import r93.InterfaceC31132j;
import r93.InterfaceC31145n0;
import r93.InterfaceC31162w;
import ua3.AbstractC34722b;
import va3.AbstractC35846d;
import va3.C35845c;
import va3.C35850h;
import w93.C36972e;
import x93.AbstractC38109c;
import xa3.C38148i;
import ya3.AbstractC39365h;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import yb3.C39408l;
import yb3.C39410n;
import yb3.C39412p;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u0000 D2\u00020\u0001:\u0003EFDB\u0007¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\r\u001a\u0004\u0018\u00010\f*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00072\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\u000f\u001a\u0004\u0018\u00010\f*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00072\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0012*\u0006\u0012\u0002\b\u00030\u00042\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J;\u0010\u001a\u001a\u00020\u00192\u0010\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00152\u0010\u0010\u0017\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00112\u0006\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010 J+\u0010$\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\u0006\u001a\u00020&H&¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020+0'2\u0006\u0010\u0006\u001a\u00020&H&¢\u0006\u0004\b,\u0010*J\u0019\u0010.\u001a\u0004\u0018\u00010(2\u0006\u0010-\u001a\u00020!H&¢\u0006\u0004\b.\u0010/J\u001d\u00101\u001a\u00020(2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u0005¢\u0006\u0004\b1\u00102J\u001d\u00103\u001a\u00020+2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u0005¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005¢\u0006\u0004\b5\u00106J'\u00108\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u00107\u001a\u00020\n¢\u0006\u0004\b8\u00109J\u001b\u0010:\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\u0006\u0010\u001c\u001a\u00020\u0005¢\u0006\u0004\b:\u0010;J\u001b\u0010<\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\u0006\u0010\u001c\u001a\u00020\u0005¢\u0006\u0004\b<\u0010;R\u0018\u0010?\u001a\u0006\u0012\u0002\b\u00030\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020@0'8&X¦\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006G"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/jvm/internal/d;", "<init>", "()V", "Ljava/lang/Class;", "", "name", "", "parameterTypes", "returnType", "", "isStaticDefault", "Ljava/lang/reflect/Method;", "lookupMethod", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;", "tryGetMethod", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;", "", "Ljava/lang/reflect/Constructor;", "tryGetConstructor", "(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;", "", "result", "valueParameters", "isConstructor", "Ll83/a0;", "addParametersAndMasks", "(Ljava/util/List;Ljava/util/List;Z)V", "desc", "parseReturnType", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$FunctionJvmDescriptor;", "parseJvmDescriptor", "(Ljava/lang/String;Z)Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$FunctionJvmDescriptor;", "", "begin", "end", "parseType", "(Ljava/lang/String;II)Ljava/lang/Class;", "Lva3/h;", "", "Lr93/n0;", "getProperties", "(Lva3/h;)Ljava/util/Collection;", "Lr93/w;", "getFunctions", "index", "getLocalProperty", "(I)Lr93/n0;", "signature", "findPropertyDescriptor", "(Ljava/lang/String;Ljava/lang/String;)Lr93/n0;", "findFunctionDescriptor", "(Ljava/lang/String;Ljava/lang/String;)Lr93/w;", "findMethodBySignature", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;", "isMember", "findDefaultMethod", "(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/reflect/Method;", "findConstructorBySignature", "(Ljava/lang/String;)Ljava/lang/reflect/Constructor;", "findDefaultConstructor", "getMethodOwner", "()Ljava/lang/Class;", "methodOwner", "Lr93/j;", "getConstructorDescriptors", "()Ljava/util/Collection;", "constructorDescriptors", "Companion", "Data", "FunctionJvmDescriptor", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class KDeclarationContainerImpl implements InterfaceC22662d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Class<?> DEFAULT_CONSTRUCTOR_MARKER = DefaultConstructorMarker.class;
    private static final C39412p LOCAL_PROPERTY_SIGNATURE = new C39412p("<v#(\\d+)>");

    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u0012\u0012\u0002\b\u0003 \n*\b\u0012\u0002\b\u0003\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Companion;", "", "<init>", "()V", "Lyb3/p;", "LOCAL_PROPERTY_SIGNATURE", "Lyb3/p;", "getLOCAL_PROPERTY_SIGNATURE$kotlin_reflection", "()Lyb3/p;", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "DEFAULT_CONSTRUCTOR_MARKER", "Ljava/lang/Class;", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C39412p getLOCAL_PROPERTY_SIGNATURE$kotlin_reflection() {
            return KDeclarationContainerImpl.LOCAL_PROPERTY_SIGNATURE;
        }

        private Companion() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b¦\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;)V", "Lw93/e;", "moduleData$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getModuleData", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", "moduleData", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public abstract class Data {
        static final /* synthetic */ InterfaceC21493z[] $$delegatedProperties = {AbstractC22671h0.f89337a.property1(new C22693x(Data.class, "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", 0))};

        /* JADX INFO: renamed from: moduleData$delegate, reason: from kotlin metadata */
        private final ReflectProperties.LazySoftVal moduleData;

        public Data() {
            this.moduleData = ReflectProperties.lazySoft(new InterfaceC4339a(KDeclarationContainerImpl.this) { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$Data$$Lambda$0
                private final KDeclarationContainerImpl arg$0;

                {
                    this.arg$0 = kDeclarationContainerImpl;
                }

                @Override // c93.InterfaceC4339a
                public Object invoke() {
                    return KDeclarationContainerImpl.Data.moduleData_delegate$lambda$0(this.arg$0);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C36972e moduleData_delegate$lambda$0(KDeclarationContainerImpl kDeclarationContainerImpl) {
            return ModuleByClassLoaderKt.getOrCreateModule(kDeclarationContainerImpl.getJClass());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final C36972e getModuleData() {
            T value = this.moduleData.getValue(this, $$delegatedProperties[0]);
            AbstractC22676k.m65749i(value, "getValue(...)");
            return (C36972e) value;
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$FunctionJvmDescriptor;", "", "parameters", "", "Ljava/lang/Class;", "returnType", "<init>", "(Ljava/util/List;Ljava/lang/Class;)V", "getParameters", "()Ljava/util/List;", "getReturnType", "()Ljava/lang/Class;", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class FunctionJvmDescriptor {
        private final List<Class<?>> parameters;
        private final Class<?> returnType;

        /* JADX WARN: Multi-variable type inference failed */
        public FunctionJvmDescriptor(List<? extends Class<?>> parameters, Class<?> cls) {
            AbstractC22676k.m65750j(parameters, "parameters");
            this.parameters = parameters;
            this.returnType = cls;
        }

        public final List<Class<?>> getParameters() {
            return this.parameters;
        }

        public final Class<?> getReturnType() {
            return this.returnType;
        }
    }

    private final void addParametersAndMasks(List<Class<?>> result, List<? extends Class<?>> valueParameters, boolean isConstructor) {
        if (AbstractC22676k.m65745e(AbstractC25265s.m74114R0(valueParameters), DEFAULT_CONSTRUCTOR_MARKER)) {
            valueParameters = valueParameters.subList(0, valueParameters.size() - 1);
        }
        result.addAll(valueParameters);
        int size = (valueParameters.size() + 31) / 32;
        for (int i13 = 0; i13 < size; i13++) {
            Class<?> TYPE = Integer.TYPE;
            AbstractC22676k.m65749i(TYPE, "TYPE");
            result.add(TYPE);
        }
        Class<?> cls = isConstructor ? DEFAULT_CONSTRUCTOR_MARKER : Object.class;
        AbstractC22676k.m65747g(cls);
        result.add(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence findFunctionDescriptor$lambda$2(InterfaceC31162w descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return C38148i.f163320e.m122219w(descriptor) + " | " + RuntimeTypeMapper.INSTANCE.mapSignature(descriptor).get_signature();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int findPropertyDescriptor$lambda$2(AbstractC31152r abstractC31152r, AbstractC31152r abstractC31152r2) {
        Integer numM95874b = AbstractC31150q.m95874b(abstractC31152r, abstractC31152r2);
        if (numM95874b != null) {
            return numM95874b.intValue();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int findPropertyDescriptor$lambda$3(InterfaceC4351m interfaceC4351m, Object obj, Object obj2) {
        return ((Number) interfaceC4351m.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence findPropertyDescriptor$lambda$4(InterfaceC31145n0 descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return C38148i.f163320e.m122219w(descriptor) + " | " + RuntimeTypeMapper.INSTANCE.mapPropertySignature(descriptor).getString();
    }

    private final Method lookupMethod(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2, boolean z4) {
        String str2;
        Class<?>[] clsArr2;
        Class<?> cls3;
        boolean z13;
        Class<?> clsM113786k;
        if (z4) {
            clsArr[0] = cls;
        }
        Method methodTryGetMethod = tryGetMethod(cls, str, clsArr, cls2);
        if (methodTryGetMethod != null) {
            return methodTryGetMethod;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            Method methodLookupMethod = lookupMethod(superclass, str, clsArr, cls2, z4);
            str2 = str;
            clsArr2 = clsArr;
            cls3 = cls2;
            z13 = z4;
            if (methodLookupMethod != null) {
                return methodLookupMethod;
            }
        } else {
            str2 = str;
            clsArr2 = clsArr;
            cls3 = cls2;
            z13 = z4;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        AbstractC22676k.m65749i(interfaces, "getInterfaces(...)");
        for (Class<?> cls4 : interfaces) {
            AbstractC22676k.m65747g(cls4);
            Method methodLookupMethod2 = lookupMethod(cls4, str2, clsArr2, cls3, z13);
            if (methodLookupMethod2 != null) {
                return methodLookupMethod2;
            }
            if (z13 && (clsM113786k = AbstractC35846d.m113786k(AbstractC38109c.m122092d(cls4), cls4.getName().concat("$DefaultImpls"))) != null) {
                clsArr2[0] = cls4;
                Method methodTryGetMethod2 = tryGetMethod(clsM113786k, str2, clsArr2, cls3);
                if (methodTryGetMethod2 != null) {
                    return methodTryGetMethod2;
                }
            }
        }
        return null;
    }

    private final FunctionJvmDescriptor parseJvmDescriptor(String desc, boolean parseReturnType) {
        int iM125887f0;
        ArrayList arrayList = new ArrayList();
        int i13 = 1;
        while (desc.charAt(i13) != ')') {
            int i14 = i13;
            while (desc.charAt(i14) == '[') {
                i14++;
            }
            char cCharAt = desc.charAt(i14);
            if (AbstractC39414r.m125875T("VZCBSIFJD", cCharAt, false)) {
                iM125887f0 = i14 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: ".concat(desc));
                }
                iM125887f0 = AbstractC39414r.m125887f0(desc, ';', i13, false, 4) + 1;
            }
            arrayList.add(parseType(desc, i13, iM125887f0));
            i13 = iM125887f0;
        }
        return new FunctionJvmDescriptor(arrayList, parseReturnType ? parseType(desc, i13 + 1, desc.length()) : null);
    }

    private final Class<?> parseType(String desc, int begin, int end) throws ClassNotFoundException {
        char cCharAt = desc.charAt(begin);
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'L') {
            ClassLoader classLoaderM122092d = AbstractC38109c.m122092d(getJClass());
            String strSubstring = desc.substring(begin + 1, end - 1);
            AbstractC22676k.m65749i(strSubstring, "substring(...)");
            Class<?> clsLoadClass = classLoaderM122092d.loadClass(AbstractC39421y.m125927L(strSubstring, '/', '.'));
            AbstractC22676k.m65749i(clsLoadClass, "loadClass(...)");
            return clsLoadClass;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'V') {
            Class<?> TYPE = Void.TYPE;
            AbstractC22676k.m65749i(TYPE, "TYPE");
            return TYPE;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == '[') {
            return UtilKt.createArrayType(parseType(desc, begin + 1, end));
        }
        switch (cCharAt) {
            case 'B':
                return Byte.TYPE;
            case 'C':
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            default:
                throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: ".concat(desc));
        }
    }

    private final Constructor<?> tryGetConstructor(Class<?> cls, List<? extends Class<?>> list) {
        try {
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final Method tryGetMethod(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (AbstractC22676k.m65745e(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            AbstractC22676k.m65749i(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (AbstractC22676k.m65745e(method.getName(), str) && AbstractC22676k.m65745e(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
        } catch (NoSuchMethodException unused) {
        }
        return null;
    }

    public final Constructor<?> findConstructorBySignature(String desc) {
        AbstractC22676k.m65750j(desc, "desc");
        return tryGetConstructor(getJClass(), parseJvmDescriptor(desc, false).getParameters());
    }

    public final Constructor<?> findDefaultConstructor(String desc) {
        AbstractC22676k.m65750j(desc, "desc");
        Class jClass = getJClass();
        ArrayList arrayList = new ArrayList();
        addParametersAndMasks(arrayList, parseJvmDescriptor(desc, false).getParameters(), true);
        return tryGetConstructor(jClass, arrayList);
    }

    public final Method findDefaultMethod(String name, String desc, boolean isMember) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(desc, "desc");
        if (name.equals("<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (isMember) {
            arrayList.add(getJClass());
        }
        FunctionJvmDescriptor jvmDescriptor = parseJvmDescriptor(desc, true);
        addParametersAndMasks(arrayList, jvmDescriptor.getParameters(), false);
        Class<?> methodOwner = getMethodOwner();
        String strConcat = name.concat("$default");
        Class<?>[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class<?> returnType = jvmDescriptor.getReturnType();
        AbstractC22676k.m65747g(returnType);
        return lookupMethod(methodOwner, strConcat, clsArr, returnType, isMember);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00b3  */
    public final InterfaceC31162w findFunctionDescriptor(String name, String signature) {
        List functions;
        ArrayList arrayList;
        String strAsString;
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(signature, "signature");
        if (name.equals("<init>")) {
            functions = AbstractC25265s.m74093D1(getConstructorDescriptors());
            arrayList = new ArrayList();
            for (Object obj : functions) {
                InterfaceC31132j interfaceC31132j = (InterfaceC31132j) obj;
                if (interfaceC31132j.mo95869O()) {
                    InterfaceC31129i interfaceC31129iMo60581g = interfaceC31132j.mo60581g();
                    AbstractC22676k.m65749i(interfaceC31129iMo60581g, "getContainingDeclaration(...)");
                    if (AbstractC39365h.m125539c(interfaceC31129iMo60581g)) {
                        String strAsString2 = RuntimeTypeMapper.INSTANCE.mapSignature(interfaceC31132j).get_signature();
                        if (!AbstractC39421y.m125930O(strAsString2, "constructor-impl", false) || !AbstractC39421y.m125920E(strAsString2, ")V", false)) {
                            throw new IllegalArgumentException(("Invalid signature of " + interfaceC31132j + ": " + strAsString2).toString());
                        }
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(AbstractC39414r.m125900s0(strAsString2, "V"));
                        InterfaceC31129i interfaceC31129iMo60581g2 = interfaceC31132j.mo60581g();
                        AbstractC22676k.m65749i(interfaceC31129iMo60581g2, "getContainingDeclaration(...)");
                        C35845c c35845cM13808f = AbstractC4393e.m13808f(interfaceC31129iMo60581g2);
                        AbstractC22676k.m65747g(c35845cM13808f);
                        sb4.append(AbstractC34722b.m109647b(c35845cM13808f.m113774b()));
                        strAsString = sb4.toString();
                    } else {
                        strAsString = RuntimeTypeMapper.INSTANCE.mapSignature(interfaceC31132j).get_signature();
                    }
                } else {
                    strAsString = RuntimeTypeMapper.INSTANCE.mapSignature(interfaceC31132j).get_signature();
                }
                if (AbstractC22676k.m65745e(strAsString, signature)) {
                    arrayList.add(obj);
                }
            }
        } else {
            functions = getFunctions(C35850h.m113814e(name));
            arrayList = new ArrayList();
            for (Object obj2 : functions) {
                if (AbstractC22676k.m65745e(RuntimeTypeMapper.INSTANCE.mapSignature((InterfaceC31162w) obj2).get_signature(), signature)) {
                    arrayList.add(obj2);
                }
            }
        }
        if (arrayList.size() == 1) {
            return (InterfaceC31162w) AbstractC25265s.m74142p1(arrayList);
        }
        String strM74110N0 = AbstractC25265s.m74110N0(functions, "\n", null, null, new Function1() { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$$Lambda$3
            @Override // p715kotlin.jvm.functions.Function1
            public Object invoke(Object obj3) {
                return KDeclarationContainerImpl.findFunctionDescriptor$lambda$2((InterfaceC31162w) obj3);
            }
        }, 30);
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Function '", name, "' (JVM signature: ", signature, ") not resolved in ");
        sbM32001t.append(this);
        sbM32001t.append(':');
        sbM32001t.append(strM74110N0.length() == 0 ? " no members found" : "\n".concat(strM74110N0));
        throw new KotlinReflectionInternalError(sbM32001t.toString());
    }

    public final Method findMethodBySignature(String name, String desc) {
        Method methodLookupMethod;
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(desc, "desc");
        if (name.equals("<init>")) {
            return null;
        }
        FunctionJvmDescriptor jvmDescriptor = parseJvmDescriptor(desc, true);
        Class<?>[] clsArr = (Class[]) jvmDescriptor.getParameters().toArray(new Class[0]);
        Class<?> returnType = jvmDescriptor.getReturnType();
        AbstractC22676k.m65747g(returnType);
        Method methodLookupMethod2 = lookupMethod(getMethodOwner(), name, clsArr, returnType, false);
        if (methodLookupMethod2 != null) {
            return methodLookupMethod2;
        }
        if (!getMethodOwner().isInterface() || (methodLookupMethod = lookupMethod(Object.class, name, clsArr, returnType, false)) == null) {
            return null;
        }
        return methodLookupMethod;
    }

    public final InterfaceC31145n0 findPropertyDescriptor(String name, String signature) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(signature, "signature");
        C39410n c39410nM125850d = LOCAL_PROPERTY_SIGNATURE.m125850d(signature);
        if (c39410nM125850d != null) {
            String str = (String) ((C39408l) ((C39410n) AbstractC32229a.m100259f(c39410nM125850d).m108298o()).m125843a()).get(1);
            InterfaceC31145n0 localProperty = getLocalProperty(Integer.parseInt(str));
            if (localProperty != null) {
                return localProperty;
            }
            StringBuilder sbM53375p = AbstractC18489d0.m53375p("Local property #", str, " not found in ");
            sbM53375p.append(getJClass());
            throw new KotlinReflectionInternalError(sbM53375p.toString());
        }
        Collection<InterfaceC31145n0> properties = getProperties(C35850h.m113814e(name));
        ArrayList arrayList = new ArrayList();
        for (Object obj : properties) {
            if (AbstractC22676k.m65745e(RuntimeTypeMapper.INSTANCE.mapPropertySignature((InterfaceC31145n0) obj).getString(), signature)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            StringBuilder sbM32001t = AbstractC11895b.m32001t("Property '", name, "' (JVM signature: ", signature, ") not resolved in ");
            sbM32001t.append(this);
            throw new KotlinReflectionInternalError(sbM32001t.toString());
        }
        if (arrayList.size() == 1) {
            return (InterfaceC31145n0) AbstractC25265s.m74142p1(arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            AbstractC31152r visibility = ((InterfaceC31145n0) obj2).getVisibility();
            Object arrayList2 = linkedHashMap.get(visibility);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(visibility, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        final KDeclarationContainerImpl$$Lambda$0 kDeclarationContainerImpl$$Lambda$0 = new InterfaceC4351m() { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$$Lambda$0
            @Override // c93.InterfaceC4351m
            public Object invoke(Object obj3, Object obj4) {
                return Integer.valueOf(KDeclarationContainerImpl.findPropertyDescriptor$lambda$2((AbstractC31152r) obj3, (AbstractC31152r) obj4));
            }
        };
        Collection collectionValues = AbstractC25247g0.m74006o0(linkedHashMap, new Comparator(kDeclarationContainerImpl$$Lambda$0) { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$$Lambda$1
            private final InterfaceC4351m arg$0;

            {
                this.arg$0 = kDeclarationContainerImpl$$Lambda$0;
            }

            @Override // java.util.Comparator
            public int compare(Object obj3, Object obj4) {
                return KDeclarationContainerImpl.findPropertyDescriptor$lambda$3(this.arg$0, obj3, obj4);
            }
        }).values();
        AbstractC22676k.m65749i(collectionValues, "<get-values>(...)");
        List list = (List) AbstractC25265s.m74111O0(collectionValues);
        if (list.size() == 1) {
            return (InterfaceC31145n0) AbstractC25265s.m74096F0(list);
        }
        String strM74110N0 = AbstractC25265s.m74110N0(getProperties(C35850h.m113814e(name)), "\n", null, null, new Function1() { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$$Lambda$2
            @Override // p715kotlin.jvm.functions.Function1
            public Object invoke(Object obj3) {
                return KDeclarationContainerImpl.findPropertyDescriptor$lambda$4((InterfaceC31145n0) obj3);
            }
        }, 30);
        StringBuilder sbM32001t2 = AbstractC11895b.m32001t("Property '", name, "' (JVM signature: ", signature, ") not resolved in ");
        sbM32001t2.append(this);
        sbM32001t2.append(':');
        sbM32001t2.append(strM74110N0.length() == 0 ? " no members found" : "\n".concat(strM74110N0));
        throw new KotlinReflectionInternalError(sbM32001t2.toString());
    }

    public abstract Collection<InterfaceC31132j> getConstructorDescriptors();

    public abstract Collection<InterfaceC31162w> getFunctions(C35850h name);

    @Override // p715kotlin.jvm.internal.InterfaceC22662d
    public abstract /* synthetic */ Class getJClass();

    public abstract InterfaceC31145n0 getLocalProperty(int index);

    public abstract /* synthetic */ Collection getMembers();

    public Class<?> getMethodOwner() {
        Class jClass = getJClass();
        List list = AbstractC38109c.f163211a;
        AbstractC22676k.m65750j(jClass, "<this>");
        Class<?> cls = (Class) AbstractC38109c.f163213c.get(jClass);
        return cls == null ? getJClass() : cls;
    }

    public abstract Collection<InterfaceC31145n0> getProperties(C35850h name);
}
