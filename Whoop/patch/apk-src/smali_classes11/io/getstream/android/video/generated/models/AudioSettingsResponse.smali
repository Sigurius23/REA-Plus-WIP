.class public final Lio/getstream/android/video/generated/models/AudioSettingsResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001:\u0001(BW\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\t\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\n\u001a\u00020\u0003\u0012\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J[\u0010!\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0003\u0010\t\u001a\u00020\u00032\u0008\u0008\u0003\u0010\n\u001a\u00020\u00032\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u00c6\u0001J\u0013\u0010\"\u001a\u00020\u00032\u0008\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020%H\u00d6\u0001J\t\u0010&\u001a\u00020\'H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u000f\u00a8\u0006)"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/AudioSettingsResponse;",
        "",
        "accessRequestEnabled",
        "",
        "defaultDevice",
        "Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;",
        "hifiAudioEnabled",
        "micDefaultOn",
        "opusDtxEnabled",
        "redundantCodingEnabled",
        "speakerDefaultOn",
        "noiseCancellation",
        "Lio/getstream/android/video/generated/models/NoiseCancellationSettings;",
        "(ZLio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;ZZZZZLio/getstream/android/video/generated/models/NoiseCancellationSettings;)V",
        "getAccessRequestEnabled",
        "()Z",
        "getDefaultDevice",
        "()Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;",
        "getHifiAudioEnabled",
        "getMicDefaultOn",
        "getNoiseCancellation",
        "()Lio/getstream/android/video/generated/models/NoiseCancellationSettings;",
        "getOpusDtxEnabled",
        "getRedundantCodingEnabled",
        "getSpeakerDefaultOn",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "DefaultDevice",
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


# instance fields
.field private final accessRequestEnabled:Z

.field private final defaultDevice:Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;

.field private final hifiAudioEnabled:Z

.field private final micDefaultOn:Z

.field private final noiseCancellation:Lio/getstream/android/video/generated/models/NoiseCancellationSettings;

.field private final opusDtxEnabled:Z

.field private final redundantCodingEnabled:Z

.field private final speakerDefaultOn:Z


# direct methods
.method public constructor <init>(ZLio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;ZZZZZLio/getstream/android/video/generated/models/NoiseCancellationSettings;)V
    .locals 1
    .param p1    # Z
        .annotation runtime Lqx/q;
            name = "access_request_enabled"
        .end annotation
    .end param
    .param p2    # Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;
        .annotation runtime Lqx/q;
            name = "default_device"
        .end annotation
    .end param
    .param p3    # Z
        .annotation runtime Lqx/q;
            name = "hifi_audio_enabled"
        .end annotation
    .end param
    .param p4    # Z
        .annotation runtime Lqx/q;
            name = "mic_default_on"
        .end annotation
    .end param
    .param p5    # Z
        .annotation runtime Lqx/q;
            name = "opus_dtx_enabled"
        .end annotation
    .end param
    .param p6    # Z
        .annotation runtime Lqx/q;
            name = "redundant_coding_enabled"
        .end annotation
    .end param
    .param p7    # Z
        .annotation runtime Lqx/q;
            name = "speaker_default_on"
        .end annotation
    .end param
    .param p8    # Lio/getstream/android/video/generated/models/NoiseCancellationSettings;
        .annotation runtime Lqx/q;
            name = "noise_cancellation"
        .end annotation
    .end param

    const-string v0, "defaultDevice"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->accessRequestEnabled:Z

    .line 3
    iput-object p2, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->defaultDevice:Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;

    .line 4
    iput-boolean p3, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->hifiAudioEnabled:Z

    .line 5
    iput-boolean p4, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->micDefaultOn:Z

    .line 6
    iput-boolean p5, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->opusDtxEnabled:Z

    .line 7
    iput-boolean p6, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->redundantCodingEnabled:Z

    .line 8
    iput-boolean p7, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->speakerDefaultOn:Z

    .line 9
    iput-object p8, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->noiseCancellation:Lio/getstream/android/video/generated/models/NoiseCancellationSettings;

    return-void
.end method

.method public synthetic constructor <init>(ZLio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;ZZZZZLio/getstream/android/video/generated/models/NoiseCancellationSettings;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    move/from16 v0, p9

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v9, v0

    :goto_0
    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    goto :goto_1

    :cond_0
    move-object/from16 v9, p8

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {v1 .. v9}, Lio/getstream/android/video/generated/models/AudioSettingsResponse;-><init>(ZLio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;ZZZZZLio/getstream/android/video/generated/models/NoiseCancellationSettings;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/AudioSettingsResponse;ZLio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;ZZZZZLio/getstream/android/video/generated/models/NoiseCancellationSettings;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/AudioSettingsResponse;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-boolean p1, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->accessRequestEnabled:Z

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->defaultDevice:Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-boolean p3, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->hifiAudioEnabled:Z

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-boolean p4, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->micDefaultOn:Z

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-boolean p5, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->opusDtxEnabled:Z

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-boolean p6, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->redundantCodingEnabled:Z

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-boolean p7, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->speakerDefaultOn:Z

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->noiseCancellation:Lio/getstream/android/video/generated/models/NoiseCancellationSettings;

    :cond_7
    move p9, p7

    move-object p10, p8

    move p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->copy(ZLio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;ZZZZZLio/getstream/android/video/generated/models/NoiseCancellationSettings;)Lio/getstream/android/video/generated/models/AudioSettingsResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->accessRequestEnabled:Z

    return v0
.end method

.method public final component2()Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->defaultDevice:Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->hifiAudioEnabled:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->micDefaultOn:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->opusDtxEnabled:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->redundantCodingEnabled:Z

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->speakerDefaultOn:Z

    return v0
.end method

.method public final component8()Lio/getstream/android/video/generated/models/NoiseCancellationSettings;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->noiseCancellation:Lio/getstream/android/video/generated/models/NoiseCancellationSettings;

    return-object v0
.end method

.method public final copy(ZLio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;ZZZZZLio/getstream/android/video/generated/models/NoiseCancellationSettings;)Lio/getstream/android/video/generated/models/AudioSettingsResponse;
    .locals 10
    .param p1    # Z
        .annotation runtime Lqx/q;
            name = "access_request_enabled"
        .end annotation
    .end param
    .param p2    # Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;
        .annotation runtime Lqx/q;
            name = "default_device"
        .end annotation
    .end param
    .param p3    # Z
        .annotation runtime Lqx/q;
            name = "hifi_audio_enabled"
        .end annotation
    .end param
    .param p4    # Z
        .annotation runtime Lqx/q;
            name = "mic_default_on"
        .end annotation
    .end param
    .param p5    # Z
        .annotation runtime Lqx/q;
            name = "opus_dtx_enabled"
        .end annotation
    .end param
    .param p6    # Z
        .annotation runtime Lqx/q;
            name = "redundant_coding_enabled"
        .end annotation
    .end param
    .param p7    # Z
        .annotation runtime Lqx/q;
            name = "speaker_default_on"
        .end annotation
    .end param
    .param p8    # Lio/getstream/android/video/generated/models/NoiseCancellationSettings;
        .annotation runtime Lqx/q;
            name = "noise_cancellation"
        .end annotation
    .end param

    const-string v0, "defaultDevice"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/AudioSettingsResponse;

    move v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lio/getstream/android/video/generated/models/AudioSettingsResponse;-><init>(ZLio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;ZZZZZLio/getstream/android/video/generated/models/NoiseCancellationSettings;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/AudioSettingsResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/AudioSettingsResponse;

    iget-boolean v1, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->accessRequestEnabled:Z

    iget-boolean v3, p1, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->accessRequestEnabled:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->defaultDevice:Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->defaultDevice:Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->hifiAudioEnabled:Z

    iget-boolean v3, p1, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->hifiAudioEnabled:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->micDefaultOn:Z

    iget-boolean v3, p1, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->micDefaultOn:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->opusDtxEnabled:Z

    iget-boolean v3, p1, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->opusDtxEnabled:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->redundantCodingEnabled:Z

    iget-boolean v3, p1, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->redundantCodingEnabled:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->speakerDefaultOn:Z

    iget-boolean v3, p1, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->speakerDefaultOn:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->noiseCancellation:Lio/getstream/android/video/generated/models/NoiseCancellationSettings;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->noiseCancellation:Lio/getstream/android/video/generated/models/NoiseCancellationSettings;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getAccessRequestEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->accessRequestEnabled:Z

    return v0
.end method

.method public final getDefaultDevice()Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->defaultDevice:Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;

    return-object v0
.end method

.method public final getHifiAudioEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->hifiAudioEnabled:Z

    return v0
.end method

.method public final getMicDefaultOn()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->micDefaultOn:Z

    return v0
.end method

.method public final getNoiseCancellation()Lio/getstream/android/video/generated/models/NoiseCancellationSettings;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->noiseCancellation:Lio/getstream/android/video/generated/models/NoiseCancellationSettings;

    return-object v0
.end method

.method public final getOpusDtxEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->opusDtxEnabled:Z

    return v0
.end method

.method public final getRedundantCodingEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->redundantCodingEnabled:Z

    return v0
.end method

.method public final getSpeakerDefaultOn()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->speakerDefaultOn:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->accessRequestEnabled:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->defaultDevice:Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->hifiAudioEnabled:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->micDefaultOn:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->opusDtxEnabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->redundantCodingEnabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->speakerDefaultOn:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->noiseCancellation:Lio/getstream/android/video/generated/models/NoiseCancellationSettings;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lio/getstream/android/video/generated/models/NoiseCancellationSettings;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->accessRequestEnabled:Z

    iget-object v1, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->defaultDevice:Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;

    iget-boolean v2, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->hifiAudioEnabled:Z

    iget-boolean v3, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->micDefaultOn:Z

    iget-boolean v4, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->opusDtxEnabled:Z

    iget-boolean v5, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->redundantCodingEnabled:Z

    iget-boolean v6, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->speakerDefaultOn:Z

    iget-object v7, p0, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->noiseCancellation:Lio/getstream/android/video/generated/models/NoiseCancellationSettings;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "AudioSettingsResponse(accessRequestEnabled="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", defaultDevice="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", hifiAudioEnabled="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", micDefaultOn="

    const-string v1, ", opusDtxEnabled="

    invoke-static {v8, v2, v0, v3, v1}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v0, ", redundantCodingEnabled="

    const-string v1, ", speakerDefaultOn="

    invoke-static {v8, v4, v0, v5, v1}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", noiseCancellation="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
