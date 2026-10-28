package p100dw;

import e10.C12554k0;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import p087db.C11856j0;
import p128ew.RunnableC13719f;
import p673z7.C40137a;
import p715kotlin.jvm.internal.AbstractC22676k;
import u00.C34377e;

/* JADX INFO: renamed from: dw.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C12398c {

    /* JADX INFO: renamed from: a */
    public final C12400e f41989a;

    /* JADX INFO: renamed from: b */
    public final String f41990b;

    /* JADX INFO: renamed from: c */
    public final C12554k0 f41991c;

    /* JADX INFO: renamed from: d */
    public final C40137a f41992d;

    public C12398c(C12400e memfaultCloud, String deviceSerial, C12554k0 c12554k0, C40137a c40137a) {
        AbstractC22676k.m65750j(memfaultCloud, "memfaultCloud");
        AbstractC22676k.m65750j(deviceSerial, "deviceSerial");
        this.f41989a = memfaultCloud;
        this.f41990b = deviceSerial;
        this.f41991c = c12554k0;
        this.f41992d = c40137a;
    }

    /* JADX INFO: renamed from: a */
    public final void m34833a(List chunks) {
        AbstractC22676k.m65750j(chunks, "chunks");
        ((ConcurrentLinkedQueue) this.f41991c.f42881x).addAll(chunks);
    }

    /* JADX INFO: renamed from: b */
    public final void m34834b(InterfaceC12401f callback) {
        AbstractC22676k.m65750j(callback, "callback");
        C12400e c12400e = this.f41989a;
        c12400e.f41996b.execute(new RunnableC13719f(new C11856j0(new C34377e(27), c12400e.f41997c), c12400e.f41995a, this.f41990b, this.f41991c, callback, this.f41992d));
    }
}
