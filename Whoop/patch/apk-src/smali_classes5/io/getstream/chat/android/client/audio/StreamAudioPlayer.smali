.class public final Lio/getstream/chat/android/client/audio/StreamAudioPlayer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/audio/AudioPlayer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/audio/StreamAudioPlayer$Companion;,
        Lio/getstream/chat/android/client/audio/StreamAudioPlayer$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0010\n\u0002\u0010 \n\u0002\u0008\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u001d\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010%\n\u0002\u0010!\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010#\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008\u0000\u0018\u0000 ~2\u00020\u0001:\u0001~B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ+\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000cH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J+\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u000cH\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0011J+\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\u000cH\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0011J\'\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001f\u0010!\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008!\u0010 J\u0017\u0010\"\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\"\u0010#J\u000f\u0010$\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008$\u0010%J\u000f\u0010&\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008&\u0010\u001eJ\u0017\u0010\'\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\'\u0010(J\u001d\u0010+\u001a\u00020\u000e2\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\n0)H\u0016\u00a2\u0006\u0004\u0008+\u0010,J\u0017\u0010-\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008-\u0010(J\u000f\u0010.\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008.\u0010\u001eJ\u000f\u0010/\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008/\u0010\u001eJ\u0017\u00100\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u00080\u0010(J\u001f\u00102\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u00082\u00103J\u0017\u00104\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u00084\u00105J\u0017\u00106\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u00086\u0010(J\u000f\u00107\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u00087\u0010\u001eJ)\u0010:\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u00109\u001a\u000208H\u0002\u00a2\u0006\u0004\u0008:\u0010;J\u000f\u0010<\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008<\u0010\u001eJ\u001f\u0010=\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00109\u001a\u000208H\u0002\u00a2\u0006\u0004\u0008=\u0010>J\u001f\u0010@\u001a\u0002082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010?\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008@\u0010AJ\u0017\u0010B\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008B\u0010(J\u0017\u0010C\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008C\u0010(J\u0017\u0010D\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008D\u0010(J\u000f\u0010E\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008E\u0010\u001eJ\u000f\u0010F\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008F\u0010\u001eJ\u001f\u0010H\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010G\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008H\u0010IJ\u001f\u0010K\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010J\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008K\u0010LJ\u001f\u0010N\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010M\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008N\u0010OJ\u0013\u0010P\u001a\u000208*\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008P\u0010QJ\u0013\u0010R\u001a\u000208*\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008R\u0010QR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010SR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010TR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010UR\u001b\u0010[\u001a\u00020V8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008W\u0010X\u001a\u0004\u0008Y\u0010ZR2\u0010^\u001a \u0012\u0004\u0012\u00020\n\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000c0]0\\8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008^\u0010_R2\u0010`\u001a \u0012\u0004\u0012\u00020\n\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u000c0]0\\8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008`\u0010_R2\u0010a\u001a \u0012\u0004\u0012\u00020\n\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\u000c0]0\\8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008a\u0010_R\u001a\u0010c\u001a\u0008\u0012\u0004\u0012\u00020b0]8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008c\u0010dR\u001a\u0010f\u001a\u0008\u0012\u0004\u0012\u00020\n0e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008f\u0010gR \u0010h\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\\8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008h\u0010_R \u0010i\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00150\\8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008i\u0010_R$\u0010l\u001a\u00020j2\u0006\u0010k\u001a\u00020j8\u0002@BX\u0082\u000e\u00a2\u0006\u000c\n\u0004\u0008l\u0010m\"\u0004\u0008n\u0010oR\u0018\u0010q\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008q\u0010rR\u0016\u0010s\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008s\u0010tR\u0016\u0010u\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008u\u0010vR\u0016\u0010w\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008w\u0010tR\u0014\u0010z\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008x\u0010yR\u0014\u0010}\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008{\u0010|\u00a8\u0006\u007f"
    }
    d2 = {
        "Lio/getstream/chat/android/client/audio/StreamAudioPlayer;",
        "Lio/getstream/chat/android/client/audio/AudioPlayer;",
        "Lio/getstream/chat/android/client/audio/NativeMediaPlayer;",
        "mediaPlayer",
        "Lio/getstream/chat/android/client/scope/UserScope;",
        "userScope",
        "",
        "progressUpdatePeriod",
        "<init>",
        "(Lio/getstream/chat/android/client/audio/NativeMediaPlayer;Lio/getstream/chat/android/client/scope/UserScope;J)V",
        "",
        "audioHash",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/client/audio/AudioState;",
        "Ll83/a0;",
        "onAudioStateChange",
        "registerOnAudioStateChange",
        "(ILkotlin/jvm/functions/Function1;)V",
        "Lio/getstream/chat/android/client/audio/ProgressData;",
        "onProgressDataChange",
        "registerOnProgressStateChange",
        "",
        "onSpeedChange",
        "registerOnSpeedChange",
        "",
        "sourceUrl",
        "position",
        "registerTrack",
        "(Ljava/lang/String;II)V",
        "clearTracks",
        "()V",
        "prepare",
        "(Ljava/lang/String;I)V",
        "play",
        "changeSpeed",
        "(I)F",
        "currentSpeed",
        "()F",
        "dispose",
        "removeAudio",
        "(I)V",
        "",
        "audioHashList",
        "removeAudios",
        "(Ljava/util/List;)V",
        "resetAudio",
        "reset",
        "pause",
        "resume",
        "positionInMs",
        "seekTo",
        "(II)V",
        "getCurrentPositionInMs",
        "(I)I",
        "startSeek",
        "resetPlayer",
        "",
        "autoPlay",
        "setAudio",
        "(Ljava/lang/String;IZ)V",
        "start",
        "onPrepared",
        "(IZ)V",
        "errorCode",
        "onError",
        "(II)Z",
        "postOnComplete",
        "onComplete",
        "complete",
        "pollProgress",
        "stopPolling",
        "audioState",
        "publishAudioState",
        "(ILio/getstream/chat/android/client/audio/AudioState;)V",
        "progressData",
        "publishProgress",
        "(ILio/getstream/chat/android/client/audio/ProgressData;)V",
        "speed",
        "publishSpeed",
        "(IF)V",
        "isSeekable",
        "(Lio/getstream/chat/android/client/audio/NativeMediaPlayer;)Z",
        "isSpeedSettable",
        "Lio/getstream/chat/android/client/audio/NativeMediaPlayer;",
        "Lio/getstream/chat/android/client/scope/UserScope;",
        "J",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "",
        "",
        "onStateListeners",
        "Ljava/util/Map;",
        "onProgressListeners",
        "onSpeedListeners",
        "Lio/getstream/chat/android/client/audio/TrackInfo;",
        "audioTracks",
        "Ljava/util/List;",
        "",
        "registeredTrackHashSet",
        "Ljava/util/Set;",
        "seekMap",
        "speedMap",
        "Lio/getstream/chat/android/client/audio/PlayerState;",
        "value",
        "playerState",
        "Lio/getstream/chat/android/client/audio/PlayerState;",
        "setPlayerState",
        "(Lio/getstream/chat/android/client/audio/PlayerState;)V",
        "Lbc3/k1;",
        "pollJob",
        "Lbc3/k1;",
        "currentAudioHash",
        "I",
        "playingSpeed",
        "F",
        "currentIndex",
        "getCurrentPlayingId",
        "()I",
        "currentPlayingId",
        "getCurrentState",
        "()Lio/getstream/chat/android/client/audio/AudioState;",
        "currentState",
        "Companion",
        "stream-chat-android-client_release"
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
.field public static final Companion:Lio/getstream/chat/android/client/audio/StreamAudioPlayer$Companion;

.field private static final DEBUG_POLLING:Z = false

.field private static final INITIAL_SPEED:F = 1.0f

.field private static final SPEED_INCREMENT:F = 0.5f


# instance fields
.field private final audioTracks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/audio/TrackInfo;",
            ">;"
        }
    .end annotation
