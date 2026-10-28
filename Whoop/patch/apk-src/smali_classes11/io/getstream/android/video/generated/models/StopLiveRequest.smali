.class public final Lio/getstream/android/video/generated/models/StopLiveRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u001f\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001Be\u0012\n\u0008\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJn\u0010\u001e\u001a\u00020\u00002\n\u0008\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u0008\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00032\u0008\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020#H\u00d6\u0001J\t\u0010$\u001a\u00020%H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\u0008\u000c\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\u0008\u000f\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\u0008\u0010\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\u0008\u0011\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\u0008\u0012\u0010\rR\u0015\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\u0008\u0013\u0010\rR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\u0008\u0014\u0010\rR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\u0008\u0015\u0010\r\u00a8\u0006&"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/StopLiveRequest;",
        "",
        "continueClosedCaption",
        "",
        "continueCompositeRecording",
        "continueHls",
        "continueIndividualRecording",
        "continueRawRecording",
        "continueRecording",
        "continueRtmpBroadcasts",
        "continueTranscription",
        "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V",
        "getContinueClosedCaption",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getContinueCompositeRecording",
        "getContinueHls",
        "getContinueIndividualRecording",
        "getContinueRawRecording",
        "getContinueRecording",
        "getContinueRtmpBroadcasts",
        "getContinueTranscription",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "copy",
        "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lio/getstream/android/video/generated/models/StopLiveRequest;",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
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


# instance fields
.field private final continueClosedCaption:Ljava/lang/Boolean;

.field private final continueCompositeRecording:Ljava/lang/Boolean;

.field private final continueHls:Ljava/lang/Boolean;

.field private final continueIndividualRecording:Ljava/lang/Boolean;

.field private final continueRawRecording:Ljava/lang/Boolean;

.field private final continueRecording:Ljava/lang/Boolean;

.field private final continueRtmpBroadcasts:Ljava/lang/Boolean;

