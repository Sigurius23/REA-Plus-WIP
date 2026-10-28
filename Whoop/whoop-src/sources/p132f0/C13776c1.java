package p132f0;

import androidx.compose.foundation.MutationInterruptedException;
import androidx.lifecycle.C1586g1;
import bc3.AbstractC3006f0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import mc3.AbstractC25438d;
import mc3.C25437c;
import p715kotlin.jvm.functions.Function1;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: f0.c1 */
/* JADX INFO: loaded from: classes.dex */
public final class C13776c1 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f49149a = new AtomicReference(null);

    /* JADX INFO: renamed from: b */
    public final C25437c f49150b = AbstractC25438d.m74669a();

    /* JADX INFO: renamed from: a */
    public static final void m39136a(C13776c1 c13776c1, C13770a1 c13770a1) {
        AtomicReference atomicReference = c13776c1.f49149a;
        while (true) {
            C13770a1 c13770a2 = (C13770a1) atomicReference.get();
            if (c13770a2 != null && c13770a1.f49122a.compareTo(c13770a2.f49122a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            do {
                if (atomicReference.compareAndSet(c13770a2, c13770a1)) {
                    if (c13770a2 != null) {
                        c13770a2.f49123b.cancel((CancellationException) new MutationInterruptedException());
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == c13770a2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Object m39137b(C13776c1 c13776c1, Function1 function1, AbstractC32275i abstractC32275i) {
        EnumC13840z0 enumC13840z0 = EnumC13840z0.f49374w;
        c13776c1.getClass();
        return AbstractC3006f0.m8719m(new C1586g1(enumC13840z0, c13776c1, function1, null), abstractC32275i);
    }
}