.end field

.field private currentAudioHash:I

.field private currentIndex:I

.field private final logger$delegate:Ll83/h;

.field private final mediaPlayer:Lio/getstream/chat/android/client/audio/NativeMediaPlayer;

.field private final onProgressListeners:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lkotlin/jvm/functions/Function1;",
            ">;>;"
        }
    .end annotation
.end field

.field private final onSpeedListeners:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lkotlin/jvm/functions/Function1;",
            ">;>;"
        }
    .end annotation
.end field

.field private final onStateListeners:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lkotlin/jvm/functions/Function1;",
            ">;>;"
        }
    .end annotation
.end field

.field private playerState:Lio/getstream/chat/android/client/audio/PlayerState;

.field private playingSpeed:F

.field private pollJob:Lbc3/k1;

.field private final progressUpdatePeriod:J

.field private final registeredTrackHashSet:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final seekMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final speedMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private final userScope:Lio/getstream/chat/android/client/scope/UserScope;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->Companion:Lio/getstream/chat/android/client/audio/StreamAudioPlayer$Companion;

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/client/audio/NativeMediaPlayer;Lio/getstream/chat/android/client/scope/UserScope;J)V
    .locals 1

    const-string v0, "mediaPlayer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->mediaPlayer:Lio/getstream/chat/android/client/audio/NativeMediaPlayer;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->userScope:Lio/getstream/chat/android/client/scope/UserScope;

    .line 4
    iput-wide p3, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->progressUpdatePeriod:J

    .line 5
    const-string p1, "Chat:StreamAudioPlayer"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->logger$delegate:Ll83/h;

    .line 6
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->onStateListeners:Ljava/util/Map;

    .line 7
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->onProgressListeners:Ljava/util/Map;

    .line 8
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->onSpeedListeners:Ljava/util/Map;

    .line 9
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->audioTracks:Ljava/util/List;

    .line 10
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->registeredTrackHashSet:Ljava/util/Set;

    .line 11
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->seekMap:Ljava/util/Map;

    .line 12
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->speedMap:Ljava/util/Map;

    .line 13
    sget-object p1, Lio/getstream/chat/android/client/audio/PlayerState;->UNSET:Lio/getstream/chat/android/client/audio/PlayerState;

    iput-object p1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->playerState:Lio/getstream/chat/android/client/audio/PlayerState;

    const/4 p1, -0x1

    .line 14
    iput p1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->currentAudioHash:I

    const/high16 p1, 0x3f800000    # 1.0f

    .line 15
    iput p1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->playingSpeed:F

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/client/audio/NativeMediaPlayer;Lio/getstream/chat/android/client/scope/UserScope;JILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    const-wide/16 p3, 0x32

    .line 16
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;-><init>(Lio/getstream/chat/android/client/audio/NativeMediaPlayer;Lio/getstream/chat/android/client/scope/UserScope;J)V

    return-void
