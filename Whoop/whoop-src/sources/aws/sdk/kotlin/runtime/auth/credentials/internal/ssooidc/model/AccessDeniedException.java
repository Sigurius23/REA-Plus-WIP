package aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model;

import com.whoop.data.remote.domain.dto.DateTimeRange;
import gm.C15990r;
import p000.AbstractC30802r;
import p365od.AbstractC27824c;
import p501te.C33740e;
import p501te.EnumC33741f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m65681d2 = {"Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/AccessDeniedException;", "Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/SsoOidcException;", "gm/r", "aws-config"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AccessDeniedException extends SsoOidcException {

    /* JADX INFO: renamed from: E */
    public final String f8373E;

    /* JADX INFO: renamed from: F */
    public final AbstractC27824c f8374F;

    /* JADX INFO: renamed from: z */
    public final String f8375z;

    public AccessDeniedException(C15990r c15990r) {
        this.f8375z = (String) c15990r.f60512x;
        this.f8373E = (String) c15990r.f60513y;
        this.f8374F = (AbstractC27824c) c15990r.f60514z;
        this.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AccessDeniedException.class != obj.getClass()) {
            return false;
        }
        AccessDeniedException accessDeniedException = (AccessDeniedException) obj;
        return AbstractC22676k.m65745e(this.f8375z, accessDeniedException.f8375z) && AbstractC22676k.m65745e(this.f8373E, accessDeniedException.f8373E) && AbstractC22676k.m65745e(this.f8374F, accessDeniedException.f8374F);
    }

    public final int hashCode() {
        String str = this.f8375z;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f8373E;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        AbstractC27824c abstractC27824c = this.f8374F;
        return iHashCode2 + (abstractC27824c != null ? abstractC27824c.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb4 = new StringBuilder("AccessDeniedException(");
        StringBuilder sbM94768q = AbstractC30802r.m94768q(AbstractC30802r.m94768q(new StringBuilder("error="), this.f8375z, DateTimeRange.lowerUpperDelimiter, sb4, "errorDescription="), this.f8373E, DateTimeRange.lowerUpperDelimiter, sb4, "reason=");
        sbM94768q.append(this.f8374F);
        sb4.append(sbM94768q.toString());
        sb4.append(")");
        return sb4.toString();
    }
}
