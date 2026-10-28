package io.getstream.android.video.generated.models;

import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.List;
import jg3.C21682i;
import m83.C25271y;
import p000.AbstractC11266d;
import p441qx.InterfaceC30731q;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0003\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014J\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0080\u0001\u0010!\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0014J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b\u0005\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b\u0006\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b/\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b0\u0010\u0014R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b1\u0010\u0014R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b3\u0010\u001eR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\b5\u0010 ¨\u00066"}, m65681d2 = {"Lio/getstream/android/video/generated/models/GetCallParticipantSessionMetricsResponse;", "", "", AttachmentExtensionsKt.EXTRA_DURATION, "", "isPublisher", "isSubscriber", "Ljg3/i;", "joinedAt", "publisherType", "userId", "userSessionId", "", "Lio/getstream/android/video/generated/models/PublishedTrackMetrics;", "publishedTracks", "Lio/getstream/android/video/generated/models/SessionClient;", "client", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/SessionClient;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "component4", "()Ljg3/i;", "component5", "component6", "component7", "component8", "()Ljava/util/List;", "component9", "()Lio/getstream/android/video/generated/models/SessionClient;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/SessionClient;)Lio/getstream/android/video/generated/models/GetCallParticipantSessionMetricsResponse;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDuration", "Ljava/lang/Boolean;", "Ljg3/i;", "getJoinedAt", "getPublisherType", "getUserId", "getUserSessionId", "Ljava/util/List;", "getPublishedTracks", "Lio/getstream/android/video/generated/models/SessionClient;", "getClient", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class GetCallParticipantSessionMetricsResponse {
    private final SessionClient client;
    private final String duration;
    private final Boolean isPublisher;
    private final Boolean isSubscriber;
    private final C21682i joinedAt;
    private final List<PublishedTrackMetrics> publishedTracks;
    private final String publisherType;
    private final String userId;
    private final String userSessionId;

    public GetCallParticipantSessionMetricsResponse(@InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = "is_publisher") Boolean bool, @InterfaceC30731q(name = "is_subscriber") Boolean bool2, @InterfaceC30731q(name = "joined_at") C21682i c21682i, @InterfaceC30731q(name = "publisher_type") String str, @InterfaceC30731q(name = "user_id") String str2, @InterfaceC30731q(name = "user_session_id") String str3, @InterfaceC30731q(name = "published_tracks") List<PublishedTrackMetrics> list, @InterfaceC30731q(name = "client") SessionClient sessionClient) {
        AbstractC22676k.m65750j(duration, "duration");
        this.duration = duration;
        this.isPublisher = bool;
        this.isSubscriber = bool2;
        this.joinedAt = c21682i;
        this.publisherType = str;
        this.userId = str2;
        this.userSessionId = str3;
        this.publishedTracks = list;
        this.client = sessionClient;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetCallParticipantSessionMetricsResponse copy$default(GetCallParticipantSessionMetricsResponse getCallParticipantSessionMetricsResponse, String str, Boolean bool, Boolean bool2, C21682i c21682i, String str2, String str3, String str4, List list, SessionClient sessionClient, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = getCallParticipantSessionMetricsResponse.duration;
        }
        if ((i13 & 2) != 0) {
            bool = getCallParticipantSessionMetricsResponse.isPublisher;
        }
        if ((i13 & 4) != 0) {
            bool2 = getCallParticipantSessionMetricsResponse.isSubscriber;
        }
        if ((i13 & 8) != 0) {
            c21682i = getCallParticipantSessionMetricsResponse.joinedAt;
        }
        if ((i13 & 16) != 0) {
            str2 = getCallParticipantSessionMetricsResponse.publisherType;
        }
        if ((i13 & 32) != 0) {
            str3 = getCallParticipantSessionMetricsResponse.userId;
        }
        if ((i13 & 64) != 0) {
            str4 = getCallParticipantSessionMetricsResponse.userSessionId;
        }
        if ((i13 & 128) != 0) {
            list = getCallParticipantSessionMetricsResponse.publishedTracks;
        }
        if ((i13 & 256) != 0) {
            sessionClient = getCallParticipantSessionMetricsResponse.client;
        }
        List list2 = list;
        SessionClient sessionClient2 = sessionClient;
        String str5 = str3;
        String str6 = str4;
        String str7 = str2;
        Boolean bool3 = bool2;
        return getCallParticipantSessionMetricsResponse.copy(str, bool, bool3, c21682i, str7, str5, str6, list2, sessionClient2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIsPublisher() {
        return this.isPublisher;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getIsSubscriber() {
        return this.isSubscriber;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final C21682i getJoinedAt() {
        return this.joinedAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPublisherType() {
        return this.publisherType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUserSessionId() {
        return this.userSessionId;
    }

    public final List<PublishedTrackMetrics> component8() {
        return this.publishedTracks;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final SessionClient getClient() {
        return this.client;
    }

    public final GetCallParticipantSessionMetricsResponse copy(@InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = "is_publisher") Boolean isPublisher, @InterfaceC30731q(name = "is_subscriber") Boolean isSubscriber, @InterfaceC30731q(name = "joined_at") C21682i joinedAt, @InterfaceC30731q(name = "publisher_type") String publisherType, @InterfaceC30731q(name = "user_id") String userId, @InterfaceC30731q(name = "user_session_id") String userSessionId, @InterfaceC30731q(name = "published_tracks") List<PublishedTrackMetrics> publishedTracks, @InterfaceC30731q(name = "client") SessionClient client) {
        AbstractC22676k.m65750j(duration, "duration");
        return new GetCallParticipantSessionMetricsResponse(duration, isPublisher, isSubscriber, joinedAt, publisherType, userId, userSessionId, publishedTracks, client);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetCallParticipantSessionMetricsResponse)) {
            return false;
        }
        GetCallParticipantSessionMetricsResponse getCallParticipantSessionMetricsResponse = (GetCallParticipantSessionMetricsResponse) other;
        return AbstractC22676k.m65745e(this.duration, getCallParticipantSessionMetricsResponse.duration) && AbstractC22676k.m65745e(this.isPublisher, getCallParticipantSessionMetricsResponse.isPublisher) && AbstractC22676k.m65745e(this.isSubscriber, getCallParticipantSessionMetricsResponse.isSubscriber) && AbstractC22676k.m65745e(this.joinedAt, getCallParticipantSessionMetricsResponse.joinedAt) && AbstractC22676k.m65745e(this.publisherType, getCallParticipantSessionMetricsResponse.publisherType) && AbstractC22676k.m65745e(this.userId, getCallParticipantSessionMetricsResponse.userId) && AbstractC22676k.m65745e(this.userSessionId, getCallParticipantSessionMetricsResponse.userSessionId) && AbstractC22676k.m65745e(this.publishedTracks, getCallParticipantSessionMetricsResponse.publishedTracks) && AbstractC22676k.m65745e(this.client, getCallParticipantSessionMetricsResponse.client);
    }

    public final SessionClient getClient() {
        return this.client;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final C21682i getJoinedAt() {
        return this.joinedAt;
    }

    public final List<PublishedTrackMetrics> getPublishedTracks() {
        return this.publishedTracks;
    }

    public final String getPublisherType() {
        return this.publisherType;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserSessionId() {
        return this.userSessionId;
    }

    public int hashCode() {
        int iHashCode = this.duration.hashCode() * 31;
        Boolean bool = this.isPublisher;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isSubscriber;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        C21682i c21682i = this.joinedAt;
        int iHashCode4 = (iHashCode3 + (c21682i == null ? 0 : c21682i.hashCode())) * 31;
        String str = this.publisherType;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userId;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userSessionId;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<PublishedTrackMetrics> list = this.publishedTracks;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        SessionClient sessionClient = this.client;
        return iHashCode8 + (sessionClient != null ? sessionClient.hashCode() : 0);
    }

    public final Boolean isPublisher() {
        return this.isPublisher;
    }

    public final Boolean isSubscriber() {
        return this.isSubscriber;
    }

    public String toString() {
        String str = this.duration;
        Boolean bool = this.isPublisher;
        Boolean bool2 = this.isSubscriber;
        C21682i c21682i = this.joinedAt;
        String str2 = this.publisherType;
        String str3 = this.userId;
        String str4 = this.userSessionId;
        List<PublishedTrackMetrics> list = this.publishedTracks;
        SessionClient sessionClient = this.client;
        StringBuilder sb4 = new StringBuilder("GetCallParticipantSessionMetricsResponse(duration=");
        sb4.append(str);
        sb4.append(", isPublisher=");
        sb4.append(bool);
        sb4.append(", isSubscriber=");
        sb4.append(bool2);
        sb4.append(", joinedAt=");
        sb4.append(c21682i);
        sb4.append(", publisherType=");
        AbstractC11266d.m30444B(sb4, str2, ", userId=", str3, ", userSessionId=");
        AbstractC36095b.m114694v(str4, ", publishedTracks=", ", client=", sb4, list);
        sb4.append(sessionClient);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ GetCallParticipantSessionMetricsResponse(String str, Boolean bool, Boolean bool2, C21682i c21682i, String str2, String str3, String str4, List list, SessionClient sessionClient, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : bool, (i13 & 4) != 0 ? null : bool2, (i13 & 8) != 0 ? null : c21682i, (i13 & 16) != 0 ? null : str2, (i13 & 32) != 0 ? null : str3, (i13 & 64) != 0 ? null : str4, (i13 & 128) != 0 ? C25271y.f99162w : list, (i13 & 256) != 0 ? null : sessionClient);
    }
}
