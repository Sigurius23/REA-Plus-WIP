package live.hms.video.transport.models;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006#"}, m65681d2 = {"Llive/hms/video/transport/models/JoinParameters;", "", "token", "", "peerId", "peerName", "data", "endpoint", "serverSubscribeDegradation", "", "iceGatheringOnAnyAddressPorts", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getToken", "()Ljava/lang/String;", "getPeerId", "getPeerName", "getData", "getEndpoint", "getServerSubscribeDegradation", "()Z", "getIceGatheringOnAnyAddressPorts", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class JoinParameters {
    private final String data;
    private final String endpoint;
    private final boolean iceGatheringOnAnyAddressPorts;
    private final String peerId;
    private final String peerName;
    private final boolean serverSubscribeDegradation;
    private final String token;

    public JoinParameters(String token, String peerId, String peerName, String data, String endpoint, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(token, "token");
        AbstractC22676k.m65750j(peerId, "peerId");
        AbstractC22676k.m65750j(peerName, "peerName");
        AbstractC22676k.m65750j(data, "data");
        AbstractC22676k.m65750j(endpoint, "endpoint");
        this.token = token;
        this.peerId = peerId;
        this.peerName = peerName;
        this.data = data;
        this.endpoint = endpoint;
        this.serverSubscribeDegradation = z4;
        this.iceGatheringOnAnyAddressPorts = z13;
    }

    public static /* synthetic */ JoinParameters copy$default(JoinParameters joinParameters, String str, String str2, String str3, String str4, String str5, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = joinParameters.token;
        }
        if ((i13 & 2) != 0) {
            str2 = joinParameters.peerId;
        }
        if ((i13 & 4) != 0) {
            str3 = joinParameters.peerName;
        }
        if ((i13 & 8) != 0) {
            str4 = joinParameters.data;
        }
        if ((i13 & 16) != 0) {
            str5 = joinParameters.endpoint;
        }
        if ((i13 & 32) != 0) {
            z4 = joinParameters.serverSubscribeDegradation;
        }
        if ((i13 & 64) != 0) {
            z13 = joinParameters.iceGatheringOnAnyAddressPorts;
        }
        boolean z14 = z4;
        boolean z15 = z13;
        String str6 = str5;
        String str7 = str3;
        return joinParameters.copy(str, str2, str7, str4, str6, z14, z15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPeerId() {
        return this.peerId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPeerName() {
        return this.peerName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEndpoint() {
        return this.endpoint;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getServerSubscribeDegradation() {
        return this.serverSubscribeDegradation;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIceGatheringOnAnyAddressPorts() {
        return this.iceGatheringOnAnyAddressPorts;
    }

    public final JoinParameters copy(String token, String peerId, String peerName, String data, String endpoint, boolean serverSubscribeDegradation, boolean iceGatheringOnAnyAddressPorts) {
        AbstractC22676k.m65750j(token, "token");
        AbstractC22676k.m65750j(peerId, "peerId");
        AbstractC22676k.m65750j(peerName, "peerName");
        AbstractC22676k.m65750j(data, "data");
        AbstractC22676k.m65750j(endpoint, "endpoint");
        return new JoinParameters(token, peerId, peerName, data, endpoint, serverSubscribeDegradation, iceGatheringOnAnyAddressPorts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JoinParameters)) {
            return false;
        }
        JoinParameters joinParameters = (JoinParameters) other;
        return AbstractC22676k.m65745e(this.token, joinParameters.token) && AbstractC22676k.m65745e(this.peerId, joinParameters.peerId) && AbstractC22676k.m65745e(this.peerName, joinParameters.peerName) && AbstractC22676k.m65745e(this.data, joinParameters.data) && AbstractC22676k.m65745e(this.endpoint, joinParameters.endpoint) && this.serverSubscribeDegradation == joinParameters.serverSubscribeDegradation && this.iceGatheringOnAnyAddressPorts == joinParameters.iceGatheringOnAnyAddressPorts;
    }

    public final String getData() {
        return this.data;
    }

    public final String getEndpoint() {
        return this.endpoint;
    }

    public final boolean getIceGatheringOnAnyAddressPorts() {
        return this.iceGatheringOnAnyAddressPorts;
    }

    public final String getPeerId() {
        return this.peerId;
    }

    public final String getPeerName() {
        return this.peerName;
    }

    public final boolean getServerSubscribeDegradation() {
        return this.serverSubscribeDegradation;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return Boolean.hashCode(this.iceGatheringOnAnyAddressPorts) + AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.token.hashCode() * 31, 31, this.peerId), 31, this.peerName), 31, this.data), 31, this.endpoint), 31, this.serverSubscribeDegradation);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("JoinParameters(token=");
        sb4.append(this.token);
        sb4.append(", peerId=");
        sb4.append(this.peerId);
        sb4.append(", peerName=");
        sb4.append(this.peerName);
        sb4.append(", data=");
        sb4.append(this.data);
        sb4.append(", endpoint=");
        sb4.append(this.endpoint);
        sb4.append(", serverSubscribeDegradation=");
        sb4.append(this.serverSubscribeDegradation);
        sb4.append(", iceGatheringOnAnyAddressPorts=");
        return AbstractC2875y.m8305r(sb4, this.iceGatheringOnAnyAddressPorts, ')');
    }
}
