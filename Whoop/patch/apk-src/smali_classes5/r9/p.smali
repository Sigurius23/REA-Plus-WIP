.class public final Lr9/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lq3/i;

.field public final b:Lr9/n;

.field public final c:Lna/a;

.field public final d:Llo/w;

.field public final e:Llo/w;

.field public final f:La0/i;

.field public g:J

.field public h:Lu8/y0;

.field public i:J


# direct methods
.method public constructor <init>(Lq3/i;Lr9/n;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr9/p;->a:Lq3/i;

    iput-object p2, p0, Lr9/p;->b:Lr9/n;

    new-instance p1, Lna/a;

    invoke-direct {p1}, Lna/a;-><init>()V

    iput-object p1, p0, Lr9/p;->c:Lna/a;

    new-instance p1, Llo/w;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Llo/w;-><init>(I)V

    iput-object p1, p0, Lr9/p;->d:Llo/w;

    new-instance p1, Llo/w;

    invoke-direct {p1, p2}, Llo/w;-><init>(I)V

    iput-object p1, p0, Lr9/p;->e:Llo/w;

    new-instance p1, La0/i;

    const/4 p2, 0x4

    invoke-direct {p1, p2}, La0/i;-><init>(I)V

    const/16 p2, 0x10

    invoke-static {p2}, Ljava/lang/Integer;->bitCount(I)I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/16 p2, 0xf

    invoke-static {p2}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result p2

    shl-int/2addr p2, v1

    :cond_0
    const/4 v0, 0x0

    iput v0, p1, La0/i;->b:I

    iput v0, p1, La0/i;->c:I

    new-array v0, p2, [J

    iput-object v0, p1, La0/i;->e:Ljava/lang/Object;

    sub-int/2addr p2, v1

    iput p2, p1, La0/i;->d:I

    iput-object p1, p0, Lr9/p;->f:La0/i;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lr9/p;->g:J

    sget-object p1, Lu8/y0;->d:Lu8/y0;

    iput-object p1, p0, Lr9/p;->h:Lu8/y0;

    return-void
.end method


# virtual methods
.method public final a(JJ)V
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lr9/p;->a:Lq3/i;

    iget-object v2, v1, Lq3/i;->x:Ljava/lang/Object;

    check-cast v2, Lr9/c;

    :cond_0
    iget-object v3, v0, Lr9/p;->f:La0/i;

    iget v4, v3, La0/i;->c:I

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    if-eqz v4, :cond_8

    iget-object v4, v3, La0/i;->e:Ljava/lang/Object;

    check-cast v4, [J

    iget v5, v3, La0/i;->b:I

    aget-wide v7, v4, v5

    iget-object v4, v0, Lr9/p;->e:Llo/w;

    invoke-virtual {v4, v7, v8}, Llo/w;->f(J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    const/4 v5, 0x2

    iget-object v6, v0, Lr9/p;->b:Lr9/n;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    iget-wide v11, v0, Lr9/p;->i:J

    cmp-long v9, v9, v11

    if-eqz v9, :cond_2

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    iput-wide v9, v0, Lr9/p;->i:J

    invoke-virtual {v6, v5}, Lr9/n;->d(I)V

    :cond_2
    iget-wide v13, v0, Lr9/p;->i:J

    const/16 v16, 0x0

    iget-object v4, v0, Lr9/p;->c:Lna/a;

    move-object v9, v6

    iget-object v6, v0, Lr9/p;->b:Lr9/n;

    const/4 v15, 0x0

    move-wide/from16 v11, p3

    move-object/from16 v17, v4

    move-object v4, v9

    move-wide/from16 v9, p1

    invoke-virtual/range {v6 .. v17}, Lr9/n;->a(JJJJZZLna/a;)I

    move-result v6

    const/4 v7, 0x3

    if-eqz v6, :cond_5

    const/4 v8, 0x1

    if-eq v6, v8, :cond_5

    if-eq v6, v5, :cond_4

    if-eq v6, v7, :cond_4

    const/4 v3, 0x4

    if-eq v6, v3, :cond_0

    const/4 v1, 0x5

    if-ne v6, v1, :cond_3

    :goto_0
    return-void

    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    invoke-virtual {v3}, La0/i;->d()J

    iget-object v3, v2, Lr9/c;->h:Ljava/util/concurrent/Executor;

    new-instance v4, Lr9/b;

    const/4 v5, 0x1

    invoke-direct {v4, v1, v5}, Lr9/b;-><init>(Lq3/i;I)V

    invoke-interface {v3, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    iget-object v1, v2, Lr9/c;->d:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ljava/lang/ClassCastException;

    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    throw v1

    :cond_5
    invoke-virtual {v3}, La0/i;->d()J

    move-result-wide v5

    iget-object v3, v0, Lr9/p;->d:Llo/w;

    invoke-virtual {v3, v5, v6}, Llo/w;->f(J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu8/y0;

    if-eqz v3, :cond_6

    sget-object v8, Lu8/y0;->d:Lu8/y0;

    invoke-virtual {v3, v8}, Lu8/y0;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    iget-object v8, v0, Lr9/p;->h:Lu8/y0;

    invoke-virtual {v3, v8}, Lu8/y0;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    iput-object v3, v0, Lr9/p;->h:Lu8/y0;

    new-instance v8, Lu8/o;

    invoke-direct {v8}, Lu8/o;-><init>()V

    iget v9, v3, Lu8/y0;->a:I

    iput v9, v8, Lu8/o;->t:I

    iget v9, v3, Lu8/y0;->b:I

    iput v9, v8, Lu8/o;->u:I

    const-string v9, "video/raw"

    invoke-static {v9}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    iput-object v9, v8, Lu8/o;->m:Ljava/lang/String;

    new-instance v9, Lu8/p;

    invoke-direct {v9, v8}, Lu8/p;-><init>(Lu8/o;)V

    iput-object v9, v1, Lq3/i;->w:Ljava/lang/Object;

    iget-object v8, v2, Lr9/c;->h:Ljava/util/concurrent/Executor;

    new-instance v9, Lr5/b;

    const/4 v10, 0x2

    invoke-direct {v9, v10, v1, v3}, Lr5/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v8, v9}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_6
    iget v3, v4, Lr9/n;->e:I

    iput v7, v4, Lr9/n;->e:I

    iget-object v3, v4, Lr9/n;->l:Lx8/p;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v7

    invoke-static {v7, v8}, Lx8/t;->J(J)J

    move-result-wide v7

    iput-wide v7, v4, Lr9/n;->g:J

    iget-object v1, v1, Lq3/i;->w:Ljava/lang/Object;

    check-cast v1, Lu8/p;

    if-nez v1, :cond_7

    new-instance v1, Lu8/o;

    invoke-direct {v1}, Lu8/o;-><init>()V

    new-instance v3, Lu8/p;

    invoke-direct {v3, v1}, Lu8/p;-><init>(Lu8/o;)V

    move-object v8, v3

    goto :goto_1

    :cond_7
    move-object v8, v1

    :goto_1
    iget-object v3, v2, Lr9/c;->i:Lr9/m;

    iget-object v1, v2, Lr9/c;->b:Lx8/p;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-wide v4, v5

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v6

    const/4 v9, 0x0

    invoke-interface/range {v3 .. v9}, Lr9/m;->d(JJLu8/p;Landroid/media/MediaFormat;)V

    iget-object v1, v2, Lr9/c;->d:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ljava/lang/ClassCastException;

    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    throw v1

    :cond_8
    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-direct {v1}, Ljava/util/NoSuchElementException;-><init>()V

    throw v1
.end method
