package ad3;

import a11.C0129g;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import vf3.AbstractC35952b;
import wc3.InterfaceC37138c;
import yc3.C39439c;
import yc3.C39444h;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: ad3.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C0771n implements InterfaceC37138c {

    /* JADX INFO: renamed from: a */
    public static final C0771n f2806a = new C0771n();

    /* JADX INFO: renamed from: b */
    public static final C39444h f2807b = AbstractC35952b.m114196d("kotlinx.serialization.json.JsonElement", C39439c.f169689b, new InterfaceC39443g[0], new C0129g(3));

    @Override // wc3.InterfaceC37137b
    public final Object deserialize(InterfaceC40541d interfaceC40541d) {
        return AbstractC30060g.m92119i(interfaceC40541d).mo1838b();
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return f2807b;
    }

    @Override // wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e interfaceC40542e, Object obj) {
        JsonElement value = (JsonElement) obj;
        AbstractC22676k.m65750j(value, "value");
        AbstractC30060g.m92120j(interfaceC40542e);
        if (value instanceof JsonPrimitive) {
            interfaceC40542e.encodeSerializableValue(C0760d0.f2766a, value);
        } else if (value instanceof JsonObject) {
            interfaceC40542e.encodeSerializableValue(C0756b0.f2760a, value);
        } else {
            if (!(value instanceof JsonArray)) {
                throw new NoWhenBranchMatchedException();
            }
            interfaceC40542e.encodeSerializableValue(C0763f.f2772a, value);
        }
    }
}
