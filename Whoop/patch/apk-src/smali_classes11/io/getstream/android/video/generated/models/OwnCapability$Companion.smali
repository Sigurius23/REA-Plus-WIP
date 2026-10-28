.class public final Lio/getstream/android/video/generated/models/OwnCapability$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/android/video/generated/models/OwnCapability;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/OwnCapability$Companion;",
        "",
        "()V",
        "fromString",
        "Lio/getstream/android/video/generated/models/OwnCapability;",
        "s",
        "",
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
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/getstream/android/video/generated/models/OwnCapability$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromString(Ljava/lang/String;)Lio/getstream/android/video/generated/models/OwnCapability;
    .locals 1

    const-string v0, "s"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "remove-call-member"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$RemoveCallMember;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$RemoveCallMember;

    return-object p1

    :sswitch_1
    const-string v0, "send-closed-captions-call"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$SendClosedCaptionsCall;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$SendClosedCaptionsCall;

    return-object p1

    :sswitch_2
    const-string v0, "start-raw-record-call"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$StartRawRecordCall;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$StartRawRecordCall;

    return-object p1

    :sswitch_3
    const-string v0, "end-call"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$EndCall;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$EndCall;

    return-object p1

    :sswitch_4
    const-string v0, "start-closed-captions-call"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_0

    :cond_4
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$StartClosedCaptionsCall;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$StartClosedCaptionsCall;

    return-object p1

    :sswitch_5
    const-string v0, "stop-individual-record-call"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :cond_5
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$StopIndividualRecordCall;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$StopIndividualRecordCall;

    return-object p1

    :sswitch_6
    const-string v0, "join-backstage"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    :cond_6
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$JoinBackstage;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$JoinBackstage;

    return-object p1

    :sswitch_7
    const-string v0, "update-call-permissions"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_0

    :cond_7
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$UpdateCallPermissions;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$UpdateCallPermissions;

    return-object p1

    :sswitch_8
    const-string v0, "start-transcription-call"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_0

    :cond_8
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$StartTranscriptionCall;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$StartTranscriptionCall;

    return-object p1

    :sswitch_9
    const-string v0, "start-individual-record-call"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_0

    :cond_9
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$StartIndividualRecordCall;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$StartIndividualRecordCall;

    return-object p1

    :sswitch_a
    const-string v0, "pin-for-everyone"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_0

    :cond_a
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$PinForEveryone;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$PinForEveryone;

    return-object p1

    :sswitch_b
    const-string v0, "create-reaction"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto/16 :goto_0

    :cond_b
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$CreateReaction;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$CreateReaction;

    return-object p1

    :sswitch_c
    const-string v0, "mute-users"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_0

    :cond_c
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$MuteUsers;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$MuteUsers;

    return-object p1

    :sswitch_d
    const-string v0, "stop-broadcast-call"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto/16 :goto_0

    :cond_d
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$StopBroadcastCall;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$StopBroadcastCall;

    return-object p1

    :sswitch_e
    const-string v0, "enable-noise-cancellation"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto/16 :goto_0

    :cond_e
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$EnableNoiseCancellation;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$EnableNoiseCancellation;

    return-object p1

    :sswitch_f
    const-string v0, "screenshare"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto/16 :goto_0

    :cond_f
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$Screenshare;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$Screenshare;

    return-object p1

    :sswitch_10
    const-string v0, "update-call-settings"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto/16 :goto_0

    :cond_10
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$UpdateCallSettings;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$UpdateCallSettings;

    return-object p1

    :sswitch_11
    const-string v0, "stop-record-call"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto/16 :goto_0

    :cond_11
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$StopRecordCall;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$StopRecordCall;

    return-object p1

    :sswitch_12
    const-string v0, "block-users"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    goto/16 :goto_0

    :cond_12
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$BlockUsers;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$BlockUsers;

    return-object p1

    :sswitch_13
    const-string v0, "create-call"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto/16 :goto_0

    :cond_13
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$CreateCall;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$CreateCall;

    return-object p1

    :sswitch_14
    const-string v0, "join-call"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto/16 :goto_0

    :cond_14
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$JoinCall;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$JoinCall;

    return-object p1

    :sswitch_15
    const-string v0, "change-max-duration"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    goto/16 :goto_0

    :cond_15
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$ChangeMaxDuration;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$ChangeMaxDuration;

    return-object p1

    :sswitch_16
    const-string v0, "send-video"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    goto/16 :goto_0

    :cond_16
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$SendVideo;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$SendVideo;

    return-object p1

    :sswitch_17
    const-string v0, "update-call"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    goto/16 :goto_0

    :cond_17
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$UpdateCall;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$UpdateCall;

    return-object p1

    :sswitch_18
    const-string v0, "send-audio"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    goto/16 :goto_0

    :cond_18
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$SendAudio;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$SendAudio;

    return-object p1

    :sswitch_19
    const-string v0, "stop-transcription-call"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    goto/16 :goto_0

    :cond_19
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$StopTranscriptionCall;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$StopTranscriptionCall;

    return-object p1

    :sswitch_1a
    const-string v0, "start-record-call"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    goto/16 :goto_0

    :cond_1a
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$StartRecordCall;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$StartRecordCall;

    return-object p1

    :sswitch_1b
    const-string v0, "stop-closed-captions-call"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    goto :goto_0

    :cond_1b
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$StopClosedCaptionsCall;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$StopClosedCaptionsCall;

    return-object p1

    :sswitch_1c
    const-string v0, "kick-user"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1c

    goto :goto_0

    :cond_1c
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$KickUser;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$KickUser;

    return-object p1

    :sswitch_1d
    const-string v0, "start-broadcast-call"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1d

    goto :goto_0

    :cond_1d
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$StartBroadcastCall;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$StartBroadcastCall;

    return-object p1

    :sswitch_1e
    const-string v0, "read-call"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e

    goto :goto_0

    :cond_1e
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$ReadCall;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$ReadCall;

    return-object p1

    :sswitch_1f
    const-string v0, "join-ended-call"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1f

    goto :goto_0

    :cond_1f
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$JoinEndedCall;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$JoinEndedCall;

    return-object p1

    :sswitch_20
    const-string v0, "stop-frame-record-call"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_20

    goto :goto_0

    :cond_20
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$StopFrameRecordCall;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$StopFrameRecordCall;

    return-object p1

    :sswitch_21
    const-string v0, "update-call-member"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_21

    goto :goto_0

    :cond_21
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$UpdateCallMember;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$UpdateCallMember;

    return-object p1

    :sswitch_22
    const-string v0, "stop-raw-record-call"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_22

    goto :goto_0

    :cond_22
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$StopRawRecordCall;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$StopRawRecordCall;

    return-object p1

    :sswitch_23
    const-string v0, "start-frame-record-call"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_23

    :goto_0
    new-instance v0, Lio/getstream/android/video/generated/models/OwnCapability$Unknown;

    invoke-direct {v0, p1}, Lio/getstream/android/video/generated/models/OwnCapability$Unknown;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_23
    sget-object p1, Lio/getstream/android/video/generated/models/OwnCapability$StartFrameRecordCall;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$StartFrameRecordCall;

    return-object p1

    :sswitch_data_0
    .sparse-switch
        -0x7e60d6b1 -> :sswitch_23
        -0x77433396 -> :sswitch_22
        -0x591be61b -> :sswitch_21
        -0x57633b11 -> :sswitch_20
        -0x573bf9ec -> :sswitch_1f
        -0x45262fcb -> :sswitch_1e
        -0x3f13a34b -> :sswitch_1d
        -0x3db9b10e -> :sswitch_1c
        -0x3c9504d8 -> :sswitch_1b
        -0x335a7291 -> :sswitch_1a
        -0x25d9819c -> :sswitch_19
        -0x24fa46af -> :sswitch_18
        -0x24f6871e -> :sswitch_17
        -0x23d7ce0a -> :sswitch_16
        -0x20f97526 -> :sswitch_15
        -0x203b96df -> :sswitch_14
        -0x2033c771 -> :sswitch_13
        -0xc0bf738 -> :sswitch_12
        -0x5979ef1 -> :sswitch_11
        -0x5825b52 -> :sswitch_10
        -0x17d0d0d -> :sswitch_f
        -0x8102a0 -> :sswitch_e
        0x41d6515 -> :sswitch_d
        0xada3d54 -> :sswitch_c
        0xd8c17da -> :sswitch_b
        0xea05727 -> :sswitch_a
        0x190b2ef1 -> :sswitch_9
        0x2170a604 -> :sswitch_8
        0x2e0e3c19 -> :sswitch_7
        0x545e8994 -> :sswitch_6
        0x585dd751 -> :sswitch_5
        0x60c9bac8 -> :sswitch_4
        0x64116410 -> :sswitch_3
        0x65ccc8ca -> :sswitch_2
        0x66dd4362 -> :sswitch_1
        0x7dbe1920 -> :sswitch_0
    .end sparse-switch
.end method
