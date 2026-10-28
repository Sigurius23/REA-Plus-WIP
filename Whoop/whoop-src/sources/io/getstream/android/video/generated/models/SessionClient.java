package io.getstream.android.video.generated.models;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003JE\u0010\u0016\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, m65681d2 = {"Lio/getstream/android/video/generated/models/SessionClient;", "", "ip", "", "name", "networkType", "version", "location", "Lio/getstream/android/video/generated/models/CallStatsLocation;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsLocation;)V", "getIp", "()Ljava/lang/String;", "getLocation", "()Lio/getstream/android/video/generated/models/CallStatsLocation;", "getName", "getNetworkType", "getVersion", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class SessionClient {
    private final String ip;
    private final CallStatsLocation location;
    private final String name;
    private final String networkType;
    private final String version;

    public SessionClient() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ SessionClient copy$default(SessionClient sessionClient, String str, String str2, String str3, String str4, CallStatsLocation callStatsLocation, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sessionClient.ip;
        }
        if ((i13 & 2) != 0) {
            str2 = sessionClient.name;
        }
        if ((i13 & 4) != 0) {
            str3 = sessionClient.networkType;
        }
        if ((i13 & 8) != 0) {
            str4 = sessionClient.version;
        }
        if ((i13 & 16) != 0) {
            callStatsLocation = sessionClient.location;
        }
        CallStatsLocation callStatsLocation2 = callStatsLocation;
        String str5 = str3;
        return sessionClient.copy(str, str2, str5, str4, callStatsLocation2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIp() {
        return this.ip;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNetworkType() {
        return this.networkType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CallStatsLocation getLocation() {
        return this.location;
    }

    public final SessionClient copy(@InterfaceC30731q(name = "ip") String ip3, @InterfaceC30731q(name = "name") String name, @InterfaceC30731q(name = "network_type") String networkType, @InterfaceC30731q(name = "version") String version, @InterfaceC30731q(name = "location") CallStatsLocation location) {
        return new SessionClient(ip3, name, networkType, version, location);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionClient)) {
            return false;
        }
        SessionClient sessionClient = (SessionClient) other;
        return AbstractC22676k.m65745e(this.ip, sessionClient.ip) && AbstractC22676k.m65745e(this.name, sessionClient.name) && AbstractC22676k.m65745e(this.networkType, sessionClient.networkType) && AbstractC22676k.m65745e(this.version, sessionClient.version) && AbstractC22676k.m65745e(this.location, sessionClient.location);
    }

    public final String getIp() {
        return this.ip;
    }

    public final CallStatsLocation getLocation() {
        return this.location;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNetworkType() {
        return this.networkType;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.ip;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.networkType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.version;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        CallStatsLocation callStatsLocation = this.location;
        return iHashCode4 + (callStatsLocation != null ? callStatsLocation.hashCode() : 0);
    }

    public String toString() {
        String str = this.ip;
        String str2 = this.name;
        String str3 = this.networkType;
        String str4 = this.version;
        CallStatsLocation callStatsLocation = this.location;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SessionClient(ip=", str, ", name=", str2, ", networkType=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", version=", str4, ", location=");
        sbM32001t.append(callStatsLocation);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public SessionClient(@InterfaceC30731q(name = "ip") String str, @InterfaceC30731q(name = "name") String str2, @InterfaceC30731q(name = "network_type") String str3, @InterfaceC30731q(name = "version") String str4, @InterfaceC30731q(name = "location") CallStatsLocation callStatsLocation) {
        this.ip = str;
        this.name = str2;
        this.networkType = str3;
        this.version = str4;
        this.location = callStatsLocation;
    }

    public /* synthetic */ SessionClient(String str, String str2, String str3, String str4, CallStatsLocation callStatsLocation, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : callStatsLocation);
    }
}
