.class public final Llive/hms/video/utils/HMSCoroutineScope;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbc3/c0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JA\u0010\u000e\u001a\u0006\u0012\u0002\u0008\u00030\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u000c\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0008\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJA\u0010\u0010\u001a\u0006\u0012\u0002\u0008\u00030\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u000c\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0008\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ5\u0010\u0014\u001a\u00020\u0013*\u00020\u00002\"\u0010\u0012\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0011\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u001f\u0010\u0018\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u0014\u0010$\u001a\u00020!8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010#\u00a8\u0006%"
    }
    d2 = {
        "Llive/hms/video/utils/HMSCoroutineScope;",
        "Lbc3/c0;",
        "<init>",
        "()V",
        "",
        "delay",
        "Ljava/util/concurrent/TimeUnit;",
        "unit",
        "Lkotlin/Function1;",
        "Lq83/d;",
        "Ll83/a0;",
        "",
        "task",
        "Ljava/util/concurrent/ScheduledFuture;",
        "scheduleWithFixedDelay",
        "(JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function1;)Ljava/util/concurrent/ScheduledFuture;",
        "schedule",
        "Lkotlin/Function2;",
        "block",
        "Lbc3/k1;",
        "launchWithTimeout",
        "(Llive/hms/video/utils/HMSCoroutineScope;Lc93/m;)Lbc3/k1;",
        "Ljava/util/concurrent/ScheduledExecutorService;",
        "kotlin.jvm.PlatformType",
        "executor",
        "Ljava/util/concurrent/ScheduledExecutorService;",
        "getExecutor",
        "()Ljava/util/concurrent/ScheduledExecutorService;",
        "Lbc3/c1;",
        "dispatcher",
        "Lbc3/c1;",
        "getDispatcher",
        "()Lbc3/c1;",
        "Lq83/j;",
        "getCoroutineContext",
        "()Lq83/j;",
        "coroutineContext",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

.field private static final dispatcher:Lbc3/c1;

.field private static final executor:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/utils/HMSCoroutineScope;

    invoke-direct {v0}, Llive/hms/video/utils/HMSCoroutineScope;-><init>()V

    sput-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v0, Lc33/a;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lc33/a;-><init>(I)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    sput-object v0, Llive/hms/video/utils/HMSCoroutineScope;->executor:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v1, Lbc3/d1;

    invoke-direct {v1, v0}, Lbc3/d1;-><init>(Ljava/util/concurrent/Executor;)V

    sput-object v1, Llive/hms/video/utils/HMSCoroutineScope;->dispatcher:Lbc3/c1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 0

    invoke-static {p0}, Llive/hms/video/utils/HMSCoroutineScope;->executor$lambda$0(Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-static {p0}, Llive/hms/video/utils/HMSCoroutineScope;->schedule$lambda$2(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-static {p0}, Llive/hms/video/utils/HMSCoroutineScope;->scheduleWithFixedDelay$lambda$1(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final executor$lambda$0(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 1

    new-instance v0, Ljava/lang/Thread;

    invoke-direct {v0, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    const-string p0, "hms-sdk-coroutine-thread"

    invoke-virtual {v0, p0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    return-object v0
.end method

.method public static synthetic schedule$default(Llive/hms/video/utils/HMSCoroutineScope;JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    sget-object p3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Llive/hms/video/utils/HMSCoroutineScope;->schedule(JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function1;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p0

    return-object p0
.end method

.method private static final schedule$lambda$2(Lkotlin/jvm/functions/Function1;)V
    .locals 3

    const-string v0, "$task"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/utils/HMSCoroutineScope$schedule$1$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Llive/hms/video/utils/HMSCoroutineScope$schedule$1$1;-><init>(Lkotlin/jvm/functions/Function1;Lq83/d;)V

    const/4 p0, 0x3

    invoke-static {v0, v2, v2, v1, p0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static synthetic scheduleWithFixedDelay$default(Llive/hms/video/utils/HMSCoroutineScope;JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    sget-object p3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Llive/hms/video/utils/HMSCoroutineScope;->scheduleWithFixedDelay(JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function1;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p0

    return-object p0
.end method

.method private static final scheduleWithFixedDelay$lambda$1(Lkotlin/jvm/functions/Function1;)V
    .locals 3

    const-string v0, "$task"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/utils/HMSCoroutineScope$scheduleWithFixedDelay$1$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Llive/hms/video/utils/HMSCoroutineScope$scheduleWithFixedDelay$1$1;-><init>(Lkotlin/jvm/functions/Function1;Lq83/d;)V

    const/4 p0, 0x3

    invoke-static {v0, v2, v2, v1, p0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method


# virtual methods
.method public getCoroutineContext()Lq83/j;
    .locals 1

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->dispatcher:Lbc3/c1;

    return-object v0
.end method

.method public final getDispatcher()Lbc3/c1;
    .locals 1

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->dispatcher:Lbc3/c1;

    return-object v0
.end method

.method public final getExecutor()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->executor:Ljava/util/concurrent/ScheduledExecutorService;

    return-object v0
.end method

.method public final launchWithTimeout(Llive/hms/video/utils/HMSCoroutineScope;Lc93/m;)Lbc3/k1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/utils/HMSCoroutineScope;",
            "Lc93/m;",
            ")",
            "Lbc3/k1;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "block"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v0, Llive/hms/video/utils/HMSCoroutineScope$launchWithTimeout$1;

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1}, Llive/hms/video/utils/HMSCoroutineScope$launchWithTimeout$1;-><init>(Lc93/m;Lq83/d;)V

    const/4 p2, 0x3

    invoke-static {p1, v1, v1, v0, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    return-object p1
.end method

.method public final schedule(JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function1;)Ljava/util/concurrent/ScheduledFuture;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation

    const-string v0, "unit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "task"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->executor:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Llive/hms/video/utils/b;

    const/4 v2, 0x0

    invoke-direct {v1, p4, v2}, Llive/hms/video/utils/b;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-interface {v0, v1, p1, p2, p3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    const-string p2, "schedule(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final scheduleWithFixedDelay(JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function1;)Ljava/util/concurrent/ScheduledFuture;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation

    const-string v0, "unit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "task"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Llive/hms/video/utils/HMSCoroutineScope;->executor:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Llive/hms/video/utils/b;

    const/4 v0, 0x1

    invoke-direct {v2, p4, v0}, Llive/hms/video/utils/b;-><init>(Lkotlin/jvm/functions/Function1;I)V

    move-wide v5, p1

    move-wide v3, p1

    move-object v7, p3

    invoke-interface/range {v1 .. v7}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    const-string p2, "scheduleWithFixedDelay(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
