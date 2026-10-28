.class public final Lio/sentry/t4;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Lio/sentry/t4;


# instance fields
.field public a:Z

.field public b:Ljava/lang/Boolean;

.field public final c:Lio/sentry/util/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/t4;

    invoke-direct {v0}, Lio/sentry/t4;-><init>()V

    sput-object v0, Lio/sentry/t4;->d:Lio/sentry/t4;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lio/sentry/t4;->c:Lio/sentry/util/a;

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 2

    iget-object v0, p0, Lio/sentry/t4;->c:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    iget-boolean v1, p0, Lio/sentry/t4;->a:Z

    if-nez v1, :cond_0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/t4;->b:Ljava/lang/Boolean;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lio/sentry/t4;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lio/sentry/s;->close()V

    return-void

    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
.end method
