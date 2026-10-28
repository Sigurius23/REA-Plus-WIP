package p465rm;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import androidx.health.platform.client.proto.C1533u;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import in.C18715c;
import in.InterfaceC18714b;
import io.AbstractC20038r;
import io.C20712x;
import io.InterfaceC20035o;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import live.hms.video.error.ErrorCodes;
import lr.RunnableC24693e;
import p000.AbstractC30802r;
import p031b9.C2819b1;
import p031b9.C2838i;
import p031b9.C2842j0;
import p031b9.C2847l;
import p031b9.C2849l1;
import p031b9.C2853n;
import p284ko.C22631o;
import p284ko.C22633q;
import p284ko.InterfaceC22614e;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p309lo.C24562t;
import p309lo.C24563u;
import p309lo.C24564v;
import p309lo.InterfaceC24554l;
import p408q.C29662f;
import p450r5.RunnableC30928b;
import p558vp.AbstractC36259c;
import p621xn.C38472i;
import p690zr.AbstractC41023g0;
import p690zr.C41014d0;
import p690zr.C41017e0;
import p690zr.C41060w0;
import sm.C32711d;
import sm.C32713f;
import sn.AbstractC32721a;
import sn.C32762u0;
import sn.C32763v;
import sn.C32768x0;
import sn.InterfaceC32755r;
import sn.InterfaceC32756r0;
import sn.InterfaceC32757s;
import sn.InterfaceC32760t0;
import tm.C33944v;

/* JADX INFO: renamed from: rm.z */
/* JADX INFO: loaded from: classes6.dex */
public final class C31581z implements Handler.Callback, InterfaceC32755r {

    /* JADX INFO: renamed from: E */
    public final C20712x f130480E;

    /* JADX INFO: renamed from: F */
    public final C31535h f130481F;

    /* JADX INFO: renamed from: G */
    public final InterfaceC22614e f130482G;

    /* JADX INFO: renamed from: H */
    public final C24564v f130483H;

    /* JADX INFO: renamed from: I */
    public final HandlerThread f130484I;

    /* JADX INFO: renamed from: J */
    public final Looper f130485J;

    /* JADX INFO: renamed from: K */
    public final C31555n1 f130486K;

    /* JADX INFO: renamed from: L */
    public final C31552m1 f130487L;

    /* JADX INFO: renamed from: M */
    public final long f130488M;

    /* JADX INFO: renamed from: N */
    public final C2847l f130489N;

    /* JADX INFO: renamed from: O */
    public final ArrayList f130490O;

    /* JADX INFO: renamed from: P */
    public final C24562t f130491P;

    /* JADX INFO: renamed from: Q */
    public final C31550m f130492Q;

    /* JADX INFO: renamed from: R */
    public final C31560p0 f130493R;

    /* JADX INFO: renamed from: S */
    public final C2819b1 f130494S;

    /* JADX INFO: renamed from: T */
    public final C2838i f130495T;

    /* JADX INFO: renamed from: U */
    public final long f130496U;

    /* JADX INFO: renamed from: V */
    public C31537h1 f130497V;

    /* JADX INFO: renamed from: W */
    public C31574v0 f130498W;

    /* JADX INFO: renamed from: X */
    public C31577x f130499X;

    /* JADX INFO: renamed from: Y */
    public boolean f130500Y;

    /* JADX INFO: renamed from: a0 */
    public boolean f130502a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f130503b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f130504c0;

    /* JADX INFO: renamed from: d0 */
    public int f130505d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f130506e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f130507f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f130508g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f130509h0;

    /* JADX INFO: renamed from: i0 */
    public int f130510i0;

    /* JADX INFO: renamed from: j0 */
    public C31579y f130511j0;

    /* JADX INFO: renamed from: k0 */
    public long f130512k0;

    /* JADX INFO: renamed from: l0 */
    public int f130513l0;

    /* JADX INFO: renamed from: m0 */
    public boolean f130514m0;

    /* JADX INFO: renamed from: n0 */
    public ExoPlaybackException f130515n0;

    /* JADX INFO: renamed from: w */
    public final AbstractC31523d[] f130517w;

    /* JADX INFO: renamed from: x */
    public final Set f130518x;

    /* JADX INFO: renamed from: y */
    public final AbstractC31523d[] f130519y;

    /* JADX INFO: renamed from: z */
    public final AbstractC20038r f130520z;

    /* JADX INFO: renamed from: Z */
    public boolean f130501Z = false;

    /* JADX INFO: renamed from: o0 */
    public long f130516o0 = -9223372036854775807L;

    public C31581z(AbstractC31523d[] abstractC31523dArr, AbstractC20038r abstractC20038r, C20712x c20712x, C31535h c31535h, InterfaceC22614e interfaceC22614e, int i13, boolean z4, C32711d c32711d, C31537h1 c31537h1, C2838i c2838i, long j7, Looper looper, C24562t c24562t, C31550m c31550m, C32713f c32713f) {
        this.f130492Q = c31550m;
        this.f130517w = abstractC31523dArr;
        this.f130520z = abstractC20038r;
        this.f130480E = c20712x;
        this.f130481F = c31535h;
        this.f130482G = interfaceC22614e;
        this.f130505d0 = i13;
        this.f130506e0 = z4;
        this.f130497V = c31537h1;
        this.f130495T = c2838i;
        this.f130496U = j7;
        this.f130491P = c24562t;
        this.f130488M = c31535h.f130158g;
        C31574v0 c31574v0M97232i = C31574v0.m97232i(c20712x);
        this.f130498W = c31574v0M97232i;
        this.f130499X = new C31577x(c31574v0M97232i);
        this.f130519y = new AbstractC31523d[abstractC31523dArr.length];
        for (int i14 = 0; i14 < abstractC31523dArr.length; i14++) {
            AbstractC31523d abstractC31523d = abstractC31523dArr[i14];
            abstractC31523d.f130113z = i14;
            abstractC31523d.f130102E = c32713f;
            this.f130519y[i14] = abstractC31523d;
        }
        this.f130489N = new C2847l(this, c24562t);
        this.f130490O = new ArrayList();
        this.f130518x = Collections.newSetFromMap(new IdentityHashMap());
        this.f130486K = new C31555n1();
        this.f130487L = new C31552m1();
        abstractC20038r.f75170a = this;
        abstractC20038r.f75171b = interfaceC22614e;
        this.f130514m0 = true;
        Handler handler = new Handler(looper);
        this.f130493R = new C31560p0(handler, c32711d);
        this.f130494S = new C2819b1(this, c32711d, handler, c32713f);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f130484I = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f130485J = looper2;
        this.f130483H = c24562t.m71645a(looper2, this);
    }

