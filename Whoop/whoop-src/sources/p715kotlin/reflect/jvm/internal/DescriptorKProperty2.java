package p715kotlin.reflect.jvm.internal;

import c93.InterfaceC4339a;
import j93.InterfaceC21491x;
import j93.InterfaceC21492y;
import java.lang.reflect.Member;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22660c;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import r93.InterfaceC31145n0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005:\u0001 B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000fJ\u001f\u0010\u0012\u001a\u00028\u00022\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J \u0010\u0016\u001a\u00028\u00022\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0013R,\u0010\u0019\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR&\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKProperty2;", "D", "E", "V", "Lj93/y;", "Lkotlin/reflect/jvm/internal/DescriptorKProperty;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lr93/n0;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;)V", "receiver1", "receiver2", "get", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "getDelegate", "invoke", "Ll83/h;", "Lkotlin/reflect/jvm/internal/DescriptorKProperty2$Getter;", "_getter", "Ll83/h;", "Ljava/lang/reflect/Member;", "delegateSource", "getGetter", "()Lkotlin/reflect/jvm/internal/DescriptorKProperty2$Getter;", "getter", "Getter", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public class DescriptorKProperty2<D, E, V> extends DescriptorKProperty<V> implements InterfaceC21492y {
    private final InterfaceC23462h _getter;
    private final InterfaceC23462h delegateSource;

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0006\b\u0005\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005B!\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\u00028\u00052\u0006\u0010\n\u001a\u00028\u00032\u0006\u0010\u000b\u001a\u00028\u0004H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR,\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKProperty2$Getter;", "D", "E", "V", "Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;", "Lj93/x;", "Lkotlin/reflect/jvm/internal/DescriptorKProperty2;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/DescriptorKProperty2;)V", "receiver1", "receiver2", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/DescriptorKProperty2;", "getProperty", "()Lkotlin/reflect/jvm/internal/DescriptorKProperty2;", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Getter<D, E, V> extends DescriptorKProperty.Getter<V> implements InterfaceC21491x {
        private final DescriptorKProperty2<D, E, V> property;

        /* JADX WARN: Multi-variable type inference failed */
        public Getter(DescriptorKProperty2<D, E, ? extends V> property) {
            AbstractC22676k.m65750j(property, "property");
            this.property = property;
        }

        @Override // c93.InterfaceC4351m
        public V invoke(D receiver1, E receiver2) {
            return getProperty().get(receiver1, receiver2);
        }

        @Override // kotlin.reflect.jvm.internal.DescriptorKProperty.Getter, kotlin.reflect.jvm.internal.DescriptorKProperty.Accessor, j93.InterfaceC21485r
        public DescriptorKProperty2<D, E, V> getProperty() {
            return this.property;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKProperty2(KDeclarationContainerImpl container, String name, String signature) {
        super(container, name, signature, AbstractC22660c.NO_RECEIVER);
        AbstractC22676k.m65750j(container, "container");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(signature, "signature");
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        this._getter = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty2$$Lambda$0
            private final DescriptorKProperty2 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return DescriptorKProperty2._getter$lambda$0(this.arg$0);
            }
        });
        this.delegateSource = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty2$$Lambda$1
            private final DescriptorKProperty2 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return this.arg$0.computeDelegateSource();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Getter _getter$lambda$0(DescriptorKProperty2 descriptorKProperty2) {
        return new Getter(descriptorKProperty2);
    }

    public V get(D receiver1, E receiver2) {
        return getGetter().call(receiver1, receiver2);
    }

    public Object getDelegate(D receiver1, E receiver2) {
        return getDelegateImpl((Member) this.delegateSource.getValue(), receiver1, receiver2);
    }

    @Override // c93.InterfaceC4351m
    public V invoke(D receiver1, E receiver2) {
        return get(receiver1, receiver2);
    }

    @Override // p715kotlin.reflect.jvm.internal.DescriptorKProperty, p715kotlin.reflect.jvm.internal.ReflectKProperty, j93.InterfaceC21493z
    public Getter<D, E, V> getGetter() {
        return (Getter) this._getter.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKProperty2(KDeclarationContainerImpl container, InterfaceC31145n0 descriptor) {
        super(container, descriptor);
        AbstractC22676k.m65750j(container, "container");
        AbstractC22676k.m65750j(descriptor, "descriptor");
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        this._getter = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty2$$Lambda$0
            private final DescriptorKProperty2 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return DescriptorKProperty2._getter$lambda$0(this.arg$0);
            }
        });
        this.delegateSource = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty2$$Lambda$1
            private final DescriptorKProperty2 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return this.arg$0.computeDelegateSource();
            }
        });
    }
}
