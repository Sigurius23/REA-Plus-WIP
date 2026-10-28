package live.hms.video.database.entity;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import java.util.HashMap;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012$\b\u0003\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\nj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001`\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J*\u00109\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\nj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001`\tHÆ\u0003¢\u0006\u0002\u0010\"J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u000eHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0092\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052$\b\u0003\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\nj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001`\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020\u000e2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020DHÖ\u0001J\t\u0010E\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR<\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\nj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001`\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001a\"\u0004\b'\u0010\u001cR\u001e\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001a\"\u0004\b)\u0010\u001cR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010*\"\u0004\b+\u0010,R \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R \u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u0006F"}, m65681d2 = {"Llive/hms/video/database/entity/AnalyticsEntityModel;", "", "timestamp", "", "eventId", "", "deviceId", "agent", "payload", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "eventName", "token", "isQa", "", "analyticsPeer", "Llive/hms/video/database/entity/AnalyticsPeer;", "analyticsCluster", "Llive/hms/video/database/entity/AnalyticsCluster;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/database/entity/AnalyticsPeer;Llive/hms/video/database/entity/AnalyticsCluster;)V", "getTimestamp", "()J", "setTimestamp", "(J)V", "getEventId", "()Ljava/lang/String;", "setEventId", "(Ljava/lang/String;)V", "getDeviceId", "setDeviceId", "getAgent", "setAgent", "getPayload", "()Ljava/util/HashMap;", "setPayload", "(Ljava/util/HashMap;)V", "Ljava/util/HashMap;", "getEventName", "setEventName", "getToken", "setToken", "()Z", "setQa", "(Z)V", "getAnalyticsPeer", "()Llive/hms/video/database/entity/AnalyticsPeer;", "setAnalyticsPeer", "(Llive/hms/video/database/entity/AnalyticsPeer;)V", "getAnalyticsCluster", "()Llive/hms/video/database/entity/AnalyticsCluster;", "setAnalyticsCluster", "(Llive/hms/video/database/entity/AnalyticsCluster;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/database/entity/AnalyticsPeer;Llive/hms/video/database/entity/AnalyticsCluster;)Llive/hms/video/database/entity/AnalyticsEntityModel;", "equals", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class AnalyticsEntityModel {

    @SerializedName("agent")
    private String agent;

    @SerializedName("cluster")
    private AnalyticsCluster analyticsCluster;

    @SerializedName("peer")
    private AnalyticsPeer analyticsPeer;

    @SerializedName("device_id")
    private String deviceId;

    @SerializedName(AnalyticsRequestV2.PARAM_EVENT_ID)
    private String eventId;

    @SerializedName(NotificationCompat.CATEGORY_EVENT)
    private String eventName;

    @SerializedName("isQa")
    private boolean isQa;

    @SerializedName("payload")
    private HashMap<String, Object> payload;

    @SerializedName("timestamp")
    private long timestamp;

    @SerializedName("token")
    private String token;

    public AnalyticsEntityModel() {
        this(0L, null, null, null, null, null, null, false, null, null, 1023, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnalyticsEntityModel copy$default(AnalyticsEntityModel analyticsEntityModel, long j7, String str, String str2, String str3, HashMap map, String str4, String str5, boolean z4, AnalyticsPeer analyticsPeer, AnalyticsCluster analyticsCluster, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j7 = analyticsEntityModel.timestamp;
        }
        long j13 = j7;
        if ((i13 & 2) != 0) {
            str = analyticsEntityModel.eventId;
        }
        return analyticsEntityModel.copy(j13, str, (i13 & 4) != 0 ? analyticsEntityModel.deviceId : str2, (i13 & 8) != 0 ? analyticsEntityModel.agent : str3, (i13 & 16) != 0 ? analyticsEntityModel.payload : map, (i13 & 32) != 0 ? analyticsEntityModel.eventName : str4, (i13 & 64) != 0 ? analyticsEntityModel.token : str5, (i13 & 128) != 0 ? analyticsEntityModel.isQa : z4, (i13 & 256) != 0 ? analyticsEntityModel.analyticsPeer : analyticsPeer, (i13 & 512) != 0 ? analyticsEntityModel.analyticsCluster : analyticsCluster);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final AnalyticsCluster getAnalyticsCluster() {
        return this.analyticsCluster;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAgent() {
        return this.agent;
    }

    public final HashMap<String, Object> component5() {
        return this.payload;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsQa() {
        return this.isQa;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final AnalyticsPeer getAnalyticsPeer() {
        return this.analyticsPeer;
    }

    public final AnalyticsEntityModel copy(long timestamp, String eventId, String deviceId, String agent, HashMap<String, Object> payload, String eventName, String token, boolean isQa, AnalyticsPeer analyticsPeer, AnalyticsCluster analyticsCluster) {
        AbstractC22676k.m65750j(eventId, "eventId");
        AbstractC22676k.m65750j(deviceId, "deviceId");
        AbstractC22676k.m65750j(agent, "agent");
        AbstractC22676k.m65750j(payload, "payload");
        AbstractC22676k.m65750j(eventName, "eventName");
        AbstractC22676k.m65750j(token, "token");
        return new AnalyticsEntityModel(timestamp, eventId, deviceId, agent, payload, eventName, token, isQa, analyticsPeer, analyticsCluster);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsEntityModel)) {
            return false;
        }
        AnalyticsEntityModel analyticsEntityModel = (AnalyticsEntityModel) other;
        return this.timestamp == analyticsEntityModel.timestamp && AbstractC22676k.m65745e(this.eventId, analyticsEntityModel.eventId) && AbstractC22676k.m65745e(this.deviceId, analyticsEntityModel.deviceId) && AbstractC22676k.m65745e(this.agent, analyticsEntityModel.agent) && AbstractC22676k.m65745e(this.payload, analyticsEntityModel.payload) && AbstractC22676k.m65745e(this.eventName, analyticsEntityModel.eventName) && AbstractC22676k.m65745e(this.token, analyticsEntityModel.token) && this.isQa == analyticsEntityModel.isQa && AbstractC22676k.m65745e(this.analyticsPeer, analyticsEntityModel.analyticsPeer) && AbstractC22676k.m65745e(this.analyticsCluster, analyticsEntityModel.analyticsCluster);
    }

    public final String getAgent() {
        return this.agent;
    }

    public final AnalyticsCluster getAnalyticsCluster() {
        return this.analyticsCluster;
    }

    public final AnalyticsPeer getAnalyticsPeer() {
        return this.analyticsPeer;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final HashMap<String, Object> getPayload() {
        return this.payload;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d((this.payload.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(Long.hashCode(this.timestamp) * 31, 31, this.eventId), 31, this.deviceId), 31, this.agent)) * 31, 31, this.eventName), 31, this.token), 31, this.isQa);
        AnalyticsPeer analyticsPeer = this.analyticsPeer;
        int iHashCode = (iM8289b + (analyticsPeer == null ? 0 : analyticsPeer.hashCode())) * 31;
        AnalyticsCluster analyticsCluster = this.analyticsCluster;
        return iHashCode + (analyticsCluster != null ? analyticsCluster.hashCode() : 0);
    }

    public final boolean isQa() {
        return this.isQa;
    }

    public final void setAgent(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.agent = str;
    }

    public final void setAnalyticsCluster(AnalyticsCluster analyticsCluster) {
        this.analyticsCluster = analyticsCluster;
    }

    public final void setAnalyticsPeer(AnalyticsPeer analyticsPeer) {
        this.analyticsPeer = analyticsPeer;
    }

    public final void setDeviceId(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.deviceId = str;
    }

    public final void setEventId(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.eventId = str;
    }

    public final void setEventName(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.eventName = str;
    }

    public final void setPayload(HashMap<String, Object> map) {
        AbstractC22676k.m65750j(map, "<set-?>");
        this.payload = map;
    }

    public final void setQa(boolean z4) {
        this.isQa = z4;
    }

    public final void setTimestamp(long j7) {
        this.timestamp = j7;
    }

    public final void setToken(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.token = str;
    }

    public String toString() {
        return "AnalyticsEntityModel(timestamp=" + this.timestamp + ", eventId=" + this.eventId + ", deviceId=" + this.deviceId + ", agent=" + this.agent + ", payload=" + this.payload + ", eventName=" + this.eventName + ", token=" + this.token + ", isQa=" + this.isQa + ", analyticsPeer=" + this.analyticsPeer + ", analyticsCluster=" + this.analyticsCluster + ')';
    }

    public AnalyticsEntityModel(long j7, String eventId, String deviceId, String agent, HashMap<String, Object> payload, String eventName, String token, boolean z4, AnalyticsPeer analyticsPeer, AnalyticsCluster analyticsCluster) {
        AbstractC22676k.m65750j(eventId, "eventId");
        AbstractC22676k.m65750j(deviceId, "deviceId");
        AbstractC22676k.m65750j(agent, "agent");
        AbstractC22676k.m65750j(payload, "payload");
        AbstractC22676k.m65750j(eventName, "eventName");
        AbstractC22676k.m65750j(token, "token");
        this.timestamp = j7;
        this.eventId = eventId;
        this.deviceId = deviceId;
        this.agent = agent;
        this.payload = payload;
        this.eventName = eventName;
        this.token = token;
        this.isQa = z4;
        this.analyticsPeer = analyticsPeer;
        this.analyticsCluster = analyticsCluster;
    }

    public /* synthetic */ AnalyticsEntityModel(long j7, String str, String str2, String str3, HashMap map, String str4, String str5, boolean z4, AnalyticsPeer analyticsPeer, AnalyticsCluster analyticsCluster, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0L : j7, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? "" : str2, (i13 & 8) != 0 ? "" : str3, (i13 & 16) != 0 ? new HashMap() : map, (i13 & 32) != 0 ? "" : str4, (i13 & 64) != 0 ? "" : str5, (i13 & 128) != 0 ? false : z4, (i13 & 256) != 0 ? null : analyticsPeer, (i13 & 512) != 0 ? null : analyticsCluster);
    }
}
