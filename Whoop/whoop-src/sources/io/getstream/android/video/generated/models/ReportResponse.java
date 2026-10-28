package io.getstream.android.video.generated.models;

import androidx.core.app.NotificationCompat;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m65681d2 = {"Lio/getstream/android/video/generated/models/ReportResponse;", "", NotificationCompat.CATEGORY_CALL, "Lio/getstream/android/video/generated/models/CallReportResponse;", "participants", "Lio/getstream/android/video/generated/models/ParticipantReportResponse;", "userRatings", "Lio/getstream/android/video/generated/models/UserRatingReportResponse;", "(Lio/getstream/android/video/generated/models/CallReportResponse;Lio/getstream/android/video/generated/models/ParticipantReportResponse;Lio/getstream/android/video/generated/models/UserRatingReportResponse;)V", "getCall", "()Lio/getstream/android/video/generated/models/CallReportResponse;", "getParticipants", "()Lio/getstream/android/video/generated/models/ParticipantReportResponse;", "getUserRatings", "()Lio/getstream/android/video/generated/models/UserRatingReportResponse;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class ReportResponse {
    private final CallReportResponse call;
    private final ParticipantReportResponse participants;
    private final UserRatingReportResponse userRatings;

    public ReportResponse(@InterfaceC30731q(name = NotificationCompat.CATEGORY_CALL) CallReportResponse call, @InterfaceC30731q(name = "participants") ParticipantReportResponse participants, @InterfaceC30731q(name = "user_ratings") UserRatingReportResponse userRatings) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(participants, "participants");
        AbstractC22676k.m65750j(userRatings, "userRatings");
        this.call = call;
        this.participants = participants;
        this.userRatings = userRatings;
    }

    public static /* synthetic */ ReportResponse copy$default(ReportResponse reportResponse, CallReportResponse callReportResponse, ParticipantReportResponse participantReportResponse, UserRatingReportResponse userRatingReportResponse, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            callReportResponse = reportResponse.call;
        }
        if ((i13 & 2) != 0) {
            participantReportResponse = reportResponse.participants;
        }
        if ((i13 & 4) != 0) {
            userRatingReportResponse = reportResponse.userRatings;
        }
        return reportResponse.copy(callReportResponse, participantReportResponse, userRatingReportResponse);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CallReportResponse getCall() {
        return this.call;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ParticipantReportResponse getParticipants() {
        return this.participants;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UserRatingReportResponse getUserRatings() {
        return this.userRatings;
    }

    public final ReportResponse copy(@InterfaceC30731q(name = NotificationCompat.CATEGORY_CALL) CallReportResponse call, @InterfaceC30731q(name = "participants") ParticipantReportResponse participants, @InterfaceC30731q(name = "user_ratings") UserRatingReportResponse userRatings) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(participants, "participants");
        AbstractC22676k.m65750j(userRatings, "userRatings");
        return new ReportResponse(call, participants, userRatings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportResponse)) {
            return false;
        }
        ReportResponse reportResponse = (ReportResponse) other;
        return AbstractC22676k.m65745e(this.call, reportResponse.call) && AbstractC22676k.m65745e(this.participants, reportResponse.participants) && AbstractC22676k.m65745e(this.userRatings, reportResponse.userRatings);
    }

    public final CallReportResponse getCall() {
        return this.call;
    }

    public final ParticipantReportResponse getParticipants() {
        return this.participants;
    }

    public final UserRatingReportResponse getUserRatings() {
        return this.userRatings;
    }

    public int hashCode() {
        return this.userRatings.hashCode() + ((this.participants.hashCode() + (this.call.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "ReportResponse(call=" + this.call + ", participants=" + this.participants + ", userRatings=" + this.userRatings + ")";
    }
}
