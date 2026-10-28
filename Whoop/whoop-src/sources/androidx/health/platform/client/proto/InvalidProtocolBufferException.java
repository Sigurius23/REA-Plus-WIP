package androidx.health.platform.client.proto;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class InvalidProtocolBufferException extends IOException {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ int f6012w = 0;

    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
    }

    /* JADX INFO: renamed from: a */
    public static InvalidProtocolBufferException m4558a() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: b */
    public static InvalidProtocolBufferException m4559b() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: c */
    public static InvalidProtocolBufferException m4560c() {
        return new InvalidProtocolBufferException("Failed to parse the message.");
    }

    /* JADX INFO: renamed from: d */
    public static InvalidProtocolBufferException m4561d() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
