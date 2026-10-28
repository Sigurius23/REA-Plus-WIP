.class public final Len/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwm/i;


# instance fields
.field public a:Lwm/k;

.field public b:Len/h;

.field public c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final a(Lwm/j;)Z
    .locals 8

    new-instance v0, Len/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Len/e;-><init>(I)V

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Len/e;->b(Lwm/j;Z)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    iget v2, v0, Len/e;->a:I

    const/4 v4, 0x2

    and-int/2addr v2, v4

    if-eq v2, v4, :cond_0

    goto :goto_2

    :cond_0
    iget v0, v0, Len/e;->e:I

    const/16 v2, 0x8

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    new-instance v2, Led3/a;

    invoke-direct {v2, v0}, Led3/a;-><init>(I)V

    iget-object v4, v2, Led3/a;->a:[B

    invoke-interface {p1, v4, v3, v0}, Lwm/j;->p([BII)V

    invoke-virtual {v2, v3}, Led3/a;->K(I)V

    invoke-virtual {v2}, Led3/a;->a()I

    move-result p1

    const/4 v0, 0x5

    if-lt p1, v0, :cond_1

    invoke-virtual {v2}, Led3/a;->y()I

    move-result p1

    const/16 v0, 0x7f

    if-ne p1, v0, :cond_1

    invoke-virtual {v2}, Led3/a;->z()J

    move-result-wide v4

    const-wide/32 v6, 0x464c4143

    cmp-long p1, v4, v6

    if-nez p1, :cond_1

    new-instance p1, Len/c;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Len/h;-><init>(I)V

    iput-object p1, p0, Len/d;->b:Len/h;

    return v1

    :cond_1
    invoke-virtual {v2, v3}, Led3/a;->K(I)V

    :try_start_0
    invoke-static {v1, v2, v1}, Ls40/e0;->k(ILed3/a;Z)Z

    move-result p1
    :try_end_0
    .catch Lcom/google/android/exoplayer2/ParserException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move p1, v3

    :goto_0
    if-eqz p1, :cond_2

    new-instance p1, Len/i;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Len/h;-><init>(I)V

    iput-object p1, p0, Len/d;->b:Len/h;

    goto :goto_1

    :cond_2
    invoke-virtual {v2, v3}, Led3/a;->K(I)V

    sget-object p1, Len/g;->o:[B

    invoke-static {v2, p1}, Len/g;->g(Led3/a;[B)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Len/g;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Len/h;-><init>(I)V

    iput-object p1, p0, Len/d;->b:Len/h;

    :goto_1
    return v1

    :cond_3
    :goto_2
    return v3
.end method

.method public final b(JJ)V
    .locals 6

    iget-object v0, p0, Len/d;->b:Len/h;

    if-eqz v0, :cond_1

    iget-object v1, v0, Len/h;->j:Ljava/lang/Object;

    check-cast v1, Led3/o;

    iget-object v2, v1, Led3/o;->e:Ljava/lang/Object;

    check-cast v2, Len/e;

    const/4 v3, 0x0

    iput v3, v2, Len/e;->a:I

    const-wide/16 v4, 0x0

    iput-wide v4, v2, Len/e;->b:J

    iput v3, v2, Len/e;->c:I

    iput v3, v2, Len/e;->d:I

    iput v3, v2, Len/e;->e:I

    iget-object v2, v1, Led3/o;->f:Ljava/lang/Object;

    check-cast v2, Led3/a;

    invoke-virtual {v2, v3}, Led3/a;->H(I)V

    const/4 v2, -0x1

    iput v2, v1, Led3/o;->b:I

    iput-boolean v3, v1, Led3/o;->d:Z

    cmp-long p1, p1, v4

    if-nez p1, :cond_0

    iget-boolean p1, v0, Len/h;->h:Z

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {v0, p1}, Len/h;->f(Z)V

    return-void

    :cond_0
    iget p1, v0, Len/h;->e:I

    if-eqz p1, :cond_1

    iget p1, v0, Len/h;->f:I

    int-to-long p1, p1

    mul-long/2addr p1, p3

    const-wide/32 p3, 0xf4240

    div-long/2addr p1, p3

    iput-wide p1, v0, Len/h;->b:J

    iget-object p3, v0, Len/h;->m:Ljava/lang/Object;

    check-cast p3, Len/f;

    sget p4, Llo/y;->a:I

    invoke-interface {p3, p1, p2}, Len/f;->e(J)V

    const/4 p1, 0x2

    iput p1, v0, Len/h;->e:I

    :cond_1
    return-void
.end method

.method public final g(Lwm/j;)Z
    .locals 0

    :try_start_0
    invoke-virtual {p0, p1}, Len/d;->a(Lwm/j;)Z

    move-result p1
    :try_end_0
    .catch Lcom/google/android/exoplayer2/ParserException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method

.method public final h(Lwm/k;)V
    .locals 0

    iput-object p1, p0, Len/d;->a:Lwm/k;

    return-void
.end method

.method public final i(Lwm/j;Lt9/s;)I
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Len/d;->a:Lwm/k;

    invoke-static {v2}, Llo/a;->j(Ljava/lang/Object;)V

    iget-object v2, v0, Len/d;->b:Len/h;

    const/4 v3, 0x0

    if-nez v2, :cond_1

    invoke-virtual/range {p0 .. p1}, Len/d;->a(Lwm/j;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lwm/f;

    iput v3, v2, Lwm/f;->F:I

    goto :goto_0

    :cond_0
    const-string v1, "Failed to determine bitstream type"

    const/4 v2, 0x0

    invoke-static {v2, v1}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object v1

    throw v1

    :cond_1
    :goto_0
    iget-boolean v2, v0, Len/d;->c:Z

    const/4 v4, 0x1

    if-nez v2, :cond_2

    iget-object v2, v0, Len/d;->a:Lwm/k;

    invoke-interface {v2, v3, v4}, Lwm/k;->o(II)Lwm/s;

    move-result-object v2

    iget-object v5, v0, Len/d;->a:Lwm/k;

    invoke-interface {v5}, Lwm/k;->l()V

    iget-object v5, v0, Len/d;->b:Len/h;

    iget-object v6, v0, Len/d;->a:Lwm/k;

    iput-object v6, v5, Len/h;->l:Ljava/lang/Object;

    iput-object v2, v5, Len/h;->k:Ljava/lang/Object;

    invoke-virtual {v5, v4}, Len/h;->f(Z)V

    iput-boolean v4, v0, Len/d;->c:Z

    :cond_2
    iget-object v8, v0, Len/d;->b:Len/h;

    iget-object v2, v8, Len/h;->j:Ljava/lang/Object;

    check-cast v2, Led3/o;

    iget-object v5, v8, Len/h;->k:Ljava/lang/Object;

    check-cast v5, Lwm/s;

    invoke-static {v5}, Llo/a;->j(Ljava/lang/Object;)V

    sget v5, Llo/y;->a:I

    iget v5, v8, Len/h;->e:I

    const-wide/16 v6, -0x1

    const/4 v9, -0x1

    const/4 v10, 0x3

    const/4 v11, 0x2

    if-eqz v5, :cond_c

    if-eq v5, v4, :cond_b

    if-eq v5, v11, :cond_4

    if-ne v5, v10, :cond_3

    return v9

    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :cond_4
    iget-object v5, v8, Len/h;->m:Ljava/lang/Object;

    check-cast v5, Len/f;

    invoke-interface {v5, v1}, Len/f;->k(Lwm/j;)J

    move-result-wide v11

    const-wide/16 v13, 0x0

    cmp-long v5, v11, v13

    if-ltz v5, :cond_5

    move-object/from16 v5, p2

    iput-wide v11, v5, Lt9/s;->a:J

    return v4

    :cond_5
    cmp-long v5, v11, v6

    if-gez v5, :cond_6

    const-wide/16 v15, 0x2

    add-long/2addr v11, v15

    neg-long v11, v11

    invoke-virtual {v8, v11, v12}, Len/h;->a(J)V

    :cond_6
    iget-boolean v5, v8, Len/h;->h:Z

    if-nez v5, :cond_7

    iget-object v5, v8, Len/h;->m:Ljava/lang/Object;

    check-cast v5, Len/f;

    invoke-interface {v5}, Len/f;->d()Lwm/p;

    move-result-object v5

    invoke-static {v5}, Llo/a;->j(Ljava/lang/Object;)V

    iget-object v11, v8, Len/h;->l:Ljava/lang/Object;

    check-cast v11, Lwm/k;

    invoke-interface {v11, v5}, Lwm/k;->x(Lwm/p;)V

    iput-boolean v4, v8, Len/h;->h:Z

    :cond_7
    iget-wide v4, v8, Len/h;->g:J

    cmp-long v4, v4, v13

    if-gtz v4, :cond_9

    invoke-virtual {v2, v1}, Led3/o;->h(Lwm/j;)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_1

    :cond_8
    iput v10, v8, Len/h;->e:I

    return v9

    :cond_9
    :goto_1
    iput-wide v13, v8, Len/h;->g:J

    iget-object v1, v2, Led3/o;->f:Ljava/lang/Object;

    check-cast v1, Led3/a;

    invoke-virtual {v8, v1}, Len/h;->b(Led3/a;)J

    move-result-wide v4

    cmp-long v2, v4, v13

    if-ltz v2, :cond_a

    iget-wide v9, v8, Len/h;->d:J

    add-long v11, v9, v4

    iget-wide v13, v8, Len/h;->b:J

    cmp-long v2, v11, v13

    if-ltz v2, :cond_a

    const-wide/32 v11, 0xf4240

    mul-long/2addr v9, v11

    iget v2, v8, Len/h;->f:I

    int-to-long v11, v2

    div-long v14, v9, v11

    iget-object v2, v8, Len/h;->k:Ljava/lang/Object;

    check-cast v2, Lwm/s;

    iget v9, v1, Led3/a;->c:I

    invoke-interface {v2, v9, v1}, Lwm/s;->c(ILed3/a;)V

    iget-object v2, v8, Len/h;->k:Ljava/lang/Object;

    move-object v13, v2

    check-cast v13, Lwm/s;

    iget v1, v1, Led3/a;->c:I

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v16, 0x1

    move/from16 v17, v1

    invoke-interface/range {v13 .. v19}, Lwm/s;->d(JIIILwm/r;)V

    iput-wide v6, v8, Len/h;->b:J

    :cond_a
    iget-wide v1, v8, Len/h;->d:J

    add-long/2addr v1, v4

    iput-wide v1, v8, Len/h;->d:J

    return v3

    :cond_b
    iget-wide v4, v8, Len/h;->c:J

    long-to-int v2, v4

    check-cast v1, Lwm/f;

    invoke-virtual {v1, v2}, Lwm/f;->n(I)V

    iput v11, v8, Len/h;->e:I

    return v3

    :cond_c
    :goto_2
    invoke-virtual {v2, v1}, Led3/o;->h(Lwm/j;)Z

    move-result v5

    iget-object v12, v2, Led3/o;->f:Ljava/lang/Object;

    check-cast v12, Led3/a;

    if-nez v5, :cond_d

    iput v10, v8, Len/h;->e:I

    return v9

    :cond_d
    move-object v5, v1

    check-cast v5, Lwm/f;

    iget-wide v13, v5, Lwm/f;->z:J

    move-wide v15, v6

    iget-wide v6, v8, Len/h;->c:J

    sub-long/2addr v13, v6

    iput-wide v13, v8, Len/h;->g:J

    iget-object v5, v8, Len/h;->n:Ljava/lang/Object;

    check-cast v5, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v8, v12, v6, v7, v5}, Len/h;->d(Led3/a;JLio/sentry/internal/debugmeta/c;)Z

    move-result v5

    if-eqz v5, :cond_e

    move-object v5, v1

    check-cast v5, Lwm/f;

    iget-wide v5, v5, Lwm/f;->z:J

    iput-wide v5, v8, Len/h;->c:J

    move-wide v6, v15

    goto :goto_2

    :cond_e
    iget-object v5, v8, Len/h;->n:Ljava/lang/Object;

    check-cast v5, Lio/sentry/internal/debugmeta/c;

    iget-object v5, v5, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v5, Lrm/c0;

    iget v6, v5, Lrm/c0;->Z:I

    iput v6, v8, Len/h;->f:I

    iget-boolean v6, v8, Len/h;->i:Z

    if-nez v6, :cond_f

    iget-object v6, v8, Len/h;->k:Ljava/lang/Object;

    check-cast v6, Lwm/s;

    invoke-interface {v6, v5}, Lwm/s;->a(Lrm/c0;)V

    iput-boolean v4, v8, Len/h;->i:Z

    :cond_f
    iget-object v5, v8, Len/h;->n:Ljava/lang/Object;

    check-cast v5, Lio/sentry/internal/debugmeta/c;

    iget-object v5, v5, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v5, Lai/h;

    if-eqz v5, :cond_10

    iput-object v5, v8, Len/h;->m:Ljava/lang/Object;

    :goto_3
    move v2, v11

    move-object v1, v12

    goto :goto_5

    :cond_10
    check-cast v1, Lwm/f;

    iget-wide v5, v1, Lwm/f;->y:J

    cmp-long v1, v5, v15

    if-nez v1, :cond_11

    new-instance v1, Lkr/e;

    const/16 v2, 0x1b

    invoke-direct {v1, v2}, Lkr/e;-><init>(I)V

    iput-object v1, v8, Len/h;->m:Ljava/lang/Object;

    goto :goto_3

    :cond_11
    iget-object v1, v2, Led3/o;->e:Ljava/lang/Object;

    check-cast v1, Len/e;

    iget v2, v1, Len/e;->a:I

    and-int/lit8 v2, v2, 0x4

    if-eqz v2, :cond_12

    move/from16 v17, v4

    goto :goto_4

    :cond_12
    move/from16 v17, v3

    :goto_4
    new-instance v7, Len/b;

    iget-wide v9, v8, Len/h;->c:J

    iget v2, v1, Len/e;->d:I

    iget v4, v1, Len/e;->e:I

    add-int/2addr v2, v4

    int-to-long v13, v2

    iget-wide v1, v1, Len/e;->b:J

    move-wide v15, v1

    move v2, v11

    move-object v1, v12

    move-wide v11, v5

    invoke-direct/range {v7 .. v17}, Len/b;-><init>(Len/h;JJJJZ)V

    iput-object v7, v8, Len/h;->m:Ljava/lang/Object;

    :goto_5
    iput v2, v8, Len/h;->e:I

    iget-object v2, v1, Led3/a;->a:[B

    array-length v4, v2

    const v5, 0xfe01

    if-ne v4, v5, :cond_13

    return v3

    :cond_13
    iget v4, v1, Led3/a;->c:I

    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v2

    iget v4, v1, Led3/a;->c:I

    invoke-virtual {v1, v4, v2}, Led3/a;->I(I[B)V

    return v3
.end method

.method public final release()V
    .locals 0

    return-void
.end method
