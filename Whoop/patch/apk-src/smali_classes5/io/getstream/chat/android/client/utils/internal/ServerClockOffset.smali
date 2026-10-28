.class public final Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/utils/internal/ServerClockOffset$Companion;
    }
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0012\u0008\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B+\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000f\u001a\u00020\nH\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\nH\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000\u00a2\u0006\u0004\u0008\u0017\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0012H\u0007\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\u001cR\u0016\u0010 \u001a\u00020\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008 \u0010\u001cR\u0016\u0010!\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008!\u0010\u001cR\u0016\u0010\"\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\"\u0010\u001c\u00a8\u0006$"
    }
    d2 = {
        "Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;",
        "",
        "Lkotlin/Function0;",
        "",
        "localTimeMs",
        "maxRttMs",
        "maxOffsetMs",
        "<init>",
        "(Lc93/a;JJ)V",
        "candidate",
        "Ll83/a0;",
        "acceptOffset",
        "(J)V",
        "onConnectionStarted$stream_chat_android_client_release",
        "()V",
        "onConnectionStarted",
        "onHealthCheckSent$stream_chat_android_client_release",
        "onHealthCheckSent",
        "Ljava/util/Date;",
        "serverTime",
        "onConnected$stream_chat_android_client_release",
        "(Ljava/util/Date;)V",
        "onConnected",
        "onHealthCheck$stream_chat_android_client_release",
        "onHealthCheck",
        "estimatedServerTime",
        "()Ljava/util/Date;",
        "Lc93/a;",
        "J",
        "lock",
        "Ljava/lang/Object;",
        "offsetMs",
        "bestRttMs",
        "healthCheckSentAtMs",
        "connectionStartedAtMs",
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
.field public static final Companion:Lio/getstream/chat/android/client/utils/internal/ServerClockOffset$Companion;

.field public static final DEFAULT_MAX_OFFSET_MS:J = 0x36ee80L

.field public static final DEFAULT_MAX_RTT_MS:J = 0x2af8L


# instance fields
.field private volatile bestRttMs:J

.field private volatile connectionStartedAtMs:J

.field private volatile healthCheckSentAtMs:J

.field private final localTimeMs:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final lock:Ljava/lang/Object;

.field private final maxOffsetMs:J

.field private final maxRttMs:J

.field private volatile offsetMs:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->Companion:Lio/getstream/chat/android/client/utils/internal/ServerClockOffset$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;-><init>(Lc93/a;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lc93/a;JJ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "JJ)V"
        }
    .end annotation

    const-string v0, "localTimeMs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->localTimeMs:Lc93/a;

    .line 4
    iput-wide p2, p0, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->maxRttMs:J

    .line 5
    iput-wide p4, p0, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->maxOffsetMs:J

    .line 6
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->lock:Ljava/lang/Object;

    const-wide p1, 0x7fffffffffffffffL

    .line 7
    iput-wide p1, p0, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->bestRttMs:J

    return-void
.end method

.method public synthetic constructor <init>(Lc93/a;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    .line 8
    new-instance p1, Lj02/w;

    const/16 p7, 0x19

    invoke-direct {p1, p7}, Lj02/w;-><init>(I)V

    :cond_0
    move-object v1, p1

    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    const-wide/16 p2, 0x2af8

    :cond_1
    move-wide v2, p2

    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    const-wide/32 p4, 0x36ee80

    :cond_2
    move-object v0, p0

    move-wide v4, p4

    .line 9
    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;-><init>(Lc93/a;JJ)V

    return-void
.end method

.method private static final _init_$lambda$0()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method private final acceptOffset(J)V
    .locals 4

    invoke-static {p1, p2}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    iget-wide v2, p0, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->maxOffsetMs:J

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    iput-wide p1, p0, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->offsetMs:J

    :cond_0
    return-void
.end method


# virtual methods
.method public final estimatedServerTime()Ljava/util/Date;
    .locals 5
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    new-instance v0, Ljava/util/Date;

    iget-object v1, p0, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->localTimeMs:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    iget-wide v3, p0, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->offsetMs:J

    sub-long/2addr v1, v3

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    return-object v0
.end method

.method public final onConnected$stream_chat_android_client_release(Ljava/util/Date;)V
    .locals 9

    const-string v0, "serverTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->lock:Ljava/lang/Object;

    monitor-enter v0

    const-wide v1, 0x7fffffffffffffffL

    :try_start_0
    iput-wide v1, p0, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->bestRttMs:J

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->healthCheckSentAtMs:J

    iput-wide v1, p0, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->offsetMs:J

    iget-object v3, p0, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->localTimeMs:Lc93/a;

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    iget-wide v5, p0, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->connectionStartedAtMs:J

    iput-wide v1, p0, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->connectionStartedAtMs:J

    cmp-long v1, v5, v1

    if-lez v1, :cond_0

    sub-long v1, v3, v5

    const-wide/16 v7, 0x1

    cmp-long v7, v7, v1

    if-gtz v7, :cond_0

    iget-wide v7, p0, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->maxRttMs:J

    cmp-long v7, v1, v7

    if-gtz v7, :cond_0

    add-long/2addr v5, v3

    const/4 v3, 0x2

    int-to-long v3, v3

    div-long/2addr v5, v3

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    sub-long/2addr v5, v3

    invoke-direct {p0, v5, v6}, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->acceptOffset(J)V

    iput-wide v1, p0, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->bestRttMs:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    sub-long/2addr v3, v1

    invoke-direct {p0, v3, v4}, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->acceptOffset(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0

    throw p1
.end method

.method public final onConnectionStarted$stream_chat_android_client_release()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->localTimeMs:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->connectionStartedAtMs:J

    return-void
.end method

.method public final onHealthCheck$stream_chat_android_client_release(Ljava/util/Date;)V
    .locals 9

    const-string v0, "serverTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-wide v1, p0, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->healthCheckSentAtMs:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-gtz v5, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    :try_start_1
    iput-wide v3, p0, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->healthCheckSentAtMs:J

    iget-object v3, p0, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->localTimeMs:Lc93/a;

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    sub-long v5, v3, v1

    const-wide/16 v7, 0x1

    cmp-long v7, v7, v5

    if-gtz v7, :cond_2

    iget-wide v7, p0, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->maxRttMs:J

    cmp-long v7, v5, v7

    if-gtz v7, :cond_2

    iget-wide v7, p0, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->bestRttMs:J

    cmp-long v7, v5, v7

    if-gez v7, :cond_1

    iput-wide v5, p0, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->bestRttMs:J

    add-long/2addr v1, v3

    const/4 v3, 0x2

    int-to-long v3, v3

    div-long/2addr v1, v3

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    sub-long/2addr v1, v3

    invoke-direct {p0, v1, v2}, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->acceptOffset(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :cond_2
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public final onHealthCheckSent$stream_chat_android_client_release()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->localTimeMs:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->healthCheckSentAtMs:J

    return-void
.end method
