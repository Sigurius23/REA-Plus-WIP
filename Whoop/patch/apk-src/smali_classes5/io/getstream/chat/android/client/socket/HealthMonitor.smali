.class public final Lio/getstream/chat/android/client/socket/HealthMonitor;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/socket/HealthMonitor$ExponencialRetryInterval;,
        Lio/getstream/chat/android/client/socket/HealthMonitor$RetryInterval;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00020\u0001:\u000267B_\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u001c\u0010\u000b\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0008\u0012\u001c\u0010\u000c\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0008\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0010J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J?\u0010\u001e\u001a\u00020\u001d*\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00192\"\u0010\u001c\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bH\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\n\u00a2\u0006\u0004\u0008 \u0010\u0010J\r\u0010!\u001a\u00020\n\u00a2\u0006\u0004\u0008!\u0010\u0010J\r\u0010\"\u001a\u00020\n\u00a2\u0006\u0004\u0008\"\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010%R*\u0010\u000b\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010&R*\u0010\u000c\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010&R\u0016\u0010(\u001a\u00020\'8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u0016\u0010*\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008.\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008/\u0010-R\u001b\u00105\u001a\u0002008BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00081\u00102\u001a\u0004\u00083\u00104\u00a8\u00068"
    }
    d2 = {
        "Lio/getstream/chat/android/client/socket/HealthMonitor;",
        "",
        "Lio/getstream/chat/android/client/utils/TimeProvider;",
        "timeProvider",
        "Lio/getstream/chat/android/client/socket/HealthMonitor$RetryInterval;",
        "retryInterval",
        "Lio/getstream/chat/android/client/scope/UserScope;",
        "userScope",
        "Lkotlin/Function1;",
        "Lq83/d;",
        "Ll83/a0;",
        "checkCallback",
        "reconnectCallback",
        "<init>",
        "(Lio/getstream/chat/android/client/utils/TimeProvider;Lio/getstream/chat/android/client/socket/HealthMonitor$RetryInterval;Lio/getstream/chat/android/client/scope/UserScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V",
        "resetHealthMonitor",
        "()V",
        "postponeHealthMonitor",
        "postponeHealthCheck",
        "postponeReconnect",
        "stopAllJobs",
        "",
        "needToReconnect",
        "()Z",
        "Lbc3/c0;",
        "",
        "delayMilliseconds",
        "Lkotlin/Function2;",
        "block",
        "Lbc3/k1;",
        "launchDelayed",
        "(Lbc3/c0;JLc93/m;)Lbc3/k1;",
        "stop",
        "ack",
        "onDisconnected",
        "Lio/getstream/chat/android/client/utils/TimeProvider;",
        "Lio/getstream/chat/android/client/socket/HealthMonitor$RetryInterval;",
        "Lio/getstream/chat/android/client/scope/UserScope;",
        "Lkotlin/jvm/functions/Function1;",
        "",
        "consecutiveFailures",
        "I",
        "lastAck",
        "J",
        "healthMonitorJob",
        "Lbc3/k1;",
        "healthCheckJob",
        "reconnectJob",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "RetryInterval",
        "ExponencialRetryInterval",
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


# instance fields
.field private final checkCallback:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private consecutiveFailures:I

.field private healthCheckJob:Lbc3/k1;

.field private healthMonitorJob:Lbc3/k1;

.field private lastAck:J

.field private final logger$delegate:Ll83/h;

.field private final reconnectCallback:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private reconnectJob:Lbc3/k1;

.field private final retryInterval:Lio/getstream/chat/android/client/socket/HealthMonitor$RetryInterval;

.field private final timeProvider:Lio/getstream/chat/android/client/utils/TimeProvider;

.field private final userScope:Lio/getstream/chat/android/client/scope/UserScope;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/utils/TimeProvider;Lio/getstream/chat/android/client/socket/HealthMonitor$RetryInterval;Lio/getstream/chat/android/client/scope/UserScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/utils/TimeProvider;",
            "Lio/getstream/chat/android/client/socket/HealthMonitor$RetryInterval;",
            "Lio/getstream/chat/android/client/scope/UserScope;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "timeProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "retryInterval"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checkCallback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reconnectCallback"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/socket/HealthMonitor;->timeProvider:Lio/getstream/chat/android/client/utils/TimeProvider;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/client/socket/HealthMonitor;->retryInterval:Lio/getstream/chat/android/client/socket/HealthMonitor$RetryInterval;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/client/socket/HealthMonitor;->userScope:Lio/getstream/chat/android/client/scope/UserScope;

    .line 5
    iput-object p4, p0, Lio/getstream/chat/android/client/socket/HealthMonitor;->checkCallback:Lkotlin/jvm/functions/Function1;

    .line 6
    iput-object p5, p0, Lio/getstream/chat/android/client/socket/HealthMonitor;->reconnectCallback:Lkotlin/jvm/functions/Function1;

    .line 7
    const-string p1, "Chat:SocketMonitor"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/socket/HealthMonitor;->logger$delegate:Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/client/utils/TimeProvider;Lio/getstream/chat/android/client/socket/HealthMonitor$RetryInterval;Lio/getstream/chat/android/client/scope/UserScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    .line 8
    sget-object p1, Lio/getstream/chat/android/client/utils/TimeProvider;->INSTANCE:Lio/getstream/chat/android/client/utils/TimeProvider;

    :cond_0
    and-int/lit8 p6, p6, 0x2

    if-eqz p6, :cond_1

    .line 9
    sget-object p2, Lio/getstream/chat/android/client/socket/HealthMonitor$ExponencialRetryInterval;->INSTANCE:Lio/getstream/chat/android/client/socket/HealthMonitor$ExponencialRetryInterval;

    :cond_1
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 10
    invoke-direct/range {p2 .. p7}, Lio/getstream/chat/android/client/socket/HealthMonitor;-><init>(Lio/getstream/chat/android/client/utils/TimeProvider;Lio/getstream/chat/android/client/socket/HealthMonitor$RetryInterval;Lio/getstream/chat/android/client/scope/UserScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic access$getCheckCallback$p(Lio/getstream/chat/android/client/socket/HealthMonitor;)Lkotlin/jvm/functions/Function1;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/socket/HealthMonitor;->checkCallback:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final synthetic access$getReconnectCallback$p(Lio/getstream/chat/android/client/socket/HealthMonitor;)Lkotlin/jvm/functions/Function1;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/socket/HealthMonitor;->reconnectCallback:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final synthetic access$needToReconnect(Lio/getstream/chat/android/client/socket/HealthMonitor;)Z
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/HealthMonitor;->needToReconnect()Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$postponeHealthCheck(Lio/getstream/chat/android/client/socket/HealthMonitor;)V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/HealthMonitor;->postponeHealthCheck()V

    return-void
.end method

.method public static final synthetic access$postponeHealthMonitor(Lio/getstream/chat/android/client/socket/HealthMonitor;)V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/HealthMonitor;->postponeHealthMonitor()V

    return-void
.end method

.method public static final synthetic access$postponeReconnect(Lio/getstream/chat/android/client/socket/HealthMonitor;)V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/HealthMonitor;->postponeReconnect()V

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/HealthMonitor;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final launchDelayed(Lbc3/c0;JLc93/m;)Lbc3/k1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "J",
            "Lc93/m;",
            ")",
            "Lbc3/k1;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/client/socket/HealthMonitor$launchDelayed$1;

    const/4 v1, 0x0

    invoke-direct {v0, p2, p3, p4, v1}, Lio/getstream/chat/android/client/socket/HealthMonitor$launchDelayed$1;-><init>(JLc93/m;Lq83/d;)V

    const/4 p2, 0x3

    invoke-static {p1, v1, v1, v0, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    return-object p1
.end method

.method private final needToReconnect()Z
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/HealthMonitor;->timeProvider:Lio/getstream/chat/android/client/utils/TimeProvider;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lio/getstream/chat/android/client/socket/HealthMonitor;->lastAck:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x7530

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private final postponeHealthCheck()V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/HealthMonitor;->healthCheckJob:Lbc3/k1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/socket/HealthMonitor;->userScope:Lio/getstream/chat/android/client/scope/UserScope;

    new-instance v2, Lio/getstream/chat/android/client/socket/HealthMonitor$postponeHealthCheck$1;

    invoke-direct {v2, p0, v1}, Lio/getstream/chat/android/client/socket/HealthMonitor$postponeHealthCheck$1;-><init>(Lio/getstream/chat/android/client/socket/HealthMonitor;Lq83/d;)V

    const-wide/16 v3, 0x3e8

    invoke-direct {p0, v0, v3, v4, v2}, Lio/getstream/chat/android/client/socket/HealthMonitor;->launchDelayed(Lbc3/c0;JLc93/m;)Lbc3/k1;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/socket/HealthMonitor;->healthCheckJob:Lbc3/k1;

    return-void
.end method

.method private final postponeHealthMonitor()V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/HealthMonitor;->healthMonitorJob:Lbc3/k1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/socket/HealthMonitor;->userScope:Lio/getstream/chat/android/client/scope/UserScope;

    new-instance v2, Lio/getstream/chat/android/client/socket/HealthMonitor$postponeHealthMonitor$1;

    invoke-direct {v2, p0, v1}, Lio/getstream/chat/android/client/socket/HealthMonitor$postponeHealthMonitor$1;-><init>(Lio/getstream/chat/android/client/socket/HealthMonitor;Lq83/d;)V

    const-wide/16 v3, 0x2710

    invoke-direct {p0, v0, v3, v4, v2}, Lio/getstream/chat/android/client/socket/HealthMonitor;->launchDelayed(Lbc3/c0;JLc93/m;)Lbc3/k1;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/socket/HealthMonitor;->healthMonitorJob:Lbc3/k1;

    return-void
.end method

.method private final postponeReconnect()V
    .locals 8

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/HealthMonitor;->reconnectJob:Lbc3/k1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/socket/HealthMonitor;->retryInterval:Lio/getstream/chat/android/client/socket/HealthMonitor$RetryInterval;

    iget v2, p0, Lio/getstream/chat/android/client/socket/HealthMonitor;->consecutiveFailures:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lio/getstream/chat/android/client/socket/HealthMonitor;->consecutiveFailures:I

    invoke-interface {v0, v2}, Lio/getstream/chat/android/client/socket/HealthMonitor$RetryInterval;->nextInterval(I)J

    move-result-wide v2

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/HealthMonitor;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v4

    sget-object v5, Lb23/g;->z:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v5, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v4

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    const-string v6, "Next connection attempt in "

    const-string v7, " ms"

    invoke-static {v2, v3, v6, v7}, Lr80/c;->l(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v5, v0, v6}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/client/socket/HealthMonitor;->userScope:Lio/getstream/chat/android/client/scope/UserScope;

    new-instance v4, Lio/getstream/chat/android/client/socket/HealthMonitor$postponeReconnect$2;

    invoke-direct {v4, p0, v1}, Lio/getstream/chat/android/client/socket/HealthMonitor$postponeReconnect$2;-><init>(Lio/getstream/chat/android/client/socket/HealthMonitor;Lq83/d;)V

    invoke-direct {p0, v0, v2, v3, v4}, Lio/getstream/chat/android/client/socket/HealthMonitor;->launchDelayed(Lbc3/c0;JLc93/m;)Lbc3/k1;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/socket/HealthMonitor;->reconnectJob:Lbc3/k1;

    return-void
.end method

.method private final resetHealthMonitor()V
    .locals 2

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/HealthMonitor;->stopAllJobs()V

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/HealthMonitor;->timeProvider:Lio/getstream/chat/android/client/utils/TimeProvider;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lio/getstream/chat/android/client/socket/HealthMonitor;->lastAck:J

    const/4 v0, 0x0

    iput v0, p0, Lio/getstream/chat/android/client/socket/HealthMonitor;->consecutiveFailures:I

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/HealthMonitor;->postponeHealthMonitor()V

    return-void
.end method

.method private final stopAllJobs()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/HealthMonitor;->reconnectJob:Lbc3/k1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/socket/HealthMonitor;->healthCheckJob:Lbc3/k1;

    if-eqz v0, :cond_1

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/client/socket/HealthMonitor;->healthMonitorJob:Lbc3/k1;

    if-eqz v0, :cond_2

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final ack()V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/HealthMonitor;->resetHealthMonitor()V

    return-void
.end method

.method public final onDisconnected()V
    .locals 2

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/HealthMonitor;->stopAllJobs()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lio/getstream/chat/android/client/socket/HealthMonitor;->lastAck:J

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/HealthMonitor;->postponeReconnect()V

    return-void
.end method

.method public final stop()V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/HealthMonitor;->stopAllJobs()V

    return-void
.end method
