package androidx.credentials.exceptions;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Landroidx/credentials/exceptions/GetCredentialCustomException;", "Landroidx/credentials/exceptions/GetCredentialException;", "credentials_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
public final class GetCredentialCustomException extends GetCredentialException {
    public GetCredentialCustomException(String str, String str2) {
        super(str, str2);
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }
}
