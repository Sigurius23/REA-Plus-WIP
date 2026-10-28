package p199ho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p087db.C11858k0;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p318m3.C24977g;
import p576w8.C36931a;
import p576w8.C36932b;
import p607x8.AbstractC38065t;
import p621xn.C38464a;
import p621xn.C38465b;
import p621xn.InterfaceC38468e;
import qa.InterfaceC30100e;
import va3.AbstractC35849g;
import za.C40215c;

/* JADX INFO: renamed from: ho.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C17531l implements InterfaceC38468e, InterfaceC30100e {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f67809w;

    /* JADX INFO: renamed from: x */
    public final List f67810x;

    /* JADX INFO: renamed from: y */
    public final long[] f67811y;

    /* JADX INFO: renamed from: z */
    public final long[] f67812z;

    public C17531l(ArrayList arrayList, int i13) {
        this.f67809w = i13;
        switch (i13) {
            case 1:
                this.f67810x = Collections.unmodifiableList(new ArrayList(arrayList));
                this.f67811y = new long[arrayList.size() * 2];
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    C40215c c40215c = (C40215c) arrayList.get(i14);
                    int i15 = i14 * 2;
                    long[] jArr = this.f67811y;
                    jArr[i15] = c40215c.f173663b;
                    jArr[i15 + 1] = c40215c.f173664c;
                }
                long[] jArr2 = this.f67811y;
                long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
                this.f67812z = jArrCopyOf;
                Arrays.sort(jArrCopyOf);
                break;
            default:
                this.f67810x = Collections.unmodifiableList(new ArrayList(arrayList));
                this.f67811y = new long[arrayList.size() * 2];
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    C17523d c17523d = (C17523d) arrayList.get(i16);
                    int i17 = i16 * 2;
                    long[] jArr3 = this.f67811y;
                    jArr3[i17] = c17523d.f67780b;
                    jArr3[i17 + 1] = c17523d.f67781c;
                }
                long[] jArr4 = this.f67811y;
                long[] jArrCopyOf2 = Arrays.copyOf(jArr4, jArr4.length);
                this.f67812z = jArrCopyOf2;
                Arrays.sort(jArrCopyOf2);
                break;
        }
    }

    @Override // p621xn.InterfaceC38468e, qa.InterfaceC30100e
    /* JADX INFO: renamed from: b */
    public final int mo1673b(long j7) {
        switch (this.f67809w) {
            case 0:
                long[] jArr = this.f67812z;
                int iM71671b = AbstractC24567y.m71671b(jArr, j7, false);
                if (iM71671b < jArr.length) {
                    return iM71671b;
                }
                return -1;
            default:
                long[] jArr2 = this.f67812z;
                int iM121908a = AbstractC38065t.m121908a(jArr2, j7, false);
                if (iM121908a < jArr2.length) {
                    return iM121908a;
                }
                return -1;
        }
    }

    @Override // p621xn.InterfaceC38468e, qa.InterfaceC30100e
    /* JADX INFO: renamed from: d */
    public final List mo1674d(long j7) {
        switch (this.f67809w) {
            case 0:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i13 = 0;
                while (true) {
                    List list = this.f67810x;
                    if (i13 >= list.size()) {
                        Collections.sort(arrayList2, new C11858k0(6));
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            C38464a c38464aM123259a = ((C17523d) arrayList2.get(i14)).f67779a.m123259a();
                            c38464aM123259a.f164710e = (-1) - i14;
                            c38464aM123259a.f164711f = 1;
                            arrayList.add(c38464aM123259a.m123258a());
                        }
                        return arrayList;
                    }
                    int i15 = i13 * 2;
                    long[] jArr = this.f67811y;
                    if (jArr[i15] <= j7 && j7 < jArr[i15 + 1]) {
                        C17523d c17523d = (C17523d) list.get(i13);
                        C38465b c38465b = c17523d.f67779a;
                        if (c38465b.f164725E == -3.4028235E38f) {
                            arrayList2.add(c17523d);
                        } else {
                            arrayList.add(c38465b);
                        }
                    }
                    i13++;
                }
                break;
            default:
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i16 = 0;
                while (true) {
                    List list2 = this.f67810x;
                    if (i16 >= list2.size()) {
                        Collections.sort(arrayList4, new C24977g(21));
                        for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                            C36931a c36931aM118551a = ((C40215c) arrayList4.get(i17)).f173662a.m118551a();
                            c36931aM118551a.f158013e = (-1) - i17;
                            c36931aM118551a.f158014f = 1;
                            arrayList3.add(c36931aM118551a.m118550a());
                        }
                        return arrayList3;
                    }
                    int i18 = i16 * 2;
                    long[] jArr2 = this.f67811y;
                    if (jArr2[i18] <= j7 && j7 < jArr2[i18 + 1]) {
                        C40215c c40215c = (C40215c) list2.get(i16);
                        C36932b c36932b = c40215c.f173662a;
                        if (c36932b.f158049e == -3.4028235E38f) {
                            arrayList4.add(c40215c);
                        } else {
                            arrayList3.add(c36932b);
                        }
                    }
                    i16++;
                }
                break;
        }
    }

    @Override // p621xn.InterfaceC38468e, qa.InterfaceC30100e
    /* JADX INFO: renamed from: h */
    public final long mo1675h(int i13) {
        switch (this.f67809w) {
            case 0:
                AbstractC24543a.m71569e(i13 >= 0);
                long[] jArr = this.f67812z;
                AbstractC24543a.m71569e(i13 < jArr.length);
                return jArr[i13];
            default:
                AbstractC35849g.m113802d(i13 >= 0);
                long[] jArr2 = this.f67812z;
                AbstractC35849g.m113802d(i13 < jArr2.length);
                return jArr2[i13];
        }
    }

    @Override // p621xn.InterfaceC38468e, qa.InterfaceC30100e
    /* JADX INFO: renamed from: j */
    public final int mo1676j() {
        switch (this.f67809w) {
            case 0:
                break;
        }
        return this.f67812z.length;
    }
}
