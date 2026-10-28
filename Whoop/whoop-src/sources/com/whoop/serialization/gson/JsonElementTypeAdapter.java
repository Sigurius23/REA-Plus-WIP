package com.whoop.serialization.gson;

import ad3.AbstractC0770m;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import live.hms.video.factories.MediaConstraintsFactory;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/serialization/gson/JsonElementTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lkotlinx/serialization/json/JsonElement;", "<init>", "()V", "Lcom/google/gson/stream/JsonWriter;", "out", "value", "Ll83/a0;", "b", "(Lcom/google/gson/stream/JsonWriter;Lkotlinx/serialization/json/JsonElement;)V", "Lcom/google/gson/stream/JsonReader;", "in", "a", "(Lcom/google/gson/stream/JsonReader;)Lkotlinx/serialization/json/JsonElement;", "serialization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class JsonElementTypeAdapter extends TypeAdapter<JsonElement> {

    /* JADX INFO: renamed from: com.whoop.serialization.gson.JsonElementTypeAdapter$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C9972a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f29448a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            try {
                iArr[JsonToken.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JsonToken.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[JsonToken.STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[JsonToken.BEGIN_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f29448a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14, types: [kotlinx.serialization.json.JsonElement] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public JsonElement read2(JsonReader in3) throws IOException {
        AbstractC22676k.m65750j(in3, "in");
        JsonToken jsonTokenPeek = in3.peek();
        switch (jsonTokenPeek == null ? -1 : C9972a.f29448a[jsonTokenPeek.ordinal()]) {
            case 1:
                in3.nextNull();
                return JsonNull.INSTANCE;
            case 2:
                return AbstractC0770m.m1839a(Boolean.valueOf(in3.nextBoolean()));
            case 3:
                String strNextString = in3.nextString();
                AbstractC22676k.m65747g(strNextString);
                if (AbstractC39414r.m125875T(strNextString, '.', false) || AbstractC39414r.m125875T(strNextString, 'e', true)) {
                    try {
                        return AbstractC0770m.m1840b(Double.valueOf(Double.parseDouble(strNextString)));
                    } catch (NumberFormatException unused) {
                        return AbstractC0770m.m1841c(strNextString);
                    }
                }
                try {
                    try {
                        long j7 = Long.parseLong(strNextString);
                        strNextString = (j7 < -2147483648L || j7 > 2147483647L) ? AbstractC0770m.m1840b(Long.valueOf(j7)) : AbstractC0770m.m1840b(Integer.valueOf((int) j7));
                        return strNextString;
                    } catch (NumberFormatException unused2) {
                        return AbstractC0770m.m1841c(strNextString);
                    }
                } catch (NumberFormatException unused3) {
                    return AbstractC0770m.m1840b(Double.valueOf(Double.parseDouble(strNextString)));
                }
            case 4:
                return AbstractC0770m.m1841c(in3.nextString());
            case 5:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                in3.beginObject();
                while (in3.hasNext()) {
                    linkedHashMap.put(in3.nextName(), read2(in3));
                }
                in3.endObject();
                return new JsonObject(linkedHashMap);
            case 6:
                ArrayList arrayList = new ArrayList();
                in3.beginArray();
                while (in3.hasNext()) {
                    arrayList.add(read2(in3));
                }
                in3.endArray();
                return new JsonArray(arrayList);
            default:
                throw new IOException("Unexpected token: " + in3.peek());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void write(JsonWriter out, JsonElement value) throws IOException {
        AbstractC22676k.m65750j(out, "out");
        if (value == 0 || (value instanceof JsonNull)) {
            out.nullValue();
            return;
        }
        if (!(value instanceof JsonPrimitive)) {
            if (!(value instanceof JsonObject)) {
                if (!(value instanceof JsonArray)) {
                    out.value(value.toString());
                    return;
                }
                out.beginArray();
                Iterator<JsonElement> it = ((JsonArray) value).iterator();
                while (it.hasNext()) {
                    write(out, it.next());
                }
                out.endArray();
                return;
            }
            out.beginObject();
            for (Map.Entry entry : ((Map) value).entrySet()) {
                String str = (String) entry.getKey();
                JsonElement jsonElement = (JsonElement) entry.getValue();
                out.name(str);
                write(out, jsonElement);
            }
            out.endObject();
            return;
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) value;
        if (jsonPrimitive.isString()) {
            out.value(jsonPrimitive.getContent());
            return;
        }
        String content = jsonPrimitive.getContent();
        if (AbstractC39421y.m125921F(content, MediaConstraintsFactory.kValueTrue, true)) {
            out.value(true);
            return;
        }
        if (AbstractC39421y.m125921F(content, MediaConstraintsFactory.kValueFalse, true)) {
            out.value(false);
            return;
        }
        if (AbstractC39414r.m125875T(content, '.', false) || AbstractC39414r.m125875T(content, 'e', true)) {
            try {
                out.value(Double.parseDouble(content));
            } catch (NumberFormatException unused) {
                out.value(content);
            }
        } else {
            try {
                try {
                    out.value(Long.parseLong(content));
                } catch (NumberFormatException unused2) {
                    out.value(Double.parseDouble(content));
                }
            } catch (NumberFormatException unused3) {
                out.value(content);
            }
        }
    }
}
