package ad3;

import bd3.AbstractC3138q;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import vf3.AbstractC35952b;
import wc3.InterfaceC37138c;
import yc3.C39441e;
import yc3.C39444h;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: ad3.d0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0760d0 implements InterfaceC37138c {

    /* JADX INFO: renamed from: a */
    public static final C0760d0 f2766a = new C0760d0();

    /* JADX INFO: renamed from: b */
    public static final C39444h f2767b = AbstractC35952b.m114197e("kotlinx.serialization.json.JsonPrimitive", C39441e.f169698i, new InterfaceC39443g[0]);

    @Override // wc3.InterfaceC37137b
    public final Object deserialize(InterfaceC40541d interfaceC40541d) {
        JsonElement jsonElementMo1838b = AbstractC30060g.m92119i(interfaceC40541d).mo1838b();
        if (jsonElementMo1838b instanceof JsonPrimitive) {
            return (JsonPrimitive) jsonElementMo1838b;
        }
        StringBuilder sb4 = new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had ");
        throw AbstractC3138q.m9008d(jsonElementMo1838b.toString(), -1, AbstractC31061c.m95642r(AbstractC22671h0.f89337a, jsonElementMo1838b.getClass(), sb4));
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return f2767b;
    }

    @Override // wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e interfaceC40542e, Object obj) {
        JsonPrimitive value = (JsonPrimitive) obj;
        AbstractC22676k.m65750j(value, "value");
        AbstractC30060g.m92120j(interfaceC40542e);
        if (value instanceof JsonNull) {
            interfaceC40542e.encodeSerializableValue(C0781x.f2815a, JsonNull.INSTANCE);
        } else {
            interfaceC40542e.encodeSerializableValue(C0777t.f2812a, (C0776s) value);
        }
    }
}
