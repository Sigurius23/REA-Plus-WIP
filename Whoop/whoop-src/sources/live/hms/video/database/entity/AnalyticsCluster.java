package live.hms.video.database.entity;

import com.google.gson.annotations.SerializedName;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, m65681d2 = {"Llive/hms/video/database/entity/AnalyticsCluster;", "", "websocketUrl", "", "<init>", "(Ljava/lang/String;)V", "getWebsocketUrl", "()Ljava/lang/String;", "setWebsocketUrl", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class AnalyticsCluster {

    @SerializedName("websocket_url")
    private String websocketUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public AnalyticsCluster() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AnalyticsCluster copy$default(AnalyticsCluster analyticsCluster, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = analyticsCluster.websocketUrl;
        }
        return analyticsCluster.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWebsocketUrl() {
        return this.websocketUrl;
    }

    public final AnalyticsCluster copy(String websocketUrl) {
        AbstractC22676k.m65750j(websocketUrl, "websocketUrl");
        return new AnalyticsCluster(websocketUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AnalyticsCluster) && AbstractC22676k.m65745e(this.websocketUrl, ((AnalyticsCluster) other).websocketUrl);
    }

    public final String getWebsocketUrl() {
        return this.websocketUrl;
    }

    public int hashCode() {
        return this.websocketUrl.hashCode();
    }

    public final void setWebsocketUrl(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.websocketUrl = str;
    }

    public String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("AnalyticsCluster(websocketUrl="), this.websocketUrl, ')');
    }

    public AnalyticsCluster(String websocketUrl) {
        AbstractC22676k.m65750j(websocketUrl, "websocketUrl");
        this.websocketUrl = websocketUrl;
    }

    public /* synthetic */ AnalyticsCluster(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str);
    }
}
