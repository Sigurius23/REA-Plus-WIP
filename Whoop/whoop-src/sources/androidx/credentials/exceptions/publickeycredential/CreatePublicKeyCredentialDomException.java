package androidx.credentials.exceptions.publickeycredential;

import p334n5.C26289a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m65681d2 = {"Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException;", "Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialException;", "vd/e", "credentials_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
public final class CreatePublicKeyCredentialDomException extends CreatePublicKeyCredentialException {

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ int f5308x = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public CreatePublicKeyCredentialDomException(C26289a c26289a, String str) {
        String type = "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/".concat(c26289a.f104509a);
        AbstractC22676k.m65750j(type, "type");
        super(type, str);
        if (type.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }
}
