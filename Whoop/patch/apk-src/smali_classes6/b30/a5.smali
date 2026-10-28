.class public abstract Lb30/a5;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:J

.field public static final b:J

.field public static final c:J

.field public static final d:J

.field public static final e:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide v0, 0x99000000L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    sput-wide v0, Lb30/a5;->a:J

    sget v0, Li2/x;->o:I

    sget-wide v0, Li2/x;->f:J

    sput-wide v0, Lb30/a5;->b:J

    const-wide v0, 0xffe5e5eaL

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    sput-wide v0, Lb30/a5;->c:J

    const-wide v0, 0xff525252L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    sput-wide v0, Lb30/a5;->d:J

    const/16 v0, 0xc

    int-to-float v0, v0

    sput v0, Lb30/a5;->e:F

    return-void
.end method

.method public static final a(Ljava/lang/String;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 15

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    const v0, 0x51727556    # 6.5084416E10f

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v12, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v1, v4, 0x30

    if-nez v1, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, v4, 0x180

    if-nez v1, :cond_5

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x100

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    :cond_5
    and-int/lit16 v1, v0, 0x93

    const/16 v5, 0x92

    if-ne v1, v5, :cond_7

    invoke-virtual {v12}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v12}, Lp1/q;->X()V

    goto/16 :goto_8

    :cond_7
    :goto_4
    sget-object v1, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v12, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/c1;

    invoke-virtual {v1}, Lg1/c1;->b()J

    move-result-wide v5

    invoke-static {v5, v6}, Ld40/r;->p(J)Z

    move-result v1

    if-eqz v1, :cond_8

    sget-wide v5, Lb30/a5;->c:J

    goto :goto_5

    :cond_8
    sget-wide v5, Lb30/a5;->d:J

    :goto_5
    if-eqz v1, :cond_9

    sget-wide v7, Lb30/a5;->a:J

    goto :goto_6

    :cond_9
    sget-wide v7, Lb30/a5;->b:J

    :goto_6
    sget-object v1, Ld40/r;->g:Lp1/u2;

    invoke-virtual {v12, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld40/h;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eqz v1, :cond_b

    const/4 v9, 0x1

    if-ne v1, v9, :cond_a

    const v1, 0x7f0807cf

    goto :goto_7

    :cond_a
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_b
    const v1, 0x7f0807d0

    :goto_7
    const/4 v9, 0x0

    invoke-static {v1, v12, v9}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v1

    new-instance v11, Li2/p;

    const/4 v10, 0x5

    invoke-direct {v11, v7, v8, v10}, Li2/p;-><init>(JI)V

    new-instance v7, Ly2/l;

    const v8, 0x3f666666    # 0.9f

    invoke-direct {v7, v8}, Ly2/l;-><init>(F)V

    const/16 v8, 0x14

    int-to-float v8, v8

    invoke-static {v8, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v10, Lt0/j;->a:Lt0/i;

    invoke-static {v8, v10}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v10, Li2/w0;->a:Li2/v0;

    invoke-static {v8, v5, v6, v10}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v8, 0x7

    invoke-static {v5, v9, v6, v2, v8}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const-string v6, "modify_badge"

    invoke-static {v5, v6}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    shl-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0x70

    or-int/lit16 v13, v0, 0x6000

    const/16 v14, 0x28

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object v6, p0

    move-object v9, v7

    move-object v7, v5

    move-object v5, v1

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    :goto_8
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_c

    new-instance v0, Lj;

    const/4 v5, 0x5

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lj;-><init>(Ljava/lang/String;Lc93/a;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method public static final b(ZZLc93/a;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 7

    check-cast p4, Lp1/q;

    const v0, -0x1c275403

    invoke-virtual {p4, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p4, p0}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p5

    invoke-virtual {p4, p1}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x20

    goto :goto_1

    :cond_1
    const/16 v1, 0x10

    :goto_1
    or-int/2addr v0, v1

    invoke-virtual {p4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    const/16 v2, 0x100

    if-eqz v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    const/16 v1, 0x80

    :goto_2
    or-int/2addr v0, v1

    invoke-virtual {p4, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x800

    goto :goto_3

    :cond_3
    const/16 v1, 0x400

    :goto_3
    or-int/2addr v0, v1

    and-int/lit16 v1, v0, 0x493

    const/16 v3, 0x492

    if-ne v1, v3, :cond_5

    invoke-virtual {p4}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {p4}, Lp1/q;->X()V

    goto/16 :goto_6

    :cond_5
    :goto_4
    sget-object v1, Lb2/t;->w:Lb2/t;

    const/4 v3, 0x0

    if-eqz p1, :cond_9

    const v4, 0x609b3c

    invoke-virtual {p4, v4}, Lp1/q;->e0(I)V

    const v4, 0x7be224a9

    invoke-virtual {p4, v4}, Lp1/q;->e0(I)V

    and-int/lit16 v4, v0, 0x380

    const/4 v5, 0x1

    if-ne v4, v2, :cond_6

    move v2, v5

    goto :goto_5

    :cond_6
    move v2, v3

    :goto_5
    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_7

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v4, v2, :cond_8

    :cond_7
    new-instance v4, La31/e;

    const/4 v2, 0x4

    invoke-direct {v4, p2, v2}, La31/e;-><init>(Lc93/a;I)V

    invoke-virtual {p4, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v4, Lc93/a;

    invoke-virtual {p4, v3}, Lp1/q;->q(Z)V

    const/16 v2, -0xe

    int-to-float v2, v2

    int-to-float v6, v5

    invoke-static {v1, v2, v6}, Landroidx/compose/foundation/layout/a;->m(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v5, v2}, Landroidx/compose/foundation/c;->a(Landroidx/compose/ui/Modifier;ZLj0/i;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    shr-int/lit8 v0, v0, 0x9

    and-int/lit8 v0, v0, 0xe

    or-int/lit16 v0, v0, 0x180

    invoke-static {p3, v4, v1, p4, v0}, Lb30/a5;->a(Ljava/lang/String;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p4, v3}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_9
    if-eqz p0, :cond_a

    const v0, 0x64ab6e

    invoke-virtual {p4, v0}, Lp1/q;->e0(I)V

    const/16 v0, -0x12

    int-to-float v0, v0

    const/16 v2, 0x3a

    int-to-float v2, v2

    invoke-static {v1, v0, v2}, Landroidx/compose/foundation/layout/a;->m(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, p4, v1}, Lse/g;->g(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p4, v3}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_a
    const v0, 0x663597

    invoke-virtual {p4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {p4, v3}, Lp1/q;->q(Z)V

    :goto_6
    invoke-virtual {p4}, Lp1/q;->u()Lp1/v1;

    move-result-object p4

    if-eqz p4, :cond_b

    new-instance v0, Lb30/u4;

    move v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lb30/u4;-><init>(ZZLc93/a;Ljava/lang/String;I)V

    iput-object v0, p4, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method public static final c(Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V
    .locals 11

    move-object v7, p2

    check-cast v7, Lp1/q;

    const p2, -0x44a4c278

    invoke-virtual {v7, p2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v7, p1}, Lp1/q;->h(Z)Z

    move-result p2

    const/4 v0, 0x2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    move p2, v0

    :goto_0
    or-int/2addr p2, p4

    invoke-virtual {v7, p3}, Lp1/q;->e(I)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x20

    goto :goto_1

    :cond_1
    const/16 v1, 0x10

    :goto_1
    or-int/2addr p2, v1

    const/4 v1, 0x0

    invoke-virtual {v7, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x100

    goto :goto_2

    :cond_2
    const/16 v1, 0x80

    :goto_2
    or-int/2addr p2, v1

    or-int/lit16 p2, p2, 0xc00

    and-int/lit16 v1, p2, 0x493

    const/16 v2, 0x492

    if-ne v1, v2, :cond_4

    invoke-virtual {v7}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v7}, Lp1/q;->X()V

    move v2, p1

    goto :goto_4

    :cond_4
    :goto_3
    const/16 p0, 0x40

    int-to-float p0, p0

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {p0, v10}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 v1, 0x6

    int-to-float v2, v1

    const/4 v3, 0x0

    invoke-static {p0, v2, v3, v0}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    new-instance p0, Lb30/v4;

    const/4 v2, 0x0

    invoke-direct {p0, p3, v2}, Lb30/v4;-><init>(II)V

    const v2, -0x44f5e973

    invoke-static {v2, v7, p0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    shl-int/lit8 p0, p2, 0x6

    and-int/lit16 p0, p0, 0x380

    const/high16 p2, 0x30000

    or-int v8, p0, p2

    const/16 v9, 0x1a

    const/4 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    move v2, p1

    invoke-static/range {v0 .. v9}, Lse/a;->p(Landroidx/compose/ui/Modifier;Li2/a1;ZJLf0/t;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    move-object p0, v10

    :goto_4
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_5

    new-instance p2, Lam0/b;

    invoke-direct {p2, p3, p4, p0, v2}, Lam0/b;-><init>(IILandroidx/compose/ui/Modifier;Z)V

    iput-object p2, p1, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method public static final d(Landroidx/compose/ui/Modifier;FZZZZZILjava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Lc93/a;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;III)V
    .locals 32

    move/from16 v2, p1

    move/from16 v6, p5

    move-object/from16 v9, p11

    move-object/from16 v15, p14

    move/from16 v0, p16

    move/from16 v1, p17

    move/from16 v14, p18

    const-string v3, "description"

    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onItemSelectedListener"

    invoke-static {v15, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p15

    check-cast v3, Lp1/q;

    const v4, -0x5251ff6b

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v0, 0x6

    if-nez v4, :cond_1

    move-object/from16 v4, p0

    invoke-virtual {v3, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    const/4 v8, 0x4

    goto :goto_0

    :cond_0
    const/4 v8, 0x2

    :goto_0
    or-int/2addr v8, v0

    goto :goto_1

    :cond_1
    move-object/from16 v4, p0

    move v8, v0

    :goto_1
    and-int/lit8 v10, v0, 0x30

    if-nez v10, :cond_3

    invoke-virtual {v3, v2}, Lp1/q;->d(F)Z

    move-result v10

    if-eqz v10, :cond_2

    const/16 v10, 0x20

    goto :goto_2

    :cond_2
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v8, v10

    :cond_3
    and-int/lit16 v10, v0, 0x180

    const/16 v16, 0x100

    if-nez v10, :cond_5

    move/from16 v10, p2

    invoke-virtual {v3, v10}, Lp1/q;->h(Z)Z

    move-result v17

    if-eqz v17, :cond_4

    move/from16 v17, v16

    goto :goto_3

    :cond_4
    const/16 v17, 0x80

    :goto_3
    or-int v8, v8, v17

    goto :goto_4

    :cond_5
    move/from16 v10, p2

    :goto_4
    and-int/lit16 v5, v0, 0xc00

    const/16 v17, 0x400

    const/16 v18, 0x800

    if-nez v5, :cond_7

    move/from16 v5, p3

    invoke-virtual {v3, v5}, Lp1/q;->h(Z)Z

    move-result v19

    if-eqz v19, :cond_6

    move/from16 v19, v18

    goto :goto_5

    :cond_6
    move/from16 v19, v17

    :goto_5
    or-int v8, v8, v19

    goto :goto_6

    :cond_7
    move/from16 v5, p3

    :goto_6
    and-int/lit16 v7, v0, 0x6000

    const/16 v20, 0x2000

    const/16 v21, 0x4000

    if-nez v7, :cond_9

    move/from16 v7, p4

    invoke-virtual {v3, v7}, Lp1/q;->h(Z)Z

    move-result v22

    if-eqz v22, :cond_8

    move/from16 v22, v21

    goto :goto_7

    :cond_8
    move/from16 v22, v20

    :goto_7
    or-int v8, v8, v22

    goto :goto_8

    :cond_9
    move/from16 v7, p4

    :goto_8
    const/high16 v22, 0x30000

    and-int v23, v0, v22

    const/high16 v24, 0x10000

    const/high16 v25, 0x20000

    if-nez v23, :cond_b

    invoke-virtual {v3, v6}, Lp1/q;->h(Z)Z

    move-result v23

    if-eqz v23, :cond_a

    move/from16 v23, v25

    goto :goto_9

    :cond_a
    move/from16 v23, v24

    :goto_9
    or-int v8, v8, v23

    :cond_b
    const/high16 v23, 0x180000

    and-int v23, v0, v23

    if-nez v23, :cond_d

    and-int/lit8 v23, v14, 0x40

    move/from16 v11, p6

    if-nez v23, :cond_c

    invoke-virtual {v3, v11}, Lp1/q;->h(Z)Z

    move-result v26

    if-eqz v26, :cond_c

    const/high16 v26, 0x100000

    goto :goto_a

    :cond_c
    const/high16 v26, 0x80000

    :goto_a
    or-int v8, v8, v26

    goto :goto_b

    :cond_d
    move/from16 v11, p6

    :goto_b
    const/high16 v26, 0xc00000

    and-int v26, v0, v26

    move/from16 v12, p7

    if-nez v26, :cond_f

    invoke-virtual {v3, v12}, Lp1/q;->e(I)Z

    move-result v27

    if-eqz v27, :cond_e

    const/high16 v27, 0x800000

    goto :goto_c

    :cond_e
    const/high16 v27, 0x400000

    :goto_c
    or-int v8, v8, v27

    :cond_f
    and-int/lit16 v13, v14, 0x100

    const/high16 v28, 0x6000000

    const/4 v0, 0x0

    if-eqz v13, :cond_10

    or-int v8, v8, v28

    goto :goto_e

    :cond_10
    and-int v13, p16, v28

    if-nez v13, :cond_12

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_11

    const/high16 v13, 0x4000000

    goto :goto_d

    :cond_11
    const/high16 v13, 0x2000000

    :goto_d
    or-int/2addr v8, v13

    :cond_12
    :goto_e
    and-int/lit16 v13, v14, 0x200

    const/high16 v28, 0x30000000

    if-eqz v13, :cond_13

    or-int v8, v8, v28

    move-object/from16 v0, p8

    goto :goto_10

    :cond_13
    and-int v28, p16, v28

    move-object/from16 v0, p8

    if-nez v28, :cond_15

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_14

    const/high16 v29, 0x20000000

    goto :goto_f

    :cond_14
    const/high16 v29, 0x10000000

    :goto_f
    or-int v8, v8, v29

    :cond_15
    :goto_10
    and-int/lit16 v0, v14, 0x400

    if-eqz v0, :cond_16

    or-int/lit8 v19, v1, 0x6

    move/from16 v29, v0

    move/from16 v0, p9

    goto :goto_12

    :cond_16
    and-int/lit8 v29, v1, 0x6

    if-nez v29, :cond_18

    move/from16 v29, v0

    move/from16 v0, p9

    invoke-virtual {v3, v0}, Lp1/q;->h(Z)Z

    move-result v30

    if-eqz v30, :cond_17

    const/16 v19, 0x4

    goto :goto_11

    :cond_17
    const/16 v19, 0x2

    :goto_11
    or-int v19, v1, v19

    goto :goto_12

    :cond_18
    move/from16 v29, v0

    move/from16 v0, p9

    move/from16 v19, v1

    :goto_12
    and-int/lit8 v30, v1, 0x30

    move-object/from16 v0, p10

    if-nez v30, :cond_1a

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_19

    const/16 v23, 0x20

    goto :goto_13

    :cond_19
    const/16 v23, 0x10

    :goto_13
    or-int v19, v19, v23

    :cond_1a
    and-int/lit16 v0, v1, 0x180

    if-nez v0, :cond_1c

    invoke-virtual {v3, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1b

    goto :goto_14

    :cond_1b
    const/16 v16, 0x80

    :goto_14
    or-int v19, v19, v16

    :cond_1c
    move/from16 v0, v19

    and-int/lit16 v4, v14, 0x2000

    if-eqz v4, :cond_1d

    or-int/lit16 v0, v0, 0xc00

    goto :goto_16

    :cond_1d
    move/from16 v16, v0

    and-int/lit16 v0, v1, 0xc00

    if-nez v0, :cond_1f

    move-object/from16 v0, p12

    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_1e

    move/from16 v17, v18

    :cond_1e
    or-int v16, v16, v17

    :goto_15
    move/from16 v0, v16

    goto :goto_16

    :cond_1f
    move-object/from16 v0, p12

    goto :goto_15

    :goto_16
    move/from16 v16, v4

    and-int/lit16 v4, v14, 0x4000

    if-eqz v4, :cond_21

    or-int/lit16 v0, v0, 0x6000

    move/from16 v17, v0

    :cond_20
    move-object/from16 v0, p13

    goto :goto_17

    :cond_21
    move/from16 v17, v0

    and-int/lit16 v0, v1, 0x6000

    if-nez v0, :cond_20

    move-object/from16 v0, p13

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_22

    move/from16 v20, v21

    :cond_22
    or-int v17, v17, v20

    :goto_17
    and-int v18, v1, v22

    if-nez v18, :cond_24

    invoke-virtual {v3, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_23

    move/from16 v24, v25

    :cond_23
    or-int v17, v17, v24

    :cond_24
    const v18, 0x12492493

    and-int v8, v8, v18

    const v0, 0x12492492

    if-ne v8, v0, :cond_26

    const v0, 0x12493

    and-int v0, v17, v0

    const v8, 0x12492

    if-ne v0, v8, :cond_26

    invoke-virtual {v3}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_25

    goto :goto_18

    :cond_25
    invoke-virtual {v3}, Lp1/q;->X()V

    move-object/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object v15, v3

    move v7, v11

    goto/16 :goto_20

    :cond_26
    :goto_18
    invoke-virtual {v3}, Lp1/q;->Z()V

    and-int/lit8 v0, p16, 0x1

    if-eqz v0, :cond_28

    invoke-virtual {v3}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_27

    goto :goto_19

    :cond_27
    invoke-virtual {v3}, Lp1/q;->X()V

    move-object/from16 v10, p8

    move/from16 v12, p9

    move-object/from16 v28, p12

    move-object/from16 v4, p13

    goto :goto_1e

    :cond_28
    :goto_19
    and-int/lit8 v0, v14, 0x40

    if-eqz v0, :cond_29

    move v11, v6

    :cond_29
    if-eqz v13, :cond_2a

    const/4 v0, 0x0

    goto :goto_1a

    :cond_2a
    move-object/from16 v0, p8

    :goto_1a
    if-eqz v29, :cond_2b

    const/4 v8, 0x1

    goto :goto_1b

    :cond_2b
    move/from16 v8, p9

    :goto_1b
    if-eqz v16, :cond_2c

    const/16 v28, 0x0

    goto :goto_1c

    :cond_2c
    move-object/from16 v28, p12

    :goto_1c
    if-eqz v4, :cond_2d

    const-string v4, ""

    :goto_1d
    move-object v10, v0

    move v12, v8

    goto :goto_1e

    :cond_2d
    move-object/from16 v4, p13

    goto :goto_1d

    :goto_1e
    invoke-virtual {v3}, Lp1/q;->r()V

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    sget v18, Lb30/a5;->e:F

    const/16 v19, 0x0

    move-object/from16 v16, p0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->o(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    if-eqz v6, :cond_2e

    const/high16 v8, 0x3f800000    # 1.0f

    goto :goto_1f

    :cond_2e
    const v8, 0x3f19999a    # 0.6f

    :goto_1f
    invoke-static {v8, v0}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    new-instance v17, Lb30/w4;

    const/16 v22, 0x0

    move/from16 v18, p2

    move-object/from16 v21, v4

    move/from16 v19, v5

    move-object/from16 v20, v28

    invoke-direct/range {v17 .. v22}, Lb30/w4;-><init>(ZZLjava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v4, v17

    const v5, 0x179cc90d

    invoke-static {v5, v3, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v4

    move-object v5, v3

    new-instance v3, Lb30/z4;

    move v1, v11

    move v11, v6

    move v6, v1

    move/from16 v8, p7

    move-object v1, v4

    move v13, v7

    move-object v7, v15

    move-object/from16 v4, p10

    move-object v15, v5

    move/from16 v5, p2

    invoke-direct/range {v3 .. v13}, Lb30/z4;-><init>(Ljava/lang/String;ZZLc93/a;ILjava/lang/String;Ljava/lang/Integer;ZZZ)V

    const v4, 0x197f878f

    invoke-static {v4, v15, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    const/16 v4, 0x186

    invoke-static {v4, v15, v0, v1, v3}, Lg1/p0;->a(ILandroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;Lx1/b;Lx1/b;)V

    move v7, v6

    move-object v9, v10

    move v10, v12

    move-object/from16 v13, v20

    move-object/from16 v14, v21

    :goto_20
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_2f

    move-object v1, v0

    new-instance v0, Lb30/t4;

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v8, p7

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v15, p14

    move/from16 v16, p16

    move/from16 v17, p17

    move/from16 v18, p18

    move-object/from16 v31, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v18}, Lb30/t4;-><init>(Landroidx/compose/ui/Modifier;FZZZZZILjava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Lc93/a;Ljava/lang/String;Lc93/a;III)V

    move-object/from16 v1, v31

    iput-object v0, v1, Lp1/v1;->d:Lc93/m;

    :cond_2f
    return-void
.end method
