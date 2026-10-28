package wa3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: wa3.m */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC37006m extends AbstractC37012p implements InterfaceC37020w {

    /* JADX INFO: renamed from: w */
    public final C37000j f158356w;

    public AbstractC37006m() {
        this.f158356w = new C37000j();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m118818i() {
        C36983a0 c36983a0 = this.f158356w.f158350a;
        for (int i13 = 0; i13 < c36983a0.f158310x.size(); i13++) {
            if (!C37000j.m118803e((Map.Entry) c36983a0.f158310x.get(i13))) {
                return false;
            }
        }
        Iterator it = c36983a0.m118729c().iterator();
        while (it.hasNext()) {
            if (!C37000j.m118803e((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final int m118819j() {
        C36983a0 c36983a0 = this.f158356w.f158350a;
        int iM118802d = 0;
        for (int i13 = 0; i13 < c36983a0.f158310x.size(); i13++) {
            Map.Entry entry = (Map.Entry) c36983a0.f158310x.get(i13);
            iM118802d += C37000j.m118802d((C37008n) entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : c36983a0.m118729c()) {
            iM118802d += C37000j.m118802d((C37008n) entry2.getKey(), entry2.getValue());
        }
        return iM118802d;
    }

    /* JADX INFO: renamed from: k */
    public final Object m118820k(C37010o c37010o) {
        m118824o(c37010o);
        C37008n c37008n = c37010o.f158363d;
        Object obj = this.f158356w.f158350a.get(c37008n);
        if (obj == null) {
            return c37010o.f158361b;
        }
        if (!c37008n.f158359y) {
            return c37010o.m118825a(obj);
        }
        if (c37008n.f158358x.f158371w != EnumC37013p0.ENUM) {
            return obj;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(c37010o.m118825a(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m118821l(C37010o c37010o) {
        m118824o(c37010o);
        C37008n c37008n = c37010o.f158363d;
        C37000j c37000j = this.f158356w;
        c37000j.getClass();
        if (c37008n.f158359y) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return c37000j.f158350a.get(c37008n) != null;
    }

    /* JADX INFO: renamed from: m */
    public final void m118822m() {
        this.f158356w.m118809f();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0019  */
    /* JADX INFO: renamed from: n */
    public final boolean m118823n(C36992f c36992f, C36994g c36994g, C36998i c36998i, int i13) {
        boolean z4;
        boolean z13;
        Object objMo92277g;
        InterfaceC37019v interfaceC37019v;
        int i14 = i13 & 7;
        C37010o c37010o = (C37010o) c36998i.f158347a.get(new C36996h(mo92288a(), i13 >>> 3));
        if (c37010o == null) {
            z13 = true;
            z4 = false;
        } else {
            C37008n c37008n = c37010o.f158363d;
            EnumC37011o0 enumC37011o0 = c37008n.f158358x;
            C37000j c37000j = C37000j.f158349c;
            if (i14 == enumC37011o0.f158372x) {
                z13 = false;
                z4 = false;
            } else if (c37008n.f158359y && enumC37011o0.mo118817a() && i14 == 2) {
                z4 = true;
                z13 = false;
            } else {
                z13 = true;
                z4 = false;
            }
        }
        if (z13) {
            return c36992f.m118772r(i13, c36994g);
        }
        AbstractC37002k abstractC37002kMo92263e = null;
        C37000j c37000j2 = this.f158356w;
        if (z4) {
            int iM118759e = c36992f.m118759e(c36992f.m118766l());
            C37008n c37008n2 = c37010o.f158363d;
            if (c37008n2.f158358x != EnumC37011o0.f158367G) {
                while (c36992f.m118757c() > 0) {
                    c37000j2.m118807a(c37008n2, C37000j.m118804h(c36992f, c37008n2.f158358x));
                }
            } else if (c36992f.m118757c() > 0) {
                c36992f.m118766l();
                throw null;
            }
            c36992f.m118758d(iM118759e);
            return true;
        }
        C37008n c37008n3 = c37010o.f158363d;
        EnumC37011o0 enumC37011o1 = c37008n3.f158358x;
        boolean z14 = c37008n3.f158359y;
        int iOrdinal = enumC37011o1.f158371w.ordinal();
        if (iOrdinal == 7) {
            c36992f.m118766l();
            throw null;
        }
        if (iOrdinal != 8) {
            objMo92277g = C37000j.m118804h(c36992f, enumC37011o1);
        } else {
            if (!z14 && (interfaceC37019v = (InterfaceC37019v) c37000j2.f158350a.get(c37008n3)) != null) {
                abstractC37002kMo92263e = interfaceC37019v.mo92261c();
            }
            if (abstractC37002kMo92263e == null) {
                abstractC37002kMo92263e = c37010o.f158362c.mo92263e();
            }
            if (enumC37011o1 == EnumC37011o0.f158365E) {
                int i15 = c37008n3.f158357w;
                c36992f.m118756b();
                c36992f.f158333i++;
                abstractC37002kMo92263e.mo92278h(c36992f, c36998i);
                c36992f.m118755a((i15 << 3) | 4);
                c36992f.f158333i--;
            } else {
                int iM118766l = c36992f.m118766l();
                c36992f.m118756b();
                int iM118759e2 = c36992f.m118759e(iM118766l);
                c36992f.f158333i++;
                abstractC37002kMo92263e.mo92278h(c36992f, c36998i);
                c36992f.m118755a(0);
                c36992f.f158333i--;
                c36992f.m118758d(iM118759e2);
            }
            objMo92277g = abstractC37002kMo92263e.mo92277g();
        }
        if (z14) {
            c37000j2.m118807a(c37008n3, c37010o.m118826b(objMo92277g));
            return true;
        }
        c37000j2.m118811i(c37008n3, c37010o.m118826b(objMo92277g));
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final void m118824o(C37010o c37010o) {
        if (c37010o.f158360a != mo92288a()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public AbstractC37006m(AbstractC37004l abstractC37004l) {
        abstractC37004l.f158354x.m118809f();
        abstractC37004l.f158355y = false;
        this.f158356w = abstractC37004l.f158354x;
    }
}
