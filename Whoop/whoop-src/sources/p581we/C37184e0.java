package p581we;

import c93.InterfaceC4339a;
import p027b3.AbstractC2351b;
import p507tx.AbstractC34235f;
import p715kotlin.jvm.internal.AbstractC22676k;
import tg.AbstractC33774f;
import ug.EnumC34931t;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: we.e0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37184e0 extends AbstractC2351b {

    /* JADX INFO: renamed from: d */
    public final InterfaceC4339a f158987d;

    /* JADX WARN: Illegal instructions before constructor call */
    public C37184e0() {
        C37182d0 c37182d0 = C37182d0.f158982w;
        super(EnumC37183e.SIGV4, c37182d0);
        this.f158987d = c37182d0;
    }

    @Override // p581we.InterfaceC37194j0
    /* JADX INFO: renamed from: a */
    public final byte[] mo119146a(C37187g c37187g) {
        byte[] bArrM125919D = AbstractC39421y.m125919D("AWS4" + c37187g.f159014m.f152983b);
        byte[] bArrM125919D2 = AbstractC39421y.m125919D(c37187g.f159005d.m110113b(EnumC34931t.f147050y));
        InterfaceC4339a interfaceC4339a = this.f158987d;
        return AbstractC34235f.m108208P(AbstractC34235f.m108208P(AbstractC34235f.m108208P(AbstractC34235f.m108208P(bArrM125919D, bArrM125919D2, interfaceC4339a), AbstractC39421y.m125919D(c37187g.f159003b), interfaceC4339a), AbstractC39421y.m125919D(c37187g.f159004c), interfaceC4339a), AbstractC39421y.m125919D("aws4_request"), interfaceC4339a);
    }

    @Override // p581we.InterfaceC37194j0
    /* JADX INFO: renamed from: d */
    public final String mo119147d(String stringToSign, byte[] signingKey) {
        AbstractC22676k.m65750j(signingKey, "signingKey");
        AbstractC22676k.m65750j(stringToSign, "stringToSign");
        return AbstractC33774f.m106780a(AbstractC34235f.m108208P(signingKey, AbstractC39421y.m125919D(stringToSign), this.f158987d));
    }

    @Override // p027b3.AbstractC2351b
    /* JADX INFO: renamed from: t */
    public final InterfaceC4339a mo7266t() {
        return this.f158987d;
    }
}
