.class public abstract Ld40/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:J

.field public static final b:J

.field public static final c:Lp1/u2;

.field public static final d:Lp1/u2;

.field public static final e:Lp1/u2;

.field public static final f:Lp1/u2;

.field public static final g:Lp1/u2;

.field public static final h:Lp1/u2;

.field public static final i:Lp1/u2;

.field public static final j:Lp1/u2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide v0, 0xff24b47eL

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    sput-wide v0, Ld40/r;->a:J

    const v0, 0x40ffffff    # 7.9999995f

    invoke-static {v0}, Li2/w0;->c(I)J

    move-result-wide v0

    sput-wide v0, Ld40/r;->b:J

    new-instance v0, Lcu2/l;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lcu2/l;-><init>(I)V

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Ld40/r;->c:Lp1/u2;

    new-instance v0, Lcu2/l;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lcu2/l;-><init>(I)V

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Ld40/r;->d:Lp1/u2;

    new-instance v0, Lcu2/l;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lcu2/l;-><init>(I)V

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Ld40/r;->e:Lp1/u2;

    new-instance v0, Lcu2/l;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lcu2/l;-><init>(I)V

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Ld40/r;->f:Lp1/u2;

    new-instance v0, Lcu2/l;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lcu2/l;-><init>(I)V

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Ld40/r;->g:Lp1/u2;

    new-instance v0, Lcu2/l;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lcu2/l;-><init>(I)V

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Ld40/r;->h:Lp1/u2;

    new-instance v0, Lcu2/l;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lcu2/l;-><init>(I)V

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Ld40/r;->i:Lp1/u2;

    new-instance v0, Lcu2/l;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lcu2/l;-><init>(I)V

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Ld40/r;->j:Lp1/u2;

    return-void
.end method

