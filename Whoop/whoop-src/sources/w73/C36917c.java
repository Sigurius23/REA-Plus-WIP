package w73;

import b83.C2806b;
import bi.AbstractC3269g;
import java.util.concurrent.atomic.AtomicInteger;
import l73.InterfaceC23413d;
import n73.InterfaceC26443b;
import q30.C29934u0;
import q73.EnumC30024c;
import r73.AbstractC31056a;
import x73.C38045b;

/* JADX INFO: renamed from: w73.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C36917c extends AtomicInteger implements InterfaceC26443b {

    /* JADX INFO: renamed from: E */
    public final C38045b f157961E;

    /* JADX INFO: renamed from: F */
    public volatile boolean f157962F;

    /* JADX INFO: renamed from: G */
    public volatile boolean f157963G;

    /* JADX INFO: renamed from: H */
    public final C2806b f157964H = new C2806b();

    /* JADX INFO: renamed from: I */
    public int f157965I;

    /* JADX INFO: renamed from: J */
    public int f157966J;

    /* JADX INFO: renamed from: w */
    public final InterfaceC23413d f157967w;

    /* JADX INFO: renamed from: x */
    public final C29934u0 f157968x;

    /* JADX INFO: renamed from: y */
    public final C36916b[] f157969y;

    /* JADX INFO: renamed from: z */
    public Object[] f157970z;

    public C36917c(InterfaceC23413d interfaceC23413d, C29934u0 c29934u0, int i13, int i14) {
        this.f157967w = interfaceC23413d;
        this.f157968x = c29934u0;
        this.f157970z = new Object[i13];
        C36916b[] c36916bArr = new C36916b[i13];
        for (int i15 = 0; i15 < i13; i15++) {
            c36916bArr[i15] = new C36916b(this, i15);
        }
        this.f157969y = c36916bArr;
        this.f157961E = new C38045b(i14);
    }

    /* JADX INFO: renamed from: a */
    public final void m118545a() {
        for (C36916b c36916b : this.f157969y) {
            c36916b.getClass();
            EnumC30024c.m91915a(c36916b);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m118546b(C38045b c38045b) {
        synchronized (this) {
            this.f157970z = null;
        }
        c38045b.clear();
    }

    /* JADX INFO: renamed from: c */
    public final void m118547c() {
        if (getAndIncrement() != 0) {
            return;
        }
        C38045b c38045b = this.f157961E;
        InterfaceC23413d interfaceC23413d = this.f157967w;
        int iAddAndGet = 1;
        while (!this.f157962F) {
            if (this.f157964H.get() != null) {
                m118545a();
                m118546b(c38045b);
                interfaceC23413d.onError(this.f157964H.m7992b());
                return;
            }
            boolean z4 = this.f157963G;
            Object[] objArr = (Object[]) c38045b.poll();
            boolean z13 = objArr == null;
            if (z4 && z13) {
                m118546b(c38045b);
                Throwable thM7992b = this.f157964H.m7992b();
                if (thM7992b == null) {
                    interfaceC23413d.onComplete();
                    return;
                } else {
                    interfaceC23413d.onError(thM7992b);
                    return;
                }
            }
            if (z13) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                try {
                    Object objM91539z = this.f157968x.m91539z(objArr);
                    AbstractC31056a.m95616a(objM91539z, "The combiner returned a null value");
                    interfaceC23413d.onNext(objM91539z);
                } catch (Throwable th3) {
                    AbstractC3269g.m9495a0(th3);
                    this.f157964H.m7991a(th3);
                    m118545a();
                    m118546b(c38045b);
                    interfaceC23413d.onError(this.f157964H.m7992b());
                    return;
                }
            }
        }
        m118546b(c38045b);
    }

    @Override // n73.InterfaceC26443b
    public final void dispose() {
        if (this.f157962F) {
            return;
        }
        this.f157962F = true;
        m118545a();
        if (getAndIncrement() == 0) {
            m118546b(this.f157961E);
        }
    }

    @Override // n73.InterfaceC26443b
    public final boolean isDisposed() {
        return this.f157962F;
    }
}
