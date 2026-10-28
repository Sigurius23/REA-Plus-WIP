package androidx.credentials.exceptions;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Landroidx/credentials/exceptions/GetCredentialCancellationException;", "Landroidx/credentials/exceptions/GetCredentialException;", "credentials_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
public final class GetCredentialCancellationException extends GetCredentialException {
    public GetCredentialCancellationException() {
        this(null);
    }

    public GetCredentialCancellationException(String str) {
        super("android.credentials.GetCredentialException.TYPE_USER_CANCELED", str);
    }
}
