.class public final Lfw/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:J

.field public b:Ljava/util/List;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    sget-object v0, Lfw/g;->a:Ljava/util/List;

    .line 2
    sget-object v1, Lfw/j;->b:Lfw/j;

    .line 3
    const-string v2, "components"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "flags"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    sget-object v2, Lm83/y;->w:Lm83/y;

    iput-object v2, p0, Lfw/h;->b:Ljava/util/List;

    .line 6
    iput-object v0, p0, Lfw/h;->c:Ljava/lang/Object;

    .line 7
    iput-object v1, p0, Lfw/h;->d:Ljava/lang/Object;

    const-wide/32 v0, 0x100000

    .line 8
    iput-wide v0, p0, Lfw/h;->a:J

    .line 9
    const-string v0, " "

    iput-object v0, p0, Lfw/h;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lr9/i;Landroid/content/Context;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfw/h;->e:Ljava/lang/Object;

    .line 11
    invoke-static {p2}, Lx8/t;->H(Landroid/content/Context;)Z

    .line 12
    sget-object p1, Lzr/g0;->x:Lzr/e0;

    .line 13
    sget-object p1, Lzr/w0;->E:Lzr/w0;

    .line 14
    iput-object p1, p0, Lfw/h;->b:Ljava/util/List;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    iput-wide p1, p0, Lfw/h;->a:J

    .line 16
    sget-object p1, Lr9/i;->o:Lm5/e;

    iput-object p1, p0, Lfw/h;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 11

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lfw/h;->a:J

    iget-object v2, p0, Lfw/h;->e:Ljava/lang/Object;

    check-cast v2, Lr9/i;

    iget-object v3, v2, Lr9/i;->f:Lr9/c;

    iget-object v4, v2, Lr9/i;->b:Llo/w;

    iget v5, v2, Lr9/i;->k:I

    const/4 v6, 0x1

    if-ne v5, v6, :cond_9

    const-wide/16 v7, 0x0

    if-eqz p1, :cond_0

    iget-object p1, v3, Lr9/c;->a:Lr9/n;

    iget-object v5, p1, Lr9/n;->b:Lmo/p;

    iput-wide v7, v5, Lmo/p;->k:J

    const-wide/16 v9, -0x1

    iput-wide v9, v5, Lmo/p;->n:J

    iput-wide v9, v5, Lmo/p;->l:J

    iput-wide v0, p1, Lr9/n;->h:J

    iput-wide v0, p1, Lr9/n;->f:J

    invoke-virtual {p1, v6}, Lr9/n;->d(I)V

    iput-wide v0, p1, Lr9/n;->i:J

    :cond_0
    iget-object p1, v3, Lr9/c;->c:Lr9/p;

    iget-object v5, p1, Lr9/p;->d:Llo/w;

    iget-object v9, p1, Lr9/p;->f:La0/i;

    const/4 v10, 0x0

    iput v10, v9, La0/i;->b:I

    iput v10, v9, La0/i;->c:I

    iput-wide v0, p1, Lr9/p;->g:J

    iget-object p1, p1, Lr9/p;->e:Llo/w;

    invoke-virtual {p1}, Llo/w;->h()I

    move-result v9

    if-lez v9, :cond_3

    invoke-virtual {p1}, Llo/w;->h()I

    move-result v9

    if-lez v9, :cond_1

    move v9, v6

    goto :goto_0

    :cond_1
    move v9, v10

    :goto_0
    invoke-static {v9}, Lva3/g;->d(Z)V

    :goto_1
    invoke-virtual {p1}, Llo/w;->h()I

    move-result v9

    if-le v9, v6, :cond_2

    invoke-virtual {p1}, Llo/w;->e()Ljava/lang/Object;

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Llo/w;->e()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v9, Ljava/lang/Long;

    invoke-virtual {p1, v7, v8, v9}, Llo/w;->a(JLjava/lang/Object;)V

    :cond_3
    invoke-virtual {v5}, Llo/w;->h()I

    move-result p1

    if-lez p1, :cond_6

    invoke-virtual {v5}, Llo/w;->h()I

    move-result p1

    if-lez p1, :cond_4

    move v10, v6

    :cond_4
    invoke-static {v10}, Lva3/g;->d(Z)V

    :goto_2
    invoke-virtual {v5}, Llo/w;->h()I

    move-result p1

    if-le p1, v6, :cond_5

    invoke-virtual {v5}, Llo/w;->e()Ljava/lang/Object;

    goto :goto_2

    :cond_5
    invoke-virtual {v5}, Llo/w;->e()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p1, Lu8/y0;

    invoke-virtual {v5, v7, v8, p1}, Llo/w;->a(JLjava/lang/Object;)V

    :cond_6
    iget-object p1, v3, Lr9/c;->d:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    :goto_3
    invoke-virtual {v4}, Llo/w;->h()I

    move-result p1

    if-le p1, v6, :cond_7

    invoke-virtual {v4}, Llo/w;->e()Ljava/lang/Object;

    goto :goto_3

    :cond_7
    invoke-virtual {v4}, Llo/w;->h()I

    move-result p1

    if-ne p1, v6, :cond_8

    invoke-virtual {v4}, Llo/w;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    iget-wide v6, v2, Lr9/i;->m:J

    invoke-virtual {v3, v4, v5, v6, v7}, Lr9/c;->a(JJ)V

    :cond_8
    iput-wide v0, v2, Lr9/i;->l:J

    iget-object p1, v2, Lr9/i;->i:Lx8/r;

    invoke-static {p1}, Lva3/g;->j(Ljava/lang/Object;)V

    new-instance v0, Lcom/iterable/iterableapi/k1;

    invoke-direct {v0, v2}, Lcom/iterable/iterableapi/k1;-><init>(Lr9/i;)V

    invoke-virtual {p1, v0}, Lx8/r;->c(Ljava/lang/Runnable;)Z

    :cond_9
    return-void
