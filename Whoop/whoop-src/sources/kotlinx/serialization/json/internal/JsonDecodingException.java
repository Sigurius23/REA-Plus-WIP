package kotlinx.serialization.json.internal;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Lkotlinx/serialization/json/internal/JsonDecodingException;", "Lkotlinx/serialization/json/internal/JsonException;", "kotlinx-serialization-json"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class JsonDecodingException extends JsonException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonDecodingException(String message) {
        super(message);
        AbstractC22676k.m65750j(message, "message");
    }
}
