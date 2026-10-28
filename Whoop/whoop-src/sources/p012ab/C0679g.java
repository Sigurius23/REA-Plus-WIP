package p012ab;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p309lo.AbstractC24543a;
import p516u8.AbstractC34587d0;
import p516u8.C34608o;
import p516u8.C34610p;
import p607x8.AbstractC38047b;
import p607x8.C38059n;
import p621xn.InterfaceC38468e;
import qa.InterfaceC30100e;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: ab.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C0679g implements InterfaceC38468e, InterfaceC30100e {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f2410w;

    /* JADX INFO: renamed from: x */
    public final List f2411x;

    public /* synthetic */ C0679g(List list, int i13) {
        this.f2410w = i13;
        this.f2411x = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX INFO: renamed from: a */
    public List m1672a(C0682h0 c0682h0) {
        String str;
        int i13;
        List listSingletonList;
        C38059n c38059n = new C38059n((byte[]) c0682h0.f2434z);
        ArrayList arrayList = this.f2411x;
        while (c38059n.m121848a() > 0) {
            int iM121867t = c38059n.m121867t();
            int iM121867t2 = c38059n.f163018b + c38059n.m121867t();
            if (iM121867t == 134) {
                arrayList = new ArrayList();
                int iM121867t3 = c38059n.m121867t() & 31;
                for (int i14 = 0; i14 < iM121867t3; i14++) {
                    String strM121865r = c38059n.m121865r(3, StandardCharsets.UTF_8);
                    int iM121867t4 = c38059n.m121867t();
                    boolean z4 = (iM121867t4 & 128) != 0;
                    if (z4) {
                        i13 = iM121867t4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i13 = 1;
                    }
                    byte bM121867t = (byte) c38059n.m121867t();
                    c38059n.m121847G(1);
                    if (z4) {
                        boolean z13 = (bM121867t & 64) != 0;
                        byte[] bArr = AbstractC38047b.f162977a;
                        listSingletonList = Collections.singletonList(z13 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    C34608o c34608o = new C34608o();
                    c34608o.f145741m = AbstractC34587d0.m109382o(str);
                    c34608o.f145732d = strM121865r;
                    c34608o.f145724H = i13;
                    c34608o.f145744p = listSingletonList;
                    arrayList.add(new C34610p(c34608o));
                }
            }
            c38059n.m121846F(iM121867t2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // p621xn.InterfaceC38468e, qa.InterfaceC30100e
    /* JADX INFO: renamed from: b */
    public int mo1673b(long j7) {
        switch (this.f2410w) {
            case 1:
                return -1;
            case 2:
            default:
                return -1;
            case 3:
                return j7 < 0 ? 0 : -1;
            case 4:
                return j7 < 0 ? 0 : -1;
            case 5:
                return j7 < 0 ? 0 : -1;
        }
    }

    @Override // p621xn.InterfaceC38468e, qa.InterfaceC30100e
    /* JADX INFO: renamed from: d */
    public List mo1674d(long j7) {
        switch (this.f2410w) {
            case 1:
                return this.f2411x;
            case 2:
            default:
                return this.f2411x;
            case 3:
                return j7 >= 0 ? this.f2411x : Collections.EMPTY_LIST;
            case 4:
                return j7 >= 0 ? this.f2411x : Collections.EMPTY_LIST;
            case 5:
                return j7 >= 0 ? this.f2411x : Collections.EMPTY_LIST;
        }
    }

    @Override // p621xn.InterfaceC38468e, qa.InterfaceC30100e
    /* JADX INFO: renamed from: h */
    public long mo1675h(int i13) {
        switch (this.f2410w) {
            case 3:
                AbstractC24543a.m71569e(i13 == 0);
                break;
            case 4:
                AbstractC35849g.m113802d(i13 == 0);
                break;
            case 5:
                AbstractC24543a.m71569e(i13 == 0);
                break;
        }
        return 0L;
    }

    @Override // p621xn.InterfaceC38468e, qa.InterfaceC30100e
    /* JADX INFO: renamed from: j */
    public int mo1676j() {
        switch (this.f2410w) {
        }
        return 1;
    }

    public C0679g(ArrayList arrayList) {
        this.f2410w = 3;
        this.f2411x = Collections.unmodifiableList(arrayList);
    }
}
