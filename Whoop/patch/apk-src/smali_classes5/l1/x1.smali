.class public abstract Ll1/x1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/u2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ll1/f0;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ll1/f0;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    new-instance v0, Ll1/f0;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ll1/f0;-><init>(I)V

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Ll1/x1;->a:Lp1/u2;

    return-void
.end method

.method public static final a(Ll1/m;Ll1/r2;Ll1/p3;Ll1/y4;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    move-object/from16 v0, p5

    check-cast v0, Lp1/q;

    const v7, 0x35e9c094

    invoke-virtual {v0, v7}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v7, v6, 0x6

    if-nez v7, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v6

    goto :goto_1

    :cond_1
    move v7, v6

    :goto_1
    and-int/lit8 v8, v6, 0x30

    if-nez v8, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0x20

    goto :goto_2

    :cond_2
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_3
    and-int/lit16 v8, v6, 0x180

    if-nez v8, :cond_5

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x100

    goto :goto_3

    :cond_4
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v7, v8

    :cond_5
    and-int/lit16 v8, v6, 0xc00

    if-nez v8, :cond_7

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x800

    goto :goto_4

    :cond_6
    const/16 v8, 0x400

    :goto_4
    or-int/2addr v7, v8

    :cond_7
    and-int/lit16 v8, v6, 0x6000

    if-nez v8, :cond_9

    invoke-virtual {v0, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x4000

    goto :goto_5

    :cond_8
    const/16 v8, 0x2000

    :goto_5
    or-int/2addr v7, v8

    :cond_9
    and-int/lit16 v8, v7, 0x2493

    const/16 v9, 0x2492

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v8, v9, :cond_a

    move v8, v11

    goto :goto_6

    :cond_a
    move v8, v10

    :goto_6
    and-int/2addr v7, v11

    invoke-virtual {v0, v7, v8}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_f

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v7, v6, 0x1

    if-eqz v7, :cond_c

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v7

    if-eqz v7, :cond_b

    goto :goto_7

    :cond_b
    invoke-virtual {v0}, Lp1/q;->X()V

    :cond_c
    :goto_7
    invoke-virtual {v0}, Lp1/q;->r()V

    const/4 v7, 0x0

    const/4 v8, 0x7

    invoke-static {v7, v8, v10}, Ll1/l3;->a(FIZ)Landroidx/compose/material3/c;

    move-result-object v7

    iget-wide v8, v1, Ll1/m;->a:J

    invoke-virtual {v0, v8, v9}, Lp1/q;->f(J)Z

    move-result v10

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_d

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-ne v11, v10, :cond_e

    :cond_d
    new-instance v11, Lf1/y1;

    const v10, 0x3ecccccd    # 0.4f

    invoke-static {v10, v8, v9}, Li2/x;->c(FJ)J

    move-result-wide v12

    invoke-direct {v11, v8, v9, v12, v13}, Lf1/y1;-><init>(JJ)V

    invoke-virtual {v0, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v11, Lf1/y1;

    sget-object v8, Ll1/n;->a:Lp1/u2;

    invoke-virtual {v8, v1}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v12

    sget-object v8, Ll1/x1;->a:Lp1/u2;

    invoke-virtual {v8, v2}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v13

    sget-object v8, Landroidx/compose/foundation/d;->a:Lp1/b0;

    invoke-virtual {v8, v7}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v14

    sget-object v7, Ll1/q3;->a:Lp1/u2;

    invoke-virtual {v7, v3}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v15

    sget-object v7, Lf1/a2;->a:Lp1/b0;

    invoke-virtual {v7, v11}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v16

    sget-object v7, Ll1/z4;->a:Lp1/u2;

    invoke-virtual {v7, v4}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v17

    filled-new-array/range {v12 .. v17}, [Lp1/u1;

    move-result-object v7

    new-instance v8, Lb30/w2;

    const/16 v9, 0x14

    invoke-direct {v8, v9, v4, v5}, Lb30/w2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v9, -0x68571c2c

    invoke-static {v9, v0, v8}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    const/16 v9, 0x38

    invoke-static {v7, v8, v0, v9}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_8

    :cond_f
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_10

    new-instance v0, Laq1/c;

    const/16 v7, 0x15

    invoke-direct/range {v0 .. v7}, Laq1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method public static final b(Ll1/m;Ll1/p3;Ll1/y4;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 13

    move-object/from16 v5, p4

    check-cast v5, Lp1/q;

    const v0, -0x1ace2e0b

    invoke-virtual {v5, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v5, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p5, v1

    or-int/lit16 v1, v1, 0x90

    and-int/lit16 v2, v1, 0x493

    const/16 v3, 0x492

    if-eq v2, v3, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    and-int/lit8 v3, v1, 0x1

    invoke-virtual {v5, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v5}, Lp1/q;->Z()V

    and-int/lit8 v2, p5, 0x1

    if-eqz v2, :cond_3

    invoke-virtual {v5}, Lp1/q;->C()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v5}, Lp1/q;->X()V

    and-int/lit16 v1, v1, -0x3f1

    move-object v2, p1

    move-object v3, p2

    goto :goto_3

    :cond_3
    :goto_2
    sget-object v2, Ll1/q3;->a:Lp1/u2;

    invoke-virtual {v5, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll1/p3;

    sget-object v3, Ll1/z4;->a:Lp1/u2;

    invoke-virtual {v5, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll1/y4;

    and-int/lit16 v1, v1, -0x3f1

    :goto_3
    invoke-virtual {v5}, Lp1/q;->r()V

    sget-object v4, Ll1/x1;->a:Lp1/u2;

    invoke-virtual {v5, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll1/r2;

    and-int/lit8 v1, v1, 0xe

    or-int/lit16 v6, v1, 0x6000

    move-object v0, p0

    move-object v1, v4

    move-object/from16 v4, p3

    invoke-static/range {v0 .. v6}, Ll1/x1;->a(Ll1/m;Ll1/r2;Ll1/p3;Ll1/y4;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    move-object v8, v2

    move-object v9, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v8, p1

    move-object v9, p2

    :goto_4
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_5

    new-instance v6, Lat2/u;

    const/16 v12, 0x12

    move-object v7, p0

    move-object/from16 v10, p3

    move/from16 v11, p5

    invoke-direct/range {v6 .. v12}, Lat2/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v6, v0, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method
