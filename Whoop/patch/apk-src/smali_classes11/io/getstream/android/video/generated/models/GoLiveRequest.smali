.class public final Lio/getstream/android/video/generated/models/GoLiveRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\"\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001Bq\u0012\n\u0008\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0003\u0010\u0008\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\rJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010!\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003Jz\u0010#\u001a\u00020\u00002\n\u0008\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\u0008\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\u00052\u0008\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020(H\u00d6\u0001J\t\u0010)\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\u0008\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\u0008\u0014\u0010\u0011R\u0015\u0010\u0008\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\u0008\u0015\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\u0008\u0016\u0010\u0011R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\u0008\u0017\u0010\u0011R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\u0008\u0018\u0010\u0011R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u000f\u00a8\u0006*"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/GoLiveRequest;",
        "",
        "recordingStorageName",
        "",
        "startClosedCaption",
        "",
        "startCompositeRecording",
        "startHls",
        "startIndividualRecording",
        "startRawRecording",
        "startRecording",
        "startTranscription",
        "transcriptionStorageName",
        "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V",
        "getRecordingStorageName",
        "()Ljava/lang/String;",
        "getStartClosedCaption",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getStartCompositeRecording",
        "getStartHls",
        "getStartIndividualRecording",
        "getStartRawRecording",
        "getStartRecording",
        "getStartTranscription",
        "getTranscriptionStorageName",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lio/getstream/android/video/generated/models/GoLiveRequest;",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
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
.field private final recordingStorageName:Ljava/lang/String;

.field private final startClosedCaption:Ljava/lang/Boolean;

.field private final startCompositeRecording:Ljava/lang/Boolean;

.field private final startHls:Ljava/lang/Boolean;

.field private final startIndividualRecording:Ljava/lang/Boolean;

.field private final startRawRecording:Ljava/lang/Boolean;

.field private final startRecording:Ljava/lang/Boolean;

.field private final startTranscription:Ljava/lang/Boolean;

