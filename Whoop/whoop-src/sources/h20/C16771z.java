package h20;

import a20.C0162b;
import bc3.AbstractC3006f0;
import e30.C12603a;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import p337n8.C26444a;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29808b;

/* JADX INFO: renamed from: h20.z */
/* JADX INFO: loaded from: classes6.dex */
public final class C16771z {

    /* JADX INFO: renamed from: a */
    public final C13081r1 f64457a;

    /* JADX INFO: renamed from: b */
    public final String f64458b;

    /* JADX INFO: renamed from: c */
    public final C12603a f64459c;

    /* JADX INFO: renamed from: d */
    public final C12603a f64460d;

    /* JADX INFO: renamed from: e */
    public final C13045h2 f64461e;

    /* JADX INFO: renamed from: f */
    public final C13045h2 f64462f;

    public C16771z(C26444a c26444a, C13081r1 c13081r1, String merchantDisplayName, C12603a c12603a, C12603a c12603a2) {
        AbstractC22676k.m65750j(merchantDisplayName, "merchantDisplayName");
        this.f64457a = c13081r1;
        this.f64458b = merchantDisplayName;
        this.f64459c = c12603a;
        this.f64460d = c12603a2;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(null);
        this.f64461e = c13045h2M36593c;
        this.f64462f = c13045h2M36593c;
        AbstractC3006f0.m8732z(c26444a, null, null, new C0162b(this, null, 26), 3);
    }

    /* JADX INFO: renamed from: a */
    public final void m47279a(InterfaceC41211c interfaceC41211c, boolean z4) {
        C29808b c29808b;
        if (interfaceC41211c != null) {
            c29808b = new C29808b(interfaceC41211c, z4 || ((Boolean) this.f64459c.invoke()).booleanValue());
        } else {
            c29808b = null;
        }
        this.f64461e.m36570j(c29808b);
    }
}
