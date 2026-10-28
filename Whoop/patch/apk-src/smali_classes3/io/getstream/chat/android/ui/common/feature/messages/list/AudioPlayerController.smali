.class public final Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController$Companion;
    }
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 I2\u00020\u0001:\u0001IB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000c2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJA\u0010\"\u001a\u00020\u0017*\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00062\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u001e2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\u0008\"\u0010#J\u0015\u0010%\u001a\u00020\u000c2\u0006\u0010$\u001a\u00020\u0005\u00a2\u0006\u0004\u0008%\u0010&J\u0015\u0010\'\u001a\u00020\u000c2\u0006\u0010$\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\'\u0010&J\u0015\u0010(\u001a\u00020\u000c2\u0006\u0010$\u001a\u00020\u0005\u00a2\u0006\u0004\u0008(\u0010&J\u0015\u0010)\u001a\u00020\u000c2\u0006\u0010$\u001a\u00020\u0005\u00a2\u0006\u0004\u0008)\u0010&J\u001d\u0010+\u001a\u00020\u000c2\u0006\u0010$\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0013\u00a2\u0006\u0004\u0008+\u0010,J\u0015\u0010-\u001a\u00020\u000c2\u0006\u0010$\u001a\u00020\u0005\u00a2\u0006\u0004\u0008-\u0010&J\r\u0010.\u001a\u00020\u000c\u00a2\u0006\u0004\u0008.\u0010/J\r\u00100\u001a\u00020\u000c\u00a2\u0006\u0004\u00080\u0010/J\r\u00101\u001a\u00020\u000c\u00a2\u0006\u0004\u00081\u0010/J(\u00107\u001a\u000202*\u0002022\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001303H\u0080\u0002\u00a2\u0006\u0004\u00085\u00106J\u001c\u0010;\u001a\u000202*\u0002022\u0006\u00108\u001a\u00020\u001bH\u0080\u0002\u00a2\u0006\u0004\u00089\u0010:R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010<R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010=R\u001b\u0010C\u001a\u00020>8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008?\u0010@\u001a\u0004\u0008A\u0010BR\u001d\u0010E\u001a\u0008\u0012\u0004\u0012\u00020\u00170D8\u0006\u00a2\u0006\u000c\n\u0004\u0008E\u0010F\u001a\u0004\u0008G\u0010H\u00a8\u0006J"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;",
        "",
        "Lio/getstream/chat/android/client/audio/AudioPlayer;",
        "audioPlayer",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/models/Attachment;",
        "",
        "getRecordingUri",
        "<init>",
        "(Lio/getstream/chat/android/client/audio/AudioPlayer;Lkotlin/jvm/functions/Function1;)V",
        "Lio/getstream/chat/android/client/audio/AudioState;",
        "playbackState",
        "Ll83/a0;",
        "onAudioStateChanged",
        "(Lio/getstream/chat/android/client/audio/AudioState;)V",
        "Lio/getstream/chat/android/client/audio/ProgressData;",
        "progressState",
        "onAudioPlayingProgress",
        "(Lio/getstream/chat/android/client/audio/ProgressData;)V",
        "",
        "speed",
        "onAudioPlayingSpeed",
        "(F)V",
        "Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;",
        "newState",
        "setState",
        "(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;)V",
        "",
        "audioHash",
        "recordingUri",
        "",
        "waveform",
        "playbackInMs",
        "durationInMs",
        "newCurrentState",
        "(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;ILjava/lang/String;Ljava/util/List;II)Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;",
        "attachment",
        "resetAudio",
        "(Lio/getstream/chat/android/models/Attachment;)V",
        "togglePlayback",
        "changeSpeed",
        "startSeek",
        "progress",
        "seekTo",
        "(Lio/getstream/chat/android/models/Attachment;F)V",
        "play",
        "pause",
        "()V",
        "resume",
        "reset",
        "La0/n;",
        "Ll83/k;",
        "that",
        "plus$stream_chat_android_ui_common_release",
        "(La0/n;Ll83/k;)La0/n;",
        "plus",
        "key",
        "minus$stream_chat_android_ui_common_release",
        "(La0/n;I)La0/n;",
        "minus",
        "Lio/getstream/chat/android/client/audio/AudioPlayer;",
        "Lkotlin/jvm/functions/Function1;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Lec3/p1;",
        "state",
        "Lec3/p1;",
        "getState",
        "()Lec3/p1;",
        "Companion",
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

.field private static final Companion:Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController$Companion;

.field private static final MILLIS_IN_SECOND:F = 1000.0f

.field private static final NO_ID:I = -0x1

.field private static final NULL_DURATION:F


