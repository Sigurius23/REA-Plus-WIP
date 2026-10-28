package androidx.glance.appwidget.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class InvalidProtocolBufferException extends IOException {

    /* JADX INFO: renamed from: w */
    public boolean f5862w;

    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
    }

    /* JADX INFO: renamed from: a */
    public static InvalidProtocolBufferException m4261a() {
        return new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: renamed from: b */
    public static InvalidProtocolBufferException m4262b() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: c */
    public static InvalidWireTypeException m4263c() {
        return new InvalidWireTypeException("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: renamed from: d */
    public static InvalidProtocolBufferException m4264d() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: e */
    public static InvalidProtocolBufferException m4265e() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: f */
    public static InvalidProtocolBufferException m4266f() {
        return new InvalidProtocolBufferException("Failed to parse the message.");
    }

    /* JADX INFO: renamed from: g */
    public static InvalidProtocolBufferException m4267g() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
