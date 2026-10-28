package io.getstream.android.video.generated.models;

import java.util.List;
import java.util.Map;
import m83.C25272z;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u001c\b\u0003\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0007HÆ\u0003JI\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u001c\b\u0003\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR%\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/android/video/generated/models/ParticipantSeriesSubscriptionTrackMetrics;", "", "publisherUserId", "", "publisherName", "publisherUserSessionId", "tracks", "", "", "Lio/getstream/android/video/generated/models/ParticipantSeriesTrackMetrics;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getPublisherName", "()Ljava/lang/String;", "getPublisherUserId", "getPublisherUserSessionId", "getTracks", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class ParticipantSeriesSubscriptionTrackMetrics {
    private final String publisherName;
    private final String publisherUserId;
    private final String publisherUserSessionId;
    private final Map<String, List<ParticipantSeriesTrackMetrics>> tracks;

    /* JADX WARN: Multi-variable type inference failed */
    public ParticipantSeriesSubscriptionTrackMetrics(@InterfaceC30731q(name = "publisher_user_id") String publisherUserId, @InterfaceC30731q(name = "publisher_name") String str, @InterfaceC30731q(name = "publisher_user_session_id") String str2, @InterfaceC30731q(name = "tracks") Map<String, ? extends List<ParticipantSeriesTrackMetrics>> map) {
        AbstractC22676k.m65750j(publisherUserId, "publisherUserId");
        this.publisherUserId = publisherUserId;
        this.publisherName = str;
        this.publisherUserSessionId = str2;
        this.tracks = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ParticipantSeriesSubscriptionTrackMetrics copy$default(ParticipantSeriesSubscriptionTrackMetrics participantSeriesSubscriptionTrackMetrics, String str, String str2, String str3, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = participantSeriesSubscriptionTrackMetrics.publisherUserId;
        }
        if ((i13 & 2) != 0) {
            str2 = participantSeriesSubscriptionTrackMetrics.publisherName;
        }
        if ((i13 & 4) != 0) {
            str3 = participantSeriesSubscriptionTrackMetrics.publisherUserSessionId;
        }
        if ((i13 & 8) != 0) {
            map = participantSeriesSubscriptionTrackMetrics.tracks;
        }
        return participantSeriesSubscriptionTrackMetrics.copy(str, str2, str3, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPublisherUserId() {
        return this.publisherUserId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPublisherName() {
        return this.publisherName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPublisherUserSessionId() {
        return this.publisherUserSessionId;
    }

    public final Map<String, List<ParticipantSeriesTrackMetrics>> component4() {
        return this.tracks;
    }

    public final ParticipantSeriesSubscriptionTrackMetrics copy(@InterfaceC30731q(name = "publisher_user_id") String publisherUserId, @InterfaceC30731q(name = "publisher_name") String publisherName, @InterfaceC30731q(name = "publisher_user_session_id") String publisherUserSessionId, @InterfaceC30731q(name = "tracks") Map<String, ? extends List<ParticipantSeriesTrackMetrics>> tracks) {
        AbstractC22676k.m65750j(publisherUserId, "publisherUserId");
        return new ParticipantSeriesSubscriptionTrackMetrics(publisherUserId, publisherName, publisherUserSessionId, tracks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParticipantSeriesSubscriptionTrackMetrics)) {
            return false;
        }
        ParticipantSeriesSubscriptionTrackMetrics participantSeriesSubscriptionTrackMetrics = (ParticipantSeriesSubscriptionTrackMetrics) other;
        return AbstractC22676k.m65745e(this.publisherUserId, participantSeriesSubscriptionTrackMetrics.publisherUserId) && AbstractC22676k.m65745e(this.publisherName, participantSeriesSubscriptionTrackMetrics.publisherName) && AbstractC22676k.m65745e(this.publisherUserSessionId, participantSeriesSubscriptionTrackMetrics.publisherUserSessionId) && AbstractC22676k.m65745e(this.tracks, participantSeriesSubscriptionTrackMetrics.tracks);
    }

    public final String getPublisherName() {
        return this.publisherName;
    }

    public final String getPublisherUserId() {
        return this.publisherUserId;
    }

    public final String getPublisherUserSessionId() {
        return this.publisherUserSessionId;
    }

    public final Map<String, List<ParticipantSeriesTrackMetrics>> getTracks() {
        return this.tracks;
    }

    public int hashCode() {
        int iHashCode = this.publisherUserId.hashCode() * 31;
        String str = this.publisherName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.publisherUserSessionId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, List<ParticipantSeriesTrackMetrics>> map = this.tracks;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        String str = this.publisherUserId;
        String str2 = this.publisherName;
        return AbstractC30007c.m91842l(AbstractC11895b.m32001t("ParticipantSeriesSubscriptionTrackMetrics(publisherUserId=", str, ", publisherName=", str2, ", publisherUserSessionId="), this.publisherUserSessionId, ", tracks=", this.tracks, ")");
    }

    public /* synthetic */ ParticipantSeriesSubscriptionTrackMetrics(String str, String str2, String str3, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? C25272z.f99163w : map);
    }
}
