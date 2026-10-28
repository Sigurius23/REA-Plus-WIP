package p715kotlin.reflect.jvm.internal;

import c93.InterfaceC4339a;
import j93.InterfaceC21475k;
import j93.InterfaceC21477l;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.full.IllegalCallableAccessException;
import q83.AbstractC30060g;
import r93.InterfaceC31145n0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u001dB\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB+\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty1;", "T", "V", "Lkotlin/reflect/jvm/internal/DescriptorKProperty1;", "Lj93/l;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lr93/n0;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "receiver", "value", "Ll83/a0;", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Ll83/h;", "Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty1$Setter;", "_setter", "Ll83/h;", "getSetter", "()Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty1$Setter;", "setter", "Setter", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DescriptorKMutableProperty1<T, V> extends DescriptorKProperty1<T, V> implements InterfaceC21477l {
    private final InterfaceC23462h _setter;

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00028\u00022\u0006\u0010\n\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty1$Setter;", "T", "V", "Lkotlin/reflect/jvm/internal/DescriptorKProperty$Setter;", "Lj93/k;", "Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty1;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty1;)V", "receiver", "value", "Ll83/a0;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty1;", "getProperty", "()Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty1;", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Setter<T, V> extends DescriptorKProperty.Setter<V> implements InterfaceC21475k {
        private final DescriptorKMutableProperty1<T, V> property;

        public Setter(DescriptorKMutableProperty1<T, V> property) {
            AbstractC22676k.m65750j(property, "property");
            this.property = property;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IllegalCallableAccessException {
            m134248invoke(obj, obj2);
            return C23454a0.f92919a;
        }

        @Override // kotlin.reflect.jvm.internal.DescriptorKProperty.Setter, kotlin.reflect.jvm.internal.DescriptorKProperty.Accessor, j93.InterfaceC21485r
        public DescriptorKMutableProperty1<T, V> getProperty() {
            return this.property;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public void m134248invoke(T receiver, V value) throws IllegalCallableAccessException {
            getProperty().set(receiver, value);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKMutableProperty1(KDeclarationContainerImpl container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        AbstractC22676k.m65750j(container, "container");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(signature, "signature");
        this._setter = AbstractC30060g.m92087G(EnumC23463i.f92934x, new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKMutableProperty1$$Lambda$0
            private final DescriptorKMutableProperty1 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return DescriptorKMutableProperty1._setter$lambda$0(this.arg$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Setter _setter$lambda$0(DescriptorKMutableProperty1 descriptorKMutableProperty1) {
        return new Setter(descriptorKMutableProperty1);
    }

    @Override // j93.InterfaceC21477l
    public void set(T receiver, V value) throws IllegalCallableAccessException {
        getSetter().call(receiver, value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKMutableProperty1(KDeclarationContainerImpl container, InterfaceC31145n0 descriptor) {
        super(container, descriptor);
        AbstractC22676k.m65750j(container, "container");
        AbstractC22676k.m65750j(descriptor, "descriptor");
        this._setter = AbstractC30060g.m92087G(EnumC23463i.f92934x, new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKMutableProperty1$$Lambda$0
            private final DescriptorKMutableProperty1 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return DescriptorKMutableProperty1._setter$lambda$0(this.arg$0);
            }
        });
    }

    @Override // j93.InterfaceC21477l, j93.InterfaceC21482o
    public Setter<T, V> getSetter() {
        return (Setter) this._setter.getValue();
    }
}