.field private final continueTranscription:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 11

    .line 1
    const/16 v9, 0xff

    const/4 v10, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v10}, Lio/getstream/android/video/generated/models/StopLiveRequest;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 0
    .param p1    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "continue_closed_caption"
        .end annotation
    .end param
    .param p2    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "continue_composite_recording"
        .end annotation
    .end param
    .param p3    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "continue_hls"
        .end annotation
    .end param
    .param p4    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "continue_individual_recording"
        .end annotation
    .end param
    .param p5    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "continue_raw_recording"
        .end annotation
    .end param
    .param p6    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "continue_recording"
        .end annotation
    .end param
    .param p7    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "continue_rtmp_broadcasts"
        .end annotation
    .end param
    .param p8    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "continue_transcription"
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueClosedCaption:Ljava/lang/Boolean;

    .line 4
    iput-object p2, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueCompositeRecording:Ljava/lang/Boolean;

    .line 5
    iput-object p3, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueHls:Ljava/lang/Boolean;

    .line 6
    iput-object p4, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueIndividualRecording:Ljava/lang/Boolean;

    .line 7
    iput-object p5, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueRawRecording:Ljava/lang/Boolean;

    .line 8
    iput-object p6, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueRecording:Ljava/lang/Boolean;

    .line 9
    iput-object p7, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueRtmpBroadcasts:Ljava/lang/Boolean;

    .line 10
    iput-object p8, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueTranscription:Ljava/lang/Boolean;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p9, 0x1

    const/4 v0, 0x0

    if-eqz p10, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    move-object p7, v0

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

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

    :cond_7
    move-object p9, p8

    goto :goto_0

    .line 11
    :goto_1
    invoke-direct/range {p1 .. p9}, Lio/getstream/android/video/generated/models/StopLiveRequest;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/StopLiveRequest;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/StopLiveRequest;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueClosedCaption:Ljava/lang/Boolean;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueCompositeRecording:Ljava/lang/Boolean;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueHls:Ljava/lang/Boolean;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueIndividualRecording:Ljava/lang/Boolean;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueRawRecording:Ljava/lang/Boolean;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueRecording:Ljava/lang/Boolean;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueRtmpBroadcasts:Ljava/lang/Boolean;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueTranscription:Ljava/lang/Boolean;

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

    invoke-virtual/range {p2 .. p10}, Lio/getstream/android/video/generated/models/StopLiveRequest;->copy(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lio/getstream/android/video/generated/models/StopLiveRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueClosedCaption:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component2()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueCompositeRecording:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component3()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueHls:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component4()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueIndividualRecording:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component5()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueRawRecording:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component6()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueRecording:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component7()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueRtmpBroadcasts:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component8()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueTranscription:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final copy(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lio/getstream/android/video/generated/models/StopLiveRequest;
    .locals 9
    .param p1    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "continue_closed_caption"
        .end annotation
    .end param
    .param p2    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "continue_composite_recording"
        .end annotation
    .end param
    .param p3    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "continue_hls"
        .end annotation
    .end param
    .param p4    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "continue_individual_recording"
        .end annotation
    .end param
    .param p5    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "continue_raw_recording"
        .end annotation
    .end param
    .param p6    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "continue_recording"
        .end annotation
    .end param
    .param p7    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "continue_rtmp_broadcasts"
        .end annotation
    .end param
    .param p8    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "continue_transcription"
        .end annotation
    .end param

    new-instance v0, Lio/getstream/android/video/generated/models/StopLiveRequest;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lio/getstream/android/video/generated/models/StopLiveRequest;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/StopLiveRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/StopLiveRequest;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueClosedCaption:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueClosedCaption:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueCompositeRecording:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueCompositeRecording:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueHls:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueHls:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueIndividualRecording:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueIndividualRecording:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueRawRecording:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueRawRecording:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueRecording:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueRecording:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueRtmpBroadcasts:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueRtmpBroadcasts:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueTranscription:Ljava/lang/Boolean;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueTranscription:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getContinueClosedCaption()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueClosedCaption:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getContinueCompositeRecording()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueCompositeRecording:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getContinueHls()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueHls:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getContinueIndividualRecording()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueIndividualRecording:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getContinueRawRecording()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueRawRecording:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getContinueRecording()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueRecording:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getContinueRtmpBroadcasts()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueRtmpBroadcasts:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getContinueTranscription()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueTranscription:Ljava/lang/Boolean;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueClosedCaption:Ljava/lang/Boolean;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueCompositeRecording:Ljava/lang/Boolean;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueHls:Ljava/lang/Boolean;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueIndividualRecording:Ljava/lang/Boolean;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueRawRecording:Ljava/lang/Boolean;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueRecording:Ljava/lang/Boolean;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueRtmpBroadcasts:Ljava/lang/Boolean;

    if-nez v2, :cond_6

    move v2, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueTranscription:Ljava/lang/Boolean;

    if-nez v2, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueClosedCaption:Ljava/lang/Boolean;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueCompositeRecording:Ljava/lang/Boolean;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueHls:Ljava/lang/Boolean;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueIndividualRecording:Ljava/lang/Boolean;

    iget-object v4, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueRawRecording:Ljava/lang/Boolean;

    iget-object v5, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueRecording:Ljava/lang/Boolean;

    iget-object v6, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueRtmpBroadcasts:Ljava/lang/Boolean;

    iget-object v7, p0, Lio/getstream/android/video/generated/models/StopLiveRequest;->continueTranscription:Ljava/lang/Boolean;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "StopLiveRequest(continueClosedCaption="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", continueCompositeRecording="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", continueHls="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", continueIndividualRecording="

    const-string v1, ", continueRawRecording="

    invoke-static {v8, v2, v0, v3, v1}, Lc13/a;->w(Ljava/lang/StringBuilder;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V

    const-string v0, ", continueRecording="

    const-string v1, ", continueRtmpBroadcasts="

    invoke-static {v8, v4, v0, v5, v1}, Lc13/a;->w(Ljava/lang/StringBuilder;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", continueTranscription="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
