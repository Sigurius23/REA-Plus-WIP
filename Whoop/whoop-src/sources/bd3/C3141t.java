package bd3;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import ad3.C0766i;
import ad3.C0771n;
import ad3.EnumC0753a;
import ad3.InterfaceC0773p;
import cd3.AbstractC4454f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.internal.NamedValueEncoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.internal.JsonEncodingException;
import p003a1.C0103b;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35854l;
import wc3.InterfaceC37145j;
import yc3.AbstractC39440d;
import yc3.AbstractC39442f;
import yc3.AbstractC39447k;
import yc3.C39446j;
import yc3.C39448l;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: bd3.t */
/* JADX INFO: loaded from: classes3.dex */
public class C3141t extends NamedValueEncoder implements InterfaceC0773p {

    /* JADX INFO: renamed from: a */
    public final AbstractC0757c f12300a;

    /* JADX INFO: renamed from: b */
    public final Function1 f12301b;

    /* JADX INFO: renamed from: c */
    public final C0766i f12302c;

    /* JADX INFO: renamed from: d */
    public String f12303d;

    /* JADX INFO: renamed from: e */
    public String f12304e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f12305f;

    /* JADX INFO: renamed from: g */
    public Object f12306g;

    public C3141t(AbstractC0757c abstractC0757c, Function1 function1, char c3) {
        this.f12300a = abstractC0757c;
        this.f12301b = function1;
        this.f12302c = abstractC0757c.f2763a;
    }

    @Override // ad3.InterfaceC0773p
    /* JADX INFO: renamed from: a */
    public final AbstractC0757c mo1852a() {
        return this.f12300a;
    }

