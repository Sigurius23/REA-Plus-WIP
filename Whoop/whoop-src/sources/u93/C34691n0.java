package u93;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import lb3.AbstractC23811y;
import r93.AbstractC31152r;
import r93.EnumC31106a0;
import r93.InterfaceC31141m;
import r93.InterfaceC31145n0;
import r93.InterfaceC31147o0;
import r93.InterfaceC31155s0;
import s93.InterfaceC32307i;
import va3.C35850h;

/* JADX INFO: renamed from: u93.n0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34691n0 extends AbstractC34685k0 implements InterfaceC31147o0 {

    /* JADX INFO: renamed from: N */
    public AbstractC23811y f146133N;

    /* JADX INFO: renamed from: O */
    public final InterfaceC31147o0 f146134O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34691n0(InterfaceC31145n0 interfaceC31145n0, InterfaceC32307i interfaceC32307i, EnumC31106a0 enumC31106a0, AbstractC31152r abstractC31152r, boolean z4, boolean z13, boolean z14, int i13, InterfaceC31147o0 interfaceC31147o0, InterfaceC31155s0 interfaceC31155s0) {
        super(enumC31106a0, abstractC31152r, interfaceC31145n0, interfaceC32307i, C35850h.m113816g("<get-" + interfaceC31145n0.getName() + ">"), z4, z13, z14, i13, interfaceC31155s0);
        if (interfaceC31145n0 == null) {
            m109595r0(0);
            throw null;
        }
        if (interfaceC32307i == null) {
            m109595r0(1);
            throw null;
        }
        if (enumC31106a0 == null) {
            m109595r0(2);
            throw null;
        }
        if (abstractC31152r == null) {
            m109595r0(3);
            throw null;
        }
        if (i13 == 0) {
            m109595r0(4);
            throw null;
        }
        if (interfaceC31155s0 == null) {
            m109595r0(5);
            throw null;
        }
        this.f146134O = interfaceC31147o0 != null ? interfaceC31147o0 : this;
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m109595r0(int i13) {
        String str = (i13 == 6 || i13 == 7 || i13 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 6 || i13 == 7 || i13 == 8) ? 2 : 3];
        switch (i13) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i13 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i13 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i13 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i13 != 6 && i13 != 7 && i13 != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i13 != 6 && i13 != 7 && i13 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // u93.AbstractC34692o, u93.AbstractC34690n, r93.InterfaceC31135k
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public final InterfaceC31147o0 mo78660a() {
        InterfaceC31147o0 interfaceC31147o0 = this.f146134O;
        if (interfaceC31147o0 != null) {
            return interfaceC31147o0;
        }
        m109595r0(8);
        throw null;
    }

    /* JADX INFO: renamed from: M0 */
    public final void m109597M0(AbstractC23811y abstractC23811y) {
        if (abstractC23811y == null) {
            abstractC23811y = m109573J0().getType();
        }
        this.f146133N = abstractC23811y;
    }

    @Override // r93.InterfaceC31135k
    /* JADX INFO: renamed from: T */
    public final Object mo78659T(InterfaceC31141m interfaceC31141m, Object obj) {
        return interfaceC31141m.visitPropertyGetterDescriptor(this, obj);
    }

    @Override // r93.InterfaceC31108b
    public final AbstractC23811y getReturnType() {
        return this.f146133N;
    }

    @Override // r93.InterfaceC31111c, r93.InterfaceC31108b
    /* JADX INFO: renamed from: h */
    public final Collection mo78673h() {
        return m109574K0(true);
    }

    @Override // r93.InterfaceC31108b
    /* JADX INFO: renamed from: v */
    public final List mo78676v() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m109595r0(7);
        throw null;
    }
}
