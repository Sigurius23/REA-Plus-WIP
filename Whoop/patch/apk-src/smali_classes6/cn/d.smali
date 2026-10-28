.class public final Lcn/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwm/i;


# instance fields
.field public final a:J

.field public final b:Led3/a;

.field public final c:Lt9/b0;

.field public final d:Lwm/m;

.field public final e:Lty/c;

.field public final f:Lwm/h;

.field public g:Lwm/k;

.field public h:Lwm/s;

.field public i:Lwm/s;

.field public j:I

.field public k:Lin/c;

.field public l:J

.field public m:J

.field public n:J

.field public o:I

.field public p:Lcn/f;

.field public q:Z

.field public r:Z

.field public s:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 1
    invoke-direct {p0, v0, v1}, Lcn/d;-><init>(J)V

    return-void
.end method

.method public constructor <init>(J)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcn/d;->a:J

    .line 4
    new-instance p1, Led3/a;

    const/16 p2, 0xa

    invoke-direct {p1, p2}, Led3/a;-><init>(I)V

    iput-object p1, p0, Lcn/d;->b:Led3/a;

    .line 5
    new-instance p1, Lt9/b0;

    const/4 p2, 0x1

    .line 6
    invoke-direct {p1, p2}, Lt9/b0;-><init>(I)V

    .line 7
    iput-object p1, p0, Lcn/d;->c:Lt9/b0;

    .line 8
    new-instance p1, Lwm/m;

    invoke-direct {p1}, Lwm/m;-><init>()V

    iput-object p1, p0, Lcn/d;->d:Lwm/m;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    iput-wide p1, p0, Lcn/d;->l:J

    .line 10
    new-instance p1, Lty/c;

    const/16 p2, 0x14

    invoke-direct {p1, p2}, Lty/c;-><init>(I)V

    iput-object p1, p0, Lcn/d;->e:Lty/c;

    .line 11
    new-instance p1, Lwm/h;

    invoke-direct {p1}, Lwm/h;-><init>()V

    iput-object p1, p0, Lcn/d;->f:Lwm/h;

    .line 12
    iput-object p1, p0, Lcn/d;->i:Lwm/s;

    return-void
.end method


