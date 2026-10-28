package tm;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import p085d9.C11795l;
import p309lo.AbstractC24567y;
import q30.C29934u0;

/* JADX INFO: renamed from: tm.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C33933k {

    /* JADX INFO: renamed from: A */
    public long f142187A;

    /* JADX INFO: renamed from: B */
    public long f142188B;

    /* JADX INFO: renamed from: C */
    public long f142189C;

    /* JADX INFO: renamed from: D */
    public boolean f142190D;

    /* JADX INFO: renamed from: E */
    public long f142191E;

    /* JADX INFO: renamed from: F */
    public long f142192F;

    /* JADX INFO: renamed from: a */
    public final C29934u0 f142193a;

    /* JADX INFO: renamed from: b */
    public final long[] f142194b;

    /* JADX INFO: renamed from: c */
    public AudioTrack f142195c;

    /* JADX INFO: renamed from: d */
    public int f142196d;

    /* JADX INFO: renamed from: e */
    public int f142197e;

    /* JADX INFO: renamed from: f */
    public C11795l f142198f;

    /* JADX INFO: renamed from: g */
    public int f142199g;

    /* JADX INFO: renamed from: h */
    public boolean f142200h;

    /* JADX INFO: renamed from: i */
    public long f142201i;

    /* JADX INFO: renamed from: j */
    public float f142202j;

    /* JADX INFO: renamed from: k */
    public boolean f142203k;

    /* JADX INFO: renamed from: l */
    public long f142204l;

    /* JADX INFO: renamed from: m */
    public long f142205m;

    /* JADX INFO: renamed from: n */
    public Method f142206n;

    /* JADX INFO: renamed from: o */
    public long f142207o;

    /* JADX INFO: renamed from: p */
    public boolean f142208p;

    /* JADX INFO: renamed from: q */
    public boolean f142209q;

    /* JADX INFO: renamed from: r */
    public long f142210r;

    /* JADX INFO: renamed from: s */
    public long f142211s;

    /* JADX INFO: renamed from: t */
    public long f142212t;

    /* JADX INFO: renamed from: u */
    public long f142213u;

    /* JADX INFO: renamed from: v */
    public int f142214v;

    /* JADX INFO: renamed from: w */
    public int f142215w;

    /* JADX INFO: renamed from: x */
    public long f142216x;

    /* JADX INFO: renamed from: y */
    public long f142217y;

    /* JADX INFO: renamed from: z */
    public long f142218z;

    public C33933k(C29934u0 c29934u0) {
        this.f142193a = c29934u0;
        if (AbstractC24567y.f95875a >= 18) {
            try {
                this.f142206n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f142194b = new long[10];
    }

    /* JADX INFO: renamed from: a */
    public final long m107347a() {
        AudioTrack audioTrack = this.f142195c;
        audioTrack.getClass();
        if (this.f142216x != -9223372036854775807L) {
            return Math.min(this.f142187A, this.f142218z + ((((SystemClock.elapsedRealtime() * 1000) - this.f142216x) * ((long) this.f142199g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f142200h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f142213u = this.f142211s;
            }
            playbackHeadPosition += this.f142213u;
        }
        if (AbstractC24567y.f95875a <= 29) {
            if (playbackHeadPosition == 0 && this.f142211s > 0 && playState == 3) {
                if (this.f142217y == -9223372036854775807L) {
                    this.f142217y = SystemClock.elapsedRealtime();
                }
                return this.f142211s;
            }
            this.f142217y = -9223372036854775807L;
        }
        if (this.f142211s > playbackHeadPosition) {
            this.f142212t++;
        }
        this.f142211s = playbackHeadPosition;
        return playbackHeadPosition + (this.f142212t << 32);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m107348b(long j7) {
        if (j7 > m107347a()) {
            return true;
        }
        if (!this.f142200h) {
            return false;
        }
        AudioTrack audioTrack = this.f142195c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 2 && m107347a() == 0;
    }
}
