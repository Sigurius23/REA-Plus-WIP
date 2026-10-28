.class public final Ll3/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Ll3/v0;


# instance fields
.field public final a:Ll3/m0;

.field public final b:Ll3/b0;

.field public final c:Ll3/g0;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Ll3/v0;

    const-wide/16 v13, 0x0

    const v15, 0xffffff

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v0 .. v15}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    sput-object v0, Ll3/v0;->d:Ll3/v0;

    return-void
.end method

.method public constructor <init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V
    .locals 25

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 9
    sget-wide v1, Li2/x;->n:J

    move-wide v4, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    .line 10
    sget-wide v1, Ly3/o;->c:J

    move-wide v6, v1

    goto :goto_1

    :cond_1
    move-wide/from16 v6, p3

    :goto_1
    and-int/lit8 v1, v0, 0x4

    const/16 v22, 0x0

    if-eqz v1, :cond_2

    move-object/from16 v8, v22

    goto :goto_2

    :cond_2
    move-object/from16 v8, p5

    :goto_2
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_3

    move-object/from16 v9, v22

    goto :goto_3

    :cond_3
    move-object/from16 v9, p6

    :goto_3
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_4

    move-object/from16 v11, v22

    goto :goto_4

    :cond_4
    move-object/from16 v11, p7

    :goto_4
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_5

    .line 11
    sget-wide v1, Ly3/o;->c:J

    move-wide v13, v1

    goto :goto_5

    :cond_5
    move-wide/from16 v13, p8

    .line 12
    :goto_5
    sget-wide v18, Li2/x;->n:J

    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_6

    move-object/from16 v20, v22

    goto :goto_6

    :cond_6
    move-object/from16 v20, p10

    :goto_6
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_7

    move-object/from16 v21, v22

    goto :goto_7

    :cond_7
    move-object/from16 v21, p11

    :goto_7
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_8

    const/high16 v1, -0x80000000

    goto :goto_8

    :cond_8
    move/from16 v1, p12

    :goto_8
    const/high16 v2, 0x20000

    and-int/2addr v0, v2

    if-eqz v0, :cond_9

    .line 13
    sget-wide v2, Ly3/o;->c:J

    move-wide/from16 v23, v2

    goto :goto_9

    :cond_9
    move-wide/from16 v23, p13

    .line 14
    :goto_9
    new-instance v3, Ll3/m0;

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v3 .. v22}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;Ll3/f0;)V

    .line 15
    new-instance v0, Ll3/b0;

    const/high16 v2, -0x80000000

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/high16 v7, -0x80000000

    const/4 v8, 0x0

    move-object/from16 p1, v0

    move/from16 p2, v1

    move/from16 p3, v2

    move-object/from16 p6, v4

    move-object/from16 p8, v5

    move/from16 p9, v6

    move/from16 p10, v7

    move-object/from16 p11, v8

    move-object/from16 p7, v22

    move-wide/from16 p4, v23

    invoke-direct/range {p1 .. p11}, Ll3/b0;-><init>(IIJLw3/q;Ll3/e0;Lw3/i;IILw3/s;)V

    const/4 v1, 0x0

    move-object/from16 v2, p0

    .line 16
    invoke-direct {v2, v3, v0, v1}, Ll3/v0;-><init>(Ll3/m0;Ll3/b0;Ll3/g0;)V

    return-void
.end method

.method public constructor <init>(Ll3/m0;Ll3/b0;)V
    .locals 3

    .line 5
    iget-object v0, p1, Ll3/m0;->o:Ll3/f0;

    .line 6
    iget-object v1, p2, Ll3/b0;->e:Ll3/e0;

    if-nez v0, :cond_0

    if-nez v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 7
    :cond_0
    new-instance v2, Ll3/g0;

    invoke-direct {v2, v0, v1}, Ll3/g0;-><init>(Ll3/f0;Ll3/e0;)V

    move-object v0, v2

    .line 8
    :goto_0
    invoke-direct {p0, p1, p2, v0}, Ll3/v0;-><init>(Ll3/m0;Ll3/b0;Ll3/g0;)V

    return-void
.end method

