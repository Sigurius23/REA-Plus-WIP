package p715kotlin.reflect.jvm.internal;

import c93.InterfaceC4339a;
import j93.InterfaceC21489v;
import j93.InterfaceC21490w;
import java.lang.reflect.Member;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import r93.InterfaceC31145n0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u001fB\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB+\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u0010J\u0017\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0018\u0010\u0015\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0013R&\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, m65681d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKProperty1;", "T", "V", "Lj93/w;", "Lkotlin/reflect/jvm/internal/DescriptorKProperty;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lr93/n0;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "receiver", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "getDelegate", "invoke", "Ll83/h;", "Lkotlin/reflect/jvm/internal/DescriptorKProperty1$Getter;", "_getter", "Ll83/h;", "Ljava/lang/reflect/Member;", "delegateSource", "getGetter", "()Lkotlin/reflect/jvm/internal/DescriptorKProperty1$Getter;", "getter", "Getter", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public class DescriptorKProperty1<T, V> extends DescriptorKProperty<V> implements InterfaceC21490w {
    private final InterfaceC23462h _getter;
    private final InterfaceC23462h delegateSource;

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0006\b\u0003\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00028\u00032\u0006\u0010\t\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKProperty1$Getter;", "T", "V", "Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;", "Lj93/v;", "Lkotlin/reflect/jvm/internal/DescriptorKProperty1;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/DescriptorKProperty1;)V", "receiver", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/DescriptorKProperty1;", "getProperty", "()Lkotlin/reflect/jvm/internal/DescriptorKProperty1;", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Getter<T, V> extends DescriptorKProperty.Getter<V> implements InterfaceC21489v {
        private final DescriptorKProperty1<T, V> property;

        /* JADX WARN: Multi-variable type inference failed */
        public Getter(DescriptorKProperty1<T, ? extends V> property) {
            AbstractC22676k.m65750j(property, "property");
            this.property = property;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public V invoke(T receiver) {
            return getProperty().get(receiver);
        }

        @Override // kotlin.reflect.jvm.internal.DescriptorKProperty.Getter, kotlin.reflect.jvm.internal.DescriptorKProperty.Accessor, j93.InterfaceC21485r
        public DescriptorKProperty1<T, V> getProperty() {
            return this.property;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKProperty1(KDeclarationContainerImpl container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        AbstractC22676k.m65750j(container, "container");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(signature, "signature");
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        this._getter = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty1$$Lambda$0
            private final DescriptorKProperty1 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return DescriptorKProperty1._getter$lambda$0(this.arg$0);
            }
        });
        this.delegateSource = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty1$$Lambda$1
            private final DescriptorKProperty1 arg$0;

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
    public static final Getter _getter$lambda$0(DescriptorKProperty1 descriptorKProperty1) {
        return new Getter(descriptorKProperty1);
    }

    @Override // j93.InterfaceC21490w
    public V get(T receiver) {
        return getGetter().call(receiver);
    }

    @Override // j93.InterfaceC21490w
    public Object getDelegate(T receiver) {
        return getDelegateImpl((Member) this.delegateSource.getValue(), receiver, null);
    }

    @Override // p715kotlin.jvm.functions.Function1
    public V invoke(T receiver) {
        return get(receiver);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKProperty1(KDeclarationContainerImpl container, InterfaceC31145n0 descriptor) {
        super(container, descriptor);
        AbstractC22676k.m65750j(container, "container");
        AbstractC22676k.m65750j(descriptor, "descriptor");
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        this._getter = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty1$$Lambda$0
            private final DescriptorKProperty1 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return DescriptorKProperty1._getter$lambda$0(this.arg$0);
            }
        });
        this.delegateSource = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty1$$Lambda$1
            private final DescriptorKProperty1 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return this.arg$0.computeDelegateSource();
            }
        });
    }

    @Override // p715kotlin.reflect.jvm.internal.DescriptorKProperty, p715kotlin.reflect.jvm.internal.ReflectKProperty, j93.InterfaceC21493z
    public Getter<T, V> getGetter() {
        return (Getter) this._getter.getValue();
    }
}
