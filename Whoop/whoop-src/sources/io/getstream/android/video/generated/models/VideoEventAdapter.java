package io.getstream.android.video.generated.models;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import io.getstream.android.video.generated.infrastructure.Serializer;
import io.getstream.chat.android.models.EventType;
import java.io.IOException;
import p441qx.AbstractC30704c0;
import p441qx.InterfaceC30729p;
import p441qx.InterfaceC30738t0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35854l;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/android/video/generated/models/VideoEventAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/android/video/generated/models/VideoEvent;", "<init>", "()V", "", "type", "Ljava/lang/Class;", "getSubclass", "(Ljava/lang/String;)Ljava/lang/Class;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/android/video/generated/models/VideoEvent;", "Lqx/c0;", "writer", "value", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/android/video/generated/models/VideoEvent;)V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class VideoEventAdapter extends JsonAdapter<VideoEvent> {
    private final Class<? extends VideoEvent> getSubclass(String type) {
        switch (type.hashCode()) {
            case -2088332870:
                return !type.equals(EventType.USER_UNBANNED) ? UnsupportedVideoEvent.class : UserUnbannedEvent.class;
            case -2066887773:
                return !type.equals("call.closed_caption") ? UnsupportedVideoEvent.class : ClosedCaptionEvent.class;
            case -2038868466:
                return !type.equals("call.rejected") ? UnsupportedVideoEvent.class : CallRejectedEvent.class;
            case -1741547411:
                return !type.equals("call.frame_recording_failed") ? UnsupportedVideoEvent.class : CallFrameRecordingFailedEvent.class;
            case -1705903548:
                return !type.equals("call.transcription_started") ? UnsupportedVideoEvent.class : CallTranscriptionStartedEvent.class;
            case -1693037680:
                return !type.equals("call.transcription_stopped") ? UnsupportedVideoEvent.class : CallTranscriptionStoppedEvent.class;
            case -1686766008:
                return !type.equals("ingress.started") ? UnsupportedVideoEvent.class : IngressStartedEvent.class;
            case -1673900140:
                return !type.equals("ingress.stopped") ? UnsupportedVideoEvent.class : IngressStoppedEvent.class;
            case -1666044629:
                return !type.equals("call.updated") ? UnsupportedVideoEvent.class : CallUpdatedEvent.class;
            case -1598674906:
                return !type.equals("call.transcription_ready") ? UnsupportedVideoEvent.class : CallTranscriptionReadyEvent.class;
            case -1525152349:
                return !type.equals("call.hls_broadcasting_started") ? UnsupportedVideoEvent.class : CallHLSBroadcastingStartedEvent.class;
            case -1512286481:
                return !type.equals("call.hls_broadcasting_stopped") ? UnsupportedVideoEvent.class : CallHLSBroadcastingStoppedEvent.class;
            case -1408523557:
                return !type.equals("call.hls_broadcasting_failed") ? UnsupportedVideoEvent.class : CallHLSBroadcastingFailedEvent.class;
            case -1349088399:
                return !type.equals("custom") ? UnsupportedVideoEvent.class : CustomVideoEvent.class;
            case -1275597653:
                return !type.equals("call.member_added") ? UnsupportedVideoEvent.class : CallMemberAddedEvent.class;
            case -1233645618:
                return !type.equals("call.blocked_user") ? UnsupportedVideoEvent.class : BlockedUserEvent.class;
            case -1192399199:
                return !type.equals(EventType.USER_BANNED) ? UnsupportedVideoEvent.class : UserBannedEvent.class;
            case -1153364109:
                return !type.equals("call.frame_recording_ready") ? UnsupportedVideoEvent.class : CallFrameRecordingFrameReadyEvent.class;
            case -1117378480:
                return !type.equals("call.moderation_blur") ? UnsupportedVideoEvent.class : CallModerationBlurEvent.class;
            case -1091780679:
                return !type.equals("call.dtmf") ? UnsupportedVideoEvent.class : CallDTMFEvent.class;
            case -1091374144:
                return !type.equals("call.ring") ? UnsupportedVideoEvent.class : CallRingEvent.class;
            case -1065449267:
                return !type.equals("user.deactivated") ? UnsupportedVideoEvent.class : UserDeactivatedEvent.class;
            case -1049195388:
                return !type.equals(EventType.USER_PRESENCE_CHANGED) ? UnsupportedVideoEvent.class : UserPresenceChangedEvent.class;
            case -986269202:
                return !type.equals("app.updated") ? UnsupportedVideoEvent.class : AppUpdatedEvent.class;
            case -981514197:
                return !type.equals("call.missed") ? UnsupportedVideoEvent.class : CallMissedEvent.class;
            case -870011482:
                return !type.equals("call.member_updated") ? UnsupportedVideoEvent.class : CallMemberUpdatedEvent.class;
            case -804872635:
                return !type.equals("call.recording_ready") ? UnsupportedVideoEvent.class : CallRecordingReadyEvent.class;
            case -723103354:
                return !type.equals("call.session_participant_count_updated") ? UnsupportedVideoEvent.class : CallSessionParticipantCountsUpdatedEvent.class;
            case -717213450:
                return !type.equals(EventType.USER_DELETED) ? UnsupportedVideoEvent.class : UserDeletedEvent.class;
            case -685751533:
                return !type.equals("call.moderation_warning") ? UnsupportedVideoEvent.class : CallModerationWarningEvent.class;
            case -618823045:
                return !type.equals("call.notification") ? UnsupportedVideoEvent.class : CallNotificationEvent.class;
            case -557080842:
                return !type.equals(EventType.HEALTH_CHECK) ? UnsupportedVideoEvent.class : HealthCheckEvent.class;
            case -523087800:
                return !type.equals("call.session_started") ? UnsupportedVideoEvent.class : CallSessionStartedEvent.class;
            case -513251604:
                return !type.equals("connection.ok") ? UnsupportedVideoEvent.class : ConnectedEvent.class;
            case -486029304:
                return !type.equals("call.stats_report_ready") ? UnsupportedVideoEvent.class : CallStatsReportReadyEvent.class;
            case -452964517:
                return !type.equals("user.reactivated") ? UnsupportedVideoEvent.class : UserReactivatedEvent.class;
            case -415034823:
                return !type.equals("call.rtmp_broadcast_started") ? UnsupportedVideoEvent.class : CallRtmpBroadcastStartedEvent.class;
            case -403059880:
                return !type.equals("call.created") ? UnsupportedVideoEvent.class : CallCreatedEvent.class;
            case -402168955:
                return !type.equals("call.rtmp_broadcast_stopped") ? UnsupportedVideoEvent.class : CallRtmpBroadcastStoppedEvent.class;
            case -301290065:
                return !type.equals("call.permission_request") ? UnsupportedVideoEvent.class : PermissionRequestEvent.class;
            case -203874568:
                return !type.equals(EventType.CONNECTION_ERROR) ? UnsupportedVideoEvent.class : ConnectionErrorEvent.class;
            case -22356880:
                return !type.equals("call.permissions_updated") ? UnsupportedVideoEvent.class : UpdatedCallPermissionsEvent.class;
            case 118848649:
                return !type.equals("call.deleted") ? UnsupportedVideoEvent.class : CallDeletedEvent.class;
            case 260202610:
                return !type.equals("call.closed_captions_started") ? UnsupportedVideoEvent.class : CallClosedCaptionsStartedEvent.class;
            case 273068478:
                return !type.equals("call.closed_captions_stopped") ? UnsupportedVideoEvent.class : CallClosedCaptionsStoppedEvent.class;
            case 273276135:
                return !type.equals("call.unblocked_user") ? UnsupportedVideoEvent.class : UnblockedUserEvent.class;
            case 311636524:
                return !type.equals("call.closed_captions_failed") ? UnsupportedVideoEvent.class : CallClosedCaptionsFailedEvent.class;
            case 329405839:
                return !type.equals("ingress.error") ? UnsupportedVideoEvent.class : IngressErrorEvent.class;
            case 456254795:
                return !type.equals("call.member_removed") ? UnsupportedVideoEvent.class : CallMemberRemovedEvent.class;
            case 471753691:
                return !type.equals("call.recording_failed") ? UnsupportedVideoEvent.class : CallRecordingFailedEvent.class;
            case 515273514:
                return !type.equals("call.ended") ? UnsupportedVideoEvent.class : CallEndedEvent.class;
            case 559057416:
                return !type.equals("call.member_updated_permission") ? UnsupportedVideoEvent.class : CallMemberUpdatedPermissionEvent.class;
            case 667201964:
                return !type.equals("call.session_participant_left") ? UnsupportedVideoEvent.class : CallSessionParticipantLeftEvent.class;
            case 718070071:
                return !type.equals("call.accepted") ? UnsupportedVideoEvent.class : CallAcceptedEvent.class;
            case 928867491:
                return !type.equals("call.recording_started") ? UnsupportedVideoEvent.class : CallRecordingStartedEvent.class;
            case 941733359:
                return !type.equals("call.recording_stopped") ? UnsupportedVideoEvent.class : CallRecordingStoppedEvent.class;
            case 1018619326:
                return !type.equals("call.live_started") ? UnsupportedVideoEvent.class : CallLiveStartedEvent.class;
            case 1036010065:
                return !type.equals("call.frame_recording_started") ? UnsupportedVideoEvent.class : CallFrameRecordingStartedEvent.class;
            case 1048875933:
                return !type.equals("call.frame_recording_stopped") ? UnsupportedVideoEvent.class : CallFrameRecordingStoppedEvent.class;
            case 1183024046:
                return !type.equals("call.session_participant_joined") ? UnsupportedVideoEvent.class : CallSessionParticipantJoinedEvent.class;
            case 1206460481:
                return !type.equals("call.session_ended") ? UnsupportedVideoEvent.class : CallSessionEndedEvent.class;
            case 1350959829:
                return !type.equals("call.kicked_user") ? UnsupportedVideoEvent.class : KickedUserEvent.class;
            case 1365209114:
                return !type.equals("call.reaction_new") ? UnsupportedVideoEvent.class : CallReactionEvent.class;
            case 1633687066:
                return !type.equals("call.transcription_failed") ? UnsupportedVideoEvent.class : CallTranscriptionFailedEvent.class;
            case 1731402119:
                return !type.equals("call.user_muted") ? UnsupportedVideoEvent.class : CallUserMutedEvent.class;
            case 1792860568:
                return !type.equals(EventType.USER_UPDATED) ? UnsupportedVideoEvent.class : UserUpdatedEvent.class;
            case 2039304741:
                return !type.equals("call.user_feedback_submitted") ? UnsupportedVideoEvent.class : CallUserFeedbackSubmittedEvent.class;
            case 2090969989:
                return !type.equals("call.rtmp_broadcast_failed") ? UnsupportedVideoEvent.class : CallRtmpBroadcastFailedEvent.class;
            default:
                return UnsupportedVideoEvent.class;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    @InterfaceC30729p
    public VideoEvent fromJson(JsonReader reader) throws IOException {
        AbstractC22676k.m65750j(reader, "reader");
        JsonReader jsonReaderMo16732m = reader.mo16732m();
        reader.beginObject();
        String strNextString = null;
        while (reader.hasNext()) {
            if (AbstractC22676k.m65745e(reader.nextName(), "type")) {
                strNextString = reader.nextString();
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (strNextString == null) {
            return null;
        }
        try {
            VideoEvent videoEvent = (VideoEvent) Serializer.getMoshi().m94398a(getSubclass(strNextString)).fromJson(jsonReaderMo16732m);
            jsonReaderMo16732m.close();
            return videoEvent;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC35854l.m113829i(jsonReaderMo16732m, th3);
                throw th4;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    @InterfaceC30738t0
    public void toJson(AbstractC30704c0 writer, VideoEvent value) {
        AbstractC22676k.m65750j(writer, "writer");
        throw new UnsupportedOperationException("toJson not implemented");
    }
}
