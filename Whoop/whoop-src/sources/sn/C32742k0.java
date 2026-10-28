package sn;

import android.net.Uri;
import android.os.Handler;
import bb.C2919f;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException;
import com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException;
import com.whoop.service.network.model.UserSessionDto;
import g73.C15556d;
import in.C18715c;
import in.InterfaceC18714b;
import io.InterfaceC20035o;
import io.getstream.chat.android.client.ChatClient;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import live.hms.video.error.ErrorCodes;
import mn.C25705c;
import p031b9.C2852m1;
import p284ko.C22611c0;
import p284ko.C22631o;
import p284ko.HandlerC22642z;
import p284ko.InterfaceC22607a0;
import p284ko.InterfaceC22609b0;
import p284ko.InterfaceC22628l;
import p284ko.InterfaceC22641y;
import p299l9.C23537y;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24555m;
import p309lo.AbstractC24567y;
import p408q.C29662f;
import p450r5.RunnableC30928b;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p465rm.C31537h1;
import p508ty.C34249c;
import p556vm.InterfaceC36141h;
import p588wm.C37373o;
import p588wm.InterfaceC37367i;
import p588wm.InterfaceC37369k;
import p588wm.InterfaceC37374p;
import p588wm.InterfaceC37377s;
import q30.C29938w0;