# virtual methods
.method public final a(Lwm/j;Z)Lcn/a;
    .locals 10

    iget-object v0, p0, Lcn/d;->b:Led3/a;

    iget-object v1, v0, Led3/a;->a:[B

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-interface {p1, v1, v3, v2}, Lwm/j;->p([BII)V

    invoke-virtual {v0, v3}, Led3/a;->K(I)V

    invoke-virtual {v0}, Led3/a;->i()I

    move-result v0

    iget-object v1, p0, Lcn/d;->c:Lt9/b0;

    invoke-virtual {v1, v0}, Lt9/b0;->a(I)Z

    new-instance v2, Lcn/a;

    invoke-interface {p1}, Lwm/j;->getLength()J

    move-result-wide v3

    invoke-interface {p1}, Lwm/j;->getPosition()J

    move-result-wide v5

    iget v7, v1, Lt9/b0;->g:I

    iget v8, v1, Lt9/b0;->d:I

    move v9, p2

    invoke-direct/range {v2 .. v9}, Lcn/a;-><init>(JJIIZ)V

    return-object v2
.end method

.method public final b(JJ)V
    .locals 2

    const/4 p1, 0x0

    iput p1, p0, Lcn/d;->j:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcn/d;->l:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcn/d;->m:J

    iput p1, p0, Lcn/d;->o:I

    iput-wide p3, p0, Lcn/d;->s:J

    iget-object p1, p0, Lcn/d;->p:Lcn/f;

    instance-of p2, p1, Lcn/b;

    if-eqz p2, :cond_0

    check-cast p1, Lcn/b;

    invoke-virtual {p1, p3, p4}, Lcn/b;->b(J)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcn/d;->r:Z

    iget-object p1, p0, Lcn/d;->f:Lwm/h;

    iput-object p1, p0, Lcn/d;->i:Lwm/s;

    :cond_0
    return-void
.end method

.method public final c(Lwm/j;)Z
    .locals 8

    iget-object v0, p0, Lcn/d;->p:Lcn/f;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcn/f;->d()J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lwm/j;->g()J

    move-result-wide v4

    const-wide/16 v6, 0x4

    sub-long/2addr v2, v6

    cmp-long v0, v4, v2

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcn/d;->b:Led3/a;

    iget-object v0, v0, Led3/a;->a:[B

    const/4 v2, 0x0

    const/4 v3, 0x4

    invoke-interface {p1, v0, v2, v3, v1}, Lwm/j;->c([BIIZ)Z

    move-result p1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    xor-int/2addr p1, v1

    return p1

    :catch_0
    :goto_0
    return v1
.end method

.method public final d(Lwm/j;Z)Z
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    if-eqz p2, :cond_0

    const v2, 0x8000

    goto :goto_0

    :cond_0
    const/high16 v2, 0x20000

    :goto_0
    invoke-interface {v1}, Lwm/j;->e()V

    invoke-interface {v1}, Lwm/j;->getPosition()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-nez v3, :cond_5

    iget-object v3, v0, Lcn/d;->e:Lty/c;

    iget-object v3, v3, Lty/c;->x:Ljava/lang/Object;

    check-cast v3, Led3/a;

    move-object v6, v4

    move v7, v5

    :goto_1
    :try_start_0
    iget-object v8, v3, Led3/a;->a:[B

    const/16 v9, 0xa

    invoke-interface {v1, v8, v5, v9}, Lwm/j;->p([BII)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v3, v5}, Led3/a;->K(I)V

    invoke-virtual {v3}, Led3/a;->A()I

    move-result v8

    const v10, 0x494433

    if-eq v8, v10, :cond_1

    goto :goto_3

    :cond_1
    const/4 v8, 0x3

    invoke-virtual {v3, v8}, Led3/a;->L(I)V

    invoke-virtual {v3}, Led3/a;->w()I

    move-result v8

    add-int/lit8 v10, v8, 0xa

    if-nez v6, :cond_2

    new-array v6, v10, [B

    iget-object v11, v3, Led3/a;->a:[B

    invoke-static {v11, v5, v6, v5, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-interface {v1, v6, v9, v8}, Lwm/j;->p([BII)V

    new-instance v8, Lnn/h;

    invoke-direct {v8, v4}, Lnn/h;-><init>(Lnn/g;)V

    invoke-virtual {v8, v10, v6}, Lnn/h;->f0(I[B)Lin/c;

    move-result-object v6

    goto :goto_2

    :cond_2
    invoke-interface {v1, v8}, Lwm/j;->i(I)V

    :goto_2
    add-int/2addr v7, v10

    goto :goto_1

    :catch_0
    :goto_3
    invoke-interface {v1}, Lwm/j;->e()V

    invoke-interface {v1, v7}, Lwm/j;->i(I)V

    iput-object v6, v0, Lcn/d;->k:Lin/c;

    if-eqz v6, :cond_3

    iget-object v3, v0, Lcn/d;->d:Lwm/m;

    invoke-virtual {v3, v6}, Lwm/m;->b(Lin/c;)V

    :cond_3
    invoke-interface {v1}, Lwm/j;->g()J

    move-result-wide v6

    long-to-int v3, v6

    if-nez p2, :cond_4

    invoke-interface {v1, v3}, Lwm/j;->n(I)V

    :cond_4
    move v6, v5

    :goto_4
    move v7, v6

    move v8, v7

    goto :goto_5

    :cond_5
    move v3, v5

    move v6, v3

    goto :goto_4

    :goto_5
    invoke-virtual/range {p0 .. p1}, Lcn/d;->c(Lwm/j;)Z

    move-result v9

    const/4 v10, 0x1

    if-eqz v9, :cond_7

    if-lez v7, :cond_6

    goto :goto_7

    :cond_6
    new-instance v1, Ljava/io/EOFException;

    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    throw v1

    :cond_7
    iget-object v9, v0, Lcn/d;->b:Led3/a;

    invoke-virtual {v9, v5}, Led3/a;->K(I)V

    invoke-virtual {v9}, Led3/a;->i()I

    move-result v9

    if-eqz v6, :cond_8

    int-to-long v11, v6

    const v13, -0x1f400

    and-int/2addr v13, v9

    int-to-long v13, v13

    const-wide/32 v15, -0x1f400

    and-long/2addr v11, v15

    cmp-long v11, v13, v11

    if-nez v11, :cond_9

    :cond_8
    invoke-static {v9}, Ltm/a;->d(I)I

    move-result v11

    const/4 v12, -0x1

    if-ne v11, v12, :cond_d

    :cond_9
    add-int/lit8 v6, v8, 0x1

    if-ne v8, v2, :cond_b

    if-eqz p2, :cond_a

    return v5

    :cond_a
    const-string v1, "Searched too many bytes."

    invoke-static {v4, v1}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object v1

    throw v1

    :cond_b
    if-eqz p2, :cond_c

    invoke-interface {v1}, Lwm/j;->e()V

    add-int v7, v3, v6

    invoke-interface {v1, v7}, Lwm/j;->i(I)V

    goto :goto_6

    :cond_c
    invoke-interface {v1, v10}, Lwm/j;->n(I)V

    :goto_6
    move v7, v5

    move v8, v6

    move v6, v7

    goto :goto_5

    :cond_d
    add-int/lit8 v7, v7, 0x1

    if-ne v7, v10, :cond_e

    iget-object v6, v0, Lcn/d;->c:Lt9/b0;

    invoke-virtual {v6, v9}, Lt9/b0;->a(I)Z

    move v6, v9

    goto :goto_9

    :cond_e
    const/4 v9, 0x4

    if-ne v7, v9, :cond_10

    :goto_7
    if-eqz p2, :cond_f

    add-int/2addr v3, v8

    invoke-interface {v1, v3}, Lwm/j;->n(I)V

    goto :goto_8

    :cond_f
    invoke-interface {v1}, Lwm/j;->e()V

    :goto_8
    iput v6, v0, Lcn/d;->j:I

    return v10

    :cond_10
    :goto_9
    add-int/lit8 v11, v11, -0x4

    invoke-interface {v1, v11}, Lwm/j;->i(I)V

    goto :goto_5
.end method

.method public final g(Lwm/j;)Z
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcn/d;->d(Lwm/j;Z)Z

    move-result p1

    return p1
.end method

.method public final h(Lwm/k;)V
    .locals 2

    iput-object p1, p0, Lcn/d;->g:Lwm/k;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lwm/k;->o(II)Lwm/s;

    move-result-object p1

    iput-object p1, p0, Lcn/d;->h:Lwm/s;

    iput-object p1, p0, Lcn/d;->i:Lwm/s;

    iget-object p1, p0, Lcn/d;->g:Lwm/k;

    invoke-interface {p1}, Lwm/k;->l()V

    return-void
.end method

.method public final i(Lwm/j;Lt9/s;)I
    .locals 43

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lcn/d;->h:Lwm/s;

    invoke-static {v2}, Llo/a;->j(Ljava/lang/Object;)V

    sget v2, Llo/y;->a:I

    iget v2, v0, Lcn/d;->j:I

    iget-object v6, v0, Lcn/d;->c:Lt9/b0;

    const/4 v7, 0x0

    if-nez v2, :cond_0

    :try_start_0
    invoke-virtual {v0, v1, v7}, Lcn/d;->d(Lwm/j;Z)Z
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v11, v6

    const/4 v2, -0x1

    const/4 v7, -0x1

    const-wide/32 v16, 0xf4240

    goto/16 :goto_1b

    :cond_0
    :goto_0
    iget-object v2, v0, Lcn/d;->p:Lcn/f;

    const/4 v10, 0x1

    iget-object v12, v0, Lcn/d;->b:Led3/a;

    if-nez v2, :cond_24

    new-instance v2, Led3/a;

    iget v15, v6, Lt9/b0;->d:I

    invoke-direct {v2, v15}, Led3/a;-><init>(I)V

    iget-object v15, v2, Led3/a;->a:[B

    const-wide/32 v16, 0xf4240

    iget v3, v6, Lt9/b0;->d:I

    move-object v4, v1

    check-cast v4, Lwm/f;

    invoke-virtual {v4, v15, v7, v3, v7}, Lwm/f;->c([BIIZ)Z

    iget v3, v6, Lt9/b0;->b:I

    and-int/2addr v3, v10

    const/16 v4, 0x15

    const/16 v15, 0x24

    if-eqz v3, :cond_1

    iget v3, v6, Lt9/b0;->f:I

    if-eq v3, v10, :cond_3

    move v4, v15

    goto :goto_1

    :cond_1
    iget v3, v6, Lt9/b0;->f:I

    if-eq v3, v10, :cond_2

    goto :goto_1

    :cond_2
    const/16 v4, 0xd

    :cond_3
    :goto_1
    iget v3, v2, Led3/a;->c:I

    const/16 p2, 0x0

    add-int/lit8 v11, v4, 0x4

    const-wide/16 v18, 0x0

    const v13, 0x58696e67

    const v14, 0x56425249

    const v8, 0x496e666f

    if-lt v3, v11, :cond_4

    invoke-virtual {v2, v4}, Led3/a;->K(I)V

    invoke-virtual {v2}, Led3/a;->i()I

    move-result v3

    if-eq v3, v13, :cond_6

    if-ne v3, v8, :cond_4

    goto :goto_2

    :cond_4
    iget v3, v2, Led3/a;->c:I

    const/16 v9, 0x28

    if-lt v3, v9, :cond_5

    invoke-virtual {v2, v15}, Led3/a;->K(I)V

    invoke-virtual {v2}, Led3/a;->i()I

    move-result v3

    if-ne v3, v14, :cond_5

    move v3, v14

    goto :goto_2

    :cond_5
    move v3, v7

    :cond_6
    :goto_2
    iget-object v9, v0, Lcn/d;->d:Lwm/m;

    const-string v11, ", "

    const-wide/16 v22, -0x1

    if-eq v3, v13, :cond_7

    if-ne v3, v8, :cond_8

    :cond_7
    move-object/from16 v27, v2

    move-object v1, v11

    move-object v11, v6

    goto/16 :goto_9

    :cond_8
    if-ne v3, v14, :cond_12

    move-object v3, v1

    check-cast v3, Lwm/f;

    iget-wide v13, v3, Lwm/f;->y:J

    iget-wide v7, v3, Lwm/f;->z:J

    const/16 v4, 0xa

    invoke-virtual {v2, v4}, Led3/a;->L(I)V

    invoke-virtual {v2}, Led3/a;->i()I

    move-result v4

    if-gtz v4, :cond_9

    move-object/from16 v34, p2

    move-object v11, v6

    goto/16 :goto_8

    :cond_9
    iget v15, v6, Lt9/b0;->e:I

    move-object/from16 v32, v11

    int-to-long v10, v4

    const/16 v4, 0x7d00

    if-lt v15, v4, :cond_a

    const/16 v4, 0x480

    :goto_3
    move-object/from16 v33, v6

    goto :goto_4

    :cond_a
    const/16 v4, 0x240

    goto :goto_3

    :goto_4
    int-to-long v5, v4

    mul-long v28, v5, v16

    int-to-long v4, v15

    move-wide/from16 v30, v4

    move-wide/from16 v26, v10

    invoke-static/range {v26 .. v31}, Llo/y;->D(JJJ)J

    move-result-wide v37

    invoke-virtual {v2}, Led3/a;->D()I

    move-result v4

    invoke-virtual {v2}, Led3/a;->D()I

    move-result v5

    invoke-virtual {v2}, Led3/a;->D()I

    move-result v6

    const/4 v10, 0x2

    invoke-virtual {v2, v10}, Led3/a;->L(I)V

    move-object/from16 v11, v33

    iget v15, v11, Lt9/b0;->d:I

    int-to-long v10, v15

    add-long/2addr v10, v7

    new-array v15, v4, [J

    move-object/from16 v27, v2

    new-array v2, v4, [J

    move-object/from16 v36, v2

    const/4 v2, 0x0

    :goto_5
    if-ge v2, v4, :cond_f

    int-to-long v0, v2

    mul-long v0, v0, v37

    move-wide/from16 v28, v0

    int-to-long v0, v4

    div-long v0, v28, v0

    aput-wide v0, v15, v2

    invoke-static {v7, v8, v10, v11}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    aput-wide v0, v36, v2

    const/4 v0, 0x1

    if-eq v6, v0, :cond_e

    const/4 v0, 0x2

    if-eq v6, v0, :cond_d

    const/4 v1, 0x3

    if-eq v6, v1, :cond_c

    const/4 v1, 0x4

    if-eq v6, v1, :cond_b

    move-object/from16 v34, p2

    :goto_6
    move-object/from16 v11, v33

    goto :goto_8

    :cond_b
    invoke-virtual/range {v27 .. v27}, Led3/a;->B()I

    move-result v1

    goto :goto_7

    :cond_c
    invoke-virtual/range {v27 .. v27}, Led3/a;->A()I

    move-result v1

    goto :goto_7

    :cond_d
    invoke-virtual/range {v27 .. v27}, Led3/a;->D()I

    move-result v1

    goto :goto_7

    :cond_e
    const/4 v0, 0x2

    invoke-virtual/range {v27 .. v27}, Led3/a;->y()I

    move-result v1

    :goto_7
    mul-int/2addr v1, v5

    int-to-long v0, v1

    add-long/2addr v7, v0

    add-int/lit8 v2, v2, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    goto :goto_5

    :cond_f
    cmp-long v0, v13, v22

    if-eqz v0, :cond_10

    cmp-long v0, v13, v7

    if-eqz v0, :cond_10

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x43

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "VBRI data size mismatch: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "VbriSeeker"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_10
    new-instance v34, Lcn/g;

    move-wide/from16 v39, v7

    move-object/from16 v35, v15

    invoke-direct/range {v34 .. v40}, Lcn/g;-><init>([J[JJJ)V

    goto :goto_6

    :goto_8
    iget v0, v11, Lt9/b0;->d:I

    invoke-virtual {v3, v0}, Lwm/f;->n(I)V

    :cond_11
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    goto/16 :goto_e

    :cond_12
    move-object v11, v6

    move-object/from16 v0, p1

    check-cast v0, Lwm/f;

    const/4 v1, 0x0

    iput v1, v0, Lwm/f;->F:I

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v34, p2

    goto/16 :goto_e

    :goto_9
    move-object/from16 v0, p1

    check-cast v0, Lwm/f;

    iget-wide v5, v0, Lwm/f;->y:J

    iget-wide v13, v0, Lwm/f;->z:J

    iget v2, v11, Lt9/b0;->h:I

    iget v7, v11, Lt9/b0;->e:I

    invoke-virtual/range {v27 .. v27}, Led3/a;->i()I

    move-result v10

    and-int/lit8 v15, v10, 0x1

    const/4 v8, 0x1

    if-ne v15, v8, :cond_17

    invoke-virtual/range {v27 .. v27}, Led3/a;->B()I

    move-result v8

    if-nez v8, :cond_13

    goto/16 :goto_b

    :cond_13
    move-wide/from16 v28, v13

    int-to-long v13, v8

    move-wide/from16 v34, v13

    int-to-long v13, v2

    mul-long v36, v13, v16

    int-to-long v7, v7

    move-wide/from16 v38, v7

    invoke-static/range {v34 .. v39}, Llo/y;->D(JJJ)J

    move-result-wide v38

    const/4 v2, 0x6

    and-int/lit8 v7, v10, 0x6

    if-eq v7, v2, :cond_14

    new-instance v34, Lcn/h;

    iget v1, v11, Lt9/b0;->d:I

    const-wide/16 v40, -0x1

    const/16 v42, 0x0

    move/from16 v37, v1

    move-wide/from16 v35, v28

    invoke-direct/range {v34 .. v42}, Lcn/h;-><init>(JIJJ[J)V

    goto :goto_c

    :cond_14
    move-wide/from16 v35, v28

    invoke-virtual/range {v27 .. v27}, Led3/a;->z()J

    move-result-wide v40

    const/16 v2, 0x64

    new-array v7, v2, [J

    const/4 v8, 0x0

    :goto_a
    if-ge v8, v2, :cond_15

    invoke-virtual/range {v27 .. v27}, Led3/a;->y()I

    move-result v10

    int-to-long v13, v10

    aput-wide v13, v7, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_a

    :cond_15
    cmp-long v2, v5, v22

    if-eqz v2, :cond_16

    add-long v13, v35, v40

    cmp-long v2, v5, v13

    if-eqz v2, :cond_16

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v8, 0x43

    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v8, "XING data size mismatch: "

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "XingSeeker"

    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_16
    new-instance v34, Lcn/h;

    iget v1, v11, Lt9/b0;->d:I

    move/from16 v37, v1

    move-object/from16 v42, v7

    invoke-direct/range {v34 .. v42}, Lcn/h;-><init>(JIJJ[J)V

    goto :goto_c

    :cond_17
    :goto_b
    move-object/from16 v34, p2

    :goto_c
    if-eqz v34, :cond_1a

    iget v1, v9, Lwm/m;->a:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_18

    iget v1, v9, Lwm/m;->b:I

    if-eq v1, v2, :cond_18

    goto :goto_d

    :cond_18
    const/4 v1, 0x0

    iput v1, v0, Lwm/f;->F:I

    add-int/lit16 v4, v4, 0x8d

    invoke-virtual {v0, v4, v1}, Lwm/f;->a(IZ)Z

    iget-object v2, v12, Led3/a;->a:[B

    const/4 v4, 0x3

    invoke-virtual {v0, v2, v1, v4, v1}, Lwm/f;->c([BIIZ)Z

    invoke-virtual {v12, v1}, Led3/a;->K(I)V

    invoke-virtual {v12}, Led3/a;->A()I

    move-result v1

    shr-int/lit8 v2, v1, 0xc

    and-int/lit16 v1, v1, 0xfff

    if-gtz v2, :cond_19

    if-lez v1, :cond_1a

    :cond_19
    iput v2, v9, Lwm/m;->a:I

    iput v1, v9, Lwm/m;->b:I

    :cond_1a
    :goto_d
    iget v1, v11, Lt9/b0;->d:I

    invoke-virtual {v0, v1}, Lwm/f;->n(I)V

    if-eqz v34, :cond_11

    invoke-virtual/range {v34 .. v34}, Lcn/h;->e()Z

    move-result v0

    if-nez v0, :cond_11

    const v0, 0x496e666f

    if-ne v3, v0, :cond_11

    const/4 v2, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0, v1, v2}, Lcn/d;->a(Lwm/j;Z)Lcn/a;

    move-result-object v34

    :goto_e
    iget-object v2, v0, Lcn/d;->k:Lin/c;

    move-object v3, v1

    check-cast v3, Lwm/f;

    iget-wide v4, v3, Lwm/f;->z:J

    if-eqz v2, :cond_1f

    iget-object v6, v2, Lin/c;->w:[Lin/b;

    array-length v7, v6

    const/4 v8, 0x0

    :goto_f
    if-ge v8, v7, :cond_1f

    aget-object v10, v6, v8

    instance-of v13, v10, Lnn/k;

    if-eqz v13, :cond_1e

    check-cast v10, Lnn/k;

    iget-object v6, v10, Lnn/k;->E:[I

    if-eqz v2, :cond_1c

    iget-object v2, v2, Lin/c;->w:[Lin/b;

    array-length v7, v2

    const/4 v8, 0x0

    :goto_10
    if-ge v8, v7, :cond_1c

    aget-object v13, v2, v8

    instance-of v14, v13, Lnn/m;

    if-eqz v14, :cond_1b

    check-cast v13, Lnn/m;

    iget-object v14, v13, Lnn/i;->w:Ljava/lang/String;

    const-string v15, "TLEN"

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_1b

    iget-object v2, v13, Lnn/m;->y:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v7

    invoke-static {v7, v8}, Llo/y;->z(J)J

    move-result-wide v7

    goto :goto_11

    :cond_1b
    add-int/lit8 v8, v8, 0x1

    goto :goto_10

    :cond_1c
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    :goto_11
    array-length v2, v6

    add-int/lit8 v13, v2, 0x1

    new-array v14, v13, [J

    new-array v13, v13, [J

    const/16 v24, 0x0

    aput-wide v4, v14, v24

    aput-wide v18, v13, v24

    move-wide/from16 v22, v4

    move-wide/from16 v25, v18

    const/4 v4, 0x1

    :goto_12
    if-gt v4, v2, :cond_1d

    iget v5, v10, Lnn/k;->y:I

    add-int/lit8 v15, v4, -0x1

    aget v27, v6, v15

    add-int v5, v5, v27

    move/from16 v27, v4

    int-to-long v4, v5

    add-long v22, v22, v4

    iget v4, v10, Lnn/k;->z:I

    iget-object v5, v10, Lnn/k;->F:[I

    aget v5, v5, v15

    add-int/2addr v4, v5

    int-to-long v4, v4

    add-long v25, v25, v4

    aput-wide v22, v14, v27

    aput-wide v25, v13, v27

    add-int/lit8 v4, v27, 0x1

    goto :goto_12

    :cond_1d
    new-instance v2, Lcn/c;

    invoke-direct {v2, v7, v8, v14, v13}, Lcn/c;-><init>(J[J[J)V

    goto :goto_13

    :cond_1e
    add-int/lit8 v8, v8, 0x1

    goto :goto_f

    :cond_1f
    move-object/from16 v2, p2

    :goto_13
    iget-boolean v4, v0, Lcn/d;->q:Z

    if-eqz v4, :cond_20

    new-instance v2, Lcn/e;

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v2, v4, v5}, Lwm/l;-><init>(J)V

    goto :goto_15

    :cond_20
    if-eqz v2, :cond_21

    move-object/from16 v34, v2

    goto :goto_14

    :cond_21
    if-eqz v34, :cond_22

    goto :goto_14

    :cond_22
    move-object/from16 v34, p2

    :goto_14
    if-eqz v34, :cond_23

    invoke-interface/range {v34 .. v34}, Lwm/p;->e()Z

    move-object/from16 v2, v34

    goto :goto_15

    :cond_23
    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcn/d;->a(Lwm/j;Z)Lcn/a;

    move-result-object v4

    move-object v2, v4

    :goto_15
    iput-object v2, v0, Lcn/d;->p:Lcn/f;

    iget-object v4, v0, Lcn/d;->g:Lwm/k;

    invoke-interface {v4, v2}, Lwm/k;->x(Lwm/p;)V

    iget-object v2, v0, Lcn/d;->i:Lwm/s;

    new-instance v4, Lrm/b0;

    invoke-direct {v4}, Lrm/b0;-><init>()V

    iget-object v5, v11, Lt9/b0;->c:Ljava/lang/String;

    iput-object v5, v4, Lrm/b0;->k:Ljava/lang/String;

    const/16 v5, 0x1000

    iput v5, v4, Lrm/b0;->l:I

    iget v5, v11, Lt9/b0;->f:I

    iput v5, v4, Lrm/b0;->x:I

    iget v5, v11, Lt9/b0;->e:I

    iput v5, v4, Lrm/b0;->y:I

    iget v5, v9, Lwm/m;->a:I

    iput v5, v4, Lrm/b0;->A:I

    iget v5, v9, Lwm/m;->b:I

    iput v5, v4, Lrm/b0;->B:I

    iget-object v5, v0, Lcn/d;->k:Lin/c;

    iput-object v5, v4, Lrm/b0;->i:Lin/c;

    new-instance v5, Lrm/c0;

    invoke-direct {v5, v4}, Lrm/c0;-><init>(Lrm/b0;)V

    invoke-interface {v2, v5}, Lwm/s;->a(Lrm/c0;)V

    iget-wide v2, v3, Lwm/f;->z:J

    iput-wide v2, v0, Lcn/d;->n:J

    goto :goto_16

    :cond_24
    move-object v11, v6

    const/16 p2, 0x0

    const-wide/32 v16, 0xf4240

    const-wide/16 v18, 0x0

    iget-wide v2, v0, Lcn/d;->n:J

    cmp-long v4, v2, v18

    if-eqz v4, :cond_25

    move-object v4, v1

    check-cast v4, Lwm/f;

    iget-wide v4, v4, Lwm/f;->z:J

    cmp-long v6, v4, v2

    if-gez v6, :cond_25

    sub-long/2addr v2, v4

    long-to-int v2, v2

    move-object v3, v1

    check-cast v3, Lwm/f;

    invoke-virtual {v3, v2}, Lwm/f;->n(I)V

    :cond_25
    :goto_16
    iget v2, v0, Lcn/d;->o:I

    if-nez v2, :cond_2a

    move-object v2, v1

    check-cast v2, Lwm/f;

    const/4 v3, 0x0

    iput v3, v2, Lwm/f;->F:I

    invoke-virtual/range {p0 .. p1}, Lcn/d;->c(Lwm/j;)Z

    move-result v2

    if-eqz v2, :cond_26

    goto/16 :goto_1a

    :cond_26
    invoke-virtual {v12, v3}, Led3/a;->K(I)V

    invoke-virtual {v12}, Led3/a;->i()I

    move-result v2

    iget v3, v0, Lcn/d;->j:I

    int-to-long v3, v3

    const v5, -0x1f400

    and-int/2addr v5, v2

    int-to-long v5, v5

    const-wide/32 v7, -0x1f400

    and-long/2addr v3, v7

    cmp-long v3, v5, v3

    if-nez v3, :cond_27

    invoke-static {v2}, Ltm/a;->d(I)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_28

    :cond_27
    const/4 v2, 0x0

    goto :goto_17

    :cond_28
    invoke-virtual {v11, v2}, Lt9/b0;->a(I)Z

    iget-wide v2, v0, Lcn/d;->l:J

    const-wide v20, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v2, v20

    if-nez v2, :cond_29

    iget-object v2, v0, Lcn/d;->p:Lcn/f;

    move-object v3, v1

    check-cast v3, Lwm/f;

    iget-wide v3, v3, Lwm/f;->z:J

    invoke-interface {v2, v3, v4}, Lcn/f;->a(J)J

    move-result-wide v2

    iput-wide v2, v0, Lcn/d;->l:J

    iget-wide v2, v0, Lcn/d;->a:J

    cmp-long v4, v2, v20

    if-eqz v4, :cond_29

    iget-object v4, v0, Lcn/d;->p:Lcn/f;

    move-wide/from16 v5, v18

    invoke-interface {v4, v5, v6}, Lcn/f;->a(J)J

    move-result-wide v4

    iget-wide v6, v0, Lcn/d;->l:J

    sub-long/2addr v2, v4

    add-long/2addr v2, v6

    iput-wide v2, v0, Lcn/d;->l:J

    :cond_29
    iget v2, v11, Lt9/b0;->d:I

    iput v2, v0, Lcn/d;->o:I

    iget-object v2, v0, Lcn/d;->p:Lcn/f;

    instance-of v3, v2, Lcn/b;

    if-eqz v3, :cond_2a

    check-cast v2, Lcn/b;

    iget-wide v3, v0, Lcn/d;->m:J

    iget v5, v11, Lt9/b0;->h:I

    int-to-long v5, v5

    add-long/2addr v3, v5

    iget-wide v5, v0, Lcn/d;->l:J

    mul-long v3, v3, v16

    iget v7, v11, Lt9/b0;->e:I

    int-to-long v7, v7

    div-long/2addr v3, v7

    add-long/2addr v3, v5

    move-object v5, v1

    check-cast v5, Lwm/f;

    iget-wide v5, v5, Lwm/f;->z:J

    invoke-virtual {v2, v3, v4}, Lcn/b;->b(J)Z

    move-result v3

    if-eqz v3, :cond_2b

    iget-boolean v3, v0, Lcn/d;->r:Z

    if-eqz v3, :cond_2a

    iget-wide v3, v0, Lcn/d;->s:J

    invoke-virtual {v2, v3, v4}, Lcn/b;->b(J)Z

    move-result v2

    if-eqz v2, :cond_2a

    const/4 v2, 0x0

    iput-boolean v2, v0, Lcn/d;->r:Z

    iget-object v3, v0, Lcn/d;->h:Lwm/s;

    iput-object v3, v0, Lcn/d;->i:Lwm/s;

    :cond_2a
    const/4 v8, 0x1

    goto :goto_19

    :cond_2b
    throw p2

    :goto_17
    check-cast v1, Lwm/f;

    const/4 v8, 0x1

    invoke-virtual {v1, v8}, Lwm/f;->n(I)V

    iput v2, v0, Lcn/d;->j:I

    :goto_18
    const/4 v2, -0x1

    const/4 v7, 0x0

    goto :goto_1b

    :goto_19
    iget-object v2, v0, Lcn/d;->i:Lwm/s;

    iget v3, v0, Lcn/d;->o:I

    invoke-interface {v2, v1, v3, v8}, Lwm/s;->b(Lko/i;IZ)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_2c

    :goto_1a
    const/4 v2, -0x1

    const/4 v7, -0x1

    goto :goto_1b

    :cond_2c
    iget v2, v0, Lcn/d;->o:I

    sub-int/2addr v2, v1

    iput v2, v0, Lcn/d;->o:I

    if-lez v2, :cond_2d

    goto :goto_18

    :cond_2d
    iget-object v3, v0, Lcn/d;->i:Lwm/s;

    iget-wide v1, v0, Lcn/d;->m:J

    iget-wide v4, v0, Lcn/d;->l:J

    mul-long v1, v1, v16

    iget v6, v11, Lt9/b0;->e:I

    int-to-long v6, v6

    div-long/2addr v1, v6

    add-long/2addr v4, v1

    iget v7, v11, Lt9/b0;->d:I

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v6, 0x1

    invoke-interface/range {v3 .. v9}, Lwm/s;->d(JIIILwm/r;)V

    iget-wide v1, v0, Lcn/d;->m:J

    iget v3, v11, Lt9/b0;->h:I

    int-to-long v3, v3

    add-long/2addr v1, v3

    iput-wide v1, v0, Lcn/d;->m:J

    const/4 v2, 0x0

    iput v2, v0, Lcn/d;->o:I

    move v7, v2

    const/4 v2, -0x1

    :goto_1b
    if-ne v7, v2, :cond_2e

    iget-object v1, v0, Lcn/d;->p:Lcn/f;

    instance-of v2, v1, Lcn/b;

    if-eqz v2, :cond_2e

    iget-wide v2, v0, Lcn/d;->m:J

    iget-wide v4, v0, Lcn/d;->l:J

    mul-long v2, v2, v16

    iget v6, v11, Lt9/b0;->e:I

    int-to-long v8, v6

    div-long/2addr v2, v8

    add-long/2addr v2, v4

    invoke-interface {v1}, Lwm/p;->f()J

    move-result-wide v4

    cmp-long v1, v4, v2

    if-eqz v1, :cond_2e

    iget-object v1, v0, Lcn/d;->p:Lcn/f;

    move-object v2, v1

    check-cast v2, Lcn/b;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v0, Lcn/d;->g:Lwm/k;

    invoke-interface {v2, v1}, Lwm/k;->x(Lwm/p;)V

    :cond_2e
    return v7
.end method

.method public final release()V
    .locals 0

    return-void
.end method
