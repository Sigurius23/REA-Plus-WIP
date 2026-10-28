package u93;

import al.AbstractC0954a;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import cb3.AbstractC4393e;
import fb3.C14340a;
import fb3.C14341b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import lb3.AbstractC23791o;
import lb3.AbstractC23811y;
import lb3.AbstractC23812y0;
import lb3.C23758a1;
import lb3.EnumC23776g1;
import r93.AbstractC31146o;
import r93.AbstractC31150q;
import r93.AbstractC31152r;
import r93.C31161v0;
import r93.EnumC31106a0;
import r93.InterfaceC31107a1;
import r93.InterfaceC31135k;
import r93.InterfaceC31145n0;
import r93.InterfaceC31151q0;
import r93.InterfaceC31155s0;
import s93.InterfaceC32307i;
import ub3.AbstractC34756j;
import ub3.C34754h;
import va3.C35850h;

/* JADX INFO: renamed from: u93.l0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C34687l0 {

    /* JADX INFO: renamed from: a */
    public InterfaceC31135k f146098a;

    /* JADX INFO: renamed from: b */
    public EnumC31106a0 f146099b;

    /* JADX INFO: renamed from: c */
    public AbstractC31152r f146100c;

    /* JADX INFO: renamed from: e */
    public int f146102e;

    /* JADX INFO: renamed from: h */
    public final InterfaceC31151q0 f146105h;

    /* JADX INFO: renamed from: i */
    public final C35850h f146106i;

    /* JADX INFO: renamed from: j */
    public final AbstractC23811y f146107j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C34689m0 f146108k;

    /* JADX INFO: renamed from: d */
    public InterfaceC31145n0 f146101d = null;

    /* JADX INFO: renamed from: f */
    public AbstractC23812y0 f146103f = AbstractC23812y0.f94209a;

    /* JADX INFO: renamed from: g */
    public boolean f146104g = true;

    public C34687l0(C34689m0 c34689m0) {
        this.f146108k = c34689m0;
        this.f146098a = c34689m0.mo60581g();
        this.f146099b = c34689m0.mo60498k();
        this.f146100c = c34689m0.getVisibility();
        this.f146102e = c34689m0.getKind();
        this.f146105h = c34689m0.f146125U;
        this.f146106i = c34689m0.getName();
        this.f146107j = c34689m0.getType();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m109577a(int i13) {
        String str = (i13 == 1 || i13 == 2 || i13 == 3 || i13 == 5 || i13 == 7 || i13 == 9 || i13 == 11 || i13 == 19 || i13 == 13 || i13 == 14 || i13 == 16 || i13 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 1 || i13 == 2 || i13 == 3 || i13 == 5 || i13 == 7 || i13 == 9 || i13 == 11 || i13 == 19 || i13 == 13 || i13 == 14 || i13 == 16 || i13 == 17) ? 2 : 3];
        switch (i13) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                break;
            case 4:
                objArr[0] = "type";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 8:
                objArr[0] = "visibility";
                break;
            case 10:
                objArr[0] = "kind";
                break;
            case 12:
                objArr[0] = "typeParameters";
                break;
            case 15:
                objArr[0] = "substitution";
                break;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "owner";
                break;
        }
        if (i13 == 1) {
            objArr[1] = "setOwner";
        } else if (i13 == 2) {
            objArr[1] = "setOriginal";
        } else if (i13 == 3) {
            objArr[1] = "setPreserveSourceElement";
        } else if (i13 == 5) {
            objArr[1] = "setReturnType";
        } else if (i13 == 7) {
            objArr[1] = "setModality";
        } else if (i13 == 9) {
            objArr[1] = "setVisibility";
        } else if (i13 == 11) {
            objArr[1] = "setKind";
        } else if (i13 == 19) {
            objArr[1] = "setName";
        } else if (i13 == 13) {
            objArr[1] = "setTypeParameters";
        } else if (i13 == 14) {
            objArr[1] = "setDispatchReceiverParameter";
        } else if (i13 == 16) {
            objArr[1] = "setSubstitution";
        } else if (i13 != 17) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
        } else {
            objArr[1] = "setCopyOverrides";
        }
        switch (i13) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                break;
            case 4:
                objArr[2] = "setReturnType";
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 8:
                objArr[2] = "setVisibility";
                break;
            case 10:
                objArr[2] = "setKind";
                break;
            case 12:
                objArr[2] = "setTypeParameters";
                break;
            case 15:
                objArr[2] = "setSubstitution";
                break;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                objArr[2] = "setName";
                break;
            default:
                objArr[2] = "setOwner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 1 && i13 != 2 && i13 != 3 && i13 != 5 && i13 != 7 && i13 != 9 && i13 != 11 && i13 != 19 && i13 != 13 && i13 != 14 && i13 != 16 && i13 != 17) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: b */
    public final C34689m0 m109578b() {
        AbstractC34670d abstractC34670d;
        C34695p0 c34695p0;
        C34691n0 c34691n0;
        C34693o0 c34693o0;
        C23758a1 c23758a1;
        InterfaceC4339a interfaceC4339a;
        C34695p0 c34695p1;
        C34695p0 c34695p2;
        InterfaceC31135k interfaceC31135k = this.f146098a;
        EnumC31106a0 enumC31106a0 = this.f146099b;
        AbstractC31152r abstractC31152r = this.f146100c;
        InterfaceC31145n0 interfaceC31145n0 = this.f146101d;
        int i13 = this.f146102e;
        C35850h c35850h = this.f146106i;
        C34689m0 c34689m0 = this.f146108k;
        C34689m0 c34689m0Mo48188L0 = c34689m0.mo48188L0(interfaceC31135k, enumC31106a0, abstractC31152r, interfaceC31145n0, i13, c35850h);
        List typeParameters = c34689m0.getTypeParameters();
        ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
        C23758a1 c23758a1M69894m = AbstractC23791o.m69894m(typeParameters, this.f146103f, c34689m0Mo48188L0, arrayList);
        EnumC23776g1 enumC23776g1 = EnumC23776g1.OUT_VARIANCE;
        AbstractC23811y abstractC23811y = this.f146107j;
        AbstractC23811y abstractC23811yM69823i = c23758a1M69894m.m69823i(abstractC23811y, enumC23776g1);
        if (abstractC23811yM69823i != null) {
            EnumC23776g1 enumC23776g2 = EnumC23776g1.IN_VARIANCE;
            AbstractC23811y abstractC23811yM69823i2 = c23758a1M69894m.m69823i(abstractC23811y, enumC23776g2);
            if (abstractC23811yM69823i2 != null) {
                c34689m0Mo48188L0.mo48189P0(abstractC23811yM69823i2);
            }
            InterfaceC31151q0 interfaceC31151q0 = this.f146105h;
            if (interfaceC31151q0 != null) {
                AbstractC34670d abstractC34670dMo60593d = ((AbstractC34670d) interfaceC31151q0).mo60593d(c23758a1M69894m);
                if (abstractC34670dMo60593d != null) {
                    abstractC34670d = abstractC34670dMo60593d;
                }
            } else {
                abstractC34670d = null;
            }
            InterfaceC31151q0 interfaceC31151q1 = c34689m0.f146126V;
            if (interfaceC31151q1 != null) {
                AbstractC34670d abstractC34670d2 = (AbstractC34670d) interfaceC31151q1;
                AbstractC23811y abstractC23811yM69823i3 = c23758a1M69894m.m69823i(abstractC34670d2.getType(), enumC23776g2);
                if (abstractC23811yM69823i3 == null) {
                    c34695p2 = null;
                } else {
                    abstractC34670d2.getValue();
                    c34695p2 = new C34695p0(c34689m0Mo48188L0, new C14341b(c34689m0Mo48188L0, abstractC23811yM69823i3), abstractC34670d2.getAnnotations());
                }
                c34695p0 = c34695p2;
            } else {
                c34695p0 = null;
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = c34689m0.f146124T.iterator();
            while (it.hasNext()) {
                AbstractC34670d abstractC34670d3 = (AbstractC34670d) ((InterfaceC31151q0) it.next());
                AbstractC23811y abstractC23811yM69823i4 = c23758a1M69894m.m69823i(abstractC34670d3.getType(), EnumC23776g1.IN_VARIANCE);
                if (abstractC23811yM69823i4 == null) {
                    c34695p1 = null;
                } else {
                    C35850h c35850hM40963Q = ((C14340a) abstractC34670d3.getValue()).m40963Q();
                    abstractC34670d3.getValue();
                    c34695p1 = new C34695p0(c34689m0Mo48188L0, new C14340a(c34689m0Mo48188L0, abstractC23811yM69823i4, c35850hM40963Q), abstractC34670d3.getAnnotations());
                }
                if (c34695p1 != null) {
                    arrayList2.add(c34695p1);
                }
            }
            c34689m0Mo48188L0.m109592Q0(abstractC23811yM69823i, arrayList, abstractC34670d, c34695p0, arrayList2);
            C34691n0 c34691n1 = c34689m0.f146128X;
            C31161v0 c31161v0 = InterfaceC31155s0.f128370q;
            if (c34691n1 == null) {
                c34691n0 = null;
            } else {
                InterfaceC32307i annotations = c34691n1.getAnnotations();
                EnumC31106a0 enumC31106a1 = this.f146099b;
                AbstractC31152r visibility = c34689m0.f146128X.getVisibility();
                if (this.f146102e == 2 && AbstractC31150q.m95877e(AbstractC31150q.m95879g(((AbstractC31146o) visibility).f128347a.mo95872c()))) {
                    visibility = AbstractC31150q.f128356h;
                }
                AbstractC31152r abstractC31152r2 = visibility;
                C34691n0 c34691n2 = c34689m0.f146128X;
                boolean z4 = c34691n2.f146084F;
                boolean z13 = c34691n2.f146085G;
                boolean z14 = c34691n2.f146088J;
                int i14 = this.f146102e;
                InterfaceC31145n0 interfaceC31145n1 = this.f146101d;
                c34691n0 = new C34691n0(c34689m0Mo48188L0, annotations, enumC31106a1, abstractC31152r2, z4, z13, z14, i14, interfaceC31145n1 == null ? null : interfaceC31145n1.getGetter(), c31161v0);
            }
            if (c34691n0 != null) {
                C34691n0 c34691n3 = c34689m0.f146128X;
                AbstractC23811y abstractC23811y2 = c34691n3.f146133N;
                c34691n0.f146091M = C34689m0.m109587M0(c23758a1M69894m, c34691n3);
                c34691n0.m109597M0(abstractC23811y2 != null ? c23758a1M69894m.m69823i(abstractC23811y2, EnumC23776g1.OUT_VARIANCE) : null);
            }
            Object obj = c34689m0.f146129Y;
            if (obj == null) {
                c34693o0 = null;
            } else {
                InterfaceC32307i annotations2 = ((AbstractC0954a) obj).getAnnotations();
                EnumC31106a0 enumC31106a2 = this.f146099b;
                AbstractC31152r visibility2 = ((AbstractC34685k0) c34689m0.f146129Y).getVisibility();
                if (this.f146102e == 2 && AbstractC31150q.m95877e(AbstractC31150q.m95879g(((AbstractC31146o) visibility2).f128347a.mo95872c()))) {
                    visibility2 = AbstractC31150q.f128356h;
                }
                AbstractC31152r abstractC31152r3 = visibility2;
                AbstractC34685k0 abstractC34685k0 = (AbstractC34685k0) c34689m0.f146129Y;
                boolean z15 = abstractC34685k0.f146084F;
                boolean z16 = abstractC34685k0.f146085G;
                boolean z17 = abstractC34685k0.f146088J;
                int i15 = this.f146102e;
                InterfaceC31145n0 interfaceC31145n2 = this.f146101d;
                c34693o0 = new C34693o0(c34689m0Mo48188L0, annotations2, enumC31106a2, abstractC31152r3, z15, z16, z17, i15, interfaceC31145n2 == null ? null : interfaceC31145n2.getSetter(), c31161v0);
            }
            if (c34693o0 != null) {
                c23758a1 = c23758a1M69894m;
                List listM109628N0 = AbstractC34710x.m109628N0(c34693o0, ((C34693o0) c34689m0.f146129Y).mo78676v(), c23758a1, false, false, null);
                if (listM109628N0 == null) {
                    listM109628N0 = Collections.singletonList(C34693o0.m109599L0(c34693o0, AbstractC4393e.m13807e(this.f146098a).m83827o(), ((AbstractC0954a) ((InterfaceC31107a1) ((C34693o0) c34689m0.f146129Y).mo78676v().get(0))).getAnnotations()));
                }
                if (listM109628N0.size() != 1) {
                    throw new IllegalStateException();
                }
                c34693o0.f146091M = C34689m0.m109587M0(c23758a1, c34689m0.f146129Y);
                InterfaceC31107a1 interfaceC31107a1 = (InterfaceC31107a1) listM109628N0.get(0);
                if (interfaceC31107a1 == null) {
                    C34693o0.m109600r0(6);
                    throw null;
                }
                c34693o0.f146137N = interfaceC31107a1;
            } else {
                c23758a1 = c23758a1M69894m;
            }
            C34706v c34706v = c34689m0.f146130Z;
            C34706v c34706v2 = c34706v == null ? null : new C34706v(c34706v.getAnnotations(), c34689m0Mo48188L0);
            C34706v c34706v3 = c34689m0.f146131a0;
            c34689m0Mo48188L0.m109590N0(c34691n0, c34693o0, c34706v2, c34706v3 != null ? new C34706v(c34706v3.getAnnotations(), c34689m0Mo48188L0) : null);
            if (this.f146104g) {
                int i16 = C34754h.f146410y;
                C34754h c34754hM109753c = AbstractC34756j.m109753c();
                Iterator it3 = c34689m0.mo78673h().iterator();
                while (it3.hasNext()) {
                    c34754hM109753c.add(((InterfaceC31145n0) it3.next()).mo60593d(c23758a1));
                }
                c34689m0Mo48188L0.f146116L = c34754hM109753c;
            }
            if (c34689m0.isConst() && (interfaceC4339a = c34689m0.f146113I) != null) {
                c34689m0Mo48188L0.m109591O0(c34689m0.f146112H, interfaceC4339a);
            }
            return c34689m0Mo48188L0;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m109579c() {
        this.f146104g = false;
    }

    /* JADX INFO: renamed from: d */
    public final void m109580d() {
        this.f146102e = 2;
    }

    /* JADX INFO: renamed from: e */
    public final void m109581e(EnumC31106a0 enumC31106a0) {
        this.f146099b = enumC31106a0;
    }

    /* JADX INFO: renamed from: f */
    public final void m109582f(InterfaceC31145n0 interfaceC31145n0) {
        this.f146101d = interfaceC31145n0;
    }

    /* JADX INFO: renamed from: g */
    public final void m109583g(InterfaceC31135k interfaceC31135k) {
        if (interfaceC31135k != null) {
            this.f146098a = interfaceC31135k;
        } else {
            m109577a(0);
            throw null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m109584h(AbstractC23812y0 abstractC23812y0) {
        if (abstractC23812y0 != null) {
            this.f146103f = abstractC23812y0;
        } else {
            m109577a(15);
            throw null;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m109585i(AbstractC31152r abstractC31152r) {
        if (abstractC31152r != null) {
            this.f146100c = abstractC31152r;
        } else {
            m109577a(8);
            throw null;
        }
    }
}
