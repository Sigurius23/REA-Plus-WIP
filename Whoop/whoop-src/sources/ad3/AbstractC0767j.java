package ad3;

import cd3.AbstractC4454f;
import j93.InterfaceC21461d;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonElement;
import p031b9.AbstractC2875y;
import p549vb.AbstractC35862g;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import q83.AbstractC30060g;
import vf3.AbstractC35952b;
import wc3.InterfaceC37137b;
import wc3.InterfaceC37138c;
import yc3.C39439c;
import yc3.C39444h;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: ad3.j */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0767j implements InterfaceC37138c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC21461d f2803a;

    /* JADX INFO: renamed from: b */
    public final C39444h f2804b;

    public AbstractC0767j(InterfaceC21461d baseClass) {
        AbstractC22676k.m65750j(baseClass, "baseClass");
        this.f2803a = baseClass;
        this.f2804b = AbstractC35952b.m114197e("JsonContentPolymorphicSerializer<" + baseClass.getSimpleName() + '>', C39439c.f169689b, new InterfaceC39443g[0]);
    }

    /* JADX INFO: renamed from: a */
    public abstract InterfaceC37137b mo1836a(JsonElement jsonElement);

    @Override // wc3.InterfaceC37137b
    public final Object deserialize(InterfaceC40541d interfaceC40541d) {
        InterfaceC0768k interfaceC0768kM92119i = AbstractC30060g.m92119i(interfaceC40541d);
        JsonElement jsonElementMo1838b = interfaceC0768kM92119i.mo1838b();
        InterfaceC37137b interfaceC37137bMo1836a = mo1836a(jsonElementMo1838b);
        AbstractC22676k.m65748h(interfaceC37137bMo1836a, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.json.JsonContentPolymorphicSerializer>");
        return interfaceC0768kM92119i.mo1837a().m1830a((InterfaceC37138c) interfaceC37137bMo1836a, jsonElementMo1838b);
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return this.f2804b;
    }

    @Override // wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e interfaceC40542e, Object value) {
        AbstractC22676k.m65750j(value, "value");
        AbstractC4454f serializersModule = interfaceC40542e.getSerializersModule();
        InterfaceC21461d interfaceC21461d = this.f2803a;
        InterfaceC37138c interfaceC37138cMo13925c = serializersModule.mo13925c(interfaceC21461d, value);
        if (interfaceC37138cMo13925c == null) {
            Class<?> cls = value.getClass();
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            InterfaceC37138c interfaceC37138cM113847j = AbstractC35862g.m113847j(c22673i0.getOrCreateKotlinClass(cls));
            if (interfaceC37138cM113847j == null) {
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(value.getClass());
                String simpleName = orCreateKotlinClass.getSimpleName();
                if (simpleName == null) {
                    simpleName = String.valueOf(orCreateKotlinClass);
                }
                throw new SerializationException(AbstractC2875y.m8300m("Class '", simpleName, "' is not registered for polymorphic serialization ", "in the scope of '" + interfaceC21461d.getSimpleName() + '\'', ".\nMark the base class as 'sealed' or register the serializer explicitly."));
            }
            interfaceC37138cMo13925c = interfaceC37138cM113847j;
        }
        ((InterfaceC37138c) interfaceC37138cMo13925c).serialize(interfaceC40542e, value);
    }
}
