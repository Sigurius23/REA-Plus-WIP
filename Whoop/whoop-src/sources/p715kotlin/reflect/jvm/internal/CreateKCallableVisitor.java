package p715kotlin.reflect.jvm.internal;

import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31145n0;
import r93.InterfaceC31162w;
import u93.AbstractC34694p;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/CreateKCallableVisitor;", "Lu93/p;", "Lkotlin/reflect/jvm/internal/DescriptorKCallable;", "Ll83/a0;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;)V", "Lr93/n0;", "descriptor", "data", "visitPropertyDescriptor", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Ll83/a0;)Lkotlin/reflect/jvm/internal/DescriptorKCallable;", "Lr93/w;", "visitFunctionDescriptor", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ll83/a0;)Lkotlin/reflect/jvm/internal/DescriptorKCallable;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public class CreateKCallableVisitor extends AbstractC34694p {
    private final KDeclarationContainerImpl container;

    public CreateKCallableVisitor(KDeclarationContainerImpl container) {
        AbstractC22676k.m65750j(container, "container");
        this.container = container;
    }

    @Override // r93.InterfaceC31141m
    public DescriptorKCallable<?> visitFunctionDescriptor(InterfaceC31162w descriptor, C23454a0 data) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC22676k.m65750j(data, "data");
        return new DescriptorKFunction(this.container, descriptor);
    }

    @Override // r93.InterfaceC31141m
    public DescriptorKCallable<?> visitPropertyDescriptor(InterfaceC31145n0 descriptor, C23454a0 data) {
        int i13;
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC22676k.m65750j(data, "data");
        List listMo78671c0 = descriptor.mo78671c0();
        AbstractC22676k.m65749i(listMo78671c0, "getContextReceiverParameters(...)");
        if (listMo78671c0.isEmpty()) {
            i13 = (descriptor.mo78677y() != null ? 1 : 0) + (descriptor.mo78667B() != null ? 1 : 0);
        } else {
            i13 = -1;
        }
        if (descriptor.mo78666A()) {
            if (i13 == -1) {
                return new DescriptorKMutablePropertyN(this.container, descriptor);
            }
            if (i13 == 0) {
                return new DescriptorKMutableProperty0(this.container, descriptor);
            }
            if (i13 == 1) {
                return new DescriptorKMutableProperty1(this.container, descriptor);
            }
            if (i13 == 2) {
                return new DescriptorKMutableProperty2(this.container, descriptor);
            }
        } else {
            if (i13 == -1) {
                return new DescriptorKPropertyN(this.container, descriptor);
            }
            if (i13 == 0) {
                return new DescriptorKProperty0(this.container, descriptor);
            }
            if (i13 == 1) {
                return new DescriptorKProperty1(this.container, descriptor);
            }
            if (i13 == 2) {
                return new DescriptorKProperty2(this.container, descriptor);
            }
        }
        throw new KotlinReflectionInternalError("Unsupported property: " + descriptor);
    }
}
