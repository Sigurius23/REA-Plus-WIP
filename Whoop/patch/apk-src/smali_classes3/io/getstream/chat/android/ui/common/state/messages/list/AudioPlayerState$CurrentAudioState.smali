.class public final Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CurrentAudioState"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008 \u0008\u0087\u0008\u0018\u00002\u00020\u0001Bq\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00050\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0008H\u00c6\u0003J\u000f\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00050\nH\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u000eH\u00c6\u0003J\t\u0010\'\u001a\u00020\u000eH\u00c6\u0003J\t\u0010(\u001a\u00020\u000eH\u00c6\u0003Js\u0010)\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00050\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00032\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000eH\u00c6\u0001J\u0013\u0010*\u001a\u00020\u000e2\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010,\u001a\u00020\u0003H\u00d6\u0001J\t\u0010-\u001a\u00020\u0008H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00050\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0014R\u0011\u0010\u000c\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0014R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u001e\u00a8\u0006."
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;",
        "",
        "playingId",
        "",
        "playingSpeed",
        "",
        "playingProgress",
        "audioUri",
        "",
        "waveform",
        "",
        "playbackInMs",
        "durationInMs",
        "isLoading",
        "",
        "isPlaying",
        "isSeeking",
        "<init>",
        "(IFFLjava/lang/String;Ljava/util/List;IIZZZ)V",
        "getPlayingId",
        "()I",
        "getPlayingSpeed",
        "()F",
        "getPlayingProgress",
        "getAudioUri",
        "()Ljava/lang/String;",
        "getWaveform",
        "()Ljava/util/List;",
        "getPlaybackInMs",
        "getDurationInMs",
        "()Z",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
        "stream-chat-android-ui-common_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final audioUri:Ljava/lang/String;

.field private final durationInMs:I

.field private final isLoading:Z

.field private final isPlaying:Z

.field private final isSeeking:Z

.field private final playbackInMs:I

.field private final playingId:I

.field private final playingProgress:F

.field private final playingSpeed:F

.field private final waveform:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 13

    .line 1
    const/16 v11, 0x3ff

    const/4 v12, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v12}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;-><init>(IFFLjava/lang/String;Ljava/util/List;IIZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IFFLjava/lang/String;Ljava/util/List;IIZZZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IFF",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;IIZZZ)V"
        }
    .end annotation

    const-string v0, "audioUri"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "waveform"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->playingId:I

    .line 4
    iput p2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->playingSpeed:F

    .line 5
    iput p3, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->playingProgress:F

    .line 6
    iput-object p4, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->audioUri:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->waveform:Ljava/util/List;

    .line 8
    iput p6, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->playbackInMs:I

    .line 9
    iput p7, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->durationInMs:I

    .line 10
    iput-boolean p8, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->isLoading:Z

    .line 11
    iput-boolean p9, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->isPlaying:Z

    .line 12
    iput-boolean p10, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->isSeeking:Z

    return-void
.end method

