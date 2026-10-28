.class public final Lab/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lab/j;


# instance fields
.field public final a:Lx8/n;

.field public final b:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final c:Ljava/lang/String;

.field public final d:I

.field public final e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Lt9/k0;

.field public h:I

.field public i:I

.field public j:I

.field public k:J

.field public l:Lu8/p;

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:J


# direct methods
.method public constructor <init>(Ljava/lang/String;II)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lx8/n;

    new-array p3, p3, [B

    invoke-direct {v0, p3}, Lx8/n;-><init>([B)V

    iput-object v0, p0, Lab/h;->a:Lx8/n;

    const/4 p3, 0x0

    iput p3, p0, Lab/h;->h:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lab/h;->q:J

    new-instance p3, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p3, p0, Lab/h;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p3, -0x1

    iput p3, p0, Lab/h;->o:I

    iput p3, p0, Lab/h;->p:I

    iput-object p1, p0, Lab/h;->c:Ljava/lang/String;

    iput p2, p0, Lab/h;->d:I

    const-string p1, "video/mp2t"

    iput-object p1, p0, Lab/h;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Lab/h;->h:I

    iput v0, p0, Lab/h;->i:I

    iput v0, p0, Lab/h;->j:I

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, p0, Lab/h;->q:J

    iget-object v1, p0, Lab/h;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    return-void
.end method

.method public final b(Lx8/n;[BI)Z
    .locals 2

    invoke-virtual {p1}, Lx8/n;->a()I

    move-result v0

    iget v1, p0, Lab/h;->i:I

    sub-int v1, p3, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget v1, p0, Lab/h;->i:I

    invoke-virtual {p1, p2, v1, v0}, Lx8/n;->e([BII)V

    iget p1, p0, Lab/h;->i:I

    add-int/2addr p1, v0

    iput p1, p0, Lab/h;->i:I

    if-ne p1, p3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final c(Lx8/n;)V
    .locals 39

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lab/h;->g:Lt9/k0;

    invoke-static {v2}, Lva3/g;->j(Ljava/lang/Object;)V

    :cond_0
    :goto_0
    invoke-virtual {v1}, Lx8/n;->a()I

    move-result v2

    if-lez v2, :cond_3c

    iget v2, v0, Lab/h;->h:I

    const v13, 0x40411bf2

    const/4 v15, 0x5

    const/16 v6, 0x20

    const/4 v8, 0x0

    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v12, 0x2

    const/4 v3, 0x4

    const/4 v4, 0x1

    const/4 v14, 0x0

    const/16 v27, 0x8

    iget-object v10, v0, Lab/h;->a:Lx8/n;

    packed-switch v2, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :pswitch_0
    invoke-virtual {v1}, Lx8/n;->a()I

    move-result v2

    iget v5, v0, Lab/h;->m:I

    iget v6, v0, Lab/h;->i:I

    sub-int/2addr v5, v6

    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    move-result v2

    iget-object v5, v0, Lab/h;->g:Lt9/k0;

    invoke-interface {v5, v1, v2, v14}, Lt9/k0;->d(Lx8/n;II)V

    iget v5, v0, Lab/h;->i:I

    add-int/2addr v5, v2

    iput v5, v0, Lab/h;->i:I

    iget v2, v0, Lab/h;->m:I

    if-ne v5, v2, :cond_0

    iget-wide v5, v0, Lab/h;->q:J

    cmp-long v2, v5, v18

    if-eqz v2, :cond_1

    move v2, v4

    goto :goto_1

    :cond_1
    move v2, v14

    :goto_1
    invoke-static {v2}, Lva3/g;->i(Z)V

    iget-object v5, v0, Lab/h;->g:Lt9/k0;

    iget-wide v6, v0, Lab/h;->q:J

    iget v2, v0, Lab/h;->n:I

    if-ne v2, v3, :cond_2

    move v8, v14

    goto :goto_2

    :cond_2
    move v8, v4

    :goto_2
    iget v9, v0, Lab/h;->m:I

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-interface/range {v5 .. v11}, Lt9/k0;->b(JIIILt9/j0;)V

    iget-wide v2, v0, Lab/h;->q:J

    iget-wide v4, v0, Lab/h;->k:J

    add-long/2addr v2, v4

    iput-wide v2, v0, Lab/h;->q:J

    iput v14, v0, Lab/h;->h:I

    goto :goto_0

    :pswitch_1
    iget-object v2, v10, Lx8/n;->a:[B

    iget v15, v0, Lab/h;->p:I

    invoke-virtual {v0, v1, v2, v15}, Lab/h;->b(Lx8/n;[BI)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v10, Lx8/n;->a:[B

    invoke-static {v2}, Lt9/a;->i([B)Llo/s;

    move-result-object v15

    invoke-virtual {v15, v6}, Llo/s;->i(I)I

    move-result v6

    if-ne v6, v13, :cond_3

    move v6, v4

    goto :goto_3

    :cond_3
    move v6, v14

    :goto_3
    sget-object v13, Lt9/a;->n:[I

    invoke-static {v15, v13}, Lt9/a;->p(Llo/s;[I)I

    move-result v13

    add-int/lit8 v23, v13, 0x1

    if-eqz v6, :cond_e

    invoke-virtual {v15}, Llo/s;->h()Z

    move-result v22

    if-eqz v22, :cond_d

    move/from16 v28, v3

    add-int/lit8 v3, v13, -0x1

    aget-byte v22, v2, v3

    shl-int/lit8 v22, v22, 0x8

    const v24, 0xffff

    and-int v22, v22, v24

    aget-byte v13, v2, v13

    and-int/lit16 v13, v13, 0xff

    or-int v13, v22, v13

    sget v22, Lx8/t;->a:I

    move v11, v14

    move/from16 v9, v24

    :goto_4
    if-ge v11, v3, :cond_4

    aget-byte v14, v2, v11

    and-int/lit16 v7, v14, 0xff

    shr-int/lit8 v7, v7, 0x4

    shr-int/lit8 v5, v9, 0xc

    and-int/lit16 v5, v5, 0xff

    xor-int/2addr v5, v7

    and-int/lit16 v5, v5, 0xff

    shl-int/lit8 v7, v9, 0x4

    and-int v7, v7, v24

    sget-object v9, Lx8/t;->l:[I

    aget v5, v9, v5

    xor-int/2addr v5, v7

    and-int v5, v5, v24

    and-int/lit8 v7, v14, 0xf

    shr-int/lit8 v14, v5, 0xc

    and-int/lit16 v14, v14, 0xff

    xor-int/2addr v7, v14

    and-int/lit16 v7, v7, 0xff

    shl-int/lit8 v5, v5, 0x4

    and-int v5, v5, v24

    aget v7, v9, v7

    xor-int/2addr v5, v7

    and-int v9, v5, v24

    add-int/lit8 v11, v11, 0x1

    const/4 v14, 0x0

    goto :goto_4

    :cond_4
    if-ne v13, v9, :cond_c

    invoke-virtual {v15, v12}, Llo/s;->i(I)I

    move-result v2

    if-eqz v2, :cond_7

    if-eq v2, v4, :cond_6

    if-ne v2, v12, :cond_5

    const/16 v11, 0x180

    :goto_5
    const/4 v2, 0x3

    goto :goto_6

    :cond_5
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Unsupported base duration index in DTS UHD header: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v8, v1}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v1

    throw v1

    :cond_6
    const/16 v11, 0x1e0

    goto :goto_5

    :cond_7
    const/4 v2, 0x3

    const/16 v11, 0x200

    :goto_6
    invoke-virtual {v15, v2}, Llo/s;->i(I)I

    move-result v3

    add-int/2addr v3, v4

    mul-int/2addr v3, v11

    invoke-virtual {v15, v12}, Llo/s;->i(I)I

    move-result v2

    if-eqz v2, :cond_a

    if-eq v2, v4, :cond_9

    if-ne v2, v12, :cond_8

    const v8, 0xbb80

    goto :goto_7

    :cond_8
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Unsupported clock rate index in DTS UHD header: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v8, v1}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v1

    throw v1

    :cond_9
    const v8, 0xac44

    goto :goto_7

    :cond_a
    const/16 v8, 0x7d00

    :goto_7
    invoke-virtual {v15}, Llo/s;->h()Z

    move-result v2

    if-eqz v2, :cond_b

    const/16 v2, 0x24

    invoke-virtual {v15, v2}, Llo/s;->t(I)V

    :cond_b
    invoke-virtual {v15, v12}, Llo/s;->i(I)I

    move-result v2

    shl-int v2, v4, v2

    mul-int v12, v8, v2

    int-to-long v2, v3

    int-to-long v4, v8

    sget-object v38, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v34, 0xf4240

    move-wide/from16 v32, v2

    move-wide/from16 v36, v4

    invoke-static/range {v32 .. v38}, Lx8/t;->Q(JJJLjava/math/RoundingMode;)J

    move-result-wide v2

    move v4, v12

    goto :goto_8

    :cond_c
    const-string v1, "CRC check failed"

    invoke-static {v8, v1}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v1

    throw v1

    :cond_d
    const-string v1, "Only supports full channel mask-based audio presentation"

    invoke-static {v1}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v1

    throw v1

    :cond_e
    move-wide/from16 v2, v18

    const v4, -0x7fffffff

    :goto_8
    const/4 v5, 0x0

    const/4 v7, 0x0

    :goto_9
    if-ge v5, v6, :cond_f

    sget-object v8, Lt9/a;->o:[I

    invoke-static {v15, v8}, Lt9/a;->p(Llo/s;[I)I

    move-result v8

    add-int/2addr v7, v8

    add-int/lit8 v5, v5, 0x1

    goto :goto_9

    :cond_f
    iget-object v5, v0, Lab/h;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    if-eqz v6, :cond_10

    sget-object v6, Lt9/a;->p:[I

    invoke-static {v15, v6}, Lt9/a;->p(Llo/s;[I)I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    :cond_10
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v5

    if-eqz v5, :cond_11

    sget-object v5, Lt9/a;->q:[I

    invoke-static {v15, v5}, Lt9/a;->p(Llo/s;[I)I

    move-result v5

    goto :goto_a

    :cond_11
    const/4 v5, 0x0

    :goto_a
    add-int/2addr v7, v5

    add-int v5, v7, v23

    move-wide v6, v2

    new-instance v2, Lcom/iterable/iterableapi/q;

    const-string v8, "audio/vnd.dts.uhd;profile=p2"

    const/4 v3, 0x2

    invoke-direct/range {v2 .. v8}, Lcom/iterable/iterableapi/q;-><init>(IIIJLjava/lang/String;)V

    iget v3, v0, Lab/h;->n:I

    const/4 v4, 0x3

    if-ne v3, v4, :cond_12

    invoke-virtual {v0, v2}, Lab/h;->f(Lcom/iterable/iterableapi/q;)V

    :cond_12
    iput v5, v0, Lab/h;->m:I

    cmp-long v2, v6, v18

    if-nez v2, :cond_13

    const-wide/16 v5, 0x0

    goto :goto_b

    :cond_13
    move-wide v5, v6

    :goto_b
    iput-wide v5, v0, Lab/h;->k:J

    const/4 v2, 0x0

    invoke-virtual {v10, v2}, Lx8/n;->F(I)V

    iget-object v3, v0, Lab/h;->g:Lt9/k0;

    iget v4, v0, Lab/h;->p:I

    invoke-interface {v3, v10, v4, v2}, Lt9/k0;->d(Lx8/n;II)V

    const/4 v2, 0x6

    iput v2, v0, Lab/h;->h:I

    goto/16 :goto_0

    :pswitch_2
    const/4 v2, 0x6

    iget-object v3, v10, Lx8/n;->a:[B

    invoke-virtual {v0, v1, v3, v2}, Lab/h;->b(Lx8/n;[BI)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v10, Lx8/n;->a:[B

    invoke-static {v2}, Lt9/a;->i([B)Llo/s;

    move-result-object v2

    invoke-virtual {v2, v6}, Llo/s;->t(I)V

    sget-object v3, Lt9/a;->r:[I

    invoke-static {v2, v3}, Lt9/a;->p(Llo/s;[I)I

    move-result v2

    add-int/2addr v2, v4

    iput v2, v0, Lab/h;->p:I

    iget v3, v0, Lab/h;->i:I

    if-le v3, v2, :cond_14

    sub-int v2, v3, v2

    sub-int/2addr v3, v2

    iput v3, v0, Lab/h;->i:I

    iget v3, v1, Lx8/n;->b:I

    sub-int/2addr v3, v2

    invoke-virtual {v1, v3}, Lx8/n;->F(I)V

    :cond_14
    iput v15, v0, Lab/h;->h:I

    goto/16 :goto_0

    :pswitch_3
    move/from16 v28, v3

    iget-object v2, v10, Lx8/n;->a:[B

    iget v3, v0, Lab/h;->o:I

    invoke-virtual {v0, v1, v2, v3}, Lab/h;->b(Lx8/n;[BI)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v10, Lx8/n;->a:[B

    invoke-static {v2}, Lt9/a;->i([B)Llo/s;

    move-result-object v2

    const/16 v3, 0x28

    invoke-virtual {v2, v3}, Llo/s;->t(I)V

    invoke-virtual {v2, v12}, Llo/s;->i(I)I

    move-result v3

    invoke-virtual {v2}, Llo/s;->h()Z

    move-result v5

    if-nez v5, :cond_15

    const/16 v5, 0x10

    move/from16 v6, v27

    goto :goto_c

    :cond_15
    const/16 v5, 0x14

    const/16 v6, 0xc

    :goto_c
    invoke-virtual {v2, v6}, Llo/s;->t(I)V

    invoke-virtual {v2, v5}, Llo/s;->i(I)I

    move-result v6

    add-int/lit8 v35, v6, 0x1

    invoke-virtual {v2}, Llo/s;->h()Z

    move-result v6

    if-eqz v6, :cond_1a

    invoke-virtual {v2, v12}, Llo/s;->i(I)I

    move-result v7

    const/4 v9, 0x3

    invoke-virtual {v2, v9}, Llo/s;->i(I)I

    move-result v11

    add-int/2addr v11, v4

    const/16 v13, 0x200

    mul-int/2addr v11, v13

    invoke-virtual {v2}, Llo/s;->h()Z

    move-result v13

    if-eqz v13, :cond_16

    const/16 v13, 0x24

    invoke-virtual {v2, v13}, Llo/s;->t(I)V

    :cond_16
    invoke-virtual {v2, v9}, Llo/s;->i(I)I

    move-result v13

    add-int/2addr v13, v4

    invoke-virtual {v2, v9}, Llo/s;->i(I)I

    move-result v9

    add-int/2addr v9, v4

    if-ne v13, v4, :cond_19

    if-ne v9, v4, :cond_19

    add-int/2addr v3, v4

    invoke-virtual {v2, v3}, Llo/s;->i(I)I

    move-result v9

    const/4 v13, 0x0

    :goto_d
    if-ge v13, v3, :cond_18

    shr-int v14, v9, v13

    and-int/2addr v14, v4

    if-ne v14, v4, :cond_17

    move/from16 v14, v27

    invoke-virtual {v2, v14}, Llo/s;->t(I)V

    :cond_17
    add-int/lit8 v13, v13, 0x1

    const/16 v27, 0x8

    goto :goto_d

    :cond_18
    invoke-virtual {v2}, Llo/s;->h()Z

    move-result v3

    if-eqz v3, :cond_1b

    invoke-virtual {v2, v12}, Llo/s;->t(I)V

    invoke-virtual {v2, v12}, Llo/s;->i(I)I

    move-result v3

    add-int/2addr v3, v4

    shl-int/2addr v3, v12

    invoke-virtual {v2, v12}, Llo/s;->i(I)I

    move-result v9

    add-int/2addr v9, v4

    const/4 v13, 0x0

    :goto_e
    if-ge v13, v9, :cond_1b

    invoke-virtual {v2, v3}, Llo/s;->t(I)V

    add-int/lit8 v13, v13, 0x1

    goto :goto_e

    :cond_19
    const-string v1, "Multiple audio presentations or assets not supported"

    invoke-static {v1}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v1

    throw v1

    :cond_1a
    const/4 v7, -0x1

    const/4 v11, 0x0

    :cond_1b
    invoke-virtual {v2, v5}, Llo/s;->t(I)V

    const/16 v3, 0xc

    invoke-virtual {v2, v3}, Llo/s;->t(I)V

    if-eqz v6, :cond_1f

    invoke-virtual {v2}, Llo/s;->h()Z

    move-result v3

    if-eqz v3, :cond_1c

    move/from16 v3, v28

    invoke-virtual {v2, v3}, Llo/s;->t(I)V

    :cond_1c
    invoke-virtual {v2}, Llo/s;->h()Z

    move-result v3

    if-eqz v3, :cond_1d

    const/16 v3, 0x18

    invoke-virtual {v2, v3}, Llo/s;->t(I)V

    :cond_1d
    invoke-virtual {v2}, Llo/s;->h()Z

    move-result v3

    if-eqz v3, :cond_1e

    const/16 v3, 0xa

    invoke-virtual {v2, v3}, Llo/s;->i(I)I

    move-result v3

    add-int/2addr v3, v4

    invoke-virtual {v2, v3}, Llo/s;->u(I)V

    :cond_1e
    invoke-virtual {v2, v15}, Llo/s;->t(I)V

    sget-object v3, Lt9/a;->m:[I

    const/4 v5, 0x4

    invoke-virtual {v2, v5}, Llo/s;->i(I)I

    move-result v5

    aget v3, v3, v5

    const/16 v14, 0x8

    invoke-virtual {v2, v14}, Llo/s;->i(I)I

    move-result v2

    add-int/lit8 v5, v2, 0x1

    move/from16 v34, v3

    move/from16 v33, v5

    goto :goto_f

    :cond_1f
    const/16 v33, -0x1

    const v34, -0x7fffffff

    :goto_f
    if-eqz v6, :cond_23

    if-eqz v7, :cond_22

    if-eq v7, v4, :cond_21

    if-ne v7, v12, :cond_20

    const v8, 0xbb80

    goto :goto_10

    :cond_20
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported reference clock code in DTS HD header: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v8, v1}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v1

    throw v1

    :cond_21
    const v8, 0xac44

    goto :goto_10

    :cond_22
    const/16 v8, 0x7d00

    :goto_10
    int-to-long v2, v11

    int-to-long v4, v8

    sget v6, Lx8/t;->a:I

    sget-object v26, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v22, 0xf4240

    move-wide/from16 v20, v2

    move-wide/from16 v24, v4

    invoke-static/range {v20 .. v26}, Lx8/t;->Q(JJJLjava/math/RoundingMode;)J

    move-result-wide v2

    move-wide/from16 v36, v2

    goto :goto_11

    :cond_23
    move-wide/from16 v36, v18

    :goto_11
    new-instance v32, Lcom/iterable/iterableapi/q;

    const-string v38, "audio/vnd.dts.hd;profile=lbr"

    invoke-direct/range {v32 .. v38}, Lcom/iterable/iterableapi/q;-><init>(IIIJLjava/lang/String;)V

    move-object/from16 v2, v32

    move/from16 v6, v35

    invoke-virtual {v0, v2}, Lab/h;->f(Lcom/iterable/iterableapi/q;)V

    iput v6, v0, Lab/h;->m:I

    cmp-long v2, v36, v18

    if-nez v2, :cond_24

    const-wide/16 v5, 0x0

    goto :goto_12

    :cond_24
    move-wide/from16 v5, v36

    :goto_12
    iput-wide v5, v0, Lab/h;->k:J

    const/4 v2, 0x0

    invoke-virtual {v10, v2}, Lx8/n;->F(I)V

    iget-object v3, v0, Lab/h;->g:Lt9/k0;

    iget v4, v0, Lab/h;->o:I

    invoke-interface {v3, v10, v4, v2}, Lt9/k0;->d(Lx8/n;II)V

    const/4 v2, 0x6

    iput v2, v0, Lab/h;->h:I

    goto/16 :goto_0

    :pswitch_4
    iget-object v2, v10, Lx8/n;->a:[B

    const/4 v3, 0x7

    invoke-virtual {v0, v1, v2, v3}, Lab/h;->b(Lx8/n;[BI)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v10, Lx8/n;->a:[B

    invoke-static {v2}, Lt9/a;->i([B)Llo/s;

    move-result-object v2

    const/16 v3, 0x2a

    invoke-virtual {v2, v3}, Llo/s;->t(I)V

    invoke-virtual {v2}, Llo/s;->h()Z

    move-result v3

    if-eqz v3, :cond_25

    const/16 v14, 0xc

    goto :goto_13

    :cond_25
    const/16 v14, 0x8

    :goto_13
    invoke-virtual {v2, v14}, Llo/s;->i(I)I

    move-result v2

    add-int/2addr v2, v4

    iput v2, v0, Lab/h;->o:I

    const/4 v2, 0x3

    iput v2, v0, Lab/h;->h:I

    goto/16 :goto_0

    :pswitch_5
    iget-object v2, v10, Lx8/n;->a:[B

    const/16 v3, 0x12

    invoke-virtual {v0, v1, v2, v3}, Lab/h;->b(Lx8/n;[BI)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v10, Lx8/n;->a:[B

    iget-object v5, v0, Lab/h;->l:Lu8/p;

    const/16 v7, 0x3c

    if-nez v5, :cond_28

    iget-object v5, v0, Lab/h;->f:Ljava/lang/String;

    invoke-static {v2}, Lt9/a;->i([B)Llo/s;

    move-result-object v9

    invoke-virtual {v9, v7}, Llo/s;->t(I)V

    const/4 v11, 0x6

    invoke-virtual {v9, v11}, Llo/s;->i(I)I

    move-result v13

    sget-object v11, Lt9/a;->j:[I

    aget v11, v11, v13

    const/4 v13, 0x4

    invoke-virtual {v9, v13}, Llo/s;->i(I)I

    move-result v14

    sget-object v13, Lt9/a;->k:[I

    aget v13, v13, v14

    invoke-virtual {v9, v15}, Llo/s;->i(I)I

    move-result v14

    sget-object v16, Lt9/a;->l:[I

    move/from16 v17, v6

    const/16 v6, 0x1d

    if-lt v14, v6, :cond_26

    const/4 v6, -0x1

    :goto_14
    const/16 v14, 0xa

    goto :goto_15

    :cond_26
    aget v6, v16, v14

    mul-int/lit16 v6, v6, 0x3e8

    div-int/2addr v6, v12

    goto :goto_14

    :goto_15
    invoke-virtual {v9, v14}, Llo/s;->t(I)V

    invoke-virtual {v9, v12}, Llo/s;->i(I)I

    move-result v9

    if-lez v9, :cond_27

    move v9, v4

    goto :goto_16

    :cond_27
    const/4 v9, 0x0

    :goto_16
    add-int/2addr v11, v9

    new-instance v9, Lu8/o;

    invoke-direct {v9}, Lu8/o;-><init>()V

    iput-object v5, v9, Lu8/o;->a:Ljava/lang/String;

    iget-object v5, v0, Lab/h;->e:Ljava/lang/String;

    invoke-static {v5}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v9, Lu8/o;->l:Ljava/lang/String;

    const-string v5, "audio/vnd.dts"

    invoke-static {v5}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v9, Lu8/o;->m:Ljava/lang/String;

    iput v6, v9, Lu8/o;->h:I

    iput v11, v9, Lu8/o;->C:I

    iput v13, v9, Lu8/o;->D:I

    iput-object v8, v9, Lu8/o;->q:Lu8/l;

    iget-object v5, v0, Lab/h;->c:Ljava/lang/String;

    iput-object v5, v9, Lu8/o;->d:Ljava/lang/String;

    iget v5, v0, Lab/h;->d:I

    iput v5, v9, Lu8/o;->f:I

    new-instance v5, Lu8/p;

    invoke-direct {v5, v9}, Lu8/p;-><init>(Lu8/o;)V

    iput-object v5, v0, Lab/h;->l:Lu8/p;

    iget-object v6, v0, Lab/h;->g:Lt9/k0;

    invoke-interface {v6, v5}, Lt9/k0;->a(Lu8/p;)V

    :goto_17
    const/16 v30, 0x0

    goto :goto_18

    :cond_28
    move/from16 v17, v6

    goto :goto_17

    :goto_18
    aget-byte v5, v2, v30

    const/16 v6, 0x1f

    const/4 v8, -0x2

    if-eq v5, v8, :cond_2b

    const/4 v9, -0x1

    if-eq v5, v9, :cond_2a

    if-eq v5, v6, :cond_29

    aget-byte v9, v2, v15

    const/16 v31, 0x3

    and-int/lit8 v9, v9, 0x3

    const/16 v26, 0xc

    shl-int/lit8 v9, v9, 0xc

    const/16 v29, 0x6

    aget-byte v11, v2, v29

    and-int/lit16 v11, v11, 0xff

    const/16 v28, 0x4

    shl-int/lit8 v11, v11, 0x4

    or-int/2addr v9, v11

    const/16 v24, 0x7

    aget-byte v11, v2, v24

    :goto_19
    and-int/lit16 v11, v11, 0xf0

    shr-int/lit8 v11, v11, 0x4

    or-int/2addr v9, v11

    add-int/2addr v9, v4

    const/4 v11, 0x0

    goto :goto_1b

    :cond_29
    const/16 v24, 0x7

    const/16 v28, 0x4

    const/16 v29, 0x6

    aget-byte v9, v2, v29

    const/16 v31, 0x3

    and-int/lit8 v9, v9, 0x3

    const/16 v26, 0xc

    shl-int/lit8 v9, v9, 0xc

    aget-byte v11, v2, v24

    and-int/lit16 v11, v11, 0xff

    shl-int/lit8 v11, v11, 0x4

    or-int/2addr v9, v11

    const/16 v27, 0x8

    aget-byte v11, v2, v27

    :goto_1a
    and-int/2addr v11, v7

    shr-int/2addr v11, v12

    or-int/2addr v9, v11

    add-int/2addr v9, v4

    move v11, v4

    goto :goto_1b

    :cond_2a
    const/16 v24, 0x7

    aget-byte v9, v2, v24

    const/16 v31, 0x3

    and-int/lit8 v9, v9, 0x3

    const/16 v26, 0xc

    shl-int/lit8 v9, v9, 0xc

    const/16 v29, 0x6

    aget-byte v11, v2, v29

    and-int/lit16 v11, v11, 0xff

    const/16 v28, 0x4

    shl-int/lit8 v11, v11, 0x4

    or-int/2addr v9, v11

    const/16 v11, 0x9

    aget-byte v11, v2, v11

    goto :goto_1a

    :cond_2b
    const/16 v28, 0x4

    aget-byte v9, v2, v28

    const/16 v31, 0x3

    and-int/lit8 v9, v9, 0x3

    const/16 v26, 0xc

    shl-int/lit8 v9, v9, 0xc

    const/16 v24, 0x7

    aget-byte v11, v2, v24

    and-int/lit16 v11, v11, 0xff

    shl-int/lit8 v11, v11, 0x4

    or-int/2addr v9, v11

    const/16 v29, 0x6

    aget-byte v11, v2, v29

    goto :goto_19

    :goto_1b
    if-eqz v11, :cond_2c

    mul-int/lit8 v9, v9, 0x10

    div-int/lit8 v9, v9, 0xe

    :cond_2c
    iput v9, v0, Lab/h;->m:I

    if-eq v5, v8, :cond_2f

    const/4 v9, -0x1

    if-eq v5, v9, :cond_2e

    if-eq v5, v6, :cond_2d

    const/16 v28, 0x4

    aget-byte v5, v2, v28

    and-int/2addr v5, v4

    const/16 v29, 0x6

    shl-int/lit8 v5, v5, 0x6

    aget-byte v2, v2, v15

    :goto_1c
    and-int/lit16 v2, v2, 0xfc

    :goto_1d
    shr-int/2addr v2, v12

    or-int/2addr v2, v5

    goto :goto_1f

    :cond_2d
    const/16 v28, 0x4

    const/16 v29, 0x6

    aget-byte v5, v2, v15

    const/16 v24, 0x7

    and-int/lit8 v5, v5, 0x7

    shl-int/lit8 v5, v5, 0x4

    aget-byte v2, v2, v29

    :goto_1e
    and-int/2addr v2, v7

    goto :goto_1d

    :cond_2e
    const/16 v24, 0x7

    const/16 v28, 0x4

    aget-byte v5, v2, v28

    and-int/lit8 v5, v5, 0x7

    shl-int/lit8 v5, v5, 0x4

    aget-byte v2, v2, v24

    goto :goto_1e

    :cond_2f
    const/16 v28, 0x4

    aget-byte v5, v2, v15

    and-int/2addr v5, v4

    const/16 v29, 0x6

    shl-int/lit8 v5, v5, 0x6

    aget-byte v2, v2, v28

    goto :goto_1c

    :goto_1f
    add-int/2addr v2, v4

    mul-int/lit8 v2, v2, 0x20

    int-to-long v4, v2

    iget-object v2, v0, Lab/h;->l:Lu8/p;

    iget v2, v2, Lu8/p;->E:I

    invoke-static {v2, v4, v5}, Lx8/t;->O(IJ)J

    move-result-wide v4

    invoke-static {v4, v5}, Lvd/f;->k(J)I

    move-result v2

    int-to-long v4, v2

    iput-wide v4, v0, Lab/h;->k:J

    const/4 v2, 0x0

    invoke-virtual {v10, v2}, Lx8/n;->F(I)V

    iget-object v4, v0, Lab/h;->g:Lt9/k0;

    invoke-interface {v4, v10, v3, v2}, Lt9/k0;->d(Lx8/n;II)V

    const/4 v2, 0x6

    iput v2, v0, Lab/h;->h:I

    goto/16 :goto_0

    :cond_30
    :pswitch_6
    invoke-virtual {v1}, Lx8/n;->a()I

    move-result v2

    if-lez v2, :cond_0

    iget v2, v0, Lab/h;->j:I

    const/16 v27, 0x8

    shl-int/lit8 v2, v2, 0x8

    iput v2, v0, Lab/h;->j:I

    invoke-virtual {v1}, Lx8/n;->t()I

    move-result v3

    or-int/2addr v2, v3

    iput v2, v0, Lab/h;->j:I

    const v3, 0x7ffe8001

    if-eq v2, v3, :cond_38

    const v3, -0x180fe80

    if-eq v2, v3, :cond_38

    const v3, 0x1fffe800

    if-eq v2, v3, :cond_38

    const v3, -0xe0ff18

    if-ne v2, v3, :cond_31

    goto :goto_23

    :cond_31
    const v3, 0x64582025

    if-eq v2, v3, :cond_37

    const v3, 0x25205864

    if-ne v2, v3, :cond_32

    goto :goto_22

    :cond_32
    if-eq v2, v13, :cond_36

    const v3, -0xde4bec0

    if-ne v2, v3, :cond_33

    goto :goto_21

    :cond_33
    const v3, 0x71c442e8

    if-eq v2, v3, :cond_35

    const v3, -0x17bd3b8f

    if-ne v2, v3, :cond_34

    goto :goto_20

    :cond_34
    const/4 v3, 0x0

    goto :goto_24

    :cond_35
    :goto_20
    const/4 v3, 0x4

    goto :goto_24

    :cond_36
    :goto_21
    const/4 v3, 0x3

    goto :goto_24

    :cond_37
    :goto_22
    move v3, v12

    goto :goto_24

    :cond_38
    :goto_23
    move v3, v4

    :goto_24
    iput v3, v0, Lab/h;->n:I

    if-eqz v3, :cond_30

    iget-object v5, v10, Lx8/n;->a:[B

    shr-int/lit8 v6, v2, 0x18

    and-int/lit16 v6, v6, 0xff

    int-to-byte v6, v6

    const/16 v30, 0x0

    aput-byte v6, v5, v30

    shr-int/lit8 v6, v2, 0x10

    and-int/lit16 v6, v6, 0xff

    int-to-byte v6, v6

    aput-byte v6, v5, v4

    shr-int/lit8 v6, v2, 0x8

    and-int/lit16 v6, v6, 0xff

    int-to-byte v6, v6

    aput-byte v6, v5, v12

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    const/4 v9, 0x3

    aput-byte v2, v5, v9

    const/4 v5, 0x4

    iput v5, v0, Lab/h;->i:I

    const/4 v2, 0x0

    iput v2, v0, Lab/h;->j:I

    if-eq v3, v9, :cond_3b

    if-ne v3, v5, :cond_39

    goto :goto_25

    :cond_39
    if-ne v3, v4, :cond_3a

    iput v4, v0, Lab/h;->h:I

    goto/16 :goto_0

    :cond_3a
    iput v12, v0, Lab/h;->h:I

    goto/16 :goto_0

    :cond_3b
    :goto_25
    iput v5, v0, Lab/h;->h:I

    goto/16 :goto_0

    :cond_3c
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(IJ)V
    .locals 0

    iput-wide p2, p0, Lab/h;->q:J

    return-void
.end method

.method public final e(Z)V
    .locals 0

    return-void
.end method

.method public final f(Lcom/iterable/iterableapi/q;)V
    .locals 4

    iget v0, p1, Lcom/iterable/iterableapi/q;->b:I

    iget-object v1, p1, Lcom/iterable/iterableapi/q;->a:Ljava/lang/String;

    iget p1, p1, Lcom/iterable/iterableapi/q;->c:I

    const v2, -0x7fffffff

    if-eq v0, v2, :cond_3

    const/4 v2, -0x1

    if-ne p1, v2, :cond_0

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lab/h;->l:Lu8/p;

    if-eqz v2, :cond_1

    iget v3, v2, Lu8/p;->D:I

    if-ne p1, v3, :cond_1

    iget v3, v2, Lu8/p;->E:I

    if-ne v0, v3, :cond_1

    iget-object v2, v2, Lu8/p;->n:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_1
    iget-object v2, p0, Lab/h;->l:Lu8/p;

    if-nez v2, :cond_2

    new-instance v2, Lu8/o;

    invoke-direct {v2}, Lu8/o;-><init>()V

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Lu8/p;->a()Lu8/o;

    move-result-object v2

    :goto_0
    iget-object v3, p0, Lab/h;->f:Ljava/lang/String;

    iput-object v3, v2, Lu8/o;->a:Ljava/lang/String;

    iget-object v3, p0, Lab/h;->e:Ljava/lang/String;

    invoke-static {v3}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lu8/o;->l:Ljava/lang/String;

    invoke-static {v1}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v2, Lu8/o;->m:Ljava/lang/String;

    iput p1, v2, Lu8/o;->C:I

    iput v0, v2, Lu8/o;->D:I

    iget-object p1, p0, Lab/h;->c:Ljava/lang/String;

    iput-object p1, v2, Lu8/o;->d:Ljava/lang/String;

    iget p1, p0, Lab/h;->d:I

    iput p1, v2, Lu8/o;->f:I

    new-instance p1, Lu8/p;

    invoke-direct {p1, v2}, Lu8/p;-><init>(Lu8/o;)V

    iput-object p1, p0, Lab/h;->l:Lu8/p;

    iget-object v0, p0, Lab/h;->g:Lt9/k0;

    invoke-interface {v0, p1}, Lt9/k0;->a(Lu8/p;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public final i(Lt9/q;Lab/l0;)V
    .locals 1

    invoke-virtual {p2}, Lab/l0;->c()V

    invoke-virtual {p2}, Lab/l0;->h()V

    iget-object v0, p2, Lab/l0;->f:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lab/h;->f:Ljava/lang/String;

    invoke-virtual {p2}, Lab/l0;->h()V

    iget p2, p2, Lab/l0;->e:I

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lt9/q;->o(II)Lt9/k0;

    move-result-object p1

    iput-object p1, p0, Lab/h;->g:Lt9/k0;

    return-void
.end method
