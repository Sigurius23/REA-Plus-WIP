package u93;

import androidx.health.platform.client.proto.C1533u;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lb3.AbstractC23811y;
import lb3.C23758a1;
import r93.AbstractC31152r;
import r93.EnumC31106a0;
import r93.InterfaceC31117e;
import r93.InterfaceC31135k;
import r93.InterfaceC31151q0;
import r93.InterfaceC31155s0;
import r93.InterfaceC31160v;
import r93.InterfaceC31162w;
import s93.C32305g;
import s93.InterfaceC32307i;
import va3.C35850h;

/* JADX INFO: renamed from: u93.q0 */
/* JADX INFO: loaded from: classes5.dex */
public class C34697q0 extends AbstractC34710x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34697q0(InterfaceC31135k interfaceC31135k, C34697q0 c34697q0, InterfaceC32307i interfaceC32307i, C35850h c35850h, int i13, InterfaceC31155s0 interfaceC31155s0) {
        super(i13, interfaceC31135k, c34697q0, interfaceC31155s0, interfaceC32307i, c35850h);
        if (interfaceC31135k == null) {
            m109604r0(0);
            throw null;
        }
        if (interfaceC32307i == null) {
            m109604r0(1);
            throw null;
        }
        if (c35850h == null) {
            m109604r0(2);
            throw null;
        }
        if (i13 == 0) {
            m109604r0(3);
            throw null;
        }
        if (interfaceC31155s0 != null) {
        } else {
            m109604r0(4);
            throw null;
        }
    }

    /* JADX INFO: renamed from: U0 */
    public static C34697q0 m109603U0(InterfaceC31117e interfaceC31117e, C35850h c35850h, int i13, InterfaceC31155s0 interfaceC31155s0) {
        if (interfaceC31117e == null) {
            m109604r0(5);
            throw null;
        }
        if (c35850h == null) {
            m109604r0(7);
            throw null;
        }
        if (i13 == 0) {
            m109604r0(8);
            throw null;
        }
        if (interfaceC31155s0 != null) {
            return new C34697q0(interfaceC31117e, null, C32305g.f133684a, c35850h, i13, interfaceC31155s0);
        }
        m109604r0(9);
        throw null;
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m109604r0(int i13) {
        String str = (i13 == 13 || i13 == 18 || i13 == 23 || i13 == 24 || i13 == 29 || i13 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 13 || i13 == 18 || i13 == 23 || i13 == 24 || i13 == 29 || i13 == 30) ? 2 : 3];
        switch (i13) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                objArr[0] = "visibility";
                break;
            case 13:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i13 == 13 || i13 == 18 || i13 == 23) {
            objArr[1] = "initialize";
        } else if (i13 == 24) {
            objArr[1] = "getOriginal";
        } else if (i13 == 29) {
            objArr[1] = "copy";
        } else if (i13 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i13) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 20:
            case 21:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                objArr[2] = "initialize";
                break;
            case 13:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 13 && i13 != 18 && i13 != 23 && i13 != 24 && i13 != 29 && i13 != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // u93.AbstractC34710x
    /* JADX INFO: renamed from: L0 */
    public AbstractC34710x mo48177L0(int i13, InterfaceC31135k interfaceC31135k, InterfaceC31162w interfaceC31162w, InterfaceC31155s0 interfaceC31155s0, InterfaceC32307i interfaceC32307i, C35850h c35850h) {
        if (interfaceC31135k == null) {
            m109604r0(25);
            throw null;
        }
        if (i13 == 0) {
            m109604r0(26);
            throw null;
        }
        if (interfaceC32307i == null) {
            m109604r0(27);
            throw null;
        }
        C34697q0 c34697q0 = (C34697q0) interfaceC31162w;
        if (c35850h == null) {
            c35850h = getName();
        }
        return new C34697q0(interfaceC31135k, c34697q0, interfaceC32307i, c35850h, i13, interfaceC31155s0);
    }

    @Override // u93.AbstractC34710x, u93.AbstractC34692o, u93.AbstractC34690n, r93.InterfaceC31135k
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public final C34697q0 mo78660a() {
        C34697q0 c34697q0 = (C34697q0) super.mo78660a();
        if (c34697q0 != null) {
            return c34697q0;
        }
        m109604r0(24);
        throw null;
    }

    @Override // u93.AbstractC34710x
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public final C34697q0 mo109605O0(InterfaceC31151q0 interfaceC31151q0, InterfaceC31151q0 interfaceC31151q1, List list, List list2, List list3, AbstractC23811y abstractC23811y, EnumC31106a0 enumC31106a0, AbstractC31152r abstractC31152r) {
        if (list == null) {
            m109604r0(14);
            throw null;
        }
        if (list2 == null) {
            m109604r0(15);
            throw null;
        }
        if (list3 == null) {
            m109604r0(16);
            throw null;
        }
        if (abstractC31152r != null) {
            return mo48185X0(interfaceC31151q0, interfaceC31151q1, list, list2, list3, abstractC23811y, enumC31106a0, abstractC31152r, null);
        }
        m109604r0(17);
        throw null;
    }

    /* JADX INFO: renamed from: X0 */
    public C34697q0 mo48185X0(InterfaceC31151q0 interfaceC31151q0, InterfaceC31151q0 interfaceC31151q1, List list, List list2, List list3, AbstractC23811y abstractC23811y, EnumC31106a0 enumC31106a0, AbstractC31152r abstractC31152r, Map map) {
        if (list == null) {
            m109604r0(19);
            throw null;
        }
        if (list2 == null) {
            m109604r0(20);
            throw null;
        }
        if (list3 == null) {
            m109604r0(21);
            throw null;
        }
        if (abstractC31152r == null) {
            m109604r0(22);
            throw null;
        }
        super.mo109605O0(interfaceC31151q0, interfaceC31151q1, list, list2, list3, abstractC23811y, enumC31106a0, abstractC31152r);
        if (map != null && !map.isEmpty()) {
            this.f146216d0 = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // u93.AbstractC34710x, r93.InterfaceC31162w
    /* JADX INFO: renamed from: l0 */
    public InterfaceC31160v mo78657l0() {
        return m109631P0(C23758a1.f94121b);
    }
}
