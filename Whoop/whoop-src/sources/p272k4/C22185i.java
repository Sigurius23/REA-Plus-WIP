package p272k4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p108e4.C12685s;
import p242j4.C21302b;

/* JADX INFO: renamed from: k4.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C22185i extends AbstractC22179c {
    public C22185i(C12685s c12685s) {
        super(c12685s, 2);
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
                c12685s.m35492b(it.next()).m59816h();
            }
        }
        C21302b c21302b = null;
        C21302b c21302b2 = null;
        for (Object obj : arrayList) {
            C21302b c21302bM35492b = c12685s.m35492b(obj);
            if (c21302b2 == null) {
                Object obj2 = this.f81404R;
                if (obj2 != null) {
                    c21302bM35492b.m59824p(obj2);
                    c21302bM35492b.mo59819k(this.f81436n).m59821m(this.f81442t);
                } else {
                    Object obj3 = this.f81405S;
                    if (obj3 != null) {
                        c21302bM35492b.f81432j0 = 10;
                        c21302bM35492b.f81405S = obj3;
                        c21302bM35492b.mo59819k(this.f81436n).m59821m(this.f81442t);
                    } else {
                        String string = c21302bM35492b.f81413a.toString();
                        c21302bM35492b.m59824p(0);
                        c21302bM35492b.mo59820l(Float.valueOf(m63491y(string))).m59822n(Float.valueOf(m63490x(string)));
                    }
                }
                c21302b2 = c21302bM35492b;
            }
            if (c21302b != null) {
                String string2 = c21302b.f81413a.toString();
                String string3 = c21302bM35492b.f81413a.toString();
                Object obj4 = c21302bM35492b.f81413a;
                c21302b.f81432j0 = 12;
                c21302b.f81407U = obj4;
                c21302b.mo59820l(Float.valueOf(m63489w(string2))).m59822n(Float.valueOf(m63488v(string2)));
                Object obj5 = c21302b.f81413a;
                c21302bM35492b.f81432j0 = 10;
                c21302bM35492b.f81405S = obj5;
                c21302bM35492b.mo59820l(Float.valueOf(m63491y(string3))).m59822n(Float.valueOf(m63490x(string3)));
            }
            String string4 = obj.toString();
            HashMap map = this.f86006o0;
            float fFloatValue = map.containsKey(string4) ? ((Float) map.get(string4)).floatValue() : -1.0f;
            if (fFloatValue != -1.0f) {
                c21302bM35492b.f81425g = fFloatValue;
            }
            c21302b = c21302bM35492b;
        }
        if (c21302b != null) {
            Object obj6 = this.f81407U;
            if (obj6 != null) {
                c21302b.f81432j0 = 12;
                c21302b.f81407U = obj6;
                c21302b.mo59819k(this.f81437o).m59821m(this.f81443u);
            } else {
                Object obj7 = this.f81408V;
                if (obj7 != null) {
                    c21302b.m59813e(obj7);
                    c21302b.mo59819k(this.f81437o).m59821m(this.f81443u);
                } else {
                    String string5 = c21302b.f81413a.toString();
                    c21302b.m59813e(0);
                    c21302b.mo59820l(Float.valueOf(m63489w(string5))).m59822n(Float.valueOf(m63488v(string5)));
                }
            }
        }
        if (c21302b2 == null) {
            return;
        }
        float f13 = this.f86005n0;
        if (f13 != 0.5f) {
            c21302b2.f81429i = f13;
        }
        int iOrdinal = this.f86011t0.ordinal();
        if (iOrdinal == 0) {
            c21302b2.f81421e = 0;
        } else if (iOrdinal == 1) {
            c21302b2.f81421e = 1;
        } else {
            if (iOrdinal != 2) {
                return;
            }
            c21302b2.f81421e = 2;
        }
    }
}
