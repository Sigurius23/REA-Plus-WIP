package ad3;

import java.util.List;
import kotlinx.serialization.json.JsonArray;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: ad3.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C0763f implements InterfaceC37138c {

    /* JADX INFO: renamed from: a */
    public static final C0763f f2772a = new C0763f();

    /* JADX INFO: renamed from: b */
    public static final C0761e f2773b = C0761e.f2768b;

    @Override // wc3.InterfaceC37137b
    public final Object deserialize(InterfaceC40541d interfaceC40541d) {
        AbstractC30060g.m92119i(interfaceC40541d);
        return new JsonArray((List) AbstractC38195a.m122333a(C0771n.f2806a).deserialize(interfaceC40541d));
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return f2773b;
    }

    @Override // wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e interfaceC40542e, Object obj) {
        JsonArray value = (JsonArray) obj;
        AbstractC22676k.m65750j(value, "value");
        AbstractC30060g.m92120j(interfaceC40542e);
        AbstractC38195a.m122333a(C0771n.f2806a).serialize(interfaceC40542e, value);
    }
}