.end method

.method public static synthetic a(ILio/getstream/chat/android/client/audio/TrackInfo;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->removeAudio$lambda$14(ILio/getstream/chat/android/client/audio/TrackInfo;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$complete(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;I)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->complete(I)V

    return-void
.end method

.method public static final synthetic access$getAudioTracks$p(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->audioTracks:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getLogger(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;)Lb23/k;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->getLogger()Lb23/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMediaPlayer$p(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;)Lio/getstream/chat/android/client/audio/NativeMediaPlayer;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->mediaPlayer:Lio/getstream/chat/android/client/audio/NativeMediaPlayer;

    return-object p0
.end method

.method public static final synthetic access$getOnProgressListeners$p(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->onProgressListeners:Ljava/util/Map;

    return-object p0
.end method

.method public static final synthetic access$getOnSpeedListeners$p(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->onSpeedListeners:Ljava/util/Map;

    return-object p0
.end method

.method public static final synthetic access$getOnStateListeners$p(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->onStateListeners:Ljava/util/Map;

    return-object p0
.end method

.method public static final synthetic access$getPlayerState$p(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;)Lio/getstream/chat/android/client/audio/PlayerState;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->playerState:Lio/getstream/chat/android/client/audio/PlayerState;

    return-object p0
.end method

.method public static final synthetic access$getProgressUpdatePeriod$p(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;)J
    .locals 2

    iget-wide v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->progressUpdatePeriod:J

    return-wide v0
.end method

.method public static final synthetic access$getSeekMap$p(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->seekMap:Ljava/util/Map;

    return-object p0
.end method

.method public static final synthetic access$getSpeedMap$p(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->speedMap:Ljava/util/Map;

    return-object p0
.end method

.method public static final synthetic access$publishProgress(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;ILio/getstream/chat/android/client/audio/ProgressData;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->publishProgress(ILio/getstream/chat/android/client/audio/ProgressData;)V

    return-void
.end method

.method public static final synthetic access$stopPolling(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;)V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->stopPolling()V

    return-void
.end method

.method public static b(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->onError(II)Z

    return-void
.end method

.method public static c(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;I)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->onComplete(I)V

    return-void
.end method

.method private final complete(I)V
    .locals 6

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->y:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "[complete] audioHash: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/audio/ProgressData;

    iget-object v1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->mediaPlayer:Lio/getstream/chat/android/client/audio/NativeMediaPlayer;

    invoke-interface {v1}, Lio/getstream/chat/android/client/audio/NativeMediaPlayer;->getDuration()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lio/getstream/chat/android/client/audio/ProgressData;-><init>(IFI)V

    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->publishProgress(ILio/getstream/chat/android/client/audio/ProgressData;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->stopPolling()V

    sget-object v0, Lio/getstream/chat/android/client/audio/PlayerState;->IDLE:Lio/getstream/chat/android/client/audio/PlayerState;

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->setPlayerState(Lio/getstream/chat/android/client/audio/PlayerState;)V

    sget-object v0, Lio/getstream/chat/android/client/audio/AudioState;->IDLE:Lio/getstream/chat/android/client/audio/AudioState;

    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->publishAudioState(ILio/getstream/chat/android/client/audio/AudioState;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->seekMap:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->getLogger()Lb23/k;

    move-result-object p1

    invoke-virtual {p1}, Lb23/k;->c()Lb23/e;

    move-result-object v0

    sget-object v1, Lb23/g;->x:Lb23/g;

    invoke-virtual {p1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lb23/k;->a()Lb23/j;

    move-result-object v0

    invoke-virtual {p1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object p1

    iget v2, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->currentIndex:I

    iget-object v3, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->audioTracks:Ljava/util/List;

    invoke-static {v3}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v3

    const-string v4, "[complete] currentIndex: "

    const-string v5, ", lastIndex: "

    invoke-static {v2, v3, v4, v5}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, p1, v2}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    iget p1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->currentIndex:I

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->audioTracks:Ljava/util/List;

    invoke-static {v0}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v0

    if-ge p1, v0, :cond_2

    iget-object p1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->audioTracks:Ljava/util/List;

    iget v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->currentIndex:I

    add-int/lit8 v0, v0, 0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/audio/TrackInfo;

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->resetPlayer()V

    invoke-virtual {p1}, Lio/getstream/chat/android/client/audio/TrackInfo;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/audio/TrackInfo;->getHash()I

    move-result v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->setAudio$default(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;Ljava/lang/String;IZILjava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public static d(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;IZ)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->onPrepared(IZ)V

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final isSeekable(Lio/getstream/chat/android/client/audio/NativeMediaPlayer;)Z
    .locals 2

    invoke-interface {p1}, Lio/getstream/chat/android/client/audio/NativeMediaPlayer;->getState()Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    move-result-object p1

    sget-object v0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    const/4 v1, 0x3

    if-eq p1, v1, :cond_0

    const/4 v1, 0x4

    if-eq p1, v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    return v0
.end method

.method private final isSpeedSettable(Lio/getstream/chat/android/client/audio/NativeMediaPlayer;)Z
    .locals 1

    invoke-interface {p1}, Lio/getstream/chat/android/client/audio/NativeMediaPlayer;->getState()Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    move-result-object p1

    sget-object v0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    return p1

    :pswitch_0
    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private final onComplete(I)V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->z:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "[onComplete] audioHash: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->complete(I)V

    return-void
.end method

.method private final onError(II)Z
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->F:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    const-string v3, "[onError] audioHash: "

    const-string v4, ", errorCode: "

    invoke-static {p1, p2, v3, v4}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, v2, v0, p2}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->complete(I)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->resetPlayer()V

    iget-object p1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->mediaPlayer:Lio/getstream/chat/android/client/audio/NativeMediaPlayer;

    invoke-interface {p1}, Lio/getstream/chat/android/client/audio/NativeMediaPlayer;->release()V

    const/4 p1, 0x1

    return p1
.end method

.method private final onPrepared(IZ)V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->z:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "[onPrepared] audioHash: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", autoPlay: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    sget-object v0, Lio/getstream/chat/android/client/audio/PlayerState;->IDLE:Lio/getstream/chat/android/client/audio/PlayerState;

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->setPlayerState(Lio/getstream/chat/android/client/audio/PlayerState;)V

    sget-object v0, Lio/getstream/chat/android/client/audio/AudioState;->IDLE:Lio/getstream/chat/android/client/audio/AudioState;

    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->publishAudioState(ILio/getstream/chat/android/client/audio/AudioState;)V

    if-eqz p2, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->start()V

    :cond_1
    return-void
.end method

.method private final pollProgress()V
    .locals 9

    iget v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->currentAudioHash:I

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->getLogger()Lb23/k;

    move-result-object v1

    invoke-virtual {v1}, Lb23/k;->c()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-virtual {v1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lb23/k;->a()Lb23/j;

    move-result-object v2

    invoke-virtual {v1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v4, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->mediaPlayer:Lio/getstream/chat/android/client/audio/NativeMediaPlayer;

    invoke-interface {v4}, Lio/getstream/chat/android/client/audio/NativeMediaPlayer;->getCurrentPosition()I

    move-result v4

    iget-object v5, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->mediaPlayer:Lio/getstream/chat/android/client/audio/NativeMediaPlayer;

    invoke-interface {v5}, Lio/getstream/chat/android/client/audio/NativeMediaPlayer;->getDuration()I

    move-result v5

    const-string v6, ", currentPosition: "

    const-string v7, ", duration: "

    const-string v8, "[pollProgress] #1; audioHash: "

    invoke-static {v0, v4, v8, v6, v7}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3, v1, v4}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->userScope:Lio/getstream/chat/android/client/scope/UserScope;

    sget-object v2, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {v2}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getMain()Lbc3/z;

    move-result-object v2

    new-instance v3, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$pollProgress$2;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v0, v4}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$pollProgress$2;-><init>(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;ILq83/d;)V

    const/4 v0, 0x2

    invoke-static {v1, v2, v4, v3, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->pollJob:Lbc3/k1;

    return-void
.end method

.method private final postOnComplete(I)V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->x:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "[postOnComplete] audioHash: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->userScope:Lio/getstream/chat/android/client/scope/UserScope;

    sget-object v1, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {v1}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getMain()Lbc3/z;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$postOnComplete$2;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p1, v3}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$postOnComplete$2;-><init>(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;ILq83/d;)V

    const/4 p1, 0x2

    invoke-static {v0, v1, v3, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final publishAudioState(ILio/getstream/chat/android/client/audio/AudioState;)V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->x:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "[publishAudioState] audioHash: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", audioState: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->onStateListeners:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method

.method private final publishProgress(ILio/getstream/chat/android/client/audio/ProgressData;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->onProgressListeners:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final publishSpeed(IF)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->onSpeedListeners:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static final removeAudio$lambda$14(ILio/getstream/chat/android/client/audio/TrackInfo;)Z
    .locals 1

    const-string v0, "trackInto"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/client/audio/TrackInfo;->getHash()I

    move-result p1

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private final resetPlayer()V
    .locals 7

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->x:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->playerState:Lio/getstream/chat/android/client/audio/PlayerState;

    iget v4, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->currentAudioHash:I

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "[resetPlayer] playerState: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", audioHash: "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->stopPolling()V

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->mediaPlayer:Lio/getstream/chat/android/client/audio/NativeMediaPlayer;

    invoke-interface {v0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayer;->reset()V

    sget-object v0, Lio/getstream/chat/android/client/audio/PlayerState;->UNSET:Lio/getstream/chat/android/client/audio/PlayerState;

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->setPlayerState(Lio/getstream/chat/android/client/audio/PlayerState;)V

    iget v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->currentAudioHash:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    sget-object v2, Lio/getstream/chat/android/client/audio/AudioState;->UNSET:Lio/getstream/chat/android/client/audio/AudioState;

    invoke-direct {p0, v0, v2}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->publishAudioState(ILio/getstream/chat/android/client/audio/AudioState;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->seekMap:Ljava/util/Map;

    iget v2, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->currentAudioHash:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iput v1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->currentAudioHash:I

    :cond_1
    return-void
.end method

.method private final setAudio(Ljava/lang/String;IZ)V
    .locals 6

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->y:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "[setAudio] audioHash: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ", autoPlay: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, ", sourceUrl.hash: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->audioTracks:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, -0x1

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/client/audio/TrackInfo;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/audio/TrackInfo;->getHash()I

    move-result v3

    if-ne v3, p2, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    move v2, v4

    :goto_1
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    if-ne v2, v4, :cond_3

    const/4 v0, 0x0

    :cond_3
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :cond_4
    iput v1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->currentIndex:I

    iput p2, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->currentAudioHash:I

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->mediaPlayer:Lio/getstream/chat/android/client/audio/NativeMediaPlayer;

    new-instance v1, Lio/getstream/chat/android/client/audio/a;

    invoke-direct {v1, p0, p2, p3}, Lio/getstream/chat/android/client/audio/a;-><init>(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;IZ)V

    invoke-interface {v0, v1}, Lio/getstream/chat/android/client/audio/NativeMediaPlayer;->setOnPreparedListener(Lc93/a;)V

    new-instance p3, Lf1/x;

    const/4 v1, 0x3

    invoke-direct {p3, p0, p2, v1}, Lf1/x;-><init>(Ljava/lang/Object;II)V

    invoke-interface {v0, p3}, Lio/getstream/chat/android/client/audio/NativeMediaPlayer;->setOnCompletionListener(Lc93/a;)V

    new-instance p3, Lcom/whoop/data/local/room/dao/wipeable/c;

    const/16 v1, 0x9

    invoke-direct {p3, p0, p2, v1}, Lcom/whoop/data/local/room/dao/wipeable/c;-><init>(Ljava/lang/Object;II)V

    invoke-interface {v0, p3}, Lio/getstream/chat/android/client/audio/NativeMediaPlayer;->setOnErrorListener(Lkotlin/jvm/functions/Function1;)V

    sget-object p2, Lio/getstream/chat/android/client/audio/PlayerState;->LOADING:Lio/getstream/chat/android/client/audio/PlayerState;

    invoke-direct {p0, p2}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->setPlayerState(Lio/getstream/chat/android/client/audio/PlayerState;)V

    iget p2, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->currentAudioHash:I

    sget-object p3, Lio/getstream/chat/android/client/audio/AudioState;->LOADING:Lio/getstream/chat/android/client/audio/AudioState;

    invoke-direct {p0, p2, p3}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->publishAudioState(ILio/getstream/chat/android/client/audio/AudioState;)V

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/audio/NativeMediaPlayer;->setDataSource(Ljava/lang/String;)V

    invoke-interface {v0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayer;->prepareAsync()V

    return-void
.end method

.method public static synthetic setAudio$default(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;Ljava/lang/String;IZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x1

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->setAudio(Ljava/lang/String;IZ)V

    return-void
.end method

.method private static final setAudio$lambda$27$lambda$24(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;IZ)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->onPrepared(IZ)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final setAudio$lambda$27$lambda$25(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;I)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->onComplete(I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final setAudio$lambda$27$lambda$26(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;II)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->onError(II)Z

    const/4 p0, 0x1

    return p0
.end method

.method private final setPlayerState(Lio/getstream/chat/android/client/audio/PlayerState;)V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->x:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "[setPlayerState] value: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iput-object p1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->playerState:Lio/getstream/chat/android/client/audio/PlayerState;

    return-void
.end method

.method private final start()V
    .locals 9

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->mediaPlayer:Lio/getstream/chat/android/client/audio/NativeMediaPlayer;

    invoke-interface {v0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayer;->getCurrentPosition()I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->currentAudioHash:I

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->getLogger()Lb23/k;

    move-result-object v2

    invoke-virtual {v2}, Lb23/k;->c()Lb23/e;

    move-result-object v3

    sget-object v4, Lb23/g;->y:Lb23/g;

    invoke-virtual {v2}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Lb23/k;->a()Lb23/j;

    move-result-object v3

    invoke-virtual {v2}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v2

    iget-object v5, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->playerState:Lio/getstream/chat/android/client/audio/PlayerState;

    const-string v6, ", currentPosition: "

    const-string v7, ", playerState: "

    const-string v8, "[start] currentAudioHash: "

    invoke-static {v1, v0, v8, v6, v7}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v4, v2, v0}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->playerState:Lio/getstream/chat/android/client/audio/PlayerState;

    sget-object v2, Lio/getstream/chat/android/client/audio/PlayerState;->IDLE:Lio/getstream/chat/android/client/audio/PlayerState;

    if-eq v0, v2, :cond_2

    sget-object v2, Lio/getstream/chat/android/client/audio/PlayerState;->PAUSE:Lio/getstream/chat/android/client/audio/PlayerState;

    if-ne v0, v2, :cond_1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_0
    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->seekMap:Ljava/util/Map;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    iget-object v2, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->mediaPlayer:Lio/getstream/chat/android/client/audio/NativeMediaPlayer;

    invoke-interface {v2}, Lio/getstream/chat/android/client/audio/NativeMediaPlayer;->getDuration()I

    move-result v2

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->getLogger()Lb23/k;

    move-result-object v3

    invoke-virtual {v3}, Lb23/k;->c()Lb23/e;

    move-result-object v4

    sget-object v5, Lb23/g;->x:Lb23/g;

    invoke-virtual {v3}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v5, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {v3}, Lb23/k;->a()Lb23/j;

    move-result-object v4

    invoke-virtual {v3}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    const-string v6, "[start] seekTo: "

    const-string v7, ", duration: "

    invoke-static {v0, v2, v6, v7}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v5, v3, v6}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    const/high16 v3, 0x3f800000    # 1.0f

    if-lt v0, v2, :cond_5

    new-instance v0, Lio/getstream/chat/android/client/audio/ProgressData;

    invoke-direct {v0, v2, v3, v2}, Lio/getstream/chat/android/client/audio/ProgressData;-><init>(IFI)V

    invoke-direct {p0, v1, v0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->publishProgress(ILio/getstream/chat/android/client/audio/ProgressData;)V

    invoke-direct {p0, v1}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->postOnComplete(I)V

    return-void

    :cond_5
    iget-object v2, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->mediaPlayer:Lio/getstream/chat/android/client/audio/NativeMediaPlayer;

    invoke-interface {v2, v0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayer;->seekTo(I)V

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->mediaPlayer:Lio/getstream/chat/android/client/audio/NativeMediaPlayer;

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->isSpeedSettable(Lio/getstream/chat/android/client/audio/NativeMediaPlayer;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->speedMap:Ljava/util/Map;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v3

    :cond_6
    iput v3, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->playingSpeed:F

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->mediaPlayer:Lio/getstream/chat/android/client/audio/NativeMediaPlayer;

    invoke-interface {v0, v3}, Lio/getstream/chat/android/client/audio/NativeMediaPlayer;->setSpeed(F)V

    invoke-direct {p0, v1, v3}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->publishSpeed(IF)V

    :cond_7
    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->mediaPlayer:Lio/getstream/chat/android/client/audio/NativeMediaPlayer;

    invoke-interface {v0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayer;->start()V

    sget-object v0, Lio/getstream/chat/android/client/audio/PlayerState;->PLAYING:Lio/getstream/chat/android/client/audio/PlayerState;

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->setPlayerState(Lio/getstream/chat/android/client/audio/PlayerState;)V

    sget-object v0, Lio/getstream/chat/android/client/audio/AudioState;->PLAYING:Lio/getstream/chat/android/client/audio/AudioState;

    invoke-direct {p0, v1, v0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->publishAudioState(ILio/getstream/chat/android/client/audio/AudioState;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->pollProgress()V

    return-void
.end method

.method private final stopPolling()V
    .locals 4

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->x:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    const-string v3, "[stopPolling] no args"

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->pollJob:Lbc3/k1;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final changeSpeed(I)F
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->z:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "[changeSpeed] audioHash: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->speedMap:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    const/high16 v2, 0x40000000    # 2.0f

    cmpl-float v2, v0, v2

    if-gez v2, :cond_3

    cmpg-float v2, v0, v1

    if-gez v2, :cond_2

    goto :goto_1

    :cond_2
    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v1, v0

    :cond_3
    :goto_1
    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->speedMap:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->currentAudioHash:I

    if-ne v0, p1, :cond_4

    iput v1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->playingSpeed:F

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->playerState:Lio/getstream/chat/android/client/audio/PlayerState;

    sget-object v2, Lio/getstream/chat/android/client/audio/PlayerState;->PLAYING:Lio/getstream/chat/android/client/audio/PlayerState;

    if-ne v0, v2, :cond_4

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->mediaPlayer:Lio/getstream/chat/android/client/audio/NativeMediaPlayer;

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->isSpeedSettable(Lio/getstream/chat/android/client/audio/NativeMediaPlayer;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->mediaPlayer:Lio/getstream/chat/android/client/audio/NativeMediaPlayer;

    invoke-interface {v0, v1}, Lio/getstream/chat/android/client/audio/NativeMediaPlayer;->setSpeed(F)V

    :cond_4
    invoke-direct {p0, p1, v1}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->publishSpeed(IF)V

    return v1
.end method

.method public final clearTracks()V
    .locals 4

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->z:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    const-string v3, "[clearTracks] no args"

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->registeredTrackHashSet:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->audioTracks:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public final currentSpeed()F
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->mediaPlayer:Lio/getstream/chat/android/client/audio/NativeMediaPlayer;

    invoke-interface {v0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayer;->getSpeed()F

    move-result v0

    return v0
.end method

.method public final dispose()V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->userScope:Lio/getstream/chat/android/client/scope/UserScope;

    sget-object v1, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {v1}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getMain()Lbc3/z;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$dispose$1;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$dispose$1;-><init>(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;Lq83/d;)V

    const/4 v4, 0x2

    invoke-static {v0, v1, v3, v2, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final getCurrentPlayingId()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->currentAudioHash:I

    return v0
.end method

.method public final getCurrentPositionInMs(I)I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->currentIndex:I

    if-ne v0, p1, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->mediaPlayer:Lio/getstream/chat/android/client/audio/NativeMediaPlayer;

    invoke-interface {p1}, Lio/getstream/chat/android/client/audio/NativeMediaPlayer;->getCurrentPosition()I

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->seekMap:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final getCurrentState()Lio/getstream/chat/android/client/audio/AudioState;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->playerState:Lio/getstream/chat/android/client/audio/PlayerState;

    sget-object v1, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    sget-object v0, Lio/getstream/chat/android/client/audio/AudioState;->PLAYING:Lio/getstream/chat/android/client/audio/AudioState;

    return-object v0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    sget-object v0, Lio/getstream/chat/android/client/audio/AudioState;->PAUSE:Lio/getstream/chat/android/client/audio/AudioState;

    return-object v0

    :cond_2
    sget-object v0, Lio/getstream/chat/android/client/audio/AudioState;->IDLE:Lio/getstream/chat/android/client/audio/AudioState;

    return-object v0

    :cond_3
    sget-object v0, Lio/getstream/chat/android/client/audio/AudioState;->LOADING:Lio/getstream/chat/android/client/audio/AudioState;

    return-object v0

    :cond_4
    sget-object v0, Lio/getstream/chat/android/client/audio/AudioState;->UNSET:Lio/getstream/chat/android/client/audio/AudioState;

    return-object v0
.end method

.method public final pause()V
    .locals 7

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->y:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->playerState:Lio/getstream/chat/android/client/audio/PlayerState;

    iget v4, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->currentAudioHash:I

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "[pause] playerState: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", currentAudioHash: "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->playerState:Lio/getstream/chat/android/client/audio/PlayerState;

    sget-object v1, Lio/getstream/chat/android/client/audio/PlayerState;->PLAYING:Lio/getstream/chat/android/client/audio/PlayerState;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->mediaPlayer:Lio/getstream/chat/android/client/audio/NativeMediaPlayer;

    invoke-interface {v0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayer;->pause()V

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->seekMap:Ljava/util/Map;

    iget v1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->currentAudioHash:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->mediaPlayer:Lio/getstream/chat/android/client/audio/NativeMediaPlayer;

    invoke-interface {v2}, Lio/getstream/chat/android/client/audio/NativeMediaPlayer;->getCurrentPosition()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lio/getstream/chat/android/client/audio/PlayerState;->PAUSE:Lio/getstream/chat/android/client/audio/PlayerState;

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->setPlayerState(Lio/getstream/chat/android/client/audio/PlayerState;)V

    iget v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->currentAudioHash:I

    sget-object v1, Lio/getstream/chat/android/client/audio/AudioState;->PAUSE:Lio/getstream/chat/android/client/audio/AudioState;

    invoke-direct {p0, v0, v1}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->publishAudioState(ILio/getstream/chat/android/client/audio/AudioState;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->stopPolling()V

    :cond_1
    return-void
.end method

.method public final play(Ljava/lang/String;I)V
    .locals 9

    const-string v0, "sourceUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->z:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const-string v3, ", playerState: "

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    iget v4, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->currentAudioHash:I

    iget-object v5, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->playerState:Lio/getstream/chat/android/client/audio/PlayerState;

    const-string v6, "[play] audioHash("

    const-string v7, "): "

    invoke-static {v4, p2, v6, v7, v3}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v2, v0, v4}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->currentAudioHash:I

    const/4 v1, 0x1

    if-eq p2, v0, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->resetPlayer()V

    invoke-direct {p0, p1, p2, v1}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->setAudio(Ljava/lang/String;IZ)V

    return-void

    :cond_1
    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v2

    sget-object v4, Lb23/g;->x:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v2

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    iget v5, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->currentAudioHash:I

    iget-object v6, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->playerState:Lio/getstream/chat/android/client/audio/PlayerState;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "[play] currentAudioHash: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v4, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->playerState:Lio/getstream/chat/android/client/audio/PlayerState;

    sget-object v2, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    if-eq v0, v1, :cond_6

    const/4 p1, 0x2

    if-eq v0, p1, :cond_5

    const/4 p1, 0x3

    if-eq v0, p1, :cond_4

    const/4 p1, 0x4

    if-eq v0, p1, :cond_4

    const/4 p1, 0x5

    if-ne v0, p1, :cond_3

    invoke-virtual {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->pause()V

    return-void

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->start()V

    :cond_5
    return-void

    :cond_6
    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    invoke-static/range {v0 .. v5}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->setAudio$default(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;Ljava/lang/String;IZILjava/lang/Object;)V

    return-void
.end method

.method public final prepare(Ljava/lang/String;I)V
    .locals 6

    const-string v0, "sourceUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->y:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v3

    const-string v4, "[prepare] audioHash: "

    const-string v5, ", sourceUrl.hash: "

    invoke-static {p2, v3, v4, v5}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->currentAudioHash:I

    if-eq p2, v0, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->resetPlayer()V

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->setAudio(Ljava/lang/String;IZ)V

    :cond_1
    return-void
.end method

.method public final registerOnAudioStateChange(ILkotlin/jvm/functions/Function1;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "onAudioStateChange"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->x:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->onStateListeners:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->size()I

    move-result v3

    const-string v4, "[registerOnAudioStateChange] audioHash: "

    const-string v5, ", size: "

    invoke-static {p1, v3, v4, v5}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->onStateListeners:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->onStateListeners:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-static {v1}, Lwb3/f;->P([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final registerOnProgressStateChange(ILkotlin/jvm/functions/Function1;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "onProgressDataChange"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->x:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->onProgressListeners:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->size()I

    move-result v3

    const-string v4, "[registerOnProgressStateChange] audioHash: "

    const-string v5, ", size: "

    invoke-static {p1, v3, v4, v5}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->onProgressListeners:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->onProgressListeners:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-static {v1}, Lwb3/f;->P([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final registerOnSpeedChange(ILkotlin/jvm/functions/Function1;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "onSpeedChange"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->x:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->onSpeedListeners:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->size()I

    move-result v3

    const-string v4, "[registerOnSpeedChange] audioHash: "

    const-string v5, ", size: "

    invoke-static {p1, v3, v4, v5}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->onSpeedListeners:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->onSpeedListeners:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-static {v1}, Lwb3/f;->P([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final registerTrack(Ljava/lang/String;II)V
    .locals 7

    const-string v0, "sourceUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->z:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v3

    const-string v4, ", position: "

    const-string v5, ", sourceUrl.hash: "

    const-string v6, "[registerTrack] audioHash: "

    invoke-static {p2, p3, v6, v4, v5}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->registeredTrackHashSet:Ljava/util/Set;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->registeredTrackHashSet:Ljava/util/Set;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->audioTracks:Ljava/util/List;

    new-instance v1, Lio/getstream/chat/android/client/audio/TrackInfo;

    invoke-direct {v1, p1, p2, p3}, Lio/getstream/chat/android/client/audio/TrackInfo;-><init>(Ljava/lang/String;II)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->audioTracks:Ljava/util/List;

    invoke-static {p1}, Lm83/w;->k0(Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method public final removeAudio(I)V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->z:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "[removeAudio] audioHash: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->onStateListeners:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->onProgressListeners:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->onSpeedListeners:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->audioTracks:Ljava/util/List;

    new-instance v1, Lcom/whoop/data/local/room/dao/persistent/e;

    const/16 v2, 0x10

    invoke-direct {v1, p1, v2}, Lcom/whoop/data/local/room/dao/persistent/e;-><init>(II)V

    invoke-static {v0, v1}, Lm83/s;->j1(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->seekMap:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->speedMap:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final removeAudios(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "audioHashList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->z:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "[removeAudios] audioHashList.size: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->getLogger()Lb23/k;

    move-result-object v1

    invoke-virtual {v1}, Lb23/k;->c()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->x:Lb23/g;

    invoke-virtual {v1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Lb23/k;->a()Lb23/j;

    move-result-object v2

    invoke-virtual {v1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "[removeAudios] audioHash: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3, v1, v4}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p0, v0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->removeAudio(I)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final reset()V
    .locals 7

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->z:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->playerState:Lio/getstream/chat/android/client/audio/PlayerState;

    iget v4, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->currentAudioHash:I

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "[reset] playerState: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", currentAudioHash: "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->resetPlayer()V

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->onStateListeners:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->onProgressListeners:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->onSpeedListeners:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->audioTracks:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->seekMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->speedMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public final resetAudio(I)V
    .locals 6

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->z:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->playerState:Lio/getstream/chat/android/client/audio/PlayerState;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "[resetAudio] playerState: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", audioHash: "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->currentAudioHash:I

    if-ne p1, v0, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->resetPlayer()V

    :cond_1
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->removeAudio(I)V

    return-void
.end method

.method public final resume(I)V
    .locals 6

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->y:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->playerState:Lio/getstream/chat/android/client/audio/PlayerState;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "[resume] audioHash: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ", playerState: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->playerState:Lio/getstream/chat/android/client/audio/PlayerState;

    sget-object v1, Lio/getstream/chat/android/client/audio/PlayerState;->IDLE:Lio/getstream/chat/android/client/audio/PlayerState;

    if-eq v0, v1, :cond_1

    sget-object v1, Lio/getstream/chat/android/client/audio/PlayerState;->PAUSE:Lio/getstream/chat/android/client/audio/PlayerState;

    if-ne v0, v1, :cond_2

    :cond_1
    iget v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->currentAudioHash:I

    if-ne v0, p1, :cond_2

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->start()V

    :cond_2
    return-void
.end method

.method public final seekTo(II)V
    .locals 7

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->y:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->playerState:Lio/getstream/chat/android/client/audio/PlayerState;

    const-string v4, ", positionInMs: "

    const-string v5, ", playerState: "

    const-string v6, "[seekTo] audioHash: "

    invoke-static {p2, p1, v6, v4, v5}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->seekMap:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->currentAudioHash:I

    if-ne v0, p2, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->mediaPlayer:Lio/getstream/chat/android/client/audio/NativeMediaPlayer;

    invoke-direct {p0, p2}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->isSeekable(Lio/getstream/chat/android/client/audio/NativeMediaPlayer;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->mediaPlayer:Lio/getstream/chat/android/client/audio/NativeMediaPlayer;

    invoke-interface {p2, p1}, Lio/getstream/chat/android/client/audio/NativeMediaPlayer;->seekTo(I)V

    iget-object p2, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->mediaPlayer:Lio/getstream/chat/android/client/audio/NativeMediaPlayer;

    invoke-interface {p2}, Lio/getstream/chat/android/client/audio/NativeMediaPlayer;->getCurrentPosition()I

    move-result p2

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->mediaPlayer:Lio/getstream/chat/android/client/audio/NativeMediaPlayer;

    invoke-interface {v0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayer;->getDuration()I

    move-result v0

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->getLogger()Lb23/k;

    move-result-object v1

    invoke-virtual {v1}, Lb23/k;->c()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->x:Lb23/g;

    invoke-virtual {v1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Lb23/k;->a()Lb23/j;

    move-result-object v2

    invoke-virtual {v1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v1

    const-string v4, ", currentPosition: "

    const-string v5, ", duration: "

    const-string v6, "[seekTo] msec: "

    invoke-static {p1, p2, v6, v4, v5}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, v3, v1, p1}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final startSeek(I)V
    .locals 6

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->y:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->playerState:Lio/getstream/chat/android/client/audio/PlayerState;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "[startSeek] audioHash: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ", playerState: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->playerState:Lio/getstream/chat/android/client/audio/PlayerState;

    sget-object v1, Lio/getstream/chat/android/client/audio/PlayerState;->PLAYING:Lio/getstream/chat/android/client/audio/PlayerState;

    if-ne v0, v1, :cond_1

    iget v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->currentAudioHash:I

    if-ne v0, p1, :cond_1

    invoke-virtual {p0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->pause()V

    :cond_1
    return-void
.end method
