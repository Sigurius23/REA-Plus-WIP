package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class InvalidProtocolBufferException extends IOException {

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ int f21476x = 0;

    /* JADX INFO: renamed from: w */
    public boolean f21477w;

    /* JADX INFO: loaded from: classes6.dex */
    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
        public InvalidWireTypeException() {
            super("Protocol message tag had invalid wire type.");
        }
    }

    /* JADX INFO: renamed from: a */
    public static InvalidProtocolBufferException m16099a() {
        return new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: renamed from: b */
    public static InvalidProtocolBufferException m16100b() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: c */
    public static InvalidProtocolBufferException m16101c() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: d */
    public static InvalidProtocolBufferException m16102d() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: e */
    public static InvalidProtocolBufferException m16103e() {
        return new InvalidProtocolBufferException("Failed to parse the message.");
    }

    /* JADX INFO: renamed from: f */
    public static InvalidProtocolBufferException m16104f() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
