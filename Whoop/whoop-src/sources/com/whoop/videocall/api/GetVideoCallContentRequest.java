package com.whoop.videocall.api;

import com.whoop.network.request.GetApiRequest;
import com.whoop.network.request.HttpTimeoutConfig;
import i63.C18181t;
import java.util.Map;
import l83.C23454a0;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import sr2.AbstractC32943y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/videocall/api/GetVideoCallContentRequest;", "Lcom/whoop/network/request/GetApiRequest;", "callId", "", "<init>", "(Ljava/lang/String;)V", "getCallId", "()Ljava/lang/String;", "path", "getPath", "parameters", "", "getParameters", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class GetVideoCallContentRequest implements GetApiRequest {
    public static final int $stable = 8;
    private final String callId;
    private final Map<String, String> parameters;
    private final String path;

    public GetVideoCallContentRequest(String callId) {
        AbstractC22676k.m65750j(callId, "callId");
        this.callId = callId;
        this.path = "clinician-in-the-loop-service/v1/video-call/content";
        this.parameters = AbstractC31061c.m95645u("callId", callId);
    }

    public static /* synthetic */ GetVideoCallContentRequest copy$default(GetVideoCallContentRequest getVideoCallContentRequest, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = getVideoCallContentRequest.callId;
        }
        return getVideoCallContentRequest.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    public final GetVideoCallContentRequest copy(String callId) {
        AbstractC22676k.m65750j(callId, "callId");
        return new GetVideoCallContentRequest(callId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetVideoCallContentRequest) && AbstractC22676k.m65745e(this.callId, ((GetVideoCallContentRequest) other).callId);
    }

    public final String getCallId() {
        return this.callId;
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
        return this.callId.hashCode();
    }

    public String toString() {
        return AbstractC11895b.m31996o("GetVideoCallContentRequest(callId=", this.callId, ")");
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
