package p715kotlin.reflect.jvm.internal;

import bi.AbstractC3269g;
import j93.C21462d0;
import j93.EnumC21464e0;
import j93.InterfaceC21456a0;
import j93.InterfaceC21458b0;
import j93.InterfaceC21459c;
import j93.InterfaceC21461d;
import j93.InterfaceC21463e;
import j93.InterfaceC21465f;
import j93.InterfaceC21467g;
import j93.InterfaceC21473j;
import j93.InterfaceC21477l;
import j93.InterfaceC21481n;
import j93.InterfaceC21488u;
import j93.InterfaceC21490w;
import j93.InterfaceC21492y;
import java.util.Collections;
import java.util.List;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22660c;
import p715kotlin.jvm.internal.AbstractC22670h;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.AbstractC22682n;
import p715kotlin.jvm.internal.AbstractC22685p;
import p715kotlin.jvm.internal.AbstractC22687r;
import p715kotlin.jvm.internal.AbstractC22690u;
import p715kotlin.jvm.internal.AbstractC22692w;
import p715kotlin.jvm.internal.AbstractC22694y;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.InterfaceC22662d;
import p715kotlin.jvm.internal.InterfaceC22668g;
import sc3.AbstractC32398l;

/* JADX INFO: loaded from: classes5.dex */
public class ReflectionFactoryImpl extends C22673i0 {
    public static void clearCaches() {
        CachesKt.clearCaches();
        ModuleByClassLoaderKt.clearModuleByClassLoaderCache();
    }

    private static KDeclarationContainerImpl getOwner(AbstractC22660c abstractC22660c) {
        InterfaceC21465f owner = abstractC22660c.getOwner();
        return owner instanceof KDeclarationContainerImpl ? (KDeclarationContainerImpl) owner : EmptyContainerForLocal.INSTANCE;
    }

    @Override // p715kotlin.jvm.internal.C22673i0
    public InterfaceC21461d createKotlinClass(Class cls) {
        return new KClassImpl(cls);
    }

    @Override // p715kotlin.jvm.internal.C22673i0
    public InterfaceC21467g function(AbstractC22670h abstractC22670h) {
        return new DescriptorKFunction(getOwner(abstractC22670h), abstractC22670h.getName(), abstractC22670h.getSignature(), abstractC22670h.getBoundReceiver());
    }

    @Override // p715kotlin.jvm.internal.C22673i0
    public InterfaceC21461d getOrCreateKotlinClass(Class cls) {
        return CachesKt.getOrCreateKotlinClass(cls);
    }

    @Override // p715kotlin.jvm.internal.C22673i0
    public InterfaceC21465f getOrCreateKotlinPackage(Class cls, String str) {
        return CachesKt.getOrCreateKotlinPackage(cls);
    }

    @Override // p715kotlin.jvm.internal.C22673i0
    public InterfaceC21456a0 mutableCollectionType(InterfaceC21456a0 interfaceC21456a0) {
        return AbstractC32398l.m100971d(interfaceC21456a0);
    }

    @Override // p715kotlin.jvm.internal.C22673i0
    public InterfaceC21473j mutableProperty0(AbstractC22682n abstractC22682n) {
        return new DescriptorKMutableProperty0(getOwner(abstractC22682n), abstractC22682n.getName(), abstractC22682n.getSignature(), abstractC22682n.getBoundReceiver());
    }

    @Override // p715kotlin.jvm.internal.C22673i0
    public InterfaceC21477l mutableProperty1(AbstractC22685p abstractC22685p) {
        return new DescriptorKMutableProperty1(getOwner(abstractC22685p), abstractC22685p.getName(), abstractC22685p.getSignature(), abstractC22685p.getBoundReceiver());
    }

    public InterfaceC21481n mutableProperty2(AbstractC22687r abstractC22687r) {
        getOwner(abstractC22687r);
        throw null;
    }

    public InterfaceC21456a0 nothingType(InterfaceC21456a0 interfaceC21456a0) {
        return AbstractC32398l.m100972e(interfaceC21456a0);
    }

    public InterfaceC21456a0 platformType(InterfaceC21456a0 interfaceC21456a0, InterfaceC21456a0 interfaceC21456a1) {
        return AbstractC32398l.m100973f(interfaceC21456a0, interfaceC21456a1);
    }

    @Override // p715kotlin.jvm.internal.C22673i0
    public InterfaceC21488u property0(AbstractC22690u abstractC22690u) {
        return new DescriptorKProperty0(getOwner(abstractC22690u), abstractC22690u.getName(), abstractC22690u.getSignature(), abstractC22690u.getBoundReceiver());
    }

    @Override // p715kotlin.jvm.internal.C22673i0
    public InterfaceC21490w property1(AbstractC22692w abstractC22692w) {
        return new DescriptorKProperty1(getOwner(abstractC22692w), abstractC22692w.getName(), abstractC22692w.getSignature(), abstractC22692w.getBoundReceiver());
    }

    @Override // p715kotlin.jvm.internal.C22673i0
    public InterfaceC21492y property2(AbstractC22694y abstractC22694y) {
        return new DescriptorKProperty2(getOwner(abstractC22694y), abstractC22694y.getName(), abstractC22694y.getSignature());
    }

    @Override // p715kotlin.jvm.internal.C22673i0
    public String renderLambdaToString(AbstractC22680m abstractC22680m) {
        return renderLambdaToString((InterfaceC22668g) abstractC22680m);
    }

    public void setUpperBounds(InterfaceC21458b0 interfaceC21458b0, List<InterfaceC21456a0> list) {
    }

    @Override // p715kotlin.jvm.internal.C22673i0
    public InterfaceC21456a0 typeOf(InterfaceC21463e interfaceC21463e, List<C21462d0> list, boolean z4) {
        return interfaceC21463e instanceof InterfaceC22662d ? CachesKt.getOrCreateKType(((InterfaceC22662d) interfaceC21463e).getJClass(), list, z4) : AbstractC21598x.m60714z(interfaceC21463e, list, z4, Collections.EMPTY_LIST);
    }

    public InterfaceC21458b0 typeParameter(Object obj, String str, EnumC21464e0 enumC21464e0, boolean z4) {
        List<InterfaceC21458b0> typeParameters;
        if (obj instanceof InterfaceC21461d) {
            typeParameters = ((InterfaceC21461d) obj).getTypeParameters();
        } else {
            if (!(obj instanceof InterfaceC21459c)) {
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "Type parameter container must be a class or a callable: "));
            }
            typeParameters = ((InterfaceC21459c) obj).getTypeParameters();
        }
        for (InterfaceC21458b0 interfaceC21458b0 : typeParameters) {
            if (interfaceC21458b0.getName().equals(str)) {
                return interfaceC21458b0;
            }
        }
        throw new IllegalArgumentException("Type parameter " + str + " is not found in container: " + obj);
    }

    public InterfaceC21461d createKotlinClass(Class cls, String str) {
        return new KClassImpl(cls);
    }

    public InterfaceC21461d getOrCreateKotlinClass(Class cls, String str) {
        return CachesKt.getOrCreateKotlinClass(cls);
    }

    @Override // p715kotlin.jvm.internal.C22673i0
    public String renderLambdaToString(InterfaceC22668g interfaceC22668g) {
        DescriptorKFunction descriptorKFunctionM9488S = AbstractC3269g.m9488S(interfaceC22668g);
        return descriptorKFunctionM9488S != null ? ReflectionObjectRenderer.INSTANCE.renderLambda(descriptorKFunctionM9488S) : super.renderLambdaToString(interfaceC22668g);
    }
}
