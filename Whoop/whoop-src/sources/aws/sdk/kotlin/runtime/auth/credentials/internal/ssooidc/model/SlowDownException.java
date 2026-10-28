package aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model;

import c13.AbstractC3855a;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import p000.AbstractC30802r;
import p141f9.C14279u;
import p501te.C33740e;
import p501te.EnumC33741f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m65681d2 = {"Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/SlowDownException;", "Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/SsoOidcException;", "f9/u", "aws-config"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SlowDownException extends SsoOidcException {

    /* JADX INFO: renamed from: E */
    public final String f8391E;

    /* JADX INFO: renamed from: z */
    public final String f8392z;

    public SlowDownException(C14279u c14279u) {
        this.f8392z = c14279u.f52138b;
        this.f8391E = c14279u.f52139c;
        this.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SlowDownException.class != obj.getClass()) {
            return false;
        }
        SlowDownException slowDownException = (SlowDownException) obj;
        return AbstractC22676k.m65745e(this.f8392z, slowDownException.f8392z) && AbstractC22676k.m65745e(this.f8391E, slowDownException.f8391E);
    }

    public final int hashCode() {
        String str = this.f8392z;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f8391E;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb4 = new StringBuilder("SlowDownException(");
        return AbstractC3855a.m11828l(AbstractC30802r.m94768q(new StringBuilder("error="), this.f8392z, DateTimeRange.lowerUpperDelimiter, sb4, "errorDescription="), this.f8391E, sb4, ")");
    }
}
