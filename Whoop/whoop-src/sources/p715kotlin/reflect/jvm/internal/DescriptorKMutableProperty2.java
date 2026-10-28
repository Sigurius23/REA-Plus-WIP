package p715kotlin.reflect.jvm.internal;

import c93.InterfaceC4339a;
import j93.InterfaceC21479m;
import j93.InterfaceC21481n;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.full.IllegalCallableAccessException;
import q83.AbstractC30060g;
import r93.InterfaceC31145n0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\u001dB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u0012\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R,\u0010\u0018\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R&\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty2;", "D", "E", "V", "Lkotlin/reflect/jvm/internal/DescriptorKProperty2;", "Lj93/n;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lr93/n0;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;)V", "receiver1", "receiver2", "value", "Ll83/a0;", "set", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "Ll83/h;", "Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty2$Setter;", "_setter", "Ll83/h;", "getSetter", "()Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty2$Setter;", "setter", "Setter", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DescriptorKMutableProperty2<D, E, V> extends DescriptorKProperty2<D, E, V> implements InterfaceC21481n {
    private final InterfaceC23462h _setter;

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0004\b\u0005\u0010\u00032\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005B!\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00028\u00032\u0006\u0010\u000b\u001a\u00028\u00042\u0006\u0010\f\u001a\u00028\u0005H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR,\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty2$Setter;", "D", "E", "V", "Lkotlin/reflect/jvm/internal/DescriptorKProperty$Setter;", "Lj93/m;", "Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty2;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty2;)V", "receiver1", "receiver2", "value", "Ll83/a0;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty2;", "getProperty", "()Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty2;", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Setter<D, E, V> extends DescriptorKProperty.Setter<V> implements InterfaceC21479m {
        private final DescriptorKMutableProperty2<D, E, V> property;

        public Setter(DescriptorKMutableProperty2<D, E, V> property) {
            AbstractC22676k.m65750j(property, "property");
            this.property = property;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws IllegalCallableAccessException {
            m134249invoke(obj, obj2, obj3);
            return C23454a0.f92919a;
        }

        @Override // kotlin.reflect.jvm.internal.DescriptorKProperty.Setter, kotlin.reflect.jvm.internal.DescriptorKProperty.Accessor, j93.InterfaceC21485r
        public DescriptorKMutableProperty2<D, E, V> getProperty() {
            return this.property;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public void m134249invoke(D receiver1, E receiver2, V value) throws IllegalCallableAccessException {
            getProperty().set(receiver1, receiver2, value);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKMutableProperty2(KDeclarationContainerImpl container, String name, String signature) {
        super(container, name, signature);
        AbstractC22676k.m65750j(container, "container");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(signature, "signature");
        this._setter = AbstractC30060g.m92087G(EnumC23463i.f92934x, new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKMutableProperty2$$Lambda$0
            private final DescriptorKMutableProperty2 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return DescriptorKMutableProperty2._setter$lambda$0(this.arg$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Setter _setter$lambda$0(DescriptorKMutableProperty2 descriptorKMutableProperty2) {
        return new Setter(descriptorKMutableProperty2);
    }

    public void set(D receiver1, E receiver2, V value) throws IllegalCallableAccessException {
        getSetter().call(receiver1, receiver2, value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKMutableProperty2(KDeclarationContainerImpl container, InterfaceC31145n0 descriptor) {
        super(container, descriptor);
        AbstractC22676k.m65750j(container, "container");
        AbstractC22676k.m65750j(descriptor, "descriptor");
        this._setter = AbstractC30060g.m92087G(EnumC23463i.f92934x, new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKMutableProperty2$$Lambda$0
            private final DescriptorKMutableProperty2 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return DescriptorKMutableProperty2._setter$lambda$0(this.arg$0);
            }
        });
    }

    @Override // j93.InterfaceC21482o
    public Setter<D, E, V> getSetter() {
        return (Setter) this._setter.getValue();
    }
}
