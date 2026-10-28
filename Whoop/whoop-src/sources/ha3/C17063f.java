package ha3;

import al.AbstractC0954a;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import fa3.AbstractC14331x;
import ia3.C18297c;
import java.util.ArrayList;
import l83.C23465k;
import lb3.AbstractC23767d1;
import lb3.AbstractC23811y;
import m83.C25271y;
import mb3.AbstractC25390g;
import na3.AbstractC26532s;
import o93.AbstractC27736h;
import o93.AbstractC27746r;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.AbstractC31152r;
import r93.EnumC31106a0;
import r93.InterfaceC31105a;
import r93.InterfaceC31107a1;
import r93.InterfaceC31135k;
import r93.InterfaceC31145n0;
import r93.InterfaceC31155s0;
import s93.C32305g;
import s93.C32308j;
import s93.InterfaceC32307i;
import u93.AbstractC34685k0;
import u93.AbstractC34692o;
import u93.C34689m0;
import u93.C34691n0;
import u93.C34693o0;
import va3.C35847e;
import va3.C35850h;
import w93.C36973f;
import ya3.AbstractC39373p;

/* JADX INFO: renamed from: ha3.f */
/* JADX INFO: loaded from: classes3.dex */
public class C17063f extends C34689m0 implements InterfaceC17058a {

    /* JADX INFO: renamed from: b0 */
    public final boolean f65591b0;

    /* JADX INFO: renamed from: c0 */
    public final C23465k f65592c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17063f(InterfaceC31135k interfaceC31135k, InterfaceC32307i interfaceC32307i, EnumC31106a0 enumC31106a0, AbstractC31152r abstractC31152r, boolean z4, C35850h c35850h, InterfaceC31155s0 interfaceC31155s0, InterfaceC31145n0 interfaceC31145n0, int i13, boolean z13, C23465k c23465k) {
        super(interfaceC31135k, interfaceC31145n0, interfaceC32307i, enumC31106a0, abstractC31152r, z4, c35850h, i13, interfaceC31155s0, false, false, false, false, false);
        if (interfaceC31135k == null) {
            m48187r0(0);
            throw null;
        }
        if (interfaceC32307i == null) {
            m48187r0(1);
            throw null;
        }
        if (enumC31106a0 == null) {
            m48187r0(2);
            throw null;
        }
        if (abstractC31152r == null) {
            m48187r0(3);
            throw null;
        }
        if (c35850h == null) {
            m48187r0(4);
            throw null;
        }
        if (interfaceC31155s0 == null) {
            m48187r0(5);
            throw null;
        }
        if (i13 == 0) {
            m48187r0(6);
            throw null;
        }
        this.f65591b0 = z13;
        this.f65592c0 = c23465k;
    }