.end method

.method public b(Lu8/p;)Z
    .locals 4

    iget-object v0, p0, Lfw/h;->e:Ljava/lang/Object;

    check-cast v0, Lr9/i;

    iget v1, v0, Lr9/i;->k:I

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lva3/g;->i(Z)V

    iget-object v1, p1, Lu8/p;->B:Lu8/g;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lu8/g;->d()Z

    move-result v2

    if-nez v2, :cond_2

    :cond_1
    sget-object v1, Lu8/g;->h:Lu8/g;

    :cond_2
    iget v1, v1, Lu8/g;->c:I

    const/4 v2, 0x7

    if-ne v1, v2, :cond_3

    sget v1, Lx8/t;->a:I

    const/16 v2, 0x22

    if-ge v1, v2, :cond_3

    new-instance v1, Lu8/g;

    :cond_3
    iget-object v1, v0, Lr9/i;->g:Lx8/p;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-static {v2}, Lva3/g;->j(Ljava/lang/Object;)V

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lx8/p;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lx8/r;

    move-result-object v1

    iput-object v1, v0, Lr9/i;->i:Lx8/r;

    :try_start_0
    iget-object v0, v0, Lr9/i;->c:Lr9/h;

    invoke-virtual {v0}, Lr9/h;->a()V
    :try_end_0
    .catch Landroidx/media3/common/VideoFrameProcessingException; {:try_start_0 .. :try_end_0} :catch_0

    throw v3

    :catch_0
    move-exception v0

    new-instance v1, Landroidx/media3/exoplayer/video/VideoSink$VideoSinkException;

    invoke-direct {v1, v0, p1}, Landroidx/media3/exoplayer/video/VideoSink$VideoSinkException;-><init>(Ljava/lang/Exception;Lu8/p;)V

    throw v1
.end method

.method public c(I)V
    .locals 2

    iget-object v0, p0, Lfw/h;->e:Ljava/lang/Object;

    check-cast v0, Lr9/i;

    iget-object v0, v0, Lr9/i;->f:Lr9/c;

    iget-object v0, v0, Lr9/c;->a:Lr9/n;

    iget-object v0, v0, Lr9/n;->b:Lmo/p;

    iget v1, v0, Lmo/p;->h:I

    if-ne v1, p1, :cond_0

    goto :goto_0

    :cond_0
    iput p1, v0, Lmo/p;->h:I

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Lmo/p;->d(Z)V

    :goto_0
    return-void
.end method

