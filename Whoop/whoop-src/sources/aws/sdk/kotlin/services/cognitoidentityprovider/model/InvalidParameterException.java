package aws.sdk.kotlin.services.cognitoidentityprovider.model;

import c13.AbstractC3855a;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import io.seon.androidsdk.service.C20653c0;
import p501te.C33740e;
import p501te.EnumC33741f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m65681d2 = {"Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidParameterException;", "Laws/sdk/kotlin/services/cognitoidentityprovider/model/CognitoIdentityProviderException;", "io/seon/androidsdk/service/c0", "cognitoidentityprovider"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class InvalidParameterException extends CognitoIdentityProviderException {

    /* JADX INFO: renamed from: z */
    public final String f8398z;

    public InvalidParameterException(C20653c0 c20653c0) {
        super(c20653c0.f77248a);
        this.f8398z = c20653c0.f77249b;
        this.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InvalidParameterException.class != obj.getClass()) {
            return false;
        }
        InvalidParameterException invalidParameterException = (InvalidParameterException) obj;
        return AbstractC22676k.m65745e(getMessage(), invalidParameterException.getMessage()) && AbstractC22676k.m65745e(this.f8398z, invalidParameterException.f8398z);
    }

    public final int hashCode() {
        String message = getMessage();
        int iHashCode = (message != null ? message.hashCode() : 0) * 31;
        String str = this.f8398z;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb4 = new StringBuilder("InvalidParameterException(");
        sb4.append("message=" + getMessage() + DateTimeRange.lowerUpperDelimiter);
        return AbstractC3855a.m11828l(new StringBuilder("reasonCode="), this.f8398z, sb4, ")");
    }
}
