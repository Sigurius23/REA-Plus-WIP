package p272k4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p108e4.C12685s;
import p242j4.C21302b;

/* JADX INFO: renamed from: k4.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C22184h extends AbstractC22179c {
    public C22184h(C12685s c12685s) {
        super(c12685s, 1);
    }

    @Override // p242j4.C21307g, p242j4.C21302b, p242j4.InterfaceC21308h
    public final void apply() {
        C12685s c12685s;
        ArrayList arrayList = this.f81472m0;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c12685s = this.f81470k0;
            if (!zHasNext) {
                break;
            } else {
                c12685s.m35492b(it.next()).m59815g();
            }
        }
        C21302b c21302b = null;
        C21302b c21302b2 = null;
        for (Object obj : arrayList) {
            C21302b c21302bM35492b = c12685s.m35492b(obj);
            if (c21302b2 == null) {
                Object obj2 = this.f81400N;
                if (obj2 != null) {
                    c21302bM35492b.m59823o(obj2);
                    c21302bM35492b.mo59819k(this.f81434l).m59821m(this.f81440r);
                } else {
                    Object obj3 = this.f81401O;
                    if (obj3 != null) {
                        c21302bM35492b.f81432j0 = 6;
                        c21302bM35492b.f81401O = obj3;
                        c21302bM35492b.mo59819k(this.f81434l).m59821m(this.f81440r);
                    } else {
                        Object obj4 = this.f81396J;
                        if (obj4 != null) {
                            c21302bM35492b.m59823o(obj4);
                            c21302bM35492b.mo59819k(this.f81431j).m59821m(this.f81438p);
                        } else {
                            Object obj5 = this.f81397K;
                            if (obj5 != null) {
                                c21302bM35492b.f81432j0 = 6;
                                c21302bM35492b.f81401O = obj5;
                                c21302bM35492b.mo59819k(this.f81431j).m59821m(this.f81438p);
                            } else {
                                String string = c21302bM35492b.f81413a.toString();
                                c21302bM35492b.m59823o(0);
                                c21302bM35492b.mo59820l(Float.valueOf(m63491y(string))).m59822n(Float.valueOf(m63490x(string)));
                            }
                        }
                    }
                }
                c21302b2 = c21302bM35492b;
            }
            if (c21302b != null) {
                String string2 = c21302b.f81413a.toString();
                String string3 = c21302bM35492b.f81413a.toString();
                Object obj6 = c21302bM35492b.f81413a;
                c21302b.f81432j0 = 7;
                c21302b.f81402P = obj6;
                c21302b.mo59820l(Float.valueOf(m63489w(string2))).m59822n(Float.valueOf(m63488v(string2)));
                Object obj7 = c21302b.f81413a;
                c21302bM35492b.f81432j0 = 6;
                c21302bM35492b.f81401O = obj7;
                c21302bM35492b.mo59820l(Float.valueOf(m63491y(string3))).m59822n(Float.valueOf(m63490x(string3)));
            }
            String string4 = obj.toString();
            HashMap map = this.f86006o0;
            float fFloatValue = map.containsKey(string4) ? ((Float) map.get(string4)).floatValue() : -1.0f;
            if (fFloatValue != -1.0f) {
                c21302bM35492b.f81423f = fFloatValue;
            }
            c21302b = c21302bM35492b;
        }
        if (c21302b != null) {
            Object obj8 = this.f81402P;
            if (obj8 != null) {
                c21302b.f81432j0 = 7;
                c21302b.f81402P = obj8;
                c21302b.mo59819k(this.f81435m).m59821m(this.f81441s);
            } else {
                Object obj9 = this.f81403Q;
                if (obj9 != null) {
                    c21302b.m59817i(obj9);
                    c21302b.mo59819k(this.f81435m).m59821m(this.f81441s);
                } else {
                    Object obj10 = this.f81398L;
                    if (obj10 != null) {
                        c21302b.f81432j0 = 7;
                        c21302b.f81402P = obj10;
                        c21302b.mo59819k(this.f81433k).m59821m(this.f81439q);
                    } else {
                        Object obj11 = this.f81399M;
                        if (obj11 != null) {
                            c21302b.m59817i(obj11);
                            c21302b.mo59819k(this.f81433k).m59821m(this.f81439q);
                        } else {
                            String string5 = c21302b.f81413a.toString();
                            c21302b.m59817i(0);
                            c21302b.mo59820l(Float.valueOf(m63489w(string5))).m59822n(Float.valueOf(m63488v(string5)));
                        }
                    }
                }
            }
        }
        if (c21302b2 == null) {
            return;
        }
        float f13 = this.f86005n0;
        if (f13 != 0.5f) {
            c21302b2.f81427h = f13;
        }
        int iOrdinal = this.f86011t0.ordinal();
        if (iOrdinal == 0) {
            c21302b2.f81419d = 0;
        } else if (iOrdinal == 1) {
            c21302b2.f81419d = 1;
        } else {
            if (iOrdinal != 2) {
                return;
            }
            c21302b2.f81419d = 2;
        }
    }
}
