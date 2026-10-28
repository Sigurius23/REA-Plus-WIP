package aws.sdk.kotlin.runtime.auth.credentials;

import aws.sdk.kotlin.runtime.ClientException;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Laws/sdk/kotlin/runtime/auth/credentials/CredentialsNotLoadedException;", "Laws/sdk/kotlin/runtime/ClientException;", "aws-config"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class CredentialsNotLoadedException extends ClientException {
    public CredentialsNotLoadedException(int i13) {
        super("AWS EC2 metadata is explicitly disabled; credentials not loaded", null);
    }
}
