package ad3;

import bd3.AbstractC3110a;
import bd3.AbstractC3129j0;
import bd3.C3127i0;
import kotlinx.serialization.internal.InlineClassDescriptorKt;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.internal.JsonDecodingException;
import live.hms.video.factories.MediaConstraintsFactory;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39420x;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: ad3.m */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC0770m {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC39443g f2805a = InlineClassDescriptorKt.InlinePrimitiveDescriptor("kotlinx.serialization.json.JsonUnquotedLiteral", StringSerializer.INSTANCE);

    /* JADX INFO: renamed from: a */
    public static final JsonPrimitive m1839a(Boolean bool) {
        return bool == null ? JsonNull.INSTANCE : new C0776s(bool, false, null);
    }

    /* JADX INFO: renamed from: b */
    public static final JsonPrimitive m1840b(Number number) {
        return number == null ? JsonNull.INSTANCE : new C0776s(number, false, null);
    }

    /* JADX INFO: renamed from: c */
    public static final JsonPrimitive m1841c(String str) {
        return str == null ? JsonNull.INSTANCE : new C0776s(str, true, null);
    }

    /* JADX INFO: renamed from: d */
    public static final void m1842d(String str, JsonElement jsonElement) {
        throw new IllegalArgumentException("Element " + AbstractC22671h0.f89337a.getOrCreateKotlinClass(jsonElement.getClass()) + " is not a " + str);
    }

    /* JADX INFO: renamed from: e */
    public static final Boolean m1843e(JsonPrimitive jsonPrimitive) {
        AbstractC22676k.m65750j(jsonPrimitive, "<this>");
        String content = jsonPrimitive.getContent();
        String[] strArr = AbstractC3129j0.f12273a;
        AbstractC22676k.m65750j(content, "<this>");
        if (content.equalsIgnoreCase(MediaConstraintsFactory.kValueTrue)) {
            return Boolean.TRUE;
        }
        if (content.equalsIgnoreCase(MediaConstraintsFactory.kValueFalse)) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final String m1844f(JsonPrimitive jsonPrimitive) {
        AbstractC22676k.m65750j(jsonPrimitive, "<this>");
        if (jsonPrimitive instanceof JsonNull) {
            return null;
        }
        return jsonPrimitive.getContent();
    }

    /* JADX INFO: renamed from: g */
    public static final Double m1845g(JsonPrimitive jsonPrimitive) {
        AbstractC22676k.m65750j(jsonPrimitive, "<this>");
        return AbstractC39420x.m125914x(jsonPrimitive.getContent());
    }

    /* JADX INFO: renamed from: h */
    public static final Integer m1846h(JsonPrimitive jsonPrimitive) {
        Long lValueOf;
        AbstractC22676k.m65750j(jsonPrimitive, "<this>");
        try {
            lValueOf = Long.valueOf(m1850l(jsonPrimitive));
        } catch (JsonDecodingException unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            if (-2147483648L <= jLongValue && jLongValue <= 2147483647L) {
                return Integer.valueOf((int) jLongValue);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static final JsonObject m1847i(JsonElement jsonElement) {
        AbstractC22676k.m65750j(jsonElement, "<this>");
        JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        if (jsonObject != null) {
            return jsonObject;
        }
        m1842d("JsonObject", jsonElement);
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public static final JsonPrimitive m1848j(JsonElement jsonElement) {
        AbstractC22676k.m65750j(jsonElement, "<this>");
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        m1842d("JsonPrimitive", jsonElement);
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public static final Long m1849k(JsonPrimitive jsonPrimitive) {
        AbstractC22676k.m65750j(jsonPrimitive, "<this>");
        try {
            return Long.valueOf(m1850l(jsonPrimitive));
        } catch (JsonDecodingException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static final long m1850l(JsonPrimitive jsonPrimitive) {
        AbstractC22676k.m65750j(jsonPrimitive, "<this>");
        C3127i0 c3127i0 = new C3127i0(jsonPrimitive.getContent());
        long jM8956i = c3127i0.m8956i();
        if (c3127i0.mo8953f() == 10) {
            return jM8956i;
        }
        int i13 = c3127i0.f12210a;
        int i14 = i13 - 1;
        String str = c3127i0.f12267e;
        AbstractC3110a.m8942r(c3127i0, AbstractC11895b.m31996o("Expected input to contain a single valid number, but got '", (i13 == str.length() || i14 < 0) ? "EOF" : String.valueOf(str.charAt(i14)), "' after it"), i14, null, 4);
        throw null;
    }
}
