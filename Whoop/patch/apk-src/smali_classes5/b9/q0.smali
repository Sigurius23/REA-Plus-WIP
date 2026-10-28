.class public final Lb9/q0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:[Ll9/z0;

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Lb9/r0;

.field public h:Z

.field public final i:[Z

.field public final j:[Lb9/f;

.field public final k:Lb3/b;

.field public final l:Lb9/b1;

.field public m:Lb9/q0;

.field public n:Ll9/g1;

.field public o:Lo9/v;

.field public p:J


# direct methods
.method public constructor <init>([Lb9/f;JLb3/b;Lko/o;Lb9/b1;Lb9/r0;Lo9/v;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb9/q0;->j:[Lb9/f;

    iput-wide p2, p0, Lb9/q0;->p:J

    iput-object p4, p0, Lb9/q0;->k:Lb3/b;

    iput-object p6, p0, Lb9/q0;->l:Lb9/b1;

    iget-object p2, p7, Lb9/r0;->a:Ll9/c0;

    iget-object p3, p2, Ll9/c0;->a:Ljava/lang/Object;

    iput-object p3, p0, Lb9/q0;->b:Ljava/lang/Object;

    iput-object p7, p0, Lb9/q0;->g:Lb9/r0;

    sget-object p3, Ll9/g1;->d:Ll9/g1;

    iput-object p3, p0, Lb9/q0;->n:Ll9/g1;

    iput-object p8, p0, Lb9/q0;->o:Lo9/v;

    array-length p3, p1

    new-array p3, p3, [Ll9/z0;

    iput-object p3, p0, Lb9/q0;->c:[Ll9/z0;

    array-length p1, p1

    new-array p1, p1, [Z

    iput-object p1, p0, Lb9/q0;->i:[Z

    iget-wide p3, p7, Lb9/r0;->b:J

    iget-wide v5, p7, Lb9/r0;->d:J

    iget-boolean p1, p7, Lb9/r0;->f:Z

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p7, p2, Ll9/c0;->a:Ljava/lang/Object;

    sget p8, Lb9/h1;->k:I

    check-cast p7, Landroid/util/Pair;

    iget-object p8, p7, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object p7, p7, Landroid/util/Pair;->second:Ljava/lang/Object;

    invoke-virtual {p2, p7}, Ll9/c0;->a(Ljava/lang/Object;)Ll9/c0;

    move-result-object p2

    iget-object p7, p6, Lb9/b1;->d:Ljava/util/HashMap;

    invoke-virtual {p7, p8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p7

    check-cast p7, Lb9/a1;

    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p8, p6, Lb9/b1;->f:Ljava/util/HashSet;

    invoke-virtual {p8, p7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object p8, p6, Lb9/b1;->e:Ljava/util/HashMap;

    invoke-virtual {p8, p7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p8

    check-cast p8, Lb9/z0;

    if-eqz p8, :cond_0

    iget-object v0, p8, Lb9/z0;->a:Ll9/a;

    iget-object p8, p8, Lb9/z0;->b:Lb9/u0;

    invoke-virtual {v0, p8}, Ll9/a;->d(Ll9/d0;)V

    :cond_0
    iget-object p8, p7, Lb9/a1;->c:Ljava/util/ArrayList;

    invoke-virtual {p8, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p8, p7, Lb9/a1;->a:Ll9/x;

    invoke-virtual {p8, p2, p5, p3, p4}, Ll9/x;->B(Ll9/c0;Lko/o;J)Ll9/u;

    move-result-object v1

    iget-object p2, p6, Lb9/b1;->c:Ljava/util/IdentityHashMap;

    invoke-virtual {p2, v1, p7}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p6}, Lb9/b1;->e()V

    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p2, v5, p2

    if-eqz p2, :cond_1

    new-instance v0, Ll9/c;

    xor-int/lit8 v2, p1, 0x1

    const-wide/16 v3, 0x0

    invoke-direct/range {v0 .. v6}, Ll9/c;-><init>(Ll9/a0;ZJJ)V

    move-object v1, v0

    :cond_1
    iput-object v1, p0, Lb9/q0;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lo9/v;JZ[Z)J
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    iget v4, v1, Lo9/v;->a:I

    const/4 v5, 0x1

    if-ge v3, v4, :cond_1

    if-nez p4, :cond_0

    iget-object v4, v0, Lb9/q0;->o:Lo9/v;

    invoke-virtual {v1, v4, v3}, Lo9/v;->a(Lo9/v;I)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    move v5, v2

    :goto_1
    iget-object v4, v0, Lb9/q0;->i:[Z

    aput-boolean v5, v4, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    move v3, v2

    :goto_2
    iget-object v4, v0, Lb9/q0;->j:[Lb9/f;

    array-length v6, v4

    const/4 v7, -0x2

    iget-object v8, v0, Lb9/q0;->c:[Ll9/z0;

    if-ge v3, v6, :cond_3

    aget-object v4, v4, v3

    iget v4, v4, Lb9/f;->x:I

    if-ne v4, v7, :cond_2

    const/4 v4, 0x0

    aput-object v4, v8, v3

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_3
    invoke-virtual {v0}, Lb9/q0;->b()V

    iput-object v1, v0, Lb9/q0;->o:Lo9/v;

    invoke-virtual {v0}, Lb9/q0;->c()V

    iget-object v10, v1, Lo9/v;->c:[Lo9/s;

    iget-object v11, v0, Lb9/q0;->i:[Z

    iget-object v12, v0, Lb9/q0;->c:[Ll9/z0;

    iget-object v9, v0, Lb9/q0;->a:Ljava/lang/Object;

    move-wide/from16 v14, p2

    move-object/from16 v13, p5

    invoke-interface/range {v9 .. v15}, Ll9/a0;->u([Lo9/s;[Z[Ll9/z0;[ZJ)J

    move-result-wide v9

    move v3, v2

    :goto_3
    array-length v6, v4

    if-ge v3, v6, :cond_5

    aget-object v6, v4, v3

    iget v6, v6, Lb9/f;->x:I

    if-ne v6, v7, :cond_4

    iget-object v6, v0, Lb9/q0;->o:Lo9/v;

    invoke-virtual {v6, v3}, Lo9/v;->b(I)Z

    move-result v6

    if-eqz v6, :cond_4

    new-instance v6, Ll9/q;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    aput-object v6, v8, v3

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_5
    iput-boolean v2, v0, Lb9/q0;->f:Z

    move v3, v2

    :goto_4
    array-length v6, v8

    if-ge v3, v6, :cond_9

    aget-object v6, v8, v3

    if-eqz v6, :cond_6

    invoke-virtual {v1, v3}, Lo9/v;->b(I)Z

    move-result v6

    invoke-static {v6}, Lva3/g;->i(Z)V

    aget-object v6, v4, v3

    iget v6, v6, Lb9/f;->x:I

    if-eq v6, v7, :cond_8

    iput-boolean v5, v0, Lb9/q0;->f:Z

    goto :goto_6

    :cond_6
    iget-object v6, v1, Lo9/v;->c:[Lo9/s;

    aget-object v6, v6, v3

    if-nez v6, :cond_7

    move v6, v5

    goto :goto_5

    :cond_7
    move v6, v2

    :goto_5
    invoke-static {v6}, Lva3/g;->i(Z)V

    :cond_8
    :goto_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_9
    return-wide v9
.end method

.method public final b()V
    .locals 3

    iget-object v0, p0, Lb9/q0;->m:Lb9/q0;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lb9/q0;->o:Lo9/v;

    iget v2, v1, Lo9/v;->a:I

    if-ge v0, v2, :cond_1

    invoke-virtual {v1, v0}, Lo9/v;->b(I)Z

    move-result v1

    iget-object v2, p0, Lb9/q0;->o:Lo9/v;

    iget-object v2, v2, Lo9/v;->c:[Lo9/s;

    aget-object v2, v2, v0

    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    invoke-interface {v2}, Lo9/s;->a()V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final c()V
    .locals 3

    iget-object v0, p0, Lb9/q0;->m:Lb9/q0;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lb9/q0;->o:Lo9/v;

    iget v2, v1, Lo9/v;->a:I

    if-ge v0, v2, :cond_1

    invoke-virtual {v1, v0}, Lo9/v;->b(I)Z

    move-result v1

    iget-object v2, p0, Lb9/q0;->o:Lo9/v;

    iget-object v2, v2, Lo9/v;->c:[Lo9/s;

    aget-object v2, v2, v0

    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    invoke-interface {v2}, Lo9/s;->b()V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final d()J
    .locals 5

    iget-boolean v0, p0, Lb9/q0;->e:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lb9/q0;->g:Lb9/r0;

    iget-wide v0, v0, Lb9/r0;->b:J

    return-wide v0

    :cond_0
    iget-boolean v0, p0, Lb9/q0;->f:Z

    const-wide/high16 v1, -0x8000000000000000L

    if-eqz v0, :cond_1

    iget-object v0, p0, Lb9/q0;->a:Ljava/lang/Object;

    invoke-interface {v0}, Ll9/b1;->m()J

    move-result-wide v3

    goto :goto_0

    :cond_1
    move-wide v3, v1

    :goto_0
    cmp-long v0, v3, v1

    if-nez v0, :cond_2

    iget-object v0, p0, Lb9/q0;->g:Lb9/r0;

    iget-wide v0, v0, Lb9/r0;->e:J

    return-wide v0

    :cond_2
    return-wide v3
.end method

.method public final e()J
    .locals 4

    iget-object v0, p0, Lb9/q0;->g:Lb9/r0;

    iget-wide v0, v0, Lb9/r0;->b:J

    iget-wide v2, p0, Lb9/q0;->p:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final f(FLu8/o0;Z)V
    .locals 7

    const/4 v0, 0x1

    iput-boolean v0, p0, Lb9/q0;->e:Z

    iget-object v0, p0, Lb9/q0;->a:Ljava/lang/Object;

    invoke-interface {v0}, Ll9/a0;->k()Ll9/g1;

    move-result-object v0

    iput-object v0, p0, Lb9/q0;->n:Ll9/g1;

    invoke-virtual {p0, p1, p2, p3}, Lb9/q0;->j(FLu8/o0;Z)Lo9/v;

    move-result-object v2

    iget-object p1, p0, Lb9/q0;->g:Lb9/r0;

    iget-wide p2, p1, Lb9/r0;->b:J

    iget-wide v0, p1, Lb9/r0;->e:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v0, v3

    if-eqz p1, :cond_0

    cmp-long p1, p2, v0

    if-ltz p1, :cond_0

    const-wide/16 p1, 0x1

    sub-long/2addr v0, p1

    const-wide/16 p1, 0x0

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p2

    :cond_0
    move-wide v3, p2

    iget-object p1, p0, Lb9/q0;->j:[Lb9/f;

    array-length p1, p1

    new-array v6, p1, [Z

    const/4 v5, 0x0

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Lb9/q0;->a(Lo9/v;JZ[Z)J

    move-result-wide p1

    iget-wide v2, v1, Lb9/q0;->p:J

    iget-object p3, v1, Lb9/q0;->g:Lb9/r0;

    iget-wide v4, p3, Lb9/r0;->b:J

    sub-long/2addr v4, p1

    add-long/2addr v4, v2

    iput-wide v4, v1, Lb9/q0;->p:J

    invoke-virtual {p3, p1, p2}, Lb9/r0;->b(J)Lb9/r0;

    move-result-object p1

    iput-object p1, v1, Lb9/q0;->g:Lb9/r0;

    return-void
.end method

.method public final g()Z
    .locals 4

    iget-boolean v0, p0, Lb9/q0;->e:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lb9/q0;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb9/q0;->a:Ljava/lang/Object;

    invoke-interface {v0}, Ll9/b1;->m()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final h()Z
    .locals 4

    iget-boolean v0, p0, Lb9/q0;->e:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lb9/q0;->g()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lb9/q0;->d()J

    move-result-wide v0

    iget-object v2, p0, Lb9/q0;->g:Lb9/r0;

    iget-wide v2, v2, Lb9/r0;->b:J

    sub-long/2addr v0, v2

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final i()V
    .locals 3

    invoke-virtual {p0}, Lb9/q0;->b()V

    iget-object v0, p0, Lb9/q0;->a:Ljava/lang/Object;

    :try_start_0
    instance-of v1, v0, Ll9/c;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v2, p0, Lb9/q0;->l:Lb9/b1;

    if-eqz v1, :cond_0

    :try_start_1
    check-cast v0, Ll9/c;

    iget-object v0, v0, Ll9/c;->w:Ll9/a0;

    invoke-virtual {v2, v0}, Lb9/b1;->j(Ll9/a0;)V

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v0}, Lb9/b1;->j(Ll9/a0;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :goto_0
    const-string v1, "MediaPeriodHolder"

    const-string v2, "Period release failed."

    invoke-static {v1, v2, v0}, Lx8/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final j(FLu8/o0;Z)Lo9/v;
    .locals 36

    move-object/from16 v1, p0

    iget-object v0, v1, Lb9/q0;->k:Lb3/b;

    iget-object v2, v1, Lb9/q0;->j:[Lb9/f;

    iget-object v3, v1, Lb9/q0;->n:Ll9/g1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    array-length v4, v2

    const/4 v5, 0x1

    add-int/2addr v4, v5

    new-array v4, v4, [I

    array-length v6, v2

    add-int/2addr v6, v5

    new-array v7, v6, [[Lu8/p0;

    array-length v8, v2

    add-int/2addr v8, v5

    new-array v13, v8, [[[I

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v6, :cond_0

    iget v10, v3, Ll9/g1;->a:I

    new-array v11, v10, [Lu8/p0;

    aput-object v11, v7, v9

    new-array v10, v10, [[I

    aput-object v10, v13, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_0
    array-length v6, v2

    new-array v12, v6, [I

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v6, :cond_1

    aget-object v10, v2, v9

    invoke-virtual {v10}, Lb9/f;->B()I

    move-result v10

    aput v10, v12, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    :goto_2
    iget v9, v3, Ll9/g1;->a:I

    if-ge v6, v9, :cond_a

    invoke-virtual {v3, v6}, Ll9/g1;->a(I)Lu8/p0;

    move-result-object v9

    iget v10, v9, Lu8/p0;->c:I

    const/4 v11, 0x5

    if-ne v10, v11, :cond_2

    move v10, v5

    goto :goto_3

    :cond_2
    const/4 v10, 0x0

    :goto_3
    array-length v11, v2

    move/from16 v16, v5

    const/16 p2, 0x7

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    :goto_4
    array-length v8, v2

    if-ge v14, v8, :cond_7

    aget-object v8, v2, v14

    move-object/from16 v19, v0

    move-object/from16 v20, v3

    move/from16 v18, v5

    move/from16 v0, v17

    move v5, v0

    :goto_5
    iget v3, v9, Lu8/p0;->a:I

    if-ge v5, v3, :cond_3

    iget-object v3, v9, Lu8/p0;->d:[Lu8/p;

    aget-object v3, v3, v5

    invoke-virtual {v8, v3}, Lb9/f;->A(Lu8/p;)I

    move-result v3

    and-int/lit8 v3, v3, 0x7

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_3
    aget v3, v4, v14

    if-nez v3, :cond_4

    move/from16 v3, v18

    goto :goto_6

    :cond_4
    move/from16 v3, v17

    :goto_6
    if-gt v0, v15, :cond_5

    if-ne v0, v15, :cond_6

    if-eqz v10, :cond_6

    if-nez v16, :cond_6

    if-eqz v3, :cond_6

    :cond_5
    move v15, v0

    move/from16 v16, v3

    move v11, v14

    :cond_6
    add-int/lit8 v14, v14, 0x1

    move/from16 v5, v18

    move-object/from16 v0, v19

    move-object/from16 v3, v20

    goto :goto_4

    :cond_7
    move-object/from16 v19, v0

    move-object/from16 v20, v3

    move/from16 v18, v5

    array-length v0, v2

    if-ne v11, v0, :cond_8

    iget v0, v9, Lu8/p0;->a:I

    new-array v0, v0, [I

    goto :goto_8

    :cond_8
    aget-object v0, v2, v11

    iget v3, v9, Lu8/p0;->a:I

    new-array v3, v3, [I

    move/from16 v5, v17

    :goto_7
    iget v8, v9, Lu8/p0;->a:I

    if-ge v5, v8, :cond_9

    iget-object v8, v9, Lu8/p0;->d:[Lu8/p;

    aget-object v8, v8, v5

    invoke-virtual {v0, v8}, Lb9/f;->A(Lu8/p;)I

    move-result v8

    aput v8, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_7

    :cond_9
    move-object v0, v3

    :goto_8
    aget v3, v4, v11

    aget-object v5, v7, v11

    aput-object v9, v5, v3

    aget-object v5, v13, v11

    aput-object v0, v5, v3

    add-int/lit8 v3, v3, 0x1

    aput v3, v4, v11

    add-int/lit8 v6, v6, 0x1

    move/from16 v5, v18

    move-object/from16 v0, v19

    move-object/from16 v3, v20

    goto/16 :goto_2

    :cond_a
    move-object/from16 v19, v0

    move/from16 v18, v5

    const/16 p2, 0x7

    const/16 v17, 0x0

    array-length v0, v2

    new-array v11, v0, [Ll9/g1;

    array-length v0, v2

    new-array v0, v0, [Ljava/lang/String;

    array-length v3, v2

    new-array v10, v3, [I

    move/from16 v3, v17

    :goto_9
    array-length v5, v2

    if-ge v3, v5, :cond_b

    aget v5, v4, v3

    new-instance v6, Ll9/g1;

    aget-object v8, v7, v3

    invoke-static {v5, v8}, Lx8/t;->L(I[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [Lu8/p0;

    invoke-direct {v6, v8}, Ll9/g1;-><init>([Lu8/p0;)V

    aput-object v6, v11, v3

    aget-object v6, v13, v3

    invoke-static {v5, v6}, Lx8/t;->L(I[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [[I

    aput-object v5, v13, v3

    aget-object v5, v2, v3

    invoke-virtual {v5}, Lb9/f;->j()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v0, v3

    aget-object v5, v2, v3

    iget v5, v5, Lb9/f;->x:I

    aput v5, v10, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_9

    :cond_b
    array-length v0, v2

    aget v0, v4, v0

    new-instance v14, Ll9/g1;

    array-length v2, v2

    aget-object v2, v7, v2

    invoke-static {v0, v2}, Lx8/t;->L(I[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lu8/p0;

    invoke-direct {v14, v0}, Ll9/g1;-><init>([Lu8/p0;)V

    new-instance v9, Lo9/u;

    invoke-direct/range {v9 .. v14}, Lo9/u;-><init>([I[Ll9/g1;[I[[[ILl9/g1;)V

    move-object/from16 v0, v19

    check-cast v0, Lo9/q;

    iget-object v2, v0, Lo9/q;->d:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object v3, v0, Lo9/q;->g:Lo9/j;

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-boolean v2, v3, Lo9/j;->y:Z

    if-eqz v2, :cond_c

    sget v2, Lx8/t;->a:I

    const/16 v4, 0x20

    if-lt v2, v4, :cond_c

    iget-object v2, v0, Lo9/q;->h:Lo9/l;

    if-nez v2, :cond_c

    new-instance v2, Lo9/l;

    iget-object v4, v0, Lo9/q;->e:Landroid/content/Context;

    invoke-direct {v2, v4, v0}, Lo9/l;-><init>(Landroid/content/Context;Lo9/q;)V

    iput-object v2, v0, Lo9/q;->h:Lo9/l;

    :cond_c
    iget v2, v9, Lo9/u;->a:I

    iget-object v4, v0, Lo9/q;->e:Landroid/content/Context;

    new-array v5, v2, [Lo9/r;

    move/from16 v6, v17

    :goto_a
    iget v7, v9, Lo9/u;->a:I

    const/4 v8, 0x2

    if-ge v6, v7, :cond_e

    aget v7, v10, v6

    if-ne v8, v7, :cond_d

    aget-object v7, v11, v6

    iget v7, v7, Ll9/g1;->a:I

    if-lez v7, :cond_d

    move/from16 v6, v18

    goto :goto_b

    :cond_d
    add-int/lit8 v6, v6, 0x1

    goto :goto_a

    :cond_e
    move/from16 v6, v17

    :goto_b
    new-instance v7, Lo9/d;

    invoke-direct {v7, v0, v3, v6, v12}, Lo9/d;-><init>(Lo9/q;Lo9/j;Z[I)V

    new-instance v6, Lm3/g;

    const/16 v14, 0x8

    invoke-direct {v6, v14}, Lm3/g;-><init>(I)V

    move/from16 v14, v18

    invoke-static {v14, v9, v13, v7, v6}, Lo9/q;->Q(ILo9/u;[[[ILo9/n;Ljava/util/Comparator;)Landroid/util/Pair;

    move-result-object v6

    if-eqz v6, :cond_f

    iget-object v7, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v14, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v14, Lo9/r;

    aput-object v14, v5, v7

    :cond_f
    if-nez v6, :cond_10

    const/4 v6, 0x0

    goto :goto_c

    :cond_10
    iget-object v6, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v6, Lo9/r;

    iget-object v14, v6, Lo9/r;->a:Lu8/p0;

    iget-object v6, v6, Lo9/r;->b:[I

    aget v6, v6, v17

    iget-object v14, v14, Lu8/p0;->d:[Lu8/p;

    aget-object v6, v14, v6

    iget-object v6, v6, Lu8/p;->d:Ljava/lang/String;

    :goto_c
    iget-object v14, v3, Lu8/t0;->o:Lu8/r0;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v14, v3, Lu8/t0;->g:Z

    if-eqz v14, :cond_19

    if-eqz v4, :cond_19

    const-string v14, "display"

    invoke-virtual {v4, v14}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroid/hardware/display/DisplayManager;

    if-eqz v14, :cond_11

    move/from16 v7, v17

    const/16 v16, 0x0

    invoke-virtual {v14, v7}, Landroid/hardware/display/DisplayManager;->getDisplay(I)Landroid/view/Display;

    move-result-object v14

    goto :goto_d

    :cond_11
    const/16 v16, 0x0

    move-object/from16 v14, v16

    :goto_d
    if-nez v14, :cond_12

    const-string v7, "window"

    invoke-virtual {v4, v7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/view/WindowManager;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v7}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v14

    :cond_12
    sget v7, Lx8/t;->a:I

    invoke-virtual {v14}, Landroid/view/Display;->getDisplayId()I

    move-result v19

    if-nez v19, :cond_16

    invoke-static {v4}, Lx8/t;->I(Landroid/content/Context;)Z

    move-result v19

    if-eqz v19, :cond_16

    const/16 v8, 0x1c

    if-ge v7, v8, :cond_13

    const-string v8, "sys.display-size"

    invoke-static {v8}, Lx8/t;->z(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    goto :goto_e

    :cond_13
    const-string v8, "vendor.display-size"

    invoke-static {v8}, Lx8/t;->z(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    :goto_e
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v20

    if-nez v20, :cond_15

    :try_start_1
    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v15
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    move-object/from16 v21, v10

    :try_start_2
    const-string v10, "x"
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0

    move-object/from16 v22, v11

    const/4 v11, -0x1

    :try_start_3
    invoke-virtual {v15, v10, v11}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v10

    array-length v11, v10

    const/4 v15, 0x2

    if-ne v11, v15, :cond_14

    const/16 v17, 0x0

    aget-object v11, v10, v17

    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v11

    const/16 v18, 0x1

    aget-object v10, v10, v18

    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v10

    if-lez v11, :cond_14

    if-lez v10, :cond_14

    new-instance v15, Landroid/graphics/Point;

    invoke-direct {v15, v11, v10}, Landroid/graphics/Point;-><init>(II)V
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_2

    goto/16 :goto_13

    :catch_0
    :goto_f
    move-object/from16 v22, v11

    goto :goto_10

    :catch_1
    move-object/from16 v21, v10

    goto :goto_f

    :catch_2
    :cond_14
    :goto_10
    const-string v10, "Util"

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v15, "Invalid display size: "

    invoke-direct {v11, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v10, v8}, Lx8/a;->g(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_11

    :cond_15
    move-object/from16 v21, v10

    move-object/from16 v22, v11

    :goto_11
    const-string v8, "Sony"

    sget-object v10, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_17

    sget-object v8, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v10, "BRAVIA"

    invoke-virtual {v8, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_17

    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v8

    const-string v10, "com.sony.dtv.hardware.panel.qfhd"

    invoke-virtual {v8, v10}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_17

    new-instance v7, Landroid/graphics/Point;

    const/16 v8, 0xf00

    const/16 v10, 0x870

    invoke-direct {v7, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object v15, v7

    goto :goto_13

    :cond_16
    move-object/from16 v21, v10

    move-object/from16 v22, v11

    :cond_17
    new-instance v8, Landroid/graphics/Point;

    invoke-direct {v8}, Landroid/graphics/Point;-><init>()V

    const/16 v10, 0x17

    if-lt v7, v10, :cond_18

    invoke-virtual {v14}, Landroid/view/Display;->getMode()Landroid/view/Display$Mode;

    move-result-object v7

    invoke-virtual {v7}, Landroid/view/Display$Mode;->getPhysicalWidth()I

    move-result v10

    iput v10, v8, Landroid/graphics/Point;->x:I

    invoke-virtual {v7}, Landroid/view/Display$Mode;->getPhysicalHeight()I

    move-result v7

    iput v7, v8, Landroid/graphics/Point;->y:I

    goto :goto_12

    :cond_18
    invoke-virtual {v14, v8}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    :goto_12
    move-object v15, v8

    goto :goto_13

    :cond_19
    move-object/from16 v21, v10

    move-object/from16 v22, v11

    const/16 v16, 0x0

    move-object/from16 v15, v16

    :goto_13
    new-instance v7, Lio/getstream/chat/android/ui/utils/a;

    invoke-direct {v7, v3, v6, v12, v15}, Lio/getstream/chat/android/ui/utils/a;-><init>(Lo9/j;Ljava/lang/String;[ILandroid/graphics/Point;)V

    new-instance v8, Lm3/g;

    move/from16 v10, p2

    invoke-direct {v8, v10}, Lm3/g;-><init>(I)V

    const/4 v15, 0x2

    invoke-static {v15, v9, v13, v7, v8}, Lo9/q;->Q(ILo9/u;[[[ILo9/n;Ljava/util/Comparator;)Landroid/util/Pair;

    move-result-object v7

    const/4 v8, 0x4

    if-nez v7, :cond_1a

    new-instance v10, Lmm/d;

    const/16 v11, 0xc

    invoke-direct {v10, v3, v11}, Lmm/d;-><init>(Ljava/lang/Object;I)V

    new-instance v11, Lm3/g;

    const/4 v12, 0x6

    invoke-direct {v11, v12}, Lm3/g;-><init>(I)V

    invoke-static {v8, v9, v13, v10, v11}, Lo9/q;->Q(ILo9/u;[[[ILo9/n;Ljava/util/Comparator;)Landroid/util/Pair;

    move-result-object v10

    goto :goto_14

    :cond_1a
    move-object/from16 v10, v16

    :goto_14
    if-eqz v10, :cond_1b

    iget-object v7, v10, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v10, v10, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v10, Lo9/r;

    aput-object v10, v5, v7

    goto :goto_15

    :cond_1b
    if-eqz v7, :cond_1c

    iget-object v10, v7, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v7, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v7, Lo9/r;

    aput-object v7, v5, v10

    :cond_1c
    :goto_15
    iget-boolean v7, v3, Lu8/t0;->q:Z

    if-eqz v7, :cond_20

    if-nez v4, :cond_1d

    goto :goto_16

    :cond_1d
    const-string v7, "captioning"

    invoke-virtual {v4, v7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/accessibility/CaptioningManager;

    if-eqz v4, :cond_20

    invoke-virtual {v4}, Landroid/view/accessibility/CaptioningManager;->isEnabled()Z

    move-result v7

    if-nez v7, :cond_1e

    goto :goto_16

    :cond_1e
    invoke-virtual {v4}, Landroid/view/accessibility/CaptioningManager;->getLocale()Ljava/util/Locale;

    move-result-object v4

    if-nez v4, :cond_1f

    goto :goto_16

    :cond_1f
    sget v7, Lx8/t;->a:I

    invoke-virtual {v4}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    move-result-object v4

    goto :goto_17

    :cond_20
    :goto_16
    move-object/from16 v4, v16

    :goto_17
    new-instance v7, Lbc/i;

    const/16 v10, 0xe

    invoke-direct {v7, v3, v6, v4, v10}, Lbc/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    new-instance v4, Lm3/g;

    const/16 v6, 0x9

    invoke-direct {v4, v6}, Lm3/g;-><init>(I)V

    const/4 v6, 0x3

    invoke-static {v6, v9, v13, v7, v4}, Lo9/q;->Q(ILo9/u;[[[ILo9/n;Ljava/util/Comparator;)Landroid/util/Pair;

    move-result-object v4

    if-eqz v4, :cond_21

    iget-object v7, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v4, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v4, Lo9/r;

    aput-object v4, v5, v7

    :cond_21
    const/4 v4, 0x0

    :goto_18
    if-ge v4, v2, :cond_29

    aget v7, v21, v4

    const/4 v15, 0x2

    if-eq v7, v15, :cond_28

    const/4 v14, 0x1

    if-eq v7, v14, :cond_28

    if-eq v7, v6, :cond_28

    if-eq v7, v8, :cond_28

    aget-object v7, v22, v4

    aget-object v10, v13, v4

    move-object/from16 v14, v16

    move-object v15, v14

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_19
    iget v6, v7, Ll9/g1;->a:I

    if-ge v11, v6, :cond_26

    invoke-virtual {v7, v11}, Ll9/g1;->a(I)Lu8/p0;

    move-result-object v6

    aget-object v24, v10, v11

    move/from16 v25, v4

    const/4 v8, 0x0

    :goto_1a
    iget v4, v6, Lu8/p0;->a:I

    if-ge v8, v4, :cond_25

    aget v4, v24, v8

    move-object/from16 v26, v7

    iget-boolean v7, v3, Lo9/j;->z:Z

    invoke-static {v4, v7}, Lb9/f;->m(IZ)Z

    move-result v4

    if-eqz v4, :cond_23

    iget-object v4, v6, Lu8/p0;->d:[Lu8/p;

    aget-object v4, v4, v8

    new-instance v7, Lo9/h;

    move-object/from16 v27, v6

    aget v6, v24, v8

    invoke-direct {v7, v4, v6}, Lo9/h;-><init>(Lu8/p;I)V

    if-eqz v15, :cond_22

    sget-object v4, Lzr/y;->a:Lzr/w;

    iget-boolean v6, v7, Lo9/h;->x:Z

    move/from16 v28, v8

    iget-boolean v8, v15, Lo9/h;->x:Z

    invoke-virtual {v4, v6, v8}, Lzr/w;->c(ZZ)Lzr/y;

    move-result-object v4

    iget-boolean v6, v7, Lo9/h;->w:Z

    iget-boolean v8, v15, Lo9/h;->w:Z

    invoke-virtual {v4, v6, v8}, Lzr/y;->c(ZZ)Lzr/y;

    move-result-object v4

    invoke-virtual {v4}, Lzr/y;->e()I

    move-result v4

    if-lez v4, :cond_24

    goto :goto_1b

    :cond_22
    move/from16 v28, v8

    :goto_1b
    move-object v15, v7

    move-object/from16 v14, v27

    move/from16 v12, v28

    goto :goto_1c

    :cond_23
    move-object/from16 v27, v6

    move/from16 v28, v8

    :cond_24
    :goto_1c
    add-int/lit8 v8, v28, 0x1

    move-object/from16 v7, v26

    move-object/from16 v6, v27

    goto :goto_1a

    :cond_25
    move-object/from16 v26, v7

    add-int/lit8 v11, v11, 0x1

    move/from16 v4, v25

    const/4 v8, 0x4

    goto :goto_19

    :cond_26
    move/from16 v25, v4

    if-nez v14, :cond_27

    move-object/from16 v4, v16

    goto :goto_1d

    :cond_27
    new-instance v4, Lo9/r;

    filled-new-array {v12}, [I

    move-result-object v6

    const/4 v7, 0x0

    invoke-direct {v4, v7, v14, v6}, Lo9/r;-><init>(ILu8/p0;[I)V

    :goto_1d
    aput-object v4, v5, v25

    goto :goto_1e

    :cond_28
    move/from16 v25, v4

    :goto_1e
    add-int/lit8 v4, v25, 0x1

    const/4 v6, 0x3

    const/4 v8, 0x4

    goto/16 :goto_18

    :cond_29
    iget v4, v9, Lo9/u;->a:I

    iget-object v6, v9, Lo9/u;->c:[Ll9/g1;

    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    const/4 v8, 0x0

    :goto_1f
    if-ge v8, v4, :cond_2a

    aget-object v10, v6, v8

    invoke-static {v10, v3, v7}, Lo9/q;->L(Ll9/g1;Lo9/j;Ljava/util/HashMap;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_1f

    :cond_2a
    iget-object v8, v9, Lo9/u;->f:Ll9/g1;

    invoke-static {v8, v3, v7}, Lo9/q;->L(Ll9/g1;Lo9/j;Ljava/util/HashMap;)V

    const/4 v8, 0x0

    :goto_20
    if-ge v8, v4, :cond_2e

    iget-object v10, v9, Lo9/u;->b:[I

    aget v10, v10, v8

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v7, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lu8/q0;

    if-nez v10, :cond_2b

    goto :goto_24

    :cond_2b
    iget-object v11, v10, Lu8/q0;->a:Lu8/p0;

    iget-object v10, v10, Lu8/q0;->b:Lzr/g0;

    invoke-virtual {v10}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_2d

    aget-object v12, v6, v8

    iget-object v12, v12, Ll9/g1;->b:Lzr/w0;

    invoke-virtual {v12, v11}, Lzr/g0;->indexOf(Ljava/lang/Object;)I

    move-result v12

    if-ltz v12, :cond_2c

    :goto_21
    const/4 v13, -0x1

    goto :goto_22

    :cond_2c
    const/4 v12, -0x1

    goto :goto_21

    :goto_22
    if-eq v12, v13, :cond_2d

    new-instance v12, Lo9/r;

    invoke-static {v10}, Lvd/f;->S(Ljava/util/Collection;)[I

    move-result-object v10

    const/4 v13, 0x0

    invoke-direct {v12, v13, v11, v10}, Lo9/r;-><init>(ILu8/p0;[I)V

    goto :goto_23

    :cond_2d
    move-object/from16 v12, v16

    :goto_23
    aput-object v12, v5, v8

    :goto_24
    add-int/lit8 v8, v8, 0x1

    goto :goto_20

    :cond_2e
    iget v4, v9, Lo9/u;->a:I

    const/4 v6, 0x0

    :goto_25
    if-ge v6, v4, :cond_32

    iget-object v7, v9, Lo9/u;->c:[Ll9/g1;

    aget-object v7, v7, v6

    iget-object v8, v3, Lo9/j;->B:Landroid/util/SparseArray;

    invoke-virtual {v8, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map;

    if-eqz v8, :cond_31

    invoke-interface {v8, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_31

    iget-object v8, v3, Lo9/j;->B:Landroid/util/SparseArray;

    invoke-virtual {v8, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map;

    if-eqz v8, :cond_30

    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_2f

    goto :goto_26

    :cond_2f
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :cond_30
    :goto_26
    aput-object v16, v5, v6

    :cond_31
    add-int/lit8 v6, v6, 0x1

    goto :goto_25

    :cond_32
    const/4 v4, 0x0

    :goto_27
    if-ge v4, v2, :cond_35

    iget-object v6, v9, Lo9/u;->b:[I

    aget v6, v6, v4

    iget-object v7, v3, Lo9/j;->C:Landroid/util/SparseBooleanArray;

    invoke-virtual {v7, v4}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result v7

    if-nez v7, :cond_33

    iget-object v7, v3, Lu8/t0;->t:Lzr/j0;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v7, v6}, Lzr/b0;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_34

    :cond_33
    aput-object v16, v5, v4

    :cond_34
    add-int/lit8 v4, v4, 0x1

    goto :goto_27

    :cond_35
    iget-object v4, v0, Lo9/q;->f:Lng3/o;

    iget-object v0, v0, Lb3/b;->c:Ljava/lang/Object;

    move-object/from16 v28, v0

    check-cast v28, Lp9/d;

    invoke-static/range {v28 .. v28}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v4, 0x0

    :goto_28
    array-length v6, v5

    const-wide/16 v7, 0x0

    if-ge v4, v6, :cond_37

    aget-object v6, v5, v4

    if-eqz v6, :cond_36

    iget-object v6, v6, Lo9/r;->b:[I

    array-length v6, v6

    const/4 v14, 0x1

    if-le v6, v14, :cond_36

    invoke-static {}, Lzr/g0;->l()Lzr/d0;

    move-result-object v6

    new-instance v10, Lo9/a;

    invoke-direct {v10, v7, v8, v7, v8}, Lo9/a;-><init>(JJ)V

    invoke-virtual {v6, v10}, Lzr/a0;->a(Ljava/lang/Object;)V

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v6, v16

    goto :goto_29

    :cond_36
    move-object/from16 v6, v16

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_29
    add-int/lit8 v4, v4, 0x1

    move-object/from16 v16, v6

    goto :goto_28

    :cond_37
    move-object/from16 v6, v16

    array-length v4, v5

    new-array v10, v4, [[J

    const/4 v11, 0x0

    :goto_2a
    array-length v12, v5

    const-wide/16 v13, -0x1

    if-ge v11, v12, :cond_3b

    aget-object v12, v5, v11

    if-nez v12, :cond_38

    const/4 v15, 0x0

    new-array v12, v15, [J

    aput-object v12, v10, v11

    goto :goto_2c

    :cond_38
    iget-object v15, v12, Lo9/r;->b:[I

    array-length v6, v15

    new-array v6, v6, [J

    aput-object v6, v10, v11

    const/4 v6, 0x0

    :goto_2b
    array-length v7, v15

    if-ge v6, v7, :cond_3a

    iget-object v7, v12, Lo9/r;->a:Lu8/p0;

    aget v8, v15, v6

    iget-object v7, v7, Lu8/p0;->d:[Lu8/p;

    aget-object v7, v7, v8

    iget v7, v7, Lu8/p;->j:I

    int-to-long v7, v7

    aget-object v23, v10, v11

    cmp-long v24, v7, v13

    if-nez v24, :cond_39

    const-wide/16 v7, 0x0

    :cond_39
    aput-wide v7, v23, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_2b

    :cond_3a
    aget-object v6, v10, v11

    invoke-static {v6}, Ljava/util/Arrays;->sort([J)V

    :goto_2c
    add-int/lit8 v11, v11, 0x1

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    goto :goto_2a

    :cond_3b
    new-array v6, v4, [I

    new-array v7, v4, [J

    const/4 v8, 0x0

    :goto_2d
    if-ge v8, v4, :cond_3d

    aget-object v11, v10, v8

    array-length v12, v11

    if-nez v12, :cond_3c

    const-wide/16 v11, 0x0

    goto :goto_2e

    :cond_3c
    const/16 v17, 0x0

    aget-wide v11, v11, v17

    :goto_2e
    aput-wide v11, v7, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_2d

    :cond_3d
    invoke-static {v0, v7}, Lo9/b;->v(Ljava/util/ArrayList;[J)V

    const-string v8, "expectedValuesPerKey"

    const/4 v15, 0x2

    invoke-static {v15, v8}, Lzr/q;->c(ILjava/lang/String;)V

    new-instance v8, Ljava/util/TreeMap;

    sget-object v11, Lzr/u0;->x:Lzr/u0;

    invoke-direct {v8, v11}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    new-instance v11, Lzr/r0;

    invoke-direct {v11}, Lzr/r0;-><init>()V

    new-instance v12, Lzr/s0;

    invoke-direct {v12, v8}, Lzr/s0;-><init>(Ljava/util/Map;)V

    iput-object v11, v12, Lzr/s0;->F:Lzr/r0;

    const/4 v8, 0x0

    :goto_2f
    if-ge v8, v4, :cond_43

    aget-object v11, v10, v8

    array-length v15, v11

    move-wide/from16 v21, v13

    const/4 v13, 0x1

    if-gt v15, v13, :cond_3e

    move/from16 v19, v4

    move-object/from16 v27, v10

    :goto_30
    move-object/from16 v25, v6

    goto/16 :goto_36

    :cond_3e
    array-length v11, v11

    new-array v13, v11, [D

    const/4 v14, 0x0

    :goto_31
    aget-object v15, v10, v8

    move/from16 v19, v4

    array-length v4, v15

    const-wide/16 v23, 0x0

    if-ge v14, v4, :cond_40

    move-object v4, v10

    move/from16 v25, v11

    aget-wide v10, v15, v14

    cmp-long v15, v10, v21

    if-nez v15, :cond_3f

    goto :goto_32

    :cond_3f
    long-to-double v10, v10

    invoke-static {v10, v11}, Ljava/lang/Math;->log(D)D

    move-result-wide v23

    :goto_32
    aput-wide v23, v13, v14

    add-int/lit8 v14, v14, 0x1

    move-object v10, v4

    move/from16 v4, v19

    move/from16 v11, v25

    goto :goto_31

    :cond_40
    move-object v4, v10

    move/from16 v25, v11

    add-int/lit8 v11, v25, -0x1

    aget-wide v14, v13, v11

    const/16 v17, 0x0

    aget-wide v25, v13, v17

    sub-double v14, v14, v25

    const/4 v10, 0x0

    :goto_33
    if-ge v10, v11, :cond_42

    aget-wide v25, v13, v10

    add-int/lit8 v10, v10, 0x1

    aget-wide v29, v13, v10

    add-double v25, v25, v29

    const-wide/high16 v29, 0x3fe0000000000000L    # 0.5

    mul-double v25, v25, v29

    cmpl-double v27, v14, v23

    if-nez v27, :cond_41

    const-wide/high16 v25, 0x3ff0000000000000L    # 1.0

    :goto_34
    move-object/from16 v27, v4

    goto :goto_35

    :cond_41
    const/16 v17, 0x0

    aget-wide v29, v13, v17

    sub-double v25, v25, v29

    div-double v25, v25, v14

    goto :goto_34

    :goto_35
    invoke-static/range {v25 .. v26}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    move-object/from16 v25, v6

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v12, v4, v6}, Lzr/s0;->d(Ljava/lang/Double;Ljava/lang/Integer;)Z

    move-object/from16 v6, v25

    move-object/from16 v4, v27

    goto :goto_33

    :cond_42
    move-object/from16 v27, v4

    goto :goto_30

    :goto_36
    add-int/lit8 v8, v8, 0x1

    move/from16 v4, v19

    move-wide/from16 v13, v21

    move-object/from16 v6, v25

    move-object/from16 v10, v27

    goto/16 :goto_2f

    :cond_43
    move-object/from16 v25, v6

    move-object/from16 v27, v10

    iget-object v4, v12, Lzr/o;->x:Lzr/n;

    if-nez v4, :cond_44

    new-instance v4, Lzr/n;

    const/4 v13, 0x0

    invoke-direct {v4, v13, v12}, Lzr/n;-><init>(ILjava/io/Serializable;)V

    iput-object v4, v12, Lzr/o;->x:Lzr/n;

    :cond_44
    invoke-static {v4}, Lzr/g0;->m(Ljava/util/Collection;)Lzr/g0;

    move-result-object v4

    const/4 v6, 0x0

    :goto_37
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->size()I

    move-result v8

    if-ge v6, v8, :cond_45

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    aget v10, v25, v8

    const/16 v18, 0x1

    add-int/lit8 v10, v10, 0x1

    aput v10, v25, v8

    aget-object v11, v27, v8

    aget-wide v10, v11, v10

    aput-wide v10, v7, v8

    invoke-static {v0, v7}, Lo9/b;->v(Ljava/util/ArrayList;[J)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_37

    :cond_45
    const/4 v4, 0x0

    :goto_38
    array-length v6, v5

    if-ge v4, v6, :cond_47

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_46

    aget-wide v10, v7, v4

    const-wide/16 v12, 0x2

    mul-long/2addr v10, v12

    aput-wide v10, v7, v4

    :cond_46
    add-int/lit8 v4, v4, 0x1

    goto :goto_38

    :cond_47
    invoke-static {v0, v7}, Lo9/b;->v(Ljava/util/ArrayList;[J)V

    invoke-static {}, Lzr/g0;->l()Lzr/d0;

    move-result-object v4

    const/4 v6, 0x0

    :goto_39
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v6, v7, :cond_49

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lzr/d0;

    if-nez v7, :cond_48

    sget-object v7, Lzr/w0;->E:Lzr/w0;

    goto :goto_3a

    :cond_48
    invoke-virtual {v7}, Lzr/d0;->f()Lzr/w0;

    move-result-object v7

    :goto_3a
    invoke-virtual {v4, v7}, Lzr/a0;->a(Ljava/lang/Object;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_39

    :cond_49
    invoke-virtual {v4}, Lzr/d0;->f()Lzr/w0;

    move-result-object v0

    array-length v4, v5

    new-array v4, v4, [Lo9/s;

    const/4 v7, 0x0

    :goto_3b
    array-length v6, v5

    if-ge v7, v6, :cond_4d

    aget-object v6, v5, v7

    if-eqz v6, :cond_4c

    iget-object v8, v6, Lo9/r;->b:[I

    array-length v10, v8

    if-nez v10, :cond_4a

    goto :goto_3d

    :cond_4a
    array-length v10, v8

    const/4 v14, 0x1

    if-ne v10, v14, :cond_4b

    new-instance v10, Lo9/t;

    iget-object v6, v6, Lo9/r;->a:Lu8/p0;

    const/16 v17, 0x0

    aget v8, v8, v17

    filled-new-array {v8}, [I

    move-result-object v8

    invoke-direct {v10, v6, v8}, Lo9/c;-><init>(Lu8/p0;[I)V

    goto :goto_3c

    :cond_4b
    iget-object v6, v6, Lo9/r;->a:Lu8/p0;

    invoke-virtual {v0, v7}, Lzr/w0;->get(I)Ljava/lang/Object;

    move-result-object v10

    move-object/from16 v35, v10

    check-cast v35, Lzr/g0;

    new-instance v25, Lo9/b;

    const/16 v10, 0x2710

    int-to-long v10, v10

    const/16 v12, 0x61a8

    int-to-long v12, v12

    move-wide/from16 v33, v12

    move-object/from16 v26, v6

    move-object/from16 v27, v8

    move-wide/from16 v29, v10

    move-wide/from16 v31, v12

    invoke-direct/range {v25 .. v35}, Lo9/b;-><init>(Lu8/p0;[ILp9/d;JJJLzr/g0;)V

    move-object/from16 v10, v25

    :goto_3c
    aput-object v10, v4, v7

    :cond_4c
    :goto_3d
    add-int/lit8 v7, v7, 0x1

    goto :goto_3b

    :cond_4d
    new-array v0, v2, [Lb9/i1;

    const/4 v7, 0x0

    :goto_3e
    const/4 v5, -0x2

    if-ge v7, v2, :cond_51

    iget-object v6, v9, Lo9/u;->b:[I

    aget v6, v6, v7

    iget-object v8, v3, Lo9/j;->C:Landroid/util/SparseBooleanArray;

    invoke-virtual {v8, v7}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result v8

    if-nez v8, :cond_50

    iget-object v8, v3, Lu8/t0;->t:Lzr/j0;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v8, v6}, Lzr/b0;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4e

    goto :goto_3f

    :cond_4e
    iget-object v6, v9, Lo9/u;->b:[I

    aget v6, v6, v7

    if-eq v6, v5, :cond_4f

    aget-object v5, v4, v7

    if-eqz v5, :cond_50

    :cond_4f
    sget-object v5, Lb9/i1;->c:Lb9/i1;

    goto :goto_40

    :cond_50
    :goto_3f
    const/4 v5, 0x0

    :goto_40
    aput-object v5, v0, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_3e

    :cond_51
    iget-object v2, v3, Lu8/t0;->o:Lu8/r0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v4}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    iget-object v2, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, [Lo9/s;

    array-length v3, v2

    new-array v3, v3, [Ljava/util/List;

    const/4 v7, 0x0

    :goto_41
    array-length v4, v2

    if-ge v7, v4, :cond_53

    aget-object v4, v2, v7

    if-eqz v4, :cond_52

    invoke-static {v4}, Lzr/g0;->r(Ljava/lang/Object;)Lzr/w0;

    move-result-object v4

    goto :goto_42

    :cond_52
    sget-object v4, Lzr/g0;->x:Lzr/e0;

    sget-object v4, Lzr/w0;->E:Lzr/w0;

    :goto_42
    aput-object v4, v3, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_41

    :cond_53
    new-instance v2, Lzr/d0;

    const/4 v4, 0x4

    invoke-direct {v2, v4}, Lzr/a0;-><init>(I)V

    const/4 v7, 0x0

    :goto_43
    iget v4, v9, Lo9/u;->a:I

    iget-object v6, v9, Lo9/u;->c:[Ll9/g1;

    if-ge v7, v4, :cond_5f

    aget-object v4, v6, v7

    aget-object v8, v3, v7

    const/4 v10, 0x0

    :goto_44
    iget v11, v4, Ll9/g1;->a:I

    if-ge v10, v11, :cond_5e

    invoke-virtual {v4, v10}, Ll9/g1;->a(I)Lu8/p0;

    move-result-object v11

    aget-object v12, v6, v7

    invoke-virtual {v12, v10}, Ll9/g1;->a(I)Lu8/p0;

    move-result-object v12

    iget v12, v12, Lu8/p0;->a:I

    new-array v13, v12, [I

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_45
    if-ge v14, v12, :cond_55

    iget-object v5, v9, Lo9/u;->e:[[[I

    aget-object v5, v5, v7

    aget-object v5, v5, v10

    aget v5, v5, v14

    const/16 v21, 0x7

    and-int/lit8 v5, v5, 0x7

    move-object/from16 v22, v3

    const/4 v3, 0x4

    if-eq v5, v3, :cond_54

    goto :goto_46

    :cond_54
    add-int/lit8 v5, v15, 0x1

    aput v14, v13, v15

    move v15, v5

    :goto_46
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v3, v22

    const/4 v5, -0x2

    goto :goto_45

    :cond_55
    move-object/from16 v22, v3

    const/4 v3, 0x4

    invoke-static {v13, v15}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v5

    const/16 v12, 0x10

    move-object/from16 v21, v4

    move v15, v12

    const/4 v3, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_47
    array-length v4, v5

    if-ge v12, v4, :cond_57

    aget v4, v5, v12

    move/from16 v23, v4

    aget-object v4, v6, v7

    invoke-virtual {v4, v10}, Ll9/g1;->a(I)Lu8/p0;

    move-result-object v4

    iget-object v4, v4, Lu8/p0;->d:[Lu8/p;

    aget-object v4, v4, v23

    iget-object v4, v4, Lu8/p;->n:Ljava/lang/String;

    add-int/lit8 v23, v14, 0x1

    if-nez v14, :cond_56

    move-object v3, v4

    const/16 v18, 0x1

    goto :goto_48

    :cond_56
    invoke-static {v3, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const/16 v18, 0x1

    xor-int/lit8 v4, v4, 0x1

    or-int/2addr v4, v13

    move v13, v4

    :goto_48
    iget-object v4, v9, Lo9/u;->e:[[[I

    aget-object v4, v4, v7

    aget-object v4, v4, v10

    aget v4, v4, v12

    and-int/lit8 v4, v4, 0x18

    invoke-static {v15, v4}, Ljava/lang/Math;->min(II)I

    move-result v15

    add-int/lit8 v12, v12, 0x1

    move/from16 v14, v23

    goto :goto_47

    :cond_57
    const/16 v18, 0x1

    if-eqz v13, :cond_58

    iget-object v3, v9, Lo9/u;->d:[I

    aget v3, v3, v7

    invoke-static {v15, v3}, Ljava/lang/Math;->min(II)I

    move-result v15

    :cond_58
    if-eqz v15, :cond_59

    move/from16 v14, v18

    goto :goto_49

    :cond_59
    const/4 v14, 0x0

    :goto_49
    iget v3, v11, Lu8/p0;->a:I

    new-array v4, v3, [I

    new-array v3, v3, [Z

    const/4 v5, 0x0

    :goto_4a
    iget v12, v11, Lu8/p0;->a:I

    if-ge v5, v12, :cond_5d

    iget-object v12, v9, Lo9/u;->e:[[[I

    aget-object v12, v12, v7

    aget-object v12, v12, v10

    aget v12, v12, v5

    const/4 v13, 0x7

    and-int/2addr v12, v13

    aput v12, v4, v5

    const/4 v12, 0x0

    :goto_4b
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v15

    if-ge v12, v15, :cond_5c

    invoke-interface {v8, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lo9/s;

    invoke-interface {v15}, Lo9/s;->j()Lu8/p0;

    move-result-object v13

    invoke-virtual {v13, v11}, Lu8/p0;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_5a

    invoke-interface {v15, v5}, Lo9/s;->i(I)I

    move-result v13

    const/4 v15, -0x1

    if-eq v13, v15, :cond_5b

    move/from16 v12, v18

    goto :goto_4c

    :cond_5a
    const/4 v15, -0x1

    :cond_5b
    add-int/lit8 v12, v12, 0x1

    const/4 v13, 0x7

    goto :goto_4b

    :cond_5c
    const/4 v15, -0x1

    const/4 v12, 0x0

    :goto_4c
    aput-boolean v12, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_4a

    :cond_5d
    const/4 v15, -0x1

    new-instance v5, Lu8/u0;

    invoke-direct {v5, v11, v14, v4, v3}, Lu8/u0;-><init>(Lu8/p0;Z[I[Z)V

    invoke-virtual {v2, v5}, Lzr/a0;->a(Ljava/lang/Object;)V

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v4, v21

    move-object/from16 v3, v22

    const/4 v5, -0x2

    goto/16 :goto_44

    :cond_5e
    move-object/from16 v22, v3

    const/4 v15, -0x1

    const/16 v18, 0x1

    add-int/lit8 v7, v7, 0x1

    const/4 v5, -0x2

    goto/16 :goto_43

    :cond_5f
    const/16 v18, 0x1

    iget-object v3, v9, Lo9/u;->f:Ll9/g1;

    const/4 v7, 0x0

    :goto_4d
    iget v4, v3, Ll9/g1;->a:I

    if-ge v7, v4, :cond_60

    invoke-virtual {v3, v7}, Ll9/g1;->a(I)Lu8/p0;

    move-result-object v4

    iget v5, v4, Lu8/p0;->a:I

    new-array v5, v5, [I

    const/4 v13, 0x0

    invoke-static {v5, v13}, Ljava/util/Arrays;->fill([II)V

    iget v6, v4, Lu8/p0;->a:I

    new-array v6, v6, [Z

    new-instance v8, Lu8/u0;

    invoke-direct {v8, v4, v13, v5, v6}, Lu8/u0;-><init>(Lu8/p0;Z[I[Z)V

    invoke-virtual {v2, v8}, Lzr/a0;->a(Ljava/lang/Object;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_4d

    :cond_60
    const/4 v13, 0x0

    new-instance v3, Lu8/v0;

    invoke-virtual {v2}, Lzr/d0;->f()Lzr/w0;

    move-result-object v2

    invoke-direct {v3, v2}, Lu8/v0;-><init>(Lzr/w0;)V

    new-instance v2, Lo9/v;

    iget-object v4, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v4, [Lb9/i1;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, [Lo9/s;

    invoke-direct {v2, v4, v0, v3, v9}, Lo9/v;-><init>([Lb9/i1;[Lo9/s;Lu8/v0;Ljava/lang/Object;)V

    move v7, v13

    :goto_4e
    iget v0, v2, Lo9/v;->a:I

    if-ge v7, v0, :cond_65

    invoke-virtual {v2, v7}, Lo9/v;->b(I)Z

    move-result v0

    if-eqz v0, :cond_63

    iget-object v0, v2, Lo9/v;->c:[Lo9/s;

    aget-object v0, v0, v7

    if-nez v0, :cond_62

    iget-object v0, v1, Lb9/q0;->j:[Lb9/f;

    aget-object v0, v0, v7

    iget v0, v0, Lb9/f;->x:I

    const/4 v3, -0x2

    if-ne v0, v3, :cond_61

    goto :goto_4f

    :cond_61
    move v14, v13

    goto :goto_50

    :cond_62
    const/4 v3, -0x2

    :goto_4f
    move/from16 v14, v18

    :goto_50
    invoke-static {v14}, Lva3/g;->i(Z)V

    goto :goto_52

    :cond_63
    const/4 v3, -0x2

    iget-object v0, v2, Lo9/v;->c:[Lo9/s;

    aget-object v0, v0, v7

    if-nez v0, :cond_64

    move/from16 v14, v18

    goto :goto_51

    :cond_64
    move v14, v13

    :goto_51
    invoke-static {v14}, Lva3/g;->i(Z)V

    :goto_52
    add-int/lit8 v7, v7, 0x1

    goto :goto_4e

    :cond_65
    iget-object v0, v2, Lo9/v;->c:[Lo9/s;

    array-length v3, v0

    move v8, v13

    :goto_53
    if-ge v8, v3, :cond_67

    aget-object v4, v0, v8

    move/from16 v5, p1

    if-eqz v4, :cond_66

    invoke-interface {v4, v5}, Lo9/s;->f(F)V

    move/from16 v6, p3

    invoke-interface {v4, v6}, Lo9/s;->k(Z)V

    goto :goto_54

    :cond_66
    move/from16 v6, p3

    :goto_54
    add-int/lit8 v8, v8, 0x1

    goto :goto_53

    :cond_67
    return-object v2

    :catchall_0
    move-exception v0

    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0
.end method

.method public final k()V
    .locals 5

    iget-object v0, p0, Lb9/q0;->a:Ljava/lang/Object;

    instance-of v1, v0, Ll9/c;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lb9/q0;->g:Lb9/r0;

    iget-wide v1, v1, Lb9/r0;->d:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v1, v3

    if-nez v3, :cond_0

    const-wide/high16 v1, -0x8000000000000000L

    :cond_0
    check-cast v0, Ll9/c;

    const-wide/16 v3, 0x0

    iput-wide v3, v0, Ll9/c;->E:J

    iput-wide v1, v0, Ll9/c;->F:J

    :cond_1
    return-void
.end method
