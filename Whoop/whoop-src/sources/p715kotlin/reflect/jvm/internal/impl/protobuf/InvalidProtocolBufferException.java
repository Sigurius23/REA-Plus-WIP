package p715kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import wa3.AbstractC37006m;
import wa3.InterfaceC37019v;

/* JADX INFO: loaded from: classes5.dex */
public class InvalidProtocolBufferException extends IOException {

    /* JADX INFO: renamed from: w */
    public InterfaceC37019v f89345w;

    public InvalidProtocolBufferException(String str) {
        super(str);
        this.f89345w = null;
    }

    /* JADX INFO: renamed from: b */
    public static InvalidProtocolBufferException m65783b() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: a */
    public final void m65784a(AbstractC37006m abstractC37006m) {
        this.f89345w = abstractC37006m;
    }
}
