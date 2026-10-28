package androidx.credentials.exceptions;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m65681d2 = {"Landroidx/credentials/exceptions/GetCredentialException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "credentials_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
public abstract class GetCredentialException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCredentialException(String type, CharSequence charSequence) {
        super(charSequence != null ? charSequence.toString() : null);
        AbstractC22676k.m65750j(type, "type");
    }
}
