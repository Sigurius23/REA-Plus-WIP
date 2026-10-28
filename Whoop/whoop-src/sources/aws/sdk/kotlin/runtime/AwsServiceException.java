package aws.sdk.kotlin.runtime;

import aws.smithy.kotlin.runtime.ServiceException;
import p501te.C33738c;
import p501te.C33740e;
import p519uc.C34757a;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Laws/sdk/kotlin/runtime/AwsServiceException;", "Laws/smithy/kotlin/runtime/ServiceException;", "<init>", "()V", "aws-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public class AwsServiceException extends ServiceException {

    /* JADX INFO: renamed from: y */
    public final C34757a f8368y;

    public AwsServiceException() {
        this.f8368y = new C34757a();
    }

    @Override // aws.smithy.kotlin.runtime.ServiceException, aws.smithy.kotlin.runtime.SdkBaseException
    /* JADX INFO: renamed from: a */
    public final C33738c getF8399w() {
        return this.f8368y;
    }

    @Override // aws.smithy.kotlin.runtime.ServiceException
    /* JADX INFO: renamed from: b */
    public final C33740e getF8399w() {
        return this.f8368y;
    }

    public AwsServiceException(String str) {
        super(str);
        this.f8368y = new C34757a();
    }

    public AwsServiceException(Exception exc, String str) {
        super(exc, str);
        this.f8368y = new C34757a();
    }
}