    /* JADX INFO: renamed from: R0 */
    public static C17063f m48186R0(InterfaceC31135k interfaceC31135k, C18297c c18297c, AbstractC31152r abstractC31152r, boolean z4, C35850h c35850h, C36973f c36973f, boolean z13) {
        EnumC31106a0 enumC31106a0 = EnumC31106a0.f128310x;
        if (interfaceC31135k == null) {
            m48187r0(7);
            throw null;
        }
        if (c35850h != null) {
            return new C17063f(interfaceC31135k, c18297c, enumC31106a0, abstractC31152r, z4, c35850h, c36973f, null, 1, z13, null);
        }
        m48187r0(11);
        throw null;
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m48187r0(int i13) {
        String str = i13 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i13 != 21 ? 3 : 2];
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
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                objArr[0] = "newName";
                break;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                objArr[0] = "inType";
                break;
        }
        if (i13 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i13) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 == 21) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // ha3.InterfaceC17058a
    /* JADX INFO: renamed from: J */
    public final InterfaceC17058a mo48174J(AbstractC23811y abstractC23811y, ArrayList arrayList, AbstractC23811y abstractC23811y2, C23465k c23465k) {
        AbstractC23811y abstractC23811y3;
        C34691n0 c34691n0;
        C34693o0 c34693o0;
        InterfaceC31145n0 interfaceC31145n0Mo78660a = mo78660a() == this ? null : mo78660a();
        C17063f c17063f = new C17063f(mo60581g(), getAnnotations(), mo60498k(), getVisibility(), this.f146111G, getName(), getSource(), interfaceC31145n0Mo78660a, getKind(), this.f65591b0, c23465k);
        C34691n0 c34691n1 = this.f146128X;
        if (c34691n1 != null) {
            C34691n0 c34691n2 = new C34691n0(c17063f, c34691n1.getAnnotations(), c34691n1.mo60498k(), c34691n1.getVisibility(), c34691n1.f146084F, c34691n1.f146085G, c34691n1.f146088J, getKind(), interfaceC31145n0Mo78660a == null ? null : interfaceC31145n0Mo78660a.getGetter(), c34691n1.getSource());
            c34691n2.f146091M = c34691n1.f146091M;
            abstractC23811y3 = abstractC23811y2;
            c34691n2.f146133N = abstractC23811y3;
            c34691n0 = c34691n2;
        } else {
            abstractC23811y3 = abstractC23811y2;
            c34691n0 = null;
        }
        Object obj = this.f146129Y;
        if (obj != null) {
            AbstractC34685k0 abstractC34685k0 = (AbstractC34685k0) obj;
            c34693o0 = new C34693o0(c17063f, ((AbstractC0954a) obj).getAnnotations(), abstractC34685k0.mo60498k(), abstractC34685k0.getVisibility(), abstractC34685k0.f146084F, abstractC34685k0.f146085G, abstractC34685k0.f146088J, getKind(), interfaceC31145n0Mo78660a == null ? null : interfaceC31145n0Mo78660a.getSetter(), ((AbstractC34692o) obj).getSource());
            c34693o0.f146091M = c34693o0.f146091M;
            InterfaceC31107a1 interfaceC31107a1 = (InterfaceC31107a1) ((C34693o0) obj).mo78676v().get(0);
            if (interfaceC31107a1 == null) {
                C34693o0.m109600r0(6);
                throw null;
            }
            c34693o0.f146137N = interfaceC31107a1;
        } else {
            c34693o0 = null;
        }
        c17063f.m109590N0(c34691n0, c34693o0, this.f146130Z, this.f146131a0);
        InterfaceC4339a interfaceC4339a = this.f146113I;
        if (interfaceC4339a != null) {
            c17063f.m109591O0(this.f146112H, interfaceC4339a);
        }
        c17063f.mo78656g0(mo78673h());
        c17063f.m109592Q0(abstractC23811y3, getTypeParameters(), this.f146125U, abstractC23811y != null ? AbstractC39373p.m125576j(this, abstractC23811y, C32305g.f133684a) : null, C25271y.f99162w);
        return c17063f;
    }

    @Override // u93.C34689m0
    /* JADX INFO: renamed from: L0 */
    public final C34689m0 mo48188L0(InterfaceC31135k interfaceC31135k, EnumC31106a0 enumC31106a0, AbstractC31152r abstractC31152r, InterfaceC31145n0 interfaceC31145n0, int i13, C35850h c35850h) {
        if (interfaceC31135k == null) {
            m48187r0(13);
            throw null;
        }
        if (enumC31106a0 == null) {
            m48187r0(14);
            throw null;
        }
        if (abstractC31152r == null) {
            m48187r0(15);
            throw null;
        }
        if (i13 == 0) {
            m48187r0(16);
            throw null;
        }
        if (c35850h == null) {
            m48187r0(17);
            throw null;
        }
        return new C17063f(interfaceC31135k, getAnnotations(), enumC31106a0, abstractC31152r, this.f146111G, c35850h, InterfaceC31155s0.f128370q, interfaceC31145n0, i13, this.f65591b0, this.f65592c0);
    }

    @Override // u93.C34689m0
    /* JADX INFO: renamed from: P0 */
    public final void mo48189P0(AbstractC23811y abstractC23811y) {
    }

    @Override // u93.AbstractC34711x0, r93.InterfaceC31108b
    /* JADX INFO: renamed from: S */
    public final boolean mo48179S() {
        return false;
    }

    @Override // u93.C34689m0, r93.InterfaceC31108b
    /* JADX INFO: renamed from: h0 */
    public final Object mo48190h0(InterfaceC31105a interfaceC31105a) {
        C23465k c23465k = this.f65592c0;
        if (c23465k == null || !((InterfaceC31105a) c23465k.f92937w).equals(interfaceC31105a)) {
            return null;
        }
        return c23465k.f92938x;
    }

    @Override // u93.C34689m0, r93.InterfaceC31110b1
    public final boolean isConst() {
        AbstractC23811y type = getType();
        if (!this.f65591b0) {
            return false;
        }
        AbstractC22676k.m65750j(type, "type");
        if (((!AbstractC27736h.m83805G(type) && !AbstractC27746r.m83842c(type)) || AbstractC23767d1.m69849e(type)) && !AbstractC27736h.m83806H(type)) {
            return false;
        }
        C32308j c32308j = AbstractC26532s.f105470a;
        C35847e ENHANCED_NULLABILITY_ANNOTATION = AbstractC14331x.f52321p;
        AbstractC22676k.m65749i(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return !AbstractC25390g.m74513v(type, ENHANCED_NULLABILITY_ANNOTATION) || AbstractC27736h.m83806H(type);
    }
}
