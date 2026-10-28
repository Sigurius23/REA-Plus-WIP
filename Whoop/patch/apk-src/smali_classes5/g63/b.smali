.class public abstract Lg63/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lio/sentry/hints/j;

.field public static final b:Lio/sentry/hints/j;

.field public static final c:Lio/sentry/hints/j;

.field public static final d:Lio/sentry/hints/j;

.field public static final e:Lio/sentry/hints/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/sentry/hints/j;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Lio/sentry/hints/j;-><init>(I)V

    sput-object v0, Lg63/b;->a:Lio/sentry/hints/j;

    new-instance v0, Lio/sentry/hints/j;

    invoke-direct {v0, v1}, Lio/sentry/hints/j;-><init>(I)V

    sput-object v0, Lg63/b;->b:Lio/sentry/hints/j;

    new-instance v0, Lio/sentry/hints/j;

    invoke-direct {v0, v1}, Lio/sentry/hints/j;-><init>(I)V

    sput-object v0, Lg63/b;->c:Lio/sentry/hints/j;

    new-instance v0, Lio/sentry/hints/j;

    invoke-direct {v0, v1}, Lio/sentry/hints/j;-><init>(I)V

    sput-object v0, Lg63/b;->d:Lio/sentry/hints/j;

    new-instance v0, Lio/sentry/hints/j;

    invoke-direct {v0, v1}, Lio/sentry/hints/j;-><init>(I)V

    sput-object v0, Lg63/b;->e:Lio/sentry/hints/j;

    return-void
.end method

.method public static final a(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 3

    move-object v0, p0

    :goto_0
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Ljava/util/concurrent/CancellationException;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    :goto_1
    return-object p0

    :cond_2
    return-object v0
.end method
