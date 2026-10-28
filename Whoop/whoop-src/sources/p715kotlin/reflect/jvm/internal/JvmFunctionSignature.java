package p715kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import ua3.C34725e;
import x93.AbstractC38109c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "", "<init>", "()V", "asString", "", "KotlinFunction", "KotlinConstructor", "JavaMethod", "JavaConstructor", "FakeJavaAnnotationConstructor", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class JvmFunctionSignature {

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001f\u0010\b\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "jClass", "Ljava/lang/Class;", "<init>", "(Ljava/lang/Class;)V", "getJClass", "()Ljava/lang/Class;", "methods", "", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "getMethods", "()Ljava/util/List;", "asString", "", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class FakeJavaAnnotationConstructor extends JvmFunctionSignature {
        private final Class<?> jClass;
        private final List<Method> methods;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FakeJavaAnnotationConstructor(Class<?> jClass) {
            super(null);
            AbstractC22676k.m65750j(jClass, "jClass");
            this.jClass = jClass;
            Method[] declaredMethods = jClass.getDeclaredMethods();
            AbstractC22676k.m65749i(declaredMethods, "getDeclaredMethods(...)");
            this.methods = AbstractC25260n.m74041Q0(declaredMethods, new Comparator() { // from class: kotlin.reflect.jvm.internal.JvmFunctionSignature$FakeJavaAnnotationConstructor$special$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t14, T t15) {
                    return AbstractC30060g.m92127q(((Method) t14).getName(), ((Method) t15).getName());
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence asString$lambda$0(Method method) {
            Class<?> returnType = method.getReturnType();
            AbstractC22676k.m65749i(returnType, "getReturnType(...)");
            return AbstractC38109c.m122090b(returnType);
        }

        @Override // p715kotlin.reflect.jvm.internal.JvmFunctionSignature
        /* JADX INFO: renamed from: asString */
        public String get_signature() {
            return AbstractC25265s.m74110N0(this.methods, "", "<init>(", ")V", new Function1() { // from class: kotlin.reflect.jvm.internal.JvmFunctionSignature$FakeJavaAnnotationConstructor$$Lambda$0
                @Override // p715kotlin.jvm.functions.Function1
                public Object invoke(Object obj) {
                    return JvmFunctionSignature.FakeJavaAnnotationConstructor.asString$lambda$0((Method) obj);
                }
            }, 24);
        }

        public final List<Method> getMethods() {
            return this.methods;
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "constructor", "Ljava/lang/reflect/Constructor;", "<init>", "(Ljava/lang/reflect/Constructor;)V", "getConstructor", "()Ljava/lang/reflect/Constructor;", "asString", "", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class JavaConstructor extends JvmFunctionSignature {
        private final Constructor<?> constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JavaConstructor(Constructor<?> constructor) {
            super(null);
            AbstractC22676k.m65750j(constructor, "constructor");
            this.constructor = constructor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence asString$lambda$0(Class cls) {
            AbstractC22676k.m65747g(cls);
            return AbstractC38109c.m122090b(cls);
        }

        @Override // p715kotlin.reflect.jvm.internal.JvmFunctionSignature
        /* JADX INFO: renamed from: asString */
        public String get_signature() {
            Class<?>[] parameterTypes = this.constructor.getParameterTypes();
            AbstractC22676k.m65749i(parameterTypes, "getParameterTypes(...)");
            return AbstractC25260n.m74028D0(parameterTypes, "", "<init>(", ")V", new Function1() { // from class: kotlin.reflect.jvm.internal.JvmFunctionSignature$JavaConstructor$$Lambda$0
                @Override // p715kotlin.jvm.functions.Function1
                public Object invoke(Object obj) {
                    return JvmFunctionSignature.JavaConstructor.asString$lambda$0((Class) obj);
                }
            }, 24);
        }

        public final Constructor<?> getConstructor() {
            return this.constructor;
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "method", "Ljava/lang/reflect/Method;", "<init>", "(Ljava/lang/reflect/Method;)V", "getMethod", "()Ljava/lang/reflect/Method;", "asString", "", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class JavaMethod extends JvmFunctionSignature {
        private final Method method;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JavaMethod(Method method) {
            super(null);
            AbstractC22676k.m65750j(method, "method");
            this.method = method;
        }

        @Override // p715kotlin.reflect.jvm.internal.JvmFunctionSignature
        /* JADX INFO: renamed from: asString */
        public String get_signature() {
            return RuntimeTypeMapperKt.getSignature(this.method);
        }

        public final Method getMethod() {
            return this.method;
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\u000f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u0010"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "Lua3/e;", "signature", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "", "asString", "()Ljava/lang/String;", "Lua3/e;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "_signature", "Ljava/lang/String;", "getConstructorDesc", "constructorDesc", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class KotlinConstructor extends JvmFunctionSignature {
        private final String _signature;
        private final C34725e signature;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KotlinConstructor(C34725e signature) {
            super(null);
            AbstractC22676k.m65750j(signature, "signature");
            this.signature = signature;
            this._signature = signature.mo60718j();
        }

        @Override // p715kotlin.reflect.jvm.internal.JvmFunctionSignature
        /* JADX INFO: renamed from: asString, reason: from getter */
        public String get_signature() {
            return this._signature;
        }

        public final String getConstructorDesc() {
            return this.signature.f146264y;
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\u000f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u0011\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\b¨\u0006\u0012"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "Lua3/e;", "signature", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "", "asString", "()Ljava/lang/String;", "Lua3/e;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "_signature", "Ljava/lang/String;", "getMethodName", "methodName", "getMethodDesc", "methodDesc", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class KotlinFunction extends JvmFunctionSignature {
        private final String _signature;
        private final C34725e signature;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KotlinFunction(C34725e signature) {
            super(null);
            AbstractC22676k.m65750j(signature, "signature");
            this.signature = signature;
            this._signature = signature.mo60718j();
        }

        @Override // p715kotlin.reflect.jvm.internal.JvmFunctionSignature
        /* JADX INFO: renamed from: asString, reason: from getter */
        public String get_signature() {
            return this._signature;
        }

        public final String getMethodDesc() {
            return this.signature.f146264y;
        }

        public final String getMethodName() {
            return this.signature.f146263x;
        }
    }

    public /* synthetic */ JvmFunctionSignature(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: asString */
    public abstract String get_signature();

    private JvmFunctionSignature() {
    }
}
