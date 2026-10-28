package androidx.lifecycle;

import bc3.InterfaceC3027k1;
import java.util.concurrent.CancellationException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.lifecycle.z */
/* JADX INFO: loaded from: classes.dex */
public final class C1644z {

    /* JADX INFO: renamed from: a */
    public final AbstractC1638x f6346a;

    /* JADX INFO: renamed from: b */
    public final EnumC1635w f6347b;

    /* JADX INFO: renamed from: c */
    public final C1608n f6348c;

    /* JADX INFO: renamed from: d */
    public final C1641y f6349d;

    public C1644z(AbstractC1638x lifecycle, EnumC1635w enumC1635w, C1608n dispatchQueue, InterfaceC3027k1 interfaceC3027k1) {
        AbstractC22676k.m65750j(lifecycle, "lifecycle");
        AbstractC22676k.m65750j(dispatchQueue, "dispatchQueue");
        this.f6346a = lifecycle;
        this.f6347b = enumC1635w;
        this.f6348c = dispatchQueue;
        C1641y c1641y = new C1641y(0, this, interfaceC3027k1);
        this.f6349d = c1641y;
        if (lifecycle.getCurrentState() != EnumC1635w.f6325w) {
            lifecycle.mo4986a(c1641y);
        } else {
            interfaceC3027k1.cancel((CancellationException) null);
            m5047a();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5047a() {
        this.f6346a.mo4988d(this.f6349d);
        C1608n c1608n = this.f6348c;
        c1608n.f6282b = true;
        c1608n.m5007a();
    }
}
