package live.hms.video.connection.models;

import com.google.gson.annotations.SerializedName;
import hms.webrtc.IceCandidate;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, m65681d2 = {"Llive/hms/video/connection/models/HMSIceCandidate;", "", "candidate", "", "sdpMLineIndex", "", "sdpMid", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCandidate", "()Ljava/lang/String;", "getSdpMLineIndex", "()I", "getSdpMid", "native", "Lhms/webrtc/IceCandidate;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSIceCandidate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("candidate")
    private final String candidate;

    @SerializedName("sdpMLineIndex")
    private final int sdpMLineIndex;

    @SerializedName("sdpMid")
    private final String sdpMid;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m65681d2 = {"Llive/hms/video/connection/models/HMSIceCandidate$Companion;", "", "<init>", "()V", "from", "Llive/hms/video/connection/models/HMSIceCandidate;", "src", "Lhms/webrtc/IceCandidate;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final HMSIceCandidate from(IceCandidate src) {
            AbstractC22676k.m65750j(src, "src");
            String sdp = src.sdp;
            AbstractC22676k.m65749i(sdp, "sdp");
            int i13 = src.sdpMLineIndex;
            String sdpMid = src.sdpMid;
            AbstractC22676k.m65749i(sdpMid, "sdpMid");
            return new HMSIceCandidate(sdp, i13, sdpMid);
        }

        private Companion() {
        }
    }

    public HMSIceCandidate(String candidate, int i13, String sdpMid) {
        AbstractC22676k.m65750j(candidate, "candidate");
        AbstractC22676k.m65750j(sdpMid, "sdpMid");
        this.candidate = candidate;
        this.sdpMLineIndex = i13;
        this.sdpMid = sdpMid;
    }

    public static /* synthetic */ HMSIceCandidate copy$default(HMSIceCandidate hMSIceCandidate, String str, int i13, String str2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = hMSIceCandidate.candidate;
        }
        if ((i14 & 2) != 0) {
            i13 = hMSIceCandidate.sdpMLineIndex;
        }
        if ((i14 & 4) != 0) {
            str2 = hMSIceCandidate.sdpMid;
        }
        return hMSIceCandidate.copy(str, i13, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCandidate() {
        return this.candidate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSdpMLineIndex() {
        return this.sdpMLineIndex;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSdpMid() {
        return this.sdpMid;
    }

    public final HMSIceCandidate copy(String candidate, int sdpMLineIndex, String sdpMid) {
        AbstractC22676k.m65750j(candidate, "candidate");
        AbstractC22676k.m65750j(sdpMid, "sdpMid");
        return new HMSIceCandidate(candidate, sdpMLineIndex, sdpMid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSIceCandidate)) {
            return false;
        }
        HMSIceCandidate hMSIceCandidate = (HMSIceCandidate) other;
        return AbstractC22676k.m65745e(this.candidate, hMSIceCandidate.candidate) && this.sdpMLineIndex == hMSIceCandidate.sdpMLineIndex && AbstractC22676k.m65745e(this.sdpMid, hMSIceCandidate.sdpMid);
    }

    public final String getCandidate() {
        return this.candidate;
    }

    public final int getSdpMLineIndex() {
        return this.sdpMLineIndex;
    }

    public final String getSdpMid() {
        return this.sdpMid;
    }

    public int hashCode() {
        return this.sdpMid.hashCode() + AbstractC11266d.m30448b(this.sdpMLineIndex, this.candidate.hashCode() * 31, 31);
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final IceCandidate m134453native() {
        return new IceCandidate(this.sdpMid, this.sdpMLineIndex, this.candidate);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("HMSIceCandidate(candidate=");
        sb4.append(this.candidate);
        sb4.append(", sdpMLineIndex=");
        sb4.append(this.sdpMLineIndex);
        sb4.append(", sdpMid=");
        return AbstractC25012a.m73377j(sb4, this.sdpMid, ')');
    }
}
