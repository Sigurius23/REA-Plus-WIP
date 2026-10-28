package com.whoop.feedbacksurvey.domain;

import com.whoop.feedbacksurvey.domain.models.CancelSubscriptionRequestBody;
import com.whoop.network.request.HttpTimeoutConfig;
import com.whoop.network.request.PostApiRequest;
import i63.C18181t;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import sr2.AbstractC32943y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/feedbacksurvey/domain/CancelSubscriptionRequest;", "Lcom/whoop/network/request/PostApiRequest;", "Lcom/whoop/feedbacksurvey/domain/models/CancelSubscriptionRequestBody;", "body", "<init>", "(Lcom/whoop/feedbacksurvey/domain/models/CancelSubscriptionRequestBody;)V", "getBody", "()Lcom/whoop/feedbacksurvey/domain/models/CancelSubscriptionRequestBody;", "path", "", "getPath", "()Ljava/lang/String;", "feedback-survey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class CancelSubscriptionRequest implements PostApiRequest<CancelSubscriptionRequestBody> {
    public static final int $stable = 0;
    private final CancelSubscriptionRequestBody body;
    private final String path;

    public CancelSubscriptionRequest(CancelSubscriptionRequestBody body) {
        AbstractC22676k.m65750j(body, "body");
        this.body = body;
        this.path = "growth-content-service/v1/advanced-labs/cancel-subscription";
    }

    @Override // com.whoop.network.request.PostApiRequest, z02.InterfaceC39944a
    public CancelSubscriptionRequestBody getBody() {
        return this.body;
    }

    @Override // com.whoop.network.request.PostApiRequest, z02.InterfaceC39944a
    public /* bridge */ boolean getHasBody() {
        return super.getHasBody();
    }

    @Override // com.whoop.network.request.PostApiRequest, z02.InterfaceC39944a
    public /* bridge */ Map<String, String> getHeaders() {
        return super.getHeaders();
    }

    @Override // com.whoop.network.request.PostApiRequest, z02.InterfaceC39944a
    public /* bridge */ HttpTimeoutConfig getHttpTimeoutConfig() {
        return super.getHttpTimeoutConfig();
    }

    @Override // com.whoop.network.request.PostApiRequest, z02.InterfaceC39944a
    public /* bridge */ C18181t getMethod() {
        return super.getMethod();
    }

    @Override // com.whoop.network.request.PostApiRequest, z02.InterfaceC39944a
    public /* bridge */ Map<String, String> getParameters() {
        return super.getParameters();
    }

    @Override // com.whoop.network.request.PostApiRequest, z02.InterfaceC39944a
    public String getPath() {
        return this.path;
    }

    @Override // com.whoop.network.request.PostApiRequest, z02.InterfaceC39944a
    public /* bridge */ String getTag() {
        return super.getTag();
    }

    @Override // com.whoop.network.request.PostApiRequest, z02.InterfaceC39944a
    public /* bridge */ String url(AbstractC32943y abstractC32943y) {
        return super.url(abstractC32943y);
    }
}
