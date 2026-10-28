package u93;

import kb3.InterfaceC22345n;
import lb3.EnumC23776g1;
import r93.C31161v0;
import r93.InterfaceC31135k;
import s93.InterfaceC32307i;
import va3.C35850h;

/* JADX INFO: renamed from: u93.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC34668c extends AbstractC34680i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC34668c(InterfaceC22345n interfaceC22345n, InterfaceC31135k interfaceC31135k, InterfaceC32307i interfaceC32307i, C35850h c35850h, EnumC23776g1 enumC23776g1, boolean z4, int i13, C31161v0 c31161v0) {
        super(interfaceC22345n, interfaceC31135k, interfaceC32307i, c35850h, enumC23776g1, z4, i13, c31161v0);
        if (interfaceC22345n == null) {
            m109556r0(0);
            throw null;
        }
        if (interfaceC31135k == null) {
            m109556r0(1);
            throw null;
        }
        if (c31161v0 != null) {
        } else {
            m109556r0(6);
            throw null;
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m109556r0(int i13) {
        Object[] objArr = new Object[3];
        switch (i13) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // u93.AbstractC34690n, al.AbstractC0954a
    public final String toString() {
        String str = "";
        String str2 = this.f146074G ? "reified " : "";
        if (getVariance() != EnumC23776g1.INVARIANT) {
            str = getVariance() + " ";
        }
        return str2 + str + getName();
    }
}
