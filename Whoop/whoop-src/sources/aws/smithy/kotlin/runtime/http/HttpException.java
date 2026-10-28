package aws.smithy.kotlin.runtime.http;

import aws.smithy.kotlin.runtime.SdkBaseException;
import java.io.IOException;
import p326mf.AbstractC25497q;
import p326mf.EnumC25496p;
import p501te.C33738c;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Laws/smithy/kotlin/runtime/http/HttpException;", "Laws/smithy/kotlin/runtime/SdkBaseException;", "http"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class HttpException extends SdkBaseException {

    /* JADX INFO: renamed from: x */
    public final EnumC25496p f8401x;

    public HttpException(IOException iOException, EnumC25496p enumC25496p) {
        super(iOException);
        this.f8401x = enumC25496p;
        this.f8399w.f141122a.mo33083c(C33738c.f141120c, true);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC25496p getF8401x() {
        return this.f8401x;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String string = super.toString();
        int[] iArr = AbstractC25497q.f99839a;
        EnumC25496p enumC25496p = this.f8401x;
        if (iArr[enumC25496p.ordinal()] == 3) {
            return string;
        }
        return string + "; HttpErrorCode(" + enumC25496p + ')';
    }
}
