package bd3;

import a11.C0134l;
import ad3.AbstractC0757c;
import ad3.C0766i;
import ad3.C0779v;
import ad3.C0783z;
import ad3.InterfaceC0765h;
import ad3.InterfaceC0773p;
import ad3.InterfaceC0774q;
import cd3.AbstractC4454f;
import ih0.AbstractC18489d0;
import j93.InterfaceC21461d;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.internal.JsonInternalDependenciesKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import kotlinx.serialization.json.internal.JsonException;
import m83.AbstractC25247g0;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p437qt.C30582e;
import p549vb.AbstractC35862g;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.C37142g;
import wc3.InterfaceC37137b;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37145j;
import yc3.AbstractC39440d;
import yc3.AbstractC39442f;
import yc3.AbstractC39447k;
import yc3.C39445i;
import yc3.C39446j;
import yc3.C39448l;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: bd3.q */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3138q {

    /* JADX INFO: renamed from: a */
    public static final C30582e f12296a;

    /* JADX INFO: renamed from: b */
    public static final C30582e f12297b;

    static {
        int i13 = 10;
        f12296a = new C30582e(i13);
        f12297b = new C30582e(i13);
    }

    /* JADX INFO: renamed from: a */
    public static final JsonEncodingException m9005a(String str, Number number) {
        return new JsonEncodingException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m9022r(-1, str)));
    }

    /* JADX INFO: renamed from: b */
    public static final JsonEncodingException m9006b(InterfaceC39443g keyDescriptor) {
        AbstractC22676k.m65750j(keyDescriptor, "keyDescriptor");
        return new JsonEncodingException("Value of type '" + keyDescriptor.getSerialName() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    /* JADX INFO: renamed from: c */
    public static final JsonDecodingException m9007c(int i13, String message) {
        AbstractC22676k.m65750j(message, "message");
        if (i13 >= 0) {
            message = AbstractC11266d.m30456j(i13, "Unexpected JSON token at offset ", ": ", message);
        }
        return new JsonDecodingException(message);
    }

    /* JADX INFO: renamed from: d */
    public static final JsonDecodingException m9008d(CharSequence input, int i13, String message) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(input, "input");
        return m9007c(i13, message + "\nJSON input: " + ((Object) m9022r(i13, input)));
    }

    /* JADX INFO: renamed from: e */
    public static final void m9009e(InterfaceC37145j interfaceC37145j, InterfaceC37145j interfaceC37145j2, String str) {
        if ((interfaceC37145j instanceof C37142g) && JsonInternalDependenciesKt.jsonCachedSerialNames(interfaceC37145j2.getDescriptor()).contains(str)) {
            StringBuilder sbM32001t = AbstractC11895b.m32001t("Sealed class '", interfaceC37145j2.getDescriptor().getSerialName(), "' cannot be serialized as base class '", ((C37142g) interfaceC37145j).getDescriptor().getSerialName(), "' because it has property name that conflicts with JSON class discriminator '");
            sbM32001t.append(str);
            sbM32001t.append("'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            throw new IllegalStateException(sbM32001t.toString().toString());
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m9010f(LinkedHashMap linkedHashMap, InterfaceC39443g interfaceC39443g, String str, int i13) {
        String str2 = AbstractC22676k.m65745e(interfaceC39443g.getKind(), C39446j.f169712a) ? "enum value" : "property";
        if (!linkedHashMap.containsKey(str)) {
            linkedHashMap.put(str, Integer.valueOf(i13));
            return;
        }
        String message = "The suggested name '" + str + "' for " + str2 + ' ' + interfaceC39443g.getElementName(i13) + " is already one of the names for " + str2 + ' ' + interfaceC39443g.getElementName(((Number) AbstractC25247g0.m73986U(str, linkedHashMap)).intValue()) + " in " + interfaceC39443g;
        AbstractC22676k.m65750j(message, "message");
        throw new JsonException(message);
    }

    /* JADX INFO: renamed from: g */
    public static final InterfaceC39443g m9011g(InterfaceC39443g interfaceC39443g, AbstractC4454f module) {
        InterfaceC39443g interfaceC39443gM9011g;
        InterfaceC37138c interfaceC37138cMo13924b;
        AbstractC22676k.m65750j(interfaceC39443g, "<this>");
        AbstractC22676k.m65750j(module, "module");
        if (!AbstractC22676k.m65745e(interfaceC39443g.getKind(), C39445i.f169711a)) {
            return interfaceC39443g.getIsInline() ? m9011g(interfaceC39443g.getElementDescriptor(0), module) : interfaceC39443g;
        }
        InterfaceC21461d interfaceC21461dM113839b = AbstractC35862g.m113839b(interfaceC39443g);
        InterfaceC39443g descriptor = null;
        if (interfaceC21461dM113839b != null && (interfaceC37138cMo13924b = module.mo13924b(interfaceC21461dM113839b, C25271y.f99162w)) != null) {
            descriptor = interfaceC37138cMo13924b.getDescriptor();
        }
        return (descriptor == null || (interfaceC39443gM9011g = m9011g(descriptor, module)) == null) ? interfaceC39443g : interfaceC39443gM9011g;
    }

    /* JADX INFO: renamed from: h */
    public static final byte m9012h(char c3) {
        if (c3 < '~') {
            return C3126i.f12266b[c3];
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: i */
    public static final void m9013i(AbstractC39447k kind) {
        AbstractC22676k.m65750j(kind, "kind");
        if (kind instanceof C39446j) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof AbstractC39442f) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof AbstractC39440d) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    /* JADX INFO: renamed from: j */
    public static final String m9014j(AbstractC0757c json, InterfaceC39443g interfaceC39443g) {
        AbstractC22676k.m65750j(interfaceC39443g, "<this>");
        AbstractC22676k.m65750j(json, "json");
        for (Annotation annotation : interfaceC39443g.getAnnotations()) {
            if (annotation instanceof InterfaceC0765h) {
                return ((InterfaceC0765h) annotation).discriminator();
            }
        }
        return json.f2763a.f2797i;
    }

    /* JADX INFO: renamed from: k */
    public static final Map m9015k(AbstractC0757c abstractC0757c, InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(abstractC0757c, "<this>");
        AbstractC22676k.m65750j(descriptor, "descriptor");
        C0783z c0783z = abstractC0757c.f2765c;
        C0134l c0134l = new C0134l(2, descriptor, abstractC0757c);
        c0783z.getClass();
        AbstractC22676k.m65750j(descriptor, "descriptor");
        C30582e c30582e = f12296a;
        Object value = c0783z.m1868l(descriptor, c30582e);
        if (value == null) {
            value = c0134l.invoke();
            AbstractC22676k.m65750j(value, "value");
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c0783z.f2818x;
            Object concurrentHashMap2 = concurrentHashMap.get(descriptor);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(descriptor, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(c30582e, value);
        }
        return (Map) value;
    }

    /* JADX INFO: renamed from: l */
    public static final void m9016l(AbstractC0757c abstractC0757c, C3143v c3143v, InterfaceC37145j serializer, Object obj) {
        AbstractC22676k.m65750j(serializer, "serializer");
        new C3123g0(abstractC0757c.f2763a.f2793e ? new C3135n(c3143v, abstractC0757c) : new C3130k(c3143v), abstractC0757c, EnumC3133l0.OBJ, new InterfaceC0773p[EnumC3133l0.f12284H.mo73980a()]).encodeSerializableValue(serializer, obj);
    }

    /* JADX INFO: renamed from: m */
    public static final String m9017m(InterfaceC39443g interfaceC39443g, AbstractC0757c json, int i13) {
        AbstractC22676k.m65750j(json, "json");
        C0779v c0779vM9023s = m9023s(json, interfaceC39443g);
        if (c0779vM9023s == null) {
            return interfaceC39443g.getElementName(i13);
        }
        C0783z c0783z = json.f2765c;
        c0783z.getClass();
        C30582e c30582e = f12297b;
        Object objM1868l = c0783z.m1868l(interfaceC39443g, c30582e);
        if (objM1868l == null) {
            int elementsCount = interfaceC39443g.getElementsCount();
            String[] strArr = new String[elementsCount];
            for (int i14 = 0; i14 < elementsCount; i14++) {
                strArr[i14] = c0779vM9023s.m1854a(interfaceC39443g, interfaceC39443g.getElementName(i14));
            }
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c0783z.f2818x;
            Object concurrentHashMap2 = concurrentHashMap.get(interfaceC39443g);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(interfaceC39443g, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(c30582e, strArr);
            objM1868l = strArr;
        }
        return ((String[]) objM1868l)[i13];
    }

    /* JADX INFO: renamed from: n */
    public static final int m9018n(InterfaceC39443g interfaceC39443g, AbstractC0757c json, String name) {
        AbstractC22676k.m65750j(interfaceC39443g, "<this>");
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(name, "name");
        C0766i c0766i = json.f2763a;
        if (c0766i.f2801m && AbstractC22676k.m65745e(interfaceC39443g.getKind(), C39446j.f169712a)) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            Integer num = (Integer) m9015k(json, interfaceC39443g).get(lowerCase);
            if (num != null) {
                return num.intValue();
            }
            return -3;
        }
        if (m9023s(json, interfaceC39443g) != null) {
            Integer num2 = (Integer) m9015k(json, interfaceC39443g).get(name);
            if (num2 != null) {
                return num2.intValue();
            }
            return -3;
        }
        int elementIndex = interfaceC39443g.getElementIndex(name);
        if (elementIndex != -3 || !c0766i.f2799k) {
            return elementIndex;
        }
        Integer num3 = (Integer) m9015k(json, interfaceC39443g).get(name);
        if (num3 != null) {
            return num3.intValue();
        }
        return -3;
    }

    /* JADX INFO: renamed from: o */
    public static final int m9019o(InterfaceC39443g interfaceC39443g, AbstractC0757c json, String name, String suffix) {
        AbstractC22676k.m65750j(interfaceC39443g, "<this>");
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(suffix, "suffix");
        int iM9018n = m9018n(interfaceC39443g, json, name);
        if (iM9018n != -3) {
            return iM9018n;
        }
        throw new SerializationException(interfaceC39443g.getSerialName() + " does not contain element with name '" + name + '\'' + suffix);
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m9020p(AbstractC0757c json, InterfaceC39443g interfaceC39443g) {
        AbstractC22676k.m65750j(interfaceC39443g, "<this>");
        AbstractC22676k.m65750j(json, "json");
        if (json.f2763a.f2790b) {
            return true;
        }
        List annotations = interfaceC39443g.getAnnotations();
        if ((annotations instanceof Collection) && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof InterfaceC0774q) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public static final void m9021q(AbstractC3110a abstractC3110a, String str) {
        abstractC3110a.m8964q(abstractC3110a.f12210a - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    /* JADX INFO: renamed from: r */
    public static final CharSequence m9022r(int i13, CharSequence charSequence) {
        AbstractC22676k.m65750j(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i13 != -1) {
                int i14 = i13 - 30;
                int i15 = i13 + 30;
                String str = i14 <= 0 ? "" : ".....";
                String str2 = i15 >= charSequence.length() ? "" : ".....";
                StringBuilder sbM53374o = AbstractC18489d0.m53374o(str);
                if (i14 < 0) {
                    i14 = 0;
                }
                int length = charSequence.length();
                if (i15 > length) {
                    i15 = length;
                }
                sbM53374o.append(charSequence.subSequence(i14, i15).toString());
                sbM53374o.append(str2);
                return sbM53374o.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: s */
    public static final C0779v m9023s(AbstractC0757c json, InterfaceC39443g interfaceC39443g) {
        AbstractC22676k.m65750j(interfaceC39443g, "<this>");
        AbstractC22676k.m65750j(json, "json");
        if (AbstractC22676k.m65745e(interfaceC39443g.getKind(), C39448l.f169713a)) {
            return json.f2763a.f2800l;
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static final Object m9024t(AbstractC0757c abstractC0757c, String discriminator, JsonObject jsonObject, InterfaceC37137b interfaceC37137b) {
        AbstractC22676k.m65750j(abstractC0757c, "<this>");
        AbstractC22676k.m65750j(discriminator, "discriminator");
        return new C3144w(abstractC0757c, jsonObject, discriminator, interfaceC37137b.getDescriptor()).decodeSerializableValue(interfaceC37137b);
    }

    /* JADX INFO: renamed from: u */
    public static final EnumC3133l0 m9025u(AbstractC0757c abstractC0757c, InterfaceC39443g desc) {
        AbstractC22676k.m65750j(abstractC0757c, "<this>");
        AbstractC22676k.m65750j(desc, "desc");
        AbstractC39447k kind = desc.getKind();
        if (kind instanceof AbstractC39440d) {
            return EnumC3133l0.POLY_OBJ;
        }
        if (AbstractC22676k.m65745e(kind, C39448l.f169714b)) {
            return EnumC3133l0.LIST;
        }
        if (!AbstractC22676k.m65745e(kind, C39448l.f169715c)) {
            return EnumC3133l0.OBJ;
        }
        InterfaceC39443g interfaceC39443gM9011g = m9011g(desc.getElementDescriptor(0), abstractC0757c.f2764b);
        AbstractC39447k kind2 = interfaceC39443gM9011g.getKind();
        if ((kind2 instanceof AbstractC39442f) || AbstractC22676k.m65745e(kind2, C39446j.f169712a)) {
            return EnumC3133l0.MAP;
        }
        if (abstractC0757c.f2763a.f2792d) {
            return EnumC3133l0.LIST;
        }
        throw m9006b(interfaceC39443gM9011g);
    }

    /* JADX INFO: renamed from: v */
    public static final void m9026v(AbstractC3110a abstractC3110a, Number number) {
        AbstractC3110a.m8942r(abstractC3110a, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    /* JADX INFO: renamed from: w */
    public static final void m9027w(String str, JsonElement element) {
        AbstractC22676k.m65750j(element, "element");
        StringBuilder sbM53375p = AbstractC18489d0.m53375p("Class with serial name ", str, " cannot be serialized polymorphically because it is represented as ");
        sbM53375p.append(AbstractC22671h0.f89337a.getOrCreateKotlinClass(element.getClass()).getSimpleName());
        sbM53375p.append(". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
        throw new JsonEncodingException(sbM53375p.toString());
    }

    /* JADX INFO: renamed from: x */
    public static final String m9028x(byte b) {
        if (b == 1) {
            return "quotation mark '\"'";
        }
        if (b == 2) {
            return "string escape sequence '\\'";
        }
        if (b == 4) {
            return "comma ','";
        }
        if (b == 5) {
            return "colon ':'";
        }
        if (b == 6) {
            return "start of the object '{'";
        }
        if (b == 7) {
            return "end of the object '}'";
        }
        if (b == 8) {
            return "start of the array '['";
        }
        if (b == 9) {
            return "end of the array ']'";
        }
        if (b == 10) {
            return "end of the input";
        }
        return b == 127 ? "invalid token" : "valid token";
    }

    /* JADX INFO: renamed from: y */
    public static final String m9029y(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m9022r(-1, str2));
    }
}
