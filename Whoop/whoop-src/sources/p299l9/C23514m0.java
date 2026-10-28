package p299l9;

import androidx.media3.exoplayer.source.MergingMediaSource$IllegalMergeException;
import g73.C15553a;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p141f9.C14278t;
import p284ko.C22631o;
import p499t9.C33650s;
import p516u8.AbstractC34609o0;
import p516u8.C34581a0;
import p516u8.C34616s;
import p516u8.C34618t;
import p516u8.C34622v;
import p516u8.C34626x;
import p607x8.AbstractC38065t;
import p674z8.InterfaceC40178n;
import p690zr.AbstractC41023g0;
import p690zr.AbstractC41047q;
import p690zr.C41017e0;
import p690zr.C41050r0;
import p690zr.C41052s0;
import p690zr.C41055u;
import p690zr.C41060w0;

/* JADX INFO: renamed from: l9.m0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23514m0 extends AbstractC23507j {

    /* JADX INFO: renamed from: s */
    public static final C34626x f93064s;

    /* JADX INFO: renamed from: k */
    public final AbstractC23481a[] f93065k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f93066l;

    /* JADX INFO: renamed from: m */
    public final AbstractC34609o0[] f93067m;

    /* JADX INFO: renamed from: n */
    public final ArrayList f93068n;

    /* JADX INFO: renamed from: o */
    public final C15553a f93069o;

    /* JADX INFO: renamed from: p */
    public int f93070p;

    /* JADX INFO: renamed from: q */
    public long[][] f93071q;

    /* JADX INFO: renamed from: r */
    public MergingMediaSource$IllegalMergeException f93072r;

    static {
        C33650s c33650s = new C33650s();
        C41017e0 c41017e0 = AbstractC41023g0.f176998x;
        C41060w0 c41060w0 = C41060w0.f177067E;
        List list = Collections.EMPTY_LIST;
        C41060w0 c41060w1 = C41060w0.f177067E;
        C14278t c14278t = new C14278t();
        f93064s = new C34626x("MergingMediaSource", new C34616s(c33650s), null, new C34618t(c14278t), C34581a0.f145608B, C34622v.f145862a);
    }

    public C23514m0(AbstractC23481a... abstractC23481aArr) {
        C15553a c15553a = new C15553a(19);
        this.f93065k = abstractC23481aArr;
        this.f93069o = c15553a;
        this.f93068n = new ArrayList(Arrays.asList(abstractC23481aArr));
        this.f93070p = -1;
        this.f93066l = new ArrayList(abstractC23481aArr.length);
        for (int i13 = 0; i13 < abstractC23481aArr.length; i13++) {
            this.f93066l.add(new ArrayList());
        }
        this.f93067m = new AbstractC34609o0[abstractC23481aArr.length];
        this.f93071q = new long[0][];
        new HashMap();
        AbstractC41047q.m133273c(8, "expectedKeys");
        AbstractC41047q.m133273c(2, "expectedValuesPerKey");
        new C41052s0(C41055u.m133296a(8)).f177048F = new C41050r0();
    }

    @Override // p299l9.AbstractC23481a
    /* JADX INFO: renamed from: a */
    public final InterfaceC23482a0 mo36144a(C23488c0 c23488c0, C22631o c22631o, long j7) {
        AbstractC23481a[] abstractC23481aArr = this.f93065k;
        int length = abstractC23481aArr.length;
        InterfaceC23482a0[] interfaceC23482a0Arr = new InterfaceC23482a0[length];
        AbstractC34609o0[] abstractC34609o0Arr = this.f93067m;
        int iMo8132b = abstractC34609o0Arr[0].mo8132b(c23488c0.f92976a);
        for (int i13 = 0; i13 < length; i13++) {
            C23488c0 c23488c0M68053a = c23488c0.m68053a(abstractC34609o0Arr[i13].mo8138l(iMo8132b));
            interfaceC23482a0Arr[i13] = abstractC23481aArr[i13].mo36144a(c23488c0M68053a, c22631o, j7 - this.f93071q[iMo8132b][i13]);
            ((List) this.f93066l.get(i13)).add(new C23512l0(c23488c0M68053a, interfaceC23482a0Arr[i13]));
        }
        return new C23510k0(this.f93069o, this.f93071q[iMo8132b], interfaceC23482a0Arr);
    }

    @Override // p299l9.AbstractC23481a
    /* JADX INFO: renamed from: g */
    public final C34626x mo36145g() {
        AbstractC23481a[] abstractC23481aArr = this.f93065k;
        return abstractC23481aArr.length > 0 ? abstractC23481aArr[0].mo36145g() : f93064s;
    }

    @Override // p299l9.AbstractC23507j, p299l9.AbstractC23481a
    /* JADX INFO: renamed from: i */
    public final void mo36146i() throws MergingMediaSource$IllegalMergeException {
        MergingMediaSource$IllegalMergeException mergingMediaSource$IllegalMergeException = this.f93072r;
        if (mergingMediaSource$IllegalMergeException != null) {
            throw mergingMediaSource$IllegalMergeException;
        }
        super.mo36146i();
    }

    @Override // p299l9.AbstractC23481a
    /* JADX INFO: renamed from: k */
    public final void mo36147k(InterfaceC40178n interfaceC40178n) {
        this.f93042j = interfaceC40178n;
        this.f93041i = AbstractC38065t.m121920m(null);
        int i13 = 0;
        while (true) {
            AbstractC23481a[] abstractC23481aArr = this.f93065k;
            if (i13 >= abstractC23481aArr.length) {
                return;
            }
            m68068w(Integer.valueOf(i13), abstractC23481aArr[i13]);
            i13++;
        }
    }

    @Override // p299l9.AbstractC23481a
    /* JADX INFO: renamed from: m */
    public final void mo36148m(InterfaceC23482a0 interfaceC23482a0) {
        C23510k0 c23510k0 = (C23510k0) interfaceC23482a0;
        int i13 = 0;
        while (true) {
            AbstractC23481a[] abstractC23481aArr = this.f93065k;
            if (i13 >= abstractC23481aArr.length) {
                return;
            }
            List list = (List) this.f93066l.get(i13);
            for (int i14 = 0; i14 < list.size(); i14++) {
                if (((C23512l0) list.get(i14)).f93060b.equals(interfaceC23482a0)) {
                    list.remove(i14);
                    break;
                }
            }
            AbstractC23481a abstractC23481a = abstractC23481aArr[i13];
            InterfaceC23482a0[] interfaceC23482a0Arr = c23510k0.f93053w;
            abstractC23481a.mo36148m(c23510k0.f93054x[i13] ? ((C23498f1) interfaceC23482a0Arr[i13]).f93016w : interfaceC23482a0Arr[i13]);
            i13++;
        }
    }

    @Override // p299l9.AbstractC23507j, p299l9.AbstractC23481a
    /* JADX INFO: renamed from: o */
    public final void mo36149o() {
        super.mo36149o();
        Arrays.fill(this.f93067m, (Object) null);
        this.f93070p = -1;
        this.f93072r = null;
        ArrayList arrayList = this.f93068n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f93065k);
    }

    @Override // p299l9.AbstractC23481a
    /* JADX INFO: renamed from: r */
    public final void mo36150r(C34626x c34626x) {
        this.f93065k[0].mo36150r(c34626x);
    }

    @Override // p299l9.AbstractC23507j
    /* JADX INFO: renamed from: s */
    public final C23488c0 mo68062s(Object obj, C23488c0 c23488c0) {
        int iIntValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f93066l;
        List list = (List) arrayList.get(iIntValue);
        for (int i13 = 0; i13 < list.size(); i13++) {
            if (((C23512l0) list.get(i13)).f93059a.equals(c23488c0)) {
                return ((C23512l0) ((List) arrayList.get(0)).get(i13)).f93059a;
            }
        }
        return null;
    }

    @Override // p299l9.AbstractC23507j
    /* JADX INFO: renamed from: v */
    public final void mo68065v(Object obj, AbstractC23481a abstractC23481a, AbstractC34609o0 abstractC34609o0) {
        Integer num = (Integer) obj;
        if (this.f93072r != null) {
            return;
        }
        if (this.f93070p == -1) {
            this.f93070p = abstractC34609o0.mo8136h();
        } else if (abstractC34609o0.mo8136h() != this.f93070p) {
            this.f93072r = new MergingMediaSource$IllegalMergeException();
            return;
        }
        int length = this.f93071q.length;
        AbstractC34609o0[] abstractC34609o0Arr = this.f93067m;
        if (length == 0) {
            this.f93071q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f93070p, abstractC34609o0Arr.length);
        }
        ArrayList arrayList = this.f93068n;
        arrayList.remove(abstractC23481a);
        abstractC34609o0Arr[num.intValue()] = abstractC34609o0;
        if (arrayList.isEmpty()) {
            m68048l(abstractC34609o0Arr[0]);
        }
    }
}
