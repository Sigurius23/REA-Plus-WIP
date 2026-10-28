package sn;

import com.google.android.exoplayer2.source.MergingMediaSource$IllegalMergeException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import ng3.C26701n;
import p284ko.C22631o;
import p284ko.InterfaceC22625j0;
import p309lo.AbstractC24567y;
import p465rm.AbstractC31558o1;
import p465rm.C31527e0;
import p465rm.C31533g0;
import p465rm.C31536h0;
import p465rm.C31545k0;
import p465rm.C31551m0;
import p690zr.AbstractC41023g0;
import p690zr.AbstractC41047q;
import p690zr.C41017e0;
import p690zr.C41050r0;
import p690zr.C41052s0;
import p690zr.C41055u;
import p690zr.C41060w0;

/* JADX INFO: renamed from: sn.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C32732f0 extends AbstractC32735h {

    /* JADX INFO: renamed from: r */
    public static final C31545k0 f136076r;

    /* JADX INFO: renamed from: k */
    public final AbstractC32721a[] f136077k;

    /* JADX INFO: renamed from: l */
    public final AbstractC31558o1[] f136078l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f136079m;

    /* JADX INFO: renamed from: n */
    public final C26701n f136080n;

    /* JADX INFO: renamed from: o */
    public int f136081o;

    /* JADX INFO: renamed from: p */
    public long[][] f136082p;

    /* JADX INFO: renamed from: q */
    public MergingMediaSource$IllegalMergeException f136083q;

    static {
        C31527e0 c31527e0 = new C31527e0();
        C41017e0 c41017e0 = AbstractC41023g0.f176998x;
        C41060w0 c41060w0 = C41060w0.f177067E;
        List list = Collections.EMPTY_LIST;
        C41060w0 c41060w1 = C41060w0.f177067E;
        f136076r = new C31545k0("MergingMediaSource", new C31533g0(c31527e0), null, new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C31551m0.f130246h0);
    }

    public C32732f0(AbstractC32721a... abstractC32721aArr) {
        C26701n c26701n = new C26701n(25);
        this.f136077k = abstractC32721aArr;
        this.f136080n = c26701n;
        this.f136079m = new ArrayList(Arrays.asList(abstractC32721aArr));
        this.f136081o = -1;
        this.f136078l = new AbstractC31558o1[abstractC32721aArr.length];
        this.f136082p = new long[0][];
        new HashMap();
        AbstractC41047q.m133273c(8, "expectedKeys");
        AbstractC41047q.m133273c(2, "expectedValuesPerKey");
        new C41052s0(C41055u.m133296a(8)).f177048F = new C41050r0();
    }

    @Override // sn.AbstractC32721a
    /* JADX INFO: renamed from: a */
    public final InterfaceC32757s mo102684a(C32763v c32763v, C22631o c22631o, long j7) {
        AbstractC32721a[] abstractC32721aArr = this.f136077k;
        int length = abstractC32721aArr.length;
        InterfaceC32757s[] interfaceC32757sArr = new InterfaceC32757s[length];
        AbstractC31558o1[] abstractC31558o1Arr = this.f136078l;
        int iMo97128b = abstractC31558o1Arr[0].mo97128b(c32763v.f136238a);
        for (int i13 = 0; i13 < length; i13++) {
            interfaceC32757sArr[i13] = abstractC32721aArr[i13].mo102684a(c32763v.m102755b(abstractC31558o1Arr[i13].mo97135l(iMo97128b)), c22631o, j7 - this.f136082p[iMo97128b][i13]);
        }
        return new C32730e0(this.f136080n, this.f136082p[iMo97128b], interfaceC32757sArr);
    }

    @Override // sn.AbstractC32721a
    /* JADX INFO: renamed from: f */
    public final C31545k0 mo102689f() {
        AbstractC32721a[] abstractC32721aArr = this.f136077k;
        return abstractC32721aArr.length > 0 ? abstractC32721aArr[0].mo102689f() : f136076r;
    }

    @Override // sn.AbstractC32735h, sn.AbstractC32721a
    /* JADX INFO: renamed from: g */
    public final void mo102690g() throws MergingMediaSource$IllegalMergeException {
        MergingMediaSource$IllegalMergeException mergingMediaSource$IllegalMergeException = this.f136083q;
        if (mergingMediaSource$IllegalMergeException != null) {
            throw mergingMediaSource$IllegalMergeException;
        }
        super.mo102690g();
    }

    @Override // sn.AbstractC32721a
    /* JADX INFO: renamed from: i */
    public final void mo102692i(InterfaceC22625j0 interfaceC22625j0) {
        this.f136091j = interfaceC22625j0;
        this.f136090i = AbstractC24567y.m71680k(null);
        int i13 = 0;
        while (true) {
            AbstractC32721a[] abstractC32721aArr = this.f136077k;
            if (i13 >= abstractC32721aArr.length) {
                return;
            }
            m102711r(Integer.valueOf(i13), abstractC32721aArr[i13]);
            i13++;
        }
    }

    @Override // sn.AbstractC32721a
    /* JADX INFO: renamed from: k */
    public final void mo102694k(InterfaceC32757s interfaceC32757s) {
        C32730e0 c32730e0 = (C32730e0) interfaceC32757s;
        int i13 = 0;
        while (true) {
            AbstractC32721a[] abstractC32721aArr = this.f136077k;
            if (i13 >= abstractC32721aArr.length) {
                return;
            }
            AbstractC32721a abstractC32721a = abstractC32721aArr[i13];
            InterfaceC32757s interfaceC32757s2 = c32730e0.f136070w[i13];
            if (interfaceC32757s2 instanceof C32726c0) {
                interfaceC32757s2 = ((C32726c0) interfaceC32757s2).f136044w;
            }
            abstractC32721a.mo102694k(interfaceC32757s2);
            i13++;
        }
    }

    @Override // sn.AbstractC32735h, sn.AbstractC32721a
    /* JADX INFO: renamed from: m */
    public final void mo102696m() {
        super.mo102696m();
        Arrays.fill(this.f136078l, (Object) null);
        this.f136081o = -1;
        this.f136083q = null;
        ArrayList arrayList = this.f136079m;
        arrayList.clear();
        Collections.addAll(arrayList, this.f136077k);
    }

    @Override // sn.AbstractC32735h
    /* JADX INFO: renamed from: p */
    public final C32763v mo102710p(Object obj, C32763v c32763v) {
        if (((Integer) obj).intValue() == 0) {
            return c32763v;
        }
        return null;
    }

    @Override // sn.AbstractC32735h
    /* JADX INFO: renamed from: q */
    public final void mo102708q(Object obj, AbstractC32721a abstractC32721a, AbstractC31558o1 abstractC31558o1) {
        Integer num = (Integer) obj;
        if (this.f136083q != null) {
            return;
        }
        if (this.f136081o == -1) {
            this.f136081o = abstractC31558o1.mo97133h();
        } else if (abstractC31558o1.mo97133h() != this.f136081o) {
            this.f136083q = new MergingMediaSource$IllegalMergeException();
            return;
        }
        int length = this.f136082p.length;
        AbstractC31558o1[] abstractC31558o1Arr = this.f136078l;
        if (length == 0) {
            this.f136082p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f136081o, abstractC31558o1Arr.length);
        }
        ArrayList arrayList = this.f136079m;
        arrayList.remove(abstractC32721a);
        abstractC31558o1Arr[num.intValue()] = abstractC31558o1;
        if (arrayList.isEmpty()) {
            m102693j(abstractC31558o1Arr[0]);
        }
    }
}
