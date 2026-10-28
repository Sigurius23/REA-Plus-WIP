package aws.sdk.kotlin.runtime.config.imds;

import aws.sdk.kotlin.runtime.AwsServiceException;
import p326mf.C25500t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Laws/sdk/kotlin/runtime/config/imds/EC2MetadataError;", "Laws/sdk/kotlin/runtime/AwsServiceException;", "aws-config"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EC2MetadataError extends AwsServiceException {

    /* JADX INFO: renamed from: z */
    public final C25500t f8397z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EC2MetadataError(C25500t status, String message) {
        super(message);
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(message, "message");
        this.f8397z = status;
    }
}
