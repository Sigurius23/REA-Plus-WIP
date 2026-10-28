.class public final Lio/sentry/android/core/internal/util/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/util/thread/a;


# static fields
.field public static final a:Lio/sentry/android/core/internal/util/e;

.field public static volatile b:J


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/sentry/android/core/internal/util/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v2, Lb3/n;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Lb3/n;-><init>(I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    sput-object v0, Lio/sentry/android/core/internal/util/e;->a:Lio/sentry/android/core/internal/util/e;

    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v0

    int-to-long v0, v0

    sput-wide v0, Lio/sentry/android/core/internal/util/e;->b:J

    return-void
.end method

.method public static d(Ljava/lang/Thread;)J
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x24

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Thread;->threadId()J

    move-result-wide v0

    return-wide v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public final a()Z
    .locals 4

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {v0}, Lio/sentry/android/core/internal/util/e;->d(Ljava/lang/Thread;)J

    move-result-wide v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-virtual {v2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-static {v2}, Lio/sentry/android/core/internal/util/e;->d(Ljava/lang/Thread;)J

    move-result-wide v2

    cmp-long v0, v2, v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lio/sentry/android/core/internal/util/e;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "main"

    return-object v0

    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c()J
    .locals 2

    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method
