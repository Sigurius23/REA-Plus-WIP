package v73;

import a83.EnumC0574b;
import java.util.concurrent.Callable;
import l73.AbstractC23410a;
import l73.InterfaceC23411b;

/* JADX INFO: renamed from: v73.b */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC35776b extends AbstractC23410a implements Callable {

    /* JADX INFO: renamed from: x */
    public static final CallableC35776b f152145x = new CallableC35776b();

    @Override // l73.AbstractC23410a
    /* JADX INFO: renamed from: c */
    public final void mo36114c(InterfaceC23411b interfaceC23411b) {
        interfaceC23411b.mo36113b(EnumC0574b.f2047w);
        interfaceC23411b.onComplete();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return null;
    }
}
