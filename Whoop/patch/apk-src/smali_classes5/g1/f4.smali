.class public final Lg1/f4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lg40/w2;Ljava/util/Set;ZLcom/stripe/android/uicore/elements/IdentifierSpec;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lg1/f4;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/f4;->y:Ljava/lang/Object;

    iput-object p2, p0, Lg1/f4;->z:Ljava/lang/Object;

    iput-boolean p3, p0, Lg1/f4;->x:Z

    iput-object p4, p0, Lg1/f4;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p5, p0, Lg1/f4;->w:I

    iput-boolean p1, p0, Lg1/f4;->x:Z

    iput-object p2, p0, Lg1/f4;->y:Ljava/lang/Object;

    iput-object p3, p0, Lg1/f4;->z:Ljava/lang/Object;

    iput-object p4, p0, Lg1/f4;->E:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 40

    move-object/from16 v0, p0

    iget v1, v0, Lg1/f4;->w:I

    iget-boolean v4, v0, Lg1/f4;->x:Z

    sget-object v5, Lb2/t;->w:Lb2/t;

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    iget-object v7, v0, Lg1/f4;->E:Ljava/lang/Object;

    iget-object v8, v0, Lg1/f4;->y:Ljava/lang/Object;

    const/4 v9, 0x0

    const/4 v10, 0x1

    iget-object v11, v0, Lg1/f4;->z:Ljava/lang/Object;

    const/4 v12, 0x2

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v2, v2, 0x3

    if-ne v2, v12, :cond_1

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v13

    if-nez v13, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lp1/q;->X()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {v1}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v2

    iget-object v2, v2, Ld40/n;->i:Lg1/c1;

    invoke-virtual {v2}, Lg1/c1;->h()J

    move-result-wide v13

    sget-object v2, Li2/w0;->a:Li2/v0;

    invoke-static {v5, v13, v14, v2}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v5, Ld40/p;->a:Ld40/n;

    invoke-static {}, Ld40/r;->j()Ll0/l1;

    move-result-object v5

    invoke-static {v5, v2}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    check-cast v8, Lkotlin/jvm/functions/Function1;

    move-object v13, v11

    check-cast v13, Ljava/lang/String;

    move-object v15, v7

    check-cast v15, Lw20/z;

    sget-object v5, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    invoke-static {v5, v7, v1, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    invoke-static {v1}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v7

    move-object v11, v1

    check-cast v11, Lp1/q;

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v1, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v3, v11, Lp1/q;->S:Z

    if-eqz v3, :cond_2

    invoke-virtual {v11, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_1
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v1, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v1, v3, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v11, Lp1/q;->S:Z

    if-nez v5, :cond_3

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v5, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    :cond_3
    invoke-static {v7, v11, v7, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v1, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, 0x99c749d

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-nez v2, :cond_5

    if-ne v3, v5, :cond_6

    :cond_5
    new-instance v3, Lw01/f;

    invoke-direct {v3, v8, v10}, Lw01/f;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v3, Lc93/a;

    invoke-virtual {v11, v9}, Lp1/q;->q(Z)V

    invoke-static {v4, v3, v1, v9}, Ls2/d;->f(ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v1, v9}, Ls2/d;->e(Landroidx/compose/runtime/Composer;I)V

    const v2, 0x99c9ae1

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_7

    if-ne v3, v5, :cond_8

    :cond_7
    new-instance v3, Lv41/b0;

    const/16 v2, 0x10

    invoke-direct {v3, v8, v2}, Lv41/b0;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object/from16 v16, v3

    check-cast v16, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v11, v9}, Lp1/q;->q(Z)V

    const/16 v18, 0x30

    const/4 v14, 0x1

    move-object/from16 v17, v1

    invoke-static/range {v13 .. v18}, Ls2/d;->b(Ljava/lang/String;ZLw20/z;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    iget-boolean v2, v15, Lw20/z;->c:Z

    const v3, 0x99cafe0

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_9

    if-ne v4, v5, :cond_a

    :cond_9
    new-instance v4, Lw01/f;

    const/4 v3, 0x2

    invoke-direct {v4, v8, v3}, Lw01/f;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v4, Lc93/a;

    invoke-virtual {v11, v9}, Lp1/q;->q(Z)V

    invoke-static {v2, v4, v1, v9}, Ls2/d;->a(ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v11, v10}, Lp1/q;->q(Z)V

    :goto_2
    return-object v6

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p2

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    and-int/lit8 v3, v3, 0x3

    const/4 v12, 0x2

    if-ne v3, v12, :cond_c

    move-object v3, v1

    check-cast v3, Lp1/q;

    invoke-virtual {v3}, Lp1/q;->F()Z

    move-result v12

    if-nez v12, :cond_b

    goto :goto_3

    :cond_b
    invoke-virtual {v3}, Lp1/q;->X()V

    move-object/from16 v39, v6

    goto/16 :goto_8

    :cond_c
    :goto_3
    sget-object v3, Lb2/e;->K:Lb2/l;

    const/16 v12, 0x8

    int-to-float v12, v12

    invoke-static {v12}, Ll0/m;->i(F)Ll0/k;

    move-result-object v12

    const/16 v13, 0x10

    int-to-float v13, v13

    invoke-static {v13, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    check-cast v8, Lc93/a;

    check-cast v11, Ljava/lang/String;

    check-cast v7, Ljava/lang/String;

    const/16 v14, 0x36

    invoke-static {v12, v3, v1, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    invoke-static {v1}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v12

    move-object v14, v1

    check-cast v14, Lp1/q;

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v1, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v9, v14, Lp1/q;->S:Z

    if-eqz v9, :cond_d

    invoke-virtual {v14, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_d
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_4
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v1, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v1, v3, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    iget-boolean v10, v14, Lp1/q;->S:Z

    if-nez v10, :cond_e

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    move-object/from16 v39, v6

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v10, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_f

    goto :goto_5

    :cond_e
    move-object/from16 v39, v6

    :goto_5
    invoke-static {v12, v14, v12, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v1, v6, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v10, 0x3f800000    # 1.0f

    float-to-double v12, v10

    const-wide/16 v17, 0x0

    cmpl-double v12, v12, v17

    if-lez v12, :cond_10

    goto :goto_6

    :cond_10
    const-string v12, "invalid weight; must be greater than zero"

    invoke-static {v12}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_6
    new-instance v12, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v13, 0x1

    invoke-direct {v12, v10, v13}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v10, Ll0/m;->c:Ll0/g;

    sget-object v13, Lb2/e;->M:Lb2/k;

    move-object/from16 p1, v7

    const/4 v7, 0x0

    invoke-static {v10, v13, v1, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    invoke-static {v1}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v10

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v1, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v14}, Lp1/q;->i0()V

    move-object/from16 p2, v11

    iget-boolean v11, v14, Lp1/q;->S:Z

    if-eqz v11, :cond_11

    invoke-virtual {v14, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_11
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v1, v9, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v3, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v14, Lp1/q;->S:Z

    if-nez v2, :cond_12

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    :cond_12
    invoke-static {v10, v14, v10, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v1, v6, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1}, Lg1/l3;->a(Landroidx/compose/runtime/Composer;)Lg1/c1;

    move-result-object v2

    invoke-virtual {v2}, Lg1/c1;->e()J

    move-result-wide v2

    const/16 v35, 0xc30

    const v36, 0x1d7fa

    const/4 v13, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x2

    const/16 v28, 0x0

    const/16 v29, 0x1

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v34, 0x0

    move-object/from16 v12, p2

    move-object/from16 v33, v1

    move-object v1, v14

    move-wide v14, v2

    invoke-static/range {v12 .. v36}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    invoke-static/range {v33 .. v33}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v2

    iget-wide v14, v2, Ld40/n;->e:J

    move-object/from16 v12, p1

    invoke-static/range {v12 .. v36}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v33

    const/4 v13, 0x1

    invoke-virtual {v1, v13}, Lp1/q;->q(Z)V

    const v3, 0x7f140fe4

    invoke-static {v2, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v12

    invoke-static {v2}, Lg1/l3;->a(Landroidx/compose/runtime/Composer;)Lg1/c1;

    move-result-object v3

    invoke-virtual {v3}, Lg1/c1;->f()J

    move-result-wide v14

    invoke-static {v2}, Lg1/l3;->c(Landroidx/compose/runtime/Composer;)Lg1/h9;

    move-result-object v3

    iget-object v3, v3, Lg1/h9;->g:Ll3/v0;

    sget-object v19, Lp3/r;->G:Lp3/r;

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-static {v5, v4, v7, v8, v6}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/16 v35, 0x0

    const v36, 0xffd8

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/high16 v34, 0x30000

    move-object/from16 v32, v3

    invoke-static/range {v12 .. v36}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    const/4 v13, 0x1

    invoke-virtual {v1, v13}, Lp1/q;->q(Z)V

    :goto_8
    return-object v39

    :pswitch_1
    move-object/from16 v39, v6

    move-object v1, v7

    move-object/from16 v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    move-object v10, v8

    check-cast v10, Lg40/w2;

    and-int/lit8 v2, v2, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_15

    move-object v2, v7

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_14

    goto :goto_9

    :cond_14
    invoke-virtual {v2}, Lp1/q;->X()V

    goto :goto_b

    :cond_15
    :goto_9
    iget-object v2, v10, Lg40/w2;->b:Ljava/util/List;

    move-object v3, v11

    check-cast v3, Ljava/util/Set;

    invoke-static {v2, v3}, Lbi/g;->x(Ljava/util/List;Ljava/util/Set;)Ljava/util/ArrayList;

    move-result-object v2

    move-object v5, v11

    check-cast v5, Ljava/util/Set;

    move-object v6, v1

    check-cast v6, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v11, 0x0

    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_18

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v12, v11, 0x1

    if-ltz v11, :cond_17

    move-object v3, v2

    check-cast v3, Lg40/y2;

    const/4 v8, 0x0

    const/4 v9, 0x4

    iget-boolean v2, v0, Lg1/f4;->x:Z

    const/4 v4, 0x0

    invoke-static/range {v2 .. v9}, Ls2/e;->g(ZLg40/y2;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v7

    check-cast v2, Lp1/q;

    const v3, 0x524b0028

    invoke-virtual {v2, v3}, Lp1/q;->e0(I)V

    iget-object v3, v10, Lg40/w2;->b:Ljava/util/List;

    invoke-static {v3}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v3

    if-eq v11, v3, :cond_16

    invoke-static {v2}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v3

    iget-wide v3, v3, Ld40/n;->c:J

    invoke-static {v2}, Ld40/r;->l(Landroidx/compose/runtime/Composer;)Ld40/o;

    move-result-object v8

    iget v8, v8, Ld40/o;->c:F

    const/16 v23, 0x0

    const/16 v24, 0x9

    const/16 v17, 0x0

    const/16 v21, 0x0

    move-object/from16 v22, v2

    move-wide/from16 v18, v3

    move/from16 v20, v8

    invoke-static/range {v17 .. v24}, Lge3/g;->b(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    :cond_16
    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lp1/q;->q(Z)V

    move v11, v12

    goto :goto_a

    :cond_17
    invoke-static {}, Lwb3/f;->d0()V

    const/16 v37, 0x0

    throw v37

    :cond_18
    :goto_b
    return-object v39

    :pswitch_2
    move-object/from16 v39, v6

    move-object v1, v7

    move v3, v9

    move-object/from16 v2, p1

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v4, p2

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    and-int/lit8 v5, v4, 0x3

    const/4 v12, 0x2

    if-eq v5, v12, :cond_19

    const/4 v9, 0x1

    :goto_c
    const/16 v38, 0x1

    goto :goto_d

    :cond_19
    move v9, v3

    goto :goto_c

    :goto_d
    and-int/lit8 v3, v4, 0x1

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v3, v9}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_1a

    sget-object v12, Lg1/i8;->a:Lg1/i8;

    move-object v15, v8

    check-cast v15, Lj0/i;

    move-object/from16 v16, v11

    check-cast v16, Lg1/y1;

    move-object/from16 v17, v1

    check-cast v17, Li2/a1;

    const/high16 v21, 0xc00000

    const/16 v22, 0x60

    iget-boolean v13, v0, Lg1/f4;->x:Z

    const/4 v14, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v20, v2

    invoke-virtual/range {v12 .. v22}, Lg1/i8;->a(ZZLj0/i;Lg1/e8;Li2/a1;FFLandroidx/compose/runtime/Composer;II)V

    goto :goto_e

    :cond_1a
    move-object/from16 v20, v2

    invoke-virtual/range {v20 .. v20}, Lp1/q;->X()V

    :goto_e
    return-object v39

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
