.class public final Lxd3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lne3/p0;


# instance fields
.field public w:Z

.field public final synthetic x:Lne3/j;

.field public final synthetic y:Lc33/c;

.field public final synthetic z:Lne3/h0;


# direct methods
.method public constructor <init>(Lne3/j;Lc33/c;Lne3/h0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxd3/a;->x:Lne3/j;

    iput-object p2, p0, Lxd3/a;->y:Lc33/c;

    iput-object p3, p0, Lxd3/a;->z:Lne3/h0;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    iget-boolean v0, p0, Lxd3/a;->w:Z

    if-nez v0, :cond_0

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    sget-object v1, Lwd3/h;->a:Ljava/util/TimeZone;

    const-string v1, "timeUnit"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x64

    :try_start_0
    invoke-static {p0, v0}, Lwd3/h;->g(Lne3/p0;I)Z

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lxd3/a;->w:Z

    iget-object v0, p0, Lxd3/a;->y:Lc33/c;

    invoke-virtual {v0}, Lc33/c;->a()V

    :cond_0
    iget-object v0, p0, Lxd3/a;->x:Lne3/j;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public final h1(Lne3/h;J)J
    .locals 9

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    :try_start_0
    iget-object v0, p0, Lxd3/a;->x:Lne3/j;

    invoke-interface {v0, p1, p2, p3}, Lne3/p0;->h1(Lne3/h;J)J

    move-result-wide v6
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/16 p2, -0x1

    cmp-long v0, v6, p2

    iget-object v8, p0, Lxd3/a;->z:Lne3/h0;

    if-nez v0, :cond_1

    iget-boolean p1, p0, Lxd3/a;->w:Z

    if-nez p1, :cond_0

    iput-boolean v1, p0, Lxd3/a;->w:Z

    invoke-virtual {v8}, Lne3/h0;->close()V

    :cond_0
    return-wide p2

    :cond_1
    iget-object v3, v8, Lne3/h0;->x:Lne3/h;

    iget-wide p2, p1, Lne3/h;->x:J

    sub-long v4, p2, v6

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Lne3/h;->k(Lne3/h;JJ)V

    invoke-virtual {v8}, Lne3/h0;->b()Lne3/i;

    return-wide v6

    :catch_0
    move-exception v0

    move-object p1, v0

    iget-boolean p2, p0, Lxd3/a;->w:Z

    if-nez p2, :cond_2

    iput-boolean v1, p0, Lxd3/a;->w:Z

    iget-object p2, p0, Lxd3/a;->y:Lc33/c;

    invoke-virtual {p2}, Lc33/c;->a()V

    :cond_2
    throw p1
.end method

.method public final timeout()Lne3/r0;
    .locals 1

    iget-object v0, p0, Lxd3/a;->x:Lne3/j;

    invoke-interface {v0}, Lne3/p0;->timeout()Lne3/r0;

    move-result-object v0

    return-object v0
.end method
