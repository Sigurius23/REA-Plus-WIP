package live.hms.video.sdk.models;

import com.google.gson.annotations.SerializedName;
import io.getstream.chat.android.client.api.QueryParams;
import live.hms.video.sdk.peerlist.models.BeamStreamingStates;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010 \u001a\u0004\u0018\u00010\nHÀ\u0003¢\u0006\u0002\b!J\u000b\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003Jb\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006+"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSHLSVariant;", "", "hlsStreamUrl", "", "meetingUrl", "metadata", "startedAt", "", "updatedAt", "state", "Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;", "playlistType", "Llive/hms/video/sdk/models/HMSHLSPlaylistType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;Llive/hms/video/sdk/models/HMSHLSPlaylistType;)V", "getHlsStreamUrl", "()Ljava/lang/String;", "getMeetingUrl", "getMetadata", "getStartedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUpdatedAt", "getState$lib_release", "()Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;", "getPlaylistType", "()Llive/hms/video/sdk/models/HMSHLSPlaylistType;", "component1", "component2", "component3", "component4", "component5", "component6", "component6$lib_release", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;Llive/hms/video/sdk/models/HMSHLSPlaylistType;)Llive/hms/video/sdk/models/HMSHLSVariant;", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSHLSVariant {

    @SerializedName(QueryParams.URL)
    private final String hlsStreamUrl;

    @SerializedName("meeting_url")
    private final String meetingUrl;

    @SerializedName("metadata")
    private final String metadata;

    @SerializedName("playlist_type")
    private final HMSHLSPlaylistType playlistType;

    @SerializedName("started_at")
    private final Long startedAt;

    @SerializedName("state")
    private final BeamStreamingStates state;

    @SerializedName("updated_at")
    private final Long updatedAt;

    public HMSHLSVariant(String str, String str2, String str3, Long l7, Long l12, BeamStreamingStates beamStreamingStates, HMSHLSPlaylistType hMSHLSPlaylistType) {
        this.hlsStreamUrl = str;
        this.meetingUrl = str2;
        this.metadata = str3;
        this.startedAt = l7;
        this.updatedAt = l12;
        this.state = beamStreamingStates;
        this.playlistType = hMSHLSPlaylistType;
    }

    public static /* synthetic */ HMSHLSVariant copy$default(HMSHLSVariant hMSHLSVariant, String str, String str2, String str3, Long l7, Long l12, BeamStreamingStates beamStreamingStates, HMSHLSPlaylistType hMSHLSPlaylistType, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = hMSHLSVariant.hlsStreamUrl;
        }
        if ((i13 & 2) != 0) {
            str2 = hMSHLSVariant.meetingUrl;
        }
        if ((i13 & 4) != 0) {
            str3 = hMSHLSVariant.metadata;
        }
        if ((i13 & 8) != 0) {
            l7 = hMSHLSVariant.startedAt;
        }
        if ((i13 & 16) != 0) {
            l12 = hMSHLSVariant.updatedAt;
        }
        if ((i13 & 32) != 0) {
            beamStreamingStates = hMSHLSVariant.state;
        }
        if ((i13 & 64) != 0) {
            hMSHLSPlaylistType = hMSHLSVariant.playlistType;
        }
        BeamStreamingStates beamStreamingStates2 = beamStreamingStates;
        HMSHLSPlaylistType hMSHLSPlaylistType2 = hMSHLSPlaylistType;
        Long l13 = l12;
        String str4 = str3;
        return hMSHLSVariant.copy(str, str2, str4, l7, l13, beamStreamingStates2, hMSHLSPlaylistType2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHlsStreamUrl() {
        return this.hlsStreamUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMeetingUrl() {
        return this.meetingUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getStartedAt() {
        return this.startedAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component6$lib_release, reason: from getter */
    public final BeamStreamingStates getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final HMSHLSPlaylistType getPlaylistType() {
        return this.playlistType;
    }

    public final HMSHLSVariant copy(String hlsStreamUrl, String meetingUrl, String metadata, Long startedAt, Long updatedAt, BeamStreamingStates state, HMSHLSPlaylistType playlistType) {
        return new HMSHLSVariant(hlsStreamUrl, meetingUrl, metadata, startedAt, updatedAt, state, playlistType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSHLSVariant)) {
            return false;
        }
        HMSHLSVariant hMSHLSVariant = (HMSHLSVariant) other;
        return AbstractC22676k.m65745e(this.hlsStreamUrl, hMSHLSVariant.hlsStreamUrl) && AbstractC22676k.m65745e(this.meetingUrl, hMSHLSVariant.meetingUrl) && AbstractC22676k.m65745e(this.metadata, hMSHLSVariant.metadata) && AbstractC22676k.m65745e(this.startedAt, hMSHLSVariant.startedAt) && AbstractC22676k.m65745e(this.updatedAt, hMSHLSVariant.updatedAt) && this.state == hMSHLSVariant.state && this.playlistType == hMSHLSVariant.playlistType;
    }

    public final String getHlsStreamUrl() {
        return this.hlsStreamUrl;
    }

    public final String getMeetingUrl() {
        return this.meetingUrl;
    }

    public final String getMetadata() {
        return this.metadata;
    }

    public final HMSHLSPlaylistType getPlaylistType() {
        return this.playlistType;
    }

    public final Long getStartedAt() {
        return this.startedAt;
    }

    public final BeamStreamingStates getState$lib_release() {
        return this.state;
    }

    public final Long getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        String str = this.hlsStreamUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.meetingUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.metadata;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l7 = this.startedAt;
        int iHashCode4 = (iHashCode3 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l12 = this.updatedAt;
        int iHashCode5 = (iHashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
        BeamStreamingStates beamStreamingStates = this.state;
        int iHashCode6 = (iHashCode5 + (beamStreamingStates == null ? 0 : beamStreamingStates.hashCode())) * 31;
        HMSHLSPlaylistType hMSHLSPlaylistType = this.playlistType;
        return iHashCode6 + (hMSHLSPlaylistType != null ? hMSHLSPlaylistType.hashCode() : 0);
    }

    public String toString() {
        return "HMSHLSVariant(hlsStreamUrl=" + this.hlsStreamUrl + ", meetingUrl=" + this.meetingUrl + ", metadata=" + this.metadata + ", startedAt=" + this.startedAt + ", updatedAt=" + this.updatedAt + ", state=" + this.state + ", playlistType=" + this.playlistType + ')';
    }
}
