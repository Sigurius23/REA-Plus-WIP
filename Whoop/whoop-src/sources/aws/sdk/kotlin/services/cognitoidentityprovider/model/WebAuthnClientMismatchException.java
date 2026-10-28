package aws.sdk.kotlin.services.cognitoidentityprovider.model;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Laws/sdk/kotlin/services/cognitoidentityprovider/model/WebAuthnClientMismatchException;", "Laws/sdk/kotlin/services/cognitoidentityprovider/model/CognitoIdentityProviderException;", "cognitoidentityprovider"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class WebAuthnClientMismatchException extends CognitoIdentityProviderException {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && WebAuthnClientMismatchException.class == obj.getClass() && AbstractC22676k.m65745e(getMessage(), ((WebAuthnClientMismatchException) obj).getMessage());
    }

    public final int hashCode() {
        String message = getMessage();
        if (message != null) {
            return message.hashCode();
        }
        return 0;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb4 = new StringBuilder("WebAuthnClientMismatchException(");
        sb4.append("message=" + getMessage());
        sb4.append(")");
        return sb4.toString();
    }
}
