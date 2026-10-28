.class public abstract Lbr2/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbr2/l$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a+\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lcom/whoop/design/util/TextResource;",
        "footerText",
        "footerSubText",
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V",
        "Lbr2/c;",
        "barViewState",
        "Lbr2/a;",
        "d",
        "(Lbr2/c;)Lbr2/a;",
        "user-journey_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lbr2/l;->c(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V
    .locals 36

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "modifier"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v5, 0x7ae8e8d1

    invoke-virtual {v0, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    and-int/lit8 v6, v4, 0x30

    if-nez v6, :cond_4

    and-int/lit8 v6, v4, 0x40

    if-nez v6, :cond_2

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_2

    :cond_2
    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    :goto_2
    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_3

    :cond_3
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v5, v6

    :cond_4
    and-int/lit16 v6, v4, 0x180

    if-nez v6, :cond_7

    and-int/lit16 v6, v4, 0x200

    if-nez v6, :cond_5

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_4

    :cond_5
    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    :goto_4
    if-eqz v6, :cond_6

    const/16 v6, 0x100

    goto :goto_5

    :cond_6
    const/16 v6, 0x80

    :goto_5
    or-int/2addr v5, v6

    :cond_7
    and-int/lit16 v6, v5, 0x93

    const/16 v7, 0x92

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eq v6, v7, :cond_8

    move v6, v8

    goto :goto_6

    :cond_8
    move v6, v9

    :goto_6
    and-int/2addr v5, v8

    invoke-virtual {v0, v5, v6}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_10

    sget-object v5, Lb2/e;->N:Lb2/k;

    sget-object v6, Ll0/m;->c:Ll0/g;

    const/16 v7, 0x30

    invoke-static {v6, v5, v0, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v6, v0, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v0, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v12, v0, Lp1/q;->S:Z

    if-eqz v12, :cond_9

    invoke-virtual {v0, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_9
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_7
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v0, v11, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v0, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v0, Lp1/q;->S:Z

    if-nez v7, :cond_a

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v7, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_b

    :cond_a
    invoke-static {v6, v0, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v0, v5, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-nez v2, :cond_c

    const v5, -0x6ff80712

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    const/4 v5, 0x0

    goto :goto_8

    :cond_c
    const v5, -0x6ff80711

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v0, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    :goto_8
    if-nez v5, :cond_d

    const-string v5, ""

    :cond_d
    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v0, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->O()Lb91/a;

    move-result-object v25

    invoke-virtual {v6, v0, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v10

    sget v12, Lb91/a;->d:I

    shl-int/lit8 v29, v12, 0x12

    const v30, 0x2fffa

    move-object v12, v6

    const/4 v6, 0x0

    move v13, v8

    move v14, v9

    move-wide/from16 v34, v10

    move v11, v7

    move-wide/from16 v7, v34

    const-wide/16 v9, 0x0

    move v15, v11

    const/4 v11, 0x0

    move-object/from16 v16, v12

    const/4 v12, 0x0

    move/from16 v17, v13

    const/4 v13, 0x0

    move/from16 v19, v14

    move/from16 v18, v15

    const-wide/16 v14, 0x0

    move-object/from16 v20, v16

    const/16 v16, 0x0

    move/from16 v21, v17

    const/16 v17, 0x0

    move/from16 v22, v18

    move/from16 v23, v19

    const-wide/16 v18, 0x0

    move-object/from16 v24, v20

    const/16 v20, 0x0

    move/from16 v26, v21

    const/16 v21, 0x0

    move/from16 v27, v22

    const/16 v22, 0x0

    move/from16 v28, v23

    const/16 v23, 0x0

    move-object/from16 v31, v24

    const/16 v24, 0x0

    move/from16 v32, v26

    const/16 v26, 0x0

    move/from16 v33, v28

    const/16 v28, 0x0

    move/from16 v1, v27

    move/from16 v2, v33

    move-object/from16 v27, v0

    move-object/from16 v0, v31

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    if-nez v3, :cond_e

    const v0, -0x6ff575c6

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    :goto_9
    const/4 v13, 0x1

    goto/16 :goto_b

    :cond_e
    const v6, -0x6ff575c5

    invoke-virtual {v5, v6}, Lp1/q;->e0(I)V

    invoke-static {v3}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v6

    if-eqz v6, :cond_f

    const v6, 0x766cf658

    invoke-virtual {v5, v6}, Lp1/q;->e0(I)V

    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    double-to-float v6, v6

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float v10, v6, v7

    const/4 v12, 0x0

    const/16 v13, 0xd

    sget-object v8, Lb2/t;->w:Lb2/t;

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v3, v5, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v5, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    invoke-virtual {v0, v5, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->b1()J

    move-result-wide v0

    const/16 v28, 0x30

    const v30, 0x2fff8

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    move-object/from16 v27, v5

    move-object v5, v7

    move-wide v7, v0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_f
    const v0, 0x7670dad3

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    :goto_a
    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    goto :goto_9

    :goto_b
    invoke-virtual {v5, v13}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_10
    move-object v5, v0

    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_c
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_11

    new-instance v0, Lbr2/k;

    const/4 v5, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v5}, Lbr2/k;-><init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final c(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lbr2/l;->b(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final d(Lbr2/c;)Lbr2/a;
    .locals 5

    const-string v0, "barViewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lbr2/c;->l()Z

    move-result v0

    invoke-virtual {p0}, Lbr2/c;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const/high16 v1, 0x3f000000    # 0.5f

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lbr2/c;->m()Z

    move-result p0

    if-eqz p0, :cond_1

    const/16 p0, 0x64

    :goto_1
    int-to-float p0, p0

    goto :goto_2

    :cond_1
    const/16 p0, 0xd

    int-to-float p0, p0

    const/4 v0, 0x4

    int-to-float v0, v0

    mul-float/2addr p0, v0

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Lbr2/c;->m()Z

    move-result v0

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lbr2/c;->a()Lbr2/b;

    move-result-object p0

    sget-object v0, Lbr2/l$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    if-eq p0, v4, :cond_3

    if-eq p0, v3, :cond_3

    if-eq p0, v2, :cond_3

    const/16 p0, 0x5a

    goto :goto_1

    :cond_3
    const/16 p0, 0x78

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Lbr2/c;->a()Lbr2/b;

    move-result-object p0

    sget-object v0, Lbr2/l$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    if-eq p0, v4, :cond_5

    if-eq p0, v3, :cond_5

    if-eq p0, v2, :cond_5

    const/16 p0, 0x2d

    goto :goto_1

    :cond_5
    const/16 p0, 0x3c

    goto :goto_1

    :goto_2
    new-instance v0, Lbr2/a;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p0, v2}, Lbr2/a;-><init>(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
