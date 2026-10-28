package com.whoop.archv2.feature.domain;

import a12.C0141a;
import com.whoop.navigation.models.ApiRequest;
import com.whoop.network.request.HttpTimeoutConfig;
import com.whoop.network.request.PostApiRequest;
import i63.C18181t;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import sr2.AbstractC32943y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u000b\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0005\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"com/whoop/archv2/feature/domain/GenericApiRequestMapperKt$toPostApiRequest$1", "Lcom/whoop/network/request/PostApiRequest;", "Lkotlinx/serialization/json/JsonElement;", "", "path", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "", "parameters", "Ljava/util/Map;", "getParameters", "()Ljava/util/Map;", "body", "Lkotlinx/serialization/json/JsonElement;", "getBody", "()Lkotlinx/serialization/json/JsonElement;", "tag", "getTag", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class GenericApiRequestMapperKt$toPostApiRequest$1 implements PostApiRequest<JsonElement> {
    private final JsonElement body;
    private final Map<String, String> parameters;
    private final String path;
    private final String tag;

    public GenericApiRequestMapperKt$toPostApiRequest$1(C0141a c0141a, ApiRequest apiRequest, String str) {
        this.path = c0141a.getBasePath();
        this.parameters = c0141a.m354b();
        this.body = apiRequest.getBody();
        this.tag = str == null ? AbstractC22671h0.f89337a.getOrCreateKotlinClass(ApiRequest.class).getSimpleName() : str;
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
    public Map<String, String> getParameters() {
        return this.parameters;
    }

    @Override // com.whoop.network.request.PostApiRequest, z02.InterfaceC39944a
    public String getPath() {
        return this.path;
    }

    @Override // com.whoop.network.request.PostApiRequest, z02.InterfaceC39944a
    public String getTag() {
        return this.tag;
    }

    @Override // com.whoop.network.request.PostApiRequest, z02.InterfaceC39944a
    public /* bridge */ String url(AbstractC32943y abstractC32943y) {
        return super.url(abstractC32943y);
    }

    @Override // com.whoop.network.request.PostApiRequest, z02.InterfaceC39944a
    public JsonElement getBody() {
        return this.body;
    }
}
