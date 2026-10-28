package p112e9;

import a00.C0072g;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.media3.exoplayer.dash.DashManifestStaleException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import g73.C15553a;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ng3.C26701n;
import p012ab.C0682h0;
import p047c9.C4323n;
import p141f9.AbstractC14271m;
import p141f9.C14259a;
import p141f9.C14261c;
import p141f9.C14265g;
import p141f9.C14266h;
import p141f9.C14278t;
import p141f9.C14279u;
import p171g9.C15587d;
import p171g9.InterfaceC15591h;
import p249jc.C21567b;
import p284ko.C22631o;
import p299l9.AbstractC23481a;
import p299l9.C23488c0;
import p299l9.C23527t;
import p299l9.InterfaceC23482a0;
import p324m9.C25279g;
import p398p9.C28987k;
import p398p9.C28990n;
import p398p9.InterfaceC28988l;
import p398p9.InterfaceC28989m;
import p418q9.AbstractC30067b;
import p516u8.AbstractC34628y;
import p516u8.C34618t;
import p516u8.C34620u;
import p516u8.C34626x;
import p522uf.AbstractC34870c0;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p674z8.C40171g;
import p674z8.InterfaceC40169e;
import p674z8.InterfaceC40170f;
import p674z8.InterfaceC40178n;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: e9.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C12869h extends AbstractC23481a {

    /* JADX INFO: renamed from: A */
    public C28987k f44251A;

    /* JADX INFO: renamed from: B */
    public InterfaceC40178n f44252B;

    /* JADX INFO: renamed from: C */
    public DashManifestStaleException f44253C;

    /* JADX INFO: renamed from: D */
    public Handler f44254D;

    /* JADX INFO: renamed from: E */
    public C34618t f44255E;

    /* JADX INFO: renamed from: F */
    public Uri f44256F;

    /* JADX INFO: renamed from: G */
    public final Uri f44257G;

    /* JADX INFO: renamed from: H */
    public C14261c f44258H;

    /* JADX INFO: renamed from: I */
    public boolean f44259I;

    /* JADX INFO: renamed from: J */
    public long f44260J;

    /* JADX INFO: renamed from: K */
    public long f44261K;

    /* JADX INFO: renamed from: L */
    public long f44262L;

    /* JADX INFO: renamed from: M */
    public int f44263M;

    /* JADX INFO: renamed from: N */
    public long f44264N;

    /* JADX INFO: renamed from: O */
    public int f44265O;

    /* JADX INFO: renamed from: P */
    public C34626x f44266P;

    /* JADX INFO: renamed from: h */
    public final boolean f44267h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC40169e f44268i;

    /* JADX INFO: renamed from: j */
    public final C0682h0 f44269j;

    /* JADX INFO: renamed from: k */
    public final C15553a f44270k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC15591h f44271l;

    /* JADX INFO: renamed from: m */
    public final C21567b f44272m;

    /* JADX INFO: renamed from: n */
    public final C0072g f44273n;

    /* JADX INFO: renamed from: o */
    public final long f44274o;

    /* JADX INFO: renamed from: p */
    public final long f44275p;

    /* JADX INFO: renamed from: q */
    public final C15587d f44276q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC28989m f44277r;

    /* JADX INFO: renamed from: s */
    public final C12865d f44278s;

    /* JADX INFO: renamed from: t */
    public final Object f44279t;

    /* JADX INFO: renamed from: u */
    public final SparseArray f44280u;

    /* JADX INFO: renamed from: v */
    public final RunnableC12864c f44281v;

    /* JADX INFO: renamed from: w */
    public final RunnableC12864c f44282w;

    /* JADX INFO: renamed from: x */
    public final C12865d f44283x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC28988l f44284y;

    /* JADX INFO: renamed from: z */
    public InterfaceC40170f f44285z;

    static {
        AbstractC34628y.m109420a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [e9.c] */
    /* JADX WARN: Type inference failed for: r2v11, types: [e9.c] */
    public C12869h(C34626x c34626x, InterfaceC40169e interfaceC40169e, InterfaceC28989m interfaceC28989m, C0682h0 c0682h0, C15553a c15553a, InterfaceC15591h interfaceC15591h, C21567b c21567b, long j7, long j13) {
        this.f44266P = c34626x;
        this.f44255E = c34626x.f145868c;
        C34620u c34620u = c34626x.f145867b;
        c34620u.getClass();
        Uri uri = c34620u.f145852a;
        this.f44256F = uri;
        this.f44257G = uri;
        this.f44258H = null;
        this.f44268i = interfaceC40169e;
        this.f44277r = interfaceC28989m;
        this.f44269j = c0682h0;
        this.f44271l = interfaceC15591h;
        this.f44272m = c21567b;
        this.f44274o = j7;
        this.f44275p = j13;
        this.f44270k = c15553a;
        this.f44273n = new C0072g(9);
        this.f44267h = false;
        this.f44276q = new C15587d(this.f92961c.f58539c, 0, null);
        this.f44279t = new Object();
        this.f44280u = new SparseArray();
        this.f44283x = new C12865d(this);
        this.f44264N = -9223372036854775807L;
        this.f44262L = -9223372036854775807L;
        this.f44278s = new C12865d(this);
        this.f44284y = new C12865d(this);
        final int i13 = 0;
        this.f44281v = new Runnable(this) { // from class: e9.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C12869h f44236x;

            {
                this.f44236x = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.f44236x.m36156y();
                        break;
                    default:
                        this.f44236x.m36154w(false);
                        break;
                }
            }
        };
        final int i14 = 1;
        this.f44282w = new Runnable(this) { // from class: e9.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C12869h f44236x;

            {
                this.f44236x = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        this.f44236x.m36156y();
                        break;
                    default:
                        this.f44236x.m36154w(false);
                        break;
                }
            }
        };
    }

    /* JADX INFO: renamed from: s */
    public static boolean m36143s(C14266h c14266h) {
        List list = c14266h.f52096c;
        for (int i13 = 0; i13 < list.size(); i13++) {
            int i14 = ((C14259a) list.get(i13)).f52053b;
            if (i14 == 1 || i14 == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // p299l9.AbstractC23481a
    /* JADX INFO: renamed from: a */
    public final InterfaceC23482a0 mo36144a(C23488c0 c23488c0, C22631o c22631o, long j7) {
        int iIntValue = ((Integer) c23488c0.f92976a).intValue() - this.f44265O;
        C15587d c15587d = new C15587d(this.f92961c.f58539c, 0, c23488c0);
        C15587d c15587d2 = new C15587d(this.f92962d.f58539c, 0, c23488c0);
        int i13 = this.f44265O + iIntValue;
        C14261c c14261c = this.f44258H;
        InterfaceC40178n interfaceC40178n = this.f44252B;
        long j13 = this.f44262L;
        C4323n c4323n = this.f92965g;
        AbstractC35849g.m113808j(c4323n);
        C12863b c12863b = new C12863b(i13, c14261c, this.f44273n, iIntValue, this.f44269j, interfaceC40178n, this.f44271l, c15587d2, this.f44272m, c15587d, j13, this.f44284y, c22631o, this.f44270k, this.f44283x, c4323n);
        this.f44280u.put(i13, c12863b);
        return c12863b;
    }

    @Override // p299l9.AbstractC23481a
    /* JADX INFO: renamed from: g */
    public final synchronized C34626x mo36145g() {
        return this.f44266P;
    }

    @Override // p299l9.AbstractC23481a
    /* JADX INFO: renamed from: i */
    public final void mo36146i() {
        this.f44284y.mo36136c();
    }

    @Override // p299l9.AbstractC23481a
    /* JADX INFO: renamed from: k */
    public final void mo36147k(InterfaceC40178n interfaceC40178n) {
        this.f44252B = interfaceC40178n;
        Looper looperMyLooper = Looper.myLooper();
        C4323n c4323n = this.f92965g;
        AbstractC35849g.m113808j(c4323n);
        InterfaceC15591h interfaceC15591h = this.f44271l;
        interfaceC15591h.mo43890b(looperMyLooper, c4323n);
        interfaceC15591h.prepare();
        if (this.f44267h) {
            m36154w(false);
            return;
        }
        this.f44285z = this.f44268i.createDataSource();
        this.f44251A = new C28987k("DashMediaSource");
        this.f44254D = AbstractC38065t.m121920m(null);
        m36156y();
    }

    @Override // p299l9.AbstractC23481a
    /* JADX INFO: renamed from: m */
    public final void mo36148m(InterfaceC23482a0 interfaceC23482a0) {
        C12863b c12863b = (C12863b) interfaceC23482a0;
        C12877p c12877p = c12863b.f44218M;
        c12877p.f44330I = true;
        c12877p.f44334z.removeCallbacksAndMessages(null);
        for (C25279g c25279g : c12863b.f44223R) {
            c25279g.m74174C(c12863b);
        }
        c12863b.f44222Q = null;
        this.f44280u.remove(c12863b.f44231w);
    }

    @Override // p299l9.AbstractC23481a
    /* JADX INFO: renamed from: o */
    public final void mo36149o() {
        this.f44259I = false;
        this.f44285z = null;
        C28987k c28987k = this.f44251A;
        if (c28987k != null) {
            c28987k.m88008b(null);
            this.f44251A = null;
        }
        this.f44260J = 0L;
        this.f44261K = 0L;
        this.f44256F = this.f44257G;
        this.f44253C = null;
        Handler handler = this.f44254D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f44254D = null;
        }
        this.f44262L = -9223372036854775807L;
        this.f44263M = 0;
        this.f44264N = -9223372036854775807L;
        this.f44280u.clear();
        C0072g c0072g = this.f44273n;
        ((HashMap) c0072g.f223x).clear();
        ((HashMap) c0072g.f224y).clear();
        ((HashMap) c0072g.f225z).clear();
        this.f44271l.release();
    }

    @Override // p299l9.AbstractC23481a
    /* JADX INFO: renamed from: r */
    public final synchronized void mo36150r(C34626x c34626x) {
        this.f44266P = c34626x;
    }

    /* JADX INFO: renamed from: t */
    public final void m36151t() {
        boolean z4;
        C28987k c28987k = this.f44251A;
        C12865d c12865d = new C12865d(this);
        synchronized (AbstractC30067b.f122682b) {
            z4 = AbstractC30067b.f122683c;
        }
        if (z4) {
            c12865d.m36135a();
            return;
        }
        if (c28987k == null) {
            c28987k = new C28987k("SntpClient");
        }
        c28987k.m88009d(new C26701n(17), new C12868g(c12865d, 1), 1);
    }

    /* JADX INFO: renamed from: u */
    public final void m36152u(C28990n c28990n) {
        long j7 = c28990n.f117262w;
        Uri uri = c28990n.f117265z.f173387y;
        C23527t c23527t = new C23527t();
        this.f44272m.getClass();
        this.f44276q.m43885c(c23527t, c28990n.f117264y, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX INFO: renamed from: v */
    public final void m36153v(IOException iOException) {
        AbstractC38046a.m121813h("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.f44262L = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        m36154w(true);
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0291  */
    /* JADX WARN: Code duplicated, block: B:156:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:159:0x0301  */
    /* JADX WARN: Code duplicated, block: B:195:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:196:0x03bd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17, types: [int] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r15v10, types: [int] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r5v25, types: [o9.s] */
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
    /* JADX INFO: renamed from: w */
    public final void m36154w(boolean z4) {
        long j7;
        long jMax;
        long j13;
        boolean z13;
        boolean z14;
        long j14;
        long j15;
        long j16;
        int i13;
        long jMin;
        float f13;
        float f14;
        long jM121907U;
        long jM121896J;
        long jMin2;
        boolean z15;
        boolean z16 = false;
        int i14 = 0;
        while (true) {
            SparseArray sparseArray = this.f44280u;
            if (i14 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i14);
            if (iKeyAt >= this.f44265O) {
                C12863b c12863b = (C12863b) sparseArray.valueAt(i14);
                C14261c c14261c = this.f44258H;
                int i15 = iKeyAt - this.f44265O;
                c12863b.f44226U = c14261c;
                c12863b.f44227V = i15;
                C12877p c12877p = c12863b.f44218M;
                c12877p.f44329H = z16;
                c12877p.f44327F = c14261c;
                Iterator it = c12877p.f44326E.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < c12877p.f44327F.f52069h) {
                        it.remove();
                    }
                }
                C25279g[] c25279gArr = c12863b.f44223R;
                if (c25279gArr != null) {
                    int length = c25279gArr.length;
                    for (?? r10 = z16; r10 < length; r10++) {
                        C12873l c12873l = c25279gArr[r10].f99199E;
                        C12871j[] c12871jArr = c12873l.f44305i;
                        try {
                            c12873l.f44307k = c14261c;
                            c12873l.f44308l = i15;
                            long jM40730c = c14261c.m40730c(i15);
                            ArrayList arrayListM36166a = c12873l.m36166a();
                            for (?? r15 = z16; r15 < c12871jArr.length; r15++) {
                                try {
                                    c12871jArr[r15] = c12871jArr[r15].m36157a(jM40730c, (AbstractC14271m) arrayListM36166a.get(c12873l.f44306j.mo68073e(r15)));
                                } catch (BehindLiveWindowException e5) {
                                    e = e5;
                                    c12873l.f44309m = e;
                                }
                            }
                        } catch (BehindLiveWindowException e13) {
                            e = e13;
                        }
                        z16 = false;
                    }
                    z15 = true;
                    c12863b.f44222Q.mo8198b(c12863b);
                } else {
                    z15 = true;
                }
                c12863b.f44228W = c14261c.m40728a(i15).f52097d;
                for (C12874m c12874m : c12863b.f44224S) {
                    for (C14265g c14265g : c12863b.f44228W) {
                        if (c14265g.m40750a().equals(c12874m.f44311E.m40750a())) {
                            c12874m.m36168a(c14265g, (c14261c.f52065d && i15 == c14261c.f52074m.size() + (-1)) ? z15 : false);
                            break;
                        }
                    }
                }
            }
            i14++;
            z16 = false;
        }
        int i16 = 1;
        C14266h c14266hM40728a = this.f44258H.m40728a(0);
        int size = this.f44258H.f52074m.size() - 1;
        C14266h c14266hM40728a2 = this.f44258H.m40728a(size);
        long jM40730c2 = this.f44258H.m40730c(size);
        long jM121896J2 = AbstractC38065t.m121896J(AbstractC38065t.m121929v(this.f44262L));
        long jM40730c3 = this.f44258H.m40730c(0);
        long j17 = c14266hM40728a.f52095b;
        List list = c14266hM40728a.f52096c;
        long jM121896J3 = AbstractC38065t.m121896J(j17);
        boolean zM36143s = m36143s(c14266hM40728a);
        long jMax2 = jM121896J3;
        int i17 = 0;
        while (true) {
            long j18 = jM121896J3;
            if (i17 >= list.size()) {
                j7 = 0;
                jMax = jMax2;
                break;
            }
            C14259a c14259a = (C14259a) list.get(i17);
            j7 = 0;
            List list2 = c14259a.f52054c;
            int i18 = c14259a.f52053b;
            boolean z17 = (i18 == i16 || i18 == 2) ? false : true;
            if ((!zM36143s || !z17) && !list2.isEmpty()) {
                InterfaceC12870i interfaceC12870iMo40753c = ((AbstractC14271m) list2.get(0)).mo40753c();
                if (interfaceC12870iMo40753c == null || interfaceC12870iMo40753c.mo3079D(jM40730c3, jM121896J2) == 0) {
                    jMax = j18;
                    break;
                }
                jMax2 = Math.max(jMax2, interfaceC12870iMo40753c.mo3091a(interfaceC12870iMo40753c.mo3105r(jM40730c3, jM121896J2)) + j18);
            }
            i17++;
            jM121896J3 = j18;
            i16 = 1;
        }
        long j19 = c14266hM40728a2.f52095b;
        List list3 = c14266hM40728a2.f52096c;
        long jM121896J4 = AbstractC38065t.m121896J(j19);
        boolean zM36143s2 = m36143s(c14266hM40728a2);
        long jMin3 = Long.MAX_VALUE;
        int i19 = 0;
        while (true) {
            if (i19 >= list3.size()) {
                j13 = jMin3;
                break;
            }
            C14259a c14259a2 = (C14259a) list3.get(i19);
            boolean z18 = zM36143s2;
            List list4 = c14259a2.f52054c;
            int i24 = c14259a2.f52053b;
            long j24 = jM121896J4;
            boolean z19 = (i24 == 1 || i24 == 2) ? false : true;
            if ((!z18 || !z19) && !list4.isEmpty()) {
                InterfaceC12870i interfaceC12870iMo40753c2 = ((AbstractC14271m) list4.get(0)).mo40753c();
                if (interfaceC12870iMo40753c2 == null) {
                    j13 = j24 + jM40730c2;
                    break;
                }
                long jMo3079D = interfaceC12870iMo40753c2.mo3079D(jM40730c2, jM121896J2);
                if (jMo3079D == j7) {
                    j13 = j24;
                    break;
                } else {
                    long jMo3105r = (interfaceC12870iMo40753c2.mo3105r(jM40730c2, jM121896J2) + jMo3079D) - 1;
                    jMin3 = Math.min(jMin3, interfaceC12870iMo40753c2.mo3104q(jMo3105r, jM40730c2) + interfaceC12870iMo40753c2.mo3091a(jMo3105r) + j24);
                }
            }
            i19++;
            zM36143s2 = z18;
            jM121896J4 = j24;
        }
        if (!this.f44258H.f52065d) {
            z13 = false;
            break;
        }
        int i25 = 0;
        while (true) {
            if (i25 >= list3.size()) {
                z13 = true;
                break;
            }
            InterfaceC12870i interfaceC12870iMo40753c3 = ((AbstractC14271m) ((C14259a) list3.get(i25)).f52054c.get(0)).mo40753c();
            if (interfaceC12870iMo40753c3 == null || interfaceC12870iMo40753c3.mo3076A()) {
                z13 = false;
                break;
            }
            i25++;
        }
        if (z13) {
            long j25 = this.f44258H.f52067f;
            if (j25 != -9223372036854775807L) {
                jMax = Math.max(jMax, j13 - AbstractC38065t.m121896J(j25));
            }
        }
        long j26 = j13 - jMax;
        C14261c c14261c2 = this.f44258H;
        if (c14261c2.f52065d) {
            AbstractC35849g.m113807i(c14261c2.f52062a != -9223372036854775807L);
            long jM121896J5 = (jM121896J2 - AbstractC38065t.m121896J(this.f44258H.f52062a)) - jMax;
            C34618t c34618t = mo36145g().f145868c;
            long jM121907U2 = AbstractC38065t.m121907U(jM121896J5);
            long j27 = c34618t.f145829c;
            if (j27 != -9223372036854775807L) {
                jMin = Math.min(jM121907U2, j27);
            } else {
                C14278t c14278t = this.f44258H.f52071j;
                if (c14278t != null) {
                    long j28 = c14278t.f52134c;
                    if (j28 != -9223372036854775807L) {
                        jMin = Math.min(jM121907U2, j28);
                    } else {
                        jMin = jM121907U2;
                    }
                } else {
                    jMin = jM121907U2;
                }
            }
            long jM121907U3 = AbstractC38065t.m121907U(jM121896J5 - j26);
            if (jM121907U3 < j7 && jMin > j7) {
                jM121907U3 = j7;
            }
            j14 = -9223372036854775807L;
            long j29 = this.f44258H.f52064c;
            if (j29 != -9223372036854775807L) {
                jM121907U3 = Math.min(jM121907U3 + j29, jM121907U2);
            }
            long jM121915h = jM121907U3;
            long j34 = c34618t.f145828b;
            if (j34 != -9223372036854775807L) {
                jM121915h = AbstractC38065t.m121915h(j34, jM121915h, jM121907U2);
            } else {
                C14278t c14278t2 = this.f44258H.f52071j;
                if (c14278t2 != null) {
                    long j35 = c14278t2.f52133b;
                    if (j35 != -9223372036854775807L) {
                        jM121915h = AbstractC38065t.m121915h(j35, jM121915h, jM121907U2);
                    }
                }
            }
            long j36 = jM121915h;
            long j37 = j36 > jMin ? j36 : jMin;
            long j38 = this.f44255E.f145827a;
            if (j38 == -9223372036854775807L) {
                C14261c c14261c3 = this.f44258H;
                C14278t c14278t3 = c14261c3.f52071j;
                if (c14278t3 != null) {
                    long j39 = c14278t3.f52132a;
                    if (j39 != -9223372036854775807L) {
                        j38 = j39;
                    } else {
                        j38 = c14261c3.f52068g;
                        if (j38 == -9223372036854775807L) {
                            j38 = this.f44274o;
                        }
                    }
                } else {
                    j38 = c14261c3.f52068g;
                    if (j38 == -9223372036854775807L) {
                        j38 = this.f44274o;
                    }
                }
            }
            if (j38 < j36) {
                j38 = j36;
            }
            long j44 = this.f44275p;
            long jM121915h2 = j38 > j37 ? AbstractC38065t.m121915h(AbstractC38065t.m121907U(jM121896J5 - Math.min(j44, j26 / 2)), j36, j37) : j38;
            z14 = z13;
            long j45 = j37;
            float f15 = c34618t.f145830d;
            if (f15 == -3.4028235E38f) {
                C14278t c14278t4 = this.f44258H.f52071j;
                f15 = c14278t4 != null ? c14278t4.f52135d : -3.4028235E38f;
            }
            float f16 = c34618t.f145831e;
            if (f16 == -3.4028235E38f) {
                C14278t c14278t5 = this.f44258H.f52071j;
                f16 = c14278t5 != null ? c14278t5.f52136e : -3.4028235E38f;
            }
            if (f15 == -3.4028235E38f && f16 == -3.4028235E38f) {
                C14278t c14278t6 = this.f44258H.f52071j;
                if (c14278t6 == null || c14278t6.f52132a == -9223372036854775807L) {
                    f14 = 1.0f;
                    f13 = 1.0f;
                }
                C14278t c14278t7 = new C14278t();
                c14278t7.f52132a = jM121915h2;
                c14278t7.f52133b = j36;
                c14278t7.f52134c = j45;
                c14278t7.f52135d = f14;
                c14278t7.f52136e = f13;
                this.f44255E = new C34618t(c14278t7);
                jM121907U = AbstractC38065t.m121907U(jMax) + this.f44258H.f52062a;
                jM121896J = jM121896J5 - AbstractC38065t.m121896J(this.f44255E.f145827a);
                jMin2 = Math.min(j44, j26 / 2);
                if (jM121896J < jMin2) {
                    j16 = jMin2;
                    j15 = jM121907U;
                } else {
                    j15 = jM121907U;
                    j16 = jM121896J;
                }
            }
            f14 = f15;
            f13 = f16;
            C14278t c14278t8 = new C14278t();
            c14278t8.f52132a = jM121915h2;
            c14278t8.f52133b = j36;
            c14278t8.f52134c = j45;
            c14278t8.f52135d = f14;
            c14278t8.f52136e = f13;
            this.f44255E = new C34618t(c14278t8);
            jM121907U = AbstractC38065t.m121907U(jMax) + this.f44258H.f52062a;
            jM121896J = jM121896J5 - AbstractC38065t.m121896J(this.f44255E.f145827a);
            jMin2 = Math.min(j44, j26 / 2);
            if (jM121896J < jMin2) {
                j16 = jMin2;
                j15 = jM121907U;
            } else {
                j15 = jM121907U;
                j16 = jM121896J;
            }
        } else {
            z14 = z13;
            j14 = -9223372036854775807L;
            j15 = -9223372036854775807L;
            j16 = j7;
        }
        long jM121896J6 = jMax - AbstractC38065t.m121896J(c14266hM40728a.f52095b);
        C14261c c14261c4 = this.f44258H;
        m68048l(new C12866e(c14261c4.f52062a, j15, this.f44262L, this.f44265O, jM121896J6, j26, j16, c14261c4, mo36145g(), this.f44258H.f52065d ? this.f44255E : null));
        if (this.f44267h) {
            return;
        }
        Handler handler = this.f44254D;
        RunnableC12864c runnableC12864c = this.f44282w;
        handler.removeCallbacks(runnableC12864c);
        if (z14) {
            Handler handler2 = this.f44254D;
            C14261c c14261c5 = this.f44258H;
            long jM121929v = AbstractC38065t.m121929v(this.f44262L);
            int size2 = c14261c5.f52074m.size() - 1;
            C14266h c14266hM40728a3 = c14261c5.m40728a(size2);
            long j46 = c14266hM40728a3.f52095b;
            List list5 = c14266hM40728a3.f52096c;
            long jM121896J7 = AbstractC38065t.m121896J(j46);
            long jM40730c4 = c14261c5.m40730c(size2);
            long jM121896J8 = AbstractC38065t.m121896J(jM121929v);
            long jM121896J9 = AbstractC38065t.m121896J(c14261c5.f52062a);
            long jM121896J10 = AbstractC38065t.m121896J(c14261c5.f52066e);
            if (jM121896J10 == j14 || jM121896J10 >= 5000000) {
                jM121896J10 = 5000000;
            }
            int i26 = 0;
            while (i26 < list5.size()) {
                List list6 = ((C14259a) list5.get(i26)).f52054c;
                if (list6.isEmpty()) {
                    i13 = i26;
                } else {
                    i13 = i26;
                    InterfaceC12870i interfaceC12870iMo40753c4 = ((AbstractC14271m) list6.get(0)).mo40753c();
                    if (interfaceC12870iMo40753c4 != null) {
                        long jMo3106s = (interfaceC12870iMo40753c4.mo3106s(jM40730c4, jM121896J8) + (jM121896J9 + jM121896J7)) - jM121896J8;
                        if (jMo3106s > j7 && (jMo3106s < jM121896J10 - 100000 || (jMo3106s > jM121896J10 && jMo3106s < jM121896J10 + 100000))) {
                            jM121896J10 = jMo3106s;
                        }
                    }
                }
                i26 = i13 + 1;
            }
            handler2.postDelayed(runnableC12864c, AbstractC34870c0.m109975J(jM121896J10, 1000L, RoundingMode.CEILING));
        }
        if (this.f44259I) {
            m36156y();
            return;
        }
        if (z4) {
            C14261c c14261c6 = this.f44258H;
            if (c14261c6.f52065d) {
                long j47 = c14261c6.f52066e;
                if (j47 != j14) {
                    if (j47 == j7) {
                        j47 = 5000;
                    }
                    this.f44254D.postDelayed(this.f44281v, Math.max(j7, (this.f44260J + j47) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m36155x(C14279u c14279u, InterfaceC28989m interfaceC28989m) {
        InterfaceC40170f interfaceC40170f = this.f44285z;
        Uri uri = Uri.parse(c14279u.f52139c);
        Map map = Collections.EMPTY_MAP;
        AbstractC35849g.m113809k(uri, "The uri must be set.");
        this.f44251A.m88009d(new C28990n(interfaceC40170f, new C40171g(uri, 1, null, map, 0L, -1L, null, 1), 5, interfaceC28989m), new C12868g(this, 0), 1);
    }

    /* JADX INFO: renamed from: y */
    public final void m36156y() {
        Uri uri;
        this.f44254D.removeCallbacks(this.f44281v);
        C28987k c28987k = this.f44251A;
        if (c28987k.f117259y != null) {
            return;
        }
        if (c28987k.m88007a()) {
            this.f44259I = true;
            return;
        }
        synchronized (this.f44279t) {
            uri = this.f44256F;
        }
        this.f44259I = false;
        Map map = Collections.EMPTY_MAP;
        AbstractC35849g.m113809k(uri, "The uri must be set.");
        C28990n c28990n = new C28990n(this.f44285z, new C40171g(uri, 1, null, map, 0L, -1L, null, 1), 4, this.f44277r);
        C12865d c12865d = this.f44278s;
        this.f44272m.getClass();
        this.f44251A.m88009d(c28990n, c12865d, 3);
    }
}
