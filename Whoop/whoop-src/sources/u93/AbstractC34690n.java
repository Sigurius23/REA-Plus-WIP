package u93;

import al.AbstractC0954a;
import r93.InterfaceC31135k;
import s93.InterfaceC32307i;
import va3.C35850h;
import xa3.C38148i;

/* JADX INFO: renamed from: u93.n */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC34690n extends AbstractC0954a implements InterfaceC31135k {

    /* JADX INFO: renamed from: y */
    public final C35850h f146132y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC34690n(InterfaceC32307i interfaceC32307i, C35850h c35850h) {
        super(interfaceC32307i);
        if (interfaceC32307i == null) {
            m109594r0(0);
            throw null;
        }
        if (c35850h == null) {
            m109594r0(1);
            throw null;
        }
        this.f146132y = c35850h;
    }

    /* JADX INFO: renamed from: H0 */
    public static String m109593H0(InterfaceC31135k interfaceC31135k) {
        try {
            String str = C38148i.f163320e.m122219w(interfaceC31135k) + "[" + interfaceC31135k.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(interfaceC31135k)) + "]";
            if (str != null) {
                return str;
            }
            m109594r0(5);
            throw null;
        } catch (Throwable unused) {
            String str2 = interfaceC31135k.getClass().getSimpleName() + " " + interfaceC31135k.getName();
            if (str2 != null) {
                return str2;
            }
            m109594r0(6);
            throw null;
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m109594r0(int i13) {
        String str = (i13 == 2 || i13 == 3 || i13 == 5 || i13 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 2 || i13 == 3 || i13 == 5 || i13 == 6) ? 2 : 3];
        switch (i13) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i13 == 2) {
            objArr[1] = "getName";
        } else if (i13 == 3) {
            objArr[1] = "getOriginal";
        } else if (i13 == 5 || i13 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i13 != 2 && i13 != 3) {
            if (i13 == 4) {
                objArr[2] = "toString";
            } else if (i13 != 5 && i13 != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i13 != 2 && i13 != 3 && i13 != 5 && i13 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC31135k mo78660a() {
        return this;
    }

    @Override // r93.InterfaceC31135k
    public final C35850h getName() {
        C35850h c35850h = this.f146132y;
        if (c35850h != null) {
            return c35850h;
        }
        m109594r0(2);
        throw null;
    }

    @Override // al.AbstractC0954a
    public String toString() {
        return m109593H0(this);
    }
}
