.class public abstract Lzt2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lzt2/f;",
        "dividerWithImageViewState",
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/ui/Modifier;Lzt2/f;Landroidx/compose/runtime/Composer;I)V",
        "weekly-plan_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lzt2/f;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lzt2/g;->c(Landroidx/compose/ui/Modifier;Lzt2/f;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Lzt2/f;Landroidx/compose/runtime/Composer;I)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "modifier"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "dividerWithImageViewState"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p2

    check-cast v9, Lp1/q;

    const v3, -0x39f21e3c

    invoke-virtual {v9, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v9, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v4, v2, 0x30

    if-nez v4, :cond_4

    and-int/lit8 v4, v2, 0x40

    if-nez v4, :cond_2

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_2

    :cond_2
    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_2
    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_3

    :cond_3
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v3, v4

    :cond_4
    and-int/lit8 v4, v3, 0x13

    const/16 v5, 0x12

    const/4 v12, 0x0

    const/4 v14, 0x1

    if-eq v4, v5, :cond_5

    move v4, v14

    goto :goto_4

    :cond_5
    move v4, v12

    :goto_4
    and-int/2addr v3, v14

    invoke-virtual {v9, v3, v4}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-virtual {v1}, Lzt2/f;->b()Z

    move-result v3

    if-eqz v3, :cond_6

    const v3, -0x3689b94b

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-static {v3, v9, v4, v12}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v3

    :goto_5
    move-wide v5, v3

    goto :goto_6

    :cond_6
    const v3, -0x368902af

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v9, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->V0()J

    move-result-wide v3

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    goto :goto_5

    :goto_6
    sget-object v3, Lb2/e;->K:Lb2/l;

    sget-object v4, Ll0/m;->a:Ll0/e;

    const/16 v7, 0x30

    invoke-static {v4, v3, v9, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v7, v9, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v9, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-eqz v11, :cond_7

    invoke-virtual {v9, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_7
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_7
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v9, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v9, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v7, v9, Lp1/q;->S:Z

    if-nez v7, :cond_8

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_9

    :cond_8
    invoke-static {v4, v9, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v9, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v7, v14

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float v16, v7, v3

    const/16 v19, 0x0

    const/16 v20, 0xb

    sget-object v15, Lb2/t;->w:Lb2/t;

    move/from16 v18, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v13, Ll0/t1;->a:Ll0/t1;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-virtual {v13, v3, v14, v4}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v10, 0x180

    const/16 v11, 0x8

    const/4 v8, 0x0

    move/from16 v24, v4

    move-object v4, v3

    move/from16 v3, v24

    invoke-static/range {v4 .. v11}, Lge3/g;->b(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    move-wide/from16 v21, v5

    move/from16 v23, v7

    const/high16 v4, 0x3fc00000    # 1.5f

    invoke-virtual {v13, v15, v12, v4}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/high16 v5, 0x40000000    # 2.0f

    invoke-static {v4, v12, v5}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v1}, Lzt2/f;->a()Lkd1/o;

    move-result-object v4

    sget v8, Lkd1/o;->a:I

    move-object v7, v9

    const/4 v9, 0x3

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v4

    move-object v9, v7

    const/16 v12, 0x6030

    move-object v5, v13

    const/16 v13, 0x68

    move-object v6, v5

    const/4 v5, 0x0

    const/4 v7, 0x0

    sget-object v8, Ly2/j;->b:Ly2/b1;

    move-object v11, v9

    const/4 v9, 0x0

    move-object/from16 v16, v6

    move-object v6, v10

    const/4 v10, 0x0

    move-object/from16 v0, v16

    invoke-static/range {v4 .. v13}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v11

    const/16 v20, 0xe

    move/from16 v16, v18

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v0, v4, v14, v3}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v10, 0x180

    const/16 v11, 0x8

    const/4 v8, 0x0

    move-wide/from16 v5, v21

    move/from16 v7, v23

    invoke-static/range {v4 .. v11}, Lge3/g;->b(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v14}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_a
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_b

    new-instance v3, Lyf1/e;

    const/16 v4, 0x1a

    move-object/from16 v5, p0

    invoke-direct {v3, v5, v1, v2, v4}, Lyf1/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v3, v0, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final c(Landroidx/compose/ui/Modifier;Lzt2/f;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lzt2/g;->b(Landroidx/compose/ui/Modifier;Lzt2/f;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
