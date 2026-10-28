package com.whoop.journalhometile.api;

import com.whoop.network.request.GetApiRequest;
import com.whoop.network.request.HttpTimeoutConfig;
import i63.C18181t;
import java.util.Map;
import l83.C23454a0;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import sr2.AbstractC32943y;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/journalhometile/api/JournalHomeTileGetRequest;", "Lcom/whoop/network/request/GetApiRequest;", "basePath", "", "parameters", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getBasePath", "()Ljava/lang/String;", "getParameters", "()Ljava/util/Map;", "path", "getPath", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "journal-home-tile-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class JournalHomeTileGetRequest implements GetApiRequest {
    public static final int $stable = 8;
    private final String basePath;
    private final Map<String, String> parameters;
    private final String path;

    public JournalHomeTileGetRequest(String basePath, Map<String, String> parameters) {
        AbstractC22676k.m65750j(basePath, "basePath");
        AbstractC22676k.m65750j(parameters, "parameters");
        this.basePath = basePath;
        this.parameters = parameters;
        this.path = basePath;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JournalHomeTileGetRequest copy$default(JournalHomeTileGetRequest journalHomeTileGetRequest, String str, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = journalHomeTileGetRequest.basePath;
        }
        if ((i13 & 2) != 0) {
            map = journalHomeTileGetRequest.parameters;
        }
        return journalHomeTileGetRequest.copy(str, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBasePath() {
        return this.basePath;
    }

    public final Map<String, String> component2() {
        return this.parameters;
    }

    public final JournalHomeTileGetRequest copy(String basePath, Map<String, String> parameters) {
        AbstractC22676k.m65750j(basePath, "basePath");
        AbstractC22676k.m65750j(parameters, "parameters");
        return new JournalHomeTileGetRequest(basePath, parameters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JournalHomeTileGetRequest)) {
            return false;
        }
        JournalHomeTileGetRequest journalHomeTileGetRequest = (JournalHomeTileGetRequest) other;
        return AbstractC22676k.m65745e(this.basePath, journalHomeTileGetRequest.basePath) && AbstractC22676k.m65745e(this.parameters, journalHomeTileGetRequest.parameters);
    }

    public final String getBasePath() {
        return this.basePath;
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
    public Map<String, String> getParameters() {
        return this.parameters;
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public String getPath() {
        return this.path;
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public /* bridge */ String getTag() {
        return super.getTag();
    }

    public int hashCode() {
        return this.parameters.hashCode() + (this.basePath.hashCode() * 31);
    }

    public String toString() {
        return AbstractC36095b.m114680h("JournalHomeTileGetRequest(basePath=", this.basePath, ", parameters=", ")", this.parameters);
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
