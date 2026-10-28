package aws.smithy.kotlin.runtime.retries;

import aws.smithy.kotlin.runtime.ClientException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m65681d2 = {"Laws/smithy/kotlin/runtime/retries/RetryException;", "Laws/smithy/kotlin/runtime/ClientException;", "Laws/smithy/kotlin/runtime/retries/RetryFailureException;", "Laws/smithy/kotlin/runtime/retries/TimedOutException;", "Laws/smithy/kotlin/runtime/retries/TooManyAttemptsException;", "runtime-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class RetryException extends ClientException {

    /* JADX INFO: renamed from: x */
    public final int f8402x;

    /* JADX INFO: renamed from: y */
    public final Object f8403y;

    /* JADX INFO: renamed from: z */
    public final Throwable f8404z;

    public RetryException(String str, Throwable th3, int i13, Object obj, Throwable th4) {
        super(str, th3);
        this.f8402x = i13;
        this.f8403y = obj;
        this.f8404z = th4;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(AbstractC22671h0.f89337a.getOrCreateKotlinClass(getClass()).getSimpleName());
        sb4.append("(message=");
        sb4.append(getMessage());
        sb4.append(",attempts=");
        sb4.append(this.f8402x);
        Throwable th3 = this.f8404z;
        if (th3 != null) {
            sb4.append(",lastException=");
            sb4.append(th3);
        } else {
            Object obj = this.f8403y;
            if (obj != null) {
                sb4.append(",lastResponse=");
                sb4.append(obj);
            }
        }
        sb4.append(")");
        return sb4.toString();
    }
}
