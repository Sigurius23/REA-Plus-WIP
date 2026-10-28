package p031b9;

import android.os.SystemClock;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.List;
import p299l9.C23488c0;
import p299l9.C23501g1;
import p361o9.C27682v;
import p516u8.AbstractC34609o0;
import p516u8.C34589e0;
import p516u8.C34603l0;
import p607x8.AbstractC38065t;
import p690zr.C41060w0;

/* JADX INFO: renamed from: b9.c1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2822c1 {

    /* JADX INFO: renamed from: u */
    public static final C23488c0 f11044u = new C23488c0(new Object());

    /* JADX INFO: renamed from: a */
    public final AbstractC34609o0 f11045a;

    /* JADX INFO: renamed from: b */
    public final C23488c0 f11046b;

    /* JADX INFO: renamed from: c */
    public final long f11047c;

    /* JADX INFO: renamed from: d */
    public final long f11048d;

    /* JADX INFO: renamed from: e */
    public final int f11049e;

    /* JADX INFO: renamed from: f */
    public final ExoPlaybackException f11050f;

    /* JADX INFO: renamed from: g */
    public final boolean f11051g;

    /* JADX INFO: renamed from: h */
    public final C23501g1 f11052h;

    /* JADX INFO: renamed from: i */
    public final C27682v f11053i;

    /* JADX INFO: renamed from: j */
    public final List f11054j;

    /* JADX INFO: renamed from: k */
    public final C23488c0 f11055k;

    /* JADX INFO: renamed from: l */
    public final boolean f11056l;

    /* JADX INFO: renamed from: m */
    public final int f11057m;

    /* JADX INFO: renamed from: n */
    public final int f11058n;

    /* JADX INFO: renamed from: o */
    public final C34589e0 f11059o;

    /* JADX INFO: renamed from: p */
    public final boolean f11060p;

    /* JADX INFO: renamed from: q */
    public volatile long f11061q;

    /* JADX INFO: renamed from: r */
    public volatile long f11062r;

    /* JADX INFO: renamed from: s */
    public volatile long f11063s;

    /* JADX INFO: renamed from: t */
    public volatile long f11064t;

    public C2822c1(AbstractC34609o0 abstractC34609o0, C23488c0 c23488c0, long j7, long j13, int i13, ExoPlaybackException exoPlaybackException, boolean z4, C23501g1 c23501g1, C27682v c27682v, List list, C23488c0 c23488c1, boolean z13, int i14, int i15, C34589e0 c34589e0, long j14, long j15, long j16, long j17, boolean z14) {
        this.f11045a = abstractC34609o0;
        this.f11046b = c23488c0;
        this.f11047c = j7;
        this.f11048d = j13;
        this.f11049e = i13;
        this.f11050f = exoPlaybackException;
        this.f11051g = z4;
        this.f11052h = c23501g1;
        this.f11053i = c27682v;
        this.f11054j = list;
        this.f11055k = c23488c1;
        this.f11056l = z13;
        this.f11057m = i14;
        this.f11058n = i15;
        this.f11059o = c34589e0;
        this.f11061q = j14;
        this.f11062r = j15;
        this.f11063s = j16;
        this.f11064t = j17;
        this.f11060p = z14;
    }

    /* JADX INFO: renamed from: j */
    public static C2822c1 m8035j(C27682v c27682v) {
        C34603l0 c34603l0 = AbstractC34609o0.f145755a;
        C23501g1 c23501g1 = C23501g1.f93026d;
        C41060w0 c41060w0 = C41060w0.f177067E;
        C34589e0 c34589e0 = C34589e0.f145647d;
        C23488c0 c23488c0 = f11044u;
        return new C2822c1(c34603l0, c23488c0, -9223372036854775807L, 0L, 1, null, false, c23501g1, c27682v, c41060w0, c23488c0, false, 1, 0, c34589e0, 0L, 0L, 0L, 0L, false);
    }

    /* JADX INFO: renamed from: a */
    public final C2822c1 m8036a() {
        return new C2822c1(this.f11045a, this.f11046b, this.f11047c, this.f11048d, this.f11049e, this.f11050f, this.f11051g, this.f11052h, this.f11053i, this.f11054j, this.f11055k, this.f11056l, this.f11057m, this.f11058n, this.f11059o, this.f11061q, this.f11062r, m8045k(), SystemClock.elapsedRealtime(), this.f11060p);
    }

    /* JADX INFO: renamed from: b */
    public final C2822c1 m8037b(boolean z4) {
        return new C2822c1(this.f11045a, this.f11046b, this.f11047c, this.f11048d, this.f11049e, this.f11050f, z4, this.f11052h, this.f11053i, this.f11054j, this.f11055k, this.f11056l, this.f11057m, this.f11058n, this.f11059o, this.f11061q, this.f11062r, this.f11063s, this.f11064t, this.f11060p);
    }

    /* JADX INFO: renamed from: c */
    public final C2822c1 m8038c(C23488c0 c23488c0) {
        return new C2822c1(this.f11045a, this.f11046b, this.f11047c, this.f11048d, this.f11049e, this.f11050f, this.f11051g, this.f11052h, this.f11053i, this.f11054j, c23488c0, this.f11056l, this.f11057m, this.f11058n, this.f11059o, this.f11061q, this.f11062r, this.f11063s, this.f11064t, this.f11060p);
    }

    /* JADX INFO: renamed from: d */
    public final C2822c1 m8039d(C23488c0 c23488c0, long j7, long j13, long j14, long j15, C23501g1 c23501g1, C27682v c27682v, List list) {
        return new C2822c1(this.f11045a, c23488c0, j13, j14, this.f11049e, this.f11050f, this.f11051g, c23501g1, c27682v, list, this.f11055k, this.f11056l, this.f11057m, this.f11058n, this.f11059o, this.f11061q, j15, j7, SystemClock.elapsedRealtime(), this.f11060p);
    }

    /* JADX INFO: renamed from: e */
    public final C2822c1 m8040e(int i13, int i14, boolean z4) {
        return new C2822c1(this.f11045a, this.f11046b, this.f11047c, this.f11048d, this.f11049e, this.f11050f, this.f11051g, this.f11052h, this.f11053i, this.f11054j, this.f11055k, z4, i13, i14, this.f11059o, this.f11061q, this.f11062r, this.f11063s, this.f11064t, this.f11060p);
    }

    /* JADX INFO: renamed from: f */
    public final C2822c1 m8041f(ExoPlaybackException exoPlaybackException) {
        return new C2822c1(this.f11045a, this.f11046b, this.f11047c, this.f11048d, this.f11049e, exoPlaybackException, this.f11051g, this.f11052h, this.f11053i, this.f11054j, this.f11055k, this.f11056l, this.f11057m, this.f11058n, this.f11059o, this.f11061q, this.f11062r, this.f11063s, this.f11064t, this.f11060p);
    }

    /* JADX INFO: renamed from: g */
    public final C2822c1 m8042g(C34589e0 c34589e0) {
        return new C2822c1(this.f11045a, this.f11046b, this.f11047c, this.f11048d, this.f11049e, this.f11050f, this.f11051g, this.f11052h, this.f11053i, this.f11054j, this.f11055k, this.f11056l, this.f11057m, this.f11058n, c34589e0, this.f11061q, this.f11062r, this.f11063s, this.f11064t, this.f11060p);
    }

    /* JADX INFO: renamed from: h */
    public final C2822c1 m8043h(int i13) {
        return new C2822c1(this.f11045a, this.f11046b, this.f11047c, this.f11048d, i13, this.f11050f, this.f11051g, this.f11052h, this.f11053i, this.f11054j, this.f11055k, this.f11056l, this.f11057m, this.f11058n, this.f11059o, this.f11061q, this.f11062r, this.f11063s, this.f11064t, this.f11060p);
    }

    /* JADX INFO: renamed from: i */
    public final C2822c1 m8044i(AbstractC34609o0 abstractC34609o0) {
        return new C2822c1(abstractC34609o0, this.f11046b, this.f11047c, this.f11048d, this.f11049e, this.f11050f, this.f11051g, this.f11052h, this.f11053i, this.f11054j, this.f11055k, this.f11056l, this.f11057m, this.f11058n, this.f11059o, this.f11061q, this.f11062r, this.f11063s, this.f11064t, this.f11060p);
    }

    /* JADX INFO: renamed from: k */
    public final long m8045k() {
        long j7;
        long j13;
        if (!m8046l()) {
            return this.f11063s;
        }
        do {
            j7 = this.f11064t;
            j13 = this.f11063s;
        } while (j7 != this.f11064t);
        return AbstractC38065t.m121896J(AbstractC38065t.m121907U(j13) + ((long) ((SystemClock.elapsedRealtime() - j7) * this.f11059o.f145648a)));
    }

    /* JADX INFO: renamed from: l */
    public final boolean m8046l() {
        return this.f11049e == 3 && this.f11056l && this.f11058n == 0;
    }
}