    /* JADX INFO: renamed from: E */
    public static Pair m97243E(AbstractC31558o1 abstractC31558o1, C31579y c31579y, boolean z4, int i13, boolean z13, C31555n1 c31555n1, C31552m1 c31552m1) {
        Object objM97244F;
        AbstractC31558o1 abstractC31558o2 = c31579y.f130476a;
        if (abstractC31558o1.m97175p()) {
            return null;
        }
        AbstractC31558o1 abstractC31558o3 = abstractC31558o2.m97175p() ? abstractC31558o1 : abstractC31558o2;
        try {
            Pair pairM97172i = abstractC31558o3.m97172i(c31555n1, c31552m1, c31579y.f130477b, c31579y.f130478c);
            if (!abstractC31558o1.equals(abstractC31558o3)) {
                if (abstractC31558o1.mo97128b(pairM97172i.first) == -1) {
                    if (!z4 || (objM97244F = m97244F(c31555n1, c31552m1, i13, z13, pairM97172i.first, abstractC31558o3, abstractC31558o1)) == null) {
                        return null;
                    }
                    return abstractC31558o1.m97172i(c31555n1, c31552m1, abstractC31558o1.mo97132g(objM97244F, c31552m1).f130286y, -9223372036854775807L);
                }
                if (abstractC31558o3.mo97132g(pairM97172i.first, c31552m1).f130282F && abstractC31558o3.mo97136m(c31552m1.f130286y, c31555n1, 0L).f130319O == abstractC31558o3.mo97128b(pairM97172i.first)) {
                    return abstractC31558o1.m97172i(c31555n1, c31552m1, abstractC31558o1.mo97132g(pairM97172i.first, c31552m1).f130286y, c31579y.f130478c);
                }
            }
            return pairM97172i;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: F */
    public static Object m97244F(C31555n1 c31555n1, C31552m1 c31552m1, int i13, boolean z4, Object obj, AbstractC31558o1 abstractC31558o1, AbstractC31558o1 abstractC31558o2) {
        int iMo97128b = abstractC31558o1.mo97128b(obj);
        int iMo97133h = abstractC31558o1.mo97133h();
        int i14 = 0;
        int iM97171d = iMo97128b;
        int iMo97128b2 = -1;
        while (i14 < iMo97133h && iMo97128b2 == -1) {
            C31555n1 c31555n2 = c31555n1;
            C31552m1 c31552m2 = c31552m1;
            int i15 = i13;
            boolean z13 = z4;
            AbstractC31558o1 abstractC31558o3 = abstractC31558o1;
            iM97171d = abstractC31558o3.m97171d(iM97171d, c31552m2, c31555n2, i15, z13);
            if (iM97171d == -1) {
                break;
            }
            iMo97128b2 = abstractC31558o2.mo97128b(abstractC31558o3.mo97135l(iM97171d));
            i14++;
            abstractC31558o1 = abstractC31558o3;
            c31552m1 = c31552m2;
            c31555n1 = c31555n2;
            i13 = i15;
            z4 = z13;
        }
        if (iMo97128b2 == -1) {
            return null;
        }
        return abstractC31558o2.mo97135l(iMo97128b2);
    }

    /* JADX INFO: renamed from: M */
    public static void m97245M(AbstractC31523d abstractC31523d, long j7) {
        abstractC31523d.f130108K = true;
        if (abstractC31523d instanceof C38472i) {
            C38472i c38472i = (C38472i) abstractC31523d;
            AbstractC24543a.m71573i(c38472i.f130108K);
            c38472i.f164775a0 = j7;
        }
    }

    /* JADX INFO: renamed from: q */
    public static boolean m97246q(AbstractC31523d abstractC31523d) {
        return abstractC31523d.f130103F != 0;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0094  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c3 A[PHI: r4 r5 r7
      0x00c3: PHI (r4v4 sn.v) = (r4v3 sn.v), (r4v10 sn.v) binds: [B:35:0x0098, B:37:0x00bd] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r5v2 long) = (r5v1 long), (r5v9 long) binds: [B:35:0x0098, B:37:0x00bd] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r7v3 long) = (r7v2 long), (r7v6 long) binds: [B:35:0x0098, B:37:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: A */
    public final void m97247A(boolean z4, boolean z13, boolean z14, boolean z15) {
        long j7;
        boolean z16;
        List list;
        this.f130483H.f95865a.removeMessages(2);
        this.f130515n0 = null;
        this.f130503b0 = false;
        C2847l c2847l = this.f130489N;
        c2847l.f11255y = false;
        C2849l1 c2849l1 = (C2849l1) c2847l.f11256z;
        if (c2849l1.f11315z) {
            c2849l1.m8244a(c2849l1.mo8165c());
            c2849l1.f11315z = false;
        }
        this.f130512k0 = 1000000000000L;
        for (AbstractC31523d abstractC31523d : this.f130517w) {
            try {
                m97272b(abstractC31523d);
            } catch (ExoPlaybackException | RuntimeException e5) {
                AbstractC24543a.m71578n("ExoPlayerImplInternal", "Disable failed.", e5);
            }
        }
        if (z4) {
            for (AbstractC31523d abstractC31523d2 : this.f130517w) {
                if (this.f130518x.remove(abstractC31523d2)) {
                    try {
                        abstractC31523d2.m97122v();
                    } catch (RuntimeException e13) {
                        AbstractC24543a.m71578n("ExoPlayerImplInternal", "Reset failed.", e13);
                    }
                }
            }
        }
        this.f130510i0 = 0;
        C31574v0 c31574v0 = this.f130498W;
        C32763v c32763v = c31574v0.f130442b;
        long jLongValue = c31574v0.f130459s;
        if (this.f130498W.f130442b.m102753a()) {
            j7 = this.f130498W.f130443c;
        } else {
            C31574v0 c31574v1 = this.f130498W;
            C31552m1 c31552m1 = this.f130487L;
            C32763v c32763v2 = c31574v1.f130442b;
            AbstractC31558o1 abstractC31558o1 = c31574v1.f130441a;
            if (abstractC31558o1.m97175p() || abstractC31558o1.mo97132g(c32763v2.f136238a, c31552m1).f130282F) {
                j7 = this.f130498W.f130443c;
            } else {
                j7 = this.f130498W.f130459s;
            }
        }
        if (z13) {
            this.f130511j0 = null;
            Pair pairM97284h = m97284h(this.f130498W.f130441a);
            c32763v = (C32763v) pairM97284h.first;
            jLongValue = ((Long) pairM97284h.second).longValue();
            j7 = -9223372036854775807L;
            if (c32763v.equals(this.f130498W.f130442b)) {
                z16 = false;
            } else {
                z16 = true;
            }
        } else {
            z16 = false;
        }
        long j13 = jLongValue;
        C32763v c32763v3 = c32763v;
        this.f130493R.m97178b();
        this.f130504c0 = false;
        C31574v0 c31574v2 = this.f130498W;
        AbstractC31558o1 abstractC31558o2 = c31574v2.f130441a;
        int i13 = c31574v2.f130445e;
        ExoPlaybackException exoPlaybackException = z15 ? null : c31574v2.f130446f;
        C32768x0 c32768x0 = z16 ? C32768x0.f136269z : c31574v2.f130448h;
        C20712x c20712x = z16 ? this.f130480E : c31574v2.f130449i;
        if (z16) {
            C41017e0 c41017e0 = AbstractC41023g0.f176998x;
            list = C41060w0.f177067E;
        } else {
            list = c31574v2.f130450j;
        }
        this.f130498W = new C31574v0(abstractC31558o2, c32763v3, j7, j13, i13, exoPlaybackException, false, c32768x0, c20712x, list, c32763v3, c31574v2.f130452l, c31574v2.f130453m, c31574v2.f130454n, j13, 0L, j13, this.f130509h0, false);
        if (z14) {
            C2819b1 c2819b1 = this.f130494S;
            HashMap map = c2819b1.f11032e;
            for (C31568s0 c31568s0 : map.values()) {
                try {
                    c31568s0.f130365a.m102695l(c31568s0.f130366b);
                } catch (RuntimeException e14) {
                    AbstractC24543a.m71578n("MediaSourceList", "Failed to release child source.", e14);
                }
                AbstractC32721a abstractC32721a = c31568s0.f130365a;
                C29662f c29662f = c31568s0.f130367c;
                abstractC32721a.m102698o(c29662f);
                c31568s0.f130365a.m102697n(c29662f);
            }
            map.clear();
            c2819b1.f11033f.clear();
            c2819b1.f11034g = false;
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m97248B() {
        C31554n0 c31554n0 = this.f130493R.f130345h;
        this.f130502a0 = c31554n0 != null && c31554n0.f130296f.f130333h && this.f130501Z;
    }

    /* JADX INFO: renamed from: C */
    public final void m97249C(long j7) {
        C31554n0 c31554n0 = this.f130493R.f130345h;
        long j13 = j7 + (c31554n0 == null ? 1000000000000L : c31554n0.f130305o);
        this.f130512k0 = j13;
        ((C2849l1) this.f130489N.f11256z).m8244a(j13);
        for (AbstractC31523d abstractC31523d : this.f130517w) {
            if (m97246q(abstractC31523d)) {
                long j14 = this.f130512k0;
                abstractC31523d.f130108K = false;
                abstractC31523d.f130107J = j14;
                abstractC31523d.mo49741n(j14, false);
            }
        }
        for (C31554n0 c31554n1 = r0.f130345h; c31554n1 != null; c31554n1 = c31554n1.f130302l) {
            for (InterfaceC20035o interfaceC20035o : c31554n1.f130304n.f77583c) {
                if (interfaceC20035o != null) {
                    interfaceC20035o.mo55872h();
                }
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m97250D(AbstractC31558o1 abstractC31558o1, AbstractC31558o1 abstractC31558o2) {
        if (abstractC31558o1.m97175p() && abstractC31558o2.m97175p()) {
            return;
        }
        ArrayList arrayList = this.f130490O;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            AbstractC30802r.m94771t(arrayList.get(size));
            throw null;
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m97251G(long j7, long j13) {
        C24564v c24564v = this.f130483H;
        c24564v.f95865a.removeMessages(2);
        c24564v.f95865a.sendEmptyMessageAtTime(2, j7 + j13);
    }

    /* JADX INFO: renamed from: H */
    public final void m97252H(boolean z4) throws ExoPlaybackException {
        C32763v c32763v = this.f130493R.f130345h.f130296f.f130326a;
        long jM97254J = m97254J(c32763v, this.f130498W.f130459s, true, false);
        if (jM97254J != this.f130498W.f130459s) {
            C31574v0 c31574v0 = this.f130498W;
            this.f130498W = m97291o(c32763v, jM97254J, c31574v0.f130443c, c31574v0.f130444d, z4, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x00a1 A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:31:0x00ad, B:33:0x00b3, B:34:0x00b6, B:36:0x00be, B:40:0x00ce, B:44:0x00d6), top: B:98:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ad A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:31:0x00ad, B:33:0x00b3, B:34:0x00b6, B:36:0x00be, B:40:0x00ce, B:44:0x00d6), top: B:98:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b3 A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:31:0x00ad, B:33:0x00b3, B:34:0x00b6, B:36:0x00be, B:40:0x00ce, B:44:0x00d6), top: B:98:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00be A[Catch: all -> 0x00a4, TRY_LEAVE, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:31:0x00ad, B:33:0x00b3, B:34:0x00b6, B:36:0x00be, B:40:0x00ce, B:44:0x00d6), top: B:98:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00df  */
    /* JADX WARN: Code duplicated, block: B:61:0x0110  */
    /* JADX WARN: Code duplicated, block: B:64:0x011a  */
    /* JADX WARN: Code duplicated, block: B:65:0x011c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0125  */
    /* JADX WARN: Code duplicated, block: B:70:0x0128  */
    /* JADX WARN: Code duplicated, block: B:74:0x0132  */
    /* JADX WARN: Code duplicated, block: B:75:0x0135  */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, sn.s] */
    /* JADX INFO: renamed from: I */
    public final void m97253I(C31579y c31579y) throws Throwable {
        long jLongValue;
        C32763v c32763vM97188m;
        long j7;
        boolean z4;
        long j13;
        long j14;
        C31554n0 c31554n0;
        long jMo102707v;
        C31574v0 c31574v0;
        int i13;
        long j15;
        boolean z13;
        C32763v c32763v;
        int i14;
        long j16;
        boolean z14;
        C31560p0 c31560p0;
        boolean z15;
        long jM97254J;
        boolean z16;
        boolean z17;
        C32763v c32763v2;
        long j17;
        C31581z c31581z = this;
        c31581z.f130499X.m97241a(1);
        Pair pairM97243E = m97243E(c31581z.f130498W.f130441a, c31579y, true, c31581z.f130505d0, c31581z.f130506e0, c31581z.f130486K, c31581z.f130487L);
        try {
            if (pairM97243E != null) {
                Object obj = pairM97243E.first;
                jLongValue = ((Long) pairM97243E.second).longValue();
                long j18 = c31579y.f130478c == -9223372036854775807L ? -9223372036854775807L : jLongValue;
                c32763vM97188m = c31581z.f130493R.m97188m(c31581z.f130498W.f130441a, obj, jLongValue);
                if (c32763vM97188m.m102753a()) {
                    c31581z.f130498W.f130441a.mo97132g(c32763vM97188m.f136238a, c31581z.f130487L);
                    jLongValue = c31581z.f130487L.m97155f(c32763vM97188m.f136239b) == c32763vM97188m.f136240c ? c31581z.f130487L.f130283G.f142383x : 0L;
                    z4 = true;
                    j13 = j18;
                } else {
                    j7 = 0;
                    z4 = c31579y.f130478c == -9223372036854775807L;
                    j13 = j18;
                }
                if (c31581z.f130498W.f130441a.m97175p()) {
                    if (pairM97243E == null) {
                        if (c31581z.f130498W.f130445e != 1) {
                            c31581z.m97266W(4);
                        }
                        c31581z.m97247A(false, true, false, true);
                    } else {
                        if (c32763vM97188m.equals(c31581z.f130498W.f130442b)) {
                            try {
                                c31554n0 = c31581z.f130493R.f130345h;
                                if (c31554n0 == null && c31554n0.f130294d && jLongValue != j7) {
                                    jMo102707v = c31554n0.f130291a.mo102707v(jLongValue, c31581z.f130497V);
                                } else {
                                    jMo102707v = jLongValue;
                                }
                                if (AbstractC24567y.m71669G(jMo102707v) != AbstractC24567y.m71669G(c31581z.f130498W.f130459s) && ((i13 = (c31574v0 = c31581z.f130498W).f130445e) == 2 || i13 == 3)) {
                                    j15 = c31574v0.f130459s;
                                    z13 = z4;
                                    c32763v = c32763vM97188m;
                                    i14 = 2;
                                    j16 = j15;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                c32763vM97188m = c32763vM97188m;
                                j14 = jLongValue;
                                c31581z.f130498W = c31581z.m97291o(c32763vM97188m, j14, j13, j14, z4, 2);
                                throw th;
                            }
                        } else {
                            jMo102707v = jLongValue;
                        }
                        try {
                            if (c31581z.f130498W.f130445e == 4) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            c31560p0 = c31581z.f130493R;
                            if (c31560p0.f130345h != c31560p0.f130346i) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            jM97254J = c31581z.m97254J(c32763vM97188m, jMo102707v, z15, z14);
                            if (jLongValue != jM97254J) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            z17 = z4 | z16;
                            try {
                                C31574v0 c31574v1 = c31581z.f130498W;
                                c32763v2 = c32763vM97188m;
                                try {
                                    AbstractC31558o1 abstractC31558o1 = c31574v1.f130441a;
                                    j17 = j13;
                                    try {
                                        c31581z.m97281f0(abstractC31558o1, c32763v2, abstractC31558o1, c31574v1.f130442b, j17);
                                        c32763v = c32763v2;
                                        j13 = j17;
                                        z13 = z17;
                                        j15 = jM97254J;
                                        i14 = 2;
                                        j16 = j15;
                                        c31581z = this;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        c32763vM97188m = c32763v2;
                                        j13 = j17;
                                        z4 = z17;
                                        j14 = jM97254J;
                                        c31581z.f130498W = c31581z.m97291o(c32763vM97188m, j14, j13, j14, z4, 2);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    c32763vM97188m = c32763v2;
                                    j13 = j13;
                                    z4 = z17;
                                    j14 = jM97254J;
                                    c31581z.f130498W = c31581z.m97291o(c32763vM97188m, j14, j13, j14, z4, 2);
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            j13 = j13;
                            j14 = jLongValue;
                            c31581z.f130498W = c31581z.m97291o(c32763vM97188m, j14, j13, j14, z4, 2);
                            throw th;
                        }
                    }
                    c31581z.f130498W = c31581z.m97291o(c32763v, j15, j13, j16, z13, i14);
                    return;
                }
                c31581z.f130511j0 = c31579y;
                z13 = z4;
                c32763v = c32763vM97188m;
                j15 = jLongValue;
                i14 = 2;
                j16 = j15;
                c31581z = this;
                c31581z.f130498W = c31581z.m97291o(c32763v, j15, j13, j16, z13, i14);
                return;
            }
            Pair pairM97284h = c31581z.m97284h(c31581z.f130498W.f130441a);
            c32763vM97188m = (C32763v) pairM97284h.first;
            jLongValue = ((Long) pairM97284h.second).longValue();
            z4 = !c31581z.f130498W.f130441a.m97175p();
            j13 = -9223372036854775807L;
            if (c31581z.f130498W.f130441a.m97175p()) {
                if (pairM97243E == null) {
                    if (c31581z.f130498W.f130445e != 1) {
                        c31581z.m97266W(4);
                    }
                    c31581z.m97247A(false, true, false, true);
                } else {
                    if (c32763vM97188m.equals(c31581z.f130498W.f130442b)) {
                        c31554n0 = c31581z.f130493R.f130345h;
                        if (c31554n0 == null) {
                            jMo102707v = jLongValue;
                        } else {
                            jMo102707v = jLongValue;
                        }
                        if (AbstractC24567y.m71669G(jMo102707v) != AbstractC24567y.m71669G(c31581z.f130498W.f130459s)) {
                        }
                    } else {
                        jMo102707v = jLongValue;
                    }
                    if (c31581z.f130498W.f130445e == 4) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    c31560p0 = c31581z.f130493R;
                    if (c31560p0.f130345h != c31560p0.f130346i) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    jM97254J = c31581z.m97254J(c32763vM97188m, jMo102707v, z15, z14);
                    if (jLongValue != jM97254J) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z4 | z16;
                    C31574v0 c31574v2 = c31581z.f130498W;
                    c32763v2 = c32763vM97188m;
                    AbstractC31558o1 abstractC31558o2 = c31574v2.f130441a;
                    j17 = j13;
                    c31581z.m97281f0(abstractC31558o2, c32763v2, abstractC31558o2, c31574v2.f130442b, j17);
                    c32763v = c32763v2;
                    j13 = j17;
                    z13 = z17;
                    j15 = jM97254J;
                    i14 = 2;
                    j16 = j15;
                    c31581z = this;
                }
                c31581z.f130498W = c31581z.m97291o(c32763v, j15, j13, j16, z13, i14);
                return;
            }
            c31581z.f130511j0 = c31579y;
            z13 = z4;
            c32763v = c32763vM97188m;
            j15 = jLongValue;
            i14 = 2;
            j16 = j15;
            c31581z = this;
            c31581z.f130498W = c31581z.m97291o(c32763v, j15, j13, j16, z13, i14);
            return;
        } catch (Throwable th8) {
            th = th8;
        }
        j7 = 0;
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, sn.s] */
    /* JADX INFO: renamed from: J */
    public final long m97254J(C32763v c32763v, long j7, boolean z4, boolean z13) throws ExoPlaybackException {
        m97273b0();
        this.f130503b0 = false;
        if (z13 || this.f130498W.f130445e == 3) {
            m97266W(2);
        }
        C31560p0 c31560p0 = this.f130493R;
        C31554n0 c31554n0 = c31560p0.f130345h;
        C31554n0 c31554n1 = c31554n0;
        while (c31554n1 != null && !c32763v.equals(c31554n1.f130296f.f130326a)) {
            c31554n1 = c31554n1.f130302l;
        }
        if (z4 || c31554n0 != c31554n1 || (c31554n1 != null && c31554n1.f130305o + j7 < 0)) {
            AbstractC31523d[] abstractC31523dArr = this.f130517w;
            for (AbstractC31523d abstractC31523d : abstractC31523dArr) {
                m97272b(abstractC31523d);
            }
            if (c31554n1 != null) {
                while (c31560p0.f130345h != c31554n1) {
                    c31560p0.m97177a();
                }
                c31560p0.m97187k(c31554n1);
                c31554n1.f130305o = 1000000000000L;
                m97278e(new boolean[abstractC31523dArr.length]);
            }
        }
        if (c31554n1 != null) {
            ?? r10 = c31554n1.f130291a;
            c31560p0.m97187k(c31554n1);
            if (!c31554n1.f130294d) {
                c31554n1.f130296f = c31554n1.f130296f.m97170b(j7);
            } else if (c31554n1.f130295e) {
                j7 = r10.mo102700e(j7);
                r10.mo102703i(j7 - this.f130488M);
            }
            m97249C(j7);
            m97294s();
        } else {
            c31560p0.m97178b();
            m97249C(j7);
        }
        m97287k(false);
        this.f130483H.m71650c(2);
        return j7;
    }

    /* JADX INFO: renamed from: K */
    public final void m97255K(C31525d1 c31525d1) {
        C24564v c24564v = this.f130483H;
        if (c31525d1.f130121f != this.f130485J) {
            c24564v.m71649a(15, c31525d1).m71647b();
            return;
        }
        synchronized (c31525d1) {
        }
        try {
            c31525d1.f130116a.mo75855a(c31525d1.f130119d, c31525d1.f130120e);
            c31525d1.m97124b(true);
            int i13 = this.f130498W.f130445e;
            if (i13 == 3 || i13 == 2) {
                c24564v.m71650c(2);
            }
        } catch (Throwable th3) {
            c31525d1.m97124b(true);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m97256L(C31525d1 c31525d1) {
        Looper looper = c31525d1.f130121f;
        if (!looper.getThread().isAlive()) {
            Log.w("TAG", "Trying to send message on a dead thread.");
            c31525d1.m97124b(false);
        } else {
            C24564v c24564vM71645a = this.f130491P.m71645a(looper, null);
            c24564vM71645a.f95865a.post(new RunnableC24693e(this, c31525d1));
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m97257N(boolean z4, AtomicBoolean atomicBoolean) {
        if (this.f130507f0 != z4) {
            this.f130507f0 = z4;
            if (!z4) {
                for (AbstractC31523d abstractC31523d : this.f130517w) {
                    if (!m97246q(abstractC31523d) && this.f130518x.remove(abstractC31523d)) {
                        abstractC31523d.m97122v();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m97258O(C31575w c31575w) throws Throwable {
        this.f130499X.m97241a(1);
        int i13 = c31575w.f130462c;
        C32762u0 c32762u0 = c31575w.f130461b;
        ArrayList arrayList = c31575w.f130460a;
        if (i13 != -1) {
            this.f130511j0 = new C31579y(new C31528e1(arrayList, c32762u0), c31575w.f130462c, c31575w.f130463d);
        }
        C2819b1 c2819b1 = this.f130494S;
        ArrayList arrayList2 = c2819b1.f11029b;
        c2819b1.m8034l(0, arrayList2.size());
        m97288l(c2819b1.m8023a(arrayList2.size(), arrayList, c32762u0), false);
    }

    /* JADX INFO: renamed from: P */
    public final void m97259P(boolean z4) {
        if (z4 == this.f130509h0) {
            return;
        }
        this.f130509h0 = z4;
        C31574v0 c31574v0 = this.f130498W;
        int i13 = c31574v0.f130445e;
        if (z4 || i13 == 4 || i13 == 1) {
            this.f130498W = c31574v0.m97235c(z4);
        } else {
            this.f130483H.m71650c(2);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m97260Q(boolean z4) throws ExoPlaybackException {
        this.f130501Z = z4;
        m97248B();
        if (this.f130502a0) {
            C31560p0 c31560p0 = this.f130493R;
            if (c31560p0.f130346i != c31560p0.f130345h) {
                m97252H(true);
                m97287k(false);
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m97261R(int i13, int i14, boolean z4, boolean z13) {
        this.f130499X.m97241a(z13 ? 1 : 0);
        C31577x c31577x = this.f130499X;
        c31577x.f130468a = true;
        c31577x.f130473f = true;
        c31577x.f130474g = i14;
        this.f130498W = this.f130498W.m97236d(i13, z4);
        this.f130503b0 = false;
        for (C31554n0 c31554n0 = this.f130493R.f130345h; c31554n0 != null; c31554n0 = c31554n0.f130302l) {
            for (InterfaceC20035o interfaceC20035o : c31554n0.f130304n.f77583c) {
                if (interfaceC20035o != null) {
                    interfaceC20035o.mo55873k(z4);
                }
            }
        }
        if (!m97267X()) {
            m97273b0();
            m97279e0();
            return;
        }
        int i15 = this.f130498W.f130445e;
        C24564v c24564v = this.f130483H;
        if (i15 == 3) {
            m97269Z();
            c24564v.m71650c(2);
        } else if (i15 == 2) {
            c24564v.m71650c(2);
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m97262S(C31576w0 c31576w0) {
        C2847l c2847l = this.f130489N;
        c2847l.mo8168f(c31576w0);
        C31576w0 c31576w0Mo8163b = c2847l.mo8163b();
        m97290n(c31576w0Mo8163b, c31576w0Mo8163b.f130465w, true, true);
    }

    /* JADX INFO: renamed from: T */
    public final void m97263T(int i13) throws ExoPlaybackException {
        this.f130505d0 = i13;
        AbstractC31558o1 abstractC31558o1 = this.f130498W.f130441a;
        C31560p0 c31560p0 = this.f130493R;
        c31560p0.f130343f = i13;
        if (!c31560p0.m97189n(abstractC31558o1)) {
            m97252H(true);
        }
        m97287k(false);
    }

    /* JADX INFO: renamed from: U */
    public final void m97264U(boolean z4) throws ExoPlaybackException {
        this.f130506e0 = z4;
        AbstractC31558o1 abstractC31558o1 = this.f130498W.f130441a;
        C31560p0 c31560p0 = this.f130493R;
        c31560p0.f130344g = z4;
        if (!c31560p0.m97189n(abstractC31558o1)) {
            m97252H(true);
        }
        m97287k(false);
    }

    /* JADX INFO: renamed from: V */
    public final void m97265V(C32762u0 c32762u0) throws Throwable {
        this.f130499X.m97241a(1);
        C2819b1 c2819b1 = this.f130494S;
        int size = c2819b1.f11029b.size();
        if (c32762u0.f136244b.length != size) {
            c32762u0 = new C32762u0(new Random(c32762u0.f136243a.nextLong())).m102754a(size);
        }
        c2819b1.f11039l = c32762u0;
        m97288l(c2819b1.m8025c(), false);
    }

    /* JADX INFO: renamed from: W */
    public final void m97266W(int i13) {
        C31574v0 c31574v0 = this.f130498W;
        if (c31574v0.f130445e != i13) {
            if (i13 != 2) {
                this.f130516o0 = -9223372036854775807L;
            }
            this.f130498W = c31574v0.m97239g(i13);
        }
    }

    /* JADX INFO: renamed from: X */
    public final boolean m97267X() {
        C31574v0 c31574v0 = this.f130498W;
        return c31574v0.f130452l && c31574v0.f130453m == 0;
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m97268Y(AbstractC31558o1 abstractC31558o1, C32763v c32763v) {
        if (c32763v.m102753a() || abstractC31558o1.m97175p()) {
            return false;
        }
        int i13 = abstractC31558o1.mo97132g(c32763v.f136238a, this.f130487L).f130286y;
        C31555n1 c31555n1 = this.f130486K;
        abstractC31558o1.m97174n(i13, c31555n1);
        return c31555n1.m97166a() && c31555n1.f130313I && c31555n1.f130310F != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: Z */
    public final void m97269Z() {
        this.f130503b0 = false;
        C2847l c2847l = this.f130489N;
        c2847l.f11255y = true;
        ((C2849l1) c2847l.f11256z).m8245g();
        for (AbstractC31523d abstractC31523d : this.f130517w) {
            if (m97246q(abstractC31523d)) {
                AbstractC24543a.m71573i(abstractC31523d.f130103F == 1);
                abstractC31523d.f130103F = 2;
                abstractC31523d.mo75859p();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m97270a(C31575w c31575w, int i13) throws Throwable {
        this.f130499X.m97241a(1);
        C2819b1 c2819b1 = this.f130494S;
        if (i13 == -1) {
            i13 = c2819b1.f11029b.size();
        }
        m97288l(c2819b1.m8023a(i13, c31575w.f130460a, c31575w.f130461b), false);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m97271a0(boolean z4, boolean z13) {
        m97247A(z4 || !this.f130507f0, false, true, false);
        this.f130499X.m97241a(z13 ? 1 : 0);
        this.f130481F.m97141b(true);
        m97266W(1);
    }

    /* JADX INFO: renamed from: b */
    public final void m97272b(AbstractC31523d abstractC31523d) {
        if (m97246q(abstractC31523d)) {
            C2847l c2847l = this.f130489N;
            if (abstractC31523d == ((AbstractC31523d) c2847l.f11251F)) {
                c2847l.f11252G = null;
                c2847l.f11251F = null;
                c2847l.f11254x = true;
            }
            int i13 = abstractC31523d.f130103F;
            if (i13 == 2) {
                AbstractC24543a.m71573i(i13 == 2);
                abstractC31523d.f130103F = 1;
                abstractC31523d.mo75860q();
            }
            AbstractC24543a.m71573i(abstractC31523d.f130103F == 1);
            abstractC31523d.f130111x.m123175j();
            abstractC31523d.f130103F = 0;
            abstractC31523d.f130104G = null;
            abstractC31523d.f130105H = null;
            abstractC31523d.f130108K = false;
            abstractC31523d.mo54421l();
            this.f130510i0--;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m97273b0() {
        int i13;
        C2847l c2847l = this.f130489N;
        c2847l.f11255y = false;
        C2849l1 c2849l1 = (C2849l1) c2847l.f11256z;
        if (c2849l1.f11315z) {
            c2849l1.m8244a(c2849l1.mo8165c());
            c2849l1.f11315z = false;
        }
        for (AbstractC31523d abstractC31523d : this.f130517w) {
            if (m97246q(abstractC31523d) && (i13 = abstractC31523d.f130103F) == 2) {
                AbstractC24543a.m71573i(i13 == 2);
                abstractC31523d.f130103F = 1;
                abstractC31523d.mo75860q();
            }
        }
    }

    @Override // sn.InterfaceC32758s0
    /* JADX INFO: renamed from: c */
    public final void mo97274c(InterfaceC32760t0 interfaceC32760t0) {
        this.f130483H.m71649a(9, (InterfaceC32757s) interfaceC32760t0).m71647b();
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, sn.t0] */
    /* JADX INFO: renamed from: c0 */
    public final void m97275c0() {
        C31554n0 c31554n0 = this.f130493R.f130347j;
        boolean z4 = this.f130504c0 || (c31554n0 != null && c31554n0.f130291a.mo91531a());
        C31574v0 c31574v0 = this.f130498W;
        if (z4 != c31574v0.f130447g) {
            this.f130498W = new C31574v0(c31574v0.f130441a, c31574v0.f130442b, c31574v0.f130443c, c31574v0.f130444d, c31574v0.f130445e, c31574v0.f130446f, z4, c31574v0.f130448h, c31574v0.f130449i, c31574v0.f130450j, c31574v0.f130451k, c31574v0.f130452l, c31574v0.f130453m, c31574v0.f130454n, c31574v0.f130457q, c31574v0.f130458r, c31574v0.f130459s, c31574v0.f130455o, c31574v0.f130456p);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r5v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v18 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v18 ??, new type: long
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
    /* JADX WARN: Failed to calculate best type for var: r7v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v11 ??, new type: long
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
    /* JADX WARN: Failed to calculate best type for var: r7v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v12 ??, new type: long
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
    /* JADX WARN: Failed to calculate best type for var: r7v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v8 ??, new type: long
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
    /* JADX WARN: Failed to calculate best type for var: r7v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v9 ??, new type: long
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
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v18 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    /* JADX INFO: renamed from: d */
    public final void m97276d() throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            Method dump skipped, instruction units count: 1748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p465rm.C31581z.m97276d():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: d0 */
    public final void m97277d0(C20712x c20712x) {
        InterfaceC20035o[] interfaceC20035oArr = c20712x.f77583c;
        C31535h c31535h = this.f130481F;
        int iMax = c31535h.f130157f;
        if (iMax == -1) {
            int i13 = 0;
            int i14 = 0;
            while (true) {
                AbstractC31523d[] abstractC31523dArr = this.f130517w;
                int i15 = 13107200;
                if (i13 < abstractC31523dArr.length) {
                    if (interfaceC20035oArr[i13] != null) {
                        switch (abstractC31523dArr[i13].f130110w) {
                            case 0:
                                i15 = 144310272;
                                i14 += i15;
                                break;
                            case 1:
                                i14 += i15;
                                break;
                            case 2:
                                i15 = 131072000;
                                i14 += i15;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i15 = 131072;
                                i14 += i15;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i13++;
                } else {
                    iMax = Math.max(13107200, i14);
                }
            }
        }
        c31535h.f130159h = iMax;
        c31535h.f130152a.m65566a(iMax);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0112  */
    /* JADX INFO: renamed from: e */
    public final void m97278e(boolean[] zArr) throws ExoPlaybackException {
        AbstractC31523d[] abstractC31523dArr;
        Set set;
        C20712x c20712x;
        int i13;
        AbstractC31523d[] abstractC31523dArr2;
        InterfaceC24554l interfaceC24554l;
        C31560p0 c31560p0 = this.f130493R;
        C31554n0 c31554n0 = c31560p0.f130346i;
        C20712x c20712x2 = c31554n0.f130304n;
        int i14 = 0;
        while (true) {
            abstractC31523dArr = this.f130517w;
            int length = abstractC31523dArr.length;
            set = this.f130518x;
            if (i14 >= length) {
                break;
            }
            if (!c20712x2.m56901b(i14) && set.remove(abstractC31523dArr[i14])) {
                abstractC31523dArr[i14].m97122v();
            }
            i14++;
        }
        int i15 = 0;
        while (i15 < abstractC31523dArr.length) {
            if (c20712x2.m56901b(i15)) {
                boolean z4 = zArr[i15];
                AbstractC31523d abstractC31523d = abstractC31523dArr[i15];
                if (m97246q(abstractC31523d)) {
                    c20712x = c20712x2;
                    i13 = i15;
                    abstractC31523dArr2 = abstractC31523dArr;
                } else {
                    C31554n0 c31554n1 = c31560p0.f130346i;
                    boolean z13 = c31554n1 == c31560p0.f130345h;
                    C20712x c20712x3 = c31554n1.f130304n;
                    C31534g1 c31534g1 = c20712x3.f77582b[i15];
                    InterfaceC20035o interfaceC20035o = c20712x3.f77583c[i15];
                    int length2 = interfaceC20035o != null ? interfaceC20035o.length() : 0;
                    C31521c0[] c31521c0Arr = new C31521c0[length2];
                    for (int i16 = 0; i16 < length2; i16++) {
                        c31521c0Arr[i16] = interfaceC20035o.mo54499d(i16);
                    }
                    boolean z14 = m97267X() && this.f130498W.f130445e == 3;
                    boolean z15 = !z4 && z14;
                    this.f130510i0++;
                    set.add(abstractC31523d);
                    InterfaceC32756r0 interfaceC32756r0 = c31554n1.f130293c[i15];
                    c20712x = c20712x2;
                    long j7 = this.f130512k0;
                    long jM97162e = c31554n1.m97162e();
                    i13 = i15;
                    abstractC31523dArr2 = abstractC31523dArr;
                    long j13 = c31554n1.f130305o;
                    AbstractC24543a.m71573i(abstractC31523d.f130103F == 0);
                    abstractC31523d.f130112y = c31534g1;
                    abstractC31523d.f130103F = 1;
                    abstractC31523d.mo75856m(z15, z13);
                    abstractC31523d.m97121u(c31521c0Arr, interfaceC32756r0, jM97162e, j13);
                    abstractC31523d.f130108K = false;
                    abstractC31523d.f130107J = j7;
                    abstractC31523d.mo49741n(j7, z15);
                    abstractC31523d.mo75855a(11, new C31573v(this));
                    C2847l c2847l = this.f130489N;
                    c2847l.getClass();
                    InterfaceC24554l interfaceC24554lMo97118g = abstractC31523d.mo97118g();
                    if (interfaceC24554lMo97118g != null && interfaceC24554lMo97118g != (interfaceC24554l = (InterfaceC24554l) c2847l.f11252G)) {
                        if (interfaceC24554l != null) {
                            throw new ExoPlaybackException(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                        c2847l.f11252G = interfaceC24554lMo97118g;
                        c2847l.f11251F = abstractC31523d;
                        ((C33944v) interfaceC24554lMo97118g).mo8168f((C31576w0) ((C2849l1) c2847l.f11256z).f11311F);
                    }
                    if (z14) {
                        AbstractC24543a.m71573i(abstractC31523d.f130103F == 1);
                        abstractC31523d.f130103F = 2;
                        abstractC31523d.mo75859p();
                    }
                }
            } else {
                c20712x = c20712x2;
                i13 = i15;
                abstractC31523dArr2 = abstractC31523dArr;
            }
            i15 = i13 + 1;
            c20712x2 = c20712x;
            abstractC31523dArr = abstractC31523dArr2;
        }
        c31554n0.f130297g = true;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b0  */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, sn.s] */
    /* JADX INFO: renamed from: e0 */
    public final void m97279e0() {
        C31576w0 c31576w0Mo8163b;
        C31554n0 c31554n0 = this.f130493R.f130345h;
        if (c31554n0 == null) {
            return;
        }
        long jMo102701f = c31554n0.f130294d ? c31554n0.f130291a.mo102701f() : -9223372036854775807L;
        if (jMo102701f != -9223372036854775807L) {
            m97249C(jMo102701f);
            if (jMo102701f != this.f130498W.f130459s) {
                C31574v0 c31574v0 = this.f130498W;
                this.f130498W = m97291o(c31574v0.f130442b, jMo102701f, c31574v0.f130443c, jMo102701f, true, 5);
            }
        } else {
            C2847l c2847l = this.f130489N;
            boolean z4 = c31554n0 != this.f130493R.f130346i;
            C2849l1 c2849l1 = (C2849l1) c2847l.f11256z;
            AbstractC31523d abstractC31523d = (AbstractC31523d) c2847l.f11251F;
            if (abstractC31523d == null || abstractC31523d.mo49735j() || (!((AbstractC31523d) c2847l.f11251F).mo49737k() && (z4 || ((AbstractC31523d) c2847l.f11251F).m97119i()))) {
                c2847l.f11254x = true;
                if (c2847l.f11255y) {
                    c2849l1.m8245g();
                }
            } else {
                InterfaceC24554l interfaceC24554l = (InterfaceC24554l) c2847l.f11252G;
                interfaceC24554l.getClass();
                long jMo8165c = interfaceC24554l.mo8165c();
                if (!c2847l.f11254x) {
                    c2849l1.m8244a(jMo8165c);
                    c31576w0Mo8163b = interfaceC24554l.mo8163b();
                    if (!c31576w0Mo8163b.equals((C31576w0) c2849l1.f11311F)) {
                        c2849l1.mo8168f(c31576w0Mo8163b);
                        ((C31581z) c2847l.f11250E).f130483H.m71649a(16, c31576w0Mo8163b).m71647b();
                    }
                } else if (jMo8165c >= c2849l1.mo8165c()) {
                    c2847l.f11254x = false;
                    if (c2847l.f11255y) {
                        c2849l1.m8245g();
                    }
                    c2849l1.m8244a(jMo8165c);
                    c31576w0Mo8163b = interfaceC24554l.mo8163b();
                    if (!c31576w0Mo8163b.equals((C31576w0) c2849l1.f11311F)) {
                        c2849l1.mo8168f(c31576w0Mo8163b);
                        ((C31581z) c2847l.f11250E).f130483H.m71649a(16, c31576w0Mo8163b).m71647b();
                    }
                } else if (c2849l1.f11315z) {
                    c2849l1.m8244a(c2849l1.mo8165c());
                    c2849l1.f11315z = false;
                }
            }
            long jMo8165c2 = c2847l.mo8165c();
            this.f130512k0 = jMo8165c2;
            long j7 = jMo8165c2 - c31554n0.f130305o;
            long j13 = this.f130498W.f130459s;
            if (!this.f130490O.isEmpty() && !this.f130498W.f130442b.m102753a()) {
                if (this.f130514m0) {
                    this.f130514m0 = false;
                }
                C31574v0 c31574v1 = this.f130498W;
                c31574v1.f130441a.mo97128b(c31574v1.f130442b.f136238a);
                int iMin = Math.min(this.f130513l0, this.f130490O.size());
                if (iMin > 0 && this.f130490O.get(iMin - 1) != null) {
                    throw new ClassCastException();
                }
                if (iMin < this.f130490O.size() && this.f130490O.get(iMin) != null) {
                    throw new ClassCastException();
                }
                this.f130513l0 = iMin;
            }
            this.f130498W.f130459s = j7;
        }
        this.f130498W.f130457q = this.f130493R.f130347j.m97161d();
        C31574v0 c31574v2 = this.f130498W;
        long j14 = c31574v2.f130457q;
        C31554n0 c31554n1 = this.f130493R.f130347j;
        c31574v2.f130458r = c31554n1 == null ? 0L : Math.max(0L, j14 - (this.f130512k0 - c31554n1.f130305o));
        C31574v0 c31574v3 = this.f130498W;
        if (c31574v3.f130452l && c31574v3.f130445e == 3 && m97268Y(c31574v3.f130441a, c31574v3.f130442b)) {
            C31574v0 c31574v4 = this.f130498W;
            float f13 = 1.0f;
            if (c31574v4.f130454n.f130465w == 1.0f) {
                C2838i c2838i = this.f130495T;
                long jM97280f = m97280f(c31574v4.f130441a, c31574v4.f130442b.f136238a, c31574v4.f130459s);
                long j15 = this.f130498W.f130457q;
                C31554n0 c31554n2 = this.f130493R.f130347j;
                long jMax = c31554n2 == null ? 0L : Math.max(0L, j15 - (this.f130512k0 - c31554n2.f130305o));
                if (c2838i.f11202d != r10) {
                    long j16 = jM97280f - jMax;
                    long j17 = c2838i.f11212n;
                    if (j17 == r10) {
                        c2838i.f11212n = j16;
                        c2838i.f11213o = 0L;
                    } else {
                        long jMax2 = Math.max(j16, (long) ((j16 * 9.999871E-4f) + (j17 * 0.999f)));
                        c2838i.f11212n = jMax2;
                        c2838i.f11213o = (long) ((9.999871E-4f * Math.abs(j16 - jMax2)) + (0.999f * c2838i.f11213o));
                    }
                    if (c2838i.f11211m == r10 || SystemClock.elapsedRealtime() - c2838i.f11211m >= 1000) {
                        c2838i.f11211m = SystemClock.elapsedRealtime();
                        long j18 = (c2838i.f11213o * 3) + c2838i.f11212n;
                        if (c2838i.f11207i > j18) {
                            float fM71695z = AbstractC24567y.m71695z(1000L);
                            c2838i.f11207i = AbstractC36259c.m115694i0(j18, c2838i.f11204f, c2838i.f11207i - (((long) ((c2838i.f11210l - 1.0f) * fM71695z)) + ((long) ((c2838i.f11208j - 1.0f) * fM71695z))));
                        } else {
                            long jM71678i = AbstractC24567y.m71678i(jM97280f - ((long) (Math.max(0.0f, c2838i.f11210l - 1.0f) / 1.0E-7f)), c2838i.f11207i, j18);
                            c2838i.f11207i = jM71678i;
                            long j19 = c2838i.f11206h;
                            if (j19 != -9223372036854775807 && jM71678i > j19) {
                                c2838i.f11207i = j19;
                            }
                        }
                        long j24 = jM97280f - c2838i.f11207i;
                        if (Math.abs(j24) < c2838i.f11200b) {
                            c2838i.f11210l = 1.0f;
                        } else {
                            c2838i.f11210l = AbstractC24567y.m71676g((1.0E-7f * j24) + 1.0f, c2838i.f11209k, c2838i.f11208j);
                        }
                        f13 = c2838i.f11210l;
                    } else {
                        f13 = c2838i.f11210l;
                    }
                }
                if (this.f130489N.mo8163b().f130465w != f13) {
                    this.f130489N.mo8168f(new C31576w0(f13, this.f130498W.f130454n.f130466x));
                    m97290n(this.f130498W.f130454n, this.f130489N.mo8163b().f130465w, false, false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final long m97280f(AbstractC31558o1 abstractC31558o1, Object obj, long j7) {
        C31552m1 c31552m1 = this.f130487L;
        int i13 = abstractC31558o1.mo97132g(obj, c31552m1).f130286y;
        C31555n1 c31555n1 = this.f130486K;
        abstractC31558o1.m97174n(i13, c31555n1);
        if (c31555n1.f130310F == -9223372036854775807L || !c31555n1.m97166a() || !c31555n1.f130313I) {
            return -9223372036854775807L;
        }
        long j13 = c31555n1.f130311G;
        int i14 = AbstractC24567y.f95875a;
        return AbstractC24567y.m71695z((j13 == -9223372036854775807L ? System.currentTimeMillis() : j13 + SystemClock.elapsedRealtime()) - c31555n1.f130310F) - (j7 + c31552m1.f130281E);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m97281f0(AbstractC31558o1 abstractC31558o1, C32763v c32763v, AbstractC31558o1 abstractC31558o2, C32763v c32763v2, long j7) {
        boolean zM97268Y = m97268Y(abstractC31558o1, c32763v);
        Object obj = c32763v.f136238a;
        if (!zM97268Y) {
            C31576w0 c31576w0 = c32763v.m102753a() ? C31576w0.f130464z : this.f130498W.f130454n;
            C2847l c2847l = this.f130489N;
            if (c2847l.mo8163b().equals(c31576w0)) {
                return;
            }
            c2847l.mo8168f(c31576w0);
            return;
        }
        C31552m1 c31552m1 = this.f130487L;
        int i13 = abstractC31558o1.mo97132g(obj, c31552m1).f130286y;
        C31555n1 c31555n1 = this.f130486K;
        abstractC31558o1.m97174n(i13, c31555n1);
        C31536h0 c31536h0 = c31555n1.f130315K;
        int i14 = AbstractC24567y.f95875a;
        C2838i c2838i = this.f130495T;
        c2838i.getClass();
        c2838i.f11202d = AbstractC24567y.m71695z(c31536h0.f130163w);
        c2838i.f11205g = AbstractC24567y.m71695z(c31536h0.f130164x);
        c2838i.f11206h = AbstractC24567y.m71695z(c31536h0.f130165y);
        float f13 = c31536h0.f130166z;
        if (f13 == -3.4028235E38f) {
            f13 = 0.97f;
        }
        c2838i.f11209k = f13;
        float f14 = c31536h0.f130162E;
        if (f14 == -3.4028235E38f) {
            f14 = 1.03f;
        }
        c2838i.f11208j = f14;
        if (f13 == 1.0f && f14 == 1.0f) {
            c2838i.f11202d = -9223372036854775807L;
        }
        c2838i.m8142a();
        if (j7 != -9223372036854775807L) {
            c2838i.f11203e = m97280f(abstractC31558o1, obj, j7);
            c2838i.m8142a();
            return;
        }
        if (AbstractC24567y.m71670a(!abstractC31558o2.m97175p() ? abstractC31558o2.mo97136m(abstractC31558o2.mo97132g(c32763v2.f136238a, c31552m1).f130286y, c31555n1, 0L).f130322w : null, c31555n1.f130322w)) {
            return;
        }
        c2838i.f11203e = -9223372036854775807L;
        c2838i.m8142a();
    }

    @Override // sn.InterfaceC32755r
    /* JADX INFO: renamed from: g */
    public final void mo97282g(InterfaceC32757s interfaceC32757s) {
        this.f130483H.m71649a(8, interfaceC32757s).m71647b();
    }

    /* JADX INFO: renamed from: g0 */
    public final synchronized void m97283g0(C2853n c2853n, long j7) {
        this.f130491P.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j7;
        boolean z4 = false;
        while (!((Boolean) c2853n.get()).booleanValue() && j7 > 0) {
            try {
                this.f130491P.getClass();
                wait(j7);
            } catch (InterruptedException unused) {
                z4 = true;
            }
            this.f130491P.getClass();
            j7 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: h */
    public final Pair m97284h(AbstractC31558o1 abstractC31558o1) {
        if (abstractC31558o1.m97175p()) {
            return Pair.create(C31574v0.f130440t, 0L);
        }
        Pair pairM97172i = abstractC31558o1.m97172i(this.f130486K, this.f130487L, abstractC31558o1.mo97127a(this.f130506e0), -9223372036854775807L);
        C32763v c32763vM97188m = this.f130493R.m97188m(abstractC31558o1, pairM97172i.first, 0L);
        long jLongValue = ((Long) pairM97172i.second).longValue();
        if (c32763vM97188m.m102753a()) {
            Object obj = c32763vM97188m.f136238a;
            C31552m1 c31552m1 = this.f130487L;
            abstractC31558o1.mo97132g(obj, c31552m1);
            jLongValue = c32763vM97188m.f136240c == c31552m1.m97155f(c32763vM97188m.f136239b) ? c31552m1.f130283G.f142383x : 0L;
        }
        return Pair.create(c32763vM97188m, Long.valueOf(jLongValue));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i13;
        C31554n0 c31554n0;
        int i14 = 1000;
        try {
            switch (message.what) {
                case 0:
                    m97298w();
                    break;
                case 1:
                    m97261R(message.arg2, 1, message.arg1 != 0, true);
                    break;
                case 2:
                    m97276d();
                    break;
                case 3:
                    m97253I((C31579y) message.obj);
                    break;
                case 4:
                    m97262S((C31576w0) message.obj);
                    break;
                case 5:
                    this.f130497V = (C31537h1) message.obj;
                    break;
                case 6:
                    m97271a0(false, true);
                    break;
                case 7:
                    m97299x();
                    return true;
                case 8:
                    m97289m((InterfaceC32757s) message.obj);
                    break;
                case 9:
                    m97285i((InterfaceC32757s) message.obj);
                    break;
                case 10:
                    m97301z();
                    break;
                case 11:
                    m97263T(message.arg1);
                    break;
                case 12:
                    m97264U(message.arg1 != 0);
                    break;
                case 13:
                    m97257N(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    C31525d1 c31525d1 = (C31525d1) message.obj;
                    c31525d1.getClass();
                    m97255K(c31525d1);
                    break;
                case 15:
                    m97256L((C31525d1) message.obj);
                    break;
                case 16:
                    C31576w0 c31576w0 = (C31576w0) message.obj;
                    m97290n(c31576w0, c31576w0.f130465w, true, false);
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    m97258O((C31575w) message.obj);
                    break;
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                    m97270a((C31575w) message.obj, message.arg1);
                    break;
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    AbstractC30802r.m94771t(message.obj);
                    m97297v();
                    throw null;
                case 20:
                    m97300y(message.arg1, message.arg2, (C32762u0) message.obj);
                    break;
                case 21:
                    m97265V((C32762u0) message.obj);
                    break;
                case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    m97296u();
                    break;
                case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                    m97260Q(message.arg1 != 0);
                    break;
                case 24:
                    m97259P(message.arg1 == 1);
                    break;
                case 25:
                    m97252H(true);
                    break;
                default:
                    return false;
            }
        } catch (ExoPlaybackException e5) {
            e = e5;
            if (e.f20370y == 1 && (c31554n0 = this.f130493R.f130346i) != null) {
                e = e.m15561a(c31554n0.f130296f.f130326a);
            }
            if (e.f20369I && this.f130515n0 == null) {
                AbstractC24543a.m71564F("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.f130515n0 = e;
                C24564v c24564v = this.f130483H;
                C24563u c24563uM71649a = c24564v.m71649a(25, e);
                Handler handler = c24564v.f95865a;
                Message message2 = c24563uM71649a.f95863a;
                message2.getClass();
                handler.sendMessageAtFrontOfQueue(message2);
                c24563uM71649a.m71646a();
            } else {
                ExoPlaybackException exoPlaybackException = this.f130515n0;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.f130515n0;
                }
                AbstractC24543a.m71578n("ExoPlayerImplInternal", "Playback error", e);
                m97271a0(true, false);
                this.f130498W = this.f130498W.m97237e(e);
            }
        } catch (ParserException e13) {
            boolean z4 = e13.f20372w;
            int i15 = e13.f20373x;
            if (i15 == 1) {
                i13 = z4 ? ErrorCodes.TracksErrors.cCantAccessCaptureDevice : 3003;
            } else {
                if (i15 == 4) {
                    i13 = z4 ? 3002 : ErrorCodes.TracksErrors.cPeerConnectionFactoryDisposed;
                }
                m97286j(e13, i14);
            }
            i14 = i13;
            m97286j(e13, i14);
        } catch (DrmSession$DrmSessionException e14) {
            m97286j(e14, e14.f20381w);
        } catch (BehindLiveWindowException e15) {
            m97286j(e15, 1002);
        } catch (DataSourceException e16) {
            m97286j(e16, e16.f20437w);
        } catch (IOException e17) {
            m97286j(e17, ErrorCodes.InitAPIErrors.cServerErrors);
        } catch (RuntimeException e18) {
            ExoPlaybackException exoPlaybackException2 = new ExoPlaybackException(2, e18, ((e18 instanceof IllegalStateException) || (e18 instanceof IllegalArgumentException)) ? MessageListItemViewType.CUSTOM_ATTACHMENTS : 1000);
            AbstractC24543a.m71578n("ExoPlayerImplInternal", "Playback error", exoPlaybackException2);
            m97271a0(true, false);
            this.f130498W = this.f130498W.m97237e(exoPlaybackException2);
        }
        m97295t();
        return true;
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, sn.t0] */
    /* JADX INFO: renamed from: i */
    public final void m97285i(InterfaceC32757s interfaceC32757s) {
        C31554n0 c31554n0 = this.f130493R.f130347j;
        if (c31554n0 == null || c31554n0.f130291a != interfaceC32757s) {
            return;
        }
        long j7 = this.f130512k0;
        if (c31554n0 != null) {
            AbstractC24543a.m71573i(c31554n0.f130302l == null);
            if (c31554n0.f130294d) {
                c31554n0.f130291a.mo91534n(j7 - c31554n0.f130305o);
            }
        }
        m97294s();
    }

    /* JADX INFO: renamed from: j */
    public final void m97286j(IOException iOException, int i13) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i13);
        C31554n0 c31554n0 = this.f130493R.f130345h;
        if (c31554n0 != null) {
            exoPlaybackException = exoPlaybackException.m15561a(c31554n0.f130296f.f130326a);
        }
        AbstractC24543a.m71578n("ExoPlayerImplInternal", "Playback error", exoPlaybackException);
        m97271a0(false, false);
        this.f130498W = this.f130498W.m97237e(exoPlaybackException);
    }

    /* JADX INFO: renamed from: k */
    public final void m97287k(boolean z4) {
        C31554n0 c31554n0 = this.f130493R.f130347j;
        C32763v c32763v = c31554n0 == null ? this.f130498W.f130442b : c31554n0.f130296f.f130326a;
        boolean zEquals = this.f130498W.f130451k.equals(c32763v);
        if (!zEquals) {
            this.f130498W = this.f130498W.m97233a(c32763v);
        }
        C31574v0 c31574v0 = this.f130498W;
        c31574v0.f130457q = c31554n0 == null ? c31574v0.f130459s : c31554n0.m97161d();
        C31574v0 c31574v1 = this.f130498W;
        long j7 = c31574v1.f130457q;
        C31554n0 c31554n1 = this.f130493R.f130347j;
        c31574v1.f130458r = c31554n1 != null ? Math.max(0L, j7 - (this.f130512k0 - c31554n1.f130305o)) : 0L;
        if ((!zEquals || z4) && c31554n0 != null && c31554n0.f130294d) {
            m97277d0(c31554n0.f130304n);
        }
    }

    /* JADX WARN: Code duplicated, block: B:166:0x0303 A[Catch: all -> 0x0309, TRY_ENTER, TryCatch #5 {all -> 0x0309, blocks: (B:166:0x0303, B:179:0x0321, B:181:0x032b, B:183:0x0331, B:185:0x033b, B:186:0x0348), top: B:270:0x028e }] */
    /* JADX WARN: Code duplicated, block: B:201:0x036e  */
    /* JADX WARN: Code duplicated, block: B:202:0x0372  */
    /* JADX WARN: Code duplicated, block: B:205:0x037b  */
    /* JADX WARN: Code duplicated, block: B:209:0x0386  */
    /* JADX WARN: Code duplicated, block: B:211:0x0390 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:217:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:220:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:222:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:226:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v45, types: [rm.v0] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v16 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v20 */
    /* JADX WARN: Type inference failed for: r19v21 */
    /* JADX WARN: Type inference failed for: r19v22 */
    /* JADX WARN: Type inference failed for: r19v23 */
    /* JADX WARN: Type inference failed for: r19v24 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r2v23, types: [rm.o1] */
    /* JADX WARN: Type inference failed for: r2v28, types: [rm.v0] */
    /* JADX WARN: Type inference failed for: r2v53, types: [rm.p0] */
    /* JADX WARN: Type inference failed for: r39v0, types: [rm.z] */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v69 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v40, types: [rm.o1] */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r9v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: l */
    public final void m97288l(AbstractC31558o1 abstractC31558o1, boolean z4) throws Throwable {
        Object obj;
        C31555n1 c31555n1;
        long j7;
        int iMo97127a;
        int i13;
        boolean z13;
        boolean z14;
        boolean z15;
        int iMo97127a2;
        boolean z16;
        AbstractC31558o1 abstractC31558o2;
        long j13;
        ?? r10;
        boolean z17;
        long j14;
        C2842j0 c2842j0;
        int i14;
        long jLongValue;
        boolean z18;
        int i15;
        boolean z19;
        boolean z24;
        long j15;
        int iMo97127a3;
        boolean z25;
        ?? r19;
        ?? r14;
        C32763v c32763v;
        long j16;
        ?? r15;
        ?? r110;
        boolean z26;
        boolean z27;
        ?? r111;
        ?? r16;
        ?? r17;
        long j17;
        AbstractC31523d[] abstractC31523dArr;
        C31560p0 c31560p0;
        AbstractC31558o1 abstractC31558o3;
        ?? r112;
        ?? r18;
        ?? r24;
        long j18;
        Object obj2;
        ?? r25;
        int i16;
        ?? r113;
        ?? r114;
        ?? r26;
        C31574v0 c31574v0 = this.f130498W;
        C31579y c31579y = this.f130511j0;
        C31560p0 c31560p1 = this.f130493R;
        int i17 = this.f130505d0;
        boolean z28 = this.f130506e0;
        C31555n1 c31555n2 = this.f130486K;
        C31552m1 c31552m1 = this.f130487L;
        boolean z29 = 4;
        if (abstractC31558o1.m97175p()) {
            C32763v c32763v2 = C31574v0.f130440t;
            abstractC31558o2 = abstractC31558o1;
            c2842j0 = new C2842j0(c32763v2, 0L, -9223372036854775807L, false, true, false);
            j7 = 0;
            r19 = c32763v2;
        } else {
            C32763v c32763v3 = c31574v0.f130442b;
            Object obj3 = c32763v3.f136238a;
            AbstractC31558o1 abstractC31558o4 = c31574v0.f130441a;
            boolean zM97175p = abstractC31558o4.m97175p();
            boolean z34 = zM97175p || abstractC31558o4.mo97132g(c32763v3.f136238a, c31552m1).f130282F;
            long jLongValue2 = (c31574v0.f130442b.m102753a() || z34) ? c31574v0.f130443c : c31574v0.f130459s;
            if (c31579y != null) {
                Pair pairM97243E = m97243E(abstractC31558o1, c31579y, true, i17, z28, c31555n2, c31552m1);
                if (pairM97243E == null) {
                    iMo97127a3 = abstractC31558o1.mo97127a(z28);
                    j15 = jLongValue2;
                    obj = obj3;
                    z24 = false;
                    z25 = true;
                    z19 = false;
                } else {
                    if (c31579y.f130478c == -9223372036854775807L) {
                        jLongValue = jLongValue2;
                        obj = obj3;
                        z18 = false;
                        i15 = abstractC31558o1.mo97132g(pairM97243E.first, c31552m1).f130286y;
                    } else {
                        obj = pairM97243E.first;
                        jLongValue = ((Long) pairM97243E.second).longValue();
                        z18 = true;
                        i15 = -1;
                    }
                    z19 = z18;
                    z24 = c31574v0.f130445e == 4;
                    j15 = jLongValue;
                    iMo97127a3 = i15;
                    z25 = false;
                }
                z13 = z24;
                z14 = z25;
                z15 = z19;
                iMo97127a = iMo97127a3;
                i13 = -1;
                j7 = 0;
                jLongValue2 = j15;
                c31555n1 = c31555n2;
            } else {
                obj = obj3;
                if (c31574v0.f130441a.m97175p()) {
                    iMo97127a = abstractC31558o1.mo97127a(z28);
                    c31555n1 = c31555n2;
                } else if (abstractC31558o1.mo97128b(obj) == -1) {
                    Object objM97244F = m97244F(c31555n2, c31552m1, i17, z28, obj, c31574v0.f130441a, abstractC31558o1);
                    c31555n1 = c31555n2;
                    if (objM97244F == null) {
                        c31552m1 = c31552m1;
                        iMo97127a2 = abstractC31558o1.mo97127a(z28);
                        z16 = true;
                    } else {
                        c31552m1 = c31552m1;
                        iMo97127a2 = abstractC31558o1.mo97132g(objM97244F, c31552m1).f130286y;
                        z16 = false;
                    }
                    iMo97127a = iMo97127a2;
                    z14 = z16;
                    jLongValue2 = jLongValue2;
                    obj = obj;
                    i13 = -1;
                    j7 = 0;
                    z13 = false;
                    z15 = false;
                } else {
                    c31555n1 = c31555n2;
                    if (jLongValue2 == -9223372036854775807L) {
                        iMo97127a = abstractC31558o1.mo97132g(obj, c31552m1).f130286y;
                    } else if (z34) {
                        c31574v0.f130441a.mo97132g(c32763v3.f136238a, c31552m1);
                        if (c31574v0.f130441a.mo97136m(c31552m1.f130286y, c31555n1, 0L).f130319O == c31574v0.f130441a.mo97128b(c32763v3.f136238a)) {
                            j7 = 0;
                            Pair pairM97172i = abstractC31558o1.m97172i(c31555n1, c31552m1, abstractC31558o1.mo97132g(obj, c31552m1).f130286y, jLongValue2 + c31552m1.f130281E);
                            obj = pairM97172i.first;
                            jLongValue2 = ((Long) pairM97172i.second).longValue();
                        } else {
                            j7 = 0;
                            jLongValue2 = jLongValue2;
                            obj = obj;
                        }
                        iMo97127a = -1;
                        i13 = -1;
                        z13 = false;
                        z14 = false;
                        z15 = true;
                    } else {
                        j7 = 0;
                        iMo97127a = -1;
                        i13 = -1;
                        z13 = false;
                        z14 = false;
                        z15 = false;
                    }
                }
                i13 = -1;
                j7 = 0;
                z13 = false;
                z14 = false;
                z15 = false;
            }
            if (iMo97127a != i13) {
                int i18 = iMo97127a;
                abstractC31558o2 = abstractC31558o1;
                Pair pairM97172i2 = abstractC31558o2.m97172i(c31555n1, c31552m1, i18, -9223372036854775807L);
                obj = pairM97172i2.first;
                jLongValue2 = ((Long) pairM97172i2.second).longValue();
                j13 = -9223372036854775807L;
            } else {
                abstractC31558o2 = abstractC31558o1;
                j13 = jLongValue2;
            }
            C32763v c32763vM97188m = c31560p1.m97188m(abstractC31558o2, obj, jLongValue2);
            int i19 = c32763vM97188m.f136242e;
            r10 = (!c32763v3.f136238a.equals(obj) || c32763v3.m102753a() || c32763vM97188m.m102753a() || !(i19 == i13 || ((i14 = c32763v3.f136242e) != i13 && i19 >= i14))) ? 0 : 1;
            C31552m1 c31552m1Mo97132g = abstractC31558o2.mo97132g(obj, c31552m1);
            if (z34 || jLongValue2 != j13) {
                z17 = false;
            } else {
                Object obj4 = c32763v3.f136238a;
                int i24 = c32763v3.f136240c;
                int i25 = c32763v3.f136239b;
                if (obj4.equals(c32763vM97188m.f136238a) && (!(c32763v3.m102753a() && c31552m1Mo97132g.m97156g(i25)) ? c32763vM97188m.m102753a() && c31552m1Mo97132g.m97156g(c32763vM97188m.f136239b) : !(c31552m1Mo97132g.m97154e(i25, i24) == 4 || c31552m1Mo97132g.m97154e(i25, i24) == 2))) {
                    z17 = true;
                } else {
                    z17 = false;
                }
            }
            if (r10 != 0 || z17) {
                c32763vM97188m = c32763v3;
            }
            if (!c32763vM97188m.m102753a()) {
                j14 = jLongValue2;
            } else if (c32763vM97188m.equals(c32763v3)) {
                jLongValue2 = c31574v0.f130459s;
                j14 = jLongValue2;
            } else {
                abstractC31558o2.mo97132g(c32763vM97188m.f136238a, c31552m1);
                j14 = c32763vM97188m.f136240c == c31552m1.m97155f(c32763vM97188m.f136239b) ? c31552m1.f130283G.f142383x : j7;
            }
            c2842j0 = new C2842j0(c32763vM97188m, j14, j13, z13, z14, z15);
            r19 = zM97175p;
        }
        C32763v c32763v4 = (C32763v) c2842j0.f11228f;
        long j19 = c2842j0.f11224b;
        boolean z35 = c2842j0.f11225c;
        long jM97254J = c2842j0.f11223a;
        boolean z36 = (this.f130498W.f130442b.equals(c32763v4) && jM97254J == this.f130498W.f130459s) ? false : true;
        try {
            if (c2842j0.f11226d) {
                try {
                    z26 = true;
                    if (this.f130498W.f130445e != 1) {
                        try {
                            m97266W(4);
                        } catch (Throwable th3) {
                            th = th3;
                            r14 = abstractC31558o2;
                            c32763v = c32763v4;
                            j16 = j19;
                            r110 = 1;
                            r15 = 0;
                        }
                    }
                    z27 = false;
                    try {
                        m97247A(false, false, false, true);
                    } catch (Throwable th4) {
                        th = th4;
                        r14 = abstractC31558o2;
                        c32763v = c32763v4;
                        j16 = j19;
                        r110 = z26;
                        r15 = z27;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    z26 = true;
                    z27 = false;
                }
            } else {
                z26 = true;
                z27 = false;
            }
            try {
                if (z36) {
                    r10 = abstractC31558o2;
                    r19 = z26;
                    z29 = z27;
                    if (r10.m97175p()) {
                        r26 = r10;
                        r114 = z29;
                        r113 = r19;
                        c32763v = c32763v4;
                        r24 = r26;
                        r18 = r114;
                        r112 = r113;
                    } else {
                        for (C31554n0 c31554n0 = this.f130493R.f130345h; c31554n0 != null; c31554n0 = c31554n0.f130302l) {
                            if (c31554n0.f130296f.f130326a.equals(c32763v4)) {
                                r26 = r10;
                                r114 = z29;
                                r113 = r19;
                                c31554n0.f130296f = this.f130493R.m97183g(r10, c31554n0.f130296f);
                                c31554n0.m97165h();
                            } else {
                                r26 = r10;
                                r114 = z29;
                                r113 = r19;
                            }
                        }
                        try {
                            r26 = r10;
                            r114 = z29;
                            r113 = r19;
                            C31560p0 c31560p2 = this.f130493R;
                            c32763v = c32763v4;
                            try {
                                jM97254J = m97254J(c32763v, jM97254J, c31560p2.f130345h != c31560p2.f130346i ? r19 == true ? 1 : 0 : z29, z35);
                                r24 = r10;
                                r18 = z29;
                                r112 = r19;
                            } catch (Throwable th6) {
                                th = th6;
                                jM97254J = jM97254J;
                                r17 = r10;
                                r16 = z29;
                                r111 = r19;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            c32763v = c32763v4;
                            r17 = r10;
                            r16 = z29;
                            r111 = r19;
                        }
                    }
                    C31574v0 c31574v1 = this.f130498W;
                    AbstractC31558o1 abstractC31558o5 = c31574v1.f130441a;
                    C32763v c32763v5 = c31574v1.f130442b;
                    if (c2842j0.f11227e) {
                        j18 = jM97254J;
                    } else {
                        j18 = -9223372036854775807L;
                    }
                    m97281f0(r24, c32763v, abstractC31558o5, c32763v5, j18);
                    if (z36) {
                        C31574v0 c31574v2 = this.f130498W;
                        obj2 = c31574v2.f130442b.f136238a;
                        AbstractC31558o1 abstractC31558o6 = c31574v2.f130441a;
                        if (z36) {
                            r25 = r18;
                        } else {
                            r25 = r18;
                        }
                        long j24 = this.f130498W.f130444d;
                        if (r24.mo97128b(obj2) == -1) {
                            i16 = 4;
                        } else {
                            i16 = 3;
                        }
                        this.f130498W = m97291o(c32763v, jM97254J, j19, j24, r25, i16);
                    } else {
                        C31574v0 c31574v3 = this.f130498W;
                        obj2 = c31574v3.f130442b.f136238a;
                        AbstractC31558o1 abstractC31558o7 = c31574v3.f130441a;
                        if (z36) {
                            r25 = r18;
                        } else {
                            r25 = r18;
                        }
                        long j25 = this.f130498W.f130444d;
                        if (r24.mo97128b(obj2) == -1) {
                            i16 = 4;
                        } else {
                            i16 = 3;
                        }
                        this.f130498W = m97291o(c32763v, jM97254J, j19, j25, r25, i16);
                    }
                    m97248B();
                    m97250D(r24, this.f130498W.f130441a);
                    this.f130498W = this.f130498W.m97240h(r24);
                    if (!r24.m97175p()) {
                        this.f130511j0 = null;
                    }
                    m97287k(r18);
                    return;
                }
                try {
                    C31560p0 c31560p3 = this.f130493R;
                    r19 = z26;
                    z29 = z27;
                    try {
                        long j26 = this.f130512k0;
                        try {
                            AbstractC31523d[] abstractC31523dArr2 = this.f130517w;
                            C31554n0 c31554n1 = c31560p3.f130346i;
                            try {
                                if (c31554n1 != null) {
                                    long j27 = c31554n1.f130305o;
                                    if (c31554n1.f130294d) {
                                        long jMax = j27;
                                        ?? r27 = z29;
                                        while (true) {
                                            if (r27 < abstractC31523dArr2.length) {
                                                if (m97246q(abstractC31523dArr2[r27])) {
                                                    AbstractC31523d abstractC31523d = abstractC31523dArr2[r27];
                                                    abstractC31523dArr = abstractC31523dArr2;
                                                    if (abstractC31523d.f130104G == c31554n1.f130293c[r27]) {
                                                        c31560p0 = c31560p3;
                                                        long j28 = abstractC31523d.f130107J;
                                                        if (j28 == Long.MIN_VALUE) {
                                                            abstractC31558o1 = abstractC31558o1;
                                                            c31560p3 = c31560p0;
                                                            j26 = j26;
                                                            j17 = Long.MIN_VALUE;
                                                            break;
                                                        }
                                                        jMax = Math.max(j28, jMax);
                                                        c32763v = c32763v4;
                                                        r17 = r10;
                                                        r16 = z29;
                                                        r111 = r19;
                                                        j16 = j19;
                                                        r14 = r17;
                                                        r15 = r16;
                                                        r110 = r111;
                                                    }
                                                    c31560p3 = c31560p0;
                                                    abstractC31523dArr2 = abstractC31523dArr;
                                                    r27++;
                                                } else {
                                                    abstractC31523dArr = abstractC31523dArr2;
                                                }
                                                c31560p0 = c31560p3;
                                                c31560p3 = c31560p0;
                                                abstractC31523dArr2 = abstractC31523dArr;
                                                r27++;
                                            } else {
                                                j17 = jMax;
                                                j26 = j26;
                                            }
                                        }
                                    } else {
                                        j17 = j27;
                                        j26 = j26;
                                        abstractC31558o1 = abstractC31558o1;
                                    }
                                    abstractC31558o3 = abstractC31558o1;
                                    r26 = abstractC31558o3;
                                    r114 = z29;
                                    r113 = r19;
                                    if (!c31560p3.m97190o(abstractC31558o1, j26, j17)) {
                                        m97252H(z29);
                                        r26 = abstractC31558o3;
                                        r114 = z29;
                                        r113 = r19;
                                    }
                                    r26 = r10;
                                    r114 = z29;
                                    r113 = r19;
                                    c32763v = c32763v4;
                                    r24 = r26;
                                    r18 = r114;
                                    r112 = r113;
                                    C31574v0 c31574v4 = this.f130498W;
                                    AbstractC31558o1 abstractC31558o8 = c31574v4.f130441a;
                                    C32763v c32763v6 = c31574v4.f130442b;
                                    if (c2842j0.f11227e) {
                                        j18 = jM97254J;
                                    } else {
                                        j18 = -9223372036854775807L;
                                    }
                                    m97281f0(r24, c32763v, abstractC31558o8, c32763v6, j18);
                                    if (z36 || j19 != this.f130498W.f130443c) {
                                        C31574v0 c31574v5 = this.f130498W;
                                        obj2 = c31574v5.f130442b.f136238a;
                                        AbstractC31558o1 abstractC31558o9 = c31574v5.f130441a;
                                        if (z36 || !z4 || abstractC31558o9.m97175p() || abstractC31558o9.mo97132g(obj2, this.f130487L).f130282F) {
                                            r25 = r18;
                                        } else {
                                            r25 = r112;
                                        }
                                        long j29 = this.f130498W.f130444d;
                                        if (r24.mo97128b(obj2) == -1) {
                                            i16 = 4;
                                        } else {
                                            i16 = 3;
                                        }
                                        this.f130498W = m97291o(c32763v, jM97254J, j19, j29, r25, i16);
                                    }
                                    m97248B();
                                    m97250D(r24, this.f130498W.f130441a);
                                    this.f130498W = this.f130498W.m97240h(r24);
                                    if (!r24.m97175p()) {
                                        this.f130511j0 = null;
                                    }
                                    m97287k(r18);
                                    return;
                                }
                                j17 = j7;
                                abstractC31558o3 = abstractC31558o1;
                                r26 = abstractC31558o3;
                                r114 = z29;
                                r113 = r19;
                                if (!c31560p3.m97190o(abstractC31558o1, j26, j17)) {
                                    m97252H(z29);
                                    r26 = abstractC31558o3;
                                    r114 = z29;
                                    r113 = r19;
                                }
                                r26 = r10;
                                r114 = z29;
                                r113 = r19;
                                c32763v = c32763v4;
                                r24 = r26;
                                r18 = r114;
                                r112 = r113;
                                C31574v0 c31574v6 = this.f130498W;
                                AbstractC31558o1 abstractC31558o10 = c31574v6.f130441a;
                                C32763v c32763v7 = c31574v6.f130442b;
                                if (c2842j0.f11227e) {
                                    j18 = jM97254J;
                                } else {
                                    j18 = -9223372036854775807L;
                                }
                                m97281f0(r24, c32763v, abstractC31558o10, c32763v7, j18);
                                if (z36) {
                                    C31574v0 c31574v7 = this.f130498W;
                                    obj2 = c31574v7.f130442b.f136238a;
                                    AbstractC31558o1 abstractC31558o11 = c31574v7.f130441a;
                                    if (z36) {
                                        r25 = r18;
                                    } else {
                                        r25 = r18;
                                    }
                                    long j210 = this.f130498W.f130444d;
                                    if (r24.mo97128b(obj2) == -1) {
                                        i16 = 4;
                                    } else {
                                        i16 = 3;
                                    }
                                    this.f130498W = m97291o(c32763v, jM97254J, j19, j210, r25, i16);
                                } else {
                                    C31574v0 c31574v8 = this.f130498W;
                                    obj2 = c31574v8.f130442b.f136238a;
                                    AbstractC31558o1 abstractC31558o12 = c31574v8.f130441a;
                                    if (z36) {
                                        r25 = r18;
                                    } else {
                                        r25 = r18;
                                    }
                                    long j211 = this.f130498W.f130444d;
                                    if (r24.mo97128b(obj2) == -1) {
                                        i16 = 4;
                                    } else {
                                        i16 = 3;
                                    }
                                    this.f130498W = m97291o(c32763v, jM97254J, j19, j211, r25, i16);
                                }
                                m97248B();
                                m97250D(r24, this.f130498W.f130441a);
                                this.f130498W = this.f130498W.m97240h(r24);
                                if (!r24.m97175p()) {
                                    this.f130511j0 = null;
                                }
                                m97287k(r18);
                                return;
                            } catch (Throwable th8) {
                                th = th8;
                                r10 = abstractC31558o1;
                            }
                            break;
                        } catch (Throwable th9) {
                            th = th9;
                            r10 = abstractC31558o1;
                            z29 = z29;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                    }
                } catch (Throwable th11) {
                    th = th11;
                    r10 = abstractC31558o1;
                    r19 = z26;
                    z29 = z27;
                }
            } catch (Throwable th12) {
                th = th12;
            }
        } catch (Throwable th13) {
            th = th13;
            r14 = abstractC31558o2;
            c32763v = c32763v4;
            j16 = j19;
            r15 = 0;
            r110 = 1;
        }
        C31574v0 c31574v9 = this.f130498W;
        AbstractC31558o1 abstractC31558o13 = c31574v9.f130441a;
        C32763v c32763v8 = c31574v9.f130442b;
        C32763v c32763v9 = c32763v;
        ?? r28 = r14;
        m97281f0(r28, c32763v9, abstractC31558o13, c32763v8, c2842j0.f11227e ? jM97254J : -9223372036854775807L);
        if (z36 || j16 != this.f130498W.f130443c) {
            C31574v0 c31574v10 = this.f130498W;
            Object obj5 = c31574v10.f130442b.f136238a;
            AbstractC31558o1 abstractC31558o14 = c31574v10.f130441a;
            this.f130498W = m97291o(c32763v9, jM97254J, j16, this.f130498W.f130444d, (!z36 || !z4 || abstractC31558o14.m97175p() || abstractC31558o14.mo97132g(obj5, this.f130487L).f130282F) ? r15 : r110, r28.mo97128b(obj5) == -1 ? 4 : 3);
        }
        m97248B();
        m97250D(r28, this.f130498W.f130441a);
        this.f130498W = this.f130498W.m97240h(r28);
        if (!r28.m97175p()) {
            this.f130511j0 = null;
        }
        m97287k(r15);
        throw th;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, sn.s] */
    /* JADX INFO: renamed from: m */
    public final void m97289m(InterfaceC32757s interfaceC32757s) throws ExoPlaybackException {
        C31560p0 c31560p0 = this.f130493R;
        C31554n0 c31554n0 = c31560p0.f130347j;
        if (c31554n0 == null || c31554n0.f130291a != interfaceC32757s) {
            return;
        }
        float f13 = this.f130489N.mo8163b().f130465w;
        AbstractC31558o1 abstractC31558o1 = this.f130498W.f130441a;
        c31554n0.f130294d = true;
        c31554n0.f130303m = c31554n0.f130291a.mo102705k();
        C20712x c20712xM97164g = c31554n0.m97164g(f13, abstractC31558o1);
        C31557o0 c31557o0 = c31554n0.f130296f;
        long jMax = c31557o0.f130327b;
        long j7 = c31557o0.f130330e;
        if (j7 != -9223372036854775807L && jMax >= j7) {
            jMax = Math.max(0L, j7 - 1);
        }
        long jM97158a = c31554n0.m97158a(c20712xM97164g, jMax, false, new boolean[c31554n0.f130299i.length]);
        long j13 = c31554n0.f130305o;
        C31557o0 c31557o1 = c31554n0.f130296f;
        c31554n0.f130305o = (c31557o1.f130327b - jM97158a) + j13;
        c31554n0.f130296f = c31557o1.m97170b(jM97158a);
        m97277d0(c31554n0.f130304n);
        if (c31554n0 == c31560p0.f130345h) {
            m97249C(c31554n0.f130296f.f130327b);
            m97278e(new boolean[this.f130517w.length]);
            C31574v0 c31574v0 = this.f130498W;
            C32763v c32763v = c31574v0.f130442b;
            long j14 = c31554n0.f130296f.f130327b;
            this.f130498W = m97291o(c32763v, j14, c31574v0.f130443c, j14, false, 5);
        }
        m97294s();
    }

    /* JADX INFO: renamed from: n */
    public final void m97290n(C31576w0 c31576w0, float f13, boolean z4, boolean z13) {
        int i13;
        if (z4) {
            if (z13) {
                this.f130499X.m97241a(1);
            }
            this.f130498W = this.f130498W.m97238f(c31576w0);
        }
        float f14 = c31576w0.f130465w;
        C31554n0 c31554n0 = this.f130493R.f130345h;
        while (true) {
            i13 = 0;
            if (c31554n0 == null) {
                break;
            }
            InterfaceC20035o[] interfaceC20035oArr = c31554n0.f130304n.f77583c;
            int length = interfaceC20035oArr.length;
            while (i13 < length) {
                InterfaceC20035o interfaceC20035o = interfaceC20035oArr[i13];
                if (interfaceC20035o != null) {
                    interfaceC20035o.mo54493f(f14);
                }
                i13++;
            }
            c31554n0 = c31554n0.f130302l;
        }
        AbstractC31523d[] abstractC31523dArr = this.f130517w;
        int length2 = abstractC31523dArr.length;
        while (i13 < length2) {
            AbstractC31523d abstractC31523d = abstractC31523dArr[i13];
            if (abstractC31523d != null) {
                abstractC31523d.mo49745w(f13, c31576w0.f130465w);
            }
            i13++;
        }
    }

    /* JADX INFO: renamed from: o */
    public final C31574v0 m97291o(C32763v c32763v, long j7, long j13, long j14, boolean z4, int i13) {
        C41060w0 c41060w0M133239f;
        this.f130514m0 = (!this.f130514m0 && j7 == this.f130498W.f130459s && c32763v.equals(this.f130498W.f130442b)) ? false : true;
        m97248B();
        C31574v0 c31574v0 = this.f130498W;
        C32768x0 c32768x0 = c31574v0.f130448h;
        C20712x c20712x = c31574v0.f130449i;
        List list = c31574v0.f130450j;
        if (this.f130494S.f11034g) {
            C31554n0 c31554n0 = this.f130493R.f130345h;
            c32768x0 = c31554n0 == null ? C32768x0.f136269z : c31554n0.f130303m;
            c20712x = c31554n0 == null ? this.f130480E : c31554n0.f130304n;
            InterfaceC20035o[] interfaceC20035oArr = c20712x.f77583c;
            C41014d0 c41014d0 = new C41014d0(4);
            boolean z13 = false;
            for (InterfaceC20035o interfaceC20035o : interfaceC20035oArr) {
                if (interfaceC20035o != null) {
                    C18715c c18715c = interfaceC20035o.mo54499d(0).f130075J;
                    if (c18715c == null) {
                        c41014d0.m133222a(new C18715c(new InterfaceC18714b[0]));
                    } else {
                        c41014d0.m133222a(c18715c);
                        z13 = true;
                    }
                }
            }
            if (z13) {
                c41060w0M133239f = c41014d0.m133239f();
            } else {
                C41017e0 c41017e0 = AbstractC41023g0.f176998x;
                c41060w0M133239f = C41060w0.f177067E;
            }
            list = c41060w0M133239f;
            if (c31554n0 != null) {
                C31557o0 c31557o0 = c31554n0.f130296f;
                if (c31557o0.f130328c != j13) {
                    c31554n0.f130296f = c31557o0.m97169a(j13);
                }
            }
        } else if (!c32763v.equals(c31574v0.f130442b)) {
            c32768x0 = C32768x0.f136269z;
            c20712x = this.f130480E;
            list = C41060w0.f177067E;
        }
        C32768x0 c32768x1 = c32768x0;
        C20712x c20712x2 = c20712x;
        List list2 = list;
        if (z4) {
            C31577x c31577x = this.f130499X;
            if (!c31577x.f130471d || c31577x.f130472e == 5) {
                c31577x.f130468a = true;
                c31577x.f130471d = true;
                c31577x.f130472e = i13;
            } else {
                AbstractC24543a.m71569e(i13 == 5);
            }
        }
        C31574v0 c31574v1 = this.f130498W;
        long j15 = c31574v1.f130457q;
        C31554n0 c31554n1 = this.f130493R.f130347j;
        return c31574v1.m97234b(c32763v, j7, j13, j14, c31554n1 == null ? 0L : Math.max(0L, j15 - (this.f130512k0 - c31554n1.f130305o)), c32768x1, c20712x2, list2);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, sn.t0] */
    /* JADX INFO: renamed from: p */
    public final boolean m97292p() {
        C31554n0 c31554n0 = this.f130493R.f130347j;
        if (c31554n0 == null) {
            return false;
        }
        return (!c31554n0.f130294d ? 0L : c31554n0.f130291a.mo91532d()) != Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m97293r() {
        C31554n0 c31554n0 = this.f130493R.f130345h;
        long j7 = c31554n0.f130296f.f130330e;
        if (c31554n0.f130294d) {
            return j7 == -9223372036854775807L || this.f130498W.f130459s < j7 || !m97267X();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, sn.t0] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, sn.t0] */
    /* JADX INFO: renamed from: s */
    public final void m97294s() {
        int i13;
        boolean z4;
        C31560p0 c31560p0 = this.f130493R;
        if (m97292p()) {
            C31554n0 c31554n0 = c31560p0.f130347j;
            long jMo91532d = !c31554n0.f130294d ? 0L : c31554n0.f130291a.mo91532d();
            C31554n0 c31554n1 = this.f130493R.f130347j;
            long jMax = c31554n1 != null ? Math.max(0L, jMo91532d - (this.f130512k0 - c31554n1.f130305o)) : 0L;
            C31535h c31535h = this.f130481F;
            float f13 = this.f130489N.mo8163b().f130465w;
            long j7 = c31535h.f130154c;
            C22631o c22631o = c31535h.f130152a;
            synchronized (c22631o) {
                i13 = c22631o.f89030e * c22631o.f89028c;
            }
            boolean z13 = i13 >= c31535h.f130159h;
            long jMin = c31535h.f130153b;
            if (f13 > 1.0f) {
                jMin = Math.min(AbstractC24567y.m71685p(f13, jMin), j7);
            }
            if (jMax < Math.max(jMin, 500000L)) {
                c31535h.f130160i = !z13;
                if (z13 && jMax < 500000) {
                    Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                }
            } else if (jMax >= j7 || z13) {
                c31535h.f130160i = false;
            }
            z4 = c31535h.f130160i;
        } else {
            z4 = false;
        }
        this.f130504c0 = z4;
        if (z4) {
            C31554n0 c31554n2 = c31560p0.f130347j;
            long j13 = this.f130512k0;
            AbstractC24543a.m71573i(c31554n2.f130302l == null);
            c31554n2.f130291a.mo91536u(j13 - c31554n2.f130305o);
        }
        m97275c0();
    }

    /* JADX INFO: renamed from: t */
    public final void m97295t() {
        C31577x c31577x = this.f130499X;
        C31574v0 c31574v0 = this.f130498W;
        boolean z4 = c31577x.f130468a | (c31577x.f130469b != c31574v0);
        c31577x.f130468a = z4;
        c31577x.f130469b = c31574v0;
        if (z4) {
            C31571u c31571u = this.f130492Q.f130245w;
            c31571u.f130389J.f95865a.post(new RunnableC30928b(7, c31571u, c31577x));
            this.f130499X = new C31577x(this.f130498W);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m97296u() throws Throwable {
        m97288l(this.f130494S.m8025c(), true);
    }

    /* JADX INFO: renamed from: v */
    public final void m97297v() {
        this.f130499X.m97241a(1);
        throw null;
    }

    /* JADX INFO: renamed from: w */
    public final void m97298w() {
        this.f130499X.m97241a(1);
        m97247A(false, false, false, true);
        this.f130481F.m97141b(false);
        m97266W(this.f130498W.f130441a.m97175p() ? 4 : 2);
        C22633q c22633q = (C22633q) this.f130482G;
        c22633q.getClass();
        C2819b1 c2819b1 = this.f130494S;
        ArrayList arrayList = c2819b1.f11029b;
        AbstractC24543a.m71573i(!c2819b1.f11034g);
        c2819b1.f11040m = c22633q;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            C31570t0 c31570t0 = (C31570t0) arrayList.get(i13);
            c2819b1.m8031i(c31570t0);
            c2819b1.f11033f.add(c31570t0);
        }
        c2819b1.f11034g = true;
        this.f130483H.m71650c(2);
    }

    /* JADX INFO: renamed from: x */
    public final void m97299x() {
        m97247A(true, false, true, false);
        this.f130481F.m97141b(true);
        m97266W(1);
        this.f130484I.quit();
        synchronized (this) {
            this.f130500Y = true;
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m97300y(int i13, int i14, C32762u0 c32762u0) throws Throwable {
        this.f130499X.m97241a(1);
        C2819b1 c2819b1 = this.f130494S;
        c2819b1.getClass();
        AbstractC24543a.m71569e(i13 >= 0 && i13 <= i14 && i14 <= c2819b1.f11029b.size());
        c2819b1.f11039l = c32762u0;
        c2819b1.m8034l(i13, i14);
        m97288l(c2819b1.m8025c(), false);
    }

    /* JADX INFO: renamed from: z */
    public final void m97301z() throws ExoPlaybackException {
        int i13;
        float f13 = this.f130489N.mo8163b().f130465w;
        C31560p0 c31560p0 = this.f130493R;
        C31554n0 c31554n0 = c31560p0.f130345h;
        C31554n0 c31554n1 = c31560p0.f130346i;
        boolean z4 = true;
        for (C31554n0 c31554n2 = c31554n0; c31554n2 != null && c31554n2.f130294d; c31554n2 = c31554n2.f130302l) {
            C20712x c20712xM97164g = c31554n2.m97164g(f13, this.f130498W.f130441a);
            C20712x c20712x = c31554n2.f130304n;
            InterfaceC20035o[] interfaceC20035oArr = c20712xM97164g.f77583c;
            boolean z13 = false;
            if (c20712x != null && c20712x.f77583c.length == interfaceC20035oArr.length) {
                int i14 = 0;
                while (true) {
                    if (i14 >= interfaceC20035oArr.length) {
                        if (c31554n2 == c31554n1) {
                            z4 = false;
                        }
                    } else if (c20712xM97164g.m56900a(c20712x, i14)) {
                        i14++;
                    }
                }
            }
            if (z4) {
                C31560p0 c31560p1 = this.f130493R;
                C31554n0 c31554n3 = c31560p1.f130345h;
                boolean zM97187k = c31560p1.m97187k(c31554n3);
                boolean[] zArr = new boolean[this.f130517w.length];
                long jM97158a = c31554n3.m97158a(c20712xM97164g, this.f130498W.f130459s, zM97187k, zArr);
                C31574v0 c31574v0 = this.f130498W;
                if (c31574v0.f130445e != 4 && jM97158a != c31574v0.f130459s) {
                    z13 = true;
                }
                C31574v0 c31574v1 = this.f130498W;
                i13 = 4;
                this.f130498W = m97291o(c31574v1.f130442b, jM97158a, c31574v1.f130443c, c31574v1.f130444d, z13, 5);
                if (z13) {
                    m97249C(jM97158a);
                }
                boolean[] zArr2 = new boolean[this.f130517w.length];
                int i15 = 0;
                while (true) {
                    AbstractC31523d[] abstractC31523dArr = this.f130517w;
                    if (i15 >= abstractC31523dArr.length) {
                        break;
                    }
                    AbstractC31523d abstractC31523d = abstractC31523dArr[i15];
                    boolean zM97246q = m97246q(abstractC31523d);
                    zArr2[i15] = zM97246q;
                    InterfaceC32756r0 interfaceC32756r0 = c31554n3.f130293c[i15];
                    if (zM97246q) {
                        if (interfaceC32756r0 != abstractC31523d.f130104G) {
                            m97272b(abstractC31523d);
                        } else if (zArr[i15]) {
                            long j7 = this.f130512k0;
                            abstractC31523d.f130108K = false;
                            abstractC31523d.f130107J = j7;
                            abstractC31523d.mo49741n(j7, false);
                        }
                    }
                    i15++;
                }
                m97278e(zArr2);
            } else {
                i13 = 4;
                this.f130493R.m97187k(c31554n2);
                if (c31554n2.f130294d) {
                    c31554n2.m97158a(c20712xM97164g, Math.max(c31554n2.f130296f.f130327b, this.f130512k0 - c31554n2.f130305o), false, new boolean[c31554n2.f130299i.length]);
                }
            }
            m97287k(true);
            if (this.f130498W.f130445e != i13) {
                m97294s();
                m97279e0();
                this.f130483H.m71650c(2);
                return;
            }
            return;
        }
    }
}
