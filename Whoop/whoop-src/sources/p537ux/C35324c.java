package p537ux;

import p479s4.AbstractC32121b;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38869j5;
import y00.AbstractC38970u5;
import y00.C38780a6;
import y00.C38809d5;
import y00.C38887l3;
import y00.C38901n;
import y00.C38919p;
import y00.C38928q;
import y00.C38994x2;
import y00.EnumC38828f4;
import y00.EnumC38910o;
import y00.InterfaceC38946s;

/* JADX INFO: renamed from: ux.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C35324c extends AbstractC35328e {

    /* JADX INFO: renamed from: a */
    public final String f150524a;

    /* JADX INFO: renamed from: b */
    public final C38887l3 f150525b;

    /* JADX INFO: renamed from: c */
    public final C38919p f150526c;

    public C35324c(String clientSecret, C38887l3 intent, C38919p c38919p) {
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        AbstractC22676k.m65750j(intent, "intent");
        this.f150524a = clientSecret;
        this.f150525b = intent;
        this.f150526c = c38919p;
    }

    @Override // p537ux.AbstractC35328e
    /* JADX INFO: renamed from: a */
    public final InterfaceC38946s mo112184a(String paymentMethodId, EnumC38828f4 paymentMethodType, AbstractC38970u5 abstractC38970u5, AbstractC38869j5 abstractC38869j5, EnumC38910o enumC38910o, C38780a6 c38780a6, C38901n c38901n) {
        AbstractC22676k.m65750j(paymentMethodId, "paymentMethodId");
        AbstractC22676k.m65750j(paymentMethodType, "paymentMethodType");
        String str = paymentMethodType.f167132w;
        C38994x2 c38994x2M100013s = AbstractC32121b.m100013s(paymentMethodType, this.f150525b.m124359b(str), abstractC38970u5, enumC38910o);
        Boolean boolM99996a = abstractC38869j5 != null ? AbstractC32121b.m99996a(abstractC38869j5) : null;
        String clientSecret = this.f150524a;
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        return new C38928q(null, paymentMethodId, clientSecret, null, abstractC38970u5, c38994x2M100013s, enumC38910o, this.f150526c, boolM99996a, str, c38780a6, c38901n, null, 270509);
    }

    @Override // p537ux.AbstractC35328e
    /* JADX INFO: renamed from: b */
    public final InterfaceC38946s mo112185b(String confirmationTokenId, C38780a6 c38780a6, C38901n c38901n) {
        AbstractC22676k.m65750j(confirmationTokenId, "confirmationTokenId");
        return new C38928q(null, null, this.f150524a, null, null, null, null, null, null, null, c38780a6, c38901n, confirmationTokenId, 65519);
    }

    @Override // p537ux.AbstractC35328e
    /* JADX INFO: renamed from: c */
    public final InterfaceC38946s mo112186c(C38809d5 createParams, AbstractC38970u5 abstractC38970u5, AbstractC38869j5 abstractC38869j5, C38901n c38901n) {
        AbstractC22676k.m65750j(createParams, "createParams");
        Boolean boolM99996a = abstractC38869j5 != null ? AbstractC32121b.m99996a(abstractC38869j5) : null;
        String clientSecret = this.f150524a;
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        return new C38928q(createParams, null, clientSecret, null, abstractC38970u5, null, null, this.f150526c, boolM99996a, createParams.f167026w, null, c38901n, null, 270510);
    }
}
