package com.fatboyindustrial.gsonjodatime;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes.dex */
public class DateTimeZoneConverter implements JsonSerializer<DateTimeZone>, JsonDeserializer<DateTimeZone> {
    @Override // com.google.gson.JsonDeserializer
    public final DateTimeZone deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement.getAsString() == null || jsonElement.getAsString().isEmpty()) {
            return null;
        }
        return DateTimeZone.forID(jsonElement.getAsString().trim());
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement serialize(DateTimeZone dateTimeZone, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive(dateTimeZone.getID());
    }
}
