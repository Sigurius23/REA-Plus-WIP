package p715kotlin.reflect.jvm.internal;

import c93.InterfaceC4339a;
import j93.InterfaceC21487t;
import j93.InterfaceC21488u;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import r93.InterfaceC31145n0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u001cB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB+\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000fJ\u000f\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0011R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKProperty0;", "V", "Lj93/u;", "Lkotlin/reflect/jvm/internal/DescriptorKProperty;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lr93/n0;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "get", "()Ljava/lang/Object;", "getDelegate", "invoke", "Ll83/h;", "Lkotlin/reflect/jvm/internal/DescriptorKProperty0$Getter;", "_getter", "Ll83/h;", "delegateValue", "getGetter", "()Lkotlin/reflect/jvm/internal/DescriptorKProperty0$Getter;", "getter", "Getter", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public class DescriptorKProperty0<V> extends DescriptorKProperty<V> implements InterfaceC21488u {
    private final InterfaceC23462h _getter;
    private final InterfaceC23462h delegateValue;

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKProperty0$Getter;", "R", "Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;", "Lj93/t;", "Lkotlin/reflect/jvm/internal/DescriptorKProperty0;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/DescriptorKProperty0;)V", "invoke", "()Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/DescriptorKProperty0;", "getProperty", "()Lkotlin/reflect/jvm/internal/DescriptorKProperty0;", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Getter<R> extends DescriptorKProperty.Getter<R> implements InterfaceC21487t {
        private final DescriptorKProperty0<R> property;

        /* JADX WARN: Multi-variable type inference failed */
        public Getter(DescriptorKProperty0<? extends R> property) {
            AbstractC22676k.m65750j(property, "property");
            this.property = property;
        }

        @Override // c93.InterfaceC4339a
        public R invoke() {
            return getProperty().get();
        }

        @Override // kotlin.reflect.jvm.internal.DescriptorKProperty.Getter, kotlin.reflect.jvm.internal.DescriptorKProperty.Accessor, j93.InterfaceC21485r
        public DescriptorKProperty0<R> getProperty() {
            return this.property;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKProperty0(KDeclarationContainerImpl container, InterfaceC31145n0 descriptor) {
        super(container, descriptor);
        AbstractC22676k.m65750j(container, "container");
        AbstractC22676k.m65750j(descriptor, "descriptor");
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        this._getter = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty0$$Lambda$0
            private final DescriptorKProperty0 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return DescriptorKProperty0._getter$lambda$0(this.arg$0);
            }
        });
        this.delegateValue = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty0$$Lambda$1
            private final DescriptorKProperty0 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return DescriptorKProperty0.delegateValue$lambda$0(this.arg$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Getter _getter$lambda$0(DescriptorKProperty0 descriptorKProperty0) {
        return new Getter(descriptorKProperty0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object delegateValue$lambda$0(DescriptorKProperty0 descriptorKProperty0) {
        return descriptorKProperty0.getDelegateImpl(descriptorKProperty0.computeDelegateSource(), null, null);
    }

    @Override // j93.InterfaceC21488u
    public V get() {
        return getGetter().call(new Object[0]);
    }

    @Override // j93.InterfaceC21488u
    public Object getDelegate() {
        return this.delegateValue.getValue();
    }

    @Override // c93.InterfaceC4339a
    public V invoke() {
        return get();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKProperty0(KDeclarationContainerImpl container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        AbstractC22676k.m65750j(container, "container");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(signature, "signature");
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        this._getter = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty0$$Lambda$0
            private final DescriptorKProperty0 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return DescriptorKProperty0._getter$lambda$0(this.arg$0);
            }
        });
        this.delegateValue = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty0$$Lambda$1
            private final DescriptorKProperty0 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return DescriptorKProperty0.delegateValue$lambda$0(this.arg$0);
            }
        });
    }

    @Override // p715kotlin.reflect.jvm.internal.DescriptorKProperty, p715kotlin.reflect.jvm.internal.ReflectKProperty, j93.InterfaceC21493z
    public Getter<V> getGetter() {
        return (Getter) this._getter.getValue();
    }
}
