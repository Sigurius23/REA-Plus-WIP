package d20;

import c20.AbstractC3877e;
import c20.C3876d;
import c93.InterfaceC4339a;
import ck1.C4780c;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import java.util.Set;
import java.util.UUID;
import l83.C23454a0;
import p236j.AbstractC21065d;
import p236j.InterfaceC21063b;
import p236j.InterfaceC21064c;
import p537ux.C35354r;
import p537ux.C35358t;
import p664yy.C39857f;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29926q0;
import s40.C32132a;
import y00.AbstractC38792b8;
import y00.C38981v7;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: d20.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C11493i extends AbstractC3877e {

    /* JADX INFO: renamed from: a */
    public final C35358t f36951a;

    /* JADX INFO: renamed from: b */
    public final boolean f36952b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4339a f36953c;

    /* JADX INFO: renamed from: d */
    public final Set f36954d;

    /* JADX INFO: renamed from: e */
    public AbstractC21065d f36955e;

    /* JADX INFO: renamed from: f */
    public final C4780c f36956f;

    public C11493i(C35358t config, boolean z4, InterfaceC4339a publishableKeyProvider, Set productUsage) {
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(publishableKeyProvider, "publishableKeyProvider");
        AbstractC22676k.m65750j(productUsage, "productUsage");
        this.f36951a = config;
        this.f36952b = z4;
        this.f36953c = publishableKeyProvider;
        this.f36954d = productUsage;
        this.f36956f = new C4780c(this, 16);
    }

    @Override // c20.AbstractC3877e
    /* JADX INFO: renamed from: a */
    public final void mo11856a() {
        AbstractC21065d abstractC21065d = this.f36955e;
        if (abstractC21065d != null) {
            abstractC21065d.mo4053b();
        }
        this.f36955e = null;
    }

    @Override // c20.AbstractC3877e
    /* JADX INFO: renamed from: b */
    public final void mo6696b(InterfaceC21064c interfaceC21064c, InterfaceC21063b interfaceC21063b) {
        this.f36955e = interfaceC21064c.registerForActivityResult(new Stripe3ds2TransactionContract(), interfaceC21063b);
    }

    @Override // c20.AbstractC3877e
    /* JADX INFO: renamed from: d */
    public final Object mo6697d(C32132a c32132a, Object obj, C39857f c39857f, C3876d c3876d) {
        InterfaceC38802c8 interfaceC38802c8 = (InterfaceC38802c8) obj;
        InterfaceC11497m interfaceC11497m = (InterfaceC11497m) this.f36956f.invoke(c32132a);
        UUID uuidRandomUUID = UUID.randomUUID();
        AbstractC22676k.m65749i(uuidRandomUUID, "randomUUID(...)");
        C29926q0 c29926q0 = new C29926q0(uuidRandomUUID);
        C35354r c35354r = this.f36951a.f150626a;
        AbstractC38792b8 abstractC38792b8Mo124335m = interfaceC38802c8.mo124335m();
        AbstractC22676k.m65748h(abstractC38792b8Mo124335m, "null cannot be cast to non-null type com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2");
        interfaceC11497m.mo6700b(new C11496l(c29926q0, c35354r, interfaceC38802c8, (C38981v7) abstractC38792b8Mo124335m, c39857f, this.f36952b, c32132a.f133154b, (String) this.f36953c.invoke(), this.f36954d));
        return C23454a0.f92919a;
    }
}
