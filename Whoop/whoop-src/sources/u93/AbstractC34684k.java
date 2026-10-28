package u93;

import kb3.InterfaceC22345n;
import r93.InterfaceC31135k;
import r93.InterfaceC31155s0;
import va3.C35850h;

/* JADX INFO: renamed from: u93.k */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC34684k extends AbstractC34666b {

    /* JADX INFO: renamed from: E */
    public final InterfaceC31135k f146082E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC31155s0 f146083F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC34684k(InterfaceC22345n interfaceC22345n, InterfaceC31135k interfaceC31135k, C35850h c35850h, InterfaceC31155s0 interfaceC31155s0) {
        super(interfaceC22345n, c35850h);
        if (interfaceC22345n == null) {
            m109571E(0);
            throw null;
        }
        if (interfaceC31135k == null) {
            m109571E(1);
            throw null;
        }
        if (c35850h == null) {
            m109571E(2);
            throw null;
        }
        this.f146082E = interfaceC31135k;
        this.f146083F = interfaceC31155s0;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m109571E(int i13) {
        String str = (i13 == 4 || i13 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 4 || i13 == 5) ? 2 : 3];
        if (i13 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i13 == 2) {
            objArr[0] = "name";
        } else if (i13 == 3) {
            objArr[0] = "source";
        } else if (i13 == 4 || i13 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i13 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i13 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i13 != 4 && i13 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i13 != 4 && i13 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // r93.InterfaceC31135k
    /* JADX INFO: renamed from: g */
    public final InterfaceC31135k mo60581g() {
        InterfaceC31135k interfaceC31135k = this.f146082E;
        if (interfaceC31135k != null) {
            return interfaceC31135k;
        }
        m109571E(4);
        throw null;
    }

    @Override // r93.InterfaceC31138l
    public final InterfaceC31155s0 getSource() {
        InterfaceC31155s0 interfaceC31155s0 = this.f146083F;
        if (interfaceC31155s0 != null) {
            return interfaceC31155s0;
        }
        m109571E(5);
        throw null;
    }

    public boolean isExternal() {
        return false;
    }
}
