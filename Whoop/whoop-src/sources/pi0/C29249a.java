package pi0;

import c13.AbstractC3855a;
import com.whoop.navigation.models.ApiRequest;
import java.util.Map;
import jh3.AbstractC21702c;
import m83.C25272z;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: pi0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u0017\u0010\r¨\u0006\u001f"}, m65681d2 = {"Lpi0/a;", "", "Lcom/whoop/navigation/models/ApiRequest;", "apiRequest", "", "", "requestParameters", "", "manualRefresh", "cacheKey", "<init>", "(Lcom/whoop/navigation/models/ApiRequest;Ljava/util/Map;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/models/ApiRequest;", "()Lcom/whoop/navigation/models/ApiRequest;", "b", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "c", "Z", "()Z", "Ljava/lang/String;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29249a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ApiRequest apiRequest;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Map<String, String> requestParameters;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean manualRefresh;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String cacheKey;

    public C29249a(ApiRequest apiRequest, Map<String, String> requestParameters, boolean z4, String str) {
        AbstractC22676k.m65750j(apiRequest, "apiRequest");
        AbstractC22676k.m65750j(requestParameters, "requestParameters");
        this.apiRequest = apiRequest;
        this.requestParameters = requestParameters;
        this.manualRefresh = z4;
        this.cacheKey = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ApiRequest getApiRequest() {
        return this.apiRequest;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCacheKey() {
        return this.cacheKey;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getManualRefresh() {
        return this.manualRefresh;
    }

    /* JADX INFO: renamed from: d */
    public final Map<String, String> m88855d() {
        return this.requestParameters;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29249a)) {
            return false;
        }
        C29249a c29249a = (C29249a) other;
        return AbstractC22676k.m65745e(this.apiRequest, c29249a.apiRequest) && AbstractC22676k.m65745e(this.requestParameters, c29249a.requestParameters) && this.manualRefresh == c29249a.manualRefresh && AbstractC22676k.m65745e(this.cacheKey, c29249a.cacheKey);
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC3855a.m11821e(this.requestParameters, this.apiRequest.hashCode() * 31, 31), 31, this.manualRefresh);
        String str = this.cacheKey;
        return iM8289b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        ApiRequest apiRequest = this.apiRequest;
        Map<String, String> map = this.requestParameters;
        boolean z4 = this.manualRefresh;
        String str = this.cacheKey;
        StringBuilder sb4 = new StringBuilder("GenericScreenFetchRequest(apiRequest=");
        sb4.append(apiRequest);
        sb4.append(", requestParameters=");
        sb4.append(map);
        sb4.append(", manualRefresh=");
        return AbstractC21702c.m61139j(sb4, z4, ", cacheKey=", str, ")");
    }

    public /* synthetic */ C29249a(ApiRequest apiRequest, Map map, boolean z4, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(apiRequest, (i13 & 2) != 0 ? C25272z.f99163w : map, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? null : str);
    }
}
