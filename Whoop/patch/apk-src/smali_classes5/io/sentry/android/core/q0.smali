.class public final Lio/sentry/android/core/q0;
.super Landroid/os/FileObserver;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lio/sentry/l3;

.field public final c:Lio/sentry/v0;

.field public final d:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Lio/sentry/l3;Lio/sentry/v0;J)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/os/FileObserver;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lio/sentry/android/core/q0;->a:Ljava/lang/String;

    iput-object p2, p0, Lio/sentry/android/core/q0;->b:Lio/sentry/l3;

    const-string p1, "Logger is required."

    invoke-static {p3, p1}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lio/sentry/android/core/q0;->c:Lio/sentry/v0;

    iput-wide p4, p0, Lio/sentry/android/core/q0;->d:J

    return-void
.end method


# virtual methods
.method public final onEvent(ILjava/lang/String;)V
    .locals 5

    if-eqz p2, :cond_1

    const/16 v0, 0x8

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object v1, p0, Lio/sentry/android/core/q0;->a:Ljava/lang/String;

    filled-new-array {p1, v1, p2}, [Ljava/lang/Object;

    move-result-object p1

    iget-object v2, p0, Lio/sentry/android/core/q0;->c:Lio/sentry/v0;

    const-string v3, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s."

    invoke-interface {v2, v0, v3, p1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p1, Lio/sentry/android/core/p0;

    iget-wide v3, p0, Lio/sentry/android/core/q0;->d:J

    invoke-direct {p1, v3, v4, v2}, Lio/sentry/android/core/p0;-><init>(JLio/sentry/v0;)V

    invoke-static {p1}, Lhg3/i;->C(Ljava/lang/Object;)Lio/sentry/g0;

    move-result-object p1

    invoke-static {v1}, Lih0/d0;->o(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lio/sentry/android/core/q0;->b:Lio/sentry/l3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "Path is required."

    invoke-static {p2, v1}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, p1}, Lio/sentry/l3;->b(Ljava/io/File;Lio/sentry/g0;)V

    :cond_1
    :goto_0
    return-void
.end method
