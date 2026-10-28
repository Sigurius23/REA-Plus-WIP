package com.fatboyindustrial.gsonjodatime;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;

/* JADX INFO: loaded from: classes.dex */
public class LocalDateTimeConverter implements JsonSerializer<LocalDateTime>, JsonDeserializer<LocalDateTime> {
    @Override // com.google.gson.JsonDeserializer
    public final LocalDateTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement.getAsString() == null || jsonElement.getAsString().isEmpty()) {
            return null;
        }
        return DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS").parseLocalDateTime(jsonElement.getAsString());
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement serialize(LocalDateTime localDateTime, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive(DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS").print(localDateTime));
    }
}
