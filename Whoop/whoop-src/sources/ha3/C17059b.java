package ha3;

import androidx.health.platform.client.proto.C1533u;
import java.util.ArrayList;
import l83.C23465k;
import lb3.AbstractC23811y;
import m83.C25271y;
import p048ce.AbstractC4482w;
import q63.AbstractC30007c;
import r93.InterfaceC31105a;
import r93.InterfaceC31117e;
import r93.InterfaceC31135k;
import r93.InterfaceC31155s0;
import r93.InterfaceC31162w;
import s93.C32305g;
import s93.InterfaceC32307i;
import u93.AbstractC34710x;
import u93.C34682j;
import va3.C35850h;
import w93.C36973f;
import ya3.AbstractC39373p;

/* JADX INFO: renamed from: ha3.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C17059b extends C34682j implements InterfaceC17058a {

    /* JADX INFO: renamed from: f0 */
    public Boolean f65585f0;

    /* JADX INFO: renamed from: g0 */
    public Boolean f65586g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17059b(InterfaceC31117e interfaceC31117e, C17059b c17059b, InterfaceC32307i interfaceC32307i, boolean z4, int i13, InterfaceC31155s0 interfaceC31155s0) {
        super(interfaceC31117e, c17059b, interfaceC32307i, z4, i13, interfaceC31155s0);
        if (interfaceC31117e == null) {
            m48176r0(0);
            throw null;
        }
        if (interfaceC32307i == null) {
            m48176r0(1);
            throw null;
        }
        if (i13 == 0) {
            m48176r0(2);
            throw null;
        }
        if (interfaceC31155s0 == null) {
            m48176r0(3);
            throw null;
        }
        this.f65585f0 = null;
        this.f65586g0 = null;
    }

    /* JADX INFO: renamed from: a1 */
    public static C17059b m48175a1(InterfaceC31117e interfaceC31117e, InterfaceC32307i interfaceC32307i, boolean z4, C36973f c36973f) {
        if (interfaceC31117e != null) {
            return new C17059b(interfaceC31117e, null, interfaceC32307i, z4, 1, c36973f);
        }
        m48176r0(4);
        throw null;
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m48176r0(int i13) {
        String str = (i13 == 11 || i13 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 11 || i13 == 18) ? 2 : 3];
        switch (i13) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i13 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i13 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i13) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 11 && i13 != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // ha3.InterfaceC17058a
    /* JADX INFO: renamed from: J */
    public final InterfaceC17058a mo48174J(AbstractC23811y abstractC23811y, ArrayList arrayList, AbstractC23811y abstractC23811y2, C23465k c23465k) {
        C17059b c17059bM48182b1 = m48182b1(mo60581g(), null, getKind(), getAnnotations(), getSource());
        c17059bM48182b1.mo109605O0(abstractC23811y == null ? null : AbstractC39373p.m125576j(c17059bM48182b1, abstractC23811y, C32305g.f133684a), this.f146197K, C25271y.f99162w, getTypeParameters(), AbstractC4482w.m13969E(arrayList, mo78676v(), c17059bM48182b1), abstractC23811y2, mo60498k(), getVisibility());
        if (c23465k != null) {
            c17059bM48182b1.m109632Q0((InterfaceC31105a) c23465k.f92937w, c23465k.f92938x);
        }
        return c17059bM48182b1;
    }

    @Override // u93.C34682j, u93.AbstractC34710x
    /* JADX INFO: renamed from: L0 */
    public final /* bridge */ /* synthetic */ AbstractC34710x mo48177L0(int i13, InterfaceC31135k interfaceC31135k, InterfaceC31162w interfaceC31162w, InterfaceC31155s0 interfaceC31155s0, InterfaceC32307i interfaceC32307i, C35850h c35850h) {
        return m48182b1(interfaceC31135k, interfaceC31162w, i13, interfaceC32307i, interfaceC31155s0);
    }

    @Override // u93.AbstractC34710x
    /* JADX INFO: renamed from: R0 */
    public final void mo48178R0(boolean z4) {
        this.f65585f0 = Boolean.valueOf(z4);
    }

    @Override // u93.AbstractC34710x, r93.InterfaceC31108b
    /* JADX INFO: renamed from: S */
    public final boolean mo48179S() {
        return this.f65586g0.booleanValue();
    }

    @Override // u93.AbstractC34710x
    /* JADX INFO: renamed from: S0 */
    public final void mo48180S0(boolean z4) {
        this.f65586g0 = Boolean.valueOf(z4);
    }

    @Override // u93.C34682j
    /* JADX INFO: renamed from: U0 */
    public final /* bridge */ /* synthetic */ C34682j mo48177L0(int i13, InterfaceC31135k interfaceC31135k, InterfaceC31162w interfaceC31162w, InterfaceC31155s0 interfaceC31155s0, InterfaceC32307i interfaceC32307i, C35850h c35850h) {
        return m48182b1(interfaceC31135k, interfaceC31162w, i13, interfaceC32307i, interfaceC31155s0);
    }

    /* JADX INFO: renamed from: b1 */
    public final C17059b m48182b1(InterfaceC31135k interfaceC31135k, InterfaceC31162w interfaceC31162w, int i13, InterfaceC32307i interfaceC32307i, InterfaceC31155s0 interfaceC31155s0) {
        if (interfaceC31135k == null) {
            m48176r0(7);
            throw null;
        }
        if (i13 == 0) {
            m48176r0(8);
            throw null;
        }
        if (interfaceC32307i == null) {
            m48176r0(9);
            throw null;
        }
        if (interfaceC31155s0 == null) {
            m48176r0(10);
            throw null;
        }
        if (i13 != 1 && i13 != 4) {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC31135k + "\nkind: " + AbstractC30007c.m91830E(i13));
        }
        InterfaceC31117e interfaceC31117e = (InterfaceC31117e) interfaceC31135k;
        C17059b c17059b = (C17059b) interfaceC31162w;
        if (i13 == 0) {
            m48176r0(13);
            throw null;
        }
        C17059b c17059b2 = new C17059b(interfaceC31117e, c17059b, interfaceC32307i, this.f146080e0, i13, interfaceC31155s0);
        Boolean bool = this.f65585f0;
        bool.getClass();
        c17059b2.f65585f0 = bool;
        Boolean bool2 = this.f65586g0;
        bool2.getClass();
        c17059b2.f65586g0 = bool2;
        return c17059b2;
    }
}
