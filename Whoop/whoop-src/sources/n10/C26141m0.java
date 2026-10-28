package n10;

import e10.C12572t0;
import e10.C12574u0;
import lq0.C24656d;
import p031b9.C2852m1;
import p664yy.C39857f;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import y00.C38901n;
import y00.C38919p;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: n10.m0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C26141m0 implements InterfaceC26133i0 {

    /* JADX INFO: renamed from: a */
    public final String f103561a;

    /* JADX INFO: renamed from: b */
    public final C38901n f103562b;

    /* JADX INFO: renamed from: c */
    public final C2852m1 f103563c;

    public C26141m0(String clientSecret, C38901n clientAttributionMetadata, C39857f requestOptions) {
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        AbstractC22676k.m65750j(clientAttributionMetadata, "clientAttributionMetadata");
        AbstractC22676k.m65750j(requestOptions, "requestOptions");
        this.f103561a = clientSecret;
        this.f103562b = clientAttributionMetadata;
        this.f103563c = new C2852m1(requestOptions.m127934f(), 3);
    }

    @Override // n10.InterfaceC26133i0
    /* JADX INFO: renamed from: a */
    public final Object mo77680a(InterfaceC38802c8 interfaceC38802c8, C12574u0 c12574u0, C38919p c38919p, InterfaceC30057d interfaceC30057d) {
        return this.f103563c.m8247b(this.f103561a, interfaceC38802c8, c38919p, false, new C24656d(19, c12574u0, this));
    }

    @Override // n10.InterfaceC26133i0
    /* JADX INFO: renamed from: b */
    public final Object mo77681b(InterfaceC38802c8 interfaceC38802c8, C12572t0 c12572t0, C38919p c38919p, InterfaceC30057d interfaceC30057d) {
        return this.f103563c.m8247b(this.f103561a, interfaceC38802c8, c38919p, false, new C24656d(20, c12572t0, this));
    }
}
