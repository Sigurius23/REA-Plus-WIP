package live.hms.video.media.streams.models;

import com.google.gson.annotations.SerializedName;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m65681d2 = {"Llive/hms/video/media/streams/models/PreferLayer;", "Llive/hms/video/media/streams/models/HMSDataChannelRequestParams;", "trackId", "", "layer", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTrackId", "()Ljava/lang/String;", "getLayer", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class PreferLayer implements HMSDataChannelRequestParams {

    @SerializedName("max_spatial_layer")
    private final String layer;

    @SerializedName("track_id")
    private final String trackId;

    public PreferLayer(String trackId, String layer) {
        AbstractC22676k.m65750j(trackId, "trackId");
        AbstractC22676k.m65750j(layer, "layer");
        this.trackId = trackId;
        this.layer = layer;
    }

    public static /* synthetic */ PreferLayer copy$default(PreferLayer preferLayer, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = preferLayer.trackId;
        }
        if ((i13 & 2) != 0) {
            str2 = preferLayer.layer;
        }
        return preferLayer.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTrackId() {
        return this.trackId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLayer() {
        return this.layer;
    }

    public final PreferLayer copy(String trackId, String layer) {
        AbstractC22676k.m65750j(trackId, "trackId");
        AbstractC22676k.m65750j(layer, "layer");
        return new PreferLayer(trackId, layer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreferLayer)) {
            return false;
        }
        PreferLayer preferLayer = (PreferLayer) other;
        return AbstractC22676k.m65745e(this.trackId, preferLayer.trackId) && AbstractC22676k.m65745e(this.layer, preferLayer.layer);
    }

    public final String getLayer() {
        return this.layer;
    }

    public final String getTrackId() {
        return this.trackId;
    }

    public int hashCode() {
        return this.layer.hashCode() + (this.trackId.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("PreferLayer(trackId=");
        sb4.append(this.trackId);
        sb4.append(", layer=");
        return AbstractC25012a.m73377j(sb4, this.layer, ')');
    }
}
