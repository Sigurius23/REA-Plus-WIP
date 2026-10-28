package aws.smithy.kotlin.runtime.p022io;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Laws/smithy/kotlin/runtime/io/EOFException;", "Ljava/io/EOFException;", "<init>", "()V", "runtime-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public class EOFException extends java.io.EOFException {
    public EOFException(String str, java.io.EOFException eOFException) {
        super(str);
        initCause(eOFException);
    }

    public EOFException() {
        this(null, null);
    }
}
