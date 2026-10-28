package p097ds;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p031b9.AbstractC2875y;
import p035bp.AbstractC3511b;
import p465rm.C31559p;
import rs.AbstractC31780b;

/* JADX INFO: renamed from: ds.o */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC12312o extends AbstractC12311n implements Runnable, InterfaceC12304g {

    /* JADX INFO: renamed from: H */
    public C12320w f41238H;

    /* JADX INFO: renamed from: I */
    public C31559p f41239I;

    @Override // p097ds.AbstractC12311n
    /* JADX INFO: renamed from: c */
    public final void mo34244c() {
        C12320w c12320w = this.f41238H;
        boolean z4 = false;
        if ((c12320w != null) & (this.f41235w instanceof C12298a)) {
            Object obj = this.f41235w;
            if ((obj instanceof C12298a) && ((C12298a) obj).f41207a) {
                z4 = true;
            }
            c12320w.cancel(z4);
        }
        this.f41238H = null;
        this.f41239I = null;
    }

    @Override // p097ds.AbstractC12311n
    /* JADX INFO: renamed from: i */
    public final String mo34246i() {
        String str;
        C12320w c12320w = this.f41238H;
        C31559p c31559p = this.f41239I;
        String strMo34246i = super.mo34246i();
        if (c12320w != null) {
            str = "inputFuture=[" + c12320w + "], ";
        } else {
            str = "";
        }
        if (c31559p == null) {
            if (strMo34246i != null) {
                return AbstractC2875y.m8299l(str, strMo34246i);
            }
            return null;
        }
        return str + "function=[" + c31559p + "]";
    }

    @Override // p097ds.AbstractC12311n, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f41235w instanceof C12298a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C12299b c12299b;
        C12320w c12320w = this.f41238H;
        C31559p c31559p = this.f41239I;
        if (((this.f41235w instanceof C12298a) | (c12320w == null)) || (c31559p == null)) {
            return;
        }
        this.f41238H = null;
        if (c12320w.f41235w instanceof C12298a) {
            Object obj = this.f41235w;
            if (obj == null) {
                if (c12320w.isDone()) {
                    if (AbstractC12311n.f41232F.mo9534k(this, null, AbstractC12311n.m34242h(c12320w))) {
                        AbstractC12311n.m34239e(this, false);
                        return;
                    }
                    return;
                }
                RunnableC12302e runnableC12302e = new RunnableC12302e(this, c12320w);
                if (AbstractC12311n.f41232F.mo9534k(this, null, runnableC12302e)) {
                    try {
                        c12320w.mo31061a(runnableC12302e, EnumC12315r.f41243w);
                        return;
                    } catch (Throwable th3) {
                        try {
                            c12299b = new C12299b(th3);
                        } catch (Error | Exception unused) {
                            c12299b = C12299b.f41209b;
                        }
                        AbstractC12311n.f41232F.mo9534k(this, runnableC12302e, c12299b);
                        return;
                    }
                }
                obj = this.f41235w;
            }
            if (obj instanceof C12298a) {
                c12320w.cancel(((C12298a) obj).f41207a);
                return;
            }
            return;
        }
        try {
            if (!c12320w.isDone()) {
                throw new IllegalStateException(AbstractC31780b.m98690k("Future was expected to be done: %s", c12320w));
            }
            try {
                Object objApply = c31559p.apply(AbstractC3511b.m10395x(c12320w));
                this.f41239I = null;
                if (objApply == null) {
                    objApply = AbstractC12311n.f41233G;
                }
                if (AbstractC12311n.f41232F.mo9534k(this, null, objApply)) {
                    AbstractC12311n.m34239e(this, false);
                }
            } catch (Throwable th4) {
                try {
                    if (th4 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    m34248k(th4);
                } finally {
                    this.f41239I = null;
                }
            }
        } catch (Error e5) {
            m34248k(e5);
        } catch (CancellationException unused2) {
            cancel(false);
        } catch (ExecutionException e13) {
            m34248k(e13.getCause());
        } catch (Exception e14) {
            m34248k(e14);
        }
    }
}
