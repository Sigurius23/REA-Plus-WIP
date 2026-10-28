package u93;

import ab3.AbstractC0715g;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kb3.C22339h;
import lb3.AbstractC23811y;
import lb3.C23758a1;
import r93.AbstractC31152r;
import r93.EnumC31106a0;
import r93.InterfaceC31105a;
import r93.InterfaceC31135k;
import r93.InterfaceC31141m;
import r93.InterfaceC31142m0;
import r93.InterfaceC31145n0;
import r93.InterfaceC31149p0;
import r93.InterfaceC31151q0;
import r93.InterfaceC31155s0;
import r93.InterfaceC31162w;
import s93.C32305g;
import s93.InterfaceC32307i;
import va3.C35850h;

/* JADX INFO: renamed from: u93.m0 */
/* JADX INFO: loaded from: classes5.dex */
public class C34689m0 extends AbstractC34711x0 implements InterfaceC31145n0 {

    /* JADX INFO: renamed from: G */
    public final boolean f146111G;

    /* JADX INFO: renamed from: H */
    public C22339h f146112H;

    /* JADX INFO: renamed from: I */
    public InterfaceC4339a f146113I;

    /* JADX INFO: renamed from: J */
    public final EnumC31106a0 f146114J;

    /* JADX INFO: renamed from: K */
    public AbstractC31152r f146115K;

    /* JADX INFO: renamed from: L */
    public Collection f146116L;

    /* JADX INFO: renamed from: M */
    public final InterfaceC31145n0 f146117M;

    /* JADX INFO: renamed from: N */
    public final int f146118N;

    /* JADX INFO: renamed from: O */
    public final boolean f146119O;

    /* JADX INFO: renamed from: P */
    public final boolean f146120P;

    /* JADX INFO: renamed from: Q */
    public final boolean f146121Q;

    /* JADX INFO: renamed from: R */
    public final boolean f146122R;

    /* JADX INFO: renamed from: S */
    public final boolean f146123S;

    /* JADX INFO: renamed from: T */
    public List f146124T;

    /* JADX INFO: renamed from: U */
    public InterfaceC31151q0 f146125U;

    /* JADX INFO: renamed from: V */
    public InterfaceC31151q0 f146126V;

    /* JADX INFO: renamed from: W */
    public ArrayList f146127W;

    /* JADX INFO: renamed from: X */
    public C34691n0 f146128X;

    /* JADX INFO: renamed from: Y */
    public InterfaceC31149p0 f146129Y;

    /* JADX INFO: renamed from: Z */
    public C34706v f146130Z;

    /* JADX INFO: renamed from: a0 */
    public C34706v f146131a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34689m0(InterfaceC31135k interfaceC31135k, InterfaceC31145n0 interfaceC31145n0, InterfaceC32307i interfaceC32307i, EnumC31106a0 enumC31106a0, AbstractC31152r abstractC31152r, boolean z4, C35850h c35850h, int i13, InterfaceC31155s0 interfaceC31155s0, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        super(interfaceC31135k, interfaceC32307i, c35850h, null, interfaceC31155s0);
        if (interfaceC31135k == null) {
            m109588r0(0);
            throw null;
        }
        if (interfaceC32307i == null) {
            m109588r0(1);
            throw null;
        }
        if (enumC31106a0 == null) {
            m109588r0(2);
            throw null;
        }
        if (abstractC31152r == null) {
            m109588r0(3);
            throw null;
        }
        if (c35850h == null) {
            m109588r0(4);
            throw null;
        }
        if (i13 == 0) {
            m109588r0(5);
            throw null;
        }
        if (interfaceC31155s0 == null) {
            m109588r0(6);
            throw null;
        }
        this.f146111G = z4;
        this.f146116L = null;
        this.f146124T = Collections.EMPTY_LIST;
        this.f146114J = enumC31106a0;
        this.f146115K = abstractC31152r;
        this.f146117M = interfaceC31145n0 == null ? this : interfaceC31145n0;
        this.f146118N = i13;
        this.f146119O = z13;
        this.f146120P = z14;
        this.f146121Q = z15;
        this.f146122R = z16;
        this.f146123S = z17;
    }

