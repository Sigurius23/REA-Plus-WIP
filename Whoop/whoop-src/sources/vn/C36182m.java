package vn;

import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import com.google.android.exoplayer2.source.hls.SampleQueueMappingException;
import java.util.ArrayList;
import java.util.Iterator;
import p299l9.C23537y;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p319m4.AbstractC25012a;
import p465rm.C31521c0;
import p508ty.C34249c;
import p527um.C35073c;
import p619xl.C38445a;
import q63.AbstractC30007c;
import sn.C32770z;
import sn.InterfaceC32756r0;

/* JADX INFO: renamed from: vn.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C36182m implements InterfaceC32756r0 {

    /* JADX INFO: renamed from: w */
    public final int f154846w;

    /* JADX INFO: renamed from: x */
    public final C36186q f154847x;

    /* JADX INFO: renamed from: y */
    public int f154848y = -1;

    public C36182m(C36186q c36186q, int i13) {
        this.f154847x = c36186q;
        this.f154846w = i13;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    /* JADX INFO: renamed from: a */
    public final void m115129a() {
        AbstractC24543a.m71569e(this.f154848y == -1);
        C36186q c36186q = this.f154847x;
        c36186q.m115141s();
        c36186q.f154893k0.getClass();
        int[] iArr = c36186q.f154893k0;
        int i13 = this.f154846w;
        int i14 = iArr[i13];
        if (i14 != -1) {
            boolean[] zArr = c36186q.f154896n0;
            if (zArr[i14]) {
                i14 = -2;
            } else {
                zArr[i14] = true;
            }
        } else if (c36186q.f154892j0.contains(c36186q.f154891i0.m102758a(i13))) {
            i14 = -3;
        } else {
            i14 = -2;
        }
        this.f154848y = i14;
    }

    @Override // sn.InterfaceC32756r0
    /* JADX INFO: renamed from: b */
    public final boolean mo79412b() {
        if (this.f154848y == -3) {
            return true;
        }
        if (!m115130d()) {
            return false;
        }
        int i13 = this.f154848y;
        C36186q c36186q = this.f154847x;
        return !c36186q.m115135C() && c36186q.f154878V[i13].m102745p(c36186q.f154902t0);
    }

    @Override // sn.InterfaceC32756r0
    /* JADX INFO: renamed from: c */
    public final void mo79413c() throws DrmSession$DrmSessionException, SampleQueueMappingException {
        int i13 = this.f154848y;
        C36186q c36186q = this.f154847x;
        if (i13 == -2) {
            c36186q.m115141s();
            String str = c36186q.f154891i0.m102758a(this.f154846w).f136262y[0].f130077L;
            StringBuilder sb4 = new StringBuilder(AbstractC30007c.m91832b(60, str));
            sb4.append("Unable to bind a sample queue to TrackGroup with mime type ");
            sb4.append(str);
            sb4.append(".");
            throw new SampleQueueMappingException(sb4.toString());
        }
        if (i13 == -1) {
            c36186q.m115137E();
            return;
        }
        if (i13 != -3) {
            c36186q.m115137E();
            C36185p c36185p = c36186q.f154878V[i13];
            C34249c c34249c = c36185p.f136219h;
            if (c34249c == null || c34249c.m108301r() != 1) {
                return;
            }
            DrmSession$DrmSessionException drmSession$DrmSessionExceptionM108297n = c36185p.f136219h.m108297n();
            drmSession$DrmSessionExceptionM108297n.getClass();
            throw drmSession$DrmSessionExceptionM108297n;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m115130d() {
        int i13 = this.f154848y;
        return (i13 == -1 || i13 == -3 || i13 == -2) ? false : true;
    }

    @Override // sn.InterfaceC32756r0
    /* JADX INFO: renamed from: e */
    public final int mo79415e(C38445a c38445a, C35073c c35073c, int i13) {
        C36186q c36186q;
        C31521c0 c31521c0;
        int i14 = -3;
        if (this.f154848y == -3) {
            c35073c.m1495a(4);
            return -4;
        }
        if (m115130d()) {
            int i15 = this.f154848y;
            C36186q c36186q2 = this.f154847x;
            ArrayList arrayList = c36186q2.f154870N;
            if (!c36186q2.m115135C()) {
                int i16 = 0;
                if (arrayList.isEmpty()) {
                    i14 = -3;
                    c36186q = c36186q2;
                } else {
                    int i17 = 0;
                    loop0: while (i17 < arrayList.size() - 1) {
                        int i18 = ((C36179j) arrayList.get(i17)).f154795k;
                        int length = c36186q2.f154878V.length;
                        for (int i19 = 0; i19 < length; i19++) {
                            if (c36186q2.f154896n0[i19] && c36186q2.f154878V[i19].m102748s() == i18) {
                                break loop0;
                            }
                        }
                        i17++;
                    }
                    int i24 = AbstractC24567y.f95875a;
                    if (i17 > arrayList.size() || i17 < 0) {
                        throw new IllegalArgumentException();
                    }
                    if (i17 != 0) {
                        arrayList.subList(0, i17).clear();
                    }
                    C36179j c36179j = (C36179j) arrayList.get(0);
                    C31521c0 c31521c1 = c36179j.f148916d;
                    if (c31521c1.equals(c36186q2.f154889g0)) {
                        c36186q = c36186q2;
                    } else {
                        C32770z c32770z = c36186q2.f154867K;
                        c32770z.m102760b(new C23537y(1, c36186q2.f154907x, c31521c1, c36179j.f148917e, c36179j.f148918f, c32770z.m102759a(c36179j.f148919g), -9223372036854775807L));
                        c36186q = c36186q2;
                    }
                    c36186q.f154889g0 = c31521c1;
                }
                if (!arrayList.isEmpty() && !((C36179j) arrayList.get(0)).f154794K) {
                    return i14;
                }
                int iM102749t = c36186q.f154878V[i15].m102749t(c38445a, c35073c, i13, c36186q.f154902t0);
                if (iM102749t == -5) {
                    C31521c0 c31521c0M97115c = (C31521c0) c38445a.f164637y;
                    c31521c0M97115c.getClass();
                    if (i15 == c36186q.f154884b0) {
                        int iM102748s = c36186q.f154878V[i15].m102748s();
                        while (i16 < arrayList.size() && ((C36179j) arrayList.get(i16)).f154795k != iM102748s) {
                            i16++;
                        }
                        if (i16 < arrayList.size()) {
                            c31521c0 = ((C36179j) arrayList.get(i16)).f148916d;
                        } else {
                            c31521c0 = c36186q.f154888f0;
                            c31521c0.getClass();
                        }
                        c31521c0M97115c = c31521c0M97115c.m97115c(c31521c0);
                    }
                    c38445a.f164637y = c31521c0M97115c;
                }
                return iM102749t;
            }
        }
        return -3;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    @Override // sn.InterfaceC32756r0
    /* JADX INFO: renamed from: j */
    public final int mo79416j(long j7) throws Throwable {
        Object next;
        Object objM73371d;
        if (!m115130d()) {
            return 0;
        }
        int i13 = this.f154848y;
        C36186q c36186q = this.f154847x;
        if (c36186q.m115135C()) {
            return 0;
        }
        C36185p c36185p = c36186q.f154878V[i13];
        int iM102743n = c36185p.m102743n(j7, c36186q.f154902t0);
        ArrayList arrayList = c36186q.f154870N;
        if (arrayList == null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
                objM73371d = next;
            } else {
                objM73371d = null;
            }
        } else if (arrayList.isEmpty()) {
            objM73371d = null;
        } else {
            objM73371d = AbstractC25012a.m73371d(arrayList, 1);
        }
        C36179j c36179j = (C36179j) objM73371d;
        if (c36179j != null && !c36179j.f154794K) {
            iM102743n = Math.min(iM102743n, c36179j.m115120e(i13) - c36185p.m102741l());
        }
        c36185p.m102752w(iM102743n);
        return iM102743n;
    }
}
