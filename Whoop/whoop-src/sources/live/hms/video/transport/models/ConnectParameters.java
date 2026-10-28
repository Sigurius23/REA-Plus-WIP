package live.hms.video.transport.models;

import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m65681d2 = {"Llive/hms/video/transport/models/ConnectParameters;", "", "token", "", "peerId", "endpoint", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "getPeerId", "getEndpoint", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class ConnectParameters {
    private final String endpoint;
    private final String peerId;
    private final String token;

    public ConnectParameters(String token, String peerId, String endpoint) {
        AbstractC22676k.m65750j(token, "token");
        AbstractC22676k.m65750j(peerId, "peerId");
        AbstractC22676k.m65750j(endpoint, "endpoint");
        this.token = token;
        this.peerId = peerId;
        this.endpoint = endpoint;
    }

    public static /* synthetic */ ConnectParameters copy$default(ConnectParameters connectParameters, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = connectParameters.token;
        }
        if ((i13 & 2) != 0) {
            str2 = connectParameters.peerId;
        }
        if ((i13 & 4) != 0) {
            str3 = connectParameters.endpoint;
        }
        return connectParameters.copy(str, str2, str3);
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
    public final String getEndpoint() {
        return this.endpoint;
    }

    public final ConnectParameters copy(String token, String peerId, String endpoint) {
        AbstractC22676k.m65750j(token, "token");
        AbstractC22676k.m65750j(peerId, "peerId");
        AbstractC22676k.m65750j(endpoint, "endpoint");
        return new ConnectParameters(token, peerId, endpoint);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectParameters)) {
            return false;
        }
        ConnectParameters connectParameters = (ConnectParameters) other;
        return AbstractC22676k.m65745e(this.token, connectParameters.token) && AbstractC22676k.m65745e(this.peerId, connectParameters.peerId) && AbstractC22676k.m65745e(this.endpoint, connectParameters.endpoint);
    }

    public final String getEndpoint() {
        return this.endpoint;
    }

    public final String getPeerId() {
        return this.peerId;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.endpoint.hashCode() + AbstractC11266d.m30450d(this.token.hashCode() * 31, 31, this.peerId);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("ConnectParameters(token=");
        sb4.append(this.token);
        sb4.append(", peerId=");
        sb4.append(this.peerId);
        sb4.append(", endpoint=");
        return AbstractC25012a.m73377j(sb4, this.endpoint, ')');
    }
}