# instance fields
.field private final audioPlayer:Lio/getstream/chat/android/client/audio/AudioPlayer;

.field private final getRecordingUri:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final logger$delegate:Ll83/h;

.field private final state:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->Companion:Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController$Companion;

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/client/audio/AudioPlayer;Lkotlin/jvm/functions/Function1;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/audio/AudioPlayer;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "audioPlayer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getRecordingUri"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->audioPlayer:Lio/getstream/chat/android/client/audio/AudioPlayer;

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getRecordingUri:Lkotlin/jvm/functions/Function1;

    const-string p1, "Chat:AudioPlayerController"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->logger$delegate:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, p2

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;-><init>(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;La0/n;La0/n;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->state:Lec3/p1;

    return-void
.end method

.method public static final synthetic access$onAudioPlayingProgress(Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;Lio/getstream/chat/android/client/audio/ProgressData;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->onAudioPlayingProgress(Lio/getstream/chat/android/client/audio/ProgressData;)V

    return-void
.end method

.method public static final synthetic access$onAudioPlayingSpeed(Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;F)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->onAudioPlayingSpeed(F)V

    return-void
.end method

.method public static final synthetic access$onAudioStateChanged(Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;Lio/getstream/chat/android/client/audio/AudioState;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->onAudioStateChanged(Lio/getstream/chat/android/client/audio/AudioState;)V

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final newCurrentState(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;ILjava/lang/String;Ljava/util/List;II)Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;",
            "I",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;II)",
            "Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;"
        }
    .end annotation

    move/from16 v6, p5

    int-to-float v0, v6

    move/from16 v7, p6

    int-to-float v1, v7

    div-float v3, v0, v1

    new-instance v0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    const/16 v11, 0x382

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move v1, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    invoke-direct/range {v0 .. v12}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;-><init>(IFFLjava/lang/String;Ljava/util/List;IIZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->getPlayingId()I

    move-result v2

    if-eq v2, p2, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object p2

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->getPlayingId()I

    move-result p2

    const/4 v1, -0x1

    if-eq p2, v1, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object p2

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->getPlayingProgress()F

    move-result p2

    const/4 v1, 0x0

    cmpl-float p2, p2, v1

    if-lez p2, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getSeekTo()La0/n;

    move-result-object p2

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->getPlayingId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->getPlayingProgress()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, p2, v3}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->plus$stream_chat_android_ui_common_release(La0/n;Ll83/k;)La0/n;

    move-result-object p2

    :goto_0
    move-object v6, p2

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getSeekTo()La0/n;

    move-result-object p2

    goto :goto_0

    :goto_1
    const/16 v9, 0xc

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v4, p1

    move-object v5, v0

    invoke-static/range {v4 .. v10}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;La0/n;La0/n;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;

    move-result-object p1

    return-object p1
.end method

.method private final onAudioPlayingProgress(Lio/getstream/chat/android/client/audio/ProgressData;)V
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->state:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->getPlayingId()I

    move-result v1

    const/4 v3, -0x1

    if-ne v1, v3, :cond_1

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[onAudioPlayingProgress] rejected (no playingId)"

    const/4 v5, 0x0

    invoke-interface {v1, v4, v3, v2, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void

    :cond_1
    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/client/audio/ProgressData;->getProgress()F

    move-result v9

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/client/audio/ProgressData;->getCurrentPosition()I

    move-result v12

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/client/audio/ProgressData;->getDuration()I

    move-result v13

    const/16 v17, 0x29b

    const/16 v18, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x0

    invoke-static/range {v6 .. v18}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;IFFLjava/lang/String;Ljava/util/List;IIZZZILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v3

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getSeekTo()La0/n;

    move-result-object v1

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->getPlayingId()I

    move-result v4

    invoke-virtual {v0, v1, v4}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->minus$stream_chat_android_ui_common_release(La0/n;I)La0/n;

    move-result-object v4

    const/16 v7, 0xc

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;La0/n;La0/n;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->setState(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;)V

    return-void
.end method

.method private final onAudioPlayingSpeed(F)V
    .locals 22

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->state:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->getPlayingId()I

    move-result v1

    const/4 v3, -0x1

    const/4 v4, 0x0

    if-ne v1, v3, :cond_1

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v5, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[onAudioPlayingSpeed] rejected (no playingId)"

    invoke-interface {v1, v5, v3, v2, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void

    :cond_1
    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v3, v1, Lb23/k;->c:Lb23/e;

    iget-object v5, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->y:Lb23/g;

    invoke-interface {v3, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->stringify()Ljava/lang/String;

    move-result-object v3

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "[onAudioPlayingSpeed] speed: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move/from16 v11, p1

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v8, ", state: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v6, v5, v3, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    move/from16 v11, p1

    :goto_0
    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->getPlayingId()I

    move-result v1

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v9

    const/16 v20, 0x3fd

    const/16 v21, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v9 .. v21}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;IFFLjava/lang/String;Ljava/util/List;IIZZZILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v3

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getSpeeds()La0/n;

    move-result-object v4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static/range {p1 .. p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    new-instance v6, Ll83/k;

    invoke-direct {v6, v1, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v4, v6}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->plus$stream_chat_android_ui_common_release(La0/n;Ll83/k;)La0/n;

    move-result-object v5

    const/16 v7, 0xa

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;La0/n;La0/n;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->setState(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;)V

    return-void
.end method

.method private final onAudioStateChanged(Lio/getstream/chat/android/client/audio/AudioState;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->state:Lec3/p1;

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->getPlayingId()I

    move-result v2

    const/4 v4, -0x1

    const/4 v5, 0x0

    if-ne v2, v4, :cond_1

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[onAudioStateChanged] rejected (no playingId)"

    invoke-interface {v1, v4, v3, v2, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void

    :cond_1
    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v4, v2, Lb23/k;->c:Lb23/e;

    iget-object v6, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->y:Lb23/g;

    invoke-interface {v4, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v8, "[onAudioStateChanged] playbackState: "

    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v7, v6, v4, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    invoke-virtual {v3}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v8

    sget-object v2, Lio/getstream/chat/android/client/audio/AudioState;->LOADING:Lio/getstream/chat/android/client/audio/AudioState;

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne v1, v2, :cond_3

    move/from16 v16, v5

    goto :goto_0

    :cond_3
    move/from16 v16, v4

    :goto_0
    sget-object v2, Lio/getstream/chat/android/client/audio/AudioState;->PLAYING:Lio/getstream/chat/android/client/audio/AudioState;

    if-ne v1, v2, :cond_4

    move/from16 v17, v5

    goto :goto_1

    :cond_4
    move/from16 v17, v4

    :goto_1
    const/16 v19, 0x27f

    const/16 v20, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    invoke-static/range {v8 .. v20}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;IFFLjava/lang/String;Ljava/util/List;IIZZZILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v4

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;La0/n;La0/n;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->setState(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;)V

    return-void
.end method

.method private final setState(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->state:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final changeSpeed(Lio/getstream/chat/android/models/Attachment;)V
    .locals 14

    const-string v0, "attachment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isAudioRecording(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getType()Ljava/lang/String;

    move-result-object p1

    const-string v2, "[changeSpeed] rejected (not an audio recording): "

    invoke-static {v2, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v4, v3, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getRecordingUri:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_2

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "[changeSpeed] rejected (no recordingUri): "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v4, v3, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-void

    :cond_2
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->hashCode()I

    move-result p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->audioPlayer:Lio/getstream/chat/android/client/audio/AudioPlayer;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/audio/AudioPlayer;->changeSpeed(I)F

    move-result v3

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->state:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->getPlayingId()I

    move-result v1

    if-ne v1, p1, :cond_3

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v1

    const/16 v12, 0x3fd

    const/4 v13, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v1 .. v13}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;IFFLjava/lang/String;Ljava/util/List;IIZZZILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v1

    :goto_0
    move-object v5, v1

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v1

    goto :goto_0

    :goto_1
    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getSpeeds()La0/n;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    new-instance v3, Ll83/k;

    invoke-direct {v3, p1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v1, v3}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->plus$stream_chat_android_ui_common_release(La0/n;Ll83/k;)La0/n;

    move-result-object v7

    const/16 v9, 0xa

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v4, v0

    invoke-static/range {v4 .. v10}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;La0/n;La0/n;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->setState(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;)V

    return-void
.end method

.method public final getState()Lec3/p1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/p1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->state:Lec3/p1;

    return-object v0
.end method

.method public final minus$stream_chat_android_ui_common_release(La0/n;I)La0/n;
    .locals 16

    move-object/from16 v0, p1

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p2}, La0/n;->a(I)I

    move-result v1

    if-ltz v1, :cond_5

    new-instance v1, La0/d0;

    iget v2, v0, La0/n;->e:I

    invoke-direct {v1, v2}, La0/d0;-><init>(I)V

    iget-object v2, v0, La0/n;->b:[I

    iget-object v3, v0, La0/n;->c:[F

    iget-object v0, v0, La0/n;->a:[J

    array-length v4, v0

    add-int/lit8 v4, v4, -0x2

    if-ltz v4, :cond_4

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    aget-wide v7, v0, v6

    not-long v9, v7

    const/4 v11, 0x7

    shl-long/2addr v9, v11

    and-long/2addr v9, v7

    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v9, v11

    cmp-long v9, v9, v11

    if-eqz v9, :cond_3

    sub-int v9, v6, v4

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    const/16 v10, 0x8

    rsub-int/lit8 v9, v9, 0x8

    move v11, v5

    :goto_1
    if-ge v11, v9, :cond_2

    const-wide/16 v12, 0xff

    and-long/2addr v12, v7

    const-wide/16 v14, 0x80

    cmp-long v12, v12, v14

    if-gez v12, :cond_0

    shl-int/lit8 v12, v6, 0x3

    add-int/2addr v12, v11

    aget v13, v2, v12

    aget v12, v3, v12

    move/from16 v14, p2

    if-eq v13, v14, :cond_1

    invoke-virtual {v1, v12, v13}, La0/d0;->d(FI)V

    goto :goto_2

    :cond_0
    move/from16 v14, p2

    :cond_1
    :goto_2
    shr-long/2addr v7, v10

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_2
    move/from16 v14, p2

    if-ne v9, v10, :cond_4

    goto :goto_3

    :cond_3
    move/from16 v14, p2

    :goto_3
    if-eq v6, v4, :cond_4

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_4
    return-object v1

    :cond_5
    return-object v0
.end method

.method public final pause()V
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->state:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->getPlayingId()I

    move-result v1

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->x:Lb23/g;

    invoke-interface {v1, v4, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[pause] rejected (no playingId)"

    invoke-interface {v0, v4, v2, v1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->isPlaying()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v4, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[pause] rejected (not playing)"

    invoke-interface {v0, v4, v2, v1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-void

    :cond_2
    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->getPlayingId()I

    move-result v0

    const-string v2, "[pause] audioHash: "

    invoke-static {v0, v2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v5, v4, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->audioPlayer:Lio/getstream/chat/android/client/audio/AudioPlayer;

    invoke-interface {v0}, Lio/getstream/chat/android/client/audio/AudioPlayer;->pause()V

    return-void
.end method

.method public final play(Lio/getstream/chat/android/models/Attachment;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "attachment"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isAudioRecording(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v4, v2, Lb23/k;->c:Lb23/e;

    iget-object v5, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->x:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Attachment;->getType()Ljava/lang/String;

    move-result-object v1

    const-string v4, "[play] rejected (not an audio recording): "

    invoke-static {v4, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v6, v5, v1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getRecordingUri:Lkotlin/jvm/functions/Function1;

    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_2

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v4, v2, Lb23/k;->c:Lb23/e;

    iget-object v5, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->x:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v7, "[play] rejected (no recordingUri): "

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v6, v5, v1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-void

    :cond_2
    iget-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->state:Lec3/p1;

    check-cast v4, Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;

    move-object v5, v2

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Attachment;->hashCode()I

    move-result v2

    invoke-static {v1}, Lio/getstream/chat/android/client/extensions/AttachmentExtensionsKt;->getWaveformData(Lio/getstream/chat/android/models/Attachment;)Ljava/util/List;

    move-result-object v6

    if-nez v6, :cond_3

    sget-object v6, Lm83/y;->w:Lm83/y;

    :cond_3
    iget-object v7, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->audioPlayer:Lio/getstream/chat/android/client/audio/AudioPlayer;

    invoke-interface {v7, v2}, Lio/getstream/chat/android/client/audio/AudioPlayer;->getCurrentPositionInMs(I)I

    move-result v7

    invoke-static {v1}, Lio/getstream/chat/android/client/extensions/AttachmentExtensionsKt;->getDuration(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/Float;

    move-result-object v1

    const/4 v8, 0x0

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    goto :goto_0

    :cond_4
    move v1, v8

    :goto_0
    const/high16 v9, 0x447a0000    # 1000.0f

    mul-float/2addr v1, v9

    float-to-int v1, v1

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getSeekTo()La0/n;

    move-result-object v9

    invoke-virtual {v9, v2}, La0/n;->a(I)I

    move-result v10

    if-ltz v10, :cond_5

    iget-object v9, v9, La0/n;->c:[F

    aget v9, v9, v10

    goto :goto_1

    :cond_5
    move v9, v8

    :goto_1
    cmpl-float v8, v9, v8

    if-lez v8, :cond_6

    int-to-float v7, v1

    mul-float/2addr v9, v7

    float-to-int v7, v9

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getLogger()Lb23/k;

    move-result-object v9

    iget-object v10, v9, Lb23/k;->c:Lb23/e;

    iget-object v11, v9, Lb23/k;->a:Ljava/lang/String;

    sget-object v12, Lb23/g;->x:Lb23/g;

    invoke-interface {v10, v12, v11}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_6

    iget-object v9, v9, Lb23/k;->b:Lb23/j;

    const-string v10, "[play] seekTo: "

    invoke-static {v7, v10}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v9, v12, v11, v10, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getLogger()Lb23/k;

    move-result-object v9

    iget-object v10, v9, Lb23/k;->c:Lb23/e;

    iget-object v11, v9, Lb23/k;->a:Ljava/lang/String;

    sget-object v12, Lb23/g;->y:Lb23/g;

    invoke-interface {v10, v12, v11}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_7

    iget-object v9, v9, Lb23/k;->b:Lb23/j;

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->stringify()Ljava/lang/String;

    move-result-object v10

    const-string v13, ", playbackInMs: "

    const-string v14, ", state: "

    const-string v15, "[play] audioHash: "

    invoke-static {v2, v7, v15, v13, v14}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v9, v12, v11, v10, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    move-object v3, v6

    move v6, v1

    move-object v1, v4

    move-object v4, v3

    move-object v3, v5

    move v5, v7

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->newCurrentState(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;ILjava/lang/String;Ljava/util/List;II)Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->setState(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;)V

    if-lez v8, :cond_8

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->audioPlayer:Lio/getstream/chat/android/client/audio/AudioPlayer;

    invoke-interface {v1, v5, v2}, Lio/getstream/chat/android/client/audio/AudioPlayer;->seekTo(II)V

    :cond_8
    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->audioPlayer:Lio/getstream/chat/android/client/audio/AudioPlayer;

    new-instance v4, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController$play$4;

    invoke-direct {v4, v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController$play$4;-><init>(Ljava/lang/Object;)V

    invoke-interface {v1, v2, v4}, Lio/getstream/chat/android/client/audio/AudioPlayer;->registerOnAudioStateChange(ILkotlin/jvm/functions/Function1;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->audioPlayer:Lio/getstream/chat/android/client/audio/AudioPlayer;

    new-instance v4, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController$play$5;

    invoke-direct {v4, v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController$play$5;-><init>(Ljava/lang/Object;)V

    invoke-interface {v1, v2, v4}, Lio/getstream/chat/android/client/audio/AudioPlayer;->registerOnProgressStateChange(ILkotlin/jvm/functions/Function1;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->audioPlayer:Lio/getstream/chat/android/client/audio/AudioPlayer;

    new-instance v4, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController$play$6;

    invoke-direct {v4, v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController$play$6;-><init>(Ljava/lang/Object;)V

    invoke-interface {v1, v2, v4}, Lio/getstream/chat/android/client/audio/AudioPlayer;->registerOnSpeedChange(ILkotlin/jvm/functions/Function1;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->audioPlayer:Lio/getstream/chat/android/client/audio/AudioPlayer;

    invoke-interface {v1, v3, v2}, Lio/getstream/chat/android/client/audio/AudioPlayer;->play(Ljava/lang/String;I)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->audioPlayer:Lio/getstream/chat/android/client/audio/AudioPlayer;

    invoke-interface {v1}, Lio/getstream/chat/android/client/audio/AudioPlayer;->getCurrentState()Lio/getstream/chat/android/client/audio/AudioState;

    move-result-object v1

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->state:Lec3/p1;

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v4

    sget-object v2, Lio/getstream/chat/android/client/audio/AudioState;->LOADING:Lio/getstream/chat/android/client/audio/AudioState;

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-ne v1, v2, :cond_9

    move v12, v6

    goto :goto_2

    :cond_9
    move v12, v5

    :goto_2
    sget-object v2, Lio/getstream/chat/android/client/audio/AudioState;->PLAYING:Lio/getstream/chat/android/client/audio/AudioState;

    if-ne v1, v2, :cond_a

    move v13, v6

    goto :goto_3

    :cond_a
    move v13, v5

    :goto_3
    const/16 v15, 0x27f

    const/16 v16, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    invoke-static/range {v4 .. v16}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;IFFLjava/lang/String;Ljava/util/List;IIZZZILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v4

    const/16 v8, 0xe

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;La0/n;La0/n;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->setState(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;)V

    return-void
.end method

.method public final plus$stream_chat_android_ui_common_release(La0/n;Ll83/k;)La0/n;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La0/n;",
            "Ll83/k;",
            ")",
            "La0/n;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "<this>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "that"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, La0/d0;

    iget v3, v0, La0/n;->e:I

    add-int/lit8 v3, v3, 0x1

    invoke-direct {v2, v3}, La0/d0;-><init>(I)V

    iget-object v3, v0, La0/n;->b:[I

    iget-object v4, v0, La0/n;->c:[F

    iget-object v0, v0, La0/n;->a:[J

    array-length v5, v0

    add-int/lit8 v5, v5, -0x2

    if-ltz v5, :cond_3

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    aget-wide v8, v0, v7

    not-long v10, v8

    const/4 v12, 0x7

    shl-long/2addr v10, v12

    and-long/2addr v10, v8

    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v10, v12

    cmp-long v10, v10, v12

    if-eqz v10, :cond_2

    sub-int v10, v7, v5

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v11, 0x8

    rsub-int/lit8 v10, v10, 0x8

    move v12, v6

    :goto_1
    if-ge v12, v10, :cond_1

    const-wide/16 v13, 0xff

    and-long/2addr v13, v8

    const-wide/16 v15, 0x80

    cmp-long v13, v13, v15

    if-gez v13, :cond_0

    shl-int/lit8 v13, v7, 0x3

    add-int/2addr v13, v12

    aget v14, v3, v13

    aget v13, v4, v13

    invoke-virtual {v2, v13, v14}, La0/d0;->d(FI)V

    :cond_0
    shr-long/2addr v8, v11

    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    :cond_1
    if-ne v10, v11, :cond_3

    :cond_2
    if-eq v7, v5, :cond_3

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_3
    iget-object v0, v1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget-object v1, v1, Ll83/k;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-virtual {v2, v1, v0}, La0/d0;->d(FI)V

    return-object v2
.end method

.method public final reset()V
    .locals 8

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->state:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->y:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->getPlayingId()I

    move-result v0

    const-string v2, "[reset] state.playingId: "

    invoke-static {v0, v2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {v1, v3, v4, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->audioPlayer:Lio/getstream/chat/android/client/audio/AudioPlayer;

    invoke-interface {v0}, Lio/getstream/chat/android/client/audio/AudioPlayer;->reset()V

    new-instance v1, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;

    iget-object v5, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getRecordingUri:Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v7}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;-><init>(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;La0/n;La0/n;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->setState(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;)V

    return-void
.end method

.method public final resetAudio(Lio/getstream/chat/android/models/Attachment;)V
    .locals 6

    const-string v0, "attachment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isAudioRecording(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getType()Ljava/lang/String;

    move-result-object p1

    const-string v2, "[resetAudio] rejected (not an audio recording): "

    invoke-static {v2, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v4, v3, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getRecordingUri:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "[resetAudio] rejected (no recordingUri): "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v4, v3, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_1
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->hashCode()I

    move-result p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->state:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->getPlayingId()I

    move-result v0

    if-eq v0, p1, :cond_3

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v2, "[resetAudio] rejected (not playing): "

    invoke-static {p1, v2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v4, v3, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    return-void

    :cond_3
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->audioPlayer:Lio/getstream/chat/android/client/audio/AudioPlayer;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/audio/AudioPlayer;->resetAudio(I)V

    return-void
.end method

.method public final resume()V
    .locals 7

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->state:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->getPlayingId()I

    move-result v1

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->x:Lb23/g;

    invoke-interface {v1, v4, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[resume] rejected (no playingId)"

    invoke-interface {v0, v4, v2, v1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->isPlaying()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->x:Lb23/g;

    invoke-interface {v1, v4, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[resume] rejected (already playing)"

    invoke-interface {v0, v4, v2, v1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_1
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->audioPlayer:Lio/getstream/chat/android/client/audio/AudioPlayer;

    invoke-interface {v1}, Lio/getstream/chat/android/client/audio/AudioPlayer;->getCurrentState()Lio/getstream/chat/android/client/audio/AudioState;

    move-result-object v1

    sget-object v2, Lio/getstream/chat/android/client/audio/AudioState;->IDLE:Lio/getstream/chat/android/client/audio/AudioState;

    if-eq v1, v2, :cond_4

    sget-object v2, Lio/getstream/chat/android/client/audio/AudioState;->PAUSE:Lio/getstream/chat/android/client/audio/AudioState;

    if-ne v1, v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v6, "[resume] rejected (not idle or paused): "

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v5, v4, v1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    return-void

    :cond_4
    :goto_0
    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->getPlayingId()I

    move-result v0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[resume] audioHash: "

    invoke-static {v0, v2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v5, v4, v2, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->audioPlayer:Lio/getstream/chat/android/client/audio/AudioPlayer;

    invoke-interface {v1, v0}, Lio/getstream/chat/android/client/audio/AudioPlayer;->resume(I)V

    return-void
.end method

.method public final seekTo(Lio/getstream/chat/android/models/Attachment;F)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "attachment"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isAudioRecording(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v4, v2, Lb23/k;->c:Lb23/e;

    iget-object v5, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->x:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Attachment;->getType()Ljava/lang/String;

    move-result-object v1

    const-string v4, "[seekTo] rejected (not an audio recording): "

    invoke-static {v4, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v6, v5, v1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getRecordingUri:Lkotlin/jvm/functions/Function1;

    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_2

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v4, v2, Lb23/k;->c:Lb23/e;

    iget-object v5, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->x:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v7, "[seekTo] rejected (no recordingUri): "

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v6, v5, v1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-void

    :cond_2
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Attachment;->hashCode()I

    move-result v2

    iget-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->state:Lec3/p1;

    check-cast v4, Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->getPlayingId()I

    move-result v4

    const/4 v6, 0x1

    if-ne v4, v2, :cond_3

    move v4, v6

    goto :goto_0

    :cond_3
    const/4 v4, 0x0

    :goto_0
    invoke-static {v1}, Lio/getstream/chat/android/client/extensions/AttachmentExtensionsKt;->getDuration(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/Float;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    :goto_1
    mul-float v1, v1, p2

    const/high16 v7, 0x447a0000    # 1000.0f

    mul-float/2addr v1, v7

    float-to-int v13, v1

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v7, v1, Lb23/k;->c:Lb23/e;

    iget-object v8, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v9, Lb23/g;->z:Lb23/g;

    invoke-interface {v7, v9, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_5

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->stringify()Ljava/lang/String;

    move-result-object v7

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "[seekTo] isCurrentAudio: "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v11, ", positionInMs: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v11, ", audioHash: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v11, ", state: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v1, v9, v8, v7, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->audioPlayer:Lio/getstream/chat/android/client/audio/AudioPlayer;

    invoke-interface {v1, v13, v2}, Lio/getstream/chat/android/client/audio/AudioPlayer;->seekTo(II)V

    if-ne v4, v6, :cond_6

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v7

    const/16 v18, 0x1db

    const/16 v19, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move/from16 v10, p2

    invoke-static/range {v7 .. v19}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;IFFLjava/lang/String;Ljava/util/List;IIZZZILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v1

    :goto_2
    move-object v6, v1

    goto :goto_3

    :cond_6
    invoke-virtual {v5}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v1

    goto :goto_2

    :goto_3
    invoke-virtual {v5}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getSeekTo()La0/n;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static/range {p2 .. p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    new-instance v4, Ll83/k;

    invoke-direct {v4, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v4}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->plus$stream_chat_android_ui_common_release(La0/n;Ll83/k;)La0/n;

    move-result-object v7

    const/16 v10, 0xc

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v5 .. v11}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;La0/n;La0/n;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->setState(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;)V

    return-void
.end method

.method public final startSeek(Lio/getstream/chat/android/models/Attachment;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "attachment"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isAudioRecording(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v4, v2, Lb23/k;->c:Lb23/e;

    iget-object v5, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->x:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Attachment;->getType()Ljava/lang/String;

    move-result-object v1

    const-string v4, "[startSeek] rejected (not an audio recording): "

    invoke-static {v4, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v6, v5, v1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getRecordingUri:Lkotlin/jvm/functions/Function1;

    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_1

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v4, v2, Lb23/k;->c:Lb23/e;

    iget-object v5, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->x:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v7, "[startSeek] rejected (no recordingUri): "

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v6, v5, v1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_1
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Attachment;->hashCode()I

    move-result v1

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->state:Lec3/p1;

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->getPlayingId()I

    move-result v2

    if-eq v2, v1, :cond_3

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v4, v2, Lb23/k;->c:Lb23/e;

    iget-object v5, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->x:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    const-string v4, "[startSeek] rejected (not playing): "

    invoke-static {v1, v4}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v6, v5, v1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    return-void

    :cond_3
    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v5, v2, Lb23/k;->c:Lb23/e;

    iget-object v6, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->z:Lb23/g;

    invoke-interface {v5, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->getPlayingId()I

    move-result v5

    const-string v8, "[startSeek] audioHash: "

    invoke-static {v5, v8}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v7, v6, v5, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->audioPlayer:Lio/getstream/chat/android/client/audio/AudioPlayer;

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->getPlayingId()I

    move-result v3

    invoke-interface {v2, v3}, Lio/getstream/chat/android/client/audio/AudioPlayer;->startSeek(I)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->audioPlayer:Lio/getstream/chat/android/client/audio/AudioPlayer;

    invoke-interface {v2}, Lio/getstream/chat/android/client/audio/AudioPlayer;->getCurrentState()Lio/getstream/chat/android/client/audio/AudioState;

    move-result-object v2

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->getPlayingId()I

    move-result v3

    if-ne v3, v1, :cond_6

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v5

    sget-object v1, Lio/getstream/chat/android/client/audio/AudioState;->PLAYING:Lio/getstream/chat/android/client/audio/AudioState;

    if-ne v2, v1, :cond_5

    const/4 v1, 0x1

    :goto_0
    move v14, v1

    goto :goto_1

    :cond_5
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    const/16 v16, 0xff

    const/16 v17, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x1

    invoke-static/range {v5 .. v17}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;IFFLjava/lang/String;Ljava/util/List;IIZZZILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v1

    :goto_2
    move-object v5, v1

    goto :goto_3

    :cond_6
    invoke-virtual {v4}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v1

    goto :goto_2

    :goto_3
    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;La0/n;La0/n;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->setState(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;)V

    return-void
.end method

.method public final togglePlayback(Lio/getstream/chat/android/models/Attachment;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "attachment"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isAudioRecording(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v4, v2, Lb23/k;->c:Lb23/e;

    iget-object v5, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->x:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Attachment;->getType()Ljava/lang/String;

    move-result-object v1

    const-string v4, "[togglePlayback] rejected (not an audio recording): "

    invoke-static {v4, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v6, v5, v1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getRecordingUri:Lkotlin/jvm/functions/Function1;

    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_2

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v4, v2, Lb23/k;->c:Lb23/e;

    iget-object v5, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->x:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v7, "[togglePlayback] rejected (no recordingUri): "

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v6, v5, v1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-void

    :cond_2
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Attachment;->hashCode()I

    move-result v2

    iget-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->state:Lec3/p1;

    check-cast v4, Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;

    iget-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->audioPlayer:Lio/getstream/chat/android/client/audio/AudioPlayer;

    invoke-interface {v4}, Lio/getstream/chat/android/client/audio/AudioPlayer;->getCurrentPlayingId()I

    move-result v4

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v6

    invoke-virtual {v6}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->getPlayingId()I

    move-result v6

    const/4 v8, 0x1

    if-ne v6, v2, :cond_3

    move v6, v8

    goto :goto_0

    :cond_3
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {v5}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v9

    invoke-virtual {v9}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->getPlayingProgress()F

    move-result v9

    const/4 v10, 0x0

    cmpl-float v10, v9, v10

    if-lez v10, :cond_4

    const/high16 v10, 0x3f800000    # 1.0f

    cmpg-float v9, v9, v10

    if-gez v9, :cond_4

    move v9, v8

    goto :goto_1

    :cond_4
    const/4 v9, 0x0

    :goto_1
    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->getLogger()Lb23/k;

    move-result-object v10

    iget-object v11, v10, Lb23/k;->c:Lb23/e;

    iget-object v12, v10, Lb23/k;->a:Ljava/lang/String;

    sget-object v13, Lb23/g;->y:Lb23/g;

    invoke-interface {v11, v13, v12}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_5

    iget-object v10, v10, Lb23/k;->b:Lb23/j;

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->stringify()Ljava/lang/String;

    move-result-object v11

    const-string v14, ", currentPlayingId; "

    const-string v15, ", isCurrentTrack: "

    const-string v7, "[togglePlayback] audioHash: "

    invoke-static {v2, v4, v7, v14, v15}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v14, ", isProgressRunning: "

    const-string v15, ", state: "

    invoke-static {v7, v6, v14, v9, v15}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v10, v13, v12, v7, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    if-eqz v6, :cond_6

    if-eqz v9, :cond_6

    move v3, v8

    goto :goto_2

    :cond_6
    const/4 v3, 0x0

    :goto_2
    if-ne v4, v2, :cond_7

    move v7, v8

    goto :goto_3

    :cond_7
    const/4 v7, 0x0

    :goto_3
    if-eqz v3, :cond_9

    if-eqz v7, :cond_9

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->isPlaying()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->pause()V

    return-void

    :cond_8
    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->resume()V

    return-void

    :cond_9
    if-eqz v3, :cond_a

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getSeekTo()La0/n;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->getCurrent()Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;->getPlayingProgress()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    new-instance v6, Ll83/k;

    invoke-direct {v6, v2, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v3, v6}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->plus$stream_chat_android_ui_common_release(La0/n;Ll83/k;)La0/n;

    move-result-object v7

    const/16 v10, 0xd

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v5 .. v11}, Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState$CurrentAudioState;La0/n;La0/n;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;

    move-result-object v2

    invoke-direct {v0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->setState(Lio/getstream/chat/android/ui/common/state/messages/list/AudioPlayerState;)V

    invoke-virtual/range {p0 .. p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->play(Lio/getstream/chat/android/models/Attachment;)V

    return-void

    :cond_a
    invoke-virtual/range {p0 .. p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/AudioPlayerController;->play(Lio/getstream/chat/android/models/Attachment;)V

    return-void
.end method
