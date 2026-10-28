package aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model;

import c13.AbstractC3855a;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import p000.AbstractC30802r;
import p255jk.C21745c;
import p501te.C33740e;
import p501te.EnumC33741f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m65681d2 = {"Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/AuthorizationPendingException;", "Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/SsoOidcException;", "jk/c", "aws-config"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AuthorizationPendingException extends SsoOidcException {

    /* JADX INFO: renamed from: E */
    public final String f8376E;

    /* JADX INFO: renamed from: z */
    public final String f8377z;

    public AuthorizationPendingException(C21745c c21745c) {
        this.f8377z = c21745c.f83655a;
        this.f8376E = c21745c.f83656b;
        this.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuthorizationPendingException.class != obj.getClass()) {
            return false;
        }
        AuthorizationPendingException authorizationPendingException = (AuthorizationPendingException) obj;
        return AbstractC22676k.m65745e(this.f8377z, authorizationPendingException.f8377z) && AbstractC22676k.m65745e(this.f8376E, authorizationPendingException.f8376E);
    }

    public final int hashCode() {
        String str = this.f8377z;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f8376E;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb4 = new StringBuilder("AuthorizationPendingException(");
        return AbstractC3855a.m11828l(AbstractC30802r.m94768q(new StringBuilder("error="), this.f8377z, DateTimeRange.lowerUpperDelimiter, sb4, "errorDescription="), this.f8376E, sb4, ")");
    }
}