    /* JADX INFO: renamed from: b */
    public JsonElement mo9030b() {
        switch (this.f12305f) {
            case 0:
                JsonElement jsonElement = (JsonElement) this.f12306g;
                if (jsonElement != null) {
                    return jsonElement;
                }
                throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
            case 1:
                return new JsonObject((LinkedHashMap) this.f12306g);
            default:
                return new JsonArray((ArrayList) this.f12306g);
        }
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, zc3.InterfaceC40542e
    public final InterfaceC40540c beginStructure(InterfaceC39443g descriptor) {
        C3141t c3141t;
        AbstractC22676k.m65750j(descriptor, "descriptor");
        Function1 nodeConsumer = getCurrentTagOrNull() == null ? this.f12301b : new C0103b(this, 19);
        AbstractC39447k kind = descriptor.getKind();
        boolean zM65745e = AbstractC22676k.m65745e(kind, C39448l.f169714b);
        AbstractC0757c abstractC0757c = this.f12300a;
        if (zM65745e || (kind instanceof AbstractC39440d)) {
            c3141t = new C3141t(abstractC0757c, nodeConsumer, 2);
        } else if (AbstractC22676k.m65745e(kind, C39448l.f169715c)) {
            InterfaceC39443g interfaceC39443gM9011g = AbstractC3138q.m9011g(descriptor.getElementDescriptor(0), abstractC0757c.f2764b);
            AbstractC39447k kind2 = interfaceC39443gM9011g.getKind();
            if ((kind2 instanceof AbstractC39442f) || AbstractC22676k.m65745e(kind2, C39446j.f169712a)) {
                AbstractC22676k.m65750j(nodeConsumer, "nodeConsumer");
                C3147z c3147z = new C3147z(abstractC0757c, nodeConsumer, 1);
                c3147z.f12324i = true;
                c3141t = c3147z;
            } else {
                if (!abstractC0757c.f2763a.f2792d) {
                    throw AbstractC3138q.m9006b(interfaceC39443gM9011g);
                }
                c3141t = new C3141t(abstractC0757c, nodeConsumer, 2);
            }
        } else {
            c3141t = new C3141t(abstractC0757c, nodeConsumer, 1);
        }
        String str = this.f12303d;
        if (str != null) {
            if (c3141t instanceof C3147z) {
                C3147z c3147z2 = (C3147z) c3141t;
                c3147z2.mo9031d("key", AbstractC0770m.m1841c(str));
                String serialName = this.f12304e;
                if (serialName == null) {
                    serialName = descriptor.getSerialName();
                }
                c3147z2.mo9031d("value", AbstractC0770m.m1841c(serialName));
            } else {
                String serialName2 = this.f12304e;
                if (serialName2 == null) {
                    serialName2 = descriptor.getSerialName();
                }
                c3141t.mo9031d(str, AbstractC0770m.m1841c(serialName2));
            }
            this.f12303d = null;
            this.f12304e = null;
        }
        return c3141t;
    }

    @Override // ad3.InterfaceC0773p
    /* JADX INFO: renamed from: c */
    public final void mo1853c(JsonElement element) {
        AbstractC22676k.m65750j(element, "element");
        if (this.f12303d == null || (element instanceof JsonObject)) {
            encodeSerializableValue(C0771n.f2806a, element);
        } else {
            AbstractC3138q.m9027w(this.f12304e, element);
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.NamedValueEncoder
    public final String composeName(String parentName, String childName) {
        AbstractC22676k.m65750j(parentName, "parentName");
        AbstractC22676k.m65750j(childName, "childName");
        return childName;
    }

    /* JADX INFO: renamed from: d */
    public void mo9031d(String key, JsonElement element) {
        switch (this.f12305f) {
            case 0:
                AbstractC22676k.m65750j(key, "key");
                AbstractC22676k.m65750j(element, "element");
                if (key != "primitive") {
                    throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag");
                }
                if (((JsonElement) this.f12306g) != null) {
                    throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
                }
                this.f12306g = element;
                this.f12301b.invoke(element);
                return;
            case 1:
                AbstractC22676k.m65750j(key, "key");
                AbstractC22676k.m65750j(element, "element");
                ((LinkedHashMap) this.f12306g).put(key, element);
                return;
            default:
                AbstractC22676k.m65750j(key, "key");
                AbstractC22676k.m65750j(element, "element");
                ((ArrayList) this.f12306g).add(Integer.parseInt(key), element);
                return;
        }
    }

    @Override // kotlinx.serialization.internal.NamedValueEncoder
    public String elementName(InterfaceC39443g descriptor, int i13) {
        switch (this.f12305f) {
            case 2:
                AbstractC22676k.m65750j(descriptor, "descriptor");
                return String.valueOf(i13);
            default:
                AbstractC22676k.m65750j(descriptor, "descriptor");
                return AbstractC3138q.m9017m(descriptor, this.f12300a, i13);
        }
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, zc3.InterfaceC40542e
    public final InterfaceC40542e encodeInline(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        if (getCurrentTagOrNull() == null) {
            return new C3141t(this.f12300a, this.f12301b, 0).encodeInline(descriptor);
        }
        if (this.f12303d != null) {
            this.f12304e = descriptor.getSerialName();
        }
        return super.encodeInline(descriptor);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, zc3.InterfaceC40542e
    public final void encodeNotNullMark() {
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, zc3.InterfaceC40542e
    public final void encodeNull() {
        String currentTagOrNull = getCurrentTagOrNull();
        if (currentTagOrNull == null) {
            this.f12301b.invoke(JsonNull.INSTANCE);
        } else {
            mo9031d(currentTagOrNull, JsonNull.INSTANCE);
        }
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, zc3.InterfaceC40540c
    public void encodeNullableSerializableElement(InterfaceC39443g descriptor, int i13, InterfaceC37145j serializer, Object obj) {
        switch (this.f12305f) {
            case 1:
                AbstractC22676k.m65750j(descriptor, "descriptor");
                AbstractC22676k.m65750j(serializer, "serializer");
                if (obj != null || this.f12302c.f2794f) {
                    super.encodeNullableSerializableElement(descriptor, i13, serializer, obj);
                }
                break;
            default:
                super.encodeNullableSerializableElement(descriptor, i13, serializer, obj);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    @Override // kotlinx.serialization.internal.TaggedEncoder, zc3.InterfaceC40542e
    public final void encodeSerializableValue(InterfaceC37145j serializer, Object obj) {
        String strM9014j;
        AbstractC22676k.m65750j(serializer, "serializer");
        String currentTagOrNull = getCurrentTagOrNull();
        AbstractC0757c abstractC0757c = this.f12300a;
        if (currentTagOrNull == null) {
            InterfaceC39443g interfaceC39443gM9011g = AbstractC3138q.m9011g(serializer.getDescriptor(), abstractC0757c.f2764b);
            if ((interfaceC39443gM9011g.getKind() instanceof AbstractC39442f) || interfaceC39443gM9011g.getKind() == C39446j.f169712a) {
                new C3141t(abstractC0757c, this.f12301b, 0).encodeSerializableValue(serializer, obj);
                return;
            }
        }
        C0766i c0766i = abstractC0757c.f2763a;
        boolean z4 = serializer instanceof AbstractPolymorphicSerializer;
        if (!z4) {
            int iOrdinal = c0766i.f2802n.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    AbstractC39447k kind = serializer.getDescriptor().getKind();
                    strM9014j = (AbstractC22676k.m65745e(kind, C39448l.f169713a) || AbstractC22676k.m65745e(kind, C39448l.f169716d)) ? AbstractC3138q.m9014j(abstractC0757c, serializer.getDescriptor()) : null;
                } else if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else if (c0766i.f2802n != EnumC0753a.f2754w) {
        }
        if (z4) {
            AbstractPolymorphicSerializer abstractPolymorphicSerializer = (AbstractPolymorphicSerializer) serializer;
            if (obj == null) {
                throw new IllegalArgumentException(("Value for serializer " + abstractPolymorphicSerializer.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            InterfaceC37145j interfaceC37145jM113832l = AbstractC35854l.m113832l(abstractPolymorphicSerializer, this, obj);
            if (strM9014j != null) {
                AbstractC3138q.m9009e(serializer, interfaceC37145jM113832l, strM9014j);
                AbstractC3138q.m9013i(interfaceC37145jM113832l.getDescriptor().getKind());
            }
            serializer = interfaceC37145jM113832l;
        }
        if (strM9014j != null) {
            String serialName = serializer.getDescriptor().getSerialName();
            this.f12303d = strM9014j;
            this.f12304e = serialName;
        }
        serializer.serialize(this, obj);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public final void encodeTaggedBoolean(String str, boolean z4) {
        String tag = str;
        AbstractC22676k.m65750j(tag, "tag");
        mo9031d(tag, AbstractC0770m.m1839a(Boolean.valueOf(z4)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public final void encodeTaggedByte(String str, byte b) {
        String tag = str;
        AbstractC22676k.m65750j(tag, "tag");
        mo9031d(tag, AbstractC0770m.m1840b(Byte.valueOf(b)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public final void encodeTaggedChar(String str, char c3) {
        String tag = str;
        AbstractC22676k.m65750j(tag, "tag");
        mo9031d(tag, AbstractC0770m.m1841c(String.valueOf(c3)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public final void encodeTaggedDouble(String str, double d3) {
        String tag = str;
        AbstractC22676k.m65750j(tag, "tag");
        mo9031d(tag, AbstractC0770m.m1840b(Double.valueOf(d3)));
        if (this.f12302c.f2798j || Math.abs(d3) <= Double.MAX_VALUE) {
            return;
        }
        Double dValueOf = Double.valueOf(d3);
        String output = mo9030b().toString();
        AbstractC22676k.m65750j(output, "output");
        throw new JsonEncodingException(AbstractC3138q.m9029y(dValueOf, tag, output));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public final void encodeTaggedEnum(String str, InterfaceC39443g enumDescriptor, int i13) {
        String tag = str;
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(enumDescriptor, "enumDescriptor");
        mo9031d(tag, AbstractC0770m.m1841c(enumDescriptor.getElementName(i13)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public final void encodeTaggedFloat(String str, float f13) {
        String tag = str;
        AbstractC22676k.m65750j(tag, "tag");
        mo9031d(tag, AbstractC0770m.m1840b(Float.valueOf(f13)));
        if (this.f12302c.f2798j || Math.abs(f13) <= Float.MAX_VALUE) {
            return;
        }
        Float fValueOf = Float.valueOf(f13);
        String output = mo9030b().toString();
        AbstractC22676k.m65750j(output, "output");
        throw new JsonEncodingException(AbstractC3138q.m9029y(fValueOf, tag, output));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public final InterfaceC40542e encodeTaggedInline(String str, InterfaceC39443g inlineDescriptor) {
        String tag = str;
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(inlineDescriptor, "inlineDescriptor");
        if (AbstractC3125h0.m8985b(inlineDescriptor)) {
            return new C3114c(this, tag);
        }
        return AbstractC3125h0.m8984a(inlineDescriptor) ? new C3114c(this, tag, inlineDescriptor) : super.encodeTaggedInline(tag, inlineDescriptor);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public final void encodeTaggedInt(String str, int i13) {
        String tag = str;
        AbstractC22676k.m65750j(tag, "tag");
        mo9031d(tag, AbstractC0770m.m1840b(Integer.valueOf(i13)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public final void encodeTaggedLong(String str, long j7) {
        String tag = str;
        AbstractC22676k.m65750j(tag, "tag");
        mo9031d(tag, AbstractC0770m.m1840b(Long.valueOf(j7)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public final void encodeTaggedNull(String str) {
        String tag = str;
        AbstractC22676k.m65750j(tag, "tag");
        mo9031d(tag, JsonNull.INSTANCE);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public final void encodeTaggedShort(String str, short s13) {
        String tag = str;
        AbstractC22676k.m65750j(tag, "tag");
        mo9031d(tag, AbstractC0770m.m1840b(Short.valueOf(s13)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public final void encodeTaggedString(String str, String value) {
        String tag = str;
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(value, "value");
        mo9031d(tag, AbstractC0770m.m1841c(value));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public final void encodeTaggedValue(String str, Object value) {
        String tag = str;
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(value, "value");
        mo9031d(tag, AbstractC0770m.m1841c(value.toString()));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public final void endEncode(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        this.f12301b.invoke(mo9030b());
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, zc3.InterfaceC40542e
    public final AbstractC4454f getSerializersModule() {
        return this.f12300a.f2764b;
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, zc3.InterfaceC40540c
    public final boolean shouldEncodeElementDefault(InterfaceC39443g descriptor, int i13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return this.f12302c.f2789a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3141t(AbstractC0757c json, Function1 nodeConsumer, int i13) {
        this(json, nodeConsumer, (char) 0);
        this.f12305f = i13;
        switch (i13) {
            case 1:
                AbstractC22676k.m65750j(json, "json");
                AbstractC22676k.m65750j(nodeConsumer, "nodeConsumer");
                this(json, nodeConsumer, (char) 0);
                this.f12306g = new LinkedHashMap();
                break;
            case 2:
                AbstractC22676k.m65750j(json, "json");
                AbstractC22676k.m65750j(nodeConsumer, "nodeConsumer");
                this(json, nodeConsumer, (char) 0);
                this.f12306g = new ArrayList();
                break;
            default:
                AbstractC22676k.m65750j(json, "json");
                AbstractC22676k.m65750j(nodeConsumer, "nodeConsumer");
                pushTag("primitive");
                break;
        }
    }
}
