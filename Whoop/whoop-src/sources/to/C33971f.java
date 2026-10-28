package to;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.common.C4969a;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.AbstractC4977h;
import com.google.android.gms.common.api.Status;
import io.getstream.chat.android.client.ChatClient;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import jp.HandlerC21846d;
import p000.AbstractC11266d;
import p002a0.C0025h;
import p044c5.ExecutorC4220l;
import p073cq.C11040i;
import p073cq.C11052u;
import p389p0.C28539n0;
import p529uo.C35118h0;
import p529uo.C35123k;
import p529uo.C35124l;
import p529uo.C35125m;
import p590wo.C37434b;
import p687zo.AbstractC40909b;

/* JADX INFO: renamed from: to.f */
/* JADX INFO: loaded from: classes.dex */
public final class C33971f implements Handler.Callback {

    /* JADX INFO: renamed from: P */
    public static final Status f142414P = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* JADX INFO: renamed from: Q */
    public static final Status f142415Q = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* JADX INFO: renamed from: R */
    public static final Object f142416R = new Object();

    /* JADX INFO: renamed from: S */
    public static C33971f f142417S;

    /* JADX INFO: renamed from: E */
    public final Context f142418E;

    /* JADX INFO: renamed from: F */
    public final GoogleApiAvailability f142419F;

    /* JADX INFO: renamed from: G */
    public final C28539n0 f142420G;

    /* JADX INFO: renamed from: N */
    public final HandlerC21846d f142427N;

    /* JADX INFO: renamed from: O */
    public volatile boolean f142428O;

    /* JADX INFO: renamed from: y */
    public C35125m f142431y;

    /* JADX INFO: renamed from: z */
    public C37434b f142432z;

    /* JADX INFO: renamed from: w */
    public long f142429w = ChatClient.RESOLVE_DEPENDENCY_TIMEOUT;

    /* JADX INFO: renamed from: x */
    public boolean f142430x = false;

    /* JADX INFO: renamed from: H */
    public final AtomicInteger f142421H = new AtomicInteger(1);

    /* JADX INFO: renamed from: I */
    public final AtomicInteger f142422I = new AtomicInteger(0);

    /* JADX INFO: renamed from: J */
    public final ConcurrentHashMap f142423J = new ConcurrentHashMap(5, 0.75f, 1);

    /* JADX INFO: renamed from: K */
    public C33997s f142424K = null;

    /* JADX INFO: renamed from: L */
    public final C0025h f142425L = new C0025h(0);

    /* JADX INFO: renamed from: M */
    public final C0025h f142426M = new C0025h(0);

    public C33971f(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.f142428O = true;
        this.f142418E = context;
        HandlerC21846d handlerC21846d = new HandlerC21846d(looper, this);
        Looper.getMainLooper();
        this.f142427N = handlerC21846d;
        this.f142419F = googleApiAvailability;
        this.f142420G = new C28539n0(googleApiAvailability);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC40909b.f176322e == null) {
            AbstractC40909b.f176322e = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (AbstractC40909b.f176322e.booleanValue()) {
            this.f142428O = false;
        }
        handlerC21846d.sendMessage(handlerC21846d.obtainMessage(6));
    }

