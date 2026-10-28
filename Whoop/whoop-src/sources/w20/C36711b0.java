package w20;

import bc3.AbstractC3006f0;
import bi.AbstractC3269g;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import ec3.InterfaceC13037f2;
import n53.C26318e;
import p337n8.C26444a;
import p715kotlin.jvm.internal.AbstractC22676k;
import sz.C33151q;
import w01.C36680e;
import y00.EnumC38853i;

/* JADX INFO: renamed from: w20.b0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C36711b0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC13037f2 f157191a;

    /* JADX INFO: renamed from: b */
    public final C13045h2 f157192b;

    /* JADX INFO: renamed from: c */
    public final C13081r1 f157193c;

    /* JADX INFO: renamed from: d */
    public final C26318e f157194d;

    public C36711b0(String lastFour, EnumC38853i cardBrand, boolean z4, C13081r1 processing, C26444a c26444a) {
        AbstractC22676k.m65750j(lastFour, "lastFour");
        AbstractC22676k.m65750j(cardBrand, "cardBrand");
        AbstractC22676k.m65750j(processing, "processing");
        this.f157191a = processing;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(new C36735y(lastFour, z4, new C36736z("", cardBrand), !((Boolean) processing.f45200w.getValue()).booleanValue()));
        this.f157192b = c13045h2M36593c;
        this.f157193c = AbstractC13091v.m36598h(c13045h2M36593c);
        AbstractC3006f0.m8732z(c26444a, null, null, new C33151q(this, null, 11), 3);
        this.f157194d = AbstractC3269g.m9484M(c13045h2M36593c, new C36680e(7));
    }
}
