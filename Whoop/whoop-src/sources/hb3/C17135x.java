package hb3;

import cb3.AbstractC4393e;
import e93.AbstractC12889b;
import ge3.AbstractC15751g;
import java.util.ArrayList;
import java.util.List;
import jb3.C21541a;
import jb3.C21543c;
import jb3.C21548h;
import jb3.C21559s;
import jb3.C21560t;
import jb3.C21563w;
import kb3.C22339h;
import lb3.AbstractC23811y;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import p249jc.AbstractC21598x;
import p581we.C37199o;
import p715kotlin.jvm.internal.AbstractC22676k;
import qa3.C30122c0;
import qa3.C30129e1;
import qa3.C30136h;
import qa3.C30146k0;
import qa3.C30154o;
import qa3.C30171w0;
import qa3.EnumC30125d0;
import qa3.EnumC30128e0;
import qa3.EnumC30147k1;
import r93.C31161v0;
import r93.EnumC31106a0;
import r93.EnumC31120f;
import r93.InterfaceC31107a1;
import r93.InterfaceC31108b;
import r93.InterfaceC31117e;
import r93.InterfaceC31124g0;
import r93.InterfaceC31135k;
import r93.InterfaceC31151q0;
import r93.InterfaceC31155s0;
import s93.C32304f;
import s93.C32305g;
import s93.C32308j;
import s93.InterfaceC32307i;
import sa3.AbstractC32330d;
import sa3.C32329c;
import sa3.C32334h;
import sa3.C32336j;
import sa3.InterfaceC32332f;
import u93.AbstractC34677g0;
import u93.C34691n0;
import u93.C34693o0;
import u93.C34695p0;
import u93.C34706v;
import u93.C34709w0;
import va3.C35847e;
import va3.C35850h;
import wa3.AbstractC37006m;
import wb3.AbstractC37056f;
import ya3.AbstractC39373p;

