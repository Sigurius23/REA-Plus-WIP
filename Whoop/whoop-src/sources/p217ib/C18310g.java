package p217ib;

import java.util.List;
import java.util.concurrent.Executor;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p489t.C33242a;

/* JADX INFO: renamed from: ib.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C18310g extends AbstractC18317n implements InterfaceC18320q {

    /* JADX INFO: renamed from: L */
    public final AbstractC18307d f71280L;

    /* JADX INFO: renamed from: M */
    public int f71281M;

    /* JADX INFO: renamed from: N */
    public int f71282N;

    /* JADX INFO: renamed from: O */
    public int f71283O;

    /* JADX INFO: renamed from: P */
    public int f71284P;

    /* JADX INFO: renamed from: Q */
    public final C18308e f71285Q;

    public C18310g(AbstractC18307d abstractC18307d, C18316m c18316m, Object obj, int i13) {
        Integer numValueOf;
        super(new C18321r(), C33242a.f138637c, C33242a.f138638d, c18316m);
        this.f71281M = 0;
        this.f71282N = 0;
        this.f71283O = 0;
        this.f71284P = 0;
        C18308e c18308e = new C18308e(this, 0);
        this.f71285Q = c18308e;
        this.f71280L = abstractC18307d;
        this.f71304E = i13;
        C18323t c18323t = (C18323t) abstractC18307d;
        if (c18323t.f71332c.mo52720c()) {
            m52727d();
        } else {
            C18316m c18316m2 = this.f71312y;
            int iMax = c18316m2.f71302d;
            int i14 = c18316m2.f71299a;
            Executor executor = this.f71310w;
            c18323t.getClass();
            Integer num = (Integer) obj;
            if (num == null) {
                numValueOf = 0;
            } else {
                iMax = Math.max(iMax / i14, 2) * i14;
                numValueOf = Integer.valueOf(Math.max(0, ((num.intValue() - (iMax / 2)) / i14) * i14));
            }
            c18323t.f71332c.m52697g(false, numValueOf.intValue(), iMax, i14, executor, c18308e);
        }
        abstractC18307d.getClass();
        this.f71312y.getClass();
    }

    @Override // p217ib.AbstractC18317n, p217ib.InterfaceC18320q
    /* JADX INFO: renamed from: a */
    public final void mo52711a(int i13, int i14) {
        throw new IllegalStateException("Tiled callback on ContiguousPagedList");
    }

    @Override // p217ib.AbstractC18317n
    /* JADX INFO: renamed from: e */
    public final void mo52702e(AbstractC18317n abstractC18317n, C18301a c18301a) {
        C18321r c18321r = abstractC18317n.f71313z;
        C18321r c18321r2 = this.f71313z;
        int i13 = c18321r2.f71321H - c18321r.f71321H;
        int i14 = c18321r2.f71320G - c18321r.f71320G;
        int i15 = c18321r.f71324y;
        int i16 = c18321r.f71322w;
        if (c18321r.isEmpty() || i13 < 0 || i14 < 0 || c18321r2.f71324y != Math.max(i15 - i13, 0) || c18321r2.f71322w != Math.max(i16 - i14, 0) || c18321r2.f71318E != c18321r.f71318E + i13 + i14) {
            throw new IllegalArgumentException("Invalid snapshot provided - doesn't appear to be a snapshot of this PagedList");
        }
        if (i13 != 0) {
            int iMin = Math.min(i15, i13);
            int i17 = i13 - iMin;
            int i18 = c18321r.f71322w + c18321r.f71318E;
            if (iMin != 0) {
                c18301a.f71260a.f71264a.mo2216c(i18, iMin, null);
            }
            if (i17 != 0) {
                c18301a.f71260a.f71264a.mo2214a(i18 + iMin, i17);
            }
        }
        if (i14 != 0) {
            int iMin2 = Math.min(i16, i14);
            int i19 = i14 - iMin2;
            if (iMin2 != 0) {
                c18301a.f71260a.f71264a.mo2216c(i16, iMin2, null);
            }
            if (i19 != 0) {
                c18301a.f71260a.f71264a.mo2214a(0, i19);
            }
        }
    }

    @Override // p217ib.AbstractC18317n
    /* JADX INFO: renamed from: f */
    public final AbstractC18313j mo52703f() {
        return this.f71280L;
    }

    @Override // p217ib.AbstractC18317n
    /* JADX INFO: renamed from: g */
    public final Object mo52704g() {
        int i13 = this.f71304E;
        ((C18323t) this.f71280L).getClass();
        return Integer.valueOf(i13);
    }

    @Override // p217ib.AbstractC18317n
    /* JADX INFO: renamed from: j */
    public final boolean mo52705j() {
        return true;
    }

    @Override // p217ib.AbstractC18317n
    /* JADX INFO: renamed from: o */
    public final void mo52708o(int i13) {
        int i14 = this.f71312y.f71300b;
        C18321r c18321r = this.f71313z;
        int i15 = c18321r.f71322w;
        int i16 = i14 - (i13 - i15);
        int i17 = ((i13 + i14) + 1) - (i15 + c18321r.f71318E);
        int iMax = Math.max(i16, this.f71283O);
        this.f71283O = iMax;
        if (iMax > 0) {
            m52713u();
        }
        int iMax2 = Math.max(i17, this.f71284P);
        this.f71284P = iMax2;
        if (iMax2 > 0) {
            m52712t();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m52712t() {
        if (this.f71282N != 0) {
            return;
        }
        this.f71282N = 1;
        C18321r c18321r = this.f71313z;
        this.f71311x.execute(new RunnableC18309f(this, ((c18321r.f71322w + c18321r.f71318E) - 1) + c18321r.f71325z, AbstractC11266d.m30455i(1, (List) AbstractC25012a.m73371d(c18321r.f71323x, 1)), 1));
    }

    /* JADX INFO: renamed from: u */
    public final void m52713u() {
        if (this.f71281M != 0) {
            return;
        }
        this.f71281M = 1;
        C18321r c18321r = this.f71313z;
        this.f71311x.execute(new RunnableC18309f(this, c18321r.f71322w + c18321r.f71325z, ((List) c18321r.f71323x.get(0)).get(0), 0));
    }
}
