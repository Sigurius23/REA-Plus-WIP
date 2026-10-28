package aws.sdk.kotlin.runtime.auth.credentials;

import aws.sdk.kotlin.runtime.ClientException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Laws/sdk/kotlin/runtime/auth/credentials/InvalidJsonCredentialsException;", "Laws/sdk/kotlin/runtime/ClientException;", "aws-config"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class InvalidJsonCredentialsException extends ClientException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidJsonCredentialsException(String message, int i13) {
        super(message, null);
        AbstractC22676k.m65750j(message, "message");
    }
}
