package com.fatboyindustrial.gsonjodatime;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import org.joda.time.DateMidnight;
import org.joda.time.format.ISODateTimeFormat;

/* JADX INFO: loaded from: classes.dex */
public class DateMidnightConverter implements JsonSerializer<DateMidnight>, JsonDeserializer<DateMidnight> {
    @Override // com.google.gson.JsonDeserializer
    public final DateMidnight deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement.getAsString() == null || jsonElement.getAsString().isEmpty()) {
            return null;
        }
        return new DateMidnight(ISODateTimeFormat.dateTime().parseDateTime(jsonElement.getAsString()));
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement serialize(DateMidnight dateMidnight, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive(ISODateTimeFormat.dateTime().print(dateMidnight));
    }
}
