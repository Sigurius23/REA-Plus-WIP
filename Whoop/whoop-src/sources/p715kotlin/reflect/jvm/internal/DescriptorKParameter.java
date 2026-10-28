package p715kotlin.reflect.jvm.internal;

import b93.C2892a;
import c93.InterfaceC4339a;
import cb3.AbstractC4393e;
import i93.C18284j;
import j93.EnumC21483p;
import j93.InterfaceC21456a0;
import j93.InterfaceC21493z;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import lb3.AbstractC23811y;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m93.C25335d0;
import m93.C25337e0;
import m93.InterfaceC25339g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22693x;
import r80.AbstractC31061c;
import r93.InterfaceC31107a1;
import r93.InterfaceC31117e;
import r93.InterfaceC31135k;
import r93.InterfaceC31139l0;
import r93.InterfaceC31151q0;
import u93.AbstractC34690n;
import u93.C34709w0;
import va3.C35850h;
import wb3.C37058h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u00018B1\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010(\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R!\u0010.\u001a\b\u0012\u0004\u0012\u00020*0)8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010-R\u0016\u00100\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u001bR\u0014\u00104\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00105\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00106¨\u00069"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKParameter;", "Lkotlin/reflect/jvm/internal/ReflectKParameter;", "Lkotlin/reflect/jvm/internal/DescriptorKCallable;", "callable", "", "index", "Lj93/p;", "kind", "Lkotlin/Function0;", "Lr93/l0;", "computeDescriptor", "<init>", "(Lkotlin/reflect/jvm/internal/DescriptorKCallable;ILj93/p;Lc93/a;)V", "", "Ljava/lang/reflect/Type;", "types", "compoundType", "([Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/DescriptorKCallable;", "getCallable", "()Lkotlin/reflect/jvm/internal/DescriptorKCallable;", "I", "getIndex", "Lj93/p;", "getKind", "()Lj93/p;", "descriptor$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", "descriptor", "", "", "annotations$delegate", "getAnnotations", "()Ljava/util/List;", "annotations", "getName", "name", "Lj93/a0;", "getType", "()Lj93/a0;", "type", "isOptional", "()Z", "isVararg", "CompoundTypeImpl", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DescriptorKParameter implements ReflectKParameter {
    static final /* synthetic */ InterfaceC21493z[] $$delegatedProperties;

    /* JADX INFO: renamed from: annotations$delegate, reason: from kotlin metadata */
    private final ReflectProperties.LazySoftVal annotations;
    private final DescriptorKCallable<?> callable;

    /* JADX INFO: renamed from: descriptor$delegate, reason: from kotlin metadata */
    private final ReflectProperties.LazySoftVal descriptor;
    private final int index;
    private final EnumC21483p kind;

    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\t\u001a\u00020\nH\u0096\u0080\u0004J\n\u0010\u0011\u001a\u00020\fH\u0096\u0080\u0004R\u001b\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKParameter$CompoundTypeImpl;", "Ljava/lang/reflect/Type;", "types", "", "<init>", "([Ljava/lang/reflect/Type;)V", "getTypes", "()[Ljava/lang/reflect/Type;", "[Ljava/lang/reflect/Type;", "hashCode", "", "getTypeName", "", "equals", "", "other", "", "toString", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class CompoundTypeImpl implements Type {
        private final int hashCode;
        private final Type[] types;

        public CompoundTypeImpl(Type[] types) {
            AbstractC22676k.m65750j(types, "types");
            this.types = types;
            this.hashCode = Arrays.hashCode(types);
        }

        public boolean equals(Object other) {
            return (other instanceof CompoundTypeImpl) && Arrays.equals(this.types, ((CompoundTypeImpl) other).types);
        }

        @Override // java.lang.reflect.Type
        public String getTypeName() {
            return AbstractC25260n.m74028D0(this.types, ", ", "[", "]", null, 56);
        }

        /* JADX INFO: renamed from: hashCode, reason: from getter */
        public int getHashCode() {
            return this.hashCode;
        }

        public String toString() {
            return getTypeName();
        }
    }

    static {
        C22693x c22693x = new C22693x(DescriptorKParameter.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        $$delegatedProperties = new InterfaceC21493z[]{c22673i0.property1(c22693x), AbstractC31061c.m95632h(DescriptorKParameter.class, "annotations", "getAnnotations()Ljava/util/List;", 0, c22673i0)};
    }

    public DescriptorKParameter(DescriptorKCallable<?> callable, int i13, EnumC21483p kind, InterfaceC4339a computeDescriptor) {
        AbstractC22676k.m65750j(callable, "callable");
        AbstractC22676k.m65750j(kind, "kind");
        AbstractC22676k.m65750j(computeDescriptor, "computeDescriptor");
        this.callable = callable;
        this.index = i13;
        this.kind = kind;
        this.descriptor = ReflectProperties.lazySoft(computeDescriptor);
        this.annotations = ReflectProperties.lazySoft(new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKParameter$$Lambda$0
            private final DescriptorKParameter arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return DescriptorKParameter.annotations_delegate$lambda$0(this.arg$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type _get_type_$lambda$0(DescriptorKParameter descriptorKParameter) {
        List listM74148s1;
        InterfaceC31139l0 descriptor = descriptorKParameter.getDescriptor();
        if ((descriptor instanceof InterfaceC31151q0) && AbstractC22676k.m65745e(UtilKt.getInstanceReceiverParameter(descriptorKParameter.getCallable().getDescriptor()), descriptor) && descriptorKParameter.getCallable().getDescriptor().getKind() == 2) {
            InterfaceC31135k interfaceC31135kMo60581g = descriptorKParameter.getCallable().getDescriptor().mo60581g();
            AbstractC22676k.m65748h(interfaceC31135kMo60581g, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Class<?> javaClass = UtilKt.toJavaClass((InterfaceC31117e) interfaceC31135kMo60581g);
            if (javaClass != null) {
                return javaClass;
            }
            throw new KotlinReflectionInternalError("Cannot determine receiver Java type of inherited declaration: " + descriptor);
        }
        InterfaceC25339g caller = descriptorKParameter.getCallable().getCaller();
        if (!(caller instanceof C25337e0)) {
            if (!(caller instanceof C25335d0)) {
                return (Type) caller.mo74408a().get(descriptorKParameter.getIndex());
            }
            Class[] clsArr = (Class[]) ((Collection) ((C25335d0) caller).f99360d.get(descriptorKParameter.getIndex())).toArray(new Class[0]);
            return descriptorKParameter.compoundType((Type[]) Arrays.copyOf(clsArr, clsArr.length));
        }
        if (ReflectKCallableKt.isBound(descriptorKParameter.getCallable())) {
            C25337e0 c25337e0 = (C25337e0) caller;
            C18284j c18284jM74411c = c25337e0.m74411c(descriptorKParameter.getIndex() + 1);
            int i13 = c25337e0.m74411c(0).f71134x + 1;
            listM74148s1 = AbstractC25265s.m74148s1(c25337e0.f99364b.mo74408a(), new C18284j(c18284jM74411c.f71133w - i13, c18284jM74411c.f71134x - i13, 1));
        } else {
            C25337e0 c25337e1 = (C25337e0) caller;
            listM74148s1 = AbstractC25265s.m74148s1(c25337e1.f99364b.mo74408a(), c25337e1.m74411c(descriptorKParameter.getIndex()));
        }
        Type[] typeArr = (Type[]) listM74148s1.toArray(new Type[0]);
        return descriptorKParameter.compoundType((Type[]) Arrays.copyOf(typeArr, typeArr.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List annotations_delegate$lambda$0(DescriptorKParameter descriptorKParameter) {
        return UtilKt.computeAnnotations(descriptorKParameter.getDescriptor());
    }

    private final Type compoundType(Type... types) {
        int length = types.length;
        if (length != 0) {
            return length != 1 ? new CompoundTypeImpl(types) : (Type) AbstractC25260n.m74037M0(types);
        }
        throw new C2892a("Expected at least 1 type for compound type");
    }

    private final InterfaceC31139l0 getDescriptor() {
        T value = this.descriptor.getValue(this, $$delegatedProperties[0]);
        AbstractC22676k.m65749i(value, "getValue(...)");
        return (InterfaceC31139l0) value;
    }

    public boolean equals(Object other) {
        if (!(other instanceof ReflectKParameter)) {
            return false;
        }
        ReflectKParameter reflectKParameter = (ReflectKParameter) other;
        return AbstractC22676k.m65745e(getCallable(), reflectKParameter.getCallable()) && getIndex() == reflectKParameter.getIndex();
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKParameter, j93.InterfaceC21457b
    public List<Annotation> getAnnotations() {
        T value = this.annotations.getValue(this, $$delegatedProperties[1]);
        AbstractC22676k.m65749i(value, "getValue(...)");
        return (List) value;
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKParameter, j93.InterfaceC21484q
    public int getIndex() {
        return this.index;
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKParameter, j93.InterfaceC21484q
    public EnumC21483p getKind() {
        return this.kind;
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKParameter, j93.InterfaceC21484q
    public String getName() {
        InterfaceC31135k descriptor = getDescriptor();
        InterfaceC31135k interfaceC31135k = descriptor instanceof InterfaceC31107a1 ? (InterfaceC31107a1) descriptor : null;
        if (interfaceC31135k != null && !((C34709w0) interfaceC31135k).mo60581g().mo48179S()) {
            C35850h name = ((AbstractC34690n) interfaceC31135k).getName();
            AbstractC22676k.m65749i(name, "getName(...)");
            if (!name.f152621x) {
                return name.m113817b();
            }
        }
        return null;
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKParameter, j93.InterfaceC21484q
    public InterfaceC21456a0 getType() {
        AbstractC23811y type = getDescriptor().getType();
        AbstractC22676k.m65749i(type, "getType(...)");
        return new C37058h(type, new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKParameter$$Lambda$1
            private final DescriptorKParameter arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return DescriptorKParameter._get_type_$lambda$0(this.arg$0);
            }
        });
    }

    public int hashCode() {
        return Integer.hashCode(getIndex()) + (getCallable().hashCode() * 31);
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKParameter, j93.InterfaceC21484q
    public boolean isOptional() {
        InterfaceC31139l0 descriptor = getDescriptor();
        InterfaceC31107a1 interfaceC31107a1 = descriptor instanceof InterfaceC31107a1 ? (InterfaceC31107a1) descriptor : null;
        if (interfaceC31107a1 != null) {
            return AbstractC4393e.m13803a(interfaceC31107a1);
        }
        return false;
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKParameter, j93.InterfaceC21484q
    public boolean isVararg() {
        InterfaceC31139l0 descriptor = getDescriptor();
        return (descriptor instanceof InterfaceC31107a1) && ((C34709w0) ((InterfaceC31107a1) descriptor)).f146190K != null;
    }

    public String toString() {
        return ReflectionObjectRenderer.INSTANCE.renderParameter(this);
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKParameter
    public DescriptorKCallable<?> getCallable() {
        return this.callable;
    }
}
