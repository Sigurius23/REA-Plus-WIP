package p031b9;

import android.content.Context;
import android.graphics.Rect;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.fragment.app.RunnableC1319m;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoTimeoutException;
import androidx.media3.exoplayer.image.ImageOutput;
import b30.C2570m;
import io.sentry.internal.debugmeta.C20378c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import p004a2.AbstractC0152a;
import p009a8.RunnableC0533c;
import p012ab.C0667a;
import p012ab.C0680g0;
import p012ab.C0704y;
import p027b3.AbstractC2351b;
import p047c9.C4310a;
import p047c9.C4317h;
import p047c9.C4321l;
import p047c9.C4322m;
import p047c9.C4323n;
import p284ko.C22612d;
import p299l9.AbstractC23481a;
import p299l9.C23488c0;
import p299l9.C23489c1;
import p299l9.C23501g1;
import p299l9.InterfaceC23485b0;
import p309lo.C24547e;
import p361o9.C27669i;
import p361o9.C27670j;
import p361o9.C27677q;
import p361o9.C27682v;
import p361o9.InterfaceC27679s;
import p398p9.C28979c;
import p398p9.C28982f;
import p398p9.InterfaceC28980d;
import p484s9.C32284i;
import p497t7.InterfaceC33561b;
import p508ty.C34249c;
import p516u8.AbstractC34609o0;
import p516u8.AbstractC34628y;
import p516u8.C34581a0;
import p516u8.C34585c0;
import p516u8.C34586d;
import p516u8.C34589e0;
import p516u8.C34591f0;
import p516u8.C34596i;
import p516u8.C34597i0;
import p516u8.C34605m0;
import p516u8.C34606n;
import p516u8.C34607n0;
import p516u8.C34619t0;
import p516u8.C34623v0;
import p516u8.C34626x;
import p516u8.C34629y0;
import p516u8.C34630z;
import p516u8.InterfaceC34583b0;
import p516u8.InterfaceC34595h0;
import p576w8.C36933c;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p607x8.C38053h;
import p607x8.C38054i;
import p607x8.C38060o;
import p607x8.C38061p;
import p607x8.C38062q;
import p607x8.C38063r;
import p607x8.InterfaceC38051f;
import p607x8.InterfaceC38052g;
import p690zr.AbstractC41023g0;
import p690zr.C41017e0;
import p690zr.C41060w0;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: b9.f0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2830f0 extends AbstractC0152a implements ExoPlayer {

    /* JADX INFO: renamed from: A0 */
    public boolean f11098A0;

    /* JADX INFO: renamed from: B0 */
    public C36933c f11099B0;

    /* JADX INFO: renamed from: C0 */
    public final boolean f11100C0;

    /* JADX INFO: renamed from: D0 */
    public boolean f11101D0;

    /* JADX INFO: renamed from: E */
    public final C2852m1 f11102E;

    /* JADX INFO: renamed from: E0 */
    public final int f11103E0;

    /* JADX INFO: renamed from: F */
    public final Context f11104F;

    /* JADX INFO: renamed from: F0 */
    public boolean f11105F0;

    /* JADX INFO: renamed from: G */
    public final C2830f0 f11106G;

    /* JADX INFO: renamed from: G0 */
    public C34629y0 f11107G0;

    /* JADX INFO: renamed from: H */
    public final AbstractC2829f[] f11108H;

    /* JADX INFO: renamed from: H0 */
    public C34581a0 f11109H0;

    /* JADX INFO: renamed from: I */
    public final AbstractC2829f[] f11110I;

    /* JADX INFO: renamed from: I0 */
    public C2822c1 f11111I0;

    /* JADX INFO: renamed from: J */
    public final AbstractC2351b f11112J;

    /* JADX INFO: renamed from: J0 */
    public int f11113J0;

    /* JADX INFO: renamed from: K */
    public final C38063r f11114K;

    /* JADX INFO: renamed from: K0 */
    public long f11115K0;

    /* JADX INFO: renamed from: L */
    public final C2867u f11116L;

    /* JADX INFO: renamed from: M */
    public final C2848l0 f11117M;

    /* JADX INFO: renamed from: N */
    public final C38054i f11118N;

    /* JADX INFO: renamed from: O */
    public final CopyOnWriteArraySet f11119O;

    /* JADX INFO: renamed from: P */
    public final C34605m0 f11120P;

    /* JADX INFO: renamed from: Q */
    public final ArrayList f11121Q;

    /* JADX INFO: renamed from: R */
    public final boolean f11122R;

    /* JADX INFO: renamed from: S */
    public final InterfaceC23485b0 f11123S;

    /* JADX INFO: renamed from: T */
    public final C4317h f11124T;

    /* JADX INFO: renamed from: U */
    public final Looper f11125U;

    /* JADX INFO: renamed from: V */
    public final InterfaceC28980d f11126V;

    /* JADX INFO: renamed from: W */
    public final long f11127W;

    /* JADX INFO: renamed from: X */
    public final long f11128X;

    /* JADX INFO: renamed from: Y */
    public final long f11129Y;

    /* JADX INFO: renamed from: Z */
    public final C38061p f11130Z;

    /* JADX INFO: renamed from: a0 */
    public final SurfaceHolderCallbackC2821c0 f11131a0;

    /* JADX INFO: renamed from: b0 */
    public final C2824d0 f11132b0;

    /* JADX INFO: renamed from: c0 */
    public final C2817b f11133c0;

    /* JADX INFO: renamed from: d0 */
    public final C2852m1 f11134d0;

    /* JADX INFO: renamed from: e0 */
    public final C2852m1 f11135e0;

    /* JADX INFO: renamed from: f0 */
    public final long f11136f0;

    /* JADX INFO: renamed from: g0 */
    public final C2570m f11137g0;

    /* JADX INFO: renamed from: h0 */
    public int f11138h0;

    /* JADX INFO: renamed from: i0 */
    public boolean f11139i0;

    /* JADX INFO: renamed from: j0 */
    public int f11140j0;

    /* JADX INFO: renamed from: k0 */
    public int f11141k0;

    /* JADX INFO: renamed from: l0 */
    public boolean f11142l0;

    /* JADX INFO: renamed from: m0 */
    public final C2846k1 f11143m0;

    /* JADX INFO: renamed from: n0 */
    public C23489c1 f11144n0;

    /* JADX INFO: renamed from: o0 */
    public final C2859q f11145o0;

    /* JADX INFO: renamed from: p0 */
    public C34591f0 f11146p0;

    /* JADX INFO: renamed from: q0 */
    public C34581a0 f11147q0;

    /* JADX INFO: renamed from: r0 */
    public Object f11148r0;

    /* JADX INFO: renamed from: s0 */
    public Surface f11149s0;

    /* JADX INFO: renamed from: t0 */
    public SurfaceHolder f11150t0;

    /* JADX INFO: renamed from: u0 */
    public C32284i f11151u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f11152v0;

    /* JADX INFO: renamed from: w0 */
    public TextureView f11153w0;

    /* JADX INFO: renamed from: x0 */
    public final int f11154x0;

    /* JADX INFO: renamed from: y */
    public final C27682v f11155y;

    /* JADX INFO: renamed from: y0 */
    public C38060o f11156y0;

    /* JADX INFO: renamed from: z */
    public final C34591f0 f11157z;

    /* JADX INFO: renamed from: z0 */
    public C34586d f11158z0;

    static {
        AbstractC34628y.m109420a("media3.exoplayer");
    }

    public C2830f0(C2857p c2857p) {
        super(7);
        this.f11102E = new C2852m1(7);
        try {
            AbstractC38046a.m121818m("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.6.1] [" + AbstractC38065t.f163032b + "]");
            Context context = c2857p.f11330a;
            Looper looper = c2857p.f11336g;
            C38061p c38061p = c2857p.f11331b;
            this.f11104F = context.getApplicationContext();
            this.f11124T = new C4317h(c38061p);
            this.f11103E0 = c2857p.f11337h;
            this.f11158z0 = c2857p.f11338i;
            this.f11154x0 = c2857p.f11340k;
            this.f11098A0 = false;
            this.f11136f0 = c2857p.f11348s;
            SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c0 = new SurfaceHolderCallbackC2821c0(this);
            this.f11131a0 = surfaceHolderCallbackC2821c0;
            this.f11132b0 = new C2824d0();
            AbstractC2829f[] abstractC2829fArrM56585n = ((C20378c) c2857p.f11332c.get()).m56585n(new Handler(looper), surfaceHolderCallbackC2821c0, surfaceHolderCallbackC2821c0, surfaceHolderCallbackC2821c0, surfaceHolderCallbackC2821c0);
            this.f11108H = abstractC2829fArrM56585n;
            AbstractC35849g.m113807i(abstractC2829fArrM56585n.length > 0);
            this.f11110I = new AbstractC2829f[abstractC2829fArrM56585n.length];
            int i13 = 0;
            while (true) {
                AbstractC2829f[] abstractC2829fArr = this.f11110I;
                if (i13 >= abstractC2829fArr.length) {
                    break;
                }
                int i14 = this.f11108H[i13].f11095x;
                abstractC2829fArr[i13] = null;
                i13++;
            }
            this.f11112J = (AbstractC2351b) c2857p.f11334e.get();
            this.f11123S = (InterfaceC23485b0) c2857p.f11333d.get();
            this.f11126V = (InterfaceC28980d) c2857p.f11335f.get();
            this.f11122R = c2857p.f11341l;
            this.f11143m0 = c2857p.f11342m;
            this.f11127W = c2857p.f11343n;
            this.f11128X = c2857p.f11344o;
            this.f11129Y = c2857p.f11345p;
            this.f11125U = looper;
            this.f11130Z = c38061p;
            this.f11106G = this;
            this.f11118N = new C38054i(looper, c38061p, new C2867u(this));
            this.f11119O = new CopyOnWriteArraySet();
            this.f11121Q = new ArrayList();
            this.f11144n0 = new C23489c1();
            this.f11145o0 = C2859q.f11352a;
            AbstractC2829f[] abstractC2829fArr2 = this.f11108H;
            this.f11155y = new C27682v(new C2840i1[abstractC2829fArr2.length], new InterfaceC27679s[abstractC2829fArr2.length], C34623v0.f145863b, null);
            this.f11120P = new C34605m0();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i15 = 0; i15 < 20; i15++) {
                int i16 = iArr[i15];
                AbstractC35849g.m113807i(!false);
                sparseBooleanArray.append(i16, true);
            }
            this.f11112J.getClass();
            AbstractC35849g.m113807i(!false);
            sparseBooleanArray.append(29, true);
            AbstractC35849g.m113807i(!false);
            C34606n c34606n = new C34606n(sparseBooleanArray);
            this.f11157z = new C34591f0(c34606n);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i17 = 0; i17 < c34606n.f145698a.size(); i17++) {
                int iM109400a = c34606n.m109400a(i17);
                AbstractC35849g.m113807i(!false);
                sparseBooleanArray2.append(iM109400a, true);
            }
            AbstractC35849g.m113807i(!false);
            sparseBooleanArray2.append(4, true);
            AbstractC35849g.m113807i(!false);
            sparseBooleanArray2.append(10, true);
            AbstractC35849g.m113807i(!false);
            this.f11146p0 = new C34591f0(new C34606n(sparseBooleanArray2));
            this.f11114K = this.f11130Z.m121874a(this.f11125U, null);
            C2867u c2867u = new C2867u(this);
            this.f11116L = c2867u;
            this.f11111I0 = C2822c1.m8035j(this.f11155y);
            this.f11124T.m13603m(this.f11106G, this.f11125U);
            final C4323n c4323n = new C4323n(c2857p.f11351v);
            C2848l0 c2848l0 = new C2848l0(this.f11104F, this.f11108H, this.f11110I, this.f11112J, this.f11155y, new C2844k(), this.f11126V, this.f11138h0, this.f11139i0, this.f11124T, this.f11143m0, c2857p.f11346q, c2857p.f11347r, this.f11125U, this.f11130Z, c2867u, c4323n, this.f11145o0);
            this.f11117M = c2848l0;
            Looper looper2 = c2848l0.f11263J;
            this.f11138h0 = 0;
            C34581a0 c34581a0 = C34581a0.f145608B;
            this.f11147q0 = c34581a0;
            this.f11109H0 = c34581a0;
            this.f11113J0 = -1;
            this.f11099B0 = C36933c.f158062b;
            this.f11100C0 = true;
            m8092Q(this.f11124T);
            InterfaceC28980d interfaceC28980d = this.f11126V;
            Handler handler = new Handler(this.f11125U);
            C4317h c4317h = this.f11124T;
            C28982f c28982f = (C28982f) interfaceC28980d;
            c28982f.getClass();
            c4317h.getClass();
            C22612d c22612d = c28982f.f117232c;
            c22612d.getClass();
            CopyOnWriteArrayList<C28979c> copyOnWriteArrayList = c22612d.f88960a;
            for (C28979c c28979c : copyOnWriteArrayList) {
                if (c28979c.f117220b == c4317h) {
                    c28979c.f117221c = true;
                    copyOnWriteArrayList.remove(c28979c);
                }
            }
            copyOnWriteArrayList.add(new C28979c(handler, c4317h));
            this.f11119O.add(this.f11131a0);
            if (AbstractC38065t.f163031a >= 31) {
                final Context context2 = this.f11104F;
                final boolean z4 = c2857p.f11349t;
                this.f11130Z.m121874a(c2848l0.f11263J, null).m121879c(new Runnable() { // from class: b9.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context3 = context2;
                        boolean z13 = z4;
                        C2830f0 c2830f0 = this;
                        C4323n c4323n2 = c4323n;
                        C4321l c4321lM13618g = C4321l.m13618g(context3);
                        if (c4321lM13618g == null) {
                            AbstractC38046a.m121826u("ExoPlayerImpl", "MediaMetricsService unavailable.");
                            return;
                        }
                        if (z13) {
                            C4317h c4317h2 = c2830f0.f11124T;
                            c4317h2.getClass();
                            c4317h2.f17516F.m121831a(c4321lM13618g);
                        }
                        LogSessionId logSessionIdM13621i = c4321lM13618g.m13621i();
                        synchronized (c4323n2) {
                            C4322m c4322m = c4323n2.f17574b;
                            c4322m.getClass();
                            c4322m.m13632f(logSessionIdM13621i);
                        }
                    }
                });
            }
            C2570m c2570m = new C2570m((Object) 0, looper2, this.f11125U, this.f11130Z, new C2867u(this));
            this.f11137g0 = c2570m;
            ((C38063r) c2570m.f9987x).m121879c(new RunnableC1319m(this, 8));
            C2817b c2817b = new C2817b(c2857p.f11330a, looper2, c2857p.f11336g, this.f11131a0, this.f11130Z);
            this.f11133c0 = c2817b;
            c2817b.m8022z();
            this.f11134d0 = new C2852m1(context, looper2, this.f11130Z, 0);
            this.f11135e0 = new C2852m1(context, looper2, this.f11130Z, 1);
            int i18 = C34596i.f145666c;
            this.f11107G0 = C34629y0.f145874d;
            this.f11156y0 = C38060o.f163020c;
            C34586d c34586d = this.f11158z0;
            boolean z13 = c2857p.f11339j;
            C38063r c38063r = c2848l0.f11261H;
            c38063r.getClass();
            C38062q c38062qM121877b = C38063r.m121877b();
            c38062qM121877b.f163024a = c38063r.f163026a.obtainMessage(31, z13 ? 1 : 0, 0, c34586d);
            c38062qM121877b.m121876b();
            m8121v0(1, 3, this.f11158z0);
            m8121v0(2, 4, Integer.valueOf(this.f11154x0));
            m8121v0(2, 5, 0);
            m8121v0(1, 9, Boolean.valueOf(this.f11098A0));
            m8121v0(2, 7, this.f11132b0);
            m8121v0(6, 8, this.f11132b0);
            m8121v0(-1, 16, Integer.valueOf(this.f11103E0));
        } finally {
            this.f11102E.m8248c();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static long m8078j0(C2822c1 c2822c1) {
        C34607n0 c34607n0 = new C34607n0();
        C34605m0 c34605m0 = new C34605m0();
        c2822c1.f11045a.mo8135g(c2822c1.f11046b.f92976a, c34605m0);
        long j7 = c2822c1.f11047c;
        return j7 == -9223372036854775807L ? c2822c1.f11045a.mo8129m(c34605m0.f145693c, c34607n0, 0L).f145712l : c34605m0.f145695e + j7;
    }

    /* JADX INFO: renamed from: m0 */
    public static C2822c1 m8079m0(C2822c1 c2822c1, int i13) {
        C2822c1 c2822c1M8043h = c2822c1.m8043h(i13);
        return (i13 == 1 || i13 == 4) ? c2822c1M8043h.m8037b(false) : c2822c1M8043h;
    }

    /* JADX INFO: renamed from: A0 */
    public final void m8080A0(C34589e0 c34589e0) {
        m8091L0();
        if (this.f11111I0.f11059o.equals(c34589e0)) {
            return;
        }
        C2822c1 c2822c1M8042g = this.f11111I0.m8042g(c34589e0);
        this.f11140j0++;
        this.f11117M.f11261H.m121878a(4, c34589e0).m121876b();
        m8089J0(c2822c1M8042g, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m8081B0(int i13) {
        m8091L0();
        if (this.f11138h0 != i13) {
            this.f11138h0 = i13;
            C38063r c38063r = this.f11117M.f11261H;
            c38063r.getClass();
            C38062q c38062qM121877b = C38063r.m121877b();
            c38062qM121877b.f163024a = c38063r.f163026a.obtainMessage(11, i13, 0);
            c38062qM121877b.m121876b();
            C2865t c2865t = new C2865t(i13, 0);
            C38054i c38054i = this.f11118N;
            c38054i.m121833c(8, c2865t);
            m8087H0();
            c38054i.m121832b();
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final void m8082C0(boolean z4) {
        m8091L0();
        if (this.f11139i0 != z4) {
            this.f11139i0 = z4;
            C38063r c38063r = this.f11117M.f11261H;
            c38063r.getClass();
            C38062q c38062qM121877b = C38063r.m121877b();
            c38062qM121877b.f163024a = c38063r.f163026a.obtainMessage(12, z4 ? 1 : 0, 0);
            c38062qM121877b.m121876b();
            C2871w c2871w = new C2871w(z4, 0);
            C38054i c38054i = this.f11118N;
            c38054i.m121833c(9, c2871w);
            m8087H0();
            c38054i.m121832b();
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final void m8083D0(C34619t0 c34619t0) {
        m8091L0();
        AbstractC2351b abstractC2351b = this.f11112J;
        abstractC2351b.getClass();
        C27677q c27677q = (C27677q) abstractC2351b;
        if (c34619t0.equals(c27677q.m83674N())) {
            return;
        }
        if (c34619t0 instanceof C27670j) {
            c27677q.m83676R((C27670j) c34619t0);
        }
        C27669i c27669i = new C27669i(c27677q.m83674N());
        c27669i.m109414b(c34619t0);
        c27677q.m83676R(new C27670j(c27669i));
        this.f11118N.m121835e(19, new C0680g0(c34619t0, 5));
    }

    /* JADX INFO: renamed from: E0 */
    public final void m8084E0(Object obj) {
        Object obj2 = this.f11148r0;
        boolean z4 = true;
        boolean z13 = (obj2 == null || obj2 == obj) ? false : true;
        long j7 = z13 ? this.f11136f0 : -9223372036854775807L;
        C2848l0 c2848l0 = this.f11117M;
        synchronized (c2848l0) {
            if (!c2848l0.f11283d0 && c2848l0.f11263J.getThread().isAlive()) {
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                c2848l0.f11261H.m121878a(30, new Pair(obj, atomicBoolean)).m121876b();
                if (j7 != -9223372036854775807L) {
                    c2848l0.m8241w0(new C2853n(atomicBoolean, 2), j7);
                    z4 = atomicBoolean.get();
                }
            }
        }
        if (z13) {
            Object obj3 = this.f11148r0;
            Surface surface = this.f11149s0;
            if (obj3 == surface) {
                surface.release();
                this.f11149s0 = null;
            }
        }
        this.f11148r0 = obj;
        if (z4) {
            return;
        }
        m8086G0(new ExoPlaybackException(2, new ExoTimeoutException("Detaching surface timed out."), 1003));
    }

    /* JADX INFO: renamed from: F0 */
    public final void m8085F0() {
        m8091L0();
        m8086G0(null);
        C41060w0 c41060w0 = C41060w0.f177067E;
        long j7 = this.f11111I0.f11063s;
        this.f11099B0 = new C36933c(c41060w0);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m8086G0(ExoPlaybackException exoPlaybackException) {
        C2822c1 c2822c1 = this.f11111I0;
        C2822c1 c2822c1M8038c = c2822c1.m8038c(c2822c1.f11046b);
        c2822c1M8038c.f11061q = c2822c1M8038c.f11063s;
        c2822c1M8038c.f11062r = 0L;
        C2822c1 c2822c1M8079m0 = m8079m0(c2822c1M8038c, 1);
        if (exoPlaybackException != null) {
            c2822c1M8079m0 = c2822c1M8079m0.m8041f(exoPlaybackException);
        }
        C2822c1 c2822c2 = c2822c1M8079m0;
        this.f11140j0++;
        C38063r c38063r = this.f11117M.f11261H;
        c38063r.getClass();
        C38062q c38062qM121877b = C38063r.m121877b();
        c38062qM121877b.f163024a = c38063r.f163026a.obtainMessage(6);
        c38062qM121877b.m121876b();
        m8089J0(c2822c2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // p004a2.AbstractC0152a
    /* JADX INFO: renamed from: H */
    public final void mo374H(int i13, long j7, boolean z4) {
        m8091L0();
        if (i13 == -1) {
            return;
        }
        AbstractC35849g.m113802d(i13 >= 0);
        AbstractC34609o0 abstractC34609o0 = this.f11111I0.f11045a;
        if (abstractC34609o0.m109408p() || i13 < abstractC34609o0.mo8139o()) {
            C4317h c4317h = this.f11124T;
            if (!c4317h.f17519I) {
                C4310a c4310aM13597g = c4317h.m13597g();
                c4317h.f17519I = true;
                c4317h.m13602l(c4310aM13597g, -1, new C0667a(29));
            }
            this.f11140j0++;
            if (m8112l0()) {
                AbstractC38046a.m121826u("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                C0704y c0704y = new C0704y(this.f11111I0);
                c0704y.m1758c(1);
                C2830f0 c2830f0 = this.f11116L.f11403w;
                c2830f0.f11114K.m121879c(new RunnableC0533c(3, c2830f0, c0704y));
                return;
            }
            C2822c1 c2822c1M8043h = this.f11111I0;
            int i14 = c2822c1M8043h.f11049e;
            if (i14 == 3 || (i14 == 4 && !abstractC34609o0.m109408p())) {
                c2822c1M8043h = this.f11111I0.m8043h(2);
            }
            int iM8101Z = m8101Z();
            C2822c1 c2822c1M8113n0 = m8113n0(c2822c1M8043h, abstractC34609o0, m8114o0(abstractC34609o0, i13, j7));
            this.f11117M.f11261H.m121878a(3, new C2845k0(abstractC34609o0, i13, AbstractC38065t.m121896J(j7))).m121876b();
            m8089J0(c2822c1M8113n0, 0, true, 1, m8103b0(c2822c1M8113n0), iM8101Z, z4);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m8087H0() {
        int iMo8137k;
        int iMo8134e;
        C34591f0 c34591f0 = this.f11146p0;
        int i13 = AbstractC38065t.f163031a;
        C2830f0 c2830f0 = this.f11106G;
        boolean zM8112l0 = c2830f0.m8112l0();
        boolean zM370D = c2830f0.m370D();
        AbstractC34609o0 abstractC34609o0M8104c0 = c2830f0.m8104c0();
        if (abstractC34609o0M8104c0.m109408p()) {
            iMo8137k = -1;
        } else {
            int iM8101Z = c2830f0.m8101Z();
            c2830f0.m8091L0();
            int i14 = c2830f0.f11138h0;
            if (i14 == 1) {
                i14 = 0;
            }
            c2830f0.m8091L0();
            iMo8137k = abstractC34609o0M8104c0.mo8137k(iM8101Z, i14, c2830f0.f11139i0);
        }
        boolean z4 = iMo8137k != -1;
        AbstractC34609o0 abstractC34609o0M8104c1 = c2830f0.m8104c0();
        if (abstractC34609o0M8104c1.m109408p()) {
            iMo8134e = -1;
        } else {
            int iM8101Z2 = c2830f0.m8101Z();
            c2830f0.m8091L0();
            int i15 = c2830f0.f11138h0;
            if (i15 == 1) {
                i15 = 0;
            }
            c2830f0.m8091L0();
            iMo8134e = abstractC34609o0M8104c1.mo8134e(iM8101Z2, i15, c2830f0.f11139i0);
        }
        boolean z13 = iMo8134e != -1;
        boolean zM369C = c2830f0.m369C();
        boolean zM368B = c2830f0.m368B();
        boolean zM109408p = c2830f0.m8104c0().m109408p();
        C34249c c34249c = new C34249c(6);
        C24547e c24547e = (C24547e) c34249c.f143660x;
        C34606n c34606n = this.f11157z.f145656a;
        c24547e.getClass();
        for (int i16 = 0; i16 < c34606n.f145698a.size(); i16++) {
            c24547e.m71592a(c34606n.m109400a(i16));
        }
        boolean z14 = !zM8112l0;
        c34249c.m108294j(4, z14);
        c34249c.m108294j(5, zM370D && !zM8112l0);
        c34249c.m108294j(6, z4 && !zM8112l0);
        c34249c.m108294j(7, !zM109408p && (z4 || !zM369C || zM370D) && !zM8112l0);
        c34249c.m108294j(8, z13 && !zM8112l0);
        c34249c.m108294j(9, !zM109408p && (z13 || (zM369C && zM368B)) && !zM8112l0);
        c34249c.m108294j(10, z14);
        c34249c.m108294j(11, zM370D && !zM8112l0);
        c34249c.m108294j(12, zM370D && !zM8112l0);
        C34591f0 c34591f1 = new C34591f0(c24547e.m71594c());
        this.f11146p0 = c34591f1;
        if (c34591f1.equals(c34591f0)) {
            return;
        }
        this.f11118N.m121833c(13, new C2867u(this));
    }

    /* JADX INFO: renamed from: I0 */
    public final void m8088I0(int i13, boolean z4) {
        C2822c1 c2822c1M8036a = this.f11111I0;
        int i14 = c2822c1M8036a.f11058n;
        int i15 = (i14 != 1 || z4) ? 0 : 1;
        if (c2822c1M8036a.f11056l == z4 && i14 == i15 && c2822c1M8036a.f11057m == i13) {
            return;
        }
        this.f11140j0++;
        if (c2822c1M8036a.f11060p) {
            c2822c1M8036a = c2822c1M8036a.m8036a();
        }
        C2822c1 c2822c1M8040e = c2822c1M8036a.m8040e(i13, i15, z4);
        C38063r c38063r = this.f11117M.f11261H;
        c38063r.getClass();
        C38062q c38062qM121877b = C38063r.m121877b();
        c38062qM121877b.f163024a = c38063r.f163026a.obtainMessage(1, z4 ? 1 : 0, i13 | (i15 << 4));
        c38062qM121877b.m121876b();
        m8089J0(c2822c1M8040e, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: renamed from: J0 */
    public final void m8089J0(final C2822c1 c2822c1, int i13, boolean z4, int i14, long j7, int i15, boolean z13) {
        Pair pair;
        int i16;
        C34626x c34626x;
        int i17;
        Object obj;
        C34626x c34626x2;
        Object obj2;
        int i18;
        long j13;
        long j14;
        long jM8078j0;
        long jM8078j1;
        Object obj3;
        C34626x c34626x3;
        Object obj4;
        int i19;
        C2822c1 c2822c2 = this.f11111I0;
        this.f11111I0 = c2822c1;
        boolean zEquals = c2822c2.f11045a.equals(c2822c1.f11045a);
        C34607n0 c34607n0 = (C34607n0) this.f475x;
        C34605m0 c34605m0 = this.f11120P;
        AbstractC34609o0 abstractC34609o0 = c2822c2.f11045a;
        C23488c0 c23488c0 = c2822c2.f11046b;
        AbstractC34609o0 abstractC34609o1 = c2822c1.f11045a;
        C23488c0 c23488c1 = c2822c1.f11046b;
        if (abstractC34609o1.m109408p() && abstractC34609o0.m109408p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (abstractC34609o1.m109408p() != abstractC34609o0.m109408p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!abstractC34609o0.mo8129m(abstractC34609o0.mo8135g(c23488c0.f92976a, c34605m0).f145693c, c34607n0, 0L).f145701a.equals(abstractC34609o1.mo8129m(abstractC34609o1.mo8135g(c23488c1.f92976a, c34605m0).f145693c, c34607n0, 0L).f145701a)) {
            if (z4 && i14 == 0) {
                i16 = 1;
            } else if (z4 && i14 == 1) {
                i16 = 2;
            } else {
                if (zEquals) {
                    throw new IllegalStateException();
                }
                i16 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i16));
        } else if (z4 && i14 == 0 && c23488c0.f92979d < c23488c1.f92979d) {
            pair = new Pair(Boolean.TRUE, 0);
        } else {
            pair = (z4 && i14 == 1 && z13) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            c34626x = c2822c1.f11045a.m109408p() ? null : c2822c1.f11045a.mo8129m(c2822c1.f11045a.mo8135g(c2822c1.f11046b.f92976a, this.f11120P).f145693c, (C34607n0) this.f475x, 0L).f145703c;
            this.f11109H0 = C34581a0.f145608B;
        } else {
            c34626x = null;
        }
        if (zBooleanValue || !c2822c2.f11054j.equals(c2822c1.f11054j)) {
            C34630z c34630zM109362a = this.f11109H0.m109362a();
            List list = c2822c1.f11054j;
            for (int i24 = 0; i24 < list.size(); i24++) {
                C34585c0 c34585c0 = (C34585c0) list.get(i24);
                int i25 = 0;
                while (true) {
                    InterfaceC34583b0[] interfaceC34583b0Arr = c34585c0.f145640a;
                    if (i25 < interfaceC34583b0Arr.length) {
                        interfaceC34583b0Arr[i25].mo40837a(c34630zM109362a);
                        i25++;
                    }
                }
            }
            this.f11109H0 = new C34581a0(c34630zM109362a);
        }
        C34581a0 c34581a0M8093R = m8093R();
        boolean zEquals2 = c34581a0M8093R.equals(this.f11147q0);
        this.f11147q0 = c34581a0M8093R;
        boolean z14 = c2822c2.f11056l != c2822c1.f11056l;
        boolean z15 = c2822c2.f11049e != c2822c1.f11049e;
        if (z15 || z14) {
            m8090K0();
        }
        boolean z16 = c2822c2.f11051g != c2822c1.f11051g;
        if (!zEquals) {
            this.f11118N.m121833c(0, new C2869v(c2822c1, i13, 0));
        }
        if (z4) {
            C34605m0 c34605m1 = new C34605m0();
            if (c2822c2.f11045a.m109408p()) {
                i17 = i15;
                obj = null;
                c34626x2 = null;
                obj2 = null;
                i18 = -1;
            } else {
                Object obj5 = c2822c2.f11046b.f92976a;
                c2822c2.f11045a.mo8135g(obj5, c34605m1);
                int i26 = c34605m1.f145693c;
                int iMo8132b = c2822c2.f11045a.mo8132b(obj5);
                obj = c2822c2.f11045a.mo8129m(i26, (C34607n0) this.f475x, 0L).f145701a;
                c34626x2 = ((C34607n0) this.f475x).f145703c;
                obj2 = obj5;
                i17 = i26;
                i18 = iMo8132b;
            }
            if (i14 == 0) {
                if (c2822c2.f11046b.m68054b()) {
                    C23488c0 c23488c2 = c2822c2.f11046b;
                    jM8078j0 = c34605m1.m109392a(c23488c2.f92977b, c23488c2.f92978c);
                    jM8078j1 = m8078j0(c2822c2);
                } else {
                    if (c2822c2.f11046b.f92980e != -1) {
                        jM8078j0 = m8078j0(this.f11111I0);
                    } else {
                        j13 = c34605m1.f145695e;
                        j14 = c34605m1.f145694d;
                        jM8078j0 = j13 + j14;
                    }
                    jM8078j1 = jM8078j0;
                }
            } else if (c2822c2.f11046b.m68054b()) {
                jM8078j0 = c2822c2.f11063s;
                jM8078j1 = m8078j0(c2822c2);
            } else {
                j13 = c34605m1.f145695e;
                j14 = c2822c2.f11063s;
                jM8078j0 = j13 + j14;
                jM8078j1 = jM8078j0;
            }
            long jM121907U = AbstractC38065t.m121907U(jM8078j0);
            long jM121907U2 = AbstractC38065t.m121907U(jM8078j1);
            C23488c0 c23488c3 = c2822c2.f11046b;
            C34597i0 c34597i0 = new C34597i0(obj, i17, c34626x2, obj2, i18, jM121907U, jM121907U2, c23488c3.f92977b, c23488c3.f92978c);
            C34607n0 c34607n1 = (C34607n0) this.f475x;
            int iM8101Z = m8101Z();
            if (this.f11111I0.f11045a.m109408p()) {
                obj3 = null;
                c34626x3 = null;
                obj4 = null;
                i19 = -1;
            } else {
                C2822c1 c2822c3 = this.f11111I0;
                Object obj6 = c2822c3.f11046b.f92976a;
                c2822c3.f11045a.mo8135g(obj6, this.f11120P);
                int iMo8132b2 = this.f11111I0.f11045a.mo8132b(obj6);
                Object obj7 = this.f11111I0.f11045a.mo8129m(iM8101Z, c34607n1, 0L).f145701a;
                c34626x3 = c34607n1.f145703c;
                i19 = iMo8132b2;
                obj4 = obj6;
                obj3 = obj7;
            }
            long jM121907U3 = AbstractC38065t.m121907U(j7);
            long jM121907U4 = this.f11111I0.f11046b.m68054b() ? AbstractC38065t.m121907U(m8078j0(this.f11111I0)) : jM121907U3;
            C23488c0 c23488c4 = this.f11111I0.f11046b;
            this.f11118N.m121833c(11, new C2873x(c34597i0, i14, new C34597i0(obj3, iM8101Z, c34626x3, obj4, i19, jM121907U3, jM121907U4, c23488c4.f92977b, c23488c4.f92978c), 0));
        } else {
            zBooleanValue = zBooleanValue;
            zEquals2 = zEquals2;
            z15 = z15;
        }
        if (zBooleanValue) {
            this.f11118N.m121833c(1, new C2869v(c34626x, iIntValue, 1));
        }
        if (c2822c2.f11050f != c2822c1.f11050f) {
            final int i27 = 8;
            this.f11118N.m121833c(10, new InterfaceC38051f() { // from class: b9.r
                @Override // p607x8.InterfaceC38051f
                /* JADX INFO: renamed from: invoke */
                public final void mo134038invoke(Object obj8) {
                    InterfaceC34595h0 interfaceC34595h0 = (InterfaceC34595h0) obj8;
                    switch (i27) {
                        case 0:
                            interfaceC34595h0.onTracksChanged(c2822c1.f11053i.f111440d);
                            break;
                        case 1:
                            C2822c1 c2822c4 = c2822c1;
                            boolean z17 = c2822c4.f11051g;
                            interfaceC34595h0.getClass();
                            interfaceC34595h0.onIsLoadingChanged(c2822c4.f11051g);
                            break;
                        case 2:
                            C2822c1 c2822c5 = c2822c1;
                            interfaceC34595h0.onPlayerStateChanged(c2822c5.f11056l, c2822c5.f11049e);
                            break;
                        case 3:
                            interfaceC34595h0.onPlaybackStateChanged(c2822c1.f11049e);
                            break;
                        case 4:
                            C2822c1 c2822c6 = c2822c1;
                            interfaceC34595h0.onPlayWhenReadyChanged(c2822c6.f11056l, c2822c6.f11057m);
                            break;
                        case 5:
                            interfaceC34595h0.onPlaybackSuppressionReasonChanged(c2822c1.f11058n);
                            break;
                        case 6:
                            interfaceC34595h0.onIsPlayingChanged(c2822c1.m8046l());
                            break;
                        case 7:
                            interfaceC34595h0.onPlaybackParametersChanged(c2822c1.f11059o);
                            break;
                        case 8:
                            interfaceC34595h0.onPlayerErrorChanged(c2822c1.f11050f);
                            break;
                        default:
                            interfaceC34595h0.onPlayerError(c2822c1.f11050f);
                            break;
                    }
                }
            });
            if (c2822c1.f11050f != null) {
                final int i28 = 9;
                this.f11118N.m121833c(10, new InterfaceC38051f() { // from class: b9.r
                    @Override // p607x8.InterfaceC38051f
                    /* JADX INFO: renamed from: invoke */
                    public final void mo134038invoke(Object obj8) {
                        InterfaceC34595h0 interfaceC34595h0 = (InterfaceC34595h0) obj8;
                        switch (i28) {
                            case 0:
                                interfaceC34595h0.onTracksChanged(c2822c1.f11053i.f111440d);
                                break;
                            case 1:
                                C2822c1 c2822c4 = c2822c1;
                                boolean z17 = c2822c4.f11051g;
                                interfaceC34595h0.getClass();
                                interfaceC34595h0.onIsLoadingChanged(c2822c4.f11051g);
                                break;
                            case 2:
                                C2822c1 c2822c5 = c2822c1;
                                interfaceC34595h0.onPlayerStateChanged(c2822c5.f11056l, c2822c5.f11049e);
                                break;
                            case 3:
                                interfaceC34595h0.onPlaybackStateChanged(c2822c1.f11049e);
                                break;
                            case 4:
                                C2822c1 c2822c6 = c2822c1;
                                interfaceC34595h0.onPlayWhenReadyChanged(c2822c6.f11056l, c2822c6.f11057m);
                                break;
                            case 5:
                                interfaceC34595h0.onPlaybackSuppressionReasonChanged(c2822c1.f11058n);
                                break;
                            case 6:
                                interfaceC34595h0.onIsPlayingChanged(c2822c1.m8046l());
                                break;
                            case 7:
                                interfaceC34595h0.onPlaybackParametersChanged(c2822c1.f11059o);
                                break;
                            case 8:
                                interfaceC34595h0.onPlayerErrorChanged(c2822c1.f11050f);
                                break;
                            default:
                                interfaceC34595h0.onPlayerError(c2822c1.f11050f);
                                break;
                        }
                    }
                });
            }
        }
        C27682v c27682v = c2822c2.f11053i;
        C27682v c27682v2 = c2822c1.f11053i;
        if (c27682v != c27682v2) {
            AbstractC2351b abstractC2351b = this.f11112J;
            Object obj8 = c27682v2.f111441e;
            abstractC2351b.getClass();
            final int i29 = 0;
            this.f11118N.m121833c(2, new InterfaceC38051f() { // from class: b9.r
                @Override // p607x8.InterfaceC38051f
                /* JADX INFO: renamed from: invoke */
                public final void mo134038invoke(Object obj9) {
                    InterfaceC34595h0 interfaceC34595h0 = (InterfaceC34595h0) obj9;
                    switch (i29) {
                        case 0:
                            interfaceC34595h0.onTracksChanged(c2822c1.f11053i.f111440d);
                            break;
                        case 1:
                            C2822c1 c2822c4 = c2822c1;
                            boolean z17 = c2822c4.f11051g;
                            interfaceC34595h0.getClass();
                            interfaceC34595h0.onIsLoadingChanged(c2822c4.f11051g);
                            break;
                        case 2:
                            C2822c1 c2822c5 = c2822c1;
                            interfaceC34595h0.onPlayerStateChanged(c2822c5.f11056l, c2822c5.f11049e);
                            break;
                        case 3:
                            interfaceC34595h0.onPlaybackStateChanged(c2822c1.f11049e);
                            break;
                        case 4:
                            C2822c1 c2822c6 = c2822c1;
                            interfaceC34595h0.onPlayWhenReadyChanged(c2822c6.f11056l, c2822c6.f11057m);
                            break;
                        case 5:
                            interfaceC34595h0.onPlaybackSuppressionReasonChanged(c2822c1.f11058n);
                            break;
                        case 6:
                            interfaceC34595h0.onIsPlayingChanged(c2822c1.m8046l());
                            break;
                        case 7:
                            interfaceC34595h0.onPlaybackParametersChanged(c2822c1.f11059o);
                            break;
                        case 8:
                            interfaceC34595h0.onPlayerErrorChanged(c2822c1.f11050f);
                            break;
                        default:
                            interfaceC34595h0.onPlayerError(c2822c1.f11050f);
                            break;
                    }
                }
            });
        }
        if (!zEquals2) {
            this.f11118N.m121833c(14, new C0680g0(this.f11147q0, 4));
        }
        if (z16) {
            final int i34 = 1;
            this.f11118N.m121833c(3, new InterfaceC38051f() { // from class: b9.r
                @Override // p607x8.InterfaceC38051f
                /* JADX INFO: renamed from: invoke */
                public final void mo134038invoke(Object obj9) {
                    InterfaceC34595h0 interfaceC34595h0 = (InterfaceC34595h0) obj9;
                    switch (i34) {
                        case 0:
                            interfaceC34595h0.onTracksChanged(c2822c1.f11053i.f111440d);
                            break;
                        case 1:
                            C2822c1 c2822c4 = c2822c1;
                            boolean z17 = c2822c4.f11051g;
                            interfaceC34595h0.getClass();
                            interfaceC34595h0.onIsLoadingChanged(c2822c4.f11051g);
                            break;
                        case 2:
                            C2822c1 c2822c5 = c2822c1;
                            interfaceC34595h0.onPlayerStateChanged(c2822c5.f11056l, c2822c5.f11049e);
                            break;
                        case 3:
                            interfaceC34595h0.onPlaybackStateChanged(c2822c1.f11049e);
                            break;
                        case 4:
                            C2822c1 c2822c6 = c2822c1;
                            interfaceC34595h0.onPlayWhenReadyChanged(c2822c6.f11056l, c2822c6.f11057m);
                            break;
                        case 5:
                            interfaceC34595h0.onPlaybackSuppressionReasonChanged(c2822c1.f11058n);
                            break;
                        case 6:
                            interfaceC34595h0.onIsPlayingChanged(c2822c1.m8046l());
                            break;
                        case 7:
                            interfaceC34595h0.onPlaybackParametersChanged(c2822c1.f11059o);
                            break;
                        case 8:
                            interfaceC34595h0.onPlayerErrorChanged(c2822c1.f11050f);
                            break;
                        default:
                            interfaceC34595h0.onPlayerError(c2822c1.f11050f);
                            break;
                    }
                }
            });
        }
        if (z15 || z14) {
            final int i35 = 2;
            this.f11118N.m121833c(-1, new InterfaceC38051f() { // from class: b9.r
                @Override // p607x8.InterfaceC38051f
                /* JADX INFO: renamed from: invoke */
                public final void mo134038invoke(Object obj9) {
                    InterfaceC34595h0 interfaceC34595h0 = (InterfaceC34595h0) obj9;
                    switch (i35) {
                        case 0:
                            interfaceC34595h0.onTracksChanged(c2822c1.f11053i.f111440d);
                            break;
                        case 1:
                            C2822c1 c2822c4 = c2822c1;
                            boolean z17 = c2822c4.f11051g;
                            interfaceC34595h0.getClass();
                            interfaceC34595h0.onIsLoadingChanged(c2822c4.f11051g);
                            break;
                        case 2:
                            C2822c1 c2822c5 = c2822c1;
                            interfaceC34595h0.onPlayerStateChanged(c2822c5.f11056l, c2822c5.f11049e);
                            break;
                        case 3:
                            interfaceC34595h0.onPlaybackStateChanged(c2822c1.f11049e);
                            break;
                        case 4:
                            C2822c1 c2822c6 = c2822c1;
                            interfaceC34595h0.onPlayWhenReadyChanged(c2822c6.f11056l, c2822c6.f11057m);
                            break;
                        case 5:
                            interfaceC34595h0.onPlaybackSuppressionReasonChanged(c2822c1.f11058n);
                            break;
                        case 6:
                            interfaceC34595h0.onIsPlayingChanged(c2822c1.m8046l());
                            break;
                        case 7:
                            interfaceC34595h0.onPlaybackParametersChanged(c2822c1.f11059o);
                            break;
                        case 8:
                            interfaceC34595h0.onPlayerErrorChanged(c2822c1.f11050f);
                            break;
                        default:
                            interfaceC34595h0.onPlayerError(c2822c1.f11050f);
                            break;
                    }
                }
            });
        }
        if (z15) {
            final int i36 = 3;
            this.f11118N.m121833c(4, new InterfaceC38051f() { // from class: b9.r
                @Override // p607x8.InterfaceC38051f
                /* JADX INFO: renamed from: invoke */
                public final void mo134038invoke(Object obj9) {
                    InterfaceC34595h0 interfaceC34595h0 = (InterfaceC34595h0) obj9;
                    switch (i36) {
                        case 0:
                            interfaceC34595h0.onTracksChanged(c2822c1.f11053i.f111440d);
                            break;
                        case 1:
                            C2822c1 c2822c4 = c2822c1;
                            boolean z17 = c2822c4.f11051g;
                            interfaceC34595h0.getClass();
                            interfaceC34595h0.onIsLoadingChanged(c2822c4.f11051g);
                            break;
                        case 2:
                            C2822c1 c2822c5 = c2822c1;
                            interfaceC34595h0.onPlayerStateChanged(c2822c5.f11056l, c2822c5.f11049e);
                            break;
                        case 3:
                            interfaceC34595h0.onPlaybackStateChanged(c2822c1.f11049e);
                            break;
                        case 4:
                            C2822c1 c2822c6 = c2822c1;
                            interfaceC34595h0.onPlayWhenReadyChanged(c2822c6.f11056l, c2822c6.f11057m);
                            break;
                        case 5:
                            interfaceC34595h0.onPlaybackSuppressionReasonChanged(c2822c1.f11058n);
                            break;
                        case 6:
                            interfaceC34595h0.onIsPlayingChanged(c2822c1.m8046l());
                            break;
                        case 7:
                            interfaceC34595h0.onPlaybackParametersChanged(c2822c1.f11059o);
                            break;
                        case 8:
                            interfaceC34595h0.onPlayerErrorChanged(c2822c1.f11050f);
                            break;
                        default:
                            interfaceC34595h0.onPlayerError(c2822c1.f11050f);
                            break;
                    }
                }
            });
        }
        if (z14 || c2822c2.f11057m != c2822c1.f11057m) {
            final int i37 = 4;
            this.f11118N.m121833c(5, new InterfaceC38051f() { // from class: b9.r
                @Override // p607x8.InterfaceC38051f
                /* JADX INFO: renamed from: invoke */
                public final void mo134038invoke(Object obj9) {
                    InterfaceC34595h0 interfaceC34595h0 = (InterfaceC34595h0) obj9;
                    switch (i37) {
                        case 0:
                            interfaceC34595h0.onTracksChanged(c2822c1.f11053i.f111440d);
                            break;
                        case 1:
                            C2822c1 c2822c4 = c2822c1;
                            boolean z17 = c2822c4.f11051g;
                            interfaceC34595h0.getClass();
                            interfaceC34595h0.onIsLoadingChanged(c2822c4.f11051g);
                            break;
                        case 2:
                            C2822c1 c2822c5 = c2822c1;
                            interfaceC34595h0.onPlayerStateChanged(c2822c5.f11056l, c2822c5.f11049e);
                            break;
                        case 3:
                            interfaceC34595h0.onPlaybackStateChanged(c2822c1.f11049e);
                            break;
                        case 4:
                            C2822c1 c2822c6 = c2822c1;
                            interfaceC34595h0.onPlayWhenReadyChanged(c2822c6.f11056l, c2822c6.f11057m);
                            break;
                        case 5:
                            interfaceC34595h0.onPlaybackSuppressionReasonChanged(c2822c1.f11058n);
                            break;
                        case 6:
                            interfaceC34595h0.onIsPlayingChanged(c2822c1.m8046l());
                            break;
                        case 7:
                            interfaceC34595h0.onPlaybackParametersChanged(c2822c1.f11059o);
                            break;
                        case 8:
                            interfaceC34595h0.onPlayerErrorChanged(c2822c1.f11050f);
                            break;
                        default:
                            interfaceC34595h0.onPlayerError(c2822c1.f11050f);
                            break;
                    }
                }
            });
        }
        if (c2822c2.f11058n != c2822c1.f11058n) {
            final int i38 = 5;
            this.f11118N.m121833c(6, new InterfaceC38051f() { // from class: b9.r
                @Override // p607x8.InterfaceC38051f
                /* JADX INFO: renamed from: invoke */
                public final void mo134038invoke(Object obj9) {
                    InterfaceC34595h0 interfaceC34595h0 = (InterfaceC34595h0) obj9;
                    switch (i38) {
                        case 0:
                            interfaceC34595h0.onTracksChanged(c2822c1.f11053i.f111440d);
                            break;
                        case 1:
                            C2822c1 c2822c4 = c2822c1;
                            boolean z17 = c2822c4.f11051g;
                            interfaceC34595h0.getClass();
                            interfaceC34595h0.onIsLoadingChanged(c2822c4.f11051g);
                            break;
                        case 2:
                            C2822c1 c2822c5 = c2822c1;
                            interfaceC34595h0.onPlayerStateChanged(c2822c5.f11056l, c2822c5.f11049e);
                            break;
                        case 3:
                            interfaceC34595h0.onPlaybackStateChanged(c2822c1.f11049e);
                            break;
                        case 4:
                            C2822c1 c2822c6 = c2822c1;
                            interfaceC34595h0.onPlayWhenReadyChanged(c2822c6.f11056l, c2822c6.f11057m);
                            break;
                        case 5:
                            interfaceC34595h0.onPlaybackSuppressionReasonChanged(c2822c1.f11058n);
                            break;
                        case 6:
                            interfaceC34595h0.onIsPlayingChanged(c2822c1.m8046l());
                            break;
                        case 7:
                            interfaceC34595h0.onPlaybackParametersChanged(c2822c1.f11059o);
                            break;
                        case 8:
                            interfaceC34595h0.onPlayerErrorChanged(c2822c1.f11050f);
                            break;
                        default:
                            interfaceC34595h0.onPlayerError(c2822c1.f11050f);
                            break;
                    }
                }
            });
        }
        if (c2822c2.m8046l() != c2822c1.m8046l()) {
            final int i39 = 6;
            this.f11118N.m121833c(7, new InterfaceC38051f() { // from class: b9.r
                @Override // p607x8.InterfaceC38051f
                /* JADX INFO: renamed from: invoke */
                public final void mo134038invoke(Object obj9) {
                    InterfaceC34595h0 interfaceC34595h0 = (InterfaceC34595h0) obj9;
                    switch (i39) {
                        case 0:
                            interfaceC34595h0.onTracksChanged(c2822c1.f11053i.f111440d);
                            break;
                        case 1:
                            C2822c1 c2822c4 = c2822c1;
                            boolean z17 = c2822c4.f11051g;
                            interfaceC34595h0.getClass();
                            interfaceC34595h0.onIsLoadingChanged(c2822c4.f11051g);
                            break;
                        case 2:
                            C2822c1 c2822c5 = c2822c1;
                            interfaceC34595h0.onPlayerStateChanged(c2822c5.f11056l, c2822c5.f11049e);
                            break;
                        case 3:
                            interfaceC34595h0.onPlaybackStateChanged(c2822c1.f11049e);
                            break;
                        case 4:
                            C2822c1 c2822c6 = c2822c1;
                            interfaceC34595h0.onPlayWhenReadyChanged(c2822c6.f11056l, c2822c6.f11057m);
                            break;
                        case 5:
                            interfaceC34595h0.onPlaybackSuppressionReasonChanged(c2822c1.f11058n);
                            break;
                        case 6:
                            interfaceC34595h0.onIsPlayingChanged(c2822c1.m8046l());
                            break;
                        case 7:
                            interfaceC34595h0.onPlaybackParametersChanged(c2822c1.f11059o);
                            break;
                        case 8:
                            interfaceC34595h0.onPlayerErrorChanged(c2822c1.f11050f);
                            break;
                        default:
                            interfaceC34595h0.onPlayerError(c2822c1.f11050f);
                            break;
                    }
                }
            });
        }
        if (!c2822c2.f11059o.equals(c2822c1.f11059o)) {
            final int i44 = 7;
            this.f11118N.m121833c(12, new InterfaceC38051f() { // from class: b9.r
                @Override // p607x8.InterfaceC38051f
                /* JADX INFO: renamed from: invoke */
                public final void mo134038invoke(Object obj9) {
                    InterfaceC34595h0 interfaceC34595h0 = (InterfaceC34595h0) obj9;
                    switch (i44) {
                        case 0:
                            interfaceC34595h0.onTracksChanged(c2822c1.f11053i.f111440d);
                            break;
                        case 1:
                            C2822c1 c2822c4 = c2822c1;
                            boolean z17 = c2822c4.f11051g;
                            interfaceC34595h0.getClass();
                            interfaceC34595h0.onIsLoadingChanged(c2822c4.f11051g);
                            break;
                        case 2:
                            C2822c1 c2822c5 = c2822c1;
                            interfaceC34595h0.onPlayerStateChanged(c2822c5.f11056l, c2822c5.f11049e);
                            break;
                        case 3:
                            interfaceC34595h0.onPlaybackStateChanged(c2822c1.f11049e);
                            break;
                        case 4:
                            C2822c1 c2822c6 = c2822c1;
                            interfaceC34595h0.onPlayWhenReadyChanged(c2822c6.f11056l, c2822c6.f11057m);
                            break;
                        case 5:
                            interfaceC34595h0.onPlaybackSuppressionReasonChanged(c2822c1.f11058n);
                            break;
                        case 6:
                            interfaceC34595h0.onIsPlayingChanged(c2822c1.m8046l());
                            break;
                        case 7:
                            interfaceC34595h0.onPlaybackParametersChanged(c2822c1.f11059o);
                            break;
                        case 8:
                            interfaceC34595h0.onPlayerErrorChanged(c2822c1.f11050f);
                            break;
                        default:
                            interfaceC34595h0.onPlayerError(c2822c1.f11050f);
                            break;
                    }
                }
            });
        }
        m8087H0();
        this.f11118N.m121832b();
        if (c2822c2.f11060p != c2822c1.f11060p) {
            Iterator it = this.f11119O.iterator();
            while (it.hasNext()) {
                ((SurfaceHolderCallbackC2821c0) it.next()).f11043w.m8090K0();
            }
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final void m8090K0() {
        int iM8110i0 = m8110i0();
        C2852m1 c2852m1 = this.f11135e0;
        C2852m1 c2852m2 = this.f11134d0;
        boolean z4 = false;
        if (iM8110i0 != 1) {
            if (iM8110i0 == 2 || iM8110i0 == 3) {
                m8091L0();
                boolean z13 = this.f11111I0.f11060p;
                if (m8108g0() && !z13) {
                    z4 = true;
                }
                c2852m2.m8249d(z4);
                c2852m1.m8249d(m8108g0());
                return;
            }
            if (iM8110i0 != 4) {
                throw new IllegalStateException();
            }
        }
        c2852m2.m8249d(false);
        c2852m1.m8249d(false);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m8091L0() {
        this.f11102E.m8246a();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f11125U;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            int i13 = AbstractC38065t.f163031a;
            Locale locale = Locale.US;
            String strM8300m = AbstractC2875y.m8300m("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f11100C0) {
                throw new IllegalStateException(strM8300m);
            }
            AbstractC38046a.m121827v("ExoPlayerImpl", strM8300m, this.f11101D0 ? null : new IllegalStateException());
            this.f11101D0 = true;
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m8092Q(InterfaceC34595h0 interfaceC34595h0) {
        interfaceC34595h0.getClass();
        this.f11118N.m121831a(interfaceC34595h0);
    }

    /* JADX INFO: renamed from: R */
    public final C34581a0 m8093R() {
        AbstractC34609o0 abstractC34609o0M8104c0 = m8104c0();
        if (abstractC34609o0M8104c0.m109408p()) {
            return this.f11109H0;
        }
        C34626x c34626x = abstractC34609o0M8104c0.mo8129m(m8101Z(), (C34607n0) this.f475x, 0L).f145703c;
        C34630z c34630zM109362a = this.f11109H0.m109362a();
        C34581a0 c34581a0 = c34626x.f145869d;
        if (c34581a0 != null) {
            AbstractC41023g0 abstractC41023g0 = c34581a0.f145609A;
            byte[] bArr = c34581a0.f145615f;
            CharSequence charSequence = c34581a0.f145610a;
            if (charSequence != null) {
                c34630zM109362a.f145878a = charSequence;
            }
            CharSequence charSequence2 = c34581a0.f145611b;
            if (charSequence2 != null) {
                c34630zM109362a.f145879b = charSequence2;
            }
            CharSequence charSequence3 = c34581a0.f145612c;
            if (charSequence3 != null) {
                c34630zM109362a.f145880c = charSequence3;
            }
            CharSequence charSequence4 = c34581a0.f145613d;
            if (charSequence4 != null) {
                c34630zM109362a.f145881d = charSequence4;
            }
            CharSequence charSequence5 = c34581a0.f145614e;
            if (charSequence5 != null) {
                c34630zM109362a.f145882e = charSequence5;
            }
            if (bArr != null) {
                Integer num = c34581a0.f145616g;
                c34630zM109362a.f145883f = bArr == null ? null : (byte[]) bArr.clone();
                c34630zM109362a.f145884g = num;
            }
            Integer num2 = c34581a0.f145617h;
            if (num2 != null) {
                c34630zM109362a.f145885h = num2;
            }
            Integer num3 = c34581a0.f145618i;
            if (num3 != null) {
                c34630zM109362a.f145886i = num3;
            }
            Integer num4 = c34581a0.f145619j;
            if (num4 != null) {
                c34630zM109362a.f145887j = num4;
            }
            Boolean bool = c34581a0.f145620k;
            if (bool != null) {
                c34630zM109362a.f145888k = bool;
            }
            Integer num5 = c34581a0.f145621l;
            if (num5 != null) {
                c34630zM109362a.f145889l = num5;
            }
            Integer num6 = c34581a0.f145622m;
            if (num6 != null) {
                c34630zM109362a.f145889l = num6;
            }
            Integer num7 = c34581a0.f145623n;
            if (num7 != null) {
                c34630zM109362a.f145890m = num7;
            }
            Integer num8 = c34581a0.f145624o;
            if (num8 != null) {
                c34630zM109362a.f145891n = num8;
            }
            Integer num9 = c34581a0.f145625p;
            if (num9 != null) {
                c34630zM109362a.f145892o = num9;
            }
            Integer num10 = c34581a0.f145626q;
            if (num10 != null) {
                c34630zM109362a.f145893p = num10;
            }
            Integer num11 = c34581a0.f145627r;
            if (num11 != null) {
                c34630zM109362a.f145894q = num11;
            }
            CharSequence charSequence6 = c34581a0.f145628s;
            if (charSequence6 != null) {
                c34630zM109362a.f145895r = charSequence6;
            }
            CharSequence charSequence7 = c34581a0.f145629t;
            if (charSequence7 != null) {
                c34630zM109362a.f145896s = charSequence7;
            }
            CharSequence charSequence8 = c34581a0.f145630u;
            if (charSequence8 != null) {
                c34630zM109362a.f145897t = charSequence8;
            }
            Integer num12 = c34581a0.f145631v;
            if (num12 != null) {
                c34630zM109362a.f145898u = num12;
            }
            Integer num13 = c34581a0.f145632w;
            if (num13 != null) {
                c34630zM109362a.f145899v = num13;
            }
            CharSequence charSequence9 = c34581a0.f145633x;
            if (charSequence9 != null) {
                c34630zM109362a.f145900w = charSequence9;
            }
            CharSequence charSequence10 = c34581a0.f145634y;
            if (charSequence10 != null) {
                c34630zM109362a.f145901x = charSequence10;
            }
            Integer num14 = c34581a0.f145635z;
            if (num14 != null) {
                c34630zM109362a.f145902y = num14;
            }
            if (!abstractC41023g0.isEmpty()) {
                c34630zM109362a.f145903z = AbstractC41023g0.m133252m(abstractC41023g0);
            }
        }
        return new C34581a0(c34630zM109362a);
    }

    /* JADX INFO: renamed from: S */
    public final void m8094S() {
        m8091L0();
        m8120u0();
        m8084E0(null);
        m8115p0(0, 0);
    }

    /* JADX INFO: renamed from: T */
    public final ArrayList m8095T(C41060w0 c41060w0) {
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < c41060w0.f177069z; i13++) {
            arrayList.add(this.f11123S.mo5056b((C34626x) c41060w0.get(i13)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: U */
    public final C2831f1 m8096U(InterfaceC2828e1 interfaceC2828e1) {
        int iM8106e0 = m8106e0(this.f11111I0);
        AbstractC34609o0 abstractC34609o0 = this.f11111I0.f11045a;
        if (iM8106e0 == -1) {
            iM8106e0 = 0;
        }
        C2848l0 c2848l0 = this.f11117M;
        return new C2831f1(c2848l0, interfaceC2828e1, abstractC34609o0, iM8106e0, c2848l0.f11263J);
    }

    /* JADX INFO: renamed from: V */
    public final long m8097V() {
        m8091L0();
        if (this.f11111I0.f11045a.m109408p()) {
            return this.f11115K0;
        }
        C2822c1 c2822c1 = this.f11111I0;
        long j7 = 0;
        if (c2822c1.f11055k.f92979d != c2822c1.f11046b.f92979d) {
            return AbstractC38065t.m121907U(c2822c1.f11045a.mo8129m(m8101Z(), (C34607n0) this.f475x, 0L).f145713m);
        }
        long j13 = c2822c1.f11061q;
        if (this.f11111I0.f11055k.m68054b()) {
            C2822c1 c2822c2 = this.f11111I0;
            c2822c2.f11045a.mo8135g(c2822c2.f11055k.f92976a, this.f11120P).m109395d(this.f11111I0.f11055k.f92977b);
        } else {
            j7 = j13;
        }
        C2822c1 c2822c3 = this.f11111I0;
        AbstractC34609o0 abstractC34609o0 = c2822c3.f11045a;
        Object obj = c2822c3.f11055k.f92976a;
        C34605m0 c34605m0 = this.f11120P;
        abstractC34609o0.mo8135g(obj, c34605m0);
        return AbstractC38065t.m121907U(j7 + c34605m0.f145695e);
    }

    /* JADX INFO: renamed from: W */
    public final long m8098W(C2822c1 c2822c1) {
        C23488c0 c23488c0 = c2822c1.f11046b;
        long j7 = c2822c1.f11047c;
        AbstractC34609o0 abstractC34609o0 = c2822c1.f11045a;
        if (!c23488c0.m68054b()) {
            return AbstractC38065t.m121907U(m8103b0(c2822c1));
        }
        Object obj = c2822c1.f11046b.f92976a;
        C34605m0 c34605m0 = this.f11120P;
        abstractC34609o0.mo8135g(obj, c34605m0);
        if (j7 == -9223372036854775807L) {
            return AbstractC38065t.m121907U(abstractC34609o0.mo8129m(m8106e0(c2822c1), (C34607n0) this.f475x, 0L).f145712l);
        }
        return AbstractC38065t.m121907U(j7) + AbstractC38065t.m121907U(c34605m0.f145695e);
    }

    /* JADX INFO: renamed from: X */
    public final int m8099X() {
        m8091L0();
        if (m8112l0()) {
            return this.f11111I0.f11046b.f92977b;
        }
        return -1;
    }

    /* JADX INFO: renamed from: Y */
    public final int m8100Y() {
        m8091L0();
        if (m8112l0()) {
            return this.f11111I0.f11046b.f92978c;
        }
        return -1;
    }

    /* JADX INFO: renamed from: Z */
    public final int m8101Z() {
        m8091L0();
        int iM8106e0 = m8106e0(this.f11111I0);
        if (iM8106e0 == -1) {
            return 0;
        }
        return iM8106e0;
    }

    /* JADX INFO: renamed from: a0 */
    public final long m8102a0() {
        m8091L0();
        return AbstractC38065t.m121907U(m8103b0(this.f11111I0));
    }

    /* JADX INFO: renamed from: b0 */
    public final long m8103b0(C2822c1 c2822c1) {
        if (c2822c1.f11045a.m109408p()) {
            return AbstractC38065t.m121896J(this.f11115K0);
        }
        long jM8045k = c2822c1.f11060p ? c2822c1.m8045k() : c2822c1.f11063s;
        if (c2822c1.f11046b.m68054b()) {
            return jM8045k;
        }
        AbstractC34609o0 abstractC34609o0 = c2822c1.f11045a;
        Object obj = c2822c1.f11046b.f92976a;
        C34605m0 c34605m0 = this.f11120P;
        abstractC34609o0.mo8135g(obj, c34605m0);
        return jM8045k + c34605m0.f145695e;
    }

    /* JADX INFO: renamed from: c0 */
    public final AbstractC34609o0 m8104c0() {
        m8091L0();
        return this.f11111I0.f11045a;
    }

    /* JADX INFO: renamed from: d0 */
    public final C34623v0 m8105d0() {
        m8091L0();
        return this.f11111I0.f11053i.f111440d;
    }

    /* JADX INFO: renamed from: e0 */
    public final int m8106e0(C2822c1 c2822c1) {
        return c2822c1.f11045a.m109408p() ? this.f11113J0 : c2822c1.f11045a.mo8135g(c2822c1.f11046b.f92976a, this.f11120P).f145693c;
    }

    /* JADX INFO: renamed from: f0 */
    public final long m8107f0() {
        m8091L0();
        if (!m8112l0()) {
            return m399x();
        }
        C2822c1 c2822c1 = this.f11111I0;
        C23488c0 c23488c0 = c2822c1.f11046b;
        AbstractC34609o0 abstractC34609o0 = c2822c1.f11045a;
        Object obj = c23488c0.f92976a;
        C34605m0 c34605m0 = this.f11120P;
        abstractC34609o0.mo8135g(obj, c34605m0);
        return AbstractC38065t.m121907U(c34605m0.m109392a(c23488c0.f92977b, c23488c0.f92978c));
    }

    /* JADX INFO: renamed from: g0 */
    public final boolean m8108g0() {
        m8091L0();
        return this.f11111I0.f11056l;
    }

    /* JADX INFO: renamed from: h0 */
    public final C34589e0 m8109h0() {
        m8091L0();
        return this.f11111I0.f11059o;
    }

    /* JADX INFO: renamed from: i0 */
    public final int m8110i0() {
        m8091L0();
        return this.f11111I0.f11049e;
    }

    /* JADX INFO: renamed from: k0 */
    public final C27670j m8111k0() {
        m8091L0();
        return ((C27677q) this.f11112J).m83674N();
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m8112l0() {
        m8091L0();
        return this.f11111I0.f11046b.m68054b();
    }

    /* JADX INFO: renamed from: n0 */
    public final C2822c1 m8113n0(C2822c1 c2822c1, AbstractC34609o0 abstractC34609o0, Pair pair) {
        List list;
        AbstractC35849g.m113802d(abstractC34609o0.m109408p() || pair != null);
        AbstractC34609o0 abstractC34609o1 = c2822c1.f11045a;
        long jM8098W = m8098W(c2822c1);
        C2822c1 c2822c1M8044i = c2822c1.m8044i(abstractC34609o0);
        if (abstractC34609o0.m109408p()) {
            C23488c0 c23488c0 = C2822c1.f11044u;
            long jM121896J = AbstractC38065t.m121896J(this.f11115K0);
            C2822c1 c2822c1M8038c = c2822c1M8044i.m8039d(c23488c0, jM121896J, jM121896J, jM121896J, 0L, C23501g1.f93026d, this.f11155y, C41060w0.f177067E).m8038c(c23488c0);
            c2822c1M8038c.f11061q = c2822c1M8038c.f11063s;
            return c2822c1M8038c;
        }
        Object obj = c2822c1M8044i.f11046b.f92976a;
        boolean zEquals = obj.equals(pair.first);
        C23488c0 c23488c1 = !zEquals ? new C23488c0(pair.first) : c2822c1M8044i.f11046b;
        long jLongValue = ((Long) pair.second).longValue();
        long jM121896J2 = AbstractC38065t.m121896J(jM8098W);
        if (!abstractC34609o1.m109408p()) {
            jM121896J2 -= abstractC34609o1.mo8135g(obj, this.f11120P).f145695e;
        }
        if (!zEquals || jLongValue < jM121896J2) {
            C23488c0 c23488c2 = c23488c1;
            AbstractC35849g.m113807i(!c23488c2.m68054b());
            C23501g1 c23501g1 = !zEquals ? C23501g1.f93026d : c2822c1M8044i.f11052h;
            C27682v c27682v = !zEquals ? this.f11155y : c2822c1M8044i.f11053i;
            if (zEquals) {
                list = c2822c1M8044i.f11054j;
            } else {
                C41017e0 c41017e0 = AbstractC41023g0.f176998x;
                list = C41060w0.f177067E;
            }
            C2822c1 c2822c1M8038c2 = c2822c1M8044i.m8039d(c23488c2, jLongValue, jLongValue, jLongValue, 0L, c23501g1, c27682v, list).m8038c(c23488c2);
            c2822c1M8038c2.f11061q = jLongValue;
            return c2822c1M8038c2;
        }
        if (jLongValue != jM121896J2) {
            C23488c0 c23488c3 = c23488c1;
            AbstractC35849g.m113807i(!c23488c3.m68054b());
            long jMax = Math.max(0L, c2822c1M8044i.f11062r - (jLongValue - jM121896J2));
            long j7 = c2822c1M8044i.f11061q;
            if (c2822c1M8044i.f11055k.equals(c2822c1M8044i.f11046b)) {
                j7 = jLongValue + jMax;
            }
            C2822c1 c2822c1M8039d = c2822c1M8044i.m8039d(c23488c3, jLongValue, jLongValue, jLongValue, jMax, c2822c1M8044i.f11052h, c2822c1M8044i.f11053i, c2822c1M8044i.f11054j);
            c2822c1M8039d.f11061q = j7;
            return c2822c1M8039d;
        }
        int iMo8132b = abstractC34609o0.mo8132b(c2822c1M8044i.f11055k.f92976a);
        if (iMo8132b != -1 && abstractC34609o0.mo8128f(iMo8132b, this.f11120P, false).f145693c == abstractC34609o0.mo8135g(c23488c1.f92976a, this.f11120P).f145693c) {
            return c2822c1M8044i;
        }
        abstractC34609o0.mo8135g(c23488c1.f92976a, this.f11120P);
        long jM109392a = c23488c1.m68054b() ? this.f11120P.m109392a(c23488c1.f92977b, c23488c1.f92978c) : this.f11120P.f145694d;
        C23488c0 c23488c4 = c23488c1;
        C2822c1 c2822c1M8038c3 = c2822c1M8044i.m8039d(c23488c4, c2822c1M8044i.f11063s, c2822c1M8044i.f11063s, c2822c1M8044i.f11048d, jM109392a - c2822c1M8044i.f11063s, c2822c1M8044i.f11052h, c2822c1M8044i.f11053i, c2822c1M8044i.f11054j).m8038c(c23488c4);
        c2822c1M8038c3.f11061q = jM109392a;
        return c2822c1M8038c3;
    }

    /* JADX INFO: renamed from: o0 */
    public final Pair m8114o0(AbstractC34609o0 abstractC34609o0, int i13, long j7) {
        if (abstractC34609o0.m109408p()) {
            this.f11113J0 = i13;
            if (j7 == -9223372036854775807L) {
                j7 = 0;
            }
            this.f11115K0 = j7;
            return null;
        }
        if (i13 == -1 || i13 >= abstractC34609o0.mo8139o()) {
            i13 = abstractC34609o0.mo8131a(this.f11139i0);
            j7 = AbstractC38065t.m121907U(abstractC34609o0.mo8129m(i13, (C34607n0) this.f475x, 0L).f145712l);
        }
        return abstractC34609o0.m109405i((C34607n0) this.f475x, this.f11120P, i13, AbstractC38065t.m121896J(j7));
    }

    /* JADX INFO: renamed from: p0 */
    public final void m8115p0(int i13, int i14) {
        C38060o c38060o = this.f11156y0;
        if (i13 == c38060o.f163021a && i14 == c38060o.f163022b) {
            return;
        }
        this.f11156y0 = new C38060o(i13, i14);
        this.f11118N.m121835e(24, new C2863s(i13, i14, 0));
        m8121v0(2, 14, new C38060o(i13, i14));
    }

    /* JADX INFO: renamed from: q0 */
    public final void m8116q0() {
        m8091L0();
        C2822c1 c2822c1 = this.f11111I0;
        if (c2822c1.f11049e != 1) {
            return;
        }
        C2822c1 c2822c1M8041f = c2822c1.m8041f(null);
        C2822c1 c2822c1M8079m0 = m8079m0(c2822c1M8041f, c2822c1M8041f.f11045a.m109408p() ? 4 : 2);
        this.f11140j0++;
        C38063r c38063r = this.f11117M.f11261H;
        c38063r.getClass();
        C38062q c38062qM121877b = C38063r.m121877b();
        c38062qM121877b.f163024a = c38063r.f163026a.obtainMessage(29);
        c38062qM121877b.m121876b();
        m8089J0(c2822c1M8079m0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m8117r0() {
        String str;
        int i13;
        boolean z4;
        StringBuilder sb4 = new StringBuilder("Release ");
        sb4.append(Integer.toHexString(System.identityHashCode(this)));
        sb4.append(" [AndroidXMedia3/1.6.1] [");
        sb4.append(AbstractC38065t.f163032b);
        sb4.append("] [");
        HashSet hashSet = AbstractC34628y.f145872a;
        synchronized (AbstractC34628y.class) {
            str = AbstractC34628y.f145873b;
        }
        sb4.append(str);
        sb4.append("]");
        AbstractC38046a.m121818m("ExoPlayerImpl", sb4.toString());
        m8091L0();
        this.f11133c0.m8022z();
        this.f11134d0.m8249d(false);
        this.f11135e0.m8249d(false);
        C2848l0 c2848l0 = this.f11117M;
        synchronized (c2848l0) {
            i13 = 7;
            int i14 = 1;
            if (c2848l0.f11283d0 || !c2848l0.f11263J.getThread().isAlive()) {
                z4 = true;
            } else {
                c2848l0.f11261H.m121881e(7);
                c2848l0.m8241w0(new C2853n(c2848l0, i14), c2848l0.f11274U);
                z4 = c2848l0.f11283d0;
            }
        }
        if (!z4) {
            this.f11118N.m121835e(10, new C0667a(i13));
        }
        this.f11118N.m121834d();
        this.f11114K.f163026a.removeCallbacksAndMessages(null);
        InterfaceC28980d interfaceC28980d = this.f11126V;
        C4317h c4317h = this.f11124T;
        CopyOnWriteArrayList<C28979c> copyOnWriteArrayList = ((C28982f) interfaceC28980d).f117232c.f88960a;
        for (C28979c c28979c : copyOnWriteArrayList) {
            if (c28979c.f117220b == c4317h) {
                c28979c.f117221c = true;
                copyOnWriteArrayList.remove(c28979c);
            }
        }
        C2822c1 c2822c1 = this.f11111I0;
        if (c2822c1.f11060p) {
            this.f11111I0 = c2822c1.m8036a();
        }
        C2822c1 c2822c1M8079m0 = m8079m0(this.f11111I0, 1);
        this.f11111I0 = c2822c1M8079m0;
        C2822c1 c2822c1M8038c = c2822c1M8079m0.m8038c(c2822c1M8079m0.f11046b);
        this.f11111I0 = c2822c1M8038c;
        c2822c1M8038c.f11061q = c2822c1M8038c.f11063s;
        this.f11111I0.f11062r = 0L;
        C4317h c4317h2 = this.f11124T;
        C38063r c38063r = c4317h2.f17518H;
        AbstractC35849g.m113808j(c38063r);
        c38063r.m121879c(new RunnableC1319m(c4317h2, 11));
        m8120u0();
        Surface surface = this.f11149s0;
        if (surface != null) {
            surface.release();
            this.f11149s0 = null;
        }
        this.f11099B0 = C36933c.f158062b;
        this.f11105F0 = true;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m8118s0(InterfaceC34595h0 interfaceC34595h0) {
        m8091L0();
        interfaceC34595h0.getClass();
        C38054i c38054i = this.f11118N;
        c38054i.m121836f();
        CopyOnWriteArraySet<C38053h> copyOnWriteArraySet = c38054i.f162998d;
        for (C38053h c38053h : copyOnWriteArraySet) {
            if (c38053h.f162991a.equals(interfaceC34595h0)) {
                InterfaceC38052g interfaceC38052g = c38054i.f162997c;
                c38053h.f162994d = true;
                if (c38053h.f162993c) {
                    c38053h.f162993c = false;
                    interfaceC38052g.mo1654a(c38053h.f162991a, c38053h.f162992b.m71594c());
                }
                copyOnWriteArraySet.remove(c38053h);
            }
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        m8091L0();
        m8121v0(4, 15, imageOutput);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m8119t0(int i13) {
        for (int i14 = i13 - 1; i14 >= 0; i14--) {
            this.f11121Q.remove(i14);
        }
        C23489c1 c23489c1 = this.f11144n0;
        int[] iArr = c23489c1.f92982b;
        int[] iArr2 = new int[iArr.length - i13];
        int i15 = 0;
        for (int i16 = 0; i16 < iArr.length; i16++) {
            int i17 = iArr[i16];
            if (i17 < 0 || i17 >= i13) {
                int i18 = i16 - i15;
                if (i17 >= 0) {
                    i17 -= i13;
                }
                iArr2[i18] = i17;
            } else {
                i15++;
            }
        }
        this.f11144n0 = new C23489c1(iArr2, new Random(c23489c1.f92981a.nextLong()));
    }

    /* JADX INFO: renamed from: u0 */
    public final void m8120u0() {
        C32284i c32284i = this.f11151u0;
        SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c0 = this.f11131a0;
        if (c32284i != null) {
            C2831f1 c2831f1M8096U = m8096U(this.f11132b0);
            AbstractC35849g.m113807i(!c2831f1M8096U.f11164f);
            c2831f1M8096U.f11161c = InterfaceC33561b.INVALID_OWNERSHIP;
            AbstractC35849g.m113807i(!c2831f1M8096U.f11164f);
            c2831f1M8096U.f11162d = null;
            c2831f1M8096U.m8127b();
            this.f11151u0.f133615w.remove(surfaceHolderCallbackC2821c0);
            this.f11151u0 = null;
        }
        TextureView textureView = this.f11153w0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != surfaceHolderCallbackC2821c0) {
                AbstractC38046a.m121826u("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f11153w0.setSurfaceTextureListener(null);
            }
            this.f11153w0 = null;
        }
        SurfaceHolder surfaceHolder = this.f11150t0;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(surfaceHolderCallbackC2821c0);
            this.f11150t0 = null;
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m8121v0(int i13, int i14, Object obj) {
        for (AbstractC2829f abstractC2829f : this.f11108H) {
            if (i13 == -1 || abstractC2829f.f11095x == i13) {
                C2831f1 c2831f1M8096U = m8096U(abstractC2829f);
                AbstractC35849g.m113807i(!c2831f1M8096U.f11164f);
                c2831f1M8096U.f11161c = i14;
                AbstractC35849g.m113807i(!c2831f1M8096U.f11164f);
                c2831f1M8096U.f11162d = obj;
                c2831f1M8096U.m8127b();
            }
        }
        for (AbstractC2829f abstractC2829f2 : this.f11110I) {
            if (abstractC2829f2 != null && (i13 == -1 || abstractC2829f2.f11095x == i13)) {
                C2831f1 c2831f1M8096U2 = m8096U(abstractC2829f2);
                AbstractC35849g.m113807i(!c2831f1M8096U2.f11164f);
                c2831f1M8096U2.f11161c = i14;
                AbstractC35849g.m113807i(!c2831f1M8096U2.f11164f);
                c2831f1M8096U2.f11162d = obj;
                c2831f1M8096U2.m8127b();
            }
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m8122w0(AbstractC23481a abstractC23481a) {
        m8091L0();
        List listSingletonList = Collections.singletonList(abstractC23481a);
        m8091L0();
        m8091L0();
        m8123x0(listSingletonList, -1, -9223372036854775807L, true);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00dd  */
    /* JADX INFO: renamed from: x0 */
    public final void m8123x0(List list, int i13, long j7, boolean z4) {
        long j13;
        int i14;
        int i15;
        C2822c1 c2822c1M8079m0;
        boolean z13;
        int iMo8131a = i13;
        int iM8106e0 = m8106e0(this.f11111I0);
        long jM8102a0 = m8102a0();
        this.f11140j0++;
        ArrayList arrayList = this.f11121Q;
        if (!arrayList.isEmpty()) {
            m8119t0(arrayList.size());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i16 = 0; i16 < list.size(); i16++) {
            C2816a1 c2816a1 = new C2816a1((AbstractC23481a) list.get(i16), this.f11122R);
            arrayList2.add(c2816a1);
            arrayList.add(i16, new C2827e0(c2816a1.f11016b, c2816a1.f11015a));
        }
        this.f11144n0 = this.f11144n0.m68055a(arrayList2.size());
        C2837h1 c2837h1 = new C2837h1(arrayList, this.f11144n0);
        boolean zM109408p = c2837h1.m109408p();
        int i17 = c2837h1.f11192d;
        if (!zM109408p && iMo8131a >= i17) {
            throw new IllegalSeekPositionException();
        }
        if (!z4) {
            if (iMo8131a == -1) {
                i14 = iM8106e0;
                j13 = jM8102a0;
            } else {
                j13 = j7;
            }
            C2822c1 c2822c1M8113n0 = m8113n0(this.f11111I0, c2837h1, m8114o0(c2837h1, i14, j13));
            i15 = c2822c1M8113n0.f11049e;
            if (i14 != -1 && i15 != 1) {
                if (!c2837h1.m109408p() || i14 >= i17) {
                    i15 = 4;
                } else {
                    i15 = 2;
                }
            }
            c2822c1M8079m0 = m8079m0(c2822c1M8113n0, i15);
            this.f11117M.f11261H.m121878a(17, new C2839i0(arrayList2, this.f11144n0, i14, AbstractC38065t.m121896J(j13))).m121876b();
            if (!this.f11111I0.f11046b.f92976a.equals(c2822c1M8079m0.f11046b.f92976a) || this.f11111I0.f11045a.m109408p()) {
                z13 = false;
            } else {
                z13 = true;
            }
            m8089J0(c2822c1M8079m0, 0, z13, 4, m8103b0(c2822c1M8079m0), -1, false);
        }
        iMo8131a = c2837h1.mo8131a(this.f11139i0);
        j13 = -9223372036854775807L;
        i14 = iMo8131a;
        C2822c1 c2822c1M8113n1 = m8113n0(this.f11111I0, c2837h1, m8114o0(c2837h1, i14, j13));
        i15 = c2822c1M8113n1.f11049e;
        if (i14 != -1) {
            if (c2837h1.m109408p()) {
                i15 = 4;
            } else {
                i15 = 4;
            }
        }
        c2822c1M8079m0 = m8079m0(c2822c1M8113n1, i15);
        this.f11117M.f11261H.m121878a(17, new C2839i0(arrayList2, this.f11144n0, i14, AbstractC38065t.m121896J(j13))).m121876b();
        if (this.f11111I0.f11046b.f92976a.equals(c2822c1M8079m0.f11046b.f92976a)) {
            z13 = false;
        } else {
            z13 = false;
        }
        m8089J0(c2822c1M8079m0, 0, z13, 4, m8103b0(c2822c1M8079m0), -1, false);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m8124y0(SurfaceHolder surfaceHolder) {
        this.f11152v0 = false;
        this.f11150t0 = surfaceHolder;
        surfaceHolder.addCallback(this.f11131a0);
        Surface surface = this.f11150t0.getSurface();
        if (surface == null || !surface.isValid()) {
            m8115p0(0, 0);
        } else {
            Rect surfaceFrame = this.f11150t0.getSurfaceFrame();
            m8115p0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m8125z0(boolean z4) {
        m8091L0();
        m8088I0(1, z4);
    }
}
