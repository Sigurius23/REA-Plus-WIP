package p715kotlin.reflect.jvm.internal;

import al.AbstractC0954a;
import c93.InterfaceC4339a;
import cb3.AbstractC4393e;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import j93.InterfaceC21484q;
import j93.InterfaceC21493z;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lb3.AbstractC23811y;
import m83.AbstractC25260n;
import m83.AbstractC25267u;
import m93.AbstractC25356x;
import m93.AbstractC25357y;
import m93.C25332c;
import m93.C25335d0;
import m93.C25340h;
import m93.C25341i;
import m93.C25342j;
import m93.C25351s;
import m93.C25352t;
import m93.C25353u;
import m93.C25355w;
import m93.EnumC25328a;
import m93.EnumC25330b;
import m93.InterfaceC25339g;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22660c;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22693x;
import p715kotlin.jvm.internal.InterfaceC22668g;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import r93.AbstractC31150q;
import r93.InterfaceC31107a1;
import r93.InterfaceC31111c;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import r93.InterfaceC31132j;
import r93.InterfaceC31135k;
import r93.InterfaceC31151q0;
import r93.InterfaceC31162w;
import u93.AbstractC34670d;
import u93.AbstractC34690n;
import u93.AbstractC34711x0;
import u93.C34682j;
import u93.C34709w0;
import xb3.C38170e;
import ya3.AbstractC39363f;
import ya3.AbstractC39365h;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u00020\u0005B5\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0011B+\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J#\u0010%\u001a\u0006\u0012\u0002\b\u00030$2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u0015H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020'2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b*\u0010)J5\u0010.\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030+0-2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030+2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u0015H\u0002¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u00102R\u001a\u0010\n\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b6\u00107R\u001b\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001f\u0010@\u001a\u0006\u0012\u0002\b\u00030$8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R!\u0010C\u001a\b\u0012\u0002\b\u0003\u0018\u00010$8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bA\u0010=\u001a\u0004\bB\u0010?R\u0014\u0010\t\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u001cR\u0014\u0010F\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\u001aR\u0014\u0010G\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010HR\u0014\u0010J\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010HR\u0014\u0010K\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010HR\u0014\u0010L\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010HR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u00107¨\u0006N"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKFunction;", "Lkotlin/reflect/jvm/internal/DescriptorKCallable;", "", "Lkotlin/reflect/jvm/internal/ReflectKFunction;", "Lkotlin/jvm/internal/g;", "Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "", "name", "signature", "Lr93/w;", "descriptorInitialValue", "rawBoundReceiver", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V", "descriptor", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getFunctionWithDefaultParametersForValueClassOverride", "(Lr93/w;)Lr93/w;", "Ljava/lang/reflect/Method;", "member", "useBoxedBoundReceiver", "(Ljava/lang/reflect/Method;)Z", "isCallByToValueClassMangledMethod", "Lm93/g;", "createStaticMethodCaller", "(Ljava/lang/reflect/Method;Z)Lm93/g;", "Lm93/x;", "createJvmStaticInObjectCaller", "(Ljava/lang/reflect/Method;)Lm93/x;", "createInstanceMethodCaller", "Ljava/lang/reflect/Constructor;", "isDefault", "Lm93/y;", "createConstructorCaller", "(Ljava/lang/reflect/Constructor;Lr93/w;Z)Lm93/y;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Ljava/lang/String;", "getSignature", "Ljava/lang/Object;", "getRawBoundReceiver", "()Ljava/lang/Object;", "descriptor$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "caller$delegate", "Ll83/h;", "getCaller", "()Lm93/g;", "caller", "defaultCaller$delegate", "getDefaultCaller", "defaultCaller", "getName", "getArity", "arity", "isInline", "()Z", "isExternal", "isOperator", "isInfix", "isSuspend", "getBoundReceiver", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DescriptorKFunction extends DescriptorKCallable<Object> implements InterfaceC22668g, FunctionWithAllInvokes, ReflectKFunction {
    static final /* synthetic */ InterfaceC21493z[] $$delegatedProperties = {AbstractC22671h0.f89337a.property1(new C22693x(DescriptorKFunction.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", 0))};

    /* JADX INFO: renamed from: caller$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h caller;
    private final KDeclarationContainerImpl container;

    /* JADX INFO: renamed from: defaultCaller$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h defaultCaller;

    /* JADX INFO: renamed from: descriptor$delegate, reason: from kotlin metadata */
    private final ReflectProperties.LazySoftVal descriptor;
    private final Object rawBoundReceiver;
    private final String signature;

    private DescriptorKFunction(KDeclarationContainerImpl kDeclarationContainerImpl, final String str, String str2, InterfaceC31162w interfaceC31162w, Object obj) {
        this.container = kDeclarationContainerImpl;
        this.signature = str2;
        this.rawBoundReceiver = obj;
        this.descriptor = ReflectProperties.lazySoft(interfaceC31162w, new InterfaceC4339a(this, str) { // from class: kotlin.reflect.jvm.internal.DescriptorKFunction$$Lambda$0
            private final DescriptorKFunction arg$0;
            private final String arg$1;

            {
                this.arg$0 = this;
                this.arg$1 = str;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return DescriptorKFunction.descriptor_delegate$lambda$0(this.arg$0, this.arg$1);
            }
        });
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        this.caller = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKFunction$$Lambda$1
            private final DescriptorKFunction arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return DescriptorKFunction.caller_delegate$lambda$0(this.arg$0);
            }
        });
        this.defaultCaller = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKFunction$$Lambda$2
            private final DescriptorKFunction arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return DescriptorKFunction.defaultCaller_delegate$lambda$0(this.arg$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC25339g caller_delegate$lambda$0(DescriptorKFunction descriptorKFunction) {
        Object constructor;
        InterfaceC25339g interfaceC25339gCreateJvmStaticInObjectCaller;
        JvmFunctionSignature jvmFunctionSignatureMapSignature = RuntimeTypeMapper.INSTANCE.mapSignature(descriptorKFunction.getDescriptor());
        if (jvmFunctionSignatureMapSignature instanceof JvmFunctionSignature.KotlinConstructor) {
            if (descriptorKFunction.isAnnotationConstructor()) {
                Class jClass = descriptorKFunction.getContainer().getJClass();
                List<InterfaceC21484q> parameters = descriptorKFunction.getParameters();
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(parameters, 10));
                Iterator<T> it = parameters.iterator();
                while (it.hasNext()) {
                    String name = ((InterfaceC21484q) it.next()).getName();
                    AbstractC22676k.m65747g(name);
                    arrayList.add(name);
                }
                EnumC25328a enumC25328a = EnumC25328a.f99336x;
                EnumC25330b enumC25330b = EnumC25330b.f99338w;
                return new C25332c(jClass, arrayList, enumC25328a);
            }
            constructor = descriptorKFunction.getContainer().findConstructorBySignature(((JvmFunctionSignature.KotlinConstructor) jvmFunctionSignatureMapSignature).getConstructorDesc());
        } else if (jvmFunctionSignatureMapSignature instanceof JvmFunctionSignature.KotlinFunction) {
            InterfaceC31162w descriptor = descriptorKFunction.getDescriptor();
            InterfaceC31135k interfaceC31135kMo60581g = descriptor.mo60581g();
            AbstractC22676k.m65749i(interfaceC31135kMo60581g, "getContainingDeclaration(...)");
            if (AbstractC39365h.m125539c(interfaceC31135kMo60581g) && (descriptor instanceof InterfaceC31132j) && ((InterfaceC31132j) descriptor).mo95869O()) {
                InterfaceC31162w descriptor2 = descriptorKFunction.getDescriptor();
                KDeclarationContainerImpl container = descriptorKFunction.getContainer();
                String methodDesc = ((JvmFunctionSignature.KotlinFunction) jvmFunctionSignatureMapSignature).getMethodDesc();
                List listMo78676v = descriptorKFunction.getDescriptor().mo78676v();
                AbstractC22676k.m65749i(listMo78676v, "getValueParameters(...)");
                return new C25335d0(descriptor2, container, methodDesc, listMo78676v);
            }
            JvmFunctionSignature.KotlinFunction kotlinFunction = (JvmFunctionSignature.KotlinFunction) jvmFunctionSignatureMapSignature;
            constructor = descriptorKFunction.getContainer().findMethodBySignature(kotlinFunction.getMethodName(), kotlinFunction.getMethodDesc());
        } else if (jvmFunctionSignatureMapSignature instanceof JvmFunctionSignature.JavaMethod) {
            constructor = ((JvmFunctionSignature.JavaMethod) jvmFunctionSignatureMapSignature).getMethod();
            AbstractC22676k.m65748h(constructor, "null cannot be cast to non-null type java.lang.reflect.Member");
        } else {
            if (!(jvmFunctionSignatureMapSignature instanceof JvmFunctionSignature.JavaConstructor)) {
                if (!(jvmFunctionSignatureMapSignature instanceof JvmFunctionSignature.FakeJavaAnnotationConstructor)) {
                    throw new NoWhenBranchMatchedException();
                }
                List<Method> methods = ((JvmFunctionSignature.FakeJavaAnnotationConstructor) jvmFunctionSignatureMapSignature).getMethods();
                Class jClass2 = descriptorKFunction.getContainer().getJClass();
                List<Method> list = methods;
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                Iterator<T> it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((Method) it3.next()).getName());
                }
                return new C25332c(jClass2, arrayList2, EnumC25328a.f99336x, EnumC25330b.f99338w, methods);
            }
            constructor = ((JvmFunctionSignature.JavaConstructor) jvmFunctionSignatureMapSignature).getConstructor();
            AbstractC22676k.m65748h(constructor, "null cannot be cast to non-null type java.lang.reflect.Member");
        }
        if (constructor instanceof Constructor) {
            interfaceC25339gCreateJvmStaticInObjectCaller = descriptorKFunction.createConstructorCaller((Constructor) constructor, descriptorKFunction.getDescriptor(), false);
        } else {
            if (!(constructor instanceof Method)) {
                throw new KotlinReflectionInternalError("Could not compute caller for function: " + descriptorKFunction.getDescriptor() + " (member = " + constructor + ')');
            }
            Method method = (Method) constructor;
            if (Modifier.isStatic(method.getModifiers())) {
                interfaceC25339gCreateJvmStaticInObjectCaller = ((AbstractC0954a) descriptorKFunction.getDescriptor()).getAnnotations().mo52689T(UtilKt.getJVM_STATIC()) != null ? descriptorKFunction.createJvmStaticInObjectCaller(method) : descriptorKFunction.createStaticMethodCaller(method, false);
            } else {
                interfaceC25339gCreateJvmStaticInObjectCaller = descriptorKFunction.createInstanceMethodCaller(method);
            }
        }
        return AbstractC17269i.m48857B(interfaceC25339gCreateJvmStaticInObjectCaller, descriptorKFunction.getDescriptor(), false);
    }

    private final AbstractC25357y createConstructorCaller(Constructor<?> member, InterfaceC31162w descriptor, boolean isDefault) {
        Class<?> cls = null;
        if (!isDefault) {
            AbstractC22676k.m65750j(descriptor, "descriptor");
            C34682j c34682j = descriptor instanceof C34682j ? (C34682j) descriptor : null;
            if (c34682j != null) {
                C34682j c34682j2 = c34682j;
                if (!AbstractC31150q.m95877e(c34682j2.getVisibility())) {
                    InterfaceC31117e interfaceC31117eMo95870P = c34682j.mo95870P();
                    AbstractC22676k.m65749i(interfaceC31117eMo95870P, "getConstructedClass(...)");
                    if (!AbstractC39365h.m125541e(interfaceC31117eMo95870P) && !AbstractC39363f.m125533o(c34682j.mo95870P())) {
                        List listMo78676v = c34682j2.mo78676v();
                        AbstractC22676k.m65749i(listMo78676v, "getValueParameters(...)");
                        List list = listMo78676v;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                AbstractC23811y type = ((AbstractC34711x0) ((InterfaceC31107a1) it.next())).getType();
                                AbstractC22676k.m65749i(type, "getType(...)");
                                if (AbstractC29125c.m88511T(type)) {
                                    return ReflectKCallableKt.isBound(this) ? new C25340h(member, getBoundReceiver(), 0) : new C25341i(member);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (ReflectKCallableKt.isBound(this)) {
            return new C25340h(member, getBoundReceiver(), 1);
        }
        AbstractC22676k.m65750j(member, "constructor");
        Class<?> declaringClass = member.getDeclaringClass();
        AbstractC22676k.m65749i(declaringClass, "getDeclaringClass(...)");
        Class<?> declaringClass2 = member.getDeclaringClass();
        Class<?> declaringClass3 = declaringClass2.getDeclaringClass();
        if (declaringClass3 != null && !Modifier.isStatic(declaringClass2.getModifiers())) {
            cls = declaringClass3;
        }
        Type[] genericParameterTypes = member.getGenericParameterTypes();
        AbstractC22676k.m65749i(genericParameterTypes, "getGenericParameterTypes(...)");
        return new C25342j(member, declaringClass, cls, genericParameterTypes);
    }

    private final AbstractC25356x createInstanceMethodCaller(Method member) {
        return ReflectKCallableKt.isBound(this) ? new C25351s(member, getBoundReceiver()) : new C25355w(member, 0);
    }

    private final AbstractC25356x createJvmStaticInObjectCaller(Method member) {
        return ReflectKCallableKt.isBound(this) ? new C25352t(member) : new C25355w(member, 1);
    }

    private final InterfaceC25339g createStaticMethodCaller(Method member, boolean isCallByToValueClassMangledMethod) {
        if (ReflectKCallableKt.isBound(this)) {
            return new C25353u(member, isCallByToValueClassMangledMethod, useBoxedBoundReceiver(member) ? getRawBoundReceiver() : getBoundReceiver());
        }
        return new C25355w(member, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:47:0x0179  */
    public static final InterfaceC25339g defaultCaller_delegate$lambda$0(DescriptorKFunction descriptorKFunction) {
        GenericDeclaration genericDeclarationFindDefaultConstructor;
        InterfaceC25339g interfaceC25339gCreateStaticMethodCaller;
        RuntimeTypeMapper runtimeTypeMapper = RuntimeTypeMapper.INSTANCE;
        JvmFunctionSignature jvmFunctionSignatureMapSignature = runtimeTypeMapper.mapSignature(descriptorKFunction.getDescriptor());
        if (jvmFunctionSignatureMapSignature instanceof JvmFunctionSignature.KotlinFunction) {
            InterfaceC31162w descriptor = descriptorKFunction.getDescriptor();
            InterfaceC31135k interfaceC31135kMo60581g = descriptor.mo60581g();
            AbstractC22676k.m65749i(interfaceC31135kMo60581g, "getContainingDeclaration(...)");
            if (AbstractC39365h.m125539c(interfaceC31135kMo60581g) && (descriptor instanceof InterfaceC31132j) && ((InterfaceC31132j) descriptor).mo95869O()) {
                throw new KotlinReflectionInternalError(descriptorKFunction.getDescriptor().mo60581g() + " cannot have default arguments");
            }
            InterfaceC31162w functionWithDefaultParametersForValueClassOverride = descriptorKFunction.getFunctionWithDefaultParametersForValueClassOverride(descriptorKFunction.getDescriptor());
            if (functionWithDefaultParametersForValueClassOverride != null) {
                JvmFunctionSignature jvmFunctionSignatureMapSignature2 = runtimeTypeMapper.mapSignature(functionWithDefaultParametersForValueClassOverride);
                AbstractC22676k.m65748h(jvmFunctionSignatureMapSignature2, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction");
                JvmFunctionSignature.KotlinFunction kotlinFunction = (JvmFunctionSignature.KotlinFunction) jvmFunctionSignatureMapSignature2;
                genericDeclarationFindDefaultConstructor = descriptorKFunction.getContainer().findDefaultMethod(kotlinFunction.getMethodName(), kotlinFunction.getMethodDesc(), true);
            } else {
                KDeclarationContainerImpl container = descriptorKFunction.getContainer();
                JvmFunctionSignature.KotlinFunction kotlinFunction2 = (JvmFunctionSignature.KotlinFunction) jvmFunctionSignatureMapSignature;
                String methodName = kotlinFunction2.getMethodName();
                String methodDesc = kotlinFunction2.getMethodDesc();
                Member member = descriptorKFunction.getCaller().getMember();
                AbstractC22676k.m65747g(member);
                genericDeclarationFindDefaultConstructor = container.findDefaultMethod(methodName, methodDesc, !Modifier.isStatic(member.getModifiers()));
            }
        } else if (jvmFunctionSignatureMapSignature instanceof JvmFunctionSignature.KotlinConstructor) {
            if (descriptorKFunction.isAnnotationConstructor()) {
                Class jClass = descriptorKFunction.getContainer().getJClass();
                List<InterfaceC21484q> parameters = descriptorKFunction.getParameters();
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(parameters, 10));
                Iterator<T> it = parameters.iterator();
                while (it.hasNext()) {
                    String name = ((InterfaceC21484q) it.next()).getName();
                    AbstractC22676k.m65747g(name);
                    arrayList.add(name);
                }
                EnumC25328a enumC25328a = EnumC25328a.f99335w;
                EnumC25330b enumC25330b = EnumC25330b.f99338w;
                return new C25332c(jClass, arrayList, enumC25328a);
            }
            genericDeclarationFindDefaultConstructor = descriptorKFunction.getContainer().findDefaultConstructor(((JvmFunctionSignature.KotlinConstructor) jvmFunctionSignatureMapSignature).getConstructorDesc());
        } else {
            if (jvmFunctionSignatureMapSignature instanceof JvmFunctionSignature.FakeJavaAnnotationConstructor) {
                List<Method> methods = ((JvmFunctionSignature.FakeJavaAnnotationConstructor) jvmFunctionSignatureMapSignature).getMethods();
                Class jClass2 = descriptorKFunction.getContainer().getJClass();
                List<Method> list = methods;
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                Iterator<T> it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((Method) it3.next()).getName());
                }
                return new C25332c(jClass2, arrayList2, EnumC25328a.f99335w, EnumC25330b.f99338w, methods);
            }
            genericDeclarationFindDefaultConstructor = null;
        }
        if (genericDeclarationFindDefaultConstructor instanceof Constructor) {
            interfaceC25339gCreateStaticMethodCaller = descriptorKFunction.createConstructorCaller((Constructor) genericDeclarationFindDefaultConstructor, descriptorKFunction.getDescriptor(), true);
        } else if (!(genericDeclarationFindDefaultConstructor instanceof Method)) {
            interfaceC25339gCreateStaticMethodCaller = null;
        } else if (((AbstractC0954a) descriptorKFunction.getDescriptor()).getAnnotations().mo52689T(UtilKt.getJVM_STATIC()) != null) {
            InterfaceC31135k interfaceC31135kMo60581g2 = descriptorKFunction.getDescriptor().mo60581g();
            AbstractC22676k.m65748h(interfaceC31135kMo60581g2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            if (((InterfaceC31117e) interfaceC31135kMo60581g2).mo60491N()) {
                interfaceC25339gCreateStaticMethodCaller = descriptorKFunction.createStaticMethodCaller((Method) genericDeclarationFindDefaultConstructor, descriptorKFunction.getCaller().mo74409b());
            } else {
                interfaceC25339gCreateStaticMethodCaller = descriptorKFunction.createJvmStaticInObjectCaller((Method) genericDeclarationFindDefaultConstructor);
            }
        } else {
            interfaceC25339gCreateStaticMethodCaller = descriptorKFunction.createStaticMethodCaller((Method) genericDeclarationFindDefaultConstructor, descriptorKFunction.getCaller().mo74409b());
        }
        if (interfaceC25339gCreateStaticMethodCaller != null) {
            return AbstractC17269i.m48857B(interfaceC25339gCreateStaticMethodCaller, descriptorKFunction.getDescriptor(), true);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC31162w descriptor_delegate$lambda$0(DescriptorKFunction descriptorKFunction, String str) {
        return descriptorKFunction.getContainer().findFunctionDescriptor(str, descriptorKFunction.getSignature());
    }

    private final Object getBoundReceiver() {
        return AbstractC17269i.m48919z(getRawBoundReceiver(), getDescriptor());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    /* JADX WARN: Code duplicated, block: B:20:0x0067  */
    /* JADX WARN: Code duplicated, block: B:28:0x008f  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:37:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x009f A[EDGE_INSN: B:40:0x009f->B:32:0x009f BREAK  A[LOOP:0: B:18:0x0061->B:41:0x0061, LOOP_LABEL: LOOP:0: B:18:0x0061->B:41:0x0061], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[LOOP:1: B:26:0x0089->B:44:?, LOOP_END, SYNTHETIC] */
    private final InterfaceC31162w getFunctionWithDefaultParametersForValueClassOverride(InterfaceC31162w descriptor) {
        InterfaceC31135k interfaceC31135kMo60581g;
        Member member;
        C38170e c38170e;
        Object next;
        List list;
        Iterator it;
        List listMo78676v = descriptor.mo78676v();
        AbstractC22676k.m65749i(listMo78676v, "getValueParameters(...)");
        List list2 = listMo78676v;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            interfaceC31135kMo60581g = descriptor.mo60581g();
            AbstractC22676k.m65749i(interfaceC31135kMo60581g, "getContainingDeclaration(...)");
            if (AbstractC39365h.m125541e(interfaceC31135kMo60581g)) {
                member = getCaller().getMember();
                AbstractC22676k.m65747g(member);
                if (Modifier.isStatic(member.getModifiers())) {
                    c38170e = new C38170e(AbstractC4393e.m13814l(descriptor));
                    loop0: while (true) {
                        if (c38170e.hasNext()) {
                            next = null;
                            break;
                        }
                        next = c38170e.next();
                        List listMo78676v2 = ((InterfaceC31111c) next).mo78676v();
                        AbstractC22676k.m65749i(listMo78676v2, "getValueParameters(...)");
                        list = listMo78676v2;
                        if (list instanceof Collection) {
                        }
                        it = list.iterator();
                        while (it.hasNext()) {
                            if (((C34709w0) ((InterfaceC31107a1) it.next())).m109625J0()) {
                                break loop0;
                                break loop0;
                            }
                        }
                    }
                    if (next instanceof InterfaceC31162w) {
                        return (InterfaceC31162w) next;
                    }
                }
            }
        } else {
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                if (((C34709w0) ((InterfaceC31107a1) it3.next())).m109625J0()) {
                }
            }
            interfaceC31135kMo60581g = descriptor.mo60581g();
            AbstractC22676k.m65749i(interfaceC31135kMo60581g, "getContainingDeclaration(...)");
            if (AbstractC39365h.m125541e(interfaceC31135kMo60581g)) {
                member = getCaller().getMember();
                AbstractC22676k.m65747g(member);
                if (Modifier.isStatic(member.getModifiers())) {
                    c38170e = new C38170e(AbstractC4393e.m13814l(descriptor));
                    loop0: while (true) {
                        if (c38170e.hasNext()) {
                            next = null;
                            break;
                        }
                        next = c38170e.next();
                        List listMo78676v3 = ((InterfaceC31111c) next).mo78676v();
                        AbstractC22676k.m65749i(listMo78676v3, "getValueParameters(...)");
                        list = listMo78676v3;
                        if ((list instanceof Collection) || !list.isEmpty()) {
                            it = list.iterator();
                            while (it.hasNext()) {
                                if (((C34709w0) ((InterfaceC31107a1) it.next())).m109625J0()) {
                                    break loop0;
                                }
                            }
                        }
                    }
                    if (next instanceof InterfaceC31162w) {
                        return (InterfaceC31162w) next;
                    }
                }
            }
        }
        return null;
    }

    private final boolean useBoxedBoundReceiver(Method member) {
        InterfaceC31151q0 interfaceC31151q0Mo78677y = getDescriptor().mo78677y();
        if (interfaceC31151q0Mo78677y != null) {
            AbstractC23811y type = ((AbstractC34670d) interfaceC31151q0Mo78677y).getType();
            int i13 = AbstractC39365h.f169414a;
            InterfaceC31126h interfaceC31126hMo1784d = type.mo69844i0().mo1784d();
            if (interfaceC31126hMo1784d != null ? AbstractC39365h.m125538b(interfaceC31126hMo1784d) : false) {
                Class<?>[] parameterTypes = member.getParameterTypes();
                AbstractC22676k.m65749i(parameterTypes, "getParameterTypes(...)");
                Class cls = (Class) AbstractC25260n.m74079t0(parameterTypes);
                if (cls != null && cls.isInterface()) {
                    return true;
                }
            }
        }
        return false;
    }

    public Object default$invoke() {
        return call(new Object[0]);
    }

    public boolean equals(Object other) {
        ReflectKFunction reflectKFunctionAsReflectFunction = UtilKt.asReflectFunction(other);
        return reflectKFunctionAsReflectFunction != null && AbstractC22676k.m65745e(getContainer(), reflectKFunctionAsReflectFunction.getContainer()) && AbstractC22676k.m65745e(getName(), reflectKFunctionAsReflectFunction.getName()) && AbstractC22676k.m65745e(getSignature(), reflectKFunctionAsReflectFunction.getSignature()) && AbstractC22676k.m65745e(getRawBoundReceiver(), reflectKFunctionAsReflectFunction.getRawBoundReceiver());
    }

    @Override // p715kotlin.jvm.internal.InterfaceC22668g
    public int getArity() {
        return AbstractC15751g.m44473z(getCaller());
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKCallable
    public InterfaceC25339g getCaller() {
        return (InterfaceC25339g) this.caller.getValue();
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKCallable
    public KDeclarationContainerImpl getContainer() {
        return this.container;
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKCallable
    public InterfaceC25339g getDefaultCaller() {
        return (InterfaceC25339g) this.defaultCaller.getValue();
    }

    @Override // p715kotlin.reflect.jvm.internal.DescriptorKCallable, p715kotlin.reflect.jvm.internal.ReflectKCallable, j93.InterfaceC21459c
    public String getName() {
        String strM113817b = ((AbstractC34690n) getDescriptor()).getName().m113817b();
        AbstractC22676k.m65749i(strM113817b, "asString(...)");
        return strM113817b;
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKCallable
    public Object getRawBoundReceiver() {
        return this.rawBoundReceiver;
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKFunction
    public String getSignature() {
        return this.signature;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getContainer().hashCode() * 31)) * 31);
    }

    @Override // p715kotlin.reflect.jvm.internal.FunctionWithAllInvokes, c93.InterfaceC4339a
    public /* bridge */ Object invoke() {
        return default$invoke();
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKFunction, j93.InterfaceC21467g
    public boolean isExternal() {
        return getDescriptor().isExternal();
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKFunction, j93.InterfaceC21467g
    public boolean isInfix() {
        return getDescriptor().isInfix();
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKFunction, j93.InterfaceC21467g
    public boolean isInline() {
        return getDescriptor().isInline();
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKFunction, j93.InterfaceC21467g
    public boolean isOperator() {
        return getDescriptor().isOperator();
    }

    @Override // p715kotlin.reflect.jvm.internal.DescriptorKCallable, p715kotlin.reflect.jvm.internal.ReflectKCallable, j93.InterfaceC21459c
    public boolean isSuspend() {
        return getDescriptor().isSuspend();
    }

    public String toString() {
        return ReflectionObjectRenderer.INSTANCE.renderFunction(this);
    }

    public Object default$invoke(Object obj) {
        return call(obj);
    }

    @Override // p715kotlin.reflect.jvm.internal.DescriptorKCallable
    public InterfaceC31162w getDescriptor() {
        T value = this.descriptor.getValue(this, $$delegatedProperties[0]);
        AbstractC22676k.m65749i(value, "getValue(...)");
        return (InterfaceC31162w) value;
    }

    @Override // p715kotlin.reflect.jvm.internal.FunctionWithAllInvokes, p715kotlin.jvm.functions.Function1
    public /* bridge */ Object invoke(Object obj) {
        return default$invoke(obj);
    }

    public Object default$invoke(Object obj, Object obj2) {
        return call(obj, obj2);
    }

    @Override // p715kotlin.reflect.jvm.internal.FunctionWithAllInvokes, c93.InterfaceC4351m
    public /* bridge */ Object invoke(Object obj, Object obj2) {
        return default$invoke(obj, obj2);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3) {
        return call(obj, obj2, obj3);
    }

    @Override // p715kotlin.reflect.jvm.internal.FunctionWithAllInvokes, p715kotlin.jvm.functions.Function3
    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3) {
        return default$invoke(obj, obj2, obj3);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return call(obj, obj2, obj3, obj4);
    }

    @Override // p715kotlin.reflect.jvm.internal.FunctionWithAllInvokes, c93.InterfaceC4352n
    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return default$invoke(obj, obj2, obj3, obj4);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return call(obj, obj2, obj3, obj4, obj5);
    }

    @Override // p715kotlin.reflect.jvm.internal.FunctionWithAllInvokes, c93.InterfaceC4353o
    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return default$invoke(obj, obj2, obj3, obj4, obj5);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return call(obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // p715kotlin.reflect.jvm.internal.FunctionWithAllInvokes, c93.InterfaceC4354p
    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DescriptorKFunction(KDeclarationContainerImpl container, String name, String signature, Object obj) {
        this(container, name, signature, null, obj);
        AbstractC22676k.m65750j(container, "container");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(signature, "signature");
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    @Override // p715kotlin.reflect.jvm.internal.FunctionWithAllInvokes, c93.InterfaceC4355q
    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public DescriptorKFunction(KDeclarationContainerImpl container, InterfaceC31162w descriptor) {
        AbstractC22676k.m65750j(container, "container");
        AbstractC22676k.m65750j(descriptor, "descriptor");
        String strM113817b = ((AbstractC34690n) descriptor).getName().m113817b();
        AbstractC22676k.m65749i(strM113817b, "asString(...)");
        this(container, strM113817b, RuntimeTypeMapper.INSTANCE.mapSignature(descriptor).get_signature(), descriptor, AbstractC22660c.NO_RECEIVER);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    @Override // p715kotlin.reflect.jvm.internal.FunctionWithAllInvokes, c93.InterfaceC4356r
    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    @Override // p715kotlin.reflect.jvm.internal.FunctionWithAllInvokes
    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    @Override // p715kotlin.reflect.jvm.internal.FunctionWithAllInvokes, c93.InterfaceC4340b
    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);
    }

    @Override // p715kotlin.reflect.jvm.internal.FunctionWithAllInvokes
    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12);
    }

    @Override // p715kotlin.reflect.jvm.internal.FunctionWithAllInvokes
    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13);
    }

    @Override // p715kotlin.reflect.jvm.internal.FunctionWithAllInvokes
    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14);
    }

    @Override // p715kotlin.reflect.jvm.internal.FunctionWithAllInvokes
    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15);
    }

    @Override // p715kotlin.reflect.jvm.internal.FunctionWithAllInvokes
    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16);
    }

    @Override // p715kotlin.reflect.jvm.internal.FunctionWithAllInvokes
    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17);
    }

    @Override // p715kotlin.reflect.jvm.internal.FunctionWithAllInvokes
    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18);
    }

    @Override // p715kotlin.reflect.jvm.internal.FunctionWithAllInvokes
    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19);
    }

    @Override // p715kotlin.reflect.jvm.internal.FunctionWithAllInvokes
    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20);
    }

    @Override // p715kotlin.reflect.jvm.internal.FunctionWithAllInvokes
    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21);
    }

    @Override // p715kotlin.reflect.jvm.internal.FunctionWithAllInvokes
    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21);
    }

    public Object default$invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21, Object obj22) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21, obj22);
    }

    @Override // p715kotlin.reflect.jvm.internal.FunctionWithAllInvokes
    public /* bridge */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21, Object obj22) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21, obj22);
    }
}
