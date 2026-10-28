package io.getstream.chat.android.client.parser2.direct;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p441qx.EnumC30741w;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019JA\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001f2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b \u0010!J1\u0010$\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001f\"\u0004\b\u0000\u0010\u00042\u0006\u0010\t\u001a\u00020\b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"¢\u0006\u0004\b$\u0010%J#\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010&2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b'\u0010(J#\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0018\u00010&2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b)\u0010(¨\u0006*"}, m65681d2 = {"Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;", "", "<init>", "()V", "T", "value", "", "fieldName", "Lcom/squareup/moshi/JsonReader;", "reader", "requireField", "(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;", "Ll83/a0;", "rejectExplicitNull", "(Lcom/squareup/moshi/JsonReader;Ljava/lang/String;)V", "", "readNullableInt", "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Integer;", "readNullableString", "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/String;", "", "readNullableBoolean", "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Boolean;", "", "readNullableLong", "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Long;", "key", "", "extraData", "accumulateExtraData", "(Ljava/lang/String;Lcom/squareup/moshi/JsonReader;Ljava/util/Map;)Ljava/util/Map;", "", "parseStringList", "(Lcom/squareup/moshi/JsonReader;)Ljava/util/List;", "Lcom/squareup/moshi/JsonAdapter;", "adapter", "parseList", "(Lcom/squareup/moshi/JsonReader;Lcom/squareup/moshi/JsonAdapter;)Ljava/util/List;", "", "parseStringMap", "(Lcom/squareup/moshi/JsonReader;)Ljava/util/Map;", "parseIntMap", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class JsonParsingUtils {
    public static final JsonParsingUtils INSTANCE = new JsonParsingUtils();

    private JsonParsingUtils() {
    }

    public final Map<String, Object> accumulateExtraData(String key, JsonReader reader, Map<String, Object> extraData) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(reader, "reader");
        Object objM16724J = reader.m16724J();
        if (objM16724J == null) {
            return extraData;
        }
        if (extraData == null) {
            extraData = new LinkedHashMap<>();
        }
        extraData.put(key, objM16724J);
        return extraData;
    }

    public final Map<String, Integer> parseIntMap(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        if (reader.mo16731k() == EnumC30741w.f126546I) {
            reader.mo16730i();
            return null;
        }
        if (reader.mo16731k() != EnumC30741w.f126551y) {
            reader.skipValue();
            return null;
        }
        reader.beginObject();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (reader.hasNext()) {
            linkedHashMap.put(reader.nextName(), Integer.valueOf(reader.nextInt()));
        }
        reader.endObject();
        return linkedHashMap;
    }

    public final <T> List<T> parseList(JsonReader reader, JsonAdapter<T> adapter) {
        AbstractC22676k.m65750j(reader, "reader");
        AbstractC22676k.m65750j(adapter, "adapter");
        if (reader.mo16731k() == EnumC30741w.f126546I) {
            reader.mo16730i();
            return null;
        }
        if (reader.mo16731k() != EnumC30741w.f126549w) {
            reader.skipValue();
            return null;
        }
        reader.beginArray();
        ArrayList arrayList = new ArrayList();
        while (reader.hasNext()) {
            Object objFromJson = adapter.fromJson(reader);
            if (objFromJson != null) {
                arrayList.add(objFromJson);
            }
        }
        reader.endArray();
        return arrayList;
    }

    public final List<String> parseStringList(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        if (reader.mo16731k() == EnumC30741w.f126546I) {
            reader.mo16730i();
            return null;
        }
        if (reader.mo16731k() != EnumC30741w.f126549w) {
            reader.skipValue();
            return null;
        }
        reader.beginArray();
        ArrayList arrayList = new ArrayList();
        while (reader.hasNext()) {
            String strNextString = reader.nextString();
            AbstractC22676k.m65749i(strNextString, "nextString(...)");
            arrayList.add(strNextString);
        }
        reader.endArray();
        return arrayList;
    }

    public final Map<String, String> parseStringMap(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        if (reader.mo16731k() == EnumC30741w.f126546I) {
            reader.mo16730i();
            return null;
        }
        if (reader.mo16731k() != EnumC30741w.f126551y) {
            reader.skipValue();
            return null;
        }
        reader.beginObject();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (reader.hasNext()) {
            linkedHashMap.put(reader.nextName(), reader.nextString());
        }
        reader.endObject();
        return linkedHashMap;
    }

    public final Boolean readNullableBoolean(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        if (reader.mo16731k() != EnumC30741w.f126546I) {
            return Boolean.valueOf(reader.mo16729h());
        }
        reader.mo16730i();
        return null;
    }

    public final Integer readNullableInt(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        if (reader.mo16731k() != EnumC30741w.f126546I) {
            return Integer.valueOf(reader.nextInt());
        }
        reader.mo16730i();
        return null;
    }

    public final Long readNullableLong(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        if (reader.mo16731k() != EnumC30741w.f126546I) {
            return Long.valueOf(reader.nextLong());
        }
        reader.mo16730i();
        return null;
    }

    public final String readNullableString(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        if (reader.mo16731k() != EnumC30741w.f126546I) {
            return reader.nextString();
        }
        reader.mo16730i();
        return null;
    }

    public final void rejectExplicitNull(JsonReader reader, String fieldName) {
        AbstractC22676k.m65750j(reader, "reader");
        AbstractC22676k.m65750j(fieldName, "fieldName");
        if (reader.mo16731k() == EnumC30741w.f126546I) {
            throw new JsonDataException(AbstractC31061c.m95640p("Non-null value '", fieldName, "' was null at ", reader.m16727b()));
        }
    }

    public final <T> T requireField(T value, String fieldName, JsonReader reader) {
        AbstractC22676k.m65750j(fieldName, "fieldName");
        AbstractC22676k.m65750j(reader, "reader");
        if (value != null) {
            return value;
        }
        throw new JsonDataException(AbstractC31061c.m95640p("Required value '", fieldName, "' missing at ", reader.m16727b()));
    }
}
