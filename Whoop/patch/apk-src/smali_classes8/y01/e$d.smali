.class public final Ly01/e$d;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly01/e;->b(Landroidx/compose/ui/Modifier;Ly01/f;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "a",
        "(Landroidx/compose/runtime/Composer;I)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation


# instance fields
.field final synthetic w:Lp1/c1;

.field final synthetic x:Le4/k;

.field final synthetic y:Lc93/a;

.field final synthetic z:Ly01/f;


# direct methods
.method public constructor <init>(Lp1/c1;Le4/k;Lc93/a;Ly01/f;)V
    .locals 0

    iput-object p1, p0, Ly01/e$d;->w:Lp1/c1;

    iput-object p2, p0, Ly01/e$d;->x:Le4/k;

    iput-object p3, p0, Ly01/e$d;->y:Lc93/a;

    iput-object p4, p0, Ly01/e$d;->z:Ly01/f;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/runtime/Composer;I)V
    .locals 38

    move-object/from16 v0, p0

    and-int/lit8 v1, p2, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    move-object/from16 v1, p1

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    return-void

    :cond_1
    :goto_0
    iget-object v1, v0, Ly01/e$d;->w:Lp1/c1;

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    invoke-interface {v1, v2}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    iget-object v1, v0, Ly01/e$d;->x:Le4/k;

    iget v2, v1, Le4/k;->b:I

    invoke-virtual {v1}, Le4/k;->e()V

    iget-object v1, v0, Ly01/e$d;->x:Le4/k;

    move-object/from16 v11, p1

    check-cast v11, Lp1/q;

    const v3, -0x4f7aa7f

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    const v3, -0x7c07fd3e

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    iget-object v14, v0, Ly01/e$d;->z:Ly01/f;

    invoke-virtual {v1}, Le4/k;->d()Lad3/z;

    move-result-object v1

    iget-object v1, v1, Lad3/z;->x:Ljava/lang/Object;

    check-cast v1, Le4/k;

    invoke-virtual {v1}, Le4/k;->c()Le4/f;

    move-result-object v15

    invoke-virtual {v1}, Le4/k;->c()Le4/f;

    move-result-object v3

    invoke-virtual {v1}, Le4/k;->c()Le4/f;

    move-result-object v4

    invoke-virtual {v1}, Le4/k;->c()Le4/f;

    move-result-object v1

    invoke-virtual {v11, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-nez v5, :cond_2

    if-ne v6, v7, :cond_3

    :cond_2
    new-instance v6, Ly01/e$e;

    invoke-direct {v6, v14}, Ly01/e$e;-><init>(Ly01/f;)V

    invoke-virtual {v11, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v6, Lkotlin/jvm/functions/Function1;

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v15, v6}, Le4/k;->b(Landroidx/compose/ui/Modifier;Le4/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v8, Lb2/e;->w:Lb2/m;

    const/4 v9, 0x0

    invoke-static {v8, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v11, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v9, v11, Lp1/q;->S:Z

    if-eqz v9, :cond_4

    invoke-virtual {v11, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_4
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_1
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v11, v9, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v11, v8, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v9, v11, Lp1/q;->S:Z

    if-nez v9, :cond_5

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_6

    :cond_5
    invoke-static {v10, v11, v10, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v11, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v6, v4

    invoke-virtual {v14}, Ly01/f;->a()I

    move-result v4

    move-object v8, v5

    invoke-virtual {v14}, Ly01/f;->f()I

    move-result v5

    sget-object v16, Li2/t;->b:Li2/s;

    invoke-virtual {v14}, Ly01/f;->e()Ly81/f;

    move-result-object v9

    const/4 v10, 0x0

    invoke-virtual {v9, v11, v10}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v12

    new-instance v9, Li2/x;

    invoke-direct {v9, v12, v13}, Li2/x;-><init>(J)V

    invoke-virtual {v14}, Ly01/f;->e()Ly81/f;

    move-result-object v12

    invoke-virtual {v12, v11, v10}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v12

    new-instance v10, Li2/x;

    invoke-direct {v10, v12, v13}, Li2/x;-><init>(J)V

    filled-new-array {v9, v10}, [Li2/x;

    move-result-object v9

    invoke-static {v9}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    const-wide/16 v20, 0x0

    const/16 v22, 0xe

    const-wide/16 v18, 0x0

    invoke-static/range {v16 .. v22}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object v9

    invoke-virtual {v14}, Ly01/f;->c()Ly81/f;

    move-result-object v10

    const/4 v12, 0x0

    invoke-virtual {v10, v11, v12}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v16

    move v10, v12

    const/4 v12, 0x0

    const/16 v13, 0x61

    move-object/from16 v18, v3

    const/4 v3, 0x0

    move-object/from16 v19, v6

    move-object v6, v9

    const/4 v9, 0x0

    move/from16 v20, v10

    const/4 v10, 0x0

    move-object/from16 p1, v1

    move/from16 p2, v2

    move-object v1, v7

    move-object/from16 v30, v8

    move-wide/from16 v7, v16

    move-object/from16 v2, v18

    move-object/from16 v0, v19

    invoke-static/range {v3 .. v13}, Llz0/f;->b(Landroidx/compose/ui/Modifier;IILi2/t;JZFLandroidx/compose/runtime/Composer;II)V

    const/4 v3, 0x1

    invoke-virtual {v11, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v14}, Ly01/f;->g()Ly01/g;

    move-result-object v4

    const/16 v5, 0x8

    const/4 v6, 0x6

    if-eqz v4, :cond_9

    const v4, 0x4fe7cd0d

    invoke-virtual {v11, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v11, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v4, v7

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v4, v7

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_7

    if-ne v7, v1, :cond_8

    :cond_7
    new-instance v7, Ly01/e$f;

    invoke-direct {v7, v15, v14, v0}, Ly01/e$f;-><init>(Le4/f;Ly01/f;Le4/f;)V

    invoke-virtual {v11, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object/from16 v4, v30

    invoke-static {v4, v2, v7}, Le4/k;->b(Landroidx/compose/ui/Modifier;Le4/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    int-to-float v7, v3

    int-to-float v8, v5

    mul-float v20, v7, v8

    const/16 v21, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v14}, Ly01/f;->g()Ly01/g;

    move-result-object v8

    invoke-virtual {v8}, Ly01/g;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const/4 v9, 0x0

    invoke-static {v8, v11, v9}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v14}, Ly01/f;->g()Ly01/g;

    move-result-object v10

    invoke-virtual {v10}, Ly01/g;->a()Ly81/e;

    move-result-object v10

    invoke-interface {v10, v11, v9}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v12

    sget-object v10, Lx81/d;->a:Lx81/d;

    invoke-virtual {v10, v11, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->C()Lb91/a;

    move-result-object v23

    const/16 v27, 0x0

    const v28, 0x2fff8

    move v10, v3

    move-object v4, v7

    move-object v3, v8

    const-wide/16 v7, 0x0

    move/from16 v29, v9

    const/4 v9, 0x0

    move/from16 v16, v10

    const/4 v10, 0x0

    move-object/from16 v25, v11

    const/4 v11, 0x0

    move/from16 v17, v5

    move/from16 v18, v6

    move-wide v5, v12

    const-wide/16 v12, 0x0

    move-object/from16 v19, v14

    const/4 v14, 0x0

    move-object/from16 v20, v15

    const/4 v15, 0x0

    move/from16 v22, v16

    move/from16 v21, v17

    const-wide/16 v16, 0x0

    move/from16 v24, v18

    const/16 v18, 0x0

    move-object/from16 v26, v19

    const/16 v19, 0x0

    move-object/from16 v31, v20

    const/16 v20, 0x0

    move/from16 v32, v21

    const/16 v21, 0x0

    move/from16 v33, v22

    const/16 v22, 0x0

    move/from16 v34, v24

    const/16 v24, 0x0

    move-object/from16 v35, v26

    const/16 v26, 0x0

    move-object/from16 v36, v30

    move-object/from16 v30, v1

    move/from16 v1, v29

    move-object/from16 v29, v0

    move-object/from16 v0, v31

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v25

    invoke-virtual {v11, v1}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_9
    move-object/from16 v29, v0

    move-object/from16 v35, v14

    move-object v0, v15

    move-object/from16 v36, v30

    move-object/from16 v30, v1

    const/4 v1, 0x0

    const v3, 0x4ff33388    # 8.1604813E9f

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v1}, Lp1/q;->q(Z)V

    :goto_2
    invoke-virtual/range {v35 .. v35}, Ly01/f;->h()Ly01/g;

    move-result-object v3

    if-eqz v3, :cond_c

    const v3, 0x4ff47202    # 8.2022246E9f

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v11, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_a

    move-object/from16 v3, v30

    if-ne v4, v3, :cond_b

    goto :goto_3

    :cond_a
    move-object/from16 v3, v30

    :goto_3
    new-instance v4, Ly01/e$g;

    invoke-direct {v4, v0, v2}, Ly01/e$g;-><init>(Le4/f;Le4/f;)V

    invoke-virtual {v11, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object/from16 v6, v29

    move-object/from16 v2, v36

    invoke-static {v2, v6, v4}, Le4/k;->b(Landroidx/compose/ui/Modifier;Le4/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    const/4 v4, 0x1

    int-to-float v5, v4

    const/16 v6, 0x8

    int-to-float v7, v6

    mul-float v16, v5, v7

    const/16 v17, 0x7

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual/range {v35 .. v35}, Ly01/f;->h()Ly01/g;

    move-result-object v7

    invoke-virtual {v7}, Ly01/g;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {v7, v11, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {v35 .. v35}, Ly01/f;->h()Ly01/g;

    move-result-object v8

    invoke-virtual {v8}, Ly01/g;->a()Ly81/e;

    move-result-object v8

    invoke-interface {v8, v11, v1}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v8

    sget-object v10, Lx81/d;->a:Lx81/d;

    const/4 v12, 0x6

    invoke-virtual {v10, v11, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->C()Lb91/a;

    move-result-object v23

    new-instance v15, Lw3/k;

    invoke-direct {v15, v12}, Lw3/k;-><init>(I)V

    const/16 v27, 0x0

    const v28, 0x2fdf8

    move-object/from16 v30, v3

    move/from16 v16, v4

    move-object v4, v5

    move/from16 v32, v6

    move-object v3, v7

    move-wide v5, v8

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v25, v11

    const/4 v11, 0x0

    move/from16 v18, v12

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    move/from16 v33, v16

    const-wide/16 v16, 0x0

    move/from16 v34, v18

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    move-object/from16 v37, v30

    move-object/from16 v30, v2

    move-object/from16 v2, v37

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v25

    invoke-virtual {v11, v1}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_c
    move-object/from16 v2, v30

    move-object/from16 v30, v36

    const v3, 0x4ffe9968

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v1}, Lp1/q;->q(Z)V

    :goto_4
    invoke-virtual/range {v35 .. v35}, Ly01/f;->b()Ly01/g;

    move-result-object v3

    if-eqz v3, :cond_f

    const v3, 0x4fffd4fa

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_d

    if-ne v4, v2, :cond_e

    :cond_d
    new-instance v4, Ly01/e$h;

    invoke-direct {v4, v0}, Ly01/e$h;-><init>(Le4/f;)V

    invoke-virtual {v11, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object/from16 v0, p1

    move-object/from16 v2, v30

    invoke-static {v2, v0, v4}, Le4/k;->b(Landroidx/compose/ui/Modifier;Le4/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v4, 0x1

    int-to-float v0, v4

    const/16 v6, 0x8

    int-to-float v2, v6

    mul-float v7, v0, v2

    const/4 v9, 0x0

    const/16 v10, 0xd

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual/range {v35 .. v35}, Ly01/f;->b()Ly01/g;

    move-result-object v0

    invoke-virtual {v0}, Ly01/g;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0, v11, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {v35 .. v35}, Ly01/f;->b()Ly01/g;

    move-result-object v0

    invoke-virtual {v0}, Ly01/g;->a()Ly81/e;

    move-result-object v0

    invoke-interface {v0, v11, v1}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v5

    sget-object v0, Lx81/d;->a:Lx81/d;

    const/4 v12, 0x6

    invoke-virtual {v0, v11, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->s()Lb91/a;

    move-result-object v23

    const/16 v27, 0x0

    const v28, 0x2fff8

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v25, v11

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v25

    invoke-virtual {v11, v1}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_f
    const v0, 0x500a1a68

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v1}, Lp1/q;->q(Z)V

    :goto_5
    invoke-virtual {v11, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v1}, Lp1/q;->q(Z)V

    move-object/from16 v0, p0

    iget-object v1, v0, Ly01/e$d;->x:Le4/k;

    iget v1, v1, Le4/k;->b:I

    move/from16 v2, p2

    if-eq v1, v2, :cond_10

    iget-object v1, v0, Ly01/e$d;->y:Lc93/a;

    invoke-static {v1, v11}, Lp1/x;->k(Lc93/a;Landroidx/compose/runtime/Composer;)V

    :cond_10
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Ly01/e$d;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
