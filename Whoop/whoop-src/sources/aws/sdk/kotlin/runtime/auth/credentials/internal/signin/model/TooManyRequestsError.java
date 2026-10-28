package aws.sdk.kotlin.runtime.auth.credentials.internal.signin.model;

import cd.AbstractC4434n;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import io.sentry.internal.debugmeta.C20378c;
import p501te.C33740e;
import p501te.EnumC33741f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m65681d2 = {"Laws/sdk/kotlin/runtime/auth/credentials/internal/signin/model/TooManyRequestsError;", "Laws/sdk/kotlin/runtime/auth/credentials/internal/signin/model/SigninException;", "io/sentry/internal/debugmeta/c", "aws-config"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class TooManyRequestsError extends SigninException {

    /* JADX INFO: renamed from: z */
    public final AbstractC4434n f8371z;

    public TooManyRequestsError(C20378c c20378c) {
        super((String) c20378c.f76423y);
        AbstractC4434n abstractC4434n = (AbstractC4434n) c20378c.f76422x;
        if (abstractC4434n == null) {
            throw new IllegalArgumentException("A non-null value must be provided for error");
        }
        this.f8371z = abstractC4434n;
        this.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TooManyRequestsError.class != obj.getClass()) {
            return false;
        }
        TooManyRequestsError tooManyRequestsError = (TooManyRequestsError) obj;
        return AbstractC22676k.m65745e(this.f8371z, tooManyRequestsError.f8371z) && AbstractC22676k.m65745e(getMessage(), tooManyRequestsError.getMessage());
    }

    public final int hashCode() {
        return getMessage().hashCode() + (this.f8371z.hashCode() * 31);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb4 = new StringBuilder("TooManyRequestsError(");
        sb4.append("error=" + this.f8371z + DateTimeRange.lowerUpperDelimiter);
        StringBuilder sb5 = new StringBuilder("message=");
        sb5.append(getMessage());
        sb4.append(sb5.toString());
        sb4.append(")");
        return sb4.toString();
    }
}
