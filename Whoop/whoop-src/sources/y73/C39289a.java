package y73;

import java.util.concurrent.TimeUnit;
import l73.AbstractC23415f;
import n73.C26442a;
import n73.InterfaceC26443b;
import q73.C30026e;
import q73.EnumC30025d;

/* JADX INFO: renamed from: y73.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C39289a extends AbstractC23415f {

    /* JADX INFO: renamed from: E */
    public volatile boolean f169047E;

    /* JADX INFO: renamed from: w */
    public final C30026e f169048w;

    /* JADX INFO: renamed from: x */
    public final C26442a f169049x;

    /* JADX INFO: renamed from: y */
    public final C30026e f169050y;

    /* JADX INFO: renamed from: z */
    public final C39291c f169051z;

    public C39289a(C39291c c39291c) {
        this.f169051z = c39291c;
        C30026e c30026e = new C30026e();
        this.f169048w = c30026e;
        C26442a c26442a = new C26442a();
        this.f169049x = c26442a;
        C30026e c30026e2 = new C30026e();
        this.f169050y = c30026e2;
        c30026e2.mo78293a(c30026e);
        c30026e2.mo78293a(c26442a);
    }

    @Override // l73.AbstractC23415f
    /* JADX INFO: renamed from: a */
    public final InterfaceC26443b mo67906a(Runnable runnable, long j7, TimeUnit timeUnit) {
        return this.f169047E ? EnumC30025d.f122538w : this.f169051z.m125268c(runnable, j7, timeUnit, this.f169049x);
    }

    @Override // l73.AbstractC23415f
    /* JADX INFO: renamed from: b */
    public final void mo67907b(Runnable runnable) {
        if (this.f169047E) {
            return;
        }
        this.f169051z.m125268c(runnable, 0L, TimeUnit.MILLISECONDS, this.f169048w);
    }

    @Override // n73.InterfaceC26443b
    public final void dispose() {
        if (this.f169047E) {
            return;
        }
        this.f169047E = true;
        this.f169050y.dispose();
    }

    @Override // n73.InterfaceC26443b
    public final boolean isDisposed() {
        return this.f169047E;
    }
}
