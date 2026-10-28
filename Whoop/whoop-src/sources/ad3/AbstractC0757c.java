package ad3;

import bd3.AbstractC3138q;
import bd3.C3121f0;
import bd3.C3122g;
import bd3.C3127i0;
import bd3.C3140s;
import bd3.C3143v;
import bd3.C3144w;
import bd3.C3145x;
import bd3.EnumC3133l0;
import cd3.AbstractC4454f;
import cd3.AbstractC4457i;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import p097ds.AbstractC12313p;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37137b;
import wc3.InterfaceC37145j;
import wc3.InterfaceC37147l;
import zc3.InterfaceC40541d;

/* JADX INFO: renamed from: ad3.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC0757c implements InterfaceC37147l {

    /* JADX INFO: renamed from: d */
    public static final C0755b f2762d = new C0755b(new C0766i(false, false, false, false, false, true, "    ", false, "type", false, true, null, false, EnumC0753a.f2755x), AbstractC4457i.f17965a);

    /* JADX INFO: renamed from: a */
    public final C0766i f2763a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4454f f2764b;

    /* JADX INFO: renamed from: c */
    public final C0783z f2765c = new C0783z(1);

    public AbstractC0757c(C0766i c0766i, AbstractC4454f abstractC4454f) {
        this.f2763a = c0766i;
        this.f2764b = abstractC4454f;
    }

    /* JADX INFO: renamed from: a */
    public final Object m1830a(InterfaceC37137b deserializer, JsonElement element) {
        InterfaceC40541d c3140s;
        AbstractC22676k.m65750j(deserializer, "deserializer");
        AbstractC22676k.m65750j(element, "element");
        if (element instanceof JsonObject) {
            c3140s = new C3144w(this, (JsonObject) element, (String) null, 12);
        } else if (element instanceof JsonArray) {
            c3140s = new C3145x(this, (JsonArray) element);
        } else {
            if (!(element instanceof C0776s) && !element.equals(JsonNull.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            c3140s = new C3140s(this, (JsonPrimitive) element);
        }
        return c3140s.decodeSerializableValue(deserializer);
    }

    /* JADX INFO: renamed from: b */
    public final Object m1831b(InterfaceC37137b deserializer, String string) {
        AbstractC22676k.m65750j(deserializer, "deserializer");
        AbstractC22676k.m65750j(string, "string");
        C3127i0 c3127i0 = new C3127i0(string);
        Object objDecodeSerializableValue = new C3121f0(this, EnumC3133l0.OBJ, c3127i0, deserializer.getDescriptor(), null).decodeSerializableValue(deserializer);
        c3127i0.m8963p();
        return objDecodeSerializableValue;
    }

    /* JADX INFO: renamed from: c */
    public final JsonElement m1832c(InterfaceC37145j serializer, Object obj) {
        AbstractC22676k.m65750j(serializer, "serializer");
        return AbstractC12313p.m34290h0(this, obj, serializer);
    }

    /* JADX INFO: renamed from: d */
    public final String m1833d(InterfaceC37145j serializer, Object obj) {
        AbstractC22676k.m65750j(serializer, "serializer");
        C3143v c3143v = new C3143v(0, (char) 0);
        c3143v.f12311y = C3122g.f12253z.m3871J(128);
        try {
            AbstractC3138q.m9016l(this, c3143v, serializer, obj);
            return c3143v.toString();
        } finally {
            C3122g c3122g = C3122g.f12253z;
            char[] array = (char[]) c3143v.f12311y;
            c3122g.getClass();
            AbstractC22676k.m65750j(array, "array");
            c3122g.m3869G(array);
        }
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC4454f m1834e() {
        return this.f2764b;
    }

    /* JADX INFO: renamed from: f */
    public final JsonElement m1835f(String string) {
        AbstractC22676k.m65750j(string, "string");
        return (JsonElement) m1831b(C0771n.f2806a, string);
    }
}
