package live.hms.video.connection.stats.clientside.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001d"}, m65681d2 = {"Llive/hms/video/connection/stats/clientside/model/AudioAnalytics;", "Llive/hms/video/connection/stats/clientside/model/TrackAnalytics;", "audioSample", "", "Llive/hms/video/connection/stats/clientside/model/BaseSample;", "trackId", "", "ssrc", "source", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAudioSample", "()Ljava/util/List;", "getTrackId", "()Ljava/lang/String;", "getSsrc", "getSource", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class AudioAnalytics implements TrackAnalytics {

    @SerializedName("samples")
    private final List<BaseSample> audioSample;

    @SerializedName("source")
    private final String source;

    @SerializedName("ssrc")
    private final String ssrc;

    @SerializedName("track_id")
    private final String trackId;

    /* JADX WARN: Multi-variable type inference failed */
    public AudioAnalytics(List<? extends BaseSample> audioSample, String trackId, String ssrc, String source) {
        AbstractC22676k.m65750j(audioSample, "audioSample");
        AbstractC22676k.m65750j(trackId, "trackId");
        AbstractC22676k.m65750j(ssrc, "ssrc");
        AbstractC22676k.m65750j(source, "source");
        this.audioSample = audioSample;
        this.trackId = trackId;
        this.ssrc = ssrc;
        this.source = source;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AudioAnalytics copy$default(AudioAnalytics audioAnalytics, List list, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = audioAnalytics.audioSample;
        }
        if ((i13 & 2) != 0) {
            str = audioAnalytics.trackId;
        }
        if ((i13 & 4) != 0) {
            str2 = audioAnalytics.ssrc;
        }
        if ((i13 & 8) != 0) {
            str3 = audioAnalytics.source;
        }
        return audioAnalytics.copy(list, str, str2, str3);
    }

    public final List<BaseSample> component1() {
        return this.audioSample;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTrackId() {
        return this.trackId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSsrc() {
        return this.ssrc;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final AudioAnalytics copy(List<? extends BaseSample> audioSample, String trackId, String ssrc, String source) {
        AbstractC22676k.m65750j(audioSample, "audioSample");
        AbstractC22676k.m65750j(trackId, "trackId");
        AbstractC22676k.m65750j(ssrc, "ssrc");
        AbstractC22676k.m65750j(source, "source");
        return new AudioAnalytics(audioSample, trackId, ssrc, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioAnalytics)) {
            return false;
        }
        AudioAnalytics audioAnalytics = (AudioAnalytics) other;
        return AbstractC22676k.m65745e(this.audioSample, audioAnalytics.audioSample) && AbstractC22676k.m65745e(this.trackId, audioAnalytics.trackId) && AbstractC22676k.m65745e(this.ssrc, audioAnalytics.ssrc) && AbstractC22676k.m65745e(this.source, audioAnalytics.source);
    }

    public final List<BaseSample> getAudioSample() {
        return this.audioSample;
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

    public int hashCode() {
        return this.source.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.audioSample.hashCode() * 31, 31, this.trackId), 31, this.ssrc);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("AudioAnalytics(audioSample=");
        sb4.append(this.audioSample);
        sb4.append(", trackId=");
        sb4.append(this.trackId);
        sb4.append(", ssrc=");
        sb4.append(this.ssrc);
        sb4.append(", source=");
        return AbstractC25012a.m73377j(sb4, this.source, ')');
    }
}
