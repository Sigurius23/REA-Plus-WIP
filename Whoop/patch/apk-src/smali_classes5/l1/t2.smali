.class public final Ll1/t2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll1/t2;

.field public static final b:F

.field public static final c:F

.field public static final d:F

.field public static final e:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ll1/t2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll1/t2;->a:Ll1/t2;

    const/16 v0, 0x38

    int-to-float v0, v0

    sput v0, Ll1/t2;->b:F

    const/16 v0, 0x118

    int-to-float v0, v0

    sput v0, Ll1/t2;->c:F

    const/4 v0, 0x1

    int-to-float v0, v0

    sput v0, Ll1/t2;->d:F

    const/4 v0, 0x2

    int-to-float v0, v0

    sput v0, Ll1/t2;->e:F

    return-void
.end method

.method public static c(JJJJJJJJJJJJLandroidx/compose/runtime/Composer;)Ll1/e4;
    .locals 87

    move-object/from16 v0, p24

    sget-wide v8, Li2/x;->n:J

    sget-object v1, Ll1/n;->a:Lp1/u2;

    move-object v2, v0

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll1/m;

    invoke-static {v1, v0}, Ll1/t2;->d(Ll1/m;Landroidx/compose/runtime/Composer;)Ll1/e4;

    move-result-object v1

    const/16 v22, 0x0

    move-wide/from16 v16, v8

    move-wide/from16 v18, v8

    move-wide/from16 v20, v8

    move-wide/from16 v29, v8

    move-wide/from16 v31, v8

    move-wide/from16 v33, v8

    move-wide/from16 v35, v8

    move-wide/from16 v37, v8

    move-wide/from16 v39, v8

    move-wide/from16 v41, v8

    move-wide/from16 v43, v8

    move-wide/from16 v45, v8

    move-wide/from16 v47, v8

    move-wide/from16 v49, v8

    move-wide/from16 v51, v8

    move-wide/from16 v53, v8

    move-wide/from16 v61, v8

    move-wide/from16 v63, v8

    move-wide/from16 v65, v8

    move-wide/from16 v67, v8

    move-wide/from16 v69, v8

    move-wide/from16 v71, v8

    move-wide/from16 v73, v8

    move-wide/from16 v75, v8

    move-wide/from16 v77, v8

    move-wide/from16 v79, v8

    move-wide/from16 v81, v8

    move-wide/from16 v83, v8

    move-wide/from16 v85, v8

    move-wide/from16 v2, p0

    move-wide/from16 v4, p2

    move-wide/from16 v6, p4

    move-wide/from16 v10, p6

    move-wide/from16 v12, p8

    move-wide/from16 v14, p10

    move-wide/from16 v23, p12

    move-wide/from16 v25, p14

    move-wide/from16 v27, p16

    move-wide/from16 v55, p18

    move-wide/from16 v57, p20

    move-wide/from16 v59, p22

    invoke-virtual/range {v1 .. v86}, Ll1/e4;->a(JJJJJJJJJJLf1/y1;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Ll1/e4;

    move-result-object v0

    return-object v0
.end method

.method public static d(Ll1/m;Landroidx/compose/runtime/Composer;)Ll1/e4;
    .locals 90

    move-object/from16 v0, p0

    iget-object v1, v0, Ll1/m;->c0:Ll1/e4;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object/from16 v1, p1

    check-cast v1, Lp1/q;

    const v3, 0x1745d472

    invoke-virtual {v1, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    const/4 v1, 0x0

    goto :goto_1

    :cond_0
    move-object/from16 v3, p1

    check-cast v3, Lp1/q;

    const v4, 0x1745d473

    invoke-virtual {v3, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lf1/a2;->a:Lp1/b0;

    invoke-virtual {v3, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf1/y1;

    iget-object v5, v1, Ll1/e4;->k:Lf1/y1;

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v1, v4}, Ll1/e4;->b(Ll1/e4;Lf1/y1;)Ll1/e4;

    move-result-object v1

    iput-object v1, v0, Ll1/m;->c0:Ll1/e4;

    :goto_0
    invoke-virtual {v3, v2}, Lp1/q;->q(Z)V

    :goto_1
    if-nez v1, :cond_2

    move-object/from16 v1, p1

    check-cast v1, Lp1/q;

    const v3, -0x6a979da7

    invoke-virtual {v1, v3}, Lp1/q;->e0(I)V

    new-instance v4, Ll1/e4;

    sget-object v3, Lo1/p;->p:Lo1/f;

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v5

    sget-object v3, Lo1/p;->v:Lo1/f;

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v7

    sget-object v3, Lo1/p;->c:Lo1/f;

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v9

    const v11, 0x3ec28f5c    # 0.38f

    invoke-static {v11, v9, v10}, Li2/x;->c(FJ)J

    move-result-wide v9

    sget-object v12, Lo1/p;->j:Lo1/f;

    invoke-static {v0, v12}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v12

    move-wide v15, v12

    sget-wide v13, Li2/x;->m:J

    sget-object v12, Lo1/p;->a:Lo1/f;

    invoke-static {v0, v12}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v21

    sget-object v12, Lo1/p;->i:Lo1/f;

    invoke-static {v0, v12}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v23

    sget-object v12, Lf1/a2;->a:Lp1/b0;

    invoke-virtual {v1, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v12

    move-object/from16 v25, v12

    check-cast v25, Lf1/y1;

    sget-object v12, Lo1/p;->s:Lo1/f;

    invoke-static {v0, v12}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v26

    sget-object v12, Lo1/p;->B:Lo1/f;

    invoke-static {v0, v12}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v28

    sget-object v12, Lo1/p;->f:Lo1/f;

    move-object/from16 p1, v3

    invoke-static {v0, v12}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v2

    const v12, 0x3df5c28f    # 0.12f

    invoke-static {v12, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v30

    sget-object v2, Lo1/p;->m:Lo1/f;

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v32

    sget-object v2, Lo1/p;->r:Lo1/f;

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v34

    sget-object v2, Lo1/p;->A:Lo1/f;

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v36

    sget-object v2, Lo1/p;->e:Lo1/f;

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v2

    invoke-static {v11, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v38

    sget-object v2, Lo1/p;->l:Lo1/f;

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v40

    sget-object v2, Lo1/p;->u:Lo1/f;

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v42

    sget-object v2, Lo1/p;->D:Lo1/f;

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v44

    sget-object v2, Lo1/p;->h:Lo1/f;

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v2

    invoke-static {v11, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v46

    sget-object v2, Lo1/p;->o:Lo1/f;

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v48

    sget-object v2, Lo1/p;->q:Lo1/f;

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v50

    sget-object v2, Lo1/p;->z:Lo1/f;

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v52

    sget-object v2, Lo1/p;->d:Lo1/f;

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v2

    invoke-static {v11, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v54

    sget-object v2, Lo1/p;->k:Lo1/f;

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v56

    sget-object v2, Lo1/p;->w:Lo1/f;

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v58

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v60

    move-object/from16 v3, p1

    move-object/from16 p1, v4

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v3

    invoke-static {v11, v3, v4}, Li2/x;->c(FJ)J

    move-result-wide v62

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v64

    sget-object v2, Lo1/p;->t:Lo1/f;

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v66

    sget-object v2, Lo1/p;->C:Lo1/f;

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v68

    sget-object v2, Lo1/p;->g:Lo1/f;

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v2

    invoke-static {v11, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v70

    sget-object v2, Lo1/p;->n:Lo1/f;

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v72

    sget-object v2, Lo1/p;->x:Lo1/f;

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v74

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v76

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v3

    invoke-static {v11, v3, v4}, Li2/x;->c(FJ)J

    move-result-wide v78

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v80

    sget-object v2, Lo1/p;->y:Lo1/f;

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v82

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v84

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v3

    invoke-static {v11, v3, v4}, Li2/x;->c(FJ)J

    move-result-wide v86

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v88

    move-wide v11, v15

    move-wide v15, v13

    move-wide/from16 v17, v13

    move-wide/from16 v19, v13

    move-object/from16 v4, p1

    invoke-direct/range {v4 .. v89}, Ll1/e4;-><init>(JJJJJJJJJJLf1/y1;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)V

    iput-object v4, v0, Ll1/m;->c0:Ll1/e4;

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lp1/q;->q(Z)V

    return-object v4

    :cond_2
    move v0, v2

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, -0x6a9a946d

    invoke-virtual {v2, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    return-object v1
.end method


# virtual methods
.method public final a(ZZLj0/i;Landroidx/compose/ui/Modifier;Ll1/e4;Li2/a1;FFLandroidx/compose/runtime/Composer;II)V
    .locals 27

    move/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v10, p10

    move/from16 v11, p11

    move-object/from16 v15, p9

    check-cast v15, Lp1/q;

    const v0, 0x3db82288

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v15, v2}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v10

    invoke-virtual {v15, v3}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x20

    goto :goto_1

    :cond_1
    const/16 v1, 0x10

    :goto_1
    or-int/2addr v0, v1

    invoke-virtual {v15, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x100

    goto :goto_2

    :cond_2
    const/16 v1, 0x80

    :goto_2
    or-int/2addr v0, v1

    and-int/lit8 v1, v11, 0x8

    if-eqz v1, :cond_4

    or-int/lit16 v0, v0, 0xc00

    :cond_3
    move-object/from16 v5, p4

    goto :goto_4

    :cond_4
    and-int/lit16 v5, v10, 0xc00

    if-nez v5, :cond_3

    move-object/from16 v5, p4

    invoke-virtual {v15, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x800

    goto :goto_3

    :cond_5
    const/16 v8, 0x400

    :goto_3
    or-int/2addr v0, v8

    :goto_4
    invoke-virtual {v15, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x4000

    goto :goto_5

    :cond_6
    const/16 v8, 0x2000

    :goto_5
    or-int/2addr v0, v8

    invoke-virtual {v15, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/high16 v8, 0x20000

    goto :goto_6

    :cond_7
    const/high16 v8, 0x10000

    :goto_6
    or-int/2addr v0, v8

    const/high16 v8, 0x180000

    and-int/2addr v8, v10

    if-nez v8, :cond_a

    and-int/lit8 v8, v11, 0x40

    if-nez v8, :cond_8

    move/from16 v8, p7

    invoke-virtual {v15, v8}, Lp1/q;->d(F)Z

    move-result v9

    if-eqz v9, :cond_9

    const/high16 v9, 0x100000

    goto :goto_7

    :cond_8
    move/from16 v8, p7

    :cond_9
    const/high16 v9, 0x80000

    :goto_7
    or-int/2addr v0, v9

    goto :goto_8

    :cond_a
    move/from16 v8, p7

    :goto_8
    const/high16 v9, 0xc00000

    and-int/2addr v9, v10

    if-nez v9, :cond_d

    and-int/lit16 v9, v11, 0x80

    if-nez v9, :cond_b

    move/from16 v9, p8

    invoke-virtual {v15, v9}, Lp1/q;->d(F)Z

    move-result v12

    if-eqz v12, :cond_c

    const/high16 v12, 0x800000

    goto :goto_9

    :cond_b
    move/from16 v9, p8

    :cond_c
    const/high16 v12, 0x400000

    :goto_9
    or-int/2addr v0, v12

    goto :goto_a

    :cond_d
    move/from16 v9, p8

    :goto_a
    const v12, 0x2492493

    and-int/2addr v12, v0

    const v13, 0x2492492

    const/4 v14, 0x0

    if-eq v12, v13, :cond_e

    const/4 v12, 0x1

    goto :goto_b

    :cond_e
    move v12, v14

    :goto_b
    and-int/lit8 v13, v0, 0x1

    invoke-virtual {v15, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_1b

    invoke-virtual {v15}, Lp1/q;->Z()V

    and-int/lit8 v12, v10, 0x1

    const v13, -0x1c00001

    const v16, -0x380001

    if-eqz v12, :cond_11

    invoke-virtual {v15}, Lp1/q;->C()Z

    move-result v12

    if-eqz v12, :cond_f

    goto :goto_c

    :cond_f
    invoke-virtual {v15}, Lp1/q;->X()V

    and-int/lit8 v1, v11, 0x40

    if-eqz v1, :cond_10

    and-int v0, v0, v16

    :cond_10
    and-int/lit16 v1, v11, 0x80

    if-eqz v1, :cond_14

    and-int/2addr v0, v13

    goto :goto_d

    :cond_11
    :goto_c
    if-eqz v1, :cond_12

    sget-object v1, Lb2/t;->w:Lb2/t;

    move-object v5, v1

    :cond_12
    and-int/lit8 v1, v11, 0x40

    if-eqz v1, :cond_13

    and-int v0, v0, v16

    sget v1, Ll1/t2;->e:F

    move v8, v1

    :cond_13
    and-int/lit16 v1, v11, 0x80

    if-eqz v1, :cond_14

    and-int/2addr v0, v13

    sget v1, Ll1/t2;->d:F

    move v9, v1

    :cond_14
    :goto_d
    invoke-virtual {v15}, Lp1/q;->r()V

    shr-int/lit8 v0, v0, 0x6

    and-int/lit8 v0, v0, 0xe

    invoke-static {v4, v15, v0}, Lse/h;->x(Lj0/i;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v0

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    sget v1, Lm1/l0;->a:F

    invoke-virtual {v6, v2, v3, v0}, Ll1/e4;->c(ZZZ)J

    move-result-wide v12

    sget-object v1, Lo1/n;->z:Lo1/n;

    move/from16 v16, v14

    invoke-static {v1, v15}, Ll1/k3;->m(Lo1/n;Landroidx/compose/runtime/Composer;)Ld0/i1;

    move-result-object v14

    if-eqz v2, :cond_15

    move/from16 p4, v0

    const v0, -0x63cef6df

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    const/16 v17, 0x0

    const/16 v18, 0xc

    move/from16 v0, v16

    move-object/from16 v16, v15

    const/4 v15, 0x0

    invoke-static/range {v12 .. v18}, Lc0/m1;->a(JLd0/c0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v12

    move-object/from16 v15, v16

    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    :goto_e
    move-object/from16 v18, v12

    goto :goto_f

    :cond_15
    move/from16 p4, v0

    move/from16 v0, v16

    const v14, -0x63cdbb6c

    invoke-virtual {v15, v14}, Lp1/q;->e0(I)V

    new-instance v14, Li2/x;

    invoke-direct {v14, v12, v13}, Li2/x;-><init>(J)V

    invoke-static {v14, v15}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v12

    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    goto :goto_e

    :goto_f
    sget-object v12, Lo1/n;->x:Lo1/n;

    invoke-static {v12, v15}, Ll1/k3;->m(Lo1/n;Landroidx/compose/runtime/Composer;)Ld0/i1;

    move-result-object v13

    if-eqz v2, :cond_17

    const v12, -0x63caf6c8

    invoke-virtual {v15, v12}, Lp1/q;->e0(I)V

    if-eqz p4, :cond_16

    move v12, v8

    goto :goto_10

    :cond_16
    move v12, v9

    :goto_10
    const/16 v16, 0x0

    const/16 v17, 0xc

    const/4 v14, 0x0

    invoke-static/range {v12 .. v17}, Ld0/g;->a(FLd0/l;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v12

    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_17
    const v12, -0x63c82f99

    invoke-virtual {v15, v12}, Lp1/q;->e0(I)V

    new-instance v12, Ly3/f;

    invoke-direct {v12, v9}, Ly3/f;-><init>(F)V

    invoke-static {v12, v15}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v12

    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    :goto_11
    invoke-interface {v12}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ly3/f;

    iget v12, v12, Ly3/f;->w:F

    invoke-interface/range {v18 .. v18}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Li2/x;

    iget-wide v13, v13, Li2/x;->a:J

    invoke-static {v12, v13, v14}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v12

    invoke-static {v12, v15}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v19

    if-nez v2, :cond_18

    iget-wide v12, v6, Ll1/e4;->g:J

    goto :goto_12

    :cond_18
    if-eqz v3, :cond_19

    iget-wide v12, v6, Ll1/e4;->h:J

    goto :goto_12

    :cond_19
    if-eqz p4, :cond_1a

    iget-wide v12, v6, Ll1/e4;->e:J

    goto :goto_12

    :cond_1a
    iget-wide v12, v6, Ll1/e4;->f:J

    :goto_12
    invoke-static {v1, v15}, Ll1/k3;->m(Lo1/n;Landroidx/compose/runtime/Composer;)Ld0/i1;

    move-result-object v14

    const/16 v17, 0x0

    const/16 v18, 0xc

    move-object/from16 v16, v15

    const/4 v15, 0x0

    invoke-static/range {v12 .. v18}, Lc0/m1;->a(JLd0/c0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v24

    move-object/from16 v15, v16

    invoke-interface/range {v19 .. v19}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf0/t;

    invoke-static {v5, v1, v7}, Lge3/g;->g(Landroidx/compose/ui/Modifier;Lf0/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    new-instance v20, Lhc3/j;

    const/16 v21, 0x0

    const/16 v22, 0x1

    const-class v23, Lp1/t2;

    const-string v25, "value"

    const-string v26, "getValue()Ljava/lang/Object;"

    invoke-direct/range {v20 .. v26}, Lhc3/j;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v12, v20

    new-instance v13, Ll1/g4;

    invoke-direct {v13, v12}, Ll1/g4;-><init>(Lkotlin/jvm/internal/v;)V

    new-instance v12, Llq0/d;

    const/4 v14, 0x7

    invoke-direct {v12, v14, v7, v13}, Llq0/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v12}, Landroidx/compose/ui/draw/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1, v15, v0}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_13

    :cond_1b
    invoke-virtual {v15}, Lp1/q;->X()V

    :goto_13
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_1c

    new-instance v0, Ll1/s2;

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v11}, Ll1/s2;-><init>(Ll1/t2;ZZLj0/i;Landroidx/compose/ui/Modifier;Ll1/e4;Li2/a1;FFII)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_1c
    return-void
.end method

.method public final b(Ljava/lang/String;Lc93/m;ZZLq3/g0;Lj0/i;ZLc93/m;Lc93/m;Lc93/m;Ll1/e4;Ll0/k1;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 34

    move-object/from16 v2, p1

    move-object/from16 v6, p5

    move-object/from16 v9, p8

    move/from16 v15, p15

    move-object/from16 v0, p14

    check-cast v0, Lp1/q;

    const v1, -0x67408512

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v15, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v15

    goto :goto_1

    :cond_1
    move v1, v15

    :goto_1
    and-int/lit8 v5, v15, 0x30

    if-nez v5, :cond_3

    move-object/from16 v5, p2

    invoke-virtual {v0, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    const/16 v10, 0x20

    goto :goto_2

    :cond_2
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v1, v10

    goto :goto_3

    :cond_3
    move-object/from16 v5, p2

    :goto_3
    and-int/lit16 v10, v15, 0x180

    if-nez v10, :cond_5

    move/from16 v10, p3

    invoke-virtual {v0, v10}, Lp1/q;->h(Z)Z

    move-result v13

    if-eqz v13, :cond_4

    const/16 v13, 0x100

    goto :goto_4

    :cond_4
    const/16 v13, 0x80

    :goto_4
    or-int/2addr v1, v13

    goto :goto_5

    :cond_5
    move/from16 v10, p3

    :goto_5
    and-int/lit16 v13, v15, 0xc00

    const/16 v14, 0x400

    const/16 v16, 0x800

    if-nez v13, :cond_7

    move/from16 v13, p4

    invoke-virtual {v0, v13}, Lp1/q;->h(Z)Z

    move-result v17

    if-eqz v17, :cond_6

    move/from16 v17, v16

    goto :goto_6

    :cond_6
    move/from16 v17, v14

    :goto_6
    or-int v1, v1, v17

    goto :goto_7

    :cond_7
    move/from16 v13, p4

    :goto_7
    and-int/lit16 v3, v15, 0x6000

    const/16 v17, 0x2000

    if-nez v3, :cond_9

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    const/16 v3, 0x4000

    goto :goto_8

    :cond_8
    move/from16 v3, v17

    :goto_8
    or-int/2addr v1, v3

    :cond_9
    const/high16 v3, 0x30000

    and-int/2addr v3, v15

    const/high16 v19, 0x10000

    if-nez v3, :cond_b

    move-object/from16 v3, p6

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_a

    const/high16 v20, 0x20000

    goto :goto_9

    :cond_a
    move/from16 v20, v19

    :goto_9
    or-int v1, v1, v20

    goto :goto_a

    :cond_b
    move-object/from16 v3, p6

    :goto_a
    const/high16 v20, 0x180000

    and-int v20, v15, v20

    move/from16 v8, p7

    if-nez v20, :cond_d

    invoke-virtual {v0, v8}, Lp1/q;->h(Z)Z

    move-result v21

    if-eqz v21, :cond_c

    const/high16 v21, 0x100000

    goto :goto_b

    :cond_c
    const/high16 v21, 0x80000

    :goto_b
    or-int v1, v1, v21

    :cond_d
    const/high16 v21, 0xc00000

    and-int v22, v15, v21

    if-nez v22, :cond_f

    invoke-virtual {v0, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_e

    const/high16 v22, 0x800000

    goto :goto_c

    :cond_e
    const/high16 v22, 0x400000

    :goto_c
    or-int v1, v1, v22

    :cond_f
    const/high16 v22, 0x6000000

    and-int v22, v15, v22

    move-object/from16 v11, p9

    if-nez v22, :cond_11

    invoke-virtual {v0, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_10

    const/high16 v23, 0x4000000

    goto :goto_d

    :cond_10
    const/high16 v23, 0x2000000

    :goto_d
    or-int v1, v1, v23

    :cond_11
    const/high16 v23, 0x30000000

    and-int v23, v15, v23

    const/4 v12, 0x0

    if-nez v23, :cond_13

    invoke-virtual {v0, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_12

    const/high16 v23, 0x20000000

    goto :goto_e

    :cond_12
    const/high16 v23, 0x10000000

    :goto_e
    or-int v1, v1, v23

    :cond_13
    invoke-virtual {v0, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_14

    const/16 v23, 0x4

    goto :goto_f

    :cond_14
    const/16 v23, 0x2

    :goto_f
    const/high16 v25, 0xd80000

    or-int v23, v25, v23

    invoke-virtual {v0, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_15

    const/16 v18, 0x20

    goto :goto_10

    :cond_15
    const/16 v18, 0x10

    :goto_10
    or-int v18, v23, v18

    invoke-virtual {v0, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_16

    const/16 v22, 0x100

    goto :goto_11

    :cond_16
    const/16 v22, 0x80

    :goto_11
    or-int v18, v18, v22

    move-object/from16 v12, p10

    invoke-virtual {v0, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_17

    move/from16 v14, v16

    :cond_17
    or-int v14, v18, v14

    move-object/from16 v7, p11

    invoke-virtual {v0, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_18

    const/16 v17, 0x4000

    :cond_18
    or-int v14, v14, v17

    or-int v14, v14, v19

    const v17, 0x12492493

    and-int v4, v1, v17

    const v3, 0x12492492

    const/16 v17, 0x1

    if-ne v4, v3, :cond_1a

    const v3, 0x492493

    and-int/2addr v3, v14

    const v4, 0x492492

    if-eq v3, v4, :cond_19

    goto :goto_12

    :cond_19
    const/4 v3, 0x0

    goto :goto_13

    :cond_1a
    :goto_12
    move/from16 v3, v17

    :goto_13
    and-int/lit8 v4, v1, 0x1

    invoke-virtual {v0, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_22

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v3, v15, 0x1

    const v4, -0x70001

    if-eqz v3, :cond_1c

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v3

    if-eqz v3, :cond_1b

    goto :goto_14

    :cond_1b
    invoke-virtual {v0}, Lp1/q;->X()V

    and-int v3, v14, v4

    move-object/from16 v27, p12

    goto :goto_15

    :cond_1c
    :goto_14
    sget v3, Lm1/l0;->a:F

    move/from16 v19, v4

    new-instance v4, Ll0/l1;

    invoke-direct {v4, v3, v3, v3, v3}, Ll0/l1;-><init>(FFFF)V

    and-int v3, v14, v19

    move-object/from16 v27, v4

    :goto_15
    invoke-virtual {v0}, Lp1/q;->r()V

    and-int/lit8 v4, v1, 0xe

    const/4 v14, 0x4

    if-ne v4, v14, :cond_1d

    move/from16 v4, v17

    goto :goto_16

    :cond_1d
    const/4 v4, 0x0

    :goto_16
    const p12, 0xe000

    and-int v14, v1, p12

    const/16 v5, 0x4000

    if-ne v14, v5, :cond_1e

    goto :goto_17

    :cond_1e
    const/16 v17, 0x0

    :goto_17
    or-int v4, v4, v17

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_1f

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v5, v4, :cond_20

    :cond_1f
    new-instance v4, Ll3/g;

    invoke-direct {v4, v2}, Ll3/g;-><init>(Ljava/lang/String;)V

    invoke-interface {v6, v4}, Lq3/g0;->a(Ll3/g;)Lq3/e0;

    move-result-object v5

    invoke-virtual {v0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    check-cast v5, Lq3/e0;

    iget-object v4, v5, Lq3/e0;->a:Ll3/g;

    iget-object v4, v4, Ll3/g;->x:Ljava/lang/String;

    sget-object v16, Lm1/m0;->x:Lm1/m0;

    new-instance v19, Ll1/k4;

    invoke-direct/range {v19 .. v19}, Ll1/k4;-><init>()V

    if-nez v9, :cond_21

    const v5, 0x72dc957c

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    const/4 v5, 0x0

    invoke-virtual {v0, v5}, Lp1/q;->q(Z)V

    const/16 v20, 0x0

    goto :goto_18

    :cond_21
    const/4 v5, 0x0

    const v14, 0x72dc957d

    invoke-virtual {v0, v14}, Lp1/q;->e0(I)V

    new-instance v14, Lb30/o4;

    const/16 v5, 0x8

    invoke-direct {v14, v9, v5}, Lb30/o4;-><init>(Ljava/lang/Object;I)V

    const v5, -0x570185d2

    invoke-static {v5, v0, v14}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    const/4 v14, 0x0

    invoke-virtual {v0, v14}, Lp1/q;->q(Z)V

    move-object/from16 v20, v5

    :goto_18
    shl-int/lit8 v5, v1, 0x3

    and-int/lit16 v5, v5, 0x380

    or-int/lit8 v5, v5, 0x6

    shr-int/lit8 v14, v1, 0x9

    const/high16 v17, 0x70000

    and-int v17, v14, v17

    or-int v5, v5, v17

    const/high16 v17, 0x380000

    and-int v18, v14, v17

    or-int v5, v5, v18

    shl-int/lit8 v18, v3, 0x15

    const/high16 v22, 0x1c00000

    and-int v22, v18, v22

    or-int v5, v5, v22

    const/high16 v22, 0xe000000

    and-int v22, v18, v22

    or-int v5, v5, v22

    const/high16 v22, 0x70000000

    and-int v18, v18, v22

    or-int v31, v5, v18

    shr-int/lit8 v5, v3, 0x9

    and-int/lit8 v5, v5, 0xe

    shr-int/lit8 v18, v1, 0x6

    and-int/lit8 v18, v18, 0x70

    or-int v5, v5, v18

    move-object/from16 v30, v0

    and-int/lit16 v0, v1, 0x380

    or-int/2addr v0, v5

    and-int/lit16 v5, v14, 0x1c00

    or-int/2addr v0, v5

    shr-int/lit8 v1, v1, 0x3

    and-int v1, v1, p12

    or-int/2addr v0, v1

    shl-int/lit8 v1, v3, 0x6

    and-int v1, v1, v17

    or-int/2addr v0, v1

    or-int v32, v0, v21

    move-object/from16 v18, p2

    move-object/from16 v26, p6

    move-object/from16 v29, p13

    move-object/from16 v17, v4

    move-object/from16 v28, v7

    move/from16 v25, v8

    move/from16 v24, v10

    move-object/from16 v21, v11

    move-object/from16 v22, v12

    move/from16 v23, v13

    invoke-static/range {v16 .. v32}, Lm1/l0;->a(Lm1/m0;Ljava/lang/CharSequence;Lc93/m;Ll1/k4;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/m;ZZZLj0/i;Ll0/k1;Ll1/e4;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v13, v27

    goto :goto_19

    :cond_22
    move-object/from16 v30, v0

    invoke-virtual/range {v30 .. v30}, Lp1/q;->X()V

    move-object/from16 v13, p12

    :goto_19
    invoke-virtual/range {v30 .. v30}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_23

    move-object v1, v0

    new-instance v0, Li40/e;

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v14, p13

    move-object/from16 v33, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v15}, Li40/e;-><init>(Ll1/t2;Ljava/lang/String;Lc93/m;ZZLq3/g0;Lj0/i;ZLc93/m;Lc93/m;Lc93/m;Ll1/e4;Ll0/k1;Lx1/b;I)V

    move-object/from16 v1, v33

    iput-object v0, v1, Lp1/v1;->d:Lc93/m;

    :cond_23
    return-void
.end method
