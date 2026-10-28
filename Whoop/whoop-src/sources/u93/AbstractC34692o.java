package u93;

import r93.InterfaceC31135k;
import r93.InterfaceC31138l;
import r93.InterfaceC31155s0;
import s93.InterfaceC32307i;
import va3.C35850h;

/* JADX INFO: renamed from: u93.o */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC34692o extends AbstractC34690n implements InterfaceC31138l {

    /* JADX INFO: renamed from: E */
    public final InterfaceC31155s0 f146135E;

    /* JADX INFO: renamed from: z */
    public final InterfaceC31135k f146136z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC34692o(InterfaceC31135k interfaceC31135k, InterfaceC32307i interfaceC32307i, C35850h c35850h, InterfaceC31155s0 interfaceC31155s0) {
        super(interfaceC32307i, c35850h);
        if (interfaceC31135k == null) {
            m109598r0(0);
            throw null;
        }
        if (interfaceC32307i == null) {
            m109598r0(1);
            throw null;
        }
        if (c35850h == null) {
            m109598r0(2);
            throw null;
        }
        if (interfaceC31155s0 == null) {
            m109598r0(3);
            throw null;
        }
        this.f146136z = interfaceC31135k;
        this.f146135E = interfaceC31155s0;
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m109598r0(int i13) {
        String str = (i13 == 4 || i13 == 5 || i13 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 4 || i13 == 5 || i13 == 6) ? 2 : 3];
        switch (i13) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i13 == 4) {
            objArr[1] = "getOriginal";
        } else if (i13 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i13 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i13 != 4 && i13 != 5 && i13 != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i13 != 4 && i13 != 5 && i13 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // u93.AbstractC34690n, r93.InterfaceC31135k
    /* JADX INFO: renamed from: I0 */
    public InterfaceC31138l mo78660a() {
        return this;
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC31135k mo60581g() {
        InterfaceC31135k interfaceC31135k = this.f146136z;
        if (interfaceC31135k != null) {
            return interfaceC31135k;
        }
        m109598r0(5);
        throw null;
    }

    public InterfaceC31155s0 getSource() {
        InterfaceC31155s0 interfaceC31155s0 = this.f146135E;
        if (interfaceC31155s0 != null) {
            return interfaceC31155s0;
        }
        m109598r0(6);
        throw null;
    }
}
