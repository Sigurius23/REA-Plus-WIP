package kotlinx.serialization.protobuf.internal;

import kotlinx.serialization.SerializationException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;", "Lkotlinx/serialization/SerializationException;", "kotlinx-serialization-protobuf"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ProtobufDecodingException extends SerializationException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProtobufDecodingException(String message, ProtobufDecodingException protobufDecodingException) {
        super(message, protobufDecodingException);
        AbstractC22676k.m65750j(message, "message");
    }
}
