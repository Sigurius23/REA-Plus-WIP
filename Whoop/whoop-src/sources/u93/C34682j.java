package u93;

import androidx.health.platform.client.proto.C1533u;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import lb3.C23758a1;
import q63.AbstractC30007c;
import r93.AbstractC31146o;
import r93.AbstractC31152r;
import r93.EnumC31106a0;
import r93.InterfaceC31111c;
import r93.InterfaceC31117e;
import r93.InterfaceC31132j;
import r93.InterfaceC31135k;
import r93.InterfaceC31141m;
import r93.InterfaceC31151q0;
import r93.InterfaceC31155s0;
import r93.InterfaceC31162w;
import s93.InterfaceC32307i;
import va3.AbstractC35852j;
import va3.C35850h;

/* JADX INFO: renamed from: u93.j */
/* JADX INFO: loaded from: classes5.dex */
public class C34682j extends AbstractC34710x implements InterfaceC31132j {

    /* JADX INFO: renamed from: e0 */
    public final boolean f146080e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34682j(InterfaceC31117e interfaceC31117e, InterfaceC31132j interfaceC31132j, InterfaceC32307i interfaceC32307i, boolean z4, int i13, InterfaceC31155s0 interfaceC31155s0) {
        super(i13, interfaceC31117e, interfaceC31132j, interfaceC31155s0, interfaceC32307i, AbstractC35852j.f152628e);
        if (interfaceC31117e == null) {
            m109565r0(0);
            throw null;
        }
        if (interfaceC32307i == null) {
            m109565r0(1);
            throw null;
        }
        if (i13 == 0) {
            m109565r0(2);
            throw null;
        }
        if (interfaceC31155s0 == null) {
            m109565r0(3);
            throw null;
        }
        this.f146080e0 = z4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m109565r0(int i13) {
        String str;
        int i14;
        if (i13 != 21 && i13 != 27) {
            switch (i13) {
                case 15:
                case 16:
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i13 != 21 && i13 != 27) {
            switch (i13) {
                case 15:
                case 16:
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    i14 = 2;
                    break;
                default:
                    i14 = 3;
                    break;
            }
        } else {
            i14 = 2;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
            case 5:
            case 8:
            case 25:
                objArr[0] = "annotations";
                break;
            case 2:
            case 24:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case 26:
                objArr[0] = "source";
                break;
            case 4:
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case 16:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 21:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                objArr[0] = "overriddenDescriptors";
                break;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                objArr[0] = "newOwner";
                break;
        }
        if (i13 == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i13 != 27) {
            switch (i13) {
                case 15:
                case 16:
                    objArr[1] = "calculateContextReceiverParameters";
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                    objArr[1] = "getConstructedClass";
                    break;
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i13) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[2] = "initialize";
                break;
            case 15:
            case 16:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 21:
            case 27:
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 24:
            case 25:
            case 26:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 21 && i13 != 27) {
            switch (i13) {
                case 15:
                case 16:
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override // r93.InterfaceC31132j
    /* JADX INFO: renamed from: O */
    public final boolean mo95869O() {
        return this.f146080e0;
    }

    @Override // r93.InterfaceC31132j
    /* JADX INFO: renamed from: P */
    public final InterfaceC31117e mo95870P() {
        InterfaceC31117e interfaceC31117eMo60581g = mo60581g();
        if (interfaceC31117eMo60581g != null) {
            return interfaceC31117eMo60581g;
        }
        m109565r0(18);
        throw null;
    }

    @Override // u93.AbstractC34710x, r93.InterfaceC31135k
    /* JADX INFO: renamed from: T */
    public final Object mo78659T(InterfaceC31141m interfaceC31141m, Object obj) {
        return interfaceC31141m.visitConstructorDescriptor(this, obj);
    }

    @Override // u93.AbstractC34710x
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public C34682j mo48177L0(int i13, InterfaceC31135k interfaceC31135k, InterfaceC31162w interfaceC31162w, InterfaceC31155s0 interfaceC31155s0, InterfaceC32307i interfaceC32307i, C35850h c35850h) {
        if (interfaceC31135k == null) {
            m109565r0(23);
            throw null;
        }
        if (i13 == 0) {
            m109565r0(24);
            throw null;
        }
        if (interfaceC32307i == null) {
            m109565r0(25);
            throw null;
        }
        if (i13 == 1 || i13 == 4) {
            return new C34682j((InterfaceC31117e) interfaceC31135k, this, interfaceC32307i, this.f146080e0, 1, interfaceC31155s0);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC31135k + "\nkind: " + AbstractC30007c.m91830E(i13));
    }

    @Override // u93.AbstractC34692o, r93.InterfaceC31135k
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public final InterfaceC31117e mo60581g() {
        InterfaceC31117e interfaceC31117e = (InterfaceC31117e) super.mo60581g();
        if (interfaceC31117e != null) {
            return interfaceC31117e;
        }
        m109565r0(17);
        throw null;
    }

    @Override // u93.AbstractC34710x, u93.AbstractC34692o, u93.AbstractC34690n, r93.InterfaceC31135k
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C34682j mo78660a() {
        C34682j c34682j = (C34682j) super.mo78660a();
        if (c34682j != null) {
            return c34682j;
        }
        m109565r0(19);
        throw null;
    }

    /* JADX INFO: renamed from: X0 */
    public final void m109568X0(List list, AbstractC31152r abstractC31152r) {
        if (list == null) {
            m109565r0(13);
            throw null;
        }
        if (abstractC31152r != null) {
            m109569Y0(list, abstractC31152r, mo60581g().mo60497j());
        } else {
            m109565r0(14);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    /* JADX INFO: renamed from: Y0 */
    public final void m109569Y0(List list, AbstractC31152r abstractC31152r, List list2) {
        InterfaceC31151q0 interfaceC31151q0Mo95864q0;
        List listMo60578M;
        if (list == null) {
            m109565r0(10);
            throw null;
        }
        if (abstractC31152r == null) {
            m109565r0(11);
            throw null;
        }
        if (list2 == null) {
            m109565r0(12);
            throw null;
        }
        InterfaceC31117e interfaceC31117eMo60581g = mo60581g();
        if (interfaceC31117eMo60581g.isInner()) {
            InterfaceC31135k interfaceC31135kMo60581g = interfaceC31117eMo60581g.mo60581g();
            if (interfaceC31135kMo60581g instanceof InterfaceC31117e) {
                interfaceC31151q0Mo95864q0 = ((InterfaceC31117e) interfaceC31135kMo60581g).mo95864q0();
            } else {
                interfaceC31151q0Mo95864q0 = null;
            }
        } else {
            interfaceC31151q0Mo95864q0 = null;
        }
        InterfaceC31117e interfaceC31117eMo60581g2 = mo60581g();
        if (interfaceC31117eMo60581g2.mo60578M().isEmpty()) {
            listMo60578M = Collections.EMPTY_LIST;
            if (listMo60578M == null) {
                m109565r0(16);
                throw null;
            }
        } else {
            listMo60578M = interfaceC31117eMo60581g2.mo60578M();
            if (listMo60578M == null) {
                m109565r0(15);
                throw null;
            }
        }
        mo109605O0(null, interfaceC31151q0Mo95864q0, listMo60578M, list2, list, null, EnumC31106a0.f128310x, abstractC31152r);
    }

    @Override // u93.AbstractC34710x, r93.InterfaceC31162w, r93.InterfaceC31159u0
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public final C34682j mo60593d(C23758a1 c23758a1) {
        if (c23758a1 != null) {
            return (C34682j) super.mo60593d(c23758a1);
        }
        m109565r0(20);
        throw null;
    }

    @Override // u93.AbstractC34710x, r93.InterfaceC31111c
    /* JADX INFO: renamed from: a0 */
    public final InterfaceC31111c mo78655a0(InterfaceC31117e interfaceC31117e, EnumC31106a0 enumC31106a0, AbstractC31146o abstractC31146o) {
        return (C34682j) m109630J0(interfaceC31117e, enumC31106a0, abstractC31146o);
    }

    @Override // u93.AbstractC34710x, r93.InterfaceC31111c
    /* JADX INFO: renamed from: g0 */
    public final void mo78656g0(Collection collection) {
        if (collection != null) {
            return;
        }
        m109565r0(22);
        throw null;
    }

    @Override // u93.AbstractC34710x, r93.InterfaceC31111c, r93.InterfaceC31108b
    /* JADX INFO: renamed from: h */
    public final Collection mo78673h() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        m109565r0(21);
        throw null;
    }
}
