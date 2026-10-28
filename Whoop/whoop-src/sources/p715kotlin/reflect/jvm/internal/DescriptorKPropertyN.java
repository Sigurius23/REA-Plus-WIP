package p715kotlin.reflect.jvm.internal;

import c93.InterfaceC4339a;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import r93.InterfaceC31145n0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0010B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKPropertyN;", "V", "Lkotlin/reflect/jvm/internal/DescriptorKProperty;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lr93/n0;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "Ll83/h;", "Lkotlin/reflect/jvm/internal/DescriptorKPropertyN$Getter;", "_getter", "Ll83/h;", "getGetter", "()Lkotlin/reflect/jvm/internal/DescriptorKPropertyN$Getter;", "getter", "Getter", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public class DescriptorKPropertyN<V> extends DescriptorKProperty<V> {
    private final InterfaceC23462h _getter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKPropertyN(KDeclarationContainerImpl container, InterfaceC31145n0 descriptor) {
        super(container, descriptor);
        AbstractC22676k.m65750j(container, "container");
        AbstractC22676k.m65750j(descriptor, "descriptor");
        this._getter = AbstractC30060g.m92087G(EnumC23463i.f92934x, new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKPropertyN$$Lambda$0
            private final DescriptorKPropertyN arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return DescriptorKPropertyN._getter$lambda$0(this.arg$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Getter _getter$lambda$0(DescriptorKPropertyN descriptorKPropertyN) {
        return new Getter(descriptorKPropertyN);
    }

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKPropertyN$Getter;", "V", "Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;", "property", "Lkotlin/reflect/jvm/internal/DescriptorKPropertyN;", "<init>", "(Lkotlin/reflect/jvm/internal/DescriptorKPropertyN;)V", "getProperty", "()Lkotlin/reflect/jvm/internal/DescriptorKPropertyN;", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Getter<V> extends DescriptorKProperty.Getter<V> {
        private final DescriptorKPropertyN<V> property;

        /* JADX WARN: Multi-variable type inference failed */
        public Getter(DescriptorKPropertyN<? extends V> property) {
            AbstractC22676k.m65750j(property, "property");
            this.property = property;
        }

        @Override // kotlin.reflect.jvm.internal.DescriptorKProperty.Getter, kotlin.reflect.jvm.internal.DescriptorKProperty.Accessor, j93.InterfaceC21485r
        public DescriptorKPropertyN<V> getProperty() {
            return this.property;
        }
    }

    @Override // p715kotlin.reflect.jvm.internal.DescriptorKProperty, p715kotlin.reflect.jvm.internal.ReflectKProperty, j93.InterfaceC21493z
    public Getter<V> getGetter() {
        return (Getter) this._getter.getValue();
    }
}
