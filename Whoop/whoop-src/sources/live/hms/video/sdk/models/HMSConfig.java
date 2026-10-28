package live.hms.video.sdk.models;

import live.hms.video.utils.HMSConstantsKt;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\f\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\f¨\u0006!"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSConfig;", "", "userName", "", "authtoken", "metadata", "captureNetworkQualityInPreview", "", "initEndpoint", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getUserName", "()Ljava/lang/String;", "getAuthtoken", "getMetadata", "setMetadata", "(Ljava/lang/String;)V", "getCaptureNetworkQualityInPreview", "()Z", "setCaptureNetworkQualityInPreview", "(Z)V", "getInitEndpoint", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSConfig {
    private final String authtoken;
    private boolean captureNetworkQualityInPreview;
    private final String initEndpoint;
    private String metadata;
    private final String userName;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HMSConfig(String userName, String authtoken) {
        this(userName, authtoken, null, false, null, 28, null);
        AbstractC22676k.m65750j(userName, "userName");
        AbstractC22676k.m65750j(authtoken, "authtoken");
    }

    public static /* synthetic */ HMSConfig copy$default(HMSConfig hMSConfig, String str, String str2, String str3, boolean z4, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = hMSConfig.userName;
        }
        if ((i13 & 2) != 0) {
            str2 = hMSConfig.authtoken;
        }
        if ((i13 & 4) != 0) {
            str3 = hMSConfig.metadata;
        }
        if ((i13 & 8) != 0) {
            z4 = hMSConfig.captureNetworkQualityInPreview;
        }
        if ((i13 & 16) != 0) {
            str4 = hMSConfig.initEndpoint;
        }
        String str5 = str4;
        String str6 = str3;
        return hMSConfig.copy(str, str2, str6, z4, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuthtoken() {
        return this.authtoken;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getCaptureNetworkQualityInPreview() {
        return this.captureNetworkQualityInPreview;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getInitEndpoint() {
        return this.initEndpoint;
    }

    public final HMSConfig copy(String userName, String authtoken, String metadata, boolean captureNetworkQualityInPreview, String initEndpoint) {
        AbstractC22676k.m65750j(userName, "userName");
        AbstractC22676k.m65750j(authtoken, "authtoken");
        AbstractC22676k.m65750j(metadata, "metadata");
        AbstractC22676k.m65750j(initEndpoint, "initEndpoint");
        return new HMSConfig(userName, authtoken, metadata, captureNetworkQualityInPreview, initEndpoint);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSConfig)) {
            return false;
        }
        HMSConfig hMSConfig = (HMSConfig) other;
        return AbstractC22676k.m65745e(this.userName, hMSConfig.userName) && AbstractC22676k.m65745e(this.authtoken, hMSConfig.authtoken) && AbstractC22676k.m65745e(this.metadata, hMSConfig.metadata) && this.captureNetworkQualityInPreview == hMSConfig.captureNetworkQualityInPreview && AbstractC22676k.m65745e(this.initEndpoint, hMSConfig.initEndpoint);
    }

    public final String getAuthtoken() {
        return this.authtoken;
    }

    public final boolean getCaptureNetworkQualityInPreview() {
        return this.captureNetworkQualityInPreview;
    }

    public final String getInitEndpoint() {
        return this.initEndpoint;
    }

    public final String getMetadata() {
        return this.metadata;
    }

    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        return this.initEndpoint.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.userName.hashCode() * 31, 31, this.authtoken), 31, this.metadata), 31, this.captureNetworkQualityInPreview);
    }

    public final void setCaptureNetworkQualityInPreview(boolean z4) {
        this.captureNetworkQualityInPreview = z4;
    }

    public final void setMetadata(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.metadata = str;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("HMSConfig(userName=");
        sb4.append(this.userName);
        sb4.append(", authtoken=");
        sb4.append(this.authtoken);
        sb4.append(", metadata=");
        sb4.append(this.metadata);
        sb4.append(", captureNetworkQualityInPreview=");
        sb4.append(this.captureNetworkQualityInPreview);
        sb4.append(", initEndpoint=");
        return AbstractC25012a.m73377j(sb4, this.initEndpoint, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HMSConfig(String userName, String authtoken, String metadata) {
        this(userName, authtoken, metadata, false, null, 24, null);
        AbstractC22676k.m65750j(userName, "userName");
        AbstractC22676k.m65750j(authtoken, "authtoken");
        AbstractC22676k.m65750j(metadata, "metadata");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HMSConfig(String userName, String authtoken, String metadata, boolean z4) {
        this(userName, authtoken, metadata, z4, null, 16, null);
        AbstractC22676k.m65750j(userName, "userName");
        AbstractC22676k.m65750j(authtoken, "authtoken");
        AbstractC22676k.m65750j(metadata, "metadata");
    }

    public HMSConfig(String userName, String authtoken, String metadata, boolean z4, String initEndpoint) {
        AbstractC22676k.m65750j(userName, "userName");
        AbstractC22676k.m65750j(authtoken, "authtoken");
        AbstractC22676k.m65750j(metadata, "metadata");
        AbstractC22676k.m65750j(initEndpoint, "initEndpoint");
        this.userName = userName;
        this.authtoken = authtoken;
        this.metadata = metadata;
        this.captureNetworkQualityInPreview = z4;
        this.initEndpoint = initEndpoint;
    }

    public /* synthetic */ HMSConfig(String str, String str2, String str3, boolean z4, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? HMSConstantsKt.cDefaultInitEndpoint : str4);
    }
}
