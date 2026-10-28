.class public final Lab/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lab/j;
.implements Lfn/h;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/String;

.field public c:Z

.field public final d:[Z

.field public e:J

.field public f:J

.field public final g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public final j:Ljava/lang/Object;

.field public final k:Ljava/lang/Object;

.field public final l:Ljava/lang/Object;

.field public final m:Ljava/lang/Object;

.field public final n:Ljava/lang/Object;

.field public final o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La33/d;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lab/t;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lab/t;->g:Ljava/lang/Object;

    const/4 p1, 0x3

    .line 3
    new-array p1, p1, [Z

    iput-object p1, p0, Lab/t;->d:[Z

    .line 4
    new-instance p1, Lab/y;

    const/16 v0, 0x20

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lab/y;-><init>(II)V

    iput-object p1, p0, Lab/t;->j:Ljava/lang/Object;

    .line 5
    new-instance p1, Lab/y;

    const/16 v0, 0x21

    invoke-direct {p1, v0, v1}, Lab/y;-><init>(II)V

    iput-object p1, p0, Lab/t;->k:Ljava/lang/Object;

    .line 6
    new-instance p1, Lab/y;

    const/16 v0, 0x22

    invoke-direct {p1, v0, v1}, Lab/y;-><init>(II)V

    iput-object p1, p0, Lab/t;->l:Ljava/lang/Object;

    .line 7
    new-instance p1, Lab/y;

    const/16 v0, 0x27

    invoke-direct {p1, v0, v1}, Lab/y;-><init>(II)V

    iput-object p1, p0, Lab/t;->m:Ljava/lang/Object;

    .line 8
    new-instance p1, Lab/y;

    const/16 v0, 0x28

    invoke-direct {p1, v0, v1}, Lab/y;-><init>(II)V

    iput-object p1, p0, Lab/t;->n:Ljava/lang/Object;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    iput-wide v0, p0, Lab/t;->f:J

    .line 10
    new-instance p1, Lx8/n;

    invoke-direct {p1}, Lx8/n;-><init>()V

    iput-object p1, p0, Lab/t;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lio/sentry/internal/debugmeta/c;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lab/t;->a:I

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lab/t;->g:Ljava/lang/Object;

    const/4 p1, 0x3

    .line 13
    new-array p1, p1, [Z

    iput-object p1, p0, Lab/t;->d:[Z

    .line 14
    new-instance p1, Lab/y;

    const/16 v0, 0x20

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1}, Lab/y;-><init>(II)V

    iput-object p1, p0, Lab/t;->j:Ljava/lang/Object;

    .line 15
    new-instance p1, Lab/y;

    const/16 v0, 0x21

    invoke-direct {p1, v0, v1}, Lab/y;-><init>(II)V

    iput-object p1, p0, Lab/t;->k:Ljava/lang/Object;

    .line 16
    new-instance p1, Lab/y;

    const/16 v0, 0x22

    invoke-direct {p1, v0, v1}, Lab/y;-><init>(II)V

    iput-object p1, p0, Lab/t;->l:Ljava/lang/Object;

    .line 17
    new-instance p1, Lab/y;

    const/16 v0, 0x27

    invoke-direct {p1, v0, v1}, Lab/y;-><init>(II)V

    iput-object p1, p0, Lab/t;->m:Ljava/lang/Object;

    .line 18
    new-instance p1, Lab/y;

    const/16 v0, 0x28

    invoke-direct {p1, v0, v1}, Lab/y;-><init>(II)V

    iput-object p1, p0, Lab/t;->n:Ljava/lang/Object;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    iput-wide v0, p0, Lab/t;->f:J

    .line 20
    new-instance p1, Led3/a;

    invoke-direct {p1}, Led3/a;-><init>()V

    iput-object p1, p0, Lab/t;->o:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget v0, p0, Lab/t;->a:I

    packed-switch v0, :pswitch_data_0

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lab/t;->e:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lab/t;->f:J

    iget-object v0, p0, Lab/t;->d:[Z

    invoke-static {v0}, Llo/a;->l([Z)V

    iget-object v0, p0, Lab/t;->j:Ljava/lang/Object;

    check-cast v0, Lab/y;

    invoke-virtual {v0}, Lab/y;->d()V

    iget-object v0, p0, Lab/t;->k:Ljava/lang/Object;

    check-cast v0, Lab/y;

    invoke-virtual {v0}, Lab/y;->d()V

    iget-object v0, p0, Lab/t;->l:Ljava/lang/Object;

    check-cast v0, Lab/y;

    invoke-virtual {v0}, Lab/y;->d()V

    iget-object v0, p0, Lab/t;->m:Ljava/lang/Object;

    check-cast v0, Lab/y;

    invoke-virtual {v0}, Lab/y;->d()V

    iget-object v0, p0, Lab/t;->n:Ljava/lang/Object;

    check-cast v0, Lab/y;

    invoke-virtual {v0}, Lab/y;->d()V

    iget-object v0, p0, Lab/t;->i:Ljava/lang/Object;

    check-cast v0, Lab/s;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lab/s;->e:Z

    iput-boolean v1, v0, Lab/s;->f:Z

    iput-boolean v1, v0, Lab/s;->g:Z

    iput-boolean v1, v0, Lab/s;->h:Z

    iput-boolean v1, v0, Lab/s;->i:Z

    :cond_0
    return-void

    :pswitch_0
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lab/t;->e:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lab/t;->f:J

    iget-object v0, p0, Lab/t;->d:[Z

    invoke-static {v0}, Ly8/n;->b([Z)V

    iget-object v0, p0, Lab/t;->j:Ljava/lang/Object;

    check-cast v0, Lab/y;

    invoke-virtual {v0}, Lab/y;->d()V

    iget-object v0, p0, Lab/t;->k:Ljava/lang/Object;

    check-cast v0, Lab/y;

    invoke-virtual {v0}, Lab/y;->d()V

    iget-object v0, p0, Lab/t;->l:Ljava/lang/Object;

    check-cast v0, Lab/y;

    invoke-virtual {v0}, Lab/y;->d()V

    iget-object v0, p0, Lab/t;->m:Ljava/lang/Object;

    check-cast v0, Lab/y;

    invoke-virtual {v0}, Lab/y;->d()V

    iget-object v0, p0, Lab/t;->n:Ljava/lang/Object;

    check-cast v0, Lab/y;

    invoke-virtual {v0}, Lab/y;->d()V

    iget-object v0, p0, Lab/t;->g:Ljava/lang/Object;

    check-cast v0, La33/d;

    iget-object v0, v0, La33/d;->z:Ljava/lang/Object;

    check-cast v0, Lre/g;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lre/g;->b(I)V

    iget-object v0, p0, Lab/t;->i:Ljava/lang/Object;

    check-cast v0, Lab/s;

    if-eqz v0, :cond_1

    iput-boolean v1, v0, Lab/s;->e:Z

    iput-boolean v1, v0, Lab/s;->f:Z

    iput-boolean v1, v0, Lab/s;->g:Z

    iput-boolean v1, v0, Lab/s;->h:Z

    iput-boolean v1, v0, Lab/s;->i:Z

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b(IIJJ)V
    .locals 31

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-wide/from16 v2, p5

    iget-object v4, v0, Lab/t;->l:Ljava/lang/Object;

    check-cast v4, Lab/y;

    iget-object v5, v0, Lab/t;->k:Ljava/lang/Object;

    check-cast v5, Lab/y;

    iget-object v6, v0, Lab/t;->j:Ljava/lang/Object;

    check-cast v6, Lab/y;

    iget-object v7, v0, Lab/t;->n:Ljava/lang/Object;

    check-cast v7, Lab/y;

    iget-object v8, v0, Lab/t;->m:Ljava/lang/Object;

    check-cast v8, Lab/y;

    iget-object v9, v0, Lab/t;->g:Ljava/lang/Object;

    check-cast v9, La33/d;

    iget-object v9, v9, La33/d;->z:Ljava/lang/Object;

    check-cast v9, Lre/g;

    iget-object v10, v0, Lab/t;->o:Ljava/lang/Object;

    check-cast v10, Lx8/n;

    iget-object v11, v0, Lab/t;->i:Ljava/lang/Object;

    check-cast v11, Lab/s;

    iget-boolean v12, v0, Lab/t;->c:Z

    iget-boolean v13, v11, Lab/s;->i:Z

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eqz v13, :cond_0

    iget-boolean v13, v11, Lab/s;->f:Z

    if-eqz v13, :cond_0

    iget-boolean v12, v11, Lab/s;->b:Z

    iput-boolean v12, v11, Lab/s;->l:Z

    iput-boolean v14, v11, Lab/s;->i:Z

    goto :goto_0

    :cond_0
    iget-boolean v13, v11, Lab/s;->g:Z

    if-nez v13, :cond_1

    iget-boolean v13, v11, Lab/s;->f:Z

    if-eqz v13, :cond_3

    :cond_1
    if-eqz v12, :cond_2

    iget-boolean v12, v11, Lab/s;->h:Z

    if-eqz v12, :cond_2

    iget-wide v12, v11, Lab/s;->a:J

    sub-long v12, p3, v12

    long-to-int v12, v12

    add-int v12, p1, v12

    invoke-virtual {v11, v12}, Lab/s;->a(I)V

    :cond_2
    iget-wide v12, v11, Lab/s;->a:J

    iput-wide v12, v11, Lab/s;->j:J

    iget-wide v12, v11, Lab/s;->d:J

    iput-wide v12, v11, Lab/s;->k:J

    iget-boolean v12, v11, Lab/s;->b:Z

    iput-boolean v12, v11, Lab/s;->l:Z

    iput-boolean v15, v11, Lab/s;->h:Z

    :cond_3
    :goto_0
    iget-boolean v11, v0, Lab/t;->c:Z

    if-nez v11, :cond_7

    invoke-virtual {v6, v1}, Lab/y;->b(I)Z

    invoke-virtual {v5, v1}, Lab/y;->b(I)Z

    invoke-virtual {v4, v1}, Lab/y;->b(I)Z

    iget-boolean v11, v6, Lab/y;->d:Z

    if-eqz v11, :cond_7

    iget-boolean v11, v5, Lab/y;->d:Z

    if-eqz v11, :cond_7

    iget-boolean v11, v4, Lab/y;->d:Z

    if-eqz v11, :cond_7

    iget-object v11, v0, Lab/t;->b:Ljava/lang/String;

    iget v12, v6, Lab/y;->f:I

    iget v13, v5, Lab/y;->f:I

    add-int/2addr v13, v12

    move/from16 v16, v15

    iget v15, v4, Lab/y;->f:I

    add-int/2addr v13, v15

    new-array v13, v13, [B

    iget-object v15, v6, Lab/y;->e:Ljava/lang/Object;

    check-cast v15, [B

    invoke-static {v15, v14, v13, v14, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v12, v5, Lab/y;->e:Ljava/lang/Object;

    check-cast v12, [B

    iget v15, v6, Lab/y;->f:I

    move-object/from16 v17, v7

    iget v7, v5, Lab/y;->f:I

    invoke-static {v12, v14, v13, v15, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v7, v4, Lab/y;->e:Ljava/lang/Object;

    check-cast v7, [B

    iget v6, v6, Lab/y;->f:I

    iget v12, v5, Lab/y;->f:I

    add-int/2addr v6, v12

    iget v4, v4, Lab/y;->f:I

    invoke-static {v7, v14, v13, v6, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v4, v5, Lab/y;->e:Ljava/lang/Object;

    check-cast v4, [B

    iget v5, v5, Lab/y;->f:I

    const/4 v6, 0x3

    const/4 v7, 0x0

    invoke-static {v4, v6, v5, v7}, Ly8/n;->i([BIILq/f;)Ly8/j;

    move-result-object v4

    iget-object v5, v4, Ly8/j;->b:Ly8/h;

    if-eqz v5, :cond_4

    iget v6, v5, Ly8/h;->a:I

    iget-boolean v7, v5, Ly8/h;->b:Z

    iget v12, v5, Ly8/h;->c:I

    iget v15, v5, Ly8/h;->d:I

    iget-object v14, v5, Ly8/h;->e:[I

    iget v5, v5, Ly8/h;->f:I

    move/from16 v23, v5

    move/from16 v18, v6

    move/from16 v19, v7

    move/from16 v20, v12

    move-object/from16 v22, v14

    move/from16 v21, v15

    invoke-static/range {v18 .. v23}, Lx8/b;->a(IZII[II)Ljava/lang/String;

    move-result-object v7

    :cond_4
    new-instance v5, Lu8/o;

    invoke-direct {v5}, Lu8/o;-><init>()V

    iput-object v11, v5, Lu8/o;->a:Ljava/lang/String;

    const-string v6, "video/mp2t"

    invoke-static {v6}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v5, Lu8/o;->l:Ljava/lang/String;

    const-string v6, "video/hevc"

    invoke-static {v6}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v5, Lu8/o;->m:Ljava/lang/String;

    iput-object v7, v5, Lu8/o;->j:Ljava/lang/String;

    iget v6, v4, Ly8/j;->e:I

    iput v6, v5, Lu8/o;->t:I

    iget v6, v4, Ly8/j;->f:I

    iput v6, v5, Lu8/o;->u:I

    iget v6, v4, Ly8/j;->i:I

    iget v7, v4, Ly8/j;->j:I

    iget v11, v4, Ly8/j;->k:I

    iget v12, v4, Ly8/j;->c:I

    add-int/lit8 v28, v12, 0x8

    iget v12, v4, Ly8/j;->d:I

    add-int/lit8 v29, v12, 0x8

    new-instance v24, Lu8/g;

    const/16 v30, 0x0

    move/from16 v25, v6

    move/from16 v26, v7

    move/from16 v27, v11

    invoke-direct/range {v24 .. v30}, Lu8/g;-><init>(IIIII[B)V

    move-object/from16 v6, v24

    iput-object v6, v5, Lu8/o;->A:Lu8/g;

    iget v6, v4, Ly8/j;->g:F

    iput v6, v5, Lu8/o;->x:F

    iget v6, v4, Ly8/j;->h:I

    iput v6, v5, Lu8/o;->o:I

    iget v4, v4, Ly8/j;->a:I

    add-int/lit8 v4, v4, 0x1

    iput v4, v5, Lu8/o;->B:I

    invoke-static {v13}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    iput-object v4, v5, Lu8/o;->p:Ljava/util/List;

    new-instance v4, Lu8/p;

    invoke-direct {v4, v5}, Lu8/p;-><init>(Lu8/o;)V

    iget-object v5, v0, Lab/t;->h:Ljava/lang/Object;

    check-cast v5, Lt9/k0;

    invoke-interface {v5, v4}, Lt9/k0;->a(Lu8/p;)V

    const/4 v5, -0x1

    iget v4, v4, Lu8/p;->p:I

    if-eq v4, v5, :cond_6

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-ltz v4, :cond_5

    move/from16 v14, v16

    goto :goto_1

    :cond_5
    const/4 v14, 0x0

    :goto_1
    invoke-static {v14}, Lva3/g;->i(Z)V

    iput v4, v9, Lre/g;->a:I

    invoke-virtual {v9, v4}, Lre/g;->b(I)V

    move/from16 v4, v16

    iput-boolean v4, v0, Lab/t;->c:Z

    goto :goto_2

    :cond_6
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :cond_7
    move-object/from16 v17, v7

    :goto_2
    invoke-virtual {v8, v1}, Lab/y;->b(I)Z

    move-result v4

    const/4 v5, 0x5

    if-eqz v4, :cond_8

    iget-object v4, v8, Lab/y;->e:Ljava/lang/Object;

    check-cast v4, [B

    iget v6, v8, Lab/y;->f:I

    invoke-static {v6, v4}, Ly8/n;->n(I[B)I

    move-result v4

    iget-object v6, v8, Lab/y;->e:Ljava/lang/Object;

    check-cast v6, [B

    invoke-virtual {v10, v4, v6}, Lx8/n;->D(I[B)V

    invoke-virtual {v10, v5}, Lx8/n;->G(I)V

    invoke-virtual {v9, v2, v3, v10}, Lre/g;->a(JLx8/n;)V

    :cond_8
    move-object/from16 v7, v17

    invoke-virtual {v7, v1}, Lab/y;->b(I)Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v1, v7, Lab/y;->e:Ljava/lang/Object;

    check-cast v1, [B

    iget v4, v7, Lab/y;->f:I

    invoke-static {v4, v1}, Ly8/n;->n(I[B)I

    move-result v1

    iget-object v4, v7, Lab/y;->e:Ljava/lang/Object;

    check-cast v4, [B

    invoke-virtual {v10, v1, v4}, Lx8/n;->D(I[B)V

    invoke-virtual {v10, v5}, Lx8/n;->G(I)V

    invoke-virtual {v9, v2, v3, v10}, Lre/g;->a(JLx8/n;)V

    :cond_9
    return-void
.end method

.method public c(Lx8/n;)V
    .locals 13

    iget-object v1, p0, Lab/t;->h:Ljava/lang/Object;

    check-cast v1, Lt9/k0;

    invoke-static {v1}, Lva3/g;->j(Ljava/lang/Object;)V

    sget v1, Lx8/t;->a:I

    :cond_0
    invoke-virtual {p1}, Lx8/n;->a()I

    move-result v1

    if-lez v1, :cond_5

    iget v1, p1, Lx8/n;->b:I

    iget v7, p1, Lx8/n;->c:I

    iget-object v8, p1, Lx8/n;->a:[B

    iget-wide v2, p0, Lab/t;->e:J

    invoke-virtual {p1}, Lx8/n;->a()I

    move-result v4

    int-to-long v4, v4

    add-long/2addr v2, v4

    iput-wide v2, p0, Lab/t;->e:J

    iget-object v2, p0, Lab/t;->h:Ljava/lang/Object;

    check-cast v2, Lt9/k0;

    invoke-virtual {p1}, Lx8/n;->a()I

    move-result v3

    const/4 v9, 0x0

    invoke-interface {v2, p1, v3, v9}, Lt9/k0;->d(Lx8/n;II)V

    :goto_0
    if-ge v1, v7, :cond_0

    iget-object v2, p0, Lab/t;->d:[Z

    invoke-static {v8, v1, v7, v2}, Ly8/n;->c([BII[Z)I

    move-result v2

    if-ne v2, v7, :cond_1

    invoke-virtual {p0, v8, v1, v7}, Lab/t;->j([BII)V

    return-void

    :cond_1
    add-int/lit8 v3, v2, 0x3

    aget-byte v3, v8, v3

    and-int/lit8 v3, v3, 0x7e

    shr-int/lit8 v10, v3, 0x1

    if-lez v2, :cond_2

    add-int/lit8 v3, v2, -0x1

    aget-byte v3, v8, v3

    if-nez v3, :cond_2

    add-int/lit8 v2, v2, -0x1

    const/4 v3, 0x4

    :goto_1
    move v11, v2

    move v12, v3

    goto :goto_2

    :cond_2
    const/4 v3, 0x3

    goto :goto_1

    :goto_2
    sub-int v2, v11, v1

    if-lez v2, :cond_3

    invoke-virtual {p0, v8, v1, v11}, Lab/t;->j([BII)V

    :cond_3
    sub-int v1, v7, v11

    iget-wide v3, p0, Lab/t;->e:J

    int-to-long v5, v1

    sub-long/2addr v3, v5

    if-gez v2, :cond_4

    neg-int v2, v2

    goto :goto_3

    :cond_4
    move v2, v9

    :goto_3
    iget-wide v5, p0, Lab/t;->f:J

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lab/t;->b(IIJJ)V

    iget-wide v5, p0, Lab/t;->f:J

    move v2, v10

    invoke-virtual/range {v0 .. v6}, Lab/t;->k(IIJJ)V

    add-int v1, v11, v12

    goto :goto_0

    :cond_5
    return-void
.end method

.method public final d(IJ)V
    .locals 2

    iget p1, p0, Lab/t;->a:I

    packed-switch p1, :pswitch_data_0

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, p2, v0

    if-eqz p1, :cond_0

    iput-wide p2, p0, Lab/t;->f:J

    :cond_0
    return-void

    :pswitch_0
    iput-wide p2, p0, Lab/t;->f:J

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public e(Z)V
    .locals 7

    iget-object v1, p0, Lab/t;->h:Ljava/lang/Object;

    check-cast v1, Lt9/k0;

    invoke-static {v1}, Lva3/g;->j(Ljava/lang/Object;)V

    sget v1, Lx8/t;->a:I

    if-eqz p1, :cond_0

    iget-object v1, p0, Lab/t;->g:Ljava/lang/Object;

    check-cast v1, La33/d;

    iget-object v1, v1, La33/d;->z:Ljava/lang/Object;

    check-cast v1, Lre/g;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lre/g;->b(I)V

    iget-wide v3, p0, Lab/t;->e:J

    iget-wide v5, p0, Lab/t;->f:J

    const/4 v1, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lab/t;->b(IIJJ)V

    iget-wide v3, p0, Lab/t;->e:J

    const/16 v2, 0x30

    iget-wide v5, p0, Lab/t;->f:J

    invoke-virtual/range {v0 .. v6}, Lab/t;->k(IIJJ)V

    :cond_0
    return-void
.end method

.method public f(Led3/a;)V
    .locals 47

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lab/t;->m:Ljava/lang/Object;

    check-cast v2, Lab/y;

    iget-object v3, v0, Lab/t;->n:Ljava/lang/Object;

    check-cast v3, Lab/y;

    iget-object v4, v0, Lab/t;->j:Ljava/lang/Object;

    check-cast v4, Lab/y;

    iget-object v5, v0, Lab/t;->k:Ljava/lang/Object;

    check-cast v5, Lab/y;

    iget-object v6, v0, Lab/t;->l:Ljava/lang/Object;

    check-cast v6, Lab/y;

    iget-object v7, v0, Lab/t;->h:Ljava/lang/Object;

    check-cast v7, Lwm/s;

    invoke-static {v7}, Llo/a;->j(Ljava/lang/Object;)V

    sget v7, Llo/y;->a:I

    :goto_0
    invoke-virtual {v1}, Led3/a;->a()I

    move-result v7

    if-lez v7, :cond_3e

    iget v7, v1, Led3/a;->b:I

    iget v8, v1, Led3/a;->c:I

    iget-object v9, v1, Led3/a;->a:[B

    iget-wide v10, v0, Lab/t;->e:J

    invoke-virtual {v1}, Led3/a;->a()I

    move-result v12

    int-to-long v12, v12

    add-long/2addr v10, v12

    iput-wide v10, v0, Lab/t;->e:J

    iget-object v10, v0, Lab/t;->h:Ljava/lang/Object;

    check-cast v10, Lwm/s;

    invoke-virtual {v1}, Led3/a;->a()I

    move-result v11

    invoke-interface {v10, v11, v1}, Lwm/s;->c(ILed3/a;)V

    :goto_1
    if-ge v7, v8, :cond_3d

    iget-object v10, v0, Lab/t;->d:[Z

    invoke-static {v9, v7, v8, v10}, Llo/a;->p([BII[Z)I

    move-result v10

    if-ne v10, v8, :cond_0

    invoke-virtual {v0, v9, v7, v8}, Lab/t;->j([BII)V

    return-void

    :cond_0
    add-int/lit8 v11, v10, 0x3

    aget-byte v12, v9, v11

    and-int/lit8 v12, v12, 0x7e

    const/4 v13, 0x1

    shr-int/2addr v12, v13

    sub-int v14, v10, v7

    if-lez v14, :cond_1

    invoke-virtual {v0, v9, v7, v10}, Lab/t;->j([BII)V

    :cond_1
    sub-int v7, v8, v10

    move v15, v14

    iget-wide v13, v0, Lab/t;->e:J

    move/from16 v22, v11

    int-to-long v10, v7

    sub-long/2addr v13, v10

    if-gez v15, :cond_2

    neg-int v10, v15

    move v15, v10

    :goto_2
    move/from16 v23, v12

    goto :goto_3

    :cond_2
    const/4 v15, 0x0

    goto :goto_2

    :goto_3
    iget-wide v11, v0, Lab/t;->f:J

    iget-object v10, v0, Lab/t;->g:Ljava/lang/Object;

    check-cast v10, Lio/sentry/internal/debugmeta/c;

    iget-object v10, v10, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v10, [Lwm/s;

    iget-object v1, v0, Lab/t;->o:Ljava/lang/Object;

    check-cast v1, Led3/a;

    move/from16 v20, v7

    iget-object v7, v0, Lab/t;->i:Ljava/lang/Object;

    check-cast v7, Lab/s;

    move/from16 v24, v8

    iget-boolean v8, v0, Lab/t;->c:Z

    move/from16 v17, v8

    iget-boolean v8, v7, Lab/s;->i:Z

    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v8, :cond_4

    iget-boolean v8, v7, Lab/s;->f:Z

    if-eqz v8, :cond_4

    iget-boolean v8, v7, Lab/s;->b:Z

    iput-boolean v8, v7, Lab/s;->l:Z

    const/4 v8, 0x0

    iput-boolean v8, v7, Lab/s;->i:Z

    :cond_3
    move-object/from16 v25, v9

    :goto_4
    move-object v7, v10

    goto :goto_6

    :cond_4
    iget-boolean v8, v7, Lab/s;->g:Z

    if-nez v8, :cond_5

    iget-boolean v8, v7, Lab/s;->f:Z

    if-eqz v8, :cond_3

    :cond_5
    if-eqz v17, :cond_7

    iget-boolean v8, v7, Lab/s;->h:Z

    if-eqz v8, :cond_7

    move-object/from16 v25, v9

    iget-wide v8, v7, Lab/s;->a:J

    move-wide/from16 v26, v8

    sub-long v8, v13, v26

    long-to-int v8, v8

    add-int v33, v20, v8

    iget-wide v8, v7, Lab/s;->k:J

    cmp-long v17, v8, v18

    if-nez v17, :cond_6

    goto :goto_5

    :cond_6
    move-wide/from16 v29, v8

    iget-boolean v8, v7, Lab/s;->l:Z

    move/from16 v31, v8

    iget-wide v8, v7, Lab/s;->j:J

    sub-long v8, v26, v8

    long-to-int v8, v8

    iget-object v9, v7, Lab/s;->m:Ljava/lang/Object;

    move-object/from16 v28, v9

    check-cast v28, Lwm/s;

    const/16 v34, 0x0

    move/from16 v32, v8

    invoke-interface/range {v28 .. v34}, Lwm/s;->d(JIIILwm/r;)V

    goto :goto_5

    :cond_7
    move-object/from16 v25, v9

    :goto_5
    iget-wide v8, v7, Lab/s;->a:J

    iput-wide v8, v7, Lab/s;->j:J

    iget-wide v8, v7, Lab/s;->d:J

    iput-wide v8, v7, Lab/s;->k:J

    iget-boolean v8, v7, Lab/s;->b:Z

    iput-boolean v8, v7, Lab/s;->l:Z

    const/4 v8, 0x1

    iput-boolean v8, v7, Lab/s;->h:Z

    goto :goto_4

    :goto_6
    iget-boolean v8, v0, Lab/t;->c:Z

    if-nez v8, :cond_2e

    invoke-virtual {v4, v15}, Lab/y;->b(I)Z

    invoke-virtual {v5, v15}, Lab/y;->b(I)Z

    invoke-virtual {v6, v15}, Lab/y;->b(I)Z

    iget-boolean v8, v4, Lab/y;->d:Z

    if-eqz v8, :cond_2e

    iget-boolean v8, v5, Lab/y;->d:Z

    if-eqz v8, :cond_2e

    iget-boolean v8, v6, Lab/y;->d:Z

    if-eqz v8, :cond_2e

    iget-object v8, v0, Lab/t;->h:Ljava/lang/Object;

    check-cast v8, Lwm/s;

    iget-object v9, v0, Lab/t;->b:Ljava/lang/String;

    iget v10, v4, Lab/y;->f:I

    move-wide/from16 v28, v13

    iget v13, v5, Lab/y;->f:I

    add-int/2addr v13, v10

    iget v14, v6, Lab/y;->f:I

    add-int/2addr v13, v14

    new-array v13, v13, [B

    iget-object v14, v4, Lab/y;->e:Ljava/lang/Object;

    check-cast v14, [B

    move-object/from16 v30, v3

    const/4 v3, 0x0

    invoke-static {v14, v3, v13, v3, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v10, v5, Lab/y;->e:Ljava/lang/Object;

    check-cast v10, [B

    iget v14, v4, Lab/y;->f:I

    move-object/from16 v21, v7

    iget v7, v5, Lab/y;->f:I

    invoke-static {v10, v3, v13, v14, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v7, v6, Lab/y;->e:Ljava/lang/Object;

    check-cast v7, [B

    iget v10, v4, Lab/y;->f:I

    iget v14, v5, Lab/y;->f:I

    add-int/2addr v10, v14

    iget v14, v6, Lab/y;->f:I

    invoke-static {v7, v3, v13, v10, v14}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v7, Llo/s;

    iget-object v10, v5, Lab/y;->e:Ljava/lang/Object;

    check-cast v10, [B

    iget v14, v5, Lab/y;->f:I

    move-object/from16 v31, v13

    const/4 v13, 0x1

    invoke-direct {v7, v3, v14, v13, v10}, Llo/s;-><init>(III[B)V

    const/16 v3, 0x2c

    invoke-virtual {v7, v3}, Llo/s;->t(I)V

    const/4 v10, 0x3

    invoke-virtual {v7, v10}, Llo/s;->i(I)I

    move-result v3

    invoke-virtual {v7}, Llo/s;->s()V

    const/4 v13, 0x2

    invoke-virtual {v7, v13}, Llo/s;->i(I)I

    move-result v32

    invoke-virtual {v7}, Llo/s;->h()Z

    move-result v33

    const/4 v14, 0x5

    invoke-virtual {v7, v14}, Llo/s;->i(I)I

    move-result v34

    move/from16 v36, v13

    const/4 v14, 0x0

    const/16 v35, 0x0

    :goto_7
    const/16 v13, 0x20

    if-ge v14, v13, :cond_9

    invoke-virtual {v7}, Llo/s;->h()Z

    move-result v13

    if-eqz v13, :cond_8

    const/16 v16, 0x1

    shl-int v13, v16, v14

    or-int v13, v35, v13

    move/from16 v35, v13

    :cond_8
    add-int/lit8 v14, v14, 0x1

    goto :goto_7

    :cond_9
    const/4 v13, 0x6

    new-array v14, v13, [I

    move-object/from16 v38, v14

    const/4 v10, 0x0

    :goto_8
    const/16 v14, 0x8

    if-ge v10, v13, :cond_a

    invoke-virtual {v7, v14}, Llo/s;->i(I)I

    move-result v14

    aput v14, v38, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_8

    :cond_a
    invoke-virtual {v7, v14}, Llo/s;->i(I)I

    move-result v10

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_9
    if-ge v14, v3, :cond_d

    invoke-virtual {v7}, Llo/s;->h()Z

    move-result v41

    if-eqz v41, :cond_b

    add-int/lit8 v13, v13, 0x59

    :cond_b
    invoke-virtual {v7}, Llo/s;->h()Z

    move-result v41

    if-eqz v41, :cond_c

    add-int/lit8 v13, v13, 0x8

    :cond_c
    add-int/lit8 v14, v14, 0x1

    goto :goto_9

    :cond_d
    invoke-virtual {v7, v13}, Llo/s;->t(I)V

    if-lez v3, :cond_e

    rsub-int/lit8 v13, v3, 0x8

    mul-int/lit8 v13, v13, 0x2

    invoke-virtual {v7, v13}, Llo/s;->t(I)V

    :cond_e
    invoke-virtual {v7}, Llo/s;->m()I

    invoke-virtual {v7}, Llo/s;->m()I

    move-result v13

    const/4 v14, 0x3

    if-ne v13, v14, :cond_f

    invoke-virtual {v7}, Llo/s;->s()V

    :cond_f
    invoke-virtual {v7}, Llo/s;->m()I

    move-result v14

    invoke-virtual {v7}, Llo/s;->m()I

    move-result v41

    invoke-virtual {v7}, Llo/s;->h()Z

    move-result v42

    if-eqz v42, :cond_13

    invoke-virtual {v7}, Llo/s;->m()I

    move-result v42

    invoke-virtual {v7}, Llo/s;->m()I

    move-result v43

    invoke-virtual {v7}, Llo/s;->m()I

    move-result v44

    invoke-virtual {v7}, Llo/s;->m()I

    move-result v45

    move/from16 v46, v10

    const/4 v10, 0x1

    if-eq v13, v10, :cond_11

    move/from16 v10, v36

    if-ne v13, v10, :cond_10

    goto :goto_b

    :cond_10
    const/16 v16, 0x1

    :goto_a
    const/4 v10, 0x1

    goto :goto_c

    :cond_11
    :goto_b
    const/16 v16, 0x2

    goto :goto_a

    :goto_c
    if-ne v13, v10, :cond_12

    const/4 v13, 0x2

    goto :goto_d

    :cond_12
    const/4 v13, 0x1

    :goto_d
    add-int v42, v42, v43

    mul-int v42, v42, v16

    sub-int v14, v14, v42

    add-int v44, v44, v45

    mul-int v44, v44, v13

    sub-int v41, v41, v44

    goto :goto_e

    :cond_13
    move/from16 v46, v10

    :goto_e
    invoke-virtual {v7}, Llo/s;->m()I

    invoke-virtual {v7}, Llo/s;->m()I

    invoke-virtual {v7}, Llo/s;->m()I

    move-result v13

    invoke-virtual {v7}, Llo/s;->h()Z

    move-result v16

    if-eqz v16, :cond_14

    const/16 v16, 0x0

    goto :goto_f

    :cond_14
    move/from16 v16, v3

    :goto_f
    move/from16 v10, v16

    :goto_10
    if-gt v10, v3, :cond_15

    invoke-virtual {v7}, Llo/s;->m()I

    invoke-virtual {v7}, Llo/s;->m()I

    invoke-virtual {v7}, Llo/s;->m()I

    add-int/lit8 v10, v10, 0x1

    goto :goto_10

    :cond_15
    invoke-virtual {v7}, Llo/s;->m()I

    invoke-virtual {v7}, Llo/s;->m()I

    invoke-virtual {v7}, Llo/s;->m()I

    invoke-virtual {v7}, Llo/s;->m()I

    invoke-virtual {v7}, Llo/s;->m()I

    invoke-virtual {v7}, Llo/s;->m()I

    invoke-virtual {v7}, Llo/s;->h()Z

    move-result v3

    const/4 v10, 0x4

    if-eqz v3, :cond_1b

    invoke-virtual {v7}, Llo/s;->h()Z

    move-result v3

    if-eqz v3, :cond_1b

    const/4 v3, 0x0

    :goto_11
    if-ge v3, v10, :cond_1b

    move/from16 v16, v10

    move/from16 v40, v13

    const/4 v10, 0x0

    :goto_12
    const/4 v13, 0x6

    if-ge v10, v13, :cond_1a

    invoke-virtual {v7}, Llo/s;->h()Z

    move-result v43

    if-nez v43, :cond_17

    invoke-virtual {v7}, Llo/s;->m()I

    move/from16 v43, v10

    :cond_16
    const/4 v10, 0x3

    goto :goto_14

    :cond_17
    shl-int/lit8 v43, v3, 0x1

    add-int/lit8 v43, v43, 0x4

    const/16 v42, 0x1

    shl-int v13, v42, v43

    move/from16 v43, v10

    const/16 v10, 0x40

    invoke-static {v10, v13}, Ljava/lang/Math;->min(II)I

    move-result v10

    move/from16 v13, v42

    if-le v3, v13, :cond_18

    invoke-virtual {v7}, Llo/s;->n()I

    :cond_18
    const/4 v13, 0x0

    :goto_13
    if-ge v13, v10, :cond_16

    invoke-virtual {v7}, Llo/s;->n()I

    add-int/lit8 v13, v13, 0x1

    goto :goto_13

    :goto_14
    if-ne v3, v10, :cond_19

    move v13, v10

    goto :goto_15

    :cond_19
    const/4 v13, 0x1

    :goto_15
    add-int v13, v43, v13

    move v10, v13

    goto :goto_12

    :cond_1a
    const/4 v10, 0x3

    add-int/lit8 v3, v3, 0x1

    move/from16 v10, v16

    move/from16 v13, v40

    goto :goto_11

    :cond_1b
    move/from16 v16, v10

    move/from16 v40, v13

    const/4 v10, 0x2

    invoke-virtual {v7, v10}, Llo/s;->t(I)V

    invoke-virtual {v7}, Llo/s;->h()Z

    move-result v3

    if-eqz v3, :cond_1c

    const/16 v3, 0x8

    invoke-virtual {v7, v3}, Llo/s;->t(I)V

    invoke-virtual {v7}, Llo/s;->m()I

    invoke-virtual {v7}, Llo/s;->m()I

    invoke-virtual {v7}, Llo/s;->s()V

    :cond_1c
    invoke-virtual {v7}, Llo/s;->m()I

    move-result v3

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/16 v37, 0x0

    :goto_16
    if-ge v10, v3, :cond_23

    if-eqz v10, :cond_1d

    invoke-virtual {v7}, Llo/s;->h()Z

    move-result v37

    :cond_1d
    if-eqz v37, :cond_20

    invoke-virtual {v7}, Llo/s;->s()V

    invoke-virtual {v7}, Llo/s;->m()I

    move/from16 v43, v3

    const/4 v3, 0x0

    :goto_17
    if-gt v3, v13, :cond_1f

    invoke-virtual {v7}, Llo/s;->h()Z

    move-result v44

    if-eqz v44, :cond_1e

    invoke-virtual {v7}, Llo/s;->s()V

    :cond_1e
    add-int/lit8 v3, v3, 0x1

    goto :goto_17

    :cond_1f
    move/from16 v45, v10

    goto :goto_1a

    :cond_20
    move/from16 v43, v3

    invoke-virtual {v7}, Llo/s;->m()I

    move-result v3

    invoke-virtual {v7}, Llo/s;->m()I

    move-result v13

    add-int v44, v3, v13

    move/from16 v45, v10

    const/4 v10, 0x0

    :goto_18
    if-ge v10, v3, :cond_21

    invoke-virtual {v7}, Llo/s;->m()I

    invoke-virtual {v7}, Llo/s;->s()V

    add-int/lit8 v10, v10, 0x1

    goto :goto_18

    :cond_21
    const/4 v3, 0x0

    :goto_19
    if-ge v3, v13, :cond_22

    invoke-virtual {v7}, Llo/s;->m()I

    invoke-virtual {v7}, Llo/s;->s()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_19

    :cond_22
    move/from16 v13, v44

    :goto_1a
    add-int/lit8 v10, v45, 0x1

    move/from16 v3, v43

    goto :goto_16

    :cond_23
    invoke-virtual {v7}, Llo/s;->h()Z

    move-result v3

    if-eqz v3, :cond_24

    const/4 v3, 0x0

    :goto_1b
    invoke-virtual {v7}, Llo/s;->m()I

    move-result v10

    if-ge v3, v10, :cond_24

    const/16 v17, 0x5

    add-int/lit8 v13, v40, 0x5

    invoke-virtual {v7, v13}, Llo/s;->t(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1b

    :cond_24
    const/4 v10, 0x2

    invoke-virtual {v7, v10}, Llo/s;->t(I)V

    invoke-virtual {v7}, Llo/s;->h()Z

    move-result v3

    if-eqz v3, :cond_2d

    invoke-virtual {v7}, Llo/s;->h()Z

    move-result v3

    if-eqz v3, :cond_28

    const/16 v3, 0x8

    invoke-virtual {v7, v3}, Llo/s;->i(I)I

    move-result v3

    const/16 v13, 0xff

    if-ne v3, v13, :cond_26

    const/16 v13, 0x10

    invoke-virtual {v7, v13}, Llo/s;->i(I)I

    move-result v3

    invoke-virtual {v7, v13}, Llo/s;->i(I)I

    move-result v10

    if-eqz v3, :cond_25

    if-eqz v10, :cond_25

    int-to-float v3, v3

    int-to-float v10, v10

    div-float v10, v3, v10

    goto :goto_1c

    :cond_25
    const/high16 v10, 0x3f800000    # 1.0f

    :goto_1c
    move-object/from16 v39, v6

    goto :goto_1e

    :cond_26
    sget-object v10, Llo/a;->d:[F

    const/16 v13, 0x11

    if-ge v3, v13, :cond_27

    aget v10, v10, v3

    goto :goto_1c

    :cond_27
    const/16 v10, 0x2e

    const-string v13, "Unexpected aspect_ratio_idc value: "

    move-object/from16 v39, v6

    const-string v6, "H265Reader"

    invoke-static {v10, v3, v13, v6}, Lq63/c;->t(IILjava/lang/String;Ljava/lang/String;)V

    goto :goto_1d

    :cond_28
    move-object/from16 v39, v6

    :goto_1d
    const/high16 v10, 0x3f800000    # 1.0f

    :goto_1e
    invoke-virtual {v7}, Llo/s;->h()Z

    move-result v3

    if-eqz v3, :cond_29

    invoke-virtual {v7}, Llo/s;->s()V

    :cond_29
    invoke-virtual {v7}, Llo/s;->h()Z

    move-result v3

    if-eqz v3, :cond_2a

    move/from16 v3, v16

    invoke-virtual {v7, v3}, Llo/s;->t(I)V

    invoke-virtual {v7}, Llo/s;->h()Z

    move-result v3

    if-eqz v3, :cond_2a

    const/16 v3, 0x18

    invoke-virtual {v7, v3}, Llo/s;->t(I)V

    :cond_2a
    invoke-virtual {v7}, Llo/s;->h()Z

    move-result v3

    if-eqz v3, :cond_2b

    invoke-virtual {v7}, Llo/s;->m()I

    invoke-virtual {v7}, Llo/s;->m()I

    :cond_2b
    invoke-virtual {v7}, Llo/s;->s()V

    invoke-virtual {v7}, Llo/s;->h()Z

    move-result v3

    if-eqz v3, :cond_2c

    mul-int/lit8 v41, v41, 0x2

    :cond_2c
    move-object/from16 v36, v38

    move/from16 v3, v41

    move/from16 v37, v46

    goto :goto_1f

    :cond_2d
    move-object/from16 v39, v6

    move-object/from16 v36, v38

    move/from16 v3, v41

    move/from16 v37, v46

    const/high16 v10, 0x3f800000    # 1.0f

    :goto_1f
    invoke-static/range {v32 .. v37}, Llo/a;->d(IZII[II)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lrm/b0;

    invoke-direct {v7}, Lrm/b0;-><init>()V

    iput-object v9, v7, Lrm/b0;->a:Ljava/lang/String;

    const-string v9, "video/hevc"

    iput-object v9, v7, Lrm/b0;->k:Ljava/lang/String;

    iput-object v6, v7, Lrm/b0;->h:Ljava/lang/String;

    iput v14, v7, Lrm/b0;->p:I

    iput v3, v7, Lrm/b0;->q:I

    iput v10, v7, Lrm/b0;->t:F

    invoke-static/range {v31 .. v31}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v7, Lrm/b0;->m:Ljava/util/List;

    new-instance v3, Lrm/c0;

    invoke-direct {v3, v7}, Lrm/c0;-><init>(Lrm/b0;)V

    invoke-interface {v8, v3}, Lwm/s;->a(Lrm/c0;)V

    const/4 v10, 0x1

    iput-boolean v10, v0, Lab/t;->c:Z

    goto :goto_20

    :cond_2e
    move-object/from16 v30, v3

    move-object/from16 v39, v6

    move-object/from16 v21, v7

    move-wide/from16 v28, v13

    :goto_20
    invoke-virtual {v2, v15}, Lab/y;->b(I)Z

    move-result v3

    if-eqz v3, :cond_2f

    iget-object v3, v2, Lab/y;->e:Ljava/lang/Object;

    check-cast v3, [B

    iget v6, v2, Lab/y;->f:I

    invoke-static {v6, v3}, Llo/a;->E(I[B)I

    move-result v3

    iget-object v6, v2, Lab/y;->e:Ljava/lang/Object;

    check-cast v6, [B

    invoke-virtual {v1, v3, v6}, Led3/a;->I(I[B)V

    const/4 v14, 0x5

    invoke-virtual {v1, v14}, Led3/a;->L(I)V

    move-object/from16 v7, v21

    invoke-static {v11, v12, v1, v7}, Ls4/d;->b(JLed3/a;[Lwm/s;)V

    :goto_21
    move-object/from16 v3, v30

    goto :goto_22

    :cond_2f
    move-object/from16 v7, v21

    goto :goto_21

    :goto_22
    invoke-virtual {v3, v15}, Lab/y;->b(I)Z

    move-result v6

    if-eqz v6, :cond_30

    iget-object v6, v3, Lab/y;->e:Ljava/lang/Object;

    check-cast v6, [B

    iget v8, v3, Lab/y;->f:I

    invoke-static {v8, v6}, Llo/a;->E(I[B)I

    move-result v6

    iget-object v8, v3, Lab/y;->e:Ljava/lang/Object;

    check-cast v8, [B

    invoke-virtual {v1, v6, v8}, Led3/a;->I(I[B)V

    const/4 v14, 0x5

    invoke-virtual {v1, v14}, Led3/a;->L(I)V

    invoke-static {v11, v12, v1, v7}, Ls4/d;->b(JLed3/a;[Lwm/s;)V

    :cond_30
    iget-wide v6, v0, Lab/t;->f:J

    iget-object v1, v0, Lab/t;->i:Ljava/lang/Object;

    check-cast v1, Lab/s;

    iget-boolean v8, v0, Lab/t;->c:Z

    const/4 v9, 0x0

    iput-boolean v9, v1, Lab/s;->f:Z

    iput-boolean v9, v1, Lab/s;->g:Z

    iput-wide v6, v1, Lab/s;->d:J

    iput v9, v1, Lab/s;->c:I

    move-wide/from16 v13, v28

    iput-wide v13, v1, Lab/s;->a:J

    move/from16 v6, v23

    const/16 v7, 0x20

    if-lt v6, v7, :cond_31

    const/16 v7, 0x28

    if-ne v6, v7, :cond_32

    :cond_31
    const/4 v8, 0x0

    goto :goto_27

    :cond_32
    iget-boolean v7, v1, Lab/s;->h:Z

    if-eqz v7, :cond_35

    iget-boolean v7, v1, Lab/s;->i:Z

    if-nez v7, :cond_35

    if-eqz v8, :cond_34

    iget-wide v7, v1, Lab/s;->k:J

    cmp-long v9, v7, v18

    if-nez v9, :cond_33

    goto :goto_23

    :cond_33
    iget-boolean v9, v1, Lab/s;->l:Z

    iget-wide v11, v1, Lab/s;->j:J

    sub-long/2addr v13, v11

    long-to-int v11, v13

    iget-object v12, v1, Lab/s;->m:Ljava/lang/Object;

    move-object v15, v12

    check-cast v15, Lwm/s;

    const/16 v21, 0x0

    move-wide/from16 v16, v7

    move/from16 v18, v9

    move/from16 v19, v11

    invoke-interface/range {v15 .. v21}, Lwm/s;->d(JIIILwm/r;)V

    :cond_34
    :goto_23
    const/4 v8, 0x0

    iput-boolean v8, v1, Lab/s;->h:Z

    :goto_24
    const/16 v7, 0x20

    goto :goto_25

    :cond_35
    const/4 v8, 0x0

    goto :goto_24

    :goto_25
    if-gt v7, v6, :cond_36

    const/16 v7, 0x23

    if-le v6, v7, :cond_37

    :cond_36
    const/16 v7, 0x27

    if-ne v6, v7, :cond_38

    :cond_37
    iget-boolean v7, v1, Lab/s;->i:Z

    const/4 v10, 0x1

    xor-int/2addr v7, v10

    iput-boolean v7, v1, Lab/s;->g:Z

    iput-boolean v10, v1, Lab/s;->i:Z

    :goto_26
    const/16 v13, 0x10

    goto :goto_28

    :cond_38
    :goto_27
    const/4 v10, 0x1

    goto :goto_26

    :goto_28
    if-lt v6, v13, :cond_39

    const/16 v7, 0x15

    if-gt v6, v7, :cond_39

    move v7, v10

    goto :goto_29

    :cond_39
    move v7, v8

    :goto_29
    iput-boolean v7, v1, Lab/s;->b:Z

    if-nez v7, :cond_3b

    const/16 v7, 0x9

    if-gt v6, v7, :cond_3a

    goto :goto_2a

    :cond_3a
    move v13, v8

    goto :goto_2b

    :cond_3b
    :goto_2a
    move v13, v10

    :goto_2b
    iput-boolean v13, v1, Lab/s;->e:Z

    iget-boolean v1, v0, Lab/t;->c:Z

    if-nez v1, :cond_3c

    invoke-virtual {v4, v6}, Lab/y;->e(I)V

    invoke-virtual {v5, v6}, Lab/y;->e(I)V

    move-object/from16 v1, v39

    invoke-virtual {v1, v6}, Lab/y;->e(I)V

    goto :goto_2c

    :cond_3c
    move-object/from16 v1, v39

    :goto_2c
    invoke-virtual {v2, v6}, Lab/y;->e(I)V

    invoke-virtual {v3, v6}, Lab/y;->e(I)V

    move-object v6, v1

    move/from16 v7, v22

    move/from16 v8, v24

    move-object/from16 v9, v25

    move-object/from16 v1, p1

    goto/16 :goto_1

    :cond_3d
    move-object/from16 v1, p1

    goto/16 :goto_0

    :cond_3e
    return-void
.end method

.method public g(Lwm/k;Lab/l0;)V
    .locals 2

    invoke-virtual {p2}, Lab/l0;->c()V

    invoke-virtual {p2}, Lab/l0;->h()V

    iget-object v0, p2, Lab/l0;->f:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lab/t;->b:Ljava/lang/String;

    invoke-virtual {p2}, Lab/l0;->h()V

    iget v0, p2, Lab/l0;->e:I

    const/4 v1, 0x2

    invoke-interface {p1, v0, v1}, Lwm/k;->o(II)Lwm/s;

    move-result-object v0

    iput-object v0, p0, Lab/t;->h:Ljava/lang/Object;

    new-instance v1, Lab/s;

    invoke-direct {v1, v0}, Lab/s;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lab/t;->i:Ljava/lang/Object;

    iget-object v0, p0, Lab/t;->g:Ljava/lang/Object;

    check-cast v0, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v0, p1, p2}, Lio/sentry/internal/debugmeta/c;->o(Lwm/k;Lab/l0;)V

    return-void
.end method

.method public h()V
    .locals 0

    return-void
.end method

.method public i(Lt9/q;Lab/l0;)V
    .locals 2

    invoke-virtual {p2}, Lab/l0;->c()V

    invoke-virtual {p2}, Lab/l0;->h()V

    iget-object v0, p2, Lab/l0;->f:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lab/t;->b:Ljava/lang/String;

    invoke-virtual {p2}, Lab/l0;->h()V

    iget v0, p2, Lab/l0;->e:I

    const/4 v1, 0x2

    invoke-interface {p1, v0, v1}, Lt9/q;->o(II)Lt9/k0;

    move-result-object v0

    iput-object v0, p0, Lab/t;->h:Ljava/lang/Object;

    new-instance v1, Lab/s;

    invoke-direct {v1, v0}, Lab/s;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lab/t;->i:Ljava/lang/Object;

    iget-object v0, p0, Lab/t;->g:Ljava/lang/Object;

    check-cast v0, La33/d;

    invoke-virtual {v0, p1, p2}, La33/d;->h(Lt9/q;Lab/l0;)V

    return-void
.end method

.method public final j([BII)V
    .locals 3

    iget v0, p0, Lab/t;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lab/t;->i:Ljava/lang/Object;

    check-cast v0, Lab/s;

    iget-boolean v1, v0, Lab/s;->e:Z

    if-eqz v1, :cond_2

    add-int/lit8 v1, p2, 0x2

    iget v2, v0, Lab/s;->c:I

    sub-int/2addr v1, v2

    if-ge v1, p3, :cond_1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0x80

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    iput-boolean v1, v0, Lab/s;->f:Z

    iput-boolean v2, v0, Lab/s;->e:Z

    goto :goto_1

    :cond_1
    sub-int v1, p3, p2

    add-int/2addr v1, v2

    iput v1, v0, Lab/s;->c:I

    :cond_2
    :goto_1
    iget-boolean v0, p0, Lab/t;->c:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lab/t;->j:Ljava/lang/Object;

    check-cast v0, Lab/y;

    invoke-virtual {v0, p1, p2, p3}, Lab/y;->a([BII)V

    iget-object v0, p0, Lab/t;->k:Ljava/lang/Object;

    check-cast v0, Lab/y;

    invoke-virtual {v0, p1, p2, p3}, Lab/y;->a([BII)V

    iget-object v0, p0, Lab/t;->l:Ljava/lang/Object;

    check-cast v0, Lab/y;

    invoke-virtual {v0, p1, p2, p3}, Lab/y;->a([BII)V

    :cond_3
    iget-object v0, p0, Lab/t;->m:Ljava/lang/Object;

    check-cast v0, Lab/y;

    invoke-virtual {v0, p1, p2, p3}, Lab/y;->a([BII)V

    iget-object v0, p0, Lab/t;->n:Ljava/lang/Object;

    check-cast v0, Lab/y;

    invoke-virtual {v0, p1, p2, p3}, Lab/y;->a([BII)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lab/t;->i:Ljava/lang/Object;

    check-cast v0, Lab/s;

    iget-boolean v1, v0, Lab/s;->e:Z

    if-eqz v1, :cond_6

    add-int/lit8 v1, p2, 0x2

    iget v2, v0, Lab/s;->c:I

    sub-int/2addr v1, v2

    if-ge v1, p3, :cond_5

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0x80

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    const/4 v1, 0x1

    goto :goto_2

    :cond_4
    move v1, v2

    :goto_2
    iput-boolean v1, v0, Lab/s;->f:Z

    iput-boolean v2, v0, Lab/s;->e:Z

    goto :goto_3

    :cond_5
    sub-int v1, p3, p2

    add-int/2addr v1, v2

    iput v1, v0, Lab/s;->c:I

    :cond_6
    :goto_3
    iget-boolean v0, p0, Lab/t;->c:Z

    if-nez v0, :cond_7

    iget-object v0, p0, Lab/t;->j:Ljava/lang/Object;

    check-cast v0, Lab/y;

    invoke-virtual {v0, p1, p2, p3}, Lab/y;->a([BII)V

    iget-object v0, p0, Lab/t;->k:Ljava/lang/Object;

    check-cast v0, Lab/y;

    invoke-virtual {v0, p1, p2, p3}, Lab/y;->a([BII)V

    iget-object v0, p0, Lab/t;->l:Ljava/lang/Object;

    check-cast v0, Lab/y;

    invoke-virtual {v0, p1, p2, p3}, Lab/y;->a([BII)V

    :cond_7
    iget-object v0, p0, Lab/t;->m:Ljava/lang/Object;

    check-cast v0, Lab/y;

    invoke-virtual {v0, p1, p2, p3}, Lab/y;->a([BII)V

    iget-object v0, p0, Lab/t;->n:Ljava/lang/Object;

    check-cast v0, Lab/y;

    invoke-virtual {v0, p1, p2, p3}, Lab/y;->a([BII)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public k(IIJJ)V
    .locals 3

    iget-object v0, p0, Lab/t;->i:Ljava/lang/Object;

    check-cast v0, Lab/s;

    iget-boolean v1, p0, Lab/t;->c:Z

    const/4 v2, 0x0

    iput-boolean v2, v0, Lab/s;->f:Z

    iput-boolean v2, v0, Lab/s;->g:Z

    iput-wide p5, v0, Lab/s;->d:J

    iput v2, v0, Lab/s;->c:I

    iput-wide p3, v0, Lab/s;->a:J

    const/4 p3, 0x1

    const/16 p4, 0x20

    if-lt p2, p4, :cond_5

    const/16 p5, 0x28

    if-ne p2, p5, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean p5, v0, Lab/s;->h:Z

    if-eqz p5, :cond_2

    iget-boolean p5, v0, Lab/s;->i:Z

    if-nez p5, :cond_2

    if-eqz v1, :cond_1

    invoke-virtual {v0, p1}, Lab/s;->a(I)V

    :cond_1
    iput-boolean v2, v0, Lab/s;->h:Z

    :cond_2
    if-gt p4, p2, :cond_3

    const/16 p1, 0x23

    if-le p2, p1, :cond_4

    :cond_3
    const/16 p1, 0x27

    if-ne p2, p1, :cond_5

    :cond_4
    iget-boolean p1, v0, Lab/s;->i:Z

    xor-int/2addr p1, p3

    iput-boolean p1, v0, Lab/s;->g:Z

    iput-boolean p3, v0, Lab/s;->i:Z

    :cond_5
    :goto_0
    const/16 p1, 0x10

    if-lt p2, p1, :cond_6

    const/16 p1, 0x15

    if-gt p2, p1, :cond_6

    move p1, p3

    goto :goto_1

    :cond_6
    move p1, v2

    :goto_1
    iput-boolean p1, v0, Lab/s;->b:Z

    if-nez p1, :cond_7

    const/16 p1, 0x9

    if-gt p2, p1, :cond_8

    :cond_7
    move v2, p3

    :cond_8
    iput-boolean v2, v0, Lab/s;->e:Z

    iget-boolean p1, p0, Lab/t;->c:Z

    if-nez p1, :cond_9

    iget-object p1, p0, Lab/t;->j:Ljava/lang/Object;

    check-cast p1, Lab/y;

    invoke-virtual {p1, p2}, Lab/y;->e(I)V

    iget-object p1, p0, Lab/t;->k:Ljava/lang/Object;

    check-cast p1, Lab/y;

    invoke-virtual {p1, p2}, Lab/y;->e(I)V

    iget-object p1, p0, Lab/t;->l:Ljava/lang/Object;

    check-cast p1, Lab/y;

    invoke-virtual {p1, p2}, Lab/y;->e(I)V

    :cond_9
    iget-object p1, p0, Lab/t;->m:Ljava/lang/Object;

    check-cast p1, Lab/y;

    invoke-virtual {p1, p2}, Lab/y;->e(I)V

    iget-object p1, p0, Lab/t;->n:Ljava/lang/Object;

    check-cast p1, Lab/y;

    invoke-virtual {p1, p2}, Lab/y;->e(I)V

    return-void
.end method
