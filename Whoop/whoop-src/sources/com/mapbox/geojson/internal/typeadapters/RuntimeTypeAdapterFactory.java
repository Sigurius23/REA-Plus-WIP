package com.mapbox.geojson.internal.typeadapters;

import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import p000.AbstractC11266d;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public final class RuntimeTypeAdapterFactory<T> implements TypeAdapterFactory {
    private final Class<?> baseType;
    private final boolean maintainType;
    private final String typeFieldName;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();

    private RuntimeTypeAdapterFactory(Class<?> cls, String str, boolean z4) {
        if (str == null || cls == null) {
            throw null;
        }
        this.baseType = cls;
        this.typeFieldName = str;
        this.maintainType = z4;
    }

    /* JADX INFO: renamed from: of */
    public static <T> RuntimeTypeAdapterFactory<T> m16630of(Class<T> cls, String str, boolean z4) {
        return new RuntimeTypeAdapterFactory<>(cls, str, z4);
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <R> TypeAdapter<R> create(Gson gson, TypeToken<R> typeToken) {
        if (typeToken.getRawType() != this.baseType) {
            return null;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, Class<?>> entry : this.labelToSubtype.entrySet()) {
            TypeAdapter<T> delegateAdapter = gson.getDelegateAdapter(this, TypeToken.get((Class) entry.getValue()));
            linkedHashMap.put(entry.getKey(), delegateAdapter);
            linkedHashMap2.put(entry.getValue(), delegateAdapter);
        }
        return new TypeAdapter<R>() { // from class: com.mapbox.geojson.internal.typeadapters.RuntimeTypeAdapterFactory.1
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: read */
            public R read2(JsonReader jsonReader) throws IOException {
                JsonElement jsonElement = Streams.parse(jsonReader);
                JsonElement jsonElementRemove = RuntimeTypeAdapterFactory.this.maintainType ? jsonElement.getAsJsonObject().get(RuntimeTypeAdapterFactory.this.typeFieldName) : jsonElement.getAsJsonObject().remove(RuntimeTypeAdapterFactory.this.typeFieldName);
                if (jsonElementRemove == null) {
                    throw new JsonParseException("cannot deserialize " + RuntimeTypeAdapterFactory.this.baseType + " because it does not define a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
                }
                String asString = jsonElementRemove.getAsString();
                TypeAdapter typeAdapter = (TypeAdapter) linkedHashMap.get(asString);
                if (typeAdapter != null) {
                    return (R) typeAdapter.fromJsonTree(jsonElement);
                }
                throw new JsonParseException("cannot deserialize " + RuntimeTypeAdapterFactory.this.baseType + " subtype named " + asString + "; did you forget to register a subtype?");
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, R r10) throws IOException {
                Class<?> cls = r10.getClass();
                TypeAdapter typeAdapter = (TypeAdapter) linkedHashMap2.get(cls);
                if (typeAdapter == null) {
                    throw new JsonParseException("cannot serialize " + cls.getName() + "; did you forget to register a subtype?");
                }
                JsonObject asJsonObject = typeAdapter.toJsonTree(r10).getAsJsonObject();
                if (RuntimeTypeAdapterFactory.this.maintainType) {
                    Streams.write(asJsonObject, jsonWriter);
                    return;
                }
                JsonObject jsonObject = new JsonObject();
                if (asJsonObject.has(RuntimeTypeAdapterFactory.this.typeFieldName)) {
                    StringBuilder sb4 = new StringBuilder("cannot serialize ");
                    AbstractC11266d.m30443A(cls, sb4, " because it already defines a field named ");
                    sb4.append(RuntimeTypeAdapterFactory.this.typeFieldName);
                    throw new JsonParseException(sb4.toString());
                }
                jsonObject.add(RuntimeTypeAdapterFactory.this.typeFieldName, new JsonPrimitive((String) RuntimeTypeAdapterFactory.this.subtypeToLabel.get(cls)));
                for (Map.Entry<String, JsonElement> entry2 : asJsonObject.entrySet()) {
                    jsonObject.add(entry2.getKey(), entry2.getValue());
                }
                Streams.write(jsonObject, jsonWriter);
            }
        }.nullSafe();
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls, String str) {
        if (cls == null || str == null) {
            throw null;
        }
        if (this.subtypeToLabel.containsKey(cls) || this.labelToSubtype.containsKey(str)) {
            throw new IllegalArgumentException("types and labels must be unique");
        }
        this.labelToSubtype.put(str, cls);
        this.subtypeToLabel.put(cls, str);
        return this;
    }

    /* JADX INFO: renamed from: of */
    public static <T> RuntimeTypeAdapterFactory<T> m16629of(Class<T> cls, String str) {
        return new RuntimeTypeAdapterFactory<>(cls, str, false);
    }

    /* JADX INFO: renamed from: of */
    public static <T> RuntimeTypeAdapterFactory<T> m16628of(Class<T> cls) {
        return new RuntimeTypeAdapterFactory<>(cls, "type", false);
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls) {
        return registerSubtype(cls, cls.getSimpleName());
    }
}
