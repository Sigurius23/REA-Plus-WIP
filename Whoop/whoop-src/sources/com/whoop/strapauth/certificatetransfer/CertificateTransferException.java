package com.whoop.strapauth.certificatetransfer;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import sh2.AbstractC32512c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/strapauth/certificatetransfer/CertificateTransferException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lsh2/c;", "result", "<init>", "(Lsh2/c;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lsh2/c;", "a", "()Lsh2/c;", "strap-auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class CertificateTransferException extends Exception {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final AbstractC32512c result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CertificateTransferException(AbstractC32512c result) {
        super("Certificate transfer did not succeed: " + result);
        AbstractC22676k.m65750j(result, "result");
        this.result = result;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC32512c getResult() {
        return this.result;
    }
}
