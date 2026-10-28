.class public abstract Ll41/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a}\u0010\u0011\u001a\u00020\u000f2\n\u0008\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00002\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00022\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "",
        "title",
        "",
        "is24Hour",
        "Lorg/joda/time/LocalTime;",
        "initialTime",
        "saveEnabled",
        "buttonText",
        "Li2/x;",
        "buttonColor",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "keyboardEnabled",
        "Lkotlin/Function2;",
        "",
        "Ll83/a0;",
        "currentTime",
        "g",
        "(Ljava/lang/String;ZLorg/joda/time/LocalTime;ZLjava/lang/String;JLandroidx/compose/ui/Modifier;ZLc93/m;Landroidx/compose/runtime/Composer;II)V",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Landroid/widget/TimePicker;)V
    .locals 0

    invoke-static {p0}, Ll41/d;->k(Landroid/widget/TimePicker;)V

    return-void
.end method

.method public static synthetic b(Ljava/lang/String;ZLorg/joda/time/LocalTime;ZLjava/lang/String;JLandroidx/compose/ui/Modifier;ZLc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p13}, Ll41/d;->m(Ljava/lang/String;ZLorg/joda/time/LocalTime;ZLjava/lang/String;JLandroidx/compose/ui/Modifier;ZLc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroid/widget/TimePicker;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ll41/d;->j(Landroid/widget/TimePicker;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(ZLorg/joda/time/LocalTime;Lp1/c1;Lp1/c1;ZZLc93/m;Landroid/content/Context;)Landroid/widget/TimePicker;
    .locals 0

    invoke-static/range {p0 .. p7}, Ll41/d;->h(ZLorg/joda/time/LocalTime;Lp1/c1;Lp1/c1;ZZLc93/m;Landroid/content/Context;)Landroid/widget/TimePicker;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lc93/m;Lp1/c1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ll41/d;->l(Lc93/m;Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lp1/c1;Lp1/c1;ZLc93/m;Landroid/widget/TimePicker;II)V
    .locals 0

    invoke-static/range {p0 .. p6}, Ll41/d;->i(Lp1/c1;Lp1/c1;ZLc93/m;Landroid/widget/TimePicker;II)V

    return-void
.end method

.method public static final g(Ljava/lang/String;ZLorg/joda/time/LocalTime;ZLjava/lang/String;JLandroidx/compose/ui/Modifier;ZLc93/m;Landroidx/compose/runtime/Composer;II)V
    .locals 40
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lorg/joda/time/LocalTime;",
            "Z",
            "Ljava/lang/String;",
            "J",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lc93/m;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v10, p9

    move/from16 v11, p11

    move/from16 v12, p12

    const/4 v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "currentTime"

    invoke-static {v10, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p10

    check-cast v1, Lp1/q;

    const v2, 0x1305f3e6

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v11, 0x6

    if-nez v2, :cond_2

    and-int/lit8 v2, v12, 0x1

    if-nez v2, :cond_0

    move-object/from16 v2, p0

    invoke-virtual {v1, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    move-object/from16 v2, p0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v11

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v4, v11

    :goto_1
    and-int/lit8 v5, v12, 0x2

    if-eqz v5, :cond_4

    or-int/lit8 v4, v4, 0x30

    :cond_3
    move/from16 v7, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v7, v11, 0x30

    if-nez v7, :cond_3

    move/from16 v7, p1

    invoke-virtual {v1, v7}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x20

    goto :goto_2

    :cond_5
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v4, v8

    :goto_3
    and-int/lit8 v8, v12, 0x4

    if-eqz v8, :cond_7

    or-int/lit16 v4, v4, 0x180

    :cond_6
    move-object/from16 v9, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v9, v11, 0x180

    if-nez v9, :cond_6

    move-object/from16 v9, p2

    invoke-virtual {v1, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_8

    const/16 v13, 0x100

    goto :goto_4

    :cond_8
    const/16 v13, 0x80

    :goto_4
    or-int/2addr v4, v13

    :goto_5
    and-int/lit8 v13, v12, 0x8

    if-eqz v13, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move/from16 v15, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v15, v11, 0xc00

    if-nez v15, :cond_9

    move/from16 v15, p3

    invoke-virtual {v1, v15}, Lp1/q;->h(Z)Z

    move-result v16

    if-eqz v16, :cond_b

    const/16 v16, 0x800

    goto :goto_6

    :cond_b
    const/16 v16, 0x400

    :goto_6
    or-int v4, v4, v16

    :goto_7
    and-int/lit16 v14, v11, 0x6000

    if-nez v14, :cond_e

    and-int/lit8 v14, v12, 0x10

    if-nez v14, :cond_c

    move-object/from16 v14, p4

    invoke-virtual {v1, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_d

    const/16 v16, 0x4000

    goto :goto_8

    :cond_c
    move-object/from16 v14, p4

    :cond_d
    const/16 v16, 0x2000

    :goto_8
    or-int v4, v4, v16

    goto :goto_9

    :cond_e
    move-object/from16 v14, p4

    :goto_9
    const/high16 v16, 0x30000

    and-int v16, v11, v16

    if-nez v16, :cond_10

    and-int/lit8 v16, v12, 0x20

    move-wide/from16 v6, p5

    if-nez v16, :cond_f

    invoke-virtual {v1, v6, v7}, Lp1/q;->f(J)Z

    move-result v16

    if-eqz v16, :cond_f

    const/high16 v16, 0x20000

    goto :goto_a

    :cond_f
    const/high16 v16, 0x10000

    :goto_a
    or-int v4, v4, v16

    goto :goto_b

    :cond_10
    move-wide/from16 v6, p5

    :goto_b
    and-int/lit8 v16, v12, 0x40

    const/high16 v17, 0x180000

    if-eqz v16, :cond_11

    or-int v4, v4, v17

    move-object/from16 v3, p7

    goto :goto_d

    :cond_11
    and-int v17, v11, v17

    move-object/from16 v3, p7

    if-nez v17, :cond_13

    invoke-virtual {v1, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_12

    const/high16 v18, 0x100000

    goto :goto_c

    :cond_12
    const/high16 v18, 0x80000

    :goto_c
    or-int v4, v4, v18

    :cond_13
    :goto_d
    move-object/from16 v18, v0

    and-int/lit16 v0, v12, 0x80

    const/high16 v19, 0xc00000

    if-eqz v0, :cond_14

    or-int v4, v4, v19

    move/from16 v14, p8

    goto :goto_f

    :cond_14
    and-int v19, v11, v19

    move/from16 v14, p8

    if-nez v19, :cond_16

    invoke-virtual {v1, v14}, Lp1/q;->h(Z)Z

    move-result v20

    if-eqz v20, :cond_15

    const/high16 v20, 0x800000

    goto :goto_e

    :cond_15
    const/high16 v20, 0x400000

    :goto_e
    or-int v4, v4, v20

    :cond_16
    :goto_f
    const/high16 v20, 0x6000000

    and-int v20, v11, v20

    if-nez v20, :cond_18

    invoke-virtual {v1, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_17

    const/high16 v20, 0x4000000

    goto :goto_10

    :cond_17
    const/high16 v20, 0x2000000

    :goto_10
    or-int v4, v4, v20

    :cond_18
    const v20, 0x2492493

    and-int v14, v4, v20

    move/from16 v20, v0

    const v0, 0x2492492

    if-eq v14, v0, :cond_19

    const/4 v0, 0x1

    goto :goto_11

    :cond_19
    const/4 v0, 0x0

    :goto_11
    and-int/lit8 v14, v4, 0x1

    invoke-virtual {v1, v14, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_38

    invoke-virtual {v1}, Lp1/q;->Z()V

    and-int/lit8 v0, v11, 0x1

    sget-object v14, Lb2/t;->w:Lb2/t;

    const v22, -0x70001

    const v23, -0xe001

    const/4 v2, 0x6

    if-eqz v0, :cond_1f

    invoke-virtual {v1}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_1a

    goto :goto_12

    :cond_1a
    invoke-virtual {v1}, Lp1/q;->X()V

    and-int/lit8 v0, v12, 0x1

    if-eqz v0, :cond_1b

    and-int/lit8 v4, v4, -0xf

    :cond_1b
    and-int/lit8 v0, v12, 0x10

    if-eqz v0, :cond_1c

    and-int v4, v4, v23

    :cond_1c
    and-int/lit8 v0, v12, 0x20

    if-eqz v0, :cond_1d

    and-int v4, v4, v22

    :cond_1d
    move-object/from16 v13, p0

    move/from16 v5, p1

    move-object v8, v9

    move v0, v15

    move-object/from16 v9, p4

    move v15, v4

    :cond_1e
    move/from16 v4, p8

    goto :goto_17

    :cond_1f
    :goto_12
    and-int/lit8 v0, v12, 0x1

    if-eqz v0, :cond_20

    sget v0, Lgy0/f;->B2:I

    invoke-static {v1, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    and-int/lit8 v4, v4, -0xf

    goto :goto_13

    :cond_20
    move-object/from16 v0, p0

    :goto_13
    if-eqz v5, :cond_21

    const/4 v5, 0x0

    goto :goto_14

    :cond_21
    move/from16 v5, p1

    :goto_14
    if-eqz v8, :cond_22

    const/4 v8, 0x0

    goto :goto_15

    :cond_22
    move-object v8, v9

    :goto_15
    if-eqz v13, :cond_23

    const/4 v15, 0x1

    :cond_23
    and-int/lit8 v9, v12, 0x10

    if-eqz v9, :cond_24

    sget v9, Lgy0/f;->A2:I

    invoke-static {v1, v9}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    and-int v4, v4, v23

    goto :goto_16

    :cond_24
    move-object/from16 v9, p4

    :goto_16
    and-int/lit8 v13, v12, 0x20

    if-eqz v13, :cond_25

    sget-object v6, Lx81/d;->a:Lx81/d;

    invoke-virtual {v6, v1, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->a()J

    move-result-wide v6

    and-int v4, v4, v22

    :cond_25
    if-eqz v16, :cond_26

    move-object v3, v14

    :cond_26
    move-object v13, v0

    move v0, v15

    move v15, v4

    if-eqz v20, :cond_1e

    const/4 v4, 0x1

    :goto_17
    invoke-virtual {v1}, Lp1/q;->r()V

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v20, v14

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-ne v2, v14, :cond_27

    invoke-static/range {v18 .. v18}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v2

    invoke-virtual {v1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_27
    check-cast v2, Lp1/c1;

    move/from16 p6, v0

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v14, :cond_28

    invoke-static/range {v18 .. v18}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    invoke-virtual {v1, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_28
    check-cast v0, Lp1/c1;

    move-object/from16 p0, v14

    const/high16 v14, 0x3f800000    # 1.0f

    move-object/from16 p4, v0

    invoke-static {v14, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v14, 0x4

    int-to-float v14, v14

    move-object/from16 p3, v2

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v14, v2

    invoke-static {v14, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v2, Lb2/e;->N:Lb2/k;

    sget-object v14, Ll0/m;->c:Ll0/g;

    move-object/from16 p8, v3

    const/16 v3, 0x30

    invoke-static {v14, v2, v1, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    move/from16 p2, v4

    iget-wide v3, v1, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v1, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    move/from16 p5, v5

    iget-boolean v5, v1, Lp1/q;->S:Z

    if-eqz v5, :cond_29

    invoke-virtual {v1, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_18

    :cond_29
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_18
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v1, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v1, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, v1, Lp1/q;->S:Z

    if-nez v4, :cond_2a

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2b

    :cond_2a
    invoke-static {v3, v1, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2b
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v1, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz p6, :cond_2c

    if-eqz v13, :cond_2c

    const v0, -0xd1bfbf0

    invoke-virtual {v1, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    const/4 v2, 0x6

    invoke-virtual {v0, v1, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->a()Lb91/a;

    move-result-object v33

    invoke-virtual {v0, v1, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v2

    and-int/lit8 v36, v15, 0xe

    const/16 v37, 0x0

    const v38, 0x2fffa

    const/4 v14, 0x0

    const-wide/16 v17, 0x0

    const/high16 v0, 0x800000

    const/16 v19, 0x0

    move-object/from16 v4, v20

    const/16 v20, 0x0

    const/high16 v5, 0x4000000

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v34, 0x0

    move-object/from16 v35, v1

    move-object v1, v4

    move v4, v15

    move-wide v15, v2

    const/16 v3, 0x800

    move v2, v0

    move-object/from16 v0, p0

    invoke-static/range {v13 .. v38}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v25, v13

    move-object/from16 v13, v35

    const/4 v14, 0x0

    invoke-virtual {v13, v14}, Lp1/q;->q(Z)V

    goto :goto_19

    :cond_2c
    move-object/from16 v0, p0

    move-object/from16 v25, v13

    move v4, v15

    const/high16 v2, 0x800000

    const/16 v3, 0x800

    const/high16 v5, 0x4000000

    const/4 v14, 0x0

    move-object v13, v1

    move-object/from16 v1, v20

    const v15, -0xd19a21a

    invoke-virtual {v13, v15}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v14}, Lp1/q;->q(Z)V

    :goto_19
    const/high16 v14, 0x1c00000

    and-int/2addr v14, v4

    if-ne v14, v2, :cond_2d

    const/4 v14, 0x1

    goto :goto_1a

    :cond_2d
    const/4 v14, 0x0

    :goto_1a
    invoke-virtual {v13, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v2, v14

    and-int/lit8 v14, v4, 0x70

    const/16 v15, 0x20

    if-ne v14, v15, :cond_2e

    const/4 v14, 0x1

    goto :goto_1b

    :cond_2e
    const/4 v14, 0x0

    :goto_1b
    or-int/2addr v2, v14

    and-int/lit16 v14, v4, 0x1c00

    if-ne v14, v3, :cond_2f

    const/4 v14, 0x1

    goto :goto_1c

    :cond_2f
    const/4 v14, 0x0

    :goto_1c
    or-int/2addr v2, v14

    const/high16 v3, 0xe000000

    and-int/2addr v3, v4

    if-ne v3, v5, :cond_30

    const/4 v14, 0x1

    goto :goto_1d

    :cond_30
    const/4 v14, 0x0

    :goto_1d
    or-int/2addr v2, v14

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v2, :cond_32

    if-ne v14, v0, :cond_31

    goto :goto_1e

    :cond_31
    move/from16 v27, p2

    move-object/from16 v15, p3

    move-object/from16 v39, p4

    move/from16 v26, p5

    move/from16 v2, p6

    goto :goto_1f

    :cond_32
    :goto_1e
    new-instance v2, Lbs2/b;

    move/from16 p1, p2

    move-object/from16 p0, v2

    move-object/from16 p2, v8

    move-object/from16 p7, v10

    invoke-direct/range {p0 .. p7}, Lbs2/b;-><init>(ZLorg/joda/time/LocalTime;Lp1/c1;Lp1/c1;ZZLc93/m;)V

    move-object/from16 v14, p0

    move/from16 v27, p1

    move-object/from16 v15, p3

    move-object/from16 v39, p4

    move/from16 v26, p5

    move/from16 v2, p6

    invoke-virtual {v13, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1f
    check-cast v14, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_33

    new-instance v5, Lkx1/b;

    move/from16 p6, v2

    const/16 v2, 0x1a

    invoke-direct {v5, v2}, Lkx1/b;-><init>(I)V

    invoke-virtual {v13, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_20

    :cond_33
    move/from16 p6, v2

    :goto_20
    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/16 v2, 0x180

    const/16 v16, 0x2

    const/16 v17, 0x0

    move/from16 p4, v2

    move-object/from16 p2, v5

    move-object/from16 p3, v13

    move-object/from16 p0, v14

    move/from16 p5, v16

    move-object/from16 p1, v17

    invoke-static/range {p0 .. p5}, Landroidx/compose/ui/viewinterop/a;->a(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    if-eqz p6, :cond_37

    const v2, -0xd080b3b

    invoke-virtual {v13, v2}, Lp1/q;->e0(I)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v14, Lny0/v;->TextMedium:Lny0/v;

    const/high16 v5, 0x4000000

    if-ne v3, v5, :cond_34

    const/4 v2, 0x1

    goto :goto_21

    :cond_34
    const/4 v2, 0x0

    :goto_21
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_35

    if-ne v3, v0, :cond_36

    :cond_35
    new-instance v3, Ll41/a;

    const/4 v0, 0x0

    move-object/from16 v2, v39

    invoke-direct {v3, v10, v15, v2, v0}, Ll41/a;-><init>(Lc93/m;Lp1/c1;Lp1/c1;I)V

    invoke-virtual {v13, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_36
    move-object/from16 v21, v3

    check-cast v21, Lc93/a;

    shr-int/lit8 v0, v4, 0x6

    and-int/lit16 v0, v0, 0x380

    or-int/lit8 v0, v0, 0x36

    shr-int/lit8 v2, v4, 0x3

    const v3, 0xe000

    and-int/2addr v2, v3

    or-int v23, v0, v2

    const/16 v24, 0x68

    const/16 v16, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-wide/from16 v17, v6

    move-object v15, v9

    move-object/from16 v22, v13

    move-object v13, v1

    invoke-static/range {v13 .. v24}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v13, v22

    const/4 v14, 0x0

    invoke-virtual {v13, v14}, Lp1/q;->q(Z)V

    :goto_22
    const/4 v0, 0x1

    goto :goto_23

    :cond_37
    move-wide/from16 v17, v6

    move-object v15, v9

    const/4 v14, 0x0

    const v0, -0xd03ce5a

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v14}, Lp1/q;->q(Z)V

    goto :goto_22

    :goto_23
    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    move/from16 v4, p6

    move-object v3, v8

    move-object v5, v15

    move-wide/from16 v6, v17

    move-object/from16 v1, v25

    move/from16 v2, v26

    move/from16 v9, v27

    move-object/from16 v8, p8

    goto :goto_24

    :cond_38
    move-object v13, v1

    invoke-virtual {v13}, Lp1/q;->X()V

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v5, p4

    move-object v8, v3

    move-object v3, v9

    move v4, v15

    move/from16 v9, p8

    :goto_24
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v13

    if-eqz v13, :cond_39

    new-instance v0, Ll41/b;

    invoke-direct/range {v0 .. v12}, Ll41/b;-><init>(Ljava/lang/String;ZLorg/joda/time/LocalTime;ZLjava/lang/String;JLandroidx/compose/ui/Modifier;ZLc93/m;II)V

    iput-object v0, v13, Lp1/v1;->d:Lc93/m;

    :cond_39
    return-void
.end method

.method private static final h(ZLorg/joda/time/LocalTime;Lp1/c1;Lp1/c1;ZZLc93/m;Landroid/content/Context;)Landroid/widget/TimePicker;
    .locals 2

    const-string v0, "context"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    sget p0, Lgy0/g;->d:I

    goto :goto_0

    :cond_0
    sget p0, Lgy0/g;->e:I

    :goto_0
    new-instance v0, Landroid/widget/TimePicker;

    new-instance v1, Lq/d;

    invoke-direct {v1, p7, p0}, Lq/d;-><init>(Landroid/content/Context;I)V

    const/4 p7, 0x0

    invoke-direct {v0, v1, p7, p0}, Landroid/widget/TimePicker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lorg/joda/time/LocalTime;->getHourOfDay()I

    move-result p0

    invoke-virtual {v0, p0}, Landroid/widget/TimePicker;->setHour(I)V

    invoke-virtual {p1}, Lorg/joda/time/LocalTime;->getMinuteOfHour()I

    move-result p0

    invoke-virtual {v0, p0}, Landroid/widget/TimePicker;->setMinute(I)V

    :cond_1
    invoke-virtual {v0}, Landroid/widget/TimePicker;->getHour()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p2, p0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/widget/TimePicker;->getMinute()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p3, p0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/widget/TimePicker;->setIs24HourView(Ljava/lang/Boolean;)V

    new-instance p0, Ll41/c;

    invoke-direct {p0, p6, p2, p3, p5}, Ll41/c;-><init>(Lc93/m;Lp1/c1;Lp1/c1;Z)V

    invoke-virtual {v0, p0}, Landroid/widget/TimePicker;->setOnTimeChangedListener(Landroid/widget/TimePicker$OnTimeChangedListener;)V

    return-object v0
.end method

.method private static final i(Lp1/c1;Lp1/c1;ZLc93/m;Landroid/widget/TimePicker;II)V
    .locals 0

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-interface {p0, p4}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-interface {p1, p4}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    if-nez p2, :cond_0

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p3, p0, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private static final j(Landroid/widget/TimePicker;)Ll83/a0;
    .locals 2

    const-string v0, "timePicker"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/sentry/c7;

    const/16 v1, 0x18

    invoke-direct {v0, p0, v1}, Lio/sentry/c7;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Landroid/widget/TimePicker;)V
    .locals 0

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method private static final l(Lc93/m;Lp1/c1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Ljava/lang/String;ZLorg/joda/time/LocalTime;ZLjava/lang/String;JLandroidx/compose/ui/Modifier;ZLc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 14

    or-int/lit8 v0, p10, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v12

    move-object v1, p0

    move v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-wide/from16 v6, p5

    move-object/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v13, p11

    move-object/from16 v11, p12

    invoke-static/range {v1 .. v13}, Ll41/d;->g(Ljava/lang/String;ZLorg/joda/time/LocalTime;ZLjava/lang/String;JLandroidx/compose/ui/Modifier;ZLc93/m;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
