package p313lz;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1601k1;
import bc3.AbstractC3006f0;
import bc3.AbstractC3076z;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13078q1;
import ec3.C13096w1;
import h20.C16670i0;
import kz.AbstractC22907d;
import p442qy.C30765d;
import p619xl.C38445a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: lz.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C24812i extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E */
    public final C13096w1 f97135E;

    /* JADX INFO: renamed from: F */
    public final C13078q1 f97136F;

    /* JADX INFO: renamed from: G */
    public final C13045h2 f97137G;

    /* JADX INFO: renamed from: w */
    public final C30765d f97138w;

    /* JADX INFO: renamed from: x */
    public final C38445a f97139x;

    /* JADX INFO: renamed from: y */
    public final AbstractC3076z f97140y;

    /* JADX INFO: renamed from: z */
    public final AbstractC22907d f97141z;

    public C24812i(C30765d logger, C1601k1 c1601k1, C38445a c38445a, AbstractC3076z workContext, String str) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(workContext, "workContext");
        this.f97138w = logger;
        this.f97139x = c38445a;
        this.f97140y = workContext;
        AbstractC22907d abstractC22907d = (AbstractC22907d) c1601k1.m5001b("FinancialConnectionsSheetActivityArgs");
        if (abstractC22907d == null) {
            throw new IllegalStateException("Missing arguments");
        }
        this.f97141z = abstractC22907d;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.f97135E = c13096w1M36592b;
        this.f97136F = AbstractC13091v.m36597g(c13096w1M36592b);
        this.f97137G = AbstractC13091v.m36593c(null);
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), workContext, null, new C24804a(this, str, (InterfaceC30057d) null), 2);
    }

    /* JADX INFO: renamed from: g */
    public final void m72715g(String str, Throwable th3) {
        this.f97138w.m94512b(str, th3);
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C16670i0(this, th3, (InterfaceC30057d) null, 22), 3);
    }
}
