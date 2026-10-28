package com.whoop.archv2.feature.domain;

import com.whoop.network.request.GetApiRequest;
import com.whoop.network.request.HttpTimeoutConfig;
import i63.C18181t;
import java.util.Map;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import sr2.AbstractC32943y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/DeeplinkResolveRequest;", "Lcom/whoop/network/request/GetApiRequest;", "name", "", "parameters", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getParameters", "()Ljava/util/Map;", "path", "getPath", "()Ljava/lang/String;", "tag", "getTag", "httpTimeoutConfig", "Lcom/whoop/network/request/HttpTimeoutConfig;", "getHttpTimeoutConfig", "()Lcom/whoop/network/request/HttpTimeoutConfig;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final class DeeplinkResolveRequest implements GetApiRequest {
    private final HttpTimeoutConfig httpTimeoutConfig;
    private final Map<String, String> parameters;
    private final String path;
    private final String tag;

    public DeeplinkResolveRequest(String name, Map<String, String> parameters) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(parameters, "parameters");
        this.parameters = parameters;
        this.path = "navigation-service/v1/deeplink/bff/".concat(name);
        this.tag = "DeeplinkResolveRequest";
        this.httpTimeoutConfig = new HttpTimeoutConfig(0L, 0L, 800L, 3, (DefaultConstructorMarker) null);
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public /* bridge */ boolean getHasBody() {
        return super.getHasBody();
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public /* bridge */ Map<String, String> getHeaders() {
        return super.getHeaders();
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public HttpTimeoutConfig getHttpTimeoutConfig() {
        return this.httpTimeoutConfig;
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public /* bridge */ C18181t getMethod() {
        return super.getMethod();
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public Map<String, String> getParameters() {
        return this.parameters;
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public String getPath() {
        return this.path;
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public String getTag() {
        return this.tag;
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public /* bridge */ String url(AbstractC32943y abstractC32943y) {
        return super.url(abstractC32943y);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Void, l83.a0] */
    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public /* bridge */ C23454a0 getBody() {
        return super.getBody();
    }
}
