.class public abstract Lzq0/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\"\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lzq0/d0;",
        "viewState",
        "Ll83/a0;",
        "f",
        "(Landroidx/compose/ui/Modifier;Lzq0/d0;Landroidx/compose/runtime/Composer;II)V",
        "Ly3/f;",
        "a",
        "F",
        "SecondarySlotMinHeight",
        "community-everyday-stats_release"
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
.field private static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x4

    int-to-float v0, v0

    const/high16 v1, 0x40600000    # 3.5f

    mul-float/2addr v0, v1

    sput v0, Lzq0/c0;->a:F

    return-void
.end method

.method public static synthetic a(Landroidx/compose/ui/Modifier;Lzq0/d0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lzq0/c0;->k(Landroidx/compose/ui/Modifier;Lzq0/d0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzq0/c0;->j(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/design/util/TextResource;Lzq0/d0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lzq0/c0;->h(Lcom/whoop/design/util/TextResource;Lzq0/d0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lzq0/d0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzq0/c0;->g(Lzq0/d0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Lzq0/c0;->i(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Landroidx/compose/ui/Modifier;Lzq0/d0;Landroidx/compose/runtime/Composer;II)V
    .locals 47

    move-object/from16 v3, p1

    const-string v0, "viewState"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p2

    check-cast v8, Lp1/q;

    const v0, -0x26a5ac20

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    const/4 v1, 0x4

    const/4 v2, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v4, p3, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, p3, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v8, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v5, v1

    goto :goto_0

    :cond_1
    move v5, v2

    :goto_0
    or-int v5, p3, v5

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move/from16 v5, p3

    :goto_1
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v8, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_4
    and-int/lit8 v6, v5, 0x13

    const/16 v7, 0x12

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v6, v7, :cond_5

    move v6, v10

    goto :goto_3

    :cond_5
    move v6, v9

    :goto_3
    and-int/2addr v5, v10

    invoke-virtual {v8, v5, v6}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_18

    sget-object v5, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_6

    move-object v0, v5

    goto :goto_4

    :cond_6
    move-object v0, v4

    :goto_4
    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    int-to-float v1, v1

    invoke-static {v6, v1, v1}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v11, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-virtual {v11, v8, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->a1()J

    move-result-wide v13

    sget-object v15, Li2/w0;->a:Li2/v0;

    invoke-static {v6, v13, v14, v15}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    int-to-float v13, v2

    const/16 v14, 0x8

    int-to-float v14, v14

    mul-float/2addr v13, v14

    const/high16 v15, 0x3fc00000    # 1.5f

    mul-float/2addr v14, v15

    invoke-static {v6, v13, v14, v13, v13}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v14, Ll0/m;->c:Ll0/g;

    sget-object v15, Lb2/e;->M:Lb2/k;

    invoke-static {v14, v15, v8, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v14

    move-object/from16 p2, v5

    iget-wide v4, v8, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v8, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    move/from16 v16, v7

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-eqz v7, :cond_7

    invoke-virtual {v8, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_5
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v8, v7, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->f:La3/i;

    invoke-static {v8, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v9, v8, Lp1/q;->S:Z

    if-nez v9, :cond_8

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_9

    :cond_8
    invoke-static {v4, v8, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v8, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v3}, Lzq0/d0;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v9, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v6, v8, v9}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v11, v8, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->a()Lb91/a;

    move-result-object v24

    invoke-virtual {v11, v8, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v10

    sget v12, Lb91/a;->d:I

    shl-int/lit8 v12, v12, 0x12

    or-int/lit16 v12, v12, 0x6c30

    const v29, 0x297fa

    move-object/from16 v16, v5

    const/4 v5, 0x0

    move-object/from16 v26, v8

    move/from16 v19, v9

    const-wide/16 v8, 0x0

    move-object/from16 v20, v4

    move-object v4, v6

    move-wide/from16 v45, v10

    move-object v11, v7

    move-wide/from16 v6, v45

    const/4 v10, 0x0

    move-object/from16 v21, v11

    const/4 v11, 0x0

    move/from16 v28, v12

    const/4 v12, 0x0

    move/from16 v22, v13

    move-object/from16 v23, v14

    const-wide/16 v13, 0x0

    move-object/from16 v25, v15

    const/4 v15, 0x0

    move-object/from16 v27, v16

    const/16 v16, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x1

    const-wide/16 v17, 0x0

    move/from16 v32, v19

    const/16 v19, 0x2

    move-object/from16 v33, v20

    const/16 v20, 0x0

    move-object/from16 v34, v21

    const/16 v21, 0x2

    move/from16 v35, v22

    const/16 v22, 0x2

    move-object/from16 v36, v23

    const/16 v23, 0x0

    move-object/from16 v37, v25

    const/16 v25, 0x0

    move-object/from16 v38, v27

    const/16 v27, 0x0

    move/from16 v2, v30

    move-object/from16 v30, v0

    move v0, v2

    move/from16 v31, v1

    move/from16 v2, v32

    move-object/from16 v44, v33

    move-object/from16 v41, v34

    move/from16 v39, v35

    move-object/from16 v42, v36

    move-object/from16 v40, v37

    move-object/from16 v43, v38

    move-object/from16 v1, p2

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v26

    invoke-virtual {v3}, Lzq0/d0;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    if-nez v4, :cond_a

    const v2, 0x7adc6373

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    move-object v2, v5

    goto :goto_6

    :cond_a
    const v6, 0x7adc6374

    invoke-virtual {v8, v6}, Lp1/q;->e0(I)V

    invoke-static {v4, v8, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    :goto_6
    const-string v4, "%"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    const v2, 0x7adce5a1

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    sget-object v2, Ly3/m;->w:Ly3/m;

    goto :goto_7

    :cond_b
    const v2, 0x7adda498

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lb3/v1;->n:Lp1/u2;

    invoke-virtual {v8, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/m;

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    :goto_7
    sget-object v4, Lb3/v1;->n:Lp1/u2;

    invoke-virtual {v4, v2}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v6

    new-instance v7, Lzq0/j;

    const/4 v9, 0x1

    invoke-direct {v7, v3, v9}, Lzq0/j;-><init>(Ljava/lang/Object;I)V

    const v9, 0x22820416

    invoke-static {v9, v8, v7}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    const/16 v9, 0x38

    invoke-static {v6, v7, v8, v9}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v3}, Lzq0/d0;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    if-nez v6, :cond_c

    const v2, 0x7af5ea84

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_c
    const v7, 0x7af5ea85

    invoke-virtual {v8, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v2}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v2

    new-instance v4, Lx30/f1;

    const/16 v7, 0x10

    invoke-direct {v4, v7, v6, v3}, Lx30/f1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v6, -0xa1a165e

    invoke-static {v6, v8, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v4

    invoke-static {v2, v4, v8, v9}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual {v3}, Lzq0/d0;->a()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_d

    move-object v4, v2

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_d

    move-object v5, v2

    :cond_d
    if-eqz v5, :cond_11

    const v2, 0x7b05d22d

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget v2, Lzq0/c0;->a:F

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-static {v4, v2, v6, v7}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Lb2/e;->G:Lb2/m;

    invoke-static {v4, v0}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v6, v8, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v8, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v9, v8, Lp1/q;->S:Z

    if-eqz v9, :cond_e

    move-object/from16 v9, v40

    invoke-virtual {v8, v9}, Lp1/q;->l(Lc93/a;)V

    :goto_9
    move-object/from16 v11, v41

    goto :goto_a

    :cond_e
    move-object/from16 v9, v40

    invoke-virtual {v8}, Lp1/q;->s0()V

    goto :goto_9

    :goto_a
    invoke-static {v8, v11, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v4, v42

    invoke-static {v8, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-nez v7, :cond_f

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_10

    :cond_f
    move-object/from16 v7, v43

    goto :goto_c

    :cond_10
    move-object/from16 v7, v43

    :goto_b
    move-object/from16 v6, v44

    goto :goto_d

    :goto_c
    invoke-static {v6, v8, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_b

    :goto_d
    invoke-static {v8, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v2, v0

    const/16 v10, 0x30

    invoke-static {v5, v2, v8, v10, v0}, Lc41/f1;->p(Ljava/util/List;FLandroidx/compose/runtime/Composer;II)V

    const/4 v2, 0x1

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_11
    move-object/from16 v9, v40

    move-object/from16 v11, v41

    move-object/from16 v4, v42

    move-object/from16 v7, v43

    move-object/from16 v6, v44

    const/4 v2, 0x1

    invoke-virtual {v3}, Lzq0/d0;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    if-nez v5, :cond_12

    invoke-virtual {v3}, Lzq0/d0;->b()Lm91/u;

    move-result-object v5

    if-eqz v5, :cond_12

    const v5, 0x7b0ba85a

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    sget v5, Lzq0/c0;->a:F

    invoke-static {v1, v5, v8, v0}, Lq63/c;->u(Lb2/t;FLp1/q;Z)V

    goto :goto_e

    :cond_12
    const v5, 0x7b0cdc2c

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    :goto_e
    invoke-virtual {v3}, Lzq0/d0;->b()Lm91/u;

    move-result-object v5

    if-nez v5, :cond_13

    const v1, 0x7b0d79d5

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_10

    :cond_13
    const v10, 0x7b0d79d6

    move/from16 v13, v39

    invoke-static {v8, v10, v1, v13, v8}, Lte0/d;->z(Lp1/q;ILb2/t;FLp1/q;)V

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v10, 0x14

    int-to-float v10, v10

    mul-float v10, v10, v31

    invoke-static {v10, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v10, Lb2/e;->w:Lb2/m;

    invoke-static {v10, v0}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v10

    iget-wide v12, v8, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v8, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v14, v8, Lp1/q;->S:Z

    if-eqz v14, :cond_14

    invoke-virtual {v8, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_14
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_f
    invoke-static {v8, v11, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v4, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v8, Lp1/q;->S:Z

    if-nez v4, :cond_15

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_16

    :cond_15
    invoke-static {v12, v8, v12, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    invoke-static {v8, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v6, Lzc1/y0;

    const/16 v1, 0x12

    invoke-direct {v6, v1}, Lzc1/y0;-><init>(I)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v1, v4, :cond_17

    new-instance v1, Lzm1/d;

    const/4 v4, 0x3

    invoke-direct {v1, v4}, Lzm1/d;-><init>(I)V

    invoke-virtual {v8, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    move-object v7, v1

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0xc00

    const/4 v10, 0x2

    move-object v4, v5

    const/4 v5, 0x0

    invoke-static/range {v4 .. v10}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    move-object/from16 v1, v30

    goto :goto_11

    :cond_18
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v1, v4

    :goto_11
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_19

    new-instance v0, Lzi1/c0;

    const/16 v5, 0x9

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lzi1/c0;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method private static final g(Lzq0/d0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 37

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v4, p2, 0x1

    move-object/from16 v10, p1

    check-cast v10, Lp1/q;

    invoke-virtual {v10, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object v0, Lb2/e;->K:Lb2/l;

    const/16 v4, 0x8

    int-to-float v4, v4

    const/high16 v5, 0x3f000000    # 0.5f

    mul-float/2addr v4, v5

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    const/16 v5, 0x36

    invoke-static {v4, v0, v10, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v4, v10, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_1

    invoke-virtual {v10, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_1
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v10, v8, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v10, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v5, v10, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v4, v10, v4, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v10, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lzq0/d0;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v10, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v0, v10, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->g()Lb91/a;

    move-result-object v25

    invoke-virtual {v0, v10, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v8

    const/high16 v11, 0x3f800000    # 1.0f

    float-to-double v12, v11

    const-wide/16 v14, 0x0

    cmpl-double v12, v12, v14

    if-lez v12, :cond_4

    goto :goto_2

    :cond_4
    const-string v12, "invalid weight; must be greater than zero"

    invoke-static {v12}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_2
    new-instance v12, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v12, v11, v2}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v11, Ly2/d;->a:Ly2/m;

    new-instance v13, Landroidx/compose/foundation/layout/WithAlignmentLineElement;

    invoke-direct {v13, v11}, Landroidx/compose/foundation/layout/WithAlignmentLineElement;-><init>(Ly2/a;)V

    invoke-interface {v12, v13}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget v13, Lb91/a;->d:I

    shl-int/lit8 v13, v13, 0x12

    or-int/lit16 v14, v13, 0xc30

    const v30, 0x2d7f8

    move v15, v7

    move-wide v7, v8

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    move-object/from16 v16, v11

    const/4 v11, 0x0

    move-object/from16 v17, v6

    move-object v6, v12

    const/4 v12, 0x0

    move/from16 v18, v13

    const/4 v13, 0x0

    move/from16 v29, v14

    move/from16 v19, v15

    const-wide/16 v14, 0x0

    move-object/from16 v20, v16

    const/16 v16, 0x0

    move-object/from16 v21, v17

    const/16 v17, 0x0

    move/from16 v23, v18

    move/from16 v22, v19

    const-wide/16 v18, 0x0

    move-object/from16 v24, v20

    const/16 v20, 0x2

    move-object/from16 v26, v21

    const/16 v21, 0x0

    move/from16 v28, v22

    const/16 v22, 0x1

    move/from16 v31, v23

    const/16 v23, 0x0

    move-object/from16 v32, v24

    const/16 v24, 0x0

    move-object/from16 v33, v26

    const/16 v26, 0x0

    move/from16 v34, v28

    const/16 v28, 0x0

    move/from16 v35, v31

    move-object/from16 v3, v32

    move-object/from16 v36, v33

    move/from16 v1, v34

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-virtual/range {p0 .. p0}, Lzq0/d0;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    if-nez v5, :cond_5

    const v0, 0x17669400

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_5
    const v6, 0x17669401

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-static {v5, v10, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v10, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    invoke-virtual {v0, v10, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v7

    new-instance v6, Landroidx/compose/foundation/layout/WithAlignmentLineElement;

    invoke-direct {v6, v3}, Landroidx/compose/foundation/layout/WithAlignmentLineElement;-><init>(Ly2/a;)V

    move/from16 v0, v35

    or-int/lit16 v0, v0, 0xc00

    const v30, 0x2dff8

    move-object/from16 v27, v10

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

    const/16 v22, 0x1

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    move/from16 v29, v0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    :goto_3
    invoke-virtual/range {p0 .. p0}, Lzq0/d0;->g()Ly71/g;

    move-result-object v0

    if-nez v0, :cond_6

    const v0, 0x176c988e

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    :goto_4
    const/4 v0, 0x1

    goto :goto_5

    :cond_6
    const v1, 0x176c988f

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Ly71/g;->b()I

    move-result v1

    const/4 v3, 0x6

    invoke-static {v1, v10, v3}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v5

    invoke-virtual {v0}, Ly71/g;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0, v10, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lzq0/d0;->f()Ly81/f;

    move-result-object v0

    invoke-virtual {v0, v10, v2}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v8

    const/4 v0, 0x2

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    move-object/from16 v1, v36

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v11, 0x180

    const/4 v12, 0x0

    invoke-static/range {v5 .. v12}, Ll1/r1;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    goto :goto_4

    :goto_5
    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_7
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_6
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final h(Lcom/whoop/design/util/TextResource;Lzq0/d0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 32

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/lit8 v4, p3, 0x1

    move-object/from16 v5, p2

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_5

    sget v0, Lzq0/c0;->a:F

    const/4 v4, 0x0

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v0, v4, v3}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v3, Lb2/e;->L:Lb2/l;

    const/16 v4, 0x8

    int-to-float v4, v4

    const/16 v6, 0x36

    const/high16 v7, 0x3e800000    # 0.25f

    invoke-static {v4, v7, v3, v5, v6}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v3

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v5, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v8, v5, Lp1/q;->S:Z

    if-eqz v8, :cond_1

    invoke-virtual {v5, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_1
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v5, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v5, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v6, v5, Lp1/q;->S:Z

    if-nez v6, :cond_2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    :cond_2
    invoke-static {v4, v5, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v5, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    move-object/from16 v3, p0

    invoke-static {v3, v5, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v4, v5, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->F()Lb91/a;

    move-result-object v25

    invoke-virtual {v4, v5, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->c1()J

    move-result-wide v7

    sget v9, Lb91/a;->d:I

    shl-int/lit8 v29, v9, 0x12

    const v30, 0x2fffa

    move v9, v6

    const/4 v6, 0x0

    move v11, v9

    const-wide/16 v9, 0x0

    move v12, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v14, v13

    const/4 v13, 0x0

    move/from16 v16, v14

    const-wide/16 v14, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const-wide/16 v18, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v26, v24

    const/16 v24, 0x0

    move/from16 v27, v26

    const/16 v26, 0x0

    const/16 v28, 0x0

    move-object/from16 v31, v5

    move-object v5, v3

    move/from16 v3, v27

    move-object/from16 v27, v31

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    invoke-virtual/range {p1 .. p1}, Lzq0/d0;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    if-nez v6, :cond_4

    const v0, -0x3bf60ef4

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    const v7, -0x3bf60ef3

    invoke-virtual {v5, v7}, Lp1/q;->e0(I)V

    invoke-static {v6, v5, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v5, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->F()Lb91/a;

    move-result-object v25

    invoke-virtual {v4, v5, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->c1()J

    move-result-wide v7

    const/16 v28, 0x0

    const v30, 0x2fffa

    const/4 v6, 0x0

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

    move-object v5, v0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    :goto_2
    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_5
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p2, "it"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p0, 0x2e5ddf57

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lb2/t;->w:Lb2/t;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p2, p0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final j(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Landroidx/compose/ui/Modifier;Lzq0/d0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lzq0/c0;->f(Landroidx/compose/ui/Modifier;Lzq0/d0;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
