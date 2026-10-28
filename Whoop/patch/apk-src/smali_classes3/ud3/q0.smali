.class public final Lud3/q0;
.super Lud3/v0;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lud3/h0;

.field public final synthetic b:Lne3/p;

.field public final synthetic c:Lne3/e0;


# direct methods
.method public constructor <init>(Lne3/e0;Lne3/p;Lud3/h0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lud3/q0;->a:Lud3/h0;

    iput-object p2, p0, Lud3/q0;->b:Lne3/p;

    iput-object p1, p0, Lud3/q0;->c:Lne3/e0;

    return-void
.end method


# virtual methods
.method public final contentLength()J
    .locals 2

    iget-object v0, p0, Lud3/q0;->b:Lne3/p;

    iget-object v1, p0, Lud3/q0;->c:Lne3/e0;

    invoke-virtual {v0, v1}, Lne3/p;->T(Lne3/e0;)Ln4/f;

    move-result-object v0

    iget-object v0, v0, Ln4/f;->e:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

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

    iget-object v0, p0, Lud3/q0;->a:Lud3/h0;

    return-object v0
.end method

.method public final writeTo(Lne3/i;)V
    .locals 2

    iget-object v0, p0, Lud3/q0;->b:Lne3/p;

    iget-object v1, p0, Lud3/q0;->c:Lne3/e0;

    invoke-virtual {v0, v1}, Lne3/p;->x0(Lne3/e0;)Lne3/p0;

    move-result-object v0

    :try_start_0
    invoke-interface {p1, v0}, Lne3/i;->N0(Lne3/p0;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {v0, p1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
.end method