/* JADX INFO: renamed from: sn.k0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C32742k0 implements InterfaceC32757s, InterfaceC37369k, InterfaceC22641y, InterfaceC22609b0, InterfaceC32752p0 {

    /* JADX INFO: renamed from: l0 */
    public static final Map f136121l0;

    /* JADX INFO: renamed from: m0 */
    public static final C31521c0 f136122m0;

    /* JADX INFO: renamed from: E */
    public final C32770z f136123E;

    /* JADX INFO: renamed from: F */
    public final C32770z f136124F;

    /* JADX INFO: renamed from: G */
    public final C32748n0 f136125G;

    /* JADX INFO: renamed from: H */
    public final C22631o f136126H;

    /* JADX INFO: renamed from: I */
    public final long f136127I;

    /* JADX INFO: renamed from: K */
    public final C29938w0 f136129K;

    /* JADX INFO: renamed from: M */
    public final RunnableC32734g0 f136131M;

    /* JADX INFO: renamed from: N */
    public final RunnableC32734g0 f136132N;

    /* JADX INFO: renamed from: P */
    public InterfaceC32755r f136134P;

    /* JADX INFO: renamed from: Q */
    public C25705c f136135Q;

    /* JADX INFO: renamed from: T */
    public boolean f136138T;

    /* JADX INFO: renamed from: U */
    public boolean f136139U;

    /* JADX INFO: renamed from: V */
    public boolean f136140V;

    /* JADX INFO: renamed from: W */
    public C29662f f136141W;

    /* JADX INFO: renamed from: X */
    public InterfaceC37374p f136142X;

    /* JADX INFO: renamed from: Z */
    public boolean f136144Z;

    /* JADX INFO: renamed from: b0 */
    public boolean f136146b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f136147c0;

    /* JADX INFO: renamed from: d0 */
    public int f136148d0;

    /* JADX INFO: renamed from: f0 */
    public long f136150f0;

    /* JADX INFO: renamed from: h0 */
    public boolean f136152h0;

    /* JADX INFO: renamed from: i0 */
    public int f136153i0;

    /* JADX INFO: renamed from: j0 */
    public boolean f136154j0;

    /* JADX INFO: renamed from: k0 */
    public boolean f136155k0;

    /* JADX INFO: renamed from: w */
    public final Uri f136156w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC22628l f136157x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC36141h f136158y;

    /* JADX INFO: renamed from: z */
    public final C15556d f136159z;

    /* JADX INFO: renamed from: J */
    public final C22611c0 f136128J = new C22611c0("ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: L */
    public final C2852m1 f136130L = new C2852m1(2);

    /* JADX INFO: renamed from: O */
    public final Handler f136133O = AbstractC24567y.m71680k(null);

    /* JADX INFO: renamed from: S */
    public C32740j0[] f136137S = new C32740j0[0];

    /* JADX INFO: renamed from: R */
    public C32754q0[] f136136R = new C32754q0[0];

    /* JADX INFO: renamed from: g0 */
    public long f136151g0 = -9223372036854775807L;

    /* JADX INFO: renamed from: e0 */
    public long f136149e0 = -1;

    /* JADX INFO: renamed from: Y */
    public long f136143Y = -9223372036854775807L;

    /* JADX INFO: renamed from: a0 */
    public int f136145a0 = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE);
        f136121l0 = Collections.unmodifiableMap(map);
        C31518b0 c31518b0 = new C31518b0();
        c31518b0.f130037a = "icy";
        c31518b0.f130047k = "application/x-icy";
        f136122m0 = new C31521c0(c31518b0);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [sn.g0] */
    /* JADX WARN: Type inference failed for: r1v5, types: [sn.g0] */
    public C32742k0(Uri uri, InterfaceC22628l interfaceC22628l, C29938w0 c29938w0, InterfaceC36141h interfaceC36141h, C32770z c32770z, C15556d c15556d, C32770z c32770z2, C32748n0 c32748n0, C22631o c22631o, int i13) {
        this.f136156w = uri;
        this.f136157x = interfaceC22628l;
        this.f136158y = interfaceC36141h;
        this.f136124F = c32770z;
        this.f136159z = c15556d;
        this.f136123E = c32770z2;
        this.f136125G = c32748n0;
        this.f136126H = c22631o;
        this.f136127I = i13;
        this.f136129K = c29938w0;
        final int i14 = 0;
        this.f136131M = new Runnable(this) { // from class: sn.g0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C32742k0 f136088x;

            {
                this.f136088x = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        this.f136088x.m102724z();
                        break;
                    default:
                        C32742k0 c32742k0 = this.f136088x;
                        if (!c32742k0.f136155k0) {
                            InterfaceC32755r interfaceC32755r = c32742k0.f136134P;
                            interfaceC32755r.getClass();
                            interfaceC32755r.mo97274c(c32742k0);
                        }
                        break;
                }
            }
        };
        final int i15 = 1;
        this.f136132N = new Runnable(this) { // from class: sn.g0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C32742k0 f136088x;

            {
                this.f136088x = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        this.f136088x.m102724z();
                        break;
                    default:
                        C32742k0 c32742k0 = this.f136088x;
                        if (!c32742k0.f136155k0) {
                            InterfaceC32755r interfaceC32755r = c32742k0.f136134P;
                            interfaceC32755r.getClass();
                            interfaceC32755r.mo97274c(c32742k0);
                        }
                        break;
                }
            }
        };
    }

    /* JADX INFO: renamed from: A */
    public final void m102714A(int i13) {
        m102720s();
        C29662f c29662f = this.f136141W;
        boolean[] zArr = (boolean[]) c29662f.f121228E;
        if (zArr[i13]) {
            return;
        }
        C31521c0 c31521c0 = ((C32768x0) c29662f.f121230x).m102758a(i13).f136262y[0];
        int iM71613g = AbstractC24555m.m71613g(c31521c0.f130077L);
        long j7 = this.f136150f0;
        C32770z c32770z = this.f136123E;
        c32770z.m102760b(new C23537y(1, iM71613g, c31521c0, 0, null, c32770z.m102759a(j7), -9223372036854775807L));
        zArr[i13] = true;
    }

    /* JADX INFO: renamed from: B */
    public final void m102715B(int i13) {
        m102720s();
        boolean[] zArr = (boolean[]) this.f136141W.f121231y;
        if (this.f136152h0 && zArr[i13] && !this.f136136R[i13].m102745p(false)) {
            this.f136151g0 = 0L;
            this.f136152h0 = false;
            this.f136147c0 = true;
            this.f136150f0 = 0L;
            this.f136153i0 = 0;
            for (C32754q0 c32754q0 : this.f136136R) {
                c32754q0.m102750u(false);
            }
            InterfaceC32755r interfaceC32755r = this.f136134P;
            interfaceC32755r.getClass();
            interfaceC32755r.mo97274c(this);
        }
    }

    /* JADX INFO: renamed from: C */
    public final C32754q0 m102716C(C32740j0 c32740j0) {
        int length = this.f136136R.length;
        for (int i13 = 0; i13 < length; i13++) {
            if (c32740j0.equals(this.f136137S[i13])) {
                return this.f136136R[i13];
            }
        }
        InterfaceC36141h interfaceC36141h = this.f136158y;
        interfaceC36141h.getClass();
        C32754q0 c32754q0 = new C32754q0(this.f136126H, interfaceC36141h, this.f136124F);
        c32754q0.f136217f = this;
        int i14 = length + 1;
        C32740j0[] c32740j0Arr = (C32740j0[]) Arrays.copyOf(this.f136137S, i14);
        c32740j0Arr[length] = c32740j0;
        int i15 = AbstractC24567y.f95875a;
        this.f136137S = c32740j0Arr;
        C32754q0[] c32754q0Arr = (C32754q0[]) Arrays.copyOf(this.f136136R, i14);
        c32754q0Arr[length] = c32754q0;
        this.f136136R = c32754q0Arr;
        return c32754q0;
    }

    /* JADX INFO: renamed from: D */
    public final void m102717D() {
        C32736h0 c32736h0 = new C32736h0(this, this.f136156w, this.f136157x, this.f136129K, this, this.f136130L);
        if (this.f136139U) {
            AbstractC24543a.m71573i(m102723y());
            long j7 = this.f136143Y;
            if (j7 != -9223372036854775807L && this.f136151g0 > j7) {
                this.f136154j0 = true;
                this.f136151g0 = -9223372036854775807L;
                return;
            }
            InterfaceC37374p interfaceC37374p = this.f136142X;
            interfaceC37374p.getClass();
            long j13 = interfaceC37374p.mo3112c(this.f136151g0).f159867a.f159871b;
            long j14 = this.f136151g0;
            c32736h0.f136097f.f140436a = j13;
            c32736h0.f136100i = j14;
            c32736h0.f136099h = true;
            c32736h0.f136104m = false;
            for (C32754q0 c32754q0 : this.f136136R) {
                c32754q0.f136231t = this.f136151g0;
            }
            this.f136151g0 = -9223372036854775807L;
        }
        this.f136153i0 = m102721t();
        this.f136128J.m65556d(c32736h0, this, this.f136159z.m43809h(this.f136145a0));
        this.f136123E.m102767i(new C32745m(c32736h0.f136101j), 1, -1, null, 0, null, c32736h0.f136100i, this.f136143Y);
    }

    /* JADX INFO: renamed from: E */
    public final boolean m102718E() {
        return this.f136147c0 || m102723y();
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: a */
    public final boolean mo91531a() {
        boolean z4;
        if (!this.f136128J.m65554b()) {
            return false;
        }
        C2852m1 c2852m1 = this.f136130L;
        synchronized (c2852m1) {
            z4 = c2852m1.f11320x;
        }
        return z4;
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: b */
    public final void mo102699b(InterfaceC32755r interfaceC32755r, long j7) {
        this.f136134P = interfaceC32755r;
        this.f136130L.m8248c();
        m102717D();
    }

    @Override // p284ko.InterfaceC22641y
    /* JADX INFO: renamed from: c */
    public final void mo65586c(InterfaceC22607a0 interfaceC22607a0) {
        InterfaceC37374p interfaceC37374p;
        C32736h0 c32736h0 = (C32736h0) interfaceC22607a0;
        if (this.f136143Y == -9223372036854775807L && (interfaceC37374p = this.f136142X) != null) {
            boolean zMo3113e = interfaceC37374p.mo3113e();
            long jM102722w = m102722w();
            long j7 = jM102722w == Long.MIN_VALUE ? 0L : jM102722w + ChatClient.RESOLVE_DEPENDENCY_TIMEOUT;
            this.f136143Y = j7;
            this.f136125G.m102727q(j7, zMo3113e, this.f136144Z);
        }
        Uri uri = c32736h0.f136093b.f88998y;
        C32745m c32745m = new C32745m();
        this.f136159z.getClass();
        this.f136123E.m102763e(c32745m, 1, -1, null, 0, null, c32736h0.f136100i, this.f136143Y);
        if (this.f136149e0 == -1) {
            this.f136149e0 = c32736h0.f136102k;
        }
        this.f136154j0 = true;
        InterfaceC32755r interfaceC32755r = this.f136134P;
        interfaceC32755r.getClass();
        interfaceC32755r.mo97274c(this);
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: d */
    public final long mo91532d() {
        if (this.f136148d0 == 0) {
            return Long.MIN_VALUE;
        }
        return mo91533m();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[LOOP:1: B:25:0x0054->B:26:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    /* JADX WARN: Code duplicated, block: B:31:0x006b A[LOOP:2: B:30:0x0069->B:31:0x006b, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x0051, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x0062, please report this as an issue */
    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: e */
    public final long mo102700e(long j7) {
        C22611c0 c22611c0;
        int i13;
        m102720s();
        boolean[] zArr = (boolean[]) this.f136141W.f121231y;
        if (!this.f136142X.mo3113e()) {
            j7 = 0;
        }
        this.f136147c0 = false;
        this.f136150f0 = j7;
        if (m102723y()) {
            this.f136151g0 = j7;
            return j7;
        }
        if (this.f136145a0 == 7) {
            this.f136152h0 = false;
            this.f136151g0 = j7;
            this.f136154j0 = false;
            c22611c0 = this.f136128J;
            if (c22611c0.m65554b()) {
                c22611c0.f88959c = null;
                for (C32754q0 c32754q0 : this.f136136R) {
                    c32754q0.m102750u(false);
                }
                break;
                break;
            }
            for (C32754q0 c32754q1 : this.f136136R) {
                c32754q1.m102736g();
            }
            c22611c0.m65553a();
            return j7;
        }
        int length = this.f136136R.length;
        for (int i14 = 0; i14 < length; i14++) {
            if (!this.f136136R[i14].m102751v(j7, false) && (zArr[i14] || !this.f136140V)) {
                this.f136152h0 = false;
                this.f136151g0 = j7;
                this.f136154j0 = false;
                c22611c0 = this.f136128J;
                if (c22611c0.m65554b()) {
                    c22611c0.f88959c = null;
                    while (i13 < r2) {
                        c32754q0.m102750u(false);
                    }
                    break;
                }
                while (i < r3) {
                    c32754q1.m102736g();
                }
                c22611c0.m65553a();
                return j7;
            }
        }
        return j7;
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: f */
    public final long mo102701f() {
        if (!this.f136147c0) {
            return -9223372036854775807L;
        }
        if (!this.f136154j0 && m102721t() <= this.f136153i0) {
            return -9223372036854775807L;
        }
        this.f136147c0 = false;
        return this.f136150f0;
    }

    @Override // p284ko.InterfaceC22609b0
    /* JADX INFO: renamed from: g */
    public final void mo65552g() {
        for (C32754q0 c32754q0 : this.f136136R) {
            c32754q0.m102750u(true);
            C34249c c34249c = c32754q0.f136219h;
            if (c34249c != null) {
                c34249c.m108304u(c32754q0.f136216e);
                c32754q0.f136219h = null;
                c32754q0.f136218g = null;
            }
        }
        C29938w0 c29938w0 = this.f136129K;
        InterfaceC37367i interfaceC37367i = (InterfaceC37367i) c29938w0.f122261y;
        if (interfaceC37367i != null) {
            interfaceC37367i.release();
            c29938w0.f122261y = null;
        }
        c29938w0.f122262z = null;
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: h */
    public final void mo102702h() throws IOException {
        int iM43809h = this.f136159z.m43809h(this.f136145a0);
        C22611c0 c22611c0 = this.f136128J;
        IOException iOException = c22611c0.f88959c;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC22642z handlerC22642z = c22611c0.f88958b;
        if (handlerC22642z != null) {
            if (iM43809h == Integer.MIN_VALUE) {
                iM43809h = handlerC22642z.f89089w;
            }
            IOException iOException2 = handlerC22642z.f89092z;
            if (iOException2 != null && handlerC22642z.f89084E > iM43809h) {
                throw iOException2;
            }
        }
        if (this.f136154j0 && !this.f136139U) {
            throw ParserException.m15562a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: i */
    public final void mo102703i(long j7) throws Throwable {
        m102720s();
        if (m102723y()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.f136141W.f121232z;
        int length = this.f136136R.length;
        for (int i13 = 0; i13 < length; i13++) {
            this.f136136R[i13].m102735f(j7, zArr[i13]);
        }
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: j */
    public final long mo102704j(InterfaceC20035o[] interfaceC20035oArr, boolean[] zArr, InterfaceC32756r0[] interfaceC32756r0Arr, boolean[] zArr2, long j7) {
        InterfaceC20035o interfaceC20035o;
        m102720s();
        C29662f c29662f = this.f136141W;
        C32768x0 c32768x0 = (C32768x0) c29662f.f121230x;
        boolean[] zArr3 = (boolean[]) c29662f.f121232z;
        int i13 = this.f136148d0;
        int i14 = 0;
        for (int i15 = 0; i15 < interfaceC20035oArr.length; i15++) {
            InterfaceC32756r0 interfaceC32756r0 = interfaceC32756r0Arr[i15];
            if (interfaceC32756r0 != null && (interfaceC20035oArr[i15] == null || !zArr[i15])) {
                int i16 = ((C32738i0) interfaceC32756r0).f136109w;
                AbstractC24543a.m71573i(zArr3[i16]);
                this.f136148d0--;
                zArr3[i16] = false;
                interfaceC32756r0Arr[i15] = null;
            }
        }
        boolean z4 = !this.f136146b0 ? j7 == 0 : i13 != 0;
        for (int i17 = 0; i17 < interfaceC20035oArr.length; i17++) {
            if (interfaceC32756r0Arr[i17] == null && (interfaceC20035o = interfaceC20035oArr[i17]) != null) {
                AbstractC24543a.m71573i(interfaceC20035o.length() == 1);
                AbstractC24543a.m71573i(interfaceC20035o.mo54500e(0) == 0);
                int iIndexOf = c32768x0.f136271x.indexOf(interfaceC20035o.mo54502j());
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                }
                AbstractC24543a.m71573i(!zArr3[iIndexOf]);
                this.f136148d0++;
                zArr3[iIndexOf] = true;
                interfaceC32756r0Arr[i17] = new C32738i0(this, iIndexOf);
                zArr2[i17] = true;
                if (!z4) {
                    C32754q0 c32754q0 = this.f136136R[iIndexOf];
                    z4 = (c32754q0.m102751v(j7, true) || c32754q0.m102741l() == 0) ? false : true;
                }
            }
        }
        if (this.f136148d0 == 0) {
            this.f136152h0 = false;
            this.f136147c0 = false;
            C22611c0 c22611c0 = this.f136128J;
            if (c22611c0.m65554b()) {
                C32754q0[] c32754q0Arr = this.f136136R;
                int length = c32754q0Arr.length;
                while (i14 < length) {
                    c32754q0Arr[i14].m102736g();
                    i14++;
                }
                c22611c0.m65553a();
            } else {
                for (C32754q0 c32754q1 : this.f136136R) {
                    c32754q1.m102750u(false);
                }
            }
        } else if (z4) {
            j7 = mo102700e(j7);
            while (i14 < interfaceC32756r0Arr.length) {
                if (interfaceC32756r0Arr[i14] != null) {
                    zArr2[i14] = true;
                }
                i14++;
            }
        }
        this.f136146b0 = true;
        return j7;
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: k */
    public final C32768x0 mo102705k() {
        m102720s();
        return (C32768x0) this.f136141W.f121230x;
    }

    @Override // p588wm.InterfaceC37369k, p499t9.InterfaceC33648q
    /* JADX INFO: renamed from: l */
    public final void mo3098l() {
        this.f136138T = true;
        this.f136133O.post(this.f136131M);
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: m */
    public final long mo91533m() {
        long jM102722w;
        boolean z4;
        long j7;
        m102720s();
        boolean[] zArr = (boolean[]) this.f136141W.f121231y;
        if (this.f136154j0) {
            return Long.MIN_VALUE;
        }
        if (m102723y()) {
            return this.f136151g0;
        }
        if (this.f136140V) {
            int length = this.f136136R.length;
            jM102722w = Long.MAX_VALUE;
            for (int i13 = 0; i13 < length; i13++) {
                if (zArr[i13]) {
                    C32754q0 c32754q0 = this.f136136R[i13];
                    synchronized (c32754q0) {
                        z4 = c32754q0.f136234w;
                    }
                    if (z4) {
                        continue;
                    } else {
                        C32754q0 c32754q1 = this.f136136R[i13];
                        synchronized (c32754q1) {
                            j7 = c32754q1.f136233v;
                        }
                        jM102722w = Math.min(jM102722w, j7);
                    }
                }
            }
        } else {
            jM102722w = Long.MAX_VALUE;
        }
        if (jM102722w == Long.MAX_VALUE) {
            jM102722w = m102722w();
        }
        return jM102722w == Long.MIN_VALUE ? this.f136150f0 : jM102722w;
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: n */
    public final void mo91534n(long j7) {
    }

    @Override // p588wm.InterfaceC37369k
    /* JADX INFO: renamed from: o */
    public final InterfaceC37377s mo3102o(int i13, int i14) {
        return m102716C(new C32740j0(i13, false));
    }

    @Override // p284ko.InterfaceC22641y
    /* JADX INFO: renamed from: p */
    public final void mo65587p(InterfaceC22607a0 interfaceC22607a0, boolean z4) {
        C32736h0 c32736h0 = (C32736h0) interfaceC22607a0;
        Uri uri = c32736h0.f136093b.f88998y;
        C32745m c32745m = new C32745m();
        this.f136159z.getClass();
        this.f136123E.m102761c(c32745m, 1, -1, null, 0, null, c32736h0.f136100i, this.f136143Y);
        if (z4) {
            return;
        }
        if (this.f136149e0 == -1) {
            this.f136149e0 = c32736h0.f136102k;
        }
        for (C32754q0 c32754q0 : this.f136136R) {
            c32754q0.m102750u(false);
        }
        if (this.f136148d0 > 0) {
            InterfaceC32755r interfaceC32755r = this.f136134P;
            interfaceC32755r.getClass();
            interfaceC32755r.mo97274c(this);
        }
    }

    @Override // p284ko.InterfaceC22641y
    /* JADX INFO: renamed from: q */
    public final C2919f mo65588q(InterfaceC22607a0 interfaceC22607a0, IOException iOException, int i13) {
        long jMin;
        C2919f c2919f;
        InterfaceC37374p interfaceC37374p;
        C32736h0 c32736h0 = (C32736h0) interfaceC22607a0;
        if (this.f136149e0 == -1) {
            this.f136149e0 = c32736h0.f136102k;
        }
        Uri uri = c32736h0.f136093b.f88998y;
        C32745m c32745m = new C32745m();
        int i14 = AbstractC24567y.f95875a;
        this.f136159z.getClass();
        if ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader$UnexpectedLoaderException)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i15 = DataSourceException.f20436x;
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i13 - 1) * 1000, ErrorCodes.WebsocketMethodErrors.cServerErrors);
                break;
            }
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).f20437w == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == -9223372036854775807L) {
            c2919f = C22611c0.f88956f;
        } else {
            int iM102721t = m102721t();
            int i16 = iM102721t > this.f136153i0 ? 1 : 0;
            if (this.f136149e0 != -1 || ((interfaceC37374p = this.f136142X) != null && interfaceC37374p.mo3114f() != -9223372036854775807L)) {
                this.f136153i0 = iM102721t;
            } else if (!this.f136139U || m102718E()) {
                this.f136147c0 = this.f136139U;
                this.f136150f0 = 0L;
                this.f136153i0 = 0;
                for (C32754q0 c32754q0 : this.f136136R) {
                    c32754q0.m102750u(false);
                }
                c32736h0.f136097f.f140436a = 0L;
                c32736h0.f136100i = 0L;
                c32736h0.f136099h = true;
                c32736h0.f136104m = false;
            } else {
                this.f136152h0 = true;
                c2919f = C22611c0.f88955e;
            }
            c2919f = new C2919f(i16, jMin, (byte) 0);
        }
        C2919f c2919f2 = c2919f;
        int i17 = c2919f2.f11740a;
        this.f136123E.m102765g(c32745m, 1, -1, null, 0, null, c32736h0.f136100i, this.f136143Y, iOException, !(i17 == 0 || i17 == 1));
        return c2919f2;
    }

    @Override // sn.InterfaceC32752p0
    /* JADX INFO: renamed from: r */
    public final void mo102719r() {
        this.f136133O.post(this.f136131M);
    }

    /* JADX INFO: renamed from: s */
    public final void m102720s() {
        AbstractC24543a.m71573i(this.f136139U);
        this.f136141W.getClass();
        this.f136142X.getClass();
    }

    /* JADX INFO: renamed from: t */
    public final int m102721t() {
        int i13 = 0;
        for (C32754q0 c32754q0 : this.f136136R) {
            i13 += c32754q0.f136228q + c32754q0.f136227p;
        }
        return i13;
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: u */
    public final boolean mo91536u(long j7) {
        if (this.f136154j0) {
            return false;
        }
        C22611c0 c22611c0 = this.f136128J;
        if (c22611c0.f88959c != null || this.f136152h0) {
            return false;
        }
        if (this.f136139U && this.f136148d0 == 0) {
            return false;
        }
        boolean zM8248c = this.f136130L.m8248c();
        if (c22611c0.m65554b()) {
            return zM8248c;
        }
        m102717D();
        return true;
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: v */
    public final long mo102707v(long j7, C31537h1 c31537h1) {
        m102720s();
        if (!this.f136142X.mo3113e()) {
            return 0L;
        }
        C37373o c37373oMo3112c = this.f136142X.mo3112c(j7);
        return c31537h1.m97143a(j7, c37373oMo3112c.f159867a.f159870a, c37373oMo3112c.f159868b.f159870a);
    }

    /* JADX INFO: renamed from: w */
    public final long m102722w() {
        long j7;
        long jMax = Long.MIN_VALUE;
        for (C32754q0 c32754q0 : this.f136136R) {
            synchronized (c32754q0) {
                j7 = c32754q0.f136233v;
            }
            jMax = Math.max(jMax, j7);
        }
        return jMax;
    }

    @Override // p588wm.InterfaceC37369k
    /* JADX INFO: renamed from: x */
    public final void mo3111x(InterfaceC37374p interfaceC37374p) {
        this.f136133O.post(new RunnableC30928b(11, this, interfaceC37374p));
    }

    /* JADX INFO: renamed from: y */
    public final boolean m102723y() {
        return this.f136151g0 != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: z */
    public final void m102724z() {
        C18715c c18715c;
        if (this.f136155k0 || this.f136139U || !this.f136138T || this.f136142X == null) {
            return;
        }
        for (C32754q0 c32754q0 : this.f136136R) {
            if (c32754q0.m102744o() == null) {
                return;
            }
        }
        C2852m1 c2852m1 = this.f136130L;
        synchronized (c2852m1) {
            c2852m1.f11320x = false;
        }
        int length = this.f136136R.length;
        C32766w0[] c32766w0Arr = new C32766w0[length];
        boolean[] zArr = new boolean[length];
        for (int i13 = 0; i13 < length; i13++) {
            C31521c0 c31521c0M102744o = this.f136136R[i13].m102744o();
            c31521c0M102744o.getClass();
            String str = c31521c0M102744o.f130077L;
            boolean zM71614h = AbstractC24555m.m71614h(str);
            boolean z4 = zM71614h || AbstractC24555m.m71616j(str);
            zArr[i13] = z4;
            this.f136140V = z4 | this.f136140V;
            C25705c c25705c = this.f136135Q;
            if (c25705c != null) {
                int i14 = c25705c.f101215w;
                if (zM71614h || this.f136137S[i13].f136119b) {
                    C18715c c18715c2 = c31521c0M102744o.f130075J;
                    if (c18715c2 == null) {
                        c18715c = new C18715c(c25705c);
                    } else {
                        InterfaceC18714b[] interfaceC18714bArr = c18715c2.f73525w;
                        int i15 = AbstractC24567y.f95875a;
                        Object[] objArrCopyOf = Arrays.copyOf(interfaceC18714bArr, interfaceC18714bArr.length + 1);
                        System.arraycopy(new InterfaceC18714b[]{c25705c}, 0, objArrCopyOf, interfaceC18714bArr.length, 1);
                        c18715c = new C18715c((InterfaceC18714b[]) objArrCopyOf);
                    }
                    C31518b0 c31518b0M97113a = c31521c0M102744o.m97113a();
                    c31518b0M97113a.f130045i = c18715c;
                    c31521c0M102744o = new C31521c0(c31518b0M97113a);
                }
                if (zM71614h && c31521c0M102744o.f130071F == -1 && c31521c0M102744o.f130072G == -1 && i14 != -1) {
                    C31518b0 c31518b0M97113a2 = c31521c0M102744o.m97113a();
                    c31518b0M97113a2.f130042f = i14;
                    c31521c0M102744o = new C31521c0(c31518b0M97113a2);
                }
            }
            int iMo114965b = this.f136158y.mo114965b(c31521c0M102744o);
            C31518b0 c31518b0M97113a3 = c31521c0M102744o.m97113a();
            c31518b0M97113a3.f130036D = iMo114965b;
            c32766w0Arr[i13] = new C32766w0(Integer.toString(i13), new C31521c0(c31518b0M97113a3));
        }
        this.f136141W = new C29662f(new C32768x0(c32766w0Arr), zArr);
        this.f136139U = true;
        InterfaceC32755r interfaceC32755r = this.f136134P;
        interfaceC32755r.getClass();
        interfaceC32755r.mo97282g(this);
    }
}
