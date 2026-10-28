package p510u0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.AbstractC1094c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p027b3.InterfaceC2355b3;
import p209i3.AbstractC18032n;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22989q;
import p294l3.AbstractC23284v;
import p294l3.C23246c;
import p294l3.C23248d;
import p294l3.C23250e;
import p294l3.C23254g;
import p294l3.C23267m0;
import p294l3.C23277r0;
import p294l3.C23279s0;
import p294l3.C23286w;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p512u2.AbstractC34454d0;
import p512u2.AbstractC34471q;
import p512u2.InterfaceC34469o;
import p668z1.C39967p;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22677k0;
import qm2.C30486c;
import s01.C32049e;
import s51.C32209f;
import sg2.C32469t;
import sz.C33151q;
import tx0.C34238a;

/* JADX INFO: renamed from: u0.r1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34352r1 {

    /* JADX INFO: renamed from: a */
    public final C28633k1 f144301a = AbstractC28683x.m87272z(null);

    /* JADX INFO: renamed from: b */
    public C23254g f144302b;

    /* JADX INFO: renamed from: c */
    public final C39967p f144303c;

    public C34352r1(C23254g c23254g) {
        C34350r c34350r = new C34350r(9);
        c23254g.getClass();
        C23248d c23248d = new C23248d(c23254g);
        ArrayList arrayList = c23248d.f92121y;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            List list = (List) c34350r.invoke(((C23246c) arrayList.get(i13)).m67297a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i14 = 0; i14 < size2; i14++) {
                C23250e c23250e = (C23250e) list.get(i14);
                arrayList3.add(new C23246c(c23250e.f92126b, c23250e.f92127c, c23250e.f92125a, c23250e.f92128d));
            }
            AbstractC25265s.m74141p0(arrayList2, arrayList3);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.f144302b = c23248d.m67309k();
        this.f144303c = new C39967p();
    }

    /* JADX INFO: renamed from: c */
    public static C23250e m108656c(C23250e c23250e, C23277r0 c23277r0) {
        C23286w c23286w = c23277r0.f92228b;
        int iM67373c = c23286w.m67373c(c23286w.f92263f - 1, false);
        if (c23250e.f92126b < iM67373c) {
            return C23250e.m67313a(c23250e, null, Math.min(c23250e.f92127c, iM67373c), 11);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m108657a(Composer composer, int i13) {
        boolean z4;
        Object objM30453g;
        boolean z13;
        Object obj;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1154651354);
        char c3 = 2;
        int i14 = (c28655q.m87157i(this) ? 4 : 2) | i13;
        boolean z14 = false;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            InterfaceC2355b3 interfaceC2355b3 = (InterfaceC2355b3) c28655q.m87161k(AbstractC2453v1.f9579r);
            C23254g c23254g = this.f144302b;
            List listM67314a = c23254g.m67314a(c23254g.f92135x.length());
            int size = listM67314a.size();
            int i15 = 0;
            while (i15 < size) {
                C23250e c23250e = (C23250e) listM67314a.get(i15);
                int i16 = c23250e.f92126b;
                Object obj2 = c23250e.f92125a;
                if (i16 != c23250e.f92127c) {
                    c28655q.m87150e0(725478935);
                    Object objM87133R = c28655q.m87133R();
                    C28676v0 c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM30453g = objM87133R;
                        objM30453g = AbstractC11266d.m30453g(c28655q);
                    }
                    objM30453g = objM87133R;
                    InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM30453g;
                    Modifier modifierM3486a = AbstractC1127a.m3486a(C2314t.f9131w, new C32469t(22, this, c23250e));
                    Object objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        z13 = true;
                        C34350r c34350r = new C34350r(10);
                        c28655q.m87172p0(c34350r);
                        obj = c34350r;
                    } else {
                        z13 = true;
                        obj = objM87133R2;
                    }
                    Modifier modifierM3367b = AbstractC1094c.m3367b(AbstractC18032n.m51775c(modifierM3486a, z14, (Function1) obj).mo3471e(new C34355s1(new C30486c(3, this, c23250e))), interfaceC21083i);
                    InterfaceC34469o.f144811a.getClass();
                    Modifier modifierM108918i = AbstractC34454d0.m108918i(modifierM3367b, AbstractC34471q.f144814c);
                    boolean zM87157i = c28655q.m87157i(this) | c28655q.m87153g(c23250e) | c28655q.m87157i(interfaceC2355b3);
                    Object objM87133R3 = c28655q.m87133R();
                    Object obj3 = objM87133R3;
                    if (zM87157i || objM87133R3 == c28676v0) {
                        C32209f c32209f = new C32209f(this, c23250e, interfaceC2355b3);
                        c28655q.m87172p0(c32209f);
                        obj3 = c32209f;
                    }
                    boolean z15 = false;
                    AbstractC22989q.m66760a(AbstractC1092a.m3363h(modifierM108918i, interfaceC21083i, null, (InterfaceC4339a) obj3, 508), c28655q, 0);
                    AbstractC23284v abstractC23284v = (AbstractC23284v) obj2;
                    C23279s0 c23279s0Mo67353b = abstractC23284v.mo67353b();
                    if (c23279s0Mo67353b == null || (c23279s0Mo67353b.f92237a == null && c23279s0Mo67353b.f92238b == null && c23279s0Mo67353b.f92239c == null && c23279s0Mo67353b.f92240d == null)) {
                        z4 = false;
                        c28655q.m87150e0(728331710);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(726303039);
                        Object objM87133R4 = c28655q.m87133R();
                        Object obj4 = objM87133R4;
                        if (objM87133R4 == c28676v0) {
                            C34357t0 c34357t0 = new C34357t0(interfaceC21083i);
                            c28655q.m87172p0(c34357t0);
                            obj4 = c34357t0;
                        }
                        C34357t0 c34357t1 = (C34357t0) obj4;
                        Object objM87133R5 = c28655q.m87133R();
                        Object obj5 = objM87133R5;
                        if (objM87133R5 == c28676v0) {
                            C33151q c33151q = new C33151q(c34357t1, z15 ? 1 : 0, 8);
                            c28655q.m87172p0(c33151q);
                            obj5 = c33151q;
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) obj5, C23454a0.f92919a);
                        C28621h1 c28621h1 = c34357t1.f144353b;
                        C28621h1 c28621h2 = c34357t1.f144353b;
                        Boolean boolValueOf = Boolean.valueOf((c28621h1.m87024x() & 2) != 0 ? z13 : false);
                        Boolean boolValueOf2 = Boolean.valueOf((c28621h2.m87024x() & 1) != 0 ? z13 : false);
                        Boolean boolValueOf3 = Boolean.valueOf((c28621h2.m87024x() & 4) != 0 ? z13 : false);
                        C23279s0 c23279s0Mo67353b2 = abstractC23284v.mo67353b();
                        C23267m0 c23267m0 = c23279s0Mo67353b2 != null ? c23279s0Mo67353b2.f92237a : null;
                        C23279s0 c23279s0Mo67353b3 = abstractC23284v.mo67353b();
                        C23267m0 c23267m1 = c23279s0Mo67353b3 != null ? c23279s0Mo67353b3.f92238b : null;
                        C23279s0 c23279s0Mo67353b4 = abstractC23284v.mo67353b();
                        C23267m0 c23267m2 = c23279s0Mo67353b4 != null ? c23279s0Mo67353b4.f92239c : null;
                        C23279s0 c23279s0Mo67353b5 = abstractC23284v.mo67353b();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, c23267m0, c23267m1, c23267m2, c23279s0Mo67353b5 != null ? c23279s0Mo67353b5.f92240d : null};
                        boolean zM87157i2 = c28655q.m87157i(this) | c28655q.m87153g(c23250e);
                        Object objM87133R6 = c28655q.m87133R();
                        Object obj6 = objM87133R6;
                        if (zM87157i2 || objM87133R6 == c28676v0) {
                            C32469t c32469t = new C32469t(this, c23250e, c34357t1);
                            c28655q.m87172p0(c32469t);
                            obj6 = c32469t;
                        }
                        m108658b(objArr, (Function1) obj6, c28655q, (i14 << 6) & 896);
                        z4 = false;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z4);
                } else {
                    z4 = z14;
                    c28655q.m87150e0(728345598);
                    c28655q.m87173q(z4);
                }
                i15++;
                z14 = z4;
                c3 = c3;
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34238a(this, i13, 5);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m108658b(Object[] objArr, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2083052099);
        int i14 = (i13 & 48) == 0 ? (c28655q.m87157i(function1) ? 32 : 16) | i13 : i13;
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(this) ? 256 : 128;
        }
        c28655q.m87144b0(-358305778, Integer.valueOf(objArr.length));
        int i15 = i14 | (c28655q.m87149e(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i15 |= c28655q.m87157i(obj) ? 4 : 0;
        }
        c28655q.m87173q(false);
        if ((i15 & 14) == 0) {
            i15 |= 2;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C22677k0 c22677k0 = new C22677k0(2);
            c22677k0.m65760a(function1);
            c22677k0.m65764e(objArr);
            ArrayList arrayList = c22677k0.f89339a;
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zM87157i = c28655q.m87157i(this) | ((i15 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C34329k(this, function1, 1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87252f(array, (Function1) objM87133R, c28655q);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32049e(this, objArr, function1, i13, 16);
        }
    }
}
