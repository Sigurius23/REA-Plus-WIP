package com.google.crypto.tink.internal;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import p000.AbstractC11266d;

/* JADX INFO: loaded from: classes6.dex */
final class JsonParser$JsonElementTypeAdapter extends TypeAdapter<JsonElement> {
    private JsonParser$JsonElementTypeAdapter() {
    }

    /* JADX INFO: renamed from: a */
    public static JsonElement m15926a(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i13 = AbstractC5090g.f21419a[jsonToken.ordinal()];
        if (i13 == 3) {
            String strNextString = jsonReader.nextString();
            if (AbstractC5094i.m15970a(strNextString)) {
                return new JsonPrimitive(strNextString);
            }
            throw new IOException("illegal characters in string");
        }
        if (i13 == 4) {
            return new JsonPrimitive(new C5092h(jsonReader.nextString()));
        }
        if (i13 == 5) {
            return new JsonPrimitive(Boolean.valueOf(jsonReader.nextBoolean()));
        }
        if (i13 == 6) {
            jsonReader.nextNull();
            return JsonNull.INSTANCE;
        }
        throw new IllegalStateException("Unexpected token: " + jsonToken);
    }

    /* JADX INFO: renamed from: b */
    public static JsonElement m15927b(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i13 = AbstractC5090g.f21419a[jsonToken.ordinal()];
        if (i13 == 1) {
            jsonReader.beginArray();
            return new JsonArray();
        }
        if (i13 != 2) {
            return null;
        }
        jsonReader.beginObject();
        return new JsonObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public final JsonElement read2(JsonReader jsonReader) throws IOException {
        String strNextName;
        JsonToken jsonTokenPeek = jsonReader.peek();
        JsonElement jsonElementM15927b = m15927b(jsonReader, jsonTokenPeek);
        if (jsonElementM15927b == null) {
            return m15926a(jsonReader, jsonTokenPeek);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (jsonReader.hasNext()) {
                if (jsonElementM15927b instanceof JsonObject) {
                    strNextName = jsonReader.nextName();
                    if (!AbstractC5094i.m15970a(strNextName)) {
                        throw new IOException("illegal characters in string");
                    }
                } else {
                    strNextName = null;
                }
                JsonToken jsonTokenPeek2 = jsonReader.peek();
                JsonElement jsonElementM15927b2 = m15927b(jsonReader, jsonTokenPeek2);
                boolean z4 = jsonElementM15927b2 != null;
                if (jsonElementM15927b2 == null) {
                    jsonElementM15927b2 = m15926a(jsonReader, jsonTokenPeek2);
                }
                if (jsonElementM15927b instanceof JsonArray) {
                    ((JsonArray) jsonElementM15927b).add(jsonElementM15927b2);
                } else {
                    JsonObject jsonObject = (JsonObject) jsonElementM15927b;
                    if (jsonObject.has(strNextName)) {
                        throw new IOException(AbstractC11266d.m30461o("duplicate key: ", strNextName));
                    }
                    jsonObject.add(strNextName, jsonElementM15927b2);
                }
                if (z4) {
                    arrayDeque.addLast(jsonElementM15927b);
                    if (arrayDeque.size() > 100) {
                        throw new IOException("too many recursions");
                    }
                    jsonElementM15927b = jsonElementM15927b2;
                } else {
                    continue;
                }
            } else {
                if (jsonElementM15927b instanceof JsonArray) {
                    jsonReader.endArray();
                } else {
                    jsonReader.endObject();
                }
                if (arrayDeque.isEmpty()) {
                    return jsonElementM15927b;
                }
                jsonElementM15927b = (JsonElement) arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, JsonElement jsonElement) {
        throw new UnsupportedOperationException("write is not supported");
    }

    public /* synthetic */ JsonParser$JsonElementTypeAdapter(int i13) {
        this();
    }
}
