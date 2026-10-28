package p684zk;

import cl.ExecutorServiceC4794b;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p085d9.C11789f;
import p167g5.InterfaceC15485d;
import p474s.C31983m2;
import p526ul.C35058d;
import p526ul.InterfaceC35056b;
import p586wk.EnumC37323a;
import p671z5.C40084b;
import pf.AbstractC29125c;
import pl.C29342e;
import tl.AbstractC33907f;

/* JADX INFO: renamed from: zk.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C40791p implements InterfaceC35056b {

    /* JADX INFO: renamed from: V */
    public static final C40084b f175911V = new C40084b();

    /* JADX INFO: renamed from: F */
    public final InterfaceC40792q f175913F;

    /* JADX INFO: renamed from: G */
    public final ExecutorServiceC4794b f175914G;

    /* JADX INFO: renamed from: H */
    public final ExecutorServiceC4794b f175915H;

    /* JADX INFO: renamed from: I */
    public final ExecutorServiceC4794b f175916I;

    /* JADX INFO: renamed from: K */
    public C40793r f175918K;

    /* JADX INFO: renamed from: L */
    public boolean f175919L;

    /* JADX INFO: renamed from: M */
    public boolean f175920M;

    /* JADX INFO: renamed from: N */
    public InterfaceC40801z f175921N;

    /* JADX INFO: renamed from: O */
    public EnumC37323a f175922O;

    /* JADX INFO: renamed from: P */
    public boolean f175923P;

    /* JADX INFO: renamed from: Q */
    public GlideException f175924Q;

    /* JADX INFO: renamed from: R */
    public boolean f175925R;

    /* JADX INFO: renamed from: S */
    public C40795t f175926S;

    /* JADX INFO: renamed from: T */
    public RunnableC40784i f175927T;

    /* JADX INFO: renamed from: U */
    public volatile boolean f175928U;

    /* JADX INFO: renamed from: y */
    public final InterfaceC40794s f175931y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC15485d f175932z;

    /* JADX INFO: renamed from: w */
    public final C40790o f175929w = new C40790o(new ArrayList(2));

    /* JADX INFO: renamed from: x */
    public final C35058d f175930x = new C35058d();

    /* JADX INFO: renamed from: J */
    public final AtomicInteger f175917J = new AtomicInteger();

    /* JADX INFO: renamed from: E */
    public final C40084b f175912E = f175911V;

    public C40791p(ExecutorServiceC4794b executorServiceC4794b, ExecutorServiceC4794b executorServiceC4794b2, ExecutorServiceC4794b executorServiceC4794b3, ExecutorServiceC4794b executorServiceC4794b4, C40787l c40787l, C40787l c40787l2, C31983m2 c31983m2) {
        this.f175914G = executorServiceC4794b;
        this.f175915H = executorServiceC4794b2;
        this.f175916I = executorServiceC4794b4;
        this.f175913F = c40787l;
        this.f175931y = c40787l2;
        this.f175932z = c31983m2;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m132294a(C29342e c29342e, Executor executor) {
        try {
            this.f175930x.m110831b();
            this.f175929w.f175910w.add(new C40789n(c29342e, executor));
            if (this.f175923P) {
                m132297e(1);
                executor.execute(new RunnableC40788m(this, c29342e, 1));
            } else if (this.f175925R) {
                m132297e(1);
                executor.execute(new RunnableC40788m(this, c29342e, 0));
            } else {
                AbstractC29125c.m88537n(!this.f175928U, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // p526ul.InterfaceC35056b
    /* JADX INFO: renamed from: b */
    public final C35058d mo9724b() {
        return this.f175930x;
    }

    /* JADX INFO: renamed from: c */
    public final void m132295c() {
        if (m132299g()) {
            return;
        }
        this.f175928U = true;
        RunnableC40784i runnableC40784i = this.f175927T;
        runnableC40784i.f175879b0 = true;
        InterfaceC40781f interfaceC40781f = runnableC40784i.f175877Z;
        if (interfaceC40781f != null) {
            interfaceC40781f.cancel();
        }
        InterfaceC40792q interfaceC40792q = this.f175913F;
        C40793r c40793r = this.f175918K;
        C40787l c40787l = (C40787l) interfaceC40792q;
        synchronized (c40787l) {
            C40798w c40798w = c40787l.f175897a;
            c40798w.getClass();
            HashMap map = (HashMap) c40798w.f175951a;
            if (equals(map.get(c40793r))) {
                map.remove(c40793r);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m132296d() {
        C40795t c40795t;
        synchronized (this) {
            try {
                this.f175930x.m110831b();
                AbstractC29125c.m88537n(m132299g(), "Not yet complete!");
                int iDecrementAndGet = this.f175917J.decrementAndGet();
                AbstractC29125c.m88537n(iDecrementAndGet >= 0, "Can't decrement below 0");
                if (iDecrementAndGet == 0) {
                    c40795t = this.f175926S;
                    m132300h();
                } else {
                    c40795t = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (c40795t != null) {
            c40795t.m132305e();
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m132297e(int i13) {
        C40795t c40795t;
        AbstractC29125c.m88537n(m132299g(), "Not yet complete!");
        if (this.f175917J.getAndAdd(i13) == 0 && (c40795t = this.f175926S) != null) {
            c40795t.m132303b();
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m132298f(C40793r c40793r, boolean z4, boolean z13) {
        this.f175918K = c40793r;
        this.f175919L = z4;
        this.f175920M = z13;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m132299g() {
        return this.f175925R || this.f175923P || this.f175928U;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m132300h() {
        boolean zM31609b;
        if (this.f175918K == null) {
            throw new IllegalArgumentException();
        }
        this.f175929w.f175910w.clear();
        this.f175918K = null;
        this.f175926S = null;
        this.f175921N = null;
        this.f175925R = false;
        this.f175928U = false;
        this.f175923P = false;
        RunnableC40784i runnableC40784i = this.f175927T;
        C11789f c11789f = runnableC40784i.f175858G;
        synchronized (c11789f) {
            c11789f.f38230a = true;
            zM31609b = c11789f.m31609b();
        }
        if (zM31609b) {
            runnableC40784i.m132280l();
        }
        this.f175927T = null;
        this.f175924Q = null;
        this.f175922O = null;
        this.f175932z.mo43683a(this);
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m132301i(C29342e c29342e) {
        try {
            this.f175930x.m110831b();
            this.f175929w.f175910w.remove(new C40789n(c29342e, AbstractC33907f.f142082b));
            if (this.f175929w.f175910w.isEmpty()) {
                m132295c();
                if (this.f175923P || this.f175925R) {
                    if (this.f175917J.get() == 0) {
                        m132300h();
                    }
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m132302j(RunnableC40784i runnableC40784i) {
        ExecutorServiceC4794b executorServiceC4794b;
        this.f175927T = runnableC40784i;
        int iM132276h = runnableC40784i.m132276h(1);
        if (iM132276h == 2 || iM132276h == 3) {
            executorServiceC4794b = this.f175914G;
        } else {
            executorServiceC4794b = this.f175920M ? this.f175916I : this.f175915H;
        }
        executorServiceC4794b.execute(runnableC40784i);
    }
}
