package i20;

import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.C2996c2;
import hc3.C17171d;
import java.util.concurrent.CancellationException;
import n53.C26324g;
import p028b4.C2698i;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import t23.C33425n0;

/* JADX INFO: renamed from: i20.q0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C17972q0 {

    /* JADX INFO: renamed from: a */
    public C2996c2 f69795a;

    /* JADX INFO: renamed from: a */
    public void m51590a(C17171d c17171d, C26324g config, C33425n0 c33425n0) {
        AbstractC22676k.m65750j(config, "config");
        C2996c2 c2996c2 = this.f69795a;
        InterfaceC30057d interfaceC30057d = null;
        if (c2996c2 != null) {
            c2996c2.cancel((CancellationException) null);
        }
        long jLongValue = ((Number) config.f104649a.invoke()).longValue();
        if (jLongValue <= 0) {
            c33425n0.invoke();
        } else {
            this.f69795a = AbstractC3006f0.m8732z(c17171d, AbstractC3050q0.f12078b, null, new C2698i(jLongValue, c33425n0, interfaceC30057d, 3), 2);
        }
    }
}
