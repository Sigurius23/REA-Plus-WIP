package p537ux;

import com.stripe.android.view.PaymentRelayActivity;
import p236j.AbstractC21065d;
import p715kotlin.jvm.internal.AbstractC22676k;
import s40.C32132a;
import s40.InterfaceC32135b;

/* JADX INFO: renamed from: ux.e0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C35329e0 implements InterfaceC32135b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f150530a = 1;

    /* JADX INFO: renamed from: b */
    public final Object f150531b;

    public C35329e0(C32132a host) {
        AbstractC22676k.m65750j(host, "host");
        this.f150531b = host;
    }

    @Override // s40.InterfaceC32135b
    /* JADX INFO: renamed from: b */
    public final void mo6700b(Object obj) {
        switch (this.f150530a) {
            case 0:
                AbstractC35327d0 abstractC35327d0 = (AbstractC35327d0) obj;
                ((C32132a) this.f150531b).m100080a(PaymentRelayActivity.class, abstractC35327d0.mo112181f().m112682b(), abstractC35327d0.mo112180b());
                break;
            default:
                ((AbstractC21065d) this.f150531b).mo4052a((AbstractC35327d0) obj, null);
                break;
        }
    }

    public C35329e0(AbstractC21065d launcher) {
        AbstractC22676k.m65750j(launcher, "launcher");
        this.f150531b = launcher;
    }
}
