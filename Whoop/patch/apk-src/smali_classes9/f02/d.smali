.class public abstract Lf02/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a5\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Le02/a;",
        "data",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "d",
        "(Le02/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "Lm91/p;",
        "a",
        "Lm91/p;",
        "sizeGuideItemFactory",
        "native-store_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Lm91/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, Lm91/m;->h(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lm91/p;

    move-result-object v0

    sput-object v0, Lf02/d;->a:Lm91/p;

    return-void
.end method

.method public static synthetic a(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Lf02/d;->f(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Le02/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lf02/d;->g(Le02/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lf02/d;->e(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Le02/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le02/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p0

    move-object/from16 v6, p1

    move/from16 v1, p4

    const-string v0, "data"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p3

    check-cast v9, Lp1/q;

    const v0, 0x437574cd

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v9, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    and-int/lit8 v5, v1, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v9, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_3
    and-int/lit8 v5, p5, 0x4

    if-eqz v5, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move-object/from16 v8, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v8, v1, 0x180

    if-nez v8, :cond_4

    move-object/from16 v8, p2

    invoke-virtual {v9, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    const/16 v10, 0x100

    goto :goto_3

    :cond_6
    const/16 v10, 0x80

    :goto_3
    or-int/2addr v0, v10

    :goto_4
    and-int/lit16 v10, v0, 0x93

    const/16 v11, 0x92

    const/4 v12, 0x0

    if-eq v10, v11, :cond_7

    const/4 v10, 0x1

    goto :goto_5

    :cond_7
    move v10, v12

    :goto_5
    and-int/lit8 v11, v0, 0x1

    invoke-virtual {v9, v11, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_16

    sget-object v10, Lb2/t;->w:Lb2/t;

    if-eqz v5, :cond_8

    move-object v5, v10

    goto :goto_6

    :cond_8
    move-object v5, v8

    :goto_6
    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v14, Ll0/m;->c:Ll0/g;

    sget-object v15, Lb2/e;->M:Lb2/k;

    invoke-static {v14, v15, v9, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v14

    iget-wide v12, v9, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v9, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v2, v9, Lp1/q;->S:Z

    if-eqz v2, :cond_9

    invoke-virtual {v9, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_9
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_7
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v9, v2, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->f:La3/i;

    invoke-static {v9, v14, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v7, v9, Lp1/q;->S:Z

    if-nez v7, :cond_a

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    :cond_a
    invoke-static {v12, v9, v12, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v9, v3, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v17

    const/4 v7, 0x2

    int-to-float v8, v7

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float v19, v8, v7

    const/16 v21, 0x0

    const/16 v22, 0x9

    const/16 v18, 0x0

    move/from16 v20, v19

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v11, Lb2/e;->w:Lb2/m;

    const/4 v12, 0x0

    invoke-static {v11, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    move/from16 v33, v0

    iget-wide v0, v9, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v1

    invoke-static {v9, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v12, v9, Lp1/q;->S:Z

    if-eqz v12, :cond_c

    invoke-virtual {v9, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v9, v2, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v14, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v9, Lp1/q;->S:Z

    if-nez v1, :cond_d

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v1, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    :cond_d
    invoke-static {v0, v9, v0, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    invoke-static {v9, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v0, v33, 0x70

    const/16 v1, 0x20

    if-ne v0, v1, :cond_f

    const/4 v12, 0x1

    goto :goto_9

    :cond_f
    const/4 v12, 0x0

    :goto_9
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v12, :cond_10

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_11

    :cond_10
    new-instance v0, Leo2/j;

    const/16 v1, 0x18

    invoke-direct {v0, v6, v1}, Leo2/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v0, Lc93/a;

    sget-object v1, Lb2/e;->F:Lb2/m;

    sget-object v8, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v8, v10, v1}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v12, 0x0

    invoke-static {v0, v1, v9, v12, v12}, Lf02/b;->m(Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    invoke-static {v12, v9, v0}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v1

    const/16 v8, 0xe

    invoke-static {v10, v1, v8}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v18

    const/16 v21, 0x0

    const/16 v23, 0x7

    move/from16 v22, v19

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move/from16 v8, v22

    int-to-float v11, v0

    mul-float/2addr v11, v7

    invoke-static {v11}, Ll0/m;->i(F)Ll0/k;

    move-result-object v11

    sget-object v0, Lb2/e;->N:Lb2/k;

    const/16 v12, 0x36

    invoke-static {v11, v0, v9, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v11, v9, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v9, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v4, v9, Lp1/q;->S:Z

    if-eqz v4, :cond_12

    invoke-virtual {v9, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_12
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v9, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v14, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v9, Lp1/q;->S:Z

    if-nez v0, :cond_13

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    :cond_13
    invoke-static {v11, v9, v11, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    invoke-static {v9, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Le02/a;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v9, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v2, v9, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->q()Lb91/a;

    move-result-object v27

    invoke-virtual {v2, v9, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v11

    const/4 v4, 0x0

    move v14, v8

    const/4 v13, 0x2

    invoke-static {v10, v14, v4, v13}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    new-instance v13, Lw3/k;

    const/4 v15, 0x3

    invoke-direct {v13, v15}, Lw3/k;-><init>(I)V

    sget v16, Lb91/a;->d:I

    shl-int/lit8 v31, v16, 0x12

    const v32, 0x2fdf8

    move-object/from16 v29, v9

    move-object/from16 v16, v10

    move-wide v9, v11

    const-wide/16 v11, 0x0

    move-object/from16 v19, v13

    const/4 v13, 0x0

    move/from16 v22, v14

    const/4 v14, 0x0

    move/from16 v17, v15

    const/4 v15, 0x0

    move-object/from16 v18, v16

    move/from16 v20, v17

    const-wide/16 v16, 0x0

    move-object/from16 v21, v18

    const/16 v18, 0x0

    move/from16 v24, v20

    move-object/from16 v23, v21

    const-wide/16 v20, 0x0

    move/from16 v25, v22

    const/16 v22, 0x0

    move-object/from16 v26, v23

    const/16 v23, 0x0

    move/from16 v28, v24

    const/16 v24, 0x0

    move/from16 v30, v25

    const/16 v25, 0x0

    move-object/from16 v34, v26

    const/16 v26, 0x0

    move/from16 v35, v28

    const/16 v28, 0x0

    move/from16 v36, v30

    const/16 v30, 0x30

    move-object/from16 p2, v34

    move-object/from16 v34, v5

    move-object/from16 v5, p2

    move/from16 p2, v7

    move-object v7, v0

    move/from16 v0, v36

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v29

    invoke-virtual/range {p0 .. p0}, Le02/a;->c()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {v7, v9, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v9, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->s()Lb91/a;

    move-result-object v27

    invoke-virtual {v2, v9, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->c1()J

    move-result-wide v10

    const/4 v13, 0x2

    invoke-static {v5, v0, v4, v13}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    new-instance v0, Lw3/k;

    const/4 v12, 0x3

    invoke-direct {v0, v12}, Lw3/k;-><init>(I)V

    move-wide v9, v10

    move/from16 v28, v12

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    move/from16 v35, v28

    const/16 v28, 0x0

    move-object/from16 v19, v0

    move/from16 v0, v35

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v29

    invoke-virtual/range {p0 .. p0}, Le02/a;->a()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {v7, v9, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v9, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->b()Lb91/a;

    move-result-object v27

    invoke-virtual {v2, v9, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v1

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float v3, v3, p2

    const/4 v13, 0x2

    invoke-static {v5, v3, v4, v13}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    new-instance v3, Lw3/k;

    invoke-direct {v3, v0}, Lw3/k;-><init>(I)V

    const/4 v13, 0x0

    move-object/from16 v19, v3

    move-wide v9, v1

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v29

    const v1, 0x55863e72

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Le02/a;->b()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_15

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lm91/u;

    sget-object v6, Lf02/d;->a:Lm91/p;

    new-instance v7, Leg2/a;

    const/16 v2, 0xe

    invoke-direct {v7, v2}, Leg2/a;-><init>(I)V

    sget v2, Lm91/p;->b:I

    shl-int/2addr v2, v0

    shl-int/lit8 v3, v33, 0x6

    and-int/lit16 v3, v3, 0x1c00

    or-int v10, v2, v3

    const/4 v11, 0x0

    move-object/from16 v8, p1

    invoke-static/range {v5 .. v11}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v6, p1

    goto :goto_b

    :cond_15
    const/4 v12, 0x0

    const/4 v15, 0x1

    invoke-static {v9, v12, v15, v15}, Lm4/a;->y(Lp1/q;ZZZ)V

    move-object/from16 v5, v34

    goto :goto_c

    :cond_16
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v5, v8

    :goto_c
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_17

    new-instance v0, Lf02/c;

    const/4 v3, 0x0

    move-object/from16 v4, p0

    move-object/from16 v6, p1

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lf02/c;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Le02/b;->a:Le02/b;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 2

    const-string p2, "state"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p2, 0x47687d8f

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    instance-of p0, p0, Lq31/f;

    sget-object p2, Lb2/t;->w:Lb2/t;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x2

    int-to-float v0, p0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v0, v1

    const/4 v1, 0x0

    invoke-static {p2, v0, v1, p0}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object p2

    :goto_0
    const/4 p0, 0x0

    invoke-virtual {p1, p0}, Lp1/q;->q(Z)V

    return-object p2
.end method

.method private static final g(Le02/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lf02/d;->d(Le02/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
