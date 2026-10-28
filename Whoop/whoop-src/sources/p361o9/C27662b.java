package p361o9;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import p324m9.AbstractC25273a;
import p324m9.InterfaceC25282j;
import p398p9.C28982f;
import p398p9.InterfaceC28980d;
import p516u8.C34610p;
import p516u8.C34611p0;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p607x8.C38061p;
import p690zr.AbstractC41023g0;
import p690zr.AbstractC41047q;
import p690zr.C41014d0;

/* JADX INFO: renamed from: o9.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C27662b extends AbstractC27663c {

    /* JADX INFO: renamed from: g */
    public final InterfaceC28980d f111316g;

    /* JADX INFO: renamed from: h */
    public final long f111317h;

    /* JADX INFO: renamed from: i */
    public final long f111318i;

    /* JADX INFO: renamed from: j */
    public final long f111319j;

    /* JADX INFO: renamed from: k */
    public final int f111320k;

    /* JADX INFO: renamed from: l */
    public final int f111321l;

    /* JADX INFO: renamed from: m */
    public final float f111322m;

    /* JADX INFO: renamed from: n */
    public final float f111323n;

    /* JADX INFO: renamed from: o */
    public final AbstractC41023g0 f111324o;

    /* JADX INFO: renamed from: p */
    public final C38061p f111325p;

    /* JADX INFO: renamed from: q */
    public float f111326q;

    /* JADX INFO: renamed from: r */
    public int f111327r;

    /* JADX INFO: renamed from: s */
    public int f111328s;

    /* JADX INFO: renamed from: t */
    public long f111329t;

    /* JADX INFO: renamed from: u */
    public AbstractC25273a f111330u;

    public C27662b(C34611p0 c34611p0, int[] iArr, InterfaceC28980d interfaceC28980d, long j7, long j13, long j14, AbstractC41023g0 abstractC41023g0) {
        super(c34611p0, iArr);
        if (j14 < j7) {
            AbstractC38046a.m121826u("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j14 = j7;
        }
        this.f111316g = interfaceC28980d;
        this.f111317h = j7 * 1000;
        this.f111318i = j13 * 1000;
        this.f111319j = j14 * 1000;
        this.f111320k = 1279;
        this.f111321l = 719;
        this.f111322m = 0.7f;
        this.f111323n = 0.75f;
        this.f111324o = AbstractC41023g0.m133252m(abstractC41023g0);
        this.f111325p = C38061p.f163023a;
        this.f111326q = 1.0f;
        this.f111328s = 0;
        this.f111329t = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: v */
    public static void m83656v(ArrayList arrayList, long[] jArr) {
        long j7 = 0;
        for (long j13 : jArr) {
            j7 += j13;
        }
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            C41014d0 c41014d0 = (C41014d0) arrayList.get(i13);
            if (c41014d0 != null) {
                c41014d0.m133222a(new C27661a(j7, jArr[i13]));
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public static long m83657x(List list) {
        if (!list.isEmpty()) {
            AbstractC25273a abstractC25273a = (AbstractC25273a) AbstractC41047q.m133279i(list);
            long j7 = abstractC25273a.f99187G;
            if (j7 != -9223372036854775807L) {
                long j13 = abstractC25273a.f99188H;
                if (j13 != -9223372036854775807L) {
                    return j13 - j7;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // p361o9.AbstractC27663c, p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: a */
    public final void mo68069a() {
        this.f111330u = null;
    }

    @Override // p361o9.AbstractC27663c, p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: b */
    public final void mo68070b() {
        this.f111329t = -9223372036854775807L;
        this.f111330u = null;
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: c */
    public final int mo68071c() {
        return this.f111327r;
    }

    @Override // p361o9.AbstractC27663c, p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: f */
    public final void mo68074f(float f13) {
        this.f111326q = f13;
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: g */
    public final Object mo68075g() {
        return null;
    }

    @Override // p361o9.AbstractC27663c, p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: l */
    public final int mo68080l(long j7, List list) {
        int i13;
        int i14;
        this.f111325p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j13 = this.f111329t;
        if (j13 != -9223372036854775807L && jElapsedRealtime - j13 < 1000 && (list.isEmpty() || ((AbstractC25273a) AbstractC41047q.m133279i(list)).equals(this.f111330u))) {
            return list.size();
        }
        this.f111329t = jElapsedRealtime;
        this.f111330u = list.isEmpty() ? null : (AbstractC25273a) AbstractC41047q.m133279i(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jM121931x = AbstractC38065t.m121931x(this.f111326q, ((AbstractC25273a) list.get(size - 1)).f99187G - j7);
        long j14 = this.f111319j;
        if (jM121931x >= j14) {
            m83657x(list);
            C34610p c34610p = this.f111334d[m83658w(jElapsedRealtime)];
            for (int i15 = 0; i15 < size; i15++) {
                AbstractC25273a abstractC25273a = (AbstractC25273a) list.get(i15);
                C34610p c34610p2 = abstractC25273a.f99193z;
                if (AbstractC38065t.m121931x(this.f111326q, abstractC25273a.f99187G - j7) >= j14 && c34610p2.f145779j < c34610p.f145779j && (i13 = c34610p2.f145791v) != -1 && i13 <= this.f111321l && (i14 = c34610p2.f145790u) != -1 && i14 <= this.f111320k && i13 < c34610p.f145791v) {
                    return i15;
                }
            }
        }
        return size;
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: o */
    public final int mo68083o() {
        return this.f111328s;
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: r */
    public final void mo68086r(long j7, long j13, long j14, List list, InterfaceC25282j[] interfaceC25282jArr) {
        long jM83657x;
        this.f111325p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i13 = this.f111327r;
        if (i13 >= interfaceC25282jArr.length || !interfaceC25282jArr[i13].next()) {
            int length = interfaceC25282jArr.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    jM83657x = m83657x(list);
                    break;
                }
                InterfaceC25282j interfaceC25282j = interfaceC25282jArr[i14];
                if (interfaceC25282j.next()) {
                    jM83657x = interfaceC25282j.mo36165e() - interfaceC25282j.mo36164b();
                    break;
                }
                i14++;
            }
        } else {
            InterfaceC25282j interfaceC25282j2 = interfaceC25282jArr[this.f111327r];
            jM83657x = interfaceC25282j2.mo36165e() - interfaceC25282j2.mo36164b();
        }
        int i15 = this.f111328s;
        if (i15 == 0) {
            this.f111328s = 1;
            this.f111327r = m83658w(jElapsedRealtime);
            return;
        }
        int i16 = this.f111327r;
        int iMo68087s = list.isEmpty() ? -1 : mo68087s(((AbstractC25273a) AbstractC41047q.m133279i(list)).f99193z);
        if (iMo68087s != -1) {
            i15 = ((AbstractC25273a) AbstractC41047q.m133279i(list)).f99185E;
            i16 = iMo68087s;
        }
        int iM83658w = m83658w(jElapsedRealtime);
        if (iM83658w != i16 && !mo68085q(i16, jElapsedRealtime)) {
            C34610p[] c34610pArr = this.f111334d;
            C34610p c34610p = c34610pArr[i16];
            C34610p c34610p2 = c34610pArr[iM83658w];
            long jMin = this.f111317h;
            if (j14 != -9223372036854775807L) {
                jMin = Math.min((long) ((jM83657x != -9223372036854775807L ? j14 - jM83657x : j14) * this.f111323n), jMin);
            }
            int i17 = c34610p2.f145779j;
            int i18 = c34610p.f145779j;
            if ((i17 > i18 && j13 < jMin) || (i17 < i18 && j13 >= this.f111318i)) {
                iM83658w = i16;
            }
        }
        if (iM83658w != i16) {
            i15 = 3;
        }
        this.f111328s = i15;
        this.f111327r = iM83658w;
    }

    /* JADX INFO: renamed from: w */
    public final int m83658w(long j7) {
        long j13;
        C28982f c28982f = (C28982f) this.f111316g;
        synchronized (c28982f) {
            j13 = c28982f.f117241l;
        }
        long j14 = (long) (j13 * this.f111322m);
        this.f111316g.getClass();
        long j15 = (long) (j14 / this.f111326q);
        if (!this.f111324o.isEmpty()) {
            int i13 = 1;
            while (i13 < this.f111324o.size() - 1 && ((C27661a) this.f111324o.get(i13)).f111314a < j15) {
                i13++;
            }
            C27661a c27661a = (C27661a) this.f111324o.get(i13 - 1);
            C27661a c27661a2 = (C27661a) this.f111324o.get(i13);
            long j16 = c27661a.f111314a;
            float f13 = (j15 - j16) / (c27661a2.f111314a - j16);
            long j17 = c27661a.f111315b;
            j15 = j17 + ((long) (f13 * (c27661a2.f111315b - j17)));
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f111332b; i15++) {
            if (j7 == Long.MIN_VALUE || !mo68085q(i15, j7)) {
                if (this.f111334d[i15].f145779j <= j15) {
                    return i15;
                }
                i14 = i15;
            }
        }
        return i14;
    }
}
