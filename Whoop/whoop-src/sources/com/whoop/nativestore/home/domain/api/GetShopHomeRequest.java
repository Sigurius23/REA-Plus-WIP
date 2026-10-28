package com.whoop.nativestore.home.domain.api;

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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÂ\u0003J!\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/nativestore/home/domain/api/GetShopHomeRequest;", "Lcom/whoop/network/request/GetApiRequest;", "preferredCountry", "", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "path", "getPath", "()Ljava/lang/String;", "parameters", "", "getParameters", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class GetShopHomeRequest implements GetApiRequest {
    public static final int $stable = 8;
    private final Map<String, String> parameters;
    private final String path;
    private final String preferredCountry;
    private final String source;

    /* JADX WARN: Multi-variable type inference failed */
    public GetShopHomeRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getPreferredCountry() {
        return this.preferredCountry;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final String getSource() {
        return this.source;
    }

    public static /* synthetic */ GetShopHomeRequest copy$default(GetShopHomeRequest getShopHomeRequest, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = getShopHomeRequest.preferredCountry;
        }
        if ((i13 & 2) != 0) {
            str2 = getShopHomeRequest.source;
        }
        return getShopHomeRequest.copy(str, str2);
    }

    public final GetShopHomeRequest copy(String preferredCountry, String source) {
        return new GetShopHomeRequest(preferredCountry, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetShopHomeRequest)) {
            return false;
        }
        GetShopHomeRequest getShopHomeRequest = (GetShopHomeRequest) other;
        return AbstractC22676k.m65745e(this.preferredCountry, getShopHomeRequest.preferredCountry) && AbstractC22676k.m65745e(this.source, getShopHomeRequest.source);
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
        String str = this.preferredCountry;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.source;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return AbstractC2875y.m8300m("GetShopHomeRequest(preferredCountry=", this.preferredCountry, ", source=", this.source, ")");
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public /* bridge */ String url(AbstractC32943y abstractC32943y) {
        return super.url(abstractC32943y);
    }

    public GetShopHomeRequest(String str, String str2) {
        this.preferredCountry = str;
        this.source = str2;
        this.path = "commerce-service/v1/mobile/shop/home";
        C26463f c26463f = new C26463f();
        if (str != null) {
        }
        if (str2 != null) {
            c26463f.put("source", str2);
        }
        this.parameters = c26463f.m78380b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Void, l83.a0] */
    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public /* bridge */ C23454a0 getBody() {
        return super.getBody();
    }

    public /* synthetic */ GetShopHomeRequest(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2);
    }
}
