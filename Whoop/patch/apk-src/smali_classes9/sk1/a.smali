.class public abstract Lsk1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsk1/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a5\u0010\t\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u001a!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\rH\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lsk1/b;",
        "state",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lb91/a;",
        "textStyle",
        "Li2/x;",
        "textColor",
        "Ll83/a0;",
        "b",
        "(Lsk1/b;Landroidx/compose/ui/Modifier;Lb91/a;JLandroidx/compose/runtime/Composer;II)V",
        "Lhy0/b2;",
        "value",
        "",
        "inverseConcern",
        "Lhy0/a2;",
        "d",
        "(Lhy0/b2;ZLandroidx/compose/runtime/Composer;II)Lhy0/a2;",
        "heart-health-common_release"
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
.method public static synthetic a(Lsk1/b;Landroidx/compose/ui/Modifier;Lb91/a;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lsk1/a;->c(Lsk1/b;Landroidx/compose/ui/Modifier;Lb91/a;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lsk1/b;Landroidx/compose/ui/Modifier;Lb91/a;JLandroidx/compose/runtime/Composer;II)V
    .locals 33

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    move/from16 v6, p6

    const-string v2, "state"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v2, 0x7e8123ed

    invoke-virtual {v12, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v6, 0x6

    const/4 v3, 0x2

    const/4 v4, 0x4

    if-nez v2, :cond_2

    and-int/lit8 v2, v6, 0x8

    if-nez v2, :cond_0

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_1

    move v2, v4

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    or-int/2addr v2, v6

    goto :goto_2

    :cond_2
    move v2, v6

    :goto_2
    and-int/lit8 v5, p7, 0x2

    if-eqz v5, :cond_4

    or-int/lit8 v2, v2, 0x30

    :cond_3
    move-object/from16 v7, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v7, v6, 0x30

    if-nez v7, :cond_3

    move-object/from16 v7, p1

    invoke-virtual {v12, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x20

    goto :goto_3

    :cond_5
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v2, v8

    :goto_4
    and-int/lit16 v8, v6, 0x180

    if-nez v8, :cond_8

    and-int/lit8 v8, p7, 0x4

    if-nez v8, :cond_7

    and-int/lit16 v8, v6, 0x200

    if-nez v8, :cond_6

    invoke-virtual {v12, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    goto :goto_5

    :cond_6
    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    :goto_5
    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_6

    :cond_7
    const/16 v8, 0x80

    :goto_6
    or-int/2addr v2, v8

    :cond_8
    and-int/lit16 v8, v6, 0xc00

    if-nez v8, :cond_b

    and-int/lit8 v8, p7, 0x8

    if-nez v8, :cond_9

    move-wide/from16 v8, p3

    invoke-virtual {v12, v8, v9}, Lp1/q;->f(J)Z

    move-result v10

    if-eqz v10, :cond_a

    const/16 v10, 0x800

    goto :goto_7

    :cond_9
    move-wide/from16 v8, p3

    :cond_a
    const/16 v10, 0x400

    :goto_7
    or-int/2addr v2, v10

    goto :goto_8

    :cond_b
    move-wide/from16 v8, p3

    :goto_8
    and-int/lit16 v10, v2, 0x493

    const/16 v11, 0x492

    const/4 v13, 0x0

    if-eq v10, v11, :cond_c

    const/4 v10, 0x1

    goto :goto_9

    :cond_c
    move v10, v13

    :goto_9
    and-int/lit8 v11, v2, 0x1

    invoke-virtual {v12, v11, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_18

    invoke-virtual {v12}, Lp1/q;->Z()V

    and-int/lit8 v10, v6, 0x1

    if-eqz v10, :cond_10

    invoke-virtual {v12}, Lp1/q;->C()Z

    move-result v10

    if-eqz v10, :cond_d

    goto :goto_b

    :cond_d
    invoke-virtual {v12}, Lp1/q;->X()V

    and-int/lit8 v5, p7, 0x4

    if-eqz v5, :cond_e

    and-int/lit16 v2, v2, -0x381

    :cond_e
    and-int/lit8 v5, p7, 0x8

    if-eqz v5, :cond_f

    and-int/lit16 v2, v2, -0x1c01

    :cond_f
    move-object/from16 v27, v0

    move-object v5, v7

    :goto_a
    move-wide/from16 v16, v8

    goto :goto_d

    :cond_10
    :goto_b
    if-eqz v5, :cond_11

    sget-object v5, Lb2/t;->w:Lb2/t;

    goto :goto_c

    :cond_11
    move-object v5, v7

    :goto_c
    and-int/lit8 v7, p7, 0x4

    if-eqz v7, :cond_12

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v0, v12, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->a()Lb91/a;

    move-result-object v0

    and-int/lit16 v2, v2, -0x381

    :cond_12
    and-int/lit8 v7, p7, 0x8

    if-eqz v7, :cond_13

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v7, v12, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v7

    and-int/lit16 v2, v2, -0x1c01

    move-object/from16 v27, v0

    move-wide/from16 v16, v7

    goto :goto_d

    :cond_13
    move-object/from16 v27, v0

    goto :goto_a

    :goto_d
    invoke-virtual {v12}, Lp1/q;->r()V

    int-to-float v0, v3

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v7, v0

    invoke-static {v7}, Ll0/m;->i(F)Ll0/k;

    move-result-object v7

    sget-object v8, Lb2/e;->K:Lb2/l;

    shr-int/lit8 v9, v2, 0x3

    const/16 v10, 0x36

    invoke-static {v7, v8, v12, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v10, v12, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v12, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-eqz v15, :cond_14

    invoke-virtual {v12, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_14
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_e
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v12, v14, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v12, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-nez v10, :cond_15

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v10, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_16

    :cond_15
    invoke-static {v8, v12, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v12, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lsk1/b;->b()Lhy0/b2;

    move-result-object v7

    invoke-static {v7, v13, v12, v13, v3}, Lsk1/a;->d(Lhy0/b2;ZLandroidx/compose/runtime/Composer;II)Lhy0/a2;

    move-result-object v7

    const/4 v3, 0x6

    int-to-float v3, v3

    int-to-float v4, v4

    mul-float v10, v0, v4

    invoke-virtual {v1}, Lsk1/b;->b()Lhy0/b2;

    move-result-object v4

    sget-object v8, Lhy0/b2;->NEUTRAL:Lhy0/b2;

    if-ne v4, v8, :cond_17

    :goto_f
    move v11, v0

    goto :goto_10

    :cond_17
    const/high16 v0, 0x7fc00000    # Float.NaN

    goto :goto_f

    :goto_10
    sget v0, Lhy0/a2;->j:I

    or-int/lit16 v13, v0, 0xd80

    const/4 v14, 0x2

    const/4 v8, 0x0

    move v0, v9

    move v9, v3

    invoke-static/range {v7 .. v14}, Lhy0/v1;->b(Lhy0/a2;Li2/a1;FFFLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v1}, Lsk1/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v3, v12, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    and-int/lit16 v0, v0, 0x380

    sget v3, Lb91/a;->d:I

    shl-int/lit8 v3, v3, 0x12

    shl-int/lit8 v2, v2, 0xc

    const/high16 v4, 0x380000

    and-int/2addr v2, v4

    or-int v31, v3, v2

    const v32, 0x2fffa

    move-object/from16 v29, v12

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-wide/from16 v9, v16

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    move/from16 v30, v0

    const/4 v0, 0x1

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    move-object v2, v5

    move-wide v4, v9

    move-object/from16 v3, v27

    goto :goto_11

    :cond_18
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v3, v0

    move-object v2, v7

    move-wide v4, v8

    :goto_11
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_19

    new-instance v0, Lcw2/c;

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lcw2/c;-><init>(Lsk1/b;Landroidx/compose/ui/Modifier;Lb91/a;JII)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method private static final c(Lsk1/b;Landroidx/compose/ui/Modifier;Lb91/a;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lsk1/a;->b(Lsk1/b;Landroidx/compose/ui/Modifier;Lb91/a;JLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final d(Lhy0/b2;ZLandroidx/compose/runtime/Composer;II)Lhy0/a2;
    .locals 19

    const-string v0, "value"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p4, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move/from16 v0, p1

    :goto_0
    sget-object v3, Lsk1/a$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v3, v1

    const/4 v3, 0x6

    packed-switch v1, :pswitch_data_0

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v1, 0x6e4ce137

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lhy0/a2;->i:Lhy0/a2$a;

    invoke-virtual {v1, v0, v3}, Lhy0/a2$a;->k(Landroidx/compose/runtime/Composer;I)Lhy0/a2;

    move-result-object v1

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    goto/16 :goto_2

    :pswitch_0
    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v1, 0x6e4cdbbe

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lhy0/a2;->i:Lhy0/a2$a;

    invoke-virtual {v1, v0, v3}, Lhy0/a2$a;->j(Landroidx/compose/runtime/Composer;I)Lhy0/a2;

    move-result-object v1

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    goto/16 :goto_2

    :pswitch_1
    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v1, 0x6e4cd31d

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lhy0/a2;->i:Lhy0/a2$a;

    invoke-virtual {v1, v0, v3}, Lhy0/a2$a;->s(Landroidx/compose/runtime/Composer;I)Lhy0/a2;

    move-result-object v1

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    goto/16 :goto_2

    :pswitch_2
    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v1, 0x6e4ccb38

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lhy0/a2;->i:Lhy0/a2$a;

    invoke-virtual {v1, v0, v3}, Lhy0/a2$a;->t(Landroidx/compose/runtime/Composer;I)Lhy0/a2;

    move-result-object v1

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    goto/16 :goto_2

    :pswitch_3
    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v1, 0x6e4cc437

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lhy0/a2;->i:Lhy0/a2$a;

    invoke-virtual {v1, v0, v3}, Lhy0/a2$a;->k(Landroidx/compose/runtime/Composer;I)Lhy0/a2;

    move-result-object v1

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    goto/16 :goto_2

    :pswitch_4
    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v1, 0x6e4cbd38

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lhy0/a2;->i:Lhy0/a2$a;

    invoke-virtual {v1, v0, v3}, Lhy0/a2$a;->g(Landroidx/compose/runtime/Composer;I)Lhy0/a2;

    move-result-object v1

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    goto/16 :goto_2

    :pswitch_5
    move-object/from16 v1, p2

    check-cast v1, Lp1/q;

    const v4, 0x6e4c8ccc

    invoke-virtual {v1, v4}, Lp1/q;->e0(I)V

    if-eqz v0, :cond_1

    const v0, 0x5b45519d

    invoke-virtual {v1, v0}, Lp1/q;->e0(I)V

    new-instance v3, Lhy0/a2;

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v0, v1, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->f()J

    move-result-wide v5

    invoke-virtual {v0, v1, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->g()J

    move-result-wide v7

    invoke-virtual {v0}, Lx81/d;->d()Lgz0/o0;

    move-result-object v9

    invoke-virtual {v9}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v9

    invoke-virtual {v9}, Lgz0/i0;->a()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v0, v1, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->g()J

    move-result-wide v10

    invoke-virtual {v0, v1, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->w()J

    move-result-wide v12

    const/16 v17, 0xe0

    const/16 v18, 0x0

    move-wide v4, v5

    move-wide v6, v7

    move-object v8, v9

    move-wide v9, v10

    move-wide v11, v12

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v3 .. v18}, Lhy0/a2;-><init>(JJLjava/lang/Integer;JJJZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    move-object v0, v3

    goto :goto_1

    :cond_1
    const v0, 0x5b49986c

    invoke-virtual {v1, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lhy0/a2;->i:Lhy0/a2$a;

    invoke-virtual {v0, v1, v3}, Lhy0/a2$a;->c(Landroidx/compose/runtime/Composer;I)Lhy0/a2;

    move-result-object v0

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    :goto_1
    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    move-object v1, v0

    goto :goto_2

    :pswitch_6
    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v1, 0x6e4c84ba

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lhy0/a2;->i:Lhy0/a2$a;

    invoke-virtual {v1, v0, v3}, Lhy0/a2$a;->a(Landroidx/compose/runtime/Composer;I)Lhy0/a2;

    move-result-object v1

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    :goto_2
    return-object v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