/* JADX INFO: renamed from: hb3.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C17135x {

    /* JADX INFO: renamed from: a */
    public final C17122k f65803a;

    /* JADX INFO: renamed from: b */
    public final C37199o f65804b;

    public C17135x(C17122k c17122k) {
        this.f65803a = c17122k;
        C17119i c17119i = c17122k.f65760a;
        this.f65804b = new C37199o(c17119i.f65736b, c17119i.f65746l);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC17104a0 m48373a(InterfaceC31135k interfaceC31135k) {
        if (interfaceC31135k instanceof InterfaceC31124g0) {
            C35847e c35847e = ((AbstractC34677g0) ((InterfaceC31124g0) interfaceC31135k)).f146067F;
            C17122k c17122k = this.f65803a;
            return new C17137z(c35847e, c17122k.f65761b, c17122k.f65763d, c17122k.f65766g);
        }
        if (interfaceC31135k instanceof C21548h) {
            return ((C21548h) interfaceC31135k).f82645U;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m48374b(List list, List list2, AbstractC37006m abstractC37006m, int i13) {
        C17135x c17135x = this;
        C17122k c17122k = c17135x.f65803a;
        InterfaceC31135k interfaceC31135k = c17122k.f65762c;
        AbstractC22676k.m65748h(interfaceC31135k, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        InterfaceC31108b interfaceC31108b = (InterfaceC31108b) interfaceC31135k;
        InterfaceC31135k interfaceC31135kMo60581g = interfaceC31108b.mo60581g();
        AbstractC22676k.m65749i(interfaceC31135kMo60581g, "getContainingDeclaration(...)");
        AbstractC17104a0 abstractC17104a0M48373a = c17135x.m48373a(interfaceC31135kMo60581g);
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        for (Object obj : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            C30171w0 c30171w0 = (C30171w0) obj;
            C30129e1 c30129e1 = (C30129e1) AbstractC25265s.m74102I0(i14, list2);
            C34695p0 c34695p0M125570d = AbstractC39373p.m125570d(interfaceC31108b, c17122k.f65767h.m48362g(c30171w0), null, (abstractC17104a0M48373a == null || !AbstractC32330d.f133803c.mo91233e((c30129e1 == null || (c30129e1.f123124y & 1) != 1) ? 0 : c30129e1.f123125z).booleanValue()) ? C32305g.f133684a : new C21563w(c17122k.f65760a.f65735a, new C17133v(c17135x, abstractC17104a0M48373a, abstractC37006m, i13, i14, c30129e1)), i14);
            if (c34695p0M125570d != null) {
                arrayList.add(c34695p0M125570d);
            }
            c17135x = this;
            i14 = i15;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC32307i m48375c(AbstractC37006m abstractC37006m, int i13, int i14) {
        return !AbstractC32330d.f133803c.mo91233e(i13).booleanValue() ? C32305g.f133684a : new C21563w(this.f65803a.f65760a.f65735a, new C17130s(this, abstractC37006m, i14, 0));
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC32307i m48376d(C30146k0 c30146k0, boolean z4) {
        return !AbstractC32330d.f133803c.mo91233e(c30146k0.f123332z).booleanValue() ? C32305g.f133684a : new C21563w(this.f65803a.f65760a.f65735a, new C17131t(this, z4, c30146k0));
    }

    /* JADX INFO: renamed from: e */
    public final C21543c m48377e(C30154o c30154o, boolean z4) {
        C17122k c17122k = this.f65803a;
        InterfaceC31135k interfaceC31135k = c17122k.f65762c;
        AbstractC22676k.m65748h(interfaceC31135k, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        InterfaceC31117e interfaceC31117e = (InterfaceC31117e) interfaceC31135k;
        C21543c c21543c = new C21543c(interfaceC31117e, null, m48375c(c30154o, c30154o.f123372z, 1), z4, 1, c30154o, c17122k.f65761b, c17122k.f65763d, c17122k.f65764e, c17122k.f65766g, null);
        C17135x c17135x = c17122k.m48372a(c21543c, C25271y.f99162w, c17122k.f65761b, c17122k.f65763d, c17122k.f65764e, c17122k.f65765f).f65768i;
        List list = c30154o.f123364E;
        AbstractC22676k.m65749i(list, "getValueParameterList(...)");
        c21543c.m109568X0(c17135x.m48380h(list, c30154o, 1), AbstractC15751g.m44466s((EnumC30147k1) AbstractC32330d.f133804d.mo91233e(c30154o.f123372z)));
        c21543c.m109633T0(interfaceC31117e.mo60594i());
        c21543c.f146205S = interfaceC31117e.mo60493U();
        c21543c.f146209W = !AbstractC32330d.f133815o.mo91233e(c30154o.f123372z).booleanValue();
        return c21543c;
    }

    /* JADX INFO: renamed from: f */
    public final C21560t m48378f(C30122c0 proto) {
        int i13;
        AbstractC23811y abstractC23811yM48362g;
        C17122k c17122k = this.f65803a;
        InterfaceC32332f interfaceC32332f = c17122k.f65761b;
        C32334h c32334h = c17122k.f65763d;
        AbstractC22676k.m65750j(proto, "proto");
        if ((proto.f123057y & 1) == 1) {
            i13 = proto.f123058z;
        } else {
            int i14 = proto.f123036E;
            i13 = ((i14 >> 8) << 6) + (i14 & 63);
        }
        int i15 = i13;
        InterfaceC32307i interfaceC32307iM48375c = m48375c(proto, i15, 1);
        int i16 = proto.f123057y;
        InterfaceC32307i c21541a = ((i16 & 32) == 32 || (i16 & 64) == 64) ? new C21541a(c17122k.f65760a.f65735a, new C17130s(this, proto, 1, 1)) : C32305g.f133684a;
        C21560t c21560t = new C21560t(c17122k.f65762c, null, interfaceC32307iM48375c, AbstractC12889b.m36240F(interfaceC32332f, proto.f123037F), AbstractC15751g.m44430J((EnumC30125d0) AbstractC32330d.f133816p.mo91233e(i15)), proto, c17122k.f65761b, c32334h, AbstractC4393e.m13809g(c17122k.f65762c).m113788a(AbstractC12889b.m36240F(interfaceC32332f, proto.f123037F)).equals(AbstractC17110d0.f65717a) ? C32336j.f133837b : c17122k.f65764e, c17122k.f65766g, null);
        List list = proto.f123040I;
        AbstractC22676k.m65749i(list, "getTypeParameterList(...)");
        C17122k c17122kM48372a = c17122k.m48372a(c21560t, list, c17122k.f65761b, c17122k.f65763d, c17122k.f65764e, c17122k.f65765f);
        C17135x c17135x = c17122kM48372a.f65768i;
        C17118h0 c17118h0 = c17122kM48372a.f65767h;
        C30171w0 c30171w0M60689l0 = AbstractC21598x.m60689l0(proto, c32334h);
        C34695p0 c34695p0M125576j = (c30171w0M60689l0 == null || (abstractC23811yM48362g = c17118h0.m48362g(c30171w0M60689l0)) == null) ? null : AbstractC39373p.m125576j(c21560t, abstractC23811yM48362g, c21541a);
        InterfaceC31135k interfaceC31135k = c17122k.f65762c;
        InterfaceC31117e interfaceC31117e = interfaceC31135k instanceof InterfaceC31117e ? (InterfaceC31117e) interfaceC31135k : null;
        InterfaceC31151q0 interfaceC31151q0Mo95864q0 = interfaceC31117e != null ? interfaceC31117e.mo95864q0() : null;
        List listM60708w = AbstractC21598x.m60708w(proto, c32334h);
        List list2 = proto.f123046O;
        AbstractC22676k.m65749i(list2, "getContextParameterList(...)");
        ArrayList arrayListM48374b = c17135x.m48374b(listM60708w, list2, proto, 1);
        List listM48359b = c17118h0.m48359b();
        List list3 = proto.f123047P;
        AbstractC22676k.m65749i(list3, "getValueParameterList(...)");
        c21560t.mo48185X0(c34695p0M125576j, interfaceC31151q0Mo95864q0, arrayListM48374b, listM48359b, c17135x.m48380h(list3, proto, 1), c17118h0.m48362g(AbstractC21598x.m60697q0(proto, c32334h)), C17121j.m48366e((EnumC30128e0) AbstractC32330d.f133805e.mo91233e(i15)), AbstractC15751g.m44466s((EnumC30147k1) AbstractC32330d.f133804d.mo91233e(i15)), C25272z.f99163w);
        c21560t.f146200N = AbstractC32330d.f133817q.mo91233e(i15).booleanValue();
        c21560t.f146201O = AbstractC32330d.f133818r.mo91233e(i15).booleanValue();
        c21560t.f146202P = AbstractC32330d.f133821u.mo91233e(i15).booleanValue();
        c21560t.f146203Q = AbstractC32330d.f133819s.mo91233e(i15).booleanValue();
        c21560t.f146204R = AbstractC32330d.f133820t.mo91233e(i15).booleanValue();
        c21560t.f146208V = AbstractC32330d.f133822v.mo91233e(i15).booleanValue();
        c21560t.f146205S = AbstractC32330d.f133823w.mo91233e(i15).booleanValue();
        c21560t.f146209W = !AbstractC32330d.f133824x.mo91233e(i15).booleanValue();
        c17122k.f65760a.f65747m.getClass();
        return c21560t;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0150  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [r93.e] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX INFO: renamed from: g */
    public final C21559s m48379g(C30146k0 c30146k0, boolean z4) {
        int i13;
        InterfaceC32307i interfaceC32307iM48375c;
        C17135x c17135x;
        InterfaceC32307i c21541a;
        C32329c c32329c;
        boolean z13;
        C34691n0 c34691n0M125571e;
        C34691n0 c34691n0;
        C22339h c22339h;
        C34693o0 c34693o0M125572f;
        ?? r10;
        Object kind;
        InterfaceC31117e interfaceC31117e;
        AbstractC23811y abstractC23811yM48362g;
        C17122k c17122k = this.f65803a;
        InterfaceC32332f interfaceC32332f = c17122k.f65761b;
        C32334h c32334h = c17122k.f65763d;
        if ((c30146k0.f123331y & 1) == 1) {
            i13 = c30146k0.f123332z;
        } else {
            int i14 = c30146k0.f123304E;
            i13 = ((i14 >> 8) << 6) + (i14 & 63);
        }
        C32304f c32304f = C32305g.f133684a;
        if (z4) {
            List list = c30146k0.f123320U;
            AbstractC22676k.m65749i(list, "getAnnotationList(...)");
            List<C30136h> list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            for (C30136h c30136h : list2) {
                AbstractC22676k.m65747g(c30136h);
                arrayList.add(this.f65804b.m119229m(c30136h, interfaceC32332f));
            }
            interfaceC32307iM48375c = arrayList.isEmpty() ? c32304f : new C32308j(arrayList, 0);
        } else {
            interfaceC32307iM48375c = null;
        }
        InterfaceC31135k interfaceC31135k = c17122k.f65762c;
        if (interfaceC32307iM48375c == null) {
            interfaceC32307iM48375c = m48375c(c30146k0, i13, 2);
        }
        C32329c c32329c2 = AbstractC32330d.f133805e;
        EnumC31106a0 enumC31106a0M48366e = C17121j.m48366e((EnumC30128e0) c32329c2.mo91233e(i13));
        C32329c c32329c3 = AbstractC32330d.f133804d;
        int i15 = i13;
        C21559s c21559s = new C21559s(interfaceC31135k, null, interfaceC32307iM48375c, enumC31106a0M48366e, AbstractC15751g.m44466s((EnumC30147k1) c32329c3.mo91233e(i13)), AbstractC32330d.f133825y.mo91233e(i13).booleanValue(), AbstractC12889b.m36240F(interfaceC32332f, c30146k0.f123305F), AbstractC15751g.m44430J((EnumC30125d0) AbstractC32330d.f133816p.mo91233e(i13)), AbstractC32330d.f133787C.mo91233e(i13).booleanValue(), AbstractC32330d.f133786B.mo91233e(i13).booleanValue(), AbstractC32330d.f133789E.mo91233e(i13).booleanValue(), AbstractC32330d.f133790F.mo91233e(i13).booleanValue(), AbstractC32330d.f133791G.mo91233e(i13).booleanValue(), c30146k0, c17122k.f65761b, c32334h, c17122k.f65764e, c17122k.f65766g);
        List list3 = c30146k0.f123308I;
        AbstractC22676k.m65749i(list3, "getTypeParameterList(...)");
        C17122k c17122kM48372a = c17122k.m48372a(c21559s, list3, c17122k.f65761b, c17122k.f65763d, c17122k.f65764e, c17122k.f65765f);
        C17118h0 c17118h0 = c17122kM48372a.f65767h;
        boolean zBooleanValue = AbstractC32330d.f133826z.mo91233e(i15).booleanValue();
        if (zBooleanValue) {
            int i16 = c30146k0.f123331y;
            if ((i16 & 32) == 32 || (i16 & 64) == 64) {
                c17135x = this;
                c21541a = new C21541a(c17122k.f65760a.f65735a, new C17130s(c17135x, c30146k0, 3, 1));
            } else {
                c17135x = this;
                c21541a = c32304f;
            }
        } else {
            c17135x = this;
            c21541a = c32304f;
        }
        AbstractC23811y abstractC23811yM48362g2 = c17118h0.m48362g(AbstractC21598x.m60699r0(c30146k0, c32334h));
        List listM48359b = c17118h0.m48359b();
        InterfaceC31135k interfaceC31135k2 = c17122k.f65762c;
        InterfaceC31117e interfaceC31117e2 = interfaceC31135k2 instanceof InterfaceC31117e ? (InterfaceC31117e) interfaceC31135k2 : null;
        InterfaceC31151q0 interfaceC31151q0Mo95864q0 = interfaceC31117e2 != null ? interfaceC31117e2.mo95864q0() : null;
        C30171w0 c30171w0M60691m0 = AbstractC21598x.m60691m0(c30146k0, c32334h);
        C34695p0 c34695p0M125576j = (c30171w0M60691m0 == null || (abstractC23811yM48362g = c17118h0.m48362g(c30171w0M60691m0)) == null) ? null : AbstractC39373p.m125576j(c21559s, abstractC23811yM48362g, c21541a);
        C17135x c17135x2 = c17122kM48372a.f65768i;
        List listM60710x = AbstractC21598x.m60710x(c30146k0, c32334h);
        List list4 = c30146k0.f123314O;
        AbstractC22676k.m65749i(list4, "getContextParameterList(...)");
        r9.m109592Q0(abstractC23811yM48362g2, listM48359b, interfaceC31151q0Mo95864q0, c34695p0M125576j, c17135x2.m48374b(listM60710x, list4, c30146k0, 3));
        int iM100628b = AbstractC32330d.m100628b(AbstractC32330d.f133803c.mo91233e(i15).booleanValue(), (EnumC30147k1) c32329c3.mo91233e(i15), (EnumC30128e0) c32329c2.mo91233e(i15));
        C31161v0 c31161v0 = InterfaceC31155s0.f128370q;
        if (zBooleanValue) {
            int i17 = (c30146k0.f123331y & 256) == 256 ? c30146k0.f123316Q : iM100628b;
            boolean zBooleanValue2 = AbstractC32330d.f133795K.mo91233e(i17).booleanValue();
            boolean zBooleanValue3 = AbstractC32330d.f133796L.mo91233e(i17).booleanValue();
            boolean zBooleanValue4 = AbstractC32330d.f133797M.mo91233e(i17).booleanValue();
            InterfaceC32307i interfaceC32307iM48375c2 = c17135x.m48375c(c30146k0, i17, 3);
            if (zBooleanValue2) {
                z13 = true;
                c32329c = c32329c2;
                c34691n0M125571e = new C34691n0(c21559s, interfaceC32307iM48375c2, C17121j.m48366e((EnumC30128e0) c32329c2.mo91233e(i17)), AbstractC15751g.m44466s((EnumC30147k1) c32329c3.mo91233e(i17)), !zBooleanValue2, zBooleanValue3, zBooleanValue4, c21559s.getKind(), null, c31161v0);
            } else {
                c32329c = c32329c2;
                z13 = true;
                c34691n0M125571e = AbstractC39373p.m125571e(c21559s, interfaceC32307iM48375c2);
            }
            c34691n0M125571e.m109597M0(c21559s.getReturnType());
        } else {
            iM100628b = iM100628b;
            c32329c = c32329c2;
            c17135x = c17135x;
            z13 = true;
            c34691n0M125571e = null;
        }
        if (AbstractC32330d.f133785A.mo91233e(i15).booleanValue()) {
            int i18 = (c30146k0.f123331y & 512) == 512 ? c30146k0.f123317R : iM100628b;
            boolean zBooleanValue5 = AbstractC32330d.f133795K.mo91233e(i18).booleanValue();
            boolean zBooleanValue6 = AbstractC32330d.f133796L.mo91233e(i18).booleanValue();
            boolean zBooleanValue7 = AbstractC32330d.f133797M.mo91233e(i18).booleanValue();
            InterfaceC32307i interfaceC32307iM48375c3 = c17135x.m48375c(c30146k0, i18, 4);
            if (zBooleanValue5) {
                c34691n0 = c34691n0M125571e;
                C34693o0 c34693o0 = new C34693o0(c21559s, interfaceC32307iM48375c3, C17121j.m48366e((EnumC30128e0) c32329c.mo91233e(i18)), AbstractC15751g.m44466s((EnumC30147k1) c32329c3.mo91233e(i18)), !zBooleanValue5, zBooleanValue6, zBooleanValue7, c21559s.getKind(), null, c31161v0);
                InterfaceC31107a1 interfaceC31107a1 = (InterfaceC31107a1) AbstractC25265s.m74142p1(c17122kM48372a.m48372a(c34693o0, C25271y.f99162w, c17122kM48372a.f65761b, c17122kM48372a.f65763d, c17122kM48372a.f65764e, c17122kM48372a.f65765f).f65768i.m48380h(AbstractC37056f.m118958J(c30146k0.f123315P), c30146k0, 4));
                if (interfaceC31107a1 == null) {
                    C34693o0.m109600r0(6);
                    throw null;
                }
                c34693o0.f146137N = interfaceC31107a1;
                c34693o0M125572f = c34693o0;
                c22339h = null;
            } else {
                c34691n0 = c34691n0M125571e;
                c22339h = null;
                c34693o0M125572f = AbstractC39373p.m125572f(c21559s, interfaceC32307iM48375c3);
            }
        } else {
            c34691n0 = c34691n0M125571e;
            c22339h = null;
            c34693o0M125572f = null;
        }
        if (AbstractC32330d.f133788D.mo91233e(i15).booleanValue()) {
            c21559s.m109591O0(c22339h, new C17129r(c17135x, c30146k0, c21559s, 0));
        }
        InterfaceC31135k interfaceC31135k3 = c17122k.f65762c;
        if (interfaceC31135k3 instanceof InterfaceC31117e) {
            interfaceC31117e = (InterfaceC31117e) interfaceC31135k3;
        } else {
            r10 = c22339h;
        }
        if (r10 != 0) {
            r10 = interfaceC31117e;
            kind = r10.getKind();
        } else {
            r10 = interfaceC31117e;
            kind = c22339h;
        }
        if (kind == EnumC31120f.f128325E) {
            c21559s.m109591O0(c22339h, new C17129r(c17135x, c30146k0, c21559s, 1));
        }
        c21559s.m109590N0(c34691n0, c34693o0M125572f, new C34706v(c17135x.m48376d(c30146k0, false)), new C34706v(c17135x.m48376d(c30146k0, z13)));
        return c21559s;
    }

    /* JADX INFO: renamed from: h */
    public final List m48380h(List list, AbstractC37006m abstractC37006m, int i13) {
        int i14;
        InterfaceC32307i c21563w;
        C17135x c17135x = this;
        C17122k c17122k = c17135x.f65803a;
        C32334h c32334h = c17122k.f65763d;
        C17118h0 c17118h0 = c17122k.f65767h;
        InterfaceC31135k interfaceC31135k = c17122k.f65762c;
        AbstractC22676k.m65748h(interfaceC31135k, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        InterfaceC31108b interfaceC31108b = (InterfaceC31108b) interfaceC31135k;
        InterfaceC31135k interfaceC31135kMo60581g = interfaceC31108b.mo60581g();
        AbstractC22676k.m65749i(interfaceC31135kMo60581g, "getContainingDeclaration(...)");
        AbstractC17104a0 abstractC17104a0M48373a = c17135x.m48373a(interfaceC31135kMo60581g);
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        int i15 = 0;
        for (Object obj : list2) {
            int i16 = i15 + 1;
            AbstractC23811y abstractC23811yM48362g = null;
            if (i15 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            C30129e1 c30129e1 = (C30129e1) obj;
            int i17 = (c30129e1.f123124y & 1) == 1 ? c30129e1.f123125z : 0;
            if (abstractC17104a0M48373a == null || !AbstractC32330d.f133803c.mo91233e(i17).booleanValue()) {
                i14 = i15;
                c21563w = C32305g.f133684a;
            } else {
                i14 = i15;
                c21563w = new C21563w(c17122k.f65760a.f65735a, new C17132u(c17135x, abstractC17104a0M48373a, abstractC37006m, i13, i14, c30129e1));
            }
            C35850h c35850hM36240F = AbstractC12889b.m36240F(c17122k.f65761b, c30129e1.f123114E);
            AbstractC23811y abstractC23811yM48362g2 = c17118h0.m48362g(AbstractC21598x.m60713y0(c30129e1, c32334h));
            boolean zBooleanValue = AbstractC32330d.f133792H.mo91233e(i17).booleanValue();
            boolean zBooleanValue2 = AbstractC32330d.f133793I.mo91233e(i17).booleanValue();
            boolean zBooleanValue3 = AbstractC32330d.f133794J.mo91233e(i17).booleanValue();
            C30171w0 c30171w0M60644B0 = AbstractC21598x.m60644B0(c30129e1, c32334h);
            if (c30171w0M60644B0 != null) {
                abstractC23811yM48362g = c17118h0.m48362g(c30171w0M60644B0);
            }
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new C34709w0(interfaceC31108b, null, i14, c21563w, c35850hM36240F, abstractC23811yM48362g2, zBooleanValue, zBooleanValue2, zBooleanValue3, abstractC23811yM48362g, InterfaceC31155s0.f128370q));
            arrayList = arrayList2;
            i15 = i16;
            c17135x = this;
        }
        return AbstractC25265s.m74093D1(arrayList);
    }
}
