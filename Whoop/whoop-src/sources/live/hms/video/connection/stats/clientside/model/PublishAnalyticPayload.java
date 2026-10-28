package live.hms.video.connection.stats.clientside.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010¨\u0006%"}, m65681d2 = {"Llive/hms/video/connection/stats/clientside/model/PublishAnalyticPayload;", "", "sequenceNumber", "", "maxWindowSecond", "joined_at", "", "video", "", "Llive/hms/video/connection/stats/clientside/model/VideoAnalytics;", "audio", "Llive/hms/video/connection/stats/clientside/model/AudioAnalytics;", "batteryPercentage", "<init>", "(IIJLjava/util/List;Ljava/util/List;I)V", "getSequenceNumber", "()I", "getMaxWindowSecond", "getJoined_at", "()J", "getVideo", "()Ljava/util/List;", "getAudio", "getBatteryPercentage", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class PublishAnalyticPayload {

    @SerializedName("audio")
    private final List<AudioAnalytics> audio;

    @SerializedName("battery_percentage")
    private final int batteryPercentage;

    @SerializedName("joined_at")
    private final long joined_at;

    @SerializedName("max_window_sec")
    private final int maxWindowSecond;

    @SerializedName("sequence_num")
    private final int sequenceNumber;

    @SerializedName("video")
    private final List<VideoAnalytics> video;

    public PublishAnalyticPayload(int i13, int i14, long j7, List<VideoAnalytics> video, List<AudioAnalytics> audio, int i15) {
        AbstractC22676k.m65750j(video, "video");
        AbstractC22676k.m65750j(audio, "audio");
        this.sequenceNumber = i13;
        this.maxWindowSecond = i14;
        this.joined_at = j7;
        this.video = video;
        this.audio = audio;
        this.batteryPercentage = i15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PublishAnalyticPayload copy$default(PublishAnalyticPayload publishAnalyticPayload, int i13, int i14, long j7, List list, List list2, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i13 = publishAnalyticPayload.sequenceNumber;
        }
        if ((i16 & 2) != 0) {
            i14 = publishAnalyticPayload.maxWindowSecond;
        }
        if ((i16 & 4) != 0) {
            j7 = publishAnalyticPayload.joined_at;
        }
        if ((i16 & 8) != 0) {
            list = publishAnalyticPayload.video;
        }
        if ((i16 & 16) != 0) {
            list2 = publishAnalyticPayload.audio;
        }
        if ((i16 & 32) != 0) {
            i15 = publishAnalyticPayload.batteryPercentage;
        }
        int i17 = i15;
        List list3 = list;
        long j13 = j7;
        return publishAnalyticPayload.copy(i13, i14, j13, list3, list2, i17);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSequenceNumber() {
        return this.sequenceNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMaxWindowSecond() {
        return this.maxWindowSecond;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getJoined_at() {
        return this.joined_at;
    }

    public final List<VideoAnalytics> component4() {
        return this.video;
    }

    public final List<AudioAnalytics> component5() {
        return this.audio;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getBatteryPercentage() {
        return this.batteryPercentage;
    }

    public final PublishAnalyticPayload copy(int sequenceNumber, int maxWindowSecond, long joined_at, List<VideoAnalytics> video, List<AudioAnalytics> audio, int batteryPercentage) {
        AbstractC22676k.m65750j(video, "video");
        AbstractC22676k.m65750j(audio, "audio");
        return new PublishAnalyticPayload(sequenceNumber, maxWindowSecond, joined_at, video, audio, batteryPercentage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PublishAnalyticPayload)) {
            return false;
        }
        PublishAnalyticPayload publishAnalyticPayload = (PublishAnalyticPayload) other;
        return this.sequenceNumber == publishAnalyticPayload.sequenceNumber && this.maxWindowSecond == publishAnalyticPayload.maxWindowSecond && this.joined_at == publishAnalyticPayload.joined_at && AbstractC22676k.m65745e(this.video, publishAnalyticPayload.video) && AbstractC22676k.m65745e(this.audio, publishAnalyticPayload.audio) && this.batteryPercentage == publishAnalyticPayload.batteryPercentage;
    }

    public final List<AudioAnalytics> getAudio() {
        return this.audio;
    }

    public final int getBatteryPercentage() {
        return this.batteryPercentage;
    }

    public final long getJoined_at() {
        return this.joined_at;
    }

    public final int getMaxWindowSecond() {
        return this.maxWindowSecond;
    }

    public final int getSequenceNumber() {
        return this.sequenceNumber;
    }

    public final List<VideoAnalytics> getVideo() {
        return this.video;
    }

    public int hashCode() {
        return Integer.hashCode(this.batteryPercentage) + AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11266d.m30451e(AbstractC11266d.m30448b(this.maxWindowSecond, Integer.hashCode(this.sequenceNumber) * 31, 31), this.joined_at, 31), 31, this.video), 31, this.audio);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("PublishAnalyticPayload(sequenceNumber=");
        sb4.append(this.sequenceNumber);
        sb4.append(", maxWindowSecond=");
        sb4.append(this.maxWindowSecond);
        sb4.append(", joined_at=");
        sb4.append(this.joined_at);
        sb4.append(", video=");
        sb4.append(this.video);
        sb4.append(", audio=");
        sb4.append(this.audio);
        sb4.append(", batteryPercentage=");
        return AbstractC11895b.m31999r(sb4, this.batteryPercentage, ')');
    }

    public /* synthetic */ PublishAnalyticPayload(int i13, int i14, long j7, List list, List list2, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, i14, j7, (i16 & 8) != 0 ? C25271y.f99162w : list, list2, i15);
    }
}
