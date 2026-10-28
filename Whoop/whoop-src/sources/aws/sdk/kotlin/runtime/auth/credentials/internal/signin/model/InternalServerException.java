package aws.sdk.kotlin.runtime.auth.credentials.internal.signin.model;

import cd.AbstractC4434n;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import p078d1.C11457j;
import p501te.C33740e;
import p501te.EnumC33741f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m65681d2 = {"Laws/sdk/kotlin/runtime/auth/credentials/internal/signin/model/InternalServerException;", "Laws/sdk/kotlin/runtime/auth/credentials/internal/signin/model/SigninException;", "d1/j", "aws-config"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class InternalServerException extends SigninException {

    /* JADX INFO: renamed from: z */
    public final AbstractC4434n f8370z;

    public InternalServerException(C11457j c11457j) {
        super((String) c11457j.f36754y);
        AbstractC4434n abstractC4434n = (AbstractC4434n) c11457j.f36753x;
        if (abstractC4434n == null) {
            throw new IllegalArgumentException("A non-null value must be provided for error");
        }
        this.f8370z = abstractC4434n;
        this.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141129x);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalServerException.class != obj.getClass()) {
            return false;
        }
        InternalServerException internalServerException = (InternalServerException) obj;
        return AbstractC22676k.m65745e(this.f8370z, internalServerException.f8370z) && AbstractC22676k.m65745e(getMessage(), internalServerException.getMessage());
    }

    public final int hashCode() {
        return getMessage().hashCode() + (this.f8370z.hashCode() * 31);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb4 = new StringBuilder("InternalServerException(");
        sb4.append("error=" + this.f8370z + DateTimeRange.lowerUpperDelimiter);
        StringBuilder sb5 = new StringBuilder("message=");
        sb5.append(getMessage());
        sb4.append(sb5.toString());
        sb4.append(")");
        return sb4.toString();
    }
}
