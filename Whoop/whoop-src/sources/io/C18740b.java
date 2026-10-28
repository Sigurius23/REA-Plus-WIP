package io;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p284ko.C22633q;
import p284ko.InterfaceC22614e;
import p309lo.AbstractC24567y;
import p309lo.C24562t;
import p465rm.C31521c0;
import p528un.AbstractC35091b;
import p528un.InterfaceC35092c;
import p690zr.AbstractC41023g0;
import p690zr.AbstractC41047q;
import p690zr.C41014d0;
import sn.C32766w0;

/* JADX INFO: renamed from: io.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C18740b extends AbstractC18741c {

    /* JADX INFO: renamed from: g */
    public final InterfaceC22614e f73614g;

    /* JADX INFO: renamed from: h */
    public final long f73615h;

    /* JADX INFO: renamed from: i */
    public final long f73616i;

    /* JADX INFO: renamed from: j */
    public final long f73617j;

    /* JADX INFO: renamed from: k */
    public final int f73618k;

    /* JADX INFO: renamed from: l */
    public final int f73619l;

    /* JADX INFO: renamed from: m */
    public final float f73620m;

    /* JADX INFO: renamed from: n */
    public final float f73621n;

    /* JADX INFO: renamed from: o */
    public final AbstractC41023g0 f73622o;

    /* JADX INFO: renamed from: p */
    public final C24562t f73623p;

    /* JADX INFO: renamed from: q */
    public float f73624q;

    /* JADX INFO: renamed from: r */
    public int f73625r;

    /* JADX INFO: renamed from: s */
    public int f73626s;

    /* JADX INFO: renamed from: t */
    public long f73627t;

    /* JADX INFO: renamed from: u */
    public AbstractC35091b f73628u;

    public C18740b(C32766w0 c32766w0, int[] iArr, InterfaceC22614e interfaceC22614e, long j7, long j13, long j14, AbstractC41023g0 abstractC41023g0) {
        super(c32766w0, iArr);
        if (j14 < j7) {
            Log.w("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j14 = j7;
        }
        this.f73614g = interfaceC22614e;
        this.f73615h = j7 * 1000;
        this.f73616i = j13 * 1000;
        this.f73617j = j14 * 1000;
        this.f73618k = 1279;
        this.f73619l = 719;
        this.f73620m = 0.7f;
        this.f73621n = 0.75f;
        this.f73622o = AbstractC41023g0.m133252m(abstractC41023g0);
        this.f73623p = C24562t.f95862a;
        this.f73624q = 1.0f;
        this.f73626s = 0;
        this.f73627t = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: u */
    public static void m54488u(ArrayList arrayList, long[] jArr) {
        long j7 = 0;
        for (long j13 : jArr) {
            j7 += j13;
        }
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            C41014d0 c41014d0 = (C41014d0) arrayList.get(i13);
            if (c41014d0 != null) {
                c41014d0.m133222a(new C18739a(j7, jArr[i13]));
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static long m54489w(List list) {
        if (!list.isEmpty()) {
            AbstractC35091b abstractC35091b = (AbstractC35091b) AbstractC41047q.m133279i(list);
            long j7 = abstractC35091b.f148919g;
            if (j7 != -9223372036854775807L) {
                long j13 = abstractC35091b.f148920h;
                if (j13 != -9223372036854775807L) {
                    return j13 - j7;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // io.AbstractC18741c, io.InterfaceC20035o
    /* JADX INFO: renamed from: a */
    public final void mo54490a() {
        this.f73628u = null;
    }

    @Override // io.AbstractC18741c, io.InterfaceC20035o
    /* JADX INFO: renamed from: b */
    public final void mo54491b() {
        this.f73627t = -9223372036854775807L;
        this.f73628u = null;
    }

    @Override // io.InterfaceC20035o
    /* JADX INFO: renamed from: c */
    public final int mo54492c() {
        return this.f73625r;
    }

    @Override // io.AbstractC18741c, io.InterfaceC20035o
    /* JADX INFO: renamed from: f */
    public final void mo54493f(float f13) {
        this.f73624q = f13;
    }

    @Override // io.InterfaceC20035o
    /* JADX INFO: renamed from: g */
    public final Object mo54494g() {
        return null;
    }

    @Override // io.AbstractC18741c, io.InterfaceC20035o
    /* JADX INFO: renamed from: l */
    public final int mo54495l(long j7, List list) {
        int i13;
        int i14;
        this.f73623p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j13 = this.f73627t;
        if (j13 != -9223372036854775807L && jElapsedRealtime - j13 < 1000 && (list.isEmpty() || ((AbstractC35091b) AbstractC41047q.m133279i(list)).equals(this.f73628u))) {
            return list.size();
        }
        this.f73627t = jElapsedRealtime;
        this.f73628u = list.isEmpty() ? null : (AbstractC35091b) AbstractC41047q.m133279i(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jM71688s = AbstractC24567y.m71688s(this.f73624q, ((AbstractC35091b) list.get(size - 1)).f148919g - j7);
        long j14 = this.f73617j;
        if (jM71688s >= j14) {
            m54489w(list);
            C31521c0 c31521c0 = this.f73632d[m54498v(jElapsedRealtime)];
            for (int i15 = 0; i15 < size; i15++) {
                AbstractC35091b abstractC35091b = (AbstractC35091b) list.get(i15);
                C31521c0 c31521c1 = abstractC35091b.f148916d;
                if (AbstractC24567y.m71688s(this.f73624q, abstractC35091b.f148919g - j7) >= j14 && c31521c1.f130073H < c31521c0.f130073H && (i13 = c31521c1.f130083R) != -1 && i13 <= this.f73619l && (i14 = c31521c1.f130082Q) != -1 && i14 <= this.f73618k && i13 < c31521c0.f130083R) {
                    return i15;
                }
            }
        }
        return size;
    }

    @Override // io.InterfaceC20035o
    /* JADX INFO: renamed from: o */
    public final int mo54496o() {
        return this.f73626s;
    }

    @Override // io.InterfaceC20035o
    /* JADX INFO: renamed from: q */
    public final void mo54497q(long j7, long j13, long j14, List list, InterfaceC35092c[] interfaceC35092cArr) {
        long jM54489w;
        this.f73623p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i13 = this.f73625r;
        int i14 = 0;
        if (i13 >= interfaceC35092cArr.length || !interfaceC35092cArr[i13].next()) {
            int length = interfaceC35092cArr.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length) {
                    jM54489w = m54489w(list);
                    break;
                }
                InterfaceC35092c interfaceC35092c = interfaceC35092cArr[i15];
                if (interfaceC35092c.next()) {
                    jM54489w = interfaceC35092c.mo36165e() - interfaceC35092c.mo36164b();
                    break;
                }
                i15++;
            }
        } else {
            InterfaceC35092c interfaceC35092c2 = interfaceC35092cArr[this.f73625r];
            jM54489w = interfaceC35092c2.mo36165e() - interfaceC35092c2.mo36164b();
        }
        int i16 = this.f73626s;
        if (i16 == 0) {
            this.f73626s = 1;
            this.f73625r = m54498v(jElapsedRealtime);
            return;
        }
        int i17 = this.f73625r;
        boolean zIsEmpty = list.isEmpty();
        C31521c0[] c31521c0Arr = this.f73632d;
        if (!zIsEmpty) {
            C31521c0 c31521c0 = ((AbstractC35091b) AbstractC41047q.m133279i(list)).f148916d;
            while (true) {
                if (i14 >= this.f73630b) {
                    i14 = -1;
                    break;
                } else if (c31521c0Arr[i14] == c31521c0) {
                    break;
                } else {
                    i14++;
                }
            }
        } else {
            i14 = -1;
            break;
        }
        if (i14 != -1) {
            i16 = ((AbstractC35091b) AbstractC41047q.m133279i(list)).f148917e;
            i17 = i14;
        }
        int iM54498v = m54498v(jElapsedRealtime);
        if (!mo54506s(i17, jElapsedRealtime)) {
            C31521c0 c31521c1 = c31521c0Arr[i17];
            C31521c0 c31521c2 = c31521c0Arr[iM54498v];
            long jMin = this.f73615h;
            if (j14 != -9223372036854775807L) {
                jMin = Math.min((long) ((jM54489w != -9223372036854775807L ? j14 - jM54489w : j14) * this.f73621n), jMin);
            }
            int i18 = c31521c2.f130073H;
            int i19 = c31521c1.f130073H;
            if ((i18 > i19 && j13 < jMin) || (i18 < i19 && j13 >= this.f73616i)) {
                iM54498v = i17;
            }
        }
        if (iM54498v != i17) {
            i16 = 3;
        }
        this.f73626s = i16;
        this.f73625r = iM54498v;
    }

    /* JADX INFO: renamed from: v */
    public final int m54498v(long j7) {
        long j13;
        C22633q c22633q = (C22633q) this.f73614g;
        synchronized (c22633q) {
            j13 = c22633q.f89052l;
        }
        long j14 = (long) (j13 * this.f73620m);
        this.f73614g.getClass();
        long j15 = (long) (j14 / this.f73624q);
        if (!this.f73622o.isEmpty()) {
            int i13 = 1;
            while (i13 < this.f73622o.size() - 1 && ((C18739a) this.f73622o.get(i13)).f73612a < j15) {
                i13++;
            }
            C18739a c18739a = (C18739a) this.f73622o.get(i13 - 1);
            C18739a c18739a2 = (C18739a) this.f73622o.get(i13);
            long j16 = c18739a.f73612a;
            float f13 = (j15 - j16) / (c18739a2.f73612a - j16);
            long j17 = c18739a.f73613b;
            j15 = j17 + ((long) (f13 * (c18739a2.f73613b - j17)));
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f73630b; i15++) {
            if (j7 == Long.MIN_VALUE || !mo54506s(i15, j7)) {
                if (this.f73632d[i15].f130073H <= j15) {
                    return i15;
                }
                i14 = i15;
            }
        }
        return i14;
    }
}
