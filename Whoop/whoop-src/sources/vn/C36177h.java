package vn;

import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import io.InterfaceC20035o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import no.nordicsemi.android.dfu.DfuBaseService;
import p112e9.C12872k;
import p284ko.C22630n;
import p284ko.InterfaceC22625j0;
import p284ko.InterfaceC22626k;
import p284ko.InterfaceC22628l;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p465rm.C31521c0;
import p508ty.C34249c;
import p528un.InterfaceC35092c;
import p550vd.AbstractC35903f;
import p589wn.C37395c;
import p589wn.C37397e;
import p589wn.C37399g;
import p589wn.C37402j;
import p690zr.AbstractC41023g0;
import p690zr.C41017e0;
import p690zr.C41060w0;
import sm.C32713f;
import sn.C32766w0;

/* JADX INFO: renamed from: vn.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C36177h {

    /* JADX INFO: renamed from: a */
    public final InterfaceC36178i f154763a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC22628l f154764b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC22628l f154765c;

    /* JADX INFO: renamed from: d */
    public final C34249c f154766d;

    /* JADX INFO: renamed from: e */
    public final Uri[] f154767e;

    /* JADX INFO: renamed from: f */
    public final C31521c0[] f154768f;

    /* JADX INFO: renamed from: g */
    public final C37395c f154769g;

    /* JADX INFO: renamed from: h */
    public final C32766w0 f154770h;

    /* JADX INFO: renamed from: i */
    public final List f154771i;

    /* JADX INFO: renamed from: k */
    public final C32713f f154773k;

    /* JADX INFO: renamed from: l */
    public boolean f154774l;

    /* JADX INFO: renamed from: n */
    public BehindLiveWindowException f154776n;

    /* JADX INFO: renamed from: o */
    public Uri f154777o;

    /* JADX INFO: renamed from: p */
    public boolean f154778p;

    /* JADX INFO: renamed from: q */
    public InterfaceC20035o f154779q;

    /* JADX INFO: renamed from: s */
    public boolean f154781s;

    /* JADX INFO: renamed from: j */
    public final C34249c f154772j = new C34249c(14);

    /* JADX INFO: renamed from: m */
    public byte[] f154775m = AbstractC24567y.f95880f;

    /* JADX INFO: renamed from: r */
    public long f154780r = -9223372036854775807L;

    public C36177h(InterfaceC36178i interfaceC36178i, C37395c c37395c, Uri[] uriArr, C31521c0[] c31521c0Arr, C34249c c34249c, InterfaceC22625j0 interfaceC22625j0, C34249c c34249c2, List list, C32713f c32713f) {
        this.f154763a = interfaceC36178i;
        this.f154769g = c37395c;
        this.f154767e = uriArr;
        this.f154768f = c31521c0Arr;
        this.f154766d = c34249c2;
        this.f154771i = list;
        this.f154773k = c32713f;
        InterfaceC22628l interfaceC22628lCreateDataSource = ((InterfaceC22626k) c34249c.f143660x).createDataSource();
        this.f154764b = interfaceC22628lCreateDataSource;
        if (interfaceC22625j0 != null) {
            interfaceC22628lCreateDataSource.mo65561y(interfaceC22625j0);
        }
        this.f154765c = ((InterfaceC22626k) c34249c.f143660x).createDataSource();
        this.f154770h = new C32766w0("", c31521c0Arr);
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        for (int i14 = 0; i14 < uriArr.length; i14++) {
            if ((c31521c0Arr[i14].f130070E & DfuBaseService.ERROR_CONNECTION_MASK) == 0) {
                arrayList.add(Integer.valueOf(i14));
            }
        }
        C32766w0 c32766w0 = this.f154770h;
        int[] iArrM113999S = AbstractC35903f.m113999S(arrayList);
        C36175f c36175f = new C36175f(c32766w0, iArrM113999S);
        C31521c0 c31521c0 = c32766w0.f136262y[iArrM113999S[0]];
        while (i13 < c36175f.f73630b) {
            if (c36175f.f73632d[i13] == c31521c0) {
                c36175f.f154758g = i13;
                this.f154779q = c36175f;
            }
            i13++;
        }
        i13 = -1;
        c36175f.f154758g = i13;
        this.f154779q = c36175f;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC35092c[] m115114a(C36179j c36179j, long j7) {
        List listUnmodifiableList;
        C36177h c36177h = this;
        C36179j c36179j2 = c36179j;
        int iM102757a = c36179j2 == null ? -1 : c36177h.f154770h.m102757a(c36179j2.f148916d);
        int length = c36177h.f154779q.length();
        InterfaceC35092c[] interfaceC35092cArr = new InterfaceC35092c[length];
        boolean z4 = false;
        int i13 = 0;
        while (i13 < length) {
            int iMo54500e = c36177h.f154779q.mo54500e(i13);
            Uri uri = c36177h.f154767e[iMo54500e];
            C37395c c37395c = c36177h.f154769g;
            if (c37395c.m119753d(uri)) {
                C37402j c37402jM119751a = c37395c.m119751a(z4, uri);
                c37402jM119751a.getClass();
                long j13 = c37402jM119751a.f160032h - c37395c.f160000N;
                Pair pairM115116c = c36177h.m115116c(c36179j2, iMo54500e != iM102757a ? true : z4, c37402jM119751a, j13, j7);
                long jLongValue = ((Long) pairM115116c.first).longValue();
                int iIntValue = ((Integer) pairM115116c.second).intValue();
                long j14 = c37402jM119751a.f160035k;
                AbstractC41023g0 abstractC41023g0 = c37402jM119751a.f160043s;
                AbstractC41023g0 abstractC41023g1 = c37402jM119751a.f160042r;
                int i14 = (int) (jLongValue - j14);
                if (i14 < 0 || abstractC41023g1.size() < i14) {
                    C41017e0 c41017e0 = AbstractC41023g0.f176998x;
                    listUnmodifiableList = C41060w0.f177067E;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i14 < abstractC41023g1.size()) {
                        if (iIntValue != -1) {
                            C37399g c37399g = (C37399g) abstractC41023g1.get(i14);
                            if (iIntValue == 0) {
                                arrayList.add(c37399g);
                            } else if (iIntValue < c37399g.f160011M.size()) {
                                AbstractC41023g0 abstractC41023g2 = c37399g.f160011M;
                                arrayList.addAll(abstractC41023g2.subList(iIntValue, abstractC41023g2.size()));
                            }
                            i14++;
                        }
                        arrayList.addAll(abstractC41023g1.subList(i14, abstractC41023g1.size()));
                        iIntValue = 0;
                    }
                    if (c37402jM119751a.f160038n != -9223372036854775807L) {
                        if (iIntValue == -1) {
                            iIntValue = 0;
                        }
                        if (iIntValue < abstractC41023g0.size()) {
                            arrayList.addAll(abstractC41023g0.subList(iIntValue, abstractC41023g0.size()));
                        }
                    }
                    listUnmodifiableList = Collections.unmodifiableList(arrayList);
                }
                interfaceC35092cArr[i13] = new C12872k(j13, listUnmodifiableList);
            } else {
                interfaceC35092cArr[i13] = InterfaceC35092c.f148923B;
            }
            i13++;
            c36177h = this;
            c36179j2 = c36179j;
            z4 = false;
        }
        return interfaceC35092cArr;
    }

    /* JADX INFO: renamed from: b */
    public final int m115115b(C36179j c36179j) {
        int i13 = c36179j.f154799o;
        if (i13 == -1) {
            return 1;
        }
        C37402j c37402jM119751a = this.f154769g.m119751a(false, this.f154767e[this.f154770h.m102757a(c36179j.f148916d)]);
        c37402jM119751a.getClass();
        AbstractC41023g0 abstractC41023g0 = c37402jM119751a.f160042r;
        int i14 = (int) (c36179j.f148922j - c37402jM119751a.f160035k);
        if (i14 < 0) {
            return 1;
        }
        AbstractC41023g0 abstractC41023g1 = i14 < abstractC41023g0.size() ? ((C37399g) abstractC41023g0.get(i14)).f160011M : c37402jM119751a.f160043s;
        if (i13 >= abstractC41023g1.size()) {
            return 2;
        }
        C37397e c37397e = (C37397e) abstractC41023g1.get(i13);
        if (c37397e.f160006M) {
            return 0;
        }
        return AbstractC24567y.m71670a(Uri.parse(AbstractC24543a.m71560B(c37402jM119751a.f160067a, c37397e.f160019w)), c36179j.f148914b.f89019a) ? 1 : 2;
    }

    /* JADX INFO: renamed from: c */
    public final Pair m115116c(C36179j c36179j, boolean z4, C37402j c37402j, long j7, long j13) {
        int i13;
        boolean z13 = true;
        if (c36179j != null) {
            long j14 = c36179j.f148922j;
            int i14 = c36179j.f154799o;
            if (!z4) {
                if (!c36179j.f154791H) {
                    return new Pair(Long.valueOf(j14), Integer.valueOf(i14));
                }
                if (i14 == -1) {
                    j14 = j14 != -1 ? j14 + 1 : -1L;
                }
                return new Pair(Long.valueOf(j14), Integer.valueOf(i14 != -1 ? i14 + 1 : -1));
            }
        }
        long j15 = c37402j.f160045u;
        AbstractC41023g0 abstractC41023g0 = c37402j.f160043s;
        long j16 = c37402j.f160035k;
        AbstractC41023g0 abstractC41023g1 = c37402j.f160042r;
        long j17 = j7 + j15;
        long j18 = (c36179j == null || this.f154778p) ? j13 : c36179j.f148919g;
        if (!c37402j.f160039o && j18 >= j17) {
            return new Pair(Long.valueOf(j16 + ((long) abstractC41023g1.size())), -1);
        }
        long j19 = j18 - j7;
        Long lValueOf = Long.valueOf(j19);
        if (this.f154769g.f159999M && c36179j != null) {
            z13 = false;
        }
        int iM71672c = AbstractC24567y.m71672c(abstractC41023g1, lValueOf, z13);
        long j24 = ((long) iM71672c) + j16;
        if (iM71672c >= 0) {
            C37399g c37399g = (C37399g) abstractC41023g1.get(iM71672c);
            AbstractC41023g0 abstractC41023g2 = j19 < c37399g.f160012E + c37399g.f160021y ? c37399g.f160011M : abstractC41023g0;
            for (int i15 = 0; i15 < abstractC41023g2.size(); i15++) {
                C37397e c37397e = (C37397e) abstractC41023g2.get(i15);
                if (j19 < c37397e.f160012E + c37397e.f160021y) {
                    if (c37397e.f160005L) {
                        j24 += abstractC41023g2 == abstractC41023g0 ? 1L : 0L;
                        i13 = i15;
                    }
                }
            }
            i13 = -1;
        } else {
            i13 = -1;
        }
        return new Pair(Long.valueOf(j24), Integer.valueOf(i13));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final C36174e m115117d(Uri uri, int i13) {
        if (uri == null) {
            return null;
        }
        C34249c c34249c = this.f154772j;
        byte[] bArr = (byte[]) ((C36173d) c34249c.f143660x).remove(uri);
        if (bArr != null) {
            return null;
        }
        C22630n c22630n = new C22630n(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, 1);
        C31521c0 c31521c0 = this.f154768f[i13];
        int iMo54496o = this.f154779q.mo54496o();
        Object objMo54494g = this.f154779q.mo54494g();
        byte[] bArr2 = this.f154775m;
        C36174e c36174e = new C36174e(this.f154765c, c22630n, 3, c31521c0, iMo54496o, objMo54494g, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = AbstractC24567y.f95880f;
        }
        c36174e.f154755j = bArr2;
        return c36174e;
    }
}
