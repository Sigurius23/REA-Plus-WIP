package com.whoop.profile.domain.edit;

import com.whoop.network.request.HttpTimeoutConfig;
import com.whoop.network.request.PostApiRequest;
import com.whoop.profile.domain.edit.models.UsernameCheckV2RequestBody;
import i63.C18181t;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import sr2.AbstractC32943y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/CheckUsernameAvailabilityRequest;", "Lcom/whoop/network/request/PostApiRequest;", "Lcom/whoop/profile/domain/edit/models/UsernameCheckV2RequestBody;", "username", "", "<init>", "(Ljava/lang/String;)V", "path", "getPath", "()Ljava/lang/String;", "body", "getBody", "()Lcom/whoop/profile/domain/edit/models/UsernameCheckV2RequestBody;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class CheckUsernameAvailabilityRequest implements PostApiRequest<UsernameCheckV2RequestBody> {
    public static final int $stable = 0;
    private final UsernameCheckV2RequestBody body;
    private final String path;
    private final String username;

    public CheckUsernameAvailabilityRequest(String username) {
        AbstractC22676k.m65750j(username, "username");
        this.username = username;
        this.path = "onboarding-service/v1/users/check/username";
        this.body = new UsernameCheckV2RequestBody(username);
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

    @Override // com.whoop.network.request.PostApiRequest, z02.InterfaceC39944a
    public UsernameCheckV2RequestBody getBody() {
        return this.body;
    }
}
