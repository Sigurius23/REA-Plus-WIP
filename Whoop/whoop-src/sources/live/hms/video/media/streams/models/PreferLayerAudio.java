package live.hms.video.media.streams.models;

import com.google.gson.annotations.SerializedName;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, m65681d2 = {"Llive/hms/video/media/streams/models/PreferLayerAudio;", "Llive/hms/video/media/streams/models/HMSDataChannelRequestParams;", "trackId", "", "isSubscribed", "", "<init>", "(Ljava/lang/String;Z)V", "getTrackId", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class PreferLayerAudio implements HMSDataChannelRequestParams {

    @SerializedName("subscribed")
    private final boolean isSubscribed;

    @SerializedName("track_id")
    private final String trackId;

    public PreferLayerAudio(String trackId, boolean z4) {
        AbstractC22676k.m65750j(trackId, "trackId");
        this.trackId = trackId;
        this.isSubscribed = z4;
    }

    public static /* synthetic */ PreferLayerAudio copy$default(PreferLayerAudio preferLayerAudio, String str, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = preferLayerAudio.trackId;
        }
        if ((i13 & 2) != 0) {
            z4 = preferLayerAudio.isSubscribed;
        }
        return preferLayerAudio.copy(str, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTrackId() {
        return this.trackId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsSubscribed() {
        return this.isSubscribed;
    }

    public final PreferLayerAudio copy(String trackId, boolean isSubscribed) {
        AbstractC22676k.m65750j(trackId, "trackId");
        return new PreferLayerAudio(trackId, isSubscribed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreferLayerAudio)) {
            return false;
        }
        PreferLayerAudio preferLayerAudio = (PreferLayerAudio) other;
        return AbstractC22676k.m65745e(this.trackId, preferLayerAudio.trackId) && this.isSubscribed == preferLayerAudio.isSubscribed;
    }

    public final String getTrackId() {
        return this.trackId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSubscribed) + (this.trackId.hashCode() * 31);
    }

    public final boolean isSubscribed() {
        return this.isSubscribed;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("PreferLayerAudio(trackId=");
        sb4.append(this.trackId);
        sb4.append(", isSubscribed=");
        return AbstractC2875y.m8305r(sb4, this.isSubscribed, ')');
    }
}
