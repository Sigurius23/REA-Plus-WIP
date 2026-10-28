package com.whoop.advancedlabsjoin.feature.join.domain;

import com.whoop.network.request.GetApiRequest;
import com.whoop.network.request.HttpTimeoutConfig;
import i63.C18181t;
import java.util.Map;
import l83.C23454a0;
import n83.C26463f;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import sr2.AbstractC32943y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;", "Lcom/whoop/network/request/GetApiRequest;", "testCount", "", "initiallySelectedSegmentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTestCount", "()Ljava/lang/String;", "getInitiallySelectedSegmentId", "path", "getPath", "parameters", "", "getParameters", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class GetAdvancedLabsJoinRequest implements GetApiRequest {
    public static final int $stable = 8;
    private final String initiallySelectedSegmentId;
    private final Map<String, String> parameters;
    private final String path;
    private final String testCount;

    public GetAdvancedLabsJoinRequest(String testCount, String initiallySelectedSegmentId) {
        AbstractC22676k.m65750j(testCount, "testCount");
        AbstractC22676k.m65750j(initiallySelectedSegmentId, "initiallySelectedSegmentId");
        this.testCount = testCount;
        this.initiallySelectedSegmentId = initiallySelectedSegmentId;
        this.path = "growth-content-service/v1/advanced-labs/join";
        C26463f c26463f = new C26463f();
        if (testCount.length() > 0) {
            c26463f.put("testCount", testCount);
        }
        if (initiallySelectedSegmentId.length() > 0) {
            c26463f.put("initiallySelectedSegmentId", initiallySelectedSegmentId);
        }
        this.parameters = c26463f.m78380b();
    }

    public static /* synthetic */ GetAdvancedLabsJoinRequest copy$default(GetAdvancedLabsJoinRequest getAdvancedLabsJoinRequest, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = getAdvancedLabsJoinRequest.testCount;
        }
        if ((i13 & 2) != 0) {
            str2 = getAdvancedLabsJoinRequest.initiallySelectedSegmentId;
        }
        return getAdvancedLabsJoinRequest.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTestCount() {
        return this.testCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInitiallySelectedSegmentId() {
        return this.initiallySelectedSegmentId;
    }

    public final GetAdvancedLabsJoinRequest copy(String testCount, String initiallySelectedSegmentId) {
        AbstractC22676k.m65750j(testCount, "testCount");
        AbstractC22676k.m65750j(initiallySelectedSegmentId, "initiallySelectedSegmentId");
        return new GetAdvancedLabsJoinRequest(testCount, initiallySelectedSegmentId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetAdvancedLabsJoinRequest)) {
            return false;
        }
        GetAdvancedLabsJoinRequest getAdvancedLabsJoinRequest = (GetAdvancedLabsJoinRequest) other;
        return AbstractC22676k.m65745e(this.testCount, getAdvancedLabsJoinRequest.testCount) && AbstractC22676k.m65745e(this.initiallySelectedSegmentId, getAdvancedLabsJoinRequest.initiallySelectedSegmentId);
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

    public final String getInitiallySelectedSegmentId() {
        return this.initiallySelectedSegmentId;
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

    public final String getTestCount() {
        return this.testCount;
    }

    public int hashCode() {
        return this.initiallySelectedSegmentId.hashCode() + (this.testCount.hashCode() * 31);
    }

    public String toString() {
        return AbstractC2875y.m8300m("GetAdvancedLabsJoinRequest(testCount=", this.testCount, ", initiallySelectedSegmentId=", this.initiallySelectedSegmentId, ")");
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

    public /* synthetic */ GetAdvancedLabsJoinRequest(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? "" : str2);
    }
}
