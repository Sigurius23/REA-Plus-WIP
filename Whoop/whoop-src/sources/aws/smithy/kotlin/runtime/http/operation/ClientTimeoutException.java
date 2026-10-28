package aws.smithy.kotlin.runtime.http.operation;

import aws.smithy.kotlin.runtime.ClientException;
import p501te.C33738c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Laws/smithy/kotlin/runtime/http/operation/ClientTimeoutException;", "Laws/smithy/kotlin/runtime/ClientException;", "http-client"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class ClientTimeoutException extends ClientException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientTimeoutException(String message, Throwable cause, boolean z4) {
        super(message, cause);
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(cause, "cause");
        this.f8399w.f141122a.mo33083c(C33738c.f141120c, Boolean.valueOf(z4));
    }
}
