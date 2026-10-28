package bd3;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import ad3.C0766i;
import ad3.C0776s;
import ad3.InterfaceC0768k;
import cd3.AbstractC4454f;
import ih0.AbstractC18489d0;
import java.util.NoSuchElementException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.internal.NamedValueDecoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import va3.AbstractC35854l;
import wc3.InterfaceC37137b;
import yb3.AbstractC39421y;
import yc3.AbstractC39440d;
import yc3.AbstractC39442f;
import yc3.AbstractC39447k;
import yc3.C39446j;
import yc3.C39448l;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40541d;

/* JADX INFO: renamed from: bd3.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3112b extends NamedValueDecoder implements InterfaceC0768k {

    /* JADX INFO: renamed from: a */
    public final AbstractC0757c f12217a;

    /* JADX INFO: renamed from: b */
    public final String f12218b;

    /* JADX INFO: renamed from: c */
    public final C0766i f12219c;

    public AbstractC3112b(AbstractC0757c abstractC0757c, String str) {
        this.f12217a = abstractC0757c;
        this.f12218b = str;
        this.f12219c = abstractC0757c.f2763a;
    }

    @Override // ad3.InterfaceC0768k
    /* JADX INFO: renamed from: a */
    public final AbstractC0757c mo1837a() {
        return this.f12217a;
    }

    @Override // ad3.InterfaceC0768k
    /* JADX INFO: renamed from: b */
    public final JsonElement mo1838b() {
        return m8973f();
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, zc3.InterfaceC40541d
    public InterfaceC40539b beginStructure(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        JsonElement jsonElementM8973f = m8973f();
        AbstractC39447k kind = descriptor.getKind();
        boolean zM65745e = AbstractC22676k.m65745e(kind, C39448l.f169714b);
        AbstractC0757c abstractC0757c = this.f12217a;
        if (zM65745e || (kind instanceof AbstractC39440d)) {
            String serialName = descriptor.getSerialName();
            if (jsonElementM8973f instanceof JsonArray) {
                return new C3145x(abstractC0757c, (JsonArray) jsonElementM8973f);
            }
            StringBuilder sb4 = new StringBuilder("Expected ");
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            sb4.append(c22673i0.getOrCreateKotlinClass(JsonArray.class).getSimpleName());
            sb4.append(", but had ");
            sb4.append(c22673i0.getOrCreateKotlinClass(jsonElementM8973f.getClass()).getSimpleName());
            sb4.append(" as the serialized body of ");
            sb4.append(serialName);
            sb4.append(" at element: ");
            sb4.append(renderTagStack());
            throw AbstractC3138q.m9008d(jsonElementM8973f.toString(), -1, sb4.toString());
        }
        if (!AbstractC22676k.m65745e(kind, C39448l.f169715c)) {
            String serialName2 = descriptor.getSerialName();
            if (jsonElementM8973f instanceof JsonObject) {
                return new C3144w(abstractC0757c, (JsonObject) jsonElementM8973f, this.f12218b, 8);
            }
            StringBuilder sb5 = new StringBuilder("Expected ");
            C22673i0 c22673i1 = AbstractC22671h0.f89337a;
            sb5.append(c22673i1.getOrCreateKotlinClass(JsonObject.class).getSimpleName());
            sb5.append(", but had ");
            sb5.append(c22673i1.getOrCreateKotlinClass(jsonElementM8973f.getClass()).getSimpleName());
            sb5.append(" as the serialized body of ");
            sb5.append(serialName2);
            sb5.append(" at element: ");
            sb5.append(renderTagStack());
            throw AbstractC3138q.m9008d(jsonElementM8973f.toString(), -1, sb5.toString());
        }
        InterfaceC39443g interfaceC39443gM9011g = AbstractC3138q.m9011g(descriptor.getElementDescriptor(0), abstractC0757c.f2764b);
        AbstractC39447k kind2 = interfaceC39443gM9011g.getKind();
        if ((kind2 instanceof AbstractC39442f) || AbstractC22676k.m65745e(kind2, C39446j.f169712a)) {
            String serialName3 = descriptor.getSerialName();
            if (jsonElementM8973f instanceof JsonObject) {
                return new C3146y(abstractC0757c, (JsonObject) jsonElementM8973f);
            }
            StringBuilder sb6 = new StringBuilder("Expected ");
            C22673i0 c22673i2 = AbstractC22671h0.f89337a;
            sb6.append(c22673i2.getOrCreateKotlinClass(JsonObject.class).getSimpleName());
            sb6.append(", but had ");
            sb6.append(c22673i2.getOrCreateKotlinClass(jsonElementM8973f.getClass()).getSimpleName());
            sb6.append(" as the serialized body of ");
            sb6.append(serialName3);
            sb6.append(" at element: ");
            sb6.append(renderTagStack());
            throw AbstractC3138q.m9008d(jsonElementM8973f.toString(), -1, sb6.toString());
        }
        if (!abstractC0757c.f2763a.f2792d) {
            throw AbstractC3138q.m9006b(interfaceC39443gM9011g);
        }
        String serialName4 = descriptor.getSerialName();
        if (jsonElementM8973f instanceof JsonArray) {
            return new C3145x(abstractC0757c, (JsonArray) jsonElementM8973f);
        }
        StringBuilder sb7 = new StringBuilder("Expected ");
        C22673i0 c22673i3 = AbstractC22671h0.f89337a;
        sb7.append(c22673i3.getOrCreateKotlinClass(JsonArray.class).getSimpleName());
        sb7.append(", but had ");
        sb7.append(c22673i3.getOrCreateKotlinClass(jsonElementM8973f.getClass()).getSimpleName());
        sb7.append(" as the serialized body of ");
        sb7.append(serialName4);
        sb7.append(" at element: ");
        sb7.append(renderTagStack());
        throw AbstractC3138q.m9008d(jsonElementM8973f.toString(), -1, sb7.toString());
    }

    @Override // kotlinx.serialization.internal.NamedValueDecoder
    public final String composeName(String parentName, String childName) {
        AbstractC22676k.m65750j(parentName, "parentName");
        AbstractC22676k.m65750j(childName, "childName");
        return childName;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, zc3.InterfaceC40541d
    public final InterfaceC40541d decodeInline(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        if (getCurrentTagOrNull() != null) {
            return super.decodeInline(descriptor);
        }
        return new C3140s(this.f12217a, mo8974g(), this.f12218b).decodeInline(descriptor);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, zc3.InterfaceC40541d
    public boolean decodeNotNullMark() {
        return !(m8973f() instanceof JsonNull);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, zc3.InterfaceC40541d
    public final Object decodeSerializableValue(InterfaceC37137b deserializer) {
        AbstractC22676k.m65750j(deserializer, "deserializer");
        if (!(deserializer instanceof AbstractPolymorphicSerializer)) {
            return deserializer.deserialize(this);
        }
        AbstractC0757c abstractC0757c = this.f12217a;
        C0766i c0766i = abstractC0757c.f2763a;
        AbstractPolymorphicSerializer abstractPolymorphicSerializer = (AbstractPolymorphicSerializer) deserializer;
        String strM9014j = AbstractC3138q.m9014j(abstractC0757c, abstractPolymorphicSerializer.getDescriptor());
        JsonElement jsonElementM8973f = m8973f();
        String serialName = abstractPolymorphicSerializer.getDescriptor().getSerialName();
        if (jsonElementM8973f instanceof JsonObject) {
            JsonObject jsonObject = (JsonObject) jsonElementM8973f;
            JsonElement jsonElement = (JsonElement) jsonObject.get((Object) strM9014j);
            try {
                return AbstractC3138q.m9024t(abstractC0757c, strM9014j, jsonObject, AbstractC35854l.m113831k((AbstractPolymorphicSerializer) deserializer, this, jsonElement != null ? AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement)) : null));
            } catch (SerializationException e5) {
                String message = e5.getMessage();
                AbstractC22676k.m65747g(message);
                throw AbstractC3138q.m9008d(jsonObject.toString(), -1, message);
            }
        }
        StringBuilder sb4 = new StringBuilder("Expected ");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        sb4.append(c22673i0.getOrCreateKotlinClass(JsonObject.class).getSimpleName());
        sb4.append(", but had ");
        sb4.append(c22673i0.getOrCreateKotlinClass(jsonElementM8973f.getClass()).getSimpleName());
        sb4.append(" as the serialized body of ");
        sb4.append(serialName);
        sb4.append(" at element: ");
        sb4.append(renderTagStack());
        throw AbstractC3138q.m9008d(jsonElementM8973f.toString(), -1, sb4.toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final boolean decodeTaggedBoolean(String str) {
        String tag = str;
        AbstractC22676k.m65750j(tag, "tag");
        JsonElement jsonElementMo8972e = mo8972e(tag);
        if (jsonElementMo8972e instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementMo8972e;
            try {
                Boolean boolM1843e = AbstractC0770m.m1843e(jsonPrimitive);
                if (boolM1843e != null) {
                    return boolM1843e.booleanValue();
                }
                m8976i(jsonPrimitive, "boolean", tag);
                throw null;
            } catch (IllegalArgumentException unused) {
                m8976i(jsonPrimitive, "boolean", tag);
                throw null;
            }
        }
        StringBuilder sb4 = new StringBuilder("Expected ");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        sb4.append(c22673i0.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName());
        sb4.append(", but had ");
        sb4.append(c22673i0.getOrCreateKotlinClass(jsonElementMo8972e.getClass()).getSimpleName());
        sb4.append(" as the serialized body of boolean at element: ");
        sb4.append(m8975h(tag));
        throw AbstractC3138q.m9008d(jsonElementMo8972e.toString(), -1, sb4.toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final byte decodeTaggedByte(String str) {
        String tag = str;
        AbstractC22676k.m65750j(tag, "tag");
        JsonElement jsonElementMo8972e = mo8972e(tag);
        if (!(jsonElementMo8972e instanceof JsonPrimitive)) {
            StringBuilder sb4 = new StringBuilder("Expected ");
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            sb4.append(c22673i0.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName());
            sb4.append(", but had ");
            sb4.append(c22673i0.getOrCreateKotlinClass(jsonElementMo8972e.getClass()).getSimpleName());
            sb4.append(" as the serialized body of byte at element: ");
            sb4.append(m8975h(tag));
            throw AbstractC3138q.m9008d(jsonElementMo8972e.toString(), -1, sb4.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementMo8972e;
        try {
            long jM1850l = AbstractC0770m.m1850l(jsonPrimitive);
            Byte bValueOf = (-128 > jM1850l || jM1850l > 127) ? null : Byte.valueOf((byte) jM1850l);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            m8976i(jsonPrimitive, "byte", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            m8976i(jsonPrimitive, "byte", tag);
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final char decodeTaggedChar(String str) {
        String tag = str;
        AbstractC22676k.m65750j(tag, "tag");
        JsonElement jsonElementMo8972e = mo8972e(tag);
        if (!(jsonElementMo8972e instanceof JsonPrimitive)) {
            StringBuilder sb4 = new StringBuilder("Expected ");
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            sb4.append(c22673i0.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName());
            sb4.append(", but had ");
            sb4.append(c22673i0.getOrCreateKotlinClass(jsonElementMo8972e.getClass()).getSimpleName());
            sb4.append(" as the serialized body of char at element: ");
            sb4.append(m8975h(tag));
            throw AbstractC3138q.m9008d(jsonElementMo8972e.toString(), -1, sb4.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementMo8972e;
        try {
            String content = jsonPrimitive.getContent();
            AbstractC22676k.m65750j(content, "<this>");
            int length = content.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return content.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            m8976i(jsonPrimitive, "char", tag);
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final double decodeTaggedDouble(String str) {
        String tag = str;
        AbstractC22676k.m65750j(tag, "tag");
        JsonElement jsonElementMo8972e = mo8972e(tag);
        if (!(jsonElementMo8972e instanceof JsonPrimitive)) {
            StringBuilder sb4 = new StringBuilder("Expected ");
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            sb4.append(c22673i0.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName());
            sb4.append(", but had ");
            sb4.append(c22673i0.getOrCreateKotlinClass(jsonElementMo8972e.getClass()).getSimpleName());
            sb4.append(" as the serialized body of double at element: ");
            sb4.append(m8975h(tag));
            throw AbstractC3138q.m9008d(jsonElementMo8972e.toString(), -1, sb4.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementMo8972e;
        try {
            InterfaceC39443g interfaceC39443g = AbstractC0770m.f2805a;
            double d3 = Double.parseDouble(jsonPrimitive.getContent());
            if (this.f12217a.f2763a.f2798j || Math.abs(d3) <= Double.MAX_VALUE) {
                return d3;
            }
            Double dValueOf = Double.valueOf(d3);
            String output = m8973f().toString();
            AbstractC22676k.m65750j(output, "output");
            throw AbstractC3138q.m9007c(-1, AbstractC3138q.m9029y(dValueOf, tag, output));
        } catch (IllegalArgumentException unused) {
            m8976i(jsonPrimitive, "double", tag);
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final int decodeTaggedEnum(String str, InterfaceC39443g enumDescriptor) {
        String tag = str;
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(enumDescriptor, "enumDescriptor");
        JsonElement jsonElementMo8972e = mo8972e(tag);
        String serialName = enumDescriptor.getSerialName();
        if (jsonElementMo8972e instanceof JsonPrimitive) {
            return AbstractC3138q.m9019o(enumDescriptor, this.f12217a, ((JsonPrimitive) jsonElementMo8972e).getContent(), "");
        }
        StringBuilder sb4 = new StringBuilder("Expected ");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        sb4.append(c22673i0.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName());
        sb4.append(", but had ");
        sb4.append(c22673i0.getOrCreateKotlinClass(jsonElementMo8972e.getClass()).getSimpleName());
        sb4.append(" as the serialized body of ");
        sb4.append(serialName);
        sb4.append(" at element: ");
        sb4.append(m8975h(tag));
        throw AbstractC3138q.m9008d(jsonElementMo8972e.toString(), -1, sb4.toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final float decodeTaggedFloat(String str) {
        String tag = str;
        AbstractC22676k.m65750j(tag, "tag");
        JsonElement jsonElementMo8972e = mo8972e(tag);
        if (!(jsonElementMo8972e instanceof JsonPrimitive)) {
            StringBuilder sb4 = new StringBuilder("Expected ");
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            sb4.append(c22673i0.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName());
            sb4.append(", but had ");
            sb4.append(c22673i0.getOrCreateKotlinClass(jsonElementMo8972e.getClass()).getSimpleName());
            sb4.append(" as the serialized body of float at element: ");
            sb4.append(m8975h(tag));
            throw AbstractC3138q.m9008d(jsonElementMo8972e.toString(), -1, sb4.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementMo8972e;
        try {
            InterfaceC39443g interfaceC39443g = AbstractC0770m.f2805a;
            float f13 = Float.parseFloat(jsonPrimitive.getContent());
            if (this.f12217a.f2763a.f2798j || Math.abs(f13) <= Float.MAX_VALUE) {
                return f13;
            }
            Float fValueOf = Float.valueOf(f13);
            String output = m8973f().toString();
            AbstractC22676k.m65750j(output, "output");
            throw AbstractC3138q.m9007c(-1, AbstractC3138q.m9029y(fValueOf, tag, output));
        } catch (IllegalArgumentException unused) {
            m8976i(jsonPrimitive, "float", tag);
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final InterfaceC40541d decodeTaggedInline(String str, InterfaceC39443g inlineDescriptor) {
        String tag = str;
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(inlineDescriptor, "inlineDescriptor");
        if (!AbstractC3125h0.m8985b(inlineDescriptor)) {
            return super.decodeTaggedInline(tag, inlineDescriptor);
        }
        JsonElement jsonElementMo8972e = mo8972e(tag);
        String serialName = inlineDescriptor.getSerialName();
        if (jsonElementMo8972e instanceof JsonPrimitive) {
            String source = ((JsonPrimitive) jsonElementMo8972e).getContent();
            AbstractC0757c json = this.f12217a;
            AbstractC22676k.m65750j(json, "json");
            AbstractC22676k.m65750j(source, "source");
            return new C3136o(new C3127i0(source), json);
        }
        StringBuilder sb4 = new StringBuilder("Expected ");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        sb4.append(c22673i0.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName());
        sb4.append(", but had ");
        sb4.append(c22673i0.getOrCreateKotlinClass(jsonElementMo8972e.getClass()).getSimpleName());
        sb4.append(" as the serialized body of ");
        sb4.append(serialName);
        sb4.append(" at element: ");
        sb4.append(m8975h(tag));
        throw AbstractC3138q.m9008d(jsonElementMo8972e.toString(), -1, sb4.toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final int decodeTaggedInt(String str) {
        String tag = str;
        AbstractC22676k.m65750j(tag, "tag");
        JsonElement jsonElementMo8972e = mo8972e(tag);
        if (!(jsonElementMo8972e instanceof JsonPrimitive)) {
            StringBuilder sb4 = new StringBuilder("Expected ");
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            sb4.append(c22673i0.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName());
            sb4.append(", but had ");
            sb4.append(c22673i0.getOrCreateKotlinClass(jsonElementMo8972e.getClass()).getSimpleName());
            sb4.append(" as the serialized body of int at element: ");
            sb4.append(m8975h(tag));
            throw AbstractC3138q.m9008d(jsonElementMo8972e.toString(), -1, sb4.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementMo8972e;
        try {
            long jM1850l = AbstractC0770m.m1850l(jsonPrimitive);
            Integer numValueOf = (-2147483648L > jM1850l || jM1850l > 2147483647L) ? null : Integer.valueOf((int) jM1850l);
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            m8976i(jsonPrimitive, "int", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            m8976i(jsonPrimitive, "int", tag);
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final long decodeTaggedLong(String str) {
        String tag = str;
        AbstractC22676k.m65750j(tag, "tag");
        JsonElement jsonElementMo8972e = mo8972e(tag);
        if (jsonElementMo8972e instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementMo8972e;
            try {
                return AbstractC0770m.m1850l(jsonPrimitive);
            } catch (IllegalArgumentException unused) {
                m8976i(jsonPrimitive, "long", tag);
                throw null;
            }
        }
        StringBuilder sb4 = new StringBuilder("Expected ");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        sb4.append(c22673i0.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName());
        sb4.append(", but had ");
        sb4.append(c22673i0.getOrCreateKotlinClass(jsonElementMo8972e.getClass()).getSimpleName());
        sb4.append(" as the serialized body of long at element: ");
        sb4.append(m8975h(tag));
        throw AbstractC3138q.m9008d(jsonElementMo8972e.toString(), -1, sb4.toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final boolean decodeTaggedNotNullMark(String str) {
        String tag = str;
        AbstractC22676k.m65750j(tag, "tag");
        return mo8972e(tag) != JsonNull.INSTANCE;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final Void decodeTaggedNull(String str) {
        String tag = str;
        AbstractC22676k.m65750j(tag, "tag");
        return null;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final short decodeTaggedShort(String str) {
        String tag = str;
        AbstractC22676k.m65750j(tag, "tag");
        JsonElement jsonElementMo8972e = mo8972e(tag);
        if (!(jsonElementMo8972e instanceof JsonPrimitive)) {
            StringBuilder sb4 = new StringBuilder("Expected ");
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            sb4.append(c22673i0.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName());
            sb4.append(", but had ");
            sb4.append(c22673i0.getOrCreateKotlinClass(jsonElementMo8972e.getClass()).getSimpleName());
            sb4.append(" as the serialized body of short at element: ");
            sb4.append(m8975h(tag));
            throw AbstractC3138q.m9008d(jsonElementMo8972e.toString(), -1, sb4.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementMo8972e;
        try {
            long jM1850l = AbstractC0770m.m1850l(jsonPrimitive);
            Short shValueOf = (-32768 > jM1850l || jM1850l > 32767) ? null : Short.valueOf((short) jM1850l);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            m8976i(jsonPrimitive, "short", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            m8976i(jsonPrimitive, "short", tag);
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final String decodeTaggedString(String str) {
        String tag = str;
        AbstractC22676k.m65750j(tag, "tag");
        JsonElement jsonElementMo8972e = mo8972e(tag);
        if (!(jsonElementMo8972e instanceof JsonPrimitive)) {
            StringBuilder sb4 = new StringBuilder("Expected ");
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            sb4.append(c22673i0.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName());
            sb4.append(", but had ");
            sb4.append(c22673i0.getOrCreateKotlinClass(jsonElementMo8972e.getClass()).getSimpleName());
            sb4.append(" as the serialized body of string at element: ");
            sb4.append(m8975h(tag));
            throw AbstractC3138q.m9008d(jsonElementMo8972e.toString(), -1, sb4.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementMo8972e;
        if (!(jsonPrimitive instanceof C0776s)) {
            StringBuilder sbM53375p = AbstractC18489d0.m53375p("Expected string value for a non-null key '", tag, "', got null literal instead at element: ");
            sbM53375p.append(m8975h(tag));
            throw AbstractC3138q.m9008d(m8973f().toString(), -1, sbM53375p.toString());
        }
        C0776s c0776s = (C0776s) jsonPrimitive;
        if (c0776s.f2809w || this.f12217a.f2763a.f2791c) {
            return c0776s.f2811y;
        }
        StringBuilder sbM53375p2 = AbstractC18489d0.m53375p("String literal for key '", tag, "' should be quoted at element: ");
        sbM53375p2.append(m8975h(tag));
        sbM53375p2.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
        throw AbstractC3138q.m9008d(m8973f().toString(), -1, sbM53375p2.toString());
    }

    /* JADX INFO: renamed from: e */
    public abstract JsonElement mo8972e(String str);

    @Override // kotlinx.serialization.internal.TaggedDecoder, zc3.InterfaceC40539b
    public void endStructure(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
    }

    /* JADX INFO: renamed from: f */
    public final JsonElement m8973f() {
        JsonElement jsonElementMo8972e;
        String currentTagOrNull = getCurrentTagOrNull();
        return (currentTagOrNull == null || (jsonElementMo8972e = mo8972e(currentTagOrNull)) == null) ? mo8974g() : jsonElementMo8972e;
    }

    /* JADX INFO: renamed from: g */
    public abstract JsonElement mo8974g();

    @Override // kotlinx.serialization.internal.TaggedDecoder, zc3.InterfaceC40541d, zc3.InterfaceC40539b
    public final AbstractC4454f getSerializersModule() {
        return this.f12217a.f2764b;
    }

    /* JADX INFO: renamed from: h */
    public final String m8975h(String currentTag) {
        AbstractC22676k.m65750j(currentTag, "currentTag");
        return renderTagStack() + '.' + currentTag;
    }

    /* JADX INFO: renamed from: i */
    public final void m8976i(JsonPrimitive jsonPrimitive, String str, String str2) {
        throw AbstractC3138q.m9008d(m8973f().toString(), -1, "Failed to parse literal '" + jsonPrimitive + "' as " + (AbstractC39421y.m125930O(str, "i", false) ? "an " : "a ").concat(str) + " value at element: " + m8975h(str2));
    }
}
