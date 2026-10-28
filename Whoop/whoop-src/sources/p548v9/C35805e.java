package p548v9;

import java.math.RoundingMode;
import p499t9.C33625d0;
import p499t9.C33629f0;
import p499t9.InterfaceC33639k0;
import p607x8.AbstractC38065t;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: v9.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C35805e {

    /* JADX INFO: renamed from: a */
    public final C35804d f152310a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC33639k0 f152311b;

    /* JADX INFO: renamed from: c */
    public final int f152312c;

    /* JADX INFO: renamed from: d */
    public final int f152313d;

    /* JADX INFO: renamed from: e */
    public final long f152314e;

    /* JADX INFO: renamed from: f */
    public int f152315f;

    /* JADX INFO: renamed from: g */
    public int f152316g;

    /* JADX INFO: renamed from: h */
    public int f152317h;

    /* JADX INFO: renamed from: i */
    public int f152318i;

    /* JADX INFO: renamed from: j */
    public int f152319j;

    /* JADX INFO: renamed from: k */
    public int f152320k;

    /* JADX INFO: renamed from: l */
    public long f152321l;

    /* JADX INFO: renamed from: m */
    public long[] f152322m;

    /* JADX INFO: renamed from: n */
    public int[] f152323n;

    public C35805e(int i13, C35804d c35804d, InterfaceC33639k0 interfaceC33639k0) {
        int i14 = c35804d.f152307d;
        this.f152310a = c35804d;
        int iM113523a = c35804d.m113523a();
        boolean z4 = true;
        if (iM113523a != 1 && iM113523a != 2) {
            z4 = false;
        }
        AbstractC35849g.m113802d(z4);
        int i15 = (((i13 % 10) + 48) << 8) | ((i13 / 10) + 48);
        this.f152312c = (iM113523a == 2 ? 1667497984 : 1651965952) | i15;
        long j7 = ((long) c35804d.f152305b) * 1000000;
        long j13 = c35804d.f152306c;
        int i16 = AbstractC38065t.f163031a;
        this.f152314e = AbstractC38065t.m121903Q(i14, j7, j13, RoundingMode.DOWN);
        this.f152311b = interfaceC33639k0;
        this.f152313d = iM113523a == 2 ? i15 | 1650720768 : -1;
        this.f152321l = -1L;
        this.f152322m = new long[512];
        this.f152323n = new int[512];
        this.f152315f = i14;
    }

    /* JADX INFO: renamed from: a */
    public final C33629f0 m113524a(int i13) {
        return new C33629f0(((this.f152314e * ((long) 1)) / ((long) this.f152315f)) * ((long) this.f152323n[i13]), this.f152322m[i13]);
    }

    /* JADX INFO: renamed from: b */
    public final C33625d0 m113525b(long j7) {
        if (this.f152320k == 0) {
            C33629f0 c33629f0 = new C33629f0(0L, this.f152321l);
            return new C33625d0(c33629f0, c33629f0);
        }
        int i13 = (int) (j7 / ((this.f152314e * ((long) 1)) / ((long) this.f152315f)));
        int iM121910c = AbstractC38065t.m121910c(this.f152323n, i13, true, true);
        if (this.f152323n[iM121910c] == i13) {
            C33629f0 c33629f0M113524a = m113524a(iM121910c);
            return new C33625d0(c33629f0M113524a, c33629f0M113524a);
        }
        C33629f0 c33629f0M113524a2 = m113524a(iM121910c);
        int i14 = iM121910c + 1;
        return i14 < this.f152322m.length ? new C33625d0(c33629f0M113524a2, m113524a(i14)) : new C33625d0(c33629f0M113524a2, c33629f0M113524a2);
    }
}