.method public synthetic constructor <init>(IFFLjava/lang/String;Ljava/util/List;IIZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    const/4 p1, -0x1

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    const/high16 p2, 0x3f800000    # 1.0f

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    const/4 p3, 0x0

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    .line 13
    const-string p4, ""

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    .line 14
    sget-object p5, Lm83/y;->w:Lm83/y;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    const/4 v0, 0x0

    if-eqz p12, :cond_5

    move p6, v0

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    move p7, v0

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    move p8, v0

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    move p9, v0

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    move p12, v0

    move p10, p8

    move p11, p9

    move p8, p6

    move p9, p7

    move-object p6, p4

    move-object p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    goto :goto_0

    :cond_9
    move p12, p10

    move p11, p9

    move p9, p7

    move p10, p8

    move-object p7, p5

    move p8, p6

    move p5, p3

    move-object p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    .line 15
    :goto_0
    invoke-direct/range {p2 .. p12}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;-><init>(IFFLjava/lang/String;Ljava/util/List;IIZZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;IFFLjava/lang/String;Ljava/util/List;IIZZZILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget p1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->playingId:I

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget p2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->playingSpeed:F

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget p3, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->playingProgress:F

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->audioUri:Ljava/lang/String;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->waveform:Ljava/util/List;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget p6, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->playbackInMs:I

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget p7, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->durationInMs:I

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-boolean p8, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->isLoading:Z

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-boolean p9, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->isPlaying:Z

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-boolean p10, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->isSeeking:Z

    :cond_9
    move p11, p9

    move p12, p10

    move p9, p7

    move p10, p8

    move-object p7, p5

    move p8, p6

    move p5, p3

    move-object p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->copy(IFFLjava/lang/String;Ljava/util/List;IIZZZ)Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->playingId:I

    return v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->isSeeking:Z

    return v0
.end method

.method public final component2()F
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->playingSpeed:F

    return v0
.end method

.method public final component3()F
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->playingProgress:F

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->audioUri:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->waveform:Ljava/util/List;

    return-object v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->playbackInMs:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->durationInMs:I

    return v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->isLoading:Z

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->isPlaying:Z

    return v0
.end method

.method public final copy(IFFLjava/lang/String;Ljava/util/List;IIZZZ)Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IFF",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;IIZZZ)",
            "Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;"
        }
    .end annotation

    const-string v0, "audioUri"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "waveform"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move v2, p1

    move v3, p2

    move v4, p3

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;-><init>(IFFLjava/lang/String;Ljava/util/List;IIZZZ)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    iget v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->playingId:I

    iget v3, p1, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->playingId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->playingSpeed:F

    iget v3, p1, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->playingSpeed:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->playingProgress:F

    iget v3, p1, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->playingProgress:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->audioUri:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->audioUri:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->waveform:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->waveform:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->playbackInMs:I

    iget v3, p1, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->playbackInMs:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->durationInMs:I

    iget v3, p1, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->durationInMs:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->isLoading:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->isLoading:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->isPlaying:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->isPlaying:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->isSeeking:Z

    iget-boolean p1, p1, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->isSeeking:Z

    if-eq v1, p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getAudioUri()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->audioUri:Ljava/lang/String;

    return-object v0
.end method

.method public final getDurationInMs()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->durationInMs:I

    return v0
.end method

.method public final getPlaybackInMs()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->playbackInMs:I

    return v0
.end method

.method public final getPlayingId()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->playingId:I

    return v0
.end method

.method public final getPlayingProgress()F
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->playingProgress:F

    return v0
.end method

.method public final getPlayingSpeed()F
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->playingSpeed:F

    return v0
.end method

.method public final getWaveform()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->waveform:Ljava/util/List;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->playingId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->playingSpeed:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->playingProgress:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->audioUri:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->waveform:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->playbackInMs:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->durationInMs:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->isLoading:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->isPlaying:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->isSeeking:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isLoading()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->isLoading:Z

    return v0
.end method

.method public final isPlaying()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->isPlaying:Z

    return v0
.end method

.method public final isSeeking()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->isSeeking:Z

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 12

    iget v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->playingId:I

    iget v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->playingSpeed:F

    iget v2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->playingProgress:F

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->audioUri:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->waveform:Ljava/util/List;

    iget v5, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->playbackInMs:I

    iget v6, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->durationInMs:I

    iget-boolean v7, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->isLoading:Z

    iget-boolean v8, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->isPlaying:Z

    iget-boolean v9, p0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->isSeeking:Z

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "CurrentAudioState(playingId="

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", playingSpeed="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", playingProgress="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", audioUri="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", waveform="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", playbackInMs="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", durationInMs="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isLoading="

    const-string v1, ", isPlaying="

    invoke-static {v6, v0, v1, v10, v7}, Lev/n;->t(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    const-string v0, ", isSeeking="

    const-string v1, ")"

    invoke-static {v10, v8, v0, v9, v1}, Lvl/b;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
