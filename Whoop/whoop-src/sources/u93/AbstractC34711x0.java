package u93;

import java.util.Collections;
import java.util.List;
import lb3.AbstractC23811y;
import r93.InterfaceC31110b1;
import r93.InterfaceC31135k;
import r93.InterfaceC31151q0;
import r93.InterfaceC31155s0;
import s93.InterfaceC32307i;
import va3.C35850h;

/* JADX INFO: renamed from: u93.x0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC34711x0 extends AbstractC34692o implements InterfaceC31110b1 {

    /* JADX INFO: renamed from: F */
    public AbstractC23811y f146217F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC34711x0(InterfaceC31135k interfaceC31135k, InterfaceC32307i interfaceC32307i, C35850h c35850h, AbstractC23811y abstractC23811y, InterfaceC31155s0 interfaceC31155s0) {
        super(interfaceC31135k, interfaceC32307i, c35850h, interfaceC31155s0);
        if (interfaceC31135k == null) {
            m109634r0(0);
            throw null;
        }
        if (interfaceC32307i == null) {
            m109634r0(1);
            throw null;
        }
        if (c35850h == null) {
            m109634r0(2);
            throw null;
        }
        if (interfaceC31155s0 == null) {
            m109634r0(3);
            throw null;
        }
        this.f146217F = abstractC23811y;
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m109634r0(int i13) {
        String str;
        int i14;
        switch (i13) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i13) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i14 = 2;
                break;
            default:
                i14 = 3;
                break;
        }
        Object[] objArr = new Object[i14];
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
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i13) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i13) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i13) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: B */
    public InterfaceC31151q0 mo78667B() {
        return null;
    }

    /* JADX INFO: renamed from: S */
    public boolean mo48179S() {
        return false;
    }

    public AbstractC23811y getReturnType() {
        AbstractC23811y type = getType();
        if (type != null) {
            return type;
        }
        m109634r0(10);
        throw null;
    }

    @Override // r93.InterfaceC31169z0
    public final AbstractC23811y getType() {
        AbstractC23811y abstractC23811y = this.f146217F;
        if (abstractC23811y != null) {
            return abstractC23811y;
        }
        m109634r0(4);
        throw null;
    }

    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m109634r0(8);
        throw null;
    }

    @Override // r93.InterfaceC31108b
    /* JADX INFO: renamed from: v */
    public final List mo78676v() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m109634r0(6);
        throw null;
    }

    /* JADX INFO: renamed from: y */
    public InterfaceC31151q0 mo78677y() {
        return null;
    }
}
