package p299l9;

import a00.C0072g;
import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import bb.C2919f;
import com.whoop.service.network.model.UserSessionDto;
import e10.C12554k0;
import ga.C15615b;
import gm.C15990r;
import io.getstream.chat.android.client.ChatClient;
import io.sentry.android.core.RunnableC20151r0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import live.hms.video.error.ErrorCodes;
import p031b9.C2846k1;
import p031b9.C2852m1;
import p031b9.C2856o0;
import p171g9.C15587d;
import p171g9.InterfaceC15591h;
import p249jc.C21567b;
import p284ko.C22631o;
import p361o9.InterfaceC27679s;
import p398p9.C28987k;
import p398p9.HandlerC28984h;
import p398p9.InterfaceC28983g;
import p398p9.InterfaceC28985i;
import p398p9.InterfaceC28986j;
import p418q9.ExecutorC30066a;
import p499t9.C33619a0;
import p499t9.C33625d0;
import p499t9.C33642m;
import p499t9.C33651t;
import p499t9.InterfaceC33627e0;
import p499t9.InterfaceC33639k0;
import p499t9.InterfaceC33644n;
import p499t9.InterfaceC33648q;
import p516u8.AbstractC34587d0;
import p516u8.C34585c0;
import p516u8.C34608o;
import p516u8.C34610p;
import p516u8.C34611p0;
import p516u8.InterfaceC34583b0;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p674z8.C40177m;
import p674z8.InterfaceC40170f;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: l9.s0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23526s0 implements InterfaceC23482a0, InterfaceC33648q, InterfaceC28983g, InterfaceC28986j {

    /* JADX INFO: renamed from: p0 */
    public static final Map f93116p0;

    /* JADX INFO: renamed from: q0 */
    public static final C34610p f93117q0;

    /* JADX INFO: renamed from: E */
    public final C15587d f93118E;

    /* JADX INFO: renamed from: F */
    public final C15587d f93119F;

    /* JADX INFO: renamed from: G */
    public final C23532v0 f93120G;

    /* JADX INFO: renamed from: H */
    public final C22631o f93121H;

    /* JADX INFO: renamed from: I */
    public final long f93122I;

    /* JADX INFO: renamed from: J */
    public final C34610p f93123J;

    /* JADX INFO: renamed from: K */
    public final long f93124K;

    /* JADX INFO: renamed from: L */
    public final C28987k f93125L;

    /* JADX INFO: renamed from: M */
    public final C15990r f93126M;

    /* JADX INFO: renamed from: N */
    public final C2852m1 f93127N;

    /* JADX INFO: renamed from: O */
    public final RunnableC23516n0 f93128O;

    /* JADX INFO: renamed from: P */
    public final RunnableC23516n0 f93129P;

    /* JADX INFO: renamed from: Q */
    public final Handler f93130Q;

    /* JADX INFO: renamed from: R */
    public InterfaceC23539z f93131R;

    /* JADX INFO: renamed from: S */
    public C15615b f93132S;

    /* JADX INFO: renamed from: T */
    public C23538y0[] f93133T;

    /* JADX INFO: renamed from: U */
    public C23524r0[] f93134U;

    /* JADX INFO: renamed from: V */
    public boolean f93135V;

    /* JADX INFO: renamed from: W */
    public boolean f93136W;

    /* JADX INFO: renamed from: X */
    public boolean f93137X;

    /* JADX INFO: renamed from: Y */
    public boolean f93138Y;

    /* JADX INFO: renamed from: Z */
    public C0072g f93139Z;

    /* JADX INFO: renamed from: a0 */
    public InterfaceC33627e0 f93140a0;

    /* JADX INFO: renamed from: b0 */
    public long f93141b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f93142c0;

    /* JADX INFO: renamed from: d0 */
    public int f93143d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f93144e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f93145f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f93146g0;

    /* JADX INFO: renamed from: h0 */
    public int f93147h0;

    /* JADX INFO: renamed from: i0 */
    public boolean f93148i0;

    /* JADX INFO: renamed from: j0 */
    public long f93149j0;

    /* JADX INFO: renamed from: k0 */
    public long f93150k0;

    /* JADX INFO: renamed from: l0 */
    public boolean f93151l0;

    /* JADX INFO: renamed from: m0 */
    public int f93152m0;

    /* JADX INFO: renamed from: n0 */
    public boolean f93153n0;

    /* JADX INFO: renamed from: o0 */
    public boolean f93154o0;

    /* JADX INFO: renamed from: w */
    public final Uri f93155w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC40170f f93156x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC15591h f93157y;

    /* JADX INFO: renamed from: z */
    public final C21567b f93158z;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE);
        f93116p0 = Collections.unmodifiableMap(map);
        C34608o c34608o = new C34608o();
        c34608o.f145729a = "icy";
        c34608o.f145741m = AbstractC34587d0.m109382o("application/x-icy");
        f93117q0 = new C34610p(c34608o);
    }

    public C23526s0(Uri uri, InterfaceC40170f interfaceC40170f, C15990r c15990r, InterfaceC15591h interfaceC15591h, C15587d c15587d, C21567b c21567b, C15587d c15587d2, C23532v0 c23532v0, C22631o c22631o, int i13, C34610p c34610p, long j7, ExecutorC30066a executorC30066a) {
        this.f93155w = uri;
        this.f93156x = interfaceC40170f;
        this.f93157y = interfaceC15591h;
        this.f93119F = c15587d;
        this.f93158z = c21567b;
        this.f93118E = c15587d2;
        this.f93120G = c23532v0;
        this.f93121H = c22631o;
        this.f93122I = i13;
        this.f93123J = c34610p;
        this.f93125L = executorC30066a != null ? new C28987k(executorC30066a) : new C28987k("ProgressiveMediaPeriod");
        this.f93126M = c15990r;
        this.f93124K = j7;
        this.f93127N = new C2852m1(7);
        this.f93128O = new RunnableC23516n0(this, 1);
        this.f93129P = new RunnableC23516n0(this, 2);
        this.f93130Q = AbstractC38065t.m121920m(null);
        this.f93134U = new C23524r0[0];
        this.f93133T = new C23538y0[0];
        this.f93150k0 = -9223372036854775807L;
        this.f93143d0 = 1;
    }

    /* JADX INFO: renamed from: A */
    public final void m68095A(int i13) {
        m68101b();
        C0072g c0072g = this.f93139Z;
        boolean[] zArr = (boolean[]) c0072g.f221E;
        if (zArr[i13]) {
            return;
        }
        C34610p c34610p = ((C23501g1) c0072g.f223x).m68058a(i13).f145799d[0];
        this.f93118E.m43884b(AbstractC34587d0.m109376i(c34610p.f145783n), c34610p, 0, null, this.f93149j0);
        zArr[i13] = true;
    }

    /* JADX INFO: renamed from: B */
    public final void m68096B(int i13) {
        m68101b();
        if (this.f93151l0) {
            if ((!this.f93137X || ((boolean[]) this.f93139Z.f224y)[i13]) && !this.f93133T[i13].m68132o(false)) {
                this.f93150k0 = 0L;
                this.f93151l0 = false;
                this.f93145f0 = true;
                this.f93149j0 = 0L;
                this.f93152m0 = 0;
                for (C23538y0 c23538y0 : this.f93133T) {
                    c23538y0.m68136s(false);
                }
                InterfaceC23539z interfaceC23539z = this.f93131R;
                interfaceC23539z.getClass();
                interfaceC23539z.mo8198b(this);
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final InterfaceC33639k0 m68097C(C23524r0 c23524r0) {
        int length = this.f93133T.length;
        for (int i13 = 0; i13 < length; i13++) {
            if (c23524r0.equals(this.f93134U[i13])) {
                return this.f93133T[i13];
            }
        }
        if (this.f93135V) {
            AbstractC38046a.m121826u("ProgressiveMediaPeriod", "Extractor added new track (id=" + c23524r0.f93109a + ") after finishing tracks.");
            return new C33642m();
        }
        InterfaceC15591h interfaceC15591h = this.f93157y;
        interfaceC15591h.getClass();
        C23538y0 c23538y0 = new C23538y0(this.f93121H, interfaceC15591h, this.f93119F);
        c23538y0.f93223f = this;
        int i14 = length + 1;
        C23524r0[] c23524r0Arr = (C23524r0[]) Arrays.copyOf(this.f93134U, i14);
        c23524r0Arr[length] = c23524r0;
        int i15 = AbstractC38065t.f163031a;
        this.f93134U = c23524r0Arr;
        C23538y0[] c23538y0Arr = (C23538y0[]) Arrays.copyOf(this.f93133T, i14);
        c23538y0Arr[length] = c23538y0;
        this.f93133T = c23538y0Arr;
        return c23538y0;
    }

    /* JADX INFO: renamed from: D */
    public final void m68098D(InterfaceC33627e0 interfaceC33627e0) {
        this.f93140a0 = this.f93132S == null ? interfaceC33627e0 : new C33651t(-9223372036854775807L);
        this.f93141b0 = interfaceC33627e0.mo8510f();
        boolean z4 = !this.f93148i0 && interfaceC33627e0.mo8510f() == -9223372036854775807L;
        this.f93142c0 = z4;
        this.f93143d0 = z4 ? 7 : 1;
        if (this.f93136W) {
            this.f93120G.m68109t(this.f93141b0, interfaceC33627e0, z4);
        } else {
            m68106z();
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m68099E() {
        C23520p0 c23520p0 = new C23520p0(this, this.f93155w, this.f93156x, this.f93126M, this, this.f93127N);
        if (this.f93136W) {
            AbstractC35849g.m113807i(m68105y());
            long j7 = this.f93141b0;
            if (j7 != -9223372036854775807L && this.f93150k0 > j7) {
                this.f93153n0 = true;
                this.f93150k0 = -9223372036854775807L;
                return;
            }
            InterfaceC33627e0 interfaceC33627e0 = this.f93140a0;
            interfaceC33627e0.getClass();
            long j13 = interfaceC33627e0.mo8456c(this.f93150k0).f140364a.f140372b;
            long j14 = this.f93150k0;
            c23520p0.f93094F.f140436a = j13;
            c23520p0.f93097I = j14;
            c23520p0.f93096H = true;
            c23520p0.f93100L = false;
            for (C23538y0 c23538y0 : this.f93133T) {
                c23538y0.f93237t = this.f93150k0;
            }
            this.f93150k0 = -9223372036854775807L;
        }
        this.f93152m0 = m68102c();
        this.f93125L.m88009d(c23520p0, this, this.f93158z.m60616q(this.f93143d0));
    }

    /* JADX INFO: renamed from: F */
    public final boolean m68100F() {
        return this.f93145f0 || m68105y();
    }

    @Override // p299l9.InterfaceC23486b1
    /* JADX INFO: renamed from: a */
    public final boolean mo36121a() {
        boolean z4;
        if (!this.f93125L.m88007a()) {
            return false;
        }
        C2852m1 c2852m1 = this.f93127N;
        synchronized (c2852m1) {
            z4 = c2852m1.f11320x;
        }
        return z4;
    }

    /* JADX INFO: renamed from: b */
    public final void m68101b() {
        AbstractC35849g.m113807i(this.f93136W);
        this.f93139Z.getClass();
        this.f93140a0.getClass();
    }

    /* JADX INFO: renamed from: c */
    public final int m68102c() {
        int i13 = 0;
        for (C23538y0 c23538y0 : this.f93133T) {
            i13 += c23538y0.f93234q + c23538y0.f93233p;
        }
        return i13;
    }

    @Override // p299l9.InterfaceC23486b1
    /* JADX INFO: renamed from: d */
    public final long mo36122d() {
        return mo36129m();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0085 A[LOOP:1: B:42:0x0083->B:43:0x0085, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x0096  */
    /* JADX WARN: Code duplicated, block: B:48:0x009f A[LOOP:2: B:47:0x009d->B:48:0x009f, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x007f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x0096, please report this as an issue */
    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: e */
    public final long mo36123e(long j7) {
        int i13;
        int i14;
        m68101b();
        boolean[] zArr = (boolean[]) this.f93139Z.f224y;
        if (!this.f93140a0.mo8509e()) {
            j7 = 0;
        }
        this.f93145f0 = false;
        boolean z4 = true;
        boolean z13 = this.f93149j0 == j7;
        this.f93149j0 = j7;
        if (m68105y()) {
            this.f93150k0 = j7;
            return j7;
        }
        int i15 = this.f93143d0;
        C28987k c28987k = this.f93125L;
        if (i15 == 7 || !(this.f93153n0 || c28987k.m88007a())) {
            this.f93151l0 = false;
            this.f93150k0 = j7;
            this.f93153n0 = false;
            this.f93146g0 = false;
            if (c28987k.m88007a()) {
                for (C23538y0 c23538y0 : this.f93133T) {
                    c23538y0.m68124g();
                }
                HandlerC28984h handlerC28984h = c28987k.f117258x;
                AbstractC35849g.m113808j(handlerC28984h);
                handlerC28984h.m88005a(false);
                return j7;
            }
            c28987k.f117259y = null;
            for (C23538y0 c23538y1 : this.f93133T) {
                c23538y1.m68136s(false);
            }
        } else {
            int length = this.f93133T.length;
            for (int i16 = 0; i16 < length; i16++) {
                C23538y0 c23538y2 = this.f93133T[i16];
                if (c23538y2.m68129l() != 0 || !z13) {
                    if (!(this.f93138Y ? c23538y2.m68137t(c23538y2.f93234q) : c23538y2.m68138u(j7, false)) && (zArr[i16] || !this.f93137X)) {
                        z4 = false;
                        break;
                    }
                }
            }
            if (!z4) {
                this.f93151l0 = false;
                this.f93150k0 = j7;
                this.f93153n0 = false;
                this.f93146g0 = false;
                if (c28987k.m88007a()) {
                    while (i14 < r2) {
                        c23538y0.m68124g();
                    }
                    HandlerC28984h handlerC28984h2 = c28987k.f117258x;
                    AbstractC35849g.m113808j(handlerC28984h2);
                    handlerC28984h2.m88005a(false);
                    return j7;
                }
                c28987k.f117259y = null;
                while (i13 < r2) {
                    c23538y1.m68136s(false);
                }
            }
        }
        return j7;
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: f */
    public final long mo36124f() {
        if (this.f93146g0) {
            this.f93146g0 = false;
            return this.f93149j0;
        }
        if (!this.f93145f0) {
            return -9223372036854775807L;
        }
        if (!this.f93153n0 && m68102c() <= this.f93152m0) {
            return -9223372036854775807L;
        }
        this.f93145f0 = false;
        return this.f93149j0;
    }

    @Override // p398p9.InterfaceC28986j
    /* JADX INFO: renamed from: g */
    public final void mo68103g() {
        for (C23538y0 c23538y0 : this.f93133T) {
            c23538y0.m68136s(true);
            C12554k0 c12554k0 = c23538y0.f93225h;
            if (c12554k0 != null) {
                c12554k0.m35222K(c23538y0.f93222e);
                c23538y0.f93225h = null;
                c23538y0.f93224g = null;
            }
        }
        C15990r c15990r = this.f93126M;
        InterfaceC33644n interfaceC33644n = (InterfaceC33644n) c15990r.f60513y;
        if (interfaceC33644n != null) {
            interfaceC33644n.release();
            c15990r.f60513y = null;
        }
        c15990r.f60514z = null;
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: h */
    public final void mo36125h() throws IOException {
        int iM60616q = this.f93158z.m60616q(this.f93143d0);
        C28987k c28987k = this.f93125L;
        IOException iOException = c28987k.f117259y;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC28984h handlerC28984h = c28987k.f117258x;
        if (handlerC28984h != null) {
            if (iM60616q == Integer.MIN_VALUE) {
                iM60616q = handlerC28984h.f117251w;
            }
            IOException iOException2 = handlerC28984h.f117245E;
            if (iOException2 != null && handlerC28984h.f117246F > iM60616q) {
                throw iOException2;
            }
        }
        if (this.f93153n0 && !this.f93136W) {
            throw ParserException.m5049a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: i */
    public final void mo36126i(long j7) throws Throwable {
        if (this.f93138Y) {
            return;
        }
        m68101b();
        if (m68105y()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.f93139Z.f225z;
        int length = this.f93133T.length;
        for (int i13 = 0; i13 < length; i13++) {
            this.f93133T[i13].m68123f(j7, zArr[i13]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX INFO: renamed from: j */
    public final long m68104j(boolean z4) {
        C23538y0 c23538y0;
        long jMax = Long.MIN_VALUE;
        for (int i13 = 0; i13 < this.f93133T.length; i13++) {
            if (z4) {
                c23538y0 = this.f93133T[i13];
                synchronized (c23538y0) {
                    jMax = Math.max(jMax, c23538y0.f93239v);
                }
            } else {
                C0072g c0072g = this.f93139Z;
                c0072g.getClass();
                if (((boolean[]) c0072g.f225z)[i13]) {
                    c23538y0 = this.f93133T[i13];
                    synchronized (c23538y0) {
                    }
                    jMax = Math.max(jMax, c23538y0.f93239v);
                } else {
                    continue;
                }
            }
        }
        return jMax;
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: k */
    public final C23501g1 mo36128k() {
        m68101b();
        return (C23501g1) this.f93139Z.f223x;
    }

    @Override // p499t9.InterfaceC33648q
    /* JADX INFO: renamed from: l */
    public final void mo3098l() {
        this.f93135V = true;
        this.f93130Q.post(this.f93128O);
    }

    @Override // p299l9.InterfaceC23486b1
    /* JADX INFO: renamed from: m */
    public final long mo36129m() {
        long jM68104j;
        boolean z4;
        long j7;
        m68101b();
        if (this.f93153n0 || this.f93147h0 == 0) {
            return Long.MIN_VALUE;
        }
        if (m68105y()) {
            return this.f93150k0;
        }
        if (this.f93137X) {
            int length = this.f93133T.length;
            jM68104j = Long.MAX_VALUE;
            for (int i13 = 0; i13 < length; i13++) {
                C0072g c0072g = this.f93139Z;
                if (((boolean[]) c0072g.f224y)[i13] && ((boolean[]) c0072g.f225z)[i13]) {
                    C23538y0 c23538y0 = this.f93133T[i13];
                    synchronized (c23538y0) {
                        z4 = c23538y0.f93240w;
                    }
                    if (z4) {
                        continue;
                    } else {
                        C23538y0 c23538y1 = this.f93133T[i13];
                        synchronized (c23538y1) {
                            j7 = c23538y1.f93239v;
                        }
                        jM68104j = Math.min(jM68104j, j7);
                    }
                }
            }
        } else {
            jM68104j = Long.MAX_VALUE;
        }
        if (jM68104j == Long.MAX_VALUE) {
            jM68104j = m68104j(false);
        }
        return jM68104j == Long.MIN_VALUE ? this.f93149j0 : jM68104j;
    }

    @Override // p299l9.InterfaceC23486b1
    /* JADX INFO: renamed from: n */
    public final void mo36130n(long j7) {
    }

    @Override // p499t9.InterfaceC33648q
    /* JADX INFO: renamed from: o */
    public final InterfaceC33639k0 mo3101o(int i13, int i14) {
        return m68097C(new C23524r0(i13, false));
    }

    @Override // p398p9.InterfaceC28983g
    /* JADX INFO: renamed from: p */
    public final void mo36137p(InterfaceC28985i interfaceC28985i, long j7, long j13) {
        C23520p0 c23520p0 = (C23520p0) interfaceC28985i;
        if (this.f93141b0 == -9223372036854775807L && this.f93140a0 != null) {
            long jM68104j = m68104j(true);
            long j14 = jM68104j == Long.MIN_VALUE ? 0L : jM68104j + ChatClient.RESOLVE_DEPENDENCY_TIMEOUT;
            this.f93141b0 = j14;
            this.f93120G.m68109t(j14, this.f93140a0, this.f93142c0);
        }
        Uri uri = c23520p0.f93103x.f173387y;
        C23527t c23527t = new C23527t();
        this.f93158z.getClass();
        this.f93118E.m43886d(c23527t, 1, -1, null, 0, null, c23520p0.f93097I, this.f93141b0);
        this.f93153n0 = true;
        InterfaceC23539z interfaceC23539z = this.f93131R;
        interfaceC23539z.getClass();
        interfaceC23539z.mo8198b(this);
    }

    @Override // p398p9.InterfaceC28983g
    /* JADX INFO: renamed from: q */
    public final void mo36138q(InterfaceC28985i interfaceC28985i, long j7, long j13, boolean z4) {
        C23520p0 c23520p0 = (C23520p0) interfaceC28985i;
        Uri uri = c23520p0.f93103x.f173387y;
        C23527t c23527t = new C23527t();
        this.f93158z.getClass();
        this.f93118E.m43885c(c23527t, 1, -1, null, 0, null, c23520p0.f93097I, this.f93141b0);
        if (z4) {
            return;
        }
        for (C23538y0 c23538y0 : this.f93133T) {
            c23538y0.m68136s(false);
        }
        if (this.f93147h0 > 0) {
            InterfaceC23539z interfaceC23539z = this.f93131R;
            interfaceC23539z.getClass();
            interfaceC23539z.mo8198b(this);
        }
    }

    @Override // p398p9.InterfaceC28983g
    /* JADX INFO: renamed from: r */
    public final C2919f mo36139r(InterfaceC28985i interfaceC28985i, IOException iOException, int i13) {
        C2919f c2919f;
        InterfaceC33627e0 interfaceC33627e0;
        C23520p0 c23520p0 = (C23520p0) interfaceC28985i;
        Uri uri = c23520p0.f93103x.f173387y;
        C23527t c23527t = new C23527t();
        int i14 = AbstractC38065t.f163031a;
        this.f93158z.getClass();
        long jMin = ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader$UnexpectedLoaderException) || DataSourceException.m5052a(iOException)) ? -9223372036854775807L : Math.min((i13 - 1) * 1000, ErrorCodes.WebsocketMethodErrors.cServerErrors);
        if (jMin == -9223372036854775807L) {
            c2919f = C28987k.f117255E;
        } else {
            int iM68102c = m68102c();
            int i15 = iM68102c > this.f93152m0 ? 1 : 0;
            if (this.f93148i0 || !((interfaceC33627e0 = this.f93140a0) == null || interfaceC33627e0.mo8510f() == -9223372036854775807L)) {
                this.f93152m0 = iM68102c;
            } else if (!this.f93136W || m68100F()) {
                this.f93145f0 = this.f93136W;
                this.f93149j0 = 0L;
                this.f93152m0 = 0;
                for (C23538y0 c23538y0 : this.f93133T) {
                    c23538y0.m68136s(false);
                }
                c23520p0.f93094F.f140436a = 0L;
                c23520p0.f93097I = 0L;
                c23520p0.f93096H = true;
                c23520p0.f93100L = false;
            } else {
                this.f93151l0 = true;
                c2919f = C28987k.f117256z;
            }
            c2919f = new C2919f(i15, jMin, (byte) 0);
        }
        C2919f c2919f2 = c2919f;
        int i16 = c2919f2.f11740a;
        this.f93118E.m43887e(c23527t, 1, -1, null, 0, null, c23520p0.f93097I, this.f93141b0, iOException, !(i16 == 0 || i16 == 1));
        return c2919f2;
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: s */
    public final long mo36131s(long j7, C2846k1 c2846k1) {
        m68101b();
        if (!this.f93140a0.mo8509e()) {
            return 0L;
        }
        C33625d0 c33625d0Mo8456c = this.f93140a0.mo8456c(j7);
        return c2846k1.m8161a(j7, c33625d0Mo8456c.f140364a.f140371a, c33625d0Mo8456c.f140365b.f140371a);
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: t */
    public final void mo36132t(InterfaceC23539z interfaceC23539z, long j7) {
        this.f93131R = interfaceC23539z;
        C34610p c34610p = this.f93123J;
        if (c34610p == null) {
            this.f93127N.m8248c();
            m68099E();
        } else {
            mo3101o(0, 3).mo36173a(c34610p);
            m68098D(new C33619a0(-9223372036854775807L, new long[]{0}, new long[]{0}));
            mo3098l();
            this.f93150k0 = j7;
        }
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: u */
    public final long mo36133u(InterfaceC27679s[] interfaceC27679sArr, boolean[] zArr, InterfaceC23540z0[] interfaceC23540z0Arr, boolean[] zArr2, long j7) {
        InterfaceC27679s interfaceC27679s;
        m68101b();
        C0072g c0072g = this.f93139Z;
        C23501g1 c23501g1 = (C23501g1) c0072g.f223x;
        boolean[] zArr3 = (boolean[]) c0072g.f225z;
        int i13 = this.f93147h0;
        for (int i14 = 0; i14 < interfaceC27679sArr.length; i14++) {
            InterfaceC23540z0 interfaceC23540z0 = interfaceC23540z0Arr[i14];
            if (interfaceC23540z0 != null && (interfaceC27679sArr[i14] == null || !zArr[i14])) {
                int i15 = ((C23522q0) interfaceC23540z0).f93106w;
                AbstractC35849g.m113807i(zArr3[i15]);
                this.f93147h0--;
                zArr3[i15] = false;
                interfaceC23540z0Arr[i14] = null;
            }
        }
        boolean z4 = !this.f93144e0 ? j7 == 0 || this.f93138Y : i13 != 0;
        for (int i16 = 0; i16 < interfaceC27679sArr.length; i16++) {
            if (interfaceC23540z0Arr[i16] == null && (interfaceC27679s = interfaceC27679sArr[i16]) != null) {
                AbstractC35849g.m113807i(interfaceC27679s.length() == 1);
                AbstractC35849g.m113807i(interfaceC27679s.mo68073e(0) == 0);
                int iIndexOf = c23501g1.f93028b.indexOf(interfaceC27679s.mo68078j());
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                }
                AbstractC35849g.m113807i(!zArr3[iIndexOf]);
                this.f93147h0++;
                zArr3[iIndexOf] = true;
                this.f93146g0 = interfaceC27679s.mo68082n().f145789t | this.f93146g0;
                interfaceC23540z0Arr[i16] = new C23522q0(this, iIndexOf);
                zArr2[i16] = true;
                if (!z4) {
                    C23538y0 c23538y0 = this.f93133T[iIndexOf];
                    z4 = (c23538y0.m68129l() == 0 || c23538y0.m68138u(j7, true)) ? false : true;
                }
            }
        }
        if (this.f93147h0 == 0) {
            this.f93151l0 = false;
            this.f93145f0 = false;
            this.f93146g0 = false;
            C28987k c28987k = this.f93125L;
            if (c28987k.m88007a()) {
                for (C23538y0 c23538y1 : this.f93133T) {
                    c23538y1.m68124g();
                }
                HandlerC28984h handlerC28984h = c28987k.f117258x;
                AbstractC35849g.m113808j(handlerC28984h);
                handlerC28984h.m88005a(false);
            } else {
                this.f93153n0 = false;
                for (C23538y0 c23538y2 : this.f93133T) {
                    c23538y2.m68136s(false);
                }
            }
        } else if (z4) {
            j7 = mo36123e(j7);
            for (int i17 = 0; i17 < interfaceC23540z0Arr.length; i17++) {
                if (interfaceC23540z0Arr[i17] != null) {
                    zArr2[i17] = true;
                }
            }
        }
        this.f93144e0 = true;
        return j7;
    }

    @Override // p499t9.InterfaceC33648q
    /* JADX INFO: renamed from: v */
    public final void mo3109v(InterfaceC33627e0 interfaceC33627e0) {
        this.f93130Q.post(new RunnableC20151r0(12, this, interfaceC33627e0));
    }

    @Override // p398p9.InterfaceC28983g
    /* JADX INFO: renamed from: w */
    public final void mo36140w(InterfaceC28985i interfaceC28985i, long j7, int i13) {
        C23527t c23527t;
        C23520p0 c23520p0 = (C23520p0) interfaceC28985i;
        C40177m c40177m = c23520p0.f93103x;
        if (i13 == 0) {
            c23527t = new C23527t(c23520p0.f93098J);
        } else {
            Uri uri = c40177m.f173387y;
            c23527t = new C23527t();
        }
        this.f93118E.m43888f(c23527t, 1, -1, null, 0, null, c23520p0.f93097I, this.f93141b0, i13);
    }

    @Override // p299l9.InterfaceC23486b1
    /* JADX INFO: renamed from: x */
    public final boolean mo36134x(C2856o0 c2856o0) {
        if (this.f93153n0) {
            return false;
        }
        C28987k c28987k = this.f93125L;
        if (c28987k.f117259y != null || this.f93151l0) {
            return false;
        }
        if ((this.f93136W || this.f93123J != null) && this.f93147h0 == 0) {
            return false;
        }
        boolean zM8248c = this.f93127N.m8248c();
        if (c28987k.m88007a()) {
            return zM8248c;
        }
        m68099E();
        return true;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m68105y() {
        return this.f93150k0 != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public final void m68106z() {
        C34610p c34610p;
        C34585c0 c34585c0M109365a;
        long j7 = this.f93124K;
        if (this.f93154o0 || this.f93136W || !this.f93135V || this.f93140a0 == null) {
            return;
        }
        C23538y0[] c23538y0Arr = this.f93133T;
        int length = c23538y0Arr.length;
        char c3 = 0;
        int i13 = 0;
        while (true) {
            C34610p c34610p2 = null;
            if (i13 >= length) {
                C2852m1 c2852m1 = this.f93127N;
                synchronized (c2852m1) {
                    c2852m1.f11320x = false;
                }
                int length2 = this.f93133T.length;
                C34611p0[] c34611p0Arr = new C34611p0[length2];
                boolean[] zArr = new boolean[length2];
                int i14 = 0;
                while (i14 < length2) {
                    C23538y0 c23538y0 = this.f93133T[i14];
                    synchronized (c23538y0) {
                        c34610p = c23538y0.f93242y ? null : c23538y0.f93214B;
                    }
                    c34610p.getClass();
                    String str = c34610p.f145783n;
                    boolean zM109378k = AbstractC34587d0.m109378k(str);
                    boolean z4 = (zM109378k || AbstractC34587d0.m109381n(str)) ? true : c3;
                    zArr[i14] = z4;
                    char c7 = c3;
                    this.f93137X = (this.f93137X ? 1 : 0) | (z4 ? 1 : 0);
                    this.f93138Y = (j7 != -9223372036854775807L && length2 == 1 && AbstractC34587d0.m109379l(str)) ? 1 : c7;
                    C15615b c15615b = this.f93132S;
                    if (c15615b != null) {
                        int i15 = c15615b.f58623a;
                        if (zM109378k || this.f93134U[i14].f93110b) {
                            C34585c0 c34585c0 = c34610p.f145781l;
                            if (c34585c0 == null) {
                                InterfaceC34583b0[] interfaceC34583b0Arr = new InterfaceC34583b0[1];
                                interfaceC34583b0Arr[c7] = c15615b;
                                c34585c0M109365a = new C34585c0(interfaceC34583b0Arr);
                            } else {
                                InterfaceC34583b0[] interfaceC34583b0Arr2 = new InterfaceC34583b0[1];
                                interfaceC34583b0Arr2[c7] = c15615b;
                                c34585c0M109365a = c34585c0.m109365a(interfaceC34583b0Arr2);
                            }
                            C34608o c34608oM109410a = c34610p.m109410a();
                            c34608oM109410a.f145739k = c34585c0M109365a;
                            c34610p = new C34610p(c34608oM109410a);
                        }
                        if (zM109378k && c34610p.f145777h == -1 && c34610p.f145778i == -1 && i15 != -1) {
                            C34608o c34608oM109410a2 = c34610p.m109410a();
                            c34608oM109410a2.f145736h = i15;
                            c34610p = new C34610p(c34608oM109410a2);
                        }
                    }
                    int iMo43889a = this.f93157y.mo43889a(c34610p);
                    C34608o c34608oM109410a3 = c34610p.m109410a();
                    c34608oM109410a3.f145728L = iMo43889a;
                    C34610p c34610p3 = new C34610p(c34608oM109410a3);
                    c34611p0Arr[i14] = new C34611p0(Integer.toString(i14), c34610p3);
                    this.f93146g0 = c34610p3.f145789t | this.f93146g0;
                    i14++;
                    c3 = c7;
                }
                this.f93139Z = new C0072g(new C23501g1(c34611p0Arr), zArr);
                if (this.f93138Y && this.f93141b0 == -9223372036854775807L) {
                    this.f93141b0 = j7;
                    this.f93140a0 = new C23518o0(this, this.f93140a0);
                }
                this.f93120G.m68109t(this.f93141b0, this.f93140a0, this.f93142c0);
                this.f93136W = true;
                InterfaceC23539z interfaceC23539z = this.f93131R;
                interfaceC23539z.getClass();
                interfaceC23539z.mo8200c(this);
                return;
            }
            C23538y0 c23538y1 = c23538y0Arr[i13];
            synchronized (c23538y1) {
                if (!c23538y1.f93242y) {
                    c34610p2 = c23538y1.f93214B;
                }
            }
            if (c34610p2 == null) {
                return;
            } else {
                i13++;
            }
        }
    }
}
