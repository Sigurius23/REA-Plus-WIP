.class public final Lab/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lab/m0;


# instance fields
.field public final a:Lab/j;

.field public final b:Llo/s;

.field public c:I

.field public d:I

.field public e:Lx8/s;

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:I

.field public j:I

.field public k:Z

.field public l:J


# direct methods
.method public constructor <init>(Lab/j;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lab/z;->a:Lab/j;

    new-instance p1, Llo/s;

    const/16 v0, 0xa

    new-array v1, v0, [B

    const/4 v2, 0x5

    const/4 v3, 0x0

    invoke-direct {p1, v1, v0, v2, v3}, Llo/s;-><init>([BIIB)V

    iput-object p1, p0, Lab/z;->b:Llo/s;

    const/4 p1, 0x0

    iput p1, p0, Lab/z;->c:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lab/z;->c:I

    iput v0, p0, Lab/z;->d:I

    iput-boolean v0, p0, Lab/z;->h:Z

    iget-object v0, p0, Lab/z;->a:Lab/j;

    invoke-interface {v0}, Lab/j;->a()V

    return-void
.end method

.method public final b(ILx8/n;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    iget-object v2, v0, Lab/z;->e:Lx8/s;

    invoke-static {v2}, Lva3/g;->j(Ljava/lang/Object;)V

    and-int/lit8 v2, p1, 0x1

    const-string v3, "PesReader"

    const/4 v4, -0x1

    const/4 v5, 0x2

    iget-object v6, v0, Lab/z;->a:Lab/j;

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v2, :cond_5

    iget v2, v0, Lab/z;->c:I

    if-eqz v2, :cond_4

    if-eq v2, v9, :cond_4

    if-eq v2, v5, :cond_3

    if-ne v2, v7, :cond_2

    iget v2, v0, Lab/z;->j:I

    if-eq v2, v4, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v10, "Unexpected start indicator: expected "

    invoke-direct {v2, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v10, v0, Lab/z;->j:I

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v10, " more bytes"

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lx8/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget v2, v1, Lx8/n;->c:I

    if-nez v2, :cond_1

    move v2, v9

    goto :goto_0

    :cond_1
    move v2, v8

    :goto_0
    invoke-interface {v6, v2}, Lab/j;->e(Z)V

    goto :goto_1

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :cond_3
    const-string v2, "Unexpected start indicator reading extended header"

    invoke-static {v3, v2}, Lx8/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    :goto_1
    iput v9, v0, Lab/z;->c:I

    iput v8, v0, Lab/z;->d:I

    :cond_5
    move/from16 v2, p1

    :goto_2
    invoke-virtual {v1}, Lx8/n;->a()I

    move-result v10

    if-lez v10, :cond_14

    iget v10, v0, Lab/z;->c:I

    if-eqz v10, :cond_13

    iget-object v11, v0, Lab/z;->b:Llo/s;

    if-eq v10, v9, :cond_e

    if-eq v10, v5, :cond_a

    if-ne v10, v7, :cond_9

    invoke-virtual {v1}, Lx8/n;->a()I

    move-result v10

    iget v11, v0, Lab/z;->j:I

    if-ne v11, v4, :cond_6

    move v11, v8

    goto :goto_3

    :cond_6
    sub-int v11, v10, v11

    :goto_3
    if-lez v11, :cond_7

    sub-int/2addr v10, v11

    iget v11, v1, Lx8/n;->b:I

    add-int/2addr v11, v10

    invoke-virtual {v1, v11}, Lx8/n;->E(I)V

    :cond_7
    invoke-interface {v6, v1}, Lab/j;->c(Lx8/n;)V

    iget v11, v0, Lab/z;->j:I

    if-eq v11, v4, :cond_8

    sub-int/2addr v11, v10

    iput v11, v0, Lab/z;->j:I

    if-nez v11, :cond_8

    invoke-interface {v6, v8}, Lab/j;->e(Z)V

    iput v9, v0, Lab/z;->c:I

    iput v8, v0, Lab/z;->d:I

    :cond_8
    move v10, v5

    goto/16 :goto_7

    :cond_9
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :cond_a
    const/16 v10, 0xa

    iget v12, v0, Lab/z;->i:I

    invoke-static {v10, v12}, Ljava/lang/Math;->min(II)I

    move-result v10

    iget-object v12, v11, Llo/s;->b:[B

    invoke-virtual {v0, v1, v12, v10}, Lab/z;->c(Lx8/n;[BI)Z

    move-result v10

    if-eqz v10, :cond_8

    const/4 v10, 0x0

    iget v12, v0, Lab/z;->i:I

    invoke-virtual {v0, v1, v10, v12}, Lab/z;->c(Lx8/n;[BI)Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-virtual {v11, v8}, Llo/s;->q(I)V

    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v12, v0, Lab/z;->l:J

    iget-boolean v10, v0, Lab/z;->f:Z

    const/4 v12, 0x4

    if-eqz v10, :cond_c

    invoke-virtual {v11, v12}, Llo/s;->t(I)V

    invoke-virtual {v11, v7}, Llo/s;->i(I)I

    move-result v10

    int-to-long v13, v10

    const/16 v10, 0x1e

    shl-long/2addr v13, v10

    invoke-virtual {v11, v9}, Llo/s;->t(I)V

    const/16 v15, 0xf

    invoke-virtual {v11, v15}, Llo/s;->i(I)I

    move-result v16

    move/from16 p1, v10

    shl-int/lit8 v10, v16, 0xf

    int-to-long v4, v10

    or-long/2addr v4, v13

    invoke-virtual {v11, v9}, Llo/s;->t(I)V

    invoke-virtual {v11, v15}, Llo/s;->i(I)I

    move-result v10

    int-to-long v13, v10

    or-long/2addr v4, v13

    invoke-virtual {v11, v9}, Llo/s;->t(I)V

    iget-boolean v10, v0, Lab/z;->h:Z

    if-nez v10, :cond_b

    iget-boolean v10, v0, Lab/z;->g:Z

    if-eqz v10, :cond_b

    invoke-virtual {v11, v12}, Llo/s;->t(I)V

    invoke-virtual {v11, v7}, Llo/s;->i(I)I

    move-result v10

    int-to-long v13, v10

    shl-long v13, v13, p1

    invoke-virtual {v11, v9}, Llo/s;->t(I)V

    invoke-virtual {v11, v15}, Llo/s;->i(I)I

    move-result v10

    shl-int/2addr v10, v15

    move-wide/from16 v17, v13

    int-to-long v12, v10

    or-long v12, v17, v12

    invoke-virtual {v11, v9}, Llo/s;->t(I)V

    invoke-virtual {v11, v15}, Llo/s;->i(I)I

    move-result v10

    int-to-long v14, v10

    or-long/2addr v12, v14

    invoke-virtual {v11, v9}, Llo/s;->t(I)V

    iget-object v10, v0, Lab/z;->e:Lx8/s;

    invoke-virtual {v10, v12, v13}, Lx8/s;->b(J)J

    iput-boolean v9, v0, Lab/z;->h:Z

    :cond_b
    iget-object v10, v0, Lab/z;->e:Lx8/s;

    invoke-virtual {v10, v4, v5}, Lx8/s;->b(J)J

    move-result-wide v4

    iput-wide v4, v0, Lab/z;->l:J

    :cond_c
    iget-boolean v4, v0, Lab/z;->k:Z

    if-eqz v4, :cond_d

    const/4 v12, 0x4

    goto :goto_4

    :cond_d
    move v12, v8

    :goto_4
    or-int/2addr v2, v12

    iget-wide v4, v0, Lab/z;->l:J

    invoke-interface {v6, v2, v4, v5}, Lab/j;->d(IJ)V

    iput v7, v0, Lab/z;->c:I

    iput v8, v0, Lab/z;->d:I

    const/4 v4, -0x1

    const/4 v5, 0x2

    goto/16 :goto_2

    :cond_e
    iget-object v4, v11, Llo/s;->b:[B

    const/16 v5, 0x9

    invoke-virtual {v0, v1, v4, v5}, Lab/z;->c(Lx8/n;[BI)Z

    move-result v4

    if-eqz v4, :cond_12

    invoke-virtual {v11, v8}, Llo/s;->q(I)V

    const/16 v4, 0x18

    invoke-virtual {v11, v4}, Llo/s;->i(I)I

    move-result v4

    if-eq v4, v9, :cond_f

    const-string v5, "Unexpected start code prefix: "

    invoke-static {v4, v5, v3}, Ly00/t7;->r(ILjava/lang/String;Ljava/lang/String;)V

    const/4 v4, -0x1

    iput v4, v0, Lab/z;->j:I

    move v5, v8

    const/4 v10, 0x2

    goto :goto_6

    :cond_f
    const/16 v4, 0x8

    invoke-virtual {v11, v4}, Llo/s;->t(I)V

    const/16 v5, 0x10

    invoke-virtual {v11, v5}, Llo/s;->i(I)I

    move-result v5

    const/4 v10, 0x5

    invoke-virtual {v11, v10}, Llo/s;->t(I)V

    invoke-virtual {v11}, Llo/s;->h()Z

    move-result v10

    iput-boolean v10, v0, Lab/z;->k:Z

    const/4 v10, 0x2

    invoke-virtual {v11, v10}, Llo/s;->t(I)V

    invoke-virtual {v11}, Llo/s;->h()Z

    move-result v12

    iput-boolean v12, v0, Lab/z;->f:Z

    invoke-virtual {v11}, Llo/s;->h()Z

    move-result v12

    iput-boolean v12, v0, Lab/z;->g:Z

    const/4 v12, 0x6

    invoke-virtual {v11, v12}, Llo/s;->t(I)V

    invoke-virtual {v11, v4}, Llo/s;->i(I)I

    move-result v4

    iput v4, v0, Lab/z;->i:I

    if-nez v5, :cond_10

    const/4 v11, -0x1

    iput v11, v0, Lab/z;->j:I

    move v4, v11

    goto :goto_5

    :cond_10
    add-int/lit8 v5, v5, -0x3

    sub-int/2addr v5, v4

    iput v5, v0, Lab/z;->j:I

    if-gez v5, :cond_11

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Found negative packet payload size: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v5, v0, Lab/z;->j:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lx8/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v4, -0x1

    iput v4, v0, Lab/z;->j:I

    goto :goto_5

    :cond_11
    const/4 v4, -0x1

    :goto_5
    move v5, v10

    :goto_6
    iput v5, v0, Lab/z;->c:I

    iput v8, v0, Lab/z;->d:I

    goto :goto_7

    :cond_12
    const/4 v4, -0x1

    const/4 v10, 0x2

    goto :goto_7

    :cond_13
    move v10, v5

    invoke-virtual {v1}, Lx8/n;->a()I

    move-result v5

    invoke-virtual {v1, v5}, Lx8/n;->G(I)V

    :goto_7
    move v5, v10

    goto/16 :goto_2

    :cond_14
    return-void
.end method

.method public final c(Lx8/n;[BI)Z
    .locals 3

    invoke-virtual {p1}, Lx8/n;->a()I

    move-result v0

    iget v1, p0, Lab/z;->d:I

    sub-int v1, p3, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x1

    if-gtz v0, :cond_0

    return v1

    :cond_0
    if-nez p2, :cond_1

    invoke-virtual {p1, v0}, Lx8/n;->G(I)V

    goto :goto_0

    :cond_1
    iget v2, p0, Lab/z;->d:I

    invoke-virtual {p1, p2, v2, v0}, Lx8/n;->e([BII)V

    :goto_0
    iget p1, p0, Lab/z;->d:I

    add-int/2addr p1, v0

    iput p1, p0, Lab/z;->d:I

    if-ne p1, p3, :cond_2

    return v1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final g(Lx8/s;Lt9/q;Lab/l0;)V
    .locals 0

    iput-object p1, p0, Lab/z;->e:Lx8/s;

    iget-object p1, p0, Lab/z;->a:Lab/j;

    invoke-interface {p1, p2, p3}, Lab/j;->i(Lt9/q;Lab/l0;)V

    return-void
.end method
