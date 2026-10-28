package aws.smithy.kotlin.runtime;

import p501te.C33738c;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Laws/smithy/kotlin/runtime/SdkBaseException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "runtime-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public class SdkBaseException extends RuntimeException {

    /* JADX INFO: renamed from: w */
    public final C33738c f8399w;

    public SdkBaseException() {
        this.f8399w = new C33738c();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public C33738c getF8399w() {
        return this.f8399w;
    }

    public SdkBaseException(String str) {
        super(str);
        this.f8399w = new C33738c();
    }

    public SdkBaseException(String str, Throwable th3) {
        super(str, th3);
        this.f8399w = new C33738c();
    }

    public SdkBaseException(Exception exc) {
        super(exc);
        this.f8399w = new C33738c();
    }
}
