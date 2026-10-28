package p684zk;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.C4961c;
import com.bumptech.glide.EnumC4962d;
import com.bumptech.glide.load.engine.GlideException;
import gl.C15948m;
import io.sentry.android.core.util.C20162a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p085d9.C11789f;
import p108e4.AbstractC12682p;
import p167g5.InterfaceC15485d;
import p319m4.AbstractC25012a;
import p474s.C31983m2;
import p526ul.C35058d;
import p526ul.InterfaceC35056b;
import p586wk.C37329g;
import p586wk.C37330h;
import p586wk.EnumC37323a;
import p586wk.InterfaceC37327e;
import p586wk.InterfaceC37333k;
import p618xk.C38417h;
import p618xk.InterfaceC38414e;
import p618xk.InterfaceC38415f;
import p618xk.InterfaceC38416g;
import p671z5.C40084b;
import pf.AbstractC29125c;
import pg3.C29205p;
import tl.AbstractC33908g;
import z63.C40132d;

/* JADX INFO: renamed from: zk.i */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC40784i implements InterfaceC40780e, Runnable, Comparable, InterfaceC35056b {

    /* JADX INFO: renamed from: E */
    public final InterfaceC15485d f175856E;

    /* JADX INFO: renamed from: H */
    public C4961c f175859H;

    /* JADX INFO: renamed from: I */
    public InterfaceC37327e f175860I;

    /* JADX INFO: renamed from: J */
    public EnumC4962d f175861J;

    /* JADX INFO: renamed from: K */
    public C40793r f175862K;

    /* JADX INFO: renamed from: L */
    public int f175863L;

    /* JADX INFO: renamed from: M */
    public int f175864M;

    /* JADX INFO: renamed from: N */
    public C40786k f175865N;

    /* JADX INFO: renamed from: O */
    public C37330h f175866O;

    /* JADX INFO: renamed from: P */
    public C40791p f175867P;

    /* JADX INFO: renamed from: Q */
    public int f175868Q;

    /* JADX INFO: renamed from: R */
    public long f175869R;

    /* JADX INFO: renamed from: S */
    public Object f175870S;

    /* JADX INFO: renamed from: T */
    public Thread f175871T;

    /* JADX INFO: renamed from: U */
    public InterfaceC37327e f175872U;

    /* JADX INFO: renamed from: V */
    public InterfaceC37327e f175873V;

    /* JADX INFO: renamed from: W */
    public Object f175874W;

    /* JADX INFO: renamed from: X */
    public EnumC37323a f175875X;

    /* JADX INFO: renamed from: Y */
    public InterfaceC38414e f175876Y;

    /* JADX INFO: renamed from: Z */
    public volatile InterfaceC40781f f175877Z;

    /* JADX INFO: renamed from: a0 */
    public volatile boolean f175878a0;

    /* JADX INFO: renamed from: b0 */
    public volatile boolean f175879b0;

    /* JADX INFO: renamed from: c0 */
    public int f175880c0;

    /* JADX INFO: renamed from: d0 */
    public int f175881d0;

    /* JADX INFO: renamed from: z */
    public final C20162a f175885z;

    /* JADX INFO: renamed from: w */
    public final C40782g f175882w = new C40782g();

    /* JADX INFO: renamed from: x */
    public final ArrayList f175883x = new ArrayList();

    /* JADX INFO: renamed from: y */
    public final C35058d f175884y = new C35058d();

    /* JADX INFO: renamed from: F */
    public final C40132d f175857F = new C40132d();

    /* JADX INFO: renamed from: G */
    public final C11789f f175858G = new C11789f();

    public RunnableC40784i(C20162a c20162a, C31983m2 c31983m2) {
        this.f175885z = c20162a;
        this.f175856E = c31983m2;
    }

    @Override // p684zk.InterfaceC40780e
    /* JADX INFO: renamed from: a */
    public final void mo132264a(InterfaceC37327e interfaceC37327e, Exception exc, InterfaceC38414e interfaceC38414e, EnumC37323a enumC37323a) {
        interfaceC38414e.mo33597a();
        GlideException glideException = new GlideException("Fetching data failed", Collections.singletonList(exc));
        Class clsMo33598b = interfaceC38414e.mo33598b();
        glideException.f20343x = interfaceC37327e;
        glideException.f20344y = enumC37323a;
        glideException.f20345z = clsMo33598b;
        this.f175883x.add(glideException);
        if (Thread.currentThread() == this.f175871T) {
            m132282n();
            return;
        }
        this.f175881d0 = 2;
        C40791p c40791p = this.f175867P;
        (c40791p.f175920M ? c40791p.f175916I : c40791p.f175915H).execute(this);
    }

    @Override // p526ul.InterfaceC35056b
    /* JADX INFO: renamed from: b */
    public final C35058d mo9724b() {
        return this.f175884y;
    }

    @Override // p684zk.InterfaceC40780e
    /* JADX INFO: renamed from: c */
    public final void mo132265c(InterfaceC37327e interfaceC37327e, Object obj, InterfaceC38414e interfaceC38414e, EnumC37323a enumC37323a, InterfaceC37327e interfaceC37327e2) {
        this.f175872U = interfaceC37327e;
        this.f175874W = obj;
        this.f175876Y = interfaceC38414e;
        this.f175875X = enumC37323a;
        this.f175873V = interfaceC37327e2;
        if (Thread.currentThread() == this.f175871T) {
            m132274f();
            return;
        }
        this.f175881d0 = 3;
        C40791p c40791p = this.f175867P;
        (c40791p.f175920M ? c40791p.f175916I : c40791p.f175915H).execute(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        RunnableC40784i runnableC40784i = (RunnableC40784i) obj;
        int iOrdinal = this.f175861J.ordinal() - runnableC40784i.f175861J.ordinal();
        return iOrdinal == 0 ? this.f175868Q - runnableC40784i.f175868Q : iOrdinal;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC40801z m132272d(InterfaceC38414e interfaceC38414e, Object obj, EnumC37323a enumC37323a) {
        if (obj == null) {
            interfaceC38414e.mo33597a();
            return null;
        }
        try {
            int i13 = AbstractC33908g.f142084b;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            InterfaceC40801z interfaceC40801zM132273e = m132273e(obj, enumC37323a);
            if (Log.isLoggable("DecodeJob", 2)) {
                m132278j(jElapsedRealtimeNanos, "Decoded result " + interfaceC40801zM132273e, null);
            }
            return interfaceC40801zM132273e;
        } finally {
            interfaceC38414e.mo33597a();
        }
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC40801z m132273e(Object obj, EnumC37323a enumC37323a) {
        InterfaceC38416g interfaceC38416gMo49223a;
        C40799x c40799xM132268c = this.f175882w.m132268c(obj.getClass());
        C37330h c37330h = this.f175866O;
        boolean z4 = enumC37323a == EnumC37323a.f159584z || this.f175882w.f175855r;
        C37329g c37329g = C15948m.f60365i;
        Boolean bool = (Boolean) c37330h.m119569c(c37329g);
        if (bool == null || (bool.booleanValue() && !z4)) {
            c37330h = new C37330h();
            c37330h.f159595b.mo39h(this.f175866O.f159595b);
            c37330h.f159595b.put(c37329g, Boolean.valueOf(z4));
        }
        C37330h c37330h2 = c37330h;
        C38417h c38417h = (C38417h) this.f175859H.f20303b.f742f;
        synchronized (c38417h) {
            try {
                InterfaceC38415f interfaceC38415f = (InterfaceC38415f) ((HashMap) c38417h.f164480w).get(obj.getClass());
                if (interfaceC38415f == null) {
                    for (InterfaceC38415f interfaceC38415f2 : ((HashMap) c38417h.f164480w).values()) {
                        if (interfaceC38415f2.mo49224b().isAssignableFrom(obj.getClass())) {
                            interfaceC38415f = interfaceC38415f2;
                            break;
                        }
                    }
                }
                if (interfaceC38415f == null) {
                    interfaceC38415f = C38417h.f164479x;
                }
                interfaceC38416gMo49223a = interfaceC38415f.mo49223a(obj);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        try {
            int i13 = this.f175863L;
            int i14 = this.f175864M;
            C29205p c29205p = new C29205p(17, this, enumC37323a);
            InterfaceC15485d interfaceC15485d = c40799xM132268c.f175952a;
            Object objMo43684b = interfaceC15485d.mo43684b();
            AbstractC29125c.m88539p(objMo43684b, "Argument must not be null");
            List list = (List) objMo43684b;
            try {
                InterfaceC40801z interfaceC40801zM132306a = c40799xM132268c.m132306a(interfaceC38416gMo49223a, c37330h2, i13, i14, c29205p, list);
                interfaceC15485d.mo43683a(list);
                interfaceC38416gMo49223a.mo40832a();
                return interfaceC40801zM132306a;
            } catch (Throwable th4) {
                interfaceC15485d.mo43683a(list);
                throw th4;
            }
        } catch (Throwable th5) {
            interfaceC38416gMo49223a.mo40832a();
            throw th5;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m132274f() {
        InterfaceC40801z interfaceC40801zM132272d;
        boolean zM31609b;
        if (Log.isLoggable("DecodeJob", 2)) {
            m132278j(this.f175869R, "Retrieved data", "data: " + this.f175874W + ", cache key: " + this.f175872U + ", fetcher: " + this.f175876Y);
        }
        C40800y c40800y = null;
        try {
            interfaceC40801zM132272d = m132272d(this.f175876Y, this.f175874W, this.f175875X);
        } catch (GlideException e5) {
            InterfaceC37327e interfaceC37327e = this.f175873V;
            EnumC37323a enumC37323a = this.f175875X;
            e5.f20343x = interfaceC37327e;
            e5.f20344y = enumC37323a;
            e5.f20345z = null;
            this.f175883x.add(e5);
            interfaceC40801zM132272d = null;
        }
        if (interfaceC40801zM132272d == null) {
            m132282n();
            return;
        }
        EnumC37323a enumC37323a2 = this.f175875X;
        if (interfaceC40801zM132272d instanceof InterfaceC40797v) {
            ((InterfaceC40797v) interfaceC40801zM132272d).initialize();
        }
        if (((C40800y) this.f175857F.f173185y) != null) {
            c40800y = (C40800y) C40800y.f175955E.mo43684b();
            c40800y.f175959z = false;
            c40800y.f175958y = true;
            c40800y.f175957x = interfaceC40801zM132272d;
            interfaceC40801zM132272d = c40800y;
        }
        m132284p();
        C40791p c40791p = this.f175867P;
        synchronized (c40791p) {
            c40791p.f175921N = interfaceC40801zM132272d;
            c40791p.f175922O = enumC37323a2;
        }
        synchronized (c40791p) {
            try {
                c40791p.f175930x.m110831b();
                if (c40791p.f175928U) {
                    c40791p.f175921N.mo44996a();
                    c40791p.m132300h();
                } else {
                    if (c40791p.f175929w.f175910w.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (c40791p.f175923P) {
                        throw new IllegalStateException("Already have resource");
                    }
                    C40084b c40084b = c40791p.f175912E;
                    InterfaceC40801z interfaceC40801z = c40791p.f175921N;
                    boolean z4 = c40791p.f175919L;
                    C40793r c40793r = c40791p.f175918K;
                    InterfaceC40794s interfaceC40794s = c40791p.f175931y;
                    c40084b.getClass();
                    c40791p.f175926S = new C40795t(interfaceC40801z, z4, true, c40793r, interfaceC40794s);
                    c40791p.f175923P = true;
                    C40790o c40790o = c40791p.f175929w;
                    c40790o.getClass();
                    ArrayList<C40789n> arrayList = new ArrayList(c40790o.f175910w);
                    c40791p.m132297e(arrayList.size() + 1);
                    ((C40787l) c40791p.f175913F).m132291d(c40791p, c40791p.f175918K, c40791p.f175926S);
                    for (C40789n c40789n : arrayList) {
                        c40789n.f175909b.execute(new RunnableC40788m(c40791p, c40789n.f175908a, 1));
                    }
                    c40791p.m132296d();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f175880c0 = 5;
        try {
            C40132d c40132d = this.f175857F;
            if (((C40800y) c40132d.f173185y) != null) {
                C20162a c20162a = this.f175885z;
                C37330h c37330h = this.f175866O;
                c40132d.getClass();
                try {
                    c20162a.m56071a().mo9710j((InterfaceC37327e) c40132d.f173183w, new C40132d((InterfaceC37333k) c40132d.f173184x, (C40800y) c40132d.f173185y, c37330h));
                    ((C40800y) c40132d.f173185y).m132307d();
                } catch (Throwable th4) {
                    ((C40800y) c40132d.f173185y).m132307d();
                    throw th4;
                }
            }
            if (c40800y != null) {
                c40800y.m132307d();
            }
            C11789f c11789f = this.f175858G;
            synchronized (c11789f) {
                c11789f.f38231b = true;
                zM31609b = c11789f.m31609b();
            }
            if (zM31609b) {
                m132280l();
            }
        } catch (Throwable th5) {
            if (c40800y != null) {
                c40800y.m132307d();
            }
            throw th5;
        }
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC40781f m132275g() {
        int iM35485e = AbstractC12682p.m35485e(this.f175880c0);
        C40782g c40782g = this.f175882w;
        if (iM35485e == 1) {
            return new C40773a0(c40782g, this);
        }
        if (iM35485e == 2) {
            return new C40776c(c40782g.m132266a(), c40782g, this);
        }
        if (iM35485e == 3) {
            return new C40779d0(c40782g, this);
        }
        if (iM35485e == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(AbstractC40783h.m132271a(this.f175880c0)));
    }

    /* JADX INFO: renamed from: h */
    public final int m132276h(int i13) {
        boolean z4;
        boolean z13;
        int iM35485e = AbstractC12682p.m35485e(i13);
        if (iM35485e == 0) {
            switch (this.f175865N.f175895a) {
                case 0:
                default:
                    z4 = true;
                    break;
                case 1:
                case 2:
                    z4 = false;
                    break;
            }
            if (z4) {
                return 2;
            }
            return m132276h(2);
        }
        if (iM35485e != 1) {
            if (iM35485e == 2) {
                return 4;
            }
            if (iM35485e == 3 || iM35485e == 5) {
                return 6;
            }
            throw new IllegalArgumentException("Unrecognized stage: ".concat(AbstractC40783h.m132271a(i13)));
        }
        switch (this.f175865N.f175895a) {
            case 0:
            case 2:
            default:
                z13 = true;
                break;
            case 1:
                z13 = false;
                break;
        }
        if (z13) {
            return 3;
        }
        return m132276h(3);
    }

    /* JADX INFO: renamed from: i */
    public final void m132277i(C4961c c4961c, Object obj, C40793r c40793r, InterfaceC37327e interfaceC37327e, int i13, int i14, Class cls, Class cls2, EnumC4962d enumC4962d, C40786k c40786k, Map map, boolean z4, boolean z13, C37330h c37330h, C40791p c40791p, int i15) {
        C40782g c40782g = this.f175882w;
        c40782g.f175840c = c4961c;
        c40782g.f175841d = obj;
        c40782g.f175851n = interfaceC37327e;
        c40782g.f175842e = i13;
        c40782g.f175843f = i14;
        c40782g.f175853p = c40786k;
        c40782g.f175844g = cls;
        c40782g.f175845h = this.f175885z;
        c40782g.f175848k = cls2;
        c40782g.f175852o = enumC4962d;
        c40782g.f175846i = c37330h;
        c40782g.f175847j = map;
        c40782g.f175854q = z4;
        c40782g.f175855r = z13;
        this.f175859H = c4961c;
        this.f175860I = interfaceC37327e;
        this.f175861J = enumC4962d;
        this.f175862K = c40793r;
        this.f175863L = i13;
        this.f175864M = i14;
        this.f175865N = c40786k;
        this.f175866O = c37330h;
        this.f175867P = c40791p;
        this.f175868Q = i15;
        this.f175881d0 = 1;
        this.f175870S = obj;
    }

    /* JADX INFO: renamed from: j */
    public final void m132278j(long j7, String str, String str2) {
        StringBuilder sbM35484d = AbstractC12682p.m35484d(str, " in ");
        sbM35484d.append(AbstractC33908g.m107258a(j7));
        sbM35484d.append(", load key: ");
        sbM35484d.append(this.f175862K);
        sbM35484d.append(str2 != null ? ", ".concat(str2) : "");
        sbM35484d.append(", thread: ");
        sbM35484d.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sbM35484d.toString());
    }

    /* JADX INFO: renamed from: k */
    public final void m132279k() {
        boolean zM31609b;
        m132284p();
        GlideException glideException = new GlideException("Failed to load resource", new ArrayList(this.f175883x));
        C40791p c40791p = this.f175867P;
        synchronized (c40791p) {
            c40791p.f175924Q = glideException;
        }
        synchronized (c40791p) {
            try {
                c40791p.f175930x.m110831b();
                if (c40791p.f175928U) {
                    c40791p.m132300h();
                } else {
                    if (c40791p.f175929w.f175910w.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (c40791p.f175925R) {
                        throw new IllegalStateException("Already failed once");
                    }
                    c40791p.f175925R = true;
                    C40793r c40793r = c40791p.f175918K;
                    C40790o c40790o = c40791p.f175929w;
                    c40790o.getClass();
                    ArrayList<C40789n> arrayList = new ArrayList(c40790o.f175910w);
                    c40791p.m132297e(arrayList.size() + 1);
                    ((C40787l) c40791p.f175913F).m132291d(c40791p, c40793r, null);
                    for (C40789n c40789n : arrayList) {
                        c40789n.f175909b.execute(new RunnableC40788m(c40791p, c40789n.f175908a, 0));
                    }
                    c40791p.m132296d();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        C11789f c11789f = this.f175858G;
        synchronized (c11789f) {
            c11789f.f38232c = true;
            zM31609b = c11789f.m31609b();
        }
        if (zM31609b) {
            m132280l();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m132280l() {
        C11789f c11789f = this.f175858G;
        synchronized (c11789f) {
            c11789f.f38231b = false;
            c11789f.f38230a = false;
            c11789f.f38232c = false;
        }
        C40132d c40132d = this.f175857F;
        c40132d.f173183w = null;
        c40132d.f173184x = null;
        c40132d.f173185y = null;
        C40782g c40782g = this.f175882w;
        c40782g.f175840c = null;
        c40782g.f175841d = null;
        c40782g.f175851n = null;
        c40782g.f175844g = null;
        c40782g.f175848k = null;
        c40782g.f175846i = null;
        c40782g.f175852o = null;
        c40782g.f175847j = null;
        c40782g.f175853p = null;
        c40782g.f175838a.clear();
        c40782g.f175849l = false;
        c40782g.f175839b.clear();
        c40782g.f175850m = false;
        this.f175878a0 = false;
        this.f175859H = null;
        this.f175860I = null;
        this.f175866O = null;
        this.f175861J = null;
        this.f175862K = null;
        this.f175867P = null;
        this.f175880c0 = 0;
        this.f175877Z = null;
        this.f175871T = null;
        this.f175872U = null;
        this.f175874W = null;
        this.f175875X = null;
        this.f175876Y = null;
        this.f175869R = 0L;
        this.f175879b0 = false;
        this.f175870S = null;
        this.f175883x.clear();
        this.f175856E.mo43683a(this);
    }

    /* JADX INFO: renamed from: m */
    public final void m132281m() {
        this.f175881d0 = 2;
        C40791p c40791p = this.f175867P;
        (c40791p.f175920M ? c40791p.f175916I : c40791p.f175915H).execute(this);
    }

    /* JADX INFO: renamed from: n */
    public final void m132282n() {
        this.f175871T = Thread.currentThread();
        int i13 = AbstractC33908g.f142084b;
        this.f175869R = SystemClock.elapsedRealtimeNanos();
        boolean zMo132263b = false;
        while (!this.f175879b0 && this.f175877Z != null && !(zMo132263b = this.f175877Z.mo132263b())) {
            this.f175880c0 = m132276h(this.f175880c0);
            this.f175877Z = m132275g();
            if (this.f175880c0 == 4) {
                m132281m();
                return;
            }
        }
        if ((this.f175880c0 == 6 || this.f175879b0) && !zMo132263b) {
            m132279k();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m132283o() {
        String str;
        int iM35485e = AbstractC12682p.m35485e(this.f175881d0);
        if (iM35485e == 0) {
            this.f175880c0 = m132276h(1);
            this.f175877Z = m132275g();
            m132282n();
        } else {
            if (iM35485e == 1) {
                m132282n();
                return;
            }
            if (iM35485e == 2) {
                m132274f();
                return;
            }
            int i13 = this.f175881d0;
            if (i13 == 1) {
                str = "INITIALIZE";
            } else if (i13 != 2) {
                str = i13 != 3 ? "null" : "DECODE_DATA";
            } else {
                str = "SWITCH_TO_SOURCE_SERVICE";
            }
            throw new IllegalStateException("Unrecognized run reason: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m132284p() {
        this.f175884y.m110831b();
        if (this.f175878a0) {
            throw new IllegalStateException("Already notified", this.f175883x.isEmpty() ? null : (Throwable) AbstractC25012a.m73371d(this.f175883x, 1));
        }
        this.f175878a0 = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC38414e interfaceC38414e = this.f175876Y;
        try {
            try {
                if (this.f175879b0) {
                    m132279k();
                    if (interfaceC38414e != null) {
                        interfaceC38414e.mo33597a();
                        return;
                    }
                    return;
                }
                m132283o();
                if (interfaceC38414e != null) {
                    interfaceC38414e.mo33597a();
                }
            } catch (Throwable th3) {
                if (interfaceC38414e != null) {
                    interfaceC38414e.mo33597a();
                }
                throw th3;
            }
        } catch (C40774b e5) {
            throw e5;
        } catch (Throwable th4) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f175879b0 + ", stage: " + AbstractC40783h.m132271a(this.f175880c0), th4);
            }
            if (this.f175880c0 != 5) {
                this.f175883x.add(th4);
                m132279k();
            }
            if (!this.f175879b0) {
                throw th4;
            }
            throw th4;
        }
    }
}
