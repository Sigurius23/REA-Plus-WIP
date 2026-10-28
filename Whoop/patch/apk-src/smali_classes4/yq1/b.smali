.class public final Lyq1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lyq1/b;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Lio/sentry/n4;",
        "Lio/sentry/android/core/SentryAndroidOptions;",
        "configuration",
        "Ll83/a0;",
        "a",
        "(Landroid/content/Context;Lio/sentry/n4;)V",
        "app_prodStandardRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lio/sentry/n4;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lio/sentry/n4;",
            ")V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/sentry/android/core/t;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lio/sentry/android/core/t;-><init>(I)V

    const-string v1, "Failed to initialize Sentry\'s SDK"

    const-string v2, "Fatal error during SentryAndroid.init(...)"

    :try_start_0
    sget-object v3, Lio/sentry/android/core/d1;->b:Lio/sentry/util/a;

    invoke-virtual {v3}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance v4, Lio/sentry/p2;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v5, Lio/sentry/android/core/f;

    invoke-direct {v5, v0, p1, p2}, Lio/sentry/android/core/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4, v5}, Lio/sentry/o4;->c(Lio/sentry/p2;Lio/sentry/android/core/f;)V

    invoke-static {}, Lio/sentry/o4;->b()Lio/sentry/d1;

    move-result-object p1

    invoke-static {}, Lio/sentry/android/core/j0;->g()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Lio/sentry/d1;->l()Lio/sentry/q6;

    move-result-object p2

    invoke-virtual {p2}, Lio/sentry/q6;->isEnableAutoSessionTracking()Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v4, 0x0

    invoke-direct {p2, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    new-instance v4, Lcom/whoop/data/repositories/c;

    const/4 v5, 0x7

    invoke-direct {v4, p2, v5}, Lcom/whoop/data/repositories/c;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p1, v4}, Lio/sentry/d1;->s(Lio/sentry/e4;)V

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-interface {p1}, Lio/sentry/d1;->u()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-interface {p1}, Lio/sentry/d1;->l()Lio/sentry/q6;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/q6;->getReplayController()Lio/sentry/v3;

    move-result-object p1

    invoke-interface {p1}, Lio/sentry/v3;->x()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    :try_start_2
    invoke-virtual {v3}, Lio/sentry/s;->close()V
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_3

    :catch_1
    move-exception p1

    goto :goto_4

    :catch_2
    move-exception p1

    goto :goto_5

    :catch_3
    move-exception p1

    goto :goto_6

    :goto_1
    :try_start_3
    invoke-virtual {v3}, Lio/sentry/s;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p2

    :try_start_4
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
    :try_end_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_4 .. :try_end_4} :catch_0

    :goto_3
    sget-object p2, Lio/sentry/n5;->FATAL:Lio/sentry/n5;

    invoke-virtual {v0, p2, v2, p1}, Lio/sentry/android/core/t;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :goto_4
    sget-object p2, Lio/sentry/n5;->FATAL:Lio/sentry/n5;

    invoke-virtual {v0, p2, v2, p1}, Lio/sentry/android/core/t;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :goto_5
    sget-object p2, Lio/sentry/n5;->FATAL:Lio/sentry/n5;

    invoke-virtual {v0, p2, v2, p1}, Lio/sentry/android/core/t;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :goto_6
    sget-object p2, Lio/sentry/n5;->FATAL:Lio/sentry/n5;

    invoke-virtual {v0, p2, v2, p1}, Lio/sentry/android/core/t;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method
