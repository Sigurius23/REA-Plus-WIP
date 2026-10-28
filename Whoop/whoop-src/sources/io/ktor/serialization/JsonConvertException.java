package io.ktor.serialization;

import com.google.gson.JsonSyntaxException;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Lio/ktor/serialization/JsonConvertException;", "Lio/ktor/serialization/ContentConvertException;", "ktor-serialization"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class JsonConvertException extends ContentConvertException {
    public JsonConvertException(JsonSyntaxException jsonSyntaxException) {
        super("Illegal json parameter found", jsonSyntaxException);
    }
}
