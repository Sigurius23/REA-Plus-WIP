.class public final Lz53/i;
.super Lud3/v0;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Long;

.field public final b:Lm5/k;


# direct methods
.method public constructor <init>(Ljava/lang/Long;Lm5/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz53/i;->a:Ljava/lang/Long;

    iput-object p2, p0, Lz53/i;->b:Lm5/k;

    return-void
.end method


# virtual methods
.method public final contentLength()J
    .locals 2

    iget-object v0, p0, Lz53/i;->a:Ljava/lang/Long;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public final contentType()Lud3/h0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final isOneShot()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final writeTo(Lne3/i;)V
    .locals 5

    iget-object v0, p0, Lz53/i;->b:Lm5/k;

    invoke-virtual {v0}, Lm5/k;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/ktor/utils/io/q;

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lio/ktor/utils/io/jvm/javaio/d;->a(Lbc3/k1;Lio/ktor/utils/io/q;)Lio/ktor/utils/io/jvm/javaio/h;

    move-result-object v0

    invoke-static {v0}, Lne3/b;->k(Ljava/io/InputStream;)Lne3/y;

    move-result-object v0

    :try_start_0
    invoke-interface {p1, v0}, Lne3/i;->N0(Lne3/p0;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    move-object v4, v1

    move-object v1, p1

    move-object p1, v4

    :goto_0
    :try_start_1
    invoke-virtual {v0}, Lne3/y;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    if-nez v1, :cond_0

    move-object v1, v0

    goto :goto_1

    :cond_0
    invoke-static {v1, v0}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_1
    if-nez v1, :cond_1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-void

    :cond_1
    throw v1
.end method
