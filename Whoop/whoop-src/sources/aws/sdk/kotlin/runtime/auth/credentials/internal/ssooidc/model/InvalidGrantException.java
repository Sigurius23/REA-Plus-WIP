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
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m65681d2 = {"Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/InvalidGrantException;", "Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/SsoOidcException;", "jk/c", "aws-config"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class InvalidGrantException extends SsoOidcException {

    /* JADX INFO: renamed from: E */
    public final String f8384E;

    /* JADX INFO: renamed from: z */
    public final String f8385z;

    public InvalidGrantException(C21745c c21745c) {
        this.f8385z = c21745c.f83655a;
        this.f8384E = c21745c.f83656b;
        this.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InvalidGrantException.class != obj.getClass()) {
            return false;
        }
        InvalidGrantException invalidGrantException = (InvalidGrantException) obj;
        return AbstractC22676k.m65745e(this.f8385z, invalidGrantException.f8385z) && AbstractC22676k.m65745e(this.f8384E, invalidGrantException.f8384E);
    }

    public final int hashCode() {
        String str = this.f8385z;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f8384E;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb4 = new StringBuilder("InvalidGrantException(");
        return AbstractC3855a.m11828l(AbstractC30802r.m94768q(new StringBuilder("error="), this.f8385z, DateTimeRange.lowerUpperDelimiter, sb4, "errorDescription="), this.f8384E, sb4, ")");
    }
}
