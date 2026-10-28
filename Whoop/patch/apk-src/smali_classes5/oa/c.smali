.class public final Loa/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/n;


# instance fields
.field public a:Lt9/q;

.field public b:Len/h;

.field public c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lt9/o;)Z
    .locals 8

    new-instance v0, Len/e;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Len/e;-><init>(I)V

    invoke-virtual {v0, p1, v1}, Len/e;->a(Lt9/o;Z)Z

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

    new-instance v2, Lx8/n;

    invoke-direct {v2, v0}, Lx8/n;-><init>(I)V

    iget-object v4, v2, Lx8/n;->a:[B

    invoke-interface {p1, v4, v3, v0}, Lt9/o;->p([BII)V

    invoke-virtual {v2, v3}, Lx8/n;->F(I)V

    invoke-virtual {v2}, Lx8/n;->a()I

    move-result p1

    const/4 v0, 0x5

    if-lt p1, v0, :cond_1

    invoke-virtual {v2}, Lx8/n;->t()I

    move-result p1

    const/16 v0, 0x7f

    if-ne p1, v0, :cond_1

    invoke-virtual {v2}, Lx8/n;->v()J

    move-result-wide v4

    const-wide/32 v6, 0x464c4143

    cmp-long p1, v4, v6

    if-nez p1, :cond_1

    new-instance p1, Loa/b;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Len/h;-><init>(I)V

    iput-object p1, p0, Loa/c;->b:Len/h;

    return v1

    :cond_1
    invoke-virtual {v2, v3}, Lx8/n;->F(I)V

    :try_start_0
    invoke-static {v1, v2, v1}, Lt9/a;->w(ILx8/n;Z)Z

    move-result p1
    :try_end_0
    .catch Landroidx/media3/common/ParserException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move p1, v3

    :goto_0
    if-eqz p1, :cond_2

    new-instance p1, Loa/f;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Len/h;-><init>(I)V

    iput-object p1, p0, Loa/c;->b:Len/h;

    goto :goto_1

    :cond_2
    invoke-virtual {v2, v3}, Lx8/n;->F(I)V

    sget-object p1, Loa/e;->p:[B

    invoke-static {v2, p1}, Loa/e;->g(Lx8/n;[B)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Loa/e;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Len/h;-><init>(I)V

    iput-object p1, p0, Loa/c;->b:Len/h;

    :goto_1
    return v1

    :cond_3
    :goto_2
    return v3
.end method

.method public final b(JJ)V
    .locals 6

    iget-object v0, p0, Loa/c;->b:Len/h;

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

    check-cast v2, Lx8/n;

    invoke-virtual {v2, v3}, Lx8/n;->C(I)V

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

    check-cast p3, Loa/d;

    sget p4, Lx8/t;->a:I

    invoke-interface {p3, p1, p2}, Loa/d;->e(J)V

    const/4 p1, 0x2

    iput p1, v0, Len/h;->e:I

    :cond_1
    return-void
.end method

.method public final g(Lt9/q;)V
    .locals 0

    iput-object p1, p0, Loa/c;->a:Lt9/q;

    return-void
.end method

.method public final h(Lt9/o;)Z
    .locals 0

    :try_start_0
    invoke-virtual {p0, p1}, Loa/c;->a(Lt9/o;)Z

    move-result p1
    :try_end_0
    .catch Landroidx/media3/common/ParserException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method

.method public final i(Lt9/o;Lt9/s;)I
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Loa/c;->a:Lt9/q;

    invoke-static {v2}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-object v2, v0, Loa/c;->b:Len/h;

    if-nez v2, :cond_1

    invoke-virtual/range {p0 .. p1}, Loa/c;->a(Lt9/o;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Lt9/o;->e()V

    goto :goto_0

    :cond_0
    const-string v1, "Failed to determine bitstream type"

    const/4 v2, 0x0

    invoke-static {v2, v1}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v1

    throw v1

    :cond_1
    :goto_0
    iget-boolean v2, v0, Loa/c;->c:Z

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_2

    iget-object v2, v0, Loa/c;->a:Lt9/q;

    invoke-interface {v2, v3, v4}, Lt9/q;->o(II)Lt9/k0;

    move-result-object v2

    iget-object v5, v0, Loa/c;->a:Lt9/q;

    invoke-interface {v5}, Lt9/q;->l()V

    iget-object v5, v0, Loa/c;->b:Len/h;

    iget-object v6, v0, Loa/c;->a:Lt9/q;

    iput-object v6, v5, Len/h;->l:Ljava/lang/Object;

    iput-object v2, v5, Len/h;->k:Ljava/lang/Object;

    invoke-virtual {v5, v4}, Len/h;->f(Z)V

    iput-boolean v4, v0, Loa/c;->c:Z

    :cond_2
    iget-object v8, v0, Loa/c;->b:Len/h;

    iget-object v2, v8, Len/h;->j:Ljava/lang/Object;

    check-cast v2, Led3/o;

    iget-object v5, v8, Len/h;->k:Ljava/lang/Object;

    check-cast v5, Lt9/k0;

    invoke-static {v5}, Lva3/g;->j(Ljava/lang/Object;)V

    sget v5, Lx8/t;->a:I

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

    check-cast v5, Loa/d;

    invoke-interface {v5, v1}, Loa/d;->j(Lt9/o;)J

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

    check-cast v5, Loa/d;

    invoke-interface {v5}, Loa/d;->d()Lt9/e0;

    move-result-object v5

    invoke-static {v5}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-object v11, v8, Len/h;->l:Ljava/lang/Object;

    check-cast v11, Lt9/q;

    invoke-interface {v11, v5}, Lt9/q;->v(Lt9/e0;)V

    iget-object v11, v8, Len/h;->k:Ljava/lang/Object;

    check-cast v11, Lt9/k0;

    invoke-interface {v5}, Lt9/e0;->f()J

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-boolean v4, v8, Len/h;->h:Z

    :cond_7
    iget-wide v4, v8, Len/h;->g:J

    cmp-long v4, v4, v13

    if-gtz v4, :cond_9

    invoke-virtual {v2, v1}, Led3/o;->g(Lt9/o;)Z

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

    check-cast v1, Lx8/n;

    invoke-virtual {v8, v1}, Len/h;->c(Lx8/n;)J

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

    check-cast v2, Lt9/k0;

    iget v9, v1, Lx8/n;->c:I

    invoke-interface {v2, v1, v9, v3}, Lt9/k0;->d(Lx8/n;II)V

    iget-object v2, v8, Len/h;->k:Ljava/lang/Object;

    move-object v13, v2

    check-cast v13, Lt9/k0;

    iget v1, v1, Lx8/n;->c:I

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v16, 0x1

    move/from16 v17, v1

    invoke-interface/range {v13 .. v19}, Lt9/k0;->b(JIIILt9/j0;)V

    iput-wide v6, v8, Len/h;->b:J

    :cond_a
    iget-wide v1, v8, Len/h;->d:J

    add-long/2addr v1, v4

    iput-wide v1, v8, Len/h;->d:J

    return v3

    :cond_b
    iget-wide v4, v8, Len/h;->c:J

    long-to-int v2, v4

    invoke-interface {v1, v2}, Lt9/o;->n(I)V

    iput v11, v8, Len/h;->e:I

    return v3

    :cond_c
    :goto_2
    invoke-virtual {v2, v1}, Led3/o;->g(Lt9/o;)Z

    move-result v5

    iget-object v12, v2, Led3/o;->f:Ljava/lang/Object;

    check-cast v12, Lx8/n;

    if-nez v5, :cond_d

    iput v10, v8, Len/h;->e:I

    return v9

    :cond_d
    invoke-interface {v1}, Lt9/o;->getPosition()J

    move-result-wide v13

    move-wide v15, v6

    iget-wide v6, v8, Len/h;->c:J

    sub-long/2addr v13, v6

    iput-wide v13, v8, Len/h;->g:J

    iget-object v5, v8, Len/h;->n:Ljava/lang/Object;

    check-cast v5, Lqg3/d;

    invoke-virtual {v8, v12, v6, v7, v5}, Len/h;->e(Lx8/n;JLqg3/d;)Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-interface {v1}, Lt9/o;->getPosition()J

    move-result-wide v5

    iput-wide v5, v8, Len/h;->c:J

    move-wide v6, v15

    goto :goto_2

    :cond_e
    iget-object v5, v8, Len/h;->n:Ljava/lang/Object;

    check-cast v5, Lqg3/d;

    iget-object v5, v5, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v5, Lu8/p;

    iget v6, v5, Lu8/p;->E:I

    iput v6, v8, Len/h;->f:I

    iget-boolean v6, v8, Len/h;->i:Z

    if-nez v6, :cond_f

    iget-object v6, v8, Len/h;->k:Ljava/lang/Object;

    check-cast v6, Lt9/k0;

    invoke-interface {v6, v5}, Lt9/k0;->a(Lu8/p;)V

    iput-boolean v4, v8, Len/h;->i:Z

    :cond_f
    iget-object v5, v8, Len/h;->n:Ljava/lang/Object;

    check-cast v5, Lqg3/d;

    iget-object v5, v5, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v5, Lai/h;

    if-eqz v5, :cond_10

    iput-object v5, v8, Len/h;->m:Ljava/lang/Object;

    :goto_3
    move v2, v11

    move-object v1, v12

    goto :goto_5

    :cond_10
    invoke-interface {v1}, Lt9/o;->getLength()J

    move-result-wide v5

    cmp-long v5, v5, v15

    if-nez v5, :cond_11

    new-instance v1, Lng3/n;

    const/16 v2, 0x9

    invoke-direct {v1, v2}, Lng3/n;-><init>(I)V

    iput-object v1, v8, Len/h;->m:Ljava/lang/Object;

    goto :goto_3

    :cond_11
    iget-object v2, v2, Led3/o;->e:Ljava/lang/Object;

    check-cast v2, Len/e;

    iget v5, v2, Len/e;->a:I

    and-int/lit8 v5, v5, 0x4

    if-eqz v5, :cond_12

    move/from16 v17, v4

    goto :goto_4

    :cond_12
    move/from16 v17, v3

    :goto_4
    new-instance v7, Len/b;

    iget-wide v9, v8, Len/h;->c:J

    invoke-interface {v1}, Lt9/o;->getLength()J

    move-result-wide v4

    iget v1, v2, Len/e;->d:I

    iget v6, v2, Len/e;->e:I

    add-int/2addr v1, v6

    int-to-long v13, v1

    iget-wide v1, v2, Len/e;->b:J

    const/16 v18, 0x0

    move-wide v15, v1

    move v2, v11

    move-object v1, v12

    move-wide v11, v4

    invoke-direct/range {v7 .. v18}, Len/b;-><init>(Len/h;JJJJZB)V

    iput-object v7, v8, Len/h;->m:Ljava/lang/Object;

    :goto_5
    iput v2, v8, Len/h;->e:I

    iget-object v2, v1, Lx8/n;->a:[B

    array-length v4, v2

    const v5, 0xfe01

    if-ne v4, v5, :cond_13

    return v3

    :cond_13
    iget v4, v1, Lx8/n;->c:I

    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v2

    iget v4, v1, Lx8/n;->c:I

    invoke-virtual {v1, v4, v2}, Lx8/n;->D(I[B)V

    return v3
.end method

.method public final release()V
    .locals 0

    return-void
.end method
