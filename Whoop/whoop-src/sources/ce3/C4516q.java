package ce3;

import c93.InterfaceC4339a;
import de3.C11991a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import l83.C23454a0;
import le3.C23885f;
import ne3.C26616h;
import ne3.C26617h0;
import ne3.C26621j0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p005a3.C0212i2;
import p474s.C31983m2;
import p715kotlin.jvm.internal.AbstractC22676k;
import wd3.AbstractC37172f;
import wd3.AbstractC37174h;
import yd3.C39472c;
import yd3.C39473d;

/* JADX INFO: renamed from: ce3.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C4516q implements Closeable {

    /* JADX INFO: renamed from: a0 */
    public static final C4503d0 f18183a0;

    /* JADX INFO: renamed from: E */
    public int f18184E;

    /* JADX INFO: renamed from: F */
    public boolean f18185F;

    /* JADX INFO: renamed from: G */
    public final C39473d f18186G;

    /* JADX INFO: renamed from: H */
    public final C39472c f18187H;

    /* JADX INFO: renamed from: I */
    public final C39472c f18188I;

    /* JADX INFO: renamed from: J */
    public final C39472c f18189J;

    /* JADX INFO: renamed from: K */
    public final C4501c0 f18190K;

    /* JADX INFO: renamed from: L */
    public long f18191L;

    /* JADX INFO: renamed from: M */
    public long f18192M;

    /* JADX INFO: renamed from: N */
    public long f18193N;

    /* JADX INFO: renamed from: O */
    public long f18194O;

    /* JADX INFO: renamed from: P */
    public long f18195P;

    /* JADX INFO: renamed from: Q */
    public final C4498b f18196Q;

    /* JADX INFO: renamed from: R */
    public final C4503d0 f18197R;

    /* JADX INFO: renamed from: S */
    public C4503d0 f18198S;

    /* JADX INFO: renamed from: T */
    public final C11991a f18199T;

    /* JADX INFO: renamed from: U */
    public long f18200U;

    /* JADX INFO: renamed from: V */
    public long f18201V;

    /* JADX INFO: renamed from: W */
    public final C31983m2 f18202W;

    /* JADX INFO: renamed from: X */
    public final C4525z f18203X;

    /* JADX INFO: renamed from: Y */
    public final C4515p f18204Y;

    /* JADX INFO: renamed from: Z */
    public final LinkedHashSet f18205Z;

    /* JADX INFO: renamed from: w */
    public final AbstractC4513n f18206w;

    /* JADX INFO: renamed from: x */
    public final LinkedHashMap f18207x = new LinkedHashMap();

    /* JADX INFO: renamed from: y */
    public final String f18208y;

    /* JADX INFO: renamed from: z */
    public int f18209z;

    static {
        C4503d0 c4503d0 = new C4503d0();
        c4503d0.m14120c(4, 65535);
        c4503d0.m14120c(5, DfuBaseService.ERROR_CONNECTION_MASK);
        f18183a0 = c4503d0;
    }

    public C4516q(C0212i2 c0212i2) {
        this.f18206w = (AbstractC4513n) c0212i2.f708e;
        String str = (String) c0212i2.f707d;
        if (str == null) {
            AbstractC22676k.m65757q("connectionName");
            throw null;
        }
        this.f18208y = str;
        this.f18184E = 3;
        C39473d c39473d = (C39473d) c0212i2.f705b;
        this.f18186G = c39473d;
        C39472c c39472cM126126d = c39473d.m126126d();
        this.f18187H = c39472cM126126d;
        this.f18188I = c39473d.m126126d();
        this.f18189J = c39473d.m126126d();
        this.f18190K = C4501c0.f18134a;
        this.f18196Q = (C4498b) c0212i2.f709f;
        C4503d0 c4503d0 = new C4503d0();
        c4503d0.m14120c(4, 16777216);
        this.f18197R = c4503d0;
        C4503d0 c4503d1 = f18183a0;
        this.f18198S = c4503d1;
        this.f18199T = new C11991a(0);
        this.f18201V = c4503d1.m14118a();
        C31983m2 c31983m2 = (C31983m2) c0212i2.f706c;
        if (c31983m2 == null) {
            AbstractC22676k.m65757q("socket");
            throw null;
        }
        this.f18202W = c31983m2;
        this.f18203X = new C4525z((C26617h0) c31983m2.f132770y);
        this.f18204Y = new C4515p(0, this, new C4520u((C26621j0) c31983m2.f132769x));
        this.f18205Z = new LinkedHashSet();
        int i13 = c0212i2.f704a;
        if (i13 != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i13);
            String name = str.concat(" ping");
            C4507h c4507h = new C4507h(this, nanos, 0);
            AbstractC22676k.m65750j(name, "name");
            c39472cM126126d.m126120d(new C23885f(name, c4507h), nanos);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m14132J(final int i13, final long j7) {
        C39472c.m126116c(this.f18187H, this.f18208y + '[' + i13 + "] windowUpdate", 0L, new InterfaceC4339a() { // from class: ce3.i
            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                C4516q c4516q = this.f18161w;
                try {
                    c4516q.f18203X.m14159J(i13, j7);
                } catch (IOException e5) {
                    EnumC4496a enumC4496a = EnumC4496a.PROTOCOL_ERROR;
                    c4516q.m14133b(enumC4496a, enumC4496a, e5);
                }
                return C23454a0.f92919a;
            }
        }, 6);
    }

    /* JADX INFO: renamed from: b */
    public final void m14133b(EnumC4496a enumC4496a, EnumC4496a enumC4496a2, IOException iOException) {
        int i13;
        Object[] array;
        TimeZone timeZone = AbstractC37174h.f158962a;
        try {
            m14136k(enumC4496a);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f18207x.isEmpty()) {
                array = null;
            } else {
                array = this.f18207x.values().toArray(new C4524y[0]);
                this.f18207x.clear();
            }
        }
        C4524y[] c4524yArr = (C4524y[]) array;
        if (c4524yArr != null) {
            for (C4524y c4524y : c4524yArr) {
                try {
                    c4524y.m14151c(enumC4496a2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f18203X.close();
        } catch (IOException unused3) {
        }
        try {
            this.f18202W.cancel();
        } catch (IOException unused4) {
        }
        this.f18187H.m126122g();
        this.f18188I.m126122g();
        this.f18189J.m126122g();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m14133b(EnumC4496a.NO_ERROR, EnumC4496a.CANCEL, null);
    }

    /* JADX INFO: renamed from: h */
    public final C4524y m14134h(int i13) {
        C4524y c4524y;
        synchronized (this) {
            c4524y = (C4524y) this.f18207x.get(Integer.valueOf(i13));
        }
        return c4524y;
    }

    /* JADX INFO: renamed from: i */
    public final C4524y m14135i(int i13) {
        C4524y c4524y;
        synchronized (this) {
            c4524y = (C4524y) this.f18207x.remove(Integer.valueOf(i13));
            notifyAll();
        }
        return c4524y;
    }

    /* JADX INFO: renamed from: k */
    public final void m14136k(EnumC4496a enumC4496a) {
        synchronized (this.f18203X) {
            synchronized (this) {
                if (this.f18185F) {
                    return;
                }
                this.f18185F = true;
                this.f18203X.m14163k(this.f18209z, enumC4496a, AbstractC37172f.f158958a);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m14137m(long j7) {
        synchronized (this) {
            try {
                C11991a.m33037b(this.f18199T, j7, 0L, 2);
                long jM33038a = this.f18199T.m33038a();
                if (jM33038a >= this.f18197R.m14118a() / 2) {
                    m14132J(0, jM33038a);
                    C11991a.m33037b(this.f18199T, 0L, jM33038a, 1);
                }
                C4498b c4498b = this.f18196Q;
                C11991a windowCounter = this.f18199T;
                c4498b.getClass();
                AbstractC22676k.m65750j(windowCounter, "windowCounter");
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m14138s(int i13, boolean z4, C26616h c26616h, long j7) {
        long j13;
        long j14;
        int iMin;
        long j15;
        if (j7 == 0) {
            this.f18203X.m14161h(z4, i13, c26616h, 0);
            return;
        }
        while (j7 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j13 = this.f18200U;
                            j14 = this.f18201V;
                            if (j13 >= j14) {
                                if (!this.f18207x.containsKey(Integer.valueOf(i13))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                iMin = Math.min((int) Math.min(j7, j14 - j13), this.f18203X.f18256y);
                j15 = iMin;
                this.f18200U += j15;
            }
            j7 -= j15;
            this.f18203X.m14161h(z4 && j7 == 0, i13, c26616h, iMin);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m14139x(int i13, EnumC4496a enumC4496a) {
        C39472c.m126116c(this.f18187H, this.f18208y + '[' + i13 + "] writeSynReset", 0L, new C4509j(this, i13, enumC4496a), 6);
    }
}
