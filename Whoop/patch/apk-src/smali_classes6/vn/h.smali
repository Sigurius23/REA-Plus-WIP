.class public final Lvn/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lvn/i;

.field public final b:Lko/l;

.field public final c:Lko/l;

.field public final d:Lty/c;

.field public final e:[Landroid/net/Uri;

.field public final f:[Lrm/c0;

.field public final g:Lwn/c;

.field public final h:Lsn/w0;

.field public final i:Ljava/util/List;

.field public final j:Lty/c;

.field public final k:Lsm/f;

.field public l:Z

.field public m:[B

.field public n:Lcom/google/android/exoplayer2/source/BehindLiveWindowException;

.field public o:Landroid/net/Uri;

.field public p:Z

.field public q:Lio/o;

.field public r:J

.field public s:Z


# direct methods
.method public constructor <init>(Lvn/i;Lwn/c;[Landroid/net/Uri;[Lrm/c0;Lty/c;Lko/j0;Lty/c;Ljava/util/List;Lsm/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvn/h;->a:Lvn/i;

    iput-object p2, p0, Lvn/h;->g:Lwn/c;

    iput-object p3, p0, Lvn/h;->e:[Landroid/net/Uri;

    iput-object p4, p0, Lvn/h;->f:[Lrm/c0;

    iput-object p7, p0, Lvn/h;->d:Lty/c;

    iput-object p8, p0, Lvn/h;->i:Ljava/util/List;

    iput-object p9, p0, Lvn/h;->k:Lsm/f;

    new-instance p1, Lty/c;

    const/16 p2, 0xe

    invoke-direct {p1, p2}, Lty/c;-><init>(I)V

    iput-object p1, p0, Lvn/h;->j:Lty/c;

    sget-object p1, Llo/y;->f:[B

    iput-object p1, p0, Lvn/h;->m:[B

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lvn/h;->r:J

    iget-object p1, p5, Lty/c;->x:Ljava/lang/Object;

    check-cast p1, Lko/k;

    invoke-interface {p1}, Lko/k;->createDataSource()Lko/l;

    move-result-object p1

    iput-object p1, p0, Lvn/h;->b:Lko/l;

    if-eqz p6, :cond_0

    invoke-interface {p1, p6}, Lko/l;->y(Lko/j0;)V

    :cond_0
    iget-object p1, p5, Lty/c;->x:Ljava/lang/Object;

    check-cast p1, Lko/k;

    invoke-interface {p1}, Lko/k;->createDataSource()Lko/l;

    move-result-object p1

    iput-object p1, p0, Lvn/h;->c:Lko/l;

    new-instance p1, Lsn/w0;

    const-string p2, ""

    invoke-direct {p1, p2, p4}, Lsn/w0;-><init>(Ljava/lang/String;[Lrm/c0;)V

    iput-object p1, p0, Lvn/h;->h:Lsn/w0;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    const/4 p2, 0x0

    move p5, p2

    :goto_0
    array-length p6, p3

    if-ge p5, p6, :cond_2

    aget-object p6, p4, p5

    iget p6, p6, Lrm/c0;->E:I

    and-int/lit16 p6, p6, 0x4000

    if-nez p6, :cond_1

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p6

    invoke-virtual {p1, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 p5, p5, 0x1

    goto :goto_0

    :cond_2
    new-instance p3, Lvn/f;

    iget-object p4, p0, Lvn/h;->h:Lsn/w0;

    invoke-static {p1}, Lvd/f;->S(Ljava/util/Collection;)[I

    move-result-object p1

    invoke-direct {p3, p4, p1}, Lio/c;-><init>(Lsn/w0;[I)V

    aget p1, p1, p2

    iget-object p4, p4, Lsn/w0;->y:[Lrm/c0;

    aget-object p1, p4, p1

    :goto_1
    iget p4, p3, Lio/c;->b:I

    if-ge p2, p4, :cond_4

    iget-object p4, p3, Lio/c;->d:[Lrm/c0;

    aget-object p4, p4, p2

    if-ne p4, p1, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_4
    const/4 p2, -0x1

    :goto_2
    iput p2, p3, Lvn/f;->g:I

    iput-object p3, p0, Lvn/h;->q:Lio/o;

    return-void
.end method


# virtual methods
.method public final a(Lvn/j;J)[Lun/c;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v8, -0x1

    if-nez v1, :cond_0

    move v9, v8

    goto :goto_0

    :cond_0
    iget-object v2, v0, Lvn/h;->h:Lsn/w0;

    iget-object v3, v1, Lun/a;->d:Lrm/c0;

    invoke-virtual {v2, v3}, Lsn/w0;->a(Lrm/c0;)I

    move-result v2

    move v9, v2

    :goto_0
    iget-object v2, v0, Lvn/h;->q:Lio/o;

    invoke-interface {v2}, Lio/o;->length()I

    move-result v10

    new-array v11, v10, [Lun/c;

    const/4 v12, 0x0

    move v13, v12

    :goto_1
    if-ge v13, v10, :cond_b

    iget-object v2, v0, Lvn/h;->q:Lio/o;

    invoke-interface {v2, v13}, Lio/o;->e(I)I

    move-result v2

    iget-object v3, v0, Lvn/h;->e:[Landroid/net/Uri;

    aget-object v3, v3, v2

    iget-object v4, v0, Lvn/h;->g:Lwn/c;

    invoke-virtual {v4, v3}, Lwn/c;->d(Landroid/net/Uri;)Z

    move-result v5

    if-nez v5, :cond_1

    sget-object v2, Lun/c;->B:Lt9/c0;

    aput-object v2, v11, v13

    goto/16 :goto_7

    :cond_1
    invoke-virtual {v4, v12, v3}, Lwn/c;->a(ZLandroid/net/Uri;)Lwn/j;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v5, v3, Lwn/j;->h:J

    iget-wide v14, v4, Lwn/c;->N:J

    sub-long v4, v5, v14

    if-eq v2, v9, :cond_2

    const/4 v2, 0x1

    :goto_2
    move-wide/from16 v6, p2

    goto :goto_3

    :cond_2
    move v2, v12

    goto :goto_2

    :goto_3
    invoke-virtual/range {v0 .. v7}, Lvn/h;->c(Lvn/j;ZLwn/j;JJ)Landroid/util/Pair;

    move-result-object v2

    iget-object v0, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    new-instance v6, Le9/k;

    iget-wide v14, v3, Lwn/j;->k:J

    iget-object v7, v3, Lwn/j;->s:Lzr/g0;

    iget-object v12, v3, Lwn/j;->r:Lzr/g0;

    sub-long/2addr v0, v14

    long-to-int v0, v0

    if-ltz v0, :cond_a

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v1

    if-ge v1, v0, :cond_3

    goto :goto_5

    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v14

    if-ge v0, v14, :cond_7

    if-eq v2, v8, :cond_6

    invoke-interface {v12, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lwn/g;

    if-nez v2, :cond_4

    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_4
    iget-object v15, v14, Lwn/g;->M:Lzr/g0;

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v15

    if-ge v2, v15, :cond_5

    iget-object v14, v14, Lwn/g;->M:Lzr/g0;

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v15

    invoke-interface {v14, v2, v15}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_5
    :goto_4
    add-int/lit8 v0, v0, 0x1

    :cond_6
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v12, v0, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    const/4 v2, 0x0

    :cond_7
    iget-wide v14, v3, Lwn/j;->n:J

    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v14, v16

    if-eqz v0, :cond_9

    if-ne v2, v8, :cond_8

    const/4 v2, 0x0

    :cond_8
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_9

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {v7, v2, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_9
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    goto :goto_6

    :cond_a
    :goto_5
    sget-object v0, Lzr/g0;->x:Lzr/e0;

    sget-object v0, Lzr/w0;->E:Lzr/w0;

    :goto_6
    invoke-direct {v6, v4, v5, v0}, Le9/k;-><init>(JLjava/util/List;)V

    aput-object v6, v11, v13

    :goto_7
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v12, 0x0

    goto/16 :goto_1

    :cond_b
    return-object v11
.end method

.method public final b(Lvn/j;)I
    .locals 8

    iget v0, p1, Lvn/j;->o:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lvn/h;->h:Lsn/w0;

    iget-object v2, p1, Lun/a;->d:Lrm/c0;

    invoke-virtual {v1, v2}, Lsn/w0;->a(Lrm/c0;)I

    move-result v1

    iget-object v2, p0, Lvn/h;->e:[Landroid/net/Uri;

    aget-object v1, v2, v1

    iget-object v2, p0, Lvn/h;->g:Lwn/c;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v1}, Lwn/c;->a(ZLandroid/net/Uri;)Lwn/j;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v1, Lwn/j;->r:Lzr/g0;

    iget-wide v4, p1, Lun/b;->j:J

    iget-wide v6, v1, Lwn/j;->k:J

    sub-long/2addr v4, v6

    long-to-int v4, v4

    if-gez v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    if-ge v4, v5, :cond_2

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwn/g;

    iget-object v2, v2, Lwn/g;->M:Lzr/g0;

    goto :goto_0

    :cond_2
    iget-object v2, v1, Lwn/j;->s:Lzr/g0;

    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    if-lt v0, v4, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwn/e;

    iget-boolean v2, v0, Lwn/e;->M:Z

    if-eqz v2, :cond_4

    return v3

    :cond_4
    iget-object v1, v1, Lwn/n;->a:Ljava/lang/String;

    iget-object v0, v0, Lwn/h;->w:Ljava/lang/String;

    invoke-static {v1, v0}, Llo/a;->B(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iget-object p1, p1, Lun/a;->b:Lko/n;

    iget-object p1, p1, Lko/n;->a:Landroid/net/Uri;

    invoke-static {v0, p1}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    :goto_1
    const/4 p1, 0x1

    return p1

    :cond_5
    :goto_2
    const/4 p1, 0x2

    return p1
.end method

.method public final c(Lvn/j;ZLwn/j;JJ)Landroid/util/Pair;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    const-wide/16 v3, 0x1

    const/4 v5, 0x1

    const/4 v6, -0x1

    if-eqz v1, :cond_5

    iget-wide v7, v1, Lun/b;->j:J

    iget v9, v1, Lvn/j;->o:I

    if-eqz p2, :cond_0

    goto :goto_2

    :cond_0
    iget-boolean v1, v1, Lvn/j;->H:Z

    if-eqz v1, :cond_4

    new-instance v1, Landroid/util/Pair;

    if-ne v9, v6, :cond_2

    const-wide/16 v10, -0x1

    cmp-long v2, v7, v10

    if-eqz v2, :cond_1

    add-long/2addr v7, v3

    goto :goto_0

    :cond_1
    move-wide v7, v10

    :cond_2
    :goto_0
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    if-ne v9, v6, :cond_3

    goto :goto_1

    :cond_3
    add-int/lit8 v6, v9, 0x1

    :goto_1
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :cond_4
    new-instance v1, Landroid/util/Pair;

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :cond_5
    :goto_2
    iget-wide v7, v2, Lwn/j;->u:J

    iget-object v9, v2, Lwn/j;->s:Lzr/g0;

    iget-wide v10, v2, Lwn/j;->k:J

    iget-object v12, v2, Lwn/j;->r:Lzr/g0;

    add-long v7, p4, v7

    if-eqz v1, :cond_7

    iget-boolean v13, v0, Lvn/h;->p:Z

    if-eqz v13, :cond_6

    goto :goto_3

    :cond_6
    iget-wide v13, v1, Lun/a;->g:J

    goto :goto_4

    :cond_7
    :goto_3
    move-wide/from16 v13, p6

    :goto_4
    iget-boolean v2, v2, Lwn/j;->o:Z

    if-nez v2, :cond_8

    cmp-long v2, v13, v7

    if-ltz v2, :cond_8

    new-instance v1, Landroid/util/Pair;

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v10, v2

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :cond_8
    sub-long v13, v13, p4

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget-object v7, v0, Lvn/h;->g:Lwn/c;

    iget-boolean v7, v7, Lwn/c;->M:Z

    const/4 v8, 0x0

    if-eqz v7, :cond_a

    if-nez v1, :cond_9

    goto :goto_5

    :cond_9
    move v5, v8

    :cond_a
    :goto_5
    invoke-static {v12, v2, v5}, Llo/y;->c(Ljava/util/List;Ljava/lang/Long;Z)I

    move-result v1

    int-to-long v3, v1

    add-long/2addr v3, v10

    if-ltz v1, :cond_e

    invoke-interface {v12, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwn/g;

    iget-wide v10, v1, Lwn/h;->E:J

    iget-wide v6, v1, Lwn/h;->y:J

    add-long/2addr v10, v6

    cmp-long v5, v13, v10

    if-gez v5, :cond_b

    iget-object v1, v1, Lwn/g;->M:Lzr/g0;

    goto :goto_6

    :cond_b
    move-object v1, v9

    :goto_6
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    if-ge v8, v5, :cond_e

    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lwn/e;

    iget-wide v6, v5, Lwn/h;->E:J

    iget-wide v10, v5, Lwn/h;->y:J

    add-long/2addr v6, v10

    cmp-long v6, v13, v6

    if-gez v6, :cond_d

    iget-boolean v5, v5, Lwn/e;->L:Z

    if-eqz v5, :cond_e

    if-ne v1, v9, :cond_c

    const-wide/16 v15, 0x1

    goto :goto_7

    :cond_c
    const-wide/16 v1, 0x0

    move-wide v15, v1

    :goto_7
    add-long/2addr v3, v15

    move v6, v8

    goto :goto_8

    :cond_d
    add-int/lit8 v8, v8, 0x1

    goto :goto_6

    :cond_e
    const/4 v6, -0x1

    :goto_8
    new-instance v1, Landroid/util/Pair;

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method

.method public final d(Landroid/net/Uri;I)Lvn/e;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    const/4 v1, 0x0

    if-nez v2, :cond_0

    return-object v1

    :cond_0
    iget-object v3, v0, Lvn/h;->j:Lty/c;

    iget-object v4, v3, Lty/c;->x:Ljava/lang/Object;

    check-cast v4, Lvn/d;

    invoke-virtual {v4, v2}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [B

    if-eqz v4, :cond_1

    iget-object v3, v3, Lty/c;->x:Ljava/lang/Object;

    check-cast v3, Lvn/d;

    invoke-virtual {v3, v2, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    return-object v1

    :cond_1
    sget-object v5, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    new-instance v1, Lko/n;

    const/4 v3, 0x1

    const/4 v4, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, -0x1

    const/4 v10, 0x1

    invoke-direct/range {v1 .. v10}, Lko/n;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJI)V

    new-instance v6, Lvn/e;

    iget-object v2, v0, Lvn/h;->f:[Lrm/c0;

    aget-object v10, v2, p2

    iget-object v2, v0, Lvn/h;->q:Lio/o;

    invoke-interface {v2}, Lio/o;->o()I

    move-result v11

    iget-object v2, v0, Lvn/h;->q:Lio/o;

    invoke-interface {v2}, Lio/o;->g()Ljava/lang/Object;

    move-result-object v12

    iget-object v2, v0, Lvn/h;->m:[B

    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    iget-object v7, v0, Lvn/h;->c:Lko/l;

    const/4 v9, 0x3

    move-object v8, v1

    invoke-direct/range {v6 .. v16}, Lun/a;-><init>(Lko/l;Lko/n;ILrm/c0;ILjava/lang/Object;JJ)V

    if-nez v2, :cond_2

    sget-object v2, Llo/y;->f:[B

    :cond_2
    iput-object v2, v6, Lvn/e;->j:[B

    return-object v6
.end method
