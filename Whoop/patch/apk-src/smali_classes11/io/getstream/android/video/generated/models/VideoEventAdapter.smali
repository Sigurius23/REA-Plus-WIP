.class public final Lio/getstream/android/video/generated/models/VideoEventAdapter;
.super Lcom/squareup/moshi/JsonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/moshi/JsonAdapter<",
        "Lio/getstream/android/video/generated/models/VideoEvent;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001f\u0010\u0008\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0017\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/VideoEventAdapter;",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lio/getstream/android/video/generated/models/VideoEvent;",
        "<init>",
        "()V",
        "",
        "type",
        "Ljava/lang/Class;",
        "getSubclass",
        "(Ljava/lang/String;)Ljava/lang/Class;",
        "Lcom/squareup/moshi/JsonReader;",
        "reader",
        "fromJson",
        "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/android/video/generated/models/VideoEvent;",
        "Lqx/c0;",
        "writer",
        "value",
        "Ll83/a0;",
        "toJson",
        "(Lqx/c0;Lio/getstream/android/video/generated/models/VideoEvent;)V",
        "stream-video-android-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/squareup/moshi/JsonAdapter;-><init>()V

    return-void
.end method

.method private final getSubclass(Ljava/lang/String;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Class<",
            "+",
            "Lio/getstream/android/video/generated/models/VideoEvent;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "call.rtmp_broadcast_failed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_0

    :cond_0
    const-class p1, Lio/getstream/android/video/generated/models/CallRtmpBroadcastFailedEvent;

    return-object p1

    :sswitch_1
    const-string v0, "call.user_feedback_submitted"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto/16 :goto_0

    :cond_1
    const-class p1, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;

    return-object p1

    :sswitch_2
    const-string v0, "user.updated"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto/16 :goto_0

    :cond_2
    const-class p1, Lio/getstream/android/video/generated/models/UserUpdatedEvent;

    return-object p1

    :sswitch_3
    const-string v0, "call.user_muted"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto/16 :goto_0

    :cond_3
    const-class p1, Lio/getstream/android/video/generated/models/CallUserMutedEvent;

    return-object p1

    :sswitch_4
    const-string v0, "call.transcription_failed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto/16 :goto_0

    :cond_4
    const-class p1, Lio/getstream/android/video/generated/models/CallTranscriptionFailedEvent;

    return-object p1

    :sswitch_5
    const-string v0, "call.reaction_new"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto/16 :goto_0

    :cond_5
    const-class p1, Lio/getstream/android/video/generated/models/CallReactionEvent;

    return-object p1

    :sswitch_6
    const-string v0, "call.kicked_user"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto/16 :goto_0

    :cond_6
    const-class p1, Lio/getstream/android/video/generated/models/KickedUserEvent;

    return-object p1

    :sswitch_7
    const-string v0, "call.session_ended"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto/16 :goto_0

    :cond_7
    const-class p1, Lio/getstream/android/video/generated/models/CallSessionEndedEvent;

    return-object p1

    :sswitch_8
    const-string v0, "call.session_participant_joined"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto/16 :goto_0

    :cond_8
    const-class p1, Lio/getstream/android/video/generated/models/CallSessionParticipantJoinedEvent;

    return-object p1

    :sswitch_9
    const-string v0, "call.frame_recording_stopped"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto/16 :goto_0

    :cond_9
    const-class p1, Lio/getstream/android/video/generated/models/CallFrameRecordingStoppedEvent;

    return-object p1

    :sswitch_a
    const-string v0, "call.frame_recording_started"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto/16 :goto_0

    :cond_a
    const-class p1, Lio/getstream/android/video/generated/models/CallFrameRecordingStartedEvent;

    return-object p1

    :sswitch_b
    const-string v0, "call.live_started"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto/16 :goto_0

    :cond_b
    const-class p1, Lio/getstream/android/video/generated/models/CallLiveStartedEvent;

    return-object p1

    :sswitch_c
    const-string v0, "call.recording_stopped"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    goto/16 :goto_0

    :cond_c
    const-class p1, Lio/getstream/android/video/generated/models/CallRecordingStoppedEvent;

    return-object p1

    :sswitch_d
    const-string v0, "call.recording_started"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    goto/16 :goto_0

    :cond_d
    const-class p1, Lio/getstream/android/video/generated/models/CallRecordingStartedEvent;

    return-object p1

    :sswitch_e
    const-string v0, "call.accepted"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    goto/16 :goto_0

    :cond_e
    const-class p1, Lio/getstream/android/video/generated/models/CallAcceptedEvent;

    return-object p1

    :sswitch_f
    const-string v0, "call.session_participant_left"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_f

    goto/16 :goto_0

    :cond_f
    const-class p1, Lio/getstream/android/video/generated/models/CallSessionParticipantLeftEvent;

    return-object p1

    :sswitch_10
    const-string v0, "call.member_updated_permission"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    goto/16 :goto_0

    :cond_10
    const-class p1, Lio/getstream/android/video/generated/models/CallMemberUpdatedPermissionEvent;

    return-object p1

    :sswitch_11
    const-string v0, "call.ended"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    goto/16 :goto_0

    :cond_11
    const-class p1, Lio/getstream/android/video/generated/models/CallEndedEvent;

    return-object p1

    :sswitch_12
    const-string v0, "call.recording_failed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_12

    goto/16 :goto_0

    :cond_12
    const-class p1, Lio/getstream/android/video/generated/models/CallRecordingFailedEvent;

    return-object p1

    :sswitch_13
    const-string v0, "call.member_removed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_13

    goto/16 :goto_0

    :cond_13
    const-class p1, Lio/getstream/android/video/generated/models/CallMemberRemovedEvent;

    return-object p1

    :sswitch_14
    const-string v0, "ingress.error"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_14

    goto/16 :goto_0

    :cond_14
    const-class p1, Lio/getstream/android/video/generated/models/IngressErrorEvent;

    return-object p1

    :sswitch_15
    const-string v0, "call.closed_captions_failed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_15

    goto/16 :goto_0

    :cond_15
    const-class p1, Lio/getstream/android/video/generated/models/CallClosedCaptionsFailedEvent;

    return-object p1

    :sswitch_16
    const-string v0, "call.unblocked_user"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_16

    goto/16 :goto_0

    :cond_16
    const-class p1, Lio/getstream/android/video/generated/models/UnblockedUserEvent;

    return-object p1

    :sswitch_17
    const-string v0, "call.closed_captions_stopped"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_17

    goto/16 :goto_0

    :cond_17
    const-class p1, Lio/getstream/android/video/generated/models/CallClosedCaptionsStoppedEvent;

    return-object p1

    :sswitch_18
    const-string v0, "call.closed_captions_started"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_18

    goto/16 :goto_0

    :cond_18
    const-class p1, Lio/getstream/android/video/generated/models/CallClosedCaptionsStartedEvent;

    return-object p1

    :sswitch_19
    const-string v0, "call.deleted"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_19

    goto/16 :goto_0

    :cond_19
    const-class p1, Lio/getstream/android/video/generated/models/CallDeletedEvent;

    return-object p1

    :sswitch_1a
    const-string v0, "call.permissions_updated"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1a

    goto/16 :goto_0

    :cond_1a
    const-class p1, Lio/getstream/android/video/generated/models/UpdatedCallPermissionsEvent;

    return-object p1

    :sswitch_1b
    const-string v0, "connection.error"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1b

    goto/16 :goto_0

    :cond_1b
    const-class p1, Lio/getstream/android/video/generated/models/ConnectionErrorEvent;

    return-object p1

    :sswitch_1c
    const-string v0, "call.permission_request"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1c

    goto/16 :goto_0

    :cond_1c
    const-class p1, Lio/getstream/android/video/generated/models/PermissionRequestEvent;

    return-object p1

    :sswitch_1d
    const-string v0, "call.rtmp_broadcast_stopped"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1d

    goto/16 :goto_0

    :cond_1d
    const-class p1, Lio/getstream/android/video/generated/models/CallRtmpBroadcastStoppedEvent;

    return-object p1

    :sswitch_1e
    const-string v0, "call.created"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1e

    goto/16 :goto_0

    :cond_1e
    const-class p1, Lio/getstream/android/video/generated/models/CallCreatedEvent;

    return-object p1

    :sswitch_1f
    const-string v0, "call.rtmp_broadcast_started"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1f

    goto/16 :goto_0

    :cond_1f
    const-class p1, Lio/getstream/android/video/generated/models/CallRtmpBroadcastStartedEvent;

    return-object p1

    :sswitch_20
    const-string v0, "user.reactivated"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_20

    goto/16 :goto_0

    :cond_20
    const-class p1, Lio/getstream/android/video/generated/models/UserReactivatedEvent;

    return-object p1

    :sswitch_21
    const-string v0, "call.stats_report_ready"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_21

    goto/16 :goto_0

    :cond_21
    const-class p1, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;

    return-object p1

    :sswitch_22
    const-string v0, "connection.ok"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_22

    goto/16 :goto_0

    :cond_22
    const-class p1, Lio/getstream/android/video/generated/models/ConnectedEvent;

    return-object p1

    :sswitch_23
    const-string v0, "call.session_started"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_23

    goto/16 :goto_0

    :cond_23
    const-class p1, Lio/getstream/android/video/generated/models/CallSessionStartedEvent;

    return-object p1

    :sswitch_24
    const-string v0, "health.check"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_24

    goto/16 :goto_0

    :cond_24
    const-class p1, Lio/getstream/android/video/generated/models/HealthCheckEvent;

    return-object p1

    :sswitch_25
    const-string v0, "call.notification"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_25

    goto/16 :goto_0

    :cond_25
    const-class p1, Lio/getstream/android/video/generated/models/CallNotificationEvent;

    return-object p1

    :sswitch_26
    const-string v0, "call.moderation_warning"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_26

    goto/16 :goto_0

    :cond_26
    const-class p1, Lio/getstream/android/video/generated/models/CallModerationWarningEvent;

    return-object p1

    :sswitch_27
    const-string v0, "user.deleted"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_27

    goto/16 :goto_0

    :cond_27
    const-class p1, Lio/getstream/android/video/generated/models/UserDeletedEvent;

    return-object p1

    :sswitch_28
    const-string v0, "call.session_participant_count_updated"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_28

    goto/16 :goto_0

    :cond_28
    const-class p1, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;

    return-object p1

    :sswitch_29
    const-string v0, "call.recording_ready"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_29

    goto/16 :goto_0

    :cond_29
    const-class p1, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent;

    return-object p1

    :sswitch_2a
    const-string v0, "call.member_updated"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2a

    goto/16 :goto_0

    :cond_2a
    const-class p1, Lio/getstream/android/video/generated/models/CallMemberUpdatedEvent;

    return-object p1

    :sswitch_2b
    const-string v0, "call.missed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2b

    goto/16 :goto_0

    :cond_2b
    const-class p1, Lio/getstream/android/video/generated/models/CallMissedEvent;

    return-object p1

    :sswitch_2c
    const-string v0, "app.updated"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2c

    goto/16 :goto_0

    :cond_2c
    const-class p1, Lio/getstream/android/video/generated/models/AppUpdatedEvent;

    return-object p1

    :sswitch_2d
    const-string v0, "user.presence.changed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2d

    goto/16 :goto_0

    :cond_2d
    const-class p1, Lio/getstream/android/video/generated/models/UserPresenceChangedEvent;

    return-object p1

    :sswitch_2e
    const-string v0, "user.deactivated"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2e

    goto/16 :goto_0

    :cond_2e
    const-class p1, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;

    return-object p1

    :sswitch_2f
    const-string v0, "call.ring"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2f

    goto/16 :goto_0

    :cond_2f
    const-class p1, Lio/getstream/android/video/generated/models/CallRingEvent;

    return-object p1

    :sswitch_30
    const-string v0, "call.dtmf"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_30

    goto/16 :goto_0

    :cond_30
    const-class p1, Lio/getstream/android/video/generated/models/CallDTMFEvent;

    return-object p1

    :sswitch_31
    const-string v0, "call.moderation_blur"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_31

    goto/16 :goto_0

    :cond_31
    const-class p1, Lio/getstream/android/video/generated/models/CallModerationBlurEvent;

    return-object p1

    :sswitch_32
    const-string v0, "call.frame_recording_ready"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_32

    goto/16 :goto_0

    :cond_32
    const-class p1, Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;

    return-object p1

    :sswitch_33
    const-string v0, "user.banned"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_33

    goto/16 :goto_0

    :cond_33
    const-class p1, Lio/getstream/android/video/generated/models/UserBannedEvent;

    return-object p1

    :sswitch_34
    const-string v0, "call.blocked_user"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_34

    goto/16 :goto_0

    :cond_34
    const-class p1, Lio/getstream/android/video/generated/models/BlockedUserEvent;

    return-object p1

    :sswitch_35
    const-string v0, "call.member_added"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_35

    goto/16 :goto_0

    :cond_35
    const-class p1, Lio/getstream/android/video/generated/models/CallMemberAddedEvent;

    return-object p1

    :sswitch_36
    const-string v0, "custom"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_36

    goto/16 :goto_0

    :cond_36
    const-class p1, Lio/getstream/android/video/generated/models/CustomVideoEvent;

    return-object p1

    :sswitch_37
    const-string v0, "call.hls_broadcasting_failed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_37

    goto/16 :goto_0

    :cond_37
    const-class p1, Lio/getstream/android/video/generated/models/CallHLSBroadcastingFailedEvent;

    return-object p1

    :sswitch_38
    const-string v0, "call.hls_broadcasting_stopped"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_38

    goto/16 :goto_0

    :cond_38
    const-class p1, Lio/getstream/android/video/generated/models/CallHLSBroadcastingStoppedEvent;

    return-object p1

    :sswitch_39
    const-string v0, "call.hls_broadcasting_started"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_39

    goto/16 :goto_0

    :cond_39
    const-class p1, Lio/getstream/android/video/generated/models/CallHLSBroadcastingStartedEvent;

    return-object p1

    :sswitch_3a
    const-string v0, "call.transcription_ready"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3a

    goto/16 :goto_0

    :cond_3a
    const-class p1, Lio/getstream/android/video/generated/models/CallTranscriptionReadyEvent;

    return-object p1

    :sswitch_3b
    const-string v0, "call.updated"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3b

    goto :goto_0

    :cond_3b
    const-class p1, Lio/getstream/android/video/generated/models/CallUpdatedEvent;

    return-object p1

    :sswitch_3c
    const-string v0, "ingress.stopped"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3c

    goto :goto_0

    :cond_3c
    const-class p1, Lio/getstream/android/video/generated/models/IngressStoppedEvent;

    return-object p1

    :sswitch_3d
    const-string v0, "ingress.started"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3d

    goto :goto_0

    :cond_3d
    const-class p1, Lio/getstream/android/video/generated/models/IngressStartedEvent;

    return-object p1

    :sswitch_3e
    const-string v0, "call.transcription_stopped"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3e

    goto :goto_0

    :cond_3e
    const-class p1, Lio/getstream/android/video/generated/models/CallTranscriptionStoppedEvent;

    return-object p1

    :sswitch_3f
    const-string v0, "call.transcription_started"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3f

    goto :goto_0

    :cond_3f
    const-class p1, Lio/getstream/android/video/generated/models/CallTranscriptionStartedEvent;

    return-object p1

    :sswitch_40
    const-string v0, "call.frame_recording_failed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_40

    goto :goto_0

    :cond_40
    const-class p1, Lio/getstream/android/video/generated/models/CallFrameRecordingFailedEvent;

    return-object p1

    :sswitch_41
    const-string v0, "call.rejected"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_41

    goto :goto_0

    :cond_41
    const-class p1, Lio/getstream/android/video/generated/models/CallRejectedEvent;

    return-object p1

    :sswitch_42
    const-string v0, "call.closed_caption"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_42

    goto :goto_0

    :cond_42
    const-class p1, Lio/getstream/android/video/generated/models/ClosedCaptionEvent;

    return-object p1

    :sswitch_43
    const-string v0, "user.unbanned"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_43

    :goto_0
    const-class p1, Lio/getstream/android/video/generated/models/UnsupportedVideoEvent;

    return-object p1

    :cond_43
    const-class p1, Lio/getstream/android/video/generated/models/UserUnbannedEvent;

    return-object p1

    :sswitch_data_0
    .sparse-switch
        -0x7c796e46 -> :sswitch_43
        -0x7b32345d -> :sswitch_42
        -0x7986a9f2 -> :sswitch_41
        -0x67cde793 -> :sswitch_40
        -0x65ae05bc -> :sswitch_3f
        -0x64e9b470 -> :sswitch_3e
        -0x648a01b8 -> :sswitch_3d
        -0x63c5b06c -> :sswitch_3c
        -0x634dd2d5 -> :sswitch_3b
        -0x5f49d7da -> :sswitch_3a
        -0x5ae7fa5d -> :sswitch_39
        -0x5a23a911 -> :sswitch_38
        -0x53f45d25 -> :sswitch_37
        -0x5069748f -> :sswitch_36
        -0x4c081355 -> :sswitch_35
        -0x4987f032 -> :sswitch_34
        -0x4712915f -> :sswitch_33
        -0x44bef08d -> :sswitch_32
        -0x4299d7b0 -> :sswitch_31
        -0x41134047 -> :sswitch_30
        -0x410d0c40 -> :sswitch_2f
        -0x3f817733 -> :sswitch_2e
        -0x3e89737c -> :sswitch_2d
        -0x3ac94612 -> :sswitch_2c
        -0x3a80b7d5 -> :sswitch_2b
        -0x33db525a -> :sswitch_2a
        -0x2ff961bb -> :sswitch_29
        -0x2b19ae7a -> :sswitch_28
        -0x2abfcf0a -> :sswitch_27
        -0x28dfbced -> :sswitch_26
        -0x24e27d85 -> :sswitch_25
        -0x2134610a -> :sswitch_24
        -0x1f2dafb8 -> :sswitch_23
        -0x1e979914 -> :sswitch_22
        -0x1cf837f8 -> :sswitch_21
        -0x1affb0a5 -> :sswitch_20
        -0x18bcedc7 -> :sswitch_1f
        -0x180634a8 -> :sswitch_1e
        -0x17f89c7b -> :sswitch_1d
        -0x11f55251 -> :sswitch_1c
        -0xc26e108 -> :sswitch_1b
        -0x1552390 -> :sswitch_1a
        0x7157c89 -> :sswitch_19
        0xf826072 -> :sswitch_18
        0x1046b1be -> :sswitch_17
        0x1049dce7 -> :sswitch_16
        0x1293322c -> :sswitch_15
        0x13a2558f -> :sswitch_14
        0x1b31e54b -> :sswitch_13
        0x1c1e63db -> :sswitch_12
        0x1eb6732a -> :sswitch_11
        0x21528a08 -> :sswitch_10
        0x27c4b1ac -> :sswitch_f
        0x2acce137 -> :sswitch_e
        0x375d64a3 -> :sswitch_d
        0x3821b5ef -> :sswitch_c
        0x3cb6e5be -> :sswitch_b
        0x3dc04251 -> :sswitch_a
        0x3e84939d -> :sswitch_9
        0x468383ae -> :sswitch_8
        0x47e92041 -> :sswitch_7
        0x508602d5 -> :sswitch_6
        0x515f701a -> :sswitch_5
        0x6160161a -> :sswitch_4
        0x67331987 -> :sswitch_3
        0x6adce198 -> :sswitch_2
        0x798d5225 -> :sswitch_1
        0x7ca1ab85 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/android/video/generated/models/VideoEvent;
    .locals 5
    .annotation runtime Lqx/p;
    .end annotation

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->m()Lcom/squareup/moshi/JsonReader;

    move-result-object v0

    .line 3
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->beginObject()V

    const/4 v1, 0x0

    move-object v2, v1

    .line 4
    :goto_0
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 5
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->nextName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "type"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 6
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->endObject()V

    if-eqz v2, :cond_2

    .line 9
    :try_start_0
    invoke-static {}, Lio/getstream/android/video/generated/infrastructure/Serializer;->getMoshi()Lqx/l0;

    move-result-object p1

    invoke-direct {p0, v2}, Lio/getstream/android/video/generated/models/VideoEventAdapter;->getSubclass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1, v1}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/android/video/generated/models/VideoEvent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-object p1

    :catchall_0
    move-exception p1

    .line 11
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {v0, p1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1

    :cond_2
    return-object v1
.end method

.method public bridge synthetic fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/getstream/android/video/generated/models/VideoEventAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/android/video/generated/models/VideoEvent;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lqx/c0;Lio/getstream/android/video/generated/models/VideoEvent;)V
    .locals 0
    .annotation runtime Lqx/t0;
    .end annotation

    const-string p2, "writer"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "toJson not implemented"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic toJson(Lqx/c0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lio/getstream/android/video/generated/models/VideoEvent;

    invoke-virtual {p0, p1, p2}, Lio/getstream/android/video/generated/models/VideoEventAdapter;->toJson(Lqx/c0;Lio/getstream/android/video/generated/models/VideoEvent;)V

    return-void
.end method
