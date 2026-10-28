package p715kotlin.reflect.jvm.internal;

import c93.InterfaceC4339a;
import j93.InterfaceC21471i;
import j93.InterfaceC21473j;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.full.IllegalCallableAccessException;
import q83.AbstractC30060g;
import r93.InterfaceC31145n0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u001bB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB+\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;", "V", "Lkotlin/reflect/jvm/internal/DescriptorKProperty0;", "Lj93/j;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lr93/n0;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "value", "Ll83/a0;", "set", "(Ljava/lang/Object;)V", "Ll83/h;", "Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0$Setter;", "_setter", "Ll83/h;", "getSetter", "()Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0$Setter;", "setter", "Setter", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DescriptorKMutableProperty0<V> extends DescriptorKProperty0<V> implements InterfaceC21473j {
    private final InterfaceC23462h _setter;

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0$Setter;", "R", "Lkotlin/reflect/jvm/internal/DescriptorKProperty$Setter;", "Lj93/i;", "Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;)V", "value", "Ll83/a0;", "invoke", "(Ljava/lang/Object;)V", "Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;", "getProperty", "()Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Setter<R> extends DescriptorKProperty.Setter<R> implements InterfaceC21471i {
        private final DescriptorKMutableProperty0<R> property;

        public Setter(DescriptorKMutableProperty0<R> property) {
            AbstractC22676k.m65750j(property, "property");
            this.property = property;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws IllegalCallableAccessException {
            m134247invoke(obj);
            return C23454a0.f92919a;
        }

        @Override // kotlin.reflect.jvm.internal.DescriptorKProperty.Setter, kotlin.reflect.jvm.internal.DescriptorKProperty.Accessor, j93.InterfaceC21485r
        public DescriptorKMutableProperty0<R> getProperty() {
            return this.property;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public void m134247invoke(R value) throws IllegalCallableAccessException {
            getProperty().set(value);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKMutableProperty0(KDeclarationContainerImpl container, InterfaceC31145n0 descriptor) {
        super(container, descriptor);
        AbstractC22676k.m65750j(container, "container");
        AbstractC22676k.m65750j(descriptor, "descriptor");
        this._setter = AbstractC30060g.m92087G(EnumC23463i.f92934x, new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKMutableProperty0$$Lambda$0
            private final DescriptorKMutableProperty0 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return DescriptorKMutableProperty0._setter$lambda$0(this.arg$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Setter _setter$lambda$0(DescriptorKMutableProperty0 descriptorKMutableProperty0) {
        return new Setter(descriptorKMutableProperty0);
    }

    @Override // j93.InterfaceC21473j
    public void set(V value) throws IllegalCallableAccessException {
        getSetter().call(value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKMutableProperty0(KDeclarationContainerImpl container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        AbstractC22676k.m65750j(container, "container");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(signature, "signature");
        this._setter = AbstractC30060g.m92087G(EnumC23463i.f92934x, new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKMutableProperty0$$Lambda$0
            private final DescriptorKMutableProperty0 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return DescriptorKMutableProperty0._setter$lambda$0(this.arg$0);
            }
        });
    }

    @Override // j93.InterfaceC21473j, j93.InterfaceC21482o
    public Setter<V> getSetter() {
        return (Setter) this._setter.getValue();
    }
}
