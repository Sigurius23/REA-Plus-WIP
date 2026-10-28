package p217ib;

import java.util.ArrayList;
import p044c5.RunnableC4209a;
import p489t.C33242a;

/* JADX INFO: renamed from: ib.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18306c0 extends AbstractC18317n implements InterfaceC18320q {

    /* JADX INFO: renamed from: L */
    public final AbstractC18302a0 f71272L;

    /* JADX INFO: renamed from: M */
    public final C18308e f71273M;

    public C18306c0(AbstractC18302a0 abstractC18302a0, C18316m c18316m, int i13) {
        super(new C18321r(), C33242a.f138637c, C33242a.f138638d, c18316m);
        C18308e c18308e = new C18308e(this, 1);
        this.f71273M = c18308e;
        this.f71272L = abstractC18302a0;
        int i14 = this.f71312y.f71299a;
        this.f71304E = i13;
        if (abstractC18302a0.mo52720c()) {
            m52727d();
        } else {
            int iMax = Math.max(this.f71312y.f71302d / i14, 2) * i14;
            abstractC18302a0.m52697g(true, Math.max(0, ((i13 - (iMax / 2)) / i14) * i14), iMax, i14, this.f71310w, c18308e);
        }
    }

    @Override // p217ib.AbstractC18317n
    /* JADX INFO: renamed from: e */
    public final void mo52702e(AbstractC18317n abstractC18317n, C18301a c18301a) {
        C18321r c18321r = abstractC18317n.f71313z;
        if (!c18321r.isEmpty()) {
            C18321r c18321r2 = this.f71313z;
            int size = c18321r2.size();
            ArrayList arrayList = c18321r2.f71323x;
            if (size == c18321r.size()) {
                int i13 = this.f71312y.f71299a;
                int i14 = c18321r2.f71322w / i13;
                int size2 = arrayList.size();
                int i15 = 0;
                while (i15 < size2) {
                    int i16 = i15 + i14;
                    int i17 = 0;
                    while (i17 < arrayList.size()) {
                        int i18 = i16 + i17;
                        if (!c18321r2.m52738e(i13, i18) || c18321r.m52738e(i13, i18)) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                    if (i17 > 0) {
                        c18301a.f71260a.f71264a.mo2216c(i16 * i13, i13 * i17, null);
                        i15 += i17 - 1;
                    }
                    i15++;
                }
                return;
            }
        }
        throw new IllegalArgumentException("Invalid snapshot provided - doesn't appear to be a snapshot of this PagedList");
    }

    @Override // p217ib.AbstractC18317n
    /* JADX INFO: renamed from: f */
    public final AbstractC18313j mo52703f() {
        return this.f71272L;
    }

    @Override // p217ib.AbstractC18317n
    /* JADX INFO: renamed from: g */
    public final Object mo52704g() {
        return Integer.valueOf(this.f71304E);
    }

    @Override // p217ib.AbstractC18317n
    /* JADX INFO: renamed from: j */
    public final boolean mo52705j() {
        return false;
    }

    @Override // p217ib.AbstractC18317n
    /* JADX INFO: renamed from: o */
    public final void mo52708o(int i13) {
        C18316m c18316m = this.f71312y;
        int i14 = c18316m.f71300b;
        int i15 = c18316m.f71299a;
        C18321r c18321r = this.f71313z;
        ArrayList arrayList = c18321r.f71323x;
        int i16 = c18321r.f71319F;
        if (i15 != i16) {
            if (i15 < i16) {
                throw new IllegalArgumentException("Page size cannot be reduced");
            }
            if (arrayList.size() != 1 || c18321r.f71324y != 0) {
                throw new IllegalArgumentException("Page size can change only if last page is only one present");
            }
            c18321r.f71319F = i15;
        }
        int size = c18321r.size();
        int i17 = c18321r.f71319F;
        int i18 = ((size + i17) - 1) / i17;
        int iMax = Math.max((i13 - i14) / i17, 0);
        int iMin = Math.min((i13 + i14) / c18321r.f71319F, i18 - 1);
        c18321r.m52735a(iMax, iMin);
        int i19 = c18321r.f71322w / c18321r.f71319F;
        while (iMax <= iMin) {
            int i24 = iMax - i19;
            if (arrayList.get(i24) == null) {
                arrayList.set(i24, C18321r.f71317I);
                this.f71311x.execute(new RunnableC4209a(this, iMax, 3));
            }
            iMax++;
        }
    }
}
