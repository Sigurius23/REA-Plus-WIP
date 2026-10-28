.class public final Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/audio/NativeMediaPlayer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u000f*\u0001@\u0008\u0001\u0018\u0000 Q2\u00020\u0001:\u0001QB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u000fJ\u000f\u0010\u0015\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u000fJ\u000f\u0010\u0018\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u000fJ\u001d\u0010\u001a\u001a\u00020\u000b2\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0004H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001d\u0010\u001c\u001a\u00020\u000b2\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0004H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ#\u0010\u001f\u001a\u00020\u000b2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0013\u0010!\u001a\u00020\u0005*\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008!\u0010\"J\u0013\u0010#\u001a\u00020\u0005*\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008#\u0010\"R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010$R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008&\u0010\'\u001a\u0004\u0008(\u0010)R(\u0010,\u001a\u0004\u0018\u00010\u00052\u0008\u0010+\u001a\u0004\u0018\u00010\u00058\u0002@BX\u0082\u000e\u00a2\u0006\u000c\n\u0004\u0008,\u0010-\"\u0004\u0008.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00081\u00102R\u001e\u00103\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00083\u0010$R$\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00084\u00105R\u001e\u00106\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00086\u0010$R\u0016\u00107\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00087\u00108R*\u0010:\u001a\u0002092\u0006\u0010+\u001a\u0002098\u0016@VX\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008:\u0010;\u001a\u0004\u0008<\u0010=\"\u0004\u0008>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008A\u0010BR$\u0010H\u001a\u00020C2\u0006\u0010+\u001a\u00020C8V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008D\u0010E\"\u0004\u0008F\u0010GR\u0014\u0010K\u001a\u00020\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008I\u0010JR\u0014\u0010M\u001a\u00020\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008L\u0010JR\u0014\u0010P\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008N\u0010O\u00a8\u0006R"
    }
    d2 = {
        "Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;",
        "Lio/getstream/chat/android/client/audio/NativeMediaPlayer;",
        "Lz8/e;",
        "dataSourceFactory",
        "Lkotlin/Function0;",
        "Landroidx/media3/exoplayer/ExoPlayer;",
        "builder",
        "<init>",
        "(Lz8/e;Lc93/a;)V",
        "",
        "path",
        "Ll83/a0;",
        "setDataSource",
        "(Ljava/lang/String;)V",
        "prepareAsync",
        "()V",
        "",
        "msec",
        "seekTo",
        "(I)V",
        "start",
        "pause",
        "stop",
        "reset",
        "release",
        "listener",
        "setOnPreparedListener",
        "(Lc93/a;)V",
        "setOnCompletionListener",
        "Lkotlin/Function1;",
        "",
        "setOnErrorListener",
        "(Lkotlin/jvm/functions/Function1;)V",
        "setupListeners",
        "(Landroidx/media3/exoplayer/ExoPlayer;)Landroidx/media3/exoplayer/ExoPlayer;",
        "clearListeners",
        "Lc93/a;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "value",
        "_exoPlayer",
        "Landroidx/media3/exoplayer/ExoPlayer;",
        "set_exoPlayer",
        "(Landroidx/media3/exoplayer/ExoPlayer;)V",
        "Ll9/b0;",
        "mediaSourceFactory",
        "Ll9/b0;",
        "onCompletionListener",
        "onErrorListener",
        "Lkotlin/jvm/functions/Function1;",
        "onPreparedListener",
        "isPreparing",
        "Z",
        "Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;",
        "state",
        "Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;",
        "getState",
        "()Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;",
        "setState",
        "(Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;)V",
        "io/getstream/chat/android/client/audio/NativeMediaPlayerImpl$playerListener$1",
        "playerListener",
        "Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl$playerListener$1;",
        "",
        "getSpeed",
        "()F",
        "setSpeed",
        "(F)V",
        "speed",
        "getCurrentPosition",
        "()I",
        "currentPosition",
        "getDuration",
        "duration",
        "getExoPlayer",
        "()Landroidx/media3/exoplayer/ExoPlayer;",
        "exoPlayer",
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
.field public static final Companion:Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl$Companion;

.field private static final DEBUG:Z = false


# instance fields
.field private _exoPlayer:Landroidx/media3/exoplayer/ExoPlayer;

.field private final builder:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private isPreparing:Z

.field private final logger$delegate:Ll83/h;

.field private final mediaSourceFactory:Ll9/b0;

.field private onCompletionListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private onErrorListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private onPreparedListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final playerListener:Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl$playerListener$1;

.field private state:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->Companion:Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl$Companion;

    return-void
.end method

.method public constructor <init>(Lz8/e;Lc93/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz8/e;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "dataSourceFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->builder:Lc93/a;

    const-string p2, "Chat:NativeMediaPlayer"

    invoke-static {p0, p2}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p2

    iput-object p2, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->logger$delegate:Ll83/h;

    new-instance p2, Ll9/u0;

    new-instance v0, Lt9/l;

    invoke-direct {v0}, Lt9/l;-><init>()V

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, v0, Lt9/l;->w:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    invoke-direct {p2, p1, v0}, Ll9/u0;-><init>(Lz8/e;Lt9/l;)V

    iput-object p2, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->mediaSourceFactory:Ll9/b0;

    sget-object p1, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->END:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    iput-object p1, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->state:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    new-instance p1, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl$playerListener$1;

    invoke-direct {p1, p0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl$playerListener$1;-><init>(Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->playerListener:Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl$playerListener$1;

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public static final synthetic access$getExoPlayer(Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;)Landroidx/media3/exoplayer/ExoPlayer;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->getExoPlayer()Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getLogger(Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;)Lb23/k;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->getLogger()Lb23/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getOnCompletionListener$p(Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;)Lc93/a;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->onCompletionListener:Lc93/a;

    return-object p0
.end method

.method public static final synthetic access$getOnErrorListener$p(Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;)Lkotlin/jvm/functions/Function1;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->onErrorListener:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final synthetic access$getOnPreparedListener$p(Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;)Lc93/a;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->onPreparedListener:Lc93/a;

    return-object p0
.end method

.method public static final synthetic access$isPreparing$p(Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;)Z
    .locals 0

    iget-boolean p0, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->isPreparing:Z

    return p0
.end method

.method public static final synthetic access$setPreparing$p(Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->isPreparing:Z

    return-void
.end method

.method private final clearListeners(Landroidx/media3/exoplayer/ExoPlayer;)Landroidx/media3/exoplayer/ExoPlayer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->playerListener:Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl$playerListener$1;

    check-cast p1, Lb9/f0;

    invoke-virtual {p1, v0}, Lb9/f0;->s0(Lu8/h0;)V

    return-object p1
.end method

.method private final getExoPlayer()Landroidx/media3/exoplayer/ExoPlayer;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->_exoPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->builder:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/media3/exoplayer/ExoPlayer;

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->setupListeners(Landroidx/media3/exoplayer/ExoPlayer;)Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->_exoPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    sget-object v1, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->IDLE:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    invoke-virtual {p0, v1}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->setState(Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;)V

    :cond_0
    return-object v0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final set_exoPlayer(Landroidx/media3/exoplayer/ExoPlayer;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->_exoPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    return-void
.end method

.method private final setupListeners(Landroidx/media3/exoplayer/ExoPlayer;)Landroidx/media3/exoplayer/ExoPlayer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->playerListener:Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl$playerListener$1;

    check-cast p1, Lb9/f0;

    invoke-virtual {p1, v0}, Lb9/f0;->Q(Lu8/h0;)V

    return-object p1
.end method


# virtual methods
.method public final getCurrentPosition()I
    .locals 2

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->getExoPlayer()Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object v0

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->a0()J

    move-result-wide v0

    long-to-int v0, v0

    return v0
.end method

.method public final getDuration()I
    .locals 2

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->getExoPlayer()Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object v0

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->f0()J

    move-result-wide v0

    long-to-int v0, v0

    return v0
.end method

.method public final getSpeed()F
    .locals 1

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->getExoPlayer()Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object v0

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->h0()Lu8/e0;

    move-result-object v0

    iget v0, v0, Lu8/e0;->a:F

    return v0
.end method

.method public final getState()Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->state:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    return-object v0
.end method

.method public final pause()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->getExoPlayer()Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object v0

    const/4 v1, 0x0

    check-cast v0, Lb9/f0;

    invoke-virtual {v0, v1}, Lb9/f0;->z0(Z)V

    sget-object v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->PAUSED:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->setState(Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;)V

    return-void
.end method

.method public final prepareAsync()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->getExoPlayer()Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->isPreparing:Z

    sget-object v1, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->PREPARING:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    invoke-virtual {p0, v1}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->setState(Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;)V

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->q0()V

    return-void
.end method

.method public final release()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->_exoPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->clearListeners(Landroidx/media3/exoplayer/ExoPlayer;)Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object v0

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->r0()V

    sget-object v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->END:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->setState(Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->_exoPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    return-void
.end method

.method public final reset()V
    .locals 1

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->getExoPlayer()Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object v0

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->F0()V

    invoke-virtual {v0}, La2/a;->i()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->isPreparing:Z

    sget-object v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->IDLE:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->setState(Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;)V

    return-void
.end method

.method public final seekTo(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->getExoPlayer()Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object v0

    int-to-long v1, p1

    check-cast v0, La2/a;

    invoke-virtual {v0, v1, v2}, La2/a;->I(J)V

    return-void
.end method

.method public final setDataSource(Ljava/lang/String;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/SecurityException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->getExoPlayer()Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object v0

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->getLogger()Lb23/k;

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

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v4

    const-string v5, "[setDataSource] exoPlayer: "

    const-string v6, ", path: "

    invoke-static {v4, v5, v6, p1}, Ld;->j(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3, v1, v4}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v1, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->mediaSourceFactory:Ll9/b0;

    invoke-static {p1}, Lu8/x;->b(Ljava/lang/String;)Lu8/x;

    move-result-object p1

    invoke-interface {v1, p1}, Ll9/b0;->b(Lu8/x;)Ll9/a;

    move-result-object p1

    const-string v1, "createMediaSource(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lb9/f0;

    invoke-virtual {v0, p1}, Lb9/f0;->w0(Ll9/a;)V

    sget-object p1, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->INITIALIZED:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->setState(Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;)V

    return-void
.end method

.method public final setOnCompletionListener(Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->onCompletionListener:Lc93/a;

    return-void
.end method

.method public final setOnErrorListener(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->onErrorListener:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setOnPreparedListener(Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->onPreparedListener:Lc93/a;

    return-void
.end method

.method public final setSpeed(F)V
    .locals 2

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->getExoPlayer()Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object v0

    new-instance v1, Lu8/e0;

    invoke-direct {v1, p1}, Lu8/e0;-><init>(F)V

    check-cast v0, Lb9/f0;

    invoke-virtual {v0, v1}, Lb9/f0;->A0(Lu8/e0;)V

    return-void
.end method

.method public final setState(Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->state:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    return-void
.end method

.method public final start()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->getExoPlayer()Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object v0

    const/4 v1, 0x1

    check-cast v0, Lb9/f0;

    invoke-virtual {v0, v1}, Lb9/f0;->z0(Z)V

    sget-object v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->STARTED:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->setState(Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;)V

    return-void
.end method

.method public final stop()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->getExoPlayer()Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object v0

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->F0()V

    sget-object v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->STOPPED:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->setState(Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;)V

    return-void
.end method
