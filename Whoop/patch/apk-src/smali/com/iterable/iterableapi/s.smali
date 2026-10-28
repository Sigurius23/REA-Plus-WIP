.class public final Lcom/iterable/iterableapi/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/iterable/iterableapi/f;


# instance fields
.field public volatile E:Z

.field public final F:Ljava/util/concurrent/ExecutorService;

.field public final w:Lcom/iterable/iterableapi/k;

.field public final x:J

.field public y:Ljava/util/Timer;

.field public final z:Lcom/iterable/iterableapi/m2;


# direct methods
.method public constructor <init>(Lcom/iterable/iterableapi/k;Lcom/iterable/iterableapi/m2;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/iterable/iterableapi/s;->F:Ljava/util/concurrent/ExecutorService;

    iput-object p1, p0, Lcom/iterable/iterableapi/s;->w:Lcom/iterable/iterableapi/k;

    iput-object p2, p0, Lcom/iterable/iterableapi/s;->z:Lcom/iterable/iterableapi/m2;

    const-wide/32 p1, 0xea60

    iput-wide p1, p0, Lcom/iterable/iterableapi/s;->x:J

    sget-object p1, Lcom/iterable/iterableapi/g;->i:Lcom/iterable/iterableapi/g;

    invoke-virtual {p1, p0}, Lcom/iterable/iterableapi/g;->a(Lcom/iterable/iterableapi/f;)V

    return-void
.end method

.method public static c(Ljava/lang/String;)J
    .locals 2

    const-string v0, "\\."

    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    array-length v0, p0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    aget-object p0, p0, v0

    const/16 v0, 0x8

    invoke-static {p0, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p0

    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, p0, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    new-instance p0, Lorg/json/JSONObject;

    invoke-direct {p0, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v0, "exp"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid JWT"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a()V
    .locals 3

    const-string v0, "IterableAuth"

    :try_start_0
    const-string v1, "App switched to background - disabling auth token requests"

    invoke-static {v0, v1}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/iterable/iterableapi/s;->y:Ljava/util/Timer;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/util/Timer;->cancel()V

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/iterable/iterableapi/s;->y:Ljava/util/Timer;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/iterable/iterableapi/s;->E:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception v1

    const-string v2, "Error while switching to background"

    invoke-static {v0, v2, v1}, Ldt/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    return-void
.end method

.method public final b()V
    .locals 3

    const-string v0, "IterableAuth"

    :try_start_0
    const-string v1, "App switched to foreground - enabling auth token requests"

    invoke-static {v0, v1}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/iterable/iterableapi/s;->w:Lcom/iterable/iterableapi/k;

    iget-object v2, v1, Lcom/iterable/iterableapi/k;->d:Ljava/lang/String;

    if-nez v2, :cond_1

    iget-object v2, v1, Lcom/iterable/iterableapi/k;->e:Ljava/lang/String;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "Email or userId is not available. Skipping token refresh"

    invoke-static {v0, v1}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    :goto_0
    iget-object v1, v1, Lcom/iterable/iterableapi/k;->g:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/iterable/iterableapi/s;->d(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    const-string v2, "Error occurred in handling auth token refresh"

    invoke-static {v0, v2, v1}, Ldt/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 7

    iget-object v0, p0, Lcom/iterable/iterableapi/s;->y:Ljava/util/Timer;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    iput-object v2, p0, Lcom/iterable/iterableapi/s;->y:Ljava/util/Timer;

    iput-boolean v1, p0, Lcom/iterable/iterableapi/s;->E:Z

    :cond_0
    const-string v0, "IterableAuth"

    if-nez p1, :cond_2

    :try_start_0
    const-string p1, "JWT is null. Scheduling token refresh"

    invoke-static {v0, p1}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean p1, p0, Lcom/iterable/iterableapi/s;->E:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/iterable/iterableapi/s;->z:Lcom/iterable/iterableapi/m2;

    iget-wide v3, p1, Lcom/iterable/iterableapi/m2;->a:J

    invoke-virtual {p0, v3, v4, v1, v2}, Lcom/iterable/iterableapi/s;->e(JZLcom/iterable/iterableapi/z1;)V

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    invoke-static {p1}, Lcom/iterable/iterableapi/s;->c(Ljava/lang/String;)J

    move-result-wide v3

    const-wide/16 v5, 0x3e8

    mul-long/2addr v3, v5

    iget-wide v5, p0, Lcom/iterable/iterableapi/s;->x:J

    sub-long/2addr v3, v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    sub-long/2addr v3, v5

    const-wide/16 v5, 0x0

    cmp-long p1, v3, v5

    const/4 v5, 0x1

    if-lez p1, :cond_3

    invoke-virtual {p0, v3, v4, v5, v2}, Lcom/iterable/iterableapi/s;->e(JZLcom/iterable/iterableapi/z1;)V

    return-void

    :cond_3
    iget-object p1, p0, Lcom/iterable/iterableapi/s;->z:Lcom/iterable/iterableapi/m2;

    iget-wide v3, p1, Lcom/iterable/iterableapi/m2;->a:J

    invoke-virtual {p0, v3, v4, v5, v2}, Lcom/iterable/iterableapi/s;->e(JZLcom/iterable/iterableapi/z1;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_0
    const-string v3, "Error while parsing JWT for the expiration"

    invoke-static {v0, v3, p1}, Ldt/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    iget-object p1, p0, Lcom/iterable/iterableapi/s;->z:Lcom/iterable/iterableapi/m2;

    iget-wide v3, p1, Lcom/iterable/iterableapi/m2;->a:J

    invoke-virtual {p0, v3, v4, v1, v2}, Lcom/iterable/iterableapi/s;->e(JZLcom/iterable/iterableapi/z1;)V

    return-void
.end method

.method public final e(JZLcom/iterable/iterableapi/z1;)V
    .locals 3

    iget-boolean v0, p0, Lcom/iterable/iterableapi/s;->E:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/iterable/iterableapi/s;->y:Ljava/util/Timer;

    const/4 v1, 0x1

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0, v1}, Ljava/util/Timer;-><init>(Z)V

    iput-object v0, p0, Lcom/iterable/iterableapi/s;->y:Ljava/util/Timer;

    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/iterable/iterableapi/s;->y:Ljava/util/Timer;

    new-instance v2, Lcom/iterable/iterableapi/r;

    invoke-direct {v2, p0, p4, p3}, Lcom/iterable/iterableapi/r;-><init>(Lcom/iterable/iterableapi/s;Lcom/iterable/iterableapi/z1;Z)V

    invoke-virtual {v0, v2, p1, p2}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    iput-boolean v1, p0, Lcom/iterable/iterableapi/s;->E:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "timer exception: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p3, p0, Lcom/iterable/iterableapi/s;->y:Ljava/util/Timer;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "IterableAuth"

    invoke-static {p3, p2, p1}, Ldt/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    return-void
.end method
