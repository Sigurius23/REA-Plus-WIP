.class public final Lf1/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:Le1/i;

.field public final c:Le1/i;

.field public final d:Lf1/l;

.field public e:Ll3/r0;

.field public f:I


# direct methods
.method public constructor <init>(JLe1/i;Le1/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lf1/l;->a:J

    iput-object p3, p0, Lf1/l;->b:Le1/i;

    iput-object p4, p0, Lf1/l;->c:Le1/i;

    iput-object p0, p0, Lf1/l;->d:Lf1/l;

    const/4 p1, -0x1

    iput p1, p0, Lf1/l;->f:I

    return-void
.end method


# virtual methods
.method public final a(Lf1/u;Z)J
    .locals 6

    iget-object v0, p1, Lf1/u;->b:Lf1/t;

    iget-object v1, p1, Lf1/u;->a:Lf1/t;

    iget-wide v2, p0, Lf1/l;->a:J

    if-eqz p2, :cond_0

    iget-wide v4, v1, Lf1/t;->c:J

    cmp-long v4, v4, v2

    if-nez v4, :cond_3

    :cond_0
    if-nez p2, :cond_1

    iget-wide v4, v0, Lf1/t;->c:J

    cmp-long v2, v4, v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lf1/l;->d()Ly2/y;

    move-result-object v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lf1/l;->c:Le1/i;

    invoke-virtual {v2}, Le1/i;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll3/r0;

    if-nez v2, :cond_4

    :cond_3
    :goto_0
    const-wide p1, 0x7fc000007fc00000L    # 2.247117487993712E307

    return-wide p1

    :cond_4
    if-eqz p2, :cond_5

    iget v0, v1, Lf1/t;->b:I

    goto :goto_1

    :cond_5
    iget v0, v0, Lf1/t;->b:I

    :goto_1
    const/4 v1, 0x0

    invoke-virtual {p0, v2}, Lf1/l;->c(Ll3/r0;)I

    move-result v3

    invoke-static {v0, v1, v3}, Le93/b;->n(III)I

    move-result v0

    iget-boolean p1, p1, Lf1/u;->c:Z

    invoke-static {v2, v0, p2, p1}, Lf1/y0;->u(Ll3/r0;IZZ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final b()I
    .locals 1

    iget-object v0, p0, Lf1/l;->c:Le1/i;

    invoke-virtual {v0}, Le1/i;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll3/r0;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {p0, v0}, Lf1/l;->c(Ll3/r0;)I

    move-result v0

    return v0
.end method

.method public final c(Ll3/r0;)I
    .locals 9

    iget-object v0, p0, Lf1/l;->d:Lf1/l;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lf1/l;->e:Ll3/r0;

    if-eq v1, p1, :cond_5

    invoke-virtual {p1}, Ll3/r0;->d()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    iget-object v1, p1, Ll3/r0;->b:Ll3/w;

    iget-boolean v3, v1, Ll3/w;->c:Z

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    iget-wide v3, p1, Ll3/r0;->c:J

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    long-to-int v3, v3

    int-to-float v3, v3

    invoke-virtual {v1, v3}, Ll3/w;->e(F)I

    move-result v1

    iget-object v3, p1, Ll3/r0;->b:Ll3/w;

    iget v3, v3, Ll3/w;->f:I

    sub-int/2addr v3, v2

    if-le v1, v3, :cond_1

    move v1, v3

    :cond_1
    :goto_0
    if-ltz v1, :cond_2

    iget-object v3, p1, Ll3/r0;->b:Ll3/w;

    invoke-virtual {v3, v1}, Ll3/w;->f(I)F

    move-result v3

    iget-wide v7, p1, Ll3/r0;->c:J

    and-long/2addr v7, v5

    long-to-int v4, v7

    int-to-float v4, v4

    cmpl-float v3, v3, v4

    if-ltz v3, :cond_2

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_2
    if-gez v1, :cond_4

    const/4 v1, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    iget-object v1, p1, Ll3/r0;->b:Ll3/w;

    iget v1, v1, Ll3/w;->f:I

    sub-int/2addr v1, v2

    :cond_4
    :goto_2
    iget-object v3, p1, Ll3/r0;->b:Ll3/w;

    invoke-virtual {v3, v1, v2}, Ll3/w;->c(IZ)I

    move-result v1

    iput v1, p0, Lf1/l;->f:I

    iput-object p1, p0, Lf1/l;->e:Ll3/r0;

    :cond_5
    iget p1, p0, Lf1/l;->f:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return p1

    :goto_3
    monitor-exit v0

    throw p1
.end method

.method public final d()Ly2/y;
    .locals 2

    iget-object v0, p0, Lf1/l;->b:Le1/i;

    invoke-virtual {v0}, Le1/i;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly2/y;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ly2/y;->g()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final e()Ll3/g;
    .locals 2

    iget-object v0, p0, Lf1/l;->c:Le1/i;

    invoke-virtual {v0}, Le1/i;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll3/r0;

    if-nez v0, :cond_0

    new-instance v0, Ll3/g;

    const-string v1, ""

    invoke-direct {v0, v1}, Ll3/g;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_0
    iget-object v0, v0, Ll3/r0;->a:Ll3/q0;

    iget-object v0, v0, Ll3/q0;->a:Ll3/g;

    return-object v0
.end method