.method public d(Landroid/view/Surface;Lx8/o;)V
    .locals 2

    iget-object v0, p0, Lfw/h;->e:Ljava/lang/Object;

    check-cast v0, Lr9/i;

    iget-object v1, v0, Lr9/i;->j:Landroid/util/Pair;

    if-eqz v1, :cond_0

    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Landroid/view/Surface;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Lr9/i;->j:Landroid/util/Pair;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Lx8/o;

    invoke-virtual {v1, p2}, Lx8/o;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-static {p1, p2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    iput-object p1, v0, Lr9/i;->j:Landroid/util/Pair;

    iget p1, p2, Lx8/o;->a:I

    return-void
.end method

.method public e(F)V
    .locals 1

    iget-object v0, p0, Lfw/h;->e:Ljava/lang/Object;

    check-cast v0, Lr9/i;

    iget-object v0, v0, Lr9/i;->f:Lr9/c;

    iget-object v0, v0, Lr9/c;->a:Lr9/n;

    invoke-virtual {v0, p1}, Lr9/n;->g(F)V

    return-void
.end method

.method public f(JJ)V
    .locals 9

    iget-object v0, p0, Lfw/h;->e:Ljava/lang/Object;

    check-cast v0, Lr9/i;

    iget-object v1, v0, Lr9/i;->b:Llo/w;

    iget-wide v2, p0, Lfw/h;->a:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v2, v4

    const-wide/16 v5, 0x0

    if-nez v4, :cond_0

    move-wide v2, v5

    goto :goto_0

    :cond_0
    const-wide/16 v7, 0x1

    add-long/2addr v2, v7

    :goto_0
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v1, v2, v3, p1}, Llo/w;->a(JLjava/lang/Object;)V

    iput-wide p3, v0, Lr9/i;->m:J

    iget-object p1, v0, Lr9/i;->f:Lr9/c;

    invoke-virtual {p1, v5, v6, p3, p4}, Lr9/c;->a(JJ)V

    return-void
.end method

.method public g(Ljava/util/List;)V
    .locals 3

    iget-object v0, p0, Lfw/h;->b:Ljava/util/List;

    check-cast v0, Lzr/w0;

    invoke-virtual {v0, p1}, Lzr/g0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lfw/h;->e:Ljava/lang/Object;

    check-cast v0, Lr9/i;

    iget-object v1, v0, Lr9/i;->c:Lr9/h;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lzr/d0;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lzr/a0;-><init>(I)V

    invoke-virtual {v1, p1}, Lzr/a0;->c(Ljava/lang/Iterable;)V

    iget-object p1, v0, Lr9/i;->e:Lzr/w0;

    invoke-virtual {v1, p1}, Lzr/a0;->c(Ljava/lang/Iterable;)V

    invoke-virtual {v1}, Lzr/d0;->f()Lzr/w0;

    move-result-object p1

    iput-object p1, p0, Lfw/h;->b:Ljava/util/List;

    iget-object p1, p0, Lfw/h;->c:Ljava/lang/Object;

    check-cast p1, Lu8/p;

    if-nez p1, :cond_1

    :goto_0
    return-void

    :cond_1
    invoke-virtual {p1}, Lu8/p;->a()Lu8/o;

    move-result-object v0

    iget-object p1, p1, Lu8/p;->B:Lu8/g;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lu8/g;->d()Z

    move-result v1

    if-nez v1, :cond_3

    :cond_2
    sget-object p1, Lu8/g;->h:Lu8/g;

    :cond_3
    iput-object p1, v0, Lu8/o;->A:Lu8/g;

    invoke-virtual {v0}, Lu8/o;->a()Lu8/p;

    const/4 p1, 0x0

    invoke-static {p1}, Lva3/g;->j(Ljava/lang/Object;)V

    throw p1
.end method

.method public h(Lr9/m;)V
    .locals 1

    iget-object v0, p0, Lfw/h;->e:Ljava/lang/Object;

    check-cast v0, Lr9/i;

    iget-object v0, v0, Lr9/i;->f:Lr9/c;

    iput-object p1, v0, Lr9/c;->i:Lr9/m;

    return-void
.end method

.method public i()V
    .locals 5

    iget-object v0, p0, Lfw/h;->e:Ljava/lang/Object;

    check-cast v0, Lr9/i;

    iget-wide v1, p0, Lfw/h;->a:J

    iget-wide v3, v0, Lr9/i;->l:J

    cmp-long v1, v3, v1

    if-ltz v1, :cond_0

    iget-object v0, v0, Lr9/i;->f:Lr9/c;

    iget-object v0, v0, Lr9/c;->c:Lr9/p;

    iget-wide v0, v0, Lr9/p;->g:J

    :cond_0
    return-void
.end method
