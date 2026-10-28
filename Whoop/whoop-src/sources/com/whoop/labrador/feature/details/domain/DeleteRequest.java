package com.whoop.labrador.feature.details.domain;

import com.whoop.network.request.DeleteApiRequest;
import com.whoop.network.request.HttpTimeoutConfig;
import i63.C18181t;
import java.util.Map;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import sr2.AbstractC32943y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lcom/whoop/labrador/feature/details/domain/DeleteRequest;", "Lcom/whoop/network/request/DeleteApiRequest;", "timestamp", "", "<init>", "(Ljava/lang/String;)V", "path", "getPath", "()Ljava/lang/String;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DeleteRequest implements DeleteApiRequest {
    public static final int $stable = 0;
    private final String path;

    public DeleteRequest(String timestamp) {
        AbstractC22676k.m65750j(timestamp, "timestamp");
        this.path = "ecg-service/v1/ecg/readings/".concat(timestamp);
    }

    @Override // com.whoop.network.request.DeleteApiRequest, z02.InterfaceC39944a
    public /* bridge */ boolean getHasBody() {
        return super.getHasBody();
    }

    @Override // com.whoop.network.request.DeleteApiRequest, z02.InterfaceC39944a
    public /* bridge */ Map<String, String> getHeaders() {
        return super.getHeaders();
    }

    @Override // com.whoop.network.request.DeleteApiRequest, z02.InterfaceC39944a
    public /* bridge */ HttpTimeoutConfig getHttpTimeoutConfig() {
        return super.getHttpTimeoutConfig();
    }

    @Override // com.whoop.network.request.DeleteApiRequest, z02.InterfaceC39944a
    public /* bridge */ C18181t getMethod() {
        return super.getMethod();
    }

    @Override // com.whoop.network.request.DeleteApiRequest, z02.InterfaceC39944a
    public /* bridge */ Map<String, String> getParameters() {
        return super.getParameters();
    }

    @Override // com.whoop.network.request.DeleteApiRequest, z02.InterfaceC39944a
    public String getPath() {
        return this.path;
    }

    @Override // com.whoop.network.request.DeleteApiRequest, z02.InterfaceC39944a
    public /* bridge */ String getTag() {
        return super.getTag();
    }

    @Override // com.whoop.network.request.DeleteApiRequest, z02.InterfaceC39944a
    public /* bridge */ String url(AbstractC32943y abstractC32943y) {
        return super.url(abstractC32943y);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Void, l83.a0] */
    @Override // com.whoop.network.request.DeleteApiRequest, z02.InterfaceC39944a
    public /* bridge */ C23454a0 getBody() {
        return super.getBody();
    }
}
