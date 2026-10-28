.class public final Lj3/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lae3/k;

.field public final b:Lj3/e;

.field public final c:La0/q0;

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Lb2/b;

.field public h:J

.field public final i:La3/l0;

.field public final j:Lh2/a;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lae3/k;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lae3/k;-><init>(I)V

    const/16 v1, 0xc0

    new-array v2, v1, [J

    iput-object v2, v0, Lae3/k;->c:Ljava/lang/Object;

    new-array v1, v1, [J

    iput-object v1, v0, Lae3/k;->d:Ljava/lang/Object;

    iput-object v0, p0, Lj3/b;->a:Lae3/k;

    new-instance v0, Lj3/e;

    invoke-direct {v0}, Lj3/e;-><init>()V

    iput-object v0, p0, Lj3/b;->b:Lj3/e;

    new-instance v0, La0/q0;

    invoke-direct {v0}, La0/q0;-><init>()V

    iput-object v0, p0, Lj3/b;->c:La0/q0;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lj3/b;->h:J

    new-instance v0, La3/l0;

    const/16 v1, 0xe

    invoke-direct {v0, p0, v1}, La3/l0;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lj3/b;->i:La3/l0;

    new-instance v0, Lh2/a;

    invoke-direct {v0}, Lh2/a;-><init>()V

    iput-object v0, p0, Lj3/b;->j:Lh2/a;

    return-void
.end method

.method public static a(Landroidx/compose/ui/node/NodeCoordinator;J)J
    .locals 6

    iget-object p0, p0, Landroidx/compose/ui/node/NodeCoordinator;->i0:La3/a2;

    if-eqz p0, :cond_2

    check-cast p0, Lb3/f2;

    invoke-virtual {p0}, Lb3/f2;->b()[F

    move-result-object p0

    invoke-static {p0}, Ljc/x;->d([F)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    and-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_1

    const-wide p0, 0x7fffffff7fffffffL

    return-wide p0

    :cond_1
    const/16 v0, 0x20

    shr-long v1, p1, v0

    long-to-int v1, v1

    int-to-float v1, v1

    const-wide v2, 0xffffffffL

    and-long/2addr p1, v2

    long-to-int p1, p1

    int-to-float p1, p1

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    int-to-long v4, p2

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long p1, p1

    shl-long v0, v4, v0

    and-long/2addr p1, v2

    or-long/2addr p1, v0

    invoke-static {p1, p2, p0}, Li2/l0;->b(J[F)J

    move-result-wide p0

    invoke-static {p0, p1}, Lvo/b;->C(J)J

    move-result-wide p0

    return-wide p0

    :cond_2
    :goto_0
    return-wide p1
.end method

.method public static h(La3/n0;)J
    .locals 6

    iget-object p0, p0, La3/n0;->e0:La3/l1;

    iget-object v0, p0, La3/l1;->e:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/node/NodeCoordinator;

    iget-object p0, p0, La3/l1;->d:Ljava/lang/Object;

    check-cast p0, Landroidx/compose/ui/node/a;

    const-wide/16 v1, 0x0

    :goto_0
    if-eqz p0, :cond_1

    if-eq p0, v0, :cond_1

    invoke-static {p0, v1, v2}, Lj3/b;->a(Landroidx/compose/ui/node/NodeCoordinator;J)J

    move-result-wide v1

    const-wide v3, 0x7fffffff7fffffffL

    invoke-static {v1, v2, v3, v4}, Ly3/j;->b(JJ)Z

    move-result v5

    if-eqz v5, :cond_0

    return-wide v3

    :cond_0
    iget-wide v3, p0, Landroidx/compose/ui/node/NodeCoordinator;->Z:J

    invoke-static {v1, v2, v3, v4}, Ly3/j;->d(JJ)J

    move-result-wide v1

    iget-object p0, p0, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    goto :goto_0

    :cond_1
    return-wide v1
.end method

.method public static i(La3/n0;)V
    .locals 10

    iget-object v0, p0, La3/n0;->e0:La3/l1;

    iget-object v0, v0, La3/l1;->e:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/node/NodeCoordinator;

    const-wide/16 v1, 0x0

    invoke-static {v0, v1, v2}, Lj3/b;->a(Landroidx/compose/ui/node/NodeCoordinator;J)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljc/x;->h(J)Z

    move-result v3

    const-wide v4, 0x7fffffff7fffffffL

    if-nez v3, :cond_0

    iput-wide v4, p0, La3/n0;->y:J

    return-void

    :cond_0
    iget-wide v6, v0, Landroidx/compose/ui/node/NodeCoordinator;->Z:J

    invoke-static {v1, v2, v6, v7}, Ly3/j;->d(JJ)J

    move-result-wide v0

    invoke-virtual {p0}, La3/n0;->G()La3/n0;

    move-result-object v2

    if-eqz v2, :cond_5

    iget-wide v6, v2, La3/n0;->y:J

    invoke-static {v6, v7}, Ljc/x;->h(J)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-static {v2}, Lj3/b;->i(La3/n0;)V

    :cond_1
    iget-wide v6, v2, La3/n0;->y:J

    invoke-static {v6, v7}, Ljc/x;->h(J)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    iget-boolean v3, v2, La3/n0;->F:Z

    if-eqz v3, :cond_3

    invoke-static {v2}, Lj3/b;->h(La3/n0;)J

    move-result-wide v8

    iput-wide v8, v2, La3/n0;->E:J

    const/4 v3, 0x0

    iput-boolean v3, v2, La3/n0;->F:Z

    goto :goto_0

    :cond_3
    iget-wide v8, v2, La3/n0;->E:J

    :goto_0
    invoke-static {v8, v9}, Ljc/x;->h(J)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_1

    :cond_4
    invoke-static {v6, v7, v8, v9}, Ly3/j;->d(JJ)J

    move-result-wide v2

    invoke-static {v2, v3, v0, v1}, Ly3/j;->d(JJ)J

    move-result-wide v4

    goto :goto_1

    :cond_5
    move-wide v4, v0

    :goto_1
    iput-wide v4, p0, La3/n0;->y:J

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 36

    move-object/from16 v0, p0

    sget-object v1, Lb2/c;->a:Landroid/os/Handler;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    iget-boolean v1, v0, Lj3/b;->d:Z

    const/4 v12, 0x0

    if-nez v1, :cond_1

    iget-boolean v2, v0, Lj3/b;->e:Z

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move v13, v12

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v13, 0x1

    :goto_1
    const-wide/16 v16, 0xff

    const/16 v18, 0x7

    const-wide v19, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    iget-object v2, v0, Lj3/b;->a:Lae3/k;

    const/16 v3, 0x8

    iget-object v4, v0, Lj3/b;->b:Lj3/e;

    if-eqz v1, :cond_e

    iput-boolean v12, v0, Lj3/b;->d:Z

    iget-object v1, v0, Lj3/b;->c:La0/q0;

    iget-object v5, v1, La0/q0;->a:[Ljava/lang/Object;

    iget v1, v1, La0/q0;->b:I

    move v6, v12

    :goto_2
    if-ge v6, v1, :cond_2

    aget-object v7, v5, v6

    check-cast v7, Lc93/a;

    invoke-interface {v7}, Lc93/a;->invoke()Ljava/lang/Object;

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_2
    iget-object v1, v2, Lae3/k;->c:Ljava/lang/Object;

    check-cast v1, [J

    iget v5, v2, Lae3/k;->b:I

    move v6, v12

    :goto_3
    array-length v7, v1

    add-int/lit8 v7, v7, -0x2

    if-ge v6, v7, :cond_4

    if-ge v6, v5, :cond_4

    add-int/lit8 v7, v6, 0x2

    move-wide/from16 v21, v9

    const v10, 0x3ffffff

    aget-wide v8, v1, v7

    const/16 v7, 0x3d

    move/from16 v24, v10

    const/16 v23, 0x1

    shr-long v10, v8, v7

    long-to-int v7, v10

    and-int/lit8 v7, v7, 0x1

    if-eqz v7, :cond_3

    aget-wide v10, v1, v6

    add-int/lit8 v7, v6, 0x1

    aget-wide v25, v1, v7

    long-to-int v7, v8

    and-int v7, v7, v24

    iget-object v8, v4, Lj3/e;->a:La0/g0;

    invoke-virtual {v8, v7}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lj3/d;

    :goto_4
    if-eqz v7, :cond_3

    move-object v14, v2

    move v15, v3

    move-object v2, v4

    move-object v3, v7

    move-wide/from16 v8, v21

    const-wide/16 v21, 0x80

    move-wide/from16 v34, v10

    move v10, v5

    move v11, v6

    move-wide/from16 v4, v34

    move-wide/from16 v6, v25

    invoke-virtual/range {v2 .. v9}, Lj3/e;->b(Lj3/d;JJJ)V

    iget-object v3, v3, Lj3/d;->d:Lj3/d;

    move-wide/from16 v21, v8

    move v6, v11

    move-object v7, v3

    move v3, v15

    move-object v4, v2

    move v5, v10

    move-object v2, v14

    move-wide/from16 v10, v34

    goto :goto_4

    :cond_3
    move-object v14, v2

    move v15, v3

    move-object v2, v4

    move v10, v5

    move v11, v6

    move-wide/from16 v8, v21

    const-wide/16 v21, 0x80

    add-int/lit8 v6, v11, 0x3

    move-object v4, v2

    move v5, v10

    move-object v2, v14

    move v3, v15

    move-wide v9, v8

    goto :goto_3

    :cond_4
    move-object v14, v2

    move v15, v3

    move-object v2, v4

    move-wide v8, v9

    const-wide/16 v21, 0x80

    const v24, 0x3ffffff

    iget-object v1, v2, Lj3/e;->a:La0/g0;

    iget-object v3, v1, La0/s;->c:[Ljava/lang/Object;

    iget-object v1, v1, La0/s;->a:[J

    array-length v4, v1

    add-int/lit8 v4, v4, -0x2

    if-ltz v4, :cond_c

    move v5, v12

    :goto_5
    aget-wide v6, v1, v5

    not-long v10, v6

    shl-long v10, v10, v18

    and-long/2addr v10, v6

    and-long v10, v10, v19

    cmp-long v10, v10, v19

    if-eqz v10, :cond_b

    sub-int v10, v5, v4

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    rsub-int/lit8 v10, v10, 0x8

    move v11, v12

    :goto_6
    if-ge v11, v10, :cond_a

    and-long v25, v6, v16

    cmp-long v23, v25, v21

    if-gez v23, :cond_9

    shl-int/lit8 v23, v5, 0x3

    add-int v23, v23, v11

    aget-object v23, v3, v23

    move-object/from16 v12, v23

    check-cast v12, Lj3/d;

    move/from16 v23, v15

    move-object v15, v12

    :goto_7
    if-eqz v15, :cond_8

    move-wide/from16 v26, v6

    iget-wide v6, v12, Lj3/d;->g:J

    const-wide/high16 v28, -0x8000000000000000L

    cmp-long v6, v6, v28

    if-nez v6, :cond_6

    iget v6, v12, Lj3/d;->a:I

    new-instance v7, Lj3/a;

    invoke-direct {v7, v0, v12, v8, v9}, Lj3/a;-><init>(Lj3/b;Lj3/d;J)V

    and-int v6, v6, v24

    move-object/from16 v28, v1

    iget-object v1, v14, Lae3/k;->c:Ljava/lang/Object;

    check-cast v1, [J

    move-object/from16 v29, v3

    iget v3, v14, Lae3/k;->b:I

    move-wide/from16 v30, v8

    const/4 v8, 0x0

    :goto_8
    array-length v9, v1

    add-int/lit8 v9, v9, -0x2

    if-ge v8, v9, :cond_7

    if-ge v8, v3, :cond_7

    add-int/lit8 v9, v8, 0x2

    move/from16 v32, v8

    aget-wide v8, v1, v9

    long-to-int v8, v8

    and-int v8, v8, v24

    if-ne v8, v6, :cond_5

    aget-wide v8, v1, v32

    add-int/lit8 v3, v32, 0x1

    aget-wide v32, v1, v3

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static/range {v32 .. v33}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v7, v1, v3}, Lj3/a;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_9

    :cond_5
    add-int/lit8 v8, v32, 0x3

    goto :goto_8

    :cond_6
    move-object/from16 v28, v1

    move-object/from16 v29, v3

    move-wide/from16 v30, v8

    :cond_7
    :goto_9
    iget-object v15, v15, Lj3/d;->d:Lj3/d;

    move-wide/from16 v6, v26

    move-object/from16 v1, v28

    move-object/from16 v3, v29

    move-wide/from16 v8, v30

    goto :goto_7

    :cond_8
    :goto_a
    move-object/from16 v28, v1

    move-object/from16 v29, v3

    move-wide/from16 v26, v6

    move-wide/from16 v30, v8

    goto :goto_b

    :cond_9
    move/from16 v23, v15

    goto :goto_a

    :goto_b
    shr-long v6, v26, v23

    add-int/lit8 v11, v11, 0x1

    move/from16 v15, v23

    move-object/from16 v1, v28

    move-object/from16 v3, v29

    move-wide/from16 v8, v30

    const/4 v12, 0x0

    goto/16 :goto_6

    :cond_a
    move-object/from16 v28, v1

    move-object/from16 v29, v3

    move-wide/from16 v30, v8

    if-ne v10, v15, :cond_d

    goto :goto_c

    :cond_b
    move-object/from16 v28, v1

    move-object/from16 v29, v3

    move-wide/from16 v30, v8

    :goto_c
    if-eq v5, v4, :cond_d

    add-int/lit8 v5, v5, 0x1

    move-object/from16 v1, v28

    move-object/from16 v3, v29

    move-wide/from16 v8, v30

    const/4 v12, 0x0

    const/16 v15, 0x8

    goto/16 :goto_5

    :cond_c
    move-wide/from16 v30, v8

    :cond_d
    iget-object v1, v14, Lae3/k;->c:Ljava/lang/Object;

    check-cast v1, [J

    iget v3, v14, Lae3/k;->b:I

    const/4 v4, 0x0

    :goto_d
    array-length v5, v1

    add-int/lit8 v5, v5, -0x2

    if-ge v4, v5, :cond_f

    if-ge v4, v3, :cond_f

    add-int/lit8 v5, v4, 0x2

    aget-wide v6, v1, v5

    const-wide v8, -0x2000000000000001L    # -2.681561585988519E154

    and-long/2addr v6, v8

    aput-wide v6, v1, v5

    add-int/lit8 v4, v4, 0x3

    goto :goto_d

    :cond_e
    move-object v14, v2

    move-object v2, v4

    move-wide/from16 v30, v9

    const-wide/16 v21, 0x80

    :cond_f
    iget-boolean v1, v0, Lj3/b;->e:Z

    if-eqz v1, :cond_13

    const/4 v1, 0x0

    iput-boolean v1, v0, Lj3/b;->e:Z

    iget-wide v4, v2, Lj3/e;->d:J

    iget-wide v6, v2, Lj3/e;->e:J

    iget-object v8, v2, Lj3/e;->g:[F

    iget-object v1, v2, Lj3/e;->a:La0/g0;

    iget-object v11, v1, La0/s;->c:[Ljava/lang/Object;

    iget-object v1, v1, La0/s;->a:[J

    array-length v3, v1

    add-int/lit8 v12, v3, -0x2

    if-ltz v12, :cond_13

    const/4 v15, 0x0

    :goto_e
    aget-wide v9, v1, v15

    move-object/from16 v24, v1

    move-object v3, v2

    not-long v1, v9

    shl-long v1, v1, v18

    and-long/2addr v1, v9

    and-long v1, v1, v19

    cmp-long v1, v1, v19

    if-eqz v1, :cond_12

    sub-int v1, v15, v12

    not-int v1, v1

    ushr-int/lit8 v1, v1, 0x1f

    const/16 v23, 0x8

    rsub-int/lit8 v1, v1, 0x8

    move-wide/from16 v26, v9

    const/4 v2, 0x0

    :goto_f
    if-ge v2, v1, :cond_11

    and-long v9, v26, v16

    cmp-long v9, v9, v21

    if-gez v9, :cond_10

    shl-int/lit8 v9, v15, 0x3

    add-int/2addr v9, v2

    aget-object v9, v11, v9

    check-cast v9, Lj3/d;

    :goto_10
    if-eqz v9, :cond_10

    move/from16 v28, v2

    move-object v2, v3

    move-object v3, v9

    move-wide/from16 v9, v30

    invoke-virtual/range {v2 .. v10}, Lj3/e;->a(Lj3/d;JJ[FJ)V

    move-wide/from16 v34, v9

    move-object v10, v2

    move-object v2, v8

    move-wide/from16 v8, v34

    iget-object v3, v3, Lj3/d;->d:Lj3/d;

    move-wide/from16 v30, v8

    move-object v8, v2

    move-object v9, v3

    move-object v3, v10

    move/from16 v2, v28

    goto :goto_10

    :cond_10
    move/from16 v28, v2

    move-object v10, v3

    move-object v2, v8

    move-wide/from16 v8, v30

    const/16 v3, 0x8

    shr-long v26, v26, v3

    add-int/lit8 v23, v28, 0x1

    move-wide/from16 v30, v8

    move-object v3, v10

    move-object v8, v2

    move/from16 v2, v23

    goto :goto_f

    :cond_11
    move-object v10, v3

    move-object v2, v8

    move-wide/from16 v8, v30

    const/16 v3, 0x8

    if-ne v1, v3, :cond_14

    goto :goto_11

    :cond_12
    move-object v10, v3

    move-object v2, v8

    move-wide/from16 v8, v30

    :goto_11
    if-eq v15, v12, :cond_14

    add-int/lit8 v15, v15, 0x1

    move-wide/from16 v30, v8

    move-object/from16 v1, v24

    move-object v8, v2

    move-object v2, v10

    goto :goto_e

    :cond_13
    move-object v10, v2

    move-wide/from16 v8, v30

    :cond_14
    if-eqz v13, :cond_16

    iget-wide v4, v10, Lj3/e;->d:J

    iget-wide v6, v10, Lj3/e;->e:J

    move-wide/from16 v30, v8

    iget-object v8, v10, Lj3/e;->g:[F

    iget-object v1, v10, Lj3/e;->b:Lj3/d;

    if-eqz v1, :cond_15

    move-object v3, v1

    :goto_12
    if-eqz v3, :cond_15

    iget-object v1, v3, Lj3/d;->b:Lb2/v;

    invoke-static {v1}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v1

    iget-wide v11, v1, La3/n0;->y:J

    iget-wide v1, v1, La3/n0;->z:J

    iput-wide v11, v3, Lj3/d;->e:J

    move-object v13, v10

    const/16 v15, 0x20

    shr-long v9, v11, v15

    long-to-int v9, v9

    move-wide/from16 v26, v1

    shr-long v1, v26, v15

    long-to-int v1, v1

    add-int/2addr v9, v1

    const-wide v1, 0xffffffffL

    and-long v10, v11, v1

    long-to-int v10, v10

    and-long v11, v26, v1

    long-to-int v11, v11

    add-int/2addr v10, v11

    int-to-long v11, v9

    shl-long/2addr v11, v15

    int-to-long v9, v10

    and-long/2addr v1, v9

    or-long/2addr v1, v11

    iput-wide v1, v3, Lj3/d;->f:J

    move-object v2, v13

    move-wide/from16 v9, v30

    invoke-virtual/range {v2 .. v10}, Lj3/e;->a(Lj3/d;JJ[FJ)V

    move-object v1, v8

    move-wide v8, v9

    iget-object v3, v3, Lj3/d;->d:Lj3/d;

    move-object v10, v2

    move-wide/from16 v30, v8

    move-object v8, v1

    goto :goto_12

    :cond_15
    move-object v2, v10

    move-wide/from16 v8, v30

    goto :goto_13

    :cond_16
    move-object v2, v10

    :goto_13
    iget-boolean v1, v0, Lj3/b;->f:Z

    if-eqz v1, :cond_19

    const/4 v1, 0x0

    iput-boolean v1, v0, Lj3/b;->f:Z

    iget-object v3, v14, Lae3/k;->c:Ljava/lang/Object;

    check-cast v3, [J

    iget v4, v14, Lae3/k;->b:I

    iget-object v5, v14, Lae3/k;->d:Ljava/lang/Object;

    check-cast v5, [J

    move v6, v1

    move v7, v6

    :goto_14
    array-length v10, v3

    add-int/lit8 v10, v10, -0x2

    if-ge v6, v10, :cond_18

    array-length v10, v5

    add-int/lit8 v10, v10, -0x2

    if-ge v7, v10, :cond_18

    if-ge v6, v4, :cond_18

    add-int/lit8 v10, v6, 0x2

    aget-wide v11, v3, v10

    const-wide v24, 0x1fffffffffffffffL

    cmp-long v11, v11, v24

    if-eqz v11, :cond_17

    aget-wide v11, v3, v6

    aput-wide v11, v5, v7

    add-int/lit8 v11, v7, 0x1

    add-int/lit8 v12, v6, 0x1

    aget-wide v12, v3, v12

    aput-wide v12, v5, v11

    add-int/lit8 v11, v7, 0x2

    aget-wide v12, v3, v10

    aput-wide v12, v5, v11

    add-int/lit8 v7, v7, 0x3

    :cond_17
    add-int/lit8 v6, v6, 0x3

    goto :goto_14

    :cond_18
    iput v7, v14, Lae3/k;->b:I

    iput-object v5, v14, Lae3/k;->c:Ljava/lang/Object;

    iput-object v3, v14, Lae3/k;->d:Ljava/lang/Object;

    goto :goto_15

    :cond_19
    const/4 v1, 0x0

    :goto_15
    iget-wide v3, v2, Lj3/e;->c:J

    cmp-long v3, v3, v8

    if-lez v3, :cond_1a

    return-void

    :cond_1a
    iget-object v3, v2, Lj3/e;->a:La0/g0;

    iget-object v4, v3, La0/s;->c:[Ljava/lang/Object;

    iget-object v3, v3, La0/s;->a:[J

    array-length v5, v3

    add-int/lit8 v5, v5, -0x2

    if-ltz v5, :cond_1e

    move v6, v1

    :goto_16
    aget-wide v7, v3, v6

    not-long v9, v7

    shl-long v9, v9, v18

    and-long/2addr v9, v7

    and-long v9, v9, v19

    cmp-long v9, v9, v19

    if-eqz v9, :cond_1d

    sub-int v9, v6, v5

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    const/16 v23, 0x8

    rsub-int/lit8 v9, v9, 0x8

    move-wide v10, v7

    move v7, v1

    :goto_17
    if-ge v7, v9, :cond_1c

    and-long v12, v10, v16

    cmp-long v8, v12, v21

    if-gez v8, :cond_1b

    shl-int/lit8 v8, v6, 0x3

    add-int/2addr v8, v7

    aget-object v8, v4, v8

    check-cast v8, Lj3/d;

    :goto_18
    if-eqz v8, :cond_1b

    iget-object v8, v8, Lj3/d;->d:Lj3/d;

    goto :goto_18

    :cond_1b
    const/16 v15, 0x8

    shr-long/2addr v10, v15

    add-int/lit8 v7, v7, 0x1

    goto :goto_17

    :cond_1c
    const/16 v15, 0x8

    if-ne v9, v15, :cond_1e

    goto :goto_19

    :cond_1d
    const/16 v15, 0x8

    :goto_19
    if-eq v6, v5, :cond_1e

    add-int/lit8 v6, v6, 0x1

    goto :goto_16

    :cond_1e
    iget-object v1, v2, Lj3/e;->b:Lj3/d;

    if-eqz v1, :cond_1f

    :goto_1a
    if-eqz v1, :cond_1f

    iget-object v1, v1, Lj3/d;->d:Lj3/d;

    goto :goto_1a

    :cond_1f
    const-wide/16 v3, -0x1

    iput-wide v3, v2, Lj3/e;->c:J

    return-void
.end method

.method public final c(La3/n0;Z)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v1, La3/n0;->e0:La3/l1;

    iget-object v3, v2, La3/l1;->e:Ljava/lang/Object;

    check-cast v3, Landroidx/compose/ui/node/NodeCoordinator;

    invoke-virtual {v1}, La3/n0;->z()La3/g1;

    move-result-object v4

    invoke-virtual {v4}, La3/g1;->j0()I

    move-result v5

    invoke-virtual {v4}, La3/g1;->g0()I

    move-result v4

    int-to-float v5, v5

    int-to-float v4, v4

    iget-object v6, v0, Lj3/b;->j:Lh2/a;

    const/4 v7, 0x0

    iput v7, v6, Lh2/a;->a:F

    iput v7, v6, Lh2/a;->b:F

    iput v5, v6, Lh2/a;->c:F

    iput v4, v6, Lh2/a;->d:F

    :goto_0
    const-wide v4, 0xffffffffL

    const/16 v7, 0x20

    if-eqz v3, :cond_1

    iget-object v8, v3, Landroidx/compose/ui/node/NodeCoordinator;->i0:La3/a2;

    if-eqz v8, :cond_0

    check-cast v8, Lb3/f2;

    invoke-virtual {v8}, Lb3/f2;->b()[F

    move-result-object v8

    invoke-static {v8}, Li2/w0;->v([F)Z

    move-result v9

    if-nez v9, :cond_0

    invoke-static {v8, v6}, Li2/l0;->c([FLh2/a;)V

    :cond_0
    iget-wide v8, v3, Landroidx/compose/ui/node/NodeCoordinator;->Z:J

    shr-long v10, v8, v7

    long-to-int v10, v10

    int-to-float v10, v10

    and-long/2addr v8, v4

    long-to-int v8, v8

    int-to-float v8, v8

    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v9

    int-to-long v9, v9

    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    int-to-long v11, v8

    shl-long v8, v9, v7

    and-long v10, v11, v4

    or-long/2addr v8, v10

    shr-long v10, v8, v7

    long-to-int v7, v10

    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    and-long/2addr v4, v8

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    iget v5, v6, Lh2/a;->a:F

    add-float/2addr v5, v7

    iput v5, v6, Lh2/a;->a:F

    iget v5, v6, Lh2/a;->b:F

    add-float/2addr v5, v4

    iput v5, v6, Lh2/a;->b:F

    iget v5, v6, Lh2/a;->c:F

    add-float/2addr v5, v7

    iput v5, v6, Lh2/a;->c:F

    iget v5, v6, Lh2/a;->d:F

    add-float/2addr v5, v4

    iput v5, v6, Lh2/a;->d:F

    iget-object v3, v3, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    goto :goto_0

    :cond_1
    iget v3, v6, Lh2/a;->a:F

    float-to-int v10, v3

    iget v3, v6, Lh2/a;->b:F

    float-to-int v11, v3

    iget v3, v6, Lh2/a;->c:F

    float-to-int v12, v3

    iget v3, v6, Lh2/a;->d:F

    float-to-int v13, v3

    iget v9, v1, La3/n0;->x:I

    iget-object v8, v0, Lj3/b;->a:Lae3/k;

    if-nez p2, :cond_3

    const v6, 0x3ffffff

    and-int v14, v9, v6

    iget-object v15, v8, Lae3/k;->c:Ljava/lang/Object;

    check-cast v15, [J

    move-wide/from16 v16, v4

    iget v4, v8, Lae3/k;->b:I

    const/4 v5, 0x0

    move/from16 p2, v6

    :goto_1
    array-length v6, v15

    add-int/lit8 v6, v6, -0x2

    if-ge v5, v6, :cond_3

    if-ge v5, v4, :cond_3

    add-int/lit8 v6, v5, 0x2

    move/from16 v18, v7

    move-object/from16 v19, v8

    aget-wide v7, v15, v6

    const/16 v20, 0x1

    long-to-int v3, v7

    and-int v3, v3, p2

    if-ne v3, v14, :cond_2

    int-to-long v1, v10

    shl-long v1, v1, v18

    int-to-long v3, v11

    and-long v3, v3, v16

    or-long/2addr v1, v3

    aput-wide v1, v15, v5

    add-int/lit8 v5, v5, 0x1

    int-to-long v1, v12

    shl-long v1, v1, v18

    int-to-long v3, v13

    and-long v3, v3, v16

    or-long/2addr v1, v3

    aput-wide v1, v15, v5

    const-wide/high16 v1, 0x2000000000000000L

    or-long/2addr v1, v7

    aput-wide v1, v15, v6

    :goto_2
    move/from16 v1, v20

    goto :goto_5

    :cond_2
    add-int/lit8 v5, v5, 0x3

    move/from16 v7, v18

    move-object/from16 v8, v19

    goto :goto_1

    :cond_3
    move-object/from16 v19, v8

    const/16 v20, 0x1

    invoke-virtual {v1}, La3/n0;->G()La3/n0;

    move-result-object v1

    if-eqz v1, :cond_4

    iget v1, v1, La3/n0;->x:I

    :goto_3
    move v14, v1

    goto :goto_4

    :cond_4
    const/4 v1, -0x1

    goto :goto_3

    :goto_4
    const/16 v1, 0x400

    invoke-virtual {v2, v1}, La3/l1;->j(I)Z

    move-result v15

    const/16 v1, 0x10

    invoke-virtual {v2, v1}, La3/l1;->j(I)Z

    move-result v16

    move-object/from16 v8, v19

    invoke-virtual/range {v8 .. v16}, Lae3/k;->d(IIIIIIZZ)V

    goto :goto_2

    :goto_5
    iput-boolean v1, v0, Lj3/b;->d:Z

    return-void
.end method

.method public final d(La3/n0;)V
    .locals 4

    invoke-virtual {p1}, La3/n0;->M()Lr1/c;

    move-result-object p1

    iget-object v0, p1, Lr1/c;->w:[Ljava/lang/Object;

    iget p1, p1, Lr1/c;->y:I

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, p1, :cond_0

    aget-object v3, v0, v2

    check-cast v3, La3/n0;

    invoke-virtual {p0, v3, v1}, Lj3/b;->c(La3/n0;Z)V

    invoke-virtual {p0, v3}, Lj3/b;->d(La3/n0;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final e(La3/n0;)V
    .locals 8

    const/4 v0, 0x1

    iput-boolean v0, p0, Lj3/b;->d:Z

    iget p1, p1, La3/n0;->x:I

    const v0, 0x3ffffff

    and-int/2addr p1, v0

    iget-object v1, p0, Lj3/b;->a:Lae3/k;

    iget-object v2, v1, Lae3/k;->c:Ljava/lang/Object;

    check-cast v2, [J

    iget v1, v1, Lae3/k;->b:I

    const/4 v3, 0x0

    :goto_0
    array-length v4, v2

    add-int/lit8 v4, v4, -0x2

    if-ge v3, v4, :cond_1

    if-ge v3, v1, :cond_1

    add-int/lit8 v4, v3, 0x2

    aget-wide v5, v2, v4

    long-to-int v7, v5

    and-int/2addr v7, v0

    if-ne v7, p1, :cond_0

    const-wide/high16 v0, 0x2000000000000000L

    or-long/2addr v0, v5

    aput-wide v0, v2, v4

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x3

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {p0}, Lj3/b;->k()V

    return-void
.end method

.method public final f(La3/n0;)V
    .locals 5

    invoke-static {p1}, Lj3/b;->h(La3/n0;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljc/x;->h(J)Z

    move-result v2

    if-eqz v2, :cond_1

    iput-wide v0, p1, La3/n0;->E:J

    const/4 v0, 0x0

    iput-boolean v0, p1, La3/n0;->F:Z

    invoke-virtual {p1}, La3/n0;->M()Lr1/c;

    move-result-object v1

    iget-object v2, v1, Lr1/c;->w:[Ljava/lang/Object;

    iget v1, v1, Lr1/c;->y:I

    move v3, v0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v2, v3

    check-cast v4, La3/n0;

    invoke-virtual {p0, v4, v0}, Lj3/b;->g(La3/n0;Z)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lj3/b;->e(La3/n0;)V

    return-void

    :cond_1
    invoke-virtual {p0, p1}, Lj3/b;->d(La3/n0;)V

    return-void
.end method

.method public final g(La3/n0;Z)V
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v1}, La3/n0;->z()La3/g1;

    move-result-object v2

    invoke-virtual {v2}, La3/g1;->j0()I

    move-result v3

    invoke-virtual {v2}, La3/g1;->g0()I

    move-result v2

    iget-wide v4, v1, La3/n0;->y:J

    iget-wide v6, v1, La3/n0;->z:J

    const/16 v8, 0x20

    shr-long v9, v6, v8

    long-to-int v9, v9

    const-wide v10, 0xffffffffL

    and-long/2addr v6, v10

    long-to-int v6, v6

    invoke-static {v1}, Lj3/b;->i(La3/n0;)V

    iget-wide v12, v1, La3/n0;->y:J

    invoke-static {v12, v13}, Ljc/x;->h(J)Z

    move-result v7

    if-nez v7, :cond_0

    invoke-virtual/range {p0 .. p2}, Lj3/b;->c(La3/n0;Z)V

    return-void

    :cond_0
    int-to-long v14, v3

    shl-long/2addr v14, v8

    move-wide/from16 v16, v10

    int-to-long v10, v2

    and-long v10, v10, v16

    or-long/2addr v10, v14

    iput-wide v10, v1, La3/n0;->z:J

    shr-long v10, v12, v8

    long-to-int v7, v10

    and-long v10, v12, v16

    long-to-int v10, v10

    add-int v11, v7, v3

    add-int v14, v10, v2

    if-nez p2, :cond_1

    invoke-static {v12, v13, v4, v5}, Ly3/j;->b(JJ)Z

    move-result v4

    if-eqz v4, :cond_1

    if-ne v9, v3, :cond_1

    if-ne v6, v2, :cond_1

    return-void

    :cond_1
    iget v2, v1, La3/n0;->x:I

    iget-object v3, v1, La3/n0;->e0:La3/l1;

    iget-object v4, v0, Lj3/b;->a:Lae3/k;

    if-nez p2, :cond_a

    const v6, 0x3ffffff

    and-int v9, v2, v6

    iget-object v12, v4, Lae3/k;->c:Ljava/lang/Object;

    check-cast v12, [J

    iget v13, v4, Lae3/k;->b:I

    move/from16 p2, v6

    move/from16 v18, v8

    const/4 v6, 0x0

    :goto_0
    array-length v8, v12

    add-int/lit8 v8, v8, -0x2

    if-ge v6, v8, :cond_a

    if-ge v6, v13, :cond_a

    add-int/lit8 v8, v6, 0x2

    move/from16 v19, v6

    aget-wide v5, v12, v8

    const/16 v20, 0x0

    long-to-int v15, v5

    and-int v15, v15, p2

    if-ne v15, v9, :cond_9

    aget-wide v1, v12, v19

    move-wide/from16 v21, v5

    int-to-long v5, v7

    shl-long v5, v5, v18

    move-wide/from16 v23, v5

    int-to-long v5, v10

    and-long v5, v5, v16

    or-long v5, v23, v5

    aput-wide v5, v12, v19

    add-int/lit8 v6, v19, 0x1

    move/from16 p1, v6

    int-to-long v5, v11

    shl-long v5, v5, v18

    int-to-long v13, v14

    and-long v13, v13, v16

    or-long/2addr v5, v13

    aput-wide v5, v12, p1

    const-wide/high16 v5, 0x2000000000000000L

    or-long v13, v21, v5

    aput-wide v13, v12, v8

    shr-long v8, v1, v18

    long-to-int v3, v8

    sub-int/2addr v7, v3

    long-to-int v1, v1

    sub-int/2addr v10, v1

    if-eqz v7, :cond_2

    const/4 v1, 0x1

    goto :goto_1

    :cond_2
    move/from16 v1, v20

    :goto_1
    if-eqz v10, :cond_3

    const/4 v2, 0x1

    goto :goto_2

    :cond_3
    move/from16 v2, v20

    :goto_2
    or-int/2addr v1, v2

    if-eqz v1, :cond_8

    add-int/lit8 v1, v19, 0x3

    const-wide v2, -0xffffffc000001L

    and-long v8, v21, v2

    and-int v1, v1, p2

    int-to-long v11, v1

    const/16 v1, 0x1a

    shl-long/2addr v11, v1

    or-long/2addr v8, v11

    iget-object v11, v4, Lae3/k;->c:Ljava/lang/Object;

    check-cast v11, [J

    iget-object v12, v4, Lae3/k;->d:Ljava/lang/Object;

    check-cast v12, [J

    iget v4, v4, Lae3/k;->b:I

    div-int/lit8 v4, v4, 0x3

    aput-wide v8, v12, v20

    const/4 v8, 0x1

    :goto_3
    if-lez v8, :cond_8

    add-int/lit8 v8, v8, -0x1

    aget-wide v13, v12, v8

    long-to-int v9, v13

    and-int v9, v9, p2

    move/from16 p1, v1

    move-wide/from16 v21, v2

    shr-long v1, v13, p1

    long-to-int v1, v1

    and-int v1, v1, p2

    const/16 v2, 0x34

    shr-long/2addr v13, v2

    long-to-int v3, v13

    const/16 v13, 0x1ff

    and-int/2addr v3, v13

    if-ne v3, v13, :cond_4

    move v3, v4

    goto :goto_4

    :cond_4
    add-int/2addr v3, v1

    :goto_4
    if-ltz v1, :cond_8

    :goto_5
    array-length v14, v11

    add-int/lit8 v14, v14, -0x2

    if-ge v1, v14, :cond_7

    if-ge v1, v3, :cond_7

    add-int/lit8 v14, v1, 0x2

    aget-wide v19, v11, v14

    move v15, v2

    move/from16 v23, v3

    shr-long v2, v19, p1

    long-to-int v2, v2

    and-int v2, v2, p2

    if-ne v2, v9, :cond_5

    aget-wide v2, v11, v1

    add-int/lit8 v24, v1, 0x1

    move-wide/from16 v25, v5

    aget-wide v5, v11, v24

    move/from16 v27, v14

    shr-long v13, v2, v18

    long-to-int v13, v13

    add-int/2addr v13, v7

    long-to-int v2, v2

    add-int/2addr v2, v10

    int-to-long v13, v13

    shl-long v13, v13, v18

    int-to-long v2, v2

    and-long v2, v2, v16

    or-long/2addr v2, v13

    aput-wide v2, v11, v1

    shr-long v2, v5, v18

    long-to-int v2, v2

    add-int/2addr v2, v7

    long-to-int v3, v5

    add-int/2addr v3, v10

    int-to-long v5, v2

    shl-long v5, v5, v18

    int-to-long v2, v3

    and-long v2, v2, v16

    or-long/2addr v2, v5

    aput-wide v2, v11, v24

    or-long v2, v19, v25

    aput-wide v2, v11, v27

    shr-long v2, v19, v15

    long-to-int v2, v2

    const/16 v3, 0x1ff

    and-int/2addr v2, v3

    if-lez v2, :cond_6

    add-int/lit8 v2, v8, 0x1

    add-int/lit8 v5, v1, 0x3

    and-long v13, v19, v21

    and-int v5, v5, p2

    int-to-long v5, v5

    shl-long v5, v5, p1

    or-long/2addr v5, v13

    aput-wide v5, v12, v8

    move v8, v2

    goto :goto_6

    :cond_5
    move-wide/from16 v25, v5

    move v3, v13

    :cond_6
    :goto_6
    add-int/lit8 v1, v1, 0x3

    move v13, v3

    move v2, v15

    move/from16 v3, v23

    move-wide/from16 v5, v25

    goto :goto_5

    :cond_7
    move-wide/from16 v25, v5

    move/from16 v1, p1

    move-wide/from16 v2, v21

    move-wide/from16 v5, v25

    goto/16 :goto_3

    :cond_8
    :goto_7
    const/4 v1, 0x1

    goto :goto_a

    :cond_9
    add-int/lit8 v6, v19, 0x3

    goto/16 :goto_0

    :cond_a
    invoke-virtual {v1}, La3/n0;->G()La3/n0;

    move-result-object v1

    if-eqz v1, :cond_b

    iget v1, v1, La3/n0;->x:I

    :goto_8
    move/from16 v24, v1

    goto :goto_9

    :cond_b
    const/4 v1, -0x1

    goto :goto_8

    :goto_9
    const/16 v1, 0x400

    invoke-virtual {v3, v1}, La3/l1;->j(I)Z

    move-result v25

    const/16 v1, 0x10

    invoke-virtual {v3, v1}, La3/l1;->j(I)Z

    move-result v26

    move/from16 v19, v2

    move-object/from16 v18, v4

    move/from16 v20, v7

    move/from16 v21, v10

    move/from16 v22, v11

    move/from16 v23, v14

    invoke-virtual/range {v18 .. v26}, Lae3/k;->d(IIIIIIZZ)V

    goto :goto_7

    :goto_a
    iput-boolean v1, v0, Lj3/b;->d:Z

    return-void
.end method

.method public final j(La3/n0;)V
    .locals 8

    iget p1, p1, La3/n0;->x:I

    const v0, 0x3ffffff

    and-int/2addr p1, v0

    iget-object v1, p0, Lj3/b;->a:Lae3/k;

    iget-object v2, v1, Lae3/k;->c:Ljava/lang/Object;

    check-cast v2, [J

    iget v1, v1, Lae3/k;->b:I

    const/4 v3, 0x0

    :goto_0
    array-length v4, v2

    add-int/lit8 v4, v4, -0x2

    const/4 v5, 0x1

    if-ge v3, v4, :cond_1

    if-ge v3, v1, :cond_1

    add-int/lit8 v4, v3, 0x2

    aget-wide v6, v2, v4

    long-to-int v6, v6

    and-int/2addr v6, v0

    if-ne v6, p1, :cond_0

    const-wide/16 v0, -0x1

    aput-wide v0, v2, v3

    add-int/2addr v3, v5

    aput-wide v0, v2, v3

    const-wide v0, 0x1fffffffffffffffL

    aput-wide v0, v2, v4

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x3

    goto :goto_0

    :cond_1
    :goto_1
    iput-boolean v5, p0, Lj3/b;->d:Z

    iput-boolean v5, p0, Lj3/b;->f:Z

    return-void
.end method

.method public final k()V
    .locals 9

    iget-object v0, p0, Lj3/b;->g:Lb2/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    iget-object v3, p0, Lj3/b;->b:Lj3/e;

    iget-wide v3, v3, Lj3/e;->c:J

    const-wide/16 v5, 0x0

    cmp-long v5, v3, v5

    if-gez v5, :cond_1

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    iget-wide v5, p0, Lj3/b;->h:J

    cmp-long v5, v5, v3

    if-nez v5, :cond_2

    if-eqz v2, :cond_2

    :goto_1
    return-void

    :cond_2
    if-eqz v0, :cond_3

    sget-object v2, Lb2/c;->a:Landroid/os/Handler;

    sget-object v2, Lb2/c;->a:Landroid/os/Handler;

    invoke-virtual {v2, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_3
    sget-object v0, Lb2/c;->a:Landroid/os/Handler;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const/16 v0, 0x10

    int-to-long v7, v0

    add-long/2addr v7, v5

    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    iput-wide v2, p0, Lj3/b;->h:J

    sub-long/2addr v2, v5

    new-instance v0, Lb2/b;

    iget-object v4, p0, Lj3/b;->i:La3/l0;

    invoke-direct {v0, v4, v1}, Lb2/b;-><init>(Lc93/a;I)V

    sget-object v1, Lb2/c;->a:Landroid/os/Handler;

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    iput-object v0, p0, Lj3/b;->g:Lb2/b;

    return-void
.end method
