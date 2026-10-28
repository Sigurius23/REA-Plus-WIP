package com.whoop.archv2.feature.domain;

import com.whoop.network.request.GetApiRequest;
import com.whoop.network.request.HttpTimeoutConfig;
import i63.C18181t;
import java.util.Map;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import sr2.AbstractC32943y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/GetGenericRequest;", "Lcom/whoop/network/request/GetApiRequest;", "requestTagOverride", "", "<init>", "(Ljava/lang/String;)V", "path", "getPath", "()Ljava/lang/String;", "tag", "getTag", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class GetGenericRequest implements GetApiRequest {
    public static final int $stable = 0;
    private final String path;
    private final String tag;

    /* JADX WARN: Multi-variable type inference failed */
    public GetGenericRequest() {
        this(null, 1, 0 == true ? 1 : 0);
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
    public /* bridge */ HttpTimeoutConfig getHttpTimeoutConfig() {
        return super.getHttpTimeoutConfig();
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public /* bridge */ C18181t getMethod() {
        return super.getMethod();
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public /* bridge */ Map<String, String> getParameters() {
        return super.getParameters();
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

    public GetGenericRequest(String str) {
        this.path = "service/v1/Generic";
        this.tag = str == null ? AbstractC22671h0.f89337a.getOrCreateKotlinClass(GetGenericRequest.class).getSimpleName() : str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Void, l83.a0] */
    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public /* bridge */ C23454a0 getBody() {
        return super.getBody();
    }

    public /* synthetic */ GetGenericRequest(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str);
    }
}
