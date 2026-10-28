package com.whoop.impacts.api;

import com.whoop.network.request.GetApiRequest;
import com.whoop.network.request.HttpTimeoutConfig;
import i63.C18181t;
import java.util.Map;
import l83.C23454a0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import sr2.AbstractC32943y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/impacts/api/BehaviorDetailsGetRequest;", "Lcom/whoop/network/request/GetApiRequest;", "impactId", "", "<init>", "(Ljava/lang/String;)V", "getImpactId", "()Ljava/lang/String;", "path", "getPath", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class BehaviorDetailsGetRequest implements GetApiRequest {
    public static final int $stable = 0;
    private final String impactId;
    private final String path;

    public BehaviorDetailsGetRequest(String impactId) {
        AbstractC22676k.m65750j(impactId, "impactId");
        this.impactId = impactId;
        this.path = AbstractC11266d.m30461o("behavior-impact-service/v2/impact/details/", impactId);
    }

    public static /* synthetic */ BehaviorDetailsGetRequest copy$default(BehaviorDetailsGetRequest behaviorDetailsGetRequest, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = behaviorDetailsGetRequest.impactId;
        }
        return behaviorDetailsGetRequest.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImpactId() {
        return this.impactId;
    }

    public final BehaviorDetailsGetRequest copy(String impactId) {
        AbstractC22676k.m65750j(impactId, "impactId");
        return new BehaviorDetailsGetRequest(impactId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BehaviorDetailsGetRequest) && AbstractC22676k.m65745e(this.impactId, ((BehaviorDetailsGetRequest) other).impactId);
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

    public final String getImpactId() {
        return this.impactId;
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
    public /* bridge */ String getTag() {
        return super.getTag();
    }

    public int hashCode() {
        return this.impactId.hashCode();
    }

    public String toString() {
        return AbstractC11895b.m31996o("BehaviorDetailsGetRequest(impactId=", this.impactId, ")");
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