.field private final transcriptionStorageName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 12

    .line 1
    const/16 v10, 0x1ff

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v11}, Lio/getstream/android/video/generated/models/GoLiveRequest;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "recording_storage_name"
        .end annotation
    .end param
    .param p2    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "start_closed_caption"
        .end annotation
    .end param
    .param p3    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "start_composite_recording"
        .end annotation
    .end param
    .param p4    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "start_hls"
        .end annotation
    .end param
    .param p5    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "start_individual_recording"
        .end annotation
    .end param
    .param p6    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "start_raw_recording"
        .end annotation
    .end param
    .param p7    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "start_recording"
        .end annotation
    .end param
    .param p8    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "start_transcription"
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "transcription_storage_name"
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->recordingStorageName:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startClosedCaption:Ljava/lang/Boolean;

    .line 5
    iput-object p3, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startCompositeRecording:Ljava/lang/Boolean;

    .line 6
    iput-object p4, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startHls:Ljava/lang/Boolean;

    .line 7
    iput-object p5, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startIndividualRecording:Ljava/lang/Boolean;

    .line 8
    iput-object p6, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startRawRecording:Ljava/lang/Boolean;

    .line 9
    iput-object p7, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startRecording:Ljava/lang/Boolean;

    .line 10
    iput-object p8, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startTranscription:Ljava/lang/Boolean;

    .line 11
    iput-object p9, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->transcriptionStorageName:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p10, 0x1

    const/4 v0, 0x0

    if-eqz p11, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    move-object p7, v0

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    move-object p8, v0

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    move-object p10, v0

    :goto_0
    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_8
    move-object p10, p9

    goto :goto_0

    .line 12
    :goto_1
    invoke-direct/range {p1 .. p10}, Lio/getstream/android/video/generated/models/GoLiveRequest;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/GoLiveRequest;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/GoLiveRequest;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->recordingStorageName:Ljava/lang/String;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startClosedCaption:Ljava/lang/Boolean;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startCompositeRecording:Ljava/lang/Boolean;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startHls:Ljava/lang/Boolean;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startIndividualRecording:Ljava/lang/Boolean;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startRawRecording:Ljava/lang/Boolean;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startRecording:Ljava/lang/Boolean;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startTranscription:Ljava/lang/Boolean;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->transcriptionStorageName:Ljava/lang/String;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lio/getstream/android/video/generated/models/GoLiveRequest;->copy(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lio/getstream/android/video/generated/models/GoLiveRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->recordingStorageName:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startClosedCaption:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component3()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startCompositeRecording:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component4()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startHls:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component5()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startIndividualRecording:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component6()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startRawRecording:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component7()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startRecording:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component8()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startTranscription:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->transcriptionStorageName:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lio/getstream/android/video/generated/models/GoLiveRequest;
    .locals 10
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "recording_storage_name"
        .end annotation
    .end param
    .param p2    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "start_closed_caption"
        .end annotation
    .end param
    .param p3    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "start_composite_recording"
        .end annotation
    .end param
    .param p4    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "start_hls"
        .end annotation
    .end param
    .param p5    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "start_individual_recording"
        .end annotation
    .end param
    .param p6    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "start_raw_recording"
        .end annotation
    .end param
    .param p7    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "start_recording"
        .end annotation
    .end param
    .param p8    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "start_transcription"
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "transcription_storage_name"
        .end annotation
    .end param

    new-instance v0, Lio/getstream/android/video/generated/models/GoLiveRequest;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lio/getstream/android/video/generated/models/GoLiveRequest;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/GoLiveRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/GoLiveRequest;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->recordingStorageName:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/GoLiveRequest;->recordingStorageName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startClosedCaption:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/GoLiveRequest;->startClosedCaption:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startCompositeRecording:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/GoLiveRequest;->startCompositeRecording:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startHls:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/GoLiveRequest;->startHls:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startIndividualRecording:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/GoLiveRequest;->startIndividualRecording:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startRawRecording:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/GoLiveRequest;->startRawRecording:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startRecording:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/GoLiveRequest;->startRecording:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startTranscription:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/GoLiveRequest;->startTranscription:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->transcriptionStorageName:Ljava/lang/String;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/GoLiveRequest;->transcriptionStorageName:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getRecordingStorageName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->recordingStorageName:Ljava/lang/String;

    return-object v0
.end method

.method public final getStartClosedCaption()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startClosedCaption:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getStartCompositeRecording()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startCompositeRecording:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getStartHls()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startHls:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getStartIndividualRecording()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startIndividualRecording:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getStartRawRecording()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startRawRecording:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getStartRecording()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startRecording:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getStartTranscription()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startTranscription:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getTranscriptionStorageName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->transcriptionStorageName:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->recordingStorageName:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startClosedCaption:Ljava/lang/Boolean;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startCompositeRecording:Ljava/lang/Boolean;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startHls:Ljava/lang/Boolean;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startIndividualRecording:Ljava/lang/Boolean;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startRawRecording:Ljava/lang/Boolean;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startRecording:Ljava/lang/Boolean;

    if-nez v2, :cond_6

    move v2, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startTranscription:Ljava/lang/Boolean;

    if-nez v2, :cond_7

    move v2, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->transcriptionStorageName:Ljava/lang/String;

    if-nez v2, :cond_8

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->recordingStorageName:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startClosedCaption:Ljava/lang/Boolean;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startCompositeRecording:Ljava/lang/Boolean;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startHls:Ljava/lang/Boolean;

    iget-object v4, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startIndividualRecording:Ljava/lang/Boolean;

    iget-object v5, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startRawRecording:Ljava/lang/Boolean;

    iget-object v6, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startRecording:Ljava/lang/Boolean;

    iget-object v7, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->startTranscription:Ljava/lang/Boolean;

    iget-object v8, p0, Lio/getstream/android/video/generated/models/GoLiveRequest;->transcriptionStorageName:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "GoLiveRequest(recordingStorageName="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", startClosedCaption="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", startCompositeRecording="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", startHls="

    const-string v1, ", startIndividualRecording="

    invoke-static {v9, v2, v0, v3, v1}, Lc13/a;->w(Ljava/lang/StringBuilder;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V

    const-string v0, ", startRawRecording="

    const-string v1, ", startRecording="

    invoke-static {v9, v4, v0, v5, v1}, Lc13/a;->w(Ljava/lang/StringBuilder;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V

    const-string v0, ", startTranscription="

    const-string v1, ", transcriptionStorageName="

    invoke-static {v9, v6, v0, v7, v1}, Lc13/a;->w(Ljava/lang/StringBuilder;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V

    const-string v0, ")"

    invoke-static {v8, v0, v9}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
