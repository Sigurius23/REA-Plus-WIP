package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class InvalidProtocolBufferException extends IOException {

    /* JADX INFO: renamed from: w */
    public boolean f5349w;

    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
    }

    /* JADX INFO: renamed from: a */
    public static InvalidProtocolBufferException m3743a() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: b */
    public static InvalidWireTypeException m3744b() {
        return new InvalidWireTypeException("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: renamed from: c */
    public static InvalidProtocolBufferException m3745c() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: d */
    public static InvalidProtocolBufferException m3746d() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: e */
    public static InvalidProtocolBufferException m3747e() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
