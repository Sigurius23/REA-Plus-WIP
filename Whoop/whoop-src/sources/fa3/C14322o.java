package fa3;

import fb3.InterfaceC14343d;
import r93.AbstractC31143m1;
import r93.AbstractC31146o;
import r93.InterfaceC31135k;
import r93.InterfaceC31144n;

/* JADX INFO: renamed from: fa3.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C14322o extends AbstractC31146o {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f52284b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14322o(AbstractC31143m1 abstractC31143m1, int i13) {
        super(abstractC31143m1);
        this.f52284b = i13;
    }

    @Override // r93.AbstractC31152r
    /* JADX INFO: renamed from: a */
    public final boolean mo40931a(InterfaceC14343d interfaceC14343d, InterfaceC31144n interfaceC31144n, InterfaceC31135k interfaceC31135k) {
        switch (this.f52284b) {
            case 0:
                if (interfaceC31135k != null) {
                    return AbstractC14323p.m40934c(interfaceC31144n, interfaceC31135k);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1", "isVisible"));
            case 1:
                if (interfaceC31135k != null) {
                    return AbstractC14323p.m40933b(interfaceC14343d, interfaceC31144n, interfaceC31135k);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2", "isVisible"));
            default:
                if (interfaceC31135k != null) {
                    return AbstractC14323p.m40933b(interfaceC14343d, interfaceC31144n, interfaceC31135k);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3", "isVisible"));
        }
    }
}
