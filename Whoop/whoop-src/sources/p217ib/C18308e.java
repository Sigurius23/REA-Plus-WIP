package p217ib;

import java.util.ArrayList;
import java.util.List;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: ib.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C18308e extends AbstractC18314k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71274a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC18317n f71275b;

    public /* synthetic */ C18308e(AbstractC18317n abstractC18317n, int i13) {
        this.f71274a = i13;
        this.f71275b = abstractC18317n;
    }

    @Override // p217ib.AbstractC18314k
    /* JADX INFO: renamed from: a */
    public final void mo52710a(int i13, C18315l c18315l) {
        switch (this.f71274a) {
            case 0:
                C18310g c18310g = (C18310g) this.f71275b;
                C18321r c18321r = c18310g.f71313z;
                c18315l.getClass();
                boolean z4 = c18315l == C18315l.f71294e;
                int i14 = c18315l.f71298d;
                int i15 = c18315l.f71296b;
                if (z4) {
                    c18310g.m52727d();
                    return;
                }
                if (c18310g.f71308I.get()) {
                    return;
                }
                List list = c18315l.f71295a;
                if (i13 == 0) {
                    c18321r.m52739f(i15, c18315l.f71297c, i14, list);
                    c18310g.m52730q(0, c18321r.size());
                    int i16 = c18321r.f71322w;
                    if (c18310g.f71304E == -1) {
                        c18310g.f71304E = (list.size() / 2) + i15 + i14;
                        return;
                    }
                    return;
                }
                c18321r.getClass();
                if (i13 == 1) {
                    ArrayList arrayList = c18321r.f71323x;
                    int size = list.size();
                    if (size == 0) {
                        c18310g.f71282N = 2;
                        return;
                    }
                    if (c18321r.f71319F > 0) {
                        int size2 = ((List) AbstractC25012a.m73371d(arrayList, 1)).size();
                        int i17 = c18321r.f71319F;
                        if (size2 != i17 || size > i17) {
                            c18321r.f71319F = -1;
                        }
                    }
                    arrayList.add(list);
                    c18321r.f71318E += size;
                    int iMin = Math.min(c18321r.f71324y, size);
                    int i18 = size - iMin;
                    if (iMin != 0) {
                        c18321r.f71324y -= iMin;
                    }
                    c18321r.f71321H += size;
                    int i19 = (c18321r.f71322w + c18321r.f71318E) - size;
                    int i24 = (c18310g.f71284P - iMin) - i18;
                    c18310g.f71284P = i24;
                    c18310g.f71282N = 0;
                    if (i24 > 0) {
                        c18310g.m52712t();
                    }
                    c18310g.m52729p(i19, iMin);
                    c18310g.m52730q(i19 + iMin, i18);
                    return;
                }
                if (i13 != 2) {
                    throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "unexpected resultType "));
                }
                ArrayList arrayList2 = c18321r.f71323x;
                int size3 = list.size();
                if (size3 == 0) {
                    c18310g.f71281M = 2;
                    return;
                }
                int i25 = c18321r.f71319F;
                if (i25 > 0 && size3 != i25) {
                    if (arrayList2.size() != 1 || size3 <= c18321r.f71319F) {
                        c18321r.f71319F = -1;
                    } else {
                        c18321r.f71319F = size3;
                    }
                }
                arrayList2.add(0, list);
                c18321r.f71318E += size3;
                int iMin2 = Math.min(c18321r.f71322w, size3);
                int i26 = size3 - iMin2;
                if (iMin2 != 0) {
                    c18321r.f71322w -= iMin2;
                }
                c18321r.f71325z -= i26;
                c18321r.f71320G += size3;
                int i27 = c18321r.f71322w;
                int i28 = (c18310g.f71283O - iMin2) - i26;
                c18310g.f71283O = i28;
                c18310g.f71281M = 0;
                if (i28 > 0) {
                    c18310g.m52713u();
                }
                c18310g.m52729p(i27, iMin2);
                c18310g.m52730q(0, i26);
                c18310g.f71304E += i26;
                c18310g.f71306G += i26;
                c18310g.f71307H += i26;
                return;
            default:
                C18306c0 c18306c0 = (C18306c0) this.f71275b;
                C18316m c18316m = c18306c0.f71312y;
                C18321r c18321r2 = c18306c0.f71313z;
                c18315l.getClass();
                boolean z13 = c18315l == C18315l.f71294e;
                int i29 = c18315l.f71298d;
                if (z13) {
                    c18306c0.m52727d();
                    return;
                }
                if (c18306c0.f71308I.get()) {
                    return;
                }
                if (i13 != 0 && i13 != 3) {
                    throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "unexpected resultType"));
                }
                List list2 = c18315l.f71295a;
                if (c18321r2.f71323x.size() != 0) {
                    c18316m.getClass();
                    ArrayList arrayList3 = c18321r2.f71323x;
                    c18321r2.m52740g(i29, list2, c18306c0);
                    return;
                }
                int i34 = c18315l.f71296b;
                int i35 = c18315l.f71297c;
                int i36 = c18316m.f71299a;
                c18321r2.getClass();
                int size4 = ((i36 - 1) + list2.size()) / i36;
                int i37 = 0;
                while (i37 < size4) {
                    int i38 = i37 * i36;
                    int i39 = i37 + 1;
                    List listSubList = list2.subList(i38, Math.min(list2.size(), i39 * i36));
                    if (i37 == 0) {
                        c18321r2.m52739f(i34, (list2.size() + i35) - listSubList.size(), i29, listSubList);
                    } else {
                        c18321r2.m52740g(i38 + i34, listSubList, null);
                    }
                    i37 = i39;
                }
                c18306c0.m52730q(0, c18321r2.size());
                return;
        }
    }
}
