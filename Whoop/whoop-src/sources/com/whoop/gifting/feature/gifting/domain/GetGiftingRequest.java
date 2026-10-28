package com.whoop.gifting.feature.gifting.domain;

import com.whoop.network.request.GetApiRequest;
import com.whoop.network.request.HttpTimeoutConfig;
import i63.C18181t;
import java.util.Map;
import l83.C23454a0;
import n83.C26463f;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import sr2.AbstractC32943y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m65681d2 = {"Lcom/whoop/gifting/feature/gifting/domain/GetGiftingRequest;", "Lcom/whoop/network/request/GetApiRequest;", "giftType", "", "testCount", "selectedTier", "country", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGiftType", "()Ljava/lang/String;", "getTestCount", "getSelectedTier", "getCountry", "path", "getPath", "parameters", "", "getParameters", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class GetGiftingRequest implements GetApiRequest {
    public static final int $stable = 8;
    private final String country;
    private final String giftType;
    private final Map<String, String> parameters;
    private final String path;
    private final String selectedTier;
    private final String testCount;

    public GetGiftingRequest(String giftType, String testCount, String selectedTier, String country) {
        AbstractC22676k.m65750j(giftType, "giftType");
        AbstractC22676k.m65750j(testCount, "testCount");
        AbstractC22676k.m65750j(selectedTier, "selectedTier");
        AbstractC22676k.m65750j(country, "country");
        this.giftType = giftType;
        this.testCount = testCount;
        this.selectedTier = selectedTier;
        this.country = country;
        this.path = giftType.length() > 0 ? "growth-content-service/v1/gifting/".concat(giftType) : "growth-content-service/v1/gifting";
        C26463f c26463f = new C26463f();
        if (testCount.length() > 0) {
            c26463f.put("test_count", testCount);
        }
        if (selectedTier.length() > 0) {
            c26463f.put("selected_tier", selectedTier);
        }
        if (country.length() > 0) {
            c26463f.put("country", country);
        }
        this.parameters = c26463f.m78380b();
    }

    public static /* synthetic */ GetGiftingRequest copy$default(GetGiftingRequest getGiftingRequest, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = getGiftingRequest.giftType;
        }
        if ((i13 & 2) != 0) {
            str2 = getGiftingRequest.testCount;
        }
        if ((i13 & 4) != 0) {
            str3 = getGiftingRequest.selectedTier;
        }
        if ((i13 & 8) != 0) {
            str4 = getGiftingRequest.country;
        }
        return getGiftingRequest.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGiftType() {
        return this.giftType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTestCount() {
        return this.testCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSelectedTier() {
        return this.selectedTier;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    public final GetGiftingRequest copy(String giftType, String testCount, String selectedTier, String country) {
        AbstractC22676k.m65750j(giftType, "giftType");
        AbstractC22676k.m65750j(testCount, "testCount");
        AbstractC22676k.m65750j(selectedTier, "selectedTier");
        AbstractC22676k.m65750j(country, "country");
        return new GetGiftingRequest(giftType, testCount, selectedTier, country);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetGiftingRequest)) {
            return false;
        }
        GetGiftingRequest getGiftingRequest = (GetGiftingRequest) other;
        return AbstractC22676k.m65745e(this.giftType, getGiftingRequest.giftType) && AbstractC22676k.m65745e(this.testCount, getGiftingRequest.testCount) && AbstractC22676k.m65745e(this.selectedTier, getGiftingRequest.selectedTier) && AbstractC22676k.m65745e(this.country, getGiftingRequest.country);
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getGiftType() {
        return this.giftType;
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

    public final String getSelectedTier() {
        return this.selectedTier;
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public /* bridge */ String getTag() {
        return super.getTag();
    }

    public final String getTestCount() {
        return this.testCount;
    }

    public int hashCode() {
        return this.country.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.giftType.hashCode() * 31, 31, this.testCount), 31, this.selectedTier);
    }

    public String toString() {
        String str = this.giftType;
        String str2 = this.testCount;
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("GetGiftingRequest(giftType=", str, ", testCount=", str2, ", selectedTier="), this.selectedTier, ", country=", this.country, ")");
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
