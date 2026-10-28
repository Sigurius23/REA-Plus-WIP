package aa3;

import af3.AbstractC0844t;
import af3.C0849y;
import bf3.C3205d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p338n9.InterfaceC26467a;
import p355o2.C27438i;
import p355o2.C27439j;
import p355o2.C27441l;
import p355o2.C27442m;
import p355o2.C27447r;
import p355o2.C27448s;
import p355o2.C27449t;
import p355o2.C27452w;
import p355o2.C27454y;
import p690zr.AbstractC41023g0;
import p690zr.AbstractC41047q;
import p690zr.C41017e0;
import p690zr.C41060w0;
import p715kotlin.NoWhenBranchMatchedException;
import qa.C30096a;
import sc3.C32392f;
import sc3.InterfaceC32397k;
import sc3.InterfaceC32400n;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: aa3.u0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0656u0 implements InterfaceC26467a {

    /* JADX INFO: renamed from: a */
    public ArrayList f2286a;

    public C0656u0(List list) {
        this.f2286a = new ArrayList(list == null ? new ArrayList(0) : list);
    }

    @Override // p338n9.InterfaceC26467a
    /* JADX INFO: renamed from: a */
    public AbstractC41023g0 mo1632a(long j7) {
        int iM1645n = m1645n(j7);
        if (iM1645n == 0) {
            C41017e0 c41017e0 = AbstractC41023g0.f176998x;
            return C41060w0.f177067E;
        }
        C30096a c30096a = (C30096a) this.f2286a.get(iM1645n - 1);
        long j13 = c30096a.f122821d;
        if (j13 == -9223372036854775807L || j7 < j13) {
            return c30096a.f122818a;
        }
        C41017e0 c41017e1 = AbstractC41023g0.f176998x;
        return C41060w0.f177067E;
    }

    @Override // p338n9.InterfaceC26467a
    /* JADX INFO: renamed from: b */
    public long mo1633b(long j7) {
        ArrayList arrayList = this.f2286a;
        if (arrayList.isEmpty() || j7 < ((C30096a) arrayList.get(0)).f122819b) {
            return -9223372036854775807L;
        }
        for (int i13 = 1; i13 < arrayList.size(); i13++) {
            long j13 = ((C30096a) arrayList.get(i13)).f122819b;
            if (j7 == j13) {
                return j13;
            }
            if (j7 < j13) {
                C30096a c30096a = (C30096a) arrayList.get(i13 - 1);
                long j14 = c30096a.f122821d;
                return (j14 == -9223372036854775807L || j14 > j7) ? c30096a.f122819b : j14;
            }
        }
        C30096a c30096a2 = (C30096a) AbstractC41047q.m133279i(arrayList);
        long j15 = c30096a2.f122821d;
        return (j15 == -9223372036854775807L || j7 < j15) ? c30096a2.f122819b : j15;
    }

    @Override // p338n9.InterfaceC26467a
    /* JADX INFO: renamed from: c */
    public long mo1634c(long j7) {
        ArrayList arrayList = this.f2286a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j7 < ((C30096a) arrayList.get(0)).f122819b) {
            return ((C30096a) arrayList.get(0)).f122819b;
        }
        for (int i13 = 1; i13 < arrayList.size(); i13++) {
            C30096a c30096a = (C30096a) arrayList.get(i13);
            long j13 = c30096a.f122819b;
            long j14 = c30096a.f122819b;
            if (j7 < j13) {
                long j15 = ((C30096a) arrayList.get(i13 - 1)).f122821d;
                return (j15 == -9223372036854775807L || j15 <= j7 || j15 >= j14) ? j14 : j15;
            }
        }
        long j16 = ((C30096a) AbstractC41047q.m133279i(arrayList)).f122821d;
        if (j16 == -9223372036854775807L || j7 >= j16) {
            return Long.MIN_VALUE;
        }
        return j16;
    }

    @Override // p338n9.InterfaceC26467a
    public void clear() {
        this.f2286a.clear();
    }

    @Override // p338n9.InterfaceC26467a
    /* JADX INFO: renamed from: d */
    public void mo1635d(long j7) {
        ArrayList arrayList = this.f2286a;
        int iM1645n = m1645n(j7);
        if (iM1645n == 0) {
            return;
        }
        long j13 = ((C30096a) arrayList.get(iM1645n - 1)).f122821d;
        if (j13 == -9223372036854775807L || j13 >= j7) {
            iM1645n--;
        }
        arrayList.subList(0, iM1645n).clear();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // p338n9.InterfaceC26467a
    /* JADX INFO: renamed from: e */
    public boolean mo1636e(C30096a c30096a, long j7) {
        boolean z4;
        ArrayList arrayList = this.f2286a;
        long j13 = c30096a.f122819b;
        AbstractC35849g.m113802d(j13 != -9223372036854775807L);
        if (j13 <= j7) {
            long j14 = c30096a.f122821d;
            if (j14 == -9223372036854775807L || j7 < j14) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j13 >= ((C30096a) arrayList.get(size)).f122819b) {
                arrayList.add(size + 1, c30096a);
                return z4;
            }
            if (((C30096a) arrayList.get(size)).f122819b <= j7) {
                z4 = false;
            }
        }
        arrayList.add(0, c30096a);
        return z4;
    }

    /* JADX INFO: renamed from: f */
    public void m1637f(InterfaceC32397k interfaceC32397k) {
        ArrayList arrayList = this.f2286a;
        if (interfaceC32397k instanceof InterfaceC32400n) {
            arrayList.add(interfaceC32397k);
        } else {
            if (!(interfaceC32397k instanceof C32392f)) {
                throw new NoWhenBranchMatchedException();
            }
            Iterator it = ((C32392f) interfaceC32397k).f134136a.iterator();
            while (it.hasNext()) {
                arrayList.add((InterfaceC32400n) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m1638g(List list) {
        if (list.isEmpty()) {
            return;
        }
        if (this.f2286a == null) {
            this.f2286a = new ArrayList();
        }
        if (this.f2286a.isEmpty()) {
            this.f2286a.addAll(list);
            return;
        }
        int size = this.f2286a.size() - 1;
        C0849y c0849y = (C0849y) this.f2286a.get(size);
        C0849y c0849y2 = (C0849y) list.get(0);
        int i13 = c0849y.f3049a;
        if (i13 == c0849y2.f3049a) {
            int i14 = c0849y.f3050b;
            int i15 = c0849y.f3051c;
            if (i14 + i15 == c0849y2.f3050b) {
                this.f2286a.set(size, new C0849y(i13, i14, i15 + c0849y2.f3051c));
                this.f2286a.addAll(list.subList(1, list.size()));
                return;
            }
        }
        this.f2286a.addAll(list);
    }

    /* JADX INFO: renamed from: h */
    public void m1639h(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m1638g(((AbstractC0844t) it.next()).m2056e());
        }
    }

    /* JADX INFO: renamed from: i */
    public void m1640i() {
        this.f2286a.add(C27438i.f110602c);
    }

    /* JADX INFO: renamed from: j */
    public void m1641j(float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f2286a.add(new C27439j(f13, f14, f15, f16, f17, f18));
    }

    /* JADX INFO: renamed from: k */
    public void m1642k(float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f2286a.add(new C27447r(f13, f14, f15, f16, f17, f18));
    }

    /* JADX INFO: renamed from: l */
    public ArrayList m1643l() {
        return this.f2286a;
    }

    /* JADX INFO: renamed from: m */
    public String m1644m() {
        ArrayList arrayList = this.f2286a;
        StringBuilder sb4 = new StringBuilder();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (i13 != 0) {
                sb4.append('\n');
            }
            sb4.append(((C3205d) arrayList.get(i13)).f12559a);
        }
        return sb4.toString();
    }

    /* JADX INFO: renamed from: n */
    public int m1645n(long j7) {
        ArrayList arrayList = this.f2286a;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (j7 < ((C30096a) arrayList.get(i13)).f122819b) {
                return i13;
            }
        }
        return arrayList.size();
    }

    /* JADX INFO: renamed from: o */
    public ArrayList m1646o() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f2286a.iterator();
        while (it.hasNext()) {
            C0849y c0849y = ((C3205d) it.next()).f12560b;
            if (c0849y != null) {
                arrayList.add(c0849y);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    public ArrayList m1647p() {
        return this.f2286a;
    }

    /* JADX INFO: renamed from: q */
    public void m1648q(float f13) {
        this.f2286a.add(new C27448s(f13));
    }

    /* JADX INFO: renamed from: r */
    public void m1649r(float f13, float f14) {
        this.f2286a.add(new C27441l(f13, f14));
    }

    /* JADX INFO: renamed from: s */
    public void m1650s(float f13, float f14) {
        this.f2286a.add(new C27449t(f13, f14));
    }

    /* JADX INFO: renamed from: t */
    public void m1651t(float f13, float f14) {
        this.f2286a.add(new C27442m(f13, f14));
    }

    /* JADX INFO: renamed from: u */
    public void m1652u(float f13, float f14, float f15, float f16) {
        this.f2286a.add(new C27452w(f13, f14, f15, f16));
    }

    /* JADX INFO: renamed from: v */
    public void m1653v(float f13) {
        this.f2286a.add(new C27454y(f13));
    }

    public C0656u0(int i13) {
        switch (i13) {
            case 4:
                this.f2286a = new ArrayList();
                break;
            case 5:
                this.f2286a = new ArrayList(32);
                break;
            case 6:
            default:
                this.f2286a = new ArrayList();
                break;
            case 7:
                this.f2286a = new ArrayList();
                break;
        }
    }

    public C0656u0(EnumC0660w0 enumC0660w0) {
        this.f2286a = new ArrayList(1);
    }
}
