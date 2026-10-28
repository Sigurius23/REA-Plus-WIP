package com.fatboyindustrial.gsonjodatime;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import org.joda.time.Interval;

/* JADX INFO: loaded from: classes.dex */
public class IntervalConverter implements JsonSerializer<Interval>, JsonDeserializer<Interval> {
    @Override // com.google.gson.JsonDeserializer
    public final Interval deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement.getAsString() == null || jsonElement.getAsString().isEmpty()) {
            return null;
        }
        return new Interval(jsonElement.getAsString());
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement serialize(Interval interval, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive(interval.toString());
    }
}
