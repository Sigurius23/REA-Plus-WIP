package p537ux;

import p479s4.AbstractC32121b;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38869j5;
import y00.AbstractC38970u5;
import y00.C38780a6;
import y00.C38809d5;
import y00.C38840g6;
import y00.C38901n;
import y00.C38937r;
import y00.C38994x2;
import y00.EnumC38828f4;
import y00.EnumC38910o;
import y00.InterfaceC38946s;

/* JADX INFO: renamed from: ux.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C35326d extends AbstractC35328e {

    /* JADX INFO: renamed from: a */
    public final String f150529a;

    public C35326d(String clientSecret, C38840g6 intent) {
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        AbstractC22676k.m65750j(intent, "intent");
        this.f150529a = clientSecret;
    }

    @Override // p537ux.AbstractC35328e
    /* JADX INFO: renamed from: a */
    public final InterfaceC38946s mo112184a(String paymentMethodId, EnumC38828f4 paymentMethodType, AbstractC38970u5 abstractC38970u5, AbstractC38869j5 abstractC38869j5, EnumC38910o enumC38910o, C38780a6 c38780a6, C38901n c38901n) {
        AbstractC22676k.m65750j(paymentMethodId, "paymentMethodId");
        AbstractC22676k.m65750j(paymentMethodType, "paymentMethodType");
        C38994x2 c38994x2M100013s = AbstractC32121b.m100013s(paymentMethodType, true, null, null);
        Boolean boolM99996a = abstractC38869j5 != null ? AbstractC32121b.m99996a(abstractC38869j5) : null;
        String paymentMethodCode = paymentMethodType.f167132w;
        String clientSecret = this.f150529a;
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        AbstractC22676k.m65750j(paymentMethodCode, "paymentMethodCode");
        return new C38937r(clientSecret, paymentMethodId, null, null, false, null, c38994x2M100013s, boolM99996a, paymentMethodCode, null, c38780a6, c38901n, null, 4636);
    }

    @Override // p537ux.AbstractC35328e
    /* JADX INFO: renamed from: b */
    public final InterfaceC38946s mo112185b(String confirmationTokenId, C38780a6 c38780a6, C38901n c38901n) {
        AbstractC22676k.m65750j(confirmationTokenId, "confirmationTokenId");
        return new C38937r(this.f150529a, null, null, null, false, null, null, null, null, null, c38780a6, c38901n, confirmationTokenId, 1022);
    }

    @Override // p537ux.AbstractC35328e
    /* JADX INFO: renamed from: c */
    public final InterfaceC38946s mo112186c(C38809d5 createParams, AbstractC38970u5 abstractC38970u5, AbstractC38869j5 abstractC38869j5, C38901n c38901n) {
        AbstractC22676k.m65750j(createParams, "createParams");
        Boolean boolM99996a = abstractC38869j5 != null ? AbstractC32121b.m99996a(abstractC38869j5) : null;
        String clientSecret = this.f150529a;
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        return new C38937r(clientSecret, null, createParams, null, false, null, null, boolM99996a, createParams.f167026w, null, null, c38901n, null, 4634);
    }
}
