package p023ay;

import aq0.C1904o;
import bc3.AbstractC3006f0;
import c20.AbstractC3877e;
import c20.C3876d;
import c93.InterfaceC4339a;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivityContract;
import g20.C15271q;
import java.util.Set;
import l83.C23454a0;
import p003a1.C0103b;
import p236j.AbstractC21065d;
import p236j.InterfaceC21063b;
import p236j.InterfaceC21064c;
import p664yy.C39857f;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s40.C32132a;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: ay.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C2148v extends AbstractC3877e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4339a f8548a;

    /* JADX INFO: renamed from: b */
    public final Set f8549b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC30063j f8550c;

    /* JADX INFO: renamed from: d */
    public AbstractC21065d f8551d;

    /* JADX INFO: renamed from: e */
    public final C0103b f8552e;

    public C2148v(InterfaceC4339a publishableKeyProvider, Set productUsageTokens, InterfaceC30063j uiContext) {
        AbstractC22676k.m65750j(publishableKeyProvider, "publishableKeyProvider");
        AbstractC22676k.m65750j(productUsageTokens, "productUsageTokens");
        AbstractC22676k.m65750j(uiContext, "uiContext");
        this.f8548a = publishableKeyProvider;
        this.f8549b = productUsageTokens;
        this.f8550c = uiContext;
        this.f8552e = new C0103b(this, 10);
    }

    @Override // c20.AbstractC3877e
    /* JADX INFO: renamed from: b */
    public final void mo6696b(InterfaceC21064c interfaceC21064c, InterfaceC21063b interfaceC21063b) {
        this.f8551d = interfaceC21064c.registerForActivityResult(new IntentConfirmationChallengeActivityContract(), new C1904o((C15271q) interfaceC21063b, 1));
    }

    @Override // c20.AbstractC3877e
    /* JADX INFO: renamed from: d */
    public final Object mo6697d(C32132a c32132a, Object obj, C39857f c39857f, C3876d c3876d) throws Throwable {
        Object objM8705K = AbstractC3006f0.m8705K(this.f8550c, new C2147u(this, c32132a, (InterfaceC38802c8) obj, null, 0), c3876d);
        return objM8705K == EnumC31071a.f128113w ? objM8705K : C23454a0.f92919a;
    }
}