.method public constructor <init>(Ll3/m0;Ll3/b0;Ll3/g0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ll3/v0;->a:Ll3/m0;

    .line 3
    iput-object p2, p0, Ll3/v0;->b:Ll3/b0;

    .line 4
    iput-object p3, p0, Ll3/v0;->c:Ll3/g0;

    return-void
.end method

.method public static a(Ll3/v0;Li2/t;JLp3/r;Lp3/i;JI)Ll3/v0;
    .locals 34

    move-object/from16 v0, p0

    iget-object v1, v0, Ll3/v0;->a:Ll3/m0;

    iget-object v1, v1, Ll3/m0;->a:Lw3/o;

    invoke-interface {v1}, Lw3/o;->a()F

    move-result v4

    and-int/lit8 v1, p8, 0x4

    if-eqz v1, :cond_0

    iget-object v1, v0, Ll3/v0;->a:Ll3/m0;

    iget-wide v1, v1, Ll3/m0;->b:J

    move-wide v5, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v5, p2

    :goto_0
    and-int/lit8 v1, p8, 0x8

    if-eqz v1, :cond_1

    iget-object v1, v0, Ll3/v0;->a:Ll3/m0;

    iget-object v1, v1, Ll3/m0;->c:Lp3/r;

    move-object v7, v1

    goto :goto_1

    :cond_1
    move-object/from16 v7, p4

    :goto_1
    iget-object v1, v0, Ll3/v0;->a:Ll3/m0;

    iget-object v8, v1, Ll3/m0;->d:Lp3/n;

    iget-object v9, v1, Ll3/m0;->e:Lp3/o;

    and-int/lit8 v2, p8, 0x40

    if-eqz v2, :cond_2

    iget-object v2, v1, Ll3/m0;->f:Lp3/i;

    move-object v10, v2

    goto :goto_2

    :cond_2
    move-object/from16 v10, p5

    :goto_2
    iget-object v11, v1, Ll3/m0;->g:Ljava/lang/String;

    iget-wide v12, v1, Ll3/m0;->h:J

    iget-object v14, v1, Ll3/m0;->i:Lw3/a;

    iget-object v15, v1, Ll3/m0;->j:Lw3/p;

    iget-object v2, v1, Ll3/m0;->k:Ls3/b;

    move-object/from16 v16, v2

    iget-wide v2, v1, Ll3/m0;->l:J

    move-wide/from16 v17, v2

    iget-object v2, v1, Ll3/m0;->m:Lw3/l;

    iget-object v3, v1, Ll3/m0;->n:Li2/z0;

    iget-object v1, v1, Ll3/m0;->p:Lk2/f;

    move-object/from16 v22, v1

    iget-object v1, v0, Ll3/v0;->b:Ll3/b0;

    move-object/from16 v19, v2

    iget v2, v1, Ll3/b0;->a:I

    move/from16 v24, v2

    iget v2, v1, Ll3/b0;->b:I

    const/high16 v20, 0x40000

    and-int v20, p8, v20

    move/from16 v25, v2

    if-eqz v20, :cond_3

    move-object/from16 v20, v3

    iget-wide v2, v1, Ll3/b0;->c:J

    move-wide/from16 v26, v2

    goto :goto_3

    :cond_3
    move-object/from16 v20, v3

    move-wide/from16 v26, p6

    :goto_3
    iget-object v2, v1, Ll3/b0;->d:Lw3/q;

    iget-object v3, v0, Ll3/v0;->c:Ll3/g0;

    iget-object v0, v1, Ll3/b0;->f:Lw3/i;

    move-object/from16 v30, v0

    iget v0, v1, Ll3/b0;->g:I

    move/from16 v31, v0

    iget v0, v1, Ll3/b0;->h:I

    iget-object v1, v1, Ll3/b0;->i:Lw3/s;

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v32, v0

    new-instance v0, Ll3/v0;

    move-object/from16 v28, v2

    new-instance v2, Ll3/m0;

    const/16 v23, 0x0

    move-object/from16 v33, v1

    if-eqz v3, :cond_4

    iget-object v1, v3, Ll3/g0;->a:Ll3/f0;

    move-object/from16 v21, v1

    :goto_4
    move-object v1, v3

    move-object/from16 v3, p1

    goto :goto_5

    :cond_4
    move-object/from16 v21, v23

    goto :goto_4

    :goto_5
    invoke-direct/range {v2 .. v22}, Ll3/m0;-><init>(Li2/t;FJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;Ll3/f0;Lk2/f;)V

    move-object/from16 v3, v23

    new-instance v23, Ll3/b0;

    if-eqz v1, :cond_5

    iget-object v3, v1, Ll3/g0;->b:Ll3/e0;

    :cond_5
    move-object/from16 v29, v3

    invoke-direct/range {v23 .. v33}, Ll3/b0;-><init>(IIJLw3/q;Ll3/e0;Lw3/i;IILw3/s;)V

    move-object/from16 v3, v23

    invoke-direct {v0, v2, v3, v1}, Ll3/v0;-><init>(Ll3/m0;Ll3/b0;Ll3/g0;)V

    return-object v0
.end method

.method public static b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;
    .locals 29

    move-object/from16 v0, p0

    move/from16 v1, p14

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Ll3/v0;->a:Ll3/m0;

    iget-object v2, v2, Ll3/m0;->a:Lw3/o;

    invoke-interface {v2}, Lw3/o;->b()J

    move-result-wide v2

    goto :goto_0

    :cond_0
    move-wide/from16 v2, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget-object v4, v0, Ll3/v0;->a:Ll3/m0;

    iget-wide v4, v4, Ll3/m0;->b:J

    move-wide v8, v4

    goto :goto_1

    :cond_1
    move-wide/from16 v8, p3

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Ll3/v0;->a:Ll3/m0;

    iget-object v4, v4, Ll3/m0;->c:Lp3/r;

    move-object v10, v4

    goto :goto_2

    :cond_2
    move-object/from16 v10, p5

    :goto_2
    iget-object v4, v0, Ll3/v0;->a:Ll3/m0;

    iget-object v11, v4, Ll3/m0;->d:Lp3/n;

    iget-object v12, v4, Ll3/m0;->e:Lp3/o;

    and-int/lit8 v5, v1, 0x20

    if-eqz v5, :cond_3

    iget-object v5, v4, Ll3/m0;->f:Lp3/i;

    move-object v13, v5

    goto :goto_3

    :cond_3
    move-object/from16 v13, p6

    :goto_3
    iget-object v14, v4, Ll3/m0;->g:Ljava/lang/String;

    and-int/lit16 v5, v1, 0x80

    if-eqz v5, :cond_4

    iget-wide v5, v4, Ll3/m0;->h:J

    move-wide v15, v5

    goto :goto_4

    :cond_4
    move-wide/from16 v15, p7

    :goto_4
    iget-object v5, v4, Ll3/m0;->i:Lw3/a;

    iget-object v6, v4, Ll3/m0;->j:Lw3/p;

    iget-object v7, v4, Ll3/m0;->k:Ls3/b;

    move-object/from16 v17, v5

    move-object/from16 v18, v6

    iget-wide v5, v4, Ll3/m0;->l:J

    move-wide/from16 v20, v5

    and-int/lit16 v5, v1, 0x1000

    if-eqz v5, :cond_5

    iget-object v5, v4, Ll3/m0;->m:Lw3/l;

    :goto_5
    move-object/from16 v22, v5

    goto :goto_6

    :cond_5
    sget-object v5, Lw3/l;->d:Lw3/l;

    goto :goto_5

    :goto_6
    iget-object v5, v4, Ll3/m0;->n:Li2/z0;

    iget-object v6, v4, Ll3/m0;->p:Lk2/f;

    const v19, 0x8000

    and-int v19, v1, v19

    if-eqz v19, :cond_6

    iget-object v1, v0, Ll3/v0;->b:Ll3/b0;

    iget v1, v1, Ll3/b0;->a:I

    move/from16 p1, v1

    goto :goto_7

    :cond_6
    move/from16 p1, p9

    :goto_7
    iget-object v1, v0, Ll3/v0;->b:Ll3/b0;

    move-object/from16 v23, v5

    iget v5, v1, Ll3/b0;->b:I

    const/high16 v19, 0x20000

    and-int v19, p14, v19

    move/from16 p2, v5

    move-object/from16 v25, v6

    if-eqz v19, :cond_7

    iget-wide v5, v1, Ll3/b0;->c:J

    move-wide/from16 v26, v5

    goto :goto_8

    :cond_7
    move-wide/from16 v26, p10

    :goto_8
    iget-object v5, v1, Ll3/b0;->d:Lw3/q;

    const/high16 v6, 0x80000

    and-int v6, p14, v6

    if-eqz v6, :cond_8

    iget-object v0, v0, Ll3/v0;->c:Ll3/g0;

    goto :goto_9

    :cond_8
    move-object/from16 v0, p12

    :goto_9
    const/high16 v6, 0x100000

    and-int v6, p14, v6

    if-eqz v6, :cond_9

    iget-object v6, v1, Ll3/b0;->f:Lw3/i;

    move-object/from16 v28, v6

    goto :goto_a

    :cond_9
    move-object/from16 v28, p13

    :goto_a
    iget v6, v1, Ll3/b0;->g:I

    move-object/from16 p5, v5

    iget v5, v1, Ll3/b0;->h:I

    iget-object v1, v1, Ll3/b0;->i:Lw3/s;

    move-object/from16 p10, v1

    new-instance v1, Ll3/v0;

    move/from16 v19, v6

    new-instance v6, Ll3/m0;

    move/from16 p9, v5

    iget-object v5, v4, Ll3/m0;->a:Lw3/o;

    move-object/from16 p0, v6

    invoke-interface {v5}, Lw3/o;->b()J

    move-result-wide v5

    invoke-static {v2, v3, v5, v6}, Li2/x;->d(JJ)Z

    move-result v5

    if-eqz v5, :cond_a

    iget-object v2, v4, Ll3/m0;->a:Lw3/o;

    goto :goto_b

    :cond_a
    const-wide/16 v4, 0x10

    cmp-long v4, v2, v4

    if-eqz v4, :cond_b

    new-instance v4, Lw3/c;

    invoke-direct {v4, v2, v3}, Lw3/c;-><init>(J)V

    move-object v2, v4

    goto :goto_b

    :cond_b
    sget-object v2, Lw3/n;->a:Lw3/n;

    :goto_b
    const/4 v3, 0x0

    if-eqz v0, :cond_c

    iget-object v4, v0, Ll3/g0;->a:Ll3/f0;

    move-object/from16 v24, v4

    :goto_c
    move-object v6, v7

    move-object v7, v2

    move/from16 v2, v19

    move-object/from16 v19, v6

    move-object/from16 v6, p0

    goto :goto_d

    :cond_c
    move-object/from16 v24, v3

    goto :goto_c

    :goto_d
    invoke-direct/range {v6 .. v25}, Ll3/m0;-><init>(Lw3/o;JLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;Ll3/f0;Lk2/f;)V

    new-instance v4, Ll3/b0;

    if-eqz v0, :cond_d

    iget-object v3, v0, Ll3/g0;->b:Ll3/e0;

    :cond_d
    move/from16 p8, v2

    move-object/from16 p6, v3

    move-object/from16 p0, v4

    move-wide/from16 p3, v26

    move-object/from16 p7, v28

    invoke-direct/range {p0 .. p10}, Ll3/b0;-><init>(IIJLw3/q;Ll3/e0;Lw3/i;IILw3/s;)V

    move-object/from16 v2, p0

    invoke-direct {v1, v6, v2, v0}, Ll3/v0;-><init>(Ll3/m0;Ll3/b0;Ll3/g0;)V

    return-object v1
.end method

.method public static f(Ll3/v0;JJLp3/r;Lp3/n;Lp3/i;JLw3/l;IJI)Ll3/v0;
    .locals 29

    move-object/from16 v0, p0

    move/from16 v1, p14

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    sget-wide v2, Li2/x;->n:J

    move-wide v5, v2

    goto :goto_0

    :cond_0
    move-wide/from16 v5, p1

    :goto_0
    and-int/lit8 v2, v1, 0x2

    if-eqz v2, :cond_1

    sget-wide v2, Ly3/o;->c:J

    move-wide v9, v2

    goto :goto_1

    :cond_1
    move-wide/from16 v9, p3

    :goto_1
    and-int/lit8 v2, v1, 0x4

    const/16 v25, 0x0

    if-eqz v2, :cond_2

    move-object/from16 v11, v25

    goto :goto_2

    :cond_2
    move-object/from16 v11, p5

    :goto_2
    and-int/lit8 v2, v1, 0x8

    if-eqz v2, :cond_3

    move-object/from16 v12, v25

    goto :goto_3

    :cond_3
    move-object/from16 v12, p6

    :goto_3
    and-int/lit8 v2, v1, 0x20

    if-eqz v2, :cond_4

    move-object/from16 v14, v25

    goto :goto_4

    :cond_4
    move-object/from16 v14, p7

    :goto_4
    and-int/lit16 v2, v1, 0x80

    if-eqz v2, :cond_5

    sget-wide v2, Ly3/o;->c:J

    move-wide/from16 v16, v2

    goto :goto_5

    :cond_5
    move-wide/from16 v16, p8

    :goto_5
    sget-wide v21, Li2/x;->n:J

    and-int/lit16 v2, v1, 0x1000

    if-eqz v2, :cond_6

    move-object/from16 v23, v25

    goto :goto_6

    :cond_6
    move-object/from16 v23, p10

    :goto_6
    const v2, 0x8000

    and-int/2addr v2, v1

    if-eqz v2, :cond_7

    const/high16 v2, -0x80000000

    goto :goto_7

    :cond_7
    move/from16 v2, p11

    :goto_7
    const/high16 v3, 0x20000

    and-int/2addr v1, v3

    if-eqz v1, :cond_8

    sget-wide v3, Ly3/o;->c:J

    move-wide/from16 v27, v3

    goto :goto_8

    :cond_8
    move-wide/from16 v27, p12

    :goto_8
    iget-object v4, v0, Ll3/v0;->a:Ll3/m0;

    const/4 v7, 0x0

    const/high16 v8, 0x7fc00000    # Float.NaN

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    invoke-static/range {v4 .. v26}, Ll3/n0;->a(Ll3/m0;JLi2/t;FJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;Ll3/f0;Lk2/f;)Ll3/m0;

    move-result-object v1

    iget-object v3, v0, Ll3/v0;->b:Ll3/b0;

    const/high16 v4, -0x80000000

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/high16 v8, -0x80000000

    const/4 v9, 0x0

    move/from16 p2, v2

    move-object/from16 p1, v3

    move/from16 p3, v4

    move-object/from16 p6, v5

    move-object/from16 p8, v6

    move/from16 p9, v7

    move/from16 p10, v8

    move-object/from16 p11, v9

    move-object/from16 p7, v25

    move-wide/from16 p4, v27

    invoke-static/range {p1 .. p11}, Ll3/c0;->a(Ll3/b0;IIJLw3/q;Ll3/e0;Lw3/i;IILw3/s;)Ll3/b0;

    move-result-object v2

    iget-object v3, v0, Ll3/v0;->a:Ll3/m0;

    if-ne v3, v1, :cond_9

    iget-object v3, v0, Ll3/v0;->b:Ll3/b0;

    if-ne v3, v2, :cond_9

    return-object v0

    :cond_9
    new-instance v0, Ll3/v0;

    invoke-direct {v0, v1, v2}, Ll3/v0;-><init>(Ll3/m0;Ll3/b0;)V

    return-object v0
.end method


# virtual methods
.method public final c()J
    .locals 2

    iget-object v0, p0, Ll3/v0;->a:Ll3/m0;

    iget-object v0, v0, Ll3/m0;->a:Lw3/o;

    invoke-interface {v0}, Lw3/o;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d(Ll3/v0;)Z
    .locals 2

    if-eq p0, p1, :cond_1

    iget-object v0, p0, Ll3/v0;->b:Ll3/b0;

    iget-object v1, p1, Ll3/v0;->b:Ll3/b0;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll3/v0;->a:Ll3/m0;

    iget-object p1, p1, Ll3/v0;->a:Ll3/m0;

    invoke-virtual {v0, p1}, Ll3/m0;->b(Ll3/m0;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final e(Ll3/v0;)Ll3/v0;
    .locals 3

    if-eqz p1, :cond_1

    sget-object v0, Ll3/v0;->d:Ll3/v0;

    invoke-virtual {p1, v0}, Ll3/v0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ll3/v0;

    iget-object v1, p0, Ll3/v0;->a:Ll3/m0;

    iget-object v2, p1, Ll3/v0;->a:Ll3/m0;

    invoke-virtual {v1, v2}, Ll3/m0;->d(Ll3/m0;)Ll3/m0;

    move-result-object v1

    iget-object v2, p0, Ll3/v0;->b:Ll3/b0;

    iget-object p1, p1, Ll3/v0;->b:Ll3/b0;

    invoke-virtual {v2, p1}, Ll3/b0;->a(Ll3/b0;)Ll3/b0;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ll3/v0;-><init>(Ll3/m0;Ll3/b0;)V

    return-object v0

    :cond_1
    :goto_0
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ll3/v0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ll3/v0;

    iget-object v1, p1, Ll3/v0;->a:Ll3/m0;

    iget-object v3, p0, Ll3/v0;->a:Ll3/m0;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ll3/v0;->b:Ll3/b0;

    iget-object v3, p1, Ll3/v0;->b:Ll3/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ll3/v0;->c:Ll3/g0;

    iget-object p1, p1, Ll3/v0;->c:Ll3/g0;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Ll3/v0;->a:Ll3/m0;

    invoke-virtual {v0}, Ll3/m0;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ll3/v0;->b:Ll3/b0;

    invoke-virtual {v1}, Ll3/b0;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Ll3/v0;->c:Ll3/g0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll3/g0;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TextStyle(color="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll3/v0;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", brush="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll3/v0;->a:Ll3/m0;

    iget-object v2, v1, Ll3/m0;->a:Lw3/o;

    invoke-interface {v2}, Lw3/o;->c()Li2/t;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", alpha="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Ll3/m0;->a:Lw3/o;

    invoke-interface {v2}, Lw3/o;->a()F

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, ", fontSize="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, v1, Ll3/m0;->b:J

    invoke-static {v2, v3}, Ly3/o;->e(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", fontWeight="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Ll3/m0;->c:Lp3/r;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", fontStyle="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Ll3/m0;->d:Lp3/n;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", fontSynthesis="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Ll3/m0;->e:Lp3/o;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", fontFamily="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Ll3/m0;->f:Lp3/i;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", fontFeatureSettings="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Ll3/m0;->g:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", letterSpacing="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, v1, Ll3/m0;->h:J

    invoke-static {v2, v3}, Ly3/o;->e(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", baselineShift="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Ll3/m0;->i:Lw3/a;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", textGeometricTransform="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Ll3/m0;->j:Lw3/p;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", localeList="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Ll3/m0;->k:Ls3/b;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", background="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, v1, Ll3/m0;->l:J

    const-string v4, ", textDecoration="

    invoke-static {v2, v3, v4, v0}, Lev/n;->u(JLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget-object v2, v1, Ll3/m0;->m:Lw3/l;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", shadow="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Ll3/m0;->n:Li2/z0;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", drawStyle="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, Ll3/m0;->p:Lk2/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", textAlign="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll3/v0;->b:Ll3/b0;

    iget v2, v1, Ll3/b0;->a:I

    invoke-static {v2}, Lw3/k;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", textDirection="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v1, Ll3/b0;->b:I

    invoke-static {v2}, Lw3/m;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", lineHeight="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, v1, Ll3/b0;->c:J

    invoke-static {v2, v3}, Ly3/o;->e(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", textIndent="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Ll3/b0;->d:Lw3/q;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", platformStyle="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll3/v0;->c:Ll3/g0;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", lineHeightStyle="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Ll3/b0;->f:Lw3/i;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", lineBreak="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v1, Ll3/b0;->g:I

    invoke-static {v2}, Lw3/e;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", hyphens="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v1, Ll3/b0;->h:I

    invoke-static {v2}, Lw3/d;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", textMotion="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, Ll3/b0;->i:Lw3/s;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