    /* JADX INFO: renamed from: K0 */
    public static C34689m0 m109586K0(InterfaceC31135k interfaceC31135k, EnumC31106a0 enumC31106a0, AbstractC31152r abstractC31152r, boolean z4, C35850h c35850h, int i13, InterfaceC31155s0 interfaceC31155s0) {
        if (interfaceC31135k == null) {
            m109588r0(7);
            throw null;
        }
        if (abstractC31152r == null) {
            m109588r0(10);
            throw null;
        }
        if (c35850h == null) {
            m109588r0(11);
            throw null;
        }
        if (i13 == 0) {
            m109588r0(12);
            throw null;
        }
        if (interfaceC31155s0 != null) {
            return new C34689m0(interfaceC31135k, null, C32305g.f133684a, enumC31106a0, abstractC31152r, z4, c35850h, i13, interfaceC31155s0, false, false, false, false, false);
        }
        m109588r0(13);
        throw null;
    }

    /* JADX INFO: renamed from: M0 */
    public static InterfaceC31162w m109587M0(C23758a1 c23758a1, InterfaceC31142m0 interfaceC31142m0) {
        if (interfaceC31142m0 == null) {
            m109588r0(31);
            throw null;
        }
        InterfaceC31162w interfaceC31162w = ((AbstractC34685k0) interfaceC31142m0).f146091M;
        if (interfaceC31162w != null) {
            return interfaceC31162w.mo60593d(c23758a1);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m109588r0(int i13) {
        String str;
        int i14;
        if (i13 != 28 && i13 != 38 && i13 != 39 && i13 != 41 && i13 != 42) {
            switch (i13) {
                case 21:
                case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                case 24:
                case 25:
                case 26:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i13 != 28 && i13 != 38 && i13 != 39 && i13 != 41 && i13 != 42) {
            switch (i13) {
                case 21:
                case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                case 24:
                case 25:
                case 26:
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
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
            case 20:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 35:
                objArr[0] = "kind";
                break;
            case 6:
            case 13:
            case 37:
                objArr[0] = "source";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 14:
                objArr[0] = "inType";
                break;
            case 15:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                objArr[0] = "outType";
                break;
            case 16:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                objArr[0] = "typeParameters";
                break;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                objArr[0] = "contextReceiverParameters";
                break;
            case 21:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case 27:
                objArr[0] = "originalSubstitutor";
                break;
            case 29:
                objArr[0] = "copyConfiguration";
                break;
            case 30:
                objArr[0] = "substitutor";
                break;
            case 31:
                objArr[0] = "accessorDescriptor";
                break;
            case 32:
                objArr[0] = "newOwner";
                break;
            case 33:
                objArr[0] = "newModality";
                break;
            case 34:
                objArr[0] = "newVisibility";
                break;
            case 36:
                objArr[0] = "newName";
                break;
            case 40:
                objArr[0] = "overriddenDescriptors";
                break;
        }
        if (i13 == 28) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i13 == 38) {
            objArr[1] = "getOriginal";
        } else if (i13 == 39) {
            objArr[1] = "getKind";
        } else if (i13 == 41) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i13 != 42) {
            switch (i13) {
                case 21:
                    objArr[1] = "getTypeParameters";
                    break;
                case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    objArr[1] = "getContextReceiverParameters";
                    break;
                case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                    objArr[1] = "getReturnType";
                    break;
                case 24:
                    objArr[1] = "getModality";
                    break;
                case 25:
                    objArr[1] = "getVisibility";
                    break;
                case 26:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i13) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = "create";
                break;
            case 14:
                objArr[2] = "setInType";
                break;
            case 15:
            case 16:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                objArr[2] = "setType";
                break;
            case 20:
                objArr[2] = "setVisibility";
                break;
            case 21:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                break;
            case 27:
                objArr[2] = "substitute";
                break;
            case 29:
                objArr[2] = "doSubstitute";
                break;
            case 30:
            case 31:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 40:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 28 && i13 != 38 && i13 != 39 && i13 != 41 && i13 != 42) {
            switch (i13) {
                case 21:
                case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override // r93.InterfaceC31110b1
    /* JADX INFO: renamed from: A */
    public final boolean mo78666A() {
        return this.f146111G;
    }

    @Override // u93.AbstractC34711x0, r93.InterfaceC31108b
    /* JADX INFO: renamed from: B */
    public final InterfaceC31151q0 mo78667B() {
        return this.f146126V;
    }

    @Override // r93.InterfaceC31145n0
    /* JADX INFO: renamed from: C */
    public final C34706v mo78668C() {
        return this.f146131a0;
    }

    @Override // r93.InterfaceC31111c
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public final C34689m0 mo78655a0(InterfaceC31135k interfaceC31135k, EnumC31106a0 enumC31106a0, AbstractC31152r abstractC31152r) {
        C34687l0 c34687l0 = new C34687l0(this);
        c34687l0.m109583g(interfaceC31135k);
        c34687l0.m109582f(null);
        c34687l0.m109581e(enumC31106a0);
        c34687l0.m109585i(abstractC31152r);
        c34687l0.m109580d();
        c34687l0.m109579c();
        C34689m0 c34689m0M109578b = c34687l0.m109578b();
        if (c34689m0M109578b != null) {
            return c34689m0M109578b;
        }
        m109588r0(42);
        throw null;
    }

    @Override // r93.InterfaceC31168z
    /* JADX INFO: renamed from: L */
    public final boolean mo60490L() {
        return false;
    }

    /* JADX INFO: renamed from: L0 */
    public C34689m0 mo48188L0(InterfaceC31135k interfaceC31135k, EnumC31106a0 enumC31106a0, AbstractC31152r abstractC31152r, InterfaceC31145n0 interfaceC31145n0, int i13, C35850h c35850h) {
        if (interfaceC31135k == null) {
            m109588r0(32);
            throw null;
        }
        if (enumC31106a0 == null) {
            m109588r0(33);
            throw null;
        }
        if (abstractC31152r == null) {
            m109588r0(34);
            throw null;
        }
        if (i13 == 0) {
            m109588r0(35);
            throw null;
        }
        if (c35850h == null) {
            m109588r0(36);
            throw null;
        }
        return new C34689m0(interfaceC31135k, interfaceC31145n0, getAnnotations(), enumC31106a0, abstractC31152r, this.f146111G, c35850h, i13, InterfaceC31155s0.f128370q, this.f146119O, isConst(), this.f146121Q, isExternal(), this.f146123S);
    }

    /* JADX INFO: renamed from: N0 */
    public final void m109590N0(C34691n0 c34691n0, C34693o0 c34693o0, C34706v c34706v, C34706v c34706v2) {
        this.f146128X = c34691n0;
        this.f146129Y = c34693o0;
        this.f146130Z = c34706v;
        this.f146131a0 = c34706v2;
    }

    /* JADX INFO: renamed from: O0 */
    public final void m109591O0(C22339h c22339h, InterfaceC4339a interfaceC4339a) {
        if (interfaceC4339a == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "compileTimeInitializerFactory", "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl", "setCompileTimeInitializer"));
        }
        this.f146113I = interfaceC4339a;
        if (c22339h == null) {
            c22339h = (C22339h) interfaceC4339a.invoke();
        }
        this.f146112H = c22339h;
    }

    /* JADX INFO: renamed from: P0 */
    public void mo48189P0(AbstractC23811y abstractC23811y) {
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m109592Q0(AbstractC23811y abstractC23811y, List list, InterfaceC31151q0 interfaceC31151q0, C34695p0 c34695p0, List list2) {
        if (abstractC23811y == null) {
            m109588r0(17);
            throw null;
        }
        if (list == null) {
            m109588r0(18);
            throw null;
        }
        if (list2 == null) {
            m109588r0(19);
            throw null;
        }
        this.f146217F = abstractC23811y;
        this.f146127W = new ArrayList(list);
        this.f146126V = c34695p0;
        this.f146125U = interfaceC31151q0;
        this.f146124T = list2;
    }

    @Override // r93.InterfaceC31135k
    /* JADX INFO: renamed from: T */
    public final Object mo78659T(InterfaceC31141m interfaceC31141m, Object obj) {
        return interfaceC31141m.visitPropertyDescriptor(this, obj);
    }

    @Override // r93.InterfaceC31168z
    /* JADX INFO: renamed from: U */
    public final boolean mo60493U() {
        return this.f146121Q;
    }

    @Override // r93.InterfaceC31110b1
    /* JADX INFO: renamed from: W */
    public final AbstractC0715g mo78669W() {
        C22339h c22339h = this.f146112H;
        if (c22339h != null) {
            return (AbstractC0715g) c22339h.invoke();
        }
        return null;
    }

    @Override // r93.InterfaceC31145n0
    /* JADX INFO: renamed from: b0 */
    public final C34706v mo78670b0() {
        return this.f146130Z;
    }

    @Override // r93.InterfaceC31108b
    /* JADX INFO: renamed from: c0 */
    public final List mo78671c0() {
        List list = this.f146124T;
        if (list != null) {
            return list;
        }
        m109588r0(22);
        throw null;
    }

    @Override // r93.InterfaceC31110b1
    /* JADX INFO: renamed from: d0 */
    public final boolean mo78672d0() {
        return this.f146119O;
    }

    @Override // r93.InterfaceC31111c
    /* JADX INFO: renamed from: g0 */
    public final void mo78656g0(Collection collection) {
        if (collection != null) {
            this.f146116L = collection;
        } else {
            m109588r0(40);
            throw null;
        }
    }

    @Override // r93.InterfaceC31145n0
    public final C34691n0 getGetter() {
        return this.f146128X;
    }

    @Override // r93.InterfaceC31111c
    public final int getKind() {
        int i13 = this.f146118N;
        if (i13 != 0) {
            return i13;
        }
        m109588r0(39);
        throw null;
    }

    @Override // u93.AbstractC34711x0, r93.InterfaceC31108b
    public final AbstractC23811y getReturnType() {
        AbstractC23811y type = getType();
        if (type != null) {
            return type;
        }
        m109588r0(23);
        throw null;
    }

    @Override // r93.InterfaceC31145n0
    public final InterfaceC31149p0 getSetter() {
        return this.f146129Y;
    }

    @Override // u93.AbstractC34711x0, r93.InterfaceC31108b
    public final List getTypeParameters() {
        ArrayList arrayList = this.f146127W;
        if (arrayList != null) {
            return arrayList;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // r93.InterfaceC31144n
    public final AbstractC31152r getVisibility() {
        AbstractC31152r abstractC31152r = this.f146115K;
        if (abstractC31152r != null) {
            return abstractC31152r;
        }
        m109588r0(25);
        throw null;
    }

    @Override // r93.InterfaceC31108b
    /* JADX INFO: renamed from: h */
    public final Collection mo78673h() {
        Collection collection = this.f146116L;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        m109588r0(41);
        throw null;
    }

    /* JADX INFO: renamed from: h0 */
    public Object mo48190h0(InterfaceC31105a interfaceC31105a) {
        return null;
    }

    public boolean isConst() {
        return this.f146120P;
    }

    public boolean isExternal() {
        return this.f146122R;
    }

    @Override // r93.InterfaceC31168z
    /* JADX INFO: renamed from: k */
    public final EnumC31106a0 mo60498k() {
        EnumC31106a0 enumC31106a0 = this.f146114J;
        if (enumC31106a0 != null) {
            return enumC31106a0;
        }
        m109588r0(24);
        throw null;
    }

    @Override // r93.InterfaceC31145n0
    /* JADX INFO: renamed from: m */
    public final ArrayList mo78674m() {
        ArrayList arrayList = new ArrayList(2);
        C34691n0 c34691n0 = this.f146128X;
        if (c34691n0 != null) {
            arrayList.add(c34691n0);
        }
        InterfaceC31149p0 interfaceC31149p0 = this.f146129Y;
        if (interfaceC31149p0 != null) {
            arrayList.add(interfaceC31149p0);
        }
        return arrayList;
    }

    @Override // r93.InterfaceC31145n0
    /* JADX INFO: renamed from: p */
    public final boolean mo78675p() {
        return this.f146123S;
    }

    @Override // u93.AbstractC34711x0, r93.InterfaceC31108b
    /* JADX INFO: renamed from: y */
    public final InterfaceC31151q0 mo78677y() {
        return this.f146125U;
    }

    @Override // r93.InterfaceC31159u0
    /* JADX INFO: renamed from: d */
    public final InterfaceC31145n0 mo60593d(C23758a1 c23758a1) {
        if (c23758a1 == null) {
            m109588r0(27);
            throw null;
        }
        if (c23758a1.f94122a.mo69908e()) {
            return this;
        }
        C34687l0 c34687l0 = new C34687l0(this);
        c34687l0.m109584h(c23758a1.m69821f());
        c34687l0.m109582f(mo78660a());
        return c34687l0.m109578b();
    }

    @Override // u93.AbstractC34692o, u93.AbstractC34690n, r93.InterfaceC31135k
    /* JADX INFO: renamed from: a */
    public final InterfaceC31145n0 mo78660a() {
        InterfaceC31145n0 interfaceC31145n0 = this.f146117M;
        InterfaceC31145n0 interfaceC31145n0Mo78660a = interfaceC31145n0 == this ? this : interfaceC31145n0.mo78660a();
        if (interfaceC31145n0Mo78660a != null) {
            return interfaceC31145n0Mo78660a;
        }
        m109588r0(38);
        throw null;
    }
}
