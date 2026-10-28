package p715kotlin.reflect.jvm.internal;

import c93.InterfaceC4339a;
import j93.InterfaceC21482o;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import r93.InterfaceC31145n0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0011B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN;", "V", "Lkotlin/reflect/jvm/internal/DescriptorKPropertyN;", "Lj93/o;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lr93/n0;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "Ll83/h;", "Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN$Setter;", "_setter", "Ll83/h;", "getSetter", "()Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN$Setter;", "setter", "Setter", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DescriptorKMutablePropertyN<V> extends DescriptorKPropertyN<V> implements InterfaceC21482o {
    private final InterfaceC23462h _setter;

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN$Setter;", "V", "Lkotlin/reflect/jvm/internal/DescriptorKProperty$Setter;", "property", "Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN;", "<init>", "(Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN;)V", "getProperty", "()Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN;", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Setter<V> extends DescriptorKProperty.Setter<V> {
        private final DescriptorKMutablePropertyN<V> property;

        public Setter(DescriptorKMutablePropertyN<V> property) {
            AbstractC22676k.m65750j(property, "property");
            this.property = property;
        }

        @Override // kotlin.reflect.jvm.internal.DescriptorKProperty.Setter, kotlin.reflect.jvm.internal.DescriptorKProperty.Accessor, j93.InterfaceC21485r
        public DescriptorKMutablePropertyN<V> getProperty() {
            return this.property;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKMutablePropertyN(KDeclarationContainerImpl container, InterfaceC31145n0 descriptor) {
        super(container, descriptor);
        AbstractC22676k.m65750j(container, "container");
        AbstractC22676k.m65750j(descriptor, "descriptor");
        this._setter = AbstractC30060g.m92087G(EnumC23463i.f92934x, new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKMutablePropertyN$$Lambda$0
            private final DescriptorKMutablePropertyN arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return DescriptorKMutablePropertyN._setter$lambda$0(this.arg$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Setter _setter$lambda$0(DescriptorKMutablePropertyN descriptorKMutablePropertyN) {
        return new Setter(descriptorKMutablePropertyN);
    }

    @Override // j93.InterfaceC21482o
    public Setter<V> getSetter() {
        return (Setter) this._setter.getValue();
    }
}
