package p217ib;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: ib.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C18321r extends AbstractList {

    /* JADX INFO: renamed from: I */
    public static final ArrayList f71317I = new ArrayList();

    /* JADX INFO: renamed from: E */
    public int f71318E;

    /* JADX INFO: renamed from: F */
    public int f71319F;

    /* JADX INFO: renamed from: G */
    public int f71320G;

    /* JADX INFO: renamed from: H */
    public int f71321H;

    /* JADX INFO: renamed from: w */
    public int f71322w;

    /* JADX INFO: renamed from: x */
    public final ArrayList f71323x;

    /* JADX INFO: renamed from: y */
    public int f71324y;

    /* JADX INFO: renamed from: z */
    public int f71325z;

    public C18321r() {
        this.f71322w = 0;
        this.f71323x = new ArrayList();
        this.f71324y = 0;
        this.f71325z = 0;
        this.f71318E = 0;
        this.f71319F = 1;
        this.f71320G = 0;
        this.f71321H = 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m52735a(int i13, int i14) {
        int i15;
        int i16 = this.f71322w / this.f71319F;
        ArrayList arrayList = this.f71323x;
        if (i13 < i16) {
            int i17 = 0;
            while (true) {
                i15 = i16 - i13;
                if (i17 >= i15) {
                    break;
                }
                arrayList.add(0, null);
                i17++;
            }
            int i18 = i15 * this.f71319F;
            this.f71318E += i18;
            this.f71322w -= i18;
        } else {
            i13 = i16;
        }
        if (i14 >= arrayList.size() + i13) {
            int iMin = Math.min(this.f71324y, ((i14 + 1) - (arrayList.size() + i13)) * this.f71319F);
            for (int size = arrayList.size(); size <= i14 - i13; size++) {
                arrayList.add(arrayList.size(), null);
            }
            this.f71318E += iMin;
            this.f71324y -= iMin;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m52736c() {
        int i13 = this.f71322w;
        ArrayList arrayList = this.f71323x;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            List list = (List) arrayList.get(i14);
            if (list != null && list != f71317I) {
                break;
            }
            i13 += this.f71319F;
        }
        return i13;
    }

    /* JADX INFO: renamed from: d */
    public final int m52737d() {
        int i13 = this.f71324y;
        ArrayList arrayList = this.f71323x;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            List list = (List) arrayList.get(size);
            if (list != null && list != f71317I) {
                break;
            }
            i13 += this.f71319F;
        }
        return i13;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m52738e(int i13, int i14) {
        List list;
        int i15 = this.f71322w / i13;
        if (i14 < i15) {
            return false;
        }
        ArrayList arrayList = this.f71323x;
        return (i14 >= arrayList.size() + i15 || (list = (List) arrayList.get(i14 - i15)) == null || list == f71317I) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public final void m52739f(int i13, int i14, int i15, List list) {
        this.f71322w = i13;
        ArrayList arrayList = this.f71323x;
        arrayList.clear();
        arrayList.add(list);
        this.f71324y = i14;
        this.f71325z = i15;
        this.f71318E = list.size();
        this.f71319F = list.size();
        this.f71320G = 0;
        this.f71321H = 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m52740g(int i13, List list, InterfaceC18320q interfaceC18320q) {
        int size = list.size();
        int i14 = this.f71319F;
        ArrayList arrayList = this.f71323x;
        if (size != i14) {
            int size2 = size();
            int i15 = this.f71319F;
            boolean z4 = false;
            boolean z13 = i13 == size2 - (size2 % i15) && size < i15;
            if (this.f71324y == 0 && arrayList.size() == 1 && size > this.f71319F) {
                z4 = true;
            }
            if (!z4 && !z13) {
                throw new IllegalArgumentException("page introduces incorrect tiling");
            }
            if (z4) {
                this.f71319F = size;
            }
        }
        int i16 = i13 / this.f71319F;
        m52735a(i16, i16);
        int i17 = i16 - (this.f71322w / this.f71319F);
        List list2 = (List) arrayList.get(i17);
        if (list2 != null && list2 != f71317I) {
            throw new IllegalArgumentException(AbstractC2875y.m8296i(i13, "Invalid position ", ": data already loaded"));
        }
        arrayList.set(i17, list);
        if (interfaceC18320q != null) {
            interfaceC18320q.mo52711a(i13, size);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        int i14;
        if (i13 < 0 || i13 >= size()) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Index: ", ", Size: ");
            sbM30466t.append(size());
            throw new IndexOutOfBoundsException(sbM30466t.toString());
        }
        int i15 = i13 - this.f71322w;
        if (i15 >= 0 && i15 < this.f71318E) {
            int i16 = this.f71319F;
            ArrayList arrayList = this.f71323x;
            if (i16 > 0) {
                i14 = i15 / i16;
                i15 %= i16;
            } else {
                int size = arrayList.size();
                i14 = 0;
                while (i14 < size) {
                    int size2 = ((List) arrayList.get(i14)).size();
                    if (size2 > i15) {
                        break;
                    }
                    i15 -= size2;
                    i14++;
                }
            }
            List list = (List) arrayList.get(i14);
            if (list != null && list.size() != 0) {
                return list.get(i15);
            }
        }
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f71322w + this.f71318E + this.f71324y;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb4 = new StringBuilder("leading " + this.f71322w + ", storage " + this.f71318E + ", trailing " + this.f71324y);
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f71323x;
            if (i13 >= arrayList.size()) {
                return sb4.toString();
            }
            sb4.append(" ");
            sb4.append(arrayList.get(i13));
            i13++;
        }
    }

    public C18321r(C18321r c18321r) {
        this.f71322w = c18321r.f71322w;
        this.f71323x = new ArrayList(c18321r.f71323x);
        this.f71324y = c18321r.f71324y;
        this.f71325z = c18321r.f71325z;
        this.f71318E = c18321r.f71318E;
        this.f71319F = c18321r.f71319F;
        this.f71320G = c18321r.f71320G;
        this.f71321H = c18321r.f71321H;
    }
}
