package sn;

import com.google.android.exoplayer2.source.ClippingMediaSource$IllegalClippingException;
import java.util.ArrayList;
import p284ko.C22631o;
import p284ko.InterfaceC22625j0;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p465rm.AbstractC31558o1;
import p465rm.C31545k0;
import p465rm.C31555n1;

/* JADX INFO: renamed from: sn.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C32729e extends AbstractC32735h {

    /* JADX INFO: renamed from: k */
    public final AbstractC32721a f136053k;

    /* JADX INFO: renamed from: l */
    public final long f136054l;

    /* JADX INFO: renamed from: m */
    public final long f136055m;

    /* JADX INFO: renamed from: n */
    public final boolean f136056n;

    /* JADX INFO: renamed from: o */
    public final boolean f136057o;

    /* JADX INFO: renamed from: p */
    public final boolean f136058p;

    /* JADX INFO: renamed from: q */
    public final ArrayList f136059q;

    /* JADX INFO: renamed from: r */
    public final C31555n1 f136060r;

    /* JADX INFO: renamed from: s */
    public C32727d f136061s;

    /* JADX INFO: renamed from: t */
    public ClippingMediaSource$IllegalClippingException f136062t;

    /* JADX INFO: renamed from: u */
    public long f136063u;

    /* JADX INFO: renamed from: v */
    public long f136064v;

    public C32729e(AbstractC32721a abstractC32721a, long j7, long j13, boolean z4, boolean z13, boolean z14) {
        AbstractC24543a.m71569e(j7 >= 0);
        abstractC32721a.getClass();
        this.f136053k = abstractC32721a;
        this.f136054l = j7;
        this.f136055m = j13;
        this.f136056n = z4;
        this.f136057o = z13;
        this.f136058p = z14;
        this.f136059q = new ArrayList();
        this.f136060r = new C31555n1();
    }

    @Override // sn.AbstractC32721a
    /* JADX INFO: renamed from: a */
    public final InterfaceC32757s mo102684a(C32763v c32763v, C22631o c22631o, long j7) {
        C32725c c32725c = new C32725c(this.f136053k.mo102684a(c32763v, c22631o, j7), this.f136056n, this.f136063u, this.f136064v);
        this.f136059q.add(c32725c);
        return c32725c;
    }

    @Override // sn.AbstractC32721a
    /* JADX INFO: renamed from: f */
    public final C31545k0 mo102689f() {
        return this.f136053k.mo102689f();
    }

    @Override // sn.AbstractC32735h, sn.AbstractC32721a
    /* JADX INFO: renamed from: g */
    public final void mo102690g() throws ClippingMediaSource$IllegalClippingException {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.f136062t;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        super.mo102690g();
    }

    @Override // sn.AbstractC32721a
    /* JADX INFO: renamed from: i */
    public final void mo102692i(InterfaceC22625j0 interfaceC22625j0) {
        this.f136091j = interfaceC22625j0;
        this.f136090i = AbstractC24567y.m71680k(null);
        m102711r(null, this.f136053k);
    }

    @Override // sn.AbstractC32721a
    /* JADX INFO: renamed from: k */
    public final void mo102694k(InterfaceC32757s interfaceC32757s) {
        ArrayList arrayList = this.f136059q;
        AbstractC24543a.m71573i(arrayList.remove(interfaceC32757s));
        this.f136053k.mo102694k(((C32725c) interfaceC32757s).f136040w);
        if (!arrayList.isEmpty() || this.f136057o) {
            return;
        }
        C32727d c32727d = this.f136061s;
        c32727d.getClass();
        m102709s(c32727d.f136120x);
    }

    @Override // sn.AbstractC32735h, sn.AbstractC32721a
    /* JADX INFO: renamed from: m */
    public final void mo102696m() {
        super.mo102696m();
        this.f136062t = null;
        this.f136061s = null;
    }

    @Override // sn.AbstractC32735h
    /* JADX INFO: renamed from: q */
    public final void mo102708q(Object obj, AbstractC32721a abstractC32721a, AbstractC31558o1 abstractC31558o1) {
        if (this.f136062t != null) {
            return;
        }
        m102709s(abstractC31558o1);
    }

    /* JADX INFO: renamed from: s */
    public final void m102709s(AbstractC31558o1 abstractC31558o1) {
        long j7;
        long j13;
        long j14;
        C31555n1 c31555n1 = this.f136060r;
        abstractC31558o1.m97174n(0, c31555n1);
        long j15 = c31555n1.f130321Q;
        C32727d c32727d = this.f136061s;
        long j16 = this.f136055m;
        ArrayList arrayList = this.f136059q;
        if (c32727d == null || arrayList.isEmpty() || this.f136057o) {
            boolean z4 = this.f136058p;
            j7 = this.f136054l;
            if (z4) {
                long j17 = c31555n1.f130317M;
                j7 += j17;
                j13 = j17 + j16;
            } else {
                j13 = j16;
            }
            this.f136063u = j15 + j7;
            this.f136064v = j16 != Long.MIN_VALUE ? j15 + j13 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                C32725c c32725c = (C32725c) arrayList.get(i13);
                long j18 = this.f136063u;
                long j19 = this.f136064v;
                c32725c.f136037E = j18;
                c32725c.f136038F = j19;
            }
            j14 = j13;
        } else {
            j7 = this.f136063u - j15;
            j14 = j16 != Long.MIN_VALUE ? this.f136064v - j15 : Long.MIN_VALUE;
        }
        try {
            C32727d c32727d2 = new C32727d(abstractC31558o1, j7, j14);
            this.f136061s = c32727d2;
            m102693j(c32727d2);
        } catch (ClippingMediaSource$IllegalClippingException e5) {
            this.f136062t = e5;
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                ((C32725c) arrayList.get(i14)).f136039G = this.f136062t;
            }
        }
    }
}
