package p355o2;

import p005a3.C0227m1;
import p270k2.InterfaceC22131e;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o2.b0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC27425b0 {

    /* JADX INFO: renamed from: a */
    public Function1 f110500a;

    /* JADX INFO: renamed from: a */
    public abstract void mo82851a(InterfaceC22131e interfaceC22131e);

    /* JADX INFO: renamed from: b */
    public Function1 mo82852b() {
        return this.f110500a;
    }

    /* JADX INFO: renamed from: c */
    public final void m82857c() {
        Function1 function1Mo82852b = mo82852b();
        if (function1Mo82852b != null) {
            function1Mo82852b.invoke(this);
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo82853d(C0227m1 c0227m1) {
        this.f110500a = c0227m1;
    }
}