    /* JADX INFO: renamed from: a */
    public static void m107427a() {
        synchronized (f142416R) {
            try {
                C33971f c33971f = f142417S;
                if (c33971f != null) {
                    c33971f.f142422I.incrementAndGet();
                    HandlerC21846d handlerC21846d = c33971f.f142427N;
                    handlerC21846d.sendMessageAtFrontOfQueue(handlerC21846d.obtainMessage(10));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static Status m107428d(C33961a c33961a, C4969a c4969a) {
        String str = c33961a.f142393b.f20500b;
        String strValueOf = String.valueOf(c4969a);
        return new Status(17, AbstractC11266d.m30464r(new StringBuilder(String.valueOf(str).length() + 63 + strValueOf.length()), "API: ", str, " is not available on this device. Connection failed with: ", strValueOf), c4969a.f20481y, c4969a);
    }

    /* JADX INFO: renamed from: e */
    public static C33971f m107429e(Context context) {
        C33971f c33971f;
        HandlerThread handlerThread;
        synchronized (f142416R) {
            if (f142417S == null) {
                synchronized (C35118h0.f149029g) {
                    try {
                        handlerThread = C35118h0.f149031i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            C35118h0.f149031i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = C35118h0.f149031i;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                f142417S = new C33971f(context.getApplicationContext(), handlerThread.getLooper(), GoogleApiAvailability.getInstance());
            }
            c33971f = f142417S;
        }
        return c33971f;
    }

    /* JADX INFO: renamed from: b */
    public final C34003v m107430b(AbstractC4977h abstractC4977h) {
        C33961a apiKey = abstractC4977h.getApiKey();
        ConcurrentHashMap concurrentHashMap = this.f142423J;
        C34003v c34003v = (C34003v) concurrentHashMap.get(apiKey);
        if (c34003v == null) {
            c34003v = new C34003v(this, abstractC4977h);
            concurrentHashMap.put(apiKey, c34003v);
        }
        if (c34003v.f142495g.mo5665a()) {
            this.f142426M.add(apiKey);
        }
        c34003v.m107489o();
        return c34003v;
    }

    /* JADX INFO: renamed from: c */
    public final void m107431c(C11040i c11040i, int i13, AbstractC4977h abstractC4977h) {
        C33964b0 c33964b0M107420a;
        if (i13 == 0 || (c33964b0M107420a = C33964b0.m107420a(this, i13, abstractC4977h.getApiKey())) == null) {
            return;
        }
        C11052u c11052u = c11040i.f34644a;
        HandlerC21846d handlerC21846d = this.f142427N;
        Objects.requireNonNull(handlerC21846d);
        c11052u.addOnCompleteListener(new ExecutorC4220l(handlerC21846d, 3), c33964b0M107420a);
    }

    /* JADX INFO: renamed from: f */
    public final void m107432f(C33997s c33997s) {
        synchronized (f142416R) {
            try {
                if (this.f142424K != c33997s) {
                    this.f142424K = c33997s;
                    this.f142425L.clear();
                }
                this.f142425L.addAll(c33997s.m107471n());
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m107433g() {
        int i13;
        if (this.f142430x) {
            return false;
        }
        C35124l c35124l = (C35124l) C35123k.m111072a().f149049a;
        if (c35124l != null && !c35124l.f149052x) {
            return false;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.f142420G.f115462x;
        synchronized (sparseIntArray) {
            i13 = sparseIntArray.get(203400000, -1);
        }
        return i13 == -1 || i13 == 0;
    }

    /* JADX INFO: renamed from: h */
    public final C11052u m107434h(AbstractC4977h abstractC4977h, AbstractC33983l abstractC33983l, AbstractC33995r abstractC33995r, Runnable runnable) {
        C11040i c11040i = new C11040i();
        m107431c(c11040i, abstractC33983l.m107456c(), abstractC4977h);
        C33970e0 c33970e0 = new C33970e0(new C33984l0(new C33972f0(abstractC33983l, abstractC33995r, runnable), c11040i), this.f142422I.get(), abstractC4977h);
        HandlerC21846d handlerC21846d = this.f142427N;
        handlerC21846d.sendMessage(handlerC21846d.obtainMessage(8, c33970e0));
        return c11040i.f34644a;
    }

    /* JADX WARN: Code duplicated, block: B:153:0x0318  */
    /* JADX WARN: Code duplicated, block: B:155:0x031c  */
    /* JADX WARN: Code duplicated, block: B:157:0x034d  */
    /* JADX WARN: Code duplicated, block: B:159:0x0357  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v11 to.v, still in use, count: 2, list:
          (r3v11 to.v) from 0x0310: IGET (r3v11 to.v) A[WRAPPED] to.v.l int
          (r3v11 to.v) from 0x0316: PHI (r3 I:??) = (r3v8 to.v), (r3v11 to.v) binds: [B:151:0x0315, B:223:0x0316] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r12) {
        /*
            Method dump skipped, instruction units count: 1186
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: to.C33971f.handleMessage(android.os.Message):boolean");
    }

    /* JADX INFO: renamed from: i */
    public final void m107435i(C4969a c4969a, int i13) {
        if (this.f142419F.zad(this.f142418E, c4969a, i13)) {
            return;
        }
        HandlerC21846d handlerC21846d = this.f142427N;
        handlerC21846d.sendMessage(handlerC21846d.obtainMessage(5, i13, 0, c4969a));
    }
}
