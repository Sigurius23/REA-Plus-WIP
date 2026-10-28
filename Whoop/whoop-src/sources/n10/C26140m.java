package n10;

import b10.C2221a1;
import b10.C2225c;
import b10.InterfaceC2227c1;
import b20.C2327g;
import b30.C2570m;
import cy.C11181b;
import e20.C12593a;
import la.C23548b;
import p442qy.C30765d;
import p664yy.C39857f;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qg3.C30352d;
import v00.AbstractC35455a0;
import v00.C35493u;
import y00.C38901n;

/* JADX INFO: renamed from: n10.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C26140m implements InterfaceC26131h0 {

    /* JADX INFO: renamed from: a */
    public final C26138l f103560a;

    public C26140m(C26138l customerSheetConfirmationInterceptor) {
        AbstractC22676k.m65750j(customerSheetConfirmationInterceptor, "customerSheetConfirmationInterceptor");
        this.f103560a = customerSheetConfirmationInterceptor;
    }

    @Override // n10.InterfaceC26131h0
    /* JADX INFO: renamed from: a */
    public final Object mo77685a(AbstractC35455a0 abstractC35455a0, String str, String str2, C38901n c38901n, InterfaceC30057d interfaceC30057d) {
        if (!(abstractC35455a0 instanceof C35493u)) {
            throw new IllegalStateException(abstractC35455a0.getClass().getName().concat(" is not supported by Customer Sheet!"));
        }
        C35493u c35493u = (C35493u) abstractC35455a0;
        C2570m c2570m = this.f103560a.f103553a;
        return new C26136k(c38901n, c35493u, (InterfaceC2227c1) ((C2221a1) c2570m.f9987x).get(), (C39857f) ((C2327g) c2570m.f9988y).get(), (C30352d) ((C12593a) c2570m.f9989z).get(), (C23548b) ((C2225c) c2570m.f9984E).get(), (C30765d) ((C11181b) c2570m.f9985F).get());
    }
}
