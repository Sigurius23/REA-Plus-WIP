package p715kotlin.reflect.jvm.internal;

import c93.InterfaceC4339a;
import hg3.AbstractC17269i;
import j93.InterfaceC21467g;
import j93.InterfaceC21469h;
import j93.InterfaceC21485r;
import j93.InterfaceC21486s;
import j93.InterfaceC21493z;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m93.InterfaceC25339g;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22660c;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22693x;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.reflect.full.IllegalPropertyDelegateAccessException;
import q83.AbstractC30060g;
import r93.InterfaceC31117e;
import r93.InterfaceC31135k;
import r93.InterfaceC31142m0;
import r93.InterfaceC31145n0;
import r93.InterfaceC31147o0;
import r93.InterfaceC31149p0;
import s93.C32305g;
import se.AbstractC32410a;
import ta3.C33678d;
import u93.AbstractC34685k0;
import u93.C34691n0;
import ua3.C34724d;
import ua3.C34727g;
import wa3.C36998i;
import x30.AbstractC37926s0;
import ya3.AbstractC39373p;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b \u0018\u0000 I*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004JKLIB5\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u0010B+\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000bH\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010#R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b)\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\"\u00103\u001a\u0010\u0012\f\u0012\n 2*\u0004\u0018\u00010\t0\t018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b5\u0010,R\u0016\u00108\u001a\u0004\u0018\u00010.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00028\u0000098&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0018\u0010@\u001a\u0006\u0012\u0002\b\u00030=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u001a\u0010B\u001a\b\u0012\u0002\b\u0003\u0018\u00010=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010?R\u0014\u0010C\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010DR\u0014\u0010F\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010DR\u0014\u0010\u000f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006M"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKProperty;", "V", "Lkotlin/reflect/jvm/internal/DescriptorKCallable;", "Lkotlin/reflect/jvm/internal/ReflectKProperty;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "", "name", "signature", "Lr93/n0;", "descriptorInitialValue", "", "rawBoundReceiver", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Ljava/lang/Object;)V", "descriptor", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/lang/reflect/Member;", "computeDelegateSource", "()Ljava/lang/reflect/Member;", "fieldOrMethod", "receiver1", "receiver2", "getDelegateImpl", "(Ljava/lang/reflect/Member;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Ljava/lang/String;", "getName", "getSignature", "Ljava/lang/Object;", "getRawBoundReceiver", "()Ljava/lang/Object;", "Ll83/h;", "Ljava/lang/reflect/Field;", "_javaField", "Ll83/h;", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "kotlin.jvm.PlatformType", "_descriptor", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getBoundReceiver", "getJavaField", "()Ljava/lang/reflect/Field;", "javaField", "Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;", "getGetter", "()Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;", "getter", "Lm93/g;", "getCaller", "()Lm93/g;", "caller", "getDefaultCaller", "defaultCaller", "isLateinit", "()Z", "isConst", "isSuspend", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "Companion", "Accessor", "Getter", "Setter", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class DescriptorKProperty<V> extends DescriptorKCallable<V> implements ReflectKProperty<V> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Object EXTENSION_PROPERTY_DELEGATE = new Object();
    private final ReflectProperties.LazySoftVal<InterfaceC31145n0> _descriptor;
    private final InterfaceC23462h _javaField;
    private final KDeclarationContainerImpl container;
    private final String name;
    private final Object rawBoundReceiver;
    private final String signature;

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u0001*\u0006\b\u0002\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001aR\u0014\u0010\"\u001a\u00020\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;", "PropertyType", "ReturnType", "Lkotlin/reflect/jvm/internal/DescriptorKCallable;", "Lj93/r;", "Lj93/g;", "<init>", "()V", "Lkotlin/reflect/jvm/internal/DescriptorKProperty;", "getProperty", "()Lkotlin/reflect/jvm/internal/DescriptorKProperty;", "property", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lm93/g;", "getDefaultCaller", "()Lm93/g;", "defaultCaller", "", "getRawBoundReceiver", "()Ljava/lang/Object;", "rawBoundReceiver", "", "isInline", "()Z", "isExternal", "isOperator", "isInfix", "isSuspend", "Lr93/m0;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyAccessorDescriptor;", "descriptor", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class Accessor<PropertyType, ReturnType> extends DescriptorKCallable<ReturnType> implements InterfaceC21467g, InterfaceC21485r {
        @Override // p715kotlin.reflect.jvm.internal.ReflectKCallable
        public KDeclarationContainerImpl getContainer() {
            return getProperty().getContainer();
        }

        @Override // p715kotlin.reflect.jvm.internal.ReflectKCallable
        public InterfaceC25339g getDefaultCaller() {
            return null;
        }

        @Override // p715kotlin.reflect.jvm.internal.DescriptorKCallable
        public abstract InterfaceC31142m0 getDescriptor();

        @Override // p715kotlin.reflect.jvm.internal.DescriptorKCallable, p715kotlin.reflect.jvm.internal.ReflectKCallable, j93.InterfaceC21459c
        public abstract /* synthetic */ String getName();

        public abstract /* synthetic */ InterfaceC21493z getProperty();

        @Override // j93.InterfaceC21485r
        public abstract DescriptorKProperty<PropertyType> getProperty();

        @Override // p715kotlin.reflect.jvm.internal.ReflectKCallable
        public Object getRawBoundReceiver() {
            return getProperty().getRawBoundReceiver();
        }

        @Override // j93.InterfaceC21467g
        public boolean isExternal() {
            return ((AbstractC34685k0) getDescriptor()).f146085G;
        }

        @Override // j93.InterfaceC21467g
        public boolean isInfix() {
            getDescriptor().getClass();
            return false;
        }

        @Override // j93.InterfaceC21467g
        public boolean isInline() {
            return ((AbstractC34685k0) getDescriptor()).f146088J;
        }

        @Override // j93.InterfaceC21467g
        public boolean isOperator() {
            getDescriptor().getClass();
            return false;
        }

        @Override // p715kotlin.reflect.jvm.internal.DescriptorKCallable, p715kotlin.reflect.jvm.internal.ReflectKCallable, j93.InterfaceC21459c
        public boolean isSuspend() {
            getDescriptor().getClass();
            return false;
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKProperty$Companion;", "", "<init>", "()V", "EXTENSION_PROPERTY_DELEGATE", "getEXTENSION_PROPERTY_DELEGATE", "()Ljava/lang/Object;", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Object getEXTENSION_PROPERTY_DELEGATE() {
            return DescriptorKProperty.EXTENSION_PROPERTY_DELEGATE;
        }

        private Companion() {
        }
    }

    private DescriptorKProperty(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, InterfaceC31145n0 interfaceC31145n0, Object obj) {
        this.container = kDeclarationContainerImpl;
        this.name = str;
        this.signature = str2;
        this.rawBoundReceiver = obj;
        this._javaField = AbstractC30060g.m92087G(EnumC23463i.f92934x, new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty$$Lambda$0
            private final DescriptorKProperty arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return DescriptorKProperty._javaField$lambda$0(this.arg$0);
            }
        });
        ReflectProperties.LazySoftVal<InterfaceC31145n0> lazySoftValLazySoft = ReflectProperties.lazySoft(interfaceC31145n0, new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty$$Lambda$1
            private final DescriptorKProperty arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return DescriptorKProperty._descriptor$lambda$0(this.arg$0);
            }
        });
        AbstractC22676k.m65749i(lazySoftValLazySoft, "lazySoft(...)");
        this._descriptor = lazySoftValLazySoft;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC31145n0 _descriptor$lambda$0(DescriptorKProperty descriptorKProperty) {
        return descriptorKProperty.getContainer().findPropertyDescriptor(descriptorKProperty.getName(), descriptorKProperty.getSignature());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Field _javaField$lambda$0(DescriptorKProperty descriptorKProperty) {
        Class<?> enclosingClass;
        JvmPropertySignature jvmPropertySignatureMapPropertySignature = RuntimeTypeMapper.INSTANCE.mapPropertySignature(descriptorKProperty.getDescriptor());
        if (!(jvmPropertySignatureMapPropertySignature instanceof JvmPropertySignature.KotlinProperty)) {
            if (jvmPropertySignatureMapPropertySignature instanceof JvmPropertySignature.JavaField) {
                return ((JvmPropertySignature.JavaField) jvmPropertySignatureMapPropertySignature).getField();
            }
            if ((jvmPropertySignatureMapPropertySignature instanceof JvmPropertySignature.JavaMethodProperty) || (jvmPropertySignatureMapPropertySignature instanceof JvmPropertySignature.MappedKotlinProperty)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        JvmPropertySignature.KotlinProperty kotlinProperty = (JvmPropertySignature.KotlinProperty) jvmPropertySignatureMapPropertySignature;
        InterfaceC31145n0 descriptor = kotlinProperty.getDescriptor();
        C36998i c36998i = C34727g.f146269a;
        C34724d c34724dM109650b = C34727g.m109650b(kotlinProperty.getProto(), kotlinProperty.getNameResolver(), kotlinProperty.getTypeTable(), true);
        if (c34724dM109650b == null) {
            return null;
        }
        if (AbstractC32410a.m101008Q(descriptor) || C34727g.m109652d(kotlinProperty.getProto())) {
            enclosingClass = descriptorKProperty.getContainer().getJClass().getEnclosingClass();
        } else {
            InterfaceC31135k interfaceC31135kMo60581g = descriptor.mo60581g();
            enclosingClass = interfaceC31135kMo60581g instanceof InterfaceC31117e ? UtilKt.toJavaClass((InterfaceC31117e) interfaceC31135kMo60581g) : descriptorKProperty.getContainer().getJClass();
        }
        if (enclosingClass == null) {
            return null;
        }
        try {
            return enclosingClass.getDeclaredField(c34724dM109650b.f146261x);
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    public final Member computeDelegateSource() {
        if (!getDescriptor().mo78675p()) {
            return null;
        }
        JvmPropertySignature jvmPropertySignatureMapPropertySignature = RuntimeTypeMapper.INSTANCE.mapPropertySignature(getDescriptor());
        if (jvmPropertySignatureMapPropertySignature instanceof JvmPropertySignature.KotlinProperty) {
            JvmPropertySignature.KotlinProperty kotlinProperty = (JvmPropertySignature.KotlinProperty) jvmPropertySignatureMapPropertySignature;
            if ((kotlinProperty.getSignature().f140695x & 16) == 16) {
                C33678d c33678d = kotlinProperty.getSignature().f140691G;
                int i13 = c33678d.f140678x;
                if ((i13 & 1) != 1 || (i13 & 2) != 2) {
                    return null;
                }
                return getContainer().findMethodBySignature(kotlinProperty.getNameResolver().getString(c33678d.f140679y), kotlinProperty.getNameResolver().getString(c33678d.f140680z));
            }
        }
        return getJavaField();
    }

    public boolean equals(Object other) {
        ReflectKProperty<?> reflectKPropertyAsReflectProperty = UtilKt.asReflectProperty(other);
        return reflectKPropertyAsReflectProperty != null && AbstractC22676k.m65745e(getContainer(), reflectKPropertyAsReflectProperty.getContainer()) && AbstractC22676k.m65745e(getName(), reflectKPropertyAsReflectProperty.getName()) && AbstractC22676k.m65745e(getSignature(), reflectKPropertyAsReflectProperty.getSignature()) && AbstractC22676k.m65745e(getRawBoundReceiver(), reflectKPropertyAsReflectProperty.getRawBoundReceiver());
    }

    public final Object getBoundReceiver() {
        return AbstractC17269i.m48919z(getRawBoundReceiver(), getDescriptor());
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKCallable
    public InterfaceC25339g getCaller() {
        return getGetter().getCaller();
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKCallable
    public KDeclarationContainerImpl getContainer() {
        return this.container;
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKCallable
    public InterfaceC25339g getDefaultCaller() {
        return getGetter().getDefaultCaller();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object getDelegateImpl(Member fieldOrMethod, Object receiver1, Object receiver2) throws IllegalPropertyDelegateAccessException {
        try {
            Object obj = EXTENSION_PROPERTY_DELEGATE;
            if ((receiver1 == obj || receiver2 == obj) && getDescriptor().mo78667B() == null) {
                throw new RuntimeException("'" + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object boundReceiver = ReflectKCallableKt.isBound(this) ? getBoundReceiver() : receiver1;
            if (boundReceiver == obj) {
                boundReceiver = null;
            }
            if (!ReflectKCallableKt.isBound(this)) {
                receiver1 = receiver2;
            }
            if (receiver1 == obj) {
                receiver1 = null;
            }
            AccessibleObject accessibleObject = fieldOrMethod instanceof AccessibleObject ? (AccessibleObject) fieldOrMethod : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(AbstractC37926s0.m121480t(this));
            }
            if (fieldOrMethod == 0) {
                return null;
            }
            if (fieldOrMethod instanceof Field) {
                return ((Field) fieldOrMethod).get(boundReceiver);
            }
            if (!(fieldOrMethod instanceof Method)) {
                throw new AssertionError("delegate field/method " + fieldOrMethod + " neither field nor method");
            }
            int length = ((Method) fieldOrMethod).getParameterTypes().length;
            if (length == 0) {
                return ((Method) fieldOrMethod).invoke(null, null);
            }
            if (length == 1) {
                Method method = (Method) fieldOrMethod;
                if (boundReceiver == null) {
                    Class<?> cls = ((Method) fieldOrMethod).getParameterTypes()[0];
                    AbstractC22676k.m65749i(cls, "get(...)");
                    boundReceiver = UtilKt.defaultPrimitiveValue(cls);
                }
                return method.invoke(null, boundReceiver);
            }
            if (length != 2) {
                throw new AssertionError("delegate method " + fieldOrMethod + " should take 0, 1, or 2 parameters");
            }
            Method method2 = (Method) fieldOrMethod;
            if (receiver1 == null) {
                Class<?> cls2 = ((Method) fieldOrMethod).getParameterTypes()[1];
                AbstractC22676k.m65749i(cls2, "get(...)");
                receiver1 = UtilKt.defaultPrimitiveValue(cls2);
            }
            return method2.invoke(null, boundReceiver, receiver1);
        } catch (IllegalAccessException e5) {
            throw new IllegalPropertyDelegateAccessException(e5);
        }
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKProperty, j93.InterfaceC21493z
    public abstract /* synthetic */ InterfaceC21486s getGetter();

    @Override // p715kotlin.reflect.jvm.internal.ReflectKProperty, j93.InterfaceC21493z
    public abstract Getter<V> getGetter();

    @Override // p715kotlin.reflect.jvm.internal.ReflectKProperty
    public Field getJavaField() {
        return (Field) this._javaField.getValue();
    }

    @Override // p715kotlin.reflect.jvm.internal.DescriptorKCallable, p715kotlin.reflect.jvm.internal.ReflectKCallable, j93.InterfaceC21459c
    public String getName() {
        return this.name;
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKCallable
    public Object getRawBoundReceiver() {
        return this.rawBoundReceiver;
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKProperty
    public String getSignature() {
        return this.signature;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getContainer().hashCode() * 31)) * 31);
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKProperty, j93.InterfaceC21493z
    public boolean isConst() {
        return getDescriptor().isConst();
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKProperty, j93.InterfaceC21493z
    public boolean isLateinit() {
        return getDescriptor().mo78672d0();
    }

    @Override // p715kotlin.reflect.jvm.internal.DescriptorKCallable, p715kotlin.reflect.jvm.internal.ReflectKCallable, j93.InterfaceC21459c
    public boolean isSuspend() {
        return false;
    }

    public String toString() {
        return ReflectionObjectRenderer.INSTANCE.renderProperty(this);
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\b¨\u0006\u001f"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;", "V", "Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;", "Lj93/s;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lr93/o0;", "descriptor$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", "descriptor", "Lm93/g;", "caller$delegate", "Ll83/h;", "getCaller", "()Lm93/g;", "caller", "getName", "name", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class Getter<V> extends Accessor<V, V> implements InterfaceC21486s {
        static final /* synthetic */ InterfaceC21493z[] $$delegatedProperties = {AbstractC22671h0.f89337a.property1(new C22693x(Getter.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", 0))};

        /* JADX INFO: renamed from: descriptor$delegate, reason: from kotlin metadata */
        private final ReflectProperties.LazySoftVal descriptor = ReflectProperties.lazySoft(new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty$Getter$$Lambda$0
            private final DescriptorKProperty.Getter arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return DescriptorKProperty.Getter.descriptor_delegate$lambda$0(this.arg$0);
            }
        });

        /* JADX INFO: renamed from: caller$delegate, reason: from kotlin metadata */
        private final InterfaceC23462h caller = AbstractC30060g.m92087G(EnumC23463i.f92934x, new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty$Getter$$Lambda$1
            private final DescriptorKProperty.Getter arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return DescriptorKProperty.Getter.caller_delegate$lambda$0(this.arg$0);
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC25339g caller_delegate$lambda$0(Getter getter) {
            return DescriptorKPropertyKt.computeCallerForAccessor(getter, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC31147o0 descriptor_delegate$lambda$0(Getter getter) {
            C34691n0 getter2 = getter.getProperty().getDescriptor().getGetter();
            return getter2 == null ? AbstractC39373p.m125571e(getter.getProperty().getDescriptor(), C32305g.f133684a) : getter2;
        }

        public boolean equals(Object other) {
            return (other instanceof Getter) && AbstractC22676k.m65745e(getProperty(), ((Getter) other).getProperty());
        }

        @Override // p715kotlin.reflect.jvm.internal.ReflectKCallable
        public InterfaceC25339g getCaller() {
            return (InterfaceC25339g) this.caller.getValue();
        }

        @Override // kotlin.reflect.jvm.internal.DescriptorKProperty.Accessor, p715kotlin.reflect.jvm.internal.DescriptorKCallable, p715kotlin.reflect.jvm.internal.ReflectKCallable, j93.InterfaceC21459c
        public String getName() {
            return "<get-" + getProperty().getName() + '>';
        }

        @Override // kotlin.reflect.jvm.internal.DescriptorKProperty.Accessor, j93.InterfaceC21485r
        public abstract /* synthetic */ InterfaceC21493z getProperty();

        public int hashCode() {
            return getProperty().hashCode();
        }

        public String toString() {
            return "getter of " + getProperty();
        }

        @Override // kotlin.reflect.jvm.internal.DescriptorKProperty.Accessor, p715kotlin.reflect.jvm.internal.DescriptorKCallable
        public InterfaceC31147o0 getDescriptor() {
            T value = this.descriptor.getValue(this, $$delegatedProperties[0]);
            AbstractC22676k.m65749i(value, "getValue(...)");
            return (InterfaceC31147o0) value;
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u00188VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\t¨\u0006 "}, m65681d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKProperty$Setter;", "V", "Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;", "Ll83/a0;", "Lj93/h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lr93/p0;", "descriptor$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", "descriptor", "Lm93/g;", "caller$delegate", "Ll83/h;", "getCaller", "()Lm93/g;", "caller", "getName", "name", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class Setter<V> extends Accessor<V, C23454a0> implements InterfaceC21469h {
        static final /* synthetic */ InterfaceC21493z[] $$delegatedProperties = {AbstractC22671h0.f89337a.property1(new C22693x(Setter.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", 0))};

        /* JADX INFO: renamed from: descriptor$delegate, reason: from kotlin metadata */
        private final ReflectProperties.LazySoftVal descriptor = ReflectProperties.lazySoft(new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty$Setter$$Lambda$0
            private final DescriptorKProperty.Setter arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return DescriptorKProperty.Setter.descriptor_delegate$lambda$0(this.arg$0);
            }
        });

        /* JADX INFO: renamed from: caller$delegate, reason: from kotlin metadata */
        private final InterfaceC23462h caller = AbstractC30060g.m92087G(EnumC23463i.f92934x, new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty$Setter$$Lambda$1
            private final DescriptorKProperty.Setter arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return DescriptorKProperty.Setter.caller_delegate$lambda$0(this.arg$0);
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC25339g caller_delegate$lambda$0(Setter setter) {
            return DescriptorKPropertyKt.computeCallerForAccessor(setter, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC31149p0 descriptor_delegate$lambda$0(Setter setter) {
            InterfaceC31149p0 setter2 = setter.getProperty().getDescriptor().getSetter();
            return setter2 == null ? AbstractC39373p.m125572f(setter.getProperty().getDescriptor(), C32305g.f133684a) : setter2;
        }

        public boolean equals(Object other) {
            return (other instanceof Setter) && AbstractC22676k.m65745e(getProperty(), ((Setter) other).getProperty());
        }

        @Override // p715kotlin.reflect.jvm.internal.ReflectKCallable
        public InterfaceC25339g getCaller() {
            return (InterfaceC25339g) this.caller.getValue();
        }

        @Override // kotlin.reflect.jvm.internal.DescriptorKProperty.Accessor, p715kotlin.reflect.jvm.internal.DescriptorKCallable, p715kotlin.reflect.jvm.internal.ReflectKCallable, j93.InterfaceC21459c
        public String getName() {
            return "<set-" + getProperty().getName() + '>';
        }

        @Override // kotlin.reflect.jvm.internal.DescriptorKProperty.Accessor, j93.InterfaceC21485r
        public abstract /* synthetic */ InterfaceC21493z getProperty();

        public int hashCode() {
            return getProperty().hashCode();
        }

        public String toString() {
            return "setter of " + getProperty();
        }

        @Override // kotlin.reflect.jvm.internal.DescriptorKProperty.Accessor, p715kotlin.reflect.jvm.internal.DescriptorKCallable
        public InterfaceC31149p0 getDescriptor() {
            T value = this.descriptor.getValue(this, $$delegatedProperties[0]);
            AbstractC22676k.m65749i(value, "getValue(...)");
            return (InterfaceC31149p0) value;
        }
    }

    @Override // p715kotlin.reflect.jvm.internal.DescriptorKCallable
    public InterfaceC31145n0 getDescriptor() {
        InterfaceC31145n0 interfaceC31145n0Invoke = this._descriptor.invoke();
        AbstractC22676k.m65749i(interfaceC31145n0Invoke, "invoke(...)");
        return interfaceC31145n0Invoke;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DescriptorKProperty(KDeclarationContainerImpl container, String name, String signature, Object obj) {
        this(container, name, signature, null, obj);
        AbstractC22676k.m65750j(container, "container");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DescriptorKProperty(KDeclarationContainerImpl container, InterfaceC31145n0 descriptor) {
        AbstractC22676k.m65750j(container, "container");
        AbstractC22676k.m65750j(descriptor, "descriptor");
        String strM113817b = descriptor.getName().m113817b();
        AbstractC22676k.m65749i(strM113817b, "asString(...)");
        this(container, strM113817b, RuntimeTypeMapper.INSTANCE.mapPropertySignature(descriptor).getString(), descriptor, AbstractC22660c.NO_RECEIVER);
    }
}
