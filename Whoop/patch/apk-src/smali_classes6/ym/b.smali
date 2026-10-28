.class public final Lym/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwm/i;


# instance fields
.field public final a:[B

.field public final b:Led3/a;

.field public final c:Z

.field public final d:Lt9/s;

.field public e:Lwm/k;

.field public f:Lwm/s;

.field public g:I

.field public h:Lin/c;

.field public i:Lt9/v;

.field public j:I

.field public k:I

.field public l:Lfn/q;

.field public m:I

.field public n:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x2a

    new-array v0, v0, [B

    iput-object v0, p0, Lym/b;->a:[B

    new-instance v0, Led3/a;

    const v1, 0x8000

    new-array v1, v1, [B

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4, v2, v3}, Led3/a;-><init>([BIIZ)V

    iput-object v0, p0, Lym/b;->b:Led3/a;

    iput-boolean v4, p0, Lym/b;->c:Z

    new-instance v0, Lt9/s;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lym/b;->d:Lt9/s;

    iput v4, p0, Lym/b;->g:I

    return-void
.end method


# virtual methods
.method public final b(JJ)V
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    const/4 p2, 0x0

    if-nez p1, :cond_0

    iput p2, p0, Lym/b;->g:I

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lym/b;->l:Lfn/q;

    if-eqz p1, :cond_1

    invoke-virtual {p1, p3, p4}, Lt9/h;->e(J)V

    :cond_1
    :goto_0
    cmp-long p1, p3, v0

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    const-wide/16 v0, -0x1

    :goto_1
    iput-wide v0, p0, Lym/b;->n:J

    iput p2, p0, Lym/b;->m:I

    iget-object p1, p0, Lym/b;->b:Led3/a;

    invoke-virtual {p1, p2}, Led3/a;->H(I)V

    return-void
.end method

.method public final g(Lwm/j;)Z
    .locals 9

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ls4/l;->r(Lwm/j;Z)Lin/c;

    const/4 v1, 0x4

    new-array v2, v1, [B

    check-cast p1, Lwm/f;

    invoke-virtual {p1, v2, v0, v1, v0}, Lwm/f;->c([BIIZ)Z

    aget-byte p1, v2, v0

    int-to-long v3, p1

    const-wide/16 v5, 0xff

    and-long/2addr v3, v5

    const/16 p1, 0x18

    shl-long/2addr v3, p1

    const/4 p1, 0x1

    aget-byte v1, v2, p1

    int-to-long v7, v1

    and-long/2addr v7, v5

    const/16 v1, 0x10

    shl-long/2addr v7, v1

    or-long/2addr v3, v7

    const/4 v1, 0x2

    aget-byte v1, v2, v1

    int-to-long v7, v1

    and-long/2addr v7, v5

    const/16 v1, 0x8

    shl-long/2addr v7, v1

    or-long/2addr v3, v7

    const/4 v1, 0x3

    aget-byte v1, v2, v1

    int-to-long v1, v1

    and-long/2addr v1, v5

    or-long/2addr v1, v3

    const-wide/32 v3, 0x664c6143

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    return p1

    :cond_0
    return v0
.end method

.method public final h(Lwm/k;)V
    .locals 2

    iput-object p1, p0, Lym/b;->e:Lwm/k;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lwm/k;->o(II)Lwm/s;

    move-result-object v0

    iput-object v0, p0, Lym/b;->f:Lwm/s;

    invoke-interface {p1}, Lwm/k;->l()V

    return-void
.end method

.method public final i(Lwm/j;Lt9/s;)I
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lym/b;->g:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2b

    iget-object v5, v0, Lym/b;->a:[B

    const/4 v6, 0x2

    if-eq v2, v3, :cond_2a

    const/16 v7, 0x18

    const/16 v8, 0x8

    const/16 v9, 0x10

    const/4 v10, 0x0

    const/4 v11, 0x4

    const/4 v12, 0x3

    if-eq v2, v6, :cond_28

    const/4 v13, 0x7

    if-eq v2, v12, :cond_1c

    const-wide/16 v15, 0x0

    const-wide/16 v17, -0x1

    const/4 v5, 0x5

    if-eq v2, v11, :cond_16

    if-ne v2, v5, :cond_15

    iget-object v2, v0, Lym/b;->f:Lwm/s;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v0, Lym/b;->i:Lt9/v;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v0, Lym/b;->l:Lfn/q;

    if-eqz v2, :cond_0

    iget-object v5, v2, Lt9/h;->e:Ljava/lang/Object;

    check-cast v5, Lt9/d;

    if-eqz v5, :cond_0

    move-object/from16 v5, p2

    invoke-virtual {v2, v1, v5}, Lt9/h;->b(Lwm/j;Lt9/s;)I

    move-result v1

    return v1

    :cond_0
    iget-wide v7, v0, Lym/b;->n:J

    cmp-long v2, v7, v17

    const/4 v5, -0x1

    if-nez v2, :cond_7

    iget-object v2, v0, Lym/b;->i:Lt9/v;

    move-object v7, v1

    check-cast v7, Lwm/f;

    iput v4, v7, Lwm/f;->F:I

    check-cast v1, Lwm/f;

    invoke-virtual {v1, v3, v4}, Lwm/f;->a(IZ)Z

    new-array v7, v3, [B

    invoke-virtual {v1, v7, v4, v3, v4}, Lwm/f;->c([BIIZ)Z

    aget-byte v7, v7, v4

    and-int/2addr v7, v3

    if-ne v7, v3, :cond_1

    move v7, v3

    goto :goto_0

    :cond_1
    move v7, v4

    :goto_0
    invoke-virtual {v1, v6, v4}, Lwm/f;->a(IZ)Z

    if-eqz v7, :cond_2

    goto :goto_1

    :cond_2
    const/4 v13, 0x6

    :goto_1
    new-instance v6, Led3/a;

    invoke-direct {v6, v13}, Led3/a;-><init>(I)V

    iget-object v8, v6, Led3/a;->a:[B

    move v9, v4

    :goto_2
    if-ge v9, v13, :cond_4

    sub-int v11, v13, v9

    invoke-virtual {v1, v8, v9, v11}, Lwm/f;->m([BII)I

    move-result v11

    if-ne v11, v5, :cond_3

    goto :goto_3

    :cond_3
    add-int/2addr v9, v11

    goto :goto_2

    :cond_4
    :goto_3
    invoke-virtual {v6, v9}, Led3/a;->J(I)V

    iput v4, v1, Lwm/f;->F:I

    :try_start_0
    invoke-virtual {v6}, Led3/a;->E()J

    move-result-wide v5
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v7, :cond_5

    :goto_4
    move-wide v15, v5

    goto :goto_5

    :cond_5
    iget v1, v2, Lt9/v;->c:I

    int-to-long v1, v1

    mul-long/2addr v5, v1

    goto :goto_4

    :goto_5
    move-wide v1, v15

    goto :goto_6

    :catch_0
    move v3, v4

    goto :goto_5

    :goto_6
    if-eqz v3, :cond_6

    iput-wide v1, v0, Lym/b;->n:J

    goto/16 :goto_e

    :cond_6
    invoke-static {v10, v10}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object v1

    throw v1

    :cond_7
    iget-object v2, v0, Lym/b;->b:Led3/a;

    iget v6, v2, Led3/a;->c:I

    const-wide/32 v7, 0xf4240

    const v10, 0x8000

    if-ge v6, v10, :cond_a

    iget-object v11, v2, Led3/a;->a:[B

    sub-int/2addr v10, v6

    check-cast v1, Lwm/f;

    invoke-virtual {v1, v11, v6, v10}, Lwm/f;->read([BII)I

    move-result v1

    if-ne v1, v5, :cond_8

    goto :goto_7

    :cond_8
    move v3, v4

    :goto_7
    if-nez v3, :cond_9

    add-int/2addr v6, v1

    invoke-virtual {v2, v6}, Led3/a;->J(I)V

    goto :goto_8

    :cond_9
    invoke-virtual {v2}, Led3/a;->a()I

    move-result v1

    if-nez v1, :cond_b

    iget-wide v1, v0, Lym/b;->n:J

    mul-long/2addr v1, v7

    iget-object v3, v0, Lym/b;->i:Lt9/v;

    sget v4, Llo/y;->a:I

    iget v3, v3, Lt9/v;->f:I

    int-to-long v3, v3

    div-long v7, v1, v3

    iget-object v6, v0, Lym/b;->f:Lwm/s;

    iget v10, v0, Lym/b;->m:I

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v9, 0x1

    invoke-interface/range {v6 .. v12}, Lwm/s;->d(JIIILwm/r;)V

    return v5

    :cond_a
    move v3, v4

    :cond_b
    :goto_8
    iget v1, v2, Led3/a;->b:I

    iget v5, v0, Lym/b;->m:I

    iget v6, v0, Lym/b;->j:I

    if-ge v5, v6, :cond_c

    sub-int/2addr v6, v5

    invoke-virtual {v2}, Led3/a;->a()I

    move-result v5

    invoke-static {v6, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    invoke-virtual {v2, v5}, Led3/a;->L(I)V

    :cond_c
    iget-object v5, v0, Lym/b;->i:Lt9/v;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v5, v2, Led3/a;->b:I

    :goto_9
    iget v6, v2, Led3/a;->c:I

    sub-int/2addr v6, v9

    iget-object v10, v0, Lym/b;->d:Lt9/s;

    if-gt v5, v6, :cond_e

    invoke-virtual {v2, v5}, Led3/a;->K(I)V

    iget-object v6, v0, Lym/b;->i:Lt9/v;

    iget v11, v0, Lym/b;->k:I

    invoke-static {v2, v6, v11, v10}, Ls4/i;->f(Led3/a;Lt9/v;ILt9/s;)Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-virtual {v2, v5}, Led3/a;->K(I)V

    iget-wide v5, v10, Lt9/s;->a:J

    goto :goto_d

    :cond_d
    add-int/lit8 v5, v5, 0x1

    goto :goto_9

    :cond_e
    if-eqz v3, :cond_12

    :goto_a
    iget v3, v2, Led3/a;->c:I

    iget v6, v0, Lym/b;->j:I

    sub-int v6, v3, v6

    if-gt v5, v6, :cond_11

    invoke-virtual {v2, v5}, Led3/a;->K(I)V

    :try_start_1
    iget-object v3, v0, Lym/b;->i:Lt9/v;

    iget v6, v0, Lym/b;->k:I

    invoke-static {v2, v3, v6, v10}, Ls4/i;->f(Led3/a;Lt9/v;ILt9/s;)Z

    move-result v3
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_b

    :catch_1
    move v3, v4

    :goto_b
    iget v6, v2, Led3/a;->b:I

    iget v11, v2, Led3/a;->c:I

    if-le v6, v11, :cond_f

    move v3, v4

    :cond_f
    if-eqz v3, :cond_10

    invoke-virtual {v2, v5}, Led3/a;->K(I)V

    iget-wide v5, v10, Lt9/s;->a:J

    goto :goto_d

    :cond_10
    add-int/lit8 v5, v5, 0x1

    goto :goto_a

    :cond_11
    invoke-virtual {v2, v3}, Led3/a;->K(I)V

    goto :goto_c

    :cond_12
    invoke-virtual {v2, v5}, Led3/a;->K(I)V

    :goto_c
    move-wide/from16 v5, v17

    :goto_d
    iget v3, v2, Led3/a;->b:I

    sub-int/2addr v3, v1

    invoke-virtual {v2, v1}, Led3/a;->K(I)V

    iget-object v1, v0, Lym/b;->f:Lwm/s;

    invoke-interface {v1, v3, v2}, Lwm/s;->c(ILed3/a;)V

    iget v1, v0, Lym/b;->m:I

    add-int v14, v1, v3

    iput v14, v0, Lym/b;->m:I

    cmp-long v1, v5, v17

    if-eqz v1, :cond_13

    iget-wide v10, v0, Lym/b;->n:J

    mul-long/2addr v10, v7

    iget-object v1, v0, Lym/b;->i:Lt9/v;

    sget v3, Llo/y;->a:I

    iget v1, v1, Lt9/v;->f:I

    int-to-long v7, v1

    div-long v11, v10, v7

    iget-object v10, v0, Lym/b;->f:Lwm/s;

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/4 v13, 0x1

    invoke-interface/range {v10 .. v16}, Lwm/s;->d(JIIILwm/r;)V

    iput v4, v0, Lym/b;->m:I

    iput-wide v5, v0, Lym/b;->n:J

    :cond_13
    invoke-virtual {v2}, Led3/a;->a()I

    move-result v1

    if-ge v1, v9, :cond_14

    invoke-virtual {v2}, Led3/a;->a()I

    move-result v1

    iget-object v3, v2, Led3/a;->a:[B

    iget v5, v2, Led3/a;->b:I

    invoke-static {v3, v5, v3, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {v2, v4}, Led3/a;->K(I)V

    invoke-virtual {v2, v1}, Led3/a;->J(I)V

    :cond_14
    :goto_e
    return v4

    :cond_15
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :cond_16
    move-object v2, v1

    check-cast v2, Lwm/f;

    iput v4, v2, Lwm/f;->F:I

    new-array v2, v6, [B

    check-cast v1, Lwm/f;

    invoke-virtual {v1, v2, v4, v6, v4}, Lwm/f;->c([BIIZ)Z

    aget-byte v6, v2, v4

    and-int/lit16 v6, v6, 0xff

    shl-int/2addr v6, v8

    aget-byte v2, v2, v3

    and-int/lit16 v2, v2, 0xff

    or-int/2addr v2, v6

    shr-int/lit8 v3, v2, 0x2

    const/16 v6, 0x3ffe

    if-ne v3, v6, :cond_1b

    iput v4, v1, Lwm/f;->F:I

    iput v2, v0, Lym/b;->k:I

    iget-object v2, v0, Lym/b;->e:Lwm/k;

    sget v3, Llo/y;->a:I

    iget-wide v6, v1, Lwm/f;->z:J

    iget-wide v8, v1, Lwm/f;->y:J

    iget-object v1, v0, Lym/b;->i:Lt9/v;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v0, Lym/b;->i:Lt9/v;

    iget-object v3, v1, Lt9/v;->l:Ljava/lang/Object;

    check-cast v3, Lso/q;

    if-eqz v3, :cond_17

    new-instance v3, Lwm/l;

    invoke-direct {v3, v1, v6, v7}, Lwm/l;-><init>(Lt9/v;J)V

    move/from16 v16, v4

    goto/16 :goto_12

    :cond_17
    cmp-long v3, v8, v17

    if-eqz v3, :cond_1a

    iget-wide v10, v1, Lt9/v;->k:J

    cmp-long v3, v10, v15

    if-lez v3, :cond_1a

    new-instance v19, Lfn/q;

    iget v3, v0, Lym/b;->k:I

    iget v10, v1, Lt9/v;->d:I

    new-instance v11, Lrm/p;

    const/16 v12, 0x15

    invoke-direct {v11, v1, v12}, Lrm/p;-><init>(Ljava/lang/Object;I)V

    new-instance v12, Lym/a;

    invoke-direct {v12, v1, v3}, Lym/a;-><init>(Lt9/v;I)V

    invoke-virtual {v1}, Lt9/v;->c()J

    move-result-wide v22

    move/from16 v16, v4

    iget-wide v4, v1, Lt9/v;->k:J

    iget v3, v1, Lt9/v;->e:I

    if-lez v3, :cond_18

    int-to-long v14, v3

    move-wide/from16 v24, v4

    int-to-long v3, v10

    add-long/2addr v14, v3

    const-wide/16 v3, 0x2

    div-long/2addr v14, v3

    const-wide/16 v3, 0x1

    add-long/2addr v14, v3

    :goto_f
    move-wide/from16 v30, v14

    const/4 v1, 0x6

    goto :goto_11

    :cond_18
    move-wide/from16 v24, v4

    iget v3, v1, Lt9/v;->b:I

    iget v4, v1, Lt9/v;->c:I

    if-ne v3, v4, :cond_19

    if-lez v3, :cond_19

    int-to-long v3, v3

    goto :goto_10

    :cond_19
    const-wide/16 v3, 0x1000

    :goto_10
    iget v5, v1, Lt9/v;->h:I

    int-to-long v13, v5

    mul-long/2addr v3, v13

    iget v1, v1, Lt9/v;->i:I

    int-to-long v13, v1

    mul-long/2addr v3, v13

    const-wide/16 v13, 0x8

    div-long/2addr v3, v13

    const-wide/16 v13, 0x40

    add-long v14, v3, v13

    goto :goto_f

    :goto_11
    invoke-static {v1, v10}, Ljava/lang/Math;->max(II)I

    move-result v32

    move-wide/from16 v26, v6

    move-wide/from16 v28, v8

    move-object/from16 v20, v11

    move-object/from16 v21, v12

    invoke-direct/range {v19 .. v32}, Lt9/h;-><init>(Lwm/b;Lwm/d;JJJJJI)V

    move-object/from16 v1, v19

    iput-object v1, v0, Lym/b;->l:Lfn/q;

    iget-object v1, v1, Lt9/h;->c:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lwm/a;

    goto :goto_12

    :cond_1a
    move/from16 v16, v4

    new-instance v3, Lwm/l;

    invoke-virtual {v1}, Lt9/v;->c()J

    move-result-wide v4

    invoke-direct {v3, v4, v5}, Lwm/l;-><init>(J)V

    :goto_12
    invoke-interface {v2, v3}, Lwm/k;->x(Lwm/p;)V

    const/4 v15, 0x5

    iput v15, v0, Lym/b;->g:I

    return v16

    :cond_1b
    move v2, v4

    iput v2, v1, Lwm/f;->F:I

    const-string v1, "First frame does not start with sync code."

    invoke-static {v10, v1}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object v1

    throw v1

    :cond_1c
    move v2, v4

    iget-object v4, v0, Lym/b;->i:Lt9/v;

    move/from16 v16, v2

    :goto_13
    if-nez v16, :cond_27

    move-object v6, v1

    check-cast v6, Lwm/f;

    iput v2, v6, Lwm/f;->F:I

    new-instance v6, Llo/s;

    new-array v8, v11, [B

    invoke-direct {v6, v8, v11, v2, v2}, Llo/s;-><init>([BIIB)V

    move-object v9, v1

    check-cast v9, Lwm/f;

    invoke-virtual {v9, v8, v2, v11, v2}, Lwm/f;->c([BIIZ)Z

    invoke-virtual {v6}, Llo/s;->h()Z

    move-result v8

    invoke-virtual {v6, v13}, Llo/s;->i(I)I

    move-result v10

    invoke-virtual {v6, v7}, Llo/s;->i(I)I

    move-result v6

    add-int/2addr v6, v11

    if-nez v10, :cond_1d

    const/16 v4, 0x26

    new-array v6, v4, [B

    invoke-virtual {v9, v6, v2, v4, v2}, Lwm/f;->f([BIIZ)Z

    new-instance v4, Lt9/v;

    invoke-direct {v4, v6, v11, v3}, Lt9/v;-><init>([BII)V

    move/from16 v30, v7

    move v15, v12

    goto/16 :goto_19

    :cond_1d
    if-eqz v4, :cond_26

    iget-object v14, v4, Lt9/v;->m:Ljava/lang/Object;

    check-cast v14, Lin/c;

    if-ne v10, v12, :cond_1e

    new-instance v10, Led3/a;

    invoke-direct {v10, v6}, Led3/a;-><init>(I)V

    iget-object v14, v10, Led3/a;->a:[B

    invoke-virtual {v9, v14, v2, v6, v2}, Lwm/f;->f([BIIZ)Z

    invoke-static {v10}, Ls4/l;->s(Led3/a;)Lso/q;

    move-result-object v28

    new-instance v18, Lt9/v;

    iget v2, v4, Lt9/v;->b:I

    iget v6, v4, Lt9/v;->c:I

    iget v9, v4, Lt9/v;->d:I

    iget v10, v4, Lt9/v;->e:I

    iget v14, v4, Lt9/v;->f:I

    iget v15, v4, Lt9/v;->h:I

    move/from16 v30, v7

    iget v7, v4, Lt9/v;->i:I

    move/from16 v23, v14

    iget-wide v13, v4, Lt9/v;->k:J

    iget-object v4, v4, Lt9/v;->m:Ljava/lang/Object;

    move-object/from16 v29, v4

    check-cast v29, Lin/c;

    move/from16 v19, v2

    move/from16 v20, v6

    move/from16 v25, v7

    move/from16 v21, v9

    move/from16 v22, v10

    move-wide/from16 v26, v13

    move/from16 v24, v15

    invoke-direct/range {v18 .. v29}, Lt9/v;-><init>(IIIIIIIJLso/q;Lin/c;)V

    move v15, v12

    :goto_14
    move-object/from16 v4, v18

    goto/16 :goto_19

    :cond_1e
    move/from16 v30, v7

    if-ne v10, v11, :cond_22

    new-instance v2, Led3/a;

    invoke-direct {v2, v6}, Led3/a;-><init>(I)V

    iget-object v7, v2, Led3/a;->a:[B

    const/4 v10, 0x0

    invoke-virtual {v9, v7, v10, v6, v10}, Lwm/f;->f([BIIZ)Z

    invoke-virtual {v2, v11}, Led3/a;->L(I)V

    invoke-static {v2, v10, v10}, Ls40/e0;->h(Led3/a;ZZ)Lt9/m0;

    move-result-object v2

    iget-object v2, v2, Lt9/m0;->a:[Ljava/lang/String;

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Ls40/e0;->f(Ljava/util/List;)Lin/c;

    move-result-object v2

    if-nez v14, :cond_1f

    move-object/from16 v29, v2

    goto :goto_16

    :cond_1f
    if-nez v2, :cond_20

    goto :goto_15

    :cond_20
    iget-object v2, v2, Lin/c;->w:[Lin/b;

    array-length v6, v2

    if-nez v6, :cond_21

    :goto_15
    move-object/from16 v29, v14

    goto :goto_16

    :cond_21
    new-instance v6, Lin/c;

    iget-object v7, v14, Lin/c;->w:[Lin/b;

    sget v9, Llo/y;->a:I

    array-length v9, v7

    array-length v10, v2

    add-int/2addr v9, v10

    invoke-static {v7, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v9

    array-length v7, v7

    array-length v10, v2

    const/4 v13, 0x0

    invoke-static {v2, v13, v9, v7, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    check-cast v9, [Lin/b;

    invoke-direct {v6, v9}, Lin/c;-><init>([Lin/b;)V

    move-object/from16 v29, v6

    :goto_16
    new-instance v18, Lt9/v;

    iget v2, v4, Lt9/v;->b:I

    iget v6, v4, Lt9/v;->c:I

    iget v7, v4, Lt9/v;->d:I

    iget v9, v4, Lt9/v;->e:I

    iget v10, v4, Lt9/v;->f:I

    iget v13, v4, Lt9/v;->h:I

    iget v14, v4, Lt9/v;->i:I

    move v15, v12

    move/from16 v24, v13

    iget-wide v12, v4, Lt9/v;->k:J

    iget-object v4, v4, Lt9/v;->l:Ljava/lang/Object;

    move-object/from16 v28, v4

    check-cast v28, Lso/q;

    move/from16 v19, v2

    move/from16 v20, v6

    move/from16 v21, v7

    move/from16 v22, v9

    move/from16 v23, v10

    move-wide/from16 v26, v12

    move/from16 v25, v14

    invoke-direct/range {v18 .. v29}, Lt9/v;-><init>(IIIIIIIJLso/q;Lin/c;)V

    goto :goto_14

    :cond_22
    move v15, v12

    const/4 v2, 0x6

    if-ne v10, v2, :cond_25

    new-instance v2, Led3/a;

    invoke-direct {v2, v6}, Led3/a;-><init>(I)V

    iget-object v7, v2, Led3/a;->a:[B

    const/4 v13, 0x0

    invoke-virtual {v9, v7, v13, v6, v13}, Lwm/f;->f([BIIZ)Z

    invoke-virtual {v2, v11}, Led3/a;->L(I)V

    invoke-static {v2}, Lln/a;->b(Led3/a;)Lln/a;

    move-result-object v2

    invoke-static {v2}, Lzr/g0;->r(Ljava/lang/Object;)Lzr/w0;

    move-result-object v2

    new-instance v6, Lin/c;

    invoke-direct {v6, v2}, Lin/c;-><init>(Ljava/util/List;)V

    if-nez v14, :cond_23

    :goto_17
    move-object/from16 v29, v6

    goto :goto_18

    :cond_23
    iget-object v2, v6, Lin/c;->w:[Lin/b;

    array-length v6, v2

    if-nez v6, :cond_24

    move-object/from16 v29, v14

    goto :goto_18

    :cond_24
    new-instance v6, Lin/c;

    iget-object v7, v14, Lin/c;->w:[Lin/b;

    sget v9, Llo/y;->a:I

    array-length v9, v7

    array-length v10, v2

    add-int/2addr v9, v10

    invoke-static {v7, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v9

    array-length v7, v7

    array-length v10, v2

    const/4 v13, 0x0

    invoke-static {v2, v13, v9, v7, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    check-cast v9, [Lin/b;

    invoke-direct {v6, v9}, Lin/c;-><init>([Lin/b;)V

    goto :goto_17

    :goto_18
    new-instance v18, Lt9/v;

    iget v2, v4, Lt9/v;->b:I

    iget v6, v4, Lt9/v;->c:I

    iget v7, v4, Lt9/v;->d:I

    iget v9, v4, Lt9/v;->e:I

    iget v10, v4, Lt9/v;->f:I

    iget v12, v4, Lt9/v;->h:I

    iget v13, v4, Lt9/v;->i:I

    move/from16 v24, v12

    iget-wide v11, v4, Lt9/v;->k:J

    iget-object v4, v4, Lt9/v;->l:Ljava/lang/Object;

    move-object/from16 v28, v4

    check-cast v28, Lso/q;

    move/from16 v19, v2

    move/from16 v20, v6

    move/from16 v21, v7

    move/from16 v22, v9

    move/from16 v23, v10

    move-wide/from16 v26, v11

    move/from16 v25, v13

    invoke-direct/range {v18 .. v29}, Lt9/v;-><init>(IIIIIIIJLso/q;Lin/c;)V

    goto/16 :goto_14

    :cond_25
    invoke-virtual {v9, v6}, Lwm/f;->n(I)V

    :goto_19
    sget v2, Llo/y;->a:I

    iput-object v4, v0, Lym/b;->i:Lt9/v;

    move/from16 v16, v8

    move v12, v15

    move/from16 v7, v30

    const/4 v2, 0x0

    const/4 v11, 0x4

    const/4 v13, 0x7

    goto/16 :goto_13

    :cond_26
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v1

    :cond_27
    iget-object v1, v0, Lym/b;->i:Lt9/v;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v0, Lym/b;->i:Lt9/v;

    iget v1, v1, Lt9/v;->d:I

    const/4 v2, 0x6

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v0, Lym/b;->j:I

    iget-object v1, v0, Lym/b;->f:Lwm/s;

    sget v2, Llo/y;->a:I

    iget-object v2, v0, Lym/b;->i:Lt9/v;

    iget-object v3, v0, Lym/b;->h:Lin/c;

    invoke-virtual {v2, v5, v3}, Lt9/v;->d([BLin/c;)Lrm/c0;

    move-result-object v2

    invoke-interface {v1, v2}, Lwm/s;->a(Lrm/c0;)V

    const/4 v14, 0x4

    iput v14, v0, Lym/b;->g:I

    const/4 v13, 0x0

    return v13

    :cond_28
    move v13, v4

    move/from16 v30, v7

    move v14, v11

    move v15, v12

    new-array v2, v14, [B

    check-cast v1, Lwm/f;

    invoke-virtual {v1, v2, v13, v14, v13}, Lwm/f;->f([BIIZ)Z

    aget-byte v1, v2, v13

    int-to-long v4, v1

    const-wide/16 v11, 0xff

    and-long/2addr v4, v11

    shl-long v4, v4, v30

    aget-byte v1, v2, v3

    int-to-long v13, v1

    and-long/2addr v13, v11

    shl-long/2addr v13, v9

    or-long v3, v4, v13

    aget-byte v1, v2, v6

    int-to-long v5, v1

    and-long/2addr v5, v11

    shl-long/2addr v5, v8

    or-long/2addr v3, v5

    aget-byte v1, v2, v15

    int-to-long v1, v1

    and-long/2addr v1, v11

    or-long/2addr v1, v3

    const-wide/32 v3, 0x664c6143

    cmp-long v1, v1, v3

    if-nez v1, :cond_29

    iput v15, v0, Lym/b;->g:I

    const/4 v13, 0x0

    return v13

    :cond_29
    const-string v1, "Failed to read FLAC stream marker."

    invoke-static {v10, v1}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object v1

    throw v1

    :cond_2a
    move v13, v4

    array-length v2, v5

    move-object v3, v1

    check-cast v3, Lwm/f;

    invoke-virtual {v3, v5, v13, v2, v13}, Lwm/f;->c([BIIZ)Z

    check-cast v1, Lwm/f;

    iput v13, v1, Lwm/f;->F:I

    iput v6, v0, Lym/b;->g:I

    return v13

    :cond_2b
    move v13, v4

    iget-boolean v2, v0, Lym/b;->c:Z

    xor-int/2addr v2, v3

    move-object v4, v1

    check-cast v4, Lwm/f;

    iput v13, v4, Lwm/f;->F:I

    move-object v4, v1

    check-cast v4, Lwm/f;

    invoke-virtual {v4}, Lwm/f;->g()J

    move-result-wide v5

    invoke-static {v1, v2}, Ls4/l;->r(Lwm/j;Z)Lin/c;

    move-result-object v1

    invoke-virtual {v4}, Lwm/f;->g()J

    move-result-wide v7

    sub-long/2addr v7, v5

    long-to-int v2, v7

    invoke-virtual {v4, v2}, Lwm/f;->n(I)V

    iput-object v1, v0, Lym/b;->h:Lin/c;

    iput v3, v0, Lym/b;->g:I

    return v13
.end method

.method public final release()V
    .locals 0

    return-void
.end method
