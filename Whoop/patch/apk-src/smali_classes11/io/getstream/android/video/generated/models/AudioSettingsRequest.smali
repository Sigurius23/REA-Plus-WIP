.class public final Lio/getstream/android/video/generated/models/AudioSettingsRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u001a\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001:\u0001*Bc\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0003\u0010\u0008\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0002\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010 \u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u000b\u0010!\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003Jl\u0010\"\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\u0008\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u00c6\u0001\u00a2\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\u00052\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\'H\u00d6\u0001J\t\u0010(\u001a\u00020)H\u00d6\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\u0008\u0013\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\u0008\u0014\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0015\u0010\u0008\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\u0008\u0017\u0010\u000fR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\u0008\u0018\u0010\u000fR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\u0008\u0019\u0010\u000f\u00a8\u0006+"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/AudioSettingsRequest;",
        "",
        "defaultDevice",
        "Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;",
        "accessRequestEnabled",
        "",
        "hifiAudioEnabled",
        "micDefaultOn",
        "opusDtxEnabled",
        "redundantCodingEnabled",
        "speakerDefaultOn",
        "noiseCancellation",
        "Lio/getstream/android/video/generated/models/NoiseCancellationSettings;",
        "(Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/NoiseCancellationSettings;)V",
        "getAccessRequestEnabled",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getDefaultDevice",
        "()Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;",
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
        "(Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/NoiseCancellationSettings;)Lio/getstream/android/video/generated/models/AudioSettingsRequest;",
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
.field private final accessRequestEnabled:Ljava/lang/Boolean;

.field private final defaultDevice:Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;

.field private final hifiAudioEnabled:Ljava/lang/Boolean;

.field private final micDefaultOn:Ljava/lang/Boolean;

.field private final noiseCancellation:Lio/getstream/android/video/generated/models/NoiseCancellationSettings;

.field private final opusDtxEnabled:Ljava/lang/Boolean;

.field private final redundantCodingEnabled:Ljava/lang/Boolean;

