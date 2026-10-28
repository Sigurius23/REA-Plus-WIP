package io.getstream.android.video.generated.models;

import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003Ju\u0010+\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u00062"}, m65681d2 = {"Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;", "", "callId", "", "callSessionId", "callType", AttachmentExtensionsKt.EXTRA_DURATION, "userId", "userSessionId", "publisher", "Lio/getstream/android/video/generated/models/ParticipantSeriesPublisherStats;", "subscriber", "Lio/getstream/android/video/generated/models/ParticipantSeriesSubscriberStats;", "timeframe", "Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;", UserState.Sources.USER, "Lio/getstream/android/video/generated/models/ParticipantSeriesUserStats;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/ParticipantSeriesPublisherStats;Lio/getstream/android/video/generated/models/ParticipantSeriesSubscriberStats;Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;Lio/getstream/android/video/generated/models/ParticipantSeriesUserStats;)V", "getCallId", "()Ljava/lang/String;", "getCallSessionId", "getCallType", "getDuration", "getPublisher", "()Lio/getstream/android/video/generated/models/ParticipantSeriesPublisherStats;", "getSubscriber", "()Lio/getstream/android/video/generated/models/ParticipantSeriesSubscriberStats;", "getTimeframe", "()Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;", "getUser", "()Lio/getstream/android/video/generated/models/ParticipantSeriesUserStats;", "getUserId", "getUserSessionId", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class GetCallSessionParticipantStatsDetailsResponse {
    private final String callId;
    private final String callSessionId;
    private final String callType;
    private final String duration;
    private final ParticipantSeriesPublisherStats publisher;
    private final ParticipantSeriesSubscriberStats subscriber;
    private final ParticipantSeriesTimeframe timeframe;
    private final ParticipantSeriesUserStats user;
    private final String userId;
    private final String userSessionId;

    public GetCallSessionParticipantStatsDetailsResponse(@InterfaceC30731q(name = "call_id") String callId, @InterfaceC30731q(name = "call_session_id") String callSessionId, @InterfaceC30731q(name = "call_type") String callType, @InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = "user_id") String userId, @InterfaceC30731q(name = "user_session_id") String userSessionId, @InterfaceC30731q(name = "publisher") ParticipantSeriesPublisherStats participantSeriesPublisherStats, @InterfaceC30731q(name = "subscriber") ParticipantSeriesSubscriberStats participantSeriesSubscriberStats, @InterfaceC30731q(name = "timeframe") ParticipantSeriesTimeframe participantSeriesTimeframe, @InterfaceC30731q(name = UserState.Sources.USER) ParticipantSeriesUserStats participantSeriesUserStats) {
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(callSessionId, "callSessionId");
        AbstractC22676k.m65750j(callType, "callType");
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(userSessionId, "userSessionId");
        this.callId = callId;
        this.callSessionId = callSessionId;
        this.callType = callType;
        this.duration = duration;
        this.userId = userId;
        this.userSessionId = userSessionId;
        this.publisher = participantSeriesPublisherStats;
        this.subscriber = participantSeriesSubscriberStats;
        this.timeframe = participantSeriesTimeframe;
        this.user = participantSeriesUserStats;
    }

    public static /* synthetic */ GetCallSessionParticipantStatsDetailsResponse copy$default(GetCallSessionParticipantStatsDetailsResponse getCallSessionParticipantStatsDetailsResponse, String str, String str2, String str3, String str4, String str5, String str6, ParticipantSeriesPublisherStats participantSeriesPublisherStats, ParticipantSeriesSubscriberStats participantSeriesSubscriberStats, ParticipantSeriesTimeframe participantSeriesTimeframe, ParticipantSeriesUserStats participantSeriesUserStats, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = getCallSessionParticipantStatsDetailsResponse.callId;
        }
        if ((i13 & 2) != 0) {
            str2 = getCallSessionParticipantStatsDetailsResponse.callSessionId;
        }
        if ((i13 & 4) != 0) {
            str3 = getCallSessionParticipantStatsDetailsResponse.callType;
        }
        if ((i13 & 8) != 0) {
            str4 = getCallSessionParticipantStatsDetailsResponse.duration;
        }
        if ((i13 & 16) != 0) {
            str5 = getCallSessionParticipantStatsDetailsResponse.userId;
        }
        if ((i13 & 32) != 0) {
            str6 = getCallSessionParticipantStatsDetailsResponse.userSessionId;
        }
        if ((i13 & 64) != 0) {
            participantSeriesPublisherStats = getCallSessionParticipantStatsDetailsResponse.publisher;
        }
        if ((i13 & 128) != 0) {
            participantSeriesSubscriberStats = getCallSessionParticipantStatsDetailsResponse.subscriber;
        }
        if ((i13 & 256) != 0) {
            participantSeriesTimeframe = getCallSessionParticipantStatsDetailsResponse.timeframe;
        }
        if ((i13 & 512) != 0) {
            participantSeriesUserStats = getCallSessionParticipantStatsDetailsResponse.user;
        }
        ParticipantSeriesTimeframe participantSeriesTimeframe2 = participantSeriesTimeframe;
        ParticipantSeriesUserStats participantSeriesUserStats2 = participantSeriesUserStats;
        ParticipantSeriesPublisherStats participantSeriesPublisherStats2 = participantSeriesPublisherStats;
        ParticipantSeriesSubscriberStats participantSeriesSubscriberStats2 = participantSeriesSubscriberStats;
        String str7 = str5;
        String str8 = str6;
        return getCallSessionParticipantStatsDetailsResponse.copy(str, str2, str3, str4, str7, str8, participantSeriesPublisherStats2, participantSeriesSubscriberStats2, participantSeriesTimeframe2, participantSeriesUserStats2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final ParticipantSeriesUserStats getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCallSessionId() {
        return this.callSessionId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCallType() {
        return this.callType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUserSessionId() {
        return this.userSessionId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ParticipantSeriesPublisherStats getPublisher() {
        return this.publisher;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ParticipantSeriesSubscriberStats getSubscriber() {
        return this.subscriber;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ParticipantSeriesTimeframe getTimeframe() {
        return this.timeframe;
    }

    public final GetCallSessionParticipantStatsDetailsResponse copy(@InterfaceC30731q(name = "call_id") String callId, @InterfaceC30731q(name = "call_session_id") String callSessionId, @InterfaceC30731q(name = "call_type") String callType, @InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = "user_id") String userId, @InterfaceC30731q(name = "user_session_id") String userSessionId, @InterfaceC30731q(name = "publisher") ParticipantSeriesPublisherStats publisher, @InterfaceC30731q(name = "subscriber") ParticipantSeriesSubscriberStats subscriber, @InterfaceC30731q(name = "timeframe") ParticipantSeriesTimeframe timeframe, @InterfaceC30731q(name = UserState.Sources.USER) ParticipantSeriesUserStats user) {
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(callSessionId, "callSessionId");
        AbstractC22676k.m65750j(callType, "callType");
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(userSessionId, "userSessionId");
        return new GetCallSessionParticipantStatsDetailsResponse(callId, callSessionId, callType, duration, userId, userSessionId, publisher, subscriber, timeframe, user);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetCallSessionParticipantStatsDetailsResponse)) {
            return false;
        }
        GetCallSessionParticipantStatsDetailsResponse getCallSessionParticipantStatsDetailsResponse = (GetCallSessionParticipantStatsDetailsResponse) other;
        return AbstractC22676k.m65745e(this.callId, getCallSessionParticipantStatsDetailsResponse.callId) && AbstractC22676k.m65745e(this.callSessionId, getCallSessionParticipantStatsDetailsResponse.callSessionId) && AbstractC22676k.m65745e(this.callType, getCallSessionParticipantStatsDetailsResponse.callType) && AbstractC22676k.m65745e(this.duration, getCallSessionParticipantStatsDetailsResponse.duration) && AbstractC22676k.m65745e(this.userId, getCallSessionParticipantStatsDetailsResponse.userId) && AbstractC22676k.m65745e(this.userSessionId, getCallSessionParticipantStatsDetailsResponse.userSessionId) && AbstractC22676k.m65745e(this.publisher, getCallSessionParticipantStatsDetailsResponse.publisher) && AbstractC22676k.m65745e(this.subscriber, getCallSessionParticipantStatsDetailsResponse.subscriber) && AbstractC22676k.m65745e(this.timeframe, getCallSessionParticipantStatsDetailsResponse.timeframe) && AbstractC22676k.m65745e(this.user, getCallSessionParticipantStatsDetailsResponse.user);
    }

    public final String getCallId() {
        return this.callId;
    }

    public final String getCallSessionId() {
        return this.callSessionId;
    }

    public final String getCallType() {
        return this.callType;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final ParticipantSeriesPublisherStats getPublisher() {
        return this.publisher;
    }

    public final ParticipantSeriesSubscriberStats getSubscriber() {
        return this.subscriber;
    }

    public final ParticipantSeriesTimeframe getTimeframe() {
        return this.timeframe;
    }

    public final ParticipantSeriesUserStats getUser() {
        return this.user;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserSessionId() {
        return this.userSessionId;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.callId.hashCode() * 31, 31, this.callSessionId), 31, this.callType), 31, this.duration), 31, this.userId), 31, this.userSessionId);
        ParticipantSeriesPublisherStats participantSeriesPublisherStats = this.publisher;
        int iHashCode = (iM30450d + (participantSeriesPublisherStats == null ? 0 : participantSeriesPublisherStats.hashCode())) * 31;
        ParticipantSeriesSubscriberStats participantSeriesSubscriberStats = this.subscriber;
        int iHashCode2 = (iHashCode + (participantSeriesSubscriberStats == null ? 0 : participantSeriesSubscriberStats.hashCode())) * 31;
        ParticipantSeriesTimeframe participantSeriesTimeframe = this.timeframe;
        int iHashCode3 = (iHashCode2 + (participantSeriesTimeframe == null ? 0 : participantSeriesTimeframe.hashCode())) * 31;
        ParticipantSeriesUserStats participantSeriesUserStats = this.user;
        return iHashCode3 + (participantSeriesUserStats != null ? participantSeriesUserStats.hashCode() : 0);
    }

    public String toString() {
        String str = this.callId;
        String str2 = this.callSessionId;
        String str3 = this.callType;
        String str4 = this.duration;
        String str5 = this.userId;
        String str6 = this.userSessionId;
        ParticipantSeriesPublisherStats participantSeriesPublisherStats = this.publisher;
        ParticipantSeriesSubscriberStats participantSeriesSubscriberStats = this.subscriber;
        ParticipantSeriesTimeframe participantSeriesTimeframe = this.timeframe;
        ParticipantSeriesUserStats participantSeriesUserStats = this.user;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("GetCallSessionParticipantStatsDetailsResponse(callId=", str, ", callSessionId=", str2, ", callType=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", duration=", str4, ", userId=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", userSessionId=", str6, ", publisher=");
        sbM32001t.append(participantSeriesPublisherStats);
        sbM32001t.append(", subscriber=");
        sbM32001t.append(participantSeriesSubscriberStats);
        sbM32001t.append(", timeframe=");
        sbM32001t.append(participantSeriesTimeframe);
        sbM32001t.append(", user=");
        sbM32001t.append(participantSeriesUserStats);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ GetCallSessionParticipantStatsDetailsResponse(String str, String str2, String str3, String str4, String str5, String str6, ParticipantSeriesPublisherStats participantSeriesPublisherStats, ParticipantSeriesSubscriberStats participantSeriesSubscriberStats, ParticipantSeriesTimeframe participantSeriesTimeframe, ParticipantSeriesUserStats participantSeriesUserStats, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, (i13 & 64) != 0 ? null : participantSeriesPublisherStats, (i13 & 128) != 0 ? null : participantSeriesSubscriberStats, (i13 & 256) != 0 ? null : participantSeriesTimeframe, (i13 & 512) != 0 ? null : participantSeriesUserStats);
    }
}
