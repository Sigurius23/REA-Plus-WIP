package p664yy;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import p012ab.C0684i0;
import p442qy.C30765d;
import p442qy.C30766e;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;
import x30.C37902k0;

/* JADX INFO: renamed from: yy.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C39865j {

    /* JADX INFO: renamed from: a */
    public final C0684i0 f172153a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC30063j f172154b;

    /* JADX INFO: renamed from: c */
    public final C30765d f172155c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C39865j() {
        this(C30766e.f126697b, ExecutorC22364d.f87316w);
        C22365e c22365e = AbstractC3050q0.f12077a;
    }

    /* JADX INFO: renamed from: a */
    public final void m127938a(C39849b c39849b) {
        this.f172155c.m94513c("Event: " + c39849b.f172099a.get(NotificationCompat.CATEGORY_EVENT));
        AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(this.f172154b), null, null, new C37902k0(this, c39849b, null, 3), 3);
    }

    public C39865j(C30765d logger, InterfaceC30063j workContext) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(workContext, "workContext");
        this.f172153a = new C0684i0(workContext, logger, 14);
        this.f172154b = workContext;
        this.f172155c = logger;
    }
}
