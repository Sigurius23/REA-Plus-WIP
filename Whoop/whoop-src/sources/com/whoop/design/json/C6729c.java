package com.whoop.design.json;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.whoop.design.json.c */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C6729c implements JsonDeserializer {
    @Override // com.google.gson.JsonDeserializer
    public final Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return AbstractC6730d.m20385c(jsonElement, type, jsonDeserializationContext);
    }
}
