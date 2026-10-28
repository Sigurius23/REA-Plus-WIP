.class public final Lio/sentry/b3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h1;


# static fields
.field public static final a:Lio/sentry/b3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/b3;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/sentry/b3;->a:Lio/sentry/b3;

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 0

    return-void
.end method

.method public final b()V
    .locals 0

    return-void
.end method

.method public final c(Ljava/lang/Runnable;J)Ljava/util/concurrent/Future;
    .locals 0

    new-instance p1, Ljava/util/concurrent/FutureTask;

    new-instance p2, Lio/sentry/h0;

    const/4 p3, 0x1

    invoke-direct {p2, p3}, Lio/sentry/h0;-><init>(I)V

    invoke-direct {p1, p2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    return-object p1
.end method

.method public final isClosed()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    .locals 2

    new-instance p1, Ljava/util/concurrent/FutureTask;

    new-instance v0, Lio/sentry/h0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lio/sentry/h0;-><init>(I)V

    invoke-direct {p1, v0}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    return-object p1
.end method
