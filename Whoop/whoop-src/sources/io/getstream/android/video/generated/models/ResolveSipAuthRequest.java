package io.getstream.android.video.generated.models;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/android/video/generated/models/ResolveSipAuthRequest;", "", "sipCallerNumber", "", "sipTrunkNumber", "fromHost", "sourceIp", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFromHost", "()Ljava/lang/String;", "getSipCallerNumber", "getSipTrunkNumber", "getSourceIp", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class ResolveSipAuthRequest {
    private final String fromHost;
    private final String sipCallerNumber;
    private final String sipTrunkNumber;
    private final String sourceIp;

    public ResolveSipAuthRequest(@InterfaceC30731q(name = "sip_caller_number") String sipCallerNumber, @InterfaceC30731q(name = "sip_trunk_number") String sipTrunkNumber, @InterfaceC30731q(name = "from_host") String str, @InterfaceC30731q(name = "source_ip") String str2) {
        AbstractC22676k.m65750j(sipCallerNumber, "sipCallerNumber");
        AbstractC22676k.m65750j(sipTrunkNumber, "sipTrunkNumber");
        this.sipCallerNumber = sipCallerNumber;
        this.sipTrunkNumber = sipTrunkNumber;
        this.fromHost = str;
        this.sourceIp = str2;
    }

    public static /* synthetic */ ResolveSipAuthRequest copy$default(ResolveSipAuthRequest resolveSipAuthRequest, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = resolveSipAuthRequest.sipCallerNumber;
        }
        if ((i13 & 2) != 0) {
            str2 = resolveSipAuthRequest.sipTrunkNumber;
        }
        if ((i13 & 4) != 0) {
            str3 = resolveSipAuthRequest.fromHost;
        }
        if ((i13 & 8) != 0) {
            str4 = resolveSipAuthRequest.sourceIp;
        }
        return resolveSipAuthRequest.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSipCallerNumber() {
        return this.sipCallerNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSipTrunkNumber() {
        return this.sipTrunkNumber;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFromHost() {
        return this.fromHost;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSourceIp() {
        return this.sourceIp;
    }

    public final ResolveSipAuthRequest copy(@InterfaceC30731q(name = "sip_caller_number") String sipCallerNumber, @InterfaceC30731q(name = "sip_trunk_number") String sipTrunkNumber, @InterfaceC30731q(name = "from_host") String fromHost, @InterfaceC30731q(name = "source_ip") String sourceIp) {
        AbstractC22676k.m65750j(sipCallerNumber, "sipCallerNumber");
        AbstractC22676k.m65750j(sipTrunkNumber, "sipTrunkNumber");
        return new ResolveSipAuthRequest(sipCallerNumber, sipTrunkNumber, fromHost, sourceIp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResolveSipAuthRequest)) {
            return false;
        }
        ResolveSipAuthRequest resolveSipAuthRequest = (ResolveSipAuthRequest) other;
        return AbstractC22676k.m65745e(this.sipCallerNumber, resolveSipAuthRequest.sipCallerNumber) && AbstractC22676k.m65745e(this.sipTrunkNumber, resolveSipAuthRequest.sipTrunkNumber) && AbstractC22676k.m65745e(this.fromHost, resolveSipAuthRequest.fromHost) && AbstractC22676k.m65745e(this.sourceIp, resolveSipAuthRequest.sourceIp);
    }

    public final String getFromHost() {
        return this.fromHost;
    }

    public final String getSipCallerNumber() {
        return this.sipCallerNumber;
    }

    public final String getSipTrunkNumber() {
        return this.sipTrunkNumber;
    }

    public final String getSourceIp() {
        return this.sourceIp;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.sipCallerNumber.hashCode() * 31, 31, this.sipTrunkNumber);
        String str = this.fromHost;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sourceIp;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.sipCallerNumber;
        String str2 = this.sipTrunkNumber;
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("ResolveSipAuthRequest(sipCallerNumber=", str, ", sipTrunkNumber=", str2, ", fromHost="), this.fromHost, ", sourceIp=", this.sourceIp, ")");
    }

    public /* synthetic */ ResolveSipAuthRequest(String str, String str2, String str3, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4);
    }
}
