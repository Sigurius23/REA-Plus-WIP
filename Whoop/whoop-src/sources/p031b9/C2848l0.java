package p031b9;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.fragment.app.RunnableC1319m;
import androidx.health.platform.client.proto.C1533u;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import live.hms.video.error.ErrorCodes;
import p000.AbstractC30802r;
import p009a8.RunnableC0533c;
import p012ab.C0680g0;
import p012ab.C0704y;
import p027b3.AbstractC2351b;
import p047c9.C4317h;
import p047c9.C4323n;
import p299l9.AbstractC23481a;
import p299l9.C23488c0;
import p299l9.C23489c1;
import p299l9.C23501g1;
import p299l9.InterfaceC23482a0;
import p299l9.InterfaceC23486b1;
import p299l9.InterfaceC23539z;
import p299l9.InterfaceC23540z0;
import p309lo.C24560r;
import p361o9.C27672l;
import p361o9.C27677q;
import p361o9.C27682v;
import p361o9.InterfaceC27679s;
import p398p9.C28982f;
import p398p9.InterfaceC28980d;
import p516u8.AbstractC34609o0;
import p516u8.C34585c0;
import p516u8.C34586d;
import p516u8.C34589e0;
import p516u8.C34603l0;
import p516u8.C34605m0;
import p516u8.C34607n0;
import p516u8.C34610p;
import p516u8.C34618t;
import p516u8.C34626x;
import p516u8.InterfaceC34583b0;
import p558vp.AbstractC36259c;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p607x8.C38061p;
import p607x8.C38062q;
import p607x8.C38063r;
import p658yr.InterfaceC39722i;
import p690zr.AbstractC41023g0;
import p690zr.C41014d0;
import p690zr.C41017e0;
import p690zr.C41060w0;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: b9.l0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2848l0 implements Handler.Callback, InterfaceC23539z, InterfaceC2825d1 {

    /* JADX INFO: renamed from: A0 */
    public static final long f11257A0 = AbstractC38065t.m121907U(ChatClient.RESOLVE_DEPENDENCY_TIMEOUT);

    /* JADX INFO: renamed from: E */
    public final C27682v f11258E;

    /* JADX INFO: renamed from: F */
    public final C2844k f11259F;

    /* JADX INFO: renamed from: G */
    public final InterfaceC28980d f11260G;

    /* JADX INFO: renamed from: H */
    public final C38063r f11261H;

    /* JADX INFO: renamed from: I */
    public final C24560r f11262I;

    /* JADX INFO: renamed from: J */
    public final Looper f11263J;

    /* JADX INFO: renamed from: K */
    public final C34607n0 f11264K;

    /* JADX INFO: renamed from: L */
    public final C34605m0 f11265L;

    /* JADX INFO: renamed from: M */
    public final long f11266M;

    /* JADX INFO: renamed from: N */
    public final C2847l f11267N;

    /* JADX INFO: renamed from: O */
    public final ArrayList f11268O;

    /* JADX INFO: renamed from: P */
    public final C38061p f11269P;

    /* JADX INFO: renamed from: Q */
    public final C2867u f11270Q;

    /* JADX INFO: renamed from: R */
    public final C2864s0 f11271R;

    /* JADX INFO: renamed from: S */
    public final C2819b1 f11272S;

    /* JADX INFO: renamed from: T */
    public final C2838i f11273T;

    /* JADX INFO: renamed from: U */
    public final long f11274U;

    /* JADX INFO: renamed from: V */
    public final C4323n f11275V;

    /* JADX INFO: renamed from: W */
    public final C4317h f11276W;

    /* JADX INFO: renamed from: X */
    public final C38063r f11277X;

    /* JADX INFO: renamed from: Y */
    public final boolean f11278Y;

    /* JADX INFO: renamed from: Z */
    public final C2826e f11279Z;

    /* JADX INFO: renamed from: a0 */
    public C2846k1 f11280a0;

    /* JADX INFO: renamed from: b0 */
    public C2822c1 f11281b0;

    /* JADX INFO: renamed from: c0 */
    public C0704y f11282c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f11283d0;

    /* JADX INFO: renamed from: f0 */
    public boolean f11285f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f11286g0;

    /* JADX INFO: renamed from: i0 */
    public boolean f11288i0;

    /* JADX INFO: renamed from: j0 */
    public int f11289j0;

    /* JADX INFO: renamed from: k0 */
    public boolean f11290k0;

    /* JADX INFO: renamed from: l0 */
    public boolean f11291l0;

    /* JADX INFO: renamed from: m0 */
    public boolean f11292m0;

    /* JADX INFO: renamed from: n0 */
    public boolean f11293n0;

    /* JADX INFO: renamed from: o0 */
    public int f11294o0;

    /* JADX INFO: renamed from: p0 */
    public C2845k0 f11295p0;

    /* JADX INFO: renamed from: q0 */
    public long f11296q0;

    /* JADX INFO: renamed from: r0 */
    public long f11297r0;

    /* JADX INFO: renamed from: s0 */
    public int f11298s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f11299t0;

    /* JADX INFO: renamed from: u0 */
    public ExoPlaybackException f11300u0;

    /* JADX INFO: renamed from: w */
    public final C2843j1[] f11302w;

    /* JADX INFO: renamed from: w0 */
    public C2859q f11303w0;

    /* JADX INFO: renamed from: x */
    public final AbstractC2829f[] f11304x;

    /* JADX INFO: renamed from: y */
    public final boolean[] f11306y;

    /* JADX INFO: renamed from: y0 */
    public boolean f11307y0;

    /* JADX INFO: renamed from: z */
    public final AbstractC2351b f11308z;

    /* JADX INFO: renamed from: x0 */
    public long f11305x0 = -9223372036854775807L;

    /* JADX INFO: renamed from: e0 */
    public boolean f11284e0 = false;

    /* JADX INFO: renamed from: z0 */
    public float f11309z0 = 1.0f;

    /* JADX INFO: renamed from: v0 */
    public long f11301v0 = -9223372036854775807L;

    /* JADX INFO: renamed from: h0 */
    public long f11287h0 = -9223372036854775807L;

    public C2848l0(Context context, AbstractC2829f[] abstractC2829fArr, AbstractC2829f[] abstractC2829fArr2, AbstractC2351b abstractC2351b, C27682v c27682v, C2844k c2844k, InterfaceC28980d interfaceC28980d, int i13, boolean z4, C4317h c4317h, C2846k1 c2846k1, C2838i c2838i, long j7, Looper looper, C38061p c38061p, C2867u c2867u, C4323n c4323n, C2859q c2859q) {
        Looper looper2;
        this.f11270Q = c2867u;
        this.f11308z = abstractC2351b;
        this.f11258E = c27682v;
        this.f11259F = c2844k;
        this.f11260G = interfaceC28980d;
        this.f11289j0 = i13;
        this.f11290k0 = z4;
        this.f11280a0 = c2846k1;
        this.f11273T = c2838i;
        this.f11274U = j7;
        boolean z13 = false;
        this.f11269P = c38061p;
        this.f11275V = c4323n;
        this.f11303w0 = c2859q;
        this.f11276W = c4317h;
        this.f11266M = c2844k.f11241g;
        C34603l0 c34603l0 = AbstractC34609o0.f145755a;
        C2822c1 c2822c1M8035j = C2822c1.m8035j(c27682v);
        this.f11281b0 = c2822c1M8035j;
        this.f11282c0 = new C0704y(c2822c1M8035j);
        this.f11304x = new AbstractC2829f[abstractC2829fArr.length];
        this.f11306y = new boolean[abstractC2829fArr.length];
        C27677q c27677q = (C27677q) abstractC2351b;
        c27677q.getClass();
        this.f11302w = new C2843j1[abstractC2829fArr.length];
        boolean z14 = false;
        for (int i14 = 0; i14 < abstractC2829fArr.length; i14++) {
            AbstractC2829f abstractC2829f = abstractC2829fArr[i14];
            abstractC2829f.f11081E = i14;
            abstractC2829f.f11082F = c4323n;
            abstractC2829f.f11083G = c38061p;
            this.f11304x[i14] = abstractC2829f;
            AbstractC2829f abstractC2829f2 = this.f11304x[i14];
            synchronized (abstractC2829f2.f11094w) {
                abstractC2829f2.f11093Q = c27677q;
            }
            AbstractC2829f abstractC2829f3 = abstractC2829fArr2[i14];
            if (abstractC2829f3 != null) {
                abstractC2829f3.f11081E = abstractC2829fArr.length + i14;
                abstractC2829f3.f11082F = c4323n;
                abstractC2829f3.f11083G = c38061p;
                z14 = true;
            }
            C2843j1[] c2843j1Arr = this.f11302w;
            AbstractC2829f abstractC2829f4 = abstractC2829fArr[i14];
            C2843j1 c2843j1 = new C2843j1();
            c2843j1.f11233e = abstractC2829f4;
            c2843j1.f11231c = i14;
            c2843j1.f11234f = abstractC2829f3;
            c2843j1.f11232d = 0;
            c2843j1.f11229a = false;
            c2843j1.f11230b = false;
            c2843j1Arr[i14] = c2843j1;
        }
        this.f11278Y = z14;
        this.f11267N = new C2847l(this, c38061p);
        this.f11268O = new ArrayList();
        this.f11264K = new C34607n0();
        this.f11265L = new C34605m0();
        abstractC2351b.f9291b = this;
        abstractC2351b.f9292c = interfaceC28980d;
        this.f11299t0 = true;
        C38063r c38063rM121874a = c38061p.m121874a(looper, null);
        this.f11277X = c38063rM121874a;
        this.f11271R = new C2864s0(c4317h, c38063rM121874a, new C0680g0(this, 10), c2859q);
        this.f11272S = new C2819b1(this, c4317h, c38063rM121874a, c4323n);
        C24560r c24560r = new C24560r();
        c24560r.f95853w = new Object();
        c24560r.f95855y = null;
        c24560r.f95856z = null;
        c24560r.f95854x = 0;
        this.f11262I = c24560r;
        synchronized (c24560r.f95853w) {
            try {
                if (((Looper) c24560r.f95855y) == null) {
                    if (c24560r.f95854x == 0 && ((HandlerThread) c24560r.f95856z) == null) {
                        z13 = true;
                    }
                    AbstractC35849g.m113807i(z13);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    c24560r.f95856z = handlerThread;
                    handlerThread.start();
                    c24560r.f95855y = ((HandlerThread) c24560r.f95856z).getLooper();
                }
                c24560r.f95854x++;
                looper2 = (Looper) c24560r.f95855y;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f11263J = looper2;
        this.f11261H = c38061p.m121874a(looper2, this);
        this.f11279Z = new C2826e(context, looper2, this);
    }

    /* JADX INFO: renamed from: P */
    public static Pair m8169P(AbstractC34609o0 abstractC34609o0, C2845k0 c2845k0, boolean z4, int i13, boolean z13, C34607n0 c34607n0, C34605m0 c34605m0) {
        int iM8170Q;
        AbstractC34609o0 abstractC34609o1 = c2845k0.f11244a;
        if (abstractC34609o0.m109408p()) {
            return null;
        }
        AbstractC34609o0 abstractC34609o2 = abstractC34609o1.m109408p() ? abstractC34609o0 : abstractC34609o1;
        try {
            Pair pairM109405i = abstractC34609o2.m109405i(c34607n0, c34605m0, c2845k0.f11245b, c2845k0.f11246c);
            if (!abstractC34609o0.equals(abstractC34609o2)) {
                if (abstractC34609o0.mo8132b(pairM109405i.first) == -1) {
                    if (!z4 || (iM8170Q = m8170Q(c34607n0, c34605m0, i13, z13, pairM109405i.first, abstractC34609o2, abstractC34609o0)) == -1) {
                        return null;
                    }
                    return abstractC34609o0.m109405i(c34607n0, c34605m0, iM8170Q, -9223372036854775807L);
                }
                if (abstractC34609o2.mo8135g(pairM109405i.first, c34605m0).f145696f && abstractC34609o2.mo8129m(c34605m0.f145693c, c34607n0, 0L).f145714n == abstractC34609o2.mo8132b(pairM109405i.first)) {
                    return abstractC34609o0.m109405i(c34607n0, c34605m0, abstractC34609o0.mo8135g(pairM109405i.first, c34605m0).f145693c, c2845k0.f11246c);
                }
            }
            return pairM109405i;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: Q */
    public static int m8170Q(C34607n0 c34607n0, C34605m0 c34605m0, int i13, boolean z4, Object obj, AbstractC34609o0 abstractC34609o0, AbstractC34609o0 abstractC34609o1) {
        AbstractC34609o0 abstractC34609o2 = abstractC34609o0;
        Object obj2 = abstractC34609o2.mo8129m(abstractC34609o2.mo8135g(obj, c34605m0).f145693c, c34607n0, 0L).f145701a;
        for (int i14 = 0; i14 < abstractC34609o1.mo8139o(); i14++) {
            if (abstractC34609o1.mo8129m(i14, c34607n0, 0L).f145701a.equals(obj2)) {
                return i14;
            }
        }
        int iMo8132b = abstractC34609o2.mo8132b(obj);
        int iMo8136h = abstractC34609o2.mo8136h();
        int iMo8132b2 = -1;
        int i15 = 0;
        while (i15 < iMo8136h && iMo8132b2 == -1) {
            AbstractC34609o0 abstractC34609o3 = abstractC34609o2;
            int iM109404d = abstractC34609o3.m109404d(iMo8132b, c34605m0, c34607n0, i13, z4);
            if (iM109404d == -1) {
                break;
            }
            iMo8132b2 = abstractC34609o1.mo8132b(abstractC34609o3.mo8138l(iM109404d));
            i15++;
            abstractC34609o2 = abstractC34609o3;
            iMo8132b = iM109404d;
        }
        if (iMo8132b2 == -1) {
            return -1;
        }
        return abstractC34609o1.mo8128f(iMo8132b2, c34605m0, false).f145693c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l9.a0, l9.b1] */
    /* JADX INFO: renamed from: x */
    public static boolean m8171x(C2860q0 c2860q0) {
        if (c2860q0 != null) {
            try {
                ?? r10 = c2860q0.f11353a;
                if (c2860q0.f11357e) {
                    for (InterfaceC23540z0 interfaceC23540z0 : c2860q0.f11355c) {
                        if (interfaceC23540z0 != null) {
                            interfaceC23540z0.mo36170c();
                        }
                    }
                } else {
                    r10.mo36125h();
                }
                if ((!c2860q0.f11357e ? 0L : r10.mo36122d()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l9.a0, l9.b1] */
    /* JADX INFO: renamed from: A */
    public final void m8172A() {
        C2864s0 c2864s0 = this.f11271R;
        c2864s0.m8276k();
        C2860q0 c2860q0 = c2864s0.f11396m;
        if (c2860q0 != null) {
            ?? r10 = c2860q0.f11353a;
            if ((!c2860q0.f11356d || c2860q0.f11357e) && !r10.mo36121a()) {
                AbstractC34609o0 abstractC34609o0 = this.f11281b0.f11045a;
                if (c2860q0.f11357e) {
                    r10.mo36129m();
                }
                Iterator it = this.f11259F.f11242h.values().iterator();
                while (it.hasNext()) {
                    if (((C2841j) it.next()).f11221a) {
                        return;
                    }
                }
                if (!c2860q0.f11356d) {
                    long j7 = c2860q0.f11359g.f11372b;
                    c2860q0.f11356d = true;
                    r10.mo36132t(this, j7);
                    return;
                }
                C2854n0 c2854n0 = new C2854n0();
                c2854n0.f11323a = this.f11296q0 - c2860q0.f11368p;
                float f13 = this.f11267N.mo8164b().f145648a;
                AbstractC35849g.m113802d(f13 > 0.0f || f13 == -3.4028235E38f);
                c2854n0.f11324b = f13;
                long j13 = this.f11287h0;
                AbstractC35849g.m113802d(j13 >= 0 || j13 == -9223372036854775807L);
                c2854n0.f11325c = j13;
                C2856o0 c2856o0 = new C2856o0(c2854n0);
                AbstractC35849g.m113807i(c2860q0.f11365m == null);
                r10.mo36134x(c2856o0);
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m8173B() {
        C0704y c0704y = this.f11282c0;
        C2822c1 c2822c1 = this.f11281b0;
        boolean z4 = c0704y.f2664c | (((C2822c1) c0704y.f2666e) != c2822c1);
        c0704y.f2664c = z4;
        c0704y.f2666e = c2822c1;
        if (z4) {
            C2830f0 c2830f0 = this.f11270Q.f11403w;
            c2830f0.f11114K.m121879c(new RunnableC0533c(3, c2830f0, c0704y));
            this.f11282c0 = new C0704y(this.f11281b0);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m8174C(int i13) {
        C2843j1 c2843j1 = this.f11302w[i13];
        try {
            C2860q0 c2860q0 = this.f11271R.f11392i;
            c2860q0.getClass();
            AbstractC2829f abstractC2829fM8148d = c2843j1.m8148d(c2860q0);
            abstractC2829fM8148d.getClass();
            InterfaceC23540z0 interfaceC23540z0 = abstractC2829fM8148d.f11085I;
            interfaceC23540z0.getClass();
            interfaceC23540z0.mo36170c();
        } catch (IOException | RuntimeException e5) {
            int i14 = ((AbstractC2829f) c2843j1.f11233e).f11095x;
            if (i14 != 3 && i14 != 5) {
                throw e5;
            }
            C27682v c27682v = this.f11271R.f11392i.f11367o;
            AbstractC38046a.m121813h("ExoPlayerImplInternal", "Disabling track due to error: " + C34610p.m109409c(c27682v.f111439c[i13].mo68082n()), e5);
            C27682v c27682v2 = new C27682v((C2840i1[]) c27682v.f111438b.clone(), (InterfaceC27679s[]) c27682v.f111439c.clone(), c27682v.f111440d, c27682v.f111441e);
            c27682v2.f111438b[i13] = null;
            c27682v2.f111439c[i13] = null;
            m8208g(i13);
            C2860q0 c2860q1 = this.f11271R.f11392i;
            c2860q1.m8252a(c27682v2, this.f11281b0.f11063s, false, new boolean[c2860q1.f11362j.length]);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m8175D(int i13, boolean z4) {
        boolean[] zArr = this.f11306y;
        if (zArr[i13] != z4) {
            zArr[i13] = z4;
            this.f11277X.m121879c(new RunnableC2833g0(this, i13, z4));
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m8176E() throws Throwable {
        m8234t(this.f11272S.m8026d(), true);
    }

    /* JADX INFO: renamed from: F */
    public final void m8177F() {
        this.f11282c0.m1758c(1);
        throw null;
    }

    /* JADX INFO: renamed from: G */
    public final void m8178G() {
        this.f11282c0.m1758c(1);
        m8183L(false, false, false, true);
        C2844k c2844k = this.f11259F;
        HashMap map = c2844k.f11242h;
        long id4 = Thread.currentThread().getId();
        long j7 = c2844k.f11243i;
        AbstractC35849g.m113806h("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j7 == -1 || j7 == id4);
        c2844k.f11243i = id4;
        C4323n c4323n = this.f11275V;
        if (!map.containsKey(c4323n)) {
            map.put(c4323n, new C2841j());
        }
        C2841j c2841j = (C2841j) map.get(c4323n);
        c2841j.getClass();
        int i13 = c2844k.f11240f;
        if (i13 == -1) {
            i13 = 13107200;
        }
        c2841j.f11222b = i13;
        c2841j.f11221a = false;
        m8211h0(this.f11281b0.f11045a.m109408p() ? 4 : 2);
        C2822c1 c2822c1 = this.f11281b0;
        boolean z4 = c2822c1.f11056l;
        m8233s0(this.f11279Z.m8054d(c2822c1.f11049e, z4), c2822c1.f11058n, c2822c1.f11057m, z4);
        C28982f c28982f = (C28982f) this.f11260G;
        c28982f.getClass();
        C2819b1 c2819b1 = this.f11272S;
        ArrayList arrayList = c2819b1.f11029b;
        AbstractC35849g.m113807i(!c2819b1.f11034g);
        c2819b1.f11040m = c28982f;
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            C2816a1 c2816a1 = (C2816a1) arrayList.get(i14);
            c2819b1.m8030h(c2816a1);
            c2819b1.f11033f.add(c2816a1);
        }
        c2819b1.f11034g = true;
        this.f11261H.m121881e(2);
    }

    /* JADX INFO: renamed from: H */
    public final void m8179H() {
        C27672l c27672l;
        try {
            m8183L(true, false, true, false);
            m8180I();
            C2844k c2844k = this.f11259F;
            if (c2844k.f11242h.remove(this.f11275V) != null) {
                c2844k.m8160d();
            }
            if (c2844k.f11242h.isEmpty()) {
                c2844k.f11243i = -1L;
            }
            C2826e c2826e = this.f11279Z;
            c2826e.f11073c = null;
            c2826e.m8051a();
            c2826e.m8053c(0);
            C27677q c27677q = (C27677q) this.f11308z;
            c27677q.getClass();
            if (AbstractC38065t.f163031a >= 32 && (c27672l = c27677q.f111427h) != null) {
                c27672l.m83667d();
            }
            c27677q.f9291b = null;
            c27677q.f9292c = null;
            m8211h0(1);
            this.f11262I.m71620e();
            synchronized (this) {
                this.f11283d0 = true;
                notifyAll();
            }
        } catch (Throwable th3) {
            this.f11262I.m71620e();
            synchronized (this) {
                this.f11283d0 = true;
                notifyAll();
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m8180I() {
        for (int i13 = 0; i13 < this.f11302w.length; i13++) {
            AbstractC2829f abstractC2829f = this.f11304x[i13];
            synchronized (abstractC2829f.f11094w) {
                abstractC2829f.f11093Q = null;
            }
            C2843j1 c2843j1 = this.f11302w[i13];
            AbstractC2829f abstractC2829f2 = (AbstractC2829f) c2843j1.f11233e;
            AbstractC35849g.m113807i(abstractC2829f2.f11084H == 0);
            abstractC2829f2.mo8069r();
            c2843j1.f11229a = false;
            AbstractC2829f abstractC2829f3 = (AbstractC2829f) c2843j1.f11234f;
            if (abstractC2829f3 != null) {
                AbstractC35849g.m113807i(abstractC2829f3.f11084H == 0);
                abstractC2829f3.mo8069r();
                c2843j1.f11230b = false;
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m8181J(int i13, int i14, C23489c1 c23489c1) throws Throwable {
        this.f11282c0.m1758c(1);
        C2819b1 c2819b1 = this.f11272S;
        c2819b1.getClass();
        AbstractC35849g.m113802d(i13 >= 0 && i13 <= i14 && i14 <= c2819b1.f11029b.size());
        c2819b1.f11039l = c23489c1;
        c2819b1.m8034l(i13, i14);
        m8234t(c2819b1.m8026d(), false);
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0174  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: K */
    public final void m8182K() {
        int i13;
        int i14;
        float f13 = this.f11267N.mo8164b().f145648a;
        C2864s0 c2864s0 = this.f11271R;
        C2860q0 c2860q0 = c2864s0.f11392i;
        C2860q0 c2860q1 = c2864s0.f11393j;
        C27682v c27682v = null;
        C2860q0 c2860q2 = c2860q0;
        boolean z4 = true;
        while (c2860q2 != null && c2860q2.f11357e) {
            C2822c1 c2822c1 = this.f11281b0;
            C27682v c27682vM8261j = c2860q2.m8261j(f13, c2822c1.f11045a, c2822c1.f11056l);
            C27682v c27682v2 = c2860q2 == this.f11271R.f11392i ? c27682vM8261j : c27682v;
            C27682v c27682v3 = c2860q2.f11367o;
            InterfaceC27679s[] interfaceC27679sArr = c27682vM8261j.f111439c;
            if (c27682v3 != null && c27682v3.f111439c.length == interfaceC27679sArr.length) {
                int i15 = 0;
                while (true) {
                    if (i15 >= interfaceC27679sArr.length) {
                        if (c2860q2 == c2860q1) {
                            z4 = false;
                        }
                        c2860q2 = c2860q2.f11365m;
                        c27682v = c27682v2;
                    } else if (c27682vM8261j.m83677a(c27682v3, i15)) {
                        i15++;
                    }
                }
            }
            if (!z4) {
                i13 = 4;
                this.f11271R.m8279n(c2860q2);
                if (c2860q2.f11357e) {
                    long jMax = Math.max(c2860q2.f11359g.f11372b, this.f11296q0 - c2860q2.f11368p);
                    if (this.f11278Y && m8202d() && this.f11271R.f11394k == c2860q2) {
                        m8206f();
                    }
                    i14 = 4;
                    c2860q2.m8252a(c27682vM8261j, jMax, false, new boolean[c2860q2.f11362j.length]);
                }
                m8232s(true);
                if (this.f11281b0.f11049e != i14) {
                    m8243z();
                    m8235t0();
                    this.f11261H.m121881e(2);
                    return;
                }
                return;
            }
            C2864s0 c2864s1 = this.f11271R;
            C2860q0 c2860q3 = c2864s1.f11392i;
            boolean z13 = (c2864s1.m8279n(c2860q3) & 1) != 0;
            boolean[] zArr = new boolean[this.f11302w.length];
            c27682v2.getClass();
            long jM8252a = c2860q3.m8252a(c27682v2, this.f11281b0.f11063s, z13, zArr);
            C2822c1 c2822c2 = this.f11281b0;
            boolean z14 = (c2822c2.f11049e == 4 || jM8252a == c2822c2.f11063s) ? false : true;
            C2822c1 c2822c3 = this.f11281b0;
            i13 = 4;
            this.f11281b0 = m8240w(c2822c3.f11046b, jM8252a, c2822c3.f11047c, c2822c3.f11048d, z14, 5);
            if (z14) {
                m8185N(jM8252a);
            }
            m8206f();
            boolean[] zArr2 = new boolean[this.f11302w.length];
            int i16 = 0;
            while (true) {
                C2843j1[] c2843j1Arr = this.f11302w;
                if (i16 >= c2843j1Arr.length) {
                    break;
                }
                int iM8147c = c2843j1Arr[i16].m8147c();
                zArr2[i16] = this.f11302w[i16].m8151g();
                C2843j1 c2843j1 = this.f11302w[i16];
                InterfaceC23540z0 interfaceC23540z0 = c2860q3.f11355c[i16];
                C2847l c2847l = this.f11267N;
                long j7 = this.f11296q0;
                boolean z15 = zArr[i16];
                AbstractC2829f abstractC2829f = (AbstractC2829f) c2843j1.f11233e;
                if (C2843j1.m8144h(abstractC2829f)) {
                    if (interfaceC23540z0 != abstractC2829f.f11085I) {
                        c2843j1.m8146a(abstractC2829f, c2847l);
                    } else if (z15) {
                        abstractC2829f.f11090N = false;
                        abstractC2829f.f11088L = j7;
                        abstractC2829f.f11089M = j7;
                        abstractC2829f.mo8068q(j7, false);
                    }
                }
                AbstractC2829f abstractC2829f2 = (AbstractC2829f) c2843j1.f11234f;
                if (abstractC2829f2 != null && C2843j1.m8144h(abstractC2829f2)) {
                    if (interfaceC23540z0 != abstractC2829f2.f11085I) {
                        c2843j1.m8146a(abstractC2829f2, c2847l);
                    } else if (z15) {
                        abstractC2829f2.f11090N = false;
                        abstractC2829f2.f11088L = j7;
                        abstractC2829f2.f11089M = j7;
                        abstractC2829f2.mo8068q(j7, false);
                    }
                }
                if (iM8147c - this.f11302w[i16].m8147c() > 0) {
                    m8175D(i16, false);
                }
                this.f11294o0 -= iM8147c - this.f11302w[i16].m8147c();
                i16++;
            }
            m8214j(zArr2, this.f11296q0);
            c2860q3.f11360h = true;
            i14 = i13;
            m8232s(true);
            if (this.f11281b0.f11049e != i14) {
                m8243z();
                m8235t0();
                this.f11261H.m121881e(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x012c  */
    /* JADX WARN: Code duplicated, block: B:59:0x012e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0133  */
    /* JADX WARN: Code duplicated, block: B:63:0x0138  */
    /* JADX WARN: Code duplicated, block: B:65:0x013d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0142  */
    /* JADX WARN: Code duplicated, block: B:69:0x0147  */
    /* JADX WARN: Code duplicated, block: B:71:0x014e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0175  */
    /* JADX WARN: Code duplicated, block: B:76:0x017f  */
    /* JADX WARN: Code duplicated, block: B:79:0x018d A[LOOP:3: B:77:0x0185->B:79:0x018d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b4  */
    /* JADX INFO: renamed from: L */
    public final void m8183L(boolean z4, boolean z13, boolean z14, boolean z15) {
        long j7;
        long j13;
        long j14;
        boolean z16;
        AbstractC34609o0 c2837h1;
        C23488c0 c23488c0;
        C2822c1 c2822c1;
        ExoPlaybackException exoPlaybackException;
        C23501g1 c23501g1;
        C27682v c27682v;
        List list;
        C2864s0 c2864s0;
        int i13;
        this.f11261H.m121880d(2);
        this.f11300u0 = null;
        m8239v0(false, true);
        C2847l c2847l = this.f11267N;
        c2847l.f11255y = false;
        C2849l1 c2849l1 = (C2849l1) c2847l.f11256z;
        if (c2849l1.f11315z) {
            c2849l1.m8244a(c2849l1.mo8165c());
            c2849l1.f11315z = false;
        }
        this.f11296q0 = 1000000000000L;
        for (int i14 = 0; i14 < this.f11302w.length; i14++) {
            try {
                m8208g(i14);
            } catch (ExoPlaybackException e5) {
                e = e5;
                AbstractC38046a.m121813h("ExoPlayerImplInternal", "Disable failed.", e);
            } catch (RuntimeException e13) {
                e = e13;
                AbstractC38046a.m121813h("ExoPlayerImplInternal", "Disable failed.", e);
            }
        }
        this.f11305x0 = -9223372036854775807L;
        if (z4) {
            for (C2843j1 c2843j1 : this.f11302w) {
                try {
                    c2843j1.m8155l();
                } catch (RuntimeException e14) {
                    AbstractC38046a.m121813h("ExoPlayerImplInternal", "Reset failed.", e14);
                }
            }
        }
        this.f11294o0 = 0;
        C2822c1 c2822c2 = this.f11281b0;
        C23488c0 c23488c1 = c2822c2.f11046b;
        long j15 = c2822c2.f11063s;
        if (this.f11281b0.f11046b.m68054b()) {
            j7 = this.f11281b0.f11047c;
        } else {
            C2822c1 c2822c3 = this.f11281b0;
            C34605m0 c34605m0 = this.f11265L;
            C23488c0 c23488c2 = c2822c3.f11046b;
            AbstractC34609o0 abstractC34609o0 = c2822c3.f11045a;
            if (abstractC34609o0.m109408p() || abstractC34609o0.mo8135g(c23488c2.f92976a, c34605m0).f145696f) {
                j7 = this.f11281b0.f11047c;
            } else {
                j7 = this.f11281b0.f11063s;
            }
        }
        if (z13) {
            this.f11295p0 = null;
            Pair pairM8220m = m8220m(this.f11281b0.f11045a);
            c23488c1 = (C23488c0) pairM8220m.first;
            long jLongValue = ((Long) pairM8220m.second).longValue();
            z16 = c23488c1.equals(this.f11281b0.f11046b) ? false : true;
            j13 = jLongValue;
            j14 = -9223372036854775807L;
        } else {
            j13 = j15;
            j14 = j7;
            z16 = false;
        }
        this.f11271R.m8267b();
        this.f11288i0 = false;
        AbstractC34609o0 abstractC34609o1 = this.f11281b0.f11045a;
        if (z14 && (abstractC34609o1 instanceof C2837h1)) {
            C2837h1 c2837h2 = (C2837h1) abstractC34609o1;
            C23489c1 c23489c1 = (C23489c1) this.f11272S.f11039l;
            AbstractC34609o0[] abstractC34609o0Arr = c2837h2.f11196h;
            AbstractC34609o0[] abstractC34609o0Arr2 = new AbstractC34609o0[abstractC34609o0Arr.length];
            for (int i15 = 0; i15 < abstractC34609o0Arr.length; i15++) {
                abstractC34609o0Arr2[i15] = new C2834g1(abstractC34609o0Arr[i15]);
            }
            c2837h1 = new C2837h1(abstractC34609o0Arr2, c2837h2.f11197i, c23489c1);
            if (c23488c1.f92977b != -1) {
                c2837h1.mo8135g(c23488c1.f92976a, this.f11265L);
                int i16 = this.f11265L.f145693c;
                C34607n0 c34607n0 = this.f11264K;
                c2837h1.mo8129m(i16, c34607n0, 0L);
                if (c34607n0.m109401a()) {
                    c23488c0 = new C23488c0(c23488c1.f92976a, c23488c1.f92979d);
                }
            }
            c2822c1 = this.f11281b0;
            int i17 = c2822c1.f11049e;
            if (z15) {
                exoPlaybackException = null;
            } else {
                exoPlaybackException = c2822c1.f11050f;
            }
            if (z16) {
                c23501g1 = C23501g1.f93026d;
            } else {
                c23501g1 = c2822c1.f11052h;
            }
            C23501g1 c23501g2 = c23501g1;
            if (z16) {
                c27682v = this.f11258E;
            } else {
                c27682v = c2822c1.f11053i;
            }
            C27682v c27682v2 = c27682v;
            if (z16) {
                C41017e0 c41017e0 = AbstractC41023g0.f176998x;
                list = C41060w0.f177067E;
            } else {
                list = c2822c1.f11054j;
            }
            this.f11281b0 = new C2822c1(c2837h1, c23488c0, j14, j13, i17, exoPlaybackException, false, c23501g2, c27682v2, list, c23488c0, c2822c1.f11056l, c2822c1.f11057m, c2822c1.f11058n, c2822c1.f11059o, j13, 0L, j13, 0L, false);
            if (z14) {
                c2864s0 = this.f11271R;
                if (!c2864s0.f11400q.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (i13 = 0; i13 < c2864s0.f11400q.size(); i13++) {
                        ((C2860q0) c2864s0.f11400q.get(i13)).m8260i();
                    }
                    c2864s0.f11400q = arrayList;
                    c2864s0.f11396m = null;
                    c2864s0.m8276k();
                }
                C2819b1 c2819b1 = this.f11272S;
                HashMap map = c2819b1.f11032e;
                for (C2878z0 c2878z0 : map.values()) {
                    try {
                        c2878z0.f11436a.m68049n(c2878z0.f11437b);
                    } catch (RuntimeException e15) {
                        AbstractC38046a.m121813h("MediaSourceList", "Failed to release child source.", e15);
                    }
                    AbstractC23481a abstractC23481a = c2878z0.f11436a;
                    C2876y0 c2876y0 = c2878z0.f11438c;
                    abstractC23481a.m68051q(c2876y0);
                    c2878z0.f11436a.m68050p(c2876y0);
                }
                map.clear();
                c2819b1.f11033f.clear();
                c2819b1.f11034g = false;
            }
        }
        c2837h1 = abstractC34609o1;
        c23488c0 = c23488c1;
        c2822c1 = this.f11281b0;
        int i18 = c2822c1.f11049e;
        if (z15) {
            exoPlaybackException = null;
        } else {
            exoPlaybackException = c2822c1.f11050f;
        }
        if (z16) {
            c23501g1 = C23501g1.f93026d;
        } else {
            c23501g1 = c2822c1.f11052h;
        }
        C23501g1 c23501g3 = c23501g1;
        if (z16) {
            c27682v = this.f11258E;
        } else {
            c27682v = c2822c1.f11053i;
        }
        C27682v c27682v3 = c27682v;
        if (z16) {
            C41017e0 c41017e1 = AbstractC41023g0.f176998x;
            list = C41060w0.f177067E;
        } else {
            list = c2822c1.f11054j;
        }
        this.f11281b0 = new C2822c1(c2837h1, c23488c0, j14, j13, i18, exoPlaybackException, false, c23501g3, c27682v3, list, c23488c0, c2822c1.f11056l, c2822c1.f11057m, c2822c1.f11058n, c2822c1.f11059o, j13, 0L, j13, 0L, false);
        if (z14) {
            c2864s0 = this.f11271R;
            if (!c2864s0.f11400q.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                while (i13 < c2864s0.f11400q.size()) {
                    ((C2860q0) c2864s0.f11400q.get(i13)).m8260i();
                }
                c2864s0.f11400q = arrayList2;
                c2864s0.f11396m = null;
                c2864s0.m8276k();
            }
            C2819b1 c2819b2 = this.f11272S;
            HashMap map2 = c2819b2.f11032e;
            while (r5.hasNext()) {
                c2878z0.f11436a.m68049n(c2878z0.f11437b);
                AbstractC23481a abstractC23481a2 = c2878z0.f11436a;
                C2876y0 c2876y1 = c2878z0.f11438c;
                abstractC23481a2.m68051q(c2876y1);
                c2878z0.f11436a.m68050p(c2876y1);
            }
            map2.clear();
            c2819b2.f11033f.clear();
            c2819b2.f11034g = false;
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m8184M() {
        C2860q0 c2860q0 = this.f11271R.f11392i;
        this.f11285f0 = c2860q0 != null && c2860q0.f11359g.f11379i && this.f11284e0;
    }

    /* JADX INFO: renamed from: N */
    public final void m8185N(long j7) {
        C2860q0 c2860q0 = this.f11271R.f11392i;
        long j13 = j7 + (c2860q0 == null ? 1000000000000L : c2860q0.f11368p);
        this.f11296q0 = j13;
        ((C2849l1) this.f11267N.f11256z).m8244a(j13);
        for (C2843j1 c2843j1 : this.f11302w) {
            long j14 = this.f11296q0;
            AbstractC2829f abstractC2829fM8148d = c2843j1.m8148d(c2860q0);
            if (abstractC2829fM8148d != null) {
                abstractC2829fM8148d.f11090N = false;
                abstractC2829fM8148d.f11088L = j14;
                abstractC2829fM8148d.f11089M = j14;
                abstractC2829fM8148d.mo8068q(j14, false);
            }
        }
        for (C2860q0 c2860q1 = r0.f11392i; c2860q1 != null; c2860q1 = c2860q1.f11365m) {
            for (InterfaceC27679s interfaceC27679s : c2860q1.f11367o.f111439c) {
                if (interfaceC27679s != null) {
                    interfaceC27679s.mo68076h();
                }
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m8186O(AbstractC34609o0 abstractC34609o0, AbstractC34609o0 abstractC34609o1) {
        if (abstractC34609o0.m109408p() && abstractC34609o1.m109408p()) {
            return;
        }
        ArrayList arrayList = this.f11268O;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            AbstractC30802r.m94771t(arrayList.get(size));
            throw null;
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m8187R(long j7) {
        this.f11261H.f163026a.sendEmptyMessageAtTime(2, j7 + ((this.f11281b0.f11049e != 3 || m8217k0()) ? f11257A0 : 1000L));
    }

    /* JADX INFO: renamed from: S */
    public final void m8188S(boolean z4) {
        C23488c0 c23488c0 = this.f11271R.f11392i.f11359g.f11371a;
        long jM8190U = m8190U(c23488c0, this.f11281b0.f11063s, true, false);
        if (jM8190U != this.f11281b0.f11063s) {
            C2822c1 c2822c1 = this.f11281b0;
            this.f11281b0 = m8240w(c23488c0, jM8190U, c2822c1.f11047c, c2822c1.f11048d, z4, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x00a0 A[Catch: all -> 0x00a3, TryCatch #1 {all -> 0x00a3, blocks: (B:21:0x0096, B:23:0x00a0, B:30:0x00ac, B:32:0x00b2, B:33:0x00b5, B:35:0x00bd, B:39:0x00cd, B:43:0x00d5), top: B:97:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ac A[Catch: all -> 0x00a3, TryCatch #1 {all -> 0x00a3, blocks: (B:21:0x0096, B:23:0x00a0, B:30:0x00ac, B:32:0x00b2, B:33:0x00b5, B:35:0x00bd, B:39:0x00cd, B:43:0x00d5), top: B:97:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b2 A[Catch: all -> 0x00a3, TryCatch #1 {all -> 0x00a3, blocks: (B:21:0x0096, B:23:0x00a0, B:30:0x00ac, B:32:0x00b2, B:33:0x00b5, B:35:0x00bd, B:39:0x00cd, B:43:0x00d5), top: B:97:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd A[Catch: all -> 0x00a3, TRY_LEAVE, TryCatch #1 {all -> 0x00a3, blocks: (B:21:0x0096, B:23:0x00a0, B:30:0x00ac, B:32:0x00b2, B:33:0x00b5, B:35:0x00bd, B:39:0x00cd, B:43:0x00d5), top: B:97:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00de  */
    /* JADX WARN: Code duplicated, block: B:60:0x010f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0119  */
    /* JADX WARN: Code duplicated, block: B:64:0x011b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0124  */
    /* JADX WARN: Code duplicated, block: B:69:0x0127  */
    /* JADX WARN: Code duplicated, block: B:73:0x0131  */
    /* JADX WARN: Code duplicated, block: B:74:0x0134  */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, l9.a0] */
    /* JADX INFO: renamed from: T */
    public final void m8189T(C2845k0 c2845k0) throws Throwable {
        long jLongValue;
        C23488c0 c23488c0M8280p;
        long j7;
        boolean z4;
        long j13;
        long j14;
        C2860q0 c2860q0;
        long jMo36131s;
        C2822c1 c2822c1;
        int i13;
        long j15;
        C23488c0 c23488c0;
        int i14;
        long j16;
        boolean z13;
        C2864s0 c2864s0;
        boolean z14;
        long jM8190U;
        boolean z15;
        C23488c0 c23488c1;
        long j17;
        C2848l0 c2848l0 = this;
        c2848l0.f11282c0.m1758c(1);
        Pair pairM8169P = m8169P(c2848l0.f11281b0.f11045a, c2845k0, true, c2848l0.f11289j0, c2848l0.f11290k0, c2848l0.f11264K, c2848l0.f11265L);
        try {
            if (pairM8169P != null) {
                Object obj = pairM8169P.first;
                jLongValue = ((Long) pairM8169P.second).longValue();
                long j18 = c2845k0.f11246c == -9223372036854775807L ? -9223372036854775807L : jLongValue;
                c23488c0M8280p = c2848l0.f11271R.m8280p(c2848l0.f11281b0.f11045a, obj, jLongValue);
                if (c23488c0M8280p.m68054b()) {
                    c2848l0.f11281b0.f11045a.mo8135g(c23488c0M8280p.f92976a, c2848l0.f11265L);
                    if (c2848l0.f11265L.m109396e(c23488c0M8280p.f92977b) == c23488c0M8280p.f92978c) {
                        c2848l0.f11265L.f145697g.getClass();
                    }
                    z4 = true;
                    j13 = j18;
                    jLongValue = 0;
                } else {
                    j7 = 0;
                    z4 = c2845k0.f11246c == -9223372036854775807L;
                    j13 = j18;
                }
                if (c2848l0.f11281b0.f11045a.m109408p()) {
                    if (pairM8169P == null) {
                        if (c2848l0.f11281b0.f11049e != 1) {
                            c2848l0.m8211h0(4);
                        }
                        c2848l0.m8183L(false, true, false, true);
                    } else {
                        if (c23488c0M8280p.equals(c2848l0.f11281b0.f11046b)) {
                            try {
                                c2860q0 = c2848l0.f11271R.f11392i;
                                if (c2860q0 == null && c2860q0.f11357e && jLongValue != j7) {
                                    jMo36131s = c2860q0.f11353a.mo36131s(jLongValue, c2848l0.f11280a0);
                                } else {
                                    jMo36131s = jLongValue;
                                }
                                if (AbstractC38065t.m121907U(jMo36131s) != AbstractC38065t.m121907U(c2848l0.f11281b0.f11063s) && ((i13 = (c2822c1 = c2848l0.f11281b0).f11049e) == 2 || i13 == 3)) {
                                    j15 = c2822c1.f11063s;
                                    z4 = z4;
                                    c23488c0 = c23488c0M8280p;
                                    i14 = 2;
                                    j16 = j15;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                c23488c0M8280p = c23488c0M8280p;
                                j14 = jLongValue;
                                c2848l0.f11281b0 = c2848l0.m8240w(c23488c0M8280p, j14, j13, j14, z4, 2);
                                throw th;
                            }
                        } else {
                            jMo36131s = jLongValue;
                        }
                        try {
                            if (c2848l0.f11281b0.f11049e == 4) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            c2864s0 = c2848l0.f11271R;
                            if (c2864s0.f11392i != c2864s0.f11393j) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            jM8190U = c2848l0.m8190U(c23488c0M8280p, jMo36131s, z14, z13);
                            if (jLongValue != jM8190U) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z4 |= z15;
                            try {
                                C2822c1 c2822c2 = c2848l0.f11281b0;
                                c23488c1 = c23488c0M8280p;
                                try {
                                    AbstractC34609o0 abstractC34609o0 = c2822c2.f11045a;
                                    j17 = j13;
                                    try {
                                        c2848l0.m8237u0(abstractC34609o0, c23488c1, abstractC34609o0, c2822c2.f11046b, j17, true);
                                        c23488c0 = c23488c1;
                                        j13 = j17;
                                        j15 = jM8190U;
                                        i14 = 2;
                                        j16 = j15;
                                        c2848l0 = this;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        c23488c0M8280p = c23488c1;
                                        j13 = j17;
                                        j14 = jM8190U;
                                        c2848l0.f11281b0 = c2848l0.m8240w(c23488c0M8280p, j14, j13, j14, z4, 2);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    c23488c0M8280p = c23488c1;
                                    j13 = j13;
                                    j14 = jM8190U;
                                    c2848l0.f11281b0 = c2848l0.m8240w(c23488c0M8280p, j14, j13, j14, z4, 2);
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            j13 = j13;
                            j14 = jLongValue;
                            c2848l0.f11281b0 = c2848l0.m8240w(c23488c0M8280p, j14, j13, j14, z4, 2);
                            throw th;
                        }
                    }
                    c2848l0.f11281b0 = c2848l0.m8240w(c23488c0, j15, j13, j16, z4, i14);
                    return;
                }
                c2848l0.f11295p0 = c2845k0;
                z4 = z4;
                c23488c0 = c23488c0M8280p;
                j15 = jLongValue;
                i14 = 2;
                j16 = j15;
                c2848l0 = this;
                c2848l0.f11281b0 = c2848l0.m8240w(c23488c0, j15, j13, j16, z4, i14);
                return;
            }
            Pair pairM8220m = c2848l0.m8220m(c2848l0.f11281b0.f11045a);
            c23488c0M8280p = (C23488c0) pairM8220m.first;
            jLongValue = ((Long) pairM8220m.second).longValue();
            z4 = !c2848l0.f11281b0.f11045a.m109408p();
            j13 = -9223372036854775807L;
            if (c2848l0.f11281b0.f11045a.m109408p()) {
                if (pairM8169P == null) {
                    if (c2848l0.f11281b0.f11049e != 1) {
                        c2848l0.m8211h0(4);
                    }
                    c2848l0.m8183L(false, true, false, true);
                } else {
                    if (c23488c0M8280p.equals(c2848l0.f11281b0.f11046b)) {
                        c2860q0 = c2848l0.f11271R.f11392i;
                        if (c2860q0 == null) {
                            jMo36131s = jLongValue;
                        } else {
                            jMo36131s = jLongValue;
                        }
                        if (AbstractC38065t.m121907U(jMo36131s) != AbstractC38065t.m121907U(c2848l0.f11281b0.f11063s)) {
                        }
                    } else {
                        jMo36131s = jLongValue;
                    }
                    if (c2848l0.f11281b0.f11049e == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    c2864s0 = c2848l0.f11271R;
                    if (c2864s0.f11392i != c2864s0.f11393j) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    jM8190U = c2848l0.m8190U(c23488c0M8280p, jMo36131s, z14, z13);
                    if (jLongValue != jM8190U) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z4 |= z15;
                    C2822c1 c2822c3 = c2848l0.f11281b0;
                    c23488c1 = c23488c0M8280p;
                    AbstractC34609o0 abstractC34609o1 = c2822c3.f11045a;
                    j17 = j13;
                    c2848l0.m8237u0(abstractC34609o1, c23488c1, abstractC34609o1, c2822c3.f11046b, j17, true);
                    c23488c0 = c23488c1;
                    j13 = j17;
                    j15 = jM8190U;
                    i14 = 2;
                    j16 = j15;
                    c2848l0 = this;
                }
                c2848l0.f11281b0 = c2848l0.m8240w(c23488c0, j15, j13, j16, z4, i14);
                return;
            }
            c2848l0.f11295p0 = c2845k0;
            z4 = z4;
            c23488c0 = c23488c0M8280p;
            j15 = jLongValue;
            i14 = 2;
            j16 = j15;
            c2848l0 = this;
            c2848l0.f11281b0 = c2848l0.m8240w(c23488c0, j15, j13, j16, z4, i14);
            return;
        } catch (Throwable th8) {
            th = th8;
        }
        j7 = 0;
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, l9.a0] */
    /* JADX INFO: renamed from: U */
    public final long m8190U(C23488c0 c23488c0, long j7, boolean z4, boolean z13) {
        C2843j1[] c2843j1Arr;
        m8225o0();
        m8239v0(false, true);
        if (z13 || this.f11281b0.f11049e == 3) {
            m8211h0(2);
        }
        C2864s0 c2864s0 = this.f11271R;
        C2860q0 c2860q0 = c2864s0.f11392i;
        C2860q0 c2860q1 = c2860q0;
        while (c2860q1 != null && !c23488c0.equals(c2860q1.f11359g.f11371a)) {
            c2860q1 = c2860q1.f11365m;
        }
        if (z4 || c2860q0 != c2860q1 || (c2860q1 != null && c2860q1.f11368p + j7 < 0)) {
            int i13 = 0;
            while (true) {
                c2843j1Arr = this.f11302w;
                if (i13 >= c2843j1Arr.length) {
                    break;
                }
                m8208g(i13);
                i13++;
            }
            this.f11305x0 = -9223372036854775807L;
            if (c2860q1 != null) {
                while (c2864s0.f11392i != c2860q1) {
                    c2864s0.m8266a();
                }
                c2864s0.m8279n(c2860q1);
                c2860q1.f11368p = 1000000000000L;
                m8214j(new boolean[c2843j1Arr.length], c2864s0.f11393j.m8256e());
                c2860q1.f11360h = true;
            }
        }
        m8206f();
        if (c2860q1 != null) {
            ?? r10 = c2860q1.f11353a;
            c2864s0.m8279n(c2860q1);
            if (!c2860q1.f11357e) {
                c2860q1.f11359g = c2860q1.f11359g.m8264b(j7);
            } else if (c2860q1.f11358f) {
                j7 = r10.mo36123e(j7);
                r10.mo36126i(j7 - this.f11266M);
            }
            m8185N(j7);
            m8243z();
        } else {
            c2864s0.m8267b();
            m8185N(j7);
        }
        m8232s(false);
        this.f11261H.m121881e(2);
        return j7;
    }

    /* JADX INFO: renamed from: V */
    public final void m8191V(C2831f1 c2831f1) {
        c2831f1.getClass();
        C38063r c38063r = this.f11261H;
        if (c2831f1.f11163e != this.f11263J) {
            c38063r.m121878a(15, c2831f1).m121876b();
            return;
        }
        synchronized (c2831f1) {
        }
        try {
            c2831f1.f11159a.mo8047a(c2831f1.f11161c, c2831f1.f11162d);
            c2831f1.m8126a(true);
            int i13 = this.f11281b0.f11049e;
            if (i13 == 3 || i13 == 2) {
                c38063r.m121881e(2);
            }
        } catch (Throwable th3) {
            c2831f1.m8126a(true);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m8192W(C2831f1 c2831f1) {
        Looper looper = c2831f1.f11163e;
        if (looper.getThread().isAlive()) {
            this.f11269P.m121874a(looper, null).m121879c(new RunnableC1319m(this, c2831f1));
        } else {
            AbstractC38046a.m121826u("TAG", "Trying to send message on a dead thread.");
            c2831f1.m8126a(false);
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m8193X(C34586d c34586d, boolean z4) {
        C27677q c27677q = (C27677q) this.f11308z;
        if (!c27677q.f111428i.equals(c34586d)) {
            c27677q.f111428i = c34586d;
            c27677q.m83675O();
        }
        if (!z4) {
            c34586d = null;
        }
        C2826e c2826e = this.f11279Z;
        if (!Objects.equals(c2826e.f11074d, c34586d)) {
            c2826e.f11074d = c34586d;
            int i13 = c34586d == null ? 0 : 1;
            c2826e.f11076f = i13;
            AbstractC35849g.m113803e(i13 == 1 || i13 == 0, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
        C2822c1 c2822c1 = this.f11281b0;
        boolean z13 = c2822c1.f11056l;
        m8233s0(c2826e.m8054d(c2822c1.f11049e, z13), c2822c1.f11058n, c2822c1.f11057m, z13);
    }

    /* JADX INFO: renamed from: Y */
    public final void m8194Y(boolean z4, AtomicBoolean atomicBoolean) {
        if (this.f11291l0 != z4) {
            this.f11291l0 = z4;
            if (!z4) {
                for (C2843j1 c2843j1 : this.f11302w) {
                    c2843j1.m8155l();
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

    /* JADX INFO: renamed from: Z */
    public final void m8195Z(C2839i0 c2839i0) throws Throwable {
        this.f11282c0.m1758c(1);
        int i13 = c2839i0.f11216c;
        C23489c1 c23489c1 = c2839i0.f11215b;
        ArrayList arrayList = c2839i0.f11214a;
        if (i13 != -1) {
            this.f11295p0 = new C2845k0(new C2837h1(arrayList, c23489c1), c2839i0.f11216c, c2839i0.f11217d);
        }
        C2819b1 c2819b1 = this.f11272S;
        ArrayList arrayList2 = c2819b1.f11029b;
        c2819b1.m8034l(0, arrayList2.size());
        m8234t(c2819b1.m8024b(arrayList2.size(), arrayList, c23489c1), false);
    }

    /* JADX INFO: renamed from: a */
    public final void m8196a(C2839i0 c2839i0, int i13) throws Throwable {
        this.f11282c0.m1758c(1);
        C2819b1 c2819b1 = this.f11272S;
        if (i13 == -1) {
            i13 = c2819b1.f11029b.size();
        }
        m8234t(c2819b1.m8024b(i13, c2839i0.f11214a, c2839i0.f11215b), false);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m8197a0(boolean z4) {
        this.f11284e0 = z4;
        m8184M();
        if (this.f11285f0) {
            C2864s0 c2864s0 = this.f11271R;
            if (c2864s0.f11393j != c2864s0.f11392i) {
                m8188S(true);
                m8232s(false);
            }
        }
    }

    @Override // p299l9.InterfaceC23483a1
    /* JADX INFO: renamed from: b */
    public final void mo8198b(InterfaceC23486b1 interfaceC23486b1) {
        this.f11261H.m121878a(9, (InterfaceC23482a0) interfaceC23486b1).m121876b();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m8199b0(C34589e0 c34589e0) {
        this.f11261H.m121880d(16);
        C2847l c2847l = this.f11267N;
        c2847l.mo8166d(c34589e0);
        C34589e0 c34589e0Mo8164b = c2847l.mo8164b();
        m8238v(c34589e0Mo8164b, c34589e0Mo8164b.f145648a, true, true);
    }

    @Override // p299l9.InterfaceC23539z
    /* JADX INFO: renamed from: c */
    public final void mo8200c(InterfaceC23482a0 interfaceC23482a0) {
        this.f11261H.m121878a(8, interfaceC23482a0).m121876b();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m8201c0(C2859q c2859q) {
        this.f11303w0 = c2859q;
        AbstractC34609o0 abstractC34609o0 = this.f11281b0.f11045a;
        C2864s0 c2864s0 = this.f11271R;
        c2864s0.getClass();
        c2859q.getClass();
        if (c2864s0.f11400q.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < c2864s0.f11400q.size(); i13++) {
            ((C2860q0) c2864s0.f11400q.get(i13)).m8260i();
        }
        c2864s0.f11400q = arrayList;
        c2864s0.f11396m = null;
        c2864s0.m8276k();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m8202d() {
        if (!this.f11278Y) {
            return false;
        }
        for (C2843j1 c2843j1 : this.f11302w) {
            if (c2843j1.m8150f()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m8203d0(int i13) {
        this.f11289j0 = i13;
        AbstractC34609o0 abstractC34609o0 = this.f11281b0.f11045a;
        C2864s0 c2864s0 = this.f11271R;
        c2864s0.f11390g = i13;
        int iM8282r = c2864s0.m8282r(abstractC34609o0);
        if ((iM8282r & 1) != 0) {
            m8188S(true);
        } else if ((iM8282r & 2) != 0) {
            m8206f();
        }
        m8232s(false);
    }

    /* JADX INFO: renamed from: e */
    public final void m8204e() {
        m8182K();
        m8188S(true);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m8205e0(C2846k1 c2846k1) {
        this.f11280a0 = c2846k1;
    }

    /* JADX INFO: renamed from: f */
    public final void m8206f() {
        AbstractC2829f abstractC2829f;
        if (this.f11278Y && m8202d()) {
            for (C2843j1 c2843j1 : this.f11302w) {
                int iM8147c = c2843j1.m8147c();
                if (c2843j1.m8150f()) {
                    int i13 = c2843j1.f11232d;
                    boolean z4 = i13 == 4 || i13 == 2;
                    int i14 = i13 != 4 ? 0 : 1;
                    if (z4) {
                        abstractC2829f = (AbstractC2829f) c2843j1.f11233e;
                    } else {
                        abstractC2829f = (AbstractC2829f) c2843j1.f11234f;
                        abstractC2829f.getClass();
                    }
                    c2843j1.m8146a(abstractC2829f, this.f11267N);
                    c2843j1.m8153j(z4);
                    c2843j1.f11232d = i14;
                }
                this.f11294o0 -= iM8147c - c2843j1.m8147c();
            }
            this.f11305x0 = -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m8207f0(boolean z4) {
        this.f11290k0 = z4;
        AbstractC34609o0 abstractC34609o0 = this.f11281b0.f11045a;
        C2864s0 c2864s0 = this.f11271R;
        c2864s0.f11391h = z4;
        int iM8282r = c2864s0.m8282r(abstractC34609o0);
        if ((iM8282r & 1) != 0) {
            m8188S(true);
        } else if ((iM8282r & 2) != 0) {
            m8206f();
        }
        m8232s(false);
    }

    /* JADX INFO: renamed from: g */
    public final void m8208g(int i13) {
        C2843j1[] c2843j1Arr = this.f11302w;
        int iM8147c = c2843j1Arr[i13].m8147c();
        C2843j1 c2843j1 = c2843j1Arr[i13];
        AbstractC2829f abstractC2829f = (AbstractC2829f) c2843j1.f11233e;
        C2847l c2847l = this.f11267N;
        c2843j1.m8146a(abstractC2829f, c2847l);
        AbstractC2829f abstractC2829f2 = (AbstractC2829f) c2843j1.f11234f;
        if (abstractC2829f2 != null) {
            boolean z4 = (abstractC2829f2.f11084H == 0 || c2843j1.f11232d == 3) ? false : true;
            c2843j1.m8146a(abstractC2829f2, c2847l);
            c2843j1.m8153j(false);
            if (z4) {
                AbstractC2829f abstractC2829f3 = (AbstractC2829f) c2843j1.f11233e;
                abstractC2829f2.getClass();
                abstractC2829f2.mo8047a(17, abstractC2829f3);
            }
        }
        c2843j1.f11232d = 0;
        m8175D(i13, false);
        this.f11294o0 -= iM8147c;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m8209g0(C23489c1 c23489c1) throws Throwable {
        this.f11282c0.m1758c(1);
        C2819b1 c2819b1 = this.f11272S;
        int size = c2819b1.f11029b.size();
        if (c23489c1.f92982b.length != size) {
            c23489c1 = new C23489c1(new Random(c23489c1.f92981a.nextLong())).m68055a(size);
        }
        c2819b1.f11039l = c23489c1;
        m8234t(c2819b1.m8026d(), false);
    }

    /* JADX WARN: Failed to calculate best type for var: r23v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v4 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r23v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v4 ??, new type: long
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
    /* JADX WARN: Failed to calculate best type for var: r23v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v9 ??, new type: long
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
    /* JADX WARN: Failed to calculate best type for var: r2v88 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v88 ??, new type: long
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
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v4 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    /* JADX INFO: renamed from: h */
    public final void m8210h() {
        /*
            Method dump skipped, instruction units count: 2381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p031b9.C2848l0.m8210h():void");
    }

    /* JADX INFO: renamed from: h0 */
    public final void m8211h0(int i13) {
        C2822c1 c2822c1 = this.f11281b0;
        if (c2822c1.f11049e != i13) {
            if (i13 != 2) {
                this.f11301v0 = -9223372036854775807L;
            }
            this.f11281b0 = c2822c1.m8043h(i13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x022b  */
    /* JADX WARN: Code duplicated, block: B:123:0x022f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0244 A[LOOP:1: B:128:0x023e->B:130:0x0244, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:144:0x0293  */
    /* JADX WARN: Code duplicated, block: B:150:0x0248 A[EDGE_INSN: B:150:0x0248->B:131:0x0248 BREAK  A[LOOP:1: B:128:0x023e->B:130:0x0244], SYNTHETIC] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        ExoPlaybackException exoPlaybackException;
        int i13;
        C2860q0 c2860q0;
        C2860q0 c2860q1;
        C2860q0 c2860q2;
        int i14;
        int i15 = 1000;
        try {
            switch (message.what) {
                case 1:
                    boolean z4 = message.arg1 != 0;
                    int i16 = message.arg2;
                    this.f11282c0.m1758c(1);
                    m8233s0(this.f11279Z.m8054d(this.f11281b0.f11049e, z4), i16 >> 4, i16 & 15, z4);
                    break;
                case 2:
                    m8210h();
                    break;
                case 3:
                    m8189T((C2845k0) message.obj);
                    break;
                case 4:
                    m8199b0((C34589e0) message.obj);
                    break;
                case 5:
                    m8205e0((C2846k1) message.obj);
                    break;
                case 6:
                    m8223n0(false, true);
                    break;
                case 7:
                    m8179H();
                    return true;
                case 8:
                    m8236u((InterfaceC23482a0) message.obj);
                    break;
                case 9:
                    m8228q((InterfaceC23482a0) message.obj);
                    break;
                case 10:
                    m8182K();
                    break;
                case 11:
                    m8203d0(message.arg1);
                    break;
                case 12:
                    m8207f0(message.arg1 != 0);
                    break;
                case 13:
                    m8194Y(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    m8191V((C2831f1) message.obj);
                    break;
                case 15:
                    m8192W((C2831f1) message.obj);
                    break;
                case 16:
                    C34589e0 c34589e0 = (C34589e0) message.obj;
                    m8238v(c34589e0, c34589e0.f145648a, true, false);
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    m8195Z((C2839i0) message.obj);
                    break;
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                    m8196a((C2839i0) message.obj, message.arg1);
                    break;
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    AbstractC30802r.m94771t(message.obj);
                    m8177F();
                    throw null;
                case 20:
                    m8181J(message.arg1, message.arg2, (C23489c1) message.obj);
                    break;
                case 21:
                    m8209g0((C23489c1) message.obj);
                    break;
                case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    m8176E();
                    break;
                case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                    m8197a0(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    m8204e();
                    break;
                case 26:
                    m8182K();
                    m8188S(true);
                    break;
                case 27:
                    m8231r0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    m8201c0((C2859q) message.obj);
                    break;
                case 29:
                    m8178G();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    m8213i0(pair.first, (AtomicBoolean) pair.second);
                    break;
                case 31:
                    m8193X((C34586d) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    m8215j0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    m8224o(message.arg1);
                    break;
                case 34:
                    m8226p();
                    break;
            }
        } catch (ParserException e5) {
            boolean z13 = e5.f6363w;
            int i17 = e5.f6364x;
            if (i17 == 1) {
                i14 = z13 ? ErrorCodes.TracksErrors.cCantAccessCaptureDevice : 3003;
            } else {
                if (i17 == 4) {
                    i14 = z13 ? 3002 : ErrorCodes.TracksErrors.cPeerConnectionFactoryDisposed;
                }
                m8230r(e5, i15);
            }
            i15 = i14;
            m8230r(e5, i15);
        } catch (DataSourceException e13) {
            m8230r(e13, e13.f6368w);
        } catch (ExoPlaybackException e14) {
            e = e14;
            int i18 = e.f6376y;
            C2843j1[] c2843j1Arr = this.f11302w;
            C2864s0 c2864s0 = this.f11271R;
            if (i18 == 1 && (c2860q1 = c2864s0.f11393j) != null) {
                int length = c2843j1Arr.length;
                int i19 = e.f6371E;
                e = e.m5054a((!c2843j1Arr[i19 % length].m8152i(i19) || (c2860q2 = c2860q1.f11365m) == null) ? c2860q1.f11359g.f11371a : c2860q2.f11359g.f11371a);
            }
            int i24 = e.f6376y;
            C38063r c38063r = this.f11261H;
            if (i24 == 1) {
                int i25 = e.f6371E;
                if (c2843j1Arr[i25 % c2843j1Arr.length].m8152i(i25)) {
                    this.f11307y0 = true;
                    m8206f();
                    C2860q0 c2860q0M8272g = c2864s0.m8272g();
                    C2860q0 c2860q3 = c2864s0.f11392i;
                    if (c2860q3 != c2860q0M8272g) {
                        while (c2860q3 != null) {
                            C2860q0 c2860q4 = c2860q3.f11365m;
                            if (c2860q4 == c2860q0M8272g) {
                                break;
                            }
                            c2860q3 = c2860q4;
                        }
                    }
                    c2864s0.m8279n(c2860q3);
                    if (this.f11281b0.f11049e != 4) {
                        m8243z();
                        c38063r.m121881e(2);
                    }
                } else {
                    exoPlaybackException = this.f11300u0;
                    if (exoPlaybackException != null) {
                        exoPlaybackException.addSuppressed(e);
                        e = this.f11300u0;
                    }
                    if (e.f6376y == 1 && c2864s0.f11392i != c2864s0.f11393j) {
                        while (true) {
                            c2860q0 = c2864s0.f11392i;
                            if (c2860q0 != c2864s0.f11393j) {
                                break;
                            }
                            c2864s0.m8266a();
                        }
                        AbstractC35849g.m113805g(c2860q0);
                        m8173B();
                        C2862r0 c2862r0 = c2860q0.f11359g;
                        C23488c0 c23488c0 = c2862r0.f11371a;
                        long j7 = c2862r0.f11372b;
                        this.f11281b0 = m8240w(c23488c0, j7, c2862r0.f11373c, j7, true, 0);
                    }
                    if (e.f6375I || !(this.f11300u0 == null || (i13 = e.f6365w) == 5004 || i13 == 5003)) {
                        AbstractC38046a.m121813h("ExoPlayerImplInternal", "Playback error", e);
                        m8223n0(true, false);
                        this.f11281b0 = this.f11281b0.m8041f(e);
                    } else {
                        AbstractC38046a.m121827v("ExoPlayerImplInternal", "Recoverable renderer error", e);
                        if (this.f11300u0 == null) {
                            this.f11300u0 = e;
                        }
                        C38062q c38062qM121878a = c38063r.m121878a(25, e);
                        Handler handler = c38063r.f163026a;
                        Message message2 = c38062qM121878a.f163024a;
                        message2.getClass();
                        handler.sendMessageAtFrontOfQueue(message2);
                        c38062qM121878a.m121875a();
                    }
                }
            } else {
                exoPlaybackException = this.f11300u0;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.f11300u0;
                }
                if (e.f6376y == 1) {
                    while (true) {
                        c2860q0 = c2864s0.f11392i;
                        if (c2860q0 != c2864s0.f11393j) {
                            break;
                            break;
                        }
                        c2864s0.m8266a();
                    }
                    AbstractC35849g.m113805g(c2860q0);
                    m8173B();
                    C2862r0 c2862r1 = c2860q0.f11359g;
                    C23488c0 c23488c1 = c2862r1.f11371a;
                    long j13 = c2862r1.f11372b;
                    this.f11281b0 = m8240w(c23488c1, j13, c2862r1.f11373c, j13, true, 0);
                }
                if (e.f6375I) {
                    AbstractC38046a.m121813h("ExoPlayerImplInternal", "Playback error", e);
                    m8223n0(true, false);
                    this.f11281b0 = this.f11281b0.m8041f(e);
                } else {
                    AbstractC38046a.m121813h("ExoPlayerImplInternal", "Playback error", e);
                    m8223n0(true, false);
                    this.f11281b0 = this.f11281b0.m8041f(e);
                }
            }
        } catch (DrmSession$DrmSessionException e15) {
            m8230r(e15, e15.f6391w);
        } catch (BehindLiveWindowException e16) {
            m8230r(e16, 1002);
        } catch (IOException e17) {
            m8230r(e17, ErrorCodes.InitAPIErrors.cServerErrors);
        } catch (RuntimeException e18) {
            ExoPlaybackException exoPlaybackException2 = new ExoPlaybackException(2, e18, ((e18 instanceof IllegalStateException) || (e18 instanceof IllegalArgumentException)) ? MessageListItemViewType.CUSTOM_ATTACHMENTS : 1000);
            AbstractC38046a.m121813h("ExoPlayerImplInternal", "Playback error", exoPlaybackException2);
            m8223n0(true, false);
            this.f11281b0 = this.f11281b0.m8041f(exoPlaybackException2);
        }
        m8173B();
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m8212i(C2860q0 c2860q0, int i13, boolean z4, long j7) {
        C2843j1 c2843j1 = this.f11302w[i13];
        boolean zM8151g = c2843j1.m8151g();
        AbstractC2829f abstractC2829f = (AbstractC2829f) c2843j1.f11233e;
        if (zM8151g) {
            return;
        }
        boolean z13 = c2860q0 == this.f11271R.f11392i;
        C27682v c27682v = c2860q0.f11367o;
        C2840i1 c2840i1 = c27682v.f111438b[i13];
        InterfaceC27679s interfaceC27679s = c27682v.f111439c[i13];
        boolean z14 = m8217k0() && this.f11281b0.f11049e == 3;
        boolean z15 = !z4 && z14;
        this.f11294o0++;
        InterfaceC23540z0 interfaceC23540z0 = c2860q0.f11355c[i13];
        long j13 = c2860q0.f11368p;
        C23488c0 c23488c0 = c2860q0.f11359g.f11371a;
        AbstractC2829f abstractC2829f2 = (AbstractC2829f) c2843j1.f11234f;
        int length = interfaceC27679s != null ? interfaceC27679s.length() : 0;
        C34610p[] c34610pArr = new C34610p[length];
        for (int i14 = 0; i14 < length; i14++) {
            interfaceC27679s.getClass();
            c34610pArr[i14] = interfaceC27679s.mo68072d(i14);
        }
        int i15 = c2843j1.f11232d;
        C2847l c2847l = this.f11267N;
        if (i15 == 0 || i15 == 2 || i15 == 4) {
            c2843j1.f11229a = true;
            AbstractC35849g.m113807i(abstractC2829f.f11084H == 0);
            abstractC2829f.f11097z = c2840i1;
            abstractC2829f.f11084H = 1;
            abstractC2829f.mo8067p(z15, z13);
            abstractC2829f.m8076y(c34610pArr, interfaceC23540z0, j7, j13, c23488c0);
            abstractC2829f.f11090N = false;
            abstractC2829f.f11088L = j7;
            abstractC2829f.f11089M = j7;
            abstractC2829f.mo8068q(j7, z15);
            c2847l.m8162a(abstractC2829f);
        } else {
            c2843j1.f11230b = true;
            abstractC2829f2.getClass();
            AbstractC35849g.m113807i(abstractC2829f2.f11084H == 0);
            abstractC2829f2.f11097z = c2840i1;
            abstractC2829f2.f11084H = 1;
            abstractC2829f2.mo8067p(z15, z13);
            abstractC2829f2.m8076y(c34610pArr, interfaceC23540z0, j7, j13, c23488c0);
            abstractC2829f2.f11090N = false;
            abstractC2829f2.f11088L = j7;
            abstractC2829f2.f11089M = j7;
            abstractC2829f2.mo8068q(j7, z15);
            c2847l.m8162a(abstractC2829f2);
        }
        C2836h0 c2836h0 = new C2836h0(this);
        AbstractC2829f abstractC2829fM8148d = c2843j1.m8148d(c2860q0);
        abstractC2829fM8148d.getClass();
        abstractC2829fM8148d.mo8047a(11, c2836h0);
        if (z14 && z13) {
            c2843j1.m8156n();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m8213i0(Object obj, AtomicBoolean atomicBoolean) {
        for (C2843j1 c2843j1 : this.f11302w) {
            AbstractC2829f abstractC2829f = (AbstractC2829f) c2843j1.f11233e;
            if (abstractC2829f.f11095x == 2) {
                int i13 = c2843j1.f11232d;
                if (i13 == 4 || i13 == 1) {
                    AbstractC2829f abstractC2829f2 = (AbstractC2829f) c2843j1.f11234f;
                    abstractC2829f2.getClass();
                    abstractC2829f2.mo8047a(1, obj);
                } else {
                    abstractC2829f.mo8047a(1, obj);
                }
            }
        }
        int i14 = this.f11281b0.f11049e;
        if (i14 == 3 || i14 == 2) {
            this.f11261H.m121881e(2);
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m8214j(boolean[] zArr, long j7) {
        C2843j1[] c2843j1Arr;
        long j13;
        C2860q0 c2860q0 = this.f11271R.f11393j;
        C27682v c27682v = c2860q0.f11367o;
        int i13 = 0;
        while (true) {
            c2843j1Arr = this.f11302w;
            if (i13 >= c2843j1Arr.length) {
                break;
            }
            if (!c27682v.m83678b(i13)) {
                c2843j1Arr[i13].m8155l();
            }
            i13++;
        }
        int i14 = 0;
        while (i14 < c2843j1Arr.length) {
            if (c27682v.m83678b(i14) && c2843j1Arr[i14].m8148d(c2860q0) == null) {
                j13 = j7;
                m8212i(c2860q0, i14, zArr[i14], j13);
            } else {
                j13 = j7;
            }
            i14++;
            j7 = j13;
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m8215j0(float f13) {
        this.f11309z0 = f13;
        float f14 = f13 * this.f11279Z.f11077g;
        for (C2843j1 c2843j1 : this.f11302w) {
            AbstractC2829f abstractC2829f = (AbstractC2829f) c2843j1.f11233e;
            if (abstractC2829f.f11095x == 1) {
                abstractC2829f.mo8047a(2, Float.valueOf(f14));
                AbstractC2829f abstractC2829f2 = (AbstractC2829f) c2843j1.f11234f;
                if (abstractC2829f2 != null) {
                    abstractC2829f2.mo8047a(2, Float.valueOf(f14));
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final long m8216k(AbstractC34609o0 abstractC34609o0, Object obj, long j7) {
        C34605m0 c34605m0 = this.f11265L;
        int i13 = abstractC34609o0.mo8135g(obj, c34605m0).f145693c;
        C34607n0 c34607n0 = this.f11264K;
        abstractC34609o0.m109407n(i13, c34607n0);
        if (c34607n0.f145706f != -9223372036854775807L && c34607n0.m109401a() && c34607n0.f145709i) {
            return AbstractC38065t.m121896J(AbstractC38065t.m121929v(c34607n0.f145707g) - c34607n0.f145706f) - (j7 + c34605m0.f145695e);
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m8217k0() {
        C2822c1 c2822c1 = this.f11281b0;
        return c2822c1.f11056l && c2822c1.f11058n == 0;
    }

    /* JADX INFO: renamed from: l */
    public final long m8218l(C2860q0 c2860q0) {
        if (c2860q0 == null) {
            return 0L;
        }
        long jMax = c2860q0.f11368p;
        if (!c2860q0.f11357e) {
            return jMax;
        }
        int i13 = 0;
        while (true) {
            C2843j1[] c2843j1Arr = this.f11302w;
            if (i13 >= c2843j1Arr.length) {
                return jMax;
            }
            if (c2843j1Arr[i13].m8148d(c2860q0) != null) {
                AbstractC2829f abstractC2829fM8148d = c2843j1Arr[i13].m8148d(c2860q0);
                Objects.requireNonNull(abstractC2829fM8148d);
                long j7 = abstractC2829fM8148d.f11089M;
                if (j7 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jMax = Math.max(j7, jMax);
            }
            i13++;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m8219l0(AbstractC34609o0 abstractC34609o0, C23488c0 c23488c0) {
        if (c23488c0.m68054b() || abstractC34609o0.m109408p()) {
            return false;
        }
        int i13 = abstractC34609o0.mo8135g(c23488c0.f92976a, this.f11265L).f145693c;
        C34607n0 c34607n0 = this.f11264K;
        abstractC34609o0.m109407n(i13, c34607n0);
        return c34607n0.m109401a() && c34607n0.f145709i && c34607n0.f145706f != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: m */
    public final Pair m8220m(AbstractC34609o0 abstractC34609o0) {
        long j7 = 0;
        if (abstractC34609o0.m109408p()) {
            return Pair.create(C2822c1.f11044u, 0L);
        }
        int iMo8131a = abstractC34609o0.mo8131a(this.f11290k0);
        Pair pairM109405i = abstractC34609o0.m109405i(this.f11264K, this.f11265L, iMo8131a, -9223372036854775807L);
        C23488c0 c23488c0M8280p = this.f11271R.m8280p(abstractC34609o0, pairM109405i.first, 0L);
        long jLongValue = ((Long) pairM109405i.second).longValue();
        if (c23488c0M8280p.m68054b()) {
            Object obj = c23488c0M8280p.f92976a;
            C34605m0 c34605m0 = this.f11265L;
            abstractC34609o0.mo8135g(obj, c34605m0);
            if (c23488c0M8280p.f92978c == c34605m0.m109396e(c23488c0M8280p.f92977b)) {
                c34605m0.f145697g.getClass();
            }
        } else {
            j7 = jLongValue;
        }
        return Pair.create(c23488c0M8280p, Long.valueOf(j7));
    }

    /* JADX INFO: renamed from: m0 */
    public final void m8221m0() {
        C2860q0 c2860q0 = this.f11271R.f11392i;
        if (c2860q0 == null) {
            return;
        }
        C27682v c27682v = c2860q0.f11367o;
        int i13 = 0;
        while (true) {
            C2843j1[] c2843j1Arr = this.f11302w;
            if (i13 >= c2843j1Arr.length) {
                return;
            }
            if (c27682v.m83678b(i13)) {
                c2843j1Arr[i13].m8156n();
            }
            i13++;
        }
    }

    /* JADX INFO: renamed from: n */
    public final long m8222n(long j7) {
        C2860q0 c2860q0 = this.f11271R.f11395l;
        if (c2860q0 == null) {
            return 0L;
        }
        return Math.max(0L, j7 - (this.f11296q0 - c2860q0.f11368p));
    }

    /* JADX INFO: renamed from: n0 */
    public final void m8223n0(boolean z4, boolean z13) {
        m8183L(z4 || !this.f11291l0, false, true, false);
        this.f11282c0.m1758c(z13 ? 1 : 0);
        C2844k c2844k = this.f11259F;
        if (c2844k.f11242h.remove(this.f11275V) != null) {
            c2844k.m8160d();
        }
        this.f11279Z.m8054d(1, this.f11281b0.f11056l);
        m8211h0(1);
    }

    /* JADX INFO: renamed from: o */
    public final void m8224o(int i13) {
        C2822c1 c2822c1 = this.f11281b0;
        m8233s0(i13, c2822c1.f11058n, c2822c1.f11057m, c2822c1.f11056l);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m8225o0() {
        C2847l c2847l = this.f11267N;
        c2847l.f11255y = false;
        C2849l1 c2849l1 = (C2849l1) c2847l.f11256z;
        if (c2849l1.f11315z) {
            c2849l1.m8244a(c2849l1.mo8165c());
            c2849l1.f11315z = false;
        }
        for (C2843j1 c2843j1 : this.f11302w) {
            AbstractC2829f abstractC2829f = (AbstractC2829f) c2843j1.f11234f;
            AbstractC2829f abstractC2829f2 = (AbstractC2829f) c2843j1.f11233e;
            if (C2843j1.m8144h(abstractC2829f2)) {
                C2843j1.m8143b(abstractC2829f2);
            }
            if (abstractC2829f != null && abstractC2829f.f11084H != 0) {
                C2843j1.m8143b(abstractC2829f);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m8226p() {
        m8215j0(this.f11309z0);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, l9.b1] */
    /* JADX INFO: renamed from: p0 */
    public final void m8227p0() {
        C2860q0 c2860q0 = this.f11271R.f11395l;
        boolean z4 = this.f11288i0 || (c2860q0 != null && c2860q0.f11353a.mo36121a());
        C2822c1 c2822c1 = this.f11281b0;
        if (z4 != c2822c1.f11051g) {
            this.f11281b0 = c2822c1.m8037b(z4);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m8228q(InterfaceC23482a0 interfaceC23482a0) {
        C2864s0 c2864s0 = this.f11271R;
        C2860q0 c2860q0 = c2864s0.f11395l;
        if (c2860q0 != null && c2860q0.f11353a == interfaceC23482a0) {
            c2864s0.m8278m(this.f11296q0);
            m8243z();
            return;
        }
        C2860q0 c2860q1 = c2864s0.f11396m;
        if (c2860q1 == null || c2860q1.f11353a != interfaceC23482a0) {
            return;
        }
        m8172A();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: q0 */
    public final void m8229q0(C27682v c27682v) {
        C2860q0 c2860q0 = this.f11271R.f11395l;
        c2860q0.getClass();
        m8222n(c2860q0.m8255d());
        if (m8219l0(this.f11281b0.f11045a, c2860q0.f11359g.f11371a)) {
            long j7 = this.f11273T.f11207i;
        }
        AbstractC34609o0 abstractC34609o0 = this.f11281b0.f11045a;
        float f13 = this.f11267N.mo8164b().f145648a;
        boolean z4 = this.f11281b0.f11056l;
        InterfaceC27679s[] interfaceC27679sArr = c27682v.f111439c;
        C2844k c2844k = this.f11259F;
        C2841j c2841j = (C2841j) c2844k.f11242h.get(this.f11275V);
        c2841j.getClass();
        int iMax = c2844k.f11240f;
        if (iMax == -1) {
            int length = interfaceC27679sArr.length;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int i15 = 13107200;
                if (i13 < length) {
                    InterfaceC27679s interfaceC27679s = interfaceC27679sArr[i13];
                    if (interfaceC27679s != null) {
                        switch (interfaceC27679s.mo68078j().f145798c) {
                            case -2:
                                i15 = 0;
                                i14 += i15;
                                break;
                            case -1:
                            case 1:
                                i14 += i15;
                                break;
                            case 0:
                                i15 = 144310272;
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
        c2841j.f11222b = iMax;
        c2844k.m8160d();
    }

    /* JADX INFO: renamed from: r */
    public final void m8230r(IOException iOException, int i13) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i13);
        C2860q0 c2860q0 = this.f11271R.f11392i;
        if (c2860q0 != null) {
            exoPlaybackException = exoPlaybackException.m5054a(c2860q0.f11359g.f11371a);
        }
        AbstractC38046a.m121813h("ExoPlayerImplInternal", "Playback error", exoPlaybackException);
        m8223n0(false, false);
        this.f11281b0 = this.f11281b0.m8041f(exoPlaybackException);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m8231r0(int i13, int i14, List list) throws Throwable {
        this.f11282c0.m1758c(1);
        C2819b1 c2819b1 = this.f11272S;
        c2819b1.getClass();
        ArrayList arrayList = c2819b1.f11029b;
        AbstractC35849g.m113802d(i13 >= 0 && i13 <= i14 && i14 <= arrayList.size());
        AbstractC35849g.m113802d(list.size() == i14 - i13);
        for (int i15 = i13; i15 < i14; i15++) {
            ((C2816a1) arrayList.get(i15)).f11015a.mo36150r((C34626x) list.get(i15 - i13));
        }
        m8234t(c2819b1.m8026d(), false);
    }

    /* JADX INFO: renamed from: s */
    public final void m8232s(boolean z4) {
        C2860q0 c2860q0 = this.f11271R.f11395l;
        C23488c0 c23488c0 = c2860q0 == null ? this.f11281b0.f11046b : c2860q0.f11359g.f11371a;
        boolean zEquals = this.f11281b0.f11055k.equals(c23488c0);
        if (!zEquals) {
            this.f11281b0 = this.f11281b0.m8038c(c23488c0);
        }
        C2822c1 c2822c1 = this.f11281b0;
        c2822c1.f11061q = c2860q0 == null ? c2822c1.f11063s : c2860q0.m8255d();
        C2822c1 c2822c2 = this.f11281b0;
        c2822c2.f11062r = m8222n(c2822c2.f11061q);
        if ((!zEquals || z4) && c2860q0 != null && c2860q0.f11357e) {
            m8229q0(c2860q0.f11367o);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m8233s0(int i13, int i14, int i15, boolean z4) {
        boolean z13 = z4 && i13 != -1;
        if (i13 == -1) {
            i15 = 2;
        } else if (i15 == 2) {
            i15 = 1;
        }
        if (i13 == 0) {
            i14 = 1;
        } else if (i14 == 1) {
            i14 = 0;
        }
        C2822c1 c2822c1 = this.f11281b0;
        if (c2822c1.f11056l == z13 && c2822c1.f11058n == i14 && c2822c1.f11057m == i15) {
            return;
        }
        this.f11281b0 = c2822c1.m8040e(i15, i14, z13);
        m8239v0(false, false);
        C2864s0 c2864s0 = this.f11271R;
        for (C2860q0 c2860q0 = c2864s0.f11392i; c2860q0 != null; c2860q0 = c2860q0.f11365m) {
            for (InterfaceC27679s interfaceC27679s : c2860q0.f11367o.f111439c) {
                if (interfaceC27679s != null) {
                    interfaceC27679s.mo68079k(z13);
                }
            }
        }
        if (!m8217k0()) {
            m8225o0();
            m8235t0();
            c2864s0.m8278m(this.f11296q0);
            return;
        }
        int i16 = this.f11281b0.f11049e;
        C38063r c38063r = this.f11261H;
        if (i16 != 3) {
            if (i16 == 2) {
                c38063r.m121881e(2);
            }
        } else {
            C2847l c2847l = this.f11267N;
            c2847l.f11255y = true;
            ((C2849l1) c2847l.f11256z).m8245g();
            m8221m0();
            c38063r.m121881e(2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:202:0x0374  */
    /* JADX WARN: Code duplicated, block: B:203:0x0377  */
    /* JADX WARN: Code duplicated, block: B:208:0x038c  */
    /* JADX WARN: Code duplicated, block: B:210:0x0396 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:216:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:219:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:221:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:225:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:230:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:231:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:234:0x0403  */
    /* JADX WARN: Code duplicated, block: B:236:0x040b  */
    /* JADX WARN: Code duplicated, block: B:238:0x0415 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:244:0x042a  */
    /* JADX WARN: Code duplicated, block: B:247:0x0436  */
    /* JADX WARN: Code duplicated, block: B:249:0x043b  */
    /* JADX WARN: Code duplicated, block: B:253:0x045c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [u8.o0] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v42 */
    /* JADX WARN: Type inference failed for: r2v24, types: [u8.o0] */
    /* JADX WARN: Type inference failed for: r2v29, types: [b9.c1] */
    /* JADX WARN: Type inference failed for: r2v51, types: [b9.s0] */
    /* JADX WARN: Type inference failed for: r38v0, types: [b9.l0] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v34, types: [u8.o0] */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v44 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v14 */
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
    /* JADX INFO: renamed from: t */
    public final void m8234t(AbstractC34609o0 abstractC34609o0, boolean z4) throws Throwable {
        C34607n0 c34607n0;
        Object obj;
        int iMo8131a;
        int i13;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i14;
        C34605m0 c34605m0;
        AbstractC34609o0 abstractC34609o1;
        long j7;
        long j13;
        C2842j0 c2842j0;
        int i15;
        long jLongValue;
        boolean z17;
        int i16;
        boolean z18;
        boolean z19;
        long j14;
        int iMo8131a2;
        boolean z24;
        ?? r14;
        C23488c0 c23488c0;
        long jM8190U;
        ?? r15;
        boolean z25;
        long j15;
        C23488c0 c23488c1;
        Object obj2;
        ?? r10;
        int i17;
        boolean z26;
        int i18;
        char c3;
        char c7;
        boolean z27;
        boolean z28;
        char c14;
        ?? r16;
        AbstractC34609o0 abstractC34609o2;
        int i19;
        C2860q0 c2860q0;
        boolean z29;
        boolean z34;
        long j16;
        C23488c0 c23488c2;
        Object obj3;
        boolean z35;
        int i24;
        C2822c1 c2822c1 = this.f11281b0;
        C2845k0 c2845k0 = this.f11295p0;
        C2864s0 c2864s0 = this.f11271R;
        int i25 = this.f11289j0;
        boolean z36 = this.f11290k0;
        C34607n0 c34607n1 = this.f11264K;
        C34605m0 c34605m1 = this.f11265L;
        if (abstractC34609o0.m109408p()) {
            jM8190U = 0;
            z27 = false;
            abstractC34609o1 = abstractC34609o0;
            c2842j0 = new C2842j0(C2822c1.f11044u, 0L, -9223372036854775807L, false, true, false);
        } else {
            C23488c0 c23488c3 = c2822c1.f11046b;
            Object obj4 = c23488c3.f92976a;
            AbstractC34609o0 abstractC34609o3 = c2822c1.f11045a;
            boolean z37 = abstractC34609o3.m109408p() || abstractC34609o3.mo8135g(c23488c3.f92976a, c34605m1).f145696f;
            long jLongValue2 = (c2822c1.f11046b.m68054b() || z37) ? c2822c1.f11047c : c2822c1.f11063s;
            if (c2845k0 != null) {
                Pair pairM8169P = m8169P(abstractC34609o0, c2845k0, true, i25, z36, c34607n1, c34605m1);
                if (pairM8169P == null) {
                    iMo8131a2 = abstractC34609o0.mo8131a(z36);
                    j14 = jLongValue2;
                    obj = obj4;
                    z19 = false;
                    z24 = true;
                    z18 = false;
                } else {
                    if (c2845k0.f11246c == -9223372036854775807L) {
                        jLongValue = jLongValue2;
                        obj = obj4;
                        z17 = false;
                        i16 = abstractC34609o0.mo8135g(pairM8169P.first, c34605m1).f145693c;
                    } else {
                        obj = pairM8169P.first;
                        jLongValue = ((Long) pairM8169P.second).longValue();
                        z17 = true;
                        i16 = -1;
                    }
                    z18 = z17;
                    z19 = c2822c1.f11049e == 4;
                    j14 = jLongValue;
                    iMo8131a2 = i16;
                    z24 = false;
                }
                z13 = z19;
                z14 = z24;
                z15 = z18;
                iMo8131a = iMo8131a2;
                jLongValue2 = j14;
                c34607n0 = c34607n1;
                z37 = z37;
                i13 = -1;
            } else {
                if (c2822c1.f11045a.m109408p()) {
                    iMo8131a = abstractC34609o0.mo8131a(z36);
                    c34607n0 = c34607n1;
                    obj = obj4;
                } else if (abstractC34609o0.mo8132b(obj4) == -1) {
                    int iM8170Q = m8170Q(c34607n1, c34605m1, i25, z36, obj, c2822c1.f11045a, abstractC34609o0);
                    c34607n0 = c34607n1;
                    if (iM8170Q == -1) {
                        obj = obj4;
                        c34605m1 = c34605m1;
                        iM8170Q = abstractC34609o0.mo8131a(z36);
                        z16 = true;
                    } else {
                        obj = obj4;
                        c34605m1 = c34605m1;
                        z16 = false;
                    }
                    iMo8131a = iM8170Q;
                    z14 = z16;
                    jLongValue2 = jLongValue2;
                    z37 = z37;
                    i13 = -1;
                    z13 = false;
                    z15 = false;
                } else {
                    c34607n0 = c34607n1;
                    if (jLongValue2 == -9223372036854775807L) {
                        obj = obj4;
                        iMo8131a = abstractC34609o0.mo8135g(obj, c34605m1).f145693c;
                    } else if (z37) {
                        c2822c1.f11045a.mo8135g(c23488c3.f92976a, c34605m1);
                        z37 = z37;
                        if (c2822c1.f11045a.mo8129m(c34605m1.f145693c, c34607n0, 0L).f145714n == c2822c1.f11045a.mo8132b(c23488c3.f92976a)) {
                            Pair pairM109405i = abstractC34609o0.m109405i(c34607n0, c34605m1, abstractC34609o0.mo8135g(obj, c34605m1).f145693c, c34605m1.f145695e + jLongValue2);
                            obj = pairM109405i.first;
                            jLongValue2 = ((Long) pairM109405i.second).longValue();
                        } else {
                            jLongValue2 = jLongValue2;
                        }
                        iMo8131a = -1;
                        i13 = -1;
                        z13 = false;
                        z14 = false;
                        z15 = true;
                    } else {
                        z37 = z37;
                        jLongValue2 = jLongValue2;
                        iMo8131a = -1;
                        i13 = -1;
                        z13 = false;
                        z14 = false;
                        z15 = false;
                    }
                }
                i13 = -1;
                z13 = false;
                z14 = false;
                z15 = false;
            }
            if (iMo8131a != i13) {
                int i26 = iMo8131a;
                C34605m0 c34605m2 = c34605m1;
                i14 = i13;
                abstractC34609o1 = abstractC34609o0;
                Pair pairM109405i2 = abstractC34609o1.m109405i(c34607n0, c34605m2, i26, -9223372036854775807L);
                c34605m0 = c34605m2;
                obj = pairM109405i2.first;
                jLongValue2 = ((Long) pairM109405i2.second).longValue();
                j7 = -9223372036854775807L;
            } else {
                C34605m0 c34605m3 = c34605m1;
                i14 = i13;
                c34605m0 = c34605m3;
                abstractC34609o1 = abstractC34609o0;
                j7 = jLongValue2;
            }
            C23488c0 c23488c0M8280p = c2864s0.m8280p(abstractC34609o1, obj, jLongValue2);
            int i27 = c23488c0M8280p.f92980e;
            boolean z38 = c23488c3.f92976a.equals(obj) && !c23488c3.m68054b() && !c23488c0M8280p.m68054b() && (i27 == i14 || ((i15 = c23488c3.f92980e) != i14 && i27 >= i15));
            C34605m0 c34605m0Mo8135g = abstractC34609o1.mo8135g(obj, c34605m0);
            if (!z37 && jLongValue2 == j7) {
                Object obj5 = c23488c3.f92976a;
                int i28 = c23488c3.f92977b;
                if (obj5.equals(c23488c0M8280p.f92976a)) {
                    if (c23488c3.m68054b()) {
                        c34605m0Mo8135g.m109398g(i28);
                    }
                    if (c23488c0M8280p.m68054b()) {
                        c34605m0Mo8135g.m109398g(c23488c0M8280p.f92977b);
                    }
                }
            }
            if (z38) {
                c23488c0M8280p = c23488c3;
            }
            if (!c23488c0M8280p.m68054b()) {
                j13 = jLongValue2;
            } else if (c23488c0M8280p.equals(c23488c3)) {
                jLongValue2 = c2822c1.f11063s;
                j13 = jLongValue2;
            } else {
                abstractC34609o1.mo8135g(c23488c0M8280p.f92976a, c34605m0);
                if (c23488c0M8280p.f92978c == c34605m0.m109396e(c23488c0M8280p.f92977b)) {
                    c34605m0.f145697g.getClass();
                }
                j13 = 0;
            }
            c2842j0 = new C2842j0(c23488c0M8280p, j13, j7, z13, z14, z15);
        }
        C23488c0 c23488c4 = (C23488c0) c2842j0.f11228f;
        long j17 = c2842j0.f11224b;
        boolean z39 = c2842j0.f11225c;
        long j18 = c2842j0.f11223a;
        boolean z44 = (this.f11281b0.f11046b.equals(c23488c4) && j18 == this.f11281b0.f11063s) ? false : true;
        try {
            if (c2842j0.f11226d) {
                try {
                    z26 = true;
                    z26 = true;
                    if (this.f11281b0.f11049e != 1) {
                        c3 = 4;
                        try {
                            m8211h0(4);
                        } catch (Throwable th3) {
                            th = th3;
                            r14 = abstractC34609o1;
                            c23488c0 = c23488c4;
                            jM8190U = j18;
                            z25 = true;
                            r15 = 0;
                        }
                    } else {
                        c3 = 4;
                    }
                    i18 = 0;
                    try {
                        m8183L(false, false, false, true);
                        c7 = c3;
                    } catch (Throwable th4) {
                        th = th4;
                        r14 = abstractC34609o1;
                        c23488c0 = c23488c4;
                        jM8190U = j18;
                        z25 = z26;
                        r15 = i18;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    z26 = true;
                    i18 = 0;
                    r14 = abstractC34609o1;
                    c23488c0 = c23488c4;
                    jM8190U = j18;
                    z25 = z26;
                    r15 = i18;
                }
            } else {
                z26 = true;
                i18 = 0;
                c7 = 4;
            }
            C2843j1[] c2843j1Arr = this.f11302w;
            int length = c2843j1Arr.length;
            int i29 = i18;
            ?? r17 = z26;
            char c15 = c7;
            while (i29 < length) {
                C2843j1 c2843j1 = c2843j1Arr[i29];
                AbstractC2829f abstractC2829f = (AbstractC2829f) c2843j1.f11233e;
                if (!Objects.equals(abstractC2829f.f11092P, abstractC34609o1)) {
                    abstractC2829f.f11092P = abstractC34609o1;
                }
                AbstractC2829f abstractC2829f2 = (AbstractC2829f) c2843j1.f11234f;
                if (abstractC2829f2 != null && !Objects.equals(abstractC2829f2.f11092P, abstractC34609o1)) {
                    abstractC2829f2.f11092P = abstractC34609o1;
                }
                i29++;
                r17 = 1;
                c15 = 4;
            }
            try {
                if (z44) {
                    r17 = abstractC34609o1;
                    jM8190U = j18;
                    z34 = false;
                    z34 = false;
                    c14 = 0;
                    c15 = 0;
                    i19 = 2;
                    z29 = true;
                    z29 = true;
                    z28 = true;
                    z27 = true;
                    if (r17.m109408p()) {
                        c23488c0 = c23488c4;
                    } else {
                        for (C2860q0 c2860q1 = this.f11271R.f11392i; c2860q1 != null; c2860q1 = c2860q1.f11365m) {
                            if (c2860q1.f11359g.f11371a.equals(c23488c4)) {
                                c2860q1.f11359g = this.f11271R.m8273h(r17, c2860q1.f11359g);
                                c2860q1.m8262k();
                            }
                        }
                        try {
                            C2864s0 c2864s1 = this.f11271R;
                            c23488c0 = c23488c4;
                            try {
                                jM8190U = m8190U(c23488c0, jM8190U, c2864s1.f11392i != c2864s1.f11393j, z39);
                            } catch (Throwable th6) {
                                th = th6;
                                jM8190U = jM8190U;
                                r16 = r17;
                                r14 = r16;
                                r15 = c14;
                                z25 = z28;
                                C2822c1 c2822c2 = this.f11281b0;
                                AbstractC34609o0 abstractC34609o4 = c2822c2.f11045a;
                                C23488c0 c23488c5 = c2822c2.f11046b;
                                if (c2842j0.f11227e) {
                                    j15 = jM8190U;
                                } else {
                                    j15 = -9223372036854775807L;
                                }
                                c23488c1 = c23488c0;
                                m8237u0(r14, c23488c1, abstractC34609o4, c23488c5, j15, false);
                                if (z44) {
                                    C2822c1 c2822c3 = this.f11281b0;
                                    obj2 = c2822c3.f11046b.f92976a;
                                    AbstractC34609o0 abstractC34609o5 = c2822c3.f11045a;
                                    if (z44) {
                                        r10 = r15;
                                    } else {
                                        r10 = r15;
                                    }
                                    long j19 = this.f11281b0.f11048d;
                                    if (r14.mo8132b(obj2) == -1) {
                                        i17 = 4;
                                    } else {
                                        i17 = 3;
                                    }
                                    this.f11281b0 = m8240w(c23488c1, jM8190U, j17, j19, r10, i17);
                                } else {
                                    C2822c1 c2822c4 = this.f11281b0;
                                    obj2 = c2822c4.f11046b.f92976a;
                                    AbstractC34609o0 abstractC34609o6 = c2822c4.f11045a;
                                    if (z44) {
                                        r10 = r15;
                                    } else {
                                        r10 = r15;
                                    }
                                    long j110 = this.f11281b0.f11048d;
                                    if (r14.mo8132b(obj2) == -1) {
                                        i17 = 4;
                                    } else {
                                        i17 = 3;
                                    }
                                    this.f11281b0 = m8240w(c23488c1, jM8190U, j17, j110, r10, i17);
                                }
                                m8184M();
                                m8186O(r14, this.f11281b0.f11045a);
                                this.f11281b0 = this.f11281b0.m8044i(r14);
                                if (!r14.m109408p()) {
                                    this.f11295p0 = null;
                                }
                                m8232s(r15);
                                this.f11261H.m121881e(2);
                                throw th;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            c23488c0 = c23488c4;
                            r16 = r17;
                            c14 = c15;
                            z28 = z27;
                            r14 = r16;
                            r15 = c14;
                            z25 = z28;
                            C2822c1 c2822c5 = this.f11281b0;
                            AbstractC34609o0 abstractC34609o7 = c2822c5.f11045a;
                            C23488c0 c23488c6 = c2822c5.f11046b;
                            if (c2842j0.f11227e) {
                                j15 = jM8190U;
                            } else {
                                j15 = -9223372036854775807L;
                            }
                            c23488c1 = c23488c0;
                            m8237u0(r14, c23488c1, abstractC34609o7, c23488c6, j15, false);
                            if (z44) {
                                C2822c1 c2822c6 = this.f11281b0;
                                obj2 = c2822c6.f11046b.f92976a;
                                AbstractC34609o0 abstractC34609o8 = c2822c6.f11045a;
                                if (z44) {
                                    r10 = r15;
                                } else {
                                    r10 = r15;
                                }
                                long j111 = this.f11281b0.f11048d;
                                if (r14.mo8132b(obj2) == -1) {
                                    i17 = 4;
                                } else {
                                    i17 = 3;
                                }
                                this.f11281b0 = m8240w(c23488c1, jM8190U, j17, j111, r10, i17);
                            } else {
                                C2822c1 c2822c7 = this.f11281b0;
                                obj2 = c2822c7.f11046b.f92976a;
                                AbstractC34609o0 abstractC34609o9 = c2822c7.f11045a;
                                if (z44) {
                                    r10 = r15;
                                } else {
                                    r10 = r15;
                                }
                                long j112 = this.f11281b0.f11048d;
                                if (r14.mo8132b(obj2) == -1) {
                                    i17 = 4;
                                } else {
                                    i17 = 3;
                                }
                                this.f11281b0 = m8240w(c23488c1, jM8190U, j17, j112, r10, i17);
                            }
                            m8184M();
                            m8186O(r14, this.f11281b0.f11045a);
                            this.f11281b0 = this.f11281b0.m8044i(r14);
                            if (!r14.m109408p()) {
                                this.f11295p0 = null;
                            }
                            m8232s(r15);
                            this.f11261H.m121881e(2);
                            throw th;
                        }
                    }
                    C2822c1 c2822c8 = this.f11281b0;
                    AbstractC34609o0 abstractC34609o10 = c2822c8.f11045a;
                    C23488c0 c23488c7 = c2822c8.f11046b;
                    if (c2842j0.f11227e) {
                        j16 = jM8190U;
                    } else {
                        j16 = -9223372036854775807L;
                    }
                    c23488c2 = c23488c0;
                    m8237u0(abstractC34609o0, c23488c2, abstractC34609o10, c23488c7, j16, false);
                    if (z44) {
                        C2822c1 c2822c9 = this.f11281b0;
                        obj3 = c2822c9.f11046b.f92976a;
                        AbstractC34609o0 abstractC34609o11 = c2822c9.f11045a;
                        if (z44) {
                            z35 = z34;
                        } else {
                            z35 = z34;
                        }
                        long j24 = this.f11281b0.f11048d;
                        if (abstractC34609o0.mo8132b(obj3) == -1) {
                            i24 = 4;
                        } else {
                            i24 = 3;
                        }
                        this.f11281b0 = m8240w(c23488c2, jM8190U, j17, j24, z35, i24);
                    } else {
                        C2822c1 c2822c10 = this.f11281b0;
                        obj3 = c2822c10.f11046b.f92976a;
                        AbstractC34609o0 abstractC34609o12 = c2822c10.f11045a;
                        if (z44) {
                            z35 = z34;
                        } else {
                            z35 = z34;
                        }
                        long j25 = this.f11281b0.f11048d;
                        if (abstractC34609o0.mo8132b(obj3) == -1) {
                            i24 = 4;
                        } else {
                            i24 = 3;
                        }
                        this.f11281b0 = m8240w(c23488c2, jM8190U, j17, j25, z35, i24);
                    }
                    m8184M();
                    m8186O(abstractC34609o0, this.f11281b0.f11045a);
                    this.f11281b0 = this.f11281b0.m8044i(abstractC34609o0);
                    if (!abstractC34609o0.m109408p()) {
                        this.f11295p0 = null;
                    }
                    m8232s(z34);
                    this.f11261H.m121881e(i19);
                    return;
                }
                try {
                    C2860q0 c2860q2 = this.f11271R.f11393j;
                    try {
                        jM8190U = j18;
                        try {
                            c15 = 0;
                            z34 = false;
                            z34 = false;
                            z34 = false;
                            i19 = 2;
                            z27 = true;
                            z29 = true;
                            z29 = true;
                            z29 = true;
                            try {
                                int iM8283s = this.f11271R.m8283s(abstractC34609o0, this.f11296q0, c2860q2 == null ? 0L : m8218l(c2860q2), (!m8202d() || (c2860q0 = this.f11271R.f11394k) == null) ? 0L : m8218l(c2860q0));
                                if ((iM8283s & 1) != 0) {
                                    m8188S(false);
                                } else if ((iM8283s & 2) != 0) {
                                    m8206f();
                                }
                                c23488c0 = c23488c4;
                                C2822c1 c2822c11 = this.f11281b0;
                                AbstractC34609o0 abstractC34609o13 = c2822c11.f11045a;
                                C23488c0 c23488c8 = c2822c11.f11046b;
                                if (c2842j0.f11227e) {
                                    j16 = jM8190U;
                                } else {
                                    j16 = -9223372036854775807L;
                                }
                                c23488c2 = c23488c0;
                                m8237u0(abstractC34609o0, c23488c2, abstractC34609o13, c23488c8, j16, false);
                                if (z44 || j17 != this.f11281b0.f11047c) {
                                    C2822c1 c2822c12 = this.f11281b0;
                                    obj3 = c2822c12.f11046b.f92976a;
                                    AbstractC34609o0 abstractC34609o14 = c2822c12.f11045a;
                                    if (z44 || !z4 || abstractC34609o14.m109408p() || abstractC34609o14.mo8135g(obj3, this.f11265L).f145696f) {
                                        z35 = z34;
                                    } else {
                                        z35 = z29;
                                    }
                                    long j26 = this.f11281b0.f11048d;
                                    if (abstractC34609o0.mo8132b(obj3) == -1) {
                                        i24 = 4;
                                    } else {
                                        i24 = 3;
                                    }
                                    this.f11281b0 = m8240w(c23488c2, jM8190U, j17, j26, z35, i24);
                                }
                                m8184M();
                                m8186O(abstractC34609o0, this.f11281b0.f11045a);
                                this.f11281b0 = this.f11281b0.m8044i(abstractC34609o0);
                                if (!abstractC34609o0.m109408p()) {
                                    this.f11295p0 = null;
                                }
                                m8232s(z34);
                                this.f11261H.m121881e(i19);
                                return;
                            } catch (Throwable th8) {
                                th = th8;
                                r17 = abstractC34609o0;
                                c23488c0 = c23488c4;
                                r16 = r17;
                                c14 = c15;
                                z28 = z27;
                                r14 = r16;
                                r15 = c14;
                                z25 = z28;
                                C2822c1 c2822c13 = this.f11281b0;
                                AbstractC34609o0 abstractC34609o15 = c2822c13.f11045a;
                                C23488c0 c23488c9 = c2822c13.f11046b;
                                if (c2842j0.f11227e) {
                                    j15 = jM8190U;
                                } else {
                                    j15 = -9223372036854775807L;
                                }
                                c23488c1 = c23488c0;
                                m8237u0(r14, c23488c1, abstractC34609o15, c23488c9, j15, false);
                                if (z44) {
                                    C2822c1 c2822c14 = this.f11281b0;
                                    obj2 = c2822c14.f11046b.f92976a;
                                    AbstractC34609o0 abstractC34609o16 = c2822c14.f11045a;
                                    if (z44) {
                                        r10 = r15;
                                    } else {
                                        r10 = r15;
                                    }
                                    long j113 = this.f11281b0.f11048d;
                                    if (r14.mo8132b(obj2) == -1) {
                                        i17 = 4;
                                    } else {
                                        i17 = 3;
                                    }
                                    this.f11281b0 = m8240w(c23488c1, jM8190U, j17, j113, r10, i17);
                                } else {
                                    C2822c1 c2822c15 = this.f11281b0;
                                    obj2 = c2822c15.f11046b.f92976a;
                                    AbstractC34609o0 abstractC34609o17 = c2822c15.f11045a;
                                    if (z44) {
                                        r10 = r15;
                                    } else {
                                        r10 = r15;
                                    }
                                    long j114 = this.f11281b0.f11048d;
                                    if (r14.mo8132b(obj2) == -1) {
                                        i17 = 4;
                                    } else {
                                        i17 = 3;
                                    }
                                    this.f11281b0 = m8240w(c23488c1, jM8190U, j17, j114, r10, i17);
                                }
                                m8184M();
                                m8186O(r14, this.f11281b0.f11045a);
                                this.f11281b0 = this.f11281b0.m8044i(r14);
                                if (!r14.m109408p()) {
                                    this.f11295p0 = null;
                                }
                                m8232s(r15);
                                this.f11261H.m121881e(2);
                                throw th;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            r17 = abstractC34609o0;
                            c15 = 0;
                            z27 = true;
                            c23488c0 = c23488c4;
                            r16 = r17;
                            c14 = c15;
                            z28 = z27;
                            r14 = r16;
                            r15 = c14;
                            z25 = z28;
                            C2822c1 c2822c16 = this.f11281b0;
                            AbstractC34609o0 abstractC34609o18 = c2822c16.f11045a;
                            C23488c0 c23488c10 = c2822c16.f11046b;
                            if (c2842j0.f11227e) {
                                j15 = jM8190U;
                            } else {
                                j15 = -9223372036854775807L;
                            }
                            c23488c1 = c23488c0;
                            m8237u0(r14, c23488c1, abstractC34609o18, c23488c10, j15, false);
                            if (z44) {
                                C2822c1 c2822c17 = this.f11281b0;
                                obj2 = c2822c17.f11046b.f92976a;
                                AbstractC34609o0 abstractC34609o19 = c2822c17.f11045a;
                                if (z44) {
                                    r10 = r15;
                                } else {
                                    r10 = r15;
                                }
                                long j115 = this.f11281b0.f11048d;
                                if (r14.mo8132b(obj2) == -1) {
                                    i17 = 4;
                                } else {
                                    i17 = 3;
                                }
                                this.f11281b0 = m8240w(c23488c1, jM8190U, j17, j115, r10, i17);
                            } else {
                                C2822c1 c2822c18 = this.f11281b0;
                                obj2 = c2822c18.f11046b.f92976a;
                                AbstractC34609o0 abstractC34609o110 = c2822c18.f11045a;
                                if (z44) {
                                    r10 = r15;
                                } else {
                                    r10 = r15;
                                }
                                long j116 = this.f11281b0.f11048d;
                                if (r14.mo8132b(obj2) == -1) {
                                    i17 = 4;
                                } else {
                                    i17 = 3;
                                }
                                this.f11281b0 = m8240w(c23488c1, jM8190U, j17, j116, r10, i17);
                            }
                            m8184M();
                            m8186O(r14, this.f11281b0.f11045a);
                            this.f11281b0 = this.f11281b0.m8044i(r14);
                            if (!r14.m109408p()) {
                                this.f11295p0 = null;
                            }
                            m8232s(r15);
                            this.f11261H.m121881e(2);
                            throw th;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        abstractC34609o2 = abstractC34609o0;
                        jM8190U = j18;
                        r17 = abstractC34609o2;
                        c15 = 0;
                        z27 = true;
                        c23488c0 = c23488c4;
                        r16 = r17;
                        c14 = c15;
                        z28 = z27;
                        r14 = r16;
                        r15 = c14;
                        z25 = z28;
                        C2822c1 c2822c19 = this.f11281b0;
                        AbstractC34609o0 abstractC34609o111 = c2822c19.f11045a;
                        C23488c0 c23488c11 = c2822c19.f11046b;
                        if (c2842j0.f11227e) {
                            j15 = jM8190U;
                        } else {
                            j15 = -9223372036854775807L;
                        }
                        c23488c1 = c23488c0;
                        m8237u0(r14, c23488c1, abstractC34609o111, c23488c11, j15, false);
                        if (z44) {
                            C2822c1 c2822c110 = this.f11281b0;
                            obj2 = c2822c110.f11046b.f92976a;
                            AbstractC34609o0 abstractC34609o112 = c2822c110.f11045a;
                            if (z44) {
                                r10 = r15;
                            } else {
                                r10 = r15;
                            }
                            long j117 = this.f11281b0.f11048d;
                            if (r14.mo8132b(obj2) == -1) {
                                i17 = 4;
                            } else {
                                i17 = 3;
                            }
                            this.f11281b0 = m8240w(c23488c1, jM8190U, j17, j117, r10, i17);
                        } else {
                            C2822c1 c2822c111 = this.f11281b0;
                            obj2 = c2822c111.f11046b.f92976a;
                            AbstractC34609o0 abstractC34609o113 = c2822c111.f11045a;
                            if (z44) {
                                r10 = r15;
                            } else {
                                r10 = r15;
                            }
                            long j118 = this.f11281b0.f11048d;
                            if (r14.mo8132b(obj2) == -1) {
                                i17 = 4;
                            } else {
                                i17 = 3;
                            }
                            this.f11281b0 = m8240w(c23488c1, jM8190U, j17, j118, r10, i17);
                        }
                        m8184M();
                        m8186O(r14, this.f11281b0.f11045a);
                        this.f11281b0 = this.f11281b0.m8044i(r14);
                        if (!r14.m109408p()) {
                            this.f11295p0 = null;
                        }
                        m8232s(r15);
                        this.f11261H.m121881e(2);
                        throw th;
                    }
                } catch (Throwable th11) {
                    th = th11;
                    abstractC34609o2 = abstractC34609o1;
                }
            } catch (Throwable th12) {
                th = th12;
            }
        } catch (Throwable th13) {
            th = th13;
            r14 = abstractC34609o1;
            c23488c0 = c23488c4;
            jM8190U = j18;
            r15 = 0;
            z25 = true;
        }
        C2822c1 c2822c112 = this.f11281b0;
        AbstractC34609o0 abstractC34609o114 = c2822c112.f11045a;
        C23488c0 c23488c12 = c2822c112.f11046b;
        if (c2842j0.f11227e) {
            j15 = jM8190U;
        } else {
            j15 = -9223372036854775807L;
        }
        c23488c1 = c23488c0;
        m8237u0(r14, c23488c1, abstractC34609o114, c23488c12, j15, false);
        if (z44 || j17 != this.f11281b0.f11047c) {
            C2822c1 c2822c113 = this.f11281b0;
            obj2 = c2822c113.f11046b.f92976a;
            AbstractC34609o0 abstractC34609o115 = c2822c113.f11045a;
            if (z44 || !z4 || abstractC34609o115.m109408p() || abstractC34609o115.mo8135g(obj2, this.f11265L).f145696f) {
                r10 = r15;
            } else {
                r10 = z25;
            }
            long j119 = this.f11281b0.f11048d;
            if (r14.mo8132b(obj2) == -1) {
                i17 = 4;
            } else {
                i17 = 3;
            }
            this.f11281b0 = m8240w(c23488c1, jM8190U, j17, j119, r10, i17);
        }
        m8184M();
        m8186O(r14, this.f11281b0.f11045a);
        this.f11281b0 = this.f11281b0.m8044i(r14);
        if (!r14.m109408p()) {
            this.f11295p0 = null;
        }
        m8232s(r15);
        this.f11261H.m121881e(2);
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ce  */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, l9.a0] */
    /* JADX INFO: renamed from: t0 */
    public final void m8235t0() {
        C34589e0 c34589e0Mo8164b;
        long j7;
        float f13;
        C2860q0 c2860q0 = this.f11271R.f11392i;
        if (c2860q0 == null) {
            return;
        }
        long jMo36124f = c2860q0.f11357e ? c2860q0.f11353a.mo36124f() : -9223372036854775807L;
        if (jMo36124f != -9223372036854775807L) {
            if (!c2860q0.m8258g()) {
                this.f11271R.m8279n(c2860q0);
                m8232s(false);
                m8243z();
            }
            m8185N(jMo36124f);
            if (jMo36124f != this.f11281b0.f11063s) {
                C2822c1 c2822c1 = this.f11281b0;
                this.f11281b0 = m8240w(c2822c1.f11046b, jMo36124f, c2822c1.f11047c, jMo36124f, true, 5);
            }
        } else {
            C2847l c2847l = this.f11267N;
            boolean z4 = c2860q0 != this.f11271R.f11393j;
            C2849l1 c2849l1 = (C2849l1) c2847l.f11256z;
            AbstractC2829f abstractC2829f = (AbstractC2829f) c2847l.f11251F;
            if (abstractC2829f == null || abstractC2829f.mo8064l() || ((z4 && ((AbstractC2829f) c2847l.f11251F).f11084H != 2) || (!((AbstractC2829f) c2847l.f11251F).mo8065n() && (z4 || ((AbstractC2829f) c2847l.f11251F).m8063k())))) {
                c2847l.f11254x = true;
                if (c2847l.f11255y) {
                    c2849l1.m8245g();
                }
            } else {
                InterfaceC2858p0 interfaceC2858p0 = (InterfaceC2858p0) c2847l.f11252G;
                interfaceC2858p0.getClass();
                long jMo8165c = interfaceC2858p0.mo8165c();
                if (!c2847l.f11254x) {
                    c2849l1.m8244a(jMo8165c);
                    c34589e0Mo8164b = interfaceC2858p0.mo8164b();
                    if (!c34589e0Mo8164b.equals((C34589e0) c2849l1.f11311F)) {
                        c2849l1.mo8166d(c34589e0Mo8164b);
                        ((C2848l0) c2847l.f11250E).f11261H.m121878a(16, c34589e0Mo8164b).m121876b();
                    }
                } else if (jMo8165c >= c2849l1.mo8165c()) {
                    c2847l.f11254x = false;
                    if (c2847l.f11255y) {
                        c2849l1.m8245g();
                    }
                    c2849l1.m8244a(jMo8165c);
                    c34589e0Mo8164b = interfaceC2858p0.mo8164b();
                    if (!c34589e0Mo8164b.equals((C34589e0) c2849l1.f11311F)) {
                        c2849l1.mo8166d(c34589e0Mo8164b);
                        ((C2848l0) c2847l.f11250E).f11261H.m121878a(16, c34589e0Mo8164b).m121876b();
                    }
                } else if (c2849l1.f11315z) {
                    c2849l1.m8244a(c2849l1.mo8165c());
                    c2849l1.f11315z = false;
                }
            }
            long jMo8165c2 = c2847l.mo8165c();
            this.f11296q0 = jMo8165c2;
            long j13 = jMo8165c2 - c2860q0.f11368p;
            long j14 = this.f11281b0.f11063s;
            if (!this.f11268O.isEmpty() && !this.f11281b0.f11046b.m68054b()) {
                if (this.f11299t0) {
                    this.f11299t0 = false;
                }
                C2822c1 c2822c2 = this.f11281b0;
                c2822c2.f11045a.mo8132b(c2822c2.f11046b.f92976a);
                int iMin = Math.min(this.f11298s0, this.f11268O.size());
                if (iMin > 0 && this.f11268O.get(iMin - 1) != null) {
                    throw new ClassCastException();
                }
                if (iMin < this.f11268O.size() && this.f11268O.get(iMin) != null) {
                    throw new ClassCastException();
                }
                this.f11298s0 = iMin;
            }
            if (this.f11267N.mo8167e()) {
                boolean z13 = !this.f11282c0.f2665d;
                C2822c1 c2822c3 = this.f11281b0;
                this.f11281b0 = m8240w(c2822c3.f11046b, j13, c2822c3.f11047c, j13, z13, 6);
            } else {
                C2822c1 c2822c4 = this.f11281b0;
                c2822c4.f11063s = j13;
                c2822c4.f11064t = SystemClock.elapsedRealtime();
            }
        }
        this.f11281b0.f11061q = this.f11271R.f11395l.m8255d();
        C2822c1 c2822c5 = this.f11281b0;
        c2822c5.f11062r = m8222n(c2822c5.f11061q);
        C2822c1 c2822c6 = this.f11281b0;
        if (c2822c6.f11056l && c2822c6.f11049e == 3 && m8219l0(c2822c6.f11045a, c2822c6.f11046b)) {
            C2822c1 c2822c7 = this.f11281b0;
            float f14 = 1.0f;
            if (c2822c7.f11059o.f145648a == 1.0f) {
                C2838i c2838i = this.f11273T;
                long jM8216k = m8216k(c2822c7.f11045a, c2822c7.f11046b.f92976a, c2822c7.f11063s);
                long j15 = this.f11281b0.f11062r;
                if (c2838i.f11202d != -9223372036854775807L) {
                    long j16 = jM8216k - j15;
                    long j17 = c2838i.f11212n;
                    if (j17 == -9223372036854775807L) {
                        c2838i.f11212n = j16;
                        c2838i.f11213o = 0L;
                    } else {
                        long jMax = Math.max(j16, (long) ((j16 * 9.999871E-4f) + (j17 * 0.999f)));
                        c2838i.f11212n = jMax;
                        c2838i.f11213o = (long) ((9.999871E-4f * Math.abs(j16 - jMax)) + (c2838i.f11213o * 0.999f));
                    }
                    if (c2838i.f11211m != -9223372036854775807L) {
                        j7 = 1000;
                        if (SystemClock.elapsedRealtime() - c2838i.f11211m < 1000) {
                            f14 = c2838i.f11210l;
                        }
                    } else {
                        j7 = 1000;
                    }
                    c2838i.f11211m = SystemClock.elapsedRealtime();
                    long j18 = (c2838i.f11213o * 3) + c2838i.f11212n;
                    if (c2838i.f11207i > j18) {
                        float fM121896J = AbstractC38065t.m121896J(j7);
                        f13 = 1.0E-7f;
                        c2838i.f11207i = AbstractC36259c.m115694i0(j18, c2838i.f11204f, c2838i.f11207i - (((long) ((c2838i.f11210l - 1.0f) * fM121896J)) + ((long) ((c2838i.f11208j - 1.0f) * fM121896J))));
                    } else {
                        f13 = 1.0E-7f;
                        long jM121915h = AbstractC38065t.m121915h(jM8216k - ((long) (Math.max(0.0f, c2838i.f11210l - 1.0f) / 1.0E-7f)), c2838i.f11207i, j18);
                        c2838i.f11207i = jM121915h;
                        long j19 = c2838i.f11206h;
                        if (j19 != -9223372036854775807L && jM121915h > j19) {
                            c2838i.f11207i = j19;
                        }
                    }
                    long j24 = jM8216k - c2838i.f11207i;
                    if (Math.abs(j24) < c2838i.f11200b) {
                        c2838i.f11210l = 1.0f;
                    } else {
                        c2838i.f11210l = AbstractC38065t.m121913f((f13 * j24) + 1.0f, c2838i.f11209k, c2838i.f11208j);
                    }
                    f14 = c2838i.f11210l;
                }
                if (this.f11267N.mo8164b().f145648a != f14) {
                    C34589e0 c34589e0 = new C34589e0(f14, this.f11281b0.f11059o.f145649b);
                    this.f11261H.m121880d(16);
                    this.f11267N.mo8166d(c34589e0);
                    m8238v(this.f11281b0.f11059o, this.f11267N.mo8164b().f145648a, false, false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m8236u(InterfaceC23482a0 interfaceC23482a0) {
        C2860q0 c2860q0;
        C2864s0 c2864s0 = this.f11271R;
        C2860q0 c2860q1 = c2864s0.f11395l;
        C2847l c2847l = this.f11267N;
        if (c2860q1 != null && c2860q1.f11353a == interfaceC23482a0) {
            c2860q1.getClass();
            if (!c2860q1.f11357e) {
                float f13 = c2847l.mo8164b().f145648a;
                C2822c1 c2822c1 = this.f11281b0;
                c2860q1.m8257f(f13, c2822c1.f11045a, c2822c1.f11056l);
            }
            m8229q0(c2860q1.f11367o);
            if (c2860q1 == c2864s0.f11392i) {
                m8185N(c2860q1.f11359g.f11372b);
                m8214j(new boolean[this.f11302w.length], c2864s0.f11393j.m8256e());
                c2860q1.f11360h = true;
                C2822c1 c2822c2 = this.f11281b0;
                C23488c0 c23488c0 = c2822c2.f11046b;
                long j7 = c2860q1.f11359g.f11372b;
                this.f11281b0 = m8240w(c23488c0, j7, c2822c2.f11047c, j7, false, 5);
            }
            m8243z();
            return;
        }
        int i13 = 0;
        while (true) {
            if (i13 >= c2864s0.f11400q.size()) {
                c2860q0 = null;
                break;
            }
            c2860q0 = (C2860q0) c2864s0.f11400q.get(i13);
            if (c2860q0.f11353a == interfaceC23482a0) {
                break;
            } else {
                i13++;
            }
        }
        if (c2860q0 != null) {
            AbstractC35849g.m113807i(true ^ c2860q0.f11357e);
            float f14 = c2847l.mo8164b().f145648a;
            C2822c1 c2822c3 = this.f11281b0;
            c2860q0.m8257f(f14, c2822c3.f11045a, c2822c3.f11056l);
            C2860q0 c2860q2 = c2864s0.f11396m;
            if (c2860q2 == null || c2860q2.f11353a != interfaceC23482a0) {
                return;
            }
            m8172A();
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m8237u0(AbstractC34609o0 abstractC34609o0, C23488c0 c23488c0, AbstractC34609o0 abstractC34609o1, C23488c0 c23488c1, long j7, boolean z4) {
        boolean zM8219l0 = m8219l0(abstractC34609o0, c23488c0);
        Object obj = c23488c0.f92976a;
        if (!zM8219l0) {
            C34589e0 c34589e0 = c23488c0.m68054b() ? C34589e0.f145647d : this.f11281b0.f11059o;
            C2847l c2847l = this.f11267N;
            if (c2847l.mo8164b().equals(c34589e0)) {
                return;
            }
            this.f11261H.m121880d(16);
            c2847l.mo8166d(c34589e0);
            m8238v(this.f11281b0.f11059o, c34589e0.f145648a, false, false);
            return;
        }
        C34605m0 c34605m0 = this.f11265L;
        int i13 = abstractC34609o0.mo8135g(obj, c34605m0).f145693c;
        C34607n0 c34607n0 = this.f11264K;
        abstractC34609o0.m109407n(i13, c34607n0);
        C34618t c34618t = c34607n0.f145710j;
        C2838i c2838i = this.f11273T;
        c2838i.getClass();
        c2838i.f11202d = AbstractC38065t.m121896J(c34618t.f145827a);
        c2838i.f11205g = AbstractC38065t.m121896J(c34618t.f145828b);
        c2838i.f11206h = AbstractC38065t.m121896J(c34618t.f145829c);
        float f13 = c34618t.f145830d;
        if (f13 == -3.4028235E38f) {
            f13 = 0.97f;
        }
        c2838i.f11209k = f13;
        float f14 = c34618t.f145831e;
        if (f14 == -3.4028235E38f) {
            f14 = 1.03f;
        }
        c2838i.f11208j = f14;
        if (f13 == 1.0f && f14 == 1.0f) {
            c2838i.f11202d = -9223372036854775807L;
        }
        c2838i.m8142a();
        if (j7 != -9223372036854775807L) {
            c2838i.f11203e = m8216k(abstractC34609o0, obj, j7);
            c2838i.m8142a();
            return;
        }
        if (!Objects.equals(!abstractC34609o1.m109408p() ? abstractC34609o1.mo8129m(abstractC34609o1.mo8135g(c23488c1.f92976a, c34605m0).f145693c, c34607n0, 0L).f145701a : null, c34607n0.f145701a) || z4) {
            c2838i.f11203e = -9223372036854775807L;
            c2838i.m8142a();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m8238v(C34589e0 c34589e0, float f13, boolean z4, boolean z13) {
        int i13;
        if (z4) {
            if (z13) {
                this.f11282c0.m1758c(1);
            }
            this.f11281b0 = this.f11281b0.m8042g(c34589e0);
        }
        float f14 = c34589e0.f145648a;
        C2860q0 c2860q0 = this.f11271R.f11392i;
        while (true) {
            i13 = 0;
            if (c2860q0 == null) {
                break;
            }
            InterfaceC27679s[] interfaceC27679sArr = c2860q0.f11367o.f111439c;
            int length = interfaceC27679sArr.length;
            while (i13 < length) {
                InterfaceC27679s interfaceC27679s = interfaceC27679sArr[i13];
                if (interfaceC27679s != null) {
                    interfaceC27679s.mo68074f(f14);
                }
                i13++;
            }
            c2860q0 = c2860q0.f11365m;
        }
        C2843j1[] c2843j1Arr = this.f11302w;
        int length2 = c2843j1Arr.length;
        while (i13 < length2) {
            C2843j1 c2843j1 = c2843j1Arr[i13];
            float f15 = c34589e0.f145648a;
            ((AbstractC2829f) c2843j1.f11233e).mo8077z(f13, f15);
            AbstractC2829f abstractC2829f = (AbstractC2829f) c2843j1.f11234f;
            if (abstractC2829f != null) {
                abstractC2829f.mo8077z(f13, f15);
            }
            i13++;
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m8239v0(boolean z4, boolean z13) {
        long jElapsedRealtime;
        this.f11286g0 = z4;
        if (!z4 || z13) {
            jElapsedRealtime = -9223372036854775807L;
        } else {
            this.f11269P.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.f11287h0 = jElapsedRealtime;
    }

    /* JADX INFO: renamed from: w */
    public final C2822c1 m8240w(C23488c0 c23488c0, long j7, long j13, long j14, boolean z4, int i13) {
        C41060w0 c41060w0M133239f;
        boolean z13;
        this.f11299t0 = (!this.f11299t0 && j7 == this.f11281b0.f11063s && c23488c0.equals(this.f11281b0.f11046b)) ? false : true;
        m8184M();
        C2822c1 c2822c1 = this.f11281b0;
        C23501g1 c23501g1 = c2822c1.f11052h;
        C27682v c27682v = c2822c1.f11053i;
        List list = c2822c1.f11054j;
        if (this.f11272S.f11034g) {
            C2860q0 c2860q0 = this.f11271R.f11392i;
            c23501g1 = c2860q0 == null ? C23501g1.f93026d : c2860q0.f11366n;
            c27682v = c2860q0 == null ? this.f11258E : c2860q0.f11367o;
            InterfaceC27679s[] interfaceC27679sArr = c27682v.f111439c;
            C41014d0 c41014d0 = new C41014d0(4);
            boolean z14 = false;
            for (InterfaceC27679s interfaceC27679s : interfaceC27679sArr) {
                if (interfaceC27679s != null) {
                    C34585c0 c34585c0 = interfaceC27679s.mo68072d(0).f145781l;
                    if (c34585c0 == null) {
                        c41014d0.m133222a(new C34585c0(new InterfaceC34583b0[0]));
                    } else {
                        c41014d0.m133222a(c34585c0);
                        z14 = true;
                    }
                }
            }
            if (z14) {
                c41060w0M133239f = c41014d0.m133239f();
            } else {
                C41017e0 c41017e0 = AbstractC41023g0.f176998x;
                c41060w0M133239f = C41060w0.f177067E;
            }
            list = c41060w0M133239f;
            if (c2860q0 != null) {
                C2862r0 c2862r0 = c2860q0.f11359g;
                if (c2862r0.f11373c != j13) {
                    c2860q0.f11359g = c2862r0.m8263a(j13);
                }
            }
            C2843j1[] c2843j1Arr = this.f11302w;
            C2864s0 c2864s0 = this.f11271R;
            C2860q0 c2860q1 = c2864s0.f11392i;
            if (c2860q1 == c2864s0.f11393j && c2860q1 != null) {
                C27682v c27682v2 = c2860q1.f11367o;
                int i14 = 0;
                boolean z15 = false;
                while (true) {
                    if (i14 >= c2843j1Arr.length) {
                        z13 = true;
                        break;
                    }
                    if (c27682v2.m83678b(i14)) {
                        if (((AbstractC2829f) c2843j1Arr[i14].f11233e).f11095x != 1) {
                            z13 = false;
                            break;
                        }
                        if (c27682v2.f111438b[i14].f11219a != 0) {
                            z15 = true;
                        }
                    }
                    i14++;
                }
                boolean z16 = z15 && z13;
                if (z16 != this.f11293n0) {
                    this.f11293n0 = z16;
                    if (!z16 && this.f11281b0.f11060p) {
                        this.f11261H.m121881e(2);
                    }
                }
            }
        } else if (!c23488c0.equals(c2822c1.f11046b)) {
            c23501g1 = C23501g1.f93026d;
            c27682v = this.f11258E;
            list = C41060w0.f177067E;
        }
        C23501g1 c23501g2 = c23501g1;
        C27682v c27682v3 = c27682v;
        List list2 = list;
        if (z4) {
            C0704y c0704y = this.f11282c0;
            if (!c0704y.f2665d || c0704y.f2667f == 5) {
                c0704y.f2664c = true;
                c0704y.f2665d = true;
                c0704y.f2667f = i13;
            } else {
                AbstractC35849g.m113802d(i13 == 5);
            }
        }
        C2822c1 c2822c2 = this.f11281b0;
        return c2822c2.m8039d(c23488c0, j7, j13, j14, m8222n(c2822c2.f11061q), c23501g2, c27682v3, list2);
    }

    /* JADX INFO: renamed from: w0 */
    public final synchronized void m8241w0(InterfaceC39722i interfaceC39722i, long j7) {
        this.f11269P.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j7;
        boolean z4 = false;
        while (!((Boolean) interfaceC39722i.get()).booleanValue() && j7 > 0) {
            try {
                this.f11269P.getClass();
                wait(j7);
            } catch (InterruptedException unused) {
                z4 = true;
            }
            this.f11269P.getClass();
            j7 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: y */
    public final boolean m8242y() {
        C2860q0 c2860q0 = this.f11271R.f11392i;
        long j7 = c2860q0.f11359g.f11375e;
        if (c2860q0.f11357e) {
            return j7 == -9223372036854775807L || this.f11281b0.f11063s < j7 || !m8217k0();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, l9.a0] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, l9.b1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, l9.b1] */
    /* JADX INFO: renamed from: z */
    public final void m8243z() {
        boolean zM8159c;
        if (m8171x(this.f11271R.f11395l)) {
            C2860q0 c2860q0 = this.f11271R.f11395l;
            long jM8222n = m8222n(!c2860q0.f11357e ? 0L : c2860q0.f11353a.mo36122d());
            C2860q0 c2860q1 = this.f11271R.f11392i;
            long j7 = m8219l0(this.f11281b0.f11045a, c2860q0.f11359g.f11371a) ? this.f11273T.f11207i : -9223372036854775807L;
            C4323n c4323n = this.f11275V;
            AbstractC34609o0 abstractC34609o0 = this.f11281b0.f11045a;
            float f13 = this.f11267N.mo8164b().f145648a;
            boolean z4 = this.f11281b0.f11056l;
            C2851m0 c2851m0 = new C2851m0(c4323n, jM8222n, f13, this.f11286g0, j7);
            zM8159c = this.f11259F.m8159c(c2851m0);
            C2860q0 c2860q2 = this.f11271R.f11392i;
            if (!zM8159c && c2860q2.f11357e && jM8222n < 500000 && this.f11266M > 0) {
                c2860q2.f11353a.mo36126i(this.f11281b0.f11063s);
                zM8159c = this.f11259F.m8159c(c2851m0);
            }
        } else {
            zM8159c = false;
        }
        this.f11288i0 = zM8159c;
        if (zM8159c) {
            C2860q0 c2860q3 = this.f11271R.f11395l;
            c2860q3.getClass();
            C2854n0 c2854n0 = new C2854n0();
            c2854n0.f11323a = this.f11296q0 - c2860q3.f11368p;
            float f14 = this.f11267N.mo8164b().f145648a;
            AbstractC35849g.m113802d(f14 > 0.0f || f14 == -3.4028235E38f);
            c2854n0.f11324b = f14;
            long j13 = this.f11287h0;
            AbstractC35849g.m113802d(j13 >= 0 || j13 == -9223372036854775807L);
            c2854n0.f11325c = j13;
            C2856o0 c2856o0 = new C2856o0(c2854n0);
            AbstractC35849g.m113807i(c2860q3.f11365m == null);
            c2860q3.f11353a.mo36134x(c2856o0);
        }
        m8227p0();
    }
}
