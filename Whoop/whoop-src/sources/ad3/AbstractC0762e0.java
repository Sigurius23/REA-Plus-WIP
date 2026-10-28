package ad3;

import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import p097ds.AbstractC12313p;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: ad3.e0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0762e0 implements InterfaceC37138c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC37138c f2771a;

    public AbstractC0762e0(StringSerializer tSerializer) {
        AbstractC22676k.m65750j(tSerializer, "tSerializer");
        this.f2771a = tSerializer;
    }

    @Override // wc3.InterfaceC37137b
    public final Object deserialize(InterfaceC40541d interfaceC40541d) {
        InterfaceC0768k interfaceC0768kM92119i = AbstractC30060g.m92119i(interfaceC40541d);
        JsonElement element = interfaceC0768kM92119i.mo1838b();
        AbstractC0757c abstractC0757cMo1837a = interfaceC0768kM92119i.mo1837a();
        InterfaceC37138c interfaceC37138c = this.f2771a;
        AbstractC22676k.m65750j(element, "element");
        return abstractC0757cMo1837a.m1830a(interfaceC37138c, AbstractC0770m.m1841c(element.toString()));
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return this.f2771a.getDescriptor();
    }

    @Override // wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e interfaceC40542e, Object obj) {
        InterfaceC0773p interfaceC0773pM92120j = AbstractC30060g.m92120j(interfaceC40542e);
        interfaceC0773pM92120j.mo1853c(AbstractC12313p.m34290h0(interfaceC0773pM92120j.mo1852a(), obj, this.f2771a));
    }
}
