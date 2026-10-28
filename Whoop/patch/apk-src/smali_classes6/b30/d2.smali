.class public final Lb30/d2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:I

.field public final synthetic G:Lq20/c;

.field public final synthetic H:Lm40/w;

.field public final synthetic I:Lkotlin/jvm/functions/Function1;

.field public final synthetic w:Ljava/util/List;

.field public final synthetic x:Ljava/util/List;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Ln0/u;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ln0/u;ZILq20/c;Lm40/w;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/d2;->w:Ljava/util/List;

    iput-object p2, p0, Lb30/d2;->x:Ljava/util/List;

    iput-object p3, p0, Lb30/d2;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lb30/d2;->z:Ln0/u;

    iput-boolean p5, p0, Lb30/d2;->E:Z

    iput p6, p0, Lb30/d2;->F:I

    iput-object p7, p0, Lb30/d2;->G:Lq20/c;

    iput-object p8, p0, Lb30/d2;->H:Lm40/w;

    iput-object p9, p0, Lb30/d2;->I:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Ll0/v;

    move-object/from16 v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    const-string v4, "$this$BoxWithConstraints"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v4, v3, 0x6

    if-nez v4, :cond_1

    move-object v4, v2

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v3, v4

    :cond_1
    and-int/lit8 v3, v3, 0x13

    const/16 v4, 0x12

    if-ne v3, v4, :cond_3

    move-object v3, v2

    check-cast v3, Lp1/q;

    invoke-virtual {v3}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v3}, Lp1/q;->X()V

    goto/16 :goto_4

    :cond_3
    :goto_1
    check-cast v1, Landroidx/compose/foundation/layout/c;

    invoke-virtual {v1}, Landroidx/compose/foundation/layout/c;->d()F

    move-result v1

    iget-object v3, v0, Lb30/d2;->w:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    move-object v13, v2

    check-cast v13, Lp1/q;

    const v2, -0x2a4c9991

    invoke-virtual {v13, v2}, Lp1/q;->e0(I)V

    const v2, 0x48cc9fe3

    invoke-virtual {v13, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v1}, Lp1/q;->d(F)Z

    move-result v2

    invoke-virtual {v13, v4}, Lp1/q;->e(I)Z

    move-result v5

    or-int/2addr v2, v5

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-nez v2, :cond_4

    if-ne v5, v6, :cond_8

    :cond_4
    sget-object v2, Ld40/p;->f:Ld40/g;

    iget v5, v2, Ld40/g;->c:F

    iget v2, v2, Ld40/g;->a:F

    add-float/2addr v5, v2

    sub-float/2addr v1, v5

    const/16 v2, 0x5a

    int-to-float v2, v2

    int-to-float v5, v4

    mul-float v7, v2, v5

    sget v8, Lb30/n2;->a:F

    add-int/lit8 v4, v4, -0x1

    int-to-float v4, v4

    mul-float/2addr v4, v8

    add-float/2addr v7, v4

    invoke-static {v7, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v7

    if-gtz v7, :cond_5

    sub-float/2addr v1, v4

    div-float/2addr v1, v5

    goto/16 :goto_3

    :cond_5
    const v4, 0x3e99999a    # 0.3f

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    const v5, 0x3ecccccd    # 0.4f

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    filled-new-array {v4, v5, v7}, [Ljava/lang/Float;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    add-float v7, v2, v8

    mul-float v9, v2, v5

    sub-float v10, v1, v2

    sub-float v9, v10, v9

    div-float/2addr v9, v7

    float-to-int v7, v9

    add-int/lit8 v9, v7, 0x1

    int-to-float v9, v9

    add-float/2addr v9, v5

    int-to-float v5, v7

    mul-float/2addr v8, v5

    sub-float v5, v1, v8

    div-float/2addr v5, v9

    new-instance v7, Ly3/f;

    invoke-direct {v7, v5}, Ly3/f;-><init>(F)V

    :cond_6
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    sget v8, Lb30/n2;->a:F

    add-float v9, v2, v8

    mul-float v11, v2, v5

    sub-float v11, v10, v11

    div-float/2addr v11, v9

    float-to-int v9, v11

    add-int/lit8 v11, v9, 0x1

    int-to-float v11, v11

    add-float/2addr v11, v5

    int-to-float v5, v9

    mul-float/2addr v8, v5

    sub-float v5, v1, v8

    div-float/2addr v5, v11

    new-instance v8, Ly3/f;

    invoke-direct {v8, v5}, Ly3/f;-><init>(F)V

    invoke-virtual {v7, v8}, Ly3/f;->compareTo(Ljava/lang/Object;)I

    move-result v5

    if-lez v5, :cond_6

    move-object v7, v8

    goto :goto_2

    :cond_7
    iget v1, v7, Ly3/f;->w:F

    :goto_3
    new-instance v5, Ly3/f;

    invoke-direct {v5, v1}, Ly3/f;-><init>(F)V

    invoke-virtual {v13, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v5, Ly3/f;

    iget v10, v5, Ly3/f;->w:F

    const/4 v1, 0x0

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    sget-object v2, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:Lp1/b0;

    invoke-virtual {v13, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/res/Configuration;

    iget v2, v2, Landroid/content/res/Configuration;->screenWidthDp:I

    int-to-float v11, v2

    sget v2, Lb30/n2;->a:F

    const v4, 0x3254a88d

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    iget-object v4, v0, Lb30/d2;->y:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v13, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    iget-object v5, v0, Lb30/d2;->x:Ljava/util/List;

    invoke-virtual {v13, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v4, v7

    invoke-virtual {v13, v10}, Lp1/q;->d(F)Z

    move-result v7

    or-int/2addr v4, v7

    invoke-virtual {v13, v11}, Lp1/q;->d(F)Z

    move-result v7

    or-int/2addr v4, v7

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_9

    if-ne v7, v6, :cond_a

    :cond_9
    new-instance v7, Lb30/z1;

    const/4 v12, 0x0

    iget-object v8, v0, Lb30/d2;->y:Lkotlin/jvm/functions/Function1;

    iget-object v9, v0, Lb30/d2;->x:Ljava/util/List;

    invoke-direct/range {v7 .. v12}, Lb30/z1;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;FFLq83/d;)V

    invoke-virtual {v13, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v7, Lc93/m;

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    invoke-static {v13, v7, v5}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, Ld40/p;->a:Ld40/n;

    invoke-static {}, Ld40/r;->j()Ll0/l1;

    move-result-object v7

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v8

    sget-object v2, Lb2/t;->w:Lb2/t;

    const-string v4, "PaymentMethodsUITestTag"

    invoke-static {v2, v4}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const v2, 0x3254fa13

    invoke-virtual {v13, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    iget v3, v0, Lb30/d2;->F:I

    invoke-virtual {v13, v3}, Lp1/q;->e(I)Z

    move-result v3

    or-int/2addr v2, v3

    iget-object v3, v0, Lb30/d2;->G:Lq20/c;

    invoke-virtual {v13, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v13, v10}, Lp1/q;->d(F)Z

    move-result v3

    or-int/2addr v2, v3

    iget-object v3, v0, Lb30/d2;->H:Lm40/w;

    invoke-virtual {v13, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    iget-boolean v3, v0, Lb30/d2;->E:Z

    invoke-virtual {v13, v3}, Lp1/q;->h(Z)Z

    move-result v3

    or-int/2addr v2, v3

    iget-object v3, v0, Lb30/d2;->I:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v13, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_b

    if-ne v3, v6, :cond_c

    :cond_b
    new-instance v14, Lb30/y1;

    iget-object v15, v0, Lb30/d2;->w:Ljava/util/List;

    iget v2, v0, Lb30/d2;->F:I

    iget-object v3, v0, Lb30/d2;->G:Lq20/c;

    iget-object v4, v0, Lb30/d2;->H:Lm40/w;

    iget-boolean v6, v0, Lb30/d2;->E:Z

    iget-object v9, v0, Lb30/d2;->I:Lkotlin/jvm/functions/Function1;

    move/from16 v16, v2

    move-object/from16 v17, v3

    move-object/from16 v19, v4

    move/from16 v20, v6

    move-object/from16 v21, v9

    move/from16 v18, v10

    invoke-direct/range {v14 .. v21}, Lb30/y1;-><init>(Ljava/util/List;ILq20/c;FLm40/w;ZLkotlin/jvm/functions/Function1;)V

    invoke-virtual {v13, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v3, v14

    :cond_c
    move-object v12, v3

    check-cast v12, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    const/16 v14, 0x6006

    const/16 v15, 0x68

    iget-object v6, v0, Lb30/d2;->z:Ln0/u;

    const/4 v9, 0x0

    const/4 v10, 0x0

    iget-boolean v11, v0, Lb30/d2;->E:Z

    invoke-static/range {v5 .. v15}, Lkotlin/jvm/internal/j;->e(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/i;Lb2/g;Lh0/o1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    :goto_4
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_d
    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-direct {v1}, Ljava/util/NoSuchElementException;-><init>()V

    throw v1
.end method