.field private final speakerDefaultOn:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/NoiseCancellationSettings;)V
    .locals 1
    .param p1    # Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;
        .annotation runtime Lqx/q;
            name = "default_device"
        .end annotation
    .end param
    .param p2    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "access_request_enabled"
        .end annotation
    .end param
    .param p3    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "hifi_audio_enabled"
        .end annotation
    .end param
    .param p4    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "mic_default_on"
        .end annotation
    .end param
    .param p5    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "opus_dtx_enabled"
        .end annotation
    .end param
    .param p6    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "redundant_coding_enabled"
        .end annotation
    .end param
    .param p7    # Ljava/lang/Boolean;
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

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->defaultDevice:Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;

    .line 3
    iput-object p2, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->accessRequestEnabled:Ljava/lang/Boolean;

    .line 4
    iput-object p3, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->hifiAudioEnabled:Ljava/lang/Boolean;

    .line 5
    iput-object p4, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->micDefaultOn:Ljava/lang/Boolean;

    .line 6
    iput-object p5, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->opusDtxEnabled:Ljava/lang/Boolean;

    .line 7
    iput-object p6, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->redundantCodingEnabled:Ljava/lang/Boolean;

    .line 8
    iput-object p7, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->speakerDefaultOn:Ljava/lang/Boolean;

    .line 9
    iput-object p8, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->noiseCancellation:Lio/getstream/android/video/generated/models/NoiseCancellationSettings;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/NoiseCancellationSettings;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p9, 0x2

    const/4 v0, 0x0

    if-eqz p10, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_2

    move-object p4, v0

    :cond_2
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_3

    move-object p5, v0

    :cond_3
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_4

    move-object p6, v0

    :cond_4
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_5

    move-object p7, v0

    :cond_5
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_6

    move-object p9, v0

    :goto_0
    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_6
    move-object p9, p8

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {p1 .. p9}, Lio/getstream/android/video/generated/models/AudioSettingsRequest;-><init>(Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/NoiseCancellationSettings;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/AudioSettingsRequest;Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/NoiseCancellationSettings;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/AudioSettingsRequest;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->defaultDevice:Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->accessRequestEnabled:Ljava/lang/Boolean;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->hifiAudioEnabled:Ljava/lang/Boolean;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->micDefaultOn:Ljava/lang/Boolean;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->opusDtxEnabled:Ljava/lang/Boolean;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->redundantCodingEnabled:Ljava/lang/Boolean;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->speakerDefaultOn:Ljava/lang/Boolean;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->noiseCancellation:Lio/getstream/android/video/generated/models/NoiseCancellationSettings;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->copy(Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/NoiseCancellationSettings;)Lio/getstream/android/video/generated/models/AudioSettingsRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->defaultDevice:Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;

    return-object v0
.end method

.method public final component2()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->accessRequestEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component3()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->hifiAudioEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component4()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->micDefaultOn:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component5()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->opusDtxEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component6()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->redundantCodingEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component7()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->speakerDefaultOn:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component8()Lio/getstream/android/video/generated/models/NoiseCancellationSettings;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->noiseCancellation:Lio/getstream/android/video/generated/models/NoiseCancellationSettings;

    return-object v0
.end method

.method public final copy(Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/NoiseCancellationSettings;)Lio/getstream/android/video/generated/models/AudioSettingsRequest;
    .locals 10
    .param p1    # Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;
        .annotation runtime Lqx/q;
            name = "default_device"
        .end annotation
    .end param
    .param p2    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "access_request_enabled"
        .end annotation
    .end param
    .param p3    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "hifi_audio_enabled"
        .end annotation
    .end param
    .param p4    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "mic_default_on"
        .end annotation
    .end param
    .param p5    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "opus_dtx_enabled"
        .end annotation
    .end param
    .param p6    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "redundant_coding_enabled"
        .end annotation
    .end param
    .param p7    # Ljava/lang/Boolean;
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

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/AudioSettingsRequest;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lio/getstream/android/video/generated/models/AudioSettingsRequest;-><init>(Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/NoiseCancellationSettings;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/AudioSettingsRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/AudioSettingsRequest;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->defaultDevice:Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->defaultDevice:Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->accessRequestEnabled:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->accessRequestEnabled:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->hifiAudioEnabled:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->hifiAudioEnabled:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->micDefaultOn:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->micDefaultOn:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->opusDtxEnabled:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->opusDtxEnabled:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->redundantCodingEnabled:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->redundantCodingEnabled:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->speakerDefaultOn:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->speakerDefaultOn:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->noiseCancellation:Lio/getstream/android/video/generated/models/NoiseCancellationSettings;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->noiseCancellation:Lio/getstream/android/video/generated/models/NoiseCancellationSettings;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getAccessRequestEnabled()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->accessRequestEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getDefaultDevice()Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->defaultDevice:Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;

    return-object v0
.end method

.method public final getHifiAudioEnabled()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->hifiAudioEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getMicDefaultOn()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->micDefaultOn:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getNoiseCancellation()Lio/getstream/android/video/generated/models/NoiseCancellationSettings;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->noiseCancellation:Lio/getstream/android/video/generated/models/NoiseCancellationSettings;

    return-object v0
.end method

.method public final getOpusDtxEnabled()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->opusDtxEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getRedundantCodingEnabled()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->redundantCodingEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getSpeakerDefaultOn()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->speakerDefaultOn:Ljava/lang/Boolean;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->defaultDevice:Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->accessRequestEnabled:Ljava/lang/Boolean;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->hifiAudioEnabled:Ljava/lang/Boolean;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->micDefaultOn:Ljava/lang/Boolean;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->opusDtxEnabled:Ljava/lang/Boolean;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->redundantCodingEnabled:Ljava/lang/Boolean;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->speakerDefaultOn:Ljava/lang/Boolean;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->noiseCancellation:Lio/getstream/android/video/generated/models/NoiseCancellationSettings;

    if-nez v1, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Lio/getstream/android/video/generated/models/NoiseCancellationSettings;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->defaultDevice:Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->accessRequestEnabled:Ljava/lang/Boolean;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->hifiAudioEnabled:Ljava/lang/Boolean;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->micDefaultOn:Ljava/lang/Boolean;

    iget-object v4, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->opusDtxEnabled:Ljava/lang/Boolean;

    iget-object v5, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->redundantCodingEnabled:Ljava/lang/Boolean;

    iget-object v6, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->speakerDefaultOn:Ljava/lang/Boolean;

    iget-object v7, p0, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->noiseCancellation:Lio/getstream/android/video/generated/models/NoiseCancellationSettings;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "AudioSettingsRequest(defaultDevice="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", accessRequestEnabled="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", hifiAudioEnabled="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", micDefaultOn="

    const-string v1, ", opusDtxEnabled="

    invoke-static {v8, v2, v0, v3, v1}, Lc13/a;->w(Ljava/lang/StringBuilder;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V

    const-string v0, ", redundantCodingEnabled="

    const-string v1, ", speakerDefaultOn="

    invoke-static {v8, v4, v0, v5, v1}, Lc13/a;->w(Ljava/lang/StringBuilder;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", noiseCancellation="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
