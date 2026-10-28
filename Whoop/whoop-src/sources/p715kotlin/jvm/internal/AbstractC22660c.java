package p715kotlin.jvm.internal;

import j93.EnumC21466f0;
import j93.InterfaceC21456a0;
import j93.InterfaceC21458b0;
import j93.InterfaceC21459c;
import j93.InterfaceC21465f;
import j93.InterfaceC21484q;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: kotlin.jvm.internal.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22660c implements InterfaceC21459c, Serializable {
    public static final Object NO_RECEIVER = C22658b.f89328w;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC21459c reflected;
    private final String signature;

    public AbstractC22660c(Object obj, Class cls, String str, String str2, boolean z4) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z4;
    }

    @Override // j93.InterfaceC21459c
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // j93.InterfaceC21459c
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC21459c compute() {
        InterfaceC21459c interfaceC21459c = this.reflected;
        if (interfaceC21459c != null) {
            return interfaceC21459c;
        }
        InterfaceC21459c interfaceC21459cComputeReflected = computeReflected();
        this.reflected = interfaceC21459cComputeReflected;
        return interfaceC21459cComputeReflected;
    }

    public abstract InterfaceC21459c computeReflected();

    @Override // j93.InterfaceC21457b
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // j93.InterfaceC21459c
    public String getName() {
        return this.name;
    }

    public InterfaceC21465f getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? AbstractC22671h0.f89337a.getOrCreateKotlinPackage(cls, "") : AbstractC22671h0.f89337a.getOrCreateKotlinClass(cls);
    }

    @Override // j93.InterfaceC21459c
    public List<InterfaceC21484q> getParameters() {
        return getReflected().getParameters();
    }

    public abstract InterfaceC21459c getReflected();

    @Override // j93.InterfaceC21459c
    public InterfaceC21456a0 getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // j93.InterfaceC21459c
    public List<InterfaceC21458b0> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // j93.InterfaceC21459c
    public EnumC21466f0 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // j93.InterfaceC21459c
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // j93.InterfaceC21459c
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // j93.InterfaceC21459c
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // j93.InterfaceC21459c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
