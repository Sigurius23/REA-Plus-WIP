package p715kotlin.reflect.jvm.internal;

import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import j93.InterfaceC21459c;
import java.util.Collection;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31132j;
import r93.InterfaceC31145n0;
import r93.InterfaceC31162w;
import va3.C35850h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u001a\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0019¨\u0006\u001e"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/EmptyContainerForLocal;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "<init>", "()V", "", "fail", "()Ljava/lang/Void;", "Lva3/h;", "name", "", "Lr93/n0;", "getProperties", "(Lva3/h;)Ljava/util/Collection;", "Lr93/w;", "getFunctions", "", "index", "getLocalProperty", "(I)Lr93/n0;", "Ljava/lang/Class;", "getJClass", "()Ljava/lang/Class;", "jClass", "Lj93/c;", "getMembers", "()Ljava/util/Collection;", QueryChannelRequest.KEY_MEMBERS, "Lr93/j;", "getConstructorDescriptors", "constructorDescriptors", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EmptyContainerForLocal extends KDeclarationContainerImpl {
    public static final EmptyContainerForLocal INSTANCE = new EmptyContainerForLocal();

    private EmptyContainerForLocal() {
    }

    private final Void fail() {
        throw new KotlinReflectionInternalError("Introspecting local functions, lambdas, anonymous functions, local variables and typealiases is not yet fully supported in Kotlin reflection");
    }

    @Override // p715kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public Collection<InterfaceC31132j> getConstructorDescriptors() {
        fail();
        throw new KotlinNothingValueException();
    }

    @Override // p715kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public Collection<InterfaceC31162w> getFunctions(C35850h name) {
        AbstractC22676k.m65750j(name, "name");
        fail();
        throw new KotlinNothingValueException();
    }

    @Override // p715kotlin.reflect.jvm.internal.KDeclarationContainerImpl, p715kotlin.jvm.internal.InterfaceC22662d
    public Class<?> getJClass() {
        fail();
        throw new KotlinNothingValueException();
    }

    @Override // p715kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public InterfaceC31145n0 getLocalProperty(int index) {
        return null;
    }

    @Override // p715kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public Collection<InterfaceC21459c> getMembers() {
        fail();
        throw new KotlinNothingValueException();
    }

    @Override // p715kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public Collection<InterfaceC31145n0> getProperties(C35850h name) {
        AbstractC22676k.m65750j(name, "name");
        fail();
        throw new KotlinNothingValueException();
    }
}
