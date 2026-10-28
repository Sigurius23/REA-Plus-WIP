package aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model;

import com.whoop.data.remote.domain.dto.DateTimeRange;
import gm.C15990r;
import p000.AbstractC30802r;
import p365od.AbstractC27833l;
import p501te.C33740e;
import p501te.EnumC33741f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m65681d2 = {"Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/InvalidRequestException;", "Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/SsoOidcException;", "gm/r", "aws-config"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class InvalidRequestException extends SsoOidcException {

    /* JADX INFO: renamed from: E */
    public final String f8386E;

    /* JADX INFO: renamed from: F */
    public final AbstractC27833l f8387F;

    /* JADX INFO: renamed from: z */
    public final String f8388z;

    public InvalidRequestException(C15990r c15990r) {
        this.f8388z = (String) c15990r.f60512x;
        this.f8386E = (String) c15990r.f60513y;
        this.f8387F = (AbstractC27833l) c15990r.f60514z;
        this.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InvalidRequestException.class != obj.getClass()) {
            return false;
        }
        InvalidRequestException invalidRequestException = (InvalidRequestException) obj;
        return AbstractC22676k.m65745e(this.f8388z, invalidRequestException.f8388z) && AbstractC22676k.m65745e(this.f8386E, invalidRequestException.f8386E) && AbstractC22676k.m65745e(this.f8387F, invalidRequestException.f8387F);
    }

    public final int hashCode() {
        String str = this.f8388z;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f8386E;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        AbstractC27833l abstractC27833l = this.f8387F;
        return iHashCode2 + (abstractC27833l != null ? abstractC27833l.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb4 = new StringBuilder("InvalidRequestException(");
        StringBuilder sbM94768q = AbstractC30802r.m94768q(AbstractC30802r.m94768q(new StringBuilder("error="), this.f8388z, DateTimeRange.lowerUpperDelimiter, sb4, "errorDescription="), this.f8386E, DateTimeRange.lowerUpperDelimiter, sb4, "reason=");
        sbM94768q.append(this.f8387F);
        sb4.append(sbM94768q.toString());
        sb4.append(")");
        return sb4.toString();
    }
}
