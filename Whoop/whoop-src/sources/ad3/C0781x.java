package ad3;

import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.internal.JsonDecodingException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import vf3.AbstractC35952b;
import wc3.InterfaceC37138c;
import yc3.C39444h;
import yc3.C39446j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: ad3.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C0781x implements InterfaceC37138c {

    /* JADX INFO: renamed from: a */
    public static final C0781x f2815a = new C0781x();

    /* JADX INFO: renamed from: b */
    public static final C39444h f2816b = AbstractC35952b.m114197e("kotlinx.serialization.json.JsonNull", C39446j.f169712a, new InterfaceC39443g[0]);

    @Override // wc3.InterfaceC37137b
    public final Object deserialize(InterfaceC40541d interfaceC40541d) {
        AbstractC30060g.m92119i(interfaceC40541d);
        if (interfaceC40541d.decodeNotNullMark()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        interfaceC40541d.decodeNull();
        return JsonNull.INSTANCE;
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return f2816b;
    }

    @Override // wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e interfaceC40542e, Object obj) {
        JsonNull value = (JsonNull) obj;
        AbstractC22676k.m65750j(value, "value");
        AbstractC30060g.m92120j(interfaceC40542e);
        interfaceC40542e.encodeNull();
    }
}
