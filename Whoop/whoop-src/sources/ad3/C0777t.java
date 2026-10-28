package ad3;

import bd3.AbstractC3138q;
import kotlinx.serialization.internal.ULongSerializer;
import kotlinx.serialization.json.JsonElement;
import l83.C23476v;
import p482s7.AbstractC32237a;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import vf3.AbstractC35952b;
import wc3.InterfaceC37138c;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;
import yc3.C39441e;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: ad3.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C0777t implements InterfaceC37138c {

    /* JADX INFO: renamed from: a */
    public static final C0777t f2812a = new C0777t();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC39443g f2813b = AbstractC35952b.m114194b("kotlinx.serialization.json.JsonLiteral", C39441e.f169698i);

    @Override // wc3.InterfaceC37137b
    public final Object deserialize(InterfaceC40541d interfaceC40541d) {
        JsonElement jsonElementMo1838b = AbstractC30060g.m92119i(interfaceC40541d).mo1838b();
        if (jsonElementMo1838b instanceof C0776s) {
            return (C0776s) jsonElementMo1838b;
        }
        StringBuilder sb4 = new StringBuilder("Unexpected JSON element, expected JsonLiteral, had ");
        throw AbstractC3138q.m9008d(jsonElementMo1838b.toString(), -1, AbstractC31061c.m95642r(AbstractC22671h0.f89337a, jsonElementMo1838b.getClass(), sb4));
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return f2813b;
    }

    @Override // wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e interfaceC40542e, Object obj) {
        C0776s value = (C0776s) obj;
        AbstractC22676k.m65750j(value, "value");
        String str = value.f2811y;
        AbstractC30060g.m92120j(interfaceC40542e);
        if (value.f2809w) {
            interfaceC40542e.encodeString(str);
            return;
        }
        InterfaceC39443g interfaceC39443g = value.f2810x;
        if (interfaceC39443g != null) {
            interfaceC40542e.encodeInline(interfaceC39443g).encodeString(str);
            return;
        }
        Long lM125933R = AbstractC39421y.m125933R(str);
        if (lM125933R != null) {
            interfaceC40542e.encodeLong(lM125933R.longValue());
            return;
        }
        C23476v c23476vM100304s = AbstractC32237a.m100304s(str);
        if (c23476vM100304s != null) {
            interfaceC40542e.encodeInline(ULongSerializer.INSTANCE.getDescriptor()).encodeLong(c23476vM100304s.f92954w);
            return;
        }
        Double dM125914x = AbstractC39420x.m125914x(str);
        if (dM125914x != null) {
            interfaceC40542e.encodeDouble(dM125914x.doubleValue());
            return;
        }
        Boolean boolM125868N0 = AbstractC39414r.m125868N0(str);
        if (boolM125868N0 != null) {
            interfaceC40542e.encodeBoolean(boolM125868N0.booleanValue());
        } else {
            interfaceC40542e.encodeString(str);
        }
    }
}
