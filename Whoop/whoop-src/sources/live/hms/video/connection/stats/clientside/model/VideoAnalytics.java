package live.hms.video.connection.stats.clientside.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JC\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\b\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\t\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006 "}, m65681d2 = {"Llive/hms/video/connection/stats/clientside/model/VideoAnalytics;", "Llive/hms/video/connection/stats/clientside/model/TrackAnalytics;", "rid", "", "videoSamples", "", "Llive/hms/video/connection/stats/clientside/model/BaseSample;", "trackId", "ssrc", "source", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRid", "()Ljava/lang/String;", "getVideoSamples", "()Ljava/util/List;", "getTrackId", "getSsrc", "getSource", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class VideoAnalytics implements TrackAnalytics {

    @SerializedName("rid")
    private final String rid;

    @SerializedName("source")
    private final String source;

    @SerializedName("ssrc")
    private final String ssrc;

    @SerializedName("track_id")
    private final String trackId;

    @SerializedName("samples")
    private final List<BaseSample> videoSamples;

    /* JADX WARN: Multi-variable type inference failed */
    public VideoAnalytics(String str, List<? extends BaseSample> videoSamples, String trackId, String ssrc, String source) {
        AbstractC22676k.m65750j(videoSamples, "videoSamples");
        AbstractC22676k.m65750j(trackId, "trackId");
        AbstractC22676k.m65750j(ssrc, "ssrc");
        AbstractC22676k.m65750j(source, "source");
        this.rid = str;
        this.videoSamples = videoSamples;
        this.trackId = trackId;
        this.ssrc = ssrc;
        this.source = source;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoAnalytics copy$default(VideoAnalytics videoAnalytics, String str, List list, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = videoAnalytics.rid;
        }
        if ((i13 & 2) != 0) {
            list = videoAnalytics.videoSamples;
        }
        if ((i13 & 4) != 0) {
            str2 = videoAnalytics.trackId;
        }
        if ((i13 & 8) != 0) {
            str3 = videoAnalytics.ssrc;
        }
        if ((i13 & 16) != 0) {
            str4 = videoAnalytics.source;
        }
        String str5 = str4;
        String str6 = str2;
        return videoAnalytics.copy(str, list, str6, str3, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRid() {
        return this.rid;
    }

    public final List<BaseSample> component2() {
        return this.videoSamples;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTrackId() {
        return this.trackId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSsrc() {
        return this.ssrc;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final VideoAnalytics copy(String rid, List<? extends BaseSample> videoSamples, String trackId, String ssrc, String source) {
        AbstractC22676k.m65750j(videoSamples, "videoSamples");
        AbstractC22676k.m65750j(trackId, "trackId");
        AbstractC22676k.m65750j(ssrc, "ssrc");
        AbstractC22676k.m65750j(source, "source");
        return new VideoAnalytics(rid, videoSamples, trackId, ssrc, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoAnalytics)) {
            return false;
        }
        VideoAnalytics videoAnalytics = (VideoAnalytics) other;
        return AbstractC22676k.m65745e(this.rid, videoAnalytics.rid) && AbstractC22676k.m65745e(this.videoSamples, videoAnalytics.videoSamples) && AbstractC22676k.m65745e(this.trackId, videoAnalytics.trackId) && AbstractC22676k.m65745e(this.ssrc, videoAnalytics.ssrc) && AbstractC22676k.m65745e(this.source, videoAnalytics.source);
    }

    public final String getRid() {
        return this.rid;
    }

    @Override // live.hms.video.connection.stats.clientside.model.TrackAnalytics
    public String getSource() {
        return this.source;
    }

    @Override // live.hms.video.connection.stats.clientside.model.TrackAnalytics
    public String getSsrc() {
        return this.ssrc;
    }

    @Override // live.hms.video.connection.stats.clientside.model.TrackAnalytics
    public String getTrackId() {
        return this.trackId;
    }

    public final List<BaseSample> getVideoSamples() {
        return this.videoSamples;
    }

    public int hashCode() {
        String str = this.rid;
        return this.source.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11895b.m31983b((str == null ? 0 : str.hashCode()) * 31, 31, this.videoSamples), 31, this.trackId), 31, this.ssrc);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("VideoAnalytics(rid=");
        sb4.append(this.rid);
        sb4.append(", videoSamples=");
        sb4.append(this.videoSamples);
        sb4.append(", trackId=");
        sb4.append(this.trackId);
        sb4.append(", ssrc=");
        sb4.append(this.ssrc);
        sb4.append(", source=");
        return AbstractC25012a.m73377j(sb4, this.source, ')');
    }
}
