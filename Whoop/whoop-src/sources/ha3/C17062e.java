package ha3;

import androidx.health.platform.client.proto.C1533u;
import bb3.C2935b;
import ia3.C18297c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l83.C23465k;
import lb3.AbstractC23811y;
import lb3.C23758a1;
import p048ce.AbstractC4482w;
import p127ev.AbstractC13673n;
import p530up.AbstractC35148d;
import r93.AbstractC31152r;
import r93.EnumC31106a0;
import r93.InterfaceC31105a;
import r93.InterfaceC31135k;
import r93.InterfaceC31151q0;
import r93.InterfaceC31155s0;
import r93.InterfaceC31162w;
import rb3.AbstractC31210r;
import s93.C32305g;
import s93.InterfaceC32307i;
import u93.AbstractC34710x;
import u93.C34695p0;
import u93.C34697q0;
import u93.C34708w;
import va3.C35850h;
import w93.C36973f;
import ya3.AbstractC39373p;

/* JADX INFO: renamed from: ha3.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C17062e extends C34697q0 implements InterfaceC17058a {

    /* JADX INFO: renamed from: g0 */
    public static final C2935b f65587g0 = new C2935b();

    /* JADX INFO: renamed from: h0 */
    public static final C2935b f65588h0 = new C2935b();

    /* JADX INFO: renamed from: e0 */
    public int f65589e0;

    /* JADX INFO: renamed from: f0 */
    public final boolean f65590f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17062e(InterfaceC31135k interfaceC31135k, C34697q0 c34697q0, InterfaceC32307i interfaceC32307i, C35850h c35850h, int i13, InterfaceC31155s0 interfaceC31155s0, boolean z4) {
        super(interfaceC31135k, c34697q0, interfaceC32307i, c35850h, i13, interfaceC31155s0);
        if (interfaceC31135k == null) {
            m48184r0(0);
            throw null;
        }
        if (interfaceC32307i == null) {
            m48184r0(1);
            throw null;
        }
        if (c35850h == null) {
            m48184r0(2);
            throw null;
        }
        if (i13 == 0) {
            m48184r0(3);
            throw null;
        }
        this.f65589e0 = 0;
        this.f65590f0 = z4;
    }

    /* JADX INFO: renamed from: Y0 */
    public static C17062e m48183Y0(InterfaceC31135k interfaceC31135k, C18297c c18297c, C35850h c35850h, C36973f c36973f, boolean z4) {
        if (interfaceC31135k == null) {
            m48184r0(5);
            throw null;
        }
        if (c35850h != null) {
            return new C17062e(interfaceC31135k, null, c18297c, c35850h, 1, c36973f, z4);
        }
        m48184r0(7);
        throw null;
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m48184r0(int i13) {
        String str = (i13 == 13 || i13 == 18 || i13 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 13 || i13 == 18 || i13 == 21) ? 2 : 3];
        switch (i13) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i13 == 13) {
            objArr[1] = "initialize";
        } else if (i13 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i13 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i13) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 13 && i13 != 18 && i13 != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // ha3.InterfaceC17058a
    /* JADX INFO: renamed from: J */
    public final InterfaceC17058a mo48174J(AbstractC23811y abstractC23811y, ArrayList arrayList, AbstractC23811y abstractC23811y2, C23465k c23465k) {
        ArrayList arrayListM13969E = AbstractC4482w.m13969E(arrayList, mo78676v(), this);
        C34695p0 c34695p0M125576j = abstractC23811y == null ? null : AbstractC39373p.m125576j(this, abstractC23811y, C32305g.f133684a);
        C34708w c34708wM109631P0 = m109631P0(C23758a1.f94121b);
        c34708wM109631P0.f146164G = arrayListM13969E;
        c34708wM109631P0.f146168K = abstractC23811y2;
        c34708wM109631P0.f146166I = c34695p0M125576j;
        c34708wM109631P0.f146173P = true;
        c34708wM109631P0.f146172O = true;
        C17062e c17062e = (C17062e) c34708wM109631P0.f146181X.mo88262M0(c34708wM109631P0);
        if (c23465k != null) {
            c17062e.m109632Q0((InterfaceC31105a) c23465k.f92937w, c23465k.f92938x);
        }
        if (c17062e != null) {
            return c17062e;
        }
        m48184r0(21);
        throw null;
    }

    @Override // u93.C34697q0, u93.AbstractC34710x
    /* JADX INFO: renamed from: L0 */
    public final AbstractC34710x mo48177L0(int i13, InterfaceC31135k interfaceC31135k, InterfaceC31162w interfaceC31162w, InterfaceC31155s0 interfaceC31155s0, InterfaceC32307i interfaceC32307i, C35850h c35850h) {
        if (interfaceC31135k == null) {
            m48184r0(14);
            throw null;
        }
        if (i13 == 0) {
            m48184r0(15);
            throw null;
        }
        if (interfaceC32307i == null) {
            m48184r0(16);
            throw null;
        }
        C34697q0 c34697q0 = (C34697q0) interfaceC31162w;
        if (c35850h == null) {
            c35850h = getName();
        }
        C17062e c17062e = new C17062e(interfaceC31135k, c34697q0, interfaceC32307i, c35850h, i13, interfaceC31155s0, this.f65590f0);
        int i14 = this.f65589e0;
        c17062e.f65589e0 = AbstractC13673n.m38554a(AbstractC13673n.m38555b(i14), AbstractC13673n.m38556c(i14));
        return c17062e;
    }

    @Override // u93.AbstractC34710x, r93.InterfaceC31108b
    /* JADX INFO: renamed from: S */
    public final boolean mo48179S() {
        return AbstractC13673n.m38556c(this.f65589e0);
    }

    @Override // u93.C34697q0
    /* JADX INFO: renamed from: X0 */
    public final C34697q0 mo48185X0(InterfaceC31151q0 interfaceC31151q0, InterfaceC31151q0 interfaceC31151q1, List list, List list2, List list3, AbstractC23811y abstractC23811y, EnumC31106a0 enumC31106a0, AbstractC31152r abstractC31152r, Map map) {
        if (list == null) {
            m48184r0(9);
            throw null;
        }
        if (list2 == null) {
            m48184r0(10);
            throw null;
        }
        if (list3 == null) {
            m48184r0(11);
            throw null;
        }
        if (abstractC31152r == null) {
            m48184r0(12);
            throw null;
        }
        super.mo48185X0(interfaceC31151q0, interfaceC31151q1, list, list2, list3, abstractC23811y, enumC31106a0, abstractC31152r, map);
        List list4 = AbstractC31210r.f128555d;
        this.f146200N = AbstractC35148d.m111186q(this).m96152c();
        return this;
    }
}
