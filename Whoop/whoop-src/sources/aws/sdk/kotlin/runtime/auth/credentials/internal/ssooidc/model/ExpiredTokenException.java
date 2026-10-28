package aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model;

import c13.AbstractC3855a;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import io.seon.androidsdk.service.C20653c0;
import p000.AbstractC30802r;
import p501te.C33740e;
import p501te.EnumC33741f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m65681d2 = {"Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/ExpiredTokenException;", "Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/SsoOidcException;", "io/seon/androidsdk/service/c0", "aws-config"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ExpiredTokenException extends SsoOidcException {

    /* JADX INFO: renamed from: E */
    public final String f8378E;

    /* JADX INFO: renamed from: z */
    public final String f8379z;

    public ExpiredTokenException(C20653c0 c20653c0) {
        this.f8379z = c20653c0.f77248a;
        this.f8378E = c20653c0.f77249b;
        this.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ExpiredTokenException.class != obj.getClass()) {
            return false;
        }
        ExpiredTokenException expiredTokenException = (ExpiredTokenException) obj;
        return AbstractC22676k.m65745e(this.f8379z, expiredTokenException.f8379z) && AbstractC22676k.m65745e(this.f8378E, expiredTokenException.f8378E);
    }

    public final int hashCode() {
        String str = this.f8379z;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f8378E;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ExpiredTokenException(");
        return AbstractC3855a.m11828l(AbstractC30802r.m94768q(new StringBuilder("error="), this.f8379z, DateTimeRange.lowerUpperDelimiter, sb4, "errorDescription="), this.f8378E, sb4, ")");
    }
}
