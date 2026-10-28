package aws.smithy.kotlin.runtime.auth.awscredentials;

import aws.smithy.kotlin.runtime.ClientException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;", "Laws/smithy/kotlin/runtime/ClientException;", "aws-credentials"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class CredentialsProviderException extends ClientException {
    public /* synthetic */ CredentialsProviderException(String str) {
        this(null, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialsProviderException(Exception exc, String message) {
        super(message, exc);
        AbstractC22676k.m65750j(message, "message");
    }
}
