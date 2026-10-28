package p085d9;

import a33.C0352d;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import bv.RunnableC3666a;
import c33.ThreadFactoryC3934a;
import d30.C11535h;
import io.sentry.internal.debugmeta.C20378c;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p006a4.AbstractC0354a;
import p012ab.C0680g0;
import p031b9.C2836h0;
import p047c9.C4323n;
import p079d2.AbstractC11480b;
import p516u8.AbstractC34587d0;
import p516u8.C34586d;
import p516u8.C34588e;
import p516u8.C34589e0;
import p516u8.C34610p;
import p547v8.AbstractC35785b;
import p547v8.C35786c;
import p547v8.C35787d;
import p547v8.C35791h;
import p547v8.C35792i;
import p547v8.InterfaceC35788e;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p690zr.AbstractC41023g0;
import p690zr.AbstractC41047q;
import p690zr.C41017e0;
import p690zr.C41060w0;
import p715kotlin.time.DurationKt;
import qg3.C30352d;
import ro.C31624i;
import va3.AbstractC35849g;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: d9.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C11807x {

    /* JADX INFO: renamed from: j0 */
    public static final Object f38334j0 = new Object();

    /* JADX INFO: renamed from: k0 */
    public static ScheduledExecutorService f38335k0;

    /* JADX INFO: renamed from: l0 */
    public static int f38336l0;

    /* JADX INFO: renamed from: A */
    public C11801r f38337A;

    /* JADX INFO: renamed from: B */
    public C11801r f38338B;

    /* JADX INFO: renamed from: C */
    public C34589e0 f38339C;

    /* JADX INFO: renamed from: D */
    public boolean f38340D;

    /* JADX INFO: renamed from: E */
    public ByteBuffer f38341E;

    /* JADX INFO: renamed from: F */
    public int f38342F;

    /* JADX INFO: renamed from: G */
    public long f38343G;

    /* JADX INFO: renamed from: H */
    public long f38344H;

    /* JADX INFO: renamed from: I */
    public long f38345I;

    /* JADX INFO: renamed from: J */
    public long f38346J;

    /* JADX INFO: renamed from: K */
    public int f38347K;

    /* JADX INFO: renamed from: L */
    public boolean f38348L;

    /* JADX INFO: renamed from: M */
    public boolean f38349M;

    /* JADX INFO: renamed from: N */
    public long f38350N;

    /* JADX INFO: renamed from: O */
    public float f38351O;

    /* JADX INFO: renamed from: P */
    public ByteBuffer f38352P;

    /* JADX INFO: renamed from: Q */
    public int f38353Q;

    /* JADX INFO: renamed from: R */
    public ByteBuffer f38354R;

    /* JADX INFO: renamed from: S */
    public boolean f38355S;

    /* JADX INFO: renamed from: T */
    public boolean f38356T;

    /* JADX INFO: renamed from: U */
    public boolean f38357U;

    /* JADX INFO: renamed from: V */
    public boolean f38358V;

    /* JADX INFO: renamed from: W */
    public boolean f38359W;

    /* JADX INFO: renamed from: X */
    public int f38360X;

    /* JADX INFO: renamed from: Y */
    public C34588e f38361Y;

    /* JADX INFO: renamed from: Z */
    public C31624i f38362Z;

    /* JADX INFO: renamed from: a */
    public final Context f38363a;

    /* JADX INFO: renamed from: a0 */
    public boolean f38364a0;

    /* JADX INFO: renamed from: b */
    public final C0352d f38365b;

    /* JADX INFO: renamed from: b0 */
    public long f38366b0;

    /* JADX INFO: renamed from: c */
    public final C11797n f38367c;

    /* JADX INFO: renamed from: c0 */
    public long f38368c0;

    /* JADX INFO: renamed from: d */
    public final C11788e0 f38369d;

    /* JADX INFO: renamed from: d0 */
    public boolean f38370d0;

    /* JADX INFO: renamed from: e */
    public final C41060w0 f38371e;

    /* JADX INFO: renamed from: e0 */
    public boolean f38372e0;

    /* JADX INFO: renamed from: f */
    public final C41060w0 f38373f;

    /* JADX INFO: renamed from: f0 */
    public Looper f38374f0;

    /* JADX INFO: renamed from: g */
    public final C11796m f38375g;

    /* JADX INFO: renamed from: g0 */
    public long f38376g0;

    /* JADX INFO: renamed from: h */
    public final ArrayDeque f38377h;

    /* JADX INFO: renamed from: h0 */
    public long f38378h0;

    /* JADX INFO: renamed from: i */
    public final boolean f38379i;

    /* JADX INFO: renamed from: i0 */
    public Handler f38380i0;

    /* JADX INFO: renamed from: j */
    public int f38381j;

    /* JADX INFO: renamed from: k */
    public C11806w f38382k;

    /* JADX INFO: renamed from: l */
    public final C11803t f38383l;

    /* JADX INFO: renamed from: m */
    public final C11803t f38384m;

    /* JADX INFO: renamed from: n */
    public final C11808y f38385n;

    /* JADX INFO: renamed from: o */
    public final C30352d f38386o;

    /* JADX INFO: renamed from: p */
    public final C11809z f38387p;

    /* JADX INFO: renamed from: q */
    public C4323n f38388q;

    /* JADX INFO: renamed from: r */
    public C31624i f38389r;

    /* JADX INFO: renamed from: s */
    public C11800q f38390s;

    /* JADX INFO: renamed from: t */
    public C11800q f38391t;

    /* JADX INFO: renamed from: u */
    public C35786c f38392u;

    /* JADX INFO: renamed from: v */
    public AudioTrack f38393v;

    /* JADX INFO: renamed from: w */
    public C11781b f38394w;

    /* JADX INFO: renamed from: x */
    public C11535h f38395x;

    /* JADX INFO: renamed from: y */
    public C0352d f38396y;

    /* JADX INFO: renamed from: z */
    public C34586d f38397z;

    public C11807x(C11799p c11799p) {
        Context context = (Context) c11799p.f38301b;
        this.f38363a = context;
        this.f38397z = C34586d.f145642c;
        this.f38394w = context != null ? null : (C11781b) c11799p.f38302c;
        this.f38365b = (C0352d) c11799p.f38303d;
        int i13 = AbstractC38065t.f163031a;
        this.f38379i = false;
        this.f38381j = 0;
        this.f38385n = (C11808y) c11799p.f38304e;
        C30352d c30352d = (C30352d) c11799p.f38306g;
        c30352d.getClass();
        this.f38386o = c30352d;
        this.f38375g = new C11796m(new C31624i(this, 25));
        C11797n c11797n = new C11797n();
        this.f38367c = c11797n;
        C11788e0 c11788e0 = new C11788e0();
        c11788e0.f38227m = AbstractC38065t.f163033c;
        this.f38369d = c11788e0;
        C35792i c35792i = new C35792i();
        C41017e0 c41017e0 = AbstractC41023g0.f176998x;
        Object[] objArr = {c35792i, c11797n, c11788e0};
        AbstractC41047q.m133272b(3, objArr);
        this.f38371e = AbstractC41023g0.m133250j(3, objArr);
        Object[] objArr2 = {new C11786d0(), c11797n, c11788e0};
        AbstractC41047q.m133272b(3, objArr2);
        this.f38373f = AbstractC41023g0.m133250j(3, objArr2);
        this.f38351O = 1.0f;
        this.f38360X = 0;
        this.f38361Y = new C34588e();
        C34589e0 c34589e0 = C34589e0.f145647d;
        this.f38338B = new C11801r(c34589e0, 0L, 0L);
        this.f38339C = c34589e0;
        this.f38340D = false;
        this.f38377h = new ArrayDeque();
        this.f38383l = new C11803t();
        this.f38384m = new C11803t();
        this.f38387p = (C11809z) c11799p.f38305f;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m31629p(AudioTrack audioTrack) {
        return AbstractC38065t.f163031a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004f  */
    /* JADX INFO: renamed from: a */
    public final void m31630a(long j7) {
        C34589e0 c34589e0;
        boolean zM31653y = m31653y();
        boolean z4 = false;
        C0352d c0352d = this.f38365b;
        if (zM31653y) {
            c34589e0 = C34589e0.f145647d;
        } else {
            if (this.f38364a0) {
                c34589e0 = C34589e0.f145647d;
            } else {
                C11800q c11800q = this.f38391t;
                if (c11800q.f38309c == 0) {
                    int i13 = c11800q.f38307a.f145761F;
                    c34589e0 = this.f38339C;
                    C35791h c35791h = (C35791h) c0352d.f1239z;
                    float f13 = c34589e0.f145648a;
                    c35791h.getClass();
                    AbstractC35849g.m113802d(f13 > 0.0f);
                    if (c35791h.f152230c != f13) {
                        c35791h.f152230c = f13;
                        c35791h.f152236i = true;
                    }
                    float f14 = c34589e0.f145649b;
                    AbstractC35849g.m113802d(f14 > 0.0f);
                    if (c35791h.f152231d != f14) {
                        c35791h.f152231d = f14;
                        c35791h.f152236i = true;
                    }
                } else {
                    c34589e0 = C34589e0.f145647d;
                }
            }
            this.f38339C = c34589e0;
        }
        C34589e0 c34589e1 = c34589e0;
        if (!this.f38364a0) {
            C11800q c11800q2 = this.f38391t;
            if (c11800q2.f38309c == 0) {
                int i14 = c11800q2.f38307a.f145761F;
                z4 = this.f38340D;
                ((C11784c0) c0352d.f1238y).f38209o = z4;
            }
        }
        this.f38340D = z4;
        this.f38377h.add(new C11801r(c34589e1, Math.max(0L, j7), AbstractC38065t.m121901O(this.f38391t.f38311e, m31640k())));
        C35786c c35786c = this.f38391t.f38315i;
        this.f38392u = c35786c;
        c35786c.m113432a();
        C31624i c31624i = this.f38389r;
        if (c31624i != null) {
            boolean z13 = this.f38340D;
            C20378c c20378c = ((C11780a0) c31624i.f130665x).f38178d1;
            Handler handler = (Handler) c20378c.f76422x;
            if (handler != null) {
                handler.post(new RunnableC11792i(c20378c, z13, 0));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final AudioTrack m31631b(C11793j c11793j, C34586d c34586d, int i13, C34610p c34610p) throws AudioSink$InitializationException {
        try {
            AudioTrack audioTrackM31656a = this.f38387p.m31656a(c11793j, c34586d, i13);
            int state = audioTrackM31656a.getState();
            if (state == 1) {
                return audioTrackM31656a;
            }
            try {
                audioTrackM31656a.release();
            } catch (Exception unused) {
            }
            throw new AudioSink$InitializationException(state, c11793j.f38244c, c11793j.f38246e, c11793j.f38243b, c34610p, c11793j.f38245d, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e5) {
            throw new AudioSink$InitializationException(0, c11793j.f38244c, c11793j.f38246e, c11793j.f38243b, c34610p, c11793j.f38245d, e5);
        }
    }

    /* JADX INFO: renamed from: c */
    public final AudioTrack m31632c(C11800q c11800q) throws AudioSink$InitializationException {
        try {
            return m31631b(c11800q.m31626a(), this.f38397z, this.f38360X, c11800q.f38307a);
        } catch (AudioSink$InitializationException e5) {
            C31624i c31624i = this.f38389r;
            if (c31624i != null) {
                c31624i.m97716x(e5);
            }
            throw e5;
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r10v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v6 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v6 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r19v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r19v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r19v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r23v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r23v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v1 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    /* JADX INFO: renamed from: d */
    public final void m31633d(p516u8.C34610p r28, int[] r29) {
        /*
            Method dump skipped, instruction units count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p085d9.C11807x.m31633d(u8.p, int[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b6  */
    /* JADX INFO: renamed from: e */
    public final void m31634e(long j7) throws Exception {
        int iWrite;
        C31624i c31624i;
        C2836h0 c2836h0;
        boolean z4;
        C11803t c11803t = this.f38384m;
        if (this.f38354R == null) {
            return;
        }
        boolean z13 = false;
        if (((Exception) c11803t.f38326c) != null) {
            synchronized (f38334j0) {
                z4 = f38336l0 > 0;
            }
            if (z4 || SystemClock.elapsedRealtime() < c11803t.f38325b) {
                return;
            }
        }
        int iRemaining = this.f38354R.remaining();
        if (this.f38364a0) {
            AbstractC35849g.m113807i(j7 != -9223372036854775807L);
            if (j7 == Long.MIN_VALUE) {
                j7 = this.f38366b0;
            } else {
                this.f38366b0 = j7;
            }
            AudioTrack audioTrack = this.f38393v;
            ByteBuffer byteBuffer = this.f38354R;
            if (AbstractC38065t.f163031a >= 26) {
                iWrite = audioTrack.write(byteBuffer, iRemaining, 1, 1000 * j7);
            } else {
                if (this.f38341E == null) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                    this.f38341E = byteBufferAllocate;
                    byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                    this.f38341E.putInt(1431633921);
                }
                if (this.f38342F == 0) {
                    this.f38341E.putInt(4, iRemaining);
                    this.f38341E.putLong(8, j7 * 1000);
                    this.f38341E.position(0);
                    this.f38342F = iRemaining;
                }
                int iRemaining2 = this.f38341E.remaining();
                if (iRemaining2 <= 0) {
                    iWrite = audioTrack.write(byteBuffer, iRemaining, 1);
                    if (iWrite < 0) {
                        this.f38342F = 0;
                    } else {
                        this.f38342F -= iWrite;
                    }
                } else {
                    int iWrite2 = audioTrack.write(this.f38341E, iRemaining2, 1);
                    if (iWrite2 < 0) {
                        this.f38342F = 0;
                        iWrite = iWrite2;
                    } else if (iWrite2 < iRemaining2) {
                        iWrite = 0;
                    } else {
                        iWrite = audioTrack.write(byteBuffer, iRemaining, 1);
                        if (iWrite < 0) {
                            this.f38342F = 0;
                        } else {
                            this.f38342F -= iWrite;
                        }
                    }
                }
            }
        } else {
            iWrite = this.f38393v.write(this.f38354R, iRemaining, 1);
        }
        this.f38368c0 = SystemClock.elapsedRealtime();
        if (iWrite < 0) {
            if ((AbstractC38065t.f163031a >= 24 && iWrite == -6) || iWrite == -32) {
                if (m31640k() > 0) {
                    z13 = true;
                } else if (m31629p(this.f38393v)) {
                    if (this.f38391t.f38309c == 1) {
                        this.f38370d0 = true;
                    }
                    z13 = true;
                }
            }
            AudioSink$WriteException audioSink$WriteException = new AudioSink$WriteException(iWrite, this.f38391t.f38307a, z13);
            C31624i c31624i2 = this.f38389r;
            if (c31624i2 != null) {
                c31624i2.m97716x(audioSink$WriteException);
            }
            if (!audioSink$WriteException.f6382x || this.f38363a == null) {
                c11803t.m31627a(audioSink$WriteException);
                return;
            } else {
                this.f38394w = C11781b.f38191c;
                throw audioSink$WriteException;
            }
        }
        c11803t.f38326c = null;
        c11803t.f38324a = -9223372036854775807L;
        c11803t.f38325b = -9223372036854775807L;
        if (m31629p(this.f38393v)) {
            if (this.f38346J > 0) {
                this.f38372e0 = false;
            }
            if (this.f38358V && (c31624i = this.f38389r) != null && iWrite < iRemaining && !this.f38372e0 && (c2836h0 = ((C11780a0) c31624i.f130665x).f71004f0) != null) {
                c2836h0.f11188a.f11292m0 = true;
            }
        }
        int i13 = this.f38391t.f38309c;
        if (i13 == 0) {
            this.f38345I += (long) iWrite;
        }
        if (iWrite == iRemaining) {
            if (i13 != 0) {
                AbstractC35849g.m113807i(this.f38354R == this.f38352P);
                this.f38346J = (((long) this.f38347K) * ((long) this.f38353Q)) + this.f38346J;
            }
            this.f38354R = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0044 A[RETURN] */
    /* JADX INFO: renamed from: f */
    public final boolean m31635f() throws Exception {
        ByteBuffer byteBuffer;
        if (!this.f38392u.m113435d()) {
            m31634e(Long.MIN_VALUE);
            if (this.f38354R == null) {
                return true;
            }
            return false;
        }
        C35786c c35786c = this.f38392u;
        if (c35786c.m113435d() && !c35786c.f152192d) {
            c35786c.f152192d = true;
            ((InterfaceC35788e) c35786c.f152190b.get(0)).mo113437c();
        }
        m31648t(Long.MIN_VALUE);
        if (!this.f38392u.m113434c() || ((byteBuffer = this.f38354R) != null && byteBuffer.hasRemaining())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m31636g() {
        C0352d c0352d;
        if (m31644o()) {
            this.f38343G = 0L;
            this.f38344H = 0L;
            this.f38345I = 0L;
            this.f38346J = 0L;
            this.f38372e0 = false;
            this.f38347K = 0;
            this.f38338B = new C11801r(this.f38339C, 0L, 0L);
            this.f38350N = 0L;
            this.f38337A = null;
            this.f38377h.clear();
            this.f38352P = null;
            this.f38353Q = 0;
            this.f38354R = null;
            this.f38356T = false;
            this.f38355S = false;
            this.f38357U = false;
            this.f38341E = null;
            this.f38342F = 0;
            this.f38369d.f38229o = 0L;
            C35786c c35786c = this.f38391t.f38315i;
            this.f38392u = c35786c;
            c35786c.m113432a();
            AudioTrack audioTrack = this.f38375g.f38273c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f38393v.pause();
            }
            if (m31629p(this.f38393v)) {
                C11806w c11806w = this.f38382k;
                c11806w.getClass();
                c11806w.m31628a(this.f38393v);
            }
            C11793j c11793jM31626a = this.f38391t.m31626a();
            C11800q c11800q = this.f38390s;
            if (c11800q != null) {
                this.f38391t = c11800q;
                this.f38390s = null;
            }
            C11796m c11796m = this.f38375g;
            c11796m.m31616e();
            c11796m.f38273c = null;
            c11796m.f38275e = null;
            if (AbstractC38065t.f163031a >= 24 && (c0352d = this.f38396y) != null) {
                AudioTrack audioTrack2 = (AudioTrack) c0352d.f1237x;
                C11802s c11802s = (C11802s) c0352d.f1239z;
                c11802s.getClass();
                audioTrack2.removeOnRoutingChangedListener(c11802s);
                c0352d.f1239z = null;
                this.f38396y = null;
            }
            AudioTrack audioTrack3 = this.f38393v;
            C31624i c31624i = this.f38389r;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (f38334j0) {
                try {
                    if (f38335k0 == null) {
                        f38335k0 = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC3934a(3));
                    }
                    f38336l0++;
                    f38335k0.schedule(new RunnableC3666a(audioTrack3, c31624i, handler, c11793jM31626a, 2), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            this.f38393v = null;
        }
        C11803t c11803t = this.f38384m;
        c11803t.f38326c = null;
        c11803t.f38324a = -9223372036854775807L;
        c11803t.f38325b = -9223372036854775807L;
        C11803t c11803t2 = this.f38383l;
        c11803t2.f38326c = null;
        c11803t2.f38324a = -9223372036854775807L;
        c11803t2.f38325b = -9223372036854775807L;
        this.f38376g0 = 0L;
        this.f38378h0 = 0L;
        Handler handler2 = this.f38380i0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: h */
    public final C11790g m31637h(C34610p c34610p) {
        boolean zBooleanValue;
        if (this.f38370d0) {
            return C11790g.f38233d;
        }
        C34586d c34586d = this.f38397z;
        C30352d c30352d = this.f38386o;
        c30352d.getClass();
        c34610p.getClass();
        int i13 = c34610p.f145760E;
        c34586d.getClass();
        int i14 = AbstractC38065t.f163031a;
        if (i14 < 29 || i13 == -1) {
            return C11790g.f38233d;
        }
        Context context = (Context) c30352d.f124535x;
        Boolean bool = (Boolean) c30352d.f124536y;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = AbstractC35785b.m113423r(context).getParameters("offloadVariableRateSupported");
                c30352d.f124536y = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                c30352d.f124536y = Boolean.FALSE;
            }
            zBooleanValue = ((Boolean) c30352d.f124536y).booleanValue();
        }
        String str = c34610p.f145783n;
        str.getClass();
        int iM109371d = AbstractC34587d0.m109371d(str, c34610p.f145780k);
        if (iM109371d == 0 || i14 < AbstractC38065t.m121922o(iM109371d)) {
            return C11790g.f38233d;
        }
        int iM121924q = AbstractC38065t.m121924q(c34610p.f145759D);
        if (iM121924q == 0) {
            return C11790g.f38233d;
        }
        try {
            AudioFormat audioFormatM121923p = AbstractC38065t.m121923p(i13, iM121924q, iM109371d);
            return i14 >= 31 ? AbstractC11480b.m30885k(audioFormatM121923p, (AudioAttributes) c34586d.m109367a().f143660x, zBooleanValue) : AbstractC0354a.m980t(audioFormatM121923p, (AudioAttributes) c34586d.m109367a().f143660x, zBooleanValue);
        } catch (IllegalArgumentException unused) {
            return C11790g.f38233d;
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m31638i(C34610p c34610p) {
        m31645q();
        String str = c34610p.f145783n;
        int i13 = c34610p.f145761F;
        if ("audio/raw".equals(str)) {
            if (!AbstractC38065t.m121893G(i13)) {
                AbstractC38963t7.m124388r(i13, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            }
            if (i13 != 2) {
                return 1;
            }
        } else if (this.f38394w.m31594d(this.f38397z, c34610p) == null) {
            return 0;
        }
        return 2;
    }

    /* JADX INFO: renamed from: j */
    public final long m31639j() {
        C11800q c11800q = this.f38391t;
        return c11800q.f38309c == 0 ? this.f38343G / ((long) c11800q.f38308b) : this.f38344H;
    }

    /* JADX INFO: renamed from: k */
    public final long m31640k() {
        C11800q c11800q = this.f38391t;
        if (c11800q.f38309c != 0) {
            return this.f38346J;
        }
        long j7 = this.f38345I;
        long j13 = c11800q.f38310d;
        int i13 = AbstractC38065t.f163031a;
        return ((j7 + j13) - 1) / j13;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x018f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0194  */
    /* JADX WARN: Code duplicated, block: B:104:0x0199  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:108:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:114:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f1 A[LOOP:0: B:110:0x01d2->B:118:0x01f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:121:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:122:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:124:0x020f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0211  */
    /* JADX WARN: Code duplicated, block: B:128:0x0219  */
    /* JADX WARN: Code duplicated, block: B:129:0x021c  */
    /* JADX WARN: Code duplicated, block: B:131:0x022f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0233  */
    /* JADX WARN: Code duplicated, block: B:135:0x0244  */
    /* JADX WARN: Code duplicated, block: B:138:0x024e  */
    /* JADX WARN: Code duplicated, block: B:140:0x0253  */
    /* JADX WARN: Code duplicated, block: B:160:0x0281  */
    /* JADX WARN: Code duplicated, block: B:161:0x0284  */
    /* JADX WARN: Code duplicated, block: B:163:0x028a  */
    /* JADX WARN: Code duplicated, block: B:164:0x028c  */
    /* JADX WARN: Code duplicated, block: B:166:0x029a  */
    /* JADX WARN: Code duplicated, block: B:169:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:171:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:174:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:193:0x0341  */
    /* JADX WARN: Code duplicated, block: B:195:0x0348  */
    /* JADX WARN: Code duplicated, block: B:196:0x034a  */
    /* JADX WARN: Code duplicated, block: B:198:0x0356 A[LOOP:1: B:197:0x0354->B:198:0x0356, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:201:0x0369 A[LOOP:2: B:200:0x0367->B:201:0x0369, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:205:0x038a  */
    /* JADX WARN: Code duplicated, block: B:206:0x0390  */
    /* JADX WARN: Code duplicated, block: B:213:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:216:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:217:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:219:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:223:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:227:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:230:0x0406  */
    /* JADX WARN: Code duplicated, block: B:232:0x0417  */
    /* JADX WARN: Code duplicated, block: B:237:0x0427  */
    /* JADX WARN: Code duplicated, block: B:238:0x0432  */
    /* JADX WARN: Code duplicated, block: B:240:0x0440  */
    /* JADX WARN: Code duplicated, block: B:242:0x044b  */
    /* JADX WARN: Code duplicated, block: B:244:0x0452  */
    /* JADX WARN: Code duplicated, block: B:246:0x045c  */
    /* JADX WARN: Code duplicated, block: B:250:0x0472  */
    /* JADX WARN: Code duplicated, block: B:253:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:67:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x010b  */
    /* JADX WARN: Code duplicated, block: B:70:0x010e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0110  */
    /* JADX WARN: Code duplicated, block: B:76:0x0124 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x013a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0152  */
    /* JADX WARN: Code duplicated, block: B:85:0x0162  */
    /* JADX WARN: Code duplicated, block: B:87:0x016a  */
    /* JADX WARN: Code duplicated, block: B:88:0x016c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0178  */
    /* JADX WARN: Code duplicated, block: B:94:0x017e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0189  */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03a0, code lost:
    
        if (r13 == 0) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0116, code lost:
    
        if (r9.m31613b() == 0) goto L12;
     */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m31641l(java.nio.ByteBuffer r28, long r29, int r31) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p085d9.C11807x.m31641l(java.nio.ByteBuffer, long, int):boolean");
    }

    /* JADX INFO: renamed from: m */
    public final boolean m31642m() {
        if (m31644o()) {
            return !(AbstractC38065t.f163031a >= 29 && this.f38393v.isOffloadedPlayback() && this.f38357U) && this.f38375g.m31615d(m31640k());
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x018c  */
    /* JADX WARN: Code duplicated, block: B:89:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: n */
    public final boolean m31643n() throws AudioSink$InitializationException {
        AudioTrack audioTrackM31632c;
        C11535h c11535h;
        C4323n c4323n;
        boolean z4;
        C11803t c11803t = this.f38383l;
        if (((Exception) c11803t.f38326c) != null) {
            synchronized (f38334j0) {
                z4 = f38336l0 > 0;
            }
            if (z4 || SystemClock.elapsedRealtime() < c11803t.f38325b) {
                return false;
            }
        }
        try {
            C11800q c11800q = this.f38391t;
            c11800q.getClass();
            audioTrackM31632c = m31632c(c11800q);
        } catch (AudioSink$InitializationException e5) {
            C11800q c11800q2 = this.f38391t;
            if (c11800q2.f38314h > 1000000) {
                C11800q c11800q3 = new C11800q(c11800q2.f38307a, c11800q2.f38308b, c11800q2.f38309c, c11800q2.f38310d, c11800q2.f38311e, c11800q2.f38312f, c11800q2.f38313g, DurationKt.NANOS_IN_MILLIS, c11800q2.f38315i, c11800q2.f38316j, c11800q2.f38317k, c11800q2.f38318l);
                try {
                    audioTrackM31632c = m31632c(c11800q3);
                    this.f38391t = c11800q3;
                } catch (AudioSink$InitializationException e13) {
                    e5.addSuppressed(e13);
                    if (this.f38391t.f38309c == 1) {
                        throw e5;
                    }
                    this.f38370d0 = true;
                    throw e5;
                }
            }
            if (this.f38391t.f38309c == 1) {
                throw e5;
            }
            this.f38370d0 = true;
            throw e5;
        }
        this.f38393v = audioTrackM31632c;
        if (m31629p(audioTrackM31632c)) {
            AudioTrack audioTrack = this.f38393v;
            if (this.f38382k == null) {
                this.f38382k = new C11806w(this);
            }
            C11806w c11806w = this.f38382k;
            Handler handler = c11806w.f38331b;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new ExecutorC11804u(handler), (C11805v) c11806w.f38332c);
            C11800q c11800q4 = this.f38391t;
            if (c11800q4.f38317k) {
                AudioTrack audioTrack2 = this.f38393v;
                C34610p c34610p = c11800q4.f38307a;
                audioTrack2.setOffloadDelayPadding(c34610p.f145762G, c34610p.f145763H);
            }
        }
        int i13 = AbstractC38065t.f163031a;
        if (i13 >= 31 && (c4323n = this.f38388q) != null) {
            AbstractC11480b.m30891q(this.f38393v, c4323n);
        }
        this.f38360X = this.f38393v.getAudioSessionId();
        C11796m c11796m = this.f38375g;
        AudioTrack audioTrack3 = this.f38393v;
        C11800q c11800q5 = this.f38391t;
        boolean z13 = c11800q5.f38309c == 2;
        int i14 = c11800q5.f38313g;
        int i15 = c11800q5.f38310d;
        int i16 = c11800q5.f38314h;
        c11796m.f38273c = audioTrack3;
        c11796m.f38274d = i16;
        c11796m.f38275e = new C11795l(audioTrack3, 0);
        c11796m.f38276f = audioTrack3.getSampleRate();
        c11796m.f38277g = z13 && i13 < 23 && (i14 == 5 || i14 == 6);
        boolean zM121893G = AbstractC38065t.m121893G(i14);
        c11796m.f38286p = zM121893G;
        c11796m.f38278h = zM121893G ? AbstractC38065t.m121901O(c11796m.f38276f, i16 / i15) : -9223372036854775807L;
        c11796m.f38289s = 0L;
        c11796m.f38290t = 0L;
        c11796m.f38268G = false;
        c11796m.f38269H = 0L;
        c11796m.f38291u = 0L;
        c11796m.f38285o = false;
        c11796m.f38294x = -9223372036854775807L;
        c11796m.f38295y = -9223372036854775807L;
        c11796m.f38287q = 0L;
        c11796m.f38284n = 0L;
        c11796m.f38279i = 1.0f;
        if (m31644o()) {
            this.f38393v.setVolume(this.f38351O);
        }
        this.f38361Y.getClass();
        C31624i c31624i = this.f38362Z;
        if (c31624i != null && i13 >= 23) {
            this.f38393v.setPreferredDevice((AudioDeviceInfo) c31624i.f130665x);
            C11535h c11535h2 = this.f38395x;
            if (c11535h2 != null) {
                c11535h2.m30993c((AudioDeviceInfo) this.f38362Z.f130665x);
            }
        }
        if (i13 >= 24 && (c11535h = this.f38395x) != null) {
            this.f38396y = new C0352d(this.f38393v, c11535h);
        }
        this.f38349M = true;
        C31624i c31624i2 = this.f38389r;
        if (c31624i2 != null) {
            C11793j c11793jM31626a = this.f38391t.m31626a();
            C20378c c20378c = ((C11780a0) c31624i2.f130665x).f38178d1;
            Handler handler2 = (Handler) c20378c.f76422x;
            if (handler2 != null) {
                handler2.post(new RunnableC11791h(c20378c, c11793jM31626a, 7));
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m31644o() {
        return this.f38393v != null;
    }

    /* JADX INFO: renamed from: q */
    public final void m31645q() {
        Context context;
        C11781b c11781bM31592b;
        C11783c c11783c;
        if (this.f38395x == null && (context = this.f38363a) != null) {
            this.f38374f0 = Looper.myLooper();
            C11535h c11535h = new C11535h(context, new C0680g0(this, 26), this.f38397z, this.f38362Z);
            this.f38395x = c11535h;
            Handler handler = (Handler) c11535h.f37187d;
            Context context2 = (Context) c11535h.f37185b;
            if (c11535h.f37184a) {
                c11781bM31592b = (C11781b) c11535h.f37191h;
                c11781bM31592b.getClass();
            } else {
                c11535h.f37184a = true;
                C11785d c11785d = (C11785d) c11535h.f37190g;
                if (c11785d != null) {
                    c11785d.f38217a.registerContentObserver(c11785d.f38218b, false, c11785d);
                }
                if (AbstractC38065t.f163031a >= 23 && (c11783c = (C11783c) c11535h.f37188e) != null) {
                    AbstractC35785b.m113423r(context2).registerAudioDeviceCallback(c11783c, handler);
                }
                c11781bM31592b = C11781b.m31592b(context2, context2.registerReceiver((C11787e) c11535h.f37189f, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (C34586d) c11535h.f37193j, (C31624i) c11535h.f37192i);
                c11535h.f37191h = c11781bM31592b;
            }
            this.f38394w = c11781bM31592b;
        }
        this.f38394w.getClass();
    }

    /* JADX INFO: renamed from: r */
    public final void m31646r() {
        this.f38358V = true;
        if (m31644o()) {
            C11796m c11796m = this.f38375g;
            if (c11796m.f38294x != -9223372036854775807L) {
                c11796m.f38270I.getClass();
                c11796m.f38294x = AbstractC38065t.m121896J(SystemClock.elapsedRealtime());
            }
            C11795l c11795l = c11796m.f38275e;
            c11795l.getClass();
            c11795l.m31610a();
            this.f38393v.play();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m31647s() {
        if (this.f38356T) {
            return;
        }
        this.f38356T = true;
        long jM31640k = m31640k();
        C11796m c11796m = this.f38375g;
        c11796m.f38296z = c11796m.m31613b();
        c11796m.f38270I.getClass();
        c11796m.f38294x = AbstractC38065t.m121896J(SystemClock.elapsedRealtime());
        c11796m.f38262A = jM31640k;
        if (m31629p(this.f38393v)) {
            this.f38357U = false;
        }
        this.f38393v.stop();
        this.f38342F = 0;
    }

    /* JADX INFO: renamed from: t */
    public final void m31648t(long j7) throws Exception {
        ByteBuffer byteBuffer;
        m31634e(j7);
        if (this.f38354R != null) {
            return;
        }
        if (!this.f38392u.m113435d()) {
            ByteBuffer byteBuffer2 = this.f38352P;
            if (byteBuffer2 != null) {
                m31652x(byteBuffer2);
                m31634e(j7);
                return;
            }
            return;
        }
        while (!this.f38392u.m113434c()) {
            do {
                C35786c c35786c = this.f38392u;
                if (c35786c.m113435d()) {
                    ByteBuffer byteBuffer3 = c35786c.f152191c[c35786c.m113433b()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        c35786c.m113436e(InterfaceC35788e.f152198a);
                        byteBuffer = c35786c.f152191c[c35786c.m113433b()];
                    }
                } else {
                    byteBuffer = InterfaceC35788e.f152198a;
                }
                if (byteBuffer.hasRemaining()) {
                    m31652x(byteBuffer);
                    m31634e(j7);
                } else {
                    ByteBuffer byteBuffer4 = this.f38352P;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    C35786c c35786c2 = this.f38392u;
                    ByteBuffer byteBuffer5 = this.f38352P;
                    if (c35786c2.m113435d() && !c35786c2.f152192d) {
                        c35786c2.m113436e(byteBuffer5);
                    }
                }
            } while (this.f38354R == null);
            return;
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m31649u() {
        m31636g();
        C41017e0 c41017e0ListIterator = this.f38371e.listIterator(0);
        while (c41017e0ListIterator.hasNext()) {
            ((InterfaceC35788e) c41017e0ListIterator.next()).reset();
        }
        C41017e0 c41017e0ListIterator2 = this.f38373f.listIterator(0);
        while (c41017e0ListIterator2.hasNext()) {
            ((InterfaceC35788e) c41017e0ListIterator2.next()).reset();
        }
        C35786c c35786c = this.f38392u;
        if (c35786c != null) {
            AbstractC41023g0 abstractC41023g0 = c35786c.f152189a;
            for (int i13 = 0; i13 < abstractC41023g0.size(); i13++) {
                InterfaceC35788e interfaceC35788e = (InterfaceC35788e) abstractC41023g0.get(i13);
                interfaceC35788e.flush();
                interfaceC35788e.reset();
            }
            c35786c.f152191c = new ByteBuffer[0];
            C35787d c35787d = C35787d.f152193e;
            c35786c.f152192d = false;
        }
        this.f38358V = false;
        this.f38370d0 = false;
    }

    /* JADX INFO: renamed from: v */
    public final void m31650v() {
        if (m31644o()) {
            try {
                this.f38393v.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f38339C.f145648a).setPitch(this.f38339C.f145649b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e5) {
                AbstractC38046a.m121827v("DefaultAudioSink", "Failed to set playback params", e5);
            }
            C34589e0 c34589e0 = new C34589e0(this.f38393v.getPlaybackParams().getSpeed(), this.f38393v.getPlaybackParams().getPitch());
            this.f38339C = c34589e0;
            float f13 = c34589e0.f145648a;
            C11796m c11796m = this.f38375g;
            c11796m.f38279i = f13;
            C11795l c11795l = c11796m.f38275e;
            if (c11795l != null) {
                c11795l.m31610a();
            }
            c11796m.m31616e();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m31651w(int i13, int i14) {
        C11800q c11800q;
        AudioTrack audioTrack = this.f38393v;
        if (audioTrack == null || !m31629p(audioTrack) || (c11800q = this.f38391t) == null || !c11800q.f38317k) {
            return;
        }
        this.f38393v.setOffloadDelayPadding(i13, i14);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    /* JADX WARN: Code duplicated, block: B:47:0x0141  */
    /* JADX WARN: Code duplicated, block: B:49:0x0144  */
    /* JADX WARN: Code duplicated, block: B:51:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0149  */
    /* JADX WARN: Code duplicated, block: B:54:0x014d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0151  */
    /* JADX WARN: Code duplicated, block: B:58:0x0155  */
    /* JADX WARN: Code duplicated, block: B:60:0x0159  */
    /* JADX WARN: Code duplicated, block: B:63:0x0177  */
    /* JADX WARN: Code duplicated, block: B:64:0x018a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0197  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0057 A[SYNTHETIC] */
    /* JADX INFO: renamed from: x */
    public final void m31652x(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferOrder;
        int i13;
        byte b;
        int i14;
        int i15;
        int i16;
        AbstractC35849g.m113807i(this.f38354R == null);
        if (byteBuffer.hasRemaining()) {
            if (this.f38391t.f38309c != 0) {
                byteBufferOrder = byteBuffer;
            } else {
                int iM121903Q = (int) AbstractC38065t.m121903Q(AbstractC38065t.m121896J(20L), this.f38391t.f38311e, 1000000L, RoundingMode.UP);
                long jM31640k = m31640k();
                long j7 = iM121903Q;
                if (jM31640k >= j7) {
                    byteBufferOrder = byteBuffer;
                } else {
                    C11800q c11800q = this.f38391t;
                    int i17 = c11800q.f38313g;
                    int i18 = c11800q.f38310d;
                    int i19 = (int) jM31640k;
                    byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i19 < iM121903Q) {
                        if (i17 != 2) {
                            if (i17 == 3) {
                                i15 = (byteBuffer.get() & 255) << 24;
                            } else if (i17 == 4) {
                                float fM121913f = AbstractC38065t.m121913f(byteBuffer.getFloat(), -1.0f, 1.0f);
                                i15 = (int) (fM121913f < 0.0f ? (-fM121913f) * (-2.1474836E9f) : fM121913f * 2.1474836E9f);
                            } else if (i17 != 21) {
                                if (i17 == 22) {
                                    i13 = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                    b = byteBuffer.get();
                                } else if (i17 == 268435456) {
                                    i13 = (byteBuffer.get() & 255) << 24;
                                    i14 = (byteBuffer.get() & 255) << 16;
                                } else if (i17 == 1342177280) {
                                    i13 = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
                                    i14 = (byteBuffer.get() & 255) << 8;
                                } else {
                                    if (i17 != 1610612736) {
                                        throw new IllegalStateException();
                                    }
                                    i13 = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
                                    i14 = byteBuffer.get() & 255;
                                }
                                i15 = i13 | i14;
                            } else {
                                i13 = ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b = byteBuffer.get();
                            }
                            i16 = (int) ((((long) i15) * ((long) i19)) / j7);
                            if (i17 != 2) {
                                byteBufferOrder.put((byte) (i16 >> 16));
                                byteBufferOrder.put((byte) (i16 >> 24));
                            } else if (i17 != 3) {
                                byteBufferOrder.put((byte) (i16 >> 24));
                            } else if (i17 != 4) {
                                if (i17 != 21) {
                                    byteBufferOrder.put((byte) (i16 >> 8));
                                    byteBufferOrder.put((byte) (i16 >> 16));
                                    byteBufferOrder.put((byte) (i16 >> 24));
                                } else if (i17 != 22) {
                                    byteBufferOrder.put((byte) i16);
                                    byteBufferOrder.put((byte) (i16 >> 8));
                                    byteBufferOrder.put((byte) (i16 >> 16));
                                    byteBufferOrder.put((byte) (i16 >> 24));
                                } else if (i17 != 268435456) {
                                    byteBufferOrder.put((byte) (i16 >> 24));
                                    byteBufferOrder.put((byte) (i16 >> 16));
                                } else if (i17 != 1342177280) {
                                    byteBufferOrder.put((byte) (i16 >> 24));
                                    byteBufferOrder.put((byte) (i16 >> 16));
                                    byteBufferOrder.put((byte) (i16 >> 8));
                                } else {
                                    if (i17 == 1610612736) {
                                        throw new IllegalStateException();
                                    }
                                    byteBufferOrder.put((byte) (i16 >> 24));
                                    byteBufferOrder.put((byte) (i16 >> 16));
                                    byteBufferOrder.put((byte) (i16 >> 8));
                                    byteBufferOrder.put((byte) i16);
                                }
                            } else if (i16 < 0) {
                                byteBufferOrder.putFloat((-i16) / (-2.1474836E9f));
                            } else {
                                byteBufferOrder.putFloat(i16 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() == iPosition + i18) {
                                i19++;
                                iPosition = byteBuffer.position();
                            }
                        } else {
                            i13 = (byteBuffer.get() & 255) << 16;
                            b = byteBuffer.get();
                        }
                        i14 = (b & 255) << 24;
                        i15 = i13 | i14;
                        i16 = (int) ((((long) i15) * ((long) i19)) / j7);
                        if (i17 != 2) {
                            byteBufferOrder.put((byte) (i16 >> 16));
                            byteBufferOrder.put((byte) (i16 >> 24));
                        } else if (i17 != 3) {
                            byteBufferOrder.put((byte) (i16 >> 24));
                        } else if (i17 != 4) {
                            if (i17 != 21) {
                                byteBufferOrder.put((byte) (i16 >> 8));
                                byteBufferOrder.put((byte) (i16 >> 16));
                                byteBufferOrder.put((byte) (i16 >> 24));
                            } else if (i17 != 22) {
                                byteBufferOrder.put((byte) i16);
                                byteBufferOrder.put((byte) (i16 >> 8));
                                byteBufferOrder.put((byte) (i16 >> 16));
                                byteBufferOrder.put((byte) (i16 >> 24));
                            } else if (i17 != 268435456) {
                                byteBufferOrder.put((byte) (i16 >> 24));
                                byteBufferOrder.put((byte) (i16 >> 16));
                            } else if (i17 != 1342177280) {
                                byteBufferOrder.put((byte) (i16 >> 24));
                                byteBufferOrder.put((byte) (i16 >> 16));
                                byteBufferOrder.put((byte) (i16 >> 8));
                            } else {
                                if (i17 == 1610612736) {
                                    throw new IllegalStateException();
                                }
                                byteBufferOrder.put((byte) (i16 >> 24));
                                byteBufferOrder.put((byte) (i16 >> 16));
                                byteBufferOrder.put((byte) (i16 >> 8));
                                byteBufferOrder.put((byte) i16);
                            }
                        } else if (i16 < 0) {
                            byteBufferOrder.putFloat((-i16) / (-2.1474836E9f));
                        } else {
                            byteBufferOrder.putFloat(i16 / 2.1474836E9f);
                        }
                        if (byteBuffer.position() == iPosition + i18) {
                            i19++;
                            iPosition = byteBuffer.position();
                        }
                    }
                    byteBufferOrder.put(byteBuffer);
                    byteBufferOrder.flip();
                }
            }
            this.f38354R = byteBufferOrder;
        }
    }

    /* JADX INFO: renamed from: y */
    public final boolean m31653y() {
        C11800q c11800q = this.f38391t;
        return c11800q != null && c11800q.f38316j && AbstractC38065t.f163031a >= 23;
    }
}