.method public static final a(Ld40/n;Ld40/o;Ld40/s;Ljava/lang/Float;Ld40/m;Ld40/g;Ld40/h;Lx1/b;Landroidx/compose/runtime/Composer;II)V
    .locals 23

    move/from16 v9, p9

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    move-object/from16 v1, p8

    check-cast v1, Lp1/q;

    const v2, 0x51557ba3

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v9, 0x6

    if-nez v2, :cond_2

    and-int/lit8 v2, p10, 0x1

    if-nez v2, :cond_0

    move-object/from16 v2, p0

    invoke-virtual {v1, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move-object/from16 v2, p0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v9

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v3, v9

    :goto_1
    and-int/lit8 v4, v9, 0x30

    if-nez v4, :cond_5

    and-int/lit8 v4, p10, 0x2

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-virtual {v1, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    move-object/from16 v4, p1

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    goto :goto_3

    :cond_5
    move-object/from16 v4, p1

    :goto_3
    and-int/lit16 v5, v9, 0x180

    if-nez v5, :cond_8

    and-int/lit8 v5, p10, 0x4

    if-nez v5, :cond_6

    move-object/from16 v5, p2

    invoke-virtual {v1, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x100

    goto :goto_4

    :cond_6
    move-object/from16 v5, p2

    :cond_7
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v3, v6

    goto :goto_5

    :cond_8
    move-object/from16 v5, p2

    :goto_5
    and-int/lit16 v6, v9, 0xc00

    if-nez v6, :cond_b

    and-int/lit8 v6, p10, 0x8

    if-nez v6, :cond_9

    move-object/from16 v6, p3

    invoke-virtual {v1, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    const/16 v7, 0x800

    goto :goto_6

    :cond_9
    move-object/from16 v6, p3

    :cond_a
    const/16 v7, 0x400

    :goto_6
    or-int/2addr v3, v7

    goto :goto_7

    :cond_b
    move-object/from16 v6, p3

    :goto_7
    and-int/lit16 v7, v9, 0x6000

    if-nez v7, :cond_e

    and-int/lit8 v7, p10, 0x10

    if-nez v7, :cond_c

    move-object/from16 v7, p4

    invoke-virtual {v1, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_d

    const/16 v8, 0x4000

    goto :goto_8

    :cond_c
    move-object/from16 v7, p4

    :cond_d
    const/16 v8, 0x2000

    :goto_8
    or-int/2addr v3, v8

    goto :goto_9

    :cond_e
    move-object/from16 v7, p4

    :goto_9
    const/high16 v8, 0x30000

    and-int/2addr v8, v9

    if-nez v8, :cond_11

    and-int/lit8 v8, p10, 0x20

    if-nez v8, :cond_f

    move-object/from16 v8, p5

    invoke-virtual {v1, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_10

    const/high16 v10, 0x20000

    goto :goto_a

    :cond_f
    move-object/from16 v8, p5

    :cond_10
    const/high16 v10, 0x10000

    :goto_a
    or-int/2addr v3, v10

    goto :goto_b

    :cond_11
    move-object/from16 v8, p5

    :goto_b
    const/high16 v10, 0x180000

    and-int/2addr v10, v9

    if-nez v10, :cond_14

    and-int/lit8 v10, p10, 0x40

    if-nez v10, :cond_12

    move-object/from16 v10, p6

    invoke-virtual {v1, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_13

    const/high16 v11, 0x100000

    goto :goto_c

    :cond_12
    move-object/from16 v10, p6

    :cond_13
    const/high16 v11, 0x80000

    :goto_c
    or-int/2addr v3, v11

    goto :goto_d

    :cond_14
    move-object/from16 v10, p6

    :goto_d
    const/high16 v11, 0xc00000

    and-int/2addr v11, v9

    if-nez v11, :cond_16

    move-object/from16 v11, p7

    invoke-virtual {v1, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_15

    const/high16 v12, 0x800000

    goto :goto_e

    :cond_15
    const/high16 v12, 0x400000

    :goto_e
    or-int/2addr v3, v12

    goto :goto_f

    :cond_16
    move-object/from16 v11, p7

    :goto_f
    const v12, 0x492493

    and-int/2addr v3, v12

    const v12, 0x492492

    if-ne v3, v12, :cond_18

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_17

    goto :goto_11

    :cond_17
    invoke-virtual {v1}, Lp1/q;->X()V

    move-object v3, v4

    :goto_10
    move-object v4, v6

    move-object v6, v8

    goto/16 :goto_18

    :cond_18
    :goto_11
    invoke-virtual {v1}, Lp1/q;->Z()V

    and-int/lit8 v3, v9, 0x1

    if-eqz v3, :cond_1a

    invoke-virtual {v1}, Lp1/q;->C()Z

    move-result v3

    if-eqz v3, :cond_19

    goto :goto_12

    :cond_19
    invoke-virtual {v1}, Lp1/q;->X()V

    move-object v3, v4

    goto :goto_15

    :cond_1a
    :goto_12
    and-int/lit8 v3, p10, 0x1

    if-eqz v3, :cond_1c

    sget-object v2, Ld40/p;->a:Ld40/n;

    invoke-static {v1}, Ldc/a;->G(Landroidx/compose/runtime/Composer;)Z

    move-result v2

    if-eqz v2, :cond_1b

    sget-object v2, Ld40/p;->a:Ld40/n;

    goto :goto_13

    :cond_1b
    sget-object v2, Ld40/p;->b:Ld40/n;

    :cond_1c
    :goto_13
    and-int/lit8 v3, p10, 0x2

    if-eqz v3, :cond_1d

    sget-object v3, Ld40/p;->c:Ld40/o;

    goto :goto_14

    :cond_1d
    move-object v3, v4

    :goto_14
    and-int/lit8 v4, p10, 0x4

    if-eqz v4, :cond_1e

    sget-object v4, Ld40/p;->d:Ld40/s;

    move-object v5, v4

    :cond_1e
    and-int/lit8 v4, p10, 0x8

    if-eqz v4, :cond_1f

    sget-object v4, Ld40/p;->g:Ljava/lang/Float;

    move-object v6, v4

    :cond_1f
    and-int/lit8 v4, p10, 0x10

    if-eqz v4, :cond_20

    sget-object v4, Ld40/p;->i:Ld40/m;

    move-object v7, v4

    :cond_20
    and-int/lit8 v4, p10, 0x20

    if-eqz v4, :cond_21

    sget-object v4, Ld40/p;->h:Ld40/g;

    move-object v8, v4

    :cond_21
    and-int/lit8 v4, p10, 0x40

    if-eqz v4, :cond_22

    sget-object v4, Ld40/p;->j:Ld40/h;

    move-object v10, v4

    :cond_22
    :goto_15
    invoke-virtual {v1}, Lp1/q;->r()V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    sget-object v12, Lb3/k2;->a:Lp1/u2;

    invoke-virtual {v1, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Boolean;

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    if-nez v13, :cond_24

    if-eqz v4, :cond_23

    goto :goto_16

    :cond_23
    const/4 v4, 0x0

    goto :goto_17

    :cond_24
    :goto_16
    const/4 v4, 0x1

    :goto_17
    sget-object v13, Ld40/r;->c:Lp1/u2;

    invoke-virtual {v13, v2}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v14

    sget-object v13, Ld40/r;->d:Lp1/u2;

    invoke-virtual {v13, v3}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v15

    sget-object v13, Ld40/r;->e:Lp1/u2;

    invoke-virtual {v13, v5}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v16

    sget-object v13, Ld40/r;->f:Lp1/u2;

    invoke-virtual {v13, v6}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v17

    sget-object v13, Ld40/r;->i:Lp1/u2;

    invoke-virtual {v13, v7}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v18

    sget-object v13, Ld40/r;->j:Lp1/u2;

    invoke-virtual {v13, v8}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v19

    sget-object v13, Ld40/r;->g:Lp1/u2;

    invoke-virtual {v13, v10}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v20

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v12, v4}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v21

    sget-object v4, Ld40/r;->h:Lp1/u2;

    invoke-virtual {v4, v0}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v22

    filled-new-array/range {v14 .. v22}, [Lp1/u1;

    move-result-object v0

    new-instance v4, Lb1/d;

    const/4 v12, 0x1

    move-object/from16 p1, v2

    move-object/from16 p3, v3

    move-object/from16 p0, v4

    move-object/from16 p2, v5

    move-object/from16 p4, v11

    move/from16 p5, v12

    invoke-direct/range {p0 .. p5}, Lb1/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lx1/b;I)V

    const v11, 0x13b99063

    invoke-static {v11, v1, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v4

    const/16 v11, 0x38

    invoke-static {v0, v4, v1, v11}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto/16 :goto_10

    :goto_18
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_25

    new-instance v0, Lb90/b;

    const/4 v11, 0x6

    move-object/from16 v8, p7

    move-object v1, v2

    move-object v2, v3

    move-object v3, v5

    move-object v5, v7

    move-object v7, v10

    move/from16 v10, p10

    invoke-direct/range {v0 .. v11}, Lb90/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_25
    return-void
.end method

.method public static final b(Landroid/content/Context;F)F
    .locals 0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr p1, p0

    return p1
.end method

.method public static final c(Ld40/k;Landroid/content/Context;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ld40/r;->o(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p0, p0, Ld40/k;->b:Ld40/i;

    goto :goto_0

    :cond_0
    iget-object p0, p0, Ld40/k;->a:Ld40/i;

    :goto_0
    iget-wide p0, p0, Ld40/i;->a:J

    invoke-static {p0, p1}, Li2/w0;->H(J)I

    move-result p0

    return p0
.end method

.method public static final d(ZLandroidx/compose/runtime/Composer;I)Lf0/t;
    .locals 3

    and-int/lit8 p2, p2, 0x7e

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p0, v1, p2, p1, v0}, Ld40/r;->f(ZFILandroidx/compose/runtime/Composer;I)F

    move-result p2

    const/4 v0, 0x0

    check-cast p1, Lp1/q;

    if-eqz p0, :cond_0

    const p0, 0x155a8d18

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    invoke-static {p1}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object p0

    iget-object p0, p0, Ld40/n;->i:Lg1/c1;

    invoke-virtual {p0}, Lg1/c1;->f()J

    move-result-wide v1

    :goto_0
    invoke-virtual {p1, v0}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_0
    const p0, 0x155a9060

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    invoke-static {p1}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object p0

    iget-wide v1, p0, Ld40/n;->b:J

    goto :goto_0

    :goto_1
    invoke-static {p2, v1, v2}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ld40/k;Landroid/content/Context;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ld40/r;->o(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p0, p0, Ld40/k;->b:Ld40/i;

    goto :goto_0

    :cond_0
    iget-object p0, p0, Ld40/k;->a:Ld40/i;

    :goto_0
    iget-wide p0, p0, Ld40/i;->c:J

    invoke-static {p0, p1}, Li2/w0;->H(J)I

    move-result p0

    return p0
.end method

.method public static final f(ZFILandroidx/compose/runtime/Composer;I)F
    .locals 0

    const/4 p2, 0x2

    and-int/2addr p4, p2

    if-eqz p4, :cond_0

    int-to-float p1, p2

    :cond_0
    const/4 p2, 0x0

    check-cast p3, Lp1/q;

    if-eqz p0, :cond_1

    const p0, 0x2cab5af1

    invoke-virtual {p3, p0}, Lp1/q;->e0(I)V

    invoke-static {p3}, Ld40/r;->l(Landroidx/compose/runtime/Composer;)Ld40/o;

    move-result-object p0

    iget p0, p0, Ld40/o;->c:F

    invoke-static {p0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p0

    :goto_0
    invoke-virtual {p3, p2}, Lp1/q;->q(Z)V

    return p0

    :cond_1
    const p0, 0x2cab66f6

    invoke-virtual {p3, p0}, Lp1/q;->e0(I)V

    invoke-static {p3}, Ld40/r;->l(Landroidx/compose/runtime/Composer;)Ld40/o;

    move-result-object p0

    iget p0, p0, Ld40/o;->c:F

    goto :goto_0
.end method

.method public static final g(Ld40/k;Landroidx/compose/runtime/Composer;)Ll3/v0;
    .locals 33

    move-object/from16 v0, p0

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Ld40/k;->d:Ld40/l;

    sget-object v2, Lg1/i9;->b:Lp1/u2;

    move-object/from16 v3, p1

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg1/h9;

    iget-object v3, v2, Lg1/h9;->e:Ll3/v0;

    invoke-static/range {p1 .. p1}, Ldc/a;->G(Landroidx/compose/runtime/Composer;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, v0, Ld40/k;->b:Ld40/i;

    goto :goto_0

    :cond_0
    iget-object v0, v0, Ld40/k;->a:Ld40/i;

    :goto_0
    iget-wide v4, v0, Ld40/i;->b:J

    iget-wide v6, v1, Ld40/l;->b:J

    const/16 v16, 0x0

    const v17, 0xfffffc

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    invoke-static/range {v3 .. v17}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v18

    iget-object v0, v1, Ld40/l;->a:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, v1, v2}, Lhg3/i;->b(ILp3/r;I)Lp3/x;

    move-result-object v0

    filled-new-array {v0}, [Lp3/x;

    move-result-object v0

    invoke-static {v0}, Le93/b;->d([Lp3/x;)Lp3/l;

    move-result-object v24

    const/16 v31, 0x0

    const v32, 0xffffdf

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const-wide/16 v28, 0x0

    const/16 v30, 0x0

    invoke-static/range {v18 .. v32}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v0

    return-object v0

    :cond_1
    return-object v18
.end method

.method public static final h(Ld40/k;Landroid/content/Context;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ld40/r;->o(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p0, p0, Ld40/k;->b:Ld40/i;

    goto :goto_0

    :cond_0
    iget-object p0, p0, Ld40/k;->a:Ld40/i;

    :goto_0
    iget-wide p0, p0, Ld40/i;->b:J

    invoke-static {p0, p1}, Li2/w0;->H(J)I

    move-result p0

    return p0
.end method

.method public static final i(Ld40/k;Landroid/content/Context;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ld40/r;->o(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p0, p0, Ld40/k;->b:Ld40/i;

    goto :goto_0

    :cond_0
    iget-object p0, p0, Ld40/k;->a:Ld40/i;

    :goto_0
    iget-wide p0, p0, Ld40/i;->e:J

    invoke-static {p0, p1}, Li2/w0;->H(J)I

    move-result p0

    return p0
.end method

.method public static final j()Ll0/l1;
    .locals 4

    sget-object v0, Ld40/p;->a:Ld40/n;

    sget-object v0, Ld40/p;->f:Ld40/g;

    iget v1, v0, Ld40/g;->a:F

    iget v0, v0, Ld40/g;->c:F

    const/16 v2, 0xa

    const/4 v3, 0x0

    invoke-static {v1, v3, v0, v3, v2}, Landroidx/compose/foundation/layout/a;->c(FFFFI)Ll0/l1;

    move-result-object v0

    return-object v0
.end method

.method public static final k(Landroidx/compose/runtime/Composer;)Ld40/n;
    .locals 1

    sget-object v0, Ld40/r;->c:Lp1/u2;

    check-cast p0, Lp1/q;

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ld40/n;

    return-object p0
.end method

.method public static final l(Landroidx/compose/runtime/Composer;)Ld40/o;
    .locals 1

    sget-object v0, Ld40/r;->d:Lp1/u2;

    check-cast p0, Lp1/q;

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ld40/o;

    return-object p0
.end method

.method public static final m(Landroidx/compose/runtime/Composer;)Ld40/s;
    .locals 1

    sget-object v0, Ld40/r;->e:Lp1/u2;

    check-cast p0, Lp1/q;

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ld40/s;

    return-object p0
.end method

.method public static final n(Ld40/k;Landroid/content/Context;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ld40/r;->o(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p0, p0, Ld40/k;->b:Ld40/i;

    goto :goto_0

    :cond_0
    iget-object p0, p0, Ld40/k;->a:Ld40/i;

    :goto_0
    iget-wide p0, p0, Ld40/i;->d:J

    invoke-static {p0, p1}, Li2/w0;->H(J)I

    move-result p0

    return p0
.end method

.method public static final o(Landroid/content/Context;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p0, p0, 0x30

    const/16 v0, 0x20

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final p(J)Z
    .locals 4

    invoke-static {p0, p1}, Li2/w0;->H(J)I

    move-result v0

    sget v1, Li2/x;->o:I

    sget-wide v1, Li2/x;->b:J

    invoke-static {v1, v2}, Li2/w0;->H(J)I

    move-result v1

    invoke-static {v0, v1}, Lv4/a;->c(II)D

    move-result-wide v0

    invoke-static {p0, p1}, Li2/w0;->H(J)I

    move-result p0

    sget-wide v2, Li2/x;->f:J

    invoke-static {v2, v3}, Li2/w0;->H(J)I

    move-result p1

    invoke-static {p0, p1}, Lv4/a;->c(II)D

    move-result-wide p0

    const-wide v2, 0x400199999999999aL    # 2.2

    cmpl-double v2, p0, v2

    const/4 v3, 0x0

    if-lez v2, :cond_0

    return v3

    :cond_0
    cmpl-double p0, v0, p0

    if-lez p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    return v3
.end method

.method public static final q(Ll3/v0;)Ll3/v0;
    .locals 16

    sget-object v0, Ll3/v0;->d:Ll3/v0;

    iget-object v0, v0, Ll3/v0;->b:Ll3/b0;

    iget-wide v11, v0, Ll3/b0;->c:J

    iget-object v14, v0, Ll3/b0;->f:Lw3/i;

    new-instance v13, Ll3/g0;

    const/4 v0, 0x1

    invoke-direct {v13, v0}, Ll3/g0;-><init>(Z)V

    const/4 v10, 0x0

    const v15, 0xe5ffff

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v15}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v0

    return-object v0
.end method
